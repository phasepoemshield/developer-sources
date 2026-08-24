package kotlin.sequences

// $VF: Compiled from Sequences.kt
internal class TransformingSequence<T, R>(sequence: Sequence<Any>, transformer: (Any) -> Any) : Sequence<R> {
   private final val sequence: Sequence<Any>
   private final val transformer: (Any) -> Any

   init {
      this.sequence = sequence
      this.transformer = transformer
   }

   internal fun <E> flatten(iterator: (Any) -> Iterator<Any>): Sequence<Any> {
      return FlatteningSequence<>(this.sequence, this.transformer, iterator)
   }

   public override operator fun iterator(): Iterator<Any> {
      return       // $VF: Compiled from Sequences.kt
object : Iterator<Any> {
         public final val iterator: Iterator<Any> = TransformingSequence.this.sequence.iterator()

         override fun remove() {
            throw UnsupportedOperationException("Operation is not supported for read-only collection")
         }

         public override operator fun hasNext(): Boolean {
            return this.iterator.hasNext()
         }

         public override operator fun next(): Any {
            return TransformingSequence.this.transformer(this.iterator.next())
         }
      }
   }
}
