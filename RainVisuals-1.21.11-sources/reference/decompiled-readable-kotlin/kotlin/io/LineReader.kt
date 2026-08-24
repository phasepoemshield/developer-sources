package kotlin.io

import java.io.InputStream
import java.nio.Buffer
import java.nio.ByteBuffer
import java.nio.CharBuffer
import java.nio.charset.Charset
import java.nio.charset.CharsetDecoder
import java.nio.charset.CoderResult
import kotlin.jvm.internal.Intrinsics

// $VF: Compiled from Console.kt
internal object LineReader {
   private final val charBuf: CharBuffer
   private final lateinit var decoder: CharsetDecoder
   private final val bytes: ByteArray = ByteArray(32)
   private final var directEOL: Boolean
   private final val sb: StringBuilder = StringBuilder()
   private final val byteBuf: ByteBuffer
   private final val chars: CharArray = CharArray(32)
   private const val BUFFER_SIZE: Int = 32

   private fun decodeEndOfInput(nBytes: Int, nChars: Int): Int {
      ((Buffer)byteBuf).limit(nBytes)
      ((Buffer)charBuf).position(nChars)
      val var3: Int = this.decode(true)
      var var10000: CharsetDecoder = decoder
      if (decoder == null) {
         Intrinsics.throwUninitializedPropertyAccessException("decoder")
         var10000 = null
      }

      var10000.reset()
      ((Buffer)byteBuf).position(0)
      return var3
   }

   private fun compactBytes(): Int {
      val `$this$compactBytes_u24lambda_u241`: ByteBuffer = byteBuf
      byteBuf.compact()
      val var4: Int = `$this$compactBytes_u24lambda_u241`.position()
      ((Buffer)`$this$compactBytes_u24lambda_u241`).position(0)
      return var4
   }

   private fun decode(endOfInput: Boolean): Int {
      while (true) {
         var var10000: CharsetDecoder = decoder
         if (decoder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("decoder")
            var10000 = null
         }

         val var4: CoderResult = var10000.decode(byteBuf, charBuf, endOfInput)
         if (var4.isError()) {
            this.resetAll()
            var4.throwException()
         }

         val nChars: Int = charBuf.position()
         if (!var4.isOverflow()) {
            return nChars
         }

         sb.append(chars, 0, nChars + -1)
         ((Buffer)charBuf).position(0)
         ((Buffer)charBuf).limit(32)
         charBuf.put(chars[nChars + -1])
      }
   }

   @Synchronized
   public fun readLine(inputStream: InputStream, charset: Charset): String? {
      run label87@{
         if (decoder != null) {
            var var10000: CharsetDecoder = decoder
            if (decoder == null) {
               Intrinsics.throwUninitializedPropertyAccessException("decoder")
               var10000 = null
            }

            if (var10000.charset() == charset) {
               return@label87
            }
         }

         this.updateCharset(charset)
      }

      var nBytes: Int = 0
      var nChars: Int = 0

      while (true) {
         val result: Int = inputStream.read()
         if (result == -1) {
            if (sb.length() == 0 && nBytes == 0 && nChars == 0) {
               return null
            }

            nChars = this.decodeEndOfInput(nBytes, nChars)
            break
         }

         bytes[nBytes++] = (byte)result
         if (result == 10 || nBytes == 32 || !directEOL) {
            ((Buffer)byteBuf).limit(nBytes)
            ((Buffer)charBuf).position(nChars)
            nChars = this.decode(false)
            if (nChars > 0 && chars[nChars - 1] == '\n') {
               ((Buffer)byteBuf).position(0)
               break
            }

            nBytes = this.compactBytes()
         }
      }

      if (nChars > 0 && chars[nChars - 1] == '\n') {
         nChars--
         if (nChars > 0 && chars[nChars - 1] == '\r') {
            nChars--
         }
      }

      if (sb.length() == 0) {
         return java.lang.String(chars, 0, nChars)
      } else {
         sb.append(chars, 0, nChars)
         val var7: java.lang.String = sb.toString()
         if (sb.length() > 32) {
            this.trimStringBuilder()
         }

         sb.setLength(0)
         return var7
      }
   }

   private fun trimStringBuilder() {
      sb.setLength(32)
      sb.trimToSize()
   }

   private fun resetAll() {
      var var10000: CharsetDecoder = decoder
      if (decoder == null) {
         Intrinsics.throwUninitializedPropertyAccessException("decoder")
         var10000 = null
      }

      var10000.reset()
      ((Buffer)byteBuf).position(0)
      sb.setLength(0)
   }

   @JvmStatic
   fun {
      val var10000: ByteBuffer = ByteBuffer.wrap(bytes)
      byteBuf = var10000
      val var0: CharBuffer = CharBuffer.wrap(chars)
      charBuf = var0
   }

   private fun updateCharset(charset: Charset) {
      var var10000: CharsetDecoder = charset.newDecoder()
      decoder = var10000
      ((Buffer)byteBuf).clear()
      ((Buffer)charBuf).clear()
      byteBuf.put((byte)10)
      ((Buffer)byteBuf).flip()
      var10000 = decoder
      if (decoder == null) {
         Intrinsics.throwUninitializedPropertyAccessException("decoder")
         var10000 = null
      }

      var10000.decode(byteBuf, charBuf, false)
      directEOL = charBuf.position() == 1 && charBuf.get(0) == '\n'
      this.resetAll()
   }
}
