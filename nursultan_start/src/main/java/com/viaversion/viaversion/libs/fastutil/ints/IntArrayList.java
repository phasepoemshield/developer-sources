/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.fastutil.ints.IntArrayList$Spliterator
 *  com.viaversion.viaversion.libs.fastutil.ints.IntArrayList$SubList
 *  com.viaversion.viaversion.libs.fastutil.ints.IntCollections$SizeDecreasingSupplier
 *  com.viaversion.viaversion.libs.fastutil.ints.IntSpliterator
 */
package com.viaversion.viaversion.libs.fastutil.ints;

import com.viaversion.viaversion.libs.fastutil.Arrays;
import com.viaversion.viaversion.libs.fastutil.ints.AbstractIntList;
import com.viaversion.viaversion.libs.fastutil.ints.IntArrayList;
import com.viaversion.viaversion.libs.fastutil.ints.IntArrays;
import com.viaversion.viaversion.libs.fastutil.ints.IntCollection;
import com.viaversion.viaversion.libs.fastutil.ints.IntCollections;
import com.viaversion.viaversion.libs.fastutil.ints.IntComparator;
import com.viaversion.viaversion.libs.fastutil.ints.IntIterator;
import com.viaversion.viaversion.libs.fastutil.ints.IntIterators;
import com.viaversion.viaversion.libs.fastutil.ints.IntList;
import com.viaversion.viaversion.libs.fastutil.ints.IntListIterator;
import com.viaversion.viaversion.libs.fastutil.ints.IntSpliterator;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class IntArrayList
extends AbstractIntList
implements RandomAccess,
Cloneable,
Serializable {
    private static final long serialVersionUID = -7046029254386353130L;
    public static final int DEFAULT_INITIAL_CAPACITY = 10;
    protected transient int[] a;
    protected int size;

    private static final int[] copyArraySafe(int[] a, int length) {
        if (length == 0) {
            return IntArrays.EMPTY_ARRAY;
        }
        return java.util.Arrays.copyOf(a, length);
    }

    private static final int[] copyArrayFromSafe(IntArrayList l) {
        return IntArrayList.copyArraySafe(l.a, l.size);
    }

    protected IntArrayList(int[] a, boolean wrapped) {
        this.a = a;
    }

    private void initArrayFromCapacity(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Initial capacity (" + capacity + ") is negative");
        }
        this.a = capacity == 0 ? IntArrays.EMPTY_ARRAY : new int[capacity];
    }

    public IntArrayList(int capacity) {
        this.initArrayFromCapacity(capacity);
    }

    public IntArrayList() {
        this.a = IntArrays.DEFAULT_EMPTY_ARRAY;
    }

    public IntArrayList(Collection<? extends Integer> c) {
        if (c instanceof IntArrayList) {
            this.a = IntArrayList.copyArrayFromSafe((IntArrayList)c);
            this.size = this.a.length;
        } else {
            this.initArrayFromCapacity(c.size());
            if (c instanceof IntList) {
                this.size = c.size();
                ((IntList)c).getElements(0, this.a, 0, this.size);
            } else {
                this.size = IntIterators.unwrap(IntIterators.asIntIterator(c.iterator()), this.a);
            }
        }
    }

    public IntArrayList(IntCollection c) {
        if (c instanceof IntArrayList) {
            this.a = IntArrayList.copyArrayFromSafe((IntArrayList)c);
            this.size = this.a.length;
        } else {
            this.initArrayFromCapacity(c.size());
            if (c instanceof IntList) {
                this.size = c.size();
                ((IntList)c).getElements(0, this.a, 0, this.size);
            } else {
                this.size = IntIterators.unwrap(c.iterator(), this.a);
            }
        }
    }

    public IntArrayList(IntList l) {
        if (l instanceof IntArrayList) {
            this.a = IntArrayList.copyArrayFromSafe((IntArrayList)l);
            this.size = this.a.length;
        } else {
            this.initArrayFromCapacity(l.size());
            this.size = l.size();
            l.getElements(0, this.a, 0, this.size);
        }
    }

    public IntArrayList(int[] a) {
        this(a, 0, a.length);
    }

    public IntArrayList(int[] a, int offset, int length) {
        this(length);
        System.arraycopy(a, offset, this.a, 0, length);
        this.size = length;
    }

    public IntArrayList(Iterator<? extends Integer> i) {
        this();
        while (i.hasNext()) {
            this.add((int)i.next());
        }
    }

    public IntArrayList(IntIterator i) {
        this();
        while (i.hasNext()) {
            this.add(i.nextInt());
        }
    }

    public int[] elements() {
        return this.a;
    }

    public static IntArrayList wrap(int[] a, int length) {
        if (length > a.length) {
            throw new IllegalArgumentException("The specified length (" + length + ") is greater than the array size (" + a.length + ")");
        }
        IntArrayList l = new IntArrayList(a, true);
        l.size = length;
        return l;
    }

    public static IntArrayList wrap(int[] a) {
        return IntArrayList.wrap(a, a.length);
    }

    public static IntArrayList of() {
        return new IntArrayList();
    }

    public static IntArrayList of(int ... init) {
        return IntArrayList.wrap(init);
    }

    public static IntArrayList toList(IntStream stream) {
        return stream.collect(IntArrayList::new, IntArrayList::add, IntList::addAll);
    }

    public static IntArrayList toListWithExpectedSize(IntStream stream, int expectedSize) {
        if (expectedSize <= 10) {
            return IntArrayList.toList(stream);
        }
        return stream.collect(new IntCollections.SizeDecreasingSupplier(expectedSize, size -> size <= 10 ? new IntArrayList() : new IntArrayList(size)), IntArrayList::add, IntList::addAll);
    }

    public void ensureCapacity(int capacity) {
        if (capacity <= this.a.length || this.a == IntArrays.DEFAULT_EMPTY_ARRAY && capacity <= 10) {
            return;
        }
        this.a = IntArrays.ensureCapacity(this.a, capacity, this.size);
        assert (this.size <= this.a.length);
    }

    private void grow(int capacity) {
        if (capacity <= this.a.length) {
            return;
        }
        if (this.a != IntArrays.DEFAULT_EMPTY_ARRAY) {
            capacity = (int)Math.max(Math.min((long)this.a.length + (long)(this.a.length >> 1), 0x7FFFFFF7L), (long)capacity);
        } else if (capacity < 10) {
            capacity = 10;
        }
        this.a = IntArrays.forceCapacity(this.a, capacity, this.size);
        assert (this.size <= this.a.length);
    }

    @Override
    public void add(int index, int k) {
        this.ensureIndex(index);
        this.grow(this.size + 1);
        if (index != this.size) {
            System.arraycopy(this.a, index, this.a, index + 1, this.size - index);
        }
        this.a[index] = k;
        ++this.size;
        assert (this.size <= this.a.length);
    }

    @Override
    public boolean add(int k) {
        this.grow(this.size + 1);
        this.a[this.size++] = k;
        assert (this.size <= this.a.length);
        return true;
    }

    @Override
    public int getInt(int index) {
        if (index >= this.size) {
            throw new IndexOutOfBoundsException("Index (" + index + ") is greater than or equal to list size (" + this.size + ")");
        }
        return this.a[index];
    }

    @Override
    public int indexOf(int k) {
        int[] a = this.a;
        for (int i = 0; i < this.size; ++i) {
            if (k != a[i]) continue;
            return i;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(int k) {
        int[] a = this.a;
        int i = this.size;
        while (i-- != 0) {
            if (k != a[i]) continue;
            return i;
        }
        return -1;
    }

    @Override
    public int removeInt(int index) {
        if (index >= this.size) {
            throw new IndexOutOfBoundsException("Index (" + index + ") is greater than or equal to list size (" + this.size + ")");
        }
        int[] a = this.a;
        int old = a[index];
        --this.size;
        if (index != this.size) {
            System.arraycopy(a, index + 1, a, index, this.size - index);
        }
        assert (this.size <= a.length);
        return old;
    }

    @Override
    public boolean rem(int k) {
        int index = this.indexOf(k);
        if (index == -1) {
            return false;
        }
        this.removeInt(index);
        assert (this.size <= this.a.length);
        return true;
    }

    @Override
    public int set(int index, int k) {
        if (index >= this.size) {
            throw new IndexOutOfBoundsException("Index (" + index + ") is greater than or equal to list size (" + this.size + ")");
        }
        int old = this.a[index];
        this.a[index] = k;
        return old;
    }

    @Override
    public void clear() {
        this.size = 0;
        assert (this.size <= this.a.length);
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void size(int size) {
        if (size > this.a.length) {
            this.a = IntArrays.forceCapacity(this.a, size, this.size);
        }
        if (size > this.size) {
            java.util.Arrays.fill(this.a, this.size, size, 0);
        }
        this.size = size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    public void trim() {
        this.trim(0);
    }

    public void trim(int n) {
        if (n >= this.a.length || this.size == this.a.length) {
            return;
        }
        int[] t = new int[Math.max(n, this.size)];
        System.arraycopy(this.a, 0, t, 0, this.size);
        this.a = t;
        assert (this.size <= this.a.length);
    }

    @Override
    public IntList subList(int from, int to) {
        if (from == 0 && to == this.size()) {
            return this;
        }
        this.ensureIndex(from);
        this.ensureIndex(to);
        if (from > to) {
            throw new IndexOutOfBoundsException("Start index (" + from + ") is greater than end index (" + to + ")");
        }
        return new SubList(this, from, to);
    }

    @Override
    public void getElements(int from, int[] a, int offset, int length) {
        IntArrays.ensureOffsetLength(a, offset, length);
        System.arraycopy(this.a, from, a, offset, length);
    }

    @Override
    public void removeElements(int from, int to) {
        Arrays.ensureFromTo(this.size, from, to);
        System.arraycopy(this.a, to, this.a, from, this.size - to);
        this.size -= to - from;
    }

    @Override
    public void addElements(int index, int[] a, int offset, int length) {
        this.ensureIndex(index);
        IntArrays.ensureOffsetLength(a, offset, length);
        this.grow(this.size + length);
        System.arraycopy(this.a, index, this.a, index + length, this.size - index);
        System.arraycopy(a, offset, this.a, index, length);
        this.size += length;
    }

    @Override
    public void setElements(int index, int[] a, int offset, int length) {
        this.ensureIndex(index);
        IntArrays.ensureOffsetLength(a, offset, length);
        if (index + length > this.size) {
            throw new IndexOutOfBoundsException("End index (" + (index + length) + ") is greater than list size (" + this.size + ")");
        }
        System.arraycopy(a, offset, this.a, index, length);
    }

    @Override
    public void forEach(IntConsumer action) {
        int[] a = this.a;
        for (int i = 0; i < this.size; ++i) {
            action.accept(a[i]);
        }
    }

    @Override
    public boolean addAll(int index, IntCollection c) {
        if (c instanceof IntList) {
            return this.addAll(index, (IntList)c);
        }
        this.ensureIndex(index);
        int n = c.size();
        if (n == 0) {
            return false;
        }
        this.grow(this.size + n);
        System.arraycopy(this.a, index, this.a, index + n, this.size - index);
        IntIterator i = c.iterator();
        this.size += n;
        while (n-- != 0) {
            this.a[index++] = i.nextInt();
        }
        assert (this.size <= this.a.length);
        return true;
    }

    @Override
    public boolean addAll(int index, IntList l) {
        this.ensureIndex(index);
        int n = l.size();
        if (n == 0) {
            return false;
        }
        this.grow(this.size + n);
        System.arraycopy(this.a, index, this.a, index + n, this.size - index);
        l.getElements(0, this.a, index, n);
        this.size += n;
        assert (this.size <= this.a.length);
        return true;
    }

    @Override
    public boolean removeAll(IntCollection c) {
        int[] a = this.a;
        int j = 0;
        for (int i = 0; i < this.size; ++i) {
            if (c.contains(a[i])) continue;
            a[j++] = a[i];
        }
        boolean modified = this.size != j;
        this.size = j;
        return modified;
    }

    @Override
    public boolean removeIf(IntPredicate filter) {
        int[] a = this.a;
        int j = 0;
        for (int i = 0; i < this.size; ++i) {
            if (filter.test(a[i])) continue;
            a[j++] = a[i];
        }
        boolean modified = this.size != j;
        this.size = j;
        return modified;
    }

    @Override
    public int[] toArray(int[] a) {
        if (a == null || a.length < this.size) {
            a = java.util.Arrays.copyOf(a, this.size);
        }
        System.arraycopy(this.a, 0, a, 0, this.size);
        return a;
    }

    @Override
    public IntListIterator listIterator(int index) {
        this.ensureIndex(index);
        return new /* Unavailable Anonymous Inner Class!! */;
    }

    @Override
    public IntSpliterator spliterator() {
        return new Spliterator(this);
    }

    @Override
    public void sort(IntComparator comp) {
        if (comp == null) {
            IntArrays.stableSort(this.a, 0, this.size);
        } else {
            IntArrays.stableSort(this.a, 0, this.size, comp);
        }
    }

    @Override
    public void unstableSort(IntComparator comp) {
        if (comp == null) {
            IntArrays.unstableSort(this.a, 0, this.size);
        } else {
            IntArrays.unstableSort(this.a, 0, this.size, comp);
        }
    }

    public IntArrayList clone() {
        IntArrayList cloned = null;
        if (this.getClass() == IntArrayList.class) {
            cloned = new IntArrayList(IntArrayList.copyArraySafe(this.a, this.size), false);
            cloned.size = this.size;
        } else {
            try {
                cloned = (IntArrayList)super.clone();
            }
            catch (CloneNotSupportedException err) {
                throw new InternalError(err);
            }
            cloned.a = IntArrayList.copyArraySafe(this.a, this.size);
        }
        return cloned;
    }

    public boolean equals(IntArrayList l) {
        if (l == this) {
            return true;
        }
        int s = this.size();
        if (s != l.size()) {
            return false;
        }
        int[] a1 = this.a;
        int[] a2 = l.a;
        if (a1 == a2 && s == l.size()) {
            return true;
        }
        while (s-- != 0) {
            if (a1[s] == a2[s]) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof List)) {
            return false;
        }
        if (o instanceof IntArrayList) {
            return this.equals((IntArrayList)o);
        }
        if (o instanceof SubList) {
            return ((SubList)o).equals((Object)this);
        }
        return super.equals(o);
    }

    @Override
    public int compareTo(IntArrayList l) {
        int i;
        int s1 = this.size();
        int s2 = l.size();
        int[] a1 = this.a;
        int[] a2 = l.a;
        if (a1 == a2 && s1 == s2) {
            return 0;
        }
        for (i = 0; i < s1 && i < s2; ++i) {
            int e1 = a1[i];
            int e2 = a2[i];
            int r = Integer.compare(e1, e2);
            if (r == 0) continue;
            return r;
        }
        return i < s2 ? -1 : (i < s1 ? 1 : 0);
    }

    @Override
    public int compareTo(List<? extends Integer> l) {
        if (l instanceof IntArrayList) {
            return this.compareTo((IntArrayList)l);
        }
        if (l instanceof SubList) {
            return -((SubList)l).compareTo((List)this);
        }
        return super.compareTo(l);
    }

    private void writeObject(ObjectOutputStream s) throws IOException {
        s.defaultWriteObject();
        int[] a = this.a;
        for (int i = 0; i < this.size; ++i) {
            s.writeInt(a[i]);
        }
    }

    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {
        s.defaultReadObject();
        this.a = new int[this.size];
        int[] a = this.a;
        for (int i = 0; i < this.size; ++i) {
            a[i] = s.readInt();
        }
    }
}

