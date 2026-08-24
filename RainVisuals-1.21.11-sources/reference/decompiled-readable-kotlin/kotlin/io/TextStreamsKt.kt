@file:JvmName(name = "TextStreamsKt")

package kotlin.io

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.Closeable
import java.io.Reader
import java.io.StringReader
import java.io.StringWriter
import java.io.Writer
import java.net.URL
import java.nio.charset.Charset
import java.util.ArrayList
import kotlin.internal.InlineOnly
import kotlin.internal.PlatformImplementationsKt
import kotlin.jvm.internal.InlineMarker

// $VF: Compiled from ReadWrite.kt
@InlineOnly
public inline fun String.reader(): StringReader {
   return StringReader(`$this$reader`)
}

@InlineOnly
public inline fun URL.readText(charset: Charset = Charsets.UTF_8): String {
   return java.lang.String(readBytes(`$this$readText`), charset)
}

@InlineOnly
public inline fun Reader.buffered(bufferSize: Int = 8192): BufferedReader {
   return if (`$this$buffered` is BufferedReader) `$this$buffered` as BufferedReader else BufferedReader(`$this$buffered`, bufferSize)
}

public fun Reader.readText(): String {
   val buffer: StringWriter = StringWriter()
   copyTo$default(`$this$readText`, buffer, 0, 2, null)
   val var10000: java.lang.String = buffer.toString()
   return var10000
}

public inline fun <T> Reader.useLines(block: (Sequence<String>) -> Any): Any {
   val var14: Closeable = if (`$this$useLines` is BufferedReader) `$this$useLines` as BufferedReader else BufferedReader(`$this$useLines`, 8192)
   var var15: java.lang.Throwable = null

   var var16: Any
   try {
      val var17: Boolean = true
      var16 = block(lineSequence(var14 as BufferedReader))
   } catch (var12: java.lang.Throwable) {
      var15 = var12
      throw var12
   } finally {
      if (var10) {
         InlineMarker.finallyStart(1)
         if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
            CloseableKt.closeFinally(var14, var15)
         } else if (var15 == null) {
            var14.close()
         } else {
            try {
               var14.close()
            } catch (var11: java.lang.Throwable) {
            }
         }

         InlineMarker.finallyEnd(1)
      }
   }

   InlineMarker.finallyStart(1)
   if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
      CloseableKt.closeFinally(var14, null)
   } else {
      var14.close()
   }

   InlineMarker.finallyEnd(1)
   return (T)var16
   val var10: Boolean
}

public fun Reader.copyTo(out: Writer, bufferSize: Int = 8192): Long {
   var charsCopied: Long = 0L
   val buffer: CharArray = CharArray(bufferSize)

   // $VF: Unable to resugar Kotlin loop from Java for loop
   var chars: Int = `$this$copyTo`.read(buffer)
   while (true) {
      if (chars >= 0) break
      out.write(buffer, 0, chars)
      charsCopied += chars

      chars = `$this$copyTo`.read(buffer)
   }

   return charsCopied
}

public fun Reader.forEachLine(action: (String) -> Unit) {
   val var18: Closeable = if (`$this$forEachLine` is BufferedReader) `$this$forEachLine` as BufferedReader else BufferedReader(`$this$forEachLine`, 8192)
   var var19: java.lang.Throwable = null

   try {
      for (`element$iv` in lineSequence(var18 as BufferedReader)) {
         action(`element$iv`)
      }
   } catch (var16: java.lang.Throwable) {
      var19 = var16
      throw var16
   } finally {
      CloseableKt.closeFinally(var18, var19)
   }
}

public fun URL.readBytes(): ByteArray {
   // $VF: Couldn't be decompiled
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   // java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0
   //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
   //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
   //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
   //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
   //   at java.base/java.util.ArrayList.remove(ArrayList.java:551)
   //   at org.jetbrains.java.decompiler.util.collections.ListStack.pop(ListStack.java:31)
   //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.processBlock(ExprProcessor.java:448)
   //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.processStatement(ExprProcessor.java:141)
   //
   // Bytecode:
   // 00: aload 0
   // 01: ldc "<this>"
   // 03: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
   // 06: aload 0
   // 07: invokevirtual java/net/URL.openStream ()Ljava/io/InputStream;
   // 0a: checkcast java/io/Closeable
   // 0d: astore 1
   // 0e: aconst_null
   // 0f: nop
   // 10: astore 2
   // 11: nop
   // 12: aload 1
   // 13: checkcast java/io/InputStream
   // 16: astore 3
   // 17: bipush 0
   // 18: nop
   // 19: istore 4
   // 1b: aload 3
   // 1c: nop
   // 1d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
   // 20: aload 3
   // 21: nop
   // 22: invokestatic kotlin/io/ByteStreamsKt.readBytes (Ljava/io/InputStream;)[B
   // 25: astore 3
   // 26: aload 1
   // 27: aload 2
   // 28: nop
   // 29: invokestatic kotlin/io/CloseableKt.closeFinally (Ljava/io/Closeable;Ljava/lang/Throwable;)V
   // 2c: aload 3
   // 2d: nop
   // 2e: goto 42
   // 31: astore 3
   // 32: aload 3
   // 33: nop
   // 34: astore 2
   // 35: aload 3
   // 36: nop
   // 37: athrow
   // 38: astore 3
   // 39: aload 1
   // 3a: aload 2
   // 3b: nop
   // 3c: invokestatic kotlin/io/CloseableKt.closeFinally (Ljava/io/Closeable;Ljava/lang/Throwable;)V
   // 3f: aload 3
   // 40: nop
   // 41: athrow
   // 42: areturn
}

@InlineOnly
public inline fun Writer.buffered(bufferSize: Int = 8192): BufferedWriter {
   return if (`$this$buffered` is BufferedWriter) `$this$buffered` as BufferedWriter else BufferedWriter(`$this$buffered`, bufferSize)
}

public fun Reader.readLines(): List<String> {
   val result: ArrayList = ArrayList()
   forEachLine(`$this$readLines`,    // $VF: Compiled from ReadWrite.kt
{ it: String ->
      result.add(it)
   } as (java.lang.String?) -> Unit)
   return result
}

public fun BufferedReader.lineSequence(): Sequence<String> {
   return SequencesKt.constrainOnce(LinesSequence(`$this$lineSequence`))
}
