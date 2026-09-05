/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  it.unimi.dsi.fastutil.Function
 *  it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap
 *  minecraft.class08394
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.pathways.HandRenderer
 *  net.irisshaders.iris.shadows.ShadowRenderingState
 */
package net.irisshaders.iris.pipeline;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import it.unimi.dsi.fastutil.Function;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import minecraft.class08394;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.pathways.HandRenderer;
import net.irisshaders.iris.pipeline.IrisRenderingPipeline;
import net.irisshaders.iris.pipeline.programs.ShaderKey;
import net.irisshaders.iris.pipeline.programs.ShaderOverrides;
import net.irisshaders.iris.shadows.ShadowRenderingState;

public class IrisPipelines {
    private static final Map<RenderPipeline, Function<IrisRenderingPipeline, ShaderKey>> coreShaderMap = new Object2ObjectArrayMap();
    private static final Map<RenderPipeline, Function<IrisRenderingPipeline, ShaderKey>> coreShaderMapShadow = new Object2ObjectArrayMap();
    private static final Function<IrisRenderingPipeline, ShaderKey> FAKE_FUNCTION = object -> null;

    private static ShaderKey getText(Object object) {
        IrisRenderingPipeline irisRenderingPipeline = (IrisRenderingPipeline)object;
        if (HandRenderer.INSTANCE.isActive()) {
            return HandRenderer.INSTANCE.isRenderingSolid() ? ShaderKey.HAND_TEXT : ShaderKey.HAND_TEXT_TRANSLUCENT;
        }
        if (ShaderOverrides.isBlockEntities(irisRenderingPipeline)) {
            return ShaderKey.TEXT_BE;
        }
        return ShaderKey.TEXT;
    }

    static {
        IrisPipelines.assignToMain(class08394.l, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.TERRAIN_SOLID));
        IrisPipelines.assignToMain(class08394.k, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.TERRAIN_CUTOUT));
        IrisPipelines.assignToMain(class08394.d, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.TERRAIN_SOLID));
        IrisPipelines.assignToMain(class08394.Y, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.TERRAIN_CUTOUT));
        IrisPipelines.assignToMain(class08394.Q, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.TERRAIN_TRANSLUCENT));
        IrisPipelines.assignToMain(class08394.I, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.MOVING_BLOCK));
        IrisPipelines.assignToMain(class08394.O, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.TERRAIN_TRANSLUCENT));
        IrisPipelines.assignToMain(class08394.NQ, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.TEXTURED));
        IrisPipelines.assignToMain(class08394.e, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> IrisPipelines.getCutout(object)));
        IrisPipelines.assignToMain(class08394.H, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> IrisPipelines.getCutout(object)));
        IrisPipelines.assignToMain(class08394.c, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> IrisPipelines.getCutout(object)));
        IrisPipelines.assignToMain(class08394.p, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> IrisPipelines.getCutout(object)));
        IrisPipelines.assignToMain(class08394.D, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> IrisPipelines.getTranslucent(object)));
        IrisPipelines.assignToMain(class08394.X, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> IrisPipelines.getTranslucent(object)));
        IrisPipelines.assignToMain(class08394.x, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> IrisPipelines.getTranslucent(object)));
        IrisPipelines.assignToMain(class08394.F, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> IrisPipelines.getTranslucent(object)));
        IrisPipelines.assignToMain(class08394.S, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> IrisPipelines.getCutout(object)));
        IrisPipelines.assignToMain(class08394.Nt, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.LINES));
        IrisPipelines.assignToMain(class08394.NG, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.LINES));
        IrisPipelines.assignToMain(class08394.Nl, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.LINES));
        IrisPipelines.assignToMain(class08394.NV, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.SKY_BASIC));
        IrisPipelines.assignToMain(class08394.NK, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.SKY_BASIC_COLOR));
        IrisPipelines.assignToMain(class08394.No, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.SKY_BASIC));
        IrisPipelines.assignToMain(class08394.Ne, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.SKY_TEXTURED));
        IrisPipelines.assignToMain(class08394.NO, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.PARTICLES));
        IrisPipelines.assignToMain(class08394.Ng, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.PARTICLES_TRANS));
        IrisPipelines.assignToMain(class08394.NL, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.BASIC));
        IrisPipelines.assignToMain(class08394.Nu, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.GLINT));
        IrisPipelines.assignToMain(class08394.J, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> IrisPipelines.getCutout(object)));
        IrisPipelines.assignToMain(class08394.C, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.ENTITIES_EYES));
        IrisPipelines.assignToMain(class08394.a, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.ENTITIES_EYES_TRANS));
        IrisPipelines.assignToMain(class08394.o, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> IrisPipelines.getCutout(object)));
        IrisPipelines.assignToMain(class08394.q, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> IrisPipelines.getTranslucent(object)));
        IrisPipelines.assignToMain(class08394.A, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> IrisPipelines.getTranslucent(object)));
        IrisPipelines.assignToMain(class08394.K, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> IrisPipelines.getSolid(object)));
        IrisPipelines.assignToMain(class08394.V, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> IrisPipelines.getSolid(object)));
        IrisPipelines.assignToMain(class08394.Nj, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.BLOCK_ENTITY));
        IrisPipelines.assignToMain(class08394.f, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.ENTITIES_CUTOUT));
        IrisPipelines.assignToMain(class08394.NP, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.LIGHTNING));
        IrisPipelines.assignToMain(class08394.Ns, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.LIGHTNING));
        IrisPipelines.assignToMain(class08394.NT, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.LIGHTNING));
        IrisPipelines.assignToMain(class08394.h, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.BEACON));
        IrisPipelines.assignToMain(class08394.r, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.BEACON));
        IrisPipelines.assignToMain(class08394.Nb, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.BLOCK_ENTITY));
        IrisPipelines.assignToMain(class08394.Nq, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.SKY_TEXTURED));
        IrisPipelines.assignToMain(class08394.NI, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.WEATHER));
        IrisPipelines.assignToMain(class08394.NJ, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.WEATHER));
        IrisPipelines.assignToMain(class08394.NR, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> IrisPipelines.getText(object)));
        IrisPipelines.assignToMain(class08394.NU, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> IrisPipelines.getText(object)));
        IrisPipelines.assignToMain(class08394.NE, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> IrisPipelines.getText(object)));
        IrisPipelines.assignToMain(class08394.Nm, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> IrisPipelines.getTextIntensity(object)));
        IrisPipelines.assignToMain(class08394.NB, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.TEXT_BG));
        IrisPipelines.assignToMain(class08394.NW, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.TEXT_BG));
        IrisPipelines.assignToMain(class08394.NZ, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> IrisPipelines.getTextIntensity(object)));
        IrisPipelines.assignToMain(class08394.NN, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.ENTITIES_ALPHA));
        IrisPipelines.assignToMain(class08394.Ni, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.CRUMBLING));
        IrisPipelines.assignToMain(class08394.Ny, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.LEASH));
        IrisPipelines.assignToMain(class08394.Nn, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.CLOUDS));
        IrisPipelines.assignToMain(class08394.Nv, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.CLOUDS));
        IrisPipelines.assignToShadow(class08394.l, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.SHADOW_TERRAIN_CUTOUT));
        IrisPipelines.assignToShadow(class08394.d, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.SHADOW_TERRAIN_CUTOUT));
        IrisPipelines.assignToShadow(class08394.Y, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.SHADOW_TERRAIN_CUTOUT));
        IrisPipelines.assignToShadow(class08394.Q, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.SHADOW_TRANSLUCENT));
        IrisPipelines.assignToShadow(class08394.k, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.SHADOW_TERRAIN_CUTOUT));
        IrisPipelines.assignToShadow(class08394.I, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.SHADOW_TRANSLUCENT));
        IrisPipelines.assignToShadow(class08394.O, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.SHADOW_TRANSLUCENT));
        IrisPipelines.assignToShadow(class08394.e, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.SHADOW_ENTITIES_CUTOUT));
        IrisPipelines.assignToShadow(class08394.J, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.SHADOW_ENTITIES_CUTOUT));
        IrisPipelines.assignToShadow(class08394.D, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.SHADOW_ENTITIES_CUTOUT));
        IrisPipelines.assignToShadow(class08394.o, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.SHADOW_ENTITIES_CUTOUT));
        IrisPipelines.assignToShadow(class08394.K, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.SHADOW_ENTITIES_CUTOUT));
        IrisPipelines.assignToShadow(class08394.Ni, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.SHADOW_TEX));
        IrisPipelines.assignToShadow(class08394.V, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.SHADOW_ENTITIES_CUTOUT));
        IrisPipelines.assignToShadow(class08394.H, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.SHADOW_ENTITIES_CUTOUT));
        IrisPipelines.assignToShadow(class08394.c, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.SHADOW_ENTITIES_CUTOUT));
        IrisPipelines.assignToShadow(class08394.p, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.SHADOW_ENTITIES_CUTOUT));
        IrisPipelines.assignToShadow(class08394.X, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.SHADOW_ENTITIES_CUTOUT));
        IrisPipelines.assignToShadow(class08394.a, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.SHADOW_ENTITIES_CUTOUT));
        IrisPipelines.assignToShadow(class08394.A, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.SHADOW_ENTITIES_CUTOUT));
        IrisPipelines.assignToShadow(class08394.C, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.SHADOW_ENTITIES_CUTOUT));
        IrisPipelines.assignToShadow(class08394.NN, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.SHADOW_ENTITIES_CUTOUT));
        IrisPipelines.assignToShadow(class08394.F, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.SHADOW_ENTITIES_CUTOUT));
        IrisPipelines.assignToShadow(class08394.f, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.SHADOW_ENTITIES_CUTOUT));
        IrisPipelines.assignToShadow(class08394.S, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.SHADOW_ENTITIES_CUTOUT));
        IrisPipelines.assignToShadow(class08394.Nu, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.SHADOW_ENTITIES_CUTOUT));
        IrisPipelines.assignToShadow(class08394.NI, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.SHADOW_PARTICLES));
        IrisPipelines.assignToShadow(class08394.NJ, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.SHADOW_PARTICLES));
        IrisPipelines.assignToShadow(class08394.NO, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.SHADOW_PARTICLES));
        IrisPipelines.assignToShadow(class08394.Ng, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.SHADOW_PARTICLES));
        IrisPipelines.assignToShadow(class08394.Nt, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.SHADOW_LINES));
        IrisPipelines.assignToShadow(class08394.Ny, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.SHADOW_LEASH));
        IrisPipelines.assignToShadow(class08394.Nl, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.SHADOW_LINES));
        IrisPipelines.assignToShadow(class08394.NR, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.SHADOW_TEXT));
        IrisPipelines.assignToShadow(class08394.NU, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.SHADOW_TEXT));
        IrisPipelines.assignToShadow(class08394.NE, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.SHADOW_TEXT));
        IrisPipelines.assignToShadow(class08394.Nm, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.SHADOW_TEXT_INTENSITY));
        IrisPipelines.assignToShadow(class08394.NB, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.SHADOW_TEXT_BG));
        IrisPipelines.assignToShadow(class08394.NW, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.SHADOW_TEXT_BG));
        IrisPipelines.assignToShadow(class08394.NZ, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.SHADOW_TEXT_INTENSITY));
        IrisPipelines.assignToShadow(class08394.NL, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.SHADOW_BASIC));
        IrisPipelines.assignToShadow(class08394.h, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.SHADOW_BEACON_BEAM));
        IrisPipelines.assignToShadow(class08394.r, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.SHADOW_BEACON_BEAM));
        IrisPipelines.assignToShadow(class08394.Nb, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.SHADOW_BLOCK));
        IrisPipelines.assignToShadow(class08394.Nj, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.SHADOW_BLOCK));
        IrisPipelines.assignToShadow(class08394.q, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.SHADOW_ENTITIES_CUTOUT));
        IrisPipelines.assignToShadow(class08394.NP, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> ShaderKey.SHADOW_LIGHTNING));
    }

    public static ShaderKey getPipeline(IrisRenderingPipeline irisRenderingPipeline, RenderPipeline renderPipeline) {
        if (ShadowRenderingState.areShadowsCurrentlyBeingRendered()) {
            return (ShaderKey)((Object)coreShaderMapShadow.getOrDefault(renderPipeline, FAKE_FUNCTION).apply((Object)irisRenderingPipeline));
        }
        return (ShaderKey)((Object)coreShaderMap.getOrDefault(renderPipeline, FAKE_FUNCTION).apply((Object)irisRenderingPipeline));
    }

    public static void assignPipeline(RenderPipeline renderPipeline, ShaderKey shaderKey) {
        if (coreShaderMap.containsKey(renderPipeline)) {
            throw new IllegalStateException("Shader already assigned: " + String.valueOf(renderPipeline.getLocation()) + ": " + String.valueOf((Object)shaderKey));
        }
        coreShaderMap.put(renderPipeline, (Function<IrisRenderingPipeline, ShaderKey>)((Function)object -> shaderKey));
    }

    private static ShaderKey getTextIntensity(Object object) {
        IrisRenderingPipeline irisRenderingPipeline = (IrisRenderingPipeline)object;
        if (ShaderOverrides.isBlockEntities(irisRenderingPipeline)) {
            return ShaderKey.TEXT_INTENSITY_BE;
        }
        return ShaderKey.TEXT_INTENSITY;
    }

    private static void assignToShadow(RenderPipeline renderPipeline, Function<IrisRenderingPipeline, ShaderKey> function) {
        if (coreShaderMapShadow.containsKey(renderPipeline)) {
            Iris.logger.warn("Pair already assigned: " + String.valueOf(renderPipeline));
        }
        coreShaderMapShadow.put(renderPipeline, function);
    }

    public static void copyPipeline(RenderPipeline renderPipeline, RenderPipeline renderPipeline2) {
        if (coreShaderMap.containsKey(renderPipeline)) {
            coreShaderMap.put(renderPipeline2, coreShaderMap.get(renderPipeline));
        }
        if (coreShaderMapShadow.containsKey(renderPipeline)) {
            coreShaderMapShadow.put(renderPipeline2, coreShaderMapShadow.get(renderPipeline));
        }
    }

    private static void assignToMain(RenderPipeline renderPipeline, Function<IrisRenderingPipeline, ShaderKey> function) {
        ShaderKey shaderKey;
        Function<IrisRenderingPipeline, ShaderKey> function2;
        ShaderKey shaderKey2;
        if (coreShaderMap.containsKey(renderPipeline) && (shaderKey2 = (ShaderKey)((Object)(function2 = coreShaderMap.get(renderPipeline)).apply(null))) != (shaderKey = (ShaderKey)((Object)function.apply(null)))) {
            Iris.logger.warn("Pair already assigned: " + String.valueOf(renderPipeline) + " to " + String.valueOf((Object)shaderKey2) + " -> " + String.valueOf((Object)shaderKey));
        }
        coreShaderMap.put(renderPipeline, function);
    }

    private static ShaderKey getTranslucent(Object object) {
        IrisRenderingPipeline irisRenderingPipeline = (IrisRenderingPipeline)object;
        if (HandRenderer.INSTANCE.isActive()) {
            return HandRenderer.INSTANCE.isRenderingSolid() ? ShaderKey.HAND_CUTOUT_DIFFUSE : ShaderKey.HAND_WATER_DIFFUSE;
        }
        if (ShaderOverrides.isBlockEntities(irisRenderingPipeline)) {
            return ShaderKey.BLOCK_ENTITY;
        }
        return ShaderKey.ENTITIES_TRANSLUCENT;
    }

    private static ShaderKey getSolid(Object object) {
        IrisRenderingPipeline irisRenderingPipeline = (IrisRenderingPipeline)object;
        if (HandRenderer.INSTANCE.isActive()) {
            return HandRenderer.INSTANCE.isRenderingSolid() ? ShaderKey.HAND_CUTOUT : ShaderKey.HAND_TRANSLUCENT;
        }
        if (ShaderOverrides.isBlockEntities(irisRenderingPipeline)) {
            return ShaderKey.BLOCK_ENTITY;
        }
        return ShaderKey.ENTITIES_SOLID;
    }

    private static ShaderKey getCutout(Object object) {
        IrisRenderingPipeline irisRenderingPipeline = (IrisRenderingPipeline)object;
        if (HandRenderer.INSTANCE.isActive()) {
            return HandRenderer.INSTANCE.isRenderingSolid() ? ShaderKey.HAND_CUTOUT_DIFFUSE : ShaderKey.HAND_WATER_DIFFUSE;
        }
        if (ShaderOverrides.isBlockEntities(irisRenderingPipeline)) {
            return ShaderKey.BLOCK_ENTITY_DIFFUSE;
        }
        return ShaderKey.ENTITIES_CUTOUT_DIFFUSE;
    }
}

