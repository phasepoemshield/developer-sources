/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.lithium.common.util.collections;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import net.caffeinemc.mods.lithium.common.util.collections.BucketedList$1;

public class BucketedList<T>
extends AbstractList<T> {
    final ArrayList<T>[] buckets;
    int size;

    public BucketedList(int n) {
        this.buckets = new ArrayList[n];
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public T get(int n) {
        for (ArrayList<T> arrayList : this.buckets) {
            if (arrayList == null) continue;
            if (n < arrayList.size()) {
                return arrayList.get(n);
            }
            n -= arrayList.size();
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public Iterator<T> iterator() {
        return new BucketedList$1(this);
    }

    public void addToBucket(int n, T t) {
        ArrayList<Object> arrayList = this.buckets[n];
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.buckets[n] = arrayList;
        }
        arrayList.add(t);
        ++this.size;
    }
}

