package kotlin.io.path

import kotlin.enums.EnumEntries

// $VF: Compiled from PathWalkOption.kt
@SinceKotlin(version = "1.7")
@ExperimentalPathApi
public enum class PathWalkOption {
   BREADTH_FIRST,
   INCLUDE_DIRECTORIES,
   FOLLOW_LINKS;

   @JvmStatic
   fun getEntries(): EnumEntries<PathWalkOption> {
      $ENTRIES
   }
}
