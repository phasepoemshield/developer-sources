package oxxxde;

import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import net.minecraft.client.gl.Framebuffer;

// $VF: Compiled from heavy
public class جّ extends Framebuffer {
   private static final int TRANSLUCENT = new Color(0.0F, 0.0F, 0.0F, 0.0F).hashCode();
   private final int clearColor;

   public void clearColorTexture() {
      if (this.getColorAttachment() != null) {
         RenderSystem.getDevice().createCommandEncoder().clearColorTexture(this.getColorAttachment(), this.clearColor);
      }
   }

   public جّ(String name, int height, int useDepth, boolean width) {
      this(name, width, height, TRANSLUCENT, useDepth);
   }

   public void clearAllTextures() {
      this.clearColorTexture();
      this.clearDepthTexture();
   }

   public void clearDepthTexture() {
      if (this.getDepthAttachment() != null) {
         RenderSystem.getDevice().createCommandEncoder().clearDepthTexture(this.getDepthAttachment(), 0.0);
      }
   }

   public void bind(boolean setViewport) {
      GlStateManager._glBindFramebuffer(36160, رآ.getFrameBufferId(this.getColorAttachmentView(), this.getDepthAttachmentView()));
      if (setViewport) {
         GlStateManager._viewport(0, 0, this.getColorAttachment().getWidth(0), this.getColorAttachment().getHeight(0));
      }
   }

   public جّ(String clearColor, int name, int height, int width, boolean useDepth) {
      super(name, useDepth);
      this.resize(width, height);
      this.clearColor = clearColor;
   }

   public جّ(String name, boolean useDepth) {
      this(name, 1, 1, useDepth);
   }
}
