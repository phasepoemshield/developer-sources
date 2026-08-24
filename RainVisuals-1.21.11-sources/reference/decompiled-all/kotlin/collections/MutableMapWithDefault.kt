package kotlin.collections

import kotlin.jvm.internal.markers.KMutableMap

// $VF: Compiled from MapWithDefault.kt
private interface MutableMapWithDefault<K, V> : MapWithDefault, MapWithDefault<K, V>, KMutableMap {
   public val map: MutableMap<Any, Any>
}
