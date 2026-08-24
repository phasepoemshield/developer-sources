package kotlin.sequences

// $VF: Compiled from Sequences.kt
internal class IndexingSequence<T>(sequence: Sequence<Any>) : Sequence<IndexedValue<? extends T>> {
   private final val sequence: Sequence<Any>

   init {
      this.sequence = sequence
   }

   public override operator fun iterator(): Iterator<IndexedValue<Any>> {
      return (java.util.Iterator<IndexedValue<T>>)      // $VF: Compiled from Sequences.kt
object : Iterator<IndexedValue<Any>> {
         public final val iterator: Iterator<Any>
         public final var index: Int

         public override operator fun hasNext(): Boolean {
            return this.iterator.hasNext()
         }

         override fun remove() {
            throw UnsupportedOperationException("Operation is not supported for read-only collection")
         }

         {
            this.iterator = `$receiver`.sequence.iterator()
         }

         public open operator fun next(): IndexedValue<Any> {
            val var10000: IndexedValue = IndexedValue
            val var2: Int = this.index++
            if (var2 < 0) {
               CollectionsKt.throwIndexOverflow()
            }

            var10000./* $VF: Unable to resugar constructor */<init>(var2, this.iterator.next())
            return var10000
         }
      }
   }
}
