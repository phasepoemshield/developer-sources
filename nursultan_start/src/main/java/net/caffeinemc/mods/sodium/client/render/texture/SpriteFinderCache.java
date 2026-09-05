/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06202
 *  minecraft.class08589
 */
package net.caffeinemc.mods.sodium.client.render.texture;

import minecraft.class06202;
import minecraft.class08589;
import net.caffeinemc.mods.sodium.client.render.texture.ExtendedTextureAtlas;
import net.caffeinemc.mods.sodium.client.render.texture.SodiumSpriteFinder;

public class SpriteFinderCache {
    private static SodiumSpriteFinder blockAtlasSpriteFinder;
    private static SodiumSpriteFinder itemAtlasSpriteFinder;

    public static void resetSpriteFinder() {
        blockAtlasSpriteFinder = null;
    }

    public static SodiumSpriteFinder forBlockAtlas() {
        if (blockAtlasSpriteFinder == null) {
            blockAtlasSpriteFinder = ((ExtendedTextureAtlas)class06202.Nq().yW().N(class08589.u)).sodium$getSpriteFinder();
        }
        return blockAtlasSpriteFinder;
    }

    public static SodiumSpriteFinder forItemAtlas() {
        if (itemAtlasSpriteFinder == null) {
            itemAtlasSpriteFinder = ((ExtendedTextureAtlas)class06202.Nq().yW().N(class08589.i)).sodium$getSpriteFinder();
        }
        return itemAtlasSpriteFinder;
    }

    public static void resetItemSpriteFinder() {
        itemAtlasSpriteFinder = null;
    }
}

