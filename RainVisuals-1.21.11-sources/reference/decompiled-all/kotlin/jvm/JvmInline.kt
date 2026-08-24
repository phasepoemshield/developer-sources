package kotlin.jvm

import java.lang.annotation.Documented
import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target

// $VF: Compiled from JvmPlatformAnnotations.kt
@Retention(RetentionPolicy.RUNTIME)
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
@Target([ElementType.TYPE])
@Documented
@kotlin.annotation.Target(allowedTargets = [AnnotationTarget.CLASS])
@MustBeDocumented
@SinceKotlin(version = "1.5")
annotation class JvmInline(

)
