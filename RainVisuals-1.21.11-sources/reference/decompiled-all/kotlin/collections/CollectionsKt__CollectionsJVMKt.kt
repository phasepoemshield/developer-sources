@file:JvmMultifileClass
@file:JvmName("CollectionsKt")

package kotlin.collections

import java.util.ArrayList
import java.util.Arrays
import java.util.Collections
import java.util.Enumeration
import java.util.Random
import kotlin.collections.builders.ListBuilder
import kotlin.internal.InlineOnly
import kotlin.internal.PlatformImplementationsKt
import kotlin.jvm.internal.CollectionToArray

// $VF: Compiled from CollectionsJVM.kt
open fun CollectionsKt__CollectionsJVMKt() {
}

@SinceKotlin(version = "1.2")
public fun <T> Iterable<Any>.shuffled(): List<Any> {
   val var1: java.util.List = CollectionsKt.toMutableList(`$this$shuffled`)
   Collections.shuffle(var1)
   return var1
}

public fun <T> listOf(element: Any): List<Any> {
   val var10000: java.util.List = Collections.singletonList(element)
   return var10000
}

internal fun <T> terminateCollectionToArray(collectionSize: Int, array: Array<Any>): Array<Any> {
   if (collectionSize < array.length) {
      array[collectionSize] = null
   }

   return (T[])array
}

@SinceKotlin(version = "1.2")
public fun <T> Iterable<Any>.shuffled(random: Random): List<Any> {
   val var2: java.util.List = CollectionsKt.toMutableList(`$this$shuffled`)
   Collections.shuffle(var2, random)
   return var2
}

@SinceKotlin(version = "1.3")
@InlineOnly
@PublishedApi
internal inline fun checkCountOverflow(count: Int): Int {
   if (count < 0) {
      if (!PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
         throw ArithmeticException("Count overflow has happened.")
      }

      CollectionsKt.throwCountOverflow()
   }

   return count
}

internal fun <T> Array<out Any>.copyToArrayOfAny(isVarargs: Boolean): Array<out Any?> {
   val var10000: Array<Any>
   if (isVarargs && `$this$copyToArrayOfAny`.getClass() == Object[]::class.java) {
      var10000 = `$this$copyToArrayOfAny`
   } else {
      var10000 = Arrays.copyOf(`$this$copyToArrayOfAny`, `$this$copyToArrayOfAny`.length, Object[].class)
   }

   return var10000
}

@InlineOnly
public inline fun <T> Enumeration<Any>.toList(): List<Any> {
   val var10000: ArrayList = Collections.list(`$this$toList`)
   return var10000
}

@SinceKotlin(version = "1.3")
@PublishedApi
@InlineOnly
internal inline fun <E> buildListInternal(builderAction: (MutableList<Any>) -> Unit): List<Any> {
   val var1: java.util.List = CollectionsKt.createListBuilder()
   builderAction(var1)
   return CollectionsKt.build(var1)
}

@PublishedApi
@SinceKotlin(version = "1.3")
internal fun <E> createListBuilder(capacity: Int): MutableList<Any> {
   return ListBuilder(capacity)
}

@InlineOnly
@SinceKotlin(version = "1.3")
@PublishedApi
internal inline fun checkIndexOverflow(index: Int): Int {
   if (index < 0) {
      if (!PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
         throw ArithmeticException("Index overflow has happened.")
      }

      CollectionsKt.throwIndexOverflow()
   }

   return index
}

@PublishedApi
@SinceKotlin(version = "1.3")
internal fun <E> build(builder: MutableList<Any>): List<Any> {
   return (builder as ListBuilder).build()
}

@InlineOnly
internal inline fun collectionToArray(collection: Collection<*>): Array<Any?> {
   return CollectionToArray.toArray(collection)
}

@SinceKotlin(version = "1.3")
@PublishedApi
internal fun <E> createListBuilder(): MutableList<Any> {
   return ListBuilder()
}

@PublishedApi
@SinceKotlin(version = "1.3")
@InlineOnly
internal inline fun <E> buildListInternal(capacity: Int, builderAction: (MutableList<Any>) -> Unit): List<Any> {
   val var2: java.util.List = CollectionsKt.createListBuilder(capacity)
   builderAction(var2)
   return CollectionsKt.build(var2)
}

@InlineOnly
internal inline fun <T> collectionToArray(collection: Collection<*>, array: Array<Any>): Array<Any> {
   return (T[])CollectionToArray.toArray(collection, array)
}
