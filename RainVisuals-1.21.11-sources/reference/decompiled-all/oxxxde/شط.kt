package oxxxde

import kotlin.enums.EnumEntries

// $VF: Compiled from heavy
public enum class شط {
   ALREADY_EXISTS,
   INVALID_NAME,
   NOT_FOUND,
   UNCHANGED,
   SAVE_FAILED,
   RENAMED;

   @JvmStatic
   fun getEntries(): EnumEntries<شط> {
      $ENTRIES
   }
}
