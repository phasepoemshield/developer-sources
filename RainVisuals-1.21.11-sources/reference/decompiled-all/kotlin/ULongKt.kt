package kotlin

import kotlin.internal.InlineOnly

// $VF: Compiled from ULong.kt
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@SinceKotlin(version = "1.5")
@InlineOnly
public inline fun Byte.toULong(): ULong {
   return ULong.constructor_impl/* $VF was: constructor-impl */((long)`$this$toULong`)
}

@InlineOnly
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@SinceKotlin(version = "1.5")
public inline fun Short.toULong(): ULong {
   return ULong.constructor_impl/* $VF was: constructor-impl */((long)`$this$toULong`)
}

@InlineOnly
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@SinceKotlin(version = "1.5")
public inline fun Double.toULong(): ULong {
   return UnsignedKt.doubleToULong(`$this$toULong`)
}

@InlineOnly
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@SinceKotlin(version = "1.5")
public inline fun Long.toULong(): ULong {
   return ULong.constructor_impl/* $VF was: constructor-impl */(`$this$toULong`)
}

@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@SinceKotlin(version = "1.5")
@InlineOnly
public inline fun Int.toULong(): ULong {
   return ULong.constructor_impl/* $VF was: constructor-impl */((long)`$this$toULong`)
}

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@InlineOnly
public inline fun Float.toULong(): ULong {
   return UnsignedKt.doubleToULong((double)`$this$toULong`)
}
