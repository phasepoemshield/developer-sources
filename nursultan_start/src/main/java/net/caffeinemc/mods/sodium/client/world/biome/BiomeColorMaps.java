/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07287
 *  minecraft.class07289
 */
package net.caffeinemc.mods.sodium.client.world.biome;

import minecraft.class07287;
import minecraft.class07289;

public class BiomeColorMaps {
    private static final int WIDTH = 256;
    private static final int HEIGHT = 256;
    private static final int INVALID_INDEX = -1;

    public static int getIndex(double d, double d2) {
        int n;
        int n2;
        block7: {
            block6: {
                block5: {
                    block4: {
                        n2 = (int)((1.0 - d) * 255.0);
                        n = (int)((1.0 - (d2 *= d)) * 255.0);
                        if (n2 < 0) break block4;
                        if (n2 < 256) break block5;
                    }
                    return -1;
                }
                if (n < 0) break block6;
                if (n < 256) break block7;
            }
            return -1;
        }
        return n << 8 | n2;
    }

    public static int getFoliageColor(int n) {
        if (n == -1 || n >= class07289.i.length) {
            return -12012264;
        }
        return class07289.i[n];
    }

    public static int getGrassColor(int n) {
        if (n == -1 || n >= class07287.N.length) {
            return class07287.N();
        }
        return class07287.N[n];
    }
}

