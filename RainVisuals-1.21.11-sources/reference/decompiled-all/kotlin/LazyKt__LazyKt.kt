@file:JvmMultifileClass
@file:JvmName("LazyKt")

package kotlin

import kotlin.internal.InlineOnly
import kotlin.reflect.KProperty

// $VF: Compiled from Lazy.kt
public fun <T> lazyOf(value: Any): Lazy<Any> {
   return (Lazy<T>)InitializedLazyImpl<>(value)
}

@InlineOnly
public inline operator fun <T> Lazy<Any>.getValue(thisRef: Any?, property: KProperty<*>): Any {
   return (T)`$this$getValue`.value
}

open fun LazyKt__LazyKt() {
}
