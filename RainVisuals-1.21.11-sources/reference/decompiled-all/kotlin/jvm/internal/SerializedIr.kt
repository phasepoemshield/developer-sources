package kotlin.jvm.internal

import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target

// $VF: Compiled from SerializedIr.kt
@Retention(RetentionPolicy.CLASS)
@Target([ElementType.TYPE])
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
@kotlin.annotation.Target(allowedTargets = [AnnotationTarget.CLASS])
@SinceKotlin(version = "1.6")
annotation class SerializedIr(
   val bytes: Array<String> = []
)
