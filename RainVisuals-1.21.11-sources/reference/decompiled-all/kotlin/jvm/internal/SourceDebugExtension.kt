package kotlin.jvm.internal

import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target

// $VF: Compiled from SourceDebugExtension.kt
@Retention(RetentionPolicy.CLASS)
@Target([ElementType.TYPE])
@kotlin.annotation.Target(allowedTargets = [AnnotationTarget.CLASS])
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
@SinceKotlin(version = "1.8")
annotation class SourceDebugExtension(
   val value: Array<String>
)
