/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.fastutil.objects.Object2ObjectMap
 *  com.viaversion.viaversion.libs.fastutil.objects.Object2ObjectMap$Entry
 *  com.viaversion.viaversion.libs.fastutil.objects.Object2ObjectMaps
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectCollection
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectIterator
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectSet
 */
package com.viaversion.viaversion.libs.fastutil.objects;

import com.viaversion.viaversion.libs.fastutil.objects.AbstractObject2ObjectFunction;
import com.viaversion.viaversion.libs.fastutil.objects.Object2ObjectMap;
import com.viaversion.viaversion.libs.fastutil.objects.Object2ObjectMaps;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectCollection;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectIterator;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectSet;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;

public abstract class AbstractObject2ObjectMap<K, V>
extends AbstractObject2ObjectFunction<K, V>
implements Object2ObjectMap<K, V>,
Serializable {
    private static final long serialVersionUID = -4940583368468432370L;

    protected AbstractObject2ObjectMap() {
    }

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
        return this.object2ObjectEntrySet().containsAll(m.entrySet());
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        ObjectIterator i = Object2ObjectMaps.fastIterator((Object2ObjectMap)this);
        int n = this.size();
        boolean first = true;
        s.append("{");
        while (n-- != 0) {
            if (first) {
                first = false;
            } else {
                s.append(", ");
            }
            Object2ObjectMap.Entry e = (Object2ObjectMap.Entry)i.next();
            if (this == e.getKey()) {
                s.append("(this map)");
            } else {
                s.append(String.valueOf(e.getKey()));
            }
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

    public ObjectCollection<V> values() {
        return new /* Unavailable Anonymous Inner Class!! */;
    }

    public int hashCode() {
        int h = 0;
        int n = this.size();
        ObjectIterator i = Object2ObjectMaps.fastIterator((Object2ObjectMap)this);
        while (n-- != 0) {
            h += ((Object2ObjectMap.Entry)i.next()).hashCode();
        }
        return h;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public void putAll(Map<? extends K, ? extends V> m) {
        if (m instanceof Object2ObjectMap) {
            ObjectIterator i = Object2ObjectMaps.fastIterator((Object2ObjectMap)((Object2ObjectMap)m));
            while (i.hasNext()) {
                Object2ObjectMap.Entry e = (Object2ObjectMap.Entry)i.next();
                this.put(e.getKey(), e.getValue());
            }
        } else {
            int n = m.size();
            Iterator<Map.Entry<K, V>> i = m.entrySet().iterator();
            while (n-- != 0) {
                Map.Entry<K, V> e = i.next();
                this.put(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public boolean containsKey(Object k) {
        ObjectIterator i = this.object2ObjectEntrySet().iterator();
        while (i.hasNext()) {
            if (((Object2ObjectMap.Entry)i.next()).getKey() != k) continue;
            return true;
        }
        return false;
    }

    public ObjectSet<K> keySet() {
        return new /* Unavailable Anonymous Inner Class!! */;
    }

    public boolean containsValue(Object v) {
        ObjectIterator i = this.object2ObjectEntrySet().iterator();
        while (i.hasNext()) {
            if (((Object2ObjectMap.Entry)i.next()).getValue() != v) continue;
            return true;
        }
        return false;
    }
}

