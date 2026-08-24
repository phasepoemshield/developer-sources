@file:JvmMultifileClass
@file:JvmName("PathsKt")

package kotlin.io.path

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.Closeable
import java.io.InputStream
import java.io.InputStreamReader
import java.io.OutputStream
import java.io.OutputStreamWriter
import java.io.Writer
import java.nio.charset.Charset
import java.nio.file.Files
import java.nio.file.OpenOption
import java.nio.file.Path
import java.nio.file.StandardOpenOption
import java.util.Arrays
import kotlin.internal.InlineOnly
import kotlin.internal.PlatformImplementationsKt
import kotlin.jvm.internal.InlineMarker

// $VF: Compiled from PathReadWrite.kt
@SinceKotlin(version = "1.5")
@InlineOnly
@WasExperimental(markerClass = [ExperimentalPathApi::class])
@Throws(java/io/IOException::class)
public inline fun Path.reader(charset: Charset = Charsets.UTF_8, vararg options: OpenOption): InputStreamReader {
   return InputStreamReader(Files.newInputStream(`$this$reader`, Arrays.copyOf(options, options.length)), charset)
}

@WasExperimental(markerClass = [ExperimentalPathApi::class])
@SinceKotlin(version = "1.5")
@Throws(java/io/IOException::class)
public fun Path.appendText(text: CharSequence, charset: Charset = Charsets.UTF_8) {
   val var10000: OutputStream = Files.newOutputStream(`$this$appendText`, StandardOpenOption.APPEND)
   val var11: Closeable = OutputStreamWriter(var10000, charset)
   var var12: java.lang.Throwable = null

   try {
      val var13: Writer = (var11 as OutputStreamWriter).append(text)
   } catch (var9: java.lang.Throwable) {
      var12 = var9
      throw var9
   } finally {
      CloseableKt.closeFinally(var11, var12)
   }
}

@SinceKotlin(version = "1.5")
@InlineOnly
@WasExperimental(markerClass = [ExperimentalPathApi::class])
@Throws(java/io/IOException::class)
public inline fun Path.outputStream(vararg options: OpenOption): OutputStream {
   val var10000: OutputStream = Files.newOutputStream(`$this$outputStream`, Arrays.copyOf(options, options.length))
   return var10000
}

@InlineOnly
@WasExperimental(markerClass = [ExperimentalPathApi::class])
@SinceKotlin(version = "1.5")
@Throws(java/io/IOException::class)
public inline fun Path.writeLines(lines: Iterable<CharSequence>, charset: Charset = Charsets.UTF_8, vararg options: OpenOption): Path {
   val var10000: Path = Files.write(`$this$writeLines`, lines, charset, Arrays.copyOf(options, options.length))
   return var10000
}

@SinceKotlin(version = "1.5")
@InlineOnly
@WasExperimental(markerClass = [ExperimentalPathApi::class])
@Throws(java/io/IOException::class)
public inline fun Path.readLines(charset: Charset = Charsets.UTF_8): List<String> {
   val var10000: java.util.List = Files.readAllLines(`$this$readLines`, charset)
   return var10000
}

@InlineOnly
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalPathApi::class])
@Throws(java/io/IOException::class)
public inline fun Path.bufferedReader(charset: Charset = Charsets.UTF_8, bufferSize: Int = 8192, vararg options: OpenOption): BufferedReader {
   return BufferedReader(InputStreamReader(Files.newInputStream(`$this$bufferedReader`, Arrays.copyOf(options, options.length)), charset), bufferSize)
}

@WasExperimental(markerClass = [ExperimentalPathApi::class])
@InlineOnly
@SinceKotlin(version = "1.5")
@Throws(java/io/IOException::class)
public inline fun Path.writer(charset: Charset = Charsets.UTF_8, vararg options: OpenOption): OutputStreamWriter {
   return OutputStreamWriter(Files.newOutputStream(`$this$writer`, Arrays.copyOf(options, options.length)), charset)
}

@WasExperimental(markerClass = [ExperimentalPathApi::class])
@SinceKotlin(version = "1.5")
@InlineOnly
@Throws(java/io/IOException::class)
public inline fun Path.appendBytes(array: ByteArray) {
   Files.write(`$this$appendBytes`, array, StandardOpenOption.APPEND)
}

@WasExperimental(markerClass = [ExperimentalPathApi::class])
@InlineOnly
@SinceKotlin(version = "1.5")
@Throws(java/io/IOException::class)
public inline fun Path.appendLines(lines: Sequence<CharSequence>, charset: Charset = Charsets.UTF_8): Path {
   val var10000: Path = Files.write(`$this$appendLines`, SequencesKt.asIterable(lines), charset, StandardOpenOption.APPEND)
   return var10000
}

@InlineOnly
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalPathApi::class])
@Throws(java/io/IOException::class)
public inline fun Path.appendLines(lines: Iterable<CharSequence>, charset: Charset = Charsets.UTF_8): Path {
   val var10000: Path = Files.write(`$this$appendLines`, lines, charset, StandardOpenOption.APPEND)
   return var10000
}

@WasExperimental(markerClass = [ExperimentalPathApi::class])
@SinceKotlin(version = "1.5")
@Throws(java/io/IOException::class)
public fun Path.writeText(text: CharSequence, charset: Charset = Charsets.UTF_8, vararg options: OpenOption) {
   val var10000: OutputStream = Files.newOutputStream(`$this$writeText`, Arrays.copyOf(options, options.length))
   val var12: Closeable = OutputStreamWriter(var10000, charset)
   var var5: java.lang.Throwable = null

   try {
      val var13: Writer = (var12 as OutputStreamWriter).append(text)
   } catch (var10: java.lang.Throwable) {
      var5 = var10
      throw var10
   } finally {
      CloseableKt.closeFinally(var12, var5)
   }
}

@WasExperimental(markerClass = [ExperimentalPathApi::class])
@SinceKotlin(version = "1.5")
@InlineOnly
@Throws(java/io/IOException::class)
public inline fun Path.writeLines(lines: Sequence<CharSequence>, charset: Charset = Charsets.UTF_8, vararg options: OpenOption): Path {
   val var10000: Path = Files.write(`$this$writeLines`, SequencesKt.asIterable(lines), charset, Arrays.copyOf(options, options.length))
   return var10000
}

@InlineOnly
@WasExperimental(markerClass = [ExperimentalPathApi::class])
@SinceKotlin(version = "1.5")
@Throws(java/io/IOException::class)
public inline fun Path.inputStream(vararg options: OpenOption): InputStream {
   val var10000: InputStream = Files.newInputStream(`$this$inputStream`, Arrays.copyOf(options, options.length))
   return var10000
}

@WasExperimental(markerClass = [ExperimentalPathApi::class])
@InlineOnly
@SinceKotlin(version = "1.5")
@Throws(java/io/IOException::class)
public inline fun Path.forEachLine(charset: Charset = Charsets.UTF_8, action: (String) -> Unit) {
   val var10000: BufferedReader = Files.newBufferedReader(`$this$forEachLine`, charset)
   val var22: Closeable = var10000 as BufferedReader
   var var6: java.lang.Throwable = null

   try {
      val var24: Boolean = true

      for (`element$iv` in TextStreamsKt.lineSequence(var22 as BufferedReader)) {
         action(`element$iv`)
      }
   } catch (var20: java.lang.Throwable) {
      var6 = var20
      throw var20
   } finally {
      if (var18) {
         InlineMarker.finallyStart(1)
         if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
            CloseableKt.closeFinally(var22, var6)
         } else if (var6 == null) {
            var22.close()
         } else {
            try {
               var22.close()
            } catch (var19: java.lang.Throwable) {
            }
         }

         InlineMarker.finallyEnd(1)
      }
   }

   InlineMarker.finallyStart(1)
   if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
      CloseableKt.closeFinally(var22, null)
   } else {
      var22.close()
   }

   InlineMarker.finallyEnd(1)
   val var18: Boolean
}

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalPathApi::class])
@Throws(java/io/IOException::class)
public fun Path.readText(charset: Charset = Charsets.UTF_8): String {
   val var3: Array<OpenOption> = arrayOfNulls(0)
   val var10: Closeable = InputStreamReader(Files.newInputStream(`$this$readText`, Arrays.copyOf(var3, var3.length)), charset)
   var var11: java.lang.Throwable = null

   try {
      return TextStreamsKt.readText(var10 as InputStreamReader)
   } catch (var8: java.lang.Throwable) {
      var11 = var8
      throw var8
   } finally {
      CloseableKt.closeFinally(var10, var11)
   }
}

open fun PathsKt__PathReadWriteKt() {
}

@WasExperimental(markerClass = [ExperimentalPathApi::class])
@InlineOnly
@SinceKotlin(version = "1.5")
@Throws(java/io/IOException::class)
public inline fun Path.bufferedWriter(charset: Charset = Charsets.UTF_8, bufferSize: Int = 8192, vararg options: OpenOption): BufferedWriter {
   return BufferedWriter(OutputStreamWriter(Files.newOutputStream(`$this$bufferedWriter`, Arrays.copyOf(options, options.length)), charset), bufferSize)
}

@InlineOnly
@WasExperimental(markerClass = [ExperimentalPathApi::class])
@SinceKotlin(version = "1.5")
@Throws(java/io/IOException::class)
public inline fun <T> Path.useLines(charset: Charset = Charsets.UTF_8, block: (Sequence<String>) -> Any): Any {
   val var3: Closeable = Files.newBufferedReader(`$this$useLines`, charset)
   var var4: java.lang.Throwable = null

   var var14: BufferedReader
   try {
      val var15: Boolean = true
      var14 = var3 as BufferedReader
      var14 = (BufferedReader)block(TextStreamsKt.lineSequence(var14))
   } catch (var12: java.lang.Throwable) {
      var4 = var12
      throw var12
   } finally {
      if (var10) {
         InlineMarker.finallyStart(1)
         if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
            CloseableKt.closeFinally(var3, var4)
         } else if (var3 != null) {
            if (var4 == null) {
               var3.close()
            } else {
               try {
                  var3.close()
               } catch (var11: java.lang.Throwable) {
               }
            }
         }

         InlineMarker.finallyEnd(1)
      }
   }

   InlineMarker.finallyStart(1)
   if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
      CloseableKt.closeFinally(var3, null)
   } else if (var3 != null) {
      var3.close()
   }

   InlineMarker.finallyEnd(1)
   return (T)var14
   val var10: Boolean
}

@WasExperimental(markerClass = [ExperimentalPathApi::class])
@SinceKotlin(version = "1.5")
@InlineOnly
@Throws(java/io/IOException::class)
public inline fun Path.writeBytes(array: ByteArray, vararg options: OpenOption) {
   Files.write(`$this$writeBytes`, array, Arrays.copyOf(options, options.length))
}

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalPathApi::class])
@InlineOnly
@Throws(java/io/IOException::class)
public inline fun Path.readBytes(): ByteArray {
   val var10000: ByteArray = Files.readAllBytes(`$this$readBytes`)
   return var10000
}
