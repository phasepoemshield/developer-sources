package kotlinx.serialization

import kotlinx.serialization.descriptors.SerialDescriptor

// $VF: Compiled from KSerializer.kt
public interface KSerializer<T> : SerializationStrategy<T>, DeserializationStrategy<T> {
   public val descriptor: SerialDescriptor
}
