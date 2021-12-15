//[transport](../../../index.md)/[com.genesys.cloud.messenger.transport.util](../index.md)/[ErrorCode](index.md)

# ErrorCode

[common]\
sealed class [ErrorCode](index.md)

## Types

| Name | Summary |
|---|---|
| [AttachmentHasExpired](-attachment-has-expired/index.md) | [common]<br>object [AttachmentHasExpired](-attachment-has-expired/index.md) : [ErrorCode](index.md) |
| [AttachmentNotFound](-attachment-not-found/index.md) | [common]<br>object [AttachmentNotFound](-attachment-not-found/index.md) : [ErrorCode](index.md) |
| [AttachmentNotSuccessfullyUploaded](-attachment-not-successfully-uploaded/index.md) | [common]<br>object [AttachmentNotSuccessfullyUploaded](-attachment-not-successfully-uploaded/index.md) : [ErrorCode](index.md) |
| [ClientResponseError](-client-response-error/index.md) | [common]<br>data class [ClientResponseError](-client-response-error/index.md)(value: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) : [ErrorCode](index.md) |
| [FeatureUnavailable](-feature-unavailable/index.md) | [common]<br>object [FeatureUnavailable](-feature-unavailable/index.md) : [ErrorCode](index.md) |
| [FileContentInvalid](-file-content-invalid/index.md) | [common]<br>object [FileContentInvalid](-file-content-invalid/index.md) : [ErrorCode](index.md) |
| [FileNameInvalid](-file-name-invalid/index.md) | [common]<br>object [FileNameInvalid](-file-name-invalid/index.md) : [ErrorCode](index.md) |
| [FileNameTooLong](-file-name-too-long/index.md) | [common]<br>object [FileNameTooLong](-file-name-too-long/index.md) : [ErrorCode](index.md) |
| [FileSizeInvalid](-file-size-invalid/index.md) | [common]<br>object [FileSizeInvalid](-file-size-invalid/index.md) : [ErrorCode](index.md) |
| [FileTypeInvalid](-file-type-invalid/index.md) | [common]<br>object [FileTypeInvalid](-file-type-invalid/index.md) : [ErrorCode](index.md) |
| [MessageTooLong](-message-too-long/index.md) | [common]<br>object [MessageTooLong](-message-too-long/index.md) : [ErrorCode](index.md) |
| [MissingParameter](-missing-parameter/index.md) | [common]<br>object [MissingParameter](-missing-parameter/index.md) : [ErrorCode](index.md) |
| [RedirectResponseError](-redirect-response-error/index.md) | [common]<br>data class [RedirectResponseError](-redirect-response-error/index.md)(value: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) : [ErrorCode](index.md) |
| [ServerResponseError](-server-response-error/index.md) | [common]<br>data class [ServerResponseError](-server-response-error/index.md)(value: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) : [ErrorCode](index.md) |
| [SessionHasExpired](-session-has-expired/index.md) | [common]<br>object [SessionHasExpired](-session-has-expired/index.md) : [ErrorCode](index.md) |
| [SessionNotFound](-session-not-found/index.md) | [common]<br>object [SessionNotFound](-session-not-found/index.md) : [ErrorCode](index.md) |
| [UnexpectedError](-unexpected-error/index.md) | [common]<br>object [UnexpectedError](-unexpected-error/index.md) : [ErrorCode](index.md) |
| [WebsocketError](-websocket-error/index.md) | [common]<br>object [WebsocketError](-websocket-error/index.md) : [ErrorCode](index.md) |

## Properties

| Name | Summary |
|---|---|
| [code](code.md) | [common]<br>val [code](code.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |

## Inheritors

| Name |
|---|
| [FeatureUnavailable](-feature-unavailable/index.md) |
| [FileTypeInvalid](-file-type-invalid/index.md) |
| [FileSizeInvalid](-file-size-invalid/index.md) |
| [FileContentInvalid](-file-content-invalid/index.md) |
| [FileNameInvalid](-file-name-invalid/index.md) |
| [FileNameTooLong](-file-name-too-long/index.md) |
| [SessionHasExpired](-session-has-expired/index.md) |
| [SessionNotFound](-session-not-found/index.md) |
| [AttachmentHasExpired](-attachment-has-expired/index.md) |
| [AttachmentNotFound](-attachment-not-found/index.md) |
| [AttachmentNotSuccessfullyUploaded](-attachment-not-successfully-uploaded/index.md) |
| [MessageTooLong](-message-too-long/index.md) |
| [MissingParameter](-missing-parameter/index.md) |
| [UnexpectedError](-unexpected-error/index.md) |
| [WebsocketError](-websocket-error/index.md) |
| [RedirectResponseError](-redirect-response-error/index.md) |
| [ClientResponseError](-client-response-error/index.md) |
| [ServerResponseError](-server-response-error/index.md) |
