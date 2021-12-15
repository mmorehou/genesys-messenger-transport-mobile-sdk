//[transport](../../../index.md)/[com.genesys.cloud.messenger.transport](../index.md)/[Configuration](index.md)

# Configuration

[common]\
data class [Configuration](index.md)(deploymentId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), domain: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), tokenStoreKey: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), logging: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html))

## Parameters

common

| | |
|---|---|
| deploymentId | the ID of the deployment containing configuration and routing information. |
| domain | the regional base domain address for a Genesys Cloud Web Messaging service. For example, "mypurecloud.com". |
| tokenStoreKey | the key to access local storage. |

## Constructors

| | |
|---|---|
| [Configuration](-configuration.md) | [common]<br>fun [Configuration](-configuration.md)(deploymentId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), domain: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), tokenStoreKey: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), logging: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false) |

## Properties

| Name | Summary |
|---|---|
| [deploymentId](deployment-id.md) | [common]<br>val [deploymentId](deployment-id.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [logging](logging.md) | [common]<br>val [logging](logging.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false |
| [tokenStoreKey](token-store-key.md) | [common]<br>val [tokenStoreKey](token-store-key.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
