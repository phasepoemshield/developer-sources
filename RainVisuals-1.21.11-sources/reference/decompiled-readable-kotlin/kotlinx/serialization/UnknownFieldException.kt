package kotlinx.serialization

// $VF: Compiled from SerializationExceptions.kt
@PublishedApi
internal class UnknownFieldException internal constructor(message: String?) : SerializationException(message) {
   public constructor(index: Int) : this("An unknown field for index $index")}
