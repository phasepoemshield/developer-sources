package kotlin

import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import kotlin.experimental.ExperimentalTypeInference

// $VF: Compiled from Inference.kt
@Retention(RetentionPolicy.CLASS)
@Target(allowedTargets = [AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY])
@java.lang.annotation.Target([ElementType.METHOD, ElementType.PARAMETER])
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
@ExperimentalTypeInference
@SinceKotlin(version = "1.3")
annotation class BuilderInference(

)
