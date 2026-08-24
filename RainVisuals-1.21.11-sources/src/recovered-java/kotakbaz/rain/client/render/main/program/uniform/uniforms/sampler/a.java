/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  net.minecraft.client.texture.GlTexture
 *  net.minecraft.client.texture.GlTextureView
 *  org.lwjgl.opengl.GL11
 */
package kotakbaz.rain.client.render.main.program.uniform.uniforms.sampler;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.util.function.BiConsumer;
import kotakbaz.rain.client.render.main.program.uniform.uniforms.sampler.SamplerUniform;
import kotakbaz.rain.client.render.texture.GlTex;
import net.minecraft.client.texture.GlTexture;
import net.minecraft.client.texture.GlTextureView;
import org.lwjgl.opengl.GL11;

public record a<T>(BiConsumer<SamplerUniform, T> uploadConsumer) {
    public static final a<GlTex> GL_TEX = new a<GlTex>((samplerUniform, glTex) -> {
        GlStateManager._activeTexture((int)(33984 + samplerUniform.getSamplerId()));
        GlStateManager._bindTexture((int)glTex.getTexId());
    });
    public static final a<GlTexture> GL_TEXTURE;
    public static final a<GlTextureView> GL_TEXTURE_VIEW;
    public static final a<Integer> TEXTURE_ID;

    static {
        GL_TEXTURE_VIEW = new a<GlTextureView>((samplerUniform, glTextureView) -> {
            int o;
            GlStateManager._activeTexture((int)(33984 + samplerUniform.getSamplerId()));
            GlTexture glTexture = glTextureView.texture();
            if ((glTexture.usage() & 0x10) != 0) {
                o = 34067;
                GL11.glBindTexture((int)34067, (int)glTexture.getGlId());
            } else {
                o = 3553;
                GlStateManager._bindTexture((int)glTexture.getGlId());
            }
            GlStateManager._texParameter((int)o, (int)33084, (int)glTextureView.baseMipLevel());
            GlStateManager._texParameter((int)o, (int)33085, (int)(glTextureView.baseMipLevel() + glTextureView.mipLevels() - 1));
        });
        GL_TEXTURE = new a<GlTexture>((samplerUniform, glTexture) -> {
            GlStateManager._activeTexture((int)(33984 + samplerUniform.getSamplerId()));
            if ((glTexture.usage() & 0x10) != 0) {
                int o = 34067;
                GL11.glBindTexture((int)o, (int)glTexture.getGlId());
            } else {
                GlStateManager._bindTexture((int)glTexture.getGlId());
            }
        });
        TEXTURE_ID = new a<Integer>((samplerUniform, id) -> {
            GlStateManager._activeTexture((int)(33984 + samplerUniform.getSamplerId()));
            GlStateManager._bindTexture((int)id);
        });
    }
}

