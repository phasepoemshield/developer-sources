package kotlin.jvm.internal

import java.util.NoSuchElementException

// $VF: Compiled from ArrayIterators.kt
private class ArrayFloatIterator(array: FloatArray) : FloatIterator {
   private final var index: Int
   private final val array: FloatArray

   public override fun nextFloat(): Float {
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

   init {
      this.array = array
   }
}
