package kotlin.comparisons

import java.util.Comparator

// $VF: Compiled from Comparisons.kt
private class ReversedComparator<T>(comparator: Comparator<Any>) : Comparator<T> {
   public final val comparator: Comparator<Any>

   public override fun compare(a: Any, b: Any): Int {
      return this.comparator.compare((T)b, (T)a)
   }

   public override fun reversed(): Comparator<Any> {
      return this.comparator
   }

   init {
      this.comparator = comparator
   }
}
