/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002\u00a2\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\n8\u0016X\u0096D\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\u00a8\u0006\u0013"}, d2={"Lkotlinx/serialization/internal/InlineClassDescriptor;", "Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;", "", "name", "Lkotlinx/serialization/internal/GeneratedSerializer;", "generatedSerializer", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "isInline", "Z", "()Z", "kotlinx-serialization-core"})
@PublishedApi
public final class InlineClassDescriptor
extends PluginGeneratedSerialDescriptor {
    private final boolean isInline;

    @Override
    public int hashCode() {
        return super.hashCode() * 31;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean equals(@Nullable Object other) {
        boolean bl;
        block13: {
            SerialDescriptor $this$equalsImpl$iv = this;
            boolean $i$f$equalsImpl = false;
            if ($this$equalsImpl$iv == other) {
                bl = true;
            } else if (!(other instanceof InlineClassDescriptor)) {
                bl = false;
            } else if (!Intrinsics.areEqual($this$equalsImpl$iv.getSerialName(), ((SerialDescriptor)other).getSerialName())) {
                bl = false;
            } else {
                InlineClassDescriptor otherDescriptor = (InlineClassDescriptor)other;
                boolean bl2 = false;
                if (!(otherDescriptor.isInline() && Arrays.equals(this.getTypeParameterDescriptors$kotlinx_serialization_core(), otherDescriptor.getTypeParameterDescriptors$kotlinx_serialization_core()))) {
                    bl = false;
                } else if ($this$equalsImpl$iv.getElementsCount() != ((SerialDescriptor)other).getElementsCount()) {
                    bl = false;
                } else {
                    int index$iv = 0;
                    int n = $this$equalsImpl$iv.getElementsCount();
                    while (index$iv < n) {
                        void var6_7;
                        if (!Intrinsics.areEqual($this$equalsImpl$iv.getElementDescriptor(index$iv).getSerialName(), ((SerialDescriptor)other).getElementDescriptor(index$iv).getSerialName())) {
                            bl = false;
                            break block13;
                        }
                        if (!Intrinsics.areEqual($this$equalsImpl$iv.getElementDescriptor(index$iv).getKind(), ((SerialDescriptor)other).getElementDescriptor(index$iv).getKind())) {
                            bl = false;
                            break block13;
                        }
                        ++var6_7;
                    }
                    bl = true;
                }
            }
        }
        return bl;
    }

    @Override
    public boolean isInline() {
        return this.isInline;
    }

    public InlineClassDescriptor(@NotNull String name, @NotNull GeneratedSerializer<?> generatedSerializer) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(generatedSerializer, "generatedSerializer");
        super(name, generatedSerializer, 1);
        this.isInline = true;
    }
}

