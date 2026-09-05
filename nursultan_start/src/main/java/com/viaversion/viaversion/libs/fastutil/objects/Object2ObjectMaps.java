/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.fastutil.objects.Object2ObjectFunctions$EmptyFunction
 *  com.viaversion.viaversion.libs.fastutil.objects.Object2ObjectMaps$1
 *  com.viaversion.viaversion.libs.fastutil.objects.Object2ObjectMaps$Singleton
 *  com.viaversion.viaversion.libs.fastutil.objects.Object2ObjectMaps$SynchronizedMap
 *  com.viaversion.viaversion.libs.fastutil.objects.Object2ObjectMaps$UnmodifiableMap
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectSets
 */
package com.viaversion.viaversion.libs.fastutil.objects;

import com.viaversion.viaversion.libs.fastutil.objects.Object2ObjectFunctions;
import com.viaversion.viaversion.libs.fastutil.objects.Object2ObjectMap;
import com.viaversion.viaversion.libs.fastutil.objects.Object2ObjectMaps;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectCollection;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectIterable;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectIterator;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectSet;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectSets;
import java.io.Serializable;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public final class Object2ObjectMaps {
    public static final EmptyMap EMPTY_MAP = new EmptyMap();

    private Object2ObjectMaps() {
    }

    public static <K, V> ObjectIterator<Object2ObjectMap.Entry<K, V>> fastIterator(Object2ObjectMap<K, V> map) {
        ObjectSet<Object2ObjectMap.Entry<K, V>> entries = map.object2ObjectEntrySet();
        return entries instanceof Object2ObjectMap.FastEntrySet ? ((Object2ObjectMap.FastEntrySet)entries).fastIterator() : entries.iterator();
    }

    public static <K, V> void fastForEach(Object2ObjectMap<K, V> map, Consumer<? super Object2ObjectMap.Entry<K, V>> consumer) {
        ObjectSet<Object2ObjectMap.Entry<K, V>> entries = map.object2ObjectEntrySet();
        if (entries instanceof Object2ObjectMap.FastEntrySet) {
            ((Object2ObjectMap.FastEntrySet)entries).fastForEach(consumer);
        } else {
            entries.forEach(consumer);
        }
    }

    public static <K, V> ObjectIterable<Object2ObjectMap.Entry<K, V>> fastIterable(Object2ObjectMap<K, V> map) {
        1 entries = map.object2ObjectEntrySet();
        return entries instanceof Object2ObjectMap.FastEntrySet ? new /* Unavailable Anonymous Inner Class!! */ : entries;
    }

    public static <K, V> Object2ObjectMap<K, V> emptyMap() {
        return EMPTY_MAP;
    }

    public static <K, V> Object2ObjectMap<K, V> singleton(K key, V value) {
        return new Singleton(key, value);
    }

    public static <K, V> Object2ObjectMap<K, V> synchronize(Object2ObjectMap<K, V> m) {
        return new SynchronizedMap(m);
    }

    public static <K, V> Object2ObjectMap<K, V> synchronize(Object2ObjectMap<K, V> m, Object sync) {
        return new SynchronizedMap(m, sync);
    }

    public static <K, V> Object2ObjectMap<K, V> unmodifiable(Object2ObjectMap<? extends K, ? extends V> m) {
        return new UnmodifiableMap(m);
    }

    public static class EmptyMap<K, V>
    extends Object2ObjectFunctions.EmptyFunction<K, V>
    implements Object2ObjectMap<K, V>,
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

        public Object clone() {
            return EMPTY_MAP;
        }

        @Override
        public boolean isEmpty() {
            return true;
        }

        @Override
        public void putAll(Map<? extends K, ? extends V> m) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void forEach(BiConsumer<? super K, ? super V> consumer) {
        }

        @Override
        public ObjectSet<K> keySet() {
            return ObjectSets.EMPTY_SET;
        }

        @Override
        public boolean containsValue(Object v) {
            return false;
        }

        @Override
        public V getOrDefault(Object key, V defaultValue) {
            return defaultValue;
        }

        @Override
        public ObjectSet<Object2ObjectMap.Entry<K, V>> object2ObjectEntrySet() {
            return ObjectSets.EMPTY_SET;
        }
    }
}

