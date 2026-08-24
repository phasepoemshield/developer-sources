package kotlin.jvm

import java.lang.annotation.Documented
import java.lang.annotation.ElementType
import java.lang.annotation.RetentionPolicy

// $VF: Compiled from JvmPlatformAnnotations.kt
@Retention(AnnotationRetention.BINARY)
@Documented
@java.lang.annotation.Retention(RetentionPolicy.CLASS)
@Target(allowedTargets = [AnnotationTarget.CLASS])
@java.lang.annotation.Target([ElementType.TYPE])
@MustBeDocumented
@SinceKotlin(version = "1.9")
@ExperimentalMultiplatform
annotation class ImplicitlyActualizedByJvmDeclaration(

)
