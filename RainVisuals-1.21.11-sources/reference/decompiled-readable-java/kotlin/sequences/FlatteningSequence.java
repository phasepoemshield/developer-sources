/*
 * Decompiled with CFR 0.152.
 */
package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004BC\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\b0\u0006\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00020\bH\u0096\u0002\u00a2\u0006\u0004\b\t\u0010\fR&\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\b0\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\t\u0010\rR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0005\u0010\u000eR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0007\u0010\r\u00a8\u0006\u000f"}, d2={"Lkotlin/sequences/FlatteningSequence;", "T", "R", "E", "Lkotlin/sequences/Sequence;", "sequence", "Lkotlin/Function1;", "transformer", "", "iterator", "<init>", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "()Ljava/util/Iterator;", "Lkotlin/jvm/functions/Function1;", "Lkotlin/sequences/Sequence;", "kotlin-stdlib"})
public final class FlatteningSequence<T, R, E>
implements Sequence<E> {
    @NotNull
    private final Sequence<T> sequence;
    @NotNull
    private final Function1<T, R> transformer;
    @NotNull
    private final Function1<R, Iterator<E>> iterator;

    @Override
    @NotNull
    public Iterator<E> iterator() {
        return new Iterator<E>(this){
            final /* synthetic */ FlatteningSequence<T, R, E> this$0;
            @NotNull
            private final Iterator<T> iterator;
            @Nullable
            private Iterator<? extends E> itemIterator;

            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Nullable
            public final Iterator<E> getItemIterator() {
                return this.itemIterator;
            }

            public final void setItemIterator(@Nullable Iterator<? extends E> iterator2) {
                this.itemIterator = iterator2;
            }

            @NotNull
            public final Iterator<T> getIterator() {
                return this.iterator;
            }

            public E next() {
                if (!this.ensureItemIterator()) {
                    throw new NoSuchElementException();
                }
                Iterator<E> iterator2 = this.itemIterator;
                Intrinsics.checkNotNull(iterator2);
                return iterator2.next();
            }
            {
                this.this$0 = $receiver;
                this.iterator = FlatteningSequence.access$getSequence$p($receiver).iterator();
            }

            /*
             * WARNING - void declaration
             */
            private final boolean ensureItemIterator() {
                Iterator<E> iterator2 = this.itemIterator;
                boolean bl = iterator2 != null ? !iterator2.hasNext() : false;
                if (bl) {
                    this.itemIterator = null;
                }
                while (this.itemIterator == null) {
                    void var2_2;
                    if (!this.iterator.hasNext()) {
                        return false;
                    }
                    T element = this.iterator.next();
                    Iterator nextItemIterator = (Iterator)FlatteningSequence.access$getIterator$p(this.this$0).invoke(FlatteningSequence.access$getTransformer$p(this.this$0).invoke(element));
                    if (!nextItemIterator.hasNext()) continue;
                    this.itemIterator = var2_2;
                    return true;
                }
                return true;
            }

            public boolean hasNext() {
                return this.ensureItemIterator();
            }
        };
    }

    public FlatteningSequence(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends R> transformer, @NotNull Function1<? super R, ? extends Iterator<? extends E>> iterator2) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(transformer, "transformer");
        Intrinsics.checkNotNullParameter(iterator2, "iterator");
        this.sequence = sequence;
        this.transformer = transformer;
        this.iterator = iterator2;
    }

    public static final /* synthetic */ Sequence access$getSequence$p(FlatteningSequence $this) {
        return $this.sequence;
    }

    public static final /* synthetic */ Function1 access$getTransformer$p(FlatteningSequence $this) {
        return $this.transformer;
    }

    public static final /* synthetic */ Function1 access$getIterator$p(FlatteningSequence $this) {
        return $this.iterator;
    }
}

