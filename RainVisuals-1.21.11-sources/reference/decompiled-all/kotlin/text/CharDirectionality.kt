package kotlin.text

import kotlin.enums.EnumEntries

// $VF: Compiled from CharDirectionality.kt
public enum class CharDirectionality(value: Int) {
   SEGMENT_SEPARATOR(11),
   WHITESPACE(12),
   RIGHT_TO_LEFT_ARABIC(2),
   EUROPEAN_NUMBER_TERMINATOR(5),
   LEFT_TO_RIGHT(0),
   PARAGRAPH_SEPARATOR(10),
   EUROPEAN_NUMBER(3),
   LEFT_TO_RIGHT_EMBEDDING(14),
   ARABIC_NUMBER(6),
   EUROPEAN_NUMBER_SEPARATOR(4),
   RIGHT_TO_LEFT_EMBEDDING(16),
   LEFT_TO_RIGHT_OVERRIDE(15),
   BOUNDARY_NEUTRAL(9),
   POP_DIRECTIONAL_FORMAT(18),
   COMMON_NUMBER_SEPARATOR(7),
   OTHER_NEUTRALS(13),
   RIGHT_TO_LEFT_OVERRIDE(17),
   RIGHT_TO_LEFT(1),
   NONSPACING_MARK(8),
   UNDEFINED(-1);

   public final val value: Int

   init {
      this.value = value
   }

   @JvmStatic
   fun getEntries(): EnumEntries<CharDirectionality> {
      $ENTRIES
   }

   // $VF: Compiled from CharDirectionality.kt
   public companion object {
      private final val directionalityMap: Map<Int, CharDirectionality>
         private final get() {
            return CharDirectionality.directionalityMap$delegate.value
         }


      public fun valueOf(directionality: Int): CharDirectionality {
         val var10000: CharDirectionality = this.directionalityMap.get(directionality)
         if (var10000 == null) {
            throw IllegalArgumentException("Directionality #$directionality is not defined.")
         } else {
            return var10000
         }
      }
   }
}
