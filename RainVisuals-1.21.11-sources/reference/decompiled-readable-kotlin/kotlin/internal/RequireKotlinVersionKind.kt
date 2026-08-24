package kotlin.internal

import kotlin.enums.EnumEntries

// $VF: Compiled from Annotations.kt
@SinceKotlin(version = "1.2")
internal enum class RequireKotlinVersionKind {
   API_VERSION,
   LANGUAGE_VERSION,
   COMPILER_VERSION;

   @JvmStatic
   fun getEntries(): EnumEntries<RequireKotlinVersionKind> {
      $ENTRIES
   }
}
