/*
 * Decompiled with CFR 0.152.
 */
package kotlin;

import java.util.Arrays;
import java.util.Collection;
import java.util.NoSuchElementException;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.UShort;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0017\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00013B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0001\u0012\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0004\b\u0005\u0010\tJ\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002\u00a2\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0086\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010!\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\b\u001f\u0010 J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020\"H\u0096\u0002\u00a2\u0006\u0004\b#\u0010$J \u0010*\u001a\u00020'2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0002H\u0086\u0002\u00a2\u0006\u0004\b(\u0010)J\u0010\u0010.\u001a\u00020+H\u00d6\u0001\u00a2\u0006\u0004\b,\u0010-R\u0014\u0010\u0004\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b/\u0010\u001dR\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0081\u0004\u00a2\u0006\f\n\u0004\b\b\u00100\u0012\u0004\b1\u00102\u0088\u0001\b\u0092\u0001\u00020\u0007\u0082\u0002\u0004\n\u0002\b!\u00a8\u00064"}, d2={"Lkotlin/UShortArray;", "", "Lkotlin/UShort;", "", "size", "constructor-impl", "(I)[S", "", "storage", "([S)[S", "element", "", "contains-xj2QHRw", "([SS)Z", "contains", "elements", "containsAll-impl", "([SLjava/util/Collection;)Z", "containsAll", "", "other", "equals-impl", "([SLjava/lang/Object;)Z", "equals", "index", "get-Mh2AYeg", "([SI)S", "get", "hashCode-impl", "([S)I", "hashCode", "isEmpty-impl", "([S)Z", "isEmpty", "", "iterator-impl", "([S)Ljava/util/Iterator;", "iterator", "value", "", "set-01HTLdE", "([SIS)V", "set", "", "toString-impl", "([S)Ljava/lang/String;", "toString", "getSize-impl", "[S", "getStorage$annotations", "()V", "Iterator", "kotlin-stdlib"})
@JvmInline
@SinceKotlin(version="1.3")
@ExperimentalUnsignedTypes
public final class UShortArray
implements Collection<UShort>,
KMappedMarker {
    @NotNull
    private final short[] storage;

    @Override
    public boolean addAll(Collection<? extends UShort> elements) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @PublishedApi
    @NotNull
    public static short[] constructor-impl(@NotNull short[] storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return storage;
    }

    @PublishedApi
    public static /* synthetic */ void getStorage$annotations() {
    }

    public boolean add-xj2QHRw(short element) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ short[] unbox-impl() {
        return this.storage;
    }

    @Override
    public boolean retainAll(Collection<? extends Object> elements) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return UShortArray.containsAll-impl(this.storage, elements);
    }

    public static int getSize-impl(short[] arg0) {
        return arg0.length;
    }

    public static final boolean equals-impl0(short[] p1, short[] p2) {
        return Intrinsics.areEqual(p1, p2);
    }

    @NotNull
    public static short[] constructor-impl(int size) {
        return UShortArray.constructor-impl(new short[size]);
    }

    public static final short get-Mh2AYeg(short[] arg0, int index) {
        return UShort.constructor-impl(arg0[index]);
    }

    public static int hashCode-impl(short[] arg0) {
        return Arrays.hashCode(arg0);
    }

    public static String toString-impl(short[] arg0) {
        return "UShortArray(storage=" + Arrays.toString(arg0) + ')';
    }

    public static final void set-01HTLdE(short[] arg0, int index, short value) {
        arg0[index] = value;
    }

    public static boolean contains-xj2QHRw(short[] arg0, short element) {
        return ArraysKt.contains(arg0, element);
    }

    @NotNull
    public static java.util.Iterator<UShort> iterator-impl(short[] arg0) {
        return new Iterator(arg0);
    }

    @PublishedApi
    private /* synthetic */ UShortArray(short[] storage) {
        this.storage = storage;
    }

    public boolean contains-xj2QHRw(short element) {
        return UShortArray.contains-xj2QHRw(this.storage, element);
    }

    @Override
    @NotNull
    public java.util.Iterator<UShort> iterator() {
        return UShortArray.iterator-impl(this.storage);
    }

    @Override
    public boolean equals(Object other) {
        return UShortArray.equals-impl(this.storage, other);
    }

    @Override
    public boolean remove(Object element) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static boolean equals-impl(short[] arg0, Object other) {
        if (!(other instanceof UShortArray)) {
            return false;
        }
        if (!Intrinsics.areEqual(arg0, ((UShortArray)other).unbox-impl())) {
            return false;
        }
        return true;
    }

    public static boolean isEmpty-impl(short[] arg0) {
        return arg0.length == 0;
    }

    public int getSize() {
        return UShortArray.getSize-impl(this.storage);
    }

    @Override
    public boolean isEmpty() {
        return UShortArray.isEmpty-impl(this.storage);
    }

    public static final /* synthetic */ UShortArray box-impl(short[] v) {
        return new UShortArray(v);
    }

    @Override
    public int hashCode() {
        return UShortArray.hashCode-impl(this.storage);
    }

    @Override
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return CollectionToArray.toArray(this, array);
    }

    public static boolean containsAll-impl(short[] arg0, @NotNull Collection<UShort> elements) {
        boolean bl;
        block3: {
            Intrinsics.checkNotNullParameter(elements, "elements");
            Iterable $this$all$iv = elements;
            boolean $i$f$all = false;
            if (((Collection)$this$all$iv).isEmpty()) {
                bl = true;
            } else {
                java.util.Iterator iterator2 = $this$all$iv.iterator();
                while (iterator2.hasNext()) {
                    Object element$iv;
                    Object it = element$iv = iterator2.next();
                    boolean bl2 = false;
                    if (it instanceof UShort && ArraysKt.contains(arg0, ((UShort)it).unbox-impl())) continue;
                    bl = false;
                    break block3;
                }
                bl = true;
            }
        }
        return bl;
    }

    @Override
    public boolean removeAll(Collection<? extends Object> elements) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public String toString() {
        return UShortArray.toString-impl(this.storage);
    }

    /*
     * Illegal identifiers - consider using --renameillegalidents true
     */
    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0017\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0096\u0002\u00a2\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u0002H\u0096\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0004\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b!\u00a8\u0006\u0011"}, d2={"Lkotlin/UShortArray$Iterator;", "", "Lkotlin/UShort;", "", "array", "<init>", "([S)V", "", "hasNext", "()Z", "next-Mh2AYeg", "()S", "next", "[S", "", "index", "I", "kotlin-stdlib"})
    private static final class Iterator
    implements java.util.Iterator<UShort>,
    KMappedMarker {
        @NotNull
        private final short[] array;
        private int index;

        public Iterator(@NotNull short[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            this.array = array;
        }

        public short next-Mh2AYeg() {
            if (this.index >= this.array.length) {
                throw new NoSuchElementException(String.valueOf(this.index));
            }
            int n = this.index;
            this.index = n + 1;
            return UShort.constructor-impl(this.array[n]);
        }

        @Override
        public boolean hasNext() {
            return this.index < this.array.length;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}

