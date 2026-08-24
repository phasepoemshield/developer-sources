package oxxxde

import java.util.Comparator
import java.util.Locale

// $VF: Class flags could not be determined
// $VF: Compiled from heavy
internal class ثز<T> : Comparator {
   override final fun compare(a: T, b: T): Int {
      var var10000: java.lang.Comparable = (a as java.lang.String).toLowerCase(Locale.ROOT)
      var10000 = var10000
      val var9: java.lang.String = (b as java.lang.String).toLowerCase(Locale.ROOT)
      ComparisonsKt.compareValues(var10000, var9)
   }
}
