package kotlin.math

import kotlin.internal.InlineOnly

// $VF: Compiled from UMath.kt
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@InlineOnly
public inline fun max(a: ULong, b: ULong): ULong {
   return UComparisonsKt.maxOf_eb3DHEI/* $VF was: maxOf-eb3DHEI */(a, b)
}

@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@InlineOnly
@SinceKotlin(version = "1.5")
public inline fun min(a: UInt, b: UInt): UInt {
   return UComparisonsKt.minOf_J1ME1BU/* $VF was: minOf-J1ME1BU */(a, b)
}

@InlineOnly
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
public inline fun min(a: ULong, b: ULong): ULong {
   return UComparisonsKt.minOf_eb3DHEI/* $VF was: minOf-eb3DHEI */(a, b)
}

@InlineOnly
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@SinceKotlin(version = "1.5")
public inline fun max(a: UInt, b: UInt): UInt {
   return UComparisonsKt.maxOf_J1ME1BU/* $VF was: maxOf-J1ME1BU */(a, b)
}
