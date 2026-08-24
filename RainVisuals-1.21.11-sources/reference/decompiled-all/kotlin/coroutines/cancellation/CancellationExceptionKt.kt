package kotlin.coroutines.cancellation

import java.util.concurrent.CancellationException
import kotlin.internal.InlineOnly

// $VF: Compiled from CancellationException.kt
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun CancellationException(message: String?, cause: Throwable?): CancellationException {
   val var2: CancellationException = CancellationException(message)
   var2.initCause(cause)
   return var2
}

@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun CancellationException(cause: Throwable?): CancellationException {
   val var1: CancellationException = CancellationException(if (cause != null) cause.toString() else null)
   var1.initCause(cause)
   return var1
}
