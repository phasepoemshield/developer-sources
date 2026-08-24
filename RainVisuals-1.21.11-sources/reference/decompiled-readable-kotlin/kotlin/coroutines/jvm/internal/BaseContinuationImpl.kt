package kotlin.coroutines.jvm.internal

import java.io.Serializable
import kotlin.coroutines.Continuation
import kotlin.coroutines.intrinsics.IntrinsicsKt

// $VF: Compiled from ContinuationImpl.kt
@SinceKotlin(version = "1.3")
internal abstract class BaseContinuationImpl : CoroutineStackFrame, Serializable, Continuation {
   public final val completion: Continuation<Any?>?

   protected open fun releaseIntercepted() {
   }

   open fun BaseContinuationImpl(completion: Continuation<Object>?) {
      this.completion = completion
   }

   public override fun getStackTraceElement(): StackTraceElement? {
      return DebugMetadataKt.getStackTraceElement(this)
   }

   protected abstract fun invokeSuspend(result: Result<Any?>): Any? {
   }

   public override fun toString(): String {
      val var10000: StringBuilder = StringBuilder().append("Continuation at ")
      val var10001: StackTraceElement = this.getStackTraceElement()
      return var10000.append(if (var10001 != null) var10001 else this.getClass().getName()).toString()
   }

   public open fun create(value: Any?, completion: Continuation<*>): Continuation<Unit> {
      throw UnsupportedOperationException("create(Any?;Continuation) has not been overridden")
   }

   public open val callerFrame: CoroutineStackFrame?
      public open get() {
         return this.completion as? CoroutineStackFrame
      }


   public open fun create(completion: Continuation<*>): Continuation<Unit> {
      throw UnsupportedOperationException("create(Continuation) has not been overridden")
   }

   public override fun resumeWith(result: Result<Any?>) {
      var var12: Continuation = this
      var var13: Any = result

      while (true) {
         DebugProbesKt.probeCoroutineResumed(var12)
         val `$this$resumeWith_u24lambda_u240`: BaseContinuationImpl = var12 as BaseContinuationImpl
         val var10000: Continuation = (var12 as BaseContinuationImpl).completion

         var outcome: Any
         try {
            outcome = `$this$resumeWith_u24lambda_u240`.invokeSuspend(var13)
            if (outcome === IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
               return
            }

            outcome = Result.constructor_impl/* $VF was: constructor-impl */(outcome)
         } catch (var11: java.lang.Throwable) {
            outcome = Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var11))
         }

         `$this$resumeWith_u24lambda_u240`.releaseIntercepted()
         if (var10000 !is BaseContinuationImpl) {
            var10000.resumeWith(outcome)
            return
         }

         var12 = var10000
         var13 = outcome
      }
   }
}
