package kotlin.jvm.internal

import java.util.NoSuchElementException
import kotlin.jvm.internal.markers.KMappedMarker

// $VF: Compiled from ArrayIterator.kt
private class ArrayIterator<T>(vararg array: Any) : KMappedMarker, java.util.Iterator {
   public final val array: Array<Any>
   private final var index: Int

   public override operator fun next(): Any {
      try {
         return this.array[this.index++]
      } catch (var3: ArrayIndexOutOfBoundsException) {
         this.index--
         throw NoSuchElementException(var3.getMessage())
      }
   }

   init {
      this.array = (T[])array
   }

   public override operator fun hasNext(): Boolean {
      return this.index < this.array.length
   }

   override fun remove() {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }
}
