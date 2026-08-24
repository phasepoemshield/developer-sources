@file:JvmName(name = "MapAccessorsKt")

package kotlin.collections

import kotlin.internal.InlineOnly
import kotlin.reflect.KProperty

// $VF: Compiled from MapAccessors.kt
@InlineOnly
public inline operator fun <V, V1 : Any> Map<in String, Any>.getValue(thisRef: Any?, property: KProperty<*>): Any {
   return (V1)MapsKt.getOrImplicitDefaultNullable(`$this$getValue`, property.getName())
}

@JvmName(name = "getVar")
@InlineOnly
public inline operator fun <V, V1 : Any> MutableMap<in String, out Any>.getValue(thisRef: Any?, property: KProperty<*>): Any {
   return (V1)MapsKt.getOrImplicitDefaultNullable(`$this$getValue`, property.getName())
}

@InlineOnly
public inline operator fun <V> MutableMap<in String, in Any>.setValue(thisRef: Any?, property: KProperty<*>, value: Any) {
   `$this$setValue`.put(property.getName(), value)
}
