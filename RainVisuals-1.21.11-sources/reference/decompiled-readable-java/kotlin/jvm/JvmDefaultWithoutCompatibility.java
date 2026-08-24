/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.Retention;
import kotlin.annotation.Target;

@Target(allowedTargets={AnnotationTarget.CLASS})
@java.lang.annotation.Retention(value=RetentionPolicy.SOURCE)
@java.lang.annotation.Target(value={ElementType.TYPE})
@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2={"Lkotlin/jvm/JvmDefaultWithoutCompatibility;", "", "<init>", "()V", "kotlin-stdlib"})
@Retention(value=AnnotationRetention.SOURCE)
@SinceKotlin(version="1.4")
public @interface JvmDefaultWithoutCompatibility {
}

