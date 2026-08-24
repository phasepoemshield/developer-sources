package kotlin.jvm

import java.lang.annotation.Documented
import java.lang.annotation.RetentionPolicy

// $VF: Compiled from JvmPlatformAnnotations.kt
@MustBeDocumented
@Target(allowedTargets = [AnnotationTarget.FILE])
@java.lang.annotation.Target([])
@Retention(AnnotationRetention.SOURCE)
@java.lang.annotation.Retention(RetentionPolicy.SOURCE)
@Documented
@SinceKotlin(version = "1.2")
annotation class JvmPackageName(
   val name: String
)
