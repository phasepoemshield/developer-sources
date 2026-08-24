package kotlin

import kotlin.internal.InlineOnly
import kotlin.internal.IntrinsicConstEvaluation
import kotlin.jvm.internal.Intrinsics

// $VF: Compiled from UByte.kt
@JvmInline
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@SinceKotlin(version = "1.5")
public value class UByte : java.lang.Comparable<UByte> {
   @PublishedApi
   internal final val data: Byte

   @InlineOnly
   @JvmStatic
   public inline operator fun times(other: ULong): ULong {
      return ULong.constructor_impl/* $VF was: constructor-impl */(ULong.constructor_impl/* $VF was: constructor-impl */((long)arg0 and 255L) * other)
   }

   @InlineOnly
   @JvmStatic
   public inline fun inv(): UByte {
      return constructor_impl/* $VF was: constructor-impl */((byte)(arg0.inv()))
   }

   @InlineOnly
   @JvmStatic
   public inline fun mod(other: UByte): UByte {
      return constructor_impl/* $VF was: constructor-impl */(
         (byte)Integer.remainderUnsigned(
            UInt.constructor_impl/* $VF was: constructor-impl */(arg0 and 255), UInt.constructor_impl/* $VF was: constructor-impl */(other and 255)
         )
      )
   }

   @InlineOnly
   @JvmStatic
   public inline fun floorDiv(other: ULong): ULong {
      return java.lang.Long.divideUnsigned(ULong.constructor_impl/* $VF was: constructor-impl */((long)arg0 and 255L), other)
   }

   @InlineOnly
   @JvmStatic
   public inline fun toLong(): Long {
      return arg0 and 255L
   }

   @InlineOnly
   @JvmStatic
   public inline fun toShort(): Short {
      return (short)(arg0 and 255)
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun minus(other: ULong): ULong {
      return ULong.constructor_impl/* $VF was: constructor-impl */(ULong.constructor_impl/* $VF was: constructor-impl */((long)arg0 and 255L) - other)
   }

   @InlineOnly
   @JvmStatic
   public inline fun floorDiv(other: UShort): UInt {
      return Integer.divideUnsigned(
         UInt.constructor_impl/* $VF was: constructor-impl */(arg0 and 255), UInt.constructor_impl/* $VF was: constructor-impl */(other and 65535)
      )
   }

   @InlineOnly
   @JvmStatic
   public inline fun toByte(): Byte {
      return arg0
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun rem(other: UInt): UInt {
      return Integer.remainderUnsigned(UInt.constructor_impl/* $VF was: constructor-impl */(arg0 and 255), other)
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun minus(other: UShort): UInt {
      return UInt.constructor_impl/* $VF was: constructor-impl */(
         UInt.constructor_impl/* $VF was: constructor-impl */(arg0 and 255) - UInt.constructor_impl/* $VF was: constructor-impl */(other and 65535)
      )
   }

   @InlineOnly
   @JvmStatic
   public inline fun toUByte(): UByte {
      return arg0
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun inc(): UByte {
      return constructor_impl/* $VF was: constructor-impl */((byte)(arg0 + 1))
   }

   @InlineOnly
   @JvmStatic
   public inline fun toUInt(): UInt {
      return UInt.constructor_impl/* $VF was: constructor-impl */(arg0 and 255)
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun div(other: UShort): UInt {
      return Integer.divideUnsigned(
         UInt.constructor_impl/* $VF was: constructor-impl */(arg0 and 255), UInt.constructor_impl/* $VF was: constructor-impl */(other and 65535)
      )
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun plus(other: UShort): UInt {
      return UInt.constructor_impl/* $VF was: constructor-impl */(
         UInt.constructor_impl/* $VF was: constructor-impl */(arg0 and 255) + UInt.constructor_impl/* $VF was: constructor-impl */(other and 65535)
      )
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun rangeTo(other: UByte): UIntRange {
      return UIntRange(
         UInt.constructor_impl/* $VF was: constructor-impl */(arg0 and 255), UInt.constructor_impl/* $VF was: constructor-impl */(other and 255), null
      )
   }

   @InlineOnly
   @JvmStatic
   public inline infix fun xor(other: UByte): UByte {
      return constructor_impl/* $VF was: constructor-impl */((byte)(arg0 xor other))
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun plus(other: UInt): UInt {
      return UInt.constructor_impl/* $VF was: constructor-impl */(UInt.constructor_impl/* $VF was: constructor-impl */(arg0 and 255) + other)
   }

   @WasExperimental(markerClass = [ExperimentalStdlibApi::class])
   @SinceKotlin(version = "1.9")
   @InlineOnly
   @JvmStatic
   public inline operator fun rangeUntil(other: UByte): UIntRange {
      return URangesKt.until_J1ME1BU/* $VF was: until-J1ME1BU */(
         UInt.constructor_impl/* $VF was: constructor-impl */(arg0 and 255), UInt.constructor_impl/* $VF was: constructor-impl */(other and 255)
      )
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun div(other: ULong): ULong {
      return java.lang.Long.divideUnsigned(ULong.constructor_impl/* $VF was: constructor-impl */((long)arg0 and 255L), other)
   }

   @InlineOnly
   @JvmStatic
   public inline infix fun or(other: UByte): UByte {
      return constructor_impl/* $VF was: constructor-impl */((byte)(arg0 or other))
   }

   @InlineOnly
   @JvmStatic
   public inline fun floorDiv(other: UByte): UInt {
      return Integer.divideUnsigned(
         UInt.constructor_impl/* $VF was: constructor-impl */(arg0 and 255), UInt.constructor_impl/* $VF was: constructor-impl */(other and 255)
      )
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun div(other: UInt): UInt {
      return Integer.divideUnsigned(UInt.constructor_impl/* $VF was: constructor-impl */(arg0 and 255), other)
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun rem(other: UShort): UInt {
      return Integer.remainderUnsigned(
         UInt.constructor_impl/* $VF was: constructor-impl */(arg0 and 255), UInt.constructor_impl/* $VF was: constructor-impl */(other and 65535)
      )
   }

   @InlineOnly
   @JvmStatic
   public inline fun toULong(): ULong {
      return ULong.constructor_impl/* $VF was: constructor-impl */((long)arg0 and 255L)
   }

   @PublishedApi
   @IntrinsicConstEvaluation
   @JvmStatic
   fun `constructor-impl`(data: Byte): Byte {
      data
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun compareTo(other: UShort): Int {
      return Intrinsics.compare(arg0 and 255, other and 65535)
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun div(other: UByte): UInt {
      return Integer.divideUnsigned(
         UInt.constructor_impl/* $VF was: constructor-impl */(arg0 and 255), UInt.constructor_impl/* $VF was: constructor-impl */(other and 255)
      )
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun times(other: UShort): UInt {
      return UInt.constructor_impl/* $VF was: constructor-impl */(
         UInt.constructor_impl/* $VF was: constructor-impl */(arg0 and 255) * UInt.constructor_impl/* $VF was: constructor-impl */(other and 65535)
      )
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun times(other: UByte): UInt {
      return UInt.constructor_impl/* $VF was: constructor-impl */(
         UInt.constructor_impl/* $VF was: constructor-impl */(arg0 and 255) * UInt.constructor_impl/* $VF was: constructor-impl */(other and 255)
      )
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun compareTo(other: UInt): Int {
      return Integer.compareUnsigned(UInt.constructor_impl/* $VF was: constructor-impl */(arg0 and 255), other)
   }

   @InlineOnly
   @JvmStatic
   public open inline operator fun compareTo(other: UByte): Int {
      return Intrinsics.compare(arg0 and 255, other and 255)
   }

   @InlineOnly
   @JvmStatic
   public inline fun toUShort(): UShort {
      return UShort.constructor_impl/* $VF was: constructor-impl */((short)((short)arg0 and 255))
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun plus(other: UByte): UInt {
      return UInt.constructor_impl/* $VF was: constructor-impl */(
         UInt.constructor_impl/* $VF was: constructor-impl */(arg0 and 255) + UInt.constructor_impl/* $VF was: constructor-impl */(other and 255)
      )
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun minus(other: UInt): UInt {
      return UInt.constructor_impl/* $VF was: constructor-impl */(UInt.constructor_impl/* $VF was: constructor-impl */(arg0 and 255) - other)
   }

   override fun equals(other: Any): Boolean {
      equals_impl/* $VF was: equals-impl */(this.data, other)
   }

   override fun toString(): java.lang.String {
      toString_impl/* $VF was: toString-impl */(this.data)
   }

   @JvmStatic
   public open fun hashCode(): Int {
      return java.lang.Byte.hashCode(arg0)
   }

   @InlineOnly
   @JvmStatic
   public inline infix fun and(other: UByte): UByte {
      return constructor_impl/* $VF was: constructor-impl */((byte)(arg0 and other))
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun minus(other: UByte): UInt {
      return UInt.constructor_impl/* $VF was: constructor-impl */(
         UInt.constructor_impl/* $VF was: constructor-impl */(arg0 and 255) - UInt.constructor_impl/* $VF was: constructor-impl */(other and 255)
      )
   }

   @InlineOnly
   @JvmStatic
   public inline fun mod(other: ULong): ULong {
      return java.lang.Long.remainderUnsigned(ULong.constructor_impl/* $VF was: constructor-impl */((long)arg0 and 255L), other)
   }

   @InlineOnly
   @JvmStatic
   public inline fun mod(other: UInt): UInt {
      return Integer.remainderUnsigned(UInt.constructor_impl/* $VF was: constructor-impl */(arg0 and 255), other)
   }

   @InlineOnly
   @JvmStatic
   public inline fun floorDiv(other: UInt): UInt {
      return Integer.divideUnsigned(UInt.constructor_impl/* $VF was: constructor-impl */(arg0 and 255), other)
   }

   @InlineOnly
   @JvmStatic
   public inline fun toFloat(): Float {
      return arg0 and 255
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun rem(other: ULong): ULong {
      return java.lang.Long.remainderUnsigned(ULong.constructor_impl/* $VF was: constructor-impl */((long)arg0 and 255L), other)
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun dec(): UByte {
      return constructor_impl/* $VF was: constructor-impl */((byte)(arg0 + -1))
   }

   @InlineOnly
   @JvmStatic
   public inline fun toDouble(): Double {
      return arg0 and 255
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun times(other: UInt): UInt {
      return UInt.constructor_impl/* $VF was: constructor-impl */(UInt.constructor_impl/* $VF was: constructor-impl */(arg0 and 255) * other)
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun rem(other: UByte): UInt {
      return Integer.remainderUnsigned(
         UInt.constructor_impl/* $VF was: constructor-impl */(arg0 and 255), UInt.constructor_impl/* $VF was: constructor-impl */(other and 255)
      )
   }

   @InlineOnly
   fun `compareTo-7apg3OU`(other: Byte): Int {
      Intrinsics.compare(this.unbox_impl/* $VF was: unbox-impl */() and 255, other and 255)
   }

   override fun hashCode(): Int {
      hashCode_impl/* $VF was: hashCode-impl */(this.data)
   }

   @JvmStatic
   public open operator fun equals(other: Any?): Boolean {
      return other is UByte && arg0 == (other as UByte).unbox_impl/* $VF was: unbox-impl */()
   }

   @JvmStatic
   fun `equals-impl0`(p1: Byte, p2: Byte): Boolean {
      p1 == p2
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun compareTo(other: ULong): Int {
      return java.lang.Long.compareUnsigned(ULong.constructor_impl/* $VF was: constructor-impl */((long)arg0 and 255L), other)
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun plus(other: ULong): ULong {
      return ULong.constructor_impl/* $VF was: constructor-impl */(ULong.constructor_impl/* $VF was: constructor-impl */((long)arg0 and 255L) + other)
   }

   @InlineOnly
   @JvmStatic
   public inline fun toInt(): Int {
      return arg0 and 255
   }

   @JvmStatic
   public open fun toString(): String {
      return java.lang.String.valueOf(arg0 and 255)
   }

   @InlineOnly
   @JvmStatic
   public inline fun mod(other: UShort): UShort {
      return UShort.constructor_impl/* $VF was: constructor-impl */(
         (short)Integer.remainderUnsigned(
            UInt.constructor_impl/* $VF was: constructor-impl */(arg0 and 255), UInt.constructor_impl/* $VF was: constructor-impl */(other and 65535)
         )
      )
   }

   // $VF: Compiled from UByte.kt
   public companion object {
      public const val MAX_VALUE: UByte = 255u
      public const val MIN_VALUE: UByte = 0u
      public const val SIZE_BITS: Int = 8
      public const val SIZE_BYTES: Int = 1
   }
}
