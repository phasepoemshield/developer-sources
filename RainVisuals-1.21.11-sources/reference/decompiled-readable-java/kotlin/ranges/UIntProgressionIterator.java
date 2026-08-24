/*
 * Decompiled with CFR 0.152.
 */
package kotlin.ranges;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0002\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\u0002H\u0096\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\n\u0010\u0011R\u0019\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00f8\u0001\u0000\u00a2\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0006\n\u0004\b\u0006\u0010\u0010\u0082\u0002\u0004\n\u0002\b!\u00a8\u0006\u0012"}, d2={"Lkotlin/ranges/UIntProgressionIterator;", "", "Lkotlin/UInt;", "first", "last", "", "step", "<init>", "(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "hasNext", "()Z", "next-pVg5ArA", "()I", "next", "finalElement", "I", "Z", "kotlin-stdlib"})
@SinceKotlin(version="1.3")
final class UIntProgressionIterator
implements Iterator<UInt>,
KMappedMarker {
    private final int finalElement;
    private final int step;
    private boolean hasNext;
    private int next;

    @Override
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ UIntProgressionIterator(int first, int last, int step, DefaultConstructorMarker $constructor_marker) {
        this(first, last, step);
    }

    private UIntProgressionIterator(int first, int last, int step) {
        this.finalElement = last;
        this.hasNext = step > 0 ? Integer.compareUnsigned(first, last) <= 0 : Integer.compareUnsigned(first, last) >= 0;
        this.step = UInt.constructor-impl(step);
        this.next = this.hasNext ? first : this.finalElement;
    }

    /*
     * WARNING - void declaration
     */
    public int next-pVg5ArA() {
        void var1_1;
        int value = this.next;
        if (value == this.finalElement) {
            if (!this.hasNext) {
                throw new NoSuchElementException();
            }
            this.hasNext = false;
        } else {
            this.next = UInt.constructor-impl(this.next + this.step);
        }
        return (int)var1_1;
    }
}

