package kotlin

import kotlin.internal.InlineOnly
import kotlin.internal.IntrinsicConstEvaluation

// $VF: Compiled from UInt.kt
@JvmInline
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@SinceKotlin(version = "1.5")
public value class UInt : java.lang.Comparable<UInt> {
   @PublishedApi
   internal final val data: Int

   @InlineOnly
   @JvmStatic
   public inline operator fun rangeTo(other: UInt): UIntRange {
      return UIntRange(arg0, other, null)
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun plus(other: ULong): ULong {
      return ULong.constructor_impl/* $VF was: constructor-impl */(ULong.constructor_impl/* $VF was: constructor-impl */((long)arg0 and 4294967295L) + other)
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun div(other: UShort): UInt {
      return Integer.divideUnsigned(arg0, constructor_impl/* $VF was: constructor-impl */(other and 65535))
   }

   @InlineOnly
   @JvmStatic
   public inline fun toInt(): Int {
      return arg0
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun plus(other: UByte): UInt {
      return constructor_impl/* $VF was: constructor-impl */(arg0 + constructor_impl/* $VF was: constructor-impl */(other and 255))
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun times(other: ULong): ULong {
      return ULong.constructor_impl/* $VF was: constructor-impl */(ULong.constructor_impl/* $VF was: constructor-impl */((long)arg0 and 4294967295L) * other)
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun div(other: UInt): UInt {
      return UnsignedKt.uintDivide_J1ME1BU/* $VF was: uintDivide-J1ME1BU */(arg0, other)
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun minus(other: UShort): UInt {
      return constructor_impl/* $VF was: constructor-impl */(arg0 - constructor_impl/* $VF was: constructor-impl */(other and 65535))
   }

   @InlineOnly
   @JvmStatic
   public inline fun mod(other: UShort): UShort {
      return UShort.constructor_impl/* $VF was: constructor-impl */(
         (short)Integer.remainderUnsigned(arg0, constructor_impl/* $VF was: constructor-impl */(other and 65535))
      )
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun plus(other: UInt): UInt {
      return constructor_impl/* $VF was: constructor-impl */(arg0 + other)
   }

   @InlineOnly
   @JvmStatic
   public inline infix fun and(other: UInt): UInt {
      return constructor_impl/* $VF was: constructor-impl */(arg0 and other)
   }

   @InlineOnly
   @JvmStatic
   public inline infix fun shl(bitCount: Int): UInt {
      return constructor_impl/* $VF was: constructor-impl */(arg0 shl bitCount)
   }

   @PublishedApi
   @IntrinsicConstEvaluation
   @JvmStatic
   fun `constructor-impl`(data: Int): Int {
      data
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun minus(other: ULong): ULong {
      return ULong.constructor_impl/* $VF was: constructor-impl */(ULong.constructor_impl/* $VF was: constructor-impl */((long)arg0 and 4294967295L) - other)
   }

   @JvmStatic
   public open fun hashCode(): Int {
      return Integer.hashCode(arg0)
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun times(other: UByte): UInt {
      return constructor_impl/* $VF was: constructor-impl */(arg0 * constructor_impl/* $VF was: constructor-impl */(other and 255))
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun compareTo(other: UShort): Int {
      return Integer.compareUnsigned(arg0, constructor_impl/* $VF was: constructor-impl */(other and 65535))
   }

   @InlineOnly
   @JvmStatic
   public inline fun toFloat(): Float {
      return (float)UnsignedKt.uintToDouble(arg0)
   }

   @InlineOnly
   fun `compareTo-WZ4Q5Ns`(other: Int): Int {
      UnsignedKt.uintCompare(this.unbox_impl/* $VF was: unbox-impl */(), other)
   }

   @InlineOnly
   @JvmStatic
   public inline fun mod(other: UByte): UByte {
      return UByte.constructor_impl/* $VF was: constructor-impl */(
         (byte)Integer.remainderUnsigned(arg0, constructor_impl/* $VF was: constructor-impl */(other and 255))
      )
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun inc(): UInt {
      return constructor_impl/* $VF was: constructor-impl */(arg0 + 1)
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun times(other: UInt): UInt {
      return constructor_impl/* $VF was: constructor-impl */(arg0 * other)
   }

   @InlineOnly
   @JvmStatic
   public inline fun floorDiv(other: UByte): UInt {
      return Integer.divideUnsigned(arg0, constructor_impl/* $VF was: constructor-impl */(other and 255))
   }

   @InlineOnly
   @JvmStatic
   public inline fun toUByte(): UByte {
      return UByte.constructor_impl/* $VF was: constructor-impl */((byte)arg0)
   }

   @InlineOnly
   @JvmStatic
   public inline fun inv(): UInt {
      return constructor_impl/* $VF was: constructor-impl */(arg0.inv())
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun compareTo(other: ULong): Int {
      return java.lang.Long.compareUnsigned(ULong.constructor_impl/* $VF was: constructor-impl */((long)arg0 and 4294967295L), other)
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun plus(other: UShort): UInt {
      return constructor_impl/* $VF was: constructor-impl */(arg0 + constructor_impl/* $VF was: constructor-impl */(other and 65535))
   }

   override fun toString(): java.lang.String {
      toString_impl/* $VF was: toString-impl */(this.data)
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun dec(): UInt {
      return constructor_impl/* $VF was: constructor-impl */(arg0 + -1)
   }

   @InlineOnly
   @JvmStatic
   public inline fun toLong(): Long {
      return arg0 and 4294967295L
   }

   @InlineOnly
   @JvmStatic
   public inline fun floorDiv(other: UShort): UInt {
      return Integer.divideUnsigned(arg0, constructor_impl/* $VF was: constructor-impl */(other and 65535))
   }

   @InlineOnly
   @JvmStatic
   public inline fun toByte(): Byte {
      return (byte)arg0
   }

   @InlineOnly
   @JvmStatic
   public inline fun mod(other: ULong): ULong {
      return java.lang.Long.remainderUnsigned(ULong.constructor_impl/* $VF was: constructor-impl */((long)arg0 and 4294967295L), other)
   }

   @InlineOnly
   @JvmStatic
   public inline fun toDouble(): Double {
      return UnsignedKt.uintToDouble(arg0)
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun compareTo(other: UByte): Int {
      return Integer.compareUnsigned(arg0, constructor_impl/* $VF was: constructor-impl */(other and 255))
   }

   @InlineOnly
   @JvmStatic
   public inline infix fun xor(other: UInt): UInt {
      return constructor_impl/* $VF was: constructor-impl */(arg0 xor other)
   }

   @InlineOnly
   @JvmStatic
   public open inline operator fun compareTo(other: UInt): Int {
      return UnsignedKt.uintCompare(arg0, other)
   }

   @WasExperimental(markerClass = [ExperimentalStdlibApi::class])
   @SinceKotlin(version = "1.9")
   @InlineOnly
   @JvmStatic
   public inline operator fun rangeUntil(other: UInt): UIntRange {
      return URangesKt.until_J1ME1BU/* $VF was: until-J1ME1BU */(arg0, other)
   }

   @InlineOnly
   @JvmStatic
   public inline fun floorDiv(other: ULong): ULong {
      return java.lang.Long.divideUnsigned(ULong.constructor_impl/* $VF was: constructor-impl */((long)arg0 and 4294967295L), other)
   }

   @InlineOnly
   @JvmStatic
   public inline fun toUShort(): UShort {
      return UShort.constructor_impl/* $VF was: constructor-impl */((short)arg0)
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun rem(other: UInt): UInt {
      return UnsignedKt.uintRemainder_J1ME1BU/* $VF was: uintRemainder-J1ME1BU */(arg0, other)
   }

   override fun equals(other: Any): Boolean {
      equals_impl/* $VF was: equals-impl */(this.data, other)
   }

   @InlineOnly
   @JvmStatic
   public inline fun mod(other: UInt): UInt {
      return Integer.remainderUnsigned(arg0, other)
   }

   @InlineOnly
   @JvmStatic
   public inline infix fun shr(bitCount: Int): UInt {
      return constructor_impl/* $VF was: constructor-impl */(arg0 ushr bitCount)
   }

   @InlineOnly
   @JvmStatic
   public inline fun toUInt(): UInt {
      return arg0
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun times(other: UShort): UInt {
      return constructor_impl/* $VF was: constructor-impl */(arg0 * constructor_impl/* $VF was: constructor-impl */(other and 65535))
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun div(other: ULong): ULong {
      return java.lang.Long.divideUnsigned(ULong.constructor_impl/* $VF was: constructor-impl */((long)arg0 and 4294967295L), other)
   }

   @InlineOnly
   @JvmStatic
   public inline fun toShort(): Short {
      return (short)arg0
   }

   @InlineOnly
   @JvmStatic
   public inline fun toULong(): ULong {
      return ULong.constructor_impl/* $VF was: constructor-impl */((long)arg0 and 4294967295L)
   }

   @JvmStatic
   public open fun toString(): String {
      return java.lang.String.valueOf((long)arg0 and 4294967295L)
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun rem(other: UShort): UInt {
      return Integer.remainderUnsigned(arg0, constructor_impl/* $VF was: constructor-impl */(other and 65535))
   }

   override fun hashCode(): Int {
      hashCode_impl/* $VF was: hashCode-impl */(this.data)
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun div(other: UByte): UInt {
      return Integer.divideUnsigned(arg0, constructor_impl/* $VF was: constructor-impl */(other and 255))
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun minus(other: UByte): UInt {
      return constructor_impl/* $VF was: constructor-impl */(arg0 - constructor_impl/* $VF was: constructor-impl */(other and 255))
   }

   @InlineOnly
   @JvmStatic
   public inline fun floorDiv(other: UInt): UInt {
      return Integer.divideUnsigned(arg0, other)
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun rem(other: ULong): ULong {
      return java.lang.Long.remainderUnsigned(ULong.constructor_impl/* $VF was: constructor-impl */((long)arg0 and 4294967295L), other)
   }

   @JvmStatic
   public open operator fun equals(other: Any?): Boolean {
      return other is UInt && arg0 == (other as UInt).unbox_impl/* $VF was: unbox-impl */()
   }

   @InlineOnly
   @JvmStatic
   public inline infix fun or(other: UInt): UInt {
      return constructor_impl/* $VF was: constructor-impl */(arg0 or other)
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun rem(other: UByte): UInt {
      return Integer.remainderUnsigned(arg0, constructor_impl/* $VF was: constructor-impl */(other and 255))
   }

   @JvmStatic
   fun `equals-impl0`(p1: Int, p2: Int): Boolean {
      p1 == p2
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun minus(other: UInt): UInt {
      return constructor_impl/* $VF was: constructor-impl */(arg0 - other)
   }

   // $VF: Compiled from UInt.kt
   public companion object {
      public const val MAX_VALUE: UInt = 4294967295u
      public const val MIN_VALUE: UInt = 0u
      public const val SIZE_BITS: Int = 32
      public const val SIZE_BYTES: Int = 4
   }
}
