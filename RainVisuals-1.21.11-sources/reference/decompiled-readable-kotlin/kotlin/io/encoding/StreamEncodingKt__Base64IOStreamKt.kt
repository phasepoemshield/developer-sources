@file:JvmMultifileClass
@file:JvmName("StreamEncodingKt")

package kotlin.io.encoding

import java.io.InputStream
import java.io.OutputStream

// $VF: Compiled from Base64IOStream.kt
@ExperimentalEncodingApi
@SinceKotlin(version = "1.8")
public fun InputStream.decodingWith(base64: Base64): InputStream {
   return DecodeInputStream(`$this$decodingWith`, base64)
}

open fun StreamEncodingKt__Base64IOStreamKt() {
}

@SinceKotlin(version = "1.8")
@ExperimentalEncodingApi
public fun OutputStream.encodingWith(base64: Base64): OutputStream {
   return EncodeOutputStream(`$this$encodingWith`, base64)
}
