package kotlin.jvm

import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target

// $VF: Compiled from JvmDefault.kt
@Retention(RetentionPolicy.RUNTIME)
@Target([ElementType.METHOD])
@Deprecated(message = "Switch to new -Xjvm-default modes: `all` or `all-compatibility`", level = DeprecationLevel.ERROR)
@kotlin.annotation.Target(allowedTargets = [AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY])
@SinceKotlin(version = "1.2")
annotation class JvmDefault(

)
