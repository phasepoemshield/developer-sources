/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.textures.AddressMode
 *  com.mojang.blaze3d.textures.FilterMode
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  minecraft.class00394
 *  minecraft.class00608
 *  minecraft.class00985
 *  minecraft.class01237
 *  minecraft.class01383
 *  minecraft.class01386
 *  minecraft.class01421
 *  minecraft.class01422
 *  minecraft.class01434
 *  minecraft.class01590
 *  minecraft.class01781
 *  minecraft.class02233
 *  minecraft.class03063
 *  minecraft.class03106
 *  minecraft.class03386
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class04477
 *  minecraft.class04643
 *  minecraft.class04790
 *  minecraft.class04995
 *  minecraft.class05363
 *  minecraft.class05630
 *  minecraft.class05834
 *  minecraft.class05932
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class06959
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class08133
 *  minecraft.class08188
 *  minecraft.class08700
 *  minecraft.class08760
 *  minecraft.class08768
 *  minecraft.class08800
 *  net.caffeinemc.mods.sodium.client.render.chunk.ChunkRenderMatrices
 *  net.caffeinemc.mods.sodium.client.util.SodiumChunkSection
 *  net.caffeinemc.mods.sodium.client.world.LevelRendererExtension
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.compat.dh.DHCompat
 *  net.irisshaders.iris.gl.GLDebug
 *  net.irisshaders.iris.gl.IrisRenderSystem
 *  net.irisshaders.iris.gui.option.IrisVideoSettings
 *  net.irisshaders.iris.mixin.LevelRendererAccessor
 *  net.irisshaders.iris.pipeline.IrisRenderingPipeline
 *  net.irisshaders.iris.pipeline.WorldRenderingPhase
 *  net.irisshaders.iris.uniforms.CameraUniforms
 *  net.irisshaders.iris.uniforms.CapturedRenderingState
 *  net.irisshaders.iris.uniforms.CelestialUniforms
 *  net.irisshaders.iris.uniforms.custom.CustomUniforms
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Vector3d
 *  org.joml.Vector3f
 *  org.joml.Vector4f
 */
package net.irisshaders.iris.shadows;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.AddressMode;
import com.mojang.blaze3d.textures.FilterMode;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import minecraft.class00394;
import minecraft.class00608;
import minecraft.class00985;
import minecraft.class01237;
import minecraft.class01383;
import minecraft.class01386;
import minecraft.class01421;
import minecraft.class01422;
import minecraft.class01434;
import minecraft.class01590;
import minecraft.class01781;
import minecraft.class02233;
import minecraft.class03063;
import minecraft.class03106;
import minecraft.class03386;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04477;
import minecraft.class04643;
import minecraft.class04790;
import minecraft.class04995;
import minecraft.class05363;
import minecraft.class05630;
import minecraft.class05834;
import minecraft.class05932;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class06959;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class08133;
import minecraft.class08188;
import minecraft.class08700;
import minecraft.class08760;
import minecraft.class08768;
import minecraft.class08800;
import net.caffeinemc.mods.sodium.client.render.chunk.ChunkRenderMatrices;
import net.caffeinemc.mods.sodium.client.util.SodiumChunkSection;
import net.caffeinemc.mods.sodium.client.world.LevelRendererExtension;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.compat.dh.DHCompat;
import net.irisshaders.iris.gl.GLDebug;
import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.gui.option.IrisVideoSettings;
import net.irisshaders.iris.mixin.LevelRendererAccessor;
import net.irisshaders.iris.pipeline.IrisRenderingPipeline;
import net.irisshaders.iris.pipeline.WorldRenderingPhase;
import net.irisshaders.iris.shaderpack.programs.ProgramSource;
import net.irisshaders.iris.shaderpack.properties.PackDirectives;
import net.irisshaders.iris.shaderpack.properties.PackShadowDirectives;
import net.irisshaders.iris.shaderpack.properties.PackShadowDirectives$DepthSamplingSettings;
import net.irisshaders.iris.shaderpack.properties.PackShadowDirectives$SamplingSettings;
import net.irisshaders.iris.shaderpack.properties.ShadowCullState;
import net.irisshaders.iris.shadows.CullingDataCache;
import net.irisshaders.iris.shadows.ShadowCompositeRenderer;
import net.irisshaders.iris.shadows.ShadowMatrices;
import net.irisshaders.iris.shadows.ShadowRenderTargets;
import net.irisshaders.iris.shadows.ShadowRenderer$MipmapPass;
import net.irisshaders.iris.shadows.frustum.BoxCuller;
import net.irisshaders.iris.shadows.frustum.CullEverythingFrustum;
import net.irisshaders.iris.shadows.frustum.FrustumHolder;
import net.irisshaders.iris.shadows.frustum.advanced.AdvancedShadowCullingFrustum;
import net.irisshaders.iris.shadows.frustum.advanced.SafeZoneCullingFrustum;
import net.irisshaders.iris.shadows.frustum.fallback.BoxCullingFrustum;
import net.irisshaders.iris.shadows.frustum.fallback.NonCullingFrustum;
import net.irisshaders.iris.uniforms.CameraUniforms;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import net.irisshaders.iris.uniforms.CelestialUniforms;
import net.irisshaders.iris.uniforms.custom.CustomUniforms;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector3d;
import org.joml.Vector3f;
import org.joml.Vector4f;

public class ShadowRenderer {
    public static boolean ACTIVE = false;
    public static List<class00394> visibleBlockEntities;
    public static int renderDistance;
    public static Matrix4f MODELVIEW;
    public static Matrix4f PROJECTION;
    public static class01383 FRUSTUM;
    private final float halfPlaneLength;
    private final float nearPlane;
    private final float farPlane;
    private final float voxelDistance;
    private final float renderDistanceMultiplier;
    private final float entityShadowDistanceMultiplier;
    private final int resolution;
    private final float intervalSize;
    private final Float fov;
    private final ShadowRenderTargets targets;
    private final ShadowCullState packCullingState;
    private final ShadowCompositeRenderer compositeRenderer;
    private final boolean shouldRenderTerrain;
    private final boolean shouldRenderTranslucent;
    private final boolean shouldRenderEntities;
    private final boolean shouldRenderPlayer;
    private final boolean shouldRenderBlockEntities;
    private final boolean shouldRenderDH;
    private final float sunPathRotation;
    private final class01386 buffers;
    private final List<ShadowRenderer$MipmapPass> mipmapPasses = new ArrayList<ShadowRenderer$MipmapPass>();
    private final String debugStringOverall;
    private final boolean separateHardwareSamplers;
    private final boolean shouldRenderLightBlockEntities;
    private final IrisRenderingPipeline pipeline;
    private final class01434 outlineBuffers;
    private boolean packHasVoxelization;
    private FrustumHolder terrainFrustumHolder;
    private FrustumHolder entityFrustumHolder;
    private String debugStringTerrain = "(unavailable)";
    private int renderedShadowEntities = 0;
    private int renderedShadowBlockEntities = 0;
    private final class05932 levelRenderState;
    private final class04790 submitNodeStorage;
    private final class08133 featureRenderDispatcher;

    private static class03448 getLevel() {
        return Objects.requireNonNull((class03448)class06202.Nq().T_3);
    }

    public void renderShadows(LevelRendererAccessor levelRendererAccessor, class05363 class053632, class06959 class069592) {
        class04453 class044532;
        if (IrisVideoSettings.getOverriddenShadowDistance((int)IrisVideoSettings.shadowDistance) == 0) {
            return;
        }
        class08188 class081882 = RenderSystem.getSamplerCache().N(AddressMode.CLAMP_TO_EDGE, AddressMode.CLAMP_TO_EDGE, FilterMode.NEAREST, FilterMode.NEAREST, true);
        this.levelRenderState.N.N = class069592.N;
        this.levelRenderState.N.y = class069592.y;
        this.levelRenderState.N.i = class069592.i;
        this.levelRenderState.N.u = class069592.u;
        this.levelRenderState.N.L = class069592.L;
        class06202 class062022 = class06202.Nq();
        class04643 class046432 = class08700.N();
        class046432.y("shadows");
        ACTIVE = true;
        renderDistance = (int)(this.halfPlaneLength * this.renderDistanceMultiplier / 16.0f);
        if (this.renderDistanceMultiplier < 0.0f) {
            renderDistance = IrisVideoSettings.shadowDistance;
        }
        visibleBlockEntities = new ArrayList<class00394>();
        class01386 class013862 = levelRendererAccessor.getRenderBuffers();
        levelRendererAccessor.setRenderBuffers(this.buffers);
        visibleBlockEntities = new ArrayList<class00394>();
        this.setupShadowViewport();
        class01421 class014212 = ShadowRenderer.createShadowModelView(this.sunPathRotation, this.intervalSize, this.nearPlane, this.farPlane);
        MODELVIEW = new Matrix4f((Matrix4fc)class014212.L().N());
        RenderSystem.getModelViewStack().pushMatrix();
        RenderSystem.getModelViewStack().set((Matrix4fc)MODELVIEW);
        Matrix4f matrix4f = this.fov != null ? ShadowMatrices.createPerspectiveMatrix(this.fov.floatValue()) : ShadowMatrices.createOrthoMatrix(this.halfPlaneLength, class04995.y((float)this.nearPlane, (float)-1.0f) ? (float)(-DHCompat.getRenderDistance() * 16) : this.nearPlane, class04995.y((float)this.farPlane, (float)-1.0f) ? (float)(DHCompat.getRenderDistance() * 16) : this.farPlane);
        IrisRenderSystem.setShadowProjection((Matrix4f)matrix4f);
        PROJECTION = matrix4f;
        class046432.N("terrain_setup");
        if (levelRendererAccessor instanceof CullingDataCache) {
            ((CullingDataCache)levelRendererAccessor).saveState();
        }
        class046432.N("initialize frustum");
        this.terrainFrustumHolder = this.createShadowFrustum(this.renderDistanceMultiplier, this.terrainFrustumHolder);
        FRUSTUM = this.terrainFrustumHolder.getFrustum();
        Vector3d vector3d = CameraUniforms.getUnshiftedCameraPosition();
        double d = vector3d.x();
        double d2 = vector3d.y();
        double d3 = vector3d.z();
        this.terrainFrustumHolder.getFrustum().method_23088(d, d2, d3);
        class046432.L();
        boolean bl = (Boolean)class062022.U_2;
        Boolean bl2 = false;
        class062022.U_2 = bl2;
        ChunkRenderMatrices chunkRenderMatrices = ((LevelRendererExtension)levelRendererAccessor).sodium$getMatrices();
        ((LevelRendererExtension)levelRendererAccessor).sodium$setMatrices(new ChunkRenderMatrices((Matrix4fc)matrix4f, (Matrix4fc)MODELVIEW));
        ((class03063)levelRendererAccessor).W();
        levelRendererAccessor.invokeCullTerrain(class053632, this.terrainFrustumHolder.getFrustum(), false);
        Boolean bl3 = bl;
        class062022.U_2 = bl3;
        class046432.y("terrain");
        GlStateManager._disableCull();
        class08760 class087602 = new class08760(null, null, 0, null);
        ((SodiumChunkSection)class087602).sodium$setRendering(((LevelRendererExtension)levelRendererAccessor).sodium$getWorldRenderer(), ((LevelRendererExtension)levelRendererAccessor).sodium$getMatrices(), d, d2, d3);
        if (this.shouldRenderTerrain) {
            this.pipeline.setPhase(WorldRenderingPhase.TERRAIN_SOLID);
            class087602.N(class08768.field_61022, class081882);
            this.pipeline.setPhase(WorldRenderingPhase.NONE);
        }
        this.pipeline.setPhase(WorldRenderingPhase.ENTITIES);
        GlStateManager._viewport((int)0, (int)0, (int)this.resolution, (int)this.resolution);
        class046432.y("entities");
        float f = CapturedRenderingState.INSTANCE.getTickDelta();
        boolean bl4 = false;
        if (this.entityShadowDistanceMultiplier == 1.0f || this.entityShadowDistanceMultiplier < 0.0f) {
            this.entityFrustumHolder.setInfo(this.terrainFrustumHolder.getFrustum(), this.terrainFrustumHolder.getDistanceInfo(), this.terrainFrustumHolder.getCullingInfo());
        } else {
            bl4 = true;
            this.entityFrustumHolder = this.createShadowFrustum(this.renderDistanceMultiplier * this.entityShadowDistanceMultiplier, this.entityFrustumHolder);
        }
        class01383 class013832 = this.entityFrustumHolder.getFrustum();
        class013832.method_23088(d, d2, d3);
        this.levelRenderState.N();
        if (this.shouldRenderEntities) {
            this.extractVisibleEntities(class053632, this.entityFrustumHolder.getFrustum(), class06202.Nq().NK(), this.levelRenderState);
        } else if (this.shouldRenderPlayer) {
            class044532 = (class04453)class06202.Nq().T_4;
            float f2 = class06202.Nq().NK().N(false);
            if (!class044532.method_7325() && !class044532.method_5767()) {
                this.levelRenderState.y.add(class06202.Nq().Ng().y((class07049)class044532, f2));
            }
            if (class044532.method_5854() != null) {
                this.levelRenderState.y.add(class06202.Nq().Ng().y(class044532.method_5854(), f2));
            }
        }
        class044532 = this.buffers.L();
        class01781 class017812 = levelRendererAccessor.getEntityRenderDispatcher();
        RenderSystem.getModelViewStack().identity();
        this.renderedShadowEntities = this.renderEntities(levelRendererAccessor, class017812, (class01422)class044532, class014212, f, class013832, d, d2, d3);
        class046432.y("build blockentities");
        if (this.shouldRenderBlockEntities || this.shouldRenderLightBlockEntities) {
            this.extractVisibleBlockEntities(levelRendererAccessor, (class01422)class044532, class014212, f, class053632, this.levelRenderState, !this.shouldRenderBlockEntities && this.shouldRenderLightBlockEntities);
        }
        this.renderedShadowBlockEntities = this.renderBlockEntities(levelRendererAccessor, class014212, this.submitNodeStorage, this.levelRenderState, class053632);
        class046432.y("draw entities");
        this.featureRenderDispatcher.N();
        class044532.u();
        this.copyPreTranslucentDepth(levelRendererAccessor);
        RenderSystem.getModelViewStack().set((Matrix4fc)MODELVIEW);
        class046432.y("translucent terrain");
        this.pipeline.setPhase(WorldRenderingPhase.NONE);
        if (this.shouldRenderTranslucent) {
            this.pipeline.setPhase(WorldRenderingPhase.TERRAIN_TRANSLUCENT);
            class087602.N(class08768.field_61023, class081882);
            this.pipeline.setPhase(WorldRenderingPhase.NONE);
        }
        IrisRenderSystem.restorePlayerProjection();
        this.debugStringTerrain = ((class03063)levelRendererAccessor).k();
        class046432.y("generate mipmaps");
        this.generateMipmaps();
        class046432.y("restore gl state");
        GlStateManager._enableCull();
        ((LevelRendererExtension)levelRendererAccessor).sodium$setMatrices(chunkRenderMatrices);
        GlStateManager._viewport((int)0, (int)0, (int)class062022.e().N, (int)class062022.e().y);
        if (levelRendererAccessor instanceof CullingDataCache) {
            ((CullingDataCache)levelRendererAccessor).restoreState();
        }
        this.pipeline.removePhaseIfNeeded();
        GLDebug.pushGroup((int)901, (String)"shadowcomp");
        this.compositeRenderer.renderAll();
        GLDebug.popGroup();
        levelRendererAccessor.setRenderBuffers(class013862);
        visibleBlockEntities = null;
        ACTIVE = false;
        RenderSystem.getModelViewStack().popMatrix();
        class046432.L();
        class046432.y("updatechunks");
    }

    public ShadowRenderer(IrisRenderingPipeline irisRenderingPipeline, ProgramSource programSource, PackDirectives packDirectives, ShadowRenderTargets shadowRenderTargets, ShadowCompositeRenderer shadowCompositeRenderer, CustomUniforms customUniforms, boolean bl) {
        this.pipeline = irisRenderingPipeline;
        this.separateHardwareSamplers = bl;
        PackShadowDirectives packShadowDirectives = packDirectives.getShadowDirectives();
        this.halfPlaneLength = packShadowDirectives.getDistance();
        this.nearPlane = packShadowDirectives.getNearPlane();
        this.farPlane = packShadowDirectives.getFarPlane();
        this.voxelDistance = packShadowDirectives.getVoxelDistance();
        this.renderDistanceMultiplier = packShadowDirectives.getDistanceRenderMul();
        this.entityShadowDistanceMultiplier = packShadowDirectives.getEntityShadowDistanceMul();
        this.resolution = packShadowDirectives.getResolution();
        this.intervalSize = packShadowDirectives.getIntervalSize();
        this.shouldRenderTerrain = packShadowDirectives.shouldRenderTerrain();
        this.shouldRenderTranslucent = packShadowDirectives.shouldRenderTranslucent();
        this.shouldRenderEntities = packShadowDirectives.shouldRenderEntities();
        this.shouldRenderPlayer = packShadowDirectives.shouldRenderPlayer();
        this.shouldRenderBlockEntities = packShadowDirectives.shouldRenderBlockEntities();
        this.shouldRenderLightBlockEntities = packShadowDirectives.shouldRenderLightBlockEntities();
        this.shouldRenderDH = packShadowDirectives.isDhShadowEnabled().orElse(false);
        this.compositeRenderer = shadowCompositeRenderer;
        this.debugStringOverall = "half plane = " + this.halfPlaneLength + " meters @ " + this.resolution + "x" + this.resolution;
        this.terrainFrustumHolder = new FrustumHolder();
        this.entityFrustumHolder = new FrustumHolder();
        this.fov = packShadowDirectives.getFov();
        this.targets = shadowRenderTargets;
        if (programSource != null) {
            this.packHasVoxelization = programSource.getGeometrySource().isPresent();
            this.packCullingState = packShadowDirectives.getCullingState();
        } else {
            this.packHasVoxelization = false;
            this.packCullingState = ShadowCullState.DEFAULT;
        }
        this.sunPathRotation = packDirectives.getSunPathRotation();
        int n = Runtime.getRuntime().availableProcessors();
        this.buffers = new class01386(n);
        this.outlineBuffers = new class01434();
        this.configureSamplingSettings(packShadowDirectives);
        this.levelRenderState = new class05932();
        this.submitNodeStorage = new class04790();
        this.featureRenderDispatcher = new class08133(this.submitNodeStorage, class06202.Nq().yU(), this.buffers.L(), class06202.Nq().yW(), this.outlineBuffers, this.buffers.u(), (class01590)class06202.Nq().i_3);
    }

    public void destroy() {
    }

    private void generateMipmaps() {
        GlStateManager._activeTexture((int)33988);
        for (ShadowRenderer$MipmapPass shadowRenderer$MipmapPass : this.mipmapPasses) {
            this.setupMipmappingForTexture(shadowRenderer$MipmapPass.texture(), shadowRenderer$MipmapPass.targetFilteringMode());
        }
        GlStateManager._activeTexture((int)33984);
    }

    private void setupMipmappingForTexture(int n, int n2) {
        IrisRenderSystem.generateMipmaps((int)n, (int)3553);
        IrisRenderSystem.texParameteri((int)n, (int)3553, (int)10241, (int)n2);
    }

    private String getEntitiesDebugString() {
        return this.shouldRenderEntities || this.shouldRenderPlayer ? this.renderedShadowEntities + "/" + ((class03448)class06202.Nq().T_3 == null ? 0 : ((class03448)class06202.Nq().T_3).z()) : "disabled by pack";
    }

    private FrustumHolder createShadowFrustum(float f, FrustumHolder frustumHolder) {
        String string;
        double d;
        if (this.packCullingState == ShadowCullState.DEFAULT && this.packHasVoxelization || this.packCullingState == ShadowCullState.DISTANCE) {
            d = this.halfPlaneLength * f;
            string = this.packCullingState == ShadowCullState.DISTANCE ? "(set by shader pack)" : "(voxelization detected)";
            if (d <= 0.0 || d > (double)(((class05630)class06202.Nq().i_7).Nh() * 16)) {
                String string2 = "render distance = " + ((class05630)class06202.Nq().i_7).Nh() * 16 + " blocks ";
                string2 = string2 + (class06202.Nq().q() ? "(capped by normal render distance)" : "(capped by normal/server render distance)");
                String string3 = "disabled " + string;
                return frustumHolder.setInfo(new NonCullingFrustum(), string2, string3);
            }
        } else {
            Object object;
            BoxCuller boxCuller;
            String string4;
            boolean bl;
            boolean bl2 = bl = this.packCullingState == ShadowCullState.SAFE_ZONE;
            if (bl && f < 0.0f) {
                f = 1.0f;
            }
            double d2 = (bl ? this.voxelDistance : this.halfPlaneLength) * f;
            String string5 = "(set by shader pack)";
            if (f < 0.0f) {
                d2 = IrisVideoSettings.shadowDistance * 16;
                string5 = "(set by user)";
            }
            if (d2 >= (double)(((class05630)class06202.Nq().i_7).Nh() * 16) && !bl) {
                string4 = "render distance = " + ((class05630)class06202.Nq().i_7).Nh() * 16 + " blocks ";
                string4 = (String)string4 + (class06202.Nq().q() ? "(capped by normal render distance)" : "(capped by normal/server render distance)");
                boxCuller = null;
            } else {
                string4 = d2 + " blocks " + string5;
                if (d2 == 0.0 && !bl) {
                    object = "no shadows rendered";
                    frustumHolder.setInfo(new CullEverythingFrustum(), string4, (String)object);
                }
                boxCuller = new BoxCuller(d2);
            }
            object = (bl ? "Safe Zone" : "Advanced") + " Frustum Culling enabled";
            Vector4f vector4f = new CelestialUniforms(this.sunPathRotation).getShadowLightPositionInWorldSpace();
            Vector3f vector3f = new Vector3f(vector4f.x(), vector4f.y(), vector4f.z());
            vector3f.normalize();
            Matrix4f matrix4f = (this.shouldRenderDH && DHCompat.hasRenderingEnabled() ? DHCompat.getProjection() : CapturedRenderingState.INSTANCE.getGbufferProjection()).mul(CapturedRenderingState.INSTANCE.getGbufferModelView(), new Matrix4f());
            if (bl) {
                return frustumHolder.setInfo(new SafeZoneCullingFrustum((Matrix4fc)matrix4f, (Matrix4fc)PROJECTION, vector3f, boxCuller, new BoxCuller(this.halfPlaneLength * f)), string4, (String)object);
            }
            return frustumHolder.setInfo(new AdvancedShadowCullingFrustum((Matrix4fc)matrix4f, (Matrix4fc)PROJECTION, vector3f, boxCuller), string4, (String)object);
        }
        String string6 = d + " blocks (set by shader pack)";
        String string7 = "distance only " + string;
        BoxCuller boxCuller = new BoxCuller(d);
        frustumHolder.setInfo(new BoxCullingFrustum(boxCuller), string6, string7);
        return frustumHolder;
    }

    private void configureDepthSampler(int n, PackShadowDirectives$DepthSamplingSettings packShadowDirectives$DepthSamplingSettings) {
        if (packShadowDirectives$DepthSamplingSettings.getHardwareFiltering() && !this.separateHardwareSamplers) {
            IrisRenderSystem.texParameteri((int)n, (int)3553, (int)34892, (int)34894);
        }
        int[] nArray = new int[4];
        nArray[0] = 6403;
        nArray[1] = 6403;
        nArray[2] = 6403;
        nArray[3] = 1;
        IrisRenderSystem.texParameteriv((int)n, (int)3553, (int)36422, (int[])nArray);
        this.configureSampler(n, packShadowDirectives$DepthSamplingSettings);
    }

    public static class01421 createShadowModelView(float f, float f2, float f3, float f4) {
        Vector3d vector3d = CameraUniforms.getUnshiftedCameraPosition();
        double d = vector3d.x;
        double d2 = vector3d.y;
        double d3 = vector3d.z;
        class01421 class014212 = new class01421();
        ShadowMatrices.createModelViewMatrix(class014212, ShadowRenderer.getShadowAngle(), f2, f, d, d2, d3, f3, f4);
        return class014212;
    }

    private void extractVisibleEntities(class05363 class053632, class01383 class013832, class02233 class022332, class05932 class059322) {
        class06889 class068892 = class053632.y();
        double d = class068892.N();
        double d2 = class068892.y();
        double d3 = class068892.L();
        class03106 class031062 = ((class03448)class06202.Nq().T_3).method_54719();
        class07049.method_5840((double)(class04995.N((double)((double)((class05630)class06202.Nq().i_7).Nh() / 8.0), (double)1.0, (double)2.5) * (Double)((class05630)class06202.Nq().i_7).M().method_41753()));
        for (class07049 class070492 : ((class03448)class06202.Nq().T_3).M()) {
            class04477 class044772;
            if (class070492 instanceof class04477 && (class044772 = (class04477)class070492).method_7325() || !class06202.Nq().Ng().N(class070492, class013832, d, d2, d3) && !class070492.method_5821((class07049)((class04453)class06202.Nq().T_4)) || !((class03448)class06202.Nq().T_3).method_31601((class044772 = class070492.method_24515()).method_10264()) && !((class03063)class06202.Nq().B_2).N((class07209)class044772)) continue;
            if (class070492.field_6012 == 0) {
                class070492.field_6038 = class070492.method_23317();
                class070492.field_5971 = class070492.method_23318();
                class070492.field_5989 = class070492.method_23321();
            }
            float f = class022332.N(!class031062.N(class070492));
            class08800 class088002 = class06202.Nq().Ng().y(class070492, f);
            class059322.y.add(class088002);
        }
    }

    public void setupShadowViewport() {
        GlStateManager._viewport((int)0, (int)0, (int)this.resolution, (int)this.resolution);
    }

    private int renderBlockEntities(LevelRendererAccessor levelRendererAccessor, class01421 class014212, class04790 class047902, class05932 class059322, class05363 class053632) {
        class06889 class068892 = class053632.y();
        class01421 class014213 = class014212;
        double d = class068892.N();
        double d2 = class068892.y();
        double d3 = class068892.L();
        int n = 0;
        for (class00985 class009852 : class059322.L) {
            class07209 class072092 = class009852.R;
            class014213.N();
            class014213.N((double)class072092.method_10263() - d, (double)class072092.method_10264() - d2, (double)class072092.method_10260() - d3);
            class06202.Nq().K().N(class009852, class014213, (class01237)class047902, class059322.N);
            class014213.y();
            ++n;
        }
        return n;
    }

    private void configureSamplingSettings(PackShadowDirectives packShadowDirectives) {
        ImmutableList<PackShadowDirectives$DepthSamplingSettings> immutableList = packShadowDirectives.getDepthSamplingSettings();
        Int2ObjectMap<PackShadowDirectives$SamplingSettings> int2ObjectMap = packShadowDirectives.getColorSamplingSettings();
        GlStateManager._activeTexture((int)33988);
        this.configureDepthSampler(this.targets.getDepthTexture().iris$getGlId(), (PackShadowDirectives$DepthSamplingSettings)immutableList.get(0));
        this.configureDepthSampler(this.targets.getDepthTextureNoTranslucents().iris$getGlId(), (PackShadowDirectives$DepthSamplingSettings)immutableList.get(1));
        for (int i = 0; i < this.targets.getNumColorTextures(); ++i) {
            if (this.targets.get(i) == null) continue;
            int n2 = this.targets.get(i).getMainTexture();
            this.configureSampler(n2, (PackShadowDirectives$SamplingSettings)int2ObjectMap.computeIfAbsent(i, n -> new PackShadowDirectives$SamplingSettings()));
        }
        GlStateManager._activeTexture((int)33984);
    }

    private String getBlockEntitiesDebugString() {
        return this.shouldRenderBlockEntities || this.shouldRenderLightBlockEntities ? "" + this.renderedShadowBlockEntities : "disabled by pack";
    }

    private void extractVisibleBlockEntities(LevelRendererAccessor levelRendererAccessor, class01422 class014222, class01421 class014212, float f, class05363 class053632, class05932 class059322, boolean bl) {
        levelRendererAccessor.invokeExtractBlockEntities(class053632, f, class059322);
        if (bl) {
            Iterator iterator = class059322.L.iterator();
            while (iterator.hasNext()) {
                class00985 class009852 = (class00985)iterator.next();
                if (class009852.M.m() != 0) continue;
                iterator.remove();
            }
        }
    }

    private int renderEntities(LevelRendererAccessor levelRendererAccessor, class01781 class017812, class01422 class014222, class01421 class014212, float f, class01383 class013832, double d, double d2, double d3) {
        class08700.N().N("cull");
        for (class08800 class088002 : this.levelRenderState.y) {
            class06202.Nq().Ng().N(class088002, this.levelRenderState.N, class088002.E - d, class088002.W - d2, class088002.m - d3, class014212, (class01237)this.submitNodeStorage);
        }
        class08700.N().L();
        return this.levelRenderState.y.size();
    }

    public void setUsesImages(boolean bl) {
        this.packHasVoxelization = this.packHasVoxelization || bl;
    }

    private String getProjectionInfo() {
        return "Near: " + this.nearPlane + " Far: " + this.farPlane + " distance " + this.halfPlaneLength;
    }

    public static float getSunAngle(boolean bl) {
        float f = ((Float)((class03386)class06202.Nq().i_5).s().U().N(bl ? class00608.W : class00608.m, CapturedRenderingState.INSTANCE.getTickDelta())).floatValue();
        float f2 = f + 90.0f;
        if (f2 < 0.0f) {
            f2 += 360.0f;
        } else if (f2 > 360.0f) {
            f2 -= 360.0f;
        }
        return f2;
    }

    private void configureSampler(int n, PackShadowDirectives$SamplingSettings packShadowDirectives$SamplingSettings) {
        if (packShadowDirectives$SamplingSettings.getMipmap()) {
            int n2 = packShadowDirectives$SamplingSettings.getNearest() ? 9984 : 9987;
            this.mipmapPasses.add(new ShadowRenderer$MipmapPass(n, n2));
        }
        if (!packShadowDirectives$SamplingSettings.getNearest()) {
            IrisRenderSystem.texParameteri((int)n, (int)3553, (int)10241, (int)9729);
            IrisRenderSystem.texParameteri((int)n, (int)3553, (int)10240, (int)9729);
        } else {
            IrisRenderSystem.texParameteri((int)n, (int)3553, (int)10241, (int)9728);
            IrisRenderSystem.texParameteri((int)n, (int)3553, (int)10240, (int)9728);
        }
    }

    private int renderPlayerEntity(LevelRendererAccessor levelRendererAccessor, class01781 class017812, class01422 class014222, class01421 class014212, float f, class01383 class013832, double d, double d2, double d3) {
        class08700.N().N("cull");
        class04453 class044532 = (class04453)class06202.Nq().T_4;
        int n = 0;
        if (!class017812.N((class07049)class044532, class013832, d, d2, d3) || class044532.method_7325()) {
            class08700.N().L();
            return 0;
        }
        class08700.N().y("build geometry");
        if (!class044532.method_5685().isEmpty()) {
            for (int i = 0; i < class044532.method_5685().size(); ++i) {
                float f2 = ((class03448)class06202.Nq().T_3).method_54719().N((class07049)class044532.method_5685().get(i)) ? f : CapturedRenderingState.INSTANCE.getRealTickDelta();
                ++n;
            }
        }
        if (class044532.method_5854() != null) {
            float f3 = ((class03448)class06202.Nq().T_3).method_54719().N(class044532.method_5854()) ? f : CapturedRenderingState.INSTANCE.getRealTickDelta();
            ++n;
        }
        float f4 = ((class03448)class06202.Nq().T_3).method_54719().N((class07049)class044532) ? f : CapturedRenderingState.INSTANCE.getRealTickDelta();
        class08700.N().L();
        return ++n;
    }

    private static float getShadowAngle() {
        float f = ShadowRenderer.getSunAngle(CelestialUniforms.isDay());
        return f / 360.0f;
    }

    private void copyPreTranslucentDepth(LevelRendererAccessor levelRendererAccessor) {
        class08700.N().y("translucent depth copy");
        this.targets.copyPreTranslucentDepth();
    }

    public void addDebugText(class05834 class058342) {
        if (IrisVideoSettings.getOverriddenShadowDistance((int)IrisVideoSettings.shadowDistance) == 0) {
            class058342.y("[Iris] Shadow Maps: off, shadow distance 0");
            return;
        }
        if (Iris.getIrisConfig().areDebugOptionsEnabled()) {
            class058342.y("[Iris] Shadow Maps: " + this.debugStringOverall);
            class058342.y("[Iris] Shadow Distance Terrain: " + this.terrainFrustumHolder.getDistanceInfo() + " Entity: " + this.entityFrustumHolder.getDistanceInfo());
            class058342.y("[Iris] Shadow Culling Terrain: " + this.terrainFrustumHolder.getCullingInfo() + " Entity: " + this.entityFrustumHolder.getCullingInfo());
            class058342.y("[Iris] Shadow Projection: " + this.getProjectionInfo());
            class058342.y("[Iris] Shadow Terrain: " + this.debugStringTerrain + (this.shouldRenderTerrain ? "" : " (no terrain) ") + (this.shouldRenderTranslucent ? "" : "(no translucent)"));
            class058342.y("[Iris] Shadow Entities: " + this.getEntitiesDebugString());
            class058342.y("[Iris] Shadow Block Entities: " + this.getBlockEntitiesDebugString());
        } else {
            class058342.y("[Iris] Shadow info: " + this.debugStringTerrain);
            class058342.y("[Iris] E: " + this.renderedShadowEntities);
            class058342.y("[Iris] BE: " + this.renderedShadowBlockEntities);
        }
    }
}

