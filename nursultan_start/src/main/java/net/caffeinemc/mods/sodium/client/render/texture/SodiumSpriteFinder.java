/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08388
 *  net.caffeinemc.mods.sodium.client.model.quad.ModelQuadView
 */
package net.caffeinemc.mods.sodium.client.render.texture;

import minecraft.class08388;
import net.caffeinemc.mods.sodium.client.model.quad.ModelQuadView;
import net.caffeinemc.mods.sodium.client.render.model.SodiumQuadAtlas;

public interface SodiumSpriteFinder {
    public class08388 find(ModelQuadView var1);

    public class08388 find(float var1, float var2);

    public SodiumQuadAtlas getAtlas();
}

