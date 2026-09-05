/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.fastutil.Size64
 *  com.viaversion.viaversion.libs.fastutil.ints.IntSets
 *  com.viaversion.viaversion.libs.fastutil.ints.IntSpliterator
 *  com.viaversion.viaversion.libs.fastutil.ints.IntSpliterators
 */
package com.viaversion.viaversion.libs.fastutil.ints;

import com.viaversion.viaversion.libs.fastutil.Size64;
import com.viaversion.viaversion.libs.fastutil.ints.AbstractIntSet;
import com.viaversion.viaversion.libs.fastutil.ints.IntArraySet;
import com.viaversion.viaversion.libs.fastutil.ints.IntCollection;
import com.viaversion.viaversion.libs.fastutil.ints.IntIterator;
import com.viaversion.viaversion.libs.fastutil.ints.IntOpenHashSet;
import com.viaversion.viaversion.libs.fastutil.ints.IntSets;
import com.viaversion.viaversion.libs.fastutil.ints.IntSpliterator;
import com.viaversion.viaversion.libs.fastutil.ints.IntSpliterators;
import java.util.Collection;
import java.util.Set;

public interface IntSet
extends IntCollection,
Set<Integer> {
    public boolean remove(int var1);

    @Override
    @Deprecated
    default public boolean remove(Object o) {
        return IntCollection.super.remove(o);
    }

    @Override
    @Deprecated
    default public boolean add(Integer o) {
        return IntCollection.super.add(o);
    }

    @Override
    public IntIterator iterator();

    public static IntSet of(int e0, int e1) {
        IntArraySet innerSet = new IntArraySet(2);
        innerSet.add(e0);
        if (!innerSet.add(e1)) {
            throw new IllegalArgumentException("Duplicate element: " + e1);
        }
        return IntSets.unmodifiable((IntSet)innerSet);
    }

    public static IntSet of() {
        return IntSets.UNMODIFIABLE_EMPTY_SET;
    }

    public static IntSet of(int ... a) {
        switch (a.length) {
            case 0: {
                return IntSet.of();
            }
            case 1: {
                return IntSet.of(a[0]);
            }
            case 2: {
                return IntSet.of(a[0], a[1]);
            }
            case 3: {
                return IntSet.of(a[0], a[1], a[2]);
            }
        }
        AbstractIntSet innerSet = a.length <= 4 ? new IntArraySet(a.length) : new IntOpenHashSet(a.length);
        for (int element : a) {
            if (innerSet.add(element)) continue;
            throw new IllegalArgumentException("Duplicate element: " + element);
        }
        return IntSets.unmodifiable((IntSet)innerSet);
    }

    public static IntSet of(int e) {
        return IntSets.singleton((int)e);
    }

    public static IntSet of(int e0, int e1, int e2) {
        IntArraySet innerSet = new IntArraySet(3);
        innerSet.add(e0);
        if (!innerSet.add(e1)) {
            throw new IllegalArgumentException("Duplicate element: " + e1);
        }
        if (!innerSet.add(e2)) {
            throw new IllegalArgumentException("Duplicate element: " + e2);
        }
        return IntSets.unmodifiable((IntSet)innerSet);
    }

    @Override
    @Deprecated
    default public boolean contains(Object o) {
        return IntCollection.super.contains(o);
    }

    @Override
    default public IntSpliterator spliterator() {
        return IntSpliterators.asSpliterator((IntIterator)this.iterator(), (long)Size64.sizeOf((Collection)this), (int)321);
    }

    @Override
    @Deprecated
    default public boolean rem(int k) {
        return this.remove(k);
    }
}

