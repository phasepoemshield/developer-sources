/*
 * Decompiled with CFR 0.152.
 */
package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B=\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00020\u000bH\u0096\u0002\u00a2\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0006\u0010\u000eR&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\b\u0010\u000f\u00a8\u0006\u0010"}, d2={"Lkotlin/sequences/MergingSequence;", "T1", "T2", "V", "Lkotlin/sequences/Sequence;", "sequence1", "sequence2", "Lkotlin/Function2;", "transform", "<init>", "(Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function2;)V", "", "iterator", "()Ljava/util/Iterator;", "Lkotlin/sequences/Sequence;", "Lkotlin/jvm/functions/Function2;", "kotlin-stdlib"})
public final class MergingSequence<T1, T2, V>
implements Sequence<V> {
    @NotNull
    private final Sequence<T2> sequence2;
    @NotNull
    private final Function2<T1, T2, V> transform;
    @NotNull
    private final Sequence<T1> sequence1;

    public static final /* synthetic */ Function2 access$getTransform$p(MergingSequence $this) {
        return $this.transform;
    }

    public static final /* synthetic */ Sequence access$getSequence1$p(MergingSequence $this) {
        return $this.sequence1;
    }

    public MergingSequence(@NotNull Sequence<? extends T1> sequence1, @NotNull Sequence<? extends T2> sequence2, @NotNull Function2<? super T1, ? super T2, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(sequence1, "sequence1");
        Intrinsics.checkNotNullParameter(sequence2, "sequence2");
        Intrinsics.checkNotNullParameter(transform, "transform");
        this.sequence1 = sequence1;
        this.sequence2 = sequence2;
        this.transform = transform;
    }

    @Override
    @NotNull
    public Iterator<V> iterator() {
        return new Iterator<V>(this){
            @NotNull
            private final Iterator<T1> iterator1;
            @NotNull
            private final Iterator<T2> iterator2;
            final /* synthetic */ MergingSequence<T1, T2, V> this$0;

            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @NotNull
            public final Iterator<T1> getIterator1() {
                return this.iterator1;
            }

            public boolean hasNext() {
                return this.iterator1.hasNext() && this.iterator2.hasNext();
            }
            {
                this.this$0 = $receiver;
                this.iterator1 = MergingSequence.access$getSequence1$p($receiver).iterator();
                this.iterator2 = MergingSequence.access$getSequence2$p($receiver).iterator();
            }

            public V next() {
                return (V)MergingSequence.access$getTransform$p(this.this$0).invoke(this.iterator1.next(), this.iterator2.next());
            }

            @NotNull
            public final Iterator<T2> getIterator2() {
                return this.iterator2;
            }
        };
    }

    public static final /* synthetic */ Sequence access$getSequence2$p(MergingSequence $this) {
        return $this.sequence2;
    }
}

