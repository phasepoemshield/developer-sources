package kotlin.streams.jdk8

import java.util.PrimitiveIterator.OfInt
import java.util.stream.IntStream

// $VF: Compiled from Sequences.kt
// $VF: local visibility outside of methodSupplier
internal class `StreamsKt$asSequence$$inlined$Sequence$2` : Sequence<Integer> {
   fun `StreamsKt$asSequence$$inlined$Sequence$2`(var1: IntStream) {
      this.$this_asSequence$inlined = var1
   }

   public override operator fun iterator(): Iterator<Any> {
      val var10000: OfInt = this.$this_asSequence$inlined.iterator()
      return var10000
   }
}
