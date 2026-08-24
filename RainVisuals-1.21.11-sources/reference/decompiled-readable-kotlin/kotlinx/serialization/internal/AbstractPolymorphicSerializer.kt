package kotlinx.serialization.internal

import kotlin.jvm.internal.Ref
import kotlin.reflect.KClass
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.InternalSerializationApi
import kotlinx.serialization.KSerializer
import kotlinx.serialization.PolymorphicSerializerKt
import kotlinx.serialization.SerializationException
import kotlinx.serialization.SerializationStrategy
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeDecoder
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

// $VF: Compiled from AbstractPolymorphicSerializer.kt
@InternalSerializationApi
public abstract class AbstractPolymorphicSerializer<T> : KSerializer<T> {
   public override fun deserialize(decoder: Decoder): Any {
      val `descriptor$iv`: SerialDescriptor = this.getDescriptor()
      val `composite$iv`: CompositeDecoder = decoder.beginStructure(`descriptor$iv`)
      val `result$iv`: CompositeDecoder = `composite$iv`
      val klassName: Ref.ObjectRef = Ref.ObjectRef()
      var value: Any = null
      var var18: Any
      if (`composite$iv`.decodeSequentially()) {
         var18 = access$decodeSequentially(this, `composite$iv`)
      } else {
         label40@ while (true) {
            val index: Int = `result$iv`.decodeElementIndex(this.getDescriptor())
            when (index) {
               -1 -> {
                  var18 = value
                  if (value == null) {
                     throw IllegalArgumentException(("Polymorphic value has not been read for class ${klassName.element as java.lang.String}").toString())
                  }

                  break@label40
               }
               0 -> {
                  klassName.element = (T)`result$iv`.decodeStringElement(this.getDescriptor(), index)
                  continue
               }
               1 -> {
                  if (klassName.element == null) {
                     throw IllegalArgumentException("Cannot read polymorphic value before its type token".toString())
                  }

                  klassName.element = klassName.element
                  value = CompositeDecoder.DefaultImpls.decodeSerializableElement$default(
                     `result$iv`,
                     this.getDescriptor(),
                     index,
                     PolymorphicSerializerKt.findPolymorphicSerializer(this, `result$iv`, klassName.element as java.lang.String),
                     null,
                     8,
                     null
                  )
                  continue
               }
               else -> {
                  var18 = SerializationException
                  val var10002: StringBuilder = StringBuilder().append("Invalid index in polymorphic deserialization of ")
                  var var10003: java.lang.String = klassName.element as java.lang.String
                  if (klassName.element as java.lang.String == null) {
                     var10003 = "unknown class"
                  }

                  var18./* $VF: Unable to resugar constructor */<init>(
                     var10002.append(var10003).append("\n Expected 0, 1 or DECODE_DONE(-1), but found ").append(index).toString()
                  )
                  throw var18
               }
            }
         }
      }

      `composite$iv`.endStructure(`descriptor$iv`)
      return (T)var18
   }

   @InternalSerializationApi
   public open fun findPolymorphicSerializerOrNull(encoder: Encoder, value: Any): SerializationStrategy<Any>? {
      return encoder.serializersModule.getPolymorphic(this.baseClass, (T)value)
   }

   public override fun serialize(encoder: Encoder, value: Any) {
      val actualSerializer: SerializationStrategy = PolymorphicSerializerKt.findPolymorphicSerializer(this, encoder, (T)value)
      val `descriptor$iv`: SerialDescriptor = this.getDescriptor()
      val `composite$iv`: CompositeEncoder = encoder.beginStructure(`descriptor$iv`)
      `composite$iv`.encodeStringElement(this.getDescriptor(), 0, actualSerializer.descriptor.serialName)
      val var10001: SerialDescriptor = this.getDescriptor()
      `composite$iv`.encodeSerializableElement(var10001, 1, actualSerializer, value)
      `composite$iv`.endStructure(`descriptor$iv`)
   }

   public abstract val baseClass: KClass<Any>

   @InternalSerializationApi
   public open fun findPolymorphicSerializerOrNull(decoder: CompositeDecoder, klassName: String?): DeserializationStrategy<Any>? {
      return decoder.serializersModule.getPolymorphic(this.baseClass, klassName)
   }

   private fun decodeSequentially(compositeDecoder: CompositeDecoder): Any {
      return (T)CompositeDecoder.DefaultImpls.decodeSerializableElement$default(
         compositeDecoder,
         this.getDescriptor(),
         1,
         PolymorphicSerializerKt.findPolymorphicSerializer(this, compositeDecoder, compositeDecoder.decodeStringElement(this.getDescriptor(), 0)),
         null,
         8,
         null
      )
   }
}
