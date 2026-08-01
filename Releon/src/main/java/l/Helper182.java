package l;

import com.mojang.blaze3d.platform.GlStateManager.DstFactor;
import com.mojang.blaze3d.platform.GlStateManager.SrcFactor;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.Vec3d;

class Helper182 {
   private final Entity entity;
   private final Vec3d position;
   private final Vec3d rotation;
   private final float size;
   private final float rotationSpeed;

   public Helper182(Entity var1, Vec3d var2, Vec3d var3) {
      this.entity = var1;
      this.position = var2;
      this.rotation = var3;
      this.size = 0.09F;
      this.rotationSpeed = 0.5F + (float)(Math.random() * 1.5);
   }

   public void method1537(MatrixStack var1) {
      var1.push();
      var1.translate(this.position.x, this.position.y, this.position.z);
      float var2 = 1.0F + (float)(Math.sin(System.currentTimeMillis() / 500.0) * 0.1F);
      var1.scale(var2, var2, var2);
      float var3 = (float)(System.currentTimeMillis() % 36000L) / 100.0F * this.rotationSpeed;
      var1.multiply(RotationAxis.POSITIVE_X.rotationDegrees((float)this.rotation.x));
      var1.multiply(RotationAxis.POSITIVE_Y.rotationDegrees((float)this.rotation.y + var3));
      var1.multiply(RotationAxis.POSITIVE_Z.rotationDegrees((float)this.rotation.z));
      RenderSystem.disableCull();
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(SrcFactor.SRC_ALPHA, DstFactor.ONE_MINUS_SRC_ALPHA);
      RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
      int var4 = Helper133.method1146(90);
      RenderSystem.blendFunc(SrcFactor.SRC_ALPHA, DstFactor.ONE);
      this.method1538(var1, var4, 0.2F, true);
      RenderSystem.blendFunc(SrcFactor.SRC_ALPHA, DstFactor.ONE_MINUS_SRC_ALPHA);
      this.method1538(var1, var4, 0.3F, true);
      this.method1538(var1, var4, 0.8F, false);
      RenderSystem.disableBlend();
      RenderSystem.enableCull();
      var1.pop();
   }

   private void method1538(MatrixStack var1, int var2, float var3, boolean var4) {
      BufferBuilder var5 = Tessellator.getInstance().begin(var4 ? DrawMode.TRIANGLES : DrawMode.DEBUG_LINES, VertexFormats.POSITION_COLOR);
      float var6 = this.size;
      float var7 = this.size * 1.0F;
      float var8 = this.size * 1.5F;
      byte var9 = 8;
      ArrayList var10 = new ArrayList();
      ArrayList var11 = new ArrayList();

      for (int var12 = 0; var12 < var9; var12++) {
         float var13 = (float)((Math.PI * 2) * var12 / var9);
         float var14 = (float)(var6 * Math.cos(var13));
         float var15 = (float)(var6 * Math.sin(var13));
         var10.add(new Vec3d(var14, var7 / 2.0F, var15));
         var11.add(new Vec3d(var14, -var7 / 2.0F, var15));
      }

      Vec3d var20 = new Vec3d(0.0, var7 / 2.0F + var8, 0.0);
      Vec3d var21 = new Vec3d(0.0, -var7 / 2.0F - var8, 0.0);
      int var22 = Helper133.method1120(var2, (int)(var3 * 255.0F));

      for (int var23 = 0; var23 < var9; var23++) {
         Vec3d var16 = (Vec3d)var11.get(var23);
         Vec3d var17 = (Vec3d)var11.get((var23 + 1) % var9);
         Vec3d var18 = (Vec3d)var10.get((var23 + 1) % var9);
         Vec3d var19 = (Vec3d)var10.get(var23);
         this.method1540(var1, var5, var16, var17, var18, var19, var22, var4);
      }

      for (int var24 = 0; var24 < var9; var24++) {
         Vec3d var26 = (Vec3d)var10.get(var24);
         Vec3d var28 = (Vec3d)var10.get((var24 + 1) % var9);
         this.method1539(var1, var5, var20, var26, var28, var22, var4);
      }

      for (int var25 = 0; var25 < var9; var25++) {
         Vec3d var27 = (Vec3d)var11.get(var25);
         Vec3d var29 = (Vec3d)var11.get((var25 + 1) % var9);
         this.method1539(var1, var5, var21, var29, var27, var22, var4);
      }

      BufferRenderer.drawWithGlobalProgram(var5.end());
   }

   private void method1539(MatrixStack var1, BufferBuilder var2, Vec3d var3, Vec3d var4, Vec3d var5, int var6, boolean var7) {
      if (var7) {
         var2.vertex(var1.peek().getPositionMatrix(), (float)var3.x, (float)var3.y, (float)var3.z).color(var6);
         var2.vertex(var1.peek().getPositionMatrix(), (float)var4.x, (float)var4.y, (float)var4.z).color(var6);
         var2.vertex(var1.peek().getPositionMatrix(), (float)var5.x, (float)var5.y, (float)var5.z).color(var6);
      } else {
         var2.vertex(var1.peek().getPositionMatrix(), (float)var3.x, (float)var3.y, (float)var3.z).color(var6);
         var2.vertex(var1.peek().getPositionMatrix(), (float)var4.x, (float)var4.y, (float)var4.z).color(var6);
         var2.vertex(var1.peek().getPositionMatrix(), (float)var4.x, (float)var4.y, (float)var4.z).color(var6);
         var2.vertex(var1.peek().getPositionMatrix(), (float)var5.x, (float)var5.y, (float)var5.z).color(var6);
         var2.vertex(var1.peek().getPositionMatrix(), (float)var5.x, (float)var5.y, (float)var5.z).color(var6);
         var2.vertex(var1.peek().getPositionMatrix(), (float)var3.x, (float)var3.y, (float)var3.z).color(var6);
      }
   }

   private void method1540(MatrixStack var1, BufferBuilder var2, Vec3d var3, Vec3d var4, Vec3d var5, Vec3d var6, int var7, boolean var8) {
      if (var8) {
         this.method1539(var1, var2, var3, var4, var5, var7, true);
         this.method1539(var1, var2, var3, var5, var6, var7, true);
      } else {
         var2.vertex(var1.peek().getPositionMatrix(), (float)var3.x, (float)var3.y, (float)var3.z).color(var7);
         var2.vertex(var1.peek().getPositionMatrix(), (float)var4.x, (float)var4.y, (float)var4.z).color(var7);
         var2.vertex(var1.peek().getPositionMatrix(), (float)var4.x, (float)var4.y, (float)var4.z).color(var7);
         var2.vertex(var1.peek().getPositionMatrix(), (float)var5.x, (float)var5.y, (float)var5.z).color(var7);
         var2.vertex(var1.peek().getPositionMatrix(), (float)var5.x, (float)var5.y, (float)var5.z).color(var7);
         var2.vertex(var1.peek().getPositionMatrix(), (float)var6.x, (float)var6.y, (float)var6.z).color(var7);
         var2.vertex(var1.peek().getPositionMatrix(), (float)var6.x, (float)var6.y, (float)var6.z).color(var7);
         var2.vertex(var1.peek().getPositionMatrix(), (float)var3.x, (float)var3.y, (float)var3.z).color(var7);
      }
   }
}
