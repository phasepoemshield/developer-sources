package kotlin.jvm.internal

import java.util.NoSuchElementException

// $VF: Compiled from ArrayIterators.kt
private class ArrayIntIterator(array: IntArray) : IntIterator {
   private final val array: IntArray
   private final var index: Int

   init {
      this.array = array
   }

   public override fun nextInt(): Int {
      try {
         return this.array[this.index++]
      } catch (var3: ArrayIndexOutOfBoundsException) {
         this.index--
         throw NoSuchElementException(var3.getMessage())
      }
   }

   public override operator fun hasNext(): Boolean {
      return this.index < this.array.length
   }
}
