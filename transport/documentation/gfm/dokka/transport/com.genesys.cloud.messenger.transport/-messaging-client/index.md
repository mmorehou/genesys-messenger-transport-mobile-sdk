//[transport](../../../index.md)/[com.genesys.cloud.messenger.transport](../index.md)/[MessagingClient](index.md)

# MessagingClient

[common]\
interface [MessagingClient](index.md)

WebMessagingClient provides bi-directional communication between a guest and Genesys Cloud via Web Messaging service.

## Types

| Name | Summary |
|---|---|
| [State](-state/index.md) | [common]<br>sealed class [State](-state/index.md)<br>MessagingClient state. |

## Functions

| Name | Summary |
|---|---|
| [attach](attach.md) | [common]<br>abstract fun [attach](attach.md)(byteArray: [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html), fileName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), uploadProgress: ([Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)? = null): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Attach file to the message. This file will be uploaded and cached locally until user decides to send a message. After message has been sent, attachment will be cleared from cache. |
| [configureSession](configure-session.md) | [common]<br>abstract fun [configureSession](configure-session.md)()<br>Configure a Web Messaging session. |
| [connect](connect.md) | [common]<br>abstract fun [connect](connect.md)()<br>Open a secure WebSocket connection to the Web Messaging service with the url and deploymentId configured on this MessagingClient instance. |
| [deleteAttachment](delete-attachment.md) | [common]<br>abstract fun [deleteAttachment](delete-attachment.md)(attachmentId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>Attachments typically expire 72 hours after being uploaded. This method can be used to immediately delete the file prior to that expiration. |
| [detach](detach.md) | [common]<br>abstract fun [detach](detach.md)(attachmentId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>Detach file from message. If file was already uploaded or is uploading now - process will be stopped and [deleteAttachment](delete-attachment.md) will be called. |
| [disconnect](disconnect.md) | [common]<br>abstract fun [disconnect](disconnect.md)()<br>Close the WebSocket connection to the Web Messaging service. |
| [fetchDeploymentConfig](fetch-deployment-config.md) | [common]<br>abstract suspend fun [fetchDeploymentConfig](fetch-deployment-config.md)(): [DeploymentConfig](../../com.genesys.cloud.messenger.transport.shyrka.receive/-deployment-config/index.md)<br>Fetch deployment configuration based on deployment id. |
| [fetchNextPage](fetch-next-page.md) | [common]<br>abstract suspend fun [fetchNextPage](fetch-next-page.md)()<br>Get message history for a conversation. |
| [generateDownloadUrl](generate-download-url.md) | [common]<br>abstract fun [generateDownloadUrl](generate-download-url.md)(attachmentId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>Request a new and valid URL to download an attachment that was previously uploaded. Download URLs expire. |
| [sendHealthCheck](send-health-check.md) | [common]<br>abstract fun [sendHealthCheck](send-health-check.md)()<br>Perform a health check of the connection by sending an echo message. |
| [sendMessage](send-message.md) | [common]<br>abstract fun [sendMessage](send-message.md)(text: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>Send a message to the conversation as plain text. |

## Properties

| Name | Summary |
|---|---|
| [conversation](conversation.md) | [common]<br>abstract val [conversation](conversation.md): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Message](../-message/index.md)&gt;<br>Immutable Collection containing all Messages from current conversation. |
| [currentState](current-state.md) | [common]<br>abstract val [currentState](current-state.md): [MessagingClient.State](-state/index.md)<br>The current state of the MessagingClient. |
| [pendingMessage](pending-message.md) | [common]<br>abstract val [pendingMessage](pending-message.md): [Message](../-message/index.md)<br>Message object that is currently under construct. [sendMessage](send-message.md) command dispatch message based on the values stored in pending message. |
| [stateListener](state-listener.md) | [common]<br>abstract var [stateListener](state-listener.md): ([MessagingClient.State](-state/index.md)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)?<br>Listener for client state changes. |
