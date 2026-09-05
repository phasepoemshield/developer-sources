/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.vertex.VertexFormat
 *  minecraft.class07835
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.gl.blending.AlphaTest
 *  net.irisshaders.iris.gl.blending.AlphaTestFunction
 *  net.irisshaders.iris.gl.blending.AlphaTests
 *  net.irisshaders.iris.gl.state.FogMode
 *  net.irisshaders.iris.vertices.IrisVertexFormats
 */
package net.irisshaders.iris.pipeline.programs;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.util.Locale;
import minecraft.class07835;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.gl.blending.AlphaTest;
import net.irisshaders.iris.gl.blending.AlphaTestFunction;
import net.irisshaders.iris.gl.blending.AlphaTests;
import net.irisshaders.iris.gl.state.FogMode;
import net.irisshaders.iris.pipeline.programs.ShaderAccess;
import net.irisshaders.iris.pipeline.programs.ShaderKey$LightingModel;
import net.irisshaders.iris.shaderpack.loading.ProgramId;
import net.irisshaders.iris.vertices.IrisVertexFormats;

public enum ShaderKey {
    BASIC(ProgramId.Basic, AlphaTests.OFF, class07835.i, FogMode.PER_VERTEX, ShaderKey$LightingModel.LIGHTMAP),
    BASIC_COLOR(ProgramId.Basic, AlphaTests.NON_ZERO_ALPHA, class07835.R, FogMode.OFF, ShaderKey$LightingModel.LIGHTMAP),
    TEXTURED(ProgramId.Textured, AlphaTests.NON_ZERO_ALPHA, class07835.Z, FogMode.OFF, ShaderKey$LightingModel.LIGHTMAP),
    TEXTURED_COLOR(ProgramId.Textured, AlphaTests.ONE_TENTH_ALPHA, class07835.z, FogMode.OFF, ShaderKey$LightingModel.LIGHTMAP),
    SPS(ProgramId.SpiderEyes, AlphaTests.OFF, class07835.z, FogMode.PER_FRAGMENT, ShaderKey$LightingModel.FULLBRIGHT),
    SKY_BASIC(ProgramId.SkyBasic, AlphaTests.OFF, class07835.i, FogMode.OFF, ShaderKey$LightingModel.FULLBRIGHT),
    SKY_BASIC_COLOR(ProgramId.SkyBasic, AlphaTests.NON_ZERO_ALPHA, class07835.R, FogMode.OFF, ShaderKey$LightingModel.LIGHTMAP),
    SKY_TEXTURED(ProgramId.SkyTextured, AlphaTests.OFF, class07835.Z, FogMode.OFF, ShaderKey$LightingModel.LIGHTMAP),
    SKY_TEXTURED_COLOR(ProgramId.SkyTextured, AlphaTests.OFF, class07835.z, FogMode.OFF, ShaderKey$LightingModel.LIGHTMAP),
    CLOUDS(ProgramId.Clouds, AlphaTests.ONE_TENTH_ALPHA, class07835.R, FogMode.PER_VERTEX, ShaderKey$LightingModel.LIGHTMAP),
    CLOUDS_SODIUM(ProgramId.Clouds, AlphaTests.ONE_TENTH_ALPHA, IrisVertexFormats.CLOUDS, FogMode.PER_FRAGMENT, ShaderKey$LightingModel.LIGHTMAP),
    TERRAIN_SOLID(ProgramId.TerrainSolid, AlphaTests.OFF, IrisVertexFormats.TERRAIN, FogMode.PER_VERTEX, ShaderKey$LightingModel.LIGHTMAP),
    TERRAIN_CUTOUT(ProgramId.TerrainCutout, AlphaTests.HALF_ALPHA, IrisVertexFormats.TERRAIN, FogMode.PER_VERTEX, ShaderKey$LightingModel.LIGHTMAP),
    TERRAIN_TRANSLUCENT(ProgramId.Water, AlphaTests.NON_ZERO_ALPHA, IrisVertexFormats.TERRAIN, FogMode.PER_VERTEX, ShaderKey$LightingModel.LIGHTMAP),
    MOVING_BLOCK(ProgramId.Block, AlphaTests.ONE_TENTH_ALPHA, IrisVertexFormats.TERRAIN, FogMode.PER_VERTEX, ShaderKey$LightingModel.LIGHTMAP),
    ENTITIES_ALPHA(ProgramId.Entities, AlphaTests.VERTEX_ALPHA, IrisVertexFormats.ENTITY, FogMode.PER_VERTEX, ShaderKey$LightingModel.LIGHTMAP),
    ENTITIES_SOLID(ProgramId.Entities, AlphaTests.OFF, IrisVertexFormats.ENTITY, FogMode.PER_VERTEX, ShaderKey$LightingModel.LIGHTMAP),
    ENTITIES_SOLID_DIFFUSE(ProgramId.Entities, AlphaTests.OFF, IrisVertexFormats.ENTITY, FogMode.PER_VERTEX, ShaderKey$LightingModel.DIFFUSE_LM),
    ENTITIES_SOLID_BRIGHT(ProgramId.Entities, AlphaTests.OFF, IrisVertexFormats.ENTITY, FogMode.PER_VERTEX, ShaderKey$LightingModel.FULLBRIGHT),
    ENTITIES_CUTOUT(ProgramId.Entities, AlphaTests.ONE_TENTH_ALPHA, IrisVertexFormats.ENTITY, FogMode.PER_VERTEX, ShaderKey$LightingModel.LIGHTMAP),
    ENTITIES_CUTOUT_DIFFUSE(ProgramId.Entities, AlphaTests.ONE_TENTH_ALPHA, IrisVertexFormats.ENTITY, FogMode.PER_VERTEX, ShaderKey$LightingModel.DIFFUSE_LM),
    ENTITIES_TRANSLUCENT(ProgramId.EntitiesTrans, AlphaTests.ONE_TENTH_ALPHA, IrisVertexFormats.ENTITY, FogMode.PER_VERTEX, ShaderKey$LightingModel.DIFFUSE_LM),
    ENTITIES_EYES(ProgramId.SpiderEyes, AlphaTests.NON_ZERO_ALPHA, IrisVertexFormats.ENTITY, FogMode.PER_VERTEX, ShaderKey$LightingModel.FULLBRIGHT),
    ENTITIES_EYES_TRANS(ProgramId.SpiderEyes, AlphaTests.ONE_TENTH_ALPHA, IrisVertexFormats.ENTITY, FogMode.PER_VERTEX, ShaderKey$LightingModel.FULLBRIGHT),
    HAND_CUTOUT(ProgramId.Hand, AlphaTests.ONE_TENTH_ALPHA, IrisVertexFormats.ENTITY, FogMode.PER_VERTEX, ShaderKey$LightingModel.LIGHTMAP),
    HAND_CUTOUT_BRIGHT(ProgramId.Hand, AlphaTests.ONE_TENTH_ALPHA, IrisVertexFormats.ENTITY, FogMode.PER_VERTEX, ShaderKey$LightingModel.FULLBRIGHT),
    HAND_CUTOUT_DIFFUSE(ProgramId.Hand, AlphaTests.ONE_TENTH_ALPHA, IrisVertexFormats.ENTITY, FogMode.PER_VERTEX, ShaderKey$LightingModel.DIFFUSE_LM),
    HAND_TEXT(ProgramId.Hand, AlphaTests.NON_ZERO_ALPHA, IrisVertexFormats.GLYPH, FogMode.PER_VERTEX, ShaderKey$LightingModel.LIGHTMAP),
    HAND_TEXT_TRANSLUCENT(ProgramId.HandWater, AlphaTests.NON_ZERO_ALPHA, IrisVertexFormats.GLYPH, FogMode.PER_VERTEX, ShaderKey$LightingModel.LIGHTMAP),
    HAND_TEXT_INTENSITY(ProgramId.Hand, AlphaTests.NON_ZERO_ALPHA, IrisVertexFormats.GLYPH, FogMode.PER_VERTEX, ShaderKey$LightingModel.LIGHTMAP),
    HAND_TRANSLUCENT(ProgramId.HandWater, AlphaTests.ONE_TENTH_ALPHA, IrisVertexFormats.ENTITY, FogMode.PER_VERTEX, ShaderKey$LightingModel.LIGHTMAP),
    HAND_WATER_BRIGHT(ProgramId.HandWater, AlphaTests.ONE_TENTH_ALPHA, IrisVertexFormats.ENTITY, FogMode.PER_VERTEX, ShaderKey$LightingModel.FULLBRIGHT),
    HAND_WATER_DIFFUSE(ProgramId.HandWater, AlphaTests.ONE_TENTH_ALPHA, IrisVertexFormats.ENTITY, FogMode.PER_VERTEX, ShaderKey$LightingModel.DIFFUSE_LM),
    LIGHTNING(ProgramId.Lightning, AlphaTests.OFF, class07835.R, FogMode.PER_VERTEX, ShaderKey$LightingModel.FULLBRIGHT),
    LEASH(ProgramId.Basic, AlphaTests.OFF, class07835.B, FogMode.PER_VERTEX, ShaderKey$LightingModel.LIGHTMAP),
    TEXT_BG(ProgramId.EntitiesTrans, AlphaTests.ONE_TENTH_ALPHA, class07835.B, FogMode.PER_VERTEX, ShaderKey$LightingModel.LIGHTMAP),
    PARTICLES(ProgramId.Particles, AlphaTests.ONE_TENTH_ALPHA, class07835.u, FogMode.PER_VERTEX, ShaderKey$LightingModel.LIGHTMAP),
    PARTICLES_TRANS(ProgramId.ParticlesTrans, AlphaTests.ONE_TENTH_ALPHA, class07835.u, FogMode.PER_VERTEX, ShaderKey$LightingModel.LIGHTMAP),
    WEATHER(ProgramId.Weather, AlphaTests.ONE_TENTH_ALPHA, class07835.u, FogMode.PER_VERTEX, ShaderKey$LightingModel.LIGHTMAP),
    CRUMBLING(ProgramId.DamagedBlock, AlphaTests.ONE_TENTH_ALPHA, IrisVertexFormats.TERRAIN, FogMode.OFF, ShaderKey$LightingModel.FULLBRIGHT),
    TEXT(ProgramId.EntitiesTrans, AlphaTests.ONE_TENTH_ALPHA, IrisVertexFormats.GLYPH, FogMode.PER_VERTEX, ShaderKey$LightingModel.LIGHTMAP),
    TEXT_INTENSITY(ProgramId.EntitiesTrans, AlphaTests.ONE_TENTH_ALPHA, IrisVertexFormats.GLYPH, FogMode.PER_VERTEX, ShaderKey$LightingModel.LIGHTMAP),
    TEXT_BE(ProgramId.BlockTrans, AlphaTests.ONE_TENTH_ALPHA, IrisVertexFormats.GLYPH, FogMode.PER_VERTEX, ShaderKey$LightingModel.LIGHTMAP),
    TEXT_INTENSITY_BE(ProgramId.BlockTrans, AlphaTests.ONE_TENTH_ALPHA, IrisVertexFormats.GLYPH, FogMode.PER_VERTEX, ShaderKey$LightingModel.LIGHTMAP),
    BLOCK_ENTITY(ProgramId.Block, AlphaTests.ONE_TENTH_ALPHA, IrisVertexFormats.ENTITY, FogMode.PER_VERTEX, ShaderKey$LightingModel.LIGHTMAP),
    BLOCK_ENTITY_BRIGHT(ProgramId.Block, AlphaTests.ONE_TENTH_ALPHA, IrisVertexFormats.ENTITY, FogMode.PER_VERTEX, ShaderKey$LightingModel.FULLBRIGHT),
    BLOCK_ENTITY_DIFFUSE(ProgramId.Block, AlphaTests.ONE_TENTH_ALPHA, IrisVertexFormats.ENTITY, FogMode.PER_VERTEX, ShaderKey$LightingModel.DIFFUSE_LM),
    BE_TRANSLUCENT(ProgramId.BlockTrans, AlphaTests.ONE_TENTH_ALPHA, IrisVertexFormats.ENTITY, FogMode.PER_VERTEX, ShaderKey$LightingModel.DIFFUSE_LM),
    BEACON(ProgramId.BeaconBeam, AlphaTests.OFF, class07835.y, FogMode.PER_FRAGMENT, ShaderKey$LightingModel.FULLBRIGHT),
    GLINT(ProgramId.ArmorGlint, AlphaTests.NON_ZERO_ALPHA, class07835.Z, FogMode.PER_VERTEX, ShaderKey$LightingModel.LIGHTMAP),
    LINES(ProgramId.Line, AlphaTests.OFF, class07835.P, FogMode.PER_VERTEX, ShaderKey$LightingModel.LIGHTMAP),
    IE_COMPAT(ProgramId.Block, AlphaTests.ONE_TENTH_ALPHA, ShaderAccess.IE_FORMAT, FogMode.PER_VERTEX, ShaderKey$LightingModel.LIGHTMAP),
    MEKANISM_FLAME(ProgramId.SpiderEyes, AlphaTests.ONE_TENTH_ALPHA, class07835.z, FogMode.PER_VERTEX, ShaderKey$LightingModel.LIGHTMAP),
    SHADOW_TERRAIN_CUTOUT(ProgramId.ShadowCutout, AlphaTests.ONE_TENTH_ALPHA, IrisVertexFormats.TERRAIN, FogMode.OFF, ShaderKey$LightingModel.LIGHTMAP),
    SHADOW_TRANSLUCENT(ProgramId.ShadowWater, AlphaTests.ONE_TENTH_ALPHA, IrisVertexFormats.TERRAIN, FogMode.OFF, ShaderKey$LightingModel.LIGHTMAP),
    SHADOW_ENTITIES_CUTOUT(ProgramId.ShadowEntities, AlphaTests.ONE_TENTH_ALPHA, IrisVertexFormats.ENTITY, FogMode.OFF, ShaderKey$LightingModel.LIGHTMAP),
    SHADOW_BLOCK(ProgramId.ShadowBlock, AlphaTests.ONE_TENTH_ALPHA, IrisVertexFormats.ENTITY, FogMode.OFF, ShaderKey$LightingModel.LIGHTMAP),
    SHADOW_BEACON_BEAM(ProgramId.ShadowEntities, AlphaTests.OFF, class07835.y, FogMode.OFF, ShaderKey$LightingModel.FULLBRIGHT),
    SHADOW_BASIC(ProgramId.Shadow, AlphaTests.OFF, class07835.i, FogMode.OFF, ShaderKey$LightingModel.LIGHTMAP),
    SHADOW_BASIC_COLOR(ProgramId.Shadow, AlphaTests.NON_ZERO_ALPHA, class07835.R, FogMode.OFF, ShaderKey$LightingModel.LIGHTMAP),
    SHADOW_TEX(ProgramId.Shadow, AlphaTests.NON_ZERO_ALPHA, class07835.Z, FogMode.OFF, ShaderKey$LightingModel.LIGHTMAP),
    SHADOW_TEX_COLOR(ProgramId.Shadow, AlphaTests.ONE_TENTH_ALPHA, class07835.z, FogMode.OFF, ShaderKey$LightingModel.LIGHTMAP),
    SHADOW_CLOUDS(ProgramId.Shadow, AlphaTests.ONE_TENTH_ALPHA, class07835.W, FogMode.OFF, ShaderKey$LightingModel.LIGHTMAP),
    SHADOW_LINES(ProgramId.Shadow, AlphaTests.OFF, class07835.P, FogMode.OFF, ShaderKey$LightingModel.LIGHTMAP),
    SHADOW_LEASH(ProgramId.Shadow, AlphaTests.OFF, class07835.B, FogMode.OFF, ShaderKey$LightingModel.LIGHTMAP),
    SHADOW_LIGHTNING(ProgramId.ShadowLightning, AlphaTests.OFF, class07835.R, FogMode.OFF, ShaderKey$LightingModel.FULLBRIGHT),
    SHADOW_PARTICLES(ProgramId.Shadow, AlphaTests.ONE_TENTH_ALPHA, class07835.u, FogMode.OFF, ShaderKey$LightingModel.LIGHTMAP),
    SHADOW_TEXT(ProgramId.ShadowEntities, AlphaTests.NON_ZERO_ALPHA, IrisVertexFormats.GLYPH, FogMode.OFF, ShaderKey$LightingModel.LIGHTMAP),
    SHADOW_TEXT_BG(ProgramId.ShadowEntities, AlphaTests.NON_ZERO_ALPHA, class07835.B, FogMode.OFF, ShaderKey$LightingModel.LIGHTMAP),
    SHADOW_TEXT_INTENSITY(ProgramId.ShadowEntities, AlphaTests.NON_ZERO_ALPHA, IrisVertexFormats.GLYPH, FogMode.OFF, ShaderKey$LightingModel.LIGHTMAP),
    IE_COMPAT_SHADOW(ProgramId.ShadowEntities, AlphaTests.ONE_TENTH_ALPHA, ShaderAccess.IE_FORMAT, FogMode.OFF, ShaderKey$LightingModel.LIGHTMAP),
    MEKANISM_FLAME_SHADOW(ProgramId.ShadowEntities, AlphaTests.ONE_TENTH_ALPHA, class07835.z, FogMode.OFF, ShaderKey$LightingModel.LIGHTMAP);

    private final ProgramId program;
    private final AlphaTest alphaTest;
    private final VertexFormat vertexFormat;
    private final FogMode fogMode;
    private final ShaderKey$LightingModel lightingModel;

    public boolean isText() {
        return this.name().contains("TEXT");
    }

    private ShaderKey(ProgramId programId, AlphaTest alphaTest, VertexFormat vertexFormat, FogMode fogMode, ShaderKey$LightingModel shaderKey$LightingModel) {
        this.program = programId;
        this.alphaTest = alphaTest;
        this.vertexFormat = vertexFormat;
        this.fogMode = fogMode;
        this.lightingModel = shaderKey$LightingModel;
    }

    public String getName() {
        return this.toString().toLowerCase(Locale.ROOT);
    }

    public VertexFormat getVertexFormat() {
        return this.vertexFormat;
    }

    public static ShaderKey findBestMatch(RenderPipeline renderPipeline, ProgramId programId) {
        boolean bl = false;
        if (renderPipeline.getShaderDefines().u().containsKey("ALPHA_CUTOUT")) {
            bl = true;
        }
        if (bl) {
            for (ShaderKey shaderKey : ShaderKey.values()) {
                if (programId != shaderKey.getProgram() || renderPipeline.getVertexFormat() != shaderKey.vertexFormat || !(shaderKey.alphaTest.reference() > 0.01f) || shaderKey.alphaTest.function() == AlphaTestFunction.NEVER) continue;
                Iris.logger.warn("Found perfect program match for " + String.valueOf(renderPipeline.getLocation()) + ": " + String.valueOf((Object)shaderKey));
                return shaderKey;
            }
        }
        for (ShaderKey shaderKey : ShaderKey.values()) {
            if (programId != shaderKey.getProgram() || renderPipeline.getVertexFormat() != shaderKey.vertexFormat) continue;
            Iris.logger.warn("Found okay program match for " + String.valueOf(renderPipeline.getLocation()) + ": " + String.valueOf((Object)shaderKey));
            return shaderKey;
        }
        if (bl) {
            for (ShaderKey shaderKey : ShaderKey.values()) {
                if (programId != shaderKey.getProgram() || !(shaderKey.alphaTest.reference() > 0.01f) || shaderKey.alphaTest.function() == AlphaTestFunction.NEVER) continue;
                Iris.logger.warn("Found fine program match for " + String.valueOf(renderPipeline.getLocation()) + ": " + String.valueOf((Object)shaderKey));
                return shaderKey;
            }
        }
        for (ShaderKey shaderKey : ShaderKey.values()) {
            if (programId != shaderKey.getProgram()) continue;
            Iris.logger.warn("Found *decent* program match for " + String.valueOf(renderPipeline.getLocation()) + ": " + String.valueOf((Object)shaderKey));
            return shaderKey;
        }
        Iris.logger.warn("Somehow couldn't find any match for " + String.valueOf(renderPipeline.getLocation()));
        return null;
    }

    public boolean isIntensity() {
        return this == TEXT_INTENSITY || this == TEXT_INTENSITY_BE || this == SHADOW_TEXT_INTENSITY;
    }

    public boolean hasDiffuseLighting() {
        return this.lightingModel == ShaderKey$LightingModel.DIFFUSE || this.lightingModel == ShaderKey$LightingModel.DIFFUSE_LM;
    }

    public AlphaTest getAlphaTest() {
        return this.alphaTest;
    }

    public ProgramId getProgram() {
        return this.program;
    }

    public boolean shouldIgnoreLightmap() {
        return this.lightingModel == ShaderKey$LightingModel.FULLBRIGHT || this.lightingModel == ShaderKey$LightingModel.DIFFUSE;
    }

    public boolean isShadow() {
        return this.getProgram() == ProgramId.Shadow || this.getProgram() == ProgramId.ShadowCutout || this.getProgram() == ProgramId.ShadowWater || this.getProgram() == ProgramId.ShadowSolid || this.getProgram() == ProgramId.ShadowEntities || this.getProgram() == ProgramId.ShadowLightning || this.getProgram() == ProgramId.ShadowBlock;
    }

    public FogMode getFogMode() {
        return this.fogMode;
    }

    public boolean isGlint() {
        return this == GLINT;
    }
}

