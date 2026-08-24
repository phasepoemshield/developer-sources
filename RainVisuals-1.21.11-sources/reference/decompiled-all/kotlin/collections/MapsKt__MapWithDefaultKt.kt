@file:JvmMultifileClass
@file:JvmName("MapsKt")

package kotlin.collections

import java.util.NoSuchElementException

// $VF: Compiled from MapWithDefault.kt
open fun MapsKt__MapWithDefaultKt() {
}

public fun <K, V> Map<Any, Any>.withDefault(defaultValue: (Any) -> Any): Map<Any, Any> {
   return if (`$this$withDefault` is MapWithDefault)
      MapsKt.withDefault((`$this$withDefault` as MapWithDefault).map, defaultValue)
      else
      MapWithDefaultImpl(`$this$withDefault`, defaultValue)
   }

@JvmName(name = "getOrImplicitDefaultNullable")
@PublishedApi
internal fun <K, V> Map<Any, Any>.getOrImplicitDefault(key: Any): Any {
   if (`$this$getOrImplicitDefault` is MapWithDefault) {
      return (V)(`$this$getOrImplicitDefault` as MapWithDefault).getOrImplicitDefault(key)
   } else {
      val `value$iv`: Any = `$this$getOrImplicitDefault`.get(key)
      if (`value$iv` == null && !`$this$getOrImplicitDefault`.containsKey(key)) {
         throw NoSuchElementException("Key $key is missing in the map.")
      } else {
         return (V)`value$iv`
      }
   }
}

@JvmName(name = "withDefaultMutable")
public fun <K, V> MutableMap<Any, Any>.withDefault(defaultValue: (Any) -> Any): MutableMap<Any, Any> {
   return if (`$this$withDefault` is MutableMapWithDefault)
      MapsKt.withDefaultMutable((`$this$withDefault` as MutableMapWithDefault).map, defaultValue)
      else
      MutableMapWithDefaultImpl(`$this$withDefault`, defaultValue)
   }
