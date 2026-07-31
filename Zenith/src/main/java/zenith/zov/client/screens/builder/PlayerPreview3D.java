package zenith.zov.client.screens.builder;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.client.render.DiffuseLighting;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.VertexConsumerProvider.ControlsListWidget8;
import org.joml.Quaternionf;

public class PlayerPreview3D {
   // $VF: renamed from: mc net.minecraft.client.MinecraftClient
   private static final MinecraftClient penalizedPathLength = MinecraftClient.getInstance();
   // $VF: renamed from: x float
   private float heapIndex;
   // $VF: renamed from: y float
   private float z;
   private float width;
   private float height;
   private float zoom = 1.0F;
   private float rotationY = 0.0F;
   private float rotationX = 0.0F;
   private boolean isDragging = false;
   private double lastMouseX;
   private double lastMouseY;

   public PlayerPreview3D(float f, float f1, float f2, float f3) {
      this.heapIndex = f;
      this.z = f1;
      this.width = f2;
      this.height = f3;
   }

   public void setBounds(float f, float f1, float f2, float f3) {
      this.heapIndex = f;
      this.z = f1;
      this.width = f2;
      this.height = f3;
   }

   public void render(DrawContext DrawContext, LivingEntity LivingEntity, float f, float f1) {
      this.render(DrawContext, LivingEntity, f, f1, null);
   }

   public void render(DrawContext DrawContext, LivingEntity LivingEntity, float f11, float f12, PlayerPreview3D$PreviewOverlay playerpreview3d$previewoverlay) {
      if (LivingEntity != null) {
         float f = this.heapIndex + this.width / 2.0F;
         float f1 = this.z + this.height / 2.0F;
         int i = (int)(60.0F * this.zoom);
         float f2 = LivingEntity.bodyYaw;
         float f3 = LivingEntity.prevBodyYaw;
         float f4 = LivingEntity.getYaw();
         float f5 = LivingEntity.prevYaw;
         float f6 = LivingEntity.getPitch();
         float f7 = LivingEntity.prevPitch;
         float f8 = LivingEntity.headYaw;
         float f9 = LivingEntity.prevHeadYaw;
         float f10 = LivingEntity.limbAnimator.getSpeed();
         LivingEntity.bodyYaw = 0.0F;
         LivingEntity.prevBodyYaw = 0.0F;
         LivingEntity.setYaw(0.0F);
         LivingEntity.prevYaw = 0.0F;
         LivingEntity.setPitch(0.0F);
         LivingEntity.prevPitch = 0.0F;
         LivingEntity.headYaw = 0.0F;
         LivingEntity.prevHeadYaw = 0.0F;
         LivingEntity.limbAnimator.setSpeed(0.0F);
         this.renderEntityWithRotation(DrawContext, LivingEntity, f, f1, i, this.rotationX, this.rotationY, playerpreview3d$previewoverlay);
         LivingEntity.bodyYaw = f2;
         LivingEntity.prevBodyYaw = f3;
         LivingEntity.setYaw(f4);
         LivingEntity.prevYaw = f5;
         LivingEntity.setPitch(f6);
         LivingEntity.prevPitch = f7;
         LivingEntity.headYaw = f8;
         LivingEntity.prevHeadYaw = f9;
         LivingEntity.limbAnimator.setSpeed(f10);
      }
   }

   private void renderEntityWithRotation(
      DrawContext DrawContext, LivingEntity LivingEntity, float f, float f1, int i, float f2, float f3, PlayerPreview3D$PreviewOverlay playerpreview3d$previewoverlay
   ) {
      MatrixStack MatrixStack = DrawContext.getMatrices();
      MatrixStack.push();
      MatrixStack.translate(f, f1, 50.0F);
      MatrixStack.scale((float)i, (float)i, (float)(-i));
      Quaternionf quaternionf = new Quaternionf();
      quaternionf.rotateY((float)Math.toRadians((double)(180.0F + f3)));
      quaternionf.rotateX((float)Math.toRadians((double)f2));
      MatrixStack.multiply(quaternionf);
      MatrixStack.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(180.0F));
      MatrixStack.translate(0.0, -0.9, 0.0);
      DiffuseLighting.method_34742();
      EntityRenderDispatcher EntityRenderDispatcher = penalizedPathLength.getEntityRenderDispatcher();
      EntityRenderDispatcher.setRenderShadows(false);
      ControlsListWidget8 ControlsListWidget8 = penalizedPathLength.getBufferBuilders().getEntityVertexConsumers();
      RenderSystem.enableDepthTest();
      RenderSystem.depthMask(true);
      RenderSystem.clear(256);
      EntityRenderDispatcher.render(LivingEntity, 0.0, 0.0, 0.0, 1.0F, MatrixStack, ControlsListWidget8, 15728880);
      if (playerpreview3d$previewoverlay != null) {
         float f4 = penalizedPathLength.getRenderTickCounter().getTickDelta(true);
         MatrixStack.push();
         playerpreview3d$previewoverlay.render(MatrixStack, ControlsListWidget8, 15728880, LivingEntity, f4);
         MatrixStack.pop();
      }

      ControlsListWidget8.draw();
      EntityRenderDispatcher.setRenderShadows(true);
      MatrixStack.pop();
      DiffuseLighting.enableGuiDepthLighting();
   }

   public float getPlayerCenterX() {
      return this.heapIndex + this.width / 2.0F;
   }

   public float getPlayerCenterY() {
      return this.z + this.height / 2.0F + 40.0F;
   }

   public boolean onMouseClicked(double d0, double d1, int i) {
      if (this.isInBounds(d0, d1) && i == 0) {
         this.isDragging = true;
         this.lastMouseX = d0;
         this.lastMouseY = d1;
         return true;
      } else {
         return false;
      }
   }

   public boolean onMouseReleased(double d0, double d1, int i) {
      if (i == 0 && this.isDragging) {
         this.isDragging = false;
         return true;
      } else {
         return false;
      }
   }

   public boolean onMouseDragged(double d0, double d1, int i, double d2, double d3) {
      if (this.isDragging && i == 0) {
         this.rotationX -= (float)d3 * 1.0F;
         this.rotationY -= (float)d2 * 1.0F;
         this.lastMouseX = d0;
         this.lastMouseY = d1;
         return true;
      } else {
         return false;
      }
   }

   public boolean onMouseScrolled(double d0, double d1, double d2) {
      if (this.isInBounds(d0, d1)) {
         this.zoom += (float)d2 * 0.1F;
         this.zoom = Math.max(0.3F, Math.min(3.0F, this.zoom));
         return true;
      } else {
         return false;
      }
   }

   public boolean isInBounds(double d0, double d1) {
      return d0 >= (double)this.heapIndex
         && d0 <= (double)(this.heapIndex + this.width)
         && d1 >= (double)this.z
         && d1 <= (double)(this.z + this.height);
   }

   public float getX() {
      return this.heapIndex;
   }

   public float getY() {
      return this.z;
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

   public void setX(float f) {
      this.heapIndex = f;
   }

   public void setY(float f) {
      this.z = f;
   }

   public void setWidth(float f) {
      this.width = f;
   }

   public void setHeight(float f) {
      this.height = f;
   }

   public void setZoom(float f) {
      this.zoom = f;
   }

   public void setRotationY(float f) {
      this.rotationY = f;
   }

   public void setRotationX(float f) {
      this.rotationX = f;
   }

   public void setDragging(boolean flag) {
      this.isDragging = flag;
   }

   public void setLastMouseX(double d0) {
      this.lastMouseX = d0;
   }

   public void setLastMouseY(double d0) {
      this.lastMouseY = d0;
   }
}
