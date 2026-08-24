package kotlinx.serialization.internal

import java.util.Arrays
import kotlinx.serialization.ExperimentalSerializationApi

// $VF: Compiled from PrimitiveArraysSerializers.kt
@ExperimentalSerializationApi
@ExperimentalUnsignedTypes
@PublishedApi
internal class UShortArrayBuilder internal constructor(bufferWithData: UShortArray) : UShortArrayBuilder(bufferWithData) {
   internal open var position: Int
      private set

   private final var buffer: UShortArray

   internal open fun build(): UShortArray {
      val var10000: ShortArray = Arrays.copyOf(this.buffer, this.position)
      return UShortArray.constructor_impl/* $VF was: constructor-impl */(var10000)
   }

   internal override fun ensureCapacity(requiredCapacity: Int) {
      if (size < requiredCapacity) {
         val var10001: ShortArray = Arrays.copyOf(this.buffer, RangesKt.coerceAtLeast(requiredCapacity, size * 2))
         this.buffer = UShortArray.constructor_impl/* $VF was: constructor-impl */(var10001)
      }
   }

   internal fun append(c: UShort) {
      PrimitiveArrayBuilder.ensureCapacity$kotlinx_serialization_core$default(this, 0, 1, null)
      val var10000: ShortArray = this.buffer
      val var2: Int = this.position
      this.position = var2 + 1
      UShortArray.set_01HTLdE/* $VF was: set-01HTLdE */(var10000, var2, c)
   }

   fun UShortArrayBuilder(bufferWithData: ShortArray) {
      this.buffer = bufferWithData
      this.position = size
      this.ensureCapacity$kotlinx_serialization_core(10)
   }
}
