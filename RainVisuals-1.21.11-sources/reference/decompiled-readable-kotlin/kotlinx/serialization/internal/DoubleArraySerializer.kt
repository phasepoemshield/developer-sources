package kotlinx.serialization.internal

import kotlin.jvm.internal.DoubleCompanionObject
import kotlinx.serialization.KSerializer
import kotlinx.serialization.builtins.BuiltinSerializersKt
import kotlinx.serialization.encoding.CompositeDecoder
import kotlinx.serialization.encoding.CompositeEncoder

// $VF: Compiled from PrimitiveArraysSerializers.kt
@PublishedApi
internal object DoubleArraySerializer : PrimitiveArraySerializer(BuiltinSerializersKt.serializer(DoubleCompanionObject.INSTANCE)), KSerializer<double[]> {
   protected open fun empty(): DoubleArray {
      return DoubleArray(0)
   }

   protected open fun DoubleArray.collectionSize(): Int {
      return `$this$collectionSize`.length
   }

   protected open fun DoubleArray.toBuilder(): DoubleArrayBuilder {
      return DoubleArrayBuilder(`$this$toBuilder`)
   }

   protected open fun writeContent(encoder: CompositeEncoder, content: DoubleArray, size: Int) {
      repeat(size) { i ->
         encoder.encodeDoubleElement(this.getDescriptor(), i, content[i])
      }
   }

   protected open fun readElement(decoder: CompositeDecoder, index: Int, builder: DoubleArrayBuilder, checkIndex: Boolean) {
      builder.append$kotlinx_serialization_core(decoder.decodeDoubleElement(this.getDescriptor(), index))
   }
}
