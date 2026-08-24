package kotlin.collections

import kotlin.jvm.internal.ArrayIteratorsKt
import kotlin.jvm.internal.markers.KMappedMarker

// $VF: Compiled from Iterables.kt
// $VF: local visibility outside of methodSupplier
internal class `ArraysKt___ArraysKt$asIterable$$inlined$Iterable$6` : java.lang.Iterable<java.lang.Float>, KMappedMarker {
   fun `ArraysKt___ArraysKt$asIterable$$inlined$Iterable$6`(var1: FloatArray) {
      this.$this_asIterable$inlined = var1
   }

   public override operator fun iterator(): Iterator<Any> {
      return ArrayIteratorsKt.iterator(this.$this_asIterable$inlined)
   }
}
