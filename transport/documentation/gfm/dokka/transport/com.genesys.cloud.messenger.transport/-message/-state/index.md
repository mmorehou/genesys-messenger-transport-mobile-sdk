//[transport](../../../../index.md)/[com.genesys.cloud.messenger.transport](../../index.md)/[Message](../index.md)/[State](index.md)

# State

[common]\
sealed class [State](index.md)

## Types

| Name | Summary |
|---|---|
| [Error](-error/index.md) | [common]<br>data class [Error](-error/index.md)(code: [ErrorCode](../../../com.genesys.cloud.messenger.transport.util/-error-code/index.md), message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?) : [Message.State](index.md) |
| [Idle](-idle/index.md) | [common]<br>object [Idle](-idle/index.md) : [Message.State](index.md) |
| [Sending](-sending/index.md) | [common]<br>object [Sending](-sending/index.md) : [Message.State](index.md) |
| [Sent](-sent/index.md) | [common]<br>object [Sent](-sent/index.md) : [Message.State](index.md) |

## Inheritors

| Name |
|---|
| [Idle](-idle/index.md) |
| [Sending](-sending/index.md) |
| [Sent](-sent/index.md) |
| [Error](-error/index.md) |
