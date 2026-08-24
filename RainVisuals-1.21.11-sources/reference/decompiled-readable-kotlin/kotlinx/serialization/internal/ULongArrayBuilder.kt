package kotlinx.serialization.internal

import java.util.Arrays
import kotlinx.serialization.ExperimentalSerializationApi

// $VF: Compiled from PrimitiveArraysSerializers.kt
@ExperimentalSerializationApi
@PublishedApi
@ExperimentalUnsignedTypes
internal class ULongArrayBuilder internal constructor(bufferWithData: ULongArray) : ULongArrayBuilder(bufferWithData) {
   internal open var position: Int
      private set

   private final var buffer: ULongArray

   fun ULongArrayBuilder(bufferWithData: LongArray) {
      this.buffer = bufferWithData
      this.position = size
      this.ensureCapacity$kotlinx_serialization_core(10)
   }

   internal fun append(c: ULong) {
      PrimitiveArrayBuilder.ensureCapacity$kotlinx_serialization_core$default(this, 0, 1, null)
      val var10000: LongArray = this.buffer
      val var3: Int = this.position
      this.position = var3 + 1
      ULongArray.set_k8EXiF4/* $VF was: set-k8EXiF4 */(var10000, var3, c)
   }

   internal override fun ensureCapacity(requiredCapacity: Int) {
      if (size < requiredCapacity) {
         val var10001: LongArray = Arrays.copyOf(this.buffer, RangesKt.coerceAtLeast(requiredCapacity, size * 2))
         this.buffer = ULongArray.constructor_impl/* $VF was: constructor-impl */(var10001)
      }
   }

   internal open fun build(): ULongArray {
      val var10000: LongArray = Arrays.copyOf(this.buffer, this.position)
      return ULongArray.constructor_impl/* $VF was: constructor-impl */(var10000)
   }
}
