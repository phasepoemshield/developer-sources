package kotlin.collections

import kotlin.jvm.internal.ArrayIteratorKt
import kotlin.jvm.internal.markers.KMappedMarker

// $VF: Compiled from Iterables.kt
// $VF: local visibility outside of methodSupplier
internal class `ArraysKt___ArraysKt$asIterable$$inlined$Iterable$1` : java.lang.Iterable<T>, KMappedMarker {
   public override operator fun iterator(): Iterator<Any> {
      return (java.util.Iterator<T>)ArrayIteratorKt.iterator(this.$this_asIterable$inlined)
   }

   fun `ArraysKt___ArraysKt$asIterable$$inlined$Iterable$1`(var1: Array<Any>) {
      this.$this_asIterable$inlined = var1
   }
}
