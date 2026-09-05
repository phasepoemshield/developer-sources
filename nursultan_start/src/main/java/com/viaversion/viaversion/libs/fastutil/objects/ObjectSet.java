/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.fastutil.Size64
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectArraySet
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectSets
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectSpliterator
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectSpliterators
 */
package com.viaversion.viaversion.libs.fastutil.objects;

import com.viaversion.viaversion.libs.fastutil.Size64;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectArraySet;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectCollection;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectIterator;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectOpenHashSet;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectSets;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectSpliterator;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectSpliterators;
import java.util.Collection;
import java.util.Set;

public interface ObjectSet<K>
extends ObjectCollection<K>,
Set<K> {
    @Override
    public ObjectIterator<K> iterator();

    public static <K> ObjectSet<K> of(K e0, K e1) {
        ObjectArraySet innerSet = new ObjectArraySet(2);
        innerSet.add(e0);
        if (!innerSet.add(e1)) {
            throw new IllegalArgumentException("Duplicate element: " + e1);
        }
        return ObjectSets.unmodifiable((ObjectSet)innerSet);
    }

    @SafeVarargs
    public static <K> ObjectSet<K> of(K ... a) {
        switch (a.length) {
            case 0: {
                return ObjectSet.of();
            }
            case 1: {
                return ObjectSet.of(a[0]);
            }
            case 2: {
                return ObjectSet.of(a[0], a[1]);
            }
            case 3: {
                return ObjectSet.of(a[0], a[1], a[2]);
            }
        }
        Object innerSet = a.length <= 4 ? new ObjectArraySet(a.length) : new ObjectOpenHashSet(a.length);
        for (K element : a) {
            if (innerSet.add(element)) continue;
            throw new IllegalArgumentException("Duplicate element: " + element);
        }
        return ObjectSets.unmodifiable((ObjectSet)innerSet);
    }

    public static <K> ObjectSet<K> of(K e0, K e1, K e2) {
        ObjectArraySet innerSet = new ObjectArraySet(3);
        innerSet.add(e0);
        if (!innerSet.add(e1)) {
            throw new IllegalArgumentException("Duplicate element: " + e1);
        }
        if (!innerSet.add(e2)) {
            throw new IllegalArgumentException("Duplicate element: " + e2);
        }
        return ObjectSets.unmodifiable((ObjectSet)innerSet);
    }

    public static <K> ObjectSet<K> of() {
        return ObjectSets.UNMODIFIABLE_EMPTY_SET;
    }

    public static <K> ObjectSet<K> of(K e) {
        return ObjectSets.singleton(e);
    }

    @Override
    default public ObjectSpliterator<K> spliterator() {
        return ObjectSpliterators.asSpliterator((ObjectIterator)this.iterator(), (long)Size64.sizeOf((Collection)this), (int)65);
    }
}

