package kotlin.collections

import kotlin.jvm.internal.markers.KMappedMarker

// $VF: Compiled from PrimitiveIterators.kt
public abstract class LongIterator : java.util.Iterator<java.lang.Long>, KMappedMarker {
   public abstract fun nextLong(): Long {
   }

   public operator fun next(): Long {
      return this.nextLong()
   }

   override fun remove() {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }
}
