package kotlin

import kotlin.internal.InlineOnly
import kotlin.internal.IntrinsicConstEvaluation

// $VF: Compiled from ULong.kt
@JvmInline
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@SinceKotlin(version = "1.5")
public value class ULong : java.lang.Comparable<ULong> {
   @PublishedApi
   internal final val data: Long

   @InlineOnly
   @JvmStatic
   public inline fun toByte(): Byte {
      return (byte)arg0
   }

   @InlineOnly
   fun `compareTo-VKZWuLQ`(other: Long): Int {
      UnsignedKt.ulongCompare(this.unbox_impl/* $VF was: unbox-impl */(), other)
   }

   @InlineOnly
   @JvmStatic
   public inline infix fun shl(bitCount: Int): ULong {
      return constructor_impl/* $VF was: constructor-impl */(arg0 shl bitCount)
   }

   @InlineOnly
   @JvmStatic
   public inline fun mod(other: UByte): UByte {
      return UByte.constructor_impl/* $VF was: constructor-impl */(
         (byte)((int)java.lang.Long.remainderUnsigned(arg0, constructor_impl/* $VF was: constructor-impl */((long)other and 255L)))
      )
   }

   @InlineOnly
   @JvmStatic
   public inline fun toULong(): ULong {
      return arg0
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun times(other: UInt): ULong {
      return constructor_impl/* $VF was: constructor-impl */(arg0 * constructor_impl/* $VF was: constructor-impl */((long)other and 4294967295L))
   }

   @InlineOnly
   @JvmStatic
   public inline fun inv(): ULong {
      return constructor_impl/* $VF was: constructor-impl */(arg0.inv())
   }

   @InlineOnly
   @JvmStatic
   public inline fun floorDiv(other: ULong): ULong {
      return java.lang.Long.divideUnsigned(arg0, other)
   }

   override fun equals(other: Any): Boolean {
      equals_impl/* $VF was: equals-impl */(this.data, other)
   }

   @InlineOnly
   @JvmStatic
   public inline fun floorDiv(other: UInt): ULong {
      return java.lang.Long.divideUnsigned(arg0, constructor_impl/* $VF was: constructor-impl */((long)other and 4294967295L))
   }

   @SinceKotlin(version = "1.9")
   @InlineOnly
   @WasExperimental(markerClass = [ExperimentalStdlibApi::class])
   @JvmStatic
   public inline operator fun rangeUntil(other: ULong): ULongRange {
      return URangesKt.until_eb3DHEI/* $VF was: until-eb3DHEI */(arg0, other)
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun compareTo(other: UShort): Int {
      return java.lang.Long.compareUnsigned(arg0, constructor_impl/* $VF was: constructor-impl */((long)other and 65535L))
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun div(other: ULong): ULong {
      return UnsignedKt.ulongDivide_eb3DHEI/* $VF was: ulongDivide-eb3DHEI */(arg0, other)
   }

   @PublishedApi
   @IntrinsicConstEvaluation
   @JvmStatic
   fun `constructor-impl`(data: Long): Long {
      data
   }

   @InlineOnly
   @JvmStatic
   public inline fun toFloat(): Float {
      return (float)UnsignedKt.ulongToDouble(arg0)
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun minus(other: ULong): ULong {
      return constructor_impl/* $VF was: constructor-impl */(arg0 - other)
   }

   @InlineOnly
   @JvmStatic
   public inline fun toShort(): Short {
      return (short)arg0
   }

   @InlineOnly
   @JvmStatic
   public inline fun floorDiv(other: UShort): ULong {
      return java.lang.Long.divideUnsigned(arg0, constructor_impl/* $VF was: constructor-impl */((long)other and 65535L))
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun dec(): ULong {
      return constructor_impl/* $VF was: constructor-impl */(arg0 + -1L)
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun times(other: UByte): ULong {
      return constructor_impl/* $VF was: constructor-impl */(arg0 * constructor_impl/* $VF was: constructor-impl */((long)other and 255L))
   }

   @JvmStatic
   fun `equals-impl0`(p1: Long, p2: Long): Boolean {
      p1 == p2
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun minus(other: UByte): ULong {
      return constructor_impl/* $VF was: constructor-impl */(arg0 - constructor_impl/* $VF was: constructor-impl */((long)other and 255L))
   }

   @JvmStatic
   public open fun hashCode(): Int {
      return java.lang.Long.hashCode(arg0)
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun compareTo(other: UInt): Int {
      return java.lang.Long.compareUnsigned(arg0, constructor_impl/* $VF was: constructor-impl */((long)other and 4294967295L))
   }

   @InlineOnly
   @JvmStatic
   public inline fun toUByte(): UByte {
      return UByte.constructor_impl/* $VF was: constructor-impl */((byte)((int)arg0))
   }

   @InlineOnly
   @JvmStatic
   public inline infix fun shr(bitCount: Int): ULong {
      return constructor_impl/* $VF was: constructor-impl */(arg0 ushr bitCount)
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun plus(other: UByte): ULong {
      return constructor_impl/* $VF was: constructor-impl */(arg0 + constructor_impl/* $VF was: constructor-impl */((long)other and 255L))
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun rem(other: ULong): ULong {
      return UnsignedKt.ulongRemainder_eb3DHEI/* $VF was: ulongRemainder-eb3DHEI */(arg0, other)
   }

   override fun hashCode(): Int {
      hashCode_impl/* $VF was: hashCode-impl */(this.data)
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun compareTo(other: UByte): Int {
      return java.lang.Long.compareUnsigned(arg0, constructor_impl/* $VF was: constructor-impl */((long)other and 255L))
   }

   @JvmStatic
   public open fun toString(): String {
      return UnsignedKt.ulongToString(arg0)
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun div(other: UInt): ULong {
      return java.lang.Long.divideUnsigned(arg0, constructor_impl/* $VF was: constructor-impl */((long)other and 4294967295L))
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun times(other: UShort): ULong {
      return constructor_impl/* $VF was: constructor-impl */(arg0 * constructor_impl/* $VF was: constructor-impl */((long)other and 65535L))
   }

   @InlineOnly
   @JvmStatic
   public open inline operator fun compareTo(other: ULong): Int {
      return UnsignedKt.ulongCompare(arg0, other)
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun div(other: UByte): ULong {
      return java.lang.Long.divideUnsigned(arg0, constructor_impl/* $VF was: constructor-impl */((long)other and 255L))
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun inc(): ULong {
      return constructor_impl/* $VF was: constructor-impl */(arg0 + 1L)
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun plus(other: UShort): ULong {
      return constructor_impl/* $VF was: constructor-impl */(arg0 + constructor_impl/* $VF was: constructor-impl */((long)other and 65535L))
   }

   @InlineOnly
   @JvmStatic
   public inline fun toUShort(): UShort {
      return UShort.constructor_impl/* $VF was: constructor-impl */((short)((int)arg0))
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun plus(other: ULong): ULong {
      return constructor_impl/* $VF was: constructor-impl */(arg0 + other)
   }

   @JvmStatic
   public open operator fun equals(other: Any?): Boolean {
      return other is ULong && arg0 == (other as ULong).unbox_impl/* $VF was: unbox-impl */()
   }

   override fun toString(): java.lang.String {
      toString_impl/* $VF was: toString-impl */(this.data)
   }

   @InlineOnly
   @JvmStatic
   public inline fun mod(other: ULong): ULong {
      return java.lang.Long.remainderUnsigned(arg0, other)
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun rem(other: UByte): ULong {
      return java.lang.Long.remainderUnsigned(arg0, constructor_impl/* $VF was: constructor-impl */((long)other and 255L))
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun minus(other: UInt): ULong {
      return constructor_impl/* $VF was: constructor-impl */(arg0 - constructor_impl/* $VF was: constructor-impl */((long)other and 4294967295L))
   }

   @InlineOnly
   @JvmStatic
   public inline fun toDouble(): Double {
      return UnsignedKt.ulongToDouble(arg0)
   }

   @InlineOnly
   @JvmStatic
   public inline infix fun and(other: ULong): ULong {
      return constructor_impl/* $VF was: constructor-impl */(arg0 and other)
   }

   @InlineOnly
   @JvmStatic
   public inline fun toLong(): Long {
      return arg0
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun plus(other: UInt): ULong {
      return constructor_impl/* $VF was: constructor-impl */(arg0 + constructor_impl/* $VF was: constructor-impl */((long)other and 4294967295L))
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun minus(other: UShort): ULong {
      return constructor_impl/* $VF was: constructor-impl */(arg0 - constructor_impl/* $VF was: constructor-impl */((long)other and 65535L))
   }

   @InlineOnly
   @JvmStatic
   public inline fun toInt(): Int {
      return (int)arg0
   }

   @InlineOnly
   @JvmStatic
   public inline fun mod(other: UShort): UShort {
      return UShort.constructor_impl/* $VF was: constructor-impl */(
         (short)((int)java.lang.Long.remainderUnsigned(arg0, constructor_impl/* $VF was: constructor-impl */((long)other and 65535L)))
      )
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun rem(other: UShort): ULong {
      return java.lang.Long.remainderUnsigned(arg0, constructor_impl/* $VF was: constructor-impl */((long)other and 65535L))
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun times(other: ULong): ULong {
      return constructor_impl/* $VF was: constructor-impl */(arg0 * other)
   }

   @InlineOnly
   @JvmStatic
   public inline infix fun or(other: ULong): ULong {
      return constructor_impl/* $VF was: constructor-impl */(arg0 or other)
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun rangeTo(other: ULong): ULongRange {
      return ULongRange(arg0, other, null)
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun rem(other: UInt): ULong {
      return java.lang.Long.remainderUnsigned(arg0, constructor_impl/* $VF was: constructor-impl */((long)other and 4294967295L))
   }

   @InlineOnly
   @JvmStatic
   public inline fun toUInt(): UInt {
      return UInt.constructor_impl/* $VF was: constructor-impl */((int)arg0)
   }

   @InlineOnly
   @JvmStatic
   public inline operator fun div(other: UShort): ULong {
      return java.lang.Long.divideUnsigned(arg0, constructor_impl/* $VF was: constructor-impl */((long)other and 65535L))
   }

   @InlineOnly
   @JvmStatic
   public inline infix fun xor(other: ULong): ULong {
      return constructor_impl/* $VF was: constructor-impl */(arg0 xor other)
   }

   @InlineOnly
   @JvmStatic
   public inline fun floorDiv(other: UByte): ULong {
      return java.lang.Long.divideUnsigned(arg0, constructor_impl/* $VF was: constructor-impl */((long)other and 255L))
   }

   @InlineOnly
   @JvmStatic
   public inline fun mod(other: UInt): UInt {
      return UInt.constructor_impl/* $VF was: constructor-impl */(
         (int)java.lang.Long.remainderUnsigned(arg0, constructor_impl/* $VF was: constructor-impl */((long)other and 4294967295L))
      )
   }

   // $VF: Compiled from ULong.kt
   public companion object {
      public const val MAX_VALUE: ULong = 18446744073709551615uL
      public const val MIN_VALUE: ULong = 0uL
      public const val SIZE_BITS: Int = 64
      public const val SIZE_BYTES: Int = 8
   }
}
