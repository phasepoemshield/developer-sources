package kotlin.collections

import kotlin.jvm.internal.markers.KMappedMarker

// $VF: Compiled from PrimitiveIterators.kt
public abstract class BooleanIterator : java.util.Iterator<java.lang.Boolean>, KMappedMarker {
   override fun remove() {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   public operator fun next(): Boolean {
      return this.nextBoolean()
   }

   public abstract fun nextBoolean(): Boolean {
   }
}
