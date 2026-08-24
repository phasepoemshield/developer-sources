/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.ListLikeDescriptor;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2={"Lkotlinx/serialization/internal/PrimitiveArrayDescriptor;", "Lkotlinx/serialization/internal/ListLikeDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "primitive", "<init>", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "serialName", "Ljava/lang/String;", "getSerialName", "()Ljava/lang/String;", "kotlinx-serialization-core"})
public final class PrimitiveArrayDescriptor
extends ListLikeDescriptor {
    @NotNull
    private final String serialName;

    @Override
    @NotNull
    public String getSerialName() {
        return this.serialName;
    }

    public PrimitiveArrayDescriptor(@NotNull SerialDescriptor primitive) {
        Intrinsics.checkNotNullParameter(primitive, "primitive");
        super(primitive, null);
        this.serialName = primitive.getSerialName() + "Array";
    }
}

