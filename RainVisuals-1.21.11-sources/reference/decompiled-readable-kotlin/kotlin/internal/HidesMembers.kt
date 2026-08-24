package kotlin.internal

import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target

// $VF: Compiled from Annotations.kt
@Target([ElementType.METHOD])
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Target(allowedTargets = [AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY])
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
annotation class HidesMembers(

)
