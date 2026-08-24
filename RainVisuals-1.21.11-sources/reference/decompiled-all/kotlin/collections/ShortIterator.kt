package kotlin.collections

import kotlin.jvm.internal.markers.KMappedMarker

// $VF: Compiled from PrimitiveIterators.kt
public abstract class ShortIterator : KMappedMarker, java.util.Iterator {
   public operator fun next(): Short {
      return this.nextShort()
   }

   public abstract fun nextShort(): Short {
   }

   override fun remove() {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }
}
