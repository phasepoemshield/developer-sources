@file:JvmName(name = "CollectionsJDK8Kt")

package kotlin.collections.jdk8

import kotlin.internal.InlineOnly
import kotlin.jvm.internal.TypeIntrinsics

// $VF: Compiled from Collections.kt
@SinceKotlin(version = "1.2")
@InlineOnly
public inline fun <K, V> MutableMap<out Any, out Any>.remove(key: Any, value: Any): Boolean {
   return TypeIntrinsics.asMutableMap(`$this$remove`).remove(key, value)
}

@InlineOnly
@SinceKotlin(version = "1.2")
public inline fun <K, V> Map<out Any, Any>.getOrDefault(key: Any, defaultValue: Any): Any {
   return (V)`$this$getOrDefault`.getOrDefault(key, defaultValue)
}
