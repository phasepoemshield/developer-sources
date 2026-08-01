package l;

import com.mojang.blaze3d.platform.GlStateManager.DstFactor;
import com.mojang.blaze3d.platform.GlStateManager.SrcFactor;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix4f;

class Helper287 {
   Vec3d position;
   Vec3d prevPosition;
   final Vec3d velocity;
   final Vec3d rotation;
   final float rotationSpeed;
   float fadeAlpha;
   boolean isFadingOut;
   boolean markedForDeath;

   public Helper287(Vec3d var1, Vec3d var2, Vec3d var3) {
      this.position = var1;
      this.prevPosition = var1;
      this.velocity = var2;
      this.rotation = var3;
      this.rotationSpeed = 0.5F + (float)(Math.random() * 1.5);
      this.fadeAlpha = 0.0F;
      this.isFadingOut = false;
      this.markedForDeath = false;
   }

   public void method2817(MatrixStack var1, int var2, Camera var3, float var4, float var5) {
      RenderSystem.disableCull();
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(SrcFactor.SRC_ALPHA, DstFactor.ONE_MINUS_SRC_ALPHA);
      RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
      RenderSystem.blendFunc(SrcFactor.SRC_ALPHA, DstFactor.ONE);
      this.method2819(var1, var2, 0.2F, true, var4);
      RenderSystem.blendFunc(SrcFactor.SRC_ALPHA, DstFactor.ONE_MINUS_SRC_ALPHA);
      this.method2819(var1, var2, 0.3F, true, var4);
      RenderSystem.depthMask(false);
      RenderSystem.blendFunc(SrcFactor.SRC_ALPHA, DstFactor.ONE);
      var1.push();
      var1.scale(1.2F, 1.2F, 1.2F);
      this.method2819(var1, var2, 0.3F, true, var4);
      var1.pop();
      this.method2818(var1, var2, var3, var4, var5);
      RenderSystem.depthMask(true);
      RenderSystem.disableBlend();
      RenderSystem.enableCull();
   }

   private void method2818(MatrixStack var1, int var2, Camera var3, float var4, float var5) {
      RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
      RenderSystem.setShaderTexture(0, Identifier.of("textures/teremok/particles/bloom.png"));
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(SrcFactor.SRC_ALPHA, DstFactor.ONE);
      RenderSystem.depthMask(false);
      int var6 = Helper133.method1120(var2, (int)(15.0F * this.fadeAlpha));
      float var7 = var4 * var5;
      float var8 = var3.getPitch();
      float var9 = var3.getYaw();
      byte var10 = 8;

      for (int var11 = 0; var11 < var10; var11++) {
         var1.push();
         float var12 = 360.0F / var10 * var11;
         var1.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(var12));
         var1.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-var9));
         var1.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var8));
         Matrix4f var13 = var1.peek().getPositionMatrix();
         BufferBuilder var14 = Tessellator.getInstance().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
         var14.vertex(var13, -var7 / 2.0F, -var7 / 2.0F, 0.0F).texture(0.0F, 1.0F).color(var6);
         var14.vertex(var13, var7 / 2.0F, -var7 / 2.0F, 0.0F).texture(1.0F, 1.0F).color(var6);
         var14.vertex(var13, var7 / 2.0F, var7 / 2.0F, 0.0F).texture(1.0F, 0.0F).color(var6);
         var14.vertex(var13, -var7 / 2.0F, var7 / 2.0F, 0.0F).texture(0.0F, 0.0F).color(var6);
         BufferRenderer.drawWithGlobalProgram(var14.end());
         var1.pop();
      }

      for (int var15 = 0; var15 < var10; var15++) {
         var1.push();
         float var16 = 360.0F / var10 * var15;
         var1.multiply(RotationAxis.POSITIVE_X.rotationDegrees(90.0F));
         var1.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(var16));
         var1.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-var9));
         var1.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var8));
         Matrix4f var17 = var1.peek().getPositionMatrix();
         BufferBuilder var18 = Tessellator.getInstance().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
         var18.vertex(var17, -var7 / 2.0F, -var7 / 2.0F, 0.0F).texture(0.0F, 1.0F).color(var6);
         var18.vertex(var17, var7 / 2.0F, -var7 / 2.0F, 0.0F).texture(1.0F, 1.0F).color(var6);
         var18.vertex(var17, var7 / 2.0F, var7 / 2.0F, 0.0F).texture(1.0F, 0.0F).color(var6);
         var18.vertex(var17, -var7 / 2.0F, var7 / 2.0F, 0.0F).texture(0.0F, 0.0F).color(var6);
         BufferRenderer.drawWithGlobalProgram(var18.end());
         var1.pop();
      }

      RenderSystem.depthMask(true);
      RenderSystem.blendFunc(SrcFactor.SRC_ALPHA, DstFactor.ONE_MINUS_SRC_ALPHA);
   }

   private void method2819(MatrixStack var1, int var2, float var3, boolean var4, float var5) {
      BufferBuilder var6 = Tessellator.getInstance().begin(var4 ? DrawMode.TRIANGLES : DrawMode.DEBUG_LINES, VertexFormats.POSITION_COLOR);
      float var7 = var5;
      float var8 = var5 * 1.0F;
      float var9 = var5 * 1.5F;
      byte var10 = 8;
      ArrayList var11 = new ArrayList();
      ArrayList var12 = new ArrayList();

      for (int var13 = 0; var13 < var10; var13++) {
         float var14 = (float)((Math.PI * 2) * var13 / var10);
         float var15 = (float)(var7 * Math.cos(var14));
         float var16 = (float)(var7 * Math.sin(var14));
         var11.add(new Vec3d(var15, var8 / 2.0F, var16));
         var12.add(new Vec3d(var15, -var8 / 2.0F, var16));
      }

      Vec3d var21 = new Vec3d(0.0, var8 / 2.0F + var9, 0.0);
      Vec3d var22 = new Vec3d(0.0, -var8 / 2.0F - var9, 0.0);
      int var23 = Helper133.method1120(var2, (int)(55.0F * this.fadeAlpha));

      for (int var24 = 0; var24 < var10; var24++) {
         Vec3d var17 = (Vec3d)var12.get(var24);
         Vec3d var18 = (Vec3d)var12.get((var24 + 1) % var10);
         Vec3d var19 = (Vec3d)var11.get((var24 + 1) % var10);
         Vec3d var20 = (Vec3d)var11.get(var24);
         this.method2821(var1, var6, var17, var18, var19, var20, var23, var4);
      }

      for (int var25 = 0; var25 < var10; var25++) {
         Vec3d var27 = (Vec3d)var11.get(var25);
         Vec3d var29 = (Vec3d)var11.get((var25 + 1) % var10);
         this.method2820(var1, var6, var21, var27, var29, var23, var4);
      }

      for (int var26 = 0; var26 < var10; var26++) {
         Vec3d var28 = (Vec3d)var12.get(var26);
         Vec3d var30 = (Vec3d)var12.get((var26 + 1) % var10);
         this.method2820(var1, var6, var22, var30, var28, var23, var4);
      }

      BufferRenderer.drawWithGlobalProgram(var6.end());
   }

   private void method2820(MatrixStack var1, BufferBuilder var2, Vec3d var3, Vec3d var4, Vec3d var5, int var6, boolean var7) {
      if (var7) {
         var2.vertex(var1.peek().getPositionMatrix(), (float)var3.x, (float)var3.y, (float)var3.z).color(var6);
         var2.vertex(var1.peek().getPositionMatrix(), (float)var4.x, (float)var4.y, (float)var4.z).color(var6);
         var2.vertex(var1.peek().getPositionMatrix(), (float)var5.x, (float)var5.y, (float)var5.z).color(var6);
      }
   }

   private void method2821(MatrixStack var1, BufferBuilder var2, Vec3d var3, Vec3d var4, Vec3d var5, Vec3d var6, int var7, boolean var8) {
      if (var8) {
         this.method2820(var1, var2, var3, var4, var5, var7, true);
         this.method2820(var1, var2, var3, var5, var6, var7, true);
      }
   }
}
