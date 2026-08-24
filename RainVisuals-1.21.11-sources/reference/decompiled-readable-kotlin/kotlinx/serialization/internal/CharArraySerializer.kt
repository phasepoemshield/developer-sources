package kotlinx.serialization.internal

import kotlin.jvm.internal.CharCompanionObject
import kotlinx.serialization.KSerializer
import kotlinx.serialization.builtins.BuiltinSerializersKt
import kotlinx.serialization.encoding.CompositeDecoder
import kotlinx.serialization.encoding.CompositeEncoder

// $VF: Compiled from PrimitiveArraysSerializers.kt
@PublishedApi
internal object CharArraySerializer : PrimitiveArraySerializer(BuiltinSerializersKt.serializer(CharCompanionObject.INSTANCE)), KSerializer<char[]> {
   protected open fun readElement(decoder: CompositeDecoder, index: Int, builder: CharArrayBuilder, checkIndex: Boolean) {
      builder.append$kotlinx_serialization_core(decoder.decodeCharElement(this.getDescriptor(), index))
   }

   protected open fun writeContent(encoder: CompositeEncoder, content: CharArray, size: Int) {
      repeat(size) { i ->
         encoder.encodeCharElement(this.getDescriptor(), i, content[i])
      }
   }

   protected open fun CharArray.collectionSize(): Int {
      return `$this$collectionSize`.length
   }

   protected open fun empty(): CharArray {
      return CharArray(0)
   }

   protected open fun CharArray.toBuilder(): CharArrayBuilder {
      return CharArrayBuilder(`$this$toBuilder`)
   }
}
