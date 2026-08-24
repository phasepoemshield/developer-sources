package kotlin.collections

import kotlin.jvm.internal.ArrayIteratorsKt

// $VF: Compiled from Sequences.kt
// $VF: local visibility outside of methodSupplier
internal class `ArraysKt___ArraysKt$asSequence$$inlined$Sequence$3` : Sequence<java.lang.Short> {
   public override operator fun iterator(): Iterator<Any> {
      return ArrayIteratorsKt.iterator(this.$this_asSequence$inlined)
   }

   fun `ArraysKt___ArraysKt$asSequence$$inlined$Sequence$3`(var1: ShortArray) {
      this.$this_asSequence$inlined = var1
   }
}
