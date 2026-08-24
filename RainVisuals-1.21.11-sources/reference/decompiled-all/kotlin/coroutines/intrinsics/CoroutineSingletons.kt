package kotlin.coroutines.intrinsics

import kotlin.enums.EnumEntries

// $VF: Compiled from Intrinsics.kt
@PublishedApi
@SinceKotlin(version = "1.3")
internal enum class CoroutineSingletons {
   COROUTINE_SUSPENDED,
   RESUMED,
   UNDECIDED;

   @JvmStatic
   fun getEntries(): EnumEntries<CoroutineSingletons> {
      $ENTRIES
   }
}
