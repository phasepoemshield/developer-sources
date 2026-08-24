package kotlin.sequences

import java.util.NoSuchElementException

// $VF: Compiled from Sequences.kt
internal class FilteringSequence<T>(sequence: Sequence<Any>, sendWhen: Boolean = true, predicate: (Any) -> Boolean) : Sequence<T> {
   private final val sequence: Sequence<Any>
   private final val sendWhen: Boolean
   private final val predicate: (Any) -> Boolean

   public override operator fun iterator(): Iterator<Any> {
      return       // $VF: Compiled from Sequences.kt
object : Iterator<Any> {
         public final val iterator: Iterator<Any> = FilteringSequence.this.sequence.iterator()
         public final var nextItem: Any?
         public final var nextState: Int = -1

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

         private fun calcNext() {
            while (this.iterator.hasNext()) {
               val item: Any = this.iterator.next()
               if (FilteringSequence.this.predicate((T)item) == FilteringSequence.this.sendWhen) {
                  this.nextItem = item
                  this.nextState = 1
                  return
               }
            }

            this.nextState = 0
         }
      }
   }

   init {
      super()
      this.sequence = sequence
      this.sendWhen = sendWhen
      this.predicate = predicate
   }
}
