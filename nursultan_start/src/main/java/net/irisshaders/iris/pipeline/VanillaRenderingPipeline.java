/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  it.unimi.dsi.fastutil.objects.Object2ObjectMap
 *  it.unimi.dsi.fastutil.objects.Object2ObjectMaps
 *  minecraft.class05363
 *  minecraft.class05834
 *  minecraft.class06959
 *  net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkMeshFormats
 *  net.irisshaders.iris.compat.dh.DHCompat
 *  net.irisshaders.iris.features.FeatureFlags
 *  net.irisshaders.iris.gl.texture.TextureType
 *  net.irisshaders.iris.helpers.Tri
 *  net.irisshaders.iris.mixin.LevelRendererAccessor
 *  net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings
 *  net.irisshaders.iris.shaderpack.properties.CloudSetting
 *  net.irisshaders.iris.shaderpack.properties.ParticleRenderingSettings
 *  net.irisshaders.iris.shaderpack.texture.TextureStage
 *  net.irisshaders.iris.uniforms.FrameUpdateNotifier
 */
package net.irisshaders.iris.pipeline;

import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.textures.GpuTextureView;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMaps;
import java.util.Map;
import java.util.OptionalInt;
import minecraft.class05363;
import minecraft.class05834;
import minecraft.class06959;
import net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkMeshFormats;
import net.irisshaders.iris.compat.dh.DHCompat;
import net.irisshaders.iris.features.FeatureFlags;
import net.irisshaders.iris.gl.texture.TextureType;
import net.irisshaders.iris.helpers.Tri;
import net.irisshaders.iris.mixin.LevelRendererAccessor;
import net.irisshaders.iris.pipeline.WorldRenderingPhase;
import net.irisshaders.iris.pipeline.WorldRenderingPipeline;
import net.irisshaders.iris.pipeline.programs.SodiumPrograms;
import net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings;
import net.irisshaders.iris.shaderpack.properties.CloudSetting;
import net.irisshaders.iris.shaderpack.properties.ParticleRenderingSettings;
import net.irisshaders.iris.shaderpack.texture.TextureStage;
import net.irisshaders.iris.uniforms.FrameUpdateNotifier;

public class VanillaRenderingPipeline
implements WorldRenderingPipeline {
    @Override
    public boolean hasFeature(FeatureFlags featureFlags) {
        return false;
    }

    @Override
    public CloudSetting getCloudSetting() {
        return CloudSetting.DEFAULT;
    }

    @Override
    public int getAlbedoTex() {
        return 0;
    }

    @Override
    public void setOverridePhase(WorldRenderingPhase worldRenderingPhase) {
    }

    @Override
    public Object2ObjectMap<Tri<String, TextureType, TextureStage>, String> getTextureMap() {
        return Object2ObjectMaps.emptyMap();
    }

    @Override
    public SodiumPrograms getSodiumPrograms() {
        return null;
    }

    @Override
    public boolean shouldRenderStars() {
        return true;
    }

    @Override
    public float getSunPathRotation() {
        return 0.0f;
    }

    @Override
    public void renderShadows(LevelRendererAccessor levelRendererAccessor, class05363 class053632, class06959 class069592) {
    }

    @Override
    public DHCompat getDHCompat() {
        return null;
    }

    @Override
    public boolean shouldRenderMoon() {
        return true;
    }

    @Override
    public void onBeginClear() {
    }

    @Override
    public void onSetAlbedoTex(GpuTextureView gpuTextureView) {
    }

    @Override
    public boolean shouldRenderSun() {
        return true;
    }

    @Override
    public boolean supportsEndFlash() {
        return false;
    }

    @Override
    public void beginTranslucents() {
    }

    public VanillaRenderingPipeline() {
        WorldRenderingSettings.INSTANCE.setDisableDirectionalShading(this.shouldDisableDirectionalShading());
        WorldRenderingSettings.INSTANCE.setUseSeparateAo(false);
        WorldRenderingSettings.INSTANCE.setSeparateEntityDraws(false);
        WorldRenderingSettings.INSTANCE.setAmbientOcclusionLevel(1.0f);
        WorldRenderingSettings.INSTANCE.setVertexFormat(ChunkMeshFormats.COMPACT);
        WorldRenderingSettings.INSTANCE.setVoxelizeLightBlocks(false);
        WorldRenderingSettings.INSTANCE.setBreaksAnisotropy(false);
        WorldRenderingSettings.INSTANCE.setBlockTypeIds((Map)Object2ObjectMaps.emptyMap());
    }

    @Override
    public void destroy() {
    }

    @Override
    public void beginHand() {
    }

    @Override
    public OptionalInt getForcedShadowRenderDistanceChunksForDisplay() {
        return OptionalInt.empty();
    }

    @Override
    public ParticleRenderingSettings getParticleRenderingSettings() {
        return ParticleRenderingSettings.MIXED;
    }

    @Override
    public boolean shouldRenderWeatherParticles() {
        return true;
    }

    @Override
    public void setIsMainBound(boolean bl) {
    }

    @Override
    public boolean shouldRenderUnderwaterOverlay() {
        return true;
    }

    @Override
    public void setPhase(WorldRenderingPhase worldRenderingPhase) {
    }

    @Override
    public WorldRenderingPhase getPhase() {
        return WorldRenderingPhase.NONE;
    }

    @Override
    public boolean shouldDisableFrustumCulling() {
        return false;
    }

    @Override
    public boolean shouldDisableOcclusionCulling() {
        return false;
    }

    @Override
    public boolean shouldDisableVanillaEntityShadows() {
        return false;
    }

    @Override
    public boolean shouldDisableDirectionalShading() {
        return false;
    }

    @Override
    public boolean shouldWriteRainAndSnowToDepthBuffer() {
        return false;
    }

    @Override
    public boolean allowConcurrentCompute() {
        return false;
    }

    @Override
    public void finalizeGameRendering() {
    }

    @Override
    public int getCurrentNormalTexture() {
        return 0;
    }

    @Override
    public void beginLevelRendering() {
        GlStateManager._glUseProgram((int)0);
    }

    @Override
    public void finalizeLevelRendering() {
    }

    @Override
    public boolean shouldRenderVignette() {
        return true;
    }

    @Override
    public boolean shouldRenderSkyDisc() {
        return true;
    }

    @Override
    public FrameUpdateNotifier getFrameUpdateNotifier() {
        return new FrameUpdateNotifier();
    }

    @Override
    public boolean shouldRenderWeather() {
        return true;
    }

    @Override
    public int getCurrentSpecularTexture() {
        return 0;
    }

    @Override
    public void addDebugText(class05834 class058342) {
    }
}

