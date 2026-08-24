package kotlinx.serialization.internal

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.KSerializer
import kotlinx.serialization.builtins.BuiltinSerializersKt
import kotlinx.serialization.encoding.CompositeDecoder
import kotlinx.serialization.encoding.CompositeEncoder

// $VF: Compiled from PrimitiveArraysSerializers.kt
@ExperimentalSerializationApi
@PublishedApi
@ExperimentalUnsignedTypes
internal object UByteArraySerializer : PrimitiveArraySerializer(BuiltinSerializersKt.serializer(UByte.Companion)), KSerializer<UByteArray> {
   protected open fun writeContent(encoder: CompositeEncoder, content: UByteArray, size: Int) {
      repeat(size) { i ->
         encoder.encodeInlineElement(this.getDescriptor(), i).encodeByte(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(content, i))
      }
   }

   protected open fun readElement(decoder: CompositeDecoder, index: Int, builder: UByteArrayBuilder, checkIndex: Boolean) {
      builder.append_7apg3OU$kotlinx_serialization_core/* $VF was: append-7apg3OU$kotlinx_serialization_core */(
         UByte.constructor_impl/* $VF was: constructor-impl */(decoder.decodeInlineElement(this.getDescriptor(), index).decodeByte())
      )
   }

   protected open fun empty(): UByteArray {
      return UByteArray.constructor_impl/* $VF was: constructor-impl */(0)
   }

   protected open fun UByteArray.toBuilder(): UByteArrayBuilder {
      return UByteArrayBuilder(`$this$toBuilder_u2dGBYM_sE`, null)
   }

   protected open fun UByteArray.collectionSize(): Int {
      return size
   }
}
