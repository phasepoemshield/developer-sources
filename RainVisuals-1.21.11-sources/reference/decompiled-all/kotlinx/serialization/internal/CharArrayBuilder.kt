package kotlinx.serialization.internal

import java.util.Arrays

// $VF: Compiled from PrimitiveArraysSerializers.kt
@PublishedApi
internal class CharArrayBuilder internal constructor(bufferWithData: CharArray) : PrimitiveArrayBuilder<char[]> {
   internal open var position: Int
      private set

   private final var buffer: CharArray

   init {
      this.buffer = bufferWithData
      this.position = bufferWithData.length
      this.ensureCapacity$kotlinx_serialization_core(10)
   }

   internal open fun build(): CharArray {
      val var10000: CharArray = Arrays.copyOf(this.buffer, this.position)
      return var10000
   }

   internal fun append(c: Char) {
      PrimitiveArrayBuilder.ensureCapacity$kotlinx_serialization_core$default(this, 0, 1, null)
      val var10000: CharArray = this.buffer
      val var2: Int = this.position
      this.position = var2 + 1
      var10000[var2] = c
   }

   internal override fun ensureCapacity(requiredCapacity: Int) {
      if (this.buffer.length < requiredCapacity) {
         val var10001: CharArray = Arrays.copyOf(this.buffer, RangesKt.coerceAtLeast(requiredCapacity, this.buffer.length * 2))
         this.buffer = var10001
      }
   }
}
