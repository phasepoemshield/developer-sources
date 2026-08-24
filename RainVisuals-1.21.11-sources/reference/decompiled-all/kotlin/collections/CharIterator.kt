package kotlin.collections

import kotlin.jvm.internal.markers.KMappedMarker

// $VF: Compiled from PrimitiveIterators.kt
public abstract class CharIterator : KMappedMarker, java.util.Iterator {
   public abstract fun nextChar(): Char {
   }

   public operator fun next(): Char {
      return this.nextChar()
   }

   override fun remove() {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }
}
