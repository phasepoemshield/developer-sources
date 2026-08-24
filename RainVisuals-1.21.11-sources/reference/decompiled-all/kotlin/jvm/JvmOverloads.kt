package kotlin.jvm

import java.lang.annotation.Documented
import java.lang.annotation.ElementType
import java.lang.annotation.RetentionPolicy

// $VF: Compiled from JvmPlatformAnnotations.kt
@Target(allowedTargets = [AnnotationTarget.FUNCTION, AnnotationTarget.CONSTRUCTOR])
@java.lang.annotation.Target([ElementType.METHOD, ElementType.CONSTRUCTOR])
@Documented
@Retention(AnnotationRetention.BINARY)
@MustBeDocumented
@java.lang.annotation.Retention(RetentionPolicy.CLASS)
annotation class JvmOverloads(

)
