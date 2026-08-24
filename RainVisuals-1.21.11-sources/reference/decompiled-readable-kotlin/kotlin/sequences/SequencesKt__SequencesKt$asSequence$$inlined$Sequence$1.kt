package kotlin.sequences

// $VF: Compiled from Sequences.kt
// $VF: local visibility outside of methodSupplier
internal class `SequencesKt__SequencesKt$asSequence$$inlined$Sequence$1` : Sequence<T> {
   fun `SequencesKt__SequencesKt$asSequence$$inlined$Sequence$1`(var1: java.util.Iterator) {
      this.$this_asSequence$inlined = var1
   }

   public override operator fun iterator(): Iterator<Any> {
      return this.$this_asSequence$inlined
   }
}
