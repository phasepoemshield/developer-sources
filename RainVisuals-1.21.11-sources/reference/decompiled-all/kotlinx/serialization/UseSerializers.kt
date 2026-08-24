package kotlinx.serialization

import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target
import kotlin.reflect.KClass

// $VF: Compiled from Annotations.kt
@Retention(AnnotationRetention.BINARY)
@Target([])
@kotlin.annotation.Target(allowedTargets = [AnnotationTarget.FILE])
@java.lang.annotation.Retention(RetentionPolicy.CLASS)
annotation class UseSerializers(
   val serializerClasses: Array<out KClass<out KSerializer<*>>>
)
