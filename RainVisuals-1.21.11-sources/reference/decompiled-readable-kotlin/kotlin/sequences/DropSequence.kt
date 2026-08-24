package kotlin.sequences

// $VF: Compiled from Sequences.kt
internal class DropSequence<T>(sequence: Sequence<Any>, count: Int) : DropTakeSequence, DropTakeSequence<T> {
   private final val sequence: Sequence<Any>
   private final val count: Int

   public override fun take(n: Int): Sequence<Any> {
      return if (this.count + n < 0) TakeSequence<>(this, n) else SubSequence<>(this.sequence, this.count, this.count + n)
   }

   public override fun drop(n: Int): Sequence<Any> {
      return if (this.count + n < 0) DropSequence<>(this, n) else DropSequence<>(this.sequence, this.count + n)
   }

   init {
      this.sequence = sequence
      this.count = count
      if (this.count < 0) {
         throw IllegalArgumentException(("count must be non-negative, but was ${this.count}.").toString())
      }
   }

   public override operator fun iterator(): Iterator<Any> {
      return       // $VF: Compiled from Sequences.kt
object : Iterator<Any> {
         public final val iterator: Iterator<Any>
         public final var left: Int

         public override operator fun hasNext(): Boolean {
            this.drop()
            return this.iterator.hasNext()
         }

         override fun remove() {
            throw UnsupportedOperationException("Operation is not supported for read-only collection")
         }

         {
            this.iterator = `$receiver`.sequence.iterator()
            this.left = `$receiver`.count
         }

         private fun drop() {
            while (this.left > 0 && this.iterator.hasNext()) {
               this.iterator.next()
               this.left += -1
            }
         }

         public override operator fun next(): Any {
            this.drop()
            return this.iterator.next()
         }
      }
   }
}
