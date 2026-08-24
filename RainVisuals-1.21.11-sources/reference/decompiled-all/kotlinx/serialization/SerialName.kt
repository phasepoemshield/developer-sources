package kotlinx.serialization

import java.lang.annotation.Documented
import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target

// $VF: Compiled from Annotations.kt
@MustBeDocumented
@Target([ElementType.TYPE])
@Documented
@Retention(RetentionPolicy.RUNTIME)
@kotlin.annotation.Target(allowedTargets = [AnnotationTarget.PROPERTY, AnnotationTarget.CLASS])
annotation class SerialName(
   val value: String
)
