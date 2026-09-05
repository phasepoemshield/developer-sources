/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet
 */
package minecraft;

import it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet;
import minecraft.class03861;

public class class03859
extends LongLinkedOpenHashSet {
    private final class03861 N;

    public class03859(int n, float f) {
        super(n, f);
        this.N = new class03861(n / 64, f);
    }

    public int size() {
        throw new UnsupportedOperationException();
    }

    public boolean isEmpty() {
        return this.N.isEmpty();
    }

    public boolean add(long l) {
        return this.N.L(l);
    }

    public boolean rem(long l) {
        return this.N.u(l);
    }

    public long removeFirstLong() {
        return this.N.N();
    }
}

