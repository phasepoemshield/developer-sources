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
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0096\u0002\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\u0010\u0010\fR\u0014\u0010\u0013\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0004\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0006\u0010\u0014\u00a8\u0006\u0016"}, d2={"Lkotlin/sequences/SubSequence;", "T", "Lkotlin/sequences/Sequence;", "Lkotlin/sequences/DropTakeSequence;", "sequence", "", "startIndex", "endIndex", "<init>", "(Lkotlin/sequences/Sequence;II)V", "n", "drop", "(I)Lkotlin/sequences/Sequence;", "", "iterator", "()Ljava/util/Iterator;", "take", "getCount", "()I", "count", "I", "Lkotlin/sequences/Sequence;", "kotlin-stdlib"})
public final class SubSequence<T>
implements Sequence<T>,
DropTakeSequence<T> {
    private final int endIndex;
    private final int startIndex;
    @NotNull
    private final Sequence<T> sequence;

    private final int getCount() {
        return this.endIndex - this.startIndex;
    }

    public static final /* synthetic */ Sequence access$getSequence$p(SubSequence $this) {
        return $this.sequence;
    }

    public SubSequence(@NotNull Sequence<? extends T> sequence, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.sequence = sequence;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        boolean bl = this.startIndex >= 0;
        if (!bl) {
            boolean $i$a$-require-SubSequence$42 = false;
            String $i$a$-require-SubSequence$42 = "startIndex should be non-negative, but is " + this.startIndex;
            throw new IllegalArgumentException($i$a$-require-SubSequence$42.toString());
        }
        bl = this.endIndex >= 0;
        if (!bl) {
            boolean $i$a$-require-SubSequence$52 = false;
            String $i$a$-require-SubSequence$52 = "endIndex should be non-negative, but is " + this.endIndex;
            throw new IllegalArgumentException($i$a$-require-SubSequence$52.toString());
        }
        bl = this.endIndex >= this.startIndex;
        if (!bl) {
            boolean bl2 = false;
            String string = "endIndex should be not less than startIndex, but was " + this.endIndex + " < " + this.startIndex;
            throw new IllegalArgumentException(string.toString());
        }
    }

    @Override
    @NotNull
    public Sequence<T> take(int n) {
        return n >= this.getCount() ? (Sequence)this : (Sequence)new SubSequence<T>(this.sequence, this.startIndex, this.startIndex + n);
    }

    public static final /* synthetic */ int access$getStartIndex$p(SubSequence $this) {
        return $this.startIndex;
    }

    public static final /* synthetic */ int access$getEndIndex$p(SubSequence $this) {
        return $this.endIndex;
    }

    @Override
    @NotNull
    public Sequence<T> drop(int n) {
        return n >= this.getCount() ? SequencesKt.emptySequence() : (Sequence)new SubSequence<T>(this.sequence, this.startIndex + n, this.endIndex);
    }

    @Override
    @NotNull
    public Iterator<T> iterator() {
        return new Iterator<T>(this){
            private int position;
            @NotNull
            private final Iterator<T> iterator;
            final /* synthetic */ SubSequence<T> this$0;

            @NotNull
            public final Iterator<T> getIterator() {
                return this.iterator;
            }
            {
                this.this$0 = $receiver;
                this.iterator = SubSequence.access$getSequence$p($receiver).iterator();
            }

            public T next() {
                this.drop();
                if (this.position >= SubSequence.access$getEndIndex$p(this.this$0)) {
                    throw new NoSuchElementException();
                }
                int n = this.position;
                this.position = n + 1;
                return this.iterator.next();
            }

            public boolean hasNext() {
                this.drop();
                return this.position < SubSequence.access$getEndIndex$p(this.this$0) && this.iterator.hasNext();
            }

            public final void setPosition(int n) {
                this.position = n;
            }

            private final void drop() {
                while (this.position < SubSequence.access$getStartIndex$p(this.this$0) && this.iterator.hasNext()) {
                    this.iterator.next();
                    int n = this.position;
                    this.position = n + 1;
                }
            }

            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            public final int getPosition() {
                return this.position;
            }
        };
    }
}

