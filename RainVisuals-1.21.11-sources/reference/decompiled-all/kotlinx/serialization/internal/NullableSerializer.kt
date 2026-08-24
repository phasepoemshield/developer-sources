package kotlinx.serialization.internal

import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

// $VF: Compiled from NullableSerializer.kt
@PublishedApi
internal class NullableSerializer<T>(serializer: KSerializer<Any>) : KSerializer<T> {
   public open val descriptor: SerialDescriptor
   private final val serializer: KSerializer<Any>

   init {
      this.serializer = serializer
      this.descriptor = SerialDescriptorForNullable(this.serializer.descriptor)
   }

   public override fun deserialize(decoder: Decoder): Any? {
      return (T)(if (decoder.decodeNotNullMark()) decoder.decodeSerializableValue(this.serializer) else decoder.decodeNull())
   }

   public override operator fun equals(other: Any?): Boolean {
      return this === other || other != null && this.getClass() === other.getClass() && this.serializer == (other as NullableSerializer).serializer
   }

   public override fun hashCode(): Int {
      return this.serializer.hashCode()
   }

   public override fun serialize(encoder: Encoder, value: Any?) {
      if (value != null) {
         encoder.encodeNotNullMark()
         encoder.encodeSerializableValue(this.serializer, (T)value)
      } else {
         encoder.encodeNull()
      }
   }
}
