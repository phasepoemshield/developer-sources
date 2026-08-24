@file:JvmMultifileClass
@file:JvmName("UCollectionsKt")

package kotlin.collections

// $VF: Compiled from _UCollections.kt
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public fun Collection<UInt>.toUIntArray(): UIntArray {
   val result: IntArray = UIntArray.constructor_impl/* $VF was: constructor-impl */(`$this$toUIntArray`.size())
   var index: Int = 0
   val var3: java.util.Iterator = `$this$toUIntArray`.iterator()

   while (var3.hasNext()) {
      UIntArray.set_VXSXFK8/* $VF was: set-VXSXFK8 */(result, index++, (var3.next() as UInt).unbox_impl/* $VF was: unbox-impl */())
   }

   return result
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public fun Collection<UByte>.toUByteArray(): UByteArray {
   val result: ByteArray = UByteArray.constructor_impl/* $VF was: constructor-impl */(`$this$toUByteArray`.size())
   var index: Int = 0
   val var3: java.util.Iterator = `$this$toUByteArray`.iterator()

   while (var3.hasNext()) {
      UByteArray.set_VurrAj0/* $VF was: set-VurrAj0 */(result, index++, (var3.next() as UByte).unbox_impl/* $VF was: unbox-impl */())
   }

   return result
}

@SinceKotlin(version = "1.5")
@JvmName(name = "sumOfULong")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
public fun Iterable<ULong>.sum(): ULong {
   var sum: Long = 0L
   val var3: java.util.Iterator = `$this$sum`.iterator()

   while (var3.hasNext()) {
      sum = ULong.constructor_impl/* $VF was: constructor-impl */(sum + (var3.next() as ULong).unbox_impl/* $VF was: unbox-impl */())
   }

   return sum
}

@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@SinceKotlin(version = "1.5")
@JvmName(name = "sumOfUShort")
public fun Iterable<UShort>.sum(): UInt {
   var sum: Int = 0
   val var2: java.util.Iterator = `$this$sum`.iterator()

   while (var2.hasNext()) {
      sum = UInt.constructor_impl/* $VF was: constructor-impl */(
         sum + UInt.constructor_impl/* $VF was: constructor-impl */((var2.next() as UShort).unbox_impl/* $VF was: unbox-impl */() and 65535)
      )
   }

   return sum
}

@JvmName(name = "sumOfUByte")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@SinceKotlin(version = "1.5")
public fun Iterable<UByte>.sum(): UInt {
   var sum: Int = 0
   val var2: java.util.Iterator = `$this$sum`.iterator()

   while (var2.hasNext()) {
      sum = UInt.constructor_impl/* $VF was: constructor-impl */(
         sum + UInt.constructor_impl/* $VF was: constructor-impl */((var2.next() as UByte).unbox_impl/* $VF was: unbox-impl */() and 255)
      )
   }

   return sum
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public fun Collection<ULong>.toULongArray(): ULongArray {
   val result: LongArray = ULongArray.constructor_impl/* $VF was: constructor-impl */(`$this$toULongArray`.size())
   var index: Int = 0
   val var3: java.util.Iterator = `$this$toULongArray`.iterator()

   while (var3.hasNext()) {
      ULongArray.set_k8EXiF4/* $VF was: set-k8EXiF4 */(result, index++, (var3.next() as ULong).unbox_impl/* $VF was: unbox-impl */())
   }

   return result
}

@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@SinceKotlin(version = "1.5")
@JvmName(name = "sumOfUInt")
public fun Iterable<UInt>.sum(): UInt {
   var sum: Int = 0
   val var2: java.util.Iterator = `$this$sum`.iterator()

   while (var2.hasNext()) {
      sum = UInt.constructor_impl/* $VF was: constructor-impl */(sum + (var2.next() as UInt).unbox_impl/* $VF was: unbox-impl */())
   }

   return sum
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public fun Collection<UShort>.toUShortArray(): UShortArray {
   val result: ShortArray = UShortArray.constructor_impl/* $VF was: constructor-impl */(`$this$toUShortArray`.size())
   var index: Int = 0
   val var3: java.util.Iterator = `$this$toUShortArray`.iterator()

   while (var3.hasNext()) {
      UShortArray.set_01HTLdE/* $VF was: set-01HTLdE */(result, index++, (var3.next() as UShort).unbox_impl/* $VF was: unbox-impl */())
   }

   return result
}

open fun UCollectionsKt___UCollectionsKt() {
}
