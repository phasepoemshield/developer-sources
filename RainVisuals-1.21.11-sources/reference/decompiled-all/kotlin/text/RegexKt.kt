package kotlin.text

import java.util.regex.Matcher

// $VF: Compiled from Regex.kt
private fun Iterable<FlagEnum>.toInt(): Int {
   var `accumulator$iv`: Int = 0

   for (`element$iv` in `$this$toInt`) {
      `accumulator$iv` |= (`element$iv` as FlagEnum).value
   }

   return `accumulator$iv`
}

private fun Matcher.findNext(from: Int, input: CharSequence): MatchResult? {
   return if (!`$this$findNext`.find(from)) null else MatcherMatchResult(`$this$findNext`, input)
}

private fun java.util.regex.MatchResult.range(): IntRange {
   return RangesKt.until((int)`$this$range`.start(), (int)`$this$range`.end())
}

private fun Matcher.matchEntire(input: CharSequence): MatchResult? {
   return if (!`$this$matchEntire`.matches()) null else MatcherMatchResult(`$this$matchEntire`, input)
}

private fun java.util.regex.MatchResult.range(groupIndex: Int): IntRange {
   return RangesKt.until((int)`$this$range`.start(groupIndex), (int)`$this$range`.end(groupIndex))
}
