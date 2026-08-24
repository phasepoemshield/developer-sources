/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PrimitiveSpreadBuilder;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0004\b\t\u0010\u0006J\r\u0010\n\u001a\u00020\u0002\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\u0003*\u00020\u0002H\u0014\u00a2\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2={"Lkotlin/jvm/internal/IntSpreadBuilder;", "Lkotlin/jvm/internal/PrimitiveSpreadBuilder;", "", "", "size", "<init>", "(I)V", "value", "", "add", "toArray", "()[I", "getSize", "([I)I", "values", "[I", "kotlin-stdlib"})
public final class IntSpreadBuilder
extends PrimitiveSpreadBuilder<int[]> {
    @NotNull
    private final int[] values;

    @NotNull
    public final int[] toArray() {
        return this.toArray(this.values, new int[this.size()]);
    }

    public final void add(int value) {
        int n = this.getPosition();
        this.setPosition(n + 1);
        this.values[n] = value;
    }

    public IntSpreadBuilder(int size) {
        super(size);
        this.values = new int[size];
    }

    @Override
    protected int getSize(@NotNull int[] $this$getSize) {
        Intrinsics.checkNotNullParameter($this$getSize, "<this>");
        return $this$getSize.length;
    }
}

