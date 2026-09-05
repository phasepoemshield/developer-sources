/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.fastutil.ints.IntBinaryOperator
 *  com.viaversion.viaversion.libs.fastutil.objects.Object2IntMaps
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectIterator
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectSet
 */
package com.viaversion.viaversion.libs.fastutil.objects;

import com.viaversion.viaversion.libs.fastutil.ints.IntCollection;
import com.viaversion.viaversion.libs.fastutil.objects.AbstractObject2IntFunction;
import com.viaversion.viaversion.libs.fastutil.objects.Object2IntMap;
import com.viaversion.viaversion.libs.fastutil.objects.Object2IntMaps;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectIterator;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectSet;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.function.IntBinaryOperator;

public abstract class AbstractObject2IntMap<K>
extends AbstractObject2IntFunction<K>
implements Object2IntMap<K>,
Serializable {
    private static final long serialVersionUID = -4940583368468432370L;

    protected AbstractObject2IntMap() {
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
        return this.object2IntEntrySet().containsAll(m.entrySet());
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        ObjectIterator i = Object2IntMaps.fastIterator((Object2IntMap)this);
        int n = this.size();
        boolean first = true;
        s.append("{");
        while (n-- != 0) {
            if (first) {
                first = false;
            } else {
                s.append(", ");
            }
            Object2IntMap.Entry e = (Object2IntMap.Entry)i.next();
            if (this == e.getKey()) {
                s.append("(this map)");
            } else {
                s.append(String.valueOf(e.getKey()));
            }
            s.append("=>");
            s.append(String.valueOf(e.getIntValue()));
        }
        s.append("}");
        return s.toString();
    }

    @Override
    public IntCollection values() {
        return new /* Unavailable Anonymous Inner Class!! */;
    }

    @Override
    public int hashCode() {
        int h = 0;
        int n = this.size();
        ObjectIterator i = Object2IntMaps.fastIterator((Object2IntMap)this);
        while (n-- != 0) {
            h += ((Object2IntMap.Entry)i.next()).hashCode();
        }
        return h;
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public void putAll(Map<? extends K, ? extends Integer> m) {
        if (m instanceof Object2IntMap) {
            ObjectIterator i = Object2IntMaps.fastIterator((Object2IntMap)((Object2IntMap)m));
            while (i.hasNext()) {
                Object2IntMap.Entry e = (Object2IntMap.Entry)i.next();
                this.put(e.getKey(), e.getIntValue());
            }
        } else {
            int n = m.size();
            Iterator<Map.Entry<K, Integer>> i = m.entrySet().iterator();
            while (n-- != 0) {
                Map.Entry<K, Integer> e = i.next();
                this.put(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public boolean containsKey(Object k) {
        ObjectIterator i = this.object2IntEntrySet().iterator();
        while (i.hasNext()) {
            if (((Object2IntMap.Entry)i.next()).getKey() != k) continue;
            return true;
        }
        return false;
    }

    @Override
    public ObjectSet<K> keySet() {
        return new /* Unavailable Anonymous Inner Class!! */;
    }

    @Override
    public boolean containsValue(int v) {
        ObjectIterator i = this.object2IntEntrySet().iterator();
        while (i.hasNext()) {
            if (((Object2IntMap.Entry)i.next()).getIntValue() != v) continue;
            return true;
        }
        return false;
    }

    @Override
    public final int mergeInt(K key, int value, com.viaversion.viaversion.libs.fastutil.ints.IntBinaryOperator remappingFunction) {
        return this.mergeInt(key, value, (IntBinaryOperator)remappingFunction);
    }
}

