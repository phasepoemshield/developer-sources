/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.textures.AddressMode
 *  com.mojang.blaze3d.textures.FilterMode
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  minecraft.class03386
 *  minecraft.class05630
 *  minecraft.class06202
 *  minecraft.class06532
 *  minecraft.class08188
 *  minecraft.class08193
 *  minecraft.class08626
 *  net.caffeinemc.mods.sodium.client.gl.buffer.GlBuffer
 *  net.caffeinemc.mods.sodium.client.gl.device.GLRenderDevice
 *  net.caffeinemc.mods.sodium.client.gl.shader.uniform.GlUniformBlock
 *  net.caffeinemc.mods.sodium.client.gl.shader.uniform.GlUniformFloat2v
 *  net.caffeinemc.mods.sodium.client.gl.shader.uniform.GlUniformFloat3v
 *  net.caffeinemc.mods.sodium.client.gl.shader.uniform.GlUniformInt
 *  net.caffeinemc.mods.sodium.client.gl.shader.uniform.GlUniformMatrix4f
 *  net.caffeinemc.mods.sodium.client.render.chunk.shader.ChunkShaderInterface
 *  net.caffeinemc.mods.sodium.client.render.chunk.shader.ShaderBindingContext
 *  net.caffeinemc.mods.sodium.client.render.chunk.terrain.TerrainRenderPass
 *  net.caffeinemc.mods.sodium.client.util.FogParameters
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.features.FeatureFlags
 *  net.irisshaders.iris.gl.IrisRenderSystem
 *  net.irisshaders.iris.gl.blending.BlendModeOverride
 *  net.irisshaders.iris.gl.blending.BufferBlendOverride
 *  net.irisshaders.iris.gl.blending.DepthColorStorage
 *  net.irisshaders.iris.gl.image.ImageHolder
 *  net.irisshaders.iris.gl.program.ProgramImages
 *  net.irisshaders.iris.gl.program.ProgramImages$Builder
 *  net.irisshaders.iris.gl.program.ProgramSamplers
 *  net.irisshaders.iris.gl.program.ProgramSamplers$Builder
 *  net.irisshaders.iris.gl.program.ProgramUniforms
 *  net.irisshaders.iris.gl.program.ProgramUniforms$Builder
 *  net.irisshaders.iris.gl.sampler.SamplerHolder
 *  net.irisshaders.iris.gl.state.FogMode
 *  net.irisshaders.iris.gl.uniform.DynamicUniformHolder
 *  net.irisshaders.iris.gl.uniform.LocationalUniformHolder
 *  net.irisshaders.iris.gl.uniform.UniformHolder
 *  net.irisshaders.iris.mixin.texture.TextureAtlasAccessor
 *  net.irisshaders.iris.uniforms.CapturedRenderingState
 *  net.irisshaders.iris.uniforms.CommonUniforms
 *  net.irisshaders.iris.uniforms.builtin.BuiltinReplacementUniforms
 *  net.irisshaders.iris.uniforms.custom.CustomUniforms
 *  net.irisshaders.iris.vertices.ImmediateState
 *  org.joml.Matrix3f
 *  org.joml.Matrix3fc
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.lwjgl.opengl.GL33C
 */
package net.irisshaders.iris.pipeline.programs;

import com.google.common.collect.ImmutableSet;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.AddressMode;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTextureView;
import java.util.List;
import java.util.Locale;
import java.util.function.Supplier;
import minecraft.class03386;
import minecraft.class05630;
import minecraft.class06202;
import minecraft.class06532;
import minecraft.class08188;
import minecraft.class08193;
import minecraft.class08626;
import net.caffeinemc.mods.sodium.client.gl.buffer.GlBuffer;
import net.caffeinemc.mods.sodium.client.gl.device.GLRenderDevice;
import net.caffeinemc.mods.sodium.client.gl.shader.uniform.GlUniformBlock;
import net.caffeinemc.mods.sodium.client.gl.shader.uniform.GlUniformFloat2v;
import net.caffeinemc.mods.sodium.client.gl.shader.uniform.GlUniformFloat3v;
import net.caffeinemc.mods.sodium.client.gl.shader.uniform.GlUniformInt;
import net.caffeinemc.mods.sodium.client.gl.shader.uniform.GlUniformMatrix4f;
import net.caffeinemc.mods.sodium.client.render.chunk.shader.ChunkShaderInterface;
import net.caffeinemc.mods.sodium.client.render.chunk.shader.ShaderBindingContext;
import net.caffeinemc.mods.sodium.client.render.chunk.terrain.TerrainRenderPass;
import net.caffeinemc.mods.sodium.client.util.FogParameters;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.features.FeatureFlags;
import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.gl.blending.BlendModeOverride;
import net.irisshaders.iris.gl.blending.BufferBlendOverride;
import net.irisshaders.iris.gl.blending.DepthColorStorage;
import net.irisshaders.iris.gl.image.ImageHolder;
import net.irisshaders.iris.gl.program.ProgramImages;
import net.irisshaders.iris.gl.program.ProgramSamplers;
import net.irisshaders.iris.gl.program.ProgramUniforms;
import net.irisshaders.iris.gl.sampler.SamplerHolder;
import net.irisshaders.iris.gl.state.FogMode;
import net.irisshaders.iris.gl.uniform.DynamicUniformHolder;
import net.irisshaders.iris.gl.uniform.LocationalUniformHolder;
import net.irisshaders.iris.gl.uniform.UniformHolder;
import net.irisshaders.iris.mixin.texture.TextureAtlasAccessor;
import net.irisshaders.iris.pipeline.IrisRenderingPipeline;
import net.irisshaders.iris.pipeline.WorldRenderingPipeline;
import net.irisshaders.iris.pipeline.programs.GlUniformMatrix3f;
import net.irisshaders.iris.pipeline.programs.SodiumPrograms$Pass;
import net.irisshaders.iris.samplers.IrisSamplers;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import net.irisshaders.iris.uniforms.CommonUniforms;
import net.irisshaders.iris.uniforms.builtin.BuiltinReplacementUniforms;
import net.irisshaders.iris.uniforms.custom.CustomUniforms;
import net.irisshaders.iris.vertices.ImmediateState;
import org.joml.Matrix3f;
import org.joml.Matrix3fc;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.lwjgl.opengl.GL33C;

public class SodiumShader
implements ChunkShaderInterface {
    private static final int SUB_TEXEL_PRECISION_BITS = 5;
    private final GlUniformMatrix4f uniformModelViewMatrix;
    private final GlUniformMatrix4f uniformModelViewMatrixInv;
    private final GlUniformMatrix4f uniformProjectionMatrix;
    private final GlUniformMatrix4f uniformProjectionMatrixInv;
    private final GlUniformMatrix3f uniformNormalMatrix;
    private final GlUniformFloat3v uniformRegionOffset;
    private final GlUniformFloat2v uniformTexCoordShrink;
    private final ProgramImages images;
    private final ProgramSamplers samplers;
    private final ProgramUniforms uniforms;
    private final CustomUniforms customUniforms;
    private final BlendModeOverride blendModeOverride;
    private final List<BufferBlendOverride> bufferBlendOverrides;
    private final float alphaTest;
    private final boolean containsTessellation;
    private final boolean anisotropySupported;
    private boolean isShadowPass;
    private final GlUniformFloat2v uniformTexelSize;
    private final GlUniformInt uniformCurrentTime;
    private final GlUniformBlock uniformChunkData;

    public SodiumShader(IrisRenderingPipeline irisRenderingPipeline, SodiumPrograms$Pass sodiumPrograms$Pass, ShaderBindingContext shaderBindingContext, int n, BlendModeOverride blendModeOverride, List<BufferBlendOverride> list, CustomUniforms customUniforms, Supplier<ImmutableSet<Integer>> supplier, float f, boolean bl) {
        this.anisotropySupported = irisRenderingPipeline.hasFeature(FeatureFlags.TEXTURE_FILTERING);
        this.uniformModelViewMatrix = (GlUniformMatrix4f)shaderBindingContext.bindUniformOptional("iris_ModelViewMatrix", GlUniformMatrix4f::new);
        this.uniformModelViewMatrixInv = (GlUniformMatrix4f)shaderBindingContext.bindUniformOptional("iris_ModelViewMatrixInverse", GlUniformMatrix4f::new);
        this.uniformNormalMatrix = (GlUniformMatrix3f)shaderBindingContext.bindUniformOptional("iris_NormalMatrix", GlUniformMatrix3f::new);
        this.uniformProjectionMatrix = (GlUniformMatrix4f)shaderBindingContext.bindUniformOptional("iris_ProjectionMatrix", GlUniformMatrix4f::new);
        this.uniformProjectionMatrixInv = (GlUniformMatrix4f)shaderBindingContext.bindUniformOptional("iris_ProjectionMatrixInv", GlUniformMatrix4f::new);
        this.uniformRegionOffset = (GlUniformFloat3v)shaderBindingContext.bindUniformOptional("u_RegionOffset", GlUniformFloat3v::new);
        this.uniformTexCoordShrink = (GlUniformFloat2v)shaderBindingContext.bindUniformOptional("u_TexCoordShrink", GlUniformFloat2v::new);
        this.uniformCurrentTime = (GlUniformInt)shaderBindingContext.bindUniformOptional("iris_CurrentTime", GlUniformInt::new);
        this.uniformTexelSize = (GlUniformFloat2v)shaderBindingContext.bindUniformOptional("iris_TexelSize", GlUniformFloat2v::new);
        this.uniformChunkData = shaderBindingContext.bindUniformBlockOptional("iris_ChunkData", 0);
        this.alphaTest = f;
        this.containsTessellation = bl;
        this.isShadowPass = sodiumPrograms$Pass == SodiumPrograms$Pass.SHADOW || sodiumPrograms$Pass == SodiumPrograms$Pass.SHADOW_CUTOUT;
        this.uniforms = this.buildUniforms(sodiumPrograms$Pass, n, customUniforms);
        this.customUniforms = customUniforms;
        this.samplers = this.buildSamplers(irisRenderingPipeline, sodiumPrograms$Pass, n, this.isShadowPass, supplier);
        this.images = this.buildImages(irisRenderingPipeline, sodiumPrograms$Pass, n, this.isShadowPass, supplier);
        this.blendModeOverride = blendModeOverride;
        this.bufferBlendOverrides = list;
    }

    public void resetState() {
        ProgramUniforms.clearActiveUniforms();
        ProgramSamplers.clearActiveSamplers();
        BlendModeOverride.restore();
        ImmediateState.usingTessellation = false;
    }

    public void setProjectionMatrix(Matrix4fc matrix4fc) {
        if (this.uniformProjectionMatrix != null) {
            this.uniformProjectionMatrix.set(matrix4fc);
        }
        if (this.uniformProjectionMatrixInv != null) {
            Matrix4f matrix4f = matrix4fc.invert(new Matrix4f());
            this.uniformProjectionMatrixInv.set((Matrix4fc)matrix4f);
        }
    }

    private void updateUniforms() {
        CapturedRenderingState.INSTANCE.setCurrentAlphaTest(this.alphaTest);
        this.samplers.update();
        this.uniforms.update();
        this.customUniforms.push((Object)this);
    }

    private void applyBlendModes() {
        if (this.blendModeOverride != null) {
            this.blendModeOverride.apply();
        }
        this.bufferBlendOverrides.forEach(BufferBlendOverride::apply);
    }

    private ProgramSamplers buildSamplers(IrisRenderingPipeline irisRenderingPipeline, SodiumPrograms$Pass sodiumPrograms$Pass, int n, boolean bl, Supplier<ImmutableSet<Integer>> supplier) {
        ProgramSamplers.Builder builder = ProgramSamplers.builder((int)n, IrisSamplers.SODIUM_RESERVED_TEXTURE_UNITS);
        irisRenderingPipeline.addGbufferOrShadowSamplers((SamplerHolder)builder, (ImageHolder)ProgramImages.builder((int)n), supplier, bl, true, true, false);
        return builder.build();
    }

    private ProgramImages buildImages(IrisRenderingPipeline irisRenderingPipeline, SodiumPrograms$Pass sodiumPrograms$Pass, int n, boolean bl, Supplier<ImmutableSet<Integer>> supplier) {
        ProgramImages.Builder builder = ProgramImages.builder((int)n);
        irisRenderingPipeline.addGbufferOrShadowSamplers((SamplerHolder)ProgramSamplers.builder((int)n, IrisSamplers.SODIUM_RESERVED_TEXTURE_UNITS), (ImageHolder)builder, supplier, bl, true, true, false);
        return builder.build();
    }

    private void bindTextures(GpuTextureView gpuTextureView, class08193 class081932) {
        IrisRenderSystem.bindTextureToUnit((int)3553, (int)0, (int)gpuTextureView.texture().iris$getGlId());
        GlStateManager._activeTexture((int)33984);
        GlStateManager._texParameter((int)3553, (int)33084, (int)gpuTextureView.baseMipLevel());
        GlStateManager._texParameter((int)3553, (int)33085, (int)(gpuTextureView.baseMipLevel() + gpuTextureView.mipLevels() - 1));
        GL33C.glBindSampler((int)0, (int)class081932.N());
        GpuTextureView gpuTextureView2 = ((class03386)class06202.Nq().i_5).T().N();
        GL33C.glBindSampler((int)2, (int)((class08193)RenderSystem.getSamplerCache().N(AddressMode.CLAMP_TO_EDGE, AddressMode.CLAMP_TO_EDGE, FilterMode.LINEAR, FilterMode.LINEAR, false)).N());
        IrisRenderSystem.bindTextureToUnit((int)3553, (int)2, (int)gpuTextureView2.texture().iris$getGlId());
        GlStateManager._activeTexture((int)33986);
    }

    public void setRegionOffset(float f, float f2, float f3) {
        if (this.uniformRegionOffset != null) {
            this.uniformRegionOffset.set(f, f2, f3);
        }
    }

    public void setChunkData(GlBuffer glBuffer, int n) {
        if (this.uniformChunkData != null) {
            this.uniformChunkData.bindBuffer(glBuffer);
        }
        if (this.uniformCurrentTime != null) {
            this.uniformCurrentTime.set(Integer.valueOf(n));
        }
    }

    public void setModelViewMatrix(Matrix4fc matrix4fc) {
        if (this.uniformModelViewMatrix != null) {
            this.uniformModelViewMatrix.set(matrix4fc);
        }
        Matrix4f matrix4f = matrix4fc.invert(new Matrix4f());
        if (this.uniformModelViewMatrixInv != null) {
            this.uniformModelViewMatrixInv.set((Matrix4fc)matrix4f);
        }
        if (this.uniformNormalMatrix != null) {
            Matrix3f matrix3f = matrix4f.transpose3x3(new Matrix3f());
            this.uniformNormalMatrix.set((Matrix3fc)matrix3f);
        }
    }

    private ProgramUniforms buildUniforms(SodiumPrograms$Pass sodiumPrograms$Pass, int n, CustomUniforms customUniforms) {
        ProgramUniforms.Builder builder = ProgramUniforms.builder((String)sodiumPrograms$Pass.name().toLowerCase(Locale.ROOT), (int)n);
        CommonUniforms.addDynamicUniforms((DynamicUniformHolder)builder, (FogMode)FogMode.PER_VERTEX);
        customUniforms.assignTo((LocationalUniformHolder)builder);
        BuiltinReplacementUniforms.addBuiltinReplacementUniforms((UniformHolder)builder);
        customUniforms.mapholderToPass((LocationalUniformHolder)builder, (Object)this);
        return builder.buildUniforms();
    }

    public void setupState(TerrainRenderPass terrainRenderPass, FogParameters fogParameters, class08188 class081882) {
        IrisRenderingPipeline irisRenderingPipeline;
        DepthColorStorage.unlockDepthColor();
        this.applyBlendModes();
        WorldRenderingPipeline worldRenderingPipeline = Iris.getPipelineManager().getPipelineNullable();
        if (worldRenderingPipeline instanceof IrisRenderingPipeline) {
            irisRenderingPipeline = (IrisRenderingPipeline)worldRenderingPipeline;
            irisRenderingPipeline.onSetAlbedoTex(terrainRenderPass.getAtlas());
        }
        this.updateUniforms();
        this.images.update();
        if (this.isShadowPass) {
            GlStateManager._disableCull();
        }
        irisRenderingPipeline = class06202.Nq().NO().y(class08626.N);
        double d = 1 << GLRenderDevice.INSTANCE.getSubTexelPrecisionBits();
        double d2 = 3.0517578125E-5;
        if (this.uniformTexCoordShrink != null) {
            this.uniformTexCoordShrink.set((float)(d2 - 1.0 / (double)((TextureAtlasAccessor)irisRenderingPipeline).callGetWidth() / d), (float)(d2 - 1.0 / (double)((TextureAtlasAccessor)irisRenderingPipeline).callGetHeight() / d));
        }
        if (this.uniformTexelSize != null) {
            this.uniformTexelSize.set((float)(1.0 / (double)irisRenderingPipeline.method_68004().getWidth(0)), (float)(1.0 / (double)irisRenderingPipeline.method_68004().getHeight(0)));
        }
        int n = ((class05630)class06202.Nq().i_7).c().method_41753() == class06532.field_64665 ? ((class05630)class06202.Nq().i_7).H() : 1;
        this.bindTextures(terrainRenderPass.getAtlas(), (class08193)IrisSamplers.getTerrainCache(n));
        if (this.containsTessellation) {
            ImmediateState.usingTessellation = true;
        }
    }
}

