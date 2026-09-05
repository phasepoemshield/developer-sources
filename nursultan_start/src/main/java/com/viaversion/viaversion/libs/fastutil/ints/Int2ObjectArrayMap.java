/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectArrayMap$EntrySet
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectArrayMap$KeySet
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectArrayMap$ValuesCollection$ValuesSpliterator
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectArrays
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectCollection
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectIterator
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectSpliterator
 */
package com.viaversion.viaversion.libs.fastutil.ints;

import com.viaversion.viaversion.libs.fastutil.ints.AbstractInt2ObjectMap;
import com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectArrayMap;
import com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectMap;
import com.viaversion.viaversion.libs.fastutil.ints.IntArrays;
import com.viaversion.viaversion.libs.fastutil.ints.IntSet;
import com.viaversion.viaversion.libs.fastutil.objects.AbstractObjectCollection;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectArrays;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectCollection;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectIterator;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectSpliterator;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.function.Consumer;

public class Int2ObjectArrayMap<V>
extends AbstractInt2ObjectMap<V>
implements Serializable,
Cloneable {
    private static final long serialVersionUID = 1L;
    protected transient int[] key;
    protected transient Object[] value;
    protected int size;
    protected transient Int2ObjectMap.FastEntrySet<V> entries;
    protected transient IntSet keys;
    protected transient ObjectCollection<V> values;

    static /* synthetic */ int access$000(Int2ObjectArrayMap x0, int x1) {
        return x0.findKey(x1);
    }

    public Int2ObjectArrayMap(Map<? extends Integer, ? extends V> m) {
        this(m.size());
        int i = 0;
        for (Map.Entry<Integer, V> e : m.entrySet()) {
            this.key[i] = e.getKey();
            this.value[i] = e.getValue();
            ++i;
        }
        this.size = i;
    }

    public Int2ObjectArrayMap(int[] key, Object[] value, int size) {
        this.key = key;
        this.value = value;
        this.size = size;
        if (key.length != value.length) {
            throw new IllegalArgumentException("Keys and values have different lengths (" + key.length + ", " + value.length + ")");
        }
        if (size > key.length) {
            throw new IllegalArgumentException("The provided size (" + size + ") is larger than or equal to the backing-arrays size (" + key.length + ")");
        }
    }

    public Int2ObjectArrayMap(int[] key, Object[] value) {
        this.key = key;
        this.value = value;
        this.size = key.length;
        if (key.length != value.length) {
            throw new IllegalArgumentException("Keys and values have different lengths (" + key.length + ", " + value.length + ")");
        }
    }

    public Int2ObjectArrayMap() {
        this.key = IntArrays.EMPTY_ARRAY;
        this.value = ObjectArrays.EMPTY_ARRAY;
    }

    public Int2ObjectArrayMap(int capacity) {
        this.key = new int[capacity];
        this.value = new Object[capacity];
    }

    public Int2ObjectArrayMap(Int2ObjectMap<V> m) {
        this(m.size());
        int i = 0;
        for (Int2ObjectMap.Entry e : m.int2ObjectEntrySet()) {
            this.key[i] = e.getIntKey();
            this.value[i] = e.getValue();
            ++i;
        }
        this.size = i;
    }

    @Override
    public V remove(int k) {
        int oldPos = this.findKey(k);
        if (oldPos == -1) {
            return (V)this.defRetValue;
        }
        Object oldValue = this.value[oldPos];
        int tail = this.size - oldPos - 1;
        System.arraycopy(this.key, oldPos + 1, this.key, oldPos, tail);
        System.arraycopy(this.value, oldPos + 1, this.value, oldPos, tail);
        --this.size;
        this.value[this.size] = null;
        return (V)oldValue;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public V get(int k) {
        int[] key = this.key;
        int i = this.size;
        while (i-- != 0) {
            if (key[i] != k) continue;
            return (V)this.value[i];
        }
        return (V)this.defRetValue;
    }

    @Override
    public V put(int k, V v) {
        int oldKey = this.findKey(k);
        if (oldKey != -1) {
            Object oldValue = this.value[oldKey];
            this.value[oldKey] = v;
            return (V)oldValue;
        }
        if (this.size == this.key.length) {
            int[] newKey = new int[this.size == 0 ? 2 : this.size * 2];
            Object[] newValue = new Object[this.size == 0 ? 2 : this.size * 2];
            int i = this.size;
            while (i-- != 0) {
                newKey[i] = this.key[i];
                newValue[i] = this.value[i];
            }
            this.key = newKey;
            this.value = newValue;
        }
        this.key[this.size] = k;
        this.value[this.size] = v;
        ++this.size;
        return (V)this.defRetValue;
    }

    @Override
    public ObjectCollection<V> values() {
        if (this.values == null) {
            this.values = new ValuesCollection();
        }
        return this.values;
    }

    public Int2ObjectArrayMap<V> clone() {
        Int2ObjectArrayMap c;
        try {
            c = (Int2ObjectArrayMap)super.clone();
        }
        catch (CloneNotSupportedException cantHappen) {
            throw new InternalError();
        }
        c.key = (int[])this.key.clone();
        c.value = (Object[])this.value.clone();
        c.entries = null;
        c.keys = null;
        c.values = null;
        return c;
    }

    @Override
    public void clear() {
        Object[] value = this.value;
        int i = this.size;
        while (i-- != 0) {
            value[i] = null;
        }
        this.size = 0;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {
        s.defaultReadObject();
        this.key = new int[this.size];
        int[] key = this.key;
        this.value = new Object[this.size];
        Object[] value = this.value;
        for (int i = 0; i < this.size; ++i) {
            key[i] = s.readInt();
            value[i] = s.readObject();
        }
    }

    private void writeObject(ObjectOutputStream s) throws IOException {
        s.defaultWriteObject();
        int[] key = this.key;
        Object[] value = this.value;
        int max = this.size;
        for (int i = 0; i < max; ++i) {
            s.writeInt(key[i]);
            s.writeObject(value[i]);
        }
    }

    @Override
    public boolean containsKey(int k) {
        return this.findKey(k) != -1;
    }

    @Override
    public IntSet keySet() {
        if (this.keys == null) {
            this.keys = new KeySet(this, null);
        }
        return this.keys;
    }

    @Override
    public boolean containsValue(Object v) {
        Object[] value = this.value;
        int i = this.size;
        while (i-- != 0) {
            if (!Objects.equals(value[i], v)) continue;
            return true;
        }
        return false;
    }

    private int findKey(int k) {
        int[] key = this.key;
        int i = this.size;
        while (i-- != 0) {
            if (key[i] != k) continue;
            return i;
        }
        return -1;
    }

    public Int2ObjectMap.FastEntrySet<V> int2ObjectEntrySet() {
        if (this.entries == null) {
            this.entries = new EntrySet(this, null);
        }
        return this.entries;
    }

    private final class ValuesCollection
    extends AbstractObjectCollection<V> {
        private ValuesCollection() {
        }

        @Override
        public int size() {
            return Int2ObjectArrayMap.this.size;
        }

        @Override
        public void clear() {
            Int2ObjectArrayMap.this.clear();
        }

        @Override
        public ObjectIterator<V> iterator() {
            return new ObjectIterator<V>(){
                int pos = 0;

                public void remove() {
                    if (this.pos == 0) {
                        throw new IllegalStateException();
                    }
                    int tail = Int2ObjectArrayMap.this.size - this.pos;
                    System.arraycopy(Int2ObjectArrayMap.this.key, this.pos, Int2ObjectArrayMap.this.key, this.pos - 1, tail);
                    System.arraycopy(Int2ObjectArrayMap.this.value, this.pos, Int2ObjectArrayMap.this.value, this.pos - 1, tail);
                    --Int2ObjectArrayMap.this.size;
                    --this.pos;
                    Int2ObjectArrayMap.this.value[Int2ObjectArrayMap.this.size] = null;
                }

                public void forEachRemaining(Consumer<? super V> action) {
                    Object[] value = Int2ObjectArrayMap.this.value;
                    int max = Int2ObjectArrayMap.this.size;
                    while (this.pos < max) {
                        action.accept(value[this.pos++]);
                    }
                }

                public boolean hasNext() {
                    return this.pos < Int2ObjectArrayMap.this.size;
                }

                public V next() {
                    if (!this.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    return Int2ObjectArrayMap.this.value[this.pos++];
                }
            };
        }

        @Override
        public boolean contains(Object v) {
            return Int2ObjectArrayMap.this.containsValue(v);
        }

        @Override
        public ObjectSpliterator<V> spliterator() {
            return new ValuesSpliterator(this, 0, Int2ObjectArrayMap.this.size);
        }

        @Override
        public void forEach(Consumer<? super V> action) {
            Object[] value = Int2ObjectArrayMap.this.value;
            int max = Int2ObjectArrayMap.this.size;
            for (int i = 0; i < max; ++i) {
                action.accept(value[i]);
            }
        }
    }
}

