package kotlin.jvm

import java.lang.annotation.Documented
import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target

// $VF: Compiled from JvmFlagAnnotations.kt
@Target([ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR])
@kotlin.annotation.Target(allowedTargets = [AnnotationTarget.FUNCTION, AnnotationTarget.CONSTRUCTOR, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.CLASS])
@Retention(RetentionPolicy.SOURCE)
@Documented
@MustBeDocumented
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
annotation class Strictfp(

)
