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

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u00a2\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0010\u00a2\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0010\u00a2\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000f8\u0010@RX\u0090\u000e\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001b"}, d2={"Lkotlinx/serialization/internal/CharArrayBuilder;", "Lkotlinx/serialization/internal/PrimitiveArrayBuilder;", "", "bufferWithData", "<init>", "([C)V", "", "c", "", "append$kotlinx_serialization_core", "(C)V", "append", "build$kotlinx_serialization_core", "()[C", "build", "", "requiredCapacity", "ensureCapacity$kotlinx_serialization_core", "(I)V", "ensureCapacity", "buffer", "[C", "<set-?>", "position", "I", "getPosition$kotlinx_serialization_core", "()I", "kotlinx-serialization-core"})
@PublishedApi
public final class CharArrayBuilder
extends PrimitiveArrayBuilder<char[]> {
    private int position;
    @NotNull
    private char[] buffer;

    public CharArrayBuilder(@NotNull char[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.buffer = bufferWithData;
        this.position = bufferWithData.length;
        this.ensureCapacity$kotlinx_serialization_core(10);
    }

    @Override
    public int getPosition$kotlinx_serialization_core() {
        return this.position;
    }

    @Override
    @NotNull
    public char[] build$kotlinx_serialization_core() {
        char[] cArray = Arrays.copyOf(this.buffer, this.getPosition$kotlinx_serialization_core());
        Intrinsics.checkNotNullExpressionValue(cArray, "copyOf(...)");
        return cArray;
    }

    /*
     * WARNING - void declaration
     */
    public final void append$kotlinx_serialization_core(char c) {
        void var1_1;
        PrimitiveArrayBuilder.ensureCapacity$kotlinx_serialization_core$default(this, 0, 1, null);
        int n = this.getPosition$kotlinx_serialization_core();
        this.position = n + 1;
        this.buffer[n] = var1_1;
    }

    @Override
    public void ensureCapacity$kotlinx_serialization_core(int requiredCapacity) {
        if (this.buffer.length < requiredCapacity) {
            char[] cArray = Arrays.copyOf(this.buffer, RangesKt.coerceAtLeast(requiredCapacity, this.buffer.length * 2));
            Intrinsics.checkNotNullExpressionValue(cArray, "copyOf(...)");
            this.buffer = cArray;
        }
    }
}

