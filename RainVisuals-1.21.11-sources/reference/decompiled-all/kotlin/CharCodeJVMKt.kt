package kotlin

import kotlin.internal.InlineOnly

// $VF: Compiled from CharCodeJVM.kt
@InlineOnly
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public inline fun Char(code: UShort): Char {
   return (char)(code and 65535)
}
