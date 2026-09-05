/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 */
package net.caffeinemc.mods.lithium.common.util.collections;

import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.AbstractList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Spliterator;
import net.caffeinemc.mods.lithium.common.util.collections.MaskedList$1;
import net.caffeinemc.mods.lithium.common.util.collections.MaskedList$2;

public class MaskedList<E>
extends AbstractList<E> {
    final ObjectArrayList<E> allElements = new ObjectArrayList();
    final BitSet visibleMask = new BitSet();
    private final Object2IntOpenHashMap<E> element2Index;
    private final boolean defaultVisibility;
    private int numCleared;

    public MaskedList(ObjectArrayList<E> objectArrayList, boolean bl) {
        this.defaultVisibility = bl;
        this.element2Index = new Object2IntOpenHashMap();
        this.element2Index.defaultReturnValue(-1);
        this.addAll(objectArrayList);
    }

    public MaskedList() {
        this(new ObjectArrayList(), true);
    }

    @Override
    public boolean remove(Object object) {
        int n = this.element2Index.removeInt(object);
        if (n == -1) {
            return false;
        }
        this.visibleMask.clear(n);
        this.allElements.set(n, null);
        ++this.numCleared;
        if (this.numCleared * 2 > this.allElements.size()) {
            ObjectArrayList objectArrayList = this.allElements.clone();
            BitSet bitSet = (BitSet)this.visibleMask.clone();
            this.allElements.clear();
            this.visibleMask.clear();
            this.element2Index.clear();
            for (int i = 0; i < objectArrayList.size(); ++i) {
                Object object2 = objectArrayList.get(i);
                int n2 = this.allElements.size();
                this.allElements.add(object2);
                this.visibleMask.set(n2, bitSet.get(i));
                this.element2Index.put(object2, n2);
            }
            this.numCleared = 0;
        }
        return true;
    }

    @Override
    public int size() {
        return this.visibleMask.cardinality();
    }

    @Override
    public E get(int n) {
        if (n < 0 || n >= this.size()) {
            throw new IndexOutOfBoundsException(n);
        }
        int n2 = 0;
        while (n >= 0) {
            --n;
            n2 = this.visibleMask.nextSetBit(n2 + 1);
        }
        return (E)this.allElements.get(n2);
    }

    @Override
    public boolean add(E e) {
        int n = this.element2Index.put(e, this.allElements.size());
        if (n != -1) {
            throw new IllegalStateException("MaskedList must not contain duplicates! Trying to add " + String.valueOf(e) + " but it is already present at index " + n + ". Current size: " + this.allElements.size());
        }
        this.visibleMask.set(this.allElements.size(), this.defaultVisibility);
        return this.allElements.add(e);
    }

    @Override
    public Iterator<E> iterator() {
        return new MaskedList$1(this);
    }

    @Override
    public Spliterator<E> spliterator() {
        return new MaskedList$2(this, Long.MAX_VALUE, 272);
    }

    public int totalSize() {
        return this.allElements.size();
    }

    public void addOrSet(E e, boolean bl) {
        int n = this.element2Index.getInt(e);
        if (n != -1) {
            this.visibleMask.set(n, bl);
        } else {
            this.add(e);
            this.setVisible(e, bl);
        }
    }

    public void setVisible(E e, boolean bl) {
        int n = this.element2Index.getInt(e);
        if (n != -1) {
            this.visibleMask.set(n, bl);
        }
    }
}

