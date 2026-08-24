package kotakbaz.rain.ui.inventory

import kotlin.enums.EnumEntries

// $VF: Compiled from heavy
public enum class InventorySlotState {
   CONFLICT,
   CORRECT,
   MISPLACED,
   MISSING;

   @JvmStatic
   fun getEntries(): EnumEntries<InventorySlotState> {
      $ENTRIES
   }
}
