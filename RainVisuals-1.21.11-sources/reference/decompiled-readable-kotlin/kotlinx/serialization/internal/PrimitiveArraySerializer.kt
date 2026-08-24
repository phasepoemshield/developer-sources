package kotlinx.serialization.internal

import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeDecoder
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

// $VF: Compiled from CollectionSerializers.kt
@PublishedApi
internal abstract class PrimitiveArraySerializer<Element, Array, Builder extends PrimitiveArrayBuilder<Array>>
   : CollectionLikeSerializer<Element, Array, Builder> {
   public final val descriptor: SerialDescriptor

   open fun PrimitiveArraySerializer(primitiveSerializer: KSerializer<Element>) {
      super(primitiveSerializer, null)
      this.descriptor = PrimitiveArrayDescriptor(primitiveSerializer.descriptor)
   }

   public override fun serialize(encoder: Encoder, value: Any) {
      val size: Int = this.collectionSize((Array)value)
      val `descriptor$iv`: SerialDescriptor = this.descriptor
      val `composite$iv`: CompositeEncoder = encoder.beginCollection(this.descriptor, size)
      this.writeContent(`composite$iv`, (Array)value, size)
      `composite$iv`.endStructure(`descriptor$iv`)
   }

   protected fun Any.insert(index: Int, element: Any) {
      throw IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead".toString())
   }

   protected abstract fun readElement(decoder: CompositeDecoder, index: Int, builder: Any, checkIndex: Boolean) {
   }

   protected fun Any.checkCapacity(size: Int) {
      `$this$checkCapacity`.ensureCapacity$kotlinx_serialization_core(size)
   }

   protected fun Any.builderSize(): Int {
      return `$this$builderSize`.position
   }

   public override fun deserialize(decoder: Decoder): Any {
      return this.merge(decoder, null)
   }

   protected override fun Any.collectionIterator(): Iterator<Any> {
      throw IllegalStateException("This method lead to boxing and must not be used, use writeContents instead".toString())
   }

   protected fun Any.toResult(): Any {
      return (Array)`$this$toResult`.build$kotlinx_serialization_core()
   }

   protected abstract fun empty(): Any {
   }

   protected fun builder(): Any {
      return this.toBuilder(this.empty())
   }

   protected abstract fun writeContent(encoder: CompositeEncoder, content: Any, size: Int) {
   }
}
