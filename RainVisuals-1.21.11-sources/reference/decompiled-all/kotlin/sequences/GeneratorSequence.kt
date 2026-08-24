package kotlin.sequences

import java.util.NoSuchElementException
import kotlin.jvm.functions.Function1

// $VF: Compiled from Sequences.kt
private class GeneratorSequence<T>(getInitialValue: () -> Any?, getNextValue: (Any) -> Any?) : Sequence<T> {
   private final val getNextValue: (Any) -> Any?
   private final val getInitialValue: () -> Any?

   public override operator fun iterator(): Iterator<Any> {
      return       // $VF: Compiled from Sequences.kt
object : Iterator<Any> {
         public final var nextState: Int = -2
         public final var nextItem: Any?

         private fun calcNext() {
            var var10001: Any
            if (this.nextState == -2) {
               var10001 = GeneratorSequence.this.getInitialValue()
            } else {
               var10001 = GeneratorSequence.this.getNextValue
               val var10002: Any = this.nextItem
               var10001 = (Function1)var10001(var10002)
            }

            this.nextItem = var10001
            this.nextState = if (this.nextItem == null) 0 else 1
         }

         override fun remove() {
            throw UnsupportedOperationException("Operation is not supported for read-only collection")
         }

         public override operator fun hasNext(): Boolean {
            if (this.nextState < 0) {
               this.calcNext()
            }

            return this.nextState == 1
         }

         public override operator fun next(): Any {
            if (this.nextState < 0) {
               this.calcNext()
            }

            if (this.nextState == 0) {
               throw NoSuchElementException()
            } else {
               val var10000: Any = this.nextItem
               this.nextState = -1
               return (T)var10000
            }
         }
      }
   }

   init {
      this.getInitialValue = getInitialValue
      this.getNextValue = getNextValue
   }
}
