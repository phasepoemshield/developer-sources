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
internal object ULongArraySerializer : PrimitiveArraySerializer(BuiltinSerializersKt.serializer(ULong.Companion)), KSerializer<ULongArray> {
   protected open fun empty(): ULongArray {
      return ULongArray.constructor_impl/* $VF was: constructor-impl */(0)
   }

   protected open fun ULongArray.toBuilder(): ULongArrayBuilder {
      return ULongArrayBuilder(`$this$toBuilder_u2dQwZRm1k`, null)
   }

   protected open fun ULongArray.collectionSize(): Int {
      return size
   }

   protected open fun writeContent(encoder: CompositeEncoder, content: ULongArray, size: Int) {
      repeat(size) { i ->
         encoder.encodeInlineElement(this.getDescriptor(), i).encodeLong(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(content, i))
      }
   }

   protected open fun readElement(decoder: CompositeDecoder, index: Int, builder: ULongArrayBuilder, checkIndex: Boolean) {
      builder.append_VKZWuLQ$kotlinx_serialization_core/* $VF was: append-VKZWuLQ$kotlinx_serialization_core */(
         ULong.constructor_impl/* $VF was: constructor-impl */(decoder.decodeInlineElement(this.getDescriptor(), index).decodeLong())
      )
   }
}
