/*
 * Decompiled with CFR 0.152.
 */
package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0006\u00a2\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0096\u0002\u00a2\u0006\u0004\b\u000b\u0010\fR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0007\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0003\u0010\u000f\u00a8\u0006\u0010"}, d2={"Lkotlin/sequences/FilteringSequence;", "T", "Lkotlin/sequences/Sequence;", "sequence", "", "sendWhen", "Lkotlin/Function1;", "predicate", "<init>", "(Lkotlin/sequences/Sequence;ZLkotlin/jvm/functions/Function1;)V", "", "iterator", "()Ljava/util/Iterator;", "Lkotlin/jvm/functions/Function1;", "Z", "Lkotlin/sequences/Sequence;", "kotlin-stdlib"})
public final class FilteringSequence<T>
implements Sequence<T> {
    @NotNull
    private final Sequence<T> sequence;
    private final boolean sendWhen;
    @NotNull
    private final Function1<T, Boolean> predicate;

    public static final /* synthetic */ Sequence access$getSequence$p(FilteringSequence $this) {
        return $this.sequence;
    }

    public /* synthetic */ FilteringSequence(Sequence sequence, boolean bl, Function1 function1, int n, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 2) != 0) {
            bl = true;
        }
        this(sequence, bl, function1);
    }

    public static final /* synthetic */ Function1 access$getPredicate$p(FilteringSequence $this) {
        return $this.predicate;
    }

    @Override
    @NotNull
    public Iterator<T> iterator() {
        return new Iterator<T>(this){
            @NotNull
            private final Iterator<T> iterator;
            final /* synthetic */ FilteringSequence<T> this$0;
            @Nullable
            private T nextItem;
            private int nextState;

            public boolean hasNext() {
                if (this.nextState == -1) {
                    this.calcNext();
                }
                return this.nextState == 1;
            }
            {
                this.this$0 = $receiver;
                this.iterator = FilteringSequence.access$getSequence$p($receiver).iterator();
                this.nextState = -1;
            }

            @Nullable
            public final T getNextItem() {
                return this.nextItem;
            }

            public final void setNextState(int n) {
                this.nextState = n;
            }

            @NotNull
            public final Iterator<T> getIterator() {
                return this.iterator;
            }

            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            public final void setNextItem(@Nullable T t) {
                this.nextItem = t;
            }

            /*
             * WARNING - void declaration
             */
            public T next() {
                void var1_1;
                if (this.nextState == -1) {
                    this.calcNext();
                }
                if (this.nextState == 0) {
                    throw new NoSuchElementException();
                }
                T result = this.nextItem;
                this.nextItem = null;
                this.nextState = -1;
                return var1_1;
            }

            public final int getNextState() {
                return this.nextState;
            }

            private final void calcNext() {
                while (this.iterator.hasNext()) {
                    T item = this.iterator.next();
                    if ((Boolean)FilteringSequence.access$getPredicate$p(this.this$0).invoke(item) != FilteringSequence.access$getSendWhen$p(this.this$0)) continue;
                    this.nextItem = item;
                    this.nextState = 1;
                    return;
                }
                this.nextState = 0;
            }
        };
    }

    public FilteringSequence(@NotNull Sequence<? extends T> sequence, boolean sendWhen, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        this.sequence = sequence;
        this.sendWhen = sendWhen;
        this.predicate = predicate;
    }

    public static final /* synthetic */ boolean access$getSendWhen$p(FilteringSequence $this) {
        return $this.sendWhen;
    }
}

