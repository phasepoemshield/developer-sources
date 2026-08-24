package kotlin.sequences

import java.util.NoSuchElementException
import kotlin.coroutines.Continuation
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.coroutines.intrinsics.IntrinsicsKt
import kotlin.coroutines.jvm.internal.DebugProbesKt
import kotlin.jvm.internal.markers.KMappedMarker

// $VF: Compiled from SequenceBuilder.kt
private class SequenceBuilderIterator<T> : SequenceScope<T>, Continuation, KMappedMarker, java.util.Iterator {
   private final var nextValue: Any?
   private final var nextIterator: Iterator<Any>?
   public final var nextStep: Continuation<Unit>?
   private final var state: Int

   public override suspend fun yieldAll(iterator: Iterator<Any>) {
      if (!iterator.hasNext()) {
         return Unit.INSTANCE
      } else {
         this.nextIterator = iterator
         this.state = 2
         this.nextStep = `$completion`
         val var10000: Any = IntrinsicsKt.getCOROUTINE_SUSPENDED()
         if (var10000 === IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(`$completion`)
         }

         return if (var10000 === IntrinsicsKt.getCOROUTINE_SUSPENDED()) var10000 else Unit.INSTANCE
      }
   }

   private fun exceptionalState(): Throwable {
      var var10000: java.lang.Throwable
      when (this.state) {
         4 -> var10000 = NoSuchElementException()
         5 -> var10000 = IllegalStateException("Iterator has failed.")
         else -> var10000 = IllegalStateException("Unexpected state of the iterator: ${this.state}")
      }

      return var10000
   }

   private fun nextNotReady(): Any {
      if (!this.hasNext()) {
         throw NoSuchElementException()
      } else {
         return this.next()
      }
   }

   public open val context: CoroutineContext
      public open get() {
         return EmptyCoroutineContext.INSTANCE
      }


   public override suspend fun yield(value: Any) {
      this.nextValue = (T)value
      this.state = 3
      this.nextStep = `$completion`
      val var10000: Any = IntrinsicsKt.getCOROUTINE_SUSPENDED()
      if (var10000 === IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
         DebugProbesKt.probeCoroutineSuspended(`$completion`)
      }

      return if (var10000 === IntrinsicsKt.getCOROUTINE_SUSPENDED()) var10000 else Unit.INSTANCE
   }

   public override operator fun hasNext(): Boolean {
      while (true) {
         when (this.state) {
            1 -> {
               val var10000: java.util.Iterator = this.nextIterator
               if (var10000.hasNext()) {
                  this.state = 2
                  return true
               }

               this.nextIterator = null
            }
            0 -> {
               this.state = 5
               val var2: Continuation = this.nextStep
               this.nextStep = null
               var2.resumeWith(Result.constructor_impl/* $VF was: constructor-impl */(Unit.INSTANCE))
               continue
            }
            2, 3 -> return true
            4 -> return false
            else -> throw this.exceptionalState()
         }
      }
   }

   public override operator fun next(): Any {
      when (this.state) {
         0, 1 -> return this.nextNotReady()
         2 -> {
            this.state = 1
            val var10000: java.util.Iterator = this.nextIterator
            return (T)var10000.next()
         }
         3 -> {
            this.state = 0
            val result: Any = this.nextValue
            this.nextValue = null
            return (T)result
         }
         else -> throw this.exceptionalState()
      }
   }

   public override fun resumeWith(result: Result<Unit>) {
      ResultKt.throwOnFailure(result)
      this.state = 4
   }

   override fun remove() {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }
}
