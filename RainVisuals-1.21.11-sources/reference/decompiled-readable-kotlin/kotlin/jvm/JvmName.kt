package kotlin.jvm

import java.lang.annotation.Documented
import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy

// $VF: Compiled from JvmPlatformAnnotations.kt
@Target(allowedTargets = [AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.FILE])
@java.lang.annotation.Target([ElementType.METHOD])
@Retention(RetentionPolicy.CLASS)
@Documented
@MustBeDocumented
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
annotation class JvmName(
   val name: String
)
