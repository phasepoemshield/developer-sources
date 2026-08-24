package oxxxde

import java.util.Comparator
import java.util.Map.Entry

// $VF: Class flags could not be determined
// $VF: Compiled from heavy
internal class سّ<T> : Comparator {
   override final fun compare(b: T, a: T): Int {
      ComparisonsKt.compareValues((a as Entry).getKey() as java.lang.String, (b as Entry).getKey() as java.lang.String)
   }
}
