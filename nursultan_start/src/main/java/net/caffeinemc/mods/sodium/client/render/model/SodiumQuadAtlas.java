/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class08626
 */
package net.caffeinemc.mods.sodium.client.render.model;

import minecraft.class01894;
import minecraft.class08626;

public enum SodiumQuadAtlas {
    BLOCK,
    ITEM;


    public static SodiumQuadAtlas of(class01894 class018942) {
        if (class018942.equals((Object)class08626.N)) {
            return BLOCK;
        }
        if (class018942.equals((Object)class08626.y)) {
            return ITEM;
        }
        return null;
    }
}

