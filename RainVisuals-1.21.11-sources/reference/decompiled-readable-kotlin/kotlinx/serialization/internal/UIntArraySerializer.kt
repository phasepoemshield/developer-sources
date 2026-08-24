package kotlinx.serialization.internal

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.KSerializer
import kotlinx.serialization.builtins.BuiltinSerializersKt
import kotlinx.serialization.encoding.CompositeDecoder
import kotlinx.serialization.encoding.CompositeEncoder

// $VF: Compiled from PrimitiveArraysSerializers.kt
@ExperimentalSerializationApi
@ExperimentalUnsignedTypes
@PublishedApi
internal object UIntArraySerializer : PrimitiveArraySerializer(BuiltinSerializersKt.serializer(UInt.Companion)), KSerializer<UIntArray> {
   protected open fun UIntArray.toBuilder(): UIntArrayBuilder {
      return UIntArrayBuilder(`$this$toBuilder_u2d_u2dajY_u2d9A`, null)
   }

   protected open fun writeContent(encoder: CompositeEncoder, content: UIntArray, size: Int) {
      repeat(size) { i ->
         encoder.encodeInlineElement(this.getDescriptor(), i).encodeInt(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(content, i))
      }
   }

   protected open fun UIntArray.collectionSize(): Int {
      return size
   }

   protected open fun empty(): UIntArray {
      return UIntArray.constructor_impl/* $VF was: constructor-impl */(0)
   }

   protected open fun readElement(decoder: CompositeDecoder, index: Int, builder: UIntArrayBuilder, checkIndex: Boolean) {
      builder.append_WZ4Q5Ns$kotlinx_serialization_core/* $VF was: append-WZ4Q5Ns$kotlinx_serialization_core */(
         UInt.constructor_impl/* $VF was: constructor-impl */(decoder.decodeInlineElement(this.getDescriptor(), index).decodeInt())
      )
   }
}
