package kotlinx.serialization.encoding

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerializationStrategy
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.modules.SerializersModule

// $VF: Compiled from Encoding.kt
public interface Encoder {
   public abstract fun beginStructure(descriptor: SerialDescriptor): CompositeEncoder {
   }

   @ExperimentalSerializationApi
   public abstract fun encodeNull() {
   }

   public abstract fun encodeEnum(enumDescriptor: SerialDescriptor, index: Int) {
   }

   @ExperimentalSerializationApi
   public open fun <T : Any> encodeNullableSerializableValue(serializer: SerializationStrategy<Any>, value: Any?) {
   }

   public abstract fun encodeByte(value: Byte) {
   }

   public abstract fun encodeShort(value: Short) {
   }

   public abstract fun encodeLong(value: Long) {
   }

   public open fun <T> encodeSerializableValue(serializer: SerializationStrategy<Any>, value: Any) {
   }

   public abstract fun encodeFloat(value: Float) {
   }

   public abstract fun encodeString(value: String) {
   }

   public abstract fun encodeBoolean(value: Boolean) {
   }

   public abstract fun encodeChar(value: Char) {
   }

   @ExperimentalSerializationApi
   public open fun encodeNotNullMark() {
   }

   public abstract fun encodeInline(descriptor: SerialDescriptor): Encoder {
   }

   public abstract fun encodeDouble(value: Double) {
   }

   public abstract fun encodeInt(value: Int) {
   }

   public val serializersModule: SerializersModule

   public open fun beginCollection(descriptor: SerialDescriptor, collectionSize: Int): CompositeEncoder {
   }

   // $VF: Class flags could not be determined
   // $VF: Compiled from Encoding.kt
   internal class DefaultImpls {
      @JvmStatic
      fun beginCollection(`$this`: Encoder, descriptor: SerialDescriptor, collectionSize: Int): CompositeEncoder {
         `$this`.beginStructure(descriptor)
      }

      @ExperimentalSerializationApi
      @JvmStatic
      fun encodeNotNullMark(`$this`: Encoder) {
      }

      @ExperimentalSerializationApi
      @JvmStatic
      fun <T> encodeNullableSerializableValue(`$this`: Encoder, value: SerializationStrategy<in T>, serializer: T?) {
         if (serializer.descriptor.isNullable) {
            `$this`.encodeSerializableValue(serializer, value)
         } else {
            if (value == null) {
               `$this`.encodeNull()
            } else {
               `$this`.encodeNotNullMark()
               `$this`.encodeSerializableValue(serializer, value)
            }
         }
      }

      @JvmStatic
      fun <T> encodeSerializableValue(`$this`: Encoder, value: SerializationStrategy<in T>, serializer: T) {
         serializer.serialize(`$this`, value)
      }
   }
}
