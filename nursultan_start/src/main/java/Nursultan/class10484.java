/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap
 *  minecraft.class05010
 */
package Nursultan;

import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import minecraft.class05010;

public class class10484
extends Long2ByteOpenHashMap {
    final /* synthetic */ int N;
    final /* synthetic */ class05010 y;

    public class10484(class05010 class050102, int n, float f, int n2) {
        this.y = class050102;
        this.N = n2;
        super(n, f);
    }

    protected void rehash(int n) {
        if (n > this.N) {
            super.rehash(n);
        }
    }
}

