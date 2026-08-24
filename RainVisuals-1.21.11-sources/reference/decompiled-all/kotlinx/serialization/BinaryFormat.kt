package kotlinx.serialization

// $VF: Compiled from SerialFormat.kt
public interface BinaryFormat : SerialFormat {
   public abstract fun <T> decodeFromByteArray(deserializer: DeserializationStrategy<Any>, bytes: ByteArray): Any {
   }

   public abstract fun <T> encodeToByteArray(serializer: SerializationStrategy<Any>, value: Any): ByteArray {
   }
}
