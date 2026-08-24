/*
 * Decompiled with CFR 0.152.
 */
package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0086\u0002\u00a2\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086\u0002\u00a2\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0004\u0010\u000f\u00a8\u0006\u0010"}, d2={"Lkotlin/collections/IndexingIterator;", "T", "", "Lkotlin/collections/IndexedValue;", "iterator", "<init>", "(Ljava/util/Iterator;)V", "", "hasNext", "()Z", "next", "()Lkotlin/collections/IndexedValue;", "", "index", "I", "Ljava/util/Iterator;", "kotlin-stdlib"})
public final class IndexingIterator<T>
implements Iterator<IndexedValue<? extends T>>,
KMappedMarker {
    private int index;
    @NotNull
    private final Iterator<T> iterator;

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    @NotNull
    public final IndexedValue<T> next() {
        int n = this.index;
        this.index = n + 1;
        if (n < 0) {
            CollectionsKt.throwIndexOverflow();
        }
        return new IndexedValue<T>(n, this.iterator.next());
    }

    @Override
    public final boolean hasNext() {
        return this.iterator.hasNext();
    }

    public IndexingIterator(@NotNull Iterator<? extends T> iterator2) {
        Intrinsics.checkNotNullParameter(iterator2, "iterator");
        this.iterator = iterator2;
    }
}

