package kotlin.text

import kotlin.enums.EnumEntries

// $VF: Compiled from CharCategoryJVM.kt
public enum class CharCategory(value: Int, code: String) {
   SPACE_SEPARATOR(12, "Zs"),
   OTHER_PUNCTUATION(24, "Po"),
   CURRENCY_SYMBOL(26, "Sc"),
   FORMAT(16, "Cf"),
   END_PUNCTUATION(22, "Pe"),
   START_PUNCTUATION(21, "Ps"),
   SURROGATE(19, "Cs"),
   CONNECTOR_PUNCTUATION(23, "Pc"),
   LETTER_NUMBER(10, "Nl"),
   MODIFIER_SYMBOL(27, "Sk"),
   DASH_PUNCTUATION(20, "Pd"),
   UNASSIGNED(0, "Cn"),
   INITIAL_QUOTE_PUNCTUATION(29, "Pi"),
   MODIFIER_LETTER(4, "Lm"),
   OTHER_LETTER(5, "Lo"),
   COMBINING_SPACING_MARK(8, "Mc"),
   OTHER_NUMBER(11, "No"),
   NON_SPACING_MARK(6, "Mn"),
   CONTROL(15, "Cc"),
   ENCLOSING_MARK(7, "Me"),
   UPPERCASE_LETTER(1, "Lu"),
   OTHER_SYMBOL(28, "So"),
   PARAGRAPH_SEPARATOR(14, "Zp"),
   TITLECASE_LETTER(3, "Lt"),
   LINE_SEPARATOR(13, "Zl"),
   LOWERCASE_LETTER(2, "Ll"),
   FINAL_QUOTE_PUNCTUATION(30, "Pf"),
   DECIMAL_DIGIT_NUMBER(9, "Nd"),
   PRIVATE_USE(18, "Co"),
   MATH_SYMBOL(25, "Sm");

   public final val code: String
   public final val value: Int

   init {
      this.value = value
      this.code = code
   }

   public operator fun contains(char: Char): Boolean {
      return Character.getType(char) == this.value
   }

   @JvmStatic
   fun getEntries(): EnumEntries<CharCategory> {
      $ENTRIES
   }

   // $VF: Compiled from CharCategoryJVM.kt
   public companion object {
      public fun valueOf(category: Int): CharCategory {
         val var10000: CharCategory
         if (IntRange(0, 16).contains(category)) {
            var10000 = CharCategory.getEntries().get(category)
         } else {
            if (!IntRange(18, 30).contains(category)) {
               throw IllegalArgumentException("Category #$category is not defined.")
            }

            var10000 = CharCategory.getEntries().get(category + -1)
         }

         return var10000
      }
   }
}
