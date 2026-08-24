package kotlin.sequences

import kotlin.jvm.functions.Function2

// $VF: Compiled from Sequences.kt
internal class TransformingIndexedSequence<T, R>(sequence: Sequence<Any>, transformer: (Int, Any) -> Any) : Sequence<R> {
   private final val sequence: Sequence<Any>
   private final val transformer: (Int, Any) -> Any

   public override operator fun iterator(): Iterator<Any> {
      return       // $VF: Compiled from Sequences.kt
object : Iterator<Any> {
         public final val iterator: Iterator<Any> = TransformingIndexedSequence.this.sequence.iterator()
         public final var index: Int

         public override operator fun next(): Any {
            val var10000: Function2 = TransformingIndexedSequence.this.transformer
            val var2: Int = this.index++
            if (var2 < 0) {
               CollectionsKt.throwIndexOverflow()
            }

            return (R)var10000(var2, this.iterator.next())
         }

         public override operator fun hasNext(): Boolean {
            return this.iterator.hasNext()
         }

         override fun remove() {
            throw UnsupportedOperationException("Operation is not supported for read-only collection")
         }
      }
   }

   init {
      this.sequence = sequence
      this.transformer = transformer
   }
}
