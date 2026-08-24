package kotlin.collections

// $VF: Compiled from Sequences.kt
// $VF: local visibility outside of methodSupplier
internal class `SlidingWindowKt$windowedSequence$$inlined$Sequence$1` : Sequence<java.util.List<? extends T>> {
   fun `SlidingWindowKt$windowedSequence$$inlined$Sequence$1`(var1: Sequence, var2: Int, var3: Int, var4: Boolean, var5: Boolean) {
      this.$this_windowedSequence$inlined = var1
      this.$size$inlined = var2
      this.$step$inlined = var3
      this.$partialWindows$inlined = var4
      this.$reuseBuffer$inlined = var5
   }

   public override operator fun iterator(): Iterator<Any> {
      return SlidingWindowKt.windowedIterator(
         this.$this_windowedSequence$inlined.iterator(), this.$size$inlined, this.$step$inlined, this.$partialWindows$inlined, this.$reuseBuffer$inlined
      )
   }
}
