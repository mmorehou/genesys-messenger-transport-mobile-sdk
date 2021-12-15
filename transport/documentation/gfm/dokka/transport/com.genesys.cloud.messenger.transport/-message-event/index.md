//[transport](../../../index.md)/[com.genesys.cloud.messenger.transport](../index.md)/[MessageEvent](index.md)

# MessageEvent

[common]\
sealed class [MessageEvent](index.md)

Communicates conversation related updates to the UI.

## Types

| Name | Summary |
|---|---|
| [AttachmentUpdated](-attachment-updated/index.md) | [common]<br>class [AttachmentUpdated](-attachment-updated/index.md)(attachment: [Attachment](../-attachment/index.md)) : [MessageEvent](index.md)<br>Dispatched when Attachment changes its state. |
| [HistoryFetched](-history-fetched/index.md) | [common]<br>class [HistoryFetched](-history-fetched/index.md)(messages: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Message](../-message/index.md)&gt;, startOfConversation: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) : [MessageEvent](index.md)<br>Dispatched when [MessagingClient.fetchNextPage](../-messaging-client/fetch-next-page.md) returns a successful result. |
| [MessageInserted](-message-inserted/index.md) | [common]<br>class [MessageInserted](-message-inserted/index.md)(message: [Message](../-message/index.md)) : [MessageEvent](index.md)<br>Dispatched when new message is added to the conversation either by user or agent. |
| [MessageUpdated](-message-updated/index.md) | [common]<br>class [MessageUpdated](-message-updated/index.md)(message: [Message](../-message/index.md)) : [MessageEvent](index.md)<br>Dispatched when message that is already present in conversation changes it state. For instance: when backend confirms that message that was sent from the user was successfully delivered. |

## Inheritors

| Name |
|---|
| [MessageInserted](-message-inserted/index.md) |
| [MessageUpdated](-message-updated/index.md) |
| [AttachmentUpdated](-attachment-updated/index.md) |
| [HistoryFetched](-history-fetched/index.md) |
