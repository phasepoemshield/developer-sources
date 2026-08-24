package oxxxde

import kotlin.enums.EnumEntries

// $VF: Compiled from heavy
public enum class ب {
   SAVE_FAILED,
   INVALID_NAME,
   NOT_FOUND,
   RENAMED,
   UNCHANGED,
   ALREADY_EXISTS;

   @JvmStatic
   fun getEntries(): EnumEntries<ب> {
      $ENTRIES
   }
}
