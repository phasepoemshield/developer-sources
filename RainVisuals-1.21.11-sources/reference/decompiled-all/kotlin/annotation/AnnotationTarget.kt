package kotlin.annotation

import kotlin.enums.EnumEntries

// $VF: Compiled from Annotations.kt
public enum class AnnotationTarget {
   CONSTRUCTOR,
   FIELD,
   PROPERTY,
   EXPRESSION,
   ANNOTATION_CLASS,
   @SinceKotlin(version = "1.1")
   TYPEALIAS,
   FUNCTION,
   CLASS,
   PROPERTY_SETTER,
   FILE,
   VALUE_PARAMETER,
   PROPERTY_GETTER,
   TYPE,
   LOCAL_VARIABLE,
   TYPE_PARAMETER;

   @JvmStatic
   fun getEntries(): EnumEntries<AnnotationTarget> {
      $ENTRIES
   }
}
