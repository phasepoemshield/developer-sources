package oxxxde;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.nio.ByteBuffer;
import kotakbaz.rain.client.render.main.buffer.framebuffer.CustomFramebuffer;
import net.minecraft.client.texture.GlTexture;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.MemoryUtil;

// $VF: Compiled from heavy
final class ذع {
   private int renderAttempts;
   private boolean lastRenderFailureWasException;
   private final String avatarId;
   private boolean ready;
   private final int textureId;
   private final CustomFramebuffer target;

   private void close() {
      شآ.LOGGER.debug("Destroying Figura preview surface: id={}, texture={}", this.avatarId, this.textureId);
      this.target.delete();
   }

   private ذع(String avatarId) {
      this(avatarId, true);
   }

   private boolean shouldLogRenderFailure() {
      return this.renderAttempts == 1 || this.renderAttempts % 60 == 0;
   }

   private ذع(String useDepth, boolean avatarId) {
      this.avatarId = avatarId;
      this.target = new CustomFramebuffer("rain_figura_preview_" + شآ.surfaceSequence++, 360, 522, useDepth);
      this.textureId = ((GlTexture)this.target.getColorAttachment()).getGlId();
      شآ.configureLinearFiltering(this.textureId);
      شآ.LOGGER.debug("Created Figura preview surface: id={}, texture={}, resolution={}x{}", avatarId, this.textureId, 360, 522);
   }

   private void uploadPixels(byte[] pixels) {
      if (pixels != null && pixels.length == 751680) {
         ByteBuffer buffer = MemoryUtil.memAlloc(pixels.length);
         int previousActiveTexture = GL11.glGetInteger(34016);
         int previousUnpackAlignment = GL11.glGetInteger(3317);

         try {
            buffer.put(pixels).flip();
            GlStateManager._activeTexture(33984);
            int previousTexture = GL11.glGetInteger(32873);

            try {
               GlStateManager._bindTexture(this.textureId);
               GL11.glPixelStorei(3317, 1);
               GL11.glTexSubImage2D(3553, 0, 0, 0, 360, 522, 6408, 5121, buffer);
            } finally {
               GL11.glPixelStorei(3317, previousUnpackAlignment);
               GlStateManager._bindTexture(previousTexture);
            }
         } finally {
            GlStateManager._activeTexture(previousActiveTexture);
            MemoryUtil.memFree(buffer);
         }
      } else {
         throw new IllegalArgumentException("Rendered Figura preview pixel data has an invalid size");
      }
   }
}
