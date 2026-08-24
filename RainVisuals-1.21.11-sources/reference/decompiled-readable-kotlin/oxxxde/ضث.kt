package oxxxde

import kotlin.enums.EnumEntries

// $VF: Compiled from heavy
private enum class ضث {
   PICKING_CHEST_SLOT,
   IDLE,
   CLOSING_INVENTORY,
   OPENING_INVENTORY,
   PICKING_TARGET_SLOT,
   PLACING_CHEST_SLOT;

   @JvmStatic
   fun getEntries(): EnumEntries<ضث> {
      $ENTRIES
   }
}
