@file:JvmMultifileClass
@file:JvmName("StringsKt")

package kotlin.text

import java.util.ArrayList
import java.util.Comparator
import java.util.HashSet
import java.util.LinkedHashMap
import java.util.LinkedHashSet
import java.util.NoSuchElementException
import kotlin.internal.InlineOnly
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.Intrinsics
import kotlin.random.Random

// $VF: Compiled from _Strings.kt
public inline fun <R> CharSequence.foldRight(initial: Any, operation: (Char, Any) -> Any): Any {
   var index: Int = StringsKt.getLastIndex(`$this$foldRight`)
   var accumulator: Any = initial

   while (index >= 0) {
      accumulator = operation(`$this$foldRight`.charAt(index--), accumulator)
   }

   return (R)accumulator
}

public inline fun <K, V> CharSequence.associateBy(keySelector: (Char) -> Any, valueTransform: (Char) -> Any): Map<Any, Any> {
   val capacity: Int = RangesKt.coerceAtLeast(MapsKt.mapCapacity(`$this$associateBy`.length()), 16)
   val `$this$associateByTo$iv`: java.lang.CharSequence = `$this$associateBy`
   val `destination$iv`: java.util.Map = LinkedHashMap(capacity)
      return `destination$iv`
}

@SinceKotlin(version = "1.3")
public fun CharSequence.random(random: Random): Char {
   if (`$this$random`.length() == 0) {
      throw NoSuchElementException("Char sequence is empty.")
   } else {
      return `$this$random`.charAt(random.nextInt(`$this$random`.length()))
   }
}

public fun CharSequence.drop(n: Int): CharSequence {
   if (n < 0) {
      throw IllegalArgumentException(("Requested character count $n is less than zero.").toString())
   } else {
      return `$this$drop`.subSequence(RangesKt.coerceAtMost(n, `$this$drop`.length()), `$this$drop`.length())
   }
}

@SinceKotlin(version = "1.4")
public inline fun <R> CharSequence.runningFold(initial: Any, operation: (Any, Char) -> Any): List<Any> {
   if (`$this$runningFold`.length() == 0) {
      return (java.util.List<R>)CollectionsKt.listOf(initial)
   } else {
      var accumulator: Any = ArrayList(`$this$runningFold`.length() + 1)
      accumulator.add(initial)
      val result: Any = accumulator
      accumulator = initial
            return result as MutableList<R>
   }
}

public inline fun String.filterIndexed(predicate: (Int, Char) -> Boolean): String {
   val `$this$filterIndexedTo$iv`: java.lang.CharSequence = `$this$filterIndexed`
   val `destination$iv`: Appendable = StringBuilder()
   val `$this$forEachIndexed$iv$iv`: java.lang.CharSequence = `$this$filterIndexedTo$iv`
   val `index$iv$iv`: Int = 0
      val var14: java.lang.String = (`destination$iv` as StringBuilder).toString()
   return var14
}

public fun String.takeLast(n: Int): String {
   if (n < 0) {
      throw IllegalArgumentException(("Requested character count $n is less than zero.").toString())
   } else {
      val var5: Int = `$this$takeLast`.length()
      val var10000: java.lang.String = `$this$takeLast`.substring(var5 - RangesKt.coerceAtMost(n, var5))
      return var10000
   }
}

@InlineOnly
@SinceKotlin(version = "1.5")
public inline fun <R : Any> CharSequence.firstNotNullOf(transform: (Char) -> Any?): Any {
   val var2: java.lang.CharSequence = `$this$firstNotNullOf`
   var var3: Int = 0

   var var10000: Any
   while (true) {
      if (var3 >= var2.length()) {
         var10000 = null
         break
      }

      var10000 = transform(var2.charAt(var3))
      if (var10000 != null) {
         break
      }

      var3++
   }

   if (var10000 == null) {
      throw NoSuchElementException("No element of the char sequence was transformed to a non-null value.")
   } else {
      return (R)var10000
   }
}

public inline fun CharSequence.singleOrNull(predicate: (Char) -> Boolean): Char? {
   var single: Character = null
   var found: Boolean = false
      return if (!found) null else single
}

@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun CharSequence.random(): Char {
   return StringsKt.random(`$this$random`, Random.Default)
}

public inline fun <R> CharSequence.mapIndexed(transform: (Int, Char) -> Any): List<Any> {
   val `$this$mapIndexedTo$iv`: java.lang.CharSequence = `$this$mapIndexed`
   val `destination$iv`: java.util.Collection = ArrayList(`$this$mapIndexed`.length())
   var `index$iv`: Int = 0
      return `destination$iv` as MutableList<R>
}

@SinceKotlin(version = "1.1")
public inline fun <K> CharSequence.groupingBy(crossinline keySelector: (Char) -> Any): Grouping<Char, Any> {
   return    // $VF: Compiled from _Strings.kt
object : Grouping<Char, Any> {
      public open fun keyOf(element: Char): Any {
         return (K)keySelector(element)
      }

      public override fun sourceIterator(): Iterator<Char> {
         return StringsKt.iterator($this$groupingBy)
      }
   }
}

public inline fun CharSequence.count(predicate: (Char) -> Boolean): Int {
   var count: Int = 0
      return count
}

@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public inline fun CharSequence.reduceRightOrNull(operation: (Char, Char) -> Char): Char? {
   var index: Int = StringsKt.getLastIndex(`$this$reduceRightOrNull`)
   if (index < 0) {
      return null
   } else {
      var accumulator: Char = `$this$reduceRightOrNull`.charAt(index--)

      while (index >= 0) {
         accumulator = operation(`$this$reduceRightOrNull`.charAt(index--), accumulator) as Character
      }

      return accumulator
   }
}

public inline fun CharSequence.first(predicate: (Char) -> Boolean): Char {
      throw NoSuchElementException("Char sequence contains no character matching the predicate.")
}

public inline fun CharSequence.filterIndexed(predicate: (Int, Char) -> Boolean): CharSequence {
   val `destination$iv`: Appendable = StringBuilder()
   val `$this$forEachIndexed$iv$iv`: java.lang.CharSequence = `$this$filterIndexed`
   val `index$iv$iv`: Int = 0
      return `destination$iv` as java.lang.CharSequence
}

@JvmName(name = "flatMapIndexedIterableTo")
@SinceKotlin(version = "1.4")
@InlineOnly
@OverloadResolutionByLambdaReturnType
public inline fun <R, C : MutableCollection<in Any>> CharSequence.flatMapIndexedTo(destination: Any, transform: (Int, Char) -> Iterable<Any>): Any {
   var index: Int = 0
      return (C)destination
}

@InlineOnly
public inline fun CharSequence.findLast(predicate: (Char) -> Boolean): Char? {
   val `$this$lastOrNull$iv`: java.lang.CharSequence = `$this$findLast`
   var var4: Int = `$this$findLast`.length() + -1
   if (0 <= var4) {
      do {
         val `element$iv`: Char = `$this$lastOrNull$iv`.charAt(var4--)
         if (predicate(`element$iv`) as java.lang.Boolean) {
            return `element$iv`
         }
      } while (0 <= var4)
   }

   return null
}

public fun CharSequence.dropLast(n: Int): CharSequence {
   if (n < 0) {
      throw IllegalArgumentException(("Requested character count $n is less than zero.").toString())
   } else {
      return StringsKt.take((java.lang.CharSequence)`$this$dropLast`, RangesKt.coerceAtLeast(`$this$dropLast`.length() - n, 0))
   }
}

public fun String.dropLast(n: Int): String {
   if (n < 0) {
      throw IllegalArgumentException(("Requested character count $n is less than zero.").toString())
   } else {
      return StringsKt.take(`$this$dropLast`, RangesKt.coerceAtLeast(`$this$dropLast`.length() - n, 0))
   }
}

public inline fun <R> CharSequence.foldIndexed(initial: Any, operation: (Int, Any, Char) -> Any): Any {
   var index: Int = 0
   var accumulator: Any = initial
      return (R)accumulator
}

@InlineOnly
public inline fun String.reversed(): String {
   return StringsKt.reversed(`$this$reversed`).toString()
}

@InlineOnly
public inline fun CharSequence.find(predicate: (Char) -> Boolean): Char? {
   val `$this$firstOrNull$iv`: java.lang.CharSequence = `$this$find`
   var var4: Int = 0

   var var10000: Character
   while (true) {
      if (var4 >= `$this$firstOrNull$iv`.length()) {
         var10000 = null
         break
      }

      val `element$iv`: Char = `$this$firstOrNull$iv`.charAt(var4)
      if (predicate(`element$iv`) as java.lang.Boolean) {
         var10000 = `element$iv`
         break
      }

      var4++
   }

   return var10000
}

public inline fun <K> CharSequence.associateBy(keySelector: (Char) -> Any): Map<Any, Char> {
   val capacity: Int = RangesKt.coerceAtLeast(MapsKt.mapCapacity(`$this$associateBy`.length()), 16)
   val `$this$associateByTo$iv`: java.lang.CharSequence = `$this$associateBy`
   val `destination$iv`: java.util.Map = LinkedHashMap(capacity)
      return `destination$iv`
}

@SinceKotlin(version = "1.4")
public inline fun <R : Comparable<Any>> CharSequence.maxByOrNull(selector: (Char) -> Any): Char? {
   if (`$this$maxByOrNull`.length() == 0) {
      return null
   } else {
      var maxElem: Char = `$this$maxByOrNull`.charAt(0)
      val lastIndex: Int = StringsKt.getLastIndex(`$this$maxByOrNull`)
      if (lastIndex == 0) {
         return maxElem
      } else {
         var maxValue: java.lang.Comparable = selector(maxElem) as java.lang.Comparable
         val var6: IntIterator = IntRange(1, lastIndex).iterator()

         while (var6.hasNext()) {
            val e: Char = `$this$maxByOrNull`.charAt(var6.nextInt())
            val v: java.lang.Comparable = selector(e) as java.lang.Comparable
            if (maxValue.compareTo(v) < 0) {
               maxElem = e
               maxValue = v
            }
         }

         return maxElem
      }
   }
}

@Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = []))
@DeprecatedSinceKotlin(warningSince = "1.5")
public inline fun CharSequence.sumBy(selector: (Char) -> Int): Int {
   var sum: Int = 0
      return sum
}

public inline fun CharSequence.filterNot(predicate: (Char) -> Boolean): CharSequence {
   val `$this$filterNotTo$iv`: java.lang.CharSequence = `$this$filterNot`
   val `destination$iv`: Appendable = StringBuilder()
      return `destination$iv` as java.lang.CharSequence
}

public inline fun <R> CharSequence.map(transform: (Char) -> Any): List<Any> {
   val `$this$mapTo$iv`: java.lang.CharSequence = `$this$map`
   val `destination$iv`: java.util.Collection = ArrayList(`$this$map`.length())
      return `destination$iv` as MutableList<R>
}

public fun CharSequence.toList(): List<Char> {
   var var10000: java.util.List
   when (`$this$toList`.length()) {
      0 -> var10000 = CollectionsKt.emptyList()
      1 -> var10000 = CollectionsKt.listOf(`$this$toList`.charAt(0))
      else -> var10000 = StringsKt.toMutableList(`$this$toList`)
   }

   return var10000
}

public fun CharSequence.singleOrNull(): Char? {
   return if (`$this$singleOrNull`.length() == 1) `$this$singleOrNull`.charAt(0) else null
}

public fun CharSequence.asIterable(): Iterable<Char> {
   return if (`$this$asIterable` is java.lang.String && `$this$asIterable`.length() == 0)
      CollectionsKt.emptyList()
      else
      StringsKt___StringsKt$asIterable$$inlined$Iterable$1(`$this$asIterable`)
   }

public inline fun CharSequence.reduce(operation: (Char, Char) -> Char): Char {
   if (`$this$reduce`.length() == 0) {
      throw UnsupportedOperationException("Empty char sequence can't be reduced.")
   } else {
      var accumulator: Char = `$this$reduce`.charAt(0)
      val var4: IntIterator = IntRange(1, StringsKt.getLastIndex(`$this$reduce`)).iterator()

      while (var4.hasNext()) {
         accumulator = operation(accumulator, `$this$reduce`.charAt(var4.nextInt())) as Character
      }

      return accumulator
   }
}

@JvmName(name = "minOrThrow")
@SinceKotlin(version = "1.7")
public fun CharSequence.min(): Char {
   if (`$this$min`.length() == 0) {
      throw NoSuchElementException()
   } else {
      var min: Char = `$this$min`.charAt(0)
      val var2: IntIterator = IntRange(1, StringsKt.getLastIndex(`$this$min`)).iterator()

      while (var2.hasNext()) {
         val e: Char = `$this$min`.charAt(var2.nextInt())
         if (Intrinsics.compare(min, e) > 0) {
            min = e
         }
      }

      return min
   }
}

@SinceKotlin(version = "1.2")
public fun <R> CharSequence.chunked(size: Int, transform: (CharSequence) -> Any): List<Any> {
   return StringsKt.windowed(`$this$chunked`, size, size, true, transform)
}

public inline fun <K> CharSequence.groupBy(keySelector: (Char) -> Any): Map<Any, List<Char>> {
   val `$this$groupByTo$iv`: java.lang.CharSequence = `$this$groupBy`
   val `destination$iv`: java.util.Map = LinkedHashMap()
      return `destination$iv`
}

@InlineOnly
public inline fun CharSequence.elementAtOrNull(index: Int): Char? {
   return StringsKt.getOrNull(`$this$elementAtOrNull`, index)
}

public inline fun <K, M : MutableMap<in Any, in Char>> CharSequence.associateByTo(destination: Any, keySelector: (Char) -> Any): Any {
      return (M)destination
}

@SinceKotlin(version = "1.4")
public fun CharSequence.maxWithOrNull(comparator: Comparator<in Char>): Char? {
   if (`$this$maxWithOrNull`.length() == 0) {
      return null
   } else {
      var max: Char = `$this$maxWithOrNull`.charAt(0)
      val var3: IntIterator = IntRange(1, StringsKt.getLastIndex(`$this$maxWithOrNull`)).iterator()

      while (var3.hasNext()) {
         val e: Char = `$this$maxWithOrNull`.charAt(var3.nextInt())
         if (comparator.compare(max, e) < 0) {
            max = e
         }
      }

      return max
   }
}

public inline fun <C : Appendable> CharSequence.filterNotTo(destination: Any, predicate: (Char) -> Boolean): Any {
      return (C)destination
}

public infix fun CharSequence.zip(other: CharSequence): List<Pair<Char, Char>> {
   val `$this$zip$iv`: java.lang.CharSequence = `$this$zip`
   val `length$iv`: Int = Math.min(`$this$zip`.length(), other.length())
   val `list$iv`: ArrayList = ArrayList(`length$iv`)

   repeat(`length$iv`) { `i$iv` ->
      `list$iv`.add(`$this$zip$iv`.charAt(`i$iv`) to other.charAt(`i$iv`))
   }

   return `list$iv`
}

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun <R : Comparable<Any>> CharSequence.maxOfOrNull(selector: (Char) -> Any): Any? {
   if (`$this$maxOfOrNull`.length() == 0) {
      return null
   } else {
      var maxValue: java.lang.Comparable = selector(`$this$maxOfOrNull`.charAt(0)) as java.lang.Comparable
      val var3: IntIterator = IntRange(1, StringsKt.getLastIndex(`$this$maxOfOrNull`)).iterator()

      while (var3.hasNext()) {
         val v: java.lang.Comparable = selector(`$this$maxOfOrNull`.charAt(var3.nextInt())) as java.lang.Comparable
         if (maxValue.compareTo(v) < 0) {
            maxValue = v
         }
      }

      return (R)maxValue
   }
}

@InlineOnly
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
public inline fun CharSequence.maxOfOrNull(selector: (Char) -> Double): Double? {
   if (`$this$maxOfOrNull`.length() == 0) {
      return null
   } else {
      var maxValue: Double = (selector(`$this$maxOfOrNull`.charAt(0)) as java.lang.Number).doubleValue()
      val var4: IntIterator = IntRange(1, StringsKt.getLastIndex(`$this$maxOfOrNull`)).iterator()

      while (var4.hasNext()) {
         maxValue = Math.max(maxValue, (selector(`$this$maxOfOrNull`.charAt(var4.nextInt())) as java.lang.Number).doubleValue())
      }

      return maxValue
   }
}

public fun CharSequence.getOrNull(index: Int): Char? {
   return if (index >= 0 && index <= StringsKt.getLastIndex(`$this$getOrNull`)) `$this$getOrNull`.charAt(index) else null
}

public inline fun CharSequence.partition(predicate: (Char) -> Boolean): Pair<CharSequence, CharSequence> {
   val first: StringBuilder = StringBuilder()
   val second: StringBuilder = StringBuilder()
      return Pair<>(first, second)
}

@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public fun CharSequence.randomOrNull(random: Random): Char? {
   return if (`$this$randomOrNull`.length() == 0) null else `$this$randomOrNull`.charAt(random.nextInt(`$this$randomOrNull`.length()))
}

public fun CharSequence.toSet(): Set<Char> {
   var var10000: java.util.Set
   when (`$this$toSet`.length()) {
      0 -> var10000 = SetsKt.emptySet()
      1 -> var10000 = SetsKt.setOf(`$this$toSet`.charAt(0))
      else -> var10000 = StringsKt.toCollection(`$this$toSet`, LinkedHashSet(MapsKt.mapCapacity(RangesKt.coerceAtMost(`$this$toSet`.length(), 128))))
   }

   return var10000
}

@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public inline fun <R> CharSequence.scanIndexed(initial: Any, operation: (Int, Any, Char) -> Any): List<Any> {
   val `$this$runningFoldIndexed$iv`: java.lang.CharSequence = `$this$scanIndexed`
   val var10000: java.util.List
   if (`$this$scanIndexed`.length() == 0) {
      var10000 = CollectionsKt.listOf(initial)
   } else {
      val `accumulator$iv`: ArrayList = ArrayList(`$this$scanIndexed`.length() + 1)
      `accumulator$iv`.add(initial)
      val `result$iv`: ArrayList = `accumulator$iv`
      var var10: Any = initial
      var var11: Int = 0

      for (var12 in `$this$scanIndexed`.length()..var11) {
         var10 = operation(var11, var10, `$this$runningFoldIndexed$iv`.charAt(var11))
         `result$iv`.add(var10)
      }

      var10000 = `result$iv`
   }

   return var10000
}

@InlineOnly
public inline fun String.slice(indices: Iterable<Int>): String {
   return StringsKt.slice((java.lang.CharSequence)`$this$slice`, (java.lang.Iterable<Integer>)indices).toString()
}

public inline fun String.filter(predicate: (Char) -> Boolean): String {
   val `$this$filterTo$iv`: java.lang.CharSequence = `$this$filter`
   val `destination$iv`: Appendable = StringBuilder()
   var `index$iv`: Int = 0

   for (var7 in `$this$filterTo$iv`.length()..`index$iv`) {
      val `element$iv`: Char = `$this$filterTo$iv`.charAt(`index$iv`)
      if (predicate(`element$iv`) as java.lang.Boolean) {
         `destination$iv`.append(`element$iv`)
      }
   }

   val var10000: java.lang.String = (`destination$iv` as StringBuilder).toString()
   return var10000
}

public fun CharSequence.slice(indices: IntRange): CharSequence {
   return if (indices.isEmpty()) "" else StringsKt.subSequence(`$this$slice`, indices)
}

public fun CharSequence.last(): Char {
   if (`$this$last`.length() == 0) {
      throw NoSuchElementException("Char sequence is empty.")
   } else {
      return `$this$last`.charAt(StringsKt.getLastIndex(`$this$last`))
   }
}

public inline fun CharSequence.dropWhile(predicate: (Char) -> Boolean): CharSequence {
   var index: Int = 0

   for (var4 in `$this$dropWhile`.length()..index) {
      if (!predicate(`$this$dropWhile`.charAt(index)) as java.lang.Boolean) {
         return `$this$dropWhile`.subSequence(index, `$this$dropWhile`.length())
      }
   }

   return ""
}

@SinceKotlin(version = "1.4")
@InlineOnly
@OverloadResolutionByLambdaReturnType
public inline fun <R> CharSequence.maxOfWith(comparator: Comparator<in Any>, selector: (Char) -> Any): Any {
   if (`$this$maxOfWith`.length() == 0) {
      throw NoSuchElementException()
   } else {
      var maxValue: Any = selector(`$this$maxOfWith`.charAt(0))
      val var4: IntIterator = IntRange(1, StringsKt.getLastIndex(`$this$maxOfWith`)).iterator()

      while (var4.hasNext()) {
         val v: Any = selector(`$this$maxOfWith`.charAt(var4.nextInt()))
         if (comparator.compare(maxValue, v) < 0) {
            maxValue = v
         }
      }

      return (R)maxValue
   }
}

public inline fun <R> CharSequence.flatMap(transform: (Char) -> Iterable<Any>): List<Any> {
   val `$this$flatMapTo$iv`: java.lang.CharSequence = `$this$flatMap`
   val `destination$iv`: java.util.Collection = ArrayList()
      return `destination$iv` as MutableList<R>
}

public inline fun <K, V> CharSequence.groupBy(keySelector: (Char) -> Any, valueTransform: (Char) -> Any): Map<Any, List<Any>> {
   val `$this$groupByTo$iv`: java.lang.CharSequence = `$this$groupBy`
   val `destination$iv`: java.util.Map = LinkedHashMap()
      return `destination$iv`
}

public inline fun <C : Appendable> CharSequence.filterIndexedTo(destination: Any, predicate: (Int, Char) -> Boolean): Any {
   val `$this$forEachIndexed$iv`: java.lang.CharSequence = `$this$filterIndexedTo`
   val `index$iv`: Int = 0
      return (C)destination
}

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun CharSequence.minOf(selector: (Char) -> Double): Double {
   if (`$this$minOf`.length() == 0) {
      throw NoSuchElementException()
   } else {
      var minValue: Double = (selector(`$this$minOf`.charAt(0)) as java.lang.Number).doubleValue()
      val var4: IntIterator = IntRange(1, StringsKt.getLastIndex(`$this$minOf`)).iterator()

      while (var4.hasNext()) {
         minValue = Math.min(minValue, (selector(`$this$minOf`.charAt(var4.nextInt())) as java.lang.Number).doubleValue())
      }

      return minValue
   }
}

@SinceKotlin(version = "1.3")
public inline fun <V, M : MutableMap<in Char, in Any>> CharSequence.associateWithTo(destination: Any, valueSelector: (Char) -> Any): Any {
      return (M)destination
}

public inline fun CharSequence.indexOfLast(predicate: (Char) -> Boolean): Int {
   var var3: Int = `$this$indexOfLast`.length() + -1
   if (0 <= var3) {
      do {
         val index: Int = var3--
         if (predicate(`$this$indexOfLast`.charAt(index)) as java.lang.Boolean) {
            return index
         }
      } while (0 <= var3)
   }

   return -1
}

public inline fun <K, V, M : MutableMap<in Any, in Any>> CharSequence.associateTo(destination: Any, transform: (Char) -> Pair<Any, Any>): Any {
      return (M)destination
}

public inline fun CharSequence.firstOrNull(predicate: (Char) -> Boolean): Char? {
      return null
}

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun CharSequence.maxOf(selector: (Char) -> Float): Float {
   if (`$this$maxOf`.length() == 0) {
      throw NoSuchElementException()
   } else {
      var maxValue: Float = (selector(`$this$maxOf`.charAt(0)) as java.lang.Number).floatValue()
      val var3: IntIterator = IntRange(1, StringsKt.getLastIndex(`$this$maxOf`)).iterator()

      while (var3.hasNext()) {
         maxValue = Math.max(maxValue, (selector(`$this$maxOf`.charAt(var3.nextInt())) as java.lang.Number).floatValue())
      }

      return maxValue
   }
}

public inline fun String.takeWhile(predicate: (Char) -> Boolean): String {
   var index: Int = 0

   for (var4 in `$this$takeWhile`.length()..index) {
      if (!predicate(`$this$takeWhile`.charAt(index)) as java.lang.Boolean) {
         val var10000: java.lang.String = `$this$takeWhile`.substring(0, index)
         return var10000
      }
   }

   return `$this$takeWhile`
}

public fun CharSequence.none(): Boolean {
   return `$this$none`.length() == 0
}

@OverloadResolutionByLambdaReturnType
@JvmName(name = "sumOfDouble")
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun CharSequence.sumOf(selector: (Char) -> Double): Double {
   var sum: Double = 0.0
      return sum
}

@SinceKotlin(version = "1.3")
public inline fun <V> CharSequence.associateWith(valueSelector: (Char) -> Any): Map<Char, Any> {
   val result: LinkedHashMap = LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(RangesKt.coerceAtMost(`$this$associateWith`.length(), 128)), 16))
   val `$this$associateWithTo$iv`: java.lang.CharSequence = `$this$associateWith`
      return result
}

@SinceKotlin(version = "1.4")
@InlineOnly
@OverloadResolutionByLambdaReturnType
public inline fun <R : Comparable<Any>> CharSequence.minOf(selector: (Char) -> Any): Any {
   if (`$this$minOf`.length() == 0) {
      throw NoSuchElementException()
   } else {
      var minValue: java.lang.Comparable = selector(`$this$minOf`.charAt(0)) as java.lang.Comparable
      val var3: IntIterator = IntRange(1, StringsKt.getLastIndex(`$this$minOf`)).iterator()

      while (var3.hasNext()) {
         val v: java.lang.Comparable = selector(`$this$minOf`.charAt(var3.nextInt())) as java.lang.Comparable
         if (minValue.compareTo(v) > 0) {
            minValue = v
         }
      }

      return (R)minValue
   }
}

public inline fun String.takeLastWhile(predicate: (Char) -> Boolean): String {
   for (index in StringsKt.getLastIndex(`$this$takeLastWhile`) downTo 0) {
      if (!predicate(`$this$takeLastWhile`.charAt(index)) as java.lang.Boolean) {
         val var10000: java.lang.String = `$this$takeLastWhile`.substring(index + 1)
         return var10000
      }
   }

   return `$this$takeLastWhile`
}

public inline fun CharSequence.reduceRight(operation: (Char, Char) -> Char): Char {
   var index: Int = StringsKt.getLastIndex(`$this$reduceRight`)
   if (index < 0) {
      throw UnsupportedOperationException("Empty char sequence can't be reduced.")
   } else {
      var accumulator: Char = `$this$reduceRight`.charAt(index--)

      while (index >= 0) {
         accumulator = operation(`$this$reduceRight`.charAt(index--), accumulator) as Character
      }

      return accumulator
   }
}

@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public inline fun <R> CharSequence.scan(initial: Any, operation: (Any, Char) -> Any): List<Any> {
   val `$this$runningFold$iv`: java.lang.CharSequence = `$this$scan`
   val var10000: java.util.List
   if (`$this$scan`.length() == 0) {
      var10000 = CollectionsKt.listOf(initial)
   } else {
      val `accumulator$iv`: ArrayList = ArrayList(`$this$scan`.length() + 1)
      `accumulator$iv`.add(initial)
      val `result$iv`: ArrayList = `accumulator$iv`
      var var10: Any = initial
            var10000 = `result$iv`
   }

   return var10000
}

@SinceKotlin(version = "1.4")
public fun CharSequence.minWithOrNull(comparator: Comparator<in Char>): Char? {
   if (`$this$minWithOrNull`.length() == 0) {
      return null
   } else {
      var min: Char = `$this$minWithOrNull`.charAt(0)
      val var3: IntIterator = IntRange(1, StringsKt.getLastIndex(`$this$minWithOrNull`)).iterator()

      while (var3.hasNext()) {
         val e: Char = `$this$minWithOrNull`.charAt(var3.nextInt())
         if (comparator.compare(min, e) > 0) {
            min = e
         }
      }

      return min
   }
}

@InlineOnly
public inline fun CharSequence.getOrElse(index: Int, defaultValue: (Int) -> Char): Char {
   return if (index >= 0 && index <= StringsKt.getLastIndex(`$this$getOrElse`)) `$this$getOrElse`.charAt(index) else defaultValue(index) as Character
}

public fun CharSequence.takeLast(n: Int): CharSequence {
   if (n < 0) {
      throw IllegalArgumentException(("Requested character count $n is less than zero.").toString())
   } else {
      val var4: Int = `$this$takeLast`.length()
      return `$this$takeLast`.subSequence(var4 - RangesKt.coerceAtMost(n, var4), var4)
   }
}

public inline fun <K, V, M : MutableMap<in Any, in Any>> CharSequence.associateByTo(destination: Any, keySelector: (Char) -> Any, valueTransform: (Char) -> Any): Any {
      return (M)destination
}

public fun CharSequence.firstOrNull(): Char? {
   return if (`$this$firstOrNull`.length() == 0) null else `$this$firstOrNull`.charAt(0)
}

@OverloadResolutionByLambdaReturnType
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun CharSequence.maxOf(selector: (Char) -> Double): Double {
   if (`$this$maxOf`.length() == 0) {
      throw NoSuchElementException()
   } else {
      var maxValue: Double = (selector(`$this$maxOf`.charAt(0)) as java.lang.Number).doubleValue()
      val var4: IntIterator = IntRange(1, StringsKt.getLastIndex(`$this$maxOf`)).iterator()

      while (var4.hasNext()) {
         maxValue = Math.max(maxValue, (selector(`$this$maxOf`.charAt(var4.nextInt())) as java.lang.Number).doubleValue())
      }

      return maxValue
   }
}

@InlineOnly
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
public inline fun <R> CharSequence.minOfWith(comparator: Comparator<in Any>, selector: (Char) -> Any): Any {
   if (`$this$minOfWith`.length() == 0) {
      throw NoSuchElementException()
   } else {
      var minValue: Any = selector(`$this$minOfWith`.charAt(0))
      val var4: IntIterator = IntRange(1, StringsKt.getLastIndex(`$this$minOfWith`)).iterator()

      while (var4.hasNext()) {
         val v: Any = selector(`$this$minOfWith`.charAt(var4.nextInt()))
         if (comparator.compare(minValue, v) > 0) {
            minValue = v
         }
      }

      return (R)minValue
   }
}

public inline fun String.filterNot(predicate: (Char) -> Boolean): String {
   val `$this$filterNotTo$iv`: java.lang.CharSequence = `$this$filterNot`
   val `destination$iv`: Appendable = StringBuilder()
      val var10000: java.lang.String = (`destination$iv` as StringBuilder).toString()
   return var10000
}

public inline fun CharSequence.dropLastWhile(predicate: (Char) -> Boolean): CharSequence {
   for (index in StringsKt.getLastIndex(`$this$dropLastWhile`) downTo 0) {
      if (!predicate(`$this$dropLastWhile`.charAt(index)) as java.lang.Boolean) {
         return `$this$dropLastWhile`.subSequence(0, index + 1)
      }
   }

   return ""
}

@SinceKotlin(version = "1.7")
@JvmName(name = "maxByOrThrow")
public inline fun <R : Comparable<Any>> CharSequence.maxBy(selector: (Char) -> Any): Char {
   if (`$this$maxBy`.length() == 0) {
      throw NoSuchElementException()
   } else {
      var maxElem: Char = `$this$maxBy`.charAt(0)
      val lastIndex: Int = StringsKt.getLastIndex(`$this$maxBy`)
      if (lastIndex == 0) {
         return maxElem
      } else {
         var maxValue: java.lang.Comparable = selector(maxElem) as java.lang.Comparable
         val var6: IntIterator = IntRange(1, lastIndex).iterator()

         while (var6.hasNext()) {
            val e: Char = `$this$maxBy`.charAt(var6.nextInt())
            val v: java.lang.Comparable = selector(e) as java.lang.Comparable
            if (maxValue.compareTo(v) < 0) {
               maxElem = e
               maxValue = v
            }
         }

         return maxElem
      }
   }
}

@SinceKotlin(version = "1.4")
public inline fun CharSequence.runningReduceIndexed(operation: (Int, Char, Char) -> Char): List<Char> {
   if (`$this$runningReduceIndexed`.length() == 0) {
      return CollectionsKt.emptyList()
   } else {
      var var8: Char = `$this$runningReduceIndexed`.charAt(0)
      val index: ArrayList = ArrayList(`$this$runningReduceIndexed`.length())
      index.add(var8)
      val result: ArrayList = index
      var var9: Int = 1

      for (var10 in `$this$runningReduceIndexed`.length()..var9) {
         var8 = operation(var9, var8, `$this$runningReduceIndexed`.charAt(var9)) as Character
         result.add(var8)
      }

      return result
   }
}

public inline fun <R> CharSequence.foldRightIndexed(initial: Any, operation: (Int, Char, Any) -> Any): Any {
   var index: Int = StringsKt.getLastIndex(`$this$foldRightIndexed`)
   var accumulator: Any = initial

   while (index >= 0) {
      accumulator = operation(index, `$this$foldRightIndexed`.charAt(index), accumulator)
      index--
   }

   return (R)accumulator
}

@InlineOnly
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
public inline fun CharSequence.minOfOrNull(selector: (Char) -> Double): Double? {
   if (`$this$minOfOrNull`.length() == 0) {
      return null
   } else {
      var minValue: Double = (selector(`$this$minOfOrNull`.charAt(0)) as java.lang.Number).doubleValue()
      val var4: IntIterator = IntRange(1, StringsKt.getLastIndex(`$this$minOfOrNull`)).iterator()

      while (var4.hasNext()) {
         minValue = Math.min(minValue, (selector(`$this$minOfOrNull`.charAt(var4.nextInt())) as java.lang.Number).doubleValue())
      }

      return minValue
   }
}

public inline fun CharSequence.none(predicate: (Char) -> Boolean): Boolean {
      return true
}

@SinceKotlin(version = "1.2")
public fun <R> CharSequence.windowed(size: Int, step: Int = 1, partialWindows: Boolean = false, transform: (CharSequence) -> Any): List<Any> {
   SlidingWindowKt.checkWindowSizeStep(size, step)
   val thisSize: Int = `$this$windowed`.length()
   val result: ArrayList = ArrayList(thisSize / step + (if (thisSize % step == 0) 0 else 1))

   // $VF: Unable to resugar Kotlin loop from Java for loop
   var index: Int = 0
   while (true) {
      if (0 <= index && index < thisSize) break
      val end: Int = index + size
      val var10000: Int
      if (index + size >= 0 && index + size <= thisSize) {
         var10000 = end
      } else {
         if (!partialWindows) {
            break
         }

         var10000 = thisSize
      }

      result.add(transform(`$this$windowed`.subSequence(index, var10000)))

      index += step
   }

   return result
}

public fun CharSequence.reversed(): CharSequence {
   val var10000: StringBuilder = StringBuilder(`$this$reversed`).reverse()
   return var10000
}

@OverloadResolutionByLambdaReturnType
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun <R> CharSequence.maxOfWithOrNull(comparator: Comparator<in Any>, selector: (Char) -> Any): Any? {
   if (`$this$maxOfWithOrNull`.length() == 0) {
      return null
   } else {
      var maxValue: Any = selector(`$this$maxOfWithOrNull`.charAt(0))
      val var4: IntIterator = IntRange(1, StringsKt.getLastIndex(`$this$maxOfWithOrNull`)).iterator()

      while (var4.hasNext()) {
         val v: Any = selector(`$this$maxOfWithOrNull`.charAt(var4.nextInt()))
         if (comparator.compare(maxValue, v) < 0) {
            maxValue = v
         }
      }

      return (R)maxValue
   }
}

public inline fun <R> CharSequence.fold(initial: Any, operation: (Any, Char) -> Any): Any {
   var accumulator: Any = initial
      return (R)accumulator
}

public fun CharSequence.asSequence(): Sequence<Char> {
   return if (`$this$asSequence` is java.lang.String && `$this$asSequence`.length() == 0)
      SequencesKt.emptySequence()
      else
      StringsKt___StringsKt$asSequence$$inlined$Sequence$1(`$this$asSequence`)
   }

public fun CharSequence.single(): Char {
   when (`$this$single`.length()) {
      0 -> throw NoSuchElementException("Char sequence is empty.")
      1 -> return `$this$single`.charAt(0)
      else -> throw IllegalArgumentException("Char sequence has more than one element.")
   }
}

public fun CharSequence.slice(indices: Iterable<Int>): CharSequence {
   val size: Int = CollectionsKt.collectionSizeOrDefault(indices, 10)
   if (size == 0) {
      return ""
   } else {
      val result: StringBuilder = StringBuilder(size)
      val var4: java.util.Iterator = indices.iterator()

      while (var4.hasNext()) {
         result.append(`$this$slice`.charAt((var4.next() as java.lang.Number).intValue()))
      }

      return result
   }
}

@SinceKotlin(version = "1.4")
@InlineOnly
@OverloadResolutionByLambdaReturnType
public inline fun CharSequence.minOf(selector: (Char) -> Float): Float {
   if (`$this$minOf`.length() == 0) {
      throw NoSuchElementException()
   } else {
      var minValue: Float = (selector(`$this$minOf`.charAt(0)) as java.lang.Number).floatValue()
      val var3: IntIterator = IntRange(1, StringsKt.getLastIndex(`$this$minOf`)).iterator()

      while (var3.hasNext()) {
         minValue = Math.min(minValue, (selector(`$this$minOf`.charAt(var3.nextInt())) as java.lang.Number).floatValue())
      }

      return minValue
   }
}

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun <R> CharSequence.minOfWithOrNull(comparator: Comparator<in Any>, selector: (Char) -> Any): Any? {
   if (`$this$minOfWithOrNull`.length() == 0) {
      return null
   } else {
      var minValue: Any = selector(`$this$minOfWithOrNull`.charAt(0))
      val var4: IntIterator = IntRange(1, StringsKt.getLastIndex(`$this$minOfWithOrNull`)).iterator()

      while (var4.hasNext()) {
         val v: Any = selector(`$this$minOfWithOrNull`.charAt(var4.nextInt()))
         if (comparator.compare(minValue, v) > 0) {
            minValue = v
         }
      }

      return (R)minValue
   }
}

@SinceKotlin(version = "1.7")
@JvmName(name = "minWithOrThrow")
public fun CharSequence.minWith(comparator: Comparator<in Char>): Char {
   if (`$this$minWith`.length() == 0) {
      throw NoSuchElementException()
   } else {
      var min: Char = `$this$minWith`.charAt(0)
      val var3: IntIterator = IntRange(1, StringsKt.getLastIndex(`$this$minWith`)).iterator()

      while (var3.hasNext()) {
         val e: Char = `$this$minWith`.charAt(var3.nextInt())
         if (comparator.compare(min, e) > 0) {
            min = e
         }
      }

      return min
   }
}

@InlineOnly
public inline fun CharSequence.count(): Int {
   return `$this$count`.length()
}

public fun CharSequence.first(): Char {
   if (`$this$first`.length() == 0) {
      throw NoSuchElementException("Char sequence is empty.")
   } else {
      return `$this$first`.charAt(0)
   }
}

@SinceKotlin(version = "1.7")
@JvmName(name = "maxWithOrThrow")
public fun CharSequence.maxWith(comparator: Comparator<in Char>): Char {
   if (`$this$maxWith`.length() == 0) {
      throw NoSuchElementException()
   } else {
      var max: Char = `$this$maxWith`.charAt(0)
      val var3: IntIterator = IntRange(1, StringsKt.getLastIndex(`$this$maxWith`)).iterator()

      while (var3.hasNext()) {
         val e: Char = `$this$maxWith`.charAt(var3.nextInt())
         if (comparator.compare(max, e) < 0) {
            max = e
         }
      }

      return max
   }
}

public inline fun <R : Any, C : MutableCollection<in Any>> CharSequence.mapNotNullTo(destination: Any, transform: (Char) -> Any?): Any {
   val `$this$forEach$iv`: java.lang.CharSequence = `$this$mapNotNullTo`
      return (C)destination
}

@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@SinceKotlin(version = "1.5")
@JvmName(name = "sumOfULong")
@InlineOnly
@OverloadResolutionByLambdaReturnType
public inline fun CharSequence.sumOf(selector: (Char) -> ULong): ULong {
   var sum: Long = ULong.constructor_impl/* $VF was: constructor-impl */(0L)
      return sum
}

@InlineOnly
public inline fun CharSequence.elementAtOrElse(index: Int, defaultValue: (Int) -> Char): Char {
   return if (index >= 0 && index <= StringsKt.getLastIndex(`$this$elementAtOrElse`))
      `$this$elementAtOrElse`.charAt(index)
      else
      defaultValue(index) as Character
   }

public inline fun CharSequence.takeWhile(predicate: (Char) -> Boolean): CharSequence {
   var index: Int = 0

   for (var4 in `$this$takeWhile`.length()..index) {
      if (!predicate(`$this$takeWhile`.charAt(index)) as java.lang.Boolean) {
         return `$this$takeWhile`.subSequence(0, index)
      }
   }

   return `$this$takeWhile`.subSequence(0, `$this$takeWhile`.length())
}

@SinceKotlin(version = "1.4")
public inline fun <R : Comparable<Any>> CharSequence.minByOrNull(selector: (Char) -> Any): Char? {
   if (`$this$minByOrNull`.length() == 0) {
      return null
   } else {
      var minElem: Char = `$this$minByOrNull`.charAt(0)
      val lastIndex: Int = StringsKt.getLastIndex(`$this$minByOrNull`)
      if (lastIndex == 0) {
         return minElem
      } else {
         var minValue: java.lang.Comparable = selector(minElem) as java.lang.Comparable
         val var6: IntIterator = IntRange(1, lastIndex).iterator()

         while (var6.hasNext()) {
            val e: Char = `$this$minByOrNull`.charAt(var6.nextInt())
            val v: java.lang.Comparable = selector(e) as java.lang.Comparable
            if (minValue.compareTo(v) > 0) {
               minElem = e
               minValue = v
            }
         }

         return minElem
      }
   }
}

@InlineOnly
@JvmName(name = "sumOfInt")
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
public inline fun CharSequence.sumOf(selector: (Char) -> Int): Int {
   var sum: Int = 0
      return sum
}

public fun CharSequence.take(n: Int): CharSequence {
   if (n < 0) {
      throw IllegalArgumentException(("Requested character count $n is less than zero.").toString())
   } else {
      return `$this$take`.subSequence(0, RangesKt.coerceAtMost(n, `$this$take`.length()))
   }
}

@SinceKotlin(version = "1.4")
@InlineOnly
@OverloadResolutionByLambdaReturnType
public inline fun <R : Comparable<Any>> CharSequence.minOfOrNull(selector: (Char) -> Any): Any? {
   if (`$this$minOfOrNull`.length() == 0) {
      return null
   } else {
      var minValue: java.lang.Comparable = selector(`$this$minOfOrNull`.charAt(0)) as java.lang.Comparable
      val var3: IntIterator = IntRange(1, StringsKt.getLastIndex(`$this$minOfOrNull`)).iterator()

      while (var3.hasNext()) {
         val v: java.lang.Comparable = selector(`$this$minOfOrNull`.charAt(var3.nextInt())) as java.lang.Comparable
         if (minValue.compareTo(v) > 0) {
            minValue = v
         }
      }

      return (R)minValue
   }
}

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun <R : Comparable<Any>> CharSequence.maxOf(selector: (Char) -> Any): Any {
   if (`$this$maxOf`.length() == 0) {
      throw NoSuchElementException()
   } else {
      var maxValue: java.lang.Comparable = selector(`$this$maxOf`.charAt(0)) as java.lang.Comparable
      val var3: IntIterator = IntRange(1, StringsKt.getLastIndex(`$this$maxOf`)).iterator()

      while (var3.hasNext()) {
         val v: java.lang.Comparable = selector(`$this$maxOf`.charAt(var3.nextInt())) as java.lang.Comparable
         if (maxValue.compareTo(v) < 0) {
            maxValue = v
         }
      }

      return (R)maxValue
   }
}

public fun String.take(n: Int): String {
   if (n < 0) {
      throw IllegalArgumentException(("Requested character count $n is less than zero.").toString())
   } else {
      val var10000: java.lang.String = `$this$take`.substring(0, RangesKt.coerceAtMost(n, `$this$take`.length()))
      return var10000
   }
}

@DeprecatedSinceKotlin(warningSince = "1.5")
@Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = []))
public inline fun CharSequence.sumByDouble(selector: (Char) -> Double): Double {
   var sum: Double = 0.0
      return sum
}

@SinceKotlin(version = "1.7")
@JvmName(name = "minByOrThrow")
public inline fun <R : Comparable<Any>> CharSequence.minBy(selector: (Char) -> Any): Char {
   if (`$this$minBy`.length() == 0) {
      throw NoSuchElementException()
   } else {
      var minElem: Char = `$this$minBy`.charAt(0)
      val lastIndex: Int = StringsKt.getLastIndex(`$this$minBy`)
      if (lastIndex == 0) {
         return minElem
      } else {
         var minValue: java.lang.Comparable = selector(minElem) as java.lang.Comparable
         val var6: IntIterator = IntRange(1, lastIndex).iterator()

         while (var6.hasNext()) {
            val e: Char = `$this$minBy`.charAt(var6.nextInt())
            val v: java.lang.Comparable = selector(e) as java.lang.Comparable
            if (minValue.compareTo(v) > 0) {
               minElem = e
               minValue = v
            }
         }

         return minElem
      }
   }
}

public inline fun <C : Appendable> CharSequence.filterTo(destination: Any, predicate: (Char) -> Boolean): Any {
   var index: Int = 0

   for (var5 in `$this$filterTo`.length()..index) {
      val element: Char = `$this$filterTo`.charAt(index)
      if (predicate(element) as java.lang.Boolean) {
         destination.append(element)
      }
   }

   return (C)destination
}

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@OverloadResolutionByLambdaReturnType
@InlineOnly
@JvmName(name = "sumOfUInt")
public inline fun CharSequence.sumOf(selector: (Char) -> UInt): UInt {
   var sum: Int = UInt.constructor_impl/* $VF was: constructor-impl */(0)
      return sum
}

public inline fun CharSequence.indexOfFirst(predicate: (Char) -> Boolean): Int {
   var index: Int = 0

   for (var4 in `$this$indexOfFirst`.length()..index) {
      if (predicate(`$this$indexOfFirst`.charAt(index)) as java.lang.Boolean) {
         return index
      }
   }

   return -1
}

public inline fun <R : Any> CharSequence.mapNotNull(transform: (Char) -> Any?): List<Any> {
   val `destination$iv`: java.util.Collection = ArrayList()
   val `$this$forEach$iv$iv`: java.lang.CharSequence = `$this$mapNotNull`
      return `destination$iv` as MutableList<R>
}

public inline fun CharSequence.forEach(action: (Char) -> Unit) {
   }

@SinceKotlin(version = "1.2")
public fun <R> CharSequence.chunkedSequence(size: Int, transform: (CharSequence) -> Any): Sequence<Any> {
   return StringsKt.windowedSequence(`$this$chunkedSequence`, size, size, true, transform)
}

@InlineOnly
@SinceKotlin(version = "1.5")
public inline fun <R : Any> CharSequence.firstNotNullOfOrNull(transform: (Char) -> Any?): Any? {
      return null
}

public fun CharSequence.toHashSet(): HashSet<Char> {
   return StringsKt.toCollection(`$this$toHashSet`, HashSet<>(MapsKt.mapCapacity(RangesKt.coerceAtMost(`$this$toHashSet`.length(), 128))))
}

public fun CharSequence.toMutableList(): MutableList<Char> {
   return StringsKt.toCollection(`$this$toMutableList`, ArrayList<>(`$this$toMutableList`.length()))
}

@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
@InlineOnly
public inline fun CharSequence.maxOfOrNull(selector: (Char) -> Float): Float? {
   if (`$this$maxOfOrNull`.length() == 0) {
      return null
   } else {
      var maxValue: Float = (selector(`$this$maxOfOrNull`.charAt(0)) as java.lang.Number).floatValue()
      val var3: IntIterator = IntRange(1, StringsKt.getLastIndex(`$this$maxOfOrNull`)).iterator()

      while (var3.hasNext()) {
         maxValue = Math.max(maxValue, (selector(`$this$maxOfOrNull`.charAt(var3.nextInt())) as java.lang.Number).floatValue())
      }

      return maxValue
   }
}

open fun StringsKt___StringsKt() {
}

public fun String.drop(n: Int): String {
   if (n < 0) {
      throw IllegalArgumentException(("Requested character count $n is less than zero.").toString())
   } else {
      val var10000: java.lang.String = `$this$drop`.substring(RangesKt.coerceAtMost(n, `$this$drop`.length()))
      return var10000
   }
}

@SinceKotlin(version = "1.2")
public fun CharSequence.chunked(size: Int): List<String> {
   return StringsKt.windowed(`$this$chunked`, size, size, true)
}

public inline fun <R : Any> CharSequence.mapIndexedNotNull(transform: (Int, Char) -> Any?): List<Any> {
   val `destination$iv`: java.util.Collection = ArrayList()
   val `$this$forEachIndexed$iv$iv`: java.lang.CharSequence = `$this$mapIndexedNotNull`
   var `index$iv$iv`: Int = 0
      return `destination$iv` as MutableList<R>
}

public inline fun CharSequence.takeLastWhile(predicate: (Char) -> Boolean): CharSequence {
   for (index in StringsKt.getLastIndex(`$this$takeLastWhile`) downTo 0) {
      if (!predicate(`$this$takeLastWhile`.charAt(index)) as java.lang.Boolean) {
         return `$this$takeLastWhile`.subSequence(index + 1, `$this$takeLastWhile`.length())
      }
   }

   return `$this$takeLastWhile`.subSequence(0, `$this$takeLastWhile`.length())
}

public inline fun CharSequence.filter(predicate: (Char) -> Boolean): CharSequence {
   val `$this$filterTo$iv`: java.lang.CharSequence = `$this$filter`
   val `destination$iv`: Appendable = StringBuilder()
   var `index$iv`: Int = 0

   for (var7 in `$this$filter`.length()..`index$iv`) {
      val `element$iv`: Char = `$this$filterTo$iv`.charAt(`index$iv`)
      if (predicate(`element$iv`) as java.lang.Boolean) {
         `destination$iv`.append(`element$iv`)
      }
   }

   return `destination$iv` as java.lang.CharSequence
}

public inline fun <K, V, M : MutableMap<in Any, MutableList<Any>>> CharSequence.groupByTo(
   destination: Any,
   keySelector: (Char) -> Any,
   valueTransform: (Char) -> Any
): Any {
      return (M)destination
}

@SinceKotlin(version = "1.4")
public inline fun CharSequence.reduceRightIndexedOrNull(operation: (Int, Char, Char) -> Char): Char? {
   var index: Int = StringsKt.getLastIndex(`$this$reduceRightIndexedOrNull`)
   if (index < 0) {
      return null
   } else {
      var accumulator: Char = `$this$reduceRightIndexedOrNull`.charAt(index--)

      while (index >= 0) {
         accumulator = operation(index, `$this$reduceRightIndexedOrNull`.charAt(index), accumulator) as Character
         index--
      }

      return accumulator
   }
}

public inline fun <R, C : MutableCollection<in Any>> CharSequence.mapIndexedTo(destination: Any, transform: (Int, Char) -> Any): Any {
   var index: Int = 0
      return (C)destination
}

public inline fun <K, M : MutableMap<in Any, MutableList<Char>>> CharSequence.groupByTo(destination: Any, keySelector: (Char) -> Any): Any {
      return (M)destination
}

@SinceKotlin(version = "1.4")
public inline fun <R> CharSequence.runningFoldIndexed(initial: Any, operation: (Int, Any, Char) -> Any): List<Any> {
   if (`$this$runningFoldIndexed`.length() == 0) {
      return (java.util.List<R>)CollectionsKt.listOf(initial)
   } else {
      var accumulator: Any = ArrayList(`$this$runningFoldIndexed`.length() + 1)
      accumulator.add(initial)
      val result: Any = accumulator
      accumulator = initial
      var var9: Int = 0

      for (var10 in `$this$runningFoldIndexed`.length()..var9) {
         accumulator = operation(var9, accumulator, `$this$runningFoldIndexed`.charAt(var9))
         result.add(accumulator)
      }

      return result as MutableList<R>
   }
}

@SinceKotlin(version = "1.4")
public inline fun CharSequence.reduceIndexedOrNull(operation: (Int, Char, Char) -> Char): Char? {
   if (`$this$reduceIndexedOrNull`.length() == 0) {
      return null
   } else {
      var accumulator: Char = `$this$reduceIndexedOrNull`.charAt(0)
      val var4: IntIterator = IntRange(1, StringsKt.getLastIndex(`$this$reduceIndexedOrNull`)).iterator()

      while (var4.hasNext()) {
         val index: Int = var4.nextInt()
         accumulator = operation(index, accumulator, `$this$reduceIndexedOrNull`.charAt(index)) as Character
      }

      return accumulator
   }
}

@SinceKotlin(version = "1.4")
public fun CharSequence.minOrNull(): Char? {
   if (`$this$minOrNull`.length() == 0) {
      return null
   } else {
      var min: Char = `$this$minOrNull`.charAt(0)
      val var2: IntIterator = IntRange(1, StringsKt.getLastIndex(`$this$minOrNull`)).iterator()

      while (var2.hasNext()) {
         val e: Char = `$this$minOrNull`.charAt(var2.nextInt())
         if (Intrinsics.compare(min, e) > 0) {
            min = e
         }
      }

      return min
   }
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.4")
public inline fun CharSequence.reduceOrNull(operation: (Char, Char) -> Char): Char? {
   if (`$this$reduceOrNull`.length() == 0) {
      return null
   } else {
      var accumulator: Char = `$this$reduceOrNull`.charAt(0)
      val var4: IntIterator = IntRange(1, StringsKt.getLastIndex(`$this$reduceOrNull`)).iterator()

      while (var4.hasNext()) {
         accumulator = operation(accumulator, `$this$reduceOrNull`.charAt(var4.nextInt())) as Character
      }

      return accumulator
   }
}

public inline fun CharSequence.single(predicate: (Char) -> Boolean): Char {
   var single: Character = null
   var found: Boolean = false
      if (!found) {
      throw NoSuchElementException("Char sequence contains no character matching the predicate.")
   } else {
      return single
   }
}

public inline fun String.partition(predicate: (Char) -> Boolean): Pair<String, String> {
   val first: StringBuilder = StringBuilder()
   val second: StringBuilder = StringBuilder()
   var var5: Int = 0

   for (var6 in `$this$partition`.length()..var5) {
      val element: Char = `$this$partition`.charAt(var5)
      if (predicate(element) as java.lang.Boolean) {
         first.append(element)
      } else {
         second.append(element)
      }
   }

   val var10002: java.lang.String = first.toString()
   val var10003: java.lang.String = second.toString()
   return Pair<>(var10002, var10003)
}

public fun <C : MutableCollection<in Char>> CharSequence.toCollection(destination: Any): Any {
      return (C)destination
}

@SinceKotlin(version = "1.2")
public inline fun <R> CharSequence.zipWithNext(transform: (Char, Char) -> Any): List<Any> {
   val size: Int = `$this$zipWithNext`.length() - 1
   if (size < 1) {
      return CollectionsKt.emptyList()
   } else {
      val result: ArrayList = ArrayList(size)

      repeat(size) { index ->
         result.add(transform(`$this$zipWithNext`.charAt(index), `$this$zipWithNext`.charAt(index + 1)))
      }

      return result
   }
}

public inline fun String.dropWhile(predicate: (Char) -> Boolean): String {
   var index: Int = 0

   for (var4 in `$this$dropWhile`.length()..index) {
      if (!predicate(`$this$dropWhile`.charAt(index)) as java.lang.Boolean) {
         val var10000: java.lang.String = `$this$dropWhile`.substring(index)
         return var10000
      }
   }

   return ""
}

@SinceKotlin(version = "1.7")
@JvmName(name = "maxOrThrow")
public fun CharSequence.max(): Char {
   if (`$this$max`.length() == 0) {
      throw NoSuchElementException()
   } else {
      var max: Char = `$this$max`.charAt(0)
      val var2: IntIterator = IntRange(1, StringsKt.getLastIndex(`$this$max`)).iterator()

      while (var2.hasNext()) {
         val e: Char = `$this$max`.charAt(var2.nextInt())
         if (Intrinsics.compare(max, e) < 0) {
            max = e
         }
      }

      return max
   }
}

@SinceKotlin(version = "1.2")
public fun CharSequence.windowed(size: Int, step: Int = 1, partialWindows: Boolean = false): List<String> {
   return StringsKt.windowed(`$this$windowed`, size, step, partialWindows, { it ->
      it.toString()
   })
}

public inline fun <K, V> CharSequence.associate(transform: (Char) -> Pair<Any, Any>): Map<Any, Any> {
   val capacity: Int = RangesKt.coerceAtLeast(MapsKt.mapCapacity(`$this$associate`.length()), 16)
   val `$this$associateTo$iv`: java.lang.CharSequence = `$this$associate`
   val `destination$iv`: java.util.Map = LinkedHashMap(capacity)
      return `destination$iv`
}

public fun CharSequence.lastOrNull(): Char? {
   return if (`$this$lastOrNull`.length() == 0) null else `$this$lastOrNull`.charAt(`$this$lastOrNull`.length() - 1)
}

@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
@InlineOnly
@JvmName(name = "sumOfLong")
public inline fun CharSequence.sumOf(selector: (Char) -> Long): Long {
   var sum: Long = 0L
      return sum
}

@SinceKotlin(version = "1.2")
public fun CharSequence.windowedSequence(size: Int, step: Int = 1, partialWindows: Boolean = false): Sequence<String> {
   return StringsKt.windowedSequence(`$this$windowedSequence`, size, step, partialWindows, { it ->
      it.toString()
   })
}

public inline fun CharSequence.forEachIndexed(action: (Int, Char) -> Unit) {
   var index: Int = 0
   }

public fun CharSequence.withIndex(): Iterable<IndexedValue<Char>> {
   return IndexingIterable<>(   // $VF: Compiled from _Strings.kt
{
      return StringsKt.iterator($this$withIndex)
   } as () -> MutableIterator<Character>)
}

public inline fun CharSequence.reduceRightIndexed(operation: (Int, Char, Char) -> Char): Char {
   var index: Int = StringsKt.getLastIndex(`$this$reduceRightIndexed`)
   if (index < 0) {
      throw UnsupportedOperationException("Empty char sequence can't be reduced.")
   } else {
      var accumulator: Char = `$this$reduceRightIndexed`.charAt(index--)

      while (index >= 0) {
         accumulator = operation(index, `$this$reduceRightIndexed`.charAt(index), accumulator) as Character
         index--
      }

      return accumulator
   }
}

public fun CharSequence.any(): Boolean {
   return `$this$any`.length() != 0
}

@SinceKotlin(version = "1.2")
public fun CharSequence.zipWithNext(): List<Pair<Char, Char>> {
   val `$this$zipWithNext$iv`: java.lang.CharSequence = `$this$zipWithNext`
   val `size$iv`: Int = `$this$zipWithNext`.length() - 1
   val var10000: java.util.List
   if (`size$iv` < 1) {
      var10000 = CollectionsKt.emptyList()
   } else {
      val `result$iv`: ArrayList = ArrayList(`size$iv`)

      repeat(`size$iv`) { `index$iv` ->
         `result$iv`.add(`$this$zipWithNext$iv`.charAt(`index$iv`) to `$this$zipWithNext$iv`.charAt(`index$iv` + 1))
      }

      var10000 = `result$iv`
   }

   return var10000
}

public inline fun CharSequence.all(predicate: (Char) -> Boolean): Boolean {
      return true
}

public inline fun CharSequence.lastOrNull(predicate: (Char) -> Boolean): Char? {
   var var3: Int = `$this$lastOrNull`.length() + -1
   if (0 <= var3) {
      do {
         val element: Char = `$this$lastOrNull`.charAt(var3--)
         if (predicate(element) as java.lang.Boolean) {
            return element
         }
      } while (0 <= var3)
   }

   return null
}

@JvmName(name = "flatMapIndexedIterable")
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun <R> CharSequence.flatMapIndexed(transform: (Int, Char) -> Iterable<Any>): List<Any> {
   val var2: java.lang.CharSequence = `$this$flatMapIndexed`
   val var3: java.util.Collection = ArrayList()
   var var4: Int = 0
      return var3 as MutableList<R>
}

@SinceKotlin(version = "1.2")
public fun CharSequence.chunkedSequence(size: Int): Sequence<String> {
   return StringsKt.chunkedSequence(`$this$chunkedSequence`, size, { it ->
      it.toString()
   })
}

public inline fun String.dropLastWhile(predicate: (Char) -> Boolean): String {
   for (index in StringsKt.getLastIndex(`$this$dropLastWhile`) downTo 0) {
      if (!predicate(`$this$dropLastWhile`.charAt(index)) as java.lang.Boolean) {
         val var10000: java.lang.String = `$this$dropLastWhile`.substring(0, index + 1)
         return var10000
      }
   }

   return ""
}

@SinceKotlin(version = "1.2")
public fun <R> CharSequence.windowedSequence(size: Int, step: Int = 1, partialWindows: Boolean = false, transform: (CharSequence) -> Any): Sequence<Any> {
   SlidingWindowKt.checkWindowSizeStep(size, step)
   return SequencesKt.map(
      CollectionsKt.asSequence(
         RangesKt.step(
            if (partialWindows) StringsKt.getIndices(`$this$windowedSequence`) else RangesKt.until((int)0, (int)(`$this$windowedSequence`.length() - size + 1)),
            step
         )
      ),
         // $VF: Compiled from _Strings.kt
   { index: Int ->
         val end: Int = index + size
         return (R)transform(
            $this$windowedSequence.subSequence(
               index, if (index + size >= 0 && index + size <= $this$windowedSequence.length()) end else $this$windowedSequence.length()
            )
         )
      } as Function1
   )
}

public inline fun <R, C : MutableCollection<in Any>> CharSequence.flatMapTo(destination: Any, transform: (Char) -> Iterable<Any>): Any {
      return (C)destination
}

public fun String.slice(indices: IntRange): String {
   return if (indices.isEmpty()) "" else StringsKt.substring(`$this$slice`, indices)
}

@SinceKotlin(version = "1.4")
@InlineOnly
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public inline fun CharSequence.randomOrNull(): Char? {
   return StringsKt.randomOrNull(`$this$randomOrNull`, Random.Default)
}

public inline fun CharSequence.reduceIndexed(operation: (Int, Char, Char) -> Char): Char {
   if (`$this$reduceIndexed`.length() == 0) {
      throw UnsupportedOperationException("Empty char sequence can't be reduced.")
   } else {
      var accumulator: Char = `$this$reduceIndexed`.charAt(0)
      val var4: IntIterator = IntRange(1, StringsKt.getLastIndex(`$this$reduceIndexed`)).iterator()

      while (var4.hasNext()) {
         val index: Int = var4.nextInt()
         accumulator = operation(index, accumulator, `$this$reduceIndexed`.charAt(index)) as Character
      }

      return accumulator
   }
}

@SinceKotlin(version = "1.4")
public inline fun CharSequence.runningReduce(operation: (Char, Char) -> Char): List<Char> {
   if (`$this$runningReduce`.length() == 0) {
      return CollectionsKt.emptyList()
   } else {
      var var8: Char = `$this$runningReduce`.charAt(0)
      val index: ArrayList = ArrayList(`$this$runningReduce`.length())
      index.add(var8)
      val result: ArrayList = index
      var var9: Int = 1

      for (var10 in `$this$runningReduce`.length()..var9) {
         var8 = operation(var8, `$this$runningReduce`.charAt(var9)) as Character
         result.add(var8)
      }

      return result
   }
}

public inline fun <R : Any, C : MutableCollection<in Any>> CharSequence.mapIndexedNotNullTo(destination: Any, transform: (Int, Char) -> Any?): Any {
   val `$this$forEachIndexed$iv`: java.lang.CharSequence = `$this$mapIndexedNotNullTo`
   var `index$iv`: Int = 0
      return (C)destination
}

public inline fun <V> CharSequence.zip(other: CharSequence, transform: (Char, Char) -> Any): List<Any> {
   val length: Int = Math.min(`$this$zip`.length(), other.length())
   val list: ArrayList = ArrayList(length)

   repeat(length) { i ->
      list.add(transform(`$this$zip`.charAt(i), other.charAt(i)))
   }

   return list
}

public inline fun <R, C : MutableCollection<in Any>> CharSequence.mapTo(destination: Any, transform: (Char) -> Any): Any {
      return (C)destination
}

public inline fun CharSequence.any(predicate: (Char) -> Boolean): Boolean {
      return false
}

@SinceKotlin(version = "1.4")
public fun CharSequence.maxOrNull(): Char? {
   if (`$this$maxOrNull`.length() == 0) {
      return null
   } else {
      var max: Char = `$this$maxOrNull`.charAt(0)
      val var2: IntIterator = IntRange(1, StringsKt.getLastIndex(`$this$maxOrNull`)).iterator()

      while (var2.hasNext()) {
         val e: Char = `$this$maxOrNull`.charAt(var2.nextInt())
         if (Intrinsics.compare(max, e) < 0) {
            max = e
         }
      }

      return max
   }
}

public inline fun CharSequence.last(predicate: (Char) -> Boolean): Char {
   var var3: Int = `$this$last`.length() + -1
   if (0 <= var3) {
      do {
         val element: Char = `$this$last`.charAt(var3--)
         if (predicate(element) as java.lang.Boolean) {
            return element
         }
      } while (0 <= var3)
   }

   throw NoSuchElementException("Char sequence contains no character matching the predicate.")
}

@OverloadResolutionByLambdaReturnType
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun CharSequence.minOfOrNull(selector: (Char) -> Float): Float? {
   if (`$this$minOfOrNull`.length() == 0) {
      return null
   } else {
      var minValue: Float = (selector(`$this$minOfOrNull`.charAt(0)) as java.lang.Number).floatValue()
      val var3: IntIterator = IntRange(1, StringsKt.getLastIndex(`$this$minOfOrNull`)).iterator()

      while (var3.hasNext()) {
         minValue = Math.min(minValue, (selector(`$this$minOfOrNull`.charAt(var3.nextInt())) as java.lang.Number).floatValue())
      }

      return minValue
   }
}

@SinceKotlin(version = "1.1")
public inline fun <S : CharSequence> Any.onEach(action: (Char) -> Unit): Any {
   val `$this$onEach_u24lambda_u2415`: java.lang.CharSequence = `$this$onEach`
      return (S)`$this$onEach`
}

@SinceKotlin(version = "1.4")
public inline fun <S : CharSequence> Any.onEachIndexed(action: (Int, Char) -> Unit): Any {
   val `$this$forEachIndexed$iv`: java.lang.CharSequence = `$this$onEachIndexed`
   var `index$iv`: Int = 0
      return (S)`$this$onEachIndexed`
}
