package kotlin

import kotlin.internal.InlineOnly
import kotlin.internal.IntrinsicConstEvaluation

// $VF: Compiled from CharCode.kt
@SinceKotlin(version = "1.5")
@InlineOnly
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public inline fun Char(code: Int): Char {
   if (code >= 0 && code <= 65535) {
      return (char)code
   } else {
      throw IllegalArgumentException("Invalid Char code: $code")
   }
}

@IntrinsicConstEvaluation
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = ExperimentalStdlibApi.class)
@InlineOnly
public final val code: Int
   public final inline get() {
      return `$this$code`
   }

