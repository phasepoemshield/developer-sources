package kotlin

import kotlin.enums.EnumEntries

// $VF: Compiled from Annotations.kt
public enum class DeprecationLevel {
   ERROR,
   HIDDEN,
   WARNING;

   @JvmStatic
   fun getEntries(): EnumEntries<DeprecationLevel> {
      $ENTRIES
   }
}
