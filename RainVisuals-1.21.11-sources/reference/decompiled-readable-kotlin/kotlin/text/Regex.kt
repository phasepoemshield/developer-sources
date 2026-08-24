package kotlin.text

import java.io.Serializable
import java.util.ArrayList
import java.util.Collections
import java.util.EnumSet
import java.util.regex.Matcher
import java.util.regex.Pattern
import kotlin.coroutines.Continuation

// $VF: Compiled from Regex.kt
public class Regex @PublishedApi  internal constructor(nativePattern: Pattern) : Serializable {
   private final val nativePattern: Pattern
   private final var _options: Set<RegexOption>?

   public fun replace(input: CharSequence, replacement: String): String {
      val var10000: java.lang.String = this.nativePattern.matcher(input).replaceAll(replacement)
      return var10000
   }

   public override fun toString(): String {
      val var10000: java.lang.String = this.nativePattern.toString()
      return var10000
   }

   public final val pattern: String
      public final get() {
         val var10000: java.lang.String = this.nativePattern.pattern()
         return var10000
      }


   public fun find(input: CharSequence, startIndex: Int = 0): MatchResult? {
      val var10000: Matcher = this.nativePattern.matcher(input)
      return RegexKt.access$findNext(var10000, startIndex, input)
   }

   public final val options: Set<RegexOption>
      public final get() {
         var var10000: java.util.Set = this._options
         if (this._options == null) {
            val `value$iv`: Int = this.nativePattern.flags()
            val var3: EnumSet = EnumSet.allOf(RegexOption.class)
            CollectionsKt.retainAll((java.lang.Iterable<? extends RegexOption>)var3, Regex$special$$inlined$fromInt$1(`value$iv`))
            var10000 = Collections.unmodifiableSet(var3)
            this._options = var10000
            var10000 = var10000
         }

         return var10000
      }


   public fun replace(input: CharSequence, transform: (MatchResult) -> CharSequence): String {
      val var10000: MatchResult = find$default(this, input, 0, 2, null)
      if (var10000 == null) {
         return input.toString()
      } else {
         var match: MatchResult = var10000
         var lastStart: Int = 0
         val length: Int = input.length()
         val sb: StringBuilder = StringBuilder(length)

         do {
            sb.append(input, lastStart, match.range.start)
            sb.append(transform(match) as java.lang.CharSequence)
            lastStart = match.range.endInclusive + 1
            match = match.next()
         } while (lastStart < length && match != null)

         if (lastStart < length) {
            sb.append(input, lastStart, length)
         }

         val var8: java.lang.String = sb.toString()
         return var8
      }
   }

   public constructor(pattern: String, option: RegexOption)  {
      val var10001: Pattern = Pattern.compile(pattern, Companion.ensureUnicodeCase(option.value))
      this(var10001)
   }

   public fun toPattern(): Pattern {
      return this.nativePattern
   }

   init {
      this.nativePattern = nativePattern
   }

   public fun containsMatchIn(input: CharSequence): Boolean {
      return this.nativePattern.matcher(input).find()
   }

   private fun writeReplace(): Any {
      val var10002: java.lang.String = this.nativePattern.pattern()
      return Regex.Serialized(var10002, this.nativePattern.flags())
   }

   @SinceKotlin(version = "1.7")
   @WasExperimental(markerClass = [ExperimentalStdlibApi::class])
   public fun matchAt(input: CharSequence, index: Int): MatchResult? {
      val `$this$matchAt_u24lambda_u241`: Matcher = this.nativePattern
         .matcher(input)
         .useAnchoringBounds(false)
         .useTransparentBounds(true)
         .region(index, input.length())
         val var10000: MatcherMatchResult
      if (`$this$matchAt_u24lambda_u241`.lookingAt()) {
         var10000 = MatcherMatchResult(`$this$matchAt_u24lambda_u241`, input)
      } else {
         var10000 = null
      }

      return var10000
   }

   public infix fun matches(input: CharSequence): Boolean {
      return this.nativePattern.matcher(input).matches()
   }

   public fun replaceFirst(input: CharSequence, replacement: String): String {
      val var10000: java.lang.String = this.nativePattern.matcher(input).replaceFirst(replacement)
      return var10000
   }

   @WasExperimental(markerClass = [ExperimentalStdlibApi::class])
   @SinceKotlin(version = "1.7")
   public fun matchesAt(input: CharSequence, index: Int): Boolean {
      return this.nativePattern.matcher(input).useAnchoringBounds(false).useTransparentBounds(true).region(index, input.length()).lookingAt()
   }

   public fun findAll(input: CharSequence, startIndex: Int = 0): Sequence<MatchResult> {
      if (startIndex >= 0 && startIndex <= input.length()) {
         return SequencesKt.generateSequence(         // $VF: Compiled from Regex.kt
{
            return Regex.this.find(input, startIndex)
         } as () -> MatchResult, <unrepresentable>.INSTANCE)
      } else {
         throw IndexOutOfBoundsException("Start index out of bounds: $startIndex, input length: ${input.length()}")
      }
   }

   @WasExperimental(markerClass = [ExperimentalStdlibApi::class])
   @SinceKotlin(version = "1.6")
   public fun splitToSequence(input: CharSequence, limit: Int = 0): Sequence<String> {
      StringsKt.requireNonNegativeLimit(limit)
      return SequencesKt.sequence(      // $VF: Compiled from Regex.kt
{
         // $VF: Could not decompile lambda - root function was not found. Is this a suspend lambda?
      } as (SequenceScope<? super java.lang.String>?, Continuation<in Unit>?) -> Any)
   }

   public constructor(pattern: String)  {
      val var10001: Pattern = Pattern.compile(pattern)
      this(var10001)
   }

   public fun split(input: CharSequence, limit: Int = 0): List<String> {
      StringsKt.requireNonNegativeLimit(limit)
      val matcher: Matcher = this.nativePattern.matcher(input)
      if (limit != 1 && matcher.find()) {
         val result: ArrayList = ArrayList(if (limit > 0) RangesKt.coerceAtMost(limit, 10) else 10)
         var lastStart: Int = 0
         val lastSplit: Int = limit + -1

         do {
            result.add(input.subSequence(lastStart, matcher.start()).toString())
            lastStart = matcher.end()
         } while ((lastSplit < 0 || result.size() != lastSplit) && matcher.find())

         result.add(input.subSequence(lastStart, input.length()).toString())
         return result
      } else {
         return CollectionsKt.listOf(input.toString())
      }
   }

   public fun matchEntire(input: CharSequence): MatchResult? {
      val var10000: Matcher = this.nativePattern.matcher(input)
      return RegexKt.access$matchEntire(var10000, input)
   }

   public constructor(pattern: String, options: Set<RegexOption>)  {
      val var10001: Pattern = Pattern.compile(pattern, Companion.ensureUnicodeCase(RegexKt.access$toInt(options)))
      this(var10001)
   }

   // $VF: Compiled from Regex.kt
   public companion object {
      public fun escapeReplacement(literal: String): String {
         val var10000: java.lang.String = Matcher.quoteReplacement(literal)
         return var10000
      }

      private fun ensureUnicodeCase(flags: Int): Int {
         return if ((flags and 2) != 0) flags or 64 else flags
      }

      public fun escape(literal: String): String {
         val var10000: java.lang.String = Pattern.quote(literal)
         return var10000
      }

      public fun fromLiteral(literal: String): Regex {
         return Regex(literal, RegexOption.LITERAL)
      }
   }

   // $VF: Compiled from Regex.kt
   private class Serialized(pattern: String, flags: Int) : Serializable {
      public final val pattern: String
      public final val flags: Int

      private fun readResolve(): Any {
         val var10002: Pattern = Pattern.compile(this.pattern, this.flags)
         return Regex(var10002)
      }

      init {
         this.pattern = pattern
         this.flags = flags
      }

      // $VF: Compiled from Regex.kt
      public companion object {
         private const val serialVersionUID: Long = 0L
      }
   }
}
