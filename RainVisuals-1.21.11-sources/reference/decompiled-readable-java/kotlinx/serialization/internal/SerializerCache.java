/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J%\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H&\u00a2\u0006\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2={"Lkotlinx/serialization/internal/SerializerCache;", "T", "", "Lkotlin/reflect/KClass;", "key", "Lkotlinx/serialization/KSerializer;", "get", "(Lkotlin/reflect/KClass;)Lkotlinx/serialization/KSerializer;", "kotlinx-serialization-core"})
public interface SerializerCache<T> {
    @Nullable
    public KSerializer<T> get(@NotNull KClass<Object> var1);
}

