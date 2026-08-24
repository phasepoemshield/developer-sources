package kotlinx.serialization.internal

import kotlin.time.Duration
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

// $VF: Compiled from BuiltInSerializers.kt
@PublishedApi
internal object DurationSerializer : KSerializer<Duration> {
   public open val descriptor: SerialDescriptor = PrimitiveSerialDescriptor("kotlin.time.Duration", PrimitiveKind.STRING.INSTANCE) as SerialDescriptor

   public open fun deserialize(decoder: Decoder): Duration {
      return Duration.Companion.parseIsoString_UwyO8pc/* $VF was: parseIsoString-UwyO8pc */(decoder.decodeString())
   }

   public open fun serialize(encoder: Encoder, value: Duration) {
      encoder.encodeString(Duration.toIsoString_impl/* $VF was: toIsoString-impl */(value))
   }
}
