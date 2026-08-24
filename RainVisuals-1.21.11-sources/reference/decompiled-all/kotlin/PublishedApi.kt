package kotlin

import java.lang.annotation.Documented
import java.lang.annotation.ElementType
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target

// $VF: Compiled from Annotations.kt
@Target([ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR])
@MustBeDocumented
@kotlin.annotation.Target(allowedTargets = [AnnotationTarget.CLASS, AnnotationTarget.CONSTRUCTOR, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY])
@Documented
@Retention(AnnotationRetention.BINARY)
@java.lang.annotation.Retention(RetentionPolicy.CLASS)
@SinceKotlin(version = "1.1")
annotation class PublishedApi(

)
