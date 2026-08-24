package kotlin

import java.lang.annotation.ElementType
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target
import kotlin.enums.EnumEntries

// $VF: Compiled from OptIn.kt
@Target([ElementType.ANNOTATION_TYPE])
@Retention(AnnotationRetention.BINARY)
@kotlin.annotation.Target(allowedTargets = [AnnotationTarget.ANNOTATION_CLASS])
@java.lang.annotation.Retention(RetentionPolicy.CLASS)
@SinceKotlin(version = "1.3")
annotation class RequiresOptIn(
   val message: String = "",
   val level: kotlin.RequiresOptIn.Level = RequiresOptIn.Level.ERROR
) {
   // $VF: Compiled from OptIn.kt
   public enum class Level {
      ERROR,
      WARNING;

      @JvmStatic
      fun getEntries(): EnumEntries<RequiresOptIn.Level> {
         $ENTRIES
      }
   }
}
