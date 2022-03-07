//
//  SocketWrench.swift
//  SocketWrench
//
//  Copyright © 2022 Genesys. All rights reserved.

import Foundation

@objc public class SocketWrench : NSObject {

    @objc public var onConnected: (([String: String]) -> Void)?
    @objc public var onDisconnected: ((String, UInt16) -> Void)?
    @objc public var onText: ((String) -> Void)?
    @objc public var onError: ((Error?) -> Void)?

    @objc public func connect() {
        // TODO
    }

    @objc public func disconnect(closeCode: UInt16) {
        // TODO
    }

    @objc public func forceDisconnect() {
        // TODO
    }

    @objc public func write(data: Data, completion: (() -> ())?) {
        // TODO
    }

    @objc public func write(string: String, completion: (() -> ())?) {
        // TODO
    }

    @objc public func write(stringData: Data, completion: (() -> ())?) {
        // TODO
    }

    @objc public func write(ping: Data, completion: (() -> ())?) {
        // TODO
    }

    @objc public func write(pong: Data, completion: (() -> ())?) {
        // TODO
    }

}
