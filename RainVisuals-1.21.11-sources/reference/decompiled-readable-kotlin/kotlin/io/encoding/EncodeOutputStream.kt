package kotlin.io.encoding

import java.io.IOException
import java.io.OutputStream

// $VF: Compiled from Base64IOStream.kt
@ExperimentalEncodingApi
private class EncodeOutputStream(output: OutputStream, base64: Base64) : OutputStream {
   private final val symbolBuffer: ByteArray
   private final var isClosed: Boolean
   private final var lineLength: Int
   private final var byteBufferLength: Int
   private final val base64: Base64
   private final val byteBuffer: ByteArray
   private final val output: OutputStream

   init {
      this.output = output
      this.base64 = base64
      this.lineLength = if (this.base64.isMimeScheme) 76 else -1
      this.symbolBuffer = ByteArray(1024)
      this.byteBuffer = ByteArray(3)
   }

   private fun encodeByteBufferIntoOutput() {
      if (this.encodeIntoOutput(this.byteBuffer, 0, this.byteBufferLength) != 4) {
         throw IllegalStateException("Check failed.".toString())
      } else {
         this.byteBufferLength = 0
      }
   }

   private fun copyIntoByteBuffer(source: ByteArray, startIndex: Int, endIndex: Int): Int {
      val bytesToCopy: Int = Math.min(3 - this.byteBufferLength, endIndex - startIndex)
      ArraysKt.copyInto((byte[])source, (byte[])this.byteBuffer, this.byteBufferLength, startIndex, startIndex + bytesToCopy)
      this.byteBufferLength += bytesToCopy
      if (this.byteBufferLength == 3) {
         this.encodeByteBufferIntoOutput()
      }

      return bytesToCopy
   }

   private fun encodeIntoOutput(source: ByteArray, startIndex: Int, endIndex: Int): Int {
      val symbolsEncoded: Int = this.base64.encodeIntoByteArray(source, this.symbolBuffer, 0, startIndex, endIndex)
      if (this.lineLength == 0) {
         this.output.write(Base64.Default.mimeLineSeparatorSymbols)
         this.lineLength = 76
         if (symbolsEncoded > 76) {
            throw IllegalStateException("Check failed.".toString())
         }
      }

      this.output.write(this.symbolBuffer, 0, symbolsEncoded)
      this.lineLength -= symbolsEncoded
      return symbolsEncoded
   }

   public override fun flush() {
      this.checkOpen()
      this.output.flush()
   }

   public override fun write(b: Int) {
      this.checkOpen()
      this.byteBuffer[this.byteBufferLength++] = (byte)b
      if (this.byteBufferLength == 3) {
         this.encodeByteBufferIntoOutput()
      }
   }

   public override fun write(source: ByteArray, offset: Int, length: Int) {
      this.checkOpen()
      if (offset >= 0 && length >= 0 && offset + length <= source.length) {
         if (length != 0) {
            if (this.byteBufferLength >= 3) {
               throw IllegalStateException("Check failed.".toString())
            } else {
               var var12: Int = offset
               val endIndex: Int = offset + length
               if (this.byteBufferLength != 0) {
                  var12 += this.copyIntoByteBuffer(source, offset, endIndex)
                  if (this.byteBufferLength != 0) {
                     return
                  }
               }

               while (var12 + 3 <= endIndex) {
                  val groupsToEncode: Int = Math.min((if (this.base64.isMimeScheme) this.lineLength else this.symbolBuffer.length) / 4, (endIndex - var12) / 3)
                  val bytesToEncode: Int = groupsToEncode * 3
                  if (this.encodeIntoOutput(source, var12, var12 + groupsToEncode * 3) != groupsToEncode * 4) {
                     throw IllegalStateException("Check failed.".toString())
                  }

                  var12 += bytesToEncode
               }

               ArraysKt.copyInto((byte[])source, (byte[])this.byteBuffer, 0, var12, endIndex)
               this.byteBufferLength = endIndex - var12
            }
         }
      } else {
         throw IndexOutOfBoundsException("offset: $offset, length: $length, source size: ${source.length}")
      }
   }

   public override fun close() {
      if (!this.isClosed) {
         this.isClosed = true
         if (this.byteBufferLength != 0) {
            this.encodeByteBufferIntoOutput()
         }

         this.output.close()
      }
   }

   private fun checkOpen() {
      if (this.isClosed) {
         throw IOException("The output stream is closed.")
      }
   }
}
