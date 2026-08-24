package kotlin.sequences

import java.util.NoSuchElementException

// $VF: Compiled from Sequences.kt
internal class TakeSequence<T>(sequence: Sequence<Any>, count: Int) : Sequence<T>, DropTakeSequence<T> {
   private final val sequence: Sequence<Any>
   private final val count: Int

   public override operator fun iterator(): Iterator<Any> {
      return       // $VF: Compiled from Sequences.kt
object : Iterator<Any> {
         public final val iterator: Iterator<Any>
         public final var left: Int

         override fun remove() {
            throw UnsupportedOperationException("Operation is not supported for read-only collection")
         }

         public override operator fun next(): Any {
            if (this.left == 0) {
               throw NoSuchElementException()
            } else {
               this.left += -1
               return this.iterator.next()
            }
         }

         {
            this.left = `$receiver`.count
            this.iterator = `$receiver`.sequence.iterator()
         }

         public override operator fun hasNext(): Boolean {
            return this.left > 0 && this.iterator.hasNext()
         }
      }
   }

   public override fun take(n: Int): Sequence<Any> {
      return if (n >= this.count) this else TakeSequence<>(this.sequence, n)
   }

   public override fun drop(n: Int): Sequence<Any> {
      return if (n >= this.count) SequencesKt.emptySequence() else SubSequence<>(this.sequence, n, this.count)
   }

   init {
      this.sequence = sequence
      this.count = count
      if (this.count < 0) {
         throw IllegalArgumentException(("count must be non-negative, but was ${this.count}.").toString())
      }
   }
}
