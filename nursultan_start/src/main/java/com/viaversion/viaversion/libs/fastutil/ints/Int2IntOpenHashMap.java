/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2IntOpenHashMap$EntrySpliterator
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2IntOpenHashMap$FastEntryIterator
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2IntOpenHashMap$KeySet
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectIterator
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectSpliterator
 */
package com.viaversion.viaversion.libs.fastutil.ints;

import com.viaversion.viaversion.libs.fastutil.Hash;
import com.viaversion.viaversion.libs.fastutil.HashCommon;
import com.viaversion.viaversion.libs.fastutil.ints.AbstractInt2IntMap;
import com.viaversion.viaversion.libs.fastutil.ints.Int2IntFunction;
import com.viaversion.viaversion.libs.fastutil.ints.Int2IntMap;
import com.viaversion.viaversion.libs.fastutil.ints.Int2IntOpenHashMap;
import com.viaversion.viaversion.libs.fastutil.ints.IntArrayList;
import com.viaversion.viaversion.libs.fastutil.ints.IntCollection;
import com.viaversion.viaversion.libs.fastutil.ints.IntIntPair;
import com.viaversion.viaversion.libs.fastutil.ints.IntSet;
import com.viaversion.viaversion.libs.fastutil.objects.AbstractObjectSet;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectIterator;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectSpliterator;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;

public class Int2IntOpenHashMap
extends AbstractInt2IntMap
implements Serializable,
Cloneable,
Hash {
    private static final long serialVersionUID = 0L;
    private static final boolean ASSERTS = false;
    protected transient int[] key;
    protected transient int[] value;
    protected transient int mask;
    protected transient boolean containsNullKey;
    protected transient int n;
    protected transient int maxFill;
    protected final transient int minN;
    protected int size;
    protected final float f;
    protected transient Int2IntMap.FastEntrySet entries;
    protected transient IntSet keys;
    protected transient IntCollection values;

    private int removeEntry(int pos) {
        int oldValue = this.value[pos];
        --this.size;
        this.shiftKeys(pos);
        if (this.n > this.minN && this.size < this.maxFill / 4 && this.n > 16) {
            this.rehash(this.n / 2);
        }
        return oldValue;
    }

    static /* synthetic */ int access$100(Int2IntOpenHashMap x0) {
        return x0.realSize();
    }

    public int addTo(int k, int incr) {
        int pos;
        if (k == 0) {
            if (this.containsNullKey) {
                return this.addToValue(this.n, incr);
            }
            pos = this.n;
            this.containsNullKey = true;
        } else {
            int[] key = this.key;
            pos = HashCommon.mix(k) & this.mask;
            int curr = key[pos];
            if (curr != 0) {
                if (curr == k) {
                    return this.addToValue(pos, incr);
                }
                while ((curr = key[pos = pos + 1 & this.mask]) != 0) {
                    if (curr != k) continue;
                    return this.addToValue(pos, incr);
                }
            }
        }
        this.key[pos] = k;
        this.value[pos] = this.defRetValue + incr;
        if (this.size++ >= this.maxFill) {
            this.rehash(HashCommon.arraySize(this.size + 1, this.f));
        }
        return this.defRetValue;
    }

    public Int2IntOpenHashMap(int expected, float f) {
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("Load factor must be greater than 0 and smaller than 1");
        }
        if (expected < 0) {
            throw new IllegalArgumentException("The expected number of elements must be nonnegative");
        }
        this.f = f;
        this.minN = this.n = HashCommon.arraySize(expected, f);
        this.mask = this.n - 1;
        this.maxFill = HashCommon.maxFill(this.n, f);
        this.key = new int[this.n + 1];
        this.value = new int[this.n + 1];
    }

    public Int2IntOpenHashMap(int[] k, int[] v) {
        this(k, v, 0.75f);
    }

    public Int2IntOpenHashMap(int[] k, int[] v, float f) {
        this(k.length, f);
        if (k.length != v.length) {
            throw new IllegalArgumentException("The key array and the value array have different lengths (" + k.length + " and " + v.length + ")");
        }
        for (int i = 0; i < k.length; ++i) {
            this.put(k[i], v[i]);
        }
    }

    public Int2IntOpenHashMap(Map<? extends Integer, ? extends Integer> m) {
        this(m, 0.75f);
    }

    public Int2IntOpenHashMap(Map<? extends Integer, ? extends Integer> m, float f) {
        this(m.size(), f);
        this.putAll(m);
    }

    public Int2IntOpenHashMap(Int2IntMap m, float f) {
        this(m.size(), f);
        this.putAll(m);
    }

    public Int2IntOpenHashMap(Int2IntMap m) {
        this(m, 0.75f);
    }

    public Int2IntOpenHashMap() {
        this(16, 0.75f);
    }

    public Int2IntOpenHashMap(int expected) {
        this(expected, 0.75f);
    }

    @Override
    public boolean remove(int k, int v) {
        if (k == 0) {
            if (this.containsNullKey && v == this.value[this.n]) {
                this.removeNullEntry();
                return true;
            }
            return false;
        }
        int[] key = this.key;
        int pos = HashCommon.mix(k) & this.mask;
        int curr = key[pos];
        if (curr == 0) {
            return false;
        }
        if (k == curr && v == this.value[pos]) {
            this.removeEntry(pos);
            return true;
        }
        do {
            if ((curr = key[pos = pos + 1 & this.mask]) != 0) continue;
            return false;
        } while (k != curr || v != this.value[pos]);
        this.removeEntry(pos);
        return true;
    }

    @Override
    public int remove(int k) {
        if (k == 0) {
            if (this.containsNullKey) {
                return this.removeNullEntry();
            }
            return this.defRetValue;
        }
        int[] key = this.key;
        int pos = HashCommon.mix(k) & this.mask;
        int curr = key[pos];
        if (curr == 0) {
            return this.defRetValue;
        }
        if (k == curr) {
            return this.removeEntry(pos);
        }
        do {
            if ((curr = key[pos = pos + 1 & this.mask]) != 0) continue;
            return this.defRetValue;
        } while (k != curr);
        return this.removeEntry(pos);
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public int get(int k) {
        if (k == 0) {
            return this.containsNullKey ? this.value[this.n] : this.defRetValue;
        }
        int[] key = this.key;
        int pos = HashCommon.mix(k) & this.mask;
        int curr = key[pos];
        if (curr == 0) {
            return this.defRetValue;
        }
        if (k == curr) {
            return this.value[pos];
        }
        do {
            if ((curr = key[pos = pos + 1 & this.mask]) != 0) continue;
            return this.defRetValue;
        } while (k != curr);
        return this.value[pos];
    }

    @Override
    public int put(int k, int v) {
        int pos = this.find(k);
        if (pos < 0) {
            this.insert(-pos - 1, k, v);
            return this.defRetValue;
        }
        int oldValue = this.value[pos];
        this.value[pos] = v;
        return oldValue;
    }

    @Override
    public IntCollection values() {
        if (this.values == null) {
            this.values = new /* Unavailable Anonymous Inner Class!! */;
        }
        return this.values;
    }

    @Override
    public int hashCode() {
        int h = 0;
        int[] key = this.key;
        int[] value = this.value;
        int j = this.realSize();
        int i = 0;
        int t = 0;
        while (j-- != 0) {
            while (key[i] == 0) {
                ++i;
            }
            t = key[i];
            h += (t ^= value[i]);
            ++i;
        }
        if (this.containsNullKey) {
            h += value[this.n];
        }
        return h;
    }

    public Int2IntOpenHashMap clone() {
        Int2IntOpenHashMap c;
        try {
            c = (Int2IntOpenHashMap)super.clone();
        }
        catch (CloneNotSupportedException cantHappen) {
            throw new InternalError();
        }
        c.keys = null;
        c.values = null;
        c.entries = null;
        c.containsNullKey = this.containsNullKey;
        c.key = (int[])this.key.clone();
        c.value = (int[])this.value.clone();
        return c;
    }

    private void insert(int pos, int k, int v) {
        if (pos == this.n) {
            this.containsNullKey = true;
        }
        this.key[pos] = k;
        this.value[pos] = v;
        if (this.size++ >= this.maxFill) {
            this.rehash(HashCommon.arraySize(this.size + 1, this.f));
        }
    }

    @Override
    public void clear() {
        if (this.size == 0) {
            return;
        }
        this.size = 0;
        this.containsNullKey = false;
        Arrays.fill(this.key, 0);
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public int replace(int k, int v) {
        int pos = this.find(k);
        if (pos < 0) {
            return this.defRetValue;
        }
        int oldValue = this.value[pos];
        this.value[pos] = v;
        return oldValue;
    }

    @Override
    public boolean replace(int k, int oldValue, int v) {
        int pos = this.find(k);
        if (pos < 0 || oldValue != this.value[pos]) {
            return false;
        }
        this.value[pos] = v;
        return true;
    }

    public boolean trim(int n) {
        int l = HashCommon.nextPowerOfTwo((int)Math.ceil((float)n / this.f));
        if (l >= this.n || this.size > HashCommon.maxFill(l, this.f)) {
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

    @Override
    public int merge(int k, int v, BiFunction<? super Integer, ? super Integer, ? extends Integer> remappingFunction) {
        Objects.requireNonNull(remappingFunction);
        int pos = this.find(k);
        if (pos < 0) {
            if (pos < 0) {
                this.insert(-pos - 1, k, v);
            } else {
                this.value[pos] = v;
            }
            return v;
        }
        Integer newValue = remappingFunction.apply((Integer)this.value[pos], (Integer)v);
        if (newValue == null) {
            if (k == 0) {
                this.removeNullEntry();
            } else {
                this.removeEntry(pos);
            }
            return this.defRetValue;
        }
        this.value[pos] = newValue;
        return this.value[pos];
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Integer> m) {
        if ((double)this.f <= 0.5) {
            this.ensureCapacity(m.size());
        } else {
            this.tryCapacity(this.size() + m.size());
        }
        super.putAll(m);
    }

    @Override
    public int putIfAbsent(int k, int v) {
        int pos = this.find(k);
        if (pos >= 0) {
            return this.value[pos];
        }
        this.insert(-pos - 1, k, v);
        return this.defRetValue;
    }

    @Override
    public int compute(int k, BiFunction<? super Integer, ? super Integer, ? extends Integer> remappingFunction) {
        Objects.requireNonNull(remappingFunction);
        int pos = this.find(k);
        Integer newValue = remappingFunction.apply((Integer)k, pos >= 0 ? Integer.valueOf(this.value[pos]) : null);
        if (newValue == null) {
            if (pos >= 0) {
                if (k == 0) {
                    this.removeNullEntry();
                } else {
                    this.removeEntry(pos);
                }
            }
            return this.defRetValue;
        }
        int newVal = newValue;
        if (pos < 0) {
            this.insert(-pos - 1, k, newVal);
            return newVal;
        }
        this.value[pos] = newVal;
        return this.value[pos];
    }

    private int find(int k) {
        if (k == 0) {
            return this.containsNullKey ? this.n : -(this.n + 1);
        }
        int[] key = this.key;
        int pos = HashCommon.mix(k) & this.mask;
        int curr = key[pos];
        if (curr == 0) {
            return -(pos + 1);
        }
        if (k == curr) {
            return pos;
        }
        do {
            if ((curr = key[pos = pos + 1 & this.mask]) != 0) continue;
            return -(pos + 1);
        } while (k != curr);
        return pos;
    }

    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {
        s.defaultReadObject();
        this.n = HashCommon.arraySize(this.size, this.f);
        this.maxFill = HashCommon.maxFill(this.n, this.f);
        this.mask = this.n - 1;
        this.key = new int[this.n + 1];
        int[] key = this.key;
        this.value = new int[this.n + 1];
        int[] value = this.value;
        int i = this.size;
        while (i-- != 0) {
            int pos;
            int k = s.readInt();
            int v = s.readInt();
            if (k == 0) {
                pos = this.n;
                this.containsNullKey = true;
            } else {
                pos = HashCommon.mix(k) & this.mask;
                while (key[pos] != 0) {
                    pos = pos + 1 & this.mask;
                }
            }
            key[pos] = k;
            value[pos] = v;
        }
    }

    private void writeObject(ObjectOutputStream s) throws IOException {
        int[] key = this.key;
        int[] value = this.value;
        EntryIterator i = new EntryIterator();
        s.defaultWriteObject();
        int j = this.size;
        while (j-- != 0) {
            int e = i.nextEntry();
            s.writeInt(key[e]);
            s.writeInt(value[e]);
        }
    }

    @Override
    public boolean containsKey(int k) {
        if (k == 0) {
            return this.containsNullKey;
        }
        int[] key = this.key;
        int pos = HashCommon.mix(k) & this.mask;
        int curr = key[pos];
        if (curr == 0) {
            return false;
        }
        if (k == curr) {
            return true;
        }
        do {
            if ((curr = key[pos = pos + 1 & this.mask]) != 0) continue;
            return false;
        } while (k != curr);
        return true;
    }

    @Override
    public int computeIfAbsent(int key, Int2IntFunction mappingFunction) {
        Objects.requireNonNull(mappingFunction);
        int pos = this.find(key);
        if (pos >= 0) {
            return this.value[pos];
        }
        if (!mappingFunction.containsKey(key)) {
            return this.defRetValue;
        }
        int newValue = mappingFunction.get(key);
        this.insert(-pos - 1, key, newValue);
        return newValue;
    }

    @Override
    public int computeIfAbsent(int k, IntUnaryOperator mappingFunction) {
        Objects.requireNonNull(mappingFunction);
        int pos = this.find(k);
        if (pos >= 0) {
            return this.value[pos];
        }
        int newValue = mappingFunction.applyAsInt(k);
        this.insert(-pos - 1, k, newValue);
        return newValue;
    }

    @Override
    public IntSet keySet() {
        if (this.keys == null) {
            this.keys = new KeySet(this, null);
        }
        return this.keys;
    }

    @Override
    public boolean containsValue(int v) {
        int[] key = this.key;
        int[] value = this.value;
        if (this.containsNullKey && value[this.n] == v) {
            return true;
        }
        int i = this.n;
        while (i-- != 0) {
            if (key[i] == 0 || value[i] != v) continue;
            return true;
        }
        return false;
    }

    @Override
    public int getOrDefault(int k, int defaultValue) {
        if (k == 0) {
            return this.containsNullKey ? this.value[this.n] : defaultValue;
        }
        int[] key = this.key;
        int pos = HashCommon.mix(k) & this.mask;
        int curr = key[pos];
        if (curr == 0) {
            return defaultValue;
        }
        if (k == curr) {
            return this.value[pos];
        }
        do {
            if ((curr = key[pos = pos + 1 & this.mask]) != 0) continue;
            return defaultValue;
        } while (k != curr);
        return this.value[pos];
    }

    @Override
    public int computeIfPresent(int k, BiFunction<? super Integer, ? super Integer, ? extends Integer> remappingFunction) {
        Objects.requireNonNull(remappingFunction);
        int pos = this.find(k);
        if (pos < 0) {
            return this.defRetValue;
        }
        Integer newValue = remappingFunction.apply((Integer)k, (Integer)this.value[pos]);
        if (newValue == null) {
            if (k == 0) {
                this.removeNullEntry();
            } else {
                this.removeEntry(pos);
            }
            return this.defRetValue;
        }
        this.value[pos] = newValue;
        return this.value[pos];
    }

    protected void rehash(int newN) {
        int[] key = this.key;
        int[] value = this.value;
        int mask = newN - 1;
        int[] newKey = new int[newN + 1];
        int[] newValue = new int[newN + 1];
        int i = this.n;
        int j = this.realSize();
        while (j-- != 0) {
            while (key[--i] == 0) {
            }
            int pos = HashCommon.mix(key[i]) & mask;
            if (newKey[pos] != 0) {
                while (newKey[pos = pos + 1 & mask] != 0) {
                }
            }
            newKey[pos] = key[i];
            newValue[pos] = value[i];
        }
        newValue[newN] = value[this.n];
        this.n = newN;
        this.mask = mask;
        this.maxFill = HashCommon.maxFill(this.n, this.f);
        this.key = newKey;
        this.value = newValue;
    }

    public void ensureCapacity(int capacity) {
        int needed = HashCommon.arraySize(capacity, this.f);
        if (needed > this.n) {
            this.rehash(needed);
        }
    }

    private int realSize() {
        return this.containsNullKey ? this.size - 1 : this.size;
    }

    protected final void shiftKeys(int pos) {
        int[] key = this.key;
        int[] value = this.value;
        while (true) {
            int curr;
            int last = pos;
            pos = last + 1 & this.mask;
            while (true) {
                if ((curr = key[pos]) == 0) {
                    key[last] = 0;
                    return;
                }
                int slot = HashCommon.mix(curr) & this.mask;
                if (last <= pos ? last >= slot || slot > pos : last >= slot && slot > pos) break;
                pos = pos + 1 & this.mask;
            }
            key[last] = curr;
            value[last] = value[pos];
        }
    }

    private int addToValue(int pos, int incr) {
        int oldValue = this.value[pos];
        this.value[pos] = oldValue + incr;
        return oldValue;
    }

    private void checkTable() {
    }

    public Int2IntMap.FastEntrySet int2IntEntrySet() {
        if (this.entries == null) {
            this.entries = new MapEntrySet();
        }
        return this.entries;
    }

    private int removeNullEntry() {
        this.containsNullKey = false;
        int oldValue = this.value[this.n];
        --this.size;
        if (this.n > this.minN && this.size < this.maxFill / 4 && this.n > 16) {
            this.rehash(this.n / 2);
        }
        return oldValue;
    }

    private void tryCapacity(long capacity) {
        int needed = (int)Math.min(0x40000000L, Math.max(2L, HashCommon.nextPowerOfTwo((long)Math.ceil((float)capacity / this.f))));
        if (needed > this.n) {
            this.rehash(needed);
        }
    }

    @Override
    public int computeIfAbsentNullable(int k, IntFunction<? extends Integer> mappingFunction) {
        Objects.requireNonNull(mappingFunction);
        int pos = this.find(k);
        if (pos >= 0) {
            return this.value[pos];
        }
        Integer newValue = mappingFunction.apply(k);
        if (newValue == null) {
            return this.defRetValue;
        }
        int v = newValue;
        this.insert(-pos - 1, k, v);
        return v;
    }

    private final class MapEntrySet
    extends AbstractObjectSet<Int2IntMap.Entry>
    implements Int2IntMap.FastEntrySet {
        private MapEntrySet() {
        }

        @Override
        public boolean remove(Object o) {
            if (!(o instanceof Map.Entry)) {
                return false;
            }
            Map.Entry e = (Map.Entry)o;
            if (e.getKey() == null || !(e.getKey() instanceof Integer)) {
                return false;
            }
            if (e.getValue() == null || !(e.getValue() instanceof Integer)) {
                return false;
            }
            int k = (Integer)e.getKey();
            int v = (Integer)e.getValue();
            if (k == 0) {
                if (Int2IntOpenHashMap.this.containsNullKey && Int2IntOpenHashMap.this.value[Int2IntOpenHashMap.this.n] == v) {
                    Int2IntOpenHashMap.this.removeNullEntry();
                    return true;
                }
                return false;
            }
            int[] key = Int2IntOpenHashMap.this.key;
            int pos = HashCommon.mix(k) & Int2IntOpenHashMap.this.mask;
            int curr = key[pos];
            if (curr == 0) {
                return false;
            }
            if (curr == k) {
                if (Int2IntOpenHashMap.this.value[pos] == v) {
                    Int2IntOpenHashMap.this.removeEntry(pos);
                    return true;
                }
                return false;
            }
            do {
                if ((curr = key[pos = pos + 1 & Int2IntOpenHashMap.this.mask]) != 0) continue;
                return false;
            } while (curr != k || Int2IntOpenHashMap.this.value[pos] != v);
            Int2IntOpenHashMap.this.removeEntry(pos);
            return true;
        }

        @Override
        public int size() {
            return Int2IntOpenHashMap.this.size;
        }

        @Override
        public void clear() {
            Int2IntOpenHashMap.this.clear();
        }

        @Override
        public ObjectIterator<Int2IntMap.Entry> iterator() {
            return new EntryIterator();
        }

        @Override
        public boolean contains(Object o) {
            if (!(o instanceof Map.Entry)) {
                return false;
            }
            Map.Entry e = (Map.Entry)o;
            if (e.getKey() == null || !(e.getKey() instanceof Integer)) {
                return false;
            }
            if (e.getValue() == null || !(e.getValue() instanceof Integer)) {
                return false;
            }
            int k = (Integer)e.getKey();
            int v = (Integer)e.getValue();
            if (k == 0) {
                return Int2IntOpenHashMap.this.containsNullKey && Int2IntOpenHashMap.this.value[Int2IntOpenHashMap.this.n] == v;
            }
            int[] key = Int2IntOpenHashMap.this.key;
            int pos = HashCommon.mix(k) & Int2IntOpenHashMap.this.mask;
            int curr = key[pos];
            if (curr == 0) {
                return false;
            }
            if (k == curr) {
                return Int2IntOpenHashMap.this.value[pos] == v;
            }
            do {
                if ((curr = key[pos = pos + 1 & Int2IntOpenHashMap.this.mask]) != 0) continue;
                return false;
            } while (k != curr);
            return Int2IntOpenHashMap.this.value[pos] == v;
        }

        @Override
        public ObjectSpliterator<Int2IntMap.Entry> spliterator() {
            return new EntrySpliterator(Int2IntOpenHashMap.this);
        }

        @Override
        public void forEach(Consumer<? super Int2IntMap.Entry> consumer) {
            if (Int2IntOpenHashMap.this.containsNullKey) {
                consumer.accept(new MapEntry(Int2IntOpenHashMap.this.n));
            }
            int[] key = Int2IntOpenHashMap.this.key;
            int pos = Int2IntOpenHashMap.this.n;
            while (pos-- != 0) {
                if (key[pos] == 0) continue;
                consumer.accept(new MapEntry(pos));
            }
        }

        @Override
        public void fastForEach(Consumer<? super Int2IntMap.Entry> consumer) {
            MapEntry entry = new MapEntry();
            if (Int2IntOpenHashMap.this.containsNullKey) {
                entry.index = Int2IntOpenHashMap.this.n;
                consumer.accept(entry);
            }
            int[] key = Int2IntOpenHashMap.this.key;
            int pos = Int2IntOpenHashMap.this.n;
            while (pos-- != 0) {
                if (key[pos] == 0) continue;
                entry.index = pos;
                consumer.accept(entry);
            }
        }

        @Override
        public ObjectIterator<Int2IntMap.Entry> fastIterator() {
            return new FastEntryIterator(Int2IntOpenHashMap.this, null);
        }
    }

    private final class EntryIterator
    extends MapIterator<Consumer<? super Int2IntMap.Entry>>
    implements ObjectIterator<Int2IntMap.Entry> {
        private MapEntry entry;

        private EntryIterator() {
        }

        @Override
        public void remove() {
            super.remove();
            this.entry.index = -1;
        }

        public MapEntry next() {
            this.entry = new MapEntry(this.nextEntry());
            return this.entry;
        }

        @Override
        final void acceptOnIndex(Consumer<? super Int2IntMap.Entry> action, int index) {
            this.entry = new MapEntry(index);
            action.accept(this.entry);
        }
    }

    private abstract class MapIterator<ConsumerType> {
        int pos;
        int last;
        int c;
        boolean mustReturnNullKey;
        IntArrayList wrapped;

        private MapIterator() {
            this.pos = Int2IntOpenHashMap.this.n;
            this.last = -1;
            this.c = Int2IntOpenHashMap.this.size;
            this.mustReturnNullKey = Int2IntOpenHashMap.this.containsNullKey;
        }

        public void remove() {
            if (this.last == -1) {
                throw new IllegalStateException();
            }
            if (this.last == Int2IntOpenHashMap.this.n) {
                Int2IntOpenHashMap.this.containsNullKey = false;
            } else if (this.pos >= 0) {
                this.shiftKeys(this.last);
            } else {
                Int2IntOpenHashMap.this.remove(this.wrapped.getInt(-this.pos - 1));
                this.last = -1;
                return;
            }
            --Int2IntOpenHashMap.this.size;
            this.last = -1;
        }

        public void forEachRemaining(ConsumerType action) {
            if (this.mustReturnNullKey) {
                this.mustReturnNullKey = false;
                this.last = Int2IntOpenHashMap.this.n;
                this.acceptOnIndex(action, this.last);
                --this.c;
            }
            int[] key = Int2IntOpenHashMap.this.key;
            while (this.c != 0) {
                if (--this.pos < 0) {
                    this.last = Integer.MIN_VALUE;
                    int k = this.wrapped.getInt(-this.pos - 1);
                    int p = HashCommon.mix(k) & Int2IntOpenHashMap.this.mask;
                    while (k != key[p]) {
                        p = p + 1 & Int2IntOpenHashMap.this.mask;
                    }
                    this.acceptOnIndex(action, p);
                    --this.c;
                    continue;
                }
                if (key[this.pos] == 0) continue;
                this.last = this.pos;
                this.acceptOnIndex(action, this.last);
                --this.c;
            }
        }

        public boolean hasNext() {
            return this.c != 0;
        }

        public int skip(int n) {
            int i = n;
            while (i-- != 0 && this.hasNext()) {
                this.nextEntry();
            }
            return n - i - 1;
        }

        public int nextEntry() {
            if (!this.hasNext()) {
                throw new NoSuchElementException();
            }
            --this.c;
            if (this.mustReturnNullKey) {
                this.mustReturnNullKey = false;
                this.last = Int2IntOpenHashMap.this.n;
                return this.last;
            }
            int[] key = Int2IntOpenHashMap.this.key;
            do {
                if (--this.pos >= 0) continue;
                this.last = Integer.MIN_VALUE;
                int k = this.wrapped.getInt(-this.pos - 1);
                int p = HashCommon.mix(k) & Int2IntOpenHashMap.this.mask;
                while (k != key[p]) {
                    p = p + 1 & Int2IntOpenHashMap.this.mask;
                }
                return p;
            } while (key[this.pos] == 0);
            this.last = this.pos;
            return this.last;
        }

        private void shiftKeys(int pos) {
            int[] key = Int2IntOpenHashMap.this.key;
            int[] value = Int2IntOpenHashMap.this.value;
            while (true) {
                int curr;
                int last = pos;
                pos = last + 1 & Int2IntOpenHashMap.this.mask;
                while (true) {
                    if ((curr = key[pos]) == 0) {
                        key[last] = 0;
                        return;
                    }
                    int slot = HashCommon.mix(curr) & Int2IntOpenHashMap.this.mask;
                    if (last <= pos ? last >= slot || slot > pos : last >= slot && slot > pos) break;
                    pos = pos + 1 & Int2IntOpenHashMap.this.mask;
                }
                if (pos < last) {
                    if (this.wrapped == null) {
                        this.wrapped = new IntArrayList(2);
                    }
                    this.wrapped.add(key[pos]);
                }
                key[last] = curr;
                value[last] = value[pos];
            }
        }

        abstract void acceptOnIndex(ConsumerType var1, int var2);
    }

    final class MapEntry
    implements Int2IntMap.Entry,
    Map.Entry<Integer, Integer>,
    IntIntPair {
        int index;

        MapEntry(int index) {
            this.index = index;
        }

        MapEntry() {
        }

        @Override
        public boolean equals(Object o) {
            if (!(o instanceof Map.Entry)) {
                return false;
            }
            Map.Entry e = (Map.Entry)o;
            return Int2IntOpenHashMap.this.key[this.index] == (Integer)e.getKey() && Int2IntOpenHashMap.this.value[this.index] == (Integer)e.getValue();
        }

        public String toString() {
            return Int2IntOpenHashMap.this.key[this.index] + "=>" + Int2IntOpenHashMap.this.value[this.index];
        }

        @Override
        public int hashCode() {
            return Int2IntOpenHashMap.this.key[this.index] ^ Int2IntOpenHashMap.this.value[this.index];
        }

        @Override
        @Deprecated
        public Integer getValue() {
            return Int2IntOpenHashMap.this.value[this.index];
        }

        @Override
        @Deprecated
        public Integer getKey() {
            return Int2IntOpenHashMap.this.key[this.index];
        }

        @Override
        public int setValue(int v) {
            int oldValue = Int2IntOpenHashMap.this.value[this.index];
            Int2IntOpenHashMap.this.value[this.index] = v;
            return oldValue;
        }

        @Override
        @Deprecated
        public Integer setValue(Integer v) {
            return this.setValue((int)v);
        }

        @Override
        public IntIntPair right(int v) {
            Int2IntOpenHashMap.this.value[this.index] = v;
            return this;
        }

        @Override
        public int getIntKey() {
            return Int2IntOpenHashMap.this.key[this.index];
        }

        @Override
        public int getIntValue() {
            return Int2IntOpenHashMap.this.value[this.index];
        }

        @Override
        public int rightInt() {
            return Int2IntOpenHashMap.this.value[this.index];
        }

        @Override
        public int leftInt() {
            return Int2IntOpenHashMap.this.key[this.index];
        }
    }
}

