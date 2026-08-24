package kotlin.text

import java.util.NoSuchElementException

// $VF: Compiled from Strings.kt
private class DelimitedRangesSequence(input: CharSequence, startIndex: Int, limit: Int, getNextMatch: (CharSequence, Int) -> Pair<Int, Int>?) :
   Sequence<IntRange> {
   private final val input: CharSequence
   private final val startIndex: Int
   private final val getNextMatch: (CharSequence, Int) -> Pair<Int, Int>?
   private final val limit: Int

   init {
      this.input = input
      this.startIndex = startIndex
      this.limit = limit
      this.getNextMatch = getNextMatch
   }

   public override operator fun iterator(): Iterator<IntRange> {
      return       // $VF: Compiled from Strings.kt
object : Iterator<IntRange> {
         public final var nextSearchIndex: Int
         public final var counter: Int
         public final var nextItem: IntRange?
         public final var currentStartIndex: Int
         public final var nextState: Int = -1

         public open operator fun next(): IntRange {
            if (this.nextState == -1) {
               this.calcNext()
            }

            if (this.nextState == 0) {
               throw NoSuchElementException()
            } else {
               val var10000: IntRange = this.nextItem
               this.nextItem = null
               this.nextState = -1
               return var10000
            }
         }

         override fun remove() {
            throw UnsupportedOperationException("Operation is not supported for read-only collection")
         }

         {
            this.currentStartIndex = RangesKt.coerceIn(DelimitedRangesSequence.this.startIndex, 0, DelimitedRangesSequence.this.input.length())
            this.nextSearchIndex = this.currentStartIndex
         }

         private fun calcNext() {
            if (this.nextSearchIndex < 0) {
               this.nextState = 0
               this.nextItem = null
            } else {
               run label37@{
                  run label36@{
                     if (DelimitedRangesSequence.this.limit > 0) {
                        this.counter++
                        if (this.counter >= DelimitedRangesSequence.this.limit) {
                           return@label36
                        }
                     }

                     if (this.nextSearchIndex <= DelimitedRangesSequence.this.input.length()) {
                        val match: Pair = DelimitedRangesSequence.this.getNextMatch(DelimitedRangesSequence.this.input, this.nextSearchIndex)
                        if (match == null) {
                           this.nextItem = IntRange(this.currentStartIndex, StringsKt.getLastIndex(DelimitedRangesSequence.this.input))
                           this.nextSearchIndex = -1
                        } else {
                           val index: Int = (match.component1() as java.lang.Number).intValue()
                           val length: Int = (match.component2() as java.lang.Number).intValue()
                           this.nextItem = RangesKt.until((int)this.currentStartIndex, (int)index)
                           this.currentStartIndex = index + length
                           this.nextSearchIndex = this.currentStartIndex + (if (length == 0) 1 else 0)
                        }
                        return@label37
                     }
                  }

                  this.nextItem = IntRange(this.currentStartIndex, StringsKt.getLastIndex(DelimitedRangesSequence.this.input))
                  this.nextSearchIndex = -1
               }

               this.nextState = 1
            }
         }

         public override operator fun hasNext(): Boolean {
            if (this.nextState == -1) {
               this.calcNext()
            }

            return this.nextState == 1
         }
      }
   }
}
