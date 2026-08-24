/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization;

import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.Retention;
import kotlin.annotation.Target;

@java.lang.annotation.Retention(value=RetentionPolicy.CLASS)
@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0002\u0018\u00002\u00020\u0001B#\u0012\u001a\u0010\u0004\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\"\u0006\u0012\u0002\b\u00030\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\u00028\u0006\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0007\u00a8\u0006\b"}, d2={"Lkotlinx/serialization/UseContextualSerialization;", "", "", "Lkotlin/reflect/KClass;", "forClasses", "<init>", "(Lkotlin/Array;)V", "()[Ljava/lang/Class;", "kotlinx-serialization-core"})
@java.lang.annotation.Target(value={})
@Retention(value=AnnotationRetention.BINARY)
@Target(allowedTargets={AnnotationTarget.FILE})
public @interface UseContextualSerialization {
    public Class<?>[] forClasses();
}

