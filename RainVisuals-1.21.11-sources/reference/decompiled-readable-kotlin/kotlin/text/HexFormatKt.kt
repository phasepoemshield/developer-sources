package kotlin.text

import kotlin.internal.InlineOnly
import kotlin.text.HexFormat.Builder

// $VF: Compiled from HexFormat.kt
@ExperimentalStdlibApi
@InlineOnly
@SinceKotlin(version = "1.9")
public inline fun HexFormat(builderAction: (Builder) -> Unit): HexFormat {
   val var1: HexFormat.Builder = HexFormat.Builder()
   builderAction(var1)
   return var1.build()
}
