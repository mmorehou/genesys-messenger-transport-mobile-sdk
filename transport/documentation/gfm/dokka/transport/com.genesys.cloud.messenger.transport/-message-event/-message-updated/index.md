//[transport](../../../../index.md)/[com.genesys.cloud.messenger.transport](../../index.md)/[MessageEvent](../index.md)/[MessageUpdated](index.md)

# MessageUpdated

[common]\
class [MessageUpdated](index.md)(message: [Message](../../-message/index.md)) : [MessageEvent](../index.md)

Dispatched when message that is already present in conversation changes it state. For instance: when backend confirms that message that was sent from the user was successfully delivered.

## Constructors

| | |
|---|---|
| [MessageUpdated](-message-updated.md) | [common]<br>fun [MessageUpdated](-message-updated.md)(message: [Message](../../-message/index.md)) |

## Properties

| Name | Summary |
|---|---|
| [message](message.md) | [common]<br>val [message](message.md): [Message](../../-message/index.md)<br>is the updated [Message](../../-message/index.md) object with details. |
