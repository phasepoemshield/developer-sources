package kotlin

import kotlin.internal.InlineOnly

// $VF: Compiled from UByte.kt
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@InlineOnly
@SinceKotlin(version = "1.5")
public inline fun Int.toUByte(): UByte {
   return UByte.constructor_impl/* $VF was: constructor-impl */((byte)`$this$toUByte`)
}

@SinceKotlin(version = "1.5")
@InlineOnly
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
public inline fun Long.toUByte(): UByte {
   return UByte.constructor_impl/* $VF was: constructor-impl */((byte)((int)`$this$toUByte`))
}

@SinceKotlin(version = "1.5")
@InlineOnly
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
public inline fun Short.toUByte(): UByte {
   return UByte.constructor_impl/* $VF was: constructor-impl */((byte)`$this$toUByte`)
}

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@InlineOnly
public inline fun Byte.toUByte(): UByte {
   return UByte.constructor_impl/* $VF was: constructor-impl */(`$this$toUByte`)
}
