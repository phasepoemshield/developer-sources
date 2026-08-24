/*
 * Decompiled with CFR 0.152.
 */
package kotlin.ranges;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.ULong;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0002\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\u0002H\u0096\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\n\u0010\u0011R\u0019\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00f8\u0001\u0000\u00a2\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0006\n\u0004\b\u0006\u0010\u0010\u0082\u0002\u0004\n\u0002\b!\u00a8\u0006\u0012"}, d2={"Lkotlin/ranges/ULongProgressionIterator;", "", "Lkotlin/ULong;", "first", "last", "", "step", "<init>", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "hasNext", "()Z", "next-s-VKNKU", "()J", "next", "finalElement", "J", "Z", "kotlin-stdlib"})
@SinceKotlin(version="1.3")
final class ULongProgressionIterator
implements Iterator<ULong>,
KMappedMarker {
    private long next;
    private boolean hasNext;
    private final long finalElement;
    private final long step;

    private ULongProgressionIterator(long first, long last, long step) {
        this.finalElement = last;
        this.hasNext = step > 0L ? Long.compareUnsigned(first, last) <= 0 : Long.compareUnsigned(first, last) >= 0;
        this.step = ULong.constructor-impl(step);
        this.next = this.hasNext ? first : this.finalElement;
    }

    /*
     * WARNING - void declaration
     */
    public long next-s-VKNKU() {
        void var1_1;
        long value = this.next;
        if (value == this.finalElement) {
            if (!this.hasNext) {
                throw new NoSuchElementException();
            }
            this.hasNext = false;
        } else {
            this.next = ULong.constructor-impl(this.next + this.step);
        }
        return (long)var1_1;
    }

    public /* synthetic */ ULongProgressionIterator(long first, long last, long step, DefaultConstructorMarker $constructor_marker) {
        this(first, last, step);
    }

    @Override
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

