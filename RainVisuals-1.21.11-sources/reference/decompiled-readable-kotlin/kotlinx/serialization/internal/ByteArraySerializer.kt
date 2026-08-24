package kotlinx.serialization.internal

import kotlin.jvm.internal.ByteCompanionObject
import kotlinx.serialization.KSerializer
import kotlinx.serialization.builtins.BuiltinSerializersKt
import kotlinx.serialization.encoding.CompositeDecoder
import kotlinx.serialization.encoding.CompositeEncoder

// $VF: Compiled from PrimitiveArraysSerializers.kt
@PublishedApi
internal object ByteArraySerializer : PrimitiveArraySerializer(BuiltinSerializersKt.serializer(ByteCompanionObject.INSTANCE)), KSerializer<byte[]> {
   protected open fun readElement(decoder: CompositeDecoder, index: Int, builder: ByteArrayBuilder, checkIndex: Boolean) {
      builder.append$kotlinx_serialization_core(decoder.decodeByteElement(this.getDescriptor(), index))
   }

   protected open fun empty(): ByteArray {
      return ByteArray(0)
   }

   protected open fun ByteArray.collectionSize(): Int {
      return `$this$collectionSize`.length
   }

   protected open fun writeContent(encoder: CompositeEncoder, content: ByteArray, size: Int) {
      repeat(size) { i ->
         encoder.encodeByteElement(this.getDescriptor(), i, content[i])
      }
   }

   protected open fun ByteArray.toBuilder(): ByteArrayBuilder {
      return ByteArrayBuilder(`$this$toBuilder`)
   }
}
