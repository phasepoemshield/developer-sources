package kotlin

import kotlin.coroutines.Continuation
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.coroutines.intrinsics.IntrinsicsKt
import kotlin.coroutines.jvm.internal.BaseContinuationImpl
import kotlin.coroutines.jvm.internal.DebugProbesKt
import kotlin.jvm.functions.Function3
import kotlin.jvm.internal.TypeIntrinsics

// $VF: Compiled from DeepRecursive.kt
private class DeepRecursiveScopeImpl<T, R>(block: (DeepRecursiveScope<Any, Any>, Any, Continuation<Any>) -> Any?, value: Any) : DeepRecursiveScope(),
   Continuation<R> {
   private final var value: Any?
   private final var result: Result<Any?>
   private final var function: (DeepRecursiveScope<*, *>, Any?, Continuation<Any?>) -> Any?
   private final var cont: Continuation<Any?>?

   public override fun resumeWith(result: Result<Any>) {
      this.cont = null
      this.result = result
   }

   public fun runCallLoop(): Any {
      while (true) {
         val result: Any = this.result
         if (this.cont == null) {
            val var8: Any = this.result
            ResultKt.throwOnFailure(this.result)
            return (R)var8
         }

         val cont: Continuation = this.cont
         if (Result.equals_impl0/* $VF was: equals-impl0 */(DeepRecursiveKt.access$getUNDEFINED_RESULT$p(), result)) {
            var var7: Any
            try {
               val e: Any = this.value
               var7 = if (this.function !is BaseContinuationImpl)
                  IntrinsicsKt.wrapWithContinuationImpl(
                     (Function3<? super DeepRecursiveScopeImpl<T, R>, ? super Object, ? super Continuation<? super Object>, ? extends Object>)this.function,
                     this,
                     this.value,
                     cont
                  )
                  else
                  (TypeIntrinsics.beforeCheckcastToFunctionOfArity(this.function, 3) as Function3)(this, e, cont)
               } catch (var6: java.lang.Throwable) {
               cont.resumeWith(Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var6)))
            }

            if (var7 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
               cont.resumeWith(Result.constructor_impl/* $VF was: constructor-impl */(var7))
            }
         } else {
            this.result = DeepRecursiveKt.access$getUNDEFINED_RESULT$p()
            cont.resumeWith(result)
         }
      }
   }

   public override suspend fun callRecursive(value: Any): Any {
      this.cont = `$completion`
      this.value = value
      val var10000: Any = IntrinsicsKt.getCOROUTINE_SUSPENDED()
      if (var10000 === IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
         DebugProbesKt.probeCoroutineSuspended(`$completion`)
      }

      return var10000
   }

   private fun crossFunctionCompletion(currentFunction: (DeepRecursiveScope<*, *>, Any?, Continuation<Any?>) -> Any?, cont: Continuation<Any?>): Continuation<
         Any?
      > {
      return DeepRecursiveScopeImpl$crossFunctionCompletion$$inlined$Continuation$1(EmptyCoroutineContext.INSTANCE, this, currentFunction, cont)
   }

   public override suspend fun <U, S> DeepRecursiveFunction<Any, Any>.callRecursive(value: Any): Any {
      var var10000: Any = `$this$callRecursive`.block
      val `$this$callRecursive_u24lambda_u242_u24lambda_u241`: DeepRecursiveScopeImpl = this
      val currentFunction: Function3 = this.function
      if (var10000 != this.function) {
         `$this$callRecursive_u24lambda_u242_u24lambda_u241`.function = (Function3<? super DeepRecursiveScope<?, ?>, Object, ? super Continuation<Object>, ? extends Object>)var10000
         `$this$callRecursive_u24lambda_u242_u24lambda_u241`.cont = `$this$callRecursive_u24lambda_u242_u24lambda_u241`.crossFunctionCompletion(
            currentFunction, `$completion`
         )
      } else {
         `$this$callRecursive_u24lambda_u242_u24lambda_u241`.cont = `$completion`
      }

      `$this$callRecursive_u24lambda_u242_u24lambda_u241`.value = value
      var10000 = IntrinsicsKt.getCOROUTINE_SUSPENDED()
      if (var10000 === IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
         DebugProbesKt.probeCoroutineSuspended(`$completion`)
      }

      return var10000
   }

   init {
      this.function = block
      this.value = value
      this.cont = this as Continuation<Object>
      this.result = DeepRecursiveKt.access$getUNDEFINED_RESULT$p()
   }

   public open val context: CoroutineContext
      public open get() {
         return EmptyCoroutineContext.INSTANCE
      }

}
