/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04688
 *  minecraft.class07209
 *  minecraft.class07218
 *  minecraft.class07295
 *  net.caffeinemc.mods.sodium.client.model.color.ColorProvider
 *  net.caffeinemc.mods.sodium.client.model.quad.ModelQuadView
 *  net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandler
 */
package net.caffeinemc.mods.sodium.fabric.render;

import java.util.Arrays;
import minecraft.class04688;
import minecraft.class07209;
import minecraft.class07218;
import minecraft.class07295;
import net.caffeinemc.mods.sodium.client.model.color.ColorProvider;
import net.caffeinemc.mods.sodium.client.model.quad.ModelQuadView;
import net.caffeinemc.mods.sodium.client.world.LevelSlice;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandler;

class FabricColorProviders$FabricFluidAdapter
implements ColorProvider<class04688> {
    private final FluidRenderHandler handler;

    public FabricColorProviders$FabricFluidAdapter(FluidRenderHandler fluidRenderHandler) {
        this.handler = fluidRenderHandler;
    }

    public void getColors(LevelSlice levelSlice, class07209 class072092, class07218 class072182, class04688 class046882, ModelQuadView modelQuadView, int[] nArray, boolean bl) {
        Arrays.fill(nArray, 0xFF000000 | this.handler.getFluidColor((class07295)levelSlice, class072092, class046882));
    }
}

