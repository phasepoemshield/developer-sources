/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.lithium.common.util.collections;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import net.caffeinemc.mods.lithium.common.util.collections.LazyList$1;

public class LazyList<T>
extends AbstractList<T> {
    private final ArrayList<T> delegate;
    private Iterator<T> iterator;

    public LazyList(ArrayList<T> arrayList, Iterator<T> iterator) {
        this.delegate = arrayList;
        this.iterator = iterator;
    }

    @Override
    public T remove(int n) {
        this.produceToIndex(n);
        return this.delegate.remove(n);
    }

    @Override
    public int size() {
        this.produceToIndex(Integer.MAX_VALUE);
        return this.delegate.size();
    }

    @Override
    public T get(int n) {
        this.produceToIndex(n);
        return this.delegate.get(n);
    }

    @Override
    public void clear() {
        this.delegate.clear();
        this.iterator = null;
    }

    @Override
    public boolean isEmpty() {
        return !this.produceToIndex(0);
    }

    @Override
    public boolean add(T t) {
        this.produceToIndex(Integer.MAX_VALUE);
        return this.delegate.add(t);
    }

    @Override
    public void add(int n, T t) {
        this.produceToIndex(n - 1);
        this.delegate.add(n, t);
    }

    @Override
    public Iterator<T> iterator() {
        return new LazyList$1(this);
    }

    @Override
    public boolean addAll(int n, Collection<? extends T> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        this.produceToIndex(n - 1);
        return this.delegate.addAll(n, collection);
    }

    @Override
    public T set(int n, T t) {
        this.produceToIndex(n);
        return this.delegate.set(n, t);
    }

    boolean produceToIndex(int n) {
        if ((n -= this.delegate.size()) >= 0 && this.iterator != null) {
            while (this.iterator.hasNext()) {
                this.delegate.add(this.iterator.next());
                if (--n >= 0) continue;
                return true;
            }
            this.iterator = null;
        }
        return n < 0;
    }
}

