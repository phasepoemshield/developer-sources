/*
 * Decompiled with CFR 0.152.
 */
package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0096\u0002\u00a2\u0006\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0006\u0010\fR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0003\u0010\r\u00a8\u0006\u000e"}, d2={"Lkotlin/sequences/DropWhileSequence;", "T", "Lkotlin/sequences/Sequence;", "sequence", "Lkotlin/Function1;", "", "predicate", "<init>", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)V", "", "iterator", "()Ljava/util/Iterator;", "Lkotlin/jvm/functions/Function1;", "Lkotlin/sequences/Sequence;", "kotlin-stdlib"})
public final class DropWhileSequence<T>
implements Sequence<T> {
    @NotNull
    private final Function1<T, Boolean> predicate;
    @NotNull
    private final Sequence<T> sequence;

    public static final /* synthetic */ Function1 access$getPredicate$p(DropWhileSequence $this) {
        return $this.predicate;
    }

    public static final /* synthetic */ Sequence access$getSequence$p(DropWhileSequence $this) {
        return $this.sequence;
    }

    public DropWhileSequence(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        this.sequence = sequence;
        this.predicate = predicate;
    }

    @Override
    @NotNull
    public Iterator<T> iterator() {
        return new Iterator<T>(this){
            @Nullable
            private T nextItem;
            final /* synthetic */ DropWhileSequence<T> this$0;
            @NotNull
            private final Iterator<T> iterator;
            private int dropState;

            private final void drop() {
                while (this.iterator.hasNext()) {
                    T item = this.iterator.next();
                    if (((Boolean)DropWhileSequence.access$getPredicate$p(this.this$0).invoke(item)).booleanValue()) continue;
                    this.nextItem = item;
                    this.dropState = 1;
                    return;
                }
                this.dropState = 0;
            }
            {
                this.this$0 = $receiver;
                this.iterator = DropWhileSequence.access$getSequence$p($receiver).iterator();
                this.dropState = -1;
            }

            public final void setDropState(int n) {
                this.dropState = n;
            }

            @NotNull
            public final Iterator<T> getIterator() {
                return this.iterator;
            }

            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Nullable
            public final T getNextItem() {
                return this.nextItem;
            }

            public boolean hasNext() {
                if (this.dropState == -1) {
                    this.drop();
                }
                return this.dropState == 1 || this.iterator.hasNext();
            }

            /*
             * WARNING - void declaration
             */
            public T next() {
                if (this.dropState == -1) {
                    this.drop();
                }
                if (this.dropState == 1) {
                    void var1_1;
                    T result = this.nextItem;
                    this.nextItem = null;
                    this.dropState = 0;
                    return var1_1;
                }
                return this.iterator.next();
            }

            public final void setNextItem(@Nullable T t) {
                this.nextItem = t;
            }

            public final int getDropState() {
                return this.dropState;
            }
        };
    }
}

