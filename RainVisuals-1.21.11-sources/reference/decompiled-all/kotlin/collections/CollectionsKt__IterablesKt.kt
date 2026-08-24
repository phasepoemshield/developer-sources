@file:JvmMultifileClass
@file:JvmName("CollectionsKt")

package kotlin.collections

import java.util.ArrayList
import kotlin.internal.InlineOnly

// $VF: Compiled from Iterables.kt
public fun <T> Iterable<Iterable<Any>>.flatten(): List<Any> {
   val result: ArrayList = ArrayList()

   for (element in `$this$flatten`) {
      CollectionsKt.addAll(result, element)
   }

   return result
}

open fun CollectionsKt__IterablesKt() {
}

public fun <T, R> Iterable<Pair<Any, Any>>.unzip(): Pair<List<Any>, List<Any>> {
   val expectedSize: Int = CollectionsKt.collectionSizeOrDefault(`$this$unzip`, 10)
   val listT: ArrayList = ArrayList(expectedSize)
   val listR: ArrayList = ArrayList(expectedSize)

   for (pair in `$this$unzip`) {
      listT.add(pair.first)
      listR.add(pair.second)
   }

   return listT to listR
}

@InlineOnly
public inline fun <T> Iterable(crossinline iterator: () -> Iterator<Any>): Iterable<Any> {
   return    // $VF: Compiled from Iterables.kt
object : Iterable<Any> {
      public override operator fun iterator(): Iterator<Any> {
         return iterator() as MutableIterator<T>
      }
   }
}

@PublishedApi
internal fun <T> Iterable<Any>.collectionSizeOrNull(): Int? {
   return if (`$this$collectionSizeOrNull` is java.util.Collection) (`$this$collectionSizeOrNull` as java.util.Collection).size() else null
}

@PublishedApi
internal fun <T> Iterable<Any>.collectionSizeOrDefault(default: Int): Int {
   return if (`$this$collectionSizeOrDefault` is java.util.Collection)
      (`$this$collectionSizeOrDefault` as java.util.Collection).size()
      else
      `$this$collectionSizeOrDefault1`
   }
