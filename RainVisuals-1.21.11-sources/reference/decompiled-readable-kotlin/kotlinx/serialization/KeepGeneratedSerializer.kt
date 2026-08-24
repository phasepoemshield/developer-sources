package kotlinx.serialization

import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target

// $VF: Compiled from Annotations.kt
@Retention(RetentionPolicy.RUNTIME)
@Target([ElementType.TYPE])
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
@InternalSerializationApi
@kotlin.annotation.Target(allowedTargets = [AnnotationTarget.CLASS])
annotation class KeepGeneratedSerializer(

)
