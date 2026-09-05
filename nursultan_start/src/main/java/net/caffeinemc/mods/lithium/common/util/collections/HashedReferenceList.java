/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ReferenceArrayList
 *  it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet
 */
package net.caffeinemc.mods.lithium.common.util.collections;

import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ReferenceArrayList;
import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import net.caffeinemc.mods.lithium.common.util.collections.HashedReferenceList$1;

public class HashedReferenceList<T>
implements List<T> {
    final ReferenceArrayList<T> list = new ReferenceArrayList();
    private final Reference2IntOpenHashMap<T> counter;

    public HashedReferenceList(Collection<T> collection) {
        this.list.addAll(collection);
        this.counter = new Reference2IntOpenHashMap();
        this.counter.defaultReturnValue(0);
        for (Object e : this.list) {
            this.counter.addTo(e, 1);
        }
    }

    @Override
    public boolean remove(Object object) {
        this.trackReferenceRemoved(object);
        return this.list.remove(object);
    }

    @Override
    public T remove(int n) {
        Object object = this.list.remove(n);
        if (object != null) {
            this.trackReferenceRemoved(object);
        }
        return (T)object;
    }

    @Override
    public int size() {
        return this.list.size();
    }

    @Override
    public T get(int n) {
        return (T)this.list.get(n);
    }

    @Override
    public int indexOf(Object object) {
        return this.list.indexOf(object);
    }

    @Override
    public void clear() {
        this.counter.clear();
        this.list.clear();
    }

    @Override
    public int lastIndexOf(Object object) {
        return this.list.lastIndexOf(object);
    }

    @Override
    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    @Override
    public boolean add(T t) {
        this.trackReferenceAdded(t);
        return this.list.add(t);
    }

    @Override
    public void add(int n, T t) {
        this.trackReferenceAdded(t);
        this.list.add(n, t);
    }

    @Override
    public List<T> subList(int n, int n2) {
        return this.list.subList(n, n2);
    }

    @Override
    public <T1> T1[] toArray(T1[] T1Array) {
        return this.list.toArray((Object[])T1Array);
    }

    @Override
    public Object[] toArray() {
        return this.list.toArray();
    }

    @Override
    public Iterator<T> iterator() {
        return this.listIterator();
    }

    @Override
    public boolean contains(Object object) {
        return this.counter.containsKey(object);
    }

    @Override
    public boolean addAll(int n, Collection<? extends T> collection) {
        for (T t : collection) {
            this.trackReferenceAdded(t);
        }
        return this.list.addAll(n, collection);
    }

    @Override
    public boolean addAll(Collection<? extends T> collection) {
        for (T t : collection) {
            this.trackReferenceAdded(t);
        }
        return this.list.addAll(collection);
    }

    @Override
    public T set(int n, T t) {
        Object object = this.list.set(n, t);
        if (object != t) {
            if (object != null) {
                this.trackReferenceRemoved(object);
            }
            this.trackReferenceAdded(t);
        }
        return (T)object;
    }

    @Override
    public boolean removeAll(Collection<?> referenceOpenHashSet) {
        if (this.size() >= 2 && referenceOpenHashSet.size() > 4 && referenceOpenHashSet instanceof List) {
            referenceOpenHashSet = new ReferenceOpenHashSet(referenceOpenHashSet);
        }
        this.counter.keySet().removeAll(referenceOpenHashSet);
        return this.list.removeAll(referenceOpenHashSet);
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        this.counter.keySet().retainAll(collection);
        return this.list.retainAll(collection);
    }

    @Override
    public ListIterator<T> listIterator(int n) {
        return new HashedReferenceList$1(this, n);
    }

    @Override
    public ListIterator<T> listIterator() {
        return this.listIterator(0);
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        for (Object obj : collection) {
            if (this.counter.containsKey(obj)) continue;
            return false;
        }
        return true;
    }

    void trackReferenceRemoved(Object object) {
        if (this.counter.addTo(object, -1) <= 1) {
            this.counter.removeInt(object);
        }
    }

    void trackReferenceAdded(T t) {
        this.counter.addTo(t, 1);
    }
}

