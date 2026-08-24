@file:JvmMultifileClass
@file:JvmName("CollectionsKt")

package kotlin.collections

import java.util.ArrayList
import java.util.Comparator
import java.util.HashSet
import java.util.LinkedHashMap
import java.util.LinkedHashSet
import java.util.NoSuchElementException
import java.util.RandomAccess
import kotlin.internal.HidesMembers
import kotlin.internal.InlineOnly
import kotlin.internal.PlatformImplementationsKt
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function1
import kotlin.random.Random

// $VF: Compiled from _Collections.kt
public inline fun <T> Iterable<Any>.forEachIndexed(action: (Int, Any) -> Unit) {
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

@InlineOnly
@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
public inline fun <T, R> Iterable<Any>.maxOfWith(comparator: Comparator<in Any>, selector: (Any) -> Any): Any {
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

public inline fun <T, R : Any> Iterable<Any>.mapIndexedNotNull(transform: (Int, Any) -> Any?): List<Any> {
   val `destination$iv`: java.util.Collection = ArrayList()
   var `index$iv$iv`: Int = 0

   for (`item$iv$iv` in `$this$mapIndexedNotNull`) {
      val var11: Int = `index$iv$iv`++
      if (var11 < 0) {
         if (!PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
            throw ArithmeticException("Index overflow has happened.")
         }

         CollectionsKt.throwIndexOverflow()
      }

      val var18: Any = transform(var11, `item$iv$iv`)
      if (var18 != null) {
         `destination$iv`.add(var18)
      }
   }

   return `destination$iv` as MutableList<R>
}

public inline fun <T, R> Iterable<Any>.fold(initial: Any, operation: (Any, Any) -> Any): Any {
   var accumulator: Any = initial

   for (element in `$this$fold`) {
      accumulator = operation(accumulator, element)
   }

   return (R)accumulator
}

public fun <T> List<Any>.singleOrNull(): Any? {
   return (T)(if (`$this$singleOrNull`.size() == 1) `$this$singleOrNull`.get(0) else null)
}

@JvmName(name = "minWithOrThrow")
@SinceKotlin(version = "1.7")
public fun <T> Iterable<Any>.minWith(comparator: Comparator<in Any>): Any {
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

@SinceKotlin(version = "1.4")
public inline fun <T, R : Comparable<Any>> Iterable<Any>.minByOrNull(selector: (Any) -> Any): Any? {
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

@SinceKotlin(version = "1.2")
public fun <T, R> Iterable<Any>.windowed(size: Int, step: Int = 1, partialWindows: Boolean = false, transform: (List<Any>) -> Any): List<Any> {
   SlidingWindowKt.checkWindowSizeStep(size, step)
   if (`$this$windowed` is RandomAccess && `$this$windowed` is java.util.List) {
      val var12: Int = (`$this$windowed` as java.util.List).size()
      val var14: ArrayList = ArrayList(var12 / step + (if (var12 % step == 0) 0 else 1))
      val var15: MovingSubList = MovingSubList(`$this$windowed` as java.util.List)

      // $VF: Unable to resugar Kotlin loop from Java for loop
      var var16: Int = 0
      while (true) {
         if (0 <= var16 && var16 < var12) break
         val var17: Int = RangesKt.coerceAtMost(size, var12 - var16)
         if (!partialWindows && var17 < size) {
            break
         }

         var15.move(var16, var16 + var17)
         var14.add(transform(var15))

         var16 += step
      }

      return var14
   } else {
      val result: ArrayList = ArrayList()
      val window: java.util.Iterator = SlidingWindowKt.windowedIterator(`$this$windowed`.iterator(), size, step, partialWindows, true)

      while (window.hasNext()) {
         result.add(transform(window.next() as java.util.List))
      }

      return result
   }
}

public fun <T> List<Any>.single(): Any {
   when (`$this$single`.size()) {
      0 -> throw NoSuchElementException("List is empty.")
      1 -> return (T)`$this$single`.get(0)
      else -> throw IllegalArgumentException("List has more than one element.")
   }
}

public fun Collection<Char>.toCharArray(): CharArray {
   val result: CharArray = CharArray(`$this$toCharArray`.size())
   var index: Int = 0

   for (element in `$this$toCharArray`) {
      result[index++] = element
   }

   return result
}

@InlineOnly
public inline fun <T> List<Any>.elementAt(index: Int): Any {
   return (T)`$this$elementAt`.get(index)
}

public inline fun <T, R> List<Any>.foldRightIndexed(initial: Any, operation: (Int, Any, Any) -> Any): Any {
   var accumulator: Any = initial
   if (!`$this$foldRightIndexed`.isEmpty()) {
      val iterator: java.util.ListIterator = `$this$foldRightIndexed`.listIterator(`$this$foldRightIndexed`.size())

      while (iterator.hasPrevious()) {
         accumulator = operation(iterator.previousIndex(), iterator.previous(), accumulator)
      }
   }

   return (R)accumulator
}

@SinceKotlin(version = "1.3")
public fun <T> MutableList<Any>.shuffle(random: Random) {
   for (i in CollectionsKt.getLastIndex(`$this$shuffle`) downTo 1) {
      val j: Int = random.nextInt(i + 1)
      `$this$shuffle`.set(j, `$this$shuffle`.set(i, `$this$shuffle`.get(j)))
   }
}

@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public inline fun <S, T : Any> Iterable<Any>.reduceOrNull(operation: (Any, Any) -> Any): Any? {
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

public inline fun <T> List<Any>.takeLastWhile(predicate: (Any) -> Boolean): List<Any> {
   if (`$this$takeLastWhile`.isEmpty()) {
      return CollectionsKt.emptyList()
   } else {
      val iterator: java.util.ListIterator = `$this$takeLastWhile`.listIterator(`$this$takeLastWhile`.size())

      while (iterator.hasPrevious()) {
         if (!predicate(iterator.previous()) as java.lang.Boolean) {
            iterator.next()
            val expectedSize: Int = `$this$takeLastWhile`.size() - iterator.nextIndex()
            if (expectedSize == 0) {
               return CollectionsKt.emptyList()
            }

            val var5: ArrayList = ArrayList(expectedSize)
            val `$this$takeLastWhile_u24lambda_u245`: ArrayList = var5

            while (iterator.hasNext()) {
               `$this$takeLastWhile_u24lambda_u245`.add(iterator.next())
            }

            return var5
         }
      }

      return CollectionsKt.toList(`$this$takeLastWhile`)
   }
}

public operator fun <T> Iterable<Any>.minus(element: Any): List<Any> {
   val result: ArrayList = ArrayList(CollectionsKt.collectionSizeOrDefault(`$this$minus`, 10))
   var removed: Boolean = false

   for (`element$iv` in `$this$minus`) {
      val var10000: Boolean
      if (!removed && `element$iv` == element) {
         removed = true
         var10000 = false
      } else {
         var10000 = true
      }

      if (var10000) {
         result.add(`element$iv`)
      }
   }

   return result
}

public inline fun <S, T : Any> Iterable<Any>.reduceIndexed(operation: (Int, Any, Any) -> Any): Any {
   val iterator: java.util.Iterator = `$this$reduceIndexed`.iterator()
   if (!iterator.hasNext()) {
      throw UnsupportedOperationException("Empty collection can't be reduced.")
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

public fun <T : Comparable<Any>> MutableList<Any>.sortDescending() {
   CollectionsKt.sortWith(`$this$sortDescending`, ComparisonsKt.reverseOrder())
}

public fun <C : MutableCollection<in Any>, T : Any> Iterable<Any?>.filterNotNullTo(destination: Any): Any {
   for (element in `$this$filterNotNullTo`) {
      if (element != null) {
         destination.add(element)
      }
   }

   return (C)destination
}

public fun <T> Iterable<Any>.toSet(): Set<Any> {
   if (`$this$toSet` is java.util.Collection) {
      var var10000: java.util.Set
      when ((`$this$toSet` as java.util.Collection).size()) {
         0 -> var10000 = SetsKt.emptySet()
         1 -> var10000 = SetsKt.setOf(if (`$this$toSet` is java.util.List) (`$this$toSet` as java.util.List).get(0) else `$this$toSet`.iterator().next())
         else -> var10000 = CollectionsKt.toCollection(`$this$toSet`, LinkedHashSet(MapsKt.mapCapacity((`$this$toSet` as java.util.Collection).size())))
      }

      return var10000
   } else {
      return SetsKt.optimizeReadOnlySet(CollectionsKt.toCollection(`$this$toSet`, LinkedHashSet()))
   }
}

@JvmName(name = "averageOfByte")
public fun Iterable<Byte>.average(): Double {
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

public fun <T> Iterable<Any>.count(): Int {
   if (`$this$count` is java.util.Collection) {
      return (`$this$count` as java.util.Collection).size()
   } else {
      val count: Int = 0

      for (element in `$this$count`) {
         if (++count < 0) {
            CollectionsKt.throwCountOverflow()
         }
      }

      return count
   }
}

public inline fun <T, K, V> Iterable<Any>.groupBy(keySelector: (Any) -> Any, valueTransform: (Any) -> Any): Map<Any, List<Any>> {
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

public inline fun <T> Iterable<Any>.filterIndexed(predicate: (Int, Any) -> Boolean): List<Any> {
   val `destination$iv`: java.util.Collection = ArrayList()
   var `index$iv$iv`: Int = 0

   for (`item$iv$iv` in `$this$filterIndexed`) {
      val var11: Int = `index$iv$iv`++
      if (var11 < 0) {
         if (!PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
            throw ArithmeticException("Index overflow has happened.")
         }

         CollectionsKt.throwIndexOverflow()
      }

      if (predicate(var11, `item$iv$iv`) as java.lang.Boolean) {
         `destination$iv`.add(`item$iv$iv`)
      }
   }

   return `destination$iv` as MutableList<T>
}

public inline fun <T, K, M : MutableMap<in Any, in Any>> Iterable<Any>.associateByTo(destination: Any, keySelector: (Any) -> Any): Any {
   for (element in `$this$associateByTo`) {
      destination.put(keySelector(element), element)
   }

   return (M)destination
}

@InlineOnly
@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
public inline fun <T, R> Iterable<Any>.minOfWith(comparator: Comparator<in Any>, selector: (Any) -> Any): Any {
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

public inline fun <T, K, V> Iterable<Any>.associateBy(keySelector: (Any) -> Any, valueTransform: (Any) -> Any): Map<Any, Any> {
   val `destination$iv`: java.util.Map = LinkedHashMap(
      RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(`$this$associateBy`, 10)), 16)
   )

   for (`element$iv` in `$this$associateBy`) {
      `destination$iv`.put(keySelector(`element$iv`), valueTransform(`element$iv`))
   }

   return `destination$iv`
}

@InlineOnly
public inline fun <T> List<Any>.elementAtOrElse(index: Int, defaultValue: (Int) -> Any): Any {
   return (T)(if (index >= 0 && index <= CollectionsKt.getLastIndex(`$this$elementAtOrElse`)) `$this$elementAtOrElse`.get(index) else defaultValue(index))
}

@SinceKotlin(version = "1.4")
@InlineOnly
@OverloadResolutionByLambdaReturnType
public inline fun <T> Iterable<Any>.maxOfOrNull(selector: (Any) -> Double): Double? {
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

public fun <T> Iterable<Any>.elementAtOrElse(index: Int, defaultValue: (Int) -> Any): Any {
   if (`$this$elementAtOrElse` !is java.util.List) {
      if (index < 0) {
         return (T)defaultValue(index)
      } else {
         val var6: java.util.Iterator = `$this$elementAtOrElse`.iterator()
         val count: Int = 0

         while (var6.hasNext()) {
            val element: Any = var6.next()
            if (index == count++) {
               return (T)element
            }
         }

         return (T)defaultValue(index)
      }
   } else {
      return (T)(if (index >= 0 && index <= CollectionsKt.getLastIndex(`$this$elementAtOrElse` as java.util.List))
         (`$this$elementAtOrElse` as java.util.List).get(index)
         else
         defaultValue(index))
   }
}

@InlineOnly
@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
public inline fun <T> Iterable<Any>.minOfOrNull(selector: (Any) -> Float): Float? {
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

public infix fun <T> Iterable<Any>.intersect(other: Iterable<Any>): Set<Any> {
   val set: java.util.Set = CollectionsKt.toMutableSet(`$this$intersect`)
   CollectionsKt.retainAll(set, other)
   return set
}

public inline fun <T> Iterable<Any>.lastOrNull(predicate: (Any) -> Boolean): Any? {
   var last: Any = null

   for (element in `$this$lastOrNull`) {
      if (predicate(element) as java.lang.Boolean) {
         last = element
      }
   }

   return (T)last
}

@SinceKotlin(version = "1.4")
public inline fun <T, C : Iterable<Any>> Any.onEachIndexed(action: (Int, Any) -> Unit): Any {
   var `index$iv`: Int = 0

   for (`item$iv` in `$this$onEachIndexed`) {
      val var11: Int = `index$iv`++
      if (var11 < 0) {
         CollectionsKt.throwIndexOverflow()
      }

      action(var11, `item$iv`)
   }

   return (C)`$this$onEachIndexed`
}

@InlineOnly
public inline fun <T> Collection<Any>.count(): Int {
   return `$this$count`.size()
}

public operator fun <T> Collection<Any>.plus(elements: Iterable<Any>): List<Any> {
   if (elements is java.util.Collection) {
      val var3: ArrayList = ArrayList(`$this$plus`.size() + (elements as java.util.Collection).size())
      var3.addAll(`$this$plus`)
      var3.addAll(elements as java.util.Collection)
      return var3
   } else {
      val result: ArrayList = ArrayList(`$this$plus`)
      CollectionsKt.addAll(result, elements)
      return result
   }
}

@SinceKotlin(version = "1.4")
@InlineOnly
@OverloadResolutionByLambdaReturnType
public inline fun <T, R : Comparable<Any>> Iterable<Any>.minOf(selector: (Any) -> Any): Any {
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

@InlineOnly
public inline operator fun <T> List<Any>.component2(): Any {
   return (T)`$this$component2`.get(1)
}

public fun <T> Iterable<Any>.sortedWith(comparator: Comparator<in Any>): List<Any> {
   if (`$this$sortedWith` is java.util.Collection) {
      if ((`$this$sortedWith` as java.util.Collection).size() <= 1) {
         return CollectionsKt.toList(`$this$sortedWith`)
      } else {
         val var6: Array<Any> = (`$this$sortedWith` as java.util.Collection).toArray(arrayOfNulls(0))
         ArraysKt.sortWith(var6, comparator)
         return (java.util.List<T>)ArraysKt.asList(var6)
      }
   } else {
      val `$this$toTypedArray$iv`: java.util.List = CollectionsKt.toMutableList(`$this$sortedWith`)
      CollectionsKt.sortWith(`$this$toTypedArray$iv`, comparator)
      return `$this$toTypedArray$iv`
   }
}

@SinceKotlin(version = "1.4")
public fun <T> Iterable<Any>.minWithOrNull(comparator: Comparator<in Any>): Any? {
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

@SinceKotlin(version = "1.2")
public fun <T> Iterable<Any>.zipWithNext(): List<Pair<Any, Any>> {
   val `iterator$iv`: java.util.Iterator = `$this$zipWithNext`.iterator()
   val var10000: java.util.List
   if (!`iterator$iv`.hasNext()) {
      var10000 = CollectionsKt.emptyList()
   } else {
      val `result$iv`: java.util.List = ArrayList()
      var `current$iv`: Any = `iterator$iv`.next()

      while (`iterator$iv`.hasNext()) {
         val `next$iv`: Any = `iterator$iv`.next()
         `result$iv`.add(`current$iv` to `next$iv`)
         `current$iv` = `next$iv`
      }

      var10000 = `result$iv`
   }

   return var10000
}

@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public inline fun <S, T : Any> List<Any>.reduceRightOrNull(operation: (Any, Any) -> Any): Any? {
   val iterator: java.util.ListIterator = `$this$reduceRightOrNull`.listIterator(`$this$reduceRightOrNull`.size())
   if (!iterator.hasPrevious()) {
      return null
   } else {
      var accumulator: Any = iterator.previous()

      while (iterator.hasPrevious()) {
         accumulator = operation(iterator.previous(), accumulator)
      }

      return (S)accumulator
   }
}

@InlineOnly
@JvmName(name = "sumOfLong")
@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
public inline fun <T> Iterable<Any>.sumOf(selector: (Any) -> Long): Long {
   var sum: Long = 0L

   for (element in `$this$sumOf`) {
      sum += (selector(element) as java.lang.Number).longValue()
   }

   return sum
}

public fun Collection<Byte>.toByteArray(): ByteArray {
   val result: ByteArray = ByteArray(`$this$toByteArray`.size())
   var index: Int = 0
   val var3: java.util.Iterator = `$this$toByteArray`.iterator()

   while (var3.hasNext()) {
      result[index++] = (var3.next() as java.lang.Number).byteValue()
   }

   return result
}

public infix fun <T, R> Iterable<Any>.zip(other: Array<out Any>): List<Pair<Any, Any>> {
   val `arraySize$iv`: Int = other.length
   val `list$iv`: ArrayList = ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(`$this$zip`, 10), other.length))
   var `i$iv`: Int = 0

   for (`element$iv` in `$this$zip`) {
      if (`i$iv` >= `arraySize$iv`) {
         break
      }

      `list$iv`.add(`element$iv` to other[`i$iv`++])
   }

   return `list$iv`
}

public fun <T> Iterable<Any>.firstOrNull(): Any? {
   if (`$this$firstOrNull` is java.util.List) {
      return (T)(if ((`$this$firstOrNull` as java.util.List).isEmpty()) null else (`$this$firstOrNull` as java.util.List).get(0))
   } else {
      val iterator: java.util.Iterator = `$this$firstOrNull`.iterator()
      return (T)(if (!iterator.hasNext()) null else iterator.next())
   }
}

public operator fun <T> Iterable<Any>.plus(elements: Sequence<Any>): List<Any> {
   val result: ArrayList = ArrayList()
   CollectionsKt.addAll(result, `$this$plus`)
   CollectionsKt.addAll(result, elements)
   return result
}

@InlineOnly
public inline fun <T> Collection<Any>.plusElement(element: Any): List<Any> {
   return (java.util.List<T>)CollectionsKt.plus(`$this$plusElement`, (Object)element)
}

public fun <T> Iterable<Any>.drop(n: Int): List<Any> {
   if (n < 0) {
      throw IllegalArgumentException(("Requested element count $n is less than zero.").toString())
   } else if (n == 0) {
      return CollectionsKt.toList(`$this$drop`)
   } else {
      val var7: ArrayList
      if (`$this$drop` is java.util.Collection) {
         val count: Int = (`$this$drop` as java.util.Collection).size() - n
         if (count <= 0) {
            return CollectionsKt.emptyList()
         }

         if (count == 1) {
            return (java.util.List<T>)CollectionsKt.listOf(CollectionsKt.last(`$this$drop`))
         }

         var7 = ArrayList(count)
         if (`$this$drop` is java.util.List) {
            if (`$this$drop` is RandomAccess) {
               var index: Int = n

               for (item in (`$this$drop` as java.util.Collection).size()..index) {
                  var7.add((`$this$drop` as java.util.List).get(index))
               }
            } else {
               val var11: java.util.Iterator = (`$this$drop` as java.util.List).listIterator(n)

               while (var11.hasNext()) {
                  var7.add(var11.next())
               }
            }

            return var7
         }
      } else {
         var7 = ArrayList()
      }

      var var8: Int = 0

      for (var14 in `$this$drop`) {
         if (var8 >= n) {
            var7.add(var14)
         } else {
            var8++
         }
      }

      return CollectionsKt.optimizeReadOnlyList(var7)
   }
}

public inline fun <T, K> Iterable<Any>.distinctBy(selector: (Any) -> Any): List<Any> {
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
public inline fun <T> List<Any>.getOrElse(index: Int, defaultValue: (Int) -> Any): Any {
   return (T)(if (index >= 0 && index <= CollectionsKt.getLastIndex(`$this$getOrElse`)) `$this$getOrElse`.get(index) else defaultValue(index))
}

@JvmName(name = "maxOrThrow")
@SinceKotlin(version = "1.7")
public fun <T : Comparable<Any>> Iterable<Any>.max(): Any {
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

@InlineOnly
@SinceKotlin(version = "1.5")
public inline fun <T, R : Any> Iterable<Any>.firstNotNullOf(transform: (Any) -> Any?): Any {
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
      throw NoSuchElementException("No element of the collection was transformed to a non-null value.")
   } else {
      return (R)var10000
   }
}

public operator fun <T> Iterable<Any>.minus(elements: Sequence<Any>): List<Any> {
   val other: java.util.List = SequencesKt.toList(elements)
   if (other.isEmpty()) {
      return CollectionsKt.toList(`$this$minus`)
   } else {
      val `destination$iv$iv`: java.util.Collection = ArrayList()

      for (`element$iv$iv` in `$this$minus`) {
         if (!other.contains(`element$iv$iv`)) {
            `destination$iv$iv`.add(`element$iv$iv`)
         }
      }

      return `destination$iv$iv` as MutableList<T>
   }
}

public inline fun <T, R : Any, C : MutableCollection<in Any>> Iterable<Any>.mapNotNullTo(destination: Any, transform: (Any) -> Any?): Any {
   for (`element$iv` in `$this$mapNotNullTo`) {
      val var10000: Any = transform(`element$iv`)
      if (var10000 != null) {
         destination.add(var10000)
      }
   }

   return (C)destination
}

public fun <T> List<Any>.first(): Any {
   if (`$this$first`.isEmpty()) {
      throw NoSuchElementException("List is empty.")
   } else {
      return (T)`$this$first`.get(0)
   }
}

public inline fun <T, R : Comparable<Any>> MutableList<Any>.sortBy(crossinline selector: (Any) -> Any?) {
   if (`$this$sortBy`.size() > 1) {
      CollectionsKt.sortWith(`$this$sortBy`,       // $VF: Compiled from Comparisons.kt
{ a: Any, b: Any ->
         val var3: Function1 = selector
         return ComparisonsKt.compareValues((T)(selector(a) as java.lang.Comparable), (T)(var3(b) as java.lang.Comparable))
      })
   }
}

public fun <T> Iterable<Any>.any(): Boolean {
   return if (`$this$any` is java.util.Collection) !(`$this$any` as java.util.Collection).isEmpty() else `$this$any`.iterator().hasNext()
}

public fun Collection<Float>.toFloatArray(): FloatArray {
   val result: FloatArray = FloatArray(`$this$toFloatArray`.size())
   var index: Int = 0
   val var3: java.util.Iterator = `$this$toFloatArray`.iterator()

   while (var3.hasNext()) {
      result[index++] = (var3.next() as java.lang.Number).floatValue()
   }

   return result
}

public inline fun <T, R : Comparable<Any>> MutableList<Any>.sortByDescending(crossinline selector: (Any) -> Any?) {
   if (`$this$sortByDescending`.size() > 1) {
      CollectionsKt.sortWith(`$this$sortByDescending`,       // $VF: Compiled from Comparisons.kt
{ a: Any, b: Any ->
         val var3: Function1 = selector
         return ComparisonsKt.compareValues((T)(selector(b) as java.lang.Comparable), (T)(var3(a) as java.lang.Comparable))
      })
   }
}

public inline fun <T> Iterable<Any>.firstOrNull(predicate: (Any) -> Boolean): Any? {
   for (element in `$this$firstOrNull`) {
      if (predicate(element) as java.lang.Boolean) {
         return (T)element
      }
   }

   return null
}

@JvmName(name = "sumOfShort")
public fun Iterable<Short>.sum(): Int {
   var sum: Short = 0
   val var2: java.util.Iterator = `$this$sum`.iterator()

   while (var2.hasNext()) {
      sum += (var2.next() as java.lang.Number).shortValue()
   }

   return sum
}

public inline fun <T> List<Any>.dropLastWhile(predicate: (Any) -> Boolean): List<Any> {
   if (!`$this$dropLastWhile`.isEmpty()) {
      val iterator: java.util.ListIterator = `$this$dropLastWhile`.listIterator(`$this$dropLastWhile`.size())

      while (iterator.hasPrevious()) {
         if (!predicate(iterator.previous()) as java.lang.Boolean) {
            return CollectionsKt.take(`$this$dropLastWhile`, iterator.nextIndex() + 1)
         }
      }
   }

   return CollectionsKt.emptyList()
}

public inline fun <T> Iterable<Any>.indexOfFirst(predicate: (Any) -> Boolean): Int {
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

public inline fun <T> List<Any>.indexOfLast(predicate: (Any) -> Boolean): Int {
   val iterator: java.util.ListIterator = `$this$indexOfLast`.listIterator(`$this$indexOfLast`.size())

   while (iterator.hasPrevious()) {
      if (predicate(iterator.previous()) as java.lang.Boolean) {
         return iterator.nextIndex()
      }
   }

   return -1
}

public inline fun <T> Iterable<Any>.any(predicate: (Any) -> Boolean): Boolean {
   if (`$this$any` is java.util.Collection && (`$this$any` as java.util.Collection).isEmpty()) {
      return false
   } else {
      for (element in `$this$any`) {
         if (predicate(element) as java.lang.Boolean) {
            return true
         }
      }

      return false
   }
}

public fun <T, A : Appendable> Iterable<Any>.joinTo(
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

public inline fun <T> Iterable<Any>.count(predicate: (Any) -> Boolean): Int {
   if (`$this$count` is java.util.Collection && (`$this$count` as java.util.Collection).isEmpty()) {
      return 0
   } else {
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
}

@InlineOnly
@JvmName(name = "sumOfDouble")
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
public inline fun <T> Iterable<Any>.sumOf(selector: (Any) -> Double): Double {
   var sum: Double = 0.0

   for (element in `$this$sumOf`) {
      sum += (selector(element) as java.lang.Number).doubleValue()
   }

   return sum
}

public inline fun <S, T : Any> Iterable<Any>.reduce(operation: (Any, Any) -> Any): Any {
   val iterator: java.util.Iterator = `$this$reduce`.iterator()
   if (!iterator.hasNext()) {
      throw UnsupportedOperationException("Empty collection can't be reduced.")
   } else {
      var accumulator: Any = iterator.next()

      while (iterator.hasNext()) {
         accumulator = operation(accumulator, iterator.next())
      }

      return (S)accumulator
   }
}

public inline fun <T> Iterable<Any>.first(predicate: (Any) -> Boolean): Any {
   for (element in `$this$first`) {
      if (predicate(element) as java.lang.Boolean) {
         return (T)element
      }
   }

   throw NoSuchElementException("Collection contains no element matching the predicate.")
}

public inline fun <T, R> Iterable<Any>.map(transform: (Any) -> Any): List<Any> {
   val `destination$iv`: java.util.Collection = ArrayList(CollectionsKt.collectionSizeOrDefault(`$this$map`, 10))

   for (`item$iv` in `$this$map`) {
      `destination$iv`.add(transform(`item$iv`))
   }

   return `destination$iv` as MutableList<R>
}

@DeprecatedSinceKotlin(warningSince = "1.5")
@Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = []))
public inline fun <T> Iterable<Any>.sumBy(selector: (Any) -> Int): Int {
   var sum: Int = 0

   for (element in `$this$sumBy`) {
      sum += (selector(element) as java.lang.Number).intValue()
   }

   return sum
}

public operator fun <T> Iterable<Any>.plus(elements: Iterable<Any>): List<Any> {
   if (`$this$plus` is java.util.Collection) {
      return CollectionsKt.plus(`$this$plus` as java.util.Collection, elements)
   } else {
      val result: ArrayList = ArrayList()
      CollectionsKt.addAll(result, `$this$plus`)
      CollectionsKt.addAll(result, elements)
      return result
   }
}

public inline fun <T> Iterable<Any>.last(predicate: (Any) -> Boolean): Any {
   var last: Any = null
   var found: Boolean = false

   for (element in `$this$last`) {
      if (predicate(element) as java.lang.Boolean) {
         last = element
         found = true
      }
   }

   if (!found) {
      throw NoSuchElementException("Collection contains no element matching the predicate.")
   } else {
      return (T)last
   }
}

public infix fun <T, R> Iterable<Any>.zip(other: Iterable<Any>): List<Pair<Any, Any>> {
   val `first$iv`: java.util.Iterator = `$this$zip`.iterator()
   val `second$iv`: java.util.Iterator = other.iterator()
   val `list$iv`: ArrayList = ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(`$this$zip`, 10), CollectionsKt.collectionSizeOrDefault(other, 10)))

   while (`first$iv`.hasNext() && `second$iv`.hasNext()) {
      `list$iv`.add(`first$iv`.next() to `second$iv`.next())
   }

   return `list$iv`
}

public inline fun <T, K, M : MutableMap<in Any, MutableList<Any>>> Iterable<Any>.groupByTo(destination: Any, keySelector: (Any) -> Any): Any {
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

public inline fun <T, C : MutableCollection<in Any>> Iterable<Any>.filterNotTo(destination: Any, predicate: (Any) -> Boolean): Any {
   for (element in `$this$filterNotTo`) {
      if (!predicate(element) as java.lang.Boolean) {
         destination.add(element)
      }
   }

   return (C)destination
}

@SinceKotlin(version = "1.4")
public inline fun <S, T : Any> Iterable<Any>.reduceIndexedOrNull(operation: (Int, Any, Any) -> Any): Any? {
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

@SinceKotlin(version = "1.4")
public fun Iterable<Float>.maxOrNull(): Float? {
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

public fun <T> Iterable<Any>.none(): Boolean {
   return if (`$this$none` is java.util.Collection) (`$this$none` as java.util.Collection).isEmpty() else !`$this$none`.iterator().hasNext()
}

@InlineOnly
public inline fun <T> Iterable<Any>.plusElement(element: Any): List<Any> {
   return (java.util.List<T>)CollectionsKt.plus((java.lang.Iterable<? extends Object>)`$this$plusElement`, (Object)element)
}

public inline fun <T, R, V> Iterable<Any>.zip(other: Iterable<Any>, transform: (Any, Any) -> Any): List<Any> {
   val first: java.util.Iterator = `$this$zip`.iterator()
   val second: java.util.Iterator = other.iterator()
   val list: ArrayList = ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(`$this$zip`, 10), CollectionsKt.collectionSizeOrDefault(other, 10)))

   while (first.hasNext() && second.hasNext()) {
      list.add(transform(first.next(), second.next()))
   }

   return list
}

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun <T, R : Comparable<Any>> Iterable<Any>.maxOfOrNull(selector: (Any) -> Any): Any? {
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

@InlineOnly
public inline operator fun <T> List<Any>.component1(): Any {
   return (T)`$this$component1`.get(0)
}

public operator fun <T> Iterable<Any>.minus(elements: Array<out Any>): List<Any> {
   if (elements.length == 0) {
      return CollectionsKt.toList(`$this$minus`)
   } else {
      val `destination$iv$iv`: java.util.Collection = ArrayList()

      for (`element$iv$iv` in `$this$minus`) {
         if (!ArraysKt.contains(elements, `element$iv$iv`)) {
            `destination$iv$iv`.add(`element$iv$iv`)
         }
      }

      return `destination$iv$iv` as MutableList<T>
   }
}

@JvmName(name = "maxWithOrThrow")
@SinceKotlin(version = "1.7")
public fun <T> Iterable<Any>.maxWith(comparator: Comparator<in Any>): Any {
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

public fun <T> Iterable<Any>.toHashSet(): HashSet<Any> {
   return CollectionsKt.toCollection(`$this$toHashSet`, HashSet(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(`$this$toHashSet`, 12)))) as HashSet<T>
}

public fun <T> List<Any>.getOrNull(index: Int): Any? {
   return (T)(if (index >= 0 && index <= CollectionsKt.getLastIndex(`$this$getOrNull`)) `$this$getOrNull`.get(index) else null)
}

@SinceKotlin(version = "1.4")
public fun <T> Iterable<Any>.maxWithOrNull(comparator: Comparator<in Any>): Any? {
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

public inline fun <T, K, V, M : MutableMap<in Any, in Any>> Iterable<Any>.associateByTo(
   destination: Any,
   keySelector: (Any) -> Any,
   valueTransform: (Any) -> Any
): Any {
   for (element in `$this$associateByTo`) {
      destination.put(keySelector(element), valueTransform(element))
   }

   return (M)destination
}

public inline fun <T, R : Any, C : MutableCollection<in Any>> Iterable<Any>.mapIndexedNotNullTo(destination: Any, transform: (Int, Any) -> Any?): Any {
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

public fun <T> Iterable<Any>.indexOf(element: Any): Int {
   if (`$this$indexOf` is java.util.List) {
      return (`$this$indexOf` as java.util.List).indexOf(element)
   } else {
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
}

@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public inline fun <S, T : Any> Iterable<Any>.runningReduce(operation: (Any, Any) -> Any): List<Any> {
   val iterator: java.util.Iterator = `$this$runningReduce`.iterator()
   if (!iterator.hasNext()) {
      return CollectionsKt.emptyList()
   } else {
      var var9: Any = iterator.next()
      val var6: ArrayList = ArrayList(CollectionsKt.collectionSizeOrDefault(`$this$runningReduce`, 10))
      var6.add(var9)
      val result: ArrayList = var6

      while (iterator.hasNext()) {
         var9 = operation(var9, iterator.next())
         result.add(var9)
      }

      return result
   }
}

public fun <T> Iterable<Any>.first(): Any {
   if (`$this$first` is java.util.List) {
      return (T)CollectionsKt.first(`$this$first` as java.util.List)
   } else {
      val iterator: java.util.Iterator = `$this$first`.iterator()
      if (!iterator.hasNext()) {
         throw NoSuchElementException("Collection is empty.")
      } else {
         return (T)iterator.next()
      }
   }
}

@InlineOnly
public inline fun <T> Iterable<Any>.asIterable(): Iterable<Any> {
   return `$this$asIterable`
}

public fun <T> Iterable<Any>.lastOrNull(): Any? {
   if (`$this$lastOrNull` is java.util.List) {
      return (T)(if ((`$this$lastOrNull` as java.util.List).isEmpty())
         null
         else
         (`$this$lastOrNull` as java.util.List).get((`$this$lastOrNull` as java.util.List).size() - 1))
   } else {
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
}

@SinceKotlin(version = "1.4")
@InlineOnly
@OverloadResolutionByLambdaReturnType
public inline fun <T, R> Iterable<Any>.maxOfWithOrNull(comparator: Comparator<in Any>, selector: (Any) -> Any): Any? {
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

public inline fun <T, R : Comparable<Any>> Iterable<Any>.sortedBy(crossinline selector: (Any) -> Any?): List<Any> {
   return CollectionsKt.sortedWith(`$this$sortedBy`,    // $VF: Compiled from Comparisons.kt
{ a: Any, b: Any ->
      val var3: Function1 = selector
      return ComparisonsKt.compareValues((T)(selector(a) as java.lang.Comparable), (T)(var3(b) as java.lang.Comparable))
   })
}

@InlineOnly
public inline fun <T> Iterable<Any>.findLast(predicate: (Any) -> Boolean): Any? {
   var `last$iv`: Any = null

   for (`element$iv` in `$this$findLast`) {
      if (predicate(`element$iv`) as java.lang.Boolean) {
         `last$iv` = `element$iv`
      }
   }

   return (T)`last$iv`
}

public inline fun <T> Iterable<Any>.partition(predicate: (Any) -> Boolean): Pair<List<Any>, List<Any>> {
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

public operator fun <T> Iterable<Any>.contains(element: Any): Boolean {
   return if (`$this$contains` is java.util.Collection)
      (`$this$contains` as java.util.Collection).contains(element)
      else
      CollectionsKt.indexOf((java.lang.Iterable<? extends Object>)`$this$contains`, element) >= 0
   }

@InlineOnly
public inline fun <T> List<Any>.elementAtOrNull(index: Int): Any? {
   return (T)CollectionsKt.getOrNull(`$this$elementAtOrNull`, index)
}

@SinceKotlin(version = "1.4")
@JvmName(name = "flatMapSequence")
@OverloadResolutionByLambdaReturnType
public inline fun <T, R> Iterable<Any>.flatMap(transform: (Any) -> Sequence<Any>): List<Any> {
   val `destination$iv`: java.util.Collection = ArrayList()

   for (`element$iv` in `$this$flatMap`) {
      CollectionsKt.addAll(`destination$iv`, transform(`element$iv`) as Sequence)
   }

   return `destination$iv` as MutableList<R>
}

open fun CollectionsKt___CollectionsKt() {
}

public fun <T> Collection<Any>.toMutableList(): MutableList<Any> {
   return ArrayList(`$this$toMutableList`)
}

@InlineOnly
@SinceKotlin(version = "1.4")
@JvmName(name = "flatMapIndexedIterableTo")
@OverloadResolutionByLambdaReturnType
public inline fun <T, R, C : MutableCollection<in Any>> Iterable<Any>.flatMapIndexedTo(destination: Any, transform: (Int, Any) -> Iterable<Any>): Any {
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

@SinceKotlin(version = "1.4")
public inline fun <T, R> Iterable<Any>.runningFoldIndexed(initial: Any, operation: (Int, Any, Any) -> Any): List<Any> {
   val estimatedSize: Int = CollectionsKt.collectionSizeOrDefault(`$this$runningFoldIndexed`, 9)
   if (estimatedSize == 0) {
      return (java.util.List<R>)CollectionsKt.listOf(initial)
   } else {
      val index: ArrayList = ArrayList(estimatedSize + 1)
      index.add(initial)
      val result: ArrayList = index
      var var10: Int = 0
      var var11: Any = initial

      for (element in `$this$runningFoldIndexed`) {
         var11 = operation(var10++, var11, element)
         result.add(var11)
      }

      return result
   }
}

@InlineOnly
public inline operator fun <T> List<Any>.component4(): Any {
   return (T)`$this$component4`.get(3)
}

@JvmName(name = "averageOfDouble")
public fun Iterable<Double>.average(): Double {
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
public inline fun <T, R : Comparable<Any>> Iterable<Any>.maxByOrNull(selector: (Any) -> Any): Any? {
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

@SinceKotlin(version = "1.4")
public fun Iterable<Double>.maxOrNull(): Double? {
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

public fun <T> Iterable<Any>.lastIndexOf(element: Any): Int {
   if (`$this$lastIndexOf` is java.util.List) {
      return (`$this$lastIndexOf` as java.util.List).lastIndexOf(element)
   } else {
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
}

public inline fun <T, R, C : MutableCollection<in Any>> Iterable<Any>.mapTo(destination: Any, transform: (Any) -> Any): Any {
   for (item in `$this$mapTo`) {
      destination.add(transform(item))
   }

   return (C)destination
}

public inline fun <T> Iterable<Any>.filterNot(predicate: (Any) -> Boolean): List<Any> {
   val `destination$iv`: java.util.Collection = ArrayList()

   for (`element$iv` in `$this$filterNot`) {
      if (!predicate(`element$iv`) as java.lang.Boolean) {
         `destination$iv`.add(`element$iv`)
      }
   }

   return `destination$iv` as MutableList<T>
}

public fun <T> Iterable<Any>.withIndex(): Iterable<IndexedValue<Any>> {
   return IndexingIterable(   // $VF: Compiled from _Collections.kt
{
      return $this$withIndex.iterator()
   } as Function0)
}

public fun <T> Iterable<Any>.take(n: Int): List<Any> {
   if (n < 0) {
      throw IllegalArgumentException(("Requested element count $n is less than zero.").toString())
   } else if (n == 0) {
      return CollectionsKt.emptyList()
   } else {
      if (`$this$take` is java.util.Collection) {
         if (n >= (`$this$take` as java.util.Collection).size()) {
            return CollectionsKt.toList(`$this$take`)
         }

         if (n == 1) {
            return (java.util.List<T>)CollectionsKt.listOf(CollectionsKt.first(`$this$take`))
         }
      }

      val var6: Int = 0
      val list: ArrayList = ArrayList(n)

      for (item in `$this$take`) {
         list.add(item)
         if (++var6 == n) {
            break
         }
      }

      return CollectionsKt.optimizeReadOnlyList(list)
   }
}

@JvmName(name = "averageOfFloat")
public fun Iterable<Float>.average(): Double {
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

public operator fun <T> Collection<Any>.plus(elements: Array<out Any>): List<Any> {
   val result: ArrayList = ArrayList(`$this$plus`.size() + elements.length)
   result.addAll(`$this$plus`)
   CollectionsKt.addAll(result, elements)
   return result
}

public fun <T> List<Any>.indexOf(element: Any): Int {
   return `$this$indexOf`.indexOf(element)
}

@JvmName(name = "averageOfShort")
public fun Iterable<Short>.average(): Double {
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

@JvmName(name = "sumOfDouble")
public fun Iterable<Double>.sum(): Double {
   var sum: Double = 0.0
   val var3: java.util.Iterator = `$this$sum`.iterator()

   while (var3.hasNext()) {
      sum += (var3.next() as java.lang.Number).doubleValue()
   }

   return sum
}

public inline fun <T, R : Comparable<Any>> Iterable<Any>.sortedByDescending(crossinline selector: (Any) -> Any?): List<Any> {
   return CollectionsKt.sortedWith(`$this$sortedByDescending`,    // $VF: Compiled from Comparisons.kt
{ a: Any, b: Any ->
      val var3: Function1 = selector
      return ComparisonsKt.compareValues((T)(selector(b) as java.lang.Comparable), (T)(var3(a) as java.lang.Comparable))
   })
}

@SinceKotlin(version = "1.2")
public fun <T> Iterable<Any>.chunked(size: Int): List<List<Any>> {
   return CollectionsKt.windowed(`$this$chunked`, size, size, true)
}

public fun <T> Iterable<Any>.toMutableSet(): MutableSet<Any> {
   return if (`$this$toMutableSet` is java.util.Collection)
      LinkedHashSet(`$this$toMutableSet` as java.util.Collection)
      else
      CollectionsKt.toCollection(`$this$toMutableSet`, LinkedHashSet()) as java.util.Set
   }

public inline fun <T> List<Any>.indexOfFirst(predicate: (Any) -> Boolean): Int {
   var index: Int = 0

   for (item in `$this$indexOfFirst`) {
      if (predicate(item) as java.lang.Boolean) {
         return index
      }

      index++
   }

   return -1
}

@InlineOnly
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
public inline fun <T> Iterable<Any>.minOfOrNull(selector: (Any) -> Double): Double? {
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

@OverloadResolutionByLambdaReturnType
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun <T> Iterable<Any>.maxOfOrNull(selector: (Any) -> Float): Float? {
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

@SinceKotlin(version = "1.4")
public inline fun <T, R> Iterable<Any>.runningFold(initial: Any, operation: (Any, Any) -> Any): List<Any> {
   val estimatedSize: Int = CollectionsKt.collectionSizeOrDefault(`$this$runningFold`, 9)
   if (estimatedSize == 0) {
      return (java.util.List<R>)CollectionsKt.listOf(initial)
   } else {
      val accumulator: ArrayList = ArrayList(estimatedSize + 1)
      accumulator.add(initial)
      val result: ArrayList = accumulator
      var var9: Any = initial

      for (var11 in `$this$runningFold`) {
         var9 = operation(var9, var11)
         result.add(var9)
      }

      return result
   }
}

public fun <T> List<Any>.slice(indices: IntRange): List<Any> {
   return if (indices.isEmpty()) CollectionsKt.emptyList() else CollectionsKt.toList(`$this$slice`.subList(indices.start, indices.endInclusive + 1))
}

@SinceKotlin(version = "1.3")
public fun <T> Collection<Any>.random(random: Random): Any {
   if (`$this$random`.isEmpty()) {
      throw NoSuchElementException("Collection is empty.")
   } else {
      return (T)CollectionsKt.elementAt((java.lang.Iterable)`$this$random`, random.nextInt(`$this$random`.size()))
   }
}

public fun <T> Iterable<Any>.toMutableList(): MutableList<Any> {
   return if (`$this$toMutableList` is java.util.Collection)
      CollectionsKt.toMutableList(`$this$toMutableList` as java.util.Collection)
      else
      CollectionsKt.toCollection(`$this$toMutableList`, ArrayList()) as java.util.List
   }

@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@JvmName(name = "sumOfUInt")
@InlineOnly
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.5")
public inline fun <T> Iterable<Any>.sumOf(selector: (Any) -> UInt): UInt {
   var sum: Int = UInt.constructor_impl/* $VF was: constructor-impl */(0)

   for (element in `$this$sumOf`) {
      sum = UInt.constructor_impl/* $VF was: constructor-impl */(sum + (selector(element) as UInt).unbox_impl/* $VF was: unbox-impl */())
   }

   return sum
}

public inline fun <T, K, V, M : MutableMap<in Any, in Any>> Iterable<Any>.associateTo(destination: Any, transform: (Any) -> Pair<Any, Any>): Any {
   for (element in `$this$associateTo`) {
      val var7: Pair = transform(element) as Pair
      destination.put(var7.first, var7.second)
   }

   return (M)destination
}

public operator fun <T> Iterable<Any>.minus(elements: Iterable<Any>): List<Any> {
   val other: java.util.Collection = CollectionsKt.convertToListIfNotCollection(elements)
   if (other.isEmpty()) {
      return CollectionsKt.toList(`$this$minus`)
   } else {
      val `destination$iv$iv`: java.util.Collection = ArrayList()

      for (`element$iv$iv` in `$this$minus`) {
         if (!other.contains(`element$iv$iv`)) {
            `destination$iv$iv`.add(`element$iv$iv`)
         }
      }

      return `destination$iv$iv` as MutableList<T>
   }
}

public inline fun <T, K, V, M : MutableMap<in Any, MutableList<Any>>> Iterable<Any>.groupByTo(
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

@JvmName(name = "maxOrThrow")
@SinceKotlin(version = "1.7")
public fun Iterable<Double>.max(): Double {
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

@SinceKotlin(version = "1.4")
@InlineOnly
@OverloadResolutionByLambdaReturnType
public inline fun <T, R> Iterable<Any>.minOfWithOrNull(comparator: Comparator<in Any>, selector: (Any) -> Any): Any? {
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
public fun Iterable<Double>.minOrNull(): Double? {
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

@SinceKotlin(version = "1.1")
public inline fun <T, C : Iterable<Any>> Any.onEach(action: (Any) -> Unit): Any {
   for (element in `$this$onEach`) {
      action(element)
   }

   return (C)`$this$onEach`
}

public inline fun <T, K> Iterable<Any>.groupBy(keySelector: (Any) -> Any): Map<Any, List<Any>> {
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

@JvmName(name = "minOrThrow")
@SinceKotlin(version = "1.7")
public fun Iterable<Float>.min(): Float {
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

public inline fun <T, K, V> Iterable<Any>.associate(transform: (Any) -> Pair<Any, Any>): Map<Any, Any> {
   val `destination$iv`: java.util.Map = LinkedHashMap(
      RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(`$this$associate`, 10)), 16)
   )

   for (`element$iv` in `$this$associate`) {
      val var10: Pair = transform(`element$iv`) as Pair
      `destination$iv`.put(var10.first, var10.second)
   }

   return `destination$iv`
}

public inline fun <T> Iterable<Any>.dropWhile(predicate: (Any) -> Boolean): List<Any> {
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

public fun <T> Iterable<Any>.toList(): List<Any> {
   if (`$this$toList` is java.util.Collection) {
      var var10000: java.util.List
      when ((`$this$toList` as java.util.Collection).size()) {
         0 -> var10000 = CollectionsKt.emptyList()
         1 -> var10000 = CollectionsKt.listOf(
               if (`$this$toList` is java.util.List) (`$this$toList` as java.util.List).get(0) else `$this$toList`.iterator().next()
            )
         else -> var10000 = CollectionsKt.toMutableList(`$this$toList` as java.util.Collection)
      }

      return var10000
   } else {
      return CollectionsKt.optimizeReadOnlyList(CollectionsKt.toMutableList(`$this$toList`))
   }
}

public fun Collection<Double>.toDoubleArray(): DoubleArray {
   val result: DoubleArray = DoubleArray(`$this$toDoubleArray`.size())
   var index: Int = 0
   val var3: java.util.Iterator = `$this$toDoubleArray`.iterator()

   while (var3.hasNext()) {
      result[index++] = (var3.next() as java.lang.Number).doubleValue()
   }

   return result
}

@InlineOnly
public inline fun <T> Iterable<Any>.find(predicate: (Any) -> Boolean): Any? {
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

public fun <T> Iterable<Any>.elementAtOrNull(index: Int): Any? {
   if (`$this$elementAtOrNull` is java.util.List) {
      return (T)CollectionsKt.getOrNull(`$this$elementAtOrNull` as java.util.List, index)
   } else if (index < 0) {
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

public operator fun <T> Iterable<Any>.plus(element: Any): List<Any> {
   if (`$this$plus` is java.util.Collection) {
      return (java.util.List<T>)CollectionsKt.plus(`$this$plus` as MutableCollection<Any>, (Object)element)
   } else {
      val result: ArrayList = ArrayList()
      CollectionsKt.addAll(result, `$this$plus`)
      result.add(element)
      return result
   }
}

@SinceKotlin(version = "1.4")
@InlineOnly
@OverloadResolutionByLambdaReturnType
public inline fun <T, R : Comparable<Any>> Iterable<Any>.maxOf(selector: (Any) -> Any): Any {
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

@InlineOnly
@SinceKotlin(version = "1.5")
public inline fun <T, R : Any> Iterable<Any>.firstNotNullOfOrNull(transform: (Any) -> Any?): Any? {
   for (element in `$this$firstNotNullOfOrNull`) {
      val result: Any = transform(element)
      if (result != null) {
         return (R)result
      }
   }

   return null
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.4")
public fun <T> Collection<Any>.randomOrNull(random: Random): Any? {
   return (T)(if (`$this$randomOrNull`.isEmpty())
      null
      else
      CollectionsKt.elementAt((java.lang.Iterable)`$this$randomOrNull`, random.nextInt(`$this$randomOrNull`.size())))
}

public inline fun <S, T : Any> List<Any>.reduceRightIndexed(operation: (Int, Any, Any) -> Any): Any {
   val iterator: java.util.ListIterator = `$this$reduceRightIndexed`.listIterator(`$this$reduceRightIndexed`.size())
   if (!iterator.hasPrevious()) {
      throw UnsupportedOperationException("Empty list can't be reduced.")
   } else {
      var accumulator: Any = iterator.previous()

      while (iterator.hasPrevious()) {
         accumulator = operation(iterator.previousIndex(), iterator.previous(), accumulator)
      }

      return (S)accumulator
   }
}

@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun <T> Collection<Any>.random(): Any {
   return (T)CollectionsKt.random(`$this$random`, Random.Default)
}

@InlineOnly
public inline fun <T> Iterable<Any>.minusElement(element: Any): List<Any> {
   return (java.util.List<T>)CollectionsKt.minus(`$this$minusElement`, (Object)element)
}

public fun Collection<Long>.toLongArray(): LongArray {
   val result: LongArray = LongArray(`$this$toLongArray`.size())
   var index: Int = 0
   val var3: java.util.Iterator = `$this$toLongArray`.iterator()

   while (var3.hasNext()) {
      result[index++] = (var3.next() as java.lang.Number).longValue()
   }

   return result
}

@JvmName(name = "sumOfByte")
public fun Iterable<Byte>.sum(): Int {
   var sum: Byte = 0
   val var2: java.util.Iterator = `$this$sum`.iterator()

   while (var2.hasNext()) {
      sum += (var2.next() as java.lang.Number).byteValue()
   }

   return sum
}

public fun <T> List<Any>.dropLast(n: Int): List<Any> {
   if (n < 0) {
      throw IllegalArgumentException(("Requested element count $n is less than zero.").toString())
   } else {
      return CollectionsKt.take(`$this$dropLast`, RangesKt.coerceAtLeast(`$this$dropLast`.size() - n, 0))
   }
}

public infix fun <T> Iterable<Any>.union(other: Iterable<Any>): Set<Any> {
   val set: java.util.Set = CollectionsKt.toMutableSet(`$this$union`)
   CollectionsKt.addAll(set, other)
   return set
}

@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
@InlineOnly
public inline fun <T> Iterable<Any>.minOf(selector: (Any) -> Double): Double {
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

@SinceKotlin(version = "1.1")
public inline fun <T, K> Iterable<Any>.groupingBy(crossinline keySelector: (Any) -> Any): Grouping<Any, Any> {
   return    // $VF: Compiled from _Collections.kt
object : Grouping<Any, Any> {
      public override fun sourceIterator(): Iterator<Any> {
         return $this$groupingBy.iterator()
      }

      public override fun keyOf(element: Any): Any {
         return (K)keySelector(element)
      }
   }
}

@DeprecatedSinceKotlin(warningSince = "1.5")
@Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = []))
public inline fun <T> Iterable<Any>.sumByDouble(selector: (Any) -> Double): Double {
   var sum: Double = 0.0

   for (element in `$this$sumByDouble`) {
      sum += (selector(element) as java.lang.Number).doubleValue()
   }

   return sum
}

public fun <T> Iterable<Any>.reversed(): List<Any> {
   if (`$this$reversed` is java.util.Collection && (`$this$reversed` as java.util.Collection).size() <= 1) {
      return CollectionsKt.toList(`$this$reversed`)
   } else {
      val list: java.util.List = CollectionsKt.toMutableList(`$this$reversed`)
      CollectionsKt.reverse(list)
      return list
   }
}

@SinceKotlin(version = "1.4")
public fun Iterable<Float>.minOrNull(): Float? {
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

@SinceKotlin(version = "1.4")
public fun <T : Comparable<Any>> Iterable<Any>.maxOrNull(): Any? {
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

public fun <T> List<Any>.takeLast(n: Int): List<Any> {
   if (n < 0) {
      throw IllegalArgumentException(("Requested element count $n is less than zero.").toString())
   } else if (n == 0) {
      return CollectionsKt.emptyList()
   } else {
      val var6: Int = `$this$takeLast`.size()
      if (n >= var6) {
         return CollectionsKt.toList(`$this$takeLast`)
      } else if (n == 1) {
         return (java.util.List<T>)CollectionsKt.listOf(CollectionsKt.last(`$this$takeLast`))
      } else {
         val list: ArrayList = ArrayList(n)
         if (`$this$takeLast` is RandomAccess) {
            for (index in var6 - n..var6) {
               list.add(`$this$takeLast`.get(index))
            }
         } else {
            val var9: java.util.Iterator = `$this$takeLast`.listIterator(var6 - n)

            while (var9.hasNext()) {
               list.add(var9.next())
            }
         }

         return list
      }
   }
}

public inline fun <T, K> Iterable<Any>.associateBy(keySelector: (Any) -> Any): Map<Any, Any> {
   val `destination$iv`: java.util.Map = LinkedHashMap(
      RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(`$this$associateBy`, 10)), 16)
   )

   for (`element$iv` in `$this$associateBy`) {
      `destination$iv`.put(keySelector(`element$iv`), `element$iv`)
   }

   return `destination$iv`
}

public inline fun <S, T : Any> List<Any>.reduceRight(operation: (Any, Any) -> Any): Any {
   val iterator: java.util.ListIterator = `$this$reduceRight`.listIterator(`$this$reduceRight`.size())
   if (!iterator.hasPrevious()) {
      throw UnsupportedOperationException("Empty list can't be reduced.")
   } else {
      var accumulator: Any = iterator.previous()

      while (iterator.hasPrevious()) {
         accumulator = operation(iterator.previous(), accumulator)
      }

      return (S)accumulator
   }
}

public fun Collection<Short>.toShortArray(): ShortArray {
   val result: ShortArray = ShortArray(`$this$toShortArray`.size())
   var index: Int = 0
   val var3: java.util.Iterator = `$this$toShortArray`.iterator()

   while (var3.hasNext()) {
      result[index++] = (var3.next() as java.lang.Number).shortValue()
   }

   return result
}

public inline fun <T, R, C : MutableCollection<in Any>> Iterable<Any>.flatMapTo(destination: Any, transform: (Any) -> Iterable<Any>): Any {
   for (element in `$this$flatMapTo`) {
      CollectionsKt.addAll(destination, transform(element) as java.lang.Iterable)
   }

   return (C)destination
}

@SinceKotlin(version = "1.2")
public fun <T, R> Iterable<Any>.chunked(size: Int, transform: (List<Any>) -> Any): List<Any> {
   return CollectionsKt.windowed(`$this$chunked`, size, size, true, transform)
}

public inline fun <T, R> Iterable<Any>.foldIndexed(initial: Any, operation: (Int, Any, Any) -> Any): Any {
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

public fun <T> Iterable<Any>.last(): Any {
   if (`$this$last` is java.util.List) {
      return (T)CollectionsKt.last(`$this$last` as java.util.List)
   } else {
      val iterator: java.util.Iterator = `$this$last`.iterator()
      if (!iterator.hasNext()) {
         throw NoSuchElementException("Collection is empty.")
      } else {
         var last: Any = iterator.next()

         while (iterator.hasNext()) {
            last = iterator.next()
         }

         return (T)last
      }
   }
}

@SinceKotlin(version = "1.2")
public inline fun <T, R> Iterable<Any>.zipWithNext(transform: (Any, Any) -> Any): List<Any> {
   val iterator: java.util.Iterator = `$this$zipWithNext`.iterator()
   if (!iterator.hasNext()) {
      return CollectionsKt.emptyList()
   } else {
      val result: java.util.List = ArrayList()
      var current: Any = iterator.next()

      while (iterator.hasNext()) {
         val next: Any = iterator.next()
         result.add(transform(current, next))
         current = next
      }

      return result
   }
}

@InlineOnly
public inline operator fun <T> List<Any>.component5(): Any {
   return (T)`$this$component5`.get(4)
}

@InlineOnly
public inline operator fun <T> List<Any>.component3(): Any {
   return (T)`$this$component3`.get(2)
}

@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public inline fun <T, R> Iterable<Any>.scanIndexed(initial: Any, operation: (Int, Any, Any) -> Any): List<Any> {
   val `estimatedSize$iv`: Int = CollectionsKt.collectionSizeOrDefault(`$this$scanIndexed`, 9)
   val var10000: java.util.List
   if (`estimatedSize$iv` == 0) {
      var10000 = CollectionsKt.listOf(initial)
   } else {
      val `index$iv`: Int = (int)ArrayList(`estimatedSize$iv` + 1)
      `index$iv`.add(initial)
      val `result$iv`: Any = `index$iv`
      var var12: Int = 0
      var var13: Any = initial

      for (`element$iv` in `$this$scanIndexed`) {
         var13 = operation(var12++, var13, `element$iv`)
         `result$iv`.add(var13)
      }

      var10000 = `result$iv` as java.util.List
   }

   return var10000
}

@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@InlineOnly
public inline fun <T> Collection<Any>.randomOrNull(): Any? {
   return (T)CollectionsKt.randomOrNull(`$this$randomOrNull`, Random.Default)
}

public fun <T> List<Any>.lastIndexOf(element: Any): Int {
   return `$this$lastIndexOf`.lastIndexOf(element)
}

@JvmName(name = "flatMapIndexedSequence")
@OverloadResolutionByLambdaReturnType
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun <T, R> Iterable<Any>.flatMapIndexed(transform: (Int, Any) -> Sequence<Any>): List<Any> {
   val var3: java.util.Collection = ArrayList()
   var var4: Int = 0

   for (var6 in `$this$flatMapIndexed`) {
      val var7: Int = var4++
      if (var7 < 0) {
         if (!PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
            throw ArithmeticException("Index overflow has happened.")
         }

         CollectionsKt.throwIndexOverflow()
      }

      CollectionsKt.addAll(var3, transform(var7, var6) as Sequence)
   }

   return var3 as MutableList<R>
}

public fun <T : Comparable<Any>> Iterable<Any>.sorted(): List<Any> {
   if (`$this$sorted` is java.util.Collection) {
      if ((`$this$sorted` as java.util.Collection).size() <= 1) {
         return CollectionsKt.toList(`$this$sorted`)
      } else {
         val var5: Array<Any> = (`$this$sorted` as java.util.Collection).toArray(arrayOfNulls(0))
         ArraysKt.sort(var5 as Array<java.lang.Comparable>)
         return (java.util.List<T>)ArraysKt.asList(var5)
      }
   } else {
      val `$this$toTypedArray$iv`: java.util.List = CollectionsKt.toMutableList(`$this$sorted`)
      CollectionsKt.sort(`$this$toTypedArray$iv`)
      return `$this$toTypedArray$iv`
   }
}

public fun <T : Any> Iterable<Any?>.requireNoNulls(): Iterable<Any> {
   for (element in `$this$requireNoNulls`) {
      if (element == null) {
         throw IllegalArgumentException("null element found in $`$this$requireNoNulls`.")
      }
   }

   return `$this$requireNoNulls`
}

@InlineOnly
@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
public inline fun <T> Iterable<Any>.minOf(selector: (Any) -> Float): Float {
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

@JvmName(name = "sumOfFloat")
public fun Iterable<Float>.sum(): Float {
   var sum: Float = 0.0F
   val var2: java.util.Iterator = `$this$sum`.iterator()

   while (var2.hasNext()) {
      sum += (var2.next() as java.lang.Number).floatValue()
   }

   return sum
}

@HidesMembers
public inline fun <T> Iterable<Any>.forEach(action: (Any) -> Unit) {
   for (element in `$this$forEach`) {
      action(element)
   }
}

public inline fun <T> Iterable<Any>.single(predicate: (Any) -> Boolean): Any {
   var single: Any = null
   var found: Boolean = false

   for (element in `$this$single`) {
      if (predicate(element) as java.lang.Boolean) {
         if (found) {
            throw IllegalArgumentException("Collection contains more than one matching element.")
         }

         single = element
         found = true
      }
   }

   if (!found) {
      throw NoSuchElementException("Collection contains no element matching the predicate.")
   } else {
      return (T)single
   }
}

@JvmName(name = "minByOrThrow")
@SinceKotlin(version = "1.7")
public inline fun <T, R : Comparable<Any>> Iterable<Any>.minBy(selector: (Any) -> Any): Any {
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

public inline fun <T> Iterable<Any>.indexOfLast(predicate: (Any) -> Boolean): Int {
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

@SinceKotlin(version = "1.4")
public inline fun <S, T : Any> Iterable<Any>.runningReduceIndexed(operation: (Int, Any, Any) -> Any): List<Any> {
   val iterator: java.util.Iterator = `$this$runningReduceIndexed`.iterator()
   if (!iterator.hasNext()) {
      return CollectionsKt.emptyList()
   } else {
      var var9: Any = iterator.next()
      val index: Int = (int)ArrayList(CollectionsKt.collectionSizeOrDefault(`$this$runningReduceIndexed`, 10))
      index.add(var9)
      val result: Any = index
      var var10: Int = 1

      while (iterator.hasNext()) {
         var9 = operation(var10++, var9, iterator.next())
         result.add(var9)
      }

      return result as MutableList<S>
   }
}

@InlineOnly
public inline fun <T> List<Any>.findLast(predicate: (Any) -> Boolean): Any? {
   val `iterator$iv`: java.util.ListIterator = `$this$findLast`.listIterator(`$this$findLast`.size())

   var var10000: Any
   while (true) {
      if (`iterator$iv`.hasPrevious()) {
         val `element$iv`: Any = `iterator$iv`.previous()
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

public inline fun <T> Iterable<Any>.all(predicate: (Any) -> Boolean): Boolean {
   if (`$this$all` is java.util.Collection && (`$this$all` as java.util.Collection).isEmpty()) {
      return true
   } else {
      for (element in `$this$all`) {
         if (!predicate(element) as java.lang.Boolean) {
            return false
         }
      }

      return true
   }
}

public inline fun <T> Iterable<Any>.takeWhile(predicate: (Any) -> Boolean): List<Any> {
   val list: ArrayList = ArrayList()

   for (item in `$this$takeWhile`) {
      if (!predicate(item) as java.lang.Boolean) {
         break
      }

      list.add(item)
   }

   return list
}

@JvmName(name = "sumOfInt")
public fun Iterable<Int>.sum(): Int {
   var sum: Int = 0
   val var2: java.util.Iterator = `$this$sum`.iterator()

   while (var2.hasNext()) {
      sum += (var2.next() as java.lang.Number).intValue()
   }

   return sum
}

public fun <T : Comparable<Any>> Iterable<Any>.sortedDescending(): List<Any> {
   return CollectionsKt.sortedWith(`$this$sortedDescending`, ComparisonsKt.reverseOrder())
}

public fun Collection<Boolean>.toBooleanArray(): BooleanArray {
   val result: BooleanArray = BooleanArray(`$this$toBooleanArray`.size())
   var index: Int = 0

   for (element in `$this$toBooleanArray`) {
      result[index++] = element
   }

   return result
}

public fun Collection<Int>.toIntArray(): IntArray {
   val result: IntArray = IntArray(`$this$toIntArray`.size())
   var index: Int = 0
   val var3: java.util.Iterator = `$this$toIntArray`.iterator()

   while (var3.hasNext()) {
      result[index++] = (var3.next() as java.lang.Number).intValue()
   }

   return result
}

public inline fun <T> Iterable<Any>.filter(predicate: (Any) -> Boolean): List<Any> {
   val `destination$iv`: java.util.Collection = ArrayList()

   for (`element$iv` in `$this$filter`) {
      if (predicate(`element$iv`) as java.lang.Boolean) {
         `destination$iv`.add(`element$iv`)
      }
   }

   return `destination$iv` as MutableList<T>
}

@InlineOnly
@JvmName(name = "sumOfULong")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@SinceKotlin(version = "1.5")
@OverloadResolutionByLambdaReturnType
public inline fun <T> Iterable<Any>.sumOf(selector: (Any) -> ULong): ULong {
   var sum: Long = ULong.constructor_impl/* $VF was: constructor-impl */(0L)

   for (element in `$this$sumOf`) {
      sum = ULong.constructor_impl/* $VF was: constructor-impl */(sum + (selector(element) as ULong).unbox_impl/* $VF was: unbox-impl */())
   }

   return sum
}

public fun <T : Any> List<Any?>.requireNoNulls(): List<Any> {
   for (element in `$this$requireNoNulls`) {
      if (element == null) {
         throw IllegalArgumentException("null element found in $`$this$requireNoNulls`.")
      }
   }

   return `$this$requireNoNulls`
}

public fun <T> Iterable<Any>.elementAt(index: Int): Any {
   return (T)(if (`$this$elementAt` is java.util.List)
      (`$this$elementAt` as java.util.List).get(index)
      else
      CollectionsKt.elementAtOrElse((java.lang.Iterable)`$this$elementAt`, index,    // $VF: Compiled from _Collections.kt
   { it: Int ->
         throw IndexOutOfBoundsException("Collection doesn't contain element at index $index.")
      } as Function1))
}

public inline fun <T> Iterable<Any>.none(predicate: (Any) -> Boolean): Boolean {
   if (`$this$none` is java.util.Collection && (`$this$none` as java.util.Collection).isEmpty()) {
      return true
   } else {
      for (element in `$this$none`) {
         if (predicate(element) as java.lang.Boolean) {
            return false
         }
      }

      return true
   }
}

@JvmName(name = "averageOfLong")
public fun Iterable<Long>.average(): Double {
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

@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
@JvmName(name = "flatMapSequenceTo")
public inline fun <T, R, C : MutableCollection<in Any>> Iterable<Any>.flatMapTo(destination: Any, transform: (Any) -> Sequence<Any>): Any {
   for (element in `$this$flatMapTo`) {
      CollectionsKt.addAll(destination, transform(element) as Sequence)
   }

   return (C)destination
}

public fun <T> Iterable<Any>.asSequence(): Sequence<Any> {
   return CollectionsKt___CollectionsKt$asSequence$$inlined$Sequence$1(`$this$asSequence`)
}

public operator fun <T> Collection<Any>.plus(elements: Sequence<Any>): List<Any> {
   val result: ArrayList = ArrayList(`$this$plus`.size() + 10)
   result.addAll(`$this$plus`)
   CollectionsKt.addAll(result, elements)
   return result
}

public fun <T> List<Any>.lastOrNull(): Any? {
   return (T)(if (`$this$lastOrNull`.isEmpty()) null else `$this$lastOrNull`.get(`$this$lastOrNull`.size() - 1))
}

@SinceKotlin(version = "1.2")
public fun <T> Iterable<Any>.windowed(size: Int, step: Int = 1, partialWindows: Boolean = false): List<List<Any>> {
   SlidingWindowKt.checkWindowSizeStep(size, step)
   if (`$this$windowed` is RandomAccess && `$this$windowed` is java.util.List) {
      val var16: Int = (`$this$windowed` as java.util.List).size()
      val var18: ArrayList = ArrayList(var16 / step + (if (var16 % step == 0) 0 else 1))

      // $VF: Unable to resugar Kotlin loop from Java for loop
      var var19: Int = 0
      while (true) {
         if (0 <= var19 && var19 < var16) break
         val var20: Int = RangesKt.coerceAtMost(size, var16 - var19)
         if (var20 < size && !partialWindows) {
            break
         }

         val var21: ArrayList = ArrayList(var20)

         repeat(var20) { var22 ->
            var21.add((`$this$windowed` as java.util.List).get(var22 + var19))
         }

         var18.add(var21)

         var19 += step
      }

      return var18
   } else {
      val result: ArrayList = ArrayList()
      val index: java.util.Iterator = SlidingWindowKt.windowedIterator(`$this$windowed`.iterator(), size, step, partialWindows, false)

      while (index.hasNext()) {
         result.add(index.next() as java.util.List)
      }

      return result
   }
}

public inline fun <T, C : MutableCollection<in Any>> Iterable<Any>.filterTo(destination: Any, predicate: (Any) -> Boolean): Any {
   for (element in `$this$filterTo`) {
      if (predicate(element) as java.lang.Boolean) {
         destination.add(element)
      }
   }

   return (C)destination
}

@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
@InlineOnly
public inline fun <T> Iterable<Any>.maxOf(selector: (Any) -> Float): Float {
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

public inline fun <T> Iterable<Any>.singleOrNull(predicate: (Any) -> Boolean): Any? {
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

public fun <T> Iterable<Any>.singleOrNull(): Any? {
   if (`$this$singleOrNull` is java.util.List) {
      return (T)(if ((`$this$singleOrNull` as java.util.List).size() == 1) (`$this$singleOrNull` as java.util.List).get(0) else null)
   } else {
      val iterator: java.util.Iterator = `$this$singleOrNull`.iterator()
      if (!iterator.hasNext()) {
         return null
      } else {
         return (T)(if (iterator.hasNext()) null else iterator.next())
      }
   }
}

public fun <T> Iterable<Any>.single(): Any {
   if (`$this$single` is java.util.List) {
      return (T)CollectionsKt.single(`$this$single` as java.util.List)
   } else {
      val iterator: java.util.Iterator = `$this$single`.iterator()
      if (!iterator.hasNext()) {
         throw NoSuchElementException("Collection is empty.")
      } else {
         val single: Any = iterator.next()
         if (iterator.hasNext()) {
            throw IllegalArgumentException("Collection has more than one element.")
         } else {
            return (T)single
         }
      }
   }
}

public fun <T> Iterable<Any>.distinct(): List<Any> {
   return CollectionsKt.toList(CollectionsKt.toMutableSet(`$this$distinct`))
}

@InlineOnly
@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
@JvmName(name = "flatMapIndexedIterable")
public inline fun <T, R> Iterable<Any>.flatMapIndexed(transform: (Int, Any) -> Iterable<Any>): List<Any> {
   val var3: java.util.Collection = ArrayList()
   var var4: Int = 0

   for (var6 in `$this$flatMapIndexed`) {
      val var7: Int = var4++
      if (var7 < 0) {
         if (!PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
            throw ArithmeticException("Index overflow has happened.")
         }

         CollectionsKt.throwIndexOverflow()
      }

      CollectionsKt.addAll(var3, transform(var7, var6) as java.lang.Iterable)
   }

   return var3 as MutableList<R>
}

@JvmName(name = "averageOfInt")
public fun Iterable<Int>.average(): Double {
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

public fun <T : Any> Iterable<Any?>.filterNotNull(): List<Any> {
   return CollectionsKt.filterNotNullTo(`$this$filterNotNull`, ArrayList()) as MutableList<T>
}

public inline fun <T, R> Iterable<Any>.mapIndexed(transform: (Int, Any) -> Any): List<Any> {
   val `destination$iv`: java.util.Collection = ArrayList(CollectionsKt.collectionSizeOrDefault(`$this$mapIndexed`, 10))
   var `index$iv`: Int = 0

   for (`item$iv` in `$this$mapIndexed`) {
      val var9: Int = `index$iv`++
      if (var9 < 0) {
         if (!PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
            throw ArithmeticException("Index overflow has happened.")
         }

         CollectionsKt.throwIndexOverflow()
      }

      `destination$iv`.add(transform(var9, `item$iv`))
   }

   return `destination$iv` as MutableList<R>
}

public inline fun <T, R, V> Iterable<Any>.zip(other: Array<out Any>, transform: (Any, Any) -> Any): List<Any> {
   val arraySize: Int = other.length
   val list: ArrayList = ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(`$this$zip`, 10), other.length))
   var i: Int = 0

   for (element in `$this$zip`) {
      if (i >= arraySize) {
         break
      }

      list.add(transform(element, other[i++]))
   }

   return list
}

@InlineOnly
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
public inline fun <T, R : Comparable<Any>> Iterable<Any>.minOfOrNull(selector: (Any) -> Any): Any? {
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

public operator fun <T> Collection<Any>.plus(element: Any): List<Any> {
   val result: ArrayList = ArrayList(`$this$plus`.size() + 1)
   result.addAll(`$this$plus`)
   result.add(element)
   return result
}

@SinceKotlin(version = "1.7")
@JvmName(name = "maxByOrThrow")
public inline fun <T, R : Comparable<Any>> Iterable<Any>.maxBy(selector: (Any) -> Any): Any {
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

public inline fun <T, R : Any> Iterable<Any>.mapNotNull(transform: (Any) -> Any?): List<Any> {
   val `destination$iv`: java.util.Collection = ArrayList()

   for (`element$iv$iv` in `$this$mapNotNull`) {
      val var10000: Any = transform(`element$iv$iv`)
      if (var10000 != null) {
         `destination$iv`.add(var10000)
      }
   }

   return `destination$iv` as MutableList<R>
}

@SinceKotlin(version = "1.4")
public inline fun <S, T : Any> List<Any>.reduceRightIndexedOrNull(operation: (Int, Any, Any) -> Any): Any? {
   val iterator: java.util.ListIterator = `$this$reduceRightIndexedOrNull`.listIterator(`$this$reduceRightIndexedOrNull`.size())
   if (!iterator.hasPrevious()) {
      return null
   } else {
      var accumulator: Any = iterator.previous()

      while (iterator.hasPrevious()) {
         accumulator = operation(iterator.previousIndex(), iterator.previous(), accumulator)
      }

      return (S)accumulator
   }
}

public inline fun <T, R, C : MutableCollection<in Any>> Iterable<Any>.mapIndexedTo(destination: Any, transform: (Int, Any) -> Any): Any {
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

public fun <T> List<Any>.firstOrNull(): Any? {
   return (T)(if (`$this$firstOrNull`.isEmpty()) null else `$this$firstOrNull`.get(0))
}

@InlineOnly
@OverloadResolutionByLambdaReturnType
@JvmName(name = "flatMapIndexedSequenceTo")
@SinceKotlin(version = "1.4")
public inline fun <T, R, C : MutableCollection<in Any>> Iterable<Any>.flatMapIndexedTo(destination: Any, transform: (Int, Any) -> Sequence<Any>): Any {
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

@SinceKotlin(version = "1.4")
public fun <T : Comparable<Any>> Iterable<Any>.minOrNull(): Any? {
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

@SinceKotlin(version = "1.7")
@JvmName(name = "minOrThrow")
public fun <T : Comparable<Any>> Iterable<Any>.min(): Any {
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

public fun <T, C : MutableCollection<in Any>> Iterable<Any>.toCollection(destination: Any): Any {
   for (item in `$this$toCollection`) {
      destination.add(item)
   }

   return (C)destination
}

@SinceKotlin(version = "1.3")
public inline fun <K, V, M : MutableMap<in Any, in Any>> Iterable<Any>.associateWithTo(destination: Any, valueSelector: (Any) -> Any): Any {
   for (element in `$this$associateWithTo`) {
      destination.put(element, valueSelector(element))
   }

   return (M)destination
}

@JvmName(name = "sumOfInt")
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun <T> Iterable<Any>.sumOf(selector: (Any) -> Int): Int {
   var sum: Int = 0

   for (element in `$this$sumOf`) {
      sum += (selector(element) as java.lang.Number).intValue()
   }

   return sum
}

@JvmName(name = "maxOrThrow")
@SinceKotlin(version = "1.7")
public fun Iterable<Float>.max(): Float {
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

public fun <T> Iterable<Any>.joinToString(
   separator: CharSequence = ", " as java.lang.CharSequence,
   prefix: CharSequence = "" as java.lang.CharSequence,
   postfix: CharSequence = "" as java.lang.CharSequence,
   limit: Int = -1,
   truncated: CharSequence = "..." as java.lang.CharSequence,
   transform: ((Any) -> CharSequence)? = null
): String {
   val var10000: java.lang.String = CollectionsKt.joinTo(`$this$joinToString`, StringBuilder(), separator, prefix, postfix, limit, truncated, transform)
      .toString()
      return var10000
}

public infix fun <T> Iterable<Any>.subtract(other: Iterable<Any>): Set<Any> {
   val set: java.util.Set = CollectionsKt.toMutableSet(`$this$subtract`)
   CollectionsKt.removeAll(set, other)
   return set
}

@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public inline fun <T, R> Iterable<Any>.scan(initial: Any, operation: (Any, Any) -> Any): List<Any> {
   val `estimatedSize$iv`: Int = CollectionsKt.collectionSizeOrDefault(`$this$scan`, 9)
   val var10000: java.util.List
   if (`estimatedSize$iv` == 0) {
      var10000 = CollectionsKt.listOf(initial)
   } else {
      var `accumulator$iv`: Any = ArrayList(`estimatedSize$iv` + 1)
      `accumulator$iv`.add(initial)
      val `result$iv`: Any = `accumulator$iv`
      `accumulator$iv` = initial

      for (var13 in `$this$scan`) {
         `accumulator$iv` = operation(`accumulator$iv`, var13)
         `result$iv`.add(`accumulator$iv`)
      }

      var10000 = `result$iv` as java.util.List
   }

   return var10000
}

public inline fun <T> List<Any>.lastOrNull(predicate: (Any) -> Boolean): Any? {
   val iterator: java.util.ListIterator = `$this$lastOrNull`.listIterator(`$this$lastOrNull`.size())

   while (iterator.hasPrevious()) {
      val element: Any = iterator.previous()
      if (predicate(element) as java.lang.Boolean) {
         return (T)element
      }
   }

   return null
}

public operator fun <T> Iterable<Any>.plus(elements: Array<out Any>): List<Any> {
   if (`$this$plus` is java.util.Collection) {
      return (java.util.List<T>)CollectionsKt.plus(`$this$plus` as MutableCollection<Any>, elements)
   } else {
      val result: ArrayList = ArrayList()
      CollectionsKt.addAll(result, `$this$plus`)
      CollectionsKt.addAll(result, elements)
      return result
   }
}

public inline fun <T, C : MutableCollection<in Any>> Iterable<Any>.filterIndexedTo(destination: Any, predicate: (Int, Any) -> Boolean): Any {
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

public inline fun <T, R> Iterable<Any>.flatMap(transform: (Any) -> Iterable<Any>): List<Any> {
   val `destination$iv`: java.util.Collection = ArrayList()

   for (`element$iv` in `$this$flatMap`) {
      CollectionsKt.addAll(`destination$iv`, transform(`element$iv`) as java.lang.Iterable)
   }

   return `destination$iv` as MutableList<R>
}

public fun <T> List<Any>.slice(indices: Iterable<Int>): List<Any> {
   val size: Int = CollectionsKt.collectionSizeOrDefault(indices, 10)
   if (size == 0) {
      return CollectionsKt.emptyList()
   } else {
      val list: ArrayList = ArrayList(size)
      val var4: java.util.Iterator = indices.iterator()

      while (var4.hasNext()) {
         list.add(`$this$slice`.get((var4.next() as java.lang.Number).intValue()))
      }

      return list
   }
}

public inline fun <T> List<Any>.last(predicate: (Any) -> Boolean): Any {
   val iterator: java.util.ListIterator = `$this$last`.listIterator(`$this$last`.size())

   while (iterator.hasPrevious()) {
      val element: Any = iterator.previous()
      if (predicate(element) as java.lang.Boolean) {
         return (T)element
      }
   }

   throw NoSuchElementException("List contains no element matching the predicate.")
}

public inline fun <T, R> List<Any>.foldRight(initial: Any, operation: (Any, Any) -> Any): Any {
   var accumulator: Any = initial
   if (!`$this$foldRight`.isEmpty()) {
      val iterator: java.util.ListIterator = `$this$foldRight`.listIterator(`$this$foldRight`.size())

      while (iterator.hasPrevious()) {
         accumulator = operation(iterator.previous(), accumulator)
      }
   }

   return (R)accumulator
}

@SinceKotlin(version = "1.3")
public inline fun <K, V> Iterable<Any>.associateWith(valueSelector: (Any) -> Any): Map<Any, Any> {
   val result: LinkedHashMap = LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(`$this$associateWith`, 10)), 16))

   for (`element$iv` in `$this$associateWith`) {
      result.put(`element$iv`, valueSelector(`element$iv`))
   }

   return result
}

public fun <T> List<Any>.last(): Any {
   if (`$this$last`.isEmpty()) {
      throw NoSuchElementException("List is empty.")
   } else {
      return (T)`$this$last`.get(CollectionsKt.getLastIndex(`$this$last`))
   }
}

@JvmName(name = "sumOfLong")
public fun Iterable<Long>.sum(): Long {
   var sum: Long = 0L
   val var3: java.util.Iterator = `$this$sum`.iterator()

   while (var3.hasNext()) {
      sum += (var3.next() as java.lang.Number).longValue()
   }

   return sum
}

@OverloadResolutionByLambdaReturnType
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun <T> Iterable<Any>.maxOf(selector: (Any) -> Double): Double {
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
public fun Iterable<Double>.min(): Double {
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
