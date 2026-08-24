package kotlin.ranges

// $VF: Compiled from Range.kt
@SinceKotlin(version = "1.9")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public interface OpenEndRange<T extends java.lang.Comparable<? super T>> {
   public val endExclusive: Any

   public open operator fun contains(value: Any): Boolean {
   }

   public open fun isEmpty(): Boolean {
   }

   public val start: Any

   // $VF: Class flags could not be determined
   // $VF: Compiled from Range.kt
   internal class DefaultImpls {
      @JvmStatic
      fun <T extends java.lang.Comparable<? super T>> isEmpty(`$this`: OpenEndRange<T>): Boolean {
         `$this`.start.compareTo(`$this`.endExclusive) >= 0
      }

      @JvmStatic
      fun <T extends java.lang.Comparable<? super T>> contains(`$this`: OpenEndRange<T>, value: T): Boolean {
         value.compareTo(`$this`.start) >= 0 && value.compareTo(`$this`.endExclusive) < 0
      }
   }
}
