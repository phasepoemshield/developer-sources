package kotlinx.serialization

// $VF: Compiled from SerializationExceptions.kt
public open class SerializationException : IllegalArgumentException {
   public constructor(message: String?) : super(message)
   public constructor(message: String?, cause: Throwable?) : super(message, cause)

   public constructor(cause: Throwable?) : super(cause)}
