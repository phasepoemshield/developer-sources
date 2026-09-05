/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectCollection
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectIterator
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectSet
 */
package com.viaversion.viaversion.libs.fastutil.ints;

import com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectFunction;
import com.viaversion.viaversion.libs.fastutil.ints.IntSet;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectCollection;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectIterator;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectSet;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public interface Int2ObjectMap<V>
extends Int2ObjectFunction<V>,
Map<Integer, V> {
    @Override
    @Deprecated
    default public V remove(Object key) {
        return Int2ObjectFunction.super.remove(key);
    }

    default public boolean remove(int key, Object value) {
        Object curValue = this.get(key);
        if (!Objects.equals(curValue, value) || curValue == this.defaultReturnValue() && !this.containsKey(key)) {
            return false;
        }
        this.remove(key);
        return true;
    }

    @Override
    public int size();

    @Override
    @Deprecated
    default public V get(Object key) {
        return Int2ObjectFunction.super.get(key);
    }

    @Override
    @Deprecated
    default public V put(Integer key, V value) {
        return Int2ObjectFunction.super.put(key, value);
    }

    @Override
    public ObjectCollection<V> values();

    @Override
    default public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    default public boolean replace(int key, V oldValue, V newValue) {
        Object curValue = this.get(key);
        if (!Objects.equals(curValue, oldValue) || curValue == this.defaultReturnValue() && !this.containsKey(key)) {
            return false;
        }
        this.put(key, newValue);
        return true;
    }

    @Override
    default public V replace(int key, V value) {
        return this.containsKey(key) ? this.put(key, value) : this.defaultReturnValue();
    }

    @Override
    default public V merge(int key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction) {
        V newValue;
        Objects.requireNonNull(remappingFunction);
        Objects.requireNonNull(value);
        Object oldValue = this.get(key);
        V drv = this.defaultReturnValue();
        if (oldValue != drv || this.containsKey(key)) {
            V mergedValue = remappingFunction.apply(oldValue, value);
            if (mergedValue == null) {
                this.remove(key);
                return drv;
            }
            newValue = mergedValue;
        } else {
            newValue = value;
        }
        this.put(key, newValue);
        return newValue;
    }

    @Override
    @Deprecated
    default public ObjectSet<Map.Entry<Integer, V>> entrySet() {
        return this.int2ObjectEntrySet();
    }

    @Override
    default public V putIfAbsent(int key, V value) {
        V drv;
        Object v = this.get(key);
        if (v != (drv = this.defaultReturnValue()) || this.containsKey(key)) {
            return v;
        }
        this.put(key, value);
        return drv;
    }

    @Override
    default public V compute(int key, BiFunction<? super Integer, ? super V, ? extends V> remappingFunction) {
        Objects.requireNonNull(remappingFunction);
        Object oldValue = this.get(key);
        V drv = this.defaultReturnValue();
        boolean contained = oldValue != drv || this.containsKey(key);
        V newValue = remappingFunction.apply(key, contained ? oldValue : null);
        if (newValue == null) {
            if (contained) {
                this.remove(key);
            }
            return drv;
        }
        this.put(key, newValue);
        return newValue;
    }

    @Override
    default public void forEach(BiConsumer<? super Integer, ? super V> consumer) {
        ObjectSet<Entry<V>> entrySet = this.int2ObjectEntrySet();
        Consumer<Entry> wrappingConsumer = entry -> consumer.accept((Integer)entry.getIntKey(), (Object)entry.getValue());
        if (entrySet instanceof FastEntrySet) {
            ((FastEntrySet)entrySet).fastForEach(wrappingConsumer);
        } else {
            entrySet.forEach(wrappingConsumer);
        }
    }

    @Override
    public boolean containsKey(int var1);

    @Override
    @Deprecated
    default public boolean containsKey(Object key) {
        return Int2ObjectFunction.super.containsKey(key);
    }

    default public V computeIfAbsent(int key, Int2ObjectFunction<? extends V> mappingFunction) {
        Objects.requireNonNull(mappingFunction);
        Object v = this.get(key);
        V drv = this.defaultReturnValue();
        if (v != drv || this.containsKey(key)) {
            return v;
        }
        if (!mappingFunction.containsKey(key)) {
            return drv;
        }
        V newValue = mappingFunction.get(key);
        this.put(key, newValue);
        return newValue;
    }

    default public V computeIfAbsent(int key, IntFunction<? extends V> mappingFunction) {
        Objects.requireNonNull(mappingFunction);
        Object v = this.get(key);
        if (v != this.defaultReturnValue() || this.containsKey(key)) {
            return v;
        }
        V newValue = mappingFunction.apply(key);
        this.put(key, newValue);
        return newValue;
    }

    public IntSet keySet();

    @Override
    default public V getOrDefault(int key, V defaultValue) {
        Object v = this.get(key);
        return v != this.defaultReturnValue() || this.containsKey(key) ? v : defaultValue;
    }

    @Override
    @Deprecated
    default public V getOrDefault(Object key, V defaultValue) {
        return Map.super.getOrDefault(key, defaultValue);
    }

    @Override
    default public V computeIfPresent(int key, BiFunction<? super Integer, ? super V, ? extends V> remappingFunction) {
        Objects.requireNonNull(remappingFunction);
        Object oldValue = this.get(key);
        V drv = this.defaultReturnValue();
        if (oldValue == drv && !this.containsKey(key)) {
            return drv;
        }
        V newValue = remappingFunction.apply(key, oldValue);
        if (newValue == null) {
            this.remove(key);
            return drv;
        }
        this.put(key, newValue);
        return newValue;
    }

    @Deprecated
    default public V computeIfAbsentPartial(int key, Int2ObjectFunction<? extends V> mappingFunction) {
        return this.computeIfAbsent(key, mappingFunction);
    }

    public ObjectSet<Entry<V>> int2ObjectEntrySet();

    @Override
    public V defaultReturnValue();

    @Override
    public void defaultReturnValue(V var1);

    public static interface FastEntrySet<V>
    extends ObjectSet<Entry<V>> {
        default public void fastForEach(Consumer<? super Entry<V>> consumer) {
            this.forEach(consumer);
        }

        public ObjectIterator<Entry<V>> fastIterator();
    }

    public static interface Entry<V>
    extends Map.Entry<Integer, V> {
        @Override
        @Deprecated
        default public Integer getKey() {
            return this.getIntKey();
        }

        public int getIntKey();
    }
}

