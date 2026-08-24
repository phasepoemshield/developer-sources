package kotlinx.serialization.internal

import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

// $VF: Compiled from Primitives.kt
@PublishedApi
internal object CharSerializer : KSerializer<Character> {
   public open val descriptor: SerialDescriptor = PrimitiveSerialDescriptor("kotlin.Char", PrimitiveKind.CHAR.INSTANCE) as SerialDescriptor

   public open fun deserialize(decoder: Decoder): Char {
      return decoder.decodeChar()
   }

   public open fun serialize(encoder: Encoder, value: Char) {
      encoder.encodeChar(value)
   }
}
