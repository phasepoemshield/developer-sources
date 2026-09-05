/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.fastutil.objects.AbstractObjectList$ObjectRandomAccessSubList
 *  com.viaversion.viaversion.libs.fastutil.objects.AbstractObjectList$ObjectSubList
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectArrays
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectList
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectListIterator
 */
package com.viaversion.viaversion.libs.fastutil.objects;

import com.viaversion.viaversion.libs.fastutil.Stack;
import com.viaversion.viaversion.libs.fastutil.objects.AbstractObjectCollection;
import com.viaversion.viaversion.libs.fastutil.objects.AbstractObjectList;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectArrays;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectList;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectListIterator;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.function.Consumer;

public abstract class AbstractObjectList<K>
extends AbstractObjectCollection<K>
implements ObjectList<K>,
Stack<K> {
    protected AbstractObjectList() {
    }

    public K remove(int i) {
        throw new UnsupportedOperationException();
    }

    public void size(int size) {
        int i = this.size();
        if (size > i) {
            while (i++ < size) {
                this.add((K)null);
            }
        } else {
            while (i-- != size) {
                this.remove(i);
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof List)) {
            return false;
        }
        List l = (List)o;
        int s = this.size();
        if (s != l.size()) {
            return false;
        }
        ObjectListIterator<K> i1 = this.listIterator();
        ListIterator i2 = l.listIterator();
        while (s-- != 0) {
            if (Objects.equals(i1.next(), i2.next())) continue;
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        ObjectListIterator<K> i = this.iterator();
        int n = this.size();
        boolean first = true;
        s.append("[");
        while (n-- != 0) {
            if (first) {
                first = false;
            } else {
                s.append(", ");
            }
            Object k = i.next();
            if (this == k) {
                s.append("(this list)");
                continue;
            }
            s.append(String.valueOf(k));
        }
        s.append("]");
        return s.toString();
    }

    @Override
    public int hashCode() {
        ObjectListIterator<K> i = this.iterator();
        int h = 1;
        int s = this.size();
        while (s-- != 0) {
            Object k = i.next();
            h = 31 * h + (k == null ? 0 : k.hashCode());
        }
        return h;
    }

    public int compareTo(List<? extends K> l) {
        if (l == this) {
            return 0;
        }
        if (l instanceof ObjectList) {
            ObjectListIterator<K> i1 = this.listIterator();
            ObjectListIterator i2 = ((ObjectList)l).listIterator();
            while (i1.hasNext() && i2.hasNext()) {
                Object e2;
                Object e1 = i1.next();
                int r = ((Comparable)e1).compareTo(e2 = i2.next());
                if (r == 0) continue;
                return r;
            }
            return i2.hasNext() ? -1 : (i1.hasNext() ? 1 : 0);
        }
        ObjectListIterator<K> i1 = this.listIterator();
        ListIterator<K> i2 = l.listIterator();
        while (i1.hasNext() && i2.hasNext()) {
            int r = ((Comparable)i1.next()).compareTo(i2.next());
            if (r == 0) continue;
            return r;
        }
        return i2.hasNext() ? -1 : (i1.hasNext() ? 1 : 0);
    }

    public int indexOf(Object k) {
        ObjectListIterator<K> i = this.listIterator();
        while (i.hasNext()) {
            Object e = i.next();
            if (!Objects.equals(k, e)) continue;
            return i.previousIndex();
        }
        return -1;
    }

    @Override
    public void clear() {
        this.removeElements(0, this.size());
    }

    public int lastIndexOf(Object k) {
        ObjectListIterator<K> i = this.listIterator(this.size());
        while (i.hasPrevious()) {
            Object e = i.previous();
            if (!Objects.equals(k, e)) continue;
            return i.nextIndex();
        }
        return -1;
    }

    public void add(int index, K k) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean add(K k) {
        this.add(this.size(), k);
        return true;
    }

    public ObjectList<K> subList(int from, int to) {
        this.ensureIndex(from);
        this.ensureIndex(to);
        if (from > to) {
            throw new IndexOutOfBoundsException("Start index (" + from + ") is greater than end index (" + to + ")");
        }
        return this instanceof RandomAccess ? new ObjectRandomAccessSubList((ObjectList)this, from, to) : new ObjectSubList((ObjectList)this, from, to);
    }

    @Override
    public <T> T[] toArray(T[] a) {
        int size = this.size();
        if (a.length < size) {
            a = Arrays.copyOf(a, size);
        }
        this.getElements(0, a, 0, size);
        if (a.length > size) {
            a[size] = null;
        }
        return a;
    }

    @Override
    public Object[] toArray() {
        int size = this.size();
        if (size == 0) {
            return ObjectArrays.EMPTY_ARRAY;
        }
        Object[] ret = new Object[size];
        this.getElements(0, ret, 0, size);
        return ret;
    }

    @Override
    public ObjectListIterator<K> iterator() {
        return this.listIterator();
    }

    @Override
    public boolean contains(Object k) {
        return this.indexOf(k) >= 0;
    }

    @Override
    public boolean addAll(Collection<? extends K> c) {
        return this.addAll(this.size(), c);
    }

    public boolean addAll(int index, Collection<? extends K> c) {
        this.ensureIndex(index);
        Iterator<K> i = c.iterator();
        boolean retVal = i.hasNext();
        while (i.hasNext()) {
            this.add(index++, i.next());
        }
        return retVal;
    }

    public K set(int index, K k) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void forEach(Consumer<? super K> action) {
        if (this instanceof RandomAccess) {
            int max = this.size();
            for (int i = 0; i < max; ++i) {
                action.accept(this.get(i));
            }
        } else {
            super.forEach(action);
        }
    }

    @Override
    public K peek(int i) {
        return (K)this.get(this.size() - 1 - i);
    }

    @Override
    public K top() {
        if (this.isEmpty()) {
            throw new NoSuchElementException();
        }
        return (K)this.get(this.size() - 1);
    }

    public ObjectListIterator<K> listIterator() {
        return this.listIterator(0);
    }

    public ObjectListIterator<K> listIterator(int index) {
        this.ensureIndex(index);
        return new /* Unavailable Anonymous Inner Class!! */;
    }

    @Override
    public void push(K o) {
        this.add(o);
    }

    @Override
    public K pop() {
        if (this.isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.remove(this.size() - 1);
    }

    protected void ensureRestrictedIndex(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index (" + index + ") is negative");
        }
        if (index >= this.size()) {
            throw new IndexOutOfBoundsException("Index (" + index + ") is greater than or equal to list size (" + this.size() + ")");
        }
    }

    public void getElements(int from, Object[] a, int offset, int length) {
        this.ensureIndex(from);
        ObjectArrays.ensureOffsetLength((Object[])a, (int)offset, (int)length);
        if (from + length > this.size()) {
            throw new IndexOutOfBoundsException("End index (" + (from + length) + ") is greater than list size (" + this.size() + ")");
        }
        if (this instanceof RandomAccess) {
            int current = from;
            while (length-- != 0) {
                a[offset++] = this.get(current++);
            }
        } else {
            ObjectListIterator<K> i = this.listIterator(from);
            while (length-- != 0) {
                a[offset++] = i.next();
            }
        }
    }

    protected void ensureIndex(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index (" + index + ") is negative");
        }
        if (index > this.size()) {
            throw new IndexOutOfBoundsException("Index (" + index + ") is greater than list size (" + this.size() + ")");
        }
    }

    public void addElements(int index, K[] a, int offset, int length) {
        this.ensureIndex(index);
        ObjectArrays.ensureOffsetLength((Object[])a, (int)offset, (int)length);
        if (this instanceof RandomAccess) {
            while (length-- != 0) {
                this.add(index++, a[offset++]);
            }
        } else {
            ObjectListIterator<K> iter = this.listIterator(index);
            while (length-- != 0) {
                iter.add(a[offset++]);
            }
        }
    }

    public void addElements(int index, K[] a) {
        this.addElements(index, a, 0, a.length);
    }

    public void setElements(int index, K[] a, int offset, int length) {
        this.ensureIndex(index);
        ObjectArrays.ensureOffsetLength((Object[])a, (int)offset, (int)length);
        if (index + length > this.size()) {
            throw new IndexOutOfBoundsException("End index (" + (index + length) + ") is greater than list size (" + this.size() + ")");
        }
        if (this instanceof RandomAccess) {
            for (int i = 0; i < length; ++i) {
                this.set(i + index, a[i + offset]);
            }
        } else {
            ObjectListIterator<K> iter = this.listIterator(index);
            int i = 0;
            while (i < length) {
                iter.next();
                iter.set(a[offset + i++]);
            }
        }
    }

    public void removeElements(int from, int to) {
        this.ensureIndex(to);
        ObjectListIterator<K> i = this.listIterator(from);
        int n = to - from;
        if (n < 0) {
            throw new IllegalArgumentException("Start index (" + from + ") is greater than end index (" + to + ")");
        }
        while (n-- != 0) {
            i.next();
            i.remove();
        }
    }
}

