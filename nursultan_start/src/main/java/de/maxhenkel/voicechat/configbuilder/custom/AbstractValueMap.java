/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.configbuilder.custom;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class AbstractValueMap<K, V>
implements Map<K, V> {
    protected final Map<K, V> map;

    protected AbstractValueMap(Map<K, V> map) {
        this.map = Collections.unmodifiableMap(new LinkedHashMap<K, V>(map));
    }

    @Override
    public V remove(Object object) {
        return (V)AbstractValueMap.throwException();
    }

    @Override
    public int size() {
        return this.map.size();
    }

    @Override
    public V get(Object object) {
        return this.map.get(object);
    }

    @Override
    public V put(K k, V v) {
        return (V)AbstractValueMap.throwException();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        AbstractValueMap abstractValueMap = (AbstractValueMap)object;
        return this.map.equals(abstractValueMap.map);
    }

    @Override
    public Collection<V> values() {
        return this.map.values();
    }

    @Override
    public int hashCode() {
        return this.map.hashCode();
    }

    @Override
    public void clear() {
        AbstractValueMap.throwException();
    }

    private static <T> T throwException() {
        throw new UnsupportedOperationException("Can't modify config entries");
    }

    @Override
    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        return this.map.entrySet();
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> map) {
        AbstractValueMap.throwException();
    }

    @Override
    public boolean containsKey(Object object) {
        return this.map.containsKey(object);
    }

    @Override
    public Set<K> keySet() {
        return this.map.keySet();
    }

    @Override
    public boolean containsValue(Object object) {
        return this.map.containsValue(object);
    }
}

