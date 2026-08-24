package kotlin.jvm

import java.lang.annotation.Documented
import java.lang.annotation.ElementType
import java.lang.annotation.RetentionPolicy

// $VF: Compiled from JvmPlatformAnnotations.kt
@Retention(AnnotationRetention.SOURCE)
@Target(allowedTargets = [AnnotationTarget.CLASS])
@Documented
@MustBeDocumented
@java.lang.annotation.Target([ElementType.TYPE])
@java.lang.annotation.Retention(RetentionPolicy.SOURCE)
@SinceKotlin(version = "1.5")
annotation class JvmRecord(

)
