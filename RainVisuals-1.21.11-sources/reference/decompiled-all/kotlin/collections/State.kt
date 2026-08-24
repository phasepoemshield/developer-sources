package kotlin.collections

import kotlin.enums.EnumEntries

// $VF: Compiled from AbstractIterator.kt
private enum class State {
   Done,
   Failed,
   NotReady,
   Ready;

   @JvmStatic
   fun getEntries(): EnumEntries<State> {
      $ENTRIES
   }
}
