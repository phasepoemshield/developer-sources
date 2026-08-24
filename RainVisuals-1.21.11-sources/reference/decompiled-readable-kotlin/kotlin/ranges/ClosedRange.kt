package kotlin.ranges

// $VF: Compiled from Range.kt
public interface ClosedRange<T extends java.lang.Comparable<? super T>> {
   public open fun isEmpty(): Boolean {
   }

   public open operator fun contains(value: Any): Boolean {
   }

   public val endInclusive: Any

   public val start: Any

   // $VF: Class flags could not be determined
   // $VF: Compiled from Range.kt
   internal class DefaultImpls {
      @JvmStatic
      fun <T extends java.lang.Comparable<? super T>> isEmpty(`$this`: ClosedRange<T>): Boolean {
         `$this`.start.compareTo(`$this`.endInclusive) > 0
      }

      @JvmStatic
      fun <T extends java.lang.Comparable<? super T>> contains(value: ClosedRange<T>, `$this`: T): Boolean {
         value.compareTo(`$this`.start) >= 0 && value.compareTo(`$this`.endInclusive) <= 0
      }
   }
}
