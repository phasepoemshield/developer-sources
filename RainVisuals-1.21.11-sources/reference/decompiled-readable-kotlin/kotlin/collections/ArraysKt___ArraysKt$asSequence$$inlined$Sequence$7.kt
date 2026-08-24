package kotlin.collections

import kotlin.jvm.internal.ArrayIteratorsKt

// $VF: Compiled from Sequences.kt
// $VF: local visibility outside of methodSupplier
internal class `ArraysKt___ArraysKt$asSequence$$inlined$Sequence$7` : Sequence<java.lang.Double> {
   fun `ArraysKt___ArraysKt$asSequence$$inlined$Sequence$7`(var1: DoubleArray) {
      this.$this_asSequence$inlined = var1
   }

   public override operator fun iterator(): Iterator<Any> {
      return ArrayIteratorsKt.iterator(this.$this_asSequence$inlined)
   }
}
