package kotlin.coroutines.jvm.internal

import kotlin.coroutines.Continuation
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext

// $VF: Compiled from ContinuationImpl.kt
@SinceKotlin(version = "1.3")
internal abstract class RestrictedContinuationImpl : BaseContinuationImpl {
   public open val context: CoroutineContext
      public open get() {
         return EmptyCoroutineContext.INSTANCE
      }


   open fun RestrictedContinuationImpl(completion: Continuation<Object>?) {
      super(completion)
      if (completion != null) {
         if (completion.context != EmptyCoroutineContext.INSTANCE) {
            throw IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString())
         }
      }
   }
}
