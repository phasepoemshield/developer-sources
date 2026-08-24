package kotlin.jvm

import java.lang.annotation.Documented
import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target

// $VF: Compiled from JvmFlagAnnotations.kt
@MustBeDocumented
@Target([ElementType.FIELD])
@Retention(RetentionPolicy.SOURCE)
@Documented
@kotlin.annotation.Target(allowedTargets = [AnnotationTarget.FIELD])
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
annotation class Transient(

)
