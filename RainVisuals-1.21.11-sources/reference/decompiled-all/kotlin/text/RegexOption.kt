package kotlin.text

import kotlin.enums.EnumEntries

// $VF: Compiled from Regex.kt
public enum class RegexOption(value: Int, mask: Int = value) : FlagEnum {
   IGNORE_CASE(2, 0, 2, null),
   MULTILINE(8, 0, 2, null),
   COMMENTS(4, 0, 2, null),
   UNIX_LINES(1, 0, 2, null),
   LITERAL(16, 0, 2, null),
   DOT_MATCHES_ALL(32, 0, 2, null),
   CANON_EQ(128, 0, 2, null);

   public open val mask: Int
   public open val value: Int

   @JvmStatic
   fun getEntries(): EnumEntries<RegexOption> {
      $ENTRIES
   }

   init {
      this.value = value
      this.mask = mask
   }
}
