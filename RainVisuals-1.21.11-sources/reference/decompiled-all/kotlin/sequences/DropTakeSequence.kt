package kotlin.sequences

// $VF: Compiled from Sequences.kt
internal interface DropTakeSequence<T> : Sequence<T> {
   public abstract fun drop(n: Int): Sequence<Any> {
   }

   public abstract fun take(n: Int): Sequence<Any> {
   }
}
