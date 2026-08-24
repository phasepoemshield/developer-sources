/*
 * Decompiled with CFR 0.152.
 */
package kotlin.collections.builders;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.AbstractMutableList;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.builders.ListBuilderKt;
import kotlin.collections.builders.SerializedCollection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableListIterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0010+\n\u0002\b\u001a\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0000\u0018\u0000 i*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\u00060\u0006j\u0002`\u0007:\u0002ijB\t\b\u0016\u00a2\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\b\b\u0010\fBO\b\u0002\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000\u00a2\u0006\u0004\b\b\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0017\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b\u0017\u0010\u001bJ%\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\n2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0016\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\u001e\u001a\u00020\u00112\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0016\u00a2\u0006\u0004\b\u001e\u0010 J-\u0010#\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\n2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\u0006\u0010\"\u001a\u00020\nH\u0002\u00a2\u0006\u0004\b#\u0010$J\u001f\u0010%\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00028\u0000H\u0002\u00a2\u0006\u0004\b%\u0010\u001bJ\u0013\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&\u00a2\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u001aH\u0002\u00a2\u0006\u0004\b)\u0010\tJ\u000f\u0010*\u001a\u00020\u001aH\u0002\u00a2\u0006\u0004\b*\u0010\tJ\u000f\u0010+\u001a\u00020\u001aH\u0016\u00a2\u0006\u0004\b+\u0010\tJ\u001b\u0010-\u001a\u00020\u00112\n\u0010,\u001a\u0006\u0012\u0002\b\u00030&H\u0002\u00a2\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u001a2\u0006\u0010/\u001a\u00020\nH\u0002\u00a2\u0006\u0004\b0\u0010\fJ\u0017\u00101\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\nH\u0002\u00a2\u0006\u0004\b1\u0010\fJ\u001a\u00103\u001a\u00020\u00112\b\u0010,\u001a\u0004\u0018\u000102H\u0096\u0002\u00a2\u0006\u0004\b3\u0010\u0018J\u0018\u00104\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\nH\u0096\u0002\u00a2\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b8\u00109J\u001f\u0010:\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\nH\u0002\u00a2\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\b<\u0010=J\u0016\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000>H\u0096\u0002\u00a2\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\bA\u00109J\u0015\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000BH\u0016\u00a2\u0006\u0004\bC\u0010DJ\u001d\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000B2\u0006\u0010\u0019\u001a\u00020\nH\u0016\u00a2\u0006\u0004\bC\u0010EJ\u000f\u0010F\u001a\u00020\u001aH\u0002\u00a2\u0006\u0004\bF\u0010\tJ\u0017\u0010G\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\bG\u0010\u0018J\u001d\u0010H\u001a\u00020\u00112\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0016\u00a2\u0006\u0004\bH\u0010 J\u0017\u0010I\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\nH\u0016\u00a2\u0006\u0004\bI\u00105J\u0017\u0010J\u001a\u00028\u00002\u0006\u0010!\u001a\u00020\nH\u0002\u00a2\u0006\u0004\bJ\u00105J\u001f\u0010M\u001a\u00020\u001a2\u0006\u0010K\u001a\u00020\n2\u0006\u0010L\u001a\u00020\nH\u0002\u00a2\u0006\u0004\bM\u0010;J\u001d\u0010N\u001a\u00020\u00112\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0016\u00a2\u0006\u0004\bN\u0010 J5\u0010P\u001a\u00020\n2\u0006\u0010K\u001a\u00020\n2\u0006\u0010L\u001a\u00020\n2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\u0006\u0010O\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\bP\u0010QJ \u0010R\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0004\bR\u0010SJ%\u0010V\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010T\u001a\u00020\n2\u0006\u0010U\u001a\u00020\nH\u0016\u00a2\u0006\u0004\bV\u0010WJ\u0017\u0010X\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001020\rH\u0016\u00a2\u0006\u0004\bX\u0010YJ)\u0010X\u001a\b\u0012\u0004\u0012\u00028\u00010\r\"\u0004\b\u0001\u0010Z2\f\u0010[\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016\u00a2\u0006\u0004\bX\u0010\\J\u000f\u0010^\u001a\u00020]H\u0016\u00a2\u0006\u0004\b^\u0010_J\u000f\u0010`\u001a\u000202H\u0002\u00a2\u0006\u0004\b`\u0010aR\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u000e\u0010bR\u001c\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0013\u0010cR\u0014\u0010d\u001a\u00020\u00118BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\bd\u0010=R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0012\u0010eR\u0016\u0010\u0010\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0010\u0010fR\u0016\u0010\u000f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u000f\u0010fR\u001c\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0014\u0010cR\u0014\u0010h\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\bg\u00107\u00a8\u0006k"}, d2={"Lkotlin/collections/builders/ListBuilder;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lkotlin/collections/AbstractMutableList;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "<init>", "()V", "", "initialCapacity", "(I)V", "", "array", "offset", "length", "", "isReadOnly", "backing", "root", "([Ljava/lang/Object;IIZLkotlin/collections/builders/ListBuilder;Lkotlin/collections/builders/ListBuilder;)V", "element", "add", "(Ljava/lang/Object;)Z", "index", "", "(ILjava/lang/Object;)V", "", "elements", "addAll", "(ILjava/util/Collection;)Z", "(Ljava/util/Collection;)Z", "i", "n", "addAllInternal", "(ILjava/util/Collection;I)V", "addAtInternal", "", "build", "()Ljava/util/List;", "checkForComodification", "checkIsMutable", "clear", "other", "contentEquals", "(Ljava/util/List;)Z", "minCapacity", "ensureCapacityInternal", "ensureExtraCapacity", "", "equals", "get", "(I)Ljava/lang/Object;", "hashCode", "()I", "indexOf", "(Ljava/lang/Object;)I", "insertAtInternal", "(II)V", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "registerModification", "remove", "removeAll", "removeAt", "removeAtInternal", "rangeOffset", "rangeLength", "removeRangeInternal", "retainAll", "retain", "retainOrRemoveAllInternal", "(IILjava/util/Collection;Z)I", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "toArray", "()[Ljava/lang/Object;", "T", "destination", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "writeReplace", "()Ljava/lang/Object;", "[Ljava/lang/Object;", "Lkotlin/collections/builders/ListBuilder;", "isEffectivelyReadOnly", "Z", "I", "getSize", "size", "Companion", "Itr", "kotlin-stdlib"})
public final class ListBuilder<E>
extends AbstractMutableList<E>
implements List<E>,
RandomAccess,
Serializable,
KMutableList {
    @Nullable
    private final ListBuilder<E> backing;
    @NotNull
    private static final Companion Companion;
    private int length;
    @NotNull
    private E[] array;
    @NotNull
    private static final ListBuilder Empty;
    private int offset;
    @Nullable
    private final ListBuilder<E> root;
    private boolean isReadOnly;

    private ListBuilder(E[] array, int offset, int length, boolean isReadOnly, ListBuilder<E> backing, ListBuilder<E> root) {
        this.array = array;
        this.offset = offset;
        this.length = length;
        this.isReadOnly = isReadOnly;
        this.backing = backing;
        this.root = root;
        if (this.backing != null) {
            this.modCount = this.backing.modCount;
        }
    }

    @Override
    public E get(int index) {
        this.checkForComodification();
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(index, this.length);
        return this.array[this.offset + index];
    }

    /*
     * WARNING - void declaration
     */
    private final int retainOrRemoveAllInternal(int rangeOffset, int rangeLength, Collection<? extends E> elements, boolean retain) {
        void var5_13;
        int removed;
        int n;
        if (this.backing != null) {
            n = super.retainOrRemoveAllInternal(rangeOffset, rangeLength, elements, retain);
        } else {
            void var8_7;
            int i = 0;
            int j = 0;
            while (i < rangeLength) {
                if (elements.contains(this.array[rangeOffset + i]) == retain) {
                    this.array[rangeOffset + j++] = this.array[rangeOffset + i++];
                    continue;
                }
                ++i;
            }
            int removed2 = rangeLength - j;
            E[] EArray = this.array;
            E[] EArray2 = this.array;
            int n2 = rangeOffset + rangeLength;
            int n3 = this.length;
            int n4 = rangeOffset + j;
            ArraysKt.copyInto(EArray, EArray2, n4, n2, n3);
            ListBuilderKt.resetRange(this.array, this.length - removed2, this.length);
            n = removed = var8_7;
        }
        if (removed > 0) {
            this.registerModification();
        }
        this.length -= removed;
        return (int)var5_13;
    }

    /*
     * WARNING - void declaration
     */
    private final E removeAtInternal(int i) {
        void var2_3;
        this.registerModification();
        if (this.backing != null) {
            E old = super.removeAtInternal(i);
            int n = this.length;
            this.length = n + -1;
            return old;
        }
        E old = this.array[i];
        E[] EArray = this.array;
        E[] EArray2 = this.array;
        int n = i + 1;
        int n2 = this.offset + this.length;
        ArraysKt.copyInto(EArray, EArray2, i, n, n2);
        ListBuilderKt.resetAt(this.array, this.offset + this.length - 1);
        int n3 = this.length;
        this.length = n3 + -1;
        return var2_3;
    }

    public ListBuilder(int initialCapacity) {
        this(ListBuilderKt.arrayOfUninitializedElements(initialCapacity), 0, 0, false, null, null);
    }

    @Override
    public void add(int index, E element) {
        this.checkIsMutable();
        this.checkForComodification();
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(index, this.length);
        this.addAtInternal(this.offset + index, element);
    }

    @Override
    public E removeAt(int index) {
        this.checkIsMutable();
        this.checkForComodification();
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(index, this.length);
        return this.removeAtInternal(this.offset + index);
    }

    @Override
    public boolean addAll(@NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.checkIsMutable();
        this.checkForComodification();
        int n = elements.size();
        this.addAllInternal(this.offset + this.length, elements, n);
        return n > 0;
    }

    @Override
    public int hashCode() {
        this.checkForComodification();
        return ListBuilderKt.access$subarrayContentHashCode(this.array, this.offset, this.length);
    }

    @Override
    public void clear() {
        this.checkIsMutable();
        this.checkForComodification();
        this.removeRangeInternal(this.offset, this.length);
    }

    @Override
    @NotNull
    public <T> T[] toArray(@NotNull T[] destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.checkForComodification();
        if (destination.length < this.length) {
            T[] TArray = Arrays.copyOfRange(this.array, this.offset, this.offset + this.length, destination.getClass());
            Intrinsics.checkNotNullExpressionValue(TArray, "copyOfRange(...)");
            return TArray;
        }
        ArraysKt.copyInto(this.array, destination, 0, this.offset, this.offset + this.length);
        return CollectionsKt.terminateCollectionToArray(this.length, destination);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public E set(int index, E element) {
        void var3_3;
        this.checkIsMutable();
        this.checkForComodification();
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(index, this.length);
        E old = this.array[this.offset + index];
        this.array[this.offset + index] = element;
        return var3_3;
    }

    public ListBuilder() {
        this(10);
    }

    private final Object writeReplace() {
        if (!this.isEffectivelyReadOnly()) {
            throw new NotSerializableException("The list cannot be serialized while it is being built.");
        }
        return new SerializedCollection(this, 0);
    }

    @Override
    @NotNull
    public List<E> subList(int fromIndex, int toIndex) {
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(fromIndex, toIndex, this.length);
        ListBuilder listBuilder = this.root;
        if (listBuilder == null) {
            listBuilder = this;
        }
        return new ListBuilder<E>(this.array, this.offset + fromIndex, toIndex - fromIndex, this.isReadOnly, this, listBuilder);
    }

    @Override
    public boolean remove(Object element) {
        this.checkIsMutable();
        this.checkForComodification();
        int i = this.indexOf(element);
        if (i >= 0) {
            this.remove(i);
        }
        return i >= 0;
    }

    private final void ensureCapacityInternal(int minCapacity) {
        if (minCapacity < 0) {
            throw new OutOfMemoryError();
        }
        if (minCapacity > this.array.length) {
            int newSize = AbstractList.Companion.newCapacity$kotlin_stdlib(this.array.length, minCapacity);
            this.array = ListBuilderKt.copyOfUninitializedElements(this.array, newSize);
        }
    }

    private final void insertAtInternal(int i, int n) {
        this.ensureExtraCapacity(n);
        E[] EArray = this.array;
        E[] EArray2 = this.array;
        int n2 = this.offset + this.length;
        int n3 = i + n;
        ArraysKt.copyInto(EArray, EArray2, n3, i, n2);
        this.length += n;
    }

    @Override
    @NotNull
    public String toString() {
        this.checkForComodification();
        return ListBuilderKt.access$subarrayContentToString(this.array, this.offset, this.length, this);
    }

    @Override
    public boolean addAll(int index, @NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.checkIsMutable();
        this.checkForComodification();
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(index, this.length);
        int n = elements.size();
        this.addAllInternal(this.offset + index, elements, n);
        return n > 0;
    }

    @Override
    @NotNull
    public ListIterator<E> listIterator(int index) {
        this.checkForComodification();
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(index, this.length);
        return new Itr(this, index);
    }

    private final void registerModification() {
        ++this.modCount;
    }

    private final void checkForComodification() {
        if (this.root != null && this.root.modCount != this.modCount) {
            throw new ConcurrentModificationException();
        }
    }

    @Override
    @NotNull
    public Object[] toArray() {
        this.checkForComodification();
        E[] EArray = this.array;
        int n = this.offset;
        int n2 = this.offset + this.length;
        return ArraysKt.copyOfRange(EArray, n, n2);
    }

    /*
     * WARNING - void declaration
     */
    private final void removeRangeInternal(int rangeOffset, int rangeLength) {
        void var2_2;
        if (rangeLength > 0) {
            this.registerModification();
        }
        if (this.backing != null) {
            super.removeRangeInternal(rangeOffset, rangeLength);
        } else {
            E[] EArray = this.array;
            E[] EArray2 = this.array;
            int n = rangeOffset + rangeLength;
            int n2 = this.length;
            ArraysKt.copyInto(EArray, EArray2, rangeOffset, n, n2);
            ListBuilderKt.resetRange(this.array, this.length - rangeLength, this.length);
        }
        this.length -= var2_2;
    }

    @Override
    public boolean isEmpty() {
        this.checkForComodification();
        return this.length == 0;
    }

    /*
     * WARNING - void declaration
     */
    private final void addAllInternal(int i, Collection<? extends E> elements, int n) {
        this.registerModification();
        if (this.backing != null) {
            super.addAllInternal(i, elements, n);
            this.array = this.backing.array;
            this.length += n;
        } else {
            this.insertAtInternal(i, n);
            int j = 0;
            Iterator<E> it = elements.iterator();
            while (j < n) {
                void var4_4;
                this.array[i + j] = it.next();
                ++var4_4;
            }
        }
    }

    @Override
    @NotNull
    public Iterator<E> iterator() {
        return this.listIterator(0);
    }

    private final boolean contentEquals(List<?> other) {
        return ListBuilderKt.access$subarrayContentEquals(this.array, this.offset, this.length, other);
    }

    @Override
    public boolean add(E element) {
        this.checkIsMutable();
        this.checkForComodification();
        this.addAtInternal(this.offset + this.length, element);
        return true;
    }

    /*
     * WARNING - void declaration
     */
    private final void addAtInternal(int i, E element) {
        this.registerModification();
        if (this.backing != null) {
            super.addAtInternal(i, element);
            this.array = this.backing.array;
            int n = this.length;
            this.length = n + 1;
        } else {
            void var2_2;
            this.insertAtInternal(i, 1);
            this.array[i] = var2_2;
        }
    }

    @Override
    public boolean equals(@Nullable Object other) {
        this.checkForComodification();
        return other == this || other instanceof List && this.contentEquals((List)other);
    }

    @Override
    public boolean retainAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.checkIsMutable();
        this.checkForComodification();
        return this.retainOrRemoveAllInternal(this.offset, this.length, elements, true) > 0;
    }

    @Override
    public boolean removeAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.checkIsMutable();
        this.checkForComodification();
        return this.retainOrRemoveAllInternal(this.offset, this.length, elements, false) > 0;
    }

    private final void ensureExtraCapacity(int n) {
        this.ensureCapacityInternal(this.length + n);
    }

    @Override
    public int getSize() {
        this.checkForComodification();
        return this.length;
    }

    @Override
    @NotNull
    public ListIterator<E> listIterator() {
        return this.listIterator(0);
    }

    @Override
    public int indexOf(Object element) {
        this.checkForComodification();
        for (int i = 0; i < this.length; ++i) {
            if (!Intrinsics.areEqual(this.array[this.offset + i], element)) continue;
            return i;
        }
        return -1;
    }

    static {
        ListBuilder listBuilder;
        Companion = new Companion(null);
        ListBuilder it = listBuilder = new ListBuilder(0);
        boolean bl = false;
        it.isReadOnly = true;
        Empty = listBuilder;
    }

    private final boolean isEffectivelyReadOnly() {
        return this.isReadOnly || this.root != null && this.root.isReadOnly;
    }

    @NotNull
    public final List<E> build() {
        if (this.backing != null) {
            throw new IllegalStateException();
        }
        this.checkIsMutable();
        this.isReadOnly = true;
        return this.length > 0 ? (List)this : (List)Empty;
    }

    private final void checkIsMutable() {
        if (this.isEffectivelyReadOnly()) {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public int lastIndexOf(Object element) {
        this.checkForComodification();
        for (int i = this.length - 1; i >= 0; --i) {
            if (!Intrinsics.areEqual(this.array[this.offset + i], element)) continue;
            return i;
        }
        return -1;
    }

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001f\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0001H\u0016\u00a2\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u0096\u0002\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00028\u0001H\u0096\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00028\u0001H\u0016\u00a2\u0006\u0004\b\u0017\u0010\u0014J\u000f\u0010\u0018\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\u0018\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b\u0019\u0010\u000eJ\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0001H\u0016\u00a2\u0006\u0004\b\u001a\u0010\fR\u0016\u0010\u001b\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0004\u0010\u001e\u00a8\u0006\u001f"}, d2={"Lkotlin/collections/builders/ListBuilder$Itr;", "E", "", "Lkotlin/collections/builders/ListBuilder;", "list", "", "index", "<init>", "(Lkotlin/collections/builders/ListBuilder;I)V", "element", "", "add", "(Ljava/lang/Object;)V", "checkForComodification", "()V", "", "hasNext", "()Z", "hasPrevious", "next", "()Ljava/lang/Object;", "nextIndex", "()I", "previous", "previousIndex", "remove", "set", "expectedModCount", "I", "lastIndex", "Lkotlin/collections/builders/ListBuilder;", "kotlin-stdlib"})
    private static final class Itr<E>
    implements ListIterator<E>,
    KMutableListIterator {
        private int lastIndex;
        @NotNull
        private final ListBuilder<E> list;
        private int index;
        private int expectedModCount;

        @Override
        public boolean hasNext() {
            return this.index < ((ListBuilder)this.list).length;
        }

        @Override
        public void remove() {
            this.checkForComodification();
            boolean bl = this.lastIndex != -1;
            if (!bl) {
                boolean bl2 = false;
                String string = "Call next() or previous() before removing element from the iterator.";
                throw new IllegalStateException(string.toString());
            }
            this.list.remove(this.lastIndex);
            this.index = this.lastIndex;
            this.lastIndex = -1;
            this.expectedModCount = ((ListBuilder)this.list).modCount;
        }

        @Override
        public void add(E element) {
            this.checkForComodification();
            int n = this.index;
            this.index = n + 1;
            this.list.add(n, element);
            this.lastIndex = -1;
            this.expectedModCount = ((ListBuilder)this.list).modCount;
        }

        public Itr(@NotNull ListBuilder<E> list, int index) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.list = list;
            this.index = index;
            this.lastIndex = -1;
            this.expectedModCount = ((ListBuilder)list).modCount;
        }

        @Override
        public boolean hasPrevious() {
            return this.index > 0;
        }

        /*
         * WARNING - void declaration
         */
        @Override
        public void set(E element) {
            void var1_1;
            this.checkForComodification();
            boolean bl = this.lastIndex != -1;
            if (!bl) {
                boolean bl2 = false;
                String string = "Call next() or previous() before replacing element from the iterator.";
                throw new IllegalStateException(string.toString());
            }
            this.list.set(this.lastIndex, var1_1);
        }

        @Override
        public int previousIndex() {
            return this.index - 1;
        }

        private final void checkForComodification() {
            if (((ListBuilder)this.list).modCount != this.expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }

        @Override
        public E next() {
            this.checkForComodification();
            if (this.index >= ((ListBuilder)this.list).length) {
                throw new NoSuchElementException();
            }
            int n = this.index;
            this.index = n + 1;
            this.lastIndex = n;
            return (E)((ListBuilder)this.list).array[((ListBuilder)this.list).offset + this.lastIndex];
        }

        @Override
        public int nextIndex() {
            return this.index;
        }

        @Override
        public E previous() {
            this.checkForComodification();
            if (this.index <= 0) {
                throw new NoSuchElementException();
            }
            this.index += -1;
            this.lastIndex = this.index;
            return (E)((ListBuilder)this.list).array[((ListBuilder)this.list).offset + this.lastIndex];
        }
    }

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2={"Lkotlin/collections/builders/ListBuilder$Companion;", "", "<init>", "()V", "Lkotlin/collections/builders/ListBuilder;", "", "Empty", "Lkotlin/collections/builders/ListBuilder;", "kotlin-stdlib"})
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }

        private Companion() {
        }
    }
}

