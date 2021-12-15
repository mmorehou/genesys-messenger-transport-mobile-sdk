//[transport](../../../../index.md)/[com.genesys.cloud.messenger.transport](../../index.md)/[Attachment](../index.md)/[State](index.md)

# State

[common]\
sealed class [State](index.md)

## Types

| Name | Summary |
|---|---|
| [Deleted](-deleted/index.md) | [common]<br>object [Deleted](-deleted/index.md) : [Attachment.State](index.md) |
| [Detached](-detached/index.md) | [common]<br>object [Detached](-detached/index.md) : [Attachment.State](index.md) |
| [Error](-error/index.md) | [common]<br>data class [Error](-error/index.md)(errorCode: [ErrorCode](../../../com.genesys.cloud.messenger.transport.util/-error-code/index.md), errorMessage: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [Attachment.State](index.md) |
| [Presigning](-presigning/index.md) | [common]<br>object [Presigning](-presigning/index.md) : [Attachment.State](index.md) |
| [Sent](-sent/index.md) | [common]<br>data class [Sent](-sent/index.md)(downloadUrl: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [Attachment.State](index.md) |
| [Uploaded](-uploaded/index.md) | [common]<br>data class [Uploaded](-uploaded/index.md)(downloadUrl: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [Attachment.State](index.md) |
| [Uploading](-uploading/index.md) | [common]<br>object [Uploading](-uploading/index.md) : [Attachment.State](index.md) |

## Inheritors

| Name |
|---|
| [Deleted](-deleted/index.md) |
| [Detached](-detached/index.md) |
| [Presigning](-presigning/index.md) |
| [Uploading](-uploading/index.md) |
| [Uploaded](-uploaded/index.md) |
| [Sent](-sent/index.md) |
| [Error](-error/index.md) |
