package kotlin.collections

import kotlin.jvm.internal.markers.KMappedMarker

// $VF: Compiled from PrimitiveIterators.kt
public abstract class IntIterator : java.util.Iterator<Integer>, KMappedMarker {
   public abstract fun nextInt(): Int {
   }

   override fun remove() {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   public operator fun next(): Int {
      return this.nextInt()
   }
}
