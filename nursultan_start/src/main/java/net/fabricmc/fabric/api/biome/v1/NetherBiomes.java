/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00780
 *  minecraft.class03216
 *  minecraft.class03229
 *  minecraft.class03231
 *  minecraft.class05946
 *  net.fabricmc.fabric.impl.biome.NetherBiomeData
 */
package net.fabricmc.fabric.api.biome.v1;

import minecraft.class00780;
import minecraft.class03216;
import minecraft.class03229;
import minecraft.class03231;
import minecraft.class05946;
import net.fabricmc.fabric.impl.biome.NetherBiomeData;

public final class NetherBiomes {
    private NetherBiomes() {
    }

    public static boolean canGenerateInNether(class05946<class00780> class059462) {
        return NetherBiomeData.canGenerateInNether(class059462);
    }

    public static void addNetherBiome(class05946<class00780> class059462, class03231 class032312) {
        NetherBiomeData.addNetherBiome(class059462, (class03229)class03216.N((float)class032312.y(), (float)class032312.L(), (float)class032312.u(), (float)class032312.i(), (float)class032312.R(), (float)class032312.M(), (float)0.0f));
    }

    public static void addNetherBiome(class05946<class00780> class059462, class03229 class032292) {
        NetherBiomeData.addNetherBiome(class059462, (class03229)class032292);
    }
}

