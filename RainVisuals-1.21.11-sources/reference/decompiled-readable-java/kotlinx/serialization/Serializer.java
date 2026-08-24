/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.MustBeDocumented;
import kotlinx.serialization.ExperimentalSerializationApi;

@Documented
@kotlin.annotation.Retention(value=AnnotationRetention.BINARY)
@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005R\u0015\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006\u00a8\u0006\u0007"}, d2={"Lkotlinx/serialization/Serializer;", "", "Lkotlin/reflect/KClass;", "forClass", "<init>", "(Lkotlin/reflect/KClass;)V", "()Ljava/lang/Class;", "kotlinx-serialization-core"})
@MustBeDocumented
@Target(value={ElementType.TYPE})
@ExperimentalSerializationApi
@kotlin.annotation.Target(allowedTargets={AnnotationTarget.CLASS})
@Retention(value=RetentionPolicy.CLASS)
public @interface Serializer {
    public Class<?> forClass();
}

