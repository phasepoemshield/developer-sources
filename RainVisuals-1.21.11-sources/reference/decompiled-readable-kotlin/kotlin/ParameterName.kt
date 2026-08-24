package kotlin

import java.lang.annotation.Documented
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy

// $VF: Compiled from Annotations.kt
@Target(allowedTargets = [AnnotationTarget.TYPE])
@Documented
@MustBeDocumented
@java.lang.annotation.Target([])
@Retention(RetentionPolicy.RUNTIME)
@SinceKotlin(version = "1.1")
annotation class ParameterName(
   val name: String
)
