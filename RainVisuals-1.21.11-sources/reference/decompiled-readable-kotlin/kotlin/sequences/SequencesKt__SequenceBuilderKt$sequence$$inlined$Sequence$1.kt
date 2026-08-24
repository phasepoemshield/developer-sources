package kotlin.sequences

import kotlin.jvm.functions.Function2

// $VF: Compiled from Sequences.kt
// $VF: local visibility outside of methodSupplier
internal class `SequencesKt__SequenceBuilderKt$sequence$$inlined$Sequence$1` : Sequence<T> {
   public override operator fun iterator(): Iterator<Any> {
      return SequencesKt.iterator(this.$block$inlined)
   }

   fun `SequencesKt__SequenceBuilderKt$sequence$$inlined$Sequence$1`(var1: Function2) {
      this.$block$inlined = var1
   }
}
