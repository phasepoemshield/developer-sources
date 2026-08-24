/*
 * Decompiled with CFR 0.152.
 */
package kotlin.internal;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.Repeatable;
import kotlin.internal.RequireKotlinVersionKind;
import kotlin.jvm.internal.RepeatableContainer;

@Retention(value=RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(value=AnnotationRetention.SOURCE)
@kotlin.annotation.Target(allowedTargets={AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY, AnnotationTarget.CONSTRUCTOR, AnnotationTarget.TYPEALIAS})
@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0081\u0002\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\rR\u0011\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u000fR\u0011\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u000fR\u0011\u0010\b\u001a\u00020\u00078\u0006\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\u0010\u00a8\u0006\u0011"}, d2={"Lkotlin/internal/RequireKotlin;", "", "", "version", "message", "Lkotlin/DeprecationLevel;", "level", "Lkotlin/internal/RequireKotlinVersionKind;", "versionKind", "", "errorCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/DeprecationLevel;Lkotlin/internal/RequireKotlinVersionKind;I)V", "()I", "()Lkotlin/DeprecationLevel;", "()Ljava/lang/String;", "()Lkotlin/internal/RequireKotlinVersionKind;", "kotlin-stdlib"})
@java.lang.annotation.Repeatable(value=Container.class)
@Repeatable
@Target(value={ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
@SinceKotlin(version="1.2")
public @interface RequireKotlin {
    public int errorCode() default -1;

    public DeprecationLevel level() default DeprecationLevel.ERROR;

    public String version();

    public RequireKotlinVersionKind versionKind() default RequireKotlinVersionKind.LANGUAGE_VERSION;

    public String message() default "";

    @kotlin.annotation.Target(allowedTargets={AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY, AnnotationTarget.CONSTRUCTOR, AnnotationTarget.TYPEALIAS})
    @kotlin.annotation.Retention(value=AnnotationRetention.SOURCE)
    @Metadata(mv={1, 9, 0}, k=3, xi=48)
    @RepeatableContainer
    @Retention(value=RetentionPolicy.SOURCE)
    @Target(value={ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
    public static @interface Container {
        public RequireKotlin[] value();
    }
}

