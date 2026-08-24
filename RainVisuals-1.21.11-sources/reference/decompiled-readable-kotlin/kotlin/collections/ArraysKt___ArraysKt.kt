@file:JvmMultifileClass
@file:JvmName("ArraysKt")

package kotlin.collections

import java.util.ArrayList
import java.util.Arrays
import java.util.Comparator
import java.util.HashSet
import java.util.LinkedHashMap
import java.util.LinkedHashSet
import java.util.NoSuchElementException
import kotlin.internal.InlineOnly
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.ArrayIteratorKt
import kotlin.jvm.internal.ArrayIteratorsKt
import kotlin.jvm.internal.Intrinsics
import kotlin.random.Random

// $VF: Compiled from _Arrays.kt
public fun FloatArray.toMutableList(): MutableList<Float> {
   val list: ArrayList = ArrayList(`$this$toMutableList`.length)

   for (item in `$this$toMutableList`) {
      list.add(item)
   }

   return list
}

public fun CharArray.last(): Char {
   if (`$this$last`.length == 0) {
      throw NoSuchElementException("Array is empty.")
   } else {
      return `$this$last`[ArraysKt.getLastIndex(`$this$last`)]
   }
}

@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@InlineOnly
public inline fun <R> BooleanArray.scan(initial: Any, operation: (Any, Boolean) -> Any): List<Any> {
   val var10000: java.util.List
   if (`$this$scan`.length == 0) {
      var10000 = CollectionsKt.listOf(initial)
   } else {
      val var4: ArrayList = ArrayList(`$this$scan`.length + 1)
      var4.add(initial)
      val var6: ArrayList = var4
      var var9: Any = initial

      for (var8 in `$this$scan`) {
         var9 = operation(var9, var8)
         var6.add(var9)
      }

      var10000 = var6
   }

   return var10000
}

public inline fun <K, V> IntArray.associateBy(keySelector: (Int) -> Any, valueTransform: (Int) -> Any): Map<Any, Any> {
   val `destination$iv`: java.util.Map = LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(`$this$associateBy`.length), 16))

   for (`element$iv` in `$this$associateBy`) {
      `destination$iv`.put(keySelector(`element$iv`), valueTransform(`element$iv`))
   }

   return `destination$iv`
}

public fun LongArray.sortDescending() {
   if (`$this$sortDescending`.length > 1) {
      ArraysKt.sort(`$this$sortDescending`)
      ArraysKt.reverse(`$this$sortDescending`)
   }
}

public fun FloatArray.sortedDescending(): List<Float> {
   val var10000: FloatArray = Arrays.copyOf(`$this$sortedDescending`, `$this$sortedDescending`.length)
   ArraysKt.sort(var10000)
   return ArraysKt.reversed(var10000)
}

@JvmName(name = "flatMapIndexedIterableTo")
@InlineOnly
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
public inline fun <R, C : MutableCollection<in Any>> LongArray.flatMapIndexedTo(destination: Any, transform: (Int, Long) -> Iterable<Any>): Any {
   var index: Int = 0

   for (element in `$this$flatMapIndexedTo`) {
      CollectionsKt.addAll(destination, transform(index++, element) as java.lang.Iterable)
   }

   return (C)destination
}

public inline fun <K, M : MutableMap<in Any, MutableList<Double>>> DoubleArray.groupByTo(destination: Any, keySelector: (Double) -> Any): Any {
   for (element in `$this$groupByTo`) {
      val key: Any = keySelector(element)
      val `value$iv`: Any = destination.get(key)
      val var10000: Any
      if (`value$iv` == null) {
         val var14: java.util.List = ArrayList()
         destination.put(key, var14)
         var10000 = var14
      } else {
         var10000 = `value$iv`
      }

      (var10000 as java.util.List).add(element)
   }

   return (M)destination
}

public inline fun CharArray.takeLastWhile(predicate: (Char) -> Boolean): List<Char> {
   for (index in ArraysKt.getLastIndex(`$this$takeLastWhile`) downTo 0) {
      if (!predicate(`$this$takeLastWhile`[index]) as java.lang.Boolean) {
         return ArraysKt.drop((char[])`$this$takeLastWhile`, index + 1)
      }
   }

   return ArraysKt.toList(`$this$takeLastWhile`)
}

public inline fun BooleanArray.forEach(action: (Boolean) -> Unit) {
   for (element in `$this$forEach`) {
      action(element)
   }
}

public inline fun <R : Comparable<Any>> LongArray.sortedBy(crossinline selector: (Long) -> Any?): List<Long> {
   return ArraysKt.sortedWith(`$this$sortedBy`,    // $VF: Compiled from Comparisons.kt
{ a: Any, b: Any ->
      val var3: Function1 = selector
      return ComparisonsKt.compareValues((T)(selector(a) as java.lang.Comparable), (T)(var3(b) as java.lang.Comparable))
   })
}

public infix fun DoubleArray.subtract(other: Iterable<Double>): Set<Double> {
   val set: java.util.Set = ArraysKt.toMutableSet(`$this$subtract`)
   CollectionsKt.removeAll(set, other)
   return set
}

public inline fun <R, V> ByteArray.zip(other: Array<out Any>, transform: (Byte, Any) -> Any): List<Any> {
   val size: Int = Math.min(`$this$zip`.length, other.length)
   val list: ArrayList = ArrayList(size)

   repeat(size) { i ->
      list.add(transform(`$this$zip`[i], other[i]))
   }

   return list
}

public inline fun CharArray.reduceIndexed(operation: (Int, Char, Char) -> Char): Char {
   if (`$this$reduceIndexed`.length == 0) {
      throw UnsupportedOperationException("Empty array can't be reduced.")
   } else {
      var accumulator: Char = `$this$reduceIndexed`[0]
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$reduceIndexed`)).iterator()

      while (var4.hasNext()) {
         val index: Int = var4.nextInt()
         accumulator = operation(index, accumulator, `$this$reduceIndexed`[index]) as Character
      }

      return accumulator
   }
}

public inline fun <T> Array<out Any>.dropWhile(predicate: (Any) -> Boolean): List<Any> {
   var yielding: Boolean = false
   val list: ArrayList = ArrayList()

   for (item in `$this$dropWhile`) {
      if (yielding) {
         list.add(item)
      } else if (!predicate(item) as java.lang.Boolean) {
         list.add(item)
         yielding = true
      }
   }

   return list
}

@InlineOnly
@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
public inline fun <R : Comparable<Any>> CharArray.maxOf(selector: (Char) -> Any): Any {
   if (`$this$maxOf`.length == 0) {
      throw NoSuchElementException()
   } else {
      var maxValue: java.lang.Comparable = selector(`$this$maxOf`[0]) as java.lang.Comparable
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOf`)).iterator()

      while (var3.hasNext()) {
         val v: java.lang.Comparable = selector(`$this$maxOf`[var3.nextInt()]) as java.lang.Comparable
         if (maxValue.compareTo(v) < 0) {
            maxValue = v
         }
      }

      return (R)maxValue
   }
}

public inline fun IntArray.dropLastWhile(predicate: (Int) -> Boolean): List<Int> {
   for (index in ArraysKt.getLastIndex(`$this$dropLastWhile`) downTo 0) {
      if (!predicate(`$this$dropLastWhile`[index]) as java.lang.Boolean) {
         return ArraysKt.take((int[])`$this$dropLastWhile`, index + 1)
      }
   }

   return CollectionsKt.emptyList()
}

public fun DoubleArray.any(): Boolean {
   return `$this$any`.length != 0
}

@SinceKotlin(version = "1.5")
@OverloadResolutionByLambdaReturnType
@JvmName(name = "sumOfULong")
@InlineOnly
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
public inline fun LongArray.sumOf(selector: (Long) -> ULong): ULong {
   var sum: Long = ULong.constructor_impl/* $VF was: constructor-impl */(0L)

   for (element in `$this$sumOf`) {
      sum = ULong.constructor_impl/* $VF was: constructor-impl */(sum + (selector(element) as ULong).unbox_impl/* $VF was: unbox-impl */())
   }

   return sum
}

public infix fun IntArray.intersect(other: Iterable<Int>): Set<Int> {
   val set: java.util.Set = ArraysKt.toMutableSet(`$this$intersect`)
   CollectionsKt.retainAll(set, other)
   return set
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun IntArray.onEach(action: (Int) -> Unit): IntArray {
   for (element in `$this$onEach`) {
      action(element)
   }

   return `$this$onEach`
}

@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
@InlineOnly
public inline fun <R> LongArray.maxOfWith(comparator: Comparator<in Any>, selector: (Long) -> Any): Any {
   if (`$this$maxOfWith`.length == 0) {
      throw NoSuchElementException()
   } else {
      var maxValue: Any = selector(`$this$maxOfWith`[0])
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfWith`)).iterator()

      while (var4.hasNext()) {
         val v: Any = selector(`$this$maxOfWith`[var4.nextInt()])
         if (comparator.compare(maxValue, v) < 0) {
            maxValue = v
         }
      }

      return (R)maxValue
   }
}

@InlineOnly
public inline fun FloatArray.isNotEmpty(): Boolean {
   return `$this$isNotEmpty`.length != 0
}

public inline fun <R, C : MutableCollection<in Any>> ByteArray.mapTo(destination: Any, transform: (Byte) -> Any): Any {
   for (item in `$this$mapTo`) {
      destination.add(transform(item))
   }

   return (C)destination
}

@SinceKotlin(version = "1.4")
public inline fun BooleanArray.reduceIndexedOrNull(operation: (Int, Boolean, Boolean) -> Boolean): Boolean? {
   if (`$this$reduceIndexedOrNull`.length == 0) {
      return null
   } else {
      var accumulator: Boolean = `$this$reduceIndexedOrNull`[0]
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$reduceIndexedOrNull`)).iterator()

      while (var4.hasNext()) {
         val index: Int = var4.nextInt()
         accumulator = operation(index, accumulator, `$this$reduceIndexedOrNull`[index]) as java.lang.Boolean
      }

      return accumulator
   }
}

public infix fun <R> ByteArray.zip(other: Array<out Any>): List<Pair<Byte, Any>> {
   val `$this$zip$iv`: ByteArray = `$this$zip`
   val `size$iv`: Int = Math.min(`$this$zip`.length, other.length)
   val `list$iv`: ArrayList = ArrayList(`size$iv`)

   repeat(`size$iv`) { `i$iv` ->
      `list$iv`.add(`$this$zip$iv`[`i$iv`] to other[`i$iv`])
   }

   return `list$iv`
}

public inline fun <T> Array<out Any>.forEachIndexed(action: (Int, Any) -> Unit) {
   var index: Int = 0

   for (item in `$this$forEachIndexed`) {
      action(index++, item)
   }
}

public inline fun CharArray.lastOrNull(predicate: (Char) -> Boolean): Char? {
   var var3: Int = `$this$lastOrNull`.length + -1
   if (0 <= `$this$lastOrNull`.length + -1) {
      do {
         val element: Char = `$this$lastOrNull`[var3--]
         if (predicate(element) as java.lang.Boolean) {
            return element
         }
      } while (0 <= var3)
   }

   return null
}

public inline fun ShortArray.singleOrNull(predicate: (Short) -> Boolean): Short? {
   var single: java.lang.Short = null
   var found: Boolean = false

   for (element in `$this$singleOrNull`) {
      if (predicate(element) as java.lang.Boolean) {
         if (found) {
            return null
         }

         single = element
         found = true
      }
   }

   return if (!found) null else single
}

public inline fun <K, V, M : MutableMap<in Any, in Any>> BooleanArray.associateTo(destination: Any, transform: (Boolean) -> Pair<Any, Any>): Any {
   for (element in `$this$associateTo`) {
      val var8: Pair = transform(element) as Pair
      destination.put(var8.first, var8.second)
   }

   return (M)destination
}

public fun ByteArray.reverse() {
   val midPoint: Int = `$this$reverse`.length / 2 - 1
   if (`$this$reverse`.length / 2 - 1 >= 0) {
      var reverseIndex: Int = ArraysKt.getLastIndex(`$this$reverse`)

      // $VF: Unable to resugar Kotlin loop from Java for loop
      val var3: IntIterator = IntRange(0, midPoint).iterator()
      while (true) {
         if (var3.hasNext()) break
         val index: Int = var3.nextInt()
         val tmp: Byte = `$this$reverse`[index]
         `$this$reverse`[index] = `$this$reverse`[reverseIndex]
         `$this$reverse`[reverseIndex] = tmp

         reverseIndex--
      }
   }
}

public infix fun <R> BooleanArray.zip(other: Iterable<Any>): List<Pair<Boolean, Any>> {
   val `$this$zip$iv`: BooleanArray = `$this$zip`
   val `arraySize$iv`: Int = `$this$zip`.length
   val `list$iv`: ArrayList = ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(other, 10), `$this$zip`.length))
   var `i$iv`: Int = 0

   for (`element$iv` in other) {
      if (`i$iv` >= `arraySize$iv`) {
         break
      }

      `list$iv`.add(`$this$zip$iv`[`i$iv`++] to `element$iv`)
   }

   return `list$iv`
}

@Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = []))
@DeprecatedSinceKotlin(warningSince = "1.5")
public inline fun <T> Array<out Any>.sumByDouble(selector: (Any) -> Double): Double {
   var sum: Double = 0.0

   for (element in `$this$sumByDouble`) {
      sum += (selector(element) as java.lang.Number).doubleValue()
   }

   return sum
}

public inline fun CharArray.dropWhile(predicate: (Char) -> Boolean): List<Char> {
   var yielding: Boolean = false
   val list: ArrayList = ArrayList()

   for (item in `$this$dropWhile`) {
      if (yielding) {
         list.add(item)
      } else if (!predicate(item) as java.lang.Boolean) {
         list.add(item)
         yielding = true
      }
   }

   return list
}

@SinceKotlin(version = "1.4")
public fun DoubleArray.maxOrNull(): Double? {
   if (`$this$maxOrNull`.length == 0) {
      return null
   } else {
      var max: Double = `$this$maxOrNull`[0]
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOrNull`)).iterator()

      while (var3.hasNext()) {
         max = Math.max(max, `$this$maxOrNull`[var3.nextInt()])
      }

      return max
   }
}

public infix fun <R> DoubleArray.zip(other: Iterable<Any>): List<Pair<Double, Any>> {
   val `$this$zip$iv`: DoubleArray = `$this$zip`
   val `arraySize$iv`: Int = `$this$zip`.length
   val `list$iv`: ArrayList = ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(other, 10), `$this$zip`.length))
   var `i$iv`: Int = 0

   for (`element$iv` in other) {
      if (`i$iv` >= `arraySize$iv`) {
         break
      }

      `list$iv`.add(`$this$zip$iv`[`i$iv`++] to `element$iv`)
   }

   return `list$iv`
}

public fun FloatArray.toSet(): Set<Float> {
   var var10000: java.util.Set
   when (`$this$toSet`.length) {
      0 -> var10000 = SetsKt.emptySet()
      1 -> var10000 = SetsKt.setOf(`$this$toSet`[0])
      else -> var10000 = ArraysKt.toCollection(`$this$toSet`, LinkedHashSet(MapsKt.mapCapacity(`$this$toSet`.length)))
   }

   return var10000
}

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun <R : Comparable<Any>> BooleanArray.maxOf(selector: (Boolean) -> Any): Any {
   if (`$this$maxOf`.length == 0) {
      throw NoSuchElementException()
   } else {
      var maxValue: java.lang.Comparable = selector(`$this$maxOf`[0]) as java.lang.Comparable
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOf`)).iterator()

      while (var3.hasNext()) {
         val v: java.lang.Comparable = selector(`$this$maxOf`[var3.nextInt()]) as java.lang.Comparable
         if (maxValue.compareTo(v) < 0) {
            maxValue = v
         }
      }

      return (R)maxValue
   }
}

@SinceKotlin(version = "1.4")
public inline fun IntArray.reduceIndexedOrNull(operation: (Int, Int, Int) -> Int): Int? {
   if (`$this$reduceIndexedOrNull`.length == 0) {
      return null
   } else {
      var accumulator: Int = `$this$reduceIndexedOrNull`[0]
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$reduceIndexedOrNull`)).iterator()

      while (var4.hasNext()) {
         val index: Int = var4.nextInt()
         accumulator = (operation(index, accumulator, `$this$reduceIndexedOrNull`[index]) as java.lang.Number).intValue()
      }

      return accumulator
   }
}

public inline fun IntArray.reduce(operation: (Int, Int) -> Int): Int {
   if (`$this$reduce`.length == 0) {
      throw UnsupportedOperationException("Empty array can't be reduced.")
   } else {
      var accumulator: Int = `$this$reduce`[0]
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$reduce`)).iterator()

      while (var4.hasNext()) {
         accumulator = (operation(accumulator, `$this$reduce`[var4.nextInt()]) as java.lang.Number).intValue()
      }

      return accumulator
   }
}

public inline fun <T> Array<out Any>.filterIndexed(predicate: (Int, Any) -> Boolean): List<Any> {
   val `destination$iv`: java.util.Collection = ArrayList()
   val `index$iv$iv`: Int = 0

   for (`item$iv$iv` in `$this$filterIndexed`) {
      if (predicate(`index$iv$iv`++, `item$iv$iv`) as java.lang.Boolean) {
         `destination$iv`.add(`item$iv$iv`)
      }
   }

   return `destination$iv` as MutableList<T>
}

public infix fun <T> Array<out Any>.union(other: Iterable<Any>): Set<Any> {
   val set: java.util.Set = ArraysKt.toMutableSet(`$this$union`)
   CollectionsKt.addAll(set, other)
   return set
}

public fun ByteArray.reversed(): List<Byte> {
   if (`$this$reversed`.length == 0) {
      return CollectionsKt.emptyList()
   } else {
      val list: java.util.List = ArraysKt.toMutableList(`$this$reversed`)
      CollectionsKt.reverse(list)
      return list
   }
}

public fun BooleanArray.drop(n: Int): List<Boolean> {
   if (n < 0) {
      throw IllegalArgumentException(("Requested element count $n is less than zero.").toString())
   } else {
      return ArraysKt.takeLast(`$this$drop`, RangesKt.coerceAtLeast(`$this$drop`.length - n, 0))
   }
}

public fun FloatArray.toMutableSet(): MutableSet<Float> {
   return ArraysKt.toCollection(`$this$toMutableSet`, LinkedHashSet<>(MapsKt.mapCapacity(`$this$toMutableSet`.length)))
}

@SinceKotlin(version = "1.4")
@JvmName(name = "flatMapIndexedIterableTo")
@InlineOnly
@OverloadResolutionByLambdaReturnType
public inline fun <R, C : MutableCollection<in Any>> ByteArray.flatMapIndexedTo(destination: Any, transform: (Int, Byte) -> Iterable<Any>): Any {
   var index: Int = 0

   for (element in `$this$flatMapIndexedTo`) {
      CollectionsKt.addAll(destination, transform(index++, element) as java.lang.Iterable)
   }

   return (C)destination
}

public fun <T : Comparable<Any>> Array<Any>.sortedArray(): Array<Any> {
   if (`$this$sortedArray`.length == 0) {
      return (T[])`$this$sortedArray`
   } else {
      val var10000: Array<Any> = Arrays.copyOf(`$this$sortedArray`, `$this$sortedArray`.length)
      ArraysKt.sort(var10000 as Array<java.lang.Comparable>)
      return (T[])(var10000 as Array<java.lang.Comparable>)
   }
}

@SinceKotlin(version = "1.7")
@JvmName(name = "minWithOrThrow")
public fun ByteArray.minWith(comparator: Comparator<in Byte>): Byte {
   if (`$this$minWith`.length == 0) {
      throw NoSuchElementException()
   } else {
      var min: Byte = `$this$minWith`[0]
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minWith`)).iterator()

      while (var3.hasNext()) {
         val e: Byte = `$this$minWith`[var3.nextInt()]
         if (comparator.compare(min, e) > 0) {
            min = e
         }
      }

      return min
   }
}

@SinceKotlin(version = "1.4")
public fun ByteArray.reverse(fromIndex: Int, toIndex: Int) {
   AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(fromIndex, toIndex, `$this$reverse`.length)
   val midPoint: Int = (fromIndex + toIndex) / 2
   if (fromIndex != (fromIndex + toIndex) / 2) {
      var reverseIndex: Int = toIndex + -1

      for (index in fromIndex..midPoint) {
         val tmp: Byte = `$this$reverse`[index]
         `$this$reverse`[index] = `$this$reverse`[reverseIndex]
         `$this$reverse`[reverseIndex] = tmp
         reverseIndex--
      }
   }
}

public inline fun ShortArray.dropWhile(predicate: (Short) -> Boolean): List<Short> {
   var yielding: Boolean = false
   val list: ArrayList = ArrayList()

   for (item in `$this$dropWhile`) {
      if (yielding) {
         list.add(item)
      } else if (!predicate(item) as java.lang.Boolean) {
         list.add(item)
         yielding = true
      }
   }

   return list
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun <R> IntArray.runningFold(initial: Any, operation: (Any, Int) -> Any): List<Any> {
   if (`$this$runningFold`.length == 0) {
      return (java.util.List<R>)CollectionsKt.listOf(initial)
   } else {
      var accumulator: Any = ArrayList(`$this$runningFold`.length + 1)
      accumulator.add(initial)
      val result: Any = accumulator
      accumulator = initial

      for (element in `$this$runningFold`) {
         accumulator = operation(accumulator, element)
         result.add(accumulator)
      }

      return result as MutableList<R>
   }
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun DoubleArray.runningReduceIndexed(operation: (Int, Double, Double) -> Double): List<Double> {
   if (`$this$runningReduceIndexed`.length == 0) {
      return CollectionsKt.emptyList()
   } else {
      var accumulator: Double = 0.0
      accumulator = `$this$runningReduceIndexed`[0]
      val index: ArrayList = ArrayList(`$this$runningReduceIndexed`.length)
      index.add(accumulator)
      val result: ArrayList = index
      var var8: Int = 1

      for (var9 in `$this$runningReduceIndexed`.length..var8) {
         accumulator = (operation(var8, accumulator, `$this$runningReduceIndexed`[var8]) as java.lang.Number).doubleValue()
         result.add(accumulator)
      }

      return result
   }
}

@SinceKotlin(version = "1.4")
public fun DoubleArray.minOrNull(): Double? {
   if (`$this$minOrNull`.length == 0) {
      return null
   } else {
      var min: Double = `$this$minOrNull`[0]
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOrNull`)).iterator()

      while (var3.hasNext()) {
         min = Math.min(min, `$this$minOrNull`[var3.nextInt()])
      }

      return min
   }
}

public inline fun <T, K, V, M : MutableMap<in Any, in Any>> Array<out Any>.associateByTo(
   destination: Any,
   keySelector: (Any) -> Any,
   valueTransform: (Any) -> Any
): Any {
   for (element in `$this$associateByTo`) {
      destination.put(keySelector(element), valueTransform(element))
   }

   return (M)destination
}

@OverloadResolutionByLambdaReturnType
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun LongArray.maxOfOrNull(selector: (Long) -> Double): Double? {
   if (`$this$maxOfOrNull`.length == 0) {
      return null
   } else {
      var maxValue: Double = (selector(`$this$maxOfOrNull`[0]) as java.lang.Number).doubleValue()
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfOrNull`)).iterator()

      while (var4.hasNext()) {
         maxValue = Math.max(maxValue, (selector(`$this$maxOfOrNull`[var4.nextInt()]) as java.lang.Number).doubleValue())
      }

      return maxValue
   }
}

public fun ShortArray.sortDescending() {
   if (`$this$sortDescending`.length > 1) {
      ArraysKt.sort(`$this$sortDescending`)
      ArraysKt.reverse(`$this$sortDescending`)
   }
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun <V, M : MutableMap<in Long, in Any>> LongArray.associateWithTo(destination: Any, valueSelector: (Long) -> Any): Any {
   for (element in `$this$associateWithTo`) {
      destination.put(element, valueSelector(element))
   }

   return (M)destination
}

@OverloadResolutionByLambdaReturnType
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun <T> Array<out Any>.minOfOrNull(selector: (Any) -> Double): Double? {
   if (`$this$minOfOrNull`.length == 0) {
      return null
   } else {
      var minValue: Double = (selector(`$this$minOfOrNull`[0]) as java.lang.Number).doubleValue()
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfOrNull`)).iterator()

      while (var4.hasNext()) {
         minValue = Math.min(minValue, (selector(`$this$minOfOrNull`[var4.nextInt()]) as java.lang.Number).doubleValue())
      }

      return minValue
   }
}

public inline fun <C : MutableCollection<in Long>> LongArray.filterIndexedTo(destination: Any, predicate: (Int, Long) -> Boolean): Any {
   val `index$iv`: Int = 0

   for (`item$iv` in `$this$filterIndexedTo`) {
      if (predicate(`index$iv`++, `item$iv`) as java.lang.Boolean) {
         destination.add(`item$iv`)
      }
   }

   return (C)destination
}

@InlineOnly
public inline fun IntArray.isNotEmpty(): Boolean {
   return `$this$isNotEmpty`.length != 0
}

public fun DoubleArray.last(): Double {
   if (`$this$last`.length == 0) {
      throw NoSuchElementException("Array is empty.")
   } else {
      return `$this$last`[ArraysKt.getLastIndex(`$this$last`)]
   }
}

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun <R> FloatArray.minOfWithOrNull(comparator: Comparator<in Any>, selector: (Float) -> Any): Any? {
   if (`$this$minOfWithOrNull`.length == 0) {
      return null
   } else {
      var minValue: Any = selector(`$this$minOfWithOrNull`[0])
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfWithOrNull`)).iterator()

      while (var4.hasNext()) {
         val v: Any = selector(`$this$minOfWithOrNull`[var4.nextInt()])
         if (comparator.compare(minValue, v) > 0) {
            minValue = v
         }
      }

      return (R)minValue
   }
}

@SinceKotlin(version = "1.4")
public fun CharArray.shuffle() {
   ArraysKt.shuffle((char[])`$this$shuffle`, Random.Default)
}

@SinceKotlin(version = "1.4")
public fun FloatArray.minWithOrNull(comparator: Comparator<in Float>): Float? {
   if (`$this$minWithOrNull`.length == 0) {
      return null
   } else {
      var min: Float = `$this$minWithOrNull`[0]
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minWithOrNull`)).iterator()

      while (var3.hasNext()) {
         val e: Float = `$this$minWithOrNull`[var3.nextInt()]
         if (comparator.compare(min, e) > 0) {
            min = e
         }
      }

      return min
   }
}

public inline fun CharArray.filterIndexed(predicate: (Int, Char) -> Boolean): List<Char> {
   val `destination$iv`: java.util.Collection = ArrayList()
   val `index$iv$iv`: Int = 0

   for (`item$iv$iv` in `$this$filterIndexed`) {
      if (predicate(`index$iv$iv`++, `item$iv$iv`) as java.lang.Boolean) {
         `destination$iv`.add(`item$iv$iv`)
      }
   }

   return `destination$iv` as MutableList<Character>
}

@InlineOnly
public inline fun FloatArray.findLast(predicate: (Float) -> Boolean): Float? {
   val `$this$lastOrNull$iv`: FloatArray = `$this$findLast`
   var var4: Int = `$this$findLast`.length + -1
   if (0 <= `$this$findLast`.length + -1) {
      do {
         val `element$iv`: Float = `$this$lastOrNull$iv`[var4--]
         if (predicate(`element$iv`) as java.lang.Boolean) {
            return `element$iv`
         }
      } while (0 <= var4)
   }

   return null
}

@SinceKotlin(version = "1.3")
public fun DoubleArray.random(random: Random): Double {
   if (`$this$random`.length == 0) {
      throw NoSuchElementException("Array is empty.")
   } else {
      return `$this$random`[random.nextInt(`$this$random`.length)]
   }
}

public inline fun LongArray.single(predicate: (Long) -> Boolean): Long {
   var single: java.lang.Long = null
   var found: Boolean = false

   for (element in `$this$single`) {
      if (predicate(element) as java.lang.Boolean) {
         if (found) {
            throw IllegalArgumentException("Array contains more than one matching element.")
         }

         single = element
         found = true
      }
   }

   if (!found) {
      throw NoSuchElementException("Array contains no element matching the predicate.")
   } else {
      return single
   }
}

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun <R> ShortArray.maxOfWith(comparator: Comparator<in Any>, selector: (Short) -> Any): Any {
   if (`$this$maxOfWith`.length == 0) {
      throw NoSuchElementException()
   } else {
      var maxValue: Any = selector(`$this$maxOfWith`[0])
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfWith`)).iterator()

      while (var4.hasNext()) {
         val v: Any = selector(`$this$maxOfWith`[var4.nextInt()])
         if (comparator.compare(maxValue, v) < 0) {
            maxValue = v
         }
      }

      return (R)maxValue
   }
}

public fun CharArray.any(): Boolean {
   return `$this$any`.length != 0
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun <R> BooleanArray.runningFoldIndexed(initial: Any, operation: (Int, Any, Boolean) -> Any): List<Any> {
   if (`$this$runningFoldIndexed`.length == 0) {
      return (java.util.List<R>)CollectionsKt.listOf(initial)
   } else {
      var accumulator: Any = ArrayList(`$this$runningFoldIndexed`.length + 1)
      accumulator.add(initial)
      val result: Any = accumulator
      accumulator = initial
      var var8: Int = 0

      for (var9 in `$this$runningFoldIndexed`.length..var8) {
         accumulator = operation(var8, accumulator, `$this$runningFoldIndexed`[var8])
         result.add(accumulator)
      }

      return result as MutableList<R>
   }
}

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun LongArray.minOfOrNull(selector: (Long) -> Float): Float? {
   if (`$this$minOfOrNull`.length == 0) {
      return null
   } else {
      var minValue: Float = (selector(`$this$minOfOrNull`[0]) as java.lang.Number).floatValue()
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfOrNull`)).iterator()

      while (var3.hasNext()) {
         minValue = Math.min(minValue, (selector(`$this$minOfOrNull`[var3.nextInt()]) as java.lang.Number).floatValue())
      }

      return minValue
   }
}

@SinceKotlin(version = "1.3")
public fun <T> Array<out Any>.random(random: Random): Any {
   if (`$this$random`.length == 0) {
      throw NoSuchElementException("Array is empty.")
   } else {
      return (T)`$this$random`[random.nextInt(`$this$random`.length)]
   }
}

@JvmName(name = "sumOfByte")
public fun Array<out Byte>.sum(): Int {
   var sum: Byte = 0
   var var2: Int = 0

   for (var3 in `$this$sum`.length..var2) {
      sum += `$this$sum`[var2]
   }

   return sum
}

@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun ByteArray.runningReduceIndexed(operation: (Int, Byte, Byte) -> Byte): List<Byte> {
   if (`$this$runningReduceIndexed`.length == 0) {
      return CollectionsKt.emptyList()
   } else {
      var var7: Byte = `$this$runningReduceIndexed`[0]
      val index: ArrayList = ArrayList(`$this$runningReduceIndexed`.length)
      index.add(var7)
      val result: ArrayList = index
      var var8: Int = 1

      for (var9 in `$this$runningReduceIndexed`.length..var8) {
         var7 = (operation(var8, var7, `$this$runningReduceIndexed`[var8]) as java.lang.Number).byteValue()
         result.add(var7)
      }

      return result
   }
}

@InlineOnly
@JvmName(name = "sumOfDouble")
@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
public inline fun <T> Array<out Any>.sumOf(selector: (Any) -> Double): Double {
   var sum: Double = 0.0

   for (element in `$this$sumOf`) {
      sum += (selector(element) as java.lang.Number).doubleValue()
   }

   return sum
}

@SinceKotlin(version = "1.4")
public inline fun <K, V> Array<out Any>.associateWith(valueSelector: (Any) -> Any): Map<Any, Any> {
   val result: LinkedHashMap = LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(`$this$associateWith`.length), 16))

   for (`element$iv` in `$this$associateWith`) {
      result.put(`element$iv`, valueSelector(`element$iv`))
   }

   return result
}

public fun FloatArray.average(): Double {
   var sum: Double = 0.0
   var count: Int = 0

   for (element in `$this$average`) {
      sum += element
      count++
   }

   return if (count == 0) java.lang.Double.NaN else sum / count
}

@JvmName(name = "sumOfInt")
public fun Array<out Int>.sum(): Int {
   var sum: Int = 0
   var var2: Int = 0

   for (var3 in `$this$sum`.length..var2) {
      sum += `$this$sum`[var2]
   }

   return sum
}

@InlineOnly
public inline fun LongArray.findLast(predicate: (Long) -> Boolean): Long? {
   val `$this$lastOrNull$iv`: LongArray = `$this$findLast`
   var var4: Int = `$this$findLast`.length + -1
   if (0 <= `$this$findLast`.length + -1) {
      do {
         val `element$iv`: Long = `$this$lastOrNull$iv`[var4--]
         if (predicate(`element$iv`) as java.lang.Boolean) {
            return `element$iv`
         }
      } while (0 <= var4)
   }

   return null
}

public fun LongArray.sortedArray(): LongArray {
   if (`$this$sortedArray`.length == 0) {
      return `$this$sortedArray`
   } else {
      val var10000: LongArray = Arrays.copyOf(`$this$sortedArray`, `$this$sortedArray`.length)
      ArraysKt.sort(var10000)
      return var10000
   }
}

public fun <A : Appendable> CharArray.joinTo(
   buffer: Any,
   separator: CharSequence = ...,
   prefix: CharSequence = ...,
   postfix: CharSequence = ...,
   limit: Int = ...,
   truncated: CharSequence = ...,
   transform: ((Char) -> CharSequence)? = ...
): Any {
   buffer.append(prefix)
   val count: Int = 0

   for (element in `$this$joinTo`) {
      if (++count > 1) {
         buffer.append(separator)
      }

      if (limit >= 0 && count > limit) {
         break
      }

      if (transform != null) {
         buffer.append(transform(element) as java.lang.CharSequence)
      } else {
         buffer.append(element)
      }
   }

   if (limit >= 0 && count > limit) {
      buffer.append(truncated)
   }

   buffer.append(postfix)
   return (A)buffer
}

public inline fun IntArray.any(predicate: (Int) -> Boolean): Boolean {
   for (element in `$this$any`) {
      if (predicate(element) as java.lang.Boolean) {
         return true
      }
   }

   return false
}

public fun ShortArray.withIndex(): Iterable<IndexedValue<Short>> {
   return IndexingIterable<>(   // $VF: Compiled from _Arrays.kt
{
      return ArrayIteratorsKt.iterator($this$withIndex)
   } as () -> MutableIterator<java.lang.Short>)
}

@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
@InlineOnly
public inline fun FloatArray.maxOf(selector: (Float) -> Double): Double {
   if (`$this$maxOf`.length == 0) {
      throw NoSuchElementException()
   } else {
      var maxValue: Double = (selector(`$this$maxOf`[0]) as java.lang.Number).doubleValue()
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOf`)).iterator()

      while (var4.hasNext()) {
         maxValue = Math.max(maxValue, (selector(`$this$maxOf`[var4.nextInt()]) as java.lang.Number).doubleValue())
      }

      return maxValue
   }
}

@SinceKotlin(version = "1.4")
public inline fun LongArray.reduceRightIndexedOrNull(operation: (Int, Long, Long) -> Long): Long? {
   var index: Int = ArraysKt.getLastIndex(`$this$reduceRightIndexedOrNull`)
   if (index < 0) {
      return null
   } else {
      var accumulator: Long = `$this$reduceRightIndexedOrNull`[index--]

      while (index >= 0) {
         accumulator = (operation(index, `$this$reduceRightIndexedOrNull`[index], accumulator) as java.lang.Number).longValue()
         index--
      }

      return accumulator
   }
}

@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
@InlineOnly
public inline fun <T> Array<out Any>.maxOf(selector: (Any) -> Float): Float {
   if (`$this$maxOf`.length == 0) {
      throw NoSuchElementException()
   } else {
      var maxValue: Float = (selector(`$this$maxOf`[0]) as java.lang.Number).floatValue()
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOf`)).iterator()

      while (var3.hasNext()) {
         maxValue = Math.max(maxValue, (selector(`$this$maxOf`[var3.nextInt()]) as java.lang.Number).floatValue())
      }

      return maxValue
   }
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun BooleanArray.runningReduce(operation: (Boolean, Boolean) -> Boolean): List<Boolean> {
   if (`$this$runningReduce`.length == 0) {
      return CollectionsKt.emptyList()
   } else {
      var var7: Boolean = `$this$runningReduce`[0]
      val index: ArrayList = ArrayList(`$this$runningReduce`.length)
      index.add(var7)
      val result: ArrayList = index
      var var8: Int = 1

      for (var9 in `$this$runningReduce`.length..var8) {
         var7 = operation(var7, `$this$runningReduce`[var8]) as java.lang.Boolean
         result.add(var7)
      }

      return result
   }
}

public fun LongArray.toSet(): Set<Long> {
   var var10000: java.util.Set
   when (`$this$toSet`.length) {
      0 -> var10000 = SetsKt.emptySet()
      1 -> var10000 = SetsKt.setOf(`$this$toSet`[0])
      else -> var10000 = ArraysKt.toCollection(`$this$toSet`, LinkedHashSet(MapsKt.mapCapacity(`$this$toSet`.length)))
   }

   return var10000
}

public fun <C : MutableCollection<in Int>> IntArray.toCollection(destination: Any): Any {
   for (item in `$this$toCollection`) {
      destination.add(item)
   }

   return (C)destination
}

public fun FloatArray.first(): Float {
   if (`$this$first`.length == 0) {
      throw NoSuchElementException("Array is empty.")
   } else {
      return `$this$first`[0]
   }
}

@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun CharArray.onEachIndexed(action: (Int, Char) -> Unit): CharArray {
   var `index$iv`: Int = 0

   for (`item$iv` in `$this$onEachIndexed`) {
      action(`index$iv`++, `item$iv`)
   }

   return `$this$onEachIndexed`
}

public inline fun <R, V> FloatArray.zip(other: Array<out Any>, transform: (Float, Any) -> Any): List<Any> {
   val size: Int = Math.min(`$this$zip`.length, other.length)
   val list: ArrayList = ArrayList(size)

   repeat(size) { i ->
      list.add(transform(`$this$zip`[i], other[i]))
   }

   return list
}

@OverloadResolutionByLambdaReturnType
@InlineOnly
@SinceKotlin(version = "1.4")
@JvmName(name = "flatMapIndexedIterable")
public inline fun <R> CharArray.flatMapIndexed(transform: (Int, Char) -> Iterable<Any>): List<Any> {
   val var3: java.util.Collection = ArrayList()
   var var4: Int = 0

   for (var7 in `$this$flatMapIndexed`) {
      CollectionsKt.addAll(var3, transform(var4++, var7) as java.lang.Iterable)
   }

   return var3 as MutableList<R>
}

@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun <R> LongArray.runningFold(initial: Any, operation: (Any, Long) -> Any): List<Any> {
   if (`$this$runningFold`.length == 0) {
      return (java.util.List<R>)CollectionsKt.listOf(initial)
   } else {
      var accumulator: Any = ArrayList(`$this$runningFold`.length + 1)
      accumulator.add(initial)
      val result: Any = accumulator
      accumulator = initial

      for (element in `$this$runningFold`) {
         accumulator = operation(accumulator, element)
         result.add(accumulator)
      }

      return result as MutableList<R>
   }
}

@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
@InlineOnly
public inline fun <R : Comparable<Any>> DoubleArray.minOfOrNull(selector: (Double) -> Any): Any? {
   if (`$this$minOfOrNull`.length == 0) {
      return null
   } else {
      var minValue: java.lang.Comparable = selector(`$this$minOfOrNull`[0]) as java.lang.Comparable
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfOrNull`)).iterator()

      while (var3.hasNext()) {
         val v: java.lang.Comparable = selector(`$this$minOfOrNull`[var3.nextInt()]) as java.lang.Comparable
         if (minValue.compareTo(v) > 0) {
            minValue = v
         }
      }

      return (R)minValue
   }
}

@InlineOnly
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
public inline fun IntArray.maxOf(selector: (Int) -> Double): Double {
   if (`$this$maxOf`.length == 0) {
      throw NoSuchElementException()
   } else {
      var maxValue: Double = (selector(`$this$maxOf`[0]) as java.lang.Number).doubleValue()
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOf`)).iterator()

      while (var4.hasNext()) {
         maxValue = Math.max(maxValue, (selector(`$this$maxOf`[var4.nextInt()]) as java.lang.Number).doubleValue())
      }

      return maxValue
   }
}

public inline fun <R> CharArray.foldIndexed(initial: Any, operation: (Int, Any, Char) -> Any): Any {
   var index: Int = 0
   var accumulator: Any = initial

   for (element in `$this$foldIndexed`) {
      accumulator = operation(index++, accumulator, element)
   }

   return (R)accumulator
}

@InlineOnly
@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public inline fun ShortArray.randomOrNull(): Short? {
   return ArraysKt.randomOrNull((short[])`$this$randomOrNull`, Random.Default)
}

@InlineOnly
public inline operator fun ShortArray.component1(): Short {
   return `$this$component1`[0]
}

@InlineOnly
public inline operator fun ShortArray.component2(): Short {
   return `$this$component2`[1]
}

public fun BooleanArray.firstOrNull(): Boolean? {
   return if (`$this$firstOrNull`.length == 0) null else `$this$firstOrNull`[0]
}

public inline fun FloatArray.filter(predicate: (Float) -> Boolean): List<Float> {
   val `destination$iv`: java.util.Collection = ArrayList()

   for (`element$iv` in `$this$filter`) {
      if (predicate(`element$iv`) as java.lang.Boolean) {
         `destination$iv`.add(`element$iv`)
      }
   }

   return `destination$iv` as MutableList<java.lang.Float>
}

@SinceKotlin(version = "1.4")
public fun IntArray.reverse(fromIndex: Int, toIndex: Int) {
   AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(fromIndex, toIndex, `$this$reverse`.length)
   val midPoint: Int = (fromIndex + toIndex) / 2
   if (fromIndex != (fromIndex + toIndex) / 2) {
      var reverseIndex: Int = toIndex + -1

      for (index in fromIndex..midPoint) {
         val tmp: Int = `$this$reverse`[index]
         `$this$reverse`[index] = `$this$reverse`[reverseIndex]
         `$this$reverse`[reverseIndex] = tmp
         reverseIndex--
      }
   }
}

public fun IntArray.joinToString(
   separator: CharSequence = ", " as java.lang.CharSequence,
   prefix: CharSequence = "" as java.lang.CharSequence,
   postfix: CharSequence = "" as java.lang.CharSequence,
   limit: Int = -1,
   truncated: CharSequence = "..." as java.lang.CharSequence,
   transform: ((Int) -> CharSequence)? = null
): String {
   val var10000: java.lang.String = ArraysKt.joinTo((int[])`$this$joinToString`, StringBuilder(), separator, prefix, postfix, limit, truncated, transform)
      .toString()
      return var10000
}

@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
@InlineOnly
public inline fun <R> BooleanArray.maxOfWith(comparator: Comparator<in Any>, selector: (Boolean) -> Any): Any {
   if (`$this$maxOfWith`.length == 0) {
      throw NoSuchElementException()
   } else {
      var maxValue: Any = selector(`$this$maxOfWith`[0])
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfWith`)).iterator()

      while (var4.hasNext()) {
         val v: Any = selector(`$this$maxOfWith`[var4.nextInt()])
         if (comparator.compare(maxValue, v) < 0) {
            maxValue = v
         }
      }

      return (R)maxValue
   }
}

@JvmName(name = "maxOrThrow")
@SinceKotlin(version = "1.7")
public fun DoubleArray.max(): Double {
   if (`$this$max`.length == 0) {
      throw NoSuchElementException()
   } else {
      var max: Double = `$this$max`[0]
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$max`)).iterator()

      while (var3.hasNext()) {
         max = Math.max(max, `$this$max`[var3.nextInt()])
      }

      return max
   }
}

@SinceKotlin(version = "1.4")
public fun Array<out Double>.minOrNull(): Double? {
   if (`$this$minOrNull`.length == 0) {
      return null
   } else {
      var min: Double = `$this$minOrNull`[0]
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOrNull`)).iterator()

      while (var3.hasNext()) {
         min = Math.min(min, `$this$minOrNull`[var3.nextInt()])
      }

      return min
   }
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun <R> LongArray.scanIndexed(initial: Any, operation: (Int, Any, Long) -> Any): List<Any> {
   val var3: LongArray = `$this$scanIndexed`
   val var10000: java.util.List
   if (`$this$scanIndexed`.length == 0) {
      var10000 = CollectionsKt.listOf(initial)
   } else {
      val var4: ArrayList = ArrayList(`$this$scanIndexed`.length + 1)
      var4.add(initial)
      val var6: ArrayList = var4
      var var8: Any = initial
      var var9: Int = 0

      for (var7 in `$this$scanIndexed`.length..var9) {
         var8 = operation(var9, var8, var3[var9])
         var6.add(var8)
      }

      var10000 = var6
   }

   return var10000
}

public fun LongArray.toHashSet(): HashSet<Long> {
   return ArraysKt.toCollection(`$this$toHashSet`, HashSet<>(MapsKt.mapCapacity(`$this$toHashSet`.length)))
}

@SinceKotlin(version = "1.7")
@JvmName(name = "maxByOrThrow")
public inline fun <T, R : Comparable<Any>> Array<out Any>.maxBy(selector: (Any) -> Any): Any {
   if (`$this$maxBy`.length == 0) {
      throw NoSuchElementException()
   } else {
      var maxElem: Any = `$this$maxBy`[0]
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$maxBy`)
      if (lastIndex == 0) {
         return (T)maxElem
      } else {
         var maxValue: java.lang.Comparable = selector(maxElem) as java.lang.Comparable
         val var6: IntIterator = IntRange(1, lastIndex).iterator()

         while (var6.hasNext()) {
            val e: Any = `$this$maxBy`[var6.nextInt()]
            val v: java.lang.Comparable = selector(e) as java.lang.Comparable
            if (maxValue.compareTo(v) < 0) {
               maxElem = e
               maxValue = v
            }
         }

         return (T)maxElem
      }
   }
}

public inline fun ByteArray.filter(predicate: (Byte) -> Boolean): List<Byte> {
   val `destination$iv`: java.util.Collection = ArrayList()

   for (`element$iv` in `$this$filter`) {
      if (predicate(`element$iv`) as java.lang.Boolean) {
         `destination$iv`.add(`element$iv`)
      }
   }

   return `destination$iv` as MutableList<java.lang.Byte>
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun <R> LongArray.scan(initial: Any, operation: (Any, Long) -> Any): List<Any> {
   val var10000: java.util.List
   if (`$this$scan`.length == 0) {
      var10000 = CollectionsKt.listOf(initial)
   } else {
      val var4: ArrayList = ArrayList(`$this$scan`.length + 1)
      var4.add(initial)
      val var6: ArrayList = var4
      var var10: Any = initial

      for (var8 in `$this$scan`) {
         var10 = operation(var10, var8)
         var6.add(var10)
      }

      var10000 = var6
   }

   return var10000
}

public inline fun <R> ShortArray.map(transform: (Short) -> Any): List<Any> {
   val `destination$iv`: java.util.Collection = ArrayList(`$this$map`.length)

   for (`item$iv` in `$this$map`) {
      `destination$iv`.add(transform(`item$iv`))
   }

   return `destination$iv` as MutableList<R>
}

public fun ByteArray.take(n: Int): List<Byte> {
   if (n < 0) {
      throw IllegalArgumentException(("Requested element count $n is less than zero.").toString())
   } else if (n == 0) {
      return CollectionsKt.emptyList()
   } else if (n >= `$this$take`.length) {
      return ArraysKt.toList(`$this$take`)
   } else if (n == 1) {
      return CollectionsKt.listOf(`$this$take`[0])
   } else {
      val var7: Int = 0
      val list: ArrayList = ArrayList(n)

      for (item in `$this$take`) {
         list.add(item)
         if (++var7 == n) {
            break
         }
      }

      return list
   }
}

public inline fun FloatArray.reduce(operation: (Float, Float) -> Float): Float {
   if (`$this$reduce`.length == 0) {
      throw UnsupportedOperationException("Empty array can't be reduced.")
   } else {
      var accumulator: Float = `$this$reduce`[0]
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$reduce`)).iterator()

      while (var4.hasNext()) {
         accumulator = (operation(accumulator, `$this$reduce`[var4.nextInt()]) as java.lang.Number).floatValue()
      }

      return accumulator
   }
}

public inline fun <K, V, M : MutableMap<in Any, in Any>> FloatArray.associateTo(destination: Any, transform: (Float) -> Pair<Any, Any>): Any {
   for (element in `$this$associateTo`) {
      val var8: Pair = transform(element) as Pair
      destination.put(var8.first, var8.second)
   }

   return (M)destination
}

@SinceKotlin(version = "1.7")
@JvmName(name = "minByOrThrow")
public inline fun <R : Comparable<Any>> ByteArray.minBy(selector: (Byte) -> Any): Byte {
   if (`$this$minBy`.length == 0) {
      throw NoSuchElementException()
   } else {
      var minElem: Byte = `$this$minBy`[0]
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$minBy`)
      if (lastIndex == 0) {
         return minElem
      } else {
         var minValue: java.lang.Comparable = selector(minElem) as java.lang.Comparable
         val var6: IntIterator = IntRange(1, lastIndex).iterator()

         while (var6.hasNext()) {
            val e: Byte = `$this$minBy`[var6.nextInt()]
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

public inline fun CharArray.firstOrNull(predicate: (Char) -> Boolean): Char? {
   for (element in `$this$firstOrNull`) {
      if (predicate(element) as java.lang.Boolean) {
         return element
      }
   }

   return null
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.4")
public inline fun ShortArray.reduceOrNull(operation: (Short, Short) -> Short): Short? {
   if (`$this$reduceOrNull`.length == 0) {
      return null
   } else {
      var accumulator: Short = `$this$reduceOrNull`[0]
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$reduceOrNull`)).iterator()

      while (var4.hasNext()) {
         accumulator = (operation(accumulator, `$this$reduceOrNull`[var4.nextInt()]) as java.lang.Number).shortValue()
      }

      return accumulator
   }
}

public fun CharArray.dropLast(n: Int): List<Char> {
   if (n < 0) {
      throw IllegalArgumentException(("Requested element count $n is less than zero.").toString())
   } else {
      return ArraysKt.take((char[])`$this$dropLast`, RangesKt.coerceAtLeast(`$this$dropLast`.length - n, 0))
   }
}

public inline fun DoubleArray.singleOrNull(predicate: (Double) -> Boolean): Double? {
   var single: java.lang.Double = null
   var found: Boolean = false

   for (element in `$this$singleOrNull`) {
      if (predicate(element) as java.lang.Boolean) {
         if (found) {
            return null
         }

         single = element
         found = true
      }
   }

   return if (!found) null else single
}

public inline fun <K, V> DoubleArray.groupBy(keySelector: (Double) -> Any, valueTransform: (Double) -> Any): Map<Any, List<Any>> {
   val `destination$iv`: java.util.Map = LinkedHashMap()

   for (`element$iv` in `$this$groupBy`) {
      val `key$iv`: Any = keySelector(`element$iv`)
      val `value$iv$iv`: Any = `destination$iv`.get(`key$iv`)
      val var10000: Any
      if (`value$iv$iv` == null) {
         val var17: java.util.List = ArrayList()
         `destination$iv`.put(`key$iv`, var17)
         var10000 = var17
      } else {
         var10000 = `value$iv$iv`
      }

      (var10000 as java.util.List).add(valueTransform(`element$iv`))
   }

   return `destination$iv`
}

public fun ByteArray.lastOrNull(): Byte? {
   return if (`$this$lastOrNull`.length == 0) null else `$this$lastOrNull`[`$this$lastOrNull`.length - 1]
}

public fun ShortArray.sum(): Int {
   var sum: Short = 0

   for (element in `$this$sum`) {
      sum += element
   }

   return sum
}

public fun CharArray.lastOrNull(): Char? {
   return if (`$this$lastOrNull`.length == 0) null else `$this$lastOrNull`[`$this$lastOrNull`.length - 1]
}

public inline fun ByteArray.partition(predicate: (Byte) -> Boolean): Pair<List<Byte>, List<Byte>> {
   val first: ArrayList = ArrayList()
   val second: ArrayList = ArrayList()

   for (element in `$this$partition`) {
      if (predicate(element) as java.lang.Boolean) {
         first.add(element)
      } else {
         second.add(element)
      }
   }

   return Pair<>(first, second)
}

public inline fun <R, V> IntArray.zip(other: Array<out Any>, transform: (Int, Any) -> Any): List<Any> {
   val size: Int = Math.min(`$this$zip`.length, other.length)
   val list: ArrayList = ArrayList(size)

   repeat(size) { i ->
      list.add(transform(`$this$zip`[i], other[i]))
   }

   return list
}

public inline fun <K> ShortArray.groupBy(keySelector: (Short) -> Any): Map<Any, List<Short>> {
   val `destination$iv`: java.util.Map = LinkedHashMap()

   for (`element$iv` in `$this$groupBy`) {
      val `key$iv`: Any = keySelector(`element$iv`)
      val `value$iv$iv`: Any = `destination$iv`.get(`key$iv`)
      val var10000: Any
      if (`value$iv$iv` == null) {
         val var15: java.util.List = ArrayList()
         `destination$iv`.put(`key$iv`, var15)
         var10000 = var15
      } else {
         var10000 = `value$iv$iv`
      }

      (var10000 as java.util.List).add(`element$iv`)
   }

   return `destination$iv`
}

public final val lastIndex: Int
   public final get() {
      return `$this$lastIndex`.length - 1
   }


public fun IntArray.singleOrNull(): Int? {
   return if (`$this$singleOrNull`.length == 1) `$this$singleOrNull`[0] else null
}

@JvmName(name = "maxOrThrow")
@SinceKotlin(version = "1.7")
public fun ByteArray.max(): Byte {
   if (`$this$max`.length == 0) {
      throw NoSuchElementException()
   } else {
      var max: Byte = `$this$max`[0]
      val var2: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$max`)).iterator()

      while (var2.hasNext()) {
         val e: Byte = `$this$max`[var2.nextInt()]
         if (max < e) {
            max = e
         }
      }

      return max
   }
}

public inline fun BooleanArray.all(predicate: (Boolean) -> Boolean): Boolean {
   for (element in `$this$all`) {
      if (!predicate(element) as java.lang.Boolean) {
         return false
      }
   }

   return true
}

@InlineOnly
@OverloadResolutionByLambdaReturnType
@JvmName(name = "flatMapIndexedIterableTo")
@SinceKotlin(version = "1.4")
public inline fun <R, C : MutableCollection<in Any>> FloatArray.flatMapIndexedTo(destination: Any, transform: (Int, Float) -> Iterable<Any>): Any {
   var index: Int = 0

   for (element in `$this$flatMapIndexedTo`) {
      CollectionsKt.addAll(destination, transform(index++, element) as java.lang.Iterable)
   }

   return (C)destination
}

public inline fun BooleanArray.lastOrNull(predicate: (Boolean) -> Boolean): Boolean? {
   var var3: Int = `$this$lastOrNull`.length + -1
   if (0 <= `$this$lastOrNull`.length + -1) {
      do {
         val element: Boolean = `$this$lastOrNull`[var3--]
         if (predicate(element) as java.lang.Boolean) {
            return element
         }
      } while (0 <= var3)
   }

   return null
}

public infix fun FloatArray.union(other: Iterable<Float>): Set<Float> {
   val set: java.util.Set = ArraysKt.toMutableSet(`$this$union`)
   CollectionsKt.addAll(set, other)
   return set
}

public inline fun <R> FloatArray.foldIndexed(initial: Any, operation: (Int, Any, Float) -> Any): Any {
   var index: Int = 0
   var accumulator: Any = initial

   for (element in `$this$foldIndexed`) {
      accumulator = operation(index++, accumulator, element)
   }

   return (R)accumulator
}

@SinceKotlin(version = "1.4")
public fun IntArray.shuffle() {
   ArraysKt.shuffle((int[])`$this$shuffle`, Random.Default)
}

public inline fun <T, K, V> Array<out Any>.groupBy(keySelector: (Any) -> Any, valueTransform: (Any) -> Any): Map<Any, List<Any>> {
   val `destination$iv`: java.util.Map = LinkedHashMap()

   for (`element$iv` in `$this$groupBy`) {
      val `key$iv`: Any = keySelector(`element$iv`)
      val `value$iv$iv`: Any = `destination$iv`.get(`key$iv`)
      val var10000: Any
      if (`value$iv$iv` == null) {
         val var16: java.util.List = ArrayList()
         `destination$iv`.put(`key$iv`, var16)
         var10000 = var16
      } else {
         var10000 = `value$iv$iv`
      }

      (var10000 as java.util.List).add(valueTransform(`element$iv`))
   }

   return `destination$iv`
}

public fun FloatArray.getOrNull(index: Int): Float? {
   return if (index >= 0 && index <= ArraysKt.getLastIndex(`$this$getOrNull`)) `$this$getOrNull`[index] else null
}

public infix fun <R> ShortArray.zip(other: Iterable<Any>): List<Pair<Short, Any>> {
   val `$this$zip$iv`: ShortArray = `$this$zip`
   val `arraySize$iv`: Int = `$this$zip`.length
   val `list$iv`: ArrayList = ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(other, 10), `$this$zip`.length))
   var `i$iv`: Int = 0

   for (`element$iv` in other) {
      if (`i$iv` >= `arraySize$iv`) {
         break
      }

      `list$iv`.add(`$this$zip$iv`[`i$iv`++] to `element$iv`)
   }

   return `list$iv`
}

public inline fun LongArray.lastOrNull(predicate: (Long) -> Boolean): Long? {
   var var3: Int = `$this$lastOrNull`.length + -1
   if (0 <= `$this$lastOrNull`.length + -1) {
      do {
         val element: Long = `$this$lastOrNull`[var3--]
         if (predicate(element) as java.lang.Boolean) {
            return element
         }
      } while (0 <= var3)
   }

   return null
}

@SinceKotlin(version = "1.4")
public fun <T> Array<Any>.shuffle(random: Random) {
   for (i in ArraysKt.getLastIndex(`$this$shuffle`) downTo 1) {
      val j: Int = random.nextInt(i + 1)
      val copy: Any = `$this$shuffle`[i]
      `$this$shuffle`[i] = `$this$shuffle`[j]
      `$this$shuffle`[j] = copy
   }
}

public fun LongArray.single(): Long {
   when (`$this$single`.length) {
      0 -> throw NoSuchElementException("Array is empty.")
      1 -> return `$this$single`[0]
      else -> throw IllegalArgumentException("Array has more than one element.")
   }
}

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@InlineOnly
@OverloadResolutionByLambdaReturnType
@JvmName(name = "sumOfULong")
public inline fun FloatArray.sumOf(selector: (Float) -> ULong): ULong {
   var sum: Long = ULong.constructor_impl/* $VF was: constructor-impl */(0L)

   for (element in `$this$sumOf`) {
      sum = ULong.constructor_impl/* $VF was: constructor-impl */(sum + (selector(element) as ULong).unbox_impl/* $VF was: unbox-impl */())
   }

   return sum
}

public fun <T> Array<out Any>.toHashSet(): HashSet<Any> {
   return ArraysKt.toCollection((Object[])`$this$toHashSet`, HashSet(MapsKt.mapCapacity(`$this$toHashSet`.length))) as HashSet<T>
}

@InlineOnly
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.4")
public inline fun <R> BooleanArray.scanIndexed(initial: Any, operation: (Int, Any, Boolean) -> Any): List<Any> {
   val var3: BooleanArray = `$this$scanIndexed`
   val var10000: java.util.List
   if (`$this$scanIndexed`.length == 0) {
      var10000 = CollectionsKt.listOf(initial)
   } else {
      val var4: ArrayList = ArrayList(`$this$scanIndexed`.length + 1)
      var4.add(initial)
      val var6: ArrayList = var4
      var var8: Any = initial
      var var9: Int = 0

      for (var7 in `$this$scanIndexed`.length..var9) {
         var8 = operation(var9, var8, var3[var9])
         var6.add(var8)
      }

      var10000 = var6
   }

   return var10000
}

public fun FloatArray.single(): Float {
   when (`$this$single`.length) {
      0 -> throw NoSuchElementException("Array is empty.")
      1 -> return `$this$single`[0]
      else -> throw IllegalArgumentException("Array has more than one element.")
   }
}

public fun IntArray.sliceArray(indices: IntRange): IntArray {
   return if (indices.isEmpty()) IntArray(0) else ArraysKt.copyOfRange((int[])`$this$sliceArray`, indices.start, indices.endInclusive + 1)
}

public inline fun <C : MutableCollection<in Byte>> ByteArray.filterIndexedTo(destination: Any, predicate: (Int, Byte) -> Boolean): Any {
   val `index$iv`: Int = 0

   for (`item$iv` in `$this$filterIndexedTo`) {
      if (predicate(`index$iv`++, `item$iv`) as java.lang.Boolean) {
         destination.add(`item$iv`)
      }
   }

   return (C)destination
}

@SinceKotlin(version = "1.4")
@InlineOnly
@OverloadResolutionByLambdaReturnType
public inline fun <R> ShortArray.minOfWithOrNull(comparator: Comparator<in Any>, selector: (Short) -> Any): Any? {
   if (`$this$minOfWithOrNull`.length == 0) {
      return null
   } else {
      var minValue: Any = selector(`$this$minOfWithOrNull`[0])
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfWithOrNull`)).iterator()

      while (var4.hasNext()) {
         val v: Any = selector(`$this$minOfWithOrNull`[var4.nextInt()])
         if (comparator.compare(minValue, v) > 0) {
            minValue = v
         }
      }

      return (R)minValue
   }
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun <V> CharArray.associateWith(valueSelector: (Char) -> Any): Map<Char, Any> {
   val result: LinkedHashMap = LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(RangesKt.coerceAtMost(`$this$associateWith`.length, 128)), 16))

   for (var6 in `$this$associateWith`) {
      result.put(var6, valueSelector(var6))
   }

   return result
}

public fun LongArray.sortedDescending(): List<Long> {
   val var10000: LongArray = Arrays.copyOf(`$this$sortedDescending`, `$this$sortedDescending`.length)
   ArraysKt.sort(var10000)
   return ArraysKt.reversed(var10000)
}

public fun ByteArray.sliceArray(indices: IntRange): ByteArray {
   return if (indices.isEmpty()) ByteArray(0) else ArraysKt.copyOfRange((byte[])`$this$sliceArray`, indices.start, indices.endInclusive + 1)
}

public inline fun <C : MutableCollection<in Boolean>> BooleanArray.filterNotTo(destination: Any, predicate: (Boolean) -> Boolean): Any {
   for (element in `$this$filterNotTo`) {
      if (!predicate(element) as java.lang.Boolean) {
         destination.add(element)
      }
   }

   return (C)destination
}

@SinceKotlin(version = "1.4")
public fun ShortArray.minWithOrNull(comparator: Comparator<in Short>): Short? {
   if (`$this$minWithOrNull`.length == 0) {
      return null
   } else {
      var min: Short = `$this$minWithOrNull`[0]
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minWithOrNull`)).iterator()

      while (var3.hasNext()) {
         val e: Short = `$this$minWithOrNull`[var3.nextInt()]
         if (comparator.compare(min, e) > 0) {
            min = e
         }
      }

      return min
   }
}

public inline fun <R : Comparable<Any>> BooleanArray.sortedBy(crossinline selector: (Boolean) -> Any?): List<Boolean> {
   return ArraysKt.sortedWith(`$this$sortedBy`,    // $VF: Compiled from Comparisons.kt
{ a: Any, b: Any ->
      val var3: Function1 = selector
      return ComparisonsKt.compareValues((T)(selector(a) as java.lang.Comparable), (T)(var3(b) as java.lang.Comparable))
   })
}

@SinceKotlin(version = "1.4")
public fun ByteArray.sortDescending(fromIndex: Int, toIndex: Int) {
   ArraysKt.sort(`$this$sortDescending`, fromIndex, toIndex)
   ArraysKt.reverse((byte[])`$this$sortDescending`, fromIndex, toIndex)
}

public inline fun ShortArray.filterNot(predicate: (Short) -> Boolean): List<Short> {
   val `destination$iv`: java.util.Collection = ArrayList()

   for (`element$iv` in `$this$filterNot`) {
      if (!predicate(`element$iv`) as java.lang.Boolean) {
         `destination$iv`.add(`element$iv`)
      }
   }

   return `destination$iv` as MutableList<java.lang.Short>
}

@InlineOnly
public inline operator fun ShortArray.component4(): Short {
   return `$this$component4`[3]
}

public inline fun DoubleArray.filterIndexed(predicate: (Int, Double) -> Boolean): List<Double> {
   val `destination$iv`: java.util.Collection = ArrayList()
   val `index$iv$iv`: Int = 0

   for (`item$iv$iv` in `$this$filterIndexed`) {
      if (predicate(`index$iv$iv`++, `item$iv$iv`) as java.lang.Boolean) {
         `destination$iv`.add(`item$iv$iv`)
      }
   }

   return `destination$iv` as MutableList<java.lang.Double>
}

public infix fun <R> FloatArray.zip(other: Array<out Any>): List<Pair<Float, Any>> {
   val `$this$zip$iv`: FloatArray = `$this$zip`
   val `size$iv`: Int = Math.min(`$this$zip`.length, other.length)
   val `list$iv`: ArrayList = ArrayList(`size$iv`)

   repeat(`size$iv`) { `i$iv` ->
      `list$iv`.add(`$this$zip$iv`[`i$iv`] to other[`i$iv`])
   }

   return `list$iv`
}

public inline fun <K, V, M : MutableMap<in Any, in Any>> ShortArray.associateByTo(destination: Any, keySelector: (Short) -> Any, valueTransform: (Short) -> Any): Any {
   for (element in `$this$associateByTo`) {
      destination.put(keySelector(element), valueTransform(element))
   }

   return (M)destination
}

public fun <T> Array<out Any>.asSequence(): Sequence<Any> {
   return if (`$this$asSequence`.length == 0) SequencesKt.emptySequence() else ArraysKt___ArraysKt$asSequence$$inlined$Sequence$1(`$this$asSequence`)
}

@InlineOnly
public inline fun LongArray.elementAtOrNull(index: Int): Long? {
   return ArraysKt.getOrNull(`$this$elementAtOrNull`, index)
}

public inline fun <T, K, V> Array<out Any>.associateBy(keySelector: (Any) -> Any, valueTransform: (Any) -> Any): Map<Any, Any> {
   val `destination$iv`: java.util.Map = LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(`$this$associateBy`.length), 16))

   for (`element$iv` in `$this$associateBy`) {
      `destination$iv`.put(keySelector(`element$iv`), valueTransform(`element$iv`))
   }

   return `destination$iv`
}

@InlineOnly
public inline fun LongArray.find(predicate: (Long) -> Boolean): Long? {
   val `$this$firstOrNull$iv`: LongArray = `$this$find`
   var var4: Int = 0
   val var5: Int = `$this$find`.length

   var var10000: java.lang.Long
   while (true) {
      if (var4 >= var5) {
         var10000 = null
         break
      }

      val `element$iv`: Long = `$this$firstOrNull$iv`[var4]
      if (predicate(`$this$firstOrNull$iv`[var4]) as java.lang.Boolean) {
         var10000 = `element$iv`
         break
      }

      var4++
   }

   return var10000
}

@InlineOnly
public inline operator fun ShortArray.component5(): Short {
   return `$this$component5`[4]
}

public inline fun <T, R : Comparable<Any>> Array<out Any>.sortedByDescending(crossinline selector: (Any) -> Any?): List<Any> {
   return (java.util.List<T>)ArraysKt.sortedWith((Object[])`$this$sortedByDescending`,    // $VF: Compiled from Comparisons.kt
{ a: Any, b: Any ->
      val var3: Function1 = selector
      return ComparisonsKt.compareValues((T)(selector(b) as java.lang.Comparable), (T)(var3(a) as java.lang.Comparable))
   })
}

public inline fun ByteArray.filterNot(predicate: (Byte) -> Boolean): List<Byte> {
   val `destination$iv`: java.util.Collection = ArrayList()

   for (`element$iv` in `$this$filterNot`) {
      if (!predicate(`element$iv`) as java.lang.Boolean) {
         `destination$iv`.add(`element$iv`)
      }
   }

   return `destination$iv` as MutableList<java.lang.Byte>
}

@InlineOnly
public inline fun BooleanArray.elementAtOrNull(index: Int): Boolean? {
   return ArraysKt.getOrNull(`$this$elementAtOrNull`, index)
}

@InlineOnly
public inline fun <T> Array<out Any>.elementAtOrElse(index: Int, defaultValue: (Int) -> Any): Any {
   return (T)(if (index >= 0 && index <= ArraysKt.getLastIndex(`$this$elementAtOrElse`)) `$this$elementAtOrElse`[index] else defaultValue(index))
}

public fun CharArray.sortedWith(comparator: Comparator<in Char>): List<Char> {
   val var2: Array<Character> = ArraysKt.toTypedArray(`$this$sortedWith`)
   ArraysKt.sortWith(var2, comparator)
   return ArraysKt.asList(var2)
}

@JvmName(name = "minOrThrow")
@SinceKotlin(version = "1.7")
public fun IntArray.min(): Int {
   if (`$this$min`.length == 0) {
      throw NoSuchElementException()
   } else {
      var min: Int = `$this$min`[0]
      val var2: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$min`)).iterator()

      while (var2.hasNext()) {
         val e: Int = `$this$min`[var2.nextInt()]
         if (min > e) {
            min = e
         }
      }

      return min
   }
}

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun DoubleArray.maxOf(selector: (Double) -> Float): Float {
   if (`$this$maxOf`.length == 0) {
      throw NoSuchElementException()
   } else {
      var maxValue: Float = (selector(`$this$maxOf`[0]) as java.lang.Number).floatValue()
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOf`)).iterator()

      while (var3.hasNext()) {
         maxValue = Math.max(maxValue, (selector(`$this$maxOf`[var3.nextInt()]) as java.lang.Number).floatValue())
      }

      return maxValue
   }
}

@InlineOnly
public inline operator fun LongArray.component2(): Long {
   return `$this$component2`[1]
}

@OverloadResolutionByLambdaReturnType
@JvmName(name = "flatMapIndexedIterableTo")
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun <T, R, C : MutableCollection<in Any>> Array<out Any>.flatMapIndexedTo(destination: Any, transform: (Int, Any) -> Iterable<Any>): Any {
   var index: Int = 0

   for (element in `$this$flatMapIndexedTo`) {
      CollectionsKt.addAll(destination, transform(index++, element) as java.lang.Iterable)
   }

   return (C)destination
}

@InlineOnly
public inline operator fun <T> Array<out Any>.component4(): Any {
   return (T)`$this$component4`[3]
}

public inline fun DoubleArray.indexOfLast(predicate: (Double) -> Boolean): Int {
   var var3: Int = `$this$indexOfLast`.length + -1
   if (0 <= `$this$indexOfLast`.length + -1) {
      do {
         val index: Int = var3--
         if (predicate(`$this$indexOfLast`[index]) as java.lang.Boolean) {
            return index
         }
      } while (0 <= var3)
   }

   return -1
}

public inline fun <R> ShortArray.foldRight(initial: Any, operation: (Short, Any) -> Any): Any {
   var index: Int = ArraysKt.getLastIndex(`$this$foldRight`)
   var accumulator: Any = initial

   while (index >= 0) {
      accumulator = operation(`$this$foldRight`[index--], accumulator)
   }

   return (R)accumulator
}

@JvmName(name = "sumOfLong")
@SinceKotlin(version = "1.4")
@InlineOnly
@OverloadResolutionByLambdaReturnType
public inline fun ByteArray.sumOf(selector: (Byte) -> Long): Long {
   var sum: Long = 0L

   for (element in `$this$sumOf`) {
      sum += (selector(element) as java.lang.Number).longValue()
   }

   return sum
}

@InlineOnly
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
public inline fun <R> FloatArray.minOfWith(comparator: Comparator<in Any>, selector: (Float) -> Any): Any {
   if (`$this$minOfWith`.length == 0) {
      throw NoSuchElementException()
   } else {
      var minValue: Any = selector(`$this$minOfWith`[0])
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfWith`)).iterator()

      while (var4.hasNext()) {
         val v: Any = selector(`$this$minOfWith`[var4.nextInt()])
         if (comparator.compare(minValue, v) > 0) {
            minValue = v
         }
      }

      return (R)minValue
   }
}

public fun IntArray.reversed(): List<Int> {
   if (`$this$reversed`.length == 0) {
      return CollectionsKt.emptyList()
   } else {
      val list: java.util.List = ArraysKt.toMutableList(`$this$reversed`)
      CollectionsKt.reverse(list)
      return list
   }
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun <V, M : MutableMap<in Byte, in Any>> ByteArray.associateWithTo(destination: Any, valueSelector: (Byte) -> Any): Any {
   for (element in `$this$associateWithTo`) {
      destination.put(element, valueSelector(element))
   }

   return (M)destination
}

public inline fun IntArray.indexOfLast(predicate: (Int) -> Boolean): Int {
   var var3: Int = `$this$indexOfLast`.length + -1
   if (0 <= `$this$indexOfLast`.length + -1) {
      do {
         val index: Int = var3--
         if (predicate(`$this$indexOfLast`[index]) as java.lang.Boolean) {
            return index
         }
      } while (0 <= var3)
   }

   return -1
}

public inline fun <R, C : MutableCollection<in Any>> ByteArray.mapIndexedTo(destination: Any, transform: (Int, Byte) -> Any): Any {
   var index: Int = 0

   for (item in `$this$mapIndexedTo`) {
      destination.add(transform(index++, item))
   }

   return (C)destination
}

public infix fun BooleanArray.union(other: Iterable<Boolean>): Set<Boolean> {
   val set: java.util.Set = ArraysKt.toMutableSet(`$this$union`)
   CollectionsKt.addAll(set, other)
   return set
}

@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun <R> BooleanArray.runningFold(initial: Any, operation: (Any, Boolean) -> Any): List<Any> {
   if (`$this$runningFold`.length == 0) {
      return (java.util.List<R>)CollectionsKt.listOf(initial)
   } else {
      var accumulator: Any = ArrayList(`$this$runningFold`.length + 1)
      accumulator.add(initial)
      val result: Any = accumulator
      accumulator = initial

      for (element in `$this$runningFold`) {
         accumulator = operation(accumulator, element)
         result.add(accumulator)
      }

      return result as MutableList<R>
   }
}

public fun IntArray.withIndex(): Iterable<IndexedValue<Int>> {
   return IndexingIterable<>(   // $VF: Compiled from _Arrays.kt
{
      return ArrayIteratorsKt.iterator($this$withIndex)
   } as () -> MutableIterator<Int>)
}

public inline fun <R> IntArray.foldIndexed(initial: Any, operation: (Int, Any, Int) -> Any): Any {
   var index: Int = 0
   var accumulator: Any = initial

   for (element in `$this$foldIndexed`) {
      accumulator = operation(index++, accumulator, element)
   }

   return (R)accumulator
}

@InlineOnly
public inline fun IntArray.isEmpty(): Boolean {
   return `$this$isEmpty`.length == 0
}

public fun <A : Appendable> FloatArray.joinTo(
   buffer: Any,
   separator: CharSequence = ...,
   prefix: CharSequence = ...,
   postfix: CharSequence = ...,
   limit: Int = ...,
   truncated: CharSequence = ...,
   transform: ((Float) -> CharSequence)? = ...
): Any {
   buffer.append(prefix)
   val count: Int = 0

   for (element in `$this$joinTo`) {
      if (++count > 1) {
         buffer.append(separator)
      }

      if (limit >= 0 && count > limit) {
         break
      }

      if (transform != null) {
         buffer.append(transform(element) as java.lang.CharSequence)
      } else {
         buffer.append(java.lang.String.valueOf(element))
      }
   }

   if (limit >= 0 && count > limit) {
      buffer.append(truncated)
   }

   buffer.append(postfix)
   return (A)buffer
}

public inline fun <V> ByteArray.zip(other: ByteArray, transform: (Byte, Byte) -> Any): List<Any> {
   val size: Int = Math.min(`$this$zip`.length, other.length)
   val list: ArrayList = ArrayList(size)

   repeat(size) { i ->
      list.add(transform(`$this$zip`[i], other[i]))
   }

   return list
}

public fun IntArray.reverse() {
   val midPoint: Int = `$this$reverse`.length / 2 - 1
   if (`$this$reverse`.length / 2 - 1 >= 0) {
      var reverseIndex: Int = ArraysKt.getLastIndex(`$this$reverse`)

      // $VF: Unable to resugar Kotlin loop from Java for loop
      val var3: IntIterator = IntRange(0, midPoint).iterator()
      while (true) {
         if (var3.hasNext()) break
         val index: Int = var3.nextInt()
         val tmp: Int = `$this$reverse`[index]
         `$this$reverse`[index] = `$this$reverse`[reverseIndex]
         `$this$reverse`[reverseIndex] = tmp

         reverseIndex--
      }
   }
}

public inline fun DoubleArray.first(predicate: (Double) -> Boolean): Double {
   for (element in `$this$first`) {
      if (predicate(element) as java.lang.Boolean) {
         return element
      }
   }

   throw NoSuchElementException("Array contains no element matching the predicate.")
}

@JvmName(name = "averageOfFloat")
public fun Array<out Float>.average(): Double {
   var sum: Double = 0.0
   var count: Int = 0
   var var4: Int = 0

   for (var5 in `$this$average`.length..var4) {
      sum += `$this$average`[var4].floatValue()
      count++
   }

   return if (count == 0) java.lang.Double.NaN else sum / count
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun <T> Array<out Any>.onEachIndexed(action: (Int, Any) -> Unit): Array<out Any> {
   var `index$iv`: Int = 0

   for (`item$iv` in `$this$onEachIndexed`) {
      action(`index$iv`++, `item$iv`)
   }

   return (T[])`$this$onEachIndexed`
}

public fun CharArray.asSequence(): Sequence<Char> {
   return if (`$this$asSequence`.length == 0) SequencesKt.emptySequence() else ArraysKt___ArraysKt$asSequence$$inlined$Sequence$9(`$this$asSequence`)
}

public inline fun <T, R, C : MutableCollection<in Any>> Array<out Any>.mapIndexedTo(destination: Any, transform: (Int, Any) -> Any): Any {
   var index: Int = 0

   for (item in `$this$mapIndexedTo`) {
      destination.add(transform(index++, item))
   }

   return (C)destination
}

@SinceKotlin(version = "1.7")
@JvmName(name = "maxOrThrow")
public fun IntArray.max(): Int {
   if (`$this$max`.length == 0) {
      throw NoSuchElementException()
   } else {
      var max: Int = `$this$max`[0]
      val var2: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$max`)).iterator()

      while (var2.hasNext()) {
         val e: Int = `$this$max`[var2.nextInt()]
         if (max < e) {
            max = e
         }
      }

      return max
   }
}

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.5")
@JvmName(name = "sumOfUInt")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@InlineOnly
public inline fun ByteArray.sumOf(selector: (Byte) -> UInt): UInt {
   var sum: Int = UInt.constructor_impl/* $VF was: constructor-impl */(0)

   for (element in `$this$sumOf`) {
      sum = UInt.constructor_impl/* $VF was: constructor-impl */(sum + (selector(element) as UInt).unbox_impl/* $VF was: unbox-impl */())
   }

   return sum
}

public fun ByteArray.dropLast(n: Int): List<Byte> {
   if (n < 0) {
      throw IllegalArgumentException(("Requested element count $n is less than zero.").toString())
   } else {
      return ArraysKt.take((byte[])`$this$dropLast`, RangesKt.coerceAtLeast(`$this$dropLast`.length - n, 0))
   }
}

public fun CharArray.joinToString(
   separator: CharSequence = ", " as java.lang.CharSequence,
   prefix: CharSequence = "" as java.lang.CharSequence,
   postfix: CharSequence = "" as java.lang.CharSequence,
   limit: Int = -1,
   truncated: CharSequence = "..." as java.lang.CharSequence,
   transform: ((Char) -> CharSequence)? = null
): String {
   val var10000: java.lang.String = ArraysKt.joinTo((char[])`$this$joinToString`, StringBuilder(), separator, prefix, postfix, limit, truncated, transform)
      .toString()
      return var10000
}

public inline fun <R, C : MutableCollection<in Any>> CharArray.flatMapTo(destination: Any, transform: (Char) -> Iterable<Any>): Any {
   for (element in `$this$flatMapTo`) {
      CollectionsKt.addAll(destination, transform(element) as java.lang.Iterable)
   }

   return (C)destination
}

public inline fun FloatArray.none(predicate: (Float) -> Boolean): Boolean {
   for (element in `$this$none`) {
      if (predicate(element) as java.lang.Boolean) {
         return false
      }
   }

   return true
}

@InlineOnly
public inline operator fun FloatArray.component5(): Float {
   return `$this$component5`[4]
}

public inline fun <R : Comparable<Any>> DoubleArray.sortedByDescending(crossinline selector: (Double) -> Any?): List<Double> {
   return ArraysKt.sortedWith(`$this$sortedByDescending`,    // $VF: Compiled from Comparisons.kt
{ a: Any, b: Any ->
      val var3: Function1 = selector
      return ComparisonsKt.compareValues((T)(selector(b) as java.lang.Comparable), (T)(var3(a) as java.lang.Comparable))
   })
}

@OverloadResolutionByLambdaReturnType
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun BooleanArray.minOfOrNull(selector: (Boolean) -> Double): Double? {
   if (`$this$minOfOrNull`.length == 0) {
      return null
   } else {
      var minValue: Double = (selector(`$this$minOfOrNull`[0]) as java.lang.Number).doubleValue()
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfOrNull`)).iterator()

      while (var4.hasNext()) {
         minValue = Math.min(minValue, (selector(`$this$minOfOrNull`[var4.nextInt()]) as java.lang.Number).doubleValue())
      }

      return minValue
   }
}

public fun <T> Array<out Any>.sortedArrayWith(comparator: Comparator<in Any>): Array<out Any> {
   if (`$this$sortedArrayWith`.length == 0) {
      return (T[])`$this$sortedArrayWith`
   } else {
      val var10000: Array<Any> = Arrays.copyOf(`$this$sortedArrayWith`, `$this$sortedArrayWith`.length)
      ArraysKt.sortWith(var10000, comparator)
      return (T[])var10000
   }
}

public fun BooleanArray.single(): Boolean {
   when (`$this$single`.length) {
      0 -> throw NoSuchElementException("Array is empty.")
      1 -> return `$this$single`[0]
      else -> throw IllegalArgumentException("Array has more than one element.")
   }
}

public inline fun ShortArray.single(predicate: (Short) -> Boolean): Short {
   var single: java.lang.Short = null
   var found: Boolean = false

   for (element in `$this$single`) {
      if (predicate(element) as java.lang.Boolean) {
         if (found) {
            throw IllegalArgumentException("Array contains more than one matching element.")
         }

         single = element
         found = true
      }
   }

   if (!found) {
      throw NoSuchElementException("Array contains no element matching the predicate.")
   } else {
      return single
   }
}

@SinceKotlin(version = "1.4")
public fun Array<out Float>.maxOrNull(): Float? {
   if (`$this$maxOrNull`.length == 0) {
      return null
   } else {
      var max: Float = `$this$maxOrNull`[0]
      val var2: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOrNull`)).iterator()

      while (var2.hasNext()) {
         max = Math.max(max, `$this$maxOrNull`[var2.nextInt()])
      }

      return max
   }
}

public inline fun <T, K> Array<out Any>.distinctBy(selector: (Any) -> Any): List<Any> {
   val set: HashSet = HashSet()
   val list: ArrayList = ArrayList()

   for (e in `$this$distinctBy`) {
      if (set.add(selector(e))) {
         list.add(e)
      }
   }

   return list
}

@InlineOnly
public inline fun ShortArray.find(predicate: (Short) -> Boolean): Short? {
   val `$this$firstOrNull$iv`: ShortArray = `$this$find`
   var var4: Int = 0
   val var5: Int = `$this$find`.length

   var var10000: java.lang.Short
   while (true) {
      if (var4 >= var5) {
         var10000 = null
         break
      }

      val `element$iv`: Short = `$this$firstOrNull$iv`[var4]
      if (predicate(`$this$firstOrNull$iv`[var4]) as java.lang.Boolean) {
         var10000 = `element$iv`
         break
      }

      var4++
   }

   return var10000
}

public inline fun DoubleArray.filterNot(predicate: (Double) -> Boolean): List<Double> {
   val `destination$iv`: java.util.Collection = ArrayList()

   for (`element$iv` in `$this$filterNot`) {
      if (!predicate(`element$iv`) as java.lang.Boolean) {
         `destination$iv`.add(`element$iv`)
      }
   }

   return `destination$iv` as MutableList<java.lang.Double>
}

public fun DoubleArray.toList(): List<Double> {
   var var10000: java.util.List
   when (`$this$toList`.length) {
      0 -> var10000 = CollectionsKt.emptyList()
      1 -> var10000 = CollectionsKt.listOf(`$this$toList`[0])
      else -> var10000 = ArraysKt.toMutableList(`$this$toList`)
   }

   return var10000
}

public inline fun <T, R, V> Array<out Any>.zip(other: Iterable<Any>, transform: (Any, Any) -> Any): List<Any> {
   val arraySize: Int = `$this$zip`.length
   val list: ArrayList = ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(other, 10), `$this$zip`.length))
   var i: Int = 0

   for (element in other) {
      if (i >= arraySize) {
         break
      }

      list.add(transform(`$this$zip`[i++], element))
   }

   return list
}

public inline fun ByteArray.firstOrNull(predicate: (Byte) -> Boolean): Byte? {
   for (element in `$this$firstOrNull`) {
      if (predicate(element) as java.lang.Boolean) {
         return element
      }
   }

   return null
}

@InlineOnly
public inline operator fun <T> Array<out Any>.component1(): Any {
   return (T)`$this$component1`[0]
}

@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public inline fun DoubleArray.reduceOrNull(operation: (Double, Double) -> Double): Double? {
   if (`$this$reduceOrNull`.length == 0) {
      return null
   } else {
      var accumulator: Double = `$this$reduceOrNull`[0]
      val var5: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$reduceOrNull`)).iterator()

      while (var5.hasNext()) {
         accumulator = (operation(accumulator, `$this$reduceOrNull`[var5.nextInt()]) as java.lang.Number).doubleValue()
      }

      return accumulator
   }
}

public inline fun ShortArray.partition(predicate: (Short) -> Boolean): Pair<List<Short>, List<Short>> {
   val first: ArrayList = ArrayList()
   val second: ArrayList = ArrayList()

   for (element in `$this$partition`) {
      if (predicate(element) as java.lang.Boolean) {
         first.add(element)
      } else {
         second.add(element)
      }
   }

   return Pair<>(first, second)
}

public fun CharArray.toMutableSet(): MutableSet<Char> {
   return ArraysKt.toCollection((char[])`$this$toMutableSet`, LinkedHashSet<>(MapsKt.mapCapacity(RangesKt.coerceAtMost(`$this$toMutableSet`.length, 128))))
}

public infix fun <T, R> Array<out Any>.zip(other: Iterable<Any>): List<Pair<Any, Any>> {
   val `$this$zip$iv`: Array<Any> = `$this$zip`
   val `arraySize$iv`: Int = `$this$zip`.length
   val `list$iv`: ArrayList = ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(other, 10), `$this$zip`.length))
   var `i$iv`: Int = 0

   for (`element$iv` in other) {
      if (`i$iv` >= `arraySize$iv`) {
         break
      }

      `list$iv`.add(`$this$zip$iv`[`i$iv`++] to `element$iv`)
   }

   return `list$iv`
}

@InlineOnly
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.4")
public inline fun <R> DoubleArray.scanIndexed(initial: Any, operation: (Int, Any, Double) -> Any): List<Any> {
   val var3: DoubleArray = `$this$scanIndexed`
   val var10000: java.util.List
   if (`$this$scanIndexed`.length == 0) {
      var10000 = CollectionsKt.listOf(initial)
   } else {
      val var4: ArrayList = ArrayList(`$this$scanIndexed`.length + 1)
      var4.add(initial)
      val var6: ArrayList = var4
      var var8: Any = initial
      var var9: Int = 0

      for (var7 in `$this$scanIndexed`.length..var9) {
         var8 = operation(var9, var8, var3[var9])
         var6.add(var8)
      }

      var10000 = var6
   }

   return var10000
}

public inline fun <R> DoubleArray.foldIndexed(initial: Any, operation: (Int, Any, Double) -> Any): Any {
   var index: Int = 0
   var accumulator: Any = initial

   for (element in `$this$foldIndexed`) {
      accumulator = operation(index++, accumulator, element)
   }

   return (R)accumulator
}

@SinceKotlin(version = "1.7")
@JvmName(name = "maxWithOrThrow")
public fun DoubleArray.maxWith(comparator: Comparator<in Double>): Double {
   if (`$this$maxWith`.length == 0) {
      throw NoSuchElementException()
   } else {
      var max: Double = `$this$maxWith`[0]
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxWith`)).iterator()

      while (var4.hasNext()) {
         val e: Double = `$this$maxWith`[var4.nextInt()]
         if (comparator.compare(max, e) < 0) {
            max = e
         }
      }

      return max
   }
}

@SinceKotlin(version = "1.4")
public inline fun <R : Comparable<Any>> ByteArray.maxByOrNull(selector: (Byte) -> Any): Byte? {
   if (`$this$maxByOrNull`.length == 0) {
      return null
   } else {
      var maxElem: Byte = `$this$maxByOrNull`[0]
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$maxByOrNull`)
      if (lastIndex == 0) {
         return maxElem
      } else {
         var maxValue: java.lang.Comparable = selector(maxElem) as java.lang.Comparable
         val var6: IntIterator = IntRange(1, lastIndex).iterator()

         while (var6.hasNext()) {
            val e: Byte = `$this$maxByOrNull`[var6.nextInt()]
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

public fun FloatArray.lastOrNull(): Float? {
   return if (`$this$lastOrNull`.length == 0) null else `$this$lastOrNull`[`$this$lastOrNull`.length - 1]
}

public fun BooleanArray.distinct(): List<Boolean> {
   return CollectionsKt.toList(ArraysKt.toMutableSet(`$this$distinct`))
}

@InlineOnly
public inline fun BooleanArray.elementAtOrElse(index: Int, defaultValue: (Int) -> Boolean): Boolean {
   return if (index >= 0 && index <= ArraysKt.getLastIndex(`$this$elementAtOrElse`))
      `$this$elementAtOrElse`[index]
      else
      defaultValue(index) as java.lang.Boolean
   }

public fun <T : Comparable<Any>> Array<out Any>.sortedDescending(): List<Any> {
   return (java.util.List<T>)ArraysKt.sortedWith(`$this$sortedDescending`, ComparisonsKt.reverseOrder())
}

public inline fun <T> Array<out Any>.any(predicate: (Any) -> Boolean): Boolean {
   for (element in `$this$any`) {
      if (predicate(element) as java.lang.Boolean) {
         return true
      }
   }

   return false
}

@SinceKotlin(version = "1.4")
@JvmName(name = "sumOfLong")
@OverloadResolutionByLambdaReturnType
@InlineOnly
public inline fun <T> Array<out Any>.sumOf(selector: (Any) -> Long): Long {
   var sum: Long = 0L

   for (element in `$this$sumOf`) {
      sum += (selector(element) as java.lang.Number).longValue()
   }

   return sum
}

public infix fun CharArray.union(other: Iterable<Char>): Set<Char> {
   val set: java.util.Set = ArraysKt.toMutableSet(`$this$union`)
   CollectionsKt.addAll(set, other)
   return set
}

public inline fun <T> Array<out Any>.single(predicate: (Any) -> Boolean): Any {
   var single: Any = null
   var found: Boolean = false

   for (element in `$this$single`) {
      if (predicate(element) as java.lang.Boolean) {
         if (found) {
            throw IllegalArgumentException("Array contains more than one matching element.")
         }

         single = element
         found = true
      }
   }

   if (!found) {
      throw NoSuchElementException("Array contains no element matching the predicate.")
   } else {
      return (T)single
   }
}

public fun ShortArray.single(): Short {
   when (`$this$single`.length) {
      0 -> throw NoSuchElementException("Array is empty.")
      1 -> return `$this$single`[0]
      else -> throw IllegalArgumentException("Array has more than one element.")
   }
}

public fun <T> Array<out Any>.getOrNull(index: Int): Any? {
   return (T)(if (index >= 0 && index <= ArraysKt.getLastIndex(`$this$getOrNull`)) `$this$getOrNull`[index] else null)
}

public inline fun <R, C : MutableCollection<in Any>> FloatArray.flatMapTo(destination: Any, transform: (Float) -> Iterable<Any>): Any {
   for (element in `$this$flatMapTo`) {
      CollectionsKt.addAll(destination, transform(element) as java.lang.Iterable)
   }

   return (C)destination
}

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@InlineOnly
@JvmName(name = "sumOfInt")
public inline fun IntArray.sumOf(selector: (Int) -> Int): Int {
   var sum: Int = 0

   for (element in `$this$sumOf`) {
      sum += (selector(element) as java.lang.Number).intValue()
   }

   return sum
}

public inline fun <K, V> ShortArray.associate(transform: (Short) -> Pair<Any, Any>): Map<Any, Any> {
   val `destination$iv`: java.util.Map = LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(`$this$associate`.length), 16))

   for (`element$iv` in `$this$associate`) {
      val var11: Pair = transform(`element$iv`) as Pair
      `destination$iv`.put(var11.first, var11.second)
   }

   return `destination$iv`
}

@JvmName(name = "minByOrThrow")
@SinceKotlin(version = "1.7")
public inline fun <R : Comparable<Any>> IntArray.minBy(selector: (Int) -> Any): Int {
   if (`$this$minBy`.length == 0) {
      throw NoSuchElementException()
   } else {
      var minElem: Int = `$this$minBy`[0]
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$minBy`)
      if (lastIndex == 0) {
         return minElem
      } else {
         var minValue: java.lang.Comparable = selector(minElem) as java.lang.Comparable
         val var6: IntIterator = IntRange(1, lastIndex).iterator()

         while (var6.hasNext()) {
            val e: Int = `$this$minBy`[var6.nextInt()]
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

public inline fun <R, C : MutableCollection<in Any>> ShortArray.mapIndexedTo(destination: Any, transform: (Int, Short) -> Any): Any {
   var index: Int = 0

   for (item in `$this$mapIndexedTo`) {
      destination.add(transform(index++, item))
   }

   return (C)destination
}

public fun LongArray.singleOrNull(): Long? {
   return if (`$this$singleOrNull`.length == 1) `$this$singleOrNull`[0] else null
}

public inline fun <K> DoubleArray.associateBy(keySelector: (Double) -> Any): Map<Any, Double> {
   val `destination$iv`: java.util.Map = LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(`$this$associateBy`.length), 16))

   for (`element$iv` in `$this$associateBy`) {
      `destination$iv`.put(keySelector(`element$iv`), `element$iv`)
   }

   return `destination$iv`
}

public inline fun <K, M : MutableMap<in Any, MutableList<Byte>>> ByteArray.groupByTo(destination: Any, keySelector: (Byte) -> Any): Any {
   for (element in `$this$groupByTo`) {
      val key: Any = keySelector(element)
      val `value$iv`: Any = destination.get(key)
      val var10000: Any
      if (`value$iv` == null) {
         val var13: java.util.List = ArrayList()
         destination.put(key, var13)
         var10000 = var13
      } else {
         var10000 = `value$iv`
      }

      (var10000 as java.util.List).add(element)
   }

   return (M)destination
}

public fun ShortArray.distinct(): List<Short> {
   return CollectionsKt.toList(ArraysKt.toMutableSet(`$this$distinct`))
}

public fun LongArray.drop(n: Int): List<Long> {
   if (n < 0) {
      throw IllegalArgumentException(("Requested element count $n is less than zero.").toString())
   } else {
      return ArraysKt.takeLast(`$this$drop`, RangesKt.coerceAtLeast(`$this$drop`.length - n, 0))
   }
}

public inline fun IntArray.takeWhile(predicate: (Int) -> Boolean): List<Int> {
   val list: ArrayList = ArrayList()

   for (item in `$this$takeWhile`) {
      if (!predicate(item) as java.lang.Boolean) {
         break
      }

      list.add(item)
   }

   return list
}

public inline fun LongArray.count(predicate: (Long) -> Boolean): Int {
   var count: Int = 0

   for (element in `$this$count`) {
      if (predicate(element) as java.lang.Boolean) {
         count++
      }
   }

   return count
}

public fun LongArray.asSequence(): Sequence<Long> {
   return if (`$this$asSequence`.length == 0) SequencesKt.emptySequence() else ArraysKt___ArraysKt$asSequence$$inlined$Sequence$5(`$this$asSequence`)
}

@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun BooleanArray.runningReduceIndexed(operation: (Int, Boolean, Boolean) -> Boolean): List<Boolean> {
   if (`$this$runningReduceIndexed`.length == 0) {
      return CollectionsKt.emptyList()
   } else {
      var var7: Boolean = `$this$runningReduceIndexed`[0]
      val index: ArrayList = ArrayList(`$this$runningReduceIndexed`.length)
      index.add(var7)
      val result: ArrayList = index
      var var8: Int = 1

      for (var9 in `$this$runningReduceIndexed`.length..var8) {
         var7 = operation(var8, var7, `$this$runningReduceIndexed`[var8]) as java.lang.Boolean
         result.add(var7)
      }

      return result
   }
}

@SinceKotlin(version = "1.4")
public inline fun <R : Comparable<Any>> LongArray.maxByOrNull(selector: (Long) -> Any): Long? {
   if (`$this$maxByOrNull`.length == 0) {
      return null
   } else {
      var maxElem: Long = `$this$maxByOrNull`[0]
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$maxByOrNull`)
      if (lastIndex == 0) {
         return maxElem
      } else {
         var maxValue: java.lang.Comparable = selector(maxElem) as java.lang.Comparable
         val var7: IntIterator = IntRange(1, lastIndex).iterator()

         while (var7.hasNext()) {
            val e: Long = `$this$maxByOrNull`[var7.nextInt()]
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
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public inline fun BooleanArray.reduceRightOrNull(operation: (Boolean, Boolean) -> Boolean): Boolean? {
   var index: Int = ArraysKt.getLastIndex(`$this$reduceRightOrNull`)
   if (index < 0) {
      return null
   } else {
      var accumulator: Boolean = `$this$reduceRightOrNull`[index--]

      while (index >= 0) {
         accumulator = operation(`$this$reduceRightOrNull`[index--], accumulator) as java.lang.Boolean
      }

      return accumulator
   }
}

@SinceKotlin(version = "1.4")
public inline fun <R : Comparable<Any>> IntArray.minByOrNull(selector: (Int) -> Any): Int? {
   if (`$this$minByOrNull`.length == 0) {
      return null
   } else {
      var minElem: Int = `$this$minByOrNull`[0]
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$minByOrNull`)
      if (lastIndex == 0) {
         return minElem
      } else {
         var minValue: java.lang.Comparable = selector(minElem) as java.lang.Comparable
         val var6: IntIterator = IntRange(1, lastIndex).iterator()

         while (var6.hasNext()) {
            val e: Int = `$this$minByOrNull`[var6.nextInt()]
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

public fun IntArray.toMutableList(): MutableList<Int> {
   val list: ArrayList = ArrayList(`$this$toMutableList`.length)

   for (item in `$this$toMutableList`) {
      list.add(item)
   }

   return list
}

public inline fun <C : MutableCollection<in Int>> IntArray.filterTo(destination: Any, predicate: (Int) -> Boolean): Any {
   for (element in `$this$filterTo`) {
      if (predicate(element) as java.lang.Boolean) {
         destination.add(element)
      }
   }

   return (C)destination
}

public inline fun ShortArray.reduceIndexed(operation: (Int, Short, Short) -> Short): Short {
   if (`$this$reduceIndexed`.length == 0) {
      throw UnsupportedOperationException("Empty array can't be reduced.")
   } else {
      var accumulator: Short = `$this$reduceIndexed`[0]
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$reduceIndexed`)).iterator()

      while (var4.hasNext()) {
         val index: Int = var4.nextInt()
         accumulator = (operation(index, accumulator, `$this$reduceIndexed`[index]) as java.lang.Number).shortValue()
      }

      return accumulator
   }
}

public fun IntArray.toHashSet(): HashSet<Int> {
   return ArraysKt.toCollection((int[])`$this$toHashSet`, HashSet<>(MapsKt.mapCapacity(`$this$toHashSet`.length)))
}

public inline fun <T> Array<out Any>.dropLastWhile(predicate: (Any) -> Boolean): List<Any> {
   for (index in ArraysKt.getLastIndex(`$this$dropLastWhile`) downTo 0) {
      if (!predicate(`$this$dropLastWhile`[index]) as java.lang.Boolean) {
         return (java.util.List<T>)ArraysKt.take((Object[])`$this$dropLastWhile`, index + 1)
      }
   }

   return CollectionsKt.emptyList()
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun ByteArray.runningReduce(operation: (Byte, Byte) -> Byte): List<Byte> {
   if (`$this$runningReduce`.length == 0) {
      return CollectionsKt.emptyList()
   } else {
      var var7: Byte = `$this$runningReduce`[0]
      val index: ArrayList = ArrayList(`$this$runningReduce`.length)
      index.add(var7)
      val result: ArrayList = index
      var var8: Int = 1

      for (var9 in `$this$runningReduce`.length..var8) {
         var7 = (operation(var7, `$this$runningReduce`[var8]) as java.lang.Number).byteValue()
         result.add(var7)
      }

      return result
   }
}

public inline fun <C : MutableCollection<in Short>> ShortArray.filterTo(destination: Any, predicate: (Short) -> Boolean): Any {
   for (element in `$this$filterTo`) {
      if (predicate(element) as java.lang.Boolean) {
         destination.add(element)
      }
   }

   return (C)destination
}

@SinceKotlin(version = "1.4")
public inline fun DoubleArray.reduceRightIndexedOrNull(operation: (Int, Double, Double) -> Double): Double? {
   var index: Int = ArraysKt.getLastIndex(`$this$reduceRightIndexedOrNull`)
   if (index < 0) {
      return null
   } else {
      var accumulator: Double = `$this$reduceRightIndexedOrNull`[index--]

      while (index >= 0) {
         accumulator = (operation(index, `$this$reduceRightIndexedOrNull`[index], accumulator) as java.lang.Number).doubleValue()
         index--
      }

      return accumulator
   }
}

public inline fun BooleanArray.first(predicate: (Boolean) -> Boolean): Boolean {
   for (element in `$this$first`) {
      if (predicate(element) as java.lang.Boolean) {
         return element
      }
   }

   throw NoSuchElementException("Array contains no element matching the predicate.")
}

@InlineOnly
public inline operator fun FloatArray.component2(): Float {
   return `$this$component2`[1]
}

@InlineOnly
public inline fun ShortArray.elementAtOrNull(index: Int): Short? {
   return ArraysKt.getOrNull((short[])`$this$elementAtOrNull`, index)
}

@SinceKotlin(version = "1.4")
public inline fun ShortArray.reduceIndexedOrNull(operation: (Int, Short, Short) -> Short): Short? {
   if (`$this$reduceIndexedOrNull`.length == 0) {
      return null
   } else {
      var accumulator: Short = `$this$reduceIndexedOrNull`[0]
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$reduceIndexedOrNull`)).iterator()

      while (var4.hasNext()) {
         val index: Int = var4.nextInt()
         accumulator = (operation(index, accumulator, `$this$reduceIndexedOrNull`[index]) as java.lang.Number).shortValue()
      }

      return accumulator
   }
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun <R> CharArray.scan(initial: Any, operation: (Any, Char) -> Any): List<Any> {
   val var10000: java.util.List
   if (`$this$scan`.length == 0) {
      var10000 = CollectionsKt.listOf(initial)
   } else {
      val var4: ArrayList = ArrayList(`$this$scan`.length + 1)
      var4.add(initial)
      val var6: ArrayList = var4
      var var9: Any = initial

      for (var8 in `$this$scan`) {
         var9 = operation(var9, var8)
         var6.add(var9)
      }

      var10000 = var6
   }

   return var10000
}

@JvmName(name = "minWithOrThrow")
@SinceKotlin(version = "1.7")
public fun FloatArray.minWith(comparator: Comparator<in Float>): Float {
   if (`$this$minWith`.length == 0) {
      throw NoSuchElementException()
   } else {
      var min: Float = `$this$minWith`[0]
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minWith`)).iterator()

      while (var3.hasNext()) {
         val e: Float = `$this$minWith`[var3.nextInt()]
         if (comparator.compare(min, e) > 0) {
            min = e
         }
      }

      return min
   }
}

@InlineOnly
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
public inline fun <T> Array<out Any>.minOf(selector: (Any) -> Double): Double {
   if (`$this$minOf`.length == 0) {
      throw NoSuchElementException()
   } else {
      var minValue: Double = (selector(`$this$minOf`[0]) as java.lang.Number).doubleValue()
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOf`)).iterator()

      while (var4.hasNext()) {
         minValue = Math.min(minValue, (selector(`$this$minOf`[var4.nextInt()]) as java.lang.Number).doubleValue())
      }

      return minValue
   }
}

@SinceKotlin(version = "1.7")
@JvmName(name = "maxWithOrThrow")
public fun ShortArray.maxWith(comparator: Comparator<in Short>): Short {
   if (`$this$maxWith`.length == 0) {
      throw NoSuchElementException()
   } else {
      var max: Short = `$this$maxWith`[0]
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxWith`)).iterator()

      while (var3.hasNext()) {
         val e: Short = `$this$maxWith`[var3.nextInt()]
         if (comparator.compare(max, e) < 0) {
            max = e
         }
      }

      return max
   }
}

public infix fun IntArray.union(other: Iterable<Int>): Set<Int> {
   val set: java.util.Set = ArraysKt.toMutableSet(`$this$union`)
   CollectionsKt.addAll(set, other)
   return set
}

@InlineOnly
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.5")
@JvmName(name = "sumOfUInt")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
public inline fun IntArray.sumOf(selector: (Int) -> UInt): UInt {
   var sum: Int = UInt.constructor_impl/* $VF was: constructor-impl */(0)

   for (element in `$this$sumOf`) {
      sum = UInt.constructor_impl/* $VF was: constructor-impl */(sum + (selector(element) as UInt).unbox_impl/* $VF was: unbox-impl */())
   }

   return sum
}

public operator fun BooleanArray.contains(element: Boolean): Boolean {
   return ArraysKt.indexOf(`$this$contains`, element) >= 0
}

@JvmName(name = "maxByOrThrow")
@SinceKotlin(version = "1.7")
public inline fun <R : Comparable<Any>> LongArray.maxBy(selector: (Long) -> Any): Long {
   if (`$this$maxBy`.length == 0) {
      throw NoSuchElementException()
   } else {
      var maxElem: Long = `$this$maxBy`[0]
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$maxBy`)
      if (lastIndex == 0) {
         return maxElem
      } else {
         var maxValue: java.lang.Comparable = selector(maxElem) as java.lang.Comparable
         val var7: IntIterator = IntRange(1, lastIndex).iterator()

         while (var7.hasNext()) {
            val e: Long = `$this$maxBy`[var7.nextInt()]
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

public fun IntArray.reversedArray(): IntArray {
   if (`$this$reversedArray`.length == 0) {
      return `$this$reversedArray`
   } else {
      val result: IntArray = IntArray(`$this$reversedArray`.length)
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$reversedArray`)
      val var3: IntIterator = IntRange(0, lastIndex).iterator()

      while (var3.hasNext()) {
         val i: Int = var3.nextInt()
         result[lastIndex - i] = `$this$reversedArray`[i]
      }

      return result
   }
}

public fun ByteArray.toSet(): Set<Byte> {
   var var10000: java.util.Set
   when (`$this$toSet`.length) {
      0 -> var10000 = SetsKt.emptySet()
      1 -> var10000 = SetsKt.setOf(`$this$toSet`[0])
      else -> var10000 = ArraysKt.toCollection((byte[])`$this$toSet`, LinkedHashSet(MapsKt.mapCapacity(`$this$toSet`.length)))
   }

   return var10000
}

public inline fun <T, R> Array<out Any>.foldRightIndexed(initial: Any, operation: (Int, Any, Any) -> Any): Any {
   var index: Int = ArraysKt.getLastIndex(`$this$foldRightIndexed`)
   var accumulator: Any = initial

   while (index >= 0) {
      accumulator = operation(index, `$this$foldRightIndexed`[index], accumulator)
      index--
   }

   return (R)accumulator
}

@InlineOnly
public inline operator fun BooleanArray.component2(): Boolean {
   return `$this$component2`[1]
}

@InlineOnly
public inline operator fun CharArray.component3(): Char {
   return `$this$component3`[2]
}

public fun FloatArray.slice(indices: Iterable<Int>): List<Float> {
   val size: Int = CollectionsKt.collectionSizeOrDefault(indices, 10)
   if (size == 0) {
      return CollectionsKt.emptyList()
   } else {
      val list: ArrayList = ArrayList(size)
      val var4: java.util.Iterator = indices.iterator()

      while (var4.hasNext()) {
         list.add(`$this$slice`[(var4.next() as java.lang.Number).intValue()])
      }

      return list
   }
}

public inline fun BooleanArray.filter(predicate: (Boolean) -> Boolean): List<Boolean> {
   val `destination$iv`: java.util.Collection = ArrayList()

   for (`element$iv` in `$this$filter`) {
      if (predicate(`element$iv`) as java.lang.Boolean) {
         `destination$iv`.add(`element$iv`)
      }
   }

   return `destination$iv` as MutableList<java.lang.Boolean>
}

public fun ShortArray.indexOf(element: Short): Int {
   var index: Int = 0

   for (var3 in `$this$indexOf`.length..index) {
      if (element == `$this$indexOf`[index]) {
         return index
      }
   }

   return -1
}

public fun DoubleArray.average(): Double {
   var sum: Double = 0.0
   var count: Int = 0

   for (element in `$this$average`) {
      sum += element
      count++
   }

   return if (count == 0) java.lang.Double.NaN else sum / count
}

@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun IntArray.runningReduceIndexed(operation: (Int, Int, Int) -> Int): List<Int> {
   if (`$this$runningReduceIndexed`.length == 0) {
      return CollectionsKt.emptyList()
   } else {
      var var7: Int = `$this$runningReduceIndexed`[0]
      val index: ArrayList = ArrayList(`$this$runningReduceIndexed`.length)
      index.add(var7)
      val result: ArrayList = index
      var var8: Int = 1

      for (var9 in `$this$runningReduceIndexed`.length..var8) {
         var7 = (operation(var8, var7, `$this$runningReduceIndexed`[var8]) as java.lang.Number).intValue()
         result.add(var7)
      }

      return result
   }
}

public fun LongArray.sorted(): List<Long> {
   val var1: Array<java.lang.Long> = ArraysKt.toTypedArray(`$this$sorted`)
   ArraysKt.sort(var1)
   return ArraysKt.asList(var1)
}

public inline fun FloatArray.reduceIndexed(operation: (Int, Float, Float) -> Float): Float {
   if (`$this$reduceIndexed`.length == 0) {
      throw UnsupportedOperationException("Empty array can't be reduced.")
   } else {
      var accumulator: Float = `$this$reduceIndexed`[0]
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$reduceIndexed`)).iterator()

      while (var4.hasNext()) {
         val index: Int = var4.nextInt()
         accumulator = (operation(index, accumulator, `$this$reduceIndexed`[index]) as java.lang.Number).floatValue()
      }

      return accumulator
   }
}

public inline fun IntArray.forEachIndexed(action: (Int, Int) -> Unit) {
   var index: Int = 0

   for (item in `$this$forEachIndexed`) {
      action(index++, item)
   }
}

public fun ShortArray.reversedArray(): ShortArray {
   if (`$this$reversedArray`.length == 0) {
      return `$this$reversedArray`
   } else {
      val result: ShortArray = ShortArray(`$this$reversedArray`.length)
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$reversedArray`)
      val var3: IntIterator = IntRange(0, lastIndex).iterator()

      while (var3.hasNext()) {
         val i: Int = var3.nextInt()
         result[lastIndex - i] = `$this$reversedArray`[i]
      }

      return result
   }
}

public inline fun <T> Array<out Any>.all(predicate: (Any) -> Boolean): Boolean {
   for (element in `$this$all`) {
      if (!predicate(element) as java.lang.Boolean) {
         return false
      }
   }

   return true
}

public inline fun <R> CharArray.map(transform: (Char) -> Any): List<Any> {
   val `destination$iv`: java.util.Collection = ArrayList(`$this$map`.length)

   for (`item$iv` in `$this$map`) {
      `destination$iv`.add(transform(`item$iv`))
   }

   return `destination$iv` as MutableList<R>
}

@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
@InlineOnly
public inline fun <T> Array<out Any>.maxOf(selector: (Any) -> Double): Double {
   if (`$this$maxOf`.length == 0) {
      throw NoSuchElementException()
   } else {
      var maxValue: Double = (selector(`$this$maxOf`[0]) as java.lang.Number).doubleValue()
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOf`)).iterator()

      while (var4.hasNext()) {
         maxValue = Math.max(maxValue, (selector(`$this$maxOf`[var4.nextInt()]) as java.lang.Number).doubleValue())
      }

      return maxValue
   }
}

@JvmName(name = "minOrThrow")
@SinceKotlin(version = "1.7")
public fun Array<out Float>.min(): Float {
   if (`$this$min`.length == 0) {
      throw NoSuchElementException()
   } else {
      var min: Float = `$this$min`[0]
      val var2: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$min`)).iterator()

      while (var2.hasNext()) {
         min = Math.min(min, `$this$min`[var2.nextInt()])
      }

      return min
   }
}

public fun IntArray.average(): Double {
   var sum: Double = 0.0
   var count: Int = 0

   for (element in `$this$average`) {
      sum += element
      count++
   }

   return if (count == 0) java.lang.Double.NaN else sum / count
}

@InlineOnly
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@JvmName(name = "sumOfInt")
public inline fun ByteArray.sumOf(selector: (Byte) -> Int): Int {
   var sum: Int = 0

   for (element in `$this$sumOf`) {
      sum += (selector(element) as java.lang.Number).intValue()
   }

   return sum
}

public fun <T> Array<out Any>.toSet(): Set<Any> {
   var var10000: java.util.Set
   when (`$this$toSet`.length) {
      0 -> var10000 = SetsKt.emptySet()
      1 -> var10000 = SetsKt.setOf(`$this$toSet`[0])
      else -> var10000 = ArraysKt.toCollection((Object[])`$this$toSet`, LinkedHashSet(MapsKt.mapCapacity(`$this$toSet`.length)))
   }

   return var10000
}

@InlineOnly
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
public inline fun <R> DoubleArray.maxOfWithOrNull(comparator: Comparator<in Any>, selector: (Double) -> Any): Any? {
   if (`$this$maxOfWithOrNull`.length == 0) {
      return null
   } else {
      var maxValue: Any = selector(`$this$maxOfWithOrNull`[0])
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfWithOrNull`)).iterator()

      while (var4.hasNext()) {
         val v: Any = selector(`$this$maxOfWithOrNull`[var4.nextInt()])
         if (comparator.compare(maxValue, v) < 0) {
            maxValue = v
         }
      }

      return (R)maxValue
   }
}

public inline fun <C : MutableCollection<in Boolean>> BooleanArray.filterTo(destination: Any, predicate: (Boolean) -> Boolean): Any {
   for (element in `$this$filterTo`) {
      if (predicate(element) as java.lang.Boolean) {
         destination.add(element)
      }
   }

   return (C)destination
}

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun DoubleArray.minOfOrNull(selector: (Double) -> Double): Double? {
   if (`$this$minOfOrNull`.length == 0) {
      return null
   } else {
      var minValue: Double = (selector(`$this$minOfOrNull`[0]) as java.lang.Number).doubleValue()
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfOrNull`)).iterator()

      while (var4.hasNext()) {
         minValue = Math.min(minValue, (selector(`$this$minOfOrNull`[var4.nextInt()]) as java.lang.Number).doubleValue())
      }

      return minValue
   }
}

public inline fun LongArray.all(predicate: (Long) -> Boolean): Boolean {
   for (element in `$this$all`) {
      if (!predicate(element) as java.lang.Boolean) {
         return false
      }
   }

   return true
}

public fun Array<out Char>.toCharArray(): CharArray {
   var var1: Int = 0
   val var2: Int = `$this$toCharArray`.length
   val var3: CharArray = CharArray(`$this$toCharArray`.length)

   while (var1 < var2) {
      var3[var1] = `$this$toCharArray`[var1]
      var1++
   }

   return var3
}

public fun BooleanArray.first(): Boolean {
   if (`$this$first`.length == 0) {
      throw NoSuchElementException("Array is empty.")
   } else {
      return `$this$first`[0]
   }
}

public inline fun IntArray.takeLastWhile(predicate: (Int) -> Boolean): List<Int> {
   for (index in ArraysKt.getLastIndex(`$this$takeLastWhile`) downTo 0) {
      if (!predicate(`$this$takeLastWhile`[index]) as java.lang.Boolean) {
         return ArraysKt.drop((int[])`$this$takeLastWhile`, index + 1)
      }
   }

   return ArraysKt.toList(`$this$takeLastWhile`)
}

@OverloadResolutionByLambdaReturnType
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun IntArray.minOf(selector: (Int) -> Float): Float {
   if (`$this$minOf`.length == 0) {
      throw NoSuchElementException()
   } else {
      var minValue: Float = (selector(`$this$minOf`[0]) as java.lang.Number).floatValue()
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOf`)).iterator()

      while (var3.hasNext()) {
         minValue = Math.min(minValue, (selector(`$this$minOf`[var3.nextInt()]) as java.lang.Number).floatValue())
      }

      return minValue
   }
}

public fun DoubleArray.toHashSet(): HashSet<Double> {
   return ArraysKt.toCollection(`$this$toHashSet`, HashSet<>(MapsKt.mapCapacity(`$this$toHashSet`.length)))
}

public operator fun <T> Array<out Any>.contains(element: Any): Boolean {
   return ArraysKt.indexOf(`$this$contains`, element) >= 0
}

@JvmName(name = "minByOrThrow")
@SinceKotlin(version = "1.7")
public inline fun <R : Comparable<Any>> BooleanArray.minBy(selector: (Boolean) -> Any): Boolean {
   if (`$this$minBy`.length == 0) {
      throw NoSuchElementException()
   } else {
      var minElem: Boolean = `$this$minBy`[0]
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$minBy`)
      if (lastIndex == 0) {
         return minElem
      } else {
         var minValue: java.lang.Comparable = selector(minElem) as java.lang.Comparable
         val var6: IntIterator = IntRange(1, lastIndex).iterator()

         while (var6.hasNext()) {
            val e: Boolean = `$this$minBy`[var6.nextInt()]
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

public inline fun <C : MutableCollection<in Short>> ShortArray.filterIndexedTo(destination: Any, predicate: (Int, Short) -> Boolean): Any {
   val `index$iv`: Int = 0

   for (`item$iv` in `$this$filterIndexedTo`) {
      if (predicate(`index$iv`++, `item$iv`) as java.lang.Boolean) {
         destination.add(`item$iv`)
      }
   }

   return (C)destination
}

public inline fun CharArray.count(predicate: (Char) -> Boolean): Int {
   var count: Int = 0

   for (element in `$this$count`) {
      if (predicate(element) as java.lang.Boolean) {
         count++
      }
   }

   return count
}

@InlineOnly
public inline operator fun CharArray.component2(): Char {
   return `$this$component2`[1]
}

public infix fun BooleanArray.intersect(other: Iterable<Boolean>): Set<Boolean> {
   val set: java.util.Set = ArraysKt.toMutableSet(`$this$intersect`)
   CollectionsKt.retainAll(set, other)
   return set
}

public inline fun ShortArray.takeLastWhile(predicate: (Short) -> Boolean): List<Short> {
   for (index in ArraysKt.getLastIndex(`$this$takeLastWhile`) downTo 0) {
      if (!predicate(`$this$takeLastWhile`[index]) as java.lang.Boolean) {
         return ArraysKt.drop((short[])`$this$takeLastWhile`, index + 1)
      }
   }

   return ArraysKt.toList(`$this$takeLastWhile`)
}

public inline fun FloatArray.indexOfLast(predicate: (Float) -> Boolean): Int {
   var var3: Int = `$this$indexOfLast`.length + -1
   if (0 <= `$this$indexOfLast`.length + -1) {
      do {
         val index: Int = var3--
         if (predicate(`$this$indexOfLast`[index]) as java.lang.Boolean) {
            return index
         }
      } while (0 <= var3)
   }

   return -1
}

public inline fun <R, V> ShortArray.zip(other: Iterable<Any>, transform: (Short, Any) -> Any): List<Any> {
   val arraySize: Int = `$this$zip`.length
   val list: ArrayList = ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(other, 10), `$this$zip`.length))
   var i: Int = 0

   for (element in other) {
      if (i >= arraySize) {
         break
      }

      list.add(transform(`$this$zip`[i++], element))
   }

   return list
}

public inline fun <C : MutableCollection<in Int>> IntArray.filterIndexedTo(destination: Any, predicate: (Int, Int) -> Boolean): Any {
   val `index$iv`: Int = 0

   for (`item$iv` in `$this$filterIndexedTo`) {
      if (predicate(`index$iv`++, `item$iv`) as java.lang.Boolean) {
         destination.add(`item$iv`)
      }
   }

   return (C)destination
}

public fun <A : Appendable> LongArray.joinTo(
   buffer: Any,
   separator: CharSequence = ...,
   prefix: CharSequence = ...,
   postfix: CharSequence = ...,
   limit: Int = ...,
   truncated: CharSequence = ...,
   transform: ((Long) -> CharSequence)? = ...
): Any {
   buffer.append(prefix)
   val count: Int = 0

   for (element in `$this$joinTo`) {
      if (++count > 1) {
         buffer.append(separator)
      }

      if (limit >= 0 && count > limit) {
         break
      }

      if (transform != null) {
         buffer.append(transform(element) as java.lang.CharSequence)
      } else {
         buffer.append(java.lang.String.valueOf(element))
      }
   }

   if (limit >= 0 && count > limit) {
      buffer.append(truncated)
   }

   buffer.append(postfix)
   return (A)buffer
}

@SinceKotlin(version = "1.4")
public inline fun <K, V, M : MutableMap<in Any, in Any>> Array<out Any>.associateWithTo(destination: Any, valueSelector: (Any) -> Any): Any {
   for (element in `$this$associateWithTo`) {
      destination.put(element, valueSelector(element))
   }

   return (M)destination
}

public inline fun <K, V> LongArray.associateBy(keySelector: (Long) -> Any, valueTransform: (Long) -> Any): Map<Any, Any> {
   val `destination$iv`: java.util.Map = LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(`$this$associateBy`.length), 16))

   for (`element$iv` in `$this$associateBy`) {
      `destination$iv`.put(keySelector(`element$iv`), valueTransform(`element$iv`))
   }

   return `destination$iv`
}

@SinceKotlin(version = "1.4")
public inline fun ByteArray.reduceIndexedOrNull(operation: (Int, Byte, Byte) -> Byte): Byte? {
   if (`$this$reduceIndexedOrNull`.length == 0) {
      return null
   } else {
      var accumulator: Byte = `$this$reduceIndexedOrNull`[0]
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$reduceIndexedOrNull`)).iterator()

      while (var4.hasNext()) {
         val index: Int = var4.nextInt()
         accumulator = (operation(index, accumulator, `$this$reduceIndexedOrNull`[index]) as java.lang.Number).byteValue()
      }

      return accumulator
   }
}

@SinceKotlin(version = "1.4")
@InlineOnly
@OverloadResolutionByLambdaReturnType
public inline fun <R : Comparable<Any>> FloatArray.minOf(selector: (Float) -> Any): Any {
   if (`$this$minOf`.length == 0) {
      throw NoSuchElementException()
   } else {
      var minValue: java.lang.Comparable = selector(`$this$minOf`[0]) as java.lang.Comparable
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOf`)).iterator()

      while (var3.hasNext()) {
         val v: java.lang.Comparable = selector(`$this$minOf`[var3.nextInt()]) as java.lang.Comparable
         if (minValue.compareTo(v) > 0) {
            minValue = v
         }
      }

      return (R)minValue
   }
}

@JvmName(name = "minWithOrThrow")
@SinceKotlin(version = "1.7")
public fun BooleanArray.minWith(comparator: Comparator<in Boolean>): Boolean {
   if (`$this$minWith`.length == 0) {
      throw NoSuchElementException()
   } else {
      var min: Boolean = `$this$minWith`[0]
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minWith`)).iterator()

      while (var3.hasNext()) {
         val e: Boolean = `$this$minWith`[var3.nextInt()]
         if (comparator.compare(min, e) > 0) {
            min = e
         }
      }

      return min
   }
}

public inline fun <K, V> CharArray.associate(transform: (Char) -> Pair<Any, Any>): Map<Any, Any> {
   val `destination$iv`: java.util.Map = LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(`$this$associate`.length), 16))

   for (`element$iv` in `$this$associate`) {
      val var11: Pair = transform(`element$iv`) as Pair
      `destination$iv`.put(var11.first, var11.second)
   }

   return `destination$iv`
}

public fun IntArray.toList(): List<Int> {
   var var10000: java.util.List
   when (`$this$toList`.length) {
      0 -> var10000 = CollectionsKt.emptyList()
      1 -> var10000 = CollectionsKt.listOf(`$this$toList`[0])
      else -> var10000 = ArraysKt.toMutableList(`$this$toList`)
   }

   return var10000
}

@InlineOnly
public inline fun CharArray.elementAtOrNull(index: Int): Char? {
   return ArraysKt.getOrNull((char[])`$this$elementAtOrNull`, index)
}

public fun CharArray.toSet(): Set<Char> {
   var var10000: java.util.Set
   when (`$this$toSet`.length) {
      0 -> var10000 = SetsKt.emptySet()
      1 -> var10000 = SetsKt.setOf(`$this$toSet`[0])
      else -> var10000 = ArraysKt.toCollection((char[])`$this$toSet`, LinkedHashSet(MapsKt.mapCapacity(RangesKt.coerceAtMost(`$this$toSet`.length, 128))))
   }

   return var10000
}

public fun Array<out Double>.toDoubleArray(): DoubleArray {
   var var1: Int = 0
   val var2: Int = `$this$toDoubleArray`.length
   val var3: DoubleArray = DoubleArray(`$this$toDoubleArray`.length)

   while (var1 < var2) {
      var3[var1] = `$this$toDoubleArray`[var1]
      var1++
   }

   return var3
}

public inline fun ShortArray.filter(predicate: (Short) -> Boolean): List<Short> {
   val `destination$iv`: java.util.Collection = ArrayList()

   for (`element$iv` in `$this$filter`) {
      if (predicate(`element$iv`) as java.lang.Boolean) {
         `destination$iv`.add(`element$iv`)
      }
   }

   return `destination$iv` as MutableList<java.lang.Short>
}

public fun CharArray.sorted(): List<Char> {
   val var1: Array<Character> = ArraysKt.toTypedArray(`$this$sorted`)
   ArraysKt.sort(var1)
   return ArraysKt.asList(var1)
}

@SinceKotlin(version = "1.4")
public fun ShortArray.maxOrNull(): Short? {
   if (`$this$maxOrNull`.length == 0) {
      return null
   } else {
      var max: Short = `$this$maxOrNull`[0]
      val var2: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOrNull`)).iterator()

      while (var2.hasNext()) {
         val e: Short = `$this$maxOrNull`[var2.nextInt()]
         if (max < e) {
            max = e
         }
      }

      return max
   }
}

public infix fun BooleanArray.subtract(other: Iterable<Boolean>): Set<Boolean> {
   val set: java.util.Set = ArraysKt.toMutableSet(`$this$subtract`)
   CollectionsKt.removeAll(set, other)
   return set
}

public inline fun FloatArray.forEach(action: (Float) -> Unit) {
   for (element in `$this$forEach`) {
      action(element)
   }
}

@SinceKotlin(version = "1.4")
public fun ShortArray.maxWithOrNull(comparator: Comparator<in Short>): Short? {
   if (`$this$maxWithOrNull`.length == 0) {
      return null
   } else {
      var max: Short = `$this$maxWithOrNull`[0]
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxWithOrNull`)).iterator()

      while (var3.hasNext()) {
         val e: Short = `$this$maxWithOrNull`[var3.nextInt()]
         if (comparator.compare(max, e) < 0) {
            max = e
         }
      }

      return max
   }
}

public fun Array<out Byte>.toByteArray(): ByteArray {
   var var1: Int = 0
   val var2: Int = `$this$toByteArray`.length
   val var3: ByteArray = ByteArray(`$this$toByteArray`.length)

   while (var1 < var2) {
      var3[var1] = `$this$toByteArray`[var1]
      var1++
   }

   return var3
}

public fun IntArray.slice(indices: Iterable<Int>): List<Int> {
   val size: Int = CollectionsKt.collectionSizeOrDefault(indices, 10)
   if (size == 0) {
      return CollectionsKt.emptyList()
   } else {
      val list: ArrayList = ArrayList(size)
      val var4: java.util.Iterator = indices.iterator()

      while (var4.hasNext()) {
         list.add(`$this$slice`[(var4.next() as java.lang.Number).intValue()])
      }

      return list
   }
}

public fun DoubleArray.withIndex(): Iterable<IndexedValue<Double>> {
   return IndexingIterable<>(   // $VF: Compiled from _Arrays.kt
{
      return ArrayIteratorsKt.iterator($this$withIndex)
   } as () -> MutableIterator<java.lang.Double>)
}

@InlineOnly
public inline fun CharArray.find(predicate: (Char) -> Boolean): Char? {
   val `$this$firstOrNull$iv`: CharArray = `$this$find`
   var var4: Int = 0
   val var5: Int = `$this$find`.length

   var var10000: Character
   while (true) {
      if (var4 >= var5) {
         var10000 = null
         break
      }

      val `element$iv`: Char = `$this$firstOrNull$iv`[var4]
      if (predicate(`$this$firstOrNull$iv`[var4]) as java.lang.Boolean) {
         var10000 = `element$iv`
         break
      }

      var4++
   }

   return var10000
}

@SinceKotlin(version = "1.4")
public fun DoubleArray.maxWithOrNull(comparator: Comparator<in Double>): Double? {
   if (`$this$maxWithOrNull`.length == 0) {
      return null
   } else {
      var max: Double = `$this$maxWithOrNull`[0]
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxWithOrNull`)).iterator()

      while (var4.hasNext()) {
         val e: Double = `$this$maxWithOrNull`[var4.nextInt()]
         if (comparator.compare(max, e) < 0) {
            max = e
         }
      }

      return max
   }
}

public inline fun <V> BooleanArray.zip(other: BooleanArray, transform: (Boolean, Boolean) -> Any): List<Any> {
   val size: Int = Math.min(`$this$zip`.length, other.length)
   val list: ArrayList = ArrayList(size)

   repeat(size) { i ->
      list.add(transform(`$this$zip`[i], other[i]))
   }

   return list
}

public fun CharArray.toList(): List<Char> {
   var var10000: java.util.List
   when (`$this$toList`.length) {
      0 -> var10000 = CollectionsKt.emptyList()
      1 -> var10000 = CollectionsKt.listOf(`$this$toList`[0])
      else -> var10000 = ArraysKt.toMutableList(`$this$toList`)
   }

   return var10000
}

public operator fun CharArray.contains(element: Char): Boolean {
   return ArraysKt.indexOf(`$this$contains`, element) >= 0
}

public inline fun ByteArray.none(predicate: (Byte) -> Boolean): Boolean {
   for (element in `$this$none`) {
      if (predicate(element) as java.lang.Boolean) {
         return false
      }
   }

   return true
}

public fun FloatArray.drop(n: Int): List<Float> {
   if (n < 0) {
      throw IllegalArgumentException(("Requested element count $n is less than zero.").toString())
   } else {
      return ArraysKt.takeLast(`$this$drop`, RangesKt.coerceAtLeast(`$this$drop`.length - n, 0))
   }
}

public inline fun BooleanArray.dropLastWhile(predicate: (Boolean) -> Boolean): List<Boolean> {
   for (index in ArraysKt.getLastIndex(`$this$dropLastWhile`) downTo 0) {
      if (!predicate(`$this$dropLastWhile`[index]) as java.lang.Boolean) {
         return ArraysKt.take(`$this$dropLastWhile`, index + 1)
      }
   }

   return CollectionsKt.emptyList()
}

public inline fun LongArray.indexOfFirst(predicate: (Long) -> Boolean): Int {
   var index: Int = 0

   for (var4 in `$this$indexOfFirst`.length..index) {
      if (predicate(`$this$indexOfFirst`[index]) as java.lang.Boolean) {
         return index
      }
   }

   return -1
}

public inline fun <R> LongArray.fold(initial: Any, operation: (Any, Long) -> Any): Any {
   var accumulator: Any = initial

   for (element in `$this$fold`) {
      accumulator = operation(accumulator, element)
   }

   return (R)accumulator
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun FloatArray.runningReduce(operation: (Float, Float) -> Float): List<Float> {
   if (`$this$runningReduce`.length == 0) {
      return CollectionsKt.emptyList()
   } else {
      var accumulator: Float = 0.0F
      accumulator = `$this$runningReduce`[0]
      val index: Int = (int)ArrayList(`$this$runningReduce`.length)
      index.add(accumulator)
      val result: Any = index
      var var8: Int = 1

      for (var9 in `$this$runningReduce`.length..var8) {
         accumulator = (operation(accumulator, `$this$runningReduce`[var8]) as java.lang.Number).floatValue()
         result.add(accumulator)
      }

      return result as MutableList<java.lang.Float>
   }
}

public fun ShortArray.asIterable(): Iterable<Short> {
   return if (`$this$asIterable`.length == 0) CollectionsKt.emptyList() else ArraysKt___ArraysKt$asIterable$$inlined$Iterable$3(`$this$asIterable`)
}

public inline fun <K> BooleanArray.distinctBy(selector: (Boolean) -> Any): List<Boolean> {
   val set: HashSet = HashSet()
   val list: ArrayList = ArrayList()

   for (e in `$this$distinctBy`) {
      if (set.add(selector(e))) {
         list.add(e)
      }
   }

   return list
}

public fun IntArray.sortedArrayDescending(): IntArray {
   if (`$this$sortedArrayDescending`.length == 0) {
      return `$this$sortedArrayDescending`
   } else {
      val var10000: IntArray = Arrays.copyOf(`$this$sortedArrayDescending`, `$this$sortedArrayDescending`.length)
      ArraysKt.sortDescending(var10000)
      return var10000
   }
}

@JvmName(name = "sumOfDouble")
public fun Array<out Double>.sum(): Double {
   var sum: Double = 0.0
   var var3: Int = 0

   for (var4 in `$this$sum`.length..var3) {
      sum += `$this$sum`[var3]
   }

   return sum
}

public inline fun <S, T : Any> Array<out Any>.reduceIndexed(operation: (Int, Any, Any) -> Any): Any {
   if (`$this$reduceIndexed`.length == 0) {
      throw UnsupportedOperationException("Empty array can't be reduced.")
   } else {
      var accumulator: Any = `$this$reduceIndexed`[0]
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$reduceIndexed`)).iterator()

      while (var4.hasNext()) {
         val index: Int = var4.nextInt()
         accumulator = operation(index, accumulator, `$this$reduceIndexed`[index])
      }

      return (S)accumulator
   }
}

public inline fun <R, C : MutableCollection<in Any>> BooleanArray.mapIndexedTo(destination: Any, transform: (Int, Boolean) -> Any): Any {
   var index: Int = 0

   for (item in `$this$mapIndexedTo`) {
      destination.add(transform(index++, item))
   }

   return (C)destination
}

@SinceKotlin(version = "1.4")
public fun Array<out Double>.maxOrNull(): Double? {
   if (`$this$maxOrNull`.length == 0) {
      return null
   } else {
      var max: Double = `$this$maxOrNull`[0]
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOrNull`)).iterator()

      while (var3.hasNext()) {
         max = Math.max(max, `$this$maxOrNull`[var3.nextInt()])
      }

      return max
   }
}

@Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = []))
@DeprecatedSinceKotlin(warningSince = "1.5")
public inline fun FloatArray.sumBy(selector: (Float) -> Int): Int {
   var sum: Int = 0

   for (element in `$this$sumBy`) {
      sum += (selector(element) as java.lang.Number).intValue()
   }

   return sum
}

@InlineOnly
public inline fun <T> Array<out Any>.findLast(predicate: (Any) -> Boolean): Any? {
   val `$this$lastOrNull$iv`: Array<Any> = `$this$findLast`
   var var4: Int = `$this$findLast`.length + -1
   if (0 <= `$this$findLast`.length + -1) {
      do {
         val `element$iv`: Any = `$this$lastOrNull$iv`[var4--]
         if (predicate(`element$iv`) as java.lang.Boolean) {
            return (T)`element$iv`
         }
      } while (0 <= var4)
   }

   return null
}

@SinceKotlin(version = "1.4")
public fun LongArray.shuffle(random: Random) {
   for (i in ArraysKt.getLastIndex(`$this$shuffle`) downTo 1) {
      val j: Int = random.nextInt(i + 1)
      val copy: Long = `$this$shuffle`[i]
      `$this$shuffle`[i] = `$this$shuffle`[j]
      `$this$shuffle`[j] = copy
   }
}

@InlineOnly
@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
public inline fun <R : Comparable<Any>> ByteArray.maxOfOrNull(selector: (Byte) -> Any): Any? {
   if (`$this$maxOfOrNull`.length == 0) {
      return null
   } else {
      var maxValue: java.lang.Comparable = selector(`$this$maxOfOrNull`[0]) as java.lang.Comparable
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfOrNull`)).iterator()

      while (var3.hasNext()) {
         val v: java.lang.Comparable = selector(`$this$maxOfOrNull`[var3.nextInt()]) as java.lang.Comparable
         if (maxValue.compareTo(v) < 0) {
            maxValue = v
         }
      }

      return (R)maxValue
   }
}

public fun FloatArray.withIndex(): Iterable<IndexedValue<Float>> {
   return IndexingIterable<>(   // $VF: Compiled from _Arrays.kt
{
      return ArrayIteratorsKt.iterator($this$withIndex)
   } as () -> MutableIterator<java.lang.Float>)
}

public infix fun <R> LongArray.zip(other: Array<out Any>): List<Pair<Long, Any>> {
   val `$this$zip$iv`: LongArray = `$this$zip`
   val `size$iv`: Int = Math.min(`$this$zip`.length, other.length)
   val `list$iv`: ArrayList = ArrayList(`size$iv`)

   repeat(`size$iv`) { `i$iv` ->
      `list$iv`.add(`$this$zip$iv`[`i$iv`] to other[`i$iv`])
   }

   return `list$iv`
}

@SinceKotlin(version = "1.4")
public fun DoubleArray.minWithOrNull(comparator: Comparator<in Double>): Double? {
   if (`$this$minWithOrNull`.length == 0) {
      return null
   } else {
      var min: Double = `$this$minWithOrNull`[0]
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minWithOrNull`)).iterator()

      while (var4.hasNext()) {
         val e: Double = `$this$minWithOrNull`[var4.nextInt()]
         if (comparator.compare(min, e) > 0) {
            min = e
         }
      }

      return min
   }
}

@InlineOnly
public inline fun FloatArray.isEmpty(): Boolean {
   return `$this$isEmpty`.length == 0
}

public inline fun CharArray.indexOfFirst(predicate: (Char) -> Boolean): Int {
   var index: Int = 0

   for (var4 in `$this$indexOfFirst`.length..index) {
      if (predicate(`$this$indexOfFirst`[index]) as java.lang.Boolean) {
         return index
      }
   }

   return -1
}

public inline fun <K, V, M : MutableMap<in Any, in Any>> BooleanArray.associateByTo(
   destination: Any,
   keySelector: (Boolean) -> Any,
   valueTransform: (Boolean) -> Any
): Any {
   for (element in `$this$associateByTo`) {
      destination.put(keySelector(element), valueTransform(element))
   }

   return (M)destination
}

public fun IntArray.drop(n: Int): List<Int> {
   if (n < 0) {
      throw IllegalArgumentException(("Requested element count $n is less than zero.").toString())
   } else {
      return ArraysKt.takeLast((int[])`$this$drop`, RangesKt.coerceAtLeast(`$this$drop`.length - n, 0))
   }
}

@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public inline fun BooleanArray.reduceOrNull(operation: (Boolean, Boolean) -> Boolean): Boolean? {
   if (`$this$reduceOrNull`.length == 0) {
      return null
   } else {
      var accumulator: Boolean = `$this$reduceOrNull`[0]
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$reduceOrNull`)).iterator()

      while (var4.hasNext()) {
         accumulator = operation(accumulator, `$this$reduceOrNull`[var4.nextInt()]) as java.lang.Boolean
      }

      return accumulator
   }
}

public fun FloatArray.reversedArray(): FloatArray {
   if (`$this$reversedArray`.length == 0) {
      return `$this$reversedArray`
   } else {
      val result: FloatArray = FloatArray(`$this$reversedArray`.length)
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$reversedArray`)
      val var3: IntIterator = IntRange(0, lastIndex).iterator()

      while (var3.hasNext()) {
         val i: Int = var3.nextInt()
         result[lastIndex - i] = `$this$reversedArray`[i]
      }

      return result
   }
}

@SinceKotlin(version = "1.7")
@JvmName(name = "minWithOrThrow")
public fun ShortArray.minWith(comparator: Comparator<in Short>): Short {
   if (`$this$minWith`.length == 0) {
      throw NoSuchElementException()
   } else {
      var min: Short = `$this$minWith`[0]
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minWith`)).iterator()

      while (var3.hasNext()) {
         val e: Short = `$this$minWith`[var3.nextInt()]
         if (comparator.compare(min, e) > 0) {
            min = e
         }
      }

      return min
   }
}

@InlineOnly
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
public inline fun IntArray.minOf(selector: (Int) -> Double): Double {
   if (`$this$minOf`.length == 0) {
      throw NoSuchElementException()
   } else {
      var minValue: Double = (selector(`$this$minOf`[0]) as java.lang.Number).doubleValue()
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOf`)).iterator()

      while (var4.hasNext()) {
         minValue = Math.min(minValue, (selector(`$this$minOf`[var4.nextInt()]) as java.lang.Number).doubleValue())
      }

      return minValue
   }
}

@SinceKotlin(version = "1.7")
@JvmName(name = "minWithOrThrow")
public fun DoubleArray.minWith(comparator: Comparator<in Double>): Double {
   if (`$this$minWith`.length == 0) {
      throw NoSuchElementException()
   } else {
      var min: Double = `$this$minWith`[0]
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minWith`)).iterator()

      while (var4.hasNext()) {
         val e: Double = `$this$minWith`[var4.nextInt()]
         if (comparator.compare(min, e) > 0) {
            min = e
         }
      }

      return min
   }
}

public fun ByteArray.lastIndexOf(element: Byte): Int {
   var var2: Int = `$this$lastIndexOf`.length + -1
   if (0 <= `$this$lastIndexOf`.length + -1) {
      do {
         val index: Int = var2--
         if (element == `$this$lastIndexOf`[index]) {
            return index
         }
      } while (0 <= var2)
   }

   return -1
}

@SinceKotlin(version = "1.4")
@InlineOnly
@OverloadResolutionByLambdaReturnType
public inline fun <R> CharArray.minOfWithOrNull(comparator: Comparator<in Any>, selector: (Char) -> Any): Any? {
   if (`$this$minOfWithOrNull`.length == 0) {
      return null
   } else {
      var minValue: Any = selector(`$this$minOfWithOrNull`[0])
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfWithOrNull`)).iterator()

      while (var4.hasNext()) {
         val v: Any = selector(`$this$minOfWithOrNull`[var4.nextInt()])
         if (comparator.compare(minValue, v) > 0) {
            minValue = v
         }
      }

      return (R)minValue
   }
}

public fun BooleanArray.singleOrNull(): Boolean? {
   return if (`$this$singleOrNull`.length == 1) `$this$singleOrNull`[0] else null
}

public inline fun <R> FloatArray.foldRight(initial: Any, operation: (Float, Any) -> Any): Any {
   var index: Int = ArraysKt.getLastIndex(`$this$foldRight`)
   var accumulator: Any = initial

   while (index >= 0) {
      accumulator = operation(`$this$foldRight`[index--], accumulator)
   }

   return (R)accumulator
}

@SinceKotlin(version = "1.7")
@JvmName(name = "maxWithOrThrow")
public fun IntArray.maxWith(comparator: Comparator<in Int>): Int {
   if (`$this$maxWith`.length == 0) {
      throw NoSuchElementException()
   } else {
      var max: Int = `$this$maxWith`[0]
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxWith`)).iterator()

      while (var3.hasNext()) {
         val e: Int = `$this$maxWith`[var3.nextInt()]
         if (comparator.compare(max, e) < 0) {
            max = e
         }
      }

      return max
   }
}

@JvmName(name = "sumOfShort")
public fun Array<out Short>.sum(): Int {
   var sum: Short = 0
   var var2: Int = 0

   for (var3 in `$this$sum`.length..var2) {
      sum += `$this$sum`[var2]
   }

   return sum
}

@SinceKotlin(version = "1.4")
public inline fun <R : Comparable<Any>> FloatArray.minByOrNull(selector: (Float) -> Any): Float? {
   if (`$this$minByOrNull`.length == 0) {
      return null
   } else {
      var minElem: Float = `$this$minByOrNull`[0]
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$minByOrNull`)
      if (lastIndex == 0) {
         return minElem
      } else {
         var minValue: java.lang.Comparable = selector(minElem) as java.lang.Comparable
         val var6: IntIterator = IntRange(1, lastIndex).iterator()

         while (var6.hasNext()) {
            val e: Float = `$this$minByOrNull`[var6.nextInt()]
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

public fun FloatArray.none(): Boolean {
   return `$this$none`.length == 0
}

public inline fun <K, V, M : MutableMap<in Any, in Any>> ByteArray.associateTo(destination: Any, transform: (Byte) -> Pair<Any, Any>): Any {
   for (element in `$this$associateTo`) {
      val var8: Pair = transform(element) as Pair
      destination.put(var8.first, var8.second)
   }

   return (M)destination
}

@DeprecatedSinceKotlin(warningSince = "1.5")
@Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = []))
public inline fun ByteArray.sumBy(selector: (Byte) -> Int): Int {
   var sum: Int = 0

   for (element in `$this$sumBy`) {
      sum += (selector(element) as java.lang.Number).intValue()
   }

   return sum
}

@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@OverloadResolutionByLambdaReturnType
@InlineOnly
@JvmName(name = "sumOfULong")
@SinceKotlin(version = "1.5")
public inline fun <T> Array<out Any>.sumOf(selector: (Any) -> ULong): ULong {
   var sum: Long = ULong.constructor_impl/* $VF was: constructor-impl */(0L)

   for (element in `$this$sumOf`) {
      sum = ULong.constructor_impl/* $VF was: constructor-impl */(sum + (selector(element) as ULong).unbox_impl/* $VF was: unbox-impl */())
   }

   return sum
}

@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public fun IntArray.randomOrNull(random: Random): Int? {
   return if (`$this$randomOrNull`.length == 0) null else `$this$randomOrNull`[random.nextInt(`$this$randomOrNull`.length)]
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun <V, M : MutableMap<in Boolean, in Any>> BooleanArray.associateWithTo(destination: Any, valueSelector: (Boolean) -> Any): Any {
   for (element in `$this$associateWithTo`) {
      destination.put(element, valueSelector(element))
   }

   return (M)destination
}

public inline fun <R> CharArray.foldRight(initial: Any, operation: (Char, Any) -> Any): Any {
   var index: Int = ArraysKt.getLastIndex(`$this$foldRight`)
   var accumulator: Any = initial

   while (index >= 0) {
      accumulator = operation(`$this$foldRight`[index--], accumulator)
   }

   return (R)accumulator
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun <V> ByteArray.associateWith(valueSelector: (Byte) -> Any): Map<Byte, Any> {
   val result: LinkedHashMap = LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(`$this$associateWith`.length), 16))

   for (var6 in `$this$associateWith`) {
      result.put(var6, valueSelector(var6))
   }

   return result
}

public inline fun CharArray.reduce(operation: (Char, Char) -> Char): Char {
   if (`$this$reduce`.length == 0) {
      throw UnsupportedOperationException("Empty array can't be reduced.")
   } else {
      var accumulator: Char = `$this$reduce`[0]
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$reduce`)).iterator()

      while (var4.hasNext()) {
         accumulator = operation(accumulator, `$this$reduce`[var4.nextInt()]) as Character
      }

      return accumulator
   }
}

public inline fun <R> DoubleArray.foldRight(initial: Any, operation: (Double, Any) -> Any): Any {
   var index: Int = ArraysKt.getLastIndex(`$this$foldRight`)
   var accumulator: Any = initial

   while (index >= 0) {
      accumulator = operation(`$this$foldRight`[index--], accumulator)
   }

   return (R)accumulator
}

@InlineOnly
public inline operator fun LongArray.component1(): Long {
   return `$this$component1`[0]
}

@InlineOnly
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.4")
public inline fun <R> IntArray.scan(initial: Any, operation: (Any, Int) -> Any): List<Any> {
   val var10000: java.util.List
   if (`$this$scan`.length == 0) {
      var10000 = CollectionsKt.listOf(initial)
   } else {
      val var4: ArrayList = ArrayList(`$this$scan`.length + 1)
      var4.add(initial)
      val var6: ArrayList = var4
      var var9: Any = initial

      for (var8 in `$this$scan`) {
         var9 = operation(var9, var8)
         var6.add(var9)
      }

      var10000 = var6
   }

   return var10000
}

public inline fun <T, R : Comparable<Any>> Array<out Any>.sortBy(crossinline selector: (Any) -> Any?) {
   if (`$this$sortBy`.length > 1) {
      ArraysKt.sortWith(`$this$sortBy`,       // $VF: Compiled from Comparisons.kt
{ a: Any, b: Any ->
         val var3: Function1 = selector
         return ComparisonsKt.compareValues((T)(selector(a) as java.lang.Comparable), (T)(var3(b) as java.lang.Comparable))
      })
   }
}

public inline fun CharArray.forEach(action: (Char) -> Unit) {
   for (element in `$this$forEach`) {
      action(element)
   }
}

public fun LongArray.reverse() {
   val midPoint: Int = `$this$reverse`.length / 2 - 1
   if (`$this$reverse`.length / 2 - 1 >= 0) {
      var reverseIndex: Int = ArraysKt.getLastIndex(`$this$reverse`)

      // $VF: Unable to resugar Kotlin loop from Java for loop
      val var3: IntIterator = IntRange(0, midPoint).iterator()
      while (true) {
         if (var3.hasNext()) break
         val index: Int = var3.nextInt()
         val tmp: Long = `$this$reverse`[index]
         `$this$reverse`[index] = `$this$reverse`[reverseIndex]
         `$this$reverse`[reverseIndex] = tmp

         reverseIndex--
      }
   }
}

public final val indices: IntRange
   public final get() {
      return IntRange(0, ArraysKt.getLastIndex(`$this$indices`))
   }


@SinceKotlin(version = "1.7")
@JvmName(name = "maxOrThrow")
public fun FloatArray.max(): Float {
   if (`$this$max`.length == 0) {
      throw NoSuchElementException()
   } else {
      var max: Float = `$this$max`[0]
      val var2: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$max`)).iterator()

      while (var2.hasNext()) {
         max = Math.max(max, `$this$max`[var2.nextInt()])
      }

      return max
   }
}

public inline fun <C : MutableCollection<in Float>> FloatArray.filterIndexedTo(destination: Any, predicate: (Int, Float) -> Boolean): Any {
   val `index$iv`: Int = 0

   for (`item$iv` in `$this$filterIndexedTo`) {
      if (predicate(`index$iv`++, `item$iv`) as java.lang.Boolean) {
         destination.add(`item$iv`)
      }
   }

   return (C)destination
}

public inline fun BooleanArray.forEachIndexed(action: (Int, Boolean) -> Unit) {
   var index: Int = 0

   for (item in `$this$forEachIndexed`) {
      action(index++, item)
   }
}

public inline fun <C : MutableCollection<in Double>> DoubleArray.filterIndexedTo(destination: Any, predicate: (Int, Double) -> Boolean): Any {
   val `index$iv`: Int = 0

   for (`item$iv` in `$this$filterIndexedTo`) {
      if (predicate(`index$iv`++, `item$iv`) as java.lang.Boolean) {
         destination.add(`item$iv`)
      }
   }

   return (C)destination
}

@OverloadResolutionByLambdaReturnType
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun <T, R> Array<out Any>.minOfWith(comparator: Comparator<in Any>, selector: (Any) -> Any): Any {
   if (`$this$minOfWith`.length == 0) {
      throw NoSuchElementException()
   } else {
      var minValue: Any = selector(`$this$minOfWith`[0])
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfWith`)).iterator()

      while (var4.hasNext()) {
         val v: Any = selector(`$this$minOfWith`[var4.nextInt()])
         if (comparator.compare(minValue, v) > 0) {
            minValue = v
         }
      }

      return (R)minValue
   }
}

public inline fun FloatArray.partition(predicate: (Float) -> Boolean): Pair<List<Float>, List<Float>> {
   val first: ArrayList = ArrayList()
   val second: ArrayList = ArrayList()

   for (element in `$this$partition`) {
      if (predicate(element) as java.lang.Boolean) {
         first.add(element)
      } else {
         second.add(element)
      }
   }

   return Pair<>(first, second)
}

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun <R : Comparable<Any>> FloatArray.maxOf(selector: (Float) -> Any): Any {
   if (`$this$maxOf`.length == 0) {
      throw NoSuchElementException()
   } else {
      var maxValue: java.lang.Comparable = selector(`$this$maxOf`[0]) as java.lang.Comparable
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOf`)).iterator()

      while (var3.hasNext()) {
         val v: java.lang.Comparable = selector(`$this$maxOf`[var3.nextInt()]) as java.lang.Comparable
         if (maxValue.compareTo(v) < 0) {
            maxValue = v
         }
      }

      return (R)maxValue
   }
}

public inline fun BooleanArray.indexOfFirst(predicate: (Boolean) -> Boolean): Int {
   var index: Int = 0

   for (var4 in `$this$indexOfFirst`.length..index) {
      if (predicate(`$this$indexOfFirst`[index]) as java.lang.Boolean) {
         return index
      }
   }

   return -1
}

public inline fun <T, R, C : MutableCollection<in Any>> Array<out Any>.mapTo(destination: Any, transform: (Any) -> Any): Any {
   for (item in `$this$mapTo`) {
      destination.add(transform(item))
   }

   return (C)destination
}

@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public inline fun <S, T : Any> Array<out Any>.reduceRightOrNull(operation: (Any, Any) -> Any): Any? {
   var index: Int = ArraysKt.getLastIndex(`$this$reduceRightOrNull`)
   if (index < 0) {
      return null
   } else {
      var accumulator: Any = `$this$reduceRightOrNull`[index--]

      while (index >= 0) {
         accumulator = operation(`$this$reduceRightOrNull`[index--], accumulator)
      }

      return (S)accumulator
   }
}

@InlineOnly
public inline fun CharArray.count(): Int {
   return `$this$count`.length
}

@InlineOnly
public inline operator fun IntArray.component2(): Int {
   return `$this$component2`[1]
}

@SinceKotlin(version = "1.4")
public fun ShortArray.shuffle(random: Random) {
   for (i in ArraysKt.getLastIndex(`$this$shuffle`) downTo 1) {
      val j: Int = random.nextInt(i + 1)
      val copy: Short = `$this$shuffle`[i]
      `$this$shuffle`[i] = `$this$shuffle`[j]
      `$this$shuffle`[j] = copy
   }
}

@SinceKotlin(version = "1.4")
@InlineOnly
@OverloadResolutionByLambdaReturnType
public inline fun <T, R> Array<out Any>.maxOfWith(comparator: Comparator<in Any>, selector: (Any) -> Any): Any {
   if (`$this$maxOfWith`.length == 0) {
      throw NoSuchElementException()
   } else {
      var maxValue: Any = selector(`$this$maxOfWith`[0])
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfWith`)).iterator()

      while (var4.hasNext()) {
         val v: Any = selector(`$this$maxOfWith`[var4.nextInt()])
         if (comparator.compare(maxValue, v) < 0) {
            maxValue = v
         }
      }

      return (R)maxValue
   }
}

public fun LongArray.joinToString(
   separator: CharSequence = ", " as java.lang.CharSequence,
   prefix: CharSequence = "" as java.lang.CharSequence,
   postfix: CharSequence = "" as java.lang.CharSequence,
   limit: Int = -1,
   truncated: CharSequence = "..." as java.lang.CharSequence,
   transform: ((Long) -> CharSequence)? = null
): String {
   val var10000: java.lang.String = ArraysKt.joinTo(`$this$joinToString`, StringBuilder(), separator, prefix, postfix, limit, truncated, transform).toString()
   return var10000
}

@SinceKotlin(version = "1.4")
public inline fun <S, T : Any> Array<out Any>.reduceRightIndexedOrNull(operation: (Int, Any, Any) -> Any): Any? {
   var index: Int = ArraysKt.getLastIndex(`$this$reduceRightIndexedOrNull`)
   if (index < 0) {
      return null
   } else {
      var accumulator: Any = `$this$reduceRightIndexedOrNull`[index--]

      while (index >= 0) {
         accumulator = operation(index, `$this$reduceRightIndexedOrNull`[index], accumulator)
         index--
      }

      return (S)accumulator
   }
}

@JvmName(name = "maxOrThrow")
@SinceKotlin(version = "1.7")
public fun Array<out Float>.max(): Float {
   if (`$this$max`.length == 0) {
      throw NoSuchElementException()
   } else {
      var max: Float = `$this$max`[0]
      val var2: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$max`)).iterator()

      while (var2.hasNext()) {
         max = Math.max(max, `$this$max`[var2.nextInt()])
      }

      return max
   }
}

public inline fun ByteArray.forEachIndexed(action: (Int, Byte) -> Unit) {
   var index: Int = 0

   for (item in `$this$forEachIndexed`) {
      action(index++, item)
   }
}

public inline fun LongArray.takeLastWhile(predicate: (Long) -> Boolean): List<Long> {
   for (index in ArraysKt.getLastIndex(`$this$takeLastWhile`) downTo 0) {
      if (!predicate(`$this$takeLastWhile`[index]) as java.lang.Boolean) {
         return ArraysKt.drop(`$this$takeLastWhile`, index + 1)
      }
   }

   return ArraysKt.toList(`$this$takeLastWhile`)
}

@InlineOnly
public inline fun IntArray.getOrElse(index: Int, defaultValue: (Int) -> Int): Int {
   return if (index >= 0 && index <= ArraysKt.getLastIndex(`$this$getOrElse`))
      `$this$getOrElse`[index]
      else
      (defaultValue(index) as java.lang.Number).intValue()
   }

@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public inline fun ShortArray.reduceRightOrNull(operation: (Short, Short) -> Short): Short? {
   var index: Int = ArraysKt.getLastIndex(`$this$reduceRightOrNull`)
   if (index < 0) {
      return null
   } else {
      var accumulator: Short = `$this$reduceRightOrNull`[index--]

      while (index >= 0) {
         accumulator = (operation(`$this$reduceRightOrNull`[index--], accumulator) as java.lang.Number).shortValue()
      }

      return accumulator
   }
}

public fun DoubleArray.drop(n: Int): List<Double> {
   if (n < 0) {
      throw IllegalArgumentException(("Requested element count $n is less than zero.").toString())
   } else {
      return ArraysKt.takeLast(`$this$drop`, RangesKt.coerceAtLeast(`$this$drop`.length - n, 0))
   }
}

public inline fun <T, R> Array<out Any>.mapIndexed(transform: (Int, Any) -> Any): List<Any> {
   val `destination$iv`: java.util.Collection = ArrayList(`$this$mapIndexed`.length)
   var `index$iv`: Int = 0

   for (`item$iv` in `$this$mapIndexed`) {
      `destination$iv`.add(transform(`index$iv`++, `item$iv`))
   }

   return `destination$iv` as MutableList<R>
}

public fun <T> Array<out Any>.distinct(): List<Any> {
   return (java.util.List<T>)CollectionsKt.toList(ArraysKt.toMutableSet(`$this$distinct`))
}

@InlineOnly
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
public inline fun ByteArray.minOf(selector: (Byte) -> Double): Double {
   if (`$this$minOf`.length == 0) {
      throw NoSuchElementException()
   } else {
      var minValue: Double = (selector(`$this$minOf`[0]) as java.lang.Number).doubleValue()
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOf`)).iterator()

      while (var4.hasNext()) {
         minValue = Math.min(minValue, (selector(`$this$minOf`[var4.nextInt()]) as java.lang.Number).doubleValue())
      }

      return minValue
   }
}

@SinceKotlin(version = "1.4")
@InlineOnly
@OverloadResolutionByLambdaReturnType
public inline fun <R> CharArray.maxOfWith(comparator: Comparator<in Any>, selector: (Char) -> Any): Any {
   if (`$this$maxOfWith`.length == 0) {
      throw NoSuchElementException()
   } else {
      var maxValue: Any = selector(`$this$maxOfWith`[0])
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfWith`)).iterator()

      while (var4.hasNext()) {
         val v: Any = selector(`$this$maxOfWith`[var4.nextInt()])
         if (comparator.compare(maxValue, v) < 0) {
            maxValue = v
         }
      }

      return (R)maxValue
   }
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun FloatArray.randomOrNull(): Float? {
   return ArraysKt.randomOrNull(`$this$randomOrNull`, Random.Default)
}

public inline fun CharArray.all(predicate: (Char) -> Boolean): Boolean {
   for (element in `$this$all`) {
      if (!predicate(element) as java.lang.Boolean) {
         return false
      }
   }

   return true
}

@InlineOnly
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
public inline fun ByteArray.maxOfOrNull(selector: (Byte) -> Double): Double? {
   if (`$this$maxOfOrNull`.length == 0) {
      return null
   } else {
      var maxValue: Double = (selector(`$this$maxOfOrNull`[0]) as java.lang.Number).doubleValue()
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfOrNull`)).iterator()

      while (var4.hasNext()) {
         maxValue = Math.max(maxValue, (selector(`$this$maxOfOrNull`[var4.nextInt()]) as java.lang.Number).doubleValue())
      }

      return maxValue
   }
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.4")
public inline fun CharArray.reduceOrNull(operation: (Char, Char) -> Char): Char? {
   if (`$this$reduceOrNull`.length == 0) {
      return null
   } else {
      var accumulator: Char = `$this$reduceOrNull`[0]
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$reduceOrNull`)).iterator()

      while (var4.hasNext()) {
         accumulator = operation(accumulator, `$this$reduceOrNull`[var4.nextInt()]) as Character
      }

      return accumulator
   }
}

public inline fun <R, C : MutableCollection<in Any>> IntArray.mapIndexedTo(destination: Any, transform: (Int, Int) -> Any): Any {
   var index: Int = 0

   for (item in `$this$mapIndexedTo`) {
      destination.add(transform(index++, item))
   }

   return (C)destination
}

@InlineOnly
public inline fun CharArray.findLast(predicate: (Char) -> Boolean): Char? {
   val `$this$lastOrNull$iv`: CharArray = `$this$findLast`
   var var4: Int = `$this$findLast`.length + -1
   if (0 <= `$this$findLast`.length + -1) {
      do {
         val `element$iv`: Char = `$this$lastOrNull$iv`[var4--]
         if (predicate(`element$iv`) as java.lang.Boolean) {
            return `element$iv`
         }
      } while (0 <= var4)
   }

   return null
}

public inline fun BooleanArray.partition(predicate: (Boolean) -> Boolean): Pair<List<Boolean>, List<Boolean>> {
   val first: ArrayList = ArrayList()
   val second: ArrayList = ArrayList()

   for (element in `$this$partition`) {
      if (predicate(element) as java.lang.Boolean) {
         first.add(element)
      } else {
         second.add(element)
      }
   }

   return Pair<>(first, second)
}

public fun DoubleArray.take(n: Int): List<Double> {
   if (n < 0) {
      throw IllegalArgumentException(("Requested element count $n is less than zero.").toString())
   } else if (n == 0) {
      return CollectionsKt.emptyList()
   } else if (n >= `$this$take`.length) {
      return ArraysKt.toList(`$this$take`)
   } else if (n == 1) {
      return CollectionsKt.listOf(`$this$take`[0])
   } else {
      val var8: Int = 0
      val list: ArrayList = ArrayList(n)

      for (item in `$this$take`) {
         list.add(item)
         if (++var8 == n) {
            break
         }
      }

      return list
   }
}

@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
@InlineOnly
public inline fun BooleanArray.minOf(selector: (Boolean) -> Float): Float {
   if (`$this$minOf`.length == 0) {
      throw NoSuchElementException()
   } else {
      var minValue: Float = (selector(`$this$minOf`[0]) as java.lang.Number).floatValue()
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOf`)).iterator()

      while (var3.hasNext()) {
         minValue = Math.min(minValue, (selector(`$this$minOf`[var3.nextInt()]) as java.lang.Number).floatValue())
      }

      return minValue
   }
}

public fun IntArray.toSet(): Set<Int> {
   var var10000: java.util.Set
   when (`$this$toSet`.length) {
      0 -> var10000 = SetsKt.emptySet()
      1 -> var10000 = SetsKt.setOf(`$this$toSet`[0])
      else -> var10000 = ArraysKt.toCollection((int[])`$this$toSet`, LinkedHashSet(MapsKt.mapCapacity(`$this$toSet`.length)))
   }

   return var10000
}

@SinceKotlin(version = "1.3")
public fun CharArray.random(random: Random): Char {
   if (`$this$random`.length == 0) {
      throw NoSuchElementException("Array is empty.")
   } else {
      return `$this$random`[random.nextInt(`$this$random`.length)]
   }
}

@SinceKotlin(version = "1.7")
@JvmName(name = "minByOrThrow")
public inline fun <T, R : Comparable<Any>> Array<out Any>.minBy(selector: (Any) -> Any): Any {
   if (`$this$minBy`.length == 0) {
      throw NoSuchElementException()
   } else {
      var minElem: Any = `$this$minBy`[0]
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$minBy`)
      if (lastIndex == 0) {
         return (T)minElem
      } else {
         var minValue: java.lang.Comparable = selector(minElem) as java.lang.Comparable
         val var6: IntIterator = IntRange(1, lastIndex).iterator()

         while (var6.hasNext()) {
            val e: Any = `$this$minBy`[var6.nextInt()]
            val v: java.lang.Comparable = selector(e) as java.lang.Comparable
            if (minValue.compareTo(v) > 0) {
               minElem = e
               minValue = v
            }
         }

         return (T)minElem
      }
   }
}

public fun ShortArray.singleOrNull(): Short? {
   return if (`$this$singleOrNull`.length == 1) `$this$singleOrNull`[0] else null
}

@InlineOnly
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
public inline fun <R : Comparable<Any>> IntArray.minOf(selector: (Int) -> Any): Any {
   if (`$this$minOf`.length == 0) {
      throw NoSuchElementException()
   } else {
      var minValue: java.lang.Comparable = selector(`$this$minOf`[0]) as java.lang.Comparable
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOf`)).iterator()

      while (var3.hasNext()) {
         val v: java.lang.Comparable = selector(`$this$minOf`[var3.nextInt()]) as java.lang.Comparable
         if (minValue.compareTo(v) > 0) {
            minValue = v
         }
      }

      return (R)minValue
   }
}

@InlineOnly
public inline operator fun LongArray.component4(): Long {
   return `$this$component4`[3]
}

public inline fun BooleanArray.takeWhile(predicate: (Boolean) -> Boolean): List<Boolean> {
   val list: ArrayList = ArrayList()

   for (item in `$this$takeWhile`) {
      if (!predicate(item) as java.lang.Boolean) {
         break
      }

      list.add(item)
   }

   return list
}

public inline fun <R> CharArray.flatMap(transform: (Char) -> Iterable<Any>): List<Any> {
   val `destination$iv`: java.util.Collection = ArrayList()

   for (`element$iv` in `$this$flatMap`) {
      CollectionsKt.addAll(`destination$iv`, transform(`element$iv`) as java.lang.Iterable)
   }

   return `destination$iv` as MutableList<R>
}

public fun <T> Array<out Any>.slice(indices: IntRange): List<Any> {
   return if (indices.isEmpty())
      CollectionsKt.emptyList()
      else
      ArraysKt.asList(ArraysKt.copyOfRange((Object[])`$this$slice`, indices.start, indices.endInclusive + 1))
   }

@OverloadResolutionByLambdaReturnType
@InlineOnly
@JvmName(name = "sumOfLong")
@SinceKotlin(version = "1.4")
public inline fun FloatArray.sumOf(selector: (Float) -> Long): Long {
   var sum: Long = 0L

   for (element in `$this$sumOf`) {
      sum += (selector(element) as java.lang.Number).longValue()
   }

   return sum
}

public inline fun <C : MutableCollection<in Char>> CharArray.filterIndexedTo(destination: Any, predicate: (Int, Char) -> Boolean): Any {
   val `index$iv`: Int = 0

   for (`item$iv` in `$this$filterIndexedTo`) {
      if (predicate(`index$iv`++, `item$iv`) as java.lang.Boolean) {
         destination.add(`item$iv`)
      }
   }

   return (C)destination
}

@SinceKotlin(version = "1.4")
public fun ShortArray.sortDescending(fromIndex: Int, toIndex: Int) {
   ArraysKt.sort((short[])`$this$sortDescending`, fromIndex, toIndex)
   ArraysKt.reverse((short[])`$this$sortDescending`, fromIndex, toIndex)
}

@OverloadResolutionByLambdaReturnType
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun FloatArray.minOf(selector: (Float) -> Double): Double {
   if (`$this$minOf`.length == 0) {
      throw NoSuchElementException()
   } else {
      var minValue: Double = (selector(`$this$minOf`[0]) as java.lang.Number).doubleValue()
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOf`)).iterator()

      while (var4.hasNext()) {
         minValue = Math.min(minValue, (selector(`$this$minOf`[var4.nextInt()]) as java.lang.Number).doubleValue())
      }

      return minValue
   }
}

public inline fun <R> BooleanArray.foldRightIndexed(initial: Any, operation: (Int, Boolean, Any) -> Any): Any {
   var index: Int = ArraysKt.getLastIndex(`$this$foldRightIndexed`)
   var accumulator: Any = initial

   while (index >= 0) {
      accumulator = operation(index, `$this$foldRightIndexed`[index], accumulator)
      index--
   }

   return (R)accumulator
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.4")
public inline fun <S, T : Any> Array<out Any>.reduceOrNull(operation: (Any, Any) -> Any): Any? {
   if (`$this$reduceOrNull`.length == 0) {
      return null
   } else {
      var accumulator: Any = `$this$reduceOrNull`[0]
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$reduceOrNull`)).iterator()

      while (var4.hasNext()) {
         accumulator = operation(accumulator, `$this$reduceOrNull`[var4.nextInt()])
      }

      return (S)accumulator
   }
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun ShortArray.onEach(action: (Short) -> Unit): ShortArray {
   for (element in `$this$onEach`) {
      action(element)
   }

   return `$this$onEach`
}

public inline fun <K> ShortArray.associateBy(keySelector: (Short) -> Any): Map<Any, Short> {
   val `destination$iv`: java.util.Map = LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(`$this$associateBy`.length), 16))

   for (`element$iv` in `$this$associateBy`) {
      `destination$iv`.put(keySelector(`element$iv`), `element$iv`)
   }

   return `destination$iv`
}

@InlineOnly
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
public inline fun <R> ByteArray.maxOfWithOrNull(comparator: Comparator<in Any>, selector: (Byte) -> Any): Any? {
   if (`$this$maxOfWithOrNull`.length == 0) {
      return null
   } else {
      var maxValue: Any = selector(`$this$maxOfWithOrNull`[0])
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfWithOrNull`)).iterator()

      while (var4.hasNext()) {
         val v: Any = selector(`$this$maxOfWithOrNull`[var4.nextInt()])
         if (comparator.compare(maxValue, v) < 0) {
            maxValue = v
         }
      }

      return (R)maxValue
   }
}

@SinceKotlin(version = "1.4")
public fun <T : Comparable<Any>> Array<out Any>.maxOrNull(): Any? {
   if (`$this$maxOrNull`.length == 0) {
      return null
   } else {
      var max: java.lang.Comparable = `$this$maxOrNull`[0]
      val var2: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOrNull`)).iterator()

      while (var2.hasNext()) {
         val e: java.lang.Comparable = `$this$maxOrNull`[var2.nextInt()]
         if (max.compareTo(e) < 0) {
            max = e
         }
      }

      return (T)max
   }
}

@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun ByteArray.onEach(action: (Byte) -> Unit): ByteArray {
   for (element in `$this$onEach`) {
      action(element)
   }

   return `$this$onEach`
}

@SinceKotlin(version = "1.4")
@JvmName(name = "sumOfDouble")
@OverloadResolutionByLambdaReturnType
@InlineOnly
public inline fun FloatArray.sumOf(selector: (Float) -> Double): Double {
   var sum: Double = 0.0

   for (element in `$this$sumOf`) {
      sum += (selector(element) as java.lang.Number).doubleValue()
   }

   return sum
}

@InlineOnly
@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
public inline fun <R> IntArray.maxOfWith(comparator: Comparator<in Any>, selector: (Int) -> Any): Any {
   if (`$this$maxOfWith`.length == 0) {
      throw NoSuchElementException()
   } else {
      var maxValue: Any = selector(`$this$maxOfWith`[0])
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfWith`)).iterator()

      while (var4.hasNext()) {
         val v: Any = selector(`$this$maxOfWith`[var4.nextInt()])
         if (comparator.compare(maxValue, v) < 0) {
            maxValue = v
         }
      }

      return (R)maxValue
   }
}

public fun IntArray.none(): Boolean {
   return `$this$none`.length == 0
}

public inline fun <R, C : MutableCollection<in Any>> DoubleArray.mapTo(destination: Any, transform: (Double) -> Any): Any {
   for (item in `$this$mapTo`) {
      destination.add(transform(item))
   }

   return (C)destination
}

public fun <T> Array<out Any>.toMutableSet(): MutableSet<Any> {
   return ArraysKt.toCollection((Object[])`$this$toMutableSet`, LinkedHashSet(MapsKt.mapCapacity(`$this$toMutableSet`.length))) as MutableSet<T>
}

public fun <T> Array<out Any>.singleOrNull(): Any? {
   return (T)(if (`$this$singleOrNull`.length == 1) `$this$singleOrNull`[0] else null)
}

public fun DoubleArray.sortedArrayDescending(): DoubleArray {
   if (`$this$sortedArrayDescending`.length == 0) {
      return `$this$sortedArrayDescending`
   } else {
      val var10000: DoubleArray = Arrays.copyOf(`$this$sortedArrayDescending`, `$this$sortedArrayDescending`.length)
      ArraysKt.sortDescending(var10000)
      return var10000
   }
}

public inline fun <R, V> CharArray.zip(other: Iterable<Any>, transform: (Char, Any) -> Any): List<Any> {
   val arraySize: Int = `$this$zip`.length
   val list: ArrayList = ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(other, 10), `$this$zip`.length))
   var i: Int = 0

   for (element in other) {
      if (i >= arraySize) {
         break
      }

      list.add(transform(`$this$zip`[i++], element))
   }

   return list
}

public operator fun ShortArray.contains(element: Short): Boolean {
   return ArraysKt.indexOf(`$this$contains`, element) >= 0
}

public inline fun DoubleArray.dropWhile(predicate: (Double) -> Boolean): List<Double> {
   var yielding: Boolean = false
   val list: ArrayList = ArrayList()

   for (item in `$this$dropWhile`) {
      if (yielding) {
         list.add(item)
      } else if (!predicate(item) as java.lang.Boolean) {
         list.add(item)
         yielding = true
      }
   }

   return list
}

public fun ShortArray.getOrNull(index: Int): Short? {
   return if (index >= 0 && index <= ArraysKt.getLastIndex(`$this$getOrNull`)) `$this$getOrNull`[index] else null
}

public fun BooleanArray.reverse() {
   val midPoint: Int = `$this$reverse`.length / 2 - 1
   if (`$this$reverse`.length / 2 - 1 >= 0) {
      var reverseIndex: Int = ArraysKt.getLastIndex(`$this$reverse`)

      // $VF: Unable to resugar Kotlin loop from Java for loop
      val var3: IntIterator = IntRange(0, midPoint).iterator()
      while (true) {
         if (var3.hasNext()) break
         val index: Int = var3.nextInt()
         val tmp: Boolean = `$this$reverse`[index]
         `$this$reverse`[index] = `$this$reverse`[reverseIndex]
         `$this$reverse`[reverseIndex] = tmp

         reverseIndex--
      }
   }
}

public inline fun ByteArray.any(predicate: (Byte) -> Boolean): Boolean {
   for (element in `$this$any`) {
      if (predicate(element) as java.lang.Boolean) {
         return true
      }
   }

   return false
}

@SinceKotlin(version = "1.4")
public inline fun <R : Comparable<Any>> ShortArray.maxByOrNull(selector: (Short) -> Any): Short? {
   if (`$this$maxByOrNull`.length == 0) {
      return null
   } else {
      var maxElem: Short = `$this$maxByOrNull`[0]
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$maxByOrNull`)
      if (lastIndex == 0) {
         return maxElem
      } else {
         var maxValue: java.lang.Comparable = selector(maxElem) as java.lang.Comparable
         val var6: IntIterator = IntRange(1, lastIndex).iterator()

         while (var6.hasNext()) {
            val e: Short = `$this$maxByOrNull`[var6.nextInt()]
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

public inline fun <T, R> Array<out Any>.foldIndexed(initial: Any, operation: (Int, Any, Any) -> Any): Any {
   var index: Int = 0
   var accumulator: Any = initial

   for (element in `$this$foldIndexed`) {
      accumulator = operation(index++, accumulator, element)
   }

   return (R)accumulator
}

@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun BooleanArray.random(): Boolean {
   return ArraysKt.random(`$this$random`, Random.Default)
}

public inline fun <R, V> BooleanArray.zip(other: Iterable<Any>, transform: (Boolean, Any) -> Any): List<Any> {
   val arraySize: Int = `$this$zip`.length
   val list: ArrayList = ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(other, 10), `$this$zip`.length))
   var i: Int = 0

   for (element in other) {
      if (i >= arraySize) {
         break
      }

      list.add(transform(`$this$zip`[i++], element))
   }

   return list
}

public inline fun <K, M : MutableMap<in Any, MutableList<Int>>> IntArray.groupByTo(destination: Any, keySelector: (Int) -> Any): Any {
   for (element in `$this$groupByTo`) {
      val key: Any = keySelector(element)
      val `value$iv`: Any = destination.get(key)
      val var10000: Any
      if (`value$iv` == null) {
         val var13: java.util.List = ArrayList()
         destination.put(key, var13)
         var10000 = var13
      } else {
         var10000 = `value$iv`
      }

      (var10000 as java.util.List).add(element)
   }

   return (M)destination
}

public inline fun DoubleArray.none(predicate: (Double) -> Boolean): Boolean {
   for (element in `$this$none`) {
      if (predicate(element) as java.lang.Boolean) {
         return false
      }
   }

   return true
}

@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public inline fun IntArray.reduceRightOrNull(operation: (Int, Int) -> Int): Int? {
   var index: Int = ArraysKt.getLastIndex(`$this$reduceRightOrNull`)
   if (index < 0) {
      return null
   } else {
      var accumulator: Int = `$this$reduceRightOrNull`[index--]

      while (index >= 0) {
         accumulator = (operation(`$this$reduceRightOrNull`[index--], accumulator) as java.lang.Number).intValue()
      }

      return accumulator
   }
}

public inline fun <K, V> IntArray.groupBy(keySelector: (Int) -> Any, valueTransform: (Int) -> Any): Map<Any, List<Any>> {
   val `destination$iv`: java.util.Map = LinkedHashMap()

   for (`element$iv` in `$this$groupBy`) {
      val `key$iv`: Any = keySelector(`element$iv`)
      val `value$iv$iv`: Any = `destination$iv`.get(`key$iv`)
      val var10000: Any
      if (`value$iv$iv` == null) {
         val var16: java.util.List = ArrayList()
         `destination$iv`.put(`key$iv`, var16)
         var10000 = var16
      } else {
         var10000 = `value$iv$iv`
      }

      (var10000 as java.util.List).add(valueTransform(`element$iv`))
   }

   return `destination$iv`
}

public fun FloatArray.sum(): Float {
   var sum: Float = 0.0F

   for (element in `$this$sum`) {
      sum += element
   }

   return sum
}

@SinceKotlin(version = "1.4")
public fun IntArray.maxOrNull(): Int? {
   if (`$this$maxOrNull`.length == 0) {
      return null
   } else {
      var max: Int = `$this$maxOrNull`[0]
      val var2: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOrNull`)).iterator()

      while (var2.hasNext()) {
         val e: Int = `$this$maxOrNull`[var2.nextInt()]
         if (max < e) {
            max = e
         }
      }

      return max
   }
}

@InlineOnly
public inline fun ShortArray.elementAtOrElse(index: Int, defaultValue: (Int) -> Short): Short {
   return if (index >= 0 && index <= ArraysKt.getLastIndex(`$this$elementAtOrElse`))
      `$this$elementAtOrElse`[index]
      else
      (defaultValue(index) as java.lang.Number).shortValue()
   }

public fun <A : Appendable> BooleanArray.joinTo(
   buffer: Any,
   separator: CharSequence = ...,
   prefix: CharSequence = ...,
   postfix: CharSequence = ...,
   limit: Int = ...,
   truncated: CharSequence = ...,
   transform: ((Boolean) -> CharSequence)? = ...
): Any {
   buffer.append(prefix)
   val count: Int = 0

   for (element in `$this$joinTo`) {
      if (++count > 1) {
         buffer.append(separator)
      }

      if (limit >= 0 && count > limit) {
         break
      }

      if (transform != null) {
         buffer.append(transform(element) as java.lang.CharSequence)
      } else {
         buffer.append(java.lang.String.valueOf(element))
      }
   }

   if (limit >= 0 && count > limit) {
      buffer.append(truncated)
   }

   buffer.append(postfix)
   return (A)buffer
}

public inline fun <C : MutableCollection<in Byte>> ByteArray.filterNotTo(destination: Any, predicate: (Byte) -> Boolean): Any {
   for (element in `$this$filterNotTo`) {
      if (!predicate(element) as java.lang.Boolean) {
         destination.add(element)
      }
   }

   return (C)destination
}

@InlineOnly
public inline operator fun FloatArray.component3(): Float {
   return `$this$component3`[2]
}

public inline fun <T, R, V> Array<out Any>.zip(other: Array<out Any>, transform: (Any, Any) -> Any): List<Any> {
   val size: Int = Math.min(`$this$zip`.length, other.length)
   val list: ArrayList = ArrayList(size)

   repeat(size) { i ->
      list.add(transform(`$this$zip`[i], other[i]))
   }

   return list
}

public fun DoubleArray.sliceArray(indices: Collection<Int>): DoubleArray {
   val result: DoubleArray = DoubleArray(indices.size())
   var targetIndex: Int = 0
   val var4: java.util.Iterator = indices.iterator()

   while (var4.hasNext()) {
      result[targetIndex++] = `$this$sliceArray`[(var4.next() as java.lang.Number).intValue()]
   }

   return result
}

public inline fun <R> CharArray.foldRightIndexed(initial: Any, operation: (Int, Char, Any) -> Any): Any {
   var index: Int = ArraysKt.getLastIndex(`$this$foldRightIndexed`)
   var accumulator: Any = initial

   while (index >= 0) {
      accumulator = operation(index, `$this$foldRightIndexed`[index], accumulator)
      index--
   }

   return (R)accumulator
}

@DeprecatedSinceKotlin(warningSince = "1.5")
@Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = []))
public inline fun ByteArray.sumByDouble(selector: (Byte) -> Double): Double {
   var sum: Double = 0.0

   for (element in `$this$sumByDouble`) {
      sum += (selector(element) as java.lang.Number).doubleValue()
   }

   return sum
}

public fun FloatArray.singleOrNull(): Float? {
   return if (`$this$singleOrNull`.length == 1) `$this$singleOrNull`[0] else null
}

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@JvmName(name = "sumOfLong")
@InlineOnly
public inline fun DoubleArray.sumOf(selector: (Double) -> Long): Long {
   var sum: Long = 0L

   for (element in `$this$sumOf`) {
      sum += (selector(element) as java.lang.Number).longValue()
   }

   return sum
}

public fun ByteArray.singleOrNull(): Byte? {
   return if (`$this$singleOrNull`.length == 1) `$this$singleOrNull`[0] else null
}

@Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = []))
@DeprecatedSinceKotlin(warningSince = "1.5")
public inline fun FloatArray.sumByDouble(selector: (Float) -> Double): Double {
   var sum: Double = 0.0

   for (element in `$this$sumByDouble`) {
      sum += (selector(element) as java.lang.Number).doubleValue()
   }

   return sum
}

public fun <T> Array<out Any>.reversed(): List<Any> {
   if (`$this$reversed`.length == 0) {
      return CollectionsKt.emptyList()
   } else {
      val list: java.util.List = ArraysKt.toMutableList(`$this$reversed`)
      CollectionsKt.reverse(list)
      return list
   }
}

public inline fun <R> DoubleArray.foldRightIndexed(initial: Any, operation: (Int, Double, Any) -> Any): Any {
   var index: Int = ArraysKt.getLastIndex(`$this$foldRightIndexed`)
   var accumulator: Any = initial

   while (index >= 0) {
      accumulator = operation(index, `$this$foldRightIndexed`[index], accumulator)
      index--
   }

   return (R)accumulator
}

public fun <T> Array<out Any>.joinToString(
   separator: CharSequence = ", " as java.lang.CharSequence,
   prefix: CharSequence = "" as java.lang.CharSequence,
   postfix: CharSequence = "" as java.lang.CharSequence,
   limit: Int = -1,
   truncated: CharSequence = "..." as java.lang.CharSequence,
   transform: ((Any) -> CharSequence)? = null
): String {
   val var10000: java.lang.String = ArraysKt.joinTo((Object[])`$this$joinToString`, StringBuilder(), separator, prefix, postfix, limit, truncated, transform)
      .toString()
      return var10000
}

public inline fun <R : Comparable<Any>> BooleanArray.sortedByDescending(crossinline selector: (Boolean) -> Any?): List<Boolean> {
   return ArraysKt.sortedWith(`$this$sortedByDescending`,    // $VF: Compiled from Comparisons.kt
{ a: Any, b: Any ->
      val var3: Function1 = selector
      return ComparisonsKt.compareValues((T)(selector(b) as java.lang.Comparable), (T)(var3(a) as java.lang.Comparable))
   })
}

@JvmName(name = "maxWithOrThrow")
@SinceKotlin(version = "1.7")
public fun ByteArray.maxWith(comparator: Comparator<in Byte>): Byte {
   if (`$this$maxWith`.length == 0) {
      throw NoSuchElementException()
   } else {
      var max: Byte = `$this$maxWith`[0]
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxWith`)).iterator()

      while (var3.hasNext()) {
         val e: Byte = `$this$maxWith`[var3.nextInt()]
         if (comparator.compare(max, e) < 0) {
            max = e
         }
      }

      return max
   }
}

public final val lastIndex: Int
   public final get() {
      return `$this$lastIndex`.length - 1
   }


public inline fun <K, M : MutableMap<in Any, in Long>> LongArray.associateByTo(destination: Any, keySelector: (Long) -> Any): Any {
   for (element in `$this$associateByTo`) {
      destination.put(keySelector(element), element)
   }

   return (M)destination
}

@InlineOnly
public inline fun IntArray.count(): Int {
   return `$this$count`.length
}

@SinceKotlin(version = "1.4")
public fun ShortArray.shuffle() {
   ArraysKt.shuffle((short[])`$this$shuffle`, Random.Default)
}

@InlineOnly
@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
@JvmName(name = "flatMapIndexedIterableTo")
public inline fun <R, C : MutableCollection<in Any>> CharArray.flatMapIndexedTo(destination: Any, transform: (Int, Char) -> Iterable<Any>): Any {
   var index: Int = 0

   for (element in `$this$flatMapIndexedTo`) {
      CollectionsKt.addAll(destination, transform(index++, element) as java.lang.Iterable)
   }

   return (C)destination
}

public fun BooleanArray.lastIndexOf(element: Boolean): Int {
   var var2: Int = `$this$lastIndexOf`.length + -1
   if (0 <= `$this$lastIndexOf`.length + -1) {
      do {
         val index: Int = var2--
         if (element == `$this$lastIndexOf`[index]) {
            return index
         }
      } while (0 <= var2)
   }

   return -1
}

public inline fun FloatArray.reduceRight(operation: (Float, Float) -> Float): Float {
   var index: Int = ArraysKt.getLastIndex(`$this$reduceRight`)
   if (index < 0) {
      throw UnsupportedOperationException("Empty array can't be reduced.")
   } else {
      var accumulator: Float = `$this$reduceRight`[index--]

      while (index >= 0) {
         accumulator = (operation(`$this$reduceRight`[index--], accumulator) as java.lang.Number).floatValue()
      }

      return accumulator
   }
}

@InlineOnly
public inline operator fun IntArray.component1(): Int {
   return `$this$component1`[0]
}

@OverloadResolutionByLambdaReturnType
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@JvmName(name = "sumOfULong")
@SinceKotlin(version = "1.5")
@InlineOnly
public inline fun CharArray.sumOf(selector: (Char) -> ULong): ULong {
   var sum: Long = ULong.constructor_impl/* $VF was: constructor-impl */(0L)

   for (element in `$this$sumOf`) {
      sum = ULong.constructor_impl/* $VF was: constructor-impl */(sum + (selector(element) as ULong).unbox_impl/* $VF was: unbox-impl */())
   }

   return sum
}

public inline fun <R> IntArray.foldRight(initial: Any, operation: (Int, Any) -> Any): Any {
   var index: Int = ArraysKt.getLastIndex(`$this$foldRight`)
   var accumulator: Any = initial

   while (index >= 0) {
      accumulator = operation(`$this$foldRight`[index--], accumulator)
   }

   return (R)accumulator
}

@SinceKotlin(version = "1.4")
public fun <T> Array<out Any>.minWithOrNull(comparator: Comparator<in Any>): Any? {
   if (`$this$minWithOrNull`.length == 0) {
      return null
   } else {
      var min: Any = `$this$minWithOrNull`[0]
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minWithOrNull`)).iterator()

      while (var3.hasNext()) {
         val e: Any = `$this$minWithOrNull`[var3.nextInt()]
         if (comparator.compare(min, e) > 0) {
            min = e
         }
      }

      return (T)min
   }
}

@SinceKotlin(version = "1.4")
@JvmName(name = "flatMapIndexedIterable")
@OverloadResolutionByLambdaReturnType
@InlineOnly
public inline fun <R> BooleanArray.flatMapIndexed(transform: (Int, Boolean) -> Iterable<Any>): List<Any> {
   val var3: java.util.Collection = ArrayList()
   var var4: Int = 0

   for (var7 in `$this$flatMapIndexed`) {
      CollectionsKt.addAll(var3, transform(var4++, var7) as java.lang.Iterable)
   }

   return var3 as MutableList<R>
}

public fun DoubleArray.sortedDescending(): List<Double> {
   val var10000: DoubleArray = Arrays.copyOf(`$this$sortedDescending`, `$this$sortedDescending`.length)
   ArraysKt.sort(var10000)
   return ArraysKt.reversed(var10000)
}

public fun <T> Array<out Any>.single(): Any {
   when (`$this$single`.length) {
      0 -> throw NoSuchElementException("Array is empty.")
      1 -> return (T)`$this$single`[0]
      else -> throw IllegalArgumentException("Array has more than one element.")
   }
}

@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun CharArray.random(): Char {
   return ArraysKt.random((char[])`$this$random`, Random.Default)
}

public infix fun <R> FloatArray.zip(other: Iterable<Any>): List<Pair<Float, Any>> {
   val `$this$zip$iv`: FloatArray = `$this$zip`
   val `arraySize$iv`: Int = `$this$zip`.length
   val `list$iv`: ArrayList = ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(other, 10), `$this$zip`.length))
   var `i$iv`: Int = 0

   for (`element$iv` in other) {
      if (`i$iv` >= `arraySize$iv`) {
         break
      }

      `list$iv`.add(`$this$zip$iv`[`i$iv`++] to `element$iv`)
   }

   return `list$iv`
}

public fun IntArray.takeLast(n: Int): List<Int> {
   if (n < 0) {
      throw IllegalArgumentException(("Requested element count $n is less than zero.").toString())
   } else if (n == 0) {
      return CollectionsKt.emptyList()
   } else {
      val var5: Int = `$this$takeLast`.length
      if (n >= `$this$takeLast`.length) {
         return ArraysKt.toList(`$this$takeLast`)
      } else if (n == 1) {
         return CollectionsKt.listOf(`$this$takeLast`[var5 + -1])
      } else {
         val list: ArrayList = ArrayList(n)

         for (index in var5 - n..var5) {
            list.add(`$this$takeLast`[index])
         }

         return list
      }
   }
}

@SinceKotlin(version = "1.4")
public fun ShortArray.reverse(fromIndex: Int, toIndex: Int) {
   AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(fromIndex, toIndex, `$this$reverse`.length)
   val midPoint: Int = (fromIndex + toIndex) / 2
   if (fromIndex != (fromIndex + toIndex) / 2) {
      var reverseIndex: Int = toIndex + -1

      for (index in fromIndex..midPoint) {
         val tmp: Short = `$this$reverse`[index]
         `$this$reverse`[index] = `$this$reverse`[reverseIndex]
         `$this$reverse`[reverseIndex] = tmp
         reverseIndex--
      }
   }
}

public inline fun <R : Comparable<Any>> ByteArray.sortedByDescending(crossinline selector: (Byte) -> Any?): List<Byte> {
   return ArraysKt.sortedWith((byte[])`$this$sortedByDescending`,    // $VF: Compiled from Comparisons.kt
{ a: Any, b: Any ->
      val var3: Function1 = selector
      return ComparisonsKt.compareValues((T)(selector(b) as java.lang.Comparable), (T)(var3(a) as java.lang.Comparable))
   })
}

@SinceKotlin(version = "1.4")
public fun FloatArray.sortDescending(fromIndex: Int, toIndex: Int) {
   ArraysKt.sort(`$this$sortDescending`, fromIndex, toIndex)
   ArraysKt.reverse(`$this$sortDescending`, fromIndex, toIndex)
}

@InlineOnly
public inline operator fun DoubleArray.component3(): Double {
   return `$this$component3`[2]
}

public inline fun <T, R : Any, C : MutableCollection<in Any>> Array<out Any>.mapNotNullTo(destination: Any, transform: (Any) -> Any?): Any {
   for (`element$iv` in `$this$mapNotNullTo`) {
      val var10000: Any = transform(`element$iv`)
      if (var10000 != null) {
         destination.add(var10000)
      }
   }

   return (C)destination
}

public inline fun ShortArray.count(predicate: (Short) -> Boolean): Int {
   var count: Int = 0

   for (element in `$this$count`) {
      if (predicate(element) as java.lang.Boolean) {
         count++
      }
   }

   return count
}

@SinceKotlin(version = "1.5")
@InlineOnly
@JvmName(name = "sumOfUInt")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@OverloadResolutionByLambdaReturnType
public inline fun CharArray.sumOf(selector: (Char) -> UInt): UInt {
   var sum: Int = UInt.constructor_impl/* $VF was: constructor-impl */(0)

   for (element in `$this$sumOf`) {
      sum = UInt.constructor_impl/* $VF was: constructor-impl */(sum + (selector(element) as UInt).unbox_impl/* $VF was: unbox-impl */())
   }

   return sum
}

public infix fun <T, R> Array<out Any>.zip(other: Array<out Any>): List<Pair<Any, Any>> {
   val `$this$zip$iv`: Array<Any> = `$this$zip`
   val `size$iv`: Int = Math.min(`$this$zip`.length, other.length)
   val `list$iv`: ArrayList = ArrayList(`size$iv`)

   repeat(`size$iv`) { `i$iv` ->
      `list$iv`.add(`$this$zip$iv`[`i$iv`] to other[`i$iv`])
   }

   return `list$iv`
}

@SinceKotlin(version = "1.4")
public fun FloatArray.shuffle() {
   ArraysKt.shuffle(`$this$shuffle`, Random.Default)
}

public inline fun <R> BooleanArray.fold(initial: Any, operation: (Any, Boolean) -> Any): Any {
   var accumulator: Any = initial

   for (element in `$this$fold`) {
      accumulator = operation(accumulator, element)
   }

   return (R)accumulator
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.4")
public inline fun IntArray.reduceOrNull(operation: (Int, Int) -> Int): Int? {
   if (`$this$reduceOrNull`.length == 0) {
      return null
   } else {
      var accumulator: Int = `$this$reduceOrNull`[0]
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$reduceOrNull`)).iterator()

      while (var4.hasNext()) {
         accumulator = (operation(accumulator, `$this$reduceOrNull`[var4.nextInt()]) as java.lang.Number).intValue()
      }

      return accumulator
   }
}

@OverloadResolutionByLambdaReturnType
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun <R> CharArray.maxOfWithOrNull(comparator: Comparator<in Any>, selector: (Char) -> Any): Any? {
   if (`$this$maxOfWithOrNull`.length == 0) {
      return null
   } else {
      var maxValue: Any = selector(`$this$maxOfWithOrNull`[0])
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfWithOrNull`)).iterator()

      while (var4.hasNext()) {
         val v: Any = selector(`$this$maxOfWithOrNull`[var4.nextInt()])
         if (comparator.compare(maxValue, v) < 0) {
            maxValue = v
         }
      }

      return (R)maxValue
   }
}

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@InlineOnly
@JvmName(name = "sumOfInt")
public inline fun <T> Array<out Any>.sumOf(selector: (Any) -> Int): Int {
   var sum: Int = 0

   for (element in `$this$sumOf`) {
      sum += (selector(element) as java.lang.Number).intValue()
   }

   return sum
}

@InlineOnly
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
public inline fun BooleanArray.minOfOrNull(selector: (Boolean) -> Float): Float? {
   if (`$this$minOfOrNull`.length == 0) {
      return null
   } else {
      var minValue: Float = (selector(`$this$minOfOrNull`[0]) as java.lang.Number).floatValue()
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfOrNull`)).iterator()

      while (var3.hasNext()) {
         minValue = Math.min(minValue, (selector(`$this$minOfOrNull`[var3.nextInt()]) as java.lang.Number).floatValue())
      }

      return minValue
   }
}

public inline fun <T, R : Comparable<Any>> Array<out Any>.sortByDescending(crossinline selector: (Any) -> Any?) {
   if (`$this$sortByDescending`.length > 1) {
      ArraysKt.sortWith(`$this$sortByDescending`,       // $VF: Compiled from Comparisons.kt
{ a: Any, b: Any ->
         val var3: Function1 = selector
         return ComparisonsKt.compareValues((T)(selector(b) as java.lang.Comparable), (T)(var3(a) as java.lang.Comparable))
      })
   }
}

@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun <V> ShortArray.associateWith(valueSelector: (Short) -> Any): Map<Short, Any> {
   val result: LinkedHashMap = LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(`$this$associateWith`.length), 16))

   for (var6 in `$this$associateWith`) {
      result.put(var6, valueSelector(var6))
   }

   return result
}

public inline fun <V> ShortArray.zip(other: ShortArray, transform: (Short, Short) -> Any): List<Any> {
   val size: Int = Math.min(`$this$zip`.length, other.length)
   val list: ArrayList = ArrayList(size)

   repeat(size) { i ->
      list.add(transform(`$this$zip`[i], other[i]))
   }

   return list
}

public fun FloatArray.sliceArray(indices: Collection<Int>): FloatArray {
   val result: FloatArray = FloatArray(indices.size())
   var targetIndex: Int = 0
   val var4: java.util.Iterator = indices.iterator()

   while (var4.hasNext()) {
      result[targetIndex++] = `$this$sliceArray`[(var4.next() as java.lang.Number).intValue()]
   }

   return result
}

public fun FloatArray.distinct(): List<Float> {
   return CollectionsKt.toList(ArraysKt.toMutableSet(`$this$distinct`))
}

@SinceKotlin(version = "1.4")
public inline fun <T, R> Array<out Any>.runningFold(initial: Any, operation: (Any, Any) -> Any): List<Any> {
   if (`$this$runningFold`.length == 0) {
      return (java.util.List<R>)CollectionsKt.listOf(initial)
   } else {
      var accumulator: Any = ArrayList(`$this$runningFold`.length + 1)
      accumulator.add(initial)
      val result: Any = accumulator
      accumulator = initial

      for (element in `$this$runningFold`) {
         accumulator = operation(accumulator, element)
         result.add(accumulator)
      }

      return result as MutableList<R>
   }
}

public inline fun LongArray.last(predicate: (Long) -> Boolean): Long {
   var var3: Int = `$this$last`.length + -1
   if (0 <= `$this$last`.length + -1) {
      do {
         val element: Long = `$this$last`[var3--]
         if (predicate(element) as java.lang.Boolean) {
            return element
         }
      } while (0 <= var3)
   }

   throw NoSuchElementException("Array contains no element matching the predicate.")
}

public fun Array<out Int>.toIntArray(): IntArray {
   var var1: Int = 0
   val var2: Int = `$this$toIntArray`.length
   val var3: IntArray = IntArray(`$this$toIntArray`.length)

   while (var1 < var2) {
      var3[var1] = `$this$toIntArray`[var1]
      var1++
   }

   return var3
}

@SinceKotlin(version = "1.4")
public fun IntArray.maxWithOrNull(comparator: Comparator<in Int>): Int? {
   if (`$this$maxWithOrNull`.length == 0) {
      return null
   } else {
      var max: Int = `$this$maxWithOrNull`[0]
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxWithOrNull`)).iterator()

      while (var3.hasNext()) {
         val e: Int = `$this$maxWithOrNull`[var3.nextInt()]
         if (comparator.compare(max, e) < 0) {
            max = e
         }
      }

      return max
   }
}

public final val lastIndex: Int
   public final get() {
      return `$this$lastIndex`.length - 1
   }


@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
@InlineOnly
public inline fun <R : Comparable<Any>> ShortArray.minOfOrNull(selector: (Short) -> Any): Any? {
   if (`$this$minOfOrNull`.length == 0) {
      return null
   } else {
      var minValue: java.lang.Comparable = selector(`$this$minOfOrNull`[0]) as java.lang.Comparable
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfOrNull`)).iterator()

      while (var3.hasNext()) {
         val v: java.lang.Comparable = selector(`$this$minOfOrNull`[var3.nextInt()]) as java.lang.Comparable
         if (minValue.compareTo(v) > 0) {
            minValue = v
         }
      }

      return (R)minValue
   }
}

public inline fun <R, C : MutableCollection<in Any>> ShortArray.flatMapTo(destination: Any, transform: (Short) -> Iterable<Any>): Any {
   for (element in `$this$flatMapTo`) {
      CollectionsKt.addAll(destination, transform(element) as java.lang.Iterable)
   }

   return (C)destination
}

public inline fun CharArray.filter(predicate: (Char) -> Boolean): List<Char> {
   val `destination$iv`: java.util.Collection = ArrayList()

   for (`element$iv` in `$this$filter`) {
      if (predicate(`element$iv`) as java.lang.Boolean) {
         `destination$iv`.add(`element$iv`)
      }
   }

   return `destination$iv` as MutableList<Character>
}

@JvmName(name = "flatMapIndexedIterable")
@InlineOnly
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
public inline fun <R> ByteArray.flatMapIndexed(transform: (Int, Byte) -> Iterable<Any>): List<Any> {
   val var3: java.util.Collection = ArrayList()
   var var4: Int = 0

   for (var7 in `$this$flatMapIndexed`) {
      CollectionsKt.addAll(var3, transform(var4++, var7) as java.lang.Iterable)
   }

   return var3 as MutableList<R>
}

@SinceKotlin(version = "1.7")
@JvmName(name = "maxByOrThrow")
public inline fun <R : Comparable<Any>> IntArray.maxBy(selector: (Int) -> Any): Int {
   if (`$this$maxBy`.length == 0) {
      throw NoSuchElementException()
   } else {
      var maxElem: Int = `$this$maxBy`[0]
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$maxBy`)
      if (lastIndex == 0) {
         return maxElem
      } else {
         var maxValue: java.lang.Comparable = selector(maxElem) as java.lang.Comparable
         val var6: IntIterator = IntRange(1, lastIndex).iterator()

         while (var6.hasNext()) {
            val e: Int = `$this$maxBy`[var6.nextInt()]
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

public fun ByteArray.slice(indices: IntRange): List<Byte> {
   return if (indices.isEmpty())
      CollectionsKt.emptyList()
      else
      ArraysKt.asList(ArraysKt.copyOfRange((byte[])`$this$slice`, indices.start, indices.endInclusive + 1))
   }

public inline fun <R> IntArray.mapIndexed(transform: (Int, Int) -> Any): List<Any> {
   val `destination$iv`: java.util.Collection = ArrayList(`$this$mapIndexed`.length)
   var `index$iv`: Int = 0

   for (`item$iv` in `$this$mapIndexed`) {
      `destination$iv`.add(transform(`index$iv`++, `item$iv`))
   }

   return `destination$iv` as MutableList<R>
}

public fun <T> Array<out Any>.slice(indices: Iterable<Int>): List<Any> {
   val size: Int = CollectionsKt.collectionSizeOrDefault(indices, 10)
   if (size == 0) {
      return CollectionsKt.emptyList()
   } else {
      val list: ArrayList = ArrayList(size)
      val var4: java.util.Iterator = indices.iterator()

      while (var4.hasNext()) {
         list.add(`$this$slice`[(var4.next() as java.lang.Number).intValue()])
      }

      return list
   }
}

public fun <T> Array<out Any>.lastIndexOf(element: Any): Int {
   if (element == null) {
      var var2: Int = `$this$lastIndexOf`.length + -1
      if (0 <= `$this$lastIndexOf`.length + -1) {
         do {
            val index: Int = var2--
            if (`$this$lastIndexOf`[index] == null) {
               return index
            }
         } while (0 <= var2)
      }
   } else {
      var var4: Int = `$this$lastIndexOf`.length + -1
      if (0 <= `$this$lastIndexOf`.length + -1) {
         do {
            val var5: Int = var4--
            if (element == `$this$lastIndexOf`[var5]) {
               return var5
            }
         } while (0 <= var4)
      }
   }

   return -1
}

public fun DoubleArray.sortedWith(comparator: Comparator<in Double>): List<Double> {
   val var2: Array<java.lang.Double> = ArraysKt.toTypedArray(`$this$sortedWith`)
   ArraysKt.sortWith(var2, comparator)
   return ArraysKt.asList(var2)
}

@SinceKotlin(version = "1.4")
public fun ByteArray.minOrNull(): Byte? {
   if (`$this$minOrNull`.length == 0) {
      return null
   } else {
      var min: Byte = `$this$minOrNull`[0]
      val var2: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOrNull`)).iterator()

      while (var2.hasNext()) {
         val e: Byte = `$this$minOrNull`[var2.nextInt()]
         if (min > e) {
            min = e
         }
      }

      return min
   }
}

@InlineOnly
@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
public inline fun <R : Comparable<Any>> ShortArray.maxOf(selector: (Short) -> Any): Any {
   if (`$this$maxOf`.length == 0) {
      throw NoSuchElementException()
   } else {
      var maxValue: java.lang.Comparable = selector(`$this$maxOf`[0]) as java.lang.Comparable
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOf`)).iterator()

      while (var3.hasNext()) {
         val v: java.lang.Comparable = selector(`$this$maxOf`[var3.nextInt()]) as java.lang.Comparable
         if (maxValue.compareTo(v) < 0) {
            maxValue = v
         }
      }

      return (R)maxValue
   }
}

public inline fun <R, V> LongArray.zip(other: Array<out Any>, transform: (Long, Any) -> Any): List<Any> {
   val size: Int = Math.min(`$this$zip`.length, other.length)
   val list: ArrayList = ArrayList(size)

   repeat(size) { i ->
      list.add(transform(`$this$zip`[i], other[i]))
   }

   return list
}

@InlineOnly
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
public inline fun <T, R> Array<out Any>.minOfWithOrNull(comparator: Comparator<in Any>, selector: (Any) -> Any): Any? {
   if (`$this$minOfWithOrNull`.length == 0) {
      return null
   } else {
      var minValue: Any = selector(`$this$minOfWithOrNull`[0])
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfWithOrNull`)).iterator()

      while (var4.hasNext()) {
         val v: Any = selector(`$this$minOfWithOrNull`[var4.nextInt()])
         if (comparator.compare(minValue, v) > 0) {
            minValue = v
         }
      }

      return (R)minValue
   }
}

public inline fun <R> LongArray.map(transform: (Long) -> Any): List<Any> {
   val `destination$iv`: java.util.Collection = ArrayList(`$this$map`.length)

   for (`item$iv` in `$this$map`) {
      `destination$iv`.add(transform(`item$iv`))
   }

   return `destination$iv` as MutableList<R>
}

public inline fun <K, V> ShortArray.groupBy(keySelector: (Short) -> Any, valueTransform: (Short) -> Any): Map<Any, List<Any>> {
   val `destination$iv`: java.util.Map = LinkedHashMap()

   for (`element$iv` in `$this$groupBy`) {
      val `key$iv`: Any = keySelector(`element$iv`)
      val `value$iv$iv`: Any = `destination$iv`.get(`key$iv`)
      val var10000: Any
      if (`value$iv$iv` == null) {
         val var16: java.util.List = ArrayList()
         `destination$iv`.put(`key$iv`, var16)
         var10000 = var16
      } else {
         var10000 = `value$iv$iv`
      }

      (var10000 as java.util.List).add(valueTransform(`element$iv`))
   }

   return `destination$iv`
}

@InlineOnly
@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
public inline fun CharArray.minOfOrNull(selector: (Char) -> Float): Float? {
   if (`$this$minOfOrNull`.length == 0) {
      return null
   } else {
      var minValue: Float = (selector(`$this$minOfOrNull`[0]) as java.lang.Number).floatValue()
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfOrNull`)).iterator()

      while (var3.hasNext()) {
         minValue = Math.min(minValue, (selector(`$this$minOfOrNull`[var3.nextInt()]) as java.lang.Number).floatValue())
      }

      return minValue
   }
}

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun ByteArray.minOfOrNull(selector: (Byte) -> Float): Float? {
   if (`$this$minOfOrNull`.length == 0) {
      return null
   } else {
      var minValue: Float = (selector(`$this$minOfOrNull`[0]) as java.lang.Number).floatValue()
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfOrNull`)).iterator()

      while (var3.hasNext()) {
         minValue = Math.min(minValue, (selector(`$this$minOfOrNull`[var3.nextInt()]) as java.lang.Number).floatValue())
      }

      return minValue
   }
}

public infix fun <R> ByteArray.zip(other: Iterable<Any>): List<Pair<Byte, Any>> {
   val `$this$zip$iv`: ByteArray = `$this$zip`
   val `arraySize$iv`: Int = `$this$zip`.length
   val `list$iv`: ArrayList = ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(other, 10), `$this$zip`.length))
   var `i$iv`: Int = 0

   for (`element$iv` in other) {
      if (`i$iv` >= `arraySize$iv`) {
         break
      }

      `list$iv`.add(`$this$zip$iv`[`i$iv`++] to `element$iv`)
   }

   return `list$iv`
}

public fun <C : MutableCollection<in Long>> LongArray.toCollection(destination: Any): Any {
   for (item in `$this$toCollection`) {
      destination.add(item)
   }

   return (C)destination
}

public fun ByteArray.asIterable(): Iterable<Byte> {
   return if (`$this$asIterable`.length == 0) CollectionsKt.emptyList() else ArraysKt___ArraysKt$asIterable$$inlined$Iterable$2(`$this$asIterable`)
}

@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun DoubleArray.runningReduce(operation: (Double, Double) -> Double): List<Double> {
   if (`$this$runningReduce`.length == 0) {
      return CollectionsKt.emptyList()
   } else {
      var accumulator: Double = 0.0
      accumulator = `$this$runningReduce`[0]
      val index: ArrayList = ArrayList(`$this$runningReduce`.length)
      index.add(accumulator)
      val result: ArrayList = index
      var var8: Int = 1

      for (var9 in `$this$runningReduce`.length..var8) {
         accumulator = (operation(accumulator, `$this$runningReduce`[var8]) as java.lang.Number).doubleValue()
         result.add(accumulator)
      }

      return result
   }
}

public fun CharArray.none(): Boolean {
   return `$this$none`.length == 0
}

@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@JvmName(name = "sumOfUInt")
@OverloadResolutionByLambdaReturnType
@InlineOnly
@SinceKotlin(version = "1.5")
public inline fun LongArray.sumOf(selector: (Long) -> UInt): UInt {
   var sum: Int = UInt.constructor_impl/* $VF was: constructor-impl */(0)

   for (element in `$this$sumOf`) {
      sum = UInt.constructor_impl/* $VF was: constructor-impl */(sum + (selector(element) as UInt).unbox_impl/* $VF was: unbox-impl */())
   }

   return sum
}

@InlineOnly
public inline fun <T> Array<out Any>.find(predicate: (Any) -> Boolean): Any? {
   val `$this$firstOrNull$iv`: Array<Any> = `$this$find`
   var var4: Int = 0
   val var5: Int = `$this$find`.length

   var var10000: Any
   while (true) {
      if (var4 >= var5) {
         var10000 = null
         break
      }

      val `element$iv`: Any = `$this$firstOrNull$iv`[var4]
      if (predicate(`$this$firstOrNull$iv`[var4]) as java.lang.Boolean) {
         var10000 = `element$iv`
         break
      }

      var4++
   }

   return (T)var10000
}

public inline fun <T, R : Comparable<Any>> Array<out Any>.sortedBy(crossinline selector: (Any) -> Any?): List<Any> {
   return (java.util.List<T>)ArraysKt.sortedWith((Object[])`$this$sortedBy`,    // $VF: Compiled from Comparisons.kt
{ a: Any, b: Any ->
      val var3: Function1 = selector
      return ComparisonsKt.compareValues((T)(selector(a) as java.lang.Comparable), (T)(var3(b) as java.lang.Comparable))
   })
}

public inline fun DoubleArray.forEach(action: (Double) -> Unit) {
   for (element in `$this$forEach`) {
      action(element)
   }
}

public fun <T> Array<out Any>.take(n: Int): List<Any> {
   if (n < 0) {
      throw IllegalArgumentException(("Requested element count $n is less than zero.").toString())
   } else if (n == 0) {
      return CollectionsKt.emptyList()
   } else if (n >= `$this$take`.length) {
      return (java.util.List<T>)ArraysKt.toList(`$this$take`)
   } else if (n == 1) {
      return (java.util.List<T>)CollectionsKt.listOf(`$this$take`[0])
   } else {
      val var7: Int = 0
      val list: ArrayList = ArrayList(n)

      for (item in `$this$take`) {
         list.add(item)
         if (++var7 == n) {
            break
         }
      }

      return list
   }
}

public fun ByteArray.getOrNull(index: Int): Byte? {
   return if (index >= 0 && index <= ArraysKt.getLastIndex(`$this$getOrNull`)) `$this$getOrNull`[index] else null
}

public inline fun <R> ShortArray.fold(initial: Any, operation: (Any, Short) -> Any): Any {
   var accumulator: Any = initial

   for (element in `$this$fold`) {
      accumulator = operation(accumulator, element)
   }

   return (R)accumulator
}

public fun LongArray.sortedArrayDescending(): LongArray {
   if (`$this$sortedArrayDescending`.length == 0) {
      return `$this$sortedArrayDescending`
   } else {
      val var10000: LongArray = Arrays.copyOf(`$this$sortedArrayDescending`, `$this$sortedArrayDescending`.length)
      ArraysKt.sortDescending(var10000)
      return var10000
   }
}

@SinceKotlin(version = "1.4")
public fun CharArray.reverse(fromIndex: Int, toIndex: Int) {
   AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(fromIndex, toIndex, `$this$reverse`.length)
   val midPoint: Int = (fromIndex + toIndex) / 2
   if (fromIndex != (fromIndex + toIndex) / 2) {
      var reverseIndex: Int = toIndex + -1

      for (index in fromIndex..midPoint) {
         val tmp: Char = `$this$reverse`[index]
         `$this$reverse`[index] = `$this$reverse`[reverseIndex]
         `$this$reverse`[reverseIndex] = tmp
         reverseIndex--
      }
   }
}

public fun IntArray.distinct(): List<Int> {
   return CollectionsKt.toList(ArraysKt.toMutableSet(`$this$distinct`))
}

@JvmName(name = "maxWithOrThrow")
@SinceKotlin(version = "1.7")
public fun BooleanArray.maxWith(comparator: Comparator<in Boolean>): Boolean {
   if (`$this$maxWith`.length == 0) {
      throw NoSuchElementException()
   } else {
      var max: Boolean = `$this$maxWith`[0]
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxWith`)).iterator()

      while (var3.hasNext()) {
         val e: Boolean = `$this$maxWith`[var3.nextInt()]
         if (comparator.compare(max, e) < 0) {
            max = e
         }
      }

      return max
   }
}

public inline fun ByteArray.first(predicate: (Byte) -> Boolean): Byte {
   for (element in `$this$first`) {
      if (predicate(element) as java.lang.Boolean) {
         return element
      }
   }

   throw NoSuchElementException("Array contains no element matching the predicate.")
}

public fun BooleanArray.asSequence(): Sequence<Boolean> {
   return if (`$this$asSequence`.length == 0) SequencesKt.emptySequence() else ArraysKt___ArraysKt$asSequence$$inlined$Sequence$8(`$this$asSequence`)
}

@InlineOnly
public inline fun ShortArray.count(): Int {
   return `$this$count`.length
}

public inline fun FloatArray.count(predicate: (Float) -> Boolean): Int {
   var count: Int = 0

   for (element in `$this$count`) {
      if (predicate(element) as java.lang.Boolean) {
         count++
      }
   }

   return count
}

@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
@InlineOnly
public inline fun CharArray.minOf(selector: (Char) -> Float): Float {
   if (`$this$minOf`.length == 0) {
      throw NoSuchElementException()
   } else {
      var minValue: Float = (selector(`$this$minOf`[0]) as java.lang.Number).floatValue()
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOf`)).iterator()

      while (var3.hasNext()) {
         minValue = Math.min(minValue, (selector(`$this$minOf`[var3.nextInt()]) as java.lang.Number).floatValue())
      }

      return minValue
   }
}

public inline fun <T> Array<out Any>.partition(predicate: (Any) -> Boolean): Pair<List<Any>, List<Any>> {
   val first: ArrayList = ArrayList()
   val second: ArrayList = ArrayList()

   for (element in `$this$partition`) {
      if (predicate(element) as java.lang.Boolean) {
         first.add(element)
      } else {
         second.add(element)
      }
   }

   return Pair<>(first, second)
}

@Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = []))
@DeprecatedSinceKotlin(warningSince = "1.5")
public inline fun BooleanArray.sumBy(selector: (Boolean) -> Int): Int {
   var sum: Int = 0

   for (element in `$this$sumBy`) {
      sum += (selector(element) as java.lang.Number).intValue()
   }

   return sum
}

@InlineOnly
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
public inline fun BooleanArray.maxOfOrNull(selector: (Boolean) -> Double): Double? {
   if (`$this$maxOfOrNull`.length == 0) {
      return null
   } else {
      var maxValue: Double = (selector(`$this$maxOfOrNull`[0]) as java.lang.Number).doubleValue()
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfOrNull`)).iterator()

      while (var4.hasNext()) {
         maxValue = Math.max(maxValue, (selector(`$this$maxOfOrNull`[var4.nextInt()]) as java.lang.Number).doubleValue())
      }

      return maxValue
   }
}

public inline fun ByteArray.singleOrNull(predicate: (Byte) -> Boolean): Byte? {
   var single: java.lang.Byte = null
   var found: Boolean = false

   for (element in `$this$singleOrNull`) {
      if (predicate(element) as java.lang.Boolean) {
         if (found) {
            return null
         }

         single = element
         found = true
      }
   }

   return if (!found) null else single
}

public fun IntArray.sorted(): List<Int> {
   val var1: Array<Int> = ArraysKt.toTypedArray(`$this$sorted`)
   ArraysKt.sort(var1)
   return ArraysKt.asList(var1)
}

@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public inline fun <T, R> Array<out Any>.scan(initial: Any, operation: (Any, Any) -> Any): List<Any> {
   val var10000: java.util.List
   if (`$this$scan`.length == 0) {
      var10000 = CollectionsKt.listOf(initial)
   } else {
      val `accumulator$iv`: ArrayList = ArrayList(`$this$scan`.length + 1)
      `accumulator$iv`.add(initial)
      val `result$iv`: ArrayList = `accumulator$iv`
      var var11: Any = initial

      for (`element$iv` in `$this$scan`) {
         var11 = operation(var11, `element$iv`)
         `result$iv`.add(var11)
      }

      var10000 = `result$iv`
   }

   return var10000
}

public fun DoubleArray.firstOrNull(): Double? {
   return if (`$this$firstOrNull`.length == 0) null else `$this$firstOrNull`[0]
}

@InlineOnly
public inline operator fun BooleanArray.component5(): Boolean {
   return `$this$component5`[4]
}

@SinceKotlin(version = "1.4")
@InlineOnly
@OverloadResolutionByLambdaReturnType
public inline fun FloatArray.minOf(selector: (Float) -> Float): Float {
   if (`$this$minOf`.length == 0) {
      throw NoSuchElementException()
   } else {
      var minValue: Float = (selector(`$this$minOf`[0]) as java.lang.Number).floatValue()
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOf`)).iterator()

      while (var3.hasNext()) {
         minValue = Math.min(minValue, (selector(`$this$minOf`[var3.nextInt()]) as java.lang.Number).floatValue())
      }

      return minValue
   }
}

public fun ByteArray.reversedArray(): ByteArray {
   if (`$this$reversedArray`.length == 0) {
      return `$this$reversedArray`
   } else {
      val result: ByteArray = ByteArray(`$this$reversedArray`.length)
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$reversedArray`)
      val var3: IntIterator = IntRange(0, lastIndex).iterator()

      while (var3.hasNext()) {
         val i: Int = var3.nextInt()
         result[lastIndex - i] = `$this$reversedArray`[i]
      }

      return result
   }
}

public inline fun <T, R> Array<out Any>.flatMap(transform: (Any) -> Iterable<Any>): List<Any> {
   val `destination$iv`: java.util.Collection = ArrayList()

   for (`element$iv` in `$this$flatMap`) {
      CollectionsKt.addAll(`destination$iv`, transform(`element$iv`) as java.lang.Iterable)
   }

   return `destination$iv` as MutableList<R>
}

public inline fun IntArray.singleOrNull(predicate: (Int) -> Boolean): Int? {
   var single: Int = null
   var found: Boolean = false

   for (element in `$this$singleOrNull`) {
      if (predicate(element) as java.lang.Boolean) {
         if (found) {
            return null
         }

         single = element
         found = true
      }
   }

   return if (!found) null else single
}

@SinceKotlin(version = "1.4")
@InlineOnly
@OverloadResolutionByLambdaReturnType
public inline fun BooleanArray.maxOfOrNull(selector: (Boolean) -> Float): Float? {
   if (`$this$maxOfOrNull`.length == 0) {
      return null
   } else {
      var maxValue: Float = (selector(`$this$maxOfOrNull`[0]) as java.lang.Number).floatValue()
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfOrNull`)).iterator()

      while (var3.hasNext()) {
         maxValue = Math.max(maxValue, (selector(`$this$maxOfOrNull`[var3.nextInt()]) as java.lang.Number).floatValue())
      }

      return maxValue
   }
}

public inline fun <R> BooleanArray.map(transform: (Boolean) -> Any): List<Any> {
   val `destination$iv`: java.util.Collection = ArrayList(`$this$map`.length)

   for (`item$iv` in `$this$map`) {
      `destination$iv`.add(transform(`item$iv`))
   }

   return `destination$iv` as MutableList<R>
}

public fun IntArray.any(): Boolean {
   return `$this$any`.length != 0
}

public inline fun ShortArray.reduceRight(operation: (Short, Short) -> Short): Short {
   var index: Int = ArraysKt.getLastIndex(`$this$reduceRight`)
   if (index < 0) {
      throw UnsupportedOperationException("Empty array can't be reduced.")
   } else {
      var accumulator: Short = `$this$reduceRight`[index--]

      while (index >= 0) {
         accumulator = (operation(`$this$reduceRight`[index--], accumulator) as java.lang.Number).shortValue()
      }

      return accumulator
   }
}

public infix fun ByteArray.subtract(other: Iterable<Byte>): Set<Byte> {
   val set: java.util.Set = ArraysKt.toMutableSet(`$this$subtract`)
   CollectionsKt.removeAll(set, other)
   return set
}

public operator fun ByteArray.contains(element: Byte): Boolean {
   return ArraysKt.indexOf(`$this$contains`, element) >= 0
}

@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun LongArray.random(): Long {
   return ArraysKt.random(`$this$random`, Random.Default)
}

public fun FloatArray.takeLast(n: Int): List<Float> {
   if (n < 0) {
      throw IllegalArgumentException(("Requested element count $n is less than zero.").toString())
   } else if (n == 0) {
      return CollectionsKt.emptyList()
   } else {
      val var5: Int = `$this$takeLast`.length
      if (n >= `$this$takeLast`.length) {
         return ArraysKt.toList(`$this$takeLast`)
      } else if (n == 1) {
         return CollectionsKt.listOf(`$this$takeLast`[var5 + -1])
      } else {
         val list: ArrayList = ArrayList(n)

         for (index in var5 - n..var5) {
            list.add(`$this$takeLast`[index])
         }

         return list
      }
   }
}

public fun CharArray.sliceArray(indices: IntRange): CharArray {
   return if (indices.isEmpty()) CharArray(0) else ArraysKt.copyOfRange((char[])`$this$sliceArray`, indices.start, indices.endInclusive + 1)
}

@SinceKotlin(version = "1.3")
public fun FloatArray.random(random: Random): Float {
   if (`$this$random`.length == 0) {
      throw NoSuchElementException("Array is empty.")
   } else {
      return `$this$random`[random.nextInt(`$this$random`.length)]
   }
}

public fun CharArray.toMutableList(): MutableList<Char> {
   val list: ArrayList = ArrayList(`$this$toMutableList`.length)

   for (item in `$this$toMutableList`) {
      list.add(item)
   }

   return list
}

public inline fun <V> DoubleArray.zip(other: DoubleArray, transform: (Double, Double) -> Any): List<Any> {
   val size: Int = Math.min(`$this$zip`.length, other.length)
   val list: ArrayList = ArrayList(size)

   repeat(size) { i ->
      list.add(transform(`$this$zip`[i], other[i]))
   }

   return list
}

@SinceKotlin(version = "1.7")
@JvmName(name = "minOrThrow")
public fun FloatArray.min(): Float {
   if (`$this$min`.length == 0) {
      throw NoSuchElementException()
   } else {
      var min: Float = `$this$min`[0]
      val var2: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$min`)).iterator()

      while (var2.hasNext()) {
         min = Math.min(min, `$this$min`[var2.nextInt()])
      }

      return min
   }
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.4")
public inline fun LongArray.reduceOrNull(operation: (Long, Long) -> Long): Long? {
   if (`$this$reduceOrNull`.length == 0) {
      return null
   } else {
      var accumulator: Long = `$this$reduceOrNull`[0]
      val var5: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$reduceOrNull`)).iterator()

      while (var5.hasNext()) {
         accumulator = (operation(accumulator, `$this$reduceOrNull`[var5.nextInt()]) as java.lang.Number).longValue()
      }

      return accumulator
   }
}

@JvmName(name = "sumOfFloat")
public fun Array<out Float>.sum(): Float {
   var sum: Float = 0.0F
   var var2: Int = 0

   for (var3 in `$this$sum`.length..var2) {
      sum += `$this$sum`[var2]
   }

   return sum
}

@InlineOnly
public inline fun BooleanArray.count(): Int {
   return `$this$count`.length
}

public inline fun DoubleArray.takeWhile(predicate: (Double) -> Boolean): List<Double> {
   val list: ArrayList = ArrayList()

   for (item in `$this$takeWhile`) {
      if (!predicate(item) as java.lang.Boolean) {
         break
      }

      list.add(item)
   }

   return list
}

@InlineOnly
@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
@JvmName(name = "sumOfLong")
public inline fun BooleanArray.sumOf(selector: (Boolean) -> Long): Long {
   var sum: Long = 0L

   for (element in `$this$sumOf`) {
      sum += (selector(element) as java.lang.Number).longValue()
   }

   return sum
}

@SinceKotlin(version = "1.4")
public fun LongArray.minWithOrNull(comparator: Comparator<in Long>): Long? {
   if (`$this$minWithOrNull`.length == 0) {
      return null
   } else {
      var min: Long = `$this$minWithOrNull`[0]
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minWithOrNull`)).iterator()

      while (var4.hasNext()) {
         val e: Long = `$this$minWithOrNull`[var4.nextInt()]
         if (comparator.compare(min, e) > 0) {
            min = e
         }
      }

      return min
   }
}

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@JvmName(name = "flatMapSequenceTo")
public inline fun <T, R, C : MutableCollection<in Any>> Array<out Any>.flatMapTo(destination: Any, transform: (Any) -> Sequence<Any>): Any {
   for (element in `$this$flatMapTo`) {
      CollectionsKt.addAll(destination, transform(element) as Sequence)
   }

   return (C)destination
}

public fun LongArray.lastOrNull(): Long? {
   return if (`$this$lastOrNull`.length == 0) null else `$this$lastOrNull`[`$this$lastOrNull`.length - 1]
}

public inline fun <K, V, M : MutableMap<in Any, in Any>> IntArray.associateByTo(destination: Any, keySelector: (Int) -> Any, valueTransform: (Int) -> Any): Any {
   for (element in `$this$associateByTo`) {
      destination.put(keySelector(element), valueTransform(element))
   }

   return (M)destination
}

public fun DoubleArray.slice(indices: Iterable<Int>): List<Double> {
   val size: Int = CollectionsKt.collectionSizeOrDefault(indices, 10)
   if (size == 0) {
      return CollectionsKt.emptyList()
   } else {
      val list: ArrayList = ArrayList(size)
      val var4: java.util.Iterator = indices.iterator()

      while (var4.hasNext()) {
         list.add(`$this$slice`[(var4.next() as java.lang.Number).intValue()])
      }

      return list
   }
}

@InlineOnly
public inline fun <T> Array<out Any>.isEmpty(): Boolean {
   return `$this$isEmpty`.length == 0
}

@SinceKotlin(version = "1.3")
public fun LongArray.random(random: Random): Long {
   if (`$this$random`.length == 0) {
      throw NoSuchElementException("Array is empty.")
   } else {
      return `$this$random`[random.nextInt(`$this$random`.length)]
   }
}

@InlineOnly
public inline fun CharArray.elementAtOrElse(index: Int, defaultValue: (Int) -> Char): Char {
   return if (index >= 0 && index <= ArraysKt.getLastIndex(`$this$elementAtOrElse`)) `$this$elementAtOrElse`[index] else defaultValue(index) as Character
}

@InlineOnly
public inline operator fun BooleanArray.component1(): Boolean {
   return `$this$component1`[0]
}

public infix fun ByteArray.intersect(other: Iterable<Byte>): Set<Byte> {
   val set: java.util.Set = ArraysKt.toMutableSet(`$this$intersect`)
   CollectionsKt.retainAll(set, other)
   return set
}

public inline fun FloatArray.all(predicate: (Float) -> Boolean): Boolean {
   for (element in `$this$all`) {
      if (!predicate(element) as java.lang.Boolean) {
         return false
      }
   }

   return true
}

@SinceKotlin(version = "1.4")
@InlineOnly
@OverloadResolutionByLambdaReturnType
public inline fun ByteArray.maxOf(selector: (Byte) -> Float): Float {
   if (`$this$maxOf`.length == 0) {
      throw NoSuchElementException()
   } else {
      var maxValue: Float = (selector(`$this$maxOf`[0]) as java.lang.Number).floatValue()
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOf`)).iterator()

      while (var3.hasNext()) {
         maxValue = Math.max(maxValue, (selector(`$this$maxOf`[var3.nextInt()]) as java.lang.Number).floatValue())
      }

      return maxValue
   }
}

@SinceKotlin(version = "1.4")
@InlineOnly
@OverloadResolutionByLambdaReturnType
public inline fun <R : Comparable<Any>> BooleanArray.maxOfOrNull(selector: (Boolean) -> Any): Any? {
   if (`$this$maxOfOrNull`.length == 0) {
      return null
   } else {
      var maxValue: java.lang.Comparable = selector(`$this$maxOfOrNull`[0]) as java.lang.Comparable
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfOrNull`)).iterator()

      while (var3.hasNext()) {
         val v: java.lang.Comparable = selector(`$this$maxOfOrNull`[var3.nextInt()]) as java.lang.Comparable
         if (maxValue.compareTo(v) < 0) {
            maxValue = v
         }
      }

      return (R)maxValue
   }
}

@InlineOnly
@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
public inline fun <R> LongArray.minOfWithOrNull(comparator: Comparator<in Any>, selector: (Long) -> Any): Any? {
   if (`$this$minOfWithOrNull`.length == 0) {
      return null
   } else {
      var minValue: Any = selector(`$this$minOfWithOrNull`[0])
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfWithOrNull`)).iterator()

      while (var4.hasNext()) {
         val v: Any = selector(`$this$minOfWithOrNull`[var4.nextInt()])
         if (comparator.compare(minValue, v) > 0) {
            minValue = v
         }
      }

      return (R)minValue
   }
}

public inline fun <K, V> ByteArray.groupBy(keySelector: (Byte) -> Any, valueTransform: (Byte) -> Any): Map<Any, List<Any>> {
   val `destination$iv`: java.util.Map = LinkedHashMap()

   for (`element$iv` in `$this$groupBy`) {
      val `key$iv`: Any = keySelector(`element$iv`)
      val `value$iv$iv`: Any = `destination$iv`.get(`key$iv`)
      val var10000: Any
      if (`value$iv$iv` == null) {
         val var16: java.util.List = ArrayList()
         `destination$iv`.put(`key$iv`, var16)
         var10000 = var16
      } else {
         var10000 = `value$iv$iv`
      }

      (var10000 as java.util.List).add(valueTransform(`element$iv`))
   }

   return `destination$iv`
}

public inline fun CharArray.dropLastWhile(predicate: (Char) -> Boolean): List<Char> {
   for (index in ArraysKt.getLastIndex(`$this$dropLastWhile`) downTo 0) {
      if (!predicate(`$this$dropLastWhile`[index]) as java.lang.Boolean) {
         return ArraysKt.take((char[])`$this$dropLastWhile`, index + 1)
      }
   }

   return CollectionsKt.emptyList()
}

@JvmName(name = "maxByOrThrow")
@SinceKotlin(version = "1.7")
public inline fun <R : Comparable<Any>> ShortArray.maxBy(selector: (Short) -> Any): Short {
   if (`$this$maxBy`.length == 0) {
      throw NoSuchElementException()
   } else {
      var maxElem: Short = `$this$maxBy`[0]
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$maxBy`)
      if (lastIndex == 0) {
         return maxElem
      } else {
         var maxValue: java.lang.Comparable = selector(maxElem) as java.lang.Comparable
         val var6: IntIterator = IntRange(1, lastIndex).iterator()

         while (var6.hasNext()) {
            val e: Short = `$this$maxBy`[var6.nextInt()]
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

public inline fun BooleanArray.filterIndexed(predicate: (Int, Boolean) -> Boolean): List<Boolean> {
   val `destination$iv`: java.util.Collection = ArrayList()
   val `index$iv$iv`: Int = 0

   for (`item$iv$iv` in `$this$filterIndexed`) {
      if (predicate(`index$iv$iv`++, `item$iv$iv`) as java.lang.Boolean) {
         `destination$iv`.add(`item$iv$iv`)
      }
   }

   return `destination$iv` as MutableList<java.lang.Boolean>
}

@SinceKotlin(version = "1.4")
public inline fun IntArray.reduceRightIndexedOrNull(operation: (Int, Int, Int) -> Int): Int? {
   var index: Int = ArraysKt.getLastIndex(`$this$reduceRightIndexedOrNull`)
   if (index < 0) {
      return null
   } else {
      var accumulator: Int = `$this$reduceRightIndexedOrNull`[index--]

      while (index >= 0) {
         accumulator = (operation(index, `$this$reduceRightIndexedOrNull`[index], accumulator) as java.lang.Number).intValue()
         index--
      }

      return accumulator
   }
}

@SinceKotlin(version = "1.4")
public fun ByteArray.shuffle() {
   ArraysKt.shuffle((byte[])`$this$shuffle`, Random.Default)
}

@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
@InlineOnly
public inline fun ShortArray.maxOf(selector: (Short) -> Double): Double {
   if (`$this$maxOf`.length == 0) {
      throw NoSuchElementException()
   } else {
      var maxValue: Double = (selector(`$this$maxOf`[0]) as java.lang.Number).doubleValue()
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOf`)).iterator()

      while (var4.hasNext()) {
         maxValue = Math.max(maxValue, (selector(`$this$maxOf`[var4.nextInt()]) as java.lang.Number).doubleValue())
      }

      return maxValue
   }
}

public infix fun <R> CharArray.zip(other: Array<out Any>): List<Pair<Char, Any>> {
   val `$this$zip$iv`: CharArray = `$this$zip`
   val `size$iv`: Int = Math.min(`$this$zip`.length, other.length)
   val `list$iv`: ArrayList = ArrayList(`size$iv`)

   repeat(`size$iv`) { `i$iv` ->
      `list$iv`.add(`$this$zip$iv`[`i$iv`] to other[`i$iv`])
   }

   return `list$iv`
}

@InlineOnly
@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
public inline fun <R> CharArray.minOfWith(comparator: Comparator<in Any>, selector: (Char) -> Any): Any {
   if (`$this$minOfWith`.length == 0) {
      throw NoSuchElementException()
   } else {
      var minValue: Any = selector(`$this$minOfWith`[0])
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfWith`)).iterator()

      while (var4.hasNext()) {
         val v: Any = selector(`$this$minOfWith`[var4.nextInt()])
         if (comparator.compare(minValue, v) > 0) {
            minValue = v
         }
      }

      return (R)minValue
   }
}

@OverloadResolutionByLambdaReturnType
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun <T, R> Array<out Any>.maxOfWithOrNull(comparator: Comparator<in Any>, selector: (Any) -> Any): Any? {
   if (`$this$maxOfWithOrNull`.length == 0) {
      return null
   } else {
      var maxValue: Any = selector(`$this$maxOfWithOrNull`[0])
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfWithOrNull`)).iterator()

      while (var4.hasNext()) {
         val v: Any = selector(`$this$maxOfWithOrNull`[var4.nextInt()])
         if (comparator.compare(maxValue, v) < 0) {
            maxValue = v
         }
      }

      return (R)maxValue
   }
}

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun <R> DoubleArray.maxOfWith(comparator: Comparator<in Any>, selector: (Double) -> Any): Any {
   if (`$this$maxOfWith`.length == 0) {
      throw NoSuchElementException()
   } else {
      var maxValue: Any = selector(`$this$maxOfWith`[0])
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfWith`)).iterator()

      while (var4.hasNext()) {
         val v: Any = selector(`$this$maxOfWith`[var4.nextInt()])
         if (comparator.compare(maxValue, v) < 0) {
            maxValue = v
         }
      }

      return (R)maxValue
   }
}

@OverloadResolutionByLambdaReturnType
@JvmName(name = "sumOfInt")
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun ShortArray.sumOf(selector: (Short) -> Int): Int {
   var sum: Int = 0

   for (element in `$this$sumOf`) {
      sum += (selector(element) as java.lang.Number).intValue()
   }

   return sum
}

public infix fun CharArray.intersect(other: Iterable<Char>): Set<Char> {
   val set: java.util.Set = ArraysKt.toMutableSet(`$this$intersect`)
   CollectionsKt.retainAll(set, other)
   return set
}

@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
@JvmName(name = "sumOfLong")
@InlineOnly
public inline fun IntArray.sumOf(selector: (Int) -> Long): Long {
   var sum: Long = 0L

   for (element in `$this$sumOf`) {
      sum += (selector(element) as java.lang.Number).longValue()
   }

   return sum
}

@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
@InlineOnly
public inline fun <R> ByteArray.maxOfWith(comparator: Comparator<in Any>, selector: (Byte) -> Any): Any {
   if (`$this$maxOfWith`.length == 0) {
      throw NoSuchElementException()
   } else {
      var maxValue: Any = selector(`$this$maxOfWith`[0])
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfWith`)).iterator()

      while (var4.hasNext()) {
         val v: Any = selector(`$this$maxOfWith`[var4.nextInt()])
         if (comparator.compare(maxValue, v) < 0) {
            maxValue = v
         }
      }

      return (R)maxValue
   }
}

open fun ArraysKt___ArraysKt() {
}

@InlineOnly
public inline operator fun <T> Array<out Any>.component2(): Any {
   return (T)`$this$component2`[1]
}

@JvmName(name = "sumOfULong")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@InlineOnly
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.5")
public inline fun DoubleArray.sumOf(selector: (Double) -> ULong): ULong {
   var sum: Long = ULong.constructor_impl/* $VF was: constructor-impl */(0L)

   for (element in `$this$sumOf`) {
      sum = ULong.constructor_impl/* $VF was: constructor-impl */(sum + (selector(element) as ULong).unbox_impl/* $VF was: unbox-impl */())
   }

   return sum
}

public fun ShortArray.none(): Boolean {
   return `$this$none`.length == 0
}

@SinceKotlin(version = "1.4")
public fun LongArray.maxWithOrNull(comparator: Comparator<in Long>): Long? {
   if (`$this$maxWithOrNull`.length == 0) {
      return null
   } else {
      var max: Long = `$this$maxWithOrNull`[0]
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxWithOrNull`)).iterator()

      while (var4.hasNext()) {
         val e: Long = `$this$maxWithOrNull`[var4.nextInt()]
         if (comparator.compare(max, e) < 0) {
            max = e
         }
      }

      return max
   }
}

public inline fun DoubleArray.reduceRight(operation: (Double, Double) -> Double): Double {
   var index: Int = ArraysKt.getLastIndex(`$this$reduceRight`)
   if (index < 0) {
      throw UnsupportedOperationException("Empty array can't be reduced.")
   } else {
      var accumulator: Double = `$this$reduceRight`[index--]

      while (index >= 0) {
         accumulator = (operation(`$this$reduceRight`[index--], accumulator) as java.lang.Number).doubleValue()
      }

      return accumulator
   }
}

@InlineOnly
@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
public inline fun FloatArray.maxOf(selector: (Float) -> Float): Float {
   if (`$this$maxOf`.length == 0) {
      throw NoSuchElementException()
   } else {
      var maxValue: Float = (selector(`$this$maxOf`[0]) as java.lang.Number).floatValue()
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOf`)).iterator()

      while (var3.hasNext()) {
         maxValue = Math.max(maxValue, (selector(`$this$maxOf`[var3.nextInt()]) as java.lang.Number).floatValue())
      }

      return maxValue
   }
}

@InlineOnly
@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public inline fun <R> CharArray.scanIndexed(initial: Any, operation: (Int, Any, Char) -> Any): List<Any> {
   val var3: CharArray = `$this$scanIndexed`
   val var10000: java.util.List
   if (`$this$scanIndexed`.length == 0) {
      var10000 = CollectionsKt.listOf(initial)
   } else {
      val var4: ArrayList = ArrayList(`$this$scanIndexed`.length + 1)
      var4.add(initial)
      val var6: ArrayList = var4
      var var8: Any = initial
      var var9: Int = 0

      for (var7 in `$this$scanIndexed`.length..var9) {
         var8 = operation(var9, var8, var3[var9])
         var6.add(var8)
      }

      var10000 = var6
   }

   return var10000
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun FloatArray.onEach(action: (Float) -> Unit): FloatArray {
   for (element in `$this$onEach`) {
      action(element)
   }

   return `$this$onEach`
}

@SinceKotlin(version = "1.4")
public inline fun <R : Comparable<Any>> ByteArray.minByOrNull(selector: (Byte) -> Any): Byte? {
   if (`$this$minByOrNull`.length == 0) {
      return null
   } else {
      var minElem: Byte = `$this$minByOrNull`[0]
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$minByOrNull`)
      if (lastIndex == 0) {
         return minElem
      } else {
         var minValue: java.lang.Comparable = selector(minElem) as java.lang.Comparable
         val var6: IntIterator = IntRange(1, lastIndex).iterator()

         while (var6.hasNext()) {
            val e: Byte = `$this$minByOrNull`[var6.nextInt()]
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
public inline fun ShortArray.getOrElse(index: Int, defaultValue: (Int) -> Short): Short {
   return if (index >= 0 && index <= ArraysKt.getLastIndex(`$this$getOrElse`))
      `$this$getOrElse`[index]
      else
      (defaultValue(index) as java.lang.Number).shortValue()
   }

@InlineOnly
public inline fun LongArray.elementAtOrElse(index: Int, defaultValue: (Int) -> Long): Long {
   return if (index >= 0 && index <= ArraysKt.getLastIndex(`$this$elementAtOrElse`))
      `$this$elementAtOrElse`[index]
      else
      (defaultValue(index) as java.lang.Number).longValue()
   }

@JvmName(name = "maxOrThrow")
@SinceKotlin(version = "1.7")
public fun LongArray.max(): Long {
   if (`$this$max`.length == 0) {
      throw NoSuchElementException()
   } else {
      var max: Long = `$this$max`[0]
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$max`)).iterator()

      while (var3.hasNext()) {
         val e: Long = `$this$max`[var3.nextInt()]
         if (max < e) {
            max = e
         }
      }

      return max
   }
}

public inline fun <R : Comparable<Any>> ShortArray.sortedByDescending(crossinline selector: (Short) -> Any?): List<Short> {
   return ArraysKt.sortedWith((short[])`$this$sortedByDescending`,    // $VF: Compiled from Comparisons.kt
{ a: Any, b: Any ->
      val var3: Function1 = selector
      return ComparisonsKt.compareValues((T)(selector(b) as java.lang.Comparable), (T)(var3(a) as java.lang.Comparable))
   })
}

public fun DoubleArray.single(): Double {
   when (`$this$single`.length) {
      0 -> throw NoSuchElementException("Array is empty.")
      1 -> return `$this$single`[0]
      else -> throw IllegalArgumentException("Array has more than one element.")
   }
}

public fun DoubleArray.distinct(): List<Double> {
   return CollectionsKt.toList(ArraysKt.toMutableSet(`$this$distinct`))
}

@SinceKotlin(version = "1.7")
@JvmName(name = "minWithOrThrow")
public fun IntArray.minWith(comparator: Comparator<in Int>): Int {
   if (`$this$minWith`.length == 0) {
      throw NoSuchElementException()
   } else {
      var min: Int = `$this$minWith`[0]
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minWith`)).iterator()

      while (var3.hasNext()) {
         val e: Int = `$this$minWith`[var3.nextInt()]
         if (comparator.compare(min, e) > 0) {
            min = e
         }
      }

      return min
   }
}

public inline fun <T, C : MutableCollection<in Any>> Array<out Any>.filterTo(destination: Any, predicate: (Any) -> Boolean): Any {
   for (element in `$this$filterTo`) {
      if (predicate(element) as java.lang.Boolean) {
         destination.add(element)
      }
   }

   return (C)destination
}

public fun BooleanArray.lastOrNull(): Boolean? {
   return if (`$this$lastOrNull`.length == 0) null else `$this$lastOrNull`[`$this$lastOrNull`.length - 1]
}

public inline fun <K, M : MutableMap<in Any, MutableList<Boolean>>> BooleanArray.groupByTo(destination: Any, keySelector: (Boolean) -> Any): Any {
   for (element in `$this$groupByTo`) {
      val key: Any = keySelector(element)
      val `value$iv`: Any = destination.get(key)
      val var10000: Any
      if (`value$iv` == null) {
         val var13: java.util.List = ArrayList()
         destination.put(key, var13)
         var10000 = var13
      } else {
         var10000 = `value$iv`
      }

      (var10000 as java.util.List).add(element)
   }

   return (M)destination
}

public fun ShortArray.toHashSet(): HashSet<Short> {
   return ArraysKt.toCollection((short[])`$this$toHashSet`, HashSet<>(MapsKt.mapCapacity(`$this$toHashSet`.length)))
}

@InlineOnly
public inline fun <T> Array<out Any>.getOrElse(index: Int, defaultValue: (Int) -> Any): Any {
   return (T)(if (index >= 0 && index <= ArraysKt.getLastIndex(`$this$getOrElse`)) `$this$getOrElse`[index] else defaultValue(index))
}

@Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = []))
@DeprecatedSinceKotlin(warningSince = "1.5")
public inline fun IntArray.sumBy(selector: (Int) -> Int): Int {
   var sum: Int = 0

   for (element in `$this$sumBy`) {
      sum += (selector(element) as java.lang.Number).intValue()
   }

   return sum
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun <V, M : MutableMap<in Char, in Any>> CharArray.associateWithTo(destination: Any, valueSelector: (Char) -> Any): Any {
   for (element in `$this$associateWithTo`) {
      destination.put(element, valueSelector(element))
   }

   return (M)destination
}

@SinceKotlin(version = "1.4")
public fun LongArray.reverse(fromIndex: Int, toIndex: Int) {
   AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(fromIndex, toIndex, `$this$reverse`.length)
   val midPoint: Int = (fromIndex + toIndex) / 2
   if (fromIndex != (fromIndex + toIndex) / 2) {
      var reverseIndex: Int = toIndex + -1

      for (index in fromIndex..midPoint) {
         val tmp: Long = `$this$reverse`[index]
         `$this$reverse`[index] = `$this$reverse`[reverseIndex]
         `$this$reverse`[reverseIndex] = tmp
         reverseIndex--
      }
   }
}

@InlineOnly
public inline fun ByteArray.find(predicate: (Byte) -> Boolean): Byte? {
   val `$this$firstOrNull$iv`: ByteArray = `$this$find`
   var var4: Int = 0
   val var5: Int = `$this$find`.length

   var var10000: java.lang.Byte
   while (true) {
      if (var4 >= var5) {
         var10000 = null
         break
      }

      val `element$iv`: Byte = `$this$firstOrNull$iv`[var4]
      if (predicate(`$this$firstOrNull$iv`[var4]) as java.lang.Boolean) {
         var10000 = `element$iv`
         break
      }

      var4++
   }

   return var10000
}

public inline fun <K, V, M : MutableMap<in Any, MutableList<Any>>> BooleanArray.groupByTo(
   destination: Any,
   keySelector: (Boolean) -> Any,
   valueTransform: (Boolean) -> Any
): Any {
   for (element in `$this$groupByTo`) {
      val key: Any = keySelector(element)
      val `value$iv`: Any = destination.get(key)
      val var10000: Any
      if (`value$iv` == null) {
         val var14: java.util.List = ArrayList()
         destination.put(key, var14)
         var10000 = var14
      } else {
         var10000 = `value$iv`
      }

      (var10000 as java.util.List).add(valueTransform(element))
   }

   return (M)destination
}

public infix fun <R> LongArray.zip(other: Iterable<Any>): List<Pair<Long, Any>> {
   val `$this$zip$iv`: LongArray = `$this$zip`
   val `arraySize$iv`: Int = `$this$zip`.length
   val `list$iv`: ArrayList = ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(other, 10), `$this$zip`.length))
   var `i$iv`: Int = 0

   for (`element$iv` in other) {
      if (`i$iv` >= `arraySize$iv`) {
         break
      }

      `list$iv`.add(`$this$zip$iv`[`i$iv`++] to `element$iv`)
   }

   return `list$iv`
}

@SinceKotlin(version = "1.4")
public fun DoubleArray.sortDescending(fromIndex: Int, toIndex: Int) {
   ArraysKt.sort(`$this$sortDescending`, fromIndex, toIndex)
   ArraysKt.reverse(`$this$sortDescending`, fromIndex, toIndex)
}

public fun BooleanArray.any(): Boolean {
   return `$this$any`.length != 0
}

@OverloadResolutionByLambdaReturnType
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun <T> Array<out Any>.maxOfOrNull(selector: (Any) -> Float): Float? {
   if (`$this$maxOfOrNull`.length == 0) {
      return null
   } else {
      var maxValue: Float = (selector(`$this$maxOfOrNull`[0]) as java.lang.Number).floatValue()
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfOrNull`)).iterator()

      while (var3.hasNext()) {
         maxValue = Math.max(maxValue, (selector(`$this$maxOfOrNull`[var3.nextInt()]) as java.lang.Number).floatValue())
      }

      return maxValue
   }
}

public inline fun CharArray.none(predicate: (Char) -> Boolean): Boolean {
   for (element in `$this$none`) {
      if (predicate(element) as java.lang.Boolean) {
         return false
      }
   }

   return true
}

public fun ByteArray.indexOf(element: Byte): Int {
   var index: Int = 0

   for (var3 in `$this$indexOf`.length..index) {
      if (element == `$this$indexOf`[index]) {
         return index
      }
   }

   return -1
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun <V> BooleanArray.associateWith(valueSelector: (Boolean) -> Any): Map<Boolean, Any> {
   val result: LinkedHashMap = LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(`$this$associateWith`.length), 16))

   for (var6 in `$this$associateWith`) {
      result.put(var6, valueSelector(var6))
   }

   return result
}

public infix fun ShortArray.zip(other: ShortArray): List<Pair<Short, Short>> {
   val `$this$zip$iv`: ShortArray = `$this$zip`
   val `size$iv`: Int = Math.min(`$this$zip`.length, other.length)
   val `list$iv`: ArrayList = ArrayList(`size$iv`)

   repeat(`size$iv`) { `i$iv` ->
      `list$iv`.add(`$this$zip$iv`[`i$iv`] to other[`i$iv`])
   }

   return `list$iv`
}

public fun ShortArray.first(): Short {
   if (`$this$first`.length == 0) {
      throw NoSuchElementException("Array is empty.")
   } else {
      return `$this$first`[0]
   }
}

@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun FloatArray.random(): Float {
   return ArraysKt.random(`$this$random`, Random.Default)
}

public fun LongArray.dropLast(n: Int): List<Long> {
   if (n < 0) {
      throw IllegalArgumentException(("Requested element count $n is less than zero.").toString())
   } else {
      return ArraysKt.take(`$this$dropLast`, RangesKt.coerceAtLeast(`$this$dropLast`.length - n, 0))
   }
}

public inline fun <K, V> CharArray.associateBy(keySelector: (Char) -> Any, valueTransform: (Char) -> Any): Map<Any, Any> {
   val `destination$iv`: java.util.Map = LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(`$this$associateBy`.length), 16))

   for (`element$iv` in `$this$associateBy`) {
      `destination$iv`.put(keySelector(`element$iv`), valueTransform(`element$iv`))
   }

   return `destination$iv`
}

@DeprecatedSinceKotlin(warningSince = "1.5")
@Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = []))
public inline fun DoubleArray.sumByDouble(selector: (Double) -> Double): Double {
   var sum: Double = 0.0

   for (element in `$this$sumByDouble`) {
      sum += (selector(element) as java.lang.Number).doubleValue()
   }

   return sum
}

public inline fun DoubleArray.dropLastWhile(predicate: (Double) -> Boolean): List<Double> {
   for (index in ArraysKt.getLastIndex(`$this$dropLastWhile`) downTo 0) {
      if (!predicate(`$this$dropLastWhile`[index]) as java.lang.Boolean) {
         return ArraysKt.take(`$this$dropLastWhile`, index + 1)
      }
   }

   return CollectionsKt.emptyList()
}

@JvmName(name = "minOrThrow")
@SinceKotlin(version = "1.7")
public fun ShortArray.min(): Short {
   if (`$this$min`.length == 0) {
      throw NoSuchElementException()
   } else {
      var min: Short = `$this$min`[0]
      val var2: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$min`)).iterator()

      while (var2.hasNext()) {
         val e: Short = `$this$min`[var2.nextInt()]
         if (min > e) {
            min = e
         }
      }

      return min
   }
}

@SinceKotlin(version = "1.4")
public inline fun BooleanArray.reduceRightIndexedOrNull(operation: (Int, Boolean, Boolean) -> Boolean): Boolean? {
   var index: Int = ArraysKt.getLastIndex(`$this$reduceRightIndexedOrNull`)
   if (index < 0) {
      return null
   } else {
      var accumulator: Boolean = `$this$reduceRightIndexedOrNull`[index--]

      while (index >= 0) {
         accumulator = operation(index, `$this$reduceRightIndexedOrNull`[index], accumulator) as java.lang.Boolean
         index--
      }

      return accumulator
   }
}

public inline fun <R, V> CharArray.zip(other: Array<out Any>, transform: (Char, Any) -> Any): List<Any> {
   val size: Int = Math.min(`$this$zip`.length, other.length)
   val list: ArrayList = ArrayList(size)

   repeat(size) { i ->
      list.add(transform(`$this$zip`[i], other[i]))
   }

   return list
}

public fun ByteArray.first(): Byte {
   if (`$this$first`.length == 0) {
      throw NoSuchElementException("Array is empty.")
   } else {
      return `$this$first`[0]
   }
}

@SinceKotlin(version = "1.4")
public inline fun <R : Comparable<Any>> FloatArray.maxByOrNull(selector: (Float) -> Any): Float? {
   if (`$this$maxByOrNull`.length == 0) {
      return null
   } else {
      var maxElem: Float = `$this$maxByOrNull`[0]
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$maxByOrNull`)
      if (lastIndex == 0) {
         return maxElem
      } else {
         var maxValue: java.lang.Comparable = selector(maxElem) as java.lang.Comparable
         val var6: IntIterator = IntRange(1, lastIndex).iterator()

         while (var6.hasNext()) {
            val e: Float = `$this$maxByOrNull`[var6.nextInt()]
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

public operator fun IntArray.contains(element: Int): Boolean {
   return ArraysKt.indexOf(`$this$contains`, element) >= 0
}

public final val indices: IntRange
   public final get() {
      return IntRange(0, ArraysKt.getLastIndex(`$this$indices`))
   }


public inline fun <R, C : MutableCollection<in Any>> CharArray.mapTo(destination: Any, transform: (Char) -> Any): Any {
   for (item in `$this$mapTo`) {
      destination.add(transform(item))
   }

   return (C)destination
}

public fun IntArray.asIterable(): Iterable<Int> {
   return if (`$this$asIterable`.length == 0) CollectionsKt.emptyList() else ArraysKt___ArraysKt$asIterable$$inlined$Iterable$4(`$this$asIterable`)
}

public fun BooleanArray.take(n: Int): List<Boolean> {
   if (n < 0) {
      throw IllegalArgumentException(("Requested element count $n is less than zero.").toString())
   } else if (n == 0) {
      return CollectionsKt.emptyList()
   } else if (n >= `$this$take`.length) {
      return ArraysKt.toList(`$this$take`)
   } else if (n == 1) {
      return CollectionsKt.listOf(`$this$take`[0])
   } else {
      val var7: Int = 0
      val list: ArrayList = ArrayList(n)

      for (item in `$this$take`) {
         list.add(item)
         if (++var7 == n) {
            break
         }
      }

      return list
   }
}

@SinceKotlin(version = "1.4")
public fun FloatArray.minOrNull(): Float? {
   if (`$this$minOrNull`.length == 0) {
      return null
   } else {
      var min: Float = `$this$minOrNull`[0]
      val var2: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOrNull`)).iterator()

      while (var2.hasNext()) {
         min = Math.min(min, `$this$minOrNull`[var2.nextInt()])
      }

      return min
   }
}

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun CharArray.maxOfOrNull(selector: (Char) -> Double): Double? {
   if (`$this$maxOfOrNull`.length == 0) {
      return null
   } else {
      var maxValue: Double = (selector(`$this$maxOfOrNull`[0]) as java.lang.Number).doubleValue()
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfOrNull`)).iterator()

      while (var4.hasNext()) {
         maxValue = Math.max(maxValue, (selector(`$this$maxOfOrNull`[var4.nextInt()]) as java.lang.Number).doubleValue())
      }

      return maxValue
   }
}

public inline fun ByteArray.indexOfFirst(predicate: (Byte) -> Boolean): Int {
   var index: Int = 0

   for (var4 in `$this$indexOfFirst`.length..index) {
      if (predicate(`$this$indexOfFirst`[index]) as java.lang.Boolean) {
         return index
      }
   }

   return -1
}

public fun ShortArray.sortedArrayDescending(): ShortArray {
   if (`$this$sortedArrayDescending`.length == 0) {
      return `$this$sortedArrayDescending`
   } else {
      val var10000: ShortArray = Arrays.copyOf(`$this$sortedArrayDescending`, `$this$sortedArrayDescending`.length)
      ArraysKt.sortDescending(var10000)
      return var10000
   }
}

public infix fun ShortArray.intersect(other: Iterable<Short>): Set<Short> {
   val set: java.util.Set = ArraysKt.toMutableSet(`$this$intersect`)
   CollectionsKt.retainAll(set, other)
   return set
}

@SinceKotlin(version = "1.4")
public fun DoubleArray.reverse(fromIndex: Int, toIndex: Int) {
   AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(fromIndex, toIndex, `$this$reverse`.length)
   val midPoint: Int = (fromIndex + toIndex) / 2
   if (fromIndex != (fromIndex + toIndex) / 2) {
      var reverseIndex: Int = toIndex + -1

      for (index in fromIndex..midPoint) {
         val tmp: Double = `$this$reverse`[index]
         `$this$reverse`[index] = `$this$reverse`[reverseIndex]
         `$this$reverse`[reverseIndex] = tmp
         reverseIndex--
      }
   }
}

@InlineOnly
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
public inline fun <R> LongArray.minOfWith(comparator: Comparator<in Any>, selector: (Long) -> Any): Any {
   if (`$this$minOfWith`.length == 0) {
      throw NoSuchElementException()
   } else {
      var minValue: Any = selector(`$this$minOfWith`[0])
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfWith`)).iterator()

      while (var4.hasNext()) {
         val v: Any = selector(`$this$minOfWith`[var4.nextInt()])
         if (comparator.compare(minValue, v) > 0) {
            minValue = v
         }
      }

      return (R)minValue
   }
}

public fun LongArray.firstOrNull(): Long? {
   return if (`$this$firstOrNull`.length == 0) null else `$this$firstOrNull`[0]
}

public fun ShortArray.asSequence(): Sequence<Short> {
   return if (`$this$asSequence`.length == 0) SequencesKt.emptySequence() else ArraysKt___ArraysKt$asSequence$$inlined$Sequence$3(`$this$asSequence`)
}

@SinceKotlin(version = "1.4")
public fun ByteArray.minWithOrNull(comparator: Comparator<in Byte>): Byte? {
   if (`$this$minWithOrNull`.length == 0) {
      return null
   } else {
      var min: Byte = `$this$minWithOrNull`[0]
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minWithOrNull`)).iterator()

      while (var3.hasNext()) {
         val e: Byte = `$this$minWithOrNull`[var3.nextInt()]
         if (comparator.compare(min, e) > 0) {
            min = e
         }
      }

      return min
   }
}

public inline fun LongArray.dropWhile(predicate: (Long) -> Boolean): List<Long> {
   var yielding: Boolean = false
   val list: ArrayList = ArrayList()

   for (item in `$this$dropWhile`) {
      if (yielding) {
         list.add(item)
      } else if (!predicate(item) as java.lang.Boolean) {
         list.add(item)
         yielding = true
      }
   }

   return list
}

@OverloadResolutionByLambdaReturnType
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun DoubleArray.maxOf(selector: (Double) -> Double): Double {
   if (`$this$maxOf`.length == 0) {
      throw NoSuchElementException()
   } else {
      var maxValue: Double = (selector(`$this$maxOf`[0]) as java.lang.Number).doubleValue()
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOf`)).iterator()

      while (var4.hasNext()) {
         maxValue = Math.max(maxValue, (selector(`$this$maxOf`[var4.nextInt()]) as java.lang.Number).doubleValue())
      }

      return maxValue
   }
}

public fun BooleanArray.last(): Boolean {
   if (`$this$last`.length == 0) {
      throw NoSuchElementException("Array is empty.")
   } else {
      return `$this$last`[ArraysKt.getLastIndex(`$this$last`)]
   }
}

public fun <T> Array<Any>.sliceArray(indices: IntRange): Array<Any> {
   return (T[])(if (indices.isEmpty())
      ArraysKt.copyOfRange(`$this$sliceArray`, 0, 0)
      else
      ArraysKt.copyOfRange((Object[])`$this$sliceArray`, indices.start, indices.endInclusive + 1))
}

@InlineOnly
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
public inline fun <R : Comparable<Any>> IntArray.maxOfOrNull(selector: (Int) -> Any): Any? {
   if (`$this$maxOfOrNull`.length == 0) {
      return null
   } else {
      var maxValue: java.lang.Comparable = selector(`$this$maxOfOrNull`[0]) as java.lang.Comparable
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfOrNull`)).iterator()

      while (var3.hasNext()) {
         val v: java.lang.Comparable = selector(`$this$maxOfOrNull`[var3.nextInt()]) as java.lang.Comparable
         if (maxValue.compareTo(v) < 0) {
            maxValue = v
         }
      }

      return (R)maxValue
   }
}

public inline fun <R : Comparable<Any>> IntArray.sortedBy(crossinline selector: (Int) -> Any?): List<Int> {
   return ArraysKt.sortedWith((int[])`$this$sortedBy`,    // $VF: Compiled from Comparisons.kt
{ a: Any, b: Any ->
      val var3: Function1 = selector
      return ComparisonsKt.compareValues((T)(selector(a) as java.lang.Comparable), (T)(var3(b) as java.lang.Comparable))
   })
}

public fun IntArray.firstOrNull(): Int? {
   return if (`$this$firstOrNull`.length == 0) null else `$this$firstOrNull`[0]
}

public inline fun <R : Comparable<Any>> CharArray.sortedByDescending(crossinline selector: (Char) -> Any?): List<Char> {
   return ArraysKt.sortedWith((char[])`$this$sortedByDescending`,    // $VF: Compiled from Comparisons.kt
{ a: Any, b: Any ->
      val var3: Function1 = selector
      return ComparisonsKt.compareValues((T)(selector(b) as java.lang.Comparable), (T)(var3(a) as java.lang.Comparable))
   })
}

public inline fun IntArray.reduceRight(operation: (Int, Int) -> Int): Int {
   var index: Int = ArraysKt.getLastIndex(`$this$reduceRight`)
   if (index < 0) {
      throw UnsupportedOperationException("Empty array can't be reduced.")
   } else {
      var accumulator: Int = `$this$reduceRight`[index--]

      while (index >= 0) {
         accumulator = (operation(`$this$reduceRight`[index--], accumulator) as java.lang.Number).intValue()
      }

      return accumulator
   }
}

public fun <C : MutableCollection<in Char>> CharArray.toCollection(destination: Any): Any {
   for (item in `$this$toCollection`) {
      destination.add(item)
   }

   return (C)destination
}

public inline fun <S, T : Any> Array<out Any>.reduce(operation: (Any, Any) -> Any): Any {
   if (`$this$reduce`.length == 0) {
      throw UnsupportedOperationException("Empty array can't be reduced.")
   } else {
      var accumulator: Any = `$this$reduce`[0]
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$reduce`)).iterator()

      while (var4.hasNext()) {
         accumulator = operation(accumulator, `$this$reduce`[var4.nextInt()])
      }

      return (S)accumulator
   }
}

public fun IntArray.sum(): Int {
   var sum: Int = 0

   for (element in `$this$sum`) {
      sum += element
   }

   return sum
}

public infix fun <R> CharArray.zip(other: Iterable<Any>): List<Pair<Char, Any>> {
   val `$this$zip$iv`: CharArray = `$this$zip`
   val `arraySize$iv`: Int = `$this$zip`.length
   val `list$iv`: ArrayList = ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(other, 10), `$this$zip`.length))
   var `i$iv`: Int = 0

   for (`element$iv` in other) {
      if (`i$iv` >= `arraySize$iv`) {
         break
      }

      `list$iv`.add(`$this$zip$iv`[`i$iv`++] to `element$iv`)
   }

   return `list$iv`
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun <R> ByteArray.runningFoldIndexed(initial: Any, operation: (Int, Any, Byte) -> Any): List<Any> {
   if (`$this$runningFoldIndexed`.length == 0) {
      return (java.util.List<R>)CollectionsKt.listOf(initial)
   } else {
      var accumulator: Any = ArrayList(`$this$runningFoldIndexed`.length + 1)
      accumulator.add(initial)
      val result: Any = accumulator
      accumulator = initial
      var var8: Int = 0

      for (var9 in `$this$runningFoldIndexed`.length..var8) {
         accumulator = operation(var8, accumulator, `$this$runningFoldIndexed`[var8])
         result.add(accumulator)
      }

      return result as MutableList<R>
   }
}

@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun <T> Array<out Any>.onEach(action: (Any) -> Unit): Array<out Any> {
   for (element in `$this$onEach`) {
      action(element)
   }

   return (T[])`$this$onEach`
}

public inline fun <K, V, M : MutableMap<in Any, MutableList<Any>>> CharArray.groupByTo(
   destination: Any,
   keySelector: (Char) -> Any,
   valueTransform: (Char) -> Any
): Any {
   for (element in `$this$groupByTo`) {
      val key: Any = keySelector(element)
      val `value$iv`: Any = destination.get(key)
      val var10000: Any
      if (`value$iv` == null) {
         val var14: java.util.List = ArrayList()
         destination.put(key, var14)
         var10000 = var14
      } else {
         var10000 = `value$iv`
      }

      (var10000 as java.util.List).add(valueTransform(element))
   }

   return (M)destination
}

public inline fun BooleanArray.filterNot(predicate: (Boolean) -> Boolean): List<Boolean> {
   val `destination$iv`: java.util.Collection = ArrayList()

   for (`element$iv` in `$this$filterNot`) {
      if (!predicate(`element$iv`) as java.lang.Boolean) {
         `destination$iv`.add(`element$iv`)
      }
   }

   return `destination$iv` as MutableList<java.lang.Boolean>
}

@JvmName(name = "maxWithOrThrow")
@SinceKotlin(version = "1.7")
public fun CharArray.maxWith(comparator: Comparator<in Char>): Char {
   if (`$this$maxWith`.length == 0) {
      throw NoSuchElementException()
   } else {
      var max: Char = `$this$maxWith`[0]
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxWith`)).iterator()

      while (var3.hasNext()) {
         val e: Char = `$this$maxWith`[var3.nextInt()]
         if (comparator.compare(max, e) < 0) {
            max = e
         }
      }

      return max
   }
}

@InlineOnly
@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
public inline fun DoubleArray.minOfOrNull(selector: (Double) -> Float): Float? {
   if (`$this$minOfOrNull`.length == 0) {
      return null
   } else {
      var minValue: Float = (selector(`$this$minOfOrNull`[0]) as java.lang.Number).floatValue()
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfOrNull`)).iterator()

      while (var3.hasNext()) {
         minValue = Math.min(minValue, (selector(`$this$minOfOrNull`[var3.nextInt()]) as java.lang.Number).floatValue())
      }

      return minValue
   }
}

@InlineOnly
public inline operator fun DoubleArray.component5(): Double {
   return `$this$component5`[4]
}

public fun CharArray.slice(indices: Iterable<Int>): List<Char> {
   val size: Int = CollectionsKt.collectionSizeOrDefault(indices, 10)
   if (size == 0) {
      return CollectionsKt.emptyList()
   } else {
      val list: ArrayList = ArrayList(size)
      val var4: java.util.Iterator = indices.iterator()

      while (var4.hasNext()) {
         list.add(`$this$slice`[(var4.next() as java.lang.Number).intValue()])
      }

      return list
   }
}

@Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = []))
@DeprecatedSinceKotlin(warningSince = "1.5")
public inline fun ShortArray.sumByDouble(selector: (Short) -> Double): Double {
   var sum: Double = 0.0

   for (element in `$this$sumByDouble`) {
      sum += (selector(element) as java.lang.Number).doubleValue()
   }

   return sum
}

public fun <C : MutableCollection<in Float>> FloatArray.toCollection(destination: Any): Any {
   for (item in `$this$toCollection`) {
      destination.add(item)
   }

   return (C)destination
}

public fun IntArray.getOrNull(index: Int): Int? {
   return if (index >= 0 && index <= ArraysKt.getLastIndex(`$this$getOrNull`)) `$this$getOrNull`[index] else null
}

@OverloadResolutionByLambdaReturnType
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@SinceKotlin(version = "1.5")
@InlineOnly
@JvmName(name = "sumOfULong")
public inline fun ByteArray.sumOf(selector: (Byte) -> ULong): ULong {
   var sum: Long = ULong.constructor_impl/* $VF was: constructor-impl */(0L)

   for (element in `$this$sumOf`) {
      sum = ULong.constructor_impl/* $VF was: constructor-impl */(sum + (selector(element) as ULong).unbox_impl/* $VF was: unbox-impl */())
   }

   return sum
}

@SinceKotlin(version = "1.7")
@JvmName(name = "maxByOrThrow")
public inline fun <R : Comparable<Any>> BooleanArray.maxBy(selector: (Boolean) -> Any): Boolean {
   if (`$this$maxBy`.length == 0) {
      throw NoSuchElementException()
   } else {
      var maxElem: Boolean = `$this$maxBy`[0]
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$maxBy`)
      if (lastIndex == 0) {
         return maxElem
      } else {
         var maxValue: java.lang.Comparable = selector(maxElem) as java.lang.Comparable
         val var6: IntIterator = IntRange(1, lastIndex).iterator()

         while (var6.hasNext()) {
            val e: Boolean = `$this$maxBy`[var6.nextInt()]
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
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@InlineOnly
public inline fun <R> ShortArray.scanIndexed(initial: Any, operation: (Int, Any, Short) -> Any): List<Any> {
   val var3: ShortArray = `$this$scanIndexed`
   val var10000: java.util.List
   if (`$this$scanIndexed`.length == 0) {
      var10000 = CollectionsKt.listOf(initial)
   } else {
      val var4: ArrayList = ArrayList(`$this$scanIndexed`.length + 1)
      var4.add(initial)
      val var6: ArrayList = var4
      var var8: Any = initial
      var var9: Int = 0

      for (var7 in `$this$scanIndexed`.length..var9) {
         var8 = operation(var9, var8, var3[var9])
         var6.add(var8)
      }

      var10000 = var6
   }

   return var10000
}

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun <T, R : Comparable<Any>> Array<out Any>.minOfOrNull(selector: (Any) -> Any): Any? {
   if (`$this$minOfOrNull`.length == 0) {
      return null
   } else {
      var minValue: java.lang.Comparable = selector(`$this$minOfOrNull`[0]) as java.lang.Comparable
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfOrNull`)).iterator()

      while (var3.hasNext()) {
         val v: java.lang.Comparable = selector(`$this$minOfOrNull`[var3.nextInt()]) as java.lang.Comparable
         if (minValue.compareTo(v) > 0) {
            minValue = v
         }
      }

      return (R)minValue
   }
}

public inline fun <T> Array<out Any>.none(predicate: (Any) -> Boolean): Boolean {
   for (element in `$this$none`) {
      if (predicate(element) as java.lang.Boolean) {
         return false
      }
   }

   return true
}

@Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = []))
@DeprecatedSinceKotlin(warningSince = "1.5")
public inline fun ShortArray.sumBy(selector: (Short) -> Int): Int {
   var sum: Int = 0

   for (element in `$this$sumBy`) {
      sum += (selector(element) as java.lang.Number).intValue()
   }

   return sum
}

public inline fun FloatArray.dropLastWhile(predicate: (Float) -> Boolean): List<Float> {
   for (index in ArraysKt.getLastIndex(`$this$dropLastWhile`) downTo 0) {
      if (!predicate(`$this$dropLastWhile`[index]) as java.lang.Boolean) {
         return ArraysKt.take(`$this$dropLastWhile`, index + 1)
      }
   }

   return CollectionsKt.emptyList()
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun <R> IntArray.scanIndexed(initial: Any, operation: (Int, Any, Int) -> Any): List<Any> {
   val var3: IntArray = `$this$scanIndexed`
   val var10000: java.util.List
   if (`$this$scanIndexed`.length == 0) {
      var10000 = CollectionsKt.listOf(initial)
   } else {
      val var4: ArrayList = ArrayList(`$this$scanIndexed`.length + 1)
      var4.add(initial)
      val var6: ArrayList = var4
      var var8: Any = initial
      var var9: Int = 0

      for (var7 in `$this$scanIndexed`.length..var9) {
         var8 = operation(var9, var8, var3[var9])
         var6.add(var8)
      }

      var10000 = var6
   }

   return var10000
}

public fun <T> Array<out Any>.withIndex(): Iterable<IndexedValue<Any>> {
   return IndexingIterable(   // $VF: Compiled from _Arrays.kt
{
      return ArrayIteratorKt.iterator((T[])$this$withIndex)
   } as Function0)
}

public inline fun <K, V, M : MutableMap<in Any, in Any>> DoubleArray.associateByTo(
   destination: Any,
   keySelector: (Double) -> Any,
   valueTransform: (Double) -> Any
): Any {
   for (element in `$this$associateByTo`) {
      destination.put(keySelector(element), valueTransform(element))
   }

   return (M)destination
}

@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun DoubleArray.onEach(action: (Double) -> Unit): DoubleArray {
   for (element in `$this$onEach`) {
      action(element)
   }

   return `$this$onEach`
}

public inline fun <C : MutableCollection<in Short>> ShortArray.filterNotTo(destination: Any, predicate: (Short) -> Boolean): Any {
   for (element in `$this$filterNotTo`) {
      if (!predicate(element) as java.lang.Boolean) {
         destination.add(element)
      }
   }

   return (C)destination
}

public final val indices: IntRange
   public final get() {
      return IntRange(0, ArraysKt.getLastIndex(`$this$indices`))
   }


public inline fun ShortArray.indexOfLast(predicate: (Short) -> Boolean): Int {
   var var3: Int = `$this$indexOfLast`.length + -1
   if (0 <= `$this$indexOfLast`.length + -1) {
      do {
         val index: Int = var3--
         if (predicate(`$this$indexOfLast`[index]) as java.lang.Boolean) {
            return index
         }
      } while (0 <= var3)
   }

   return -1
}

public fun CharArray.reversed(): List<Char> {
   if (`$this$reversed`.length == 0) {
      return CollectionsKt.emptyList()
   } else {
      val list: java.util.List = ArraysKt.toMutableList(`$this$reversed`)
      CollectionsKt.reverse(list)
      return list
   }
}

public fun FloatArray.sortedArray(): FloatArray {
   if (`$this$sortedArray`.length == 0) {
      return `$this$sortedArray`
   } else {
      val var10000: FloatArray = Arrays.copyOf(`$this$sortedArray`, `$this$sortedArray`.length)
      ArraysKt.sort(var10000)
      return var10000
   }
}

public fun ByteArray.any(): Boolean {
   return `$this$any`.length != 0
}

public final val lastIndex: Int
   public final get() {
      return `$this$lastIndex`.length - 1
   }


@InlineOnly
@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
public inline fun <R> BooleanArray.maxOfWithOrNull(comparator: Comparator<in Any>, selector: (Boolean) -> Any): Any? {
   if (`$this$maxOfWithOrNull`.length == 0) {
      return null
   } else {
      var maxValue: Any = selector(`$this$maxOfWithOrNull`[0])
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfWithOrNull`)).iterator()

      while (var4.hasNext()) {
         val v: Any = selector(`$this$maxOfWithOrNull`[var4.nextInt()])
         if (comparator.compare(maxValue, v) < 0) {
            maxValue = v
         }
      }

      return (R)maxValue
   }
}

@JvmName(name = "minOrThrow")
@SinceKotlin(version = "1.7")
public fun ByteArray.min(): Byte {
   if (`$this$min`.length == 0) {
      throw NoSuchElementException()
   } else {
      var min: Byte = `$this$min`[0]
      val var2: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$min`)).iterator()

      while (var2.hasNext()) {
         val e: Byte = `$this$min`[var2.nextInt()]
         if (min > e) {
            min = e
         }
      }

      return min
   }
}

@JvmName(name = "flatMapIndexedIterableTo")
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun <R, C : MutableCollection<in Any>> DoubleArray.flatMapIndexedTo(destination: Any, transform: (Int, Double) -> Iterable<Any>): Any {
   var index: Int = 0

   for (element in `$this$flatMapIndexedTo`) {
      CollectionsKt.addAll(destination, transform(index++, element) as java.lang.Iterable)
   }

   return (C)destination
}

public inline fun LongArray.partition(predicate: (Long) -> Boolean): Pair<List<Long>, List<Long>> {
   val first: ArrayList = ArrayList()
   val second: ArrayList = ArrayList()

   for (element in `$this$partition`) {
      if (predicate(element) as java.lang.Boolean) {
         first.add(element)
      } else {
         second.add(element)
      }
   }

   return Pair<>(first, second)
}

public fun ShortArray.sortedDescending(): List<Short> {
   val var10000: ShortArray = Arrays.copyOf(`$this$sortedDescending`, `$this$sortedDescending`.length)
   ArraysKt.sort(var10000)
   return ArraysKt.reversed(var10000)
}

@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun <V> IntArray.associateWith(valueSelector: (Int) -> Any): Map<Int, Any> {
   val result: LinkedHashMap = LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(`$this$associateWith`.length), 16))

   for (var6 in `$this$associateWith`) {
      result.put(var6, valueSelector(var6))
   }

   return result
}

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun <R : Comparable<Any>> BooleanArray.minOfOrNull(selector: (Boolean) -> Any): Any? {
   if (`$this$minOfOrNull`.length == 0) {
      return null
   } else {
      var minValue: java.lang.Comparable = selector(`$this$minOfOrNull`[0]) as java.lang.Comparable
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfOrNull`)).iterator()

      while (var3.hasNext()) {
         val v: java.lang.Comparable = selector(`$this$minOfOrNull`[var3.nextInt()]) as java.lang.Comparable
         if (minValue.compareTo(v) > 0) {
            minValue = v
         }
      }

      return (R)minValue
   }
}

@InlineOnly
public inline operator fun LongArray.component3(): Long {
   return `$this$component3`[2]
}

public inline fun <C : MutableCollection<in Long>> LongArray.filterNotTo(destination: Any, predicate: (Long) -> Boolean): Any {
   for (element in `$this$filterNotTo`) {
      if (!predicate(element) as java.lang.Boolean) {
         destination.add(element)
      }
   }

   return (C)destination
}

public inline fun <R, V> DoubleArray.zip(other: Iterable<Any>, transform: (Double, Any) -> Any): List<Any> {
   val arraySize: Int = `$this$zip`.length
   val list: ArrayList = ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(other, 10), `$this$zip`.length))
   var i: Int = 0

   for (element in other) {
      if (i >= arraySize) {
         break
      }

      list.add(transform(`$this$zip`[i++], element))
   }

   return list
}

public inline fun <R, C : MutableCollection<in Any>> LongArray.flatMapTo(destination: Any, transform: (Long) -> Iterable<Any>): Any {
   for (element in `$this$flatMapTo`) {
      CollectionsKt.addAll(destination, transform(element) as java.lang.Iterable)
   }

   return (C)destination
}

public fun CharArray.sortedArray(): CharArray {
   if (`$this$sortedArray`.length == 0) {
      return `$this$sortedArray`
   } else {
      val var10000: CharArray = Arrays.copyOf(`$this$sortedArray`, `$this$sortedArray`.length)
      ArraysKt.sort(var10000)
      return var10000
   }
}

@InlineOnly
public inline fun BooleanArray.getOrElse(index: Int, defaultValue: (Int) -> Boolean): Boolean {
   return if (index >= 0 && index <= ArraysKt.getLastIndex(`$this$getOrElse`)) `$this$getOrElse`[index] else defaultValue(index) as java.lang.Boolean
}

public fun <T> Array<out Any>.firstOrNull(): Any? {
   return (T)(if (`$this$firstOrNull`.length == 0) null else `$this$firstOrNull`[0])
}

public inline fun ByteArray.count(predicate: (Byte) -> Boolean): Int {
   var count: Int = 0

   for (element in `$this$count`) {
      if (predicate(element) as java.lang.Boolean) {
         count++
      }
   }

   return count
}

public inline fun <T, K, V, M : MutableMap<in Any, in Any>> Array<out Any>.associateTo(destination: Any, transform: (Any) -> Pair<Any, Any>): Any {
   for (element in `$this$associateTo`) {
      val var8: Pair = transform(element) as Pair
      destination.put(var8.first, var8.second)
   }

   return (M)destination
}

@InlineOnly
@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
public inline fun <R : Comparable<Any>> FloatArray.maxOfOrNull(selector: (Float) -> Any): Any? {
   if (`$this$maxOfOrNull`.length == 0) {
      return null
   } else {
      var maxValue: java.lang.Comparable = selector(`$this$maxOfOrNull`[0]) as java.lang.Comparable
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfOrNull`)).iterator()

      while (var3.hasNext()) {
         val v: java.lang.Comparable = selector(`$this$maxOfOrNull`[var3.nextInt()]) as java.lang.Comparable
         if (maxValue.compareTo(v) < 0) {
            maxValue = v
         }
      }

      return (R)maxValue
   }
}

public inline fun LongArray.dropLastWhile(predicate: (Long) -> Boolean): List<Long> {
   for (index in ArraysKt.getLastIndex(`$this$dropLastWhile`) downTo 0) {
      if (!predicate(`$this$dropLastWhile`[index]) as java.lang.Boolean) {
         return ArraysKt.take(`$this$dropLastWhile`, index + 1)
      }
   }

   return CollectionsKt.emptyList()
}

public fun ShortArray.sortedArray(): ShortArray {
   if (`$this$sortedArray`.length == 0) {
      return `$this$sortedArray`
   } else {
      val var10000: ShortArray = Arrays.copyOf(`$this$sortedArray`, `$this$sortedArray`.length)
      ArraysKt.sort(var10000)
      return var10000
   }
}

public fun CharArray.singleOrNull(): Char? {
   return if (`$this$singleOrNull`.length == 1) `$this$singleOrNull`[0] else null
}

public inline fun <K> IntArray.associateBy(keySelector: (Int) -> Any): Map<Any, Int> {
   val `destination$iv`: java.util.Map = LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(`$this$associateBy`.length), 16))

   for (`element$iv` in `$this$associateBy`) {
      `destination$iv`.put(keySelector(`element$iv`), `element$iv`)
   }

   return `destination$iv`
}

public fun FloatArray.last(): Float {
   if (`$this$last`.length == 0) {
      throw NoSuchElementException("Array is empty.")
   } else {
      return `$this$last`[ArraysKt.getLastIndex(`$this$last`)]
   }
}

public inline fun FloatArray.forEachIndexed(action: (Int, Float) -> Unit) {
   var index: Int = 0

   for (item in `$this$forEachIndexed`) {
      action(index++, item)
   }
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun <V> FloatArray.associateWith(valueSelector: (Float) -> Any): Map<Float, Any> {
   val result: LinkedHashMap = LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(`$this$associateWith`.length), 16))

   for (var6 in `$this$associateWith`) {
      result.put(var6, valueSelector(var6))
   }

   return result
}

@InlineOnly
public inline fun ByteArray.elementAtOrNull(index: Int): Byte? {
   return ArraysKt.getOrNull((byte[])`$this$elementAtOrNull`, index)
}

public fun LongArray.toList(): List<Long> {
   var var10000: java.util.List
   when (`$this$toList`.length) {
      0 -> var10000 = CollectionsKt.emptyList()
      1 -> var10000 = CollectionsKt.listOf(`$this$toList`[0])
      else -> var10000 = ArraysKt.toMutableList(`$this$toList`)
   }

   return var10000
}

public infix fun FloatArray.zip(other: FloatArray): List<Pair<Float, Float>> {
   val `$this$zip$iv`: FloatArray = `$this$zip`
   val `size$iv`: Int = Math.min(`$this$zip`.length, other.length)
   val `list$iv`: ArrayList = ArrayList(`size$iv`)

   repeat(`size$iv`) { `i$iv` ->
      `list$iv`.add(`$this$zip$iv`[`i$iv`] to other[`i$iv`])
   }

   return `list$iv`
}

public fun <C : MutableCollection<in Double>> DoubleArray.toCollection(destination: Any): Any {
   for (item in `$this$toCollection`) {
      destination.add(item)
   }

   return (C)destination
}

@JvmName(name = "maxByOrThrow")
@SinceKotlin(version = "1.7")
public inline fun <R : Comparable<Any>> CharArray.maxBy(selector: (Char) -> Any): Char {
   if (`$this$maxBy`.length == 0) {
      throw NoSuchElementException()
   } else {
      var maxElem: Char = `$this$maxBy`[0]
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$maxBy`)
      if (lastIndex == 0) {
         return maxElem
      } else {
         var maxValue: java.lang.Comparable = selector(maxElem) as java.lang.Comparable
         val var6: IntIterator = IntRange(1, lastIndex).iterator()

         while (var6.hasNext()) {
            val e: Char = `$this$maxBy`[var6.nextInt()]
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

public inline fun <K, M : MutableMap<in Any, in Double>> DoubleArray.associateByTo(destination: Any, keySelector: (Double) -> Any): Any {
   for (element in `$this$associateByTo`) {
      destination.put(keySelector(element), element)
   }

   return (M)destination
}

public inline fun <R> IntArray.fold(initial: Any, operation: (Any, Int) -> Any): Any {
   var accumulator: Any = initial

   for (element in `$this$fold`) {
      accumulator = operation(accumulator, element)
   }

   return (R)accumulator
}

@InlineOnly
@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public inline fun ByteArray.randomOrNull(): Byte? {
   return ArraysKt.randomOrNull((byte[])`$this$randomOrNull`, Random.Default)
}

public fun IntArray.last(): Int {
   if (`$this$last`.length == 0) {
      throw NoSuchElementException("Array is empty.")
   } else {
      return `$this$last`[ArraysKt.getLastIndex(`$this$last`)]
   }
}

@SinceKotlin(version = "1.4")
public fun <T> Array<Any>.shuffle() {
   ArraysKt.shuffle((Object[])`$this$shuffle`, Random.Default)
}

@SinceKotlin(version = "1.4")
public inline fun <R : Comparable<Any>> BooleanArray.maxByOrNull(selector: (Boolean) -> Any): Boolean? {
   if (`$this$maxByOrNull`.length == 0) {
      return null
   } else {
      var maxElem: Boolean = `$this$maxByOrNull`[0]
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$maxByOrNull`)
      if (lastIndex == 0) {
         return maxElem
      } else {
         var maxValue: java.lang.Comparable = selector(maxElem) as java.lang.Comparable
         val var6: IntIterator = IntRange(1, lastIndex).iterator()

         while (var6.hasNext()) {
            val e: Boolean = `$this$maxByOrNull`[var6.nextInt()]
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

public inline fun IntArray.filterNot(predicate: (Int) -> Boolean): List<Int> {
   val `destination$iv`: java.util.Collection = ArrayList()

   for (`element$iv` in `$this$filterNot`) {
      if (!predicate(`element$iv`) as java.lang.Boolean) {
         `destination$iv`.add(`element$iv`)
      }
   }

   return `destination$iv` as MutableList<Int>
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun CharArray.runningReduceIndexed(operation: (Int, Char, Char) -> Char): List<Char> {
   if (`$this$runningReduceIndexed`.length == 0) {
      return CollectionsKt.emptyList()
   } else {
      var var7: Char = `$this$runningReduceIndexed`[0]
      val index: ArrayList = ArrayList(`$this$runningReduceIndexed`.length)
      index.add(var7)
      val result: ArrayList = index
      var var8: Int = 1

      for (var9 in `$this$runningReduceIndexed`.length..var8) {
         var7 = operation(var8, var7, `$this$runningReduceIndexed`[var8]) as Character
         result.add(var7)
      }

      return result
   }
}

@OverloadResolutionByLambdaReturnType
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun <R : Comparable<Any>> ShortArray.maxOfOrNull(selector: (Short) -> Any): Any? {
   if (`$this$maxOfOrNull`.length == 0) {
      return null
   } else {
      var maxValue: java.lang.Comparable = selector(`$this$maxOfOrNull`[0]) as java.lang.Comparable
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfOrNull`)).iterator()

      while (var3.hasNext()) {
         val v: java.lang.Comparable = selector(`$this$maxOfOrNull`[var3.nextInt()]) as java.lang.Comparable
         if (maxValue.compareTo(v) < 0) {
            maxValue = v
         }
      }

      return (R)maxValue
   }
}

@OverloadResolutionByLambdaReturnType
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun IntArray.minOfOrNull(selector: (Int) -> Float): Float? {
   if (`$this$minOfOrNull`.length == 0) {
      return null
   } else {
      var minValue: Float = (selector(`$this$minOfOrNull`[0]) as java.lang.Number).floatValue()
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfOrNull`)).iterator()

      while (var3.hasNext()) {
         minValue = Math.min(minValue, (selector(`$this$minOfOrNull`[var3.nextInt()]) as java.lang.Number).floatValue())
      }

      return minValue
   }
}

public inline fun DoubleArray.any(predicate: (Double) -> Boolean): Boolean {
   for (element in `$this$any`) {
      if (predicate(element) as java.lang.Boolean) {
         return true
      }
   }

   return false
}

public fun DoubleArray.sorted(): List<Double> {
   val var1: Array<java.lang.Double> = ArraysKt.toTypedArray(`$this$sorted`)
   ArraysKt.sort(var1)
   return ArraysKt.asList(var1)
}

public inline fun ByteArray.indexOfLast(predicate: (Byte) -> Boolean): Int {
   var var3: Int = `$this$indexOfLast`.length + -1
   if (0 <= `$this$indexOfLast`.length + -1) {
      do {
         val index: Int = var3--
         if (predicate(`$this$indexOfLast`[index]) as java.lang.Boolean) {
            return index
         }
      } while (0 <= var3)
   }

   return -1
}

public inline fun IntArray.partition(predicate: (Int) -> Boolean): Pair<List<Int>, List<Int>> {
   val first: ArrayList = ArrayList()
   val second: ArrayList = ArrayList()

   for (element in `$this$partition`) {
      if (predicate(element) as java.lang.Boolean) {
         first.add(element)
      } else {
         second.add(element)
      }
   }

   return Pair<>(first, second)
}

public fun <C : MutableCollection<in Boolean>> BooleanArray.toCollection(destination: Any): Any {
   for (item in `$this$toCollection`) {
      destination.add(item)
   }

   return (C)destination
}

public fun IntArray.asSequence(): Sequence<Int> {
   return if (`$this$asSequence`.length == 0) SequencesKt.emptySequence() else ArraysKt___ArraysKt$asSequence$$inlined$Sequence$4(`$this$asSequence`)
}

@SinceKotlin(version = "1.4")
public fun <T : Comparable<Any>> Array<out Any>.minOrNull(): Any? {
   if (`$this$minOrNull`.length == 0) {
      return null
   } else {
      var min: java.lang.Comparable = `$this$minOrNull`[0]
      val var2: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOrNull`)).iterator()

      while (var2.hasNext()) {
         val e: java.lang.Comparable = `$this$minOrNull`[var2.nextInt()]
         if (min.compareTo(e) > 0) {
            min = e
         }
      }

      return (T)min
   }
}

public fun BooleanArray.asIterable(): Iterable<Boolean> {
   return if (`$this$asIterable`.length == 0) CollectionsKt.emptyList() else ArraysKt___ArraysKt$asIterable$$inlined$Iterable$8(`$this$asIterable`)
}

public fun ByteArray.takeLast(n: Int): List<Byte> {
   if (n < 0) {
      throw IllegalArgumentException(("Requested element count $n is less than zero.").toString())
   } else if (n == 0) {
      return CollectionsKt.emptyList()
   } else {
      val var5: Int = `$this$takeLast`.length
      if (n >= `$this$takeLast`.length) {
         return ArraysKt.toList(`$this$takeLast`)
      } else if (n == 1) {
         return CollectionsKt.listOf(`$this$takeLast`[var5 + -1])
      } else {
         val list: ArrayList = ArrayList(n)

         for (index in var5 - n..var5) {
            list.add(`$this$takeLast`[index])
         }

         return list
      }
   }
}

public fun ByteArray.sortedDescending(): List<Byte> {
   val var10000: ByteArray = Arrays.copyOf(`$this$sortedDescending`, `$this$sortedDescending`.length)
   ArraysKt.sort(var10000)
   return ArraysKt.reversed(var10000)
}

public inline fun <R> ShortArray.foldIndexed(initial: Any, operation: (Int, Any, Short) -> Any): Any {
   var index: Int = 0
   var accumulator: Any = initial

   for (element in `$this$foldIndexed`) {
      accumulator = operation(index++, accumulator, element)
   }

   return (R)accumulator
}

public inline fun IntArray.single(predicate: (Int) -> Boolean): Int {
   var single: Int = null
   var found: Boolean = false

   for (element in `$this$single`) {
      if (predicate(element) as java.lang.Boolean) {
         if (found) {
            throw IllegalArgumentException("Array contains more than one matching element.")
         }

         single = element
         found = true
      }
   }

   if (!found) {
      throw NoSuchElementException("Array contains no element matching the predicate.")
   } else {
      return single
   }
}

public inline fun <S, T : Any> Array<out Any>.reduceRight(operation: (Any, Any) -> Any): Any {
   var index: Int = ArraysKt.getLastIndex(`$this$reduceRight`)
   if (index < 0) {
      throw UnsupportedOperationException("Empty array can't be reduced.")
   } else {
      var accumulator: Any = `$this$reduceRight`[index--]

      while (index >= 0) {
         accumulator = operation(`$this$reduceRight`[index--], accumulator)
      }

      return (S)accumulator
   }
}

@InlineOnly
@JvmName(name = "sumOfInt")
@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
public inline fun FloatArray.sumOf(selector: (Float) -> Int): Int {
   var sum: Int = 0

   for (element in `$this$sumOf`) {
      sum += (selector(element) as java.lang.Number).intValue()
   }

   return sum
}

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun <T> Array<out Any>.minOfOrNull(selector: (Any) -> Float): Float? {
   if (`$this$minOfOrNull`.length == 0) {
      return null
   } else {
      var minValue: Float = (selector(`$this$minOfOrNull`[0]) as java.lang.Number).floatValue()
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfOrNull`)).iterator()

      while (var3.hasNext()) {
         minValue = Math.min(minValue, (selector(`$this$minOfOrNull`[var3.nextInt()]) as java.lang.Number).floatValue())
      }

      return minValue
   }
}

public fun CharArray.sortedArrayDescending(): CharArray {
   if (`$this$sortedArrayDescending`.length == 0) {
      return `$this$sortedArrayDescending`
   } else {
      val var10000: CharArray = Arrays.copyOf(`$this$sortedArrayDescending`, `$this$sortedArrayDescending`.length)
      ArraysKt.sortDescending(var10000)
      return var10000
   }
}

public fun DoubleArray.sliceArray(indices: IntRange): DoubleArray {
   return if (indices.isEmpty()) DoubleArray(0) else ArraysKt.copyOfRange(`$this$sliceArray`, indices.start, indices.endInclusive + 1)
}

public inline fun <K, V> DoubleArray.associate(transform: (Double) -> Pair<Any, Any>): Map<Any, Any> {
   val `destination$iv`: java.util.Map = LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(`$this$associate`.length), 16))

   for (`element$iv` in `$this$associate`) {
      val var12: Pair = transform(`element$iv`) as Pair
      `destination$iv`.put(var12.first, var12.second)
   }

   return `destination$iv`
}

public inline fun CharArray.reduceRightIndexed(operation: (Int, Char, Char) -> Char): Char {
   var index: Int = ArraysKt.getLastIndex(`$this$reduceRightIndexed`)
   if (index < 0) {
      throw UnsupportedOperationException("Empty array can't be reduced.")
   } else {
      var accumulator: Char = `$this$reduceRightIndexed`[index--]

      while (index >= 0) {
         accumulator = operation(index, `$this$reduceRightIndexed`[index], accumulator) as Character
         index--
      }

      return accumulator
   }
}

public inline fun <T> Array<out Any>.filterNot(predicate: (Any) -> Boolean): List<Any> {
   val `destination$iv`: java.util.Collection = ArrayList()

   for (`element$iv` in `$this$filterNot`) {
      if (!predicate(`element$iv`) as java.lang.Boolean) {
         `destination$iv`.add(`element$iv`)
      }
   }

   return `destination$iv` as MutableList<T>
}

public fun ShortArray.joinToString(
   separator: CharSequence = ", " as java.lang.CharSequence,
   prefix: CharSequence = "" as java.lang.CharSequence,
   postfix: CharSequence = "" as java.lang.CharSequence,
   limit: Int = -1,
   truncated: CharSequence = "..." as java.lang.CharSequence,
   transform: ((Short) -> CharSequence)? = null
): String {
   val var10000: java.lang.String = ArraysKt.joinTo((short[])`$this$joinToString`, StringBuilder(), separator, prefix, postfix, limit, truncated, transform)
      .toString()
      return var10000
}

public infix fun <R> ShortArray.zip(other: Array<out Any>): List<Pair<Short, Any>> {
   val `$this$zip$iv`: ShortArray = `$this$zip`
   val `size$iv`: Int = Math.min(`$this$zip`.length, other.length)
   val `list$iv`: ArrayList = ArrayList(`size$iv`)

   repeat(`size$iv`) { `i$iv` ->
      `list$iv`.add(`$this$zip$iv`[`i$iv`] to other[`i$iv`])
   }

   return `list$iv`
}

public inline fun <T> Array<out Any>.firstOrNull(predicate: (Any) -> Boolean): Any? {
   for (element in `$this$firstOrNull`) {
      if (predicate(element) as java.lang.Boolean) {
         return (T)element
      }
   }

   return null
}

public inline fun FloatArray.dropWhile(predicate: (Float) -> Boolean): List<Float> {
   var yielding: Boolean = false
   val list: ArrayList = ArrayList()

   for (item in `$this$dropWhile`) {
      if (yielding) {
         list.add(item)
      } else if (!predicate(item) as java.lang.Boolean) {
         list.add(item)
         yielding = true
      }
   }

   return list
}

public fun CharArray.single(): Char {
   when (`$this$single`.length) {
      0 -> throw NoSuchElementException("Array is empty.")
      1 -> return `$this$single`[0]
      else -> throw IllegalArgumentException("Array has more than one element.")
   }
}

@JvmName(name = "maxOrThrow")
@SinceKotlin(version = "1.7")
public fun Array<out Double>.max(): Double {
   if (`$this$max`.length == 0) {
      throw NoSuchElementException()
   } else {
      var max: Double = `$this$max`[0]
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$max`)).iterator()

      while (var3.hasNext()) {
         max = Math.max(max, `$this$max`[var3.nextInt()])
      }

      return max
   }
}

@SinceKotlin(version = "1.4")
public fun FloatArray.reverse(fromIndex: Int, toIndex: Int) {
   AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(fromIndex, toIndex, `$this$reverse`.length)
   val midPoint: Int = (fromIndex + toIndex) / 2
   if (fromIndex != (fromIndex + toIndex) / 2) {
      var reverseIndex: Int = toIndex + -1

      for (index in fromIndex..midPoint) {
         val tmp: Float = `$this$reverse`[index]
         `$this$reverse`[index] = `$this$reverse`[reverseIndex]
         `$this$reverse`[reverseIndex] = tmp
         reverseIndex--
      }
   }
}

public inline fun <T, R> Array<out Any>.fold(initial: Any, operation: (Any, Any) -> Any): Any {
   var accumulator: Any = initial

   for (element in `$this$fold`) {
      accumulator = operation(accumulator, element)
   }

   return (R)accumulator
}

@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
@InlineOnly
public inline fun LongArray.minOf(selector: (Long) -> Double): Double {
   if (`$this$minOf`.length == 0) {
      throw NoSuchElementException()
   } else {
      var minValue: Double = (selector(`$this$minOf`[0]) as java.lang.Number).doubleValue()
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOf`)).iterator()

      while (var4.hasNext()) {
         minValue = Math.min(minValue, (selector(`$this$minOf`[var4.nextInt()]) as java.lang.Number).doubleValue())
      }

      return minValue
   }
}

public fun ShortArray.take(n: Int): List<Short> {
   if (n < 0) {
      throw IllegalArgumentException(("Requested element count $n is less than zero.").toString())
   } else if (n == 0) {
      return CollectionsKt.emptyList()
   } else if (n >= `$this$take`.length) {
      return ArraysKt.toList(`$this$take`)
   } else if (n == 1) {
      return CollectionsKt.listOf(`$this$take`[0])
   } else {
      val var7: Int = 0
      val list: ArrayList = ArrayList(n)

      for (item in `$this$take`) {
         list.add(item)
         if (++var7 == n) {
            break
         }
      }

      return list
   }
}

public fun DoubleArray.joinToString(
   separator: CharSequence = ", " as java.lang.CharSequence,
   prefix: CharSequence = "" as java.lang.CharSequence,
   postfix: CharSequence = "" as java.lang.CharSequence,
   limit: Int = -1,
   truncated: CharSequence = "..." as java.lang.CharSequence,
   transform: ((Double) -> CharSequence)? = null
): String {
   val var10000: java.lang.String = ArraysKt.joinTo(`$this$joinToString`, StringBuilder(), separator, prefix, postfix, limit, truncated, transform).toString()
   return var10000
}

public fun DoubleArray.getOrNull(index: Int): Double? {
   return if (index >= 0 && index <= ArraysKt.getLastIndex(`$this$getOrNull`)) `$this$getOrNull`[index] else null
}

public fun IntArray.toMutableSet(): MutableSet<Int> {
   return ArraysKt.toCollection((int[])`$this$toMutableSet`, LinkedHashSet<>(MapsKt.mapCapacity(`$this$toMutableSet`.length)))
}

public fun Array<out Float>.toFloatArray(): FloatArray {
   var var1: Int = 0
   val var2: Int = `$this$toFloatArray`.length
   val var3: FloatArray = FloatArray(`$this$toFloatArray`.length)

   while (var1 < var2) {
      var3[var1] = `$this$toFloatArray`[var1]
      var1++
   }

   return var3
}

public inline fun <K, V> BooleanArray.associateBy(keySelector: (Boolean) -> Any, valueTransform: (Boolean) -> Any): Map<Any, Any> {
   val `destination$iv`: java.util.Map = LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(`$this$associateBy`.length), 16))

   for (`element$iv` in `$this$associateBy`) {
      `destination$iv`.put(keySelector(`element$iv`), valueTransform(`element$iv`))
   }

   return `destination$iv`
}

public inline fun <R, C : MutableCollection<in Any>> ShortArray.mapTo(destination: Any, transform: (Short) -> Any): Any {
   for (item in `$this$mapTo`) {
      destination.add(transform(item))
   }

   return (C)destination
}

public inline fun ShortArray.none(predicate: (Short) -> Boolean): Boolean {
   for (element in `$this$none`) {
      if (predicate(element) as java.lang.Boolean) {
         return false
      }
   }

   return true
}

public inline fun <R> ByteArray.fold(initial: Any, operation: (Any, Byte) -> Any): Any {
   var accumulator: Any = initial

   for (element in `$this$fold`) {
      accumulator = operation(accumulator, element)
   }

   return (R)accumulator
}

@InlineOnly
public inline fun DoubleArray.count(): Int {
   return `$this$count`.length
}

@SinceKotlin(version = "1.4")
public fun IntArray.sortDescending(fromIndex: Int, toIndex: Int) {
   ArraysKt.sort((int[])`$this$sortDescending`, fromIndex, toIndex)
   ArraysKt.reverse((int[])`$this$sortDescending`, fromIndex, toIndex)
}

public inline fun <R> ShortArray.flatMap(transform: (Short) -> Iterable<Any>): List<Any> {
   val `destination$iv`: java.util.Collection = ArrayList()

   for (`element$iv` in `$this$flatMap`) {
      CollectionsKt.addAll(`destination$iv`, transform(`element$iv`) as java.lang.Iterable)
   }

   return `destination$iv` as MutableList<R>
}

@SinceKotlin(version = "1.7")
@JvmName(name = "minWithOrThrow")
public fun CharArray.minWith(comparator: Comparator<in Char>): Char {
   if (`$this$minWith`.length == 0) {
      throw NoSuchElementException()
   } else {
      var min: Char = `$this$minWith`[0]
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minWith`)).iterator()

      while (var3.hasNext()) {
         val e: Char = `$this$minWith`[var3.nextInt()]
         if (comparator.compare(min, e) > 0) {
            min = e
         }
      }

      return min
   }
}

public fun BooleanArray.none(): Boolean {
   return `$this$none`.length == 0
}

@SinceKotlin(version = "1.4")
public inline fun CharArray.reduceRightIndexedOrNull(operation: (Int, Char, Char) -> Char): Char? {
   var index: Int = ArraysKt.getLastIndex(`$this$reduceRightIndexedOrNull`)
   if (index < 0) {
      return null
   } else {
      var accumulator: Char = `$this$reduceRightIndexedOrNull`[index--]

      while (index >= 0) {
         accumulator = operation(index, `$this$reduceRightIndexedOrNull`[index], accumulator) as Character
         index--
      }

      return accumulator
   }
}

@SinceKotlin(version = "1.4")
public inline fun <S, T : Any> Array<out Any>.runningReduceIndexed(operation: (Int, Any, Any) -> Any): List<Any> {
   if (`$this$runningReduceIndexed`.length == 0) {
      return CollectionsKt.emptyList()
   } else {
      var var8: Any = `$this$runningReduceIndexed`[0]
      val index: ArrayList = ArrayList(`$this$runningReduceIndexed`.length)
      index.add(var8)
      val result: ArrayList = index
      var var9: Int = 1

      for (var10 in `$this$runningReduceIndexed`.length..var9) {
         var8 = operation(var9, var8, `$this$runningReduceIndexed`[var9])
         result.add(var8)
      }

      return result
   }
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun ByteArray.onEachIndexed(action: (Int, Byte) -> Unit): ByteArray {
   var `index$iv`: Int = 0

   for (`item$iv` in `$this$onEachIndexed`) {
      action(`index$iv`++, `item$iv`)
   }

   return `$this$onEachIndexed`
}

public fun <T> Array<out Any>.asIterable(): Iterable<Any> {
   return if (`$this$asIterable`.length == 0) CollectionsKt.emptyList() else ArraysKt___ArraysKt$asIterable$$inlined$Iterable$1(`$this$asIterable`)
}

public fun CharArray.withIndex(): Iterable<IndexedValue<Char>> {
   return IndexingIterable<>(   // $VF: Compiled from _Arrays.kt
{
      return ArrayIteratorsKt.iterator($this$withIndex)
   } as () -> MutableIterator<Character>)
}

public final val lastIndex: Int
   public final get() {
      return `$this$lastIndex`.length - 1
   }


@OverloadResolutionByLambdaReturnType
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun CharArray.minOfOrNull(selector: (Char) -> Double): Double? {
   if (`$this$minOfOrNull`.length == 0) {
      return null
   } else {
      var minValue: Double = (selector(`$this$minOfOrNull`[0]) as java.lang.Number).doubleValue()
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfOrNull`)).iterator()

      while (var4.hasNext()) {
         minValue = Math.min(minValue, (selector(`$this$minOfOrNull`[var4.nextInt()]) as java.lang.Number).doubleValue())
      }

      return minValue
   }
}

public inline fun IntArray.reduceIndexed(operation: (Int, Int, Int) -> Int): Int {
   if (`$this$reduceIndexed`.length == 0) {
      throw UnsupportedOperationException("Empty array can't be reduced.")
   } else {
      var accumulator: Int = `$this$reduceIndexed`[0]
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$reduceIndexed`)).iterator()

      while (var4.hasNext()) {
         val index: Int = var4.nextInt()
         accumulator = (operation(index, accumulator, `$this$reduceIndexed`[index]) as java.lang.Number).intValue()
      }

      return accumulator
   }
}

@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun <T> Array<out Any>.random(): Any {
   return (T)ArraysKt.random((Object[])`$this$random`, Random.Default)
}

@SinceKotlin(version = "1.4")
@InlineOnly
@OverloadResolutionByLambdaReturnType
public inline fun CharArray.maxOf(selector: (Char) -> Double): Double {
   if (`$this$maxOf`.length == 0) {
      throw NoSuchElementException()
   } else {
      var maxValue: Double = (selector(`$this$maxOf`[0]) as java.lang.Number).doubleValue()
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOf`)).iterator()

      while (var4.hasNext()) {
         maxValue = Math.max(maxValue, (selector(`$this$maxOf`[var4.nextInt()]) as java.lang.Number).doubleValue())
      }

      return maxValue
   }
}

public final val indices: IntRange
   public final get() {
      return IntRange(0, ArraysKt.getLastIndex(`$this$indices`))
   }


public infix fun <R> BooleanArray.zip(other: Array<out Any>): List<Pair<Boolean, Any>> {
   val `$this$zip$iv`: BooleanArray = `$this$zip`
   val `size$iv`: Int = Math.min(`$this$zip`.length, other.length)
   val `list$iv`: ArrayList = ArrayList(`size$iv`)

   repeat(`size$iv`) { `i$iv` ->
      `list$iv`.add(`$this$zip$iv`[`i$iv`] to other[`i$iv`])
   }

   return `list$iv`
}

public inline fun <K, V> IntArray.associate(transform: (Int) -> Pair<Any, Any>): Map<Any, Any> {
   val `destination$iv`: java.util.Map = LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(`$this$associate`.length), 16))

   for (`element$iv` in `$this$associate`) {
      val var11: Pair = transform(`element$iv`) as Pair
      `destination$iv`.put(var11.first, var11.second)
   }

   return `destination$iv`
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun LongArray.runningReduce(operation: (Long, Long) -> Long): List<Long> {
   if (`$this$runningReduce`.length == 0) {
      return CollectionsKt.emptyList()
   } else {
      var accumulator: Long = 0L
      accumulator = `$this$runningReduce`[0]
      val index: ArrayList = ArrayList(`$this$runningReduce`.length)
      index.add(accumulator)
      val result: ArrayList = index
      var var8: Int = 1

      for (var9 in `$this$runningReduce`.length..var8) {
         accumulator = (operation(accumulator, `$this$runningReduce`[var8]) as java.lang.Number).longValue()
         result.add(accumulator)
      }

      return result
   }
}

@InlineOnly
public inline fun LongArray.isEmpty(): Boolean {
   return `$this$isEmpty`.length == 0
}

@OverloadResolutionByLambdaReturnType
@InlineOnly
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@SinceKotlin(version = "1.5")
@JvmName(name = "sumOfULong")
public inline fun BooleanArray.sumOf(selector: (Boolean) -> ULong): ULong {
   var sum: Long = ULong.constructor_impl/* $VF was: constructor-impl */(0L)

   for (element in `$this$sumOf`) {
      sum = ULong.constructor_impl/* $VF was: constructor-impl */(sum + (selector(element) as ULong).unbox_impl/* $VF was: unbox-impl */())
   }

   return sum
}

public inline fun CharArray.indexOfLast(predicate: (Char) -> Boolean): Int {
   var var3: Int = `$this$indexOfLast`.length + -1
   if (0 <= `$this$indexOfLast`.length + -1) {
      do {
         val index: Int = var3--
         if (predicate(`$this$indexOfLast`[index]) as java.lang.Boolean) {
            return index
         }
      } while (0 <= var3)
   }

   return -1
}

public fun FloatArray.dropLast(n: Int): List<Float> {
   if (n < 0) {
      throw IllegalArgumentException(("Requested element count $n is less than zero.").toString())
   } else {
      return ArraysKt.take(`$this$dropLast`, RangesKt.coerceAtLeast(`$this$dropLast`.length - n, 0))
   }
}

public inline fun <R> FloatArray.foldRightIndexed(initial: Any, operation: (Int, Float, Any) -> Any): Any {
   var index: Int = ArraysKt.getLastIndex(`$this$foldRightIndexed`)
   var accumulator: Any = initial

   while (index >= 0) {
      accumulator = operation(index, `$this$foldRightIndexed`[index], accumulator)
      index--
   }

   return (R)accumulator
}

@InlineOnly
public inline fun DoubleArray.getOrElse(index: Int, defaultValue: (Int) -> Double): Double {
   return if (index >= 0 && index <= ArraysKt.getLastIndex(`$this$getOrElse`))
      `$this$getOrElse`[index]
      else
      (defaultValue(index) as java.lang.Number).doubleValue()
   }

public inline fun <K> ByteArray.distinctBy(selector: (Byte) -> Any): List<Byte> {
   val set: HashSet = HashSet()
   val list: ArrayList = ArrayList()

   for (e in `$this$distinctBy`) {
      if (set.add(selector(e))) {
         list.add(e)
      }
   }

   return list
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun <R> FloatArray.runningFoldIndexed(initial: Any, operation: (Int, Any, Float) -> Any): List<Any> {
   if (`$this$runningFoldIndexed`.length == 0) {
      return (java.util.List<R>)CollectionsKt.listOf(initial)
   } else {
      var accumulator: Any = ArrayList(`$this$runningFoldIndexed`.length + 1)
      accumulator.add(initial)
      val result: Any = accumulator
      accumulator = initial
      var var8: Int = 0

      for (var9 in `$this$runningFoldIndexed`.length..var8) {
         accumulator = operation(var8, accumulator, `$this$runningFoldIndexed`[var8])
         result.add(accumulator)
      }

      return result as MutableList<R>
   }
}

public inline fun <R, V> BooleanArray.zip(other: Array<out Any>, transform: (Boolean, Any) -> Any): List<Any> {
   val size: Int = Math.min(`$this$zip`.length, other.length)
   val list: ArrayList = ArrayList(size)

   repeat(size) { i ->
      list.add(transform(`$this$zip`[i], other[i]))
   }

   return list
}

public inline fun <R> ByteArray.foldRightIndexed(initial: Any, operation: (Int, Byte, Any) -> Any): Any {
   var index: Int = ArraysKt.getLastIndex(`$this$foldRightIndexed`)
   var accumulator: Any = initial

   while (index >= 0) {
      accumulator = operation(index, `$this$foldRightIndexed`[index], accumulator)
      index--
   }

   return (R)accumulator
}

public fun FloatArray.asSequence(): Sequence<Float> {
   return if (`$this$asSequence`.length == 0) SequencesKt.emptySequence() else ArraysKt___ArraysKt$asSequence$$inlined$Sequence$6(`$this$asSequence`)
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.4")
public fun BooleanArray.randomOrNull(random: Random): Boolean? {
   return if (`$this$randomOrNull`.length == 0) null else `$this$randomOrNull`[random.nextInt(`$this$randomOrNull`.length)]
}

public final val indices: IntRange
   public final get() {
      return IntRange(0, ArraysKt.getLastIndex(`$this$indices`))
   }


public inline fun DoubleArray.reduceRightIndexed(operation: (Int, Double, Double) -> Double): Double {
   var index: Int = ArraysKt.getLastIndex(`$this$reduceRightIndexed`)
   if (index < 0) {
      throw UnsupportedOperationException("Empty array can't be reduced.")
   } else {
      var accumulator: Double = `$this$reduceRightIndexed`[index--]

      while (index >= 0) {
         accumulator = (operation(index, `$this$reduceRightIndexed`[index], accumulator) as java.lang.Number).doubleValue()
         index--
      }

      return accumulator
   }
}

@InlineOnly
public inline fun FloatArray.getOrElse(index: Int, defaultValue: (Int) -> Float): Float {
   return if (index >= 0 && index <= ArraysKt.getLastIndex(`$this$getOrElse`))
      `$this$getOrElse`[index]
      else
      (defaultValue(index) as java.lang.Number).floatValue()
   }

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun ShortArray.runningReduce(operation: (Short, Short) -> Short): List<Short> {
   if (`$this$runningReduce`.length == 0) {
      return CollectionsKt.emptyList()
   } else {
      var var7: Short = `$this$runningReduce`[0]
      val index: ArrayList = ArrayList(`$this$runningReduce`.length)
      index.add(var7)
      val result: ArrayList = index
      var var8: Int = 1

      for (var9 in `$this$runningReduce`.length..var8) {
         var7 = (operation(var7, `$this$runningReduce`[var8]) as java.lang.Number).shortValue()
         result.add(var7)
      }

      return result
   }
}

public inline fun LongArray.filter(predicate: (Long) -> Boolean): List<Long> {
   val `destination$iv`: java.util.Collection = ArrayList()

   for (`element$iv` in `$this$filter`) {
      if (predicate(`element$iv`) as java.lang.Boolean) {
         `destination$iv`.add(`element$iv`)
      }
   }

   return `destination$iv` as MutableList<java.lang.Long>
}

@InlineOnly
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
public inline fun <R> DoubleArray.minOfWithOrNull(comparator: Comparator<in Any>, selector: (Double) -> Any): Any? {
   if (`$this$minOfWithOrNull`.length == 0) {
      return null
   } else {
      var minValue: Any = selector(`$this$minOfWithOrNull`[0])
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfWithOrNull`)).iterator()

      while (var4.hasNext()) {
         val v: Any = selector(`$this$minOfWithOrNull`[var4.nextInt()])
         if (comparator.compare(minValue, v) > 0) {
            minValue = v
         }
      }

      return (R)minValue
   }
}

public inline fun LongArray.firstOrNull(predicate: (Long) -> Boolean): Long? {
   for (element in `$this$firstOrNull`) {
      if (predicate(element) as java.lang.Boolean) {
         return element
      }
   }

   return null
}

@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun IntArray.onEachIndexed(action: (Int, Int) -> Unit): IntArray {
   var `index$iv`: Int = 0

   for (`item$iv` in `$this$onEachIndexed`) {
      action(`index$iv`++, `item$iv`)
   }

   return `$this$onEachIndexed`
}

@InlineOnly
@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
@JvmName(name = "flatMapIndexedIterable")
public inline fun <R> IntArray.flatMapIndexed(transform: (Int, Int) -> Iterable<Any>): List<Any> {
   val var3: java.util.Collection = ArrayList()
   var var4: Int = 0

   for (var7 in `$this$flatMapIndexed`) {
      CollectionsKt.addAll(var3, transform(var4++, var7) as java.lang.Iterable)
   }

   return var3 as MutableList<R>
}

@SinceKotlin(version = "1.4")
@JvmName(name = "flatMapIndexedSequenceTo")
@InlineOnly
@OverloadResolutionByLambdaReturnType
public inline fun <T, R, C : MutableCollection<in Any>> Array<out Any>.flatMapIndexedTo(destination: Any, transform: (Int, Any) -> Sequence<Any>): Any {
   var index: Int = 0

   for (element in `$this$flatMapIndexedTo`) {
      CollectionsKt.addAll(destination, transform(index++, element) as Sequence)
   }

   return (C)destination
}

public inline fun IntArray.all(predicate: (Int) -> Boolean): Boolean {
   for (element in `$this$all`) {
      if (!predicate(element) as java.lang.Boolean) {
         return false
      }
   }

   return true
}

public fun LongArray.slice(indices: Iterable<Int>): List<Long> {
   val size: Int = CollectionsKt.collectionSizeOrDefault(indices, 10)
   if (size == 0) {
      return CollectionsKt.emptyList()
   } else {
      val list: ArrayList = ArrayList(size)
      val var4: java.util.Iterator = indices.iterator()

      while (var4.hasNext()) {
         list.add(`$this$slice`[(var4.next() as java.lang.Number).intValue()])
      }

      return list
   }
}

public infix fun DoubleArray.union(other: Iterable<Double>): Set<Double> {
   val set: java.util.Set = ArraysKt.toMutableSet(`$this$union`)
   CollectionsKt.addAll(set, other)
   return set
}

@InlineOnly
public inline operator fun ShortArray.component3(): Short {
   return `$this$component3`[2]
}

public fun BooleanArray.slice(indices: Iterable<Int>): List<Boolean> {
   val size: Int = CollectionsKt.collectionSizeOrDefault(indices, 10)
   if (size == 0) {
      return CollectionsKt.emptyList()
   } else {
      val list: ArrayList = ArrayList(size)
      val var4: java.util.Iterator = indices.iterator()

      while (var4.hasNext()) {
         list.add(`$this$slice`[(var4.next() as java.lang.Number).intValue()])
      }

      return list
   }
}

@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun ShortArray.onEachIndexed(action: (Int, Short) -> Unit): ShortArray {
   var `index$iv`: Int = 0

   for (`item$iv` in `$this$onEachIndexed`) {
      action(`index$iv`++, `item$iv`)
   }

   return `$this$onEachIndexed`
}

@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public inline fun <T, R> Array<out Any>.scanIndexed(initial: Any, operation: (Int, Any, Any) -> Any): List<Any> {
   val `$this$runningFoldIndexed$iv`: Array<Any> = `$this$scanIndexed`
   val var10000: java.util.List
   if (`$this$scanIndexed`.length == 0) {
      var10000 = CollectionsKt.listOf(initial)
   } else {
      val `accumulator$iv`: ArrayList = ArrayList(`$this$scanIndexed`.length + 1)
      `accumulator$iv`.add(initial)
      val `result$iv`: ArrayList = `accumulator$iv`
      var var10: Any = initial
      var var11: Int = 0

      for (var12 in `$this$scanIndexed`.length..var11) {
         var10 = operation(var11, var10, `$this$runningFoldIndexed$iv`[var11])
         `result$iv`.add(var10)
      }

      var10000 = `result$iv`
   }

   return var10000
}

public inline fun <K, M : MutableMap<in Any, in Byte>> ByteArray.associateByTo(destination: Any, keySelector: (Byte) -> Any): Any {
   for (element in `$this$associateByTo`) {
      destination.put(keySelector(element), element)
   }

   return (M)destination
}

public inline fun <K> DoubleArray.distinctBy(selector: (Double) -> Any): List<Double> {
   val set: HashSet = HashSet()
   val list: ArrayList = ArrayList()

   for (e in `$this$distinctBy`) {
      if (set.add(selector(e))) {
         list.add(e)
      }
   }

   return list
}

@InlineOnly
public inline fun LongArray.count(): Int {
   return `$this$count`.length
}

public infix fun CharArray.subtract(other: Iterable<Char>): Set<Char> {
   val set: java.util.Set = ArraysKt.toMutableSet(`$this$subtract`)
   CollectionsKt.removeAll(set, other)
   return set
}

@SinceKotlin(version = "1.4")
public fun Array<out Float>.minOrNull(): Float? {
   if (`$this$minOrNull`.length == 0) {
      return null
   } else {
      var min: Float = `$this$minOrNull`[0]
      val var2: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOrNull`)).iterator()

      while (var2.hasNext()) {
         min = Math.min(min, `$this$minOrNull`[var2.nextInt()])
      }

      return min
   }
}

public fun LongArray.withIndex(): Iterable<IndexedValue<Long>> {
   return IndexingIterable<>(   // $VF: Compiled from _Arrays.kt
{
      return ArrayIteratorsKt.iterator($this$withIndex)
   } as () -> MutableIterator<java.lang.Long>)
}

@SinceKotlin(version = "1.4")
public inline fun <T, R : Comparable<Any>> Array<out Any>.maxByOrNull(selector: (Any) -> Any): Any? {
   if (`$this$maxByOrNull`.length == 0) {
      return null
   } else {
      var maxElem: Any = `$this$maxByOrNull`[0]
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$maxByOrNull`)
      if (lastIndex == 0) {
         return (T)maxElem
      } else {
         var maxValue: java.lang.Comparable = selector(maxElem) as java.lang.Comparable
         val var6: IntIterator = IntRange(1, lastIndex).iterator()

         while (var6.hasNext()) {
            val e: Any = `$this$maxByOrNull`[var6.nextInt()]
            val v: java.lang.Comparable = selector(e) as java.lang.Comparable
            if (maxValue.compareTo(v) < 0) {
               maxElem = e
               maxValue = v
            }
         }

         return (T)maxElem
      }
   }
}

public fun <T : Comparable<Any>> Array<Any>.sortedArrayDescending(): Array<Any> {
   if (`$this$sortedArrayDescending`.length == 0) {
      return (T[])`$this$sortedArrayDescending`
   } else {
      val var10000: Array<Any> = Arrays.copyOf(`$this$sortedArrayDescending`, `$this$sortedArrayDescending`.length)
      ArraysKt.sortWith(var10000 as Array<java.lang.Comparable>, ComparisonsKt.reverseOrder())
      return (T[])(var10000 as Array<java.lang.Comparable>)
   }
}

public inline fun <K> FloatArray.groupBy(keySelector: (Float) -> Any): Map<Any, List<Float>> {
   val `destination$iv`: java.util.Map = LinkedHashMap()

   for (`element$iv` in `$this$groupBy`) {
      val `key$iv`: Any = keySelector(`element$iv`)
      val `value$iv$iv`: Any = `destination$iv`.get(`key$iv`)
      val var10000: Any
      if (`value$iv$iv` == null) {
         val var15: java.util.List = ArrayList()
         `destination$iv`.put(`key$iv`, var15)
         var10000 = var15
      } else {
         var10000 = `value$iv$iv`
      }

      (var10000 as java.util.List).add(`element$iv`)
   }

   return `destination$iv`
}

public inline fun <T> Array<out Any>.takeWhile(predicate: (Any) -> Boolean): List<Any> {
   val list: ArrayList = ArrayList()

   for (item in `$this$takeWhile`) {
      if (!predicate(item) as java.lang.Boolean) {
         break
      }

      list.add(item)
   }

   return list
}

public fun ShortArray.sortedWith(comparator: Comparator<in Short>): List<Short> {
   val var2: Array<java.lang.Short> = ArraysKt.toTypedArray(`$this$sortedWith`)
   ArraysKt.sortWith(var2, comparator)
   return ArraysKt.asList(var2)
}

public inline fun <R : Comparable<Any>> ShortArray.sortedBy(crossinline selector: (Short) -> Any?): List<Short> {
   return ArraysKt.sortedWith((short[])`$this$sortedBy`,    // $VF: Compiled from Comparisons.kt
{ a: Any, b: Any ->
      val var3: Function1 = selector
      return ComparisonsKt.compareValues((T)(selector(a) as java.lang.Comparable), (T)(var3(b) as java.lang.Comparable))
   })
}

public fun FloatArray.toList(): List<Float> {
   var var10000: java.util.List
   when (`$this$toList`.length) {
      0 -> var10000 = CollectionsKt.emptyList()
      1 -> var10000 = CollectionsKt.listOf(`$this$toList`[0])
      else -> var10000 = ArraysKt.toMutableList(`$this$toList`)
   }

   return var10000
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun DoubleArray.onEachIndexed(action: (Int, Double) -> Unit): DoubleArray {
   var `index$iv`: Int = 0

   for (`item$iv` in `$this$onEachIndexed`) {
      action(`index$iv`++, `item$iv`)
   }

   return `$this$onEachIndexed`
}

@InlineOnly
public inline fun CharArray.isEmpty(): Boolean {
   return `$this$isEmpty`.length == 0
}

public fun ByteArray.sliceArray(indices: Collection<Int>): ByteArray {
   val result: ByteArray = ByteArray(indices.size())
   var targetIndex: Int = 0
   val var4: java.util.Iterator = indices.iterator()

   while (var4.hasNext()) {
      result[targetIndex++] = `$this$sliceArray`[(var4.next() as java.lang.Number).intValue()]
   }

   return result
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.4")
public inline fun ByteArray.reduceRightOrNull(operation: (Byte, Byte) -> Byte): Byte? {
   var index: Int = ArraysKt.getLastIndex(`$this$reduceRightOrNull`)
   if (index < 0) {
      return null
   } else {
      var accumulator: Byte = `$this$reduceRightOrNull`[index--]

      while (index >= 0) {
         accumulator = (operation(`$this$reduceRightOrNull`[index--], accumulator) as java.lang.Number).byteValue()
      }

      return accumulator
   }
}

public inline fun <T, K, V> Array<out Any>.associate(transform: (Any) -> Pair<Any, Any>): Map<Any, Any> {
   val `destination$iv`: java.util.Map = LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(`$this$associate`.length), 16))

   for (`element$iv` in `$this$associate`) {
      val var11: Pair = transform(`element$iv`) as Pair
      `destination$iv`.put(var11.first, var11.second)
   }

   return `destination$iv`
}

public inline fun <K> BooleanArray.associateBy(keySelector: (Boolean) -> Any): Map<Any, Boolean> {
   val `destination$iv`: java.util.Map = LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(`$this$associateBy`.length), 16))

   for (`element$iv` in `$this$associateBy`) {
      `destination$iv`.put(keySelector(`element$iv`), `element$iv`)
   }

   return `destination$iv`
}

public inline fun <C : MutableCollection<in Int>> IntArray.filterNotTo(destination: Any, predicate: (Int) -> Boolean): Any {
   for (element in `$this$filterNotTo`) {
      if (!predicate(element) as java.lang.Boolean) {
         destination.add(element)
      }
   }

   return (C)destination
}

public inline fun <R> CharArray.mapIndexed(transform: (Int, Char) -> Any): List<Any> {
   val `destination$iv`: java.util.Collection = ArrayList(`$this$mapIndexed`.length)
   var `index$iv`: Int = 0

   for (`item$iv` in `$this$mapIndexed`) {
      `destination$iv`.add(transform(`index$iv`++, `item$iv`))
   }

   return `destination$iv` as MutableList<R>
}

public final val lastIndex: Int
   public final get() {
      return `$this$lastIndex`.length - 1
   }


public inline fun <T, R : Any, C : MutableCollection<in Any>> Array<out Any>.mapIndexedNotNullTo(destination: Any, transform: (Int, Any) -> Any?): Any {
   var `index$iv`: Int = 0

   for (`item$iv` in `$this$mapIndexedNotNullTo`) {
      val var16: Any = transform(`index$iv`++, `item$iv`)
      if (var16 != null) {
         destination.add(var16)
      }
   }

   return (C)destination
}

@SinceKotlin(version = "1.4")
public fun LongArray.minOrNull(): Long? {
   if (`$this$minOrNull`.length == 0) {
      return null
   } else {
      var min: Long = `$this$minOrNull`[0]
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOrNull`)).iterator()

      while (var3.hasNext()) {
         val e: Long = `$this$minOrNull`[var3.nextInt()]
         if (min > e) {
            min = e
         }
      }

      return min
   }
}

public inline fun BooleanArray.any(predicate: (Boolean) -> Boolean): Boolean {
   for (element in `$this$any`) {
      if (predicate(element) as java.lang.Boolean) {
         return true
      }
   }

   return false
}

@SinceKotlin(version = "1.4")
@InlineOnly
@OverloadResolutionByLambdaReturnType
public inline fun <R : Comparable<Any>> IntArray.minOfOrNull(selector: (Int) -> Any): Any? {
   if (`$this$minOfOrNull`.length == 0) {
      return null
   } else {
      var minValue: java.lang.Comparable = selector(`$this$minOfOrNull`[0]) as java.lang.Comparable
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfOrNull`)).iterator()

      while (var3.hasNext()) {
         val v: java.lang.Comparable = selector(`$this$minOfOrNull`[var3.nextInt()]) as java.lang.Comparable
         if (minValue.compareTo(v) > 0) {
            minValue = v
         }
      }

      return (R)minValue
   }
}

public fun <A : Appendable> IntArray.joinTo(
   buffer: Any,
   separator: CharSequence = ...,
   prefix: CharSequence = ...,
   postfix: CharSequence = ...,
   limit: Int = ...,
   truncated: CharSequence = ...,
   transform: ((Int) -> CharSequence)? = ...
): Any {
   buffer.append(prefix)
   val count: Int = 0

   for (element in `$this$joinTo`) {
      if (++count > 1) {
         buffer.append(separator)
      }

      if (limit >= 0 && count > limit) {
         break
      }

      if (transform != null) {
         buffer.append(transform(element) as java.lang.CharSequence)
      } else {
         buffer.append(java.lang.String.valueOf(element))
      }
   }

   if (limit >= 0 && count > limit) {
      buffer.append(truncated)
   }

   buffer.append(postfix)
   return (A)buffer
}

public inline fun <T> Array<out Any>.first(predicate: (Any) -> Boolean): Any {
   for (element in `$this$first`) {
      if (predicate(element) as java.lang.Boolean) {
         return (T)element
      }
   }

   throw NoSuchElementException("Array contains no element matching the predicate.")
}

public inline fun ShortArray.reduce(operation: (Short, Short) -> Short): Short {
   if (`$this$reduce`.length == 0) {
      throw UnsupportedOperationException("Empty array can't be reduced.")
   } else {
      var accumulator: Short = `$this$reduce`[0]
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$reduce`)).iterator()

      while (var4.hasNext()) {
         accumulator = (operation(accumulator, `$this$reduce`[var4.nextInt()]) as java.lang.Number).shortValue()
      }

      return accumulator
   }
}

@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public fun FloatArray.randomOrNull(random: Random): Float? {
   return if (`$this$randomOrNull`.length == 0) null else `$this$randomOrNull`[random.nextInt(`$this$randomOrNull`.length)]
}

@SinceKotlin(version = "1.4")
public fun ByteArray.shuffle(random: Random) {
   for (i in ArraysKt.getLastIndex(`$this$shuffle`) downTo 1) {
      val j: Int = random.nextInt(i + 1)
      val copy: Byte = `$this$shuffle`[i]
      `$this$shuffle`[i] = `$this$shuffle`[j]
      `$this$shuffle`[j] = copy
   }
}

@InlineOnly
public inline operator fun DoubleArray.component2(): Double {
   return `$this$component2`[1]
}

@SinceKotlin(version = "1.3")
public fun IntArray.random(random: Random): Int {
   if (`$this$random`.length == 0) {
      throw NoSuchElementException("Array is empty.")
   } else {
      return `$this$random`[random.nextInt(`$this$random`.length)]
   }
}

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun DoubleArray.maxOfOrNull(selector: (Double) -> Double): Double? {
   if (`$this$maxOfOrNull`.length == 0) {
      return null
   } else {
      var maxValue: Double = (selector(`$this$maxOfOrNull`[0]) as java.lang.Number).doubleValue()
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfOrNull`)).iterator()

      while (var4.hasNext()) {
         maxValue = Math.max(maxValue, (selector(`$this$maxOfOrNull`[var4.nextInt()]) as java.lang.Number).doubleValue())
      }

      return maxValue
   }
}

@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun <R> CharArray.runningFoldIndexed(initial: Any, operation: (Int, Any, Char) -> Any): List<Any> {
   if (`$this$runningFoldIndexed`.length == 0) {
      return (java.util.List<R>)CollectionsKt.listOf(initial)
   } else {
      var accumulator: Any = ArrayList(`$this$runningFoldIndexed`.length + 1)
      accumulator.add(initial)
      val result: Any = accumulator
      accumulator = initial
      var var8: Int = 0

      for (var9 in `$this$runningFoldIndexed`.length..var8) {
         accumulator = operation(var8, accumulator, `$this$runningFoldIndexed`[var8])
         result.add(accumulator)
      }

      return result as MutableList<R>
   }
}

@SinceKotlin(version = "1.4")
public inline fun <S, T : Any> Array<out Any>.reduceIndexedOrNull(operation: (Int, Any, Any) -> Any): Any? {
   if (`$this$reduceIndexedOrNull`.length == 0) {
      return null
   } else {
      var accumulator: Any = `$this$reduceIndexedOrNull`[0]
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$reduceIndexedOrNull`)).iterator()

      while (var4.hasNext()) {
         val index: Int = var4.nextInt()
         accumulator = operation(index, accumulator, `$this$reduceIndexedOrNull`[index])
      }

      return (S)accumulator
   }
}

@InlineOnly
public inline fun ByteArray.getOrElse(index: Int, defaultValue: (Int) -> Byte): Byte {
   return if (index >= 0 && index <= ArraysKt.getLastIndex(`$this$getOrElse`))
      `$this$getOrElse`[index]
      else
      (defaultValue(index) as java.lang.Number).byteValue()
   }

public infix fun LongArray.union(other: Iterable<Long>): Set<Long> {
   val set: java.util.Set = ArraysKt.toMutableSet(`$this$union`)
   CollectionsKt.addAll(set, other)
   return set
}

@Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = []))
@DeprecatedSinceKotlin(warningSince = "1.5")
public inline fun CharArray.sumBy(selector: (Char) -> Int): Int {
   var sum: Int = 0

   for (element in `$this$sumBy`) {
      sum += (selector(element) as java.lang.Number).intValue()
   }

   return sum
}

public inline fun DoubleArray.partition(predicate: (Double) -> Boolean): Pair<List<Double>, List<Double>> {
   val first: ArrayList = ArrayList()
   val second: ArrayList = ArrayList()

   for (element in `$this$partition`) {
      if (predicate(element) as java.lang.Boolean) {
         first.add(element)
      } else {
         second.add(element)
      }
   }

   return Pair<>(first, second)
}

@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
@InlineOnly
public inline fun LongArray.maxOf(selector: (Long) -> Double): Double {
   if (`$this$maxOf`.length == 0) {
      throw NoSuchElementException()
   } else {
      var maxValue: Double = (selector(`$this$maxOf`[0]) as java.lang.Number).doubleValue()
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOf`)).iterator()

      while (var4.hasNext()) {
         maxValue = Math.max(maxValue, (selector(`$this$maxOf`[var4.nextInt()]) as java.lang.Number).doubleValue())
      }

      return maxValue
   }
}

public fun LongArray.indexOf(element: Long): Int {
   var index: Int = 0

   for (var4 in `$this$indexOf`.length..index) {
      if (element == `$this$indexOf`[index]) {
         return index
      }
   }

   return -1
}

public inline fun IntArray.count(predicate: (Int) -> Boolean): Int {
   var count: Int = 0

   for (element in `$this$count`) {
      if (predicate(element) as java.lang.Boolean) {
         count++
      }
   }

   return count
}

public inline fun FloatArray.filterIndexed(predicate: (Int, Float) -> Boolean): List<Float> {
   val `destination$iv`: java.util.Collection = ArrayList()
   val `index$iv$iv`: Int = 0

   for (`item$iv$iv` in `$this$filterIndexed`) {
      if (predicate(`index$iv$iv`++, `item$iv$iv`) as java.lang.Boolean) {
         `destination$iv`.add(`item$iv$iv`)
      }
   }

   return `destination$iv` as MutableList<java.lang.Float>
}

public fun ByteArray.toHashSet(): HashSet<Byte> {
   return ArraysKt.toCollection((byte[])`$this$toHashSet`, HashSet<>(MapsKt.mapCapacity(`$this$toHashSet`.length)))
}

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun ShortArray.minOfOrNull(selector: (Short) -> Double): Double? {
   if (`$this$minOfOrNull`.length == 0) {
      return null
   } else {
      var minValue: Double = (selector(`$this$minOfOrNull`[0]) as java.lang.Number).doubleValue()
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfOrNull`)).iterator()

      while (var4.hasNext()) {
         minValue = Math.min(minValue, (selector(`$this$minOfOrNull`[var4.nextInt()]) as java.lang.Number).doubleValue())
      }

      return minValue
   }
}

public fun FloatArray.sorted(): List<Float> {
   val var1: Array<java.lang.Float> = ArraysKt.toTypedArray(`$this$sorted`)
   ArraysKt.sort(var1)
   return ArraysKt.asList(var1)
}

public inline fun <T> Array<out Any>.indexOfFirst(predicate: (Any) -> Boolean): Int {
   var index: Int = 0

   for (var4 in `$this$indexOfFirst`.length..index) {
      if (predicate(`$this$indexOfFirst`[index]) as java.lang.Boolean) {
         return index
      }
   }

   return -1
}

@SinceKotlin(version = "1.4")
public fun CharArray.minWithOrNull(comparator: Comparator<in Char>): Char? {
   if (`$this$minWithOrNull`.length == 0) {
      return null
   } else {
      var min: Char = `$this$minWithOrNull`[0]
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minWithOrNull`)).iterator()

      while (var3.hasNext()) {
         val e: Char = `$this$minWithOrNull`[var3.nextInt()]
         if (comparator.compare(min, e) > 0) {
            min = e
         }
      }

      return min
   }
}

public inline fun <R> ByteArray.flatMap(transform: (Byte) -> Iterable<Any>): List<Any> {
   val `destination$iv`: java.util.Collection = ArrayList()

   for (`element$iv` in `$this$flatMap`) {
      CollectionsKt.addAll(`destination$iv`, transform(`element$iv`) as java.lang.Iterable)
   }

   return `destination$iv` as MutableList<R>
}

public inline fun <K, V> BooleanArray.groupBy(keySelector: (Boolean) -> Any, valueTransform: (Boolean) -> Any): Map<Any, List<Any>> {
   val `destination$iv`: java.util.Map = LinkedHashMap()

   for (`element$iv` in `$this$groupBy`) {
      val `key$iv`: Any = keySelector(`element$iv`)
      val `value$iv$iv`: Any = `destination$iv`.get(`key$iv`)
      val var10000: Any
      if (`value$iv$iv` == null) {
         val var16: java.util.List = ArrayList()
         `destination$iv`.put(`key$iv`, var16)
         var10000 = var16
      } else {
         var10000 = `value$iv$iv`
      }

      (var10000 as java.util.List).add(valueTransform(`element$iv`))
   }

   return `destination$iv`
}

public final val indices: IntRange
   public final get() {
      return IntRange(0, ArraysKt.getLastIndex(`$this$indices`))
   }


public inline fun ByteArray.last(predicate: (Byte) -> Boolean): Byte {
   var var3: Int = `$this$last`.length + -1
   if (0 <= `$this$last`.length + -1) {
      do {
         val element: Byte = `$this$last`[var3--]
         if (predicate(element) as java.lang.Boolean) {
            return element
         }
      } while (0 <= var3)
   }

   throw NoSuchElementException("Array contains no element matching the predicate.")
}

public fun IntArray.sortDescending() {
   if (`$this$sortDescending`.length > 1) {
      ArraysKt.sort(`$this$sortDescending`)
      ArraysKt.reverse(`$this$sortDescending`)
   }
}

public fun DoubleArray.slice(indices: IntRange): List<Double> {
   return if (indices.isEmpty()) CollectionsKt.emptyList() else ArraysKt.asList(ArraysKt.copyOfRange(`$this$slice`, indices.start, indices.endInclusive + 1))
}

public inline fun ShortArray.first(predicate: (Short) -> Boolean): Short {
   for (element in `$this$first`) {
      if (predicate(element) as java.lang.Boolean) {
         return element
      }
   }

   throw NoSuchElementException("Array contains no element matching the predicate.")
}

@InlineOnly
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
public inline fun CharArray.maxOf(selector: (Char) -> Float): Float {
   if (`$this$maxOf`.length == 0) {
      throw NoSuchElementException()
   } else {
      var maxValue: Float = (selector(`$this$maxOf`[0]) as java.lang.Number).floatValue()
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOf`)).iterator()

      while (var3.hasNext()) {
         maxValue = Math.max(maxValue, (selector(`$this$maxOf`[var3.nextInt()]) as java.lang.Number).floatValue())
      }

      return maxValue
   }
}

public final val lastIndex: Int
   public final get() {
      return `$this$lastIndex`.length - 1
   }


public inline fun ShortArray.indexOfFirst(predicate: (Short) -> Boolean): Int {
   var index: Int = 0

   for (var4 in `$this$indexOfFirst`.length..index) {
      if (predicate(`$this$indexOfFirst`[index]) as java.lang.Boolean) {
         return index
      }
   }

   return -1
}

@InlineOnly
public inline fun <T> Array<out Any>.count(): Int {
   return `$this$count`.length
}

public inline fun ShortArray.any(predicate: (Short) -> Boolean): Boolean {
   for (element in `$this$any`) {
      if (predicate(element) as java.lang.Boolean) {
         return true
      }
   }

   return false
}

@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun LongArray.runningReduceIndexed(operation: (Int, Long, Long) -> Long): List<Long> {
   if (`$this$runningReduceIndexed`.length == 0) {
      return CollectionsKt.emptyList()
   } else {
      var accumulator: Long = 0L
      accumulator = `$this$runningReduceIndexed`[0]
      val index: ArrayList = ArrayList(`$this$runningReduceIndexed`.length)
      index.add(accumulator)
      val result: ArrayList = index
      var var8: Int = 1

      for (var9 in `$this$runningReduceIndexed`.length..var8) {
         accumulator = (operation(var8, accumulator, `$this$runningReduceIndexed`[var8]) as java.lang.Number).longValue()
         result.add(accumulator)
      }

      return result
   }
}

@JvmName(name = "averageOfShort")
public fun Array<out Short>.average(): Double {
   var sum: Double = 0.0
   var count: Int = 0
   var var4: Int = 0

   for (var5 in `$this$average`.length..var4) {
      sum += `$this$average`[var4].shortValue()
      count++
   }

   return if (count == 0) java.lang.Double.NaN else sum / count
}

public fun <C : MutableCollection<in Any>, T : Any> Array<out Any?>.filterNotNullTo(destination: Any): Any {
   for (element in `$this$filterNotNullTo`) {
      if (element != null) {
         destination.add(element)
      }
   }

   return (C)destination
}

public inline fun <R, C : MutableCollection<in Any>> LongArray.mapIndexedTo(destination: Any, transform: (Int, Long) -> Any): Any {
   var index: Int = 0

   for (item in `$this$mapIndexedTo`) {
      destination.add(transform(index++, item))
   }

   return (C)destination
}

public inline fun <V> LongArray.zip(other: LongArray, transform: (Long, Long) -> Any): List<Any> {
   val size: Int = Math.min(`$this$zip`.length, other.length)
   val list: ArrayList = ArrayList(size)

   repeat(size) { i ->
      list.add(transform(`$this$zip`[i], other[i]))
   }

   return list
}

public inline fun <C : MutableCollection<in Char>> CharArray.filterNotTo(destination: Any, predicate: (Char) -> Boolean): Any {
   for (element in `$this$filterNotTo`) {
      if (!predicate(element) as java.lang.Boolean) {
         destination.add(element)
      }
   }

   return (C)destination
}

public inline fun <K> DoubleArray.groupBy(keySelector: (Double) -> Any): Map<Any, List<Double>> {
   val `destination$iv`: java.util.Map = LinkedHashMap()

   for (`element$iv` in `$this$groupBy`) {
      val `key$iv`: Any = keySelector(`element$iv`)
      val `value$iv$iv`: Any = `destination$iv`.get(`key$iv`)
      val var10000: Any
      if (`value$iv$iv` == null) {
         val var16: java.util.List = ArrayList()
         `destination$iv`.put(`key$iv`, var16)
         var10000 = var16
      } else {
         var10000 = `value$iv$iv`
      }

      (var10000 as java.util.List).add(`element$iv`)
   }

   return `destination$iv`
}

@InlineOnly
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@OverloadResolutionByLambdaReturnType
@JvmName(name = "sumOfUInt")
public inline fun ShortArray.sumOf(selector: (Short) -> UInt): UInt {
   var sum: Int = UInt.constructor_impl/* $VF was: constructor-impl */(0)

   for (element in `$this$sumOf`) {
      sum = UInt.constructor_impl/* $VF was: constructor-impl */(sum + (selector(element) as UInt).unbox_impl/* $VF was: unbox-impl */())
   }

   return sum
}

@SinceKotlin(version = "1.4")
@InlineOnly
@OverloadResolutionByLambdaReturnType
public inline fun ShortArray.maxOfOrNull(selector: (Short) -> Float): Float? {
   if (`$this$maxOfOrNull`.length == 0) {
      return null
   } else {
      var maxValue: Float = (selector(`$this$maxOfOrNull`[0]) as java.lang.Number).floatValue()
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfOrNull`)).iterator()

      while (var3.hasNext()) {
         maxValue = Math.max(maxValue, (selector(`$this$maxOfOrNull`[var3.nextInt()]) as java.lang.Number).floatValue())
      }

      return maxValue
   }
}

public fun ShortArray.any(): Boolean {
   return `$this$any`.length != 0
}

@SinceKotlin(version = "1.4")
public inline fun DoubleArray.reduceIndexedOrNull(operation: (Int, Double, Double) -> Double): Double? {
   if (`$this$reduceIndexedOrNull`.length == 0) {
      return null
   } else {
      var accumulator: Double = `$this$reduceIndexedOrNull`[0]
      val var5: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$reduceIndexedOrNull`)).iterator()

      while (var5.hasNext()) {
         val index: Int = var5.nextInt()
         accumulator = (operation(index, accumulator, `$this$reduceIndexedOrNull`[index]) as java.lang.Number).doubleValue()
      }

      return accumulator
   }
}

@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public fun CharArray.randomOrNull(random: Random): Char? {
   return if (`$this$randomOrNull`.length == 0) null else `$this$randomOrNull`[random.nextInt(`$this$randomOrNull`.length)]
}

@InlineOnly
public inline operator fun <T> Array<out Any>.component5(): Any {
   return (T)`$this$component5`[4]
}

public inline fun <T, K> Array<out Any>.groupBy(keySelector: (Any) -> Any): Map<Any, List<Any>> {
   val `destination$iv`: java.util.Map = LinkedHashMap()

   for (`element$iv` in `$this$groupBy`) {
      val `key$iv`: Any = keySelector(`element$iv`)
      val `value$iv$iv`: Any = `destination$iv`.get(`key$iv`)
      val var10000: Any
      if (`value$iv$iv` == null) {
         val var15: java.util.List = ArrayList()
         `destination$iv`.put(`key$iv`, var15)
         var10000 = var15
      } else {
         var10000 = `value$iv$iv`
      }

      (var10000 as java.util.List).add(`element$iv`)
   }

   return `destination$iv`
}

public fun FloatArray.reverse() {
   val midPoint: Int = `$this$reverse`.length / 2 - 1
   if (`$this$reverse`.length / 2 - 1 >= 0) {
      var reverseIndex: Int = ArraysKt.getLastIndex(`$this$reverse`)

      // $VF: Unable to resugar Kotlin loop from Java for loop
      val var3: IntIterator = IntRange(0, midPoint).iterator()
      while (true) {
         if (var3.hasNext()) break
         val index: Int = var3.nextInt()
         val tmp: Float = `$this$reverse`[index]
         `$this$reverse`[index] = `$this$reverse`[reverseIndex]
         `$this$reverse`[reverseIndex] = tmp

         reverseIndex--
      }
   }
}

public fun IntArray.first(): Int {
   if (`$this$first`.length == 0) {
      throw NoSuchElementException("Array is empty.")
   } else {
      return `$this$first`[0]
   }
}

@JvmName(name = "flatMapIndexedIterable")
@InlineOnly
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
public inline fun <R> DoubleArray.flatMapIndexed(transform: (Int, Double) -> Iterable<Any>): List<Any> {
   val var3: java.util.Collection = ArrayList()
   var var4: Int = 0

   for (var7 in `$this$flatMapIndexed`) {
      CollectionsKt.addAll(var3, transform(var4++, var7) as java.lang.Iterable)
   }

   return var3 as MutableList<R>
}

public inline fun ShortArray.firstOrNull(predicate: (Short) -> Boolean): Short? {
   for (element in `$this$firstOrNull`) {
      if (predicate(element) as java.lang.Boolean) {
         return element
      }
   }

   return null
}

public fun ByteArray.toList(): List<Byte> {
   var var10000: java.util.List
   when (`$this$toList`.length) {
      0 -> var10000 = CollectionsKt.emptyList()
      1 -> var10000 = CollectionsKt.listOf(`$this$toList`[0])
      else -> var10000 = ArraysKt.toMutableList(`$this$toList`)
   }

   return var10000
}

@OverloadResolutionByLambdaReturnType
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun ShortArray.maxOfOrNull(selector: (Short) -> Double): Double? {
   if (`$this$maxOfOrNull`.length == 0) {
      return null
   } else {
      var maxValue: Double = (selector(`$this$maxOfOrNull`[0]) as java.lang.Number).doubleValue()
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfOrNull`)).iterator()

      while (var4.hasNext()) {
         maxValue = Math.max(maxValue, (selector(`$this$maxOfOrNull`[var4.nextInt()]) as java.lang.Number).doubleValue())
      }

      return maxValue
   }
}

@SinceKotlin(version = "1.4")
@InlineOnly
@OverloadResolutionByLambdaReturnType
@JvmName(name = "sumOfDouble")
public inline fun LongArray.sumOf(selector: (Long) -> Double): Double {
   var sum: Double = 0.0

   for (element in `$this$sumOf`) {
      sum += (selector(element) as java.lang.Number).doubleValue()
   }

   return sum
}

public inline fun <K, V, M : MutableMap<in Any, MutableList<Any>>> IntArray.groupByTo(destination: Any, keySelector: (Int) -> Any, valueTransform: (Int) -> Any): Any {
   for (element in `$this$groupByTo`) {
      val key: Any = keySelector(element)
      val `value$iv`: Any = destination.get(key)
      val var10000: Any
      if (`value$iv` == null) {
         val var14: java.util.List = ArrayList()
         destination.put(key, var14)
         var10000 = var14
      } else {
         var10000 = `value$iv`
      }

      (var10000 as java.util.List).add(valueTransform(element))
   }

   return (M)destination
}

public inline fun <K, M : MutableMap<in Any, in Int>> IntArray.associateByTo(destination: Any, keySelector: (Int) -> Any): Any {
   for (element in `$this$associateByTo`) {
      destination.put(keySelector(element), element)
   }

   return (M)destination
}

public infix fun BooleanArray.zip(other: BooleanArray): List<Pair<Boolean, Boolean>> {
   val `$this$zip$iv`: BooleanArray = `$this$zip`
   val `size$iv`: Int = Math.min(`$this$zip`.length, other.length)
   val `list$iv`: ArrayList = ArrayList(`size$iv`)

   repeat(`size$iv`) { `i$iv` ->
      `list$iv`.add(`$this$zip$iv`[`i$iv`] to other[`i$iv`])
   }

   return `list$iv`
}

@InlineOnly
public inline fun IntArray.find(predicate: (Int) -> Boolean): Int? {
   val `$this$firstOrNull$iv`: IntArray = `$this$find`
   var var4: Int = 0
   val var5: Int = `$this$find`.length

   var var10000: Int
   while (true) {
      if (var4 >= var5) {
         var10000 = null
         break
      }

      val `element$iv`: Int = `$this$firstOrNull$iv`[var4]
      if (predicate(`$this$firstOrNull$iv`[var4]) as java.lang.Boolean) {
         var10000 = `element$iv`
         break
      }

      var4++
   }

   return var10000
}

public inline fun <R> FloatArray.map(transform: (Float) -> Any): List<Any> {
   val `destination$iv`: java.util.Collection = ArrayList(`$this$map`.length)

   for (`item$iv` in `$this$map`) {
      `destination$iv`.add(transform(`item$iv`))
   }

   return `destination$iv` as MutableList<R>
}

@InlineOnly
public inline fun FloatArray.elementAtOrElse(index: Int, defaultValue: (Int) -> Float): Float {
   return if (index >= 0 && index <= ArraysKt.getLastIndex(`$this$elementAtOrElse`))
      `$this$elementAtOrElse`[index]
      else
      (defaultValue(index) as java.lang.Number).floatValue()
   }

public inline fun <R> DoubleArray.mapIndexed(transform: (Int, Double) -> Any): List<Any> {
   val `destination$iv`: java.util.Collection = ArrayList(`$this$mapIndexed`.length)
   var `index$iv`: Int = 0

   for (`item$iv` in `$this$mapIndexed`) {
      `destination$iv`.add(transform(`index$iv`++, `item$iv`))
   }

   return `destination$iv` as MutableList<R>
}

public inline fun <K, M : MutableMap<in Any, in Char>> CharArray.associateByTo(destination: Any, keySelector: (Char) -> Any): Any {
   for (element in `$this$associateByTo`) {
      destination.put(keySelector(element), element)
   }

   return (M)destination
}

public inline fun DoubleArray.reduce(operation: (Double, Double) -> Double): Double {
   if (`$this$reduce`.length == 0) {
      throw UnsupportedOperationException("Empty array can't be reduced.")
   } else {
      var accumulator: Double = `$this$reduce`[0]
      val var5: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$reduce`)).iterator()

      while (var5.hasNext()) {
         accumulator = (operation(accumulator, `$this$reduce`[var5.nextInt()]) as java.lang.Number).doubleValue()
      }

      return accumulator
   }
}

public inline fun <R : Comparable<Any>> CharArray.sortedBy(crossinline selector: (Char) -> Any?): List<Char> {
   return ArraysKt.sortedWith((char[])`$this$sortedBy`,    // $VF: Compiled from Comparisons.kt
{ a: Any, b: Any ->
      val var3: Function1 = selector
      return ComparisonsKt.compareValues((T)(selector(a) as java.lang.Comparable), (T)(var3(b) as java.lang.Comparable))
   })
}

@InlineOnly
public inline fun ShortArray.findLast(predicate: (Short) -> Boolean): Short? {
   val `$this$lastOrNull$iv`: ShortArray = `$this$findLast`
   var var4: Int = `$this$findLast`.length + -1
   if (0 <= `$this$findLast`.length + -1) {
      do {
         val `element$iv`: Short = `$this$lastOrNull$iv`[var4--]
         if (predicate(`element$iv`) as java.lang.Boolean) {
            return `element$iv`
         }
      } while (0 <= var4)
   }

   return null
}

public inline fun CharArray.singleOrNull(predicate: (Char) -> Boolean): Char? {
   var single: Character = null
   var found: Boolean = false

   for (element in `$this$singleOrNull`) {
      if (predicate(element) as java.lang.Boolean) {
         if (found) {
            return null
         }

         single = element
         found = true
      }
   }

   return if (!found) null else single
}

public inline fun <C : MutableCollection<in Float>> FloatArray.filterNotTo(destination: Any, predicate: (Float) -> Boolean): Any {
   for (element in `$this$filterNotTo`) {
      if (!predicate(element) as java.lang.Boolean) {
         destination.add(element)
      }
   }

   return (C)destination
}

@OverloadResolutionByLambdaReturnType
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun <T, R : Comparable<Any>> Array<out Any>.maxOf(selector: (Any) -> Any): Any {
   if (`$this$maxOf`.length == 0) {
      throw NoSuchElementException()
   } else {
      var maxValue: java.lang.Comparable = selector(`$this$maxOf`[0]) as java.lang.Comparable
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOf`)).iterator()

      while (var3.hasNext()) {
         val v: java.lang.Comparable = selector(`$this$maxOf`[var3.nextInt()]) as java.lang.Comparable
         if (maxValue.compareTo(v) < 0) {
            maxValue = v
         }
      }

      return (R)maxValue
   }
}

public inline fun BooleanArray.last(predicate: (Boolean) -> Boolean): Boolean {
   var var3: Int = `$this$last`.length + -1
   if (0 <= `$this$last`.length + -1) {
      do {
         val element: Boolean = `$this$last`[var3--]
         if (predicate(element) as java.lang.Boolean) {
            return element
         }
      } while (0 <= var3)
   }

   throw NoSuchElementException("Array contains no element matching the predicate.")
}

public inline fun <R> DoubleArray.map(transform: (Double) -> Any): List<Any> {
   val `destination$iv`: java.util.Collection = ArrayList(`$this$map`.length)

   for (`item$iv` in `$this$map`) {
      `destination$iv`.add(transform(`item$iv`))
   }

   return `destination$iv` as MutableList<R>
}

public inline fun CharArray.filterNot(predicate: (Char) -> Boolean): List<Char> {
   val `destination$iv`: java.util.Collection = ArrayList()

   for (`element$iv` in `$this$filterNot`) {
      if (!predicate(`element$iv`) as java.lang.Boolean) {
         `destination$iv`.add(`element$iv`)
      }
   }

   return `destination$iv` as MutableList<Character>
}

public inline fun <R : Comparable<Any>> FloatArray.sortedByDescending(crossinline selector: (Float) -> Any?): List<Float> {
   return ArraysKt.sortedWith(`$this$sortedByDescending`,    // $VF: Compiled from Comparisons.kt
{ a: Any, b: Any ->
      val var3: Function1 = selector
      return ComparisonsKt.compareValues((T)(selector(b) as java.lang.Comparable), (T)(var3(a) as java.lang.Comparable))
   })
}

public inline fun ByteArray.all(predicate: (Byte) -> Boolean): Boolean {
   for (element in `$this$all`) {
      if (!predicate(element) as java.lang.Boolean) {
         return false
      }
   }

   return true
}

public inline fun <K, V> FloatArray.groupBy(keySelector: (Float) -> Any, valueTransform: (Float) -> Any): Map<Any, List<Any>> {
   val `destination$iv`: java.util.Map = LinkedHashMap()

   for (`element$iv` in `$this$groupBy`) {
      val `key$iv`: Any = keySelector(`element$iv`)
      val `value$iv$iv`: Any = `destination$iv`.get(`key$iv`)
      val var10000: Any
      if (`value$iv$iv` == null) {
         val var16: java.util.List = ArrayList()
         `destination$iv`.put(`key$iv`, var16)
         var10000 = var16
      } else {
         var10000 = `value$iv$iv`
      }

      (var10000 as java.util.List).add(valueTransform(`element$iv`))
   }

   return `destination$iv`
}

@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
@JvmName(name = "flatMapIndexedIterable")
@InlineOnly
public inline fun <R> LongArray.flatMapIndexed(transform: (Int, Long) -> Iterable<Any>): List<Any> {
   val var3: java.util.Collection = ArrayList()
   var var4: Int = 0

   for (var7 in `$this$flatMapIndexed`) {
      CollectionsKt.addAll(var3, transform(var4++, var7) as java.lang.Iterable)
   }

   return var3 as MutableList<R>
}

public infix fun ByteArray.union(other: Iterable<Byte>): Set<Byte> {
   val set: java.util.Set = ArraysKt.toMutableSet(`$this$union`)
   CollectionsKt.addAll(set, other)
   return set
}

@InlineOnly
public inline fun DoubleArray.find(predicate: (Double) -> Boolean): Double? {
   val `$this$firstOrNull$iv`: DoubleArray = `$this$find`
   var var4: Int = 0
   val var5: Int = `$this$find`.length

   var var10000: java.lang.Double
   while (true) {
      if (var4 >= var5) {
         var10000 = null
         break
      }

      val `element$iv`: Double = `$this$firstOrNull$iv`[var4]
      if (predicate(`$this$firstOrNull$iv`[var4]) as java.lang.Boolean) {
         var10000 = `element$iv`
         break
      }

      var4++
   }

   return var10000
}

@InlineOnly
public inline fun LongArray.isNotEmpty(): Boolean {
   return `$this$isNotEmpty`.length != 0
}

public fun ShortArray.drop(n: Int): List<Short> {
   if (n < 0) {
      throw IllegalArgumentException(("Requested element count $n is less than zero.").toString())
   } else {
      return ArraysKt.takeLast((short[])`$this$drop`, RangesKt.coerceAtLeast(`$this$drop`.length - n, 0))
   }
}

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@InlineOnly
@JvmName(name = "sumOfUInt")
public inline fun BooleanArray.sumOf(selector: (Boolean) -> UInt): UInt {
   var sum: Int = UInt.constructor_impl/* $VF was: constructor-impl */(0)

   for (element in `$this$sumOf`) {
      sum = UInt.constructor_impl/* $VF was: constructor-impl */(sum + (selector(element) as UInt).unbox_impl/* $VF was: unbox-impl */())
   }

   return sum
}

public fun <T> Array<out Any>.drop(n: Int): List<Any> {
   if (n < 0) {
      throw IllegalArgumentException(("Requested element count $n is less than zero.").toString())
   } else {
      return (java.util.List<T>)ArraysKt.takeLast((Object[])`$this$drop`, RangesKt.coerceAtLeast(`$this$drop`.length - n, 0))
   }
}

public fun CharArray.slice(indices: IntRange): List<Char> {
   return if (indices.isEmpty())
      CollectionsKt.emptyList()
      else
      ArraysKt.asList(ArraysKt.copyOfRange((char[])`$this$slice`, indices.start, indices.endInclusive + 1))
   }

@InlineOnly
public inline operator fun <T> Array<out Any>.component3(): Any {
   return (T)`$this$component3`[2]
}

@OverloadResolutionByLambdaReturnType
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun ByteArray.minOfOrNull(selector: (Byte) -> Double): Double? {
   if (`$this$minOfOrNull`.length == 0) {
      return null
   } else {
      var minValue: Double = (selector(`$this$minOfOrNull`[0]) as java.lang.Number).doubleValue()
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfOrNull`)).iterator()

      while (var4.hasNext()) {
         minValue = Math.min(minValue, (selector(`$this$minOfOrNull`[var4.nextInt()]) as java.lang.Number).doubleValue())
      }

      return minValue
   }
}

@SinceKotlin(version = "1.4")
public inline fun ByteArray.reduceRightIndexedOrNull(operation: (Int, Byte, Byte) -> Byte): Byte? {
   var index: Int = ArraysKt.getLastIndex(`$this$reduceRightIndexedOrNull`)
   if (index < 0) {
      return null
   } else {
      var accumulator: Byte = `$this$reduceRightIndexedOrNull`[index--]

      while (index >= 0) {
         accumulator = (operation(index, `$this$reduceRightIndexedOrNull`[index], accumulator) as java.lang.Number).byteValue()
         index--
      }

      return accumulator
   }
}

public fun <C : MutableCollection<in Byte>> ByteArray.toCollection(destination: Any): Any {
   for (item in `$this$toCollection`) {
      destination.add(item)
   }

   return (C)destination
}

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun LongArray.minOfOrNull(selector: (Long) -> Double): Double? {
   if (`$this$minOfOrNull`.length == 0) {
      return null
   } else {
      var minValue: Double = (selector(`$this$minOfOrNull`[0]) as java.lang.Number).doubleValue()
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfOrNull`)).iterator()

      while (var4.hasNext()) {
         minValue = Math.min(minValue, (selector(`$this$minOfOrNull`[var4.nextInt()]) as java.lang.Number).doubleValue())
      }

      return minValue
   }
}

@InlineOnly
public inline operator fun ByteArray.component4(): Byte {
   return `$this$component4`[3]
}

public inline fun <V> IntArray.zip(other: IntArray, transform: (Int, Int) -> Any): List<Any> {
   val size: Int = Math.min(`$this$zip`.length, other.length)
   val list: ArrayList = ArrayList(size)

   repeat(size) { i ->
      list.add(transform(`$this$zip`[i], other[i]))
   }

   return list
}

@JvmName(name = "averageOfDouble")
public fun Array<out Double>.average(): Double {
   var sum: Double = 0.0
   var count: Int = 0
   var var4: Int = 0

   for (var5 in `$this$average`.length..var4) {
      sum += `$this$average`[var4]
      count++
   }

   return if (count == 0) java.lang.Double.NaN else sum / count
}

public inline fun <R, C : MutableCollection<in Any>> ByteArray.flatMapTo(destination: Any, transform: (Byte) -> Iterable<Any>): Any {
   for (element in `$this$flatMapTo`) {
      CollectionsKt.addAll(destination, transform(element) as java.lang.Iterable)
   }

   return (C)destination
}

@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
@InlineOnly
public inline fun BooleanArray.minOf(selector: (Boolean) -> Double): Double {
   if (`$this$minOf`.length == 0) {
      throw NoSuchElementException()
   } else {
      var minValue: Double = (selector(`$this$minOf`[0]) as java.lang.Number).doubleValue()
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOf`)).iterator()

      while (var4.hasNext()) {
         minValue = Math.min(minValue, (selector(`$this$minOf`[var4.nextInt()]) as java.lang.Number).doubleValue())
      }

      return minValue
   }
}

public fun BooleanArray.toHashSet(): HashSet<Boolean> {
   return ArraysKt.toCollection(`$this$toHashSet`, HashSet<>(MapsKt.mapCapacity(`$this$toHashSet`.length)))
}

public inline fun DoubleArray.firstOrNull(predicate: (Double) -> Boolean): Double? {
   for (element in `$this$firstOrNull`) {
      if (predicate(element) as java.lang.Boolean) {
         return element
      }
   }

   return null
}

public fun FloatArray.any(): Boolean {
   return `$this$any`.length != 0
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun IntArray.runningReduce(operation: (Int, Int) -> Int): List<Int> {
   if (`$this$runningReduce`.length == 0) {
      return CollectionsKt.emptyList()
   } else {
      var var7: Int = `$this$runningReduce`[0]
      val index: ArrayList = ArrayList(`$this$runningReduce`.length)
      index.add(var7)
      val result: ArrayList = index
      var var8: Int = 1

      for (var9 in `$this$runningReduce`.length..var8) {
         var7 = (operation(var7, `$this$runningReduce`[var8]) as java.lang.Number).intValue()
         result.add(var7)
      }

      return result
   }
}

public inline fun <R> FloatArray.fold(initial: Any, operation: (Any, Float) -> Any): Any {
   var accumulator: Any = initial

   for (element in `$this$fold`) {
      accumulator = operation(accumulator, element)
   }

   return (R)accumulator
}

@Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = []))
@DeprecatedSinceKotlin(warningSince = "1.5")
public inline fun IntArray.sumByDouble(selector: (Int) -> Double): Double {
   var sum: Double = 0.0

   for (element in `$this$sumByDouble`) {
      sum += (selector(element) as java.lang.Number).doubleValue()
   }

   return sum
}

@InlineOnly
public inline operator fun DoubleArray.component4(): Double {
   return `$this$component4`[3]
}

public inline fun ByteArray.takeWhile(predicate: (Byte) -> Boolean): List<Byte> {
   val list: ArrayList = ArrayList()

   for (item in `$this$takeWhile`) {
      if (!predicate(item) as java.lang.Boolean) {
         break
      }

      list.add(item)
   }

   return list
}

public fun <T> Array<Any>.sliceArray(indices: Collection<Int>): Array<Any> {
   val result: Array<Any> = ArraysKt.arrayOfNulls(`$this$sliceArray`, indices.size())
   var targetIndex: Int = 0
   val var4: java.util.Iterator = indices.iterator()

   while (var4.hasNext()) {
      result[targetIndex++] = `$this$sliceArray`[(var4.next() as java.lang.Number).intValue()]
   }

   return (T[])result
}

public inline fun LongArray.first(predicate: (Long) -> Boolean): Long {
   for (element in `$this$first`) {
      if (predicate(element) as java.lang.Boolean) {
         return element
      }
   }

   throw NoSuchElementException("Array contains no element matching the predicate.")
}

public inline fun BooleanArray.single(predicate: (Boolean) -> Boolean): Boolean {
   var single: java.lang.Boolean = null
   var found: Boolean = false

   for (element in `$this$single`) {
      if (predicate(element) as java.lang.Boolean) {
         if (found) {
            throw IllegalArgumentException("Array contains more than one matching element.")
         }

         single = element
         found = true
      }
   }

   if (!found) {
      throw NoSuchElementException("Array contains no element matching the predicate.")
   } else {
      return single
   }
}

public inline fun CharArray.last(predicate: (Char) -> Boolean): Char {
   var var3: Int = `$this$last`.length + -1
   if (0 <= `$this$last`.length + -1) {
      do {
         val element: Char = `$this$last`[var3--]
         if (predicate(element) as java.lang.Boolean) {
            return element
         }
      } while (0 <= var3)
   }

   throw NoSuchElementException("Array contains no element matching the predicate.")
}

public inline fun ByteArray.takeLastWhile(predicate: (Byte) -> Boolean): List<Byte> {
   for (index in ArraysKt.getLastIndex(`$this$takeLastWhile`) downTo 0) {
      if (!predicate(`$this$takeLastWhile`[index]) as java.lang.Boolean) {
         return ArraysKt.drop((byte[])`$this$takeLastWhile`, index + 1)
      }
   }

   return ArraysKt.toList(`$this$takeLastWhile`)
}

@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun <R> ByteArray.runningFold(initial: Any, operation: (Any, Byte) -> Any): List<Any> {
   if (`$this$runningFold`.length == 0) {
      return (java.util.List<R>)CollectionsKt.listOf(initial)
   } else {
      var accumulator: Any = ArrayList(`$this$runningFold`.length + 1)
      accumulator.add(initial)
      val result: Any = accumulator
      accumulator = initial

      for (element in `$this$runningFold`) {
         accumulator = operation(accumulator, element)
         result.add(accumulator)
      }

      return result as MutableList<R>
   }
}

public inline fun <K, V, M : MutableMap<in Any, in Any>> ByteArray.associateByTo(destination: Any, keySelector: (Byte) -> Any, valueTransform: (Byte) -> Any): Any {
   for (element in `$this$associateByTo`) {
      destination.put(keySelector(element), valueTransform(element))
   }

   return (M)destination
}

@JvmName(name = "maxOrThrow")
@SinceKotlin(version = "1.7")
public fun <T : Comparable<Any>> Array<out Any>.max(): Any {
   if (`$this$max`.length == 0) {
      throw NoSuchElementException()
   } else {
      var max: java.lang.Comparable = `$this$max`[0]
      val var2: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$max`)).iterator()

      while (var2.hasNext()) {
         val e: java.lang.Comparable = `$this$max`[var2.nextInt()]
         if (max.compareTo(e) < 0) {
            max = e
         }
      }

      return (T)max
   }
}

@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
@InlineOnly
public inline fun <R> BooleanArray.minOfWith(comparator: Comparator<in Any>, selector: (Boolean) -> Any): Any {
   if (`$this$minOfWith`.length == 0) {
      throw NoSuchElementException()
   } else {
      var minValue: Any = selector(`$this$minOfWith`[0])
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfWith`)).iterator()

      while (var4.hasNext()) {
         val v: Any = selector(`$this$minOfWith`[var4.nextInt()])
         if (comparator.compare(minValue, v) > 0) {
            minValue = v
         }
      }

      return (R)minValue
   }
}

@SinceKotlin(version = "1.4")
public inline fun <R : Comparable<Any>> ShortArray.minByOrNull(selector: (Short) -> Any): Short? {
   if (`$this$minByOrNull`.length == 0) {
      return null
   } else {
      var minElem: Short = `$this$minByOrNull`[0]
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$minByOrNull`)
      if (lastIndex == 0) {
         return minElem
      } else {
         var minValue: java.lang.Comparable = selector(minElem) as java.lang.Comparable
         val var6: IntIterator = IntRange(1, lastIndex).iterator()

         while (var6.hasNext()) {
            val e: Short = `$this$minByOrNull`[var6.nextInt()]
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

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.4")
public fun <T> Array<out Any>.randomOrNull(random: Random): Any? {
   return (T)(if (`$this$randomOrNull`.length == 0) null else `$this$randomOrNull`[random.nextInt(`$this$randomOrNull`.length)])
}

public fun <T> Array<out Any>.toList(): List<Any> {
   var var10000: java.util.List
   when (`$this$toList`.length) {
      0 -> var10000 = CollectionsKt.emptyList()
      1 -> var10000 = CollectionsKt.listOf(`$this$toList`[0])
      else -> var10000 = ArraysKt.toMutableList(`$this$toList`)
   }

   return var10000
}

@Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = []))
@DeprecatedSinceKotlin(warningSince = "1.5")
public inline fun DoubleArray.sumBy(selector: (Double) -> Int): Int {
   var sum: Int = 0

   for (element in `$this$sumBy`) {
      sum += (selector(element) as java.lang.Number).intValue()
   }

   return sum
}

@OverloadResolutionByLambdaReturnType
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun <T> Array<out Any>.maxOfOrNull(selector: (Any) -> Double): Double? {
   if (`$this$maxOfOrNull`.length == 0) {
      return null
   } else {
      var maxValue: Double = (selector(`$this$maxOfOrNull`[0]) as java.lang.Number).doubleValue()
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfOrNull`)).iterator()

      while (var4.hasNext()) {
         maxValue = Math.max(maxValue, (selector(`$this$maxOfOrNull`[var4.nextInt()]) as java.lang.Number).doubleValue())
      }

      return maxValue
   }
}

public fun FloatArray.sortedArrayDescending(): FloatArray {
   if (`$this$sortedArrayDescending`.length == 0) {
      return `$this$sortedArrayDescending`
   } else {
      val var10000: FloatArray = Arrays.copyOf(`$this$sortedArrayDescending`, `$this$sortedArrayDescending`.length)
      ArraysKt.sortDescending(var10000)
      return var10000
   }
}

public inline fun BooleanArray.dropWhile(predicate: (Boolean) -> Boolean): List<Boolean> {
   var yielding: Boolean = false
   val list: ArrayList = ArrayList()

   for (item in `$this$dropWhile`) {
      if (yielding) {
         list.add(item)
      } else if (!predicate(item) as java.lang.Boolean) {
         list.add(item)
         yielding = true
      }
   }

   return list
}

public inline fun <K, M : MutableMap<in Any, MutableList<Long>>> LongArray.groupByTo(destination: Any, keySelector: (Long) -> Any): Any {
   for (element in `$this$groupByTo`) {
      val key: Any = keySelector(element)
      val `value$iv`: Any = destination.get(key)
      val var10000: Any
      if (`value$iv` == null) {
         val var14: java.util.List = ArrayList()
         destination.put(key, var14)
         var10000 = var14
      } else {
         var10000 = `value$iv`
      }

      (var10000 as java.util.List).add(element)
   }

   return (M)destination
}

public fun DoubleArray.sum(): Double {
   var sum: Double = 0.0

   for (element in `$this$sum`) {
      sum += element
   }

   return sum
}

@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public fun ByteArray.randomOrNull(random: Random): Byte? {
   return if (`$this$randomOrNull`.length == 0) null else `$this$randomOrNull`[random.nextInt(`$this$randomOrNull`.length)]
}

@SinceKotlin(version = "1.7")
@JvmName(name = "minByOrThrow")
public inline fun <R : Comparable<Any>> LongArray.minBy(selector: (Long) -> Any): Long {
   if (`$this$minBy`.length == 0) {
      throw NoSuchElementException()
   } else {
      var minElem: Long = `$this$minBy`[0]
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$minBy`)
      if (lastIndex == 0) {
         return minElem
      } else {
         var minValue: java.lang.Comparable = selector(minElem) as java.lang.Comparable
         val var7: IntIterator = IntRange(1, lastIndex).iterator()

         while (var7.hasNext()) {
            val e: Long = `$this$minBy`[var7.nextInt()]
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

@SinceKotlin(version = "1.4")
public fun IntArray.shuffle(random: Random) {
   for (i in ArraysKt.getLastIndex(`$this$shuffle`) downTo 1) {
      val j: Int = random.nextInt(i + 1)
      val copy: Int = `$this$shuffle`[i]
      `$this$shuffle`[i] = `$this$shuffle`[j]
      `$this$shuffle`[j] = copy
   }
}

public infix fun <R> IntArray.zip(other: Iterable<Any>): List<Pair<Int, Any>> {
   val `$this$zip$iv`: IntArray = `$this$zip`
   val `arraySize$iv`: Int = `$this$zip`.length
   val `list$iv`: ArrayList = ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(other, 10), `$this$zip`.length))
   var `i$iv`: Int = 0

   for (`element$iv` in other) {
      if (`i$iv` >= `arraySize$iv`) {
         break
      }

      `list$iv`.add(`$this$zip$iv`[`i$iv`++] to `element$iv`)
   }

   return `list$iv`
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.4")
public fun ShortArray.randomOrNull(random: Random): Short? {
   return if (`$this$randomOrNull`.length == 0) null else `$this$randomOrNull`[random.nextInt(`$this$randomOrNull`.length)]
}

@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@JvmName(name = "sumOfUInt")
@SinceKotlin(version = "1.5")
@InlineOnly
@OverloadResolutionByLambdaReturnType
public inline fun DoubleArray.sumOf(selector: (Double) -> UInt): UInt {
   var sum: Int = UInt.constructor_impl/* $VF was: constructor-impl */(0)

   for (element in `$this$sumOf`) {
      sum = UInt.constructor_impl/* $VF was: constructor-impl */(sum + (selector(element) as UInt).unbox_impl/* $VF was: unbox-impl */())
   }

   return sum
}

public inline fun <R : Comparable<Any>> IntArray.sortedByDescending(crossinline selector: (Int) -> Any?): List<Int> {
   return ArraysKt.sortedWith((int[])`$this$sortedByDescending`,    // $VF: Compiled from Comparisons.kt
{ a: Any, b: Any ->
      val var3: Function1 = selector
      return ComparisonsKt.compareValues((T)(selector(b) as java.lang.Comparable), (T)(var3(a) as java.lang.Comparable))
   })
}

@InlineOnly
public inline fun IntArray.elementAtOrElse(index: Int, defaultValue: (Int) -> Int): Int {
   return if (index >= 0 && index <= ArraysKt.getLastIndex(`$this$elementAtOrElse`))
      `$this$elementAtOrElse`[index]
      else
      (defaultValue(index) as java.lang.Number).intValue()
   }

public inline fun <K, M : MutableMap<in Any, in Short>> ShortArray.associateByTo(destination: Any, keySelector: (Short) -> Any): Any {
   for (element in `$this$associateByTo`) {
      destination.put(keySelector(element), element)
   }

   return (M)destination
}

@SinceKotlin(version = "1.4")
public inline fun CharArray.reduceIndexedOrNull(operation: (Int, Char, Char) -> Char): Char? {
   if (`$this$reduceIndexedOrNull`.length == 0) {
      return null
   } else {
      var accumulator: Char = `$this$reduceIndexedOrNull`[0]
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$reduceIndexedOrNull`)).iterator()

      while (var4.hasNext()) {
         val index: Int = var4.nextInt()
         accumulator = operation(index, accumulator, `$this$reduceIndexedOrNull`[index]) as Character
      }

      return accumulator
   }
}

public inline fun LongArray.forEach(action: (Long) -> Unit) {
   for (element in `$this$forEach`) {
      action(element)
   }
}

@SinceKotlin(version = "1.4")
@InlineOnly
@OverloadResolutionByLambdaReturnType
public inline fun <R : Comparable<Any>> DoubleArray.minOf(selector: (Double) -> Any): Any {
   if (`$this$minOf`.length == 0) {
      throw NoSuchElementException()
   } else {
      var minValue: java.lang.Comparable = selector(`$this$minOf`[0]) as java.lang.Comparable
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOf`)).iterator()

      while (var3.hasNext()) {
         val v: java.lang.Comparable = selector(`$this$minOf`[var3.nextInt()]) as java.lang.Comparable
         if (minValue.compareTo(v) > 0) {
            minValue = v
         }
      }

      return (R)minValue
   }
}

@SinceKotlin(version = "1.7")
@JvmName(name = "minOrThrow")
public fun DoubleArray.min(): Double {
   if (`$this$min`.length == 0) {
      throw NoSuchElementException()
   } else {
      var min: Double = `$this$min`[0]
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$min`)).iterator()

      while (var3.hasNext()) {
         min = Math.min(min, `$this$min`[var3.nextInt()])
      }

      return min
   }
}

public fun LongArray.none(): Boolean {
   return `$this$none`.length == 0
}

public fun LongArray.average(): Double {
   var sum: Double = 0.0
   var count: Int = 0

   for (element in `$this$average`) {
      sum += element
      count++
   }

   return if (count == 0) java.lang.Double.NaN else sum / count
}

public fun CharArray.toHashSet(): HashSet<Char> {
   return ArraysKt.toCollection((char[])`$this$toHashSet`, HashSet<>(MapsKt.mapCapacity(RangesKt.coerceAtMost(`$this$toHashSet`.length, 128))))
}

public inline fun <R> ByteArray.foldIndexed(initial: Any, operation: (Int, Any, Byte) -> Any): Any {
   var index: Int = 0
   var accumulator: Any = initial

   for (element in `$this$foldIndexed`) {
      accumulator = operation(index++, accumulator, element)
   }

   return (R)accumulator
}

public inline fun <K, V> FloatArray.associate(transform: (Float) -> Pair<Any, Any>): Map<Any, Any> {
   val `destination$iv`: java.util.Map = LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(`$this$associate`.length), 16))

   for (`element$iv` in `$this$associate`) {
      val var11: Pair = transform(`element$iv`) as Pair
      `destination$iv`.put(var11.first, var11.second)
   }

   return `destination$iv`
}

public inline fun IntArray.last(predicate: (Int) -> Boolean): Int {
   var var3: Int = `$this$last`.length + -1
   if (0 <= `$this$last`.length + -1) {
      do {
         val element: Int = `$this$last`[var3--]
         if (predicate(element) as java.lang.Boolean) {
            return element
         }
      } while (0 <= var3)
   }

   throw NoSuchElementException("Array contains no element matching the predicate.")
}

public inline fun <C : MutableCollection<in Double>> DoubleArray.filterTo(destination: Any, predicate: (Double) -> Boolean): Any {
   for (element in `$this$filterTo`) {
      if (predicate(element) as java.lang.Boolean) {
         destination.add(element)
      }
   }

   return (C)destination
}

public inline fun ShortArray.forEach(action: (Short) -> Unit) {
   for (element in `$this$forEach`) {
      action(element)
   }
}

@SinceKotlin(version = "1.4")
@InlineOnly
@OverloadResolutionByLambdaReturnType
@JvmName(name = "sumOfDouble")
public inline fun ByteArray.sumOf(selector: (Byte) -> Double): Double {
   var sum: Double = 0.0

   for (element in `$this$sumOf`) {
      sum += (selector(element) as java.lang.Number).doubleValue()
   }

   return sum
}

@InlineOnly
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
public inline fun <R : Comparable<Any>> IntArray.maxOf(selector: (Int) -> Any): Any {
   if (`$this$maxOf`.length == 0) {
      throw NoSuchElementException()
   } else {
      var maxValue: java.lang.Comparable = selector(`$this$maxOf`[0]) as java.lang.Comparable
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOf`)).iterator()

      while (var3.hasNext()) {
         val v: java.lang.Comparable = selector(`$this$maxOf`[var3.nextInt()]) as java.lang.Comparable
         if (maxValue.compareTo(v) < 0) {
            maxValue = v
         }
      }

      return (R)maxValue
   }
}

public fun LongArray.lastIndexOf(element: Long): Int {
   var var3: Int = `$this$lastIndexOf`.length + -1
   if (0 <= `$this$lastIndexOf`.length + -1) {
      do {
         val index: Int = var3--
         if (element == `$this$lastIndexOf`[index]) {
            return index
         }
      } while (0 <= var3)
   }

   return -1
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.4")
public inline fun DoubleArray.reduceRightOrNull(operation: (Double, Double) -> Double): Double? {
   var index: Int = ArraysKt.getLastIndex(`$this$reduceRightOrNull`)
   if (index < 0) {
      return null
   } else {
      var accumulator: Double = `$this$reduceRightOrNull`[index--]

      while (index >= 0) {
         accumulator = (operation(`$this$reduceRightOrNull`[index--], accumulator) as java.lang.Number).doubleValue()
      }

      return accumulator
   }
}

public inline fun FloatArray.lastOrNull(predicate: (Float) -> Boolean): Float? {
   var var3: Int = `$this$lastOrNull`.length + -1
   if (0 <= `$this$lastOrNull`.length + -1) {
      do {
         val element: Float = `$this$lastOrNull`[var3--]
         if (predicate(element) as java.lang.Boolean) {
            return element
         }
      } while (0 <= var3)
   }

   return null
}

public fun <A : Appendable> DoubleArray.joinTo(
   buffer: Any,
   separator: CharSequence = ...,
   prefix: CharSequence = ...,
   postfix: CharSequence = ...,
   limit: Int = ...,
   truncated: CharSequence = ...,
   transform: ((Double) -> CharSequence)? = ...
): Any {
   buffer.append(prefix)
   val count: Int = 0

   for (element in `$this$joinTo`) {
      if (++count > 1) {
         buffer.append(separator)
      }

      if (limit >= 0 && count > limit) {
         break
      }

      if (transform != null) {
         buffer.append(transform(element) as java.lang.CharSequence)
      } else {
         buffer.append(java.lang.String.valueOf(element))
      }
   }

   if (limit >= 0 && count > limit) {
      buffer.append(truncated)
   }

   buffer.append(postfix)
   return (A)buffer
}

public inline fun FloatArray.indexOfFirst(predicate: (Float) -> Boolean): Int {
   var index: Int = 0

   for (var4 in `$this$indexOfFirst`.length..index) {
      if (predicate(`$this$indexOfFirst`[index]) as java.lang.Boolean) {
         return index
      }
   }

   return -1
}

public final val indices: IntRange
   public final get() {
      return IntRange(0, ArraysKt.getLastIndex(`$this$indices`))
   }


public fun BooleanArray.sliceArray(indices: Collection<Int>): BooleanArray {
   val result: BooleanArray = BooleanArray(indices.size())
   var targetIndex: Int = 0
   val var4: java.util.Iterator = indices.iterator()

   while (var4.hasNext()) {
      result[targetIndex++] = `$this$sliceArray`[(var4.next() as java.lang.Number).intValue()]
   }

   return result
}

public inline fun IntArray.indexOfFirst(predicate: (Int) -> Boolean): Int {
   var index: Int = 0

   for (var4 in `$this$indexOfFirst`.length..index) {
      if (predicate(`$this$indexOfFirst`[index]) as java.lang.Boolean) {
         return index
      }
   }

   return -1
}

public inline fun <R> BooleanArray.flatMap(transform: (Boolean) -> Iterable<Any>): List<Any> {
   val `destination$iv`: java.util.Collection = ArrayList()

   for (`element$iv` in `$this$flatMap`) {
      CollectionsKt.addAll(`destination$iv`, transform(`element$iv`) as java.lang.Iterable)
   }

   return `destination$iv` as MutableList<R>
}

@SinceKotlin(version = "1.4")
public fun FloatArray.shuffle(random: Random) {
   for (i in ArraysKt.getLastIndex(`$this$shuffle`) downTo 1) {
      val j: Int = random.nextInt(i + 1)
      val copy: Float = `$this$shuffle`[i]
      `$this$shuffle`[i] = `$this$shuffle`[j]
      `$this$shuffle`[j] = copy
   }
}

public inline fun <T> Array<out Any>.last(predicate: (Any) -> Boolean): Any {
   var var3: Int = `$this$last`.length + -1
   if (0 <= `$this$last`.length + -1) {
      do {
         val element: Any = `$this$last`[var3--]
         if (predicate(element) as java.lang.Boolean) {
            return (T)element
         }
      } while (0 <= var3)
   }

   throw NoSuchElementException("Array contains no element matching the predicate.")
}

public inline fun LongArray.forEachIndexed(action: (Int, Long) -> Unit) {
   var index: Int = 0

   for (item in `$this$forEachIndexed`) {
      action(index++, item)
   }
}

public fun ByteArray.none(): Boolean {
   return `$this$none`.length == 0
}

public fun <T> Array<out Any>.toMutableList(): MutableList<Any> {
   return (java.util.List<T>)ArrayList<>(CollectionsKt.asCollection(`$this$toMutableList`))
}

public inline fun DoubleArray.count(predicate: (Double) -> Boolean): Int {
   var count: Int = 0

   for (element in `$this$count`) {
      if (predicate(element) as java.lang.Boolean) {
         count++
      }
   }

   return count
}

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun <R : Comparable<Any>> DoubleArray.maxOfOrNull(selector: (Double) -> Any): Any? {
   if (`$this$maxOfOrNull`.length == 0) {
      return null
   } else {
      var maxValue: java.lang.Comparable = selector(`$this$maxOfOrNull`[0]) as java.lang.Comparable
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfOrNull`)).iterator()

      while (var3.hasNext()) {
         val v: java.lang.Comparable = selector(`$this$maxOfOrNull`[var3.nextInt()]) as java.lang.Comparable
         if (maxValue.compareTo(v) < 0) {
            maxValue = v
         }
      }

      return (R)maxValue
   }
}

public inline fun CharArray.takeWhile(predicate: (Char) -> Boolean): List<Char> {
   val list: ArrayList = ArrayList()

   for (item in `$this$takeWhile`) {
      if (!predicate(item) as java.lang.Boolean) {
         break
      }

      list.add(item)
   }

   return list
}

public inline fun LongArray.filterNot(predicate: (Long) -> Boolean): List<Long> {
   val `destination$iv`: java.util.Collection = ArrayList()

   for (`element$iv` in `$this$filterNot`) {
      if (!predicate(`element$iv`) as java.lang.Boolean) {
         `destination$iv`.add(`element$iv`)
      }
   }

   return `destination$iv` as MutableList<java.lang.Long>
}

public inline fun <C : MutableCollection<in Char>> CharArray.filterTo(destination: Any, predicate: (Char) -> Boolean): Any {
   for (element in `$this$filterTo`) {
      if (predicate(element) as java.lang.Boolean) {
         destination.add(element)
      }
   }

   return (C)destination
}

@InlineOnly
@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
public inline fun LongArray.minOf(selector: (Long) -> Float): Float {
   if (`$this$minOf`.length == 0) {
      throw NoSuchElementException()
   } else {
      var minValue: Float = (selector(`$this$minOf`[0]) as java.lang.Number).floatValue()
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOf`)).iterator()

      while (var3.hasNext()) {
         minValue = Math.min(minValue, (selector(`$this$minOf`[var3.nextInt()]) as java.lang.Number).floatValue())
      }

      return minValue
   }
}

@SinceKotlin(version = "1.4")
@InlineOnly
@OverloadResolutionByLambdaReturnType
public inline fun FloatArray.maxOfOrNull(selector: (Float) -> Float): Float? {
   if (`$this$maxOfOrNull`.length == 0) {
      return null
   } else {
      var maxValue: Float = (selector(`$this$maxOfOrNull`[0]) as java.lang.Number).floatValue()
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfOrNull`)).iterator()

      while (var3.hasNext()) {
         maxValue = Math.max(maxValue, (selector(`$this$maxOfOrNull`[var3.nextInt()]) as java.lang.Number).floatValue())
      }

      return maxValue
   }
}

public inline fun <R, C : MutableCollection<in Any>> BooleanArray.flatMapTo(destination: Any, transform: (Boolean) -> Iterable<Any>): Any {
   for (element in `$this$flatMapTo`) {
      CollectionsKt.addAll(destination, transform(element) as java.lang.Iterable)
   }

   return (C)destination
}

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun ShortArray.maxOf(selector: (Short) -> Float): Float {
   if (`$this$maxOf`.length == 0) {
      throw NoSuchElementException()
   } else {
      var maxValue: Float = (selector(`$this$maxOf`[0]) as java.lang.Number).floatValue()
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOf`)).iterator()

      while (var3.hasNext()) {
         maxValue = Math.max(maxValue, (selector(`$this$maxOf`[var3.nextInt()]) as java.lang.Number).floatValue())
      }

      return maxValue
   }
}

@InlineOnly
public inline operator fun FloatArray.component4(): Float {
   return `$this$component4`[3]
}

@InlineOnly
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
public inline fun <R> ShortArray.minOfWith(comparator: Comparator<in Any>, selector: (Short) -> Any): Any {
   if (`$this$minOfWith`.length == 0) {
      throw NoSuchElementException()
   } else {
      var minValue: Any = selector(`$this$minOfWith`[0])
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfWith`)).iterator()

      while (var4.hasNext()) {
         val v: Any = selector(`$this$minOfWith`[var4.nextInt()])
         if (comparator.compare(minValue, v) > 0) {
            minValue = v
         }
      }

      return (R)minValue
   }
}

public inline fun FloatArray.single(predicate: (Float) -> Boolean): Float {
   var single: java.lang.Float = null
   var found: Boolean = false

   for (element in `$this$single`) {
      if (predicate(element) as java.lang.Boolean) {
         if (found) {
            throw IllegalArgumentException("Array contains more than one matching element.")
         }

         single = element
         found = true
      }
   }

   if (!found) {
      throw NoSuchElementException("Array contains no element matching the predicate.")
   } else {
      return single
   }
}

public fun LongArray.sortedWith(comparator: Comparator<in Long>): List<Long> {
   val var2: Array<java.lang.Long> = ArraysKt.toTypedArray(`$this$sortedWith`)
   ArraysKt.sortWith(var2, comparator)
   return ArraysKt.asList(var2)
}

public fun ShortArray.toSet(): Set<Short> {
   var var10000: java.util.Set
   when (`$this$toSet`.length) {
      0 -> var10000 = SetsKt.emptySet()
      1 -> var10000 = SetsKt.setOf(`$this$toSet`[0])
      else -> var10000 = ArraysKt.toCollection((short[])`$this$toSet`, LinkedHashSet(MapsKt.mapCapacity(`$this$toSet`.length)))
   }

   return var10000
}

public inline fun <R, V> IntArray.zip(other: Iterable<Any>, transform: (Int, Any) -> Any): List<Any> {
   val arraySize: Int = `$this$zip`.length
   val list: ArrayList = ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(other, 10), `$this$zip`.length))
   var i: Int = 0

   for (element in other) {
      if (i >= arraySize) {
         break
      }

      list.add(transform(`$this$zip`[i++], element))
   }

   return list
}

public fun DoubleArray.toSet(): Set<Double> {
   var var10000: java.util.Set
   when (`$this$toSet`.length) {
      0 -> var10000 = SetsKt.emptySet()
      1 -> var10000 = SetsKt.setOf(`$this$toSet`[0])
      else -> var10000 = ArraysKt.toCollection(`$this$toSet`, LinkedHashSet(MapsKt.mapCapacity(`$this$toSet`.length)))
   }

   return var10000
}

@InlineOnly
public inline operator fun FloatArray.component1(): Float {
   return `$this$component1`[0]
}

public operator fun LongArray.contains(element: Long): Boolean {
   return ArraysKt.indexOf(`$this$contains`, element) >= 0
}

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun ShortArray.minOf(selector: (Short) -> Float): Float {
   if (`$this$minOf`.length == 0) {
      throw NoSuchElementException()
   } else {
      var minValue: Float = (selector(`$this$minOf`[0]) as java.lang.Number).floatValue()
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOf`)).iterator()

      while (var3.hasNext()) {
         minValue = Math.min(minValue, (selector(`$this$minOf`[var3.nextInt()]) as java.lang.Number).floatValue())
      }

      return minValue
   }
}

public inline fun <R> BooleanArray.mapIndexed(transform: (Int, Boolean) -> Any): List<Any> {
   val `destination$iv`: java.util.Collection = ArrayList(`$this$mapIndexed`.length)
   var `index$iv`: Int = 0

   for (`item$iv` in `$this$mapIndexed`) {
      `destination$iv`.add(transform(`index$iv`++, `item$iv`))
   }

   return `destination$iv` as MutableList<R>
}

@SinceKotlin(version = "1.4")
public inline fun FloatArray.reduceRightIndexedOrNull(operation: (Int, Float, Float) -> Float): Float? {
   var index: Int = ArraysKt.getLastIndex(`$this$reduceRightIndexedOrNull`)
   if (index < 0) {
      return null
   } else {
      var accumulator: Float = `$this$reduceRightIndexedOrNull`[index--]

      while (index >= 0) {
         accumulator = (operation(index, `$this$reduceRightIndexedOrNull`[index], accumulator) as java.lang.Number).floatValue()
         index--
      }

      return accumulator
   }
}

@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun ByteArray.random(): Byte {
   return ArraysKt.random((byte[])`$this$random`, Random.Default)
}

@InlineOnly
public inline operator fun ByteArray.component1(): Byte {
   return `$this$component1`[0]
}

public inline fun <K, V, M : MutableMap<in Any, MutableList<Any>>> LongArray.groupByTo(
   destination: Any,
   keySelector: (Long) -> Any,
   valueTransform: (Long) -> Any
): Any {
   for (element in `$this$groupByTo`) {
      val key: Any = keySelector(element)
      val `value$iv`: Any = destination.get(key)
      val var10000: Any
      if (`value$iv` == null) {
         val var15: java.util.List = ArrayList()
         destination.put(key, var15)
         var10000 = var15
      } else {
         var10000 = `value$iv`
      }

      (var10000 as java.util.List).add(valueTransform(element))
   }

   return (M)destination
}

public inline fun <K, V> BooleanArray.associate(transform: (Boolean) -> Pair<Any, Any>): Map<Any, Any> {
   val `destination$iv`: java.util.Map = LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(`$this$associate`.length), 16))

   for (`element$iv` in `$this$associate`) {
      val var11: Pair = transform(`element$iv`) as Pair
      `destination$iv`.put(var11.first, var11.second)
   }

   return `destination$iv`
}

public inline fun <K> CharArray.distinctBy(selector: (Char) -> Any): List<Char> {
   val set: HashSet = HashSet()
   val list: ArrayList = ArrayList()

   for (e in `$this$distinctBy`) {
      if (set.add(selector(e))) {
         list.add(e)
      }
   }

   return list
}

@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun <R> FloatArray.runningFold(initial: Any, operation: (Any, Float) -> Any): List<Any> {
   if (`$this$runningFold`.length == 0) {
      return (java.util.List<R>)CollectionsKt.listOf(initial)
   } else {
      var accumulator: Any = ArrayList(`$this$runningFold`.length + 1)
      accumulator.add(initial)
      val result: Any = accumulator
      accumulator = initial

      for (element in `$this$runningFold`) {
         accumulator = operation(accumulator, element)
         result.add(accumulator)
      }

      return result as MutableList<R>
   }
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.4")
public inline fun FloatArray.reduceRightOrNull(operation: (Float, Float) -> Float): Float? {
   var index: Int = ArraysKt.getLastIndex(`$this$reduceRightOrNull`)
   if (index < 0) {
      return null
   } else {
      var accumulator: Float = `$this$reduceRightOrNull`[index--]

      while (index >= 0) {
         accumulator = (operation(`$this$reduceRightOrNull`[index--], accumulator) as java.lang.Number).floatValue()
      }

      return accumulator
   }
}

@SinceKotlin(version = "1.4")
public inline fun FloatArray.reduceIndexedOrNull(operation: (Int, Float, Float) -> Float): Float? {
   if (`$this$reduceIndexedOrNull`.length == 0) {
      return null
   } else {
      var accumulator: Float = `$this$reduceIndexedOrNull`[0]
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$reduceIndexedOrNull`)).iterator()

      while (var4.hasNext()) {
         val index: Int = var4.nextInt()
         accumulator = (operation(index, accumulator, `$this$reduceIndexedOrNull`[index]) as java.lang.Number).floatValue()
      }

      return accumulator
   }
}

public inline fun <R, C : MutableCollection<in Any>> IntArray.mapTo(destination: Any, transform: (Int) -> Any): Any {
   for (item in `$this$mapTo`) {
      destination.add(transform(item))
   }

   return (C)destination
}

public inline fun LongArray.takeWhile(predicate: (Long) -> Boolean): List<Long> {
   val list: ArrayList = ArrayList()

   for (item in `$this$takeWhile`) {
      if (!predicate(item) as java.lang.Boolean) {
         break
      }

      list.add(item)
   }

   return list
}

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@JvmName(name = "flatMapSequence")
public inline fun <T, R> Array<out Any>.flatMap(transform: (Any) -> Sequence<Any>): List<Any> {
   val `destination$iv`: java.util.Collection = ArrayList()

   for (`element$iv` in `$this$flatMap`) {
      CollectionsKt.addAll(`destination$iv`, transform(`element$iv`) as Sequence)
   }

   return `destination$iv` as MutableList<R>
}

@JvmName(name = "sumOfLong")
public fun Array<out Long>.sum(): Long {
   var sum: Long = 0L
   var var3: Int = 0

   for (var4 in `$this$sum`.length..var3) {
      sum += `$this$sum`[var3]
   }

   return sum
}

public inline fun <R : Comparable<Any>> ByteArray.sortedBy(crossinline selector: (Byte) -> Any?): List<Byte> {
   return ArraysKt.sortedWith((byte[])`$this$sortedBy`,    // $VF: Compiled from Comparisons.kt
{ a: Any, b: Any ->
      val var3: Function1 = selector
      return ComparisonsKt.compareValues((T)(selector(a) as java.lang.Comparable), (T)(var3(b) as java.lang.Comparable))
   })
}

public inline fun ByteArray.forEach(action: (Byte) -> Unit) {
   for (element in `$this$forEach`) {
      action(element)
   }
}

@InlineOnly
public inline fun IntArray.findLast(predicate: (Int) -> Boolean): Int? {
   val `$this$lastOrNull$iv`: IntArray = `$this$findLast`
   var var4: Int = `$this$findLast`.length + -1
   if (0 <= `$this$findLast`.length + -1) {
      do {
         val `element$iv`: Int = `$this$lastOrNull$iv`[var4--]
         if (predicate(`element$iv`) as java.lang.Boolean) {
            return `element$iv`
         }
      } while (0 <= var4)
   }

   return null
}

public fun BooleanArray.takeLast(n: Int): List<Boolean> {
   if (n < 0) {
      throw IllegalArgumentException(("Requested element count $n is less than zero.").toString())
   } else if (n == 0) {
      return CollectionsKt.emptyList()
   } else {
      val var5: Int = `$this$takeLast`.length
      if (n >= `$this$takeLast`.length) {
         return ArraysKt.toList(`$this$takeLast`)
      } else if (n == 1) {
         return CollectionsKt.listOf(`$this$takeLast`[var5 + -1])
      } else {
         val list: ArrayList = ArrayList(n)

         for (index in var5 - n..var5) {
            list.add(`$this$takeLast`[index])
         }

         return list
      }
   }
}

public inline fun <V> CharArray.zip(other: CharArray, transform: (Char, Char) -> Any): List<Any> {
   val size: Int = Math.min(`$this$zip`.length, other.length)
   val list: ArrayList = ArrayList(size)

   repeat(size) { i ->
      list.add(transform(`$this$zip`[i], other[i]))
   }

   return list
}

@SinceKotlin(version = "1.7")
@JvmName(name = "maxOrThrow")
public fun CharArray.max(): Char {
   if (`$this$max`.length == 0) {
      throw NoSuchElementException()
   } else {
      var max: Char = `$this$max`[0]
      val var2: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$max`)).iterator()

      while (var2.hasNext()) {
         val e: Char = `$this$max`[var2.nextInt()]
         if (Intrinsics.compare(max, e) < 0) {
            max = e
         }
      }

      return max
   }
}

public fun Array<out Short>.toShortArray(): ShortArray {
   var var1: Int = 0
   val var2: Int = `$this$toShortArray`.length
   val var3: ShortArray = ShortArray(`$this$toShortArray`.length)

   while (var1 < var2) {
      var3[var1] = `$this$toShortArray`[var1]
      var1++
   }

   return var3
}

public inline fun CharArray.partition(predicate: (Char) -> Boolean): Pair<List<Char>, List<Char>> {
   val first: ArrayList = ArrayList()
   val second: ArrayList = ArrayList()

   for (element in `$this$partition`) {
      if (predicate(element) as java.lang.Boolean) {
         first.add(element)
      } else {
         second.add(element)
      }
   }

   return Pair<>(first, second)
}

public inline fun ByteArray.reduceIndexed(operation: (Int, Byte, Byte) -> Byte): Byte {
   if (`$this$reduceIndexed`.length == 0) {
      throw UnsupportedOperationException("Empty array can't be reduced.")
   } else {
      var accumulator: Byte = `$this$reduceIndexed`[0]
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$reduceIndexed`)).iterator()

      while (var4.hasNext()) {
         val index: Int = var4.nextInt()
         accumulator = (operation(index, accumulator, `$this$reduceIndexed`[index]) as java.lang.Number).byteValue()
      }

      return accumulator
   }
}

public inline fun ShortArray.dropLastWhile(predicate: (Short) -> Boolean): List<Short> {
   for (index in ArraysKt.getLastIndex(`$this$dropLastWhile`) downTo 0) {
      if (!predicate(`$this$dropLastWhile`[index]) as java.lang.Boolean) {
         return ArraysKt.take((short[])`$this$dropLastWhile`, index + 1)
      }
   }

   return CollectionsKt.emptyList()
}

public inline fun <K, V> LongArray.associate(transform: (Long) -> Pair<Any, Any>): Map<Any, Any> {
   val `destination$iv`: java.util.Map = LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(`$this$associate`.length), 16))

   for (`element$iv` in `$this$associate`) {
      val var12: Pair = transform(`element$iv`) as Pair
      `destination$iv`.put(var12.first, var12.second)
   }

   return `destination$iv`
}

@SinceKotlin(version = "1.4")
@InlineOnly
@OverloadResolutionByLambdaReturnType
public inline fun <R> BooleanArray.minOfWithOrNull(comparator: Comparator<in Any>, selector: (Boolean) -> Any): Any? {
   if (`$this$minOfWithOrNull`.length == 0) {
      return null
   } else {
      var minValue: Any = selector(`$this$minOfWithOrNull`[0])
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfWithOrNull`)).iterator()

      while (var4.hasNext()) {
         val v: Any = selector(`$this$minOfWithOrNull`[var4.nextInt()])
         if (comparator.compare(minValue, v) > 0) {
            minValue = v
         }
      }

      return (R)minValue
   }
}

@InlineOnly
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
public inline fun <R> FloatArray.maxOfWithOrNull(comparator: Comparator<in Any>, selector: (Float) -> Any): Any? {
   if (`$this$maxOfWithOrNull`.length == 0) {
      return null
   } else {
      var maxValue: Any = selector(`$this$maxOfWithOrNull`[0])
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfWithOrNull`)).iterator()

      while (var4.hasNext()) {
         val v: Any = selector(`$this$maxOfWithOrNull`[var4.nextInt()])
         if (comparator.compare(maxValue, v) < 0) {
            maxValue = v
         }
      }

      return (R)maxValue
   }
}

@InlineOnly
public inline fun DoubleArray.elementAtOrElse(index: Int, defaultValue: (Int) -> Double): Double {
   return if (index >= 0 && index <= ArraysKt.getLastIndex(`$this$elementAtOrElse`))
      `$this$elementAtOrElse`[index]
      else
      (defaultValue(index) as java.lang.Number).doubleValue()
   }

@SinceKotlin(version = "1.4")
public fun DoubleArray.shuffle() {
   ArraysKt.shuffle(`$this$shuffle`, Random.Default)
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun FloatArray.runningReduceIndexed(operation: (Int, Float, Float) -> Float): List<Float> {
   if (`$this$runningReduceIndexed`.length == 0) {
      return CollectionsKt.emptyList()
   } else {
      var accumulator: Float = 0.0F
      accumulator = `$this$runningReduceIndexed`[0]
      val index: Int = (int)ArrayList(`$this$runningReduceIndexed`.length)
      index.add(accumulator)
      val result: Any = index
      var var8: Int = 1

      for (var9 in `$this$runningReduceIndexed`.length..var8) {
         accumulator = (operation(var8, accumulator, `$this$runningReduceIndexed`[var8]) as java.lang.Number).floatValue()
         result.add(accumulator)
      }

      return result as MutableList<java.lang.Float>
   }
}

public inline fun <R> ByteArray.map(transform: (Byte) -> Any): List<Any> {
   val `destination$iv`: java.util.Collection = ArrayList(`$this$map`.length)

   for (`item$iv` in `$this$map`) {
      `destination$iv`.add(transform(`item$iv`))
   }

   return `destination$iv` as MutableList<R>
}

@SinceKotlin(version = "1.4")
public fun BooleanArray.maxWithOrNull(comparator: Comparator<in Boolean>): Boolean? {
   if (`$this$maxWithOrNull`.length == 0) {
      return null
   } else {
      var max: Boolean = `$this$maxWithOrNull`[0]
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxWithOrNull`)).iterator()

      while (var3.hasNext()) {
         val e: Boolean = `$this$maxWithOrNull`[var3.nextInt()]
         if (comparator.compare(max, e) < 0) {
            max = e
         }
      }

      return max
   }
}

@InlineOnly
public inline operator fun ByteArray.component3(): Byte {
   return `$this$component3`[2]
}

public inline fun <K, V, M : MutableMap<in Any, in Any>> CharArray.associateByTo(destination: Any, keySelector: (Char) -> Any, valueTransform: (Char) -> Any): Any {
   for (element in `$this$associateByTo`) {
      destination.put(keySelector(element), valueTransform(element))
   }

   return (M)destination
}

public inline fun <T> Array<out Any>.filter(predicate: (Any) -> Boolean): List<Any> {
   val `destination$iv`: java.util.Collection = ArrayList()

   for (`element$iv` in `$this$filter`) {
      if (predicate(`element$iv`) as java.lang.Boolean) {
         `destination$iv`.add(`element$iv`)
      }
   }

   return `destination$iv` as MutableList<T>
}

public inline fun <R> DoubleArray.fold(initial: Any, operation: (Any, Double) -> Any): Any {
   var accumulator: Any = initial

   for (element in `$this$fold`) {
      accumulator = operation(accumulator, element)
   }

   return (R)accumulator
}

@InlineOnly
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@JvmName(name = "sumOfDouble")
public inline fun ShortArray.sumOf(selector: (Short) -> Double): Double {
   var sum: Double = 0.0

   for (element in `$this$sumOf`) {
      sum += (selector(element) as java.lang.Number).doubleValue()
   }

   return sum
}

@SinceKotlin(version = "1.4")
public fun LongArray.maxOrNull(): Long? {
   if (`$this$maxOrNull`.length == 0) {
      return null
   } else {
      var max: Long = `$this$maxOrNull`[0]
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOrNull`)).iterator()

      while (var3.hasNext()) {
         val e: Long = `$this$maxOrNull`[var3.nextInt()]
         if (max < e) {
            max = e
         }
      }

      return max
   }
}

@SinceKotlin(version = "1.4")
@InlineOnly
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public inline fun <R> DoubleArray.scan(initial: Any, operation: (Any, Double) -> Any): List<Any> {
   val var10000: java.util.List
   if (`$this$scan`.length == 0) {
      var10000 = CollectionsKt.listOf(initial)
   } else {
      val var4: ArrayList = ArrayList(`$this$scan`.length + 1)
      var4.add(initial)
      val var6: ArrayList = var4
      var var10: Any = initial

      for (var8 in `$this$scan`) {
         var10 = operation(var10, var8)
         var6.add(var10)
      }

      var10000 = var6
   }

   return var10000
}

public fun ByteArray.firstOrNull(): Byte? {
   return if (`$this$firstOrNull`.length == 0) null else `$this$firstOrNull`[0]
}

public final val indices: IntRange
   public final get() {
      return IntRange(0, ArraysKt.getLastIndex(`$this$indices`))
   }


@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun <R : Comparable<Any>> LongArray.maxOfOrNull(selector: (Long) -> Any): Any? {
   if (`$this$maxOfOrNull`.length == 0) {
      return null
   } else {
      var maxValue: java.lang.Comparable = selector(`$this$maxOfOrNull`[0]) as java.lang.Comparable
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfOrNull`)).iterator()

      while (var3.hasNext()) {
         val v: java.lang.Comparable = selector(`$this$maxOfOrNull`[var3.nextInt()]) as java.lang.Comparable
         if (maxValue.compareTo(v) < 0) {
            maxValue = v
         }
      }

      return (R)maxValue
   }
}

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@JvmName(name = "sumOfInt")
@InlineOnly
public inline fun BooleanArray.sumOf(selector: (Boolean) -> Int): Int {
   var sum: Int = 0

   for (element in `$this$sumOf`) {
      sum += (selector(element) as java.lang.Number).intValue()
   }

   return sum
}

public fun LongArray.sliceArray(indices: IntRange): LongArray {
   return if (indices.isEmpty()) LongArray(0) else ArraysKt.copyOfRange(`$this$sliceArray`, indices.start, indices.endInclusive + 1)
}

public fun IntArray.sortedDescending(): List<Int> {
   val var10000: IntArray = Arrays.copyOf(`$this$sortedDescending`, `$this$sortedDescending`.length)
   ArraysKt.sort(var10000)
   return ArraysKt.reversed(var10000)
}

public inline fun <K> FloatArray.distinctBy(selector: (Float) -> Any): List<Float> {
   val set: HashSet = HashSet()
   val list: ArrayList = ArrayList()

   for (e in `$this$distinctBy`) {
      if (set.add(selector(e))) {
         list.add(e)
      }
   }

   return list
}

public fun LongArray.toMutableList(): MutableList<Long> {
   val list: ArrayList = ArrayList(`$this$toMutableList`.length)

   for (item in `$this$toMutableList`) {
      list.add(item)
   }

   return list
}

public fun LongArray.distinct(): List<Long> {
   return CollectionsKt.toList(ArraysKt.toMutableSet(`$this$distinct`))
}

@InlineOnly
@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
public inline fun <R : Comparable<Any>> ByteArray.minOfOrNull(selector: (Byte) -> Any): Any? {
   if (`$this$minOfOrNull`.length == 0) {
      return null
   } else {
      var minValue: java.lang.Comparable = selector(`$this$minOfOrNull`[0]) as java.lang.Comparable
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfOrNull`)).iterator()

      while (var3.hasNext()) {
         val v: java.lang.Comparable = selector(`$this$minOfOrNull`[var3.nextInt()]) as java.lang.Comparable
         if (minValue.compareTo(v) > 0) {
            minValue = v
         }
      }

      return (R)minValue
   }
}

@InlineOnly
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
public inline fun DoubleArray.minOf(selector: (Double) -> Float): Float {
   if (`$this$minOf`.length == 0) {
      throw NoSuchElementException()
   } else {
      var minValue: Float = (selector(`$this$minOf`[0]) as java.lang.Number).floatValue()
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOf`)).iterator()

      while (var3.hasNext()) {
         minValue = Math.min(minValue, (selector(`$this$minOf`[var3.nextInt()]) as java.lang.Number).floatValue())
      }

      return minValue
   }
}

public fun CharArray.takeLast(n: Int): List<Char> {
   if (n < 0) {
      throw IllegalArgumentException(("Requested element count $n is less than zero.").toString())
   } else if (n == 0) {
      return CollectionsKt.emptyList()
   } else {
      val var5: Int = `$this$takeLast`.length
      if (n >= `$this$takeLast`.length) {
         return ArraysKt.toList(`$this$takeLast`)
      } else if (n == 1) {
         return CollectionsKt.listOf(`$this$takeLast`[var5 + -1])
      } else {
         val list: ArrayList = ArrayList(n)

         for (index in var5 - n..var5) {
            list.add(`$this$takeLast`[index])
         }

         return list
      }
   }
}

@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun <V, M : MutableMap<in Double, in Any>> DoubleArray.associateWithTo(destination: Any, valueSelector: (Double) -> Any): Any {
   for (element in `$this$associateWithTo`) {
      destination.put(element, valueSelector(element))
   }

   return (M)destination
}

public inline fun <K> ByteArray.groupBy(keySelector: (Byte) -> Any): Map<Any, List<Byte>> {
   val `destination$iv`: java.util.Map = LinkedHashMap()

   for (`element$iv` in `$this$groupBy`) {
      val `key$iv`: Any = keySelector(`element$iv`)
      val `value$iv$iv`: Any = `destination$iv`.get(`key$iv`)
      val var10000: Any
      if (`value$iv$iv` == null) {
         val var15: java.util.List = ArrayList()
         `destination$iv`.put(`key$iv`, var15)
         var10000 = var15
      } else {
         var10000 = `value$iv$iv`
      }

      (var10000 as java.util.List).add(`element$iv`)
   }

   return `destination$iv`
}

public fun IntArray.dropLast(n: Int): List<Int> {
   if (n < 0) {
      throw IllegalArgumentException(("Requested element count $n is less than zero.").toString())
   } else {
      return ArraysKt.take((int[])`$this$dropLast`, RangesKt.coerceAtLeast(`$this$dropLast`.length - n, 0))
   }
}

public inline fun <R> LongArray.foldIndexed(initial: Any, operation: (Int, Any, Long) -> Any): Any {
   var index: Int = 0
   var accumulator: Any = initial

   for (element in `$this$foldIndexed`) {
      accumulator = operation(index++, accumulator, element)
   }

   return (R)accumulator
}

@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun <V, M : MutableMap<in Float, in Any>> FloatArray.associateWithTo(destination: Any, valueSelector: (Float) -> Any): Any {
   for (element in `$this$associateWithTo`) {
      destination.put(element, valueSelector(element))
   }

   return (M)destination
}

public inline fun <R> ShortArray.foldRightIndexed(initial: Any, operation: (Int, Short, Any) -> Any): Any {
   var index: Int = ArraysKt.getLastIndex(`$this$foldRightIndexed`)
   var accumulator: Any = initial

   while (index >= 0) {
      accumulator = operation(index, `$this$foldRightIndexed`[index], accumulator)
      index--
   }

   return (R)accumulator
}

public inline fun <R> ByteArray.foldRight(initial: Any, operation: (Byte, Any) -> Any): Any {
   var index: Int = ArraysKt.getLastIndex(`$this$foldRight`)
   var accumulator: Any = initial

   while (index >= 0) {
      accumulator = operation(`$this$foldRight`[index--], accumulator)
   }

   return (R)accumulator
}

@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
@InlineOnly
public inline fun ByteArray.maxOfOrNull(selector: (Byte) -> Float): Float? {
   if (`$this$maxOfOrNull`.length == 0) {
      return null
   } else {
      var maxValue: Float = (selector(`$this$maxOfOrNull`[0]) as java.lang.Number).floatValue()
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfOrNull`)).iterator()

      while (var3.hasNext()) {
         maxValue = Math.max(maxValue, (selector(`$this$maxOfOrNull`[var3.nextInt()]) as java.lang.Number).floatValue())
      }

      return maxValue
   }
}

public inline fun FloatArray.reduceRightIndexed(operation: (Int, Float, Float) -> Float): Float {
   var index: Int = ArraysKt.getLastIndex(`$this$reduceRightIndexed`)
   if (index < 0) {
      throw UnsupportedOperationException("Empty array can't be reduced.")
   } else {
      var accumulator: Float = `$this$reduceRightIndexed`[index--]

      while (index >= 0) {
         accumulator = (operation(index, `$this$reduceRightIndexed`[index], accumulator) as java.lang.Number).floatValue()
         index--
      }

      return accumulator
   }
}

@InlineOnly
public inline fun IntArray.elementAtOrNull(index: Int): Int? {
   return ArraysKt.getOrNull((int[])`$this$elementAtOrNull`, index)
}

public inline fun <T, K, M : MutableMap<in Any, MutableList<Any>>> Array<out Any>.groupByTo(destination: Any, keySelector: (Any) -> Any): Any {
   for (element in `$this$groupByTo`) {
      val key: Any = keySelector(element)
      val `value$iv`: Any = destination.get(key)
      val var10000: Any
      if (`value$iv` == null) {
         val var13: java.util.List = ArrayList()
         destination.put(key, var13)
         var10000 = var13
      } else {
         var10000 = `value$iv`
      }

      (var10000 as java.util.List).add(element)
   }

   return (M)destination
}

@InlineOnly
public inline operator fun ByteArray.component2(): Byte {
   return `$this$component2`[1]
}

public fun IntArray.slice(indices: IntRange): List<Int> {
   return if (indices.isEmpty())
      CollectionsKt.emptyList()
      else
      ArraysKt.asList(ArraysKt.copyOfRange((int[])`$this$slice`, indices.start, indices.endInclusive + 1))
   }

public inline fun <K, V, M : MutableMap<in Any, in Any>> IntArray.associateTo(destination: Any, transform: (Int) -> Pair<Any, Any>): Any {
   for (element in `$this$associateTo`) {
      val var8: Pair = transform(element) as Pair
      destination.put(var8.first, var8.second)
   }

   return (M)destination
}

@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@InlineOnly
public inline fun LongArray.randomOrNull(): Long? {
   return ArraysKt.randomOrNull(`$this$randomOrNull`, Random.Default)
}

public inline fun FloatArray.takeLastWhile(predicate: (Float) -> Boolean): List<Float> {
   for (index in ArraysKt.getLastIndex(`$this$takeLastWhile`) downTo 0) {
      if (!predicate(`$this$takeLastWhile`[index]) as java.lang.Boolean) {
         return ArraysKt.drop(`$this$takeLastWhile`, index + 1)
      }
   }

   return ArraysKt.toList(`$this$takeLastWhile`)
}

public inline fun DoubleArray.single(predicate: (Double) -> Boolean): Double {
   var single: java.lang.Double = null
   var found: Boolean = false

   for (element in `$this$single`) {
      if (predicate(element) as java.lang.Boolean) {
         if (found) {
            throw IllegalArgumentException("Array contains more than one matching element.")
         }

         single = element
         found = true
      }
   }

   if (!found) {
      throw NoSuchElementException("Array contains no element matching the predicate.")
   } else {
      return single
   }
}

public inline fun IntArray.dropWhile(predicate: (Int) -> Boolean): List<Int> {
   var yielding: Boolean = false
   val list: ArrayList = ArrayList()

   for (item in `$this$dropWhile`) {
      if (yielding) {
         list.add(item)
      } else if (!predicate(item) as java.lang.Boolean) {
         list.add(item)
         yielding = true
      }
   }

   return list
}

@InlineOnly
@OverloadResolutionByLambdaReturnType
@JvmName(name = "flatMapIndexedIterable")
@SinceKotlin(version = "1.4")
public inline fun <R> FloatArray.flatMapIndexed(transform: (Int, Float) -> Iterable<Any>): List<Any> {
   val var3: java.util.Collection = ArrayList()
   var var4: Int = 0

   for (var7 in `$this$flatMapIndexed`) {
      CollectionsKt.addAll(var3, transform(var4++, var7) as java.lang.Iterable)
   }

   return var3 as MutableList<R>
}

@InlineOnly
public inline operator fun LongArray.component5(): Long {
   return `$this$component5`[4]
}

public infix fun IntArray.subtract(other: Iterable<Int>): Set<Int> {
   val set: java.util.Set = ArraysKt.toMutableSet(`$this$subtract`)
   CollectionsKt.removeAll(set, other)
   return set
}

public inline fun DoubleArray.reduceIndexed(operation: (Int, Double, Double) -> Double): Double {
   if (`$this$reduceIndexed`.length == 0) {
      throw UnsupportedOperationException("Empty array can't be reduced.")
   } else {
      var accumulator: Double = `$this$reduceIndexed`[0]
      val var5: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$reduceIndexed`)).iterator()

      while (var5.hasNext()) {
         val index: Int = var5.nextInt()
         accumulator = (operation(index, accumulator, `$this$reduceIndexed`[index]) as java.lang.Number).doubleValue()
      }

      return accumulator
   }
}

public fun IntArray.lastIndexOf(element: Int): Int {
   var var2: Int = `$this$lastIndexOf`.length + -1
   if (0 <= `$this$lastIndexOf`.length + -1) {
      do {
         val index: Int = var2--
         if (element == `$this$lastIndexOf`[index]) {
            return index
         }
      } while (0 <= var2)
   }

   return -1
}

public fun CharArray.asIterable(): Iterable<Char> {
   return if (`$this$asIterable`.length == 0) CollectionsKt.emptyList() else ArraysKt___ArraysKt$asIterable$$inlined$Iterable$9(`$this$asIterable`)
}

public fun <T> Array<out Any>.sortedWith(comparator: Comparator<in Any>): List<Any> {
   return (java.util.List<T>)ArraysKt.asList(ArraysKt.sortedArrayWith(`$this$sortedWith`, comparator))
}

@DeprecatedSinceKotlin(warningSince = "1.5")
@Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = []))
public inline fun BooleanArray.sumByDouble(selector: (Boolean) -> Double): Double {
   var sum: Double = 0.0

   for (element in `$this$sumByDouble`) {
      sum += (selector(element) as java.lang.Number).doubleValue()
   }

   return sum
}

public inline fun <K, M : MutableMap<in Any, in Boolean>> BooleanArray.associateByTo(destination: Any, keySelector: (Boolean) -> Any): Any {
   for (element in `$this$associateByTo`) {
      destination.put(keySelector(element), element)
   }

   return (M)destination
}

@InlineOnly
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
public inline fun <R : Comparable<Any>> ByteArray.maxOf(selector: (Byte) -> Any): Any {
   if (`$this$maxOf`.length == 0) {
      throw NoSuchElementException()
   } else {
      var maxValue: java.lang.Comparable = selector(`$this$maxOf`[0]) as java.lang.Comparable
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOf`)).iterator()

      while (var3.hasNext()) {
         val v: java.lang.Comparable = selector(`$this$maxOf`[var3.nextInt()]) as java.lang.Comparable
         if (maxValue.compareTo(v) < 0) {
            maxValue = v
         }
      }

      return (R)maxValue
   }
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.4")
public inline fun FloatArray.reduceOrNull(operation: (Float, Float) -> Float): Float? {
   if (`$this$reduceOrNull`.length == 0) {
      return null
   } else {
      var accumulator: Float = `$this$reduceOrNull`[0]
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$reduceOrNull`)).iterator()

      while (var4.hasNext()) {
         accumulator = (operation(accumulator, `$this$reduceOrNull`[var4.nextInt()]) as java.lang.Number).floatValue()
      }

      return accumulator
   }
}

public inline fun <R> LongArray.mapIndexed(transform: (Int, Long) -> Any): List<Any> {
   val `destination$iv`: java.util.Collection = ArrayList(`$this$mapIndexed`.length)
   var `index$iv`: Int = 0

   for (`item$iv` in `$this$mapIndexed`) {
      `destination$iv`.add(transform(`index$iv`++, `item$iv`))
   }

   return `destination$iv` as MutableList<R>
}

@InlineOnly
public inline operator fun CharArray.component1(): Char {
   return `$this$component1`[0]
}

@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
@InlineOnly
public inline fun <R : Comparable<Any>> DoubleArray.maxOf(selector: (Double) -> Any): Any {
   if (`$this$maxOf`.length == 0) {
      throw NoSuchElementException()
   } else {
      var maxValue: java.lang.Comparable = selector(`$this$maxOf`[0]) as java.lang.Comparable
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOf`)).iterator()

      while (var3.hasNext()) {
         val v: java.lang.Comparable = selector(`$this$maxOf`[var3.nextInt()]) as java.lang.Comparable
         if (maxValue.compareTo(v) < 0) {
            maxValue = v
         }
      }

      return (R)maxValue
   }
}

@OverloadResolutionByLambdaReturnType
@InlineOnly
@JvmName(name = "flatMapIndexedSequence")
@SinceKotlin(version = "1.4")
public inline fun <T, R> Array<out Any>.flatMapIndexed(transform: (Int, Any) -> Sequence<Any>): List<Any> {
   val var3: java.util.Collection = ArrayList()
   var var4: Int = 0

   for (var7 in `$this$flatMapIndexed`) {
      CollectionsKt.addAll(var3, transform(var4++, var7) as Sequence)
   }

   return var3 as MutableList<R>
}

public inline fun FloatArray.takeWhile(predicate: (Float) -> Boolean): List<Float> {
   val list: ArrayList = ArrayList()

   for (item in `$this$takeWhile`) {
      if (!predicate(item) as java.lang.Boolean) {
         break
      }

      list.add(item)
   }

   return list
}

public inline fun <K> IntArray.groupBy(keySelector: (Int) -> Any): Map<Any, List<Int>> {
   val `destination$iv`: java.util.Map = LinkedHashMap()

   for (`element$iv` in `$this$groupBy`) {
      val `key$iv`: Any = keySelector(`element$iv`)
      val `value$iv$iv`: Any = `destination$iv`.get(`key$iv`)
      val var10000: Any
      if (`value$iv$iv` == null) {
         val var15: java.util.List = ArrayList()
         `destination$iv`.put(`key$iv`, var15)
         var10000 = var15
      } else {
         var10000 = `value$iv$iv`
      }

      (var10000 as java.util.List).add(`element$iv`)
   }

   return `destination$iv`
}

public inline fun IntArray.reduceRightIndexed(operation: (Int, Int, Int) -> Int): Int {
   var index: Int = ArraysKt.getLastIndex(`$this$reduceRightIndexed`)
   if (index < 0) {
      throw UnsupportedOperationException("Empty array can't be reduced.")
   } else {
      var accumulator: Int = `$this$reduceRightIndexed`[index--]

      while (index >= 0) {
         accumulator = (operation(index, `$this$reduceRightIndexed`[index], accumulator) as java.lang.Number).intValue()
         index--
      }

      return accumulator
   }
}

public fun BooleanArray.joinToString(
   separator: CharSequence = ", " as java.lang.CharSequence,
   prefix: CharSequence = "" as java.lang.CharSequence,
   postfix: CharSequence = "" as java.lang.CharSequence,
   limit: Int = -1,
   truncated: CharSequence = "..." as java.lang.CharSequence,
   transform: ((Boolean) -> CharSequence)? = null
): String {
   val var10000: java.lang.String = ArraysKt.joinTo(`$this$joinToString`, StringBuilder(), separator, prefix, postfix, limit, truncated, transform).toString()
   return var10000
}

@SinceKotlin(version = "1.1")
public inline fun <T, K> Array<out Any>.groupingBy(crossinline keySelector: (Any) -> Any): Grouping<Any, Any> {
   return    // $VF: Compiled from _Arrays.kt
object : Grouping<Any, Any> {
      public override fun keyOf(element: Any): Any {
         return (K)keySelector(element)
      }

      public override fun sourceIterator(): Iterator<Any> {
         return ArrayIteratorKt.iterator((T[])$this$groupingBy)
      }
   }
}

public inline fun <R : Comparable<Any>> FloatArray.sortedBy(crossinline selector: (Float) -> Any?): List<Float> {
   return ArraysKt.sortedWith(`$this$sortedBy`,    // $VF: Compiled from Comparisons.kt
{ a: Any, b: Any ->
      val var3: Function1 = selector
      return ComparisonsKt.compareValues((T)(selector(a) as java.lang.Comparable), (T)(var3(b) as java.lang.Comparable))
   })
}

@JvmName(name = "maxWithOrThrow")
@SinceKotlin(version = "1.7")
public fun FloatArray.maxWith(comparator: Comparator<in Float>): Float {
   if (`$this$maxWith`.length == 0) {
      throw NoSuchElementException()
   } else {
      var max: Float = `$this$maxWith`[0]
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxWith`)).iterator()

      while (var3.hasNext()) {
         val e: Float = `$this$maxWith`[var3.nextInt()]
         if (comparator.compare(max, e) < 0) {
            max = e
         }
      }

      return max
   }
}

public fun LongArray.take(n: Int): List<Long> {
   if (n < 0) {
      throw IllegalArgumentException(("Requested element count $n is less than zero.").toString())
   } else if (n == 0) {
      return CollectionsKt.emptyList()
   } else if (n >= `$this$take`.length) {
      return ArraysKt.toList(`$this$take`)
   } else if (n == 1) {
      return CollectionsKt.listOf(`$this$take`[0])
   } else {
      val var8: Int = 0
      val list: ArrayList = ArrayList(n)

      for (item in `$this$take`) {
         list.add(item)
         if (++var8 == n) {
            break
         }
      }

      return list
   }
}

public inline fun LongArray.reduce(operation: (Long, Long) -> Long): Long {
   if (`$this$reduce`.length == 0) {
      throw UnsupportedOperationException("Empty array can't be reduced.")
   } else {
      var accumulator: Long = `$this$reduce`[0]
      val var5: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$reduce`)).iterator()

      while (var5.hasNext()) {
         accumulator = (operation(accumulator, `$this$reduce`[var5.nextInt()]) as java.lang.Number).longValue()
      }

      return accumulator
   }
}

@InlineOnly
@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
public inline fun IntArray.maxOfOrNull(selector: (Int) -> Double): Double? {
   if (`$this$maxOfOrNull`.length == 0) {
      return null
   } else {
      var maxValue: Double = (selector(`$this$maxOfOrNull`[0]) as java.lang.Number).doubleValue()
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfOrNull`)).iterator()

      while (var4.hasNext()) {
         maxValue = Math.max(maxValue, (selector(`$this$maxOfOrNull`[var4.nextInt()]) as java.lang.Number).doubleValue())
      }

      return maxValue
   }
}

public fun DoubleArray.singleOrNull(): Double? {
   return if (`$this$singleOrNull`.length == 1) `$this$singleOrNull`[0] else null
}

public fun BooleanArray.sliceArray(indices: IntRange): BooleanArray {
   return if (indices.isEmpty()) BooleanArray(0) else ArraysKt.copyOfRange(`$this$sliceArray`, indices.start, indices.endInclusive + 1)
}

@OverloadResolutionByLambdaReturnType
@InlineOnly
@JvmName(name = "sumOfULong")
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
public inline fun IntArray.sumOf(selector: (Int) -> ULong): ULong {
   var sum: Long = ULong.constructor_impl/* $VF was: constructor-impl */(0L)

   for (element in `$this$sumOf`) {
      sum = ULong.constructor_impl/* $VF was: constructor-impl */(sum + (selector(element) as ULong).unbox_impl/* $VF was: unbox-impl */())
   }

   return sum
}

public fun DoubleArray.reverse() {
   val midPoint: Int = `$this$reverse`.length / 2 - 1
   if (`$this$reverse`.length / 2 - 1 >= 0) {
      var reverseIndex: Int = ArraysKt.getLastIndex(`$this$reverse`)

      // $VF: Unable to resugar Kotlin loop from Java for loop
      val var3: IntIterator = IntRange(0, midPoint).iterator()
      while (true) {
         if (var3.hasNext()) break
         val index: Int = var3.nextInt()
         val tmp: Double = `$this$reverse`[index]
         `$this$reverse`[index] = `$this$reverse`[reverseIndex]
         `$this$reverse`[reverseIndex] = tmp

         reverseIndex--
      }
   }
}

@SinceKotlin(version = "1.3")
public fun ByteArray.random(random: Random): Byte {
   if (`$this$random`.length == 0) {
      throw NoSuchElementException("Array is empty.")
   } else {
      return `$this$random`[random.nextInt(`$this$random`.length)]
   }
}

public inline fun <T, K, V, M : MutableMap<in Any, MutableList<Any>>> Array<out Any>.groupByTo(
   destination: Any,
   keySelector: (Any) -> Any,
   valueTransform: (Any) -> Any
): Any {
   for (element in `$this$groupByTo`) {
      val key: Any = keySelector(element)
      val `value$iv`: Any = destination.get(key)
      val var10000: Any
      if (`value$iv` == null) {
         val var14: java.util.List = ArrayList()
         destination.put(key, var14)
         var10000 = var14
      } else {
         var10000 = `value$iv`
      }

      (var10000 as java.util.List).add(valueTransform(element))
   }

   return (M)destination
}

public fun LongArray.asIterable(): Iterable<Long> {
   return if (`$this$asIterable`.length == 0) CollectionsKt.emptyList() else ArraysKt___ArraysKt$asIterable$$inlined$Iterable$5(`$this$asIterable`)
}

@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun BooleanArray.onEach(action: (Boolean) -> Unit): BooleanArray {
   for (element in `$this$onEach`) {
      action(element)
   }

   return `$this$onEach`
}

public inline fun <K> ShortArray.distinctBy(selector: (Short) -> Any): List<Short> {
   val set: HashSet = HashSet()
   val list: ArrayList = ArrayList()

   for (e in `$this$distinctBy`) {
      if (set.add(selector(e))) {
         list.add(e)
      }
   }

   return list
}

public fun LongArray.takeLast(n: Int): List<Long> {
   if (n < 0) {
      throw IllegalArgumentException(("Requested element count $n is less than zero.").toString())
   } else if (n == 0) {
      return CollectionsKt.emptyList()
   } else {
      val var5: Int = `$this$takeLast`.length
      if (n >= `$this$takeLast`.length) {
         return ArraysKt.toList(`$this$takeLast`)
      } else if (n == 1) {
         return CollectionsKt.listOf(`$this$takeLast`[var5 + -1])
      } else {
         val list: ArrayList = ArrayList(n)

         for (index in var5 - n..var5) {
            list.add(`$this$takeLast`[index])
         }

         return list
      }
   }
}

@OverloadResolutionByLambdaReturnType
@JvmName(name = "sumOfInt")
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun DoubleArray.sumOf(selector: (Double) -> Int): Int {
   var sum: Int = 0

   for (element in `$this$sumOf`) {
      sum += (selector(element) as java.lang.Number).intValue()
   }

   return sum
}

public inline fun <V> FloatArray.zip(other: FloatArray, transform: (Float, Float) -> Any): List<Any> {
   val size: Int = Math.min(`$this$zip`.length, other.length)
   val list: ArrayList = ArrayList(size)

   repeat(size) { i ->
      list.add(transform(`$this$zip`[i], other[i]))
   }

   return list
}

@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public fun DoubleArray.randomOrNull(random: Random): Double? {
   return if (`$this$randomOrNull`.length == 0) null else `$this$randomOrNull`[random.nextInt(`$this$randomOrNull`.length)]
}

public inline fun <T> Array<out Any>.lastOrNull(predicate: (Any) -> Boolean): Any? {
   var var3: Int = `$this$lastOrNull`.length + -1
   if (0 <= `$this$lastOrNull`.length + -1) {
      do {
         val element: Any = `$this$lastOrNull`[var3--]
         if (predicate(element) as java.lang.Boolean) {
            return (T)element
         }
      } while (0 <= var3)
   }

   return null
}

public inline fun DoubleArray.last(predicate: (Double) -> Boolean): Double {
   var var3: Int = `$this$last`.length + -1
   if (0 <= `$this$last`.length + -1) {
      do {
         val element: Double = `$this$last`[var3--]
         if (predicate(element) as java.lang.Boolean) {
            return element
         }
      } while (0 <= var3)
   }

   throw NoSuchElementException("Array contains no element matching the predicate.")
}

@DeprecatedSinceKotlin(warningSince = "1.5")
@Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = []))
public inline fun LongArray.sumByDouble(selector: (Long) -> Double): Double {
   var sum: Double = 0.0

   for (element in `$this$sumByDouble`) {
      sum += (selector(element) as java.lang.Number).doubleValue()
   }

   return sum
}

public fun <A : Appendable> ByteArray.joinTo(
   buffer: Any,
   separator: CharSequence = ...,
   prefix: CharSequence = ...,
   postfix: CharSequence = ...,
   limit: Int = ...,
   truncated: CharSequence = ...,
   transform: ((Byte) -> CharSequence)? = ...
): Any {
   buffer.append(prefix)
   val count: Int = 0

   for (element in `$this$joinTo`) {
      if (++count > 1) {
         buffer.append(separator)
      }

      if (limit >= 0 && count > limit) {
         break
      }

      if (transform != null) {
         buffer.append(transform(element) as java.lang.CharSequence)
      } else {
         buffer.append(java.lang.String.valueOf(element))
      }
   }

   if (limit >= 0 && count > limit) {
      buffer.append(truncated)
   }

   buffer.append(postfix)
   return (A)buffer
}

@OverloadResolutionByLambdaReturnType
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun ByteArray.maxOf(selector: (Byte) -> Double): Double {
   if (`$this$maxOf`.length == 0) {
      throw NoSuchElementException()
   } else {
      var maxValue: Double = (selector(`$this$maxOf`[0]) as java.lang.Number).doubleValue()
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOf`)).iterator()

      while (var4.hasNext()) {
         maxValue = Math.max(maxValue, (selector(`$this$maxOf`[var4.nextInt()]) as java.lang.Number).doubleValue())
      }

      return maxValue
   }
}

public fun FloatArray.slice(indices: IntRange): List<Float> {
   return if (indices.isEmpty()) CollectionsKt.emptyList() else ArraysKt.asList(ArraysKt.copyOfRange(`$this$slice`, indices.start, indices.endInclusive + 1))
}

public inline fun <K> CharArray.associateBy(keySelector: (Char) -> Any): Map<Any, Char> {
   val `destination$iv`: java.util.Map = LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(`$this$associateBy`.length), 16))

   for (`element$iv` in `$this$associateBy`) {
      `destination$iv`.put(keySelector(`element$iv`), `element$iv`)
   }

   return `destination$iv`
}

public infix fun CharArray.zip(other: CharArray): List<Pair<Char, Char>> {
   val `$this$zip$iv`: CharArray = `$this$zip`
   val `size$iv`: Int = Math.min(`$this$zip`.length, other.length)
   val `list$iv`: ArrayList = ArrayList(`size$iv`)

   repeat(`size$iv`) { `i$iv` ->
      `list$iv`.add(`$this$zip$iv`[`i$iv`] to other[`i$iv`])
   }

   return `list$iv`
}

public inline fun IntArray.none(predicate: (Int) -> Boolean): Boolean {
   for (element in `$this$none`) {
      if (predicate(element) as java.lang.Boolean) {
         return false
      }
   }

   return true
}

public inline fun FloatArray.firstOrNull(predicate: (Float) -> Boolean): Float? {
   for (element in `$this$firstOrNull`) {
      if (predicate(element) as java.lang.Boolean) {
         return element
      }
   }

   return null
}

public fun DoubleArray.dropLast(n: Int): List<Double> {
   if (n < 0) {
      throw IllegalArgumentException(("Requested element count $n is less than zero.").toString())
   } else {
      return ArraysKt.take(`$this$dropLast`, RangesKt.coerceAtLeast(`$this$dropLast`.length - n, 0))
   }
}

public inline fun <R> LongArray.flatMap(transform: (Long) -> Iterable<Any>): List<Any> {
   val `destination$iv`: java.util.Collection = ArrayList()

   for (`element$iv` in `$this$flatMap`) {
      CollectionsKt.addAll(`destination$iv`, transform(`element$iv`) as java.lang.Iterable)
   }

   return `destination$iv` as MutableList<R>
}

public fun CharArray.reverse() {
   val midPoint: Int = `$this$reverse`.length / 2 - 1
   if (`$this$reverse`.length / 2 - 1 >= 0) {
      var reverseIndex: Int = ArraysKt.getLastIndex(`$this$reverse`)

      // $VF: Unable to resugar Kotlin loop from Java for loop
      val var3: IntIterator = IntRange(0, midPoint).iterator()
      while (true) {
         if (var3.hasNext()) break
         val index: Int = var3.nextInt()
         val tmp: Char = `$this$reverse`[index]
         `$this$reverse`[index] = `$this$reverse`[reverseIndex]
         `$this$reverse`[reverseIndex] = tmp

         reverseIndex--
      }
   }
}

public inline fun ShortArray.lastOrNull(predicate: (Short) -> Boolean): Short? {
   var var3: Int = `$this$lastOrNull`.length + -1
   if (0 <= `$this$lastOrNull`.length + -1) {
      do {
         val element: Short = `$this$lastOrNull`[var3--]
         if (predicate(element) as java.lang.Boolean) {
            return element
         }
      } while (0 <= var3)
   }

   return null
}

public fun CharArray.getOrNull(index: Int): Char? {
   return if (index >= 0 && index <= ArraysKt.getLastIndex(`$this$getOrNull`)) `$this$getOrNull`[index] else null
}

public inline fun ShortArray.reduceRightIndexed(operation: (Int, Short, Short) -> Short): Short {
   var index: Int = ArraysKt.getLastIndex(`$this$reduceRightIndexed`)
   if (index < 0) {
      throw UnsupportedOperationException("Empty array can't be reduced.")
   } else {
      var accumulator: Short = `$this$reduceRightIndexed`[index--]

      while (index >= 0) {
         accumulator = (operation(index, `$this$reduceRightIndexed`[index], accumulator) as java.lang.Number).shortValue()
         index--
      }

      return accumulator
   }
}

public inline fun DoubleArray.filter(predicate: (Double) -> Boolean): List<Double> {
   val `destination$iv`: java.util.Collection = ArrayList()

   for (`element$iv` in `$this$filter`) {
      if (predicate(`element$iv`) as java.lang.Boolean) {
         `destination$iv`.add(`element$iv`)
      }
   }

   return `destination$iv` as MutableList<java.lang.Double>
}

public inline fun BooleanArray.count(predicate: (Boolean) -> Boolean): Int {
   var count: Int = 0

   for (element in `$this$count`) {
      if (predicate(element) as java.lang.Boolean) {
         count++
      }
   }

   return count
}

public fun IntArray.indexOf(element: Int): Int {
   var index: Int = 0

   for (var3 in `$this$indexOf`.length..index) {
      if (element == `$this$indexOf`[index]) {
         return index
      }
   }

   return -1
}

@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
@InlineOnly
public inline fun <R : Comparable<Any>> LongArray.minOfOrNull(selector: (Long) -> Any): Any? {
   if (`$this$minOfOrNull`.length == 0) {
      return null
   } else {
      var minValue: java.lang.Comparable = selector(`$this$minOfOrNull`[0]) as java.lang.Comparable
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfOrNull`)).iterator()

      while (var3.hasNext()) {
         val v: java.lang.Comparable = selector(`$this$minOfOrNull`[var3.nextInt()]) as java.lang.Comparable
         if (minValue.compareTo(v) > 0) {
            minValue = v
         }
      }

      return (R)minValue
   }
}

@SinceKotlin(version = "1.4")
@InlineOnly
@OverloadResolutionByLambdaReturnType
public inline fun <R> ByteArray.minOfWith(comparator: Comparator<in Any>, selector: (Byte) -> Any): Any {
   if (`$this$minOfWith`.length == 0) {
      throw NoSuchElementException()
   } else {
      var minValue: Any = selector(`$this$minOfWith`[0])
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfWith`)).iterator()

      while (var4.hasNext()) {
         val v: Any = selector(`$this$minOfWith`[var4.nextInt()])
         if (comparator.compare(minValue, v) > 0) {
            minValue = v
         }
      }

      return (R)minValue
   }
}

@SinceKotlin(version = "1.4")
public fun FloatArray.maxOrNull(): Float? {
   if (`$this$maxOrNull`.length == 0) {
      return null
   } else {
      var max: Float = `$this$maxOrNull`[0]
      val var2: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOrNull`)).iterator()

      while (var2.hasNext()) {
         max = Math.max(max, `$this$maxOrNull`[var2.nextInt()])
      }

      return max
   }
}

public fun BooleanArray.indexOf(element: Boolean): Int {
   var index: Int = 0

   for (var3 in `$this$indexOf`.length..index) {
      if (element == `$this$indexOf`[index]) {
         return index
      }
   }

   return -1
}

public inline fun <R, C : MutableCollection<in Any>> CharArray.mapIndexedTo(destination: Any, transform: (Int, Char) -> Any): Any {
   var index: Int = 0

   for (item in `$this$mapIndexedTo`) {
      destination.add(transform(index++, item))
   }

   return (C)destination
}

@SinceKotlin(version = "1.4")
public inline fun <R : Comparable<Any>> CharArray.minByOrNull(selector: (Char) -> Any): Char? {
   if (`$this$minByOrNull`.length == 0) {
      return null
   } else {
      var minElem: Char = `$this$minByOrNull`[0]
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$minByOrNull`)
      if (lastIndex == 0) {
         return minElem
      } else {
         var minValue: java.lang.Comparable = selector(minElem) as java.lang.Comparable
         val var6: IntIterator = IntRange(1, lastIndex).iterator()

         while (var6.hasNext()) {
            val e: Char = `$this$minByOrNull`[var6.nextInt()]
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

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@InlineOnly
@JvmName(name = "flatMapIndexedIterable")
public inline fun <R> ShortArray.flatMapIndexed(transform: (Int, Short) -> Iterable<Any>): List<Any> {
   val var3: java.util.Collection = ArrayList()
   var var4: Int = 0

   for (var7 in `$this$flatMapIndexed`) {
      CollectionsKt.addAll(var3, transform(var4++, var7) as java.lang.Iterable)
   }

   return var3 as MutableList<R>
}

public infix fun <T> Array<out Any>.intersect(other: Iterable<Any>): Set<Any> {
   val set: java.util.Set = ArraysKt.toMutableSet(`$this$intersect`)
   CollectionsKt.retainAll(set, other)
   return set
}

public fun <T : Comparable<Any>> Array<out Any>.sorted(): List<Any> {
   return (java.util.List<T>)ArraysKt.asList(ArraysKt.sortedArray(`$this$sorted`))
}

@InlineOnly
public inline fun <T> Array<out Any>.elementAtOrNull(index: Int): Any? {
   return (T)ArraysKt.getOrNull((Object[])`$this$elementAtOrNull`, index)
}

@JvmName(name = "sumOfLong")
@SinceKotlin(version = "1.4")
@InlineOnly
@OverloadResolutionByLambdaReturnType
public inline fun CharArray.sumOf(selector: (Char) -> Long): Long {
   var sum: Long = 0L

   for (element in `$this$sumOf`) {
      sum += (selector(element) as java.lang.Number).longValue()
   }

   return sum
}

@SinceKotlin(version = "1.4")
public inline fun <R : Comparable<Any>> CharArray.maxByOrNull(selector: (Char) -> Any): Char? {
   if (`$this$maxByOrNull`.length == 0) {
      return null
   } else {
      var maxElem: Char = `$this$maxByOrNull`[0]
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$maxByOrNull`)
      if (lastIndex == 0) {
         return maxElem
      } else {
         var maxValue: java.lang.Comparable = selector(maxElem) as java.lang.Comparable
         val var6: IntIterator = IntRange(1, lastIndex).iterator()

         while (var6.hasNext()) {
            val e: Char = `$this$maxByOrNull`[var6.nextInt()]
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

public inline fun <S, T : Any> Array<out Any>.reduceRightIndexed(operation: (Int, Any, Any) -> Any): Any {
   var index: Int = ArraysKt.getLastIndex(`$this$reduceRightIndexed`)
   if (index < 0) {
      throw UnsupportedOperationException("Empty array can't be reduced.")
   } else {
      var accumulator: Any = `$this$reduceRightIndexed`[index--]

      while (index >= 0) {
         accumulator = operation(index, `$this$reduceRightIndexed`[index], accumulator)
         index--
      }

      return (S)accumulator
   }
}

public inline fun CharArray.single(predicate: (Char) -> Boolean): Char {
   var single: Character = null
   var found: Boolean = false

   for (element in `$this$single`) {
      if (predicate(element) as java.lang.Boolean) {
         if (found) {
            throw IllegalArgumentException("Array contains more than one matching element.")
         }

         single = element
         found = true
      }
   }

   if (!found) {
      throw NoSuchElementException("Array contains no element matching the predicate.")
   } else {
      return single
   }
}

public fun BooleanArray.toMutableSet(): MutableSet<Boolean> {
   return ArraysKt.toCollection(`$this$toMutableSet`, LinkedHashSet<>(MapsKt.mapCapacity(`$this$toMutableSet`.length)))
}

public fun <T> Array<out Any>.lastOrNull(): Any? {
   return (T)(if (`$this$lastOrNull`.length == 0) null else `$this$lastOrNull`[`$this$lastOrNull`.length - 1])
}

public inline fun BooleanArray.takeLastWhile(predicate: (Boolean) -> Boolean): List<Boolean> {
   for (index in ArraysKt.getLastIndex(`$this$takeLastWhile`) downTo 0) {
      if (!predicate(`$this$takeLastWhile`[index]) as java.lang.Boolean) {
         return ArraysKt.drop(`$this$takeLastWhile`, index + 1)
      }
   }

   return ArraysKt.toList(`$this$takeLastWhile`)
}

public fun ShortArray.lastOrNull(): Short? {
   return if (`$this$lastOrNull`.length == 0) null else `$this$lastOrNull`[`$this$lastOrNull`.length - 1]
}

@Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = []))
@DeprecatedSinceKotlin(warningSince = "1.5")
public inline fun CharArray.sumByDouble(selector: (Char) -> Double): Double {
   var sum: Double = 0.0

   for (element in `$this$sumByDouble`) {
      sum += (selector(element) as java.lang.Number).doubleValue()
   }

   return sum
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun <V> DoubleArray.associateWith(valueSelector: (Double) -> Any): Map<Double, Any> {
   val result: LinkedHashMap = LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(`$this$associateWith`.length), 16))

   for (var6 in `$this$associateWith`) {
      result.put(var6, valueSelector(var6))
   }

   return result
}

public fun CharArray.indexOf(element: Char): Int {
   var index: Int = 0

   for (var3 in `$this$indexOf`.length..index) {
      if (element == `$this$indexOf`[index]) {
         return index
      }
   }

   return -1
}

public fun ByteArray.last(): Byte {
   if (`$this$last`.length == 0) {
      throw NoSuchElementException("Array is empty.")
   } else {
      return `$this$last`[ArraysKt.getLastIndex(`$this$last`)]
   }
}

public inline fun <T, K, M : MutableMap<in Any, in Any>> Array<out Any>.associateByTo(destination: Any, keySelector: (Any) -> Any): Any {
   for (element in `$this$associateByTo`) {
      destination.put(keySelector(element), element)
   }

   return (M)destination
}

public inline fun BooleanArray.reduceRight(operation: (Boolean, Boolean) -> Boolean): Boolean {
   var index: Int = ArraysKt.getLastIndex(`$this$reduceRight`)
   if (index < 0) {
      throw UnsupportedOperationException("Empty array can't be reduced.")
   } else {
      var accumulator: Boolean = `$this$reduceRight`[index--]

      while (index >= 0) {
         accumulator = operation(`$this$reduceRight`[index--], accumulator) as java.lang.Boolean
      }

      return accumulator
   }
}

public final val lastIndex: Int
   public final get() {
      return `$this$lastIndex`.length - 1
   }


public fun ShortArray.toMutableSet(): MutableSet<Short> {
   return ArraysKt.toCollection((short[])`$this$toMutableSet`, LinkedHashSet<>(MapsKt.mapCapacity(`$this$toMutableSet`.length)))
}

public fun LongArray.reversedArray(): LongArray {
   if (`$this$reversedArray`.length == 0) {
      return `$this$reversedArray`
   } else {
      val result: LongArray = LongArray(`$this$reversedArray`.length)
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$reversedArray`)
      val var3: IntIterator = IntRange(0, lastIndex).iterator()

      while (var3.hasNext()) {
         val i: Int = var3.nextInt()
         result[lastIndex - i] = `$this$reversedArray`[i]
      }

      return result
   }
}

public infix fun ShortArray.subtract(other: Iterable<Short>): Set<Short> {
   val set: java.util.Set = ArraysKt.toMutableSet(`$this$subtract`)
   CollectionsKt.removeAll(set, other)
   return set
}

public fun IntArray.take(n: Int): List<Int> {
   if (n < 0) {
      throw IllegalArgumentException(("Requested element count $n is less than zero.").toString())
   } else if (n == 0) {
      return CollectionsKt.emptyList()
   } else if (n >= `$this$take`.length) {
      return ArraysKt.toList(`$this$take`)
   } else if (n == 1) {
      return CollectionsKt.listOf(`$this$take`[0])
   } else {
      val var7: Int = 0
      val list: ArrayList = ArrayList(n)

      for (item in `$this$take`) {
         list.add(item)
         if (++var7 == n) {
            break
         }
      }

      return list
   }
}

@InlineOnly
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
public inline fun BooleanArray.maxOf(selector: (Boolean) -> Float): Float {
   if (`$this$maxOf`.length == 0) {
      throw NoSuchElementException()
   } else {
      var maxValue: Float = (selector(`$this$maxOf`[0]) as java.lang.Number).floatValue()
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOf`)).iterator()

      while (var3.hasNext()) {
         maxValue = Math.max(maxValue, (selector(`$this$maxOf`[var3.nextInt()]) as java.lang.Number).floatValue())
      }

      return maxValue
   }
}

public inline fun <T, R : Any> Array<out Any>.mapNotNull(transform: (Any) -> Any?): List<Any> {
   val `destination$iv`: java.util.Collection = ArrayList()

   for (`element$iv$iv` in `$this$mapNotNull`) {
      val var10000: Any = transform(`element$iv$iv`)
      if (var10000 != null) {
         `destination$iv`.add(var10000)
      }
   }

   return `destination$iv` as MutableList<R>
}

@InlineOnly
public inline fun BooleanArray.isNotEmpty(): Boolean {
   return `$this$isNotEmpty`.length != 0
}

@SinceKotlin(version = "1.4")
public fun DoubleArray.shuffle(random: Random) {
   for (i in ArraysKt.getLastIndex(`$this$shuffle`) downTo 1) {
      val j: Int = random.nextInt(i + 1)
      val copy: Double = `$this$shuffle`[i]
      `$this$shuffle`[i] = `$this$shuffle`[j]
      `$this$shuffle`[j] = copy
   }
}

public inline fun <R, V> ByteArray.zip(other: Iterable<Any>, transform: (Byte, Any) -> Any): List<Any> {
   val arraySize: Int = `$this$zip`.length
   val list: ArrayList = ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(other, 10), `$this$zip`.length))
   var i: Int = 0

   for (element in other) {
      if (i >= arraySize) {
         break
      }

      list.add(transform(`$this$zip`[i++], element))
   }

   return list
}

public fun ShortArray.slice(indices: Iterable<Int>): List<Short> {
   val size: Int = CollectionsKt.collectionSizeOrDefault(indices, 10)
   if (size == 0) {
      return CollectionsKt.emptyList()
   } else {
      val list: ArrayList = ArrayList(size)
      val var4: java.util.Iterator = indices.iterator()

      while (var4.hasNext()) {
         list.add(`$this$slice`[(var4.next() as java.lang.Number).intValue()])
      }

      return list
   }
}

public inline fun <R, C : MutableCollection<in Any>> LongArray.mapTo(destination: Any, transform: (Long) -> Any): Any {
   for (item in `$this$mapTo`) {
      destination.add(transform(item))
   }

   return (C)destination
}

@SinceKotlin(version = "1.4")
public fun ShortArray.minOrNull(): Short? {
   if (`$this$minOrNull`.length == 0) {
      return null
   } else {
      var min: Short = `$this$minOrNull`[0]
      val var2: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOrNull`)).iterator()

      while (var2.hasNext()) {
         val e: Short = `$this$minOrNull`[var2.nextInt()]
         if (min > e) {
            min = e
         }
      }

      return min
   }
}

public inline fun LongArray.singleOrNull(predicate: (Long) -> Boolean): Long? {
   var single: java.lang.Long = null
   var found: Boolean = false

   for (element in `$this$singleOrNull`) {
      if (predicate(element) as java.lang.Boolean) {
         if (found) {
            return null
         }

         single = element
         found = true
      }
   }

   return if (!found) null else single
}

public inline fun <R> LongArray.foldRightIndexed(initial: Any, operation: (Int, Long, Any) -> Any): Any {
   var index: Int = ArraysKt.getLastIndex(`$this$foldRightIndexed`)
   var accumulator: Any = initial

   while (index >= 0) {
      accumulator = operation(index, `$this$foldRightIndexed`[index], accumulator)
      index--
   }

   return (R)accumulator
}

public fun ByteArray.sortedArrayDescending(): ByteArray {
   if (`$this$sortedArrayDescending`.length == 0) {
      return `$this$sortedArrayDescending`
   } else {
      val var10000: ByteArray = Arrays.copyOf(`$this$sortedArrayDescending`, `$this$sortedArrayDescending`.length)
      ArraysKt.sortDescending(var10000)
      return var10000
   }
}

public fun ShortArray.sliceArray(indices: IntRange): ShortArray {
   return if (indices.isEmpty()) ShortArray(0) else ArraysKt.copyOfRange((short[])`$this$sliceArray`, indices.start, indices.endInclusive + 1)
}

@InlineOnly
public inline operator fun CharArray.component4(): Char {
   return `$this$component4`[3]
}

public fun <T> Array<out Any>.dropLast(n: Int): List<Any> {
   if (n < 0) {
      throw IllegalArgumentException(("Requested element count $n is less than zero.").toString())
   } else {
      return (java.util.List<T>)ArraysKt.take((Object[])`$this$dropLast`, RangesKt.coerceAtLeast(`$this$dropLast`.length - n, 0))
   }
}

public fun DoubleArray.reversed(): List<Double> {
   if (`$this$reversed`.length == 0) {
      return CollectionsKt.emptyList()
   } else {
      val list: java.util.List = ArraysKt.toMutableList(`$this$reversed`)
      CollectionsKt.reverse(list)
      return list
   }
}

public inline fun <T, R> Array<out Any>.map(transform: (Any) -> Any): List<Any> {
   val `destination$iv`: java.util.Collection = ArrayList(`$this$map`.length)

   for (`item$iv` in `$this$map`) {
      `destination$iv`.add(transform(`item$iv`))
   }

   return `destination$iv` as MutableList<R>
}

public inline fun <R> LongArray.foldRight(initial: Any, operation: (Long, Any) -> Any): Any {
   var index: Int = ArraysKt.getLastIndex(`$this$foldRight`)
   var accumulator: Any = initial

   while (index >= 0) {
      accumulator = operation(`$this$foldRight`[index--], accumulator)
   }

   return (R)accumulator
}

public inline fun <R : Comparable<Any>> LongArray.sortedByDescending(crossinline selector: (Long) -> Any?): List<Long> {
   return ArraysKt.sortedWith(`$this$sortedByDescending`,    // $VF: Compiled from Comparisons.kt
{ a: Any, b: Any ->
      val var3: Function1 = selector
      return ComparisonsKt.compareValues((T)(selector(b) as java.lang.Comparable), (T)(var3(a) as java.lang.Comparable))
   })
}

@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
@InlineOnly
@JvmName(name = "flatMapIndexedIterableTo")
public inline fun <R, C : MutableCollection<in Any>> ShortArray.flatMapIndexedTo(destination: Any, transform: (Int, Short) -> Iterable<Any>): Any {
   var index: Int = 0

   for (element in `$this$flatMapIndexedTo`) {
      CollectionsKt.addAll(destination, transform(index++, element) as java.lang.Iterable)
   }

   return (C)destination
}

public fun ShortArray.last(): Short {
   if (`$this$last`.length == 0) {
      throw NoSuchElementException("Array is empty.")
   } else {
      return `$this$last`[ArraysKt.getLastIndex(`$this$last`)]
   }
}

public inline fun <K, V, M : MutableMap<in Any, in Any>> LongArray.associateByTo(destination: Any, keySelector: (Long) -> Any, valueTransform: (Long) -> Any): Any {
   for (element in `$this$associateByTo`) {
      destination.put(keySelector(element), valueTransform(element))
   }

   return (M)destination
}

@InlineOnly
@SinceKotlin(version = "1.5")
public inline fun <T, R : Any> Array<out Any>.firstNotNullOf(transform: (Any) -> Any?): Any {
   val var2: Array<Any> = `$this$firstNotNullOf`
   var var3: Int = 0
   val var4: Int = `$this$firstNotNullOf`.length

   var var10000: Any
   while (true) {
      if (var3 >= var4) {
         var10000 = null
         break
      }

      var10000 = transform(var2[var3])
      if (var10000 != null) {
         break
      }

      var3++
   }

   if (var10000 == null) {
      throw NoSuchElementException("No element of the array was transformed to a non-null value.")
   } else {
      return (R)var10000
   }
}

public fun ByteArray.toMutableSet(): MutableSet<Byte> {
   return ArraysKt.toCollection((byte[])`$this$toMutableSet`, LinkedHashSet<>(MapsKt.mapCapacity(`$this$toMutableSet`.length)))
}

public inline fun ByteArray.reduceRightIndexed(operation: (Int, Byte, Byte) -> Byte): Byte {
   var index: Int = ArraysKt.getLastIndex(`$this$reduceRightIndexed`)
   if (index < 0) {
      throw UnsupportedOperationException("Empty array can't be reduced.")
   } else {
      var accumulator: Byte = `$this$reduceRightIndexed`[index--]

      while (index >= 0) {
         accumulator = (operation(index, `$this$reduceRightIndexed`[index], accumulator) as java.lang.Number).byteValue()
         index--
      }

      return accumulator
   }
}

@SinceKotlin(version = "1.4")
public fun LongArray.shuffle() {
   ArraysKt.shuffle(`$this$shuffle`, Random.Default)
}

public fun DoubleArray.toMutableList(): MutableList<Double> {
   val list: ArrayList = ArrayList(`$this$toMutableList`.length)

   for (item in `$this$toMutableList`) {
      list.add(item)
   }

   return list
}

@InlineOnly
@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public inline fun <R> FloatArray.scan(initial: Any, operation: (Any, Float) -> Any): List<Any> {
   val var10000: java.util.List
   if (`$this$scan`.length == 0) {
      var10000 = CollectionsKt.listOf(initial)
   } else {
      val var4: ArrayList = ArrayList(`$this$scan`.length + 1)
      var4.add(initial)
      val var6: ArrayList = var4
      var var9: Any = initial

      for (var8 in `$this$scan`) {
         var9 = operation(var9, var8)
         var6.add(var9)
      }

      var10000 = var6
   }

   return var10000
}

@SinceKotlin(version = "1.4")
public inline fun LongArray.reduceIndexedOrNull(operation: (Int, Long, Long) -> Long): Long? {
   if (`$this$reduceIndexedOrNull`.length == 0) {
      return null
   } else {
      var accumulator: Long = `$this$reduceIndexedOrNull`[0]
      val var5: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$reduceIndexedOrNull`)).iterator()

      while (var5.hasNext()) {
         val index: Int = var5.nextInt()
         accumulator = (operation(index, accumulator, `$this$reduceIndexedOrNull`[index]) as java.lang.Number).longValue()
      }

      return accumulator
   }
}

public inline fun <K, V> FloatArray.associateBy(keySelector: (Float) -> Any, valueTransform: (Float) -> Any): Map<Any, Any> {
   val `destination$iv`: java.util.Map = LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(`$this$associateBy`.length), 16))

   for (`element$iv` in `$this$associateBy`) {
      `destination$iv`.put(keySelector(`element$iv`), valueTransform(`element$iv`))
   }

   return `destination$iv`
}

public fun BooleanArray.toMutableList(): MutableList<Boolean> {
   val list: ArrayList = ArrayList(`$this$toMutableList`.length)

   for (item in `$this$toMutableList`) {
      list.add(item)
   }

   return list
}

public inline fun DoubleArray.takeLastWhile(predicate: (Double) -> Boolean): List<Double> {
   for (index in ArraysKt.getLastIndex(`$this$takeLastWhile`) downTo 0) {
      if (!predicate(`$this$takeLastWhile`[index]) as java.lang.Boolean) {
         return ArraysKt.drop(`$this$takeLastWhile`, index + 1)
      }
   }

   return ArraysKt.toList(`$this$takeLastWhile`)
}

public fun BooleanArray.toList(): List<Boolean> {
   var var10000: java.util.List
   when (`$this$toList`.length) {
      0 -> var10000 = CollectionsKt.emptyList()
      1 -> var10000 = CollectionsKt.listOf(`$this$toList`[0])
      else -> var10000 = ArraysKt.toMutableList(`$this$toList`)
   }

   return var10000
}

@JvmName(name = "maxByOrThrow")
@SinceKotlin(version = "1.7")
public inline fun <R : Comparable<Any>> FloatArray.maxBy(selector: (Float) -> Any): Float {
   if (`$this$maxBy`.length == 0) {
      throw NoSuchElementException()
   } else {
      var maxElem: Float = `$this$maxBy`[0]
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$maxBy`)
      if (lastIndex == 0) {
         return maxElem
      } else {
         var maxValue: java.lang.Comparable = selector(maxElem) as java.lang.Comparable
         val var6: IntIterator = IntRange(1, lastIndex).iterator()

         while (var6.hasNext()) {
            val e: Float = `$this$maxBy`[var6.nextInt()]
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

public inline fun FloatArray.any(predicate: (Float) -> Boolean): Boolean {
   for (element in `$this$any`) {
      if (predicate(element) as java.lang.Boolean) {
         return true
      }
   }

   return false
}

public fun CharArray.sortedDescending(): List<Char> {
   val var10000: CharArray = Arrays.copyOf(`$this$sortedDescending`, `$this$sortedDescending`.length)
   ArraysKt.sort(var10000)
   return ArraysKt.reversed(var10000)
}

public fun BooleanArray.dropLast(n: Int): List<Boolean> {
   if (n < 0) {
      throw IllegalArgumentException(("Requested element count $n is less than zero.").toString())
   } else {
      return ArraysKt.take(`$this$dropLast`, RangesKt.coerceAtLeast(`$this$dropLast`.length - n, 0))
   }
}

public final val lastIndex: Int
   public final get() {
      return `$this$lastIndex`.length - 1
   }


public inline fun <K> LongArray.associateBy(keySelector: (Long) -> Any): Map<Any, Long> {
   val `destination$iv`: java.util.Map = LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(`$this$associateBy`.length), 16))

   for (`element$iv` in `$this$associateBy`) {
      `destination$iv`.put(keySelector(`element$iv`), `element$iv`)
   }

   return `destination$iv`
}

@InlineOnly
public inline operator fun BooleanArray.component3(): Boolean {
   return `$this$component3`[2]
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun LongArray.onEach(action: (Long) -> Unit): LongArray {
   for (element in `$this$onEach`) {
      action(element)
   }

   return `$this$onEach`
}

@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public inline fun CharArray.reduceRightOrNull(operation: (Char, Char) -> Char): Char? {
   var index: Int = ArraysKt.getLastIndex(`$this$reduceRightOrNull`)
   if (index < 0) {
      return null
   } else {
      var accumulator: Char = `$this$reduceRightOrNull`[index--]

      while (index >= 0) {
         accumulator = operation(`$this$reduceRightOrNull`[index--], accumulator) as Character
      }

      return accumulator
   }
}

@InlineOnly
public inline operator fun CharArray.component5(): Char {
   return `$this$component5`[4]
}

public fun FloatArray.asIterable(): Iterable<Float> {
   return if (`$this$asIterable`.length == 0) CollectionsKt.emptyList() else ArraysKt___ArraysKt$asIterable$$inlined$Iterable$6(`$this$asIterable`)
}

public fun LongArray.sliceArray(indices: Collection<Int>): LongArray {
   val result: LongArray = LongArray(indices.size())
   var targetIndex: Int = 0
   val var4: java.util.Iterator = indices.iterator()

   while (var4.hasNext()) {
      result[targetIndex++] = `$this$sliceArray`[(var4.next() as java.lang.Number).intValue()]
   }

   return result
}

@DeprecatedSinceKotlin(warningSince = "1.5")
@Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = []))
public inline fun <T> Array<out Any>.sumBy(selector: (Any) -> Int): Int {
   var sum: Int = 0

   for (element in `$this$sumBy`) {
      sum += (selector(element) as java.lang.Number).intValue()
   }

   return sum
}

@SinceKotlin(version = "1.4")
public fun <T : Comparable<Any>> Array<out Any>.sortDescending(fromIndex: Int, toIndex: Int) {
   ArraysKt.sortWith(`$this$sortDescending`, ComparisonsKt.reverseOrder(), fromIndex, toIndex)
}

public fun ByteArray.withIndex(): Iterable<IndexedValue<Byte>> {
   return IndexingIterable<>(   // $VF: Compiled from _Arrays.kt
{
      return ArrayIteratorsKt.iterator($this$withIndex)
   } as () -> MutableIterator<java.lang.Byte>)
}

public inline fun <K, V, M : MutableMap<in Any, MutableList<Any>>> DoubleArray.groupByTo(
   destination: Any,
   keySelector: (Double) -> Any,
   valueTransform: (Double) -> Any
): Any {
   for (element in `$this$groupByTo`) {
      val key: Any = keySelector(element)
      val `value$iv`: Any = destination.get(key)
      val var10000: Any
      if (`value$iv` == null) {
         val var15: java.util.List = ArrayList()
         destination.put(key, var15)
         var10000 = var15
      } else {
         var10000 = `value$iv`
      }

      (var10000 as java.util.List).add(valueTransform(element))
   }

   return (M)destination
}

@SinceKotlin(version = "1.4")
public inline fun <R : Comparable<Any>> DoubleArray.minByOrNull(selector: (Double) -> Any): Double? {
   if (`$this$minByOrNull`.length == 0) {
      return null
   } else {
      var minElem: Double = `$this$minByOrNull`[0]
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$minByOrNull`)
      if (lastIndex == 0) {
         return minElem
      } else {
         var minValue: java.lang.Comparable = selector(minElem) as java.lang.Comparable
         val var7: IntIterator = IntRange(1, lastIndex).iterator()

         while (var7.hasNext()) {
            val e: Double = `$this$minByOrNull`[var7.nextInt()]
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

public inline fun <K, V, M : MutableMap<in Any, MutableList<Any>>> FloatArray.groupByTo(
   destination: Any,
   keySelector: (Float) -> Any,
   valueTransform: (Float) -> Any
): Any {
   for (element in `$this$groupByTo`) {
      val key: Any = keySelector(element)
      val `value$iv`: Any = destination.get(key)
      val var10000: Any
      if (`value$iv` == null) {
         val var14: java.util.List = ArrayList()
         destination.put(key, var14)
         var10000 = var14
      } else {
         var10000 = `value$iv`
      }

      (var10000 as java.util.List).add(valueTransform(element))
   }

   return (M)destination
}

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun IntArray.minOfOrNull(selector: (Int) -> Double): Double? {
   if (`$this$minOfOrNull`.length == 0) {
      return null
   } else {
      var minValue: Double = (selector(`$this$minOfOrNull`[0]) as java.lang.Number).doubleValue()
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfOrNull`)).iterator()

      while (var4.hasNext()) {
         minValue = Math.min(minValue, (selector(`$this$minOfOrNull`[var4.nextInt()]) as java.lang.Number).doubleValue())
      }

      return minValue
   }
}

public fun <C : MutableCollection<in Short>> ShortArray.toCollection(destination: Any): Any {
   for (item in `$this$toCollection`) {
      destination.add(item)
   }

   return (C)destination
}

public inline fun <R, C : MutableCollection<in Any>> DoubleArray.flatMapTo(destination: Any, transform: (Double) -> Iterable<Any>): Any {
   for (element in `$this$flatMapTo`) {
      CollectionsKt.addAll(destination, transform(element) as java.lang.Iterable)
   }

   return (C)destination
}

@InlineOnly
public inline fun CharArray.getOrElse(index: Int, defaultValue: (Int) -> Char): Char {
   return if (index >= 0 && index <= ArraysKt.getLastIndex(`$this$getOrElse`)) `$this$getOrElse`[index] else defaultValue(index) as Character
}

public inline fun <K, V> ShortArray.associateBy(keySelector: (Short) -> Any, valueTransform: (Short) -> Any): Map<Any, Any> {
   val `destination$iv`: java.util.Map = LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(`$this$associateBy`.length), 16))

   for (`element$iv` in `$this$associateBy`) {
      `destination$iv`.put(keySelector(`element$iv`), valueTransform(`element$iv`))
   }

   return `destination$iv`
}

public fun DoubleArray.reversedArray(): DoubleArray {
   if (`$this$reversedArray`.length == 0) {
      return `$this$reversedArray`
   } else {
      val result: DoubleArray = DoubleArray(`$this$reversedArray`.length)
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$reversedArray`)
      val var3: IntIterator = IntRange(0, lastIndex).iterator()

      while (var3.hasNext()) {
         val i: Int = var3.nextInt()
         result[lastIndex - i] = `$this$reversedArray`[i]
      }

      return result
   }
}

@OverloadResolutionByLambdaReturnType
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun DoubleArray.minOf(selector: (Double) -> Double): Double {
   if (`$this$minOf`.length == 0) {
      throw NoSuchElementException()
   } else {
      var minValue: Double = (selector(`$this$minOf`[0]) as java.lang.Number).doubleValue()
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOf`)).iterator()

      while (var4.hasNext()) {
         minValue = Math.min(minValue, (selector(`$this$minOf`[var4.nextInt()]) as java.lang.Number).doubleValue())
      }

      return minValue
   }
}

public fun <T> Array<Any>.reversedArray(): Array<Any> {
   if (`$this$reversedArray`.length == 0) {
      return (T[])`$this$reversedArray`
   } else {
      val result: Array<Any> = ArraysKt.arrayOfNulls(`$this$reversedArray`, `$this$reversedArray`.length)
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$reversedArray`)
      val var3: IntIterator = IntRange(0, lastIndex).iterator()

      while (var3.hasNext()) {
         val i: Int = var3.nextInt()
         result[lastIndex - i] = `$this$reversedArray`[i]
      }

      return (T[])result
   }
}

@SinceKotlin(version = "1.4")
@JvmName(name = "flatMapIndexedIterableTo")
@OverloadResolutionByLambdaReturnType
@InlineOnly
public inline fun <R, C : MutableCollection<in Any>> IntArray.flatMapIndexedTo(destination: Any, transform: (Int, Int) -> Iterable<Any>): Any {
   var index: Int = 0

   for (element in `$this$flatMapIndexedTo`) {
      CollectionsKt.addAll(destination, transform(index++, element) as java.lang.Iterable)
   }

   return (C)destination
}

@SinceKotlin(version = "1.4")
public fun BooleanArray.shuffle() {
   ArraysKt.shuffle(`$this$shuffle`, Random.Default)
}

@InlineOnly
public inline fun FloatArray.elementAtOrNull(index: Int): Float? {
   return ArraysKt.getOrNull(`$this$elementAtOrNull`, index)
}

@InlineOnly
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
public inline fun <R : Comparable<Any>> LongArray.maxOf(selector: (Long) -> Any): Any {
   if (`$this$maxOf`.length == 0) {
      throw NoSuchElementException()
   } else {
      var maxValue: java.lang.Comparable = selector(`$this$maxOf`[0]) as java.lang.Comparable
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOf`)).iterator()

      while (var3.hasNext()) {
         val v: java.lang.Comparable = selector(`$this$maxOf`[var3.nextInt()]) as java.lang.Comparable
         if (maxValue.compareTo(v) < 0) {
            maxValue = v
         }
      }

      return (R)maxValue
   }
}

@InlineOnly
@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
public inline fun CharArray.minOf(selector: (Char) -> Double): Double {
   if (`$this$minOf`.length == 0) {
      throw NoSuchElementException()
   } else {
      var minValue: Double = (selector(`$this$minOf`[0]) as java.lang.Number).doubleValue()
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOf`)).iterator()

      while (var4.hasNext()) {
         minValue = Math.min(minValue, (selector(`$this$minOf`[var4.nextInt()]) as java.lang.Number).doubleValue())
      }

      return minValue
   }
}

@SinceKotlin(version = "1.4")
public inline fun <R : Comparable<Any>> BooleanArray.minByOrNull(selector: (Boolean) -> Any): Boolean? {
   if (`$this$minByOrNull`.length == 0) {
      return null
   } else {
      var minElem: Boolean = `$this$minByOrNull`[0]
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$minByOrNull`)
      if (lastIndex == 0) {
         return minElem
      } else {
         var minValue: java.lang.Comparable = selector(minElem) as java.lang.Comparable
         val var6: IntIterator = IntRange(1, lastIndex).iterator()

         while (var6.hasNext()) {
            val e: Boolean = `$this$minByOrNull`[var6.nextInt()]
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

@SinceKotlin(version = "1.4")
@InlineOnly
@OverloadResolutionByLambdaReturnType
public inline fun <R : Comparable<Any>> CharArray.minOf(selector: (Char) -> Any): Any {
   if (`$this$minOf`.length == 0) {
      throw NoSuchElementException()
   } else {
      var minValue: java.lang.Comparable = selector(`$this$minOf`[0]) as java.lang.Comparable
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOf`)).iterator()

      while (var3.hasNext()) {
         val v: java.lang.Comparable = selector(`$this$minOf`[var3.nextInt()]) as java.lang.Comparable
         if (minValue.compareTo(v) > 0) {
            minValue = v
         }
      }

      return (R)minValue
   }
}

public infix fun DoubleArray.intersect(other: Iterable<Double>): Set<Double> {
   val set: java.util.Set = ArraysKt.toMutableSet(`$this$intersect`)
   CollectionsKt.retainAll(set, other)
   return set
}

public infix fun <R> DoubleArray.zip(other: Array<out Any>): List<Pair<Double, Any>> {
   val `$this$zip$iv`: DoubleArray = `$this$zip`
   val `size$iv`: Int = Math.min(`$this$zip`.length, other.length)
   val `list$iv`: ArrayList = ArrayList(`size$iv`)

   repeat(`size$iv`) { `i$iv` ->
      `list$iv`.add(`$this$zip$iv`[`i$iv`] to other[`i$iv`])
   }

   return `list$iv`
}

@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@InlineOnly
public inline fun <T> Array<out Any>.randomOrNull(): Any? {
   return (T)ArraysKt.randomOrNull((Object[])`$this$randomOrNull`, Random.Default)
}

@InlineOnly
public inline fun <T> Array<out Any>.isNotEmpty(): Boolean {
   return `$this$isNotEmpty`.length != 0
}

public infix fun LongArray.intersect(other: Iterable<Long>): Set<Long> {
   val set: java.util.Set = ArraysKt.toMutableSet(`$this$intersect`)
   CollectionsKt.retainAll(set, other)
   return set
}

public inline fun LongArray.none(predicate: (Long) -> Boolean): Boolean {
   for (element in `$this$none`) {
      if (predicate(element) as java.lang.Boolean) {
         return false
      }
   }

   return true
}

public fun <T> Array<out Any>.first(): Any {
   if (`$this$first`.length == 0) {
      throw NoSuchElementException("Array is empty.")
   } else {
      return (T)`$this$first`[0]
   }
}

public inline fun <K> FloatArray.associateBy(keySelector: (Float) -> Any): Map<Any, Float> {
   val `destination$iv`: java.util.Map = LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(`$this$associateBy`.length), 16))

   for (`element$iv` in `$this$associateBy`) {
      `destination$iv`.put(keySelector(`element$iv`), `element$iv`)
   }

   return `destination$iv`
}

@InlineOnly
@OverloadResolutionByLambdaReturnType
@JvmName(name = "flatMapIndexedIterable")
@SinceKotlin(version = "1.4")
public inline fun <T, R> Array<out Any>.flatMapIndexed(transform: (Int, Any) -> Iterable<Any>): List<Any> {
   val var3: java.util.Collection = ArrayList()
   var var4: Int = 0

   for (var7 in `$this$flatMapIndexed`) {
      CollectionsKt.addAll(var3, transform(var4++, var7) as java.lang.Iterable)
   }

   return var3 as MutableList<R>
}

public fun ShortArray.average(): Double {
   var sum: Double = 0.0
   var count: Int = 0

   for (element in `$this$average`) {
      sum += element
      count++
   }

   return if (count == 0) java.lang.Double.NaN else sum / count
}

public final val indices: IntRange
   public final get() {
      return IntRange(0, ArraysKt.getLastIndex(`$this$indices`))
   }


@InlineOnly
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
public inline fun <R> IntArray.minOfWithOrNull(comparator: Comparator<in Any>, selector: (Int) -> Any): Any? {
   if (`$this$minOfWithOrNull`.length == 0) {
      return null
   } else {
      var minValue: Any = selector(`$this$minOfWithOrNull`[0])
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfWithOrNull`)).iterator()

      while (var4.hasNext()) {
         val v: Any = selector(`$this$minOfWithOrNull`[var4.nextInt()])
         if (comparator.compare(minValue, v) > 0) {
            minValue = v
         }
      }

      return (R)minValue
   }
}

@SinceKotlin(version = "1.4")
public inline fun <R : Comparable<Any>> LongArray.minByOrNull(selector: (Long) -> Any): Long? {
   if (`$this$minByOrNull`.length == 0) {
      return null
   } else {
      var minElem: Long = `$this$minByOrNull`[0]
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$minByOrNull`)
      if (lastIndex == 0) {
         return minElem
      } else {
         var minValue: java.lang.Comparable = selector(minElem) as java.lang.Comparable
         val var7: IntIterator = IntRange(1, lastIndex).iterator()

         while (var7.hasNext()) {
            val e: Long = `$this$minByOrNull`[var7.nextInt()]
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

@OverloadResolutionByLambdaReturnType
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun <T, R : Comparable<Any>> Array<out Any>.minOf(selector: (Any) -> Any): Any {
   if (`$this$minOf`.length == 0) {
      throw NoSuchElementException()
   } else {
      var minValue: java.lang.Comparable = selector(`$this$minOf`[0]) as java.lang.Comparable
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOf`)).iterator()

      while (var3.hasNext()) {
         val v: java.lang.Comparable = selector(`$this$minOf`[var3.nextInt()]) as java.lang.Comparable
         if (minValue.compareTo(v) > 0) {
            minValue = v
         }
      }

      return (R)minValue
   }
}

public fun DoubleArray.asIterable(): Iterable<Double> {
   return if (`$this$asIterable`.length == 0) CollectionsKt.emptyList() else ArraysKt___ArraysKt$asIterable$$inlined$Iterable$7(`$this$asIterable`)
}

public inline fun <T, C : MutableCollection<in Any>> Array<out Any>.filterNotTo(destination: Any, predicate: (Any) -> Boolean): Any {
   for (element in `$this$filterNotTo`) {
      if (!predicate(element) as java.lang.Boolean) {
         destination.add(element)
      }
   }

   return (C)destination
}

@JvmName(name = "averageOfByte")
public fun Array<out Byte>.average(): Double {
   var sum: Double = 0.0
   var count: Int = 0
   var var4: Int = 0

   for (var5 in `$this$average`.length..var4) {
      sum += `$this$average`[var4].byteValue()
      count++
   }

   return if (count == 0) java.lang.Double.NaN else sum / count
}

@SinceKotlin(version = "1.4")
public inline fun ShortArray.reduceRightIndexedOrNull(operation: (Int, Short, Short) -> Short): Short? {
   var index: Int = ArraysKt.getLastIndex(`$this$reduceRightIndexedOrNull`)
   if (index < 0) {
      return null
   } else {
      var accumulator: Short = `$this$reduceRightIndexedOrNull`[index--]

      while (index >= 0) {
         accumulator = (operation(index, `$this$reduceRightIndexedOrNull`[index], accumulator) as java.lang.Number).shortValue()
         index--
      }

      return accumulator
   }
}

@InlineOnly
@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public inline fun <R> ShortArray.scan(initial: Any, operation: (Any, Short) -> Any): List<Any> {
   val var10000: java.util.List
   if (`$this$scan`.length == 0) {
      var10000 = CollectionsKt.listOf(initial)
   } else {
      val var4: ArrayList = ArrayList(`$this$scan`.length + 1)
      var4.add(initial)
      val var6: ArrayList = var4
      var var9: Any = initial

      for (var8 in `$this$scan`) {
         var9 = operation(var9, var8)
         var6.add(var9)
      }

      var10000 = var6
   }

   return var10000
}

public inline fun LongArray.reduceIndexed(operation: (Int, Long, Long) -> Long): Long {
   if (`$this$reduceIndexed`.length == 0) {
      throw UnsupportedOperationException("Empty array can't be reduced.")
   } else {
      var accumulator: Long = `$this$reduceIndexed`[0]
      val var5: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$reduceIndexed`)).iterator()

      while (var5.hasNext()) {
         val index: Int = var5.nextInt()
         accumulator = (operation(index, accumulator, `$this$reduceIndexed`[index]) as java.lang.Number).longValue()
      }

      return accumulator
   }
}

public infix fun FloatArray.intersect(other: Iterable<Float>): Set<Float> {
   val set: java.util.Set = ArraysKt.toMutableSet(`$this$intersect`)
   CollectionsKt.retainAll(set, other)
   return set
}

@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun CharArray.runningReduce(operation: (Char, Char) -> Char): List<Char> {
   if (`$this$runningReduce`.length == 0) {
      return CollectionsKt.emptyList()
   } else {
      var var7: Char = `$this$runningReduce`[0]
      val index: ArrayList = ArrayList(`$this$runningReduce`.length)
      index.add(var7)
      val result: ArrayList = index
      var var8: Int = 1

      for (var9 in `$this$runningReduce`.length..var8) {
         var7 = operation(var7, `$this$runningReduce`[var8]) as Character
         result.add(var7)
      }

      return result
   }
}

@SinceKotlin(version = "1.4")
public inline fun <T, R : Comparable<Any>> Array<out Any>.minByOrNull(selector: (Any) -> Any): Any? {
   if (`$this$minByOrNull`.length == 0) {
      return null
   } else {
      var minElem: Any = `$this$minByOrNull`[0]
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$minByOrNull`)
      if (lastIndex == 0) {
         return (T)minElem
      } else {
         var minValue: java.lang.Comparable = selector(minElem) as java.lang.Comparable
         val var6: IntIterator = IntRange(1, lastIndex).iterator()

         while (var6.hasNext()) {
            val e: Any = `$this$minByOrNull`[var6.nextInt()]
            val v: java.lang.Comparable = selector(e) as java.lang.Comparable
            if (minValue.compareTo(v) > 0) {
               minElem = e
               minValue = v
            }
         }

         return (T)minElem
      }
   }
}

public fun FloatArray.sortDescending() {
   if (`$this$sortDescending`.length > 1) {
      ArraysKt.sort(`$this$sortDescending`)
      ArraysKt.reverse(`$this$sortDescending`)
   }
}

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun ByteArray.minOf(selector: (Byte) -> Float): Float {
   if (`$this$minOf`.length == 0) {
      throw NoSuchElementException()
   } else {
      var minValue: Float = (selector(`$this$minOf`[0]) as java.lang.Number).floatValue()
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOf`)).iterator()

      while (var3.hasNext()) {
         minValue = Math.min(minValue, (selector(`$this$minOf`[var3.nextInt()]) as java.lang.Number).floatValue())
      }

      return minValue
   }
}

@JvmName(name = "averageOfLong")
public fun Array<out Long>.average(): Double {
   var sum: Double = 0.0
   var count: Int = 0
   var var4: Int = 0

   for (var5 in `$this$average`.length..var4) {
      sum += `$this$average`[var4].longValue()
      count++
   }

   return if (count == 0) java.lang.Double.NaN else sum / count
}

@InlineOnly
@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
public inline fun FloatArray.minOfOrNull(selector: (Float) -> Float): Float? {
   if (`$this$minOfOrNull`.length == 0) {
      return null
   } else {
      var minValue: Float = (selector(`$this$minOfOrNull`[0]) as java.lang.Number).floatValue()
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfOrNull`)).iterator()

      while (var3.hasNext()) {
         minValue = Math.min(minValue, (selector(`$this$minOfOrNull`[var3.nextInt()]) as java.lang.Number).floatValue())
      }

      return minValue
   }
}

public inline fun BooleanArray.indexOfLast(predicate: (Boolean) -> Boolean): Int {
   var var3: Int = `$this$indexOfLast`.length + -1
   if (0 <= `$this$indexOfLast`.length + -1) {
      do {
         val index: Int = var3--
         if (predicate(`$this$indexOfLast`[index]) as java.lang.Boolean) {
            return index
         }
      } while (0 <= var3)
   }

   return -1
}

@InlineOnly
public inline fun DoubleArray.isEmpty(): Boolean {
   return `$this$isEmpty`.length == 0
}

@SinceKotlin(version = "1.4")
public fun FloatArray.maxWithOrNull(comparator: Comparator<in Float>): Float? {
   if (`$this$maxWithOrNull`.length == 0) {
      return null
   } else {
      var max: Float = `$this$maxWithOrNull`[0]
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxWithOrNull`)).iterator()

      while (var3.hasNext()) {
         val e: Float = `$this$maxWithOrNull`[var3.nextInt()]
         if (comparator.compare(max, e) < 0) {
            max = e
         }
      }

      return max
   }
}

public infix fun DoubleArray.zip(other: DoubleArray): List<Pair<Double, Double>> {
   val `$this$zip$iv`: DoubleArray = `$this$zip`
   val `size$iv`: Int = Math.min(`$this$zip`.length, other.length)
   val `list$iv`: ArrayList = ArrayList(`size$iv`)

   repeat(`size$iv`) { `i$iv` ->
      `list$iv`.add(`$this$zip$iv`[`i$iv`] to other[`i$iv`])
   }

   return `list$iv`
}

public inline fun <R, C : MutableCollection<in Any>> FloatArray.mapIndexedTo(destination: Any, transform: (Int, Float) -> Any): Any {
   var index: Int = 0

   for (item in `$this$mapIndexedTo`) {
      destination.add(transform(index++, item))
   }

   return (C)destination
}

public fun <T> Array<out Any>.none(): Boolean {
   return `$this$none`.length == 0
}

@InlineOnly
@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
public inline fun <R> FloatArray.maxOfWith(comparator: Comparator<in Any>, selector: (Float) -> Any): Any {
   if (`$this$maxOfWith`.length == 0) {
      throw NoSuchElementException()
   } else {
      var maxValue: Any = selector(`$this$maxOfWith`[0])
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfWith`)).iterator()

      while (var4.hasNext()) {
         val v: Any = selector(`$this$maxOfWith`[var4.nextInt()])
         if (comparator.compare(maxValue, v) < 0) {
            maxValue = v
         }
      }

      return (R)maxValue
   }
}

@SinceKotlin(version = "1.4")
public fun IntArray.minOrNull(): Int? {
   if (`$this$minOrNull`.length == 0) {
      return null
   } else {
      var min: Int = `$this$minOrNull`[0]
      val var2: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOrNull`)).iterator()

      while (var2.hasNext()) {
         val e: Int = `$this$minOrNull`[var2.nextInt()]
         if (min > e) {
            min = e
         }
      }

      return min
   }
}

@InlineOnly
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
public inline fun ShortArray.minOf(selector: (Short) -> Double): Double {
   if (`$this$minOf`.length == 0) {
      throw NoSuchElementException()
   } else {
      var minValue: Double = (selector(`$this$minOf`[0]) as java.lang.Number).doubleValue()
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOf`)).iterator()

      while (var4.hasNext()) {
         minValue = Math.min(minValue, (selector(`$this$minOf`[var4.nextInt()]) as java.lang.Number).doubleValue())
      }

      return minValue
   }
}

public inline fun ByteArray.single(predicate: (Byte) -> Boolean): Byte {
   var single: java.lang.Byte = null
   var found: Boolean = false

   for (element in `$this$single`) {
      if (predicate(element) as java.lang.Boolean) {
         if (found) {
            throw IllegalArgumentException("Array contains more than one matching element.")
         }

         single = element
         found = true
      }
   }

   if (!found) {
      throw NoSuchElementException("Array contains no element matching the predicate.")
   } else {
      return single
   }
}

public inline fun <R> IntArray.map(transform: (Int) -> Any): List<Any> {
   val `destination$iv`: java.util.Collection = ArrayList(`$this$map`.length)

   for (`item$iv` in `$this$map`) {
      `destination$iv`.add(transform(`item$iv`))
   }

   return `destination$iv` as MutableList<R>
}

public inline fun <K> LongArray.groupBy(keySelector: (Long) -> Any): Map<Any, List<Long>> {
   val `destination$iv`: java.util.Map = LinkedHashMap()

   for (`element$iv` in `$this$groupBy`) {
      val `key$iv`: Any = keySelector(`element$iv`)
      val `value$iv$iv`: Any = `destination$iv`.get(`key$iv`)
      val var10000: Any
      if (`value$iv$iv` == null) {
         val var16: java.util.List = ArrayList()
         `destination$iv`.put(`key$iv`, var16)
         var10000 = var16
      } else {
         var10000 = `value$iv$iv`
      }

      (var10000 as java.util.List).add(`element$iv`)
   }

   return `destination$iv`
}

public fun LongArray.first(): Long {
   if (`$this$first`.length == 0) {
      throw NoSuchElementException("Array is empty.")
   } else {
      return `$this$first`[0]
   }
}

public inline fun <T, C : MutableCollection<in Any>> Array<out Any>.filterIndexedTo(destination: Any, predicate: (Int, Any) -> Boolean): Any {
   val `index$iv`: Int = 0

   for (`item$iv` in `$this$filterIndexedTo`) {
      if (predicate(`index$iv`++, `item$iv`) as java.lang.Boolean) {
         destination.add(`item$iv`)
      }
   }

   return (C)destination
}

public fun <T> Array<out Any>.last(): Any {
   if (`$this$last`.length == 0) {
      throw NoSuchElementException("Array is empty.")
   } else {
      return (T)`$this$last`[ArraysKt.getLastIndex(`$this$last`)]
   }
}

@JvmName(name = "sumOfUInt")
@SinceKotlin(version = "1.5")
@OverloadResolutionByLambdaReturnType
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@InlineOnly
public inline fun <T> Array<out Any>.sumOf(selector: (Any) -> UInt): UInt {
   var sum: Int = UInt.constructor_impl/* $VF was: constructor-impl */(0)

   for (element in `$this$sumOf`) {
      sum = UInt.constructor_impl/* $VF was: constructor-impl */(sum + (selector(element) as UInt).unbox_impl/* $VF was: unbox-impl */())
   }

   return sum
}

public inline fun FloatArray.filterNot(predicate: (Float) -> Boolean): List<Float> {
   val `destination$iv`: java.util.Collection = ArrayList()

   for (`element$iv` in `$this$filterNot`) {
      if (!predicate(`element$iv`) as java.lang.Boolean) {
         `destination$iv`.add(`element$iv`)
      }
   }

   return `destination$iv` as MutableList<java.lang.Float>
}

public inline fun <K, M : MutableMap<in Any, MutableList<Char>>> CharArray.groupByTo(destination: Any, keySelector: (Char) -> Any): Any {
   for (element in `$this$groupByTo`) {
      val key: Any = keySelector(element)
      val `value$iv`: Any = destination.get(key)
      val var10000: Any
      if (`value$iv` == null) {
         val var13: java.util.List = ArrayList()
         destination.put(key, var13)
         var10000 = var13
      } else {
         var10000 = `value$iv`
      }

      (var10000 as java.util.List).add(element)
   }

   return (M)destination
}

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun FloatArray.maxOfOrNull(selector: (Float) -> Double): Double? {
   if (`$this$maxOfOrNull`.length == 0) {
      return null
   } else {
      var maxValue: Double = (selector(`$this$maxOfOrNull`[0]) as java.lang.Number).doubleValue()
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfOrNull`)).iterator()

      while (var4.hasNext()) {
         maxValue = Math.max(maxValue, (selector(`$this$maxOfOrNull`[var4.nextInt()]) as java.lang.Number).doubleValue())
      }

      return maxValue
   }
}

public fun LongArray.sum(): Long {
   var sum: Long = 0L

   for (element in `$this$sum`) {
      sum += element
   }

   return sum
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.4")
public fun LongArray.randomOrNull(random: Random): Long? {
   return if (`$this$randomOrNull`.length == 0) null else `$this$randomOrNull`[random.nextInt(`$this$randomOrNull`.length)]
}

public fun ShortArray.sorted(): List<Short> {
   val var1: Array<java.lang.Short> = ArraysKt.toTypedArray(`$this$sorted`)
   ArraysKt.sort(var1)
   return ArraysKt.asList(var1)
}

@InlineOnly
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@JvmName(name = "sumOfInt")
public inline fun LongArray.sumOf(selector: (Long) -> Int): Int {
   var sum: Int = 0

   for (element in `$this$sumOf`) {
      sum += (selector(element) as java.lang.Number).intValue()
   }

   return sum
}

public inline fun <K, V> ByteArray.associateBy(keySelector: (Byte) -> Any, valueTransform: (Byte) -> Any): Map<Any, Any> {
   val `destination$iv`: java.util.Map = LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(`$this$associateBy`.length), 16))

   for (`element$iv` in `$this$associateBy`) {
      `destination$iv`.put(keySelector(`element$iv`), valueTransform(`element$iv`))
   }

   return `destination$iv`
}

public fun ByteArray.slice(indices: Iterable<Int>): List<Byte> {
   val size: Int = CollectionsKt.collectionSizeOrDefault(indices, 10)
   if (size == 0) {
      return CollectionsKt.emptyList()
   } else {
      val list: ArrayList = ArrayList(size)
      val var4: java.util.Iterator = indices.iterator()

      while (var4.hasNext()) {
         list.add(`$this$slice`[(var4.next() as java.lang.Number).intValue()])
      }

      return list
   }
}

@InlineOnly
public inline fun LongArray.getOrElse(index: Int, defaultValue: (Int) -> Long): Long {
   return if (index >= 0 && index <= ArraysKt.getLastIndex(`$this$getOrElse`))
      `$this$getOrElse`[index]
      else
      (defaultValue(index) as java.lang.Number).longValue()
   }

public inline fun CharArray.forEachIndexed(action: (Int, Char) -> Unit) {
   var index: Int = 0

   for (item in `$this$forEachIndexed`) {
      action(index++, item)
   }
}

@InlineOnly
public inline fun BooleanArray.isEmpty(): Boolean {
   return `$this$isEmpty`.length == 0
}

public inline fun <K> ByteArray.associateBy(keySelector: (Byte) -> Any): Map<Any, Byte> {
   val `destination$iv`: java.util.Map = LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(`$this$associateBy`.length), 16))

   for (`element$iv` in `$this$associateBy`) {
      `destination$iv`.put(keySelector(`element$iv`), `element$iv`)
   }

   return `destination$iv`
}

public inline fun <R, C : MutableCollection<in Any>> IntArray.flatMapTo(destination: Any, transform: (Int) -> Iterable<Any>): Any {
   for (element in `$this$flatMapTo`) {
      CollectionsKt.addAll(destination, transform(element) as java.lang.Iterable)
   }

   return (C)destination
}

@InlineOnly
@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
public inline fun <R> ShortArray.maxOfWithOrNull(comparator: Comparator<in Any>, selector: (Short) -> Any): Any? {
   if (`$this$maxOfWithOrNull`.length == 0) {
      return null
   } else {
      var maxValue: Any = selector(`$this$maxOfWithOrNull`[0])
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfWithOrNull`)).iterator()

      while (var4.hasNext()) {
         val v: Any = selector(`$this$maxOfWithOrNull`[var4.nextInt()])
         if (comparator.compare(maxValue, v) < 0) {
            maxValue = v
         }
      }

      return (R)maxValue
   }
}

public inline fun <K> IntArray.distinctBy(selector: (Int) -> Any): List<Int> {
   val set: HashSet = HashSet()
   val list: ArrayList = ArrayList()

   for (e in `$this$distinctBy`) {
      if (set.add(selector(e))) {
         list.add(e)
      }
   }

   return list
}

public fun <T, C : MutableCollection<in Any>> Array<out Any>.toCollection(destination: Any): Any {
   for (item in `$this$toCollection`) {
      destination.add(item)
   }

   return (C)destination
}

@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun <R> ShortArray.runningFold(initial: Any, operation: (Any, Short) -> Any): List<Any> {
   if (`$this$runningFold`.length == 0) {
      return (java.util.List<R>)CollectionsKt.listOf(initial)
   } else {
      var accumulator: Any = ArrayList(`$this$runningFold`.length + 1)
      accumulator.add(initial)
      val result: Any = accumulator
      accumulator = initial

      for (element in `$this$runningFold`) {
         accumulator = operation(accumulator, element)
         result.add(accumulator)
      }

      return result as MutableList<R>
   }
}

public inline fun CharArray.first(predicate: (Char) -> Boolean): Char {
   for (element in `$this$first`) {
      if (predicate(element) as java.lang.Boolean) {
         return element
      }
   }

   throw NoSuchElementException("Array contains no element matching the predicate.")
}

public inline fun <K, V> LongArray.groupBy(keySelector: (Long) -> Any, valueTransform: (Long) -> Any): Map<Any, List<Any>> {
   val `destination$iv`: java.util.Map = LinkedHashMap()

   for (`element$iv` in `$this$groupBy`) {
      val `key$iv`: Any = keySelector(`element$iv`)
      val `value$iv$iv`: Any = `destination$iv`.get(`key$iv`)
      val var10000: Any
      if (`value$iv$iv` == null) {
         val var17: java.util.List = ArrayList()
         `destination$iv`.put(`key$iv`, var17)
         var10000 = var17
      } else {
         var10000 = `value$iv$iv`
      }

      (var10000 as java.util.List).add(valueTransform(`element$iv`))
   }

   return `destination$iv`
}

public inline fun <R, V> FloatArray.zip(other: Iterable<Any>, transform: (Float, Any) -> Any): List<Any> {
   val arraySize: Int = `$this$zip`.length
   val list: ArrayList = ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(other, 10), `$this$zip`.length))
   var i: Int = 0

   for (element in other) {
      if (i >= arraySize) {
         break
      }

      list.add(transform(`$this$zip`[i++], element))
   }

   return list
}

@SinceKotlin(version = "1.5")
@OverloadResolutionByLambdaReturnType
@JvmName(name = "sumOfUInt")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@InlineOnly
public inline fun FloatArray.sumOf(selector: (Float) -> UInt): UInt {
   var sum: Int = UInt.constructor_impl/* $VF was: constructor-impl */(0)

   for (element in `$this$sumOf`) {
      sum = UInt.constructor_impl/* $VF was: constructor-impl */(sum + (selector(element) as UInt).unbox_impl/* $VF was: unbox-impl */())
   }

   return sum
}

public fun CharArray.drop(n: Int): List<Char> {
   if (n < 0) {
      throw IllegalArgumentException(("Requested element count $n is less than zero.").toString())
   } else {
      return ArraysKt.takeLast((char[])`$this$drop`, RangesKt.coerceAtLeast(`$this$drop`.length - n, 0))
   }
}

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun ShortArray.minOfOrNull(selector: (Short) -> Float): Float? {
   if (`$this$minOfOrNull`.length == 0) {
      return null
   } else {
      var minValue: Float = (selector(`$this$minOfOrNull`[0]) as java.lang.Number).floatValue()
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfOrNull`)).iterator()

      while (var3.hasNext()) {
         minValue = Math.min(minValue, (selector(`$this$minOfOrNull`[var3.nextInt()]) as java.lang.Number).floatValue())
      }

      return minValue
   }
}

@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
@InlineOnly
public inline fun <T, R : Comparable<Any>> Array<out Any>.maxOfOrNull(selector: (Any) -> Any): Any? {
   if (`$this$maxOfOrNull`.length == 0) {
      return null
   } else {
      var maxValue: java.lang.Comparable = selector(`$this$maxOfOrNull`[0]) as java.lang.Comparable
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfOrNull`)).iterator()

      while (var3.hasNext()) {
         val v: java.lang.Comparable = selector(`$this$maxOfOrNull`[var3.nextInt()]) as java.lang.Comparable
         if (maxValue.compareTo(v) < 0) {
            maxValue = v
         }
      }

      return (R)maxValue
   }
}

@InlineOnly
public inline fun DoubleArray.isNotEmpty(): Boolean {
   return `$this$isNotEmpty`.length != 0
}

public fun ShortArray.takeLast(n: Int): List<Short> {
   if (n < 0) {
      throw IllegalArgumentException(("Requested element count $n is less than zero.").toString())
   } else if (n == 0) {
      return CollectionsKt.emptyList()
   } else {
      val var5: Int = `$this$takeLast`.length
      if (n >= `$this$takeLast`.length) {
         return ArraysKt.toList(`$this$takeLast`)
      } else if (n == 1) {
         return CollectionsKt.listOf(`$this$takeLast`[var5 + -1])
      } else {
         val list: ArrayList = ArrayList(n)

         for (index in var5 - n..var5) {
            list.add(`$this$takeLast`[index])
         }

         return list
      }
   }
}

@JvmName(name = "sumOfDouble")
@OverloadResolutionByLambdaReturnType
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun IntArray.sumOf(selector: (Int) -> Double): Double {
   var sum: Double = 0.0

   for (element in `$this$sumOf`) {
      sum += (selector(element) as java.lang.Number).doubleValue()
   }

   return sum
}

@InlineOnly
public inline fun ByteArray.findLast(predicate: (Byte) -> Boolean): Byte? {
   val `$this$lastOrNull$iv`: ByteArray = `$this$findLast`
   var var4: Int = `$this$findLast`.length + -1
   if (0 <= `$this$findLast`.length + -1) {
      do {
         val `element$iv`: Byte = `$this$lastOrNull$iv`[var4--]
         if (predicate(`element$iv`) as java.lang.Boolean) {
            return `element$iv`
         }
      } while (0 <= var4)
   }

   return null
}

public inline fun IntArray.firstOrNull(predicate: (Int) -> Boolean): Int? {
   for (element in `$this$firstOrNull`) {
      if (predicate(element) as java.lang.Boolean) {
         return element
      }
   }

   return null
}

public fun FloatArray.firstOrNull(): Float? {
   return if (`$this$firstOrNull`.length == 0) null else `$this$firstOrNull`[0]
}

public infix fun <R> IntArray.zip(other: Array<out Any>): List<Pair<Int, Any>> {
   val `$this$zip$iv`: IntArray = `$this$zip`
   val `size$iv`: Int = Math.min(`$this$zip`.length, other.length)
   val `list$iv`: ArrayList = ArrayList(`size$iv`)

   repeat(`size$iv`) { `i$iv` ->
      `list$iv`.add(`$this$zip$iv`[`i$iv`] to other[`i$iv`])
   }

   return `list$iv`
}

public inline fun <K, V, M : MutableMap<in Any, in Any>> ShortArray.associateTo(destination: Any, transform: (Short) -> Pair<Any, Any>): Any {
   for (element in `$this$associateTo`) {
      val var8: Pair = transform(element) as Pair
      destination.put(var8.first, var8.second)
   }

   return (M)destination
}

public fun ShortArray.reverse() {
   val midPoint: Int = `$this$reverse`.length / 2 - 1
   if (`$this$reverse`.length / 2 - 1 >= 0) {
      var reverseIndex: Int = ArraysKt.getLastIndex(`$this$reverse`)

      // $VF: Unable to resugar Kotlin loop from Java for loop
      val var3: IntIterator = IntRange(0, midPoint).iterator()
      while (true) {
         if (var3.hasNext()) break
         val index: Int = var3.nextInt()
         val tmp: Short = `$this$reverse`[index]
         `$this$reverse`[index] = `$this$reverse`[reverseIndex]
         `$this$reverse`[reverseIndex] = tmp

         reverseIndex--
      }
   }
}

@OverloadResolutionByLambdaReturnType
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun FloatArray.minOfOrNull(selector: (Float) -> Double): Double? {
   if (`$this$minOfOrNull`.length == 0) {
      return null
   } else {
      var minValue: Double = (selector(`$this$minOfOrNull`[0]) as java.lang.Number).doubleValue()
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfOrNull`)).iterator()

      while (var4.hasNext()) {
         minValue = Math.min(minValue, (selector(`$this$minOfOrNull`[var4.nextInt()]) as java.lang.Number).doubleValue())
      }

      return minValue
   }
}

@SinceKotlin(version = "1.4")
@InlineOnly
@OverloadResolutionByLambdaReturnType
public inline fun <R : Comparable<Any>> CharArray.maxOfOrNull(selector: (Char) -> Any): Any? {
   if (`$this$maxOfOrNull`.length == 0) {
      return null
   } else {
      var maxValue: java.lang.Comparable = selector(`$this$maxOfOrNull`[0]) as java.lang.Comparable
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfOrNull`)).iterator()

      while (var3.hasNext()) {
         val v: java.lang.Comparable = selector(`$this$maxOfOrNull`[var3.nextInt()]) as java.lang.Comparable
         if (maxValue.compareTo(v) < 0) {
            maxValue = v
         }
      }

      return (R)maxValue
   }
}

@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun <R> DoubleArray.runningFoldIndexed(initial: Any, operation: (Int, Any, Double) -> Any): List<Any> {
   if (`$this$runningFoldIndexed`.length == 0) {
      return (java.util.List<R>)CollectionsKt.listOf(initial)
   } else {
      var accumulator: Any = ArrayList(`$this$runningFoldIndexed`.length + 1)
      accumulator.add(initial)
      val result: Any = accumulator
      accumulator = initial
      var var8: Int = 0

      for (var9 in `$this$runningFoldIndexed`.length..var8) {
         accumulator = operation(var8, accumulator, `$this$runningFoldIndexed`[var8])
         result.add(accumulator)
      }

      return result as MutableList<R>
   }
}

public inline fun <C : MutableCollection<in Boolean>> BooleanArray.filterIndexedTo(destination: Any, predicate: (Int, Boolean) -> Boolean): Any {
   val `index$iv`: Int = 0

   for (`item$iv` in `$this$filterIndexedTo`) {
      if (predicate(`index$iv`++, `item$iv`) as java.lang.Boolean) {
         destination.add(`item$iv`)
      }
   }

   return (C)destination
}

public fun DoubleArray.asSequence(): Sequence<Double> {
   return if (`$this$asSequence`.length == 0) SequencesKt.emptySequence() else ArraysKt___ArraysKt$asSequence$$inlined$Sequence$7(`$this$asSequence`)
}

@SinceKotlin(version = "1.4")
@InlineOnly
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public inline fun DoubleArray.randomOrNull(): Double? {
   return ArraysKt.randomOrNull(`$this$randomOrNull`, Random.Default)
}

public fun BooleanArray.getOrNull(index: Int): Boolean? {
   return if (index >= 0 && index <= ArraysKt.getLastIndex(`$this$getOrNull`)) `$this$getOrNull`[index] else null
}

@SinceKotlin(version = "1.4")
public fun CharArray.maxOrNull(): Char? {
   if (`$this$maxOrNull`.length == 0) {
      return null
   } else {
      var max: Char = `$this$maxOrNull`[0]
      val var2: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOrNull`)).iterator()

      while (var2.hasNext()) {
         val e: Char = `$this$maxOrNull`[var2.nextInt()]
         if (Intrinsics.compare(max, e) < 0) {
            max = e
         }
      }

      return max
   }
}

@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun IntArray.random(): Int {
   return ArraysKt.random((int[])`$this$random`, Random.Default)
}

public inline fun ByteArray.lastOrNull(predicate: (Byte) -> Boolean): Byte? {
   var var3: Int = `$this$lastOrNull`.length + -1
   if (0 <= `$this$lastOrNull`.length + -1) {
      do {
         val element: Byte = `$this$lastOrNull`[var3--]
         if (predicate(element) as java.lang.Boolean) {
            return element
         }
      } while (0 <= var3)
   }

   return null
}

public fun CharArray.sortDescending() {
   if (`$this$sortDescending`.length > 1) {
      ArraysKt.sort(`$this$sortDescending`)
      ArraysKt.reverse(`$this$sortDescending`)
   }
}

public inline fun DoubleArray.lastOrNull(predicate: (Double) -> Boolean): Double? {
   var var3: Int = `$this$lastOrNull`.length + -1
   if (0 <= `$this$lastOrNull`.length + -1) {
      do {
         val element: Double = `$this$lastOrNull`[var3--]
         if (predicate(element) as java.lang.Boolean) {
            return element
         }
      } while (0 <= var3)
   }

   return null
}

public fun Array<out Boolean>.toBooleanArray(): BooleanArray {
   var var1: Int = 0
   val var2: Int = `$this$toBooleanArray`.length
   val var3: BooleanArray = BooleanArray(`$this$toBooleanArray`.length)

   while (var1 < var2) {
      var3[var1] = `$this$toBooleanArray`[var1]
      var1++
   }

   return var3
}

public fun IntArray.sortedWith(comparator: Comparator<in Int>): List<Int> {
   val var2: Array<Int> = ArraysKt.toTypedArray(`$this$sortedWith`)
   ArraysKt.sortWith(var2, comparator)
   return ArraysKt.asList(var2)
}

public fun CharArray.take(n: Int): List<Char> {
   if (n < 0) {
      throw IllegalArgumentException(("Requested element count $n is less than zero.").toString())
   } else if (n == 0) {
      return CollectionsKt.emptyList()
   } else if (n >= `$this$take`.length) {
      return ArraysKt.toList(`$this$take`)
   } else if (n == 1) {
      return CollectionsKt.listOf(`$this$take`[0])
   } else {
      val var7: Int = 0
      val list: ArrayList = ArrayList(n)

      for (item in `$this$take`) {
         list.add(item)
         if (++var7 == n) {
            break
         }
      }

      return list
   }
}

public fun IntArray.sliceArray(indices: Collection<Int>): IntArray {
   val result: IntArray = IntArray(indices.size())
   var targetIndex: Int = 0
   val var4: java.util.Iterator = indices.iterator()

   while (var4.hasNext()) {
      result[targetIndex++] = `$this$sliceArray`[(var4.next() as java.lang.Number).intValue()]
   }

   return result
}

public fun IntArray.sortedArray(): IntArray {
   if (`$this$sortedArray`.length == 0) {
      return `$this$sortedArray`
   } else {
      val var10000: IntArray = Arrays.copyOf(`$this$sortedArray`, `$this$sortedArray`.length)
      ArraysKt.sort(var10000)
      return var10000
   }
}

public inline fun ByteArray.reduceRight(operation: (Byte, Byte) -> Byte): Byte {
   var index: Int = ArraysKt.getLastIndex(`$this$reduceRight`)
   if (index < 0) {
      throw UnsupportedOperationException("Empty array can't be reduced.")
   } else {
      var accumulator: Byte = `$this$reduceRight`[index--]

      while (index >= 0) {
         accumulator = (operation(`$this$reduceRight`[index--], accumulator) as java.lang.Number).byteValue()
      }

      return accumulator
   }
}

public inline fun <T> Array<out Any>.singleOrNull(predicate: (Any) -> Boolean): Any? {
   var single: Any = null
   var found: Boolean = false

   for (element in `$this$singleOrNull`) {
      if (predicate(element) as java.lang.Boolean) {
         if (found) {
            return null
         }

         single = element
         found = true
      }
   }

   return (T)(if (!found) null else single)
}

public fun BooleanArray.slice(indices: IntRange): List<Boolean> {
   return if (indices.isEmpty()) CollectionsKt.emptyList() else ArraysKt.asList(ArraysKt.copyOfRange(`$this$slice`, indices.start, indices.endInclusive + 1))
}

public fun ByteArray.drop(n: Int): List<Byte> {
   if (n < 0) {
      throw IllegalArgumentException(("Requested element count $n is less than zero.").toString())
   } else {
      return ArraysKt.takeLast((byte[])`$this$drop`, RangesKt.coerceAtLeast(`$this$drop`.length - n, 0))
   }
}

@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun DoubleArray.random(): Double {
   return ArraysKt.random(`$this$random`, Random.Default)
}

public inline fun IntArray.forEach(action: (Int) -> Unit) {
   for (element in `$this$forEach`) {
      action(element)
   }
}

@OverloadResolutionByLambdaReturnType
@JvmName(name = "sumOfDouble")
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun CharArray.sumOf(selector: (Char) -> Double): Double {
   var sum: Double = 0.0

   for (element in `$this$sumOf`) {
      sum += (selector(element) as java.lang.Number).doubleValue()
   }

   return sum
}

public fun CharArray.first(): Char {
   if (`$this$first`.length == 0) {
      throw NoSuchElementException("Array is empty.")
   } else {
      return `$this$first`[0]
   }
}

@InlineOnly
public inline fun BooleanArray.findLast(predicate: (Boolean) -> Boolean): Boolean? {
   val `$this$lastOrNull$iv`: BooleanArray = `$this$findLast`
   var var4: Int = `$this$findLast`.length + -1
   if (0 <= `$this$findLast`.length + -1) {
      do {
         val `element$iv`: Boolean = `$this$lastOrNull$iv`[var4--]
         if (predicate(`element$iv`) as java.lang.Boolean) {
            return `element$iv`
         }
      } while (0 <= var4)
   }

   return null
}

@SinceKotlin(version = "1.7")
@JvmName(name = "minByOrThrow")
public inline fun <R : Comparable<Any>> ShortArray.minBy(selector: (Short) -> Any): Short {
   if (`$this$minBy`.length == 0) {
      throw NoSuchElementException()
   } else {
      var minElem: Short = `$this$minBy`[0]
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$minBy`)
      if (lastIndex == 0) {
         return minElem
      } else {
         var minValue: java.lang.Comparable = selector(minElem) as java.lang.Comparable
         val var6: IntIterator = IntRange(1, lastIndex).iterator()

         while (var6.hasNext()) {
            val e: Short = `$this$minBy`[var6.nextInt()]
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

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun <R> IntArray.runningFoldIndexed(initial: Any, operation: (Int, Any, Int) -> Any): List<Any> {
   if (`$this$runningFoldIndexed`.length == 0) {
      return (java.util.List<R>)CollectionsKt.listOf(initial)
   } else {
      var accumulator: Any = ArrayList(`$this$runningFoldIndexed`.length + 1)
      accumulator.add(initial)
      val result: Any = accumulator
      accumulator = initial
      var var8: Int = 0

      for (var9 in `$this$runningFoldIndexed`.length..var8) {
         accumulator = operation(var8, accumulator, `$this$runningFoldIndexed`[var8])
         result.add(accumulator)
      }

      return result as MutableList<R>
   }
}

@InlineOnly
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.4")
public inline fun <R> ByteArray.scan(initial: Any, operation: (Any, Byte) -> Any): List<Any> {
   val var10000: java.util.List
   if (`$this$scan`.length == 0) {
      var10000 = CollectionsKt.listOf(initial)
   } else {
      val var4: ArrayList = ArrayList(`$this$scan`.length + 1)
      var4.add(initial)
      val var6: ArrayList = var4
      var var9: Any = initial

      for (var8 in `$this$scan`) {
         var9 = operation(var9, var8)
         var6.add(var9)
      }

      var10000 = var6
   }

   return var10000
}

public infix fun FloatArray.subtract(other: Iterable<Float>): Set<Float> {
   val set: java.util.Set = ArraysKt.toMutableSet(`$this$subtract`)
   CollectionsKt.removeAll(set, other)
   return set
}

public fun LongArray.toMutableSet(): MutableSet<Long> {
   return ArraysKt.toCollection(`$this$toMutableSet`, LinkedHashSet<>(MapsKt.mapCapacity(`$this$toMutableSet`.length)))
}

public inline fun <R> IntArray.flatMap(transform: (Int) -> Iterable<Any>): List<Any> {
   val `destination$iv`: java.util.Collection = ArrayList()

   for (`element$iv` in `$this$flatMap`) {
      CollectionsKt.addAll(`destination$iv`, transform(`element$iv`) as java.lang.Iterable)
   }

   return `destination$iv` as MutableList<R>
}

public inline fun <R> DoubleArray.flatMap(transform: (Double) -> Iterable<Any>): List<Any> {
   val `destination$iv`: java.util.Collection = ArrayList()

   for (`element$iv` in `$this$flatMap`) {
      CollectionsKt.addAll(`destination$iv`, transform(`element$iv`) as java.lang.Iterable)
   }

   return `destination$iv` as MutableList<R>
}

@SinceKotlin(version = "1.7")
@JvmName(name = "minOrThrow")
public fun Array<out Double>.min(): Double {
   if (`$this$min`.length == 0) {
      throw NoSuchElementException()
   } else {
      var min: Double = `$this$min`[0]
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$min`)).iterator()

      while (var3.hasNext()) {
         min = Math.min(min, `$this$min`[var3.nextInt()])
      }

      return min
   }
}

public inline fun <T> Array<out Any>.count(predicate: (Any) -> Boolean): Int {
   var count: Int = 0

   for (element in `$this$count`) {
      if (predicate(element) as java.lang.Boolean) {
         count++
      }
   }

   return count
}

public inline fun LongArray.indexOfLast(predicate: (Long) -> Boolean): Int {
   var var3: Int = `$this$indexOfLast`.length + -1
   if (0 <= `$this$indexOfLast`.length + -1) {
      do {
         val index: Int = var3--
         if (predicate(`$this$indexOfLast`[index]) as java.lang.Boolean) {
            return index
         }
      } while (0 <= var3)
   }

   return -1
}

public inline fun <R> FloatArray.mapIndexed(transform: (Int, Float) -> Any): List<Any> {
   val `destination$iv`: java.util.Collection = ArrayList(`$this$mapIndexed`.length)
   var `index$iv`: Int = 0

   for (`item$iv` in `$this$mapIndexed`) {
      `destination$iv`.add(transform(`index$iv`++, `item$iv`))
   }

   return `destination$iv` as MutableList<R>
}

@InlineOnly
@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
public inline fun <R : Comparable<Any>> LongArray.minOf(selector: (Long) -> Any): Any {
   if (`$this$minOf`.length == 0) {
      throw NoSuchElementException()
   } else {
      var minValue: java.lang.Comparable = selector(`$this$minOf`[0]) as java.lang.Comparable
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOf`)).iterator()

      while (var3.hasNext()) {
         val v: java.lang.Comparable = selector(`$this$minOf`[var3.nextInt()]) as java.lang.Comparable
         if (minValue.compareTo(v) > 0) {
            minValue = v
         }
      }

      return (R)minValue
   }
}

@InlineOnly
public inline fun ByteArray.elementAtOrElse(index: Int, defaultValue: (Int) -> Byte): Byte {
   return if (index >= 0 && index <= ArraysKt.getLastIndex(`$this$elementAtOrElse`))
      `$this$elementAtOrElse`[index]
      else
      (defaultValue(index) as java.lang.Number).byteValue()
   }

@OverloadResolutionByLambdaReturnType
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun IntArray.maxOf(selector: (Int) -> Float): Float {
   if (`$this$maxOf`.length == 0) {
      throw NoSuchElementException()
   } else {
      var maxValue: Float = (selector(`$this$maxOf`[0]) as java.lang.Number).floatValue()
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOf`)).iterator()

      while (var3.hasNext()) {
         maxValue = Math.max(maxValue, (selector(`$this$maxOf`[var3.nextInt()]) as java.lang.Number).floatValue())
      }

      return maxValue
   }
}

public fun ByteArray.distinct(): List<Byte> {
   return CollectionsKt.toList(ArraysKt.toMutableSet(`$this$distinct`))
}

public fun <T> Array<out Any>.any(): Boolean {
   return `$this$any`.length != 0
}

public fun <T> Array<out Any>.takeLast(n: Int): List<Any> {
   if (n < 0) {
      throw IllegalArgumentException(("Requested element count $n is less than zero.").toString())
   } else if (n == 0) {
      return CollectionsKt.emptyList()
   } else {
      val var5: Int = `$this$takeLast`.length
      if (n >= `$this$takeLast`.length) {
         return (java.util.List<T>)ArraysKt.toList(`$this$takeLast`)
      } else if (n == 1) {
         return (java.util.List<T>)CollectionsKt.listOf(`$this$takeLast`[var5 + -1])
      } else {
         val list: ArrayList = ArrayList(n)

         for (index in var5 - n..var5) {
            list.add(`$this$takeLast`[index])
         }

         return list
      }
   }
}

public inline fun <K, M : MutableMap<in Any, MutableList<Short>>> ShortArray.groupByTo(destination: Any, keySelector: (Short) -> Any): Any {
   for (element in `$this$groupByTo`) {
      val key: Any = keySelector(element)
      val `value$iv`: Any = destination.get(key)
      val var10000: Any
      if (`value$iv` == null) {
         val var13: java.util.List = ArrayList()
         destination.put(key, var13)
         var10000 = var13
      } else {
         var10000 = `value$iv`
      }

      (var10000 as java.util.List).add(element)
   }

   return (M)destination
}

public inline fun DoubleArray.forEachIndexed(action: (Int, Double) -> Unit) {
   var index: Int = 0

   for (item in `$this$forEachIndexed`) {
      action(index++, item)
   }
}

@SinceKotlin(version = "1.7")
@JvmName(name = "minByOrThrow")
public inline fun <R : Comparable<Any>> CharArray.minBy(selector: (Char) -> Any): Char {
   if (`$this$minBy`.length == 0) {
      throw NoSuchElementException()
   } else {
      var minElem: Char = `$this$minBy`[0]
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$minBy`)
      if (lastIndex == 0) {
         return minElem
      } else {
         var minValue: java.lang.Comparable = selector(minElem) as java.lang.Comparable
         val var6: IntIterator = IntRange(1, lastIndex).iterator()

         while (var6.hasNext()) {
            val e: Char = `$this$minBy`[var6.nextInt()]
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

public inline fun <R> IntArray.foldRightIndexed(initial: Any, operation: (Int, Int, Any) -> Any): Any {
   var index: Int = ArraysKt.getLastIndex(`$this$foldRightIndexed`)
   var accumulator: Any = initial

   while (index >= 0) {
      accumulator = operation(index, `$this$foldRightIndexed`[index], accumulator)
      index--
   }

   return (R)accumulator
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun CharArray.onEach(action: (Char) -> Unit): CharArray {
   for (element in `$this$onEach`) {
      action(element)
   }

   return `$this$onEach`
}

public fun ShortArray.firstOrNull(): Short? {
   return if (`$this$firstOrNull`.length == 0) null else `$this$firstOrNull`[0]
}

public inline fun FloatArray.last(predicate: (Float) -> Boolean): Float {
   var var3: Int = `$this$last`.length + -1
   if (0 <= `$this$last`.length + -1) {
      do {
         val element: Float = `$this$last`[var3--]
         if (predicate(element) as java.lang.Boolean) {
            return element
         }
      } while (0 <= var3)
   }

   throw NoSuchElementException("Array contains no element matching the predicate.")
}

public fun DoubleArray.sortDescending() {
   if (`$this$sortDescending`.length > 1) {
      ArraysKt.sort(`$this$sortDescending`)
      ArraysKt.reverse(`$this$sortDescending`)
   }
}

@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun <R> DoubleArray.runningFold(initial: Any, operation: (Any, Double) -> Any): List<Any> {
   if (`$this$runningFold`.length == 0) {
      return (java.util.List<R>)CollectionsKt.listOf(initial)
   } else {
      var accumulator: Any = ArrayList(`$this$runningFold`.length + 1)
      accumulator.add(initial)
      val result: Any = accumulator
      accumulator = initial

      for (element in `$this$runningFold`) {
         accumulator = operation(accumulator, element)
         result.add(accumulator)
      }

      return result as MutableList<R>
   }
}

@InlineOnly
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
public inline fun <R> DoubleArray.minOfWith(comparator: Comparator<in Any>, selector: (Double) -> Any): Any {
   if (`$this$minOfWith`.length == 0) {
      throw NoSuchElementException()
   } else {
      var minValue: Any = selector(`$this$minOfWith`[0])
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfWith`)).iterator()

      while (var4.hasNext()) {
         val v: Any = selector(`$this$minOfWith`[var4.nextInt()])
         if (comparator.compare(minValue, v) > 0) {
            minValue = v
         }
      }

      return (R)minValue
   }
}

public fun BooleanArray.withIndex(): Iterable<IndexedValue<Boolean>> {
   return IndexingIterable<>(   // $VF: Compiled from _Arrays.kt
{
      return ArrayIteratorsKt.iterator($this$withIndex)
   } as () -> MutableIterator<java.lang.Boolean>)
}

public fun FloatArray.reversed(): List<Float> {
   if (`$this$reversed`.length == 0) {
      return CollectionsKt.emptyList()
   } else {
      val list: java.util.List = ArraysKt.toMutableList(`$this$reversed`)
      CollectionsKt.reverse(list)
      return list
   }
}

@SinceKotlin(version = "1.4")
public fun ByteArray.maxWithOrNull(comparator: Comparator<in Byte>): Byte? {
   if (`$this$maxWithOrNull`.length == 0) {
      return null
   } else {
      var max: Byte = `$this$maxWithOrNull`[0]
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxWithOrNull`)).iterator()

      while (var3.hasNext()) {
         val e: Byte = `$this$maxWithOrNull`[var3.nextInt()]
         if (comparator.compare(max, e) < 0) {
            max = e
         }
      }

      return max
   }
}

@SinceKotlin(version = "1.4")
@InlineOnly
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public inline fun CharArray.randomOrNull(): Char? {
   return ArraysKt.randomOrNull((char[])`$this$randomOrNull`, Random.Default)
}

@SinceKotlin(version = "1.4")
public inline fun <T, R> Array<out Any>.runningFoldIndexed(initial: Any, operation: (Int, Any, Any) -> Any): List<Any> {
   if (`$this$runningFoldIndexed`.length == 0) {
      return (java.util.List<R>)CollectionsKt.listOf(initial)
   } else {
      var accumulator: Any = ArrayList(`$this$runningFoldIndexed`.length + 1)
      accumulator.add(initial)
      val result: Any = accumulator
      accumulator = initial
      var var9: Int = 0

      for (var10 in `$this$runningFoldIndexed`.length..var9) {
         accumulator = operation(var9, accumulator, `$this$runningFoldIndexed`[var9])
         result.add(accumulator)
      }

      return result as MutableList<R>
   }
}

@InlineOnly
public inline fun FloatArray.find(predicate: (Float) -> Boolean): Float? {
   val `$this$firstOrNull$iv`: FloatArray = `$this$find`
   var var4: Int = 0
   val var5: Int = `$this$find`.length

   var var10000: java.lang.Float
   while (true) {
      if (var4 >= var5) {
         var10000 = null
         break
      }

      val `element$iv`: Float = `$this$firstOrNull$iv`[var4]
      if (predicate(`$this$firstOrNull$iv`[var4]) as java.lang.Boolean) {
         var10000 = `element$iv`
         break
      }

      var4++
   }

   return var10000
}

public fun Array<out Long>.toLongArray(): LongArray {
   var var1: Int = 0
   val var2: Int = `$this$toLongArray`.length
   val var3: LongArray = LongArray(`$this$toLongArray`.length)

   while (var1 < var2) {
      var3[var1] = `$this$toLongArray`[var1]
      var1++
   }

   return var3
}

public inline fun <K, V, M : MutableMap<in Any, in Any>> DoubleArray.associateTo(destination: Any, transform: (Double) -> Pair<Any, Any>): Any {
   for (element in `$this$associateTo`) {
      val var9: Pair = transform(element) as Pair
      destination.put(var9.first, var9.second)
   }

   return (M)destination
}

@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
@JvmName(name = "sumOfLong")
@InlineOnly
public inline fun ShortArray.sumOf(selector: (Short) -> Long): Long {
   var sum: Long = 0L

   for (element in `$this$sumOf`) {
      sum += (selector(element) as java.lang.Number).longValue()
   }

   return sum
}

public fun ShortArray.sliceArray(indices: Collection<Int>): ShortArray {
   val result: ShortArray = ShortArray(indices.size())
   var targetIndex: Int = 0
   val var4: java.util.Iterator = indices.iterator()

   while (var4.hasNext()) {
      result[targetIndex++] = `$this$sliceArray`[(var4.next() as java.lang.Number).intValue()]
   }

   return result
}

@SinceKotlin(version = "1.4")
public fun ByteArray.maxOrNull(): Byte? {
   if (`$this$maxOrNull`.length == 0) {
      return null
   } else {
      var max: Byte = `$this$maxOrNull`[0]
      val var2: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOrNull`)).iterator()

      while (var2.hasNext()) {
         val e: Byte = `$this$maxOrNull`[var2.nextInt()]
         if (max < e) {
            max = e
         }
      }

      return max
   }
}

public fun BooleanArray.toSet(): Set<Boolean> {
   var var10000: java.util.Set
   when (`$this$toSet`.length) {
      0 -> var10000 = SetsKt.emptySet()
      1 -> var10000 = SetsKt.setOf(`$this$toSet`[0])
      else -> var10000 = ArraysKt.toCollection(`$this$toSet`, LinkedHashSet(MapsKt.mapCapacity(`$this$toSet`.length)))
   }

   return var10000
}

public inline fun <R> ShortArray.mapIndexed(transform: (Int, Short) -> Any): List<Any> {
   val `destination$iv`: java.util.Collection = ArrayList(`$this$mapIndexed`.length)
   var `index$iv`: Int = 0

   for (`item$iv` in `$this$mapIndexed`) {
      `destination$iv`.add(transform(`index$iv`++, `item$iv`))
   }

   return `destination$iv` as MutableList<R>
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun IntArray.randomOrNull(): Int? {
   return ArraysKt.randomOrNull((int[])`$this$randomOrNull`, Random.Default)
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun <R> LongArray.runningFoldIndexed(initial: Any, operation: (Int, Any, Long) -> Any): List<Any> {
   if (`$this$runningFoldIndexed`.length == 0) {
      return (java.util.List<R>)CollectionsKt.listOf(initial)
   } else {
      var accumulator: Any = ArrayList(`$this$runningFoldIndexed`.length + 1)
      accumulator.add(initial)
      val result: Any = accumulator
      accumulator = initial
      var var8: Int = 0

      for (var9 in `$this$runningFoldIndexed`.length..var8) {
         accumulator = operation(var8, accumulator, `$this$runningFoldIndexed`[var8])
         result.add(accumulator)
      }

      return result as MutableList<R>
   }
}

@InlineOnly
public inline operator fun BooleanArray.component4(): Boolean {
   return `$this$component4`[3]
}

public fun ShortArray.lastIndexOf(element: Short): Int {
   var var2: Int = `$this$lastIndexOf`.length + -1
   if (0 <= `$this$lastIndexOf`.length + -1) {
      do {
         val index: Int = var2--
         if (element == `$this$lastIndexOf`[index]) {
            return index
         }
      } while (0 <= var2)
   }

   return -1
}

public inline fun <T> Array<out Any>.indexOfLast(predicate: (Any) -> Boolean): Int {
   var var3: Int = `$this$indexOfLast`.length + -1
   if (0 <= `$this$indexOfLast`.length + -1) {
      do {
         val index: Int = var3--
         if (predicate(`$this$indexOfLast`[index]) as java.lang.Boolean) {
            return index
         }
      } while (0 <= var3)
   }

   return -1
}

@SinceKotlin(version = "1.4")
public inline fun <R : Comparable<Any>> IntArray.maxByOrNull(selector: (Int) -> Any): Int? {
   if (`$this$maxByOrNull`.length == 0) {
      return null
   } else {
      var maxElem: Int = `$this$maxByOrNull`[0]
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$maxByOrNull`)
      if (lastIndex == 0) {
         return maxElem
      } else {
         var maxValue: java.lang.Comparable = selector(maxElem) as java.lang.Comparable
         val var6: IntIterator = IntRange(1, lastIndex).iterator()

         while (var6.hasNext()) {
            val e: Int = `$this$maxByOrNull`[var6.nextInt()]
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

public fun ByteArray.single(): Byte {
   when (`$this$single`.length) {
      0 -> throw NoSuchElementException("Array is empty.")
      1 -> return `$this$single`[0]
      else -> throw IllegalArgumentException("Array has more than one element.")
   }
}

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun LongArray.maxOfOrNull(selector: (Long) -> Float): Float? {
   if (`$this$maxOfOrNull`.length == 0) {
      return null
   } else {
      var maxValue: Float = (selector(`$this$maxOfOrNull`[0]) as java.lang.Number).floatValue()
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfOrNull`)).iterator()

      while (var3.hasNext()) {
         maxValue = Math.max(maxValue, (selector(`$this$maxOfOrNull`[var3.nextInt()]) as java.lang.Number).floatValue())
      }

      return maxValue
   }
}

@SinceKotlin(version = "1.5")
@InlineOnly
public inline fun <T, R : Any> Array<out Any>.firstNotNullOfOrNull(transform: (Any) -> Any?): Any? {
   for (element in `$this$firstNotNullOfOrNull`) {
      val result: Any = transform(element)
      if (result != null) {
         return (R)result
      }
   }

   return null
}

public inline fun FloatArray.singleOrNull(predicate: (Float) -> Boolean): Float? {
   var single: java.lang.Float = null
   var found: Boolean = false

   for (element in `$this$singleOrNull`) {
      if (predicate(element) as java.lang.Boolean) {
         if (found) {
            return null
         }

         single = element
         found = true
      }
   }

   return if (!found) null else single
}

public fun FloatArray.sliceArray(indices: IntRange): FloatArray {
   return if (indices.isEmpty()) FloatArray(0) else ArraysKt.copyOfRange(`$this$sliceArray`, indices.start, indices.endInclusive + 1)
}

public fun ShortArray.toMutableList(): MutableList<Short> {
   val list: ArrayList = ArrayList(`$this$toMutableList`.length)

   for (item in `$this$toMutableList`) {
      list.add(item)
   }

   return list
}

@SinceKotlin(version = "1.4")
@InlineOnly
@OverloadResolutionByLambdaReturnType
public inline fun <R : Comparable<Any>> CharArray.minOfOrNull(selector: (Char) -> Any): Any? {
   if (`$this$minOfOrNull`.length == 0) {
      return null
   } else {
      var minValue: java.lang.Comparable = selector(`$this$minOfOrNull`[0]) as java.lang.Comparable
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfOrNull`)).iterator()

      while (var3.hasNext()) {
         val v: java.lang.Comparable = selector(`$this$minOfOrNull`[var3.nextInt()]) as java.lang.Comparable
         if (minValue.compareTo(v) > 0) {
            minValue = v
         }
      }

      return (R)minValue
   }
}

@InlineOnly
@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
public inline fun <R> IntArray.minOfWith(comparator: Comparator<in Any>, selector: (Int) -> Any): Any {
   if (`$this$minOfWith`.length == 0) {
      throw NoSuchElementException()
   } else {
      var minValue: Any = selector(`$this$minOfWith`[0])
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfWith`)).iterator()

      while (var4.hasNext()) {
         val v: Any = selector(`$this$minOfWith`[var4.nextInt()])
         if (comparator.compare(minValue, v) > 0) {
            minValue = v
         }
      }

      return (R)minValue
   }
}

@SinceKotlin(version = "1.4")
public inline fun <R : Comparable<Any>> DoubleArray.maxByOrNull(selector: (Double) -> Any): Double? {
   if (`$this$maxByOrNull`.length == 0) {
      return null
   } else {
      var maxElem: Double = `$this$maxByOrNull`[0]
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$maxByOrNull`)
      if (lastIndex == 0) {
         return maxElem
      } else {
         var maxValue: java.lang.Comparable = selector(maxElem) as java.lang.Comparable
         val var7: IntIterator = IntRange(1, lastIndex).iterator()

         while (var7.hasNext()) {
            val e: Double = `$this$maxByOrNull`[var7.nextInt()]
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
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public inline fun LongArray.reduceRightOrNull(operation: (Long, Long) -> Long): Long? {
   var index: Int = ArraysKt.getLastIndex(`$this$reduceRightOrNull`)
   if (index < 0) {
      return null
   } else {
      var accumulator: Long = `$this$reduceRightOrNull`[index--]

      while (index >= 0) {
         accumulator = (operation(`$this$reduceRightOrNull`[index--], accumulator) as java.lang.Number).longValue()
      }

      return accumulator
   }
}

public inline fun DoubleArray.all(predicate: (Double) -> Boolean): Boolean {
   for (element in `$this$all`) {
      if (!predicate(element) as java.lang.Boolean) {
         return false
      }
   }

   return true
}

@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun <R> CharArray.runningFold(initial: Any, operation: (Any, Char) -> Any): List<Any> {
   if (`$this$runningFold`.length == 0) {
      return (java.util.List<R>)CollectionsKt.listOf(initial)
   } else {
      var accumulator: Any = ArrayList(`$this$runningFold`.length + 1)
      accumulator.add(initial)
      val result: Any = accumulator
      accumulator = initial

      for (element in `$this$runningFold`) {
         accumulator = operation(accumulator, element)
         result.add(accumulator)
      }

      return result as MutableList<R>
   }
}

public inline fun <K> LongArray.distinctBy(selector: (Long) -> Any): List<Long> {
   val set: HashSet = HashSet()
   val list: ArrayList = ArrayList()

   for (e in `$this$distinctBy`) {
      if (set.add(selector(e))) {
         list.add(e)
      }
   }

   return list
}

public infix fun LongArray.zip(other: LongArray): List<Pair<Long, Long>> {
   val `$this$zip$iv`: LongArray = `$this$zip`
   val `size$iv`: Int = Math.min(`$this$zip`.length, other.length)
   val `list$iv`: ArrayList = ArrayList(`size$iv`)

   repeat(`size$iv`) { `i$iv` ->
      `list$iv`.add(`$this$zip$iv`[`i$iv`] to other[`i$iv`])
   }

   return `list$iv`
}

public fun FloatArray.joinToString(
   separator: CharSequence = ", " as java.lang.CharSequence,
   prefix: CharSequence = "" as java.lang.CharSequence,
   postfix: CharSequence = "" as java.lang.CharSequence,
   limit: Int = -1,
   truncated: CharSequence = "..." as java.lang.CharSequence,
   transform: ((Float) -> CharSequence)? = null
): String {
   val var10000: java.lang.String = ArraysKt.joinTo(`$this$joinToString`, StringBuilder(), separator, prefix, postfix, limit, truncated, transform).toString()
   return var10000
}

public inline fun <C : MutableCollection<in Double>> DoubleArray.filterNotTo(destination: Any, predicate: (Double) -> Boolean): Any {
   for (element in `$this$filterNotTo`) {
      if (!predicate(element) as java.lang.Boolean) {
         destination.add(element)
      }
   }

   return (C)destination
}

public fun ShortArray.toList(): List<Short> {
   var var10000: java.util.List
   when (`$this$toList`.length) {
      0 -> var10000 = CollectionsKt.emptyList()
      1 -> var10000 = CollectionsKt.listOf(`$this$toList`[0])
      else -> var10000 = ArraysKt.toMutableList(`$this$toList`)
   }

   return var10000
}

public inline fun <K, V> ByteArray.associate(transform: (Byte) -> Pair<Any, Any>): Map<Any, Any> {
   val `destination$iv`: java.util.Map = LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(`$this$associate`.length), 16))

   for (`element$iv` in `$this$associate`) {
      val var11: Pair = transform(`element$iv`) as Pair
      `destination$iv`.put(var11.first, var11.second)
   }

   return `destination$iv`
}

@InlineOnly
public inline fun ByteArray.isNotEmpty(): Boolean {
   return `$this$isNotEmpty`.length != 0
}

public inline fun ByteArray.filterIndexed(predicate: (Int, Byte) -> Boolean): List<Byte> {
   val `destination$iv`: java.util.Collection = ArrayList()
   val `index$iv$iv`: Int = 0

   for (`item$iv$iv` in `$this$filterIndexed`) {
      if (predicate(`index$iv$iv`++, `item$iv$iv`) as java.lang.Boolean) {
         `destination$iv`.add(`item$iv$iv`)
      }
   }

   return `destination$iv` as MutableList<java.lang.Byte>
}

public inline fun <R, V> LongArray.zip(other: Iterable<Any>, transform: (Long, Any) -> Any): List<Any> {
   val arraySize: Int = `$this$zip`.length
   val list: ArrayList = ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(other, 10), `$this$zip`.length))
   var i: Int = 0

   for (element in other) {
      if (i >= arraySize) {
         break
      }

      list.add(transform(`$this$zip`[i++], element))
   }

   return list
}

public fun CharArray.sliceArray(indices: Collection<Int>): CharArray {
   val result: CharArray = CharArray(indices.size())
   var targetIndex: Int = 0
   val var4: java.util.Iterator = indices.iterator()

   while (var4.hasNext()) {
      result[targetIndex++] = `$this$sliceArray`[(var4.next() as java.lang.Number).intValue()]
   }

   return result
}

@OverloadResolutionByLambdaReturnType
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun CharArray.maxOfOrNull(selector: (Char) -> Float): Float? {
   if (`$this$maxOfOrNull`.length == 0) {
      return null
   } else {
      var maxValue: Float = (selector(`$this$maxOfOrNull`[0]) as java.lang.Number).floatValue()
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfOrNull`)).iterator()

      while (var3.hasNext()) {
         maxValue = Math.max(maxValue, (selector(`$this$maxOfOrNull`[var3.nextInt()]) as java.lang.Number).floatValue())
      }

      return maxValue
   }
}

public fun <T : Any> Array<out Any?>.filterNotNull(): List<Any> {
   return ArraysKt.filterNotNullTo(`$this$filterNotNull`, ArrayList()) as MutableList<T>
}

public inline fun <K, V> CharArray.groupBy(keySelector: (Char) -> Any, valueTransform: (Char) -> Any): Map<Any, List<Any>> {
   val `destination$iv`: java.util.Map = LinkedHashMap()

   for (`element$iv` in `$this$groupBy`) {
      val `key$iv`: Any = keySelector(`element$iv`)
      val `value$iv$iv`: Any = `destination$iv`.get(`key$iv`)
      val var10000: Any
      if (`value$iv$iv` == null) {
         val var16: java.util.List = ArrayList()
         `destination$iv`.put(`key$iv`, var16)
         var10000 = var16
      } else {
         var10000 = `value$iv$iv`
      }

      (var10000 as java.util.List).add(valueTransform(`element$iv`))
   }

   return `destination$iv`
}

public inline fun <K, M : MutableMap<in Any, MutableList<Float>>> FloatArray.groupByTo(destination: Any, keySelector: (Float) -> Any): Any {
   for (element in `$this$groupByTo`) {
      val key: Any = keySelector(element)
      val `value$iv`: Any = destination.get(key)
      val var10000: Any
      if (`value$iv` == null) {
         val var13: java.util.List = ArrayList()
         destination.put(key, var13)
         var10000 = var13
      } else {
         var10000 = `value$iv`
      }

      (var10000 as java.util.List).add(element)
   }

   return (M)destination
}

public fun ByteArray.sum(): Int {
   var sum: Byte = 0

   for (element in `$this$sum`) {
      sum += element
   }

   return sum
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun <R> ShortArray.runningFoldIndexed(initial: Any, operation: (Int, Any, Short) -> Any): List<Any> {
   if (`$this$runningFoldIndexed`.length == 0) {
      return (java.util.List<R>)CollectionsKt.listOf(initial)
   } else {
      var accumulator: Any = ArrayList(`$this$runningFoldIndexed`.length + 1)
      accumulator.add(initial)
      val result: Any = accumulator
      accumulator = initial
      var var8: Int = 0

      for (var9 in `$this$runningFoldIndexed`.length..var8) {
         accumulator = operation(var8, accumulator, `$this$runningFoldIndexed`[var8])
         result.add(accumulator)
      }

      return result as MutableList<R>
   }
}

public fun LongArray.last(): Long {
   if (`$this$last`.length == 0) {
      throw NoSuchElementException("Array is empty.")
   } else {
      return `$this$last`[ArraysKt.getLastIndex(`$this$last`)]
   }
}

@SinceKotlin(version = "1.4")
public fun CharArray.shuffle(random: Random) {
   for (i in ArraysKt.getLastIndex(`$this$shuffle`) downTo 1) {
      val j: Int = random.nextInt(i + 1)
      val copy: Char = `$this$shuffle`[i]
      `$this$shuffle`[i] = `$this$shuffle`[j]
      `$this$shuffle`[j] = copy
   }
}

@SinceKotlin(version = "1.4")
public fun CharArray.sortDescending(fromIndex: Int, toIndex: Int) {
   ArraysKt.sort(`$this$sortDescending`, fromIndex, toIndex)
   ArraysKt.reverse((char[])`$this$sortDescending`, fromIndex, toIndex)
}

@OverloadResolutionByLambdaReturnType
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun IntArray.maxOfOrNull(selector: (Int) -> Float): Float? {
   if (`$this$maxOfOrNull`.length == 0) {
      return null
   } else {
      var maxValue: Float = (selector(`$this$maxOfOrNull`[0]) as java.lang.Number).floatValue()
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfOrNull`)).iterator()

      while (var3.hasNext()) {
         maxValue = Math.max(maxValue, (selector(`$this$maxOfOrNull`[var3.nextInt()]) as java.lang.Number).floatValue())
      }

      return maxValue
   }
}

public fun FloatArray.toHashSet(): HashSet<Float> {
   return ArraysKt.toCollection(`$this$toHashSet`, HashSet<>(MapsKt.mapCapacity(`$this$toHashSet`.length)))
}

@InlineOnly
public inline operator fun ByteArray.component5(): Byte {
   return `$this$component5`[4]
}

public inline fun <R> FloatArray.flatMap(transform: (Float) -> Iterable<Any>): List<Any> {
   val `destination$iv`: java.util.Collection = ArrayList()

   for (`element$iv` in `$this$flatMap`) {
      CollectionsKt.addAll(`destination$iv`, transform(`element$iv`) as java.lang.Iterable)
   }

   return `destination$iv` as MutableList<R>
}

@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public inline fun <S, T : Any> Array<out Any>.runningReduce(operation: (Any, Any) -> Any): List<Any> {
   if (`$this$runningReduce`.length == 0) {
      return CollectionsKt.emptyList()
   } else {
      var var8: Any = `$this$runningReduce`[0]
      val index: ArrayList = ArrayList(`$this$runningReduce`.length)
      index.add(var8)
      val result: ArrayList = index
      var var9: Int = 1

      for (var10 in `$this$runningReduce`.length..var9) {
         var8 = operation(var8, `$this$runningReduce`[var9])
         result.add(var8)
      }

      return result
   }
}

public inline fun <R> CharArray.fold(initial: Any, operation: (Any, Char) -> Any): Any {
   var accumulator: Any = initial

   for (element in `$this$fold`) {
      accumulator = operation(accumulator, element)
   }

   return (R)accumulator
}

@InlineOnly
public inline operator fun IntArray.component4(): Int {
   return `$this$component4`[3]
}

public inline fun <R> BooleanArray.foldRight(initial: Any, operation: (Boolean, Any) -> Any): Any {
   var index: Int = ArraysKt.getLastIndex(`$this$foldRight`)
   var accumulator: Any = initial

   while (index >= 0) {
      accumulator = operation(`$this$foldRight`[index--], accumulator)
   }

   return (R)accumulator
}

@SinceKotlin(version = "1.4")
public fun <T> Array<out Any>.maxWithOrNull(comparator: Comparator<in Any>): Any? {
   if (`$this$maxWithOrNull`.length == 0) {
      return null
   } else {
      var max: Any = `$this$maxWithOrNull`[0]
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxWithOrNull`)).iterator()

      while (var3.hasNext()) {
         val e: Any = `$this$maxWithOrNull`[var3.nextInt()]
         if (comparator.compare(max, e) < 0) {
            max = e
         }
      }

      return (T)max
   }
}

@SinceKotlin(version = "1.4")
public fun BooleanArray.reverse(fromIndex: Int, toIndex: Int) {
   AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(fromIndex, toIndex, `$this$reverse`.length)
   val midPoint: Int = (fromIndex + toIndex) / 2
   if (fromIndex != (fromIndex + toIndex) / 2) {
      var reverseIndex: Int = toIndex + -1

      for (index in fromIndex..midPoint) {
         val tmp: Boolean = `$this$reverse`[index]
         `$this$reverse`[index] = `$this$reverse`[reverseIndex]
         `$this$reverse`[reverseIndex] = tmp
         reverseIndex--
      }
   }
}

public inline fun BooleanArray.reduce(operation: (Boolean, Boolean) -> Boolean): Boolean {
   if (`$this$reduce`.length == 0) {
      throw UnsupportedOperationException("Empty array can't be reduced.")
   } else {
      var accumulator: Boolean = `$this$reduce`[0]
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$reduce`)).iterator()

      while (var4.hasNext()) {
         accumulator = operation(accumulator, `$this$reduce`[var4.nextInt()]) as java.lang.Boolean
      }

      return accumulator
   }
}

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun <R> ByteArray.minOfWithOrNull(comparator: Comparator<in Any>, selector: (Byte) -> Any): Any? {
   if (`$this$minOfWithOrNull`.length == 0) {
      return null
   } else {
      var minValue: Any = selector(`$this$minOfWithOrNull`[0])
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfWithOrNull`)).iterator()

      while (var4.hasNext()) {
         val v: Any = selector(`$this$minOfWithOrNull`[var4.nextInt()])
         if (comparator.compare(minValue, v) > 0) {
            minValue = v
         }
      }

      return (R)minValue
   }
}

public fun DoubleArray.takeLast(n: Int): List<Double> {
   if (n < 0) {
      throw IllegalArgumentException(("Requested element count $n is less than zero.").toString())
   } else if (n == 0) {
      return CollectionsKt.emptyList()
   } else {
      val var5: Int = `$this$takeLast`.length
      if (n >= `$this$takeLast`.length) {
         return ArraysKt.toList(`$this$takeLast`)
      } else if (n == 1) {
         return CollectionsKt.listOf(`$this$takeLast`[var5 + -1])
      } else {
         val list: ArrayList = ArrayList(n)

         for (index in var5 - n..var5) {
            list.add(`$this$takeLast`[index])
         }

         return list
      }
   }
}

public inline fun <T, R : Any> Array<out Any>.mapIndexedNotNull(transform: (Int, Any) -> Any?): List<Any> {
   val `destination$iv`: java.util.Collection = ArrayList()
   var `index$iv$iv`: Int = 0

   for (`item$iv$iv` in `$this$mapIndexedNotNull`) {
      val var18: Any = transform(`index$iv$iv`++, `item$iv$iv`)
      if (var18 != null) {
         `destination$iv`.add(var18)
      }
   }

   return `destination$iv` as MutableList<R>
}

public fun BooleanArray.reversed(): List<Boolean> {
   if (`$this$reversed`.length == 0) {
      return CollectionsKt.emptyList()
   } else {
      val list: java.util.List = ArraysKt.toMutableList(`$this$reversed`)
      CollectionsKt.reverse(list)
      return list
   }
}

public fun <T : Any> Array<Any?>.requireNoNulls(): Array<Any> {
   for (element in `$this$requireNoNulls`) {
      if (element == null) {
         throw IllegalArgumentException("null element found in $`$this$requireNoNulls`.")
      }
   }

   return (T[])`$this$requireNoNulls`
}

public fun DoubleArray.toMutableSet(): MutableSet<Double> {
   return ArraysKt.toCollection(`$this$toMutableSet`, LinkedHashSet<>(MapsKt.mapCapacity(`$this$toMutableSet`.length)))
}

@SinceKotlin(version = "1.7")
@JvmName(name = "minOrThrow")
public fun <T : Comparable<Any>> Array<out Any>.min(): Any {
   if (`$this$min`.length == 0) {
      throw NoSuchElementException()
   } else {
      var min: java.lang.Comparable = `$this$min`[0]
      val var2: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$min`)).iterator()

      while (var2.hasNext()) {
         val e: java.lang.Comparable = `$this$min`[var2.nextInt()]
         if (min.compareTo(e) > 0) {
            min = e
         }
      }

      return (T)min
   }
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun FloatArray.onEachIndexed(action: (Int, Float) -> Unit): FloatArray {
   var `index$iv`: Int = 0

   for (`item$iv` in `$this$onEachIndexed`) {
      action(`index$iv`++, `item$iv`)
   }

   return `$this$onEachIndexed`
}

@InlineOnly
public inline fun ByteArray.count(): Int {
   return `$this$count`.length
}

public inline fun IntArray.filterIndexed(predicate: (Int, Int) -> Boolean): List<Int> {
   val `destination$iv`: java.util.Collection = ArrayList()
   val `index$iv$iv`: Int = 0

   for (`item$iv$iv` in `$this$filterIndexed`) {
      if (predicate(`index$iv$iv`++, `item$iv$iv`) as java.lang.Boolean) {
         `destination$iv`.add(`item$iv$iv`)
      }
   }

   return `destination$iv` as MutableList<Int>
}

public fun LongArray.reversed(): List<Long> {
   if (`$this$reversed`.length == 0) {
      return CollectionsKt.emptyList()
   } else {
      val list: java.util.List = ArraysKt.toMutableList(`$this$reversed`)
      CollectionsKt.reverse(list)
      return list
   }
}

public infix fun ShortArray.union(other: Iterable<Short>): Set<Short> {
   val set: java.util.Set = ArraysKt.toMutableSet(`$this$union`)
   CollectionsKt.addAll(set, other)
   return set
}

@InlineOnly
public inline fun ShortArray.isNotEmpty(): Boolean {
   return `$this$isNotEmpty`.length != 0
}

@OverloadResolutionByLambdaReturnType
@JvmName(name = "sumOfDouble")
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun DoubleArray.sumOf(selector: (Double) -> Double): Double {
   var sum: Double = 0.0

   for (element in `$this$sumOf`) {
      sum += (selector(element) as java.lang.Number).doubleValue()
   }

   return sum
}

public inline fun ShortArray.filterIndexed(predicate: (Int, Short) -> Boolean): List<Short> {
   val `destination$iv`: java.util.Collection = ArrayList()
   val `index$iv$iv`: Int = 0

   for (`item$iv$iv` in `$this$filterIndexed`) {
      if (predicate(`index$iv$iv`++, `item$iv$iv`) as java.lang.Boolean) {
         `destination$iv`.add(`item$iv$iv`)
      }
   }

   return `destination$iv` as MutableList<java.lang.Short>
}

public fun ShortArray.dropLast(n: Int): List<Short> {
   if (n < 0) {
      throw IllegalArgumentException(("Requested element count $n is less than zero.").toString())
   } else {
      return ArraysKt.take((short[])`$this$dropLast`, RangesKt.coerceAtLeast(`$this$dropLast`.length - n, 0))
   }
}

public inline fun ByteArray.dropLastWhile(predicate: (Byte) -> Boolean): List<Byte> {
   for (index in ArraysKt.getLastIndex(`$this$dropLastWhile`) downTo 0) {
      if (!predicate(`$this$dropLastWhile`[index]) as java.lang.Boolean) {
         return ArraysKt.take((byte[])`$this$dropLastWhile`, index + 1)
      }
   }

   return CollectionsKt.emptyList()
}

public inline fun <R, C : MutableCollection<in Any>> DoubleArray.mapIndexedTo(destination: Any, transform: (Int, Double) -> Any): Any {
   var index: Int = 0

   for (item in `$this$mapIndexedTo`) {
      destination.add(transform(index++, item))
   }

   return (C)destination
}

public fun DoubleArray.first(): Double {
   if (`$this$first`.length == 0) {
      throw NoSuchElementException("Array is empty.")
   } else {
      return `$this$first`[0]
   }
}

public inline fun <K, M : MutableMap<in Any, in Float>> FloatArray.associateByTo(destination: Any, keySelector: (Float) -> Any): Any {
   for (element in `$this$associateByTo`) {
      destination.put(keySelector(element), element)
   }

   return (M)destination
}

public fun <T> Array<Any>.reverse() {
   val midPoint: Int = `$this$reverse`.length / 2 - 1
   if (`$this$reverse`.length / 2 - 1 >= 0) {
      var reverseIndex: Int = ArraysKt.getLastIndex(`$this$reverse`)

      // $VF: Unable to resugar Kotlin loop from Java for loop
      val var3: IntIterator = IntRange(0, midPoint).iterator()
      while (true) {
         if (var3.hasNext()) break
         val index: Int = var3.nextInt()
         val tmp: Any = `$this$reverse`[index]
         `$this$reverse`[index] = `$this$reverse`[reverseIndex]
         `$this$reverse`[reverseIndex] = tmp

         reverseIndex--
      }
   }
}

public fun ByteArray.sorted(): List<Byte> {
   val var1: Array<java.lang.Byte> = ArraysKt.toTypedArray(`$this$sorted`)
   ArraysKt.sort(var1)
   return ArraysKt.asList(var1)
}

public inline fun CharArray.any(predicate: (Char) -> Boolean): Boolean {
   for (element in `$this$any`) {
      if (predicate(element) as java.lang.Boolean) {
         return true
      }
   }

   return false
}

public inline fun BooleanArray.singleOrNull(predicate: (Boolean) -> Boolean): Boolean? {
   var single: java.lang.Boolean = null
   var found: Boolean = false

   for (element in `$this$singleOrNull`) {
      if (predicate(element) as java.lang.Boolean) {
         if (found) {
            return null
         }

         single = element
         found = true
      }
   }

   return if (!found) null else single
}

@OverloadResolutionByLambdaReturnType
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun LongArray.maxOf(selector: (Long) -> Float): Float {
   if (`$this$maxOf`.length == 0) {
      throw NoSuchElementException()
   } else {
      var maxValue: Float = (selector(`$this$maxOf`[0]) as java.lang.Number).floatValue()
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOf`)).iterator()

      while (var3.hasNext()) {
         maxValue = Math.max(maxValue, (selector(`$this$maxOf`[var3.nextInt()]) as java.lang.Number).floatValue())
      }

      return maxValue
   }
}

public fun <T> Array<out Any>.indexOf(element: Any): Int {
   if (element == null) {
      var index: Int = 0

      for (var3 in `$this$indexOf`.length..index) {
         if (`$this$indexOf`[index] == null) {
            return index
         }
      }
   } else {
      var var4: Int = 0

      for (var5 in `$this$indexOf`.length..var4) {
         if (element == `$this$indexOf`[var4]) {
            return var4
         }
      }
   }

   return -1
}

@InlineOnly
public inline fun CharArray.isNotEmpty(): Boolean {
   return `$this$isNotEmpty`.length != 0
}

@SinceKotlin(version = "1.4")
@InlineOnly
@OverloadResolutionByLambdaReturnType
public inline fun <R> IntArray.maxOfWithOrNull(comparator: Comparator<in Any>, selector: (Int) -> Any): Any? {
   if (`$this$maxOfWithOrNull`.length == 0) {
      return null
   } else {
      var maxValue: Any = selector(`$this$maxOfWithOrNull`[0])
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfWithOrNull`)).iterator()

      while (var4.hasNext()) {
         val v: Any = selector(`$this$maxOfWithOrNull`[var4.nextInt()])
         if (comparator.compare(maxValue, v) < 0) {
            maxValue = v
         }
      }

      return (R)maxValue
   }
}

@SinceKotlin(version = "1.4")
public fun BooleanArray.minWithOrNull(comparator: Comparator<in Boolean>): Boolean? {
   if (`$this$minWithOrNull`.length == 0) {
      return null
   } else {
      var min: Boolean = `$this$minWithOrNull`[0]
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minWithOrNull`)).iterator()

      while (var3.hasNext()) {
         val e: Boolean = `$this$minWithOrNull`[var3.nextInt()]
         if (comparator.compare(min, e) > 0) {
            min = e
         }
      }

      return min
   }
}

public inline fun <T, R> Array<out Any>.foldRight(initial: Any, operation: (Any, Any) -> Any): Any {
   var index: Int = ArraysKt.getLastIndex(`$this$foldRight`)
   var accumulator: Any = initial

   while (index >= 0) {
      accumulator = operation(`$this$foldRight`[index--], accumulator)
   }

   return (R)accumulator
}

@InlineOnly
@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
public inline fun <R : Comparable<Any>> ShortArray.minOf(selector: (Short) -> Any): Any {
   if (`$this$minOf`.length == 0) {
      throw NoSuchElementException()
   } else {
      var minValue: java.lang.Comparable = selector(`$this$minOf`[0]) as java.lang.Comparable
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOf`)).iterator()

      while (var3.hasNext()) {
         val v: java.lang.Comparable = selector(`$this$minOf`[var3.nextInt()]) as java.lang.Comparable
         if (minValue.compareTo(v) > 0) {
            minValue = v
         }
      }

      return (R)minValue
   }
}

public inline fun <C : MutableCollection<in Byte>> ByteArray.filterTo(destination: Any, predicate: (Byte) -> Boolean): Any {
   for (element in `$this$filterTo`) {
      if (predicate(element) as java.lang.Boolean) {
         destination.add(element)
      }
   }

   return (C)destination
}

public fun ByteArray.sortedWith(comparator: Comparator<in Byte>): List<Byte> {
   val var2: Array<java.lang.Byte> = ArraysKt.toTypedArray(`$this$sortedWith`)
   ArraysKt.sortWith(var2, comparator)
   return ArraysKt.asList(var2)
}

public inline fun <K, V, M : MutableMap<in Any, in Any>> FloatArray.associateByTo(destination: Any, keySelector: (Float) -> Any, valueTransform: (Float) -> Any): Any {
   for (element in `$this$associateByTo`) {
      destination.put(keySelector(element), valueTransform(element))
   }

   return (M)destination
}

public inline fun <R> BooleanArray.foldIndexed(initial: Any, operation: (Int, Any, Boolean) -> Any): Any {
   var index: Int = 0
   var accumulator: Any = initial

   for (element in `$this$foldIndexed`) {
      accumulator = operation(index++, accumulator, element)
   }

   return (R)accumulator
}

public fun CharArray.firstOrNull(): Char? {
   return if (`$this$firstOrNull`.length == 0) null else `$this$firstOrNull`[0]
}

public inline fun LongArray.filterIndexed(predicate: (Int, Long) -> Boolean): List<Long> {
   val `destination$iv`: java.util.Collection = ArrayList()
   val `index$iv$iv`: Int = 0

   for (`item$iv$iv` in `$this$filterIndexed`) {
      if (predicate(`index$iv$iv`++, `item$iv$iv`) as java.lang.Boolean) {
         `destination$iv`.add(`item$iv$iv`)
      }
   }

   return `destination$iv` as MutableList<java.lang.Long>
}

public inline fun <K, V, M : MutableMap<in Any, MutableList<Any>>> ShortArray.groupByTo(
   destination: Any,
   keySelector: (Short) -> Any,
   valueTransform: (Short) -> Any
): Any {
   for (element in `$this$groupByTo`) {
      val key: Any = keySelector(element)
      val `value$iv`: Any = destination.get(key)
      val var10000: Any
      if (`value$iv` == null) {
         val var14: java.util.List = ArrayList()
         destination.put(key, var14)
         var10000 = var14
      } else {
         var10000 = `value$iv`
      }

      (var10000 as java.util.List).add(valueTransform(element))
   }

   return (M)destination
}

public inline fun <C : MutableCollection<in Float>> FloatArray.filterTo(destination: Any, predicate: (Float) -> Boolean): Any {
   for (element in `$this$filterTo`) {
      if (predicate(element) as java.lang.Boolean) {
         destination.add(element)
      }
   }

   return (C)destination
}

public inline fun IntArray.lastOrNull(predicate: (Int) -> Boolean): Int? {
   var var3: Int = `$this$lastOrNull`.length + -1
   if (0 <= `$this$lastOrNull`.length + -1) {
      do {
         val element: Int = `$this$lastOrNull`[var3--]
         if (predicate(element) as java.lang.Boolean) {
            return element
         }
      } while (0 <= var3)
   }

   return null
}

public inline fun FloatArray.first(predicate: (Float) -> Boolean): Float {
   for (element in `$this$first`) {
      if (predicate(element) as java.lang.Boolean) {
         return element
      }
   }

   throw NoSuchElementException("Array contains no element matching the predicate.")
}

@SinceKotlin(version = "1.4")
public fun LongArray.sortDescending(fromIndex: Int, toIndex: Int) {
   ArraysKt.sort(`$this$sortDescending`, fromIndex, toIndex)
   ArraysKt.reverse(`$this$sortDescending`, fromIndex, toIndex)
}

@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun <V, M : MutableMap<in Short, in Any>> ShortArray.associateWithTo(destination: Any, valueSelector: (Short) -> Any): Any {
   for (element in `$this$associateWithTo`) {
      destination.put(element, valueSelector(element))
   }

   return (M)destination
}

public inline fun <R, V> ShortArray.zip(other: Array<out Any>, transform: (Short, Any) -> Any): List<Any> {
   val size: Int = Math.min(`$this$zip`.length, other.length)
   val list: ArrayList = ArrayList(size)

   repeat(size) { i ->
      list.add(transform(`$this$zip`[i], other[i]))
   }

   return list
}

@JvmName(name = "maxWithOrThrow")
@SinceKotlin(version = "1.7")
public fun LongArray.maxWith(comparator: Comparator<in Long>): Long {
   if (`$this$maxWith`.length == 0) {
      throw NoSuchElementException()
   } else {
      var max: Long = `$this$maxWith`[0]
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxWith`)).iterator()

      while (var4.hasNext()) {
         val e: Long = `$this$maxWith`[var4.nextInt()]
         if (comparator.compare(max, e) < 0) {
            max = e
         }
      }

      return max
   }
}

public fun <T : Comparable<Any>> Array<out Any>.sortDescending() {
   ArraysKt.sortWith(`$this$sortDescending`, ComparisonsKt.reverseOrder())
}

public fun <T, A : Appendable> Array<out Any>.joinTo(
   buffer: Any,
   separator: CharSequence = ...,
   prefix: CharSequence = ...,
   postfix: CharSequence = ...,
   limit: Int = ...,
   truncated: CharSequence = ...,
   transform: ((Any) -> CharSequence)? = ...
): Any {
   buffer.append(prefix)
   val count: Int = 0

   for (element in `$this$joinTo`) {
      if (++count > 1) {
         buffer.append(separator)
      }

      if (limit >= 0 && count > limit) {
         break
      }

      StringsKt.appendElement(buffer, element, transform)
   }

   if (limit >= 0 && count > limit) {
      buffer.append(truncated)
   }

   buffer.append(postfix)
   return (A)buffer
}

@InlineOnly
public inline operator fun DoubleArray.component1(): Double {
   return `$this$component1`[0]
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun <V, M : MutableMap<in Int, in Any>> IntArray.associateWithTo(destination: Any, valueSelector: (Int) -> Any): Any {
   for (element in `$this$associateWithTo`) {
      destination.put(element, valueSelector(element))
   }

   return (M)destination
}

@SinceKotlin(version = "1.4")
public fun CharArray.minOrNull(): Char? {
   if (`$this$minOrNull`.length == 0) {
      return null
   } else {
      var min: Char = `$this$minOrNull`[0]
      val var2: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOrNull`)).iterator()

      while (var2.hasNext()) {
         val e: Char = `$this$minOrNull`[var2.nextInt()]
         if (Intrinsics.compare(min, e) > 0) {
            min = e
         }
      }

      return min
   }
}

public inline fun <T> Array<out Any>.forEach(action: (Any) -> Unit) {
   for (element in `$this$forEach`) {
      action(element)
   }
}

public fun LongArray.slice(indices: IntRange): List<Long> {
   return if (indices.isEmpty()) CollectionsKt.emptyList() else ArraysKt.asList(ArraysKt.copyOfRange(`$this$slice`, indices.start, indices.endInclusive + 1))
}

@JvmName(name = "minByOrThrow")
@SinceKotlin(version = "1.7")
public inline fun <R : Comparable<Any>> FloatArray.minBy(selector: (Float) -> Any): Float {
   if (`$this$minBy`.length == 0) {
      throw NoSuchElementException()
   } else {
      var minElem: Float = `$this$minBy`[0]
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$minBy`)
      if (lastIndex == 0) {
         return minElem
      } else {
         var minValue: java.lang.Comparable = selector(minElem) as java.lang.Comparable
         val var6: IntIterator = IntRange(1, lastIndex).iterator()

         while (var6.hasNext()) {
            val e: Float = `$this$minBy`[var6.nextInt()]
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

public inline fun CharArray.reduceRight(operation: (Char, Char) -> Char): Char {
   var index: Int = ArraysKt.getLastIndex(`$this$reduceRight`)
   if (index < 0) {
      throw UnsupportedOperationException("Empty array can't be reduced.")
   } else {
      var accumulator: Char = `$this$reduceRight`[index--]

      while (index >= 0) {
         accumulator = operation(`$this$reduceRight`[index--], accumulator) as Character
      }

      return accumulator
   }
}

public inline fun ShortArray.takeWhile(predicate: (Short) -> Boolean): List<Short> {
   val list: ArrayList = ArrayList()

   for (item in `$this$takeWhile`) {
      if (!predicate(item) as java.lang.Boolean) {
         break
      }

      list.add(item)
   }

   return list
}

public fun CharArray.distinct(): List<Char> {
   return CollectionsKt.toList(ArraysKt.toMutableSet(`$this$distinct`))
}

@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun ShortArray.random(): Short {
   return ArraysKt.random((short[])`$this$random`, Random.Default)
}

public inline fun LongArray.any(predicate: (Long) -> Boolean): Boolean {
   for (element in `$this$any`) {
      if (predicate(element) as java.lang.Boolean) {
         return true
      }
   }

   return false
}

@SinceKotlin(version = "1.4")
public fun BooleanArray.shuffle(random: Random) {
   for (i in ArraysKt.getLastIndex(`$this$shuffle`) downTo 1) {
      val j: Int = random.nextInt(i + 1)
      val copy: Boolean = `$this$shuffle`[i]
      `$this$shuffle`[i] = `$this$shuffle`[j]
      `$this$shuffle`[j] = copy
   }
}

public inline fun <T> Array<out Any>.takeLastWhile(predicate: (Any) -> Boolean): List<Any> {
   for (index in ArraysKt.getLastIndex(`$this$takeLastWhile`) downTo 0) {
      if (!predicate(`$this$takeLastWhile`[index]) as java.lang.Boolean) {
         return (java.util.List<T>)ArraysKt.drop((Object[])`$this$takeLastWhile`, index + 1)
      }
   }

   return (java.util.List<T>)ArraysKt.toList(`$this$takeLastWhile`)
}

public fun ByteArray.sortedArray(): ByteArray {
   if (`$this$sortedArray`.length == 0) {
      return `$this$sortedArray`
   } else {
      val var10000: ByteArray = Arrays.copyOf(`$this$sortedArray`, `$this$sortedArray`.length)
      ArraysKt.sort(var10000)
      return var10000
   }
}

@JvmName(name = "maxWithOrThrow")
@SinceKotlin(version = "1.7")
public fun <T> Array<out Any>.maxWith(comparator: Comparator<in Any>): Any {
   if (`$this$maxWith`.length == 0) {
      throw NoSuchElementException()
   } else {
      var max: Any = `$this$maxWith`[0]
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxWith`)).iterator()

      while (var3.hasNext()) {
         val e: Any = `$this$maxWith`[var3.nextInt()]
         if (comparator.compare(max, e) < 0) {
            max = e
         }
      }

      return (T)max
   }
}

public inline fun <K, V, M : MutableMap<in Any, MutableList<Any>>> ByteArray.groupByTo(
   destination: Any,
   keySelector: (Byte) -> Any,
   valueTransform: (Byte) -> Any
): Any {
   for (element in `$this$groupByTo`) {
      val key: Any = keySelector(element)
      val `value$iv`: Any = destination.get(key)
      val var10000: Any
      if (`value$iv` == null) {
         val var14: java.util.List = ArrayList()
         destination.put(key, var14)
         var10000 = var14
      } else {
         var10000 = `value$iv`
      }

      (var10000 as java.util.List).add(valueTransform(element))
   }

   return (M)destination
}

@OverloadResolutionByLambdaReturnType
@JvmName(name = "sumOfDouble")
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun BooleanArray.sumOf(selector: (Boolean) -> Double): Double {
   var sum: Double = 0.0

   for (element in `$this$sumOf`) {
      sum += (selector(element) as java.lang.Number).doubleValue()
   }

   return sum
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun BooleanArray.randomOrNull(): Boolean? {
   return ArraysKt.randomOrNull(`$this$randomOrNull`, Random.Default)
}

public fun IntArray.single(): Int {
   when (`$this$single`.length) {
      0 -> throw NoSuchElementException("Array is empty.")
      1 -> return `$this$single`[0]
      else -> throw IllegalArgumentException("Array has more than one element.")
   }
}

@JvmName(name = "minWithOrThrow")
@SinceKotlin(version = "1.7")
public fun <T> Array<out Any>.minWith(comparator: Comparator<in Any>): Any {
   if (`$this$minWith`.length == 0) {
      throw NoSuchElementException()
   } else {
      var min: Any = `$this$minWith`[0]
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minWith`)).iterator()

      while (var3.hasNext()) {
         val e: Any = `$this$minWith`[var3.nextInt()]
         if (comparator.compare(min, e) > 0) {
            min = e
         }
      }

      return (T)min
   }
}

@InlineOnly
public inline operator fun IntArray.component3(): Int {
   return `$this$component3`[2]
}

@InlineOnly
public inline fun ByteArray.isEmpty(): Boolean {
   return `$this$isEmpty`.length == 0
}

public fun ByteArray.joinToString(
   separator: CharSequence = ", " as java.lang.CharSequence,
   prefix: CharSequence = "" as java.lang.CharSequence,
   postfix: CharSequence = "" as java.lang.CharSequence,
   limit: Int = -1,
   truncated: CharSequence = "..." as java.lang.CharSequence,
   transform: ((Byte) -> CharSequence)? = null
): String {
   val var10000: java.lang.String = ArraysKt.joinTo((byte[])`$this$joinToString`, StringBuilder(), separator, prefix, postfix, limit, truncated, transform)
      .toString()
      return var10000
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun BooleanArray.onEachIndexed(action: (Int, Boolean) -> Unit): BooleanArray {
   var `index$iv`: Int = 0

   for (`item$iv` in `$this$onEachIndexed`) {
      action(`index$iv`++, `item$iv`)
   }

   return `$this$onEachIndexed`
}

public inline fun <R> ByteArray.mapIndexed(transform: (Int, Byte) -> Any): List<Any> {
   val `destination$iv`: java.util.Collection = ArrayList(`$this$mapIndexed`.length)
   var `index$iv`: Int = 0

   for (`item$iv` in `$this$mapIndexed`) {
      `destination$iv`.add(transform(`index$iv`++, `item$iv`))
   }

   return `destination$iv` as MutableList<R>
}

@InlineOnly
public inline operator fun IntArray.component5(): Int {
   return `$this$component5`[4]
}

@InlineOnly
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
public inline fun <R : Comparable<Any>> BooleanArray.minOf(selector: (Boolean) -> Any): Any {
   if (`$this$minOf`.length == 0) {
      throw NoSuchElementException()
   } else {
      var minValue: java.lang.Comparable = selector(`$this$minOf`[0]) as java.lang.Comparable
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOf`)).iterator()

      while (var3.hasNext()) {
         val v: java.lang.Comparable = selector(`$this$minOf`[var3.nextInt()]) as java.lang.Comparable
         if (minValue.compareTo(v) > 0) {
            minValue = v
         }
      }

      return (R)minValue
   }
}

@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
@InlineOnly
public inline fun <R> LongArray.maxOfWithOrNull(comparator: Comparator<in Any>, selector: (Long) -> Any): Any? {
   if (`$this$maxOfWithOrNull`.length == 0) {
      return null
   } else {
      var maxValue: Any = selector(`$this$maxOfWithOrNull`[0])
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfWithOrNull`)).iterator()

      while (var4.hasNext()) {
         val v: Any = selector(`$this$maxOfWithOrNull`[var4.nextInt()])
         if (comparator.compare(maxValue, v) < 0) {
            maxValue = v
         }
      }

      return (R)maxValue
   }
}

public infix fun LongArray.subtract(other: Iterable<Long>): Set<Long> {
   val set: java.util.Set = ArraysKt.toMutableSet(`$this$subtract`)
   CollectionsKt.removeAll(set, other)
   return set
}

public inline fun BooleanArray.reduceIndexed(operation: (Int, Boolean, Boolean) -> Boolean): Boolean {
   if (`$this$reduceIndexed`.length == 0) {
      throw UnsupportedOperationException("Empty array can't be reduced.")
   } else {
      var accumulator: Boolean = `$this$reduceIndexed`[0]
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$reduceIndexed`)).iterator()

      while (var4.hasNext()) {
         val index: Int = var4.nextInt()
         accumulator = operation(index, accumulator, `$this$reduceIndexed`[index]) as java.lang.Boolean
      }

      return accumulator
   }
}

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun DoubleArray.maxOfOrNull(selector: (Double) -> Float): Float? {
   if (`$this$maxOfOrNull`.length == 0) {
      return null
   } else {
      var maxValue: Float = (selector(`$this$maxOfOrNull`[0]) as java.lang.Number).floatValue()
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfOrNull`)).iterator()

      while (var3.hasNext()) {
         maxValue = Math.max(maxValue, (selector(`$this$maxOfOrNull`[var3.nextInt()]) as java.lang.Number).floatValue())
      }

      return maxValue
   }
}

public inline fun <R, V> DoubleArray.zip(other: Array<out Any>, transform: (Double, Any) -> Any): List<Any> {
   val size: Int = Math.min(`$this$zip`.length, other.length)
   val list: ArrayList = ArrayList(size)

   repeat(size) { i ->
      list.add(transform(`$this$zip`[i], other[i]))
   }

   return list
}

public inline fun ByteArray.dropWhile(predicate: (Byte) -> Boolean): List<Byte> {
   var yielding: Boolean = false
   val list: ArrayList = ArrayList()

   for (item in `$this$dropWhile`) {
      if (yielding) {
         list.add(item)
      } else if (!predicate(item) as java.lang.Boolean) {
         list.add(item)
         yielding = true
      }
   }

   return list
}

@InlineOnly
public inline fun FloatArray.count(): Int {
   return `$this$count`.length
}

public fun ByteArray.average(): Double {
   var sum: Double = 0.0
   var count: Int = 0

   for (element in `$this$average`) {
      sum += element
      count++
   }

   return if (count == 0) java.lang.Double.NaN else sum / count
}

public inline fun BooleanArray.firstOrNull(predicate: (Boolean) -> Boolean): Boolean? {
   for (element in `$this$firstOrNull`) {
      if (predicate(element) as java.lang.Boolean) {
         return element
      }
   }

   return null
}

public inline fun <K, V> DoubleArray.associateBy(keySelector: (Double) -> Any, valueTransform: (Double) -> Any): Map<Any, Any> {
   val `destination$iv`: java.util.Map = LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(`$this$associateBy`.length), 16))

   for (`element$iv` in `$this$associateBy`) {
      `destination$iv`.put(keySelector(`element$iv`), valueTransform(`element$iv`))
   }

   return `destination$iv`
}

public fun IntArray.lastOrNull(): Int? {
   return if (`$this$lastOrNull`.length == 0) null else `$this$lastOrNull`[`$this$lastOrNull`.length - 1]
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun ShortArray.runningReduceIndexed(operation: (Int, Short, Short) -> Short): List<Short> {
   if (`$this$runningReduceIndexed`.length == 0) {
      return CollectionsKt.emptyList()
   } else {
      var var7: Short = `$this$runningReduceIndexed`[0]
      val index: ArrayList = ArrayList(`$this$runningReduceIndexed`.length)
      index.add(var7)
      val result: ArrayList = index
      var var8: Int = 1

      for (var9 in `$this$runningReduceIndexed`.length..var8) {
         var7 = (operation(var8, var7, `$this$runningReduceIndexed`[var8]) as java.lang.Number).shortValue()
         result.add(var7)
      }

      return result
   }
}

public inline fun DoubleArray.indexOfFirst(predicate: (Double) -> Boolean): Int {
   var index: Int = 0

   for (var4 in `$this$indexOfFirst`.length..index) {
      if (predicate(`$this$indexOfFirst`[index]) as java.lang.Boolean) {
         return index
      }
   }

   return -1
}

public inline fun LongArray.reduceRight(operation: (Long, Long) -> Long): Long {
   var index: Int = ArraysKt.getLastIndex(`$this$reduceRight`)
   if (index < 0) {
      throw UnsupportedOperationException("Empty array can't be reduced.")
   } else {
      var accumulator: Long = `$this$reduceRight`[index--]

      while (index >= 0) {
         accumulator = (operation(`$this$reduceRight`[index--], accumulator) as java.lang.Number).longValue()
      }

      return accumulator
   }
}

public fun CharArray.lastIndexOf(element: Char): Int {
   var var2: Int = `$this$lastIndexOf`.length + -1
   if (0 <= `$this$lastIndexOf`.length + -1) {
      do {
         val index: Int = var2--
         if (element == `$this$lastIndexOf`[index]) {
            return index
         }
      } while (0 <= var2)
   }

   return -1
}

public inline fun IntArray.first(predicate: (Int) -> Boolean): Int {
   for (element in `$this$first`) {
      if (predicate(element) as java.lang.Boolean) {
         return element
      }
   }

   throw NoSuchElementException("Array contains no element matching the predicate.")
}

public inline fun ShortArray.forEachIndexed(action: (Int, Short) -> Unit) {
   var index: Int = 0

   for (item in `$this$forEachIndexed`) {
      action(index++, item)
   }
}

@SinceKotlin(version = "1.4")
public fun CharArray.maxWithOrNull(comparator: Comparator<in Char>): Char? {
   if (`$this$maxWithOrNull`.length == 0) {
      return null
   } else {
      var max: Char = `$this$maxWithOrNull`[0]
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxWithOrNull`)).iterator()

      while (var3.hasNext()) {
         val e: Char = `$this$maxWithOrNull`[var3.nextInt()]
         if (comparator.compare(max, e) < 0) {
            max = e
         }
      }

      return max
   }
}

public fun CharArray.reversedArray(): CharArray {
   if (`$this$reversedArray`.length == 0) {
      return `$this$reversedArray`
   } else {
      val result: CharArray = CharArray(`$this$reversedArray`.length)
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$reversedArray`)
      val var3: IntIterator = IntRange(0, lastIndex).iterator()

      while (var3.hasNext()) {
         val i: Int = var3.nextInt()
         result[lastIndex - i] = `$this$reversedArray`[i]
      }

      return result
   }
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.4")
public inline fun ByteArray.reduceOrNull(operation: (Byte, Byte) -> Byte): Byte? {
   if (`$this$reduceOrNull`.length == 0) {
      return null
   } else {
      var accumulator: Byte = `$this$reduceOrNull`[0]
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$reduceOrNull`)).iterator()

      while (var4.hasNext()) {
         accumulator = (operation(accumulator, `$this$reduceOrNull`[var4.nextInt()]) as java.lang.Number).byteValue()
      }

      return accumulator
   }
}

public inline fun <R, C : MutableCollection<in Any>> BooleanArray.mapTo(destination: Any, transform: (Boolean) -> Any): Any {
   for (item in `$this$mapTo`) {
      destination.add(transform(item))
   }

   return (C)destination
}

public fun ByteArray.asSequence(): Sequence<Byte> {
   return if (`$this$asSequence`.length == 0) SequencesKt.emptySequence() else ArraysKt___ArraysKt$asSequence$$inlined$Sequence$2(`$this$asSequence`)
}

public inline fun BooleanArray.none(predicate: (Boolean) -> Boolean): Boolean {
   for (element in `$this$none`) {
      if (predicate(element) as java.lang.Boolean) {
         return false
      }
   }

   return true
}

public inline fun <K, V, M : MutableMap<in Any, in Any>> LongArray.associateTo(destination: Any, transform: (Long) -> Pair<Any, Any>): Any {
   for (element in `$this$associateTo`) {
      val var9: Pair = transform(element) as Pair
      destination.put(var9.first, var9.second)
   }

   return (M)destination
}

@JvmName(name = "minOrThrow")
@SinceKotlin(version = "1.7")
public fun LongArray.min(): Long {
   if (`$this$min`.length == 0) {
      throw NoSuchElementException()
   } else {
      var min: Long = `$this$min`[0]
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$min`)).iterator()

      while (var3.hasNext()) {
         val e: Long = `$this$min`[var3.nextInt()]
         if (min > e) {
            min = e
         }
      }

      return min
   }
}

public fun BooleanArray.sortedWith(comparator: Comparator<in Boolean>): List<Boolean> {
   val var2: Array<java.lang.Boolean> = ArraysKt.toTypedArray(`$this$sortedWith`)
   ArraysKt.sortWith(var2, comparator)
   return ArraysKt.asList(var2)
}

public inline fun <K, V, M : MutableMap<in Any, in Any>> CharArray.associateTo(destination: Any, transform: (Char) -> Pair<Any, Any>): Any {
   for (element in `$this$associateTo`) {
      val var8: Pair = transform(element) as Pair
      destination.put(var8.first, var8.second)
   }

   return (M)destination
}

@SinceKotlin(version = "1.7")
@JvmName(name = "maxByOrThrow")
public inline fun <R : Comparable<Any>> ByteArray.maxBy(selector: (Byte) -> Any): Byte {
   if (`$this$maxBy`.length == 0) {
      throw NoSuchElementException()
   } else {
      var maxElem: Byte = `$this$maxBy`[0]
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$maxBy`)
      if (lastIndex == 0) {
         return maxElem
      } else {
         var maxValue: java.lang.Comparable = selector(maxElem) as java.lang.Comparable
         val var6: IntIterator = IntRange(1, lastIndex).iterator()

         while (var6.hasNext()) {
            val e: Byte = `$this$maxBy`[var6.nextInt()]
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

public inline fun <C : MutableCollection<in Long>> LongArray.filterTo(destination: Any, predicate: (Long) -> Boolean): Any {
   for (element in `$this$filterTo`) {
      if (predicate(element) as java.lang.Boolean) {
         destination.add(element)
      }
   }

   return (C)destination
}

public inline fun IntArray.filter(predicate: (Int) -> Boolean): List<Int> {
   val `destination$iv`: java.util.Collection = ArrayList()

   for (`element$iv` in `$this$filter`) {
      if (predicate(`element$iv`) as java.lang.Boolean) {
         `destination$iv`.add(`element$iv`)
      }
   }

   return `destination$iv` as MutableList<Int>
}

public inline fun <T, R, C : MutableCollection<in Any>> Array<out Any>.flatMapTo(destination: Any, transform: (Any) -> Iterable<Any>): Any {
   for (element in `$this$flatMapTo`) {
      CollectionsKt.addAll(destination, transform(element) as java.lang.Iterable)
   }

   return (C)destination
}

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun <R : Comparable<Any>> FloatArray.minOfOrNull(selector: (Float) -> Any): Any? {
   if (`$this$minOfOrNull`.length == 0) {
      return null
   } else {
      var minValue: java.lang.Comparable = selector(`$this$minOfOrNull`[0]) as java.lang.Comparable
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfOrNull`)).iterator()

      while (var3.hasNext()) {
         val v: java.lang.Comparable = selector(`$this$minOfOrNull`[var3.nextInt()]) as java.lang.Comparable
         if (minValue.compareTo(v) > 0) {
            minValue = v
         }
      }

      return (R)minValue
   }
}

public inline fun <R, C : MutableCollection<in Any>> FloatArray.mapTo(destination: Any, transform: (Float) -> Any): Any {
   for (item in `$this$mapTo`) {
      destination.add(transform(item))
   }

   return (C)destination
}

public fun DoubleArray.none(): Boolean {
   return `$this$none`.length == 0
}

@SinceKotlin(version = "1.3")
public fun ShortArray.random(random: Random): Short {
   if (`$this$random`.length == 0) {
      throw NoSuchElementException("Array is empty.")
   } else {
      return `$this$random`[random.nextInt(`$this$random`.length)]
   }
}

@InlineOnly
@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
public inline fun BooleanArray.maxOf(selector: (Boolean) -> Double): Double {
   if (`$this$maxOf`.length == 0) {
      throw NoSuchElementException()
   } else {
      var maxValue: Double = (selector(`$this$maxOf`[0]) as java.lang.Number).doubleValue()
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOf`)).iterator()

      while (var4.hasNext()) {
         maxValue = Math.max(maxValue, (selector(`$this$maxOf`[var4.nextInt()]) as java.lang.Number).doubleValue())
      }

      return maxValue
   }
}

public inline fun <K> CharArray.groupBy(keySelector: (Char) -> Any): Map<Any, List<Char>> {
   val `destination$iv`: java.util.Map = LinkedHashMap()

   for (`element$iv` in `$this$groupBy`) {
      val `key$iv`: Any = keySelector(`element$iv`)
      val `value$iv$iv`: Any = `destination$iv`.get(`key$iv`)
      val var10000: Any
      if (`value$iv$iv` == null) {
         val var15: java.util.List = ArrayList()
         `destination$iv`.put(`key$iv`, var15)
         var10000 = var15
      } else {
         var10000 = `value$iv$iv`
      }

      (var10000 as java.util.List).add(`element$iv`)
   }

   return `destination$iv`
}

public fun ByteArray.toMutableList(): MutableList<Byte> {
   val list: ArrayList = ArrayList(`$this$toMutableList`.length)

   for (item in `$this$toMutableList`) {
      list.add(item)
   }

   return list
}

public fun DoubleArray.lastOrNull(): Double? {
   return if (`$this$lastOrNull`.length == 0) null else `$this$lastOrNull`[`$this$lastOrNull`.length - 1]
}

public fun FloatArray.take(n: Int): List<Float> {
   if (n < 0) {
      throw IllegalArgumentException(("Requested element count $n is less than zero.").toString())
   } else if (n == 0) {
      return CollectionsKt.emptyList()
   } else if (n >= `$this$take`.length) {
      return ArraysKt.toList(`$this$take`)
   } else if (n == 1) {
      return CollectionsKt.listOf(`$this$take`[0])
   } else {
      val var7: Int = 0
      val list: ArrayList = ArrayList(n)

      for (item in `$this$take`) {
         list.add(item)
         if (++var7 == n) {
            break
         }
      }

      return list
   }
}

public fun LongArray.any(): Boolean {
   return `$this$any`.length != 0
}

public fun LongArray.getOrNull(index: Int): Long? {
   return if (index >= 0 && index <= ArraysKt.getLastIndex(`$this$getOrNull`)) `$this$getOrNull`[index] else null
}

public fun FloatArray.sortedWith(comparator: Comparator<in Float>): List<Float> {
   val var2: Array<java.lang.Float> = ArraysKt.toTypedArray(`$this$sortedWith`)
   ArraysKt.sortWith(var2, comparator)
   return ArraysKt.asList(var2)
}

public fun ShortArray.slice(indices: IntRange): List<Short> {
   return if (indices.isEmpty())
      CollectionsKt.emptyList()
      else
      ArraysKt.asList(ArraysKt.copyOfRange((short[])`$this$slice`, indices.start, indices.endInclusive + 1))
   }

public inline fun ShortArray.all(predicate: (Short) -> Boolean): Boolean {
   for (element in `$this$all`) {
      if (!predicate(element) as java.lang.Boolean) {
         return false
      }
   }

   return true
}

public inline fun BooleanArray.reduceRightIndexed(operation: (Int, Boolean, Boolean) -> Boolean): Boolean {
   var index: Int = ArraysKt.getLastIndex(`$this$reduceRightIndexed`)
   if (index < 0) {
      throw UnsupportedOperationException("Empty array can't be reduced.")
   } else {
      var accumulator: Boolean = `$this$reduceRightIndexed`[index--]

      while (index >= 0) {
         accumulator = operation(index, `$this$reduceRightIndexed`[index], accumulator) as java.lang.Boolean
         index--
      }

      return accumulator
   }
}

@JvmName(name = "averageOfInt")
public fun Array<out Int>.average(): Double {
   var sum: Double = 0.0
   var count: Int = 0
   var var4: Int = 0

   for (var5 in `$this$average`.length..var4) {
      sum += `$this$average`[var4].intValue()
      count++
   }

   return if (count == 0) java.lang.Double.NaN else sum / count
}

public inline fun <K> BooleanArray.groupBy(keySelector: (Boolean) -> Any): Map<Any, List<Boolean>> {
   val `destination$iv`: java.util.Map = LinkedHashMap()

   for (`element$iv` in `$this$groupBy`) {
      val `key$iv`: Any = keySelector(`element$iv`)
      val `value$iv$iv`: Any = `destination$iv`.get(`key$iv`)
      val var10000: Any
      if (`value$iv$iv` == null) {
         val var15: java.util.List = ArrayList()
         `destination$iv`.put(`key$iv`, var15)
         var10000 = var15
      } else {
         var10000 = `value$iv$iv`
      }

      (var10000 as java.util.List).add(`element$iv`)
   }

   return `destination$iv`
}

public inline fun ByteArray.reduce(operation: (Byte, Byte) -> Byte): Byte {
   if (`$this$reduce`.length == 0) {
      throw UnsupportedOperationException("Empty array can't be reduced.")
   } else {
      var accumulator: Byte = `$this$reduce`[0]
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$reduce`)).iterator()

      while (var4.hasNext()) {
         accumulator = (operation(accumulator, `$this$reduce`[var4.nextInt()]) as java.lang.Number).byteValue()
      }

      return accumulator
   }
}

@InlineOnly
@SinceKotlin(version = "1.4")
@JvmName(name = "sumOfInt")
@OverloadResolutionByLambdaReturnType
public inline fun CharArray.sumOf(selector: (Char) -> Int): Int {
   var sum: Int = 0

   for (element in `$this$sumOf`) {
      sum += (selector(element) as java.lang.Number).intValue()
   }

   return sum
}

@SinceKotlin(version = "1.3")
public fun BooleanArray.random(random: Random): Boolean {
   if (`$this$random`.length == 0) {
      throw NoSuchElementException("Array is empty.")
   } else {
      return `$this$random`[random.nextInt(`$this$random`.length)]
   }
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun <V> LongArray.associateWith(valueSelector: (Long) -> Any): Map<Long, Any> {
   val result: LinkedHashMap = LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(`$this$associateWith`.length), 16))

   for (var6 in `$this$associateWith`) {
      result.put(var6, valueSelector(var6))
   }

   return result
}

@JvmName(name = "maxOrThrow")
@SinceKotlin(version = "1.7")
public fun ShortArray.max(): Short {
   if (`$this$max`.length == 0) {
      throw NoSuchElementException()
   } else {
      var max: Short = `$this$max`[0]
      val var2: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$max`)).iterator()

      while (var2.hasNext()) {
         val e: Short = `$this$max`[var2.nextInt()]
         if (max < e) {
            max = e
         }
      }

      return max
   }
}

public fun BooleanArray.reversedArray(): BooleanArray {
   if (`$this$reversedArray`.length == 0) {
      return `$this$reversedArray`
   } else {
      val result: BooleanArray = BooleanArray(`$this$reversedArray`.length)
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$reversedArray`)
      val var3: IntIterator = IntRange(0, lastIndex).iterator()

      while (var3.hasNext()) {
         val i: Int = var3.nextInt()
         result[lastIndex - i] = `$this$reversedArray`[i]
      }

      return result
   }
}

@SinceKotlin(version = "1.4")
@InlineOnly
@OverloadResolutionByLambdaReturnType
public inline fun <R : Comparable<Any>> ByteArray.minOf(selector: (Byte) -> Any): Any {
   if (`$this$minOf`.length == 0) {
      throw NoSuchElementException()
   } else {
      var minValue: java.lang.Comparable = selector(`$this$minOf`[0]) as java.lang.Comparable
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOf`)).iterator()

      while (var3.hasNext()) {
         val v: java.lang.Comparable = selector(`$this$minOf`[var3.nextInt()]) as java.lang.Comparable
         if (minValue.compareTo(v) > 0) {
            minValue = v
         }
      }

      return (R)minValue
   }
}

@InlineOnly
public inline fun ShortArray.isEmpty(): Boolean {
   return `$this$isEmpty`.length == 0
}

@OverloadResolutionByLambdaReturnType
@InlineOnly
@JvmName(name = "sumOfLong")
@SinceKotlin(version = "1.4")
public inline fun LongArray.sumOf(selector: (Long) -> Long): Long {
   var sum: Long = 0L

   for (element in `$this$sumOf`) {
      sum += (selector(element) as java.lang.Number).longValue()
   }

   return sum
}

@SinceKotlin(version = "1.7")
@JvmName(name = "minByOrThrow")
public inline fun <R : Comparable<Any>> DoubleArray.minBy(selector: (Double) -> Any): Double {
   if (`$this$minBy`.length == 0) {
      throw NoSuchElementException()
   } else {
      var minElem: Double = `$this$minBy`[0]
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$minBy`)
      if (lastIndex == 0) {
         return minElem
      } else {
         var minValue: java.lang.Comparable = selector(minElem) as java.lang.Comparable
         val var7: IntIterator = IntRange(1, lastIndex).iterator()

         while (var7.hasNext()) {
            val e: Double = `$this$minBy`[var7.nextInt()]
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
@SinceKotlin(version = "1.4")
public inline fun LongArray.onEachIndexed(action: (Int, Long) -> Unit): LongArray {
   var `index$iv`: Int = 0

   for (`item$iv` in `$this$onEachIndexed`) {
      action(`index$iv`++, `item$iv`)
   }

   return `$this$onEachIndexed`
}

@SinceKotlin(version = "1.4")
public fun <T> Array<Any>.reverse(fromIndex: Int, toIndex: Int) {
   AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(fromIndex, toIndex, `$this$reverse`.length)
   val midPoint: Int = (fromIndex + toIndex) / 2
   if (fromIndex != (fromIndex + toIndex) / 2) {
      var reverseIndex: Int = toIndex + -1

      for (index in fromIndex..midPoint) {
         val tmp: Any = `$this$reverse`[index]
         `$this$reverse`[index] = `$this$reverse`[reverseIndex]
         `$this$reverse`[reverseIndex] = tmp
         reverseIndex--
      }
   }
}

public infix fun IntArray.zip(other: IntArray): List<Pair<Int, Int>> {
   val `$this$zip$iv`: IntArray = `$this$zip`
   val `size$iv`: Int = Math.min(`$this$zip`.length, other.length)
   val `list$iv`: ArrayList = ArrayList(`size$iv`)

   repeat(`size$iv`) { `i$iv` ->
      `list$iv`.add(`$this$zip$iv`[`i$iv`] to other[`i$iv`])
   }

   return `list$iv`
}

public inline fun ShortArray.last(predicate: (Short) -> Boolean): Short {
   var var3: Int = `$this$last`.length + -1
   if (0 <= `$this$last`.length + -1) {
      do {
         val element: Short = `$this$last`[var3--]
         if (predicate(element) as java.lang.Boolean) {
            return element
         }
      } while (0 <= var3)
   }

   throw NoSuchElementException("Array contains no element matching the predicate.")
}

@SinceKotlin(version = "1.7")
@JvmName(name = "minOrThrow")
public fun CharArray.min(): Char {
   if (`$this$min`.length == 0) {
      throw NoSuchElementException()
   } else {
      var min: Char = `$this$min`[0]
      val var2: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$min`)).iterator()

      while (var2.hasNext()) {
         val e: Char = `$this$min`[var2.nextInt()]
         if (Intrinsics.compare(min, e) > 0) {
            min = e
         }
      }

      return min
   }
}

@InlineOnly
@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
public inline fun <T> Array<out Any>.minOf(selector: (Any) -> Float): Float {
   if (`$this$minOf`.length == 0) {
      throw NoSuchElementException()
   } else {
      var minValue: Float = (selector(`$this$minOf`[0]) as java.lang.Number).floatValue()
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOf`)).iterator()

      while (var3.hasNext()) {
         minValue = Math.min(minValue, (selector(`$this$minOf`[var3.nextInt()]) as java.lang.Number).floatValue())
      }

      return minValue
   }
}

@InlineOnly
public inline fun BooleanArray.find(predicate: (Boolean) -> Boolean): Boolean? {
   val `$this$firstOrNull$iv`: BooleanArray = `$this$find`
   var var4: Int = 0
   val var5: Int = `$this$find`.length

   var var10000: java.lang.Boolean
   while (true) {
      if (var4 >= var5) {
         var10000 = null
         break
      }

      val `element$iv`: Boolean = `$this$firstOrNull$iv`[var4]
      if (predicate(`$this$firstOrNull$iv`[var4]) as java.lang.Boolean) {
         var10000 = `element$iv`
         break
      }

      var4++
   }

   return var10000
}

@SinceKotlin(version = "1.4")
public fun IntArray.minWithOrNull(comparator: Comparator<in Int>): Int? {
   if (`$this$minWithOrNull`.length == 0) {
      return null
   } else {
      var min: Int = `$this$minWithOrNull`[0]
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minWithOrNull`)).iterator()

      while (var3.hasNext()) {
         val e: Int = `$this$minWithOrNull`[var3.nextInt()]
         if (comparator.compare(min, e) > 0) {
            min = e
         }
      }

      return min
   }
}

public fun ShortArray.reversed(): List<Short> {
   if (`$this$reversed`.length == 0) {
      return CollectionsKt.emptyList()
   } else {
      val list: java.util.List = ArraysKt.toMutableList(`$this$reversed`)
      CollectionsKt.reverse(list)
      return list
   }
}

@SinceKotlin(version = "1.5")
@OverloadResolutionByLambdaReturnType
@InlineOnly
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@JvmName(name = "sumOfULong")
public inline fun ShortArray.sumOf(selector: (Short) -> ULong): ULong {
   var sum: Long = ULong.constructor_impl/* $VF was: constructor-impl */(0L)

   for (element in `$this$sumOf`) {
      sum = ULong.constructor_impl/* $VF was: constructor-impl */(sum + (selector(element) as ULong).unbox_impl/* $VF was: unbox-impl */())
   }

   return sum
}

@SinceKotlin(version = "1.7")
@JvmName(name = "maxByOrThrow")
public inline fun <R : Comparable<Any>> DoubleArray.maxBy(selector: (Double) -> Any): Double {
   if (`$this$maxBy`.length == 0) {
      throw NoSuchElementException()
   } else {
      var maxElem: Double = `$this$maxBy`[0]
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$maxBy`)
      if (lastIndex == 0) {
         return maxElem
      } else {
         var maxValue: java.lang.Comparable = selector(maxElem) as java.lang.Comparable
         val var7: IntIterator = IntRange(1, lastIndex).iterator()

         while (var7.hasNext()) {
            val e: Double = `$this$maxBy`[var7.nextInt()]
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

public fun DoubleArray.sortedArray(): DoubleArray {
   if (`$this$sortedArray`.length == 0) {
      return `$this$sortedArray`
   } else {
      val var10000: DoubleArray = Arrays.copyOf(`$this$sortedArray`, `$this$sortedArray`.length)
      ArraysKt.sort(var10000)
      return var10000
   }
}

@Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = []))
@DeprecatedSinceKotlin(warningSince = "1.5")
public inline fun LongArray.sumBy(selector: (Long) -> Int): Int {
   var sum: Int = 0

   for (element in `$this$sumBy`) {
      sum += (selector(element) as java.lang.Number).intValue()
   }

   return sum
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun <R> ByteArray.scanIndexed(initial: Any, operation: (Int, Any, Byte) -> Any): List<Any> {
   val var3: ByteArray = `$this$scanIndexed`
   val var10000: java.util.List
   if (`$this$scanIndexed`.length == 0) {
      var10000 = CollectionsKt.listOf(initial)
   } else {
      val var4: ArrayList = ArrayList(`$this$scanIndexed`.length + 1)
      var4.add(initial)
      val var6: ArrayList = var4
      var var8: Any = initial
      var var9: Int = 0

      for (var7 in `$this$scanIndexed`.length..var9) {
         var8 = operation(var9, var8, var3[var9])
         var6.add(var8)
      }

      var10000 = var6
   }

   return var10000
}

public infix fun <T> Array<out Any>.subtract(other: Iterable<Any>): Set<Any> {
   val set: java.util.Set = ArraysKt.toMutableSet(`$this$subtract`)
   CollectionsKt.removeAll(set, other)
   return set
}

@SinceKotlin(version = "1.4")
@InlineOnly
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public inline fun <R> FloatArray.scanIndexed(initial: Any, operation: (Int, Any, Float) -> Any): List<Any> {
   val var3: FloatArray = `$this$scanIndexed`
   val var10000: java.util.List
   if (`$this$scanIndexed`.length == 0) {
      var10000 = CollectionsKt.listOf(initial)
   } else {
      val var4: ArrayList = ArrayList(`$this$scanIndexed`.length + 1)
      var4.add(initial)
      val var6: ArrayList = var4
      var var8: Any = initial
      var var9: Int = 0

      for (var7 in `$this$scanIndexed`.length..var9) {
         var8 = operation(var9, var8, var3[var9])
         var6.add(var8)
      }

      var10000 = var6
   }

   return var10000
}

public inline fun <R : Comparable<Any>> DoubleArray.sortedBy(crossinline selector: (Double) -> Any?): List<Double> {
   return ArraysKt.sortedWith(`$this$sortedBy`,    // $VF: Compiled from Comparisons.kt
{ a: Any, b: Any ->
      val var3: Function1 = selector
      return ComparisonsKt.compareValues((T)(selector(a) as java.lang.Comparable), (T)(var3(b) as java.lang.Comparable))
   })
}

@InlineOnly
public inline fun DoubleArray.findLast(predicate: (Double) -> Boolean): Double? {
   val `$this$lastOrNull$iv`: DoubleArray = `$this$findLast`
   var var4: Int = `$this$findLast`.length + -1
   if (0 <= `$this$findLast`.length + -1) {
      do {
         val `element$iv`: Double = `$this$lastOrNull$iv`[var4--]
         if (predicate(`element$iv`) as java.lang.Boolean) {
            return `element$iv`
         }
      } while (0 <= var4)
   }

   return null
}

@SinceKotlin(version = "1.7")
@JvmName(name = "minWithOrThrow")
public fun LongArray.minWith(comparator: Comparator<in Long>): Long {
   if (`$this$minWith`.length == 0) {
      throw NoSuchElementException()
   } else {
      var min: Long = `$this$minWith`[0]
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minWith`)).iterator()

      while (var4.hasNext()) {
         val e: Long = `$this$minWith`[var4.nextInt()]
         if (comparator.compare(min, e) > 0) {
            min = e
         }
      }

      return min
   }
}

public inline fun LongArray.reduceRightIndexed(operation: (Int, Long, Long) -> Long): Long {
   var index: Int = ArraysKt.getLastIndex(`$this$reduceRightIndexed`)
   if (index < 0) {
      throw UnsupportedOperationException("Empty array can't be reduced.")
   } else {
      var accumulator: Long = `$this$reduceRightIndexed`[index--]

      while (index >= 0) {
         accumulator = (operation(index, `$this$reduceRightIndexed`[index], accumulator) as java.lang.Number).longValue()
         index--
      }

      return accumulator
   }
}

public inline fun <T, K> Array<out Any>.associateBy(keySelector: (Any) -> Any): Map<Any, Any> {
   val `destination$iv`: java.util.Map = LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(`$this$associateBy`.length), 16))

   for (`element$iv` in `$this$associateBy`) {
      `destination$iv`.put(keySelector(`element$iv`), `element$iv`)
   }

   return `destination$iv`
}

@InlineOnly
public inline fun DoubleArray.elementAtOrNull(index: Int): Double? {
   return ArraysKt.getOrNull(`$this$elementAtOrNull`, index)
}

@SinceKotlin(version = "1.4")
@InlineOnly
@JvmName(name = "flatMapIndexedIterableTo")
@OverloadResolutionByLambdaReturnType
public inline fun <R, C : MutableCollection<in Any>> BooleanArray.flatMapIndexedTo(destination: Any, transform: (Int, Boolean) -> Iterable<Any>): Any {
   var index: Int = 0

   for (element in `$this$flatMapIndexedTo`) {
      CollectionsKt.addAll(destination, transform(index++, element) as java.lang.Iterable)
   }

   return (C)destination
}

public infix fun ByteArray.zip(other: ByteArray): List<Pair<Byte, Byte>> {
   val `$this$zip$iv`: ByteArray = `$this$zip`
   val `size$iv`: Int = Math.min(`$this$zip`.length, other.length)
   val `list$iv`: ArrayList = ArrayList(`size$iv`)

   repeat(`size$iv`) { `i$iv` ->
      `list$iv`.add(`$this$zip$iv`[`i$iv`] to other[`i$iv`])
   }

   return `list$iv`
}

public fun ByteArray.sortDescending() {
   if (`$this$sortDescending`.length > 1) {
      ArraysKt.sort(`$this$sortDescending`)
      ArraysKt.reverse(`$this$sortDescending`)
   }
}

public fun <A : Appendable> ShortArray.joinTo(
   buffer: Any,
   separator: CharSequence = ...,
   prefix: CharSequence = ...,
   postfix: CharSequence = ...,
   limit: Int = ...,
   truncated: CharSequence = ...,
   transform: ((Short) -> CharSequence)? = ...
): Any {
   buffer.append(prefix)
   val count: Int = 0

   for (element in `$this$joinTo`) {
      if (++count > 1) {
         buffer.append(separator)
      }

      if (limit >= 0 && count > limit) {
         break
      }

      if (transform != null) {
         buffer.append(transform(element) as java.lang.CharSequence)
      } else {
         buffer.append(java.lang.String.valueOf(element))
      }
   }

   if (limit >= 0 && count > limit) {
      buffer.append(truncated)
   }

   buffer.append(postfix)
   return (A)buffer
}
