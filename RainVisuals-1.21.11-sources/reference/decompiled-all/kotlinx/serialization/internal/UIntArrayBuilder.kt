package kotlinx.serialization.internal

import java.util.Arrays
import kotlinx.serialization.ExperimentalSerializationApi

// $VF: Compiled from PrimitiveArraysSerializers.kt
@ExperimentalSerializationApi
@ExperimentalUnsignedTypes
@PublishedApi
internal class UIntArrayBuilder internal constructor(bufferWithData: UIntArray) : UIntArrayBuilder(bufferWithData) {
   private final var buffer: UIntArray

   internal open var position: Int
      private set

   internal open fun build(): UIntArray {
      val var10000: IntArray = Arrays.copyOf(this.buffer, this.position)
      return UIntArray.constructor_impl/* $VF was: constructor-impl */(var10000)
   }

   internal override fun ensureCapacity(requiredCapacity: Int) {
      if (size < requiredCapacity) {
         val var10001: IntArray = Arrays.copyOf(this.buffer, RangesKt.coerceAtLeast(requiredCapacity, size * 2))
         this.buffer = UIntArray.constructor_impl/* $VF was: constructor-impl */(var10001)
      }
   }

   internal fun append(c: UInt) {
      PrimitiveArrayBuilder.ensureCapacity$kotlinx_serialization_core$default(this, 0, 1, null)
      val var10000: IntArray = this.buffer
      val var2: Int = this.position
      this.position = var2 + 1
      UIntArray.set_VXSXFK8/* $VF was: set-VXSXFK8 */(var10000, var2, c)
   }

   fun UIntArrayBuilder(bufferWithData: IntArray) {
      this.buffer = bufferWithData
      this.position = size
      this.ensureCapacity$kotlinx_serialization_core(10)
   }
}
