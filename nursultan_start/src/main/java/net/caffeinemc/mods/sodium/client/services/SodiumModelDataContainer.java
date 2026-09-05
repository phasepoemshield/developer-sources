/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  minecraft.class07209
 */
package net.caffeinemc.mods.sodium.client.services;

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import minecraft.class07209;
import net.caffeinemc.mods.sodium.client.services.SodiumModelData;

public class SodiumModelDataContainer {
    private final Long2ObjectMap<SodiumModelData> modelDataMap;
    private final boolean isEmpty;

    public SodiumModelDataContainer(Long2ObjectMap<SodiumModelData> long2ObjectMap) {
        this.modelDataMap = long2ObjectMap;
        this.isEmpty = long2ObjectMap.isEmpty();
    }

    public boolean isEmpty() {
        return this.isEmpty;
    }

    public SodiumModelData getModelData(class07209 class072092) {
        return (SodiumModelData)this.modelDataMap.getOrDefault(class072092.method_10063(), (Object)SodiumModelData.EMPTY);
    }
}

