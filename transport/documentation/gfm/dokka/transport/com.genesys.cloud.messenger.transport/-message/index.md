//[transport](../../../index.md)/[com.genesys.cloud.messenger.transport](../index.md)/[Message](index.md)

# Message

[common]\
data class [Message](index.md)(id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), direction: [Message.Direction](-direction/index.md), state: [Message.State](-state/index.md), type: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), text: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, timeStamp: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, attachments: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [Attachment](../-attachment/index.md)&gt;)

## Types

| Name | Summary |
|---|---|
| [Direction](-direction/index.md) | [common]<br>enum [Direction](-direction/index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[Message.Direction](-direction/index.md)&gt; |
| [State](-state/index.md) | [common]<br>sealed class [State](-state/index.md) |

## Properties

| Name | Summary |
|---|---|
| [attachments](attachments.md) | [common]<br>val [attachments](attachments.md): [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [Attachment](../-attachment/index.md)&gt; |
| [direction](direction.md) | [common]<br>val [direction](direction.md): [Message.Direction](-direction/index.md) |
| [id](id.md) | [common]<br>val [id](id.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [state](state.md) | [common]<br>val [state](state.md): [Message.State](-state/index.md) |
| [text](text.md) | [common]<br>val [text](text.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null |
| [timeStamp](time-stamp.md) | [common]<br>val [timeStamp](time-stamp.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null |
| [type](type.md) | [common]<br>val [type](type.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
