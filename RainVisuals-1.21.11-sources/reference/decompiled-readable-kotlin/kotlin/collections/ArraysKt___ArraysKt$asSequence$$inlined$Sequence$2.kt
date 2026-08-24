package kotlin.collections

import kotlin.jvm.internal.ArrayIteratorsKt

// $VF: Compiled from Sequences.kt
// $VF: local visibility outside of methodSupplier
internal class `ArraysKt___ArraysKt$asSequence$$inlined$Sequence$2` : Sequence<java.lang.Byte> {
   public override operator fun iterator(): Iterator<Any> {
      return ArrayIteratorsKt.iterator(this.$this_asSequence$inlined)
   }

   fun `ArraysKt___ArraysKt$asSequence$$inlined$Sequence$2`(var1: ByteArray) {
      this.$this_asSequence$inlined = var1
   }
}
