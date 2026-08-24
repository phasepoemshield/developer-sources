package kotlin.sequences

import java.util.NoSuchElementException

// $VF: Compiled from Sequences.kt
internal class TakeWhileSequence<T>(sequence: Sequence<Any>, predicate: (Any) -> Boolean) : Sequence<T> {
   private final val predicate: (Any) -> Boolean
   private final val sequence: Sequence<Any>

   init {
      this.sequence = sequence
      this.predicate = predicate
   }

   public override operator fun iterator(): Iterator<Any> {
      return       // $VF: Compiled from Sequences.kt
object : Iterator<Any> {
         public final val iterator: Iterator<Any> = TakeWhileSequence.this.sequence.iterator()
         public final var nextState: Int = -1
         public final var nextItem: Any?

         private fun calcNext() {
            if (this.iterator.hasNext()) {
               val item: Any = this.iterator.next()
               if (TakeWhileSequence.this.predicate((T)item)) {
                  this.nextState = 1
                  this.nextItem = item
                  return
               }
            }

            this.nextState = 0
         }

         public override operator fun hasNext(): Boolean {
            if (this.nextState == -1) {
               this.calcNext()
            }

            return this.nextState == 1
         }

         override fun remove() {
            throw UnsupportedOperationException("Operation is not supported for read-only collection")
         }

         public override operator fun next(): Any {
            if (this.nextState == -1) {
               this.calcNext()
            }

            if (this.nextState == 0) {
               throw NoSuchElementException()
            } else {
               val result: Any = this.nextItem
               this.nextItem = null
               this.nextState = -1
               return (T)result
            }
         }
      }
   }
}
