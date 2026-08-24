package kotlin.ranges

// $VF: Compiled from Ranges.kt
@SinceKotlin(version = "1.1")
public interface ClosedFloatingPointRange<T extends java.lang.Comparable<? super T>> : ClosedRange<T> {
   public override operator fun contains(value: Any): Boolean {
   }

   public abstract fun lessThanOrEquals(a: Any, b: Any): Boolean {
   }

   public override fun isEmpty(): Boolean {
   }

   // $VF: Class flags could not be determined
   // $VF: Compiled from Ranges.kt
   internal class DefaultImpls {
      @JvmStatic
      fun <T extends java.lang.Comparable<? super T>> contains(value: ClosedFloatingPointRange<T>, `$this`: T): Boolean {
         `$this`.lessThanOrEquals((T)`$this`.getStart(), (T)value) && `$this`.lessThanOrEquals((T)value, (T)`$this`.getEndInclusive())
      }

      @JvmStatic
      fun <T extends java.lang.Comparable<? super T>> isEmpty(`$this`: ClosedFloatingPointRange<T>): Boolean {
         !`$this`.lessThanOrEquals((T)`$this`.getStart(), (T)`$this`.getEndInclusive())
      }
   }
}
