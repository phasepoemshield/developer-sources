/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  minecraft.class00500
 *  minecraft.class01833
 *  minecraft.class01991
 *  minecraft.class02584
 *  minecraft.class05885
 *  minecraft.class06889
 *  minecraft.class07209
 *  minecraft.class07218
 *  minecraft.class08388
 *  minecraft.class08743
 *  minecraft.class08887
 *  net.caffeinemc.mods.sodium.api.util.ColorABGR
 *  net.caffeinemc.mods.sodium.api.util.ColorARGB
 *  net.caffeinemc.mods.sodium.api.util.ColorMixer
 *  net.caffeinemc.mods.sodium.client.compatibility.workarounds.Workarounds
 *  net.caffeinemc.mods.sodium.client.compatibility.workarounds.Workarounds$Reference
 *  net.caffeinemc.mods.sodium.client.model.color.ColorProvider
 *  net.caffeinemc.mods.sodium.client.model.color.ColorProviderRegistry
 *  net.caffeinemc.mods.sodium.client.model.light.LightMode
 *  net.caffeinemc.mods.sodium.client.model.light.LightPipelineProvider
 *  net.caffeinemc.mods.sodium.client.model.quad.ModelQuadView
 *  net.caffeinemc.mods.sodium.client.model.quad.properties.ModelQuadFacing
 *  net.caffeinemc.mods.sodium.client.model.quad.properties.ModelQuadOrientation
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.ChunkBuildBuffers
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.buffers.ChunkModelBuilder
 *  net.caffeinemc.mods.sodium.client.render.chunk.vertex.builder.ChunkMeshBufferBuilder
 *  net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkVertexEncoder$Vertex
 *  net.caffeinemc.mods.sodium.client.render.model.AbstractBlockRenderContext
 *  net.caffeinemc.mods.sodium.client.render.model.MutableQuadViewImpl
 *  net.caffeinemc.mods.sodium.client.render.model.SodiumShadeMode
 *  net.caffeinemc.mods.sodium.client.render.texture.SpriteFinderCache
 *  net.caffeinemc.mods.sodium.client.services.PlatformModelEmitter
 *  net.caffeinemc.mods.sodium.client.world.LevelSlice
 *  net.irisshaders.iris.compat.sodium.mixin.BlockRendererAccessor
 *  net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings
 *  net.irisshaders.iris.vertices.sodium.terrain.ChunkVertexExtension
 *  net.irisshaders.iris.vertices.sodium.terrain.VertexEncoderInterface
 *  org.joml.Vector3f
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package net.caffeinemc.mods.sodium.client.render.chunk.compile.pipeline;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import minecraft.class00500;
import minecraft.class01833;
import minecraft.class01991;
import minecraft.class02584;
import minecraft.class05885;
import minecraft.class06889;
import minecraft.class07209;
import minecraft.class07218;
import minecraft.class08388;
import minecraft.class08743;
import minecraft.class08887;
import net.caffeinemc.mods.sodium.api.util.ColorABGR;
import net.caffeinemc.mods.sodium.api.util.ColorARGB;
import net.caffeinemc.mods.sodium.api.util.ColorMixer;
import net.caffeinemc.mods.sodium.client.compatibility.workarounds.Workarounds;
import net.caffeinemc.mods.sodium.client.model.color.ColorProvider;
import net.caffeinemc.mods.sodium.client.model.color.ColorProviderRegistry;
import net.caffeinemc.mods.sodium.client.model.light.LightMode;
import net.caffeinemc.mods.sodium.client.model.light.LightPipelineProvider;
import net.caffeinemc.mods.sodium.client.model.quad.ModelQuadView;
import net.caffeinemc.mods.sodium.client.model.quad.properties.ModelQuadFacing;
import net.caffeinemc.mods.sodium.client.model.quad.properties.ModelQuadOrientation;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.ChunkBuildBuffers;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.buffers.ChunkModelBuilder;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.pipeline.SpriteContentsExtension;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.pipeline.TextureAtlasSpriteExtension;
import net.caffeinemc.mods.sodium.client.render.chunk.terrain.DefaultTerrainRenderPasses;
import net.caffeinemc.mods.sodium.client.render.chunk.terrain.TerrainRenderPass;
import net.caffeinemc.mods.sodium.client.render.chunk.terrain.material.DefaultMaterials;
import net.caffeinemc.mods.sodium.client.render.chunk.terrain.material.Material;
import net.caffeinemc.mods.sodium.client.render.chunk.terrain.material.parameters.AlphaCutoffParameter;
import net.caffeinemc.mods.sodium.client.render.chunk.terrain.material.parameters.MaterialParameters;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.TranslucentGeometryCollector;
import net.caffeinemc.mods.sodium.client.render.chunk.vertex.builder.ChunkMeshBufferBuilder;
import net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkVertexEncoder;
import net.caffeinemc.mods.sodium.client.render.model.AbstractBlockRenderContext;
import net.caffeinemc.mods.sodium.client.render.model.MutableQuadViewImpl;
import net.caffeinemc.mods.sodium.client.render.model.SodiumShadeMode;
import net.caffeinemc.mods.sodium.client.render.texture.SpriteFinderCache;
import net.caffeinemc.mods.sodium.client.services.PlatformModelEmitter;
import net.caffeinemc.mods.sodium.client.world.LevelSlice;
import net.irisshaders.iris.compat.sodium.mixin.BlockRendererAccessor;
import net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings;
import net.irisshaders.iris.vertices.sodium.terrain.ChunkVertexExtension;
import net.irisshaders.iris.vertices.sodium.terrain.VertexEncoderInterface;
import org.joml.Vector3f;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class BlockRenderer
extends AbstractBlockRenderContext
implements BlockRendererAccessor,
VertexEncoderInterface {
    private final ColorProviderRegistry colorProviderRegistry;
    private final int[] vertexColors = new int[4];
    private final ChunkVertexEncoder.Vertex[] vertices = ChunkVertexEncoder.Vertex.uninitializedQuad();
    private ChunkBuildBuffers buffers;
    private final Vector3f posOffset = new Vector3f();
    private final class07218 scratchPos = new class07218();
    private @Nullable ColorProvider<class00500> colorProvider;
    private TranslucentGeometryCollector collector;
    private boolean hasOverride;
    private int blockId;
    private byte isFluid;
    private byte lightEmission;
    private int localX;
    private int localY;
    private int localZ;
    private int lastBlockId;

    public void prepare(ChunkBuildBuffers chunkBuildBuffers, LevelSlice levelSlice, TranslucentGeometryCollector translucentGeometryCollector) {
        this.buffers = chunkBuildBuffers;
        this.level = levelSlice;
        this.collector = translucentGeometryCollector;
        this.slice = levelSlice;
    }

    public /* synthetic */ ChunkBuildBuffers getBuffers() {
        return this.buffers;
    }

    public BlockRenderer(ColorProviderRegistry colorProviderRegistry, LightPipelineProvider lightPipelineProvider) {
        this.colorProviderRegistry = colorProviderRegistry;
        this.lighters = lightPipelineProvider;
        this.random = new class01833(42L);
    }

    public void release() {
        this.buffers = null;
        this.level = null;
        this.collector = null;
        this.slice = null;
    }

    public void overrideBlock(int n) {
        if (this.lastBlockId != -1) {
            this.lastBlockId = this.blockId;
        }
        this.blockId = n;
    }

    public void restoreBlock() {
        if (this.lastBlockId != -1) {
            this.blockId = this.lastBlockId;
            this.lastBlockId = -1;
        }
    }

    public void beginBlock(int n, byte by, byte by2, int n2, int n3, int n4) {
        this.blockId = n;
        this.isFluid = by;
        this.lightEmission = by2;
        this.localX = n2;
        this.localY = n3;
        this.localZ = n4;
    }

    private void handler$big000$iris$writeVertex(MutableQuadViewImpl mutableQuadViewImpl, float[] fArray, Material material, CallbackInfo callbackInfo, ChunkVertexEncoder.Vertex vertex) {
        ((ChunkVertexExtension)vertex).iris$setData(this.lightEmission, this.isFluid, this.blockId, this.localX, this.localY, this.localZ);
    }

    private void handler$big000$iris$renderModelHead(class08887 class088872, class00500 class005002, class07209 class072092, class07209 class072093, CallbackInfo callbackInfo) {
        if (WorldRenderingSettings.INSTANCE.getBlockTypeIds().containsKey(class005002.i())) {
            this.hasOverride = true;
        }
    }

    private void handler$big000$iris$renderModelTail(class08887 class088872, class00500 class005002, class07209 class072092, class07209 class072093, CallbackInfo callbackInfo) {
        this.hasOverride = false;
    }

    private static TerrainRenderPass getDowngradedPass(class08388 class083882, TerrainRenderPass terrainRenderPass) {
        if (class083882 instanceof TextureAtlasSpriteExtension) {
            TextureAtlasSpriteExtension textureAtlasSpriteExtension = (TextureAtlasSpriteExtension)class083882;
            if (textureAtlasSpriteExtension.sodium$hasUnknownImageContents()) {
                return terrainRenderPass;
            }
            class01991 class019912 = class083882.method_45851();
            if (class019912 instanceof SpriteContentsExtension) {
                SpriteContentsExtension spriteContentsExtension = (SpriteContentsExtension)class019912;
                if (terrainRenderPass == DefaultTerrainRenderPasses.TRANSLUCENT && !spriteContentsExtension.sodium$hasTranslucentPixels()) {
                    terrainRenderPass = DefaultTerrainRenderPasses.CUTOUT;
                }
                if (terrainRenderPass == DefaultTerrainRenderPasses.CUTOUT && !spriteContentsExtension.sodium$hasTransparentPixels()) {
                    terrainRenderPass = DefaultTerrainRenderPasses.SOLID;
                }
            }
        }
        return terrainRenderPass;
    }

    public void processQuad(MutableQuadViewImpl mutableQuadViewImpl) {
        class02584 class025842 = mutableQuadViewImpl.ambientOcclusion();
        SodiumShadeMode sodiumShadeMode = mutableQuadViewImpl.getShadeMode();
        LightMode lightMode = class025842 == class02584.field_52396 ? this.defaultLightMode : (this.useAmbientOcclusion && class025842 != class02584.field_52395 ? LightMode.SMOOTH : LightMode.FLAT);
        boolean bl = mutableQuadViewImpl.emissive();
        class08743 class087432 = mutableQuadViewImpl.getRenderType();
        Material material = DefaultMaterials.forChunkLayer(class087432 == null ? this.defaultRenderType : class087432);
        this.tintQuad(mutableQuadViewImpl);
        this.shadeQuad(mutableQuadViewImpl, lightMode, bl, sodiumShadeMode);
        this.bufferQuad(mutableQuadViewImpl, this.quadLightData.br, material);
    }

    private boolean validateQuadUVs(class08388 class083882) {
        float f = class083882.method_4594();
        float f2 = class083882.method_4577();
        float f3 = class083882.method_4593();
        float f4 = class083882.method_4575();
        for (int i = 0; i < 4; ++i) {
            float f5 = this.vertices[i].u;
            float f6 = this.vertices[i].v;
            if (!(f5 < f || f5 > f2 || f6 < f3) && !(f6 > f4)) continue;
            return false;
        }
        return true;
    }

    private void tintQuad(MutableQuadViewImpl mutableQuadViewImpl) {
        ColorProvider<class00500> colorProvider;
        int n = mutableQuadViewImpl.getTintIndex();
        if (n != -1 && (colorProvider = this.colorProvider) != null) {
            int[] nArray = this.vertexColors;
            colorProvider.getColors(this.slice, this.pos, this.scratchPos, (Object)this.state, (ModelQuadView)mutableQuadViewImpl, nArray, this.slice.hasBiomeBlend());
            for (int i = 0; i < 4; ++i) {
                mutableQuadViewImpl.setColor(i, ColorMixer.mulComponentWise((int)nArray[i], (int)mutableQuadViewImpl.baseColor(i)));
            }
        }
    }

    private void bufferQuad(MutableQuadViewImpl mutableQuadViewImpl, float[] fArray, Material material) {
        ChunkVertexEncoder.Vertex vertex;
        int n;
        ModelQuadOrientation modelQuadOrientation = ModelQuadOrientation.NORMAL;
        ChunkVertexEncoder.Vertex[] vertexArray = this.vertices;
        Vector3f vector3f = this.posOffset;
        for (int i = 0; i < 4; ++i) {
            n = modelQuadOrientation.getVertexIndex(i);
            vertex = vertexArray[i];
            float f = mutableQuadViewImpl.getX(n) + vector3f.x;
            this.handler$big000$iris$writeVertex(mutableQuadViewImpl, fArray, material, null, vertex);
            vertex.x = f;
            vertex.y = mutableQuadViewImpl.getY(n) + vector3f.y;
            vertex.z = mutableQuadViewImpl.getZ(n) + vector3f.z;
            vertex.color = ColorARGB.toABGR((int)mutableQuadViewImpl.baseColor(n));
            vertex.ao = fArray[n];
            vertex.u = mutableQuadViewImpl.getTexU(n);
            vertex.v = mutableQuadViewImpl.getTexV(n);
            vertex.light = mutableQuadViewImpl.getLight(n);
        }
        class08388 class083882 = mutableQuadViewImpl.sprite(SpriteFinderCache.forBlockAtlas());
        n = material.bits();
        vertex = mutableQuadViewImpl.normalFace();
        BlockRenderer blockRenderer = this;
        class08388 class083883 = class083882;
        TerrainRenderPass terrainRenderPass = material.pass;
        TerrainRenderPass terrainRenderPass2 = terrainRenderPass;
        TerrainRenderPass terrainRenderPass3 = this.wrapOperation$big000$iris$skipPassDowngrade(blockRenderer, class083883, terrainRenderPass2, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)3, (String)"[net.caffeinemc.mods.sodium.client.render.chunk.compile.pipeline.BlockRenderer, net.minecraft.class_1058, net.caffeinemc.mods.sodium.client.render.chunk.terrain.TerrainRenderPass]");
            Object[] objectArray2 = objectArray;
            return ((BlockRenderer)((Object)((Object)objectArray[0]))).attemptPassDowngrade((class08388)objectArray2[1], (TerrainRenderPass)objectArray2[2]);
        });
        if (terrainRenderPass3 != null) {
            terrainRenderPass = terrainRenderPass3;
        }
        if (terrainRenderPass.isTranslucent() && this.collector != null && this.collector.appendQuad(vertexArray, (ModelQuadFacing)vertex, mutableQuadViewImpl.getFaceNormal())) {
            return;
        }
        if (terrainRenderPass3 != null && material == DefaultMaterials.TRANSLUCENT && terrainRenderPass == DefaultTerrainRenderPasses.CUTOUT) {
            n = MaterialParameters.pack(AlphaCutoffParameter.HALF, material.mipped);
        }
        ChunkModelBuilder chunkModelBuilder = this.buffers.get(terrainRenderPass);
        ChunkMeshBufferBuilder chunkMeshBufferBuilder = chunkModelBuilder.getVertexBuffer((ModelQuadFacing)vertex);
        chunkMeshBufferBuilder.push(vertexArray, n);
        if (class083882 != null) {
            chunkModelBuilder.addSprite(class083882);
        }
    }

    public void renderModel(class08887 class088872, class00500 class005002, class07209 class072092, class07209 class072093) {
        this.handler$big000$iris$renderModelHead(class088872, class005002, class072092, class072093, null);
        this.state = class005002;
        this.pos = class072092;
        this.prepareAoInfo(true);
        this.posOffset.set((float)class072093.method_10263(), (float)class072093.method_10264(), (float)class072093.method_10260());
        if (class005002.l()) {
            class06889 class068892 = class005002.N(class072092);
            this.posOffset.add((float)class068892.M, (float)class068892.B, (float)class068892.Z);
        }
        this.colorProvider = this.colorProviderRegistry.getColorProvider(class005002.i());
        this.prepareCulling(true);
        this.defaultRenderType = class05885.N((class00500)class005002);
        this.allowDowngrade = true;
        this.random.N(class005002.y(class072092));
        PlatformModelEmitter.getInstance().emitModel(class088872, arg_0 -> ((BlockRenderer)this).isFaceCulled(arg_0), this.getForEmitting(), this.random, this.level, class072092, class005002, (arg_0, arg_1, arg_2) -> ((BlockRenderer)this).bufferDefaultModel(arg_0, arg_1, arg_2));
        this.defaultRenderType = null;
        this.handler$big000$iris$renderModelTail(class088872, class005002, class072092, class072093, null);
    }

    private @Nullable TerrainRenderPass attemptPassDowngrade(class08388 class083882, TerrainRenderPass terrainRenderPass) {
        if (!this.allowDowngrade || Workarounds.isWorkaroundEnabled((Workarounds.Reference)Workarounds.Reference.INTEL_DEPTH_BUFFER_COMPARISON_UNRELIABLE)) {
            return null;
        }
        boolean bl = true;
        boolean bl2 = false;
        for (int i = 0; i < 4; ++i) {
            bl2 |= ColorABGR.unpackAlpha((int)this.vertices[i].color) != 255;
        }
        if (terrainRenderPass.isTranslucent() && bl2) {
            bl = false;
        }
        if (bl) {
            bl = this.validateQuadUVs(class083882);
        }
        if (bl) {
            return BlockRenderer.getDowngradedPass(class083882, terrainRenderPass);
        }
        return null;
    }

    private TerrainRenderPass wrapOperation$big000$iris$skipPassDowngrade(BlockRenderer blockRenderer, class08388 class083882, TerrainRenderPass terrainRenderPass, Operation operation) {
        if (this.hasOverride) {
            return null;
        }
        return (TerrainRenderPass)operation.call(new Object[]{blockRenderer, class083882, terrainRenderPass});
    }
}

