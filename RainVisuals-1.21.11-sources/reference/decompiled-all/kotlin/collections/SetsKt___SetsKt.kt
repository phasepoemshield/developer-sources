@file:JvmMultifileClass
@file:JvmName("SetsKt")

package kotlin.collections

import java.util.LinkedHashSet
import kotlin.internal.InlineOnly

// $VF: Compiled from _Sets.kt
open fun SetsKt___SetsKt() {
}

public operator fun <T> Set<Any>.minus(elements: Iterable<Any>): Set<Any> {
   val other: java.util.Collection = CollectionsKt.convertToListIfNotCollection(elements)
   if (other.isEmpty()) {
      return CollectionsKt.toSet(`$this$minus`)
   } else if (other is java.util.Set) {
      val var10: java.lang.Iterable = `$this$minus`
      val `destination$iv`: java.util.Collection = LinkedHashSet()

      for (`element$iv` in var10) {
         if (!other.contains(`element$iv`)) {
            `destination$iv`.add(`element$iv`)
         }
      }

      return `destination$iv` as MutableSet<T>
   } else {
      val result: LinkedHashSet = LinkedHashSet(`$this$minus`)
      result.removeAll(other)
      return result
   }
}

@InlineOnly
public inline fun <T> Set<Any>.plusElement(element: Any): Set<Any> {
   return (java.util.Set<T>)SetsKt.plus(`$this$plusElement`, (Object)element)
}

public operator fun <T> Set<Any>.plus(elements: Sequence<Any>): Set<Any> {
   val result: LinkedHashSet = LinkedHashSet(MapsKt.mapCapacity(`$this$plus`.size() * 2))
   result.addAll(`$this$plus`)
   CollectionsKt.addAll(result, elements)
   return result
}

public operator fun <T> Set<Any>.minus(elements: Array<out Any>): Set<Any> {
   val result: LinkedHashSet = LinkedHashSet(`$this$minus`)
   CollectionsKt.removeAll(result, elements)
   return result
}

public operator fun <T> Set<Any>.minus(elements: Sequence<Any>): Set<Any> {
   val result: LinkedHashSet = LinkedHashSet(`$this$minus`)
   CollectionsKt.removeAll(result, elements)
   return result
}

public operator fun <T> Set<Any>.minus(element: Any): Set<Any> {
   val result: LinkedHashSet = LinkedHashSet(MapsKt.mapCapacity(`$this$minus`.size()))
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

@InlineOnly
public inline fun <T> Set<Any>.minusElement(element: Any): Set<Any> {
   return (java.util.Set<T>)SetsKt.minus(`$this$minusElement`, (Object)element)
}

public operator fun <T> Set<Any>.plus(elements: Iterable<Any>): Set<Any> {
   val var10000: Int = CollectionsKt.collectionSizeOrNull(elements)
   val result: LinkedHashSet = LinkedHashSet(MapsKt.mapCapacity(if (var10000 != null) `$this$plus`.size() + var10000.intValue() else `$this$plus`.size() * 2))
   result.addAll(`$this$plus`)
   CollectionsKt.addAll(result, elements)
   return result
}

public operator fun <T> Set<Any>.plus(element: Any): Set<Any> {
   val result: LinkedHashSet = LinkedHashSet(MapsKt.mapCapacity(`$this$plus`.size() + 1))
   result.addAll(`$this$plus`)
   result.add(element)
   return result
}

public operator fun <T> Set<Any>.plus(elements: Array<out Any>): Set<Any> {
   val result: LinkedHashSet = LinkedHashSet(MapsKt.mapCapacity(`$this$plus`.size() + elements.length))
   result.addAll(`$this$plus`)
   CollectionsKt.addAll(result, elements)
   return result
}
