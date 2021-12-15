//[transport](../../../index.md)/[com.genesys.cloud.messenger.transport.util](../index.md)/[PlatformSocketListener](index.md)

# PlatformSocketListener

[common]\
interface [PlatformSocketListener](index.md)

## Functions

| Name | Summary |
|---|---|
| [onClosed](on-closed.md) | [common]<br>abstract fun [onClosed](on-closed.md)(code: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), reason: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |
| [onClosing](on-closing.md) | [common]<br>abstract fun [onClosing](on-closing.md)(code: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), reason: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |
| [onFailure](on-failure.md) | [common]<br>abstract fun [onFailure](on-failure.md)(t: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) |
| [onMessage](on-message.md) | [common]<br>abstract fun [onMessage](on-message.md)(text: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |
| [onOpen](on-open.md) | [common]<br>abstract fun [onOpen](on-open.md)() |
