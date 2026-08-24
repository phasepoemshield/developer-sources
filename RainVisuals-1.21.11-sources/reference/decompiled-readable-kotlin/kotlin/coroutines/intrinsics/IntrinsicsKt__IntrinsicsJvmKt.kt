@file:JvmMultifileClass
@file:JvmName("IntrinsicsKt")

package kotlin.coroutines.intrinsics

import kotlin.coroutines.Continuation
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.coroutines.jvm.internal.BaseContinuationImpl
import kotlin.coroutines.jvm.internal.ContinuationImpl
import kotlin.coroutines.jvm.internal.DebugProbesKt
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl
import kotlin.internal.InlineOnly
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.functions.Function3
import kotlin.jvm.internal.TypeIntrinsics

// $VF: Compiled from IntrinsicsJvm.kt
@SinceKotlin(version = "1.3")
public fun <T> Continuation<Any>.intercepted(): Continuation<Any> {
   val var10000: ContinuationImpl = `$this$intercepted` as? ContinuationImpl
   if ((`$this$intercepted` as? ContinuationImpl) != null) {
      val var1: Continuation = var10000.intercepted()
      if (var1 != null) {
         return var1
      }
   }

   return `$this$intercepted`
}

@PublishedApi
internal fun <T> ((Continuation<Any>) -> Any?).wrapWithContinuationImpl(completion: Continuation<Any>): Any? {
   return (TypeIntrinsics.beforeCheckcastToFunctionOfArity(`$this$wrapWithContinuationImpl`, 1) as Function1)(
      createSimpleCoroutineForSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt(DebugProbesKt.probeCoroutineCreated(completion))
   )
}

@PublishedApi
internal fun <R, P, T> ((Any, Any, Continuation<Any>) -> Any?).wrapWithContinuationImpl(receiver: Any, param: Any, completion: Continuation<Any>): Any? {
   return (TypeIntrinsics.beforeCheckcastToFunctionOfArity(`$this$wrapWithContinuationImpl`, 3) as Function3)(
      receiver, param, createSimpleCoroutineForSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt(DebugProbesKt.probeCoroutineCreated(completion))
   )
}

@InlineOnly
internal inline fun <R, P, T> ((Any, Any, Continuation<Any>) -> Any?).startCoroutineUninterceptedOrReturn(
   receiver: Any,
   param: Any,
   completion: Continuation<Any>
): Any? {
   return if (`$this$startCoroutineUninterceptedOrReturn` !is BaseContinuationImpl)
      IntrinsicsKt.wrapWithContinuationImpl(`$this$startCoroutineUninterceptedOrReturn`, receiver, param, completion)
      else
      (TypeIntrinsics.beforeCheckcastToFunctionOfArity(`$this$startCoroutineUninterceptedOrReturn`, 3) as Function3)(receiver, param, completion)
   }

@SinceKotlin(version = "1.3")
public fun <R, T> ((Any, Continuation<Any>) -> Any?).createCoroutineUnintercepted(receiver: Any, completion: Continuation<Any>): Continuation<Unit> {
   val probeCompletion: Continuation = DebugProbesKt.probeCoroutineCreated(completion)
   val var10000: Continuation
   if (`$this$createCoroutineUnintercepted` is BaseContinuationImpl) {
      var10000 = (`$this$createCoroutineUnintercepted` as BaseContinuationImpl).create(receiver, probeCompletion)
   } else {
      val `context$iv`: CoroutineContext = probeCompletion.context
      var10000 = if (`context$iv` === EmptyCoroutineContext.INSTANCE)
         IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3(
            probeCompletion, `$this$createCoroutineUnintercepted`, receiver
         )
         else
         IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4(
            probeCompletion, `context$iv`, `$this$createCoroutineUnintercepted`, receiver
         )
      }

   return var10000
}

open fun IntrinsicsKt__IntrinsicsJvmKt() {
}

@PublishedApi
internal fun <R, T> ((Any, Continuation<Any>) -> Any?).wrapWithContinuationImpl(receiver: Any, completion: Continuation<Any>): Any? {
   return (TypeIntrinsics.beforeCheckcastToFunctionOfArity(`$this$wrapWithContinuationImpl`, 2) as Function2)(
      receiver, createSimpleCoroutineForSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt(DebugProbesKt.probeCoroutineCreated(completion))
   )
}

@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun <R, T> ((Any, Continuation<Any>) -> Any?).startCoroutineUninterceptedOrReturn(receiver: Any, completion: Continuation<Any>): Any? {
   return if (`$this$startCoroutineUninterceptedOrReturn` !is BaseContinuationImpl)
      IntrinsicsKt.wrapWithContinuationImpl(`$this$startCoroutineUninterceptedOrReturn`, receiver, completion)
      else
      (TypeIntrinsics.beforeCheckcastToFunctionOfArity(`$this$startCoroutineUninterceptedOrReturn`, 2) as Function2)(receiver, completion)
   }

@SinceKotlin(version = "1.3")
private inline fun <T> createCoroutineFromSuspendFunction(completion: Continuation<Any>, crossinline block: (Continuation<Any>) -> Any?): Continuation<Unit> {
   val context: CoroutineContext = completion.context
   return if (context === EmptyCoroutineContext.INSTANCE)    // $VF: Compiled from IntrinsicsJvm.kt
object : RestrictedContinuationImpl {
      private final var label: Int

      protected override fun invokeSuspend(result: Result<Any?>): Any? {
         var var10000: Any
         when (this.label) {
            0 -> {
               this.label = 1
               ResultKt.throwOnFailure(result)
               var10000 = block(this)
            }
            1 -> {
               this.label = 2
               ResultKt.throwOnFailure(result)
               var10000 = result
            }
            else -> throw IllegalStateException("This coroutine had already completed".toString())
         }

         return var10000
      }
   } else    // $VF: Compiled from IntrinsicsJvm.kt
object : ContinuationImpl {
      private final var label: Int

      protected override fun invokeSuspend(result: Result<Any?>): Any? {
         var var10000: Any
         when (this.label) {
            0 -> {
               this.label = 1
               ResultKt.throwOnFailure(result)
               var10000 = block(this)
            }
            1 -> {
               this.label = 2
               ResultKt.throwOnFailure(result)
               var10000 = result
            }
            else -> throw IllegalStateException("This coroutine had already completed".toString())
         }

         return var10000
      }
   }
}

@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun <T> ((Continuation<Any>) -> Any?).startCoroutineUninterceptedOrReturn(completion: Continuation<Any>): Any? {
   return if (`$this$startCoroutineUninterceptedOrReturn` !is BaseContinuationImpl)
      IntrinsicsKt.wrapWithContinuationImpl(`$this$startCoroutineUninterceptedOrReturn`, completion)
      else
      (TypeIntrinsics.beforeCheckcastToFunctionOfArity(`$this$startCoroutineUninterceptedOrReturn`, 1) as Function1)(completion)
   }

private fun <T> createSimpleCoroutineForSuspendFunction(completion: Continuation<Any>): Continuation<Any> {
   val context: CoroutineContext = completion.context
   return if (context === EmptyCoroutineContext.INSTANCE)    // $VF: Compiled from IntrinsicsJvm.kt
object : RestrictedContinuationImpl {
      protected override fun invokeSuspend(result: Result<Any?>): Any? {
         ResultKt.throwOnFailure(result)
         return result
      }
   } else    // $VF: Compiled from IntrinsicsJvm.kt
object : ContinuationImpl {
      protected override fun invokeSuspend(result: Result<Any?>): Any? {
         ResultKt.throwOnFailure(result)
         return result
      }
   }
}

@SinceKotlin(version = "1.3")
public fun <T> ((Continuation<Any>) -> Any?).createCoroutineUnintercepted(completion: Continuation<Any>): Continuation<Unit> {
   val probeCompletion: Continuation = DebugProbesKt.probeCoroutineCreated(completion)
   val var10000: Continuation
   if (`$this$createCoroutineUnintercepted` is BaseContinuationImpl) {
      var10000 = (`$this$createCoroutineUnintercepted` as BaseContinuationImpl).create(probeCompletion)
   } else {
      val `context$iv`: CoroutineContext = probeCompletion.context
      var10000 = if (`context$iv` === EmptyCoroutineContext.INSTANCE)
         IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$1(
            probeCompletion, `$this$createCoroutineUnintercepted`
         )
         else
         IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$2(
            probeCompletion, `context$iv`, `$this$createCoroutineUnintercepted`
         )
      }

   return var10000
}
