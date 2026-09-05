/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Reference2ReferenceOpenHashMap
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00500
 *  minecraft.class03358
 *  minecraft.class03503
 *  minecraft.class04392
 *  minecraft.class04643
 *  minecraft.class04688
 *  minecraft.class05474
 *  minecraft.class06202
 *  minecraft.class06898
 *  minecraft.class07074
 *  minecraft.class07080
 *  minecraft.class07209
 *  minecraft.class07218
 *  minecraft.class07290
 *  minecraft.class07878
 *  minecraft.class08700
 *  minecraft.class08887
 *  net.caffeinemc.mods.sodium.client.model.quad.properties.ModelQuadFacing
 *  net.caffeinemc.mods.sodium.client.render.chunk.DefaultChunkRenderer
 *  net.caffeinemc.mods.sodium.client.render.chunk.ExtendedBlockEntityType
 *  net.caffeinemc.mods.sodium.client.render.chunk.RenderSection
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.ChunkBuildBuffers
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.ChunkBuildContext
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.ChunkBuildOutput
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.buffers.ChunkModelBuilder
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.PresentTranslucentData
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.Sorter
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.TranslucentData
 *  net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkVertexEncoder$Vertex
 *  net.caffeinemc.mods.sodium.client.services.PlatformLevelRenderHooks
 *  net.caffeinemc.mods.sodium.client.util.task.CancellationToken
 *  net.caffeinemc.mods.sodium.client.world.LevelSlice
 *  net.caffeinemc.mods.sodium.client.world.cloned.ChunkRenderContext
 *  net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings
 *  net.irisshaders.iris.vertices.sodium.terrain.ChunkVertexExtension
 *  net.irisshaders.iris.vertices.sodium.terrain.VertexEncoderInterface
 *  org.joml.Vector3dc
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package net.caffeinemc.mods.sodium.client.render.chunk.compile.tasks;

import it.unimi.dsi.fastutil.objects.Reference2ReferenceOpenHashMap;
import java.util.Map;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class03358;
import minecraft.class03503;
import minecraft.class04392;
import minecraft.class04643;
import minecraft.class04688;
import minecraft.class05474;
import minecraft.class06202;
import minecraft.class06898;
import minecraft.class07074;
import minecraft.class07080;
import minecraft.class07209;
import minecraft.class07218;
import minecraft.class07290;
import minecraft.class07878;
import minecraft.class08700;
import minecraft.class08887;
import net.caffeinemc.mods.sodium.client.model.quad.properties.ModelQuadFacing;
import net.caffeinemc.mods.sodium.client.render.chunk.DefaultChunkRenderer;
import net.caffeinemc.mods.sodium.client.render.chunk.ExtendedBlockEntityType;
import net.caffeinemc.mods.sodium.client.render.chunk.RenderSection;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.ChunkBuildBuffers;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.ChunkBuildContext;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.ChunkBuildOutput;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.buffers.ChunkModelBuilder;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.MeshTaskSizeEstimator;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.pipeline.BlockRenderCache;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.pipeline.BlockRenderer;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.pipeline.FluidRenderer;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.tasks.ChunkBuilderTask;
import net.caffeinemc.mods.sodium.client.render.chunk.data.BuiltSectionInfo$Builder;
import net.caffeinemc.mods.sodium.client.render.chunk.data.BuiltSectionMeshParts;
import net.caffeinemc.mods.sodium.client.render.chunk.terrain.DefaultTerrainRenderPasses;
import net.caffeinemc.mods.sodium.client.render.chunk.terrain.TerrainRenderPass;
import net.caffeinemc.mods.sodium.client.render.chunk.terrain.material.DefaultMaterials;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.SortBehavior;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.SortType;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.TranslucentGeometryCollector;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.CombinedCameraPos;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.DynamicData;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.PresentTranslucentData;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.Sorter;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.TranslucentData;
import net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkVertexEncoder;
import net.caffeinemc.mods.sodium.client.services.PlatformLevelRenderHooks;
import net.caffeinemc.mods.sodium.client.util.task.CancellationToken;
import net.caffeinemc.mods.sodium.client.world.LevelSlice;
import net.caffeinemc.mods.sodium.client.world.cloned.ChunkRenderContext;
import net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings;
import net.irisshaders.iris.vertices.sodium.terrain.ChunkVertexExtension;
import net.irisshaders.iris.vertices.sodium.terrain.VertexEncoderInterface;
import org.joml.Vector3dc;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class ChunkBuilderMeshingTask
extends ChunkBuilderTask<ChunkBuildOutput> {
    private final ChunkRenderContext renderContext;
    private final SortBehavior sortBehavior;
    private final boolean forceSort;
    private final ChunkVertexEncoder.Vertex[] vertices = ChunkVertexEncoder.Vertex.uninitializedQuad();

    public ChunkBuilderMeshingTask(RenderSection renderSection, int n, Vector3dc vector3dc, ChunkRenderContext chunkRenderContext, SortBehavior sortBehavior, boolean bl) {
        super(renderSection, n, vector3dc);
        this.renderContext = chunkRenderContext;
        this.sortBehavior = sortBehavior;
        this.forceSort = bl;
    }

    @Override
    public ChunkBuildOutput execute(ChunkBuildContext chunkBuildContext, CancellationToken cancellationToken) {
        ChunkBuildOutput chunkBuildOutput;
        class00500 class005002;
        int n;
        class04643 class046432 = class08700.N();
        BuiltSectionInfo$Builder builtSectionInfo$Builder = new BuiltSectionInfo$Builder();
        class03503 class035032 = new class03503();
        ChunkBuildBuffers chunkBuildBuffers = chunkBuildContext.buffers;
        chunkBuildBuffers.init(builtSectionInfo$Builder, this.render.getSectionIndex());
        BlockRenderCache blockRenderCache = chunkBuildContext.cache;
        blockRenderCache.init(this.renderContext);
        LevelSlice levelSlice = blockRenderCache.getWorldSlice();
        int n2 = this.render.getOriginX();
        int n3 = this.render.getOriginY();
        int n4 = this.render.getOriginZ();
        int n5 = n2 + 16;
        int n6 = n3 + 16;
        int n7 = n4 + 16;
        class07218 class072182 = new class07218(n2, n3, n4);
        class07218 class072183 = new class07218();
        boolean bl = this.sortBehavior != SortBehavior.OFF;
        TranslucentGeometryCollector translucentGeometryCollector = bl ? new TranslucentGeometryCollector(this.render.getPosition(), this.sortBehavior) : null;
        BlockRenderer blockRenderer = blockRenderCache.getBlockRenderer();
        blockRenderer.prepare(chunkBuildBuffers, levelSlice, translucentGeometryCollector);
        class046432.N("render blocks");
        try {
            for (int i = n3; i < n6; ++i) {
                if (cancellationToken.isCancelled()) {
                    return null;
                }
                for (n = n4; n < n7; ++n) {
                    for (int j = n2; j < n5; ++j) {
                        class03358 class033582;
                        class04688 class046882;
                        class005002 = levelSlice.getBlockState(j, i, n);
                        if (class005002.P() && !class005002.k()) continue;
                        class072182.N(j, i, n);
                        this.handler$bih000$iris$setLightBlock(chunkBuildContext, cancellationToken, null, chunkBuildBuffers, class005002, class072182);
                        class072183.N(j & 0xF, i & 0xF, n & 0xF);
                        if (class005002.b() == class06898.field_11458) {
                            class046882 = blockRenderCache.getBlockModels().y(class005002);
                            this.handler$bih000$iris$onRenderModel(chunkBuildContext, cancellationToken, null, chunkBuildBuffers, class005002, class072182, blockRenderer);
                            blockRenderer.renderModel((class08887)class046882, class005002, (class07209)class072182, (class07209)class072183);
                        }
                        if (!(class046882 = class005002.Y()).W()) {
                            FluidRenderer fluidRenderer = blockRenderCache.getFluidRenderer();
                            this.handler$bih000$iris$onRenderLiquid(chunkBuildContext, cancellationToken, null, chunkBuildBuffers, class005002, class046882, class072182, blockRenderCache);
                            fluidRenderer.render(levelSlice, class005002, class046882, (class07209)class072182, (class07209)class072183, translucentGeometryCollector, chunkBuildBuffers);
                        }
                        if (class005002.k() && (chunkBuildOutput = levelSlice.method_8321((class07209)class072182)) != null && ExtendedBlockEntityType.shouldRender((class00404)chunkBuildOutput.O(), (class07290)levelSlice, (class07209)class072182, (class00394)chunkBuildOutput) && (class033582 = class06202.Nq().K().N((class00394)chunkBuildOutput)) != null) {
                            builtSectionInfo$Builder.addBlockEntity((class00394)chunkBuildOutput, !class033582.t_());
                        }
                        this.handler$bih000$iris$onEnd(chunkBuildContext, cancellationToken, null, chunkBuildBuffers, class005002);
                        if (!class005002.t()) continue;
                        class035032.N((class07209)class072182);
                    }
                }
            }
        }
        catch (class07878 class078782) {
            throw this.fillCrashInfo(class078782.N(), levelSlice, (class07209)class072182);
        }
        catch (Exception exception) {
            throw this.fillCrashInfo(class07080.N((Throwable)exception, (String)"Encountered exception while building chunk meshes"), levelSlice, (class07209)class072182);
        }
        class046432.y("mesh appenders");
        PlatformLevelRenderHooks.INSTANCE.runChunkMeshAppenders(this.renderContext.getRenderers(), class087432 -> chunkBuildBuffers.get(DefaultMaterials.forChunkLayer(class087432)).asFallbackVertexConsumer(DefaultMaterials.forChunkLayer(class087432), translucentGeometryCollector), levelSlice);
        blockRenderer.release();
        SortType sortType = SortType.NONE;
        if (bl) {
            sortType = translucentGeometryCollector.finishRendering();
        }
        if (cancellationToken.isCancelled()) {
            class046432.L();
            return null;
        }
        class046432.y("translucency sorting");
        n = 0;
        TranslucentData translucentData = null;
        if (bl) {
            class005002 = this.render.getTranslucentData();
            if (this.forceSort && !(class005002 instanceof DynamicData)) {
                class005002 = null;
            }
            try {
                translucentData = translucentGeometryCollector.getTranslucentData((TranslucentData)class005002, this);
            }
            catch (Exception exception) {
                throw this.fillCrashInfo(class07080.N((Throwable)exception, (String)"Encountered exception while preparing for translucency sorting"), levelSlice, null);
            }
            n = !this.forceSort && translucentData == class005002 ? 1 : 0;
        }
        class046432.y("meshing");
        class005002 = new Reference2ReferenceOpenHashMap();
        int n8 = DefaultChunkRenderer.getVisibleFaces((int)((int)this.absoluteCameraPos.x()), (int)((int)this.absoluteCameraPos.y()), (int)((int)this.absoluteCameraPos.z()), (int)this.render.getChunkX(), (int)this.render.getChunkY(), (int)this.render.getChunkZ());
        if (translucentData != null && translucentData.meshesWereModified()) {
            class005002.put(DefaultTerrainRenderPasses.TRANSLUCENT, chunkBuildBuffers.createModifiedTranslucentMesh(translucentData.getUpdatedQuads()));
            builtSectionInfo$Builder.addRenderPass(DefaultTerrainRenderPasses.TRANSLUCENT);
        }
        for (TerrainRenderPass terrainRenderPass : DefaultTerrainRenderPasses.ALL) {
            boolean bl2;
            boolean bl3;
            boolean bl4;
            BuiltSectionMeshParts builtSectionMeshParts;
            if (class005002.containsKey(terrainRenderPass) || (builtSectionMeshParts = chunkBuildBuffers.createMesh(terrainRenderPass, n8, bl4 = (bl3 = bl && terrainRenderPass.isTranslucent()) && sortType.needsDirectionMixing, bl2 = !bl3 || sortType.allowSliceReordering)) == null) continue;
            class005002.put(terrainRenderPass, builtSectionMeshParts);
            builtSectionInfo$Builder.addRenderPass(terrainRenderPass);
        }
        builtSectionInfo$Builder.setOcclusionData(class035032.N());
        chunkBuildOutput = new ChunkBuildOutput(this.render, this.submitTime, translucentData, builtSectionInfo$Builder.build(), (Map)class005002);
        if (bl) {
            if (n != 0) {
                chunkBuildOutput.markAsReusingUploadedData();
            } else if (translucentData instanceof PresentTranslucentData) {
                PresentTranslucentData presentTranslucentData = (PresentTranslucentData)translucentData;
                try {
                    Sorter sorter = presentTranslucentData.getSorter();
                    sorter.writeIndexBuffer((CombinedCameraPos)this, true);
                    chunkBuildOutput.setSorter(sorter);
                }
                catch (Exception exception) {
                    throw this.fillCrashInfo(class07080.N((Throwable)exception, (String)"Encountered exception while writing index buffer for translucent geometry"), levelSlice, null);
                }
            }
        }
        class046432.L();
        return chunkBuildOutput;
    }

    private void handler$bih000$iris$onRenderModel(ChunkBuildContext chunkBuildContext, CancellationToken cancellationToken, CallbackInfoReturnable callbackInfoReturnable, ChunkBuildBuffers chunkBuildBuffers, class00500 class005002, class07218 class072182, BlockRenderer blockRenderer) {
        if (WorldRenderingSettings.INSTANCE.getBlockStateIds() == null) {
            return;
        }
        ((VertexEncoderInterface)blockRenderer).beginBlock(WorldRenderingSettings.INSTANCE.getBlockStateIds().getOrDefault((Object)class005002, -1), (byte)0, (byte)class005002.m(), class072182.method_10263(), class072182.method_10264(), class072182.method_10260());
    }

    private void handler$bih000$iris$onRenderLiquid(ChunkBuildContext chunkBuildContext, CancellationToken cancellationToken, CallbackInfoReturnable callbackInfoReturnable, ChunkBuildBuffers chunkBuildBuffers, class00500 class005002, class04688 class046882, class07218 class072182, BlockRenderCache blockRenderCache) {
        if (WorldRenderingSettings.INSTANCE.getBlockStateIds() == null) {
            return;
        }
        ((VertexEncoderInterface)blockRenderCache.getFluidRenderer()).beginBlock(WorldRenderingSettings.INSTANCE.getBlockStateIds().getInt((Object)class046882.B()), (byte)1, (byte)class005002.m(), class072182.method_10263(), class072182.method_10264(), class072182.method_10260());
    }

    private void handler$bih000$iris$setLightBlock(ChunkBuildContext chunkBuildContext, CancellationToken cancellationToken, CallbackInfoReturnable callbackInfoReturnable, ChunkBuildBuffers chunkBuildBuffers, class00500 class005002, class07218 class072182) {
        if (WorldRenderingSettings.INSTANCE.getBlockStateIds() == null) {
            return;
        }
        if (WorldRenderingSettings.INSTANCE.shouldVoxelizeLightBlocks() && class005002.i() instanceof class04392) {
            ChunkModelBuilder chunkModelBuilder = chunkBuildBuffers.get(DefaultMaterials.CUTOUT_MIPPED);
            int n = WorldRenderingSettings.INSTANCE.getBlockStateIds().getInt((Object)class005002);
            for (int i = 0; i < 4; ++i) {
                ((ChunkVertexExtension)this.vertices[i]).iris$ignoresMidBlock(true);
                ((ChunkVertexExtension)this.vertices[i]).iris$setData((byte)class005002.m(), (byte)0, n, class072182.method_10263() & 0xF, class072182.method_10264() & 0xF, class072182.method_10260() & 0xF);
                this.vertices[i].x = (float)(class072182.method_10263() & 0xF) + 0.25f;
                this.vertices[i].y = (float)(class072182.method_10264() & 0xF) + 0.25f;
                this.vertices[i].z = (float)(class072182.method_10260() & 0xF) + 0.25f;
                this.vertices[i].u = 0.0f;
                this.vertices[i].v = 0.0f;
                this.vertices[i].color = 0;
                this.vertices[i].light = class005002.m() << 4 | class005002.m() << 20;
            }
            chunkModelBuilder.getVertexBuffer(ModelQuadFacing.UNASSIGNED).push(this.vertices, DefaultMaterials.CUTOUT_MIPPED);
        }
    }

    private class07878 fillCrashInfo(class07080 class070802, LevelSlice levelSlice, class07209 class072092) {
        class07074 class070742 = class070802.N("Block being rendered", 1);
        if (class072092 != null) {
            class00500 class005002 = null;
            try {
                class005002 = levelSlice.method_8320(class072092);
            }
            catch (Exception exception) {
                // empty catch block
            }
            class07074.N((class07074)class070742, (class05474)levelSlice, (class07209)class072092, (class00500)class005002);
        }
        class070742.N("Chunk section", (Object)this.render);
        if (this.renderContext != null) {
            class070742.N("Render context volume", (Object)this.renderContext.getVolume());
        }
        return new class07878(class070802);
    }

    @Override
    public long estimateTaskSizeWith(MeshTaskSizeEstimator meshTaskSizeEstimator) {
        return meshTaskSizeEstimator.estimateSize(this.render);
    }

    private void handler$bih000$iris$onEnd(ChunkBuildContext chunkBuildContext, CancellationToken cancellationToken, CallbackInfoReturnable callbackInfoReturnable, ChunkBuildBuffers chunkBuildBuffers, class00500 class005002) {
    }
}

