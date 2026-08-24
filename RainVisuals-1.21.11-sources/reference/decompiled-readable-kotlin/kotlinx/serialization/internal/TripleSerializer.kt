package kotlinx.serialization.internal

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptorsKt
import kotlinx.serialization.encoding.CompositeDecoder
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

// $VF: Compiled from Tuples.kt
@PublishedApi
internal class TripleSerializer<A, B, C>(aSerializer: KSerializer<Any>, bSerializer: KSerializer<Any>, cSerializer: KSerializer<Any>) :
   KSerializer<Triple<? extends A, ? extends B, ? extends C>> {
   private final val bSerializer: KSerializer<Any>
   private final val cSerializer: KSerializer<Any>
   public open val descriptor: SerialDescriptor
   private final val aSerializer: KSerializer<Any>

   public open fun deserialize(decoder: Decoder): Triple<Any, Any, Any> {
      val composite: CompositeDecoder = decoder.beginStructure(this.descriptor)
      return if (composite.decodeSequentially()) this.decodeSequentially(composite) else this.decodeStructure(composite)
   }

   public open fun serialize(encoder: Encoder, value: Triple<Any, Any, Any>) {
      val structuredEncoder: CompositeEncoder = encoder.beginStructure(this.descriptor)
      structuredEncoder.encodeSerializableElement(this.descriptor, 0, this.aSerializer, (A)value.first)
      structuredEncoder.encodeSerializableElement(this.descriptor, 1, this.bSerializer, (B)value.second)
      structuredEncoder.encodeSerializableElement(this.descriptor, 2, this.cSerializer, (C)value.third)
      structuredEncoder.endStructure(this.descriptor)
   }

   private fun decodeSequentially(composite: CompositeDecoder): Triple<Any, Any, Any> {
      val a: Any = CompositeDecoder.DefaultImpls.decodeSerializableElement$default(composite, this.descriptor, 0, this.aSerializer, null, 8, null)
      val b: Any = CompositeDecoder.DefaultImpls.decodeSerializableElement$default(composite, this.descriptor, 1, this.bSerializer, null, 8, null)
      val c: Any = CompositeDecoder.DefaultImpls.decodeSerializableElement$default(composite, this.descriptor, 2, this.cSerializer, null, 8, null)
      composite.endStructure(this.descriptor)
      return Triple<>((A)a, (B)b, (C)c)
   }

   init {
      this.aSerializer = aSerializer
      this.bSerializer = bSerializer
      this.cSerializer = cSerializer
      this.descriptor = SerialDescriptorsKt.buildClassSerialDescriptor(
         "kotlin.Triple",
         arrayOfNulls(0),
               // $VF: Compiled from Tuples.kt
   {
            ClassSerialDescriptorBuilder.element$default(
               `$this$buildClassSerialDescriptor`, "first", TripleSerializer.this.aSerializer.descriptor, null, false, 12, null
            )
            ClassSerialDescriptorBuilder.element$default(
               `$this$buildClassSerialDescriptor`, "second", TripleSerializer.this.bSerializer.descriptor, null, false, 12, null
            )
            ClassSerialDescriptorBuilder.element$default(
               `$this$buildClassSerialDescriptor`, "third", TripleSerializer.this.cSerializer.descriptor, null, false, 12, null
            )
         } as (ClassSerialDescriptorBuilder?) -> Unit
      )
   }

   private fun decodeStructure(composite: CompositeDecoder): Triple<Any, Any, Any> {
      var a: Any = TuplesKt.access$getNULL$p()
      var b: Any = TuplesKt.access$getNULL$p()
      var c: Any = TuplesKt.access$getNULL$p()

      while (true) {
         val index: Int = composite.decodeElementIndex(this.descriptor)
         when (index) {
            -1 -> {
               composite.endStructure(this.descriptor)
               if (a === TuplesKt.access$getNULL$p()) {
                  throw SerializationException("Element 'first' is missing")
               }

               if (b === TuplesKt.access$getNULL$p()) {
                  throw SerializationException("Element 'second' is missing")
               }

               if (c === TuplesKt.access$getNULL$p()) {
                  throw SerializationException("Element 'third' is missing")
               }

               return Triple<>((A)a, (B)b, (C)c)
            }
            0 -> {
               a = CompositeDecoder.DefaultImpls.decodeSerializableElement$default(composite, this.descriptor, 0, this.aSerializer, null, 8, null)
               continue
            }
            1 -> {
               b = CompositeDecoder.DefaultImpls.decodeSerializableElement$default(composite, this.descriptor, 1, this.bSerializer, null, 8, null)
               continue
            }
            2 -> {
               c = CompositeDecoder.DefaultImpls.decodeSerializableElement$default(composite, this.descriptor, 2, this.cSerializer, null, 8, null)
               continue
            }
            else -> throw SerializationException("Unexpected index $index")
         }
      }
   }
}
