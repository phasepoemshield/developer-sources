/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J/\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00032\u001a\u0010\u0004\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\"\u0006\u0012\u0002\b\u00030\u0003H&\u00a2\u0006\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2={"Lkotlinx/serialization/internal/SerializerFactory;", "", "", "Lkotlinx/serialization/KSerializer;", "typeParamsSerializers", "serializer", "([Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "kotlinx-serialization-core"})
@Deprecated(message="Inserted into generated code and should not be used directly", level=DeprecationLevel.HIDDEN)
public interface SerializerFactory {
    @NotNull
    public KSerializer<?> serializer(KSerializer<?> ... var1);
}

