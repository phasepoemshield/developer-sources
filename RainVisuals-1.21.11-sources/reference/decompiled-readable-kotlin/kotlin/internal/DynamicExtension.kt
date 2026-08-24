package kotlin.internal

import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy

// $VF: Compiled from Annotations.kt
@Retention(RetentionPolicy.CLASS)
@Target(allowedTargets = [AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY])
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
@java.lang.annotation.Target([ElementType.METHOD])
annotation class DynamicExtension(

)
