/*
 * Decompiled with CFR 0.152.
 */
package kotlin.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.Target;

@Retention(value=RetentionPolicy.RUNTIME)
@Target(allowedTargets={AnnotationTarget.ANNOTATION_CLASS})
@java.lang.annotation.Target(value={ElementType.ANNOTATION_TYPE})
@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2={"Lkotlin/annotation/Repeatable;", "", "<init>", "()V", "kotlin-stdlib"})
public @interface Repeatable {
}

