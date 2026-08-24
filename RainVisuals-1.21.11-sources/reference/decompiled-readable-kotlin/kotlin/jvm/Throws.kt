package kotlin.jvm

import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import kotlin.reflect.KClass

// $VF: Compiled from JvmPlatformAnnotations.kt
@Target(allowedTargets = [AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.CONSTRUCTOR])
@java.lang.annotation.Target([ElementType.METHOD, ElementType.CONSTRUCTOR])
@Retention(RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
annotation class Throws(
   val exceptionClasses: Array<out KClass<out Throwable>>
)
