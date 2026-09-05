/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 */
package net.caffeinemc.mods.sodium.client.util.iterator;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ReversibleObjectArrayIterator<T>
implements Iterator<T> {
    private final T[] array;
    private final int direction;
    private int currentIndex;
    private int remaining;

    public ReversibleObjectArrayIterator(ObjectArrayList<T> objectArrayList, boolean bl) {
        this(objectArrayList.elements(), 0, objectArrayList.size(), bl);
    }

    public ReversibleObjectArrayIterator(T[] TArray, int n, int n2, boolean bl) {
        this.array = TArray;
        this.remaining = n2 - n;
        this.direction = bl ? -1 : 1;
        this.currentIndex = bl ? n2 - 1 : n;
    }

    @Override
    public boolean hasNext() {
        return this.remaining > 0;
    }

    @Override
    public T next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        T t = this.array[this.currentIndex];
        this.currentIndex += this.direction;
        --this.remaining;
        return t;
    }
}

