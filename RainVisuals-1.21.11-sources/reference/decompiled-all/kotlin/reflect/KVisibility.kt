package kotlin.reflect

import kotlin.enums.EnumEntries

// $VF: Compiled from KVisibility.kt
@SinceKotlin(version = "1.1")
public enum class KVisibility {
   PUBLIC,
   PRIVATE,
   INTERNAL,
   PROTECTED;

   @JvmStatic
   fun getEntries(): EnumEntries<KVisibility> {
      $ENTRIES
   }
}
