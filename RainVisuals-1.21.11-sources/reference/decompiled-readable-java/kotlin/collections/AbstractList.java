/*
 * Decompiled with CFR 0.152.
 */
package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.collections.AbstractCollection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010*\n\u0002\b\u000e\b'\u0018\u0000 \"*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0004\"#$%B\t\b\u0004\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002\u00a2\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000bH\u00a6\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0096\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b\u0017\u0010\u0013J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\f\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\b\u0019\u0010\u001bJ%\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020\u000b8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b \u0010\u0010\u00a8\u0006&"}, d2={"Lkotlin/collections/AbstractList;", "E", "Lkotlin/collections/AbstractCollection;", "", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "index", "get", "(I)Ljava/lang/Object;", "hashCode", "()I", "element", "indexOf", "(Ljava/lang/Object;)I", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "getSize", "size", "Companion", "IteratorImpl", "ListIteratorImpl", "SubList", "kotlin-stdlib"})
@SinceKotlin(version="1.1")
public abstract class AbstractList<E>
extends AbstractCollection<E>
implements List<E>,
KMappedMarker {
    private static final int maxArraySize = 0x7FFFFFF7;
    @NotNull
    public static final Companion Companion = new Companion(null);

    @Override
    @NotNull
    public ListIterator<E> listIterator() {
        return new ListIteratorImpl(0);
    }

    @Override
    public abstract E get(int var1);

    @Override
    @NotNull
    public ListIterator<E> listIterator(int index) {
        return new ListIteratorImpl(index);
    }

    @Override
    public int lastIndexOf(E element) {
        int n;
        block1: {
            List $this$indexOfLast$iv = this;
            boolean $i$f$indexOfLast = false;
            ListIterator iterator$iv = $this$indexOfLast$iv.listIterator($this$indexOfLast$iv.size());
            while (iterator$iv.hasPrevious()) {
                Object it = iterator$iv.previous();
                boolean bl = false;
                if (!Intrinsics.areEqual(it, element)) continue;
                n = iterator$iv.nextIndex();
                break block1;
            }
            n = -1;
        }
        return n;
    }

    @Override
    public int hashCode() {
        return Companion.orderedHashCode$kotlin_stdlib(this);
    }

    @Override
    public E remove(int index) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public abstract int getSize();

    protected AbstractList() {
    }

    @Override
    public int indexOf(E element) {
        int n;
        block2: {
            List $this$indexOfFirst$iv = this;
            boolean $i$f$indexOfFirst = false;
            int index$iv = 0;
            Iterator iterator2 = $this$indexOfFirst$iv.iterator();
            while (iterator2.hasNext()) {
                Object item$iv;
                Object it = item$iv = iterator2.next();
                boolean bl = false;
                if (Intrinsics.areEqual(it, element)) {
                    n = index$iv;
                    break block2;
                }
                ++index$iv;
            }
            n = -1;
        }
        return n;
    }

    @Override
    public void add(int index, E element) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    @NotNull
    public List<E> subList(int fromIndex, int toIndex) {
        return new SubList(this, fromIndex, toIndex);
    }

    @Override
    @NotNull
    public Iterator<E> iterator() {
        return new IteratorImpl();
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> elements) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public E set(int index, E element) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean equals(@Nullable Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof List)) {
            return false;
        }
        return Companion.orderedEquals$kotlin_stdlib(this, (Collection)other);
    }

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\b\u0010\u0010\u000eJ'\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\b\u0014\u0010\nJ\u001f\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\b\u0018\u0010\u0019J'\u0010!\u001a\u00020\u001e2\n\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u001b2\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001bH\u0000\u00a2\u0006\u0004\b\u001f\u0010 J\u001b\u0010$\u001a\u00020\u00042\n\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u001bH\u0000\u00a2\u0006\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020\u00048\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b%\u0010&\u00a8\u0006'"}, d2={"Lkotlin/collections/AbstractList$Companion;", "", "<init>", "()V", "", "startIndex", "endIndex", "size", "", "checkBoundsIndexes$kotlin_stdlib", "(III)V", "checkBoundsIndexes", "index", "checkElementIndex$kotlin_stdlib", "(II)V", "checkElementIndex", "checkPositionIndex$kotlin_stdlib", "checkPositionIndex", "fromIndex", "toIndex", "checkRangeIndexes$kotlin_stdlib", "checkRangeIndexes", "oldCapacity", "minCapacity", "newCapacity$kotlin_stdlib", "(II)I", "newCapacity", "", "c", "other", "", "orderedEquals$kotlin_stdlib", "(Ljava/util/Collection;Ljava/util/Collection;)Z", "orderedEquals", "orderedHashCode$kotlin_stdlib", "(Ljava/util/Collection;)I", "orderedHashCode", "maxArraySize", "I", "kotlin-stdlib"})
    public static final class Companion {
        private Companion() {
        }

        public final int orderedHashCode$kotlin_stdlib(@NotNull Collection<?> c) {
            int n;
            Intrinsics.checkNotNullParameter(c, "c");
            int hashCode = 1;
            Iterator<?> iterator2 = c.iterator();
            while (iterator2.hasNext()) {
                Object e = iterator2.next();
                Object obj = e;
                n = 31 * hashCode + (obj != null ? obj.hashCode() : 0);
            }
            return n;
        }

        public final boolean orderedEquals$kotlin_stdlib(@NotNull Collection<?> c, @NotNull Collection<?> other) {
            Intrinsics.checkNotNullParameter(c, "c");
            Intrinsics.checkNotNullParameter(other, "other");
            if (c.size() != other.size()) {
                return false;
            }
            Iterator<?> otherIterator = other.iterator();
            for (Object elem : c) {
                Object elemOther = otherIterator.next();
                if (Intrinsics.areEqual(elem, elemOther)) continue;
                return false;
            }
            return true;
        }

        public final void checkPositionIndex$kotlin_stdlib(int index, int size) {
            block3: {
                block2: {
                    if (index < 0) break block2;
                    if (index <= size) break block3;
                }
                throw new IndexOutOfBoundsException("index: " + index + ", size: " + size);
            }
        }

        public final void checkRangeIndexes$kotlin_stdlib(int fromIndex, int toIndex, int size) {
            block5: {
                block4: {
                    if (fromIndex < 0) break block4;
                    if (toIndex <= size) break block5;
                }
                throw new IndexOutOfBoundsException("fromIndex: " + fromIndex + ", toIndex: " + toIndex + ", size: " + size);
            }
            if (fromIndex > toIndex) {
                throw new IllegalArgumentException("fromIndex: " + fromIndex + " > toIndex: " + toIndex);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }

        public final void checkBoundsIndexes$kotlin_stdlib(int startIndex, int endIndex, int size) {
            block5: {
                block4: {
                    if (startIndex < 0) break block4;
                    if (endIndex <= size) break block5;
                }
                throw new IndexOutOfBoundsException("startIndex: " + startIndex + ", endIndex: " + endIndex + ", size: " + size);
            }
            if (startIndex > endIndex) {
                throw new IllegalArgumentException("startIndex: " + startIndex + " > endIndex: " + endIndex);
            }
        }

        public final void checkElementIndex$kotlin_stdlib(int index, int size) {
            block3: {
                block2: {
                    if (index < 0) break block2;
                    if (index < size) break block3;
                }
                throw new IndexOutOfBoundsException("index: " + index + ", size: " + size);
            }
        }

        public final int newCapacity$kotlin_stdlib(int oldCapacity, int minCapacity) {
            int n;
            int newCapacity = oldCapacity + (oldCapacity >> 1);
            if (newCapacity - minCapacity < 0) {
                newCapacity = minCapacity;
            }
            if (newCapacity - 0x7FFFFFF7 > 0) {
                n = minCapacity > 0x7FFFFFF7 ? Integer.MAX_VALUE : 0x7FFFFFF7;
            }
            return n;
        }
    }

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0092\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0096\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2={"Lkotlin/collections/AbstractList$IteratorImpl;", "", "<init>", "(Lkotlin/collections/AbstractList;)V", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "", "index", "I", "getIndex", "()I", "setIndex", "(I)V", "kotlin-stdlib"})
    private class IteratorImpl
    implements Iterator<E>,
    KMappedMarker {
        private int index;

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        protected final int getIndex() {
            return this.index;
        }

        @Override
        public E next() {
            if (!this.hasNext()) {
                throw new NoSuchElementException();
            }
            int n = this.index;
            this.index = n + 1;
            return AbstractList.this.get(n);
        }

        protected final void setIndex(int n) {
            this.index = n;
        }

        @Override
        public boolean hasNext() {
            return this.index < AbstractList.this.size();
        }
    }

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0002\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\u00060\u0003j\u0002`\u0004B%\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u00a2\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\u0006H\u0096\u0002\u00a2\u0006\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0014"}, d2={"Lkotlin/collections/AbstractList$SubList;", "E", "Lkotlin/collections/AbstractList;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "list", "", "fromIndex", "toIndex", "<init>", "(Lkotlin/collections/AbstractList;II)V", "index", "get", "(I)Ljava/lang/Object;", "_size", "I", "Lkotlin/collections/AbstractList;", "getSize", "()I", "size", "kotlin-stdlib"})
    private static final class SubList<E>
    extends AbstractList<E>
    implements RandomAccess {
        @NotNull
        private final AbstractList<E> list;
        private final int fromIndex;
        private int _size;

        @Override
        public int getSize() {
            return this._size;
        }

        @Override
        public E get(int index) {
            Companion.checkElementIndex$kotlin_stdlib(index, this._size);
            return this.list.get(this.fromIndex + index);
        }

        public SubList(@NotNull AbstractList<? extends E> list, int fromIndex, int toIndex) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.list = list;
            this.fromIndex = fromIndex;
            Companion.checkRangeIndexes$kotlin_stdlib(this.fromIndex, toIndex, this.list.size());
            this._size = toIndex - this.fromIndex;
        }
    }

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0092\u0004\u0018\u00002\f0\u0001R\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016\u00a2\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u000f\u0010\f\u00a8\u0006\u0010"}, d2={"Lkotlin/collections/AbstractList$ListIteratorImpl;", "Lkotlin/collections/AbstractList$IteratorImpl;", "Lkotlin/collections/AbstractList;", "", "", "index", "<init>", "(Lkotlin/collections/AbstractList;I)V", "", "hasPrevious", "()Z", "nextIndex", "()I", "previous", "()Ljava/lang/Object;", "previousIndex", "kotlin-stdlib"})
    private class ListIteratorImpl
    extends IteratorImpl
    implements ListIterator<E>,
    KMappedMarker {
        @Override
        public void add(E element) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override
        public int nextIndex() {
            return this.getIndex();
        }

        @Override
        public boolean hasPrevious() {
            return this.getIndex() > 0;
        }

        public ListIteratorImpl(int index) {
            Companion.checkPositionIndex$kotlin_stdlib(index, AbstractList.this.size());
            this.setIndex(index);
        }

        @Override
        public int previousIndex() {
            return this.getIndex() - 1;
        }

        @Override
        public E previous() {
            if (!this.hasPrevious()) {
                throw new NoSuchElementException();
            }
            this.setIndex(this.getIndex() + -1);
            return AbstractList.this.get(this.getIndex());
        }

        @Override
        public void set(E element) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}

