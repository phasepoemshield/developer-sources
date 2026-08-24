package kotlin.coroutines

import kotlin.contracts.InvocationKind
import kotlin.coroutines.intrinsics.IntrinsicsKt
import kotlin.coroutines.jvm.internal.DebugProbesKt
import kotlin.internal.InlineOnly
import kotlin.jvm.internal.InlineMarker

// $VF: Compiled from Continuation.kt
@SinceKotlin(version = "1.3")
public fun <T> ((Continuation<Any>) -> Any?).startCoroutine(completion: Continuation<Any>) {
   IntrinsicsKt.intercepted(IntrinsicsKt.createCoroutineUnintercepted(`$this$startCoroutine`, completion))
      .resumeWith(Result.constructor_impl/* $VF was: constructor-impl */(Unit.INSTANCE))
   }

@SinceKotlin(version = "1.3")
public fun <T> ((Continuation<Any>) -> Any?).createCoroutine(completion: Continuation<Any>): Continuation<Unit> {
   return SafeContinuation<>(
      IntrinsicsKt.intercepted(IntrinsicsKt.createCoroutineUnintercepted(`$this$createCoroutine`, completion)), IntrinsicsKt.getCOROUTINE_SUSPENDED()
   )
}

@SinceKotlin(version = "1.3")
public fun <R, T> ((Any, Continuation<Any>) -> Any?).startCoroutine(receiver: Any, completion: Continuation<Any>) {
   IntrinsicsKt.intercepted(IntrinsicsKt.createCoroutineUnintercepted(`$this$startCoroutine`, receiver, completion))
      .resumeWith(Result.constructor_impl/* $VF was: constructor-impl */(Unit.INSTANCE))
   }

@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun <T> Continuation(context: CoroutineContext, crossinline resumeWith: (Result<Any>) -> Unit): Continuation<Any> {
   return    // $VF: Compiled from Continuation.kt
object : Continuation<Any> {
      public override fun resumeWith(result: Result<Any>) {
         resumeWith(Result.box_impl/* $VF was: box-impl */(result))
      }

      public open val context: CoroutineContext
         public open get() {
            return context
         }

   }
}

@SinceKotlin(version = "1.3")
@InlineOnly
public final val coroutineContext: CoroutineContext
   public final inline get() {
      throw NotImplementedError("Implemented as intrinsic")
   }


@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun <T> Continuation<Any>.resume(value: Any) {
   `$this$resume`.resumeWith(Result.constructor_impl/* $VF was: constructor-impl */(value))
}

@InlineOnly
@SinceKotlin(version = "1.3")
public suspend inline fun <T> suspendCoroutine(crossinline block: (Continuation<Any>) -> Unit): Any {
   contract {
      callsInPlace(block, InvocationKind.EXACTLY_ONCE)
   }

   InlineMarker.mark(0)
   val safe: SafeContinuation = SafeContinuation(IntrinsicsKt.intercepted(`$completion`))
   block(safe)
   val var10000: Any = safe.getOrThrow()
   if (var10000 === IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
      DebugProbesKt.probeCoroutineSuspended(`$completion`)
   }

   InlineMarker.mark(1)
   return var10000
}

@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun <T> Continuation<Any>.resumeWithException(exception: Throwable) {
   `$this$resumeWithException`.resumeWith(Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(exception)))
}

@SinceKotlin(version = "1.3")
public fun <R, T> ((Any, Continuation<Any>) -> Any?).createCoroutine(receiver: Any, completion: Continuation<Any>): Continuation<Unit> {
   return SafeContinuation<>(
      IntrinsicsKt.intercepted(IntrinsicsKt.createCoroutineUnintercepted(`$this$createCoroutine`, receiver, completion)), IntrinsicsKt.getCOROUTINE_SUSPENDED()
   )
}
