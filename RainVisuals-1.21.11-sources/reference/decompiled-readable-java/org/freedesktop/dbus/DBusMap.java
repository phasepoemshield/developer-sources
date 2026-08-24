/*
 * Decompiled with CFR 0.152.
 */
package org.freedesktop.dbus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class DBusMap<K, V>
implements Map<K, V> {
    Object[][] entries;

    @Override
    public int hashCode() {
        return Arrays.deepHashCode((Object[])this.entries);
    }

    public String toString() {
        return "{" + Arrays.stream(this.entries).map(e -> String.valueOf(e[0]) + " => " + String.valueOf(e[1])).collect(Collectors.joining(",")) + "}";
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public Collection<V> values() {
        void var1_1;
        ArrayList<Object> l = new ArrayList<Object>();
        Object[][] objectArray = this.entries;
        int n = objectArray.length;
        for (int i = 0; i < n; ++i) {
            Object[] entry = objectArray[i];
            l.add(entry[1]);
        }
        return var1_1;
    }

    public DBusMap(Object[][] _entries) {
        this.entries = _entries;
    }

    @Override
    public boolean containsKey(Object _key) {
        Object[][] objectArray = this.entries;
        int n = objectArray.length;
        for (int i = 0; i < n; ++i) {
            Object[] entry = objectArray[i];
            if (!Objects.equals(_key, entry[0])) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object _o) {
        if (null == _o) {
            return false;
        }
        if (!(_o instanceof Map)) {
            return false;
        }
        return ((Map)_o).entrySet().equals(this.entrySet());
    }

    @Override
    public boolean containsValue(Object _value) {
        Object[][] objectArray = this.entries;
        int n = objectArray.length;
        for (int i = 0; i < n; ++i) {
            Object[] entry = objectArray[i];
            if (!Objects.equals(_value, entry[1])) continue;
            return true;
        }
        return false;
    }

    @Override
    public V remove(Object _key) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isEmpty() {
        return this.entries.length == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public Set<K> keySet() {
        void var1_1;
        LinkedHashSet<Object> s = new LinkedHashSet<Object>();
        Object[][] objectArray = this.entries;
        int n = objectArray.length;
        for (int i = 0; i < n; ++i) {
            Object[] entry = objectArray[i];
            s.add(entry[0]);
        }
        return var1_1;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        void var1_1;
        LinkedHashSet<Entry> s = new LinkedHashSet<Entry>();
        for (int i = 0; i < this.entries.length; ++i) {
            s.add(new Entry(i));
        }
        return var1_1;
    }

    @Override
    public int size() {
        return this.entries.length;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> _t) {
        throw new UnsupportedOperationException();
    }

    @Override
    public V put(K _key, V _value) {
        throw new UnsupportedOperationException();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public V get(Object _key) {
        Object[][] objectArray = this.entries;
        int n = objectArray.length;
        for (int i = 0; i < n; ++i) {
            void var5_5;
            Object[] entry = objectArray[i];
            if (_key != entry[0]) {
                if (_key == null) continue;
                if (!_key.equals(entry[0])) continue;
            }
            return var5_5[1];
        }
        return null;
    }

    class Entry
    implements Map.Entry<K, V>,
    Comparable<Entry> {
        private final int entryPosition;

        Entry(int _i) {
            this.entryPosition = _i;
        }

        @Override
        public K getKey() {
            return DBusMap.this.entries[this.entryPosition][0];
        }

        @Override
        public V setValue(V _value) {
            throw new UnsupportedOperationException();
        }

        @Override
        public int compareTo(Entry _e) {
            return this.entryPosition - _e.entryPosition;
        }

        @Override
        public V getValue() {
            return DBusMap.this.entries[this.entryPosition][1];
        }

        @Override
        public boolean equals(Object _o) {
            if (null == _o) {
                return false;
            }
            if (!(_o instanceof Entry)) {
                return false;
            }
            return this.entryPosition == ((Entry)_o).entryPosition;
        }

        @Override
        public int hashCode() {
            return DBusMap.this.entries[this.entryPosition][0].hashCode();
        }
    }
}

