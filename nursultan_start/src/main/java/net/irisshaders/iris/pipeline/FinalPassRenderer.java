/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.blaze3d.buffers.GpuBuffer
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  com.mojang.blaze3d.systems.RenderPass
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5596
 *  it.unimi.dsi.fastutil.ints.IntList
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
 *  net.irisshaders.iris.shaderpack.programs.ProgramSet
 *  net.irisshaders.iris.shaderpack.programs.ProgramSource
 *  net.irisshaders.iris.shaderpack.properties.PackRenderTargetDirectives
 *  net.irisshaders.iris.shaderpack.properties.ProgramDirectives
 *  net.irisshaders.iris.shaderpack.texture.TextureStage
 *  net.irisshaders.iris.shadows.ShadowRenderTargets
 *  net.irisshaders.iris.targets.Blaze3dRenderTargetExt
 *  net.irisshaders.iris.targets.RenderTarget
 *  net.irisshaders.iris.targets.RenderTargets
 *  net.irisshaders.iris.uniforms.CommonUniforms
 *  net.irisshaders.iris.uniforms.FrameUpdateNotifier
 *  net.irisshaders.iris.uniforms.custom.CustomUniforms
 *  org.lwjgl.opengl.GL46C
 */
package net.irisshaders.iris.pipeline;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.VertexFormat;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
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
import net.irisshaders.iris.pipeline.CompositeRenderer;
import net.irisshaders.iris.pipeline.FinalPassRenderer$1;
import net.irisshaders.iris.pipeline.FinalPassRenderer$Pass;
import net.irisshaders.iris.pipeline.FinalPassRenderer$SwapPass;
import net.irisshaders.iris.pipeline.WorldRenderingPipeline;
import net.irisshaders.iris.pipeline.transform.PatchShaderType;
import net.irisshaders.iris.pipeline.transform.ShaderPrinter;
import net.irisshaders.iris.pipeline.transform.TransformPatcher;
import net.irisshaders.iris.samplers.IrisImages;
import net.irisshaders.iris.samplers.IrisSamplers;
import net.irisshaders.iris.shaderpack.FilledIndirectPointer;
import net.irisshaders.iris.shaderpack.loading.ProgramId;
import net.irisshaders.iris.shaderpack.programs.ComputeSource;
import net.irisshaders.iris.shaderpack.programs.ProgramSet;
import net.irisshaders.iris.shaderpack.programs.ProgramSource;
import net.irisshaders.iris.shaderpack.properties.PackRenderTargetDirectives;
import net.irisshaders.iris.shaderpack.properties.ProgramDirectives;
import net.irisshaders.iris.shaderpack.texture.TextureStage;
import net.irisshaders.iris.shadows.ShadowRenderTargets;
import net.irisshaders.iris.targets.Blaze3dRenderTargetExt;
import net.irisshaders.iris.targets.RenderTarget;
import net.irisshaders.iris.targets.RenderTargets;
import net.irisshaders.iris.uniforms.CommonUniforms;
import net.irisshaders.iris.uniforms.FrameUpdateNotifier;
import net.irisshaders.iris.uniforms.custom.CustomUniforms;
import org.lwjgl.opengl.GL46C;

public class FinalPassRenderer {
    private static final CustomPass STATE = new FinalPassRenderer$1();
    private final RenderTargets renderTargets;
    private final FinalPassRenderer$Pass finalPass;
    private final ImmutableList<FinalPassRenderer$SwapPass> swapPasses;
    private final GlFramebuffer baseline;
    private final GlFramebuffer colorHolder;
    private final Object2ObjectMap<String, TextureAccess> irisCustomTextures;
    private final Set<GlImage> customImages;
    private final TextureAccess noiseTexture;
    private final CenterDepthSampler centerDepthSampler;
    private final Object2ObjectMap<String, TextureAccess> customTextureIds;
    private final CustomUniforms customUniforms;
    private final WorldRenderingPipeline pipeline;
    private int lastColorTextureId;
    private int lastColorTextureVersion;

    public FinalPassRenderer(WorldRenderingPipeline worldRenderingPipeline, ProgramSet programSet, RenderTargets renderTargets, TextureAccess textureAccess, ShaderStorageBufferHolder shaderStorageBufferHolder, FrameUpdateNotifier frameUpdateNotifier, ImmutableSet<Integer> immutableSet, CenterDepthSampler centerDepthSampler, Supplier<ShadowRenderTargets> supplier, Object2ObjectMap<String, TextureAccess> object2ObjectMap, Object2ObjectMap<String, TextureAccess> object2ObjectMap2, Set<GlImage> set, ImmutableSet<Integer> immutableSet2, CustomUniforms customUniforms) {
        this.pipeline = worldRenderingPipeline;
        this.centerDepthSampler = centerDepthSampler;
        this.customTextureIds = object2ObjectMap;
        this.irisCustomTextures = object2ObjectMap2;
        this.customImages = set;
        PackRenderTargetDirectives packRenderTargetDirectives = programSet.getPackDirectives().getRenderTargetDirectives();
        Map map = packRenderTargetDirectives.getRenderTargetSettings();
        this.noiseTexture = textureAccess;
        this.renderTargets = renderTargets;
        this.customUniforms = customUniforms;
        this.finalPass = programSet.get(ProgramId.Final).map(programSource -> {
            FinalPassRenderer$Pass finalPassRenderer$Pass = new FinalPassRenderer$Pass();
            ProgramDirectives programDirectives = programSource.getDirectives();
            finalPassRenderer$Pass.program = this.createProgram((ProgramSource)programSource, immutableSet, immutableSet2, supplier);
            finalPassRenderer$Pass.computes = this.createComputes(programSet.getFinalCompute(), immutableSet, immutableSet2, supplier, shaderStorageBufferHolder);
            finalPassRenderer$Pass.stageReadsFromAlt = immutableSet;
            finalPassRenderer$Pass.mipmappedBuffers = programDirectives.getMipmappedBuffers();
            return finalPassRenderer$Pass;
        }).orElse(null);
        IntList intList = programSet.getPackDirectives().getRenderTargetDirectives().getBuffersToBeCleared();
        this.baseline = renderTargets.createGbufferFramebuffer(immutableSet, new int[]{0});
        this.colorHolder = new GlFramebuffer();
        this.lastColorTextureId = class06202.Nq().e().L().iris$getGlId();
        this.lastColorTextureVersion = ((Blaze3dRenderTargetExt)class06202.Nq().e()).iris$getColorBufferVersion();
        this.colorHolder.addColorAttachment(0, this.lastColorTextureId);
        ImmutableList.Builder builder = ImmutableList.builder();
        immutableSet.forEach(n -> {
            int n2 = n;
            if (intList.contains(n2)) {
                return;
            }
            FinalPassRenderer$SwapPass finalPassRenderer$SwapPass = new FinalPassRenderer$SwapPass();
            RenderTarget renderTarget = renderTargets.getOrCreate(n2);
            finalPassRenderer$SwapPass.target = n2;
            finalPassRenderer$SwapPass.width = renderTarget.getWidth();
            finalPassRenderer$SwapPass.height = renderTarget.getHeight();
            finalPassRenderer$SwapPass.from = renderTargets.createColorFramebuffer(ImmutableSet.of(), new int[]{n2});
            finalPassRenderer$SwapPass.targetTexture = renderTargets.get(n2).getMainTexture();
            builder.add((Object)finalPassRenderer$SwapPass);
        });
        this.swapPasses = builder.build();
        GlStateManager._glBindFramebuffer((int)36008, (int)0);
    }

    public void destroy() {
        if (this.finalPass != null) {
            this.finalPass.destroy();
        }
        this.colorHolder.destroy();
    }

    private Program createProgram(ProgramSource programSource, ImmutableSet<Integer> immutableSet, ImmutableSet<Integer> immutableSet2, Supplier<ShadowRenderTargets> supplier) {
        ProgramBuilder programBuilder;
        Map<PatchShaderType, String> map = TransformPatcher.patchComposite(programSource.getName(), (String)programSource.getVertexSource().orElseThrow(NullPointerException::new), programSource.getGeometrySource().orElse(null), (String)programSource.getFragmentSource().orElseThrow(NullPointerException::new), TextureStage.COMPOSITE_AND_FINAL, this.pipeline.getTextureMap());
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
            throw new RuntimeException("Shader compilation failed for final!", runtimeException);
        }
        CommonUniforms.addDynamicUniforms((DynamicUniformHolder)programBuilder, (FogMode)FogMode.OFF);
        this.customUniforms.assignTo((LocationalUniformHolder)programBuilder);
        ProgramSamplers.CustomTextureSamplerInterceptor customTextureSamplerInterceptor = ProgramSamplers.customTextureSamplerInterceptor((SamplerHolder)programBuilder, this.customTextureIds, immutableSet2);
        IrisSamplers.addRenderTargetSamplers((SamplerHolder)customTextureSamplerInterceptor, () -> immutableSet, this.renderTargets, true, this.pipeline);
        IrisSamplers.addCustomImages((SamplerHolder)customTextureSamplerInterceptor, this.customImages);
        IrisImages.addRenderTargetImages((ImageHolder)programBuilder, () -> immutableSet, this.renderTargets);
        IrisImages.addCustomImages((ImageHolder)programBuilder, this.customImages);
        IrisSamplers.addCustomTextures((SamplerHolder)programBuilder, this.irisCustomTextures);
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

    private static void resetRenderTarget(RenderTarget renderTarget) {
        if (renderTarget == null) {
            return;
        }
        renderTarget.turnOffMips(true);
        renderTarget.turnOffMips(false);
    }

    public void renderFinalPass() {
        class08066 class080662 = class06202.Nq().e();
        int n = class080662.N;
        int n2 = class080662.y;
        if (((Blaze3dRenderTargetExt)class080662).iris$getColorBufferVersion() != this.lastColorTextureVersion || class080662.L().iris$getGlId() != this.lastColorTextureId) {
            this.lastColorTextureVersion = ((Blaze3dRenderTargetExt)class080662).iris$getColorBufferVersion();
            this.lastColorTextureId = class080662.L().iris$getGlId();
            this.colorHolder.addColorAttachment(0, this.lastColorTextureId);
        }
        if (this.finalPass != null) {
            GpuBuffer gpuBuffer;
            GLDebug.pushGroup((int)990, (String)"final");
            for (ComputeProgram computeProgram : this.finalPass.computes) {
                if (computeProgram == null) continue;
                computeProgram.use();
                this.customUniforms.push((Object)computeProgram);
                computeProgram.dispatch((float)n, (float)n2);
            }
            IrisRenderSystem.memoryBarrier((int)8232);
            if (!this.finalPass.mipmappedBuffers.isEmpty()) {
                GlStateManager._activeTexture((int)33984);
                gpuBuffer = this.finalPass.mipmappedBuffers.iterator();
                while (gpuBuffer.hasNext()) {
                    int n3 = (Integer)gpuBuffer.next();
                    FinalPassRenderer.setupMipmapping(this.renderTargets.get(n3), this.finalPass.stageReadsFromAlt.contains((Object)n3));
                }
            }
            gpuBuffer = RenderSystem.getSequentialBuffer((VertexFormat.class_5596)VertexFormat.class_5596.field_27382).method_68274(6);
            Object object = RenderSystem.getSequentialBuffer((VertexFormat.class_5596)VertexFormat.class_5596.field_27382).method_31924();
            try (RenderPass renderPass = RenderSystem.getDevice().createCommandEncoder().createRenderPass(() -> "Final pass", class06202.Nq().e().u(), OptionalInt.empty());){
                renderPass.setPipeline(CompositeRenderer.COMPOSITE_PIPELINE);
                renderPass.setIndexBuffer(gpuBuffer, object);
                renderPass.setVertexBuffer(0, FullScreenQuadRenderer.INSTANCE.getQuad());
                renderPass.iris$setCustomPass(STATE);
                this.finalPass.program.use();
                BlendModeOverride.restore();
                GlStateManager._disableBlend();
                this.customUniforms.push((Object)this.finalPass.program);
                renderPass.drawIndexed(0, 0, 6, 1);
            }
            GLDebug.popGroup();
        } else {
            this.baseline.bindAsReadBuffer();
            IrisRenderSystem.copyTexSubImage2D((int)class080662.L().iris$getGlId(), (int)3553, (int)0, (int)0, (int)0, (int)0, (int)0, (int)n, (int)n2);
        }
        GlStateManager._activeTexture((int)33984);
        for (int i = 0; i < this.renderTargets.getRenderTargetCount(); ++i) {
            FinalPassRenderer.resetRenderTarget(this.renderTargets.get(i));
        }
        for (Object object : this.swapPasses) {
            object.from.bind();
            GlStateManager._bindTexture((int)object.targetTexture);
            GL46C.glCopyTexSubImage2D((int)3553, (int)0, (int)0, (int)0, (int)0, (int)0, (int)object.width, (int)object.height);
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
                string = TransformPatcher.patchCompute(computeSource.getName(), computeSource.getSource().orElse(null), TextureStage.COMPOSITE_AND_FINAL, this.pipeline.getTextureMap());
                ShaderPrinter.printProgram(computeSource.getName()).addSource(PatchShaderType.COMPUTE, string).print();
                programBuilder = ProgramBuilder.beginCompute((String)computeSource.getName(), (String)string, IrisSamplers.COMPOSITE_RESERVED_TEXTURE_UNITS);
            }
            catch (ShaderCompileException shaderCompileException) {
                throw shaderCompileException;
            }
            catch (RuntimeException runtimeException) {
                throw new RuntimeException("Shader compilation failed for final compute " + computeSource.getName() + "!", runtimeException);
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

    public void recalculateSwapPassSize() {
        for (FinalPassRenderer$SwapPass finalPassRenderer$SwapPass : this.swapPasses) {
            RenderTarget renderTarget = this.renderTargets.get(finalPassRenderer$SwapPass.target);
            this.renderTargets.destroyFramebuffer(finalPassRenderer$SwapPass.from);
            finalPassRenderer$SwapPass.from = this.renderTargets.createColorFramebuffer(ImmutableSet.of(), new int[]{finalPassRenderer$SwapPass.target});
            finalPassRenderer$SwapPass.width = renderTarget.getWidth();
            finalPassRenderer$SwapPass.height = renderTarget.getHeight();
            finalPassRenderer$SwapPass.targetTexture = renderTarget.getMainTexture();
        }
    }
}

