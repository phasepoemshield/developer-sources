@file:JvmMultifileClass
@file:JvmName("SequencesKt")

package kotlin.sequences

import java.util.ArrayList
import java.util.Comparator
import java.util.HashSet
import java.util.LinkedHashMap
import java.util.LinkedHashSet
import java.util.NoSuchElementException
import kotlin.internal.InlineOnly
import kotlin.internal.PlatformImplementationsKt
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.Ref

// $VF: Compiled from _Sequences.kt
public inline fun <T> Sequence<Any>.forEachIndexed(action: (Int, Any) -> Unit) {
   var index: Int = 0

   for (item in `$this$forEachIndexed`) {
      val var6: Int = index++
      if (var6 < 0) {
         if (!PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
            throw ArithmeticException("Index overflow has happened.")
         }

         CollectionsKt.throwIndexOverflow()
      }

      action(var6, item)
   }
}

public fun <T, K> Sequence<Any>.distinctBy(selector: (Any) -> Any): Sequence<Any> {
   return DistinctSequence(`$this$distinctBy`, selector)
}

@JvmName(name = "sumOfShort")
public fun Sequence<Short>.sum(): Int {
   var sum: Short = 0
   val var2: java.util.Iterator = `$this$sum`.iterator()

   while (var2.hasNext()) {
      sum += (var2.next() as java.lang.Number).shortValue()
   }

   return sum
}

public inline fun <T, K> Sequence<Any>.associateBy(keySelector: (Any) -> Any): Map<Any, Any> {
   val `destination$iv`: java.util.Map = LinkedHashMap()

   for (`element$iv` in `$this$associateBy`) {
      `destination$iv`.put(keySelector(`element$iv`), `element$iv`)
   }

   return `destination$iv`
}

public fun <T> Sequence<Any>.joinToString(
   separator: CharSequence = ", " as java.lang.CharSequence,
   prefix: CharSequence = "" as java.lang.CharSequence,
   postfix: CharSequence = "" as java.lang.CharSequence,
   limit: Int = -1,
   truncated: CharSequence = "..." as java.lang.CharSequence,
   transform: ((Any) -> CharSequence)? = null
): String {
   val var10000: java.lang.String = SequencesKt.joinTo(`$this$joinToString`, StringBuilder(), separator, prefix, postfix, limit, truncated, transform)
      .toString()
      return var10000
}

@SinceKotlin(version = "1.4")
public fun <T, R> Sequence<Any>.runningFold(initial: Any, operation: (Any, Any) -> Any): Sequence<Any> {
   return SequencesKt.sequence(   // $VF: Compiled from _Sequences.kt
{
      // $VF: Could not decompile lambda - root function was not found. Is this a suspend lambda?
   } as Function2)
}

@SinceKotlin(version = "1.7")
@JvmName(name = "minOrThrow")
public fun Sequence<Double>.min(): Double {
   val iterator: java.util.Iterator = `$this$min`.iterator()
   if (!iterator.hasNext()) {
      throw NoSuchElementException()
   } else {
      var min: Double = (iterator.next() as java.lang.Number).doubleValue()

      while (iterator.hasNext()) {
         min = Math.min(min, (iterator.next() as java.lang.Number).doubleValue())
      }

      return min
   }
}

public operator fun <T> Sequence<Any>.minus(elements: Iterable<Any>): Sequence<Any> {
   return    // $VF: Compiled from _Sequences.kt
object : Sequence<Any> {
      public override operator fun iterator(): Iterator<Any> {
         val other: java.util.Collection = CollectionsKt.convertToListIfNotCollection(elements)
         return if (other.isEmpty()) $this$minus.iterator() else SequencesKt.<T>filterNot($this$minus,          // $VF: Compiled from _Sequences.kt
{ it: Any ->
            return other.contains(it)
         } as (T?) -> java.lang.Boolean).iterator()
      }
   }
}

@SinceKotlin(version = "1.4")
public fun Sequence<Double>.maxOrNull(): Double? {
   val iterator: java.util.Iterator = `$this$maxOrNull`.iterator()
   if (!iterator.hasNext()) {
      return null
   } else {
      var max: Double = (iterator.next() as java.lang.Number).doubleValue()

      while (iterator.hasNext()) {
         max = Math.max(max, (iterator.next() as java.lang.Number).doubleValue())
      }

      return max
   }
}

@InlineOnly
@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
public inline fun <T> Sequence<Any>.minOf(selector: (Any) -> Float): Float {
   val iterator: java.util.Iterator = `$this$minOf`.iterator()
   if (!iterator.hasNext()) {
      throw NoSuchElementException()
   } else {
      var minValue: Float = (selector(iterator.next()) as java.lang.Number).floatValue()

      while (iterator.hasNext()) {
         minValue = Math.min(minValue, (selector(iterator.next()) as java.lang.Number).floatValue())
      }

      return minValue
   }
}

@InlineOnly
public inline fun <T> Sequence<Any>.minusElement(element: Any): Sequence<Any> {
   return (Sequence<T>)SequencesKt.minus(`$this$minusElement`, (Object)element)
}

public fun <T> Sequence<Any>.toList(): List<Any> {
   val it: java.util.Iterator = `$this$toList`.iterator()
   if (!it.hasNext()) {
      return CollectionsKt.emptyList()
   } else {
      val element: Any = it.next()
      if (!it.hasNext()) {
         return (java.util.List<T>)CollectionsKt.listOf(element)
      } else {
         val dst: ArrayList = ArrayList()
         dst.add(element)

         while (it.hasNext()) {
            dst.add(it.next())
         }

         return dst
      }
   }
}

@InlineOnly
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
public inline fun <T, R> Sequence<Any>.maxOfWithOrNull(comparator: Comparator<in Any>, selector: (Any) -> Any): Any? {
   val iterator: java.util.Iterator = `$this$maxOfWithOrNull`.iterator()
   if (!iterator.hasNext()) {
      return null
   } else {
      var maxValue: Any = selector(iterator.next())

      while (iterator.hasNext()) {
         val v: Any = selector(iterator.next())
         if (comparator.compare(maxValue, v) < 0) {
            maxValue = v
         }
      }

      return (R)maxValue
   }
}

@InlineOnly
public inline fun <T> Sequence<Any>.plusElement(element: Any): Sequence<Any> {
   return (Sequence<T>)SequencesKt.plus(`$this$plusElement`, (Object)element)
}

public inline fun <T, R : Any, C : MutableCollection<in Any>> Sequence<Any>.mapNotNullTo(destination: Any, transform: (Any) -> Any?): Any {
   for (`element$iv` in `$this$mapNotNullTo`) {
      val var10000: Any = transform(`element$iv`)
      if (var10000 != null) {
         destination.add(var10000)
      }
   }

   return (C)destination
}

public operator fun <T> Sequence<Any>.minus(element: Any): Sequence<Any> {
   return    // $VF: Compiled from _Sequences.kt
object : Sequence<Any> {
      public override operator fun iterator(): Iterator<Any> {
         val removed: Ref.BooleanRef = Ref.BooleanRef()
         return SequencesKt.<T>filter($this$minus,          // $VF: Compiled from _Sequences.kt
{ it: Any ->
            val var10000: Boolean
            if (!removed.element && it == element) {
               removed.element = true
               var10000 = false
            } else {
               var10000 = true
            }

            return var10000
         } as (T?) -> java.lang.Boolean).iterator()
      }
   }
}

public operator fun <T> Sequence<Any>.contains(element: Any): Boolean {
   return SequencesKt.indexOf(`$this$contains`, element) >= 0
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.4")
public inline fun <S, T : Any> Sequence<Any>.reduceOrNull(operation: (Any, Any) -> Any): Any? {
   val iterator: java.util.Iterator = `$this$reduceOrNull`.iterator()
   if (!iterator.hasNext()) {
      return null
   } else {
      var accumulator: Any = iterator.next()

      while (iterator.hasNext()) {
         accumulator = operation(accumulator, iterator.next())
      }

      return (S)accumulator
   }
}

@SinceKotlin(version = "1.4")
public inline fun <S, T : Any> Sequence<Any>.reduceIndexedOrNull(operation: (Int, Any, Any) -> Any): Any? {
   val iterator: java.util.Iterator = `$this$reduceIndexedOrNull`.iterator()
   if (!iterator.hasNext()) {
      return null
   } else {
      var index: Int = 1
      var accumulator: Any = iterator.next()

      while (iterator.hasNext()) {
         val var6: Int = index++
         if (var6 < 0) {
            if (!PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
               throw ArithmeticException("Index overflow has happened.")
            }

            CollectionsKt.throwIndexOverflow()
         }

         accumulator = operation(var6, accumulator, iterator.next())
      }

      return (S)accumulator
   }
}

public fun <T> Sequence<Any>.take(n: Int): Sequence<Any> {
   if (n < 0) {
      throw IllegalArgumentException(("Requested element count $n is less than zero.").toString())
   } else {
      return if (n == 0)
         SequencesKt.emptySequence()
         else
         (if (`$this$take` is DropTakeSequence) (`$this$take` as DropTakeSequence).take(n) else TakeSequence(`$this$take`, n))
      }
}

public fun <T, C : MutableCollection<in Any>> Sequence<Any>.toCollection(destination: Any): Any {
   for (item in `$this$toCollection`) {
      destination.add(item)
   }

   return (C)destination
}

@SinceKotlin(version = "1.4")
public fun <S, T : Any> Sequence<Any>.runningReduceIndexed(operation: (Int, Any, Any) -> Any): Sequence<Any> {
   return SequencesKt.sequence(   // $VF: Compiled from _Sequences.kt
{
      // $VF: Could not decompile lambda - root function was not found. Is this a suspend lambda?
   } as Function2)
}

@JvmName(name = "flatMapIndexedIterableTo")
@InlineOnly
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
public inline fun <T, R, C : MutableCollection<in Any>> Sequence<Any>.flatMapIndexedTo(destination: Any, transform: (Int, Any) -> Iterable<Any>): Any {
   var index: Int = 0

   for (element in `$this$flatMapIndexedTo`) {
      val var7: Int = index++
      if (var7 < 0) {
         if (!PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
            throw ArithmeticException("Index overflow has happened.")
         }

         CollectionsKt.throwIndexOverflow()
      }

      CollectionsKt.addAll(destination, transform(var7, element) as java.lang.Iterable)
   }

   return (C)destination
}

@SinceKotlin(version = "1.2")
public fun <T, R> Sequence<Any>.windowed(size: Int, step: Int = 1, partialWindows: Boolean = false, transform: (List<Any>) -> Any): Sequence<Any> {
   return SequencesKt.map(SlidingWindowKt.windowedSequence(`$this$windowed`, size, step, partialWindows, true), transform)
}

public inline fun <T> Sequence<Any>.last(predicate: (Any) -> Boolean): Any {
   var last: Any = null
   var found: Boolean = false

   for (element in `$this$last`) {
      if (predicate(element) as java.lang.Boolean) {
         last = element
         found = true
      }
   }

   if (!found) {
      throw NoSuchElementException("Sequence contains no element matching the predicate.")
   } else {
      return (T)last
   }
}

@SinceKotlin(version = "1.4")
@JvmName(name = "flatMapIndexedIterable")
@OverloadResolutionByLambdaReturnType
public fun <T, R> Sequence<Any>.flatMapIndexed(transform: (Int, Any) -> Iterable<Any>): Sequence<Any> {
   return SequencesKt.flatMapIndexed(`$this$flatMapIndexed`, transform, <unrepresentable>.INSTANCE)
}

@JvmName(name = "sumOfInt")
@OverloadResolutionByLambdaReturnType
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun <T> Sequence<Any>.sumOf(selector: (Any) -> Int): Int {
   var sum: Int = 0

   for (element in `$this$sumOf`) {
      sum += (selector(element) as java.lang.Number).intValue()
   }

   return sum
}

public operator fun <T> Sequence<Any>.minus(elements: Sequence<Any>): Sequence<Any> {
   return    // $VF: Compiled from _Sequences.kt
object : Sequence<Any> {
      public override operator fun iterator(): Iterator<Any> {
         val other: java.util.List = SequencesKt.toList(elements)
         return if (other.isEmpty()) $this$minus.iterator() else SequencesKt.<T>filterNot($this$minus,          // $VF: Compiled from _Sequences.kt
{ it: Any ->
            return other.contains(it)
         } as (T?) -> java.lang.Boolean).iterator()
      }
   }
}

@SinceKotlin(version = "1.2")
public fun <T, R> Sequence<Any>.zipWithNext(transform: (Any, Any) -> Any): Sequence<Any> {
   return SequencesKt.sequence(   // $VF: Compiled from _Sequences.kt
{
      // $VF: Could not decompile lambda - root function was not found. Is this a suspend lambda?
   } as Function2)
}

@SinceKotlin(version = "1.4")
public inline fun <T, R : Comparable<Any>> Sequence<Any>.maxByOrNull(selector: (Any) -> Any): Any? {
   val iterator: java.util.Iterator = `$this$maxByOrNull`.iterator()
   if (!iterator.hasNext()) {
      return null
   } else {
      var maxElem: Any = iterator.next()
      if (!iterator.hasNext()) {
         return (T)maxElem
      } else {
         var maxValue: java.lang.Comparable = selector(maxElem) as java.lang.Comparable

         do {
            val e: Any = iterator.next()
            val v: java.lang.Comparable = selector(e) as java.lang.Comparable
            if (maxValue.compareTo(v) < 0) {
               maxElem = e
               maxValue = v
            }
         } while (iterator.hasNext())

         return (T)maxElem
      }
   }
}

public fun <T> Sequence<Any>.firstOrNull(): Any? {
   val iterator: java.util.Iterator = `$this$firstOrNull`.iterator()
   return (T)(if (!iterator.hasNext()) null else iterator.next())
}

public inline fun <T, C : MutableCollection<in Any>> Sequence<Any>.filterTo(destination: Any, predicate: (Any) -> Boolean): Any {
   for (element in `$this$filterTo`) {
      if (predicate(element) as java.lang.Boolean) {
         destination.add(element)
      }
   }

   return (C)destination
}

public fun <T : Comparable<Any>> Sequence<Any>.sortedDescending(): Sequence<Any> {
   return SequencesKt.sortedWith(`$this$sortedDescending`, ComparisonsKt.reverseOrder())
}

public fun <T, R, V> Sequence<Any>.zip(other: Sequence<Any>, transform: (Any, Any) -> Any): Sequence<Any> {
   return MergingSequence(`$this$zip`, other, transform)
}

@SinceKotlin(version = "1.2")
public fun <T> Sequence<Any>.chunked(size: Int): Sequence<List<Any>> {
   return SequencesKt.windowed(`$this$chunked`, size, size, true)
}

public fun <T> Sequence<Any>.any(): Boolean {
   return `$this$any`.iterator().hasNext()
}

public inline fun <S, T : Any> Sequence<Any>.reduce(operation: (Any, Any) -> Any): Any {
   val iterator: java.util.Iterator = `$this$reduce`.iterator()
   if (!iterator.hasNext()) {
      throw UnsupportedOperationException("Empty sequence can't be reduced.")
   } else {
      var accumulator: Any = iterator.next()

      while (iterator.hasNext()) {
         accumulator = operation(accumulator, iterator.next())
      }

      return (S)accumulator
   }
}

public operator fun <T> Sequence<Any>.plus(elements: Sequence<Any>): Sequence<Any> {
   return SequencesKt.flatten(SequencesKt.sequenceOf(`$this$plus`, elements))
}

@JvmName(name = "flatMapIterable")
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
public fun <T, R> Sequence<Any>.flatMap(transform: (Any) -> Iterable<Any>): Sequence<Any> {
   return FlatteningSequence<>(`$this$flatMap`, transform, <unrepresentable>.INSTANCE)
}

@SinceKotlin(version = "1.5")
@InlineOnly
public inline fun <T, R : Any> Sequence<Any>.firstNotNullOf(transform: (Any) -> Any?): Any {
   val var2: java.util.Iterator = `$this$firstNotNullOf`.iterator()

   var var10000: Any
   do {
      if (!var2.hasNext()) {
         var10000 = null
         break
      }

      var10000 = transform(var2.next())
   } while (var10000 == null)

   if (var10000 == null) {
      throw NoSuchElementException("No element of the sequence was transformed to a non-null value.")
   } else {
      return (R)var10000
   }
}

@JvmName(name = "averageOfShort")
public fun Sequence<Short>.average(): Double {
   var sum: Double = 0.0
   val count: Int = 0
   val var4: java.util.Iterator = `$this$average`.iterator()

   while (var4.hasNext()) {
      sum += (var4.next() as java.lang.Number).shortValue()
      if (++count < 0) {
         CollectionsKt.throwCountOverflow()
      }
   }

   return if (count == 0) java.lang.Double.NaN else sum / count
}

public inline fun <T> Sequence<Any>.singleOrNull(predicate: (Any) -> Boolean): Any? {
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

public inline fun <T> Sequence<Any>.single(predicate: (Any) -> Boolean): Any {
   var single: Any = null
   var found: Boolean = false

   for (element in `$this$single`) {
      if (predicate(element) as java.lang.Boolean) {
         if (found) {
            throw IllegalArgumentException("Sequence contains more than one matching element.")
         }

         single = element
         found = true
      }
   }

   if (!found) {
      throw NoSuchElementException("Sequence contains no element matching the predicate.")
   } else {
      return (T)single
   }
}

public fun <T> Sequence<Any>.elementAtOrElse(index: Int, defaultValue: (Int) -> Any): Any {
   if (index < 0) {
      return (T)defaultValue(index)
   } else {
      val iterator: java.util.Iterator = `$this$elementAtOrElse`.iterator()
      val count: Int = 0

      while (iterator.hasNext()) {
         val element: Any = iterator.next()
         if (index == count++) {
            return (T)element
         }
      }

      return (T)defaultValue(index)
   }
}

@SinceKotlin(version = "1.7")
@JvmName(name = "maxOrThrow")
public fun Sequence<Float>.max(): Float {
   val iterator: java.util.Iterator = `$this$max`.iterator()
   if (!iterator.hasNext()) {
      throw NoSuchElementException()
   } else {
      var max: Float = (iterator.next() as java.lang.Number).floatValue()

      while (iterator.hasNext()) {
         max = Math.max(max, (iterator.next() as java.lang.Number).floatValue())
      }

      return max
   }
}

@DeprecatedSinceKotlin(warningSince = "1.5")
@Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = []))
public inline fun <T> Sequence<Any>.sumByDouble(selector: (Any) -> Double): Double {
   var sum: Double = 0.0

   for (element in `$this$sumByDouble`) {
      sum += (selector(element) as java.lang.Number).doubleValue()
   }

   return sum
}

@OverloadResolutionByLambdaReturnType
@InlineOnly
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@SinceKotlin(version = "1.5")
@JvmName(name = "sumOfUInt")
public inline fun <T> Sequence<Any>.sumOf(selector: (Any) -> UInt): UInt {
   var sum: Int = UInt.constructor_impl/* $VF was: constructor-impl */(0)

   for (element in `$this$sumOf`) {
      sum = UInt.constructor_impl/* $VF was: constructor-impl */(sum + (selector(element) as UInt).unbox_impl/* $VF was: unbox-impl */())
   }

   return sum
}

@SinceKotlin(version = "1.4")
public fun <T, R> Sequence<Any>.runningFoldIndexed(initial: Any, operation: (Int, Any, Any) -> Any): Sequence<Any> {
   return SequencesKt.sequence(   // $VF: Compiled from _Sequences.kt
{
      // $VF: Could not decompile lambda - root function was not found. Is this a suspend lambda?
   } as Function2)
}

public inline fun <T, K, V> Sequence<Any>.groupBy(keySelector: (Any) -> Any, valueTransform: (Any) -> Any): Map<Any, List<Any>> {
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

      (var10000 as java.util.List).add(valueTransform(`element$iv`))
   }

   return `destination$iv`
}

public fun <T, R : Any> Sequence<Any>.mapIndexedNotNull(transform: (Int, Any) -> Any?): Sequence<Any> {
   return SequencesKt.filterNotNull(TransformingIndexedSequence(`$this$mapIndexedNotNull`, transform))
}

@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public fun <S, T : Any> Sequence<Any>.runningReduce(operation: (Any, Any) -> Any): Sequence<Any> {
   return SequencesKt.sequence(   // $VF: Compiled from _Sequences.kt
{
      // $VF: Could not decompile lambda - root function was not found. Is this a suspend lambda?
   } as Function2)
}

public inline fun <T, K> Sequence<Any>.groupBy(keySelector: (Any) -> Any): Map<Any, List<Any>> {
   val `destination$iv`: java.util.Map = LinkedHashMap()

   for (`element$iv` in `$this$groupBy`) {
      val `key$iv`: Any = keySelector(`element$iv`)
      val `value$iv$iv`: Any = `destination$iv`.get(`key$iv`)
      val var10000: Any
      if (`value$iv$iv` == null) {
         val var14: java.util.List = ArrayList()
         `destination$iv`.put(`key$iv`, var14)
         var10000 = var14
      } else {
         var10000 = `value$iv$iv`
      }

      (var10000 as java.util.List).add(`element$iv`)
   }

   return `destination$iv`
}

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@InlineOnly
@JvmName(name = "sumOfDouble")
public inline fun <T> Sequence<Any>.sumOf(selector: (Any) -> Double): Double {
   var sum: Double = 0.0

   for (element in `$this$sumOf`) {
      sum += (selector(element) as java.lang.Number).doubleValue()
   }

   return sum
}

@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public fun <T, R> Sequence<Any>.scanIndexed(initial: Any, operation: (Int, Any, Any) -> Any): Sequence<Any> {
   return (Sequence<R>)SequencesKt.runningFoldIndexed(`$this$scanIndexed`, initial, operation)
}

public fun <T> Sequence<Any>.first(): Any {
   val iterator: java.util.Iterator = `$this$first`.iterator()
   if (!iterator.hasNext()) {
      throw NoSuchElementException("Sequence is empty.")
   } else {
      return (T)iterator.next()
   }
}

public inline fun <T, K, V> Sequence<Any>.associateBy(keySelector: (Any) -> Any, valueTransform: (Any) -> Any): Map<Any, Any> {
   val `destination$iv`: java.util.Map = LinkedHashMap()

   for (`element$iv` in `$this$associateBy`) {
      `destination$iv`.put(keySelector(`element$iv`), valueTransform(`element$iv`))
   }

   return `destination$iv`
}

public fun <T> Sequence<Any>.dropWhile(predicate: (Any) -> Boolean): Sequence<Any> {
   return DropWhileSequence(`$this$dropWhile`, predicate)
}

public inline fun <T, C : MutableCollection<in Any>> Sequence<Any>.filterIndexedTo(destination: Any, predicate: (Int, Any) -> Boolean): Any {
   var `index$iv`: Int = 0

   for (`item$iv` in `$this$filterIndexedTo`) {
      val var9: Int = `index$iv`++
      if (var9 < 0) {
         if (!PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
            throw ArithmeticException("Index overflow has happened.")
         }

         CollectionsKt.throwIndexOverflow()
      }

      if (predicate(var9, `item$iv`) as java.lang.Boolean) {
         destination.add(`item$iv`)
      }
   }

   return (C)destination
}

public fun <T> Sequence<Any>.filterNot(predicate: (Any) -> Boolean): Sequence<Any> {
   return FilteringSequence(`$this$filterNot`, false, predicate)
}

@JvmName(name = "sumOfLong")
public fun Sequence<Long>.sum(): Long {
   var sum: Long = 0L
   val var3: java.util.Iterator = `$this$sum`.iterator()

   while (var3.hasNext()) {
      sum += (var3.next() as java.lang.Number).longValue()
   }

   return sum
}

@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
@JvmName(name = "flatMapIterableTo")
public inline fun <T, R, C : MutableCollection<in Any>> Sequence<Any>.flatMapTo(destination: Any, transform: (Any) -> Iterable<Any>): Any {
   for (element in `$this$flatMapTo`) {
      CollectionsKt.addAll(destination, transform(element) as java.lang.Iterable)
   }

   return (C)destination
}

public fun <T> Sequence<Any>.withIndex(): Sequence<IndexedValue<Any>> {
   return IndexingSequence(`$this$withIndex`)
}

public inline fun <T> Sequence<Any>.firstOrNull(predicate: (Any) -> Boolean): Any? {
   for (element in `$this$firstOrNull`) {
      if (predicate(element) as java.lang.Boolean) {
         return (T)element
      }
   }

   return null
}

@InlineOnly
@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
@JvmName(name = "flatMapIndexedSequenceTo")
public inline fun <T, R, C : MutableCollection<in Any>> Sequence<Any>.flatMapIndexedTo(destination: Any, transform: (Int, Any) -> Sequence<Any>): Any {
   var index: Int = 0

   for (element in `$this$flatMapIndexedTo`) {
      val var7: Int = index++
      if (var7 < 0) {
         if (!PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
            throw ArithmeticException("Index overflow has happened.")
         }

         CollectionsKt.throwIndexOverflow()
      }

      CollectionsKt.addAll(destination, transform(var7, element) as Sequence)
   }

   return (C)destination
}

@InlineOnly
@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
public inline fun <T> Sequence<Any>.maxOf(selector: (Any) -> Double): Double {
   val iterator: java.util.Iterator = `$this$maxOf`.iterator()
   if (!iterator.hasNext()) {
      throw NoSuchElementException()
   } else {
      var maxValue: Double = (selector(iterator.next()) as java.lang.Number).doubleValue()

      while (iterator.hasNext()) {
         maxValue = Math.max(maxValue, (selector(iterator.next()) as java.lang.Number).doubleValue())
      }

      return maxValue
   }
}

@JvmName(name = "minOrThrow")
@SinceKotlin(version = "1.7")
public fun <T : Comparable<Any>> Sequence<Any>.min(): Any {
   val iterator: java.util.Iterator = `$this$min`.iterator()
   if (!iterator.hasNext()) {
      throw NoSuchElementException()
   } else {
      var min: java.lang.Comparable = iterator.next() as java.lang.Comparable

      while (iterator.hasNext()) {
         val e: java.lang.Comparable = iterator.next() as java.lang.Comparable
         if (min.compareTo(e) > 0) {
            min = e
         }
      }

      return (T)min
   }
}

@JvmName(name = "averageOfDouble")
public fun Sequence<Double>.average(): Double {
   var sum: Double = 0.0
   val count: Int = 0
   val var4: java.util.Iterator = `$this$average`.iterator()

   while (var4.hasNext()) {
      sum += (var4.next() as java.lang.Number).doubleValue()
      if (++count < 0) {
         CollectionsKt.throwCountOverflow()
      }
   }

   return if (count == 0) java.lang.Double.NaN else sum / count
}

@SinceKotlin(version = "1.4")
@InlineOnly
@OverloadResolutionByLambdaReturnType
public inline fun <T, R : Comparable<Any>> Sequence<Any>.maxOfOrNull(selector: (Any) -> Any): Any? {
   val iterator: java.util.Iterator = `$this$maxOfOrNull`.iterator()
   if (!iterator.hasNext()) {
      return null
   } else {
      var maxValue: java.lang.Comparable = selector(iterator.next()) as java.lang.Comparable

      while (iterator.hasNext()) {
         val v: java.lang.Comparable = selector(iterator.next()) as java.lang.Comparable
         if (maxValue.compareTo(v) < 0) {
            maxValue = v
         }
      }

      return (R)maxValue
   }
}

public fun <T> Sequence<Any>.toMutableSet(): MutableSet<Any> {
   val set: LinkedHashSet = LinkedHashSet()

   for (item in `$this$toMutableSet`) {
      set.add(item)
   }

   return set
}

public fun <T> Sequence<Any>.toSet(): Set<Any> {
   val it: java.util.Iterator = `$this$toSet`.iterator()
   if (!it.hasNext()) {
      return SetsKt.emptySet()
   } else {
      val element: Any = it.next()
      if (!it.hasNext()) {
         return (java.util.Set<T>)SetsKt.setOf(element)
      } else {
         val dst: LinkedHashSet = LinkedHashSet()
         dst.add(element)

         while (it.hasNext()) {
            dst.add(it.next())
         }

         return dst
      }
   }
}

public fun <T> Sequence<Any>.sortedWith(comparator: Comparator<in Any>): Sequence<Any> {
   return    // $VF: Compiled from _Sequences.kt
object : Sequence<Any> {
      public override operator fun iterator(): Iterator<Any> {
         val sortedList: java.util.List = SequencesKt.toMutableList($this$sortedWith)
         CollectionsKt.sortWith(sortedList, comparator)
         return sortedList.iterator()
      }
   }
}

@SinceKotlin(version = "1.3")
public inline fun <K, V> Sequence<Any>.associateWith(valueSelector: (Any) -> Any): Map<Any, Any> {
   val result: LinkedHashMap = LinkedHashMap()

   for (`element$iv` in `$this$associateWith`) {
      result.put(`element$iv`, valueSelector(`element$iv`))
   }

   return result
}

@JvmName(name = "averageOfLong")
public fun Sequence<Long>.average(): Double {
   var sum: Double = 0.0
   val count: Int = 0
   val var4: java.util.Iterator = `$this$average`.iterator()

   while (var4.hasNext()) {
      sum += (var4.next() as java.lang.Number).longValue()
      if (++count < 0) {
         CollectionsKt.throwCountOverflow()
      }
   }

   return if (count == 0) java.lang.Double.NaN else sum / count
}

@SinceKotlin(version = "1.3")
public inline fun <K, V, M : MutableMap<in Any, in Any>> Sequence<Any>.associateWithTo(destination: Any, valueSelector: (Any) -> Any): Any {
   for (element in `$this$associateWithTo`) {
      destination.put(element, valueSelector(element))
   }

   return (M)destination
}

open fun SequencesKt___SequencesKt() {
}

@OverloadResolutionByLambdaReturnType
@JvmName(name = "sumOfLong")
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun <T> Sequence<Any>.sumOf(selector: (Any) -> Long): Long {
   var sum: Long = 0L

   for (element in `$this$sumOf`) {
      sum += (selector(element) as java.lang.Number).longValue()
   }

   return sum
}

public fun <T> Sequence<Any>.lastOrNull(): Any? {
   val iterator: java.util.Iterator = `$this$lastOrNull`.iterator()
   if (!iterator.hasNext()) {
      return null
   } else {
      var last: Any = iterator.next()

      while (iterator.hasNext()) {
         last = iterator.next()
      }

      return (T)last
   }
}

@InlineOnly
public inline fun <T> Sequence<Any>.find(predicate: (Any) -> Boolean): Any? {
   val var4: java.util.Iterator = `$this$find`.iterator()

   var var10000: Any
   while (true) {
      if (var4.hasNext()) {
         val `element$iv`: Any = var4.next()
         if (!predicate(`element$iv`) as java.lang.Boolean) {
            continue
         }

         var10000 = `element$iv`
         break
      }

      var10000 = null
      break
   }

   return (T)var10000
}

@SinceKotlin(version = "1.4")
public fun <T : Comparable<Any>> Sequence<Any>.maxOrNull(): Any? {
   val iterator: java.util.Iterator = `$this$maxOrNull`.iterator()
   if (!iterator.hasNext()) {
      return null
   } else {
      var max: java.lang.Comparable = iterator.next() as java.lang.Comparable

      while (iterator.hasNext()) {
         val e: java.lang.Comparable = iterator.next() as java.lang.Comparable
         if (max.compareTo(e) < 0) {
            max = e
         }
      }

      return (T)max
   }
}

@JvmName(name = "sumOfFloat")
public fun Sequence<Float>.sum(): Float {
   var sum: Float = 0.0F
   val var2: java.util.Iterator = `$this$sum`.iterator()

   while (var2.hasNext()) {
      sum += (var2.next() as java.lang.Number).floatValue()
   }

   return sum
}

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@JvmName(name = "flatMapIndexedSequence")
public fun <T, R> Sequence<Any>.flatMapIndexed(transform: (Int, Any) -> Sequence<Any>): Sequence<Any> {
   return SequencesKt.flatMapIndexed(`$this$flatMapIndexed`, transform, <unrepresentable>.INSTANCE)
}

@SinceKotlin(version = "1.2")
public fun <T> Sequence<Any>.zipWithNext(): Sequence<Pair<Any, Any>> {
   return SequencesKt.zipWithNext(`$this$zipWithNext`, { a, b ->
      a to b
   })
}

@SinceKotlin(version = "1.1")
public fun <T> Sequence<Any>.onEach(action: (Any) -> Unit): Sequence<Any> {
   return SequencesKt.map(`$this$onEach`,    // $VF: Compiled from _Sequences.kt
{ it: Any ->
      action(it)
      return (T)it
   } as Function1)
}

public fun <T> Sequence<Any>.distinct(): Sequence<Any> {
   return SequencesKt.distinctBy(`$this$distinct`, { it ->
      it
   })
}

@SinceKotlin(version = "1.1")
public inline fun <T, K> Sequence<Any>.groupingBy(crossinline keySelector: (Any) -> Any): Grouping<Any, Any> {
   return    // $VF: Compiled from _Sequences.kt
object : Grouping<Any, Any> {
      public override fun keyOf(element: Any): Any {
         return (K)keySelector(element)
      }

      public override fun sourceIterator(): Iterator<Any> {
         return $this$groupingBy.iterator()
      }
   }
}

public fun <T : Any> Sequence<Any?>.filterNotNull(): Sequence<Any> {
   val var10000: Sequence = SequencesKt.filterNot(`$this$filterNotNull`, { it ->
      it == null
   })
   return var10000
}

public fun <T> Sequence<Any>.indexOf(element: Any): Int {
   var index: Int = 0

   for (item in `$this$indexOf`) {
      if (index < 0) {
         CollectionsKt.throwIndexOverflow()
      }

      if (element == item) {
         return index
      }

      index++
   }

   return -1
}

public fun <T> Sequence<Any>.last(): Any {
   val iterator: java.util.Iterator = `$this$last`.iterator()
   if (!iterator.hasNext()) {
      throw NoSuchElementException("Sequence is empty.")
   } else {
      var last: Any = iterator.next()

      while (iterator.hasNext()) {
         last = iterator.next()
      }

      return (T)last
   }
}

@SinceKotlin(version = "1.4")
public fun Sequence<Float>.minOrNull(): Float? {
   val iterator: java.util.Iterator = `$this$minOrNull`.iterator()
   if (!iterator.hasNext()) {
      return null
   } else {
      var min: Float = (iterator.next() as java.lang.Number).floatValue()

      while (iterator.hasNext()) {
         min = Math.min(min, (iterator.next() as java.lang.Number).floatValue())
      }

      return min
   }
}

@InlineOnly
@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
public inline fun <T, R> Sequence<Any>.maxOfWith(comparator: Comparator<in Any>, selector: (Any) -> Any): Any {
   val iterator: java.util.Iterator = `$this$maxOfWith`.iterator()
   if (!iterator.hasNext()) {
      throw NoSuchElementException()
   } else {
      var maxValue: Any = selector(iterator.next())

      while (iterator.hasNext()) {
         val v: Any = selector(iterator.next())
         if (comparator.compare(maxValue, v) < 0) {
            maxValue = v
         }
      }

      return (R)maxValue
   }
}

public inline fun <T, R : Any, C : MutableCollection<in Any>> Sequence<Any>.mapIndexedNotNullTo(destination: Any, transform: (Int, Any) -> Any?): Any {
   var `index$iv`: Int = 0

   for (`item$iv` in `$this$mapIndexedNotNullTo`) {
      val var9: Int = `index$iv`++
      if (var9 < 0) {
         if (!PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
            throw ArithmeticException("Index overflow has happened.")
         }

         CollectionsKt.throwIndexOverflow()
      }

      val var16: Any = transform(var9, `item$iv`)
      if (var16 != null) {
         destination.add(var16)
      }
   }

   return (C)destination
}

@JvmName(name = "sumOfInt")
public fun Sequence<Int>.sum(): Int {
   var sum: Int = 0
   val var2: java.util.Iterator = `$this$sum`.iterator()

   while (var2.hasNext()) {
      sum += (var2.next() as java.lang.Number).intValue()
   }

   return sum
}

@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
@InlineOnly
public inline fun <T> Sequence<Any>.maxOfOrNull(selector: (Any) -> Float): Float? {
   val iterator: java.util.Iterator = `$this$maxOfOrNull`.iterator()
   if (!iterator.hasNext()) {
      return null
   } else {
      var maxValue: Float = (selector(iterator.next()) as java.lang.Number).floatValue()

      while (iterator.hasNext()) {
         maxValue = Math.max(maxValue, (selector(iterator.next()) as java.lang.Number).floatValue())
      }

      return maxValue
   }
}

@SinceKotlin(version = "1.7")
@JvmName(name = "minOrThrow")
public fun Sequence<Float>.min(): Float {
   val iterator: java.util.Iterator = `$this$min`.iterator()
   if (!iterator.hasNext()) {
      throw NoSuchElementException()
   } else {
      var min: Float = (iterator.next() as java.lang.Number).floatValue()

      while (iterator.hasNext()) {
         min = Math.min(min, (iterator.next() as java.lang.Number).floatValue())
      }

      return min
   }
}

@InlineOnly
public inline fun <T> Sequence<Any>.asSequence(): Sequence<Any> {
   return `$this$asSequence`
}

public inline fun <T> Sequence<Any>.any(predicate: (Any) -> Boolean): Boolean {
   for (element in `$this$any`) {
      if (predicate(element) as java.lang.Boolean) {
         return true
      }
   }

   return false
}

@OverloadResolutionByLambdaReturnType
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun <T, R : Comparable<Any>> Sequence<Any>.maxOf(selector: (Any) -> Any): Any {
   val iterator: java.util.Iterator = `$this$maxOf`.iterator()
   if (!iterator.hasNext()) {
      throw NoSuchElementException()
   } else {
      var maxValue: java.lang.Comparable = selector(iterator.next()) as java.lang.Comparable

      while (iterator.hasNext()) {
         val v: java.lang.Comparable = selector(iterator.next()) as java.lang.Comparable
         if (maxValue.compareTo(v) < 0) {
            maxValue = v
         }
      }

      return (R)maxValue
   }
}

public fun <T> Sequence<Any>.elementAtOrNull(index: Int): Any? {
   if (index < 0) {
      return null
   } else {
      val iterator: java.util.Iterator = `$this$elementAtOrNull`.iterator()
      val count: Int = 0

      while (iterator.hasNext()) {
         val element: Any = iterator.next()
         if (index == count++) {
            return (T)element
         }
      }

      return null
   }
}

@InlineOnly
public inline fun <T> Sequence<Any>.findLast(predicate: (Any) -> Boolean): Any? {
   var `last$iv`: Any = null

   for (`element$iv` in `$this$findLast`) {
      if (predicate(`element$iv`) as java.lang.Boolean) {
         `last$iv` = `element$iv`
      }
   }

   return (T)`last$iv`
}

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun <T, R : Comparable<Any>> Sequence<Any>.minOfOrNull(selector: (Any) -> Any): Any? {
   val iterator: java.util.Iterator = `$this$minOfOrNull`.iterator()
   if (!iterator.hasNext()) {
      return null
   } else {
      var minValue: java.lang.Comparable = selector(iterator.next()) as java.lang.Comparable

      while (iterator.hasNext()) {
         val v: java.lang.Comparable = selector(iterator.next()) as java.lang.Comparable
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
public inline fun <T> Sequence<Any>.minOfOrNull(selector: (Any) -> Double): Double? {
   val iterator: java.util.Iterator = `$this$minOfOrNull`.iterator()
   if (!iterator.hasNext()) {
      return null
   } else {
      var minValue: Double = (selector(iterator.next()) as java.lang.Number).doubleValue()

      while (iterator.hasNext()) {
         minValue = Math.min(minValue, (selector(iterator.next()) as java.lang.Number).doubleValue())
      }

      return minValue
   }
}

public inline fun <T, R, C : MutableCollection<in Any>> Sequence<Any>.flatMapTo(destination: Any, transform: (Any) -> Sequence<Any>): Any {
   for (element in `$this$flatMapTo`) {
      CollectionsKt.addAll(destination, transform(element) as Sequence)
   }

   return (C)destination
}

@JvmName(name = "maxWithOrThrow")
@SinceKotlin(version = "1.7")
public fun <T> Sequence<Any>.maxWith(comparator: Comparator<in Any>): Any {
   val iterator: java.util.Iterator = `$this$maxWith`.iterator()
   if (!iterator.hasNext()) {
      throw NoSuchElementException()
   } else {
      var max: Any = iterator.next()

      while (iterator.hasNext()) {
         val e: Any = iterator.next()
         if (comparator.compare(max, e) < 0) {
            max = e
         }
      }

      return (T)max
   }
}

public inline fun <S, T : Any> Sequence<Any>.reduceIndexed(operation: (Int, Any, Any) -> Any): Any {
   val iterator: java.util.Iterator = `$this$reduceIndexed`.iterator()
   if (!iterator.hasNext()) {
      throw UnsupportedOperationException("Empty sequence can't be reduced.")
   } else {
      var index: Int = 1
      var accumulator: Any = iterator.next()

      while (iterator.hasNext()) {
         val var6: Int = index++
         if (var6 < 0) {
            if (!PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
               throw ArithmeticException("Index overflow has happened.")
            }

            CollectionsKt.throwIndexOverflow()
         }

         accumulator = operation(var6, accumulator, iterator.next())
      }

      return (S)accumulator
   }
}

@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
@InlineOnly
public inline fun <T, R> Sequence<Any>.minOfWithOrNull(comparator: Comparator<in Any>, selector: (Any) -> Any): Any? {
   val iterator: java.util.Iterator = `$this$minOfWithOrNull`.iterator()
   if (!iterator.hasNext()) {
      return null
   } else {
      var minValue: Any = selector(iterator.next())

      while (iterator.hasNext()) {
         val v: Any = selector(iterator.next())
         if (comparator.compare(minValue, v) > 0) {
            minValue = v
         }
      }

      return (R)minValue
   }
}

@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
@InlineOnly
public inline fun <T> Sequence<Any>.minOfOrNull(selector: (Any) -> Float): Float? {
   val iterator: java.util.Iterator = `$this$minOfOrNull`.iterator()
   if (!iterator.hasNext()) {
      return null
   } else {
      var minValue: Float = (selector(iterator.next()) as java.lang.Number).floatValue()

      while (iterator.hasNext()) {
         minValue = Math.min(minValue, (selector(iterator.next()) as java.lang.Number).floatValue())
      }

      return minValue
   }
}

public fun <T : Any> Sequence<Any?>.requireNoNulls(): Sequence<Any> {
   return SequencesKt.map(`$this$requireNoNulls`,    // $VF: Compiled from _Sequences.kt
{ it: Any? ->
      if (it == null) {
         throw IllegalArgumentException("null element found in $$this$requireNoNulls.")
      } else {
         return (T)it
      }
   } as Function1)
}

@SinceKotlin(version = "1.4")
public fun <T> Sequence<Any>.onEachIndexed(action: (Int, Any) -> Unit): Sequence<Any> {
   return SequencesKt.mapIndexed(`$this$onEachIndexed`,    // $VF: Compiled from _Sequences.kt
{ index: Int, element: Any ->
      action(index, element)
      return (T)element
   } as Function2)
}

@JvmName(name = "sumOfDouble")
public fun Sequence<Double>.sum(): Double {
   var sum: Double = 0.0
   val var3: java.util.Iterator = `$this$sum`.iterator()

   while (var3.hasNext()) {
      sum += (var3.next() as java.lang.Number).doubleValue()
   }

   return sum
}

public fun <T> Sequence<Any>.takeWhile(predicate: (Any) -> Boolean): Sequence<Any> {
   return TakeWhileSequence(`$this$takeWhile`, predicate)
}

public inline fun <T, K, V> Sequence<Any>.associate(transform: (Any) -> Pair<Any, Any>): Map<Any, Any> {
   val `destination$iv`: java.util.Map = LinkedHashMap()

   for (`element$iv` in `$this$associate`) {
      val var9: Pair = transform(`element$iv`) as Pair
      `destination$iv`.put(var9.first, var9.second)
   }

   return `destination$iv`
}

public fun <T> Sequence<Any>.drop(n: Int): Sequence<Any> {
   if (n < 0) {
      throw IllegalArgumentException(("Requested element count $n is less than zero.").toString())
   } else {
      return if (n == 0)
         `$this$drop`
         else
         (if (`$this$drop` is DropTakeSequence) (`$this$drop` as DropTakeSequence).drop(n) else DropSequence(`$this$drop`, n))
      }
}

public inline fun <T> Sequence<Any>.partition(predicate: (Any) -> Boolean): Pair<List<Any>, List<Any>> {
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

public fun <T> Sequence<Any>.singleOrNull(): Any? {
   val iterator: java.util.Iterator = `$this$singleOrNull`.iterator()
   if (!iterator.hasNext()) {
      return null
   } else {
      return (T)(if (iterator.hasNext()) null else iterator.next())
   }
}

@SinceKotlin(version = "1.7")
@JvmName(name = "maxOrThrow")
public fun <T : Comparable<Any>> Sequence<Any>.max(): Any {
   val iterator: java.util.Iterator = `$this$max`.iterator()
   if (!iterator.hasNext()) {
      throw NoSuchElementException()
   } else {
      var max: java.lang.Comparable = iterator.next() as java.lang.Comparable

      while (iterator.hasNext()) {
         val e: java.lang.Comparable = iterator.next() as java.lang.Comparable
         if (max.compareTo(e) < 0) {
            max = e
         }
      }

      return (T)max
   }
}

public fun <T> Sequence<Any>.toMutableList(): MutableList<Any> {
   return SequencesKt.toCollection(`$this$toMutableList`, ArrayList()) as MutableList<T>
}

@JvmName(name = "maxByOrThrow")
@SinceKotlin(version = "1.7")
public inline fun <T, R : Comparable<Any>> Sequence<Any>.maxBy(selector: (Any) -> Any): Any {
   val iterator: java.util.Iterator = `$this$maxBy`.iterator()
   if (!iterator.hasNext()) {
      throw NoSuchElementException()
   } else {
      var maxElem: Any = iterator.next()
      if (!iterator.hasNext()) {
         return (T)maxElem
      } else {
         var maxValue: java.lang.Comparable = selector(maxElem) as java.lang.Comparable

         do {
            val e: Any = iterator.next()
            val v: java.lang.Comparable = selector(e) as java.lang.Comparable
            if (maxValue.compareTo(v) < 0) {
               maxElem = e
               maxValue = v
            }
         } while (iterator.hasNext())

         return (T)maxElem
      }
   }
}

public inline fun <T, K, V, M : MutableMap<in Any, MutableList<Any>>> Sequence<Any>.groupByTo(
   destination: Any,
   keySelector: (Any) -> Any,
   valueTransform: (Any) -> Any
): Any {
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

      (var10000 as java.util.List).add(valueTransform(element))
   }

   return (M)destination
}

public inline fun <T, R, C : MutableCollection<in Any>> Sequence<Any>.mapIndexedTo(destination: Any, transform: (Int, Any) -> Any): Any {
   var index: Int = 0

   for (item in `$this$mapIndexedTo`) {
      val var7: Int = index++
      if (var7 < 0) {
         if (!PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
            throw ArithmeticException("Index overflow has happened.")
         }

         CollectionsKt.throwIndexOverflow()
      }

      destination.add(transform(var7, item))
   }

   return (C)destination
}

public inline fun <T, R> Sequence<Any>.fold(initial: Any, operation: (Any, Any) -> Any): Any {
   var accumulator: Any = initial

   for (element in `$this$fold`) {
      accumulator = operation(accumulator, element)
   }

   return (R)accumulator
}

public fun <T> Sequence<Any>.single(): Any {
   val iterator: java.util.Iterator = `$this$single`.iterator()
   if (!iterator.hasNext()) {
      throw NoSuchElementException("Sequence is empty.")
   } else {
      val single: Any = iterator.next()
      if (iterator.hasNext()) {
         throw IllegalArgumentException("Sequence has more than one element.")
      } else {
         return (T)single
      }
   }
}

@SinceKotlin(version = "1.4")
public fun <T> Sequence<Any>.maxWithOrNull(comparator: Comparator<in Any>): Any? {
   val iterator: java.util.Iterator = `$this$maxWithOrNull`.iterator()
   if (!iterator.hasNext()) {
      return null
   } else {
      var max: Any = iterator.next()

      while (iterator.hasNext()) {
         val e: Any = iterator.next()
         if (comparator.compare(max, e) < 0) {
            max = e
         }
      }

      return (T)max
   }
}

@JvmName(name = "sumOfByte")
public fun Sequence<Byte>.sum(): Int {
   var sum: Byte = 0
   val var2: java.util.Iterator = `$this$sum`.iterator()

   while (var2.hasNext()) {
      sum += (var2.next() as java.lang.Number).byteValue()
   }

   return sum
}

@OverloadResolutionByLambdaReturnType
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@SinceKotlin(version = "1.5")
@JvmName(name = "sumOfULong")
@InlineOnly
public inline fun <T> Sequence<Any>.sumOf(selector: (Any) -> ULong): ULong {
   var sum: Long = ULong.constructor_impl/* $VF was: constructor-impl */(0L)

   for (element in `$this$sumOf`) {
      sum = ULong.constructor_impl/* $VF was: constructor-impl */(sum + (selector(element) as ULong).unbox_impl/* $VF was: unbox-impl */())
   }

   return sum
}

@JvmName(name = "averageOfFloat")
public fun Sequence<Float>.average(): Double {
   var sum: Double = 0.0
   val count: Int = 0
   val var4: java.util.Iterator = `$this$average`.iterator()

   while (var4.hasNext()) {
      sum += (var4.next() as java.lang.Number).floatValue()
      if (++count < 0) {
         CollectionsKt.throwCountOverflow()
      }
   }

   return if (count == 0) java.lang.Double.NaN else sum / count
}

public inline fun <T, R : Comparable<Any>> Sequence<Any>.sortedBy(crossinline selector: (Any) -> Any?): Sequence<Any> {
   return SequencesKt.sortedWith(`$this$sortedBy`,    // $VF: Compiled from Comparisons.kt
{ a: Any, b: Any ->
      val var3: Function1 = selector
      return ComparisonsKt.compareValues((T)(selector(a) as java.lang.Comparable), (T)(var3(b) as java.lang.Comparable))
   })
}

@SinceKotlin(version = "1.4")
public inline fun <T, R : Comparable<Any>> Sequence<Any>.minByOrNull(selector: (Any) -> Any): Any? {
   val iterator: java.util.Iterator = `$this$minByOrNull`.iterator()
   if (!iterator.hasNext()) {
      return null
   } else {
      var minElem: Any = iterator.next()
      if (!iterator.hasNext()) {
         return (T)minElem
      } else {
         var minValue: java.lang.Comparable = selector(minElem) as java.lang.Comparable

         do {
            val e: Any = iterator.next()
            val v: java.lang.Comparable = selector(e) as java.lang.Comparable
            if (minValue.compareTo(v) > 0) {
               minElem = e
               minValue = v
            }
         } while (iterator.hasNext())

         return (T)minElem
      }
   }
}

public inline fun <T, R : Comparable<Any>> Sequence<Any>.sortedByDescending(crossinline selector: (Any) -> Any?): Sequence<Any> {
   return SequencesKt.sortedWith(`$this$sortedByDescending`,    // $VF: Compiled from Comparisons.kt
{ a: Any, b: Any ->
      val var3: Function1 = selector
      return ComparisonsKt.compareValues((T)(selector(b) as java.lang.Comparable), (T)(var3(a) as java.lang.Comparable))
   })
}

public inline fun <T, K, M : MutableMap<in Any, MutableList<Any>>> Sequence<Any>.groupByTo(destination: Any, keySelector: (Any) -> Any): Any {
   for (element in `$this$groupByTo`) {
      val key: Any = keySelector(element)
      val `value$iv`: Any = destination.get(key)
      val var10000: Any
      if (`value$iv` == null) {
         val var12: java.util.List = ArrayList()
         destination.put(key, var12)
         var10000 = var12
      } else {
         var10000 = `value$iv`
      }

      (var10000 as java.util.List).add(element)
   }

   return (M)destination
}

public fun <T, R> Sequence<Any>.mapIndexed(transform: (Int, Any) -> Any): Sequence<Any> {
   return TransformingIndexedSequence(`$this$mapIndexed`, transform)
}

@SinceKotlin(version = "1.4")
public fun Sequence<Float>.maxOrNull(): Float? {
   val iterator: java.util.Iterator = `$this$maxOrNull`.iterator()
   if (!iterator.hasNext()) {
      return null
   } else {
      var max: Float = (iterator.next() as java.lang.Number).floatValue()

      while (iterator.hasNext()) {
         max = Math.max(max, (iterator.next() as java.lang.Number).floatValue())
      }

      return max
   }
}

@SinceKotlin(version = "1.2")
public fun <T> Sequence<Any>.windowed(size: Int, step: Int = 1, partialWindows: Boolean = false): Sequence<List<Any>> {
   return SlidingWindowKt.windowedSequence(`$this$windowed`, size, step, partialWindows, false)
}

public inline fun <T, R, C : MutableCollection<in Any>> Sequence<Any>.mapTo(destination: Any, transform: (Any) -> Any): Any {
   for (item in `$this$mapTo`) {
      destination.add(transform(item))
   }

   return (C)destination
}

@SinceKotlin(version = "1.4")
public fun Sequence<Double>.minOrNull(): Double? {
   val iterator: java.util.Iterator = `$this$minOrNull`.iterator()
   if (!iterator.hasNext()) {
      return null
   } else {
      var min: Double = (iterator.next() as java.lang.Number).doubleValue()

      while (iterator.hasNext()) {
         min = Math.min(min, (iterator.next() as java.lang.Number).doubleValue())
      }

      return min
   }
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.4")
public fun <T, R> Sequence<Any>.scan(initial: Any, operation: (Any, Any) -> Any): Sequence<Any> {
   return (Sequence<R>)SequencesKt.runningFold(`$this$scan`, initial, operation)
}

public fun <T> Sequence<Any>.count(): Int {
   val count: Int = 0

   for (element in `$this$count`) {
      if (++count < 0) {
         CollectionsKt.throwCountOverflow()
      }
   }

   return count
}

public inline fun <T> Sequence<Any>.forEach(action: (Any) -> Unit) {
   for (element in `$this$forEach`) {
      action(element)
   }
}

@DeprecatedSinceKotlin(warningSince = "1.5")
@Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = []))
public inline fun <T> Sequence<Any>.sumBy(selector: (Any) -> Int): Int {
   var sum: Int = 0

   for (element in `$this$sumBy`) {
      sum += (selector(element) as java.lang.Number).intValue()
   }

   return sum
}

public operator fun <T> Sequence<Any>.plus(elements: Iterable<Any>): Sequence<Any> {
   return SequencesKt.flatten(SequencesKt.sequenceOf(`$this$plus`, CollectionsKt.asSequence(elements)))
}

public inline fun <T> Sequence<Any>.first(predicate: (Any) -> Boolean): Any {
   for (element in `$this$first`) {
      if (predicate(element) as java.lang.Boolean) {
         return (T)element
      }
   }

   throw NoSuchElementException("Sequence contains no element matching the predicate.")
}

@JvmName(name = "averageOfInt")
public fun Sequence<Int>.average(): Double {
   var sum: Double = 0.0
   val count: Int = 0
   val var4: java.util.Iterator = `$this$average`.iterator()

   while (var4.hasNext()) {
      sum += (var4.next() as java.lang.Number).intValue()
      if (++count < 0) {
         CollectionsKt.throwCountOverflow()
      }
   }

   return if (count == 0) java.lang.Double.NaN else sum / count
}

public inline fun <T> Sequence<Any>.indexOfLast(predicate: (Any) -> Boolean): Int {
   var lastIndex: Int = -1
   var index: Int = 0

   for (item in `$this$indexOfLast`) {
      if (index < 0) {
         if (!PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
            throw ArithmeticException("Index overflow has happened.")
         }

         CollectionsKt.throwIndexOverflow()
      }

      if (predicate(item) as java.lang.Boolean) {
         lastIndex = index
      }

      index++
   }

   return lastIndex
}

public fun <C : MutableCollection<in Any>, T : Any> Sequence<Any?>.filterNotNullTo(destination: Any): Any {
   for (element in `$this$filterNotNullTo`) {
      if (element != null) {
         destination.add(element)
      }
   }

   return (C)destination
}

@SinceKotlin(version = "1.4")
@InlineOnly
@OverloadResolutionByLambdaReturnType
public inline fun <T> Sequence<Any>.maxOfOrNull(selector: (Any) -> Double): Double? {
   val iterator: java.util.Iterator = `$this$maxOfOrNull`.iterator()
   if (!iterator.hasNext()) {
      return null
   } else {
      var maxValue: Double = (selector(iterator.next()) as java.lang.Number).doubleValue()

      while (iterator.hasNext()) {
         maxValue = Math.max(maxValue, (selector(iterator.next()) as java.lang.Number).doubleValue())
      }

      return maxValue
   }
}

@InlineOnly
@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
public inline fun <T> Sequence<Any>.minOf(selector: (Any) -> Double): Double {
   val iterator: java.util.Iterator = `$this$minOf`.iterator()
   if (!iterator.hasNext()) {
      throw NoSuchElementException()
   } else {
      var minValue: Double = (selector(iterator.next()) as java.lang.Number).doubleValue()

      while (iterator.hasNext()) {
         minValue = Math.min(minValue, (selector(iterator.next()) as java.lang.Number).doubleValue())
      }

      return minValue
   }
}

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun <T, R : Comparable<Any>> Sequence<Any>.minOf(selector: (Any) -> Any): Any {
   val iterator: java.util.Iterator = `$this$minOf`.iterator()
   if (!iterator.hasNext()) {
      throw NoSuchElementException()
   } else {
      var minValue: java.lang.Comparable = selector(iterator.next()) as java.lang.Comparable

      while (iterator.hasNext()) {
         val v: java.lang.Comparable = selector(iterator.next()) as java.lang.Comparable
         if (minValue.compareTo(v) > 0) {
            minValue = v
         }
      }

      return (R)minValue
   }
}

@JvmName(name = "minWithOrThrow")
@SinceKotlin(version = "1.7")
public fun <T> Sequence<Any>.minWith(comparator: Comparator<in Any>): Any {
   val iterator: java.util.Iterator = `$this$minWith`.iterator()
   if (!iterator.hasNext()) {
      throw NoSuchElementException()
   } else {
      var min: Any = iterator.next()

      while (iterator.hasNext()) {
         val e: Any = iterator.next()
         if (comparator.compare(min, e) > 0) {
            min = e
         }
      }

      return (T)min
   }
}

public fun <T : Comparable<Any>> Sequence<Any>.sorted(): Sequence<Any> {
   return    // $VF: Compiled from _Sequences.kt
object : Sequence<Any> {
      public override operator fun iterator(): Iterator<Any> {
         val sortedList: java.util.List = SequencesKt.toMutableList($this$sorted)
         CollectionsKt.sort(sortedList)
         return sortedList.iterator()
      }
   }
}

public fun <T> Sequence<Any>.asIterable(): Iterable<Any> {
   return SequencesKt___SequencesKt$asIterable$$inlined$Iterable$1(`$this$asIterable`)
}

public inline fun <T> Sequence<Any>.all(predicate: (Any) -> Boolean): Boolean {
   for (element in `$this$all`) {
      if (!predicate(element) as java.lang.Boolean) {
         return false
      }
   }

   return true
}

@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
@InlineOnly
public inline fun <T, R> Sequence<Any>.minOfWith(comparator: Comparator<in Any>, selector: (Any) -> Any): Any {
   val iterator: java.util.Iterator = `$this$minOfWith`.iterator()
   if (!iterator.hasNext()) {
      throw NoSuchElementException()
   } else {
      var minValue: Any = selector(iterator.next())

      while (iterator.hasNext()) {
         val v: Any = selector(iterator.next())
         if (comparator.compare(minValue, v) > 0) {
            minValue = v
         }
      }

      return (R)minValue
   }
}

public fun <T> Sequence<Any>.none(): Boolean {
   return !`$this$none`.iterator().hasNext()
}

@JvmName(name = "averageOfByte")
public fun Sequence<Byte>.average(): Double {
   var sum: Double = 0.0
   val count: Int = 0
   val var4: java.util.Iterator = `$this$average`.iterator()

   while (var4.hasNext()) {
      sum += (var4.next() as java.lang.Number).byteValue()
      if (++count < 0) {
         CollectionsKt.throwCountOverflow()
      }
   }

   return if (count == 0) java.lang.Double.NaN else sum / count
}

public fun <T, A : Appendable> Sequence<Any>.joinTo(
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

public fun <T, R> Sequence<Any>.flatMap(transform: (Any) -> Sequence<Any>): Sequence<Any> {
   return FlatteningSequence<>(`$this$flatMap`, transform, <unrepresentable>.INSTANCE)
}

public fun <T> Sequence<Any>.toHashSet(): HashSet<Any> {
   return SequencesKt.toCollection(`$this$toHashSet`, HashSet()) as HashSet<T>
}

public inline fun <T> Sequence<Any>.none(predicate: (Any) -> Boolean): Boolean {
   for (element in `$this$none`) {
      if (predicate(element) as java.lang.Boolean) {
         return false
      }
   }

   return true
}

public inline fun <T, R> Sequence<Any>.foldIndexed(initial: Any, operation: (Int, Any, Any) -> Any): Any {
   var index: Int = 0
   var accumulator: Any = initial

   for (element in `$this$foldIndexed`) {
      val var8: Int = index++
      if (var8 < 0) {
         if (!PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
            throw ArithmeticException("Index overflow has happened.")
         }

         CollectionsKt.throwIndexOverflow()
      }

      accumulator = operation(var8, accumulator, element)
   }

   return (R)accumulator
}

public inline fun <T, K, V, M : MutableMap<in Any, in Any>> Sequence<Any>.associateByTo(
   destination: Any,
   keySelector: (Any) -> Any,
   valueTransform: (Any) -> Any
): Any {
   for (element in `$this$associateByTo`) {
      destination.put(keySelector(element), valueTransform(element))
   }

   return (M)destination
}

@JvmName(name = "minByOrThrow")
@SinceKotlin(version = "1.7")
public inline fun <T, R : Comparable<Any>> Sequence<Any>.minBy(selector: (Any) -> Any): Any {
   val iterator: java.util.Iterator = `$this$minBy`.iterator()
   if (!iterator.hasNext()) {
      throw NoSuchElementException()
   } else {
      var minElem: Any = iterator.next()
      if (!iterator.hasNext()) {
         return (T)minElem
      } else {
         var minValue: java.lang.Comparable = selector(minElem) as java.lang.Comparable

         do {
            val e: Any = iterator.next()
            val v: java.lang.Comparable = selector(e) as java.lang.Comparable
            if (minValue.compareTo(v) > 0) {
               minElem = e
               minValue = v
            }
         } while (iterator.hasNext())

         return (T)minElem
      }
   }
}

public inline fun <T> Sequence<Any>.count(predicate: (Any) -> Boolean): Int {
   val count: Int = 0

   for (element in `$this$count`) {
      if (predicate(element) as java.lang.Boolean && ++count < 0) {
         if (!PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
            throw ArithmeticException("Count overflow has happened.")
         }

         CollectionsKt.throwCountOverflow()
      }
   }

   return count
}

public operator fun <T> Sequence<Any>.plus(elements: Array<out Any>): Sequence<Any> {
   return (Sequence<T>)SequencesKt.plus(`$this$plus`, ArraysKt.asList(elements))
}

public inline fun <T> Sequence<Any>.lastOrNull(predicate: (Any) -> Boolean): Any? {
   var last: Any = null

   for (element in `$this$lastOrNull`) {
      if (predicate(element) as java.lang.Boolean) {
         last = element
      }
   }

   return (T)last
}

public inline fun <T, K, V, M : MutableMap<in Any, in Any>> Sequence<Any>.associateTo(destination: Any, transform: (Any) -> Pair<Any, Any>): Any {
   for (element in `$this$associateTo`) {
      val var7: Pair = transform(element) as Pair
      destination.put(var7.first, var7.second)
   }

   return (M)destination
}

@InlineOnly
@SinceKotlin(version = "1.5")
public inline fun <T, R : Any> Sequence<Any>.firstNotNullOfOrNull(transform: (Any) -> Any?): Any? {
   for (element in `$this$firstNotNullOfOrNull`) {
      val result: Any = transform(element)
      if (result != null) {
         return (R)result
      }
   }

   return null
}

public operator fun <T> Sequence<Any>.plus(element: Any): Sequence<Any> {
   return SequencesKt.flatten(SequencesKt.sequenceOf(`$this$plus`, SequencesKt.sequenceOf(element)))
}

@SinceKotlin(version = "1.2")
public fun <T, R> Sequence<Any>.chunked(size: Int, transform: (List<Any>) -> Any): Sequence<Any> {
   return SequencesKt.windowed(`$this$chunked`, size, size, true, transform)
}

@SinceKotlin(version = "1.7")
@JvmName(name = "maxOrThrow")
public fun Sequence<Double>.max(): Double {
   val iterator: java.util.Iterator = `$this$max`.iterator()
   if (!iterator.hasNext()) {
      throw NoSuchElementException()
   } else {
      var max: Double = (iterator.next() as java.lang.Number).doubleValue()

      while (iterator.hasNext()) {
         max = Math.max(max, (iterator.next() as java.lang.Number).doubleValue())
      }

      return max
   }
}

public fun <T, R> Sequence<Any>.map(transform: (Any) -> Any): Sequence<Any> {
   return TransformingSequence(`$this$map`, transform)
}

public fun <T> Sequence<Any>.lastIndexOf(element: Any): Int {
   var lastIndex: Int = -1
   var index: Int = 0

   for (item in `$this$lastIndexOf`) {
      if (index < 0) {
         CollectionsKt.throwIndexOverflow()
      }

      if (element == item) {
         lastIndex = index
      }

      index++
   }

   return lastIndex
}

public fun <T> Sequence<Any>.filterIndexed(predicate: (Int, Any) -> Boolean): Sequence<Any> {
   return TransformingSequence<>(FilteringSequence<>(IndexingSequence(`$this$filterIndexed`), true,    // $VF: Compiled from _Sequences.kt
{ it: IndexedValue<Any> ->
      return predicate(it.index, it.value) as java.lang.Boolean
   } as Function1), { it ->
      it.value
   })
}

@SinceKotlin(version = "1.4")
public fun <T> Sequence<Any>.minWithOrNull(comparator: Comparator<in Any>): Any? {
   val iterator: java.util.Iterator = `$this$minWithOrNull`.iterator()
   if (!iterator.hasNext()) {
      return null
   } else {
      var min: Any = iterator.next()

      while (iterator.hasNext()) {
         val e: Any = iterator.next()
         if (comparator.compare(min, e) > 0) {
            min = e
         }
      }

      return (T)min
   }
}

public fun <T> Sequence<Any>.elementAt(index: Int): Any {
   return (T)SequencesKt.elementAtOrElse(`$this$elementAt`, index,    // $VF: Compiled from _Sequences.kt
{ it: Int ->
      throw IndexOutOfBoundsException("Sequence doesn't contain element at index $index.")
   } as Function1)
}

public fun <T> Sequence<Any>.filter(predicate: (Any) -> Boolean): Sequence<Any> {
   return FilteringSequence(`$this$filter`, true, predicate)
}

public infix fun <T, R> Sequence<Any>.zip(other: Sequence<Any>): Sequence<Pair<Any, Any>> {
   return MergingSequence<>(`$this$zip`, other, { t1, t2 ->
      t1 to t2
   })
}

@SinceKotlin(version = "1.4")
public fun <T : Comparable<Any>> Sequence<Any>.minOrNull(): Any? {
   val iterator: java.util.Iterator = `$this$minOrNull`.iterator()
   if (!iterator.hasNext()) {
      return null
   } else {
      var min: java.lang.Comparable = iterator.next() as java.lang.Comparable

      while (iterator.hasNext()) {
         val e: java.lang.Comparable = iterator.next() as java.lang.Comparable
         if (min.compareTo(e) > 0) {
            min = e
         }
      }

      return (T)min
   }
}

@SinceKotlin(version = "1.4")
@InlineOnly
@OverloadResolutionByLambdaReturnType
public inline fun <T> Sequence<Any>.maxOf(selector: (Any) -> Float): Float {
   val iterator: java.util.Iterator = `$this$maxOf`.iterator()
   if (!iterator.hasNext()) {
      throw NoSuchElementException()
   } else {
      var maxValue: Float = (selector(iterator.next()) as java.lang.Number).floatValue()

      while (iterator.hasNext()) {
         maxValue = Math.max(maxValue, (selector(iterator.next()) as java.lang.Number).floatValue())
      }

      return maxValue
   }
}

public inline fun <T, K, M : MutableMap<in Any, in Any>> Sequence<Any>.associateByTo(destination: Any, keySelector: (Any) -> Any): Any {
   for (element in `$this$associateByTo`) {
      destination.put(keySelector(element), element)
   }

   return (M)destination
}

public operator fun <T> Sequence<Any>.minus(elements: Array<out Any>): Sequence<Any> {
   return if (elements.length == 0) `$this$minus` else    // $VF: Compiled from _Sequences.kt
object : Sequence<Any> {
      public override operator fun iterator(): Iterator<Any> {
         return SequencesKt.<T>filterNot($this$minus,          // $VF: Compiled from _Sequences.kt
{ it: Any ->
            return ArraysKt.contains(elements, it)
         } as (T?) -> java.lang.Boolean).iterator()
      }
   }
}

public fun <T, R : Any> Sequence<Any>.mapNotNull(transform: (Any) -> Any?): Sequence<Any> {
   return SequencesKt.filterNotNull(TransformingSequence(`$this$mapNotNull`, transform))
}

public inline fun <T> Sequence<Any>.indexOfFirst(predicate: (Any) -> Boolean): Int {
   var index: Int = 0

   for (item in `$this$indexOfFirst`) {
      if (index < 0) {
         if (!PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
            throw ArithmeticException("Index overflow has happened.")
         }

         CollectionsKt.throwIndexOverflow()
      }

      if (predicate(item) as java.lang.Boolean) {
         return index
      }

      index++
   }

   return -1
}

public inline fun <T, C : MutableCollection<in Any>> Sequence<Any>.filterNotTo(destination: Any, predicate: (Any) -> Boolean): Any {
   for (element in `$this$filterNotTo`) {
      if (!predicate(element) as java.lang.Boolean) {
         destination.add(element)
      }
   }

   return (C)destination
}
