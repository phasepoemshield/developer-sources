package kotlin.coroutines.jvm.internal

import kotlin.coroutines.Continuation
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext

// $VF: Compiled from RunSuspend.kt
private class RunSuspend : Continuation<Unit> {
   public final var result: Result<Unit>?

   public fun await() {
      synchronized (this) {
         while (true) {
            if (this.result != null) {
               ResultKt.throwOnFailure(this.result.unbox_impl/* $VF was: unbox-impl */())
               return
            }

            this.wait()
         }
      }
   }

   public open val context: CoroutineContext
      public open get() {
         return EmptyCoroutineContext.INSTANCE
      }


   public override fun resumeWith(result: Result<Unit>) {
      synchronized (this) {
         this.result = Result.box_impl/* $VF was: box-impl */(result)
         this.notifyAll()
      }
   }
}
