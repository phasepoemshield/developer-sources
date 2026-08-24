package kotlin.sequences

// $VF: Compiled from Sequences.kt
internal class DistinctSequence<T, K>(source: Sequence<Any>, keySelector: (Any) -> Any) : Sequence<T> {
   private final val keySelector: (Any) -> Any
   private final val source: Sequence<Any>

   public override operator fun iterator(): Iterator<Any> {
      return DistinctIterator<>(this.source.iterator(), this.keySelector) as MutableIterator<T>
   }

   init {
      this.source = source
      this.keySelector = keySelector
   }
}
