//[transport](../../../../index.md)/[com.genesys.cloud.messenger.transport](../../index.md)/[MessagingClient](../index.md)/[State](index.md)

# State

[common]\
sealed class [State](index.md)

MessagingClient state.

## Types

| Name | Summary |
|---|---|
| [Closed](-closed/index.md) | [common]<br>data class [Closed](-closed/index.md)(code: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), reason: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [MessagingClient.State](index.md) |
| [Closing](-closing/index.md) | [common]<br>data class [Closing](-closing/index.md)(code: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), reason: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [MessagingClient.State](index.md) |
| [Configured](-configured/index.md) | [common]<br>data class [Configured](-configured/index.md)(connected: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), newSession: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)?) : [MessagingClient.State](index.md) |
| [Connected](-connected/index.md) | [common]<br>object [Connected](-connected/index.md) : [MessagingClient.State](index.md) |
| [Connecting](-connecting/index.md) | [common]<br>object [Connecting](-connecting/index.md) : [MessagingClient.State](index.md) |
| [Error](-error/index.md) | [common]<br>data class [Error](-error/index.md)(code: [ErrorCode](../../../com.genesys.cloud.messenger.transport.util/-error-code/index.md), message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?) : [MessagingClient.State](index.md) |
| [Idle](-idle/index.md) | [common]<br>object [Idle](-idle/index.md) : [MessagingClient.State](index.md) |

## Inheritors

| Name |
|---|
| [Idle](-idle/index.md) |
| [Connecting](-connecting/index.md) |
| [Connected](-connected/index.md) |
| [Configured](-configured/index.md) |
| [Closing](-closing/index.md) |
| [Closed](-closed/index.md) |
| [Error](-error/index.md) |
