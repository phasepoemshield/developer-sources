package kotlin

import kotlin.enums.EnumEntries

// $VF: Compiled from Lazy.kt
public enum class LazyThreadSafetyMode {
   SYNCHRONIZED,
   NONE,
   PUBLICATION;

   @JvmStatic
   fun getEntries(): EnumEntries<LazyThreadSafetyMode> {
      $ENTRIES
   }
}
