package kotlin.collections

import kotlin.jvm.internal.ArrayIteratorsKt
import kotlin.jvm.internal.markers.KMappedMarker

// $VF: Compiled from Iterables.kt
// $VF: local visibility outside of methodSupplier
internal class `ArraysKt___ArraysKt$asIterable$$inlined$Iterable$4` : KMappedMarker, java.lang.Iterable {
   fun `ArraysKt___ArraysKt$asIterable$$inlined$Iterable$4`(var1: IntArray) {
      this.$this_asIterable$inlined = var1
   }

   public override operator fun iterator(): Iterator<Any> {
      return ArrayIteratorsKt.iterator(this.$this_asIterable$inlined)
   }
}
