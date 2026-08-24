package kotlinx.serialization.internal

import kotlin.jvm.internal.IntCompanionObject
import kotlinx.serialization.KSerializer
import kotlinx.serialization.builtins.BuiltinSerializersKt
import kotlinx.serialization.encoding.CompositeDecoder
import kotlinx.serialization.encoding.CompositeEncoder

// $VF: Compiled from PrimitiveArraysSerializers.kt
@PublishedApi
internal object IntArraySerializer : PrimitiveArraySerializer(BuiltinSerializersKt.serializer(IntCompanionObject.INSTANCE)), KSerializer<int[]> {
   protected open fun readElement(decoder: CompositeDecoder, index: Int, builder: IntArrayBuilder, checkIndex: Boolean) {
      builder.append$kotlinx_serialization_core(decoder.decodeIntElement(this.getDescriptor(), index))
   }

   protected open fun empty(): IntArray {
      return IntArray(0)
   }

   protected open fun IntArray.toBuilder(): IntArrayBuilder {
      return IntArrayBuilder(`$this$toBuilder`)
   }

   protected open fun writeContent(encoder: CompositeEncoder, content: IntArray, size: Int) {
      repeat(size) { i ->
         encoder.encodeIntElement(this.getDescriptor(), i, content[i])
      }
   }

   protected open fun IntArray.collectionSize(): Int {
      return `$this$collectionSize`.length
   }
}
