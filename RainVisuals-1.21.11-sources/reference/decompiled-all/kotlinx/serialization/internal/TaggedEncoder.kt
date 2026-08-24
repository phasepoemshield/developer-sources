package kotlinx.serialization.internal

import java.util.ArrayList
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.InternalSerializationApi
import kotlinx.serialization.SerializationException
import kotlinx.serialization.SerializationStrategy
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.SerializersModuleBuildersKt

// $VF: Compiled from Tagged.kt
@InternalSerializationApi
public abstract class TaggedEncoder<Tag> : Encoder, CompositeEncoder {
   private final val tagStack: ArrayList<Any> = ArrayList()

   public override fun encodeBooleanElement(descriptor: SerialDescriptor, index: Int, value: Boolean) {
      this.encodeTaggedBoolean(this.getTag(descriptor, index), value)
   }

   public override fun encodeLongElement(descriptor: SerialDescriptor, index: Int, value: Long) {
      this.encodeTaggedLong(this.getTag(descriptor, index), value)
   }

   public override fun encodeInt(value: Int) {
      this.encodeTaggedInt(this.popTag(), value)
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

   protected open fun endEncode(descriptor: SerialDescriptor) {
   }

   protected open fun encodeTaggedFloat(tag: Any, value: Float) {
      this.encodeTaggedValue((Tag)tag, value)
   }

   public override fun encodeByteElement(descriptor: SerialDescriptor, index: Int, value: Byte) {
      this.encodeTaggedByte(this.getTag(descriptor, index), value)
   }

   protected final val currentTag: Any
      protected final get() {
         return CollectionsKt.last(this.tagStack)
      }


   public override fun encodeChar(value: Char) {
      this.encodeTaggedChar(this.popTag(), value)
   }

   protected abstract fun SerialDescriptor.getTag(index: Int): Any {
   }

   @ExperimentalSerializationApi
   override fun shouldEncodeElementDefault(index: SerialDescriptor, descriptor: Int): Boolean {
      CompositeEncoder.DefaultImpls.shouldEncodeElementDefault(this, descriptor, index)
   }

   public override fun encodeByte(value: Byte) {
      this.encodeTaggedByte(this.popTag(), value)
   }

   public override fun encodeDoubleElement(descriptor: SerialDescriptor, index: Int, value: Double) {
      this.encodeTaggedDouble(this.getTag(descriptor, index), value)
   }

   protected open fun encodeTaggedInt(tag: Any, value: Int) {
      this.encodeTaggedValue((Tag)tag, value)
   }

   public override fun encodeIntElement(descriptor: SerialDescriptor, index: Int, value: Int) {
      this.encodeTaggedInt(this.getTag(descriptor, index), value)
   }

   override fun <T> encodeSerializableValue(serializer: SerializationStrategy<in T>, value: T) {
      Encoder.DefaultImpls.encodeSerializableValue(this, serializer, value)
   }

   protected final val currentTagOrNull: Any?
      protected final get() {
         return CollectionsKt.lastOrNull(this.tagStack)
      }


   protected open fun encodeTaggedBoolean(tag: Any, value: Boolean) {
      this.encodeTaggedValue((Tag)tag, value)
   }

   protected open fun encodeTaggedLong(tag: Any, value: Long) {
      this.encodeTaggedValue((Tag)tag, value)
   }

   protected open fun encodeTaggedNull(tag: Any) {
      throw SerializationException("null is not supported")
   }

   private fun encodeElement(desc: SerialDescriptor, index: Int): Boolean {
      this.pushTag(this.getTag(desc, index))
      return true
   }

   protected open fun encodeTaggedValue(tag: Any, value: Any) {
      throw SerializationException("Non-serializable ${value.getClass()::class} is not supported by ${this.getClass()::class} encoder")
   }

   public override fun encodeString(value: String) {
      this.encodeTaggedString(this.popTag(), value)
   }

   protected open fun encodeTaggedInline(tag: Any, inlineDescriptor: SerialDescriptor): Encoder {
      this.pushTag((Tag)tag)
      return this
   }

   protected open fun encodeTaggedEnum(tag: Any, enumDescriptor: SerialDescriptor, ordinal: Int) {
      this.encodeTaggedValue((Tag)tag, ordinal)
   }

   @ExperimentalSerializationApi
   override fun <T> encodeNullableSerializableValue(serializer: SerializationStrategy<in T>, value: T?) {
      Encoder.DefaultImpls.encodeNullableSerializableValue(this, serializer, value)
   }

   protected open fun encodeTaggedByte(tag: Any, value: Byte) {
      this.encodeTaggedValue((Tag)tag, value)
   }

   protected open fun encodeTaggedChar(tag: Any, value: Char) {
      this.encodeTaggedValue((Tag)tag, value)
   }

   protected open fun encodeTaggedShort(tag: Any, value: Short) {
      this.encodeTaggedValue((Tag)tag, value)
   }

   public override fun encodeShortElement(descriptor: SerialDescriptor, index: Int, value: Short) {
      this.encodeTaggedShort(this.getTag(descriptor, index), value)
   }

   protected fun popTag(): Any {
      if (!this.tagStack.isEmpty()) {
         return this.tagStack.remove(CollectionsKt.getLastIndex(this.tagStack))
      } else {
         throw SerializationException("No tag in stack for requested element")
      }
   }

   public override fun encodeFloat(value: Float) {
      this.encodeTaggedFloat(this.popTag(), value)
   }

   public open val serializersModule: SerializersModule
      public open get() {
         return SerializersModuleBuildersKt.EmptySerializersModule()
      }


   protected open fun encodeTaggedNonNullMark(tag: Any) {
   }

   public override fun encodeInlineElement(descriptor: SerialDescriptor, index: Int): Encoder {
      return this.encodeTaggedInline(this.getTag(descriptor, index), descriptor.getElementDescriptor(index))
   }

   protected open fun encodeTaggedDouble(tag: Any, value: Double) {
      this.encodeTaggedValue((Tag)tag, value)
   }

   public override fun encodeInline(descriptor: SerialDescriptor): Encoder {
      return this.encodeTaggedInline(this.popTag(), descriptor)
   }

   public override fun encodeNull() {
      this.encodeTaggedNull(this.popTag())
   }

   protected open fun encodeTaggedString(tag: Any, value: String) {
      this.encodeTaggedValue((Tag)tag, value)
   }

   protected fun pushTag(name: Any) {
      this.tagStack.add((Tag)name)
   }

   public override fun encodeShort(value: Short) {
      this.encodeTaggedShort(this.popTag(), value)
   }

   public override fun <T> encodeSerializableElement(descriptor: SerialDescriptor, index: Int, serializer: SerializationStrategy<Any>, value: Any) {
      if (this.encodeElement(descriptor, index)) {
         this.encodeSerializableValue(serializer, value)
      }
   }

   public override fun encodeDouble(value: Double) {
      this.encodeTaggedDouble(this.popTag(), value)
   }

   public override fun encodeLong(value: Long) {
      this.encodeTaggedLong(this.popTag(), value)
   }

   override fun beginCollection(collectionSize: SerialDescriptor, descriptor: Int): CompositeEncoder {
      Encoder.DefaultImpls.beginCollection(this, descriptor, collectionSize)
   }

   public override fun beginStructure(descriptor: SerialDescriptor): CompositeEncoder {
      return this
   }

   public override fun encodeFloatElement(descriptor: SerialDescriptor, index: Int, value: Float) {
      this.encodeTaggedFloat(this.getTag(descriptor, index), value)
   }

   public override fun encodeStringElement(descriptor: SerialDescriptor, index: Int, value: String) {
      this.encodeTaggedString(this.getTag(descriptor, index), value)
   }

   public override fun encodeCharElement(descriptor: SerialDescriptor, index: Int, value: Char) {
      this.encodeTaggedChar(this.getTag(descriptor, index), value)
   }

   public override fun encodeEnum(enumDescriptor: SerialDescriptor, index: Int) {
      this.encodeTaggedEnum(this.popTag(), enumDescriptor, index)
   }

   public override fun endStructure(descriptor: SerialDescriptor) {
      if (!this.tagStack.isEmpty()) {
         this.popTag()
      }

      this.endEncode(descriptor)
   }

   public override fun encodeNotNullMark() {
      this.encodeTaggedNonNullMark(this.currentTag)
   }

   public override fun encodeBoolean(value: Boolean) {
      this.encodeTaggedBoolean(this.popTag(), value)
   }
}
