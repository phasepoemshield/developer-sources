package kotlin.text

import kotlin.jvm.internal.markers.KMappedMarker

// $VF: Compiled from Iterables.kt
// $VF: local visibility outside of methodSupplier
internal class `StringsKt___StringsKt$asIterable$$inlined$Iterable$1` : KMappedMarker, java.lang.Iterable {
   fun `StringsKt___StringsKt$asIterable$$inlined$Iterable$1`(var1: java.lang.CharSequence) {
      this.$this_asIterable$inlined = var1
   }

   public override operator fun iterator(): Iterator<Any> {
      return StringsKt.iterator(this.$this_asIterable$inlined)
   }
}
