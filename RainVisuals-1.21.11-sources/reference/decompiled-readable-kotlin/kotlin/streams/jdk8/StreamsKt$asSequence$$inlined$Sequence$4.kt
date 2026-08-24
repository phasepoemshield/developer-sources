package kotlin.streams.jdk8

import java.util.PrimitiveIterator.OfDouble
import java.util.stream.DoubleStream

// $VF: Compiled from Sequences.kt
// $VF: local visibility outside of methodSupplier
internal class `StreamsKt$asSequence$$inlined$Sequence$4` : Sequence<java.lang.Double> {
   fun `StreamsKt$asSequence$$inlined$Sequence$4`(var1: DoubleStream) {
      this.$this_asSequence$inlined = var1
   }

   public override operator fun iterator(): Iterator<Any> {
      val var10000: OfDouble = this.$this_asSequence$inlined.iterator()
      return var10000
   }
}
