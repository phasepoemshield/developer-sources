/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectMaps$1
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectMaps$Singleton
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectMaps$SynchronizedMap
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectMaps$UnmodifiableMap
 *  com.viaversion.viaversion.libs.fastutil.ints.IntSets
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectCollection
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectIterable
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectIterator
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectSet
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectSets
 */
package com.viaversion.viaversion.libs.fastutil.ints;

import com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectFunctions;
import com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectMap;
import com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectMaps;
import com.viaversion.viaversion.libs.fastutil.ints.IntSet;
import com.viaversion.viaversion.libs.fastutil.ints.IntSets;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectCollection;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectIterable;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectIterator;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectSet;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectSets;
import java.io.Serializable;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public final class Int2ObjectMaps {
    public static final EmptyMap EMPTY_MAP = new EmptyMap();

    private Int2ObjectMaps() {
    }

    public static <V> ObjectIterator<Int2ObjectMap.Entry<V>> fastIterator(Int2ObjectMap<V> map) {
        ObjectSet<Int2ObjectMap.Entry<V>> entries = map.int2ObjectEntrySet();
        return entries instanceof Int2ObjectMap.FastEntrySet ? ((Int2ObjectMap.FastEntrySet)entries).fastIterator() : entries.iterator();
    }

    public static <V> void fastForEach(Int2ObjectMap<V> map, Consumer<? super Int2ObjectMap.Entry<V>> consumer) {
        ObjectSet<Int2ObjectMap.Entry<V>> entries = map.int2ObjectEntrySet();
        if (entries instanceof Int2ObjectMap.FastEntrySet) {
            ((Int2ObjectMap.FastEntrySet)entries).fastForEach(consumer);
        } else {
            entries.forEach(consumer);
        }
    }

    public static <V> ObjectIterable<Int2ObjectMap.Entry<V>> fastIterable(Int2ObjectMap<V> map) {
        1 entries = map.int2ObjectEntrySet();
        return entries instanceof Int2ObjectMap.FastEntrySet ? new /* Unavailable Anonymous Inner Class!! */ : entries;
    }

    public static <V> Int2ObjectMap<V> emptyMap() {
        return EMPTY_MAP;
    }

    public static <V> Int2ObjectMap<V> singleton(int key, V value) {
        return new Singleton(key, value);
    }

    public static <V> Int2ObjectMap<V> singleton(Integer key, V value) {
        return new Singleton(key.intValue(), value);
    }

    public static <V> Int2ObjectMap<V> synchronize(Int2ObjectMap<V> m) {
        return new SynchronizedMap(m);
    }

    public static <V> Int2ObjectMap<V> synchronize(Int2ObjectMap<V> m, Object sync) {
        return new SynchronizedMap(m, sync);
    }

    public static <V> Int2ObjectMap<V> unmodifiable(Int2ObjectMap<? extends V> m) {
        return new UnmodifiableMap(m);
    }

    public static class EmptyMap<V>
    extends Int2ObjectFunctions.EmptyFunction<V>
    implements Int2ObjectMap<V>,
    Serializable,
    Cloneable {
        private static final long serialVersionUID = -7046029254386353129L;

        protected EmptyMap() {
        }

        @Override
        public boolean equals(Object o) {
            if (!(o instanceof Map)) {
                return false;
            }
            return ((Map)o).isEmpty();
        }

        @Override
        public String toString() {
            return "{}";
        }

        @Override
        public ObjectCollection<V> values() {
            return ObjectSets.EMPTY_SET;
        }

        @Override
        public int hashCode() {
            return 0;
        }

        @Override
        public Object clone() {
            return EMPTY_MAP;
        }

        @Override
        public boolean isEmpty() {
            return true;
        }

        @Override
        public void putAll(Map<? extends Integer, ? extends V> m) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void forEach(BiConsumer<? super Integer, ? super V> consumer) {
        }

        @Override
        public IntSet keySet() {
            return IntSets.EMPTY_SET;
        }

        @Override
        public boolean containsValue(Object v) {
            return false;
        }

        @Override
        public V getOrDefault(int key, V defaultValue) {
            return defaultValue;
        }

        @Override
        @Deprecated
        public V getOrDefault(Object key, V defaultValue) {
            return defaultValue;
        }

        @Override
        public ObjectSet<Int2ObjectMap.Entry<V>> int2ObjectEntrySet() {
            return ObjectSets.EMPTY_SET;
        }
    }
}

