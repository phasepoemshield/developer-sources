/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096\u0002\u00a2\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0016\u0010\r\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2={"Lkotlin/jvm/internal/ArrayIntIterator;", "Lkotlin/collections/IntIterator;", "", "array", "<init>", "([I)V", "", "hasNext", "()Z", "", "nextInt", "()I", "[I", "index", "I", "kotlin-stdlib"})
final class ArrayIntIterator
extends IntIterator {
    @NotNull
    private final int[] array;
    private int index;

    public ArrayIntIterator(@NotNull int[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.array = array;
    }

    @Override
    public int nextInt() {
        int n;
        try {
            n = this.index;
            this.index = n + 1;
            n = this.array[n];
        }
        catch (ArrayIndexOutOfBoundsException e) {
            --this.index;
            throw new NoSuchElementException(e.getMessage());
        }
        return n;
    }

    @Override
    public boolean hasNext() {
        return this.index < this.array.length;
    }
}

