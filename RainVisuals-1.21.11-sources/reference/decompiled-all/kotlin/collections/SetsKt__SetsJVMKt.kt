@file:JvmMultifileClass
@file:JvmName("SetsKt")

package kotlin.collections

import java.util.Collections
import java.util.Comparator
import java.util.TreeSet
import kotlin.collections.builders.SetBuilder
import kotlin.internal.InlineOnly

// $VF: Compiled from SetsJVM.kt
@SinceKotlin(version = "1.3")
@PublishedApi
internal fun <E> createSetBuilder(capacity: Int): MutableSet<Any> {
   return SetBuilder(capacity)
}

public fun <T> sortedSetOf(comparator: Comparator<in Any>, vararg elements: Any): TreeSet<Any> {
   return ArraysKt.toCollection((Object[])elements, TreeSet(comparator)) as TreeSet<T>
}

@PublishedApi
@SinceKotlin(version = "1.3")
internal fun <E> createSetBuilder(): MutableSet<Any> {
   return SetBuilder()
}

public fun <T> setOf(element: Any): Set<Any> {
   val var10000: java.util.Set = Collections.singleton(element)
   return var10000
}

public fun <T> sortedSetOf(vararg elements: Any): TreeSet<Any> {
   return ArraysKt.toCollection((Object[])elements, TreeSet()) as TreeSet<T>
}

@PublishedApi
@InlineOnly
@SinceKotlin(version = "1.3")
internal inline fun <E> buildSetInternal(capacity: Int, builderAction: (MutableSet<Any>) -> Unit): Set<Any> {
   val var2: java.util.Set = SetsKt.createSetBuilder(capacity)
   builderAction(var2)
   return SetsKt.build(var2)
}

@SinceKotlin(version = "1.3")
@PublishedApi
internal fun <E> build(builder: MutableSet<Any>): Set<Any> {
   return (builder as SetBuilder).build()
}

@PublishedApi
@SinceKotlin(version = "1.3")
@InlineOnly
internal inline fun <E> buildSetInternal(builderAction: (MutableSet<Any>) -> Unit): Set<Any> {
   val var1: java.util.Set = SetsKt.createSetBuilder()
   builderAction(var1)
   return SetsKt.build(var1)
}

open fun SetsKt__SetsJVMKt() {
}
