/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.fastutil.Function
 *  com.viaversion.viaversion.libs.fastutil.bytes.Byte2ObjectFunction
 *  com.viaversion.viaversion.libs.fastutil.bytes.Byte2ReferenceFunction
 *  com.viaversion.viaversion.libs.fastutil.chars.Char2ObjectFunction
 *  com.viaversion.viaversion.libs.fastutil.chars.Char2ReferenceFunction
 *  com.viaversion.viaversion.libs.fastutil.doubles.Double2ObjectFunction
 *  com.viaversion.viaversion.libs.fastutil.doubles.Double2ReferenceFunction
 *  com.viaversion.viaversion.libs.fastutil.floats.Float2ObjectFunction
 *  com.viaversion.viaversion.libs.fastutil.floats.Float2ReferenceFunction
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectFunction
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2ReferenceFunction
 *  com.viaversion.viaversion.libs.fastutil.longs.Long2ObjectFunction
 *  com.viaversion.viaversion.libs.fastutil.longs.Long2ReferenceFunction
 *  com.viaversion.viaversion.libs.fastutil.objects.Object2ByteFunction
 *  com.viaversion.viaversion.libs.fastutil.objects.Object2CharFunction
 *  com.viaversion.viaversion.libs.fastutil.objects.Object2DoubleFunction
 *  com.viaversion.viaversion.libs.fastutil.objects.Object2FloatFunction
 *  com.viaversion.viaversion.libs.fastutil.objects.Object2IntFunction
 *  com.viaversion.viaversion.libs.fastutil.objects.Object2LongFunction
 *  com.viaversion.viaversion.libs.fastutil.objects.Object2ObjectFunction
 *  com.viaversion.viaversion.libs.fastutil.objects.Object2ReferenceFunction
 *  com.viaversion.viaversion.libs.fastutil.objects.Object2ShortFunction
 *  com.viaversion.viaversion.libs.fastutil.objects.Reference2ByteFunction
 *  com.viaversion.viaversion.libs.fastutil.objects.Reference2CharFunction
 *  com.viaversion.viaversion.libs.fastutil.objects.Reference2DoubleFunction
 *  com.viaversion.viaversion.libs.fastutil.objects.Reference2FloatFunction
 *  com.viaversion.viaversion.libs.fastutil.objects.Reference2IntFunction
 *  com.viaversion.viaversion.libs.fastutil.objects.Reference2LongFunction
 *  com.viaversion.viaversion.libs.fastutil.objects.Reference2ReferenceFunction
 *  com.viaversion.viaversion.libs.fastutil.objects.Reference2ShortFunction
 *  com.viaversion.viaversion.libs.fastutil.shorts.Short2ObjectFunction
 *  com.viaversion.viaversion.libs.fastutil.shorts.Short2ReferenceFunction
 */
package com.viaversion.viaversion.libs.fastutil.objects;

import com.viaversion.viaversion.libs.fastutil.Function;
import com.viaversion.viaversion.libs.fastutil.bytes.Byte2ObjectFunction;
import com.viaversion.viaversion.libs.fastutil.bytes.Byte2ReferenceFunction;
import com.viaversion.viaversion.libs.fastutil.chars.Char2ObjectFunction;
import com.viaversion.viaversion.libs.fastutil.chars.Char2ReferenceFunction;
import com.viaversion.viaversion.libs.fastutil.doubles.Double2ObjectFunction;
import com.viaversion.viaversion.libs.fastutil.doubles.Double2ReferenceFunction;
import com.viaversion.viaversion.libs.fastutil.floats.Float2ObjectFunction;
import com.viaversion.viaversion.libs.fastutil.floats.Float2ReferenceFunction;
import com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectFunction;
import com.viaversion.viaversion.libs.fastutil.ints.Int2ReferenceFunction;
import com.viaversion.viaversion.libs.fastutil.longs.Long2ObjectFunction;
import com.viaversion.viaversion.libs.fastutil.longs.Long2ReferenceFunction;
import com.viaversion.viaversion.libs.fastutil.objects.Object2ByteFunction;
import com.viaversion.viaversion.libs.fastutil.objects.Object2CharFunction;
import com.viaversion.viaversion.libs.fastutil.objects.Object2DoubleFunction;
import com.viaversion.viaversion.libs.fastutil.objects.Object2FloatFunction;
import com.viaversion.viaversion.libs.fastutil.objects.Object2IntFunction;
import com.viaversion.viaversion.libs.fastutil.objects.Object2LongFunction;
import com.viaversion.viaversion.libs.fastutil.objects.Object2ObjectFunction;
import com.viaversion.viaversion.libs.fastutil.objects.Object2ReferenceFunction;
import com.viaversion.viaversion.libs.fastutil.objects.Object2ShortFunction;
import com.viaversion.viaversion.libs.fastutil.objects.Reference2ByteFunction;
import com.viaversion.viaversion.libs.fastutil.objects.Reference2CharFunction;
import com.viaversion.viaversion.libs.fastutil.objects.Reference2DoubleFunction;
import com.viaversion.viaversion.libs.fastutil.objects.Reference2FloatFunction;
import com.viaversion.viaversion.libs.fastutil.objects.Reference2IntFunction;
import com.viaversion.viaversion.libs.fastutil.objects.Reference2LongFunction;
import com.viaversion.viaversion.libs.fastutil.objects.Reference2ReferenceFunction;
import com.viaversion.viaversion.libs.fastutil.objects.Reference2ShortFunction;
import com.viaversion.viaversion.libs.fastutil.shorts.Short2ObjectFunction;
import com.viaversion.viaversion.libs.fastutil.shorts.Short2ReferenceFunction;

@FunctionalInterface
public interface Reference2ObjectFunction<K, V>
extends Function<K, V> {
    default public V remove(Object key) {
        throw new UnsupportedOperationException();
    }

    public V get(Object var1);

    default public V put(K key, V value) {
        throw new UnsupportedOperationException();
    }

    default public V getOrDefault(Object key, V defaultValue) {
        V v = this.get(key);
        return v != this.defaultReturnValue() || this.containsKey(key) ? v : defaultValue;
    }

    default public Reference2ByteFunction<K> andThenByte(Object2ByteFunction<V> after) {
        return k -> after.getByte(this.get(k));
    }

    default public Reference2ShortFunction<K> andThenShort(Object2ShortFunction<V> after) {
        return k -> after.getShort(this.get(k));
    }

    default public <T> Reference2ReferenceFunction<K, T> andThenReference(Object2ReferenceFunction<? super V, ? extends T> after) {
        return k -> after.get(this.get(k));
    }

    default public Char2ObjectFunction<V> composeChar(Char2ReferenceFunction<K> before) {
        return k -> this.get(before.get(k));
    }

    default public Float2ObjectFunction<V> composeFloat(Float2ReferenceFunction<K> before) {
        return k -> this.get(before.get(k));
    }

    default public Byte2ObjectFunction<V> composeByte(Byte2ReferenceFunction<K> before) {
        return k -> this.get(before.get(k));
    }

    default public Short2ObjectFunction<V> composeShort(Short2ReferenceFunction<K> before) {
        return k -> this.get(before.get(k));
    }

    default public Reference2CharFunction<K> andThenChar(Object2CharFunction<V> after) {
        return k -> after.getChar(this.get(k));
    }

    default public Reference2LongFunction<K> andThenLong(Object2LongFunction<V> after) {
        return k -> after.getLong(this.get(k));
    }

    default public Long2ObjectFunction<V> composeLong(Long2ReferenceFunction<K> before) {
        return k -> this.get(before.get(k));
    }

    default public <T> Reference2ObjectFunction<K, T> andThenObject(Object2ObjectFunction<? super V, ? extends T> after) {
        return k -> after.get(this.get(k));
    }

    default public <T> Object2ObjectFunction<T, V> composeObject(Object2ReferenceFunction<? super T, ? extends K> before) {
        return k -> this.get(before.get(k));
    }

    default public <T> Reference2ObjectFunction<T, V> composeReference(Reference2ReferenceFunction<? super T, ? extends K> before) {
        return k -> this.get(before.get(k));
    }

    default public Reference2FloatFunction<K> andThenFloat(Object2FloatFunction<V> after) {
        return k -> after.getFloat(this.get(k));
    }

    default public V defaultReturnValue() {
        return null;
    }

    default public void defaultReturnValue(V rv) {
        throw new UnsupportedOperationException();
    }

    default public Double2ObjectFunction<V> composeDouble(Double2ReferenceFunction<K> before) {
        return k -> this.get(before.get(k));
    }

    default public Reference2DoubleFunction<K> andThenDouble(Object2DoubleFunction<V> after) {
        return k -> after.getDouble(this.get(k));
    }

    default public Reference2IntFunction<K> andThenInt(Object2IntFunction<V> after) {
        return k -> after.getInt(this.get(k));
    }

    default public Int2ObjectFunction<V> composeInt(Int2ReferenceFunction<K> before) {
        return k -> this.get(before.get(k));
    }
}

