/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Suppliers
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntList
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class01231
 *  minecraft.class04651
 *  minecraft.class04688
 *  minecraft.class04995
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07290
 *  minecraft.class07295
 *  minecraft.class08388
 *  net.caffeinemc.mods.sodium.api.util.ColorARGB
 *  net.caffeinemc.mods.sodium.api.util.NormI8
 *  net.caffeinemc.mods.sodium.client.SodiumClientMod
 *  net.caffeinemc.mods.sodium.client.model.color.ColorProvider
 *  net.caffeinemc.mods.sodium.client.model.light.LightMode
 *  net.caffeinemc.mods.sodium.client.model.light.LightPipeline
 *  net.caffeinemc.mods.sodium.client.model.light.LightPipelineProvider
 *  net.caffeinemc.mods.sodium.client.model.light.data.QuadLightData
 *  net.caffeinemc.mods.sodium.client.model.quad.ModelQuad
 *  net.caffeinemc.mods.sodium.client.model.quad.ModelQuadView
 *  net.caffeinemc.mods.sodium.client.model.quad.ModelQuadViewMutable
 *  net.caffeinemc.mods.sodium.client.model.quad.properties.ModelQuadFacing
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.buffers.ChunkModelBuilder
 *  net.caffeinemc.mods.sodium.client.render.chunk.vertex.builder.ChunkMeshBufferBuilder
 *  net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkVertexEncoder$Vertex
 *  net.caffeinemc.mods.sodium.client.services.PlatformBlockAccess
 *  net.caffeinemc.mods.sodium.client.util.DirectionUtil
 *  net.caffeinemc.mods.sodium.client.world.LevelSlice
 *  net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings
 *  net.irisshaders.iris.vertices.sodium.terrain.ChunkVertexExtension
 *  net.irisshaders.iris.vertices.sodium.terrain.VertexEncoderInterface
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package net.caffeinemc.mods.sodium.client.render.chunk.compile.pipeline;

import com.google.common.base.Suppliers;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.function.Supplier;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class01231;
import minecraft.class04651;
import minecraft.class04688;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07290;
import minecraft.class07295;
import minecraft.class08388;
import net.caffeinemc.mods.sodium.api.util.ColorARGB;
import net.caffeinemc.mods.sodium.api.util.NormI8;
import net.caffeinemc.mods.sodium.client.SodiumClientMod;
import net.caffeinemc.mods.sodium.client.model.color.ColorProvider;
import net.caffeinemc.mods.sodium.client.model.light.LightMode;
import net.caffeinemc.mods.sodium.client.model.light.LightPipeline;
import net.caffeinemc.mods.sodium.client.model.light.LightPipelineProvider;
import net.caffeinemc.mods.sodium.client.model.light.data.QuadLightData;
import net.caffeinemc.mods.sodium.client.model.quad.ModelQuad;
import net.caffeinemc.mods.sodium.client.model.quad.ModelQuadView;
import net.caffeinemc.mods.sodium.client.model.quad.ModelQuadViewMutable;
import net.caffeinemc.mods.sodium.client.model.quad.properties.ModelQuadFacing;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.buffers.ChunkModelBuilder;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.pipeline.ShapeComparisonCache;
import net.caffeinemc.mods.sodium.client.render.chunk.terrain.material.Material;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.TranslucentGeometryCollector;
import net.caffeinemc.mods.sodium.client.render.chunk.vertex.builder.ChunkMeshBufferBuilder;
import net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkVertexEncoder;
import net.caffeinemc.mods.sodium.client.services.PlatformBlockAccess;
import net.caffeinemc.mods.sodium.client.util.DirectionUtil;
import net.caffeinemc.mods.sodium.client.world.LevelSlice;
import net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings;
import net.irisshaders.iris.vertices.sodium.terrain.ChunkVertexExtension;
import net.irisshaders.iris.vertices.sodium.terrain.VertexEncoderInterface;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class DefaultFluidRenderer
implements VertexEncoderInterface {
    public static final float EPSILON = 0.001f;
    private static final float ALIGNED_EQUALS_EPSILON = 0.011f;
    private static final float DISCARD_SAMPLE = -1.0f;
    private static final float FULL_HEIGHT = 0.8888889f;
    private final boolean hiddenFluidCulling;
    private final boolean improvedFluidShaping;
    private final class07218 scratchPos = new class07218();
    private final class07218 secondScratchPos = new class07218();
    private float scratchHeight = 0.0f;
    private int scratchSamples = 0;
    private final IntList stack = new IntArrayList();
    private long visited = 0L;
    private final Supplier<ShapeComparisonCache> occlusionCache = Suppliers.memoize(ShapeComparisonCache::new);
    private final ModelQuadViewMutable quad = new ModelQuad();
    private final LightPipelineProvider lighters;
    private final QuadLightData quadLightData = new QuadLightData();
    private final int[] quadColors = new int[4];
    private final float[] brightness = new float[4];
    private final ChunkVertexEncoder.Vertex[] vertices = ChunkVertexEncoder.Vertex.uninitializedQuad();
    private static final int NO_EXPOSURE = 0;
    private static final int OUTWARDS_EXPOSED = 1;
    private static final int BOTH_EXPOSED = 3;
    private int blockId;
    private int lastBlockId;
    private byte isFluid;
    private byte lightEmission;
    private int localX;
    private int localY;
    private int localZ;

    public DefaultFluidRenderer(LightPipelineProvider lightPipelineProvider) {
        this.quad.setLightFace(class07211.field_11036);
        this.lighters = lightPipelineProvider;
        this.hiddenFluidCulling = SodiumClientMod.options().quality.hiddenFluidCulling;
        this.improvedFluidShaping = SodiumClientMod.options().quality.improvedFluidShaping;
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

    public void render(LevelSlice levelSlice, class00500 class005002, class04688 class046882, class07209 class072092, class07209 class072093, TranslucentGeometryCollector translucentGeometryCollector, ChunkModelBuilder chunkModelBuilder, Material material, ColorProvider<class04688> colorProvider, class08388[] class08388Array) {
        boolean bl;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        boolean bl2;
        class04651 class046512 = class046882.N();
        boolean bl3 = this.isFullBlockFluidVisible((class07295)levelSlice, class072092, class07211.field_11036, class005002, class046882);
        boolean bl4 = this.isFullBlockFluidVisible((class07295)levelSlice, class072092, class07211.field_11033, class005002, class046882) && this.isSideExposedOffset((class07295)levelSlice, class005002, class072092, class07211.field_11033, 0.8888889f);
        boolean bl5 = this.isFullBlockFluidSelfVisible(class005002, class07211.field_11043);
        boolean bl6 = this.isFullBlockFluidSelfVisible(class005002, class07211.field_11035);
        boolean bl7 = this.isFullBlockFluidSelfVisible(class005002, class07211.field_11039);
        boolean bl8 = this.isFullBlockFluidSelfVisible(class005002, class07211.field_11034);
        boolean bl9 = bl5 && this.isFullBlockFluidSideVisible((class07290)levelSlice, class072092, class07211.field_11043, class046882);
        boolean bl10 = bl6 && this.isFullBlockFluidSideVisible((class07290)levelSlice, class072092, class07211.field_11035, class046882);
        boolean bl11 = bl7 && this.isFullBlockFluidSideVisible((class07290)levelSlice, class072092, class07211.field_11039, class046882);
        boolean bl12 = bl2 = bl8 && this.isFullBlockFluidSideVisible((class07290)levelSlice, class072092, class07211.field_11034, class046882);
        if (!(bl3 || bl4 || bl2 || bl11 || bl9 || bl10)) {
            return;
        }
        boolean bl13 = class046882.N(class01231.N);
        float f10 = this.sampleFluidHeight((class07295)levelSlice, class046512, class072092);
        if (f10 >= 1.0f) {
            f9 = 1.0f;
            f8 = 1.0f;
            f7 = 1.0f;
            f6 = 1.0f;
        } else {
            boolean bl14 = bl5 && this.isSideExposedOffset((class07295)levelSlice, class005002, class072092, class07211.field_11043, 1.0f);
            boolean bl15 = bl6 && this.isSideExposedOffset((class07295)levelSlice, class005002, class072092, class07211.field_11035, 1.0f);
            boolean bl16 = bl7 && this.isSideExposedOffset((class07295)levelSlice, class005002, class072092, class07211.field_11039, 1.0f);
            boolean bl17 = bl8 && this.isSideExposedOffset((class07295)levelSlice, class005002, class072092, class07211.field_11034, 1.0f);
            f5 = this.sampleFluidHeight((class07295)levelSlice, class046512, class072092, class07211.field_11043);
            float f11 = this.sampleFluidHeight((class07295)levelSlice, class046512, class072092, class07211.field_11035);
            f4 = this.sampleFluidHeight((class07295)levelSlice, class046512, class072092, class07211.field_11034);
            f3 = this.sampleFluidHeight((class07295)levelSlice, class046512, class072092, class07211.field_11039);
            f9 = this.fluidCornerHeight((class07295)levelSlice, class072092, class046512, f10, class07211.field_11043, class07211.field_11039, f5, f3, bl14, bl16);
            f8 = this.fluidCornerHeight((class07295)levelSlice, class072092, class046512, f10, class07211.field_11035, class07211.field_11039, f11, f3, bl15, bl16);
            f7 = this.fluidCornerHeight((class07295)levelSlice, class072092, class046512, f10, class07211.field_11035, class07211.field_11034, f11, f4, bl15, bl17);
            f6 = this.fluidCornerHeight((class07295)levelSlice, class072092, class046512, f10, class07211.field_11043, class07211.field_11034, f5, f4, bl14, bl17);
            bl9 &= bl14;
            bl10 &= bl15;
            bl11 &= bl16;
            bl2 &= bl17;
        }
        float f12 = !bl4 ? 0.0f : 0.001f;
        ModelQuadViewMutable modelQuadViewMutable = this.quad;
        LightMode lightMode = bl13 && class06202.yb() ? LightMode.SMOOTH : LightMode.FLAT;
        LightPipeline lightPipeline = this.lighters.getLighter(lightMode);
        modelQuadViewMutable.setFlags(0);
        if (bl3) {
            f5 = Math.min(Math.min(f9, f8), Math.min(f7, f6));
            bl3 = this.isSideExposedOffset((class07295)levelSlice, class005002, class072092, class07211.field_11036, f5);
        }
        boolean bl18 = true;
        if (bl3 && class046882.u()) {
            int n = this.getUpFaceExposureByNeighbors((class07295)levelSlice, class072092, class046882);
            if (this.hiddenFluidCulling) {
                bl3 = n != 0;
            }
            boolean bl19 = bl18 = n == 3;
        }
        if (bl3) {
            boolean bl20;
            float f13;
            float f14;
            float f15;
            float f16;
            float f17;
            class08388 class083882;
            f9 -= 0.001f;
            f8 -= 0.001f;
            f7 -= 0.001f;
            f6 -= 0.001f;
            class06889 class068892 = class046882.L((class07290)levelSlice, class072092);
            if (class068892.M == 0.0 && class068892.Z == 0.0) {
                class083882 = class08388Array[0];
                f3 = class083882.method_4580(0.0f);
                f17 = class083882.method_4570(0.0f);
                f2 = f3;
                f16 = class083882.method_4570(1.0f);
                f = class083882.method_4580(1.0f);
                f15 = f16;
                f14 = f;
                f13 = f17;
            } else {
                class083882 = class08388Array[1];
                float f18 = (float)class04995.u((double)class068892.Z, (double)class068892.M) - 1.5707964f;
                float f19 = class04995.m((double)f18) * 0.25f;
                float f20 = class04995.P((double)f18) * 0.25f;
                f3 = class083882.method_4580(0.5f + (-f20 - f19));
                f17 = class083882.method_4570(0.5f + -f20 + f19);
                f2 = class083882.method_4580(0.5f + -f20 + f19);
                f16 = class083882.method_4570(0.5f + f20 + f19);
                f = class083882.method_4580(0.5f + f20 + f19);
                f15 = class083882.method_4570(0.5f + (f20 - f19));
                f14 = class083882.method_4580(0.5f + (f20 - f19));
                f13 = class083882.method_4570(0.5f + (-f20 - f19));
            }
            modelQuadViewMutable.setSprite(class083882);
            bl = DefaultFluidRenderer.isAlignedEquals(f6, f9) && DefaultFluidRenderer.isAlignedEquals(f9, f7) && DefaultFluidRenderer.isAlignedEquals(f7, f8) && DefaultFluidRenderer.isAlignedEquals(f8, f6);
            boolean bl21 = bl20 = bl || f6 > f9 && f6 > f7 || f6 < f9 && f6 < f7 || f8 > f9 && f8 > f7 || f8 < f9 && f8 < f7;
            if (bl20) {
                DefaultFluidRenderer.setVertex(modelQuadViewMutable, 1, 0.0f, f9, 0.0f, f3, f17);
                DefaultFluidRenderer.setVertex(modelQuadViewMutable, 2, 0.0f, f8, 1.0f, f2, f16);
                DefaultFluidRenderer.setVertex(modelQuadViewMutable, 3, 1.0f, f7, 1.0f, f, f15);
                DefaultFluidRenderer.setVertex(modelQuadViewMutable, 0, 1.0f, f6, 0.0f, f14, f13);
            } else {
                DefaultFluidRenderer.setVertex(modelQuadViewMutable, 0, 0.0f, f9, 0.0f, f3, f17);
                DefaultFluidRenderer.setVertex(modelQuadViewMutable, 1, 0.0f, f8, 1.0f, f2, f16);
                DefaultFluidRenderer.setVertex(modelQuadViewMutable, 2, 1.0f, f7, 1.0f, f, f15);
                DefaultFluidRenderer.setVertex(modelQuadViewMutable, 3, 1.0f, f6, 0.0f, f14, f13);
            }
            this.updateQuad(modelQuadViewMutable, levelSlice, class072092, lightPipeline, class07211.field_11036, ModelQuadFacing.POS_Y, 1.0f, colorProvider, class046882);
            this.writeQuad(chunkModelBuilder, translucentGeometryCollector, material, class072093, (ModelQuadView)modelQuadViewMutable, bl ? ModelQuadFacing.POS_Y : ModelQuadFacing.UNASSIGNED, false);
            if (bl18) {
                this.writeQuad(chunkModelBuilder, translucentGeometryCollector, material, class072093, (ModelQuadView)modelQuadViewMutable, bl ? ModelQuadFacing.NEG_Y : ModelQuadFacing.UNASSIGNED, true);
            }
        }
        if (bl4) {
            class08388 class083883 = class08388Array[0];
            f4 = class083883.method_4594();
            f3 = class083883.method_4577();
            f2 = class083883.method_4593();
            f = class083883.method_4575();
            modelQuadViewMutable.setSprite(class083883);
            DefaultFluidRenderer.setVertex(modelQuadViewMutable, 0, 0.0f, f12, 1.0f, f4, f);
            DefaultFluidRenderer.setVertex(modelQuadViewMutable, 1, 0.0f, f12, 0.0f, f4, f2);
            DefaultFluidRenderer.setVertex(modelQuadViewMutable, 2, 1.0f, f12, 0.0f, f3, f2);
            DefaultFluidRenderer.setVertex(modelQuadViewMutable, 3, 1.0f, f12, 1.0f, f3, f);
            this.updateQuad(modelQuadViewMutable, levelSlice, class072092, lightPipeline, class07211.field_11033, ModelQuadFacing.NEG_Y, 1.0f, colorProvider, class046882);
            this.writeQuad(chunkModelBuilder, translucentGeometryCollector, material, class072093, (ModelQuadView)modelQuadViewMutable, ModelQuadFacing.NEG_Y, false);
            class07218 class072182 = this.secondScratchPos.N((class00753)class072092, class07211.field_11033);
            class00500 class005003 = levelSlice.method_8320((class07209)class072182);
            if (!PlatformBlockAccess.getInstance().shouldShowFluidOverlay(class005003, (class07295)levelSlice, (class07209)this.scratchPos, class046882)) {
                boolean bl22 = levelSlice.method_8316((class07209)this.scratchPos.N((class00753)class072182, class07211.field_11043)).N().N(class046512);
                boolean bl23 = levelSlice.method_8316((class07209)this.scratchPos.N((class00753)class072182, class07211.field_11035)).N().N(class046512);
                boolean bl24 = levelSlice.method_8316((class07209)this.scratchPos.N((class00753)class072182, class07211.field_11039)).N().N(class046512);
                bl = levelSlice.method_8316((class07209)this.scratchPos.N((class00753)class072182, class07211.field_11034)).N().N(class046512);
                if (bl22 || bl23 || bl24 || bl) {
                    this.writeQuad(chunkModelBuilder, translucentGeometryCollector, material, class072093, (ModelQuadView)modelQuadViewMutable, ModelQuadFacing.POS_Y, true);
                }
            }
        }
        modelQuadViewMutable.setFlags(6);
        block6: for (class07211 class072112 : DirectionUtil.HORIZONTAL_DIRECTIONS) {
            float f21;
            float f22;
            float f23;
            float f24;
            float f25;
            switch (class072112) {
                case field_11043: {
                    if (!bl9) continue block6;
                    f = f9;
                    f25 = f6;
                    f24 = 0.0f;
                    f23 = 1.0f;
                    f21 = f22 = 0.001f;
                    break;
                }
                case field_11035: {
                    if (!bl10) continue block6;
                    f = f7;
                    f25 = f8;
                    f24 = 1.0f;
                    f23 = 0.0f;
                    f21 = f22 = 0.999f;
                    break;
                }
                case field_11039: {
                    if (!bl11) continue block6;
                    f = f8;
                    f25 = f9;
                    f23 = f24 = 0.001f;
                    f22 = 1.0f;
                    f21 = 0.0f;
                    break;
                }
                case field_11034: {
                    if (!bl2) continue block6;
                    f = f6;
                    f25 = f7;
                    f23 = f24 = 0.999f;
                    f22 = 0.0f;
                    f21 = 1.0f;
                    break;
                }
                default: {
                    continue block6;
                }
            }
            float f26 = Math.max(f, f25);
            this.scratchPos.N((class00753)class072092, class072112);
            if (!this.isFluidSideExposed((class07295)levelSlice, class005002, (class07209)this.scratchPos, class072112, f26)) continue;
            class08388 class083884 = class08388Array[1];
            boolean bl25 = false;
            if (class08388Array.length > 2 && class08388Array[2] != null) {
                class00500 class005004 = levelSlice.method_8320((class07209)this.scratchPos);
                if (PlatformBlockAccess.getInstance().shouldShowFluidOverlay(class005004, (class07295)levelSlice, (class07209)this.scratchPos, class046882)) {
                    class083884 = class08388Array[2];
                    bl25 = true;
                }
            }
            float f27 = class083884.method_4580(0.5f);
            float f28 = class083884.method_4580(0.0f);
            float f29 = class083884.method_4570((1.0f - f) * 0.5f);
            float f30 = class083884.method_4570((1.0f - f25) * 0.5f);
            float f31 = class083884.method_4570(0.5f);
            modelQuadViewMutable.setSprite(class083884);
            DefaultFluidRenderer.setVertex(modelQuadViewMutable, 0, f23, f25, f21, f28, f30);
            DefaultFluidRenderer.setVertex(modelQuadViewMutable, 1, f23, f12, f21, f28, f31);
            DefaultFluidRenderer.setVertex(modelQuadViewMutable, 2, f24, f12, f22, f27, f31);
            DefaultFluidRenderer.setVertex(modelQuadViewMutable, 3, f24, f, f22, f27, f29);
            float f32 = class072112.z() == class07185.field_11051 ? 0.8f : 0.6f;
            ModelQuadFacing modelQuadFacing = ModelQuadFacing.fromDirection((class07211)class072112);
            class04688 class046883 = class046882;
            ColorProvider<class04688> colorProvider2 = colorProvider;
            float f33 = f32;
            this.updateQuad(modelQuadViewMutable, levelSlice, class072092, lightPipeline, class072112, modelQuadFacing, this.modify$bik000$iris$setBrightness(f33), colorProvider2, class046883);
            this.writeQuad(chunkModelBuilder, translucentGeometryCollector, material, class072093, (ModelQuadView)modelQuadViewMutable, modelQuadFacing, false);
            if (bl25) continue;
            this.writeQuad(chunkModelBuilder, translucentGeometryCollector, material, class072093, (ModelQuadView)modelQuadViewMutable, modelQuadFacing.getOpposite(), true);
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

    private boolean isFullBlockFluidSideVisible(class07290 class072902, class07209 class072092, class07211 class072112, class04688 class046882) {
        class00500 class005002 = class072902.method_8320((class07209)this.secondScratchPos.N((class00753)class072092, class072112));
        if (PlatformBlockAccess.getInstance().shouldOccludeFluid(class072112.b(), class005002, class046882)) {
            return false;
        }
        if (class005002.Y().N().N(class046882.N())) {
            return false;
        }
        if (class072112 == class07211.field_11036) {
            return true;
        }
        if (!class005002.G()) {
            return true;
        }
        class00494 class004942 = class005002.N(DirectionUtil.getOpposite((class07211)class072112));
        if (ShapeComparisonCache.isEmptyShape(class004942)) {
            return true;
        }
        return !ShapeComparisonCache.isFullShape(class004942);
    }

    private int getUpFaceExposureByNeighbors(class07295 class072952, class07209 class072092, class04688 class046882) {
        int n = this.hiddenFluidCulling ? 2 : 1;
        this.visited = 0L;
        this.stack.clear();
        int n2 = 0;
        if ((n2 |= this.visitExposureNeighbor(class072952, class072092, class046882, 0, 0)) == 3) {
            return n2;
        }
        while (!this.stack.isEmpty()) {
            int n3 = this.stack.removeInt(this.stack.size() - 1);
            int n4 = this.stack.removeInt(this.stack.size() - 1);
            if (n4 < n && (n2 |= this.visitExposureNeighbor(class072952, class072092, class046882, n4 + 1, n3)) == 3) {
                return n2;
            }
            if (n4 > -n && (n2 |= this.visitExposureNeighbor(class072952, class072092, class046882, n4 - 1, n3)) == 3) {
                return n2;
            }
            if (n3 < n && (n2 |= this.visitExposureNeighbor(class072952, class072092, class046882, n4, n3 + 1)) == 3) {
                return n2;
            }
            if (n3 <= -n || (n2 |= this.visitExposureNeighbor(class072952, class072092, class046882, n4, n3 - 1)) != 3) continue;
            return n2;
        }
        return n2;
    }

    private float modify$bik000$iris$setBrightness(float f) {
        return WorldRenderingSettings.INSTANCE.shouldDisableDirectionalShading() ? 1.0f : f;
    }

    private boolean isFullBlockFluidSelfVisible(class00500 class005002, class07211 class072112) {
        return this.isFluidSelfVisible(class005002, class072112, class00389.y());
    }

    private void handler$bik000$iris$writeVertex(ChunkModelBuilder chunkModelBuilder, TranslucentGeometryCollector translucentGeometryCollector, Material material, class07209 class072092, ModelQuadView modelQuadView, ModelQuadFacing modelQuadFacing, boolean bl, CallbackInfo callbackInfo, ChunkVertexEncoder.Vertex vertex) {
        ((ChunkVertexExtension)vertex).iris$setData(this.lightEmission, this.isFluid, this.blockId, this.localX, this.localY, this.localZ);
    }

    private boolean isFluidSelfVisible(class00500 class005002, class07211 class072112, class00494 class004942) {
        class00494 class004943;
        if (class005002.G() && !ShapeComparisonCache.isEmptyShape(class004943 = class005002.N(class072112))) {
            if (ShapeComparisonCache.isFullShape(class004943) && ShapeComparisonCache.isFullShape(class004942)) {
                return false;
            }
            return this.occlusionCache.get().lookup(class004942, class004943);
        }
        return true;
    }

    private boolean isFluidSideExposed(class00500 class005002, class00500 class005003, class07211 class072112, float f) {
        if (f <= 0.0f) {
            return false;
        }
        if (!class005003.G()) {
            return true;
        }
        if (class072112 == class07211.field_11036 && f < 1.0f) {
            return true;
        }
        class00494 class004942 = class005003.N(DirectionUtil.getOpposite((class07211)class072112));
        if (ShapeComparisonCache.isEmptyShape(class004942)) {
            return true;
        }
        if (ShapeComparisonCache.isFullShape(class004942)) {
            return false;
        }
        class00494 class004943 = f >= 1.0f ? class00389.y() : class00389.N((double)0.0, (double)0.0, (double)0.0, (double)1.0, (double)f, (double)1.0);
        class00494 class004944 = class005002.N(class072112);
        return this.occlusionCache.get().lookup(class004943, class004942, class004944);
    }

    private boolean isFluidSideExposed(class07295 class072952, class00500 class005002, class07209 class072092, class07211 class072112, float f) {
        return this.isFluidSideExposed(class005002, class072952.method_8320(class072092), class072112, f);
    }

    private float sampleFluidHeight(class07295 class072952, class04651 class046512, class07209 class072092, class07211 class072112) {
        return this.sampleFluidHeight(class072952, class046512, (class07209)this.scratchPos.N((class00753)class072092, class072112));
    }

    private float sampleFluidHeight(class07295 class072952, class04651 class046512, class07209 class072092) {
        class00500 class005002 = class072952.method_8320(class072092);
        class04688 class046882 = class005002.Y();
        if (class046512.N(class046882.N())) {
            class04688 class046883 = class072952.method_8316((class07209)this.scratchPos.N((class00753)class072092, class07211.field_11036));
            if (class046512.N(class046883.N())) {
                return 1.0f;
            }
            return class046882.i();
        }
        if (!class005002.B()) {
            return 0.0f;
        }
        return -1.0f;
    }

    private void addHeightSample(float f) {
        if (f >= 0.8f) {
            this.scratchHeight += f * 10.0f;
            this.scratchSamples += 10;
        } else if (f >= 0.0f) {
            this.scratchHeight += f;
            ++this.scratchSamples;
        }
    }

    private long offsetToMask(int n, int n2) {
        return 1L << n + 2 + (n2 + 2) * 5;
    }

    private static boolean isAlignedEquals(float f, float f2) {
        return Math.abs(f - f2) <= 0.011f;
    }

    private float fluidCornerHeight(class07295 class072952, class07209 class072092, class04651 class046512, float f, class07211 class072112, class07211 class072113, float f2, float f3, boolean bl, boolean bl2) {
        float f4;
        float f5;
        if (this.improvedFluidShaping) {
            float f6;
            f5 = bl ? f2 : -1.0f;
            float f7 = f6 = bl2 ? f3 : -1.0f;
            if (f5 >= 1.0f || f6 >= 1.0f) {
                return 1.0f;
            }
            f4 = this.sampleFluidCornerSmart(class072952, class072092, class046512, class072112, class072113, f2, f3, bl, bl2, f5, f6);
        } else {
            if (f2 >= 1.0f || f3 >= 1.0f) {
                return 1.0f;
            }
            f4 = this.sampleFluidCornerBasic(class072952, class072092, class046512, class072112, class072113, f2, f3);
        }
        if (f4 >= 1.0f) {
            return 1.0f;
        }
        this.addHeightSample(f);
        f5 = this.scratchHeight / (float)this.scratchSamples;
        this.scratchHeight = 0.0f;
        this.scratchSamples = 0;
        return f5;
    }

    private void writeQuad(ChunkModelBuilder chunkModelBuilder, TranslucentGeometryCollector translucentGeometryCollector, Material material, class07209 class072092, ModelQuadView modelQuadView, ModelQuadFacing modelQuadFacing, boolean bl) {
        ChunkVertexEncoder.Vertex[] vertexArray = this.vertices;
        for (int i = 0; i < 4; ++i) {
            ChunkVertexEncoder.Vertex vertex = vertexArray[bl ? 3 - i + 1 & 3 : i];
            float f = (float)class072092.method_10263() + modelQuadView.getX(i);
            this.handler$bik000$iris$writeVertex(chunkModelBuilder, translucentGeometryCollector, material, class072092, modelQuadView, modelQuadFacing, bl, null, vertex);
            vertex.x = f;
            vertex.y = (float)class072092.method_10264() + modelQuadView.getY(i);
            vertex.z = (float)class072092.method_10260() + modelQuadView.getZ(i);
            vertex.color = this.quadColors[i];
            vertex.ao = this.brightness[i];
            vertex.u = modelQuadView.getTexU(i);
            vertex.v = modelQuadView.getTexV(i);
            vertex.light = this.quadLightData.lm[i];
        }
        class08388 class083882 = modelQuadView.getSprite();
        if (class083882 != null) {
            chunkModelBuilder.addSprite(class083882);
        }
        if (material.isTranslucent() && translucentGeometryCollector != null) {
            int n = modelQuadFacing.isAligned() ? modelQuadFacing.getPackedAlignedNormal() : modelQuadView.getFaceNormal();
            if (bl) {
                n = NormI8.flipPacked((int)n);
            }
            if (translucentGeometryCollector.appendQuad(vertexArray, modelQuadFacing, n)) {
                return;
            }
        }
        ChunkMeshBufferBuilder chunkMeshBufferBuilder = chunkModelBuilder.getVertexBuffer(modelQuadFacing);
        chunkMeshBufferBuilder.push(vertexArray, material);
    }

    private static void setVertex(ModelQuadViewMutable modelQuadViewMutable, int n, float f, float f2, float f3, float f4, float f5) {
        modelQuadViewMutable.setX(n, f);
        modelQuadViewMutable.setY(n, f2);
        modelQuadViewMutable.setZ(n, f3);
        modelQuadViewMutable.setTexU(n, f4);
        modelQuadViewMutable.setTexV(n, f5);
    }

    private void updateQuad(ModelQuadViewMutable modelQuadViewMutable, LevelSlice levelSlice, class07209 class072092, LightPipeline lightPipeline, class07211 class072112, ModelQuadFacing modelQuadFacing, float f, ColorProvider<class04688> colorProvider, class04688 class046882) {
        int n = modelQuadFacing.isAligned() ? modelQuadFacing.getPackedAlignedNormal() : modelQuadViewMutable.calculateNormal();
        modelQuadViewMutable.setFaceNormal(n);
        QuadLightData quadLightData = this.quadLightData;
        lightPipeline.calculate((ModelQuadView)modelQuadViewMutable, class072092, quadLightData, null, class072112, false, false);
        colorProvider.getColors(levelSlice, class072092, this.scratchPos, (Object)class046882, (ModelQuadView)modelQuadViewMutable, this.quadColors, levelSlice.hasBiomeBlend());
        for (int i = 0; i < 4; ++i) {
            this.quadColors[i] = ColorARGB.toABGR((int)this.quadColors[i]);
            this.brightness[i] = quadLightData.br[i] * f;
        }
    }

    private float sampleFluidCornerSmart(class07295 class072952, class07209 class072092, class04651 class046512, class07211 class072112, class07211 class072113, float f, float f2, boolean bl, boolean bl2, float f3, float f4) {
        boolean bl3 = false;
        if (f3 > 0.0f || f4 > 0.0f) {
            class07218 class072182 = this.scratchPos.N((class00753)class072092, class072112);
            class00500 class005002 = class072952.method_8320((class07209)class072182);
            boolean bl4 = this.isFullBlockFluidSelfVisible(class005002, class072113) && this.isSideExposedOffset(class072952, class005002, (class07209)class072182, class072113, 1.0f);
            class07218 class072183 = this.scratchPos.N((class00753)class072092, class072113);
            class00500 class005003 = class072952.method_8320((class07209)class072183);
            boolean bl5 = this.isFullBlockFluidSelfVisible(class005003, class072112) && this.isSideExposedOffset(class072952, class005003, (class07209)class072183, class072112, 1.0f);
            boolean bl6 = bl3 = bl4 && bl5;
            if (bl && bl4 || bl2 && bl5) {
                class07218 class072184 = this.scratchPos.N((class00753)class072092).N(class072112).N(class072113);
                float f5 = this.sampleFluidHeight(class072952, class046512, (class07209)class072184);
                if (f5 >= 1.0f) {
                    return 1.0f;
                }
                this.addHeightSample(f5);
            }
        }
        if (bl || bl2 && bl3) {
            this.addHeightSample(f);
        }
        if (bl2 || bl && bl3) {
            this.addHeightSample(f2);
        }
        return Float.NaN;
    }

    private boolean isSideExposedOffset(class07295 class072952, class00500 class005002, class07209 class072092, class07211 class072112, float f) {
        return this.isFluidSideExposed(class072952, class005002, (class07209)this.scratchPos.N((class00753)class072092, class072112), class072112, f);
    }

    private int visitExposureNeighbor(class07295 class072952, class07209 class072092, class04688 class046882, int n, int n2) {
        long l = this.offsetToMask(n, n2);
        if ((this.visited & l) != 0L) {
            return 0;
        }
        this.visited |= l;
        class00500 class005002 = class072952.method_8320((class07209)this.scratchPos.N((class00753)class072092, n, 0, n2));
        if (class005002.t()) {
            return 0;
        }
        class04651 class046512 = class046882.N();
        class00500 class005003 = class072952.method_8320((class07209)this.scratchPos.N(class07211.field_11036));
        boolean bl = class005003.Y().N(class046512);
        int n3 = 0;
        if (class005002.Y().N(class046512)) {
            if (!bl) {
                this.stack.add(n);
                this.stack.add(n2);
            }
        } else {
            n3 = 1;
        }
        if (!bl && !class005003.t()) {
            if (!PlatformBlockAccess.getInstance().shouldShowFluidOverlay(class005003, class072952, (class07209)this.scratchPos, class046882)) {
                return 3;
            }
            n3 |= 1;
        }
        return n3;
    }

    private boolean isFullBlockFluidVisible(class07295 class072952, class07209 class072092, class07211 class072112, class00500 class005002, class04688 class046882) {
        return this.isFullBlockFluidSelfVisible(class005002, class072112) && this.isFullBlockFluidSideVisible((class07290)class072952, class072092, class072112, class046882);
    }

    private float sampleFluidCornerBasic(class07295 class072952, class07209 class072092, class04651 class046512, class07211 class072112, class07211 class072113, float f, float f2) {
        if (f > 0.0f || f2 > 0.0f) {
            class07218 class072182 = this.scratchPos.N((class00753)class072092).N(class072112).N(class072113);
            float f3 = this.sampleFluidHeight(class072952, class046512, (class07209)class072182);
            if (f3 >= 1.0f) {
                return 1.0f;
            }
            this.addHeightSample(f3);
        }
        this.addHeightSample(f);
        this.addHeightSample(f2);
        return Float.NaN;
    }
}

