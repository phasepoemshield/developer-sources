/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.HashCommon
 *  minecraft.class04309
 */
package net.caffeinemc.mods.lithium.common.world.scheduler;

import it.unimi.dsi.fastutil.HashCommon;
import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import minecraft.class04309;
import net.caffeinemc.mods.lithium.common.world.scheduler.OrderedTickQueue$1;

public class OrderedTickQueue<T>
extends AbstractQueue<class04309<T>> {
    private static final int INITIAL_CAPACITY = 16;
    private static final Comparator<class04309<?>> COMPARATOR = Comparator.comparingLong(class04309::i);
    class04309<T>[] arr;
    int lastIndexExclusive;
    int firstIndex;
    private long currentMaxSubTickOrder = Long.MIN_VALUE;
    private boolean isSorted;
    private class04309<T> unsortedPeekResult;

    public OrderedTickQueue(int n) {
        this.arr = new class04309[n];
        this.lastIndexExclusive = 0;
        this.isSorted = true;
        this.unsortedPeekResult = null;
        this.firstIndex = 0;
    }

    public OrderedTickQueue() {
        this(16);
    }

    @Override
    public int size() {
        return this.lastIndexExclusive - this.firstIndex;
    }

    @Override
    public void clear() {
        Arrays.fill(this.arr, null);
        this.lastIndexExclusive = 0;
        this.firstIndex = 0;
        this.currentMaxSubTickOrder = Long.MIN_VALUE;
        this.isSorted = true;
        this.unsortedPeekResult = null;
    }

    @Override
    public boolean isEmpty() {
        return this.lastIndexExclusive <= this.firstIndex;
    }

    @Override
    public Iterator<class04309<T>> iterator() {
        if (this.isEmpty()) {
            return Collections.emptyIterator();
        }
        this.sort();
        return new OrderedTickQueue$1(this);
    }

    public void sort() {
        if (this.isSorted) {
            return;
        }
        this.removeNullsAndConsumed();
        Arrays.sort(this.arr, this.firstIndex, this.lastIndexExclusive, COMPARATOR);
        this.isSorted = true;
        this.unsortedPeekResult = null;
    }

    @Override
    public class04309<T> peek() {
        if (!this.isSorted) {
            return this.unsortedPeekResult;
        }
        if (this.lastIndexExclusive > this.firstIndex) {
            return this.getTickAtIndex(this.firstIndex);
        }
        return null;
    }

    @Override
    public class04309<T> poll() {
        if (this.isEmpty()) {
            return null;
        }
        if (!this.isSorted) {
            this.sort();
        }
        int n = this.firstIndex++;
        class04309<T>[] class04309Array = this.arr;
        class04309<T> class043092 = class04309Array[n];
        class04309Array[n] = null;
        return class043092;
    }

    @Override
    public boolean offer(class04309<T> class043092) {
        if (this.lastIndexExclusive >= this.arr.length) {
            this.arr = OrderedTickQueue.copyArray(this.arr, HashCommon.nextPowerOfTwo((int)(this.arr.length + 1)));
        }
        if (class043092.i() <= this.currentMaxSubTickOrder) {
            class04309<T> class043093 = this.isSorted ? (this.size() > 0 ? this.arr[this.firstIndex] : null) : this.unsortedPeekResult;
            this.isSorted = false;
            this.unsortedPeekResult = class043093 == null || class043092.i() < class043093.i() ? class043092 : class043093;
        } else {
            this.currentMaxSubTickOrder = class043092.i();
        }
        this.arr[this.lastIndexExclusive++] = class043092;
        return true;
    }

    public void setTickAtIndex(int n, class04309<T> class043092) {
        if (!this.isSorted) {
            throw new IllegalStateException("Unexpected access on unsorted queue!");
        }
        this.arr[n] = class043092;
    }

    public class04309<T> getTickAtIndex(int n) {
        if (!this.isSorted) {
            throw new IllegalStateException("Unexpected access on unsorted queue!");
        }
        return this.arr[n];
    }

    private void handleCompaction(int n) {
        class04309<T> class043092;
        if (this.arr.length > 16 && n < this.arr.length / 2) {
            this.arr = OrderedTickQueue.copyArray(this.arr, n);
        } else {
            Arrays.fill(this.arr, n, this.arr.length, null);
        }
        this.firstIndex = 0;
        this.lastIndexExclusive = n;
        this.currentMaxSubTickOrder = n == 0 || !this.isSorted ? Long.MIN_VALUE : ((class043092 = this.arr[n - 1]) == null ? Long.MIN_VALUE : class043092.i());
    }

    public void removeNullsAndConsumed() {
        int n = 0;
        for (int i = this.firstIndex; i < this.lastIndexExclusive; ++i) {
            class04309<T> class043092 = this.arr[i];
            if (class043092 == null) continue;
            this.arr[n] = class043092;
            ++n;
        }
        this.handleCompaction(n);
    }

    private static <T> class04309<T>[] copyArray(class04309<T>[] class04309Array, int n) {
        class04309[] class04309Array2 = new class04309[Math.max(16, n)];
        if (n != 0) {
            System.arraycopy(class04309Array, 0, class04309Array2, 0, Math.min(class04309Array.length, n));
        }
        return class04309Array2;
    }
}

