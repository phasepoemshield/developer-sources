package kotlin.collections

import kotlin.jvm.internal.ArrayIteratorKt

// $VF: Compiled from Sequences.kt
// $VF: local visibility outside of methodSupplier
internal class `ArraysKt___ArraysKt$asSequence$$inlined$Sequence$1` : Sequence<T> {
   public override operator fun iterator(): Iterator<Any> {
      return (java.util.Iterator<T>)ArrayIteratorKt.iterator(this.$this_asSequence$inlined)
   }

   fun `ArraysKt___ArraysKt$asSequence$$inlined$Sequence$1`(var1: Array<Any>) {
      this.$this_asSequence$inlined = var1
   }
}
