/*
 * Decompiled with CFR 0.152.
 */
package kotlin;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.MustBeDocumented;
import kotlin.annotation.Target;

@MustBeDocumented
@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\u0002\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\bR\u0011\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\bR\u0011\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\b\u00a8\u0006\t"}, d2={"Lkotlin/DeprecatedSinceKotlin;", "", "", "warningSince", "errorSince", "hiddenSince", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "()Ljava/lang/String;", "kotlin-stdlib"})
@Retention(value=RetentionPolicy.RUNTIME)
@java.lang.annotation.Target(value={ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
@Target(allowedTargets={AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY, AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CONSTRUCTOR, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.TYPEALIAS})
@Documented
@SinceKotlin(version="1.4")
public @interface DeprecatedSinceKotlin {
    public String hiddenSince() default "";

    public String warningSince() default "";

    public String errorSince() default "";
}

