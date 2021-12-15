//[transport](../../../index.md)/[com.genesys.cloud.messenger.transport](../index.md)/[MessagingClient](index.md)/[attach](attach.md)

# attach

[common]\
abstract fun [attach](attach.md)(byteArray: [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html), fileName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), uploadProgress: ([Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)? = null): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)

Attach file to the message. This file will be uploaded and cached locally until user decides to send a message. After message has been sent, attachment will be cleared from cache.

#### Return

internally generated attachmentId. Can be used to track upload progress

## Parameters

common

| | |
|---|---|
| byteArray | data to upload. |
| fileName | the name of the file to upload. Has to include file extension type for instance: example.png |
| uploadProgress | optional callback to track attachment upload progress. |
