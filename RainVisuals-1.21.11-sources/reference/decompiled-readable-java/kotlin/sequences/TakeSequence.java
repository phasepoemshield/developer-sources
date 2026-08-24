/*
 * Decompiled with CFR 0.152.
 */
package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.DropTakeSequence;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.sequences.SubSequence;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010(\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0096\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0004\u0010\u0011\u00a8\u0006\u0012"}, d2={"Lkotlin/sequences/TakeSequence;", "T", "Lkotlin/sequences/Sequence;", "Lkotlin/sequences/DropTakeSequence;", "sequence", "", "count", "<init>", "(Lkotlin/sequences/Sequence;I)V", "n", "drop", "(I)Lkotlin/sequences/Sequence;", "", "iterator", "()Ljava/util/Iterator;", "take", "I", "Lkotlin/sequences/Sequence;", "kotlin-stdlib"})
public final class TakeSequence<T>
implements Sequence<T>,
DropTakeSequence<T> {
    @NotNull
    private final Sequence<T> sequence;
    private final int count;

    @Override
    @NotNull
    public Iterator<T> iterator() {
        return new Iterator<T>(this){
            @NotNull
            private final Iterator<T> iterator;
            private int left;

            @NotNull
            public final Iterator<T> getIterator() {
                return this.iterator;
            }

            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            public final void setLeft(int n) {
                this.left = n;
            }

            public T next() {
                if (this.left == 0) {
                    throw new NoSuchElementException();
                }
                int n = this.left;
                this.left = n + -1;
                return this.iterator.next();
            }
            {
                this.left = TakeSequence.access$getCount$p($receiver);
                this.iterator = TakeSequence.access$getSequence$p($receiver).iterator();
            }

            public final int getLeft() {
                return this.left;
            }

            public boolean hasNext() {
                return this.left > 0 && this.iterator.hasNext();
            }
        };
    }

    public static final /* synthetic */ int access$getCount$p(TakeSequence $this) {
        return $this.count;
    }

    @Override
    @NotNull
    public Sequence<T> take(int n) {
        return n >= this.count ? (Sequence)this : (Sequence)new TakeSequence<T>(this.sequence, n);
    }

    public static final /* synthetic */ Sequence access$getSequence$p(TakeSequence $this) {
        return $this.sequence;
    }

    @Override
    @NotNull
    public Sequence<T> drop(int n) {
        return n >= this.count ? SequencesKt.emptySequence() : (Sequence)new SubSequence<T>(this.sequence, n, this.count);
    }

    public TakeSequence(@NotNull Sequence<? extends T> sequence, int count) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.sequence = sequence;
        this.count = count;
        boolean bl = this.count >= 0;
        if (!bl) {
            boolean bl2 = false;
            String string = "count must be non-negative, but was " + this.count + '.';
            throw new IllegalArgumentException(string.toString());
        }
    }
}

