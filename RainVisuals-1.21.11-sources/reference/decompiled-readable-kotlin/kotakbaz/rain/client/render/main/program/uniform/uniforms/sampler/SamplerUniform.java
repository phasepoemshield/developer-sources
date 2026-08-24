package kotakbaz.rain.client.render.main.program.uniform.uniforms.sampler;

import com.mojang.blaze3d.opengl.GlStateManager;
import kotakbaz.rain.client.render.main.program.GlProgram;
import kotakbaz.rain.client.render.texture.GlTex;
import lombok.Generated;
import net.minecraft.client.texture.GlTexture;
import net.minecraft.client.texture.GlTextureView;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;
import oxxxde.طي;

// $VF: Compiled from heavy
public class SamplerUniform extends طي {
   private static final byte GL_TEX = 1;
   private int textureId;
   private static final byte NONE = 0;
   private final int samplerId;
   private a<Object> customUploader;
   private byte valueType = 0;
   private GlTexture glTexture;
   private GlTextureView glTextureView;
   private static final byte CUSTOM = 5;
   private static final byte TEXTURE_ID = 4;
   private Object customTexture;
   private static final byte GL_TEXTURE_VIEW = 2;
   private GlTex glTex;
   private static final byte GL_TEXTURE = 3;

   public void set(GlTexture texture) {
      this.valueType = 3;
      this.glTexture = texture;
      this.program.addUpdatedUniform(this);
   }

   @Override
   public void upload() {
      if (this.valueType != 0) {
         GL20.glUniform1i(this.location, this.getSamplerId());
         switch (this.valueType) {
            case 1:
               GlStateManager._activeTexture(33984 + this.samplerId);
               GlStateManager._bindTexture(this.glTex.getTexId());
               break;
            case 2:
               GlStateManager._activeTexture(33984 + this.samplerId);
               GlTexture texture = this.glTextureView.texture();
               int target;
               if ((texture.usage() & 16) != 0) {
                  target = 34067;
                  GL11.glBindTexture(target, texture.getGlId());
               } else {
                  target = 3553;
                  GlStateManager._bindTexture(texture.getGlId());
               }

               GlStateManager._texParameter(target, 33084, this.glTextureView.baseMipLevel());
               GlStateManager._texParameter(target, 33085, this.glTextureView.baseMipLevel() + this.glTextureView.mipLevels() - 1);
               break;
            case 3:
               GlStateManager._activeTexture(33984 + this.samplerId);
               if ((this.glTexture.usage() & 16) != 0) {
                  GL11.glBindTexture(34067, this.glTexture.getGlId());
               } else {
                  GlStateManager._bindTexture(this.glTexture.getGlId());
               }
               break;
            case 4:
               GlStateManager._activeTexture(33984 + this.samplerId);
               GlStateManager._bindTexture(this.textureId);
               break;
            case 5:
               if (this.customUploader != null) {
                  this.customUploader.uploadConsumer().accept(this, this.customTexture);
               }
         }
      }
   }

   public SamplerUniform(String name, int glProgram, GlProgram location) {
      super(name, location, glProgram);
      this.samplerId = glProgram.getSamplersAmount() + 1;
      glProgram.setSamplersAmount(this.samplerId);
   }

   public void set(GlTextureView textureView) {
      this.valueType = 2;
      this.glTextureView = textureView;
      this.program.addUpdatedUniform(this);
   }

   @Generated
   public int getSamplerId() {
      return this.samplerId;
   }

   public void set(int textureId) {
      this.valueType = 4;
      this.textureId = textureId;
      this.program.addUpdatedUniform(this);
   }

   public void set(GlTex texture) {
      this.valueType = 1;
      this.glTex = texture;
      this.program.addUpdatedUniform(this);
   }

   public <T> void set(a<T> applier, T texture) {
      this.setUnchecked(applier, texture);
   }

   private <T> void setUnchecked(a<T> uploader, T texture) {
      this.valueType = 5;
      this.customUploader = uploader;
      this.customTexture = texture;
      this.program.addUpdatedUniform(this);
   }
}
