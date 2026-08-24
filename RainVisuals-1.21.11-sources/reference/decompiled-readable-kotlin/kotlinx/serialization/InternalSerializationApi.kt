package kotlinx.serialization

import java.lang.annotation.Documented
import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy

// $VF: Compiled from Annotations.kt
@Retention(RetentionPolicy.RUNTIME)
@Target(allowedTargets = [AnnotationTarget.CLASS, AnnotationTarget.PROPERTY, AnnotationTarget.FUNCTION, AnnotationTarget.TYPEALIAS])
@Documented
@java.lang.annotation.Target([ElementType.TYPE, ElementType.METHOD])
@MustBeDocumented
@RequiresOptIn(level = RequiresOptIn.Level.ERROR)
annotation class InternalSerializationApi(

)
