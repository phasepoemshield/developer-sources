package kotlin

import kotlin.internal.InlineOnly

// $VF: Compiled from UInt.kt
@InlineOnly
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@SinceKotlin(version = "1.5")
public inline fun Float.toUInt(): UInt {
   return UnsignedKt.doubleToUInt((double)`$this$toUInt`)
}

@SinceKotlin(version = "1.5")
@InlineOnly
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
public inline fun Int.toUInt(): UInt {
   return UInt.constructor_impl/* $VF was: constructor-impl */(`$this$toUInt`)
}

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@InlineOnly
public inline fun Long.toUInt(): UInt {
   return UInt.constructor_impl/* $VF was: constructor-impl */((int)`$this$toUInt`)
}

@InlineOnly
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@SinceKotlin(version = "1.5")
public inline fun Double.toUInt(): UInt {
   return UnsignedKt.doubleToUInt(`$this$toUInt`)
}

@InlineOnly
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@SinceKotlin(version = "1.5")
public inline fun Short.toUInt(): UInt {
   return UInt.constructor_impl/* $VF was: constructor-impl */(`$this$toUInt`)
}

@InlineOnly
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@SinceKotlin(version = "1.5")
public inline fun Byte.toUInt(): UInt {
   return UInt.constructor_impl/* $VF was: constructor-impl */(`$this$toUInt`)
}
