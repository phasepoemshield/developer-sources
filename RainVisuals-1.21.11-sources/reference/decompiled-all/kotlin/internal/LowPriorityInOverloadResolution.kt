package kotlin.internal

import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy

// $VF: Compiled from Annotations.kt
@Target(allowedTargets = [AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY, AnnotationTarget.CONSTRUCTOR])
@Retention(RetentionPolicy.CLASS)
@java.lang.annotation.Target([ElementType.METHOD, ElementType.CONSTRUCTOR])
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
annotation class LowPriorityInOverloadResolution(

)
