/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03448
 */
package net.caffeinemc.mods.sodium.client.render.chunk.map;

import minecraft.class03448;
import net.caffeinemc.mods.sodium.client.render.chunk.map.ChunkTracker;

public interface ChunkTrackerHolder {
    public static ChunkTracker get(class03448 class034482) {
        return ((ChunkTrackerHolder)class034482).sodium$getTracker();
    }

    public ChunkTracker sodium$getTracker();
}

