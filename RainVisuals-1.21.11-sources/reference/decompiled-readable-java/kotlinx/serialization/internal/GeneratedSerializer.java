/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0019\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0003H&\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0003H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0005\u00a8\u0006\u0007"}, d2={"Lkotlinx/serialization/internal/GeneratedSerializer;", "T", "Lkotlinx/serialization/KSerializer;", "", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "typeParametersSerializers", "kotlinx-serialization-core"})
@InternalSerializationApi
public interface GeneratedSerializer<T>
extends KSerializer<T> {
    @NotNull
    public KSerializer<?>[] typeParametersSerializers();

    @NotNull
    public KSerializer<?>[] childSerializers();

    @Metadata(mv={1, 9, 0}, k=3, xi=48)
    public static final class DefaultImpls {
        @NotNull
        public static <T> KSerializer<?>[] typeParametersSerializers(@NotNull GeneratedSerializer<T> $this) {
            return PluginHelperInterfacesKt.EMPTY_SERIALIZER_ARRAY;
        }
    }
}

