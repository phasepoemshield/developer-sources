/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2LongMap
 *  it.unimi.dsi.fastutil.objects.Object2LongMaps
 *  it.unimi.dsi.fastutil.objects.Object2LongOpenHashMap
 *  minecraft.class05985
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.Object2LongMap;
import it.unimi.dsi.fastutil.objects.Object2LongMaps;
import it.unimi.dsi.fastutil.objects.Object2LongOpenHashMap;
import minecraft.class05985;

public class class05025
implements class05985 {
    long N = Long.MIN_VALUE;
    long y = Long.MAX_VALUE;
    long L;
    long u;
    final Object2LongOpenHashMap<String> i = new Object2LongOpenHashMap();

    public long L() {
        return this.u;
    }

    public Object2LongMap<String> u() {
        return Object2LongMaps.unmodifiable(this.i);
    }

    public long y() {
        return this.N;
    }

    public long N() {
        return this.L;
    }
}

