/*
 * Decompiled with CFR 0.152.
 */
package kotlin.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.AbstractIterator;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0012\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0007\u0010\bB\u001f\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0012\u0006\u0010\f\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0007\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00028\u0000\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0012\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0005H\u0096\u0002\u00a2\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0096\u0002\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u0005\u00a2\u0006\u0004\b\u001f\u0010\bJ\u0017\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0014\u00a2\u0006\u0004\b \u0010!J)\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010\t\"\u0004\b\u0001\u0010\u00012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00010\tH\u0014\u00a2\u0006\u0004\b \u0010#J\u001c\u0010$\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0005H\u0082\b\u00a2\u0006\u0004\b$\u0010%R\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000b\u0010&R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0006\u0010'R$\u0010)\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u00058\u0016@RX\u0096\u000e\u00a2\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b,\u0010'\u00a8\u0006-"}, d2={"Lkotlin/collections/RingBuffer;", "T", "Lkotlin/collections/AbstractList;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "capacity", "<init>", "(I)V", "", "", "buffer", "filledSize", "([Ljava/lang/Object;I)V", "element", "", "add", "(Ljava/lang/Object;)V", "maxCapacity", "expanded", "(I)Lkotlin/collections/RingBuffer;", "index", "get", "(I)Ljava/lang/Object;", "", "isFull", "()Z", "", "iterator", "()Ljava/util/Iterator;", "n", "removeFirst", "toArray", "()[Ljava/lang/Object;", "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "forward", "(II)I", "[Ljava/lang/Object;", "I", "<set-?>", "size", "getSize", "()I", "startIndex", "kotlin-stdlib"})
final class RingBuffer<T>
extends AbstractList<T>
implements RandomAccess {
    @NotNull
    private final Object[] buffer;
    private int size;
    private int startIndex;
    private final int capacity;

    public final void add(T element) {
        if (this.isFull()) {
            throw new IllegalStateException("ring buffer is full");
        }
        RingBuffer ringBuffer = this;
        int n = this.startIndex;
        int n$iv = this.size();
        boolean $i$f$forward = false;
        this.buffer[($this$forward$iv + n$iv) % ((RingBuffer)this_$iv).capacity] = element;
        int n2 = this.size();
        this.size = n2 + 1;
    }

    public RingBuffer(int capacity) {
        this(new Object[capacity], 0);
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
    @NotNull
    public <T> T[] toArray(@NotNull T[] array) {
        void var2_2;
        void var3_3;
        int idx;
        T[] TArray;
        Intrinsics.checkNotNullParameter(array, "array");
        if (array.length < this.size()) {
            T[] TArray2 = Arrays.copyOf(array, this.size());
            TArray = TArray2;
            Intrinsics.checkNotNullExpressionValue(TArray2, "copyOf(...)");
        } else {
            TArray = array;
        }
        T[] result = TArray;
        int size = this.size();
        int widx = 0;
        for (idx = this.startIndex; widx < size && idx < this.capacity; ++widx, ++idx) {
            result[widx] = this.buffer[idx];
        }
        idx = 0;
        while (widx < size) {
            result[widx] = this.buffer[idx];
            ++widx;
            ++idx;
        }
        return CollectionsKt.terminateCollectionToArray((int)var3_3, var2_2);
    }

    public final boolean isFull() {
        return this.size() == this.capacity;
    }

    public static final /* synthetic */ Object[] access$getBuffer$p(RingBuffer $this) {
        return $this.buffer;
    }

    @Override
    @NotNull
    public Iterator<T> iterator() {
        return new AbstractIterator<T>(this){
            private int count;
            private int index;
            final /* synthetic */ RingBuffer<T> this$0;
            {
                this.this$0 = $receiver;
                this.count = $receiver.size();
                this.index = RingBuffer.access$getStartIndex$p($receiver);
            }

            /*
             * WARNING - void declaration
             */
            protected void computeNext() {
                if (this.count == 0) {
                    this.done();
                } else {
                    void this_$iv;
                    void $this$forward$iv;
                    this.setNext(RingBuffer.access$getBuffer$p(this.this$0)[this.index]);
                    RingBuffer<T> ringBuffer = this.this$0;
                    int n = this.index;
                    boolean n$iv = true;
                    boolean $i$f$forward = false;
                    this.index = ($this$forward$iv + n$iv) % RingBuffer.access$getCapacity$p((RingBuffer)this_$iv);
                    int n2 = this.count;
                    this.count = n2 + -1;
                }
            }
        };
    }

    @NotNull
    public final RingBuffer<T> expanded(int maxCapacity) {
        Object[] objectArray;
        int newCapacity = RangesKt.coerceAtMost(this.capacity + (this.capacity >> 1) + 1, maxCapacity);
        if (this.startIndex == 0) {
            Object[] objectArray2 = Arrays.copyOf(this.buffer, newCapacity);
            objectArray = objectArray2;
            Intrinsics.checkNotNullExpressionValue(objectArray2, "copyOf(...)");
        } else {
            objectArray = this.toArray(new Object[newCapacity]);
        }
        Object[] newBuffer = objectArray;
        return new RingBuffer<T>(newBuffer, this.size());
    }

    /*
     * WARNING - void declaration
     */
    public RingBuffer(@NotNull Object[] buffer, int filledSize) {
        void var2_2;
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.buffer = buffer;
        boolean bl = filledSize >= 0;
        if (!bl) {
            boolean $i$a$-require-RingBuffer$32 = false;
            String $i$a$-require-RingBuffer$32 = "ring buffer filled size should not be negative but it is " + filledSize;
            throw new IllegalArgumentException($i$a$-require-RingBuffer$32.toString());
        }
        bl = filledSize <= this.buffer.length;
        if (!bl) {
            boolean bl2 = false;
            String string = "ring buffer filled size: " + filledSize + " cannot be larger than the buffer size: " + this.buffer.length;
            throw new IllegalArgumentException(string.toString());
        }
        this.capacity = this.buffer.length;
        this.size = var2_2;
    }

    private final int forward(int $this$forward, int n) {
        boolean $i$f$forward = false;
        return ($this$forward + n) % this.capacity;
    }

    /*
     * WARNING - void declaration
     */
    public final void removeFirst(int n) {
        int n2 = n >= 0 ? 1 : 0;
        if (n2 == 0) {
            boolean $i$a$-require-RingBuffer$removeFirst$32 = false;
            String $i$a$-require-RingBuffer$removeFirst$32 = "n shouldn't be negative but it is " + n;
            throw new IllegalArgumentException($i$a$-require-RingBuffer$removeFirst$32.toString());
        }
        n2 = n <= this.size() ? 1 : 0;
        if (n2 == 0) {
            boolean $i$a$-require-RingBuffer$removeFirst$42 = false;
            String $i$a$-require-RingBuffer$removeFirst$42 = "n shouldn't be greater than the buffer size: n = " + n + ", size = " + this.size();
            throw new IllegalArgumentException($i$a$-require-RingBuffer$removeFirst$42.toString());
        }
        if (n > 0) {
            void var1_1;
            void var3_7;
            void var4_8;
            void var5_9;
            int start = this.startIndex;
            RingBuffer this_$iv = this;
            int $this$forward$iv = start;
            boolean bl = false;
            void end = (var5_9 + n) % ((RingBuffer)var4_8).capacity;
            if (start > end) {
                ArraysKt.fill(this.buffer, null, start, this.capacity);
                ArraysKt.fill(this.buffer, null, 0, (int)end);
            } else {
                ArraysKt.fill(this.buffer, null, n2, (int)var3_7);
            }
            this.startIndex = var3_7;
            this.size = this.size() - var1_1;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public T get(int index) {
        void this_$iv;
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(index, this.size());
        RingBuffer ringBuffer = this;
        int $this$forward$iv = this.startIndex;
        boolean $i$f$forward = false;
        return (T)this.buffer[($this$forward$iv + index) % ((RingBuffer)this_$iv).capacity];
    }

    @Override
    public int getSize() {
        return this.size;
    }

    public static final /* synthetic */ int access$getStartIndex$p(RingBuffer $this) {
        return $this.startIndex;
    }
}

