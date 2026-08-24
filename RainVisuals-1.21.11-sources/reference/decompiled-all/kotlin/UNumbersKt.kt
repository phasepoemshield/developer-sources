@file:JvmName(name = "UNumbersKt")

package kotlin

import kotlin.internal.InlineOnly

// $VF: Compiled from UNumbers.kt
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class, ExperimentalStdlibApi::class])
@InlineOnly
public inline fun UByte.countTrailingZeroBits(): Int {
   return Integer.numberOfTrailingZeros(`$this$countTrailingZeroBits_u2d7apg3OU` or 256)
}

@InlineOnly
@WasExperimental(markerClass = [ExperimentalStdlibApi::class, ExperimentalUnsignedTypes::class])
@SinceKotlin(version = "1.6")
public inline fun ULong.rotateRight(bitCount: Int): ULong {
   return ULong.constructor_impl/* $VF was: constructor-impl */(java.lang.Long.rotateRight(`$this$rotateRight_u2dJSWoG40`, bitCount))
}

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class, ExperimentalStdlibApi::class])
@InlineOnly
public inline fun UByte.takeLowestOneBit(): UByte {
   return UByte.constructor_impl/* $VF was: constructor-impl */((byte)Integer.lowestOneBit(`$this$takeLowestOneBit_u2d7apg3OU` and 255))
}

@InlineOnly
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class, ExperimentalStdlibApi::class])
public inline fun ULong.takeLowestOneBit(): ULong {
   return ULong.constructor_impl/* $VF was: constructor-impl */(java.lang.Long.lowestOneBit(`$this$takeLowestOneBit_u2dVKZWuLQ`))
}

@InlineOnly
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class, ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.5")
public inline fun ULong.countOneBits(): Int {
   return java.lang.Long.bitCount(`$this$countOneBits_u2dVKZWuLQ`)
}

@InlineOnly
@SinceKotlin(version = "1.6")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class, ExperimentalUnsignedTypes::class])
public inline fun UByte.rotateLeft(bitCount: Int): UByte {
   return UByte.constructor_impl/* $VF was: constructor-impl */(NumbersKt.rotateLeft(`$this$rotateLeft_u2dLxnNnR4`, bitCount))
}

@SinceKotlin(version = "1.6")
@InlineOnly
@WasExperimental(markerClass = [ExperimentalStdlibApi::class, ExperimentalUnsignedTypes::class])
public inline fun UShort.rotateLeft(bitCount: Int): UShort {
   return UShort.constructor_impl/* $VF was: constructor-impl */(NumbersKt.rotateLeft((short)`$this$rotateLeft_u2dolVBNx4`, bitCount))
}

@SinceKotlin(version = "1.6")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class, ExperimentalUnsignedTypes::class])
@InlineOnly
public inline fun UShort.rotateRight(bitCount: Int): UShort {
   return UShort.constructor_impl/* $VF was: constructor-impl */(NumbersKt.rotateRight((short)`$this$rotateRight_u2dolVBNx4`, bitCount))
}

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class, ExperimentalStdlibApi::class])
@InlineOnly
public inline fun UByte.takeHighestOneBit(): UByte {
   return UByte.constructor_impl/* $VF was: constructor-impl */((byte)Integer.highestOneBit(`$this$takeHighestOneBit_u2d7apg3OU` and 255))
}

@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class, ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.5")
@InlineOnly
public inline fun ULong.countTrailingZeroBits(): Int {
   return java.lang.Long.numberOfTrailingZeros(`$this$countTrailingZeroBits_u2dVKZWuLQ`)
}

@InlineOnly
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class, ExperimentalStdlibApi::class])
public inline fun UByte.countLeadingZeroBits(): Int {
   return Integer.numberOfLeadingZeros(`$this$countLeadingZeroBits_u2d7apg3OU` and 255) - 24
}

@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class, ExperimentalStdlibApi::class])
@InlineOnly
@SinceKotlin(version = "1.5")
public inline fun UInt.countOneBits(): Int {
   return Integer.bitCount(`$this$countOneBits_u2dWZ4Q5Ns`)
}

@SinceKotlin(version = "1.6")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class, ExperimentalUnsignedTypes::class])
@InlineOnly
public inline fun UInt.rotateLeft(bitCount: Int): UInt {
   return UInt.constructor_impl/* $VF was: constructor-impl */(Integer.rotateLeft(`$this$rotateLeft_u2dV7xB4Y4`, bitCount))
}

@InlineOnly
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class, ExperimentalStdlibApi::class])
public inline fun UInt.countLeadingZeroBits(): Int {
   return Integer.numberOfLeadingZeros(`$this$countLeadingZeroBits_u2dWZ4Q5Ns`)
}

@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class, ExperimentalStdlibApi::class])
@InlineOnly
@SinceKotlin(version = "1.5")
public inline fun UShort.takeHighestOneBit(): UShort {
   return UShort.constructor_impl/* $VF was: constructor-impl */((short)Integer.highestOneBit(`$this$takeHighestOneBit_u2dxj2QHRw` and 65535))
}

@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class, ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.5")
@InlineOnly
public inline fun UInt.takeHighestOneBit(): UInt {
   return UInt.constructor_impl/* $VF was: constructor-impl */(Integer.highestOneBit(`$this$takeHighestOneBit_u2dWZ4Q5Ns`))
}

@InlineOnly
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class, ExperimentalStdlibApi::class])
public inline fun UInt.countTrailingZeroBits(): Int {
   return Integer.numberOfTrailingZeros(`$this$countTrailingZeroBits_u2dWZ4Q5Ns`)
}

@InlineOnly
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class, ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.5")
public inline fun UShort.takeLowestOneBit(): UShort {
   return UShort.constructor_impl/* $VF was: constructor-impl */((short)Integer.lowestOneBit(`$this$takeLowestOneBit_u2dxj2QHRw` and 65535))
}

@InlineOnly
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class, ExperimentalStdlibApi::class])
public inline fun UInt.takeLowestOneBit(): UInt {
   return UInt.constructor_impl/* $VF was: constructor-impl */(Integer.lowestOneBit(`$this$takeLowestOneBit_u2dWZ4Q5Ns`))
}

@InlineOnly
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class, ExperimentalStdlibApi::class])
public inline fun UShort.countTrailingZeroBits(): Int {
   return Integer.numberOfTrailingZeros(`$this$countTrailingZeroBits_u2dxj2QHRw` or 65536)
}

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class, ExperimentalStdlibApi::class])
@InlineOnly
public inline fun UByte.countOneBits(): Int {
   return Integer.bitCount(UInt.constructor_impl/* $VF was: constructor-impl */(`$this$countOneBits_u2d7apg3OU` and 255))
}

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class, ExperimentalStdlibApi::class])
@InlineOnly
public inline fun ULong.countLeadingZeroBits(): Int {
   return java.lang.Long.numberOfLeadingZeros(`$this$countLeadingZeroBits_u2dVKZWuLQ`)
}

@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class, ExperimentalStdlibApi::class])
@InlineOnly
@SinceKotlin(version = "1.5")
public inline fun UShort.countLeadingZeroBits(): Int {
   return Integer.numberOfLeadingZeros(`$this$countLeadingZeroBits_u2dxj2QHRw` and 65535) - 16
}

@InlineOnly
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class, ExperimentalStdlibApi::class])
public inline fun UShort.countOneBits(): Int {
   return Integer.bitCount(UInt.constructor_impl/* $VF was: constructor-impl */(`$this$countOneBits_u2dxj2QHRw` and 65535))
}

@InlineOnly
@SinceKotlin(version = "1.6")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class, ExperimentalUnsignedTypes::class])
public inline fun UInt.rotateRight(bitCount: Int): UInt {
   return UInt.constructor_impl/* $VF was: constructor-impl */(Integer.rotateRight(`$this$rotateRight_u2dV7xB4Y4`, bitCount))
}

@InlineOnly
@SinceKotlin(version = "1.6")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class, ExperimentalUnsignedTypes::class])
public inline fun ULong.rotateLeft(bitCount: Int): ULong {
   return ULong.constructor_impl/* $VF was: constructor-impl */(java.lang.Long.rotateLeft(`$this$rotateLeft_u2dJSWoG40`, bitCount))
}

@InlineOnly
@WasExperimental(markerClass = [ExperimentalStdlibApi::class, ExperimentalUnsignedTypes::class])
@SinceKotlin(version = "1.6")
public inline fun UByte.rotateRight(bitCount: Int): UByte {
   return UByte.constructor_impl/* $VF was: constructor-impl */(NumbersKt.rotateRight(`$this$rotateRight_u2dLxnNnR4`, bitCount))
}

@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class, ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.5")
@InlineOnly
public inline fun ULong.takeHighestOneBit(): ULong {
   return ULong.constructor_impl/* $VF was: constructor-impl */(java.lang.Long.highestOneBit(`$this$takeHighestOneBit_u2dVKZWuLQ`))
}
