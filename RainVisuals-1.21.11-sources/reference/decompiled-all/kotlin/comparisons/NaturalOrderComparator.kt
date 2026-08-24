package kotlin.comparisons

import java.util.Comparator

// $VF: Compiled from Comparisons.kt
private object NaturalOrderComparator : Comparator<java.lang.Comparable<? super Object>> {
   public override fun reversed(): Comparator<Comparable<Any>> {
      return ReverseOrderComparator.INSTANCE
   }

   public open fun compare(a: Comparable<Any>, b: Comparable<Any>): Int {
      return a.compareTo(b)
   }
}
