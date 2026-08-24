package kotlinx.serialization

import java.lang.annotation.Documented
import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target

// $VF: Compiled from Annotations.kt
@Target([ElementType.TYPE, ElementType.METHOD])
@kotlin.annotation.Target(allowedTargets = [AnnotationTarget.CLASS, AnnotationTarget.PROPERTY, AnnotationTarget.FUNCTION, AnnotationTarget.TYPEALIAS])
@MustBeDocumented
@Documented
@Retention(RetentionPolicy.RUNTIME)
@RequiresOptIn(level = RequiresOptIn.Level.WARNING)
annotation class ExperimentalSerializationApi(

)
