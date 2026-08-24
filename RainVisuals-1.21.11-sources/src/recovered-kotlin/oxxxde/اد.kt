package oxxxde

import java.util.Comparator
import java.util.Locale

// $VF: Class flags could not be determined
// $VF: Compiled from heavy
internal class اد<T> : Comparator {
   override final fun compare(a: T, b: T): Int {
      var var10000: java.lang.Comparable = ((a as Pair).component1() as java.lang.String).toLowerCase(Locale.ROOT)
      var10000 = var10000
      val var11: java.lang.String = ((b as Pair).component1() as java.lang.String).toLowerCase(Locale.ROOT)
      ComparisonsKt.compareValues(var10000, var11)
   }
}
