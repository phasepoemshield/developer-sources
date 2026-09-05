/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04688
 *  net.caffeinemc.mods.sodium.client.model.color.ColorProvider
 *  net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandler
 */
package net.caffeinemc.mods.sodium.fabric.render;

import minecraft.class04688;
import net.caffeinemc.mods.sodium.client.model.color.ColorProvider;
import net.caffeinemc.mods.sodium.fabric.render.FabricColorProviders$FabricFluidAdapter;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandler;

public class FabricColorProviders {
    public static ColorProvider<class04688> adapt(FluidRenderHandler fluidRenderHandler) {
        return new FabricColorProviders$FabricFluidAdapter(fluidRenderHandler);
    }
}

