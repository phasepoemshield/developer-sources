package kotakbaz.rain.ui.inventory

import kotlin.enums.EnumEntries

// $VF: Compiled from heavy
private enum class `FunTimeOnlineHelperController$State` {
   WAIT_BEST_SERVER,
   IDLE,
   SELECT_ANARCHY,
   JOIN_BEST,
   SELECT_TEAM,
   WAIT_SERVERS,
   SELECT_BEST_TEAM;

   @JvmStatic
   fun getEntries(): EnumEntries<FunTimeOnlineHelperController$State> {
      $ENTRIES
   }
}
