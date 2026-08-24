package kotlin.coroutines

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater
import kotlin.coroutines.intrinsics.CoroutineSingletons
import kotlin.coroutines.intrinsics.IntrinsicsKt
import kotlin.coroutines.jvm.internal.CoroutineStackFrame

// $VF: Compiled from SafeContinuationJvm.kt
@PublishedApi
@SinceKotlin(version = "1.3")
internal class SafeContinuation<T> internal constructor(delegate: Continuation<Any>, initialResult: Any?) : Continuation<T>, CoroutineStackFrame {
   private final var result: Any?
   private final val delegate: Continuation<Any>

   @PublishedApi
   internal constructor(delegate: Continuation<Any>) : this(delegate, CoroutineSingletons.UNDECIDED)
   @PublishedApi
   internal fun getOrThrow(): Any? {
      var result: Any = this.result
      if (this.result === CoroutineSingletons.UNDECIDED) {
         if (RESULT.compareAndSet(this, CoroutineSingletons.UNDECIDED, IntrinsicsKt.getCOROUTINE_SUSPENDED())) {
            return IntrinsicsKt.getCOROUTINE_SUSPENDED()
         }

         result = this.result
      }

      val var10000: Any
      if (result === CoroutineSingletons.RESUMED) {
         var10000 = IntrinsicsKt.getCOROUTINE_SUSPENDED()
      } else {
         if (result is Result.Failure) {
            throw (result as Result.Failure).exception
         }

         var10000 = result
      }

      return var10000
   }

   init {
      this.delegate = delegate
      this.result = initialResult
   }

   public open val context: CoroutineContext
      public open get() {
         return this.delegate.context
      }


   public override fun resumeWith(result: Result<Any>) {
      while (true) {
         if (this.result === CoroutineSingletons.UNDECIDED) {
            if (RESULT.compareAndSet(this, CoroutineSingletons.UNDECIDED, result)) {
               return
            }
         } else {
            if (this.result === IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
               if (!RESULT.compareAndSet(this, IntrinsicsKt.getCOROUTINE_SUSPENDED(), CoroutineSingletons.RESUMED)) {
                  continue
               }

               this.delegate.resumeWith(result)
               return
            }

            throw IllegalStateException("Already resumed")
         }
      }
   }

   public open val callerFrame: CoroutineStackFrame?
      public open get() {
         return this.delegate as? CoroutineStackFrame
      }


   public override fun toString(): String {
      return "SafeContinuation for ${this.delegate}"
   }

   public override fun getStackTraceElement(): StackTraceElement? {
      return null
   }

   // $VF: Compiled from SafeContinuationJvm.kt
   private companion object {
      private final val RESULT: AtomicReferenceFieldUpdater<SafeContinuation<*>, Any>
   }
}
