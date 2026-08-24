package kotlinx.serialization.internal

import kotlin.jvm.internal.LongCompanionObject
import kotlinx.serialization.KSerializer
import kotlinx.serialization.builtins.BuiltinSerializersKt
import kotlinx.serialization.encoding.CompositeDecoder
import kotlinx.serialization.encoding.CompositeEncoder

// $VF: Compiled from PrimitiveArraysSerializers.kt
@PublishedApi
internal object LongArraySerializer : PrimitiveArraySerializer(BuiltinSerializersKt.serializer(LongCompanionObject.INSTANCE)), KSerializer<long[]> {
   protected open fun LongArray.toBuilder(): LongArrayBuilder {
      return LongArrayBuilder(`$this$toBuilder`)
   }

   protected open fun writeContent(encoder: CompositeEncoder, content: LongArray, size: Int) {
      repeat(size) { i ->
         encoder.encodeLongElement(this.getDescriptor(), i, content[i])
      }
   }

   protected open fun LongArray.collectionSize(): Int {
      return `$this$collectionSize`.length
   }

   protected open fun empty(): LongArray {
      return LongArray(0)
   }

   protected open fun readElement(decoder: CompositeDecoder, index: Int, builder: LongArrayBuilder, checkIndex: Boolean) {
      builder.append$kotlinx_serialization_core(decoder.decodeLongElement(this.getDescriptor(), index))
   }
}
