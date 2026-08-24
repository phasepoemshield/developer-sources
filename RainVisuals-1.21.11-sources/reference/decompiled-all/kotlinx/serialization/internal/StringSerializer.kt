package kotlinx.serialization.internal

import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

// $VF: Compiled from Primitives.kt
@PublishedApi
internal object StringSerializer : KSerializer<java.lang.String> {
   public open val descriptor: SerialDescriptor = PrimitiveSerialDescriptor("kotlin.String", PrimitiveKind.STRING.INSTANCE) as SerialDescriptor

   public open fun serialize(encoder: Encoder, value: String) {
      encoder.encodeString(value)
   }

   public open fun deserialize(decoder: Decoder): String {
      return decoder.decodeString()
   }
}
