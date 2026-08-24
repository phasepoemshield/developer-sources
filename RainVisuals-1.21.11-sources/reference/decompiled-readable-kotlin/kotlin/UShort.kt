package kotlin

import kotlin.internal.InlineOnly
import kotlin.internal.IntrinsicConstEvaluation
import kotlin.jvm.internal.Intrinsics

// $VF: Compiled from UShort.kt
@JvmInline
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@SinceKotlin(version = "1.5")
public value class UShort : java.lang.Comparable<UShort> {
   @PublishedApi
   internal final val data: Short

   @InlineOnly
   @JvmStatic
   public inline fun toDouble(): Double {
      return arg0 and 65535
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun div(other: ULong): ULong {
      return java.lang.Long.divideUnsigned(ULong.constructor_impl/* $VF was: constructor-impl */((long)arg0 and 65535L), other)
   }

   @InlineOnly
   @JvmStatic
   public inline fun floorDiv(other: UShort): UInt {
      return Integer.divideUnsigned(
         UInt.constructor_impl/* $VF was: constructor-impl */(arg0 and 65535), UInt.constructor_impl/* $VF was: constructor-impl */(other and 65535)
      )
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun rem(other: ULong): ULong {
      return java.lang.Long.remainderUnsigned(ULong.constructor_impl/* $VF was: constructor-impl */((long)arg0 and 65535L), other)
   }

   @InlineOnly
   @JvmStatic
   public inline infix fun xor(other: UShort): UShort {
      return constructor_impl/* $VF was: constructor-impl */((short)(arg0 xor other))
   }

   @InlineOnly
   @JvmStatic
   public inline fun toUInt(): UInt {
      return UInt.constructor_impl/* $VF was: constructor-impl */(arg0 and 65535)
   }

   @InlineOnly
   @JvmStatic
   public inline fun toShort(): Short {
      return arg0
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun div(other: UShort): UInt {
      return Integer.divideUnsigned(
         UInt.constructor_impl/* $VF was: constructor-impl */(arg0 and 65535), UInt.constructor_impl/* $VF was: constructor-impl */(other and 65535)
      )
   }

   @JvmStatic
   public open fun toString(): String {
      return java.lang.String.valueOf(arg0 and 65535)
   }

   override fun toString(): java.lang.String {
      toString_impl/* $VF was: toString-impl */(this.data)
   }

   @InlineOnly
   @JvmStatic
   public inline infix fun and(other: UShort): UShort {
      return constructor_impl/* $VF was: constructor-impl */((short)(arg0 and other))
   }

   @JvmStatic
   public open operator fun equals(other: Any?): Boolean {
      return other is UShort && arg0 == (other as UShort).unbox_impl/* $VF was: unbox-impl */()
   }

   @InlineOnly
   @JvmStatic
   public inline fun mod(other: UInt): UInt {
      return Integer.remainderUnsigned(UInt.constructor_impl/* $VF was: constructor-impl */(arg0 and 65535), other)
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun plus(other: ULong): ULong {
      return ULong.constructor_impl/* $VF was: constructor-impl */(ULong.constructor_impl/* $VF was: constructor-impl */((long)arg0 and 65535L) + other)
   }

   @InlineOnly
   @JvmStatic
   public inline fun toByte(): Byte {
      return (byte)arg0
   }

   @InlineOnly
   fun `compareTo-xj2QHRw`(other: Short): Int {
      Intrinsics.compare(this.unbox_impl/* $VF was: unbox-impl */() and 65535, other and 65535)
   }

   @InlineOnly
   @JvmStatic
   public inline fun toUShort(): UShort {
      return arg0
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun times(other: ULong): ULong {
      return ULong.constructor_impl/* $VF was: constructor-impl */(ULong.constructor_impl/* $VF was: constructor-impl */((long)arg0 and 65535L) * other)
   }

   @JvmStatic
   public open fun hashCode(): Int {
      return java.lang.Short.hashCode(arg0)
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun minus(other: ULong): ULong {
      return ULong.constructor_impl/* $VF was: constructor-impl */(ULong.constructor_impl/* $VF was: constructor-impl */((long)arg0 and 65535L) - other)
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun dec(): UShort {
      return constructor_impl/* $VF was: constructor-impl */((short)(arg0 + -1))
   }

   @JvmStatic
   fun `equals-impl0`(p2: Short, p1: Short): Boolean {
      p1 == p2
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun rem(other: UShort): UInt {
      return Integer.remainderUnsigned(
         UInt.constructor_impl/* $VF was: constructor-impl */(arg0 and 65535), UInt.constructor_impl/* $VF was: constructor-impl */(other and 65535)
      )
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun times(other: UShort): UInt {
      return UInt.constructor_impl/* $VF was: constructor-impl */(
         UInt.constructor_impl/* $VF was: constructor-impl */(arg0 and 65535) * UInt.constructor_impl/* $VF was: constructor-impl */(other and 65535)
      )
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun plus(other: UShort): UInt {
      return UInt.constructor_impl/* $VF was: constructor-impl */(
         UInt.constructor_impl/* $VF was: constructor-impl */(arg0 and 65535) + UInt.constructor_impl/* $VF was: constructor-impl */(other and 65535)
      )
   }

   @InlineOnly
   @JvmStatic
   public inline fun floorDiv(other: ULong): ULong {
      return java.lang.Long.divideUnsigned(ULong.constructor_impl/* $VF was: constructor-impl */((long)arg0 and 65535L), other)
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun plus(other: UByte): UInt {
      return UInt.constructor_impl/* $VF was: constructor-impl */(
         UInt.constructor_impl/* $VF was: constructor-impl */(arg0 and 65535) + UInt.constructor_impl/* $VF was: constructor-impl */(other and 255)
      )
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun inc(): UShort {
      return constructor_impl/* $VF was: constructor-impl */((short)(arg0 + 1))
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun rem(other: UInt): UInt {
      return Integer.remainderUnsigned(UInt.constructor_impl/* $VF was: constructor-impl */(arg0 and 65535), other)
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun div(other: UInt): UInt {
      return Integer.divideUnsigned(UInt.constructor_impl/* $VF was: constructor-impl */(arg0 and 65535), other)
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun compareTo(other: ULong): Int {
      return java.lang.Long.compareUnsigned(ULong.constructor_impl/* $VF was: constructor-impl */((long)arg0 and 65535L), other)
   }

   @InlineOnly
   @JvmStatic
   public inline fun inv(): UShort {
      return constructor_impl/* $VF was: constructor-impl */((short)(arg0.inv()))
   }

   override fun hashCode(): Int {
      hashCode_impl/* $VF was: hashCode-impl */(this.data)
   }

   @InlineOnly
   @JvmStatic
   public inline fun toULong(): ULong {
      return ULong.constructor_impl/* $VF was: constructor-impl */((long)arg0 and 65535L)
   }

   @InlineOnly
   @JvmStatic
   public inline fun mod(other: UByte): UByte {
      return UByte.constructor_impl/* $VF was: constructor-impl */(
         (byte)Integer.remainderUnsigned(
            UInt.constructor_impl/* $VF was: constructor-impl */(arg0 and 65535), UInt.constructor_impl/* $VF was: constructor-impl */(other and 255)
         )
      )
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun rem(other: UByte): UInt {
      return Integer.remainderUnsigned(
         UInt.constructor_impl/* $VF was: constructor-impl */(arg0 and 65535), UInt.constructor_impl/* $VF was: constructor-impl */(other and 255)
      )
   }

   @IntrinsicConstEvaluation
   @PublishedApi
   @JvmStatic
   fun `constructor-impl`(data: Short): Short {
      data
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun rangeTo(other: UShort): UIntRange {
      return UIntRange(
         UInt.constructor_impl/* $VF was: constructor-impl */(arg0 and 65535), UInt.constructor_impl/* $VF was: constructor-impl */(other and 65535), null
      )
   }

   @InlineOnly
   @JvmStatic
   public inline fun toLong(): Long {
      return arg0 and 65535L
   }

   override fun equals(other: Any): Boolean {
      equals_impl/* $VF was: equals-impl */(this.data, other)
   }

   @InlineOnly
   @JvmStatic
   public inline fun floorDiv(other: UByte): UInt {
      return Integer.divideUnsigned(
         UInt.constructor_impl/* $VF was: constructor-impl */(arg0 and 65535), UInt.constructor_impl/* $VF was: constructor-impl */(other and 255)
      )
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun div(other: UByte): UInt {
      return Integer.divideUnsigned(
         UInt.constructor_impl/* $VF was: constructor-impl */(arg0 and 65535), UInt.constructor_impl/* $VF was: constructor-impl */(other and 255)
      )
   }

   @InlineOnly
   @JvmStatic
   public inline fun toInt(): Int {
      return arg0 and 65535
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun times(other: UByte): UInt {
      return UInt.constructor_impl/* $VF was: constructor-impl */(
         UInt.constructor_impl/* $VF was: constructor-impl */(arg0 and 65535) * UInt.constructor_impl/* $VF was: constructor-impl */(other and 255)
      )
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun times(other: UInt): UInt {
      return UInt.constructor_impl/* $VF was: constructor-impl */(UInt.constructor_impl/* $VF was: constructor-impl */(arg0 and 65535) * other)
   }

   @InlineOnly
   @JvmStatic
   public open inline operator fun compareTo(other: UShort): Int {
      return Intrinsics.compare(arg0 and 65535, other and 65535)
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun compareTo(other: UInt): Int {
      return Integer.compareUnsigned(UInt.constructor_impl/* $VF was: constructor-impl */(arg0 and 65535), other)
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun minus(other: UInt): UInt {
      return UInt.constructor_impl/* $VF was: constructor-impl */(UInt.constructor_impl/* $VF was: constructor-impl */(arg0 and 65535) - other)
   }

   @InlineOnly
   @JvmStatic
   public inline fun floorDiv(other: UInt): UInt {
      return Integer.divideUnsigned(UInt.constructor_impl/* $VF was: constructor-impl */(arg0 and 65535), other)
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun minus(other: UShort): UInt {
      return UInt.constructor_impl/* $VF was: constructor-impl */(
         UInt.constructor_impl/* $VF was: constructor-impl */(arg0 and 65535) - UInt.constructor_impl/* $VF was: constructor-impl */(other and 65535)
      )
   }

   @InlineOnly
   @JvmStatic
   public inline fun toUByte(): UByte {
      return UByte.constructor_impl/* $VF was: constructor-impl */((byte)arg0)
   }

   @InlineOnly
   @JvmStatic
   public inline fun toFloat(): Float {
      return arg0 and 65535
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun plus(other: UInt): UInt {
      return UInt.constructor_impl/* $VF was: constructor-impl */(UInt.constructor_impl/* $VF was: constructor-impl */(arg0 and 65535) + other)
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun compareTo(other: UByte): Int {
      return Intrinsics.compare(arg0 and 65535, other and 255)
   }

   @InlineOnly
   @JvmStatic
   public inline fun mod(other: UShort): UShort {
      return constructor_impl/* $VF was: constructor-impl */(
         (short)Integer.remainderUnsigned(
            UInt.constructor_impl/* $VF was: constructor-impl */(arg0 and 65535), UInt.constructor_impl/* $VF was: constructor-impl */(other and 65535)
         )
      )
   }

   @InlineOnly
   @JvmStatic
   public inline infix fun or(other: UShort): UShort {
      return constructor_impl/* $VF was: constructor-impl */((short)(arg0 or other))
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun minus(other: UByte): UInt {
      return UInt.constructor_impl/* $VF was: constructor-impl */(
         UInt.constructor_impl/* $VF was: constructor-impl */(arg0 and 65535) - UInt.constructor_impl/* $VF was: constructor-impl */(other and 255)
      )
   }

   @InlineOnly
   @SinceKotlin(version = "1.9")
   @WasExperimental(markerClass = [ExperimentalStdlibApi::class])
   @JvmStatic
   public inline operator fun rangeUntil(other: UShort): UIntRange {
      return URangesKt.until_J1ME1BU/* $VF was: until-J1ME1BU */(
         UInt.constructor_impl/* $VF was: constructor-impl */(arg0 and 65535), UInt.constructor_impl/* $VF was: constructor-impl */(other and 65535)
      )
   }

   @InlineOnly
   @JvmStatic
   public inline fun mod(other: ULong): ULong {
      return java.lang.Long.remainderUnsigned(ULong.constructor_impl/* $VF was: constructor-impl */((long)arg0 and 65535L), other)
   }

   // $VF: Compiled from UShort.kt
   public companion object {
      public const val MAX_VALUE: UShort = 65535u
      public const val MIN_VALUE: UShort = 0u
      public const val SIZE_BITS: Int = 16
      public const val SIZE_BYTES: Int = 2
   }
}
