package kotlinx.serialization

import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target
import kotlin.reflect.KClass

// $VF: Compiled from Annotations.kt
@Retention(RetentionPolicy.CLASS)
@Target([])
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
@kotlin.annotation.Target(allowedTargets = [AnnotationTarget.FILE])
annotation class UseContextualSerialization(
   val forClasses: Array<out KClass<*>>
)
