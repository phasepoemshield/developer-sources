/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.textures.AddressMode
 *  com.mojang.blaze3d.textures.FilterMode
 *  it.unimi.dsi.fastutil.objects.Object2ObjectMap
 *  minecraft.class08188
 *  minecraft.class08193
 *  minecraft.class08918
 *  net.irisshaders.iris.gl.image.GlImage
 *  net.irisshaders.iris.gl.sampler.GlSampler
 *  net.irisshaders.iris.gl.sampler.SamplerHolder
 *  net.irisshaders.iris.gl.state.StateUpdateNotifiers
 *  net.irisshaders.iris.gl.texture.TextureAccess
 *  net.irisshaders.iris.gl.texture.TextureType
 *  net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings
 *  net.irisshaders.iris.shaderpack.properties.PackRenderTargetDirectives
 *  net.irisshaders.iris.shadows.ShadowRenderTargets
 *  net.irisshaders.iris.targets.RenderTarget
 *  net.irisshaders.iris.targets.RenderTargets
 */
package net.irisshaders.iris.samplers;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.AddressMode;
import com.mojang.blaze3d.textures.FilterMode;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import minecraft.class08188;
import minecraft.class08193;
import minecraft.class08918;
import net.irisshaders.iris.gl.image.GlImage;
import net.irisshaders.iris.gl.sampler.GlSampler;
import net.irisshaders.iris.gl.sampler.SamplerHolder;
import net.irisshaders.iris.gl.state.StateUpdateNotifiers;
import net.irisshaders.iris.gl.texture.TextureAccess;
import net.irisshaders.iris.gl.texture.TextureType;
import net.irisshaders.iris.pipeline.IrisRenderingPipeline;
import net.irisshaders.iris.pipeline.WorldRenderingPipeline;
import net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings;
import net.irisshaders.iris.shaderpack.properties.PackRenderTargetDirectives;
import net.irisshaders.iris.shadows.ShadowRenderTargets;
import net.irisshaders.iris.targets.RenderTarget;
import net.irisshaders.iris.targets.RenderTargets;

public class IrisSamplers {
    public static final int ALBEDO_TEXTURE_UNIT = 0;
    public static final int OVERLAY_TEXTURE_UNIT = 1;
    public static final int LIGHTMAP_TEXTURE_UNIT = 2;
    public static final ImmutableSet<Integer> WORLD_RESERVED_TEXTURE_UNITS = ImmutableSet.of((Object)0, (Object)1, (Object)2);
    public static final ImmutableSet<Integer> SODIUM_RESERVED_TEXTURE_UNITS = ImmutableSet.of((Object)0, (Object)2);
    public static final ImmutableSet<Integer> COMPOSITE_RESERVED_TEXTURE_UNITS = ImmutableSet.of((Object)1, (Object)2);
    private static final class08188[] terrain;
    private static final GlSampler[] terrainS;

    private IrisSamplers() {
    }

    public static void initRenderer() {
    }

    public static class08188 getTerrainCache(int n) {
        if (WorldRenderingSettings.INSTANCE.breaksAnisotropy()) {
            n = 1;
        }
        if (terrain[n] == null) {
            IrisSamplers.terrain[n] = RenderSystem.getDevice().createSampler(AddressMode.CLAMP_TO_EDGE, AddressMode.CLAMP_TO_EDGE, FilterMode.NEAREST, FilterMode.NEAREST, n, OptionalDouble.empty());
        }
        return terrain[n];
    }

    public static void addNoiseSampler(SamplerHolder samplerHolder, TextureAccess textureAccess) {
        samplerHolder.addDynamicSampler(textureAccess.getTextureId(), GlSampler.LINEAR_REPEAT, new String[]{"noisetex"});
    }

    public static void addCustomTextures(SamplerHolder samplerHolder, Object2ObjectMap<String, TextureAccess> object2ObjectMap) {
        object2ObjectMap.forEach((string, textureAccess) -> samplerHolder.addDynamicSampler(textureAccess.getType(), textureAccess.getTextureId(), () -> textureAccess.getSampling(), new String[]{string}));
    }

    public static void addCustomImages(SamplerHolder samplerHolder, Set<GlImage> set) {
        set.forEach(glImage -> {
            if (glImage.getSamplerName() != null) {
                samplerHolder.addDynamicSampler(glImage.getTarget(), () -> ((GlImage)glImage).getId(), null, new String[]{glImage.getSamplerName()});
            }
        });
    }

    public static boolean hasShadowSamplers(SamplerHolder samplerHolder) {
        ImmutableList.Builder builder = ImmutableList.builder().add((Object[])new String[]{"shadowtex0", "shadowtex0DH", "shadowtex0HW", "shadowtex1", "shadowtex1HW", "shadowtex1DH", "shadow", "watershadow", "shadowcolor"});
        for (int i = 0; i < 8; ++i) {
            builder.add((Object)("shadowcolor" + i));
            builder.add((Object)("shadowcolorimg" + i));
        }
        for (String string : builder.build()) {
            if (!samplerHolder.hasSampler(string)) continue;
            return true;
        }
        return false;
    }

    public static boolean addShadowSamplers(SamplerHolder samplerHolder, ShadowRenderTargets shadowRenderTargets, ImmutableSet<Integer> immutableSet, boolean bl) {
        boolean bl2;
        boolean bl3 = samplerHolder.hasSampler("watershadow");
        if (bl3) {
            bl2 = true;
            samplerHolder.addDynamicSampler(TextureType.TEXTURE_2D, () -> shadowRenderTargets.getDepthTexture().iris$getGlId(), () -> bl ? null : shadowRenderTargets.getSamplerFor(0), new String[]{"shadowtex0", "watershadow"});
            samplerHolder.addDynamicSampler(TextureType.TEXTURE_2D, () -> shadowRenderTargets.getDepthTextureNoTranslucents().iris$getGlId(), () -> bl ? null : shadowRenderTargets.getSamplerFor(1), new String[]{"shadowtex1", "shadow"});
        } else {
            bl2 = samplerHolder.addDynamicSampler(TextureType.TEXTURE_2D, () -> shadowRenderTargets.getDepthTexture().iris$getGlId(), () -> bl ? null : shadowRenderTargets.getSamplerFor(0), new String[]{"shadowtex0", "shadow"});
            bl2 |= samplerHolder.addDynamicSampler(TextureType.TEXTURE_2D, () -> shadowRenderTargets.getDepthTextureNoTranslucents().iris$getGlId(), () -> bl ? null : shadowRenderTargets.getSamplerFor(1), new String[]{"shadowtex1"});
        }
        if (immutableSet == null) {
            if (samplerHolder.addDynamicSampler(() -> shadowRenderTargets.getColorTextureId(0), GlSampler.LINEAR, new String[]{"shadowcolor"})) {
                shadowRenderTargets.createIfEmpty(0);
            }
            for (int i = 0; i < shadowRenderTargets.getRenderTargetCount(); ++i) {
                int n = i;
                if (!samplerHolder.addDynamicSampler(() -> shadowRenderTargets.getColorTextureId(n), GlSampler.LINEAR, new String[]{"shadowcolor" + i})) continue;
                shadowRenderTargets.createIfEmpty(n);
            }
        } else {
            if (samplerHolder.addDynamicSampler(() -> immutableSet.contains((Object)0) ? shadowRenderTargets.get(0).getAltTexture() : shadowRenderTargets.get(0).getMainTexture(), GlSampler.LINEAR, new String[]{"shadowcolor"})) {
                shadowRenderTargets.createIfEmpty(0);
            }
            for (int i = 0; i < shadowRenderTargets.getRenderTargetCount(); ++i) {
                int n = i;
                if (!samplerHolder.addDynamicSampler(() -> immutableSet.contains((Object)n) ? shadowRenderTargets.get(n).getAltTexture() : shadowRenderTargets.get(n).getMainTexture(), GlSampler.LINEAR, new String[]{"shadowcolor" + i})) continue;
                shadowRenderTargets.createIfEmpty(n);
            }
        }
        if (shadowRenderTargets.isHardwareFiltered(0) && bl) {
            samplerHolder.addDynamicSampler(TextureType.TEXTURE_2D, () -> shadowRenderTargets.getDepthTexture().iris$getGlId(), () -> shadowRenderTargets.getSamplerFor(0), new String[]{"shadowtex0HW"});
        }
        if (shadowRenderTargets.isHardwareFiltered(1) && bl) {
            samplerHolder.addDynamicSampler(TextureType.TEXTURE_2D, () -> shadowRenderTargets.getDepthTextureNoTranslucents().iris$getGlId(), () -> shadowRenderTargets.getSamplerFor(1), new String[]{"shadowtex1HW"});
        }
        return bl2;
    }

    public static boolean hasPBRSamplers(SamplerHolder samplerHolder) {
        return samplerHolder.hasSampler("normals") || samplerHolder.hasSampler("specular");
    }

    public static void addLevelSamplers(SamplerHolder samplerHolder, WorldRenderingPipeline worldRenderingPipeline, class08918 class089182, boolean bl, boolean bl2, boolean bl3) {
        if (bl) {
            samplerHolder.addExternalSampler(0, new String[]{"tex", "texture", "gtexture", "u_MainSampler"});
        } else {
            samplerHolder.addDynamicSampler(() -> class089182.method_68004().iris$getGlId(), GlSampler.NEAREST, new String[]{"tex", "texture", "gtexture", "u_MainSampler", "gcolor", "colortex0"});
        }
        if (bl2) {
            samplerHolder.addExternalSampler(2, new String[]{"lightmap"});
        } else {
            samplerHolder.addDynamicSampler(() -> class089182.method_68004().iris$getGlId(), GlSampler.NEAREST, new String[]{"lightmap"});
        }
        if (bl3) {
            samplerHolder.addExternalSampler(1, new String[]{"iris_overlay"});
        } else {
            samplerHolder.addDynamicSampler(() -> class089182.method_68004().iris$getGlId(), GlSampler.NEAREST, new String[]{"iris_overlay"});
        }
        if (worldRenderingPipeline instanceof IrisRenderingPipeline) {
            IrisRenderingPipeline irisRenderingPipeline = (IrisRenderingPipeline)worldRenderingPipeline;
            samplerHolder.addDynamicSampler(TextureType.TEXTURE_2D, worldRenderingPipeline::getCurrentNormalTexture, StateUpdateNotifiers.normalTextureChangeNotifier, irisRenderingPipeline::getNormalSampler, new String[]{"normals"});
            samplerHolder.addDynamicSampler(TextureType.TEXTURE_2D, worldRenderingPipeline::getCurrentSpecularTexture, StateUpdateNotifiers.specularTextureChangeNotifier, irisRenderingPipeline::getSpecularSampler, new String[]{"specular"});
        }
    }

    public static void addCompositeSamplers(SamplerHolder samplerHolder, RenderTargets renderTargets) {
        samplerHolder.addDynamicSampler(() -> renderTargets.getDepthTexture().iris$getGlId(), GlSampler.NEAREST, new String[]{"gdepthtex", "depthtex0"});
        samplerHolder.addDynamicSampler(() -> renderTargets.getDepthTextureNoTranslucents().iris$getGlId(), GlSampler.NEAREST, new String[]{"depthtex1"});
        samplerHolder.addDynamicSampler(() -> renderTargets.getDepthTextureNoHand().iris$getGlId(), GlSampler.NEAREST, new String[]{"depthtex2"});
    }

    public static void addRenderTargetSamplers(SamplerHolder samplerHolder, Supplier<ImmutableSet<Integer>> supplier, RenderTargets renderTargets, boolean bl, WorldRenderingPipeline worldRenderingPipeline) {
        int n;
        for (int i = n = bl ? 0 : 4; i < renderTargets.getRenderTargetCount(); ++i) {
            int n2 = i;
            IntSupplier intSupplier = () -> {
                ImmutableSet immutableSet = (ImmutableSet)supplier.get();
                RenderTarget renderTarget = renderTargets.getOrCreate(n2);
                if (immutableSet.contains((Object)n2)) {
                    return renderTarget.getAltTexture();
                }
                return renderTarget.getMainTexture();
            };
            Supplier<GlSampler> supplier2 = () -> {
                ImmutableSet immutableSet = (ImmutableSet)supplier.get();
                RenderTarget renderTarget = renderTargets.getOrCreate(n2);
                if (immutableSet.contains((Object)n2)) {
                    return renderTarget.getAltSampler();
                }
                return renderTarget.getMainSampler();
            };
            String string = "colortex" + i;
            if (i < PackRenderTargetDirectives.LEGACY_RENDER_TARGETS.size()) {
                String string2 = (String)PackRenderTargetDirectives.LEGACY_RENDER_TARGETS.get(i);
                if (samplerHolder.hasSampler(string2) || samplerHolder.hasSampler(string)) {
                    renderTargets.createIfUnsure(n2);
                }
                if (i == 0 && bl) {
                    samplerHolder.addDefaultSampler(TextureType.TEXTURE_2D, intSupplier, null, supplier2, new String[]{string, string2});
                    continue;
                }
                samplerHolder.addDynamicSampler(TextureType.TEXTURE_2D, intSupplier, supplier2, new String[]{string, string2});
                continue;
            }
            if (samplerHolder.hasSampler(string)) {
                renderTargets.createIfUnsure(n2);
            }
            samplerHolder.addDynamicSampler(TextureType.TEXTURE_2D, intSupplier, supplier2, new String[]{string});
        }
        samplerHolder.addDynamicSampler(TextureType.TEXTURE_2D, () -> worldRenderingPipeline.getDHCompat().getDepthTex(), null, new String[]{"dhDepthTex", "dhDepthTex0"});
        samplerHolder.addDynamicSampler(TextureType.TEXTURE_2D, () -> worldRenderingPipeline.getDHCompat().getDepthTexNoTranslucent(), null, new String[]{"dhDepthTex1"});
    }

    public static void addWorldDepthSamplers(SamplerHolder samplerHolder, RenderTargets renderTargets) {
        samplerHolder.addDynamicSampler(() -> renderTargets.getDepthTexture().iris$getGlId(), GlSampler.NEAREST, new String[]{"depthtex0"});
        samplerHolder.addDynamicSampler(() -> renderTargets.getDepthTextureNoTranslucents().iris$getGlId(), GlSampler.NEAREST, new String[]{"depthtex1"});
        samplerHolder.addDynamicSampler(() -> renderTargets.getDepthTextureNoHand().iris$getGlId(), GlSampler.NEAREST, new String[]{"depthtex2"});
    }

    public static GlSampler getTerrainCacheIris(int n) {
        if (WorldRenderingSettings.INSTANCE.breaksAnisotropy()) {
            n = 1;
        }
        if (terrainS[n] == null) {
            IrisSamplers.terrainS[n] = new GlSampler(((class08193)IrisSamplers.getTerrainCache(n)).N());
        }
        return terrainS[n];
    }
}

