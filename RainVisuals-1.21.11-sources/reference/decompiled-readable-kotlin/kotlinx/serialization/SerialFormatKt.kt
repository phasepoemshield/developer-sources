package kotlinx.serialization

import kotlinx.serialization.internal.InternalHexConverter

// $VF: Compiled from SerialFormat.kt
public fun <T> BinaryFormat.encodeToHexString(serializer: SerializationStrategy<Any>, value: Any): String {
   return InternalHexConverter.INSTANCE.printHexBinary(`$this$encodeToHexString`.encodeToByteArray(serializer, value), true)
}

public fun <T> BinaryFormat.decodeFromHexString(deserializer: DeserializationStrategy<Any>, hex: String): Any {
   return (T)`$this$decodeFromHexString`.decodeFromByteArray(deserializer, InternalHexConverter.INSTANCE.parseHexBinary(hex))
}
