package kotlinx.serialization.internal

import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeDecoder
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Encoder

// $VF: Compiled from CollectionSerializers.kt
@PublishedApi
internal sealed class CollectionLikeSerializer<Element, Collection, Builder> protected constructor(elementSerializer: KSerializer<Any>) : AbstractCollectionSerializer() {
   private final val elementSerializer: KSerializer<Any>

   public override fun serialize(encoder: Encoder, value: Any) {
      val size: Int = this.collectionSize((Collection)value)
      val `descriptor$iv`: SerialDescriptor = this.descriptor
      val `composite$iv`: CompositeEncoder = encoder.beginCollection(`descriptor$iv`, size)
      val `$this$serialize_u24lambda_u240`: CompositeEncoder = `composite$iv`
      val iterator: java.util.Iterator = this.collectionIterator((Collection)value)

      repeat(size) { index ->
         `$this$serialize_u24lambda_u240`.encodeSerializableElement(this.descriptor, index, access$getElementSerializer$p(this), iterator.next())
      }

      `composite$iv`.endStructure(`descriptor$iv`)
   }

   public abstract val descriptor: SerialDescriptor

   protected override fun readElement(decoder: CompositeDecoder, index: Int, builder: Any, checkIndex: Boolean) {
      this.insert(
         (Builder)builder,
         index,
         (Element)CompositeDecoder.DefaultImpls.decodeSerializableElement$default(decoder, this.descriptor, index, this.elementSerializer, null, 8, null)
      )
   }

   init {
      this.elementSerializer = elementSerializer
   }

   protected abstract fun Any.insert(index: Int, element: Any) {
   }

   protected override fun readAll(decoder: CompositeDecoder, builder: Any, startIndex: Int, size: Int) {
      if (size < 0) {
         throw IllegalArgumentException("Size must be known in advance when using READ_ALL".toString())
      } else {
         repeat(size) { index ->
            this.readElement(decoder, startIndex + index, (Builder)builder, false)
         }
      }
   }
}
