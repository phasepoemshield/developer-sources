/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

@Retention(value=RetentionPolicy.CLASS)
@Target(value={ElementType.TYPE})
@kotlin.annotation.Target(allowedTargets={AnnotationTarget.CLASS})
@kotlin.annotation.Retention(value=AnnotationRetention.BINARY)
@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0007\u00a8\u0006\b"}, d2={"Lkotlin/jvm/internal/SourceDebugExtension;", "", "", "", "value", "<init>", "(Lkotlin/Array;)V", "()[Ljava/lang/String;", "kotlin-stdlib"})
@SinceKotlin(version="1.8")
public @interface SourceDebugExtension {
    public String[] value();
}

