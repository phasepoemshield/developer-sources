package oxxxde

import kotlin.enums.EnumEntries

// $VF: Compiled from heavy
public enum class او {
   UNCHANGED,
   ADDED,
   REPLACED,
   SAVE_FAILED,
   INVALID_NAME;

   @JvmStatic
   fun getEntries(): EnumEntries<او> {
      $ENTRIES
   }
}
