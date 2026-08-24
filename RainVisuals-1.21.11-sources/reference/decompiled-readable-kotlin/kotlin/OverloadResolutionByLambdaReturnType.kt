package kotlin

import java.lang.annotation.ElementType
import java.lang.annotation.RetentionPolicy
import kotlin.experimental.ExperimentalTypeInference

// $VF: Compiled from Inference.kt
@Retention(AnnotationRetention.BINARY)
@Target(allowedTargets = [AnnotationTarget.FUNCTION])
@java.lang.annotation.Target([ElementType.METHOD])
@java.lang.annotation.Retention(RetentionPolicy.CLASS)
@SinceKotlin(version = "1.4")
@ExperimentalTypeInference
annotation class OverloadResolutionByLambdaReturnType(

)
