package kotlin.jvm

import java.lang.annotation.Documented
import java.lang.annotation.ElementType
import java.lang.annotation.RetentionPolicy

// $VF: Compiled from JvmPlatformAnnotations.kt
@Target(allowedTargets = [AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY, AnnotationTarget.TYPE])
@Retention(AnnotationRetention.BINARY)
@Documented
@java.lang.annotation.Retention(RetentionPolicy.CLASS)
@java.lang.annotation.Target([ElementType.TYPE, ElementType.METHOD])
@MustBeDocumented
annotation class JvmSuppressWildcards(
   val suppress: Boolean = true
)
