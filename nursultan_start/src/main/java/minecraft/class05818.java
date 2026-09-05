/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  minecraft.class00536
 *  minecraft.class05017
 */
package minecraft;

import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import minecraft.class00536;
import minecraft.class05017;

public final class class05818
extends class05017<class05818> {
    int y;
    final Long2IntOpenHashMap L;

    public class05818(Long2ObjectOpenHashMap<class00536> long2ObjectOpenHashMap, Long2IntOpenHashMap long2IntOpenHashMap, int n) {
        super(long2ObjectOpenHashMap);
        this.L = long2IntOpenHashMap;
        long2IntOpenHashMap.defaultReturnValue(n);
        this.y = n;
    }

    public class05818 y() {
        return new class05818((Long2ObjectOpenHashMap<class00536>)this.N.clone(), this.L.clone(), this.y);
    }
}

