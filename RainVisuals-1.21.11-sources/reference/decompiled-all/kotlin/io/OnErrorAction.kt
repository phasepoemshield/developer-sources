package kotlin.io

import kotlin.enums.EnumEntries

// $VF: Compiled from Utils.kt
public enum class OnErrorAction {
   TERMINATE,
   SKIP;

   @JvmStatic
   fun getEntries(): EnumEntries<OnErrorAction> {
      $ENTRIES
   }
}
