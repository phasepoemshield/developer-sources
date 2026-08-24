package kotlin.io.encoding

import java.nio.charset.Charset

// $VF: Compiled from Base64.kt
@SinceKotlin(version = "1.8")
@ExperimentalEncodingApi
public open class Base64 private constructor(isUrlSafe: Boolean, isMimeScheme: Boolean) {
   internal final val isMimeScheme: Boolean
   internal final val isUrlSafe: Boolean

   public fun <A : Appendable> encodeToAppendable(source: ByteArray, destination: Any, startIndex: Int = ..., endIndex: Int = ...): Any {
      destination.append(java.lang.String(this.encodeToByteArrayImpl$kotlin_stdlib(source, startIndex, endIndex), Charsets.ISO_8859_1))
      return (A)destination
   }

   public fun decodeIntoByteArray(
      source: CharSequence,
      destination: ByteArray,
      destinationOffset: Int = 0,
      startIndex: Int = 0,
      endIndex: Int = source.length()
   ): Int {
      val var10: ByteArray
      if (source is java.lang.String) {
         this.checkSourceBounds$kotlin_stdlib(source.length(), startIndex, endIndex)
         val var10000: java.lang.String = (source as java.lang.String).substring(startIndex, endIndex)
         val var9: Charset = Charsets.ISO_8859_1
         var10 = var10000.getBytes(var9)
      } else {
         var10 = this.charsToBytesImpl$kotlin_stdlib(source, startIndex, endIndex)
      }

      return decodeIntoByteArray$default(this, var10, destination, destinationOffset, 0, 0, 24, null)
   }

   internal fun charsToBytesImpl(source: CharSequence, startIndex: Int, endIndex: Int): ByteArray {
      this.checkSourceBounds$kotlin_stdlib(source.length(), startIndex, endIndex)
      val byteArray: ByteArray = ByteArray(endIndex - startIndex)
      var length: Int = 0

      for (index in startIndex..endIndex) {
         val symbol: Char = source.charAt(index)
         if (symbol <= 255) {
            byteArray[length++] = (byte)symbol
         } else {
            byteArray[length++] = 63
         }
      }

      return byteArray
   }

   public fun encodeIntoByteArray(source: ByteArray, destination: ByteArray, destinationOffset: Int = 0, startIndex: Int = 0, endIndex: Int = source.length): Int {
      return this.encodeIntoByteArrayImpl$kotlin_stdlib(source, destination, destinationOffset, startIndex, endIndex)
   }

   private fun encodeSize(sourceSize: Int): Int {
      val groups: Int = (sourceSize + 3 - 1) / 3
      val size: Int = (sourceSize + 3 - 1) / 3 * 4 + (if (this.isMimeScheme) ((sourceSize + 3 - 1) / 3 + -1) / 19 else 0) * 2
      if (groups * 4 + (if (this.isMimeScheme) ((sourceSize + 3 - 1) / 3 + -1) / 19 else 0) * 2 < 0) {
         throw IllegalArgumentException("Input is too big")
      } else {
         return size
      }
   }

   public fun decode(source: ByteArray, startIndex: Int = 0, endIndex: Int = source.length): ByteArray {
      this.checkSourceBounds$kotlin_stdlib(source.length, startIndex, endIndex)
      val destination: ByteArray = ByteArray(this.decodeSize(source, startIndex, endIndex))
      if (this.decodeImpl(source, destination, 0, startIndex, endIndex) != destination.length) {
         throw IllegalStateException("Check failed.".toString())
      } else {
         return destination
      }
   }

   init {
      this.isUrlSafe = isUrlSafe
      this.isMimeScheme = isMimeScheme
      if (this.isUrlSafe && this.isMimeScheme) {
         throw IllegalArgumentException("Failed requirement.".toString())
      }
   }

   internal fun encodeIntoByteArrayImpl(source: ByteArray, destination: ByteArray, destinationOffset: Int, startIndex: Int, endIndex: Int): Int {
      this.checkSourceBounds$kotlin_stdlib(source.length, startIndex, endIndex)
      this.checkDestinationBounds(destination.length, destinationOffset, this.encodeSize(endIndex - startIndex))
      val encodeMap: ByteArray = if (this.isUrlSafe) Base64Kt.access$getBase64UrlEncodeMap$p() else Base64Kt.access$getBase64EncodeMap$p()
      var sourceIndex: Int = startIndex
      var destinationIndex: Int = destinationOffset
      val groupsPerLine: Int = if (this.isMimeScheme) 19 else Integer.MAX_VALUE

      while (sourceIndex + 2 < endIndex) {
         val groups: Int = Math.min((endIndex - sourceIndex) / 3, groupsPerLine)

         repeat(groups) { byte1 ->
            val bits: Int = (source[sourceIndex++] and 255) shl 16 or (source[sourceIndex++] and 255) shl 8 or source[sourceIndex++] and 255
            destination[destinationIndex++] = encodeMap[bits ushr 18]
            destination[destinationIndex++] = encodeMap[bits ushr 12 and 63]
            destination[destinationIndex++] = encodeMap[bits ushr 6 and 63]
            destination[destinationIndex++] = encodeMap[bits and 63]
         }

         if (groups == groupsPerLine && sourceIndex != endIndex) {
            destination[destinationIndex++] = mimeLineSeparatorSymbols[0]
            destination[destinationIndex++] = mimeLineSeparatorSymbols[1]
         }
      }

      when (endIndex - sourceIndex) {
         1 -> {
            val var34: Int = (source[sourceIndex++] and 255) shl 4
            destination[destinationIndex++] = encodeMap[var34 ushr 6]
            destination[destinationIndex++] = encodeMap[var34 and 63]
            destination[destinationIndex++] = 61
            destination[destinationIndex++] = 61
         }
         2 -> {
            val var35: Int = (source[sourceIndex++] and 255) shl 10 or (source[sourceIndex++] and 255) shl 2
            destination[destinationIndex++] = encodeMap[var35 ushr 12]
            destination[destinationIndex++] = encodeMap[var35 ushr 6 and 63]
            destination[destinationIndex++] = encodeMap[var35 and 63]
            destination[destinationIndex++] = 61
         }
         else -> {}
      }

      if (sourceIndex != endIndex) {
         throw IllegalStateException("Check failed.".toString())
      } else {
         return destinationIndex - destinationOffset
      }
   }

   public fun encodeToByteArray(source: ByteArray, startIndex: Int = 0, endIndex: Int = source.length): ByteArray {
      return this.encodeToByteArrayImpl$kotlin_stdlib(source, startIndex, endIndex)
   }

   internal fun checkSourceBounds(sourceSize: Int, startIndex: Int, endIndex: Int) {
      AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(startIndex, endIndex, sourceSize)
   }

   private fun skipIllegalSymbolsIfMime(source: ByteArray, startIndex: Int, endIndex: Int): Int {
      if (!this.isMimeScheme) {
         return startIndex
      } else {
         for (sourceIndex in startIndex..endIndex) {
            if (Base64Kt.access$getBase64DecodeMap$p()[source[sourceIndex] and 255] != -1) {
               return sourceIndex
            }
         }

         return sourceIndex
      }
   }

   private fun checkDestinationBounds(destinationSize: Int, destinationOffset: Int, capacityNeeded: Int) {
      if (destinationOffset >= 0 && destinationOffset <= destinationSize) {
         if (destinationOffset + capacityNeeded < 0 || destinationOffset + capacityNeeded > destinationSize) {
            throw IndexOutOfBoundsException(
               "The destination array does not have enough capacity, destination offset: $destinationOffset, destination size: $destinationSize, capacity needed: $capacityNeeded"
            )
         }
      } else {
         throw IndexOutOfBoundsException("destination offset: $destinationOffset, destination size: $destinationSize")
      }
   }

   internal fun bytesToStringImpl(source: ByteArray): String {
      val stringBuilder: StringBuilder = StringBuilder(source.length)

      for (var5 in source) {
         stringBuilder.append((char)var5)
      }

      val var10000: java.lang.String = stringBuilder.toString()
      return var10000
   }

   public fun encode(source: ByteArray, startIndex: Int = 0, endIndex: Int = source.length): String {
      return java.lang.String(this.encodeToByteArrayImpl$kotlin_stdlib(source, startIndex, endIndex), Charsets.ISO_8859_1)
   }

   private fun decodeImpl(source: ByteArray, destination: ByteArray, destinationOffset: Int, startIndex: Int, endIndex: Int): Int {
      val decodeMap: IntArray = if (this.isUrlSafe) Base64Kt.access$getBase64UrlDecodeMap$p() else Base64Kt.access$getBase64DecodeMap$p()
      var payload: Int = 0
      var byteStart: Int = -8
      var sourceIndex: Int = startIndex
      var destinationIndex: Int = destinationOffset

      while (sourceIndex < endIndex) {
         if (byteStart == -8 && sourceIndex + 3 < endIndex) {
            val bits: Int = decodeMap[source[sourceIndex++] and 255] shl 18 or decodeMap[source[sourceIndex++] and 255] shl 12 or decodeMap[source[sourceIndex++] and 255] shl 6 or decodeMap[source[sourceIndex++] and 255]
            if (bits >= 0) {
               destination[destinationIndex++] = (byte)(bits shr 16)
               destination[destinationIndex++] = (byte)(bits shr 8)
               destination[destinationIndex++] = (byte)bits
               continue
            }

            sourceIndex -= 4
         }

         val var22: Int = source[sourceIndex] and 255
         val var24: Int = decodeMap[source[sourceIndex] and 255]
         if (decodeMap[source[sourceIndex] and 255] < 0) {
            if (var24 == -2) {
               sourceIndex = this.handlePaddingSymbol(source, sourceIndex, endIndex, byteStart)
               break
            }

            if (!this.isMimeScheme) {
               val var31: StringBuilder = StringBuilder().append("Invalid symbol '").append((char)var22).append("'(")
               val var10003: java.lang.String = Integer.toString(var22, CharsKt.checkRadix(8))
               throw IllegalArgumentException(var31.append(var10003).append(") at index ").append(sourceIndex).toString())
            }

            sourceIndex++
         } else {
            sourceIndex++
            payload = payload shl 6 or var24
            byteStart += 6
            if (byteStart >= 0) {
               destination[destinationIndex++] = (byte)(payload ushr byteStart)
               payload &= (1 shl byteStart) - 1
               byteStart -= 8
            }
         }
      }

      if (byteStart == -2) {
         throw IllegalArgumentException("The last unit of input does not have enough bits")
      } else {
         sourceIndex = this.skipIllegalSymbolsIfMime(source, sourceIndex, endIndex)
         if (sourceIndex < endIndex) {
            val var32: StringBuilder = StringBuilder().append("Symbol '").append((char)(source[sourceIndex] and 255)).append("'(")
            val var33: java.lang.String = Integer.toString(source[sourceIndex] and 255, CharsKt.checkRadix(8))
            throw IllegalArgumentException(
               var32.append(var33).append(") at index ").append(sourceIndex - 1).append(" is prohibited after the pad character").toString()
            )
         } else {
            return destinationIndex - destinationOffset
         }
      }
   }

   private fun decodeSize(source: ByteArray, startIndex: Int, endIndex: Int): Int {
      var symbols: Int = endIndex - startIndex
      if (endIndex - startIndex == 0) {
         return 0
      } else if (symbols == 1) {
         throw IllegalArgumentException("Input should have at list 2 symbols for Base64 decoding, startIndex: $startIndex, endIndex: $endIndex")
      } else {
         if (this.isMimeScheme) {
            for (index in startIndex..endIndex) {
               val symbolBits: Int = Base64Kt.access$getBase64DecodeMap$p()[source[index] and 255]
               if (symbolBits < 0) {
                  if (symbolBits == -2) {
                     symbols -= endIndex - index
                     break
                  }

                  symbols--
               }
            }
         } else if (source[endIndex + -1] == 61) {
            symbols--
            if (source[endIndex + -2] == 61) {
               symbols--
            }
         }

         return (int)((long)symbols * 6 / 8)
      }
   }

   public fun decode(source: CharSequence, startIndex: Int = 0, endIndex: Int = source.length()): ByteArray {
      val var8: ByteArray
      if (source is java.lang.String) {
         this.checkSourceBounds$kotlin_stdlib(source.length(), startIndex, endIndex)
         val var10000: java.lang.String = (source as java.lang.String).substring(startIndex, endIndex)
         val var7: Charset = Charsets.ISO_8859_1
         var8 = var10000.getBytes(var7)
      } else {
         var8 = this.charsToBytesImpl$kotlin_stdlib(source, startIndex, endIndex)
      }

      return decode$default(this, var8, 0, 0, 6, null)
   }

   internal fun encodeToByteArrayImpl(source: ByteArray, startIndex: Int, endIndex: Int): ByteArray {
      this.checkSourceBounds$kotlin_stdlib(source.length, startIndex, endIndex)
      val destination: ByteArray = ByteArray(this.encodeSize(endIndex - startIndex))
      this.encodeIntoByteArrayImpl$kotlin_stdlib(source, destination, 0, startIndex, endIndex)
      return destination
   }

   public fun decodeIntoByteArray(source: ByteArray, destination: ByteArray, destinationOffset: Int = 0, startIndex: Int = 0, endIndex: Int = source.length): Int {
      this.checkSourceBounds$kotlin_stdlib(source.length, startIndex, endIndex)
      this.checkDestinationBounds(destination.length, destinationOffset, this.decodeSize(source, startIndex, endIndex))
      return this.decodeImpl(source, destination, destinationOffset, startIndex, endIndex)
   }

   private fun handlePaddingSymbol(source: ByteArray, padIndex: Int, endIndex: Int, byteStart: Int): Int {
      var var10000: Int
      when (byteStart) {
         -8 -> throw IllegalArgumentException("Redundant pad character at index $padIndex")
         -7, -5, -3 -> throw IllegalStateException("Unreachable".toString())
         -6 -> var10000 = padIndex + 1
         -4 -> {
            val secondPadIndex: Int = this.skipIllegalSymbolsIfMime(source, padIndex + 1, endIndex)
            if (secondPadIndex == endIndex || source[secondPadIndex] != 61) {
               throw IllegalArgumentException("Missing one pad character at index $secondPadIndex")
            }

            var10000 = secondPadIndex + 1
            break
         }
         -2 -> var10000 = padIndex + 1
         else -> throw IllegalStateException("Unreachable".toString())
      }

      return var10000
   }

   // $VF: Compiled from Base64.kt
   public companion object Default : Base64(false, false) {
      public final val Mime: Base64
      public final val UrlSafe: Base64
      private const val bitsPerByte: Int = 8
      private const val bitsPerSymbol: Int = 6
      internal const val bytesPerGroup: Int = 3
      private const val mimeGroupsPerLine: Int = 19
      internal const val mimeLineLength: Int = 76
      internal final val mimeLineSeparatorSymbols: ByteArray
      internal const val padSymbol: Byte = 61
      internal const val symbolsPerGroup: Int = 4
   }
}
