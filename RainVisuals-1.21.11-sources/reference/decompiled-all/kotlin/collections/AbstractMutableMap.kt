package kotlin.collections

import kotlin.jvm.internal.markers.KMutableMap

// $VF: Compiled from AbstractMutableMap.kt
@SinceKotlin(version = "1.1")
public abstract class AbstractMutableMap<K, V> : java.util.AbstractMap<K, V>, KMutableMap, java.util.Map {
   open fun AbstractMutableMap() {
   }

   public abstract override fun put(key: Any, value: Any): Any? {
   }

   abstract fun getEntries(): java.util.Set
}
