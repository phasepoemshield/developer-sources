package kotlin.collections

import kotlin.jvm.internal.markers.KMappedMarker

// $VF: Compiled from PrimitiveIterators.kt
public abstract class FloatIterator : KMappedMarker, java.util.Iterator {
   public abstract fun nextFloat(): Float {
   }

   public operator fun next(): Float {
      return this.nextFloat()
   }

   override fun remove() {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }
}
