/*
 * Decompiled with CFR 0.152.
 */
package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.WasExperimental;
import kotlin.collections.AbstractList;
import kotlin.collections.AbstractMutableList;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b%\b\u0007\u0018\u0000 Y*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001YB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0007B\u0017\b\u0016\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u00a2\u0006\u0004\b\u0005\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\r\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b\r\u0010\u0011J%\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0012\u001a\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016\u00a2\u0006\u0004\b\u0012\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00028\u0000\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00028\u0000\u00a2\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\b\u0018\u0010\u0007J\u0018\u0010\u0019\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0004\b\u0019\u0010\u000eJ%\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0002\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\b\u001e\u0010\u0006J\u0017\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\b\"\u0010\u0006J$\u0010%\u001a\u00020\f2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0#H\u0082\b\u00a2\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00028\u0000\u00a2\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0004\b)\u0010(J\u0018\u0010*\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u0003H\u0096\u0002\u00a2\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\b,\u0010 J\u0017\u0010-\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b-\u0010.J\u0018\u0010/\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u0003H\u0083\b\u00a2\u0006\u0004\b/\u0010+J\u0018\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H\u0083\b\u00a2\u0006\u0004\b\u001a\u0010 JO\u00109\u001a\u00020\u00102>\u00106\u001a:\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b1\u0012\b\b2\u0012\u0004\b\b(3\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010504\u00a2\u0006\f\b1\u0012\b\b2\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u001000H\u0000\u00a2\u0006\u0004\b7\u00108J\u000f\u0010:\u001a\u00020\fH\u0016\u00a2\u0006\u0004\b:\u0010;J\r\u0010<\u001a\u00028\u0000\u00a2\u0006\u0004\b<\u0010(J\u0017\u0010=\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b=\u0010.J\u000f\u0010>\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0004\b>\u0010(J\u0017\u0010?\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\b?\u0010 J\u0017\u0010@\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\b@\u0010 J\u0017\u0010A\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\bA\u0010\u000eJ\u001d\u0010B\u001a\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016\u00a2\u0006\u0004\bB\u0010\u0014J\u0017\u0010C\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\bC\u0010+J\r\u0010D\u001a\u00028\u0000\u00a2\u0006\u0004\bD\u0010(J\u000f\u0010E\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0004\bE\u0010(J\r\u0010F\u001a\u00028\u0000\u00a2\u0006\u0004\bF\u0010(J\u000f\u0010G\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0004\bG\u0010(J\u001d\u0010H\u001a\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016\u00a2\u0006\u0004\bH\u0010\u0014J \u0010I\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0004\bI\u0010JJ\u0017\u0010M\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010504H\u0000\u00a2\u0006\u0004\bK\u0010LJ)\u0010M\u001a\b\u0012\u0004\u0012\u00028\u000104\"\u0004\b\u0001\u0010N2\f\u0010O\u001a\b\u0012\u0004\u0012\u00028\u000104H\u0000\u00a2\u0006\u0004\bK\u0010PJ\u0017\u0010Q\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010504H\u0016\u00a2\u0006\u0004\bQ\u0010LJ)\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u000104\"\u0004\b\u0001\u0010N2\f\u0010O\u001a\b\u0012\u0004\u0012\u00028\u000104H\u0016\u00a2\u0006\u0004\bQ\u0010PR\u001e\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u000105048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bR\u0010SR\u0016\u00103\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b3\u0010TR$\u0010V\u001a\u00020\u00032\u0006\u0010U\u001a\u00020\u00038\u0016@RX\u0096\u000e\u00a2\u0006\f\n\u0004\bV\u0010T\u001a\u0004\bW\u0010X\u00a8\u0006Z"}, d2={"Lkotlin/collections/ArrayDeque;", "E", "Lkotlin/collections/AbstractMutableList;", "", "initialCapacity", "<init>", "(I)V", "()V", "", "elements", "(Ljava/util/Collection;)V", "element", "", "add", "(Ljava/lang/Object;)Z", "index", "", "(ILjava/lang/Object;)V", "addAll", "(ILjava/util/Collection;)Z", "(Ljava/util/Collection;)Z", "addFirst", "(Ljava/lang/Object;)V", "addLast", "clear", "contains", "internalIndex", "copyCollectionElements", "(ILjava/util/Collection;)V", "newCapacity", "copyElements", "decremented", "(I)I", "minCapacity", "ensureCapacity", "Lkotlin/Function1;", "predicate", "filterInPlace", "(Lkotlin/jvm/functions/Function1;)Z", "first", "()Ljava/lang/Object;", "firstOrNull", "get", "(I)Ljava/lang/Object;", "incremented", "indexOf", "(Ljava/lang/Object;)I", "internalGet", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "head", "", "", "structure", "internalStructure$kotlin_stdlib", "(Lkotlin/jvm/functions/Function2;)V", "internalStructure", "isEmpty", "()Z", "last", "lastIndexOf", "lastOrNull", "negativeMod", "positiveMod", "remove", "removeAll", "removeAt", "removeFirst", "removeFirstOrNull", "removeLast", "removeLastOrNull", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "testToArray$kotlin_stdlib", "()[Ljava/lang/Object;", "testToArray", "T", "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "toArray", "elementData", "[Ljava/lang/Object;", "I", "<set-?>", "size", "getSize", "()I", "Companion", "kotlin-stdlib"})
@SinceKotlin(version="1.4")
@WasExperimental(markerClass={ExperimentalStdlibApi.class})
public final class ArrayDeque<E>
extends AbstractMutableList<E> {
    private int size;
    @NotNull
    private static final Object[] emptyElementData;
    @NotNull
    private Object[] elementData;
    private static final int defaultMinCapacity = 10;
    private int head;
    @NotNull
    public static final Companion Companion;

    /*
     * WARNING - void declaration
     */
    private final void copyCollectionElements(int internalIndex, Collection<? extends E> elements) {
        int index;
        Iterator<E> iterator2 = elements.iterator();
        int n = this.elementData.length;
        for (index = internalIndex; index < n; ++index) {
            if (!iterator2.hasNext()) break;
            this.elementData[index] = iterator2.next();
        }
        index = 0;
        n = this.head;
        while (index < n) {
            void var4_4;
            if (!iterator2.hasNext()) break;
            this.elementData[index] = iterator2.next();
            ++var4_4;
        }
        this.size = this.size() + elements.size();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int lastIndexOf(Object element) {
        ArrayDeque arrayDeque = this;
        int tail = arrayDeque.positiveMod(arrayDeque.head + this.size());
        if (this.head < tail) {
            int index = tail + -1;
            int n = this.head;
            if (n <= index) {
                while (true) {
                    if (Intrinsics.areEqual(element, this.elementData[index])) {
                        return index - this.head;
                    }
                    if (index != n) {
                        --index;
                        continue;
                    }
                    break;
                }
            }
        } else if (this.head > tail) {
            int index;
            for (index = tail + -1; -1 < index; --index) {
                if (!Intrinsics.areEqual(element, this.elementData[index])) continue;
                return index + this.elementData.length - this.head;
            }
            index = ArraysKt.getLastIndex(this.elementData);
            int n = this.head;
            if (n <= index) {
                while (true) {
                    void var3_4;
                    if (Intrinsics.areEqual(element, this.elementData[index])) {
                        return index - this.head;
                    }
                    if (var3_4 == n) break;
                    --var3_4;
                }
            }
        }
        return -1;
    }

    public final E last() {
        if (this.isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        ArrayDeque arrayDeque = this;
        return (E)this.elementData[arrayDeque.positiveMod(arrayDeque.head + CollectionsKt.getLastIndex(this))];
    }

    @Override
    public int getSize() {
        return this.size;
    }

    private final int incremented(int index) {
        return index == ArraysKt.getLastIndex(this.elementData) ? 0 : index + 1;
    }

    public ArrayDeque(int initialCapacity) {
        Object[] objectArray;
        if (initialCapacity == 0) {
            objectArray = emptyElementData;
        } else if (initialCapacity > 0) {
            objectArray = new Object[initialCapacity];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
        }
        this.elementData = objectArray;
    }

    @Override
    public boolean add(E element) {
        this.addLast(element);
        return true;
    }

    public final E first() {
        if (this.isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E)this.elementData[this.head];
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public final E removeLast() {
        void var2_2;
        if (this.isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        ArrayDeque arrayDeque = this;
        int internalLastIndex = arrayDeque.positiveMod(arrayDeque.head + CollectionsKt.getLastIndex(this));
        Object element = this.elementData[internalLastIndex];
        this.elementData[internalLastIndex] = null;
        this.size = this.size() - 1;
        return var2_2;
    }

    @Override
    public boolean remove(Object element) {
        int index = this.indexOf(element);
        if (index == -1) {
            return false;
        }
        this.remove(index);
        return true;
    }

    /*
     * WARNING - void declaration
     */
    private final boolean filterInPlace(Function1<? super E, Boolean> predicate) {
        void var5_5;
        block14: {
            block13: {
                boolean $i$f$filterInPlace = false;
                if (this.isEmpty()) break block13;
                boolean bl = this.elementData.length == 0;
                if (!bl) break block14;
            }
            return false;
        }
        ArrayDeque arrayDeque = this;
        int tail = arrayDeque.positiveMod(arrayDeque.head + this.size());
        int newTail = this.head;
        boolean modified = false;
        if (this.head < tail) {
            for (int index = this.head; index < tail; ++index) {
                Object element = this.elementData[index];
                if (predicate.invoke(element).booleanValue()) {
                    this.elementData[newTail++] = element;
                    continue;
                }
                modified = true;
            }
            ArraysKt.fill(this.elementData, null, newTail, tail);
        } else {
            int index;
            int element = this.elementData.length;
            for (index = this.head; index < element; ++index) {
                Object element2 = this.elementData[index];
                this.elementData[index] = null;
                if (predicate.invoke(element2).booleanValue()) {
                    void var8_11;
                    this.elementData[newTail++] = var8_11;
                    continue;
                }
                modified = true;
            }
            newTail = this.positiveMod(newTail);
            index = 0;
            while (index < tail) {
                void var6_7;
                Object element3 = this.elementData[index];
                this.elementData[index] = null;
                if (predicate.invoke(element3).booleanValue()) {
                    this.elementData[newTail] = element3;
                    newTail = this.incremented(newTail);
                } else {
                    modified = true;
                }
                ++var6_7;
            }
        }
        if (modified) {
            void var4_4;
            this.size = this.negativeMod((int)(var4_4 - this.head));
        }
        return (boolean)var5_5;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public E set(int index, E element) {
        void var4_4;
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(index, this.size());
        ArrayDeque arrayDeque = this;
        int internalIndex = arrayDeque.positiveMod(arrayDeque.head + index);
        Object oldElement = this.elementData[internalIndex];
        this.elementData[internalIndex] = element;
        return var4_4;
    }

    @InlineOnly
    private final E internalGet(int internalIndex) {
        return (E)this.elementData[internalIndex];
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int indexOf(Object element) {
        block5: {
            int index;
            int tail;
            block4: {
                ArrayDeque arrayDeque = this;
                tail = arrayDeque.positiveMod(arrayDeque.head + this.size());
                if (this.head >= tail) break block4;
                for (int index2 = this.head; index2 < tail; ++index2) {
                    if (!Intrinsics.areEqual(element, this.elementData[index2])) continue;
                    return index2 - this.head;
                }
                break block5;
            }
            if (this.head < tail) break block5;
            int n = this.elementData.length;
            for (index = this.head; index < n; ++index) {
                if (!Intrinsics.areEqual(element, this.elementData[index])) continue;
                return index - this.head;
            }
            index = 0;
            while (index < tail) {
                void var3_4;
                if (Intrinsics.areEqual(element, this.elementData[index])) {
                    return index + this.elementData.length - this.head;
                }
                ++var3_4;
            }
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean removeAll(@NotNull Collection<? extends Object> elements) {
        boolean bl;
        int n;
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayDeque this_$iv = this;
        boolean $i$f$filterInPlace = false;
        if (this_$iv.isEmpty()) return false;
        if (this_$iv.elementData.length == 0) {
            return false;
        }
        boolean bl2 = false;
        if (bl2) {
            return false;
        }
        ArrayDeque arrayDeque = this_$iv;
        int tail$iv = arrayDeque.positiveMod(arrayDeque.head + this_$iv.size());
        int newTail$iv = this_$iv.head;
        boolean modified$iv = false;
        if (this_$iv.head < tail$iv) {
            for (int index$iv = this_$iv.head; index$iv < tail$iv; ++index$iv) {
                Object element$iv;
                Object it = element$iv = this_$iv.elementData[index$iv];
                boolean bl3 = false;
                boolean bl4 = !elements.contains(it);
                if (bl4) {
                    this_$iv.elementData[newTail$iv++] = element$iv;
                    continue;
                }
                modified$iv = true;
            }
            ArraysKt.fill(this_$iv.elementData, null, newTail$iv, tail$iv);
        } else {
            int index$iv;
            int element$iv = this_$iv.elementData.length;
            for (index$iv = this_$iv.head; index$iv < element$iv; ++index$iv) {
                Object element$iv2 = this_$iv.elementData[index$iv];
                this_$iv.elementData[index$iv] = null;
                Object it = element$iv2;
                boolean bl5 = false;
                boolean bl6 = !elements.contains(it);
                if (bl6) {
                    void var9_13;
                    this_$iv.elementData[newTail$iv++] = var9_13;
                    continue;
                }
                modified$iv = true;
            }
            newTail$iv = this_$iv.positiveMod(newTail$iv);
            index$iv = 0;
            while (index$iv < tail$iv) {
                void var7_8;
                Object element$iv3 = this_$iv.elementData[index$iv];
                this_$iv.elementData[index$iv] = null;
                Object object = element$iv3;
                boolean bl7 = false;
                boolean bl8 = !elements.contains(object);
                if (bl8) {
                    void var8_11;
                    this_$iv.elementData[newTail$iv] = var8_11;
                    n = this_$iv.incremented(newTail$iv);
                } else {
                    bl = true;
                }
                ++var7_8;
            }
        }
        if (bl) {
            void var2_2;
            var2_2.size = super.negativeMod((int)(n - var2_2.head));
        }
        boolean bl9 = bl;
        return bl9;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean addAll(int index, @NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(index, this.size());
        if (elements.isEmpty()) {
            return false;
        }
        if (index == this.size()) {
            return this.addAll(elements);
        }
        this.ensureCapacity(this.size() + elements.size());
        ArrayDeque arrayDeque = this;
        int tail = arrayDeque.positiveMod(arrayDeque.head + this.size());
        ArrayDeque arrayDeque2 = this;
        int internalIndex = arrayDeque2.positiveMod(arrayDeque2.head + index);
        int elementsSize = elements.size();
        if (index < this.size() + 1 >> 1) {
            int shiftedHead = this.head - elementsSize;
            if (internalIndex >= this.head) {
                if (shiftedHead >= 0) {
                    ArraysKt.copyInto(this.elementData, this.elementData, shiftedHead, this.head, internalIndex);
                } else {
                    int shiftToBack = this.elementData.length - (shiftedHead += this.elementData.length);
                    int elementsToShift = internalIndex - this.head;
                    if (shiftToBack >= elementsToShift) {
                        ArraysKt.copyInto(this.elementData, this.elementData, shiftedHead, this.head, internalIndex);
                    } else {
                        void var8_10;
                        ArraysKt.copyInto(this.elementData, this.elementData, shiftedHead, this.head, this.head + shiftToBack);
                        ArraysKt.copyInto(this.elementData, this.elementData, 0, this.head + var8_10, internalIndex);
                    }
                }
            } else {
                ArraysKt.copyInto(this.elementData, this.elementData, shiftedHead, this.head, this.elementData.length);
                if (elementsSize >= internalIndex) {
                    ArraysKt.copyInto(this.elementData, this.elementData, this.elementData.length - elementsSize, 0, internalIndex);
                } else {
                    ArraysKt.copyInto(this.elementData, this.elementData, this.elementData.length - elementsSize, 0, elementsSize);
                    ArraysKt.copyInto(this.elementData, this.elementData, 0, elementsSize, internalIndex);
                }
            }
            this.head = shiftedHead;
            this.copyCollectionElements(this.negativeMod(internalIndex - elementsSize), elements);
        } else {
            void var2_2;
            void var4_4;
            int shiftedInternalIndex = internalIndex + elementsSize;
            if (internalIndex < tail) {
                if (tail + elementsSize <= this.elementData.length) {
                    ArraysKt.copyInto(this.elementData, this.elementData, shiftedInternalIndex, internalIndex, tail);
                } else if (shiftedInternalIndex >= this.elementData.length) {
                    ArraysKt.copyInto(this.elementData, this.elementData, shiftedInternalIndex - this.elementData.length, internalIndex, tail);
                } else {
                    void var7_9;
                    int shiftToFront = tail + elementsSize - this.elementData.length;
                    ArraysKt.copyInto(this.elementData, this.elementData, 0, tail - shiftToFront, tail);
                    ArraysKt.copyInto(this.elementData, this.elementData, shiftedInternalIndex, internalIndex, tail - var7_9);
                }
            } else {
                ArraysKt.copyInto(this.elementData, this.elementData, elementsSize, 0, tail);
                if (shiftedInternalIndex >= this.elementData.length) {
                    ArraysKt.copyInto(this.elementData, this.elementData, shiftedInternalIndex - this.elementData.length, internalIndex, this.elementData.length);
                } else {
                    void var5_5;
                    void var6_7;
                    ArraysKt.copyInto(this.elementData, this.elementData, 0, this.elementData.length - elementsSize, this.elementData.length);
                    ArraysKt.copyInto(this.elementData, this.elementData, (int)var6_7, (int)var4_4, this.elementData.length - var5_5);
                }
            }
            this.copyCollectionElements((int)var4_4, (Collection<? extends E>)var2_2);
        }
        return true;
    }

    @NotNull
    public final <T> T[] testToArray$kotlin_stdlib(@NotNull T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return this.toArray(array);
    }

    @Nullable
    public final E removeLastOrNull() {
        return this.isEmpty() ? null : (E)this.removeLast();
    }

    @Override
    @NotNull
    public Object[] toArray() {
        return this.toArray(new Object[this.size()]);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public E removeAt(int index) {
        void var3_3;
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(index, this.size());
        if (index == CollectionsKt.getLastIndex(this)) {
            return this.removeLast();
        }
        if (index == 0) {
            return this.removeFirst();
        }
        ArrayDeque arrayDeque = this;
        int internalIndex = arrayDeque.positiveMod(arrayDeque.head + index);
        Object element = this.elementData[internalIndex];
        if (index < this.size() >> 1) {
            if (internalIndex >= this.head) {
                ArraysKt.copyInto(this.elementData, this.elementData, this.head + 1, this.head, internalIndex);
            } else {
                ArraysKt.copyInto(this.elementData, this.elementData, 1, 0, internalIndex);
                this.elementData[0] = this.elementData[this.elementData.length - 1];
                ArraysKt.copyInto(this.elementData, this.elementData, this.head + 1, this.head, this.elementData.length - 1);
            }
            this.elementData[this.head] = null;
            this.head = this.incremented(this.head);
        } else {
            ArrayDeque arrayDeque2 = this;
            int internalLastIndex = arrayDeque2.positiveMod(arrayDeque2.head + CollectionsKt.getLastIndex(this));
            if (internalIndex <= internalLastIndex) {
                ArraysKt.copyInto(this.elementData, this.elementData, internalIndex, internalIndex + 1, internalLastIndex + 1);
            } else {
                void var4_4;
                ArraysKt.copyInto(this.elementData, this.elementData, internalIndex, internalIndex + 1, this.elementData.length);
                this.elementData[this.elementData.length - 1] = this.elementData[0];
                ArraysKt.copyInto(this.elementData, this.elementData, 0, 1, (int)(var4_4 + true));
            }
            this.elementData[var4_4] = null;
        }
        this.size = this.size() - 1;
        return var3_3;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean retainAll(@NotNull Collection<? extends Object> elements) {
        boolean bl;
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayDeque this_$iv = this;
        boolean $i$f$filterInPlace = false;
        if (this_$iv.isEmpty()) return false;
        if (this_$iv.elementData.length == 0) {
            return false;
        }
        boolean bl2 = false;
        if (bl2) {
            return false;
        }
        ArrayDeque arrayDeque = this_$iv;
        int tail$iv = arrayDeque.positiveMod(arrayDeque.head + this_$iv.size());
        int newTail$iv = this_$iv.head;
        boolean modified$iv = false;
        if (this_$iv.head < tail$iv) {
            for (int index$iv = this_$iv.head; index$iv < tail$iv; ++index$iv) {
                Object element$iv;
                Object it = element$iv = this_$iv.elementData[index$iv];
                boolean bl3 = false;
                if (elements.contains(it)) {
                    this_$iv.elementData[newTail$iv++] = element$iv;
                    continue;
                }
                modified$iv = true;
            }
            ArraysKt.fill(this_$iv.elementData, null, newTail$iv, tail$iv);
        } else {
            int index$iv;
            int element$iv = this_$iv.elementData.length;
            for (index$iv = this_$iv.head; index$iv < element$iv; ++index$iv) {
                Object element$iv2 = this_$iv.elementData[index$iv];
                this_$iv.elementData[index$iv] = null;
                Object it = element$iv2;
                boolean bl4 = false;
                if (elements.contains(it)) {
                    void var9_13;
                    this_$iv.elementData[newTail$iv++] = var9_13;
                    continue;
                }
                modified$iv = true;
            }
            newTail$iv = this_$iv.positiveMod(newTail$iv);
            index$iv = 0;
            while (index$iv < tail$iv) {
                void var7_8;
                Object element$iv3 = this_$iv.elementData[index$iv];
                this_$iv.elementData[index$iv] = null;
                Object object = element$iv3;
                boolean bl5 = false;
                if (elements.contains(object)) {
                    void var8_11;
                    this_$iv.elementData[newTail$iv] = var8_11;
                    newTail$iv = this_$iv.incremented(newTail$iv);
                } else {
                    bl = true;
                }
                ++var7_8;
            }
        }
        if (bl) {
            void var5_5;
            void var2_2;
            var2_2.size = super.negativeMod((int)(var5_5 - var2_2.head));
        }
        boolean bl6 = bl;
        return bl6;
    }

    private final int positiveMod(int index) {
        return index >= this.elementData.length ? index - this.elementData.length : index;
    }

    /*
     * Unable to fully structure code
     */
    public final void internalStructure$kotlin_stdlib(@NotNull Function2<? super Integer, ? super Object[], Unit> structure) {
        Intrinsics.checkNotNullParameter(structure, "structure");
        v0 = this;
        tail = v0.positiveMod(v0.head + this.size());
        if (this.isEmpty()) ** GOTO lbl-1000
        if (this.head < tail) lbl-1000:
        // 2 sources

        {
            v1 = this.head;
        } else {
            v1 = this.head - this.elementData.length;
        }
        head = v1;
        structure.invoke((Integer)head, (Object[])this.toArray());
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void add(int index, E element) {
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(index, this.size());
        if (index == this.size()) {
            this.addLast(element);
            return;
        }
        if (index == 0) {
            this.addFirst(element);
            return;
        }
        this.ensureCapacity(this.size() + 1);
        ArrayDeque arrayDeque = this;
        int internalIndex = arrayDeque.positiveMod(arrayDeque.head + index);
        if (index < this.size() + 1 >> 1) {
            void var5_6;
            int decrementedInternalIndex = this.decremented(internalIndex);
            int decrementedHead = this.decremented(this.head);
            if (decrementedInternalIndex >= this.head) {
                this.elementData[decrementedHead] = this.elementData[this.head];
                ArraysKt.copyInto(this.elementData, this.elementData, this.head, this.head + 1, decrementedInternalIndex + 1);
            } else {
                ArraysKt.copyInto(this.elementData, this.elementData, this.head - 1, this.head, this.elementData.length);
                this.elementData[this.elementData.length - 1] = this.elementData[0];
                ArraysKt.copyInto(this.elementData, this.elementData, 0, 1, decrementedInternalIndex + 1);
            }
            this.elementData[decrementedInternalIndex] = element;
            this.head = var5_6;
        } else {
            void var2_2;
            ArrayDeque arrayDeque2 = this;
            int tail = arrayDeque2.positiveMod(arrayDeque2.head + this.size());
            if (internalIndex < tail) {
                ArraysKt.copyInto(this.elementData, this.elementData, internalIndex + 1, internalIndex, tail);
            } else {
                ArraysKt.copyInto(this.elementData, this.elementData, 1, 0, tail);
                this.elementData[0] = this.elementData[this.elementData.length - 1];
                ArraysKt.copyInto(this.elementData, this.elementData, internalIndex + 1, internalIndex, this.elementData.length - 1);
            }
            this.elementData[var3_3] = var2_2;
        }
        this.size = this.size() + 1;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    @NotNull
    public <T> T[] toArray(@NotNull T[] array) {
        void var2_2;
        Intrinsics.checkNotNullParameter(array, "array");
        Object[] dest = array.length >= this.size() ? array : ArraysKt.arrayOfNulls(array, this.size());
        ArrayDeque arrayDeque = this;
        int tail = arrayDeque.positiveMod(arrayDeque.head + this.size());
        if (this.head < tail) {
            ArraysKt.copyInto$default(this.elementData, dest, 0, this.head, tail, 2, null);
        } else {
            boolean bl = !((Collection)this).isEmpty();
            if (bl) {
                ArraysKt.copyInto(this.elementData, dest, 0, this.head, this.elementData.length);
                ArraysKt.copyInto(this.elementData, dest, this.elementData.length - this.head, 0, tail);
            }
        }
        return CollectionsKt.terminateCollectionToArray(this.size(), var2_2);
    }

    @NotNull
    public final Object[] testToArray$kotlin_stdlib() {
        return this.toArray();
    }

    public ArrayDeque(@NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection<E> $this$toTypedArray$iv = elements;
        boolean $i$f$toTypedArray = false;
        Collection<E> thisCollection$iv = $this$toTypedArray$iv;
        this.elementData = thisCollection$iv.toArray(new Object[0]);
        this.size = this.elementData.length;
        boolean bl = this.elementData.length == 0;
        if (bl) {
            this.elementData = emptyElementData;
        }
    }

    @Override
    public final void addFirst(E element) {
        this.ensureCapacity(this.size() + 1);
        this.head = this.decremented(this.head);
        this.elementData[this.head] = element;
        this.size = this.size() + 1;
    }

    @Override
    public void clear() {
        ArrayDeque arrayDeque = this;
        int tail = arrayDeque.positiveMod(arrayDeque.head + this.size());
        if (this.head < tail) {
            ArraysKt.fill(this.elementData, null, this.head, tail);
        } else {
            boolean bl = !((Collection)this).isEmpty();
            if (bl) {
                ArraysKt.fill(this.elementData, null, this.head, this.elementData.length);
                ArraysKt.fill(this.elementData, null, 0, tail);
            }
        }
        this.head = 0;
        this.size = 0;
    }

    @Nullable
    public final E firstOrNull() {
        return (E)(this.isEmpty() ? null : this.elementData[this.head]);
    }

    private final int negativeMod(int index) {
        return index < 0 ? index + this.elementData.length : index;
    }

    /*
     * WARNING - void declaration
     */
    private final void copyElements(int newCapacity) {
        void var2_2;
        Object[] newElements = new Object[newCapacity];
        ArraysKt.copyInto(this.elementData, newElements, 0, this.head, this.elementData.length);
        ArraysKt.copyInto(this.elementData, newElements, this.elementData.length - this.head, 0, this.head);
        this.head = 0;
        this.elementData = var2_2;
    }

    @Override
    public boolean addAll(@NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        this.ensureCapacity(this.size() + elements.size());
        ArrayDeque arrayDeque = this;
        this.copyCollectionElements(arrayDeque.positiveMod(arrayDeque.head + this.size()), elements);
        return true;
    }

    @Override
    public final void addLast(E element) {
        this.ensureCapacity(this.size() + 1);
        ArrayDeque arrayDeque = this;
        this.elementData[arrayDeque.positiveMod((int)(arrayDeque.head + this.size()))] = element;
        this.size = this.size() + 1;
    }

    public ArrayDeque() {
        this.elementData = emptyElementData;
    }

    private final int decremented(int index) {
        return index == 0 ? ArraysKt.getLastIndex(this.elementData) : index + -1;
    }

    @InlineOnly
    private final int internalIndex(int index) {
        return this.positiveMod(this.head + index);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public final E removeFirst() {
        void var1_1;
        if (this.isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object element = this.elementData[this.head];
        this.elementData[this.head] = null;
        this.head = this.incremented(this.head);
        this.size = this.size() - 1;
        return var1_1;
    }

    @Nullable
    public final E removeFirstOrNull() {
        return this.isEmpty() ? null : (E)this.removeFirst();
    }

    @Nullable
    public final E lastOrNull() {
        Object object;
        if (this.isEmpty()) {
            object = null;
        } else {
            ArrayDeque arrayDeque = this;
            object = this.elementData[arrayDeque.positiveMod(arrayDeque.head + CollectionsKt.getLastIndex(this))];
        }
        return (E)object;
    }

    @Override
    public boolean contains(Object element) {
        return this.indexOf(element) != -1;
    }

    @Override
    public E get(int index) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(index, this.size());
        ArrayDeque arrayDeque = this;
        return (E)this.elementData[arrayDeque.positiveMod(arrayDeque.head + index)];
    }

    static {
        Companion = new Companion(null);
        boolean $i$f$emptyArray = false;
        emptyElementData = new Object[0];
    }

    private final void ensureCapacity(int minCapacity) {
        if (minCapacity < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        if (minCapacity <= this.elementData.length) {
            return;
        }
        if (this.elementData == emptyElementData) {
            this.elementData = new Object[RangesKt.coerceAtLeast(minCapacity, 10)];
            return;
        }
        int newCapacity = AbstractList.Companion.newCapacity$kotlin_stdlib(this.elementData.length, minCapacity);
        this.copyElements(newCapacity);
    }

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2={"Lkotlin/collections/ArrayDeque$Companion;", "", "<init>", "()V", "", "defaultMinCapacity", "I", "", "emptyElementData", "[Ljava/lang/Object;", "kotlin-stdlib"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }

        private Companion() {
        }
    }
}

