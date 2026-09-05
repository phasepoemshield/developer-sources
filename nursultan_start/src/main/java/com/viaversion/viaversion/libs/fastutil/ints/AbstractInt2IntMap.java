/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2IntMaps
 *  com.viaversion.viaversion.libs.fastutil.ints.IntBinaryOperator
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectIterator
 */
package com.viaversion.viaversion.libs.fastutil.ints;

import com.viaversion.viaversion.libs.fastutil.ints.AbstractInt2IntFunction;
import com.viaversion.viaversion.libs.fastutil.ints.Int2IntMap;
import com.viaversion.viaversion.libs.fastutil.ints.Int2IntMaps;
import com.viaversion.viaversion.libs.fastutil.ints.IntBinaryOperator;
import com.viaversion.viaversion.libs.fastutil.ints.IntCollection;
import com.viaversion.viaversion.libs.fastutil.ints.IntSet;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectIterator;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;

public abstract class AbstractInt2IntMap
extends AbstractInt2IntFunction
implements Int2IntMap,
Serializable {
    private static final long serialVersionUID = -4940583368468432370L;

    protected AbstractInt2IntMap() {
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
        return this.int2IntEntrySet().containsAll(m.entrySet());
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        ObjectIterator i = Int2IntMaps.fastIterator((Int2IntMap)this);
        int n = this.size();
        boolean first = true;
        s.append("{");
        while (n-- != 0) {
            if (first) {
                first = false;
            } else {
                s.append(", ");
            }
            Int2IntMap.Entry e = (Int2IntMap.Entry)i.next();
            s.append(String.valueOf(e.getIntKey()));
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
        ObjectIterator i = Int2IntMaps.fastIterator((Int2IntMap)this);
        while (n-- != 0) {
            h += ((Int2IntMap.Entry)i.next()).hashCode();
        }
        return h;
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Integer> m) {
        if (m instanceof Int2IntMap) {
            ObjectIterator i = Int2IntMaps.fastIterator((Int2IntMap)((Int2IntMap)m));
            while (i.hasNext()) {
                Int2IntMap.Entry e = (Int2IntMap.Entry)i.next();
                this.put(e.getIntKey(), e.getIntValue());
            }
        } else {
            int n = m.size();
            Iterator<Map.Entry<? extends Integer, ? extends Integer>> i = m.entrySet().iterator();
            while (n-- != 0) {
                Map.Entry<? extends Integer, ? extends Integer> e = i.next();
                this.put(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public boolean containsKey(int k) {
        ObjectIterator i = this.int2IntEntrySet().iterator();
        while (i.hasNext()) {
            if (((Int2IntMap.Entry)i.next()).getIntKey() != k) continue;
            return true;
        }
        return false;
    }

    @Override
    public IntSet keySet() {
        return new /* Unavailable Anonymous Inner Class!! */;
    }

    @Override
    public boolean containsValue(int v) {
        ObjectIterator i = this.int2IntEntrySet().iterator();
        while (i.hasNext()) {
            if (((Int2IntMap.Entry)i.next()).getIntValue() != v) continue;
            return true;
        }
        return false;
    }

    @Override
    public final int mergeInt(int key, int value, IntBinaryOperator remappingFunction) {
        return this.mergeInt(key, value, (java.util.function.IntBinaryOperator)remappingFunction);
    }
}

