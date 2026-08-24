package kotlin

import java.lang.annotation.Documented
import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target

// $VF: Compiled from Annotations.kt
@MustBeDocumented
@Documented
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
@Target([ElementType.ANNOTATION_TYPE])
@kotlin.annotation.Target(allowedTargets = [AnnotationTarget.ANNOTATION_CLASS])
@SinceKotlin(version = "1.1")
annotation class DslMarker(

)
