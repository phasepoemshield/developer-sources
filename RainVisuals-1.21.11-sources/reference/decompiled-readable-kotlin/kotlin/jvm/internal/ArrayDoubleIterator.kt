package kotlin.jvm.internal

import java.util.NoSuchElementException

// $VF: Compiled from ArrayIterators.kt
private class ArrayDoubleIterator(array: DoubleArray) : DoubleIterator {
   private final var index: Int
   private final val array: DoubleArray

   public override operator fun hasNext(): Boolean {
      return this.index < this.array.length
   }

   init {
      this.array = array
   }

   public override fun nextDouble(): Double {
      try {
         return this.array[this.index++]
      } catch (var4: ArrayIndexOutOfBoundsException) {
         this.index--
         throw NoSuchElementException(var4.getMessage())
      }
   }
}
