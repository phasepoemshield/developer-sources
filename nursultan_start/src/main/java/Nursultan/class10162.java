/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  minecraft.class07428
 */
package Nursultan;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import minecraft.class07428;

public class class10162 {
    private final Object2IntMap<class07428> N = new Object2IntOpenHashMap(class07428.values().length);

    public boolean y(class07428 class074282) {
        return this.N.getOrDefault((Object)class074282, 0) < class074282.y();
    }

    public void N(class07428 class074283) {
        this.N.computeInt((Object)class074283, (class074282, n) -> n == null ? 1 : n + 1);
    }
}

