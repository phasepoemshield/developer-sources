package kotlin.annotation

import java.lang.annotation.Documented
import java.lang.annotation.ElementType
import java.lang.annotation.RetentionPolicy

// $VF: Compiled from Annotations.kt
@java.lang.annotation.Target([ElementType.ANNOTATION_TYPE])
@MustBeDocumented
@Target(allowedTargets = [AnnotationTarget.ANNOTATION_CLASS])
@java.lang.annotation.Retention(RetentionPolicy.RUNTIME)
@Documented
annotation class Target(
   val allowedTargets: Array<out AnnotationTarget>
)
