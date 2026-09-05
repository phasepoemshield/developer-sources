/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectCollection
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectIterator
 */
package com.viaversion.viaversion.libs.fastutil.ints;

import com.viaversion.viaversion.libs.fastutil.ints.AbstractInt2ObjectFunction;
import com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectMap;
import com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectMaps;
import com.viaversion.viaversion.libs.fastutil.ints.IntSet;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectCollection;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectIterator;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;

public abstract class AbstractInt2ObjectMap<V>
extends AbstractInt2ObjectFunction<V>
implements Int2ObjectMap<V>,
Serializable {
    private static final long serialVersionUID = -4940583368468432370L;

    protected AbstractInt2ObjectMap() {
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Map)) {
            return false;
        }
        Map m = (Map)o;
        if (m.size() != this.size()) {
            return false;
        }
        return this.int2ObjectEntrySet().containsAll(m.entrySet());
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        ObjectIterator i = Int2ObjectMaps.fastIterator(this);
        int n = this.size();
        boolean first = true;
        s.append("{");
        while (n-- != 0) {
            if (first) {
                first = false;
            } else {
                s.append(", ");
            }
            Int2ObjectMap.Entry e = (Int2ObjectMap.Entry)i.next();
            s.append(String.valueOf(e.getIntKey()));
            s.append("=>");
            if (this == e.getValue()) {
                s.append("(this map)");
                continue;
            }
            s.append(String.valueOf(e.getValue()));
        }
        s.append("}");
        return s.toString();
    }

    @Override
    public ObjectCollection<V> values() {
        return new /* Unavailable Anonymous Inner Class!! */;
    }

    @Override
    public int hashCode() {
        int h = 0;
        int n = this.size();
        ObjectIterator i = Int2ObjectMaps.fastIterator(this);
        while (n-- != 0) {
            h += ((Int2ObjectMap.Entry)i.next()).hashCode();
        }
        return h;
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends V> m) {
        if (m instanceof Int2ObjectMap) {
            ObjectIterator i = Int2ObjectMaps.fastIterator((Int2ObjectMap)m);
            while (i.hasNext()) {
                Int2ObjectMap.Entry e = (Int2ObjectMap.Entry)i.next();
                this.put(e.getIntKey(), e.getValue());
            }
        } else {
            int n = m.size();
            Iterator<Map.Entry<Integer, V>> i = m.entrySet().iterator();
            while (n-- != 0) {
                Map.Entry<Integer, V> e = i.next();
                this.put(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public boolean containsKey(int k) {
        ObjectIterator i = this.int2ObjectEntrySet().iterator();
        while (i.hasNext()) {
            if (((Int2ObjectMap.Entry)i.next()).getIntKey() != k) continue;
            return true;
        }
        return false;
    }

    @Override
    public IntSet keySet() {
        return new /* Unavailable Anonymous Inner Class!! */;
    }

    @Override
    public boolean containsValue(Object v) {
        ObjectIterator i = this.int2ObjectEntrySet().iterator();
        while (i.hasNext()) {
            if (((Int2ObjectMap.Entry)i.next()).getValue() != v) continue;
            return true;
        }
        return false;
    }
}

