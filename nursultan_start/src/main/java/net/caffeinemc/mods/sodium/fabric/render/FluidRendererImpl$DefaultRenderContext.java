/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class01391
 *  minecraft.class04651
 *  minecraft.class04688
 *  minecraft.class07209
 *  minecraft.class07295
 *  net.caffeinemc.mods.sodium.client.model.color.ColorProvider
 *  net.caffeinemc.mods.sodium.client.model.color.ColorProviderRegistry
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.buffers.ChunkModelBuilder
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.pipeline.DefaultFluidRenderer
 *  net.caffeinemc.mods.sodium.client.render.chunk.terrain.material.Material
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.TranslucentGeometryCollector
 *  net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandler
 *  net.fabricmc.fabric.api.client.render.fluid.v1.FluidRendering$DefaultRenderer
 */
package net.caffeinemc.mods.sodium.fabric.render;

import minecraft.class00500;
import minecraft.class01391;
import minecraft.class04651;
import minecraft.class04688;
import minecraft.class07209;
import minecraft.class07295;
import net.caffeinemc.mods.sodium.client.model.color.ColorProvider;
import net.caffeinemc.mods.sodium.client.model.color.ColorProviderRegistry;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.buffers.ChunkModelBuilder;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.pipeline.DefaultFluidRenderer;
import net.caffeinemc.mods.sodium.client.render.chunk.terrain.material.Material;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.TranslucentGeometryCollector;
import net.caffeinemc.mods.sodium.client.world.LevelSlice;
import net.caffeinemc.mods.sodium.fabric.render.FabricColorProviders;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandler;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRendering;

class FluidRendererImpl$DefaultRenderContext
implements FluidRendering.DefaultRenderer {
    private DefaultFluidRenderer renderer;
    private LevelSlice level;
    private class00500 blockState;
    private class04688 fluidState;
    private class07209 blockPos;
    private class07209 offset;
    private TranslucentGeometryCollector collector;
    private ChunkModelBuilder meshBuilder;
    private Material material;
    private FluidRenderHandler handler;
    private ColorProviderRegistry colorProviderRegistry;
    private boolean hasModOverride;

    FluidRendererImpl$DefaultRenderContext() {
    }

    public void clear() {
        this.renderer = null;
        this.level = null;
        this.blockState = null;
        this.fluidState = null;
        this.blockPos = null;
        this.offset = null;
        this.collector = null;
        this.meshBuilder = null;
        this.material = null;
        this.handler = null;
        this.hasModOverride = false;
    }

    public void render(FluidRenderHandler fluidRenderHandler, class07295 class072952, class07209 class072092, class01391 class013912, class00500 class005002, class04688 class046882) {
        this.renderer.render(this.level, this.blockState, this.fluidState, this.blockPos, this.offset, this.collector, this.meshBuilder, this.material, this.getColorProvider(class046882.N()), fluidRenderHandler.getFluidSprites((class07295)this.level, this.blockPos, this.fluidState));
    }

    public ColorProvider<class04688> getColorProvider(class04651 class046512) {
        ColorProvider colorProvider = this.colorProviderRegistry.getColorProvider(class046512);
        if (!this.hasModOverride && colorProvider != null) {
            return colorProvider;
        }
        return FabricColorProviders.adapt(this.handler);
    }

    public void setUp(ColorProviderRegistry colorProviderRegistry, DefaultFluidRenderer defaultFluidRenderer, LevelSlice levelSlice, class00500 class005002, class04688 class046882, class07209 class072092, class07209 class072093, TranslucentGeometryCollector translucentGeometryCollector, ChunkModelBuilder chunkModelBuilder, Material material, FluidRenderHandler fluidRenderHandler, boolean bl) {
        this.colorProviderRegistry = colorProviderRegistry;
        this.renderer = defaultFluidRenderer;
        this.level = levelSlice;
        this.blockState = class005002;
        this.fluidState = class046882;
        this.blockPos = class072092;
        this.offset = class072093;
        this.collector = translucentGeometryCollector;
        this.meshBuilder = chunkModelBuilder;
        this.material = material;
        this.handler = fluidRenderHandler;
        this.hasModOverride = bl;
    }
}

