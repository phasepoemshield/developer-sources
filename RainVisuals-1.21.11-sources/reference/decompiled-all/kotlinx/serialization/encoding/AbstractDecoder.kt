package kotlinx.serialization.encoding

import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor

// $VF: Compiled from AbstractDecoder.kt
@ExperimentalSerializationApi
public abstract class AbstractDecoder : Decoder, CompositeDecoder {
   @ExperimentalSerializationApi
   override fun <T> decodeNullableSerializableValue(deserializer: DeserializationStrategy<out T>): T {
      Decoder.DefaultImpls.decodeNullableSerializableValue(this, deserializer)
   }

   public override fun decodeInt(): Int {
      val var10000: Any = this.decodeValue()
      return var10000 as Int
   }

   public open fun decodeValue(): Any {
      throw SerializationException("${this.getClass()::class} can't retrieve untyped values")
   }

   @ExperimentalSerializationApi
   override fun decodeSequentially(): Boolean {
      CompositeDecoder.DefaultImpls.decodeSequentially(this)
   }

   public override fun <T : Any> decodeNullableSerializableElement(
      descriptor: SerialDescriptor,
      index: Int,
      deserializer: DeserializationStrategy<Any?>,
      previousValue: Any?
   ): Any? {
      return (T)(if (!deserializer.descriptor.isNullable && !this.decodeNotNullMark())
         this.decodeNull()
         else
         this.decodeSerializableValue(deserializer, previousValue))
   }

   public override fun decodeEnum(enumDescriptor: SerialDescriptor): Int {
      val var10000: Any = this.decodeValue()
      return var10000 as Int
   }

   public override fun decodeInline(descriptor: SerialDescriptor): Decoder {
      return this
   }

   public override fun decodeCharElement(descriptor: SerialDescriptor, index: Int): Char {
      return this.decodeChar()
   }

   public override fun endStructure(descriptor: SerialDescriptor) {
   }

   public override fun decodeIntElement(descriptor: SerialDescriptor, index: Int): Int {
      return this.decodeInt()
   }

   public override fun decodeChar(): Char {
      val var10000: Any = this.decodeValue()
      return var10000 as Character
   }

   public override fun decodeLongElement(descriptor: SerialDescriptor, index: Int): Long {
      return this.decodeLong()
   }

   public override fun decodeDoubleElement(descriptor: SerialDescriptor, index: Int): Double {
      return this.decodeDouble()
   }

   public override fun decodeNotNullMark(): Boolean {
      return true
   }

   public override fun beginStructure(descriptor: SerialDescriptor): CompositeDecoder {
      return this
   }

   public override fun decodeFloat(): Float {
      val var10000: Any = this.decodeValue()
      return var10000 as java.lang.Float
   }

   override fun decodeCollectionSize(descriptor: SerialDescriptor): Int {
      CompositeDecoder.DefaultImpls.decodeCollectionSize(this, descriptor)
   }

   public override fun <T> decodeSerializableElement(descriptor: SerialDescriptor, index: Int, deserializer: DeserializationStrategy<Any>, previousValue: Any?): Any {
      return (T)this.decodeSerializableValue(deserializer, previousValue)
   }

   public override fun decodeStringElement(descriptor: SerialDescriptor, index: Int): String {
      return this.decodeString()
   }

   public override fun decodeShort(): Short {
      val var10000: Any = this.decodeValue()
      return var10000 as java.lang.Short
   }

   override fun <T> decodeSerializableValue(deserializer: DeserializationStrategy<out T>): T {
      Decoder.DefaultImpls.decodeSerializableValue(this, deserializer)
   }

   public override fun decodeShortElement(descriptor: SerialDescriptor, index: Int): Short {
      return this.decodeShort()
   }

   public override fun decodeLong(): Long {
      val var10000: Any = this.decodeValue()
      return var10000 as java.lang.Long
   }

   public override fun decodeBoolean(): Boolean {
      val var10000: Any = this.decodeValue()
      return var10000 as java.lang.Boolean
   }

   public open fun <T> decodeSerializableValue(deserializer: DeserializationStrategy<Any>, previousValue: Any? = null): Any {
      return (T)this.decodeSerializableValue(deserializer)
   }

   public override fun decodeString(): String {
      val var10000: Any = this.decodeValue()
      return var10000 as java.lang.String
   }

   public override fun decodeByte(): Byte {
      val var10000: Any = this.decodeValue()
      return var10000 as java.lang.Byte
   }

   public override fun decodeBooleanElement(descriptor: SerialDescriptor, index: Int): Boolean {
      return this.decodeBoolean()
   }

   public override fun decodeNull(): Nothing? {
      return null
   }

   public override fun decodeInlineElement(descriptor: SerialDescriptor, index: Int): Decoder {
      return this.decodeInline(descriptor.getElementDescriptor(index))
   }

   public override fun decodeFloatElement(descriptor: SerialDescriptor, index: Int): Float {
      return this.decodeFloat()
   }

   public override fun decodeByteElement(descriptor: SerialDescriptor, index: Int): Byte {
      return this.decodeByte()
   }

   public override fun decodeDouble(): Double {
      val var10000: Any = this.decodeValue()
      return var10000 as java.lang.Double
   }
}
