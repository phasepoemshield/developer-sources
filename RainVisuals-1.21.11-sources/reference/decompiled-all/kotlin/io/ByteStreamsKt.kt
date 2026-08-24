@file:JvmName(name = "ByteStreamsKt")

package kotlin.io

import java.io.BufferedInputStream
import java.io.BufferedOutputStream
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.InputStream
import java.io.InputStreamReader
import java.io.OutputStream
import java.io.OutputStreamWriter
import java.io.Reader
import java.io.Writer
import java.nio.charset.Charset
import java.util.NoSuchElementException
import kotlin.internal.InlineOnly

// $VF: Compiled from IOStreams.kt
@InlineOnly
public inline fun ByteArray.inputStream(offset: Int, length: Int): ByteArrayInputStream {
   return ByteArrayInputStream(`$this$inputStream`, offset, length)
}

@InlineOnly
public inline fun OutputStream.writer(charset: Charset = Charsets.UTF_8): OutputStreamWriter {
   return OutputStreamWriter(`$this$writer`, charset)
}

public fun InputStream.copyTo(out: OutputStream, bufferSize: Int = 8192): Long {
   var bytesCopied: Long = 0L
   val buffer: ByteArray = ByteArray(bufferSize)

   // $VF: Unable to resugar Kotlin loop from Java for loop
   var bytes: Int = `$this$copyTo`.read(buffer)
   while (true) {
      if (bytes >= 0) break
      out.write(buffer, 0, bytes)
      bytesCopied += bytes

      bytes = `$this$copyTo`.read(buffer)
   }

   return bytesCopied
}

@InlineOnly
public inline fun String.byteInputStream(charset: Charset = Charsets.UTF_8): ByteArrayInputStream {
   val var10002: ByteArray = `$this$byteInputStream`.getBytes(charset)
   return ByteArrayInputStream(var10002)
}

@InlineOnly
public inline fun InputStream.buffered(bufferSize: Int = 8192): BufferedInputStream {
   return if (`$this$buffered` is BufferedInputStream) `$this$buffered` as BufferedInputStream else BufferedInputStream(`$this$buffered`, bufferSize)
}

@SinceKotlin(version = "1.3")
public fun InputStream.readBytes(): ByteArray {
   val buffer: ByteArrayOutputStream = ByteArrayOutputStream(Math.max(8192, `$this$readBytes`.available()))
   copyTo$default(`$this$readBytes`, buffer, 0, 2, null)
   val var10000: ByteArray = buffer.toByteArray()
   return var10000
}

@InlineOnly
public inline fun InputStream.reader(charset: Charset = Charsets.UTF_8): InputStreamReader {
   return InputStreamReader(`$this$reader`, charset)
}

@InlineOnly
public inline fun OutputStream.bufferedWriter(charset: Charset = Charsets.UTF_8): BufferedWriter {
   val var2: Writer = OutputStreamWriter(`$this$bufferedWriter`, charset)
   return if (var2 is BufferedWriter) var2 as BufferedWriter else BufferedWriter(var2, 8192)
}

@InlineOnly
public inline fun InputStream.bufferedReader(charset: Charset = Charsets.UTF_8): BufferedReader {
   val var2: Reader = InputStreamReader(`$this$bufferedReader`, charset)
   return if (var2 is BufferedReader) var2 as BufferedReader else BufferedReader(var2, 8192)
}

@InlineOnly
public inline fun OutputStream.buffered(bufferSize: Int = 8192): BufferedOutputStream {
   return if (`$this$buffered` is BufferedOutputStream) `$this$buffered` as BufferedOutputStream else BufferedOutputStream(`$this$buffered`, bufferSize)
}

public operator fun BufferedInputStream.iterator(): ByteIterator {
   return    // $VF: Compiled from IOStreams.kt
object : ByteIterator {
      public final var finished: Boolean
      public final var nextByte: Int = -1
      public final var nextPrepared: Boolean

      public override operator fun hasNext(): Boolean {
         this.prepareNext()
         return !this.finished
      }

      public override fun nextByte(): Byte {
         this.prepareNext()
         if (this.finished) {
            throw NoSuchElementException("Input stream is over.")
         } else {
            val res: Byte = (byte)this.nextByte
            this.nextPrepared = false
            return res
         }
      }

      private fun prepareNext() {
         if (!this.nextPrepared && !this.finished) {
            this.nextByte = $this$iterator.read()
            this.nextPrepared = true
            this.finished = this.nextByte == -1
         }
      }
   }
}

@DeprecatedSinceKotlin(warningSince = "1.3", errorSince = "1.5")
@Deprecated(message = "Use readBytes() overload without estimatedSize parameter", replaceWith = @ReplaceWith(expression = "readBytes()", imports = []))
public fun InputStream.readBytes(estimatedSize: Int = 8192): ByteArray {
   val buffer: ByteArrayOutputStream = ByteArrayOutputStream(Math.max(estimatedSize, `$this$readBytes`.available()))
   copyTo$default(`$this$readBytes`, buffer, 0, 2, null)
   val var10000: ByteArray = buffer.toByteArray()
   return var10000
}

@InlineOnly
public inline fun ByteArray.inputStream(): ByteArrayInputStream {
   return ByteArrayInputStream(`$this$inputStream`)
}
