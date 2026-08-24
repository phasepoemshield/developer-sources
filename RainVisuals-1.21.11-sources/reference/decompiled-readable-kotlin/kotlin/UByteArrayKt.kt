package kotlin

import kotlin.internal.InlineOnly

// $VF: Compiled from UByteArray.kt
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@InlineOnly
public inline fun ubyteArrayOf(elements: UByteArray): UByteArray {
   return elements
}

@InlineOnly
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public inline fun UByteArray(size: Int, init: (Int) -> UByte): UByteArray {
   var var2: Int = 0
   val var3: ByteArray = ByteArray(size)

   while (var2 < size) {
      var3[var2] = (init(var2) as UByte).unbox_impl/* $VF was: unbox-impl */()
      var2++
   }

   return UByteArray.constructor_impl/* $VF was: constructor-impl */(var3)
}
