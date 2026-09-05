/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  it.unimi.dsi.fastutil.objects.Object2ObjectMap
 *  minecraft.class05363
 *  minecraft.class05834
 *  minecraft.class06959
 *  net.irisshaders.iris.compat.dh.DHCompat
 *  net.irisshaders.iris.features.FeatureFlags
 *  net.irisshaders.iris.gl.texture.TextureType
 *  net.irisshaders.iris.helpers.Tri
 *  net.irisshaders.iris.mixin.LevelRendererAccessor
 *  net.irisshaders.iris.shaderpack.properties.CloudSetting
 *  net.irisshaders.iris.shaderpack.properties.ParticleRenderingSettings
 *  net.irisshaders.iris.shaderpack.texture.TextureStage
 *  net.irisshaders.iris.uniforms.FrameUpdateNotifier
 */
package net.irisshaders.iris.pipeline;

import com.mojang.blaze3d.textures.GpuTextureView;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import java.util.OptionalInt;
import minecraft.class05363;
import minecraft.class05834;
import minecraft.class06959;
import net.irisshaders.iris.compat.dh.DHCompat;
import net.irisshaders.iris.features.FeatureFlags;
import net.irisshaders.iris.gl.texture.TextureType;
import net.irisshaders.iris.helpers.Tri;
import net.irisshaders.iris.mixin.LevelRendererAccessor;
import net.irisshaders.iris.pipeline.WorldRenderingPhase;
import net.irisshaders.iris.pipeline.programs.SodiumPrograms;
import net.irisshaders.iris.shaderpack.properties.CloudSetting;
import net.irisshaders.iris.shaderpack.properties.ParticleRenderingSettings;
import net.irisshaders.iris.shaderpack.texture.TextureStage;
import net.irisshaders.iris.uniforms.FrameUpdateNotifier;

public interface WorldRenderingPipeline {
    public boolean hasFeature(FeatureFlags var1);

    public CloudSetting getCloudSetting();

    public int getAlbedoTex();

    public void setOverridePhase(WorldRenderingPhase var1);

    public Object2ObjectMap<Tri<String, TextureType, TextureStage>, String> getTextureMap();

    public SodiumPrograms getSodiumPrograms();

    public boolean shouldRenderStars();

    public float getSunPathRotation();

    public void renderShadows(LevelRendererAccessor var1, class05363 var2, class06959 var3);

    public DHCompat getDHCompat();

    public boolean shouldRenderMoon();

    public void onBeginClear();

    public void onSetAlbedoTex(GpuTextureView var1);

    public boolean shouldRenderSun();

    public boolean supportsEndFlash();

    public void beginTranslucents();

    public void destroy();

    public void beginHand();

    public OptionalInt getForcedShadowRenderDistanceChunksForDisplay();

    public ParticleRenderingSettings getParticleRenderingSettings();

    public boolean shouldRenderWeatherParticles();

    public void setIsMainBound(boolean var1);

    public boolean shouldRenderUnderwaterOverlay();

    public void setPhase(WorldRenderingPhase var1);

    public WorldRenderingPhase getPhase();

    public boolean shouldDisableFrustumCulling();

    public boolean shouldDisableOcclusionCulling();

    public boolean shouldDisableVanillaEntityShadows();

    public boolean shouldDisableDirectionalShading();

    public boolean shouldWriteRainAndSnowToDepthBuffer();

    public boolean allowConcurrentCompute();

    public void finalizeGameRendering();

    public int getCurrentNormalTexture();

    public void beginLevelRendering();

    public void finalizeLevelRendering();

    public boolean shouldRenderVignette();

    public boolean shouldRenderSkyDisc();

    public FrameUpdateNotifier getFrameUpdateNotifier();

    public boolean shouldRenderWeather();

    public int getCurrentSpecularTexture();

    public void addDebugText(class05834 var1);
}

