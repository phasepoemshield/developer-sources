package kotlinx.serialization

import java.lang.annotation.Documented
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import kotlin.enums.EnumEntries

// $VF: Compiled from Annotations.kt
@Target(allowedTargets = [AnnotationTarget.PROPERTY])
@ExperimentalSerializationApi
@MustBeDocumented
@java.lang.annotation.Target([])
@Documented
@Retention(RetentionPolicy.RUNTIME)
annotation class EncodeDefault(
   val mode: kotlinx.serialization.EncodeDefault.Mode = EncodeDefault.Mode.ALWAYS
) {
   // $VF: Compiled from Annotations.kt
   @ExperimentalSerializationApi
   public enum class Mode {
      NEVER,
      ALWAYS;

      @JvmStatic
      fun getEntries(): EnumEntries<EncodeDefault.Mode> {
         $ENTRIES
      }
   }
}
