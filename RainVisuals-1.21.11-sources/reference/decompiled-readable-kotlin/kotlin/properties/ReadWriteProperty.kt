package kotlin.properties

import kotlin.reflect.KProperty

// $VF: Compiled from Interfaces.kt
public interface ReadWriteProperty<T, V> : ReadOnlyProperty<T, V> {
   public abstract operator fun setValue(thisRef: Any, property: KProperty<*>, value: Any) {
   }

   public abstract override operator fun getValue(thisRef: Any, property: KProperty<*>): Any {
   }
}
