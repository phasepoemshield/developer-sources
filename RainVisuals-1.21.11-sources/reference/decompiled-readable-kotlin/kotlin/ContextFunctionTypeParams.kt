package kotlin

import java.lang.annotation.Documented
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target

// $VF: Compiled from Annotations.kt
@MustBeDocumented
@Documented
@Target([])
@kotlin.annotation.Target(allowedTargets = [AnnotationTarget.TYPE])
@Retention(RetentionPolicy.RUNTIME)
@SinceKotlin(version = "1.7")
annotation class ContextFunctionTypeParams(
   val count: Int
)
