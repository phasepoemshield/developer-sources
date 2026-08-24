@file:JvmMultifileClass
@file:JvmName("SetsKt")

package kotlin.collections

import java.util.HashSet
import java.util.LinkedHashSet
import kotlin.contracts.InvocationKind
import kotlin.internal.InlineOnly

// $VF: Compiled from Sets.kt
public fun <T> linkedSetOf(vararg elements: Any): LinkedHashSet<Any> {
   return ArraysKt.toCollection((Object[])elements, LinkedHashSet(MapsKt.mapCapacity(elements.length))) as LinkedHashSet<T>
}

@InlineOnly
@SinceKotlin(version = "1.1")
public inline fun <T> linkedSetOf(): LinkedHashSet<Any> {
   return LinkedHashSet()
}

@InlineOnly
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.6")
public inline fun <E> buildSet(capacity: Int, builderAction: (MutableSet<Any>) -> Unit): Set<Any> {
   contract {
      callsInPlace(builderAction, InvocationKind.EXACTLY_ONCE)
   }

   val var2: java.util.Set = SetsKt.createSetBuilder(capacity)
   builderAction(var2)
   return SetsKt.build(var2)
}

@InlineOnly
public inline fun <T> setOf(): Set<Any> {
   return SetsKt.emptySet()
}

@SinceKotlin(version = "1.4")
public fun <T : Any> setOfNotNull(element: Any?): Set<Any> {
   return (java.util.Set<T>)(if (element != null) SetsKt.setOf(element) else SetsKt.emptySet())
}

@SinceKotlin(version = "1.6")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@InlineOnly
public inline fun <E> buildSet(builderAction: (MutableSet<Any>) -> Unit): Set<Any> {
   contract {
      callsInPlace(builderAction, InvocationKind.EXACTLY_ONCE)
   }

   val var1: java.util.Set = SetsKt.createSetBuilder()
   builderAction(var1)
   return SetsKt.build(var1)
}

internal fun <T> Set<Any>.optimizeReadOnlySet(): Set<Any> {
   var var10000: java.util.Set
   when (`$this$optimizeReadOnlySet`.size()) {
      0 -> var10000 = SetsKt.emptySet()
      1 -> var10000 = SetsKt.setOf(`$this$optimizeReadOnlySet`.iterator().next())
      else -> var10000 = `$this$optimizeReadOnlySet`
   }

   return var10000
}

@SinceKotlin(version = "1.1")
@InlineOnly
public inline fun <T> mutableSetOf(): MutableSet<Any> {
   return LinkedHashSet()
}

@SinceKotlin(version = "1.1")
@InlineOnly
public inline fun <T> hashSetOf(): HashSet<Any> {
   return HashSet()
}

@SinceKotlin(version = "1.4")
public fun <T : Any> setOfNotNull(vararg elements: Any?): Set<Any> {
   return ArraysKt.filterNotNullTo(elements, LinkedHashSet()) as MutableSet<T>
}

public fun <T> emptySet(): Set<Any> {
   return EmptySet.INSTANCE
}

open fun SetsKt__SetsKt() {
}

public fun <T> setOf(vararg elements: Any): Set<Any> {
   return (java.util.Set<T>)(if (elements.length > 0) ArraysKt.toSet(elements) else SetsKt.emptySet())
}

@InlineOnly
public inline fun <T> Set<Any>?.orEmpty(): Set<Any> {
   var var10000: java.util.Set = `$this$orEmpty`
   if (`$this$orEmpty` == null) {
      var10000 = SetsKt.emptySet()
   }

   return var10000
}

public fun <T> hashSetOf(vararg elements: Any): HashSet<Any> {
   return ArraysKt.toCollection((Object[])elements, HashSet(MapsKt.mapCapacity(elements.length))) as HashSet<T>
}

public fun <T> mutableSetOf(vararg elements: Any): MutableSet<Any> {
   return ArraysKt.toCollection((Object[])elements, LinkedHashSet(MapsKt.mapCapacity(elements.length))) as MutableSet<T>
}
