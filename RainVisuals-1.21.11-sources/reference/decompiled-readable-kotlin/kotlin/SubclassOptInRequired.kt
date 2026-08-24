package kotlin

import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import kotlin.reflect.KClass

// $VF: Compiled from OptIn.kt
@Retention(RetentionPolicy.CLASS)
@Target(allowedTargets = [AnnotationTarget.CLASS])
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
@java.lang.annotation.Target([ElementType.TYPE])
@ExperimentalSubclassOptIn
@SinceKotlin(version = "1.8")
annotation class SubclassOptInRequired(
   val markerClass: KClass<out Annotation>
)
