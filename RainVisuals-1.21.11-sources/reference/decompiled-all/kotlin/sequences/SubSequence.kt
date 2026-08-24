package kotlin.sequences

import java.util.NoSuchElementException

// $VF: Compiled from Sequences.kt
internal class SubSequence<T>(sequence: Sequence<Any>, startIndex: Int, endIndex: Int) : Sequence<T>, DropTakeSequence<T> {
   private final val endIndex: Int
   private final val startIndex: Int
   private final val sequence: Sequence<Any>

   private final val count: Int
      private final get() {
         return this.endIndex - this.startIndex
      }


   init {
      this.sequence = sequence
      this.startIndex = startIndex
      this.endIndex = endIndex
      if (this.startIndex < 0) {
         throw IllegalArgumentException(("startIndex should be non-negative, but is ${this.startIndex}").toString())
      } else if (this.endIndex < 0) {
         throw IllegalArgumentException(("endIndex should be non-negative, but is ${this.endIndex}").toString())
      } else if (this.endIndex < this.startIndex) {
         throw IllegalArgumentException(("endIndex should be not less than startIndex, but was ${this.endIndex} < ${this.startIndex}").toString())
      }
   }

   public override fun take(n: Int): Sequence<Any> {
      return if (n >= this.count) this else SubSequence<>(this.sequence, this.startIndex, this.startIndex + n)
   }

   public override fun drop(n: Int): Sequence<Any> {
      return if (n >= this.count) SequencesKt.emptySequence() else SubSequence<>(this.sequence, this.startIndex + n, this.endIndex)
   }

   public override operator fun iterator(): Iterator<Any> {
      return       // $VF: Compiled from Sequences.kt
object : Iterator<Any> {
         public final var position: Int
         public final val iterator: Iterator<Any> = SubSequence.this.sequence.iterator()

         public override operator fun next(): Any {
            this.drop()
            if (this.position >= SubSequence.this.endIndex) {
               throw NoSuchElementException()
            } else {
               val var1: Int = this.position++
               return this.iterator.next()
            }
         }

         public override operator fun hasNext(): Boolean {
            this.drop()
            return this.position < SubSequence.this.endIndex && this.iterator.hasNext()
         }

         private fun drop() {
            while (this.position < SubSequence.this.startIndex && this.iterator.hasNext()) {
               this.iterator.next()
               val var1: Int = this.position++
            }
         }

         override fun remove() {
            throw UnsupportedOperationException("Operation is not supported for read-only collection")
         }
      }
   }
}
