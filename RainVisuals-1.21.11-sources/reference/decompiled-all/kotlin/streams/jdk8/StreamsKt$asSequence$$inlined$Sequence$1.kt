package kotlin.streams.jdk8

import java.util.stream.Stream

// $VF: Compiled from Sequences.kt
// $VF: local visibility outside of methodSupplier
internal class `StreamsKt$asSequence$$inlined$Sequence$1` : Sequence<T> {
   fun `StreamsKt$asSequence$$inlined$Sequence$1`(var1: Stream) {
      this.$this_asSequence$inlined = var1
   }

   public override operator fun iterator(): Iterator<Any> {
      val var10000: java.util.Iterator = this.$this_asSequence$inlined.iterator()
      return var10000
   }
}
