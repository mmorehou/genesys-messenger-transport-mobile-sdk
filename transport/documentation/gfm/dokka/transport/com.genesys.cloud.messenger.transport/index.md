//[transport](../../index.md)/[com.genesys.cloud.messenger.transport](index.md)

# Package com.genesys.cloud.messenger.transport

## Types

| Name | Summary |
|---|---|
| [Attachment](-attachment/index.md) | [common]<br>data class [Attachment](-attachment/index.md)(id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), fileName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), state: [Attachment.State](-attachment/-state/index.md)) |
| [Configuration](-configuration/index.md) | [common]<br>data class [Configuration](-configuration/index.md)(deploymentId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), domain: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), tokenStoreKey: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), logging: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) |
| [Message](-message/index.md) | [common]<br>data class [Message](-message/index.md)(id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), direction: [Message.Direction](-message/-direction/index.md), state: [Message.State](-message/-state/index.md), type: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), text: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, timeStamp: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, attachments: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [Attachment](-attachment/index.md)&gt;) |
| [MessageEvent](-message-event/index.md) | [common]<br>sealed class [MessageEvent](-message-event/index.md)<br>Communicates conversation related updates to the UI. |
| [MessagingClient](-messaging-client/index.md) | [common]<br>interface [MessagingClient](-messaging-client/index.md)<br>WebMessagingClient provides bi-directional communication between a guest and Genesys Cloud via Web Messaging service. |
| [Region](-region/index.md) | [common]<br>enum [Region](-region/index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[Region](-region/index.md)&gt; |
