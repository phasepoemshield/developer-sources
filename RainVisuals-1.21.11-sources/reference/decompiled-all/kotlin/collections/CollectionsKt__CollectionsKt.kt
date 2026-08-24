@file:JvmMultifileClass
@file:JvmName("CollectionsKt")

package kotlin.collections

import java.util.ArrayList
import java.util.Comparator
import kotlin.contracts.InvocationKind
import kotlin.internal.InlineOnly
import kotlin.jvm.functions.Function1
import kotlin.random.Random

// $VF: Compiled from Collections.kt
public fun <T : Comparable<Any>> List<Any?>.binarySearch(element: Any?, fromIndex: Int = ..., toIndex: Int = ...): Int {
   rangeCheck$CollectionsKt__CollectionsKt(`$this$binarySearch`.size(), fromIndex, toIndex)
   var low: Int = fromIndex
   var high: Int = toIndex + -1

   while (low <= high) {
      val mid: Int = low + high ushr 1
      val cmp: Int = ComparisonsKt.compareValues(`$this$binarySearch`.get(low + high ushr 1) as java.lang.Comparable, element)
      if (cmp < 0) {
         low = mid + 1
      } else {
         if (cmp <= 0) {
            return mid
         }

         high = mid - 1
      }
   }

   return -(low + 1)
}

@SinceKotlin(version = "1.1")
@InlineOnly
public inline fun <T> mutableListOf(): MutableList<Any> {
   return ArrayList()
}

public fun <T> arrayListOf(vararg elements: Any): ArrayList<Any> {
   return if (elements.length == 0) ArrayList() else ArrayList(ArrayAsCollection<>(elements, true))
}

internal fun collectionToArrayCommonImpl(collection: Collection<*>): Array<Any?> {
   if (collection.isEmpty()) {
      return arrayOfNulls(0)
   } else {
      val destination: Array<Any> = arrayOfNulls(collection.size())
      val iterator: java.util.Iterator = collection.iterator()
      var index: Int = 0

      while (iterator.hasNext()) {
         destination[index++] = iterator.next()
      }

      return destination
   }
}

public fun <T> List<Any>.binarySearch(element: Any, comparator: Comparator<in Any>, fromIndex: Int = 0, toIndex: Int = `$this$binarySearch`.size()): Int {
   rangeCheck$CollectionsKt__CollectionsKt(`$this$binarySearch`.size(), fromIndex, toIndex)
   var low: Int = fromIndex
   var high: Int = toIndex - 1

   while (low <= high) {
      val mid: Int = low + high ushr 1
      val cmp: Int = comparator.compare(`$this$binarySearch`.get(low + high ushr 1), element)
      if (cmp < 0) {
         low = mid + 1
      } else {
         if (cmp <= 0) {
            return mid
         }

         high = mid - 1
      }
   }

   return -(low + 1)
}

private fun rangeCheck(size: Int, fromIndex: Int, toIndex: Int) {
   if (fromIndex > toIndex) {
      throw IllegalArgumentException("fromIndex ($fromIndex) is greater than toIndex ($toIndex).")
   } else if (fromIndex < 0) {
      throw IndexOutOfBoundsException("fromIndex ($fromIndex) is less than zero.")
   } else if (toIndex > size) {
      throw IndexOutOfBoundsException("toIndex ($toIndex) is greater than size ($size).")
   }
}

@InlineOnly
public inline fun <T> listOf(): List<Any> {
   return CollectionsKt.emptyList()
}

public fun <T> mutableListOf(vararg elements: Any): MutableList<Any> {
   return if (elements.length == 0) ArrayList() else ArrayList(ArrayAsCollection<>(elements, true))
}

@InlineOnly
public inline fun <T> List<Any>?.orEmpty(): List<Any> {
   var var10000: java.util.List = `$this$orEmpty`
   if (`$this$orEmpty` == null) {
      var10000 = CollectionsKt.emptyList()
   }

   return var10000
}

@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun <C, R> Any.ifEmpty(defaultValue: () -> Any): Any where C : Collection<*>, C : Any {
   return (R)(if (`$this$ifEmpty`.isEmpty()) defaultValue() else `$this$ifEmpty`)
}

@InlineOnly
public inline fun <T> Collection<Any>?.orEmpty(): Collection<Any> {
   var var10000: java.util.Collection = `$this$orEmpty`
   if (`$this$orEmpty` == null) {
      var10000 = CollectionsKt.emptyList()
   }

   return var10000
}

public fun <T> listOf(vararg elements: Any): List<Any> {
   return (java.util.List<T>)(if (elements.length > 0) ArraysKt.asList(elements) else CollectionsKt.emptyList())
}

public final val indices: IntRange
   public final get() {
      return IntRange(0, `$this$indices`.size() - 1)
   }


@InlineOnly
@SinceKotlin(version = "1.1")
public inline fun <T> MutableList(size: Int, init: (Int) -> Any): MutableList<Any> {
   val list: ArrayList = ArrayList(size)

   repeat(size) { var3 ->
      list.add(init(var3))
   }

   return list
}

internal fun <T> List<Any>.optimizeReadOnlyList(): List<Any> {
   var var10000: java.util.List
   when (`$this$optimizeReadOnlyList`.size()) {
      0 -> var10000 = CollectionsKt.emptyList()
      1 -> var10000 = CollectionsKt.listOf(`$this$optimizeReadOnlyList`.get(0))
      else -> var10000 = `$this$optimizeReadOnlyList`
   }

   return var10000
}

public inline fun <T, K : Comparable<Any>> List<Any>.binarySearchBy(key: Any?, fromIndex: Int = ..., toIndex: Int = ..., crossinline selector: (Any) -> Any?): Int {
   return CollectionsKt.binarySearch(`$this$binarySearchBy`, fromIndex, toIndex,    // $VF: Compiled from Collections.kt
{ it: Any ->
      return ComparisonsKt.compareValues((T)(selector(it) as java.lang.Comparable), (T)key)
   } as Function1)
}

public fun <T : Any> listOfNotNull(vararg elements: Any?): List<Any> {
   return (java.util.List<T>)ArraysKt.filterNotNull(elements)
}

@InlineOnly
public inline fun <T> Collection<Any>.isNotEmpty(): Boolean {
   return !`$this$isNotEmpty`.isEmpty()
}

internal fun <T> Array<out Any>.asCollection(): Collection<Any> {
   return (java.util.Collection<T>)ArrayAsCollection<>(`$this$asCollection`, false)
}

public fun <T> List<Any>.binarySearch(fromIndex: Int = 0, toIndex: Int = `$this$binarySearch`.size(), comparison: (Any) -> Int): Int {
   rangeCheck$CollectionsKt__CollectionsKt(`$this$binarySearch`.size(), fromIndex, toIndex)
   var low: Int = fromIndex
   var high: Int = toIndex + -1

   while (low <= high) {
      val mid: Int = low + high ushr 1
      val cmp: Int = (comparison(`$this$binarySearch`.get(low + high ushr 1)) as java.lang.Number).intValue()
      if (cmp < 0) {
         low = mid + 1
      } else {
         if (cmp <= 0) {
            return mid
         }

         high = mid - 1
      }
   }

   return -(low + 1)
}

@SinceKotlin(version = "1.3")
public fun <T> Iterable<Any>.shuffled(random: Random): List<Any> {
   val var2: java.util.List = CollectionsKt.toMutableList(`$this$shuffled`)
   CollectionsKt.shuffle(var2, random)
   return var2
}

@InlineOnly
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.6")
public inline fun <E> buildList(capacity: Int, builderAction: (MutableList<Any>) -> Unit): List<Any> {
   contract {
      callsInPlace(builderAction, InvocationKind.EXACTLY_ONCE)
   }

   val var2: java.util.List = CollectionsKt.createListBuilder(capacity)
   builderAction(var2)
   return CollectionsKt.build(var2)
}

public fun <T : Any> listOfNotNull(element: Any?): List<Any> {
   return (java.util.List<T>)(if (element != null) CollectionsKt.listOf(element) else CollectionsKt.emptyList())
}

public fun <T> emptyList(): List<Any> {
   return EmptyList.INSTANCE
}

public final val lastIndex: Int
   public final get() {
      return `$this$lastIndex`.size() - 1
   }


open fun CollectionsKt__CollectionsKt() {
}

@SinceKotlin(version = "1.3")
@PublishedApi
internal fun throwIndexOverflow() {
   throw ArithmeticException("Index overflow has happened.")
}

@PublishedApi
@SinceKotlin(version = "1.3")
internal fun throwCountOverflow() {
   throw ArithmeticException("Count overflow has happened.")
}

@SinceKotlin(version = "1.1")
@InlineOnly
public inline fun <T> arrayListOf(): ArrayList<Any> {
   return ArrayList()
}

@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun <T> Collection<Any>?.isNullOrEmpty(): Boolean {
   contract {
      returns(false) implies (this != null)
   }

   return `$this$isNullOrEmpty` == null || `$this$isNullOrEmpty`.isEmpty()
}

@SinceKotlin(version = "1.6")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@InlineOnly
public inline fun <E> buildList(builderAction: (MutableList<Any>) -> Unit): List<Any> {
   contract {
      callsInPlace(builderAction, InvocationKind.EXACTLY_ONCE)
   }

   val var1: java.util.List = CollectionsKt.createListBuilder()
   builderAction(var1)
   return CollectionsKt.build(var1)
}

@SinceKotlin(version = "1.1")
@InlineOnly
public inline fun <T> List(size: Int, init: (Int) -> Any): List<Any> {
   val var2: ArrayList = ArrayList(size)

   repeat(size) { var3 ->
      var2.add(init(var3))
   }

   return var2
}

@InlineOnly
public inline fun <T> Collection<Any>.containsAll(elements: Collection<Any>): Boolean {
   return `$this$containsAll`.containsAll(elements)
}

internal fun <T> collectionToArrayCommonImpl(collection: Collection<*>, array: Array<Any>): Array<Any> {
   if (collection.isEmpty()) {
      return (T[])CollectionsKt.terminateCollectionToArray(0, array)
   } else {
      val destination: Array<Any> = if (array.length < collection.size()) ArraysKt.arrayOfNulls(array, collection.size()) else array
      val iterator: java.util.Iterator = collection.iterator()
      var index: Int = 0

      while (iterator.hasNext()) {
         destination[index++] = iterator.next()
      }

      return (T[])CollectionsKt.terminateCollectionToArray(collection.size(), destination)
   }
}
