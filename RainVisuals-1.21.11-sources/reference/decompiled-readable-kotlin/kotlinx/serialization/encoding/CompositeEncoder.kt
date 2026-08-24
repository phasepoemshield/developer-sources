package kotlinx.serialization.encoding

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerializationStrategy
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.modules.SerializersModule

// $VF: Compiled from Encoding.kt
public interface CompositeEncoder {
   public abstract fun encodeStringElement(descriptor: SerialDescriptor, index: Int, value: String) {
   }

   @ExperimentalSerializationApi
   public open fun shouldEncodeElementDefault(descriptor: SerialDescriptor, index: Int): Boolean {
   }

   public abstract fun encodeShortElement(descriptor: SerialDescriptor, index: Int, value: Short) {
   }

   public abstract fun <T> encodeSerializableElement(descriptor: SerialDescriptor, index: Int, serializer: SerializationStrategy<Any>, value: Any) {
   }

   public abstract fun endStructure(descriptor: SerialDescriptor) {
   }

   public abstract fun encodeByteElement(descriptor: SerialDescriptor, index: Int, value: Byte) {
   }

   public val serializersModule: SerializersModule

   public abstract fun encodeFloatElement(descriptor: SerialDescriptor, index: Int, value: Float) {
   }

   public abstract fun encodeLongElement(descriptor: SerialDescriptor, index: Int, value: Long) {
   }

   @ExperimentalSerializationApi
   public abstract fun <T : Any> encodeNullableSerializableElement(
      descriptor: SerialDescriptor,
      index: Int,
      serializer: SerializationStrategy<Any>,
      value: Any?
   ) {
   }

   public abstract fun encodeCharElement(descriptor: SerialDescriptor, index: Int, value: Char) {
   }

   public abstract fun encodeDoubleElement(descriptor: SerialDescriptor, index: Int, value: Double) {
   }

   public abstract fun encodeInlineElement(descriptor: SerialDescriptor, index: Int): Encoder {
   }

   public abstract fun encodeBooleanElement(descriptor: SerialDescriptor, index: Int, value: Boolean) {
   }

   public abstract fun encodeIntElement(descriptor: SerialDescriptor, index: Int, value: Int) {
   }

   // $VF: Class flags could not be determined
   // $VF: Compiled from Encoding.kt
   internal class DefaultImpls {
      @ExperimentalSerializationApi
      @JvmStatic
      fun shouldEncodeElementDefault(index: CompositeEncoder, `$this`: SerialDescriptor, descriptor: Int): Boolean {
         true
      }
   }
}
