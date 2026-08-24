package kotlin

import java.lang.annotation.Documented
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target

// $VF: Compiled from Annotations.kt
@Target([])
@kotlin.annotation.Target(allowedTargets = [])
@Retention(AnnotationRetention.BINARY)
@java.lang.annotation.Retention(RetentionPolicy.CLASS)
@Documented
@MustBeDocumented
annotation class ReplaceWith(
   val expression: String,
   val imports: Array<out String>
)
