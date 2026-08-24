package kotlin.jvm.internal

import java.util.NoSuchElementException

// $VF: Compiled from ArrayIterators.kt
private class ArrayByteIterator(array: ByteArray) : ByteIterator {
   private final var index: Int
   private final val array: ByteArray

   init {
      this.array = array
   }

   public override operator fun hasNext(): Boolean {
      return this.index < this.array.length
   }

   public override fun nextByte(): Byte {
      try {
         return this.array[this.index++]
      } catch (var3: ArrayIndexOutOfBoundsException) {
         this.index--
         throw NoSuchElementException(var3.getMessage())
      }
   }
}
