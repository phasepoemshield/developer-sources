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
import kotlin.UByte;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@JvmInline
@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00013B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0001\u0012\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0004\b\u0005\u0010\tJ\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002\u00a2\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0086\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010!\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\b\u001f\u0010 J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020\"H\u0096\u0002\u00a2\u0006\u0004\b#\u0010$J \u0010*\u001a\u00020'2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0002H\u0086\u0002\u00a2\u0006\u0004\b(\u0010)J\u0010\u0010.\u001a\u00020+H\u00d6\u0001\u00a2\u0006\u0004\b,\u0010-R\u0014\u0010\u0004\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b/\u0010\u001dR\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0081\u0004\u00a2\u0006\f\n\u0004\b\b\u00100\u0012\u0004\b1\u00102\u0088\u0001\b\u0092\u0001\u00020\u0007\u0082\u0002\u0004\n\u0002\b!\u00a8\u00064"}, d2={"Lkotlin/UByteArray;", "", "Lkotlin/UByte;", "", "size", "constructor-impl", "(I)[B", "", "storage", "([B)[B", "element", "", "contains-7apg3OU", "([BB)Z", "contains", "elements", "containsAll-impl", "([BLjava/util/Collection;)Z", "containsAll", "", "other", "equals-impl", "([BLjava/lang/Object;)Z", "equals", "index", "get-w2LRezQ", "([BI)B", "get", "hashCode-impl", "([B)I", "hashCode", "isEmpty-impl", "([B)Z", "isEmpty", "", "iterator-impl", "([B)Ljava/util/Iterator;", "iterator", "value", "", "set-VurrAj0", "([BIB)V", "set", "", "toString-impl", "([B)Ljava/lang/String;", "toString", "getSize-impl", "[B", "getStorage$annotations", "()V", "Iterator", "kotlin-stdlib"})
@ExperimentalUnsignedTypes
@SinceKotlin(version="1.3")
public final class UByteArray
implements Collection<UByte>,
KMappedMarker {
    @NotNull
    private final byte[] storage;

    public static boolean containsAll-impl(byte[] arg0, @NotNull Collection<UByte> elements) {
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
                    if (it instanceof UByte && ArraysKt.contains(arg0, ((UByte)it).unbox-impl())) continue;
                    bl = false;
                    break block3;
                }
                bl = true;
            }
        }
        return bl;
    }

    @Override
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return CollectionToArray.toArray(this, array);
    }

    @Override
    public boolean addAll(Collection<? extends UByte> elements) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    public int getSize() {
        return UByteArray.getSize-impl(this.storage);
    }

    public static final /* synthetic */ UByteArray box-impl(byte[] v) {
        return new UByteArray(v);
    }

    @Override
    public boolean isEmpty() {
        return UByteArray.isEmpty-impl(this.storage);
    }

    @NotNull
    public static java.util.Iterator<UByte> iterator-impl(byte[] arg0) {
        return new Iterator(arg0);
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static int getSize-impl(byte[] arg0) {
        return arg0.length;
    }

    @Override
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return UByteArray.containsAll-impl(this.storage, elements);
    }

    public static final byte get-w2LRezQ(byte[] arg0, int index) {
        return UByte.constructor-impl(arg0[index]);
    }

    @Override
    public boolean removeAll(Collection<? extends Object> elements) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    @NotNull
    public java.util.Iterator<UByte> iterator() {
        return UByteArray.iterator-impl(this.storage);
    }

    public boolean add-7apg3OU(byte element) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static String toString-impl(byte[] arg0) {
        return "UByteArray(storage=" + Arrays.toString(arg0) + ')';
    }

    @NotNull
    public static byte[] constructor-impl(int size) {
        return UByteArray.constructor-impl(new byte[size]);
    }

    @Override
    public boolean equals(Object other) {
        return UByteArray.equals-impl(this.storage, other);
    }

    @NotNull
    @PublishedApi
    public static byte[] constructor-impl(@NotNull byte[] storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return storage;
    }

    public static boolean equals-impl(byte[] arg0, Object other) {
        if (!(other instanceof UByteArray)) {
            return false;
        }
        if (!Intrinsics.areEqual(arg0, ((UByteArray)other).unbox-impl())) {
            return false;
        }
        return true;
    }

    public static boolean contains-7apg3OU(byte[] arg0, byte element) {
        return ArraysKt.contains(arg0, element);
    }

    public static boolean isEmpty-impl(byte[] arg0) {
        return arg0.length == 0;
    }

    public static final void set-VurrAj0(byte[] arg0, int index, byte value) {
        arg0[index] = value;
    }

    public final /* synthetic */ byte[] unbox-impl() {
        return this.storage;
    }

    public boolean contains-7apg3OU(byte element) {
        return UByteArray.contains-7apg3OU(this.storage, element);
    }

    public String toString() {
        return UByteArray.toString-impl(this.storage);
    }

    @Override
    public boolean remove(Object element) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public int hashCode() {
        return UByteArray.hashCode-impl(this.storage);
    }

    public static int hashCode-impl(byte[] arg0) {
        return Arrays.hashCode(arg0);
    }

    @PublishedApi
    private /* synthetic */ UByteArray(byte[] storage) {
        this.storage = storage;
    }

    @Override
    public boolean retainAll(Collection<? extends Object> elements) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @PublishedApi
    public static /* synthetic */ void getStorage$annotations() {
    }

    public static final boolean equals-impl0(byte[] p1, byte[] p2) {
        return Intrinsics.areEqual(p1, p2);
    }

    /*
     * Illegal identifiers - consider using --renameillegalidents true
     */
    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0096\u0002\u00a2\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u0002H\u0096\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0004\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b!\u00a8\u0006\u0011"}, d2={"Lkotlin/UByteArray$Iterator;", "", "Lkotlin/UByte;", "", "array", "<init>", "([B)V", "", "hasNext", "()Z", "next-w2LRezQ", "()B", "next", "[B", "", "index", "I", "kotlin-stdlib"})
    private static final class Iterator
    implements java.util.Iterator<UByte>,
    KMappedMarker {
        private int index;
        @NotNull
        private final byte[] array;

        public Iterator(@NotNull byte[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            this.array = array;
        }

        @Override
        public boolean hasNext() {
            return this.index < this.array.length;
        }

        public byte next-w2LRezQ() {
            if (this.index >= this.array.length) {
                throw new NoSuchElementException(String.valueOf(this.index));
            }
            int n = this.index;
            this.index = n + 1;
            return UByte.constructor-impl(this.array[n]);
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}

