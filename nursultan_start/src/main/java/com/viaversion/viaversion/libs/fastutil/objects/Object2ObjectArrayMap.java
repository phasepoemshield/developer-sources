/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.fastutil.objects.Object2ObjectArrayMap$EntrySet
 *  com.viaversion.viaversion.libs.fastutil.objects.Object2ObjectArrayMap$KeySet
 *  com.viaversion.viaversion.libs.fastutil.objects.Object2ObjectArrayMap$ValuesCollection
 *  com.viaversion.viaversion.libs.fastutil.objects.Object2ObjectMap
 *  com.viaversion.viaversion.libs.fastutil.objects.Object2ObjectMap$Entry
 *  com.viaversion.viaversion.libs.fastutil.objects.Object2ObjectMap$FastEntrySet
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectArrays
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectCollection
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectSet
 */
package com.viaversion.viaversion.libs.fastutil.objects;

import com.viaversion.viaversion.libs.fastutil.objects.AbstractObject2ObjectMap;
import com.viaversion.viaversion.libs.fastutil.objects.Object2ObjectArrayMap;
import com.viaversion.viaversion.libs.fastutil.objects.Object2ObjectMap;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectArrays;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectCollection;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectSet;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;
import java.util.Objects;

public class Object2ObjectArrayMap<K, V>
extends AbstractObject2ObjectMap<K, V>
implements Serializable,
Cloneable {
    private static final long serialVersionUID = 1L;
    protected transient Object[] key;
    protected transient Object[] value;
    protected int size;
    protected transient Object2ObjectMap.FastEntrySet<K, V> entries;
    protected transient ObjectSet<K> keys;
    protected transient ObjectCollection<V> values;

    static /* synthetic */ int access$000(Object2ObjectArrayMap x0, Object x1) {
        return x0.findKey(x1);
    }

    public Object2ObjectArrayMap(Map<? extends K, ? extends V> m) {
        this(m.size());
        int i = 0;
        for (Map.Entry<K, V> e : m.entrySet()) {
            this.key[i] = e.getKey();
            this.value[i] = e.getValue();
            ++i;
        }
        this.size = i;
    }

    public Object2ObjectArrayMap(Object[] key, Object[] value, int size) {
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

    public Object2ObjectArrayMap(Object[] key, Object[] value) {
        this.key = key;
        this.value = value;
        this.size = key.length;
        if (key.length != value.length) {
            throw new IllegalArgumentException("Keys and values have different lengths (" + key.length + ", " + value.length + ")");
        }
    }

    public Object2ObjectArrayMap() {
        this.key = ObjectArrays.EMPTY_ARRAY;
        this.value = ObjectArrays.EMPTY_ARRAY;
    }

    public Object2ObjectArrayMap(int capacity) {
        this.key = new Object[capacity];
        this.value = new Object[capacity];
    }

    public Object2ObjectArrayMap(Object2ObjectMap<K, V> m) {
        this(m.size());
        int i = 0;
        for (Object2ObjectMap.Entry e : m.object2ObjectEntrySet()) {
            this.key[i] = e.getKey();
            this.value[i] = e.getValue();
            ++i;
        }
        this.size = i;
    }

    @Override
    public V remove(Object k) {
        int oldPos = this.findKey(k);
        if (oldPos == -1) {
            return (V)this.defRetValue;
        }
        Object oldValue = this.value[oldPos];
        int tail = this.size - oldPos - 1;
        System.arraycopy(this.key, oldPos + 1, this.key, oldPos, tail);
        System.arraycopy(this.value, oldPos + 1, this.value, oldPos, tail);
        --this.size;
        this.key[this.size] = null;
        this.value[this.size] = null;
        return (V)oldValue;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public V get(Object k) {
        Object[] key = this.key;
        int i = this.size;
        while (i-- != 0) {
            if (!Objects.equals(key[i], k)) continue;
            return (V)this.value[i];
        }
        return (V)this.defRetValue;
    }

    @Override
    public V put(K k, V v) {
        int oldKey = this.findKey(k);
        if (oldKey != -1) {
            Object oldValue = this.value[oldKey];
            this.value[oldKey] = v;
            return (V)oldValue;
        }
        if (this.size == this.key.length) {
            Object[] newKey = new Object[this.size == 0 ? 2 : this.size * 2];
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
            this.values = new ValuesCollection(this, null);
        }
        return this.values;
    }

    public Object2ObjectArrayMap<K, V> clone() {
        Object2ObjectArrayMap c;
        try {
            c = (Object2ObjectArrayMap)super.clone();
        }
        catch (CloneNotSupportedException cantHappen) {
            throw new InternalError();
        }
        c.key = (Object[])this.key.clone();
        c.value = (Object[])this.value.clone();
        c.entries = null;
        c.keys = null;
        c.values = null;
        return c;
    }

    @Override
    public void clear() {
        Object[] key = this.key;
        Object[] value = this.value;
        int i = this.size;
        while (i-- != 0) {
            key[i] = null;
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
        this.key = new Object[this.size];
        Object[] key = this.key;
        this.value = new Object[this.size];
        Object[] value = this.value;
        for (int i = 0; i < this.size; ++i) {
            key[i] = s.readObject();
            value[i] = s.readObject();
        }
    }

    private void writeObject(ObjectOutputStream s) throws IOException {
        s.defaultWriteObject();
        Object[] key = this.key;
        Object[] value = this.value;
        int max = this.size;
        for (int i = 0; i < max; ++i) {
            s.writeObject(key[i]);
            s.writeObject(value[i]);
        }
    }

    @Override
    public boolean containsKey(Object k) {
        return this.findKey(k) != -1;
    }

    @Override
    public ObjectSet<K> keySet() {
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

    private int findKey(Object k) {
        Object[] key = this.key;
        int i = this.size;
        while (i-- != 0) {
            if (!Objects.equals(key[i], k)) continue;
            return i;
        }
        return -1;
    }

    public Object2ObjectMap.FastEntrySet<K, V> object2ObjectEntrySet() {
        if (this.entries == null) {
            this.entries = new EntrySet(this, null);
        }
        return this.entries;
    }
}

