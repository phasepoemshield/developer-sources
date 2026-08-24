package kotlin.jvm.internal

import java.util.NoSuchElementException

// $VF: Compiled from ArrayIterators.kt
private class ArrayCharIterator(array: CharArray) : CharIterator {
   private final val array: CharArray
   private final var index: Int

   public override operator fun hasNext(): Boolean {
      return this.index < this.array.length
   }

   public override fun nextChar(): Char {
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
