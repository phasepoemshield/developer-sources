package kotlin.io

import kotlin.enums.EnumEntries

// $VF: Compiled from FileTreeWalk.kt
public enum class FileWalkDirection {
   TOP_DOWN,
   BOTTOM_UP;

   @JvmStatic
   fun getEntries(): EnumEntries<FileWalkDirection> {
      $ENTRIES
   }
}
