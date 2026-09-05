/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.fastutil.ints.IntConsumer
 *  com.viaversion.viaversion.libs.fastutil.ints.IntPredicate
 */
package com.viaversion.viaversion.libs.fastutil.ints;

import com.viaversion.viaversion.libs.fastutil.ints.IntArrays;
import com.viaversion.viaversion.libs.fastutil.ints.IntCollection;
import com.viaversion.viaversion.libs.fastutil.ints.IntConsumer;
import com.viaversion.viaversion.libs.fastutil.ints.IntIterator;
import com.viaversion.viaversion.libs.fastutil.ints.IntIterators;
import com.viaversion.viaversion.libs.fastutil.ints.IntPredicate;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public abstract class AbstractIntCollection
extends AbstractCollection<Integer>
implements IntCollection {
    protected AbstractIntCollection() {
    }

    @Override
    @Deprecated
    public boolean remove(Object key) {
        return IntCollection.super.remove(key);
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        Iterator i = this.iterator();
        int n = this.size();
        boolean first = true;
        s.append("{");
        while (n-- != 0) {
            if (first) {
                first = false;
            } else {
                s.append(", ");
            }
            int k = i.nextInt();
            s.append(String.valueOf(k));
        }
        s.append("}");
        return s.toString();
    }

    @Override
    @Deprecated
    public boolean add(Integer key) {
        return IntCollection.super.add(key);
    }

    @Override
    public boolean add(int k) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int[] toArray(int[] a) {
        int size = this.size();
        if (a == null) {
            a = new int[size];
        } else if (a.length < size) {
            a = Arrays.copyOf(a, size);
        }
        IntIterators.unwrap((IntIterator)this.iterator(), a);
        return a;
    }

    @Override
    public abstract IntIterator iterator();

    @Override
    public boolean contains(int k) {
        Iterator iterator = this.iterator();
        while (iterator.hasNext()) {
            if (k != iterator.nextInt()) continue;
            return true;
        }
        return false;
    }

    @Override
    @Deprecated
    public boolean contains(Object key) {
        return IntCollection.super.contains(key);
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        if (c instanceof IntCollection) {
            return this.addAll((IntCollection)c);
        }
        return super.addAll(c);
    }

    @Override
    public boolean addAll(IntCollection c) {
        boolean retVal = false;
        IntIterator i = c.iterator();
        while (i.hasNext()) {
            if (!this.add(i.nextInt())) continue;
            retVal = true;
        }
        return retVal;
    }

    @Override
    public final void forEach(IntConsumer action) {
        IntCollection.super.forEach(action);
    }

    @Override
    public boolean rem(int k) {
        Iterator iterator = this.iterator();
        while (iterator.hasNext()) {
            if (k != iterator.nextInt()) continue;
            iterator.remove();
            return true;
        }
        return false;
    }

    @Override
    public final boolean removeIf(IntPredicate filter) {
        return IntCollection.super.removeIf(filter);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        if (c instanceof IntCollection) {
            return this.removeAll((IntCollection)c);
        }
        return super.removeAll(c);
    }

    @Override
    public boolean removeAll(IntCollection c) {
        boolean retVal = false;
        IntIterator i = c.iterator();
        while (i.hasNext()) {
            if (!this.rem(i.nextInt())) continue;
            retVal = true;
        }
        return retVal;
    }

    @Override
    public boolean retainAll(IntCollection c) {
        boolean retVal = false;
        Iterator i = this.iterator();
        while (i.hasNext()) {
            if (c.contains(i.nextInt())) continue;
            i.remove();
            retVal = true;
        }
        return retVal;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        if (c instanceof IntCollection) {
            return this.retainAll((IntCollection)c);
        }
        return super.retainAll(c);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        if (c instanceof IntCollection) {
            return this.containsAll((IntCollection)c);
        }
        return super.containsAll(c);
    }

    @Override
    public boolean containsAll(IntCollection c) {
        IntIterator i = c.iterator();
        while (i.hasNext()) {
            if (this.contains(i.nextInt())) continue;
            return false;
        }
        return true;
    }

    @Override
    public int[] toIntArray() {
        int size = this.size();
        if (size == 0) {
            return IntArrays.EMPTY_ARRAY;
        }
        int[] a = new int[size];
        IntIterators.unwrap((IntIterator)this.iterator(), a);
        return a;
    }

    @Override
    @Deprecated
    public int[] toIntArray(int[] a) {
        return this.toArray(a);
    }
}

