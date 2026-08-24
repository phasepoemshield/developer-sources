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
internal object UShortArraySerializer : PrimitiveArraySerializer(BuiltinSerializersKt.serializer(UShort.Companion)), KSerializer<UShortArray> {
   protected open fun readElement(decoder: CompositeDecoder, index: Int, builder: UShortArrayBuilder, checkIndex: Boolean) {
      builder.append_xj2QHRw$kotlinx_serialization_core/* $VF was: append-xj2QHRw$kotlinx_serialization_core */(
         UShort.constructor_impl/* $VF was: constructor-impl */(decoder.decodeInlineElement(this.getDescriptor(), index).decodeShort())
      )
   }

   protected open fun writeContent(encoder: CompositeEncoder, content: UShortArray, size: Int) {
      repeat(size) { i ->
         encoder.encodeInlineElement(this.getDescriptor(), i).encodeShort(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(content, i))
      }
   }

   protected open fun empty(): UShortArray {
      return UShortArray.constructor_impl/* $VF was: constructor-impl */(0)
   }

   protected open fun UShortArray.collectionSize(): Int {
      return size
   }

   protected open fun UShortArray.toBuilder(): UShortArrayBuilder {
      return UShortArrayBuilder(`$this$toBuilder_u2drL5Bavg`, null)
   }
}
