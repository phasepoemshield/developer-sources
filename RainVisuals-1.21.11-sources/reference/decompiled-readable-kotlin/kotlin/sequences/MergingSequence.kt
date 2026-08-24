package kotlin.sequences

// $VF: Compiled from Sequences.kt
internal class MergingSequence<T1, T2, V>(sequence1: Sequence<Any>, sequence2: Sequence<Any>, transform: (Any, Any) -> Any) : Sequence<V> {
   private final val sequence2: Sequence<Any>
   private final val transform: (Any, Any) -> Any
   private final val sequence1: Sequence<Any>

   init {
      this.sequence1 = sequence1
      this.sequence2 = sequence2
      this.transform = transform
   }

   public override operator fun iterator(): Iterator<Any> {
      return       // $VF: Compiled from Sequences.kt
object : Iterator<Any> {
         public final val iterator1: Iterator<Any> = MergingSequence.this.sequence1.iterator()
         public final val iterator2: Iterator<Any> = MergingSequence.this.sequence2.iterator()

         override fun remove() {
            throw UnsupportedOperationException("Operation is not supported for read-only collection")
         }

         public override operator fun hasNext(): Boolean {
            return this.iterator1.hasNext() && this.iterator2.hasNext()
         }

         public override operator fun next(): Any {
            return MergingSequence.this.transform(this.iterator1.next(), this.iterator2.next())
         }
      }
   }
}
