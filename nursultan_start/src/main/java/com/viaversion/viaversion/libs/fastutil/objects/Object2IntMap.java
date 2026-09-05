/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.fastutil.ints.IntBinaryOperator
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectIterator
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectSet
 */
package com.viaversion.viaversion.libs.fastutil.objects;

import com.viaversion.viaversion.libs.fastutil.ints.IntCollection;
import com.viaversion.viaversion.libs.fastutil.objects.Object2IntFunction;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectIterator;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectSet;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.ToIntFunction;

public interface Object2IntMap<K>
extends Object2IntFunction<K>,
Map<K, Integer> {
    @Override
    @Deprecated
    default public boolean remove(Object key, Object value) {
        return Map.super.remove(key, value);
    }

    @Override
    @Deprecated
    default public Integer remove(Object key) {
        return Object2IntFunction.super.remove(key);
    }

    default public boolean remove(Object key, int value) {
        int curValue = this.getInt(key);
        if (curValue != value || curValue == this.defaultReturnValue() && !this.containsKey(key)) {
            return false;
        }
        this.removeInt(key);
        return true;
    }

    @Override
    public int size();

    @Override
    @Deprecated
    default public Integer get(Object key) {
        return Object2IntFunction.super.get(key);
    }

    @Override
    @Deprecated
    default public Integer put(K key, Integer value) {
        return Object2IntFunction.super.put(key, value);
    }

    public IntCollection values();

    @Override
    default public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    default public int replace(K key, int value) {
        return this.containsKey(key) ? this.put(key, value) : this.defaultReturnValue();
    }

    @Override
    default public boolean replace(K key, int oldValue, int newValue) {
        int curValue = this.getInt(key);
        if (curValue != oldValue || curValue == this.defaultReturnValue() && !this.containsKey(key)) {
            return false;
        }
        this.put(key, newValue);
        return true;
    }

    @Override
    @Deprecated
    default public Integer replace(K key, Integer value) {
        return Map.super.replace(key, value);
    }

    @Override
    @Deprecated
    default public boolean replace(K key, Integer oldValue, Integer newValue) {
        return Map.super.replace(key, oldValue, newValue);
    }

    @Override
    @Deprecated
    default public Integer merge(K key, Integer value, BiFunction<? super Integer, ? super Integer, ? extends Integer> remappingFunction) {
        return Map.super.merge(key, value, remappingFunction);
    }

    @Override
    default public int merge(K key, int value, BiFunction<? super Integer, ? super Integer, ? extends Integer> remappingFunction) {
        int newValue;
        Objects.requireNonNull(remappingFunction);
        int oldValue = this.getInt(key);
        int drv = this.defaultReturnValue();
        if (oldValue != drv || this.containsKey(key)) {
            Integer mergedValue = remappingFunction.apply((Integer)oldValue, (Integer)value);
            if (mergedValue == null) {
                this.removeInt(key);
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
    default public ObjectSet<Map.Entry<K, Integer>> entrySet() {
        return this.object2IntEntrySet();
    }

    @Override
    default public int putIfAbsent(K key, int value) {
        int drv;
        int v = this.getInt(key);
        if (v != (drv = this.defaultReturnValue()) || this.containsKey(key)) {
            return v;
        }
        this.put(key, value);
        return drv;
    }

    @Override
    @Deprecated
    default public Integer putIfAbsent(K key, Integer value) {
        return Map.super.putIfAbsent(key, value);
    }

    @Override
    default public void forEach(BiConsumer<? super K, ? super Integer> consumer) {
        ObjectSet<Entry<K>> entrySet = this.object2IntEntrySet();
        Consumer<Entry> wrappingConsumer = entry -> consumer.accept((Object)entry.getKey(), (Integer)entry.getIntValue());
        if (entrySet instanceof FastEntrySet) {
            ((FastEntrySet)entrySet).fastForEach(wrappingConsumer);
        } else {
            entrySet.forEach(wrappingConsumer);
        }
    }

    @Override
    public boolean containsKey(Object var1);

    default public int computeIfAbsent(K key, ToIntFunction<? super K> mappingFunction) {
        Objects.requireNonNull(mappingFunction);
        int v = this.getInt(key);
        if (v != this.defaultReturnValue() || this.containsKey(key)) {
            return v;
        }
        int newValue = mappingFunction.applyAsInt(key);
        this.put(key, newValue);
        return newValue;
    }

    default public int computeIfAbsent(K key, Object2IntFunction<? super K> mappingFunction) {
        Objects.requireNonNull(mappingFunction);
        int v = this.getInt(key);
        int drv = this.defaultReturnValue();
        if (v != drv || this.containsKey(key)) {
            return v;
        }
        if (!mappingFunction.containsKey(key)) {
            return drv;
        }
        int newValue = mappingFunction.getInt(key);
        this.put(key, newValue);
        return newValue;
    }

    @Override
    public ObjectSet<K> keySet();

    @Override
    @Deprecated
    default public boolean containsValue(Object value) {
        return value == null ? false : this.containsValue((Integer)value);
    }

    public boolean containsValue(int var1);

    @Override
    default public int getOrDefault(Object key, int defaultValue) {
        int v = this.getInt(key);
        return v != this.defaultReturnValue() || this.containsKey(key) ? v : defaultValue;
    }

    @Override
    @Deprecated
    default public Integer getOrDefault(Object key, Integer defaultValue) {
        return Map.super.getOrDefault(key, defaultValue);
    }

    default public int computeInt(K key, BiFunction<? super K, ? super Integer, ? extends Integer> remappingFunction) {
        Objects.requireNonNull(remappingFunction);
        int oldValue = this.getInt(key);
        int drv = this.defaultReturnValue();
        boolean contained = oldValue != drv || this.containsKey(key);
        Integer newValue = remappingFunction.apply(key, contained ? Integer.valueOf(oldValue) : null);
        if (newValue == null) {
            if (contained) {
                this.removeInt(key);
            }
            return drv;
        }
        int newVal = newValue;
        this.put(key, newVal);
        return newVal;
    }

    @Deprecated
    default public int mergeInt(K key, int value, BiFunction<? super Integer, ? super Integer, ? extends Integer> remappingFunction) {
        return this.merge(key, value, remappingFunction);
    }

    default public int mergeInt(K key, int value, IntBinaryOperator remappingFunction) {
        Objects.requireNonNull(remappingFunction);
        int oldValue = this.getInt(key);
        int drv = this.defaultReturnValue();
        int newValue = oldValue != drv || this.containsKey(key) ? remappingFunction.applyAsInt(oldValue, value) : value;
        this.put(key, newValue);
        return newValue;
    }

    default public int mergeInt(K key, int value, com.viaversion.viaversion.libs.fastutil.ints.IntBinaryOperator remappingFunction) {
        return this.mergeInt(key, value, (IntBinaryOperator)remappingFunction);
    }

    @Deprecated
    default public int computeIntIfAbsentPartial(K key, Object2IntFunction<? super K> mappingFunction) {
        return this.computeIfAbsent(key, mappingFunction);
    }

    default public int computeIntIfPresent(K key, BiFunction<? super K, ? super Integer, ? extends Integer> remappingFunction) {
        Objects.requireNonNull(remappingFunction);
        int oldValue = this.getInt(key);
        int drv = this.defaultReturnValue();
        if (oldValue == drv && !this.containsKey(key)) {
            return drv;
        }
        Integer newValue = remappingFunction.apply(key, oldValue);
        if (newValue == null) {
            this.removeInt(key);
            return drv;
        }
        int newVal = newValue;
        this.put(key, newVal);
        return newVal;
    }

    @Deprecated
    default public int computeIntIfAbsent(K key, ToIntFunction<? super K> mappingFunction) {
        return this.computeIfAbsent(key, mappingFunction);
    }

    public ObjectSet<Entry<K>> object2IntEntrySet();

    @Override
    public void defaultReturnValue(int var1);

    @Override
    public int defaultReturnValue();

    public static interface FastEntrySet<K>
    extends ObjectSet<Entry<K>> {
        default public void fastForEach(Consumer<? super Entry<K>> consumer) {
            this.forEach(consumer);
        }

        public ObjectIterator<Entry<K>> fastIterator();
    }

    public static interface Entry<K>
    extends Map.Entry<K, Integer> {
        @Override
        @Deprecated
        default public Integer getValue() {
            return this.getIntValue();
        }

        @Override
        @Deprecated
        default public Integer setValue(Integer value) {
            return this.setValue((int)value);
        }

        @Override
        public int setValue(int var1);

        public int getIntValue();
    }
}

