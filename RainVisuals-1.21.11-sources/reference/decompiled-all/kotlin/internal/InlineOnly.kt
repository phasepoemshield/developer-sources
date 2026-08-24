package kotlin.internal

import java.lang.annotation.ElementType
import java.lang.annotation.RetentionPolicy

// $VF: Compiled from Annotations.kt
@Retention(AnnotationRetention.BINARY)
@Target(allowedTargets = [AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER])
@java.lang.annotation.Target([ElementType.METHOD])
@java.lang.annotation.Retention(RetentionPolicy.CLASS)
annotation class InlineOnly(

)
