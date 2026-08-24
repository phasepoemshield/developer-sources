package kotlinx.serialization.encoding

import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.modules.SerializersModule

// $VF: Compiled from Decoding.kt
public interface Decoder {
   public abstract fun decodeEnum(enumDescriptor: SerialDescriptor): Int {
   }

   @ExperimentalSerializationApi
   public abstract fun decodeNotNullMark(): Boolean {
   }

   public abstract fun decodeByte(): Byte {
   }

   public abstract fun decodeFloat(): Float {
   }

   public abstract fun decodeShort(): Short {
   }

   @ExperimentalSerializationApi
   public abstract fun decodeNull(): Nothing? {
   }

   public abstract fun beginStructure(descriptor: SerialDescriptor): CompositeDecoder {
   }

   public abstract fun decodeDouble(): Double {
   }

   @ExperimentalSerializationApi
   public open fun <T : Any> decodeNullableSerializableValue(deserializer: DeserializationStrategy<Any?>): Any? {
   }

   public open fun <T> decodeSerializableValue(deserializer: DeserializationStrategy<Any>): Any {
   }

   public abstract fun decodeInt(): Int {
   }

   public val serializersModule: SerializersModule

   public abstract fun decodeLong(): Long {
   }

   public abstract fun decodeInline(descriptor: SerialDescriptor): Decoder {
   }

   public abstract fun decodeString(): String {
   }

   public abstract fun decodeBoolean(): Boolean {
   }

   public abstract fun decodeChar(): Char {
   }

   // $VF: Class flags could not be determined
   // $VF: Compiled from Decoding.kt
   internal class DefaultImpls {
      @JvmStatic
      fun <T> decodeSerializableValue(`$this`: Decoder, deserializer: DeserializationStrategy<out T>): T {
         deserializer.deserialize(`$this`)
      }

      @ExperimentalSerializationApi
      @JvmStatic
      fun <T> decodeNullableSerializableValue(deserializer: Decoder, `$this`: DeserializationStrategy<out T>): T {
         if (!deserializer.descriptor.isNullable && !`$this`.decodeNotNullMark()) `$this`.decodeNull() else `$this`.decodeSerializableValue(deserializer)
      }
   }
}
