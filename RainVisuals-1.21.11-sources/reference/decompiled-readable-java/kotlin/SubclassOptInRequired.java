/*
 * Decompiled with CFR 0.152.
 */
package kotlin;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import kotlin.ExperimentalSubclassOptIn;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.Retention;
import kotlin.annotation.Target;

@java.lang.annotation.Retention(value=RetentionPolicy.CLASS)
@Target(allowedTargets={AnnotationTarget.CLASS})
@Retention(value=AnnotationRetention.BINARY)
@java.lang.annotation.Target(value={ElementType.TYPE})
@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00028\u0006\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006\u00a8\u0006\u0007"}, d2={"Lkotlin/SubclassOptInRequired;", "", "Lkotlin/reflect/KClass;", "markerClass", "<init>", "(Lkotlin/reflect/KClass;)V", "()Ljava/lang/Class;", "kotlin-stdlib"})
@ExperimentalSubclassOptIn
@SinceKotlin(version="1.8")
public @interface SubclassOptInRequired {
    public Class<? extends Annotation> markerClass();
}

