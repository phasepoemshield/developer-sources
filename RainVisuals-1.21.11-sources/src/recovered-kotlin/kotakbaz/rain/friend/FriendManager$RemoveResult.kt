package kotakbaz.rain.friend

import kotlin.enums.EnumEntries

// $VF: Compiled from heavy
public enum class `FriendManager$RemoveResult` {
   INVALID_NAME,
   REMOVED,
   SAVE_FAILED,
   NOT_FOUND;

   @JvmStatic
   fun getEntries(): EnumEntries<FriendManager$RemoveResult> {
      $ENTRIES
   }
}
