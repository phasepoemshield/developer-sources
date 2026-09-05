/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectArrayMap
 *  minecraft.class04995
 */
package minecraft;

import it.unimi.dsi.fastutil.ints.Int2ObjectArrayMap;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import minecraft.class04995;

public class class05928 {
    private final Int2ObjectArrayMap<int[]> N = new Int2ObjectArrayMap(16);
    private final ReentrantReadWriteLock y = new ReentrantReadWriteLock();
    private static final int L = class04995.Z((int)16);
    private volatile boolean u;

    private int[] L() {
        int[] nArray = new int[L];
        Arrays.fill(nArray, -1);
        return nArray;
    }

    class05928() {
    }

    public void y() {
        this.u = true;
    }

    public boolean N() {
        return this.u;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public int[] N(int n2) {
        int[] nArray;
        this.y.readLock().lock();
        try {
            nArray = (int[])this.N.get(n2);
            if (nArray != null) {
                int[] nArray2 = nArray;
                return nArray2;
            }
        }
        finally {
            this.y.readLock().unlock();
        }
        this.y.writeLock().lock();
        try {
            nArray = (int[])this.N.computeIfAbsent(n2, n -> this.L());
            return nArray;
        }
        finally {
            this.y.writeLock().unlock();
        }
    }
}

