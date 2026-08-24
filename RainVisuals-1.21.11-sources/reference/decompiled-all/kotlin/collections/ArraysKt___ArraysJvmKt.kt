@file:JvmMultifileClass
@file:JvmName("ArraysKt")

package kotlin.collections

import java.math.BigDecimal
import java.math.BigInteger
import java.util.ArrayList
import java.util.Arrays
import java.util.Comparator
import java.util.RandomAccess
import java.util.SortedSet
import java.util.TreeSet
import kotlin.internal.InlineOnly
import kotlin.internal.LowPriorityInOverloadResolution
import kotlin.internal.PlatformImplementationsKt

// $VF: Compiled from _ArraysJvm.kt
@PublishedApi
@JvmName(name = "copyOfRange")
@SinceKotlin(version = "1.3")
internal fun ByteArray.copyOfRangeImpl(fromIndex: Int, toIndex: Int): ByteArray {
   ArraysKt.copyOfRangeToIndexCheck(toIndex, `$this$copyOfRangeImpl`.length)
   val var10000: ByteArray = Arrays.copyOfRange(`$this$copyOfRangeImpl`, fromIndex, toIndex)
   return var10000
}

public fun ShortArray.binarySearch(element: Short, fromIndex: Int = 0, toIndex: Int = `$this$binarySearch`.length): Int {
   return Arrays.binarySearch(`$this$binarySearch`, fromIndex, toIndex, element)
}

@InlineOnly
public inline fun FloatArray.copyOf(): FloatArray {
   val var10000: FloatArray = Arrays.copyOf(`$this$copyOf`, `$this$copyOf`.length)
   return var10000
}

@InlineOnly
public inline fun <T> Array<Any>.copyOf(): Array<Any> {
   val var10000: Array<Any> = Arrays.copyOf(`$this$copyOf`, `$this$copyOf`.length)
   return (T[])var10000
}

public fun LongArray.sort(fromIndex: Int = 0, toIndex: Int = `$this$sort`.length) {
   Arrays.sort(`$this$sort`, fromIndex, toIndex)
}

@SinceKotlin(version = "1.4")
@JvmName(name = "contentDeepHashCodeNullable")
@InlineOnly
public inline fun <T> Array<out Any>?.contentDeepHashCode(): Int {
   return if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0))
      ArraysKt.contentDeepHashCode(`$this$contentDeepHashCode`)
      else
      Arrays.deepHashCode(`$this$contentDeepHashCode`)
   }

@SinceKotlin(version = "1.3")
public fun DoubleArray.copyInto(destination: DoubleArray, destinationOffset: Int = 0, startIndex: Int = 0, endIndex: Int = `$this$copyInto`.length): DoubleArray {
   System.arraycopy(`$this$copyInto`, startIndex, destination, destinationOffset, endIndex - startIndex)
   return destination
}

public fun LongArray.asList(): List<Long> {
   return    // $VF: Compiled from _ArraysJvm.kt
object : AbstractList<Long>, RandomAccess {
      public open operator fun contains(element: Long): Boolean {
         return ArraysKt.contains($this$asList, element)
      }

      public open fun lastIndexOf(element: Long): Int {
         return ArraysKt.lastIndexOf($this$asList, element)
      }

      public open fun indexOf(element: Long): Int {
         return ArraysKt.indexOf($this$asList, element)
      }

      public open operator fun get(index: Int): Long {
         return $this$asList[index]
      }

      public override fun isEmpty(): Boolean {
         return $this$asList.length == 0
      }

      public open val size: Int
         public open get() {
            return $this$asList.length
         }

   }
}

@InlineOnly
@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
@JvmName(name = "sumOfBigInteger")
public inline fun DoubleArray.sumOf(selector: (Double) -> BigInteger): BigInteger {
   var var10000: BigInteger = BigInteger.valueOf(0L)
   var sum: BigInteger = var10000

   for (element in `$this$sumOf`) {
      var10000 = sum.add(selector(element) as BigInteger)
      sum = var10000
   }

   return sum
}

public fun <R> Array<*>.filterIsInstance(klass: Class<Any>): List<Any> {
   return ArraysKt.filterIsInstanceTo(`$this$filterIsInstance`, ArrayList(), klass) as MutableList<R>
}

@InlineOnly
@SinceKotlin(version = "1.4")
public inline infix fun LongArray?.contentEquals(other: LongArray?): Boolean {
   return Arrays.equals(`$this$contentEquals`, other)
}

@SinceKotlin(version = "1.3")
public fun IntArray.copyInto(destination: IntArray, destinationOffset: Int = 0, startIndex: Int = 0, endIndex: Int = `$this$copyInto`.length): IntArray {
   System.arraycopy(`$this$copyInto`, startIndex, destination, destinationOffset, endIndex - startIndex)
   return destination
}

public operator fun <T> Array<Any>.plus(elements: Array<out Any>): Array<Any> {
   val result: Array<Any> = Arrays.copyOf(`$this$plus`, `$this$plus`.length + elements.length)
   System.arraycopy(elements, 0, result, `$this$plus`.length, elements.length)
   return (T[])result
}

public operator fun DoubleArray.plus(element: Double): DoubleArray {
   val result: DoubleArray = Arrays.copyOf(`$this$plus`, `$this$plus`.length + 1)
   result[`$this$plus`.length] = element
   return result
}

public fun LongArray.fill(element: Long, fromIndex: Int = 0, toIndex: Int = `$this$fill`.length) {
   Arrays.fill(`$this$fill`, fromIndex, toIndex, element)
}

@PublishedApi
@JvmName(name = "copyOfRange")
@SinceKotlin(version = "1.3")
internal fun BooleanArray.copyOfRangeImpl(fromIndex: Int, toIndex: Int): BooleanArray {
   ArraysKt.copyOfRangeToIndexCheck(toIndex, `$this$copyOfRangeImpl`.length)
   val var10000: BooleanArray = Arrays.copyOfRange(`$this$copyOfRangeImpl`, fromIndex, toIndex)
   return var10000
}

@InlineOnly
public inline fun FloatArray.elementAt(index: Int): Float {
   return `$this$elementAt`[index]
}

public fun DoubleArray.binarySearch(element: Double, fromIndex: Int = 0, toIndex: Int = `$this$binarySearch`.length): Int {
   return Arrays.binarySearch(`$this$binarySearch`, fromIndex, toIndex, element)
}

public operator fun ByteArray.plus(elements: ByteArray): ByteArray {
   val result: ByteArray = Arrays.copyOf(`$this$plus`, `$this$plus`.length + elements.length)
   System.arraycopy(elements, 0, result, `$this$plus`.length, elements.length)
   return result
}

@InlineOnly
public inline fun ByteArray.elementAt(index: Int): Byte {
   return `$this$elementAt`[index]
}

public fun CharArray.sort(fromIndex: Int = 0, toIndex: Int = `$this$sort`.length) {
   Arrays.sort(`$this$sort`, fromIndex, toIndex)
}

@InlineOnly
public inline fun BooleanArray.copyOf(): BooleanArray {
   val var10000: BooleanArray = Arrays.copyOf(`$this$copyOf`, `$this$copyOf`.length)
   return var10000
}

@JvmName(name = "copyOfRangeInline")
@InlineOnly
public inline fun <T> Array<Any>.copyOfRange(fromIndex: Int, toIndex: Int): Array<Any> {
   val var10000: Array<Any>
   if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
      var10000 = ArraysKt.copyOfRange((Object[])`$this$copyOfRange`, fromIndex, toIndex)
   } else {
      if (toIndex > `$this$copyOfRange`.length) {
         throw IndexOutOfBoundsException("toIndex: $toIndex, size: ${`$this$copyOfRange`.length}")
      }

      val var3: Array<Any> = Arrays.copyOfRange(`$this$copyOfRange`, fromIndex, toIndex)
      var10000 = var3
   }

   return (T[])var10000
}

public operator fun <T> Array<Any>.plus(elements: Collection<Any>): Array<Any> {
   var index: Int = `$this$plus`.length
   val result: Array<Any> = Arrays.copyOf(`$this$plus`, `$this$plus`.length + elements.size())

   for (element in elements) {
      result[index++] = element
   }

   return (T[])result
}

@SinceKotlin(version = "1.4")
@InlineOnly
@JvmName(name = "sumOfBigDecimal")
@OverloadResolutionByLambdaReturnType
public inline fun BooleanArray.sumOf(selector: (Boolean) -> BigDecimal): BigDecimal {
   var var10000: BigDecimal = BigDecimal.valueOf(0L)
   var sum: BigDecimal = var10000

   for (element in `$this$sumOf`) {
      var10000 = sum.add(selector(element) as BigDecimal)
      sum = var10000
   }

   return sum
}

@PublishedApi
@SinceKotlin(version = "1.3")
@JvmName(name = "copyOfRange")
internal fun ShortArray.copyOfRangeImpl(fromIndex: Int, toIndex: Int): ShortArray {
   ArraysKt.copyOfRangeToIndexCheck(toIndex, `$this$copyOfRangeImpl`.length)
   val var10000: ShortArray = Arrays.copyOfRange(`$this$copyOfRangeImpl`, fromIndex, toIndex)
   return var10000
}

@InlineOnly
public inline fun IntArray.elementAt(index: Int): Int {
   return `$this$elementAt`[index]
}

@SinceKotlin(version = "1.4")
public fun <T : Comparable<Any>> Array<out Any>.sort(fromIndex: Int = 0, toIndex: Int = `$this$sort`.length) {
   Arrays.sort(`$this$sort`, fromIndex, toIndex)
}

@SinceKotlin(version = "1.4")
@InlineOnly
@JvmName(name = "sumOfBigInteger")
@OverloadResolutionByLambdaReturnType
public inline fun LongArray.sumOf(selector: (Long) -> BigInteger): BigInteger {
   var var10000: BigInteger = BigInteger.valueOf(0L)
   var sum: BigInteger = var10000

   for (element in `$this$sumOf`) {
      var10000 = sum.add(selector(element) as BigInteger)
      sum = var10000
   }

   return sum
}

@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun IntArray?.contentHashCode(): Int {
   return Arrays.hashCode(`$this$contentHashCode`)
}

@JvmName(name = "copyOfRangeInline")
@InlineOnly
public inline fun ShortArray.copyOfRange(fromIndex: Int, toIndex: Int): ShortArray {
   val var10000: ShortArray
   if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
      var10000 = ArraysKt.copyOfRange((short[])`$this$copyOfRange`, fromIndex, toIndex)
   } else {
      if (toIndex > `$this$copyOfRange`.length) {
         throw IndexOutOfBoundsException("toIndex: $toIndex, size: ${`$this$copyOfRange`.length}")
      }

      val var3: ShortArray = Arrays.copyOfRange(`$this$copyOfRange`, fromIndex, toIndex)
      var10000 = var3
   }

   return var10000
}

@InlineOnly
public inline fun CharArray.copyOf(): CharArray {
   val var10000: CharArray = Arrays.copyOf(`$this$copyOf`, `$this$copyOf`.length)
   return var10000
}

public fun CharArray.asList(): List<Char> {
   return    // $VF: Compiled from _ArraysJvm.kt
object : AbstractList<Char>, RandomAccess {
      public open fun indexOf(element: Char): Int {
         return ArraysKt.indexOf($this$asList, element)
      }

      public open operator fun contains(element: Char): Boolean {
         return ArraysKt.contains($this$asList, element)
      }

      public open operator fun get(index: Int): Char {
         return $this$asList[index]
      }

      public override fun isEmpty(): Boolean {
         return $this$asList.length == 0
      }

      public open val size: Int
         public open get() {
            return $this$asList.length
         }


      public open fun lastIndexOf(element: Char): Int {
         return ArraysKt.lastIndexOf($this$asList, element)
      }
   }
}

@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun FloatArray?.contentToString(): String {
   val var10000: java.lang.String = Arrays.toString(`$this$contentToString`)
   return var10000
}

@InlineOnly
public inline fun ByteArray.copyOf(): ByteArray {
   val var10000: ByteArray = Arrays.copyOf(`$this$copyOf`, `$this$copyOf`.length)
   return var10000
}

public fun CharArray.toTypedArray(): Array<Char> {
   val result: Array<Character> = arrayOfNulls(`$this$toTypedArray`.length)
   var index: Int = 0

   for (var3 in `$this$toTypedArray`.length..index) {
      result[index] = `$this$toTypedArray`[index]
   }

   return result
}

public fun ByteArray.asList(): List<Byte> {
   return    // $VF: Compiled from _ArraysJvm.kt
object : AbstractList<Byte>, RandomAccess {
      public open operator fun get(index: Int): Byte {
         return $this$asList[index]
      }

      public override fun isEmpty(): Boolean {
         return $this$asList.length == 0
      }

      public open val size: Int
         public open get() {
            return $this$asList.length
         }


      public open fun indexOf(element: Byte): Int {
         return ArraysKt.indexOf($this$asList, element)
      }

      public open fun lastIndexOf(element: Byte): Int {
         return ArraysKt.lastIndexOf($this$asList, element)
      }

      public open operator fun contains(element: Byte): Boolean {
         return ArraysKt.contains($this$asList, element)
      }
   }
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun LongArray?.contentHashCode(): Int {
   return Arrays.hashCode(`$this$contentHashCode`)
}

@InlineOnly
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@JvmName(name = "sumOfBigDecimal")
public inline fun ByteArray.sumOf(selector: (Byte) -> BigDecimal): BigDecimal {
   var var10000: BigDecimal = BigDecimal.valueOf(0L)
   var sum: BigDecimal = var10000

   for (element in `$this$sumOf`) {
      var10000 = sum.add(selector(element) as BigDecimal)
      sum = var10000
   }

   return sum
}

public operator fun ByteArray.plus(element: Byte): ByteArray {
   val result: ByteArray = Arrays.copyOf(`$this$plus`, `$this$plus`.length + 1)
   result[`$this$plus`.length] = element
   return result
}

@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun ShortArray?.contentToString(): String {
   val var10000: java.lang.String = Arrays.toString(`$this$contentToString`)
   return var10000
}

public operator fun DoubleArray.plus(elements: Collection<Double>): DoubleArray {
   var index: Int = `$this$plus`.length
   val result: DoubleArray = Arrays.copyOf(`$this$plus`, `$this$plus`.length + elements.size())
   val var4: java.util.Iterator = elements.iterator()

   while (var4.hasNext()) {
      result[index++] = (var4.next() as java.lang.Number).doubleValue()
   }

   return result
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun DoubleArray?.contentToString(): String {
   val var10000: java.lang.String = Arrays.toString(`$this$contentToString`)
   return var10000
}

@InlineOnly
public inline fun BooleanArray.elementAt(index: Int): Boolean {
   return `$this$elementAt`[index]
}

public fun IntArray.sort() {
   if (`$this$sort`.length > 1) {
      Arrays.sort(`$this$sort`)
   }
}

public fun DoubleArray.fill(element: Double, fromIndex: Int = 0, toIndex: Int = `$this$fill`.length) {
   Arrays.fill(`$this$fill`, fromIndex, toIndex, element)
}

@InlineOnly
public inline fun ShortArray.copyOf(): ShortArray {
   val var10000: ShortArray = Arrays.copyOf(`$this$copyOf`, `$this$copyOf`.length)
   return var10000
}

@PublishedApi
@SinceKotlin(version = "1.3")
@JvmName(name = "copyOfRange")
internal fun FloatArray.copyOfRangeImpl(fromIndex: Int, toIndex: Int): FloatArray {
   ArraysKt.copyOfRangeToIndexCheck(toIndex, `$this$copyOfRangeImpl`.length)
   val var10000: FloatArray = Arrays.copyOfRange(`$this$copyOfRangeImpl`, fromIndex, toIndex)
   return var10000
}

@SinceKotlin(version = "1.3")
public fun CharArray.copyInto(destination: CharArray, destinationOffset: Int = 0, startIndex: Int = 0, endIndex: Int = `$this$copyInto`.length): CharArray {
   System.arraycopy(`$this$copyInto`, startIndex, destination, destinationOffset, endIndex - startIndex)
   return destination
}

public fun FloatArray.toTypedArray(): Array<Float> {
   val result: Array<java.lang.Float> = arrayOfNulls(`$this$toTypedArray`.length)
   var index: Int = 0

   for (var3 in `$this$toTypedArray`.length..index) {
      result[index] = `$this$toTypedArray`[index]
   }

   return result
}

public fun <T> Array<out Any>.sortWith(comparator: Comparator<in Any>, fromIndex: Int = 0, toIndex: Int = `$this$sortWith`.length) {
   Arrays.sort(`$this$sortWith`, fromIndex, toIndex, comparator)
}

@InlineOnly
@JvmName(name = "sumOfBigInteger")
@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
public inline fun BooleanArray.sumOf(selector: (Boolean) -> BigInteger): BigInteger {
   var var10000: BigInteger = BigInteger.valueOf(0L)
   var sum: BigInteger = var10000

   for (element in `$this$sumOf`) {
      var10000 = sum.add(selector(element) as BigInteger)
      sum = var10000
   }

   return sum
}

@InlineOnly
public inline fun DoubleArray.copyOf(): DoubleArray {
   val var10000: DoubleArray = Arrays.copyOf(`$this$copyOf`, `$this$copyOf`.length)
   return var10000
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline infix fun <T> Array<out Any>?.contentEquals(other: Array<out Any>?): Boolean {
   return Arrays.equals(`$this$contentEquals`, other)
}

public fun <T> Array<Any>.fill(element: Any, fromIndex: Int = 0, toIndex: Int = `$this$fill`.length) {
   Arrays.fill(`$this$fill`, fromIndex, toIndex, element)
}

public fun CharArray.sort() {
   if (`$this$sort`.length > 1) {
      Arrays.sort(`$this$sort`)
   }
}

@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@InlineOnly
@JvmName(name = "sumOfBigInteger")
public inline fun ByteArray.sumOf(selector: (Byte) -> BigInteger): BigInteger {
   var var10000: BigInteger = BigInteger.valueOf(0L)
   var sum: BigInteger = var10000

   for (element in `$this$sumOf`) {
      var10000 = sum.add(selector(element) as BigInteger)
      sum = var10000
   }

   return sum
}

@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun BooleanArray?.contentToString(): String {
   val var10000: java.lang.String = Arrays.toString(`$this$contentToString`)
   return var10000
}

public fun ByteArray.fill(element: Byte, fromIndex: Int = 0, toIndex: Int = `$this$fill`.length) {
   Arrays.fill(`$this$fill`, fromIndex, toIndex, element)
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun DoubleArray?.contentHashCode(): Int {
   return Arrays.hashCode(`$this$contentHashCode`)
}

@InlineOnly
@JvmName(name = "copyOfRangeInline")
public inline fun BooleanArray.copyOfRange(fromIndex: Int, toIndex: Int): BooleanArray {
   val var10000: BooleanArray
   if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
      var10000 = ArraysKt.copyOfRange(`$this$copyOfRange`, fromIndex, toIndex)
   } else {
      if (toIndex > `$this$copyOfRange`.length) {
         throw IndexOutOfBoundsException("toIndex: $toIndex, size: ${`$this$copyOfRange`.length}")
      }

      val var3: BooleanArray = Arrays.copyOfRange(`$this$copyOfRange`, fromIndex, toIndex)
      var10000 = var3
   }

   return var10000
}

@JvmName(name = "copyOfRange")
@SinceKotlin(version = "1.3")
@PublishedApi
internal fun LongArray.copyOfRangeImpl(fromIndex: Int, toIndex: Int): LongArray {
   ArraysKt.copyOfRangeToIndexCheck(toIndex, `$this$copyOfRangeImpl`.length)
   val var10000: LongArray = Arrays.copyOfRange(`$this$copyOfRangeImpl`, fromIndex, toIndex)
   return var10000
}

public operator fun DoubleArray.plus(elements: DoubleArray): DoubleArray {
   val result: DoubleArray = Arrays.copyOf(`$this$plus`, `$this$plus`.length + elements.length)
   System.arraycopy(elements, 0, result, `$this$plus`.length, elements.length)
   return result
}

public fun IntArray.binarySearch(element: Int, fromIndex: Int = 0, toIndex: Int = `$this$binarySearch`.length): Int {
   return Arrays.binarySearch(`$this$binarySearch`, fromIndex, toIndex, element)
}

public operator fun ShortArray.plus(element: Short): ShortArray {
   val result: ShortArray = Arrays.copyOf(`$this$plus`, `$this$plus`.length + 1)
   result[`$this$plus`.length] = element
   return result
}

@InlineOnly
public inline fun IntArray.copyOf(): IntArray {
   val var10000: IntArray = Arrays.copyOf(`$this$copyOf`, `$this$copyOf`.length)
   return var10000
}

@JvmName(name = "sumOfBigInteger")
@SinceKotlin(version = "1.4")
@InlineOnly
@OverloadResolutionByLambdaReturnType
public inline fun IntArray.sumOf(selector: (Int) -> BigInteger): BigInteger {
   var var10000: BigInteger = BigInteger.valueOf(0L)
   var sum: BigInteger = var10000

   for (element in `$this$sumOf`) {
      var10000 = sum.add(selector(element) as BigInteger)
      sum = var10000
   }

   return sum
}

@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun ByteArray?.contentHashCode(): Int {
   return Arrays.hashCode(`$this$contentHashCode`)
}

@InlineOnly
public inline fun CharArray.copyOf(newSize: Int): CharArray {
   val var10000: CharArray = Arrays.copyOf(`$this$copyOf`, newSize)
   return var10000
}

@InlineOnly
public inline fun BooleanArray.copyOf(newSize: Int): BooleanArray {
   val var10000: BooleanArray = Arrays.copyOf(`$this$copyOf`, newSize)
   return var10000
}

public fun ByteArray.sort() {
   if (`$this$sort`.length > 1) {
      Arrays.sort(`$this$sort`)
   }
}

public fun <T> Array<out Any>.binarySearch(element: Any, fromIndex: Int = 0, toIndex: Int = `$this$binarySearch`.length): Int {
   return Arrays.binarySearch(`$this$binarySearch`, fromIndex, toIndex, element)
}

public fun ShortArray.sort(fromIndex: Int = 0, toIndex: Int = `$this$sort`.length) {
   Arrays.sort(`$this$sort`, fromIndex, toIndex)
}

public fun DoubleArray.asList(): List<Double> {
   return    // $VF: Compiled from _ArraysJvm.kt
object : AbstractList<Double>, RandomAccess {
      public open operator fun get(index: Int): Double {
         return $this$asList[index]
      }

      public override fun isEmpty(): Boolean {
         return $this$asList.length == 0
      }

      public open operator fun contains(element: Double): Boolean {
         val `$this$any$iv`: DoubleArray = $this$asList
         var var5: Int = 0
         val var6: Int = $this$asList.length

         var var10000: Boolean
         while (true) {
            if (var5 >= var6) {
               var10000 = false
               break
            }

            if (java.lang.Double.doubleToLongBits(`$this$any$iv`[var5]) == java.lang.Double.doubleToLongBits(element)) {
               var10000 = true
               break
            }

            var5++
         }

         return var10000
      }

      public open fun indexOf(element: Double): Int {
         val `$this$indexOfFirst$iv`: DoubleArray = $this$asList
         var `index$iv`: Int = 0
         val var6: Int = $this$asList.length

         var var10000: Int
         while (true) {
            if (`index$iv` >= var6) {
               var10000 = -1
               break
            }

            if (java.lang.Double.doubleToLongBits(`$this$indexOfFirst$iv`[`index$iv`]) == java.lang.Double.doubleToLongBits(element)) {
               var10000 = `index$iv`
               break
            }

            `index$iv`++
         }

         return var10000
      }

      public open fun lastIndexOf(element: Double): Int {
         val `$this$indexOfLast$iv`: DoubleArray = $this$asList
         var var5: Int = $this$asList.length + -1
         if (0 <= $this$asList.length + -1) {
            do {
               val `index$iv`: Int = var5--
               if (java.lang.Double.doubleToLongBits(`$this$indexOfLast$iv`[`index$iv`]) == java.lang.Double.doubleToLongBits(element)) {
                  return `index$iv`
               }
            } while (0 <= var5)
         }

         return -1
      }

      public open val size: Int
         public open get() {
            return $this$asList.length
         }

   }
}

@LowPriorityInOverloadResolution
@JvmName(name = "contentDeepHashCodeInline")
@SinceKotlin(version = "1.1")
@InlineOnly
public inline fun <T> Array<out Any>.contentDeepHashCode(): Int {
   return if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0))
      ArraysKt.contentDeepHashCode(`$this$contentDeepHashCode`)
      else
      Arrays.deepHashCode(`$this$contentDeepHashCode`)
   }

@SinceKotlin(version = "1.3")
public fun BooleanArray.copyInto(destination: BooleanArray, destinationOffset: Int = 0, startIndex: Int = 0, endIndex: Int = `$this$copyInto`.length): BooleanArray {
   System.arraycopy(`$this$copyInto`, startIndex, destination, destinationOffset, endIndex - startIndex)
   return destination
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun FloatArray?.contentHashCode(): Int {
   return Arrays.hashCode(`$this$contentHashCode`)
}

public fun DoubleArray.toSortedSet(): SortedSet<Double> {
   return ArraysKt.toCollection(`$this$toSortedSet`, TreeSet<>())
}

public fun CharArray.binarySearch(element: Char, fromIndex: Int = 0, toIndex: Int = `$this$binarySearch`.length): Int {
   return Arrays.binarySearch(`$this$binarySearch`, fromIndex, toIndex, element)
}

public operator fun CharArray.plus(element: Char): CharArray {
   val result: CharArray = Arrays.copyOf(`$this$plus`, `$this$plus`.length + 1)
   result[`$this$plus`.length] = element
   return result
}

@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
@JvmName(name = "sumOfBigDecimal")
@InlineOnly
public inline fun FloatArray.sumOf(selector: (Float) -> BigDecimal): BigDecimal {
   var var10000: BigDecimal = BigDecimal.valueOf(0L)
   var sum: BigDecimal = var10000

   for (element in `$this$sumOf`) {
      var10000 = sum.add(selector(element) as BigDecimal)
      sum = var10000
   }

   return sum
}

public fun FloatArray.binarySearch(element: Float, fromIndex: Int = 0, toIndex: Int = `$this$binarySearch`.length): Int {
   return Arrays.binarySearch(`$this$binarySearch`, fromIndex, toIndex, element)
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun CharArray?.contentToString(): String {
   val var10000: java.lang.String = Arrays.toString(`$this$contentToString`)
   return var10000
}

@SinceKotlin(version = "1.4")
@InlineOnly
@OverloadResolutionByLambdaReturnType
@JvmName(name = "sumOfBigInteger")
public inline fun CharArray.sumOf(selector: (Char) -> BigInteger): BigInteger {
   var var10000: BigInteger = BigInteger.valueOf(0L)
   var sum: BigInteger = var10000

   for (element in `$this$sumOf`) {
      var10000 = sum.add(selector(element) as BigInteger)
      sum = var10000
   }

   return sum
}

@InlineOnly
@JvmName(name = "contentDeepEqualsNullable")
@SinceKotlin(version = "1.4")
public inline infix fun <T> Array<out Any>?.contentDeepEquals(other: Array<out Any>?): Boolean {
   return if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0))
      ArraysKt.contentDeepEquals(`$this$contentDeepEquals`, other)
      else
      Arrays.deepEquals(`$this$contentDeepEquals`, other)
   }

@InlineOnly
@LowPriorityInOverloadResolution
@JvmName(name = "contentDeepEqualsInline")
@SinceKotlin(version = "1.1")
public inline infix fun <T> Array<out Any>.contentDeepEquals(other: Array<out Any>): Boolean {
   return if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0))
      ArraysKt.contentDeepEquals(`$this$contentDeepEquals`, other)
      else
      Arrays.deepEquals(`$this$contentDeepEquals`, other)
   }

@InlineOnly
public inline fun IntArray.copyOf(newSize: Int): IntArray {
   val var10000: IntArray = Arrays.copyOf(`$this$copyOf`, newSize)
   return var10000
}

public fun <C : MutableCollection<in Any>, R> Array<*>.filterIsInstanceTo(destination: Any, klass: Class<Any>): Any {
   for (element in `$this$filterIsInstanceTo`) {
      if (klass.isInstance(element)) {
         destination.add(element)
      }
   }

   return (C)destination
}

@PublishedApi
@JvmName(name = "copyOfRange")
@SinceKotlin(version = "1.3")
internal fun DoubleArray.copyOfRangeImpl(fromIndex: Int, toIndex: Int): DoubleArray {
   ArraysKt.copyOfRangeToIndexCheck(toIndex, `$this$copyOfRangeImpl`.length)
   val var10000: DoubleArray = Arrays.copyOfRange(`$this$copyOfRangeImpl`, fromIndex, toIndex)
   return var10000
}

public fun <T> Array<out Any>.sort(fromIndex: Int = 0, toIndex: Int = `$this$sort`.length) {
   Arrays.sort(`$this$sort`, fromIndex, toIndex)
}

@SinceKotlin(version = "1.3")
public fun <T> Array<out Any>.copyInto(destination: Array<Any>, destinationOffset: Int = 0, startIndex: Int = 0, endIndex: Int = `$this$copyInto`.length): Array<
      Any
   > {
   System.arraycopy(`$this$copyInto`, startIndex, destination, destinationOffset, endIndex - startIndex)
   return (T[])destination
}

public fun ShortArray.toSortedSet(): SortedSet<Short> {
   return ArraysKt.toCollection((short[])`$this$toSortedSet`, TreeSet<>())
}

@PublishedApi
@JvmName(name = "copyOfRange")
@SinceKotlin(version = "1.3")
internal fun IntArray.copyOfRangeImpl(fromIndex: Int, toIndex: Int): IntArray {
   ArraysKt.copyOfRangeToIndexCheck(toIndex, `$this$copyOfRangeImpl`.length)
   val var10000: IntArray = Arrays.copyOfRange(`$this$copyOfRangeImpl`, fromIndex, toIndex)
   return var10000
}

@SinceKotlin(version = "1.4")
@InlineOnly
@JvmName(name = "sumOfBigDecimal")
@OverloadResolutionByLambdaReturnType
public inline fun DoubleArray.sumOf(selector: (Double) -> BigDecimal): BigDecimal {
   var var10000: BigDecimal = BigDecimal.valueOf(0L)
   var sum: BigDecimal = var10000

   for (element in `$this$sumOf`) {
      var10000 = sum.add(selector(element) as BigDecimal)
      sum = var10000
   }

   return sum
}

@InlineOnly
public inline fun <T> Array<Any>.copyOf(newSize: Int): Array<Any?> {
   val var10000: Array<Any> = Arrays.copyOf(`$this$copyOf`, newSize)
   return (T[])var10000
}

@SinceKotlin(version = "1.3")
public fun FloatArray.copyInto(destination: FloatArray, destinationOffset: Int = 0, startIndex: Int = 0, endIndex: Int = `$this$copyInto`.length): FloatArray {
   System.arraycopy(`$this$copyInto`, startIndex, destination, destinationOffset, endIndex - startIndex)
   return destination
}

@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun BooleanArray?.contentHashCode(): Int {
   return Arrays.hashCode(`$this$contentHashCode`)
}

@InlineOnly
public inline fun LongArray.copyOf(): LongArray {
   val var10000: LongArray = Arrays.copyOf(`$this$copyOf`, `$this$copyOf`.length)
   return var10000
}

public fun CharArray.fill(element: Char, fromIndex: Int = 0, toIndex: Int = `$this$fill`.length) {
   Arrays.fill(`$this$fill`, fromIndex, toIndex, element)
}

@InlineOnly
@OverloadResolutionByLambdaReturnType
@JvmName(name = "sumOfBigDecimal")
@SinceKotlin(version = "1.4")
public inline fun CharArray.sumOf(selector: (Char) -> BigDecimal): BigDecimal {
   var var10000: BigDecimal = BigDecimal.valueOf(0L)
   var sum: BigDecimal = var10000

   for (element in `$this$sumOf`) {
      var10000 = sum.add(selector(element) as BigDecimal)
      sum = var10000
   }

   return sum
}

@InlineOnly
public inline fun <T : Comparable<Any>> Array<out Any>.sort() {
   ArraysKt.sort((java.lang.Comparable[])`$this$sort`)
}

public operator fun LongArray.plus(element: Long): LongArray {
   val result: LongArray = Arrays.copyOf(`$this$plus`, `$this$plus`.length + 1)
   result[`$this$plus`.length] = element
   return result
}

@InlineOnly
@SinceKotlin(version = "1.4")
@JvmName(name = "sumOfBigInteger")
@OverloadResolutionByLambdaReturnType
public inline fun <T> Array<out Any>.sumOf(selector: (Any) -> BigInteger): BigInteger {
   var var10000: BigInteger = BigInteger.valueOf(0L)
   var sum: BigInteger = var10000

   for (element in `$this$sumOf`) {
      var10000 = sum.add(selector(element) as BigInteger)
      sum = var10000
   }

   return sum
}

@InlineOnly
public inline fun <T> Array<Any>.plusElement(element: Any): Array<Any> {
   return (T[])ArraysKt.plus(`$this$plusElement`, (Object)element)
}

public fun FloatArray.sort() {
   if (`$this$sort`.length > 1) {
      Arrays.sort(`$this$sort`)
   }
}

@InlineOnly
public inline fun LongArray.copyOf(newSize: Int): LongArray {
   val var10000: LongArray = Arrays.copyOf(`$this$copyOf`, newSize)
   return var10000
}

@JvmName(name = "sumOfBigDecimal")
@SinceKotlin(version = "1.4")
@InlineOnly
@OverloadResolutionByLambdaReturnType
public inline fun <T> Array<out Any>.sumOf(selector: (Any) -> BigDecimal): BigDecimal {
   var var10000: BigDecimal = BigDecimal.valueOf(0L)
   var sum: BigDecimal = var10000

   for (element in `$this$sumOf`) {
      var10000 = sum.add(selector(element) as BigDecimal)
      sum = var10000
   }

   return sum
}

@InlineOnly
@SinceKotlin(version = "1.4")
public inline infix fun DoubleArray?.contentEquals(other: DoubleArray?): Boolean {
   return Arrays.equals(`$this$contentEquals`, other)
}

@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun IntArray?.contentToString(): String {
   val var10000: java.lang.String = Arrays.toString(`$this$contentToString`)
   return var10000
}

public operator fun FloatArray.plus(element: Float): FloatArray {
   val result: FloatArray = Arrays.copyOf(`$this$plus`, `$this$plus`.length + 1)
   result[`$this$plus`.length] = element
   return result
}

public fun <T> Array<out Any>.sort() {
   if (`$this$sort`.length > 1) {
      Arrays.sort(`$this$sort`)
   }
}

public operator fun LongArray.plus(elements: LongArray): LongArray {
   val result: LongArray = Arrays.copyOf(`$this$plus`, `$this$plus`.length + elements.length)
   System.arraycopy(elements, 0, result, `$this$plus`.length, elements.length)
   return result
}

@SinceKotlin(version = "1.3")
public fun ShortArray.copyInto(destination: ShortArray, destinationOffset: Int = 0, startIndex: Int = 0, endIndex: Int = `$this$copyInto`.length): ShortArray {
   System.arraycopy(`$this$copyInto`, startIndex, destination, destinationOffset, endIndex - startIndex)
   return destination
}

@JvmName(name = "copyOfRangeInline")
@InlineOnly
public inline fun IntArray.copyOfRange(fromIndex: Int, toIndex: Int): IntArray {
   val var10000: IntArray
   if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
      var10000 = ArraysKt.copyOfRange((int[])`$this$copyOfRange`, fromIndex, toIndex)
   } else {
      if (toIndex > `$this$copyOfRange`.length) {
         throw IndexOutOfBoundsException("toIndex: $toIndex, size: ${`$this$copyOfRange`.length}")
      }

      val var3: IntArray = Arrays.copyOfRange(`$this$copyOfRange`, fromIndex, toIndex)
      var10000 = var3
   }

   return var10000
}

public fun ShortArray.sort() {
   if (`$this$sort`.length > 1) {
      Arrays.sort(`$this$sort`)
   }
}

public operator fun BooleanArray.plus(element: Boolean): BooleanArray {
   val result: BooleanArray = Arrays.copyOf(`$this$plus`, `$this$plus`.length + 1)
   result[`$this$plus`.length] = element
   return result
}

public operator fun BooleanArray.plus(elements: BooleanArray): BooleanArray {
   val result: BooleanArray = Arrays.copyOf(`$this$plus`, `$this$plus`.length + elements.length)
   System.arraycopy(elements, 0, result, `$this$plus`.length, elements.length)
   return result
}

public operator fun ShortArray.plus(elements: Collection<Short>): ShortArray {
   var index: Int = `$this$plus`.length
   val result: ShortArray = Arrays.copyOf(`$this$plus`, `$this$plus`.length + elements.size())
   val var4: java.util.Iterator = elements.iterator()

   while (var4.hasNext()) {
      result[index++] = (var4.next() as java.lang.Number).shortValue()
   }

   return result
}

public fun ByteArray.toTypedArray(): Array<Byte> {
   val result: Array<java.lang.Byte> = arrayOfNulls(`$this$toTypedArray`.length)
   var index: Int = 0

   for (var3 in `$this$toTypedArray`.length..index) {
      result[index] = `$this$toTypedArray`[index]
   }

   return result
}

public fun FloatArray.fill(element: Float, fromIndex: Int = 0, toIndex: Int = `$this$fill`.length) {
   Arrays.fill(`$this$fill`, fromIndex, toIndex, element)
}

public operator fun FloatArray.plus(elements: Collection<Float>): FloatArray {
   var index: Int = `$this$plus`.length
   val result: FloatArray = Arrays.copyOf(`$this$plus`, `$this$plus`.length + elements.size())
   val var4: java.util.Iterator = elements.iterator()

   while (var4.hasNext()) {
      result[index++] = (var4.next() as java.lang.Number).floatValue()
   }

   return result
}

@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun ByteArray?.contentToString(): String {
   val var10000: java.lang.String = Arrays.toString(`$this$contentToString`)
   return var10000
}

@InlineOnly
@JvmName(name = "copyOfRangeInline")
public inline fun CharArray.copyOfRange(fromIndex: Int, toIndex: Int): CharArray {
   val var10000: CharArray
   if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
      var10000 = ArraysKt.copyOfRange((char[])`$this$copyOfRange`, fromIndex, toIndex)
   } else {
      if (toIndex > `$this$copyOfRange`.length) {
         throw IndexOutOfBoundsException("toIndex: $toIndex, size: ${`$this$copyOfRange`.length}")
      }

      val var3: CharArray = Arrays.copyOfRange(`$this$copyOfRange`, fromIndex, toIndex)
      var10000 = var3
   }

   return var10000
}

@JvmName(name = "copyOfRange")
@SinceKotlin(version = "1.3")
@PublishedApi
internal fun CharArray.copyOfRangeImpl(fromIndex: Int, toIndex: Int): CharArray {
   ArraysKt.copyOfRangeToIndexCheck(toIndex, `$this$copyOfRangeImpl`.length)
   val var10000: CharArray = Arrays.copyOfRange(`$this$copyOfRangeImpl`, fromIndex, toIndex)
   return var10000
}

public fun DoubleArray.sort(fromIndex: Int = 0, toIndex: Int = `$this$sort`.length) {
   Arrays.sort(`$this$sort`, fromIndex, toIndex)
}

public operator fun ByteArray.plus(elements: Collection<Byte>): ByteArray {
   var index: Int = `$this$plus`.length
   val result: ByteArray = Arrays.copyOf(`$this$plus`, `$this$plus`.length + elements.size())
   val var4: java.util.Iterator = elements.iterator()

   while (var4.hasNext()) {
      result[index++] = (var4.next() as java.lang.Number).byteValue()
   }

   return result
}

@InlineOnly
public inline fun DoubleArray.copyOf(newSize: Int): DoubleArray {
   val var10000: DoubleArray = Arrays.copyOf(`$this$copyOf`, newSize)
   return var10000
}

@InlineOnly
public inline fun ShortArray.copyOf(newSize: Int): ShortArray {
   val var10000: ShortArray = Arrays.copyOf(`$this$copyOf`, newSize)
   return var10000
}

public fun <T> Array<out Any>.sortWith(comparator: Comparator<in Any>) {
   if (`$this$sortWith`.length > 1) {
      Arrays.sort(`$this$sortWith`, comparator)
   }
}

public fun LongArray.binarySearch(element: Long, fromIndex: Int = 0, toIndex: Int = `$this$binarySearch`.length): Int {
   return Arrays.binarySearch(`$this$binarySearch`, fromIndex, toIndex, element)
}

@JvmName(name = "copyOfRangeInline")
@InlineOnly
public inline fun DoubleArray.copyOfRange(fromIndex: Int, toIndex: Int): DoubleArray {
   val var10000: DoubleArray
   if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
      var10000 = ArraysKt.copyOfRange(`$this$copyOfRange`, fromIndex, toIndex)
   } else {
      if (toIndex > `$this$copyOfRange`.length) {
         throw IndexOutOfBoundsException("toIndex: $toIndex, size: ${`$this$copyOfRange`.length}")
      }

      val var3: DoubleArray = Arrays.copyOfRange(`$this$copyOfRange`, fromIndex, toIndex)
      var10000 = var3
   }

   return var10000
}

public fun CharArray.toSortedSet(): SortedSet<Char> {
   return ArraysKt.toCollection((char[])`$this$toSortedSet`, TreeSet<>())
}

@PublishedApi
@SinceKotlin(version = "1.3")
@JvmName(name = "copyOfRange")
internal fun <T> Array<Any>.copyOfRangeImpl(fromIndex: Int, toIndex: Int): Array<Any> {
   ArraysKt.copyOfRangeToIndexCheck(toIndex, `$this$copyOfRangeImpl`.length)
   val var10000: Array<Any> = Arrays.copyOfRange(`$this$copyOfRangeImpl`, fromIndex, toIndex)
   return (T[])var10000
}

@SinceKotlin(version = "1.3")
public fun ByteArray.copyInto(destination: ByteArray, destinationOffset: Int = 0, startIndex: Int = 0, endIndex: Int = `$this$copyInto`.length): ByteArray {
   System.arraycopy(`$this$copyInto`, startIndex, destination, destinationOffset, endIndex - startIndex)
   return destination
}

public fun IntArray.fill(element: Int, fromIndex: Int = 0, toIndex: Int = `$this$fill`.length) {
   Arrays.fill(`$this$fill`, fromIndex, toIndex, element)
}

public fun ByteArray.binarySearch(element: Byte, fromIndex: Int = 0, toIndex: Int = `$this$binarySearch`.length): Int {
   return Arrays.binarySearch(`$this$binarySearch`, fromIndex, toIndex, element)
}

public fun <T> Array<out Any>.toSortedSet(comparator: Comparator<in Any>): SortedSet<Any> {
   return ArraysKt.toCollection((Object[])`$this$toSortedSet`, TreeSet(comparator)) as SortedSet<T>
}

@InlineOnly
public inline fun DoubleArray.elementAt(index: Int): Double {
   return `$this$elementAt`[index]
}

@InlineOnly
public inline fun CharArray.elementAt(index: Int): Char {
   return `$this$elementAt`[index]
}

public fun FloatArray.asList(): List<Float> {
   return    // $VF: Compiled from _ArraysJvm.kt
object : AbstractList<Float>, RandomAccess {
      public open val size: Int
         public open get() {
            return $this$asList.length
         }


      public open fun indexOf(element: Float): Int {
         val `$this$indexOfFirst$iv`: FloatArray = $this$asList
         var `index$iv`: Int = 0
         val var5: Int = $this$asList.length

         var var10000: Int
         while (true) {
            if (`index$iv` >= var5) {
               var10000 = -1
               break
            }

            if (java.lang.Float.floatToIntBits(`$this$indexOfFirst$iv`[`index$iv`]) == java.lang.Float.floatToIntBits(element)) {
               var10000 = `index$iv`
               break
            }

            `index$iv`++
         }

         return var10000
      }

      public open operator fun contains(element: Float): Boolean {
         val `$this$any$iv`: FloatArray = $this$asList
         var var4: Int = 0
         val var5: Int = $this$asList.length

         var var10000: Boolean
         while (true) {
            if (var4 >= var5) {
               var10000 = false
               break
            }

            if (java.lang.Float.floatToIntBits(`$this$any$iv`[var4]) == java.lang.Float.floatToIntBits(element)) {
               var10000 = true
               break
            }

            var4++
         }

         return var10000
      }

      public override fun isEmpty(): Boolean {
         return $this$asList.length == 0
      }

      public open operator fun get(index: Int): Float {
         return $this$asList[index]
      }

      public open fun lastIndexOf(element: Float): Int {
         val `$this$indexOfLast$iv`: FloatArray = $this$asList
         var var4: Int = $this$asList.length + -1
         if (0 <= $this$asList.length + -1) {
            do {
               val `index$iv`: Int = var4--
               if (java.lang.Float.floatToIntBits(`$this$indexOfLast$iv`[`index$iv`]) == java.lang.Float.floatToIntBits(element)) {
                  return `index$iv`
               }
            } while (0 <= var4)
         }

         return -1
      }
   }
}

public fun BooleanArray.fill(element: Boolean, fromIndex: Int = 0, toIndex: Int = `$this$fill`.length) {
   Arrays.fill(`$this$fill`, fromIndex, toIndex, element)
}

@SinceKotlin(version = "1.3")
public fun LongArray.copyInto(destination: LongArray, destinationOffset: Int = 0, startIndex: Int = 0, endIndex: Int = `$this$copyInto`.length): LongArray {
   System.arraycopy(`$this$copyInto`, startIndex, destination, destinationOffset, endIndex - startIndex)
   return destination
}

public fun LongArray.toTypedArray(): Array<Long> {
   val result: Array<java.lang.Long> = arrayOfNulls(`$this$toTypedArray`.length)
   var index: Int = 0

   for (var3 in `$this$toTypedArray`.length..index) {
      result[index] = `$this$toTypedArray`[index]
   }

   return result
}

public operator fun <T> Array<Any>.plus(element: Any): Array<Any> {
   val result: Array<Any> = Arrays.copyOf(`$this$plus`, `$this$plus`.length + 1)
   result[`$this$plus`.length] = element
   return (T[])result
}

public fun FloatArray.toSortedSet(): SortedSet<Float> {
   return ArraysKt.toCollection(`$this$toSortedSet`, TreeSet<>())
}

@InlineOnly
@JvmName(name = "copyOfRangeInline")
public inline fun ByteArray.copyOfRange(fromIndex: Int, toIndex: Int): ByteArray {
   val var10000: ByteArray
   if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
      var10000 = ArraysKt.copyOfRange((byte[])`$this$copyOfRange`, fromIndex, toIndex)
   } else {
      if (toIndex > `$this$copyOfRange`.length) {
         throw IndexOutOfBoundsException("toIndex: $toIndex, size: ${`$this$copyOfRange`.length}")
      }

      val var3: ByteArray = Arrays.copyOfRange(`$this$copyOfRange`, fromIndex, toIndex)
      var10000 = var3
   }

   return var10000
}

public operator fun IntArray.plus(elements: IntArray): IntArray {
   val result: IntArray = Arrays.copyOf(`$this$plus`, `$this$plus`.length + elements.length)
   System.arraycopy(elements, 0, result, `$this$plus`.length, elements.length)
   return result
}

public operator fun ShortArray.plus(elements: ShortArray): ShortArray {
   val result: ShortArray = Arrays.copyOf(`$this$plus`, `$this$plus`.length + elements.length)
   System.arraycopy(elements, 0, result, `$this$plus`.length, elements.length)
   return result
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline infix fun CharArray?.contentEquals(other: CharArray?): Boolean {
   return Arrays.equals(`$this$contentEquals`, other)
}

public fun DoubleArray.toTypedArray(): Array<Double> {
   val result: Array<java.lang.Double> = arrayOfNulls(`$this$toTypedArray`.length)
   var index: Int = 0

   for (var3 in `$this$toTypedArray`.length..index) {
      result[index] = `$this$toTypedArray`[index]
   }

   return result
}

@InlineOnly
@SinceKotlin(version = "1.4")
public inline infix fun FloatArray?.contentEquals(other: FloatArray?): Boolean {
   return Arrays.equals(`$this$contentEquals`, other)
}

public fun <T> Array<out Any>.binarySearch(element: Any, comparator: Comparator<in Any>, fromIndex: Int = 0, toIndex: Int = `$this$binarySearch`.length): Int {
   return Arrays.binarySearch(`$this$binarySearch`, fromIndex, toIndex, element, comparator)
}

@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun <T> Array<out Any>?.contentToString(): String {
   val var10000: java.lang.String = Arrays.toString(`$this$contentToString`)
   return var10000
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline infix fun BooleanArray?.contentEquals(other: BooleanArray?): Boolean {
   return Arrays.equals(`$this$contentEquals`, other)
}

@InlineOnly
@SinceKotlin(version = "1.4")
@JvmName(name = "contentDeepToStringNullable")
public inline fun <T> Array<out Any>?.contentDeepToString(): String {
   if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
      return ArraysKt.contentDeepToString(`$this$contentDeepToString`)
   } else {
      val var10000: java.lang.String = Arrays.deepToString(`$this$contentDeepToString`)
      return var10000
   }
}

@InlineOnly
@SinceKotlin(version = "1.4")
public inline infix fun ShortArray?.contentEquals(other: ShortArray?): Boolean {
   return Arrays.equals(`$this$contentEquals`, other)
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun LongArray?.contentToString(): String {
   val var10000: java.lang.String = Arrays.toString(`$this$contentToString`)
   return var10000
}

@InlineOnly
@SinceKotlin(version = "1.4")
public inline infix fun ByteArray?.contentEquals(other: ByteArray?): Boolean {
   return Arrays.equals(`$this$contentEquals`, other)
}

public fun ByteArray.toSortedSet(): SortedSet<Byte> {
   return ArraysKt.toCollection((byte[])`$this$toSortedSet`, TreeSet<>())
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun ShortArray?.contentHashCode(): Int {
   return Arrays.hashCode(`$this$contentHashCode`)
}

public operator fun CharArray.plus(elements: Collection<Char>): CharArray {
   var index: Int = `$this$plus`.length
   val result: CharArray = Arrays.copyOf(`$this$plus`, `$this$plus`.length + elements.size())

   for (element in elements) {
      result[index++] = element
   }

   return result
}

public operator fun IntArray.plus(element: Int): IntArray {
   val result: IntArray = Arrays.copyOf(`$this$plus`, `$this$plus`.length + 1)
   result[`$this$plus`.length] = element
   return result
}

public fun ShortArray.fill(element: Short, fromIndex: Int = 0, toIndex: Int = `$this$fill`.length) {
   Arrays.fill(`$this$fill`, fromIndex, toIndex, element)
}

@OverloadResolutionByLambdaReturnType
@JvmName(name = "sumOfBigDecimal")
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun LongArray.sumOf(selector: (Long) -> BigDecimal): BigDecimal {
   var var10000: BigDecimal = BigDecimal.valueOf(0L)
   var sum: BigDecimal = var10000

   for (element in `$this$sumOf`) {
      var10000 = sum.add(selector(element) as BigDecimal)
      sum = var10000
   }

   return sum
}

public operator fun BooleanArray.plus(elements: Collection<Boolean>): BooleanArray {
   var index: Int = `$this$plus`.length
   val result: BooleanArray = Arrays.copyOf(`$this$plus`, `$this$plus`.length + elements.size())

   for (element in elements) {
      result[index++] = element
   }

   return result
}

@JvmName(name = "sumOfBigDecimal")
@InlineOnly
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
public inline fun ShortArray.sumOf(selector: (Short) -> BigDecimal): BigDecimal {
   var var10000: BigDecimal = BigDecimal.valueOf(0L)
   var sum: BigDecimal = var10000

   for (element in `$this$sumOf`) {
      var10000 = sum.add(selector(element) as BigDecimal)
      sum = var10000
   }

   return sum
}

public fun IntArray.toSortedSet(): SortedSet<Int> {
   return ArraysKt.toCollection((int[])`$this$toSortedSet`, TreeSet<>())
}

public operator fun LongArray.plus(elements: Collection<Long>): LongArray {
   var index: Int = `$this$plus`.length
   val result: LongArray = Arrays.copyOf(`$this$plus`, `$this$plus`.length + elements.size())
   val var4: java.util.Iterator = elements.iterator()

   while (var4.hasNext()) {
      result[index++] = (var4.next() as java.lang.Number).longValue()
   }

   return result
}

public fun LongArray.toSortedSet(): SortedSet<Long> {
   return ArraysKt.toCollection(`$this$toSortedSet`, TreeSet<>())
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun <T> Array<out Any>?.contentHashCode(): Int {
   return Arrays.hashCode(`$this$contentHashCode`)
}

public operator fun IntArray.plus(elements: Collection<Int>): IntArray {
   var index: Int = `$this$plus`.length
   val result: IntArray = Arrays.copyOf(`$this$plus`, `$this$plus`.length + elements.size())
   val var4: java.util.Iterator = elements.iterator()

   while (var4.hasNext()) {
      result[index++] = (var4.next() as java.lang.Number).intValue()
   }

   return result
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline infix fun IntArray?.contentEquals(other: IntArray?): Boolean {
   return Arrays.equals(`$this$contentEquals`, other)
}

public fun BooleanArray.toSortedSet(): SortedSet<Boolean> {
   return ArraysKt.toCollection(`$this$toSortedSet`, TreeSet<>())
}

@OverloadResolutionByLambdaReturnType
@InlineOnly
@JvmName(name = "sumOfBigDecimal")
@SinceKotlin(version = "1.4")
public inline fun IntArray.sumOf(selector: (Int) -> BigDecimal): BigDecimal {
   var var10000: BigDecimal = BigDecimal.valueOf(0L)
   var sum: BigDecimal = var10000

   for (element in `$this$sumOf`) {
      var10000 = sum.add(selector(element) as BigDecimal)
      sum = var10000
   }

   return sum
}

public fun BooleanArray.toTypedArray(): Array<Boolean> {
   val result: Array<java.lang.Boolean> = arrayOfNulls(`$this$toTypedArray`.length)
   var index: Int = 0

   for (var3 in `$this$toTypedArray`.length..index) {
      result[index] = `$this$toTypedArray`[index]
   }

   return result
}

@JvmName(name = "copyOfRangeInline")
@InlineOnly
public inline fun LongArray.copyOfRange(fromIndex: Int, toIndex: Int): LongArray {
   val var10000: LongArray
   if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
      var10000 = ArraysKt.copyOfRange(`$this$copyOfRange`, fromIndex, toIndex)
   } else {
      if (toIndex > `$this$copyOfRange`.length) {
         throw IndexOutOfBoundsException("toIndex: $toIndex, size: ${`$this$copyOfRange`.length}")
      }

      val var3: LongArray = Arrays.copyOfRange(`$this$copyOfRange`, fromIndex, toIndex)
      var10000 = var3
   }

   return var10000
}

public fun IntArray.sort(fromIndex: Int = 0, toIndex: Int = `$this$sort`.length) {
   Arrays.sort(`$this$sort`, fromIndex, toIndex)
}

public fun IntArray.asList(): List<Int> {
   return    // $VF: Compiled from _ArraysJvm.kt
object : AbstractList<Int>, RandomAccess {
      public override fun isEmpty(): Boolean {
         return $this$asList.length == 0
      }

      public open operator fun get(index: Int): Int {
         return $this$asList[index]
      }

      public open operator fun contains(element: Int): Boolean {
         return ArraysKt.contains($this$asList, element)
      }

      public open fun indexOf(element: Int): Int {
         return ArraysKt.indexOf($this$asList, element)
      }

      public open val size: Int
         public open get() {
            return $this$asList.length
         }


      public open fun lastIndexOf(element: Int): Int {
         return ArraysKt.lastIndexOf($this$asList, element)
      }
   }
}

@InlineOnly
public inline fun <T> Array<out Any>.elementAt(index: Int): Any {
   return (T)`$this$elementAt`[index]
}

@InlineOnly
public inline fun LongArray.elementAt(index: Int): Long {
   return `$this$elementAt`[index]
}

@InlineOnly
public inline fun FloatArray.copyOf(newSize: Int): FloatArray {
   val var10000: FloatArray = Arrays.copyOf(`$this$copyOf`, newSize)
   return var10000
}

open fun ArraysKt___ArraysJvmKt() {
}

@InlineOnly
public inline fun ByteArray.copyOf(newSize: Int): ByteArray {
   val var10000: ByteArray = Arrays.copyOf(`$this$copyOf`, newSize)
   return var10000
}

public fun DoubleArray.sort() {
   if (`$this$sort`.length > 1) {
      Arrays.sort(`$this$sort`)
   }
}

public operator fun FloatArray.plus(elements: FloatArray): FloatArray {
   val result: FloatArray = Arrays.copyOf(`$this$plus`, `$this$plus`.length + elements.length)
   System.arraycopy(elements, 0, result, `$this$plus`.length, elements.length)
   return result
}

public fun IntArray.toTypedArray(): Array<Int> {
   val result: Array<Int> = arrayOfNulls(`$this$toTypedArray`.length)
   var index: Int = 0

   for (var3 in `$this$toTypedArray`.length..index) {
      result[index] = `$this$toTypedArray`[index]
   }

   return result
}

public fun BooleanArray.asList(): List<Boolean> {
   return    // $VF: Compiled from _ArraysJvm.kt
object : AbstractList<Boolean>, RandomAccess {
      public open operator fun contains(element: Boolean): Boolean {
         return ArraysKt.contains($this$asList, element)
      }

      public override fun isEmpty(): Boolean {
         return $this$asList.length == 0
      }

      public open fun lastIndexOf(element: Boolean): Int {
         return ArraysKt.lastIndexOf($this$asList, element)
      }

      public open operator fun get(index: Int): Boolean {
         return $this$asList[index]
      }

      public open fun indexOf(element: Boolean): Int {
         return ArraysKt.indexOf($this$asList, element)
      }

      public open val size: Int
         public open get() {
            return $this$asList.length
         }

   }
}

@InlineOnly
public inline fun ShortArray.elementAt(index: Int): Short {
   return `$this$elementAt`[index]
}

public fun ShortArray.toTypedArray(): Array<Short> {
   val result: Array<java.lang.Short> = arrayOfNulls(`$this$toTypedArray`.length)
   var index: Int = 0

   for (var3 in `$this$toTypedArray`.length..index) {
      result[index] = `$this$toTypedArray`[index]
   }

   return result
}

@JvmName(name = "sumOfBigInteger")
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun ShortArray.sumOf(selector: (Short) -> BigInteger): BigInteger {
   var var10000: BigInteger = BigInteger.valueOf(0L)
   var sum: BigInteger = var10000

   for (element in `$this$sumOf`) {
      var10000 = sum.add(selector(element) as BigInteger)
      sum = var10000
   }

   return sum
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun CharArray?.contentHashCode(): Int {
   return Arrays.hashCode(`$this$contentHashCode`)
}

@SinceKotlin(version = "1.1")
@InlineOnly
@LowPriorityInOverloadResolution
@JvmName(name = "contentDeepToStringInline")
public inline fun <T> Array<out Any>.contentDeepToString(): String {
   val var10000: java.lang.String
   if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
      var10000 = ArraysKt.contentDeepToString(`$this$contentDeepToString`)
   } else {
      var10000 = Arrays.deepToString(`$this$contentDeepToString`)
   }

   return var10000
}

public operator fun CharArray.plus(elements: CharArray): CharArray {
   val result: CharArray = Arrays.copyOf(`$this$plus`, `$this$plus`.length + elements.length)
   System.arraycopy(elements, 0, result, `$this$plus`.length, elements.length)
   return result
}

public fun FloatArray.sort(fromIndex: Int = 0, toIndex: Int = `$this$sort`.length) {
   Arrays.sort(`$this$sort`, fromIndex, toIndex)
}

public fun <T : Comparable<Any>> Array<out Any>.toSortedSet(): SortedSet<Any> {
   return ArraysKt.toCollection(`$this$toSortedSet`, TreeSet()) as SortedSet<T>
}

public fun ShortArray.asList(): List<Short> {
   return    // $VF: Compiled from _ArraysJvm.kt
object : AbstractList<Short>, RandomAccess {
      public override fun isEmpty(): Boolean {
         return $this$asList.length == 0
      }

      public open operator fun get(index: Int): Short {
         return $this$asList[index]
      }

      public open fun lastIndexOf(element: Short): Int {
         return ArraysKt.lastIndexOf($this$asList, element)
      }

      public open fun indexOf(element: Short): Int {
         return ArraysKt.indexOf($this$asList, element)
      }

      public open val size: Int
         public open get() {
            return $this$asList.length
         }


      public open operator fun contains(element: Short): Boolean {
         return ArraysKt.contains($this$asList, element)
      }
   }
}

public fun <T> Array<out Any>.asList(): List<Any> {
   val var10000: java.util.List = ArraysUtilJVM.asList(`$this$asList`)
   return var10000
}

public fun ByteArray.sort(fromIndex: Int = 0, toIndex: Int = `$this$sort`.length) {
   Arrays.sort(`$this$sort`, fromIndex, toIndex)
}

@InlineOnly
@JvmName(name = "copyOfRangeInline")
public inline fun FloatArray.copyOfRange(fromIndex: Int, toIndex: Int): FloatArray {
   val var10000: FloatArray
   if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
      var10000 = ArraysKt.copyOfRange(`$this$copyOfRange`, fromIndex, toIndex)
   } else {
      if (toIndex > `$this$copyOfRange`.length) {
         throw IndexOutOfBoundsException("toIndex: $toIndex, size: ${`$this$copyOfRange`.length}")
      }

      val var3: FloatArray = Arrays.copyOfRange(`$this$copyOfRange`, fromIndex, toIndex)
      var10000 = var3
   }

   return var10000
}

public fun LongArray.sort() {
   if (`$this$sort`.length > 1) {
      Arrays.sort(`$this$sort`)
   }
}

@SinceKotlin(version = "1.4")
@JvmName(name = "sumOfBigInteger")
@OverloadResolutionByLambdaReturnType
@InlineOnly
public inline fun FloatArray.sumOf(selector: (Float) -> BigInteger): BigInteger {
   var var10000: BigInteger = BigInteger.valueOf(0L)
   var sum: BigInteger = var10000

   for (element in `$this$sumOf`) {
      var10000 = sum.add(selector(element) as BigInteger)
      sum = var10000
   }

   return sum
}
