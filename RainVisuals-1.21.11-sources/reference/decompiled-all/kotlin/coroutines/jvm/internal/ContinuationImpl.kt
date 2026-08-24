package kotlin.coroutines.jvm.internal

import kotlin.coroutines.Continuation
import kotlin.coroutines.ContinuationInterceptor
import kotlin.coroutines.CoroutineContext

// $VF: Compiled from ContinuationImpl.kt
@SinceKotlin(version = "1.3")
internal abstract class ContinuationImpl : BaseContinuationImpl {
   private final var intercepted: Continuation<Any?>?
   private final val _context: CoroutineContext?

   public fun intercepted(): Continuation<Any?> {
      var var10000: Continuation = this.intercepted
      if (this.intercepted == null) {
         run label19@{
            val var4: ContinuationInterceptor = this.context.get(ContinuationInterceptor.Key)
            if (var4 != null) {
               var10000 = var4.interceptContinuation(this)
               if (var10000 != null) {
                  return@label19
               }
            }

            var10000 = this
         }

         this.intercepted = var10000
         var10000 = var10000
      }

      return var10000
   }

   open fun ContinuationImpl(completion: Continuation<Object>?) {
      this(completion, if (completion != null) completion.context else null)
   }

   protected override fun releaseIntercepted() {
      val intercepted: Continuation = this.intercepted
      if (this.intercepted != null && this.intercepted != this) {
         val var10000: CoroutineContext.Element = this.context.get(ContinuationInterceptor.Key)
         (var10000 as ContinuationInterceptor).releaseInterceptedContinuation(intercepted)
      }

      this.intercepted = CompletedContinuation.INSTANCE
   }

   public open val context: CoroutineContext
      public open get() {
         val var10000: CoroutineContext = this._context
         return var10000
      }


   open fun ContinuationImpl(completion: Continuation<Object>?, _context: CoroutineContext?) {
      super(completion)
      this._context = _context
   }
}
