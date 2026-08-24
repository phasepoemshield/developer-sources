package kotlin.internal

import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy

// $VF: Compiled from InternalAnnotations.kt
@Retention(RetentionPolicy.CLASS)
@Target(allowedTargets = [AnnotationTarget.FUNCTION])
@java.lang.annotation.Target([ElementType.METHOD])
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
annotation class PlatformDependent(

)
