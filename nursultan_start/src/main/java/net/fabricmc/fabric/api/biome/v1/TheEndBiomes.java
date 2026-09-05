/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00780
 *  minecraft.class00795
 *  minecraft.class05946
 *  net.fabricmc.fabric.impl.biome.TheEndBiomeData
 */
package net.fabricmc.fabric.api.biome.v1;

import minecraft.class00780;
import minecraft.class00795;
import minecraft.class05946;
import net.fabricmc.fabric.impl.biome.TheEndBiomeData;

public final class TheEndBiomes {
    private TheEndBiomes() {
    }

    public static void addSmallIslandsBiome(class05946<class00780> class059462, double d) {
        TheEndBiomeData.addEndBiomeReplacement((class05946)class00795.NE, class059462, (double)d);
    }

    public static void addMainIslandBiome(class05946<class00780> class059462, double d) {
        TheEndBiomeData.addEndBiomeReplacement((class05946)class00795.NZ, class059462, (double)d);
    }

    public static void addHighlandsBiome(class05946<class00780> class059462, double d) {
        TheEndBiomeData.addEndBiomeReplacement((class05946)class00795.Nz, class059462, (double)d);
    }

    public static void addMidlandsBiome(class05946<class00780> class059462, class05946<class00780> class059463, double d) {
        TheEndBiomeData.addEndMidlandsReplacement(class059462, class059463, (double)d);
    }

    public static void addBarrensBiome(class05946<class00780> class059462, class05946<class00780> class059463, double d) {
        TheEndBiomeData.addEndBarrensReplacement(class059462, class059463, (double)d);
    }
}

