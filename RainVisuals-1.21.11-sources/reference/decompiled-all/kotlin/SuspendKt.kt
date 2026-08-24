package kotlin

import kotlin.coroutines.Continuation
import kotlin.internal.InlineOnly

// $VF: Compiled from Suspend.kt
@SinceKotlin(version = "1.2")
@InlineOnly
public inline fun <R> suspend(noinline block: (Continuation<Any>) -> Any?): (Continuation<Any>) -> Any? {
   return block
}
