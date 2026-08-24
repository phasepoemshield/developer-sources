package kotlinx.serialization.internal

import java.util.ArrayList
import kotlin.jvm.functions.Function0
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.InternalSerializationApi
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeDecoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.SerializersModuleBuildersKt

// $VF: Compiled from Tagged.kt
@InternalSerializationApi
public abstract class TaggedDecoder<Tag> : CompositeDecoder, Decoder {
   private final val tagStack: ArrayList<Any> = ArrayList()
   private final var flag: Boolean

   protected open fun decodeTaggedByte(tag: Any): Byte {
      val var10000: Any = this.decodeTaggedValue((Tag)tag)
      return var10000 as java.lang.Byte
   }

   public override fun decodeInlineElement(descriptor: SerialDescriptor, index: Int): Decoder {
      return this.decodeTaggedInline(this.getTag(descriptor, index), descriptor.getElementDescriptor(index))
   }

   public override fun decodeNull(): Nothing? {
      return null
   }

   override fun <T> decodeSerializableValue(deserializer: DeserializationStrategy<out T>): T {
      Decoder.DefaultImpls.decodeSerializableValue(this, deserializer)
   }

   public override fun decodeShortElement(descriptor: SerialDescriptor, index: Int): Short {
      return this.decodeTaggedShort(this.getTag(descriptor, index))
   }

   protected open fun decodeTaggedBoolean(tag: Any): Boolean {
      val var10000: Any = this.decodeTaggedValue((Tag)tag)
      return var10000 as java.lang.Boolean
   }

   public override fun decodeInt(): Int {
      return this.decodeTaggedInt(this.popTag())
   }

   protected open fun decodeTaggedNull(tag: Any): Nothing? {
      return null
   }

   public override fun <T : Any> decodeNullableSerializableElement(
      descriptor: SerialDescriptor,
      index: Int,
      deserializer: DeserializationStrategy<Any?>,
      previousValue: Any?
   ): Any? {
      return (T)this.tagBlock(
         this.getTag(descriptor, index),
               // $VF: Compiled from Tagged.kt
   {
            val `$this$decodeIfNullable$iv`: Decoder = TaggedDecoder.this
            val var3: TaggedDecoder = TaggedDecoder.this
            val var4: DeserializationStrategy = deserializer
            val var5: Any = previousValue
            return (T)(if (!deserializer.descriptor.isNullable && !`$this$decodeIfNullable$iv`.decodeNotNullMark())
               `$this$decodeIfNullable$iv`.decodeNull()
               else
               var3.decodeSerializableValue(var4, (T)var5))
         } as Function0
      )
   }

   private fun <E> tagBlock(tag: Any, block: () -> Any): Any {
      this.pushTag((Tag)tag)
      val r: Any = block()
      if (!this.flag) {
         this.popTag()
      }

      this.flag = false
      return (E)r
   }

   protected open fun <T> decodeSerializableValue(deserializer: DeserializationStrategy<Any>, previousValue: Any?): Any {
      return (T)this.decodeSerializableValue(deserializer)
   }

   public override fun decodeDoubleElement(descriptor: SerialDescriptor, index: Int): Double {
      return this.decodeTaggedDouble(this.getTag(descriptor, index))
   }

   protected open fun decodeTaggedEnum(tag: Any, enumDescriptor: SerialDescriptor): Int {
      val var10000: Any = this.decodeTaggedValue((Tag)tag)
      return var10000 as Int
   }

   public override fun decodeFloatElement(descriptor: SerialDescriptor, index: Int): Float {
      return this.decodeTaggedFloat(this.getTag(descriptor, index))
   }

   public override fun decodeBoolean(): Boolean {
      return this.decodeTaggedBoolean(this.popTag())
   }

   protected open fun decodeTaggedDouble(tag: Any): Double {
      val var10000: Any = this.decodeTaggedValue((Tag)tag)
      return var10000 as java.lang.Double
   }

   public override fun beginStructure(descriptor: SerialDescriptor): CompositeDecoder {
      return this
   }

   protected open fun decodeTaggedNotNullMark(tag: Any): Boolean {
      return true
   }

   @ExperimentalSerializationApi
   override fun <T> decodeNullableSerializableValue(deserializer: DeserializationStrategy<out T>): T {
      Decoder.DefaultImpls.decodeNullableSerializableValue(this, deserializer)
   }

   override fun decodeCollectionSize(descriptor: SerialDescriptor): Int {
      CompositeDecoder.DefaultImpls.decodeCollectionSize(this, descriptor)
   }

   protected fun copyTagsTo(other: TaggedDecoder<Any>) {
      other.tagStack.addAll(this.tagStack)
   }

   public override fun decodeDouble(): Double {
      return this.decodeTaggedDouble(this.popTag())
   }

   protected open fun decodeTaggedString(tag: Any): String {
      val var10000: Any = this.decodeTaggedValue((Tag)tag)
      return var10000 as java.lang.String
   }

   public override fun decodeBooleanElement(descriptor: SerialDescriptor, index: Int): Boolean {
      return this.decodeTaggedBoolean(this.getTag(descriptor, index))
   }

   public override fun decodeInline(descriptor: SerialDescriptor): Decoder {
      return this.decodeTaggedInline(this.popTag(), descriptor)
   }

   public override fun decodeIntElement(descriptor: SerialDescriptor, index: Int): Int {
      return this.decodeTaggedInt(this.getTag(descriptor, index))
   }

   public override fun decodeCharElement(descriptor: SerialDescriptor, index: Int): Char {
      return this.decodeTaggedChar(this.getTag(descriptor, index))
   }

   public open val serializersModule: SerializersModule
      public open get() {
         return SerializersModuleBuildersKt.EmptySerializersModule()
      }


   public override fun endStructure(descriptor: SerialDescriptor) {
   }

   protected fun pushTag(name: Any) {
      this.tagStack.add((Tag)name)
   }

   public override fun <T> decodeSerializableElement(descriptor: SerialDescriptor, index: Int, deserializer: DeserializationStrategy<Any>, previousValue: Any?): Any {
      return (T)this.tagBlock(this.getTag(descriptor, index),       // $VF: Compiled from Tagged.kt
{
         return TaggedDecoder.this.decodeSerializableValue(deserializer, (T)previousValue)
      } as Function0)
   }

   protected open fun decodeTaggedInline(tag: Any, inlineDescriptor: SerialDescriptor): Decoder {
      this.pushTag((Tag)tag)
      return this
   }

   protected final val currentTag: Any
      protected final get() {
         return CollectionsKt.last(this.tagStack)
      }


   protected open fun decodeTaggedFloat(tag: Any): Float {
      val var10000: Any = this.decodeTaggedValue((Tag)tag)
      return var10000 as java.lang.Float
   }

   protected open fun decodeTaggedLong(tag: Any): Long {
      val var10000: Any = this.decodeTaggedValue((Tag)tag)
      return var10000 as java.lang.Long
   }

   public override fun decodeFloat(): Float {
      return this.decodeTaggedFloat(this.popTag())
   }

   protected fun popTag(): Any {
      val r: Any = this.tagStack.remove(CollectionsKt.getLastIndex(this.tagStack))
      this.flag = true
      return (Tag)r
   }

   public override fun decodeByteElement(descriptor: SerialDescriptor, index: Int): Byte {
      return this.decodeTaggedByte(this.getTag(descriptor, index))
   }

   protected open fun decodeTaggedChar(tag: Any): Char {
      val var10000: Any = this.decodeTaggedValue((Tag)tag)
      return var10000 as Character
   }

   protected open fun decodeTaggedShort(tag: Any): Short {
      val var10000: Any = this.decodeTaggedValue((Tag)tag)
      return var10000 as java.lang.Short
   }

   public override fun decodeNotNullMark(): Boolean {
      val var10000: Any = this.currentTagOrNull
      return var10000 != null && this.decodeTaggedNotNullMark(var10000)
   }

   public override fun decodeStringElement(descriptor: SerialDescriptor, index: Int): String {
      return this.decodeTaggedString(this.getTag(descriptor, index))
   }

   public override fun decodeString(): String {
      return this.decodeTaggedString(this.popTag())
   }

   public override fun decodeChar(): Char {
      return this.decodeTaggedChar(this.popTag())
   }

   protected abstract fun SerialDescriptor.getTag(index: Int): Any {
   }

   public override fun decodeByte(): Byte {
      return this.decodeTaggedByte(this.popTag())
   }

   protected open fun decodeTaggedInt(tag: Any): Int {
      val var10000: Any = this.decodeTaggedValue((Tag)tag)
      return var10000 as Int
   }

   protected final val currentTagOrNull: Any?
      protected final get() {
         return CollectionsKt.lastOrNull(this.tagStack)
      }


   @ExperimentalSerializationApi
   override fun decodeSequentially(): Boolean {
      CompositeDecoder.DefaultImpls.decodeSequentially(this)
   }

   public override fun decodeLongElement(descriptor: SerialDescriptor, index: Int): Long {
      return this.decodeTaggedLong(this.getTag(descriptor, index))
   }

   public override fun decodeLong(): Long {
      return this.decodeTaggedLong(this.popTag())
   }

   public override fun decodeShort(): Short {
      return this.decodeTaggedShort(this.popTag())
   }

   public override fun decodeEnum(enumDescriptor: SerialDescriptor): Int {
      return this.decodeTaggedEnum(this.popTag(), enumDescriptor)
   }

   protected open fun decodeTaggedValue(tag: Any): Any {
      throw SerializationException("${this.getClass()::class} can't retrieve untyped values")
   }
}
