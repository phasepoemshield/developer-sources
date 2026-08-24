package kotlin.jvm.internal

import java.util.NoSuchElementException

// $VF: Compiled from ArrayIterators.kt
private class ArrayLongIterator(array: LongArray) : LongIterator {
   private final var index: Int
   private final val array: LongArray

   public override fun nextLong(): Long {
      try {
         return this.array[this.index++]
      } catch (var4: ArrayIndexOutOfBoundsException) {
         this.index--
         throw NoSuchElementException(var4.getMessage())
      }
   }

   init {
      this.array = array
   }

   public override operator fun hasNext(): Boolean {
      return this.index < this.array.length
   }
}
