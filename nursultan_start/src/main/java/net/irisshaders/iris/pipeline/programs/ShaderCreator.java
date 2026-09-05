/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.primitives.Ints
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  com.mojang.blaze3d.vertex.VertexFormat
 *  minecraft.class07835
 *  minecraft.class08394
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.gl.GLDebug
 *  net.irisshaders.iris.gl.IrisRenderSystem
 *  net.irisshaders.iris.gl.blending.AlphaTest
 *  net.irisshaders.iris.gl.blending.BlendModeOverride
 *  net.irisshaders.iris.gl.blending.BufferBlendOverride
 *  net.irisshaders.iris.gl.framebuffer.GlFramebuffer
 *  net.irisshaders.iris.gl.image.ImageHolder
 *  net.irisshaders.iris.gl.sampler.SamplerHolder
 *  net.irisshaders.iris.gl.shader.ShaderCompileException
 *  net.irisshaders.iris.gl.shader.ShaderType
 *  net.irisshaders.iris.gl.state.FogMode
 *  net.irisshaders.iris.gl.state.ShaderAttributeInputs
 *  net.irisshaders.iris.gl.uniform.DynamicUniformHolder
 *  net.irisshaders.iris.gl.uniform.LocationalUniformHolder
 *  net.irisshaders.iris.gl.uniform.UniformHolder
 *  net.irisshaders.iris.shaderpack.programs.ProgramSource
 *  net.irisshaders.iris.shadows.ShadowRenderTargets
 *  net.irisshaders.iris.uniforms.CommonUniforms
 *  net.irisshaders.iris.uniforms.FrameUpdateNotifier
 *  net.irisshaders.iris.uniforms.VanillaUniforms
 *  net.irisshaders.iris.uniforms.builtin.BuiltinReplacementUniforms
 *  net.irisshaders.iris.uniforms.custom.CustomUniforms
 */
package net.irisshaders.iris.pipeline.programs;

import com.google.common.collect.ImmutableSet;
import com.google.common.primitives.Ints;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.function.Supplier;
import minecraft.class07835;
import minecraft.class08394;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.gl.GLDebug;
import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.gl.blending.AlphaTest;
import net.irisshaders.iris.gl.blending.BlendModeOverride;
import net.irisshaders.iris.gl.blending.BufferBlendOverride;
import net.irisshaders.iris.gl.framebuffer.GlFramebuffer;
import net.irisshaders.iris.gl.image.ImageHolder;
import net.irisshaders.iris.gl.sampler.SamplerHolder;
import net.irisshaders.iris.gl.shader.ShaderCompileException;
import net.irisshaders.iris.gl.shader.ShaderType;
import net.irisshaders.iris.gl.state.FogMode;
import net.irisshaders.iris.gl.state.ShaderAttributeInputs;
import net.irisshaders.iris.gl.uniform.DynamicUniformHolder;
import net.irisshaders.iris.gl.uniform.LocationalUniformHolder;
import net.irisshaders.iris.gl.uniform.UniformHolder;
import net.irisshaders.iris.pipeline.IrisRenderingPipeline;
import net.irisshaders.iris.pipeline.WorldRenderingPipeline;
import net.irisshaders.iris.pipeline.fallback.ShaderSynthesizer;
import net.irisshaders.iris.pipeline.programs.ExtendedShader;
import net.irisshaders.iris.pipeline.programs.FallbackShader;
import net.irisshaders.iris.pipeline.programs.PartialShader;
import net.irisshaders.iris.pipeline.programs.ShaderCreator$IrisProgramResourceFactory;
import net.irisshaders.iris.pipeline.programs.ShaderKey;
import net.irisshaders.iris.pipeline.programs.ShaderSupplier;
import net.irisshaders.iris.pipeline.programs.VertexFormatExtension;
import net.irisshaders.iris.pipeline.transform.PatchShaderType;
import net.irisshaders.iris.pipeline.transform.ShaderPrinter;
import net.irisshaders.iris.pipeline.transform.TransformPatcher;
import net.irisshaders.iris.shaderpack.loading.ProgramId;
import net.irisshaders.iris.shaderpack.programs.ProgramSource;
import net.irisshaders.iris.shadows.ShadowRenderTargets;
import net.irisshaders.iris.uniforms.CommonUniforms;
import net.irisshaders.iris.uniforms.FrameUpdateNotifier;
import net.irisshaders.iris.uniforms.VanillaUniforms;
import net.irisshaders.iris.uniforms.builtin.BuiltinReplacementUniforms;
import net.irisshaders.iris.uniforms.custom.CustomUniforms;

public class ShaderCreator {
    public static ShaderSupplier create(WorldRenderingPipeline worldRenderingPipeline, String string, ShaderKey shaderKey, ProgramSource programSource, ProgramId programId, GlFramebuffer glFramebuffer, GlFramebuffer glFramebuffer2, AlphaTest alphaTest, VertexFormat vertexFormat, ShaderAttributeInputs shaderAttributeInputs, FrameUpdateNotifier frameUpdateNotifier, IrisRenderingPipeline irisRenderingPipeline, Supplier<ImmutableSet<Integer>> supplier, FogMode fogMode, boolean bl, boolean bl2, boolean bl3, boolean bl4, CustomUniforms customUniforms) throws IOException {
        AlphaTest alphaTest2 = programSource.getDirectives().getAlphaTestOverride().orElse(alphaTest);
        BlendModeOverride blendModeOverride = programSource.getDirectives().getBlendModeOverride().orElse(programId.getBlendModeOverride());
        Map<PatchShaderType, String> map = TransformPatcher.patchVanilla(string, (String)programSource.getVertexSource().orElseThrow(RuntimeException::new), programSource.getGeometrySource().orElse(null), programSource.getTessControlSource().orElse(null), programSource.getTessEvalSource().orElse(null), (String)programSource.getFragmentSource().orElseThrow(RuntimeException::new), alphaTest2, bl4, shaderKey == ShaderKey.CLOUDS, true, shaderAttributeInputs, worldRenderingPipeline.getTextureMap());
        String string2 = map.get((Object)PatchShaderType.VERTEX);
        String string3 = map.get((Object)PatchShaderType.GEOMETRY);
        String string4 = map.get((Object)PatchShaderType.TESS_CONTROL);
        String string5 = map.get((Object)PatchShaderType.TESS_EVAL);
        String string6 = map.get((Object)PatchShaderType.FRAGMENT);
        String string7 = String.format("    {\n    \"blend\": {\n        \"func\": \"add\",\n        \"srcrgb\": \"srcalpha\",\n        \"dstrgb\": \"1-srcalpha\"\n    },\n    \"vertex\": \"%s\",\n    \"fragment\": \"%s\",\n    \"attributes\": [\n        \"Position\",\n        \"Color\",\n        \"UV0\",\n        \"UV1\",\n        \"UV2\",\n        \"Normal\"\n    ],\n    \"uniforms\": [\n        { \"name\": \"iris_TextureMat\", \"type\": \"matrix4x4\", \"count\": 16, \"values\": [ 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0 ] },\n        { \"name\": \"iris_ModelViewMat\", \"type\": \"matrix4x4\", \"count\": 16, \"values\": [ 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0 ] },\n        { \"name\": \"iris_ModelViewMatInverse\", \"type\": \"matrix4x4\", \"count\": 16, \"values\": [ 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0 ] },\n        { \"name\": \"iris_ProjMat\", \"type\": \"matrix4x4\", \"count\": 16, \"values\": [ 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0 ] },\n        { \"name\": \"iris_ProjMatInverse\", \"type\": \"matrix4x4\", \"count\": 16, \"values\": [ 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0 ] },\n        { \"name\": \"iris_NormalMat\", \"type\": \"matrix3x3\", \"count\": 9, \"values\": [ 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0 ] },\n        { \"name\": \"iris_ModelOffset\", \"type\": \"float\", \"count\": 3, \"values\": [ 0.0, 0.0, 0.0 ] },\n        { \"name\": \"iris_ColorModulator\", \"type\": \"float\", \"count\": 4, \"values\": [ 1.0, 1.0, 1.0, 1.0 ] },\n        { \"name\": \"iris_GlintAlpha\", \"type\": \"float\", \"count\": 1, \"values\": [ 1.0 ] },\n        { \"name\": \"iris_FogStart\", \"type\": \"float\", \"count\": 1, \"values\": [ 0.0 ] },\n        { \"name\": \"iris_FogEnd\", \"type\": \"float\", \"count\": 1, \"values\": [ 1.0 ] },\n        { \"name\": \"iris_FogColor\", \"type\": \"float\", \"count\": 4, \"values\": [ 0.0, 0.0, 0.0, 0.0 ] },\n        {\n                    \"name\": \"iris_OverlayUV\",\n                    \"type\": \"int\",\n                    \"count\": 2,\n                    \"values\": [\n                        0,\n                        0\n                    ]\n                },\n                {\n                    \"name\": \"iris_LightUV\",\n                    \"type\": \"int\",\n                    \"count\": 2,\n                    \"values\": [\n                        0,\n                        0\n                    ]\n                }\n    ]\n}", string, string);
        ShaderPrinter.printProgram(string).addSources(map).addJson(string7).print();
        ShaderCreator$IrisProgramResourceFactory shaderCreator$IrisProgramResourceFactory = new ShaderCreator$IrisProgramResourceFactory(string7, string2, string3, string4, string5, string6);
        ArrayList arrayList = new ArrayList();
        programSource.getDirectives().getBufferBlendOverrides().forEach(bufferBlendInformation -> {
            int n = Ints.indexOf((int[])programSource.getDirectives().getDrawBuffers(), (int)bufferBlendInformation.index());
            if (n > -1) {
                arrayList.add(new BufferBlendOverride(n, bufferBlendInformation.blendMode()));
            }
        });
        PartialShader partialShader = ShaderCreator.link(string, string2, string3, string4, string5, string6, vertexFormat, false);
        return new ShaderSupplier(shaderKey, partialShader, () -> {
            try {
                return new ExtendedShader(partialShader.getFinally(), string, vertexFormat, string4 != null || string5 != null, glFramebuffer, glFramebuffer2, blendModeOverride, alphaTest2, dynamicLocationalUniformHolder -> {
                    CommonUniforms.addDynamicUniforms((DynamicUniformHolder)dynamicLocationalUniformHolder, (FogMode)FogMode.PER_VERTEX);
                    customUniforms.assignTo((LocationalUniformHolder)dynamicLocationalUniformHolder);
                    BuiltinReplacementUniforms.addBuiltinReplacementUniforms((UniformHolder)dynamicLocationalUniformHolder);
                    VanillaUniforms.addVanillaUniforms((DynamicUniformHolder)dynamicLocationalUniformHolder);
                }, (arg_0, arg_1) -> ShaderCreator.lambda$create$2(irisRenderingPipeline, (Supplier)supplier, bl3, shaderAttributeInputs, arg_0, arg_1), bl, irisRenderingPipeline, arrayList, customUniforms);
            }
            catch (IOException iOException) {
                throw new RuntimeException(iOException);
            }
        });
    }

    public static PartialShader link(String string, String string2, String string3, String string4, String string5, String string6, VertexFormat vertexFormat, boolean bl) throws ShaderCompileException {
        int n = GlStateManager.glCreateProgram();
        if (n <= 0) {
            throw new RuntimeException("Could not create shader program (returned program ID " + n + ")");
        }
        int n2 = ShaderCreator.createShader(string, ShaderType.VERTEX, string2);
        int n3 = ShaderCreator.createShader(string, ShaderType.GEOMETRY, string3);
        int n4 = ShaderCreator.createShader(string, ShaderType.TESSELATION_CONTROL, string4);
        int n5 = ShaderCreator.createShader(string, ShaderType.TESSELATION_EVAL, string5);
        int n6 = ShaderCreator.createShader(string, ShaderType.FRAGMENT, string6);
        ShaderCreator.attachIfValid(n, n2);
        ShaderCreator.attachIfValid(n, n3);
        ShaderCreator.attachIfValid(n, n4);
        ShaderCreator.attachIfValid(n, n5);
        ShaderCreator.attachIfValid(n, n6);
        ((VertexFormatExtension)vertexFormat).bindAttributesIris(bl, n);
        GlStateManager.glLinkProgram((int)n);
        return new PartialShader(n, n2, n6, n3, n4, n5);
    }

    private static int createShader(String string, ShaderType shaderType, String string2) {
        int n;
        if (string2 == null) {
            return -1;
        }
        int n2 = GlStateManager.glCreateShader((int)shaderType.id);
        GlStateManager.glShaderSource((int)n2, (String)string2);
        GlStateManager.glCompileShader((int)n2);
        String string3 = IrisRenderSystem.getShaderInfoLog((int)n2);
        if (!string3.isEmpty()) {
            Iris.logger.warn("Shader compilation log for " + string + ": " + string3);
        }
        if ((n = GlStateManager.glGetShaderi((int)n2, (int)35713)) != 1) {
            throw new ShaderCompileException(string, string3);
        }
        return n2;
    }

    public static ShaderSupplier createShadow(WorldRenderingPipeline worldRenderingPipeline, String string, ShaderKey shaderKey, ProgramSource programSource, ProgramId programId, Supplier<ShadowRenderTargets> supplier, AlphaTest alphaTest, VertexFormat vertexFormat, ShaderAttributeInputs shaderAttributeInputs, FrameUpdateNotifier frameUpdateNotifier, IrisRenderingPipeline irisRenderingPipeline, Supplier<ImmutableSet<Integer>> supplier2, FogMode fogMode, boolean bl, boolean bl2, boolean bl3, boolean bl4, CustomUniforms customUniforms) throws IOException {
        AlphaTest alphaTest2 = programSource.getDirectives().getAlphaTestOverride().orElse(alphaTest);
        BlendModeOverride blendModeOverride = programSource.getDirectives().getBlendModeOverride().orElse(programId.getBlendModeOverride());
        Map<PatchShaderType, String> map = TransformPatcher.patchVanilla(string, (String)programSource.getVertexSource().orElseThrow(RuntimeException::new), programSource.getGeometrySource().orElse(null), programSource.getTessControlSource().orElse(null), programSource.getTessEvalSource().orElse(null), (String)programSource.getFragmentSource().orElseThrow(RuntimeException::new), alphaTest2, bl4, shaderKey == ShaderKey.CLOUDS, true, shaderAttributeInputs, worldRenderingPipeline.getTextureMap());
        String string2 = map.get((Object)PatchShaderType.VERTEX);
        String string3 = map.get((Object)PatchShaderType.GEOMETRY);
        String string4 = map.get((Object)PatchShaderType.TESS_CONTROL);
        String string5 = map.get((Object)PatchShaderType.TESS_EVAL);
        String string6 = map.get((Object)PatchShaderType.FRAGMENT);
        ShaderPrinter.printProgram(string).addSources(map).print();
        ShaderCreator$IrisProgramResourceFactory shaderCreator$IrisProgramResourceFactory = new ShaderCreator$IrisProgramResourceFactory("", string2, string3, string4, string5, string6);
        ArrayList arrayList = new ArrayList();
        programSource.getDirectives().getBufferBlendOverrides().forEach(bufferBlendInformation -> {
            int n = Ints.indexOf((int[])programSource.getDirectives().getDrawBuffers(), (int)bufferBlendInformation.index());
            if (n > -1) {
                arrayList.add(new BufferBlendOverride(n, bufferBlendInformation.blendMode()));
            }
        });
        PartialShader partialShader = ShaderCreator.link(string, string2, string3, string4, string5, string6, vertexFormat, false);
        return new ShaderSupplier(shaderKey, partialShader, () -> {
            int[] nArray;
            ShadowRenderTargets shadowRenderTargets = (ShadowRenderTargets)supplier.get();
            ImmutableSet immutableSet = ImmutableSet.of();
            if (programSource.getDirectives().hasUnknownDrawBuffers()) {
                int[] nArray2 = new int[2];
                nArray2[0] = 0;
                nArray = nArray2;
                nArray2[1] = 1;
            } else {
                nArray = programSource.getDirectives().getDrawBuffers();
            }
            GlFramebuffer glFramebuffer = shadowRenderTargets.createShadowFramebuffer(immutableSet, nArray);
            try {
                return new ExtendedShader(partialShader.getFinally(), string, vertexFormat, string4 != null || string5 != null, glFramebuffer, glFramebuffer, blendModeOverride, alphaTest2, dynamicLocationalUniformHolder -> {
                    CommonUniforms.addDynamicUniforms((DynamicUniformHolder)dynamicLocationalUniformHolder, (FogMode)FogMode.PER_VERTEX);
                    customUniforms.assignTo((LocationalUniformHolder)dynamicLocationalUniformHolder);
                    BuiltinReplacementUniforms.addBuiltinReplacementUniforms((UniformHolder)dynamicLocationalUniformHolder);
                    VanillaUniforms.addVanillaUniforms((DynamicUniformHolder)dynamicLocationalUniformHolder);
                }, (arg_0, arg_1) -> ShaderCreator.lambda$createShadow$8(irisRenderingPipeline, (Supplier)supplier2, bl3, shaderAttributeInputs, arg_0, arg_1), bl, irisRenderingPipeline, arrayList, customUniforms);
            }
            catch (IOException iOException) {
                throw new RuntimeException(iOException);
            }
        });
    }

    public static ShaderSupplier createFallback(String string, ShaderKey shaderKey, GlFramebuffer glFramebuffer, GlFramebuffer glFramebuffer2, AlphaTest alphaTest, VertexFormat vertexFormat, BlendModeOverride blendModeOverride, IrisRenderingPipeline irisRenderingPipeline, FogMode fogMode, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5) throws IOException {
        ShaderAttributeInputs shaderAttributeInputs = new ShaderAttributeInputs(vertexFormat, bl5, false, bl2, bl3, false);
        boolean bl6 = vertexFormat == class07835.B;
        String string2 = ShaderSynthesizer.vsh(true, shaderAttributeInputs, fogMode, bl, bl6);
        String string3 = ShaderSynthesizer.fsh(shaderAttributeInputs, fogMode, alphaTest, bl4, bl6);
        ShaderPrinter.printProgram(string).addSource(PatchShaderType.VERTEX, string2).addSource(PatchShaderType.FRAGMENT, string3).print();
        PartialShader partialShader = ShaderCreator.link(string, string2, null, null, null, string3, vertexFormat, true);
        return new ShaderSupplier(shaderKey, partialShader, () -> {
            try {
                GLDebug.nameObject((int)33506, (int)partialShader.program(), (String)(string + "_fallback"));
                return new FallbackShader(partialShader.getFinally(), class08394.e, string, vertexFormat, glFramebuffer, glFramebuffer2, blendModeOverride, alphaTest.reference(), irisRenderingPipeline);
            }
            catch (IOException iOException) {
                throw new RuntimeException(iOException);
            }
        });
    }

    private static void detachIfValid(int n, int n2) {
        if (n2 >= 0) {
            IrisRenderSystem.detachShader((int)n, (int)n2);
            GlStateManager.glDeleteShader((int)n2);
        }
    }

    private static void attachIfValid(int n, int n2) {
        if (n2 >= 0) {
            GlStateManager.glAttachShader((int)n, (int)n2);
        }
    }

    public static ShaderSupplier createFallbackShadow(String string, ShaderKey shaderKey, Supplier<ShadowRenderTargets> supplier, AlphaTest alphaTest, VertexFormat vertexFormat, BlendModeOverride blendModeOverride, IrisRenderingPipeline irisRenderingPipeline, FogMode fogMode, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5) throws IOException {
        ShaderAttributeInputs shaderAttributeInputs = new ShaderAttributeInputs(vertexFormat, bl5, false, bl2, bl3, false);
        boolean bl6 = vertexFormat == class07835.B;
        String string2 = ShaderSynthesizer.vsh(true, shaderAttributeInputs, fogMode, bl, bl6);
        String string3 = ShaderSynthesizer.fsh(shaderAttributeInputs, fogMode, alphaTest, bl4, bl6);
        ShaderPrinter.printProgram(string).addSource(PatchShaderType.VERTEX, string2).addSource(PatchShaderType.FRAGMENT, string3).print();
        PartialShader partialShader = ShaderCreator.link(string, string2, null, null, null, string3, vertexFormat, true);
        return new ShaderSupplier(shaderKey, partialShader, () -> {
            try {
                GlFramebuffer glFramebuffer = ((ShadowRenderTargets)supplier.get()).createShadowFramebuffer(ImmutableSet.of(), new int[]{0});
                return new FallbackShader(partialShader.getFinally(), class08394.e, string, vertexFormat, glFramebuffer, glFramebuffer, blendModeOverride, alphaTest.reference(), irisRenderingPipeline);
            }
            catch (IOException iOException) {
                throw new RuntimeException(iOException);
            }
        });
    }

    private static /* synthetic */ void lambda$createShadow$8(IrisRenderingPipeline irisRenderingPipeline, Supplier supplier, boolean bl, ShaderAttributeInputs shaderAttributeInputs, SamplerHolder samplerHolder, ImageHolder imageHolder) {
        irisRenderingPipeline.addGbufferOrShadowSamplers(samplerHolder, imageHolder, supplier, bl, shaderAttributeInputs.hasTex(), shaderAttributeInputs.hasLight(), shaderAttributeInputs.hasOverlay());
    }

    private static /* synthetic */ void lambda$create$2(IrisRenderingPipeline irisRenderingPipeline, Supplier supplier, boolean bl, ShaderAttributeInputs shaderAttributeInputs, SamplerHolder samplerHolder, ImageHolder imageHolder) {
        irisRenderingPipeline.addGbufferOrShadowSamplers(samplerHolder, imageHolder, supplier, bl, shaderAttributeInputs.hasTex(), shaderAttributeInputs.hasLight(), shaderAttributeInputs.hasOverlay());
    }
}

