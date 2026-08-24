package kotlinx.serialization.encoding

import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.descriptors.SerialDescriptor

// $VF: Compiled from Decoding.kt
internal inline fun <T : Any> Decoder.decodeIfNullable(deserializer: DeserializationStrategy<Any?>, block: () -> Any?): Any? {
   return (T)(if (!deserializer.descriptor.isNullable && !`$this$decodeIfNullable`.decodeNotNullMark()) `$this$decodeIfNullable`.decodeNull() else block())
}

public inline fun <T> Decoder.decodeStructure(descriptor: SerialDescriptor, crossinline block: (CompositeDecoder) -> Any): Any {
   val composite: CompositeDecoder = `$this$decodeStructure`.beginStructure(descriptor)
   val result: Any = block(composite)
   composite.endStructure(descriptor)
   return (T)result
}
