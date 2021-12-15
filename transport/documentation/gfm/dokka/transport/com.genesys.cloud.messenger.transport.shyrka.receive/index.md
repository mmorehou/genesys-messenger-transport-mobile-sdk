//[transport](../../index.md)/[com.genesys.cloud.messenger.transport.shyrka.receive](index.md)

# Package com.genesys.cloud.messenger.transport.shyrka.receive

## Types

| Name | Summary |
|---|---|
| [Apps](-apps/index.md) | [common]<br>data class [Apps](-apps/index.md)(conversations: [Conversations](-conversations/index.md)) |
| [Conversations](-conversations/index.md) | [common]<br>data class [Conversations](-conversations/index.md)(messagingEndpoint: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |
| [DeploymentConfig](-deployment-config/index.md) | [common]<br>data class [DeploymentConfig](-deployment-config/index.md)(id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), version: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), languages: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;, defaultLanguage: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), apiEndpoint: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), messenger: [Messenger](-messenger/index.md), journeyEvents: [JourneyEvents](-journey-events/index.md), status: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |
| [FileUpload](-file-upload/index.md) | [common]<br>data class [FileUpload](-file-upload/index.md)(modes: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Mode](-mode/index.md)&gt;) |
| [JourneyEvents](-journey-events/index.md) | [common]<br>data class [JourneyEvents](-journey-events/index.md)(enabled: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) |
| [LauncherButton](-launcher-button/index.md) | [common]<br>data class [LauncherButton](-launcher-button/index.md)(visibility: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |
| [Messenger](-messenger/index.md) | [common]<br>data class [Messenger](-messenger/index.md)(enabled: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), apps: [Apps](-apps/index.md), styles: [Styles](-styles/index.md), launcherButton: [LauncherButton](-launcher-button/index.md), fileUpload: [FileUpload](-file-upload/index.md)) |
| [Mode](-mode/index.md) | [common]<br>data class [Mode](-mode/index.md)(fileTypes: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;, maxFileSizeKB: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)) |
| [SessionExpiredEvent](-session-expired-event/index.md) | [common]<br>class [SessionExpiredEvent](-session-expired-event/index.md) |
| [Styles](-styles/index.md) | [common]<br>data class [Styles](-styles/index.md)(primaryColor: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |
