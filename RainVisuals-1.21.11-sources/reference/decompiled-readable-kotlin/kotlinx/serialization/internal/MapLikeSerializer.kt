package kotlinx.serialization.internal

import java.util.Map.Entry
import kotlinx.serialization.InternalSerializationApi
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeDecoder
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Encoder

// $VF: Compiled from CollectionSerializers.kt
@InternalSerializationApi
public sealed class MapLikeSerializer<Key, Value, Collection, Builder extends java.util.Map<Key, Value>> protected constructor(keySerializer: KSerializer<Any>,
   valueSerializer: KSerializer<Any>
) : AbstractCollectionSerializer() {
   public final val valueSerializer: KSerializer<Any>
   public final val keySerializer: KSerializer<Any>

   protected fun readElement(decoder: CompositeDecoder, index: Int, builder: Any, checkIndex: Boolean) {
      val key: Any = CompositeDecoder.DefaultImpls.decodeSerializableElement$default(decoder, this.descriptor, index, this.keySerializer, null, 8, null)
      val var10000: Int
      if (checkIndex) {
         val value: Int = decoder.decodeElementIndex(this.descriptor)
         if (value != index + 1) {
            throw IllegalArgumentException(("Value must follow key in a map, index for key: $index, returned index for value: $value").toString())
         }

         var10000 = value
      } else {
         var10000 = index + 1
      }

      builder.put(
         key,
         if (builder.containsKey(key) && this.valueSerializer.descriptor.kind !is PrimitiveKind)
            decoder.decodeSerializableElement(this.descriptor, var10000, this.valueSerializer, MapsKt.getValue(builder, key))
            else
            CompositeDecoder.DefaultImpls.decodeSerializableElement$default(decoder, this.descriptor, var10000, this.valueSerializer, null, 8, null)
      )
   }

   protected abstract fun Any.insertKeyValuePair(index: Int, key: Any, value: Any) {
   }

   public abstract val descriptor: SerialDescriptor

   init {
      this.keySerializer = keySerializer
      this.valueSerializer = valueSerializer
   }

   protected fun readAll(decoder: CompositeDecoder, builder: Any, startIndex: Int, size: Int) {
      if (size < 0) {
         throw IllegalArgumentException("Size must be known in advance when using READ_ALL".toString())
      } else {
         val var5: IntProgression = RangesKt.step(RangesKt.until((int)0, (int)(size * 2)), 2)
         var index: Int = var5.first
         val var7: Int = var5.last
         val var8: Int = var5.step
         if (var8 > 0 && index <= var7 || var8 < 0 && var7 <= index) {
            while (true) {
               this.readElement(decoder, startIndex + index, (Builder)builder, false)
               if (index == var7) {
                  break
               }

               index += var8
            }
         }
      }
   }

   public override fun serialize(encoder: Encoder, value: Any) {
      val size: Int = this.collectionSize((Collection)value)
      val `descriptor$iv`: SerialDescriptor = this.descriptor
      val `composite$iv`: CompositeEncoder = encoder.beginCollection(`descriptor$iv`, size)
      val `$this$serialize_u24lambda_u244`: CompositeEncoder = `composite$iv`
      val iterator: java.util.Iterator = this.collectionIterator((Collection)value)
      var index: Int = 0
      val var14: java.util.Iterator = iterator

      while (var14.hasNext()) {
         val var16: Entry = var14.next() as Entry
         val k: Any = var16.getKey()
         val v: Any = var16.getValue()
         var var10001: SerialDescriptor = this.descriptor
         val var21: Int = index + 1
         `$this$serialize_u24lambda_u244`.encodeSerializableElement(var10001, index, this.keySerializer, (Key)k)
         var10001 = this.descriptor
         index = var21 + 1
         `$this$serialize_u24lambda_u244`.encodeSerializableElement(var10001, var21, this.valueSerializer, (Value)v)
      }

      `composite$iv`.endStructure(`descriptor$iv`)
   }
}
