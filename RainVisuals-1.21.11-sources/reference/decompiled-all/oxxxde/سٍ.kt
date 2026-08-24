package oxxxde

import java.util.Comparator

// $VF: Class flags could not be determined
// $VF: Compiled from heavy
internal class سٍ<T> : Comparator {
   override final fun compare(b: T, a: T): Int {
      val previousCompare: Int = this.$this_thenByDescending.compare(a, b)
      if (previousCompare != 0) previousCompare else ComparisonsKt.compareValues((b as جة).present, (a as جة).present)
   }

   fun سٍ(`$receiver`: Comparator) {
      this.$this_thenByDescending = `$receiver`
   }
}
