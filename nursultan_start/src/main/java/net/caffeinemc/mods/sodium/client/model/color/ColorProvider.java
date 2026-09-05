/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07209
 *  minecraft.class07218
 *  net.caffeinemc.mods.sodium.client.world.LevelSlice
 */
package net.caffeinemc.mods.sodium.client.model.color;

import minecraft.class07209;
import minecraft.class07218;
import net.caffeinemc.mods.sodium.client.model.quad.ModelQuadView;
import net.caffeinemc.mods.sodium.client.world.LevelSlice;

public interface ColorProvider<T> {
    public void getColors(LevelSlice var1, class07209 var2, class07218 var3, T var4, ModelQuadView var5, int[] var6, boolean var7);
}

