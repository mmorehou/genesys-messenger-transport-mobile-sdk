//[transport](../../../index.md)/[com.genesys.cloud.messenger.transport](../index.md)/[MessagingClient](index.md)/[detach](detach.md)

# detach

[common]\
abstract fun [detach](detach.md)(attachmentId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))

Detach file from message. If file was already uploaded or is uploading now - process will be stopped and [deleteAttachment](delete-attachment.md) will be called.

## Parameters

common

| | |
|---|---|
| attachmentId | the ID of the attachment to remove |
