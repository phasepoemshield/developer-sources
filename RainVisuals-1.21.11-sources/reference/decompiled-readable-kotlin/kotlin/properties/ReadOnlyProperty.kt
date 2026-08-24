package kotlin.properties

import kotlin.reflect.KProperty

// $VF: Compiled from Interfaces.kt
public fun interface ReadOnlyProperty<T, V> {
   public abstract operator fun getValue(thisRef: Any, property: KProperty<*>): Any {
   }
}
