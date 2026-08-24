@file:JvmMultifileClass
@file:JvmName("IntrinsicsKt")

package kotlin.coroutines.intrinsics

import kotlin.contracts.InvocationKind
import kotlin.coroutines.Continuation
import kotlin.internal.InlineOnly

// $VF: Compiled from Intrinsics.kt
@SinceKotlin(version = "1.3")
public final val COROUTINE_SUSPENDED: Any
   public final get() {
      return CoroutineSingletons.COROUTINE_SUSPENDED
   }


@InlineOnly
@SinceKotlin(version = "1.3")
public suspend inline fun <T> suspendCoroutineUninterceptedOrReturn(crossinline block: (Continuation<Any>) -> Any?): Any {
   contract {
      callsInPlace(block, InvocationKind.EXACTLY_ONCE)
   }

   throw NotImplementedError("Implementation of suspendCoroutineUninterceptedOrReturn is intrinsic")
}

open fun IntrinsicsKt__IntrinsicsKt() {
}
