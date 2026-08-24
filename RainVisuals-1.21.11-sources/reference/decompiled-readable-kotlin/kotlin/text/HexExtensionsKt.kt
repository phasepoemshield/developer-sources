package kotlin.text

import java.util.Arrays

// $VF: Compiled from HexExtensions.kt
private final val HEX_DIGITS_TO_DECIMAL: IntArray
private const val LOWER_CASE_HEX_DIGITS: String = "0123456789abcdef"
private const val UPPER_CASE_HEX_DIGITS: String = "0123456789ABCDEF"

@SinceKotlin(version = "1.9")
@ExperimentalStdlibApi
public fun Long.toHexString(format: HexFormat = HexFormat.Companion.Default): String {
   return toHexStringImpl(`$this$toHexString`, format, 64)
}

private fun String.checkHexLength(startIndex: Int, endIndex: Int, maxDigits: Int, requireMaxLength: Boolean) {
   val digitsLength: Int = endIndex - startIndex
   if (if (requireMaxLength) endIndex - startIndex != maxDigits else endIndex - startIndex > maxDigits) {
      val specifier: java.lang.String = if (requireMaxLength) "exactly" else "at most"
      val var10000: java.lang.String = `$this$checkHexLength`.substring(startIndex, endIndex)
      throw NumberFormatException("Expected $specifier $maxDigits hexadecimal digits at index $startIndex, but was $var10000 of length $digitsLength")
   }
}

private fun wholeElementsPerSet(charsPerSet: Long, charsPerElement: Long, elementSeparatorLength: Int): Long {
   return if (charsPerSet > 0L && charsPerElement > 0L) (charsPerSet + elementSeparatorLength) / (charsPerElement + elementSeparatorLength) else 0L
}

@SinceKotlin(version = "1.9")
@ExperimentalStdlibApi
public fun String.hexToInt(format: HexFormat = HexFormat.Companion.Default): Int {
   return hexToInt(`$this$hexToInt`, 0, `$this$hexToInt`.length(), format)
}

@ExperimentalStdlibApi
@SinceKotlin(version = "1.9")
public fun String.hexToLong(format: HexFormat = HexFormat.Companion.Default): Long {
   return hexToLong(`$this$hexToLong`, 0, `$this$hexToLong`.length(), format)
}

@ExperimentalStdlibApi
private fun String.hexToInt(startIndex: Int = 0, endIndex: Int = `$this$hexToInt`.length(), format: HexFormat = HexFormat.Companion.Default): Int {
   return (int)hexToLongImpl(`$this$hexToInt`, startIndex, endIndex, format, 8)
}

@SinceKotlin(version = "1.9")
@ExperimentalStdlibApi
public fun String.hexToShort(format: HexFormat = HexFormat.Companion.Default): Short {
   return hexToShort(`$this$hexToShort`, 0, `$this$hexToShort`.length(), format)
}

@ExperimentalStdlibApi
private fun String.hexToByteArray(startIndex: Int = 0, endIndex: Int = `$this$hexToByteArray`.length(), format: HexFormat = HexFormat.Companion.Default): ByteArray {
   AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(startIndex, endIndex, `$this$hexToByteArray`.length())
   if (startIndex == endIndex) {
      return ByteArray(0)
   } else {
      val bytesFormat: HexFormat.BytesHexFormat = format.bytes
      val bytesPerLine: Int = bytesFormat.bytesPerLine
      val bytesPerGroup: Int = bytesFormat.bytesPerGroup
      val bytePrefix: java.lang.String = bytesFormat.bytePrefix
      val byteSuffix: java.lang.String = bytesFormat.byteSuffix
      val byteSeparator: java.lang.String = bytesFormat.byteSeparator
      val groupSeparator: java.lang.String = bytesFormat.groupSeparator
      val result: ByteArray = ByteArray(parsedByteArrayMaxSize(
         endIndex - startIndex, bytesPerLine, bytesPerGroup, groupSeparator.length(), byteSeparator.length(), bytePrefix.length(), byteSuffix.length()
      ))
      var i: Int = startIndex
      var byteIndex: Int = 0
      var indexInLine: Int = 0
      var indexInGroup: Int = 0

      while (i < endIndex) {
         if (indexInLine == bytesPerLine) {
            i = checkNewLineAt(`$this$hexToByteArray`, i, endIndex)
            indexInLine = 0
            indexInGroup = 0
         } else if (indexInGroup == bytesPerGroup) {
            i = checkContainsAt(`$this$hexToByteArray`, groupSeparator, i, endIndex, "group separator")
            indexInGroup = 0
         } else if (indexInGroup != 0) {
            i = checkContainsAt(`$this$hexToByteArray`, byteSeparator, i, endIndex, "byte separator")
         }

         indexInLine++
         indexInGroup++
         i = checkContainsAt(`$this$hexToByteArray`, bytePrefix, i, endIndex, "byte prefix")
         checkHexLength(`$this$hexToByteArray`, i, RangesKt.coerceAtMost(i + 2, endIndex), 2, true)
         result[byteIndex++] = (byte)(decimalFromHexDigitAt(`$this$hexToByteArray`, i++) shl 4 or decimalFromHexDigitAt(`$this$hexToByteArray`, i++))
         i = checkContainsAt(`$this$hexToByteArray`, byteSuffix, i, endIndex, "byte suffix")
      }

      val var10000: ByteArray
      if (byteIndex == result.length) {
         var10000 = result
      } else {
         var10000 = Arrays.copyOf(result, byteIndex)
      }

      return var10000
   }
}

fun {
   var var0: Int = 0
   var `$this$HEX_DIGITS_TO_DECIMAL_u24lambda_u242`: IntArray = IntArray(128)

   while (var0 < 128) {
      `$this$HEX_DIGITS_TO_DECIMAL_u24lambda_u242`[var0] = -1
      var0++
   }

   `$this$HEX_DIGITS_TO_DECIMAL_u24lambda_u242` = `$this$HEX_DIGITS_TO_DECIMAL_u24lambda_u242`
   var `$this$forEachIndexed$iv`: java.lang.CharSequence = "0123456789abcdef"
   var `index$iv`: Int = 0
      `$this$forEachIndexed$iv` = "0123456789ABCDEF"
   `index$iv` = 0
      HEX_DIGITS_TO_DECIMAL = `$this$HEX_DIGITS_TO_DECIMAL_u24lambda_u242`
}

@SinceKotlin(version = "1.9")
@ExperimentalStdlibApi
public fun ByteArray.toHexString(startIndex: Int = 0, endIndex: Int = `$this$toHexString`.length, format: HexFormat = HexFormat.Companion.Default): String {
   AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(startIndex, endIndex, `$this$toHexString`.length)
   if (startIndex == endIndex) {
      return ""
   } else {
      val digits: java.lang.String = if (format.upperCase) "0123456789ABCDEF" else "0123456789abcdef"
      val bytesFormat: HexFormat.BytesHexFormat = format.bytes
      val bytesPerLine: Int = bytesFormat.bytesPerLine
      val bytesPerGroup: Int = bytesFormat.bytesPerGroup
      val bytePrefix: java.lang.String = bytesFormat.bytePrefix
      val byteSuffix: java.lang.String = bytesFormat.byteSuffix
      val byteSeparator: java.lang.String = bytesFormat.byteSeparator
      val groupSeparator: java.lang.String = bytesFormat.groupSeparator
      val formatLength: Int = formattedStringLength(
         endIndex - startIndex, bytesPerLine, bytesPerGroup, groupSeparator.length(), byteSeparator.length(), bytePrefix.length(), byteSuffix.length()
      )
      var indexInLine: Int = 0
      var indexInGroup: Int = 0
      val var15: StringBuilder = StringBuilder(formatLength)
      val `$this$toHexString_u24lambda_u243`: StringBuilder = var15

      for (i in startIndex..endIndex) {
         val var19: Int = `$this$toHexString`[i] and 255
         if (indexInLine == bytesPerLine) {
            `$this$toHexString_u24lambda_u243`.append('\n')
            indexInLine = 0
            indexInGroup = 0
         } else if (indexInGroup == bytesPerGroup) {
            `$this$toHexString_u24lambda_u243`.append(groupSeparator)
            indexInGroup = 0
         }

         if (indexInGroup != 0) {
            `$this$toHexString_u24lambda_u243`.append(byteSeparator)
         }

         `$this$toHexString_u24lambda_u243`.append(bytePrefix)
         `$this$toHexString_u24lambda_u243`.append(digits.charAt(var19 shr 4))
         `$this$toHexString_u24lambda_u243`.append(digits.charAt(var19 and 15))
         `$this$toHexString_u24lambda_u243`.append(byteSuffix)
         indexInGroup++
         indexInLine++
      }

      if (formatLength != `$this$toHexString_u24lambda_u243`.length()) {
         throw IllegalStateException("Check failed.".toString())
      } else {
         val var10000: java.lang.String = var15.toString()
         return var10000
      }
   }
}

internal fun parsedByteArrayMaxSize(
   stringLength: Int,
   bytesPerLine: Int,
   bytesPerGroup: Int,
   groupSeparatorLength: Int,
   byteSeparatorLength: Int,
   bytePrefixLength: Int,
   byteSuffixLength: Int
): Int {
   if (stringLength <= 0) {
      throw IllegalArgumentException("Failed requirement.".toString())
   } else {
      val var22: Long = bytePrefixLength + 2L + byteSuffixLength
      val charsPerGroup: Long = charsPerSet((long)bytePrefixLength + 2L + (long)byteSuffixLength, bytesPerGroup, byteSeparatorLength)
      val var10000: Long
      if (bytesPerLine <= bytesPerGroup) {
         var10000 = charsPerSet(var22, bytesPerLine, byteSeparatorLength)
      } else {
         var result: Long = charsPerSet(charsPerGroup, bytesPerLine / bytesPerGroup, groupSeparatorLength)
         val bytesPerLastGroupInLine: Int = bytesPerLine % bytesPerGroup
         if (bytesPerLine % bytesPerGroup != 0) {
            result = result + groupSeparatorLength + charsPerSet(var22, bytesPerLastGroupInLine, byteSeparatorLength)
         }

         var10000 = result
      }

      val var23: Long = stringLength
      val wholeLines: Long = wholeElementsPerSet((long)stringLength, var10000, 1)
      val var24: Long = stringLength - wholeLines * (var10000 + 1L)
      val wholeGroupsInLastLine: Long = wholeElementsPerSet(var23 - wholeLines * (var10000 + 1L), charsPerGroup, groupSeparatorLength)
      val wholeBytesInLastGroup: Long = wholeElementsPerSet(
         var24 - wholeGroupsInLastLine * (charsPerGroup + (long)groupSeparatorLength), var22, byteSeparatorLength
      )
      return (int)(
         wholeLines * bytesPerLine
            + wholeGroupsInLastLine * bytesPerGroup
            + wholeBytesInLastGroup
            + (
               if (var24 - wholeGroupsInLastLine * (charsPerGroup + groupSeparatorLength) - wholeBytesInLastGroup * (var22 + byteSeparatorLength) > 0L)
                  1
                  else
                  0
            )
      )
   }
}

@ExperimentalStdlibApi
private fun String.hexToByte(startIndex: Int = 0, endIndex: Int = `$this$hexToByte`.length(), format: HexFormat = HexFormat.Companion.Default): Byte {
   return (byte)hexToLongImpl(`$this$hexToByte`, startIndex, endIndex, format, 2)
}

@SinceKotlin(version = "1.9")
@ExperimentalStdlibApi
public fun ByteArray.toHexString(format: HexFormat = HexFormat.Companion.Default): String {
   return toHexString(`$this$toHexString`, 0, `$this$toHexString`.length, format)
}

private fun charsPerSet(charsPerElement: Long, elementsPerSet: Int, elementSeparatorLength: Int): Long {
   if (elementsPerSet <= 0) {
      throw IllegalArgumentException("Failed requirement.".toString())
   } else {
      return charsPerElement * elementsPerSet + elementSeparatorLength * (elementsPerSet - 1L)
   }
}

@ExperimentalStdlibApi
@SinceKotlin(version = "1.9")
public fun String.hexToByte(format: HexFormat = HexFormat.Companion.Default): Byte {
   return hexToByte(`$this$hexToByte`, 0, `$this$hexToByte`.length(), format)
}

@ExperimentalStdlibApi
private fun String.hexToLongImpl(startIndex: Int = 0, endIndex: Int = `$this$hexToLongImpl`.length(), format: HexFormat, maxDigits: Int): Long {
   AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(startIndex, endIndex, `$this$hexToLongImpl`.length())
   val prefix: java.lang.String = format.number.prefix
   val suffix: java.lang.String = format.number.suffix
   if (prefix.length() + suffix.length() >= endIndex - startIndex) {
      val var10002: StringBuilder = StringBuilder()
         .append("Expected a hexadecimal number with prefix \"")
         .append(prefix)
         .append("\" and suffix \"")
         .append(suffix)
         .append("\", but was ")
         val var10003: java.lang.String = `$this$hexToLongImpl`.substring(startIndex, endIndex)
      throw NumberFormatException(var10002.append(var10003).toString())
   } else {
      val digitsStartIndex: Int = checkContainsAt(`$this$hexToLongImpl`, prefix, startIndex, endIndex, "prefix")
      val digitsEndIndex: Int = endIndex - suffix.length()
      checkContainsAt(`$this$hexToLongImpl`, suffix, digitsEndIndex, endIndex, "suffix")
      checkHexLength(`$this$hexToLongImpl`, digitsStartIndex, digitsEndIndex, maxDigits, false)
      var result: Long = 0L

      for (i in digitsStartIndex..digitsEndIndex) {
         result = result shl 4 or decimalFromHexDigitAt(`$this$hexToLongImpl`, i)
      }

      return result
   }
}

private fun String.checkContainsAt(part: String, index: Int, endIndex: Int, partName: String): Int {
   val end: Int = index + part.length()
   if (end <= endIndex && StringsKt.regionMatches(`$this$checkContainsAt`, index, part, 0, part.length(), true)) {
      return end
   } else {
      val var10002: StringBuilder = StringBuilder()
         .append("Expected ")
         .append(partName)
         .append(" \"")
         .append(part)
         .append("\" at index ")
         .append(index)
         .append(", but was ")
         val var7: Int = RangesKt.coerceAtMost(end, endIndex)
      val var10003: java.lang.String = `$this$checkContainsAt`.substring(index, var7)
      throw NumberFormatException(var10002.append(var10003).toString())
   }
}

@ExperimentalStdlibApi
@SinceKotlin(version = "1.9")
public fun String.hexToByteArray(format: HexFormat = HexFormat.Companion.Default): ByteArray {
   return hexToByteArray(`$this$hexToByteArray`, 0, `$this$hexToByteArray`.length(), format)
}

@SinceKotlin(version = "1.9")
@ExperimentalStdlibApi
public fun Byte.toHexString(format: HexFormat = HexFormat.Companion.Default): String {
   return toHexStringImpl((long)`$this$toHexString`, format, 8)
}

internal fun formattedStringLength(
   totalBytes: Int,
   bytesPerLine: Int,
   bytesPerGroup: Int,
   groupSeparatorLength: Int,
   byteSeparatorLength: Int,
   bytePrefixLength: Int,
   byteSuffixLength: Int
): Int {
   if (totalBytes <= 0) {
      throw IllegalArgumentException("Failed requirement.".toString())
   } else {
      val var15: Int = (totalBytes + -1) / bytesPerLine
      val totalLength: Int = (bytesPerLine + -1) / bytesPerGroup
      val groupSeparators: Int = var15 * ((bytesPerLine + -1) / bytesPerGroup)
         + ((if (totalBytes % bytesPerLine == 0) bytesPerLine else totalBytes % bytesPerLine) - 1) / bytesPerGroup
         val var18: Long = var15
         + (long)(
               var15 * ((bytesPerLine + -1) / bytesPerGroup)
                  + ((if (totalBytes % bytesPerLine == 0) bytesPerLine else totalBytes % bytesPerLine) - 1) / bytesPerGroup
            )
            * groupSeparatorLength
         + (long)(
               totalBytes
                  + -1
                  - var15
                  - (
                     var15 * ((bytesPerLine + -1) / bytesPerGroup)
                        + ((if (totalBytes % bytesPerLine == 0) bytesPerLine else totalBytes % bytesPerLine) - 1) / bytesPerGroup
                  )
            )
            * byteSeparatorLength
         + totalBytes * (bytePrefixLength + 2L + byteSuffixLength)
         if (!RangesKt.intRangeContains(
         IntRange(0, Integer.MAX_VALUE),
         (long)((long)var15
            + (long)groupSeparators * (long)groupSeparatorLength
            + (long)(
                  totalBytes
                     + -1
                     - var15
                     - (var15 * totalLength + ((if (totalBytes % bytesPerLine == 0) bytesPerLine else totalBytes % bytesPerLine) - 1) / bytesPerGroup)
               )
               * (long)byteSeparatorLength
            + (long)totalBytes * ((long)bytePrefixLength + 2L + (long)byteSuffixLength))
      )) {
         throw IllegalArgumentException(
            "The resulting string length is too big: ${ULong.toString_impl/* $VF was: toString-impl */(
               ULong.constructor_impl/* $VF was: constructor-impl */(var18)
            )}"
         )
      } else {
         return (int)var18
      }
   }
}

@SinceKotlin(version = "1.9")
@ExperimentalStdlibApi
public fun Int.toHexString(format: HexFormat = HexFormat.Companion.Default): String {
   return toHexStringImpl((long)`$this$toHexString`, format, 32)
}

@ExperimentalStdlibApi
private fun String.hexToShort(startIndex: Int = 0, endIndex: Int = `$this$hexToShort`.length(), format: HexFormat = HexFormat.Companion.Default): Short {
   return (short)hexToLongImpl(`$this$hexToShort`, startIndex, endIndex, format, 4)
}

@ExperimentalStdlibApi
private fun Long.toHexStringImpl(format: HexFormat, bits: Int): String {
   if ((bits and 3) != 0) {
      throw IllegalArgumentException("Failed requirement.".toString())
   } else {
      val var16: java.lang.String = if (format.upperCase) "0123456789ABCDEF" else "0123456789abcdef"
      val value: Long = `$this$toHexStringImpl`
      val prefix: java.lang.String = format.number.prefix
      val suffix: java.lang.String = format.number.suffix
      val formatLength: Int = prefix.length() + (bits shr 2) + suffix.length()
      var var18: Boolean = format.number.removeLeadingZeros
      val var11: StringBuilder = StringBuilder(formatLength)
      val `$this$toHexStringImpl_u24lambda_u246`: StringBuilder = var11
      var11.append(prefix)
      var shift: Int = bits

      while (shift > 0) {
         shift -= 4
         val decimal: Int = (int)(value shr shift and 15L)
         var18 = var18 && (int)(value shr shift and 15L) == 0 && shift > 0
         if (!var18) {
            `$this$toHexStringImpl_u24lambda_u246`.append(var16.charAt(decimal))
         }
      }

      `$this$toHexStringImpl_u24lambda_u246`.append(suffix)
      val var10000: java.lang.String = var11.toString()
      return var10000
   }
}

private fun String.decimalFromHexDigitAt(index: Int): Int {
   val code: Int = `$this$decimalFromHexDigitAt`.charAt(index)
   if (code <= 127 && HEX_DIGITS_TO_DECIMAL[code] >= 0) {
      return HEX_DIGITS_TO_DECIMAL[code]
   } else {
      throw NumberFormatException("Expected a hexadecimal digit at index $index, but was ${`$this$decimalFromHexDigitAt`.charAt(index)}")
   }
}

@ExperimentalStdlibApi
@SinceKotlin(version = "1.9")
public fun Short.toHexString(format: HexFormat = HexFormat.Companion.Default): String {
   return toHexStringImpl((long)`$this$toHexString`, format, 16)
}

@ExperimentalStdlibApi
private fun String.hexToLong(startIndex: Int = 0, endIndex: Int = `$this$hexToLong`.length(), format: HexFormat = HexFormat.Companion.Default): Long {
   return hexToLongImpl(`$this$hexToLong`, startIndex, endIndex, format, 16)
}

private fun String.checkNewLineAt(index: Int, endIndex: Int): Int {
   val var10000: Int
   if (`$this$checkNewLineAt`.charAt(index) == '\r') {
      var10000 = if (index + 1 < endIndex && `$this$checkNewLineAt`.charAt(index + 1) == '\n') index + 2 else index + 1
   } else {
      if (`$this$checkNewLineAt`.charAt(index) != '\n') {
         throw NumberFormatException("Expected a new line at index $index, but was ${`$this$checkNewLineAt`.charAt(index)}")
      }

      var10000 = index + 1
   }

   return var10000
}
