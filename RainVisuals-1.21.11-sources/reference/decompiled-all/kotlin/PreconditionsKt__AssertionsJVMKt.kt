@file:JvmMultifileClass
@file:JvmName("PreconditionsKt")

package kotlin

import kotlin.internal.InlineOnly

// $VF: Compiled from AssertionsJVM.kt
open fun PreconditionsKt__AssertionsJVMKt() {
}

@InlineOnly
public inline fun assert(value: Boolean) {
   if (_Assertions.ENABLED && !value) {
      throw AssertionError("Assertion failed")
   }
}

@InlineOnly
public inline fun assert(value: Boolean, lazyMessage: () -> Any) {
   if (_Assertions.ENABLED && !value) {
      throw AssertionError(lazyMessage())
   }
}
