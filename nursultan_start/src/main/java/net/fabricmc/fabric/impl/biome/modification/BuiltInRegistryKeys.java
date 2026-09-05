/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00780
 *  minecraft.class01929
 *  minecraft.class02055
 *  minecraft.class04105
 *  minecraft.class04227
 *  minecraft.class05946
 */
package net.fabricmc.fabric.impl.biome.modification;

import minecraft.class00780;
import minecraft.class01929;
import minecraft.class02055;
import minecraft.class04105;
import minecraft.class04227;
import minecraft.class05946;

public final class BuiltInRegistryKeys {
    private static final class01929 vanillaRegistries = class04105.N();

    private BuiltInRegistryKeys() {
    }

    public static class02055<class00780> biomeRegistryWrapper() {
        return vanillaRegistries.y(class04227.NA);
    }

    public static boolean isBuiltinBiome(class05946<class00780> class059462) {
        return BuiltInRegistryKeys.biomeRegistryWrapper().N(class059462).isPresent();
    }
}

