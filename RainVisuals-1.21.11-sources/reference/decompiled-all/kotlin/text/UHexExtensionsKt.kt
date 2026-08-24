package kotlin.text

import kotlin.internal.InlineOnly

// $VF: Compiled from UHexExtensions.kt
@SinceKotlin(version = "1.9")
@InlineOnly
@ExperimentalStdlibApi
public inline fun ULong.toHexString(format: HexFormat = ...): String {
   return HexExtensionsKt.toHexString(`$this$toHexString_u2d8UJCm_u2dI`, format)
}

@InlineOnly
@SinceKotlin(version = "1.9")
@ExperimentalStdlibApi
public inline fun UInt.toHexString(format: HexFormat = ...): String {
   return HexExtensionsKt.toHexString(`$this$toHexString_u2d8M7LxHw`, format)
}

@InlineOnly
@SinceKotlin(version = "1.9")
@ExperimentalStdlibApi
public inline fun String.hexToUByte(format: HexFormat = HexFormat.Companion.Default): UByte {
   return UByte.constructor_impl/* $VF was: constructor-impl */(HexExtensionsKt.hexToByte(`$this$hexToUByte`, format))
}

@InlineOnly
@ExperimentalStdlibApi
@SinceKotlin(version = "1.9")
@ExperimentalUnsignedTypes
public inline fun UByteArray.toHexString(format: HexFormat = ...): String {
   return HexExtensionsKt.toHexString(`$this$toHexString_u2dzHuV2wU`, format)
}

@InlineOnly
@SinceKotlin(version = "1.9")
@ExperimentalStdlibApi
public inline fun UByte.toHexString(format: HexFormat = ...): String {
   return HexExtensionsKt.toHexString(`$this$toHexString_u2dZQbaR00`, format)
}

@SinceKotlin(version = "1.9")
@InlineOnly
@ExperimentalStdlibApi
public inline fun String.hexToULong(format: HexFormat = HexFormat.Companion.Default): ULong {
   return ULong.constructor_impl/* $VF was: constructor-impl */(HexExtensionsKt.hexToLong(`$this$hexToULong`, format))
}

@ExperimentalStdlibApi
@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.9")
public inline fun String.hexToUByteArray(format: HexFormat = ...): UByteArray {
   return UByteArray.constructor_impl/* $VF was: constructor-impl */(HexExtensionsKt.hexToByteArray(`$this$hexToUByteArray`, format))
}

@SinceKotlin(version = "1.9")
@ExperimentalUnsignedTypes
@ExperimentalStdlibApi
@InlineOnly
public inline fun UByteArray.toHexString(startIndex: Int = ..., endIndex: Int = ..., format: HexFormat = ...): String {
   return HexExtensionsKt.toHexString(`$this$toHexString_u2dlZCiFrA`, startIndex, endIndex, format)
}

@SinceKotlin(version = "1.9")
@InlineOnly
@ExperimentalStdlibApi
public inline fun String.hexToUInt(format: HexFormat = HexFormat.Companion.Default): UInt {
   return UInt.constructor_impl/* $VF was: constructor-impl */(HexExtensionsKt.hexToInt(`$this$hexToUInt`, format))
}

@SinceKotlin(version = "1.9")
@ExperimentalStdlibApi
@InlineOnly
public inline fun String.hexToUShort(format: HexFormat = HexFormat.Companion.Default): UShort {
   return UShort.constructor_impl/* $VF was: constructor-impl */(HexExtensionsKt.hexToShort(`$this$hexToUShort`, format))
}

@ExperimentalStdlibApi
@SinceKotlin(version = "1.9")
@InlineOnly
public inline fun UShort.toHexString(format: HexFormat = ...): String {
   return HexExtensionsKt.toHexString(`$this$toHexString_u2dr3ox_E0`, format)
}
