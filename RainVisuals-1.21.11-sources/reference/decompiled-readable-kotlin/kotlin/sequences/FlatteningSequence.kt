package kotlin.sequences

import java.util.NoSuchElementException

// $VF: Compiled from Sequences.kt
internal class FlatteningSequence<T, R, E>(sequence: Sequence<Any>, transformer: (Any) -> Any, iterator: (Any) -> Iterator<Any>) : Sequence<E> {
   private final val sequence: Sequence<Any>
   private final val transformer: (Any) -> Any
   private final val iterator: (Any) -> Iterator<Any>

   public override operator fun iterator(): Iterator<Any> {
      return       // $VF: Compiled from Sequences.kt
object : Iterator<Any> {
         public final val iterator: Iterator<Any> = FlatteningSequence.this.sequence.iterator()
         public final var itemIterator: Iterator<Any>?

         override fun remove() {
            throw UnsupportedOperationException("Operation is not supported for read-only collection")
         }

         public override operator fun next(): Any {
            if (!this.ensureItemIterator()) {
               throw NoSuchElementException()
            } else {
               val var10000: java.util.Iterator = this.itemIterator
               return (E)var10000.next()
            }
         }

         private fun ensureItemIterator(): Boolean {
            if (this.itemIterator != null && !this.itemIterator.hasNext()) {
               this.itemIterator = null
            }

            while (this.itemIterator == null) {
               if (!this.iterator.hasNext()) {
                  return false
               }

               val nextItemIterator: java.util.Iterator = FlatteningSequence.this.iterator(FlatteningSequence.this.transformer(this.iterator.next()))
               if (nextItemIterator.hasNext()) {
                  this.itemIterator = nextItemIterator
                  return true
               }
            }

            return true
         }

         public override operator fun hasNext(): Boolean {
            return this.ensureItemIterator()
         }
      }
   }

   init {
      this.sequence = sequence
      this.transformer = transformer
      this.iterator = iterator
   }
}
