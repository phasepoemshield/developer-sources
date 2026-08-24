@file:JvmMultifileClass
@file:JvmName("UArraysKt")

package kotlin.collections.unsigned

import java.math.BigDecimal
import java.math.BigInteger
import java.util.RandomAccess
import kotlin.internal.InlineOnly

// $VF: Compiled from _UArraysJvm.kt
@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun UShortArray.elementAt(index: Int): UShort {
   return UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$elementAt_u2dnggk6HY`, index)
}

open fun UArraysKt___UArraysJvmKt() {
}

@ExperimentalUnsignedTypes
@OverloadResolutionByLambdaReturnType
@JvmName(name = "sumOfBigInteger")
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun ULongArray.sumOf(selector: (ULong) -> BigInteger): BigInteger {
   var var10000: BigInteger = BigInteger.valueOf(0L)
   var sum: BigInteger = var10000
   var var3: Int = 0

   for (var4 in size..var3) {
      var10000 = sum.add(
         selector(ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$sumOf_u2dMShoTSo`, var3))) as BigInteger
      )
      sum = var10000
   }

   return sum
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public fun UIntArray.asList(): List<UInt> {
   return    // $VF: Compiled from _UArraysJvm.kt
object : AbstractList<UInt>, RandomAccess {
      public open val size: Int
         public open get() {
            return size
         }


      public open operator fun get(index: Int): UInt {
         return UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */($this$asList_u2d_u2dajY_u2d9A, index)
      }

      public open operator fun contains(element: UInt): Boolean {
         return UIntArray.contains_WZ4Q5Ns/* $VF was: contains-WZ4Q5Ns */($this$asList_u2d_u2dajY_u2d9A, element)
      }

      public open fun lastIndexOf(element: UInt): Int {
         return ArraysKt.lastIndexOf($this$asList_u2d_u2dajY_u2d9A, element)
      }

      public override fun isEmpty(): Boolean {
         return UIntArray.isEmpty_impl/* $VF was: isEmpty-impl */($this$asList_u2d_u2dajY_u2d9A)
      }

      public open fun indexOf(element: UInt): Int {
         return ArraysKt.indexOf($this$asList_u2d_u2dajY_u2d9A, element)
      }
   }
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
@JvmName(name = "sumOfBigInteger")
public inline fun UByteArray.sumOf(selector: (UByte) -> BigInteger): BigInteger {
   var var10000: BigInteger = BigInteger.valueOf(0L)
   var sum: BigInteger = var10000
   var var3: Int = 0

   for (var4 in size..var3) {
      var10000 = sum.add(
         selector(UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$sumOf_u2dJOV_ifY`, var3))) as BigInteger
      )
      sum = var10000
   }

   return sum
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public fun UByteArray.asList(): List<UByte> {
   return    // $VF: Compiled from _UArraysJvm.kt
object : AbstractList<UByte>, RandomAccess {
      public open operator fun get(index: Int): UByte {
         return UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */($this$asList_u2dGBYM_sE, index)
      }

      public open fun lastIndexOf(element: UByte): Int {
         return ArraysKt.lastIndexOf($this$asList_u2dGBYM_sE, element)
      }

      public open fun indexOf(element: UByte): Int {
         return ArraysKt.indexOf($this$asList_u2dGBYM_sE, element)
      }

      public override fun isEmpty(): Boolean {
         return UByteArray.isEmpty_impl/* $VF was: isEmpty-impl */($this$asList_u2dGBYM_sE)
      }

      public open operator fun contains(element: UByte): Boolean {
         return UByteArray.contains_7apg3OU/* $VF was: contains-7apg3OU */($this$asList_u2dGBYM_sE, element)
      }

      public open val size: Int
         public open get() {
            return size
         }

   }
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public fun UShortArray.asList(): List<UShort> {
   return    // $VF: Compiled from _UArraysJvm.kt
object : AbstractList<UShort>, RandomAccess {
      public open fun indexOf(element: UShort): Int {
         return ArraysKt.indexOf($this$asList_u2drL5Bavg, element)
      }

      public open operator fun contains(element: UShort): Boolean {
         return UShortArray.contains_xj2QHRw/* $VF was: contains-xj2QHRw */($this$asList_u2drL5Bavg, element)
      }

      public open val size: Int
         public open get() {
            return size
         }


      public override fun isEmpty(): Boolean {
         return UShortArray.isEmpty_impl/* $VF was: isEmpty-impl */($this$asList_u2drL5Bavg)
      }

      public open operator fun get(index: Int): UShort {
         return UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */($this$asList_u2drL5Bavg, index)
      }

      public open fun lastIndexOf(element: UShort): Int {
         return ArraysKt.lastIndexOf($this$asList_u2drL5Bavg, element)
      }
   }
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public fun ULongArray.asList(): List<ULong> {
   return    // $VF: Compiled from _UArraysJvm.kt
object : AbstractList<ULong>, RandomAccess {
      public open val size: Int
         public open get() {
            return size
         }


      public open fun lastIndexOf(element: ULong): Int {
         return ArraysKt.lastIndexOf($this$asList_u2dQwZRm1k, element)
      }

      public open fun indexOf(element: ULong): Int {
         return ArraysKt.indexOf($this$asList_u2dQwZRm1k, element)
      }

      public open operator fun contains(element: ULong): Boolean {
         return ULongArray.contains_VKZWuLQ/* $VF was: contains-VKZWuLQ */($this$asList_u2dQwZRm1k, element)
      }

      public open operator fun get(index: Int): ULong {
         return ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */($this$asList_u2dQwZRm1k, index)
      }

      public override fun isEmpty(): Boolean {
         return ULongArray.isEmpty_impl/* $VF was: isEmpty-impl */($this$asList_u2dQwZRm1k)
      }
   }
}

@SinceKotlin(version = "1.3")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun UIntArray.elementAt(index: Int): UInt {
   return UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$elementAt_u2dqFRl0hI`, index)
}

@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
@InlineOnly
@ExperimentalUnsignedTypes
@JvmName(name = "sumOfBigDecimal")
public inline fun UByteArray.sumOf(selector: (UByte) -> BigDecimal): BigDecimal {
   var var10000: BigDecimal = BigDecimal.valueOf(0L)
   var sum: BigDecimal = var10000
   var var3: Int = 0

   for (var4 in size..var3) {
      var10000 = sum.add(
         selector(UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$sumOf_u2dJOV_ifY`, var3))) as BigDecimal
      )
      sum = var10000
   }

   return sum
}

@InlineOnly
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public inline fun UByteArray.elementAt(index: Int): UByte {
   return UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$elementAt_u2dPpDY95g`, index)
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public fun ULongArray.binarySearch(element: ULong, fromIndex: Int = ..., toIndex: Int = ...): Int {
   AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(fromIndex, toIndex, size)
   val signedElement: Long = element
   var low: Int = fromIndex
   var high: Int = toIndex - 1

   while (low <= high) {
      val mid: Int = low + high ushr 1
      val cmp: Int = UnsignedKt.ulongCompare(`$this$binarySearch_u2dK6DWlUc`[low + high ushr 1], signedElement)
      if (cmp < 0) {
         low = mid + 1
      } else {
         if (cmp <= 0) {
            return mid
         }

         high = mid - 1
      }
   }

   return -(low + 1)
}

@JvmName(name = "sumOfBigDecimal")
@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
@OverloadResolutionByLambdaReturnType
@InlineOnly
public inline fun UShortArray.sumOf(selector: (UShort) -> BigDecimal): BigDecimal {
   var var10000: BigDecimal = BigDecimal.valueOf(0L)
   var sum: BigDecimal = var10000
   var var3: Int = 0

   for (var4 in size..var3) {
      var10000 = sum.add(
         selector(UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$sumOf_u2dxTcfx_M`, var3))) as BigDecimal
      )
      sum = var10000
   }

   return sum
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public inline fun ULongArray.elementAt(index: Int): ULong {
   return ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$elementAt_u2dr7IrZao`, index)
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public fun UShortArray.binarySearch(element: UShort, fromIndex: Int = ..., toIndex: Int = ...): Int {
   AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(fromIndex, toIndex, size)
   val signedElement: Int = element and '\uffff'
   var low: Int = fromIndex
   var high: Int = toIndex + -1

   while (low <= high) {
      val mid: Int = low + high ushr 1
      val cmp: Int = UnsignedKt.uintCompare(`$this$binarySearch_u2dEtDCXyQ`[low + high ushr 1], signedElement)
      if (cmp < 0) {
         low = mid + 1
      } else {
         if (cmp <= 0) {
            return mid
         }

         high = mid - 1
      }
   }

   return -(low + 1)
}

@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
@InlineOnly
@JvmName(name = "sumOfBigDecimal")
@OverloadResolutionByLambdaReturnType
public inline fun UIntArray.sumOf(selector: (UInt) -> BigDecimal): BigDecimal {
   var var10000: BigDecimal = BigDecimal.valueOf(0L)
   var sum: BigDecimal = var10000
   var var3: Int = 0

   for (var4 in size..var3) {
      var10000 = sum.add(
         selector(UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$sumOf_u2djgv0xPQ`, var3))) as BigDecimal
      )
      sum = var10000
   }

   return sum
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public fun UByteArray.binarySearch(element: UByte, fromIndex: Int = ..., toIndex: Int = ...): Int {
   AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(fromIndex, toIndex, size)
   val signedElement: Int = element and 255
   var low: Int = fromIndex
   var high: Int = toIndex + -1

   while (low <= high) {
      val mid: Int = low + high ushr 1
      val cmp: Int = UnsignedKt.uintCompare(`$this$binarySearch_u2dWpHrYlw`[low + high ushr 1], signedElement)
      if (cmp < 0) {
         low = mid + 1
      } else {
         if (cmp <= 0) {
            return mid
         }

         high = mid - 1
      }
   }

   return -(low + 1)
}

@JvmName(name = "sumOfBigInteger")
@OverloadResolutionByLambdaReturnType
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun UShortArray.sumOf(selector: (UShort) -> BigInteger): BigInteger {
   var var10000: BigInteger = BigInteger.valueOf(0L)
   var sum: BigInteger = var10000
   var var3: Int = 0

   for (var4 in size..var3) {
      var10000 = sum.add(
         selector(UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$sumOf_u2dxTcfx_M`, var3))) as BigInteger
      )
      sum = var10000
   }

   return sum
}

@InlineOnly
@SinceKotlin(version = "1.4")
@JvmName(name = "sumOfBigInteger")
@ExperimentalUnsignedTypes
@OverloadResolutionByLambdaReturnType
public inline fun UIntArray.sumOf(selector: (UInt) -> BigInteger): BigInteger {
   var var10000: BigInteger = BigInteger.valueOf(0L)
   var sum: BigInteger = var10000
   var var3: Int = 0

   for (var4 in size..var3) {
      var10000 = sum.add(
         selector(UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$sumOf_u2djgv0xPQ`, var3))) as BigInteger
      )
      sum = var10000
   }

   return sum
}

@ExperimentalUnsignedTypes
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@InlineOnly
@JvmName(name = "sumOfBigDecimal")
public inline fun ULongArray.sumOf(selector: (ULong) -> BigDecimal): BigDecimal {
   var var10000: BigDecimal = BigDecimal.valueOf(0L)
   var sum: BigDecimal = var10000
   var var3: Int = 0

   for (var4 in size..var3) {
      var10000 = sum.add(
         selector(ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$sumOf_u2dMShoTSo`, var3))) as BigDecimal
      )
      sum = var10000
   }

   return sum
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public fun UIntArray.binarySearch(element: UInt, fromIndex: Int = ..., toIndex: Int = ...): Int {
   AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(fromIndex, toIndex, size)
   val signedElement: Int = element
   var low: Int = fromIndex
   var high: Int = toIndex + -1

   while (low <= high) {
      val mid: Int = low + high ushr 1
      val cmp: Int = UnsignedKt.uintCompare(`$this$binarySearch_u2d2fe2U9s`[low + high ushr 1], signedElement)
      if (cmp < 0) {
         low = mid + 1
      } else {
         if (cmp <= 0) {
            return mid
         }

         high = mid - 1
      }
   }

   return -(low + 1)
}
