package com.genesys.cloud.messenger.transport.network

import com.genesys.cloud.messenger.transport.core.Configuration
import com.genesys.cloud.messenger.transport.util.logs.Log
import native.ios.socketWrench.SocketWrench
import native.ios.socketWrench.SocketWrenchDelegateProtocol
import platform.darwin.NSObject
import platform.Foundation.NSData
import platform.Foundation.NSError
import platform.Foundation.NSTimer
import platform.Foundation.NSURL
import platform.Foundation.NSURLRequest
import platform.posix.uint16_t

internal actual class PlatformSocket actual constructor(
    private val log: Log,
    configuration: Configuration,
    actual val pingInterval: Long
) {
    private val url = configuration.webSocketUrl
    private val socketEndpoint = NSURL.URLWithString(url.toString())!!
    private var socket: SocketWrench? = null
    private var pingTimer: NSTimer? = null
    var isConnected: Boolean = false
        private set(value) {
            field = value
            if (value) {
                schedulePings()
            } else {
                cancelPings()
            }
        }

    actual fun openSocket(listener: PlatformSocketListener) {
        socket = SocketWrench(
            NSURLRequest.requestWithURL(socketEndpoint),
            object : NSObject(), SocketWrenchDelegateProtocol {
                override fun onCancelled() {
                    isConnected = false
                    listener.onClosed(SocketCloseCode.NORMAL_CLOSURE.value, "Cancelled")
                }

                override fun onConnectedWithHeaders(headers: Map<Any?, *>) {
                    isConnected = true
                    listener.onOpen()
                }

                override fun onData(data: NSData) {
                    log.i { "onData()" }
                }

                override fun onDisconnectedWithReason(reason: String, code: uint16_t) {
                    isConnected = false
                    listener.onClosed(code = code.toInt(), reason = "Disconnected")
                }

                override fun onError(error: NSError?) {
                    listener.onFailure(Throwable(error?.description))
                }

                override fun onPing() {
                    log.i { "onPing() "}
                }

                override fun onPong() {
                    log.i { "onPong" }
                }

                override fun onReconnectSuggested(suggested: Boolean) {
                    log.i { "onReconnectSuggested(suggested = $suggested" }
                }

                override fun onText(text: String) {
                    listener.onMessage(text)
                }

                override fun onViabilityChanged(viable: Boolean) {
                    log.i { "onViabilityChanged(viable = $viable)" }
                    if (!viable) {
                        listener.onFailure(Throwable("Viability changed: WebSocket is not viable"))
                    }
                }
            }
        )

        socket?.connect()
    }

    actual fun closeSocket(code: Int, reason: String) {
        log.i { "closeSocket(code = $code, reason = $reason)" }
        cancelPings()
        socket?.disconnectWithCloseCode(SocketCloseCode.NORMAL_CLOSURE.value.toUShort())
    }

    actual fun sendMessage(text: String) {
        log.i { "sendMessage(text = $text)" }
        socket?.writeWithString(text, null)
    }

    private fun schedulePings() {
        if (pingTimer == null && pingInterval > 0) {
            pingTimer = NSTimer.scheduledTimerWithTimeInterval(
                interval = pingInterval / 1000.0,
                repeats = true
            ) {
                it?.let {
                    log.i { "sending ping" }
                    socket?.writeWithPing(NSData(), null)
                }
            }
        }
    }

    private fun cancelPings() {
        pingTimer?.invalidate()
        pingTimer = null
    }
}
