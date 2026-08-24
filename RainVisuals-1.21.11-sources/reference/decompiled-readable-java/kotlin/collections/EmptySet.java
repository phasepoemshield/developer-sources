/*
 * Decompiled with CFR 0.152.
 */
package kotlin.collections;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptyIterator;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u00c0\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004B\t\b\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0096\u0002\u00a2\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016\u00a2\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0016\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H\u0096\u0002\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016\u00a2\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020\u00138VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b#\u0010\u0015\u00a8\u0006%"}, d2={"Lkotlin/collections/EmptySet;", "", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "<init>", "()V", "element", "", "contains", "(Ljava/lang/Void;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "readResolve", "()Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "", "serialVersionUID", "J", "getSize", "size", "kotlin-stdlib"})
public final class EmptySet
implements Serializable,
Set,
KMappedMarker {
    private static final long serialVersionUID = 3406603774387020532L;
    @NotNull
    public static final EmptySet INSTANCE = new EmptySet();

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @NotNull
    public String toString() {
        return "[]";
    }

    @Override
    public boolean containsAll(@NotNull Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.isEmpty();
    }

    @Override
    public boolean remove(Object element) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean equals(@Nullable Object other) {
        return other instanceof Set && ((Set)other).isEmpty();
    }

    @Override
    public boolean addAll(Collection elements) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return CollectionToArray.toArray(this, array);
    }

    @Override
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override
    @NotNull
    public Iterator iterator() {
        return EmptyIterator.INSTANCE;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean retainAll(Collection elements) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    private final Object readResolve() {
        return INSTANCE;
    }

    @Override
    public boolean add(Void element) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(@NotNull Void element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return false;
    }

    private EmptySet() {
    }

    public int getSize() {
        return 0;
    }

    @Override
    public boolean removeAll(Collection elements) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

