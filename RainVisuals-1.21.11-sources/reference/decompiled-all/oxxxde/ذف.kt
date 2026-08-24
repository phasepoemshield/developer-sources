package oxxxde

import kotlin.enums.EnumEntries

// $VF: Compiled from heavy
private enum class ذف {
   WAIT_BEST_SERVER,
   IDLE,
   SELECT_ANARCHY,
   JOIN_BEST,
   SELECT_TEAM,
   WAIT_SERVERS,
   SELECT_BEST_TEAM;

   @JvmStatic
   fun getEntries(): EnumEntries<ذف> {
      $ENTRIES
   }
}
