package kotlin.io.encoding

import java.nio.charset.Charset
import kotlin.internal.InlineOnly

// $VF: Compiled from Base64JVM.kt
@ExperimentalEncodingApi
@SinceKotlin(version = "1.8")
@InlineOnly
internal inline fun Base64.platformEncodeToString(source: ByteArray, startIndex: Int, endIndex: Int): String {
   return java.lang.String(`$this$platformEncodeToString`.encodeToByteArrayImpl$kotlin_stdlib(source, startIndex, endIndex), Charsets.ISO_8859_1)
}

@InlineOnly
@SinceKotlin(version = "1.8")
@ExperimentalEncodingApi
internal inline fun Base64.platformEncodeToByteArray(source: ByteArray, startIndex: Int, endIndex: Int): ByteArray {
   return `$this$platformEncodeToByteArray`.encodeToByteArrayImpl$kotlin_stdlib(source, startIndex, endIndex)
}

@SinceKotlin(version = "1.8")
@ExperimentalEncodingApi
@InlineOnly
internal inline fun Base64.platformEncodeIntoByteArray(source: ByteArray, destination: ByteArray, destinationOffset: Int, startIndex: Int, endIndex: Int): Int {
   return `$this$platformEncodeIntoByteArray`.encodeIntoByteArrayImpl$kotlin_stdlib(source, destination, destinationOffset, startIndex, endIndex)
}

@SinceKotlin(version = "1.8")
@InlineOnly
@ExperimentalEncodingApi
internal inline fun Base64.platformCharsToBytes(source: CharSequence, startIndex: Int, endIndex: Int): ByteArray {
   val var6: ByteArray
   if (source is java.lang.String) {
      `$this$platformCharsToBytes`.checkSourceBounds$kotlin_stdlib(source.length(), startIndex, endIndex)
      val var10000: java.lang.String = (source as java.lang.String).substring(startIndex, endIndex)
      val var5: Charset = Charsets.ISO_8859_1
      var6 = var10000.getBytes(var5)
   } else {
      var6 = `$this$platformCharsToBytes`.charsToBytesImpl$kotlin_stdlib(source, startIndex, endIndex)
   }

   return var6
}
