package kotlin.jvm

import java.lang.annotation.Documented
import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy

// $VF: Compiled from PurelyImplements.kt
@Documented
@Target(allowedTargets = [AnnotationTarget.CLASS])
@MustBeDocumented
@Retention(RetentionPolicy.RUNTIME)
@java.lang.annotation.Target([ElementType.TYPE])
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
annotation class PurelyImplements(
   val value: String
)
