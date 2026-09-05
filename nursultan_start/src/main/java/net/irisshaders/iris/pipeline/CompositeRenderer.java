/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.ImmutableSet$Builder
 *  com.google.common.collect.UnmodifiableIterator
 *  com.mojang.blaze3d.buffers.GpuBuffer
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.systems.RenderPass
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5595
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5596
 *  it.unimi.dsi.fastutil.objects.Object2ObjectMap
 *  minecraft.class06202
 *  minecraft.class08066
 *  net.irisshaders.iris.features.FeatureFlags
 *  net.irisshaders.iris.gl.GLDebug
 *  net.irisshaders.iris.gl.IrisRenderSystem
 *  net.irisshaders.iris.gl.blending.BlendModeOverride
 *  net.irisshaders.iris.gl.buffer.ShaderStorageBufferHolder
 *  net.irisshaders.iris.gl.framebuffer.GlFramebuffer
 *  net.irisshaders.iris.gl.image.GlImage
 *  net.irisshaders.iris.gl.image.ImageHolder
 *  net.irisshaders.iris.gl.program.ComputeProgram
 *  net.irisshaders.iris.gl.program.Program
 *  net.irisshaders.iris.gl.program.ProgramBuilder
 *  net.irisshaders.iris.gl.program.ProgramSamplers
 *  net.irisshaders.iris.gl.program.ProgramSamplers$CustomTextureSamplerInterceptor
 *  net.irisshaders.iris.gl.program.ProgramUniforms
 *  net.irisshaders.iris.gl.sampler.GlSampler
 *  net.irisshaders.iris.gl.sampler.SamplerHolder
 *  net.irisshaders.iris.gl.sampler.SamplerLimits
 *  net.irisshaders.iris.gl.shader.ShaderCompileException
 *  net.irisshaders.iris.gl.state.FogMode
 *  net.irisshaders.iris.gl.texture.TextureAccess
 *  net.irisshaders.iris.gl.uniform.DynamicUniformHolder
 *  net.irisshaders.iris.gl.uniform.LocationalUniformHolder
 *  net.irisshaders.iris.mixin.GlStateManagerAccessor
 *  net.irisshaders.iris.mixinterface.CustomPass
 *  net.irisshaders.iris.pathways.CenterDepthSampler
 *  net.irisshaders.iris.pathways.FullScreenQuadRenderer
 *  net.irisshaders.iris.shaderpack.programs.ComputeSource
 *  net.irisshaders.iris.shaderpack.programs.ProgramSource
 *  net.irisshaders.iris.shaderpack.properties.PackDirectives
 *  net.irisshaders.iris.shaderpack.properties.PackRenderTargetDirectives
 *  net.irisshaders.iris.shaderpack.properties.ProgramDirectives
 *  net.irisshaders.iris.shaderpack.texture.TextureStage
 *  net.irisshaders.iris.shadows.ShadowRenderTargets
 *  net.irisshaders.iris.targets.BufferFlipper
 *  net.irisshaders.iris.targets.RenderTarget
 *  net.irisshaders.iris.targets.RenderTargets
 *  net.irisshaders.iris.uniforms.CommonUniforms
 *  net.irisshaders.iris.uniforms.FrameUpdateNotifier
 *  net.irisshaders.iris.uniforms.custom.CustomUniforms
 *  net.irisshaders.iris.vertices.ImmediateState
 */
package net.irisshaders.iris.pipeline;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.VertexFormat;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.OptionalInt;
import java.util.Set;
import java.util.function.Supplier;
import minecraft.class06202;
import minecraft.class08066;
import net.irisshaders.iris.features.FeatureFlags;
import net.irisshaders.iris.gl.GLDebug;
import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.gl.blending.BlendModeOverride;
import net.irisshaders.iris.gl.buffer.ShaderStorageBufferHolder;
import net.irisshaders.iris.gl.framebuffer.GlFramebuffer;
import net.irisshaders.iris.gl.image.GlImage;
import net.irisshaders.iris.gl.image.ImageHolder;
import net.irisshaders.iris.gl.program.ComputeProgram;
import net.irisshaders.iris.gl.program.Program;
import net.irisshaders.iris.gl.program.ProgramBuilder;
import net.irisshaders.iris.gl.program.ProgramSamplers;
import net.irisshaders.iris.gl.program.ProgramUniforms;
import net.irisshaders.iris.gl.sampler.GlSampler;
import net.irisshaders.iris.gl.sampler.SamplerHolder;
import net.irisshaders.iris.gl.sampler.SamplerLimits;
import net.irisshaders.iris.gl.shader.ShaderCompileException;
import net.irisshaders.iris.gl.state.FogMode;
import net.irisshaders.iris.gl.texture.TextureAccess;
import net.irisshaders.iris.gl.uniform.DynamicUniformHolder;
import net.irisshaders.iris.gl.uniform.LocationalUniformHolder;
import net.irisshaders.iris.mixin.GlStateManagerAccessor;
import net.irisshaders.iris.mixinterface.CustomPass;
import net.irisshaders.iris.pathways.CenterDepthSampler;
import net.irisshaders.iris.pathways.FullScreenQuadRenderer;
import net.irisshaders.iris.pipeline.CompositePass;
import net.irisshaders.iris.pipeline.CompositeRenderer$ComputeOnlyPass;
import net.irisshaders.iris.pipeline.CompositeRenderer$Pass;
import net.irisshaders.iris.pipeline.WorldRenderingPipeline;
import net.irisshaders.iris.pipeline.transform.PatchShaderType;
import net.irisshaders.iris.pipeline.transform.ShaderPrinter;
import net.irisshaders.iris.pipeline.transform.TransformPatcher;
import net.irisshaders.iris.samplers.IrisImages;
import net.irisshaders.iris.samplers.IrisSamplers;
import net.irisshaders.iris.shaderpack.FilledIndirectPointer;
import net.irisshaders.iris.shaderpack.programs.ComputeSource;
import net.irisshaders.iris.shaderpack.programs.ProgramSource;
import net.irisshaders.iris.shaderpack.properties.PackDirectives;
import net.irisshaders.iris.shaderpack.properties.PackRenderTargetDirectives;
import net.irisshaders.iris.shaderpack.properties.ProgramDirectives;
import net.irisshaders.iris.shaderpack.texture.TextureStage;
import net.irisshaders.iris.shadows.ShadowRenderTargets;
import net.irisshaders.iris.targets.BufferFlipper;
import net.irisshaders.iris.targets.RenderTarget;
import net.irisshaders.iris.targets.RenderTargets;
import net.irisshaders.iris.uniforms.CommonUniforms;
import net.irisshaders.iris.uniforms.FrameUpdateNotifier;
import net.irisshaders.iris.uniforms.custom.CustomUniforms;
import net.irisshaders.iris.vertices.ImmediateState;

public class CompositeRenderer {
    public static final RenderPipeline COMPOSITE_PIPELINE;
    private final RenderTargets renderTargets;
    private final ImmutableList<CompositeRenderer$Pass> passes;
    private final TextureAccess noiseTexture;
    private final CenterDepthSampler centerDepthSampler;
    private final Object2ObjectMap<String, TextureAccess> customTextureIds;
    private final ImmutableSet<Integer> flippedAtLeastOnceFinal;
    private final CustomUniforms customUniforms;
    private final Object2ObjectMap<String, TextureAccess> irisCustomTextures;
    private final Set<GlImage> customImages;
    private final TextureStage textureStage;
    private final WorldRenderingPipeline pipeline;
    private final CompositePass compositePass;

    public CompositeRenderer(WorldRenderingPipeline worldRenderingPipeline, CompositePass compositePass, PackDirectives packDirectives, ProgramSource[] programSourceArray, ComputeSource[][] computeSourceArray, RenderTargets renderTargets, ShaderStorageBufferHolder shaderStorageBufferHolder, TextureAccess textureAccess, FrameUpdateNotifier frameUpdateNotifier, CenterDepthSampler centerDepthSampler, BufferFlipper bufferFlipper, Supplier<ShadowRenderTargets> supplier, TextureStage textureStage, Object2ObjectMap<String, TextureAccess> object2ObjectMap, Object2ObjectMap<String, TextureAccess> object2ObjectMap2, Set<GlImage> set, ImmutableMap<Integer, Boolean> immutableMap, CustomUniforms customUniforms) {
        this.pipeline = worldRenderingPipeline;
        this.compositePass = compositePass;
        this.noiseTexture = textureAccess;
        this.centerDepthSampler = centerDepthSampler;
        this.renderTargets = renderTargets;
        this.customTextureIds = object2ObjectMap;
        this.customUniforms = customUniforms;
        this.irisCustomTextures = object2ObjectMap2;
        this.customImages = set;
        this.textureStage = textureStage;
        PackRenderTargetDirectives packRenderTargetDirectives = packDirectives.getRenderTargetDirectives();
        Map map = packRenderTargetDirectives.getRenderTargetSettings();
        ImmutableList.Builder builder = ImmutableList.builder();
        ImmutableSet.Builder builder2 = new ImmutableSet.Builder();
        immutableMap.forEach((n, bl) -> {
            if (bl.booleanValue()) {
                bufferFlipper.flip(n.intValue());
            }
        });
        for (int i = 0; i < programSourceArray.length; ++i) {
            CompositeRenderer$Pass compositeRenderer$Pass;
            ProgramSource programSource = programSourceArray[i];
            ImmutableSet immutableSet = bufferFlipper.snapshot();
            ImmutableSet immutableSet2 = builder2.build();
            if (programSource == null || !programSource.isValid()) {
                if (computeSourceArray.length == 0 || computeSourceArray[i] == null || computeSourceArray[i].length <= 0) continue;
                compositeRenderer$Pass = new CompositeRenderer$ComputeOnlyPass();
                ((CompositeRenderer$ComputeOnlyPass)compositeRenderer$Pass).name = computeSourceArray[i].length > 0 ? Arrays.stream(computeSourceArray[i]).filter(Objects::nonNull).findFirst().map(ComputeSource::getName).orElse("unknown") : "unknown";
                ((CompositeRenderer$ComputeOnlyPass)compositeRenderer$Pass).computes = this.createComputes(computeSourceArray[i], (ImmutableSet<Integer>)immutableSet, (ImmutableSet<Integer>)immutableSet2, supplier, shaderStorageBufferHolder);
                builder.add((Object)compositeRenderer$Pass);
                continue;
            }
            compositeRenderer$Pass = new CompositeRenderer$Pass();
            ProgramDirectives programDirectives = programSource.getDirectives();
            compositeRenderer$Pass.name = programSource.getName();
            compositeRenderer$Pass.program = this.createProgram(programSource, (ImmutableSet<Integer>)immutableSet, (ImmutableSet<Integer>)immutableSet2, supplier);
            compositeRenderer$Pass.blendModeOverride = programSource.getDirectives().getBlendModeOverride().orElse(null);
            compositeRenderer$Pass.computes = computeSourceArray.length != 0 ? this.createComputes(computeSourceArray[i], (ImmutableSet<Integer>)immutableSet, (ImmutableSet<Integer>)immutableSet2, supplier, shaderStorageBufferHolder) : new ComputeProgram[0];
            int[] nArray = programDirectives.getDrawBuffers();
            int n2 = 0;
            int n3 = 0;
            ImmutableMap immutableMap2 = programDirectives.getExplicitFlips();
            GlFramebuffer glFramebuffer = renderTargets.createColorFramebuffer(immutableSet, nArray);
            for (int n4 : nArray) {
                RenderTarget renderTarget = renderTargets.get(n4);
                if (n2 > 0 && n2 != renderTarget.getWidth() || n3 > 0 && n3 != renderTarget.getHeight()) {
                    throw new IllegalStateException("Pass sizes must match for drawbuffers " + Arrays.toString(nArray) + "\nOriginal width: " + n2 + " New width: " + renderTarget.getWidth() + " Original height: " + n3 + " New height: " + renderTarget.getHeight());
                }
                n2 = renderTarget.getWidth();
                n3 = renderTarget.getHeight();
                if (immutableMap2.get((Object)n4) == Boolean.FALSE) continue;
                bufferFlipper.flip(n4);
                builder2.add((Object)n4);
            }
            immutableMap2.forEach((n, bl) -> {
                if (bl.booleanValue()) {
                    bufferFlipper.flip(n.intValue());
                    builder2.add(n);
                }
            });
            compositeRenderer$Pass.drawBuffers = programDirectives.getDrawBuffers();
            compositeRenderer$Pass.viewWidth = n2;
            compositeRenderer$Pass.viewHeight = n3;
            compositeRenderer$Pass.stageReadsFromAlt = immutableSet;
            compositeRenderer$Pass.framebuffer = glFramebuffer;
            compositeRenderer$Pass.viewportScale = programDirectives.getViewportScale();
            compositeRenderer$Pass.mipmappedBuffers = programDirectives.getMipmappedBuffers();
            compositeRenderer$Pass.flippedAtLeastOnce = immutableSet2;
            builder.add((Object)compositeRenderer$Pass);
        }
        this.passes = builder.build();
        this.flippedAtLeastOnceFinal = builder2.build();
        GlStateManager._glBindFramebuffer((int)36008, (int)0);
    }

    public void destroy() {
        for (CompositeRenderer$Pass compositeRenderer$Pass : this.passes) {
            compositeRenderer$Pass.destroy();
        }
    }

    private Program createProgram(ProgramSource programSource, ImmutableSet<Integer> immutableSet, ImmutableSet<Integer> immutableSet2, Supplier<ShadowRenderTargets> supplier) {
        ProgramBuilder programBuilder;
        Map<PatchShaderType, String> map = TransformPatcher.patchComposite(programSource.getName(), (String)programSource.getVertexSource().orElseThrow(NullPointerException::new), programSource.getGeometrySource().orElse(null), (String)programSource.getFragmentSource().orElseThrow(NullPointerException::new), this.textureStage, this.pipeline.getTextureMap());
        String string = map.get((Object)PatchShaderType.VERTEX);
        String string2 = map.get((Object)PatchShaderType.GEOMETRY);
        String string3 = map.get((Object)PatchShaderType.FRAGMENT);
        ShaderPrinter.printProgram(programSource.getName()).addSources(map).print();
        Objects.requireNonNull(immutableSet);
        try {
            programBuilder = ProgramBuilder.begin((String)programSource.getName(), (String)string, (String)string2, (String)string3, IrisSamplers.COMPOSITE_RESERVED_TEXTURE_UNITS);
        }
        catch (ShaderCompileException shaderCompileException) {
            throw shaderCompileException;
        }
        catch (RuntimeException runtimeException) {
            throw new RuntimeException("Shader compilation failed for " + programSource.getName() + "!", runtimeException);
        }
        CommonUniforms.addDynamicUniforms((DynamicUniformHolder)programBuilder, (FogMode)FogMode.OFF);
        this.customUniforms.assignTo((LocationalUniformHolder)programBuilder);
        ProgramSamplers.CustomTextureSamplerInterceptor customTextureSamplerInterceptor = ProgramSamplers.customTextureSamplerInterceptor((SamplerHolder)programBuilder, this.customTextureIds, immutableSet2);
        IrisSamplers.addRenderTargetSamplers((SamplerHolder)customTextureSamplerInterceptor, () -> immutableSet, this.renderTargets, true, this.pipeline);
        IrisSamplers.addCustomTextures((SamplerHolder)programBuilder, this.irisCustomTextures);
        IrisSamplers.addCustomImages((SamplerHolder)customTextureSamplerInterceptor, this.customImages);
        IrisImages.addRenderTargetImages((ImageHolder)programBuilder, () -> immutableSet, this.renderTargets);
        IrisImages.addCustomImages((ImageHolder)programBuilder, this.customImages);
        IrisSamplers.addNoiseSampler((SamplerHolder)customTextureSamplerInterceptor, this.noiseTexture);
        IrisSamplers.addCompositeSamplers((SamplerHolder)customTextureSamplerInterceptor, this.renderTargets);
        if (IrisSamplers.hasShadowSamplers((SamplerHolder)customTextureSamplerInterceptor)) {
            IrisSamplers.addShadowSamplers((SamplerHolder)customTextureSamplerInterceptor, supplier.get(), null, this.pipeline.hasFeature(FeatureFlags.SEPARATE_HARDWARE_SAMPLERS));
            IrisImages.addShadowColorImages((ImageHolder)programBuilder, supplier.get(), null);
        }
        this.centerDepthSampler.setUsage(programBuilder.addDynamicSampler(() -> ((CenterDepthSampler)this.centerDepthSampler).getCenterDepthTexture(), GlSampler.NEAREST, new String[]{"iris_centerDepthSmooth"}));
        Program program = programBuilder.build();
        this.customUniforms.mapholderToPass((LocationalUniformHolder)programBuilder, (Object)program);
        return program;
    }

    private boolean hasComputes(ComputeSource[][] computeSourceArray) {
        boolean bl = false;
        block0: for (int i = 0; i < computeSourceArray.length; ++i) {
            if (computeSourceArray[i].length <= 0) continue;
            for (int j = 0; j < computeSourceArray[i].length; ++j) {
                if (computeSourceArray[i][j] == null) continue;
                bl = true;
                continue block0;
            }
        }
        return bl;
    }

    private static void setupMipmapping(RenderTarget renderTarget, boolean bl) {
        if (renderTarget == null) {
            return;
        }
        int n = bl ? renderTarget.getAltTexture() : renderTarget.getMainTexture();
        IrisRenderSystem.generateMipmaps((int)n, (int)3553);
        renderTarget.turnOnMips(bl);
    }

    private ComputeProgram[] createComputes(ComputeSource[] computeSourceArray, ImmutableSet<Integer> immutableSet, ImmutableSet<Integer> immutableSet2, Supplier<ShadowRenderTargets> supplier, ShaderStorageBufferHolder shaderStorageBufferHolder) {
        ComputeProgram[] computeProgramArray = new ComputeProgram[computeSourceArray.length];
        for (int i = 0; i < computeProgramArray.length; ++i) {
            ProgramBuilder programBuilder;
            String string;
            ComputeSource computeSource = computeSourceArray[i];
            if (computeSource == null || computeSource.getSource().isEmpty()) continue;
            Objects.requireNonNull(immutableSet);
            try {
                string = TransformPatcher.patchCompute(computeSource.getName(), computeSource.getSource().orElse(null), this.textureStage, this.pipeline.getTextureMap());
                ShaderPrinter.printProgram(computeSource.getName()).addSource(PatchShaderType.COMPUTE, string).print();
                programBuilder = ProgramBuilder.beginCompute((String)computeSource.getName(), (String)string, IrisSamplers.COMPOSITE_RESERVED_TEXTURE_UNITS);
            }
            catch (ShaderCompileException shaderCompileException) {
                throw shaderCompileException;
            }
            catch (RuntimeException runtimeException) {
                throw new RuntimeException("Shader compilation failed for compute " + computeSource.getName() + "!", runtimeException);
            }
            string = ProgramSamplers.customTextureSamplerInterceptor((SamplerHolder)programBuilder, this.customTextureIds, immutableSet2);
            CommonUniforms.addDynamicUniforms((DynamicUniformHolder)programBuilder, (FogMode)FogMode.OFF);
            this.customUniforms.assignTo((LocationalUniformHolder)programBuilder);
            IrisSamplers.addRenderTargetSamplers((SamplerHolder)string, () -> immutableSet, this.renderTargets, true, this.pipeline);
            IrisSamplers.addCustomTextures((SamplerHolder)programBuilder, this.irisCustomTextures);
            IrisSamplers.addCustomImages((SamplerHolder)string, this.customImages);
            IrisImages.addRenderTargetImages((ImageHolder)programBuilder, () -> immutableSet, this.renderTargets);
            IrisImages.addCustomImages((ImageHolder)programBuilder, this.customImages);
            IrisSamplers.addNoiseSampler((SamplerHolder)string, this.noiseTexture);
            IrisSamplers.addCompositeSamplers((SamplerHolder)string, this.renderTargets);
            if (IrisSamplers.hasShadowSamplers((SamplerHolder)string)) {
                IrisSamplers.addShadowSamplers((SamplerHolder)string, supplier.get(), null, this.pipeline.hasFeature(FeatureFlags.SEPARATE_HARDWARE_SAMPLERS));
                IrisImages.addShadowColorImages((ImageHolder)programBuilder, supplier.get(), null);
            }
            this.centerDepthSampler.setUsage(programBuilder.addDynamicSampler(() -> ((CenterDepthSampler)this.centerDepthSampler).getCenterDepthTexture(), GlSampler.NEAREST, new String[]{"iris_centerDepthSmooth"}));
            computeProgramArray[i] = programBuilder.buildCompute();
            this.customUniforms.mapholderToPass((LocationalUniformHolder)programBuilder, (Object)computeProgramArray[i]);
            computeProgramArray[i].setWorkGroupInfo(computeSource.getWorkGroupRelative(), computeSource.getWorkGroups(), FilledIndirectPointer.basedOff(shaderStorageBufferHolder, computeSource.getIndirectPointer()));
        }
        return computeProgramArray;
    }

    public void recalculateSizes() {
        for (CompositeRenderer$Pass compositeRenderer$Pass : this.passes) {
            if (compositeRenderer$Pass instanceof CompositeRenderer$ComputeOnlyPass) continue;
            int n = 0;
            int n2 = 0;
            for (int n3 : compositeRenderer$Pass.drawBuffers) {
                RenderTarget renderTarget = this.renderTargets.get(n3);
                if (n > 0 && n != renderTarget.getWidth() || n2 > 0 && n2 != renderTarget.getHeight()) {
                    throw new IllegalStateException("Pass widths must match");
                }
                n = renderTarget.getWidth();
                n2 = renderTarget.getHeight();
            }
            this.renderTargets.destroyFramebuffer(compositeRenderer$Pass.framebuffer);
            compositeRenderer$Pass.framebuffer = this.renderTargets.createColorFramebuffer(compositeRenderer$Pass.stageReadsFromAlt, compositeRenderer$Pass.drawBuffers);
            compositeRenderer$Pass.viewWidth = n;
            compositeRenderer$Pass.viewHeight = n2;
        }
    }

    public ImmutableSet<Integer> getFlippedAtLeastOnceFinal() {
        return this.flippedAtLeastOnceFinal;
    }

    public void renderAll() {
        ImmediateState.temporarilyIgnorePass = true;
        GLDebug.pushGroup((int)(20 + this.compositePass.ordinal()), (String)this.compositePass.name().toLowerCase(Locale.ROOT));
        class08066 class080662 = class06202.Nq().e();
        GpuBuffer gpuBuffer = RenderSystem.getSequentialBuffer((VertexFormat.class_5596)VertexFormat.class_5596.field_27382).method_68274(6);
        VertexFormat.class_5595 class_55952 = RenderSystem.getSequentialBuffer((VertexFormat.class_5596)VertexFormat.class_5596.field_27382).method_31924();
        try (RenderPass renderPass = RenderSystem.getDevice().createCommandEncoder().createRenderPass(() -> "Composites", class06202.Nq().e().u(), OptionalInt.empty());){
            renderPass.setPipeline(COMPOSITE_PIPELINE);
            renderPass.setIndexBuffer(gpuBuffer, class_55952);
            renderPass.setVertexBuffer(0, FullScreenQuadRenderer.INSTANCE.getQuad());
            int n = this.passes.size();
            for (int i = 0; i < n; ++i) {
                CompositeRenderer$Pass compositeRenderer$Pass = (CompositeRenderer$Pass)this.passes.get(i);
                GLDebug.pushGroup((int)(20 * this.compositePass.ordinal() + i), (String)compositeRenderer$Pass.name);
                boolean bl = false;
                for (ComputeProgram computeProgram : compositeRenderer$Pass.computes) {
                    if (computeProgram == null) continue;
                    bl = true;
                    computeProgram.use();
                    this.customUniforms.push((Object)computeProgram);
                    computeProgram.dispatch((float)class080662.N, (float)class080662.y);
                }
                if (bl) {
                    IrisRenderSystem.memoryBarrier((int)8232);
                }
                Program.unbind();
                if (compositeRenderer$Pass instanceof CompositeRenderer$ComputeOnlyPass) {
                    GLDebug.popGroup();
                    continue;
                }
                if (!compositeRenderer$Pass.mipmappedBuffers.isEmpty()) {
                    GlStateManager._activeTexture((int)33984);
                    UnmodifiableIterator unmodifiableIterator = compositeRenderer$Pass.mipmappedBuffers.iterator();
                    while (unmodifiableIterator.hasNext()) {
                        int n2 = (Integer)unmodifiableIterator.next();
                        CompositeRenderer.setupMipmapping(this.renderTargets.get(n2), compositeRenderer$Pass.stageReadsFromAlt.contains((Object)n2));
                    }
                }
                renderPass.iris$setCustomPass((CustomPass)compositeRenderer$Pass);
                float f = (float)compositeRenderer$Pass.viewWidth * compositeRenderer$Pass.viewportScale.scale();
                float f2 = (float)compositeRenderer$Pass.viewHeight * compositeRenderer$Pass.viewportScale.scale();
                int n3 = (int)((float)compositeRenderer$Pass.viewWidth * compositeRenderer$Pass.viewportScale.viewportX());
                int n4 = (int)((float)compositeRenderer$Pass.viewHeight * compositeRenderer$Pass.viewportScale.viewportY());
                GlStateManager._viewport((int)n3, (int)n4, (int)((int)f), (int)((int)f2));
                compositeRenderer$Pass.program.use();
                this.customUniforms.push((Object)compositeRenderer$Pass.program);
                renderPass.drawIndexed(0, 0, 6, 1);
                BlendModeOverride.restore();
                GLDebug.popGroup();
            }
        }
        ProgramUniforms.clearActiveUniforms();
        ProgramSamplers.clearActiveSamplers();
        GlStateManager._glUseProgram((int)0);
        for (int i = 0; i < SamplerLimits.get().getMaxTextureUnits(); ++i) {
            if (GlStateManagerAccessor.getTEXTURES()[i].field_5167 == 0) continue;
            GlStateManager._activeTexture((int)(33984 + i));
            GlStateManager._bindTexture((int)0);
        }
        GlStateManager._activeTexture((int)33984);
        GLDebug.popGroup();
        ImmediateState.temporarilyIgnorePass = false;
    }
}

