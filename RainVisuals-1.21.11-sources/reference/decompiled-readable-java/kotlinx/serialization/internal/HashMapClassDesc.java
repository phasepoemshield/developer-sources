/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.MapLikeDescriptor;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2={"Lkotlinx/serialization/internal/HashMapClassDesc;", "Lkotlinx/serialization/internal/MapLikeDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "keyDesc", "valueDesc", "<init>", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "kotlinx-serialization-core"})
public final class HashMapClassDesc
extends MapLikeDescriptor {
    public HashMapClassDesc(@NotNull SerialDescriptor keyDesc, @NotNull SerialDescriptor valueDesc) {
        Intrinsics.checkNotNullParameter(keyDesc, "keyDesc");
        Intrinsics.checkNotNullParameter(valueDesc, "valueDesc");
        super("kotlin.collections.HashMap", keyDesc, valueDesc, null);
    }
}

