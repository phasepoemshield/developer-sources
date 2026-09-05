/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2IntLinkedOpenHashMap
 *  minecraft.class07209
 *  minecraft.class07295
 */
package net.caffeinemc.mods.sodium.client.model.light.data;

import it.unimi.dsi.fastutil.longs.Long2IntLinkedOpenHashMap;
import minecraft.class07209;
import minecraft.class07295;
import net.caffeinemc.mods.sodium.client.model.light.data.LightDataAccess;

public class HashLightDataCache
extends LightDataAccess {
    private final Long2IntLinkedOpenHashMap map = new Long2IntLinkedOpenHashMap(1024, 0.5f);

    public void clearCache() {
        this.map.clear();
    }

    public HashLightDataCache(class07295 class072952) {
        this.level = class072952;
    }

    @Override
    public int get(int n, int n2, int n3) {
        long l = class07209.method_10064((int)n, (int)n2, (int)n3);
        int n4 = this.map.getAndMoveToFirst(l);
        if (n4 == 0) {
            if (this.map.size() > 1024) {
                this.map.removeLastInt();
            }
            n4 = this.compute(n, n2, n3);
            this.map.put(l, n4);
        }
        return n4;
    }
}

