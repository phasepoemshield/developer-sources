package kotlin.sequences

// $VF: Compiled from Sequences.kt
internal class DropWhileSequence<T>(sequence: Sequence<Any>, predicate: (Any) -> Boolean) : Sequence<T> {
   private final val predicate: (Any) -> Boolean
   private final val sequence: Sequence<Any>

   init {
      this.sequence = sequence
      this.predicate = predicate
   }

   public override operator fun iterator(): Iterator<Any> {
      return       // $VF: Compiled from Sequences.kt
object : Iterator<Any> {
         public final var nextItem: Any?
         public final val iterator: Iterator<Any> = DropWhileSequence.this.sequence.iterator()
         public final var dropState: Int = -1

         private fun drop() {
            while (this.iterator.hasNext()) {
               val item: Any = this.iterator.next()
               if (!DropWhileSequence.this.predicate((T)item)) {
                  this.nextItem = item
                  this.dropState = 1
                  return
               }
            }

            this.dropState = 0
         }

         override fun remove() {
            throw UnsupportedOperationException("Operation is not supported for read-only collection")
         }

         public override operator fun hasNext(): Boolean {
            if (this.dropState == -1) {
               this.drop()
            }

            return this.dropState == 1 || this.iterator.hasNext()
         }

         public override operator fun next(): Any {
            if (this.dropState == -1) {
               this.drop()
            }

            if (this.dropState == 1) {
               val result: Any = this.nextItem
               this.nextItem = null
               this.dropState = 0
               return (T)result
            } else {
               return this.iterator.next()
            }
         }
      }
   }
}
