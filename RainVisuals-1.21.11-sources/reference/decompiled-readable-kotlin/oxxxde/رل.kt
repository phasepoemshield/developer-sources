package oxxxde

import kotlin.enums.EnumEntries

// $VF: Compiled from heavy
private enum class رل {
   IDLE,
   AUCTION_OPEN,
   WAITING_FOR_AUCTION;

   @JvmStatic
   fun getEntries(): EnumEntries<رل> {
      $ENTRIES
   }
}
