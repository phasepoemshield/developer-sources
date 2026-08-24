@file:JvmMultifileClass
@file:JvmName("USequencesKt")

package kotlin.sequences

// $VF: Compiled from _USequences.kt
@SinceKotlin(version = "1.5")
@JvmName(name = "sumOfULong")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
public fun Sequence<ULong>.sum(): ULong {
   var sum: Long = 0L
   val var3: java.util.Iterator = `$this$sum`.iterator()

   while (var3.hasNext()) {
      sum = ULong.constructor_impl/* $VF was: constructor-impl */(sum + (var3.next() as ULong).unbox_impl/* $VF was: unbox-impl */())
   }

   return sum
}

@JvmName(name = "sumOfUInt")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@SinceKotlin(version = "1.5")
public fun Sequence<UInt>.sum(): UInt {
   var sum: Int = 0
   val var2: java.util.Iterator = `$this$sum`.iterator()

   while (var2.hasNext()) {
      sum = UInt.constructor_impl/* $VF was: constructor-impl */(sum + (var2.next() as UInt).unbox_impl/* $VF was: unbox-impl */())
   }

   return sum
}

@JvmName(name = "sumOfUByte")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@SinceKotlin(version = "1.5")
public fun Sequence<UByte>.sum(): UInt {
   var sum: Int = 0
   val var2: java.util.Iterator = `$this$sum`.iterator()

   while (var2.hasNext()) {
      sum = UInt.constructor_impl/* $VF was: constructor-impl */(
         sum + UInt.constructor_impl/* $VF was: constructor-impl */((var2.next() as UByte).unbox_impl/* $VF was: unbox-impl */() and 255)
      )
   }

   return sum
}

@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@SinceKotlin(version = "1.5")
@JvmName(name = "sumOfUShort")
public fun Sequence<UShort>.sum(): UInt {
   var sum: Int = 0
   val var2: java.util.Iterator = `$this$sum`.iterator()

   while (var2.hasNext()) {
      sum = UInt.constructor_impl/* $VF was: constructor-impl */(
         sum + UInt.constructor_impl/* $VF was: constructor-impl */((var2.next() as UShort).unbox_impl/* $VF was: unbox-impl */() and 65535)
      )
   }

   return sum
}

open fun USequencesKt___USequencesKt() {
}
