package kotlin.text

import kotlin.internal.InlineOnly

// $VF: Compiled from MatchResult.kt
public interface MatchResult {
   public open val destructured: kotlin.text.MatchResult.Destructured
      public open get() {
      }


   public val value: String

   public val groupValues: List<String>

   public val groups: MatchGroupCollection

   public abstract fun next(): MatchResult? {
   }

   public val range: IntRange

   // $VF: Class flags could not be determined
   // $VF: Compiled from MatchResult.kt
   internal class DefaultImpls {
      @JvmStatic
      fun getDestructured(`$this`: MatchResult): MatchResult.Destructured {
         MatchResult.Destructured(`$this`)
      }
   }

   // $VF: Compiled from MatchResult.kt
   public class Destructured internal constructor(match: MatchResult) {
      public final val match: MatchResult

      @InlineOnly
      public inline operator fun component1(): String {
         return this.match.groupValues.get(1)
      }

      @InlineOnly
      public inline operator fun component2(): String {
         return this.match.groupValues.get(2)
      }

      @InlineOnly
      public inline operator fun component6(): String {
         return this.match.groupValues.get(6)
      }

      @InlineOnly
      public inline operator fun component10(): String {
         return this.match.groupValues.get(10)
      }

      @InlineOnly
      public inline operator fun component9(): String {
         return this.match.groupValues.get(9)
      }

      public fun toList(): List<String> {
         return this.match.groupValues.subList(1, this.match.groupValues.size())
      }

      @InlineOnly
      public inline operator fun component7(): String {
         return this.match.groupValues.get(7)
      }

      init {
         this.match = match
      }

      @InlineOnly
      public inline operator fun component3(): String {
         return this.match.groupValues.get(3)
      }

      @InlineOnly
      public inline operator fun component8(): String {
         return this.match.groupValues.get(8)
      }

      @InlineOnly
      public inline operator fun component4(): String {
         return this.match.groupValues.get(4)
      }

      @InlineOnly
      public inline operator fun component5(): String {
         return this.match.groupValues.get(5)
      }
   }
}
