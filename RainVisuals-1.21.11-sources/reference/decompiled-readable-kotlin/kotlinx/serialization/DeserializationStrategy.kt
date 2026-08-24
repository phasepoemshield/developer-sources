package kotlinx.serialization

import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder

// $VF: Compiled from KSerializer.kt
public interface DeserializationStrategy<T> {
   public val descriptor: SerialDescriptor

   public abstract fun deserialize(decoder: Decoder): Any {
   }
}
