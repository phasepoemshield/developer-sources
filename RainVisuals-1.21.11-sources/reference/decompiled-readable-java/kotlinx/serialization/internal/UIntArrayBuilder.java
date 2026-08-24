/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.UIntArray;
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
@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\u0002H\u0010\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0010\u00a2\u0006\u0004\b\u0011\u0010\nR\u001c\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0006\n\u0004\b\u0013\u0010\u0014R$\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000f8\u0010@RX\u0090\u000e\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u000b\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b!\u00a8\u0006\u001a"}, d2={"Lkotlinx/serialization/internal/UIntArrayBuilder;", "Lkotlinx/serialization/internal/PrimitiveArrayBuilder;", "Lkotlin/UIntArray;", "bufferWithData", "<init>", "([ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lkotlin/UInt;", "c", "", "append-WZ4Q5Ns$kotlinx_serialization_core", "(I)V", "append", "build--hP7Qyg$kotlinx_serialization_core", "()[I", "build", "", "requiredCapacity", "ensureCapacity$kotlinx_serialization_core", "ensureCapacity", "buffer", "[I", "<set-?>", "position", "I", "getPosition$kotlinx_serialization_core", "()I", "kotlinx-serialization-core"})
@ExperimentalUnsignedTypes
@PublishedApi
public final class UIntArrayBuilder
extends PrimitiveArrayBuilder<UIntArray> {
    @NotNull
    private int[] buffer;
    private int position;

    public /* synthetic */ UIntArrayBuilder(int[] bufferWithData, DefaultConstructorMarker $constructor_marker) {
        this(bufferWithData);
    }

    @NotNull
    public int[] build--hP7Qyg$kotlinx_serialization_core() {
        int[] nArray = Arrays.copyOf(this.buffer, this.getPosition$kotlinx_serialization_core());
        Intrinsics.checkNotNullExpressionValue(nArray, "copyOf(...)");
        return UIntArray.constructor-impl(nArray);
    }

    @Override
    public void ensureCapacity$kotlinx_serialization_core(int requiredCapacity) {
        if (UIntArray.getSize-impl(this.buffer) < requiredCapacity) {
            int[] nArray = Arrays.copyOf(this.buffer, RangesKt.coerceAtLeast(requiredCapacity, UIntArray.getSize-impl(this.buffer) * 2));
            Intrinsics.checkNotNullExpressionValue(nArray, "copyOf(...)");
            this.buffer = UIntArray.constructor-impl(nArray);
        }
    }

    /*
     * WARNING - void declaration
     */
    public final void append-WZ4Q5Ns$kotlinx_serialization_core(int c) {
        void var1_1;
        PrimitiveArrayBuilder.ensureCapacity$kotlinx_serialization_core$default(this, 0, 1, null);
        int n = this.getPosition$kotlinx_serialization_core();
        this.position = n + 1;
        UIntArray.set-VXSXFK8(this.buffer, n, (int)var1_1);
    }

    @Override
    public int getPosition$kotlinx_serialization_core() {
        return this.position;
    }

    private UIntArrayBuilder(int[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.buffer = bufferWithData;
        this.position = UIntArray.getSize-impl(bufferWithData);
        this.ensureCapacity$kotlinx_serialization_core(10);
    }
}

