package kotlin

import kotlin.internal.InlineOnly

// $VF: Compiled from UIntArray.kt
@InlineOnly
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public inline fun UIntArray(size: Int, init: (Int) -> UInt): UIntArray {
   var var2: Int = 0
   val var3: IntArray = IntArray(size)

   while (var2 < size) {
      var3[var2] = (init(var2) as UInt).unbox_impl/* $VF was: unbox-impl */()
      var2++
   }

   return UIntArray.constructor_impl/* $VF was: constructor-impl */(var3)
}

@SinceKotlin(version = "1.3")
@InlineOnly
@ExperimentalUnsignedTypes
public inline fun uintArrayOf(elements: UIntArray): UIntArray {
   return elements
}
