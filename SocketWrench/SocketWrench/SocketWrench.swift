//
//  SocketWrench.swift
//  SocketWrench
//
//  Copyright © 2022 Genesys. All rights reserved.

import Foundation
import Starscream

@objc public protocol SocketWrenchDelegate: AnyObject {
    func onConnected(headers: [String: String])
    func onDisconnected(reason: String, code: UInt16)
    func onText(_ text: String)
    func onData(_ data: Data)
    func onPong()
    func onPing()
    func onError(_ error: Error?)
    func onViabilityChanged(_ viable: Bool)
    func onReconnectSuggested(_ suggested: Bool)
    func onCancelled()
}

@objc public class SocketWrench : NSObject {
    private let socket: WebSocket
    @objc public weak var delegate: SocketWrenchDelegate?

    @objc public init(request: URLRequest, delegate: SocketWrenchDelegate? = nil) {
        self.socket = WebSocket(request: request)
        self.delegate = delegate

        super.init()

        self.socket.onEvent = { [weak self] event in
            guard let self = self else { return }
            switch event {
            case .connected(let headers):
                self.delegate?.onConnected(headers: headers)
            case .disconnected(let reason, let code):
                self.delegate?.onDisconnected(reason: reason, code: code)
            case .text(let string):
                self.delegate?.onText(string)
            case .binary(let data):
                self.delegate?.onData(data)
            case .pong(_):
                self.delegate?.onPong()
            case .ping(_):
                self.delegate?.onPing()
            case .error(let error):
                self.delegate?.onError(error)
            case .viabilityChanged(let changed):
                self.delegate?.onViabilityChanged(changed)
            case .reconnectSuggested(let suggested):
                self.delegate?.onReconnectSuggested(suggested)
            case .cancelled:
                self.delegate?.onCancelled()
            }
        }
    }

    @objc public func connect() {
        socket.connect()
    }

    @objc public func disconnect(closeCode: UInt16 = CloseCode.normal.rawValue) {
        socket.disconnect(closeCode: closeCode)
    }

    @objc public func forceDisconnect() {
        socket.forceDisconnect()
    }

    @objc public func write(string: String, completion: (() -> ())?) {
        socket.write(string: string, completion: completion)
    }

    @objc public func write(data: Data, completion: (() -> ())?) {
        socket.write(data: data, completion: completion)
    }

    @objc public func write(stringData: Data, completion: (() -> ())?) {
        socket.write(stringData: stringData, completion: completion)
    }

    @objc public func write(ping: Data, completion: (() -> ())?) {
        socket.write(ping: ping, completion: completion)
    }

    @objc public func write(pong: Data, completion: (() -> ())?) {
        socket.write(pong: pong, completion: completion)
    }

}
