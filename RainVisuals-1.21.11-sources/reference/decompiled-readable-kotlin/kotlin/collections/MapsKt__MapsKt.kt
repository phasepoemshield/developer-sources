@file:JvmMultifileClass
@file:JvmName("MapsKt")

package kotlin.collections

import java.util.HashMap
import java.util.LinkedHashMap
import kotlin.collections.Map.Entry
import kotlin.collections.MutableMap.MutableEntry
import kotlin.contracts.InvocationKind
import kotlin.internal.InlineOnly
import kotlin.jvm.internal.TypeIntrinsics

// $VF: Compiled from Maps.kt
public fun <K, V, M : MutableMap<in Any, in Any>> Array<out Pair<Any, Any>>.toMap(destination: Any): Any {
   MapsKt.putAll(destination, `$this$toMap`)
   return (M)destination
}

public inline fun <K, V> MutableMap<Any, Any>.getOrPut(key: Any, defaultValue: () -> Any): Any {
   val value: Any = `$this$getOrPut`.get(key)
   val var10000: Any
   if (value == null) {
      val answer: Any = defaultValue()
      `$this$getOrPut`.put(key, answer)
      var10000 = answer
   } else {
      var10000 = value
   }

   return (V)var10000
}

public fun <K, V> MutableMap<in Any, in Any>.putAll(pairs: Array<out Pair<Any, Any>>) {
   for (var4 in pairs) {
      `$this$putAll`.put(var4.component1(), var4.component2())
   }
}

public operator fun <K, V> Map<out Any, Any>.plus(pairs: Iterable<Pair<Any, Any>>): Map<Any, Any> {
   val var10000: java.util.Map
   if (`$this$plus`.isEmpty()) {
      var10000 = MapsKt.toMap(pairs)
   } else {
      val var2: LinkedHashMap = LinkedHashMap(`$this$plus`)
      MapsKt.putAll(var2, pairs)
      var10000 = var2
   }

   return var10000
}

internal inline fun <K, V> Map<Any, Any>.getOrElseNullable(key: Any, defaultValue: () -> Any): Any {
   val value: Any = `$this$getOrElseNullable`.get(key)
   return (V)(if (value == null && !`$this$getOrElseNullable`.containsKey(key)) defaultValue() else value)
}

internal fun <K, V> Map<Any, Any>.optimizeReadOnlyMap(): Map<Any, Any> {
   var var10000: java.util.Map
   when (`$this$optimizeReadOnlyMap`.size()) {
      0 -> var10000 = MapsKt.emptyMap()
      1 -> var10000 = MapsKt.toSingletonMap(`$this$optimizeReadOnlyMap`)
      else -> var10000 = `$this$optimizeReadOnlyMap`
   }

   return var10000
}

public fun <K, V> MutableMap<in Any, in Any>.putAll(pairs: Sequence<Pair<Any, Any>>) {
   for (var3 in pairs) {
      `$this$putAll`.put(var3.component1(), var3.component2())
   }
}

@InlineOnly
@JvmName(name = "mutableIterator")
public inline operator fun <K, V> MutableMap<Any, Any>.iterator(): MutableIterator<MutableEntry<Any, Any>> {
   return `$this$iterator`.entrySet().iterator()
}

@InlineOnly
public inline fun <K, V> mapOf(): Map<Any, Any> {
   return MapsKt.emptyMap()
}

@InlineOnly
public inline operator fun <K, V> Map<out Any, Any>.contains(key: Any): Boolean {
   return `$this$contains`.containsKey(key)
}

public inline fun <K, V> Map<out Any, Any>.filter(predicate: (Entry<Any, Any>) -> Boolean): Map<Any, Any> {
   val `destination$iv`: java.util.Map = LinkedHashMap()

   for (`element$iv` in `$this$filter`.entrySet()) {
      if (predicate(`element$iv`) as java.lang.Boolean) {
         `destination$iv`.put(`element$iv`.getKey(), `element$iv`.getValue())
      }
   }

   return `destination$iv`
}

public fun <K, V, M : MutableMap<in Any, in Any>> Iterable<Pair<Any, Any>>.toMap(destination: Any): Any {
   MapsKt.putAll(destination, `$this$toMap`)
   return (M)destination
}

@InlineOnly
public inline operator fun <K, V> MutableMap<in Any, in Any>.plusAssign(pair: Pair<Any, Any>) {
   `$this$plusAssign`.put(pair.first, pair.second)
}

@InlineOnly
public inline fun <K, V> Entry<Any, Any>.toPair(): Pair<Any, Any> {
   return (Pair<K, V>)Pair<>(`$this$toPair`.getKey(), `$this$toPair`.getValue())
}

@InlineOnly
public inline operator fun <K, V> Map<out Any, Any>.iterator(): Iterator<Entry<Any, Any>> {
   return `$this$iterator`.entrySet().iterator()
}

@InlineOnly
public inline operator fun <K, V> Map<out Any, Any>.get(key: Any): Any? {
   return (V)`$this$get`.get(key)
}

@SinceKotlin(version = "1.1")
@InlineOnly
public inline operator fun <K, V> MutableMap<Any, Any>.minusAssign(keys: Array<out Any>) {
   CollectionsKt.removeAll(`$this$minusAssign`.keySet(), keys)
}

public operator fun <K, V> Map<out Any, Any>.plus(pairs: Sequence<Pair<Any, Any>>): Map<Any, Any> {
   val var2: LinkedHashMap = LinkedHashMap(`$this$plus`)
   MapsKt.putAll(var2, pairs)
   return MapsKt.optimizeReadOnlyMap(var2)
}

public inline fun <K, V> Map<out Any, Any>.filterNot(predicate: (Entry<Any, Any>) -> Boolean): Map<Any, Any> {
   val `destination$iv`: java.util.Map = LinkedHashMap()

   for (`element$iv` in `$this$filterNot`.entrySet()) {
      if (!predicate(`element$iv`) as java.lang.Boolean) {
         `destination$iv`.put(`element$iv`.getKey(), `element$iv`.getValue())
      }
   }

   return `destination$iv`
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@InlineOnly
@SinceKotlin(version = "1.6")
public inline fun <K, V> buildMap(capacity: Int, builderAction: (MutableMap<Any, Any>) -> Unit): Map<Any, Any> {
   contract {
      callsInPlace(builderAction, InvocationKind.EXACTLY_ONCE)
   }

   val var2: java.util.Map = MapsKt.createMapBuilder(capacity)
   builderAction(var2)
   return MapsKt.build(var2)
}

public inline fun <K, V, R> Map<out Any, Any>.mapValues(transform: (Entry<Any, Any>) -> Any): Map<Any, Any> {
   val `destination$iv`: java.util.Map = LinkedHashMap(MapsKt.mapCapacity(`$this$mapValues`.size()))

   for (`element$iv$iv` in `$this$mapValues`.entrySet()) {
      `destination$iv`.put((`element$iv$iv` as java.util.Map.Entry).getKey(), transform(`element$iv$iv`))
   }

   return `destination$iv`
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@InlineOnly
@SinceKotlin(version = "1.6")
public inline fun <K, V> buildMap(builderAction: (MutableMap<Any, Any>) -> Unit): Map<Any, Any> {
   contract {
      callsInPlace(builderAction, InvocationKind.EXACTLY_ONCE)
   }

   val var1: java.util.Map = MapsKt.createMapBuilder()
   builderAction(var1)
   return MapsKt.build(var1)
}

public fun <K, V> Array<out Pair<Any, Any>>.toMap(): Map<Any, Any> {
   var var10000: java.util.Map
   when (`$this$toMap`.length) {
      0 -> var10000 = MapsKt.emptyMap()
      1 -> var10000 = MapsKt.mapOf(`$this$toMap`[0])
      else -> var10000 = MapsKt.toMap(`$this$toMap`, LinkedHashMap(MapsKt.mapCapacity(`$this$toMap`.length)))
   }

   return var10000
}

public fun <K, V> mutableMapOf(vararg pairs: Pair<Any, Any>): MutableMap<Any, Any> {
   val var1: LinkedHashMap = LinkedHashMap(MapsKt.mapCapacity(pairs.length))
   MapsKt.putAll(var1, pairs)
   return var1
}

@SinceKotlin(version = "1.1")
public fun <K, V> Map<out Any, Any>.toMap(): Map<Any, Any> {
   var var10000: java.util.Map
   when (`$this$toMap`.size()) {
      0 -> var10000 = MapsKt.emptyMap()
      1 -> var10000 = MapsKt.toSingletonMap(`$this$toMap`)
      else -> var10000 = MapsKt.toMutableMap(`$this$toMap`)
   }

   return var10000
}

public fun <K, V> Iterable<Pair<Any, Any>>.toMap(): Map<Any, Any> {
   if (`$this$toMap` is java.util.Collection) {
      var var10000: java.util.Map
      when ((`$this$toMap` as java.util.Collection).size()) {
         0 -> var10000 = MapsKt.emptyMap()
         1 -> var10000 = MapsKt.mapOf(
               if (`$this$toMap` is java.util.List) (`$this$toMap` as java.util.List).get(0) as Pair else `$this$toMap`.iterator().next() as Pair
            )
         else -> var10000 = MapsKt.toMap(`$this$toMap`, LinkedHashMap(MapsKt.mapCapacity((`$this$toMap` as java.util.Collection).size())))
      }

      return var10000
   } else {
      return MapsKt.optimizeReadOnlyMap(MapsKt.toMap(`$this$toMap`, LinkedHashMap()))
   }
}

public operator fun <K, V> Map<out Any, Any>.plus(pair: Pair<Any, Any>): Map<Any, Any> {
   val var10000: java.util.Map
   if (`$this$plus`.isEmpty()) {
      var10000 = MapsKt.mapOf(pair)
   } else {
      val var2: LinkedHashMap = LinkedHashMap(`$this$plus`)
      var2.put(pair.first, pair.second)
      var10000 = var2
   }

   return var10000
}

@InlineOnly
public inline operator fun <K, V> MutableMap<in Any, in Any>.plusAssign(pairs: Iterable<Pair<Any, Any>>) {
   MapsKt.putAll(`$this$plusAssign`, pairs)
}

open fun MapsKt__MapsKt() {
}

@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun <K, V> Map<out Any, Any>?.isNullOrEmpty(): Boolean {
   contract {
      returns(false) implies (this != null)
   }

   return `$this$isNullOrEmpty` == null || `$this$isNullOrEmpty`.isEmpty()
}

@InlineOnly
public inline fun <K, V> MutableMap<out Any, Any>.remove(key: Any): Any? {
   return (V)TypeIntrinsics.asMutableMap(`$this$remove`).remove(key)
}

public fun <K, V> MutableMap<in Any, in Any>.putAll(pairs: Iterable<Pair<Any, Any>>) {
   for (var3 in pairs) {
      `$this$putAll`.put(var3.component1(), var3.component2())
   }
}

@InlineOnly
@SinceKotlin(version = "1.1")
public inline operator fun <K, V> MutableMap<Any, Any>.minusAssign(key: Any) {
   `$this$minusAssign`.remove(key)
}

@SinceKotlin(version = "1.1")
public fun <K, V, M : MutableMap<in Any, in Any>> Map<out Any, Any>.toMap(destination: Any): Any {
   destination.putAll(`$this$toMap`)
   return (M)destination
}

@InlineOnly
public inline fun <K, V> Map<Any, Any>?.orEmpty(): Map<Any, Any> {
   var var10000: java.util.Map = `$this$orEmpty`
   if (`$this$orEmpty` == null) {
      var10000 = MapsKt.emptyMap()
   }

   return var10000
}

public inline fun <K, V, M : MutableMap<in Any, in Any>> Map<out Any, Any>.filterNotTo(destination: Any, predicate: (Entry<Any, Any>) -> Boolean): Any {
   for (element in `$this$filterNotTo`.entrySet()) {
      if (!predicate(element) as java.lang.Boolean) {
         destination.put(element.getKey(), element.getValue())
      }
   }

   return (M)destination
}

@InlineOnly
public inline operator fun <K, V> MutableMap<Any, Any>.set(key: Any, value: Any) {
   `$this$set`.put(key, value)
}

public inline fun <K, V> Map<out Any, Any>.filterValues(predicate: (Any) -> Boolean): Map<Any, Any> {
   val result: LinkedHashMap = LinkedHashMap()

   for (entry in `$this$filterValues`.entrySet()) {
      if (predicate(entry.getValue()) as java.lang.Boolean) {
         result.put(entry.getKey(), entry.getValue())
      }
   }

   return result
}

@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun <M, R> Any.ifEmpty(defaultValue: () -> Any): Any where M : Map<*, *>, M : Any {
   return (R)(if (`$this$ifEmpty`.isEmpty()) defaultValue() else `$this$ifEmpty`)
}

@InlineOnly
public inline operator fun <K, V> Entry<Any, Any>.component2(): Any {
   return (V)`$this$component2`.getValue()
}

@InlineOnly
@SinceKotlin(version = "1.1")
public inline fun <K, V> mutableMapOf(): MutableMap<Any, Any> {
   return LinkedHashMap()
}

public operator fun <K, V> Map<out Any, Any>.plus(map: Map<out Any, Any>): Map<Any, Any> {
   val var2: LinkedHashMap = LinkedHashMap(`$this$plus`)
   var2.putAll(map)
   return var2
}

@InlineOnly
public inline fun <K, V> Map<Any, Any>.getOrElse(key: Any, defaultValue: () -> Any): Any {
   var var10000: Any = `$this$getOrElse`.get(key)
   if (var10000 == null) {
      var10000 = defaultValue()
   }

   return (V)var10000
}

@InlineOnly
public inline fun <K, V> Map<Any, Any>.containsValue(value: Any): Boolean {
   return `$this$containsValue`.containsValue(value)
}

@SinceKotlin(version = "1.1")
public fun <K, V> Map<Any, Any>.getValue(key: Any): Any {
   return (V)MapsKt.getOrImplicitDefaultNullable(`$this$getValue`, key)
}

public fun <K, V> linkedMapOf(vararg pairs: Pair<Any, Any>): LinkedHashMap<Any, Any> {
   return MapsKt.toMap(pairs, LinkedHashMap(MapsKt.mapCapacity(pairs.length))) as LinkedHashMap<K, V>
}

@SinceKotlin(version = "1.1")
@InlineOnly
public inline fun <K, V> hashMapOf(): HashMap<Any, Any> {
   return HashMap()
}

@InlineOnly
@SinceKotlin(version = "1.1")
public inline operator fun <K, V> MutableMap<Any, Any>.minusAssign(keys: Sequence<Any>) {
   CollectionsKt.removeAll(`$this$minusAssign`.keySet(), keys)
}

public fun <K, V> hashMapOf(vararg pairs: Pair<Any, Any>): HashMap<Any, Any> {
   val var1: HashMap = HashMap(MapsKt.mapCapacity(pairs.length))
   MapsKt.putAll(var1, pairs)
   return var1
}

@InlineOnly
@SinceKotlin(version = "1.1")
public inline fun <K, V> linkedMapOf(): LinkedHashMap<Any, Any> {
   return LinkedHashMap()
}

@InlineOnly
public inline operator fun <K, V> MutableMap<in Any, in Any>.plusAssign(map: Map<Any, Any>) {
   `$this$plusAssign`.putAll(map)
}

@InlineOnly
public inline fun <K, V> Map<out Any, Any>.isNotEmpty(): Boolean {
   return !`$this$isNotEmpty`.isEmpty()
}

public inline fun <K, V> Map<out Any, Any>.filterKeys(predicate: (Any) -> Boolean): Map<Any, Any> {
   val result: LinkedHashMap = LinkedHashMap()

   for (entry in `$this$filterKeys`.entrySet()) {
      if (predicate(entry.getKey()) as java.lang.Boolean) {
         result.put(entry.getKey(), entry.getValue())
      }
   }

   return result
}

@SinceKotlin(version = "1.1")
public operator fun <K, V> Map<out Any, Any>.minus(key: Any): Map<Any, Any> {
   val var2: java.util.Map = MapsKt.toMutableMap(`$this$minus`)
   var2.remove(key)
   return MapsKt.optimizeReadOnlyMap(var2)
}

@SinceKotlin(version = "1.1")
public operator fun <K, V> Map<out Any, Any>.minus(keys: Array<out Any>): Map<Any, Any> {
   val var2: java.util.Map = MapsKt.toMutableMap(`$this$minus`)
   CollectionsKt.removeAll(var2.keySet(), keys)
   return MapsKt.optimizeReadOnlyMap(var2)
}

@SinceKotlin(version = "1.1")
public operator fun <K, V> Map<out Any, Any>.minus(keys: Iterable<Any>): Map<Any, Any> {
   val var2: java.util.Map = MapsKt.toMutableMap(`$this$minus`)
   CollectionsKt.removeAll(var2.keySet(), keys)
   return MapsKt.optimizeReadOnlyMap(var2)
}

@SinceKotlin(version = "1.1")
public fun <K, V> Map<out Any, Any>.toMutableMap(): MutableMap<Any, Any> {
   return LinkedHashMap(`$this$toMutableMap`)
}

public fun <K, V> Sequence<Pair<Any, Any>>.toMap(): Map<Any, Any> {
   return MapsKt.optimizeReadOnlyMap(MapsKt.toMap(`$this$toMap`, LinkedHashMap()))
}

@InlineOnly
public inline operator fun <K, V> Entry<Any, Any>.component1(): Any {
   return (K)`$this$component1`.getKey()
}

public fun <K, V> mapOf(vararg pairs: Pair<Any, Any>): Map<Any, Any> {
   return if (pairs.length > 0) MapsKt.toMap(pairs, LinkedHashMap(MapsKt.mapCapacity(pairs.length))) else MapsKt.emptyMap()
}

@SinceKotlin(version = "1.1")
@InlineOnly
public inline operator fun <K, V> MutableMap<Any, Any>.minusAssign(keys: Iterable<Any>) {
   CollectionsKt.removeAll(`$this$minusAssign`.keySet(), keys)
}

public fun <K, V, M : MutableMap<in Any, in Any>> Sequence<Pair<Any, Any>>.toMap(destination: Any): Any {
   MapsKt.putAll(destination, `$this$toMap`)
   return (M)destination
}

public inline fun <K, V, R> Map<out Any, Any>.mapKeys(transform: (Entry<Any, Any>) -> Any): Map<Any, Any> {
   val `destination$iv`: java.util.Map = LinkedHashMap(MapsKt.mapCapacity(`$this$mapKeys`.size()))

   for (`element$iv$iv` in `$this$mapKeys`.entrySet()) {
      `destination$iv`.put(transform(`element$iv$iv`), (`element$iv$iv` as java.util.Map.Entry).getValue())
   }

   return `destination$iv`
}

public fun <K, V> emptyMap(): Map<Any, Any> {
   val var10000: EmptyMap = EmptyMap.INSTANCE
   return var10000
}

@InlineOnly
public inline operator fun <K, V> MutableMap<in Any, in Any>.plusAssign(pairs: Sequence<Pair<Any, Any>>) {
   MapsKt.putAll(`$this$plusAssign`, pairs)
}

@InlineOnly
public inline operator fun <K, V> MutableMap<in Any, in Any>.plusAssign(pairs: Array<out Pair<Any, Any>>) {
   MapsKt.putAll(`$this$plusAssign`, pairs)
}

public operator fun <K, V> Map<out Any, Any>.plus(pairs: Array<out Pair<Any, Any>>): Map<Any, Any> {
   val var10000: java.util.Map
   if (`$this$plus`.isEmpty()) {
      var10000 = MapsKt.toMap(pairs)
   } else {
      val var2: LinkedHashMap = LinkedHashMap(`$this$plus`)
      MapsKt.putAll(var2, pairs)
      var10000 = var2
   }

   return var10000
}

@InlineOnly
public inline fun <K> Map<out Any, *>.containsKey(key: Any): Boolean {
   return `$this$containsKey`.containsKey(key)
}

public inline fun <K, V, M : MutableMap<in Any, in Any>> Map<out Any, Any>.filterTo(destination: Any, predicate: (Entry<Any, Any>) -> Boolean): Any {
   for (element in `$this$filterTo`.entrySet()) {
      if (predicate(element) as java.lang.Boolean) {
         destination.put(element.getKey(), element.getValue())
      }
   }

   return (M)destination
}

public inline fun <K, V, R, M : MutableMap<in Any, in Any>> Map<out Any, Any>.mapKeysTo(destination: Any, transform: (Entry<Any, Any>) -> Any): Any {
   for (`element$iv` in `$this$mapKeysTo`.entrySet()) {
      destination.put(transform(`element$iv`), (`element$iv` as java.util.Map.Entry).getValue())
   }

   return (M)destination
}

public inline fun <K, V, R, M : MutableMap<in Any, in Any>> Map<out Any, Any>.mapValuesTo(destination: Any, transform: (Entry<Any, Any>) -> Any): Any {
   for (`element$iv` in `$this$mapValuesTo`.entrySet()) {
      destination.put((`element$iv` as java.util.Map.Entry).getKey(), transform(`element$iv`))
   }

   return (M)destination
}

@SinceKotlin(version = "1.1")
public operator fun <K, V> Map<out Any, Any>.minus(keys: Sequence<Any>): Map<Any, Any> {
   val var2: java.util.Map = MapsKt.toMutableMap(`$this$minus`)
   CollectionsKt.removeAll(var2.keySet(), keys)
   return MapsKt.optimizeReadOnlyMap(var2)
}
