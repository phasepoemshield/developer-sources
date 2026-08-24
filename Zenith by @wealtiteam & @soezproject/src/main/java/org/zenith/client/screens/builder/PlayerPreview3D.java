package org.zenith.client.screens.builder;

import org.zenith.base.figura.model.rendering.EntityRenderMode;
import org.zenith.base.figura.render.FiguraGuiRenderContext;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;
import org.zenith.core.CloudResponse;














import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.DiffuseLighting;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import org.joml.Quaternionf;

public class PlayerPreview3D {
   public static final MinecraftClient mc = MinecraftClient.getInstance();
   public float x;
   public float y;
   public float width;
   public float height;
   public float zoom = 1.0F;
   public float rotationY = 0.0F;
   public float rotationX = 0.0F;
   public boolean isDragging = false;
   public double lastMouseX;
   public double lastMouseY;

   public PlayerPreview3D(float var1, float var2, float var3, float var4) {
      this.x = var1;
      this.y = var2;
      this.width = var3;
      this.height = var4;
   }

   public void setBounds(float var1, float var2, float var3, float var4) {
      this.x = var1;
      this.y = var2;
      this.width = var3;
      this.height = var4;
   }

   public void render(DrawContext var1, LivingEntity var2, float var3, float var4) {
      this.render(var1, var2, var3, var4, null);
   }

   public void render(DrawContext var1, LivingEntity var2, float var3, float var4, PlayerPreview3D_PreviewOverlay var5) {
      if (var2 != null) {
         float f = this.x + this.width / 2.0F;
         float f1 = this.y + this.height / 2.0F;
         int i = (int)(60.0F * this.zoom);
         float f2 = var2.bodyYaw;
         float f3 = var2.prevBodyYaw;
         float f4 = var2.getYaw();
         float f5 = var2.prevYaw;
         float f6 = var2.getPitch();
         float f7 = var2.prevPitch;
         float f8 = var2.headYaw;
         float f9 = var2.prevHeadYaw;
         float f10 = var2.limbAnimator.getSpeed();

         try {
            var2.bodyYaw = 0.0F;
            var2.prevBodyYaw = 0.0F;
            var2.setYaw(0.0F);
            var2.prevYaw = 0.0F;
            var2.setPitch(0.0F);
            var2.prevPitch = 0.0F;
            var2.headYaw = 0.0F;
            var2.prevHeadYaw = 0.0F;
            var2.limbAnimator.setSpeed(0.0F);
            this.renderEntityWithRotation(var1, var2, f, f1, i, this.rotationX, this.rotationY, var5);
         } finally {
            var2.bodyYaw = f2;
            var2.prevBodyYaw = f3;
            var2.setYaw(f4);
            var2.prevYaw = f5;
            var2.setPitch(f6);
            var2.prevPitch = f7;
            var2.headYaw = f8;
            var2.prevHeadYaw = f9;
            var2.limbAnimator.setSpeed(f10);
         }
      }
   }

   public void renderEntityWithRotation(
      DrawContext var1, LivingEntity var2, float var3, float var4, int var5, float var6, float var7, PlayerPreview3D_PreviewOverlay var8
   ) {
      MatrixStack matrixstack = var1.getMatrices();
      matrixstack.push();
      EntityRenderDispatcher entityrenderdispatcher = mc.getEntityRenderDispatcher();

      try {
         float f = var2.getScale();
         float f1 = (float)var5 / Math.max(f, 1.0E-4F);
         matrixstack.translate(var3, var4, 50.0F);
         matrixstack.scale(f1, f1, -f1);
         matrixstack.translate(0.0F, var2.getHeight() / 2.0F + 0.0625F * f, 0.0F);
         Quaternionf quaternionf = new Quaternionf()
            .rotateY((float)Math.toRadians((double)(180.0F + var7)))
            .rotateX((float)Math.toRadians((double)var6))
            .rotateZ((float) Math.PI);
         matrixstack.multiply(quaternionf);
         var1.draw();
         DiffuseLighting.method_34742();
         Quaternionf quaternionf1 = new Quaternionf().rotateX((float)Math.toRadians((double)var6));
         entityrenderdispatcher.setRotation(quaternionf1.conjugate(new Quaternionf()).rotateY((float) Math.PI));
         entityrenderdispatcher.setRenderShadows(false);
         float f2 = mc.getRenderTickCounter().getTickDelta(true);
         var1.draw(var5x -> {
            FiguraGuiRenderContext.mark(var2, EntityRenderMode.FIGURA_GUI);
            entityrenderdispatcher.render(var2, 0.0, 0.0, 0.0, f2, matrixstack, var5x, 15728880);
            if (var8 != null) {
               matrixstack.push();

               try {
                  var8.render(matrixstack, var5x, 15728880, var2, f2);
               } finally {
                  matrixstack.pop();
               }
            }
         });
         var1.draw();
      } finally {
         entityrenderdispatcher.setRenderShadows(true);
         if (entityrenderdispatcher.camera != null) {
            entityrenderdispatcher.setRotation(entityrenderdispatcher.camera.getRotation());
         }

         matrixstack.pop();
         DiffuseLighting.enableGuiDepthLighting();
      }
   }

   public float getPlayerCenterX() {
      return this.x + this.width / 2.0F;
   }

   public float getPlayerCenterY() {
      return this.y + this.height / 2.0F + 40.0F;
   }

   public boolean onMouseClicked(double var1, double var3, int var5) {
      if (this.isInBounds(var1, var3) && var5 == 0) {
         this.isDragging = true;
         this.lastMouseX = var1;
         this.lastMouseY = var3;
         return true;
      } else {
         return false;
      }
   }

   public boolean onMouseReleased(double var1, double var3, int var5) {
      if (var5 == 0 && this.isDragging) {
         this.isDragging = false;
         return true;
      } else {
         return false;
      }
   }

   public boolean onMouseDragged(double var1, double var3, int var5, double var6, double var8) {
      if (this.isDragging && var5 == 0) {
         this.rotationX -= (float)var8 * 1.0F;
         this.rotationY -= (float)var6 * 1.0F;
         this.lastMouseX = var1;
         this.lastMouseY = var3;
         return true;
      } else {
         return false;
      }
   }

   public boolean onMouseScrolled(double var1, double var3, double var5) {
      if (this.isInBounds(var1, var3)) {
         this.zoom += (float)var5 * 0.1F;
         this.zoom = Math.max(0.3F, Math.min(3.0F, this.zoom));
         return true;
      } else {
         return false;
      }
   }

   public boolean isInBounds(double var1, double var3) {
      return var1 >= (double)this.x && var1 <= (double)(this.x + this.width) && var3 >= (double)this.y && var3 <= (double)(this.y + this.height);
   }

   public float getX() {
      return this.x;
   }

   public float getY() {
      return this.y;
   }

   public float getWidth() {
      return this.width;
   }

   public float getHeight() {
      return this.height;
   }

   public float getZoom() {
      return this.zoom;
   }

   public float getRotationY() {
      return this.rotationY;
   }

   public float getRotationX() {
      return this.rotationX;
   }

   public boolean isDragging() {
      return this.isDragging;
   }

   public double getLastMouseX() {
      return this.lastMouseX;
   }

   public double getLastMouseY() {
      return this.lastMouseY;
   }

   public void setX(float var1) {
      this.x = var1;
   }

   public void setY(float var1) {
      this.y = var1;
   }

   public void setWidth(float var1) {
      this.width = var1;
   }

   public void setHeight(float var1) {
      this.height = var1;
   }

   public void setZoom(float var1) {
      this.zoom = var1;
   }

   public void setRotationY(float var1) {
      this.rotationY = var1;
   }

   public void setRotationX(float var1) {
      this.rotationX = var1;
   }

   public void setDragging(boolean var1) {
      this.isDragging = var1;
   }

   public void setLastMouseX(double var1) {
      this.lastMouseX = var1;
   }

   public void setLastMouseY(double var1) {
      this.lastMouseY = var1;
   }
}
