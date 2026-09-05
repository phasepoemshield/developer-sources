/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.textures.FilterMode
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  minecraft.class03386
 *  minecraft.class05630
 *  minecraft.class06202
 *  minecraft.class06532
 *  minecraft.class08188
 *  minecraft.class08193
 *  minecraft.class08626
 *  minecraft.class08893
 *  net.caffeinemc.mods.sodium.client.gl.buffer.GlBuffer
 *  net.caffeinemc.mods.sodium.client.gl.device.GLRenderDevice
 *  net.caffeinemc.mods.sodium.client.gl.shader.uniform.GlUniformBlock
 *  net.caffeinemc.mods.sodium.client.gl.shader.uniform.GlUniformBool
 *  net.caffeinemc.mods.sodium.client.gl.shader.uniform.GlUniformFloat
 *  net.caffeinemc.mods.sodium.client.gl.shader.uniform.GlUniformFloat2v
 *  net.caffeinemc.mods.sodium.client.gl.shader.uniform.GlUniformFloat3v
 *  net.caffeinemc.mods.sodium.client.gl.shader.uniform.GlUniformInt
 *  net.caffeinemc.mods.sodium.client.gl.shader.uniform.GlUniformMatrix4f
 *  net.caffeinemc.mods.sodium.client.util.FogParameters
 *  net.caffeinemc.mods.sodium.mixin.core.render.texture.TextureAtlasAccessor
 *  org.joml.Matrix4fc
 *  org.lwjgl.opengl.GL33C
 */
package net.caffeinemc.mods.sodium.client.render.chunk.shader;

import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTextureView;
import java.util.EnumMap;
import java.util.Map;
import minecraft.class03386;
import minecraft.class05630;
import minecraft.class06202;
import minecraft.class06532;
import minecraft.class08188;
import minecraft.class08193;
import minecraft.class08626;
import minecraft.class08893;
import net.caffeinemc.mods.sodium.client.gl.buffer.GlBuffer;
import net.caffeinemc.mods.sodium.client.gl.device.GLRenderDevice;
import net.caffeinemc.mods.sodium.client.gl.shader.uniform.GlUniformBlock;
import net.caffeinemc.mods.sodium.client.gl.shader.uniform.GlUniformBool;
import net.caffeinemc.mods.sodium.client.gl.shader.uniform.GlUniformFloat;
import net.caffeinemc.mods.sodium.client.gl.shader.uniform.GlUniformFloat2v;
import net.caffeinemc.mods.sodium.client.gl.shader.uniform.GlUniformFloat3v;
import net.caffeinemc.mods.sodium.client.gl.shader.uniform.GlUniformInt;
import net.caffeinemc.mods.sodium.client.gl.shader.uniform.GlUniformMatrix4f;
import net.caffeinemc.mods.sodium.client.render.chunk.shader.ChunkShaderFogComponent;
import net.caffeinemc.mods.sodium.client.render.chunk.shader.ChunkShaderInterface;
import net.caffeinemc.mods.sodium.client.render.chunk.shader.ChunkShaderOptions;
import net.caffeinemc.mods.sodium.client.render.chunk.shader.ChunkShaderTextureSlot;
import net.caffeinemc.mods.sodium.client.render.chunk.shader.ShaderBindingContext;
import net.caffeinemc.mods.sodium.client.render.chunk.terrain.TerrainRenderPass;
import net.caffeinemc.mods.sodium.client.util.FogParameters;
import net.caffeinemc.mods.sodium.mixin.core.render.texture.TextureAtlasAccessor;
import org.joml.Matrix4fc;
import org.lwjgl.opengl.GL33C;

public class DefaultShaderInterface
implements ChunkShaderInterface {
    private final Map<ChunkShaderTextureSlot, GlUniformInt> uniformTextures;
    private final GlUniformMatrix4f uniformModelViewMatrix;
    private final GlUniformMatrix4f uniformProjectionMatrix;
    private final GlUniformFloat3v uniformRegionOffset;
    private final GlUniformFloat2v uniformTexCoordShrink;
    private final GlUniformFloat2v uniformTexelSize;
    private final GlUniformBool uniformRGSS;
    private final GlUniformInt uniformCurrentTime;
    private final GlUniformFloat uniformFadePeriod;
    private final GlUniformBlock uniformChunkData;
    private final ChunkShaderFogComponent fogShader;

    public DefaultShaderInterface(ShaderBindingContext shaderBindingContext, ChunkShaderOptions chunkShaderOptions) {
        this.uniformModelViewMatrix = shaderBindingContext.bindUniform("u_ModelViewMatrix", GlUniformMatrix4f::new);
        this.uniformProjectionMatrix = shaderBindingContext.bindUniform("u_ProjectionMatrix", GlUniformMatrix4f::new);
        this.uniformRegionOffset = shaderBindingContext.bindUniform("u_RegionOffset", GlUniformFloat3v::new);
        this.uniformTexCoordShrink = shaderBindingContext.bindUniform("u_TexCoordShrink", GlUniformFloat2v::new);
        this.uniformTexelSize = shaderBindingContext.bindUniform("u_TexelSize", GlUniformFloat2v::new);
        this.uniformRGSS = shaderBindingContext.bindUniform("u_UseRGSS", GlUniformBool::new);
        this.uniformCurrentTime = shaderBindingContext.bindUniform("u_CurrentTime", GlUniformInt::new);
        this.uniformFadePeriod = shaderBindingContext.bindUniform("u_FadePeriodInv", GlUniformFloat::new);
        this.uniformChunkData = shaderBindingContext.bindUniformBlock("ChunkData", 0);
        this.uniformTextures = new EnumMap<ChunkShaderTextureSlot, GlUniformInt>(ChunkShaderTextureSlot.class);
        this.uniformTextures.put(ChunkShaderTextureSlot.BLOCK, shaderBindingContext.bindUniform("u_BlockTex", GlUniformInt::new));
        this.uniformTextures.put(ChunkShaderTextureSlot.LIGHT, shaderBindingContext.bindUniform("u_LightTex", GlUniformInt::new));
        this.fogShader = chunkShaderOptions.fog().getFactory().apply(shaderBindingContext);
    }

    @Override
    public void resetState() {
    }

    @Deprecated(forRemoval=true)
    private void bindTexture(ChunkShaderTextureSlot chunkShaderTextureSlot, GpuTextureView gpuTextureView, class08188 class081882) {
        class08893 class088932 = (class08893)gpuTextureView.texture();
        GlStateManager._activeTexture((int)(33984 + chunkShaderTextureSlot.ordinal()));
        GlStateManager._bindTexture((int)class088932.N());
        GlStateManager._texParameter((int)3553, (int)33084, (int)gpuTextureView.baseMipLevel());
        GlStateManager._texParameter((int)3553, (int)33085, (int)(gpuTextureView.baseMipLevel() + gpuTextureView.mipLevels() - 1));
        GL33C.glBindSampler((int)chunkShaderTextureSlot.ordinal(), (int)((class08193)class081882).N());
        GlUniformInt glUniformInt = this.uniformTextures.get((Object)chunkShaderTextureSlot);
        glUniformInt.setInt(chunkShaderTextureSlot.ordinal());
    }

    @Override
    public void setProjectionMatrix(Matrix4fc matrix4fc) {
        this.uniformProjectionMatrix.set(matrix4fc);
    }

    @Override
    public void setRegionOffset(float f, float f2, float f3) {
        this.uniformRegionOffset.set(f, f2, f3);
    }

    @Override
    public void setChunkData(GlBuffer glBuffer, int n) {
        this.uniformChunkData.bindBuffer(glBuffer);
        this.uniformCurrentTime.set(Integer.valueOf(n));
    }

    @Override
    public void setModelViewMatrix(Matrix4fc matrix4fc) {
        this.uniformModelViewMatrix.set(matrix4fc);
    }

    @Override
    public void setupState(TerrainRenderPass terrainRenderPass, FogParameters fogParameters, class08188 class081882) {
        this.bindTexture(ChunkShaderTextureSlot.BLOCK, terrainRenderPass.getAtlas(), class081882);
        this.bindTexture(ChunkShaderTextureSlot.LIGHT, ((class03386)class06202.Nq().i_5).T().N(), RenderSystem.getSamplerCache().N(FilterMode.LINEAR));
        TextureAtlasAccessor textureAtlasAccessor = (TextureAtlasAccessor)class06202.Nq().NO().y(class08626.N);
        double d = 1 << GLRenderDevice.INSTANCE.getSubTexelPrecisionBits();
        double d2 = 3.0517578125E-5;
        this.uniformTexCoordShrink.set((float)(d2 - 1.0 / (double)textureAtlasAccessor.sodium$getWidth() / d), (float)(d2 - 1.0 / (double)textureAtlasAccessor.sodium$getHeight() / d));
        this.uniformTexelSize.set(1.0f / (float)textureAtlasAccessor.sodium$getWidth(), 1.0f / (float)textureAtlasAccessor.sodium$getHeight());
        this.uniformFadePeriod.setFloat((float)(1.0 / ((Double)((class05630)class06202.Nq().i_7).b().method_41753() * 1000.0)));
        this.uniformRGSS.setBool(((class05630)class06202.Nq().i_7).c().method_41753() == class06532.field_64664);
        this.fogShader.setup(fogParameters);
    }
}

