/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class04688
 *  net.caffeinemc.mods.sodium.client.model.color.ColorProviderRegistry
 *  net.caffeinemc.mods.sodium.client.model.light.LightPipelineProvider
 *  net.caffeinemc.mods.sodium.client.model.quad.blender.BlendedColorProvider
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.pipeline.FluidRenderer
 */
package net.caffeinemc.mods.sodium.client.services;

import minecraft.class00500;
import minecraft.class04688;
import net.caffeinemc.mods.sodium.client.model.color.ColorProviderRegistry;
import net.caffeinemc.mods.sodium.client.model.light.LightPipelineProvider;
import net.caffeinemc.mods.sodium.client.model.quad.blender.BlendedColorProvider;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.pipeline.FluidRenderer;
import net.caffeinemc.mods.sodium.client.services.Services;

public interface FluidRendererFactory {
    public static final FluidRendererFactory INSTANCE = Services.load(FluidRendererFactory.class);

    public static FluidRendererFactory getInstance() {
        return INSTANCE;
    }

    public FluidRenderer createPlatformFluidRenderer(ColorProviderRegistry var1, LightPipelineProvider var2);

    public BlendedColorProvider<class04688> getWaterColorProvider();

    public BlendedColorProvider<class00500> getWaterBlockColorProvider();
}

