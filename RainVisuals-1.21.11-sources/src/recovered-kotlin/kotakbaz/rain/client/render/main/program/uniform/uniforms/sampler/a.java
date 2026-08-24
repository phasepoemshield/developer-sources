package kotakbaz.rain.client.render.main.program.uniform.uniforms.sampler;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.util.function.BiConsumer;
import kotakbaz.rain.client.render.texture.GlTex;
import net.minecraft.client.texture.GlTexture;
import net.minecraft.client.texture.GlTextureView;
import org.lwjgl.opengl.GL11;

// $VF: Compiled from heavy
public record a<T>(BiConsumer<SamplerUniform, T> uploadConsumer) {
   public static final a<GlTex> GL_TEX = new a<>((samplerUniform, glTex) -> {
      GlStateManager._activeTexture(33984 + samplerUniform.getSamplerId());
      GlStateManager._bindTexture(glTex.getTexId());
   });
   public static final a<GlTexture> GL_TEXTURE = new a<>((samplerUniform, glTexture) -> {
      GlStateManager._activeTexture(33984 + samplerUniform.getSamplerId());
      if ((glTexture.usage() & 16) != 0) {
         int o = 34067;
         GL11.glBindTexture(o, glTexture.getGlId());
      } else {
         GlStateManager._bindTexture(glTexture.getGlId());
      }
   });
   public static final a<GlTextureView> GL_TEXTURE_VIEW = new a<>((samplerUniform, glTextureView) -> {
      GlStateManager._activeTexture(33984 + samplerUniform.getSamplerId());
      GlTexture glTexture = glTextureView.texture();
      char o;
      if ((glTexture.usage() & 16) != 0) {
         o = '蔓';
         GL11.glBindTexture(34067, glTexture.getGlId());
      } else {
         o = 3553;
         GlStateManager._bindTexture(glTexture.getGlId());
      }

      GlStateManager._texParameter(o, 33084, glTextureView.baseMipLevel());
      GlStateManager._texParameter(o, 33085, glTextureView.baseMipLevel() + glTextureView.mipLevels() - 1);
   });
   public static final a<Integer> TEXTURE_ID = new a<>((samplerUniform, id) -> {
      GlStateManager._activeTexture(33984 + samplerUniform.getSamplerId());
      GlStateManager._bindTexture(id);
   });
}
