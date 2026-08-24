/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.internal.PrimitiveArrayBuilder;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u00a2\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0010\u00a2\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0006H\u0010\u00a2\u0006\u0004\b\u0010\u0010\nR\u0016\u0010\u0012\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0012\u0010\u0013R$\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00068\u0010@RX\u0090\u000e\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006\u0019"}, d2={"Lkotlinx/serialization/internal/IntArrayBuilder;", "Lkotlinx/serialization/internal/PrimitiveArrayBuilder;", "", "bufferWithData", "<init>", "([I)V", "", "c", "", "append$kotlinx_serialization_core", "(I)V", "append", "build$kotlinx_serialization_core", "()[I", "build", "requiredCapacity", "ensureCapacity$kotlinx_serialization_core", "ensureCapacity", "buffer", "[I", "<set-?>", "position", "I", "getPosition$kotlinx_serialization_core", "()I", "kotlinx-serialization-core"})
@PublishedApi
public final class IntArrayBuilder
extends PrimitiveArrayBuilder<int[]> {
    @NotNull
    private int[] buffer;
    private int position;

    public IntArrayBuilder(@NotNull int[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.buffer = bufferWithData;
        this.position = bufferWithData.length;
        this.ensureCapacity$kotlinx_serialization_core(10);
    }

    @Override
    @NotNull
    public int[] build$kotlinx_serialization_core() {
        int[] nArray = Arrays.copyOf(this.buffer, this.getPosition$kotlinx_serialization_core());
        Intrinsics.checkNotNullExpressionValue(nArray, "copyOf(...)");
        return nArray;
    }

    @Override
    public int getPosition$kotlinx_serialization_core() {
        return this.position;
    }

    @Override
    public void ensureCapacity$kotlinx_serialization_core(int requiredCapacity) {
        if (this.buffer.length < requiredCapacity) {
            int[] nArray = Arrays.copyOf(this.buffer, RangesKt.coerceAtLeast(requiredCapacity, this.buffer.length * 2));
            Intrinsics.checkNotNullExpressionValue(nArray, "copyOf(...)");
            this.buffer = nArray;
        }
    }

    /*
     * WARNING - void declaration
     */
    public final void append$kotlinx_serialization_core(int c) {
        void var1_1;
        PrimitiveArrayBuilder.ensureCapacity$kotlinx_serialization_core$default(this, 0, 1, null);
        int n = this.getPosition$kotlinx_serialization_core();
        this.position = n + 1;
        this.buffer[n] = var1_1;
    }
}

