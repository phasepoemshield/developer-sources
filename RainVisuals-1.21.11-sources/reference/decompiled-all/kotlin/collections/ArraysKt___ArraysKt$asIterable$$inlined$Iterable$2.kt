package kotlin.collections

import kotlin.jvm.internal.ArrayIteratorsKt
import kotlin.jvm.internal.markers.KMappedMarker

// $VF: Compiled from Iterables.kt
// $VF: local visibility outside of methodSupplier
internal class `ArraysKt___ArraysKt$asIterable$$inlined$Iterable$2` : KMappedMarker, java.lang.Iterable {
   public override operator fun iterator(): Iterator<Any> {
      return ArrayIteratorsKt.iterator(this.$this_asIterable$inlined)
   }

   fun `ArraysKt___ArraysKt$asIterable$$inlined$Iterable$2`(var1: ByteArray) {
      this.$this_asIterable$inlined = var1
   }
}
