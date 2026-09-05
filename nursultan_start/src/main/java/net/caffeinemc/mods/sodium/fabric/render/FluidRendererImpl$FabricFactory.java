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
package net.caffeinemc.mods.sodium.fabric.render;

import minecraft.class00500;
import minecraft.class04688;
import net.caffeinemc.mods.sodium.client.model.color.ColorProviderRegistry;
import net.caffeinemc.mods.sodium.client.model.light.LightPipelineProvider;
import net.caffeinemc.mods.sodium.client.model.quad.blender.BlendedColorProvider;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.pipeline.FluidRenderer;
import net.caffeinemc.mods.sodium.client.services.FluidRendererFactory;
import net.caffeinemc.mods.sodium.fabric.render.FluidRendererImpl;
import net.caffeinemc.mods.sodium.fabric.render.FluidRendererImpl$FabricFactory$1;
import net.caffeinemc.mods.sodium.fabric.render.FluidRendererImpl$FabricFactory$2;

public class FluidRendererImpl$FabricFactory
implements FluidRendererFactory {
    @Override
    public FluidRenderer createPlatformFluidRenderer(ColorProviderRegistry colorProviderRegistry, LightPipelineProvider lightPipelineProvider) {
        return new FluidRendererImpl(colorProviderRegistry, lightPipelineProvider);
    }

    @Override
    public BlendedColorProvider<class04688> getWaterColorProvider() {
        return new FluidRendererImpl$FabricFactory$1(this);
    }

    @Override
    public BlendedColorProvider<class00500> getWaterBlockColorProvider() {
        return new FluidRendererImpl$FabricFactory$2(this);
    }
}

