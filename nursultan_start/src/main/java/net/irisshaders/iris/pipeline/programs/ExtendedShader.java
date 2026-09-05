/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  com.mojang.blaze3d.pipeline.RenderPipeline$UniformDescription
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  com.mojang.blaze3d.textures.TextureFormat
 *  com.mojang.blaze3d.vertex.VertexFormat
 *  com.mojang.blaze3d.vertex.VertexFormatElement
 *  com.mojang.logging.LogUtils
 *  minecraft.class02255
 *  minecraft.class07345
 *  minecraft.class08419
 *  net.irisshaders.iris.compat.SkipList
 *  net.irisshaders.iris.gl.GLDebug
 *  net.irisshaders.iris.gl.IrisRenderSystem
 *  net.irisshaders.iris.gl.blending.AlphaTest
 *  net.irisshaders.iris.gl.blending.BlendModeOverride
 *  net.irisshaders.iris.gl.blending.BufferBlendOverride
 *  net.irisshaders.iris.gl.blending.DepthColorStorage
 *  net.irisshaders.iris.gl.framebuffer.GlFramebuffer
 *  net.irisshaders.iris.gl.image.ImageHolder
 *  net.irisshaders.iris.gl.program.ProgramImages
 *  net.irisshaders.iris.gl.program.ProgramImages$Builder
 *  net.irisshaders.iris.gl.program.ProgramSamplers
 *  net.irisshaders.iris.gl.program.ProgramSamplers$Builder
 *  net.irisshaders.iris.gl.program.ProgramUniforms
 *  net.irisshaders.iris.gl.program.ProgramUniforms$Builder
 *  net.irisshaders.iris.gl.sampler.SamplerHolder
 *  net.irisshaders.iris.gl.texture.TextureType
 *  net.irisshaders.iris.gl.uniform.DynamicLocationalUniformHolder
 *  net.irisshaders.iris.gl.uniform.LocationalUniformHolder
 *  net.irisshaders.iris.mixinterface.ShaderInstanceInterface
 *  net.irisshaders.iris.shadows.ShadowRenderer
 *  net.irisshaders.iris.shadows.ShadowRenderingState
 *  net.irisshaders.iris.uniforms.CapturedRenderingState
 *  net.irisshaders.iris.uniforms.custom.CustomUniforms
 *  net.irisshaders.iris.vertices.ImmediateState
 *  org.joml.Matrix3f
 *  org.joml.Matrix4f
 *  org.lwjgl.opengl.GL46C
 *  org.slf4j.Logger
 */
package net.irisshaders.iris.pipeline.programs;

import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.textures.TextureFormat;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.VertexFormatElement;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import minecraft.class02255;
import minecraft.class07345;
import minecraft.class08419;
import net.irisshaders.iris.compat.SkipList;
import net.irisshaders.iris.gl.GLDebug;
import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.gl.blending.AlphaTest;
import net.irisshaders.iris.gl.blending.BlendModeOverride;
import net.irisshaders.iris.gl.blending.BufferBlendOverride;
import net.irisshaders.iris.gl.blending.DepthColorStorage;
import net.irisshaders.iris.gl.framebuffer.GlFramebuffer;
import net.irisshaders.iris.gl.image.ImageHolder;
import net.irisshaders.iris.gl.program.ProgramImages;
import net.irisshaders.iris.gl.program.ProgramSamplers;
import net.irisshaders.iris.gl.program.ProgramUniforms;
import net.irisshaders.iris.gl.sampler.SamplerHolder;
import net.irisshaders.iris.gl.texture.TextureType;
import net.irisshaders.iris.gl.uniform.DynamicLocationalUniformHolder;
import net.irisshaders.iris.gl.uniform.LocationalUniformHolder;
import net.irisshaders.iris.mixinterface.ShaderInstanceInterface;
import net.irisshaders.iris.pipeline.IrisRenderingPipeline;
import net.irisshaders.iris.pipeline.programs.IrisProgram;
import net.irisshaders.iris.samplers.IrisSamplers;
import net.irisshaders.iris.shadows.ShadowRenderer;
import net.irisshaders.iris.shadows.ShadowRenderingState;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import net.irisshaders.iris.uniforms.custom.CustomUniforms;
import net.irisshaders.iris.vertices.ImmediateState;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.lwjgl.opengl.GL46C;
import org.slf4j.Logger;

public class ExtendedShader
extends class02255
implements IrisProgram {
    private static final Matrix4f identity;
    private static final Logger LOGGER;
    private static ExtendedShader lastApplied;
    private final boolean intensitySwizzle;
    private final List<BufferBlendOverride> bufferBlendOverrides;
    private final boolean hasOverrides;
    private final int modelViewInverse;
    private final int projectionInverse;
    private final Matrix3f normalMatrix = new Matrix3f();
    private final CustomUniforms customUniforms;
    private final IrisRenderingPipeline parent;
    private final ProgramUniforms uniforms;
    private final ProgramSamplers samplers;
    private final ProgramImages images;
    private final GlFramebuffer writingToBeforeTranslucent;
    private final GlFramebuffer writingToAfterTranslucent;
    private final BlendModeOverride blendModeOverride;
    private final float alphaTest;
    private final boolean usesTessellation;
    private final Matrix4f tempMatrix4f = new Matrix4f();
    private final Matrix3f tempMatrix3f = new Matrix3f();
    private final float[] tempFloats = new float[16];
    private final float[] tempFloats2 = new float[9];
    private final int normalMat;
    private boolean hasUV;
    private int textureToUnswizzle;
    private boolean isSetup;
    private final IrisRenderingPipeline pipeline;
    private float[] tempF = new float[9];

    public ExtendedShader(int n, String string, VertexFormat vertexFormat, boolean bl, GlFramebuffer glFramebuffer, GlFramebuffer glFramebuffer2, BlendModeOverride blendModeOverride, AlphaTest alphaTest, Consumer<DynamicLocationalUniformHolder> consumer, BiConsumer<SamplerHolder, ImageHolder> biConsumer, boolean bl2, IrisRenderingPipeline irisRenderingPipeline, List<BufferBlendOverride> list, CustomUniforms customUniforms) throws IOException {
        super(n, string);
        this.pipeline = irisRenderingPipeline;
        GLDebug.nameObject((int)33506, (int)n, (String)string);
        ((ShaderInstanceInterface)this).setShouldSkip(SkipList.NONE);
        ArrayList<RenderPipeline.UniformDescription> arrayList = new ArrayList<RenderPipeline.UniformDescription>();
        ArrayList<String> arrayList2 = new ArrayList<String>();
        arrayList.add(new RenderPipeline.UniformDescription("DynamicTransforms", class08419.field_60031));
        arrayList.add(new RenderPipeline.UniformDescription("CloudInfo", class08419.field_60031));
        arrayList.add(new RenderPipeline.UniformDescription("CloudFaces", class08419.field_60032, TextureFormat.RED8I));
        arrayList.add(new RenderPipeline.UniformDescription("Projection", class08419.field_60031));
        arrayList.add(new RenderPipeline.UniformDescription("Fog", class08419.field_60031));
        arrayList.add(new RenderPipeline.UniformDescription("Globals", class08419.field_60031));
        if (vertexFormat.contains(VertexFormatElement.UV)) {
            this.hasUV = true;
            arrayList2.add("Sampler0");
        }
        if (vertexFormat.contains(VertexFormatElement.UV1)) {
            arrayList2.add("Sampler1");
        }
        if (vertexFormat.contains(VertexFormatElement.UV2)) {
            arrayList2.add("Sampler2");
        }
        super.method_62900(arrayList, arrayList2);
        ProgramUniforms.Builder builder = ProgramUniforms.builder((String)string, (int)n);
        ProgramSamplers.Builder builder2 = ProgramSamplers.builder((int)n, IrisSamplers.WORLD_RESERVED_TEXTURE_UNITS);
        consumer.accept((DynamicLocationalUniformHolder)builder);
        this.normalMat = GlStateManager._glGetUniformLocation((int)n, (CharSequence)"iris_NormalMat");
        ProgramImages.Builder builder3 = ProgramImages.builder((int)n);
        biConsumer.accept((SamplerHolder)builder2, (ImageHolder)builder3);
        customUniforms.mapholderToPass((LocationalUniformHolder)builder, (Object)this);
        this.usesTessellation = bl;
        this.uniforms = builder.buildUniforms();
        this.customUniforms = customUniforms;
        this.samplers = builder2.build();
        this.images = builder3.build();
        this.writingToBeforeTranslucent = glFramebuffer;
        this.writingToAfterTranslucent = glFramebuffer2;
        this.blendModeOverride = blendModeOverride;
        this.bufferBlendOverrides = list;
        this.hasOverrides = list != null && !list.isEmpty();
        this.alphaTest = alphaTest.reference();
        this.parent = irisRenderingPipeline;
        this.modelViewInverse = GlStateManager._glGetUniformLocation((int)n, (CharSequence)"iris_ModelViewMatInverse");
        this.projectionInverse = GlStateManager._glGetUniformLocation((int)n, (CharSequence)"iris_ProjMatInverse");
        this.intensitySwizzle = bl2;
    }

    static {
        LOGGER = LogUtils.getLogger();
        identity = new Matrix4f();
        identity.identity();
    }

    public Map<String, class07345> method_68406() {
        return super.method_68406();
    }

    @Override
    public int iris$getBlockIndex(int n, CharSequence charSequence) {
        return GL46C.glGetUniformBlockIndex((int)n, (CharSequence)("iris_" + String.valueOf(charSequence)));
    }

    public boolean hasActiveImages() {
        return this.images.getActiveImages() > 0;
    }

    public boolean isIntensitySwizzle() {
        return this.intensitySwizzle;
    }

    @Override
    public boolean iris$isSetUp() {
        return this.isSetup;
    }

    @Override
    public void iris$setupState(GpuTextureView gpuTextureView) {
        this.isSetup = true;
        DepthColorStorage.unlockDepthColor();
        if (!this.hasUV) {
            IrisRenderSystem.bindTextureToUnit((int)3553, (int)0, (int)this.pipeline.getWhitePixel().method_68004().iris$getGlId());
        }
        CapturedRenderingState.INSTANCE.setCurrentAlphaTest(this.alphaTest);
        GlStateManager._glUseProgram((int)this.method_1270());
        if (this.modelViewInverse > -1) {
            IrisRenderSystem.uniformMatrix4fv((int)this.modelViewInverse, (boolean)false, (float[])RenderSystem.getModelViewMatrix().invert(this.tempMatrix4f).get(this.tempFloats));
        }
        if (this.normalMat > -1) {
            this.tempF = RenderSystem.getModelViewMatrix().invert(this.tempMatrix4f).transpose3x3(this.normalMatrix).get(this.tempF);
            IrisRenderSystem.uniformMatrix3fv((int)this.normalMat, (boolean)false, (float[])this.tempF);
        }
        if (this.projectionInverse > -1) {
            IrisRenderSystem.uniformMatrix4fv((int)this.projectionInverse, (boolean)false, (float[])(ShadowRenderingState.areShadowsCurrentlyBeingRendered() ? ShadowRenderer.PROJECTION : CapturedRenderingState.INSTANCE.getGbufferProjection()).invert(this.tempMatrix4f).get(this.tempFloats));
        }
        if (this.intensitySwizzle && gpuTextureView != null) {
            IrisRenderSystem.addUnswizzle((int)gpuTextureView.texture().iris$getGlId());
            int[] nArray = new int[4];
            nArray[0] = 6403;
            nArray[1] = 6403;
            nArray[2] = 6403;
            nArray[3] = 6403;
            IrisRenderSystem.texParameteriv((int)gpuTextureView.texture().iris$getGlId(), (int)TextureType.TEXTURE_2D.getGlType(), (int)36422, (int[])nArray);
        }
        ImmediateState.usingTessellation = this.usesTessellation;
        this.samplers.update();
        this.uniforms.update();
        this.customUniforms.push((Object)this);
        this.images.update();
        BlendModeOverride.restore();
        if (this.blendModeOverride != null) {
            this.blendModeOverride.apply();
        }
        if (this.hasOverrides) {
            this.bufferBlendOverrides.forEach(BufferBlendOverride::apply);
        }
        if (this.parent.isBeforeTranslucent) {
            this.writingToBeforeTranslucent.bind();
        } else {
            this.writingToAfterTranslucent.bind();
        }
    }

    @Override
    public void iris$clearState() {
        ProgramUniforms.clearActiveUniforms();
        ProgramSamplers.clearActiveSamplers();
        if (this.blendModeOverride != null || this.hasOverrides) {
            BlendModeOverride.restore();
        }
        this.isSetup = false;
    }
}

