@file:JvmMultifileClass
@file:JvmName("UArraysKt")

package kotlin.collections.unsigned

import java.util.ArrayList
import java.util.Arrays
import java.util.Comparator
import java.util.LinkedHashMap
import java.util.NoSuchElementException
import kotlin.internal.InlineOnly
import kotlin.internal.PlatformImplementationsKt
import kotlin.jvm.internal.Intrinsics
import kotlin.random.Random

// $VF: Compiled from _UArrays.kt
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public fun UIntArray.sliceArray(indices: IntRange): UIntArray {
   return UIntArray.constructor_impl/* $VF was: constructor-impl */(ArraysKt.sliceArray((int[])`$this$sliceArray_u2dtAntMlw`, indices))
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public inline fun <C : MutableCollection<in ULong>> ULongArray.filterIndexedTo(destination: Any, predicate: (Int, ULong) -> Boolean): Any {
   val var3: LongArray = `$this$filterIndexedTo_u2dpe2Q0Dw`
   val var4: Int = 0
   var var5: Int = 0

   for (var6 in size..var5) {
      val var7: Long = ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(var3, var5)
      if (predicate(var4++, ULong.box_impl/* $VF was: box-impl */(var7)) as java.lang.Boolean) {
         destination.add(ULong.box_impl/* $VF was: box-impl */(var7))
      }
   }

   return (C)destination
}

@SinceKotlin(version = "1.3")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun UByteArray.first(): UByte {
   return UByte.constructor_impl/* $VF was: constructor-impl */(ArraysKt.first(`$this$first_u2dGBYM_sE`))
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public inline fun UByteArray.find(predicate: (UByte) -> Boolean): UByte? {
   val var2: ByteArray = `$this$find_u2dJOV_ifY`
   var var3: Int = 0
   val var4: Int = size

   var var10000: UByte
   while (true) {
      if (var3 >= var4) {
         var10000 = null
         break
      }

      val var5: Byte = UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(var2, var3)
      if (predicate(UByte.box_impl/* $VF was: box-impl */(var5)) as java.lang.Boolean) {
         var10000 = UByte.box_impl/* $VF was: box-impl */(var5)
         break
      }

      var3++
   }

   return var10000
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun UByteArray.takeWhile(predicate: (UByte) -> Boolean): List<UByte> {
   val list: ArrayList = ArrayList()
   var var3: Int = 0

   for (var4 in size..var3) {
      val item: Byte = UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$takeWhile_u2dJOV_ifY`, var3)
      if (!predicate(UByte.box_impl/* $VF was: box-impl */(item)) as java.lang.Boolean) {
         break
      }

      list.add(UByte.box_impl/* $VF was: box-impl */(item))
   }

   return list
}

@InlineOnly
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public inline fun UByteArray.none(): Boolean {
   return UByteArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$none_u2dGBYM_sE`)
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public inline fun ShortArray.asUShortArray(): UShortArray {
   return UShortArray.constructor_impl/* $VF was: constructor-impl */(`$this$asUShortArray`)
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun ULongArray.toLongArray(): LongArray {
   val var10000: LongArray = Arrays.copyOf(`$this$toLongArray_u2dQwZRm1k`, `$this$toLongArray_u2dQwZRm1k`.length)
   return var10000
}

@InlineOnly
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public inline fun UIntArray.filterNot(predicate: (UInt) -> Boolean): List<UInt> {
   val var2: IntArray = `$this$filterNot_u2djgv0xPQ`
   val var3: java.util.Collection = ArrayList()
   var var4: Int = 0

   for (var5 in size..var4) {
      val var6: Int = UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(var2, var4)
      if (!predicate(UInt.box_impl/* $VF was: box-impl */(var6)) as java.lang.Boolean) {
         var3.add(UInt.box_impl/* $VF was: box-impl */(var6))
      }
   }

   return var3 as MutableList<UInt>
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
@InlineOnly
public inline operator fun ULongArray.component5(): ULong {
   return ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$component5_u2dQwZRm1k`, 4)
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun LongArray.toULongArray(): ULongArray {
   val var10000: LongArray = Arrays.copyOf(`$this$toULongArray`, `$this$toULongArray`.length)
   return ULongArray.constructor_impl/* $VF was: constructor-impl */(var10000)
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public inline fun UShortArray.reduceRightOrNull(operation: (UShort, UShort) -> UShort): UShort? {
   var index: Int = ArraysKt.getLastIndex(`$this$reduceRightOrNull_u2dxzaTVY8`)
   if (index < 0) {
      return null
   } else {
      var var6: Short = UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$reduceRightOrNull_u2dxzaTVY8`, index--)

      while (index >= 0) {
         var6 = (operation(
               UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$reduceRightOrNull_u2dxzaTVY8`, index--)),
               UShort.box_impl/* $VF was: box-impl */(var6)
            ) as UShort)
            .unbox_impl/* $VF was: unbox-impl */()
         }

      return UShort.box_impl/* $VF was: box-impl */(var6)
   }
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public inline operator fun UShortArray.component2(): UShort {
   return UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$component2_u2drL5Bavg`, 1)
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
@InlineOnly
public inline operator fun UByteArray.component3(): UByte {
   return UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$component3_u2dGBYM_sE`, 2)
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public fun UByteArray.toTypedArray(): Array<UByte> {
   var var1: Int = 0
   val var2: Int = size
   val var3: Array<UByte> = arrayOfNulls(var2)

   while (var1 < var2) {
      var3[var1] = UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$toTypedArray_u2dGBYM_sE`, var1))
      var1++
   }

   return var3
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun UIntArray.forEachIndexed(action: (Int, UInt) -> Unit) {
   var index: Int = 0
   var var3: Int = 0

   for (var4 in size..var3) {
      action(index++, UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$forEachIndexed_u2dWyvcNBI`, var3)))
   }
}

@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
@InlineOnly
@OverloadResolutionByLambdaReturnType
public inline fun UIntArray.minOfOrNull(selector: (UInt) -> Double): Double? {
   if (UIntArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$minOfOrNull_u2djgv0xPQ`)) {
      return null
   } else {
      var minValue: Double = (selector(UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$minOfOrNull_u2djgv0xPQ`, 0))) as java.lang.Number)
         .doubleValue()
         val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfOrNull_u2djgv0xPQ`)).iterator()

      while (var4.hasNext()) {
         minValue = Math.min(
            minValue,
            (selector(UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$minOfOrNull_u2djgv0xPQ`, var4.nextInt()))) as java.lang.Number)
               .doubleValue()
         )
      }

      return minValue
   }
}

@InlineOnly
@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
public inline fun ULongArray.reverse(fromIndex: Int, toIndex: Int) {
   ArraysKt.reverse(`$this$reverse_u2d_u2dnroSd4`, fromIndex, toIndex)
}

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun UShortArray.maxOfOrNull(selector: (UShort) -> Double): Double? {
   if (UShortArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$maxOfOrNull_u2dxTcfx_M`)) {
      return null
   } else {
      var maxValue: Double = (selector(
            UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$maxOfOrNull_u2dxTcfx_M`, 0))
         ) as java.lang.Number)
         .doubleValue()
         val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfOrNull_u2dxTcfx_M`)).iterator()

      while (var4.hasNext()) {
         maxValue = Math.max(
            maxValue,
            (selector(UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$maxOfOrNull_u2dxTcfx_M`, var4.nextInt()))) as java.lang.Number)
               .doubleValue()
         )
      }

      return maxValue
   }
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun ULongArray.forEachIndexed(action: (Int, ULong) -> Unit) {
   var index: Int = 0
   var var3: Int = 0

   for (var4 in size..var3) {
      action(index++, ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$forEachIndexed_u2ds8dVfGU`, var3)))
   }
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun UByteArray.lastIndexOf(element: UByte): Int {
   return ArraysKt.lastIndexOf(`$this$lastIndexOf_u2dgMuBH34`, element)
}

@InlineOnly
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public inline fun <R> ULongArray.fold(initial: Any, operation: (Any, ULong) -> Any): Any {
   var accumulator: Any = initial
   var var4: Int = 0

   for (var5 in size..var4) {
      accumulator = operation(
         accumulator, ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$fold_u2dA8wKCXQ`, var4))
      )
   }

   return (R)accumulator
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public inline fun ULongArray.find(predicate: (ULong) -> Boolean): ULong? {
   val var2: LongArray = `$this$find_u2dMShoTSo`
   var var3: Int = 0
   val var4: Int = size

   var var10000: ULong
   while (true) {
      if (var3 >= var4) {
         var10000 = null
         break
      }

      val var5: Long = ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(var2, var3)
      if (predicate(ULong.box_impl/* $VF was: box-impl */(var5)) as java.lang.Boolean) {
         var10000 = ULong.box_impl/* $VF was: box-impl */(var5)
         break
      }

      var3++
   }

   return var10000
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public inline operator fun UByteArray.component5(): UByte {
   return UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$component5_u2dGBYM_sE`, 4)
}

@SinceKotlin(version = "1.3")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun ULongArray.copyOf(newSize: Int): ULongArray {
   val var10000: LongArray = Arrays.copyOf(`$this$copyOf_u2dr7IrZao`, newSize)
   return ULongArray.constructor_impl/* $VF was: constructor-impl */(var10000)
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public fun ULongArray.drop(n: Int): List<ULong> {
   if (n < 0) {
      throw IllegalArgumentException(("Requested element count $n is less than zero.").toString())
   } else {
      return UArraysKt.takeLast_r7IrZao/* $VF was: takeLast-r7IrZao */(`$this$drop_u2dr7IrZao`, RangesKt.coerceAtLeast(size - n, 0))
   }
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun ULongArray.single(predicate: (ULong) -> Boolean): ULong {
   var single: ULong = null
   var found: Boolean = false
   var var4: Int = 0

   for (var5 in size..var4) {
      val element: Long = ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$single_u2dMShoTSo`, var4)
      if (predicate(ULong.box_impl/* $VF was: box-impl */(element)) as java.lang.Boolean) {
         if (found) {
            throw IllegalArgumentException("Array contains more than one matching element.")
         }

         single = ULong.box_impl/* $VF was: box-impl */(element)
         found = true
      }
   }

   if (!found) {
      throw NoSuchElementException("Array contains no element matching the predicate.")
   } else {
      return single.unbox_impl/* $VF was: unbox-impl */()
   }
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public inline fun <C : MutableCollection<in UInt>> UIntArray.filterIndexedTo(destination: Any, predicate: (Int, UInt) -> Boolean): Any {
   val var3: IntArray = `$this$filterIndexedTo_u2d_u2d6EtJGI`
   val var4: Int = 0
   var var5: Int = 0

   for (var6 in size..var5) {
      val var7: Int = UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(var3, var5)
      if (predicate(var4++, UInt.box_impl/* $VF was: box-impl */(var7)) as java.lang.Boolean) {
         destination.add(UInt.box_impl/* $VF was: box-impl */(var7))
      }
   }

   return (C)destination
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public fun Array<out UShort>.toUShortArray(): UShortArray {
   val var1: Int = `$this$toUShortArray`.length
   var var2: Int = 0
   val var3: ShortArray = ShortArray(var1)

   while (var2 < var1) {
      var3[var2] = `$this$toUShortArray`[var2].unbox_impl/* $VF was: unbox-impl */()
      var2++
   }

   return UShortArray.constructor_impl/* $VF was: constructor-impl */(var3)
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public fun UByteArray.sortedArray(): UByteArray {
   if (UByteArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$sortedArray_u2dGBYM_sE`)) {
      return `$this$sortedArray_u2dGBYM_sE`
   } else {
      val var10000: ByteArray = Arrays.copyOf(`$this$sortedArray_u2dGBYM_sE`, `$this$sortedArray_u2dGBYM_sE`.length)
      val var1: ByteArray = UByteArray.constructor_impl/* $VF was: constructor-impl */(var10000)
      UArraysKt.sort_GBYM_sE/* $VF was: sort-GBYM_sE */(var1)
      return var1
   }
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
public fun UIntArray.minOrNull(): UInt? {
   if (UIntArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$minOrNull_u2d_u2dajY_u2d9A`)) {
      return null
   } else {
      var min: Int = UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$minOrNull_u2d_u2dajY_u2d9A`, 0)
      val var2: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOrNull_u2d_u2dajY_u2d9A`)).iterator()

      while (var2.hasNext()) {
         val var6: Int = UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$minOrNull_u2d_u2dajY_u2d9A`, var2.nextInt())
         if (Integer.compareUnsigned(min, var6) > 0) {
            min = var6
         }
      }

      return UInt.box_impl/* $VF was: box-impl */(min)
   }
}

@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
public fun ULongArray.sortDescending(fromIndex: Int, toIndex: Int) {
   UArraysKt.sort__nroSd4/* $VF was: sort--nroSd4 */(`$this$sortDescending_u2d_u2dnroSd4`, fromIndex, toIndex)
   ArraysKt.reverse(`$this$sortDescending_u2d_u2dnroSd4`, fromIndex, toIndex)
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun UByteArray.findLast(predicate: (UByte) -> Boolean): UByte? {
   val var2: ByteArray = `$this$findLast_u2dJOV_ifY`
   var var3: Int = size + -1
   if (0 <= var3) {
      do {
         val var5: Byte = UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(var2, var3--)
         if (predicate(UByte.box_impl/* $VF was: box-impl */(var5)) as java.lang.Boolean) {
            return UByte.box_impl/* $VF was: box-impl */(var5)
         }
      } while (0 <= var3)
   }

   return null
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun ULongArray.lastIndexOf(element: ULong): Int {
   return ArraysKt.lastIndexOf(`$this$lastIndexOf_u2d3uqUaXg`, element)
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun <R> UIntArray.runningFoldIndexed(initial: Any, operation: (Int, Any, UInt) -> Any): List<Any> {
   if (UIntArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$runningFoldIndexed_u2dyVwIW0Q`)) {
      return (java.util.List<R>)CollectionsKt.listOf(initial)
   } else {
      val accumulator: ArrayList = ArrayList(size + 1)
      accumulator.add(initial)
      val result: ArrayList = accumulator
      var var7: Any = initial
      var var8: Int = 0

      for (var9 in size..var8) {
         var7 = operation(
            var8, var7, UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$runningFoldIndexed_u2dyVwIW0Q`, var8))
         )
         result.add(var7)
      }

      return result
   }
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
public fun UIntArray.shuffle() {
   UArraysKt.shuffle_2D5oskM/* $VF was: shuffle-2D5oskM */(`$this$shuffle_u2d_u2dajY_u2d9A`, Random.Default)
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public final val indices: IntRange
   public final inline get() {
      return ArraysKt.getIndices(`$this$indices`)
   }


@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public fun UIntArray.sortedDescending(): List<UInt> {
   val var10000: IntArray = Arrays.copyOf(`$this$sortedDescending_u2d_u2dajY_u2d9A`, `$this$sortedDescending_u2d_u2dajY_u2d9A`.length)
   val var1: IntArray = UIntArray.constructor_impl/* $VF was: constructor-impl */(var10000)
   UArraysKt.sort__ajY_9A/* $VF was: sort--ajY-9A */(var1)
   return UArraysKt.reversed__ajY_9A/* $VF was: reversed--ajY-9A */(var1)
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun UByteArray.asByteArray(): ByteArray {
   return `$this$asByteArray_u2dGBYM_sE`
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public inline fun UByteArray.indexOf(element: UByte): Int {
   return ArraysKt.indexOf(`$this$indexOf_u2dgMuBH34`, element)
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public operator fun UByteArray.plus(elements: Collection<UByte>): UByteArray {
   var index: Int = size
   val var10000: ByteArray = Arrays.copyOf(`$this$plus_u2dxo_DsdI`, size + elements.size())
   val result: ByteArray = var10000
   val var4: java.util.Iterator = elements.iterator()

   while (var4.hasNext()) {
      result[index++] = (var4.next() as UByte).unbox_impl/* $VF was: unbox-impl */()
   }

   return UByteArray.constructor_impl/* $VF was: constructor-impl */(result)
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun UIntArray.getOrElse(index: Int, defaultValue: (Int) -> UInt): UInt {
   return if (index >= 0 && index <= ArraysKt.getLastIndex(`$this$getOrElse_u2dQxvSvLU`))
      UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$getOrElse_u2dQxvSvLU`, index)
      else
      (defaultValue(index) as UInt).unbox_impl/* $VF was: unbox-impl */()
   }

@SinceKotlin(version = "1.4")
@InlineOnly
@ExperimentalUnsignedTypes
@OverloadResolutionByLambdaReturnType
public inline fun UIntArray.maxOfOrNull(selector: (UInt) -> Float): Float? {
   if (UIntArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$maxOfOrNull_u2djgv0xPQ`)) {
      return null
   } else {
      var maxValue: Float = (selector(UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$maxOfOrNull_u2djgv0xPQ`, 0))) as java.lang.Number)
         .floatValue()
         val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfOrNull_u2djgv0xPQ`)).iterator()

      while (var3.hasNext()) {
         maxValue = Math.max(
            maxValue,
            (selector(UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$maxOfOrNull_u2djgv0xPQ`, var3.nextInt()))) as java.lang.Number)
               .floatValue()
         )
      }

      return maxValue
   }
}

@InlineOnly
@OverloadResolutionByLambdaReturnType
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
public inline fun ULongArray.minOfOrNull(selector: (ULong) -> Float): Float? {
   if (ULongArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$minOfOrNull_u2dMShoTSo`)) {
      return null
   } else {
      var minValue: Float = (selector(
            ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$minOfOrNull_u2dMShoTSo`, 0))
         ) as java.lang.Number)
         .floatValue()
         val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfOrNull_u2dMShoTSo`)).iterator()

      while (var3.hasNext()) {
         minValue = Math.min(
            minValue,
            (selector(ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$minOfOrNull_u2dMShoTSo`, var3.nextInt()))) as java.lang.Number)
               .floatValue()
         )
      }

      return minValue
   }
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun <K, V, M : MutableMap<in Any, MutableList<Any>>> UByteArray.groupByTo(
   destination: Any,
   keySelector: (UByte) -> Any,
   valueTransform: (UByte) -> Any
): Any {
   var var4: Int = 0

   for (var5 in size..var4) {
      val element: Byte = UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$groupByTo_u2dqOZmbk8`, var4)
      val key: Any = keySelector(UByte.box_impl/* $VF was: box-impl */(element))
      val `value$iv`: Any = destination.get(key)
      val var10000: Any
      if (`value$iv` == null) {
         val var13: java.util.List = ArrayList()
         destination.put(key, var13)
         var10000 = var13
      } else {
         var10000 = `value$iv`
      }

      (var10000 as java.util.List).add(valueTransform(UByte.box_impl/* $VF was: box-impl */(element)))
   }

   return (M)destination
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public fun UIntArray.slice(indices: Iterable<Int>): List<UInt> {
   val size: Int = CollectionsKt.collectionSizeOrDefault(indices, 10)
   if (size == 0) {
      return CollectionsKt.emptyList()
   } else {
      val list: ArrayList = ArrayList(size)
      val var4: java.util.Iterator = indices.iterator()

      while (var4.hasNext()) {
         list.add(
            UInt.box_impl/* $VF was: box-impl */(
               UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$slice_u2dHwE9HBo`, (var4.next() as java.lang.Number).intValue())
            )
         )
      }

      return list
   }
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun ULongArray.takeLastWhile(predicate: (ULong) -> Boolean): List<ULong> {
   for (index in ArraysKt.getLastIndex(`$this$takeLastWhile_u2dMShoTSo`) downTo 0) {
      if (!predicate(ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$takeLastWhile_u2dMShoTSo`, index))) as java.lang.Boolean
         )
       {
         return UArraysKt.drop_r7IrZao/* $VF was: drop-r7IrZao */(`$this$takeLastWhile_u2dMShoTSo`, index + 1)
      }
   }

   return CollectionsKt.toList(ULongArray.box_impl/* $VF was: box-impl */(`$this$takeLastWhile_u2dMShoTSo`))
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public inline fun UShortArray.none(predicate: (UShort) -> Boolean): Boolean {
   var var2: Int = 0

   for (var3 in size..var2) {
      if (predicate(UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$none_u2dxTcfx_M`, var2))) as java.lang.Boolean
         )
       {
         return false
      }
   }

   return true
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public inline fun UShortArray.indexOf(element: UShort): Int {
   return ArraysKt.indexOf(`$this$indexOf_u2dXzdR7RA`, element)
}

@JvmName(name = "maxOrThrow-U")
@SinceKotlin(version = "1.7")
@ExperimentalUnsignedTypes
public fun UIntArray.max(): UInt {
   if (UIntArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$max_u2d_u2dajY_u2d9A`)) {
      throw NoSuchElementException()
   } else {
      var max: Int = UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$max_u2d_u2dajY_u2d9A`, 0)
      val var2: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$max_u2d_u2dajY_u2d9A`)).iterator()

      while (var2.hasNext()) {
         val var6: Int = UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$max_u2d_u2dajY_u2d9A`, var2.nextInt())
         if (Integer.compareUnsigned(max, var6) < 0) {
            max = var6
         }
      }

      return max
   }
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public inline fun UByteArray.dropWhile(predicate: (UByte) -> Boolean): List<UByte> {
   var yielding: Boolean = false
   val list: ArrayList = ArrayList()
   var var4: Int = 0

   for (var5 in size..var4) {
      val item: Byte = UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$dropWhile_u2dJOV_ifY`, var4)
      if (yielding) {
         list.add(UByte.box_impl/* $VF was: box-impl */(item))
      } else if (!predicate(UByte.box_impl/* $VF was: box-impl */(item)) as java.lang.Boolean) {
         list.add(UByte.box_impl/* $VF was: box-impl */(item))
         yielding = true
      }
   }

   return list
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun ULongArray.count(predicate: (ULong) -> Boolean): Int {
   var count: Int = 0
   var var3: Int = 0

   for (var4 in size..var3) {
      if (predicate(ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$count_u2dMShoTSo`, var3))) as java.lang.Boolean
         )
       {
         count++
      }
   }

   return count
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun UIntArray.asIntArray(): IntArray {
   return `$this$asIntArray_u2d_u2dajY_u2d9A`
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun <C : MutableCollection<in UByte>> UByteArray.filterNotTo(destination: Any, predicate: (UByte) -> Boolean): Any {
   var var3: Int = 0

   for (var4 in size..var3) {
      val element: Byte = UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$filterNotTo_u2dwzUQCXU`, var3)
      if (!predicate(UByte.box_impl/* $VF was: box-impl */(element)) as java.lang.Boolean) {
         destination.add(UByte.box_impl/* $VF was: box-impl */(element))
      }
   }

   return (C)destination
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public fun ULongArray.slice(indices: IntRange): List<ULong> {
   return if (indices.isEmpty())
      CollectionsKt.emptyList()
      else
      UArraysKt.asList_QwZRm1k/* $VF was: asList-QwZRm1k */(
         ULongArray.constructor_impl/* $VF was: constructor-impl */(ArraysKt.copyOfRange(`$this$slice_u2dZRhS8yI`, indices.start, indices.endInclusive + 1))
      )
   }

@InlineOnly
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
public inline fun UByteArray.maxOfOrNull(selector: (UByte) -> Float): Float? {
   if (UByteArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$maxOfOrNull_u2dJOV_ifY`)) {
      return null
   } else {
      var maxValue: Float = (selector(
            UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$maxOfOrNull_u2dJOV_ifY`, 0))
         ) as java.lang.Number)
         .floatValue()
         val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfOrNull_u2dJOV_ifY`)).iterator()

      while (var3.hasNext()) {
         maxValue = Math.max(
            maxValue,
            (selector(UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$maxOfOrNull_u2dJOV_ifY`, var3.nextInt()))) as java.lang.Number)
               .floatValue()
         )
      }

      return maxValue
   }
}

@InlineOnly
@ExperimentalUnsignedTypes
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
public inline fun UByteArray.minOfOrNull(selector: (UByte) -> Float): Float? {
   if (UByteArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$minOfOrNull_u2dJOV_ifY`)) {
      return null
   } else {
      var minValue: Float = (selector(
            UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$minOfOrNull_u2dJOV_ifY`, 0))
         ) as java.lang.Number)
         .floatValue()
         val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfOrNull_u2dJOV_ifY`)).iterator()

      while (var3.hasNext()) {
         minValue = Math.min(
            minValue,
            (selector(UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$minOfOrNull_u2dJOV_ifY`, var3.nextInt()))) as java.lang.Number)
               .floatValue()
         )
      }

      return minValue
   }
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun <R, C : MutableCollection<in Any>> UIntArray.mapTo(destination: Any, transform: (UInt) -> Any): Any {
   var var3: Int = 0

   for (var4 in size..var3) {
      destination.add(transform(UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$mapTo_u2dwU5IKMo`, var3))))
   }

   return (C)destination
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.3")
public inline operator fun UByteArray.plus(element: UByte): UByteArray {
   return UByteArray.constructor_impl/* $VF was: constructor-impl */(ArraysKt.plus(`$this$plus_u2dgMuBH34`, element))
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public fun UIntArray.singleOrNull(): UInt? {
   return if (size == 1)
      UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$singleOrNull_u2d_u2dajY_u2d9A`, 0))
      else
      null
   }

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public inline fun UIntArray.firstOrNull(predicate: (UInt) -> Boolean): UInt? {
   var var2: Int = 0

   for (var3 in size..var2) {
      val element: Int = UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$firstOrNull_u2djgv0xPQ`, var2)
      if (predicate(UInt.box_impl/* $VF was: box-impl */(element)) as java.lang.Boolean) {
         return UInt.box_impl/* $VF was: box-impl */(element)
      }
   }

   return null
}

@ExperimentalUnsignedTypes
@InlineOnly
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
public inline fun <R> UShortArray.flatMapIndexed(transform: (Int, UShort) -> Iterable<Any>): List<Any> {
   val var2: ShortArray = `$this$flatMapIndexed_u2dxzaTVY8`
   val var3: java.util.Collection = ArrayList()
   var var4: Int = 0
   var var5: Int = 0

   for (var6 in size..var5) {
      CollectionsKt.addAll(
         var3, transform(var4++, UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(var2, var5))) as java.lang.Iterable
      )
   }

   return var3 as MutableList<R>
}

@SinceKotlin(version = "1.3")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun UIntArray.indexOf(element: UInt): Int {
   return ArraysKt.indexOf(`$this$indexOf_u2duWY9BYg`, element)
}

@InlineOnly
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public inline fun ULongArray.first(): ULong {
   return ULong.constructor_impl/* $VF was: constructor-impl */(ArraysKt.first(`$this$first_u2dQwZRm1k`))
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
public infix fun UIntArray?.contentEquals(other: UIntArray?): Boolean {
   var var10000: IntArray = `$this$contentEquals_u2dKJPZfPQ`
   if (`$this$contentEquals_u2dKJPZfPQ` == null) {
      var10000 = null
   }

   var var10001: IntArray = other
   if (other == null) {
      var10001 = null
   }

   return Arrays.equals(var10000, var10001)
}

@SinceKotlin(version = "1.3")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun ULongArray.any(predicate: (ULong) -> Boolean): Boolean {
   var var2: Int = 0

   for (var3 in size..var2) {
      if (predicate(ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$any_u2dMShoTSo`, var2))) as java.lang.Boolean
         )
       {
         return true
      }
   }

   return false
}

@ExperimentalUnsignedTypes
@OverloadResolutionByLambdaReturnType
@InlineOnly
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@JvmName(name = "sumOfUInt")
@SinceKotlin(version = "1.5")
public inline fun UIntArray.sumOf(selector: (UInt) -> UInt): UInt {
   var sum: Int = UInt.constructor_impl/* $VF was: constructor-impl */(0)
   var var3: Int = 0

   for (var4 in size..var3) {
      sum = UInt.constructor_impl/* $VF was: constructor-impl */(
         sum
            + (selector(UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$sumOf_u2djgv0xPQ`, var3))) as UInt)
               .unbox_impl/* $VF was: unbox-impl */()
      )
   }

   return sum
}

@InlineOnly
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public inline fun IntArray.toUIntArray(): UIntArray {
   val var10000: IntArray = Arrays.copyOf(`$this$toUIntArray`, `$this$toUIntArray`.length)
   return UIntArray.constructor_impl/* $VF was: constructor-impl */(var10000)
}

@InlineOnly
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public inline fun <R, C : MutableCollection<in Any>> UShortArray.flatMapTo(destination: Any, transform: (UShort) -> Iterable<Any>): Any {
   var var3: Int = 0

   for (var4 in size..var3) {
      CollectionsKt.addAll(
         destination,
         transform(UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$flatMapTo_u2doEOeDjA`, var3))) as java.lang.Iterable
      )
   }

   return (C)destination
}

@InlineOnly
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public inline fun ULongArray.findLast(predicate: (ULong) -> Boolean): ULong? {
   val var2: LongArray = `$this$findLast_u2dMShoTSo`
   var var3: Int = size + -1
   if (0 <= var3) {
      do {
         val var5: Long = ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(var2, var3--)
         if (predicate(ULong.box_impl/* $VF was: box-impl */(var5)) as java.lang.Boolean) {
            return ULong.box_impl/* $VF was: box-impl */(var5)
         }
      } while (0 <= var3)
   }

   return null
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public inline operator fun ULongArray.plus(element: ULong): ULongArray {
   return ULongArray.constructor_impl/* $VF was: constructor-impl */(ArraysKt.plus(`$this$plus_u2d3uqUaXg`, element))
}

@SinceKotlin(version = "1.7")
@ExperimentalUnsignedTypes
@JvmName(name = "maxWithOrThrow-U")
public fun UShortArray.maxWith(comparator: Comparator<in UShort>): UShort {
   if (UShortArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$maxWith_u2deOHTfZs`)) {
      throw NoSuchElementException()
   } else {
      var max: Short = UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$maxWith_u2deOHTfZs`, 0)
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxWith_u2deOHTfZs`)).iterator()

      while (var3.hasNext()) {
         val var7: Short = UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$maxWith_u2deOHTfZs`, var3.nextInt())
         if (comparator.compare(UShort.box_impl/* $VF was: box-impl */(max), UShort.box_impl/* $VF was: box-impl */(var7)) < 0) {
            max = var7
         }
      }

      return max
   }
}

@SinceKotlin(version = "1.4")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun ULongArray.onEach(action: (ULong) -> Unit): ULongArray {
   val `$this$onEach_MShoTSo_u24lambda_u2457`: LongArray = `$this$onEach_u2dMShoTSo`
   var var5: Int = 0

   for (var6 in size..var5) {
      action(ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$onEach_MShoTSo_u24lambda_u2457`, var5)))
   }

   return `$this$onEach_u2dMShoTSo`
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun UIntArray.none(): Boolean {
   return UIntArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$none_u2d_u2dajY_u2d9A`)
}

@InlineOnly
@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
public inline fun <V, M : MutableMap<in UByte, in Any>> UByteArray.associateWithTo(destination: Any, valueSelector: (UByte) -> Any): Any {
   var var3: Int = 0

   for (var4 in size..var3) {
      val element: Byte = UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$associateWithTo_u2dH21X9dk`, var3)
      destination.put(UByte.box_impl/* $VF was: box-impl */(element), valueSelector(UByte.box_impl/* $VF was: box-impl */(element)))
   }

   return (M)destination
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun <R, V> UByteArray.zip(other: Iterable<Any>, transform: (UByte, Any) -> Any): List<Any> {
   val arraySize: Int = size
   val list: ArrayList = ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(other, 10), arraySize))
   var i: Int = 0

   for (element in other) {
      if (i >= arraySize) {
         break
      }

      list.add(transform(UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$zip_u2dUCnP4_w`, i++)), element))
   }

   return list
}

@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@SinceKotlin(version = "1.5")
@JvmName(name = "sumOfUInt")
public fun Array<out UInt>.sum(): UInt {
   var sum: Int = 0
   var var2: Int = 0

   for (var3 in `$this$sum`.length..var2) {
      sum = UInt.constructor_impl/* $VF was: constructor-impl */(sum + `$this$sum`[var2].unbox_impl/* $VF was: unbox-impl */())
   }

   return sum
}

@SinceKotlin(version = "1.4")
@InlineOnly
@ExperimentalUnsignedTypes
@OverloadResolutionByLambdaReturnType
public inline fun UByteArray.maxOfOrNull(selector: (UByte) -> Double): Double? {
   if (UByteArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$maxOfOrNull_u2dJOV_ifY`)) {
      return null
   } else {
      var maxValue: Double = (selector(
            UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$maxOfOrNull_u2dJOV_ifY`, 0))
         ) as java.lang.Number)
         .doubleValue()
         val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfOrNull_u2dJOV_ifY`)).iterator()

      while (var4.hasNext()) {
         maxValue = Math.max(
            maxValue,
            (selector(UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$maxOfOrNull_u2dJOV_ifY`, var4.nextInt()))) as java.lang.Number)
               .doubleValue()
         )
      }

      return maxValue
   }
}

@InlineOnly
@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
@OverloadResolutionByLambdaReturnType
public inline fun <R : Comparable<Any>> UIntArray.minOf(selector: (UInt) -> Any): Any {
   if (UIntArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$minOf_u2djgv0xPQ`)) {
      throw NoSuchElementException()
   } else {
      var minValue: java.lang.Comparable = selector(
         UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$minOf_u2djgv0xPQ`, 0))
      ) as java.lang.Comparable
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOf_u2djgv0xPQ`)).iterator()

      while (var3.hasNext()) {
         val var7: java.lang.Comparable = selector(
            UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$minOf_u2djgv0xPQ`, var3.nextInt()))
         ) as java.lang.Comparable
         if (minValue.compareTo(var7) > 0) {
            minValue = var7
         }
      }

      return (R)minValue
   }
}

@InlineOnly
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public inline fun UShortArray.getOrElse(index: Int, defaultValue: (Int) -> UShort): UShort {
   return if (index >= 0 && index <= ArraysKt.getLastIndex(`$this$getOrElse_u2dCVVdw08`))
      UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$getOrElse_u2dCVVdw08`, index)
      else
      (defaultValue(index) as UShort).unbox_impl/* $VF was: unbox-impl */()
   }

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public inline fun UIntArray.single(): UInt {
   return UInt.constructor_impl/* $VF was: constructor-impl */(ArraysKt.single(`$this$single_u2d_u2dajY_u2d9A`))
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun ULongArray.getOrElse(index: Int, defaultValue: (Int) -> ULong): ULong {
   return if (index >= 0 && index <= ArraysKt.getLastIndex(`$this$getOrElse_u2dXw8i6dc`))
      ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$getOrElse_u2dXw8i6dc`, index)
      else
      (defaultValue(index) as ULong).unbox_impl/* $VF was: unbox-impl */()
   }

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun UByteArray.reversedArray(): UByteArray {
   return UByteArray.constructor_impl/* $VF was: constructor-impl */(ArraysKt.reversedArray(`$this$reversedArray_u2dGBYM_sE`))
}

@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
public fun UByteArray.minWithOrNull(comparator: Comparator<in UByte>): UByte? {
   if (UByteArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$minWithOrNull_u2dXMRcp5o`)) {
      return null
   } else {
      var min: Byte = UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$minWithOrNull_u2dXMRcp5o`, 0)
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minWithOrNull_u2dXMRcp5o`)).iterator()

      while (var3.hasNext()) {
         val var7: Byte = UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$minWithOrNull_u2dXMRcp5o`, var3.nextInt())
         if (comparator.compare(UByte.box_impl/* $VF was: box-impl */(min), UByte.box_impl/* $VF was: box-impl */(var7)) > 0) {
            min = var7
         }
      }

      return UByte.box_impl/* $VF was: box-impl */(min)
   }
}

@SinceKotlin(version = "1.4")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun UByteArray.reduceRightIndexedOrNull(operation: (Int, UByte, UByte) -> UByte): UByte? {
   var index: Int = ArraysKt.getLastIndex(`$this$reduceRightIndexedOrNull_u2dEOyYB1Y`)
   if (index < 0) {
      return null
   } else {
      var var6: Byte = UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$reduceRightIndexedOrNull_u2dEOyYB1Y`, index--)

      while (index >= 0) {
         var6 = (operation(
               index,
               UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$reduceRightIndexedOrNull_u2dEOyYB1Y`, index)),
               UByte.box_impl/* $VF was: box-impl */(var6)
            ) as UByte)
            .unbox_impl/* $VF was: unbox-impl */()
            index--
      }

      return UByte.box_impl/* $VF was: box-impl */(var6)
   }
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun UShortArray.any(): Boolean {
   return ArraysKt.any(`$this$any_u2drL5Bavg`)
}

@InlineOnly
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public inline fun UIntArray.dropLastWhile(predicate: (UInt) -> Boolean): List<UInt> {
   for (index in ArraysKt.getLastIndex(`$this$dropLastWhile_u2djgv0xPQ`) downTo 0) {
      if (!predicate(UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$dropLastWhile_u2djgv0xPQ`, index))) as java.lang.Boolean
         )
       {
         return UArraysKt.take_qFRl0hI/* $VF was: take-qFRl0hI */(`$this$dropLastWhile_u2djgv0xPQ`, index + 1)
      }
   }

   return CollectionsKt.emptyList()
}

@InlineOnly
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public inline fun ULongArray.takeWhile(predicate: (ULong) -> Boolean): List<ULong> {
   val list: ArrayList = ArrayList()
   var var3: Int = 0

   for (var4 in size..var3) {
      val item: Long = ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$takeWhile_u2dMShoTSo`, var3)
      if (!predicate(ULong.box_impl/* $VF was: box-impl */(item)) as java.lang.Boolean) {
         break
      }

      list.add(ULong.box_impl/* $VF was: box-impl */(item))
   }

   return list
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun <K, V, M : MutableMap<in Any, MutableList<Any>>> UShortArray.groupByTo(
   destination: Any,
   keySelector: (UShort) -> Any,
   valueTransform: (UShort) -> Any
): Any {
   var var4: Int = 0

   for (var5 in size..var4) {
      val element: Short = UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$groupByTo_u2dq8RuPII`, var4)
      val key: Any = keySelector(UShort.box_impl/* $VF was: box-impl */(element))
      val `value$iv`: Any = destination.get(key)
      val var10000: Any
      if (`value$iv` == null) {
         val var13: java.util.List = ArrayList()
         destination.put(key, var13)
         var10000 = var13
      } else {
         var10000 = `value$iv`
      }

      (var10000 as java.util.List).add(valueTransform(UShort.box_impl/* $VF was: box-impl */(element)))
   }

   return (M)destination
}

@SinceKotlin(version = "1.4")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun UShortArray.onEach(action: (UShort) -> Unit): UShortArray {
   val `$this$onEach_xTcfx_M_u24lambda_u2459`: ShortArray = `$this$onEach_u2dxTcfx_M`
   var var5: Int = 0

   for (var6 in size..var5) {
      action(UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$onEach_xTcfx_M_u24lambda_u2459`, var5)))
   }

   return `$this$onEach_u2dxTcfx_M`
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public fun UByteArray.singleOrNull(): UByte? {
   return if (size == 1) UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$singleOrNull_u2dGBYM_sE`, 0)) else null
}

@InlineOnly
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public inline fun UByteArray.reduceRight(operation: (UByte, UByte) -> UByte): UByte {
   var index: Int = ArraysKt.getLastIndex(`$this$reduceRight_u2dELGow60`)
   if (index < 0) {
      throw UnsupportedOperationException("Empty array can't be reduced.")
   } else {
      var var6: Byte = UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$reduceRight_u2dELGow60`, index--)

      while (index >= 0) {
         var6 = (operation(
               UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$reduceRight_u2dELGow60`, index--)),
               UByte.box_impl/* $VF was: box-impl */(var6)
            ) as UByte)
            .unbox_impl/* $VF was: unbox-impl */()
         }

      return var6
   }
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public fun UByteArray.sliceArray(indices: Collection<Int>): UByteArray {
   return UByteArray.constructor_impl/* $VF was: constructor-impl */(ArraysKt.sliceArray((byte[])`$this$sliceArray_u2dxo_DsdI`, indices))
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public final val indices: IntRange
   public final inline get() {
      return ArraysKt.getIndices(`$this$indices`)
   }


@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
public fun UByteArray.maxOrNull(): UByte? {
   if (UByteArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$maxOrNull_u2dGBYM_sE`)) {
      return null
   } else {
      var max: Byte = UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$maxOrNull_u2dGBYM_sE`, 0)
      val var2: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOrNull_u2dGBYM_sE`)).iterator()

      while (var2.hasNext()) {
         val var6: Byte = UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$maxOrNull_u2dGBYM_sE`, var2.nextInt())
         if (Intrinsics.compare(max and 255, var6 and 255) < 0) {
            max = var6
         }
      }

      return UByte.box_impl/* $VF was: box-impl */(max)
   }
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
public fun UIntArray?.contentToString(): String {
   if (`$this$contentToString_u2dXUkPCBk` != null) {
      val var10000: java.lang.String = CollectionsKt.joinToString$default(
         UIntArray.box_impl/* $VF was: box-impl */(`$this$contentToString_u2dXUkPCBk`), ", ", "[", "]", 0, null, null, 56, null
      )
      if (var10000 != null) {
         return var10000
      }
   }

   return "null"
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun UShortArray.single(): UShort {
   return UShort.constructor_impl/* $VF was: constructor-impl */(ArraysKt.single(`$this$single_u2drL5Bavg`))
}

@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun UIntArray.reduceRightIndexedOrNull(operation: (Int, UInt, UInt) -> UInt): UInt? {
   var index: Int = ArraysKt.getLastIndex(`$this$reduceRightIndexedOrNull_u2dD40WMg8`)
   if (index < 0) {
      return null
   } else {
      var var6: Int = UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$reduceRightIndexedOrNull_u2dD40WMg8`, index--)

      while (index >= 0) {
         var6 = (operation(
               index,
               UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$reduceRightIndexedOrNull_u2dD40WMg8`, index)),
               UInt.box_impl/* $VF was: box-impl */(var6)
            ) as UInt)
            .unbox_impl/* $VF was: unbox-impl */()
            index--
      }

      return UInt.box_impl/* $VF was: box-impl */(var6)
   }
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun ULongArray.reduceRightIndexedOrNull(operation: (Int, ULong, ULong) -> ULong): ULong? {
   var index: Int = ArraysKt.getLastIndex(`$this$reduceRightIndexedOrNull_u2dz1zDJgo`)
   if (index < 0) {
      return null
   } else {
      var var6: Long = ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$reduceRightIndexedOrNull_u2dz1zDJgo`, index--)

      while (index >= 0) {
         var6 = (operation(
               index,
               ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$reduceRightIndexedOrNull_u2dz1zDJgo`, index)),
               ULong.box_impl/* $VF was: box-impl */(var6)
            ) as ULong)
            .unbox_impl/* $VF was: unbox-impl */()
            index--
      }

      return ULong.box_impl/* $VF was: box-impl */(var6)
   }
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.7")
@JvmName(name = "minByOrThrow-U")
public inline fun <R : Comparable<Any>> ULongArray.minBy(selector: (ULong) -> Any): ULong {
   if (ULongArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$minBy_u2dMShoTSo`)) {
      throw NoSuchElementException()
   } else {
      var minElem: Long = ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$minBy_u2dMShoTSo`, 0)
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$minBy_u2dMShoTSo`)
      if (lastIndex == 0) {
         return minElem
      } else {
         var var11: java.lang.Comparable = selector(ULong.box_impl/* $VF was: box-impl */(minElem)) as java.lang.Comparable
         val var12: IntIterator = IntRange(1, lastIndex).iterator()

         while (var12.hasNext()) {
            val e: Long = ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$minBy_u2dMShoTSo`, var12.nextInt())
            val v: java.lang.Comparable = selector(ULong.box_impl/* $VF was: box-impl */(e)) as java.lang.Comparable
            if (var11.compareTo(v) > 0) {
               minElem = e
               var11 = v
            }
         }

         return minElem
      }
   }
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.3")
public inline operator fun UIntArray.plus(element: UInt): UIntArray {
   return UIntArray.constructor_impl/* $VF was: constructor-impl */(ArraysKt.plus(`$this$plus_u2duWY9BYg`, element))
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public fun UShortArray.dropLast(n: Int): List<UShort> {
   if (n < 0) {
      throw IllegalArgumentException(("Requested element count $n is less than zero.").toString())
   } else {
      return UArraysKt.take_nggk6HY/* $VF was: take-nggk6HY */(`$this$dropLast_u2dnggk6HY`, RangesKt.coerceAtLeast(size - n, 0))
   }
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public fun ULongArray.sortedDescending(): List<ULong> {
   val var10000: LongArray = Arrays.copyOf(`$this$sortedDescending_u2dQwZRm1k`, `$this$sortedDescending_u2dQwZRm1k`.length)
   val var1: LongArray = ULongArray.constructor_impl/* $VF was: constructor-impl */(var10000)
   UArraysKt.sort_QwZRm1k/* $VF was: sort-QwZRm1k */(var1)
   return UArraysKt.reversed_QwZRm1k/* $VF was: reversed-QwZRm1k */(var1)
}

@SinceKotlin(version = "1.3")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun UShortArray.findLast(predicate: (UShort) -> Boolean): UShort? {
   val var2: ShortArray = `$this$findLast_u2dxTcfx_M`
   var var3: Int = size + -1
   if (0 <= var3) {
      do {
         val var5: Short = UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(var2, var3--)
         if (predicate(UShort.box_impl/* $VF was: box-impl */(var5)) as java.lang.Boolean) {
            return UShort.box_impl/* $VF was: box-impl */(var5)
         }
      } while (0 <= var3)
   }

   return null
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public fun UByteArray.random(random: Random): UByte {
   if (UByteArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$random_u2doSF2wD8`)) {
      throw NoSuchElementException("Array is empty.")
   } else {
      return UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$random_u2doSF2wD8`, random.nextInt(size))
   }
}

@InlineOnly
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public inline fun ULongArray.firstOrNull(predicate: (ULong) -> Boolean): ULong? {
   var var2: Int = 0

   for (var3 in size..var2) {
      val element: Long = ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$firstOrNull_u2dMShoTSo`, var2)
      if (predicate(ULong.box_impl/* $VF was: box-impl */(element)) as java.lang.Boolean) {
         return ULong.box_impl/* $VF was: box-impl */(element)
      }
   }

   return null
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public fun ULongArray.sortedArray(): ULongArray {
   if (ULongArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$sortedArray_u2dQwZRm1k`)) {
      return `$this$sortedArray_u2dQwZRm1k`
   } else {
      val var10000: LongArray = Arrays.copyOf(`$this$sortedArray_u2dQwZRm1k`, `$this$sortedArray_u2dQwZRm1k`.length)
      val var1: LongArray = ULongArray.constructor_impl/* $VF was: constructor-impl */(var10000)
      UArraysKt.sort_QwZRm1k/* $VF was: sort-QwZRm1k */(var1)
      return var1
   }
}

@SinceKotlin(version = "1.3")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun <R> UShortArray.flatMap(transform: (UShort) -> Iterable<Any>): List<Any> {
   val var2: ShortArray = `$this$flatMap_u2dxTcfx_M`
   val var3: java.util.Collection = ArrayList()
   var var4: Int = 0

   for (var5 in size..var4) {
      CollectionsKt.addAll(
         var3, transform(UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(var2, var4))) as java.lang.Iterable
      )
   }

   return var3 as MutableList<R>
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun UByteArray.last(): UByte {
   return UByte.constructor_impl/* $VF was: constructor-impl */(ArraysKt.last(`$this$last_u2dGBYM_sE`))
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public fun ULongArray.sorted(): List<ULong> {
   val var10000: LongArray = Arrays.copyOf(`$this$sorted_u2dQwZRm1k`, `$this$sorted_u2dQwZRm1k`.length)
   val var1: LongArray = ULongArray.constructor_impl/* $VF was: constructor-impl */(var10000)
   UArraysKt.sort_QwZRm1k/* $VF was: sort-QwZRm1k */(var1)
   return UArraysKt.asList_QwZRm1k/* $VF was: asList-QwZRm1k */(var1)
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun UByteArray.first(predicate: (UByte) -> Boolean): UByte {
   var var2: Int = 0

   for (var3 in size..var2) {
      val element: Byte = UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$first_u2dJOV_ifY`, var2)
      if (predicate(UByte.box_impl/* $VF was: box-impl */(element)) as java.lang.Boolean) {
         return element
      }
   }

   throw NoSuchElementException("Array contains no element matching the predicate.")
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
@InlineOnly
public inline operator fun ULongArray.component1(): ULong {
   return ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$component1_u2dQwZRm1k`, 0)
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun UIntArray.runningReduce(operation: (UInt, UInt) -> UInt): List<UInt> {
   if (UIntArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$runningReduce_u2dWyvcNBI`)) {
      return CollectionsKt.emptyList()
   } else {
      var var7: Int = UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$runningReduce_u2dWyvcNBI`, 0)
      val index: Int = (int)ArrayList(size)
      index.add(UInt.box_impl/* $VF was: box-impl */(var7))
      val result: Any = index
      var var8: Int = 1

      for (var9 in size..var8) {
         var7 = (operation(
               UInt.box_impl/* $VF was: box-impl */(var7),
               UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$runningReduce_u2dWyvcNBI`, var8))
            ) as UInt)
            .unbox_impl/* $VF was: unbox-impl */()
            result.add(UInt.box_impl/* $VF was: box-impl */(var7))
      }

      return result as MutableList<UInt>
   }
}

@SinceKotlin(version = "1.7")
@JvmName(name = "maxByOrThrow-U")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun <R : Comparable<Any>> UByteArray.maxBy(selector: (UByte) -> Any): UByte {
   if (UByteArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$maxBy_u2dJOV_ifY`)) {
      throw NoSuchElementException()
   } else {
      var maxElem: Byte = UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$maxBy_u2dJOV_ifY`, 0)
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$maxBy_u2dJOV_ifY`)
      if (lastIndex == 0) {
         return maxElem
      } else {
         var var9: java.lang.Comparable = selector(UByte.box_impl/* $VF was: box-impl */(maxElem)) as java.lang.Comparable
         val var10: IntIterator = IntRange(1, lastIndex).iterator()

         while (var10.hasNext()) {
            val e: Byte = UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$maxBy_u2dJOV_ifY`, var10.nextInt())
            val v: java.lang.Comparable = selector(UByte.box_impl/* $VF was: box-impl */(e)) as java.lang.Comparable
            if (var9.compareTo(v) < 0) {
               maxElem = e
               var9 = v
            }
         }

         return maxElem
      }
   }
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun <K, V> UByteArray.groupBy(keySelector: (UByte) -> Any, valueTransform: (UByte) -> Any): Map<Any, List<Any>> {
   val var3: ByteArray = `$this$groupBy_u2dbBsjw1Y`
   val var4: java.util.Map = LinkedHashMap()
   var var5: Int = 0

   for (var6 in size..var5) {
      val var7: Byte = UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(var3, var5)
      val var8: Any = keySelector(UByte.box_impl/* $VF was: box-impl */(var7))
      var var10000: Any = var4.get(var8)
      if (var10000 == null) {
         val var10: java.util.List = ArrayList()
         var4.put(var8, var10)
         var10000 = var10
      }

      (var10000 as java.util.List).add(valueTransform(UByte.box_impl/* $VF was: box-impl */(var7)))
   }

   return var4
}

@SinceKotlin(version = "1.3")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun ULongArray.asLongArray(): LongArray {
   return `$this$asLongArray_u2dQwZRm1k`
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun UShortArray.all(predicate: (UShort) -> Boolean): Boolean {
   var var2: Int = 0

   for (var3 in size..var2) {
      if (!predicate(UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$all_u2dxTcfx_M`, var2))) as java.lang.Boolean
         )
       {
         return false
      }
   }

   return true
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
public inline fun <R> UByteArray.flatMapIndexed(transform: (Int, UByte) -> Iterable<Any>): List<Any> {
   val var2: ByteArray = `$this$flatMapIndexed_u2dELGow60`
   val var3: java.util.Collection = ArrayList()
   var var4: Int = 0
   var var5: Int = 0

   for (var6 in size..var5) {
      CollectionsKt.addAll(
         var3, transform(var4++, UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(var2, var5))) as java.lang.Iterable
      )
   }

   return var3 as MutableList<R>
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun UByteArray.onEach(action: (UByte) -> Unit): UByteArray {
   val `$this$onEach_JOV_ifY_u24lambda_u2458`: ByteArray = `$this$onEach_u2dJOV_ifY`
   var var5: Int = 0

   for (var6 in size..var5) {
      action(UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$onEach_JOV_ifY_u24lambda_u2458`, var5)))
   }

   return `$this$onEach_u2dJOV_ifY`
}

@ExperimentalUnsignedTypes
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.4")
public fun UByteArray.randomOrNull(random: Random): UByte? {
   return if (UByteArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$randomOrNull_u2doSF2wD8`))
      null
      else
      UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$randomOrNull_u2doSF2wD8`, random.nextInt(size)))
   }

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public fun ULongArray.toTypedArray(): Array<ULong> {
   var var1: Int = 0
   val var2: Int = size
   val var3: Array<ULong> = arrayOfNulls(var2)

   while (var1 < var2) {
      var3[var1] = ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$toTypedArray_u2dQwZRm1k`, var1))
      var1++
   }

   return var3
}

@InlineOnly
@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
public inline fun UIntArray.reduceIndexedOrNull(operation: (Int, UInt, UInt) -> UInt): UInt? {
   if (UIntArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$reduceIndexedOrNull_u2dD40WMg8`)) {
      return null
   } else {
      var accumulator: Int = UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$reduceIndexedOrNull_u2dD40WMg8`, 0)
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$reduceIndexedOrNull_u2dD40WMg8`)).iterator()

      while (var3.hasNext()) {
         val var6: Int = var3.nextInt()
         accumulator = (operation(
               var6,
               UInt.box_impl/* $VF was: box-impl */(accumulator),
               UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$reduceIndexedOrNull_u2dD40WMg8`, var6))
            ) as UInt)
            .unbox_impl/* $VF was: unbox-impl */()
         }

      return UInt.box_impl/* $VF was: box-impl */(accumulator)
   }
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public inline fun UShortArray.copyOf(): UShortArray {
   val var10000: ShortArray = Arrays.copyOf(`$this$copyOf_u2drL5Bavg`, `$this$copyOf_u2drL5Bavg`.length)
   return UShortArray.constructor_impl/* $VF was: constructor-impl */(var10000)
}

@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
@InlineOnly
@OverloadResolutionByLambdaReturnType
public inline fun <R> UByteArray.minOfWithOrNull(comparator: Comparator<in Any>, selector: (UByte) -> Any): Any? {
   if (UByteArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$minOfWithOrNull_u2dLTi4i_s`)) {
      return null
   } else {
      var minValue: Any = selector(
         UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$minOfWithOrNull_u2dLTi4i_s`, 0))
      )
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfWithOrNull_u2dLTi4i_s`)).iterator()

      while (var4.hasNext()) {
         val var8: Any = selector(
            UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$minOfWithOrNull_u2dLTi4i_s`, var4.nextInt()))
         )
         if (comparator.compare(minValue, var8) > 0) {
            minValue = var8
         }
      }

      return (R)minValue
   }
}

@SinceKotlin(version = "1.3")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun UShortArray.none(): Boolean {
   return UShortArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$none_u2drL5Bavg`)
}

@InlineOnly
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public inline fun ULongArray.indexOf(element: ULong): Int {
   return ArraysKt.indexOf(`$this$indexOf_u2d3uqUaXg`, element)
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun <C : MutableCollection<in ULong>> ULongArray.filterNotTo(destination: Any, predicate: (ULong) -> Boolean): Any {
   var var3: Int = 0

   for (var4 in size..var3) {
      val element: Long = ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$filterNotTo_u2dHqK1JgA`, var3)
      if (!predicate(ULong.box_impl/* $VF was: box-impl */(element)) as java.lang.Boolean) {
         destination.add(ULong.box_impl/* $VF was: box-impl */(element))
      }
   }

   return (C)destination
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun <C : MutableCollection<in UShort>> UShortArray.filterIndexedTo(destination: Any, predicate: (Int, UShort) -> Boolean): Any {
   val var3: ShortArray = `$this$filterIndexedTo_u2dQqktQ3k`
   val var4: Int = 0
   var var5: Int = 0

   for (var6 in size..var5) {
      val var7: Short = UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(var3, var5)
      if (predicate(var4++, UShort.box_impl/* $VF was: box-impl */(var7)) as java.lang.Boolean) {
         destination.add(UShort.box_impl/* $VF was: box-impl */(var7))
      }
   }

   return (C)destination
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun ULongArray.runningReduceIndexed(operation: (Int, ULong, ULong) -> ULong): List<ULong> {
   if (ULongArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$runningReduceIndexed_u2dz1zDJgo`)) {
      return CollectionsKt.emptyList()
   } else {
      var accumulator: Long = 0L
      accumulator = ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$runningReduceIndexed_u2dz1zDJgo`, 0)
      val index: ArrayList = ArrayList(size)
      index.add(ULong.box_impl/* $VF was: box-impl */(accumulator))
      val result: ArrayList = index
      var var8: Int = 1

      for (var9 in size..var8) {
         accumulator = (operation(
               var8,
               ULong.box_impl/* $VF was: box-impl */(accumulator),
               ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$runningReduceIndexed_u2dz1zDJgo`, var8))
            ) as ULong)
            .unbox_impl/* $VF was: unbox-impl */()
            result.add(ULong.box_impl/* $VF was: box-impl */(accumulator))
      }

      return result
   }
}

@OverloadResolutionByLambdaReturnType
@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun ULongArray.maxOf(selector: (ULong) -> Float): Float {
   if (ULongArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$maxOf_u2dMShoTSo`)) {
      throw NoSuchElementException()
   } else {
      var maxValue: Float = (selector(ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$maxOf_u2dMShoTSo`, 0))) as java.lang.Number)
         .floatValue()
         val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOf_u2dMShoTSo`)).iterator()

      while (var3.hasNext()) {
         maxValue = Math.max(
            maxValue,
            (selector(ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$maxOf_u2dMShoTSo`, var3.nextInt()))) as java.lang.Number)
               .floatValue()
         )
      }

      return maxValue
   }
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public fun UByteArray.sorted(): List<UByte> {
   val var10000: ByteArray = Arrays.copyOf(`$this$sorted_u2dGBYM_sE`, `$this$sorted_u2dGBYM_sE`.length)
   val var1: ByteArray = UByteArray.constructor_impl/* $VF was: constructor-impl */(var10000)
   UArraysKt.sort_GBYM_sE/* $VF was: sort-GBYM_sE */(var1)
   return UArraysKt.asList_GBYM_sE/* $VF was: asList-GBYM_sE */(var1)
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
public fun UIntArray.maxOrNull(): UInt? {
   if (UIntArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$maxOrNull_u2d_u2dajY_u2d9A`)) {
      return null
   } else {
      var max: Int = UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$maxOrNull_u2d_u2dajY_u2d9A`, 0)
      val var2: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOrNull_u2d_u2dajY_u2d9A`)).iterator()

      while (var2.hasNext()) {
         val var6: Int = UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$maxOrNull_u2d_u2dajY_u2d9A`, var2.nextInt())
         if (Integer.compareUnsigned(max, var6) < 0) {
            max = var6
         }
      }

      return UInt.box_impl/* $VF was: box-impl */(max)
   }
}

@ExperimentalUnsignedTypes
@InlineOnly
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
public inline fun <R, C : MutableCollection<in Any>> UIntArray.flatMapIndexedTo(destination: Any, transform: (Int, UInt) -> Iterable<Any>): Any {
   var index: Int = 0
   var var4: Int = 0

   for (var5 in size..var4) {
      CollectionsKt.addAll(
         destination,
         transform(index++, UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$flatMapIndexedTo_u2d_u2d6EtJGI`, var4))) as java.lang.Iterable
      )
   }

   return (C)destination
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun UShortArray.reduce(operation: (UShort, UShort) -> UShort): UShort {
   if (UShortArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$reduce_u2dxzaTVY8`)) {
      throw UnsupportedOperationException("Empty array can't be reduced.")
   } else {
      var accumulator: Short = UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$reduce_u2dxzaTVY8`, 0)
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$reduce_u2dxzaTVY8`)).iterator()

      while (var3.hasNext()) {
         accumulator = (operation(
               UShort.box_impl/* $VF was: box-impl */(accumulator),
               UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$reduce_u2dxzaTVY8`, var3.nextInt()))
            ) as UShort)
            .unbox_impl/* $VF was: unbox-impl */()
         }

      return accumulator
   }
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun UByteArray.reduce(operation: (UByte, UByte) -> UByte): UByte {
   if (UByteArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$reduce_u2dELGow60`)) {
      throw UnsupportedOperationException("Empty array can't be reduced.")
   } else {
      var accumulator: Byte = UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$reduce_u2dELGow60`, 0)
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$reduce_u2dELGow60`)).iterator()

      while (var3.hasNext()) {
         accumulator = (operation(
               UByte.box_impl/* $VF was: box-impl */(accumulator),
               UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$reduce_u2dELGow60`, var3.nextInt()))
            ) as UByte)
            .unbox_impl/* $VF was: unbox-impl */()
         }

      return accumulator
   }
}

@JvmName(name = "sumOfInt")
@OverloadResolutionByLambdaReturnType
@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun UByteArray.sumOf(selector: (UByte) -> Int): Int {
   var sum: Int = 0
   var var3: Int = 0

   for (var4 in size..var3) {
      sum += (selector(UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$sumOf_u2dJOV_ifY`, var3))) as java.lang.Number)
         .intValue()
      }

   return sum
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun UShortArray.singleOrNull(predicate: (UShort) -> Boolean): UShort? {
   var single: UShort = null
   var found: Boolean = false
   var var4: Int = 0

   for (var5 in size..var4) {
      val element: Short = UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$singleOrNull_u2dxTcfx_M`, var4)
      if (predicate(UShort.box_impl/* $VF was: box-impl */(element)) as java.lang.Boolean) {
         if (found) {
            return null
         }

         single = UShort.box_impl/* $VF was: box-impl */(element)
         found = true
      }
   }

   return if (!found) null else single
}

@SinceKotlin(version = "1.3")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun UIntArray.count(predicate: (UInt) -> Boolean): Int {
   var count: Int = 0
   var var3: Int = 0

   for (var4 in size..var3) {
      if (predicate(UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$count_u2djgv0xPQ`, var3))) as java.lang.Boolean
         )
       {
         count++
      }
   }

   return count
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun <C : MutableCollection<in UByte>> UByteArray.filterIndexedTo(destination: Any, predicate: (Int, UByte) -> Boolean): Any {
   val var3: ByteArray = `$this$filterIndexedTo_u2deNpIKz8`
   val var4: Int = 0
   var var5: Int = 0

   for (var6 in size..var5) {
      val var7: Byte = UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(var3, var5)
      if (predicate(var4++, UByte.box_impl/* $VF was: box-impl */(var7)) as java.lang.Boolean) {
         destination.add(UByte.box_impl/* $VF was: box-impl */(var7))
      }
   }

   return (C)destination
}

@SinceKotlin(version = "1.3")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun UByteArray.sum(): UInt {
   val var1: ByteArray = `$this$sum_u2dGBYM_sE`
   var var2: Int = UInt.constructor_impl/* $VF was: constructor-impl */(0)
   var var3: Int = 0

   for (var4 in size..var3) {
      var2 = UInt.constructor_impl/* $VF was: constructor-impl */(
         var2 + UInt.constructor_impl/* $VF was: constructor-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(var1, var3) and 255)
      )
   }

   return var2
}

@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@InlineOnly
public inline fun <R> UShortArray.scanIndexed(initial: Any, operation: (Int, Any, UShort) -> Any): List<Any> {
   val var3: ShortArray = `$this$scanIndexed_u2dbzxtMww`
   val var10000: java.util.List
   if (UShortArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$scanIndexed_u2dbzxtMww`)) {
      var10000 = CollectionsKt.listOf(initial)
   } else {
      val var4: ArrayList = ArrayList(size + 1)
      var4.add(initial)
      val var6: ArrayList = var4
      var var8: Any = initial
      var var9: Int = 0

      for (var7 in size..var9) {
         var8 = operation(var9, var8, UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(var3, var9)))
         var6.add(var8)
      }

      var10000 = var6
   }

   return var10000
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public fun UByteArray.reversed(): List<UByte> {
   if (UByteArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$reversed_u2dGBYM_sE`)) {
      return CollectionsKt.emptyList()
   } else {
      val list: java.util.List = CollectionsKt.toMutableList(UByteArray.box_impl/* $VF was: box-impl */(`$this$reversed_u2dGBYM_sE`))
      CollectionsKt.reverse(list)
      return list
   }
}

@SinceKotlin(version = "1.4")
@InlineOnly
@ExperimentalUnsignedTypes
@OverloadResolutionByLambdaReturnType
public inline fun UByteArray.minOf(selector: (UByte) -> Float): Float {
   if (UByteArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$minOf_u2dJOV_ifY`)) {
      throw NoSuchElementException()
   } else {
      var minValue: Float = (selector(UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$minOf_u2dJOV_ifY`, 0))) as java.lang.Number)
         .floatValue()
         val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOf_u2dJOV_ifY`)).iterator()

      while (var3.hasNext()) {
         minValue = Math.min(
            minValue,
            (selector(UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$minOf_u2dJOV_ifY`, var3.nextInt()))) as java.lang.Number)
               .floatValue()
         )
      }

      return minValue
   }
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public fun UShortArray.sortedDescending(): List<UShort> {
   val var10000: ShortArray = Arrays.copyOf(`$this$sortedDescending_u2drL5Bavg`, `$this$sortedDescending_u2drL5Bavg`.length)
   val var1: ShortArray = UShortArray.constructor_impl/* $VF was: constructor-impl */(var10000)
   UArraysKt.sort_rL5Bavg/* $VF was: sort-rL5Bavg */(var1)
   return UArraysKt.reversed_rL5Bavg/* $VF was: reversed-rL5Bavg */(var1)
}

open fun UArraysKt___UArraysKt() {
}

@InlineOnly
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public inline fun UIntArray.reduceRightIndexed(operation: (Int, UInt, UInt) -> UInt): UInt {
   var index: Int = ArraysKt.getLastIndex(`$this$reduceRightIndexed_u2dD40WMg8`)
   if (index < 0) {
      throw UnsupportedOperationException("Empty array can't be reduced.")
   } else {
      var var6: Int = UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$reduceRightIndexed_u2dD40WMg8`, index--)

      while (index >= 0) {
         var6 = (operation(
               index,
               UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$reduceRightIndexed_u2dD40WMg8`, index)),
               UInt.box_impl/* $VF was: box-impl */(var6)
            ) as UInt)
            .unbox_impl/* $VF was: unbox-impl */()
            index--
      }

      return var6
   }
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun <R> UIntArray.mapIndexed(transform: (Int, UInt) -> Any): List<Any> {
   val var2: IntArray = `$this$mapIndexed_u2dWyvcNBI`
   val var3: java.util.Collection = ArrayList(size)
   var var4: Int = 0
   var var5: Int = 0

   for (var6 in size..var5) {
      var3.add(transform(var4++, UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(var2, var5))))
   }

   return var3 as MutableList<R>
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public fun UIntArray.lastOrNull(): UInt? {
   return if (UIntArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$lastOrNull_u2d_u2dajY_u2d9A`))
      null
      else
      UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$lastOrNull_u2d_u2dajY_u2d9A`, size - 1))
   }

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public inline fun UShortArray.reduceOrNull(operation: (UShort, UShort) -> UShort): UShort? {
   if (UShortArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$reduceOrNull_u2dxzaTVY8`)) {
      return null
   } else {
      var accumulator: Short = UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$reduceOrNull_u2dxzaTVY8`, 0)
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$reduceOrNull_u2dxzaTVY8`)).iterator()

      while (var3.hasNext()) {
         accumulator = (operation(
               UShort.box_impl/* $VF was: box-impl */(accumulator),
               UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$reduceOrNull_u2dxzaTVY8`, var3.nextInt()))
            ) as UShort)
            .unbox_impl/* $VF was: unbox-impl */()
         }

      return UShort.box_impl/* $VF was: box-impl */(accumulator)
   }
}

@Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = []))
@DeprecatedSinceKotlin(warningSince = "1.5")
@SinceKotlin(version = "1.3")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun UIntArray.sumByDouble(selector: (UInt) -> Double): Double {
   var sum: Double = 0.0
   var var4: Int = 0

   for (var5 in size..var4) {
      sum += (selector(UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$sumByDouble_u2djgv0xPQ`, var4))) as java.lang.Number)
         .doubleValue()
      }

   return sum
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
public fun UIntArray.minWithOrNull(comparator: Comparator<in UInt>): UInt? {
   if (UIntArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$minWithOrNull_u2dYmdZ_VM`)) {
      return null
   } else {
      var min: Int = UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$minWithOrNull_u2dYmdZ_VM`, 0)
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minWithOrNull_u2dYmdZ_VM`)).iterator()

      while (var3.hasNext()) {
         val var7: Int = UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$minWithOrNull_u2dYmdZ_VM`, var3.nextInt())
         if (comparator.compare(UInt.box_impl/* $VF was: box-impl */(min), UInt.box_impl/* $VF was: box-impl */(var7)) > 0) {
            min = var7
         }
      }

      return UInt.box_impl/* $VF was: box-impl */(min)
   }
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun UIntArray.last(predicate: (UInt) -> Boolean): UInt {
   var var2: Int = size + -1
   if (0 <= var2) {
      do {
         val element: Int = UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$last_u2djgv0xPQ`, var2--)
         if (predicate(UInt.box_impl/* $VF was: box-impl */(element)) as java.lang.Boolean) {
            return element
         }
      } while (0 <= var2)
   }

   throw NoSuchElementException("Array contains no element matching the predicate.")
}

@SinceKotlin(version = "1.3")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun UByteArray.singleOrNull(predicate: (UByte) -> Boolean): UByte? {
   var single: UByte = null
   var found: Boolean = false
   var var4: Int = 0

   for (var5 in size..var4) {
      val element: Byte = UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$singleOrNull_u2dJOV_ifY`, var4)
      if (predicate(UByte.box_impl/* $VF was: box-impl */(element)) as java.lang.Boolean) {
         if (found) {
            return null
         }

         single = UByte.box_impl/* $VF was: box-impl */(element)
         found = true
      }
   }

   return if (!found) null else single
}

@SinceKotlin(version = "1.3")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun UIntArray.first(): UInt {
   return UInt.constructor_impl/* $VF was: constructor-impl */(ArraysKt.first(`$this$first_u2d_u2dajY_u2d9A`))
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun ULongArray.reduceRightIndexed(operation: (Int, ULong, ULong) -> ULong): ULong {
   var index: Int = ArraysKt.getLastIndex(`$this$reduceRightIndexed_u2dz1zDJgo`)
   if (index < 0) {
      throw UnsupportedOperationException("Empty array can't be reduced.")
   } else {
      var var6: Long = ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$reduceRightIndexed_u2dz1zDJgo`, index--)

      while (index >= 0) {
         var6 = (operation(
               index,
               ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$reduceRightIndexed_u2dz1zDJgo`, index)),
               ULong.box_impl/* $VF was: box-impl */(var6)
            ) as ULong)
            .unbox_impl/* $VF was: unbox-impl */()
            index--
      }

      return var6
   }
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public final val lastIndex: Int
   public final inline get() {
      return ArraysKt.getLastIndex(`$this$lastIndex`)
   }


@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun <R : Comparable<Any>> ULongArray.maxByOrNull(selector: (ULong) -> Any): ULong? {
   if (ULongArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$maxByOrNull_u2dMShoTSo`)) {
      return null
   } else {
      var maxElem: Long = ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$maxByOrNull_u2dMShoTSo`, 0)
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$maxByOrNull_u2dMShoTSo`)
      if (lastIndex == 0) {
         return ULong.box_impl/* $VF was: box-impl */(maxElem)
      } else {
         var var11: java.lang.Comparable = selector(ULong.box_impl/* $VF was: box-impl */(maxElem)) as java.lang.Comparable
         val var12: IntIterator = IntRange(1, lastIndex).iterator()

         while (var12.hasNext()) {
            val e: Long = ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$maxByOrNull_u2dMShoTSo`, var12.nextInt())
            val v: java.lang.Comparable = selector(ULong.box_impl/* $VF was: box-impl */(e)) as java.lang.Comparable
            if (var11.compareTo(v) < 0) {
               maxElem = e
               var11 = v
            }
         }

         return ULong.box_impl/* $VF was: box-impl */(maxElem)
      }
   }
}

@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
public fun UShortArray.sortDescending(fromIndex: Int, toIndex: Int) {
   UArraysKt.sort_Aa5vz7o/* $VF was: sort-Aa5vz7o */(`$this$sortDescending_u2dAa5vz7o`, fromIndex, toIndex)
   ArraysKt.reverse((short[])`$this$sortDescending_u2dAa5vz7o`, fromIndex, toIndex)
}

@InlineOnly
@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
@ExperimentalUnsignedTypes
public inline fun <R, C : MutableCollection<in Any>> UShortArray.flatMapIndexedTo(destination: Any, transform: (Int, UShort) -> Iterable<Any>): Any {
   var index: Int = 0
   var var4: Int = 0

   for (var5 in size..var4) {
      CollectionsKt.addAll(
         destination,
         transform(
            index++, UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$flatMapIndexedTo_u2dQqktQ3k`, var4))
         ) as java.lang.Iterable
      )
   }

   return (C)destination
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public infix fun <R> UIntArray.zip(other: Array<out Any>): List<Pair<UInt, Any>> {
   val var2: IntArray = `$this$zip_u2dC_u2dE_24M`
   val var3: Int = Math.min(size, other.length)
   val var4: ArrayList = ArrayList(var3)

   repeat(var3) { var5 ->
      var4.add(UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(var2, var5)) to other[var5])
   }

   return var4
}

@InlineOnly
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public inline fun ULongArray.sum(): ULong {
   return ULong.constructor_impl/* $VF was: constructor-impl */(ArraysKt.sum(`$this$sum_u2dQwZRm1k`))
}

@SinceKotlin(version = "1.3")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun UIntArray.sum(): UInt {
   return UInt.constructor_impl/* $VF was: constructor-impl */(ArraysKt.sum(`$this$sum_u2d_u2dajY_u2d9A`))
}

@Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = []))
@DeprecatedSinceKotlin(warningSince = "1.5")
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun UShortArray.sumByDouble(selector: (UShort) -> Double): Double {
   var sum: Double = 0.0
   var var4: Int = 0

   for (var5 in size..var4) {
      sum += (selector(UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$sumByDouble_u2dxTcfx_M`, var4))) as java.lang.Number)
         .doubleValue()
      }

   return sum
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun <R> UShortArray.foldRightIndexed(initial: Any, operation: (Int, UShort, Any) -> Any): Any {
   var index: Int = ArraysKt.getLastIndex(`$this$foldRightIndexed_u2dbzxtMww`)
   var var6: Any = initial

   while (index >= 0) {
      var6 = operation(
         index, UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$foldRightIndexed_u2dbzxtMww`, index)), var6
      )
      index--
   }

   return (R)var6
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public fun UShortArray.sortedArray(): UShortArray {
   if (UShortArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$sortedArray_u2drL5Bavg`)) {
      return `$this$sortedArray_u2drL5Bavg`
   } else {
      val var10000: ShortArray = Arrays.copyOf(`$this$sortedArray_u2drL5Bavg`, `$this$sortedArray_u2drL5Bavg`.length)
      val var1: ShortArray = UShortArray.constructor_impl/* $VF was: constructor-impl */(var10000)
      UArraysKt.sort_rL5Bavg/* $VF was: sort-rL5Bavg */(var1)
      return var1
   }
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun UShortArray.reduceIndexed(operation: (Int, UShort, UShort) -> UShort): UShort {
   if (UShortArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$reduceIndexed_u2daLgx1Fo`)) {
      throw UnsupportedOperationException("Empty array can't be reduced.")
   } else {
      var accumulator: Short = UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$reduceIndexed_u2daLgx1Fo`, 0)
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$reduceIndexed_u2daLgx1Fo`)).iterator()

      while (var3.hasNext()) {
         val var6: Int = var3.nextInt()
         accumulator = (operation(
               var6,
               UShort.box_impl/* $VF was: box-impl */(accumulator),
               UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$reduceIndexed_u2daLgx1Fo`, var6))
            ) as UShort)
            .unbox_impl/* $VF was: unbox-impl */()
         }

      return accumulator
   }
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
public inline fun UByteArray.reverse(fromIndex: Int, toIndex: Int) {
   ArraysKt.reverse((byte[])`$this$reverse_u2d4UcCI2c`, fromIndex, toIndex)
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.7")
@JvmName(name = "maxWithOrThrow-U")
public fun UIntArray.maxWith(comparator: Comparator<in UInt>): UInt {
   if (UIntArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$maxWith_u2dYmdZ_VM`)) {
      throw NoSuchElementException()
   } else {
      var max: Int = UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$maxWith_u2dYmdZ_VM`, 0)
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxWith_u2dYmdZ_VM`)).iterator()

      while (var3.hasNext()) {
         val var7: Int = UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$maxWith_u2dYmdZ_VM`, var3.nextInt())
         if (comparator.compare(UInt.box_impl/* $VF was: box-impl */(max), UInt.box_impl/* $VF was: box-impl */(var7)) < 0) {
            max = var7
         }
      }

      return max
   }
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public fun UShortArray.sliceArray(indices: IntRange): UShortArray {
   return UShortArray.constructor_impl/* $VF was: constructor-impl */(ArraysKt.sliceArray((short[])`$this$sliceArray_u2dQ6IL4kU`, indices))
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
public fun UByteArray.maxWithOrNull(comparator: Comparator<in UByte>): UByte? {
   if (UByteArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$maxWithOrNull_u2dXMRcp5o`)) {
      return null
   } else {
      var max: Byte = UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$maxWithOrNull_u2dXMRcp5o`, 0)
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxWithOrNull_u2dXMRcp5o`)).iterator()

      while (var3.hasNext()) {
         val var7: Byte = UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$maxWithOrNull_u2dXMRcp5o`, var3.nextInt())
         if (comparator.compare(UByte.box_impl/* $VF was: box-impl */(max), UByte.box_impl/* $VF was: box-impl */(var7)) < 0) {
            max = var7
         }
      }

      return UByte.box_impl/* $VF was: box-impl */(max)
   }
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun <R> UShortArray.foldRight(initial: Any, operation: (UShort, Any) -> Any): Any {
   var index: Int = ArraysKt.getLastIndex(`$this$foldRight_u2dzww5nb8`)
   var var6: Any = initial

   while (index >= 0) {
      var6 = operation(UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$foldRight_u2dzww5nb8`, index--)), var6)
   }

   return (R)var6
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
public fun ULongArray.sort(fromIndex: Int = ..., toIndex: Int = ...) {
   AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(fromIndex, toIndex, size)
   UArraySortingKt.sortArray__nroSd4/* $VF was: sortArray--nroSd4 */(`$this$sort_u2d_u2dnroSd4`, fromIndex, toIndex)
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public fun UByteArray.lastOrNull(): UByte? {
   return if (UByteArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$lastOrNull_u2dGBYM_sE`))
      null
      else
      UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$lastOrNull_u2dGBYM_sE`, size - 1))
   }

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun <R, C : MutableCollection<in Any>> UIntArray.flatMapTo(destination: Any, transform: (UInt) -> Iterable<Any>): Any {
   var var3: Int = 0

   for (var4 in size..var3) {
      CollectionsKt.addAll(
         destination,
         transform(UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$flatMapTo_u2dwU5IKMo`, var3))) as java.lang.Iterable
      )
   }

   return (C)destination
}

@SinceKotlin(version = "1.3")
@InlineOnly
@ExperimentalUnsignedTypes
public inline operator fun UIntArray.plus(elements: UIntArray): UIntArray {
   return UIntArray.constructor_impl/* $VF was: constructor-impl */(ArraysKt.plus(`$this$plus_u2dctEhBpI`, elements))
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun UShortArray.dropLastWhile(predicate: (UShort) -> Boolean): List<UShort> {
   for (index in ArraysKt.getLastIndex(`$this$dropLastWhile_u2dxTcfx_M`) downTo 0) {
      if (!predicate(UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$dropLastWhile_u2dxTcfx_M`, index))) as java.lang.Boolean
         )
       {
         return UArraysKt.take_nggk6HY/* $VF was: take-nggk6HY */(`$this$dropLastWhile_u2dxTcfx_M`, index + 1)
      }
   }

   return CollectionsKt.emptyList()
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public inline operator fun UShortArray.plus(elements: UShortArray): UShortArray {
   return UShortArray.constructor_impl/* $VF was: constructor-impl */(ArraysKt.plus(`$this$plus_u2dmazbYpA`, elements))
}

@JvmName(name = "minWithOrThrow-U")
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.7")
public fun UIntArray.minWith(comparator: Comparator<in UInt>): UInt {
   if (UIntArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$minWith_u2dYmdZ_VM`)) {
      throw NoSuchElementException()
   } else {
      var min: Int = UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$minWith_u2dYmdZ_VM`, 0)
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minWith_u2dYmdZ_VM`)).iterator()

      while (var3.hasNext()) {
         val var7: Int = UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$minWith_u2dYmdZ_VM`, var3.nextInt())
         if (comparator.compare(UInt.box_impl/* $VF was: box-impl */(min), UInt.box_impl/* $VF was: box-impl */(var7)) > 0) {
            min = var7
         }
      }

      return min
   }
}

@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
public fun ULongArray?.contentToString(): String {
   if (`$this$contentToString_u2duLth9ew` != null) {
      val var10000: java.lang.String = CollectionsKt.joinToString$default(
         ULongArray.box_impl/* $VF was: box-impl */(`$this$contentToString_u2duLth9ew`), ", ", "[", "]", 0, null, null, 56, null
      )
      if (var10000 != null) {
         return var10000
      }
   }

   return "null"
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public fun ULongArray.sliceArray(indices: Collection<Int>): ULongArray {
   return ULongArray.constructor_impl/* $VF was: constructor-impl */(ArraysKt.sliceArray(`$this$sliceArray_u2dkzHmqpY`, indices))
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun <K> UByteArray.groupBy(keySelector: (UByte) -> Any): Map<Any, List<UByte>> {
   val var2: ByteArray = `$this$groupBy_u2dJOV_ifY`
   val var3: java.util.Map = LinkedHashMap()
   var var4: Int = 0

   for (var5 in size..var4) {
      val var6: Byte = UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(var2, var4)
      val var7: Any = keySelector(UByte.box_impl/* $VF was: box-impl */(var6))
      var var10000: Any = var3.get(var7)
      if (var10000 == null) {
         val var9: java.util.List = ArrayList()
         var3.put(var7, var9)
         var10000 = var9
      }

      (var10000 as java.util.List).add(UByte.box_impl/* $VF was: box-impl */(var6))
   }

   return var3
}

@SinceKotlin(version = "1.4")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun <R> UShortArray.runningFold(initial: Any, operation: (Any, UShort) -> Any): List<Any> {
   if (UShortArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$runningFold_u2dzww5nb8`)) {
      return (java.util.List<R>)CollectionsKt.listOf(initial)
   } else {
      val accumulator: ArrayList = ArrayList(size + 1)
      accumulator.add(initial)
      val result: ArrayList = accumulator
      var var8: Any = initial
      var var9: Int = 0

      for (var10 in size..var9) {
         var8 = operation(var8, UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$runningFold_u2dzww5nb8`, var9)))
         result.add(var8)
      }

      return result
   }
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun UShortArray.forEach(action: (UShort) -> Unit) {
   var var2: Int = 0

   for (var3 in size..var2) {
      action(UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$forEach_u2dxTcfx_M`, var2)))
   }
}

@ExperimentalUnsignedTypes
@OverloadResolutionByLambdaReturnType
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun <R> ULongArray.minOfWith(comparator: Comparator<in Any>, selector: (ULong) -> Any): Any {
   if (ULongArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$minOfWith_u2d5NtCtWE`)) {
      throw NoSuchElementException()
   } else {
      var minValue: Any = selector(ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$minOfWith_u2d5NtCtWE`, 0)))
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfWith_u2d5NtCtWE`)).iterator()

      while (var4.hasNext()) {
         val var8: Any = selector(
            ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$minOfWith_u2d5NtCtWE`, var4.nextInt()))
         )
         if (comparator.compare(minValue, var8) > 0) {
            minValue = var8
         }
      }

      return (R)minValue
   }
}

@SinceKotlin(version = "1.3")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun UShortArray.takeWhile(predicate: (UShort) -> Boolean): List<UShort> {
   val list: ArrayList = ArrayList()
   var var3: Int = 0

   for (var4 in size..var3) {
      val item: Short = UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$takeWhile_u2dxTcfx_M`, var3)
      if (!predicate(UShort.box_impl/* $VF was: box-impl */(item)) as java.lang.Boolean) {
         break
      }

      list.add(UShort.box_impl/* $VF was: box-impl */(item))
   }

   return list
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public inline operator fun ULongArray.component4(): ULong {
   return ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$component4_u2dQwZRm1k`, 3)
}

@OverloadResolutionByLambdaReturnType
@JvmName(name = "sumOfULong")
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@InlineOnly
public inline fun UByteArray.sumOf(selector: (UByte) -> ULong): ULong {
   var sum: Long = ULong.constructor_impl/* $VF was: constructor-impl */(0L)
   var var4: Int = 0

   for (var5 in size..var4) {
      sum = ULong.constructor_impl/* $VF was: constructor-impl */(
         sum
            + (selector(UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$sumOf_u2dJOV_ifY`, var4))) as ULong)
               .unbox_impl/* $VF was: unbox-impl */()
      )
   }

   return sum
}

@InlineOnly
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public inline fun UIntArray.first(predicate: (UInt) -> Boolean): UInt {
   var var2: Int = 0

   for (var3 in size..var2) {
      val element: Int = UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$first_u2djgv0xPQ`, var2)
      if (predicate(UInt.box_impl/* $VF was: box-impl */(element)) as java.lang.Boolean) {
         return element
      }
   }

   throw NoSuchElementException("Array contains no element matching the predicate.")
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public fun ULongArray.withIndex(): Iterable<IndexedValue<ULong>> {
   return IndexingIterable<>(   // $VF: Compiled from _UArrays.kt
{
      return ULongArray.iterator_impl/* $VF was: iterator-impl */($this$withIndex_u2dQwZRm1k)
   } as () -> MutableIterator<ULong>)
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public inline fun ULongArray.none(predicate: (ULong) -> Boolean): Boolean {
   var var2: Int = 0

   for (var3 in size..var2) {
      if (predicate(ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$none_u2dMShoTSo`, var2))) as java.lang.Boolean
         )
       {
         return false
      }
   }

   return true
}

@InlineOnly
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
public inline fun ULongArray.maxOf(selector: (ULong) -> Double): Double {
   if (ULongArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$maxOf_u2dMShoTSo`)) {
      throw NoSuchElementException()
   } else {
      var maxValue: Double = (selector(ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$maxOf_u2dMShoTSo`, 0))) as java.lang.Number)
         .doubleValue()
         val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOf_u2dMShoTSo`)).iterator()

      while (var4.hasNext()) {
         maxValue = Math.max(
            maxValue,
            (selector(ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$maxOf_u2dMShoTSo`, var4.nextInt()))) as java.lang.Number)
               .doubleValue()
         )
      }

      return maxValue
   }
}

@OverloadResolutionByLambdaReturnType
@InlineOnly
@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
public inline fun <R : Comparable<Any>> UByteArray.maxOf(selector: (UByte) -> Any): Any {
   if (UByteArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$maxOf_u2dJOV_ifY`)) {
      throw NoSuchElementException()
   } else {
      var maxValue: java.lang.Comparable = selector(
         UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$maxOf_u2dJOV_ifY`, 0))
      ) as java.lang.Comparable
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOf_u2dJOV_ifY`)).iterator()

      while (var3.hasNext()) {
         val var7: java.lang.Comparable = selector(
            UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$maxOf_u2dJOV_ifY`, var3.nextInt()))
         ) as java.lang.Comparable
         if (maxValue.compareTo(var7) < 0) {
            maxValue = var7
         }
      }

      return (R)maxValue
   }
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public inline fun UIntArray.findLast(predicate: (UInt) -> Boolean): UInt? {
   val var2: IntArray = `$this$findLast_u2djgv0xPQ`
   var var3: Int = size + -1
   if (0 <= var3) {
      do {
         val var5: Int = UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(var2, var3--)
         if (predicate(UInt.box_impl/* $VF was: box-impl */(var5)) as java.lang.Boolean) {
            return UInt.box_impl/* $VF was: box-impl */(var5)
         }
      } while (0 <= var3)
   }

   return null
}

@JvmName(name = "sumOfDouble")
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun UByteArray.sumOf(selector: (UByte) -> Double): Double {
   var sum: Double = 0.0
   var var4: Int = 0

   for (var5 in size..var4) {
      sum += (selector(UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$sumOf_u2dJOV_ifY`, var4))) as java.lang.Number)
         .doubleValue()
      }

   return sum
}

@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@JvmName(name = "sumOfULong")
@SinceKotlin(version = "1.5")
public fun Array<out ULong>.sum(): ULong {
   var sum: Long = 0L
   var var3: Int = 0

   for (var4 in `$this$sum`.length..var3) {
      sum = ULong.constructor_impl/* $VF was: constructor-impl */(sum + `$this$sum`[var3].unbox_impl/* $VF was: unbox-impl */())
   }

   return sum
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
public inline fun <V, M : MutableMap<in ULong, in Any>> ULongArray.associateWithTo(destination: Any, valueSelector: (ULong) -> Any): Any {
   var var3: Int = 0

   for (var4 in size..var3) {
      val element: Long = ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$associateWithTo_u2dX6OPwNk`, var3)
      destination.put(ULong.box_impl/* $VF was: box-impl */(element), valueSelector(ULong.box_impl/* $VF was: box-impl */(element)))
   }

   return (M)destination
}

@InlineOnly
@ExperimentalUnsignedTypes
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
public inline fun <R> UIntArray.flatMapIndexed(transform: (Int, UInt) -> Iterable<Any>): List<Any> {
   val var2: IntArray = `$this$flatMapIndexed_u2dWyvcNBI`
   val var3: java.util.Collection = ArrayList()
   var var4: Int = 0
   var var5: Int = 0

   for (var6 in size..var5) {
      CollectionsKt.addAll(
         var3, transform(var4++, UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(var2, var5))) as java.lang.Iterable
      )
   }

   return var3 as MutableList<R>
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun UIntArray.takeLastWhile(predicate: (UInt) -> Boolean): List<UInt> {
   for (index in ArraysKt.getLastIndex(`$this$takeLastWhile_u2djgv0xPQ`) downTo 0) {
      if (!predicate(UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$takeLastWhile_u2djgv0xPQ`, index))) as java.lang.Boolean
         )
       {
         return UArraysKt.drop_qFRl0hI/* $VF was: drop-qFRl0hI */(`$this$takeLastWhile_u2djgv0xPQ`, index + 1)
      }
   }

   return CollectionsKt.toList(UIntArray.box_impl/* $VF was: box-impl */(`$this$takeLastWhile_u2djgv0xPQ`))
}

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@JvmName(name = "sumOfULong")
@OverloadResolutionByLambdaReturnType
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun ULongArray.sumOf(selector: (ULong) -> ULong): ULong {
   var sum: Long = ULong.constructor_impl/* $VF was: constructor-impl */(0L)
   var var4: Int = 0

   for (var5 in size..var4) {
      sum = ULong.constructor_impl/* $VF was: constructor-impl */(
         sum
            + (selector(ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$sumOf_u2dMShoTSo`, var4))) as ULong)
               .unbox_impl/* $VF was: unbox-impl */()
      )
   }

   return sum
}

@SinceKotlin(version = "1.3")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun <R> ULongArray.foldIndexed(initial: Any, operation: (Int, Any, ULong) -> Any): Any {
   var index: Int = 0
   var accumulator: Any = initial
   var var5: Int = 0

   for (var6 in size..var5) {
      accumulator = operation(
         index++, accumulator, ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$foldIndexed_u2dmwnnOCs`, var5))
      )
   }

   return (R)accumulator
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public infix fun <R> UShortArray.zip(other: Array<out Any>): List<Pair<UShort, Any>> {
   val var2: ShortArray = `$this$zip_u2duaTIQ5s`
   val var3: Int = Math.min(size, other.length)
   val var4: ArrayList = ArrayList(var3)

   repeat(var3) { var5 ->
      var4.add(UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(var2, var5)) to other[var5])
   }

   return var4
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun ULongArray.random(): ULong {
   return UArraysKt.random_JzugnMA/* $VF was: random-JzugnMA */(`$this$random_u2dQwZRm1k`, Random.Default)
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public inline fun UIntArray.copyOfRange(fromIndex: Int, toIndex: Int): UIntArray {
   val var10000: IntArray
   if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
      var10000 = ArraysKt.copyOfRange((int[])`$this$copyOfRange_u2doBK06Vg`, fromIndex, toIndex)
   } else {
      if (toIndex > `$this$copyOfRange_u2doBK06Vg`.length) {
         throw IndexOutOfBoundsException("toIndex: $toIndex, size: ${`$this$copyOfRange_u2doBK06Vg`.length}")
      }

      val var4: IntArray = Arrays.copyOfRange(`$this$copyOfRange_u2doBK06Vg`, fromIndex, toIndex)
      var10000 = var4
   }

   return UIntArray.constructor_impl/* $VF was: constructor-impl */(var10000)
}

@InlineOnly
@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
public inline fun <V, M : MutableMap<in UShort, in Any>> UShortArray.associateWithTo(destination: Any, valueSelector: (UShort) -> Any): Any {
   var var3: Int = 0

   for (var4 in size..var3) {
      val element: Short = UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$associateWithTo_u2dciTST_u2d8`, var3)
      destination.put(UShort.box_impl/* $VF was: box-impl */(element), valueSelector(UShort.box_impl/* $VF was: box-impl */(element)))
   }

   return (M)destination
}

@InlineOnly
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public inline fun <R> UIntArray.fold(initial: Any, operation: (Any, UInt) -> Any): Any {
   var accumulator: Any = initial
   var var4: Int = 0

   for (var5 in size..var4) {
      accumulator = operation(accumulator, UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$fold_u2dzi1B2BA`, var4)))
   }

   return (R)accumulator
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun UByteArray.reduceIndexed(operation: (Int, UByte, UByte) -> UByte): UByte {
   if (UByteArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$reduceIndexed_u2dEOyYB1Y`)) {
      throw UnsupportedOperationException("Empty array can't be reduced.")
   } else {
      var accumulator: Byte = UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$reduceIndexed_u2dEOyYB1Y`, 0)
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$reduceIndexed_u2dEOyYB1Y`)).iterator()

      while (var3.hasNext()) {
         val var6: Int = var3.nextInt()
         accumulator = (operation(
               var6,
               UByte.box_impl/* $VF was: box-impl */(accumulator),
               UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$reduceIndexed_u2dEOyYB1Y`, var6))
            ) as UByte)
            .unbox_impl/* $VF was: unbox-impl */()
         }

      return accumulator
   }
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun UShortArray.filterNot(predicate: (UShort) -> Boolean): List<UShort> {
   val var2: ShortArray = `$this$filterNot_u2dxTcfx_M`
   val var3: java.util.Collection = ArrayList()
   var var4: Int = 0

   for (var5 in size..var4) {
      val var6: Short = UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(var2, var4)
      if (!predicate(UShort.box_impl/* $VF was: box-impl */(var6)) as java.lang.Boolean) {
         var3.add(UShort.box_impl/* $VF was: box-impl */(var6))
      }
   }

   return var3 as MutableList<UShort>
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline operator fun UIntArray.component1(): UInt {
   return UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$component1_u2d_u2dajY_u2d9A`, 0)
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun UIntArray.takeWhile(predicate: (UInt) -> Boolean): List<UInt> {
   val list: ArrayList = ArrayList()
   var var3: Int = 0

   for (var4 in size..var3) {
      val item: Int = UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$takeWhile_u2djgv0xPQ`, var3)
      if (!predicate(UInt.box_impl/* $VF was: box-impl */(item)) as java.lang.Boolean) {
         break
      }

      list.add(UInt.box_impl/* $VF was: box-impl */(item))
   }

   return list
}

@OverloadResolutionByLambdaReturnType
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun <R : Comparable<Any>> UByteArray.minOfOrNull(selector: (UByte) -> Any): Any? {
   if (UByteArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$minOfOrNull_u2dJOV_ifY`)) {
      return null
   } else {
      var minValue: java.lang.Comparable = selector(
         UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$minOfOrNull_u2dJOV_ifY`, 0))
      ) as java.lang.Comparable
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfOrNull_u2dJOV_ifY`)).iterator()

      while (var3.hasNext()) {
         val var7: java.lang.Comparable = selector(
            UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$minOfOrNull_u2dJOV_ifY`, var3.nextInt()))
         ) as java.lang.Comparable
         if (minValue.compareTo(var7) > 0) {
            minValue = var7
         }
      }

      return (R)minValue
   }
}

@SinceKotlin(version = "1.7")
@JvmName(name = "minWithOrThrow-U")
@ExperimentalUnsignedTypes
public fun UShortArray.minWith(comparator: Comparator<in UShort>): UShort {
   if (UShortArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$minWith_u2deOHTfZs`)) {
      throw NoSuchElementException()
   } else {
      var min: Short = UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$minWith_u2deOHTfZs`, 0)
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minWith_u2deOHTfZs`)).iterator()

      while (var3.hasNext()) {
         val var7: Short = UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$minWith_u2deOHTfZs`, var3.nextInt())
         if (comparator.compare(UShort.box_impl/* $VF was: box-impl */(min), UShort.box_impl/* $VF was: box-impl */(var7)) > 0) {
            min = var7
         }
      }

      return min
   }
}

@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
@OverloadResolutionByLambdaReturnType
@InlineOnly
public inline fun <R, C : MutableCollection<in Any>> UByteArray.flatMapIndexedTo(destination: Any, transform: (Int, UByte) -> Iterable<Any>): Any {
   var index: Int = 0
   var var4: Int = 0

   for (var5 in size..var4) {
      CollectionsKt.addAll(
         destination,
         transform(index++, UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$flatMapIndexedTo_u2deNpIKz8`, var4))) as java.lang.Iterable
      )
   }

   return (C)destination
}

@SinceKotlin(version = "1.5")
@JvmName(name = "sumOfUShort")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
public fun Array<out UShort>.sum(): UInt {
   var sum: Int = 0
   var var2: Int = 0

   for (var3 in `$this$sum`.length..var2) {
      sum = UInt.constructor_impl/* $VF was: constructor-impl */(
         sum + UInt.constructor_impl/* $VF was: constructor-impl */(`$this$sum`[var2].unbox_impl/* $VF was: unbox-impl */() and 65535)
      )
   }

   return sum
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public fun UByteArray.take(n: Int): List<UByte> {
   if (n < 0) {
      throw IllegalArgumentException(("Requested element count $n is less than zero.").toString())
   } else if (n == 0) {
      return CollectionsKt.emptyList()
   } else if (n >= size) {
      return CollectionsKt.toList(UByteArray.box_impl/* $VF was: box-impl */(`$this$take_u2dPpDY95g`))
   } else if (n == 1) {
      return CollectionsKt.listOf(UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$take_u2dPpDY95g`, 0)))
   } else {
      val var7: Int = 0
      val list: ArrayList = ArrayList(n)
      var var4: Int = 0

      for (var5 in size..var4) {
         list.add(UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$take_u2dPpDY95g`, var4)))
         if (++var7 == n) {
            break
         }
      }

      return list
   }
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public infix fun <R> UIntArray.zip(other: Iterable<Any>): List<Pair<UInt, Any>> {
   val var2: IntArray = `$this$zip_u2dHwE9HBo`
   val var3: Int = size
   val var4: ArrayList = ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(other, 10), var3))
   var var5: Int = 0

   for (var7 in other) {
      if (var5 >= var3) {
         break
      }

      var4.add(UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(var2, var5++)) to var7)
   }

   return var4
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public inline fun UShortArray.last(): UShort {
   return UShort.constructor_impl/* $VF was: constructor-impl */(ArraysKt.last(`$this$last_u2drL5Bavg`))
}

@SinceKotlin(version = "1.3")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun UShortArray.first(): UShort {
   return UShort.constructor_impl/* $VF was: constructor-impl */(ArraysKt.first(`$this$first_u2drL5Bavg`))
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public inline fun UByteArray.last(predicate: (UByte) -> Boolean): UByte {
   var var2: Int = size + -1
   if (0 <= var2) {
      do {
         val element: Byte = UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$last_u2dJOV_ifY`, var2--)
         if (predicate(UByte.box_impl/* $VF was: box-impl */(element)) as java.lang.Boolean) {
            return element
         }
      } while (0 <= var2)
   }

   throw NoSuchElementException("Array contains no element matching the predicate.")
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun UShortArray.copyOf(newSize: Int): UShortArray {
   val var10000: ShortArray = Arrays.copyOf(`$this$copyOf_u2dnggk6HY`, newSize)
   return UShortArray.constructor_impl/* $VF was: constructor-impl */(var10000)
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public inline fun <R> UByteArray.fold(initial: Any, operation: (Any, UByte) -> Any): Any {
   var accumulator: Any = initial
   var var4: Int = 0

   for (var5 in size..var4) {
      accumulator = operation(
         accumulator, UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$fold_u2dyXmHNn8`, var4))
      )
   }

   return (R)accumulator
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun ULongArray.first(predicate: (ULong) -> Boolean): ULong {
   var var2: Int = 0

   for (var3 in size..var2) {
      val element: Long = ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$first_u2dMShoTSo`, var2)
      if (predicate(ULong.box_impl/* $VF was: box-impl */(element)) as java.lang.Boolean) {
         return element
      }
   }

   throw NoSuchElementException("Array contains no element matching the predicate.")
}

@InlineOnly
@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
@OverloadResolutionByLambdaReturnType
public inline fun ULongArray.minOf(selector: (ULong) -> Float): Float {
   if (ULongArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$minOf_u2dMShoTSo`)) {
      throw NoSuchElementException()
   } else {
      var minValue: Float = (selector(ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$minOf_u2dMShoTSo`, 0))) as java.lang.Number)
         .floatValue()
         val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOf_u2dMShoTSo`)).iterator()

      while (var3.hasNext()) {
         minValue = Math.min(
            minValue,
            (selector(ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$minOf_u2dMShoTSo`, var3.nextInt()))) as java.lang.Number)
               .floatValue()
         )
      }

      return minValue
   }
}

@SinceKotlin(version = "1.3")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun ByteArray.toUByteArray(): UByteArray {
   val var10000: ByteArray = Arrays.copyOf(`$this$toUByteArray`, `$this$toUByteArray`.length)
   return UByteArray.constructor_impl/* $VF was: constructor-impl */(var10000)
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public fun UIntArray.sortDescending() {
   if (size > 1) {
      UArraysKt.sort__ajY_9A/* $VF was: sort--ajY-9A */(`$this$sortDescending_u2d_u2dajY_u2d9A`)
      ArraysKt.reverse(`$this$sortDescending_u2d_u2dajY_u2d9A`)
   }
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public inline fun UShortArray.sum(): UInt {
   val var1: ShortArray = `$this$sum_u2drL5Bavg`
   var var2: Int = UInt.constructor_impl/* $VF was: constructor-impl */(0)
   var var3: Int = 0

   for (var4 in size..var3) {
      var2 = UInt.constructor_impl/* $VF was: constructor-impl */(
         var2 + UInt.constructor_impl/* $VF was: constructor-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(var1, var3) and 65535)
      )
   }

   return var2
}

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
@JvmName(name = "sumOfLong")
@InlineOnly
public inline fun UIntArray.sumOf(selector: (UInt) -> Long): Long {
   var sum: Long = 0L
   var var4: Int = 0

   for (var5 in size..var4) {
      sum += (selector(UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$sumOf_u2djgv0xPQ`, var4))) as java.lang.Number)
         .longValue()
      }

   return sum
}

@ExperimentalUnsignedTypes
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun UByteArray.maxOf(selector: (UByte) -> Float): Float {
   if (UByteArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$maxOf_u2dJOV_ifY`)) {
      throw NoSuchElementException()
   } else {
      var maxValue: Float = (selector(UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$maxOf_u2dJOV_ifY`, 0))) as java.lang.Number)
         .floatValue()
         val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOf_u2dJOV_ifY`)).iterator()

      while (var3.hasNext()) {
         maxValue = Math.max(
            maxValue,
            (selector(UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$maxOf_u2dJOV_ifY`, var3.nextInt()))) as java.lang.Number)
               .floatValue()
         )
      }

      return maxValue
   }
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun UByteArray.copyOfRange(fromIndex: Int, toIndex: Int): UByteArray {
   val var10000: ByteArray
   if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
      var10000 = ArraysKt.copyOfRange((byte[])`$this$copyOfRange_u2d4UcCI2c`, fromIndex, toIndex)
   } else {
      if (toIndex > `$this$copyOfRange_u2d4UcCI2c`.length) {
         throw IndexOutOfBoundsException("toIndex: $toIndex, size: ${`$this$copyOfRange_u2d4UcCI2c`.length}")
      }

      val var4: ByteArray = Arrays.copyOfRange(`$this$copyOfRange_u2d4UcCI2c`, fromIndex, toIndex)
      var10000 = var4
   }

   return UByteArray.constructor_impl/* $VF was: constructor-impl */(var10000)
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
public fun ULongArray?.contentHashCode(): Int {
   var var10000: LongArray = `$this$contentHashCode_u2duLth9ew`
   if (`$this$contentHashCode_u2duLth9ew` == null) {
      var10000 = null
   }

   return Arrays.hashCode(var10000)
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public inline fun UIntArray.all(predicate: (UInt) -> Boolean): Boolean {
   var var2: Int = 0

   for (var3 in size..var2) {
      if (!predicate(UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$all_u2djgv0xPQ`, var2))) as java.lang.Boolean) {
         return false
      }
   }

   return true
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public infix fun <R> ULongArray.zip(other: Array<out Any>): List<Pair<ULong, Any>> {
   val var2: LongArray = `$this$zip_u2df7H3mmw`
   val var3: Int = Math.min(size, other.length)
   val var4: ArrayList = ArrayList(var3)

   repeat(var3) { var5 ->
      var4.add(ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(var2, var5)) to other[var5])
   }

   return var4
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun UIntArray.filterIndexed(predicate: (Int, UInt) -> Boolean): List<UInt> {
   val var3: java.util.Collection = ArrayList()
   val var4: IntArray = `$this$filterIndexed_u2dWyvcNBI`
   val var5: Int = 0
   var var6: Int = 0

   for (var7 in size..var6) {
      val var8: Int = UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(var4, var6)
      if (predicate(var5++, UInt.box_impl/* $VF was: box-impl */(var8)) as java.lang.Boolean) {
         var3.add(UInt.box_impl/* $VF was: box-impl */(var8))
      }
   }

   return var3 as MutableList<UInt>
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
public fun UByteArray.shuffle(random: Random) {
   for (i in ArraysKt.getLastIndex(`$this$shuffle_u2doSF2wD8`) downTo 1) {
      val var5: Int = random.nextInt(i + 1)
      val var6: Byte = UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$shuffle_u2doSF2wD8`, i)
      UByteArray.set_VurrAj0/* $VF was: set-VurrAj0 */(
         `$this$shuffle_u2doSF2wD8`, i, UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$shuffle_u2doSF2wD8`, var5)
      )
      UByteArray.set_VurrAj0/* $VF was: set-VurrAj0 */(`$this$shuffle_u2doSF2wD8`, var5, var6)
   }
}

@JvmName(name = "maxOrThrow-U")
@SinceKotlin(version = "1.7")
@ExperimentalUnsignedTypes
public fun UByteArray.max(): UByte {
   if (UByteArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$max_u2dGBYM_sE`)) {
      throw NoSuchElementException()
   } else {
      var max: Byte = UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$max_u2dGBYM_sE`, 0)
      val var2: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$max_u2dGBYM_sE`)).iterator()

      while (var2.hasNext()) {
         val var6: Byte = UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$max_u2dGBYM_sE`, var2.nextInt())
         if (Intrinsics.compare(max and 255, var6 and 255) < 0) {
            max = var6
         }
      }

      return max
   }
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public operator fun UIntArray.plus(elements: Collection<UInt>): UIntArray {
   var index: Int = size
   val var10000: IntArray = Arrays.copyOf(`$this$plus_u2dCFIt9YE`, size + elements.size())
   val result: IntArray = var10000
   val var4: java.util.Iterator = elements.iterator()

   while (var4.hasNext()) {
      result[index++] = (var4.next() as UInt).unbox_impl/* $VF was: unbox-impl */()
   }

   return UIntArray.constructor_impl/* $VF was: constructor-impl */(result)
}

@OverloadResolutionByLambdaReturnType
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun UIntArray.minOf(selector: (UInt) -> Float): Float {
   if (UIntArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$minOf_u2djgv0xPQ`)) {
      throw NoSuchElementException()
   } else {
      var minValue: Float = (selector(UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$minOf_u2djgv0xPQ`, 0))) as java.lang.Number)
         .floatValue()
         val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOf_u2djgv0xPQ`)).iterator()

      while (var3.hasNext()) {
         minValue = Math.min(
            minValue,
            (selector(UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$minOf_u2djgv0xPQ`, var3.nextInt()))) as java.lang.Number)
               .floatValue()
         )
      }

      return minValue
   }
}

@InlineOnly
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public inline fun <K, V> UShortArray.groupBy(keySelector: (UShort) -> Any, valueTransform: (UShort) -> Any): Map<Any, List<Any>> {
   val var3: ShortArray = `$this$groupBy_u2d3bBvP4M`
   val var4: java.util.Map = LinkedHashMap()
   var var5: Int = 0

   for (var6 in size..var5) {
      val var7: Short = UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(var3, var5)
      val var8: Any = keySelector(UShort.box_impl/* $VF was: box-impl */(var7))
      var var10000: Any = var4.get(var8)
      if (var10000 == null) {
         val var10: java.util.List = ArrayList()
         var4.put(var8, var10)
         var10000 = var10
      }

      (var10000 as java.util.List).add(valueTransform(UShort.box_impl/* $VF was: box-impl */(var7)))
   }

   return var4
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public infix fun UShortArray.zip(other: UShortArray): List<Pair<UShort, UShort>> {
   val var2: ShortArray = `$this$zip_u2dmazbYpA`
   val var3: Int = Math.min(size, size)
   val var4: ArrayList = ArrayList(var3)

   repeat(var3) { var5 ->
      var4.add(
         UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(var2, var5)) to UShort.box_impl/* $VF was: box-impl */(
            UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(other, var5)
         )
      )
   }

   return var4
}

@ExperimentalUnsignedTypes
@InlineOnly
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
public inline fun <R : Comparable<Any>> UIntArray.maxOf(selector: (UInt) -> Any): Any {
   if (UIntArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$maxOf_u2djgv0xPQ`)) {
      throw NoSuchElementException()
   } else {
      var maxValue: java.lang.Comparable = selector(
         UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$maxOf_u2djgv0xPQ`, 0))
      ) as java.lang.Comparable
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOf_u2djgv0xPQ`)).iterator()

      while (var3.hasNext()) {
         val var7: java.lang.Comparable = selector(
            UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$maxOf_u2djgv0xPQ`, var3.nextInt()))
         ) as java.lang.Comparable
         if (maxValue.compareTo(var7) < 0) {
            maxValue = var7
         }
      }

      return (R)maxValue
   }
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun UIntArray.copyOf(): UIntArray {
   val var10000: IntArray = Arrays.copyOf(`$this$copyOf_u2d_u2dajY_u2d9A`, `$this$copyOf_u2d_u2dajY_u2d9A`.length)
   return UIntArray.constructor_impl/* $VF was: constructor-impl */(var10000)
}

@InlineOnly
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public inline fun <R> UIntArray.flatMap(transform: (UInt) -> Iterable<Any>): List<Any> {
   val var2: IntArray = `$this$flatMap_u2djgv0xPQ`
   val var3: java.util.Collection = ArrayList()
   var var4: Int = 0

   for (var5 in size..var4) {
      CollectionsKt.addAll(
         var3, transform(UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(var2, var4))) as java.lang.Iterable
      )
   }

   return var3 as MutableList<R>
}

@InlineOnly
@ExperimentalUnsignedTypes
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
public inline fun <R> UShortArray.minOfWithOrNull(comparator: Comparator<in Any>, selector: (UShort) -> Any): Any? {
   if (UShortArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$minOfWithOrNull_u2dl8EHGbQ`)) {
      return null
   } else {
      var minValue: Any = selector(
         UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$minOfWithOrNull_u2dl8EHGbQ`, 0))
      )
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfWithOrNull_u2dl8EHGbQ`)).iterator()

      while (var4.hasNext()) {
         val var8: Any = selector(
            UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$minOfWithOrNull_u2dl8EHGbQ`, var4.nextInt()))
         )
         if (comparator.compare(minValue, var8) > 0) {
            minValue = var8
         }
      }

      return (R)minValue
   }
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.7")
@JvmName(name = "maxByOrThrow-U")
public inline fun <R : Comparable<Any>> UShortArray.maxBy(selector: (UShort) -> Any): UShort {
   if (UShortArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$maxBy_u2dxTcfx_M`)) {
      throw NoSuchElementException()
   } else {
      var maxElem: Short = UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$maxBy_u2dxTcfx_M`, 0)
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$maxBy_u2dxTcfx_M`)
      if (lastIndex == 0) {
         return maxElem
      } else {
         var var9: java.lang.Comparable = selector(UShort.box_impl/* $VF was: box-impl */(maxElem)) as java.lang.Comparable
         val var10: IntIterator = IntRange(1, lastIndex).iterator()

         while (var10.hasNext()) {
            val e: Short = UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$maxBy_u2dxTcfx_M`, var10.nextInt())
            val v: java.lang.Comparable = selector(UShort.box_impl/* $VF was: box-impl */(e)) as java.lang.Comparable
            if (var9.compareTo(v) < 0) {
               maxElem = e
               var9 = v
            }
         }

         return maxElem
      }
   }
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun <R, V> UByteArray.zip(other: Array<out Any>, transform: (UByte, Any) -> Any): List<Any> {
   val size: Int = Math.min(size, other.length)
   val list: ArrayList = ArrayList(size)

   repeat(size) { i ->
      list.add(transform(UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$zip_u2dLuipOMY`, i)), other[i]))
   }

   return list
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
public fun ULongArray.shuffle() {
   UArraysKt.shuffle_JzugnMA/* $VF was: shuffle-JzugnMA */(`$this$shuffle_u2dQwZRm1k`, Random.Default)
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun UShortArray.copyInto(destination: UShortArray, destinationOffset: Int = ..., startIndex: Int = ..., endIndex: Int = ...): UShortArray {
   ArraysKt.copyInto((short[])`$this$copyInto_u2d9_u2dak10g`, (short[])destination, destinationOffset, startIndex, endIndex)
   return destination
}

@SinceKotlin(version = "1.3")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun <R, C : MutableCollection<in Any>> UIntArray.mapIndexedTo(destination: Any, transform: (Int, UInt) -> Any): Any {
   var index: Int = 0
   var var4: Int = 0

   for (var5 in size..var4) {
      destination.add(
         transform(index++, UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$mapIndexedTo_u2d_u2d6EtJGI`, var4)))
      )
   }

   return (C)destination
}

@SinceKotlin(version = "1.4")
@InlineOnly
@OverloadResolutionByLambdaReturnType
@ExperimentalUnsignedTypes
public inline fun <R> UIntArray.maxOfWith(comparator: Comparator<in Any>, selector: (UInt) -> Any): Any {
   if (UIntArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$maxOfWith_u2dmyNOsp4`)) {
      throw NoSuchElementException()
   } else {
      var maxValue: Any = selector(UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$maxOfWith_u2dmyNOsp4`, 0)))
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfWith_u2dmyNOsp4`)).iterator()

      while (var4.hasNext()) {
         val var8: Any = selector(
            UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$maxOfWith_u2dmyNOsp4`, var4.nextInt()))
         )
         if (comparator.compare(maxValue, var8) < 0) {
            maxValue = var8
         }
      }

      return (R)maxValue
   }
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun UByteArray.dropLastWhile(predicate: (UByte) -> Boolean): List<UByte> {
   for (index in ArraysKt.getLastIndex(`$this$dropLastWhile_u2dJOV_ifY`) downTo 0) {
      if (!predicate(UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$dropLastWhile_u2dJOV_ifY`, index))) as java.lang.Boolean
         )
       {
         return UArraysKt.take_PpDY95g/* $VF was: take-PpDY95g */(`$this$dropLastWhile_u2dJOV_ifY`, index + 1)
      }
   }

   return CollectionsKt.emptyList()
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public inline fun UByteArray.firstOrNull(predicate: (UByte) -> Boolean): UByte? {
   var var2: Int = 0

   for (var3 in size..var2) {
      val element: Byte = UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$firstOrNull_u2dJOV_ifY`, var2)
      if (predicate(UByte.box_impl/* $VF was: box-impl */(element)) as java.lang.Boolean) {
         return UByte.box_impl/* $VF was: box-impl */(element)
      }
   }

   return null
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public inline fun <R> UShortArray.foldIndexed(initial: Any, operation: (Int, Any, UShort) -> Any): Any {
   var index: Int = 0
   var accumulator: Any = initial
   var var5: Int = 0

   for (var6 in size..var5) {
      accumulator = operation(
         index++, accumulator, UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$foldIndexed_u2dbzxtMww`, var5))
      )
   }

   return (R)accumulator
}

@InlineOnly
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public inline operator fun UShortArray.component3(): UShort {
   return UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$component3_u2drL5Bavg`, 2)
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun ULongArray.reverse() {
   ArraysKt.reverse(`$this$reverse_u2dQwZRm1k`)
}

@InlineOnly
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public inline fun ULongArray.single(): ULong {
   return ULong.constructor_impl/* $VF was: constructor-impl */(ArraysKt.single(`$this$single_u2dQwZRm1k`))
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun UShortArray.reverse() {
   ArraysKt.reverse(`$this$reverse_u2drL5Bavg`)
}

@SinceKotlin(version = "1.3")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun UShortArray.last(predicate: (UShort) -> Boolean): UShort {
   var var2: Int = size + -1
   if (0 <= var2) {
      do {
         val element: Short = UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$last_u2dxTcfx_M`, var2--)
         if (predicate(UShort.box_impl/* $VF was: box-impl */(element)) as java.lang.Boolean) {
            return element
         }
      } while (0 <= var2)
   }

   throw NoSuchElementException("Array contains no element matching the predicate.")
}

@SinceKotlin(version = "1.4")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun <R : Comparable<Any>> ULongArray.minByOrNull(selector: (ULong) -> Any): ULong? {
   if (ULongArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$minByOrNull_u2dMShoTSo`)) {
      return null
   } else {
      var minElem: Long = ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$minByOrNull_u2dMShoTSo`, 0)
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$minByOrNull_u2dMShoTSo`)
      if (lastIndex == 0) {
         return ULong.box_impl/* $VF was: box-impl */(minElem)
      } else {
         var var11: java.lang.Comparable = selector(ULong.box_impl/* $VF was: box-impl */(minElem)) as java.lang.Comparable
         val var12: IntIterator = IntRange(1, lastIndex).iterator()

         while (var12.hasNext()) {
            val e: Long = ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$minByOrNull_u2dMShoTSo`, var12.nextInt())
            val v: java.lang.Comparable = selector(ULong.box_impl/* $VF was: box-impl */(e)) as java.lang.Comparable
            if (var11.compareTo(v) > 0) {
               minElem = e
               var11 = v
            }
         }

         return ULong.box_impl/* $VF was: box-impl */(minElem)
      }
   }
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
public infix fun UByteArray?.contentEquals(other: UByteArray?): Boolean {
   var var10000: ByteArray = `$this$contentEquals_u2dkV0jMPg`
   if (`$this$contentEquals_u2dkV0jMPg` == null) {
      var10000 = null
   }

   var var10001: ByteArray = other
   if (other == null) {
      var10001 = null
   }

   return Arrays.equals(var10000, var10001)
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.7")
@JvmName(name = "minByOrThrow-U")
@InlineOnly
public inline fun <R : Comparable<Any>> UShortArray.minBy(selector: (UShort) -> Any): UShort {
   if (UShortArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$minBy_u2dxTcfx_M`)) {
      throw NoSuchElementException()
   } else {
      var minElem: Short = UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$minBy_u2dxTcfx_M`, 0)
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$minBy_u2dxTcfx_M`)
      if (lastIndex == 0) {
         return minElem
      } else {
         var var9: java.lang.Comparable = selector(UShort.box_impl/* $VF was: box-impl */(minElem)) as java.lang.Comparable
         val var10: IntIterator = IntRange(1, lastIndex).iterator()

         while (var10.hasNext()) {
            val e: Short = UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$minBy_u2dxTcfx_M`, var10.nextInt())
            val v: java.lang.Comparable = selector(UShort.box_impl/* $VF was: box-impl */(e)) as java.lang.Comparable
            if (var9.compareTo(v) > 0) {
               minElem = e
               var9 = v
            }
         }

         return minElem
      }
   }
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun ULongArray.filterNot(predicate: (ULong) -> Boolean): List<ULong> {
   val var2: LongArray = `$this$filterNot_u2dMShoTSo`
   val var3: java.util.Collection = ArrayList()
   var var4: Int = 0

   for (var5 in size..var4) {
      val var6: Long = ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(var2, var4)
      if (!predicate(ULong.box_impl/* $VF was: box-impl */(var6)) as java.lang.Boolean) {
         var3.add(ULong.box_impl/* $VF was: box-impl */(var6))
      }
   }

   return var3 as MutableList<ULong>
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun ULongArray.any(): Boolean {
   return ArraysKt.any(`$this$any_u2dQwZRm1k`)
}

@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
public infix fun UShortArray?.contentEquals(other: UShortArray?): Boolean {
   var var10000: ShortArray = `$this$contentEquals_u2dFGO6Aew`
   if (`$this$contentEquals_u2dFGO6Aew` == null) {
      var10000 = null
   }

   var var10001: ShortArray = other
   if (other == null) {
      var10001 = null
   }

   return Arrays.equals(var10000, var10001)
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun <R, V> ULongArray.zip(other: Array<out Any>, transform: (ULong, Any) -> Any): List<Any> {
   val size: Int = Math.min(size, other.length)
   val list: ArrayList = ArrayList(size)

   repeat(size) { i ->
      list.add(transform(ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$zip_u2d8LME4QE`, i)), other[i]))
   }

   return list
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun ULongArray.copyOf(): ULongArray {
   val var10000: LongArray = Arrays.copyOf(`$this$copyOf_u2dQwZRm1k`, `$this$copyOf_u2dQwZRm1k`.length)
   return ULongArray.constructor_impl/* $VF was: constructor-impl */(var10000)
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
public fun UShortArray.shuffle(random: Random) {
   for (i in ArraysKt.getLastIndex(`$this$shuffle_u2ds5X_as8`) downTo 1) {
      val var5: Int = random.nextInt(i + 1)
      val var6: Short = UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$shuffle_u2ds5X_as8`, i)
      UShortArray.set_01HTLdE/* $VF was: set-01HTLdE */(
         `$this$shuffle_u2ds5X_as8`, i, UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$shuffle_u2ds5X_as8`, var5)
      )
      UShortArray.set_01HTLdE/* $VF was: set-01HTLdE */(`$this$shuffle_u2ds5X_as8`, var5, var6)
   }
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
public inline fun <R> UIntArray.maxOfWithOrNull(comparator: Comparator<in Any>, selector: (UInt) -> Any): Any? {
   if (UIntArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$maxOfWithOrNull_u2dmyNOsp4`)) {
      return null
   } else {
      var maxValue: Any = selector(UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$maxOfWithOrNull_u2dmyNOsp4`, 0)))
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfWithOrNull_u2dmyNOsp4`)).iterator()

      while (var4.hasNext()) {
         val var8: Any = selector(
            UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$maxOfWithOrNull_u2dmyNOsp4`, var4.nextInt()))
         )
         if (comparator.compare(maxValue, var8) < 0) {
            maxValue = var8
         }
      }

      return (R)maxValue
   }
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun UByteArray.copyOf(newSize: Int): UByteArray {
   val var10000: ByteArray = Arrays.copyOf(`$this$copyOf_u2dPpDY95g`, newSize)
   return UByteArray.constructor_impl/* $VF was: constructor-impl */(var10000)
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun UShortArray.find(predicate: (UShort) -> Boolean): UShort? {
   val var2: ShortArray = `$this$find_u2dxTcfx_M`
   var var3: Int = 0
   val var4: Int = size

   var var10000: UShort
   while (true) {
      if (var3 >= var4) {
         var10000 = null
         break
      }

      val var5: Short = UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(var2, var3)
      if (predicate(UShort.box_impl/* $VF was: box-impl */(var5)) as java.lang.Boolean) {
         var10000 = UShort.box_impl/* $VF was: box-impl */(var5)
         break
      }

      var3++
   }

   return var10000
}

@SinceKotlin(version = "1.3")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun UIntArray.elementAtOrNull(index: Int): UInt? {
   return UArraysKt.getOrNull_qFRl0hI/* $VF was: getOrNull-qFRl0hI */(`$this$elementAtOrNull_u2dqFRl0hI`, index)
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public fun UShortArray.take(n: Int): List<UShort> {
   if (n < 0) {
      throw IllegalArgumentException(("Requested element count $n is less than zero.").toString())
   } else if (n == 0) {
      return CollectionsKt.emptyList()
   } else if (n >= size) {
      return CollectionsKt.toList(UShortArray.box_impl/* $VF was: box-impl */(`$this$take_u2dnggk6HY`))
   } else if (n == 1) {
      return CollectionsKt.listOf(UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$take_u2dnggk6HY`, 0)))
   } else {
      val var7: Int = 0
      val list: ArrayList = ArrayList(n)
      var var4: Int = 0

      for (var5 in size..var4) {
         list.add(UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$take_u2dnggk6HY`, var4)))
         if (++var7 == n) {
            break
         }
      }

      return list
   }
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public fun UShortArray.toTypedArray(): Array<UShort> {
   var var1: Int = 0
   val var2: Int = size
   val var3: Array<UShort> = arrayOfNulls(var2)

   while (var1 < var2) {
      var3[var1] = UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$toTypedArray_u2drL5Bavg`, var1))
      var1++
   }

   return var3
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun UIntArray.onEach(action: (UInt) -> Unit): UIntArray {
   val `$this$onEach_jgv0xPQ_u24lambda_u2456`: IntArray = `$this$onEach_u2djgv0xPQ`
   var var5: Int = 0

   for (var6 in size..var5) {
      action(UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$onEach_jgv0xPQ_u24lambda_u2456`, var5)))
   }

   return `$this$onEach_u2djgv0xPQ`
}

@Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = []))
@DeprecatedSinceKotlin(warningSince = "1.5")
@SinceKotlin(version = "1.3")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun UShortArray.sumBy(selector: (UShort) -> UInt): UInt {
   var sum: Int = 0
   var var3: Int = 0

   for (var4 in size..var3) {
      sum = UInt.constructor_impl/* $VF was: constructor-impl */(
         sum
            + (selector(UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$sumBy_u2dxTcfx_M`, var3))) as UInt)
               .unbox_impl/* $VF was: unbox-impl */()
      )
   }

   return sum
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun ULongArray.reduceIndexedOrNull(operation: (Int, ULong, ULong) -> ULong): ULong? {
   if (ULongArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$reduceIndexedOrNull_u2dz1zDJgo`)) {
      return null
   } else {
      var accumulator: Long = ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$reduceIndexedOrNull_u2dz1zDJgo`, 0)
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$reduceIndexedOrNull_u2dz1zDJgo`)).iterator()

      while (var4.hasNext()) {
         val var7: Int = var4.nextInt()
         accumulator = (operation(
               var7,
               ULong.box_impl/* $VF was: box-impl */(accumulator),
               ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$reduceIndexedOrNull_u2dz1zDJgo`, var7))
            ) as ULong)
            .unbox_impl/* $VF was: unbox-impl */()
         }

      return ULong.box_impl/* $VF was: box-impl */(accumulator)
   }
}

@JvmName(name = "sumOfDouble")
@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
@InlineOnly
@OverloadResolutionByLambdaReturnType
public inline fun UIntArray.sumOf(selector: (UInt) -> Double): Double {
   var sum: Double = 0.0
   var var4: Int = 0

   for (var5 in size..var4) {
      sum += (selector(UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$sumOf_u2djgv0xPQ`, var4))) as java.lang.Number)
         .doubleValue()
      }

   return sum
}

@ExperimentalUnsignedTypes
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun <R> UByteArray.minOfWith(comparator: Comparator<in Any>, selector: (UByte) -> Any): Any {
   if (UByteArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$minOfWith_u2dLTi4i_s`)) {
      throw NoSuchElementException()
   } else {
      var minValue: Any = selector(UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$minOfWith_u2dLTi4i_s`, 0)))
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfWith_u2dLTi4i_s`)).iterator()

      while (var4.hasNext()) {
         val var8: Any = selector(
            UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$minOfWith_u2dLTi4i_s`, var4.nextInt()))
         )
         if (comparator.compare(minValue, var8) > 0) {
            minValue = var8
         }
      }

      return (R)minValue
   }
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
public inline fun ULongArray.onEachIndexed(action: (Int, ULong) -> Unit): ULongArray {
   val var5: LongArray = `$this$onEachIndexed_u2ds8dVfGU`
   var var6: Int = 0
   var var7: Int = 0

   for (var8 in size..var7) {
      action(var6++, ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(var5, var7)))
   }

   return `$this$onEachIndexed_u2ds8dVfGU`
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun <R> ULongArray.map(transform: (ULong) -> Any): List<Any> {
   val var2: LongArray = `$this$map_u2dMShoTSo`
   val var3: java.util.Collection = ArrayList(size)
   var var4: Int = 0

   for (var5 in size..var4) {
      var3.add(transform(ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(var2, var4))))
   }

   return var3 as MutableList<R>
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun UIntArray.toIntArray(): IntArray {
   val var10000: IntArray = Arrays.copyOf(`$this$toIntArray_u2d_u2dajY_u2d9A`, `$this$toIntArray_u2d_u2dajY_u2d9A`.length)
   return var10000
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public fun ULongArray.reversed(): List<ULong> {
   if (ULongArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$reversed_u2dQwZRm1k`)) {
      return CollectionsKt.emptyList()
   } else {
      val list: java.util.List = CollectionsKt.toMutableList(ULongArray.box_impl/* $VF was: box-impl */(`$this$reversed_u2dQwZRm1k`))
      CollectionsKt.reverse(list)
      return list
   }
}

@SinceKotlin(version = "1.4")
@InlineOnly
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@ExperimentalUnsignedTypes
public inline fun ULongArray.randomOrNull(): ULong? {
   return UArraysKt.randomOrNull_JzugnMA/* $VF was: randomOrNull-JzugnMA */(`$this$randomOrNull_u2dQwZRm1k`, Random.Default)
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public fun UIntArray.dropLast(n: Int): List<UInt> {
   if (n < 0) {
      throw IllegalArgumentException(("Requested element count $n is less than zero.").toString())
   } else {
      return UArraysKt.take_qFRl0hI/* $VF was: take-qFRl0hI */(`$this$dropLast_u2dqFRl0hI`, RangesKt.coerceAtLeast(size - n, 0))
   }
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun UShortArray.forEachIndexed(action: (Int, UShort) -> Unit) {
   var index: Int = 0
   var var3: Int = 0

   for (var4 in size..var3) {
      action(index++, UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$forEachIndexed_u2dxzaTVY8`, var3)))
   }
}

@InlineOnly
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
public inline fun <R> UByteArray.scan(initial: Any, operation: (Any, UByte) -> Any): List<Any> {
   val var3: ByteArray = `$this$scan_u2dyXmHNn8`
   val var10000: java.util.List
   if (UByteArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$scan_u2dyXmHNn8`)) {
      var10000 = CollectionsKt.listOf(initial)
   } else {
      val var4: ArrayList = ArrayList(size + 1)
      var4.add(initial)
      val var6: ArrayList = var4
      var var9: Any = initial
      var var10: Int = 0

      for (var7 in size..var10) {
         var9 = operation(var9, UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(var3, var10)))
         var6.add(var9)
      }

      var10000 = var6
   }

   return var10000
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun IntArray.asUIntArray(): UIntArray {
   return UIntArray.constructor_impl/* $VF was: constructor-impl */(`$this$asUIntArray`)
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public fun UByteArray.takeLast(n: Int): List<UByte> {
   if (n < 0) {
      throw IllegalArgumentException(("Requested element count $n is less than zero.").toString())
   } else if (n == 0) {
      return CollectionsKt.emptyList()
   } else {
      val var5: Int = size
      if (n >= var5) {
         return CollectionsKt.toList(UByteArray.box_impl/* $VF was: box-impl */(`$this$takeLast_u2dPpDY95g`))
      } else if (n == 1) {
         return CollectionsKt.listOf(
            UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$takeLast_u2dPpDY95g`, var5 + -1))
         )
      } else {
         val list: ArrayList = ArrayList(n)

         for (index in var5 - n..var5) {
            list.add(UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$takeLast_u2dPpDY95g`, index)))
         }

         return list
      }
   }
}

@InlineOnly
@ExperimentalUnsignedTypes
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.4")
public inline fun UByteArray.reduceRightOrNull(operation: (UByte, UByte) -> UByte): UByte? {
   var index: Int = ArraysKt.getLastIndex(`$this$reduceRightOrNull_u2dELGow60`)
   if (index < 0) {
      return null
   } else {
      var var6: Byte = UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$reduceRightOrNull_u2dELGow60`, index--)

      while (index >= 0) {
         var6 = (operation(
               UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$reduceRightOrNull_u2dELGow60`, index--)),
               UByte.box_impl/* $VF was: box-impl */(var6)
            ) as UByte)
            .unbox_impl/* $VF was: unbox-impl */()
         }

      return UByte.box_impl/* $VF was: box-impl */(var6)
   }
}

@SinceKotlin(version = "1.4")
@InlineOnly
@OverloadResolutionByLambdaReturnType
@ExperimentalUnsignedTypes
public inline fun <R : Comparable<Any>> UShortArray.maxOf(selector: (UShort) -> Any): Any {
   if (UShortArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$maxOf_u2dxTcfx_M`)) {
      throw NoSuchElementException()
   } else {
      var maxValue: java.lang.Comparable = selector(
         UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$maxOf_u2dxTcfx_M`, 0))
      ) as java.lang.Comparable
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOf_u2dxTcfx_M`)).iterator()

      while (var3.hasNext()) {
         val var7: java.lang.Comparable = selector(
            UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$maxOf_u2dxTcfx_M`, var3.nextInt()))
         ) as java.lang.Comparable
         if (maxValue.compareTo(var7) < 0) {
            maxValue = var7
         }
      }

      return (R)maxValue
   }
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun <K, V, M : MutableMap<in Any, MutableList<Any>>> ULongArray.groupByTo(
   destination: Any,
   keySelector: (ULong) -> Any,
   valueTransform: (ULong) -> Any
): Any {
   var var4: Int = 0

   for (var5 in size..var4) {
      val element: Long = ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$groupByTo_u2dQxgOkWg`, var4)
      val key: Any = keySelector(ULong.box_impl/* $VF was: box-impl */(element))
      val `value$iv`: Any = destination.get(key)
      val var10000: Any
      if (`value$iv` == null) {
         val var14: java.util.List = ArrayList()
         destination.put(key, var14)
         var10000 = var14
      } else {
         var10000 = `value$iv`
      }

      (var10000 as java.util.List).add(valueTransform(ULong.box_impl/* $VF was: box-impl */(element)))
   }

   return (M)destination
}

@ExperimentalUnsignedTypes
@InlineOnly
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.4")
public inline fun UIntArray.reduceRightOrNull(operation: (UInt, UInt) -> UInt): UInt? {
   var index: Int = ArraysKt.getLastIndex(`$this$reduceRightOrNull_u2dWyvcNBI`)
   if (index < 0) {
      return null
   } else {
      var var6: Int = UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$reduceRightOrNull_u2dWyvcNBI`, index--)

      while (index >= 0) {
         var6 = (operation(
               UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$reduceRightOrNull_u2dWyvcNBI`, index--)),
               UInt.box_impl/* $VF was: box-impl */(var6)
            ) as UInt)
            .unbox_impl/* $VF was: unbox-impl */()
         }

      return UInt.box_impl/* $VF was: box-impl */(var6)
   }
}

@SinceKotlin(version = "1.5")
@JvmName(name = "sumOfUByte")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
public fun Array<out UByte>.sum(): UInt {
   var sum: Int = 0
   var var2: Int = 0

   for (var3 in `$this$sum`.length..var2) {
      sum = UInt.constructor_impl/* $VF was: constructor-impl */(
         sum + UInt.constructor_impl/* $VF was: constructor-impl */(`$this$sum`[var2].unbox_impl/* $VF was: unbox-impl */() and 255)
      )
   }

   return sum
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun UShortArray.runningReduce(operation: (UShort, UShort) -> UShort): List<UShort> {
   if (UShortArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$runningReduce_u2dxzaTVY8`)) {
      return CollectionsKt.emptyList()
   } else {
      var var7: Short = UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$runningReduce_u2dxzaTVY8`, 0)
      val index: Int = (int)ArrayList(size)
      index.add(UShort.box_impl/* $VF was: box-impl */(var7))
      val result: Any = index
      var var8: Int = 1

      for (var9 in size..var8) {
         var7 = (operation(
               UShort.box_impl/* $VF was: box-impl */(var7),
               UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$runningReduce_u2dxzaTVY8`, var8))
            ) as UShort)
            .unbox_impl/* $VF was: unbox-impl */()
            result.add(UShort.box_impl/* $VF was: box-impl */(var7))
      }

      return result as MutableList<UShort>
   }
}

@JvmName(name = "minOrThrow-U")
@SinceKotlin(version = "1.7")
@ExperimentalUnsignedTypes
public fun UIntArray.min(): UInt {
   if (UIntArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$min_u2d_u2dajY_u2d9A`)) {
      throw NoSuchElementException()
   } else {
      var min: Int = UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$min_u2d_u2dajY_u2d9A`, 0)
      val var2: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$min_u2d_u2dajY_u2d9A`)).iterator()

      while (var2.hasNext()) {
         val var6: Int = UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$min_u2d_u2dajY_u2d9A`, var2.nextInt())
         if (Integer.compareUnsigned(min, var6) > 0) {
            min = var6
         }
      }

      return min
   }
}

@ExperimentalUnsignedTypes
@InlineOnly
@JvmName(name = "maxByOrThrow-U")
@SinceKotlin(version = "1.7")
public inline fun <R : Comparable<Any>> UIntArray.maxBy(selector: (UInt) -> Any): UInt {
   if (UIntArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$maxBy_u2djgv0xPQ`)) {
      throw NoSuchElementException()
   } else {
      var maxElem: Int = UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$maxBy_u2djgv0xPQ`, 0)
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$maxBy_u2djgv0xPQ`)
      if (lastIndex == 0) {
         return maxElem
      } else {
         var var9: java.lang.Comparable = selector(UInt.box_impl/* $VF was: box-impl */(maxElem)) as java.lang.Comparable
         val var10: IntIterator = IntRange(1, lastIndex).iterator()

         while (var10.hasNext()) {
            val e: Int = UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$maxBy_u2djgv0xPQ`, var10.nextInt())
            val v: java.lang.Comparable = selector(UInt.box_impl/* $VF was: box-impl */(e)) as java.lang.Comparable
            if (var9.compareTo(v) < 0) {
               maxElem = e
               var9 = v
            }
         }

         return maxElem
      }
   }
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public fun UShortArray.random(random: Random): UShort {
   if (UShortArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$random_u2ds5X_as8`)) {
      throw NoSuchElementException("Array is empty.")
   } else {
      return UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$random_u2ds5X_as8`, random.nextInt(size))
   }
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public final val indices: IntRange
   public final inline get() {
      return ArraysKt.getIndices(`$this$indices`)
   }


@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
public inline fun <R> UByteArray.maxOfWith(comparator: Comparator<in Any>, selector: (UByte) -> Any): Any {
   if (UByteArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$maxOfWith_u2dLTi4i_s`)) {
      throw NoSuchElementException()
   } else {
      var maxValue: Any = selector(UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$maxOfWith_u2dLTi4i_s`, 0)))
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfWith_u2dLTi4i_s`)).iterator()

      while (var4.hasNext()) {
         val var8: Any = selector(
            UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$maxOfWith_u2dLTi4i_s`, var4.nextInt()))
         )
         if (comparator.compare(maxValue, var8) < 0) {
            maxValue = var8
         }
      }

      return (R)maxValue
   }
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
public inline fun <R : Comparable<Any>> UShortArray.maxByOrNull(selector: (UShort) -> Any): UShort? {
   if (UShortArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$maxByOrNull_u2dxTcfx_M`)) {
      return null
   } else {
      var maxElem: Short = UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$maxByOrNull_u2dxTcfx_M`, 0)
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$maxByOrNull_u2dxTcfx_M`)
      if (lastIndex == 0) {
         return UShort.box_impl/* $VF was: box-impl */(maxElem)
      } else {
         var var9: java.lang.Comparable = selector(UShort.box_impl/* $VF was: box-impl */(maxElem)) as java.lang.Comparable
         val var10: IntIterator = IntRange(1, lastIndex).iterator()

         while (var10.hasNext()) {
            val e: Short = UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$maxByOrNull_u2dxTcfx_M`, var10.nextInt())
            val v: java.lang.Comparable = selector(UShort.box_impl/* $VF was: box-impl */(e)) as java.lang.Comparable
            if (var9.compareTo(v) < 0) {
               maxElem = e
               var9 = v
            }
         }

         return UShort.box_impl/* $VF was: box-impl */(maxElem)
      }
   }
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public fun UIntArray.firstOrNull(): UInt? {
   return if (UIntArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$firstOrNull_u2d_u2dajY_u2d9A`))
      null
      else
      UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$firstOrNull_u2d_u2dajY_u2d9A`, 0))
   }

@SinceKotlin(version = "1.3")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun ULongArray.reduceIndexed(operation: (Int, ULong, ULong) -> ULong): ULong {
   if (ULongArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$reduceIndexed_u2dz1zDJgo`)) {
      throw UnsupportedOperationException("Empty array can't be reduced.")
   } else {
      var accumulator: Long = ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$reduceIndexed_u2dz1zDJgo`, 0)
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$reduceIndexed_u2dz1zDJgo`)).iterator()

      while (var4.hasNext()) {
         val var7: Int = var4.nextInt()
         accumulator = (operation(
               var7,
               ULong.box_impl/* $VF was: box-impl */(accumulator),
               ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$reduceIndexed_u2dz1zDJgo`, var7))
            ) as ULong)
            .unbox_impl/* $VF was: unbox-impl */()
         }

      return accumulator
   }
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun UIntArray.copyInto(destination: UIntArray, destinationOffset: Int = ..., startIndex: Int = ..., endIndex: Int = ...): UIntArray {
   ArraysKt.copyInto((int[])`$this$copyInto_u2dsIZ3KeM`, (int[])destination, destinationOffset, startIndex, endIndex)
   return destination
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public fun UByteArray.slice(indices: Iterable<Int>): List<UByte> {
   val size: Int = CollectionsKt.collectionSizeOrDefault(indices, 10)
   if (size == 0) {
      return CollectionsKt.emptyList()
   } else {
      val list: ArrayList = ArrayList(size)
      val var4: java.util.Iterator = indices.iterator()

      while (var4.hasNext()) {
         list.add(
            UByte.box_impl/* $VF was: box-impl */(
               UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$slice_u2dJQknh5Q`, (var4.next() as java.lang.Number).intValue())
            )
         )
      }

      return list
   }
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public fun UShortArray.firstOrNull(): UShort? {
   return if (UShortArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$firstOrNull_u2drL5Bavg`))
      null
      else
      UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$firstOrNull_u2drL5Bavg`, 0))
   }

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun UShortArray.maxOfOrNull(selector: (UShort) -> Float): Float? {
   if (UShortArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$maxOfOrNull_u2dxTcfx_M`)) {
      return null
   } else {
      var maxValue: Float = (selector(
            UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$maxOfOrNull_u2dxTcfx_M`, 0))
         ) as java.lang.Number)
         .floatValue()
         val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfOrNull_u2dxTcfx_M`)).iterator()

      while (var3.hasNext()) {
         maxValue = Math.max(
            maxValue,
            (selector(UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$maxOfOrNull_u2dxTcfx_M`, var3.nextInt()))) as java.lang.Number)
               .floatValue()
         )
      }

      return maxValue
   }
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun <V> UShortArray.zip(other: UShortArray, transform: (UShort, UShort) -> Any): List<Any> {
   val size: Int = Math.min(size, size)
   val list: ArrayList = ArrayList(size)

   repeat(size) { i ->
      list.add(
         transform(
            UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$zip_u2dgVVukQo`, i)),
            UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(other, i))
         )
      )
   }

   return list
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public infix fun <R> UByteArray.zip(other: Array<out Any>): List<Pair<UByte, Any>> {
   val var2: ByteArray = `$this$zip_u2dnl983wc`
   val var3: Int = Math.min(size, other.length)
   val var4: ArrayList = ArrayList(var3)

   repeat(var3) { var5 ->
      var4.add(UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(var2, var5)) to other[var5])
   }

   return var4
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun <C : MutableCollection<in ULong>> ULongArray.filterTo(destination: Any, predicate: (ULong) -> Boolean): Any {
   var var3: Int = 0

   for (var4 in size..var3) {
      val element: Long = ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$filterTo_u2dHqK1JgA`, var3)
      if (predicate(ULong.box_impl/* $VF was: box-impl */(element)) as java.lang.Boolean) {
         destination.add(ULong.box_impl/* $VF was: box-impl */(element))
      }
   }

   return (C)destination
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public infix fun UByteArray.zip(other: UByteArray): List<Pair<UByte, UByte>> {
   val var2: ByteArray = `$this$zip_u2dkdPth3s`
   val var3: Int = Math.min(size, size)
   val var4: ArrayList = ArrayList(var3)

   repeat(var3) { var5 ->
      var4.add(
         UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(var2, var5)) to UByte.box_impl/* $VF was: box-impl */(
            UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(other, var5)
         )
      )
   }

   return var4
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public fun UByteArray.getOrNull(index: Int): UByte? {
   return if (index >= 0 && index <= ArraysKt.getLastIndex(`$this$getOrNull_u2dPpDY95g`))
      UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$getOrNull_u2dPpDY95g`, index))
      else
      null
   }

@JvmName(name = "minWithOrThrow-U")
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.7")
public fun UByteArray.minWith(comparator: Comparator<in UByte>): UByte {
   if (UByteArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$minWith_u2dXMRcp5o`)) {
      throw NoSuchElementException()
   } else {
      var min: Byte = UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$minWith_u2dXMRcp5o`, 0)
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minWith_u2dXMRcp5o`)).iterator()

      while (var3.hasNext()) {
         val var7: Byte = UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$minWith_u2dXMRcp5o`, var3.nextInt())
         if (comparator.compare(UByte.box_impl/* $VF was: box-impl */(min), UByte.box_impl/* $VF was: box-impl */(var7)) > 0) {
            min = var7
         }
      }

      return min
   }
}

@SinceKotlin(version = "1.3")
@InlineOnly
@ExperimentalUnsignedTypes
public inline operator fun UShortArray.component1(): UShort {
   return UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$component1_u2drL5Bavg`, 0)
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun <R> ULongArray.flatMap(transform: (ULong) -> Iterable<Any>): List<Any> {
   val var2: LongArray = `$this$flatMap_u2dMShoTSo`
   val var3: java.util.Collection = ArrayList()
   var var4: Int = 0

   for (var5 in size..var4) {
      CollectionsKt.addAll(
         var3, transform(ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(var2, var4))) as java.lang.Iterable
      )
   }

   return var3 as MutableList<R>
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun <R, V> ULongArray.zip(other: Iterable<Any>, transform: (ULong, Any) -> Any): List<Any> {
   val arraySize: Int = size
   val list: ArrayList = ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(other, 10), arraySize))
   var i: Int = 0

   for (element in other) {
      if (i >= arraySize) {
         break
      }

      list.add(transform(ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$zip_u2dTUPTUsU`, i++)), element))
   }

   return list
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
public inline fun <R : Comparable<Any>> UShortArray.minOfOrNull(selector: (UShort) -> Any): Any? {
   if (UShortArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$minOfOrNull_u2dxTcfx_M`)) {
      return null
   } else {
      var minValue: java.lang.Comparable = selector(
         UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$minOfOrNull_u2dxTcfx_M`, 0))
      ) as java.lang.Comparable
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfOrNull_u2dxTcfx_M`)).iterator()

      while (var3.hasNext()) {
         val var7: java.lang.Comparable = selector(
            UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$minOfOrNull_u2dxTcfx_M`, var3.nextInt()))
         ) as java.lang.Comparable
         if (minValue.compareTo(var7) > 0) {
            minValue = var7
         }
      }

      return (R)minValue
   }
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun UByteArray.any(predicate: (UByte) -> Boolean): Boolean {
   var var2: Int = 0

   for (var3 in size..var2) {
      if (predicate(UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$any_u2dJOV_ifY`, var2))) as java.lang.Boolean
         )
       {
         return true
      }
   }

   return false
}

@ExperimentalUnsignedTypes
@InlineOnly
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
public inline fun <R : Comparable<Any>> UByteArray.minOf(selector: (UByte) -> Any): Any {
   if (UByteArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$minOf_u2dJOV_ifY`)) {
      throw NoSuchElementException()
   } else {
      var minValue: java.lang.Comparable = selector(
         UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$minOf_u2dJOV_ifY`, 0))
      ) as java.lang.Comparable
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOf_u2dJOV_ifY`)).iterator()

      while (var3.hasNext()) {
         val var7: java.lang.Comparable = selector(
            UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$minOf_u2dJOV_ifY`, var3.nextInt()))
         ) as java.lang.Comparable
         if (minValue.compareTo(var7) > 0) {
            minValue = var7
         }
      }

      return (R)minValue
   }
}

@ExperimentalUnsignedTypes
@JvmName(name = "minByOrThrow-U")
@SinceKotlin(version = "1.7")
@InlineOnly
public inline fun <R : Comparable<Any>> UIntArray.minBy(selector: (UInt) -> Any): UInt {
   if (UIntArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$minBy_u2djgv0xPQ`)) {
      throw NoSuchElementException()
   } else {
      var minElem: Int = UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$minBy_u2djgv0xPQ`, 0)
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$minBy_u2djgv0xPQ`)
      if (lastIndex == 0) {
         return minElem
      } else {
         var var9: java.lang.Comparable = selector(UInt.box_impl/* $VF was: box-impl */(minElem)) as java.lang.Comparable
         val var10: IntIterator = IntRange(1, lastIndex).iterator()

         while (var10.hasNext()) {
            val e: Int = UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$minBy_u2djgv0xPQ`, var10.nextInt())
            val v: java.lang.Comparable = selector(UInt.box_impl/* $VF was: box-impl */(e)) as java.lang.Comparable
            if (var9.compareTo(v) > 0) {
               minElem = e
               var9 = v
            }
         }

         return minElem
      }
   }
}

@InlineOnly
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public inline fun <R> UByteArray.foldRightIndexed(initial: Any, operation: (Int, UByte, Any) -> Any): Any {
   var index: Int = ArraysKt.getLastIndex(`$this$foldRightIndexed_u2d3iWJZGE`)
   var var6: Any = initial

   while (index >= 0) {
      var6 = operation(
         index, UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$foldRightIndexed_u2d3iWJZGE`, index)), var6
      )
      index--
   }

   return (R)var6
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun UByteArray.all(predicate: (UByte) -> Boolean): Boolean {
   var var2: Int = 0

   for (var3 in size..var2) {
      if (!predicate(UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$all_u2dJOV_ifY`, var2))) as java.lang.Boolean
         )
       {
         return false
      }
   }

   return true
}

@OverloadResolutionByLambdaReturnType
@InlineOnly
@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
public inline fun <R : Comparable<Any>> ULongArray.maxOf(selector: (ULong) -> Any): Any {
   if (ULongArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$maxOf_u2dMShoTSo`)) {
      throw NoSuchElementException()
   } else {
      var maxValue: java.lang.Comparable = selector(
         ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$maxOf_u2dMShoTSo`, 0))
      ) as java.lang.Comparable
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOf_u2dMShoTSo`)).iterator()

      while (var3.hasNext()) {
         val var7: java.lang.Comparable = selector(
            ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$maxOf_u2dMShoTSo`, var3.nextInt()))
         ) as java.lang.Comparable
         if (maxValue.compareTo(var7) < 0) {
            maxValue = var7
         }
      }

      return (R)maxValue
   }
}

@SinceKotlin(version = "1.3")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun UIntArray.filter(predicate: (UInt) -> Boolean): List<UInt> {
   val var2: IntArray = `$this$filter_u2djgv0xPQ`
   val var3: java.util.Collection = ArrayList()
   var var4: Int = 0

   for (var5 in size..var4) {
      val var6: Int = UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(var2, var4)
      if (predicate(UInt.box_impl/* $VF was: box-impl */(var6)) as java.lang.Boolean) {
         var3.add(UInt.box_impl/* $VF was: box-impl */(var6))
      }
   }

   return var3 as MutableList<UInt>
}

@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
public fun UByteArray.sort(fromIndex: Int = ..., toIndex: Int = ...) {
   AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(fromIndex, toIndex, size)
   UArraySortingKt.sortArray_4UcCI2c/* $VF was: sortArray-4UcCI2c */(`$this$sort_u2d4UcCI2c`, fromIndex, toIndex)
}

@InlineOnly
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public inline operator fun UByteArray.plus(elements: UByteArray): UByteArray {
   return UByteArray.constructor_impl/* $VF was: constructor-impl */(ArraysKt.plus(`$this$plus_u2dkdPth3s`, elements))
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun <R, V> UShortArray.zip(other: Array<out Any>, transform: (UShort, Any) -> Any): List<Any> {
   val size: Int = Math.min(size, other.length)
   val list: ArrayList = ArrayList(size)

   repeat(size) { i ->
      list.add(transform(UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$zip_u2dePBmRWY`, i)), other[i]))
   }

   return list
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public fun UShortArray.sortDescending() {
   if (size > 1) {
      UArraysKt.sort_rL5Bavg/* $VF was: sort-rL5Bavg */(`$this$sortDescending_u2drL5Bavg`)
      ArraysKt.reverse(`$this$sortDescending_u2drL5Bavg`)
   }
}

@InlineOnly
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public inline fun UIntArray.dropWhile(predicate: (UInt) -> Boolean): List<UInt> {
   var yielding: Boolean = false
   val list: ArrayList = ArrayList()
   var var4: Int = 0

   for (var5 in size..var4) {
      val item: Int = UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$dropWhile_u2djgv0xPQ`, var4)
      if (yielding) {
         list.add(UInt.box_impl/* $VF was: box-impl */(item))
      } else if (!predicate(UInt.box_impl/* $VF was: box-impl */(item)) as java.lang.Boolean) {
         list.add(UInt.box_impl/* $VF was: box-impl */(item))
         yielding = true
      }
   }

   return list
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public inline fun <R> UByteArray.mapIndexed(transform: (Int, UByte) -> Any): List<Any> {
   val var2: ByteArray = `$this$mapIndexed_u2dELGow60`
   val var3: java.util.Collection = ArrayList(size)
   var var4: Int = 0
   var var5: Int = 0

   for (var6 in size..var5) {
      var3.add(transform(var4++, UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(var2, var5))))
   }

   return var3 as MutableList<R>
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline operator fun UShortArray.plus(element: UShort): UShortArray {
   return UShortArray.constructor_impl/* $VF was: constructor-impl */(ArraysKt.plus(`$this$plus_u2dXzdR7RA`, element))
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public infix fun <R> ULongArray.zip(other: Iterable<Any>): List<Pair<ULong, Any>> {
   val var2: LongArray = `$this$zip_u2dF7u83W8`
   val var3: Int = size
   val var4: ArrayList = ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(other, 10), var3))
   var var5: Int = 0

   for (var7 in other) {
      if (var5 >= var3) {
         break
      }

      var4.add(ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(var2, var5++)) to var7)
   }

   return var4
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline operator fun ULongArray.plus(elements: ULongArray): ULongArray {
   return ULongArray.constructor_impl/* $VF was: constructor-impl */(ArraysKt.plus(`$this$plus_u2dus8wMrg`, elements))
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public fun UByteArray.sort() {
   if (size > 1) {
      UArraySortingKt.sortArray_4UcCI2c/* $VF was: sortArray-4UcCI2c */(`$this$sort_u2dGBYM_sE`, 0, size)
   }
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public fun UIntArray.takeLast(n: Int): List<UInt> {
   if (n < 0) {
      throw IllegalArgumentException(("Requested element count $n is less than zero.").toString())
   } else if (n == 0) {
      return CollectionsKt.emptyList()
   } else {
      val var5: Int = size
      if (n >= var5) {
         return CollectionsKt.toList(UIntArray.box_impl/* $VF was: box-impl */(`$this$takeLast_u2dqFRl0hI`))
      } else if (n == 1) {
         return CollectionsKt.listOf(
            UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$takeLast_u2dqFRl0hI`, var5 + -1))
         )
      } else {
         val list: ArrayList = ArrayList(n)

         for (index in var5 - n..var5) {
            list.add(UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$takeLast_u2dqFRl0hI`, index)))
         }

         return list
      }
   }
}

@InlineOnly
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
public inline fun UShortArray.randomOrNull(): UShort? {
   return UArraysKt.randomOrNull_s5X_as8/* $VF was: randomOrNull-s5X_as8 */(`$this$randomOrNull_u2drL5Bavg`, Random.Default)
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public fun UByteArray.sortDescending() {
   if (size > 1) {
      UArraysKt.sort_GBYM_sE/* $VF was: sort-GBYM_sE */(`$this$sortDescending_u2dGBYM_sE`)
      ArraysKt.reverse(`$this$sortDescending_u2dGBYM_sE`)
   }
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public inline fun UIntArray.reverse() {
   ArraysKt.reverse(`$this$reverse_u2d_u2dajY_u2d9A`)
}

@OverloadResolutionByLambdaReturnType
@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
public inline fun ULongArray.maxOfOrNull(selector: (ULong) -> Float): Float? {
   if (ULongArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$maxOfOrNull_u2dMShoTSo`)) {
      return null
   } else {
      var maxValue: Float = (selector(
            ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$maxOfOrNull_u2dMShoTSo`, 0))
         ) as java.lang.Number)
         .floatValue()
         val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfOrNull_u2dMShoTSo`)).iterator()

      while (var3.hasNext()) {
         maxValue = Math.max(
            maxValue,
            (selector(ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$maxOfOrNull_u2dMShoTSo`, var3.nextInt()))) as java.lang.Number)
               .floatValue()
         )
      }

      return maxValue
   }
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public fun UIntArray.withIndex(): Iterable<IndexedValue<UInt>> {
   return IndexingIterable<>(   // $VF: Compiled from _UArrays.kt
{
      return UIntArray.iterator_impl/* $VF was: iterator-impl */($this$withIndex_u2d_u2dajY_u2d9A)
   } as () -> MutableIterator<UInt>)
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun UByteArray.onEachIndexed(action: (Int, UByte) -> Unit): UByteArray {
   val var5: ByteArray = `$this$onEachIndexed_u2dELGow60`
   var var6: Int = 0
   var var7: Int = 0

   for (var8 in size..var7) {
      action(var6++, UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(var5, var7)))
   }

   return `$this$onEachIndexed_u2dELGow60`
}

@SinceKotlin(version = "1.3")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun UShortArray.filterIndexed(predicate: (Int, UShort) -> Boolean): List<UShort> {
   val var3: java.util.Collection = ArrayList()
   val var4: ShortArray = `$this$filterIndexed_u2dxzaTVY8`
   val var5: Int = 0
   var var6: Int = 0

   for (var7 in size..var6) {
      val var8: Short = UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(var4, var6)
      if (predicate(var5++, UShort.box_impl/* $VF was: box-impl */(var8)) as java.lang.Boolean) {
         var3.add(UShort.box_impl/* $VF was: box-impl */(var8))
      }
   }

   return var3 as MutableList<UShort>
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun <R> UByteArray.foldRight(initial: Any, operation: (UByte, Any) -> Any): Any {
   var index: Int = ArraysKt.getLastIndex(`$this$foldRight_u2dyXmHNn8`)
   var var6: Any = initial

   while (index >= 0) {
      var6 = operation(UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$foldRight_u2dyXmHNn8`, index--)), var6)
   }

   return (R)var6
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public fun ULongArray.sliceArray(indices: IntRange): ULongArray {
   return ULongArray.constructor_impl/* $VF was: constructor-impl */(ArraysKt.sliceArray(`$this$sliceArray_u2dZRhS8yI`, indices))
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public fun ULongArray.lastOrNull(): ULong? {
   return if (ULongArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$lastOrNull_u2dQwZRm1k`))
      null
      else
      ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$lastOrNull_u2dQwZRm1k`, size - 1))
   }

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun <R, V> UShortArray.zip(other: Iterable<Any>, transform: (UShort, Any) -> Any): List<Any> {
   val arraySize: Int = size
   val list: ArrayList = ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(other, 10), arraySize))
   var i: Int = 0

   for (element in other) {
      if (i >= arraySize) {
         break
      }

      list.add(transform(UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$zip_u2dkBb4a_u2ds`, i++)), element))
   }

   return list
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun UShortArray.reduceRightIndexed(operation: (Int, UShort, UShort) -> UShort): UShort {
   var index: Int = ArraysKt.getLastIndex(`$this$reduceRightIndexed_u2daLgx1Fo`)
   if (index < 0) {
      throw UnsupportedOperationException("Empty array can't be reduced.")
   } else {
      var var6: Short = UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$reduceRightIndexed_u2daLgx1Fo`, index--)

      while (index >= 0) {
         var6 = (operation(
               index,
               UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$reduceRightIndexed_u2daLgx1Fo`, index)),
               UShort.box_impl/* $VF was: box-impl */(var6)
            ) as UShort)
            .unbox_impl/* $VF was: unbox-impl */()
            index--
      }

      return var6
   }
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun <K, M : MutableMap<in Any, MutableList<UByte>>> UByteArray.groupByTo(destination: Any, keySelector: (UByte) -> Any): Any {
   var var3: Int = 0

   for (var4 in size..var3) {
      val element: Byte = UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$groupByTo_u2dH21X9dk`, var3)
      val key: Any = keySelector(UByte.box_impl/* $VF was: box-impl */(element))
      val `value$iv`: Any = destination.get(key)
      val var10000: Any
      if (`value$iv` == null) {
         val var12: java.util.List = ArrayList()
         destination.put(key, var12)
         var10000 = var12
      } else {
         var10000 = `value$iv`
      }

      (var10000 as java.util.List).add(UByte.box_impl/* $VF was: box-impl */(element))
   }

   return (M)destination
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
public fun ULongArray.minOrNull(): ULong? {
   if (ULongArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$minOrNull_u2dQwZRm1k`)) {
      return null
   } else {
      var min: Long = ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$minOrNull_u2dQwZRm1k`, 0)
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOrNull_u2dQwZRm1k`)).iterator()

      while (var3.hasNext()) {
         val var8: Long = ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$minOrNull_u2dQwZRm1k`, var3.nextInt())
         if (java.lang.Long.compareUnsigned(min, var8) > 0) {
            min = var8
         }
      }

      return ULong.box_impl/* $VF was: box-impl */(min)
   }
}

@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
public fun UShortArray.sort(fromIndex: Int = ..., toIndex: Int = ...) {
   AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(fromIndex, toIndex, size)
   UArraySortingKt.sortArray_Aa5vz7o/* $VF was: sortArray-Aa5vz7o */(`$this$sort_u2dAa5vz7o`, fromIndex, toIndex)
}

@SinceKotlin(version = "1.3")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun <K> UShortArray.groupBy(keySelector: (UShort) -> Any): Map<Any, List<UShort>> {
   val var2: ShortArray = `$this$groupBy_u2dxTcfx_M`
   val var3: java.util.Map = LinkedHashMap()
   var var4: Int = 0

   for (var5 in size..var4) {
      val var6: Short = UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(var2, var4)
      val var7: Any = keySelector(UShort.box_impl/* $VF was: box-impl */(var6))
      var var10000: Any = var3.get(var7)
      if (var10000 == null) {
         val var9: java.util.List = ArrayList()
         var3.put(var7, var9)
         var10000 = var9
      }

      (var10000 as java.util.List).add(UShort.box_impl/* $VF was: box-impl */(var6))
   }

   return var3
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun <V> UByteArray.associateWith(valueSelector: (UByte) -> Any): Map<UByte, Any> {
   val result: LinkedHashMap = LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(size), 16))
   val var3: ByteArray = `$this$associateWith_u2dJOV_ifY`
   var var4: Int = 0

   for (var5 in size..var4) {
      val var6: Byte = UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(var3, var4)
      result.put(UByte.box_impl/* $VF was: box-impl */(var6), valueSelector(UByte.box_impl/* $VF was: box-impl */(var6)))
   }

   return result
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun UShortArray.reduceRight(operation: (UShort, UShort) -> UShort): UShort {
   var index: Int = ArraysKt.getLastIndex(`$this$reduceRight_u2dxzaTVY8`)
   if (index < 0) {
      throw UnsupportedOperationException("Empty array can't be reduced.")
   } else {
      var var6: Short = UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$reduceRight_u2dxzaTVY8`, index--)

      while (index >= 0) {
         var6 = (operation(
               UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$reduceRight_u2dxzaTVY8`, index--)),
               UShort.box_impl/* $VF was: box-impl */(var6)
            ) as UShort)
            .unbox_impl/* $VF was: unbox-impl */()
         }

      return var6
   }
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
public fun ULongArray.maxWithOrNull(comparator: Comparator<in ULong>): ULong? {
   if (ULongArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$maxWithOrNull_u2dzrEWJaI`)) {
      return null
   } else {
      var max: Long = ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$maxWithOrNull_u2dzrEWJaI`, 0)
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxWithOrNull_u2dzrEWJaI`)).iterator()

      while (var4.hasNext()) {
         val var9: Long = ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$maxWithOrNull_u2dzrEWJaI`, var4.nextInt())
         if (comparator.compare(ULong.box_impl/* $VF was: box-impl */(max), ULong.box_impl/* $VF was: box-impl */(var9)) < 0) {
            max = var9
         }
      }

      return ULong.box_impl/* $VF was: box-impl */(max)
   }
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
public fun UIntArray.shuffle(random: Random) {
   for (i in ArraysKt.getLastIndex(`$this$shuffle_u2d2D5oskM`) downTo 1) {
      val var5: Int = random.nextInt(i + 1)
      val var6: Int = UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$shuffle_u2d2D5oskM`, i)
      UIntArray.set_VXSXFK8/* $VF was: set-VXSXFK8 */(
         `$this$shuffle_u2d2D5oskM`, i, UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$shuffle_u2d2D5oskM`, var5)
      )
      UIntArray.set_VXSXFK8/* $VF was: set-VXSXFK8 */(`$this$shuffle_u2d2D5oskM`, var5, var6)
   }
}

@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun UByteArray.reduceOrNull(operation: (UByte, UByte) -> UByte): UByte? {
   if (UByteArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$reduceOrNull_u2dELGow60`)) {
      return null
   } else {
      var accumulator: Byte = UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$reduceOrNull_u2dELGow60`, 0)
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$reduceOrNull_u2dELGow60`)).iterator()

      while (var3.hasNext()) {
         accumulator = (operation(
               UByte.box_impl/* $VF was: box-impl */(accumulator),
               UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$reduceOrNull_u2dELGow60`, var3.nextInt()))
            ) as UByte)
            .unbox_impl/* $VF was: unbox-impl */()
         }

      return UByte.box_impl/* $VF was: box-impl */(accumulator)
   }
}

@SinceKotlin(version = "1.3")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun UShortArray.count(predicate: (UShort) -> Boolean): Int {
   var count: Int = 0
   var var3: Int = 0

   for (var4 in size..var3) {
      if (predicate(UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$count_u2dxTcfx_M`, var3))) as java.lang.Boolean
         )
       {
         count++
      }
   }

   return count
}

@InlineOnly
@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
public inline fun <R> UIntArray.runningFold(initial: Any, operation: (Any, UInt) -> Any): List<Any> {
   if (UIntArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$runningFold_u2dzi1B2BA`)) {
      return (java.util.List<R>)CollectionsKt.listOf(initial)
   } else {
      val accumulator: ArrayList = ArrayList(size + 1)
      accumulator.add(initial)
      val result: ArrayList = accumulator
      var var8: Any = initial
      var var9: Int = 0

      for (var10 in size..var9) {
         var8 = operation(var8, UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$runningFold_u2dzi1B2BA`, var9)))
         result.add(var8)
      }

      return result
   }
}

@SinceKotlin(version = "1.3")
@InlineOnly
@ExperimentalUnsignedTypes
public inline operator fun UIntArray.component5(): UInt {
   return UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$component5_u2d_u2dajY_u2d9A`, 4)
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun UIntArray.reverse(fromIndex: Int, toIndex: Int) {
   ArraysKt.reverse((int[])`$this$reverse_u2doBK06Vg`, fromIndex, toIndex)
}

@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public fun UIntArray.randomOrNull(random: Random): UInt? {
   return if (UIntArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$randomOrNull_u2d2D5oskM`))
      null
      else
      UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$randomOrNull_u2d2D5oskM`, random.nextInt(size)))
   }

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
public fun ULongArray.maxOrNull(): ULong? {
   if (ULongArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$maxOrNull_u2dQwZRm1k`)) {
      return null
   } else {
      var max: Long = ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$maxOrNull_u2dQwZRm1k`, 0)
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOrNull_u2dQwZRm1k`)).iterator()

      while (var3.hasNext()) {
         val var8: Long = ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$maxOrNull_u2dQwZRm1k`, var3.nextInt())
         if (java.lang.Long.compareUnsigned(max, var8) < 0) {
            max = var8
         }
      }

      return ULong.box_impl/* $VF was: box-impl */(max)
   }
}

@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
@InlineOnly
@OverloadResolutionByLambdaReturnType
public inline fun <R : Comparable<Any>> UIntArray.maxOfOrNull(selector: (UInt) -> Any): Any? {
   if (UIntArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$maxOfOrNull_u2djgv0xPQ`)) {
      return null
   } else {
      var maxValue: java.lang.Comparable = selector(
         UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$maxOfOrNull_u2djgv0xPQ`, 0))
      ) as java.lang.Comparable
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfOrNull_u2djgv0xPQ`)).iterator()

      while (var3.hasNext()) {
         val var7: java.lang.Comparable = selector(
            UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$maxOfOrNull_u2djgv0xPQ`, var3.nextInt()))
         ) as java.lang.Comparable
         if (maxValue.compareTo(var7) < 0) {
            maxValue = var7
         }
      }

      return (R)maxValue
   }
}

@ExperimentalUnsignedTypes
@OverloadResolutionByLambdaReturnType
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun UShortArray.minOf(selector: (UShort) -> Double): Double {
   if (UShortArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$minOf_u2dxTcfx_M`)) {
      throw NoSuchElementException()
   } else {
      var minValue: Double = (selector(UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$minOf_u2dxTcfx_M`, 0))) as java.lang.Number)
         .doubleValue()
         val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOf_u2dxTcfx_M`)).iterator()

      while (var4.hasNext()) {
         minValue = Math.min(
            minValue,
            (selector(UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$minOf_u2dxTcfx_M`, var4.nextInt()))) as java.lang.Number)
               .doubleValue()
         )
      }

      return minValue
   }
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun UByteArray.random(): UByte {
   return UArraysKt.random_oSF2wD8/* $VF was: random-oSF2wD8 */(`$this$random_u2dGBYM_sE`, Random.Default)
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun ULongArray.none(): Boolean {
   return ULongArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$none_u2dQwZRm1k`)
}

@InlineOnly
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public inline fun UIntArray.random(): UInt {
   return UArraysKt.random_2D5oskM/* $VF was: random-2D5oskM */(`$this$random_u2d_u2dajY_u2d9A`, Random.Default)
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun <C : MutableCollection<in UByte>> UByteArray.filterTo(destination: Any, predicate: (UByte) -> Boolean): Any {
   var var3: Int = 0

   for (var4 in size..var3) {
      val element: Byte = UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$filterTo_u2dwzUQCXU`, var3)
      if (predicate(UByte.box_impl/* $VF was: box-impl */(element)) as java.lang.Boolean) {
         destination.add(UByte.box_impl/* $VF was: box-impl */(element))
      }
   }

   return (C)destination
}

@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
public fun UShortArray.maxWithOrNull(comparator: Comparator<in UShort>): UShort? {
   if (UShortArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$maxWithOrNull_u2deOHTfZs`)) {
      return null
   } else {
      var max: Short = UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$maxWithOrNull_u2deOHTfZs`, 0)
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxWithOrNull_u2deOHTfZs`)).iterator()

      while (var3.hasNext()) {
         val var7: Short = UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$maxWithOrNull_u2deOHTfZs`, var3.nextInt())
         if (comparator.compare(UShort.box_impl/* $VF was: box-impl */(max), UShort.box_impl/* $VF was: box-impl */(var7)) < 0) {
            max = var7
         }
      }

      return UShort.box_impl/* $VF was: box-impl */(max)
   }
}

@SinceKotlin(version = "1.3")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun <R> UShortArray.fold(initial: Any, operation: (Any, UShort) -> Any): Any {
   var accumulator: Any = initial
   var var4: Int = 0

   for (var5 in size..var4) {
      accumulator = operation(
         accumulator, UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$fold_u2dzww5nb8`, var4))
      )
   }

   return (R)accumulator
}

@SinceKotlin(version = "1.3")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun UByteArray.copyOf(): UByteArray {
   val var10000: ByteArray = Arrays.copyOf(`$this$copyOf_u2dGBYM_sE`, `$this$copyOf_u2dGBYM_sE`.length)
   return UByteArray.constructor_impl/* $VF was: constructor-impl */(var10000)
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public fun UIntArray.random(random: Random): UInt {
   if (UIntArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$random_u2d2D5oskM`)) {
      throw NoSuchElementException("Array is empty.")
   } else {
      return UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$random_u2d2D5oskM`, random.nextInt(size))
   }
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun UIntArray.last(): UInt {
   return UInt.constructor_impl/* $VF was: constructor-impl */(ArraysKt.last(`$this$last_u2d_u2dajY_u2d9A`))
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public fun ULongArray.getOrNull(index: Int): ULong? {
   return if (index >= 0 && index <= ArraysKt.getLastIndex(`$this$getOrNull_u2dr7IrZao`))
      ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$getOrNull_u2dr7IrZao`, index))
      else
      null
   }

@Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = []))
@DeprecatedSinceKotlin(warningSince = "1.5")
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun ULongArray.sumByDouble(selector: (ULong) -> Double): Double {
   var sum: Double = 0.0
   var var4: Int = 0

   for (var5 in size..var4) {
      sum += (selector(ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$sumByDouble_u2dMShoTSo`, var4))) as java.lang.Number)
         .doubleValue()
      }

   return sum
}

@InlineOnly
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public inline fun UByteArray.indexOfLast(predicate: (UByte) -> Boolean): Int {
   val `$this$indexOfLast$iv`: ByteArray = `$this$indexOfLast_u2dJOV_ifY`
   var var4: Int = `$this$indexOfLast_u2dJOV_ifY`.length + -1
   if (0 <= `$this$indexOfLast_u2dJOV_ifY`.length + -1) {
      do {
         val `index$iv`: Int = var4--
         if (predicate(UByte.box_impl/* $VF was: box-impl */(UByte.constructor_impl/* $VF was: constructor-impl */(`$this$indexOfLast$iv`[`index$iv`]))) as java.lang.Boolean
            )
          {
            return `index$iv`
         }
      } while (0 <= var4)
   }

   return -1
}

@SinceKotlin(version = "1.3")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun UIntArray.find(predicate: (UInt) -> Boolean): UInt? {
   val var2: IntArray = `$this$find_u2djgv0xPQ`
   var var3: Int = 0
   val var4: Int = size

   var var10000: UInt
   while (true) {
      if (var3 >= var4) {
         var10000 = null
         break
      }

      val var5: Int = UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(var2, var3)
      if (predicate(UInt.box_impl/* $VF was: box-impl */(var5)) as java.lang.Boolean) {
         var10000 = UInt.box_impl/* $VF was: box-impl */(var5)
         break
      }

      var3++
   }

   return var10000
}

@JvmName(name = "sumOfDouble")
@OverloadResolutionByLambdaReturnType
@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun UShortArray.sumOf(selector: (UShort) -> Double): Double {
   var sum: Double = 0.0
   var var4: Int = 0

   for (var5 in size..var4) {
      sum += (selector(UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$sumOf_u2dxTcfx_M`, var4))) as java.lang.Number)
         .doubleValue()
      }

   return sum
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public inline fun UShortArray.reversedArray(): UShortArray {
   return UShortArray.constructor_impl/* $VF was: constructor-impl */(ArraysKt.reversedArray(`$this$reversedArray_u2drL5Bavg`))
}

@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
public fun UByteArray.sortDescending(fromIndex: Int, toIndex: Int) {
   UArraysKt.sort_4UcCI2c/* $VF was: sort-4UcCI2c */(`$this$sortDescending_u2d4UcCI2c`, fromIndex, toIndex)
   ArraysKt.reverse((byte[])`$this$sortDescending_u2d4UcCI2c`, fromIndex, toIndex)
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun ULongArray.forEach(action: (ULong) -> Unit) {
   var var2: Int = 0

   for (var3 in size..var2) {
      action(ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$forEach_u2dMShoTSo`, var2)))
   }
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public operator fun ULongArray.plus(elements: Collection<ULong>): ULongArray {
   var index: Int = size
   val var10000: LongArray = Arrays.copyOf(`$this$plus_u2dkzHmqpY`, size + elements.size())
   val result: LongArray = var10000
   val var4: java.util.Iterator = elements.iterator()

   while (var4.hasNext()) {
      result[index++] = (var4.next() as ULong).unbox_impl/* $VF was: unbox-impl */()
   }

   return ULongArray.constructor_impl/* $VF was: constructor-impl */(result)
}

@SinceKotlin(version = "1.3")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun UByteArray.toByteArray(): ByteArray {
   val var10000: ByteArray = Arrays.copyOf(`$this$toByteArray_u2dGBYM_sE`, `$this$toByteArray_u2dGBYM_sE`.length)
   return var10000
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public inline fun ULongArray.singleOrNull(predicate: (ULong) -> Boolean): ULong? {
   var single: ULong = null
   var found: Boolean = false
   var var4: Int = 0

   for (var5 in size..var4) {
      val element: Long = ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$singleOrNull_u2dMShoTSo`, var4)
      if (predicate(ULong.box_impl/* $VF was: box-impl */(element)) as java.lang.Boolean) {
         if (found) {
            return null
         }

         single = ULong.box_impl/* $VF was: box-impl */(element)
         found = true
      }
   }

   return if (!found) null else single
}

@InlineOnly
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public inline fun ULongArray.reversedArray(): ULongArray {
   return ULongArray.constructor_impl/* $VF was: constructor-impl */(ArraysKt.reversedArray(`$this$reversedArray_u2dQwZRm1k`))
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public fun UByteArray.withIndex(): Iterable<IndexedValue<UByte>> {
   return IndexingIterable<>(   // $VF: Compiled from _UArrays.kt
{
      return UByteArray.iterator_impl/* $VF was: iterator-impl */($this$withIndex_u2dGBYM_sE)
   } as () -> MutableIterator<UByte>)
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun UShortArray.asShortArray(): ShortArray {
   return `$this$asShortArray_u2drL5Bavg`
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun UShortArray.elementAtOrElse(index: Int, defaultValue: (Int) -> UShort): UShort {
   return if (index >= 0 && index <= ArraysKt.getLastIndex(`$this$elementAtOrElse_u2dCVVdw08`))
      UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$elementAtOrElse_u2dCVVdw08`, index)
      else
      (defaultValue(index) as UShort).unbox_impl/* $VF was: unbox-impl */()
   }

@SinceKotlin(version = "1.3")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun <C : MutableCollection<in UInt>> UIntArray.filterTo(destination: Any, predicate: (UInt) -> Boolean): Any {
   var var3: Int = 0

   for (var4 in size..var3) {
      val element: Int = UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$filterTo_u2dwU5IKMo`, var3)
      if (predicate(UInt.box_impl/* $VF was: box-impl */(element)) as java.lang.Boolean) {
         destination.add(UInt.box_impl/* $VF was: box-impl */(element))
      }
   }

   return (C)destination
}

@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun <V> UShortArray.associateWith(valueSelector: (UShort) -> Any): Map<UShort, Any> {
   val result: LinkedHashMap = LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(size), 16))
   val var3: ShortArray = `$this$associateWith_u2dxTcfx_M`
   var var4: Int = 0

   for (var5 in size..var4) {
      val var6: Short = UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(var3, var4)
      result.put(UShort.box_impl/* $VF was: box-impl */(var6), valueSelector(UShort.box_impl/* $VF was: box-impl */(var6)))
   }

   return result
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public inline fun ULongArray.filterIndexed(predicate: (Int, ULong) -> Boolean): List<ULong> {
   val var3: java.util.Collection = ArrayList()
   val var4: LongArray = `$this$filterIndexed_u2ds8dVfGU`
   val var5: Int = 0
   var var6: Int = 0

   for (var7 in size..var6) {
      val var8: Long = ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(var4, var6)
      if (predicate(var5++, ULong.box_impl/* $VF was: box-impl */(var8)) as java.lang.Boolean) {
         var3.add(ULong.box_impl/* $VF was: box-impl */(var8))
      }
   }

   return var3 as MutableList<ULong>
}

@ExperimentalUnsignedTypes
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun <R> ULongArray.flatMapIndexed(transform: (Int, ULong) -> Iterable<Any>): List<Any> {
   val var2: LongArray = `$this$flatMapIndexed_u2ds8dVfGU`
   val var3: java.util.Collection = ArrayList()
   var var4: Int = 0
   var var5: Int = 0

   for (var6 in size..var5) {
      CollectionsKt.addAll(
         var3, transform(var4++, ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(var2, var5))) as java.lang.Iterable
      )
   }

   return var3 as MutableList<R>
}

@OverloadResolutionByLambdaReturnType
@InlineOnly
@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
public inline fun <R : Comparable<Any>> UByteArray.maxOfOrNull(selector: (UByte) -> Any): Any? {
   if (UByteArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$maxOfOrNull_u2dJOV_ifY`)) {
      return null
   } else {
      var maxValue: java.lang.Comparable = selector(
         UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$maxOfOrNull_u2dJOV_ifY`, 0))
      ) as java.lang.Comparable
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfOrNull_u2dJOV_ifY`)).iterator()

      while (var3.hasNext()) {
         val var7: java.lang.Comparable = selector(
            UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$maxOfOrNull_u2dJOV_ifY`, var3.nextInt()))
         ) as java.lang.Comparable
         if (maxValue.compareTo(var7) < 0) {
            maxValue = var7
         }
      }

      return (R)maxValue
   }
}

@InlineOnly
@ExperimentalUnsignedTypes
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
public inline fun UIntArray.minOfOrNull(selector: (UInt) -> Float): Float? {
   if (UIntArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$minOfOrNull_u2djgv0xPQ`)) {
      return null
   } else {
      var minValue: Float = (selector(UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$minOfOrNull_u2djgv0xPQ`, 0))) as java.lang.Number)
         .floatValue()
         val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfOrNull_u2djgv0xPQ`)).iterator()

      while (var3.hasNext()) {
         minValue = Math.min(
            minValue,
            (selector(UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$minOfOrNull_u2djgv0xPQ`, var3.nextInt()))) as java.lang.Number)
               .floatValue()
         )
      }

      return minValue
   }
}

@SinceKotlin(version = "1.3")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun <R, V> UIntArray.zip(other: Array<out Any>, transform: (UInt, Any) -> Any): List<Any> {
   val size: Int = Math.min(size, other.length)
   val list: ArrayList = ArrayList(size)

   repeat(size) { i ->
      list.add(transform(UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$zip_u2dZjwqOic`, i)), other[i]))
   }

   return list
}

@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun UShortArray.minOfOrNull(selector: (UShort) -> Double): Double? {
   if (UShortArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$minOfOrNull_u2dxTcfx_M`)) {
      return null
   } else {
      var minValue: Double = (selector(
            UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$minOfOrNull_u2dxTcfx_M`, 0))
         ) as java.lang.Number)
         .doubleValue()
         val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfOrNull_u2dxTcfx_M`)).iterator()

      while (var4.hasNext()) {
         minValue = Math.min(
            minValue,
            (selector(UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$minOfOrNull_u2dxTcfx_M`, var4.nextInt()))) as java.lang.Number)
               .doubleValue()
         )
      }

      return minValue
   }
}

@InlineOnly
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public inline fun UShortArray.single(predicate: (UShort) -> Boolean): UShort {
   var single: UShort = null
   var found: Boolean = false
   var var4: Int = 0

   for (var5 in size..var4) {
      val element: Short = UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$single_u2dxTcfx_M`, var4)
      if (predicate(UShort.box_impl/* $VF was: box-impl */(element)) as java.lang.Boolean) {
         if (found) {
            throw IllegalArgumentException("Array contains more than one matching element.")
         }

         single = UShort.box_impl/* $VF was: box-impl */(element)
         found = true
      }
   }

   if (!found) {
      throw NoSuchElementException("Array contains no element matching the predicate.")
   } else {
      return single.unbox_impl/* $VF was: unbox-impl */()
   }
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
@InlineOnly
@OverloadResolutionByLambdaReturnType
public inline fun <R : Comparable<Any>> ULongArray.minOfOrNull(selector: (ULong) -> Any): Any? {
   if (ULongArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$minOfOrNull_u2dMShoTSo`)) {
      return null
   } else {
      var minValue: java.lang.Comparable = selector(
         ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$minOfOrNull_u2dMShoTSo`, 0))
      ) as java.lang.Comparable
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfOrNull_u2dMShoTSo`)).iterator()

      while (var3.hasNext()) {
         val var7: java.lang.Comparable = selector(
            ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$minOfOrNull_u2dMShoTSo`, var3.nextInt()))
         ) as java.lang.Comparable
         if (minValue.compareTo(var7) > 0) {
            minValue = var7
         }
      }

      return (R)minValue
   }
}

@InlineOnly
@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
public inline fun <R : Comparable<Any>> UByteArray.minByOrNull(selector: (UByte) -> Any): UByte? {
   if (UByteArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$minByOrNull_u2dJOV_ifY`)) {
      return null
   } else {
      var minElem: Byte = UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$minByOrNull_u2dJOV_ifY`, 0)
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$minByOrNull_u2dJOV_ifY`)
      if (lastIndex == 0) {
         return UByte.box_impl/* $VF was: box-impl */(minElem)
      } else {
         var var9: java.lang.Comparable = selector(UByte.box_impl/* $VF was: box-impl */(minElem)) as java.lang.Comparable
         val var10: IntIterator = IntRange(1, lastIndex).iterator()

         while (var10.hasNext()) {
            val e: Byte = UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$minByOrNull_u2dJOV_ifY`, var10.nextInt())
            val v: java.lang.Comparable = selector(UByte.box_impl/* $VF was: box-impl */(e)) as java.lang.Comparable
            if (var9.compareTo(v) > 0) {
               minElem = e
               var9 = v
            }
         }

         return UByte.box_impl/* $VF was: box-impl */(minElem)
      }
   }
}

@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
public fun UByteArray?.contentToString(): String {
   if (`$this$contentToString_u2d2csIQuQ` != null) {
      val var10000: java.lang.String = CollectionsKt.joinToString$default(
         UByteArray.box_impl/* $VF was: box-impl */(`$this$contentToString_u2d2csIQuQ`), ", ", "[", "]", 0, null, null, 56, null
      )
      if (var10000 != null) {
         return var10000
      }
   }

   return "null"
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public inline fun <R> ULongArray.mapIndexed(transform: (Int, ULong) -> Any): List<Any> {
   val var2: LongArray = `$this$mapIndexed_u2ds8dVfGU`
   val var3: java.util.Collection = ArrayList(size)
   var var4: Int = 0
   var var5: Int = 0

   for (var6 in size..var5) {
      var3.add(transform(var4++, ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(var2, var5))))
   }

   return var3 as MutableList<R>
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
public inline fun <R : Comparable<Any>> UIntArray.minByOrNull(selector: (UInt) -> Any): UInt? {
   if (UIntArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$minByOrNull_u2djgv0xPQ`)) {
      return null
   } else {
      var minElem: Int = UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$minByOrNull_u2djgv0xPQ`, 0)
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$minByOrNull_u2djgv0xPQ`)
      if (lastIndex == 0) {
         return UInt.box_impl/* $VF was: box-impl */(minElem)
      } else {
         var var9: java.lang.Comparable = selector(UInt.box_impl/* $VF was: box-impl */(minElem)) as java.lang.Comparable
         val var10: IntIterator = IntRange(1, lastIndex).iterator()

         while (var10.hasNext()) {
            val e: Int = UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$minByOrNull_u2djgv0xPQ`, var10.nextInt())
            val v: java.lang.Comparable = selector(UInt.box_impl/* $VF was: box-impl */(e)) as java.lang.Comparable
            if (var9.compareTo(v) > 0) {
               minElem = e
               var9 = v
            }
         }

         return UInt.box_impl/* $VF was: box-impl */(minElem)
      }
   }
}

@SinceKotlin(version = "1.3")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun UShortArray.firstOrNull(predicate: (UShort) -> Boolean): UShort? {
   var var2: Int = 0

   for (var3 in size..var2) {
      val element: Short = UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$firstOrNull_u2dxTcfx_M`, var2)
      if (predicate(UShort.box_impl/* $VF was: box-impl */(element)) as java.lang.Boolean) {
         return UShort.box_impl/* $VF was: box-impl */(element)
      }
   }

   return null
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun <R, C : MutableCollection<in Any>> UByteArray.flatMapTo(destination: Any, transform: (UByte) -> Iterable<Any>): Any {
   var var3: Int = 0

   for (var4 in size..var3) {
      CollectionsKt.addAll(
         destination,
         transform(UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$flatMapTo_u2dwzUQCXU`, var3))) as java.lang.Iterable
      )
   }

   return (C)destination
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun <R, C : MutableCollection<in Any>> UShortArray.mapTo(destination: Any, transform: (UShort) -> Any): Any {
   var var3: Int = 0

   for (var4 in size..var3) {
      destination.add(transform(UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$mapTo_u2doEOeDjA`, var3))))
   }

   return (C)destination
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun UByteArray.getOrElse(index: Int, defaultValue: (Int) -> UByte): UByte {
   return if (index >= 0 && index <= ArraysKt.getLastIndex(`$this$getOrElse_u2dcO_u2dVybQ`))
      UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$getOrElse_u2dcO_u2dVybQ`, index)
      else
      (defaultValue(index) as UByte).unbox_impl/* $VF was: unbox-impl */()
   }

@SinceKotlin(version = "1.3")
@InlineOnly
@ExperimentalUnsignedTypes
public inline operator fun UIntArray.component3(): UInt {
   return UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$component3_u2d_u2dajY_u2d9A`, 2)
}

@SinceKotlin(version = "1.4")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun UShortArray.reverse(fromIndex: Int, toIndex: Int) {
   ArraysKt.reverse((short[])`$this$reverse_u2dAa5vz7o`, fromIndex, toIndex)
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
@InlineOnly
public inline operator fun UIntArray.component4(): UInt {
   return UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$component4_u2d_u2dajY_u2d9A`, 3)
}

@SinceKotlin(version = "1.7")
@ExperimentalUnsignedTypes
@JvmName(name = "minOrThrow-U")
public fun UByteArray.min(): UByte {
   if (UByteArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$min_u2dGBYM_sE`)) {
      throw NoSuchElementException()
   } else {
      var min: Byte = UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$min_u2dGBYM_sE`, 0)
      val var2: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$min_u2dGBYM_sE`)).iterator()

      while (var2.hasNext()) {
         val var6: Byte = UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$min_u2dGBYM_sE`, var2.nextInt())
         if (Intrinsics.compare(min and 255, var6 and 255) > 0) {
            min = var6
         }
      }

      return min
   }
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public fun UIntArray.take(n: Int): List<UInt> {
   if (n < 0) {
      throw IllegalArgumentException(("Requested element count $n is less than zero.").toString())
   } else if (n == 0) {
      return CollectionsKt.emptyList()
   } else if (n >= size) {
      return CollectionsKt.toList(UIntArray.box_impl/* $VF was: box-impl */(`$this$take_u2dqFRl0hI`))
   } else if (n == 1) {
      return CollectionsKt.listOf(UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$take_u2dqFRl0hI`, 0)))
   } else {
      val var7: Int = 0
      val list: ArrayList = ArrayList(n)
      var var4: Int = 0

      for (var5 in size..var4) {
         list.add(UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$take_u2dqFRl0hI`, var4)))
         if (++var7 == n) {
            break
         }
      }

      return list
   }
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun ULongArray.indexOfLast(predicate: (ULong) -> Boolean): Int {
   val `$this$indexOfLast$iv`: LongArray = `$this$indexOfLast_u2dMShoTSo`
   var var4: Int = `$this$indexOfLast_u2dMShoTSo`.length + -1
   if (0 <= `$this$indexOfLast_u2dMShoTSo`.length + -1) {
      do {
         val `index$iv`: Int = var4--
         if (predicate(ULong.box_impl/* $VF was: box-impl */(ULong.constructor_impl/* $VF was: constructor-impl */(`$this$indexOfLast$iv`[`index$iv`]))) as java.lang.Boolean
            )
          {
            return `index$iv`
         }
      } while (0 <= var4)
   }

   return -1
}

@SinceKotlin(version = "1.3")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun <R, C : MutableCollection<in Any>> ULongArray.mapTo(destination: Any, transform: (ULong) -> Any): Any {
   var var3: Int = 0

   for (var4 in size..var3) {
      destination.add(transform(ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$mapTo_u2dHqK1JgA`, var3))))
   }

   return (C)destination
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public inline fun <R> UIntArray.scan(initial: Any, operation: (Any, UInt) -> Any): List<Any> {
   val var3: IntArray = `$this$scan_u2dzi1B2BA`
   val var10000: java.util.List
   if (UIntArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$scan_u2dzi1B2BA`)) {
      var10000 = CollectionsKt.listOf(initial)
   } else {
      val var4: ArrayList = ArrayList(size + 1)
      var4.add(initial)
      val var6: ArrayList = var4
      var var9: Any = initial
      var var10: Int = 0

      for (var7 in size..var10) {
         var9 = operation(var9, UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(var3, var10)))
         var6.add(var9)
      }

      var10000 = var6
   }

   return var10000
}

@InlineOnly
@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
public inline fun UShortArray.reduceIndexedOrNull(operation: (Int, UShort, UShort) -> UShort): UShort? {
   if (UShortArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$reduceIndexedOrNull_u2daLgx1Fo`)) {
      return null
   } else {
      var accumulator: Short = UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$reduceIndexedOrNull_u2daLgx1Fo`, 0)
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$reduceIndexedOrNull_u2daLgx1Fo`)).iterator()

      while (var3.hasNext()) {
         val var6: Int = var3.nextInt()
         accumulator = (operation(
               var6,
               UShort.box_impl/* $VF was: box-impl */(accumulator),
               UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$reduceIndexedOrNull_u2daLgx1Fo`, var6))
            ) as UShort)
            .unbox_impl/* $VF was: unbox-impl */()
         }

      return UShort.box_impl/* $VF was: box-impl */(accumulator)
   }
}

@SinceKotlin(version = "1.3")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun <R> UIntArray.foldRight(initial: Any, operation: (UInt, Any) -> Any): Any {
   var index: Int = ArraysKt.getLastIndex(`$this$foldRight_u2dzi1B2BA`)
   var var6: Any = initial

   while (index >= 0) {
      var6 = operation(UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$foldRight_u2dzi1B2BA`, index--)), var6)
   }

   return (R)var6
}

@JvmName(name = "maxOrThrow-U")
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.7")
public fun UShortArray.max(): UShort {
   if (UShortArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$max_u2drL5Bavg`)) {
      throw NoSuchElementException()
   } else {
      var max: Short = UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$max_u2drL5Bavg`, 0)
      val var2: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$max_u2drL5Bavg`)).iterator()

      while (var2.hasNext()) {
         val var6: Short = UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$max_u2drL5Bavg`, var2.nextInt())
         if (Intrinsics.compare(max and 65535, var6 and 65535) < 0) {
            max = var6
         }
      }

      return max
   }
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun UShortArray.lastOrNull(predicate: (UShort) -> Boolean): UShort? {
   var var2: Int = size + -1
   if (0 <= var2) {
      do {
         val element: Short = UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$lastOrNull_u2dxTcfx_M`, var2--)
         if (predicate(UShort.box_impl/* $VF was: box-impl */(element)) as java.lang.Boolean) {
            return UShort.box_impl/* $VF was: box-impl */(element)
         }
      } while (0 <= var2)
   }

   return null
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun <R> UShortArray.map(transform: (UShort) -> Any): List<Any> {
   val var2: ShortArray = `$this$map_u2dxTcfx_M`
   val var3: java.util.Collection = ArrayList(size)
   var var4: Int = 0

   for (var5 in size..var4) {
      var3.add(transform(UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(var2, var4))))
   }

   return var3 as MutableList<R>
}

@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
@InlineOnly
@JvmName(name = "sumOfInt")
@ExperimentalUnsignedTypes
public inline fun UIntArray.sumOf(selector: (UInt) -> Int): Int {
   var sum: Int = 0
   var var3: Int = 0

   for (var4 in size..var3) {
      sum += (selector(UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$sumOf_u2djgv0xPQ`, var3))) as java.lang.Number)
         .intValue()
      }

   return sum
}

@ExperimentalUnsignedTypes
@InlineOnly
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
public inline fun UShortArray.minOf(selector: (UShort) -> Float): Float {
   if (UShortArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$minOf_u2dxTcfx_M`)) {
      throw NoSuchElementException()
   } else {
      var minValue: Float = (selector(UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$minOf_u2dxTcfx_M`, 0))) as java.lang.Number)
         .floatValue()
         val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOf_u2dxTcfx_M`)).iterator()

      while (var3.hasNext()) {
         minValue = Math.min(
            minValue,
            (selector(UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$minOf_u2dxTcfx_M`, var3.nextInt()))) as java.lang.Number)
               .floatValue()
         )
      }

      return minValue
   }
}

@JvmName(name = "minByOrThrow-U")
@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.7")
public inline fun <R : Comparable<Any>> UByteArray.minBy(selector: (UByte) -> Any): UByte {
   if (UByteArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$minBy_u2dJOV_ifY`)) {
      throw NoSuchElementException()
   } else {
      var minElem: Byte = UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$minBy_u2dJOV_ifY`, 0)
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$minBy_u2dJOV_ifY`)
      if (lastIndex == 0) {
         return minElem
      } else {
         var var9: java.lang.Comparable = selector(UByte.box_impl/* $VF was: box-impl */(minElem)) as java.lang.Comparable
         val var10: IntIterator = IntRange(1, lastIndex).iterator()

         while (var10.hasNext()) {
            val e: Byte = UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$minBy_u2dJOV_ifY`, var10.nextInt())
            val v: java.lang.Comparable = selector(UByte.box_impl/* $VF was: box-impl */(e)) as java.lang.Comparable
            if (var9.compareTo(v) > 0) {
               minElem = e
               var9 = v
            }
         }

         return minElem
      }
   }
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun <R> UShortArray.scan(initial: Any, operation: (Any, UShort) -> Any): List<Any> {
   val var3: ShortArray = `$this$scan_u2dzww5nb8`
   val var10000: java.util.List
   if (UShortArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$scan_u2dzww5nb8`)) {
      var10000 = CollectionsKt.listOf(initial)
   } else {
      val var4: ArrayList = ArrayList(size + 1)
      var4.add(initial)
      val var6: ArrayList = var4
      var var9: Any = initial
      var var10: Int = 0

      for (var7 in size..var10) {
         var9 = operation(var9, UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(var3, var10)))
         var6.add(var9)
      }

      var10000 = var6
   }

   return var10000
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public fun UByteArray.sortedDescending(): List<UByte> {
   val var10000: ByteArray = Arrays.copyOf(`$this$sortedDescending_u2dGBYM_sE`, `$this$sortedDescending_u2dGBYM_sE`.length)
   val var1: ByteArray = UByteArray.constructor_impl/* $VF was: constructor-impl */(var10000)
   UArraysKt.sort_GBYM_sE/* $VF was: sort-GBYM_sE */(var1)
   return UArraysKt.reversed_GBYM_sE/* $VF was: reversed-GBYM_sE */(var1)
}

@SinceKotlin(version = "1.3")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun UIntArray.lastOrNull(predicate: (UInt) -> Boolean): UInt? {
   var var2: Int = size + -1
   if (0 <= var2) {
      do {
         val element: Int = UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$lastOrNull_u2djgv0xPQ`, var2--)
         if (predicate(UInt.box_impl/* $VF was: box-impl */(element)) as java.lang.Boolean) {
            return UInt.box_impl/* $VF was: box-impl */(element)
         }
      } while (0 <= var2)
   }

   return null
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun ShortArray.toUShortArray(): UShortArray {
   val var10000: ShortArray = Arrays.copyOf(`$this$toUShortArray`, `$this$toUShortArray`.length)
   return UShortArray.constructor_impl/* $VF was: constructor-impl */(var10000)
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public inline fun UIntArray.elementAtOrElse(index: Int, defaultValue: (Int) -> UInt): UInt {
   return if (index >= 0 && index <= ArraysKt.getLastIndex(`$this$elementAtOrElse_u2dQxvSvLU`))
      UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$elementAtOrElse_u2dQxvSvLU`, index)
      else
      (defaultValue(index) as UInt).unbox_impl/* $VF was: unbox-impl */()
   }

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@InlineOnly
public inline fun UByteArray.randomOrNull(): UByte? {
   return UArraysKt.randomOrNull_oSF2wD8/* $VF was: randomOrNull-oSF2wD8 */(`$this$randomOrNull_u2dGBYM_sE`, Random.Default)
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun UIntArray.reversedArray(): UIntArray {
   return UIntArray.constructor_impl/* $VF was: constructor-impl */(ArraysKt.reversedArray(`$this$reversedArray_u2d_u2dajY_u2d9A`))
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public fun UIntArray.sortedArray(): UIntArray {
   if (UIntArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$sortedArray_u2d_u2dajY_u2d9A`)) {
      return `$this$sortedArray_u2d_u2dajY_u2d9A`
   } else {
      val var10000: IntArray = Arrays.copyOf(`$this$sortedArray_u2d_u2dajY_u2d9A`, `$this$sortedArray_u2d_u2dajY_u2d9A`.length)
      val var1: IntArray = UIntArray.constructor_impl/* $VF was: constructor-impl */(var10000)
      UArraysKt.sort__ajY_9A/* $VF was: sort--ajY-9A */(var1)
      return var1
   }
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public infix fun <R> UShortArray.zip(other: Iterable<Any>): List<Pair<UShort, Any>> {
   val var2: ShortArray = `$this$zip_u2dJGPC0_u2dM`
   val var3: Int = size
   val var4: ArrayList = ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(other, 10), var3))
   var var5: Int = 0

   for (var7 in other) {
      if (var5 >= var3) {
         break
      }

      var4.add(UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(var2, var5++)) to var7)
   }

   return var4
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
public fun UShortArray.minOrNull(): UShort? {
   if (UShortArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$minOrNull_u2drL5Bavg`)) {
      return null
   } else {
      var min: Short = UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$minOrNull_u2drL5Bavg`, 0)
      val var2: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOrNull_u2drL5Bavg`)).iterator()

      while (var2.hasNext()) {
         val var6: Short = UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$minOrNull_u2drL5Bavg`, var2.nextInt())
         if (Intrinsics.compare(min and 65535, var6 and 65535) > 0) {
            min = var6
         }
      }

      return UShort.box_impl/* $VF was: box-impl */(min)
   }
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public fun UIntArray.slice(indices: IntRange): List<UInt> {
   return if (indices.isEmpty())
      CollectionsKt.emptyList()
      else
      UArraysKt.asList__ajY_9A/* $VF was: asList--ajY-9A */(
         UIntArray.constructor_impl/* $VF was: constructor-impl */(
            ArraysKt.copyOfRange((int[])`$this$slice_u2dtAntMlw`, indices.start, indices.endInclusive + 1)
         )
      )
   }

@SinceKotlin(version = "1.7")
@JvmName(name = "minOrThrow-U")
@ExperimentalUnsignedTypes
public fun ULongArray.min(): ULong {
   if (ULongArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$min_u2dQwZRm1k`)) {
      throw NoSuchElementException()
   } else {
      var min: Long = ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$min_u2dQwZRm1k`, 0)
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$min_u2dQwZRm1k`)).iterator()

      while (var3.hasNext()) {
         val var8: Long = ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$min_u2dQwZRm1k`, var3.nextInt())
         if (java.lang.Long.compareUnsigned(min, var8) > 0) {
            min = var8
         }
      }

      return min
   }
}

@ExperimentalUnsignedTypes
@JvmName(name = "minWithOrThrow-U")
@SinceKotlin(version = "1.7")
public fun ULongArray.minWith(comparator: Comparator<in ULong>): ULong {
   if (ULongArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$minWith_u2dzrEWJaI`)) {
      throw NoSuchElementException()
   } else {
      var min: Long = ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$minWith_u2dzrEWJaI`, 0)
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minWith_u2dzrEWJaI`)).iterator()

      while (var4.hasNext()) {
         val var9: Long = ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$minWith_u2dzrEWJaI`, var4.nextInt())
         if (comparator.compare(ULong.box_impl/* $VF was: box-impl */(min), ULong.box_impl/* $VF was: box-impl */(var9)) > 0) {
            min = var9
         }
      }

      return min
   }
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun UShortArray.filter(predicate: (UShort) -> Boolean): List<UShort> {
   val var2: ShortArray = `$this$filter_u2dxTcfx_M`
   val var3: java.util.Collection = ArrayList()
   var var4: Int = 0

   for (var5 in size..var4) {
      val var6: Short = UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(var2, var4)
      if (predicate(UShort.box_impl/* $VF was: box-impl */(var6)) as java.lang.Boolean) {
         var3.add(UShort.box_impl/* $VF was: box-impl */(var6))
      }
   }

   return var3 as MutableList<UShort>
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public fun UShortArray.getOrNull(index: Int): UShort? {
   return if (index >= 0 && index <= ArraysKt.getLastIndex(`$this$getOrNull_u2dnggk6HY`))
      UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$getOrNull_u2dnggk6HY`, index))
      else
      null
   }

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public inline fun UShortArray.indexOfLast(predicate: (UShort) -> Boolean): Int {
   val `$this$indexOfLast$iv`: ShortArray = `$this$indexOfLast_u2dxTcfx_M`
   var var4: Int = `$this$indexOfLast_u2dxTcfx_M`.length + -1
   if (0 <= `$this$indexOfLast_u2dxTcfx_M`.length + -1) {
      do {
         val `index$iv`: Int = var4--
         if (predicate(UShort.box_impl/* $VF was: box-impl */(UShort.constructor_impl/* $VF was: constructor-impl */(`$this$indexOfLast$iv`[`index$iv`]))) as java.lang.Boolean
            )
          {
            return `index$iv`
         }
      } while (0 <= var4)
   }

   return -1
}

@InlineOnly
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public inline fun UByteArray.elementAtOrNull(index: Int): UByte? {
   return UArraysKt.getOrNull_PpDY95g/* $VF was: getOrNull-PpDY95g */(`$this$elementAtOrNull_u2dPpDY95g`, index)
}

@OverloadResolutionByLambdaReturnType
@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
public inline fun UIntArray.minOf(selector: (UInt) -> Double): Double {
   if (UIntArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$minOf_u2djgv0xPQ`)) {
      throw NoSuchElementException()
   } else {
      var minValue: Double = (selector(UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$minOf_u2djgv0xPQ`, 0))) as java.lang.Number)
         .doubleValue()
         val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOf_u2djgv0xPQ`)).iterator()

      while (var4.hasNext()) {
         minValue = Math.min(
            minValue,
            (selector(UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$minOf_u2djgv0xPQ`, var4.nextInt()))) as java.lang.Number)
               .doubleValue()
         )
      }

      return minValue
   }
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public fun UShortArray.slice(indices: IntRange): List<UShort> {
   return if (indices.isEmpty())
      CollectionsKt.emptyList()
      else
      UArraysKt.asList_rL5Bavg/* $VF was: asList-rL5Bavg */(
         UShortArray.constructor_impl/* $VF was: constructor-impl */(
            ArraysKt.copyOfRange((short[])`$this$slice_u2dQ6IL4kU`, indices.start, indices.endInclusive + 1)
         )
      )
   }

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
public inline fun UByteArray.runningReduce(operation: (UByte, UByte) -> UByte): List<UByte> {
   if (UByteArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$runningReduce_u2dELGow60`)) {
      return CollectionsKt.emptyList()
   } else {
      var var7: Byte = UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$runningReduce_u2dELGow60`, 0)
      val index: Int = (int)ArrayList(size)
      index.add(UByte.box_impl/* $VF was: box-impl */(var7))
      val result: Any = index
      var var8: Int = 1

      for (var9 in size..var8) {
         var7 = (operation(
               UByte.box_impl/* $VF was: box-impl */(var7),
               UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$runningReduce_u2dELGow60`, var8))
            ) as UByte)
            .unbox_impl/* $VF was: unbox-impl */()
            result.add(UByte.box_impl/* $VF was: box-impl */(var7))
      }

      return result as MutableList<UByte>
   }
}

@SinceKotlin(version = "1.3")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun <R> UShortArray.mapIndexed(transform: (Int, UShort) -> Any): List<Any> {
   val var2: ShortArray = `$this$mapIndexed_u2dxzaTVY8`
   val var3: java.util.Collection = ArrayList(size)
   var var4: Int = 0
   var var5: Int = 0

   for (var6 in size..var5) {
      var3.add(transform(var4++, UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(var2, var5))))
   }

   return var3 as MutableList<R>
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun UByteArray.reduceRightIndexed(operation: (Int, UByte, UByte) -> UByte): UByte {
   var index: Int = ArraysKt.getLastIndex(`$this$reduceRightIndexed_u2dEOyYB1Y`)
   if (index < 0) {
      throw UnsupportedOperationException("Empty array can't be reduced.")
   } else {
      var var6: Byte = UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$reduceRightIndexed_u2dEOyYB1Y`, index--)

      while (index >= 0) {
         var6 = (operation(
               index,
               UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$reduceRightIndexed_u2dEOyYB1Y`, index)),
               UByte.box_impl/* $VF was: box-impl */(var6)
            ) as UByte)
            .unbox_impl/* $VF was: unbox-impl */()
            index--
      }

      return var6
   }
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public inline fun <R, C : MutableCollection<in Any>> UByteArray.mapIndexedTo(destination: Any, transform: (Int, UByte) -> Any): Any {
   var index: Int = 0
   var var4: Int = 0

   for (var5 in size..var4) {
      destination.add(
         transform(index++, UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$mapIndexedTo_u2deNpIKz8`, var4)))
      )
   }

   return (C)destination
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public fun UByteArray.fill(element: UByte, fromIndex: Int = ..., toIndex: Int = ...) {
   ArraysKt.fill(`$this$fill_u2dWpHrYlw`, element, fromIndex, toIndex)
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public fun ULongArray.random(random: Random): ULong {
   if (ULongArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$random_u2dJzugnMA`)) {
      throw NoSuchElementException("Array is empty.")
   } else {
      return ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$random_u2dJzugnMA`, random.nextInt(size))
   }
}

@InlineOnly
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public inline fun UByteArray.indexOfFirst(predicate: (UByte) -> Boolean): Int {
   val `$this$indexOfFirst$iv`: ByteArray = `$this$indexOfFirst_u2dJOV_ifY`
   var `index$iv`: Int = 0
   val var5: Int = `$this$indexOfFirst_u2dJOV_ifY`.length

   var var10000: Int
   while (true) {
      if (`index$iv` >= var5) {
         var10000 = -1
         break
      }

      if (predicate(UByte.box_impl/* $VF was: box-impl */(UByte.constructor_impl/* $VF was: constructor-impl */(`$this$indexOfFirst$iv`[`index$iv`]))) as java.lang.Boolean
         )
       {
         var10000 = `index$iv`
         break
      }

      `index$iv`++
   }

   return var10000
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public inline fun UIntArray.none(predicate: (UInt) -> Boolean): Boolean {
   var var2: Int = 0

   for (var3 in size..var2) {
      if (predicate(UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$none_u2djgv0xPQ`, var2))) as java.lang.Boolean) {
         return false
      }
   }

   return true
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public fun ULongArray.sortedArrayDescending(): ULongArray {
   if (ULongArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$sortedArrayDescending_u2dQwZRm1k`)) {
      return `$this$sortedArrayDescending_u2dQwZRm1k`
   } else {
      val var10000: LongArray = Arrays.copyOf(`$this$sortedArrayDescending_u2dQwZRm1k`, `$this$sortedArrayDescending_u2dQwZRm1k`.length)
      val var1: LongArray = ULongArray.constructor_impl/* $VF was: constructor-impl */(var10000)
      UArraysKt.sortDescending_QwZRm1k/* $VF was: sortDescending-QwZRm1k */(var1)
      return var1
   }
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public fun UShortArray.slice(indices: Iterable<Int>): List<UShort> {
   val size: Int = CollectionsKt.collectionSizeOrDefault(indices, 10)
   if (size == 0) {
      return CollectionsKt.emptyList()
   } else {
      val list: ArrayList = ArrayList(size)
      val var4: java.util.Iterator = indices.iterator()

      while (var4.hasNext()) {
         list.add(
            UShort.box_impl/* $VF was: box-impl */(
               UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$slice_u2dJGPC0_u2dM`, (var4.next() as java.lang.Number).intValue())
            )
         )
      }

      return list
   }
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun UByteArray.none(predicate: (UByte) -> Boolean): Boolean {
   var var2: Int = 0

   for (var3 in size..var2) {
      if (predicate(UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$none_u2dJOV_ifY`, var2))) as java.lang.Boolean
         )
       {
         return false
      }
   }

   return true
}

@InlineOnly
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public inline fun UShortArray.lastIndexOf(element: UShort): Int {
   return ArraysKt.lastIndexOf(`$this$lastIndexOf_u2dXzdR7RA`, element)
}

@JvmName(name = "sumOfDouble")
@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
public inline fun ULongArray.sumOf(selector: (ULong) -> Double): Double {
   var sum: Double = 0.0
   var var4: Int = 0

   for (var5 in size..var4) {
      sum += (selector(ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$sumOf_u2dMShoTSo`, var4))) as java.lang.Number)
         .doubleValue()
      }

   return sum
}

@InlineOnly
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public inline fun <R, V> UIntArray.zip(other: Iterable<Any>, transform: (UInt, Any) -> Any): List<Any> {
   val arraySize: Int = size
   val list: ArrayList = ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(other, 10), arraySize))
   var i: Int = 0

   for (element in other) {
      if (i >= arraySize) {
         break
      }

      list.add(transform(UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$zip_u2d7znnbtw`, i++)), element))
   }

   return list
}

@SinceKotlin(version = "1.3")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun UByteArray.filter(predicate: (UByte) -> Boolean): List<UByte> {
   val var2: ByteArray = `$this$filter_u2dJOV_ifY`
   val var3: java.util.Collection = ArrayList()
   var var4: Int = 0

   for (var5 in size..var4) {
      val var6: Byte = UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(var2, var4)
      if (predicate(UByte.box_impl/* $VF was: box-impl */(var6)) as java.lang.Boolean) {
         var3.add(UByte.box_impl/* $VF was: box-impl */(var6))
      }
   }

   return var3 as MutableList<UByte>
}

@InlineOnly
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public inline fun UByteArray.single(): UByte {
   return UByte.constructor_impl/* $VF was: constructor-impl */(ArraysKt.single(`$this$single_u2dGBYM_sE`))
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline operator fun UByteArray.component4(): UByte {
   return UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$component4_u2dGBYM_sE`, 3)
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun ULongArray.last(): ULong {
   return ULong.constructor_impl/* $VF was: constructor-impl */(ArraysKt.last(`$this$last_u2dQwZRm1k`))
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun UByteArray.count(predicate: (UByte) -> Boolean): Int {
   var count: Int = 0
   var var3: Int = 0

   for (var4 in size..var3) {
      if (predicate(UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$count_u2dJOV_ifY`, var3))) as java.lang.Boolean
         )
       {
         count++
      }
   }

   return count
}

@SinceKotlin(version = "1.3")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun ULongArray.all(predicate: (ULong) -> Boolean): Boolean {
   var var2: Int = 0

   for (var3 in size..var2) {
      if (!predicate(ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$all_u2dMShoTSo`, var2))) as java.lang.Boolean
         )
       {
         return false
      }
   }

   return true
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public inline fun <R, C : MutableCollection<in Any>> UByteArray.mapTo(destination: Any, transform: (UByte) -> Any): Any {
   var var3: Int = 0

   for (var4 in size..var3) {
      destination.add(transform(UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$mapTo_u2dwzUQCXU`, var3))))
   }

   return (C)destination
}

@InlineOnly
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public inline operator fun UByteArray.component1(): UByte {
   return UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$component1_u2dGBYM_sE`, 0)
}

@InlineOnly
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public inline fun ULongArray.reduce(operation: (ULong, ULong) -> ULong): ULong {
   if (ULongArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$reduce_u2ds8dVfGU`)) {
      throw UnsupportedOperationException("Empty array can't be reduced.")
   } else {
      var accumulator: Long = ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$reduce_u2ds8dVfGU`, 0)
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$reduce_u2ds8dVfGU`)).iterator()

      while (var4.hasNext()) {
         accumulator = (operation(
               ULong.box_impl/* $VF was: box-impl */(accumulator),
               ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$reduce_u2ds8dVfGU`, var4.nextInt()))
            ) as ULong)
            .unbox_impl/* $VF was: unbox-impl */()
         }

      return accumulator
   }
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun <R> UIntArray.foldRightIndexed(initial: Any, operation: (Int, UInt, Any) -> Any): Any {
   var index: Int = ArraysKt.getLastIndex(`$this$foldRightIndexed_u2dyVwIW0Q`)
   var var6: Any = initial

   while (index >= 0) {
      var6 = operation(
         index, UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$foldRightIndexed_u2dyVwIW0Q`, index)), var6
      )
      index--
   }

   return (R)var6
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public inline fun UShortArray.dropWhile(predicate: (UShort) -> Boolean): List<UShort> {
   var yielding: Boolean = false
   val list: ArrayList = ArrayList()
   var var4: Int = 0

   for (var5 in size..var4) {
      val item: Short = UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$dropWhile_u2dxTcfx_M`, var4)
      if (yielding) {
         list.add(UShort.box_impl/* $VF was: box-impl */(item))
      } else if (!predicate(UShort.box_impl/* $VF was: box-impl */(item)) as java.lang.Boolean) {
         list.add(UShort.box_impl/* $VF was: box-impl */(item))
         yielding = true
      }
   }

   return list
}

@DeprecatedSinceKotlin(warningSince = "1.5")
@Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = []))
@SinceKotlin(version = "1.3")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun UIntArray.sumBy(selector: (UInt) -> UInt): UInt {
   var sum: Int = 0
   var var3: Int = 0

   for (var4 in size..var3) {
      sum = UInt.constructor_impl/* $VF was: constructor-impl */(
         sum
            + (selector(UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$sumBy_u2djgv0xPQ`, var3))) as UInt)
               .unbox_impl/* $VF was: unbox-impl */()
      )
   }

   return sum
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public fun ULongArray.fill(element: ULong, fromIndex: Int = ..., toIndex: Int = ...) {
   ArraysKt.fill(`$this$fill_u2dK6DWlUc`, (long)element, fromIndex, toIndex)
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public fun UShortArray.drop(n: Int): List<UShort> {
   if (n < 0) {
      throw IllegalArgumentException(("Requested element count $n is less than zero.").toString())
   } else {
      return UArraysKt.takeLast_nggk6HY/* $VF was: takeLast-nggk6HY */(`$this$drop_u2dnggk6HY`, RangesKt.coerceAtLeast(size - n, 0))
   }
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public inline fun UByteArray.any(): Boolean {
   return ArraysKt.any(`$this$any_u2dGBYM_sE`)
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
public inline fun UShortArray.minOfOrNull(selector: (UShort) -> Float): Float? {
   if (UShortArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$minOfOrNull_u2dxTcfx_M`)) {
      return null
   } else {
      var minValue: Float = (selector(
            UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$minOfOrNull_u2dxTcfx_M`, 0))
         ) as java.lang.Number)
         .floatValue()
         val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfOrNull_u2dxTcfx_M`)).iterator()

      while (var3.hasNext()) {
         minValue = Math.min(
            minValue,
            (selector(UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$minOfOrNull_u2dxTcfx_M`, var3.nextInt()))) as java.lang.Number)
               .floatValue()
         )
      }

      return minValue
   }
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public fun ULongArray.take(n: Int): List<ULong> {
   if (n < 0) {
      throw IllegalArgumentException(("Requested element count $n is less than zero.").toString())
   } else if (n == 0) {
      return CollectionsKt.emptyList()
   } else if (n >= size) {
      return CollectionsKt.toList(ULongArray.box_impl/* $VF was: box-impl */(`$this$take_u2dr7IrZao`))
   } else if (n == 1) {
      return CollectionsKt.listOf(ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$take_u2dr7IrZao`, 0)))
   } else {
      val var8: Int = 0
      val list: ArrayList = ArrayList(n)
      var var4: Int = 0

      for (var5 in size..var4) {
         list.add(ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$take_u2dr7IrZao`, var4)))
         if (++var8 == n) {
            break
         }
      }

      return list
   }
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
public fun UShortArray.maxOrNull(): UShort? {
   if (UShortArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$maxOrNull_u2drL5Bavg`)) {
      return null
   } else {
      var max: Short = UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$maxOrNull_u2drL5Bavg`, 0)
      val var2: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOrNull_u2drL5Bavg`)).iterator()

      while (var2.hasNext()) {
         val var6: Short = UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$maxOrNull_u2drL5Bavg`, var2.nextInt())
         if (Intrinsics.compare(max and 65535, var6 and 65535) < 0) {
            max = var6
         }
      }

      return UShort.box_impl/* $VF was: box-impl */(max)
   }
}

@InlineOnly
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public inline fun <R> UByteArray.map(transform: (UByte) -> Any): List<Any> {
   val var2: ByteArray = `$this$map_u2dJOV_ifY`
   val var3: java.util.Collection = ArrayList(size)
   var var4: Int = 0

   for (var5 in size..var4) {
      var3.add(transform(UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(var2, var4))))
   }

   return var3 as MutableList<R>
}

@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
@InlineOnly
@JvmName(name = "sumOfLong")
@OverloadResolutionByLambdaReturnType
public inline fun UByteArray.sumOf(selector: (UByte) -> Long): Long {
   var sum: Long = 0L
   var var4: Int = 0

   for (var5 in size..var4) {
      sum += (selector(UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$sumOf_u2dJOV_ifY`, var4))) as java.lang.Number)
         .longValue()
      }

   return sum
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun UShortArray.takeLastWhile(predicate: (UShort) -> Boolean): List<UShort> {
   for (index in ArraysKt.getLastIndex(`$this$takeLastWhile_u2dxTcfx_M`) downTo 0) {
      if (!predicate(UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$takeLastWhile_u2dxTcfx_M`, index))) as java.lang.Boolean
         )
       {
         return UArraysKt.drop_nggk6HY/* $VF was: drop-nggk6HY */(`$this$takeLastWhile_u2dxTcfx_M`, index + 1)
      }
   }

   return CollectionsKt.toList(UShortArray.box_impl/* $VF was: box-impl */(`$this$takeLastWhile_u2dxTcfx_M`))
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun UByteArray.single(predicate: (UByte) -> Boolean): UByte {
   var single: UByte = null
   var found: Boolean = false
   var var4: Int = 0

   for (var5 in size..var4) {
      val element: Byte = UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$single_u2dJOV_ifY`, var4)
      if (predicate(UByte.box_impl/* $VF was: box-impl */(element)) as java.lang.Boolean) {
         if (found) {
            throw IllegalArgumentException("Array contains more than one matching element.")
         }

         single = UByte.box_impl/* $VF was: box-impl */(element)
         found = true
      }
   }

   if (!found) {
      throw NoSuchElementException("Array contains no element matching the predicate.")
   } else {
      return single.unbox_impl/* $VF was: unbox-impl */()
   }
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun UByteArray.elementAtOrElse(index: Int, defaultValue: (Int) -> UByte): UByte {
   return if (index >= 0 && index <= ArraysKt.getLastIndex(`$this$elementAtOrElse_u2dcO_u2dVybQ`))
      UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$elementAtOrElse_u2dcO_u2dVybQ`, index)
      else
      (defaultValue(index) as UByte).unbox_impl/* $VF was: unbox-impl */()
   }

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public final val lastIndex: Int
   public final inline get() {
      return ArraysKt.getLastIndex(`$this$lastIndex`)
   }


@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun <R : Comparable<Any>> UShortArray.minOf(selector: (UShort) -> Any): Any {
   if (UShortArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$minOf_u2dxTcfx_M`)) {
      throw NoSuchElementException()
   } else {
      var minValue: java.lang.Comparable = selector(
         UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$minOf_u2dxTcfx_M`, 0))
      ) as java.lang.Comparable
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOf_u2dxTcfx_M`)).iterator()

      while (var3.hasNext()) {
         val var7: java.lang.Comparable = selector(
            UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$minOf_u2dxTcfx_M`, var3.nextInt()))
         ) as java.lang.Comparable
         if (minValue.compareTo(var7) > 0) {
            minValue = var7
         }
      }

      return (R)minValue
   }
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
@InlineOnly
@OverloadResolutionByLambdaReturnType
public inline fun <R> ULongArray.maxOfWithOrNull(comparator: Comparator<in Any>, selector: (ULong) -> Any): Any? {
   if (ULongArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$maxOfWithOrNull_u2d5NtCtWE`)) {
      return null
   } else {
      var maxValue: Any = selector(
         ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$maxOfWithOrNull_u2d5NtCtWE`, 0))
      )
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfWithOrNull_u2d5NtCtWE`)).iterator()

      while (var4.hasNext()) {
         val var8: Any = selector(
            ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$maxOfWithOrNull_u2d5NtCtWE`, var4.nextInt()))
         )
         if (comparator.compare(maxValue, var8) < 0) {
            maxValue = var8
         }
      }

      return (R)maxValue
   }
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun UByteArray.reduceIndexedOrNull(operation: (Int, UByte, UByte) -> UByte): UByte? {
   if (UByteArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$reduceIndexedOrNull_u2dEOyYB1Y`)) {
      return null
   } else {
      var accumulator: Byte = UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$reduceIndexedOrNull_u2dEOyYB1Y`, 0)
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$reduceIndexedOrNull_u2dEOyYB1Y`)).iterator()

      while (var3.hasNext()) {
         val var6: Int = var3.nextInt()
         accumulator = (operation(
               var6,
               UByte.box_impl/* $VF was: box-impl */(accumulator),
               UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$reduceIndexedOrNull_u2dEOyYB1Y`, var6))
            ) as UByte)
            .unbox_impl/* $VF was: unbox-impl */()
         }

      return UByte.box_impl/* $VF was: box-impl */(accumulator)
   }
}

@ExperimentalUnsignedTypes
@OverloadResolutionByLambdaReturnType
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun UByteArray.minOfOrNull(selector: (UByte) -> Double): Double? {
   if (UByteArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$minOfOrNull_u2dJOV_ifY`)) {
      return null
   } else {
      var minValue: Double = (selector(
            UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$minOfOrNull_u2dJOV_ifY`, 0))
         ) as java.lang.Number)
         .doubleValue()
         val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfOrNull_u2dJOV_ifY`)).iterator()

      while (var4.hasNext()) {
         minValue = Math.min(
            minValue,
            (selector(UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$minOfOrNull_u2dJOV_ifY`, var4.nextInt()))) as java.lang.Number)
               .doubleValue()
         )
      }

      return minValue
   }
}

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@ExperimentalUnsignedTypes
@InlineOnly
@JvmName(name = "sumOfUInt")
@OverloadResolutionByLambdaReturnType
public inline fun ULongArray.sumOf(selector: (ULong) -> UInt): UInt {
   var sum: Int = UInt.constructor_impl/* $VF was: constructor-impl */(0)
   var var3: Int = 0

   for (var4 in size..var3) {
      sum = UInt.constructor_impl/* $VF was: constructor-impl */(
         sum
            + (selector(ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$sumOf_u2dMShoTSo`, var3))) as UInt)
               .unbox_impl/* $VF was: unbox-impl */()
      )
   }

   return sum
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun UByteArray.filterNot(predicate: (UByte) -> Boolean): List<UByte> {
   val var2: ByteArray = `$this$filterNot_u2dJOV_ifY`
   val var3: java.util.Collection = ArrayList()
   var var4: Int = 0

   for (var5 in size..var4) {
      val var6: Byte = UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(var2, var4)
      if (!predicate(UByte.box_impl/* $VF was: box-impl */(var6)) as java.lang.Boolean) {
         var3.add(UByte.box_impl/* $VF was: box-impl */(var6))
      }
   }

   return var3 as MutableList<UByte>
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@InlineOnly
@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
public inline fun ULongArray.reduceOrNull(operation: (ULong, ULong) -> ULong): ULong? {
   if (ULongArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$reduceOrNull_u2ds8dVfGU`)) {
      return null
   } else {
      var accumulator: Long = ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$reduceOrNull_u2ds8dVfGU`, 0)
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$reduceOrNull_u2ds8dVfGU`)).iterator()

      while (var4.hasNext()) {
         accumulator = (operation(
               ULong.box_impl/* $VF was: box-impl */(accumulator),
               ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$reduceOrNull_u2ds8dVfGU`, var4.nextInt()))
            ) as ULong)
            .unbox_impl/* $VF was: unbox-impl */()
         }

      return ULong.box_impl/* $VF was: box-impl */(accumulator)
   }
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@InlineOnly
@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
public inline fun UIntArray.reduceOrNull(operation: (UInt, UInt) -> UInt): UInt? {
   if (UIntArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$reduceOrNull_u2dWyvcNBI`)) {
      return null
   } else {
      var accumulator: Int = UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$reduceOrNull_u2dWyvcNBI`, 0)
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$reduceOrNull_u2dWyvcNBI`)).iterator()

      while (var3.hasNext()) {
         accumulator = (operation(
               UInt.box_impl/* $VF was: box-impl */(accumulator),
               UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$reduceOrNull_u2dWyvcNBI`, var3.nextInt()))
            ) as UInt)
            .unbox_impl/* $VF was: unbox-impl */()
         }

      return UInt.box_impl/* $VF was: box-impl */(accumulator)
   }
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public fun UIntArray.sorted(): List<UInt> {
   val var10000: IntArray = Arrays.copyOf(`$this$sorted_u2d_u2dajY_u2d9A`, `$this$sorted_u2d_u2dajY_u2d9A`.length)
   val var1: IntArray = UIntArray.constructor_impl/* $VF was: constructor-impl */(var10000)
   UArraysKt.sort__ajY_9A/* $VF was: sort--ajY-9A */(var1)
   return UArraysKt.asList__ajY_9A/* $VF was: asList--ajY-9A */(var1)
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public final val lastIndex: Int
   public final inline get() {
      return ArraysKt.getLastIndex(`$this$lastIndex`)
   }


@InlineOnly
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public inline fun UIntArray.indexOfFirst(predicate: (UInt) -> Boolean): Int {
   val `$this$indexOfFirst$iv`: IntArray = `$this$indexOfFirst_u2djgv0xPQ`
   var `index$iv`: Int = 0
   val var5: Int = `$this$indexOfFirst_u2djgv0xPQ`.length

   var var10000: Int
   while (true) {
      if (`index$iv` >= var5) {
         var10000 = -1
         break
      }

      if (predicate(UInt.box_impl/* $VF was: box-impl */(UInt.constructor_impl/* $VF was: constructor-impl */(`$this$indexOfFirst$iv`[`index$iv`]))) as java.lang.Boolean
         )
       {
         var10000 = `index$iv`
         break
      }

      `index$iv`++
   }

   return var10000
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun <V> ULongArray.associateWith(valueSelector: (ULong) -> Any): Map<ULong, Any> {
   val result: LinkedHashMap = LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(size), 16))
   val var3: LongArray = `$this$associateWith_u2dMShoTSo`
   var var4: Int = 0

   for (var5 in size..var4) {
      val var6: Long = ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(var3, var4)
      result.put(ULong.box_impl/* $VF was: box-impl */(var6), valueSelector(ULong.box_impl/* $VF was: box-impl */(var6)))
   }

   return result
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun UIntArray.copyOf(newSize: Int): UIntArray {
   val var10000: IntArray = Arrays.copyOf(`$this$copyOf_u2dqFRl0hI`, newSize)
   return UIntArray.constructor_impl/* $VF was: constructor-impl */(var10000)
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
public infix fun ULongArray?.contentEquals(other: ULongArray?): Boolean {
   var var10000: LongArray = `$this$contentEquals_u2dlec5QzE`
   if (`$this$contentEquals_u2dlec5QzE` == null) {
      var10000 = null
   }

   var var10001: LongArray = other
   if (other == null) {
      var10001 = null
   }

   return Arrays.equals(var10000, var10001)
}

@ExperimentalUnsignedTypes
@OverloadResolutionByLambdaReturnType
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun UShortArray.maxOf(selector: (UShort) -> Double): Double {
   if (UShortArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$maxOf_u2dxTcfx_M`)) {
      throw NoSuchElementException()
   } else {
      var maxValue: Double = (selector(UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$maxOf_u2dxTcfx_M`, 0))) as java.lang.Number)
         .doubleValue()
         val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOf_u2dxTcfx_M`)).iterator()

      while (var4.hasNext()) {
         maxValue = Math.max(
            maxValue,
            (selector(UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$maxOf_u2dxTcfx_M`, var4.nextInt()))) as java.lang.Number)
               .doubleValue()
         )
      }

      return maxValue
   }
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public inline fun <V> UIntArray.zip(other: UIntArray, transform: (UInt, UInt) -> Any): List<Any> {
   val size: Int = Math.min(size, size)
   val list: ArrayList = ArrayList(size)

   repeat(size) { i ->
      list.add(
         transform(
            UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$zip_u2dL83TJbI`, i)),
            UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(other, i))
         )
      )
   }

   return list
}

@SinceKotlin(version = "1.3")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun ULongArray.lastOrNull(predicate: (ULong) -> Boolean): ULong? {
   var var2: Int = size + -1
   if (0 <= var2) {
      do {
         val element: Long = ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$lastOrNull_u2dMShoTSo`, var2--)
         if (predicate(ULong.box_impl/* $VF was: box-impl */(element)) as java.lang.Boolean) {
            return ULong.box_impl/* $VF was: box-impl */(element)
         }
      } while (0 <= var2)
   }

   return null
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline operator fun UByteArray.component2(): UByte {
   return UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$component2_u2dGBYM_sE`, 1)
}

@InlineOnly
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public inline operator fun ULongArray.component3(): ULong {
   return ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$component3_u2dQwZRm1k`, 2)
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public inline fun <K, V, M : MutableMap<in Any, MutableList<Any>>> UIntArray.groupByTo(
   destination: Any,
   keySelector: (UInt) -> Any,
   valueTransform: (UInt) -> Any
): Any {
   var var4: Int = 0

   for (var5 in size..var4) {
      val element: Int = UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$groupByTo_u2dJM6gNCM`, var4)
      val key: Any = keySelector(UInt.box_impl/* $VF was: box-impl */(element))
      val `value$iv`: Any = destination.get(key)
      val var10000: Any
      if (`value$iv` == null) {
         val var13: java.util.List = ArrayList()
         destination.put(key, var13)
         var10000 = var13
      } else {
         var10000 = `value$iv`
      }

      (var10000 as java.util.List).add(valueTransform(UInt.box_impl/* $VF was: box-impl */(element)))
   }

   return (M)destination
}

@SinceKotlin(version = "1.3")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun UShortArray.indexOfFirst(predicate: (UShort) -> Boolean): Int {
   val `$this$indexOfFirst$iv`: ShortArray = `$this$indexOfFirst_u2dxTcfx_M`
   var `index$iv`: Int = 0
   val var5: Int = `$this$indexOfFirst_u2dxTcfx_M`.length

   var var10000: Int
   while (true) {
      if (`index$iv` >= var5) {
         var10000 = -1
         break
      }

      if (predicate(UShort.box_impl/* $VF was: box-impl */(UShort.constructor_impl/* $VF was: constructor-impl */(`$this$indexOfFirst$iv`[`index$iv`]))) as java.lang.Boolean
         )
       {
         var10000 = `index$iv`
         break
      }

      `index$iv`++
   }

   return var10000
}

@InlineOnly
@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
public inline fun <R : Comparable<Any>> UIntArray.maxByOrNull(selector: (UInt) -> Any): UInt? {
   if (UIntArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$maxByOrNull_u2djgv0xPQ`)) {
      return null
   } else {
      var maxElem: Int = UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$maxByOrNull_u2djgv0xPQ`, 0)
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$maxByOrNull_u2djgv0xPQ`)
      if (lastIndex == 0) {
         return UInt.box_impl/* $VF was: box-impl */(maxElem)
      } else {
         var var9: java.lang.Comparable = selector(UInt.box_impl/* $VF was: box-impl */(maxElem)) as java.lang.Comparable
         val var10: IntIterator = IntRange(1, lastIndex).iterator()

         while (var10.hasNext()) {
            val e: Int = UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$maxByOrNull_u2djgv0xPQ`, var10.nextInt())
            val v: java.lang.Comparable = selector(UInt.box_impl/* $VF was: box-impl */(e)) as java.lang.Comparable
            if (var9.compareTo(v) < 0) {
               maxElem = e
               var9 = v
            }
         }

         return UInt.box_impl/* $VF was: box-impl */(maxElem)
      }
   }
}

@OverloadResolutionByLambdaReturnType
@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun <R> UShortArray.maxOfWith(comparator: Comparator<in Any>, selector: (UShort) -> Any): Any {
   if (UShortArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$maxOfWith_u2dl8EHGbQ`)) {
      throw NoSuchElementException()
   } else {
      var maxValue: Any = selector(UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$maxOfWith_u2dl8EHGbQ`, 0)))
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfWith_u2dl8EHGbQ`)).iterator()

      while (var4.hasNext()) {
         val var8: Any = selector(
            UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$maxOfWith_u2dl8EHGbQ`, var4.nextInt()))
         )
         if (comparator.compare(maxValue, var8) < 0) {
            maxValue = var8
         }
      }

      return (R)maxValue
   }
}

@SinceKotlin(version = "1.7")
@ExperimentalUnsignedTypes
@JvmName(name = "minOrThrow-U")
public fun UShortArray.min(): UShort {
   if (UShortArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$min_u2drL5Bavg`)) {
      throw NoSuchElementException()
   } else {
      var min: Short = UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$min_u2drL5Bavg`, 0)
      val var2: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$min_u2drL5Bavg`)).iterator()

      while (var2.hasNext()) {
         val var6: Short = UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$min_u2drL5Bavg`, var2.nextInt())
         if (Intrinsics.compare(min and 65535, var6 and 65535) > 0) {
            min = var6
         }
      }

      return min
   }
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun UByteArray.reverse() {
   ArraysKt.reverse(`$this$reverse_u2dGBYM_sE`)
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
public fun ULongArray.minWithOrNull(comparator: Comparator<in ULong>): ULong? {
   if (ULongArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$minWithOrNull_u2dzrEWJaI`)) {
      return null
   } else {
      var min: Long = ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$minWithOrNull_u2dzrEWJaI`, 0)
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minWithOrNull_u2dzrEWJaI`)).iterator()

      while (var4.hasNext()) {
         val var9: Long = ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$minWithOrNull_u2dzrEWJaI`, var4.nextInt())
         if (comparator.compare(ULong.box_impl/* $VF was: box-impl */(min), ULong.box_impl/* $VF was: box-impl */(var9)) > 0) {
            min = var9
         }
      }

      return ULong.box_impl/* $VF was: box-impl */(min)
   }
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun ULongArray.copyInto(destination: ULongArray, destinationOffset: Int = ..., startIndex: Int = ..., endIndex: Int = ...): ULongArray {
   ArraysKt.copyInto(`$this$copyInto_u2d_u2dB0_u2dL2c`, destination, destinationOffset, startIndex, endIndex)
   return destination
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
public inline fun UShortArray.onEachIndexed(action: (Int, UShort) -> Unit): UShortArray {
   val var5: ShortArray = `$this$onEachIndexed_u2dxzaTVY8`
   var var6: Int = 0
   var var7: Int = 0

   for (var8 in size..var7) {
      action(var6++, UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(var5, var7)))
   }

   return `$this$onEachIndexed_u2dxzaTVY8`
}

@SinceKotlin(version = "1.7")
@InlineOnly
@ExperimentalUnsignedTypes
@JvmName(name = "maxByOrThrow-U")
public inline fun <R : Comparable<Any>> ULongArray.maxBy(selector: (ULong) -> Any): ULong {
   if (ULongArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$maxBy_u2dMShoTSo`)) {
      throw NoSuchElementException()
   } else {
      var maxElem: Long = ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$maxBy_u2dMShoTSo`, 0)
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$maxBy_u2dMShoTSo`)
      if (lastIndex == 0) {
         return maxElem
      } else {
         var var11: java.lang.Comparable = selector(ULong.box_impl/* $VF was: box-impl */(maxElem)) as java.lang.Comparable
         val var12: IntIterator = IntRange(1, lastIndex).iterator()

         while (var12.hasNext()) {
            val e: Long = ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$maxBy_u2dMShoTSo`, var12.nextInt())
            val v: java.lang.Comparable = selector(ULong.box_impl/* $VF was: box-impl */(e)) as java.lang.Comparable
            if (var11.compareTo(v) < 0) {
               maxElem = e
               var11 = v
            }
         }

         return maxElem
      }
   }
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public fun ULongArray.takeLast(n: Int): List<ULong> {
   if (n < 0) {
      throw IllegalArgumentException(("Requested element count $n is less than zero.").toString())
   } else if (n == 0) {
      return CollectionsKt.emptyList()
   } else {
      val var5: Int = size
      if (n >= var5) {
         return CollectionsKt.toList(ULongArray.box_impl/* $VF was: box-impl */(`$this$takeLast_u2dr7IrZao`))
      } else if (n == 1) {
         return CollectionsKt.listOf(
            ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$takeLast_u2dr7IrZao`, var5 + -1))
         )
      } else {
         val list: ArrayList = ArrayList(n)

         for (index in var5 - n..var5) {
            list.add(ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$takeLast_u2dr7IrZao`, index)))
         }

         return list
      }
   }
}

@OverloadResolutionByLambdaReturnType
@InlineOnly
@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
public inline fun <R : Comparable<Any>> UIntArray.minOfOrNull(selector: (UInt) -> Any): Any? {
   if (UIntArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$minOfOrNull_u2djgv0xPQ`)) {
      return null
   } else {
      var minValue: java.lang.Comparable = selector(
         UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$minOfOrNull_u2djgv0xPQ`, 0))
      ) as java.lang.Comparable
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfOrNull_u2djgv0xPQ`)).iterator()

      while (var3.hasNext()) {
         val var7: java.lang.Comparable = selector(
            UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$minOfOrNull_u2djgv0xPQ`, var3.nextInt()))
         ) as java.lang.Comparable
         if (minValue.compareTo(var7) > 0) {
            minValue = var7
         }
      }

      return (R)minValue
   }
}

@InlineOnly
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public inline operator fun UIntArray.component2(): UInt {
   return UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$component2_u2d_u2dajY_u2d9A`, 1)
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun <R : Comparable<Any>> UShortArray.minByOrNull(selector: (UShort) -> Any): UShort? {
   if (UShortArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$minByOrNull_u2dxTcfx_M`)) {
      return null
   } else {
      var minElem: Short = UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$minByOrNull_u2dxTcfx_M`, 0)
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$minByOrNull_u2dxTcfx_M`)
      if (lastIndex == 0) {
         return UShort.box_impl/* $VF was: box-impl */(minElem)
      } else {
         var var9: java.lang.Comparable = selector(UShort.box_impl/* $VF was: box-impl */(minElem)) as java.lang.Comparable
         val var10: IntIterator = IntRange(1, lastIndex).iterator()

         while (var10.hasNext()) {
            val e: Short = UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$minByOrNull_u2dxTcfx_M`, var10.nextInt())
            val v: java.lang.Comparable = selector(UShort.box_impl/* $VF was: box-impl */(e)) as java.lang.Comparable
            if (var9.compareTo(v) > 0) {
               minElem = e
               var9 = v
            }
         }

         return UShort.box_impl/* $VF was: box-impl */(minElem)
      }
   }
}

@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun <R> UByteArray.runningFoldIndexed(initial: Any, operation: (Int, Any, UByte) -> Any): List<Any> {
   if (UByteArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$runningFoldIndexed_u2d3iWJZGE`)) {
      return (java.util.List<R>)CollectionsKt.listOf(initial)
   } else {
      val accumulator: ArrayList = ArrayList(size + 1)
      accumulator.add(initial)
      val result: ArrayList = accumulator
      var var7: Any = initial
      var var8: Int = 0

      for (var9 in size..var8) {
         var7 = operation(
            var8, var7, UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$runningFoldIndexed_u2d3iWJZGE`, var8))
         )
         result.add(var7)
      }

      return result
   }
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public final val lastIndex: Int
   public final inline get() {
      return ArraysKt.getLastIndex(`$this$lastIndex`)
   }


@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
@InlineOnly
@OverloadResolutionByLambdaReturnType
public inline fun UByteArray.minOf(selector: (UByte) -> Double): Double {
   if (UByteArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$minOf_u2dJOV_ifY`)) {
      throw NoSuchElementException()
   } else {
      var minValue: Double = (selector(UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$minOf_u2dJOV_ifY`, 0))) as java.lang.Number)
         .doubleValue()
         val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOf_u2dJOV_ifY`)).iterator()

      while (var4.hasNext()) {
         minValue = Math.min(
            minValue,
            (selector(UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$minOf_u2dJOV_ifY`, var4.nextInt()))) as java.lang.Number)
               .doubleValue()
         )
      }

      return minValue
   }
}

@ExperimentalUnsignedTypes
@OverloadResolutionByLambdaReturnType
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun <R> ULongArray.minOfWithOrNull(comparator: Comparator<in Any>, selector: (ULong) -> Any): Any? {
   if (ULongArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$minOfWithOrNull_u2d5NtCtWE`)) {
      return null
   } else {
      var minValue: Any = selector(
         ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$minOfWithOrNull_u2d5NtCtWE`, 0))
      )
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfWithOrNull_u2d5NtCtWE`)).iterator()

      while (var4.hasNext()) {
         val var8: Any = selector(
            ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$minOfWithOrNull_u2d5NtCtWE`, var4.nextInt()))
         )
         if (comparator.compare(minValue, var8) > 0) {
            minValue = var8
         }
      }

      return (R)minValue
   }
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
public fun UByteArray.shuffle() {
   UArraysKt.shuffle_oSF2wD8/* $VF was: shuffle-oSF2wD8 */(`$this$shuffle_u2dGBYM_sE`, Random.Default)
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun <V, M : MutableMap<in UInt, in Any>> UIntArray.associateWithTo(destination: Any, valueSelector: (UInt) -> Any): Any {
   var var3: Int = 0

   for (var4 in size..var3) {
      val element: Int = UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$associateWithTo_u2d4D70W2E`, var3)
      destination.put(UInt.box_impl/* $VF was: box-impl */(element), valueSelector(UInt.box_impl/* $VF was: box-impl */(element)))
   }

   return (M)destination
}

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun <R> UIntArray.minOfWithOrNull(comparator: Comparator<in Any>, selector: (UInt) -> Any): Any? {
   if (UIntArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$minOfWithOrNull_u2dmyNOsp4`)) {
      return null
   } else {
      var minValue: Any = selector(UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$minOfWithOrNull_u2dmyNOsp4`, 0)))
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfWithOrNull_u2dmyNOsp4`)).iterator()

      while (var4.hasNext()) {
         val var8: Any = selector(
            UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$minOfWithOrNull_u2dmyNOsp4`, var4.nextInt()))
         )
         if (comparator.compare(minValue, var8) > 0) {
            minValue = var8
         }
      }

      return (R)minValue
   }
}

@JvmName(name = "sumOfUInt")
@OverloadResolutionByLambdaReturnType
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.5")
public inline fun UByteArray.sumOf(selector: (UByte) -> UInt): UInt {
   var sum: Int = UInt.constructor_impl/* $VF was: constructor-impl */(0)
   var var3: Int = 0

   for (var4 in size..var3) {
      sum = UInt.constructor_impl/* $VF was: constructor-impl */(
         sum
            + (selector(UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$sumOf_u2dJOV_ifY`, var3))) as UInt)
               .unbox_impl/* $VF was: unbox-impl */()
      )
   }

   return sum
}

@InlineOnly
@ExperimentalUnsignedTypes
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
public inline fun <R : Comparable<Any>> UShortArray.maxOfOrNull(selector: (UShort) -> Any): Any? {
   if (UShortArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$maxOfOrNull_u2dxTcfx_M`)) {
      return null
   } else {
      var maxValue: java.lang.Comparable = selector(
         UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$maxOfOrNull_u2dxTcfx_M`, 0))
      ) as java.lang.Comparable
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfOrNull_u2dxTcfx_M`)).iterator()

      while (var3.hasNext()) {
         val var7: java.lang.Comparable = selector(
            UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$maxOfOrNull_u2dxTcfx_M`, var3.nextInt()))
         ) as java.lang.Comparable
         if (maxValue.compareTo(var7) < 0) {
            maxValue = var7
         }
      }

      return (R)maxValue
   }
}

@InlineOnly
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public inline fun UIntArray.reduceRight(operation: (UInt, UInt) -> UInt): UInt {
   var index: Int = ArraysKt.getLastIndex(`$this$reduceRight_u2dWyvcNBI`)
   if (index < 0) {
      throw UnsupportedOperationException("Empty array can't be reduced.")
   } else {
      var var6: Int = UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$reduceRight_u2dWyvcNBI`, index--)

      while (index >= 0) {
         var6 = (operation(
               UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$reduceRight_u2dWyvcNBI`, index--)),
               UInt.box_impl/* $VF was: box-impl */(var6)
            ) as UInt)
            .unbox_impl/* $VF was: unbox-impl */()
         }

      return var6
   }
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public fun UByteArray.sliceArray(indices: IntRange): UByteArray {
   return UByteArray.constructor_impl/* $VF was: constructor-impl */(ArraysKt.sliceArray((byte[])`$this$sliceArray_u2dc0bezYM`, indices))
}

@SinceKotlin(version = "1.4")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun UShortArray.reduceRightIndexedOrNull(operation: (Int, UShort, UShort) -> UShort): UShort? {
   var index: Int = ArraysKt.getLastIndex(`$this$reduceRightIndexedOrNull_u2daLgx1Fo`)
   if (index < 0) {
      return null
   } else {
      var var6: Short = UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$reduceRightIndexedOrNull_u2daLgx1Fo`, index--)

      while (index >= 0) {
         var6 = (operation(
               index,
               UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$reduceRightIndexedOrNull_u2daLgx1Fo`, index)),
               UShort.box_impl/* $VF was: box-impl */(var6)
            ) as UShort)
            .unbox_impl/* $VF was: unbox-impl */()
            index--
      }

      return UShort.box_impl/* $VF was: box-impl */(var6)
   }
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public fun UIntArray.sliceArray(indices: Collection<Int>): UIntArray {
   return UIntArray.constructor_impl/* $VF was: constructor-impl */(ArraysKt.sliceArray((int[])`$this$sliceArray_u2dCFIt9YE`, indices))
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun <R> UByteArray.foldIndexed(initial: Any, operation: (Int, Any, UByte) -> Any): Any {
   var index: Int = 0
   var accumulator: Any = initial
   var var5: Int = 0

   for (var6 in size..var5) {
      accumulator = operation(
         index++, accumulator, UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$foldIndexed_u2d3iWJZGE`, var5))
      )
   }

   return (R)accumulator
}

@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun ULongArray.runningReduce(operation: (ULong, ULong) -> ULong): List<ULong> {
   if (ULongArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$runningReduce_u2ds8dVfGU`)) {
      return CollectionsKt.emptyList()
   } else {
      var accumulator: Long = 0L
      accumulator = ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$runningReduce_u2ds8dVfGU`, 0)
      val index: ArrayList = ArrayList(size)
      index.add(ULong.box_impl/* $VF was: box-impl */(accumulator))
      val result: ArrayList = index
      var var8: Int = 1

      for (var9 in size..var8) {
         accumulator = (operation(
               ULong.box_impl/* $VF was: box-impl */(accumulator),
               ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$runningReduce_u2ds8dVfGU`, var8))
            ) as ULong)
            .unbox_impl/* $VF was: unbox-impl */()
            result.add(ULong.box_impl/* $VF was: box-impl */(accumulator))
      }

      return result
   }
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public fun UIntArray.getOrNull(index: Int): UInt? {
   return if (index >= 0 && index <= ArraysKt.getLastIndex(`$this$getOrNull_u2dqFRl0hI`))
      UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$getOrNull_u2dqFRl0hI`, index))
      else
      null
   }

@InlineOnly
@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
public inline fun <V> UIntArray.associateWith(valueSelector: (UInt) -> Any): Map<UInt, Any> {
   val result: LinkedHashMap = LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(size), 16))
   val var3: IntArray = `$this$associateWith_u2djgv0xPQ`
   var var4: Int = 0

   for (var5 in size..var4) {
      val var6: Int = UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(var3, var4)
      result.put(UInt.box_impl/* $VF was: box-impl */(var6), valueSelector(UInt.box_impl/* $VF was: box-impl */(var6)))
   }

   return result
}

@InlineOnly
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
public inline fun <R : Comparable<Any>> ULongArray.minOf(selector: (ULong) -> Any): Any {
   if (ULongArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$minOf_u2dMShoTSo`)) {
      throw NoSuchElementException()
   } else {
      var minValue: java.lang.Comparable = selector(
         ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$minOf_u2dMShoTSo`, 0))
      ) as java.lang.Comparable
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOf_u2dMShoTSo`)).iterator()

      while (var3.hasNext()) {
         val var7: java.lang.Comparable = selector(
            ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$minOf_u2dMShoTSo`, var3.nextInt()))
         ) as java.lang.Comparable
         if (minValue.compareTo(var7) > 0) {
            minValue = var7
         }
      }

      return (R)minValue
   }
}

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@InlineOnly
@JvmName(name = "sumOfInt")
@ExperimentalUnsignedTypes
public inline fun UShortArray.sumOf(selector: (UShort) -> Int): Int {
   var sum: Int = 0
   var var3: Int = 0

   for (var4 in size..var3) {
      sum += (selector(UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$sumOf_u2dxTcfx_M`, var3))) as java.lang.Number)
         .intValue()
      }

   return sum
}

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@JvmName(name = "sumOfInt")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun ULongArray.sumOf(selector: (ULong) -> Int): Int {
   var sum: Int = 0
   var var3: Int = 0

   for (var4 in size..var3) {
      sum += (selector(ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$sumOf_u2dMShoTSo`, var3))) as java.lang.Number)
         .intValue()
      }

   return sum
}

@InlineOnly
@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
public inline fun <R> ULongArray.runningFoldIndexed(initial: Any, operation: (Int, Any, ULong) -> Any): List<Any> {
   if (ULongArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$runningFoldIndexed_u2dmwnnOCs`)) {
      return (java.util.List<R>)CollectionsKt.listOf(initial)
   } else {
      val accumulator: ArrayList = ArrayList(size + 1)
      accumulator.add(initial)
      val result: ArrayList = accumulator
      var var7: Any = initial
      var var8: Int = 0

      for (var9 in size..var8) {
         var7 = operation(
            var8, var7, ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$runningFoldIndexed_u2dmwnnOCs`, var8))
         )
         result.add(var7)
      }

      return result
   }
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun ByteArray.asUByteArray(): UByteArray {
   return UByteArray.constructor_impl/* $VF was: constructor-impl */(`$this$asUByteArray`)
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public fun Array<out ULong>.toULongArray(): ULongArray {
   val var1: Int = `$this$toULongArray`.length
   var var2: Int = 0
   val var3: LongArray = LongArray(var1)

   while (var2 < var1) {
      var3[var2] = `$this$toULongArray`[var2].unbox_impl/* $VF was: unbox-impl */()
      var2++
   }

   return ULongArray.constructor_impl/* $VF was: constructor-impl */(var3)
}

@SinceKotlin(version = "1.4")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun UShortArray.runningReduceIndexed(operation: (Int, UShort, UShort) -> UShort): List<UShort> {
   if (UShortArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$runningReduceIndexed_u2daLgx1Fo`)) {
      return CollectionsKt.emptyList()
   } else {
      var var7: Short = UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$runningReduceIndexed_u2daLgx1Fo`, 0)
      val index: Int = (int)ArrayList(size)
      index.add(UShort.box_impl/* $VF was: box-impl */(var7))
      val result: Any = index
      var var8: Int = 1

      for (var9 in size..var8) {
         var7 = (operation(
               var8,
               UShort.box_impl/* $VF was: box-impl */(var7),
               UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$runningReduceIndexed_u2daLgx1Fo`, var8))
            ) as UShort)
            .unbox_impl/* $VF was: unbox-impl */()
            result.add(UShort.box_impl/* $VF was: box-impl */(var7))
      }

      return result as MutableList<UShort>
   }
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public fun UShortArray.withIndex(): Iterable<IndexedValue<UShort>> {
   return IndexingIterable<>(   // $VF: Compiled from _UArrays.kt
{
      return UShortArray.iterator_impl/* $VF was: iterator-impl */($this$withIndex_u2drL5Bavg)
   } as () -> MutableIterator<UShort>)
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public fun UByteArray.firstOrNull(): UByte? {
   return if (UByteArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$firstOrNull_u2dGBYM_sE`))
      null
      else
      UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$firstOrNull_u2dGBYM_sE`, 0))
   }

@InlineOnly
@OverloadResolutionByLambdaReturnType
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
public inline fun ULongArray.maxOfOrNull(selector: (ULong) -> Double): Double? {
   if (ULongArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$maxOfOrNull_u2dMShoTSo`)) {
      return null
   } else {
      var maxValue: Double = (selector(
            ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$maxOfOrNull_u2dMShoTSo`, 0))
         ) as java.lang.Number)
         .doubleValue()
         val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfOrNull_u2dMShoTSo`)).iterator()

      while (var4.hasNext()) {
         maxValue = Math.max(
            maxValue,
            (selector(ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$maxOfOrNull_u2dMShoTSo`, var4.nextInt()))) as java.lang.Number)
               .doubleValue()
         )
      }

      return maxValue
   }
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public inline fun <K, V> ULongArray.groupBy(keySelector: (ULong) -> Any, valueTransform: (ULong) -> Any): Map<Any, List<Any>> {
   val var3: LongArray = `$this$groupBy_u2d_u2d_j2Y_u2dQ`
   val var4: java.util.Map = LinkedHashMap()
   var var5: Int = 0

   for (var6 in size..var5) {
      val var7: Long = ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(var3, var5)
      val var9: Any = keySelector(ULong.box_impl/* $VF was: box-impl */(var7))
      var var10000: Any = var4.get(var9)
      if (var10000 == null) {
         val var11: java.util.List = ArrayList()
         var4.put(var9, var11)
         var10000 = var11
      }

      (var10000 as java.util.List).add(valueTransform(ULong.box_impl/* $VF was: box-impl */(var7)))
   }

   return var4
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun <K, M : MutableMap<in Any, MutableList<UInt>>> UIntArray.groupByTo(destination: Any, keySelector: (UInt) -> Any): Any {
   var var3: Int = 0

   for (var4 in size..var3) {
      val element: Int = UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$groupByTo_u2d4D70W2E`, var3)
      val key: Any = keySelector(UInt.box_impl/* $VF was: box-impl */(element))
      val `value$iv`: Any = destination.get(key)
      val var10000: Any
      if (`value$iv` == null) {
         val var12: java.util.List = ArrayList()
         destination.put(key, var12)
         var10000 = var12
      } else {
         var10000 = `value$iv`
      }

      (var10000 as java.util.List).add(UInt.box_impl/* $VF was: box-impl */(element))
   }

   return (M)destination
}

@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
public fun UByteArray?.contentHashCode(): Int {
   var var10000: ByteArray = `$this$contentHashCode_u2d2csIQuQ`
   if (`$this$contentHashCode_u2d2csIQuQ` == null) {
      var10000 = null
   }

   return Arrays.hashCode(var10000)
}

@SinceKotlin(version = "1.3")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun <V> UByteArray.zip(other: UByteArray, transform: (UByte, UByte) -> Any): List<Any> {
   val size: Int = Math.min(size, size)
   val list: ArrayList = ArrayList(size)

   repeat(size) { i ->
      list.add(
         transform(
            UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$zip_u2dJAKpvQM`, i)),
            UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(other, i))
         )
      )
   }

   return list
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun <V> ULongArray.zip(other: ULongArray, transform: (ULong, ULong) -> Any): List<Any> {
   val size: Int = Math.min(size, size)
   val list: ArrayList = ArrayList(size)

   repeat(size) { i ->
      list.add(
         transform(
            ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$zip_u2dPabeH_u2dQ`, i)),
            ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(other, i))
         )
      )
   }

   return list
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public infix fun ULongArray.zip(other: ULongArray): List<Pair<ULong, ULong>> {
   val var2: LongArray = `$this$zip_u2dus8wMrg`
   val var3: Int = Math.min(size, size)
   val var4: ArrayList = ArrayList(var3)

   repeat(var3) { var5 ->
      var4.add(
         ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(var2, var5)) to ULong.box_impl/* $VF was: box-impl */(
            ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(other, var5)
         )
      )
   }

   return var4
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public final val indices: IntRange
   public final inline get() {
      return ArraysKt.getIndices(`$this$indices`)
   }


@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public inline fun UByteArray.lastOrNull(predicate: (UByte) -> Boolean): UByte? {
   var var2: Int = size + -1
   if (0 <= var2) {
      do {
         val element: Byte = UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$lastOrNull_u2dJOV_ifY`, var2--)
         if (predicate(UByte.box_impl/* $VF was: box-impl */(element)) as java.lang.Boolean) {
            return UByte.box_impl/* $VF was: box-impl */(element)
         }
      } while (0 <= var2)
   }

   return null
}

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
@InlineOnly
@JvmName(name = "sumOfLong")
public inline fun UShortArray.sumOf(selector: (UShort) -> Long): Long {
   var sum: Long = 0L
   var var4: Int = 0

   for (var5 in size..var4) {
      sum += (selector(UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$sumOf_u2dxTcfx_M`, var4))) as java.lang.Number)
         .longValue()
      }

   return sum
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun UIntArray.single(predicate: (UInt) -> Boolean): UInt {
   var single: UInt = null
   var found: Boolean = false
   var var4: Int = 0

   for (var5 in size..var4) {
      val element: Int = UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$single_u2djgv0xPQ`, var4)
      if (predicate(UInt.box_impl/* $VF was: box-impl */(element)) as java.lang.Boolean) {
         if (found) {
            throw IllegalArgumentException("Array contains more than one matching element.")
         }

         single = UInt.box_impl/* $VF was: box-impl */(element)
         found = true
      }
   }

   if (!found) {
      throw NoSuchElementException("Array contains no element matching the predicate.")
   } else {
      return single.unbox_impl/* $VF was: unbox-impl */()
   }
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public fun ULongArray.slice(indices: Iterable<Int>): List<ULong> {
   val size: Int = CollectionsKt.collectionSizeOrDefault(indices, 10)
   if (size == 0) {
      return CollectionsKt.emptyList()
   } else {
      val list: ArrayList = ArrayList(size)
      val var4: java.util.Iterator = indices.iterator()

      while (var4.hasNext()) {
         list.add(
            ULong.box_impl/* $VF was: box-impl */(
               ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$slice_u2dF7u83W8`, (var4.next() as java.lang.Number).intValue())
            )
         )
      }

      return list
   }
}

@SinceKotlin(version = "1.3")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun UIntArray.any(): Boolean {
   return ArraysKt.any(`$this$any_u2d_u2dajY_u2d9A`)
}

@InlineOnly
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
public inline fun ULongArray.reduceRightOrNull(operation: (ULong, ULong) -> ULong): ULong? {
   var index: Int = ArraysKt.getLastIndex(`$this$reduceRightOrNull_u2ds8dVfGU`)
   if (index < 0) {
      return null
   } else {
      var var6: Long = ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$reduceRightOrNull_u2ds8dVfGU`, index--)

      while (index >= 0) {
         var6 = (operation(
               ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$reduceRightOrNull_u2ds8dVfGU`, index--)),
               ULong.box_impl/* $VF was: box-impl */(var6)
            ) as ULong)
            .unbox_impl/* $VF was: unbox-impl */()
         }

      return ULong.box_impl/* $VF was: box-impl */(var6)
   }
}

@OverloadResolutionByLambdaReturnType
@InlineOnly
@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
public inline fun <R> UIntArray.minOfWith(comparator: Comparator<in Any>, selector: (UInt) -> Any): Any {
   if (UIntArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$minOfWith_u2dmyNOsp4`)) {
      throw NoSuchElementException()
   } else {
      var minValue: Any = selector(UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$minOfWith_u2dmyNOsp4`, 0)))
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfWith_u2dmyNOsp4`)).iterator()

      while (var4.hasNext()) {
         val var8: Any = selector(
            UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$minOfWith_u2dmyNOsp4`, var4.nextInt()))
         )
         if (comparator.compare(minValue, var8) > 0) {
            minValue = var8
         }
      }

      return (R)minValue
   }
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun UByteArray.takeLastWhile(predicate: (UByte) -> Boolean): List<UByte> {
   for (index in ArraysKt.getLastIndex(`$this$takeLastWhile_u2dJOV_ifY`) downTo 0) {
      if (!predicate(UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$takeLastWhile_u2dJOV_ifY`, index))) as java.lang.Boolean
         )
       {
         return UArraysKt.drop_PpDY95g/* $VF was: drop-PpDY95g */(`$this$takeLastWhile_u2dJOV_ifY`, index + 1)
      }
   }

   return CollectionsKt.toList(UByteArray.box_impl/* $VF was: box-impl */(`$this$takeLastWhile_u2dJOV_ifY`))
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun UByteArray.runningReduceIndexed(operation: (Int, UByte, UByte) -> UByte): List<UByte> {
   if (UByteArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$runningReduceIndexed_u2dEOyYB1Y`)) {
      return CollectionsKt.emptyList()
   } else {
      var var7: Byte = UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$runningReduceIndexed_u2dEOyYB1Y`, 0)
      val index: Int = (int)ArrayList(size)
      index.add(UByte.box_impl/* $VF was: box-impl */(var7))
      val result: Any = index
      var var8: Int = 1

      for (var9 in size..var8) {
         var7 = (operation(
               var8,
               UByte.box_impl/* $VF was: box-impl */(var7),
               UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$runningReduceIndexed_u2dEOyYB1Y`, var8))
            ) as UByte)
            .unbox_impl/* $VF was: unbox-impl */()
            result.add(UByte.box_impl/* $VF was: box-impl */(var7))
      }

      return result as MutableList<UByte>
   }
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public fun ULongArray.sortDescending() {
   if (size > 1) {
      UArraysKt.sort_QwZRm1k/* $VF was: sort-QwZRm1k */(`$this$sortDescending_u2dQwZRm1k`)
      ArraysKt.reverse(`$this$sortDescending_u2dQwZRm1k`)
   }
}

@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public fun ULongArray.randomOrNull(random: Random): ULong? {
   return if (ULongArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$randomOrNull_u2dJzugnMA`))
      null
      else
      ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$randomOrNull_u2dJzugnMA`, random.nextInt(size)))
   }

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public fun UByteArray.slice(indices: IntRange): List<UByte> {
   return if (indices.isEmpty())
      CollectionsKt.emptyList()
      else
      UArraysKt.asList_GBYM_sE/* $VF was: asList-GBYM_sE */(
         UByteArray.constructor_impl/* $VF was: constructor-impl */(
            ArraysKt.copyOfRange((byte[])`$this$slice_u2dc0bezYM`, indices.start, indices.endInclusive + 1)
         )
      )
   }

@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun <R> UByteArray.runningFold(initial: Any, operation: (Any, UByte) -> Any): List<Any> {
   if (UByteArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$runningFold_u2dyXmHNn8`)) {
      return (java.util.List<R>)CollectionsKt.listOf(initial)
   } else {
      val accumulator: ArrayList = ArrayList(size + 1)
      accumulator.add(initial)
      val result: ArrayList = accumulator
      var var8: Any = initial
      var var9: Int = 0

      for (var10 in size..var9) {
         var8 = operation(var8, UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$runningFold_u2dyXmHNn8`, var9)))
         result.add(var8)
      }

      return result
   }
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun UShortArray.elementAtOrNull(index: Int): UShort? {
   return UArraysKt.getOrNull_nggk6HY/* $VF was: getOrNull-nggk6HY */(`$this$elementAtOrNull_u2dnggk6HY`, index)
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public infix fun <R> UByteArray.zip(other: Iterable<Any>): List<Pair<UByte, Any>> {
   val var2: ByteArray = `$this$zip_u2dJQknh5Q`
   val var3: Int = size
   val var4: ArrayList = ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(other, 10), var3))
   var var5: Int = 0

   for (var7 in other) {
      if (var5 >= var3) {
         break
      }

      var4.add(UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(var2, var5++)) to var7)
   }

   return var4
}

@InlineOnly
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public inline fun ULongArray.filter(predicate: (ULong) -> Boolean): List<ULong> {
   val var2: LongArray = `$this$filter_u2dMShoTSo`
   val var3: java.util.Collection = ArrayList()
   var var4: Int = 0

   for (var5 in size..var4) {
      val var6: Long = ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(var2, var4)
      if (predicate(ULong.box_impl/* $VF was: box-impl */(var6)) as java.lang.Boolean) {
         var3.add(ULong.box_impl/* $VF was: box-impl */(var6))
      }
   }

   return var3 as MutableList<ULong>
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public fun UIntArray.fill(element: UInt, fromIndex: Int = ..., toIndex: Int = ...) {
   ArraysKt.fill((int[])`$this$fill_u2d2fe2U9s`, (int)element, fromIndex, toIndex)
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun UShortArray.first(predicate: (UShort) -> Boolean): UShort {
   var var2: Int = 0

   for (var3 in size..var2) {
      val element: Short = UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$first_u2dxTcfx_M`, var2)
      if (predicate(UShort.box_impl/* $VF was: box-impl */(element)) as java.lang.Boolean) {
         return element
      }
   }

   throw NoSuchElementException("Array contains no element matching the predicate.")
}

@ExperimentalUnsignedTypes
@JvmName(name = "maxWithOrThrow-U")
@SinceKotlin(version = "1.7")
public fun ULongArray.maxWith(comparator: Comparator<in ULong>): ULong {
   if (ULongArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$maxWith_u2dzrEWJaI`)) {
      throw NoSuchElementException()
   } else {
      var max: Long = ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$maxWith_u2dzrEWJaI`, 0)
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxWith_u2dzrEWJaI`)).iterator()

      while (var4.hasNext()) {
         val var9: Long = ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$maxWith_u2dzrEWJaI`, var4.nextInt())
         if (comparator.compare(ULong.box_impl/* $VF was: box-impl */(max), ULong.box_impl/* $VF was: box-impl */(var9)) < 0) {
            max = var9
         }
      }

      return max
   }
}

@InlineOnly
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public inline fun <K> ULongArray.groupBy(keySelector: (ULong) -> Any): Map<Any, List<ULong>> {
   val var2: LongArray = `$this$groupBy_u2dMShoTSo`
   val var3: java.util.Map = LinkedHashMap()
   var var4: Int = 0

   for (var5 in size..var4) {
      val var6: Long = ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(var2, var4)
      val var8: Any = keySelector(ULong.box_impl/* $VF was: box-impl */(var6))
      var var10000: Any = var3.get(var8)
      if (var10000 == null) {
         val var10: java.util.List = ArrayList()
         var3.put(var8, var10)
         var10000 = var10
      }

      (var10000 as java.util.List).add(ULong.box_impl/* $VF was: box-impl */(var6))
   }

   return var3
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public inline fun UIntArray.any(predicate: (UInt) -> Boolean): Boolean {
   var var2: Int = 0

   for (var3 in size..var2) {
      if (predicate(UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$any_u2djgv0xPQ`, var2))) as java.lang.Boolean) {
         return true
      }
   }

   return false
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public fun UByteArray.drop(n: Int): List<UByte> {
   if (n < 0) {
      throw IllegalArgumentException(("Requested element count $n is less than zero.").toString())
   } else {
      return UArraysKt.takeLast_PpDY95g/* $VF was: takeLast-PpDY95g */(`$this$drop_u2dPpDY95g`, RangesKt.coerceAtLeast(size - n, 0))
   }
}

@ExperimentalUnsignedTypes
@JvmName(name = "maxOrThrow-U")
@SinceKotlin(version = "1.7")
public fun ULongArray.max(): ULong {
   if (ULongArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$max_u2dQwZRm1k`)) {
      throw NoSuchElementException()
   } else {
      var max: Long = ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$max_u2dQwZRm1k`, 0)
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$max_u2dQwZRm1k`)).iterator()

      while (var3.hasNext()) {
         val var8: Long = ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$max_u2dQwZRm1k`, var3.nextInt())
         if (java.lang.Long.compareUnsigned(max, var8) < 0) {
            max = var8
         }
      }

      return max
   }
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun UIntArray.onEachIndexed(action: (Int, UInt) -> Unit): UIntArray {
   val var5: IntArray = `$this$onEachIndexed_u2dWyvcNBI`
   var var6: Int = 0
   var var7: Int = 0

   for (var8 in size..var7) {
      action(var6++, UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(var5, var7)))
   }

   return `$this$onEachIndexed_u2dWyvcNBI`
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
@InlineOnly
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public inline fun <R> UIntArray.scanIndexed(initial: Any, operation: (Int, Any, UInt) -> Any): List<Any> {
   val var3: IntArray = `$this$scanIndexed_u2dyVwIW0Q`
   val var10000: java.util.List
   if (UIntArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$scanIndexed_u2dyVwIW0Q`)) {
      var10000 = CollectionsKt.listOf(initial)
   } else {
      val var4: ArrayList = ArrayList(size + 1)
      var4.add(initial)
      val var6: ArrayList = var4
      var var8: Any = initial
      var var9: Int = 0

      for (var7 in size..var9) {
         var8 = operation(var9, var8, UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(var3, var9)))
         var6.add(var8)
      }

      var10000 = var6
   }

   return var10000
}

@InlineOnly
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public inline operator fun ULongArray.component2(): ULong {
   return ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$component2_u2dQwZRm1k`, 1)
}

@SinceKotlin(version = "1.3")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun <R> UByteArray.flatMap(transform: (UByte) -> Iterable<Any>): List<Any> {
   val var2: ByteArray = `$this$flatMap_u2dJOV_ifY`
   val var3: java.util.Collection = ArrayList()
   var var4: Int = 0

   for (var5 in size..var4) {
      CollectionsKt.addAll(
         var3, transform(UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(var2, var4))) as java.lang.Iterable
      )
   }

   return var3 as MutableList<R>
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun UIntArray.randomOrNull(): UInt? {
   return UArraysKt.randomOrNull_2D5oskM/* $VF was: randomOrNull-2D5oskM */(`$this$randomOrNull_u2d_u2dajY_u2d9A`, Random.Default)
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun <R> UIntArray.foldIndexed(initial: Any, operation: (Int, Any, UInt) -> Any): Any {
   var index: Int = 0
   var accumulator: Any = initial
   var var5: Int = 0

   for (var6 in size..var5) {
      accumulator = operation(
         index++, accumulator, UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$foldIndexed_u2dyVwIW0Q`, var5))
      )
   }

   return (R)accumulator
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public inline fun UIntArray.indexOfLast(predicate: (UInt) -> Boolean): Int {
   val `$this$indexOfLast$iv`: IntArray = `$this$indexOfLast_u2djgv0xPQ`
   var var4: Int = `$this$indexOfLast_u2djgv0xPQ`.length + -1
   if (0 <= `$this$indexOfLast_u2djgv0xPQ`.length + -1) {
      do {
         val `index$iv`: Int = var4--
         if (predicate(UInt.box_impl/* $VF was: box-impl */(UInt.constructor_impl/* $VF was: constructor-impl */(`$this$indexOfLast$iv`[`index$iv`]))) as java.lang.Boolean
            )
          {
            return `index$iv`
         }
      } while (0 <= var4)
   }

   return -1
}

@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
@OverloadResolutionByLambdaReturnType
@InlineOnly
public inline fun UIntArray.maxOfOrNull(selector: (UInt) -> Double): Double? {
   if (UIntArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$maxOfOrNull_u2djgv0xPQ`)) {
      return null
   } else {
      var maxValue: Double = (selector(UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$maxOfOrNull_u2djgv0xPQ`, 0))) as java.lang.Number)
         .doubleValue()
         val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfOrNull_u2djgv0xPQ`)).iterator()

      while (var4.hasNext()) {
         maxValue = Math.max(
            maxValue,
            (selector(UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$maxOfOrNull_u2djgv0xPQ`, var4.nextInt()))) as java.lang.Number)
               .doubleValue()
         )
      }

      return maxValue
   }
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun UIntArray.reduceIndexed(operation: (Int, UInt, UInt) -> UInt): UInt {
   if (UIntArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$reduceIndexed_u2dD40WMg8`)) {
      throw UnsupportedOperationException("Empty array can't be reduced.")
   } else {
      var accumulator: Int = UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$reduceIndexed_u2dD40WMg8`, 0)
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$reduceIndexed_u2dD40WMg8`)).iterator()

      while (var3.hasNext()) {
         val var6: Int = var3.nextInt()
         accumulator = (operation(
               var6,
               UInt.box_impl/* $VF was: box-impl */(accumulator),
               UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$reduceIndexed_u2dD40WMg8`, var6))
            ) as UInt)
            .unbox_impl/* $VF was: unbox-impl */()
         }

      return accumulator
   }
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public fun Array<out UByte>.toUByteArray(): UByteArray {
   val var1: Int = `$this$toUByteArray`.length
   var var2: Int = 0
   val var3: ByteArray = ByteArray(var1)

   while (var2 < var1) {
      var3[var2] = `$this$toUByteArray`[var2].unbox_impl/* $VF was: unbox-impl */()
      var2++
   }

   return UByteArray.constructor_impl/* $VF was: constructor-impl */(var3)
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun <R> UIntArray.map(transform: (UInt) -> Any): List<Any> {
   val var2: IntArray = `$this$map_u2djgv0xPQ`
   val var3: java.util.Collection = ArrayList(size)
   var var4: Int = 0

   for (var5 in size..var4) {
      var3.add(transform(UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(var2, var4))))
   }

   return var3 as MutableList<R>
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public fun ULongArray.sort() {
   if (size > 1) {
      UArraySortingKt.sortArray__nroSd4/* $VF was: sortArray--nroSd4 */(`$this$sort_u2dQwZRm1k`, 0, size)
   }
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public fun UShortArray.lastOrNull(): UShort? {
   return if (UShortArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$lastOrNull_u2drL5Bavg`))
      null
      else
      UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$lastOrNull_u2drL5Bavg`, size - 1))
   }

@SinceKotlin(version = "1.4")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun <R : Comparable<Any>> UByteArray.maxByOrNull(selector: (UByte) -> Any): UByte? {
   if (UByteArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$maxByOrNull_u2dJOV_ifY`)) {
      return null
   } else {
      var maxElem: Byte = UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$maxByOrNull_u2dJOV_ifY`, 0)
      val lastIndex: Int = ArraysKt.getLastIndex(`$this$maxByOrNull_u2dJOV_ifY`)
      if (lastIndex == 0) {
         return UByte.box_impl/* $VF was: box-impl */(maxElem)
      } else {
         var var9: java.lang.Comparable = selector(UByte.box_impl/* $VF was: box-impl */(maxElem)) as java.lang.Comparable
         val var10: IntIterator = IntRange(1, lastIndex).iterator()

         while (var10.hasNext()) {
            val e: Byte = UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$maxByOrNull_u2dJOV_ifY`, var10.nextInt())
            val v: java.lang.Comparable = selector(UByte.box_impl/* $VF was: box-impl */(e)) as java.lang.Comparable
            if (var9.compareTo(v) < 0) {
               maxElem = e
               var9 = v
            }
         }

         return UByte.box_impl/* $VF was: box-impl */(maxElem)
      }
   }
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun ULongArray.elementAtOrElse(index: Int, defaultValue: (Int) -> ULong): ULong {
   return if (index >= 0 && index <= ArraysKt.getLastIndex(`$this$elementAtOrElse_u2dXw8i6dc`))
      ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$elementAtOrElse_u2dXw8i6dc`, index)
      else
      (defaultValue(index) as ULong).unbox_impl/* $VF was: unbox-impl */()
   }

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
public fun UShortArray?.contentToString(): String {
   if (`$this$contentToString_u2dd_u2d6D3K8` != null) {
      val var10000: java.lang.String = CollectionsKt.joinToString$default(
         UShortArray.box_impl/* $VF was: box-impl */(`$this$contentToString_u2dd_u2d6D3K8`), ", ", "[", "]", 0, null, null, 56, null
      )
      if (var10000 != null) {
         return var10000
      }
   }

   return "null"
}

@InlineOnly
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public inline fun UIntArray.lastIndexOf(element: UInt): Int {
   return ArraysKt.lastIndexOf(`$this$lastIndexOf_u2duWY9BYg`, element)
}

@DeprecatedSinceKotlin(warningSince = "1.5")
@Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = []))
@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun UByteArray.sumByDouble(selector: (UByte) -> Double): Double {
   var sum: Double = 0.0
   var var4: Int = 0

   for (var5 in size..var4) {
      sum += (selector(UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$sumByDouble_u2dJOV_ifY`, var4))) as java.lang.Number)
         .doubleValue()
      }

   return sum
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public fun ULongArray.firstOrNull(): ULong? {
   return if (ULongArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$firstOrNull_u2dQwZRm1k`))
      null
      else
      ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$firstOrNull_u2dQwZRm1k`, 0))
   }

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public fun ULongArray.singleOrNull(): ULong? {
   return if (size == 1) ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$singleOrNull_u2dQwZRm1k`, 0)) else null
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun UShortArray.any(predicate: (UShort) -> Boolean): Boolean {
   var var2: Int = 0

   for (var3 in size..var2) {
      if (predicate(UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$any_u2dxTcfx_M`, var2))) as java.lang.Boolean
         )
       {
         return true
      }
   }

   return false
}

@SinceKotlin(version = "1.3")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun <C : MutableCollection<in UShort>> UShortArray.filterTo(destination: Any, predicate: (UShort) -> Boolean): Any {
   var var3: Int = 0

   for (var4 in size..var3) {
      val element: Short = UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$filterTo_u2doEOeDjA`, var3)
      if (predicate(UShort.box_impl/* $VF was: box-impl */(element)) as java.lang.Boolean) {
         destination.add(UShort.box_impl/* $VF was: box-impl */(element))
      }
   }

   return (C)destination
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun <R> UByteArray.scanIndexed(initial: Any, operation: (Int, Any, UByte) -> Any): List<Any> {
   val var3: ByteArray = `$this$scanIndexed_u2d3iWJZGE`
   val var10000: java.util.List
   if (UByteArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$scanIndexed_u2d3iWJZGE`)) {
      var10000 = CollectionsKt.listOf(initial)
   } else {
      val var4: ArrayList = ArrayList(size + 1)
      var4.add(initial)
      val var6: ArrayList = var4
      var var8: Any = initial
      var var9: Int = 0

      for (var7 in size..var9) {
         var8 = operation(var9, var8, UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(var3, var9)))
         var6.add(var8)
      }

      var10000 = var6
   }

   return var10000
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun <R, C : MutableCollection<in Any>> UShortArray.mapIndexedTo(destination: Any, transform: (Int, UShort) -> Any): Any {
   var index: Int = 0
   var var4: Int = 0

   for (var5 in size..var4) {
      destination.add(
         transform(index++, UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$mapIndexedTo_u2dQqktQ3k`, var4)))
      )
   }

   return (C)destination
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public fun UShortArray.reversed(): List<UShort> {
   if (UShortArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$reversed_u2drL5Bavg`)) {
      return CollectionsKt.emptyList()
   } else {
      val list: java.util.List = CollectionsKt.toMutableList(UShortArray.box_impl/* $VF was: box-impl */(`$this$reversed_u2drL5Bavg`))
      CollectionsKt.reverse(list)
      return list
   }
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
public fun UIntArray.sort(fromIndex: Int = ..., toIndex: Int = ...) {
   AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(fromIndex, toIndex, size)
   UArraySortingKt.sortArray_oBK06Vg/* $VF was: sortArray-oBK06Vg */(`$this$sort_u2doBK06Vg`, fromIndex, toIndex)
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun ULongArray.indexOfFirst(predicate: (ULong) -> Boolean): Int {
   val `$this$indexOfFirst$iv`: LongArray = `$this$indexOfFirst_u2dMShoTSo`
   var `index$iv`: Int = 0
   val var5: Int = `$this$indexOfFirst_u2dMShoTSo`.length

   var var10000: Int
   while (true) {
      if (`index$iv` >= var5) {
         var10000 = -1
         break
      }

      if (predicate(ULong.box_impl/* $VF was: box-impl */(ULong.constructor_impl/* $VF was: constructor-impl */(`$this$indexOfFirst$iv`[`index$iv`]))) as java.lang.Boolean
         )
       {
         var10000 = `index$iv`
         break
      }

      `index$iv`++
   }

   return var10000
}

@InlineOnly
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public inline fun <R, C : MutableCollection<in Any>> ULongArray.flatMapTo(destination: Any, transform: (ULong) -> Iterable<Any>): Any {
   var var3: Int = 0

   for (var4 in size..var3) {
      CollectionsKt.addAll(
         destination,
         transform(ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$flatMapTo_u2dHqK1JgA`, var3))) as java.lang.Iterable
      )
   }

   return (C)destination
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public infix fun UIntArray.zip(other: UIntArray): List<Pair<UInt, UInt>> {
   val var2: IntArray = `$this$zip_u2dctEhBpI`
   val var3: Int = Math.min(size, size)
   val var4: ArrayList = ArrayList(var3)

   repeat(var3) { var5 ->
      var4.add(
         UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(var2, var5)) to UInt.box_impl/* $VF was: box-impl */(
            UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(other, var5)
         )
      )
   }

   return var4
}

@InlineOnly
@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@ExperimentalUnsignedTypes
public inline fun <R> ULongArray.scanIndexed(initial: Any, operation: (Int, Any, ULong) -> Any): List<Any> {
   val var3: LongArray = `$this$scanIndexed_u2dmwnnOCs`
   val var10000: java.util.List
   if (ULongArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$scanIndexed_u2dmwnnOCs`)) {
      var10000 = CollectionsKt.listOf(initial)
   } else {
      val var4: ArrayList = ArrayList(size + 1)
      var4.add(initial)
      val var6: ArrayList = var4
      var var8: Any = initial
      var var9: Int = 0

      for (var7 in size..var9) {
         var8 = operation(var9, var8, ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(var3, var9)))
         var6.add(var8)
      }

      var10000 = var6
   }

   return var10000
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public fun UByteArray.sortedArrayDescending(): UByteArray {
   if (UByteArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$sortedArrayDescending_u2dGBYM_sE`)) {
      return `$this$sortedArrayDescending_u2dGBYM_sE`
   } else {
      val var10000: ByteArray = Arrays.copyOf(`$this$sortedArrayDescending_u2dGBYM_sE`, `$this$sortedArrayDescending_u2dGBYM_sE`.length)
      val var1: ByteArray = UByteArray.constructor_impl/* $VF was: constructor-impl */(var10000)
      UArraysKt.sortDescending_GBYM_sE/* $VF was: sortDescending-GBYM_sE */(var1)
      return var1
   }
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
public fun ULongArray.shuffle(random: Random) {
   for (i in ArraysKt.getLastIndex(`$this$shuffle_u2dJzugnMA`) downTo 1) {
      val var6: Int = random.nextInt(i + 1)
      val var7: Long = ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$shuffle_u2dJzugnMA`, i)
      ULongArray.set_k8EXiF4/* $VF was: set-k8EXiF4 */(
         `$this$shuffle_u2dJzugnMA`, i, ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$shuffle_u2dJzugnMA`, var6)
      )
      ULongArray.set_k8EXiF4/* $VF was: set-k8EXiF4 */(`$this$shuffle_u2dJzugnMA`, var6, var7)
   }
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public fun UIntArray.sortedArrayDescending(): UIntArray {
   if (UIntArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$sortedArrayDescending_u2d_u2dajY_u2d9A`)) {
      return `$this$sortedArrayDescending_u2d_u2dajY_u2d9A`
   } else {
      val var10000: IntArray = Arrays.copyOf(`$this$sortedArrayDescending_u2d_u2dajY_u2d9A`, `$this$sortedArrayDescending_u2d_u2dajY_u2d9A`.length)
      val var1: IntArray = UIntArray.constructor_impl/* $VF was: constructor-impl */(var10000)
      UArraysKt.sortDescending__ajY_9A/* $VF was: sortDescending--ajY-9A */(var1)
      return var1
   }
}

@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
public fun UIntArray.maxWithOrNull(comparator: Comparator<in UInt>): UInt? {
   if (UIntArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$maxWithOrNull_u2dYmdZ_VM`)) {
      return null
   } else {
      var max: Int = UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$maxWithOrNull_u2dYmdZ_VM`, 0)
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxWithOrNull_u2dYmdZ_VM`)).iterator()

      while (var3.hasNext()) {
         val var7: Int = UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$maxWithOrNull_u2dYmdZ_VM`, var3.nextInt())
         if (comparator.compare(UInt.box_impl/* $VF was: box-impl */(max), UInt.box_impl/* $VF was: box-impl */(var7)) < 0) {
            max = var7
         }
      }

      return UInt.box_impl/* $VF was: box-impl */(max)
   }
}

@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
@InlineOnly
@OverloadResolutionByLambdaReturnType
public inline fun <R> UShortArray.minOfWith(comparator: Comparator<in Any>, selector: (UShort) -> Any): Any {
   if (UShortArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$minOfWith_u2dl8EHGbQ`)) {
      throw NoSuchElementException()
   } else {
      var minValue: Any = selector(UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$minOfWith_u2dl8EHGbQ`, 0)))
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfWith_u2dl8EHGbQ`)).iterator()

      while (var4.hasNext()) {
         val var8: Any = selector(
            UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$minOfWith_u2dl8EHGbQ`, var4.nextInt()))
         )
         if (comparator.compare(minValue, var8) > 0) {
            minValue = var8
         }
      }

      return (R)minValue
   }
}

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.5")
@JvmName(name = "sumOfULong")
@InlineOnly
@ExperimentalUnsignedTypes
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
public inline fun UIntArray.sumOf(selector: (UInt) -> ULong): ULong {
   var sum: Long = ULong.constructor_impl/* $VF was: constructor-impl */(0L)
   var var4: Int = 0

   for (var5 in size..var4) {
      sum = ULong.constructor_impl/* $VF was: constructor-impl */(
         sum
            + (selector(UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$sumOf_u2djgv0xPQ`, var4))) as ULong)
               .unbox_impl/* $VF was: unbox-impl */()
      )
   }

   return sum
}

@ExperimentalUnsignedTypes
@OverloadResolutionByLambdaReturnType
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun <R> UByteArray.maxOfWithOrNull(comparator: Comparator<in Any>, selector: (UByte) -> Any): Any? {
   if (UByteArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$maxOfWithOrNull_u2dLTi4i_s`)) {
      return null
   } else {
      var maxValue: Any = selector(
         UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$maxOfWithOrNull_u2dLTi4i_s`, 0))
      )
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfWithOrNull_u2dLTi4i_s`)).iterator()

      while (var4.hasNext()) {
         val var8: Any = selector(
            UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$maxOfWithOrNull_u2dLTi4i_s`, var4.nextInt()))
         )
         if (comparator.compare(maxValue, var8) < 0) {
            maxValue = var8
         }
      }

      return (R)maxValue
   }
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public fun Array<out UInt>.toUIntArray(): UIntArray {
   val var1: Int = `$this$toUIntArray`.length
   var var2: Int = 0
   val var3: IntArray = IntArray(var1)

   while (var2 < var1) {
      var3[var2] = `$this$toUIntArray`[var2].unbox_impl/* $VF was: unbox-impl */()
      var2++
   }

   return UIntArray.constructor_impl/* $VF was: constructor-impl */(var3)
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun ULongArray.last(predicate: (ULong) -> Boolean): ULong {
   var var2: Int = size + -1
   if (0 <= var2) {
      do {
         val element: Long = ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$last_u2dMShoTSo`, var2--)
         if (predicate(ULong.box_impl/* $VF was: box-impl */(element)) as java.lang.Boolean) {
            return element
         }
      } while (0 <= var2)
   }

   throw NoSuchElementException("Array contains no element matching the predicate.")
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public fun UShortArray.randomOrNull(random: Random): UShort? {
   return if (UShortArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$randomOrNull_u2ds5X_as8`))
      null
      else
      UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$randomOrNull_u2ds5X_as8`, random.nextInt(size)))
   }

@ExperimentalUnsignedTypes
@JvmName(name = "sumOfLong")
@SinceKotlin(version = "1.4")
@InlineOnly
@OverloadResolutionByLambdaReturnType
public inline fun ULongArray.sumOf(selector: (ULong) -> Long): Long {
   var sum: Long = 0L
   var var4: Int = 0

   for (var5 in size..var4) {
      sum += (selector(ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$sumOf_u2dMShoTSo`, var4))) as java.lang.Number)
         .longValue()
      }

   return sum
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public inline fun <C : MutableCollection<in UInt>> UIntArray.filterNotTo(destination: Any, predicate: (UInt) -> Boolean): Any {
   var var3: Int = 0

   for (var4 in size..var3) {
      val element: Int = UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$filterNotTo_u2dwU5IKMo`, var3)
      if (!predicate(UInt.box_impl/* $VF was: box-impl */(element)) as java.lang.Boolean) {
         destination.add(UInt.box_impl/* $VF was: box-impl */(element))
      }
   }

   return (C)destination
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public inline fun ULongArray.reduceRight(operation: (ULong, ULong) -> ULong): ULong {
   var index: Int = ArraysKt.getLastIndex(`$this$reduceRight_u2ds8dVfGU`)
   if (index < 0) {
      throw UnsupportedOperationException("Empty array can't be reduced.")
   } else {
      var var6: Long = ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$reduceRight_u2ds8dVfGU`, index--)

      while (index >= 0) {
         var6 = (operation(
               ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$reduceRight_u2ds8dVfGU`, index--)),
               ULong.box_impl/* $VF was: box-impl */(var6)
            ) as ULong)
            .unbox_impl/* $VF was: unbox-impl */()
         }

      return var6
   }
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun <K, V> UIntArray.groupBy(keySelector: (UInt) -> Any, valueTransform: (UInt) -> Any): Map<Any, List<Any>> {
   val var3: IntArray = `$this$groupBy_u2dL4rlFek`
   val var4: java.util.Map = LinkedHashMap()
   var var5: Int = 0

   for (var6 in size..var5) {
      val var7: Int = UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(var3, var5)
      val var8: Any = keySelector(UInt.box_impl/* $VF was: box-impl */(var7))
      var var10000: Any = var4.get(var8)
      if (var10000 == null) {
         val var10: java.util.List = ArrayList()
         var4.put(var8, var10)
         var10000 = var10
      }

      (var10000 as java.util.List).add(valueTransform(UInt.box_impl/* $VF was: box-impl */(var7)))
   }

   return var4
}

@ExperimentalUnsignedTypes
@OverloadResolutionByLambdaReturnType
@JvmName(name = "sumOfUInt")
@InlineOnly
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
public inline fun UShortArray.sumOf(selector: (UShort) -> UInt): UInt {
   var sum: Int = UInt.constructor_impl/* $VF was: constructor-impl */(0)
   var var3: Int = 0

   for (var4 in size..var3) {
      sum = UInt.constructor_impl/* $VF was: constructor-impl */(
         sum
            + (selector(UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$sumOf_u2dxTcfx_M`, var3))) as UInt)
               .unbox_impl/* $VF was: unbox-impl */()
      )
   }

   return sum
}

@DeprecatedSinceKotlin(warningSince = "1.5")
@Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = []))
@InlineOnly
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public inline fun ULongArray.sumBy(selector: (ULong) -> UInt): UInt {
   var sum: Int = 0
   var var3: Int = 0

   for (var4 in size..var3) {
      sum = UInt.constructor_impl/* $VF was: constructor-impl */(
         sum
            + (selector(ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$sumBy_u2dMShoTSo`, var3))) as UInt)
               .unbox_impl/* $VF was: unbox-impl */()
      )
   }

   return sum
}

@SinceKotlin(version = "1.3")
@InlineOnly
@ExperimentalUnsignedTypes
public inline operator fun UShortArray.component4(): UShort {
   return UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$component4_u2drL5Bavg`, 3)
}

@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
public fun UIntArray?.contentHashCode(): Int {
   var var10000: IntArray = `$this$contentHashCode_u2dXUkPCBk`
   if (`$this$contentHashCode_u2dXUkPCBk` == null) {
      var10000 = null
   }

   return Arrays.hashCode(var10000)
}

@InlineOnly
@ExperimentalUnsignedTypes
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
public inline fun <R> UShortArray.maxOfWithOrNull(comparator: Comparator<in Any>, selector: (UShort) -> Any): Any? {
   if (UShortArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$maxOfWithOrNull_u2dl8EHGbQ`)) {
      return null
   } else {
      var maxValue: Any = selector(
         UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$maxOfWithOrNull_u2dl8EHGbQ`, 0))
      )
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfWithOrNull_u2dl8EHGbQ`)).iterator()

      while (var4.hasNext()) {
         val var8: Any = selector(
            UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$maxOfWithOrNull_u2dl8EHGbQ`, var4.nextInt()))
         )
         if (comparator.compare(maxValue, var8) < 0) {
            maxValue = var8
         }
      }

      return (R)maxValue
   }
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
public fun UByteArray.minOrNull(): UByte? {
   if (UByteArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$minOrNull_u2dGBYM_sE`)) {
      return null
   } else {
      var min: Byte = UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$minOrNull_u2dGBYM_sE`, 0)
      val var2: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOrNull_u2dGBYM_sE`)).iterator()

      while (var2.hasNext()) {
         val var6: Byte = UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$minOrNull_u2dGBYM_sE`, var2.nextInt())
         if (Intrinsics.compare(min and 255, var6 and 255) > 0) {
            min = var6
         }
      }

      return UByte.box_impl/* $VF was: box-impl */(min)
   }
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun <R> UShortArray.runningFoldIndexed(initial: Any, operation: (Int, Any, UShort) -> Any): List<Any> {
   if (UShortArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$runningFoldIndexed_u2dbzxtMww`)) {
      return (java.util.List<R>)CollectionsKt.listOf(initial)
   } else {
      val accumulator: ArrayList = ArrayList(size + 1)
      accumulator.add(initial)
      val result: ArrayList = accumulator
      var var7: Any = initial
      var var8: Int = 0

      for (var9 in size..var8) {
         var7 = operation(
            var8, var7, UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$runningFoldIndexed_u2dbzxtMww`, var8))
         )
         result.add(var7)
      }

      return result
   }
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public fun UShortArray.takeLast(n: Int): List<UShort> {
   if (n < 0) {
      throw IllegalArgumentException(("Requested element count $n is less than zero.").toString())
   } else if (n == 0) {
      return CollectionsKt.emptyList()
   } else {
      val var5: Int = size
      if (n >= var5) {
         return CollectionsKt.toList(UShortArray.box_impl/* $VF was: box-impl */(`$this$takeLast_u2dnggk6HY`))
      } else if (n == 1) {
         return CollectionsKt.listOf(
            UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$takeLast_u2dnggk6HY`, var5 + -1))
         )
      } else {
         val list: ArrayList = ArrayList(n)

         for (index in var5 - n..var5) {
            list.add(UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$takeLast_u2dnggk6HY`, index)))
         }

         return list
      }
   }
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun UIntArray.reduce(operation: (UInt, UInt) -> UInt): UInt {
   if (UIntArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$reduce_u2dWyvcNBI`)) {
      throw UnsupportedOperationException("Empty array can't be reduced.")
   } else {
      var accumulator: Int = UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$reduce_u2dWyvcNBI`, 0)
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$reduce_u2dWyvcNBI`)).iterator()

      while (var3.hasNext()) {
         accumulator = (operation(
               UInt.box_impl/* $VF was: box-impl */(accumulator),
               UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$reduce_u2dWyvcNBI`, var3.nextInt()))
            ) as UInt)
            .unbox_impl/* $VF was: unbox-impl */()
         }

      return accumulator
   }
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public fun UIntArray.reversed(): List<UInt> {
   if (UIntArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$reversed_u2d_u2dajY_u2d9A`)) {
      return CollectionsKt.emptyList()
   } else {
      val list: java.util.List = CollectionsKt.toMutableList(UIntArray.box_impl/* $VF was: box-impl */(`$this$reversed_u2d_u2dajY_u2d9A`))
      CollectionsKt.reverse(list)
      return list
   }
}

@InlineOnly
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public inline fun UShortArray.random(): UShort {
   return UArraysKt.random_s5X_as8/* $VF was: random-s5X_as8 */(`$this$random_u2drL5Bavg`, Random.Default)
}

@SinceKotlin(version = "1.3")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun <R> ULongArray.foldRight(initial: Any, operation: (ULong, Any) -> Any): Any {
   var index: Int = ArraysKt.getLastIndex(`$this$foldRight_u2dA8wKCXQ`)
   var var6: Any = initial

   while (index >= 0) {
      var6 = operation(ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$foldRight_u2dA8wKCXQ`, index--)), var6)
   }

   return (R)var6
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun <R, C : MutableCollection<in Any>> ULongArray.mapIndexedTo(destination: Any, transform: (Int, ULong) -> Any): Any {
   var index: Int = 0
   var var4: Int = 0

   for (var5 in size..var4) {
      destination.add(
         transform(index++, ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$mapIndexedTo_u2dpe2Q0Dw`, var4)))
      )
   }

   return (C)destination
}

@SinceKotlin(version = "1.3")
@InlineOnly
@ExperimentalUnsignedTypes
public inline operator fun UShortArray.component5(): UShort {
   return UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$component5_u2drL5Bavg`, 4)
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public fun UShortArray.singleOrNull(): UShort? {
   return if (size == 1)
      UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$singleOrNull_u2drL5Bavg`, 0))
      else
      null
   }

@SinceKotlin(version = "1.3")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun <K, M : MutableMap<in Any, MutableList<UShort>>> UShortArray.groupByTo(destination: Any, keySelector: (UShort) -> Any): Any {
   var var3: Int = 0

   for (var4 in size..var3) {
      val element: Short = UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$groupByTo_u2dciTST_u2d8`, var3)
      val key: Any = keySelector(UShort.box_impl/* $VF was: box-impl */(element))
      val `value$iv`: Any = destination.get(key)
      val var10000: Any
      if (`value$iv` == null) {
         val var12: java.util.List = ArrayList()
         destination.put(key, var12)
         var10000 = var12
      } else {
         var10000 = `value$iv`
      }

      (var10000 as java.util.List).add(UShort.box_impl/* $VF was: box-impl */(element))
   }

   return (M)destination
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
public fun UIntArray.sortDescending(fromIndex: Int, toIndex: Int) {
   UArraysKt.sort_oBK06Vg/* $VF was: sort-oBK06Vg */(`$this$sortDescending_u2doBK06Vg`, fromIndex, toIndex)
   ArraysKt.reverse((int[])`$this$sortDescending_u2doBK06Vg`, fromIndex, toIndex)
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public fun UIntArray.toTypedArray(): Array<UInt> {
   var var1: Int = 0
   val var2: Int = size
   val var3: Array<UInt> = arrayOfNulls(var2)

   while (var1 < var2) {
      var3[var1] = UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$toTypedArray_u2d_u2dajY_u2d9A`, var1))
      var1++
   }

   return var3
}

@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun <R, C : MutableCollection<in Any>> ULongArray.flatMapIndexedTo(destination: Any, transform: (Int, ULong) -> Iterable<Any>): Any {
   var index: Int = 0
   var var4: Int = 0

   for (var5 in size..var4) {
      CollectionsKt.addAll(
         destination,
         transform(index++, ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$flatMapIndexedTo_u2dpe2Q0Dw`, var4))) as java.lang.Iterable
      )
   }

   return (C)destination
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public inline fun ULongArray.dropWhile(predicate: (ULong) -> Boolean): List<ULong> {
   var yielding: Boolean = false
   val list: ArrayList = ArrayList()
   var var4: Int = 0

   for (var5 in size..var4) {
      val item: Long = ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$dropWhile_u2dMShoTSo`, var4)
      if (yielding) {
         list.add(ULong.box_impl/* $VF was: box-impl */(item))
      } else if (!predicate(ULong.box_impl/* $VF was: box-impl */(item)) as java.lang.Boolean) {
         list.add(ULong.box_impl/* $VF was: box-impl */(item))
         yielding = true
      }
   }

   return list
}

@SinceKotlin(version = "1.4")
@InlineOnly
@ExperimentalUnsignedTypes
@OverloadResolutionByLambdaReturnType
public inline fun UByteArray.maxOf(selector: (UByte) -> Double): Double {
   if (UByteArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$maxOf_u2dJOV_ifY`)) {
      throw NoSuchElementException()
   } else {
      var maxValue: Double = (selector(UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$maxOf_u2dJOV_ifY`, 0))) as java.lang.Number)
         .doubleValue()
         val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOf_u2dJOV_ifY`)).iterator()

      while (var4.hasNext()) {
         maxValue = Math.max(
            maxValue,
            (selector(UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$maxOf_u2dJOV_ifY`, var4.nextInt()))) as java.lang.Number)
               .doubleValue()
         )
      }

      return maxValue
   }
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun <C : MutableCollection<in UShort>> UShortArray.filterNotTo(destination: Any, predicate: (UShort) -> Boolean): Any {
   var var3: Int = 0

   for (var4 in size..var3) {
      val element: Short = UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$filterNotTo_u2doEOeDjA`, var3)
      if (!predicate(UShort.box_impl/* $VF was: box-impl */(element)) as java.lang.Boolean) {
         destination.add(UShort.box_impl/* $VF was: box-impl */(element))
      }
   }

   return (C)destination
}

@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
public fun UShortArray.minWithOrNull(comparator: Comparator<in UShort>): UShort? {
   if (UShortArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$minWithOrNull_u2deOHTfZs`)) {
      return null
   } else {
      var min: Short = UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$minWithOrNull_u2deOHTfZs`, 0)
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minWithOrNull_u2deOHTfZs`)).iterator()

      while (var3.hasNext()) {
         val var7: Short = UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$minWithOrNull_u2deOHTfZs`, var3.nextInt())
         if (comparator.compare(UShort.box_impl/* $VF was: box-impl */(min), UShort.box_impl/* $VF was: box-impl */(var7)) > 0) {
            min = var7
         }
      }

      return UShort.box_impl/* $VF was: box-impl */(min)
   }
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun <R> ULongArray.scan(initial: Any, operation: (Any, ULong) -> Any): List<Any> {
   val var3: LongArray = `$this$scan_u2dA8wKCXQ`
   val var10000: java.util.List
   if (ULongArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$scan_u2dA8wKCXQ`)) {
      var10000 = CollectionsKt.listOf(initial)
   } else {
      val var4: ArrayList = ArrayList(size + 1)
      var4.add(initial)
      val var6: ArrayList = var4
      var var10: Any = initial
      var var11: Int = 0

      for (var7 in size..var11) {
         var10 = operation(var10, ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(var3, var11)))
         var6.add(var10)
      }

      var10000 = var6
   }

   return var10000
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public inline fun <K, M : MutableMap<in Any, MutableList<ULong>>> ULongArray.groupByTo(destination: Any, keySelector: (ULong) -> Any): Any {
   var var3: Int = 0

   for (var4 in size..var3) {
      val element: Long = ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$groupByTo_u2dX6OPwNk`, var3)
      val key: Any = keySelector(ULong.box_impl/* $VF was: box-impl */(element))
      val `value$iv`: Any = destination.get(key)
      val var10000: Any
      if (`value$iv` == null) {
         val var13: java.util.List = ArrayList()
         destination.put(key, var13)
         var10000 = var13
      } else {
         var10000 = `value$iv`
      }

      (var10000 as java.util.List).add(ULong.box_impl/* $VF was: box-impl */(element))
   }

   return (M)destination
}

@SinceKotlin(version = "1.4")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun <R> ULongArray.runningFold(initial: Any, operation: (Any, ULong) -> Any): List<Any> {
   if (ULongArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$runningFold_u2dA8wKCXQ`)) {
      return (java.util.List<R>)CollectionsKt.listOf(initial)
   } else {
      val accumulator: ArrayList = ArrayList(size + 1)
      accumulator.add(initial)
      val result: ArrayList = accumulator
      var var9: Any = initial
      var var10: Int = 0

      for (var11 in size..var10) {
         var9 = operation(var9, ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$runningFold_u2dA8wKCXQ`, var10)))
         result.add(var9)
      }

      return result
   }
}

@OverloadResolutionByLambdaReturnType
@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
public inline fun UShortArray.maxOf(selector: (UShort) -> Float): Float {
   if (UShortArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$maxOf_u2dxTcfx_M`)) {
      throw NoSuchElementException()
   } else {
      var maxValue: Float = (selector(UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$maxOf_u2dxTcfx_M`, 0))) as java.lang.Number)
         .floatValue()
         val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOf_u2dxTcfx_M`)).iterator()

      while (var3.hasNext()) {
         maxValue = Math.max(
            maxValue,
            (selector(UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$maxOf_u2dxTcfx_M`, var3.nextInt()))) as java.lang.Number)
               .floatValue()
         )
      }

      return maxValue
   }
}

@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun UIntArray.maxOf(selector: (UInt) -> Double): Double {
   if (UIntArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$maxOf_u2djgv0xPQ`)) {
      throw NoSuchElementException()
   } else {
      var maxValue: Double = (selector(UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$maxOf_u2djgv0xPQ`, 0))) as java.lang.Number)
         .doubleValue()
         val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOf_u2djgv0xPQ`)).iterator()

      while (var4.hasNext()) {
         maxValue = Math.max(
            maxValue,
            (selector(UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$maxOf_u2djgv0xPQ`, var4.nextInt()))) as java.lang.Number)
               .doubleValue()
         )
      }

      return maxValue
   }
}

@DeprecatedSinceKotlin(warningSince = "1.5")
@Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = []))
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun UByteArray.sumBy(selector: (UByte) -> UInt): UInt {
   var sum: Int = 0
   var var3: Int = 0

   for (var4 in size..var3) {
      sum = UInt.constructor_impl/* $VF was: constructor-impl */(
         sum
            + (selector(UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$sumBy_u2dJOV_ifY`, var3))) as UInt)
               .unbox_impl/* $VF was: unbox-impl */()
      )
   }

   return sum
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun ULongArray.copyOfRange(fromIndex: Int, toIndex: Int): ULongArray {
   val var10000: LongArray
   if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
      var10000 = ArraysKt.copyOfRange(`$this$copyOfRange_u2d_u2dnroSd4`, fromIndex, toIndex)
   } else {
      if (toIndex > `$this$copyOfRange_u2d_u2dnroSd4`.length) {
         throw IndexOutOfBoundsException("toIndex: $toIndex, size: ${`$this$copyOfRange_u2d_u2dnroSd4`.length}")
      }

      val var4: LongArray = Arrays.copyOfRange(`$this$copyOfRange_u2d_u2dnroSd4`, fromIndex, toIndex)
      var10000 = var4
   }

   return ULongArray.constructor_impl/* $VF was: constructor-impl */(var10000)
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public fun UShortArray.sorted(): List<UShort> {
   val var10000: ShortArray = Arrays.copyOf(`$this$sorted_u2drL5Bavg`, `$this$sorted_u2drL5Bavg`.length)
   val var1: ShortArray = UShortArray.constructor_impl/* $VF was: constructor-impl */(var10000)
   UArraysKt.sort_rL5Bavg/* $VF was: sort-rL5Bavg */(var1)
   return UArraysKt.asList_rL5Bavg/* $VF was: asList-rL5Bavg */(var1)
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public operator fun UShortArray.plus(elements: Collection<UShort>): UShortArray {
   var index: Int = size
   val var10000: ShortArray = Arrays.copyOf(`$this$plus_u2dojwP5H8`, size + elements.size())
   val result: ShortArray = var10000
   val var4: java.util.Iterator = elements.iterator()

   while (var4.hasNext()) {
      result[index++] = (var4.next() as UShort).unbox_impl/* $VF was: unbox-impl */()
   }

   return UShortArray.constructor_impl/* $VF was: constructor-impl */(result)
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public fun UShortArray.sortedArrayDescending(): UShortArray {
   if (UShortArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$sortedArrayDescending_u2drL5Bavg`)) {
      return `$this$sortedArrayDescending_u2drL5Bavg`
   } else {
      val var10000: ShortArray = Arrays.copyOf(`$this$sortedArrayDescending_u2drL5Bavg`, `$this$sortedArrayDescending_u2drL5Bavg`.length)
      val var1: ShortArray = UShortArray.constructor_impl/* $VF was: constructor-impl */(var10000)
      UArraysKt.sortDescending_rL5Bavg/* $VF was: sortDescending-rL5Bavg */(var1)
      return var1
   }
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public inline fun UByteArray.copyInto(destination: UByteArray, destinationOffset: Int = ..., startIndex: Int = ..., endIndex: Int = ...): UByteArray {
   ArraysKt.copyInto((byte[])`$this$copyInto_u2dFUQE5sA`, (byte[])destination, destinationOffset, startIndex, endIndex)
   return destination
}

@OverloadResolutionByLambdaReturnType
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun <R> ULongArray.maxOfWith(comparator: Comparator<in Any>, selector: (ULong) -> Any): Any {
   if (ULongArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$maxOfWith_u2d5NtCtWE`)) {
      throw NoSuchElementException()
   } else {
      var maxValue: Any = selector(ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$maxOfWith_u2d5NtCtWE`, 0)))
      val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfWith_u2d5NtCtWE`)).iterator()

      while (var4.hasNext()) {
         val var8: Any = selector(
            ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$maxOfWith_u2d5NtCtWE`, var4.nextInt()))
         )
         if (comparator.compare(maxValue, var8) < 0) {
            maxValue = var8
         }
      }

      return (R)maxValue
   }
}

@JvmName(name = "maxWithOrThrow-U")
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.7")
public fun UByteArray.maxWith(comparator: Comparator<in UByte>): UByte {
   if (UByteArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$maxWith_u2dXMRcp5o`)) {
      throw NoSuchElementException()
   } else {
      var max: Byte = UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$maxWith_u2dXMRcp5o`, 0)
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxWith_u2dXMRcp5o`)).iterator()

      while (var3.hasNext()) {
         val var7: Byte = UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$maxWith_u2dXMRcp5o`, var3.nextInt())
         if (comparator.compare(UByte.box_impl/* $VF was: box-impl */(max), UByte.box_impl/* $VF was: box-impl */(var7)) < 0) {
            max = var7
         }
      }

      return max
   }
}

@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
public fun UShortArray?.contentHashCode(): Int {
   var var10000: ShortArray = `$this$contentHashCode_u2dd_u2d6D3K8`
   if (`$this$contentHashCode_u2dd_u2d6D3K8` == null) {
      var10000 = null
   }

   return Arrays.hashCode(var10000)
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public fun UByteArray.dropLast(n: Int): List<UByte> {
   if (n < 0) {
      throw IllegalArgumentException(("Requested element count $n is less than zero.").toString())
   } else {
      return UArraysKt.take_PpDY95g/* $VF was: take-PpDY95g */(`$this$dropLast_u2dPpDY95g`, RangesKt.coerceAtLeast(size - n, 0))
   }
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public inline fun <K> UIntArray.groupBy(keySelector: (UInt) -> Any): Map<Any, List<UInt>> {
   val var2: IntArray = `$this$groupBy_u2djgv0xPQ`
   val var3: java.util.Map = LinkedHashMap()
   var var4: Int = 0

   for (var5 in size..var4) {
      val var6: Int = UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(var2, var4)
      val var7: Any = keySelector(UInt.box_impl/* $VF was: box-impl */(var6))
      var var10000: Any = var3.get(var7)
      if (var10000 == null) {
         val var9: java.util.List = ArrayList()
         var3.put(var7, var9)
         var10000 = var9
      }

      (var10000 as java.util.List).add(UInt.box_impl/* $VF was: box-impl */(var6))
   }

   return var3
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun LongArray.asULongArray(): ULongArray {
   return ULongArray.constructor_impl/* $VF was: constructor-impl */(`$this$asULongArray`)
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public fun UIntArray.sort() {
   if (size > 1) {
      UArraySortingKt.sortArray_oBK06Vg/* $VF was: sortArray-oBK06Vg */(`$this$sort_u2d_u2dajY_u2d9A`, 0, size)
   }
}

@ExperimentalUnsignedTypes
@InlineOnly
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
public inline fun ULongArray.minOfOrNull(selector: (ULong) -> Double): Double? {
   if (ULongArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$minOfOrNull_u2dMShoTSo`)) {
      return null
   } else {
      var minValue: Double = (selector(
            ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$minOfOrNull_u2dMShoTSo`, 0))
         ) as java.lang.Number)
         .doubleValue()
         val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOfOrNull_u2dMShoTSo`)).iterator()

      while (var4.hasNext()) {
         minValue = Math.min(
            minValue,
            (selector(ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$minOfOrNull_u2dMShoTSo`, var4.nextInt()))) as java.lang.Number)
               .doubleValue()
         )
      }

      return minValue
   }
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public inline fun UByteArray.forEach(action: (UByte) -> Unit) {
   var var2: Int = 0

   for (var3 in size..var2) {
      action(UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$forEach_u2dJOV_ifY`, var2)))
   }
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public inline fun UShortArray.copyOfRange(fromIndex: Int, toIndex: Int): UShortArray {
   val var10000: ShortArray
   if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
      var10000 = ArraysKt.copyOfRange((short[])`$this$copyOfRange_u2dAa5vz7o`, fromIndex, toIndex)
   } else {
      if (toIndex > `$this$copyOfRange_u2dAa5vz7o`.length) {
         throw IndexOutOfBoundsException("toIndex: $toIndex, size: ${`$this$copyOfRange_u2dAa5vz7o`.length}")
      }

      val var4: ShortArray = Arrays.copyOfRange(`$this$copyOfRange_u2dAa5vz7o`, fromIndex, toIndex)
      var10000 = var4
   }

   return UShortArray.constructor_impl/* $VF was: constructor-impl */(var10000)
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public fun UShortArray.fill(element: UShort, fromIndex: Int = ..., toIndex: Int = ...) {
   ArraysKt.fill((short[])`$this$fill_u2dEtDCXyQ`, (short)element, fromIndex, toIndex)
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public inline fun UShortArray.toShortArray(): ShortArray {
   val var10000: ShortArray = Arrays.copyOf(`$this$toShortArray_u2drL5Bavg`, `$this$toShortArray_u2drL5Bavg`.length)
   return var10000
}

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun ULongArray.minOf(selector: (ULong) -> Double): Double {
   if (ULongArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$minOf_u2dMShoTSo`)) {
      throw NoSuchElementException()
   } else {
      var minValue: Double = (selector(ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$minOf_u2dMShoTSo`, 0))) as java.lang.Number)
         .doubleValue()
         val var4: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$minOf_u2dMShoTSo`)).iterator()

      while (var4.hasNext()) {
         minValue = Math.min(
            minValue,
            (selector(ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$minOf_u2dMShoTSo`, var4.nextInt()))) as java.lang.Number)
               .doubleValue()
         )
      }

      return minValue
   }
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun <R> ULongArray.foldRightIndexed(initial: Any, operation: (Int, ULong, Any) -> Any): Any {
   var index: Int = ArraysKt.getLastIndex(`$this$foldRightIndexed_u2dmwnnOCs`)
   var var6: Any = initial

   while (index >= 0) {
      var6 = operation(
         index, ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$foldRightIndexed_u2dmwnnOCs`, index)), var6
      )
      index--
   }

   return (R)var6
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public fun UIntArray.drop(n: Int): List<UInt> {
   if (n < 0) {
      throw IllegalArgumentException(("Requested element count $n is less than zero.").toString())
   } else {
      return UArraysKt.takeLast_qFRl0hI/* $VF was: takeLast-qFRl0hI */(`$this$drop_u2dqFRl0hI`, RangesKt.coerceAtLeast(size - n, 0))
   }
}

@SinceKotlin(version = "1.4")
@ExperimentalUnsignedTypes
public fun UShortArray.shuffle() {
   UArraysKt.shuffle_s5X_as8/* $VF was: shuffle-s5X_as8 */(`$this$shuffle_u2drL5Bavg`, Random.Default)
}

@SinceKotlin(version = "1.3")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun UByteArray.filterIndexed(predicate: (Int, UByte) -> Boolean): List<UByte> {
   val var3: java.util.Collection = ArrayList()
   val var4: ByteArray = `$this$filterIndexed_u2dELGow60`
   val var5: Int = 0
   var var6: Int = 0

   for (var7 in size..var6) {
      val var8: Byte = UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(var4, var6)
      if (predicate(var5++, UByte.box_impl/* $VF was: box-impl */(var8)) as java.lang.Boolean) {
         var3.add(UByte.box_impl/* $VF was: box-impl */(var8))
      }
   }

   return var3 as MutableList<UByte>
}

@InlineOnly
@JvmName(name = "sumOfULong")
@ExperimentalUnsignedTypes
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
public inline fun UShortArray.sumOf(selector: (UShort) -> ULong): ULong {
   var sum: Long = ULong.constructor_impl/* $VF was: constructor-impl */(0L)
   var var4: Int = 0

   for (var5 in size..var4) {
      sum = ULong.constructor_impl/* $VF was: constructor-impl */(
         sum
            + (selector(UShort.box_impl/* $VF was: box-impl */(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(`$this$sumOf_u2dxTcfx_M`, var4))) as ULong)
               .unbox_impl/* $VF was: unbox-impl */()
      )
   }

   return sum
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun UByteArray.forEachIndexed(action: (Int, UByte) -> Unit) {
   var index: Int = 0
   var var3: Int = 0

   for (var4 in size..var3) {
      action(index++, UByte.box_impl/* $VF was: box-impl */(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(`$this$forEachIndexed_u2dELGow60`, var3)))
   }
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public fun UShortArray.sliceArray(indices: Collection<Int>): UShortArray {
   return UShortArray.constructor_impl/* $VF was: constructor-impl */(ArraysKt.sliceArray((short[])`$this$sliceArray_u2dojwP5H8`, indices))
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun ULongArray.dropLastWhile(predicate: (ULong) -> Boolean): List<ULong> {
   for (index in ArraysKt.getLastIndex(`$this$dropLastWhile_u2dMShoTSo`) downTo 0) {
      if (!predicate(ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$dropLastWhile_u2dMShoTSo`, index))) as java.lang.Boolean
         )
       {
         return UArraysKt.take_r7IrZao/* $VF was: take-r7IrZao */(`$this$dropLastWhile_u2dMShoTSo`, index + 1)
      }
   }

   return CollectionsKt.emptyList()
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun ULongArray.elementAtOrNull(index: Int): ULong? {
   return UArraysKt.getOrNull_r7IrZao/* $VF was: getOrNull-r7IrZao */(`$this$elementAtOrNull_u2dr7IrZao`, index)
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
public inline fun <R : Comparable<Any>> ULongArray.maxOfOrNull(selector: (ULong) -> Any): Any? {
   if (ULongArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$maxOfOrNull_u2dMShoTSo`)) {
      return null
   } else {
      var maxValue: java.lang.Comparable = selector(
         ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$maxOfOrNull_u2dMShoTSo`, 0))
      ) as java.lang.Comparable
      val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOfOrNull_u2dMShoTSo`)).iterator()

      while (var3.hasNext()) {
         val var7: java.lang.Comparable = selector(
            ULong.box_impl/* $VF was: box-impl */(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(`$this$maxOfOrNull_u2dMShoTSo`, var3.nextInt()))
         ) as java.lang.Comparable
         if (maxValue.compareTo(var7) < 0) {
            maxValue = var7
         }
      }

      return (R)maxValue
   }
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public fun UShortArray.sort() {
   if (size > 1) {
      UArraySortingKt.sortArray_Aa5vz7o/* $VF was: sortArray-Aa5vz7o */(`$this$sort_u2drL5Bavg`, 0, size)
   }
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.4")
public inline fun UIntArray.runningReduceIndexed(operation: (Int, UInt, UInt) -> UInt): List<UInt> {
   if (UIntArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$runningReduceIndexed_u2dD40WMg8`)) {
      return CollectionsKt.emptyList()
   } else {
      var var7: Int = UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$runningReduceIndexed_u2dD40WMg8`, 0)
      val index: Int = (int)ArrayList(size)
      index.add(UInt.box_impl/* $VF was: box-impl */(var7))
      val result: Any = index
      var var8: Int = 1

      for (var9 in size..var8) {
         var7 = (operation(
               var8,
               UInt.box_impl/* $VF was: box-impl */(var7),
               UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$runningReduceIndexed_u2dD40WMg8`, var8))
            ) as UInt)
            .unbox_impl/* $VF was: unbox-impl */()
            result.add(UInt.box_impl/* $VF was: box-impl */(var7))
      }

      return result as MutableList<UInt>
   }
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public fun ULongArray.dropLast(n: Int): List<ULong> {
   if (n < 0) {
      throw IllegalArgumentException(("Requested element count $n is less than zero.").toString())
   } else {
      return UArraysKt.take_r7IrZao/* $VF was: take-r7IrZao */(`$this$dropLast_u2dr7IrZao`, RangesKt.coerceAtLeast(size - n, 0))
   }
}

@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
public inline fun UIntArray.maxOf(selector: (UInt) -> Float): Float {
   if (UIntArray.isEmpty_impl/* $VF was: isEmpty-impl */(`$this$maxOf_u2djgv0xPQ`)) {
      throw NoSuchElementException()
   } else {
      var maxValue: Float = (selector(UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$maxOf_u2djgv0xPQ`, 0))) as java.lang.Number)
         .floatValue()
         val var3: IntIterator = IntRange(1, ArraysKt.getLastIndex(`$this$maxOf_u2djgv0xPQ`)).iterator()

      while (var3.hasNext()) {
         maxValue = Math.max(
            maxValue,
            (selector(UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$maxOf_u2djgv0xPQ`, var3.nextInt()))) as java.lang.Number)
               .floatValue()
         )
      }

      return maxValue
   }
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun UIntArray.singleOrNull(predicate: (UInt) -> Boolean): UInt? {
   var single: UInt = null
   var found: Boolean = false
   var var4: Int = 0

   for (var5 in size..var4) {
      val element: Int = UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$singleOrNull_u2djgv0xPQ`, var4)
      if (predicate(UInt.box_impl/* $VF was: box-impl */(element)) as java.lang.Boolean) {
         if (found) {
            return null
         }

         single = UInt.box_impl/* $VF was: box-impl */(element)
         found = true
      }
   }

   return if (!found) null else single
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun UIntArray.forEach(action: (UInt) -> Unit) {
   var var2: Int = 0

   for (var3 in size..var2) {
      action(UInt.box_impl/* $VF was: box-impl */(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(`$this$forEach_u2djgv0xPQ`, var2)))
   }
}
