package kotlinx.serialization.encoding

import kotlinx.serialization.ExperimentalSerializationApi

// $VF: Compiled from ChunkedDecoder.kt
@ExperimentalSerializationApi
public interface ChunkedDecoder {
   @ExperimentalSerializationApi
   public abstract fun decodeStringChunked(consumeChunk: (String) -> Unit) {
   }
}
