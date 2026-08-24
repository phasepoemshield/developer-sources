package kotlinx.serialization.encoding

import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.modules.SerializersModule

// $VF: Compiled from Decoding.kt
public interface CompositeDecoder {
   @JvmStatic
   CompositeDecoder.Companion Companion = CompositeDecoder.Companion.$$INSTANCE;

   public abstract fun decodeCharElement(descriptor: SerialDescriptor, index: Int): Char {
   }

   public abstract fun decodeStringElement(descriptor: SerialDescriptor, index: Int): String {
   }

   public open fun decodeCollectionSize(descriptor: SerialDescriptor): Int {
   }

   public abstract fun <T> decodeSerializableElement(
      descriptor: SerialDescriptor,
      index: Int,
      deserializer: DeserializationStrategy<Any>,
      previousValue: Any? = ...
   ): Any {
   }

   @ExperimentalSerializationApi
   public abstract fun <T : Any> decodeNullableSerializableElement(
      descriptor: SerialDescriptor,
      index: Int,
      deserializer: DeserializationStrategy<Any?>,
      previousValue: Any? = ...
   ): Any? {
   }

   public abstract fun decodeElementIndex(descriptor: SerialDescriptor): Int {
   }

   @ExperimentalSerializationApi
   public open fun decodeSequentially(): Boolean {
   }

   public abstract fun decodeBooleanElement(descriptor: SerialDescriptor, index: Int): Boolean {
   }

   public abstract fun decodeShortElement(descriptor: SerialDescriptor, index: Int): Short {
   }

   public abstract fun decodeIntElement(descriptor: SerialDescriptor, index: Int): Int {
   }

   public abstract fun decodeInlineElement(descriptor: SerialDescriptor, index: Int): Decoder {
   }

   public abstract fun decodeByteElement(descriptor: SerialDescriptor, index: Int): Byte {
   }

   public val serializersModule: SerializersModule

   public abstract fun decodeDoubleElement(descriptor: SerialDescriptor, index: Int): Double {
   }

   public abstract fun endStructure(descriptor: SerialDescriptor) {
   }

   public abstract fun decodeFloatElement(descriptor: SerialDescriptor, index: Int): Float {
   }

   public abstract fun decodeLongElement(descriptor: SerialDescriptor, index: Int): Long {
   }

   // $VF: Compiled from Decoding.kt
   public companion object {
      public const val UNKNOWN_NAME: Int = -3
      public const val DECODE_DONE: Int = -1
   }

   // $VF: Class flags could not be determined
   // $VF: Compiled from Decoding.kt
   internal class DefaultImpls {
      @JvmStatic
      fun decodeCollectionSize(`$this`: CompositeDecoder, descriptor: SerialDescriptor): Int {
         -1
      }

      @ExperimentalSerializationApi
      @JvmStatic
      fun decodeSequentially(`$this`: CompositeDecoder): Boolean {
         false
      }
   }
}
