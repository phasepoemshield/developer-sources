package kotlin

import kotlin.internal.InlineOnly

// $VF: Compiled from UShortArray.kt
@ExperimentalUnsignedTypes
@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun UShortArray(size: Int, init: (Int) -> UShort): UShortArray {
   var var2: Int = 0
   val var3: ShortArray = ShortArray(size)

   while (var2 < size) {
      var3[var2] = (init(var2) as UShort).unbox_impl/* $VF was: unbox-impl */()
      var2++
   }

   return UShortArray.constructor_impl/* $VF was: constructor-impl */(var3)
}

@InlineOnly
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public inline fun ushortArrayOf(elements: UShortArray): UShortArray {
   return elements
}
