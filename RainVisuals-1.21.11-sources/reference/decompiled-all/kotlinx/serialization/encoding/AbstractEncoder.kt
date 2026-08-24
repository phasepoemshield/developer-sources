package kotlinx.serialization.encoding

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerializationException
import kotlinx.serialization.SerializationStrategy
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.internal.NoOpEncoder

// $VF: Compiled from AbstractEncoder.kt
@ExperimentalSerializationApi
public abstract class AbstractEncoder : Encoder, CompositeEncoder {
   public override fun encodeFloat(value: Float) {
      this.encodeValue(value)
   }

   override fun <T> encodeSerializableValue(serializer: SerializationStrategy<in T>, value: T) {
      Encoder.DefaultImpls.encodeSerializableValue(this, serializer, value)
   }

   public override fun <T> encodeSerializableElement(descriptor: SerialDescriptor, index: Int, serializer: SerializationStrategy<Any>, value: Any) {
      if (this.encodeElement(descriptor, index)) {
         this.encodeSerializableValue(serializer, value)
      }
   }

   public override fun encodeBooleanElement(descriptor: SerialDescriptor, index: Int, value: Boolean) {
      if (this.encodeElement(descriptor, index)) {
         this.encodeBoolean(value)
      }
   }

   public override fun <T : Any> encodeNullableSerializableElement(
      descriptor: SerialDescriptor,
      index: Int,
      serializer: SerializationStrategy<Any>,
      value: Any?
   ) {
      if (this.encodeElement(descriptor, index)) {
         this.encodeNullableSerializableValue(serializer, value)
      }
   }

   public override fun encodeInline(descriptor: SerialDescriptor): Encoder {
      return this
   }

   public override fun encodeEnum(enumDescriptor: SerialDescriptor, index: Int) {
      this.encodeValue(index)
   }

   public override fun encodeByteElement(descriptor: SerialDescriptor, index: Int, value: Byte) {
      if (this.encodeElement(descriptor, index)) {
         this.encodeByte(value)
      }
   }

   public override fun encodeNull() {
      throw SerializationException("'null' is not supported by default")
   }

   public open fun encodeValue(value: Any) {
      throw SerializationException("Non-serializable ${value.getClass()::class} is not supported by ${this.getClass()::class} encoder")
   }

   public override fun encodeLong(value: Long) {
      this.encodeValue(value)
   }

   public override fun encodeBoolean(value: Boolean) {
      this.encodeValue(value)
   }

   public override fun encodeIntElement(descriptor: SerialDescriptor, index: Int, value: Int) {
      if (this.encodeElement(descriptor, index)) {
         this.encodeInt(value)
      }
   }

   public override fun encodeStringElement(descriptor: SerialDescriptor, index: Int, value: String) {
      if (this.encodeElement(descriptor, index)) {
         this.encodeString(value)
      }
   }

   public override fun encodeDoubleElement(descriptor: SerialDescriptor, index: Int, value: Double) {
      if (this.encodeElement(descriptor, index)) {
         this.encodeDouble(value)
      }
   }

   public open fun encodeElement(descriptor: SerialDescriptor, index: Int): Boolean {
      return true
   }

   override fun beginCollection(descriptor: SerialDescriptor, collectionSize: Int): CompositeEncoder {
      Encoder.DefaultImpls.beginCollection(this, descriptor, collectionSize)
   }

   @ExperimentalSerializationApi
   override fun <T> encodeNullableSerializableValue(serializer: SerializationStrategy<in T>, value: T?) {
      Encoder.DefaultImpls.encodeNullableSerializableValue(this, serializer, value)
   }

   public override fun encodeShortElement(descriptor: SerialDescriptor, index: Int, value: Short) {
      if (this.encodeElement(descriptor, index)) {
         this.encodeShort(value)
      }
   }

   @ExperimentalSerializationApi
   override fun encodeNotNullMark() {
      Encoder.DefaultImpls.encodeNotNullMark(this)
   }

   public override fun encodeDouble(value: Double) {
      this.encodeValue(value)
   }

   public override fun encodeByte(value: Byte) {
      this.encodeValue(value)
   }

   public override fun encodeLongElement(descriptor: SerialDescriptor, index: Int, value: Long) {
      if (this.encodeElement(descriptor, index)) {
         this.encodeLong(value)
      }
   }

   public override fun beginStructure(descriptor: SerialDescriptor): CompositeEncoder {
      return this
   }

   public override fun encodeShort(value: Short) {
      this.encodeValue(value)
   }

   public override fun encodeInlineElement(descriptor: SerialDescriptor, index: Int): Encoder {
      return if (this.encodeElement(descriptor, index)) this.encodeInline(descriptor.getElementDescriptor(index)) else NoOpEncoder.INSTANCE
   }

   @ExperimentalSerializationApi
   override fun shouldEncodeElementDefault(descriptor: SerialDescriptor, index: Int): Boolean {
      CompositeEncoder.DefaultImpls.shouldEncodeElementDefault(this, descriptor, index)
   }

   public override fun encodeCharElement(descriptor: SerialDescriptor, index: Int, value: Char) {
      if (this.encodeElement(descriptor, index)) {
         this.encodeChar(value)
      }
   }

   public override fun encodeChar(value: Char) {
      this.encodeValue(value)
   }

   public override fun endStructure(descriptor: SerialDescriptor) {
   }

   public override fun encodeFloatElement(descriptor: SerialDescriptor, index: Int, value: Float) {
      if (this.encodeElement(descriptor, index)) {
         this.encodeFloat(value)
      }
   }

   public override fun encodeString(value: String) {
      this.encodeValue(value)
   }

   public override fun encodeInt(value: Int) {
      this.encodeValue(value)
   }
}
