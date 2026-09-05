/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09078
 *  Nursultan.class09317
 *  Nursultan.class10203
 *  Nursultan.class10991
 *  Nursultan.class11925
 *  Nursultan.class11938
 *  Nursultan.class12027
 *  baritone.api.BaritoneAPI
 *  baritone.api.IBaritone
 *  baritone.api.event.events.RenderEvent
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.mojang.blaze3d.buffers.GpuBufferSlice
 *  com.mojang.blaze3d.systems.CommandEncoder
 *  com.mojang.blaze3d.systems.RenderPass$class_10885
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.textures.AddressMode
 *  com.mojang.blaze3d.textures.FilterMode
 *  com.mojang.blaze3d.textures.GpuTexture
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap$Entry
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 *  me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod
 *  me.flashyreese.mods.sodiumextra.mixin.optimizations.beacon_beam_rendering.LevelRendererAccessor
 *  minecraft.class00183
 *  minecraft.class00392
 *  minecraft.class00394
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00608
 *  minecraft.class00737
 *  minecraft.class00753
 *  minecraft.class00951
 *  minecraft.class00985
 *  minecraft.class00987
 *  minecraft.class01056
 *  minecraft.class01089
 *  minecraft.class01237
 *  minecraft.class01241
 *  minecraft.class01296
 *  minecraft.class01301
 *  minecraft.class01315
 *  minecraft.class01383
 *  minecraft.class01386
 *  minecraft.class01390
 *  minecraft.class01391
 *  minecraft.class01407
 *  minecraft.class01421
 *  minecraft.class01422
 *  minecraft.class01423
 *  minecraft.class01434
 *  minecraft.class01540
 *  minecraft.class01781
 *  minecraft.class01825
 *  minecraft.class01861
 *  minecraft.class01886
 *  minecraft.class01894
 *  minecraft.class01999
 *  minecraft.class02233
 *  minecraft.class02409
 *  minecraft.class02410
 *  minecraft.class02416
 *  minecraft.class02418
 *  minecraft.class02425
 *  minecraft.class02437
 *  minecraft.class02438
 *  minecraft.class02452
 *  minecraft.class02456
 *  minecraft.class02566
 *  minecraft.class02725
 *  minecraft.class02731
 *  minecraft.class02734
 *  minecraft.class02762
 *  minecraft.class02959
 *  minecraft.class03176
 *  minecraft.class03345
 *  minecraft.class03365
 *  minecraft.class03386
 *  minecraft.class03448
 *  minecraft.class03579
 *  minecraft.class04410
 *  minecraft.class04453
 *  minecraft.class04643
 *  minecraft.class04755
 *  minecraft.class04790
 *  minecraft.class04798
 *  minecraft.class04866
 *  minecraft.class04995
 *  minecraft.class05363
 *  minecraft.class05509
 *  minecraft.class05630
 *  minecraft.class05885
 *  minecraft.class05911
 *  minecraft.class05932
 *  minecraft.class06092
 *  minecraft.class06141
 *  minecraft.class06176
 *  minecraft.class06183
 *  minecraft.class06202
 *  minecraft.class06532
 *  minecraft.class06541
 *  minecraft.class06722
 *  minecraft.class06724
 *  minecraft.class06728
 *  minecraft.class06732
 *  minecraft.class06734
 *  minecraft.class06739
 *  minecraft.class06748
 *  minecraft.class06851
 *  minecraft.class06889
 *  minecraft.class06959
 *  minecraft.class06964
 *  minecraft.class06969
 *  minecraft.class06971
 *  minecraft.class06973
 *  minecraft.class07047
 *  minecraft.class07049
 *  minecraft.class07089
 *  minecraft.class07113
 *  minecraft.class07131
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07295
 *  minecraft.class07299
 *  minecraft.class07311
 *  minecraft.class07321
 *  minecraft.class07360
 *  minecraft.class07438
 *  minecraft.class07529
 *  minecraft.class07536
 *  minecraft.class08053
 *  minecraft.class08057
 *  minecraft.class08066
 *  minecraft.class08086
 *  minecraft.class08117
 *  minecraft.class08133
 *  minecraft.class08141
 *  minecraft.class08188
 *  minecraft.class08212
 *  minecraft.class08290
 *  minecraft.class08337
 *  minecraft.class08396
 *  minecraft.class08521
 *  minecraft.class08543
 *  minecraft.class08575
 *  minecraft.class08626
 *  minecraft.class08627
 *  minecraft.class08700
 *  minecraft.class08718
 *  minecraft.class08728
 *  minecraft.class08760
 *  minecraft.class08768
 *  minecraft.class08777
 *  minecraft.class08800
 *  minecraft.class08874
 *  minecraft.class09033
 *  net.caffeinemc.mods.sodium.client.SodiumClientMod
 *  net.caffeinemc.mods.sodium.client.gl.device.RenderDevice
 *  net.caffeinemc.mods.sodium.client.render.SodiumWorldRenderer
 *  net.caffeinemc.mods.sodium.client.render.chunk.ChunkRenderMatrices
 *  net.caffeinemc.mods.sodium.client.render.viewport.Viewport
 *  net.caffeinemc.mods.sodium.client.render.viewport.ViewportProvider
 *  net.caffeinemc.mods.sodium.client.util.FlawlessFrames
 *  net.caffeinemc.mods.sodium.client.util.FogStorage
 *  net.caffeinemc.mods.sodium.client.util.SodiumChunkSection
 *  net.caffeinemc.mods.sodium.client.world.LevelRendererExtension
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.rendering.v1.InvalidateRenderStateCallback
 *  net.fabricmc.fabric.api.client.rendering.v1.world.WorldExtractionContext
 *  net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext
 *  net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents
 *  net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents$AfterBlockOutlineExtraction
 *  net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents$AfterEntities
 *  net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents$BeforeBlockOutline
 *  net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents$BeforeEntities
 *  net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents$BeforeTranslucent
 *  net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents$DebugRender
 *  net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents$EndExtraction
 *  net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents$EndMain
 *  net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents$StartMain
 *  net.fabricmc.fabric.api.client.rendering.v1.world.WorldTerrainRenderContext
 *  net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys$Client
 *  net.fabricmc.fabric.impl.client.rendering.world.WorldExtractionContextImpl
 *  net.fabricmc.fabric.impl.client.rendering.world.WorldRenderContextImpl
 *  net.fabricmc.fabric.impl.resource.FabricResourceReloader
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.api.v0.IrisApi
 *  net.irisshaders.iris.compat.dh.DHCompat
 *  net.irisshaders.iris.fantastic.ParticleRenderingPhase
 *  net.irisshaders.iris.fantastic.PhasedParticleEngine
 *  net.irisshaders.iris.gl.IrisRenderSystem
 *  net.irisshaders.iris.layer.IsOutlineRenderStateShard
 *  net.irisshaders.iris.layer.OuterWrappedRenderType
 *  net.irisshaders.iris.layer.RenderingWrapper
 *  net.irisshaders.iris.mixin.CloudRendererAccessor
 *  net.irisshaders.iris.mixin.LevelRendererAccessor
 *  net.irisshaders.iris.mixin.fantastic.FeatureRenderDispatcherAccessor
 *  net.irisshaders.iris.mixinterface.ParticleRenderStateExtension
 *  net.irisshaders.iris.pathways.HandRenderer
 *  net.irisshaders.iris.pipeline.IrisRenderingPipeline
 *  net.irisshaders.iris.pipeline.WorldRenderingPhase
 *  net.irisshaders.iris.pipeline.WorldRenderingPipeline
 *  net.irisshaders.iris.shaderpack.properties.ParticleRenderingSettings
 *  net.irisshaders.iris.shadows.CullingDataCache
 *  net.irisshaders.iris.shadows.frustum.fallback.NonCullingFrustum
 *  net.irisshaders.iris.uniforms.CapturedRenderingState
 *  net.irisshaders.iris.uniforms.IrisTimeUniforms
 *  net.irisshaders.iris.vertices.ImmediateState
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fStack
 *  org.joml.Matrix4fc
 *  org.joml.Vector4f
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 *  page.langeweile.ok_zoomer.utils.ZoomUtils
 *  page.langeweile.ok_zoomer.zoom.Zoom
 */
package minecraft;

import Nursultan.class09078;
import Nursultan.class09317;
import Nursultan.class10203;
import Nursultan.class10991;
import Nursultan.class11925;
import Nursultan.class11938;
import Nursultan.class12027;
import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.event.events.RenderEvent;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.AddressMode;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTexture;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.SortedSet;
import java.util.function.Consumer;
import me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod;
import me.flashyreese.mods.sodiumextra.mixin.optimizations.beacon_beam_rendering.LevelRendererAccessor;
import minecraft.class00183;
import minecraft.class00392;
import minecraft.class00394;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00608;
import minecraft.class00737;
import minecraft.class00753;
import minecraft.class00951;
import minecraft.class00985;
import minecraft.class00987;
import minecraft.class01056;
import minecraft.class01089;
import minecraft.class01237;
import minecraft.class01241;
import minecraft.class01296;
import minecraft.class01301;
import minecraft.class01315;
import minecraft.class01383;
import minecraft.class01386;
import minecraft.class01390;
import minecraft.class01391;
import minecraft.class01407;
import minecraft.class01421;
import minecraft.class01422;
import minecraft.class01423;
import minecraft.class01434;
import minecraft.class01540;
import minecraft.class01781;
import minecraft.class01825;
import minecraft.class01861;
import minecraft.class01886;
import minecraft.class01894;
import minecraft.class01999;
import minecraft.class02233;
import minecraft.class02409;
import minecraft.class02410;
import minecraft.class02416;
import minecraft.class02418;
import minecraft.class02425;
import minecraft.class02437;
import minecraft.class02438;
import minecraft.class02452;
import minecraft.class02456;
import minecraft.class02566;
import minecraft.class02725;
import minecraft.class02731;
import minecraft.class02734;
import minecraft.class02762;
import minecraft.class02959;
import minecraft.class03042;
import minecraft.class03071;
import minecraft.class03074;
import minecraft.class03082;
import minecraft.class03106;
import minecraft.class03176;
import minecraft.class03345;
import minecraft.class03365;
import minecraft.class03386;
import minecraft.class03448;
import minecraft.class03579;
import minecraft.class04410;
import minecraft.class04453;
import minecraft.class04643;
import minecraft.class04755;
import minecraft.class04790;
import minecraft.class04798;
import minecraft.class04866;
import minecraft.class04995;
import minecraft.class05363;
import minecraft.class05509;
import minecraft.class05630;
import minecraft.class05885;
import minecraft.class05911;
import minecraft.class05932;
import minecraft.class06092;
import minecraft.class06141;
import minecraft.class06176;
import minecraft.class06183;
import minecraft.class06202;
import minecraft.class06532;
import minecraft.class06541;
import minecraft.class06722;
import minecraft.class06724;
import minecraft.class06728;
import minecraft.class06732;
import minecraft.class06734;
import minecraft.class06739;
import minecraft.class06748;
import minecraft.class06851;
import minecraft.class06889;
import minecraft.class06959;
import minecraft.class06964;
import minecraft.class06969;
import minecraft.class06971;
import minecraft.class06973;
import minecraft.class07047;
import minecraft.class07049;
import minecraft.class07089;
import minecraft.class07113;
import minecraft.class07131;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07295;
import minecraft.class07299;
import minecraft.class07311;
import minecraft.class07321;
import minecraft.class07360;
import minecraft.class07438;
import minecraft.class07529;
import minecraft.class07536;
import minecraft.class08053;
import minecraft.class08057;
import minecraft.class08066;
import minecraft.class08086;
import minecraft.class08117;
import minecraft.class08133;
import minecraft.class08141;
import minecraft.class08188;
import minecraft.class08212;
import minecraft.class08290;
import minecraft.class08337;
import minecraft.class08396;
import minecraft.class08521;
import minecraft.class08543;
import minecraft.class08575;
import minecraft.class08626;
import minecraft.class08627;
import minecraft.class08700;
import minecraft.class08718;
import minecraft.class08728;
import minecraft.class08760;
import minecraft.class08768;
import minecraft.class08777;
import minecraft.class08800;
import minecraft.class08874;
import minecraft.class09033;
import net.caffeinemc.mods.sodium.client.SodiumClientMod;
import net.caffeinemc.mods.sodium.client.gl.device.RenderDevice;
import net.caffeinemc.mods.sodium.client.render.SodiumWorldRenderer;
import net.caffeinemc.mods.sodium.client.render.chunk.ChunkRenderMatrices;
import net.caffeinemc.mods.sodium.client.render.viewport.Viewport;
import net.caffeinemc.mods.sodium.client.render.viewport.ViewportProvider;
import net.caffeinemc.mods.sodium.client.util.FlawlessFrames;
import net.caffeinemc.mods.sodium.client.util.FogStorage;
import net.caffeinemc.mods.sodium.client.util.SodiumChunkSection;
import net.caffeinemc.mods.sodium.client.world.LevelRendererExtension;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.InvalidateRenderStateCallback;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldExtractionContext;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldTerrainRenderContext;
import net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys;
import net.fabricmc.fabric.impl.client.rendering.world.WorldExtractionContextImpl;
import net.fabricmc.fabric.impl.client.rendering.world.WorldRenderContextImpl;
import net.fabricmc.fabric.impl.resource.FabricResourceReloader;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.api.v0.IrisApi;
import net.irisshaders.iris.compat.dh.DHCompat;
import net.irisshaders.iris.fantastic.ParticleRenderingPhase;
import net.irisshaders.iris.fantastic.PhasedParticleEngine;
import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.layer.IsOutlineRenderStateShard;
import net.irisshaders.iris.layer.OuterWrappedRenderType;
import net.irisshaders.iris.layer.RenderingWrapper;
import net.irisshaders.iris.mixin.CloudRendererAccessor;
import net.irisshaders.iris.mixin.fantastic.FeatureRenderDispatcherAccessor;
import net.irisshaders.iris.mixinterface.ParticleRenderStateExtension;
import net.irisshaders.iris.pathways.HandRenderer;
import net.irisshaders.iris.pipeline.IrisRenderingPipeline;
import net.irisshaders.iris.pipeline.WorldRenderingPhase;
import net.irisshaders.iris.pipeline.WorldRenderingPipeline;
import net.irisshaders.iris.shaderpack.properties.ParticleRenderingSettings;
import net.irisshaders.iris.shadows.CullingDataCache;
import net.irisshaders.iris.shadows.frustum.fallback.NonCullingFrustum;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import net.irisshaders.iris.uniforms.IrisTimeUniforms;
import net.irisshaders.iris.vertices.ImmediateState;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.joml.Matrix4fc;
import org.joml.Vector4f;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import page.langeweile.ok_zoomer.utils.ZoomUtils;
import page.langeweile.ok_zoomer.zoom.Zoom;

@Environment(value=EnvType.CLIENT)
public class class03063
implements class06141,
AutoCloseable,
LevelRendererAccessor,
LevelRendererExtension,
FabricResourceReloader,
net.irisshaders.iris.mixin.LevelRendererAccessor,
CullingDataCache {
    private static final class01894 U = class01894.y((String)"transparency");
    private static final class01894 E = class01894.y((String)"entity_outline");
    public static final int N = 16;
    public static final int y = 8;
    public static final int L = 32;
    private static final int W = 15;
    private static final float m = 0.3f;
    private final class06202 P;
    private final class01781 s;
    private final class03579 T;
    public class01386 u;
    private @Nullable class02409 b;
    private final class02416 j;
    private final class02410 v;
    private final class02425 n;
    private final class00987 t;
    public final class01861 i;
    public final class05509 R;
    private @Nullable class03448 G;
    private final class01886 l;
    private ObjectArrayList<class03345> d;
    private final ObjectArrayList<class03345> w;
    private @Nullable class02959 k;
    private int Y;
    private final Int2ObjectMap<class04755> Q;
    private final Long2ObjectMap<SortedSet<class04755>> O;
    private @Nullable class08066 g;
    public final class02437 M;
    private int I;
    private int J;
    private int o;
    private double q;
    private double K;
    private double V;
    private double e;
    private double H;
    private @Nullable class03365 c;
    private int X = -1;
    private boolean a;
    private @Nullable class01383 p;
    private @Nullable class07209 F;
    private int A;
    public final class05932 B;
    public final class04790 Z;
    public final class08133 z;
    private @Nullable class08188 f;
    private final class06739 C;
    private class03074 S;
    private final WorldRenderContextImpl x = new WorldRenderContextImpl();
    private final WorldExtractionContextImpl D = new WorldExtractionContextImpl();
    private class01894 h;
    private static final String r = "Lcom/mojang/blaze3d/systems/RenderSystem;clear(IZ)V";
    private static final String NN = "Lnet/minecraft/client/renderer/LevelRenderer;renderSky(Lcom/mojang/blaze3d/vertex/PoseStack;Lorg/joml/Matrix4f;FLnet/minecraft/client/Camera;ZLjava/lang/Runnable;)V";
    private static final String Ny = "Lnet/minecraft/client/renderer/LevelRenderer;renderClouds(Lcom/mojang/blaze3d/vertex/PoseStack;Lorg/joml/Matrix4f;FDDD)V";
    private static final String NL = "Lnet/minecraft/client/renderer/LevelRenderer;renderSnowAndRain(Lnet/minecraft/client/renderer/LightTexture;FDDD)V";
    private WorldRenderingPipeline Nu;
    private boolean Ni;
    private boolean NR;
    private static final ObjectArrayList NM = new ObjectArrayList();
    private ObjectArrayList NB = new ObjectArrayList(69696);
    private double NZ;
    private double Nz;
    private double NU;
    private double NE;
    private double NW;
    private static final EnumMap Nm;
    private SodiumWorldRenderer NP;
    private ChunkRenderMatrices Ns;

    public boolean w() {
        return this.NP.isTerrainRenderComplete();
    }

    protected boolean L() {
        return !((class03386)this.P.i_5).R() && this.g != null && (class04453)this.P.T_4 != null;
    }

    private void L(CallbackInfo callbackInfo) {
        ((WorldRenderEvents.DebugRender)WorldRenderEvents.BEFORE_DEBUG_RENDER.invoker()).beforeDebugRender((WorldRenderContext)this.x);
    }

    private void L(CallbackInfoReturnable callbackInfoReturnable) {
        class08066 class080662 = class09078.N();
        if (class080662 != null) {
            callbackInfoReturnable.setReturnValue((Object)class080662);
        }
    }

    private void L(class02762 class027622, class02233 class022332, boolean bl, class05363 class053632, Matrix4f matrix4f, Matrix4f matrix4f2, Matrix4f matrix4f3, GpuBufferSlice gpuBufferSlice, Vector4f vector4f, boolean bl2, CallbackInfo callbackInfo) {
        for (IBaritone iBaritone : BaritoneAPI.getProvider().getAllBaritones()) {
            class01421 class014212 = new class01421();
            class014212.N((Matrix4fc)matrix4f);
            iBaritone.getGameEventHandler().onRenderPass(new RenderEvent(class022332.N(false), class014212, matrix4f2));
        }
    }

    private class01383 L(class01383 class013832) {
        this.D.setFrustum(class013832);
        return class013832;
    }

    private void L(class05363 class053632) {
        class04643 class046432 = class08700.N();
        class046432.N("populateSectionsToCompile");
        class03176 class031762 = new class03176();
        class07209 class072092 = class053632.u();
        ArrayList arrayList = Lists.newArrayList();
        long l = class04995.N((double)((Double)((class05630)this.P.i_7).b().method_41753() * 1000.0));
        for (class03345 class033452 : this.d) {
            if (!class033452.Z() || class033452.u() == class08777.N && !class033452.y()) continue;
            boolean bl = class01296.N((long)class033452.M()).U().method_10262((class00753)class072092) < 768.0;
            boolean bl2 = false;
            if (((class05630)this.P.i_7).j().method_41753() == class01825.field_34790) {
                bl2 = bl || class033452.z();
            } else if (((class05630)this.P.i_7).j().method_41753() == class01825.field_34789) {
                bl2 = class033452.z();
            }
            if (bl || class033452.N()) {
                class033452.y(0L);
            } else {
                class033452.y(l);
            }
            class033452.N(false);
            if (bl2) {
                class046432.N("compileSectionSynchronously");
                this.c.N(class033452, class031762);
                class033452.B();
                class046432.L();
                continue;
            }
            arrayList.add(class033452);
        }
        class046432.y("uploadSectionMeshes");
        this.c.N();
        class046432.y("scheduleAsyncCompile");
        for (class03345 class033452 : arrayList) {
            class033452.y(class031762);
            class033452.B();
        }
        class046432.y("scheduleTranslucentResort");
        this.N(class053632.y());
        class046432.L();
    }

    public double M() {
        return this.X;
    }

    private static void M(CallbackInfo callbackInfo) {
        Iris.getPipelineManager().getPipeline().ifPresent(worldRenderingPipeline -> worldRenderingPipeline.setPhase(WorldRenderingPhase.CUSTOM_SKY));
    }

    private void M(class02762 class027622, class02233 class022332, boolean bl, class05363 class053632, Matrix4f matrix4f, Matrix4f matrix4f2, Matrix4f matrix4f3, GpuBufferSlice gpuBufferSlice, Vector4f vector4f, boolean bl2, CallbackInfo callbackInfo) {
        this.Nu.renderShadows((net.irisshaders.iris.mixin.LevelRendererAccessor)this, class053632, this.B.N);
    }

    private void P(CallbackInfo callbackInfo) {
        this.Nu.setPhase(WorldRenderingPhase.NONE);
    }

    public @Nullable class08066 P() {
        return this.M.E != null ? (class08066)this.M.E.get() : null;
    }

    public /* synthetic */ class03448 getLevel() {
        return this.G;
    }

    private FilterMode K() {
        return SodiumClientMod.options().quality.pixelFilteringMode;
    }

    public @Nullable class08066 T() {
        return this.M.m != null ? (class08066)this.M.m.get() : null;
    }

    private void T(CallbackInfo callbackInfo) {
        this.J();
    }

    private void Q() {
        this.d.clear();
        this.w.clear();
    }

    public class03063(class06202 class062022, class01781 class017812, class03579 class035792, class01386 class013862, class05932 class059322, class08133 class081332) {
        this.j = new class02416();
        this.v = new class02410();
        this.n = new class02425();
        this.t = new class00987();
        this.i = new class01861();
        this.R = new class05509();
        this.l = new class01886();
        this.d = new ObjectArrayList(10000);
        this.w = new ObjectArrayList(50);
        this.Q = new Int2ObjectOpenHashMap();
        this.O = new Long2ObjectOpenHashMap();
        this.M = new class02437();
        this.I = Integer.MIN_VALUE;
        this.J = Integer.MIN_VALUE;
        this.o = Integer.MIN_VALUE;
        this.q = Double.MIN_VALUE;
        this.K = Double.MIN_VALUE;
        this.V = Double.MIN_VALUE;
        this.e = Double.MIN_VALUE;
        this.H = Double.MIN_VALUE;
        this.C = new class06739();
        this.S = new class03074(new class06732(), new class06732());
        this.P = class062022;
        this.s = class017812;
        this.T = class035792;
        this.u = class013862;
        this.Z = class081332.L();
        this.B = class059322;
        this.z = class081332;
        this.N(class062022, class017812, class035792, class013862, class059322, class081332, null);
    }

    private void B(class02762 class027622, class02233 class022332, boolean bl, class05363 class053632, Matrix4f matrix4f, Matrix4f matrix4f2, Matrix4f matrix4f3, GpuBufferSlice gpuBufferSlice, Vector4f vector4f, boolean bl2, CallbackInfo callbackInfo) {
        class09317.N().N(matrix4f2, matrix4f, class022332);
    }

    public void B() {
        if (this.f != null) {
            this.f.close();
        }
        this.f = null;
    }

    private static void B(CallbackInfo callbackInfo) {
        Iris.getPipelineManager().getPipeline().ifPresent(worldRenderingPipeline -> worldRenderingPipeline.setPhase(WorldRenderingPhase.NONE));
    }

    private void J() {
        class05630 class056302 = (class05630)class06202.Nq().i_7;
        if (!Iris.getIrisConfig().areShadersEnabled()) {
            return;
        }
        if (((Boolean)class056302.s().method_41753()).booleanValue()) {
            class056302.s().method_41748((Object)false);
            class056302.Z().method_41748((Object)class01241.field_63461);
        }
    }

    private void Z(CallbackInfo callbackInfo) {
        this.Nu.setPhase(WorldRenderingPhase.CLOUDS);
    }

    private void Z(class02762 class027622, class02233 class022332, boolean bl, class05363 class053632, Matrix4f matrix4f, Matrix4f matrix4f2, Matrix4f matrix4f3, GpuBufferSlice gpuBufferSlice, Vector4f vector4f, boolean bl2, CallbackInfo callbackInfo) {
        if (class06202.C()) {
            class11925.L((class08066)this.P.e());
        }
    }

    public @Nullable String Z() {
        if (this.G == null) {
            return null;
        }
        return "E: " + this.B.y.size() + "/" + this.G.z() + ", SD: " + this.G.P();
    }

    private void i(class02762 class027622, class02233 class022332, boolean bl, class05363 class053632, Matrix4f matrix4f, Matrix4f matrix4f2, Matrix4f matrix4f3, GpuBufferSlice gpuBufferSlice, Vector4f vector4f, boolean bl2, CallbackInfo callbackInfo) {
        DHCompat.checkFrame();
        IrisTimeUniforms.updateTime();
        CapturedRenderingState.INSTANCE.setGbufferModelView((Matrix4fc)matrix4f);
        CapturedRenderingState.INSTANCE.setGbufferProjection(matrix4f2);
        float f = class022332.N(false);
        CapturedRenderingState.INSTANCE.setTickDelta(f);
        if (((CloudRendererAccessor)this.j).getTexture() != null) {
            CapturedRenderingState.INSTANCE.setCloudTime(((float)(this.G.N() % (long)(((CloudRendererAccessor)this.j).getTexture().y() * 400)) + f) * 0.03f);
        } else {
            CapturedRenderingState.INSTANCE.setCloudTime(0.0f);
        }
        this.Nu = Iris.getPipelineManager().preparePipeline(Iris.getCurrentDimension());
        this.NR = this.Nu.shouldDisableFrustumCulling();
        this.Nu.beginLevelRendering();
        this.Nu.setPhase(WorldRenderingPhase.NONE);
        IrisRenderSystem.backupAndDisableCullingState((boolean)this.Nu.shouldDisableOcclusionCulling());
        if (Iris.shouldActivateWireframe() && this.P.q()) {
            IrisRenderSystem.setPolygonMode((int)6913);
        }
    }

    public @Nullable class03365 i() {
        return this.c;
    }

    private void i(CallbackInfo callbackInfo) {
        ((WorldRenderEvents.EndMain)WorldRenderEvents.END_MAIN.invoker()).endMain((WorldRenderContext)this.x);
    }

    private void b(CallbackInfo callbackInfo) {
        this.J();
    }

    public @Nullable class08066 b() {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.L(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class08066)callbackInfoReturnable.getReturnValue();
        }
        return this.M.P != null ? (class08066)this.M.P.get() : null;
    }

    public @Nullable class08066 s() {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class08066)callbackInfoReturnable.getReturnValue();
        }
        return this.M.W != null ? (class08066)this.M.W.get() : null;
    }

    private static void s(CallbackInfo callbackInfo) {
        if (Iris.getCurrentPack().isEmpty()) {
            class05363 class053632 = ((class03386)class06202.Nq().i_5).s();
            class06889 class068892 = class053632.y();
            class07049 class070492 = class053632.B();
            boolean bl = class053632.W() != class04798.field_27888;
            boolean bl2 = ((net.irisshaders.iris.mixin.LevelRendererAccessor)((class03063)class06202.Nq().B_2)).invokeDoesMobEffectBlockSky(class053632);
            boolean bl3 = ((class01056)class06202.Nq().i_6).U().u();
            if (bl || bl2 || bl3) {
                callbackInfo.cancel();
            }
        }
    }

    public class01886 n() {
        return this.l;
    }

    public class06734 l() {
        return class06724.N((class06728)this.C);
    }

    public int d() {
        return this.NP.getVisibleChunkCount();
    }

    public @Nullable class08066 m() {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.y(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class08066)callbackInfoReturnable.getReturnValue();
        }
        return this.M.T != null ? (class08066)this.M.T.get() : null;
    }

    private void m(CallbackInfo callbackInfo) {
        this.Nu.setPhase(WorldRenderingPhase.DEBUG);
    }

    private void o() {
        ObjectArrayList<class03345> var1 = this.d;
        this.d = this.NB;
        this.NB = var1;
        double d = this.e;
        this.e = this.NE;
        this.NE = d;
        d = this.H;
        this.H = this.NW;
        this.NW = d;
    }

    public String k() {
        return this.NP.getChunksDebugString();
    }

    public @Nullable class01383 t() {
        return this.p;
    }

    private void g() {
        class06732 class067322 = new class06732();
        class06732 class067323 = new class06732();
        this.C.N(this.P.z());
        class08337 class083372 = this.P.Na();
        if (class083372 != null) {
            this.C.N(class083372.G());
        }
        long l = class07536.L();
        for (class06748 class067482 : this.C.N()) {
            class067482.i().N((class06722)(class067482.L() ? class067323 : class067322), class067482.N(l));
        }
        this.S = new class03074(class067322, class067323);
    }

    public ObjectArrayList<class03345> v() {
        return this.d;
    }

    private void v(CallbackInfo callbackInfo) {
        RenderDevice.enterManagedCode();
        try {
            this.NP.reload();
        }
        finally {
            RenderDevice.exitManagedCode();
        }
    }

    public @Nullable class08066 j() {
        return this.M.s != null ? (class08066)this.M.s.get() : null;
    }

    private void j(CallbackInfo callbackInfo) {
        this.NP.scheduleTerrainUpdate();
    }

    private ParticleRenderingSettings q() {
        return Iris.getPipelineManager().getPipeline().map(WorldRenderingPipeline::getParticleRenderingSettings).orElse(ParticleRenderingSettings.MIXED);
    }

    private void U(CallbackInfo callbackInfo) {
        this.Nu.setPhase(WorldRenderingPhase.RAIN_SNOW);
    }

    public void U() {
        this.a = true;
    }

    @Override
    public void close() {
        if (this.g != null) {
            this.g.N();
        }
        if (this.b != null) {
            this.b.close();
        }
        if (this.f != null) {
            this.f.close();
        }
        this.j.close();
    }

    public void z() {
        this.j.y();
    }

    private void z(CallbackInfo callbackInfo) {
        this.Nu.setPhase(WorldRenderingPhase.NONE);
    }

    private void z(class02762 class027622, class02233 class022332, boolean bl, class05363 class053632, Matrix4f matrix4f, Matrix4f matrix4f2, Matrix4f matrix4f3, GpuBufferSlice gpuBufferSlice, Vector4f vector4f, boolean bl2, CallbackInfo callbackInfo) {
        this.Ns = new ChunkRenderMatrices((Matrix4fc)matrix4f2, (Matrix4fc)matrix4f);
        this.NP.updateFogColor(vector4f);
    }

    public void u() {
        this.R(null);
        this.b(null);
        if (this.G == null) {
            this.v(null);
            return;
        }
        this.G.Z();
        if (this.c == null) {
            this.c = new class03365(this.G, this, class07536.B(), this.u, this.P.yU(), this.P.K());
        } else {
            this.c.N(this.G);
        }
        this.j.N();
        class05885.N((boolean)((Boolean)((class05630)this.P.i_7).m().method_41753()));
        class07131.N((boolean)((Boolean)((class05630)this.P.i_7).m().method_41753()));
        this.X = ((class05630)this.P.i_7).Nh();
        if (this.k != null) {
            this.k.N();
        }
        this.c.y();
        class05630 class056302 = (class05630)this.P.i_7;
        this.k = new class02959(this.c, (class07299)this.G, this.N(class056302), this);
        this.l.N(this.k);
        this.Q();
        class05363 class053632 = ((class03386)this.P.i_5).s();
        this.k.N(class01296.N((class00737)class053632.y()));
        this.v(null);
    }

    private void u(CallbackInfo callbackInfo) {
        ((WorldRenderEvents.BeforeTranslucent)WorldRenderEvents.BEFORE_TRANSLUCENT.invoker()).beforeTranslucent((WorldRenderContext)this.x);
    }

    private void u(class02762 class027622, class02233 class022332, boolean bl, class05363 class053632, Matrix4f matrix4f, Matrix4f matrix4f2, Matrix4f matrix4f3, GpuBufferSlice gpuBufferSlice, Vector4f vector4f, boolean bl2, CallbackInfo callbackInfo) {
        this.D.prepare((class03386)this.P.i_5, this, this.B, this.G, class022332, bl, class053632, matrix4f, matrix4f3);
    }

    private void y(class02762 class027622, class02233 class022332, boolean bl, class05363 class053632, Matrix4f matrix4f, Matrix4f matrix4f2, Matrix4f matrix4f3, GpuBufferSlice gpuBufferSlice, Vector4f vector4f, boolean bl2, CallbackInfo callbackInfo) {
        ImmediateState.isRenderingLevel = false;
    }

    private void y(class02734 class027342, GpuBufferSlice gpuBufferSlice) {
        int n = ((class05630)this.P.i_7).Nh() * 16;
        float f = ((class03386)this.P.i_5).E();
        class02725 class027252 = class027342.N("weather");
        if (this.M.P != null) {
            this.M.P = class027252.y(this.M.P);
        } else {
            this.M.U = class027252.y(this.M.U);
        }
        class027252.N(() -> {
            this.U(null);
            RenderSystem.setShaderFog((GpuBufferSlice)gpuBufferSlice);
            class01422 class014222 = this.u.L();
            class06959 class069592 = this.B.N;
            this.n.N((class01407)class014222, class069592.y, this.B.M);
            class06969 class069692 = this.B.B;
            class06889 class068892 = class069592.y;
            double d = n;
            double d2 = f;
            this.E(null);
            this.v.N(class069692, class068892, d, d2);
            class014222.u();
            this.W(null);
        });
    }

    private boolean y(boolean bl) {
        return bl || class11938.u().NR().U();
    }

    private void y(CallbackInfoReturnable callbackInfoReturnable) {
        class08066 class080662 = class09078.N();
        if (class080662 != null) {
            callbackInfoReturnable.setReturnValue((Object)class080662);
        }
    }

    public void y() {
        if (this.L()) {
            this.g.N(this.P.e().u());
        }
    }

    private void y(class08133 class081332, Operation operation) {
        ParticleRenderingSettings particleRenderingSettings = this.q();
        ((PhasedParticleEngine)((FeatureRenderDispatcherAccessor)this.z).getParticleFeatureRenderer()).setParticleRenderingPhase(particleRenderingSettings == ParticleRenderingSettings.AFTER ? ParticleRenderingPhase.EVERYTHING : ParticleRenderingPhase.TRANSLUCENT);
        operation.call(new Object[]{class081332});
        ((PhasedParticleEngine)((FeatureRenderDispatcherAccessor)this.z).getParticleFeatureRenderer()).setParticleRenderingPhase(ParticleRenderingPhase.EVERYTHING);
    }

    private class01421 y(class01421 class014212) {
        this.x.setMatrixStack(class014212);
        return class014212;
    }

    public void y(int n, int n2, int n3) {
        this.NP.scheduleRebuildForChunks(n - 1, n2 - 1, n3 - 1, n + 1, n2 + 1, n3 + 1, false);
    }

    private void y(CallbackInfo callbackInfo) {
        ((WorldRenderEvents.BeforeEntities)WorldRenderEvents.BEFORE_ENTITIES.invoker()).beforeEntities((WorldRenderContext)this.x);
    }

    public void y(int n, int n2, int n3, int n4, int n5, int n6) {
        this.NP.scheduleRebuildForBlockArea(n, n2, n3, n4, n5, n6, false);
    }

    private void y(class05363 class053632, class05932 class059322) {
        class059322.i = null;
        class07089 class070892 = (class07089)this.P.M_3;
        if (!(class070892 instanceof class06183)) {
            this.N(class053632, class059322, null);
            return;
        }
        class06183 class061832 = (class06183)class070892;
        if (class061832.N() == class07113.field_1333) {
            this.N(class053632, class059322, null);
            return;
        }
        class070892 = class061832.u();
        class00500 class005002 = this.G.method_8320((class07209)class070892);
        if (!class005002.P() && this.G.method_8621().N((class07209)class070892)) {
            boolean bl = class05885.N((class00500)class005002).u();
            boolean bl2 = (Boolean)((class05630)this.P.i_7).Y().method_41753();
            class06092 class060922 = class06092.N((class07049)class053632.B());
            class00494 class004942 = class005002.N((class07290)this.G, (class07209)class070892, class060922);
            if (class07529.Q) {
                class00494 class004943 = class005002.y((class07290)this.G, (class07209)class070892, class060922);
                class00494 class004944 = class005002.U();
                class00494 class004945 = class005002.Z((class07290)this.G, (class07209)class070892);
                class059322.i = new class06973((class07209)class070892, bl, bl2, class004942, class004943, class004944, class004945);
            } else {
                class059322.i = new class06973((class07209)class070892, bl, bl2, class004942);
            }
        }
        this.N(class053632, class059322, null);
    }

    private boolean y(class05363 class053632) {
        class07049 class070492 = class053632.B();
        if (class070492 instanceof class07438) {
            class07438 class074382 = (class07438)class070492;
            return class074382.method_6059(class07047.P) || class074382.method_6059(class07047.J);
        }
        return false;
    }

    private void y(class01383 class013832) {
        if (!class06202.Nq().E_()) {
            throw new IllegalStateException("applyFrustum called from wrong thread: " + Thread.currentThread().getName());
        }
        this.Q();
        this.l.N(class013832, this.d, this.w);
    }

    public void E() {
        this.p = null;
    }

    private void E(CallbackInfo callbackInfo) {
        this.Nu.setPhase(WorldRenderingPhase.WORLD_BORDER);
    }

    private void N(class02734 class027342, GpuBufferSlice gpuBufferSlice, CallbackInfo callbackInfo) {
        if (this.q() == ParticleRenderingSettings.BEFORE) {
            callbackInfo.cancel();
        }
    }

    private void N(CallbackInfo callbackInfo, Matrix4f matrix4f) {
        this.Nu.beginHand();
        HandRenderer.INSTANCE.renderSolid((Matrix4fc)matrix4f, class06202.Nq().NK().N(true), ((class03386)class06202.Nq().i_5).s(), (class03386)class06202.Nq().i_5, this.Nu);
        class08700.N().y("iris_pre_translucent");
        this.Nu.beginTranslucents();
    }

    public static class01383 N(class01383 class013832) {
        return new class01383(class013832).method_38557(8);
    }

    private boolean N(class03063 class030632, class05363 class053632, class01383 class013832, boolean bl) {
        WorldRenderingPipeline worldRenderingPipeline = Iris.getPipelineManager().getPipelineNullable();
        if (worldRenderingPipeline instanceof IrisRenderingPipeline) {
            return !((IrisRenderingPipeline)worldRenderingPipeline).skipAllRendering();
        }
        return true;
    }

    private Iterable N(class03448 class034482, Operation operation) {
        WorldRenderingPipeline worldRenderingPipeline = Iris.getPipelineManager().getPipelineNullable();
        if (worldRenderingPipeline instanceof IrisRenderingPipeline && ((IrisRenderingPipeline)worldRenderingPipeline).skipAllRendering()) {
            return Collections.emptyList();
        }
        return (Iterable)operation.call(new Object[]{class034482});
    }

    private boolean N(class08760 class087602, class08768 class087682, class08188 class081882) {
        WorldRenderingPipeline worldRenderingPipeline = Iris.getPipelineManager().getPipelineNullable();
        if (worldRenderingPipeline instanceof IrisRenderingPipeline) {
            return !((IrisRenderingPipeline)worldRenderingPipeline).skipAllRendering();
        }
        return true;
    }

    private void N(class08133 class081332, Operation operation) {
        ParticleRenderingSettings particleRenderingSettings = this.q();
        if (particleRenderingSettings == ParticleRenderingSettings.AFTER) {
            operation.call(new Object[]{class081332});
            return;
        }
        this.t.N(this.Z, this.B.N);
        ((PhasedParticleEngine)((FeatureRenderDispatcherAccessor)this.z).getParticleFeatureRenderer()).setParticleRenderingPhase(particleRenderingSettings == ParticleRenderingSettings.BEFORE ? ParticleRenderingPhase.EVERYTHING : ParticleRenderingPhase.OPAQUE);
        operation.call(new Object[]{class081332});
        ((PhasedParticleEngine)((FeatureRenderDispatcherAccessor)this.z).getParticleFeatureRenderer()).setParticleRenderingPhase(ParticleRenderingPhase.EVERYTHING);
        if (particleRenderingSettings == ParticleRenderingSettings.BEFORE) {
            this.t.N();
        }
    }

    private void N(class02734 class027342, class01383 class013832, Matrix4f matrix4f, GpuBufferSlice gpuBufferSlice, boolean bl, class05932 class059322, class02233 class022332, class04643 class046432, CallbackInfo callbackInfo, class02725 class027252) {
        if (this.q() == ParticleRenderingSettings.BEFORE && this.M.m != null) {
            this.M.m = class027252.y(this.M.m);
        }
    }

    private void N(CommandEncoder commandEncoder, GpuTexture gpuTexture, double d, Operation operation) {
        if (!IrisApi.getInstance().isShaderPackInUse()) {
            operation.call(new Object[]{commandEncoder, gpuTexture, d});
        }
    }

    private void N(class05363 class053632, float f, class05932 class059322, CallbackInfo callbackInfo) {
        callbackInfo.cancel();
        this.NP.extractBlockEntities(class053632, f, this.O, class059322);
    }

    public boolean N(class07209 class072092) {
        return this.NP.isSectionReady(class072092.method_10263() >> 4, class072092.method_10264() >> 4, class072092.method_10260() >> 4);
    }

    private void N(int n, int n2, int n3, boolean bl) {
        this.NP.scheduleRebuildForChunk(n, n2, n3, bl);
    }

    private void N(class07209 class072092, boolean bl) {
        this.NP.scheduleRebuildForBlockArea(class072092.method_10263() - 1, class072092.method_10264() - 1, class072092.method_10260() - 1, class072092.method_10263() + 1, class072092.method_10264() + 1, class072092.method_10260() + 1, bl);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void N(class05363 class053632, class01383 class013832, boolean bl) {
        Viewport viewport = ((ViewportProvider)class013832).sodium$createViewport();
        boolean bl2 = FlawlessFrames.isActive();
        int n = class01296.N((double)class053632.y().N());
        int n2 = class01296.N((double)class053632.y().y());
        int n3 = class01296.N((double)class053632.y().L());
        if (this.I != n || this.J != n2 || this.o != n3) {
            this.I = n;
            this.J = n2;
            this.o = n3;
            this.v.N();
        }
        RenderDevice.enterManagedCode();
        try {
            this.NP.setupTerrain(class053632, viewport, ((FogStorage)((class03386)this.P.i_5)).sodium$getFogParameters(), bl, bl2, this.Ns);
        }
        finally {
            RenderDevice.exitManagedCode();
        }
        this.N(class053632, class013832, bl, null);
    }

    private class08760 N(Matrix4fc matrix4fc, double d, double d2, double d3) {
        class08760 class087602 = new class08760(this.P.NO().y(class08626.N).method_71659(), Nm, -1, new GpuBufferSlice[0]);
        ((SodiumChunkSection)class087602).sodium$setRendering(this.NP, this.Ns, d, d2, d3);
        return class087602;
    }

    private void N(class01422 class014222, class01421 class014212, boolean bl, class05932 class059322, CallbackInfo callbackInfo) {
        if (!((WorldRenderEvents.BeforeBlockOutline)WorldRenderEvents.BEFORE_BLOCK_OUTLINE.invoker()).beforeBlockOutline((WorldRenderContext)this.x, this.x.worldState().i)) {
            class014222.L();
            callbackInfo.cancel();
        }
    }

    public void N() {
        if (this.g != null) {
            this.g.N();
        }
        this.g = new class10203("Entity Outline", this.P.Nt().U(), this.P.Nt().E(), true);
    }

    private void N(class05363 class053632, class01383 class013832, boolean bl, CallbackInfo callbackInfo) {
    }

    private void N(class02416 class024162, int n, class01301 class013012, float f, class06889 class068892, long l, float f2) {
        class024162.N(n, class013012, (float)SodiumExtraClientMod.options().extraSettings.cloudHeight, class068892, l, f2);
    }

    public void N(Consumer consumer, CallbackInfo callbackInfo) {
        callbackInfo.cancel();
        this.NP.iterateVisibleBlockEntities(consumer);
    }

    private void N(CallbackInfoReturnable callbackInfoReturnable) {
        class08066 class080662 = class09078.N();
        if (class080662 != null) {
            callbackInfoReturnable.setReturnValue((Object)class080662);
        }
    }

    public void N(int n, int n2) {
        this.W();
        if (this.g != null) {
            this.g.N(n, n2);
        }
    }

    private void N(GpuBufferSlice gpuBufferSlice, class05932 class059322, class04643 class046432, Matrix4f matrix4f, class02452 class024522, class02452 class024523, boolean bl, class02452 class024524, class02452 class024525, CallbackInfo callbackInfo) {
        if (class06202.C()) {
            class11925.u((class08066)((class08066)class024522.get()));
        }
    }

    private void N(class02734 class027342, class05363 class053632, GpuBufferSlice gpuBufferSlice, CallbackInfo callbackInfo) {
        if (!class11938.u().NR().U()) {
            return;
        }
        class02725 class027252 = class027342.N("sky");
        this.M.U = class027252.y(this.M.U);
        class027252.N(() -> {
            RenderSystem.setShaderFog((GpuBufferSlice)gpuBufferSlice);
            try (class12027 class120272 = class12027.y();){
                class11938.L().L((Object)class09317.N());
            }
        });
        callbackInfo.cancel();
    }

    private boolean N(class04453 class044532) {
        class10991 class109912 = class10991.y((boolean)class044532.method_7325());
        class11938.L().L((Object)class109912);
        return class109912.N();
    }

    private void N(class00987 class009872, class04790 class047902, class06959 class069592) {
        if (this.q() == ParticleRenderingSettings.MIXED) {
            ((ParticleRenderStateExtension)class009872).submitWithoutItems(class047902, class069592);
        } else {
            class009872.N(class047902, class069592);
        }
    }

    public void N(@Nullable class03448 class034482) {
        this.I = Integer.MIN_VALUE;
        this.J = Integer.MIN_VALUE;
        this.o = Integer.MIN_VALUE;
        this.G = class034482;
        if (class034482 != null) {
            this.u();
        } else {
            this.s.N();
            if (this.k != null) {
                this.k.N();
                this.k = null;
            }
            if (this.c != null) {
                this.c.u();
            }
            this.c = null;
            this.l.N(null);
            this.Q();
        }
        this.R.N();
        this.N(class034482, (CallbackInfo)null);
    }

    private void N(class03448 class034482, CallbackInfo callbackInfo) {
        RenderDevice.enterManagedCode();
        try {
            this.NP.setLevel(class034482);
        }
        finally {
            RenderDevice.exitManagedCode();
        }
    }

    private void N(class06202 class062022, class01781 class017812, class03579 class035792, class01386 class013862, class05932 class059322, class08133 class081332, CallbackInfo callbackInfo) {
        this.NP = new SodiumWorldRenderer(class062022);
    }

    private int N(class05630 class056302) {
        return 0;
    }

    private double N(double d) {
        if (!ZoomUtils.canSeeDistantEntities()) {
            return d;
        }
        return d * Math.max(1.0, Zoom.isZooming() ? Zoom.getZoomDivisor() : 1.0);
    }

    public static int N(class03082 class030822, class07295 class072952, class00500 class005002, class07209 class072092) {
        int n;
        if (class005002.y((class07290)class072952, class072092)) {
            return 0xF000F0;
        }
        int n2 = class030822.packedBrightness(class072952, class072092);
        int n3 = class03042.N(n2);
        if (n3 < (n = class005002.m())) {
            int n4 = class03042.y(n2);
            return class03042.N(n, n4);
        }
        return n2;
    }

    private void N(class05363 class053632, float f, class05932 class059322) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(class053632, f, class059322, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        class06889 class068892 = class053632.y();
        double d = class068892.N();
        double d2 = class068892.y();
        double d3 = class068892.L();
        class01421 class014212 = new class01421();
        for (class03345 class033452 : this.d) {
            List var14 = class033452.u().y();
            if (var14.isEmpty() || class033452.N(class07536.L()) < 0.3f) continue;
            for (class00394 class003942 : var14) {
                class00985 class009852;
                class08141 class081412;
                class07209 class072092 = class003942.d();
                SortedSet var18 = (SortedSet)this.O.get(class072092.method_10063());
                if (var18 == null || var18.isEmpty()) {
                    class081412 = null;
                } else {
                    class014212.N();
                    class014212.N((double)class072092.method_10263() - d, (double)class072092.method_10264() - d2, (double)class072092.method_10260() - d3);
                    class081412 = new class08141(((class04755)var18.last()).L(), class014212.L());
                    class014212.y();
                }
                if ((class009852 = this.T.N(class003942, f, class081412)) == null) continue;
                class059322.L.add(class009852);
            }
        }
        Iterator iterator = this.G.L().iterator();
        while (iterator.hasNext()) {
            class03345 class033452;
            class033452 = (class00394)iterator.next();
            if (class033452.k()) {
                iterator.remove();
                continue;
            }
            class00985 class009853 = this.T.N((class00394)class033452, f, null);
            if (class009853 == null) continue;
            class059322.L.add(class009853);
        }
    }

    private void N(class01421 class014212, class05932 class059322, class01237 class012372) {
        class06889 class068892 = class059322.N.y;
        double d = class068892.N();
        double d2 = class068892.y();
        double d3 = class068892.L();
        for (class08800 class088002 : class059322.y) {
            if (!class059322.u) {
                class088002.l = 0;
            }
            this.s.N(class088002, class059322.N, class088002.E - d, class088002.W - d2, class088002.m - d3, class014212, class012372);
        }
    }

    private void N(class01421 class014212, class01422 class014222, class05932 class059322) {
        class06889 class068892 = class059322.N.y;
        double d = class068892.N();
        double d2 = class068892.y();
        double d3 = class068892.L();
        for (class06964 class069642 : class059322.R) {
            class014212.N();
            class07209 class072092 = class069642.y;
            class014212.N((double)class072092.method_10263() - d, (double)class072092.method_10264() - d2, (double)class072092.method_10260() - d3);
            class01423 class014232 = class014212.L();
            class01390 class013902 = new class01390(class014222.method_73477((class07311)class08874.m.get(class069642.R)), class014232, 1.0f);
            this.P.yU().N(class069642.L, class072092, (class07295)class069642, class014212, (class01391)class013902);
            class014212.y();
        }
    }

    public void N(long l) {
        class03345 class033452 = this.k.N(l);
        if (class033452 != null) {
            this.l.N(class033452);
            class033452.N(true);
        }
    }

    public void N(int n, class07209 class072092, int n2) {
        if (n2 < 0 || n2 >= 10) {
            class04755 class047552 = (class04755)this.Q.remove(n);
            if (class047552 != null) {
                this.N(class047552);
            }
        } else {
            class04755 class047553 = (class04755)this.Q.get(n);
            if (class047553 != null) {
                this.N(class047553);
            }
            if (class047553 == null || class047553.y().method_10263() != class072092.method_10263() || class047553.y().method_10264() != class072092.method_10264() || class047553.y().method_10260() != class072092.method_10260()) {
                class047553 = new class04755(n, class072092);
                this.Q.put(n, (Object)class047553);
            }
            class047553.N(n2);
            class047553.y(this.Y);
            ((SortedSet)this.O.computeIfAbsent(class047553.y().method_10063(), l -> Sets.newTreeSet())).add(class047553);
        }
    }

    public void N(class07321 class073212) {
        this.l.N(class073212);
    }

    public static int N(class07295 class072952, class07209 class072092) {
        return class03063.N(class03082.N, class072952, class072952.method_8320(class072092), class072092);
    }

    private static /* synthetic */ void N(int n, GpuBufferSlice[] gpuBufferSliceArray, RenderPass.class_10885 class_108852) {
        class_108852.upload("ChunkSection", gpuBufferSliceArray[n]);
    }

    private void N(class06889 class068892) {
        if (this.d.isEmpty()) {
            return;
        }
        class07209 class072092 = class07209.method_49638((class00737)class068892);
        boolean bl = !class072092.equals((Object)this.F);
        class08728 class087282 = new class08728();
        for (class03345 class033452 : this.w) {
            this.N(class033452, class087282, class068892, bl, true);
        }
        this.A %= this.d.size();
        int n = Math.max(this.d.size() / 8, 15);
        while (n-- > 0) {
            int n2 = this.A++ % this.d.size();
            this.N((class03345)this.d.get(n2), class087282, class068892, bl, false);
        }
        this.F = class072092;
    }

    private void N(class03345 class033452, class08728 class087282, class06889 class068892, boolean bl, boolean bl2) {
        class087282.y(class068892, class033452.M());
        boolean bl3 = class033452.u().y(class087282);
        if ((bl && (class087282.N() || bl2) || bl3) && !class033452.E() && class033452.U()) {
            class033452.N(this.c);
        }
    }

    public void N(class05363 class053632) {
        if (this.G.method_54719().Z()) {
            ++this.Y;
        }
        this.n.N(this.G, class053632, this.Y, (class01315)((class05630)this.P.i_7).NK().method_41753(), ((Integer)((class05630)this.P.i_7).W().method_41753()).intValue());
        this.O();
    }

    private void N(class04755 class047552) {
        long l = class047552.y().method_10063();
        Set var4 = (Set)this.O.get(l);
        var4.remove(class047552);
        if (var4.isEmpty()) {
            this.O.remove(l);
        }
    }

    private class08800 N(class07049 class070492, float f) {
        return this.s.y(class070492, f);
    }

    private void N(class01421 class014212) {
        if (!class014212.u()) {
            throw new IllegalStateException("Pose stack not empty");
        }
    }

    private void N(class01422 class014222, class01421 class014212, boolean bl, class05932 class059322) {
        class01391 class013912;
        class07311 class073112;
        class06973 class069732 = class059322.i;
        if (class069732 == null) {
            return;
        }
        if (class069732.y() != bl) {
            return;
        }
        class06959 class069592 = class059322.N;
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(class014222, class014212, bl, class059322, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        class06889 class068892 = class069592.y;
        if (class069732.L()) {
            class073112 = class06851.v();
            class013912 = class014222.method_73477(this.N(class073112));
            this.N(class014212, class013912, class068892.M, class068892.B, class068892.Z, class069732, -16777216, 7.0f);
        }
        class073112 = class06851.b();
        class013912 = class014222.method_73477(this.N(class073112));
        int n = class069732.L() ? -11010079 : class02566.z((int)102);
        this.N(class014212, class013912, class068892.M, class068892.B, class068892.Z, class069732, n, this.P.Nt().t());
        class014222.L();
    }

    public void N(class07290 class072902, class07209 class072092, class00500 class005002, class00500 class005003, int n) {
        this.N(class072092, (n & 8) != 0);
    }

    public void N(class07209 class072092, class00500 class005002, class00500 class005003) {
        if (this.P.D().N(class005002, class005003)) {
            this.y(class072092.method_10263(), class072092.method_10264(), class072092.method_10260(), class072092.method_10263(), class072092.method_10264(), class072092.method_10260());
        }
    }

    public void N(int n, int n2, int n3, int n4, int n5, int n6) {
        for (int i = n3; i <= n6; ++i) {
            for (int j = n; j <= n4; ++j) {
                for (int k = n2; k <= n5; ++k) {
                    this.N(j, k, i);
                }
            }
        }
    }

    public void N(int n, int n2, int n3) {
        this.N(n, n2, n3, false);
    }

    private void N(class01421 class014212, class01391 class013912, double d, double d2, double d3, class06973 class069732, int n, float f) {
        class07209 class072092 = class069732.N();
        if (class07529.Q) {
            class02438.N((class01421)class014212, (class01391)class013912, (class00494)class069732.u(), (double)((double)class072092.method_10263() - d), (double)((double)class072092.method_10264() - d2), (double)((double)class072092.method_10260() - d3), (int)class02566.N((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f), (float)f);
            if (class069732.i() != null) {
                class02438.N((class01421)class014212, (class01391)class013912, (class00494)class069732.i(), (double)((double)class072092.method_10263() - d), (double)((double)class072092.method_10264() - d2), (double)((double)class072092.method_10260() - d3), (int)class02566.N((float)0.4f, (float)0.0f, (float)0.0f, (float)0.0f), (float)f);
            }
            if (class069732.R() != null) {
                class02438.N((class01421)class014212, (class01391)class013912, (class00494)class069732.R(), (double)((double)class072092.method_10263() - d), (double)((double)class072092.method_10264() - d2), (double)((double)class072092.method_10260() - d3), (int)class02566.N((float)0.4f, (float)0.0f, (float)1.0f, (float)0.0f), (float)f);
            }
            if (class069732.M() != null) {
                class02438.N((class01421)class014212, (class01391)class013912, (class00494)class069732.M(), (double)((double)class072092.method_10263() - d), (double)((double)class072092.method_10264() - d2), (double)((double)class072092.method_10260() - d3), (int)class02566.N((float)0.4f, (float)0.0f, (float)0.0f, (float)1.0f), (float)f);
            }
        } else {
            class02438.N((class01421)class014212, (class01391)class013912, (class00494)class069732.u(), (double)((double)class072092.method_10263() - d), (double)((double)class072092.method_10264() - d2), (double)((double)class072092.method_10260() - d3), (int)n, (float)f);
        }
    }

    private void N(class01421 class014212, class05932 class059322, class04790 class047902) {
        class06889 class068892 = class059322.N.y;
        double d = class068892.N();
        double d2 = class068892.y();
        double d3 = class068892.L();
        for (class00985 class009852 : class059322.L) {
            class07209 class072092 = class009852.R;
            class014212.N();
            class014212.N((double)class072092.method_10263() - d, (double)class072092.method_10264() - d2, (double)class072092.method_10260() - d3);
            this.T.N(class009852, class014212, (class01237)class047902, class059322.N);
            class014212.y();
        }
    }

    private void N(class02734 class027342, class05363 class053632, GpuBufferSlice gpuBufferSlice) {
        class04798 class047982 = class053632.W();
        if (class047982 == class04798.field_27887 || class047982 == class04798.field_27885 || this.y(class053632)) {
            return;
        }
        class06971 class069712 = this.B.Z;
        if (class069712.N == class07360.field_64385) {
            return;
        }
        class02409 class024092 = this.b;
        if (class024092 == null) {
            return;
        }
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(class027342, class053632, gpuBufferSlice, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        class02725 class027252 = class027342.N("sky");
        this.M.U = class027252.y(this.M.U);
        class027252.N(() -> {
            class03063.M(null);
            CallbackInfo callbackInfo = new CallbackInfo("", true);
            class03063.s(callbackInfo);
            if (callbackInfo.isCancelled()) {
                return;
            }
            RenderSystem.setShaderFog((GpuBufferSlice)gpuBufferSlice);
            if (class069712.N == class07360.field_64387) {
                class024092.y();
                if (class069712.U > 1.0E-5f) {
                    class01421 class014212 = new class01421();
                    class024092.N(class014212, class069712.U, class069712.E, class069712.W);
                }
                class03063.B(null);
                return;
            }
            class01421 class014213 = new class01421();
            class024092.N(class069712.z);
            class024092.N(class014213, class069712.L, class069712.B);
            class024092.N(class014213, class069712.L, class069712.u, class069712.i, class069712.Z, class069712.R, class069712.M);
            if (class069712.y) {
                class024092.N();
            }
            class03063.B(null);
        });
    }

    public void N(class02762 class027622, class02233 class022332, boolean bl, class05363 class053632, Matrix4f matrix4f, Matrix4f matrix4f2, Matrix4f matrix4f3, GpuBufferSlice gpuBufferSlice, Vector4f vector4f, boolean bl2) {
        int n;
        this.N(class027622, class022332, bl, class053632, matrix4f, matrix4f2, matrix4f3, gpuBufferSlice, vector4f, bl2, null);
        this.u(class027622, class022332, bl, class053632, matrix4f, matrix4f2, matrix4f3, gpuBufferSlice, vector4f, bl2, null);
        this.i(class027622, class022332, bl, class053632, matrix4f, matrix4f2, matrix4f3, gpuBufferSlice, vector4f, bl2, null);
        this.B(class027622, class022332, bl, class053632, matrix4f, matrix4f2, matrix4f3, gpuBufferSlice, vector4f, bl2, null);
        bl2 = this.y(bl2);
        float f = class022332.N(false);
        this.B.z = this.G.N();
        this.T.N(class053632);
        this.s.N(class053632, (class07049)this.P.M_2);
        class04643 class046432 = class08700.N();
        class046432.N("populateLightUpdates");
        this.G.i();
        class046432.y("runLightUpdates");
        this.G.method_8398().L().N();
        class046432.y("prepareCullFrustum");
        class06889 class068892 = class053632.y();
        class01383 class013832 = this.L(this.N(matrix4f, matrix4f3, class068892));
        this.M(class027622, class022332, bl, class053632, matrix4f, matrix4f2, matrix4f3, gpuBufferSlice, vector4f, bl2, null);
        class01383 class013833 = class013832;
        class046432.y("cullTerrain");
        Object object = (class04453)this.P.T_4;
        boolean bl3 = this.N((class04453)object);
        this.z(class027622, class022332, bl, class053632, matrix4f, matrix4f2, matrix4f3, gpuBufferSlice, vector4f, bl2, null);
        boolean bl4 = bl3;
        class01383 class013834 = class013833;
        class05363 class053633 = class053632;
        object = this;
        if (this.N((class03063)object, class053633, class013834, bl4)) {
            ((class03063)object).N(class053633, class013834, bl4);
        }
        class046432.y("compileSections");
        this.L(class053632);
        class046432.y("extract");
        class046432.N("entities");
        this.N(class053632, class013833, class022332, this.B);
        class046432.y("blockEntities");
        this.N(class053632, f, this.B);
        class046432.y("blockOutline");
        this.y(class053632, this.B);
        class046432.y("blockBreaking");
        this.N(class053632, this.B);
        class046432.y("weather");
        this.n.N((class07299)this.G, this.Y, f, class068892, this.B.M);
        class046432.y("sky");
        this.b.N(this.G, f, class053632, this.B.Z);
        class046432.y("border");
        class06969 class069692 = this.B.B;
        double d = ((class05630)this.P.i_7).Nh() * 16;
        class06889 class068893 = class068892;
        float f2 = f;
        class053633 = this.G.method_8621();
        object = this.v;
        this.N((class02410)object, (class08057)class053633, f2, class068893, d, class069692, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)6, (String)"[net.minecraft.class_9978, net.minecraft.class_2784, float, net.minecraft.class_243, double, net.minecraft.class_12078]");
            ((class02410)objectArray[0]).N((class08057)objectArray[1], ((Float)objectArray[2]).floatValue(), (class06889)objectArray[3], ((Double)objectArray[4]).doubleValue(), (class06969)objectArray[5]);
            return null;
        });
        class046432.L();
        class046432.y("debug");
        double d2 = class068892.M;
        double d3 = class068892.B;
        double d4 = class068892.Z;
        float f3 = class022332.N(false);
        this.L((CallbackInfo)null);
        this.i.N(class013833, d2, d3, d4, f3);
        this.R.y();
        class046432.y("setupFrameGraph");
        Matrix4fStack matrix4fStack = RenderSystem.getModelViewStack();
        matrix4fStack.pushMatrix();
        matrix4fStack.mul((Matrix4fc)matrix4f);
        class02734 class027342 = new class02734();
        this.M.U = class027342.N("main", (Object)this.P.e());
        int n2 = this.P.e().N;
        int n3 = this.P.e().y;
        class02456 class024562 = new class02456(n2, n3, true, 0);
        class08086 class080862 = this.Y();
        if (class080862 != null) {
            this.M.E = class027342.N("translucent", (class02418)class024562);
            this.M.W = class027342.N("item_entity", (class02418)class024562);
            this.M.m = class027342.N("particles", (class02418)class024562);
            this.M.P = class027342.N("weather", (class02418)class024562);
            this.M.s = class027342.N("clouds", (class02418)class024562);
        }
        if (this.g != null) {
            this.M.T = class027342.N("entity_outline", (Object)this.g);
        }
        class02725 class027252 = class027342.N("clear");
        this.M.U = class027252.y(this.M.U);
        class027252.N(() -> {
            class08066 class080662 = this.P.e();
            RenderSystem.getDevice().createCommandEncoder().clearColorAndDepthTextures(class080662.L(), class02566.N((float)0.0f, (float)vector4f.x, (float)vector4f.y, (float)vector4f.z), class080662.i(), 1.0);
        });
        this.N(class027622, class022332, bl, class053632, matrix4f, matrix4f2, matrix4f3, gpuBufferSlice, vector4f, bl2, null, class027342, class027252);
        if (bl2) {
            this.N(class027342, class053632, gpuBufferSlice);
        }
        this.N(class027342, class013833, matrix4f, gpuBufferSlice, bl, this.B, class022332, class046432);
        class08086 class080863 = this.P.ym().N(E, class02437.Z);
        if (this.B.u && class080863 != null) {
            class080863.N(class027342, n2, n3, (class08053)this.M);
        }
        ((class04410)this.P.i_0).N(this.t, new class01383(class013833).method_74403(-3.0f), class053632, f);
        this.N(class027342, gpuBufferSlice);
        class01301 class013012 = ((class05630)this.P.i_7).Nf();
        if (class013012 != class01301.field_18162 && class02566.y((int)(n = ((Integer)class053632.U().N(class00608.U, f)).intValue())) > 0) {
            float f4 = ((Float)class053632.U().N(class00608.E, f)).floatValue();
            this.N(class027342, class013012, this.B.N.y, this.B.z, f, n, f4);
        }
        this.y(class027342, gpuBufferSlice);
        if (class080862 != null) {
            class080862.N(class027342, n2, n3, (class08053)this.M);
        }
        this.N(class027342, this.B.N, gpuBufferSlice, matrix4f);
        class046432.y("executeFrameGraph");
        class027342.N(class027622, (class02731)new class03071(this, class046432));
        this.M.N();
        this.R(class027622, class022332, bl, class053632, matrix4f, matrix4f2, matrix4f3, gpuBufferSlice, vector4f, bl2, null);
        matrix4fStack.popMatrix();
        class046432.L();
        this.B.N();
        this.y(class027622, class022332, bl, class053632, matrix4f, matrix4f2, matrix4f3, gpuBufferSlice, vector4f, bl2, null);
        this.L(class027622, class022332, bl, class053632, matrix4f, matrix4f2, matrix4f3, gpuBufferSlice, vector4f, bl2, null);
        this.Z(class027622, class022332, bl, class053632, matrix4f, matrix4f2, matrix4f3, gpuBufferSlice, vector4f, bl2, null);
    }

    private boolean N(boolean bl) {
        return false;
    }

    private void N(class02734 class027342, class01383 class013832, Matrix4f matrix4f, GpuBufferSlice gpuBufferSlice, boolean bl, class05932 class059322, class02233 class022332, class04643 class046432) {
        class02725 class027252 = class027342.N("main");
        this.M.U = class027252.y(this.M.U);
        if (this.M.E != null) {
            this.M.E = class027252.y(this.M.E);
        }
        if (this.M.W != null) {
            this.M.W = class027252.y(this.M.W);
        }
        if (this.M.P != null) {
            this.M.P = class027252.y(this.M.P);
        }
        this.N(class027342, class013832, matrix4f, gpuBufferSlice, bl, class059322, class022332, class046432, null, class027252);
        if (class059322.u && this.M.T != null) {
            this.M.T = class027252.y(this.M.T);
        }
        class02452 var10 = this.M.U;
        class02452 var11 = this.M.E;
        class02452 var12 = this.M.W;
        class02452 var13 = this.M.T;
        class027252.N(() -> {
            class08066 class080662;
            RenderSystem.setShaderFog((GpuBufferSlice)gpuBufferSlice);
            class06889 class068892 = class059322.N.y;
            double d = class068892.N();
            double d2 = class068892.y();
            double d3 = class068892.L();
            class046432.N("terrain");
            if (this.f == null) {
                int n = ((class05630)this.P.i_7).c().method_41753() == class06532.field_64665 ? ((class05630)this.P.i_7).H() : 1;
                this.f = RenderSystem.getDevice().createSampler(AddressMode.CLAMP_TO_EDGE, AddressMode.CLAMP_TO_EDGE, this.K(), this.K(), n, OptionalDouble.empty());
            }
            class08760 class087602 = this.N(this.N((Matrix4fc)matrix4f, d, d2, d3));
            this.N((CallbackInfo)null);
            class08188 class081882 = this.f;
            class08768 class087682 = class08768.field_61022;
            class08760 class087603 = class087602;
            if (this.N(class087603, class087682, class081882)) {
                this.N(class087603, class087682, class081882, objectArray -> {
                    WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)3, (String)"[net.minecraft.class_11532, net.minecraft.class_11531, net.minecraft.class_12137]");
                    Object[] objectArray2 = objectArray;
                    ((class08760)objectArray[0]).N((class08768)objectArray2[1], (class08188)objectArray2[2]);
                    return null;
                });
            }
            ((class03386)this.P.i_5).v().N(class01540.field_60025);
            if (var12 != null) {
                ((class08066)var12.get()).N(this.P.e());
            }
            if (this.L() && var13 != null) {
                class080662 = (class08066)var13.get();
                RenderSystem.getDevice().createCommandEncoder().clearColorAndDepthTextures(class080662.L(), 0, class080662.i(), 1.0);
            }
            class080662 = this.y(new class01421());
            class01422 class014222 = this.u.L();
            class01422 class014223 = this.u.u();
            this.y((CallbackInfo)null);
            class046432.y("submitEntities");
            this.N((class01421)class080662, class059322, (class01237)this.Z);
            class046432.y("submitBlockEntities");
            this.N((class01421)class080662, class059322, this.Z);
            class046432.y("renderFeatures");
            class087603 = this.z;
            this.N((class08133)class087603, objectArray -> {
                WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)1, (String)"[net.minecraft.class_11684]");
                ((class08133)objectArray[0]).N();
                return null;
            });
            class014222.L();
            this.N((class01421)class080662);
            class014222.N(class06851.N());
            class014222.N(class06851.s());
            class014222.N(class06851.T());
            class014222.N(class05911.B());
            class014222.N(class05911.Z());
            class014222.N(class05911.L());
            class014222.N(class05911.u());
            class014222.N(class05911.i());
            class014222.N(class05911.R());
            class014222.N(class05911.M());
            class087603 = this.u.i();
            this.N((class01434)class087603, objectArray -> {
                WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)1, (String)"[net.minecraft.class_4618]");
                ((class01434)objectArray[0]).N();
                return null;
            });
            if (bl) {
                this.N(class014222, (class01421)class080662, false, class059322);
            }
            class046432.L();
            this.g();
            this.S.N().N((class01421)class080662, (class01407)class014222, class059322.N, matrix4f);
            class014222.L();
            this.N((class01421)class080662);
            class014222.N(class05911.z());
            class014222.N(class05911.N());
            class014222.N(class05911.y());
            class014222.N(class06851.R());
            class014222.N(class06851.B());
            class014222.N(class06851.M());
            class014222.N(class06851.Z());
            class046432.N("destroyProgress");
            this.N((class01421)class080662, class014223, class059322);
            class014223.u();
            class046432.L();
            this.N((class01421)class080662);
            class014222.N(class06851.i());
            this.N(null, matrix4f);
            class014222.u();
            if (var11 != null) {
                ((class08066)var11.get()).N((class08066)var10.get());
            }
            this.u(null);
            class046432.N("translucent");
            class081882 = this.f;
            class087682 = class08768.field_61023;
            class087603 = class087602;
            if (this.N(class087603, class087682, class081882)) {
                this.N(class087603, class087682, class081882, objectArray -> {
                    WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)3, (String)"[net.minecraft.class_11532, net.minecraft.class_11531, net.minecraft.class_12137]");
                    Object[] objectArray2 = objectArray;
                    ((class08760)objectArray[0]).N((class08768)objectArray2[1], (class08188)objectArray2[2]);
                    return null;
                });
            }
            class046432.y("string");
            class081882 = this.f;
            class087682 = class08768.field_61024;
            class087603 = class087602;
            if (this.N(class087603, class087682, class081882)) {
                this.N(class087603, class087682, class081882, objectArray -> {
                    WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)3, (String)"[net.minecraft.class_11532, net.minecraft.class_11531, net.minecraft.class_12137]");
                    Object[] objectArray2 = objectArray;
                    ((class08760)objectArray[0]).N((class08768)objectArray2[1], (class08188)objectArray2[2]);
                    return null;
                });
            }
            if (bl) {
                this.N(class014222, (class01421)class080662, true, class059322);
            }
            this.i(null);
            class014222.u();
            class046432.L();
            this.N(gpuBufferSlice, class059322, class046432, matrix4f, var12, var13, bl, var11, var10, null);
        });
    }

    private void N(class02762 class027622, class02233 class022332, boolean bl, class05363 class053632, Matrix4f matrix4f, Matrix4f matrix4f2, Matrix4f matrix4f3, GpuBufferSlice gpuBufferSlice, Vector4f vector4f, boolean bl2, CallbackInfo callbackInfo, class02734 class027342, class02725 class027252) {
        class02725 class027253 = class027342.N("iris_setup");
        this.M.U = class027253.y(this.M.U);
        class027253.N(class027252);
        class027253.N(() -> {
            GpuBufferSlice gpuBufferSlice = RenderSystem.getShaderFog();
            this.Nu.onBeginClear();
            RenderSystem.setShaderFog((GpuBufferSlice)gpuBufferSlice);
        });
    }

    private void N(Matrix4f matrix4f, Matrix4f matrix4f2, class06889 class068892, CallbackInfoReturnable callbackInfoReturnable) {
        if (this.NR) {
            NonCullingFrustum nonCullingFrustum = new NonCullingFrustum();
            nonCullingFrustum.method_23088(class068892.M, class068892.B, class068892.Z);
            callbackInfoReturnable.setReturnValue((Object)nonCullingFrustum);
        }
    }

    private void N(class02734 class027342, GpuBufferSlice gpuBufferSlice) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(class027342, gpuBufferSlice, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        class02725 class027252 = class027342.N("particles");
        if (this.M.m != null) {
            this.M.m = class027252.y(this.M.m);
            class027252.N(this.M.U);
        } else {
            this.M.U = class027252.y(this.M.U);
        }
        class02452 var4 = this.M.U;
        class02452 var5 = this.M.m;
        class027252.N(() -> {
            RenderSystem.setShaderFog((GpuBufferSlice)gpuBufferSlice);
            if (var5 != null) {
                ((class08066)var5.get()).N((class08066)var4.get());
            }
            class06959 class069592 = this.B.N;
            class04790 class047902 = this.Z;
            class00987 class009872 = this.t;
            this.N(class009872, class047902, class069592);
            class009872 = this.z;
            this.y((class08133)class009872, objectArray -> {
                WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)1, (String)"[net.minecraft.class_11684]");
                ((class08133)objectArray[0]).N();
                return null;
            });
            this.t.N();
        });
    }

    private class07311 N(class07311 class073112) {
        return new OuterWrappedRenderType("iris:is_outline", class073112, (RenderingWrapper)IsOutlineRenderStateShard.INSTANCE);
    }

    private void N(class05363 class053632, class05932 class059322) {
        class06889 class068892 = class053632.y();
        double d = class068892.N();
        double d2 = class068892.y();
        double d3 = class068892.L();
        class059322.R.clear();
        for (Long2ObjectMap.Entry entry : this.O.long2ObjectEntrySet()) {
            SortedSet var13;
            class07209 class072092 = class07209.method_10092((long)entry.getLongKey());
            if (class072092.method_10268(d, d2, d3) > 1024.0 || (var13 = (SortedSet)entry.getValue()) == null || var13.isEmpty()) continue;
            int n = ((class04755)var13.last()).L();
            class059322.R.add(new class06964(this.G, class072092, n));
        }
    }

    private void N(class08760 class087602, class08768 class087682, class08188 class081882, Operation operation) {
        this.Nu.setPhase(WorldRenderingPhase.fromTerrainRenderType((class08768)class087682));
        operation.call(new Object[]{class087602, class087682, class081882});
        this.Nu.setPhase(WorldRenderingPhase.NONE);
    }

    public void N(class03345 class033452) {
        this.l.N(class033452);
    }

    public final class01383 N(Matrix4f matrix4f, Matrix4f matrix4f2, class06889 class068892) {
        class01383 class013832;
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(matrix4f, matrix4f2, class068892, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class01383)callbackInfoReturnable.getReturnValue();
        }
        if (this.p != null && !this.a) {
            class013832 = this.p;
        } else {
            class013832 = new class01383(matrix4f, matrix4f2);
            class013832.method_23088(class068892.N(), class068892.y(), class068892.L());
        }
        if (this.a) {
            this.p = class013832;
            this.a = false;
        }
        return class013832;
    }

    private void N(class02410 class024102, class08057 class080572, float f, class06889 class068892, double d, class06969 class069692, Operation operation) {
        operation.call(new Object[]{class024102, class080572, Float.valueOf(f), class068892, d, class069692});
        ((WorldRenderEvents.EndExtraction)WorldRenderEvents.END_EXTRACTION.invoker()).endExtraction((WorldExtractionContext)this.D);
    }

    private class08760 N(class08760 class087602) {
        this.x.prepare((class03386)this.P.i_5, this, this.B, class087602, (class01237)this.Z, (class01407)this.u.L());
        return class087602;
    }

    private void N(class02734 class027342, class06959 class069592, GpuBufferSlice gpuBufferSlice, Matrix4f matrix4f) {
        class02725 class027252 = class027342.N("late_debug");
        this.M.U = class027252.y(this.M.U);
        if (this.M.W != null) {
            this.M.W = class027252.y(this.M.W);
        }
        class02452 var6 = this.M.U;
        class027252.N(() -> {
            RenderSystem.setShaderFog((GpuBufferSlice)gpuBufferSlice);
            class01421 class014212 = new class01421();
            class01422 class014222 = this.u.L();
            RenderSystem.outputColorTextureOverride = ((class08066)var6.get()).u();
            RenderSystem.outputDepthTextureOverride = ((class08066)var6.get()).R();
            if (!this.S.y().N()) {
                class08066 class080662 = class06202.Nq().e();
                double d = 1.0;
                GpuTexture gpuTexture = class080662.i();
                CommandEncoder commandEncoder = RenderSystem.getDevice().createCommandEncoder();
                this.N(commandEncoder, gpuTexture, d, objectArray -> {
                    WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)3, (String)"[com.mojang.blaze3d.systems.CommandEncoder, com.mojang.blaze3d.textures.GpuTexture, double]");
                    ((CommandEncoder)objectArray[0]).clearDepthTexture((GpuTexture)objectArray[1], ((Double)objectArray[2]).doubleValue());
                    return null;
                });
                this.S.y().N(class014212, (class01407)class014222, class069592, matrix4f);
                class014222.L();
            }
            RenderSystem.outputColorTextureOverride = null;
            RenderSystem.outputDepthTextureOverride = null;
            this.N(class014212);
        });
    }

    private void N(class05363 class053632, class05932 class059322, CallbackInfo callbackInfo) {
        ((WorldRenderEvents.AfterBlockOutlineExtraction)WorldRenderEvents.AFTER_BLOCK_OUTLINE_EXTRACTION.invoker()).afterBlockOutlineExtraction((WorldExtractionContext)this.D, (class07089)this.P.M_3);
    }

    private void N(class05363 class053632, class01383 class013832, class02233 class022332, class05932 class059322) {
        class06889 class068892 = class053632.y();
        double d = class068892.N();
        double d2 = class068892.y();
        double d3 = class068892.L();
        class03106 class031062 = ((class03448)this.P.T_3).method_54719();
        boolean bl = this.L();
        double d4 = class04995.N((double)((double)((class05630)this.P.i_7).Nh() / 8.0), (double)1.0, (double)2.5) * (Double)((class05630)this.P.i_7).M().method_41753();
        class07049.method_5840((double)this.N(d4));
        class03448 class034482 = this.G;
        for (class07049 class070492 : this.N(class034482, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)1, (String)"[net.minecraft.class_638]");
            return ((class03448)objectArray[0]).M();
        })) {
            class07209 class072092;
            if (!this.s.N(class070492, class013832, d, d2, d3) && !class070492.method_5821((class07049)((class04453)this.P.T_4)) || !this.G.method_31601((class072092 = class070492.method_24515()).method_10264()) && !this.N(class072092) || class070492 == class053632.B() && !class053632.z() && (!(class053632.B() instanceof class07438) || !((class07438)class053632.B()).method_6113()) || class070492 instanceof class04453 && class053632.B() != class070492) continue;
            if (class070492.field_6012 == 0) {
                class070492.field_6038 = class070492.method_23317();
                class070492.field_5971 = class070492.method_23318();
                class070492.field_5989 = class070492.method_23321();
            }
            float f = class022332.N(!class031062.N(class070492));
            class08800 class088002 = this.N(class070492, f);
            class059322.y.add(class088002);
            if (!class088002.y() || !bl) continue;
            class059322.u = true;
        }
    }

    private void N(class02762 class027622, class02233 class022332, boolean bl, class05363 class053632, Matrix4f matrix4f, Matrix4f matrix4f2, Matrix4f matrix4f3, GpuBufferSlice gpuBufferSlice, Vector4f vector4f, boolean bl2, CallbackInfo callbackInfo) {
        ImmediateState.isRenderingLevel = true;
    }

    private void N(CallbackInfo callbackInfo) {
        ((WorldRenderEvents.StartMain)WorldRenderEvents.START_MAIN.invoker()).startMain((WorldTerrainRenderContext)this.x);
    }

    private void N(class02734 class027342, class01301 class013012, class06889 class068892, long l, float f, int n, float f2) {
        class02725 class027252 = class027342.N("clouds");
        if (this.M.s != null) {
            this.M.s = class027252.y(this.M.s);
        } else {
            this.M.U = class027252.y(this.M.U);
        }
        class027252.N(() -> {
            this.Z(null);
            float f3 = f;
            long l2 = l;
            class06889 class068893 = class068892;
            float f4 = f2;
            class01301 class013013 = class013012;
            int n2 = n;
            class02416 class024162 = this.j;
            this.N(class024162, n2, class013013, f4, class068893, l2, f3);
            this.z(null);
        });
    }

    private void N(class01434 class014342, Operation operation) {
        operation.call(new Object[]{class014342});
        ((WorldRenderEvents.AfterEntities)WorldRenderEvents.AFTER_ENTITIES.invoker()).afterEntities((WorldRenderContext)this.x);
    }

    public void method_14491(class01089 class010892) {
        this.T(null);
        this.N();
        if (this.b != null) {
            this.b.close();
        }
        this.b = new class02409(this.P.NO(), this.P.yW());
    }

    public class01894 fabric$getId() {
        if (this.h == null) {
            class03063 var1 = this;
            this.h = var1 instanceof class08117 ? ResourceReloaderKeys.Client.ATLAS : (var1 instanceof class00183 ? ResourceReloaderKeys.Client.MODELS : (var1 instanceof class03579 ? ResourceReloaderKeys.Client.BLOCK_ENTITY_RENDERERS : (var1 instanceof class01999 ? ResourceReloaderKeys.Client.BLOCK_RENDER_MANAGER : (var1 instanceof class02416 ? ResourceReloaderKeys.Client.CLOUD_CELLS : (var1 instanceof class08521 ? ResourceReloaderKeys.Client.DRY_FOLIAGE_COLORMAP : (var1 instanceof class08718 ? ResourceReloaderKeys.Client.EQUIPMENT_MODELS : (var1 instanceof class01781 ? ResourceReloaderKeys.Client.ENTITY_RENDERERS : (var1 instanceof class04866 ? ResourceReloaderKeys.Client.FONTS : (var1 instanceof class08575 ? ResourceReloaderKeys.Client.FOLIAGE_COLORMAP : (var1 instanceof class08543 ? ResourceReloaderKeys.Client.GRASS_COLORMAP : (var1 instanceof class08396 ? ResourceReloaderKeys.Client.LANGUAGES : (var1 instanceof class00951 ? ResourceReloaderKeys.Client.PARTICLES : (var1 instanceof class08212 ? ResourceReloaderKeys.Client.SHADERS : (var1 instanceof class06176 ? ResourceReloaderKeys.Client.SPLASH_TEXTS : (var1 instanceof class09033 ? ResourceReloaderKeys.Client.SOUNDS : (var1 instanceof class08627 ? ResourceReloaderKeys.Client.TEXTURES : (var1 instanceof class08290 ? ResourceReloaderKeys.Client.WAYPOINT_STYLE_ASSETS : class01894.y((String)("private/" + var1.getClass().getSimpleName().toLowerCase(Locale.ROOT))))))))))))))))))));
        }
        return this.h;
    }

    public void W() {
        this.l.N();
        this.j.N();
        this.j(null);
    }

    private void W(CallbackInfo callbackInfo) {
        this.Nu.setPhase(WorldRenderingPhase.NONE);
    }

    private void R(class02762 class027622, class02233 class022332, boolean bl, class05363 class053632, Matrix4f matrix4f, Matrix4f matrix4f2, Matrix4f matrix4f3, GpuBufferSlice gpuBufferSlice, Vector4f vector4f, boolean bl2, CallbackInfo callbackInfo) {
        HandRenderer.INSTANCE.renderTranslucent((Matrix4fc)matrix4f, class022332.N(true), class053632, (class03386)this.P.i_5, this.Nu);
        class08700.N().y("iris_final");
        if (Iris.shouldActivateWireframe() && this.P.q()) {
            IrisRenderSystem.setPolygonMode((int)6914);
        }
        this.Nu.finalizeLevelRendering();
        this.Nu = null;
        if (!this.Ni) {
            this.Ni = true;
            Iris.getUpdateChecker().getBetaInfo().ifPresent(betaInfo -> ((class01056)class06202.Nq().i_6).i().N((class00392)class00392.y((String)("A new beta is out for Iris " + betaInfo.betaTag + ". Please redownload it.")).N(new class06541[]{class06541.field_1067, class06541.field_1061})));
        }
        IrisRenderSystem.restoreCullingState();
    }

    public double R() {
        return this.k == null ? 0.0 : (double)this.k.R.length;
    }

    private void R(CallbackInfo callbackInfo) {
        ((InvalidateRenderStateCallback)InvalidateRenderStateCallback.EVENT.invoker()).onInvalidate();
    }

    private void O() {
        if (this.Y % 20 != 0) {
            return;
        }
        ObjectIterator var1 = this.Q.values().iterator();
        while (var1.hasNext()) {
            class04755 class047552 = (class04755)var1.next();
            int n = class047552.u();
            if (this.Y - n <= 400) continue;
            var1.remove();
            this.N(class047552);
        }
    }

    public class02416 G() {
        return this.j;
    }

    public /* synthetic */ boolean invokeDoesMobEffectBlockSky(class05363 class053632) {
        return this.y(class053632);
    }

    private @Nullable class08086 Y() {
        if (!class06202.C()) {
            return null;
        }
        class08086 class080862 = this.P.ym().N(U, class02437.z);
        if (class080862 == null) {
            ((class05630)this.P.i_7).s().method_41748((Object)false);
            ((class05630)this.P.i_7).Np();
        }
        return class080862;
    }

    public void saveState() {
        this.o();
    }

    public /* synthetic */ void setRenderBuffers(class01386 class013862) {
        this.u = class013862;
    }

    public ChunkRenderMatrices sodium$getMatrices() {
        return this.Ns;
    }

    public void restoreState() {
        this.o();
    }

    public /* synthetic */ class01386 getRenderBuffers() {
        return this.u;
    }

    public void sodium$setMatrices(ChunkRenderMatrices chunkRenderMatrices) {
        this.Ns = chunkRenderMatrices;
    }

    public /* synthetic */ void invokeCullTerrain(class05363 class053632, class01383 class013832, boolean bl) {
        this.N(class053632, class013832, bl);
    }

    public SodiumWorldRenderer sodium$getWorldRenderer() {
        return this.NP;
    }

    public /* synthetic */ void invokeExtractBlockEntities(class05363 class053632, float f, class05932 class059322) {
        this.N(class053632, f, class059322);
    }

    public /* synthetic */ class01781 getEntityRenderDispatcher() {
        return this.s;
    }

    public /* synthetic */ Long2ObjectMap getDestructionProgress() {
        return this.O;
    }
}

