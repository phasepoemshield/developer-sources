/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.fastutil.Hash
 *  com.viaversion.viaversion.libs.fastutil.HashCommon
 *  com.viaversion.viaversion.libs.fastutil.objects.AbstractObjectCollection
 *  com.viaversion.viaversion.libs.fastutil.objects.AbstractReference2ObjectMap
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectSpliterator
 *  com.viaversion.viaversion.libs.fastutil.objects.Reference2ObjectMap$FastEntrySet
 *  com.viaversion.viaversion.libs.fastutil.objects.Reference2ObjectOpenHashMap$EntryIterator
 *  com.viaversion.viaversion.libs.fastutil.objects.Reference2ObjectOpenHashMap$KeySet
 *  com.viaversion.viaversion.libs.fastutil.objects.Reference2ObjectOpenHashMap$MapEntrySet
 *  com.viaversion.viaversion.libs.fastutil.objects.Reference2ObjectOpenHashMap$ValueSpliterator
 *  com.viaversion.viaversion.libs.fastutil.objects.ReferenceArrayList
 */
package com.viaversion.viaversion.libs.fastutil.objects;

import com.viaversion.viaversion.libs.fastutil.Hash;
import com.viaversion.viaversion.libs.fastutil.HashCommon;
import com.viaversion.viaversion.libs.fastutil.objects.AbstractObjectCollection;
import com.viaversion.viaversion.libs.fastutil.objects.AbstractReference2ObjectMap;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectCollection;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectIterator;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectSpliterator;
import com.viaversion.viaversion.libs.fastutil.objects.Reference2ObjectFunction;
import com.viaversion.viaversion.libs.fastutil.objects.Reference2ObjectMap;
import com.viaversion.viaversion.libs.fastutil.objects.Reference2ObjectOpenHashMap;
import com.viaversion.viaversion.libs.fastutil.objects.ReferenceArrayList;
import com.viaversion.viaversion.libs.fastutil.objects.ReferenceSet;
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

public class Reference2ObjectOpenHashMap<K, V>
extends AbstractReference2ObjectMap<K, V>
implements Serializable,
Cloneable,
Hash {
    private static final long serialVersionUID = 0L;
    private static final boolean ASSERTS = false;
    protected transient K[] key;
    protected transient V[] value;
    protected transient int mask;
    protected transient boolean containsNullKey;
    protected transient int n;
    protected transient int maxFill;
    protected final transient int minN;
    protected int size;
    protected final float f;
    protected transient Reference2ObjectMap.FastEntrySet<K, V> entries;
    protected transient ReferenceSet<K> keys;
    protected transient ObjectCollection<V> values;

    private V removeEntry(int pos) {
        V oldValue = this.value[pos];
        this.value[pos] = null;
        --this.size;
        this.shiftKeys(pos);
        if (this.n > this.minN && this.size < this.maxFill / 4 && this.n > 16) {
            this.rehash(this.n / 2);
        }
        return oldValue;
    }

    static /* synthetic */ int access$100(Reference2ObjectOpenHashMap x0) {
        return x0.realSize();
    }

    static /* synthetic */ Object access$400(Reference2ObjectOpenHashMap x0) {
        return x0.removeNullEntry();
    }

    static /* synthetic */ Object access$500(Reference2ObjectOpenHashMap x0, int x1) {
        return x0.removeEntry(x1);
    }

    public Reference2ObjectOpenHashMap(K[] k, V[] v) {
        this(k, v, 0.75f);
    }

    public Reference2ObjectOpenHashMap(K[] k, V[] v, float f) {
        this(k.length, f);
        if (k.length != v.length) {
            throw new IllegalArgumentException("The key array and the value array have different lengths (" + k.length + " and " + v.length + ")");
        }
        for (int i = 0; i < k.length; ++i) {
            this.put(k[i], v[i]);
        }
    }

    public Reference2ObjectOpenHashMap(int expected, float f) {
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
    }

    public Reference2ObjectOpenHashMap(Map<? extends K, ? extends V> m) {
        this(m, 0.75f);
    }

    public Reference2ObjectOpenHashMap(Map<? extends K, ? extends V> m, float f) {
        this(m.size(), f);
        this.putAll(m);
    }

    public Reference2ObjectOpenHashMap() {
        this(16, 0.75f);
    }

    public Reference2ObjectOpenHashMap(Reference2ObjectMap<K, V> m) {
        this(m, 0.75f);
    }

    public Reference2ObjectOpenHashMap(Reference2ObjectMap<K, V> m, float f) {
        this(m.size(), f);
        this.putAll(m);
    }

    public Reference2ObjectOpenHashMap(int expected) {
        this(expected, 0.75f);
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
        int pos = HashCommon.mix((int)System.identityHashCode(k)) & this.mask;
        K curr = key[pos];
        if (curr == null) {
            return false;
        }
        if (k == curr && Objects.equals(v, this.value[pos])) {
            this.removeEntry(pos);
            return true;
        }
        do {
            if ((curr = key[pos = pos + 1 & this.mask]) != null) continue;
            return false;
        } while (k != curr || !Objects.equals(v, this.value[pos]));
        this.removeEntry(pos);
        return true;
    }

    public V remove(Object k) {
        if (k == null) {
            if (this.containsNullKey) {
                return this.removeNullEntry();
            }
            return (V)this.defRetValue;
        }
        K[] key = this.key;
        int pos = HashCommon.mix((int)System.identityHashCode(k)) & this.mask;
        K curr = key[pos];
        if (curr == null) {
            return (V)this.defRetValue;
        }
        if (k == curr) {
            return this.removeEntry(pos);
        }
        do {
            if ((curr = key[pos = pos + 1 & this.mask]) != null) continue;
            return (V)this.defRetValue;
        } while (k != curr);
        return this.removeEntry(pos);
    }

    public int size() {
        return this.size;
    }

    public V get(Object k) {
        if (k == null) {
            return (V)(this.containsNullKey ? this.value[this.n] : this.defRetValue);
        }
        K[] key = this.key;
        int pos = HashCommon.mix((int)System.identityHashCode(k)) & this.mask;
        K curr = key[pos];
        if (curr == null) {
            return (V)this.defRetValue;
        }
        if (k == curr) {
            return this.value[pos];
        }
        do {
            if ((curr = key[pos = pos + 1 & this.mask]) != null) continue;
            return (V)this.defRetValue;
        } while (k != curr);
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
            this.values = new AbstractObjectCollection<V>(){

                public int size() {
                    return Reference2ObjectOpenHashMap.this.size;
                }

                public void clear() {
                    Reference2ObjectOpenHashMap.this.clear();
                }

                public ObjectIterator<V> iterator() {
                    return new ValueIterator();
                }

                public boolean contains(Object v) {
                    return Reference2ObjectOpenHashMap.this.containsValue(v);
                }

                public ObjectSpliterator<V> spliterator() {
                    return new ValueSpliterator(Reference2ObjectOpenHashMap.this);
                }

                public void forEach(Consumer<? super V> consumer) {
                    K[] key = Reference2ObjectOpenHashMap.this.key;
                    V[] value = Reference2ObjectOpenHashMap.this.value;
                    if (Reference2ObjectOpenHashMap.this.containsNullKey) {
                        consumer.accept(value[Reference2ObjectOpenHashMap.this.n]);
                    }
                    int pos = Reference2ObjectOpenHashMap.this.n;
                    while (pos-- != 0) {
                        if (key[pos] == null) continue;
                        consumer.accept(value[pos]);
                    }
                }
            };
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
                t = System.identityHashCode(key[i]);
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

    public Reference2ObjectOpenHashMap<K, V> clone() {
        Reference2ObjectOpenHashMap c;
        try {
            c = (Reference2ObjectOpenHashMap)super.clone();
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
        return c;
    }

    private void insert(int pos, K k, V v) {
        if (pos == this.n) {
            this.containsNullKey = true;
        }
        this.key[pos] = k;
        this.value[pos] = v;
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
        int pos = HashCommon.mix((int)System.identityHashCode(k)) & this.mask;
        K curr = key[pos];
        if (curr == null) {
            return -(pos + 1);
        }
        if (k == curr) {
            return pos;
        }
        do {
            if ((curr = key[pos = pos + 1 & this.mask]) != null) continue;
            return -(pos + 1);
        } while (k != curr);
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
        int i = this.size;
        while (i-- != 0) {
            int pos;
            Object k = s.readObject();
            Object v = s.readObject();
            if (k == null) {
                pos = this.n;
                this.containsNullKey = true;
            } else {
                pos = HashCommon.mix((int)System.identityHashCode(k)) & this.mask;
                while (key[pos] != null) {
                    pos = pos + 1 & this.mask;
                }
            }
            key[pos] = k;
            value[pos] = v;
        }
    }

    private void writeObject(ObjectOutputStream s) throws IOException {
        K[] key = this.key;
        V[] value = this.value;
        EntryIterator i = new EntryIterator(this, null);
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
        int pos = HashCommon.mix((int)System.identityHashCode(k)) & this.mask;
        K curr = key[pos];
        if (curr == null) {
            return false;
        }
        if (k == curr) {
            return true;
        }
        do {
            if ((curr = key[pos = pos + 1 & this.mask]) != null) continue;
            return false;
        } while (k != curr);
        return true;
    }

    public V computeIfAbsent(K key, Reference2ObjectFunction<? super K, ? extends V> mappingFunction) {
        Objects.requireNonNull(mappingFunction);
        int pos = this.find(key);
        if (pos >= 0) {
            return this.value[pos];
        }
        if (!mappingFunction.containsKey(key)) {
            return (V)this.defRetValue;
        }
        V newValue = mappingFunction.get(key);
        this.insert(-pos - 1, key, newValue);
        return newValue;
    }

    public ReferenceSet<K> keySet() {
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
        int pos = HashCommon.mix((int)System.identityHashCode(k)) & this.mask;
        K curr = key[pos];
        if (curr == null) {
            return defaultValue;
        }
        if (k == curr) {
            return this.value[pos];
        }
        do {
            if ((curr = key[pos = pos + 1 & this.mask]) != null) continue;
            return defaultValue;
        } while (k != curr);
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
        int i = this.n;
        int j = this.realSize();
        while (j-- != 0) {
            while (key[--i] == null) {
            }
            int pos = HashCommon.mix((int)System.identityHashCode(key[i])) & mask;
            if (newKey[pos] != null) {
                while (newKey[pos = pos + 1 & mask] != null) {
                }
            }
            newKey[pos] = key[i];
            newValue[pos] = value[i];
        }
        newValue[newN] = value[this.n];
        this.n = newN;
        this.mask = mask;
        this.maxFill = HashCommon.maxFill((int)this.n, (float)this.f);
        this.key = newKey;
        this.value = newValue;
    }

    public void ensureCapacity(int capacity) {
        int needed = HashCommon.arraySize((int)capacity, (float)this.f);
        if (needed > this.n) {
            this.rehash(needed);
        }
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
                int slot = HashCommon.mix((int)System.identityHashCode(curr)) & this.mask;
                if (last <= pos ? last >= slot || slot > pos : last >= slot && slot > pos) break;
                pos = pos + 1 & this.mask;
            }
            key[last] = curr;
            value[last] = value[pos];
        }
    }

    private void checkTable() {
    }

    private V removeNullEntry() {
        this.containsNullKey = false;
        this.key[this.n] = null;
        V oldValue = this.value[this.n];
        this.value[this.n] = null;
        --this.size;
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

    public Reference2ObjectMap.FastEntrySet<K, V> reference2ObjectEntrySet() {
        if (this.entries == null) {
            this.entries = new MapEntrySet(this, null);
        }
        return this.entries;
    }

    private final class ValueIterator
    extends MapIterator<Consumer<? super V>>
    implements ObjectIterator<V> {
        @Override
        public V next() {
            return Reference2ObjectOpenHashMap.this.value[this.nextEntry()];
        }

        @Override
        final void acceptOnIndex(Consumer<? super V> action, int index) {
            action.accept(Reference2ObjectOpenHashMap.this.value[index]);
        }
    }

    private abstract class MapIterator<ConsumerType> {
        int pos;
        int last;
        int c;
        boolean mustReturnNullKey;
        ReferenceArrayList<K> wrapped;

        private MapIterator() {
            this.pos = Reference2ObjectOpenHashMap.this.n;
            this.last = -1;
            this.c = Reference2ObjectOpenHashMap.this.size;
            this.mustReturnNullKey = Reference2ObjectOpenHashMap.this.containsNullKey;
        }

        public void remove() {
            if (this.last == -1) {
                throw new IllegalStateException();
            }
            if (this.last == Reference2ObjectOpenHashMap.this.n) {
                Reference2ObjectOpenHashMap.this.containsNullKey = false;
                Reference2ObjectOpenHashMap.this.key[Reference2ObjectOpenHashMap.this.n] = null;
                Reference2ObjectOpenHashMap.this.value[Reference2ObjectOpenHashMap.this.n] = null;
            } else if (this.pos >= 0) {
                this.shiftKeys(this.last);
            } else {
                Reference2ObjectOpenHashMap.this.remove(this.wrapped.set(-this.pos - 1, null));
                this.last = -1;
                return;
            }
            --Reference2ObjectOpenHashMap.this.size;
            this.last = -1;
        }

        public void forEachRemaining(ConsumerType action) {
            if (this.mustReturnNullKey) {
                this.mustReturnNullKey = false;
                this.last = Reference2ObjectOpenHashMap.this.n;
                this.acceptOnIndex(action, this.last);
                --this.c;
            }
            K[] key = Reference2ObjectOpenHashMap.this.key;
            while (this.c != 0) {
                if (--this.pos < 0) {
                    this.last = Integer.MIN_VALUE;
                    Object k = this.wrapped.get(-this.pos - 1);
                    int p = HashCommon.mix((int)System.identityHashCode(k)) & Reference2ObjectOpenHashMap.this.mask;
                    while (k != key[p]) {
                        p = p + 1 & Reference2ObjectOpenHashMap.this.mask;
                    }
                    this.acceptOnIndex(action, p);
                    --this.c;
                    continue;
                }
                if (key[this.pos] == null) continue;
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
                this.last = Reference2ObjectOpenHashMap.this.n;
                return this.last;
            }
            K[] key = Reference2ObjectOpenHashMap.this.key;
            do {
                if (--this.pos >= 0) continue;
                this.last = Integer.MIN_VALUE;
                Object k = this.wrapped.get(-this.pos - 1);
                int p = HashCommon.mix((int)System.identityHashCode(k)) & Reference2ObjectOpenHashMap.this.mask;
                while (k != key[p]) {
                    p = p + 1 & Reference2ObjectOpenHashMap.this.mask;
                }
                return p;
            } while (key[this.pos] == null);
            this.last = this.pos;
            return this.last;
        }

        private void shiftKeys(int pos) {
            K[] key = Reference2ObjectOpenHashMap.this.key;
            V[] value = Reference2ObjectOpenHashMap.this.value;
            while (true) {
                Object curr;
                int last = pos;
                pos = last + 1 & Reference2ObjectOpenHashMap.this.mask;
                while (true) {
                    if ((curr = key[pos]) == null) {
                        key[last] = null;
                        value[last] = null;
                        return;
                    }
                    int slot = HashCommon.mix((int)System.identityHashCode(curr)) & Reference2ObjectOpenHashMap.this.mask;
                    if (last <= pos ? last >= slot || slot > pos : last >= slot && slot > pos) break;
                    pos = pos + 1 & Reference2ObjectOpenHashMap.this.mask;
                }
                if (pos < last) {
                    if (this.wrapped == null) {
                        this.wrapped = new ReferenceArrayList(2);
                    }
                    this.wrapped.add(key[pos]);
                }
                key[last] = curr;
                value[last] = value[pos];
            }
        }

        abstract void acceptOnIndex(ConsumerType var1, int var2);
    }
}

