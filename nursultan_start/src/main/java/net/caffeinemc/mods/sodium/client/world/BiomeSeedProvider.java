/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03448
 */
package net.caffeinemc.mods.sodium.client.world;

import minecraft.class03448;

public interface BiomeSeedProvider {
    public static long getBiomeZoomSeed(class03448 class034482) {
        return ((BiomeSeedProvider)class034482).sodium$getBiomeZoomSeed();
    }

    public long sodium$getBiomeZoomSeed();
}

