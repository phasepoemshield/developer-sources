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
 *  com.mojang.blaze3d.systems.RenderPass
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5595
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5596
 *  it.unimi.dsi.fastutil.objects.Object2ObjectMap
 *  minecraft.class06202
 *  minecraft.class08066
 *  net.irisshaders.iris.features.FeatureFlags
 *  net.irisshaders.iris.gl.IrisRenderSystem
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
 *  net.irisshaders.iris.gl.sampler.SamplerHolder
 *  net.irisshaders.iris.gl.state.FogMode
 *  net.irisshaders.iris.gl.texture.TextureAccess
 *  net.irisshaders.iris.gl.uniform.DynamicUniformHolder
 *  net.irisshaders.iris.gl.uniform.LocationalUniformHolder
 *  net.irisshaders.iris.mixinterface.CustomPass
 *  net.irisshaders.iris.pathways.FullScreenQuadRenderer
 *  net.irisshaders.iris.pipeline.CompositeRenderer
 *  net.irisshaders.iris.pipeline.WorldRenderingPipeline
 *  net.irisshaders.iris.pipeline.transform.PatchShaderType
 *  net.irisshaders.iris.pipeline.transform.ShaderPrinter
 *  net.irisshaders.iris.pipeline.transform.TransformPatcher
 *  net.irisshaders.iris.samplers.IrisImages
 *  net.irisshaders.iris.samplers.IrisSamplers
 *  net.irisshaders.iris.shaderpack.FilledIndirectPointer
 *  net.irisshaders.iris.uniforms.CommonUniforms
 *  net.irisshaders.iris.uniforms.FrameUpdateNotifier
 *  net.irisshaders.iris.uniforms.custom.CustomUniforms
 */
package net.irisshaders.iris.shadows;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.VertexFormat;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import java.util.Map;
import java.util.Objects;
import java.util.OptionalInt;
import java.util.Set;
import minecraft.class06202;
import minecraft.class08066;
import net.irisshaders.iris.features.FeatureFlags;
import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.gl.buffer.ShaderStorageBufferHolder;
import net.irisshaders.iris.gl.framebuffer.GlFramebuffer;
import net.irisshaders.iris.gl.image.GlImage;
import net.irisshaders.iris.gl.image.ImageHolder;
import net.irisshaders.iris.gl.program.ComputeProgram;
import net.irisshaders.iris.gl.program.Program;
import net.irisshaders.iris.gl.program.ProgramBuilder;
import net.irisshaders.iris.gl.program.ProgramSamplers;
import net.irisshaders.iris.gl.program.ProgramUniforms;
import net.irisshaders.iris.gl.sampler.SamplerHolder;
import net.irisshaders.iris.gl.state.FogMode;
import net.irisshaders.iris.gl.texture.TextureAccess;
import net.irisshaders.iris.gl.uniform.DynamicUniformHolder;
import net.irisshaders.iris.gl.uniform.LocationalUniformHolder;
import net.irisshaders.iris.mixinterface.CustomPass;
import net.irisshaders.iris.pathways.FullScreenQuadRenderer;
import net.irisshaders.iris.pipeline.CompositeRenderer;
import net.irisshaders.iris.pipeline.WorldRenderingPipeline;
import net.irisshaders.iris.pipeline.transform.PatchShaderType;
import net.irisshaders.iris.pipeline.transform.ShaderPrinter;
import net.irisshaders.iris.pipeline.transform.TransformPatcher;
import net.irisshaders.iris.samplers.IrisImages;
import net.irisshaders.iris.samplers.IrisSamplers;
import net.irisshaders.iris.shaderpack.FilledIndirectPointer;
import net.irisshaders.iris.shaderpack.programs.ComputeSource;
import net.irisshaders.iris.shaderpack.programs.ProgramSource;
import net.irisshaders.iris.shaderpack.properties.IndirectPointer;
import net.irisshaders.iris.shaderpack.properties.PackDirectives;
import net.irisshaders.iris.shaderpack.properties.PackRenderTargetDirectives;
import net.irisshaders.iris.shaderpack.properties.PackRenderTargetDirectives$RenderTargetSettings;
import net.irisshaders.iris.shaderpack.properties.ProgramDirectives;
import net.irisshaders.iris.shaderpack.texture.TextureStage;
import net.irisshaders.iris.shadows.ShadowCompositeRenderer$ComputeOnlyPass;
import net.irisshaders.iris.shadows.ShadowCompositeRenderer$Pass;
import net.irisshaders.iris.shadows.ShadowRenderTargets;
import net.irisshaders.iris.targets.RenderTarget;
import net.irisshaders.iris.uniforms.CommonUniforms;
import net.irisshaders.iris.uniforms.FrameUpdateNotifier;
import net.irisshaders.iris.uniforms.custom.CustomUniforms;

public class ShadowCompositeRenderer {
    private final ShadowRenderTargets renderTargets;
    private final ImmutableList<ShadowCompositeRenderer$Pass> passes;
    private final TextureAccess noiseTexture;
    private final Object2ObjectMap<String, TextureAccess> customTextureIds;
    private final ImmutableSet<Integer> flippedAtLeastOnceFinal;
    private final CustomUniforms customUniforms;
    private final Object2ObjectMap<String, TextureAccess> irisCustomTextures;
    private final WorldRenderingPipeline pipeline;
    private final Set<GlImage> irisCustomImages;

    public ShadowCompositeRenderer(WorldRenderingPipeline worldRenderingPipeline, PackDirectives packDirectives, ProgramSource[] programSourceArray, ComputeSource[][] computeSourceArray, ShadowRenderTargets shadowRenderTargets, ShaderStorageBufferHolder shaderStorageBufferHolder, TextureAccess textureAccess, FrameUpdateNotifier frameUpdateNotifier, Object2ObjectMap<String, TextureAccess> object2ObjectMap, Set<GlImage> set, ImmutableMap<Integer, Boolean> immutableMap, Object2ObjectMap<String, TextureAccess> object2ObjectMap2, CustomUniforms customUniforms) {
        this.pipeline = worldRenderingPipeline;
        this.noiseTexture = textureAccess;
        this.renderTargets = shadowRenderTargets;
        this.customTextureIds = object2ObjectMap;
        this.irisCustomTextures = object2ObjectMap2;
        this.irisCustomImages = set;
        this.customUniforms = customUniforms;
        PackRenderTargetDirectives packRenderTargetDirectives = packDirectives.getRenderTargetDirectives();
        Map<Integer, PackRenderTargetDirectives$RenderTargetSettings> map = packRenderTargetDirectives.getRenderTargetSettings();
        ImmutableList.Builder builder = ImmutableList.builder();
        ImmutableSet.Builder builder2 = new ImmutableSet.Builder();
        immutableMap.forEach((n, bl) -> {
            if (bl.booleanValue()) {
                shadowRenderTargets.flip((int)n);
            }
        });
        int n2 = programSourceArray.length;
        for (int i = 0; i < n2; ++i) {
            int[] nArray;
            ShadowCompositeRenderer$Pass shadowCompositeRenderer$Pass;
            ProgramSource programSource = programSourceArray[i];
            ImmutableSet<Integer> immutableSet = shadowRenderTargets.snapshot();
            ImmutableSet immutableSet2 = builder2.build();
            if (programSource == null || !programSource.isValid()) {
                if (computeSourceArray.length <= 0 || computeSourceArray[i] == null) continue;
                shadowCompositeRenderer$Pass = new ShadowCompositeRenderer$ComputeOnlyPass();
                ((ShadowCompositeRenderer$ComputeOnlyPass)shadowCompositeRenderer$Pass).computes = this.createComputes(computeSourceArray[i], immutableSet, (ImmutableSet<Integer>)immutableSet2, shadowRenderTargets, shaderStorageBufferHolder);
                builder.add((Object)shadowCompositeRenderer$Pass);
                continue;
            }
            shadowCompositeRenderer$Pass = new ShadowCompositeRenderer$Pass();
            ProgramDirectives programDirectives = programSource.getDirectives();
            shadowCompositeRenderer$Pass.name = programSource.getName();
            shadowCompositeRenderer$Pass.program = this.createProgram(programSource, immutableSet, (ImmutableSet<Integer>)immutableSet2, shadowRenderTargets);
            shadowCompositeRenderer$Pass.blendModeOverride = programSource.getDirectives().getBlendModeOverride().orElse(null);
            shadowCompositeRenderer$Pass.computes = computeSourceArray.length > 0 ? this.createComputes(computeSourceArray[i], immutableSet, (ImmutableSet<Integer>)immutableSet2, shadowRenderTargets, shaderStorageBufferHolder) : new ComputeProgram[0];
            if (programSource.getDirectives().hasUnknownDrawBuffers()) {
                int[] nArray2 = new int[2];
                nArray2[0] = 0;
                nArray = nArray2;
                nArray2[1] = 1;
            } else {
                nArray = programSource.getDirectives().getDrawBuffers();
            }
            int[] nArray3 = nArray;
            GlFramebuffer glFramebuffer = shadowRenderTargets.createColorFramebuffer(immutableSet, nArray3);
            shadowCompositeRenderer$Pass.stageReadsFromAlt = immutableSet;
            shadowCompositeRenderer$Pass.framebuffer = glFramebuffer;
            shadowCompositeRenderer$Pass.viewportScale = programDirectives.getViewportScale();
            shadowCompositeRenderer$Pass.mipmappedBuffers = programDirectives.getMipmappedBuffers();
            shadowCompositeRenderer$Pass.flippedAtLeastOnce = immutableSet2;
            builder.add((Object)shadowCompositeRenderer$Pass);
            ImmutableMap<Integer, Boolean> immutableMap2 = programDirectives.getExplicitFlips();
            for (int n3 : nArray3) {
                if (immutableMap2.get((Object)n3) == Boolean.FALSE) continue;
                shadowRenderTargets.flip(n3);
                builder2.add((Object)n3);
            }
            immutableMap2.forEach((n, bl) -> {
                if (bl.booleanValue()) {
                    shadowRenderTargets.flip((int)n);
                    builder2.add(n);
                }
            });
        }
        this.passes = builder.build();
        this.flippedAtLeastOnceFinal = builder2.build();
        GlStateManager._glBindFramebuffer((int)36008, (int)0);
    }

    public void destroy() {
        for (ShadowCompositeRenderer$Pass shadowCompositeRenderer$Pass : this.passes) {
            shadowCompositeRenderer$Pass.destroy();
        }
    }

    private Program createProgram(ProgramSource programSource, ImmutableSet<Integer> immutableSet, ImmutableSet<Integer> immutableSet2, ShadowRenderTargets shadowRenderTargets) {
        ProgramBuilder programBuilder;
        Map map = TransformPatcher.patchComposite((String)programSource.getName(), (String)programSource.getVertexSource().orElseThrow(NullPointerException::new), (String)programSource.getGeometrySource().orElse(null), (String)programSource.getFragmentSource().orElseThrow(NullPointerException::new), (TextureStage)TextureStage.SHADOWCOMP, (Object2ObjectMap)this.pipeline.getTextureMap());
        String string = (String)map.get(PatchShaderType.VERTEX);
        String string2 = (String)map.get(PatchShaderType.GEOMETRY);
        String string3 = (String)map.get(PatchShaderType.FRAGMENT);
        ShaderPrinter.printProgram((String)programSource.getName()).addSources(map).print();
        Objects.requireNonNull(immutableSet);
        try {
            programBuilder = ProgramBuilder.begin((String)programSource.getName(), (String)string, (String)string2, (String)string3, (ImmutableSet)IrisSamplers.COMPOSITE_RESERVED_TEXTURE_UNITS);
        }
        catch (RuntimeException runtimeException) {
            throw new RuntimeException("Shader compilation failed for shadow composite " + programSource.getName() + "!", runtimeException);
        }
        ProgramSamplers.CustomTextureSamplerInterceptor customTextureSamplerInterceptor = ProgramSamplers.customTextureSamplerInterceptor((SamplerHolder)programBuilder, this.customTextureIds, immutableSet2);
        CommonUniforms.addDynamicUniforms((DynamicUniformHolder)programBuilder, (FogMode)FogMode.OFF);
        this.customUniforms.assignTo((LocationalUniformHolder)programBuilder);
        IrisSamplers.addNoiseSampler((SamplerHolder)customTextureSamplerInterceptor, (TextureAccess)this.noiseTexture);
        IrisSamplers.addCustomTextures((SamplerHolder)customTextureSamplerInterceptor, this.irisCustomTextures);
        IrisSamplers.addShadowSamplers((SamplerHolder)customTextureSamplerInterceptor, (ShadowRenderTargets)shadowRenderTargets, immutableSet, (boolean)this.pipeline.hasFeature(FeatureFlags.SEPARATE_HARDWARE_SAMPLERS));
        IrisImages.addShadowColorImages((ImageHolder)programBuilder, (ShadowRenderTargets)shadowRenderTargets, immutableSet);
        IrisImages.addCustomImages((ImageHolder)programBuilder, this.irisCustomImages);
        IrisSamplers.addCustomImages((SamplerHolder)programBuilder, this.irisCustomImages);
        Program program = programBuilder.build();
        this.customUniforms.mapholderToPass((LocationalUniformHolder)programBuilder, (Object)program);
        return program;
    }

    private static void resetRenderTarget(RenderTarget renderTarget) {
        int n = 9729;
        if (renderTarget.getInternalFormat().getPixelFormat().isInteger()) {
            n = 9728;
        }
        IrisRenderSystem.texParameteri((int)renderTarget.getMainTexture(), (int)3553, (int)10241, (int)n);
        IrisRenderSystem.texParameteri((int)renderTarget.getAltTexture(), (int)3553, (int)10241, (int)n);
    }

    private static void setupMipmapping(RenderTarget renderTarget, boolean bl) {
        int n = bl ? renderTarget.getAltTexture() : renderTarget.getMainTexture();
        IrisRenderSystem.generateMipmaps((int)n, (int)3553);
        IrisRenderSystem.texParameteri((int)n, (int)3553, (int)10241, (int)(renderTarget.getInternalFormat().getPixelFormat().isInteger() ? 9984 : 9987));
    }

    private ComputeProgram[] createComputes(ComputeSource[] computeSourceArray, ImmutableSet<Integer> immutableSet, ImmutableSet<Integer> immutableSet2, ShadowRenderTargets shadowRenderTargets, ShaderStorageBufferHolder shaderStorageBufferHolder) {
        ComputeProgram[] computeProgramArray = new ComputeProgram[computeSourceArray.length];
        for (int i = 0; i < computeProgramArray.length; ++i) {
            ProgramBuilder programBuilder;
            String string;
            ComputeSource computeSource = computeSourceArray[i];
            if (computeSource == null || computeSource.getSource().isEmpty()) continue;
            Objects.requireNonNull(immutableSet);
            try {
                string = TransformPatcher.patchCompute((String)computeSource.getName(), (String)computeSource.getSource().orElse(null), (TextureStage)TextureStage.SHADOWCOMP, (Object2ObjectMap)this.pipeline.getTextureMap());
                ShaderPrinter.printProgram((String)computeSource.getName()).addSource(PatchShaderType.COMPUTE, string).print();
                programBuilder = ProgramBuilder.beginCompute((String)computeSource.getName(), (String)string, (ImmutableSet)IrisSamplers.COMPOSITE_RESERVED_TEXTURE_UNITS);
            }
            catch (RuntimeException runtimeException) {
                throw new RuntimeException("Shader compilation failed for shadowcomp compute " + computeSource.getName() + "!", runtimeException);
            }
            string = ProgramSamplers.customTextureSamplerInterceptor((SamplerHolder)programBuilder, this.customTextureIds, immutableSet2);
            CommonUniforms.addDynamicUniforms((DynamicUniformHolder)programBuilder, (FogMode)FogMode.OFF);
            this.customUniforms.assignTo((LocationalUniformHolder)programBuilder);
            IrisSamplers.addNoiseSampler((SamplerHolder)string, (TextureAccess)this.noiseTexture);
            IrisSamplers.addCustomTextures((SamplerHolder)string, this.irisCustomTextures);
            IrisSamplers.addShadowSamplers((SamplerHolder)string, (ShadowRenderTargets)shadowRenderTargets, immutableSet, (boolean)this.pipeline.hasFeature(FeatureFlags.SEPARATE_HARDWARE_SAMPLERS));
            IrisImages.addShadowColorImages((ImageHolder)programBuilder, (ShadowRenderTargets)shadowRenderTargets, immutableSet);
            IrisImages.addCustomImages((ImageHolder)programBuilder, this.irisCustomImages);
            IrisSamplers.addCustomImages((SamplerHolder)programBuilder, this.irisCustomImages);
            computeProgramArray[i] = programBuilder.buildCompute();
            this.customUniforms.mapholderToPass((LocationalUniformHolder)programBuilder, (Object)computeProgramArray[i]);
            computeProgramArray[i].setWorkGroupInfo(computeSource.getWorkGroupRelative(), computeSource.getWorkGroups(), FilledIndirectPointer.basedOff((ShaderStorageBufferHolder)shaderStorageBufferHolder, (IndirectPointer)computeSource.getIndirectPointer()));
        }
        return computeProgramArray;
    }

    public ImmutableSet<Integer> getFlippedAtLeastOnceFinal() {
        return this.flippedAtLeastOnceFinal;
    }

    public void renderAll() {
        GpuBuffer gpuBuffer = RenderSystem.getSequentialBuffer((VertexFormat.class_5596)VertexFormat.class_5596.field_27382).method_68274(6);
        VertexFormat.class_5595 class_55952 = RenderSystem.getSequentialBuffer((VertexFormat.class_5596)VertexFormat.class_5596.field_27382).method_31924();
        try (RenderPass renderPass = RenderSystem.getDevice().createCommandEncoder().createRenderPass(() -> "Shadow composites", class06202.Nq().e().u(), OptionalInt.empty());){
            renderPass.setPipeline(CompositeRenderer.COMPOSITE_PIPELINE);
            renderPass.setVertexBuffer(0, FullScreenQuadRenderer.INSTANCE.getQuad());
            renderPass.setIndexBuffer(gpuBuffer, class_55952);
            for (ShadowCompositeRenderer$Pass shadowCompositeRenderer$Pass : this.passes) {
                boolean bl = false;
                for (ComputeProgram computeProgram : shadowCompositeRenderer$Pass.computes) {
                    if (computeProgram == null) continue;
                    bl = true;
                    computeProgram.use();
                    this.customUniforms.push((Object)computeProgram);
                    class08066 class080662 = class06202.Nq().e();
                    computeProgram.dispatch((float)class080662.N, (float)class080662.y);
                }
                if (bl) {
                    IrisRenderSystem.memoryBarrier((int)8232);
                }
                Program.unbind();
                if (shadowCompositeRenderer$Pass instanceof ShadowCompositeRenderer$ComputeOnlyPass) continue;
                if (!shadowCompositeRenderer$Pass.mipmappedBuffers.isEmpty()) {
                    GlStateManager._activeTexture((int)33984);
                    UnmodifiableIterator unmodifiableIterator = shadowCompositeRenderer$Pass.mipmappedBuffers.iterator();
                    while (unmodifiableIterator.hasNext()) {
                        int n = (Integer)unmodifiableIterator.next();
                        ShadowCompositeRenderer.setupMipmapping(this.renderTargets.get(n), shadowCompositeRenderer$Pass.stageReadsFromAlt.contains((Object)n));
                    }
                }
                renderPass.iris$setCustomPass((CustomPass)shadowCompositeRenderer$Pass);
                float f = (float)this.renderTargets.getResolution() * shadowCompositeRenderer$Pass.viewportScale.scale();
                float f2 = (float)this.renderTargets.getResolution() * shadowCompositeRenderer$Pass.viewportScale.scale();
                int n = (int)((float)this.renderTargets.getResolution() * shadowCompositeRenderer$Pass.viewportScale.viewportX());
                int n2 = (int)((float)this.renderTargets.getResolution() * shadowCompositeRenderer$Pass.viewportScale.viewportY());
                GlStateManager._viewport((int)n, (int)n2, (int)((int)f), (int)((int)f2));
                shadowCompositeRenderer$Pass.framebuffer.bind();
                shadowCompositeRenderer$Pass.program.use();
                this.customUniforms.push((Object)shadowCompositeRenderer$Pass.program);
                renderPass.drawIndexed(0, 0, 6, 1);
            }
        }
        ProgramUniforms.clearActiveUniforms();
        GlStateManager._glUseProgram((int)0);
        GlStateManager._activeTexture((int)33984);
    }
}

