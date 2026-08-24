package org.freedesktop.dbus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

// $VF: Compiled from DBusMap.java
public class DBusMap<K, V> implements Map<K, V> {
   Object[][] entries;

   @Override
   public int hashCode() {
      return Arrays.deepHashCode(this.entries);
   }

   @Override
   public String toString() {
      return "{" + Arrays.stream(this.entries).map(e -> e[0] + " => " + e[1]).collect(Collectors.joining(",")) + "}";
   }

   @Override
   public Collection<V> values() {
      List<V> l = new ArrayList<>();

      for (Object[] entry : this.entries) {
         l.add((V)entry[1]);
      }

      return l;
   }

   public DBusMap(Object[][] _entries) {
      this.entries = _entries;
   }

   @Override
   public boolean containsKey(Object _key) {
      for (Object[] entry : this.entries) {
         if (Objects.equals(_key, entry[0])) {
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean equals(Object _o) {
      if (null == _o) {
         return false;
      } else {
         return !(_o instanceof Map) ? false : ((Map)_o).entrySet().equals(this.entrySet());
      }
   }

   @Override
   public boolean containsValue(Object _value) {
      for (Object[] entry : this.entries) {
         if (Objects.equals(_value, entry[1])) {
            return true;
         }
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

   @Override
   public Set<K> keySet() {
      Set<K> s = new LinkedHashSet<>();

      for (Object[] entry : this.entries) {
         s.add((K)entry[0]);
      }

      return s;
   }

   @Override
   public Set<java.util.Map.Entry<K, V>> entrySet() {
      Set<java.util.Map.Entry<K, V>> s = new LinkedHashSet<>();

      for (int i = 0; i < this.entries.length; i++) {
         s.add(new DBusMap.Entry(i));
      }

      return s;
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

   @Override
   public V get(Object _key) {
      for (Object[] entry : this.entries) {
         if (_key == entry[0] || _key != null && _key.equals(entry[0])) {
            return (V)entry[1];
         }
      }

      return null;
   }

   // $VF: Compiled from DBusMap.java
   class Entry implements Comparable, java.util.Map.Entry {
      private final int entryPosition;

      Entry(final int this$0) {
         this.entryPosition = _i;
      }

      @Override
      public K getKey() {
         return (K)DBusMap.this.entries[this.entryPosition][0];
      }

      @Override
      public V setValue(V _value) {
         throw new UnsupportedOperationException();
      }

      public int compareTo(DBusMap<K, V>.Entry _e) {
         return this.entryPosition - _e.entryPosition;
      }

      @Override
      public V getValue() {
         return (V)DBusMap.this.entries[this.entryPosition][1];
      }

      @Override
      public boolean equals(Object _o) {
         if (null == _o) {
            return false;
         } else {
            return !(_o instanceof DBusMap.Entry) ? false : this.entryPosition == ((DBusMap.Entry)_o).entryPosition;
         }
      }

      @Override
      public int hashCode() {
         return DBusMap.this.entries[this.entryPosition][0].hashCode();
      }
   }
}
