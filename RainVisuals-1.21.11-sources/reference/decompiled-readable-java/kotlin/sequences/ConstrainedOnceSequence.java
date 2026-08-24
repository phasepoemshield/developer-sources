/*
 * Decompiled with CFR 0.152.
 */
package kotlin.sequences;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0096\u0002\u00a2\u0006\u0004\b\u0007\u0010\bR.\u0010\u000b\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000 \n*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00020\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2={"Lkotlin/sequences/ConstrainedOnceSequence;", "T", "Lkotlin/sequences/Sequence;", "sequence", "<init>", "(Lkotlin/sequences/Sequence;)V", "", "iterator", "()Ljava/util/Iterator;", "Ljava/util/concurrent/atomic/AtomicReference;", "kotlin.jvm.PlatformType", "sequenceRef", "Ljava/util/concurrent/atomic/AtomicReference;", "kotlin-stdlib"})
public final class ConstrainedOnceSequence<T>
implements Sequence<T> {
    @NotNull
    private final AtomicReference<Sequence<T>> sequenceRef;

    @Override
    @NotNull
    public Iterator<T> iterator() {
        Sequence sequence = this.sequenceRef.getAndSet(null);
        if (sequence == null) {
            throw new IllegalStateException("This sequence can be consumed only once.");
        }
        Sequence sequence2 = sequence;
        return sequence2.iterator();
    }

    public ConstrainedOnceSequence(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.sequenceRef = new AtomicReference<Sequence<? extends T>>(sequence);
    }
}

