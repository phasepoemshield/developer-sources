package kotakbaz.rain.client.render.texture.texture;

import java.util.Random;
import kotakbaz.rain.client.render.texture.GlTex;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;
import org.lwjgl.stb.STBImage;
import org.lwjgl.system.MemoryUtil;
import oxxxde.جش;
import oxxxde.ذن;
import oxxxde.زآ;
import oxxxde.شأ;
import oxxxde.ضو;
import oxxxde.ضّ;

// $VF: Compiled from heavy
public class GLTexture implements GlTex {
   protected int width;
   protected زآ filtering;
   protected ضو colorMode;
   protected جش wrapping;
   protected final String name;
   protected int height;
   protected int texId;

   public GLTexture subTexture(float v1, float u2, float v2, float u1) {
      ضّ controller = شأ.getGlController();
      GLTexture texture = new GLTexture(this.name.concat(String.format("_sub_%s", new Random().nextInt())));
      controller.run(() -> {
         texture.texId = controller.genTexId();
         int fbo = GL30.glGenFramebuffers();
         GL30.glBindFramebuffer(36160, fbo);
         GL30.glFramebufferTexture2D(36160, 36064, 3553, this.texId, 0);
         if (GL30.glCheckFramebufferStatus(36160) != 36053) {
            throw new RuntimeException(String.format("An error occurred while creating FrameBuffer for subtexture '%s'.", texture.getName()));
         }

         texture.width = (int)((u2 - u1) * this.width);
         texture.height = (int)((v2 - v1) * this.height);
         controller.bindTexture(texture.texId);
         controller.texParameter(3553, 33085, 0);
         controller.texParameter(3553, 33082, 0);
         controller.texParameter(3553, 33083, 0);
         controller.texParameter(3553, 34049, 0.0F);
         texture.applyFiltering(controller, this.filtering);
         texture.applyWrapping(controller, this.wrapping);
         texture.colorMode = this.colorMode;
         controller.texImage2D(3553, 0, texture.colorMode.glId, texture.width, texture.height, 0, texture.colorMode.glId, 5121, null);
         controller.pixelStore(3314, 0);
         controller.pixelStore(3316, 0);
         controller.pixelStore(3315, 0);
         controller.pixelStore(3317, 4);
         GL11.glCopyTexSubImage2D(3553, 0, 0, 0, (int)(u1 * this.width), (int)(v1 * this.height), texture.width, texture.height);
         controller.bindTexture(0);
         GL30.glBindFramebuffer(36160, 0);
         GL30.glDeleteFramebuffers(fbo);
      });
      return texture;
   }

   private void applyFiltering(ضّ controller, زآ textureFiltering) {
      controller.texParameter(3553, 10240, textureFiltering.id);
      controller.texParameter(3553, 10241, textureFiltering.id);
      this.filtering = textureFiltering;
   }

   @Override
   public void bind() {
      شأ.getGlController().bindTexture(this.getTexId());
   }

   @Override
   public void delete() {
      شأ.getGlController().deleteTexture(this.texId);
      شأ.removeTexture(this);
   }

   @Override
   public int getHeight() {
      return this.height;
   }

   private GLTexture create(ذن glTextureInfo) {
      ضّ controller = شأ.getGlController();
      controller.run(() -> {
         this.texId = controller.genTexId();
         long bufferAddress = MemoryUtil.memAddress(glTextureInfo.getPixels());
         this.width = glTextureInfo.getWidth();
         this.height = glTextureInfo.getHeight();
         controller.bindTexture(this.texId);
         controller.texParameter(3553, 33085, 0);
         controller.texParameter(3553, 33082, 0);
         controller.texParameter(3553, 33083, 0);
         controller.texParameter(3553, 34049, 0.0F);
         this.applyFiltering(controller, glTextureInfo.getFiltering());
         this.applyWrapping(controller, glTextureInfo.getWrapping());
         this.colorMode = glTextureInfo.getColorMode();
         controller.texImage2D(3553, 0, glTextureInfo.getColorMode().glId, this.width, this.height, 0, glTextureInfo.getColorMode().glId, 5121, null);
         controller.pixelStore(3314, 0);
         controller.pixelStore(3316, 0);
         controller.pixelStore(3315, 0);
         controller.pixelStore(3317, 4);
         controller.texSubImage2D(3553, 0, 0, 0, this.width, this.height, glTextureInfo.getColorMode().glId, 5121, bufferAddress);
         controller.bindTexture(0);
         if (glTextureInfo.isUsingStb()) {
            STBImage.nstbi_image_free(bufferAddress);
         } else {
            MemoryUtil.memFree(glTextureInfo.getPixels());
         }
      });
      return this;
   }

   private void applyWrapping(ضّ controller, جش textureWrapping) {
      controller.texParameter(3553, 10242, textureWrapping.id);
      controller.texParameter(3553, 10243, textureWrapping.id);
      this.wrapping = textureWrapping;
   }

   protected GLTexture(String name) {
      this.name = name;
      شأ.addTexture(this);
   }

   @Override
   public void unBind() {
      شأ.getGlController().bindTexture(0);
   }

   @Override
   public int getWidth() {
      return this.width;
   }

   public String getName() {
      return this.name;
   }

   @Override
   public int getTexId() {
      return this.texId;
   }

   public static GLTexture of(String name, ذن glTextureInfo) {
      return new GLTexture(name).create(glTextureInfo);
   }
}
