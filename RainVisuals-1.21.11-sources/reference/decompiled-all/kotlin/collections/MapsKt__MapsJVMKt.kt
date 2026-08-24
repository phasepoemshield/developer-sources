@file:JvmMultifileClass
@file:JvmName("MapsKt")

package kotlin.collections

import java.util.Collections
import java.util.Comparator
import java.util.Properties
import java.util.SortedMap
import java.util.TreeMap
import java.util.Map.Entry
import java.util.concurrent.ConcurrentMap
import kotlin.collections.builders.MapBuilder
import kotlin.internal.InlineOnly

// $VF: Compiled from MapsJVM.kt
private const val INT_MAX_POWER_OF_TWO: Int = 1073741824

@PublishedApi
@SinceKotlin(version = "1.3")
internal fun <K, V> build(builder: MutableMap<Any, Any>): Map<Any, Any> {
   return (builder as MapBuilder).build()
}

@InlineOnly
public inline fun Map<String, String>.toProperties(): Properties {
   val var1: Properties = Properties()
   var1.putAll(`$this$toProperties`)
   return var1
}

open fun MapsKt__MapsJVMKt() {
}

@PublishedApi
internal fun mapCapacity(expectedSize: Int): Int {
   return if (expectedSize < 0)
      expectedSize
      else
      (if (expectedSize < 3) expectedSize + 1 else (if (expectedSize < 1073741824) (int)(expectedSize / 0.75F + 1.0F) else Integer.MAX_VALUE))
   }

@PublishedApi
@SinceKotlin(version = "1.3")
@InlineOnly
internal inline fun <K, V> buildMapInternal(capacity: Int, builderAction: (MutableMap<Any, Any>) -> Unit): Map<Any, Any> {
   val var2: java.util.Map = MapsKt.createMapBuilder(capacity)
   builderAction(var2)
   return MapsKt.build(var2)
}

@SinceKotlin(version = "1.3")
@PublishedApi
internal fun <K, V> createMapBuilder(capacity: Int): MutableMap<Any, Any> {
   return MapBuilder(capacity)
}

public fun <K : Comparable<Any>, V> sortedMapOf(vararg pairs: Pair<Any, Any>): SortedMap<Any, Any> {
   val var1: TreeMap = TreeMap()
   MapsKt.putAll(var1, pairs)
   return var1
}

@InlineOnly
@PublishedApi
@SinceKotlin(version = "1.3")
internal inline fun <K, V> buildMapInternal(builderAction: (MutableMap<Any, Any>) -> Unit): Map<Any, Any> {
   val var1: java.util.Map = MapsKt.createMapBuilder()
   builderAction(var1)
   return MapsKt.build(var1)
}

@SinceKotlin(version = "1.4")
public fun <K, V> sortedMapOf(comparator: Comparator<in Any>, vararg pairs: Pair<Any, Any>): SortedMap<Any, Any> {
   val var2: TreeMap = TreeMap(comparator)
   MapsKt.putAll(var2, pairs)
   return var2
}

public fun <K : Comparable<Any>, V> Map<out Any, Any>.toSortedMap(): SortedMap<Any, Any> {
   return TreeMap(`$this$toSortedMap`)
}

public fun <K, V> Map<out Any, Any>.toSortedMap(comparator: Comparator<in Any>): SortedMap<Any, Any> {
   val var2: TreeMap = TreeMap(comparator)
   var2.putAll(`$this$toSortedMap`)
   return var2
}

public fun <K, V> mapOf(pair: Pair<Any, Any>): Map<Any, Any> {
   val var10000: java.util.Map = Collections.singletonMap(pair.first, pair.second)
   return var10000
}

@InlineOnly
internal inline fun <K, V> Map<Any, Any>.toSingletonMapOrSelf(): Map<Any, Any> {
   return MapsKt.toSingletonMap(`$this$toSingletonMapOrSelf`)
}

@PublishedApi
@SinceKotlin(version = "1.3")
internal fun <K, V> createMapBuilder(): MutableMap<Any, Any> {
   return MapBuilder()
}

public inline fun <K, V> ConcurrentMap<Any, Any>.getOrPut(key: Any, defaultValue: () -> Any): Any {
   var var10000: Any = `$this$getOrPut`.get(key)
   if (var10000 == null) {
      val var5: Any = defaultValue()
      var10000 = `$this$getOrPut`.putIfAbsent(key, var5)
      if (var10000 == null) {
         var10000 = var5
      }
   }

   return (V)var10000
}

internal fun <K, V> Map<out Any, Any>.toSingletonMap(): Map<Any, Any> {
   val `$this$toSingletonMap_u24lambda_u245`: Entry = `$this$toSingletonMap`.entrySet().iterator().next() as Entry
   val var10000: java.util.Map = Collections.singletonMap(`$this$toSingletonMap_u24lambda_u245`.getKey(), `$this$toSingletonMap_u24lambda_u245`.getValue())
   return var10000
}
