@file:JvmMultifileClass
@file:JvmName("StringsKt")

package kotlin.text

import java.nio.ByteBuffer
import java.nio.CharBuffer
import java.nio.charset.Charset
import java.nio.charset.CodingErrorAction
import java.util.Arrays
import java.util.Comparator
import java.util.Locale
import java.util.regex.Pattern
import kotlin.String.Companion
import kotlin.internal.InlineOnly
import kotlin.internal.LowPriorityInOverloadResolution

// $VF: Compiled from StringsJVM.kt
@InlineOnly
internal inline fun String.nativeLastIndexOf(ch: Char, fromIndex: Int): Int {
   return `$this$nativeLastIndexOf`.lastIndexOf(ch, fromIndex)
}

@InlineOnly
public inline fun String.contentEquals(charSequence: CharSequence): Boolean {
   return `$this$contentEquals`.contentEquals(charSequence)
}

@InlineOnly
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public inline fun String.lowercase(): String {
   val var10000: java.lang.String = `$this$lowercase`.toLowerCase(Locale.ROOT)
   return var10000
}

public fun String.regionMatches(thisOffset: Int, other: String, otherOffset: Int, length: Int, ignoreCase: Boolean = false): Boolean {
   return if (!ignoreCase)
      `$this$regionMatches`.regionMatches(thisOffset, other, otherOffset, length)
      else
      `$this$regionMatches`.regionMatches(ignoreCase, thisOffset, other, otherOffset, length)
   }

public fun String.compareTo(other: String, ignoreCase: Boolean = false): Int {
   return if (ignoreCase) `$this$compareTo`.compareToIgnoreCase(other) else `$this$compareTo`.compareTo(other)
}

@InlineOnly
public inline fun Companion.format(format: String, vararg args: Any?): String {
   val var10000: java.lang.String = java.lang.String.format(format, Arrays.copyOf(args, args.length))
   return var10000
}

@InlineOnly
public inline fun String.substring(startIndex: Int, endIndex: Int): String {
   val var10000: java.lang.String = `$this$substring`.substring(startIndex, endIndex)
   return var10000
}

@InlineOnly
public inline fun String.toPattern(flags: Int = 0): Pattern {
   val var10000: Pattern = Pattern.compile(`$this$toPattern`, flags)
   return var10000
}

@InlineOnly
internal inline fun String.nativeLastIndexOf(str: String, fromIndex: Int): Int {
   return `$this$nativeLastIndexOf`.lastIndexOf(str, fromIndex)
}

@InlineOnly
public inline fun String.toCharArray(): CharArray {
   val var10000: CharArray = `$this$toCharArray`.toCharArray()
   return var10000
}

public fun String.replaceFirst(oldChar: Char, newChar: Char, ignoreCase: Boolean = false): String {
   val index: Int = StringsKt.indexOf$default(`$this$replaceFirst`, oldChar, 0, ignoreCase, 2, null)
   return if (index < 0) `$this$replaceFirst` else StringsKt.replaceRange(`$this$replaceFirst`, index, index + 1, java.lang.String.valueOf(newChar)).toString()
}

@InlineOnly
public inline fun String.offsetByCodePoints(index: Int, codePointOffset: Int): Int {
   return `$this$offsetByCodePoints`.offsetByCodePoints(index, codePointOffset)
}

@DeprecatedSinceKotlin(warningSince = "1.5")
@Deprecated(message = "Use replaceFirstChar instead.", replaceWith = @ReplaceWith(expression = "replaceFirstChar { it.lowercase(locale) }", imports = []))
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.4")
@LowPriorityInOverloadResolution
public fun String.decapitalize(locale: Locale): String {
   val var10000: java.lang.String
   if (`$this$decapitalize`.length() > 0 && !Character.isLowerCase(`$this$decapitalize`.charAt(0))) {
      val var8: StringBuilder = StringBuilder()
      var var10001: java.lang.String = `$this$decapitalize`.substring(0, 1)
      var10001 = var10001.toLowerCase(locale)
      val var9: StringBuilder = var8.append(var10001)
      var10001 = `$this$decapitalize`.substring(1)
      var10000 = var9.append(var10001).toString()
   } else {
      var10000 = `$this$decapitalize`
   }

   return var10000
}

@InlineOnly
public inline fun String(bytes: ByteArray, offset: Int, length: Int, charset: Charset): String {
   return java.lang.String(bytes, offset, length, charset)
}

@SinceKotlin(version = "1.5")
public fun CharSequence?.contentEquals(other: CharSequence?, ignoreCase: Boolean): Boolean {
   return if (ignoreCase)
      StringsKt.contentEqualsIgnoreCaseImpl(`$this$contentEquals`, other)
      else
      StringsKt.contentEquals((java.lang.CharSequence)`$this$contentEquals`, other)
   }

public fun String.replaceFirst(oldValue: String, newValue: String, ignoreCase: Boolean = false): String {
   val index: Int = StringsKt.indexOf$default(`$this$replaceFirst`, oldValue, 0, ignoreCase, 2, null)
   return if (index < 0) `$this$replaceFirst` else StringsKt.replaceRange(`$this$replaceFirst`, index, index + oldValue.length(), newValue).toString()
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun Companion.format(locale: Locale?, format: String, vararg args: Any?): String {
   val var10000: java.lang.String = java.lang.String.format(locale, format, Arrays.copyOf(args, args.length))
   return var10000
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.4")
public fun ByteArray.decodeToString(): String {
   return java.lang.String(`$this$decodeToString`, Charsets.UTF_8)
}

@DeprecatedSinceKotlin(warningSince = "1.5")
@Deprecated(message = "Use uppercase() instead.", replaceWith = @ReplaceWith(expression = "uppercase(Locale.getDefault())", imports = ["java.util.Locale"]))
@InlineOnly
public inline fun String.toUpperCase(): String {
   val var10000: java.lang.String = `$this$toUpperCase`.toUpperCase()
   return var10000
}

@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public fun CharArray.concatToString(): String {
   return java.lang.String(`$this$concatToString`)
}

public fun CharSequence.regionMatches(thisOffset: Int, other: CharSequence, otherOffset: Int, length: Int, ignoreCase: Boolean = false): Boolean {
   return if (`$this$regionMatches` is java.lang.String && other is java.lang.String)
      StringsKt.regionMatches(`$this$regionMatches` as java.lang.String, thisOffset, other as java.lang.String, otherOffset, length, ignoreCase)
      else
      StringsKt.regionMatchesImpl(`$this$regionMatches`, thisOffset, other, otherOffset, length, ignoreCase)
   }

@Deprecated(message = "Use lowercase() instead.", replaceWith = @ReplaceWith(expression = "lowercase(Locale.getDefault())", imports = ["java.util.Locale"]))
@DeprecatedSinceKotlin(warningSince = "1.5")
@InlineOnly
public inline fun String.toLowerCase(): String {
   val var10000: java.lang.String = `$this$toLowerCase`.toLowerCase()
   return var10000
}

@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public fun String.toCharArray(startIndex: Int = 0, endIndex: Int = `$this$toCharArray`.length()): CharArray {
   AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(startIndex, endIndex, `$this$toCharArray`.length())
   val var4: CharArray = CharArray(endIndex - startIndex)
   `$this$toCharArray`.getChars(startIndex, endIndex, var4, 0)
   return var4
}

public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = false): String {
   val `$this$replace_u24lambda_u242`: java.lang.String = `$this$replace`
   var occurrenceIndex: Int = StringsKt.indexOf(`$this$replace`, oldValue, 0, ignoreCase)
   if (occurrenceIndex < 0) {
      return `$this$replace`
   } else {
      val oldValueLength: Int = oldValue.length()
      val searchStep: Int = RangesKt.coerceAtLeast(oldValueLength, 1)
      val newLengthHint: Int = `$this$replace`.length() - oldValueLength + newValue.length()
      if (newLengthHint < 0) {
         throw OutOfMemoryError()
      } else {
         val stringBuilder: StringBuilder = StringBuilder(newLengthHint)
         var i: Int = 0

         do {
            stringBuilder.append(`$this$replace_u24lambda_u242`, i, occurrenceIndex).append(newValue)
            i = occurrenceIndex + oldValueLength
            if (occurrenceIndex >= `$this$replace_u24lambda_u242`.length()) {
               break
            }

            occurrenceIndex = StringsKt.indexOf(`$this$replace_u24lambda_u242`, oldValue, occurrenceIndex + searchStep, ignoreCase)
         } while (occurrenceIndex > 0)

         val var10000: java.lang.String = stringBuilder.append(`$this$replace_u24lambda_u242`, i, `$this$replace_u24lambda_u242`.length()).toString()
         return var10000
      }
   }
}

public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = false): String {
   if (!ignoreCase) {
      val var14: java.lang.String = `$this$replace`.replace(oldChar, newChar)
      return var14
   } else {
      val var5: StringBuilder = StringBuilder(`$this$replace`.length())
      val `$this$replace_u24lambda_u241`: StringBuilder = var5
      val `$this$forEach$iv`: java.lang.CharSequence = `$this$replace`
            val var10000: java.lang.String = var5.toString()
      return var10000
   }
}

@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun String.format(locale: Locale?, vararg args: Any?): String {
   val var10000: java.lang.String = java.lang.String.format(locale, `$this$format`, Arrays.copyOf(args, args.length))
   return var10000
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.4")
public fun CharArray.concatToString(startIndex: Int = 0, endIndex: Int = `$this$concatToString`.length): String {
   AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(startIndex, endIndex, `$this$concatToString`.length)
   return java.lang.String(`$this$concatToString`, startIndex, endIndex - startIndex)
}

@InlineOnly
public inline fun String(chars: CharArray, offset: Int, length: Int): String {
   return java.lang.String(chars, offset, length)
}

@InlineOnly
public inline fun String.intern(): String {
   val var10000: java.lang.String = `$this$intern`.intern()
   return var10000
}

@InlineOnly
public inline fun String(bytes: ByteArray, offset: Int, length: Int): String {
   return java.lang.String(bytes, offset, length, Charsets.UTF_8)
}

public fun CharSequence.split(regex: Pattern, limit: Int = 0): List<String> {
   StringsKt.requireNonNegativeLimit(limit)
   val var10000: Array<java.lang.String> = regex.split(`$this$split`, if (limit == 0) -1 else limit)
   return ArraysKt.asList(var10000)
}

@InlineOnly
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public inline fun String.lowercase(locale: Locale): String {
   val var10000: java.lang.String = `$this$lowercase`.toLowerCase(locale)
   return var10000
}

public fun String.startsWith(prefix: String, startIndex: Int, ignoreCase: Boolean = false): Boolean {
   return if (!ignoreCase)
      `$this$startsWith`.startsWith(prefix, startIndex)
      else
      StringsKt.regionMatches(`$this$startsWith`, startIndex, prefix, 0, prefix.length(), ignoreCase)
   }

@DeprecatedSinceKotlin(warningSince = "1.5")
@Deprecated(message = "Use lowercase() instead.", replaceWith = @ReplaceWith(expression = "lowercase(locale)", imports = []))
@InlineOnly
public inline fun String.toLowerCase(locale: Locale): String {
   val var10000: java.lang.String = `$this$toLowerCase`.toLowerCase(locale)
   return var10000
}

public fun String.endsWith(suffix: String, ignoreCase: Boolean = false): Boolean {
   return if (!ignoreCase)
      `$this$endsWith`.endsWith(suffix)
      else
      StringsKt.regionMatches(`$this$endsWith`, `$this$endsWith`.length() - suffix.length(), suffix, 0, suffix.length(), true)
   }

public fun String?.equals(other: String?, ignoreCase: Boolean = false): Boolean {
   if (`$this$equals` == null) {
      return other == null
   } else {
      return if (!ignoreCase) `$this$equals`.equals(other) else `$this$equals`.equalsIgnoreCase(other)
   }
}

public fun CharSequence.isBlank(): Boolean {
   if (`$this$isBlank`.length() != 0) {
      val `$this$all$iv`: java.lang.Iterable = StringsKt.getIndices(`$this$isBlank`)
      var var10000: Boolean
      if (`$this$all$iv` is java.util.Collection && (`$this$all$iv` as java.util.Collection).isEmpty()) {
         var10000 = true
      } else {
         val var3: java.util.Iterator = `$this$all$iv`.iterator()

         while (true) {
            if (!var3.hasNext()) {
               var10000 = true
               break
            }

            if (!CharsKt.isWhitespace(`$this$isBlank`.charAt((var3 as IntIterator).nextInt()))) {
               var10000 = false
               break
            }
         }
      }

      if (!var10000) {
         return false
      }
   }

   return true
}

@InlineOnly
public inline fun String.codePointAt(index: Int): Int {
   return `$this$codePointAt`.codePointAt(index)
}

@InlineOnly
public inline fun String(stringBuffer: StringBuffer): String {
   return java.lang.String(stringBuffer)
}

@InlineOnly
public inline fun String(stringBuilder: StringBuilder): String {
   return java.lang.String(stringBuilder)
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.4")
public fun ByteArray.decodeToString(startIndex: Int = 0, endIndex: Int = `$this$decodeToString`.length, throwOnInvalidSequence: Boolean = false): String {
   AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(startIndex, endIndex, `$this$decodeToString`.length)
   if (!throwOnInvalidSequence) {
      return java.lang.String(`$this$decodeToString`, startIndex, endIndex - startIndex, Charsets.UTF_8)
   } else {
      val var10000: java.lang.String = Charsets.UTF_8
         .newDecoder()
         .onMalformedInput(CodingErrorAction.REPORT)
         .onUnmappableCharacter(CodingErrorAction.REPORT)
         .decode(ByteBuffer.wrap(`$this$decodeToString`, startIndex, endIndex - startIndex))
         .toString()
         return var10000
   }
}

public final val CASE_INSENSITIVE_ORDER: Comparator<String>
   public final get() {
      val var10000: Comparator = java.lang.String.CASE_INSENSITIVE_ORDER
      return var10000
   }


@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.4")
public fun String.encodeToByteArray(startIndex: Int = 0, endIndex: Int = `$this$encodeToByteArray`.length(), throwOnInvalidSequence: Boolean = false): ByteArray {
   AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(startIndex, endIndex, `$this$encodeToByteArray`.length())
   if (!throwOnInvalidSequence) {
      val var13: java.lang.String = `$this$encodeToByteArray`.substring(startIndex, endIndex)
      val var10: Charset = Charsets.UTF_8
      val var14: ByteArray = var13.getBytes(var10)
      return var14
   } else {
      val byteBuffer: ByteBuffer = Charsets.UTF_8
         .newEncoder()
         .onMalformedInput(CodingErrorAction.REPORT)
         .onUnmappableCharacter(CodingErrorAction.REPORT)
         .encode(CharBuffer.wrap(`$this$encodeToByteArray`, startIndex, endIndex))
         if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
         val var10000: Int = byteBuffer.remaining()
         val var10001: ByteArray = byteBuffer.array()
         if (var10000 == var10001.length) {
            val var11: ByteArray = byteBuffer.array()
            return var11
         }
      }

      val var6: ByteArray = ByteArray(byteBuffer.remaining())
      byteBuffer.get(var6)
      return var6
   }
}

public fun String.startsWith(prefix: String, ignoreCase: Boolean = false): Boolean {
   return if (!ignoreCase) `$this$startsWith`.startsWith(prefix) else StringsKt.regionMatches(`$this$startsWith`, 0, prefix, 0, prefix.length(), ignoreCase)
}

@Deprecated(message = "Use replaceFirstChar instead.", replaceWith = @ReplaceWith(expression = "replaceFirstChar { it.lowercase(Locale.getDefault()) }", imports = ["java.util.Locale"]))
@DeprecatedSinceKotlin(warningSince = "1.5")
public fun String.decapitalize(): String {
   val var10000: java.lang.String
   if (`$this$decapitalize`.length() > 0 && !Character.isLowerCase(`$this$decapitalize`.charAt(0))) {
      val var7: StringBuilder = StringBuilder()
      var var10001: java.lang.String = `$this$decapitalize`.substring(0, 1)
      var10001 = var10001.toLowerCase()
      val var8: StringBuilder = var7.append(var10001)
      var10001 = `$this$decapitalize`.substring(1)
      var10000 = var8.append(var10001).toString()
   } else {
      var10000 = `$this$decapitalize`
   }

   return var10000
}

public fun CharSequence.repeat(n: Int): String {
   if (n < 0) {
      throw IllegalArgumentException(("Count 'n' must be non-negative, but was $n.").toString())
   } else {
      var var10000: java.lang.String
      when (n) {
         0 -> var10000 = ""
         1 -> var10000 = `$this$repeat`.toString()
         else -> {
            when (`$this$repeat`.length()) {
               0 -> var10000 = ""
               1 -> {
                  val var12: Char = `$this$repeat`.charAt(0)
                  var var14: Int = 0
                  val var8: CharArray = CharArray(n)

                  while (var14 < n) {
                     var8[var14] = var12
                     var14++
                  }

                  var10000 = java.lang.String(var8)
                  break
               }
               else -> {
                  val sb: StringBuilder = StringBuilder(n * `$this$repeat`.length())
                  val var6: IntIterator = IntRange(1, n).iterator()

                  while (var6.hasNext()) {
                     val i: Int = var6.nextInt()
                     sb.append(`$this$repeat`)
                  }

                  val var4: java.lang.String = sb.toString()
                  var10000 = var4
               }
            }
         }
      }

      return var10000
   }
}

@InlineOnly
public inline fun String.contentEquals(stringBuilder: StringBuffer): Boolean {
   return `$this$contentEquals`.contentEquals(stringBuilder)
}

@InlineOnly
public inline fun String.codePointCount(beginIndex: Int, endIndex: Int): Int {
   return `$this$codePointCount`.codePointCount(beginIndex, endIndex)
}

@InlineOnly
public inline fun String(chars: CharArray): String {
   return java.lang.String(chars)
}

@InlineOnly
public inline fun String(bytes: ByteArray): String {
   return java.lang.String(bytes, Charsets.UTF_8)
}

@InlineOnly
public inline fun String.format(vararg args: Any?): String {
   val var10000: java.lang.String = java.lang.String.format(`$this$format`, Arrays.copyOf(args, args.length))
   return var10000
}

open fun StringsKt__StringsJVMKt() {
}

@DeprecatedSinceKotlin(warningSince = "1.5")
@Deprecated(message = "Use replaceFirstChar instead.", replaceWith = @ReplaceWith(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(locale) else it.toString() }", imports = []))
@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@LowPriorityInOverloadResolution
public fun String.capitalize(locale: Locale): String {
   if (`$this$capitalize`.length() > 0) {
      val firstChar: Char = `$this$capitalize`.charAt(0)
      if (Character.isLowerCase(firstChar)) {
         val var3: StringBuilder = StringBuilder()
         val titleChar: Char = Character.toTitleCase(firstChar)
         if (titleChar != Character.toUpperCase(firstChar)) {
            var3.append(titleChar)
         } else {
            var var10001: java.lang.String = `$this$capitalize`.substring(0, 1)
            var10001 = var10001.toUpperCase(locale)
            var3.append(var10001)
         }

         val var14: java.lang.String = `$this$capitalize`.substring(1)
         var3.append(var14)
         val var10000: java.lang.String = var3.toString()
         return var10000
      }
   }

   return `$this$capitalize`
}

@InlineOnly
public inline fun String(codePoints: IntArray, offset: Int, length: Int): String {
   return java.lang.String(codePoints, offset, length)
}

@SinceKotlin(version = "1.5")
public infix fun CharSequence?.contentEquals(other: CharSequence?): Boolean {
   return if (`$this$contentEquals` is java.lang.String && other != null)
      (`$this$contentEquals` as java.lang.String).contentEquals(other)
      else
      StringsKt.contentEqualsImpl(`$this$contentEquals`, other)
   }

@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public fun String.encodeToByteArray(): ByteArray {
   val var10000: ByteArray = `$this$encodeToByteArray`.getBytes(Charsets.UTF_8)
   return var10000
}

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@InlineOnly
public inline fun String.uppercase(): String {
   val var10000: java.lang.String = `$this$uppercase`.toUpperCase(Locale.ROOT)
   return var10000
}

@InlineOnly
public inline fun String.codePointBefore(index: Int): Int {
   return `$this$codePointBefore`.codePointBefore(index)
}

@InlineOnly
public inline fun String.toByteArray(charset: Charset = Charsets.UTF_8): ByteArray {
   val var10000: ByteArray = `$this$toByteArray`.getBytes(charset)
   return var10000
}

@InlineOnly
public inline fun String.substring(startIndex: Int): String {
   val var10000: java.lang.String = `$this$substring`.substring(startIndex)
   return var10000
}

@InlineOnly
internal inline fun String.nativeIndexOf(str: String, fromIndex: Int): Int {
   return `$this$nativeIndexOf`.indexOf(str, fromIndex)
}

@Deprecated(message = "Use uppercase() instead.", replaceWith = @ReplaceWith(expression = "uppercase(locale)", imports = []))
@DeprecatedSinceKotlin(warningSince = "1.5")
@InlineOnly
public inline fun String.toUpperCase(locale: Locale): String {
   val var10000: java.lang.String = `$this$toUpperCase`.toUpperCase(locale)
   return var10000
}

@InlineOnly
internal inline fun String.nativeIndexOf(ch: Char, fromIndex: Int): Int {
   return `$this$nativeIndexOf`.indexOf(ch, fromIndex)
}

@InlineOnly
public inline fun String.toCharArray(destination: CharArray, destinationOffset: Int = 0, startIndex: Int = 0, endIndex: Int = `$this$toCharArray`.length()): CharArray {
   `$this$toCharArray`.getChars(startIndex, endIndex, destination, destinationOffset)
   return destination
}

@Deprecated(message = "Use replaceFirstChar instead.", replaceWith = @ReplaceWith(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }", imports = ["java.util.Locale"]))
@DeprecatedSinceKotlin(warningSince = "1.5")
public fun String.capitalize(): String {
   val var10001: Locale = Locale.getDefault()
   return StringsKt.capitalize(`$this$capitalize`, var10001)
}

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@InlineOnly
public inline fun String.uppercase(locale: Locale): String {
   val var10000: java.lang.String = `$this$uppercase`.toUpperCase(locale)
   return var10000
}

@InlineOnly
public inline fun String(bytes: ByteArray, charset: Charset): String {
   return java.lang.String(bytes, charset)
}
