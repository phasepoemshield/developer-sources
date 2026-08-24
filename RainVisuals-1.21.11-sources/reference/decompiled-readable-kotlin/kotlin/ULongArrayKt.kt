package kotlin

import kotlin.internal.InlineOnly

// $VF: Compiled from ULongArray.kt
@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public inline fun ulongArrayOf(elements: ULongArray): ULongArray {
   return elements
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun ULongArray(size: Int, init: (Int) -> ULong): ULongArray {
   var var2: Int = 0
   val var3: LongArray = LongArray(size)

   while (var2 < size) {
      var3[var2] = (init(var2) as ULong).unbox_impl/* $VF was: unbox-impl */()
      var2++
   }

   return ULongArray.constructor_impl/* $VF was: constructor-impl */(var3)
}
