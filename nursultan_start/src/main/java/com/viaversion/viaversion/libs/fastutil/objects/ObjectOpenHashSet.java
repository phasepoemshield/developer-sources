/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.fastutil.Hash
 *  com.viaversion.viaversion.libs.fastutil.HashCommon
 *  com.viaversion.viaversion.libs.fastutil.objects.AbstractObjectSet
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectCollections$SizeDecreasingSupplier
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectOpenHashSet$SetIterator
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectOpenHashSet$SetSpliterator
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectSpliterator
 */
package com.viaversion.viaversion.libs.fastutil.objects;

import com.viaversion.viaversion.libs.fastutil.Hash;
import com.viaversion.viaversion.libs.fastutil.HashCommon;
import com.viaversion.viaversion.libs.fastutil.objects.AbstractObjectSet;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectArrays;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectCollection;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectCollections;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectIterator;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectOpenHashSet;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectSpliterator;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.stream.Collector;

public class ObjectOpenHashSet<K>
extends AbstractObjectSet<K>
implements Serializable,
Cloneable,
Hash {
    private static final long serialVersionUID = 0L;
    private static final boolean ASSERTS = false;
    protected transient K[] key;
    protected transient int mask;
    protected transient boolean containsNull;
    protected transient int n;
    protected transient int maxFill;
    protected final transient int minN;
    protected int size;
    protected final float f;
    private static final Collector<Object, ?, ObjectOpenHashSet<Object>> TO_SET_COLLECTOR = Collector.of(ObjectOpenHashSet::new, ObjectOpenHashSet::add, ObjectOpenHashSet::combine, Collector.Characteristics.UNORDERED);

    public ObjectOpenHashSet(int expected, float f) {
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("Load factor must be greater than 0 and smaller than 1");
        }
        if (expected < 0) {
            throw new IllegalArgumentException("The expected number of elements must be nonnegative");
        }
        this.f = f;
        this.minN = this.n = HashCommon.arraySize((int)expected, (float)f);
        this.mask = this.n - 1;
        this.maxFill = HashCommon.maxFill((int)this.n, (float)f);
        this.key = new Object[this.n + 1];
    }

    public ObjectOpenHashSet(int expected) {
        this(expected, 0.75f);
    }

    public ObjectOpenHashSet() {
        this(16, 0.75f);
    }

    public ObjectOpenHashSet(Collection<? extends K> c, float f) {
        this(c.size(), f);
        this.addAll(c);
    }

    public ObjectOpenHashSet(Collection<? extends K> c) {
        this(c, 0.75f);
    }

    public ObjectOpenHashSet(ObjectCollection<? extends K> c, float f) {
        this(c.size(), f);
        this.addAll(c);
    }

    public ObjectOpenHashSet(ObjectCollection<? extends K> c) {
        this(c, 0.75f);
    }

    public ObjectOpenHashSet(Iterator<? extends K> i, float f) {
        this(16, f);
        while (i.hasNext()) {
            this.add(i.next());
        }
    }

    public ObjectOpenHashSet(Iterator<? extends K> i) {
        this(i, 0.75f);
    }

    public ObjectOpenHashSet(K[] a, int offset, int length, float f) {
        this(length < 0 ? 0 : length, f);
        ObjectArrays.ensureOffsetLength(a, offset, length);
        for (int i = 0; i < length; ++i) {
            this.add(a[offset + i]);
        }
    }

    public ObjectOpenHashSet(K[] a, int offset, int length) {
        this(a, offset, length, 0.75f);
    }

    public ObjectOpenHashSet(K[] a, float f) {
        this(a, 0, a.length, f);
    }

    public ObjectOpenHashSet(K[] a) {
        this(a, 0.75f);
    }

    public static <K> ObjectOpenHashSet<K> of() {
        return new ObjectOpenHashSet<K>();
    }

    public static <K> ObjectOpenHashSet<K> of(K e) {
        ObjectOpenHashSet<K> result = new ObjectOpenHashSet<K>(1, 0.75f);
        result.add(e);
        return result;
    }

    public static <K> ObjectOpenHashSet<K> of(K e0, K e1) {
        ObjectOpenHashSet<K> result = new ObjectOpenHashSet<K>(2, 0.75f);
        result.add(e0);
        if (!result.add(e1)) {
            throw new IllegalArgumentException("Duplicate element: " + e1);
        }
        return result;
    }

    public static <K> ObjectOpenHashSet<K> of(K e0, K e1, K e2) {
        ObjectOpenHashSet<K> result = new ObjectOpenHashSet<K>(3, 0.75f);
        result.add(e0);
        if (!result.add(e1)) {
            throw new IllegalArgumentException("Duplicate element: " + e1);
        }
        if (!result.add(e2)) {
            throw new IllegalArgumentException("Duplicate element: " + e2);
        }
        return result;
    }

    @SafeVarargs
    public static <K> ObjectOpenHashSet<K> of(K ... a) {
        ObjectOpenHashSet<K> result = new ObjectOpenHashSet<K>(a.length, 0.75f);
        for (K element : a) {
            if (result.add(element)) continue;
            throw new IllegalArgumentException("Duplicate element " + element);
        }
        return result;
    }

    private ObjectOpenHashSet<K> combine(ObjectOpenHashSet<? extends K> toAddFrom) {
        this.addAll((Collection<? extends K>)((Object)toAddFrom));
        return this;
    }

    public static <K> Collector<K, ?, ObjectOpenHashSet<K>> toSet() {
        return TO_SET_COLLECTOR;
    }

    public static <K> Collector<K, ?, ObjectOpenHashSet<K>> toSetWithExpectedSize(int expectedSize) {
        if (expectedSize <= 16) {
            return ObjectOpenHashSet.toSet();
        }
        return Collector.of(new ObjectCollections.SizeDecreasingSupplier(expectedSize, size -> size <= 16 ? new ObjectOpenHashSet() : new ObjectOpenHashSet(size)), ObjectOpenHashSet::add, ObjectOpenHashSet::combine, new Collector.Characteristics[]{Collector.Characteristics.UNORDERED});
    }

    private int realSize() {
        return this.containsNull ? this.size - 1 : this.size;
    }

    public void ensureCapacity(int capacity) {
        int needed = HashCommon.arraySize((int)capacity, (float)this.f);
        if (needed > this.n) {
            this.rehash(needed);
        }
    }

    private void tryCapacity(long capacity) {
        int needed = (int)Math.min(0x40000000L, Math.max(2L, HashCommon.nextPowerOfTwo((long)((long)Math.ceil((float)capacity / this.f)))));
        if (needed > this.n) {
            this.rehash(needed);
        }
    }

    public boolean addAll(Collection<? extends K> c) {
        if ((double)this.f <= 0.5) {
            this.ensureCapacity(c.size());
        } else {
            this.tryCapacity(this.size() + c.size());
        }
        return super.addAll(c);
    }

    public boolean add(K k) {
        if (k == null) {
            if (this.containsNull) {
                return false;
            }
            this.containsNull = true;
        } else {
            K[] key = this.key;
            int pos = HashCommon.mix((int)k.hashCode()) & this.mask;
            K curr = key[pos];
            if (curr != null) {
                if (curr.equals(k)) {
                    return false;
                }
                while ((curr = key[pos = pos + 1 & this.mask]) != null) {
                    if (!curr.equals(k)) continue;
                    return false;
                }
            }
            key[pos] = k;
        }
        if (this.size++ >= this.maxFill) {
            this.rehash(HashCommon.arraySize((int)(this.size + 1), (float)this.f));
        }
        return true;
    }

    public K addOrGet(K k) {
        if (k == null) {
            if (this.containsNull) {
                return this.key[this.n];
            }
            this.containsNull = true;
        } else {
            K[] key = this.key;
            int pos = HashCommon.mix((int)k.hashCode()) & this.mask;
            K curr = key[pos];
            if (curr != null) {
                if (curr.equals(k)) {
                    return curr;
                }
                while ((curr = key[pos = pos + 1 & this.mask]) != null) {
                    if (!curr.equals(k)) continue;
                    return curr;
                }
            }
            key[pos] = k;
        }
        if (this.size++ >= this.maxFill) {
            this.rehash(HashCommon.arraySize((int)(this.size + 1), (float)this.f));
        }
        return k;
    }

    protected final void shiftKeys(int pos) {
        K[] key = this.key;
        while (true) {
            K curr;
            int last = pos;
            pos = last + 1 & this.mask;
            while (true) {
                if ((curr = key[pos]) == null) {
                    key[last] = null;
                    return;
                }
                int slot = HashCommon.mix((int)curr.hashCode()) & this.mask;
                if (last <= pos ? last >= slot || slot > pos : last >= slot && slot > pos) break;
                pos = pos + 1 & this.mask;
            }
            key[last] = curr;
        }
    }

    private boolean removeEntry(int pos) {
        --this.size;
        this.shiftKeys(pos);
        if (this.n > this.minN && this.size < this.maxFill / 4 && this.n > 16) {
            this.rehash(this.n / 2);
        }
        return true;
    }

    private boolean removeNullEntry() {
        this.containsNull = false;
        this.key[this.n] = null;
        --this.size;
        if (this.n > this.minN && this.size < this.maxFill / 4 && this.n > 16) {
            this.rehash(this.n / 2);
        }
        return true;
    }

    public boolean remove(Object k) {
        if (k == null) {
            if (this.containsNull) {
                return this.removeNullEntry();
            }
            return false;
        }
        K[] key = this.key;
        int pos = HashCommon.mix((int)k.hashCode()) & this.mask;
        K curr = key[pos];
        if (curr == null) {
            return false;
        }
        if (k.equals(curr)) {
            return this.removeEntry(pos);
        }
        do {
            if ((curr = key[pos = pos + 1 & this.mask]) != null) continue;
            return false;
        } while (!k.equals(curr));
        return this.removeEntry(pos);
    }

    public boolean contains(Object k) {
        if (k == null) {
            return this.containsNull;
        }
        K[] key = this.key;
        int pos = HashCommon.mix((int)k.hashCode()) & this.mask;
        K curr = key[pos];
        if (curr == null) {
            return false;
        }
        if (k.equals(curr)) {
            return true;
        }
        do {
            if ((curr = key[pos = pos + 1 & this.mask]) != null) continue;
            return false;
        } while (!k.equals(curr));
        return true;
    }

    public K get(Object k) {
        if (k == null) {
            return this.key[this.n];
        }
        K[] key = this.key;
        int pos = HashCommon.mix((int)k.hashCode()) & this.mask;
        K curr = key[pos];
        if (curr == null) {
            return null;
        }
        if (k.equals(curr)) {
            return curr;
        }
        do {
            if ((curr = key[pos = pos + 1 & this.mask]) != null) continue;
            return null;
        } while (!k.equals(curr));
        return curr;
    }

    public void clear() {
        if (this.size == 0) {
            return;
        }
        this.size = 0;
        this.containsNull = false;
        Arrays.fill(this.key, null);
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public ObjectIterator<K> iterator() {
        return new SetIterator(this, null);
    }

    public ObjectSpliterator<K> spliterator() {
        return new SetSpliterator(this);
    }

    public void forEach(Consumer<? super K> action) {
        K[] key = this.key;
        if (this.containsNull) {
            action.accept(key[this.n]);
        }
        int pos = this.n;
        while (pos-- != 0) {
            if (key[pos] == null) continue;
            action.accept(key[pos]);
        }
    }

    public boolean trim() {
        return this.trim(this.size);
    }

    public boolean trim(int n) {
        int l = HashCommon.nextPowerOfTwo((int)((int)Math.ceil((float)n / this.f)));
        if (l >= this.n || this.size > HashCommon.maxFill((int)l, (float)this.f)) {
            return true;
        }
        try {
            this.rehash(l);
        }
        catch (OutOfMemoryError cantDoIt) {
            return false;
        }
        return true;
    }

    protected void rehash(int newN) {
        K[] key = this.key;
        int mask = newN - 1;
        Object[] newKey = new Object[newN + 1];
        int i = this.n;
        int j = this.realSize();
        while (j-- != 0) {
            while (key[--i] == null) {
            }
            int pos = HashCommon.mix((int)key[i].hashCode()) & mask;
            if (newKey[pos] != null) {
                while (newKey[pos = pos + 1 & mask] != null) {
                }
            }
            newKey[pos] = key[i];
        }
        this.n = newN;
        this.mask = mask;
        this.maxFill = HashCommon.maxFill((int)this.n, (float)this.f);
        this.key = newKey;
    }

    public ObjectOpenHashSet<K> clone() {
        ObjectOpenHashSet c;
        try {
            c = (ObjectOpenHashSet)super.clone();
        }
        catch (CloneNotSupportedException cantHappen) {
            throw new InternalError();
        }
        c.key = (Object[])this.key.clone();
        c.containsNull = this.containsNull;
        return c;
    }

    public int hashCode() {
        int h = 0;
        K[] key = this.key;
        int j = this.realSize();
        int i = 0;
        while (j-- != 0) {
            while (key[i] == null) {
                ++i;
            }
            if (this != key[i]) {
                h += key[i].hashCode();
            }
            ++i;
        }
        return h;
    }

    private void writeObject(ObjectOutputStream s) throws IOException {
        Iterator i = this.iterator();
        s.defaultWriteObject();
        int j = this.size;
        while (j-- != 0) {
            s.writeObject(i.next());
        }
    }

    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {
        s.defaultReadObject();
        this.n = HashCommon.arraySize((int)this.size, (float)this.f);
        this.maxFill = HashCommon.maxFill((int)this.n, (float)this.f);
        this.mask = this.n - 1;
        this.key = new Object[this.n + 1];
        Object[] key = this.key;
        int i = this.size;
        while (i-- != 0) {
            int pos;
            Object k = s.readObject();
            if (k == null) {
                pos = this.n;
                this.containsNull = true;
            } else {
                pos = HashCommon.mix((int)k.hashCode()) & this.mask;
                if (key[pos] != null) {
                    while (key[pos = pos + 1 & this.mask] != null) {
                    }
                }
            }
            key[pos] = k;
        }
    }

    private void checkTable() {
    }

    static /* synthetic */ int access$100(ObjectOpenHashSet x0) {
        return x0.realSize();
    }
}

