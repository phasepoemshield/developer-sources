package kotlin

import java.lang.annotation.ElementType
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target

// $VF: Compiled from OptIn.kt
@Retention(AnnotationRetention.BINARY)
@Target([ElementType.TYPE])
@kotlin.annotation.Target(allowedTargets = [AnnotationTarget.CLASS])
@java.lang.annotation.Retention(RetentionPolicy.CLASS)
@SinceKotlin(version = "1.8")
annotation class ExperimentalSubclassOptIn(

)
