package kotlin

import kotlin.internal.InlineOnly
import kotlin.reflect.KMutableProperty0
import kotlin.reflect.KMutableProperty1
import kotlin.reflect.KProperty
import kotlin.reflect.KProperty0
import kotlin.reflect.KProperty1

// $VF: Compiled from PropertyReferenceDelegates.kt
@InlineOnly
@SinceKotlin(version = "1.4")
public inline operator fun <V> KProperty0<Any>.getValue(thisRef: Any?, property: KProperty<*>): Any {
   return (V)`$this$getValue`.get()
}

@InlineOnly
@SinceKotlin(version = "1.4")
public inline operator fun <V> KMutableProperty0<Any>.setValue(thisRef: Any?, property: KProperty<*>, value: Any) {
   `$this$setValue`.set(value)
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline operator fun <T, V> KMutableProperty1<Any, Any>.setValue(thisRef: Any, property: KProperty<*>, value: Any) {
   `$this$setValue`.set(thisRef, value)
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline operator fun <T, V> KProperty1<Any, Any>.getValue(thisRef: Any, property: KProperty<*>): Any {
   return (V)`$this$getValue`.get(thisRef)
}
