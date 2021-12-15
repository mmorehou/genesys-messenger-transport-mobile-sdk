//[transport](../../../index.md)/[com.genesys.cloud.messenger.transport](../index.md)/[Message](index.md)/[Message](-message.md)

# Message

[common]\
fun [Message](-message.md)(id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = Platform().randomUUID(), direction: [Message.Direction](-direction/index.md) = Direction.Inbound, state: [Message.State](-state/index.md) = State.Idle, type: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = "Text", text: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, timeStamp: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, attachments: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [Attachment](../-attachment/index.md)&gt; = emptyMap())
