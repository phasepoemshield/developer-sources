/*
 * Decompiled with CFR 0.152.
 */
package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0096\u0002\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00140\u0003\u00a2\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0006\u0010\u0010R\u0014\u0010\u001b\u001a\u00020\u00188VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00038\u0006\u00a2\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u0016\u00a8\u0006\u001e"}, d2={"Lkotlin/collections/ArrayAsCollection;", "T", "", "", "values", "", "isVarargs", "<init>", "([Ljava/lang/Object;Z)V", "element", "contains", "(Ljava/lang/Object;)Z", "elements", "containsAll", "(Ljava/util/Collection;)Z", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "", "toArray", "()[Ljava/lang/Object;", "Z", "", "getSize", "()I", "size", "[Ljava/lang/Object;", "getValues", "kotlin-stdlib"})
final class ArrayAsCollection<T>
implements Collection<T>,
KMappedMarker {
    @NotNull
    private final T[] values;
    private final boolean isVarargs;

    @Override
    @NotNull
    public final Object[] toArray() {
        return CollectionsKt.copyToArrayOfAny(this.values, this.isVarargs);
    }

    @Override
    public boolean retainAll(Collection<? extends Object> elements) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return CollectionToArray.toArray(this, array);
    }

    @Override
    public boolean removeAll(Collection<? extends Object> elements) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        boolean bl;
        block3: {
            Intrinsics.checkNotNullParameter(elements, "elements");
            Iterable $this$all$iv = elements;
            boolean $i$f$all = false;
            if (((Collection)$this$all$iv).isEmpty()) {
                bl = true;
            } else {
                Iterator iterator2 = $this$all$iv.iterator();
                while (iterator2.hasNext()) {
                    void var6_6;
                    Object element$iv;
                    Object it = element$iv = iterator2.next();
                    boolean bl2 = false;
                    if (this.contains(var6_6)) continue;
                    bl = false;
                    break block3;
                }
                bl = true;
            }
        }
        return bl;
    }

    public int getSize() {
        return this.values.length;
    }

    @Override
    public boolean isEmpty() {
        return this.values.length == 0;
    }

    @Override
    public boolean remove(Object element) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean contains(Object element) {
        return ArraysKt.contains(this.values, element);
    }

    @Override
    public boolean addAll(Collection<? extends T> elements) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public ArrayAsCollection(@NotNull T[] values2, boolean isVarargs) {
        Intrinsics.checkNotNullParameter(values2, "values");
        this.values = values2;
        this.isVarargs = isVarargs;
    }

    @Override
    public boolean add(T element) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean isVarargs() {
        return this.isVarargs;
    }

    @NotNull
    public final T[] getValues() {
        return this.values;
    }

    @Override
    @NotNull
    public Iterator<T> iterator() {
        return ArrayIteratorKt.iterator(this.values);
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

