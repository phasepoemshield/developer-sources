package kotlinx.serialization.internal

import java.util.Arrays
import kotlinx.serialization.ExperimentalSerializationApi

// $VF: Compiled from PrimitiveArraysSerializers.kt
@ExperimentalSerializationApi
@PublishedApi
@ExperimentalUnsignedTypes
internal class UByteArrayBuilder internal constructor(bufferWithData: UByteArray) : UByteArrayBuilder(bufferWithData) {
   internal open var position: Int
      private set

   private final var buffer: UByteArray

   fun UByteArrayBuilder(bufferWithData: ByteArray) {
      this.buffer = bufferWithData
      this.position = size
      this.ensureCapacity$kotlinx_serialization_core(10)
   }

   internal fun append(c: UByte) {
      PrimitiveArrayBuilder.ensureCapacity$kotlinx_serialization_core$default(this, 0, 1, null)
      val var10000: ByteArray = this.buffer
      val var2: Int = this.position
      this.position = var2 + 1
      UByteArray.set_VurrAj0/* $VF was: set-VurrAj0 */(var10000, var2, c)
   }

   internal override fun ensureCapacity(requiredCapacity: Int) {
      if (size < requiredCapacity) {
         val var10001: ByteArray = Arrays.copyOf(this.buffer, RangesKt.coerceAtLeast(requiredCapacity, size * 2))
         this.buffer = UByteArray.constructor_impl/* $VF was: constructor-impl */(var10001)
      }
   }

   internal open fun build(): UByteArray {
      val var10000: ByteArray = Arrays.copyOf(this.buffer, this.position)
      return UByteArray.constructor_impl/* $VF was: constructor-impl */(var10000)
   }
}
