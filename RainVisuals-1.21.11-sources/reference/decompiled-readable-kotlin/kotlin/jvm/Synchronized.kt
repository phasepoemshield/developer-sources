package kotlin.jvm

import java.lang.annotation.Documented
import java.lang.annotation.ElementType
import java.lang.annotation.RetentionPolicy

// $VF: Compiled from JvmFlagAnnotations.kt
@Target(allowedTargets = [AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER])
@java.lang.annotation.Target([ElementType.METHOD])
@Retention(AnnotationRetention.SOURCE)
@Documented
@java.lang.annotation.Retention(RetentionPolicy.SOURCE)
@MustBeDocumented
annotation class Synchronized(

)
