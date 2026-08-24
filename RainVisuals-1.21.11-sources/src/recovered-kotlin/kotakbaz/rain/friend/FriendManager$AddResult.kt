package kotakbaz.rain.friend

import kotlin.enums.EnumEntries

// $VF: Compiled from heavy
public enum class `FriendManager$AddResult` {
   ALREADY_ADDED,
   INVALID_NAME,
   ADDED,
   SAVE_FAILED;

   @JvmStatic
   fun getEntries(): EnumEntries<FriendManager$AddResult> {
      $ENTRIES
   }
}
