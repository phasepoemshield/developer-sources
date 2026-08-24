package oxxxde

import kotlin.enums.EnumEntries

// $VF: Compiled from heavy
private enum class ق {
   WAITING_CYCLE,
   WAITING_CONFIRM_SCREEN,
   WAITING_STORAGE_SCREEN,
   WAITING_CLOSE;

   @JvmStatic
   fun getEntries(): EnumEntries<ق> {
      $ENTRIES
   }
}
