package kotlinx.serialization

import java.lang.annotation.Documented
import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target
import kotlin.reflect.KClass

// $VF: Compiled from Annotations.kt
@Documented
@Retention(RetentionPolicy.RUNTIME)
@MustBeDocumented
@Target([ElementType.TYPE, ElementType.TYPE_USE])
@kotlin.annotation.Target(allowedTargets = [AnnotationTarget.PROPERTY, AnnotationTarget.CLASS, AnnotationTarget.TYPE])
annotation class Serializable(
   val with: KClass<out KSerializer<*>> = KSerializer::class.java
)
