package kotlin

import kotlin.internal.InlineOnly

// $VF: Compiled from UShort.kt
@InlineOnly
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
public inline fun Byte.toUShort(): UShort {
   return UShort.constructor_impl/* $VF was: constructor-impl */((short)`$this$toUShort`)
}

@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@InlineOnly
@SinceKotlin(version = "1.5")
public inline fun Short.toUShort(): UShort {
   return UShort.constructor_impl/* $VF was: constructor-impl */(`$this$toUShort`)
}

@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@SinceKotlin(version = "1.5")
@InlineOnly
public inline fun Long.toUShort(): UShort {
   return UShort.constructor_impl/* $VF was: constructor-impl */((short)((int)`$this$toUShort`))
}

@InlineOnly
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
public inline fun Int.toUShort(): UShort {
   return UShort.constructor_impl/* $VF was: constructor-impl */((short)`$this$toUShort`)
}
