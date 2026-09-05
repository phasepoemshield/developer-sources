/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class01231
 *  minecraft.class01391
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class07209
 *  minecraft.class07295
 *  net.caffeinemc.mods.sodium.client.model.color.ColorProviderRegistry
 *  net.caffeinemc.mods.sodium.client.model.light.LightPipelineProvider
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.ChunkBuildBuffers
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.buffers.ChunkModelBuilder
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.pipeline.DefaultFluidRenderer
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.pipeline.FluidRenderer
 *  net.caffeinemc.mods.sodium.client.render.chunk.terrain.material.DefaultMaterials
 *  net.caffeinemc.mods.sodium.client.render.chunk.terrain.material.Material
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.TranslucentGeometryCollector
 *  net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandler
 *  net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry
 *  net.fabricmc.fabric.api.client.render.fluid.v1.FluidRendering
 *  net.fabricmc.fabric.api.client.render.fluid.v1.FluidRendering$DefaultRenderer
 *  net.irisshaders.iris.vertices.sodium.terrain.VertexEncoderInterface
 */
package net.caffeinemc.mods.sodium.fabric.render;

import minecraft.class00500;
import minecraft.class01231;
import minecraft.class01391;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class07209;
import minecraft.class07295;
import net.caffeinemc.mods.sodium.client.model.color.ColorProviderRegistry;
import net.caffeinemc.mods.sodium.client.model.light.LightPipelineProvider;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.ChunkBuildBuffers;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.buffers.ChunkModelBuilder;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.pipeline.DefaultFluidRenderer;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.pipeline.FluidRenderer;
import net.caffeinemc.mods.sodium.client.render.chunk.terrain.material.DefaultMaterials;
import net.caffeinemc.mods.sodium.client.render.chunk.terrain.material.Material;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.TranslucentGeometryCollector;
import net.caffeinemc.mods.sodium.client.world.LevelSlice;
import net.caffeinemc.mods.sodium.fabric.render.FluidRendererImpl$DefaultRenderContext;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandler;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRendering;
import net.irisshaders.iris.vertices.sodium.terrain.VertexEncoderInterface;

public class FluidRendererImpl
extends FluidRenderer
implements VertexEncoderInterface {
    private final ColorProviderRegistry colorProviderRegistry;
    private final DefaultFluidRenderer defaultRenderer;
    private final FluidRendererImpl$DefaultRenderContext defaultContext;

    public FluidRendererImpl(ColorProviderRegistry colorProviderRegistry, LightPipelineProvider lightPipelineProvider) {
        this.colorProviderRegistry = colorProviderRegistry;
        this.defaultRenderer = new DefaultFluidRenderer(lightPipelineProvider);
        this.defaultContext = new FluidRendererImpl$DefaultRenderContext();
    }

    public void overrideBlock(int n) {
        ((VertexEncoderInterface)this.defaultRenderer).overrideBlock(n);
    }

    public void restoreBlock() {
        ((VertexEncoderInterface)this.defaultRenderer).restoreBlock();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void render(LevelSlice levelSlice, class00500 class005002, class04688 class046882, class07209 class072092, class07209 class072093, TranslucentGeometryCollector translucentGeometryCollector, ChunkBuildBuffers chunkBuildBuffers) {
        boolean bl;
        Material material = DefaultMaterials.forFluidState((class04688)class046882);
        ChunkModelBuilder chunkModelBuilder = chunkBuildBuffers.get(material);
        FluidRenderHandler fluidRenderHandler = FluidRenderHandlerRegistry.INSTANCE.get(class046882.N());
        boolean bl2 = bl = FluidRenderHandlerRegistry.INSTANCE.getOverride(class046882.N()) != null;
        if (fluidRenderHandler == null) {
            boolean bl3 = class046882.N(class01231.y);
            fluidRenderHandler = FluidRenderHandlerRegistry.INSTANCE.get((class04651)(bl3 ? class04684.i : class04684.L));
        }
        this.defaultContext.setUp(this.colorProviderRegistry, this.defaultRenderer, levelSlice, class005002, class046882, class072092, class072093, translucentGeometryCollector, chunkModelBuilder, material, fluidRenderHandler, bl);
        try {
            FluidRendering.render((FluidRenderHandler)fluidRenderHandler, (class07295)levelSlice, (class07209)class072092, (class01391)chunkModelBuilder.asFallbackVertexConsumer(material, translucentGeometryCollector), (class00500)class005002, (class04688)class046882, (FluidRendering.DefaultRenderer)this.defaultContext);
        }
        finally {
            this.defaultContext.clear();
        }
    }

    public void beginBlock(int n, byte by, byte by2, int n2, int n3, int n4) {
        ((VertexEncoderInterface)this.defaultRenderer).beginBlock(n, by, by2, n2, n3, n4);
    }
}

