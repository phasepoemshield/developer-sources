package kotlin.io.path

import kotlin.enums.EnumEntries

// $VF: Compiled from CopyActionResult.kt
@ExperimentalPathApi
@SinceKotlin(version = "1.8")
public enum class CopyActionResult {
   CONTINUE,
   TERMINATE,
   SKIP_SUBTREE;

   @JvmStatic
   fun getEntries(): EnumEntries<CopyActionResult> {
      $ENTRIES
   }
}
