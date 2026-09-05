/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet
 *  minecraft.class03340
 */
package Nursultan;

import it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet;
import minecraft.class03340;

public class class10189
extends LongLinkedOpenHashSet {
    final /* synthetic */ int N;
    final /* synthetic */ class03340 y;

    public class10189(class03340 class033402, int n, float f, int n2) {
        this.y = class033402;
        this.N = n2;
        super(n, f);
    }

    protected void rehash(int n) {
        if (n > this.N) {
            super.rehash(n);
        }
    }
}

