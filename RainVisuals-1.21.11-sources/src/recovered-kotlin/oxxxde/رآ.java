package oxxxde;

import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.textures.GpuTextureView;
import it.unimi.dsi.fastutil.ints.IntIterator;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import net.minecraft.client.texture.GlTexture;

// $VF: Compiled from heavy
public final class رآ {
   private static final Long2IntOpenHashMap FRAMEBUFFERS = new Long2IntOpenHashMap();

   public static void clearCache() {
      IntIterator var0 = FRAMEBUFFERS.values().iterator();

      while (var0.hasNext()) {
         int framebuffer = (Integer)var0.next();
         GlStateManager._glDeleteFramebuffers(framebuffer);
      }

      FRAMEBUFFERS.clear();
   }

   public static int getFrameBufferId(GpuTextureView colorTexture, GpuTextureView depthTexture) {
      validateFrameBufferTexture("Color", colorTexture);
      if (depthTexture != null) {
         validateFrameBufferTexture("Depth", depthTexture);
      }

      int colorId = ((GlTexture)colorTexture.texture()).getGlId();
      int depthId = depthTexture == null ? 0 : ((GlTexture)depthTexture.texture()).getGlId();
      long key = (long)colorId << 32 ^ depthId & 4294967295L;
      int cached = FRAMEBUFFERS.get(key);
      if (cached != -1) {
         return cached;
      }

      int framebuffer = GlStateManager.glGenFramebuffers();
      GlStateManager._glBindFramebuffer(36160, framebuffer);
      GlStateManager._glFramebufferTexture2D(36160, 36064, 3553, colorId, 0);
      if (depthId != 0) {
         GlStateManager._glFramebufferTexture2D(36160, 36096, 3553, depthId, 0);
      }

      FRAMEBUFFERS.put(key, framebuffer);
      return framebuffer;
   }

   static {
      FRAMEBUFFERS.defaultReturnValue(-1);
   }

   public static void validateFrameBufferTexture(String name, GpuTextureView gpuTextureView) {
      if (gpuTextureView.isClosed()) {
         throw new IllegalStateException(name.concat("texture is closed"));
      }

      if ((gpuTextureView.texture().usage() & 8) == 0) {
         throw new IllegalStateException(name.concat("texture must have USAGE_RENDER_ATTACHMENT"));
      }

      if (gpuTextureView.texture().getDepthOrLayers() > 1) {
         throw new UnsupportedOperationException("Textures with multiple depths or layers are not yet supported as an attachment");
      }
   }

   public static void bindFrameBuffer(int id, GpuTextureView colorTexture) {
      GlStateManager._glBindFramebuffer(36160, id);
      GlStateManager._viewport(0, 0, colorTexture.getWidth(0), colorTexture.getHeight(0));
   }
}
