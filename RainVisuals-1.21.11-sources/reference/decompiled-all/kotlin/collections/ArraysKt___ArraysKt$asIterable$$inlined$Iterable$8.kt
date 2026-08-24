package kotlin.collections

import kotlin.jvm.internal.ArrayIteratorsKt
import kotlin.jvm.internal.markers.KMappedMarker

// $VF: Compiled from Iterables.kt
// $VF: local visibility outside of methodSupplier
internal class `ArraysKt___ArraysKt$asIterable$$inlined$Iterable$8` : java.lang.Iterable<java.lang.Boolean>, KMappedMarker {
   fun `ArraysKt___ArraysKt$asIterable$$inlined$Iterable$8`(var1: BooleanArray) {
      this.$this_asIterable$inlined = var1
   }

   public override operator fun iterator(): Iterator<Any> {
      return ArrayIteratorsKt.iterator(this.$this_asIterable$inlined)
   }
}
