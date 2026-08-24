package kotlinx.serialization.internal

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptorsKt
import kotlinx.serialization.descriptors.StructureKind
import kotlinx.serialization.encoding.CompositeDecoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

// $VF: Compiled from ObjectSerializer.kt
@PublishedApi
internal class ObjectSerializer<T>(serialName: String, objectInstance: Any) : KSerializer<T> {
   public open val descriptor: SerialDescriptor
      public open get() {
         return this.descriptor$delegate.value as SerialDescriptor
      }


   private final val objectInstance: Any
   private final var _annotations: List<Annotation>

   @PublishedApi
   internal constructor(serialName: String, objectInstance: Any, vararg classAnnotations: Any) : this(serialName, (T)objectInstance) {
      this._annotations = ArraysKt.asList(classAnnotations)
   }

   init {
      this.objectInstance = (T)objectInstance
      this._annotations = CollectionsKt.emptyList()
      this.descriptor$delegate = LazyKt.lazy(
         LazyThreadSafetyMode.PUBLICATION,
               // $VF: Compiled from ObjectSerializer.kt
   {
            return SerialDescriptorsKt.buildSerialDescriptor(
               serialName, StructureKind.OBJECT.INSTANCE, arrayOfNulls(0),          // $VF: Compiled from ObjectSerializer.kt
      {
                  `$this$buildSerialDescriptor`.annotations = var2/* $VF was: ObjectSerializer.this */._annotations
               } as (ClassSerialDescriptorBuilder?) -> Unit
            )
         } as () -> T
      )
   }

   public override fun deserialize(decoder: Decoder): Any {
      val `descriptor$iv`: SerialDescriptor = this.descriptor
      val `composite$iv`: CompositeDecoder = decoder.beginStructure(`descriptor$iv`)
      if (!`composite$iv`.decodeSequentially()) {
         val index: Int = `composite$iv`.decodeElementIndex(this.descriptor)
         if (index != -1) {
            throw SerializationException("Unexpected index $index")
         }
      }

      `composite$iv`.endStructure(`descriptor$iv`)
      return this.objectInstance
   }

   public override fun serialize(encoder: Encoder, value: Any) {
      encoder.beginStructure(this.descriptor).endStructure(this.descriptor)
   }
}
