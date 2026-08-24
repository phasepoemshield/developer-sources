/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.UShortArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.internal.PrimitiveArrayBuilder;
import org.jetbrains.annotations.NotNull;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@ExperimentalSerializationApi
@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\u0002H\u0010\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0010\u00a2\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0006\n\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000f8\u0010@RX\u0090\u000e\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u000b\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b!\u00a8\u0006\u001b"}, d2={"Lkotlinx/serialization/internal/UShortArrayBuilder;", "Lkotlinx/serialization/internal/PrimitiveArrayBuilder;", "Lkotlin/UShortArray;", "bufferWithData", "<init>", "([SLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lkotlin/UShort;", "c", "", "append-xj2QHRw$kotlinx_serialization_core", "(S)V", "append", "build-amswpOA$kotlinx_serialization_core", "()[S", "build", "", "requiredCapacity", "ensureCapacity$kotlinx_serialization_core", "(I)V", "ensureCapacity", "buffer", "[S", "<set-?>", "position", "I", "getPosition$kotlinx_serialization_core", "()I", "kotlinx-serialization-core"})
@ExperimentalUnsignedTypes
@PublishedApi
public final class UShortArrayBuilder
extends PrimitiveArrayBuilder<UShortArray> {
    private int position;
    @NotNull
    private short[] buffer;

    @NotNull
    public short[] build-amswpOA$kotlinx_serialization_core() {
        short[] sArray = Arrays.copyOf(this.buffer, this.getPosition$kotlinx_serialization_core());
        Intrinsics.checkNotNullExpressionValue(sArray, "copyOf(...)");
        return UShortArray.constructor-impl(sArray);
    }

    @Override
    public int getPosition$kotlinx_serialization_core() {
        return this.position;
    }

    @Override
    public void ensureCapacity$kotlinx_serialization_core(int requiredCapacity) {
        if (UShortArray.getSize-impl(this.buffer) < requiredCapacity) {
            short[] sArray = Arrays.copyOf(this.buffer, RangesKt.coerceAtLeast(requiredCapacity, UShortArray.getSize-impl(this.buffer) * 2));
            Intrinsics.checkNotNullExpressionValue(sArray, "copyOf(...)");
            this.buffer = UShortArray.constructor-impl(sArray);
        }
    }

    /*
     * WARNING - void declaration
     */
    public final void append-xj2QHRw$kotlinx_serialization_core(short c) {
        void var1_1;
        PrimitiveArrayBuilder.ensureCapacity$kotlinx_serialization_core$default(this, 0, 1, null);
        int n = this.getPosition$kotlinx_serialization_core();
        this.position = n + 1;
        UShortArray.set-01HTLdE(this.buffer, n, (short)var1_1);
    }

    private UShortArrayBuilder(short[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.buffer = bufferWithData;
        this.position = UShortArray.getSize-impl(bufferWithData);
        this.ensureCapacity$kotlinx_serialization_core(10);
    }

    public /* synthetic */ UShortArrayBuilder(short[] bufferWithData, DefaultConstructorMarker $constructor_marker) {
        this(bufferWithData);
    }
}

