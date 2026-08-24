package kotlin.jvm

import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target

// $VF: Compiled from JvmPlatformAnnotations.kt
@Retention(RetentionPolicy.SOURCE)
@Target([ElementType.FIELD, ElementType.METHOD])
@kotlin.annotation.Target(allowedTargets = [AnnotationTarget.FILE, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.FIELD])
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
annotation class JvmSynthetic(

)
