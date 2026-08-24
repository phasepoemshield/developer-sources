package kotlin.collections

import kotlin.jvm.internal.markers.KMappedMarker

// $VF: Compiled from MapWithDefault.kt
private interface MapWithDefault<K, V> : KMappedMarker, java.util.Map {
   public val map: Map<Any, Any>

   public abstract fun getOrImplicitDefault(key: Any): Any {
   }
}
