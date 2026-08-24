package kotlin.jvm.internal

import java.util.NoSuchElementException

// $VF: Compiled from ArrayIterators.kt
private class ArrayShortIterator(array: ShortArray) : ShortIterator {
   private final var index: Int
   private final val array: ShortArray

   public override operator fun hasNext(): Boolean {
      return this.index < this.array.length
   }

   public override fun nextShort(): Short {
      try {
         return this.array[this.index++]
      } catch (var3: ArrayIndexOutOfBoundsException) {
         this.index--
         throw NoSuchElementException(var3.getMessage())
      }
   }

   init {
      this.array = array
   }
}
