package kotlin.streams.jdk8

import java.util.PrimitiveIterator.OfLong
import java.util.stream.LongStream

// $VF: Compiled from Sequences.kt
// $VF: local visibility outside of methodSupplier
internal class `StreamsKt$asSequence$$inlined$Sequence$3` : Sequence<java.lang.Long> {
   fun `StreamsKt$asSequence$$inlined$Sequence$3`(var1: LongStream) {
      this.$this_asSequence$inlined = var1
   }

   public override operator fun iterator(): Iterator<Any> {
      val var10000: OfLong = this.$this_asSequence$inlined.iterator()
      return var10000
   }
}
