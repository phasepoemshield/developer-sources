package oxxxde

import java.util.Comparator
import kotakbaz.rain.ui.menu.misc.AnimatedListTracker$Item

// $VF: Class flags could not be determined
// $VF: Compiled from heavy
internal class سٍ<T> : Comparator {
   override final fun compare(b: T, a: T): Int {
      val previousCompare: Int = this.$this_thenByDescending.compare(a, b)
      if (previousCompare != 0)
         previousCompare
         else
         ComparisonsKt.compareValues((b as AnimatedListTracker$Item).present, (a as AnimatedListTracker$Item).present)
      }

   fun سٍ(`$receiver`: Comparator) {
      this.$this_thenByDescending = `$receiver`
   }
}
