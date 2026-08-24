@file:JvmMultifileClass
@file:JvmName("MapsKt")

package kotlin.collections

import java.util.ArrayList
import java.util.Comparator
import java.util.NoSuchElementException
import kotlin.collections.Map.Entry
import kotlin.internal.HidesMembers
import kotlin.internal.InlineOnly

// $VF: Compiled from _Maps.kt
public fun <K, V> Map<out Any, Any>.none(): Boolean {
   return `$this$none`.isEmpty()
}

public inline fun <K, V> Map<out Any, Any>.none(predicate: (Entry<Any, Any>) -> Boolean): Boolean {
   if (`$this$none`.isEmpty()) {
      return true
   } else {
      for (element in `$this$none`.entrySet()) {
         if (predicate(element) as java.lang.Boolean) {
            return false
         }
      }

      return true
   }
}

public inline fun <K, V, R> Map<out Any, Any>.map(transform: (Entry<Any, Any>) -> Any): List<Any> {
   val `destination$iv`: java.util.Collection = ArrayList(`$this$map`.size())

   for (`item$iv` in `$this$map`.entrySet()) {
      `destination$iv`.add(transform(`item$iv`))
   }

   return `destination$iv` as MutableList<R>
}

open fun MapsKt___MapsKt() {
}

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun <K, V, R : Comparable<Any>> Map<out Any, Any>.maxOf(selector: (Entry<Any, Any>) -> Any): Any {
   val var2: java.util.Iterator = `$this$maxOf`.entrySet().iterator()
   if (!var2.hasNext()) {
      throw NoSuchElementException()
   } else {
      var var3: java.lang.Comparable = selector(var2.next()) as java.lang.Comparable

      while (var2.hasNext()) {
         val var4: java.lang.Comparable = selector(var2.next()) as java.lang.Comparable
         if (var3.compareTo(var4) < 0) {
            var3 = var4
         }
      }

      return (R)var3
   }
}

public inline fun <K, V, R> Map<out Any, Any>.flatMap(transform: (Entry<Any, Any>) -> Iterable<Any>): List<Any> {
   val `destination$iv`: java.util.Collection = ArrayList()

   for (`element$iv` in `$this$flatMap`.entrySet()) {
      CollectionsKt.addAll(`destination$iv`, transform(`element$iv`) as java.lang.Iterable)
   }

   return `destination$iv` as MutableList<R>
}

@InlineOnly
@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
public inline fun <K, V, R : Comparable<Any>> Map<out Any, Any>.maxOfOrNull(selector: (Entry<Any, Any>) -> Any): Any? {
   val var2: java.util.Iterator = `$this$maxOfOrNull`.entrySet().iterator()
   val var10000: java.lang.Comparable
   if (!var2.hasNext()) {
      var10000 = null
   } else {
      var var3: java.lang.Comparable = selector(var2.next()) as java.lang.Comparable

      while (var2.hasNext()) {
         val var4: java.lang.Comparable = selector(var2.next()) as java.lang.Comparable
         if (var3.compareTo(var4) < 0) {
            var3 = var4
         }
      }

      var10000 = var3
   }

   return (R)var10000
}

@SinceKotlin(version = "1.1")
public inline fun <K, V, M : Map<out Any, Any>> Any.onEach(action: (Entry<Any, Any>) -> Unit): Any {
   for (element in `$this$onEach`.entrySet()) {
      action(element)
   }

   return (M)`$this$onEach`
}

@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
@JvmName(name = "flatMapSequenceTo")
public inline fun <K, V, R, C : MutableCollection<in Any>> Map<out Any, Any>.flatMapTo(destination: Any, transform: (Entry<Any, Any>) -> Sequence<Any>): Any {
   for (element in `$this$flatMapTo`.entrySet()) {
      CollectionsKt.addAll(destination, transform(element) as Sequence)
   }

   return (C)destination
}

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun <K, V> Map<out Any, Any>.minOf(selector: (Entry<Any, Any>) -> Float): Float {
   val var2: java.util.Iterator = `$this$minOf`.entrySet().iterator()
   if (!var2.hasNext()) {
      throw NoSuchElementException()
   } else {
      var var3: Float = (selector(var2.next()) as java.lang.Number).floatValue()

      while (var2.hasNext()) {
         var3 = Math.min(var3, (selector(var2.next()) as java.lang.Number).floatValue())
      }

      return var3
   }
}

public fun <K, V> Map<out Any, Any>.toList(): List<Pair<Any, Any>> {
   if (`$this$toList`.size() == 0) {
      return CollectionsKt.emptyList()
   } else {
      val iterator: java.util.Iterator = `$this$toList`.entrySet().iterator()
      if (!iterator.hasNext()) {
         return CollectionsKt.emptyList()
      } else {
         val first: java.util.Map.Entry = iterator.next() as java.util.Map.Entry
         if (!iterator.hasNext()) {
            return CollectionsKt.listOf(Pair<>(first.getKey(), first.getValue()))
         } else {
            val result: ArrayList = ArrayList(`$this$toList`.size())
            result.add(Pair<>(first.getKey(), first.getValue()))

            do {
               val var6: java.util.Map.Entry = iterator.next() as java.util.Map.Entry
               result.add(Pair<>(var6.getKey(), var6.getValue()))
            } while (iterator.hasNext())

            return result
         }
      }
   }
}

@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun <K, V> Map<out Any, Any>.minWithOrNull(comparator: Comparator<in Entry<Any, Any>>): Entry<Any, Any>? {
   return CollectionsKt.minWithOrNull(`$this$minWithOrNull`.entrySet(), comparator) as MutableMap.MutableEntry<K, V>
}

public inline fun <K, V> Map<out Any, Any>.count(predicate: (Entry<Any, Any>) -> Boolean): Int {
   if (`$this$count`.isEmpty()) {
      return 0
   } else {
      var count: Int = 0

      for (element in `$this$count`.entrySet()) {
         if (predicate(element) as java.lang.Boolean) {
            count++
         }
      }

      return count
   }
}

@SinceKotlin(version = "1.5")
@InlineOnly
public inline fun <K, V, R : Any> Map<out Any, Any>.firstNotNullOfOrNull(transform: (Entry<Any, Any>) -> Any?): Any? {
   for (element in `$this$firstNotNullOfOrNull`.entrySet()) {
      val result: Any = transform(element)
      if (result != null) {
         return (R)result
      }
   }

   return null
}

@SinceKotlin(version = "1.7")
@InlineOnly
@JvmName(name = "maxByOrThrow")
public inline fun <K, V, R : Comparable<Any>> Map<out Any, Any>.maxBy(selector: (Entry<Any, Any>) -> Any): Entry<Any, Any> {
   val `iterator$iv`: java.util.Iterator = `$this$maxBy`.entrySet().iterator()
   if (!`iterator$iv`.hasNext()) {
      throw NoSuchElementException()
   } else {
      var `maxElem$iv`: Any = `iterator$iv`.next()
      val var10000: Any
      if (!`iterator$iv`.hasNext()) {
         var10000 = `maxElem$iv`
      } else {
         var `maxValue$iv`: java.lang.Comparable = selector(`maxElem$iv`) as java.lang.Comparable

         do {
            val `e$iv`: Any = `iterator$iv`.next()
            val `v$iv`: java.lang.Comparable = selector(`e$iv`) as java.lang.Comparable
            if (`maxValue$iv`.compareTo(`v$iv`) < 0) {
               `maxElem$iv` = `e$iv`
               `maxValue$iv` = `v$iv`
            }
         } while (`iterator$iv`.hasNext())

         var10000 = `maxElem$iv`
      }

      return var10000 as MutableMap.MutableEntry<K, V>
   }
}

@SinceKotlin(version = "1.7")
@JvmName(name = "maxWithOrThrow")
@InlineOnly
public inline fun <K, V> Map<out Any, Any>.maxWith(comparator: Comparator<in Entry<Any, Any>>): Entry<Any, Any> {
   return CollectionsKt.maxWithOrThrow(`$this$maxWith`.entrySet(), comparator) as MutableMap.MutableEntry<K, V>
}

@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun <K, V, R : Comparable<Any>> Map<out Any, Any>.minByOrNull(selector: (Entry<Any, Any>) -> Any): Entry<Any, Any>? {
   val `iterator$iv`: java.util.Iterator = `$this$minByOrNull`.entrySet().iterator()
   val var10000: Any
   if (!`iterator$iv`.hasNext()) {
      var10000 = null
   } else {
      var `minElem$iv`: Any = `iterator$iv`.next()
      if (!`iterator$iv`.hasNext()) {
         var10000 = `minElem$iv`
      } else {
         var `minValue$iv`: java.lang.Comparable = selector(`minElem$iv`) as java.lang.Comparable

         do {
            val `e$iv`: Any = `iterator$iv`.next()
            val `v$iv`: java.lang.Comparable = selector(`e$iv`) as java.lang.Comparable
            if (`minValue$iv`.compareTo(`v$iv`) > 0) {
               `minElem$iv` = `e$iv`
               `minValue$iv` = `v$iv`
            }
         } while (`iterator$iv`.hasNext())

         var10000 = `minElem$iv`
      }
   }

   return var10000 as MutableMap.MutableEntry<K, V>
}

@SinceKotlin(version = "1.7")
@JvmName(name = "minByOrThrow")
@InlineOnly
public inline fun <K, V, R : Comparable<Any>> Map<out Any, Any>.minBy(selector: (Entry<Any, Any>) -> Any): Entry<Any, Any> {
   val `iterator$iv`: java.util.Iterator = `$this$minBy`.entrySet().iterator()
   if (!`iterator$iv`.hasNext()) {
      throw NoSuchElementException()
   } else {
      var `minElem$iv`: Any = `iterator$iv`.next()
      val var10000: Any
      if (!`iterator$iv`.hasNext()) {
         var10000 = `minElem$iv`
      } else {
         var `minValue$iv`: java.lang.Comparable = selector(`minElem$iv`) as java.lang.Comparable

         do {
            val `e$iv`: Any = `iterator$iv`.next()
            val `v$iv`: java.lang.Comparable = selector(`e$iv`) as java.lang.Comparable
            if (`minValue$iv`.compareTo(`v$iv`) > 0) {
               `minElem$iv` = `e$iv`
               `minValue$iv` = `v$iv`
            }
         } while (`iterator$iv`.hasNext())

         var10000 = `minElem$iv`
      }

      return var10000 as MutableMap.MutableEntry<K, V>
   }
}

public inline fun <K, V, R, C : MutableCollection<in Any>> Map<out Any, Any>.mapTo(destination: Any, transform: (Entry<Any, Any>) -> Any): Any {
   for (item in `$this$mapTo`.entrySet()) {
      destination.add(transform(item))
   }

   return (C)destination
}

@InlineOnly
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
public inline fun <K, V, R> Map<out Any, Any>.minOfWithOrNull(comparator: Comparator<in Any>, selector: (Entry<Any, Any>) -> Any): Any? {
   val var3: java.util.Iterator = `$this$minOfWithOrNull`.entrySet().iterator()
   val var10000: Any
   if (!var3.hasNext()) {
      var10000 = null
   } else {
      var var4: Any = selector(var3.next())

      while (var3.hasNext()) {
         val var5: Any = selector(var3.next())
         if (comparator.compare(var4, var5) > 0) {
            var4 = var5
         }
      }

      var10000 = var4
   }

   return (R)var10000
}

@OverloadResolutionByLambdaReturnType
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun <K, V> Map<out Any, Any>.minOf(selector: (Entry<Any, Any>) -> Double): Double {
   val var2: java.util.Iterator = `$this$minOf`.entrySet().iterator()
   if (!var2.hasNext()) {
      throw NoSuchElementException()
   } else {
      var var3: Double = (selector(var2.next()) as java.lang.Number).doubleValue()

      while (var2.hasNext()) {
         var3 = Math.min(var3, (selector(var2.next()) as java.lang.Number).doubleValue())
      }

      return var3
   }
}

@OverloadResolutionByLambdaReturnType
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun <K, V, R : Comparable<Any>> Map<out Any, Any>.minOf(selector: (Entry<Any, Any>) -> Any): Any {
   val var2: java.util.Iterator = `$this$minOf`.entrySet().iterator()
   if (!var2.hasNext()) {
      throw NoSuchElementException()
   } else {
      var var3: java.lang.Comparable = selector(var2.next()) as java.lang.Comparable

      while (var2.hasNext()) {
         val var4: java.lang.Comparable = selector(var2.next()) as java.lang.Comparable
         if (var3.compareTo(var4) > 0) {
            var3 = var4
         }
      }

      return (R)var3
   }
}

@InlineOnly
@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
public inline fun <K, V> Map<out Any, Any>.maxOf(selector: (Entry<Any, Any>) -> Float): Float {
   val var2: java.util.Iterator = `$this$maxOf`.entrySet().iterator()
   if (!var2.hasNext()) {
      throw NoSuchElementException()
   } else {
      var var3: Float = (selector(var2.next()) as java.lang.Number).floatValue()

      while (var2.hasNext()) {
         var3 = Math.max(var3, (selector(var2.next()) as java.lang.Number).floatValue())
      }

      return var3
   }
}

@InlineOnly
@SinceKotlin(version = "1.7")
@JvmName(name = "minWithOrThrow")
public inline fun <K, V> Map<out Any, Any>.minWith(comparator: Comparator<in Entry<Any, Any>>): Entry<Any, Any> {
   return CollectionsKt.minWithOrThrow(`$this$minWith`.entrySet(), comparator) as MutableMap.MutableEntry<K, V>
}

@InlineOnly
@SinceKotlin(version = "1.5")
public inline fun <K, V, R : Any> Map<out Any, Any>.firstNotNullOf(transform: (Entry<Any, Any>) -> Any?): Any {
   val var2: java.util.Iterator = `$this$firstNotNullOf`.entrySet().iterator()

   var var10000: Any
   do {
      if (!var2.hasNext()) {
         var10000 = null
         break
      }

      var10000 = transform(var2.next() as java.util.Map.Entry)
   } while (var10000 == null)

   if (var10000 == null) {
      throw NoSuchElementException("No element of the map was transformed to a non-null value.")
   } else {
      return (R)var10000
   }
}

@OverloadResolutionByLambdaReturnType
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun <K, V> Map<out Any, Any>.minOfOrNull(selector: (Entry<Any, Any>) -> Float): Float? {
   val var2: java.util.Iterator = `$this$minOfOrNull`.entrySet().iterator()
   val var10000: java.lang.Float
   if (!var2.hasNext()) {
      var10000 = null
   } else {
      var var3: Float = (selector(var2.next()) as java.lang.Number).floatValue()

      while (var2.hasNext()) {
         var3 = Math.min(var3, (selector(var2.next()) as java.lang.Number).floatValue())
      }

      var10000 = var3
   }

   return var10000
}

@InlineOnly
public inline fun <K, V> Map<out Any, Any>.asIterable(): Iterable<Entry<Any, Any>> {
   return `$this$asIterable`.entrySet()
}

public inline fun <K, V> Map<out Any, Any>.all(predicate: (Entry<Any, Any>) -> Boolean): Boolean {
   if (`$this$all`.isEmpty()) {
      return true
   } else {
      for (element in `$this$all`.entrySet()) {
         if (!predicate(element) as java.lang.Boolean) {
            return false
         }
      }

      return true
   }
}

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun <K, V, R> Map<out Any, Any>.minOfWith(comparator: Comparator<in Any>, selector: (Entry<Any, Any>) -> Any): Any {
   val var3: java.util.Iterator = `$this$minOfWith`.entrySet().iterator()
   if (!var3.hasNext()) {
      throw NoSuchElementException()
   } else {
      var var4: Any = selector(var3.next())

      while (var3.hasNext()) {
         val var5: Any = selector(var3.next())
         if (comparator.compare(var4, var5) > 0) {
            var4 = var5
         }
      }

      return (R)var4
   }
}

@InlineOnly
@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
public inline fun <K, V, R> Map<out Any, Any>.maxOfWithOrNull(comparator: Comparator<in Any>, selector: (Entry<Any, Any>) -> Any): Any? {
   val var3: java.util.Iterator = `$this$maxOfWithOrNull`.entrySet().iterator()
   val var10000: Any
   if (!var3.hasNext()) {
      var10000 = null
   } else {
      var var4: Any = selector(var3.next())

      while (var3.hasNext()) {
         val var5: Any = selector(var3.next())
         if (comparator.compare(var4, var5) < 0) {
            var4 = var5
         }
      }

      var10000 = var4
   }

   return (R)var10000
}

@InlineOnly
@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
public inline fun <K, V, R : Comparable<Any>> Map<out Any, Any>.minOfOrNull(selector: (Entry<Any, Any>) -> Any): Any? {
   val var2: java.util.Iterator = `$this$minOfOrNull`.entrySet().iterator()
   val var10000: java.lang.Comparable
   if (!var2.hasNext()) {
      var10000 = null
   } else {
      var var3: java.lang.Comparable = selector(var2.next()) as java.lang.Comparable

      while (var2.hasNext()) {
         val var4: java.lang.Comparable = selector(var2.next()) as java.lang.Comparable
         if (var3.compareTo(var4) > 0) {
            var3 = var4
         }
      }

      var10000 = var3
   }

   return (R)var10000
}

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun <K, V> Map<out Any, Any>.maxOfOrNull(selector: (Entry<Any, Any>) -> Double): Double? {
   val var2: java.util.Iterator = `$this$maxOfOrNull`.entrySet().iterator()
   val var10000: java.lang.Double
   if (!var2.hasNext()) {
      var10000 = null
   } else {
      var var3: Double = (selector(var2.next()) as java.lang.Number).doubleValue()

      while (var2.hasNext()) {
         var3 = Math.max(var3, (selector(var2.next()) as java.lang.Number).doubleValue())
      }

      var10000 = var3
   }

   return var10000
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun <K, V> Map<out Any, Any>.maxWithOrNull(comparator: Comparator<in Entry<Any, Any>>): Entry<Any, Any>? {
   return CollectionsKt.maxWithOrNull(`$this$maxWithOrNull`.entrySet(), comparator) as MutableMap.MutableEntry<K, V>
}

public inline fun <K, V, R : Any> Map<out Any, Any>.mapNotNull(transform: (Entry<Any, Any>) -> Any?): List<Any> {
   val `destination$iv`: java.util.Collection = ArrayList()

   for (`element$iv$iv` in `$this$mapNotNull`.entrySet()) {
      val var10000: Any = transform(`element$iv$iv`)
      if (var10000 != null) {
         `destination$iv`.add(var10000)
      }
   }

   return `destination$iv` as MutableList<R>
}

@HidesMembers
public inline fun <K, V> Map<out Any, Any>.forEach(action: (Entry<Any, Any>) -> Unit) {
   for (element in `$this$forEach`.entrySet()) {
      action(element)
   }
}

public fun <K, V> Map<out Any, Any>.asSequence(): Sequence<Entry<Any, Any>> {
   return CollectionsKt.asSequence(`$this$asSequence`.entrySet())
}

@InlineOnly
@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
public inline fun <K, V> Map<out Any, Any>.minOfOrNull(selector: (Entry<Any, Any>) -> Double): Double? {
   val var2: java.util.Iterator = `$this$minOfOrNull`.entrySet().iterator()
   val var10000: java.lang.Double
   if (!var2.hasNext()) {
      var10000 = null
   } else {
      var var3: Double = (selector(var2.next()) as java.lang.Number).doubleValue()

      while (var2.hasNext()) {
         var3 = Math.min(var3, (selector(var2.next()) as java.lang.Number).doubleValue())
      }

      var10000 = var3
   }

   return var10000
}

public inline fun <K, V> Map<out Any, Any>.any(predicate: (Entry<Any, Any>) -> Boolean): Boolean {
   if (`$this$any`.isEmpty()) {
      return false
   } else {
      for (element in `$this$any`.entrySet()) {
         if (predicate(element) as java.lang.Boolean) {
            return true
         }
      }

      return false
   }
}

@OverloadResolutionByLambdaReturnType
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun <K, V> Map<out Any, Any>.maxOfOrNull(selector: (Entry<Any, Any>) -> Float): Float? {
   val var2: java.util.Iterator = `$this$maxOfOrNull`.entrySet().iterator()
   val var10000: java.lang.Float
   if (!var2.hasNext()) {
      var10000 = null
   } else {
      var var3: Float = (selector(var2.next()) as java.lang.Number).floatValue()

      while (var2.hasNext()) {
         var3 = Math.max(var3, (selector(var2.next()) as java.lang.Number).floatValue())
      }

      var10000 = var3
   }

   return var10000
}

@InlineOnly
@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
public inline fun <K, V> Map<out Any, Any>.maxOf(selector: (Entry<Any, Any>) -> Double): Double {
   val var2: java.util.Iterator = `$this$maxOf`.entrySet().iterator()
   if (!var2.hasNext()) {
      throw NoSuchElementException()
   } else {
      var var3: Double = (selector(var2.next()) as java.lang.Number).doubleValue()

      while (var2.hasNext()) {
         var3 = Math.max(var3, (selector(var2.next()) as java.lang.Number).doubleValue())
      }

      return var3
   }
}

@InlineOnly
public inline fun <K, V> Map<out Any, Any>.count(): Int {
   return `$this$count`.size()
}

@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun <K, V, R : Comparable<Any>> Map<out Any, Any>.maxByOrNull(selector: (Entry<Any, Any>) -> Any): Entry<Any, Any>? {
   val `iterator$iv`: java.util.Iterator = `$this$maxByOrNull`.entrySet().iterator()
   val var10000: Any
   if (!`iterator$iv`.hasNext()) {
      var10000 = null
   } else {
      var `maxElem$iv`: Any = `iterator$iv`.next()
      if (!`iterator$iv`.hasNext()) {
         var10000 = `maxElem$iv`
      } else {
         var `maxValue$iv`: java.lang.Comparable = selector(`maxElem$iv`) as java.lang.Comparable

         do {
            val `e$iv`: Any = `iterator$iv`.next()
            val `v$iv`: java.lang.Comparable = selector(`e$iv`) as java.lang.Comparable
            if (`maxValue$iv`.compareTo(`v$iv`) < 0) {
               `maxElem$iv` = `e$iv`
               `maxValue$iv` = `v$iv`
            }
         } while (`iterator$iv`.hasNext())

         var10000 = `maxElem$iv`
      }
   }

   return var10000 as MutableMap.MutableEntry<K, V>
}

@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
@InlineOnly
public inline fun <K, V, R> Map<out Any, Any>.maxOfWith(comparator: Comparator<in Any>, selector: (Entry<Any, Any>) -> Any): Any {
   val var3: java.util.Iterator = `$this$maxOfWith`.entrySet().iterator()
   if (!var3.hasNext()) {
      throw NoSuchElementException()
   } else {
      var var4: Any = selector(var3.next())

      while (var3.hasNext()) {
         val var5: Any = selector(var3.next())
         if (comparator.compare(var4, var5) < 0) {
            var4 = var5
         }
      }

      return (R)var4
   }
}

@SinceKotlin(version = "1.4")
public inline fun <K, V, M : Map<out Any, Any>> Any.onEachIndexed(action: (Int, Entry<Any, Any>) -> Unit): Any {
   val `$this$forEachIndexed$iv`: java.lang.Iterable = `$this$onEachIndexed`.entrySet()
   var `index$iv`: Int = 0

   for (`item$iv` in `$this$forEachIndexed$iv`) {
      val var11: Int = `index$iv`++
      if (var11 < 0) {
         CollectionsKt.throwIndexOverflow()
      }

      action(var11, `item$iv`)
   }

   return (M)`$this$onEachIndexed`
}

@JvmName(name = "flatMapSequence")
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
public inline fun <K, V, R> Map<out Any, Any>.flatMap(transform: (Entry<Any, Any>) -> Sequence<Any>): List<Any> {
   val `destination$iv`: java.util.Collection = ArrayList()

   for (`element$iv` in `$this$flatMap`.entrySet()) {
      CollectionsKt.addAll(`destination$iv`, transform(`element$iv`) as Sequence)
   }

   return `destination$iv` as MutableList<R>
}

public inline fun <K, V, R : Any, C : MutableCollection<in Any>> Map<out Any, Any>.mapNotNullTo(destination: Any, transform: (Entry<Any, Any>) -> Any?): Any {
   for (`element$iv` in `$this$mapNotNullTo`.entrySet()) {
      val var10000: Any = transform(`element$iv`)
      if (var10000 != null) {
         destination.add(var10000)
      }
   }

   return (C)destination
}

public fun <K, V> Map<out Any, Any>.any(): Boolean {
   return !`$this$any`.isEmpty()
}

public inline fun <K, V, R, C : MutableCollection<in Any>> Map<out Any, Any>.flatMapTo(destination: Any, transform: (Entry<Any, Any>) -> Iterable<Any>): Any {
   for (element in `$this$flatMapTo`.entrySet()) {
      CollectionsKt.addAll(destination, transform(element) as java.lang.Iterable)
   }

   return (C)destination
}
