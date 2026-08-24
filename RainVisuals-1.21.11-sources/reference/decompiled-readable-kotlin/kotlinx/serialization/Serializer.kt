package kotlinx.serialization

import java.lang.annotation.Documented
import java.lang.annotation.ElementType
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target
import kotlin.reflect.KClass

// $VF: Compiled from Annotations.kt
@Documented
@Retention(AnnotationRetention.BINARY)
@MustBeDocumented
@Target([ElementType.TYPE])
@ExperimentalSerializationApi
@kotlin.annotation.Target(allowedTargets = [AnnotationTarget.CLASS])
@java.lang.annotation.Retention(RetentionPolicy.CLASS)
annotation class Serializer(
   val forClass: KClass<*>
)
