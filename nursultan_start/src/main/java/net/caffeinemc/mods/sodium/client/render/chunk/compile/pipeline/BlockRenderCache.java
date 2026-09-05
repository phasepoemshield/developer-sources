/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03448
 *  minecraft.class03770
 *  minecraft.class06202
 *  minecraft.class07295
 *  net.caffeinemc.mods.sodium.client.model.color.ColorProviderRegistry
 *  net.caffeinemc.mods.sodium.client.model.light.LightPipelineProvider
 *  net.caffeinemc.mods.sodium.client.model.light.data.ArrayLightDataCache
 *  net.caffeinemc.mods.sodium.client.model.light.data.LightDataAccess
 *  net.caffeinemc.mods.sodium.client.services.FluidRendererFactory
 *  net.caffeinemc.mods.sodium.client.world.LevelSlice
 *  net.caffeinemc.mods.sodium.client.world.cloned.ChunkRenderContext
 */
package net.caffeinemc.mods.sodium.client.render.chunk.compile.pipeline;

import minecraft.class03448;
import minecraft.class03770;
import minecraft.class06202;
import minecraft.class07295;
import net.caffeinemc.mods.sodium.client.model.color.ColorProviderRegistry;
import net.caffeinemc.mods.sodium.client.model.light.LightPipelineProvider;
import net.caffeinemc.mods.sodium.client.model.light.data.ArrayLightDataCache;
import net.caffeinemc.mods.sodium.client.model.light.data.LightDataAccess;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.pipeline.BlockRenderer;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.pipeline.FluidRenderer;
import net.caffeinemc.mods.sodium.client.services.FluidRendererFactory;
import net.caffeinemc.mods.sodium.client.world.LevelSlice;
import net.caffeinemc.mods.sodium.client.world.cloned.ChunkRenderContext;

public class BlockRenderCache {
    private final ArrayLightDataCache lightDataCache;
    private final BlockRenderer blockRenderer;
    private final FluidRenderer fluidRenderer;
    private final class03770 blockModels;
    private final LevelSlice levelSlice;

    public BlockRenderCache(class06202 class062022, class03448 class034482) {
        this.levelSlice = new LevelSlice(class034482);
        this.lightDataCache = new ArrayLightDataCache((class07295)this.levelSlice);
        LightPipelineProvider lightPipelineProvider = new LightPipelineProvider((LightDataAccess)this.lightDataCache);
        ColorProviderRegistry colorProviderRegistry = new ColorProviderRegistry(class062022.d());
        this.blockRenderer = new BlockRenderer(colorProviderRegistry, lightPipelineProvider);
        this.fluidRenderer = FluidRendererFactory.getInstance().createPlatformFluidRenderer(colorProviderRegistry, lightPipelineProvider);
        this.blockModels = class062022.D().y();
    }

    public void init(ChunkRenderContext chunkRenderContext) {
        this.lightDataCache.reset(chunkRenderContext.getOrigin());
        this.levelSlice.copyData(chunkRenderContext);
    }

    public void cleanup() {
        this.levelSlice.reset();
    }

    public LevelSlice getWorldSlice() {
        return this.levelSlice;
    }

    public BlockRenderer getBlockRenderer() {
        return this.blockRenderer;
    }

    public class03770 getBlockModels() {
        return this.blockModels;
    }

    public FluidRenderer getFluidRenderer() {
        return this.fluidRenderer;
    }
}

