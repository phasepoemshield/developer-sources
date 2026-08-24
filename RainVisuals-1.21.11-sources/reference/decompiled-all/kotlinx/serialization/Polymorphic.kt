package kotlinx.serialization

import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target

// $VF: Compiled from Annotations.kt
@Target([ElementType.TYPE, ElementType.TYPE_USE])
@Retention(RetentionPolicy.RUNTIME)
@kotlin.annotation.Target(allowedTargets = [AnnotationTarget.PROPERTY, AnnotationTarget.TYPE, AnnotationTarget.CLASS])
annotation class Polymorphic(

)
