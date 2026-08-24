package kotlin.io.path

import kotlin.enums.EnumEntries

// $VF: Compiled from OnErrorResult.kt
@SinceKotlin(version = "1.8")
@ExperimentalPathApi
public enum class OnErrorResult {
   SKIP_SUBTREE,
   TERMINATE;

   @JvmStatic
   fun getEntries(): EnumEntries<OnErrorResult> {
      $ENTRIES
   }
}
