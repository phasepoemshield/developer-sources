@file:JvmMultifileClass
@file:JvmName("UComparisonsKt")

package kotlin.comparisons

import kotlin.internal.InlineOnly
import kotlin.jvm.internal.Intrinsics

// $VF: Compiled from _UComparisons.kt
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
public fun minOf(a: UInt, b: UInt): UInt {
   return if (Integer.compareUnsigned(a, b) <= 0) a else b
}

@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@SinceKotlin(version = "1.5")
@InlineOnly
public inline fun minOf(a: UInt, b: UInt, c: UInt): UInt {
   return UComparisonsKt.minOf_J1ME1BU/* $VF was: minOf-J1ME1BU */(a, UComparisonsKt.minOf_J1ME1BU/* $VF was: minOf-J1ME1BU */(b, c))
}

@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
public fun maxOf(a: UInt, other: UIntArray): UInt {
   var max: Int = a
   var var3: Int = 0

   for (var4 in size..var3) {
      max = UComparisonsKt.maxOf_J1ME1BU/* $VF was: maxOf-J1ME1BU */(max, UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(other, var3))
   }

   return max
}

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@InlineOnly
public inline fun maxOf(a: ULong, b: ULong, c: ULong): ULong {
   return UComparisonsKt.maxOf_eb3DHEI/* $VF was: maxOf-eb3DHEI */(a, UComparisonsKt.maxOf_eb3DHEI/* $VF was: maxOf-eb3DHEI */(b, c))
}

@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@SinceKotlin(version = "1.5")
public fun minOf(a: UShort, b: UShort): UShort {
   return if (Intrinsics.compare(a and 65535, b and 65535) <= 0) a else b
}

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@InlineOnly
public inline fun maxOf(a: UByte, b: UByte, c: UByte): UByte {
   return UComparisonsKt.maxOf_Kr8caGY/* $VF was: maxOf-Kr8caGY */(a, UComparisonsKt.maxOf_Kr8caGY/* $VF was: maxOf-Kr8caGY */(b, c))
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
public fun minOf(a: UShort, other: UShortArray): UShort {
   var min: Short = a
   var var3: Int = 0

   for (var4 in size..var3) {
      min = UComparisonsKt.minOf_5PvTz6A/* $VF was: minOf-5PvTz6A */(min, UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(other, var3))
   }

   return min
}

@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@SinceKotlin(version = "1.5")
public fun maxOf(a: UShort, b: UShort): UShort {
   return if (Intrinsics.compare(a and 65535, b and 65535) >= 0) a else b
}

open fun UComparisonsKt___UComparisonsKt() {
}

@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@SinceKotlin(version = "1.5")
public fun minOf(a: UByte, b: UByte): UByte {
   return if (Intrinsics.compare(a and 255, b and 255) <= 0) a else b
}

@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@SinceKotlin(version = "1.5")
public fun maxOf(a: ULong, b: ULong): ULong {
   return if (java.lang.Long.compareUnsigned(a, b) >= 0) a else b
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
public fun maxOf(a: UShort, other: UShortArray): UShort {
   var max: Short = a
   var var3: Int = 0

   for (var4 in size..var3) {
      max = UComparisonsKt.maxOf_5PvTz6A/* $VF was: maxOf-5PvTz6A */(max, UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(other, var3))
   }

   return max
}

@InlineOnly
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@SinceKotlin(version = "1.5")
public inline fun maxOf(a: UShort, b: UShort, c: UShort): UShort {
   return UComparisonsKt.maxOf_5PvTz6A/* $VF was: maxOf-5PvTz6A */(a, UComparisonsKt.maxOf_5PvTz6A/* $VF was: maxOf-5PvTz6A */(b, c))
}

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@InlineOnly
public inline fun minOf(a: ULong, b: ULong, c: ULong): ULong {
   return UComparisonsKt.minOf_eb3DHEI/* $VF was: minOf-eb3DHEI */(a, UComparisonsKt.minOf_eb3DHEI/* $VF was: minOf-eb3DHEI */(b, c))
}

@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
public fun minOf(a: UInt, other: UIntArray): UInt {
   var min: Int = a
   var var3: Int = 0

   for (var4 in size..var3) {
      min = UComparisonsKt.minOf_J1ME1BU/* $VF was: minOf-J1ME1BU */(min, UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(other, var3))
   }

   return min
}

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
public fun maxOf(a: UInt, b: UInt): UInt {
   return if (Integer.compareUnsigned(a, b) >= 0) a else b
}

@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
public fun minOf(a: ULong, other: ULongArray): ULong {
   var min: Long = a
   var var5: Int = 0

   for (var6 in size..var5) {
      min = UComparisonsKt.minOf_eb3DHEI/* $VF was: minOf-eb3DHEI */(min, ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(other, var5))
   }

   return min
}

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
public fun maxOf(a: UByte, b: UByte): UByte {
   return if (Intrinsics.compare(a and 255, b and 255) >= 0) a else b
}

@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
public fun maxOf(a: ULong, other: ULongArray): ULong {
   var max: Long = a
   var var5: Int = 0

   for (var6 in size..var5) {
      max = UComparisonsKt.maxOf_eb3DHEI/* $VF was: maxOf-eb3DHEI */(max, ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(other, var5))
   }

   return max
}

@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@InlineOnly
@SinceKotlin(version = "1.5")
public inline fun maxOf(a: UInt, b: UInt, c: UInt): UInt {
   return UComparisonsKt.maxOf_J1ME1BU/* $VF was: maxOf-J1ME1BU */(a, UComparisonsKt.maxOf_J1ME1BU/* $VF was: maxOf-J1ME1BU */(b, c))
}

@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@InlineOnly
@SinceKotlin(version = "1.5")
public inline fun minOf(a: UShort, b: UShort, c: UShort): UShort {
   return UComparisonsKt.minOf_5PvTz6A/* $VF was: minOf-5PvTz6A */(a, UComparisonsKt.minOf_5PvTz6A/* $VF was: minOf-5PvTz6A */(b, c))
}

@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@InlineOnly
@SinceKotlin(version = "1.5")
public inline fun minOf(a: UByte, b: UByte, c: UByte): UByte {
   return UComparisonsKt.minOf_Kr8caGY/* $VF was: minOf-Kr8caGY */(a, UComparisonsKt.minOf_Kr8caGY/* $VF was: minOf-Kr8caGY */(b, c))
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
public fun minOf(a: UByte, other: UByteArray): UByte {
   var min: Byte = a
   var var3: Int = 0

   for (var4 in size..var3) {
      min = UComparisonsKt.minOf_Kr8caGY/* $VF was: minOf-Kr8caGY */(min, UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(other, var3))
   }

   return min
}

@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@SinceKotlin(version = "1.5")
public fun minOf(a: ULong, b: ULong): ULong {
   return if (java.lang.Long.compareUnsigned(a, b) <= 0) a else b
}

@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
public fun maxOf(a: UByte, other: UByteArray): UByte {
   var max: Byte = a
   var var3: Int = 0

   for (var4 in size..var3) {
      max = UComparisonsKt.maxOf_Kr8caGY/* $VF was: maxOf-Kr8caGY */(max, UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(other, var3))
   }

   return max
}
