/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.fastutil.ints.IntArraySet$Spliterator
 *  com.viaversion.viaversion.libs.fastutil.ints.IntSpliterator
 */
package com.viaversion.viaversion.libs.fastutil.ints;

import com.viaversion.viaversion.libs.fastutil.ints.AbstractIntSet;
import com.viaversion.viaversion.libs.fastutil.ints.IntArraySet;
import com.viaversion.viaversion.libs.fastutil.ints.IntArrays;
import com.viaversion.viaversion.libs.fastutil.ints.IntCollection;
import com.viaversion.viaversion.libs.fastutil.ints.IntIterator;
import com.viaversion.viaversion.libs.fastutil.ints.IntOpenHashSet;
import com.viaversion.viaversion.libs.fastutil.ints.IntSet;
import com.viaversion.viaversion.libs.fastutil.ints.IntSpliterator;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class IntArraySet
extends AbstractIntSet
implements Serializable,
Cloneable {
    private static final long serialVersionUID = 1L;
    protected transient int[] a;
    protected int size;

    public IntArraySet(Collection<? extends Integer> c) {
        this(c.size());
        this.addAll(c);
    }

    public IntArraySet(IntSet c) {
        this(c.size());
        int i = 0;
        Iterator iterator = c.iterator();
        while (iterator.hasNext()) {
            int x;
            this.a[i] = x = ((Integer)iterator.next()).intValue();
            ++i;
        }
        this.size = i;
    }

    public IntArraySet(Set<? extends Integer> c) {
        this(c.size());
        int i = 0;
        for (Integer n : c) {
            this.a[i] = n;
            ++i;
        }
        this.size = i;
    }

    public IntArraySet(int[] a, int size) {
        this.a = a;
        this.size = size;
        if (size > a.length) {
            throw new IllegalArgumentException("The provided size (" + size + ") is larger than or equal to the array size (" + a.length + ")");
        }
    }

    public IntArraySet(int[] a) {
        this.a = a;
        this.size = a.length;
    }

    public IntArraySet() {
        this.a = IntArrays.EMPTY_ARRAY;
    }

    public IntArraySet(int capacity) {
        this.a = new int[capacity];
    }

    public IntArraySet(IntCollection c) {
        this(c.size());
        this.addAll(c);
    }

    @Override
    public boolean remove(int k) {
        int pos = this.findKey(k);
        if (pos == -1) {
            return false;
        }
        int tail = this.size - pos - 1;
        for (int i = 0; i < tail; ++i) {
            this.a[pos + i] = this.a[pos + i + 1];
        }
        --this.size;
        return true;
    }

    @Override
    public int size() {
        return this.size;
    }

    public IntArraySet clone() {
        IntArraySet c;
        try {
            c = (IntArraySet)super.clone();
        }
        catch (CloneNotSupportedException cantHappen) {
            throw new InternalError();
        }
        c.a = (int[])this.a.clone();
        return c;
    }

    @Override
    public void clear() {
        this.size = 0;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public boolean add(int k) {
        int pos = this.findKey(k);
        if (pos != -1) {
            return false;
        }
        if (this.size == this.a.length) {
            int[] b = new int[this.size == 0 ? 2 : this.size * 2];
            int i = this.size;
            while (i-- != 0) {
                b[i] = this.a[i];
            }
            this.a = b;
        }
        this.a[this.size++] = k;
        return true;
    }

    @Override
    public int[] toArray(int[] a) {
        if (a == null || a.length < this.size) {
            a = new int[this.size];
        }
        System.arraycopy(this.a, 0, a, 0, this.size);
        return a;
    }

    @Override
    public IntIterator iterator() {
        return new /* Unavailable Anonymous Inner Class!! */;
    }

    public static IntArraySet of() {
        return IntArraySet.ofUnchecked();
    }

    public static IntArraySet of(int ... a) {
        if (a.length == 2) {
            if (a[0] == a[1]) {
                throw new IllegalArgumentException("Duplicate element: " + a[1]);
            }
        } else if (a.length > 2) {
            IntOpenHashSet.of(a);
        }
        return IntArraySet.ofUnchecked(a);
    }

    public static IntArraySet of(int e) {
        return IntArraySet.ofUnchecked(e);
    }

    @Override
    public boolean contains(int k) {
        return this.findKey(k) != -1;
    }

    @Override
    public IntSpliterator spliterator() {
        return new Spliterator(this);
    }

    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {
        s.defaultReadObject();
        this.a = new int[this.size];
        int[] a = this.a;
        for (int i = 0; i < this.size; ++i) {
            a[i] = s.readInt();
        }
    }

    private void writeObject(ObjectOutputStream s) throws IOException {
        s.defaultWriteObject();
        int[] a = this.a;
        for (int i = 0; i < this.size; ++i) {
            s.writeInt(a[i]);
        }
    }

    @Override
    public int[] toIntArray() {
        if (this.size == 0) {
            return IntArrays.EMPTY_ARRAY;
        }
        return Arrays.copyOf(this.a, this.size);
    }

    private int findKey(int o) {
        int[] a = this.a;
        int i = this.size;
        while (i-- != 0) {
            if (a[i] != o) continue;
            return i;
        }
        return -1;
    }

    public static IntArraySet ofUnchecked() {
        return new IntArraySet();
    }

    public static IntArraySet ofUnchecked(int ... a) {
        return new IntArraySet(a);
    }
}

