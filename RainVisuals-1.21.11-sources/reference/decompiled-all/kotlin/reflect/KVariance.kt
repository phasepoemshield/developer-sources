package kotlin.reflect

import kotlin.enums.EnumEntries

// $VF: Compiled from KVariance.kt
@SinceKotlin(version = "1.1")
public enum class KVariance {
   OUT,
   IN,
   INVARIANT;

   @JvmStatic
   fun getEntries(): EnumEntries<KVariance> {
      $ENTRIES
   }
}
