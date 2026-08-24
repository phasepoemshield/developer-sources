/*
 * Decompiled with CFR 0.152.
 */
package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableList;
import kotlin.collections.CollectionsKt__ReversedViewsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0096\u0002\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010\b\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\u0015\u0010\u0017J\u0017\u0010\u0018\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\u0018\u0010\u0010J \u0010\u0019\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0004\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u00a8\u0006\u001f"}, d2={"Lkotlin/collections/ReversedList;", "T", "Lkotlin/collections/AbstractMutableList;", "", "delegate", "<init>", "(Ljava/util/List;)V", "", "index", "element", "", "add", "(ILjava/lang/Object;)V", "clear", "()V", "get", "(I)Ljava/lang/Object;", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "removeAt", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "Ljava/util/List;", "getSize", "()I", "size", "kotlin-stdlib"})
final class ReversedList<T>
extends AbstractMutableList<T> {
    @NotNull
    private final List<T> delegate;

    @Override
    public T get(int index) {
        return this.delegate.get(CollectionsKt__ReversedViewsKt.access$reverseElementIndex(this, index));
    }

    @Override
    public void clear() {
        this.delegate.clear();
    }

    @Override
    public T removeAt(int index) {
        return this.delegate.remove(CollectionsKt__ReversedViewsKt.access$reverseElementIndex(this, index));
    }

    public static final /* synthetic */ List access$getDelegate$p(ReversedList $this) {
        return $this.delegate;
    }

    @Override
    public void add(int index, T element) {
        this.delegate.add(CollectionsKt__ReversedViewsKt.access$reversePositionIndex(this, index), element);
    }

    @Override
    @NotNull
    public ListIterator<T> listIterator() {
        return this.listIterator(0);
    }

    public ReversedList(@NotNull List<T> delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override
    public int getSize() {
        return this.delegate.size();
    }

    @Override
    @NotNull
    public Iterator<T> iterator() {
        return this.listIterator(0);
    }

    @Override
    public T set(int index, T element) {
        return this.delegate.set(CollectionsKt__ReversedViewsKt.access$reverseElementIndex(this, index), element);
    }

    @Override
    @NotNull
    public ListIterator<T> listIterator(int index) {
        return new ListIterator<T>(this, index){
            @NotNull
            private final ListIterator<T> delegateIterator;
            final /* synthetic */ ReversedList<T> this$0;

            public T next() {
                return this.delegateIterator.previous();
            }

            public T previous() {
                return this.delegateIterator.next();
            }

            @NotNull
            public final ListIterator<T> getDelegateIterator() {
                return this.delegateIterator;
            }

            public void add(T element) {
                this.delegateIterator.add(element);
                this.delegateIterator.previous();
            }

            public boolean hasNext() {
                return this.delegateIterator.hasPrevious();
            }

            public int previousIndex() {
                return CollectionsKt__ReversedViewsKt.access$reverseIteratorIndex(this.this$0, this.delegateIterator.nextIndex());
            }

            public boolean hasPrevious() {
                return this.delegateIterator.hasNext();
            }

            public int nextIndex() {
                return CollectionsKt__ReversedViewsKt.access$reverseIteratorIndex(this.this$0, this.delegateIterator.previousIndex());
            }

            public void set(T element) {
                this.delegateIterator.set(element);
            }
            {
                this.this$0 = $receiver;
                this.delegateIterator = ReversedList.access$getDelegate$p($receiver).listIterator(CollectionsKt__ReversedViewsKt.access$reversePositionIndex($receiver, $index));
            }

            public void remove() {
                this.delegateIterator.remove();
            }
        };
    }
}

