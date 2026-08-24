package kotlin.text

import java.util.regex.Matcher
import kotlin.internal.PlatformImplementationsKt

// $VF: Compiled from Regex.kt
private class MatcherMatchResult(matcher: Matcher, input: CharSequence) : MatchResult {
   private final var groupValues_: List<String>?
   public open val groups: MatchGroupCollection
   private final val matcher: Matcher
   private final val input: CharSequence

   public open val groupValues: List<String>
      public open get() {
         if (this.groupValues_ == null) {
            this.groupValues_ =             // $VF: Compiled from Regex.kt
object : AbstractList<String> {
               public open val size: Int
                  public open get() {
                     return MatcherMatchResult.this.matchResult.groupCount() + 1
                  }


               public open operator fun get(index: Int): String {
                  var var10000: java.lang.String = MatcherMatchResult.this.matchResult.group(index)
                  if (var10000 == null) {
                     var10000 = ""
                  }

                  return var10000
               }
            }
         }

         val var10000: java.util.List = this.groupValues_
         return var10000
      }


   override fun getDestructured(): MatchResult.Destructured {
      MatchResult.DefaultImpls.getDestructured(this)
   }

   public override fun next(): MatchResult? {
      val nextIndex: Int = this.matchResult.end() + (if (this.matchResult.end() == this.matchResult.start()) 1 else 0)
      val var2: MatchResult
      if (nextIndex <= this.input.length()) {
         val var10000: Matcher = this.matcher.pattern().matcher(this.input)
         var2 = RegexKt.access$findNext(var10000, nextIndex, this.input)
      } else {
         var2 = null
      }

      return var2
   }

   public open val range: IntRange
      public open get() {
         return RegexKt.access$range(this.matchResult)
      }


   public open val value: String
      public open get() {
         val var10000: java.lang.String = this.matchResult.group()
         return var10000
      }


   private final val matchResult: java.util.regex.MatchResult
      private final get() {
         return this.matcher
      }


   init {
      this.matcher = matcher
      this.input = input
      this.groups =       // $VF: Compiled from Regex.kt
object : MatchNamedGroupCollection, AbstractCollection<MatchGroup?> {
         public open val size: Int
            public open get() {
               return MatcherMatchResult.this.matchResult.groupCount() + 1
            }


         public override operator fun get(index: Int): MatchGroup? {
            val range: IntRange = RegexKt.access$range(MatcherMatchResult.this.matchResult, index)
            val var10000: MatchGroup
            if (range.start >= 0) {
               val var10002: java.lang.String = MatcherMatchResult.this.matchResult.group(index)
               var10000 = MatchGroup(var10002, range)
            } else {
               var10000 = null
            }

            return var10000
         }

         public override operator fun get(name: String): MatchGroup? {
            return PlatformImplementationsKt.IMPLEMENTATIONS.getMatchResultNamedGroup(MatcherMatchResult.this.matchResult, name)
         }

         public override fun isEmpty(): Boolean {
            return false
         }

         public override operator fun iterator(): Iterator<MatchGroup?> {
            return SequencesKt.<Integer, MatchGroup>map(
                  CollectionsKt.asSequence(CollectionsKt.getIndices(this as MutableCollection<*>)),             // $VF: Compiled from Regex.kt
      { it: Int ->
                     return get(it)
                  } as (Int?) -> MatchGroup
               )
               .iterator()
            }
      } as MatchGroupCollection
   }
}
