/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class04750
 *  minecraft.class07209
 *  minecraft.class07218
 *  minecraft.class07295
 *  net.caffeinemc.mods.sodium.client.world.LevelSlice
 */
package net.caffeinemc.mods.sodium.client.model.color;

import java.util.Arrays;
import minecraft.class00500;
import minecraft.class04750;
import minecraft.class07209;
import minecraft.class07218;
import minecraft.class07295;
import net.caffeinemc.mods.sodium.client.model.color.ColorProvider;
import net.caffeinemc.mods.sodium.client.model.quad.ModelQuadView;
import net.caffeinemc.mods.sodium.client.world.LevelSlice;

class DefaultColorProviders$VanillaAdapter
implements ColorProvider<class00500> {
    private final class04750 color;

    DefaultColorProviders$VanillaAdapter(class04750 class047502) {
        this.color = class047502;
    }

    @Override
    public void getColors(LevelSlice levelSlice, class07209 class072092, class07218 class072182, class00500 class005002, ModelQuadView modelQuadView, int[] nArray, boolean bl) {
        Arrays.fill(nArray, 0xFF000000 | this.color.getColor(class005002, (class07295)levelSlice, class072092, modelQuadView.getTintIndex()));
    }
}

