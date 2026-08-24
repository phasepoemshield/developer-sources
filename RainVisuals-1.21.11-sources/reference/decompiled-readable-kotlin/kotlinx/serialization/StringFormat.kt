package kotlinx.serialization

// $VF: Compiled from SerialFormat.kt
public interface StringFormat : SerialFormat {
   public abstract fun <T> encodeToString(serializer: SerializationStrategy<Any>, value: Any): String {
   }

   public abstract fun <T> decodeFromString(deserializer: DeserializationStrategy<Any>, string: String): Any {
   }
}
