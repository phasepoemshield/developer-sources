package kotlin.collections

import kotlin.jvm.internal.ArrayIteratorsKt

// $VF: Compiled from Sequences.kt
// $VF: local visibility outside of methodSupplier
internal class `ArraysKt___ArraysKt$asSequence$$inlined$Sequence$8` : Sequence<java.lang.Boolean> {
   fun `ArraysKt___ArraysKt$asSequence$$inlined$Sequence$8`(var1: BooleanArray) {
      this.$this_asSequence$inlined = var1
   }

   public override operator fun iterator(): Iterator<Any> {
      return ArrayIteratorsKt.iterator(this.$this_asSequence$inlined)
   }
}
