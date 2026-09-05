/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.fastutil.Size64
 *  com.viaversion.viaversion.libs.fastutil.objects.AbstractObjectList$IndexBasedSpliterator
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectImmutableList
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectLists
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectSpliterator
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectSpliterators
 */
package com.viaversion.viaversion.libs.fastutil.objects;

import com.viaversion.viaversion.libs.fastutil.Size64;
import com.viaversion.viaversion.libs.fastutil.objects.AbstractObjectList;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectArrays;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectCollection;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectImmutableList;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectIterator;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectListIterator;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectLists;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectSpliterator;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectSpliterators;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public interface ObjectList<K>
extends List<K>,
Comparable<List<? extends K>>,
ObjectCollection<K> {
    default public void unstableSort(Comparator<? super K> comparator) {
        Object[] elements = this.toArray();
        if (comparator == null) {
            ObjectArrays.unstableSort(elements);
        } else {
            ObjectArrays.unstableSort(elements, comparator);
        }
        this.setElements(elements);
    }

    public void size(int var1);

    @Override
    public ObjectList<K> subList(int var1, int var2);

    @Override
    public ObjectListIterator<K> iterator();

    @SafeVarargs
    public static <K> ObjectList<K> of(K ... a) {
        switch (a.length) {
            case 0: {
                return ObjectList.of();
            }
            case 1: {
                return ObjectList.of(a[0]);
            }
        }
        return ObjectImmutableList.of((Object[])a);
    }

    public static <K> ObjectList<K> of(K e0, K e1, K e2) {
        return ObjectImmutableList.of((Object[])new Object[]{e0, e1, e2});
    }

    public static <K> ObjectList<K> of(K e) {
        return ObjectLists.singleton(e);
    }

    public static <K> ObjectList<K> of() {
        return ObjectImmutableList.of();
    }

    public static <K> ObjectList<K> of(K e0, K e1) {
        return ObjectImmutableList.of((Object[])new Object[]{e0, e1});
    }

    @Override
    default public ObjectSpliterator<K> spliterator() {
        if (this instanceof RandomAccess) {
            return new AbstractObjectList.IndexBasedSpliterator(this, 0);
        }
        return ObjectSpliterators.asSpliterator((ObjectIterator)this.iterator(), (long)Size64.sizeOf((Collection)this), (int)16464);
    }

    @Override
    default public boolean addAll(ObjectList<? extends K> l) {
        return this.addAll(this.size(), l);
    }

    @Override
    default public boolean addAll(int index, ObjectList<? extends K> l) {
        return this.addAll(index, l);
    }

    @Override
    default public void sort(Comparator<? super K> comparator) {
        Object[] elements = this.toArray();
        if (comparator == null) {
            ObjectArrays.stableSort(elements);
        } else {
            ObjectArrays.stableSort(elements, comparator);
        }
        this.setElements(elements);
    }

    @Override
    public ObjectListIterator<K> listIterator();

    @Override
    public ObjectListIterator<K> listIterator(int var1);

    public void getElements(int var1, Object[] var2, int var3, int var4);

    public void addElements(int var1, K[] var2);

    public void addElements(int var1, K[] var2, int var3, int var4);

    default public void setElements(K[] a) {
        this.setElements(0, a);
    }

    default public void setElements(int index, K[] a, int offset, int length) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index (" + index + ") is negative");
        }
        if (index > this.size()) {
            throw new IndexOutOfBoundsException("Index (" + index + ") is greater than list size (" + this.size() + ")");
        }
        ObjectArrays.ensureOffsetLength(a, offset, length);
        if (index + length > this.size()) {
            throw new IndexOutOfBoundsException("End index (" + (index + length) + ") is greater than list size (" + this.size() + ")");
        }
        ListIterator iter = this.listIterator(index);
        int i = 0;
        while (i < length) {
            iter.next();
            iter.set(a[offset + i++]);
        }
    }

    default public void setElements(int index, K[] a) {
        this.setElements(index, a, 0, a.length);
    }

    public void removeElements(int var1, int var2);
}

