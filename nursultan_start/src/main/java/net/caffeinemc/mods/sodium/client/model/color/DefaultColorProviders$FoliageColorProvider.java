/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class06229
 *  minecraft.class07209
 *  minecraft.class07295
 *  net.caffeinemc.mods.sodium.client.world.LevelSlice
 */
package net.caffeinemc.mods.sodium.client.model.color;

import minecraft.class00500;
import minecraft.class06229;
import minecraft.class07209;
import minecraft.class07295;
import net.caffeinemc.mods.sodium.client.model.color.ColorProvider;
import net.caffeinemc.mods.sodium.client.model.quad.blender.BlendedColorProvider;
import net.caffeinemc.mods.sodium.client.world.LevelSlice;

public class DefaultColorProviders$FoliageColorProvider<T>
extends BlendedColorProvider<T> {
    public static final ColorProvider<class00500> BLOCKS = new DefaultColorProviders$FoliageColorProvider<class00500>();

    private DefaultColorProviders$FoliageColorProvider() {
    }

    @Override
    public int getColor(LevelSlice levelSlice, T t, class07209 class072092) {
        return 0xFF000000 | class06229.y((class07295)levelSlice, (class07209)class072092);
    }
}

