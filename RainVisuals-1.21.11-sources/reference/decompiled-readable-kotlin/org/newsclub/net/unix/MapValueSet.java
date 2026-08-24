package org.newsclub.net.unix;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.Map.Entry;
import org.eclipse.jdt.annotation.NonNull;

// $VF: Compiled from MapValueSet.java
final class MapValueSet<T, V> implements Set<T> {
   private final V removedSentinel;
   private final MapValueSet.ValueSupplier<@NonNull V> valueSupplier;
   private final Map<T, V> map;

   private boolean isDefinitelyEmpty() {
      return this.getValue().equals(this.removedSentinel);
   }

   public void markRemoved(T elem) {
      if (this.removedSentinel == null) {
         this.map.remove(elem);
      } else {
         this.map.put(elem, this.removedSentinel);
      }
   }

   @Override
   public boolean removeAll(Collection<?> c) {
      if (this.isDefinitelyEmpty()) {
         return false;
      }

      boolean changed = false;

      for (Object obj : c) {
         changed |= this.remove(obj);
      }

      return changed;
   }

   @Override
   public boolean isEmpty() {
      V val = this.getValue();
      if (val.equals(this.removedSentinel)) {
         return true;
      }

      for (Entry<T, V> en : this.map.entrySet()) {
         if (val.equals(en.getValue())) {
            return false;
         }
      }

      return true;
   }

   @Override
   public boolean add(T e) {
      if (this.contains(e)) {
         return false;
      }

      if (this.update(e)) {
         return true;
      }

      this.map.put(e, this.getValue());
      return true;
   }

   @Override
   public Iterator<T> iterator() {
      if (this.isDefinitelyEmpty()) {
         return Collections.emptyIterator();
      }

      final Iterator<Entry<T, V>> mapit = this.map.entrySet().iterator();
      final V val = this.getValue();
      return new Iterator<T>()      // $VF: Compiled from MapValueSet.java
 {
         Entry<T, V> currentObj;
         Entry<T, V> nextObj = null;

         {
            this.currentObj = null;
         }

         @Override
         public boolean hasNext() {
            if (this.nextObj != null) {
               return true;
            }

            while (mapit.hasNext()) {
               Entry<T, V> en = mapit.next();
               if (val.equals(en.getValue())) {
                  this.nextObj = en;
                  return true;
               }
            }

            return false;
         }

         @Override
         public void remove() {
            if (this.currentObj == null) {
               throw new IllegalStateException();
            }

            MapValueSet.this.markRemoved(this.currentObj.getKey());
            this.currentObj = null;
         }

         @Override
         public T next() {
            this.currentObj = null;
            if (this.nextObj == null && !this.hasNext()) {
               throw new NoSuchElementException();
            } else {
               T next = this.nextObj.getKey();
               if (val.equals(this.nextObj.getValue())) {
                  this.currentObj = this.nextObj;
                  this.nextObj = null;
                  return (T)next;
               } else {
                  throw new ConcurrentModificationException();
               }
            }
         }
      };
   }

   private @NonNull V getValue() {
      return Objects.requireNonNull(this.valueSupplier.supplyValue());
   }

   @Override
   public Object[] toArray() {
      return this.toArray(new Object[this.size()]);
   }

   public boolean update(T e) {
      if (this.map.containsKey(e)) {
         this.map.put(e, this.getValue());
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean contains(Object o) {
      return this.isDefinitelyEmpty() ? false : this.getValue().equals(this.map.get(o));
   }

   @Override
   public boolean remove(Object o) {
      if (!this.isDefinitelyEmpty() && this.map.containsKey(o)) {
         this.markRemoved((T)o);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public int size() {
      V val = this.getValue();
      if (val.equals(this.removedSentinel)) {
         return 0;
      }

      int size = 0;

      for (Entry<T, V> en : this.map.entrySet()) {
         if (val.equals(en.getValue())) {
            size++;
         }
      }

      return size;
   }

   public void markAllRemoved() {
      if (this.removedSentinel == null) {
         this.map.clear();
      } else {
         for (Entry<T, V> en : this.map.entrySet()) {
            en.setValue(this.removedSentinel);
         }
      }
   }

   @Override
   public boolean containsAll(Collection<?> c) {
      if (this.isDefinitelyEmpty()) {
         return c.isEmpty();
      }

      for (Object obj : c) {
         if (!this.contains(obj)) {
            return false;
         }
      }

      return true;
   }

   MapValueSet(Map<? extends T, V> removedSentinel, MapValueSet.ValueSupplier<@NonNull V> valueSupplier, V map) {
      this.valueSupplier = Objects.requireNonNull(valueSupplier);
      this.removedSentinel = removedSentinel;
      this.map = (Map<T, V>)map;
   }

   @Override
   public boolean retainAll(Collection<?> c) {
      boolean changed = false;
      Iterator<T> it = this.iterator();

      while (it.hasNext()) {
         T elem = it.next();
         if (!c.contains(elem)) {
            it.remove();
            changed = true;
         }
      }

      return changed;
   }

   @Override
   public void clear() {
      V val = this.getValue();
      if (!val.equals(this.removedSentinel)) {
         for (Entry<T, V> en : this.map.entrySet()) {
            if (val.equals(en.getValue())) {
               this.markRemoved((T)en.getKey());
            }
         }
      }
   }

   @Override
   public <E> E[] toArray(E[] a) {
      int size = this.size();
      if (a.length < size) {
         return (E[])this.toArray((E[])((Object[])Array.newInstance(a.getClass().getComponentType(), size)));
      }

      int i = 0;

      for (T elem : this) {
         a[i++] = (E)elem;
      }

      if (i < a.length) {
         a[i] = null;
      }

      return a;
   }

   @Override
   public boolean addAll(Collection<? extends T> c) {
      boolean changed = false;

      for (T elem : c) {
         changed |= this.add((T)elem);
      }

      return changed;
   }

   // $VF: Compiled from MapValueSet.java
   @FunctionalInterface
   interface ValueSupplier<V> {
      V supplyValue();
   }
}
