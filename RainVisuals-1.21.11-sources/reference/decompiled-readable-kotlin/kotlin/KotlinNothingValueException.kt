package kotlin

// $VF: Compiled from ExceptionsH.kt
@SinceKotlin(version = "1.4")
@PublishedApi
internal class KotlinNothingValueException : RuntimeException {
   public constructor(message: String?, cause: Throwable?) : super(message, cause)
   public constructor(cause: Throwable?) : super(cause)

   public constructor(message: String?) : super(message)}
