@file:JvmMultifileClass
@file:JvmName("FilesKt")

package kotlin.io

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.Closeable
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.io.PrintWriter
import java.io.Reader
import java.io.Writer
import java.nio.charset.Charset
import java.util.ArrayList
import kotlin.internal.InlineOnly
import kotlin.internal.PlatformImplementationsKt
import kotlin.jvm.internal.InlineMarker

// $VF: Compiled from FileReadWrite.kt
@InlineOnly
public inline fun File.writer(charset: Charset = Charsets.UTF_8): OutputStreamWriter {
   return OutputStreamWriter(FileOutputStream(`$this$writer`), charset)
}

@InlineOnly
public inline fun File.bufferedReader(charset: Charset = Charsets.UTF_8, bufferSize: Int = 8192): BufferedReader {
   val var4: Reader = InputStreamReader(FileInputStream(`$this$bufferedReader`), charset)
   return if (var4 is BufferedReader) var4 as BufferedReader else BufferedReader(var4, bufferSize)
}

public fun File.readLines(charset: Charset = Charsets.UTF_8): List<String> {
   val result: ArrayList = ArrayList()
   FilesKt.forEachLine(`$this$readLines`, charset,    // $VF: Compiled from FileReadWrite.kt
{ it: String ->
      result.add(it)
   } as (java.lang.String?) -> Unit)
   return result
}

public fun File.writeBytes(array: ByteArray) {
   val var2: Closeable = FileOutputStream(`$this$writeBytes`)
   var var3: java.lang.Throwable = null

   try {
      (var2 as FileOutputStream).write(array)
   } catch (var8: java.lang.Throwable) {
      var3 = var8
      throw var8
   } finally {
      CloseableKt.closeFinally(var2, var3)
   }
}

public inline fun <T> File.useLines(charset: Charset = Charsets.UTF_8, block: (Sequence<String>) -> Any): Any {
   val var17: Reader = InputStreamReader(FileInputStream(`$this$useLines`), charset)
   val var15: Closeable = if (var17 is BufferedReader) var17 as BufferedReader else BufferedReader(var17, 8192)
   var var16: java.lang.Throwable = null

   try {
      val var20: Boolean = true
      var19 = block(TextStreamsKt.lineSequence(var15 as BufferedReader))
   } catch (var13: java.lang.Throwable) {
      var16 = var13
      throw var13
   } finally {
      if (var11) {
         InlineMarker.finallyStart(1)
         if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
            CloseableKt.closeFinally(var15, var16)
         } else if (var16 == null) {
            var15.close()
         } else {
            try {
               var15.close()
            } catch (var12: java.lang.Throwable) {
            }
         }

         InlineMarker.finallyEnd(1)
      }
   }

   InlineMarker.finallyStart(1)
   if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
      CloseableKt.closeFinally(var15, null)
   } else {
      var15.close()
   }

   InlineMarker.finallyEnd(1)
   return (T)var19
   val var11: Boolean
}

@InlineOnly
public inline fun File.reader(charset: Charset = Charsets.UTF_8): InputStreamReader {
   return InputStreamReader(FileInputStream(`$this$reader`), charset)
}

@InlineOnly
public inline fun File.inputStream(): FileInputStream {
   return FileInputStream(`$this$inputStream`)
}

open fun FilesKt__FileReadWriteKt() {
}

public fun File.writeText(text: String, charset: Charset = Charsets.UTF_8) {
   val var10001: ByteArray = text.getBytes(charset)
   FilesKt.writeBytes(`$this$writeText`, var10001)
}

public fun File.readText(charset: Charset = Charsets.UTF_8): String {
   val var10: Closeable = InputStreamReader(FileInputStream(`$this$readText`), charset)
   var var3: java.lang.Throwable = null

   try {
      return TextStreamsKt.readText(var10 as InputStreamReader)
   } catch (var8: java.lang.Throwable) {
      var3 = var8
      throw var8
   } finally {
      CloseableKt.closeFinally(var10, var3)
   }
}

public fun File.forEachBlock(action: (ByteArray, Int) -> Unit) {
   FilesKt.forEachBlock(`$this$forEachBlock`, 4096, action)
}

public fun File.readBytes(): ByteArray {
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
   // 000: aload 0
   // 001: ldc "<this>"
   // 003: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
   // 006: new java/io/FileInputStream
   // 009: dup
   // 00a: aload 0
   // 00b: invokespecial java/io/FileInputStream.<init> (Ljava/io/File;)V
   // 00e: checkcast java/io/Closeable
   // 011: astore 1
   // 012: aconst_null
   // 013: nop
   // 014: astore 2
   // 015: nop
   // 016: aload 1
   // 017: checkcast java/io/FileInputStream
   // 01a: astore 3
   // 01b: bipush 0
   // 01c: nop
   // 01d: istore 4
   // 01f: bipush 0
   // 020: nop
   // 021: istore 5
   // 023: aload 0
   // 024: invokevirtual java/io/File.length ()J
   // 027: lstore 6
   // 029: lload 6
   // 02b: lstore 8
   // 02d: bipush 0
   // 02e: nop
   // 02f: istore 10
   // 031: lload 8
   // 033: ldc2_w 2147483647
   // 036: lcmp
   // 037: ifle 067
   // 03a: new java/lang/OutOfMemoryError
   // 03d: dup
   // 03e: new java/lang/StringBuilder
   // 041: dup
   // 042: invokespecial java/lang/StringBuilder.<init> ()V
   // 045: ldc_w "File "
   // 048: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
   // 04b: aload 0
   // 04c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
   // 04f: ldc_w " is too big ("
   // 052: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
   // 055: lload 8
   // 057: invokevirtual java/lang/StringBuilder.append (J)Ljava/lang/StringBuilder;
   // 05a: ldc_w " bytes) to fit in memory."
   // 05d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
   // 060: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
   // 063: invokespecial java/lang/OutOfMemoryError.<init> (Ljava/lang/String;)V
   // 066: athrow
   // 067: nop
   // 068: lload 6
   // 06a: l2i
   // 06b: istore 11
   // 06d: iload 11
   // 06f: newarray 8
   // 071: astore 6
   // 073: iload 11
   // 075: ifle 09b
   // 078: aload 3
   // 079: nop
   // 07a: aload 6
   // 07c: iload 5
   // 07e: iload 11
   // 080: invokevirtual java/io/FileInputStream.read ([BII)I
   // 083: istore 12
   // 085: iload 12
   // 087: iflt 09b
   // 08a: iload 11
   // 08c: iload 12
   // 08e: isub
   // 08f: istore 11
   // 091: iload 5
   // 093: iload 12
   // 095: iadd
   // 096: istore 5
   // 098: goto 073
   // 09b: iload 11
   // 09d: ifle 0b1
   // 0a0: aload 6
   // 0a2: iload 5
   // 0a4: invokestatic java/util/Arrays.copyOf ([BI)[B
   // 0a7: dup
   // 0a8: ldc_w "copyOf(...)"
   // 0ab: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
   // 0ae: goto 13d
   // 0b1: aload 3
   // 0b2: nop
   // 0b3: invokevirtual java/io/FileInputStream.read ()I
   // 0b6: istore 12
   // 0b8: iload 12
   // 0ba: bipush -1
   // 0bb: nop
   // 0bc: if_icmpne 0c4
   // 0bf: aload 6
   // 0c1: goto 13d
   // 0c4: new kotlin/io/ExposingBufferByteArrayOutputStream
   // 0c7: dup
   // 0c8: sipush 8193
   // 0cb: invokespecial kotlin/io/ExposingBufferByteArrayOutputStream.<init> (I)V
   // 0ce: astore 13
   // 0d0: aload 13
   // 0d2: iload 12
   // 0d4: invokevirtual kotlin/io/ExposingBufferByteArrayOutputStream.write (I)V
   // 0d7: aload 3
   // 0d8: nop
   // 0d9: checkcast java/io/InputStream
   // 0dc: aload 13
   // 0de: checkcast java/io/OutputStream
   // 0e1: bipush 0
   // 0e2: nop
   // 0e3: bipush 2
   // 0e4: nop
   // 0e5: aconst_null
   // 0e6: nop
   // 0e7: invokestatic kotlin/io/ByteStreamsKt.copyTo$default (Ljava/io/InputStream;Ljava/io/OutputStream;IILjava/lang/Object;)J
   // 0ea: pop2
   // 0eb: aload 6
   // 0ed: arraylength
   // 0ee: aload 13
   // 0f0: invokevirtual kotlin/io/ExposingBufferByteArrayOutputStream.size ()I
   // 0f3: iadd
   // 0f4: istore 10
   // 0f6: iload 10
   // 0f8: ifge 11d
   // 0fb: new java/lang/OutOfMemoryError
   // 0fe: dup
   // 0ff: new java/lang/StringBuilder
   // 102: dup
   // 103: invokespecial java/lang/StringBuilder.<init> ()V
   // 106: ldc_w "File "
   // 109: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
   // 10c: aload 0
   // 10d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
   // 110: ldc_w " is too big to fit in memory."
   // 113: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
   // 116: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
   // 119: invokespecial java/lang/OutOfMemoryError.<init> (Ljava/lang/String;)V
   // 11c: athrow
   // 11d: aload 13
   // 11f: invokevirtual kotlin/io/ExposingBufferByteArrayOutputStream.getBuffer ()[B
   // 122: aload 6
   // 124: iload 10
   // 126: invokestatic java/util/Arrays.copyOf ([BI)[B
   // 129: dup
   // 12a: ldc_w "copyOf(...)"
   // 12d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
   // 130: aload 6
   // 132: arraylength
   // 133: bipush 0
   // 134: nop
   // 135: aload 13
   // 137: invokevirtual kotlin/io/ExposingBufferByteArrayOutputStream.size ()I
   // 13a: invokestatic kotlin/collections/ArraysKt.copyInto ([B[BIII)[B
   // 13d: astore 3
   // 13e: aload 1
   // 13f: aload 2
   // 140: nop
   // 141: invokestatic kotlin/io/CloseableKt.closeFinally (Ljava/io/Closeable;Ljava/lang/Throwable;)V
   // 144: aload 3
   // 145: nop
   // 146: goto 15a
   // 149: astore 3
   // 14a: aload 3
   // 14b: nop
   // 14c: astore 2
   // 14d: aload 3
   // 14e: nop
   // 14f: athrow
   // 150: astore 3
   // 151: aload 1
   // 152: aload 2
   // 153: nop
   // 154: invokestatic kotlin/io/CloseableKt.closeFinally (Ljava/io/Closeable;Ljava/lang/Throwable;)V
   // 157: aload 3
   // 158: nop
   // 159: athrow
   // 15a: areturn
}

public fun File.appendText(text: String, charset: Charset = Charsets.UTF_8) {
   val var10001: ByteArray = text.getBytes(charset)
   FilesKt.appendBytes(`$this$appendText`, var10001)
}

@InlineOnly
public inline fun File.bufferedWriter(charset: Charset = Charsets.UTF_8, bufferSize: Int = 8192): BufferedWriter {
   val var4: Writer = OutputStreamWriter(FileOutputStream(`$this$bufferedWriter`), charset)
   return if (var4 is BufferedWriter) var4 as BufferedWriter else BufferedWriter(var4, bufferSize)
}

public fun File.forEachLine(charset: Charset = Charsets.UTF_8, action: (String) -> Unit) {
   TextStreamsKt.forEachLine(BufferedReader(InputStreamReader(FileInputStream(`$this$forEachLine`), charset)), action)
}

public fun File.forEachBlock(blockSize: Int, action: (ByteArray, Int) -> Unit) {
   val arr: ByteArray = ByteArray(RangesKt.coerceAtLeast(blockSize, 512))
   val var4: Closeable = FileInputStream(`$this$forEachBlock`)
   var var5: java.lang.Throwable = null

   try {
      val input: FileInputStream = var4 as FileInputStream

      while (true) {
         val size: Int = input.read(arr)
         if (size <= 0) {
            return
         }

         action(arr, size)
      }
   } catch (var11: java.lang.Throwable) {
      var5 = var11
      throw var11
   } finally {
      CloseableKt.closeFinally(var4, var5)
   }
}

@InlineOnly
public inline fun File.outputStream(): FileOutputStream {
   return FileOutputStream(`$this$outputStream`)
}

@InlineOnly
public inline fun File.printWriter(charset: Charset = Charsets.UTF_8): PrintWriter {
   val var5: Writer = OutputStreamWriter(FileOutputStream(`$this$printWriter`), charset)
   return PrintWriter(if (var5 is BufferedWriter) var5 as BufferedWriter else BufferedWriter(var5, 8192))
}

public fun File.appendBytes(array: ByteArray) {
   val var2: Closeable = FileOutputStream(`$this$appendBytes`, true)
   var var3: java.lang.Throwable = null

   try {
      (var2 as FileOutputStream).write(array)
   } catch (var8: java.lang.Throwable) {
      var3 = var8
      throw var8
   } finally {
      CloseableKt.closeFinally(var2, var3)
   }
}
