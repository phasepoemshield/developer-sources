@file:JvmMultifileClass
@file:JvmName("StringsKt")

package kotlin.text

import java.util.ArrayList
import kotlin.internal.InlineOnly
import kotlin.jvm.functions.Function1

// $VF: Compiled from Strings.kt
public fun CharSequence.indexOfAny(chars: CharArray, startIndex: Int = 0, ignoreCase: Boolean = false): Int {
   if (!ignoreCase && chars.length == 1 && `$this$indexOfAny` is java.lang.String) {
      return (`$this$indexOfAny` as java.lang.String).indexOf(ArraysKt.single(chars), startIndex)
   } else {
      val var4: IntIterator = IntRange(RangesKt.coerceAtLeast(startIndex, 0), StringsKt.getLastIndex(`$this$indexOfAny`)).iterator()

      while (var4.hasNext()) {
         val index: Int = var4.nextInt()
         val charAtIndex: Char = `$this$indexOfAny`.charAt(index)
         val `$this$any$iv`: CharArray = chars
         var var9: Int = 0
         val var10: Int = chars.length

         var var10000: Boolean
         while (true) {
            if (var9 >= var10) {
               var10000 = false
               break
            }

            if (CharsKt.equals(`$this$any$iv`[var9], charAtIndex, ignoreCase)) {
               var10000 = true
               break
            }

            var9++
         }

         if (var10000) {
            return index
         }
      }

      return -1
   }
}

@SinceKotlin(version = "1.5")
public fun String.toBooleanStrictOrNull(): Boolean? {
   return if (`$this$toBooleanStrictOrNull` == "true") true else (if (`$this$toBooleanStrictOrNull` == "false") false else null)
}

@InlineOnly
public inline fun String?.orEmpty(): String {
   var var10000: java.lang.String = `$this$orEmpty`
   if (`$this$orEmpty` == null) {
      var10000 = ""
   }

   return var10000
}

public fun CharSequence.padEnd(length: Int, padChar: Char = 32): CharSequence {
   if (length < 0) {
      throw IllegalArgumentException("Desired length $length is less than zero.")
   } else if (length <= `$this$padEnd`.length()) {
      return `$this$padEnd`.subSequence(0, `$this$padEnd`.length())
   } else {
      val sb: StringBuilder = StringBuilder(length)
      sb.append(`$this$padEnd`)
      val var4: IntIterator = IntRange(1, length - `$this$padEnd`.length()).iterator()

      while (var4.hasNext()) {
         val i: Int = var4.nextInt()
         sb.append(padChar)
      }

      return sb
   }
}

public fun CharSequence.lastIndexOf(string: String, startIndex: Int = StringsKt.getLastIndex(`$this$lastIndexOf`), ignoreCase: Boolean = false): Int {
   return if (!ignoreCase && `$this$lastIndexOf` is java.lang.String)
      (`$this$lastIndexOf` as java.lang.String).lastIndexOf(string, startIndex)
      else
      indexOf$StringsKt__StringsKt(`$this$lastIndexOf`, string, startIndex, 0, ignoreCase, true)
   }

public fun CharSequence.commonPrefixWith(other: CharSequence, ignoreCase: Boolean = false): String {
   val shortestLength: Int = Math.min(`$this$commonPrefixWith`.length(), other.length())
   var i: Int = 0

   while (i < shortestLength && CharsKt.equals(`$this$commonPrefixWith`.charAt(i), other.charAt(i), ignoreCase)) {
      i++
   }

   if (StringsKt.hasSurrogatePairAt(`$this$commonPrefixWith`, i - 1) || StringsKt.hasSurrogatePairAt(other, i - 1)) {
      i--
   }

   return `$this$commonPrefixWith`.subSequence(0, i).toString()
}

public fun CharSequence.startsWith(prefix: CharSequence, ignoreCase: Boolean = false): Boolean {
   return if (!ignoreCase && `$this$startsWith` is java.lang.String && prefix is java.lang.String)
      StringsKt.startsWith$default(`$this$startsWith` as java.lang.String, prefix as java.lang.String, false, 2, null)
      else
      StringsKt.regionMatchesImpl(`$this$startsWith`, 0, prefix, 0, prefix.length(), ignoreCase)
   }

@InlineOnly
public inline fun CharSequence.replaceFirst(regex: Regex, replacement: String): String {
   return regex.replaceFirst(`$this$replaceFirst`, replacement)
}

@InlineOnly
public inline fun String.removeRange(startIndex: Int, endIndex: Int): String {
   return StringsKt.removeRange((java.lang.CharSequence)`$this$removeRange`, startIndex, endIndex).toString()
}

public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = false): Boolean {
   return if (other is java.lang.String)
      StringsKt.indexOf$default(`$this$contains`, other as java.lang.String, 0, ignoreCase, 2, null) >= 0
      else
      indexOf$StringsKt__StringsKt$default(`$this$contains`, other, 0, `$this$contains`.length(), ignoreCase, false, 16, null) >= 0
   }

public fun String.substringBefore(delimiter: Char, missingDelimiterValue: String = `$this$substringBefore`): String {
   val index: Int = StringsKt.indexOf$default(`$this$substringBefore`, delimiter, 0, false, 6, null)
   val var10000: java.lang.String
   if (index == -1) {
      var10000 = missingDelimiterValue
   } else {
      var10000 = `$this$substringBefore`.substring(0, index)
   }

   return var10000
}

public inline fun CharSequence.trimStart(predicate: (Char) -> Boolean): CharSequence {
   var index: Int = 0

   for (var4 in `$this$trimStart`.length()..index) {
      if (!predicate(`$this$trimStart`.charAt(index)) as java.lang.Boolean) {
         return `$this$trimStart`.subSequence(index, `$this$trimStart`.length())
      }
   }

   return ""
}

public fun String.substringAfterLast(delimiter: Char, missingDelimiterValue: String = `$this$substringAfterLast`): String {
   val index: Int = StringsKt.lastIndexOf$default(`$this$substringAfterLast`, delimiter, 0, false, 6, null)
   val var10000: java.lang.String
   if (index == -1) {
      var10000 = missingDelimiterValue
   } else {
      var10000 = `$this$substringAfterLast`.substring(index + 1, `$this$substringAfterLast`.length())
   }

   return var10000
}

public fun CharSequence.trimStart(chars: CharArray): CharSequence {
   val `$this$trimStart$iv`: java.lang.CharSequence = `$this$trimStart`
   var `index$iv`: Int = 0
   val var5: Int = `$this$trimStart`.length()

   var var10000: java.lang.CharSequence
   while (true) {
      if (`index$iv` >= var5) {
         var10000 = ""
         break
      }

      if (!ArraysKt.contains(chars, `$this$trimStart$iv`.charAt(`index$iv`))) {
         var10000 = `$this$trimStart$iv`.subSequence(`index$iv`, `$this$trimStart$iv`.length())
         break
      }

      `index$iv`++
   }

   return var10000
}

public fun CharSequence.removeRange(startIndex: Int, endIndex: Int): CharSequence {
   if (endIndex < startIndex) {
      throw IndexOutOfBoundsException("End index ($endIndex) is less than start index ($startIndex).")
   } else if (endIndex == startIndex) {
      return `$this$removeRange`.subSequence(0, `$this$removeRange`.length())
   } else {
      val sb: StringBuilder = StringBuilder(`$this$removeRange`.length() - (endIndex - startIndex))
      return sb
   }
}

public fun String.removeSuffix(suffix: CharSequence): String {
   if (StringsKt.endsWith$default((java.lang.CharSequence)`$this$removeSuffix`, (java.lang.CharSequence)suffix, false, 2, null)) {
      val var10000: java.lang.String = `$this$removeSuffix`.substring(0, `$this$removeSuffix`.length() - suffix.length())
      return var10000
   } else {
      return `$this$removeSuffix`
   }
}

public final val lastIndex: Int
   public final get() {
      return `$this$lastIndex`.length() - 1
   }


@InlineOnly
public inline fun CharSequence?.isNullOrBlank(): Boolean {
   contract {
      returns(false) implies (this != null)
   }

   return `$this$isNullOrBlank` == null || StringsKt.isBlank(`$this$isNullOrBlank`)
}

public fun CharSequence.trimEnd(): CharSequence {
   val `$this$trimEnd$iv`: java.lang.CharSequence = `$this$trimEnd`
   var var3: Int = `$this$trimEnd`.length() + -1
   if (0 <= var3) {
      do {
         val `index$iv`: Int = var3--
         if (!CharsKt.isWhitespace(`$this$trimEnd$iv`.charAt(`index$iv`))) {
            return `$this$trimEnd$iv`.subSequence(0, `index$iv` + 1)
         }
      } while (0 <= var3)
   }

   return ""
}

public inline fun CharSequence.trimEnd(predicate: (Char) -> Boolean): CharSequence {
   var var3: Int = `$this$trimEnd`.length() + -1
   if (0 <= var3) {
      do {
         val index: Int = var3--
         if (!predicate(`$this$trimEnd`.charAt(index)) as java.lang.Boolean) {
            return `$this$trimEnd`.subSequence(0, index + 1)
         }
      } while (0 <= var3)
   }

   return ""
}

public fun String.substringBefore(delimiter: String, missingDelimiterValue: String = `$this$substringBefore`): String {
   val index: Int = StringsKt.indexOf$default(`$this$substringBefore`, delimiter, 0, false, 6, null)
   val var10000: java.lang.String
   if (index == -1) {
      var10000 = missingDelimiterValue
   } else {
      var10000 = `$this$substringBefore`.substring(0, index)
   }

   return var10000
}

internal fun CharSequence?.contentEqualsImpl(other: CharSequence?): Boolean {
   if (`$this$contentEqualsImpl` is java.lang.String && other is java.lang.String) {
      return `$this$contentEqualsImpl` == other
   } else if (`$this$contentEqualsImpl` === other) {
      return true
   } else if (`$this$contentEqualsImpl` != null && other != null && `$this$contentEqualsImpl`.length() == other.length()) {
      var i: Int = 0

      for (var3 in `$this$contentEqualsImpl`.length()..i) {
         if (`$this$contentEqualsImpl`.charAt(i) != other.charAt(i)) {
            return false
         }
      }

      return true
   } else {
      return false
   }
}

public fun String.substringAfter(delimiter: Char, missingDelimiterValue: String = `$this$substringAfter`): String {
   val index: Int = StringsKt.indexOf$default(`$this$substringAfter`, delimiter, 0, false, 6, null)
   val var10000: java.lang.String
   if (index == -1) {
      var10000 = missingDelimiterValue
   } else {
      var10000 = `$this$substringAfter`.substring(index + 1, `$this$substringAfter`.length())
   }

   return var10000
}

public fun CharSequence.endsWith(suffix: CharSequence, ignoreCase: Boolean = false): Boolean {
   return if (!ignoreCase && `$this$endsWith` is java.lang.String && suffix is java.lang.String)
      StringsKt.endsWith$default(`$this$endsWith` as java.lang.String, suffix as java.lang.String, false, 2, null)
      else
      StringsKt.regionMatchesImpl(`$this$endsWith`, `$this$endsWith`.length() - suffix.length(), suffix, 0, suffix.length(), ignoreCase)
   }

@InlineOnly
public inline fun String.trim(): String {
   return StringsKt.trim(`$this$trim`).toString()
}

@Deprecated(message = "Use parameters named startIndex and endIndex.", replaceWith = @ReplaceWith(expression = "subSequence(startIndex = start, endIndex = end)", imports = []))
@InlineOnly
public inline fun String.subSequence(start: Int, end: Int): CharSequence {
   return `$this$subSequence`.subSequence(start, end)
}

@InlineOnly
public inline fun CharSequence.substring(startIndex: Int, endIndex: Int = `$this$substring`.length()): String {
   return `$this$substring`.subSequence(startIndex, endIndex).toString()
}

public fun CharSequence.indexOf(char: Char, startIndex: Int = 0, ignoreCase: Boolean = false): Int {
   return if (!ignoreCase && `$this$indexOf` is java.lang.String)
      (`$this$indexOf` as java.lang.String).indexOf(char, startIndex)
      else
      StringsKt.indexOfAny(`$this$indexOf`, charArrayOf(char), startIndex, ignoreCase)
   }

@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun <C, R> Any.ifEmpty(defaultValue: () -> Any): Any where C : CharSequence, C : Any {
   return (R)(if (`$this$ifEmpty`.length() == 0) defaultValue() else `$this$ifEmpty`)
}

public fun CharSequence.indexOfAny(strings: Collection<String>, startIndex: Int = 0, ignoreCase: Boolean = false): Int {
   val var10000: Pair = findAnyOf$StringsKt__StringsKt(`$this$indexOfAny`, strings, startIndex, ignoreCase, false)
   return if (var10000 != null) (var10000.first as java.lang.Number).intValue() else -1
}

public fun CharSequence.split(vararg delimiters: String, ignoreCase: Boolean = false, limit: Int = 0): List<String> {
   if (delimiters.length == 1) {
      val `$this$map$iv`: java.lang.String = delimiters[0]
      if (delimiters[0].length() != 0) {
         return split$StringsKt__StringsKt(`$this$split`, `$this$map$iv`, ignoreCase, limit)
      }
   }

   val var14: java.lang.Iterable = SequencesKt.asIterable(
      rangesDelimitedBy$StringsKt__StringsKt$default(`$this$split`, delimiters, 0, ignoreCase, limit, 2, null)
   )
   val `destination$iv$iv`: java.util.Collection = ArrayList(CollectionsKt.collectionSizeOrDefault(var14, 10))

   for (`item$iv$iv` in var14) {
      `destination$iv$iv`.add(StringsKt.substring((java.lang.CharSequence)`$this$split`, `item$iv$iv` as IntRange))
   }

   return `destination$iv$iv` as MutableList<java.lang.String>
}

@InlineOnly
public inline fun CharSequence.isNotBlank(): Boolean {
   return !StringsKt.isBlank(`$this$isNotBlank`)
}

public fun CharSequence.startsWith(char: Char, ignoreCase: Boolean = false): Boolean {
   return `$this$startsWith`.length() > 0 && CharsKt.equals(`$this$startsWith`.charAt(0), ignoreCase, ignoreCase)
}

public fun String.substringBeforeLast(delimiter: Char, missingDelimiterValue: String = `$this$substringBeforeLast`): String {
   val index: Int = StringsKt.lastIndexOf$default(`$this$substringBeforeLast`, delimiter, 0, false, 6, null)
   val var10000: java.lang.String
   if (index == -1) {
      var10000 = missingDelimiterValue
   } else {
      var10000 = `$this$substringBeforeLast`.substring(0, index)
   }

   return var10000
}

private fun CharSequence.split(delimiter: String, ignoreCase: Boolean, limit: Int): List<String> {
   StringsKt.requireNonNegativeLimit(limit)
   var currentOffset: Int = 0
   var nextIndex: Int = StringsKt.indexOf(`$this$split`, delimiter, 0, ignoreCase)
   if (nextIndex != -1 && limit != 1) {
      val isLimited: Boolean = limit > 0
      val result: ArrayList = ArrayList(if (limit > 0) RangesKt.coerceAtMost(limit, 10) else 10)

      do {
         result.add(`$this$split`.subSequence(currentOffset, nextIndex).toString())
         currentOffset = nextIndex + delimiter.length()
         if (isLimited && result.size() == limit + -1) {
            break
         }

         nextIndex = StringsKt.indexOf(`$this$split`, delimiter, currentOffset, ignoreCase)
      } while (nextIndex != -1)

      result.add(`$this$split`.subSequence(currentOffset, `$this$split`.length()).toString())
      return result
   } else {
      return CollectionsKt.listOf(`$this$split`.toString())
   }
}

public inline fun String.trimEnd(predicate: (Char) -> Boolean): String {
   val `$this$trimEnd$iv`: java.lang.CharSequence = `$this$trimEnd`
   var var5: Int = `$this$trimEnd`.length() + -1
   if (0 <= var5) {
      do {
         val `index$iv`: Int = var5--
         if (!predicate(`$this$trimEnd$iv`.charAt(`index$iv`)) as java.lang.Boolean) {
            return `$this$trimEnd$iv`.subSequence(0, `index$iv` + 1).toString()
         }
      } while (0 <= var5)
   }

   return "".toString()
}

public operator fun CharSequence.contains(char: Char, ignoreCase: Boolean = false): Boolean {
   return StringsKt.indexOf$default(`$this$contains`, `$this$contains1`, 0, ignoreCase, 2, null) >= 0
}

public fun CharSequence.indexOf(string: String, startIndex: Int = 0, ignoreCase: Boolean = false): Int {
   return if (!ignoreCase && `$this$indexOf` is java.lang.String)
      (`$this$indexOf` as java.lang.String).indexOf(string, startIndex)
      else
      indexOf$StringsKt__StringsKt$default(`$this$indexOf`, string, startIndex, `$this$indexOf`.length(), ignoreCase, false, 16, null)
   }

public fun CharSequence.trimEnd(chars: CharArray): CharSequence {
   val `$this$trimEnd$iv`: java.lang.CharSequence = `$this$trimEnd`
   var var4: Int = `$this$trimEnd`.length() + -1
   if (0 <= var4) {
      do {
         val `index$iv`: Int = var4--
         if (!ArraysKt.contains(chars, `$this$trimEnd$iv`.charAt(`index$iv`))) {
            return `$this$trimEnd$iv`.subSequence(0, `index$iv` + 1)
         }
      } while (0 <= var4)
   }

   return ""
}

public fun CharSequence.trim(chars: CharArray): CharSequence {
   val `$this$trim$iv`: java.lang.CharSequence = `$this$trim`
   var `startIndex$iv`: Int = 0
   var `endIndex$iv`: Int = `$this$trim`.length() - 1
   var `startFound$iv`: Boolean = false

   while (`startIndex$iv` <= `endIndex$iv`) {
      val var10: Boolean = ArraysKt.contains(chars, `$this$trim$iv`.charAt(if (!`startFound$iv`) `startIndex$iv` else `endIndex$iv`))
      if (!`startFound$iv`) {
         if (!var10) {
            `startFound$iv` = true
         } else {
            `startIndex$iv`++
         }
      } else {
         if (!var10) {
            break
         }

         `endIndex$iv`--
      }
   }

   return `$this$trim$iv`.subSequence(`startIndex$iv`, `endIndex$iv` + 1)
}

public fun CharSequence.removeSurrounding(delimiter: CharSequence): CharSequence {
   return StringsKt.removeSurrounding((java.lang.CharSequence)`$this$removeSurrounding`, delimiter, delimiter)
}

public fun String.trimStart(chars: CharArray): String {
   val `$this$trimStart$iv$iv`: java.lang.CharSequence = `$this$trimStart`
   var `index$iv$iv`: Int = 0
   val var7: Int = `$this$trimStart$iv$iv`.length()

   var var10000: java.lang.CharSequence
   while (true) {
      if (`index$iv$iv` >= var7) {
         var10000 = ""
         break
      }

      if (!ArraysKt.contains(chars, `$this$trimStart$iv$iv`.charAt(`index$iv$iv`))) {
         var10000 = `$this$trimStart$iv$iv`.subSequence(`index$iv$iv`, `$this$trimStart$iv$iv`.length())
         break
      }

      `index$iv$iv`++
   }

   return var10000.toString()
}

public fun CharSequence.subSequence(range: IntRange): CharSequence {
   return `$this$subSequence`.subSequence(range.start, range.endInclusive + 1)
}

@InlineOnly
public inline infix fun CharSequence.matches(regex: Regex): Boolean {
   return regex matches `$this$matches`
}

public fun String.replaceBefore(delimiter: String, replacement: String, missingDelimiterValue: String = `$this$replaceBefore`): String {
   val index: Int = StringsKt.indexOf$default(`$this$replaceBefore`, delimiter, 0, false, 6, null)
   return if (index == -1) missingDelimiterValue else StringsKt.replaceRange(`$this$replaceBefore`, 0, index, replacement).toString()
}

@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun <C, R> Any.ifBlank(defaultValue: () -> Any): Any where C : CharSequence, C : Any {
   return (R)(if (StringsKt.isBlank(`$this$ifBlank`)) defaultValue() else `$this$ifBlank`)
}

public fun CharSequence.endsWith(char: Char, ignoreCase: Boolean = false): Boolean {
   return `$this$endsWith`.length() > 0 && CharsKt.equals(`$this$endsWith`.charAt(StringsKt.getLastIndex(`$this$endsWith`)), ignoreCase, ignoreCase)
}

public operator fun CharSequence.iterator(): CharIterator {
   return    // $VF: Compiled from Strings.kt
object : CharIterator {
      private final var index: Int

      public override fun nextChar(): Char {
         return $this$iterator.charAt(this.index++)
      }

      public override operator fun hasNext(): Boolean {
         return this.index < $this$iterator.length()
      }
   }
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@JvmName(name = "replaceFirstCharWithCharSequence")
@SinceKotlin(version = "1.5")
@OverloadResolutionByLambdaReturnType
@InlineOnly
public inline fun String.replaceFirstChar(transform: (Char) -> CharSequence): String {
   val var4: java.lang.String
   if (`$this$replaceFirstChar`.length() > 0) {
      val var10000: StringBuilder = StringBuilder().append(transform(`$this$replaceFirstChar`.charAt(0)))
      val var10001: java.lang.String = `$this$replaceFirstChar`.substring(1)
      var4 = var10000.append(var10001).toString()
   } else {
      var4 = `$this$replaceFirstChar`
   }

   return var4
}

public fun String.substringAfter(delimiter: String, missingDelimiterValue: String = `$this$substringAfter`): String {
   val index: Int = StringsKt.indexOf$default(`$this$substringAfter`, delimiter, 0, false, 6, null)
   val var10000: java.lang.String
   if (index == -1) {
      var10000 = missingDelimiterValue
   } else {
      var10000 = `$this$substringAfter`.substring(index + delimiter.length(), `$this$substringAfter`.length())
   }

   return var10000
}

public fun String.replaceBeforeLast(delimiter: Char, replacement: String, missingDelimiterValue: String = `$this$replaceBeforeLast`): String {
   val index: Int = StringsKt.lastIndexOf$default(`$this$replaceBeforeLast`, delimiter, 0, false, 6, null)
   return if (index == -1) missingDelimiterValue else StringsKt.replaceRange(`$this$replaceBeforeLast`, 0, index, replacement).toString()
}

public fun CharSequence.substring(range: IntRange): String {
   return `$this$substring`.subSequence(range.start, range.endInclusive + 1).toString()
}

public fun CharSequence.split(delimiters: CharArray, ignoreCase: Boolean = false, limit: Int = 0): List<String> {
   if (delimiters.length == 1) {
      return split$StringsKt__StringsKt(`$this$split`, java.lang.String.valueOf(delimiters[0]), ignoreCase, limit)
   } else {
      val `$this$map$iv`: java.lang.Iterable = SequencesKt.asIterable(
         rangesDelimitedBy$StringsKt__StringsKt$default(`$this$split`, delimiters, 0, ignoreCase, limit, 2, null)
      )
      val `destination$iv$iv`: java.util.Collection = ArrayList(CollectionsKt.collectionSizeOrDefault(`$this$map$iv`, 10))

      for (`item$iv$iv` in `$this$map$iv`) {
         `destination$iv$iv`.add(StringsKt.substring((java.lang.CharSequence)`$this$split`, `item$iv$iv` as IntRange))
      }

      return `destination$iv$iv` as MutableList<java.lang.String>
   }
}

public fun String.replaceAfterLast(delimiter: String, replacement: String, missingDelimiterValue: String = `$this$replaceAfterLast`): String {
   val index: Int = StringsKt.lastIndexOf$default(`$this$replaceAfterLast`, delimiter, 0, false, 6, null)
   return if (index == -1)
      missingDelimiterValue
      else
      StringsKt.replaceRange((java.lang.CharSequence)`$this$replaceAfterLast`, index + delimiter.length(), `$this$replaceAfterLast`.length(), replacement)
         .toString()
      }

public fun String.substringAfterLast(delimiter: String, missingDelimiterValue: String = `$this$substringAfterLast`): String {
   val index: Int = StringsKt.lastIndexOf$default(`$this$substringAfterLast`, delimiter, 0, false, 6, null)
   val var10000: java.lang.String
   if (index == -1) {
      var10000 = missingDelimiterValue
   } else {
      var10000 = `$this$substringAfterLast`.substring(index + delimiter.length(), `$this$substringAfterLast`.length())
   }

   return var10000
}

public fun CharSequence.trimStart(): CharSequence {
   val `$this$trimStart$iv`: java.lang.CharSequence = `$this$trimStart`
   var `index$iv`: Int = 0
   val var4: Int = `$this$trimStart`.length()

   var var10000: java.lang.CharSequence
   while (true) {
      if (`index$iv` >= var4) {
         var10000 = ""
         break
      }

      if (!CharsKt.isWhitespace(`$this$trimStart$iv`.charAt(`index$iv`))) {
         var10000 = `$this$trimStart$iv`.subSequence(`index$iv`, `$this$trimStart$iv`.length())
         break
      }

      `index$iv`++
   }

   return var10000
}

public fun CharSequence.removePrefix(prefix: CharSequence): CharSequence {
   return if (StringsKt.startsWith$default((java.lang.CharSequence)`$this$removePrefix`, (java.lang.CharSequence)prefix, false, 2, null))
      `$this$removePrefix`.subSequence(prefix.length(), `$this$removePrefix`.length())
      else
      `$this$removePrefix`.subSequence(0, `$this$removePrefix`.length())
   }

public fun String.replaceBeforeLast(delimiter: String, replacement: String, missingDelimiterValue: String = `$this$replaceBeforeLast`): String {
   val index: Int = StringsKt.lastIndexOf$default(`$this$replaceBeforeLast`, delimiter, 0, false, 6, null)
   return if (index == -1) missingDelimiterValue else StringsKt.replaceRange(`$this$replaceBeforeLast`, 0, index, replacement).toString()
}

public fun CharSequence.removeSuffix(suffix: CharSequence): CharSequence {
   return if (StringsKt.endsWith$default((java.lang.CharSequence)`$this$removeSuffix`, (java.lang.CharSequence)suffix, false, 2, null))
      `$this$removeSuffix`.subSequence(0, `$this$removeSuffix`.length() - suffix.length())
      else
      `$this$removeSuffix`.subSequence(0, `$this$removeSuffix`.length())
   }

@InlineOnly
public inline fun String.replaceRange(range: IntRange, replacement: CharSequence): String {
   return StringsKt.replaceRange((java.lang.CharSequence)`$this$replaceRange`, range, replacement).toString()
}

public fun CharSequence.lastIndexOfAny(
   strings: Collection<String>,
   startIndex: Int = StringsKt.getLastIndex(`$this$lastIndexOfAny`),
   ignoreCase: Boolean = false
): Int {
   val var10000: Pair = findAnyOf$StringsKt__StringsKt(`$this$lastIndexOfAny`, strings, startIndex, ignoreCase, true)
   return if (var10000 != null) (var10000.first as java.lang.Number).intValue() else -1
}

@InlineOnly
public inline fun CharSequence.isEmpty(): Boolean {
   return `$this$isEmpty`.length() == 0
}

public fun String.replaceAfter(delimiter: Char, replacement: String, missingDelimiterValue: String = `$this$replaceAfter`): String {
   val index: Int = StringsKt.indexOf$default(`$this$replaceAfter`, delimiter, 0, false, 6, null)
   return if (index == -1)
      missingDelimiterValue
      else
      StringsKt.replaceRange((java.lang.CharSequence)`$this$replaceAfter`, index + 1, `$this$replaceAfter`.length(), replacement).toString()
   }

public fun String.replaceAfter(delimiter: String, replacement: String, missingDelimiterValue: String = `$this$replaceAfter`): String {
   val index: Int = StringsKt.indexOf$default(`$this$replaceAfter`, delimiter, 0, false, 6, null)
   return if (index == -1)
      missingDelimiterValue
      else
      StringsKt.replaceRange((java.lang.CharSequence)`$this$replaceAfter`, index + delimiter.length(), `$this$replaceAfter`.length(), replacement).toString()
   }

public fun String.substringBeforeLast(delimiter: String, missingDelimiterValue: String = `$this$substringBeforeLast`): String {
   val index: Int = StringsKt.lastIndexOf$default(`$this$substringBeforeLast`, delimiter, 0, false, 6, null)
   val var10000: java.lang.String
   if (index == -1) {
      var10000 = missingDelimiterValue
   } else {
      var10000 = `$this$substringBeforeLast`.substring(0, index)
   }

   return var10000
}

public fun CharSequence.padStart(length: Int, padChar: Char = 32): CharSequence {
   if (length < 0) {
      throw IllegalArgumentException("Desired length $length is less than zero.")
   } else if (length <= `$this$padStart`.length()) {
      return `$this$padStart`.subSequence(0, `$this$padStart`.length())
   } else {
      val sb: StringBuilder = StringBuilder(length)
      val var4: IntIterator = IntRange(1, length - `$this$padStart`.length()).iterator()

      while (var4.hasNext()) {
         val i: Int = var4.nextInt()
         sb.append(padChar)
      }

      sb.append(`$this$padStart`)
      return sb
   }
}

@InlineOnly
public inline operator fun CharSequence.contains(regex: Regex): Boolean {
   return regex.containsMatchIn(`$this$contains`)
}

public fun CharSequence.trim(): CharSequence {
   val `$this$trim$iv`: java.lang.CharSequence = `$this$trim`
   var `startIndex$iv`: Int = 0
   var `endIndex$iv`: Int = `$this$trim`.length() - 1
   var `startFound$iv`: Boolean = false

   while (`startIndex$iv` <= `endIndex$iv`) {
      val var9: Boolean = CharsKt.isWhitespace(`$this$trim$iv`.charAt(if (!`startFound$iv`) `startIndex$iv` else `endIndex$iv`))
      if (!`startFound$iv`) {
         if (!var9) {
            `startFound$iv` = true
         } else {
            `startIndex$iv`++
         }
      } else {
         if (!var9) {
            break
         }

         `endIndex$iv`--
      }
   }

   return `$this$trim$iv`.subSequence(`startIndex$iv`, `endIndex$iv` + 1)
}

public fun String.substring(range: IntRange): String {
   val var10000: java.lang.String = `$this$substring`.substring(range.start, range.endInclusive + 1)
   return var10000
}

@InlineOnly
public inline fun String.trimEnd(): String {
   return StringsKt.trimEnd(`$this$trimEnd`).toString()
}

private fun CharSequence.indexOf(other: CharSequence, startIndex: Int, endIndex: Int, ignoreCase: Boolean, last: Boolean = ...): Int {
   val indices: IntProgression = if (!last)
      IntRange(RangesKt.coerceAtLeast(startIndex, 0), RangesKt.coerceAtMost(endIndex, `$this$indexOf`.length()))
      else
      RangesKt.downTo((int)RangesKt.coerceAtMost(startIndex, StringsKt.getLastIndex(`$this$indexOf`)), (int)RangesKt.coerceAtLeast(endIndex, 0))
      if (`$this$indexOf` is java.lang.String && other is java.lang.String) {
      var var10: Int = indices.first
      val var11: Int = indices.last
      val var12: Int = indices.step
      if (var12 > 0 && var10 <= var11 || var12 < 0 && var11 <= var10) {
         while (true) {
            if (StringsKt.regionMatches(other as java.lang.String, 0, `$this$indexOf` as java.lang.String, var10, other.length(), ignoreCase)) {
               return var10
            }

            if (var10 == var11) {
               break
            }

            var10 += var12
         }
      }
   } else {
      var index: Int = indices.first
      val var8: Int = indices.last
      val var9: Int = indices.step
      if (var9 > 0 && index <= var8 || var9 < 0 && var8 <= index) {
         while (true) {
            if (StringsKt.regionMatchesImpl(other, 0, `$this$indexOf`, index, other.length(), ignoreCase)) {
               return index
            }

            if (index == var8) {
               break
            }

            index += var9
         }
      }
   }

   return -1
}

public fun String.removePrefix(prefix: CharSequence): String {
   if (StringsKt.startsWith$default((java.lang.CharSequence)`$this$removePrefix`, (java.lang.CharSequence)prefix, false, 2, null)) {
      val var10000: java.lang.String = `$this$removePrefix`.substring(prefix.length())
      return var10000
   } else {
      return `$this$removePrefix`
   }
}

private fun CharSequence.findAnyOf(strings: Collection<String>, startIndex: Int, ignoreCase: Boolean, last: Boolean): Pair<Int, String>? {
   if (!ignoreCase && strings.size() == 1) {
      val var16: java.lang.String = CollectionsKt.single(strings)
      val var18: Int = if (!last)
         StringsKt.indexOf$default(`$this$findAnyOf`, var16, startIndex, false, 4, null)
         else
         StringsKt.lastIndexOf$default(`$this$findAnyOf`, var16, startIndex, false, 4, null)
         return if (var18 < 0) null else var18 to var16
   } else {
      val indices: IntProgression = if (!last)
         IntRange(RangesKt.coerceAtLeast(startIndex, 0), `$this$findAnyOf`.length())
         else
         RangesKt.downTo((int)RangesKt.coerceAtMost(startIndex, StringsKt.getLastIndex(`$this$findAnyOf`)), (int)0)
         if (`$this$findAnyOf` is java.lang.String) {
         var index: Int = indices.first
         val var7: Int = indices.last
         val var8: Int = indices.step
         if (var8 > 0 && index <= var7 || var8 < 0 && var7 <= index) {
            while (true) {
               val var12: java.util.Iterator = strings.iterator()

               var var10000: Any
               while (true) {
                  if (!var12.hasNext()) {
                     var10000 = null
                     break
                  }

                  val `element$iv`: Any = var12.next()
                  if (StringsKt.regionMatches(
                     `element$iv` as java.lang.String, 0, `$this$findAnyOf` as java.lang.String, index, (`element$iv` as java.lang.String).length(), ignoreCase
                  )) {
                     var10000 = `element$iv`
                     break
                  }
               }

               val matchingString: java.lang.String = var10000 as java.lang.String
               if (var10000 as java.lang.String != null) {
                  return index to matchingString
               }

               if (index == var7) {
                  break
               }

               index += var8
            }
         }
      } else {
         var var17: Int = indices.first
         val var19: Int = indices.last
         val var20: Int = indices.step
         if (var20 > 0 && var17 <= var19 || var20 < 0 && var19 <= var17) {
            while (true) {
               val var24: java.util.Iterator = strings.iterator()

               var var28: Any
               while (true) {
                  if (!var24.hasNext()) {
                     var28 = null
                     break
                  }

                  val var25: Any = var24.next()
                  if (StringsKt.regionMatchesImpl(var25 as java.lang.String, 0, `$this$findAnyOf`, var17, (var25 as java.lang.String).length(), ignoreCase)) {
                     var28 = var25
                     break
                  }
               }

               val var21: java.lang.String = var28 as java.lang.String
               if (var28 as java.lang.String != null) {
                  return var17 to var21
               }

               if (var17 == var19) {
                  break
               }

               var17 += var20
            }
         }
      }

      return null
   }
}

public fun CharSequence.splitToSequence(vararg delimiters: String, ignoreCase: Boolean = false, limit: Int = 0): Sequence<String> {
   return SequencesKt.map(
      rangesDelimitedBy$StringsKt__StringsKt$default(`$this$splitToSequence`, delimiters, 0, ignoreCase, limit, 2, null),    // $VF: Compiled from Strings.kt
   { it: IntRange ->
         return StringsKt.substring((java.lang.CharSequence)$this$splitToSequence, it)
      } as Function1
   )
}

public inline fun String.trim(predicate: (Char) -> Boolean): String {
   val `$this$trim$iv`: java.lang.CharSequence = `$this$trim`
   var `startIndex$iv`: Int = 0
   var `endIndex$iv`: Int = `$this$trim$iv`.length() - 1
   var `startFound$iv`: Boolean = false

   while (`startIndex$iv` <= `endIndex$iv`) {
      val `match$iv`: Boolean = predicate(`$this$trim$iv`.charAt(if (!`startFound$iv`) `startIndex$iv` else `endIndex$iv`)) as java.lang.Boolean
      if (!`startFound$iv`) {
         if (!`match$iv`) {
            `startFound$iv` = true
         } else {
            `startIndex$iv`++
         }
      } else {
         if (!`match$iv`) {
            break
         }

         `endIndex$iv`--
      }
   }

   return `$this$trim$iv`.subSequence(`startIndex$iv`, `endIndex$iv` + 1).toString()
}

private fun CharSequence.rangesDelimitedBy(delimiters: Array<out String>, startIndex: Int = ..., ignoreCase: Boolean = ..., limit: Int = ...): Sequence<
      IntRange
   > {
   StringsKt.requireNonNegativeLimit(limit)
   val delimitersList: java.util.List = ArraysKt.asList(delimiters)
   return DelimitedRangesSequence(`$this$rangesDelimitedBy`, startIndex, limit,    // $VF: Compiled from Strings.kt
{ currentIndex: Int ->
      val var10000: Pair = StringsKt__StringsKt.findAnyOf$StringsKt__StringsKt(`$this$$receiver`, delimitersList, currentIndex, ignoreCase, false)
      return if (var10000 != null) var10000.first to (var10000.second as java.lang.String).length() else null
   } as (java.lang.CharSequence?, Int?) -> Pair<Integer, Integer>)
}

public fun CharSequence.lastIndexOfAny(chars: CharArray, startIndex: Int = StringsKt.getLastIndex(`$this$lastIndexOfAny`), ignoreCase: Boolean = false): Int {
   if (!ignoreCase && chars.length == 1 && `$this$lastIndexOfAny` is java.lang.String) {
      return (`$this$lastIndexOfAny` as java.lang.String).lastIndexOf(ArraysKt.single(chars), startIndex)
   } else {
      for (index in RangesKt.coerceAtMost(startIndex, StringsKt.getLastIndex(`$this$lastIndexOfAny`)) downTo 0) {
         val charAtIndex: Char = `$this$lastIndexOfAny`.charAt(index)
         val `$this$any$iv`: CharArray = chars
         var var8: Int = 0
         val var9: Int = chars.length

         var var10000: Boolean
         while (true) {
            if (var8 >= var9) {
               var10000 = false
               break
            }

            if (CharsKt.equals(`$this$any$iv`[var8], charAtIndex, ignoreCase)) {
               var10000 = true
               break
            }

            var8++
         }

         if (var10000) {
            return index
         }
      }

      return -1
   }
}

@InlineOnly
public inline fun CharSequence?.isNullOrEmpty(): Boolean {
   contract {
      returns(false) implies (this != null)
   }

   return `$this$isNullOrEmpty` == null || `$this$isNullOrEmpty`.length() == 0
}

internal fun requireNonNegativeLimit(limit: Int) {
   if (limit < 0) {
      throw IllegalArgumentException(("Limit must be non-negative, but was $limit").toString())
   }
}

@InlineOnly
public inline fun CharSequence.split(regex: Regex, limit: Int = 0): List<String> {
   return regex.split(`$this$split`, limit)
}

@SinceKotlin(version = "1.5")
public fun String.toBooleanStrict(): Boolean {
   val var10000: Boolean
   if (`$this$toBooleanStrict` == "true") {
      var10000 = true
   } else {
      if (!(`$this$toBooleanStrict` == "false")) {
         throw IllegalArgumentException("The string doesn't represent a boolean value: $`$this$toBooleanStrict`")
      }

      var10000 = false
   }

   return var10000
}

public final val indices: IntRange
   public final get() {
      return IntRange(0, `$this$indices`.length() - 1)
   }


@InlineOnly
public inline fun String.replaceRange(startIndex: Int, endIndex: Int, replacement: CharSequence): String {
   return StringsKt.replaceRange((java.lang.CharSequence)`$this$replaceRange`, startIndex, endIndex, replacement).toString()
}

public fun CharSequence.lineSequence(): Sequence<String> {
   return StringsKt.splitToSequence$default(`$this$lineSequence`, arrayOf("\r\n", "\n", "\r"), false, 0, 6, null)
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@InlineOnly
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.5")
@JvmName(name = "replaceFirstCharWithChar")
public inline fun String.replaceFirstChar(transform: (Char) -> Char): String {
   var var6: java.lang.String
   if (`$this$replaceFirstChar`.length() > 0) {
      val var2: Char = transform(`$this$replaceFirstChar`.charAt(0)) as Character
      var6 = `$this$replaceFirstChar`.substring(1)
      var6 = "$var2$var6"
   } else {
      var6 = `$this$replaceFirstChar`
   }

   return var6
}

public fun CharSequence.findAnyOf(strings: Collection<String>, startIndex: Int = 0, ignoreCase: Boolean = false): Pair<Int, String>? {
   return findAnyOf$StringsKt__StringsKt(`$this$findAnyOf`, strings, startIndex, ignoreCase, false)
}

public fun String.replaceBefore(delimiter: Char, replacement: String, missingDelimiterValue: String = `$this$replaceBefore`): String {
   val index: Int = StringsKt.indexOf$default(`$this$replaceBefore`, delimiter, 0, false, 6, null)
   return if (index == -1) missingDelimiterValue else StringsKt.replaceRange(`$this$replaceBefore`, 0, index, replacement).toString()
}

public fun CharSequence.removeRange(range: IntRange): CharSequence {
   return StringsKt.removeRange((java.lang.CharSequence)`$this$removeRange`, range.start, range.endInclusive + 1)
}

public fun CharSequence.removeSurrounding(prefix: CharSequence, suffix: CharSequence): CharSequence {
   return if (`$this$removeSurrounding`.length() >= prefix.length() + suffix.length()
         && StringsKt.startsWith$default((java.lang.CharSequence)`$this$removeSurrounding`, (java.lang.CharSequence)prefix, false, 2, null)
         && StringsKt.endsWith$default((java.lang.CharSequence)`$this$removeSurrounding`, (java.lang.CharSequence)suffix, false, 2, null))
      `$this$removeSurrounding`.subSequence(prefix.length(), `$this$removeSurrounding`.length() - suffix.length())
      else
      `$this$removeSurrounding`.subSequence(0, `$this$removeSurrounding`.length())
   }

public inline fun String.trimStart(predicate: (Char) -> Boolean): String {
   val `$this$trimStart$iv`: java.lang.CharSequence = `$this$trimStart`
   var `index$iv`: Int = 0
   val var6: Int = `$this$trimStart$iv`.length()

   var var10000: java.lang.CharSequence
   while (true) {
      if (`index$iv` >= var6) {
         var10000 = ""
         break
      }

      if (!predicate(`$this$trimStart$iv`.charAt(`index$iv`)) as java.lang.Boolean) {
         var10000 = `$this$trimStart$iv`.subSequence(`index$iv`, `$this$trimStart$iv`.length())
         break
      }

      `index$iv`++
   }

   return var10000.toString()
}

public fun CharSequence.replaceRange(startIndex: Int, endIndex: Int, replacement: CharSequence): CharSequence {
   if (endIndex < startIndex) {
      throw IndexOutOfBoundsException("End index ($endIndex) is less than start index ($startIndex).")
   } else {
      val sb: StringBuilder = StringBuilder()
      sb.append(replacement)
      return sb
   }
}

public fun CharSequence.hasSurrogatePairAt(index: Int): Boolean {
   return IntRange(0, `$this$hasSurrogatePairAt`.length() - 2).contains(index)
      && Character.isHighSurrogate(`$this$hasSurrogatePairAt`.charAt(index))
      && Character.isLowSurrogate(`$this$hasSurrogatePairAt`.charAt(index + 1))
   }

@InlineOnly
public inline fun String.removeRange(range: IntRange): String {
   return StringsKt.removeRange((java.lang.CharSequence)`$this$removeRange`, range).toString()
}

public fun CharSequence.commonSuffixWith(other: CharSequence, ignoreCase: Boolean = false): String {
   val thisLength: Int = `$this$commonSuffixWith`.length()
   val otherLength: Int = other.length()
   val shortestLength: Int = Math.min(thisLength, otherLength)
   var i: Int = 0

   while (i < shortestLength && CharsKt.equals(`$this$commonSuffixWith`.charAt(thisLength - i - 1), other.charAt(otherLength - i - 1), ignoreCase)) {
      i++
   }

   if (StringsKt.hasSurrogatePairAt(`$this$commonSuffixWith`, thisLength - i - 1) || StringsKt.hasSurrogatePairAt(other, otherLength - i - 1)) {
      i--
   }

   return `$this$commonSuffixWith`.subSequence(thisLength - i, thisLength).toString()
}

@InlineOnly
public inline fun CharSequence.replace(regex: Regex, replacement: String): String {
   return regex.replace(`$this$replace`, replacement)
}

public fun String.replaceAfterLast(delimiter: Char, replacement: String, missingDelimiterValue: String = `$this$replaceAfterLast`): String {
   val index: Int = StringsKt.lastIndexOf$default(`$this$replaceAfterLast`, delimiter, 0, false, 6, null)
   return if (index == -1)
      missingDelimiterValue
      else
      StringsKt.replaceRange((java.lang.CharSequence)`$this$replaceAfterLast`, index + 1, `$this$replaceAfterLast`.length(), replacement).toString()
   }

public fun String.trimEnd(chars: CharArray): String {
   val `$this$trimEnd$iv$iv`: java.lang.CharSequence = `$this$trimEnd`
   var var6: Int = `$this$trimEnd`.length() + -1
   if (0 <= var6) {
      do {
         val `index$iv$iv`: Int = var6--
         if (!ArraysKt.contains(chars, `$this$trimEnd$iv$iv`.charAt(`index$iv$iv`))) {
            return `$this$trimEnd$iv$iv`.subSequence(0, `index$iv$iv` + 1).toString()
         }
      } while (0 <= var6)
   }

   return "".toString()
}

open fun StringsKt__StringsKt() {
}

public fun CharSequence.findLastAnyOf(strings: Collection<String>, startIndex: Int = StringsKt.getLastIndex(`$this$findLastAnyOf`), ignoreCase: Boolean = false): Pair<
      Int,
      String
   >? {
   return findAnyOf$StringsKt__StringsKt(`$this$findLastAnyOf`, strings, startIndex, ignoreCase, true)
}

@InlineOnly
public inline fun String.trimStart(): String {
   return StringsKt.trimStart(`$this$trimStart`).toString()
}

public fun CharSequence.splitToSequence(delimiters: CharArray, ignoreCase: Boolean = false, limit: Int = 0): Sequence<String> {
   return SequencesKt.map(
      rangesDelimitedBy$StringsKt__StringsKt$default(`$this$splitToSequence`, delimiters, 0, ignoreCase, limit, 2, null),    // $VF: Compiled from Strings.kt
   { it: IntRange ->
         return StringsKt.substring((java.lang.CharSequence)$this$splitToSequence, it)
      } as Function1
   )
}

@InlineOnly
public inline fun CharSequence.replace(regex: Regex, noinline transform: (MatchResult) -> CharSequence): String {
   return regex.replace(`$this$replace`, transform)
}

internal fun CharSequence.regionMatchesImpl(thisOffset: Int, other: CharSequence, otherOffset: Int, length: Int, ignoreCase: Boolean): Boolean {
   if (otherOffset >= 0 && thisOffset >= 0 && thisOffset <= `$this$regionMatchesImpl`.length() - length && otherOffset <= other.length() - length) {
      repeat(length) { index ->
         if (!CharsKt.equals(`$this$regionMatchesImpl`.charAt(thisOffset + index), other.charAt(otherOffset + index), ignoreCase)) {
            return false
         }
      }

      return true
   } else {
      return false
   }
}

public fun String.trim(chars: CharArray): String {
   val `$this$trim$iv$iv`: java.lang.CharSequence = `$this$trim`
   var `startIndex$iv$iv`: Int = 0
   var `endIndex$iv$iv`: Int = `$this$trim$iv$iv`.length() - 1
   var `startFound$iv$iv`: Boolean = false

   while (`startIndex$iv$iv` <= `endIndex$iv$iv`) {
      val var12: Boolean = ArraysKt.contains(chars, `$this$trim$iv$iv`.charAt(if (!`startFound$iv$iv`) `startIndex$iv$iv` else `endIndex$iv$iv`))
      if (!`startFound$iv$iv`) {
         if (!var12) {
            `startFound$iv$iv` = true
         } else {
            `startIndex$iv$iv`++
         }
      } else {
         if (!var12) {
            break
         }

         `endIndex$iv$iv`--
      }
   }

   return `$this$trim$iv$iv`.subSequence(`startIndex$iv$iv`, `endIndex$iv$iv` + 1).toString()
}

public inline fun CharSequence.trim(predicate: (Char) -> Boolean): CharSequence {
   var startIndex: Int = 0
   var endIndex: Int = `$this$trim`.length() - 1
   var startFound: Boolean = false

   while (startIndex <= endIndex) {
      val match: Boolean = predicate(`$this$trim`.charAt(if (!startFound) startIndex else endIndex)) as java.lang.Boolean
      if (!startFound) {
         if (!match) {
            startFound = true
         } else {
            startIndex++
         }
      } else {
         if (!match) {
            break
         }

         endIndex--
      }
   }

   return `$this$trim`.subSequence(startIndex, endIndex + 1)
}

public fun CharSequence.startsWith(prefix: CharSequence, startIndex: Int, ignoreCase: Boolean = false): Boolean {
   return if (!ignoreCase && `$this$startsWith` is java.lang.String && prefix is java.lang.String)
      StringsKt.startsWith$default(`$this$startsWith` as java.lang.String, prefix as java.lang.String, startIndex, false, 4, null)
      else
      StringsKt.regionMatchesImpl(`$this$startsWith`, startIndex, prefix, 0, prefix.length(), ignoreCase)
   }

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@InlineOnly
@SinceKotlin(version = "1.6")
public inline fun CharSequence.splitToSequence(regex: Regex, limit: Int = 0): Sequence<String> {
   return regex.splitToSequence(`$this$splitToSequence`, limit)
}

public fun String.padStart(length: Int, padChar: Char = 32): String {
   return StringsKt.padStart((java.lang.CharSequence)`$this$padStart`, length, padChar).toString()
}

public fun CharSequence.lastIndexOf(char: Char, startIndex: Int = StringsKt.getLastIndex(`$this$lastIndexOf`), ignoreCase: Boolean = false): Int {
   return if (!ignoreCase && `$this$lastIndexOf` is java.lang.String)
      (`$this$lastIndexOf` as java.lang.String).lastIndexOf(char, startIndex)
      else
      StringsKt.lastIndexOfAny(`$this$lastIndexOf`, charArrayOf(char), startIndex, ignoreCase)
   }

public fun CharSequence.lines(): List<String> {
   return SequencesKt.toList(StringsKt.lineSequence(`$this$lines`))
}

public fun CharSequence.replaceRange(range: IntRange, replacement: CharSequence): CharSequence {
   return StringsKt.replaceRange((java.lang.CharSequence)`$this$replaceRange`, range.start, range.endInclusive + 1, replacement)
}

public fun String.removeSurrounding(delimiter: CharSequence): String {
   return StringsKt.removeSurrounding(`$this$removeSurrounding`, delimiter, delimiter)
}

internal fun CharSequence?.contentEqualsIgnoreCaseImpl(other: CharSequence?): Boolean {
   if (`$this$contentEqualsIgnoreCaseImpl` is java.lang.String && other is java.lang.String) {
      return StringsKt.equals(`$this$contentEqualsIgnoreCaseImpl` as java.lang.String, other as java.lang.String, true)
   } else if (`$this$contentEqualsIgnoreCaseImpl` === other) {
      return true
   } else if (`$this$contentEqualsIgnoreCaseImpl` != null && other != null && `$this$contentEqualsIgnoreCaseImpl`.length() == other.length()) {
      var i: Int = 0

      for (var3 in `$this$contentEqualsIgnoreCaseImpl`.length()..i) {
         if (!CharsKt.equals(`$this$contentEqualsIgnoreCaseImpl`.charAt(i), other.charAt(i), true)) {
            return false
         }
      }

      return true
   } else {
      return false
   }
}

@InlineOnly
public inline fun CharSequence.isNotEmpty(): Boolean {
   return `$this$isNotEmpty`.length() > 0
}

public fun String.padEnd(length: Int, padChar: Char = 32): String {
   return StringsKt.padEnd((java.lang.CharSequence)`$this$padEnd`, length, padChar).toString()
}

private fun CharSequence.rangesDelimitedBy(delimiters: CharArray, startIndex: Int = ..., ignoreCase: Boolean = ..., limit: Int = ...): Sequence<IntRange> {
   StringsKt.requireNonNegativeLimit(limit)
   return DelimitedRangesSequence(`$this$rangesDelimitedBy`, startIndex, limit,    // $VF: Compiled from Strings.kt
{ currentIndex: Int ->
      val it: Int = StringsKt.indexOfAny(`$this$$receiver`, delimiters, currentIndex, ignoreCase)
      return if (it < 0) null else it to 1
   } as (java.lang.CharSequence?, Int?) -> Pair<Integer, Integer>)
}

public fun String.removeSurrounding(prefix: CharSequence, suffix: CharSequence): String {
   if (`$this$removeSurrounding`.length() >= prefix.length() + suffix.length()
      && StringsKt.startsWith$default((java.lang.CharSequence)`$this$removeSurrounding`, (java.lang.CharSequence)prefix, false, 2, null)
      && StringsKt.endsWith$default((java.lang.CharSequence)`$this$removeSurrounding`, (java.lang.CharSequence)suffix, false, 2, null)) {
      val var10000: java.lang.String = `$this$removeSurrounding`.substring(prefix.length(), `$this$removeSurrounding`.length() - suffix.length())
      return var10000
   } else {
      return `$this$removeSurrounding`
   }
}
