/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.primitives.Ints
 *  it.unimi.dsi.fastutil.objects.Object2ObjectMap
 *  minecraft.class01894
 *  net.caffeinemc.mods.sodium.client.gl.GlObject
 *  net.caffeinemc.mods.sodium.client.gl.shader.GlProgram
 *  net.caffeinemc.mods.sodium.client.gl.shader.GlProgram$Builder
 *  net.caffeinemc.mods.sodium.client.gl.shader.GlShader
 *  net.caffeinemc.mods.sodium.client.gl.shader.ShaderParser$ParsedShader
 *  net.caffeinemc.mods.sodium.client.gl.shader.ShaderType
 *  net.caffeinemc.mods.sodium.client.render.chunk.shader.ChunkShaderInterface
 *  net.caffeinemc.mods.sodium.client.render.chunk.shader.ShaderBindingContext
 *  net.caffeinemc.mods.sodium.client.render.chunk.terrain.DefaultTerrainRenderPasses
 *  net.caffeinemc.mods.sodium.client.render.chunk.terrain.TerrainRenderPass
 *  net.irisshaders.iris.gl.GLDebug
 *  net.irisshaders.iris.gl.IrisRenderSystem
 *  net.irisshaders.iris.gl.blending.AlphaTest
 *  net.irisshaders.iris.gl.blending.AlphaTests
 *  net.irisshaders.iris.gl.blending.BufferBlendOverride
 *  net.irisshaders.iris.gl.framebuffer.GlFramebuffer
 *  net.irisshaders.iris.gl.texture.TextureType
 *  net.irisshaders.iris.helpers.Tri
 *  net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings
 *  net.irisshaders.iris.shaderpack.programs.ProgramFallbackResolver
 *  net.irisshaders.iris.shaderpack.programs.ProgramSet
 *  net.irisshaders.iris.shaderpack.programs.ProgramSource
 *  net.irisshaders.iris.shaderpack.texture.TextureStage
 *  net.irisshaders.iris.shadows.ShadowRenderTargets
 *  net.irisshaders.iris.shadows.ShadowRenderingState
 *  net.irisshaders.iris.targets.RenderTargets
 *  net.irisshaders.iris.uniforms.custom.CustomUniforms
 *  net.irisshaders.iris.vertices.sodium.terrain.FormatAnalyzer
 */
package net.irisshaders.iris.pipeline.programs;

import com.google.common.collect.ImmutableSet;
import com.google.common.primitives.Ints;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Supplier;
import minecraft.class01894;
import net.caffeinemc.mods.sodium.client.gl.GlObject;
import net.caffeinemc.mods.sodium.client.gl.shader.GlProgram;
import net.caffeinemc.mods.sodium.client.gl.shader.GlShader;
import net.caffeinemc.mods.sodium.client.gl.shader.ShaderParser;
import net.caffeinemc.mods.sodium.client.gl.shader.ShaderType;
import net.caffeinemc.mods.sodium.client.render.chunk.shader.ChunkShaderInterface;
import net.caffeinemc.mods.sodium.client.render.chunk.shader.ShaderBindingContext;
import net.caffeinemc.mods.sodium.client.render.chunk.terrain.DefaultTerrainRenderPasses;
import net.caffeinemc.mods.sodium.client.render.chunk.terrain.TerrainRenderPass;
import net.irisshaders.iris.gl.GLDebug;
import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.gl.blending.AlphaTest;
import net.irisshaders.iris.gl.blending.AlphaTests;
import net.irisshaders.iris.gl.blending.BufferBlendOverride;
import net.irisshaders.iris.gl.framebuffer.GlFramebuffer;
import net.irisshaders.iris.gl.texture.TextureType;
import net.irisshaders.iris.helpers.Tri;
import net.irisshaders.iris.pipeline.IrisRenderingPipeline;
import net.irisshaders.iris.pipeline.programs.SodiumPrograms$Pass;
import net.irisshaders.iris.pipeline.programs.SodiumShader;
import net.irisshaders.iris.pipeline.transform.PatchShaderType;
import net.irisshaders.iris.pipeline.transform.ShaderPrinter;
import net.irisshaders.iris.pipeline.transform.TransformPatcher;
import net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings;
import net.irisshaders.iris.shaderpack.programs.ProgramFallbackResolver;
import net.irisshaders.iris.shaderpack.programs.ProgramSet;
import net.irisshaders.iris.shaderpack.programs.ProgramSource;
import net.irisshaders.iris.shaderpack.texture.TextureStage;
import net.irisshaders.iris.shadows.ShadowRenderTargets;
import net.irisshaders.iris.shadows.ShadowRenderingState;
import net.irisshaders.iris.targets.RenderTargets;
import net.irisshaders.iris.uniforms.custom.CustomUniforms;
import net.irisshaders.iris.vertices.sodium.terrain.FormatAnalyzer;

public class SodiumPrograms {
    private final EnumMap<SodiumPrograms$Pass, GlFramebuffer> framebuffers = new EnumMap(SodiumPrograms$Pass.class);
    private final EnumMap<SodiumPrograms$Pass, GlProgram<ChunkShaderInterface>> shaders = new EnumMap(SodiumPrograms$Pass.class);
    private boolean hasBlockId;
    private boolean hasMidUv;
    private boolean hasNormal;
    private boolean hasMidBlock;

    public SodiumPrograms(IrisRenderingPipeline irisRenderingPipeline, ProgramSet programSet, ProgramFallbackResolver programFallbackResolver, RenderTargets renderTargets, Supplier<ShadowRenderTargets> supplier, CustomUniforms customUniforms) {
        for (SodiumPrograms$Pass sodiumPrograms$Pass : SodiumPrograms$Pass.values()) {
            ProgramSource programSource = programFallbackResolver.resolveNullable(sodiumPrograms$Pass.getOriginalId());
            Supplier<ImmutableSet<Integer>> supplier2 = this.getFlipState(irisRenderingPipeline, sodiumPrograms$Pass, sodiumPrograms$Pass == SodiumPrograms$Pass.SHADOW || sodiumPrograms$Pass == SodiumPrograms$Pass.SHADOW_CUTOUT);
            GlFramebuffer glFramebuffer = this.createFramebuffer(sodiumPrograms$Pass, programSource, supplier, renderTargets, supplier2);
            this.framebuffers.put(sodiumPrograms$Pass, glFramebuffer);
            if (programSource == null) continue;
            AlphaTest alphaTest = this.getAlphaTest(sodiumPrograms$Pass, programSource);
            Map<PatchShaderType, String> map = this.transformShaders(programSource, alphaTest, programSet);
            GlProgram<ChunkShaderInterface> glProgram = this.createShader(irisRenderingPipeline, sodiumPrograms$Pass, programSource, alphaTest, customUniforms, supplier2, this.createGlShaders(sodiumPrograms$Pass.name().toLowerCase(Locale.ROOT), map));
            this.shaders.put(sodiumPrograms$Pass, glProgram);
        }
        WorldRenderingSettings.INSTANCE.setVertexFormat(FormatAnalyzer.createFormat((boolean)this.hasBlockId, (boolean)this.hasNormal, (boolean)this.hasMidUv, (boolean)this.hasMidBlock));
    }

    private Map<PatchShaderType, String> transformShaders(ProgramSource programSource, AlphaTest alphaTest, ProgramSet programSet) {
        Map<PatchShaderType, String> map = TransformPatcher.patchSodium(programSource.getName(), programSource.getVertexSource().orElse(null), programSource.getGeometrySource().orElse(null), programSource.getTessControlSource().orElse(null), programSource.getTessEvalSource().orElse(null), programSource.getFragmentSource().orElse(null), alphaTest, (Object2ObjectMap<Tri<String, TextureType, TextureStage>, String>)programSet.getPackDirectives().getTextureMap());
        ShaderPrinter.printProgram("sodium_" + programSource.getName()).addSources(map).print();
        return map;
    }

    private Supplier<ImmutableSet<Integer>> getFlipState(IrisRenderingPipeline irisRenderingPipeline, SodiumPrograms$Pass sodiumPrograms$Pass, boolean bl) {
        if (bl) {
            return irisRenderingPipeline::getFlippedBeforeShadow;
        }
        return () -> sodiumPrograms$Pass == SodiumPrograms$Pass.TRANSLUCENT ? irisRenderingPipeline.getFlippedAfterTranslucent() : irisRenderingPipeline.getFlippedAfterPrepare();
    }

    private Map<PatchShaderType, GlShader> createGlShaders(String string, Map<PatchShaderType, String> map) {
        EnumMap<PatchShaderType, GlShader> enumMap = new EnumMap<PatchShaderType, GlShader>(PatchShaderType.class);
        for (Map.Entry<PatchShaderType, String> entry : map.entrySet()) {
            if (entry.getValue() == null) continue;
            enumMap.put(entry.getKey(), new GlShader(ShaderType.fromGlShaderType((int)entry.getKey().glShaderType.id), class01894.N((String)"iris", (String)("sodium-shader-" + string)), new ShaderParser.ParsedShader(entry.getValue(), new String[0])));
        }
        return enumMap;
    }

    private GlProgram<ChunkShaderInterface> buildProgram(GlProgram.Builder builder, IrisRenderingPipeline irisRenderingPipeline, SodiumPrograms$Pass sodiumPrograms$Pass, ProgramSource programSource, AlphaTest alphaTest, CustomUniforms customUniforms, Supplier<ImmutableSet<Integer>> supplier, boolean bl) {
        return builder.bindAttribute("a_Position", 0).bindAttribute("a_Color", 1).bindAttribute("a_TexCoord", 2).bindAttribute("a_LightAndData", 3).bindAttribute("mc_Entity", 11).bindAttribute("mc_midTexCoord", 12).bindAttribute("at_tangent", 13).bindAttribute("iris_Normal", 10).bindAttribute("at_midBlock", 14).link(shaderBindingContext -> {
            int n = ((GlObject)shaderBindingContext).handle();
            GLDebug.nameObject((int)33506, (int)n, (String)("sodium-terrain-" + sodiumPrograms$Pass.toString().toLowerCase(Locale.ROOT)));
            if (!this.hasNormal) {
                boolean bl2 = this.hasNormal = IrisRenderSystem.getAttribLocation((int)n, (String)"iris_Normal") != -1;
            }
            if (!this.hasMidBlock) {
                boolean bl3 = this.hasMidBlock = IrisRenderSystem.getAttribLocation((int)n, (String)"at_midBlock") != -1;
            }
            if (!this.hasBlockId) {
                boolean bl4 = this.hasBlockId = IrisRenderSystem.getAttribLocation((int)n, (String)"mc_Entity") != -1;
            }
            if (!this.hasMidUv) {
                this.hasMidUv = IrisRenderSystem.getAttribLocation((int)n, (String)"mc_midTexCoord") != -1;
            }
            return new SodiumShader(irisRenderingPipeline, sodiumPrograms$Pass, (ShaderBindingContext)shaderBindingContext, n, programSource.getDirectives().getBlendModeOverride().orElse(null), this.createBufferBlendOverrides(programSource), customUniforms, supplier, alphaTest.reference(), bl);
        });
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private GlProgram<ChunkShaderInterface> createShader(IrisRenderingPipeline irisRenderingPipeline, SodiumPrograms$Pass sodiumPrograms$Pass, ProgramSource programSource, AlphaTest alphaTest, CustomUniforms customUniforms, Supplier<ImmutableSet<Integer>> supplier, Map<PatchShaderType, GlShader> map) {
        GlProgram.Builder builder = GlProgram.builder((class01894)class01894.N((String)"sodium", (String)("chunk_shader_for_" + sodiumPrograms$Pass.name().toLowerCase(Locale.ROOT))));
        for (GlShader glProgram : map.values()) {
            builder.attachShader(glProgram);
        }
        boolean bl = programSource.getTessEvalSource().isPresent();
        try {
            GlProgram<ChunkShaderInterface> glProgram = this.buildProgram(builder, irisRenderingPipeline, sodiumPrograms$Pass, programSource, alphaTest, customUniforms, supplier, bl);
            return glProgram;
        }
        finally {
            map.values().forEach(GlShader::delete);
        }
    }

    public GlFramebuffer getFramebuffer(TerrainRenderPass terrainRenderPass) {
        SodiumPrograms$Pass sodiumPrograms$Pass = this.mapTerrainRenderPass(terrainRenderPass);
        return this.framebuffers.get((Object)sodiumPrograms$Pass);
    }

    private GlFramebuffer createFramebuffer(SodiumPrograms$Pass sodiumPrograms$Pass, ProgramSource programSource, Supplier<ShadowRenderTargets> supplier, RenderTargets renderTargets, Supplier<ImmutableSet<Integer>> supplier2) {
        int[] nArray;
        if (sodiumPrograms$Pass == SodiumPrograms$Pass.SHADOW || sodiumPrograms$Pass == SodiumPrograms$Pass.SHADOW_CUTOUT || sodiumPrograms$Pass == SodiumPrograms$Pass.SHADOW_TRANS) {
            int[] nArray2;
            ImmutableSet immutableSet = ImmutableSet.of();
            if (programSource == null) {
                int[] nArray3 = new int[2];
                nArray3[0] = 0;
                nArray2 = nArray3;
                nArray3[1] = 1;
            } else if (programSource.getDirectives().hasUnknownDrawBuffers()) {
                int[] nArray4 = new int[2];
                nArray4[0] = 0;
                nArray2 = nArray4;
                nArray4[1] = 1;
            } else {
                nArray2 = programSource.getDirectives().getDrawBuffers();
            }
            return supplier.get().createShadowFramebuffer(immutableSet, nArray2);
        }
        if (programSource == null) {
            int[] nArray5 = new int[2];
            nArray5[0] = 0;
            nArray = nArray5;
            nArray5[1] = 1;
        } else if (programSource.getDirectives().hasUnknownDrawBuffers()) {
            int[] nArray6 = new int[1];
            nArray = nArray6;
            nArray6[0] = 0;
        } else {
            nArray = programSource.getDirectives().getDrawBuffers();
        }
        return renderTargets.createGbufferFramebuffer(supplier2.get(), nArray);
    }

    private AlphaTest getAlphaTest(SodiumPrograms$Pass sodiumPrograms$Pass, ProgramSource programSource) {
        return programSource.getDirectives().getAlphaTestOverride().orElse(sodiumPrograms$Pass == SodiumPrograms$Pass.TRANSLUCENT ? AlphaTests.NON_ZERO_ALPHA : (sodiumPrograms$Pass == SodiumPrograms$Pass.TERRAIN_CUTOUT || sodiumPrograms$Pass == SodiumPrograms$Pass.SHADOW_CUTOUT ? AlphaTests.HALF_ALPHA : AlphaTest.ALWAYS));
    }

    public GlProgram<ChunkShaderInterface> getProgram(TerrainRenderPass terrainRenderPass) {
        SodiumPrograms$Pass sodiumPrograms$Pass = this.mapTerrainRenderPass(terrainRenderPass);
        return this.shaders.get((Object)sodiumPrograms$Pass);
    }

    private List<BufferBlendOverride> createBufferBlendOverrides(ProgramSource programSource) {
        ArrayList<BufferBlendOverride> arrayList = new ArrayList<BufferBlendOverride>();
        programSource.getDirectives().getBufferBlendOverrides().forEach(bufferBlendInformation -> {
            int n = Ints.indexOf((int[])programSource.getDirectives().getDrawBuffers(), (int)bufferBlendInformation.index());
            if (n > -1) {
                arrayList.add(new BufferBlendOverride(n, bufferBlendInformation.blendMode()));
            }
        });
        return arrayList;
    }

    private SodiumPrograms$Pass mapTerrainRenderPass(TerrainRenderPass terrainRenderPass) {
        if (terrainRenderPass == DefaultTerrainRenderPasses.SOLID) {
            return ShadowRenderingState.areShadowsCurrentlyBeingRendered() ? SodiumPrograms$Pass.SHADOW : SodiumPrograms$Pass.TERRAIN;
        }
        if (terrainRenderPass == DefaultTerrainRenderPasses.CUTOUT) {
            return ShadowRenderingState.areShadowsCurrentlyBeingRendered() ? SodiumPrograms$Pass.SHADOW_CUTOUT : SodiumPrograms$Pass.TERRAIN_CUTOUT;
        }
        if (terrainRenderPass == DefaultTerrainRenderPasses.TRANSLUCENT) {
            return ShadowRenderingState.areShadowsCurrentlyBeingRendered() ? SodiumPrograms$Pass.SHADOW_TRANS : SodiumPrograms$Pass.TRANSLUCENT;
        }
        throw new IllegalArgumentException("Unknown pass: " + String.valueOf(terrainRenderPass));
    }
}

