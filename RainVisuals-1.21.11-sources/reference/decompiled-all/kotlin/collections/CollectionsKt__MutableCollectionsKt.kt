@file:JvmMultifileClass
@file:JvmName("CollectionsKt")

package kotlin.collections

import java.util.NoSuchElementException
import java.util.RandomAccess
import kotlin.internal.InlineOnly
import kotlin.jvm.internal.TypeIntrinsics

// $VF: Compiled from MutableCollections.kt
@InlineOnly
public inline fun <T> MutableCollection<out Any>.retainAll(elements: Collection<Any>): Boolean {
   return TypeIntrinsics.asMutableCollection(`$this$retainAll`).retainAll(elements)
}

public fun <T> MutableCollection<in Any>.addAll(elements: Sequence<Any>): Boolean {
   var result: Boolean = false

   for (item in elements) {
      if (`$this$addAll`.add(item)) {
         result = true
      }
   }

   return result
}

public fun <T> MutableCollection<in Any>.addAll(elements: Iterable<Any>): Boolean {
   if (elements is java.util.Collection) {
      return `$this$addAll`.addAll(elements as java.util.Collection)
   } else {
      var result: Boolean = false

      for (item in elements) {
         if (`$this$addAll`.add(item)) {
            result = true
         }
      }

      return result
   }
}

@InlineOnly
public inline operator fun <T> MutableCollection<in Any>.plusAssign(elements: Sequence<Any>) {
   CollectionsKt.addAll(`$this$plusAssign`, elements)
}

@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public fun <T> MutableList<Any>.removeLast(): Any {
   if (`$this$removeLast`.isEmpty()) {
      throw NoSuchElementException("List is empty.")
   } else {
      return (T)`$this$removeLast`.remove(CollectionsKt.getLastIndex(`$this$removeLast`))
   }
}

@InlineOnly
public inline operator fun <T> MutableCollection<in Any>.minusAssign(elements: Iterable<Any>) {
   CollectionsKt.removeAll(`$this$minusAssign`, (java.lang.Iterable)elements)
}

public fun <T> MutableList<Any>.retainAll(predicate: (Any) -> Boolean): Boolean {
   return filterInPlace$CollectionsKt__MutableCollectionsKt(`$this$retainAll`, predicate, false)
}

@InlineOnly
public inline operator fun <T> MutableCollection<in Any>.minusAssign(elements: Array<Any>) {
   CollectionsKt.removeAll(`$this$minusAssign`, elements)
}

@InlineOnly
public inline operator fun <T> MutableCollection<in Any>.plusAssign(element: Any) {
   `$this$plusAssign`.add(element)
}

@InlineOnly
public inline operator fun <T> MutableCollection<in Any>.plusAssign(elements: Iterable<Any>) {
   CollectionsKt.addAll(`$this$plusAssign`, elements)
}

@InlineOnly
public inline fun <T> MutableCollection<out Any>.removeAll(elements: Collection<Any>): Boolean {
   return TypeIntrinsics.asMutableCollection(`$this$removeAll`).removeAll(elements)
}

private fun <T> MutableIterable<Any>.filterInPlace(predicate: (Any) -> Boolean, predicateResultToRemove: Boolean): Boolean {
   var result: Boolean = false
   val `$this$filterInPlace_u24lambda_u240`: java.util.Iterator = `$this$filterInPlace`.iterator()

   while (`$this$filterInPlace_u24lambda_u240`.hasNext()) {
      if (predicate(`$this$filterInPlace_u24lambda_u240`.next()) as java.lang.Boolean == predicateResultToRemove) {
         `$this$filterInPlace_u24lambda_u240`.remove()
         result = true
      }
   }

   return result
}

@Deprecated(message = "Use removeAt(index) instead.", replaceWith = @ReplaceWith(expression = "removeAt(index)", imports = []), level = DeprecationLevel.ERROR)
@InlineOnly
public inline fun <T> MutableList<Any>.remove(index: Int): Any {
   return (T)`$this$remove`.remove(index)
}

internal fun <T> Iterable<Any>.convertToListIfNotCollection(): Collection<Any> {
   return if (`$this$convertToListIfNotCollection` is java.util.Collection)
      `$this$convertToListIfNotCollection` as java.util.Collection
      else
      CollectionsKt.toList(`$this$convertToListIfNotCollection`)
   }

public fun <T> MutableCollection<in Any>.retainAll(elements: Sequence<Any>): Boolean {
   val list: java.util.List = SequencesKt.toList(elements)
   return if (!list.isEmpty()) `$this$retainAll`.retainAll(list) else retainNothing$CollectionsKt__MutableCollectionsKt(`$this$retainAll`)
}

open fun CollectionsKt__MutableCollectionsKt() {
}

public fun <T> MutableCollection<in Any>.removeAll(elements: Array<out Any>): Boolean {
   return elements.length != 0 && `$this$removeAll`.removeAll(ArraysKt.asList(elements))
}

@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public fun <T> MutableList<Any>.removeFirst(): Any {
   if (`$this$removeFirst`.isEmpty()) {
      throw NoSuchElementException("List is empty.")
   } else {
      return (T)`$this$removeFirst`.remove(0)
   }
}

@InlineOnly
public inline operator fun <T> MutableCollection<in Any>.plusAssign(elements: Array<Any>) {
   CollectionsKt.addAll(`$this$plusAssign`, elements)
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.4")
public fun <T> MutableList<Any>.removeFirstOrNull(): Any? {
   return (T)(if (`$this$removeFirstOrNull`.isEmpty()) null else `$this$removeFirstOrNull`.remove(0))
}

@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public fun <T> MutableList<Any>.removeLastOrNull(): Any? {
   return (T)(if (`$this$removeLastOrNull`.isEmpty()) null else `$this$removeLastOrNull`.remove(CollectionsKt.getLastIndex(`$this$removeLastOrNull`)))
}

public fun <T> MutableCollection<in Any>.removeAll(elements: Iterable<Any>): Boolean {
   return `$this$removeAll`.removeAll(CollectionsKt.convertToListIfNotCollection(elements))
}

public fun <T> MutableCollection<in Any>.addAll(elements: Array<out Any>): Boolean {
   return `$this$addAll`.addAll(ArraysKt.asList(elements))
}

public fun <T> MutableIterable<Any>.removeAll(predicate: (Any) -> Boolean): Boolean {
   return filterInPlace$CollectionsKt__MutableCollectionsKt(`$this$removeAll`, predicate, true)
}

public fun <T> MutableList<Any>.removeAll(predicate: (Any) -> Boolean): Boolean {
   return filterInPlace$CollectionsKt__MutableCollectionsKt(`$this$removeAll`, predicate, true)
}

public fun <T> MutableCollection<in Any>.retainAll(elements: Array<out Any>): Boolean {
   return if (elements.length != 0)
      `$this$retainAll`.retainAll(ArraysKt.asList(elements))
      else
      retainNothing$CollectionsKt__MutableCollectionsKt(`$this$retainAll`)
   }

public fun <T> MutableCollection<in Any>.removeAll(elements: Sequence<Any>): Boolean {
   val list: java.util.List = SequencesKt.toList(elements)
   return !list.isEmpty() && `$this$removeAll`.removeAll(list)
}

private fun <T> MutableList<Any>.filterInPlace(predicate: (Any) -> Boolean, predicateResultToRemove: Boolean): Boolean {
   if (`$this$filterInPlace` !is RandomAccess) {
      return filterInPlace$CollectionsKt__MutableCollectionsKt(TypeIntrinsics.asMutableIterable(`$this$filterInPlace`), predicate, predicateResultToRemove)
   } else {
      var writeIndex: Int = 0
      val removeIndex: IntIterator = IntRange(0, CollectionsKt.getLastIndex(`$this$filterInPlace`)).iterator()

      while (removeIndex.hasNext()) {
         val readIndex: Int = removeIndex.nextInt()
         val element: Any = `$this$filterInPlace`.get(readIndex)
         if (predicate(element) as java.lang.Boolean != predicateResultToRemove) {
            if (writeIndex != readIndex) {
               `$this$filterInPlace`.set(writeIndex, element)
            }

            writeIndex++
         }
      }

      if (writeIndex >= `$this$filterInPlace`.size()) {
         return false
      } else {
         var var7: Int = CollectionsKt.getLastIndex(`$this$filterInPlace`)
         val var8: Int = writeIndex
         if (writeIndex <= var7) {
            while (true) {
               `$this$filterInPlace`.remove(var7)
               if (var7 == var8) {
                  break
               }

               var7--
            }
         }

         return true
      }
   }
}

@InlineOnly
public inline operator fun <T> MutableCollection<in Any>.minusAssign(elements: Sequence<Any>) {
   CollectionsKt.removeAll(`$this$minusAssign`, elements)
}

public fun <T> MutableCollection<in Any>.retainAll(elements: Iterable<Any>): Boolean {
   return `$this$retainAll`.retainAll(CollectionsKt.convertToListIfNotCollection(elements))
}

@InlineOnly
public inline fun <T> MutableCollection<out Any>.remove(element: Any): Boolean {
   return TypeIntrinsics.asMutableCollection(`$this$remove`).remove(element)
}

private fun MutableCollection<*>.retainNothing(): Boolean {
   val result: Boolean = !`$this$retainNothing`.isEmpty()
   `$this$retainNothing`.clear()
   return result
}

public fun <T> MutableIterable<Any>.retainAll(predicate: (Any) -> Boolean): Boolean {
   return filterInPlace$CollectionsKt__MutableCollectionsKt(`$this$retainAll`, predicate, false)
}

@InlineOnly
public inline operator fun <T> MutableCollection<in Any>.minusAssign(element: Any) {
   `$this$minusAssign`.remove(element)
}
