package oxxxde

import java.util.Comparator
import kotakbaz.rain.ui.menu.misc.AnimatedListTracker$Item

// $VF: Class flags could not be determined
// $VF: Compiled from heavy
internal class خء<T> : Comparator {
   override final fun compare(b: T, a: T): Int {
      ComparisonsKt.compareValues((a as AnimatedListTracker$Item).position, (b as AnimatedListTracker$Item).position)
   }
}
