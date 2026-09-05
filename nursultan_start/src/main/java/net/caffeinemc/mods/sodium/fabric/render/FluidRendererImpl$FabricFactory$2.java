/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class06229
 *  minecraft.class07209
 *  minecraft.class07295
 *  net.caffeinemc.mods.sodium.client.model.quad.blender.BlendedColorProvider
 */
package net.caffeinemc.mods.sodium.fabric.render;

import minecraft.class00500;
import minecraft.class06229;
import minecraft.class07209;
import minecraft.class07295;
import net.caffeinemc.mods.sodium.client.model.quad.blender.BlendedColorProvider;
import net.caffeinemc.mods.sodium.client.world.LevelSlice;
import net.caffeinemc.mods.sodium.fabric.render.FluidRendererImpl$FabricFactory;

class FluidRendererImpl$FabricFactory$2
extends BlendedColorProvider<class00500> {
    FluidRendererImpl$FabricFactory$2(FluidRendererImpl$FabricFactory fluidRendererImpl$FabricFactory) {
    }

    protected int getColor(LevelSlice levelSlice, class00500 class005002, class07209 class072092) {
        return class06229.u((class07295)levelSlice, (class07209)class072092) | 0xFF000000;
    }
}

