package kotlin.experimental

import java.lang.annotation.Documented
import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target

// $VF: Compiled from inferenceMarker.kt
@Target([ElementType.ANNOTATION_TYPE])
@MustBeDocumented
@Retention(RetentionPolicy.CLASS)
@Documented
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
@kotlin.annotation.Target(allowedTargets = [AnnotationTarget.ANNOTATION_CLASS])
@SinceKotlin(version = "1.3")
@RequiresOptIn(level = RequiresOptIn.Level.ERROR)
annotation class ExperimentalTypeInference(

)
