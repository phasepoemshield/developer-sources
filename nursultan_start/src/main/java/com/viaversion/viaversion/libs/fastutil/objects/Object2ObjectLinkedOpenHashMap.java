/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.fastutil.Hash
 *  com.viaversion.viaversion.libs.fastutil.HashCommon
 *  com.viaversion.viaversion.libs.fastutil.Size64
 *  com.viaversion.viaversion.libs.fastutil.objects.AbstractObject2ObjectSortedMap
 *  com.viaversion.viaversion.libs.fastutil.objects.AbstractObjectSortedSet
 *  com.viaversion.viaversion.libs.fastutil.objects.Object2ObjectFunction
 *  com.viaversion.viaversion.libs.fastutil.objects.Object2ObjectLinkedOpenHashMap$EntryIterator
 *  com.viaversion.viaversion.libs.fastutil.objects.Object2ObjectLinkedOpenHashMap$FastEntryIterator
 *  com.viaversion.viaversion.libs.fastutil.objects.Object2ObjectLinkedOpenHashMap$KeySet
 *  com.viaversion.viaversion.libs.fastutil.objects.Object2ObjectLinkedOpenHashMap$MapEntry
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectSpliterator
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectSpliterators
 */
package com.viaversion.viaversion.libs.fastutil.objects;

import com.viaversion.viaversion.libs.fastutil.Hash;
import com.viaversion.viaversion.libs.fastutil.HashCommon;
import com.viaversion.viaversion.libs.fastutil.Size64;
import com.viaversion.viaversion.libs.fastutil.objects.AbstractObject2ObjectSortedMap;
import com.viaversion.viaversion.libs.fastutil.objects.AbstractObjectSortedSet;
import com.viaversion.viaversion.libs.fastutil.objects.Object2ObjectFunction;
import com.viaversion.viaversion.libs.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import com.viaversion.viaversion.libs.fastutil.objects.Object2ObjectMap;
import com.viaversion.viaversion.libs.fastutil.objects.Object2ObjectSortedMap;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectBidirectionalIterator;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectCollection;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectIterator;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectListIterator;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectSortedSet;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectSpliterator;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectSpliterators;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Object2ObjectLinkedOpenHashMap<K, V>
extends AbstractObject2ObjectSortedMap<K, V>
implements Serializable,
Cloneable,
Hash {
    private static final long serialVersionUID = 0L;
    private static final boolean ASSERTS = false;
    protected transient K[] key;
    protected transient V[] value;
    protected transient int mask;
    protected transient boolean containsNullKey;
    protected transient int first = -1;
    protected transient int last = -1;
    protected transient long[] link;
    protected transient int n;
    protected transient int maxFill;
    protected final transient int minN;
    protected int size;
    protected final float f;
    protected transient Object2ObjectSortedMap.FastSortedEntrySet<K, V> entries;
    protected transient ObjectSortedSet<K> keys;
    protected transient ObjectCollection<V> values;

    private V removeEntry(int pos) {
        V oldValue = this.value[pos];
        this.value[pos] = null;
        --this.size;
        this.fixPointers(pos);
        this.shiftKeys(pos);
        if (this.n > this.minN && this.size < this.maxFill / 4 && this.n > 16) {
            this.rehash(this.n / 2);
        }
        return oldValue;
    }

    public Object2ObjectLinkedOpenHashMap(Object2ObjectMap<K, V> m) {
        this(m, 0.75f);
    }

    public Object2ObjectLinkedOpenHashMap(K[] k, V[] v, float f) {
        this(k.length, f);
        if (k.length != v.length) {
            throw new IllegalArgumentException("The key array and the value array have different lengths (" + k.length + " and " + v.length + ")");
        }
        for (int i = 0; i < k.length; ++i) {
            this.put(k[i], v[i]);
        }
    }

    public Object2ObjectLinkedOpenHashMap(K[] k, V[] v) {
        this(k, v, 0.75f);
    }

    public Object2ObjectLinkedOpenHashMap(int expected, float f) {
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
        this.value = new Object[this.n + 1];
        this.link = new long[this.n + 1];
    }

    public Object2ObjectLinkedOpenHashMap(Map<? extends K, ? extends V> m, float f) {
        this(m.size(), f);
        this.putAll(m);
    }

    public Object2ObjectLinkedOpenHashMap() {
        this(16, 0.75f);
    }

    public Object2ObjectLinkedOpenHashMap(int expected) {
        this(expected, 0.75f);
    }

    public Object2ObjectLinkedOpenHashMap(Object2ObjectMap<K, V> m, float f) {
        this(m.size(), f);
        this.putAll(m);
    }

    public Object2ObjectLinkedOpenHashMap(Map<? extends K, ? extends V> m) {
        this(m, 0.75f);
    }

    public V remove(Object k) {
        if (k == null) {
            if (this.containsNullKey) {
                return this.removeNullEntry();
            }
            return (V)this.defRetValue;
        }
        K[] key = this.key;
        int pos = HashCommon.mix((int)k.hashCode()) & this.mask;
        K curr = key[pos];
        if (curr == null) {
            return (V)this.defRetValue;
        }
        if (k.equals(curr)) {
            return this.removeEntry(pos);
        }
        do {
            if ((curr = key[pos = pos + 1 & this.mask]) != null) continue;
            return (V)this.defRetValue;
        } while (!k.equals(curr));
        return this.removeEntry(pos);
    }

    public boolean remove(Object k, Object v) {
        if (k == null) {
            if (this.containsNullKey && Objects.equals(v, this.value[this.n])) {
                this.removeNullEntry();
                return true;
            }
            return false;
        }
        K[] key = this.key;
        int pos = HashCommon.mix((int)k.hashCode()) & this.mask;
        K curr = key[pos];
        if (curr == null) {
            return false;
        }
        if (k.equals(curr) && Objects.equals(v, this.value[pos])) {
            this.removeEntry(pos);
            return true;
        }
        do {
            if ((curr = key[pos = pos + 1 & this.mask]) != null) continue;
            return false;
        } while (!k.equals(curr) || !Objects.equals(v, this.value[pos]));
        this.removeEntry(pos);
        return true;
    }

    public int size() {
        return this.size;
    }

    public V get(Object k) {
        if (k == null) {
            return (V)(this.containsNullKey ? this.value[this.n] : this.defRetValue);
        }
        K[] key = this.key;
        int pos = HashCommon.mix((int)k.hashCode()) & this.mask;
        K curr = key[pos];
        if (curr == null) {
            return (V)this.defRetValue;
        }
        if (k.equals(curr)) {
            return this.value[pos];
        }
        do {
            if ((curr = key[pos = pos + 1 & this.mask]) != null) continue;
            return (V)this.defRetValue;
        } while (!k.equals(curr));
        return this.value[pos];
    }

    public V put(K k, V v) {
        int pos = this.find(k);
        if (pos < 0) {
            this.insert(-pos - 1, k, v);
            return (V)this.defRetValue;
        }
        V oldValue = this.value[pos];
        this.value[pos] = v;
        return oldValue;
    }

    public ObjectCollection<V> values() {
        if (this.values == null) {
            this.values = new /* Unavailable Anonymous Inner Class!! */;
        }
        return this.values;
    }

    public int hashCode() {
        int h = 0;
        K[] key = this.key;
        V[] value = this.value;
        int j = this.realSize();
        int i = 0;
        int t = 0;
        while (j-- != 0) {
            while (key[i] == null) {
                ++i;
            }
            if (this != key[i]) {
                t = key[i].hashCode();
            }
            if (this != value[i]) {
                t ^= value[i] == null ? 0 : value[i].hashCode();
            }
            h += t;
            ++i;
        }
        if (this.containsNullKey) {
            h += value[this.n] == null ? 0 : value[this.n].hashCode();
        }
        return h;
    }

    public Object2ObjectLinkedOpenHashMap<K, V> clone() {
        Object2ObjectLinkedOpenHashMap c;
        try {
            c = (Object2ObjectLinkedOpenHashMap)super.clone();
        }
        catch (CloneNotSupportedException cantHappen) {
            throw new InternalError();
        }
        c.keys = null;
        c.values = null;
        c.entries = null;
        c.containsNullKey = this.containsNullKey;
        c.key = (Object[])this.key.clone();
        c.value = (Object[])this.value.clone();
        c.link = (long[])this.link.clone();
        return c;
    }

    private void insert(int pos, K k, V v) {
        if (pos == this.n) {
            this.containsNullKey = true;
        }
        this.key[pos] = k;
        this.value[pos] = v;
        if (this.size == 0) {
            this.first = this.last = pos;
            this.link[pos] = -1L;
        } else {
            int n = this.last;
            this.link[n] = this.link[n] ^ (this.link[this.last] ^ (long)pos & 0xFFFFFFFFL) & 0xFFFFFFFFL;
            this.link[pos] = ((long)this.last & 0xFFFFFFFFL) << 32 | 0xFFFFFFFFL;
            this.last = pos;
        }
        if (this.size++ >= this.maxFill) {
            this.rehash(HashCommon.arraySize((int)(this.size + 1), (float)this.f));
        }
    }

    public void clear() {
        if (this.size == 0) {
            return;
        }
        this.size = 0;
        this.containsNullKey = false;
        Arrays.fill(this.key, null);
        Arrays.fill(this.value, null);
        this.last = -1;
        this.first = -1;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public V replace(K k, V v) {
        int pos = this.find(k);
        if (pos < 0) {
            return (V)this.defRetValue;
        }
        V oldValue = this.value[pos];
        this.value[pos] = v;
        return oldValue;
    }

    public boolean replace(K k, V oldValue, V v) {
        int pos = this.find(k);
        if (pos < 0 || !Objects.equals(oldValue, this.value[pos])) {
            return false;
        }
        this.value[pos] = v;
        return true;
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

    public boolean trim() {
        return this.trim(this.size);
    }

    public V merge(K k, V v, BiFunction<? super V, ? super V, ? extends V> remappingFunction) {
        Objects.requireNonNull(remappingFunction);
        Objects.requireNonNull(v);
        int pos = this.find(k);
        if (pos < 0 || this.value[pos] == null) {
            if (pos < 0) {
                this.insert(-pos - 1, k, v);
            } else {
                this.value[pos] = v;
            }
            return v;
        }
        V newValue = remappingFunction.apply(this.value[pos], v);
        if (newValue == null) {
            if (k == null) {
                this.removeNullEntry();
            } else {
                this.removeEntry(pos);
            }
            return (V)this.defRetValue;
        }
        this.value[pos] = newValue;
        return this.value[pos];
    }

    public void putAll(Map<? extends K, ? extends V> m) {
        if ((double)this.f <= 0.5) {
            this.ensureCapacity(m.size());
        } else {
            this.tryCapacity(this.size() + m.size());
        }
        super.putAll(m);
    }

    public V putIfAbsent(K k, V v) {
        int pos = this.find(k);
        if (pos >= 0) {
            return this.value[pos];
        }
        this.insert(-pos - 1, k, v);
        return (V)this.defRetValue;
    }

    public V compute(K k, BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
        Objects.requireNonNull(remappingFunction);
        int pos = this.find(k);
        V newValue = remappingFunction.apply(k, pos >= 0 ? (Object)this.value[pos] : null);
        if (newValue == null) {
            if (pos >= 0) {
                if (k == null) {
                    this.removeNullEntry();
                } else {
                    this.removeEntry(pos);
                }
            }
            return (V)this.defRetValue;
        }
        V newVal = newValue;
        if (pos < 0) {
            this.insert(-pos - 1, k, newVal);
            return newVal;
        }
        this.value[pos] = newVal;
        return this.value[pos];
    }

    private int find(K k) {
        if (k == null) {
            return this.containsNullKey ? this.n : -(this.n + 1);
        }
        K[] key = this.key;
        int pos = HashCommon.mix((int)k.hashCode()) & this.mask;
        K curr = key[pos];
        if (curr == null) {
            return -(pos + 1);
        }
        if (k.equals(curr)) {
            return pos;
        }
        do {
            if ((curr = key[pos = pos + 1 & this.mask]) != null) continue;
            return -(pos + 1);
        } while (!k.equals(curr));
        return pos;
    }

    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {
        s.defaultReadObject();
        this.n = HashCommon.arraySize((int)this.size, (float)this.f);
        this.maxFill = HashCommon.maxFill((int)this.n, (float)this.f);
        this.mask = this.n - 1;
        this.key = new Object[this.n + 1];
        Object[] key = this.key;
        this.value = new Object[this.n + 1];
        Object[] value = this.value;
        this.link = new long[this.n + 1];
        long[] link = this.link;
        int prev = -1;
        this.last = -1;
        this.first = -1;
        int i = this.size;
        while (i-- != 0) {
            int pos;
            Object k = s.readObject();
            Object v = s.readObject();
            if (k == null) {
                pos = this.n;
                this.containsNullKey = true;
            } else {
                pos = HashCommon.mix((int)k.hashCode()) & this.mask;
                while (key[pos] != null) {
                    pos = pos + 1 & this.mask;
                }
            }
            key[pos] = k;
            value[pos] = v;
            if (this.first != -1) {
                int n = prev;
                link[n] = link[n] ^ (link[prev] ^ (long)pos & 0xFFFFFFFFL) & 0xFFFFFFFFL;
                int n2 = pos;
                link[n2] = link[n2] ^ (link[pos] ^ ((long)prev & 0xFFFFFFFFL) << 32) & 0xFFFFFFFF00000000L;
                prev = pos;
                continue;
            }
            prev = this.first = pos;
            int n = pos;
            link[n] = link[n] | 0xFFFFFFFF00000000L;
        }
        this.last = prev;
        if (prev != -1) {
            int n = prev;
            link[n] = link[n] | 0xFFFFFFFFL;
        }
    }

    private void writeObject(ObjectOutputStream s) throws IOException {
        K[] key = this.key;
        V[] value = this.value;
        EntryIterator i = new EntryIterator(this);
        s.defaultWriteObject();
        int j = this.size;
        while (j-- != 0) {
            int e = i.nextEntry();
            s.writeObject(key[e]);
            s.writeObject(value[e]);
        }
    }

    public boolean containsKey(Object k) {
        if (k == null) {
            return this.containsNullKey;
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

    public V computeIfAbsent(K key, Object2ObjectFunction<? super K, ? extends V> mappingFunction) {
        Objects.requireNonNull(mappingFunction);
        int pos = this.find(key);
        if (pos >= 0) {
            return this.value[pos];
        }
        if (!mappingFunction.containsKey(key)) {
            return (V)this.defRetValue;
        }
        Object newValue = mappingFunction.get(key);
        this.insert(-pos - 1, key, newValue);
        return (V)newValue;
    }

    public ObjectSortedSet<K> keySet() {
        if (this.keys == null) {
            this.keys = new KeySet(this, null);
        }
        return this.keys;
    }

    public boolean containsValue(Object v) {
        K[] key = this.key;
        V[] value = this.value;
        if (this.containsNullKey && Objects.equals(value[this.n], v)) {
            return true;
        }
        int i = this.n;
        while (i-- != 0) {
            if (key[i] == null || !Objects.equals(value[i], v)) continue;
            return true;
        }
        return false;
    }

    public V getOrDefault(Object k, V defaultValue) {
        if (k == null) {
            return this.containsNullKey ? this.value[this.n] : defaultValue;
        }
        K[] key = this.key;
        int pos = HashCommon.mix((int)k.hashCode()) & this.mask;
        K curr = key[pos];
        if (curr == null) {
            return defaultValue;
        }
        if (k.equals(curr)) {
            return this.value[pos];
        }
        do {
            if ((curr = key[pos = pos + 1 & this.mask]) != null) continue;
            return defaultValue;
        } while (!k.equals(curr));
        return this.value[pos];
    }

    public V computeIfPresent(K k, BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
        Objects.requireNonNull(remappingFunction);
        int pos = this.find(k);
        if (pos < 0) {
            return (V)this.defRetValue;
        }
        if (this.value[pos] == null) {
            return (V)this.defRetValue;
        }
        V newValue = remappingFunction.apply(k, this.value[pos]);
        if (newValue == null) {
            if (k == null) {
                this.removeNullEntry();
            } else {
                this.removeEntry(pos);
            }
            return (V)this.defRetValue;
        }
        this.value[pos] = newValue;
        return this.value[pos];
    }

    protected void rehash(int newN) {
        K[] key = this.key;
        V[] value = this.value;
        int mask = newN - 1;
        Object[] newKey = new Object[newN + 1];
        Object[] newValue = new Object[newN + 1];
        int i = this.first;
        int prev = -1;
        int newPrev = -1;
        long[] link = this.link;
        long[] newLink = new long[newN + 1];
        this.first = -1;
        int j = this.size;
        while (j-- != 0) {
            int pos;
            if (key[i] == null) {
                pos = newN;
            } else {
                pos = HashCommon.mix((int)key[i].hashCode()) & mask;
                while (newKey[pos] != null) {
                    pos = pos + 1 & mask;
                }
            }
            newKey[pos] = key[i];
            newValue[pos] = value[i];
            if (prev != -1) {
                int n = newPrev;
                newLink[n] = newLink[n] ^ (newLink[newPrev] ^ (long)pos & 0xFFFFFFFFL) & 0xFFFFFFFFL;
                int n2 = pos;
                newLink[n2] = newLink[n2] ^ (newLink[pos] ^ ((long)newPrev & 0xFFFFFFFFL) << 32) & 0xFFFFFFFF00000000L;
                newPrev = pos;
            } else {
                newPrev = this.first = pos;
                newLink[pos] = -1L;
            }
            int t = i;
            i = (int)link[i];
            prev = t;
        }
        this.link = newLink;
        this.last = newPrev;
        if (newPrev != -1) {
            int n = newPrev;
            newLink[n] = newLink[n] | 0xFFFFFFFFL;
        }
        this.n = newN;
        this.mask = mask;
        this.maxFill = HashCommon.maxFill((int)this.n, (float)this.f);
        this.key = newKey;
        this.value = newValue;
    }

    private V setValue(int pos, V v) {
        V oldValue = this.value[pos];
        this.value[pos] = v;
        return oldValue;
    }

    public void ensureCapacity(int capacity) {
        int needed = HashCommon.arraySize((int)capacity, (float)this.f);
        if (needed > this.n) {
            this.rehash(needed);
        }
    }

    public V removeFirst() {
        if (this.size == 0) {
            throw new NoSuchElementException();
        }
        int pos = this.first;
        if (this.size == 1) {
            this.last = -1;
            this.first = -1;
        } else {
            this.first = (int)this.link[pos];
            if (0 <= this.first) {
                int n = this.first;
                this.link[n] = this.link[n] | 0xFFFFFFFF00000000L;
            }
        }
        --this.size;
        V v = this.value[pos];
        if (pos == this.n) {
            this.containsNullKey = false;
            this.key[this.n] = null;
            this.value[this.n] = null;
        } else {
            this.shiftKeys(pos);
        }
        if (this.n > this.minN && this.size < this.maxFill / 4 && this.n > 16) {
            this.rehash(this.n / 2);
        }
        return v;
    }

    public V removeLast() {
        if (this.size == 0) {
            throw new NoSuchElementException();
        }
        int pos = this.last;
        if (this.size == 1) {
            this.last = -1;
            this.first = -1;
        } else {
            this.last = (int)(this.link[pos] >>> 32);
            if (0 <= this.last) {
                int n = this.last;
                this.link[n] = this.link[n] | 0xFFFFFFFFL;
            }
        }
        --this.size;
        V v = this.value[pos];
        if (pos == this.n) {
            this.containsNullKey = false;
            this.key[this.n] = null;
            this.value[this.n] = null;
        } else {
            this.shiftKeys(pos);
        }
        if (this.n > this.minN && this.size < this.maxFill / 4 && this.n > 16) {
            this.rehash(this.n / 2);
        }
        return v;
    }

    public Comparator<? super K> comparator() {
        return null;
    }

    public Object2ObjectSortedMap<K, V> subMap(K from, K to) {
        throw new UnsupportedOperationException();
    }

    public Object2ObjectSortedMap<K, V> headMap(K to) {
        throw new UnsupportedOperationException();
    }

    public Object2ObjectSortedMap<K, V> tailMap(K from) {
        throw new UnsupportedOperationException();
    }

    public K lastKey() {
        if (this.size == 0) {
            throw new NoSuchElementException();
        }
        return this.key[this.last];
    }

    public K firstKey() {
        if (this.size == 0) {
            throw new NoSuchElementException();
        }
        return this.key[this.first];
    }

    private int realSize() {
        return this.containsNullKey ? this.size - 1 : this.size;
    }

    protected final void shiftKeys(int pos) {
        K[] key = this.key;
        V[] value = this.value;
        while (true) {
            K curr;
            int last = pos;
            pos = last + 1 & this.mask;
            while (true) {
                if ((curr = key[pos]) == null) {
                    key[last] = null;
                    value[last] = null;
                    return;
                }
                int slot = HashCommon.mix((int)curr.hashCode()) & this.mask;
                if (last <= pos ? last >= slot || slot > pos : last >= slot && slot > pos) break;
                pos = pos + 1 & this.mask;
            }
            key[last] = curr;
            value[last] = value[pos];
            this.fixPointers(pos, last);
        }
    }

    private void checkTable() {
    }

    public Object2ObjectSortedMap.FastSortedEntrySet<K, V> object2ObjectEntrySet() {
        if (this.entries == null) {
            this.entries = new MapEntrySet();
        }
        return this.entries;
    }

    private V removeNullEntry() {
        this.containsNullKey = false;
        this.key[this.n] = null;
        V oldValue = this.value[this.n];
        this.value[this.n] = null;
        --this.size;
        this.fixPointers(this.n);
        if (this.n > this.minN && this.size < this.maxFill / 4 && this.n > 16) {
            this.rehash(this.n / 2);
        }
        return oldValue;
    }

    private void tryCapacity(long capacity) {
        int needed = (int)Math.min(0x40000000L, Math.max(2L, HashCommon.nextPowerOfTwo((long)((long)Math.ceil((float)capacity / this.f)))));
        if (needed > this.n) {
            this.rehash(needed);
        }
    }

    public V putAndMoveToFirst(K k, V v) {
        int pos;
        if (k == null) {
            if (this.containsNullKey) {
                this.moveIndexToFirst(this.n);
                return this.setValue(this.n, v);
            }
            this.containsNullKey = true;
            pos = this.n;
        } else {
            K[] key = this.key;
            pos = HashCommon.mix((int)k.hashCode()) & this.mask;
            K curr = key[pos];
            if (curr != null) {
                if (curr.equals(k)) {
                    this.moveIndexToFirst(pos);
                    return this.setValue(pos, v);
                }
                while ((curr = key[pos = pos + 1 & this.mask]) != null) {
                    if (!curr.equals(k)) continue;
                    this.moveIndexToFirst(pos);
                    return this.setValue(pos, v);
                }
            }
        }
        this.key[pos] = k;
        this.value[pos] = v;
        if (this.size == 0) {
            this.first = this.last = pos;
            this.link[pos] = -1L;
        } else {
            int n = this.first;
            this.link[n] = this.link[n] ^ (this.link[this.first] ^ ((long)pos & 0xFFFFFFFFL) << 32) & 0xFFFFFFFF00000000L;
            this.link[pos] = 0xFFFFFFFF00000000L | (long)this.first & 0xFFFFFFFFL;
            this.first = pos;
        }
        if (this.size++ >= this.maxFill) {
            this.rehash(HashCommon.arraySize((int)this.size, (float)this.f));
        }
        return (V)this.defRetValue;
    }

    public V getAndMoveToFirst(K k) {
        if (k == null) {
            if (this.containsNullKey) {
                this.moveIndexToFirst(this.n);
                return this.value[this.n];
            }
            return (V)this.defRetValue;
        }
        K[] key = this.key;
        int pos = HashCommon.mix((int)k.hashCode()) & this.mask;
        K curr = key[pos];
        if (curr == null) {
            return (V)this.defRetValue;
        }
        if (k.equals(curr)) {
            this.moveIndexToFirst(pos);
            return this.value[pos];
        }
        do {
            if ((curr = key[pos = pos + 1 & this.mask]) != null) continue;
            return (V)this.defRetValue;
        } while (!k.equals(curr));
        this.moveIndexToFirst(pos);
        return this.value[pos];
    }

    private void moveIndexToFirst(int i) {
        if (this.size == 1 || this.first == i) {
            return;
        }
        if (this.last == i) {
            int n = this.last = (int)(this.link[i] >>> 32);
            this.link[n] = this.link[n] | 0xFFFFFFFFL;
        } else {
            long linki = this.link[i];
            int prev = (int)(linki >>> 32);
            int next = (int)linki;
            int n = prev;
            this.link[n] = this.link[n] ^ (this.link[prev] ^ linki & 0xFFFFFFFFL) & 0xFFFFFFFFL;
            int n2 = next;
            this.link[n2] = this.link[n2] ^ (this.link[next] ^ linki & 0xFFFFFFFF00000000L) & 0xFFFFFFFF00000000L;
        }
        int n = this.first;
        this.link[n] = this.link[n] ^ (this.link[this.first] ^ ((long)i & 0xFFFFFFFFL) << 32) & 0xFFFFFFFF00000000L;
        this.link[i] = 0xFFFFFFFF00000000L | (long)this.first & 0xFFFFFFFFL;
        this.first = i;
    }

    public V putAndMoveToLast(K k, V v) {
        int pos;
        if (k == null) {
            if (this.containsNullKey) {
                this.moveIndexToLast(this.n);
                return this.setValue(this.n, v);
            }
            this.containsNullKey = true;
            pos = this.n;
        } else {
            K[] key = this.key;
            pos = HashCommon.mix((int)k.hashCode()) & this.mask;
            K curr = key[pos];
            if (curr != null) {
                if (curr.equals(k)) {
                    this.moveIndexToLast(pos);
                    return this.setValue(pos, v);
                }
                while ((curr = key[pos = pos + 1 & this.mask]) != null) {
                    if (!curr.equals(k)) continue;
                    this.moveIndexToLast(pos);
                    return this.setValue(pos, v);
                }
            }
        }
        this.key[pos] = k;
        this.value[pos] = v;
        if (this.size == 0) {
            this.first = this.last = pos;
            this.link[pos] = -1L;
        } else {
            int n = this.last;
            this.link[n] = this.link[n] ^ (this.link[this.last] ^ (long)pos & 0xFFFFFFFFL) & 0xFFFFFFFFL;
            this.link[pos] = ((long)this.last & 0xFFFFFFFFL) << 32 | 0xFFFFFFFFL;
            this.last = pos;
        }
        if (this.size++ >= this.maxFill) {
            this.rehash(HashCommon.arraySize((int)this.size, (float)this.f));
        }
        return (V)this.defRetValue;
    }

    protected void fixPointers(int s, int d) {
        if (this.size == 1) {
            this.first = this.last = d;
            this.link[d] = -1L;
            return;
        }
        if (this.first == s) {
            this.first = d;
            int n = (int)this.link[s];
            this.link[n] = this.link[n] ^ (this.link[(int)this.link[s]] ^ ((long)d & 0xFFFFFFFFL) << 32) & 0xFFFFFFFF00000000L;
            this.link[d] = this.link[s];
            return;
        }
        if (this.last == s) {
            this.last = d;
            int n = (int)(this.link[s] >>> 32);
            this.link[n] = this.link[n] ^ (this.link[(int)(this.link[s] >>> 32)] ^ (long)d & 0xFFFFFFFFL) & 0xFFFFFFFFL;
            this.link[d] = this.link[s];
            return;
        }
        long links = this.link[s];
        int prev = (int)(links >>> 32);
        int next = (int)links;
        int n = prev;
        this.link[n] = this.link[n] ^ (this.link[prev] ^ (long)d & 0xFFFFFFFFL) & 0xFFFFFFFFL;
        int n2 = next;
        this.link[n2] = this.link[n2] ^ (this.link[next] ^ ((long)d & 0xFFFFFFFFL) << 32) & 0xFFFFFFFF00000000L;
        this.link[d] = links;
    }

    protected void fixPointers(int i) {
        if (this.size == 0) {
            this.last = -1;
            this.first = -1;
            return;
        }
        if (this.first == i) {
            this.first = (int)this.link[i];
            if (0 <= this.first) {
                int n = this.first;
                this.link[n] = this.link[n] | 0xFFFFFFFF00000000L;
            }
            return;
        }
        if (this.last == i) {
            this.last = (int)(this.link[i] >>> 32);
            if (0 <= this.last) {
                int n = this.last;
                this.link[n] = this.link[n] | 0xFFFFFFFFL;
            }
            return;
        }
        long linki = this.link[i];
        int prev = (int)(linki >>> 32);
        int next = (int)linki;
        int n = prev;
        this.link[n] = this.link[n] ^ (this.link[prev] ^ linki & 0xFFFFFFFFL) & 0xFFFFFFFFL;
        int n2 = next;
        this.link[n2] = this.link[n2] ^ (this.link[next] ^ linki & 0xFFFFFFFF00000000L) & 0xFFFFFFFF00000000L;
    }

    public V getAndMoveToLast(K k) {
        if (k == null) {
            if (this.containsNullKey) {
                this.moveIndexToLast(this.n);
                return this.value[this.n];
            }
            return (V)this.defRetValue;
        }
        K[] key = this.key;
        int pos = HashCommon.mix((int)k.hashCode()) & this.mask;
        K curr = key[pos];
        if (curr == null) {
            return (V)this.defRetValue;
        }
        if (k.equals(curr)) {
            this.moveIndexToLast(pos);
            return this.value[pos];
        }
        do {
            if ((curr = key[pos = pos + 1 & this.mask]) != null) continue;
            return (V)this.defRetValue;
        } while (!k.equals(curr));
        this.moveIndexToLast(pos);
        return this.value[pos];
    }

    private void moveIndexToLast(int i) {
        if (this.size == 1 || this.last == i) {
            return;
        }
        if (this.first == i) {
            int n = this.first = (int)this.link[i];
            this.link[n] = this.link[n] | 0xFFFFFFFF00000000L;
        } else {
            long linki = this.link[i];
            int prev = (int)(linki >>> 32);
            int next = (int)linki;
            int n = prev;
            this.link[n] = this.link[n] ^ (this.link[prev] ^ linki & 0xFFFFFFFFL) & 0xFFFFFFFFL;
            int n2 = next;
            this.link[n2] = this.link[n2] ^ (this.link[next] ^ linki & 0xFFFFFFFF00000000L) & 0xFFFFFFFF00000000L;
        }
        int n = this.last;
        this.link[n] = this.link[n] ^ (this.link[this.last] ^ (long)i & 0xFFFFFFFFL) & 0xFFFFFFFFL;
        this.link[i] = ((long)this.last & 0xFFFFFFFFL) << 32 | 0xFFFFFFFFL;
        this.last = i;
    }

    private final class MapEntrySet
    extends AbstractObjectSortedSet<Object2ObjectMap.Entry<K, V>>
    implements Object2ObjectSortedMap.FastSortedEntrySet<K, V> {
        private static final int SPLITERATOR_CHARACTERISTICS = 81;

        private MapEntrySet() {
        }

        @Override
        public boolean remove(Object o) {
            if (!(o instanceof Map.Entry)) {
                return false;
            }
            Map.Entry e = (Map.Entry)o;
            Object k = e.getKey();
            Object v = e.getValue();
            if (k == null) {
                if (Object2ObjectLinkedOpenHashMap.this.containsNullKey && Objects.equals(Object2ObjectLinkedOpenHashMap.this.value[Object2ObjectLinkedOpenHashMap.this.n], v)) {
                    Object2ObjectLinkedOpenHashMap.this.removeNullEntry();
                    return true;
                }
                return false;
            }
            K[] key = Object2ObjectLinkedOpenHashMap.this.key;
            int pos = HashCommon.mix((int)k.hashCode()) & Object2ObjectLinkedOpenHashMap.this.mask;
            Object curr = key[pos];
            if (curr == null) {
                return false;
            }
            if (curr.equals(k)) {
                if (Objects.equals(Object2ObjectLinkedOpenHashMap.this.value[pos], v)) {
                    Object2ObjectLinkedOpenHashMap.this.removeEntry(pos);
                    return true;
                }
                return false;
            }
            do {
                if ((curr = key[pos = pos + 1 & Object2ObjectLinkedOpenHashMap.this.mask]) != null) continue;
                return false;
            } while (!curr.equals(k) || !Objects.equals(Object2ObjectLinkedOpenHashMap.this.value[pos], v));
            Object2ObjectLinkedOpenHashMap.this.removeEntry(pos);
            return true;
        }

        @Override
        public int size() {
            return Object2ObjectLinkedOpenHashMap.this.size;
        }

        @Override
        public void clear() {
            Object2ObjectLinkedOpenHashMap.this.clear();
        }

        @Override
        public ObjectListIterator<Object2ObjectMap.Entry<K, V>> iterator(Object2ObjectMap.Entry<K, V> from) {
            return new EntryIterator(Object2ObjectLinkedOpenHashMap.this, from.getKey());
        }

        @Override
        public ObjectBidirectionalIterator<Object2ObjectMap.Entry<K, V>> iterator() {
            return new EntryIterator(Object2ObjectLinkedOpenHashMap.this);
        }

        @Override
        public boolean contains(Object o) {
            if (!(o instanceof Map.Entry)) {
                return false;
            }
            Map.Entry e = (Map.Entry)o;
            Object k = e.getKey();
            Object v = e.getValue();
            if (k == null) {
                return Object2ObjectLinkedOpenHashMap.this.containsNullKey && Objects.equals(Object2ObjectLinkedOpenHashMap.this.value[Object2ObjectLinkedOpenHashMap.this.n], v);
            }
            K[] key = Object2ObjectLinkedOpenHashMap.this.key;
            int pos = HashCommon.mix((int)k.hashCode()) & Object2ObjectLinkedOpenHashMap.this.mask;
            Object curr = key[pos];
            if (curr == null) {
                return false;
            }
            if (k.equals(curr)) {
                return Objects.equals(Object2ObjectLinkedOpenHashMap.this.value[pos], v);
            }
            do {
                if ((curr = key[pos = pos + 1 & Object2ObjectLinkedOpenHashMap.this.mask]) != null) continue;
                return false;
            } while (!k.equals(curr));
            return Objects.equals(Object2ObjectLinkedOpenHashMap.this.value[pos], v);
        }

        @Override
        public Object2ObjectMap.Entry<K, V> last() {
            if (Object2ObjectLinkedOpenHashMap.this.size == 0) {
                throw new NoSuchElementException();
            }
            return new MapEntry(Object2ObjectLinkedOpenHashMap.this, Object2ObjectLinkedOpenHashMap.this.last);
        }

        @Override
        public ObjectSpliterator<Object2ObjectMap.Entry<K, V>> spliterator() {
            return ObjectSpliterators.asSpliterator((ObjectIterator)this.iterator(), (long)Size64.sizeOf((Map)((Object)Object2ObjectLinkedOpenHashMap.this)), (int)81);
        }

        @Override
        public Object2ObjectMap.Entry<K, V> first() {
            if (Object2ObjectLinkedOpenHashMap.this.size == 0) {
                throw new NoSuchElementException();
            }
            return new MapEntry(Object2ObjectLinkedOpenHashMap.this, Object2ObjectLinkedOpenHashMap.this.first);
        }

        @Override
        public void forEach(Consumer<? super Object2ObjectMap.Entry<K, V>> consumer) {
            long[] link = Object2ObjectLinkedOpenHashMap.this.link;
            int i = Object2ObjectLinkedOpenHashMap.this.size;
            int next = Object2ObjectLinkedOpenHashMap.this.first;
            while (i-- != 0) {
                int curr = next;
                next = (int)link[curr];
                consumer.accept((Object2ObjectMap.Entry)new MapEntry(Object2ObjectLinkedOpenHashMap.this, curr));
            }
        }

        @Override
        public Comparator<? super Object2ObjectMap.Entry<K, V>> comparator() {
            return null;
        }

        @Override
        public ObjectSortedSet<Object2ObjectMap.Entry<K, V>> subSet(Object2ObjectMap.Entry<K, V> fromElement, Object2ObjectMap.Entry<K, V> toElement) {
            throw new UnsupportedOperationException();
        }

        @Override
        public ObjectSortedSet<Object2ObjectMap.Entry<K, V>> headSet(Object2ObjectMap.Entry<K, V> toElement) {
            throw new UnsupportedOperationException();
        }

        @Override
        public ObjectSortedSet<Object2ObjectMap.Entry<K, V>> tailSet(Object2ObjectMap.Entry<K, V> fromElement) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void fastForEach(Consumer<? super Object2ObjectMap.Entry<K, V>> consumer) {
            MapEntry entry = new MapEntry(Object2ObjectLinkedOpenHashMap.this);
            long[] link = Object2ObjectLinkedOpenHashMap.this.link;
            int i = Object2ObjectLinkedOpenHashMap.this.size;
            int next = Object2ObjectLinkedOpenHashMap.this.first;
            while (i-- != 0) {
                entry.index = next;
                next = (int)link[next];
                consumer.accept((Object2ObjectMap.Entry)entry);
            }
        }

        @Override
        public ObjectListIterator<Object2ObjectMap.Entry<K, V>> fastIterator() {
            return new FastEntryIterator(Object2ObjectLinkedOpenHashMap.this);
        }

        @Override
        public ObjectListIterator<Object2ObjectMap.Entry<K, V>> fastIterator(Object2ObjectMap.Entry<K, V> from) {
            return new FastEntryIterator(Object2ObjectLinkedOpenHashMap.this, from.getKey());
        }
    }

    private abstract class MapIterator<ConsumerType> {
        int prev = -1;
        int next = -1;
        int curr = -1;
        int index = -1;

        private MapIterator(K from) {
            if (from == null) {
                if (Object2ObjectLinkedOpenHashMap.this.containsNullKey) {
                    this.next = (int)Object2ObjectLinkedOpenHashMap.this.link[Object2ObjectLinkedOpenHashMap.this.n];
                    this.prev = Object2ObjectLinkedOpenHashMap.this.n;
                    return;
                }
                throw new NoSuchElementException("The key " + from + " does not belong to this map.");
            }
            if (Objects.equals(Object2ObjectLinkedOpenHashMap.this.key[Object2ObjectLinkedOpenHashMap.this.last], from)) {
                this.prev = Object2ObjectLinkedOpenHashMap.this.last;
                this.index = Object2ObjectLinkedOpenHashMap.this.size;
                return;
            }
            int pos = HashCommon.mix((int)from.hashCode()) & Object2ObjectLinkedOpenHashMap.this.mask;
            while (Object2ObjectLinkedOpenHashMap.this.key[pos] != null) {
                if (Object2ObjectLinkedOpenHashMap.this.key[pos].equals(from)) {
                    this.next = (int)Object2ObjectLinkedOpenHashMap.this.link[pos];
                    this.prev = pos;
                    return;
                }
                pos = pos + 1 & Object2ObjectLinkedOpenHashMap.this.mask;
            }
            throw new NoSuchElementException("The key " + from + " does not belong to this map.");
        }

        protected MapIterator() {
            this.next = Object2ObjectLinkedOpenHashMap.this.first;
            this.index = 0;
        }

        public void remove() {
            this.ensureIndexKnown();
            if (this.curr == -1) {
                throw new IllegalStateException();
            }
            if (this.curr == this.prev) {
                --this.index;
                this.prev = (int)(Object2ObjectLinkedOpenHashMap.this.link[this.curr] >>> 32);
            } else {
                this.next = (int)Object2ObjectLinkedOpenHashMap.this.link[this.curr];
            }
            --Object2ObjectLinkedOpenHashMap.this.size;
            if (this.prev == -1) {
                Object2ObjectLinkedOpenHashMap.this.first = this.next;
            } else {
                int n = this.prev;
                Object2ObjectLinkedOpenHashMap.this.link[n] = Object2ObjectLinkedOpenHashMap.this.link[n] ^ (Object2ObjectLinkedOpenHashMap.this.link[this.prev] ^ (long)this.next & 0xFFFFFFFFL) & 0xFFFFFFFFL;
            }
            if (this.next == -1) {
                Object2ObjectLinkedOpenHashMap.this.last = this.prev;
            } else {
                int n = this.next;
                Object2ObjectLinkedOpenHashMap.this.link[n] = Object2ObjectLinkedOpenHashMap.this.link[n] ^ (Object2ObjectLinkedOpenHashMap.this.link[this.next] ^ ((long)this.prev & 0xFFFFFFFFL) << 32) & 0xFFFFFFFF00000000L;
            }
            int pos = this.curr;
            this.curr = -1;
            if (pos != Object2ObjectLinkedOpenHashMap.this.n) {
                K[] key = Object2ObjectLinkedOpenHashMap.this.key;
                V[] value = Object2ObjectLinkedOpenHashMap.this.value;
                while (true) {
                    Object curr;
                    int last = pos;
                    pos = last + 1 & Object2ObjectLinkedOpenHashMap.this.mask;
                    while (true) {
                        if ((curr = key[pos]) == null) {
                            key[last] = null;
                            value[last] = null;
                            return;
                        }
                        int slot = HashCommon.mix((int)curr.hashCode()) & Object2ObjectLinkedOpenHashMap.this.mask;
                        if (last <= pos ? last >= slot || slot > pos : last >= slot && slot > pos) break;
                        pos = pos + 1 & Object2ObjectLinkedOpenHashMap.this.mask;
                    }
                    key[last] = curr;
                    value[last] = value[pos];
                    if (this.next == pos) {
                        this.next = last;
                    }
                    if (this.prev == pos) {
                        this.prev = last;
                    }
                    Object2ObjectLinkedOpenHashMap.this.fixPointers(pos, last);
                }
            }
            Object2ObjectLinkedOpenHashMap.this.containsNullKey = false;
            Object2ObjectLinkedOpenHashMap.this.key[Object2ObjectLinkedOpenHashMap.this.n] = null;
            Object2ObjectLinkedOpenHashMap.this.value[Object2ObjectLinkedOpenHashMap.this.n] = null;
        }

        public void forEachRemaining(ConsumerType action) {
            while (this.hasNext()) {
                this.curr = this.next;
                this.next = (int)Object2ObjectLinkedOpenHashMap.this.link[this.curr];
                this.prev = this.curr;
                if (this.index >= 0) {
                    ++this.index;
                }
                this.acceptOnIndex(action, this.curr);
            }
        }

        public void add(Object2ObjectMap.Entry<K, V> ok) {
            throw new UnsupportedOperationException();
        }

        public boolean hasNext() {
            return this.next != -1;
        }

        public void set(Object2ObjectMap.Entry<K, V> ok) {
            throw new UnsupportedOperationException();
        }

        public int previousIndex() {
            this.ensureIndexKnown();
            return this.index - 1;
        }

        public boolean hasPrevious() {
            return this.prev != -1;
        }

        public int skip(int n) {
            int i = n;
            while (i-- != 0 && this.hasNext()) {
                this.nextEntry();
            }
            return n - i - 1;
        }

        public int nextIndex() {
            this.ensureIndexKnown();
            return this.index;
        }

        public int back(int n) {
            int i = n;
            while (i-- != 0 && this.hasPrevious()) {
                this.previousEntry();
            }
            return n - i - 1;
        }

        public int nextEntry() {
            if (!this.hasNext()) {
                throw new NoSuchElementException();
            }
            this.curr = this.next;
            this.next = (int)Object2ObjectLinkedOpenHashMap.this.link[this.curr];
            this.prev = this.curr;
            if (this.index >= 0) {
                ++this.index;
            }
            return this.curr;
        }

        abstract void acceptOnIndex(ConsumerType var1, int var2);

        public int previousEntry() {
            if (!this.hasPrevious()) {
                throw new NoSuchElementException();
            }
            this.curr = this.prev;
            this.prev = (int)(Object2ObjectLinkedOpenHashMap.this.link[this.curr] >>> 32);
            this.next = this.curr;
            if (this.index >= 0) {
                --this.index;
            }
            return this.curr;
        }

        private final void ensureIndexKnown() {
            if (this.index >= 0) {
                return;
            }
            if (this.prev == -1) {
                this.index = 0;
                return;
            }
            if (this.next == -1) {
                this.index = Object2ObjectLinkedOpenHashMap.this.size;
                return;
            }
            int pos = Object2ObjectLinkedOpenHashMap.this.first;
            this.index = 1;
            while (pos != this.prev) {
                pos = (int)Object2ObjectLinkedOpenHashMap.this.link[pos];
                ++this.index;
            }
        }
    }
}

