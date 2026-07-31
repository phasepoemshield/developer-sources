package l;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;
import org.joml.Matrix4f;

public final class Helper216 {
   private Helper216() {
   }

   public static void method1862(MatrixStack var0, VertexConsumerProvider var1, PlayerEntity var2, PlayerEntityModel var3, Cosmetic var4) {
      if (var4 == null || !var4.isState() || var2 != Cosmetic.mc.player) {
         ;
      }
   }

   private static void method1863(MatrixStack var0, VertexConsumer var1, ModelPart var2, float var3, String var4) {
      var0.push();
      var2.rotate(var0);
      var0.translate(0.0F, 0.28F, 0.18F);
      float var5 = MathHelper.sin(var3 * 0.28F) * 12.0F;
      int var6 = -34288;
      int var7 = -11942;
      int var8 = -54784;
      if (var4.contains("Aly") || var4.contains("Дракон") || var4.contains("Dragon")) {
         var6 = -14015192;
         var7 = -7663600;
         var8 = -15658735;
      } else if (var4.contains("Devilsknife") || var4.contains("Демон") || var4.contains("Demon")) {
         var6 = -15073249;
         var7 = -8974003;
         var8 = -12320768;
      } else if (var4.contains("Harpy") || var4.contains("Бабочка") || var4.contains("Butterfly")) {
         var6 = -35401;
         var7 = -6593281;
         var8 = -1;
      } else if (var4.contains("Simple") || var4.contains("Механ") || var4.contains("Mechanical")) {
         var6 = -7367010;
         var7 = -3287587;
         var8 = -11643556;
      }

      method1864(var0, var1, true, var5, var6, var7, var8);
      method1864(var0, var1, false, -var5, var6, var7, var8);
      var0.pop();
   }

   private static void method1864(MatrixStack var0, VertexConsumer var1, boolean var2, float var3, int var4, int var5, int var6) {
      var0.push();
      float var7 = var2 ? 1.0F : -1.0F;
      var0.translate(var7 * 0.22F, 0.0F, 0.0F);
      var0.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(var7 * (34.0F + var3)));
      var0.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(var7 * 8.0F));
      Matrix4f var8 = var0.peek().getPositionMatrix();
      float var9 = 0.0F;
      float var10 = var7 * 0.78F;
      float var11 = -0.38F;
      float var12 = 0.18F;
      float var13 = 0.76F;
      float var14 = 0.02F;
      method1868(var1, var8, var9, -0.08F, var14, var10 * 0.74F, var11, var14, var10, var12, var14, var10 * 0.18F, 0.34F, var14, var4);
      method1868(
         var1,
         var8,
         var9,
         0.12F,
         var14 + 0.01F,
         var10 * 0.18F,
         0.34F,
         var14 + 0.01F,
         var10 * 0.62F,
         var13,
         var14 + 0.01F,
         var10 * 0.05F,
         0.58F,
         var14 + 0.01F,
         var5
      );
      method1866(var1, var8, var9, -0.08F, var14 + 0.02F, var10 * 0.74F, var11, var14 + 0.02F, 0.025F, var6);
      method1866(var1, var8, var9, -0.02F, var14 + 0.03F, var10, var12, var14 + 0.03F, 0.02F, var6);
      method1866(var1, var8, var9, 0.12F, var14 + 0.04F, var10 * 0.62F, var13, var14 + 0.04F, 0.02F, var6);
      var0.pop();
   }

   private static void method1865(MatrixStack var0, VertexConsumer var1, ModelPart var2, String var3) {
      var0.push();
      var2.rotate(var0);
      var0.translate(0.0F, -0.54F, 0.0F);
      int var4 = -13299606;
      int var5 = var3.contains("Hat") ? -11855215 : -11855215;
      short var6 = -6547;
      method1867(var0, var1, -0.43F, -0.03F, -0.43F, 0.43F, 0.03F, 0.43F, var4);
      method1867(var0, var1, -0.28F, -0.36F, -0.28F, 0.28F, -0.03F, 0.28F, var5);
      method1867(var0, var1, -0.19F, -0.62F, -0.19F, 0.19F, -0.36F, 0.19F, var5);
      method1867(var0, var1, -0.1F, -0.82F, -0.1F, 0.1F, -0.62F, 0.1F, var5);
      method1867(var0, var1, -0.05F, -0.92F, -0.05F, 0.05F, -0.82F, 0.05F, var6);
      var0.pop();
   }

   private static void method1866(
      VertexConsumer var0, Matrix4f var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9
   ) {
      float var10 = var5 - var2;
      float var11 = var6 - var3;
      float var12 = (float)Math.sqrt(var10 * var10 + var11 * var11);
      if (!(var12 <= 1.0E-4F)) {
         float var13 = -var11 / var12 * var8;
         float var14 = var10 / var12 * var8;
         method1868(
            var0,
            var1,
            var2 + var13,
            var3 + var14,
            var4,
            var5 + var13,
            var6 + var14,
            var7,
            var5 - var13,
            var6 - var14,
            var7,
            var2 - var13,
            var3 - var14,
            var4,
            var9
         );
      }
   }

   private static void method1867(MatrixStack var0, VertexConsumer var1, float var2, float var3, float var4, float var5, float var6, float var7, int var8) {
      Matrix4f var9 = var0.peek().getPositionMatrix();
      method1868(var1, var9, var2, var3, var4, var5, var3, var4, var5, var3, var7, var2, var3, var7, var8);
      method1868(var1, var9, var2, var6, var4, var2, var6, var7, var5, var6, var7, var5, var6, var4, var8);
      method1868(var1, var9, var2, var3, var4, var2, var6, var4, var5, var6, var4, var5, var3, var4, var8);
      method1868(var1, var9, var2, var3, var7, var5, var3, var7, var5, var6, var7, var2, var6, var7, var8);
      method1868(var1, var9, var2, var3, var4, var2, var3, var7, var2, var6, var7, var2, var6, var4, var8);
      method1868(var1, var9, var5, var3, var4, var5, var6, var4, var5, var6, var7, var5, var3, var7, var8);
   }

   private static void method1868(
      VertexConsumer var0,
      Matrix4f var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      int var14
   ) {
      var0.vertex(var1, var2, var3, var4).color(method1869(var14), method1870(var14), method1871(var14), method1872(var14));
      var0.vertex(var1, var5, var6, var7).color(method1869(var14), method1870(var14), method1871(var14), method1872(var14));
      var0.vertex(var1, var8, var9, var10).color(method1869(var14), method1870(var14), method1871(var14), method1872(var14));
      var0.vertex(var1, var11, var12, var13).color(method1869(var14), method1870(var14), method1871(var14), method1872(var14));
   }

   private static int method1869(int var0) {
      return var0 >> 16 & 0xFF;
   }

   private static int method1870(int var0) {
      return var0 >> 8 & 0xFF;
   }

   private static int method1871(int var0) {
      return var0 & 0xFF;
   }

   private static int method1872(int var0) {
      return var0 >> 24 & 0xFF;
   }
}
