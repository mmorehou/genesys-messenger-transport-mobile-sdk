//[transport](../../../../index.md)/[com.genesys.cloud.messenger.transport](../../index.md)/[MessageEvent](../index.md)/[HistoryFetched](index.md)

# HistoryFetched

[common]\
class [HistoryFetched](index.md)(messages: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Message](../../-message/index.md)&gt;, startOfConversation: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) : [MessageEvent](../index.md)

Dispatched when [MessagingClient.fetchNextPage](../../-messaging-client/fetch-next-page.md) returns a successful result.

## Constructors

| | |
|---|---|
| [HistoryFetched](-history-fetched.md) | [common]<br>fun [HistoryFetched](-history-fetched.md)(messages: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Message](../../-message/index.md)&gt;, startOfConversation: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) |

## Properties

| Name | Summary |
|---|---|
| [messages](messages.md) | [common]<br>val [messages](messages.md): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Message](../../-message/index.md)&gt;<br>is a the list of messages returned by the Shyrka. Note! Messages that already present in MessageStore.activeConversation will be filtered out, making sure that only unique messages are dispatched. |
| [startOfConversation](start-of-conversation.md) | [common]<br>val [startOfConversation](start-of-conversation.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>is a flag that indicated if user has fetched all messages in the conversation history. When true - no more WebMessagingApi.getMessages requests will be executed. |
