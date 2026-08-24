package kotlin.annotation

import kotlin.enums.EnumEntries

// $VF: Compiled from Annotations.kt
public enum class AnnotationRetention {
   BINARY,
   RUNTIME,
   SOURCE;

   @JvmStatic
   fun getEntries(): EnumEntries<AnnotationRetention> {
      $ENTRIES
   }
}
