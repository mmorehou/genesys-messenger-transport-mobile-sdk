//[transport](../../../index.md)/[com.genesys.cloud.messenger.transport](../index.md)/[MessagingClient](index.md)/[deleteAttachment](delete-attachment.md)

# deleteAttachment

[common]\
abstract fun [deleteAttachment](delete-attachment.md)(attachmentId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))

Attachments typically expire 72 hours after being uploaded. This method can be used to immediately delete the file prior to that expiration.

## Parameters

common

| | |
|---|---|
| attachmentId | the ID of the attachment |

## Throws

| | |
|---|---|
| [kotlin.IllegalStateException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-state-exception/index.html) |  |
