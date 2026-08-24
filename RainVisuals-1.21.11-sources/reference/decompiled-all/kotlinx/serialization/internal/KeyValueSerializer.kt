package kotlinx.serialization.internal

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeDecoder
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

// $VF: Compiled from Tuples.kt
@PublishedApi
internal sealed class KeyValueSerializer<K, V, R> protected constructor(keySerializer: KSerializer<Any>, valueSerializer: KSerializer<Any>) : KSerializer<R> {
   protected final val valueSerializer: KSerializer<Any>
   protected final val keySerializer: KSerializer<Any>

   protected abstract fun toResult(key: Any, value: Any): Any {
   }

   init {
      this.keySerializer = keySerializer
      this.valueSerializer = valueSerializer
   }

   protected abstract val key: Any

   public override fun serialize(encoder: Encoder, value: Any) {
      val structuredEncoder: CompositeEncoder = encoder.beginStructure(this.getDescriptor())
      structuredEncoder.encodeSerializableElement(this.getDescriptor(), 0, this.keySerializer, this.key)
      structuredEncoder.encodeSerializableElement(this.getDescriptor(), 1, this.valueSerializer, this.value)
      structuredEncoder.endStructure(this.getDescriptor())
   }

   protected abstract val value: Any

   public override fun deserialize(decoder: Decoder): Any {
      val `descriptor$iv`: SerialDescriptor = this.getDescriptor()
      val `composite$iv`: CompositeDecoder = decoder.beginStructure(`descriptor$iv`)
      val `result$iv`: CompositeDecoder = `composite$iv`
      val var10000: Any
      if (`composite$iv`.decodeSequentially()) {
         var10000 = this.toResult(
            (K)CompositeDecoder.DefaultImpls.decodeSerializableElement$default(`composite$iv`, this.getDescriptor(), 0, this.keySerializer, null, 8, null),
            (V)CompositeDecoder.DefaultImpls.decodeSerializableElement$default(`composite$iv`, this.getDescriptor(), 1, this.valueSerializer, null, 8, null)
         )
      } else {
         var key: Any = TuplesKt.access$getNULL$p()
         var value: Any = TuplesKt.access$getNULL$p()

         label43@ while (true) {
            val idx: Int = `result$iv`.decodeElementIndex(this.getDescriptor())
            when (idx) {
               -1 -> {
                  if (key === TuplesKt.access$getNULL$p()) {
                     throw SerializationException("Element 'key' is missing")
                  }

                  if (value === TuplesKt.access$getNULL$p()) {
                     throw SerializationException("Element 'value' is missing")
                  }

                  var10000 = this.toResult((K)key, (V)value)
                  break@label43
               }
               0 -> {
                  key = CompositeDecoder.DefaultImpls.decodeSerializableElement$default(`result$iv`, this.getDescriptor(), 0, this.keySerializer, null, 8, null)
                  continue
               }
               1 -> {
                  value = CompositeDecoder.DefaultImpls.decodeSerializableElement$default(
                     `result$iv`, this.getDescriptor(), 1, this.valueSerializer, null, 8, null
                  )
                  continue
               }
               else -> throw SerializationException("Invalid index: $idx")
            }
         }
      }

      `composite$iv`.endStructure(`descriptor$iv`)
      return (R)var10000
   }
}
