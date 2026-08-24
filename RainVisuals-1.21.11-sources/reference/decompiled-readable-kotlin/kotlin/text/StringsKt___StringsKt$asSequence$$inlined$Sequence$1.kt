package kotlin.text

// $VF: Compiled from Sequences.kt
// $VF: local visibility outside of methodSupplier
internal class `StringsKt___StringsKt$asSequence$$inlined$Sequence$1` : Sequence<Character> {
   fun `StringsKt___StringsKt$asSequence$$inlined$Sequence$1`(var1: java.lang.CharSequence) {
      this.$this_asSequence$inlined = var1
   }

   public override operator fun iterator(): Iterator<Any> {
      return StringsKt.iterator(this.$this_asSequence$inlined)
   }
}
