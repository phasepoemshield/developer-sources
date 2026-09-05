/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  it.unimi.dsi.fastutil.objects.Object2BooleanMap
 *  it.unimi.dsi.fastutil.objects.Object2BooleanMaps
 *  it.unimi.dsi.fastutil.objects.Object2ObjectMap
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.gl.texture.TextureScaleOverride
 *  net.irisshaders.iris.gl.texture.TextureType
 *  net.irisshaders.iris.helpers.Tri
 *  org.joml.Vector2i
 */
package net.irisshaders.iris.shaderpack.properties;

import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMaps;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Set;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.gl.texture.TextureScaleOverride;
import net.irisshaders.iris.gl.texture.TextureType;
import net.irisshaders.iris.helpers.Tri;
import net.irisshaders.iris.shaderpack.parsing.DirectiveHolder;
import net.irisshaders.iris.shaderpack.properties.CloudSetting;
import net.irisshaders.iris.shaderpack.properties.PackRenderTargetDirectives;
import net.irisshaders.iris.shaderpack.properties.PackShadowDirectives;
import net.irisshaders.iris.shaderpack.properties.ParticleRenderingSettings;
import net.irisshaders.iris.shaderpack.properties.ShaderProperties;
import net.irisshaders.iris.shaderpack.texture.TextureStage;
import org.joml.Vector2i;

public class PackDirectives {
    private final PackRenderTargetDirectives renderTargetDirectives;
    private final PackShadowDirectives shadowDirectives;
    private final float drynessHalfLife;
    private int fallbackTex;
    private boolean supportsColorCorrection = false;
    private int noiseTextureResolution = 256;
    private float sunPathRotation = 0.0f;
    private float ambientOcclusionLevel = 1.0f;
    private float wetnessHalfLife = 600.0f;
    private float eyeBrightnessHalfLife = 10.0f;
    private float centerDepthHalfLife = 1.0f;
    private CloudSetting cloudSetting;
    private CloudSetting dhCloudSetting;
    private boolean underwaterOverlay;
    private boolean vignette;
    private boolean sun;
    private boolean weather;
    private boolean weatherParticles;
    private boolean moon;
    private boolean stars;
    private boolean sky;
    private boolean rainDepth;
    private boolean separateAo;
    private boolean breaksAnisotropy;
    private boolean voxelizeLightBlocks;
    private boolean separateEntityDraws;
    private boolean skipAllRendering;
    private boolean frustumCulling;
    private boolean supportsEndFlash;
    private boolean occlusionCulling;
    private boolean oldLighting;
    private boolean concurrentCompute;
    private boolean oldHandLight;
    private boolean prepareBeforeShadow;
    private Object2ObjectMap<String, Object2BooleanMap<String>> explicitFlips = new Object2ObjectOpenHashMap();
    private Object2ObjectMap<String, TextureScaleOverride> scaleOverrides = new Object2ObjectOpenHashMap();
    private Object2ObjectMap<Tri<String, TextureType, TextureStage>, String> textureMap;
    private ParticleRenderingSettings particleRenderingSettings;

    public CloudSetting getCloudSetting() {
        return this.cloudSetting;
    }

    public Object2ObjectMap<Tri<String, TextureType, TextureStage>, String> getTextureMap() {
        return this.textureMap;
    }

    public boolean shouldRenderStars() {
        return this.stars;
    }

    public float getSunPathRotation() {
        return this.sunPathRotation;
    }

    public boolean breaksAnisotropy() {
        return this.breaksAnisotropy;
    }

    public boolean shouldRenderMoon() {
        return this.moon;
    }

    public boolean shouldRenderSun() {
        return this.sun;
    }

    public boolean supportsEndFlash() {
        return this.supportsEndFlash;
    }

    private PackDirectives(Set<Integer> set, PackShadowDirectives packShadowDirectives) {
        this.drynessHalfLife = 200.0f;
        this.renderTargetDirectives = new PackRenderTargetDirectives(set);
        this.shadowDirectives = packShadowDirectives;
    }

    PackDirectives(Set<Integer> set, PackDirectives packDirectives) {
        this(set, new PackShadowDirectives(packDirectives.getShadowDirectives()));
        this.cloudSetting = packDirectives.cloudSetting;
        this.dhCloudSetting = packDirectives.dhCloudSetting;
        this.separateAo = packDirectives.separateAo;
        this.voxelizeLightBlocks = packDirectives.voxelizeLightBlocks;
        this.separateEntityDraws = packDirectives.separateEntityDraws;
        this.frustumCulling = packDirectives.frustumCulling;
        this.supportsEndFlash = packDirectives.supportsEndFlash;
        this.oldLighting = packDirectives.oldLighting;
        this.concurrentCompute = packDirectives.concurrentCompute;
        this.explicitFlips = packDirectives.explicitFlips;
        this.scaleOverrides = packDirectives.scaleOverrides;
        this.prepareBeforeShadow = packDirectives.prepareBeforeShadow;
        this.fallbackTex = packDirectives.fallbackTex;
        this.particleRenderingSettings = packDirectives.particleRenderingSettings;
        this.textureMap = packDirectives.textureMap;
    }

    public PackDirectives(Set<Integer> set, ShaderProperties shaderProperties) {
        this(set, new PackShadowDirectives(shaderProperties));
        this.cloudSetting = shaderProperties.getCloudSetting();
        this.dhCloudSetting = shaderProperties.getDHCloudSetting();
        this.underwaterOverlay = shaderProperties.getUnderwaterOverlay().orElse(false);
        this.vignette = shaderProperties.getVignette().orElse(false);
        this.sun = shaderProperties.getSun().orElse(true);
        this.weather = shaderProperties.getWeather().orElse(true);
        this.weatherParticles = shaderProperties.getWeatherParticles().orElse(true);
        this.moon = shaderProperties.getMoon().orElse(true);
        this.stars = shaderProperties.getStars().orElse(true);
        this.sky = shaderProperties.getSky().orElse(true);
        this.rainDepth = shaderProperties.getRainDepth().orElse(false);
        this.separateAo = shaderProperties.getSeparateAo().orElse(false);
        this.breaksAnisotropy = shaderProperties.breaksAnisotropy().orElse(false);
        this.voxelizeLightBlocks = shaderProperties.getVoxelizeLightBlocks().orElse(false);
        this.separateEntityDraws = shaderProperties.getSeparateEntityDraws().orElse(false);
        this.skipAllRendering = shaderProperties.skipAllRendering().orElse(false);
        this.frustumCulling = shaderProperties.getFrustumCulling().orElse(true);
        this.supportsEndFlash = shaderProperties.supportsEndFlash().orElse(false);
        this.occlusionCulling = shaderProperties.getOcclusionCulling().orElse(true);
        this.oldLighting = shaderProperties.getOldLighting().orElse(false);
        this.fallbackTex = shaderProperties.getFallbackTex();
        this.supportsColorCorrection = shaderProperties.supportsColorCorrection().orElse(false);
        this.concurrentCompute = shaderProperties.getConcurrentCompute().orElse(false);
        this.oldHandLight = shaderProperties.getOldHandLight().orElse(true);
        this.explicitFlips = shaderProperties.getExplicitFlips();
        this.scaleOverrides = shaderProperties.getTextureScaleOverrides();
        this.prepareBeforeShadow = shaderProperties.getPrepareBeforeShadow().orElse(false);
        this.particleRenderingSettings = shaderProperties.getParticleRenderingSettings();
        this.textureMap = shaderProperties.getCustomTexturePatching();
    }

    private static float clamp(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public boolean vignette() {
        return this.vignette;
    }

    public ParticleRenderingSettings getParticleRenderingSettings() {
        return this.particleRenderingSettings;
    }

    public boolean shouldRenderWeatherParticles() {
        return this.weatherParticles;
    }

    public float getAmbientOcclusionLevel() {
        return this.ambientOcclusionLevel;
    }

    public boolean shouldUseSeparateEntityDraws() {
        return this.separateEntityDraws;
    }

    public CloudSetting getDHCloudSetting() {
        return this.dhCloudSetting;
    }

    public ImmutableMap<Integer, Boolean> getExplicitFlips(String string) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        Object2BooleanMap object2BooleanMap = (Object2BooleanMap)this.explicitFlips.get((Object)string);
        if (object2BooleanMap == null) {
            object2BooleanMap = Object2BooleanMaps.emptyMap();
        }
        object2BooleanMap.forEach((string2, bl) -> {
            int n = PackRenderTargetDirectives.LEGACY_RENDER_TARGETS.indexOf(string2);
            if (n == -1 && string2.startsWith("colortex")) {
                String string3 = string2.substring("colortex".length());
                try {
                    n = Integer.parseInt(string3);
                }
                catch (NumberFormatException numberFormatException) {
                    // empty catch block
                }
            }
            if (n != -1) {
                builder.put((Object)n, (Object)bl);
            } else {
                Iris.logger.warn("Unknown buffer with ID " + string2 + " specified in flip directive for pass " + string);
            }
        });
        return builder.build();
    }

    public boolean isOldLighting() {
        return this.oldLighting;
    }

    public boolean underwaterOverlay() {
        return this.underwaterOverlay;
    }

    public int getFallbackTex() {
        return this.fallbackTex;
    }

    public boolean shouldUseOcclusionCulling() {
        return this.occlusionCulling;
    }

    public boolean skipAllRendering() {
        return this.skipAllRendering;
    }

    public PackRenderTargetDirectives getRenderTargetDirectives() {
        return this.renderTargetDirectives;
    }

    public int getNoiseTextureResolution() {
        return this.noiseTextureResolution;
    }

    public boolean shouldUseFrustumCulling() {
        return this.frustumCulling;
    }

    public PackShadowDirectives getShadowDirectives() {
        return this.shadowDirectives;
    }

    public boolean getConcurrentCompute() {
        return this.concurrentCompute;
    }

    public boolean supportsColorCorrection() {
        return this.supportsColorCorrection;
    }

    public float getCenterDepthHalfLife() {
        return this.centerDepthHalfLife;
    }

    public boolean rainDepth() {
        return this.rainDepth;
    }

    public boolean shouldUseSeparateAo() {
        return this.separateAo;
    }

    public boolean shouldRenderSkyDisc() {
        return this.sky;
    }

    public boolean shouldVoxelizeLightBlocks() {
        return this.voxelizeLightBlocks;
    }

    public boolean shouldRenderWeather() {
        return this.weather;
    }

    public boolean isOldHandLight() {
        return this.oldHandLight;
    }

    public float getDrynessHalfLife() {
        return this.drynessHalfLife;
    }

    public float getWetnessHalfLife() {
        return this.wetnessHalfLife;
    }

    public void acceptDirectivesFrom(DirectiveHolder directiveHolder) {
        this.renderTargetDirectives.acceptDirectives(directiveHolder);
        this.shadowDirectives.acceptDirectives(directiveHolder);
        directiveHolder.acceptConstIntDirective("noiseTextureResolution", n -> {
            this.noiseTextureResolution = n;
        });
        directiveHolder.acceptConstFloatDirective("sunPathRotation", f -> {
            this.sunPathRotation = f;
        });
        directiveHolder.acceptConstFloatDirective("ambientOcclusionLevel", f -> {
            this.ambientOcclusionLevel = PackDirectives.clamp(f, 0.0f, 1.0f);
        });
        directiveHolder.acceptConstFloatDirective("wetnessHalflife", f -> {
            this.wetnessHalfLife = f;
        });
        directiveHolder.acceptConstFloatDirective("drynessHalflife", f -> {
            this.wetnessHalfLife = f;
        });
        directiveHolder.acceptConstFloatDirective("eyeBrightnessHalflife", f -> {
            this.eyeBrightnessHalfLife = f;
        });
        directiveHolder.acceptConstFloatDirective("centerDepthHalflife", f -> {
            this.centerDepthHalfLife = f;
        });
    }

    public float getEyeBrightnessHalfLife() {
        return this.eyeBrightnessHalfLife;
    }

    public boolean isPrepareBeforeShadow() {
        return this.prepareBeforeShadow;
    }

    public Vector2i getTextureScaleOverride(int n, int n2, int n3) {
        String string = "colortex" + n;
        Vector2i vector2i = new Vector2i();
        if (n < PackRenderTargetDirectives.LEGACY_RENDER_TARGETS.size()) {
            String string2 = (String)PackRenderTargetDirectives.LEGACY_RENDER_TARGETS.get(n);
            if (this.scaleOverrides.containsKey((Object)string2)) {
                vector2i.set(((TextureScaleOverride)this.scaleOverrides.get((Object)string2)).getX(n2), ((TextureScaleOverride)this.scaleOverrides.get((Object)string2)).getY(n3));
            } else if (this.scaleOverrides.containsKey((Object)string)) {
                vector2i.set(((TextureScaleOverride)this.scaleOverrides.get((Object)string)).getX(n2), ((TextureScaleOverride)this.scaleOverrides.get((Object)string)).getY(n3));
            } else {
                vector2i.set(n2, n3);
            }
        } else if (this.scaleOverrides.containsKey((Object)string)) {
            vector2i.set(((TextureScaleOverride)this.scaleOverrides.get((Object)string)).getX(n2), ((TextureScaleOverride)this.scaleOverrides.get((Object)string)).getY(n3));
        } else {
            vector2i.set(n2, n3);
        }
        return vector2i;
    }
}

