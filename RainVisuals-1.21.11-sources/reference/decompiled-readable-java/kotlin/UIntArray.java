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
import kotlin.UInt;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00013B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0001\u0012\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0004\b\u0005\u0010\tJ\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002\u00a2\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0086\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010!\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\b\u001f\u0010 J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020\"H\u0096\u0002\u00a2\u0006\u0004\b#\u0010$J \u0010*\u001a\u00020'2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0002H\u0086\u0002\u00a2\u0006\u0004\b(\u0010)J\u0010\u0010.\u001a\u00020+H\u00d6\u0001\u00a2\u0006\u0004\b,\u0010-R\u0014\u0010\u0004\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b/\u0010\u001dR\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0081\u0004\u00a2\u0006\f\n\u0004\b\b\u00100\u0012\u0004\b1\u00102\u0088\u0001\b\u0092\u0001\u00020\u0007\u0082\u0002\u0004\n\u0002\b!\u00a8\u00064"}, d2={"Lkotlin/UIntArray;", "", "Lkotlin/UInt;", "", "size", "constructor-impl", "(I)[I", "", "storage", "([I)[I", "element", "", "contains-WZ4Q5Ns", "([II)Z", "contains", "elements", "containsAll-impl", "([ILjava/util/Collection;)Z", "containsAll", "", "other", "equals-impl", "([ILjava/lang/Object;)Z", "equals", "index", "get-pVg5ArA", "([II)I", "get", "hashCode-impl", "([I)I", "hashCode", "isEmpty-impl", "([I)Z", "isEmpty", "", "iterator-impl", "([I)Ljava/util/Iterator;", "iterator", "value", "", "set-VXSXFK8", "([III)V", "set", "", "toString-impl", "([I)Ljava/lang/String;", "toString", "getSize-impl", "[I", "getStorage$annotations", "()V", "Iterator", "kotlin-stdlib"})
@JvmInline
@ExperimentalUnsignedTypes
@SinceKotlin(version="1.3")
public final class UIntArray
implements Collection<UInt>,
KMappedMarker {
    @NotNull
    private final int[] storage;

    @PublishedApi
    public static /* synthetic */ void getStorage$annotations() {
    }

    public static final int get-pVg5ArA(int[] arg0, int index) {
        return UInt.constructor-impl(arg0[index]);
    }

    public static boolean contains-WZ4Q5Ns(int[] arg0, int element) {
        return ArraysKt.contains(arg0, element);
    }

    @Override
    @NotNull
    public java.util.Iterator<UInt> iterator() {
        return UIntArray.iterator-impl(this.storage);
    }

    @Override
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    public static boolean equals-impl(int[] arg0, Object other) {
        if (!(other instanceof UIntArray)) {
            return false;
        }
        if (!Intrinsics.areEqual(arg0, ((UIntArray)other).unbox-impl())) {
            return false;
        }
        return true;
    }

    public String toString() {
        return UIntArray.toString-impl(this.storage);
    }

    @Override
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return UIntArray.containsAll-impl(this.storage, elements);
    }

    @PublishedApi
    @NotNull
    public static int[] constructor-impl(@NotNull int[] storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return storage;
    }

    @Override
    public boolean addAll(Collection<? extends UInt> elements) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean retainAll(Collection<? extends Object> elements) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static boolean containsAll-impl(int[] arg0, @NotNull Collection<UInt> elements) {
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
                    if (it instanceof UInt && ArraysKt.contains(arg0, ((UInt)it).unbox-impl())) continue;
                    bl = false;
                    break block3;
                }
                bl = true;
            }
        }
        return bl;
    }

    public static final /* synthetic */ UIntArray box-impl(int[] v) {
        return new UIntArray(v);
    }

    public static final void set-VXSXFK8(int[] arg0, int index, int value) {
        arg0[index] = value;
    }

    public static int getSize-impl(int[] arg0) {
        return arg0.length;
    }

    @NotNull
    public static int[] constructor-impl(int size) {
        return UIntArray.constructor-impl(new int[size]);
    }

    @PublishedApi
    private /* synthetic */ UIntArray(int[] storage) {
        this.storage = storage;
    }

    public static int hashCode-impl(int[] arg0) {
        return Arrays.hashCode(arg0);
    }

    @Override
    public boolean remove(Object element) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean isEmpty() {
        return UIntArray.isEmpty-impl(this.storage);
    }

    public boolean add-WZ4Q5Ns(int element) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean equals(Object other) {
        return UIntArray.equals-impl(this.storage, other);
    }

    public static final boolean equals-impl0(int[] p1, int[] p2) {
        return Intrinsics.areEqual(p1, p2);
    }

    public boolean contains-WZ4Q5Ns(int element) {
        return UIntArray.contains-WZ4Q5Ns(this.storage, element);
    }

    public int getSize() {
        return UIntArray.getSize-impl(this.storage);
    }

    public static String toString-impl(int[] arg0) {
        return "UIntArray(storage=" + Arrays.toString(arg0) + ')';
    }

    @Override
    public boolean removeAll(Collection<? extends Object> elements) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return CollectionToArray.toArray(this, array);
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static boolean isEmpty-impl(int[] arg0) {
        return arg0.length == 0;
    }

    public final /* synthetic */ int[] unbox-impl() {
        return this.storage;
    }

    @Override
    public int hashCode() {
        return UIntArray.hashCode-impl(this.storage);
    }

    @NotNull
    public static java.util.Iterator<UInt> iterator-impl(int[] arg0) {
        return new Iterator(arg0);
    }

    /*
     * Illegal identifiers - consider using --renameillegalidents true
     */
    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0096\u0002\u00a2\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u0002H\u0096\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0004\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b!\u00a8\u0006\u0011"}, d2={"Lkotlin/UIntArray$Iterator;", "", "Lkotlin/UInt;", "", "array", "<init>", "([I)V", "", "hasNext", "()Z", "next-pVg5ArA", "()I", "next", "[I", "", "index", "I", "kotlin-stdlib"})
    private static final class Iterator
    implements java.util.Iterator<UInt>,
    KMappedMarker {
        private int index;
        @NotNull
        private final int[] array;

        @Override
        public boolean hasNext() {
            return this.index < this.array.length;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public int next-pVg5ArA() {
            if (this.index >= this.array.length) {
                throw new NoSuchElementException(String.valueOf(this.index));
            }
            int n = this.index;
            this.index = n + 1;
            return UInt.constructor-impl(this.array[n]);
        }

        public Iterator(@NotNull int[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            this.array = array;
        }
    }
}

