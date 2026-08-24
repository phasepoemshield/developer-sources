package kotlin.jvm

import java.lang.annotation.Documented
import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target

// $VF: Compiled from JvmPlatformAnnotations.kt
@Target([ElementType.FIELD])
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
@kotlin.annotation.Target(allowedTargets = [AnnotationTarget.FIELD])
@MustBeDocumented
@Documented
annotation class JvmField(

)
