package kotlin.sequences

import kotlin.jvm.internal.markers.KMappedMarker

// $VF: Compiled from Iterables.kt
// $VF: local visibility outside of methodSupplier
internal class `SequencesKt___SequencesKt$asIterable$$inlined$Iterable$1` : KMappedMarker, java.lang.Iterable {
   fun `SequencesKt___SequencesKt$asIterable$$inlined$Iterable$1`(var1: Sequence) {
      this.$this_asIterable$inlined = var1
   }

   public override operator fun iterator(): Iterator<Any> {
      return this.$this_asIterable$inlined.iterator()
   }
}
