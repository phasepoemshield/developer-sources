/*
 * Decompiled with CFR 0.152.
 */
package kotlin.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.MustBeDocumented;

@java.lang.annotation.Target(value={ElementType.ANNOTATION_TYPE})
@MustBeDocumented
@Target(allowedTargets={AnnotationTarget.ANNOTATION_CLASS})
@Retention(value=RetentionPolicy.RUNTIME)
@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00028\u0006\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0007\u00a8\u0006\b"}, d2={"Lkotlin/annotation/Target;", "", "", "Lkotlin/annotation/AnnotationTarget;", "allowedTargets", "<init>", "(Lkotlin/Array;)V", "()[Lkotlin/annotation/AnnotationTarget;", "kotlin-stdlib"})
@Documented
public @interface Target {
    public AnnotationTarget[] allowedTargets();
}

