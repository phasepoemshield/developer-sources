package ru.metaculture.protection;

import net.minecraft.client.render.VertexConsumer;
import net.minecraft.util.math.MathHelper;
import org.joml.Matrix4f;

public final class O0000O00O0O0 {
   private O0000O00O0O0() {
   }

   public static void O00000000(VertexConsumer vertexConsumer, Matrix4f matrix4f, float f, float g, float h, float i, float j, float k, int l) {
      float var9 = (l >> 24 & 0xFF) / 255.0F;
      float var10 = (l >> 16 & 0xFF) / 255.0F;
      float var11 = (l >> 8 & 0xFF) / 255.0F;
      float var12 = (l & 0xFF) / 255.0F;
      vertexConsumer.vertex(matrix4f, f, g, h).color(var10, var11, var12, var9);
      vertexConsumer.vertex(matrix4f, i, j, k).color(var10, var11, var12, var9);
   }

   public static void O000000000(VertexConsumer vertexConsumer, Matrix4f matrix4f, float f, float g, float h, float i, float j, float k, int l) {
      float var9 = (l >> 24 & 0xFF) / 255.0F;
      float var10 = (l >> 16 & 0xFF) / 255.0F;
      float var11 = (l >> 8 & 0xFF) / 255.0F;
      float var12 = (l & 0xFF) / 255.0F;
      vertexConsumer.vertex(matrix4f, f, g, h).color(var10, var11, var12, var9);
      vertexConsumer.vertex(matrix4f, i, g, h).color(var10, var11, var12, var9);
      vertexConsumer.vertex(matrix4f, i, g, h).color(var10, var11, var12, var9);
      vertexConsumer.vertex(matrix4f, i, g, k).color(var10, var11, var12, var9);
      vertexConsumer.vertex(matrix4f, i, g, k).color(var10, var11, var12, var9);
      vertexConsumer.vertex(matrix4f, f, g, k).color(var10, var11, var12, var9);
      vertexConsumer.vertex(matrix4f, f, g, k).color(var10, var11, var12, var9);
      vertexConsumer.vertex(matrix4f, f, g, h).color(var10, var11, var12, var9);
      vertexConsumer.vertex(matrix4f, f, j, h).color(var10, var11, var12, var9);
      vertexConsumer.vertex(matrix4f, i, j, h).color(var10, var11, var12, var9);
      vertexConsumer.vertex(matrix4f, i, j, h).color(var10, var11, var12, var9);
      vertexConsumer.vertex(matrix4f, i, j, k).color(var10, var11, var12, var9);
      vertexConsumer.vertex(matrix4f, i, j, k).color(var10, var11, var12, var9);
      vertexConsumer.vertex(matrix4f, f, j, k).color(var10, var11, var12, var9);
      vertexConsumer.vertex(matrix4f, f, j, k).color(var10, var11, var12, var9);
      vertexConsumer.vertex(matrix4f, f, j, h).color(var10, var11, var12, var9);
      vertexConsumer.vertex(matrix4f, f, g, h).color(var10, var11, var12, var9);
      vertexConsumer.vertex(matrix4f, f, j, h).color(var10, var11, var12, var9);
      vertexConsumer.vertex(matrix4f, i, g, h).color(var10, var11, var12, var9);
      vertexConsumer.vertex(matrix4f, i, j, h).color(var10, var11, var12, var9);
      vertexConsumer.vertex(matrix4f, i, g, k).color(var10, var11, var12, var9);
      vertexConsumer.vertex(matrix4f, i, j, k).color(var10, var11, var12, var9);
      vertexConsumer.vertex(matrix4f, f, g, k).color(var10, var11, var12, var9);
      vertexConsumer.vertex(matrix4f, f, j, k).color(var10, var11, var12, var9);
   }

   public static void O00000000(
      VertexConsumer vertexConsumer, VertexConsumer vertexConsumer2, Matrix4f matrix4f, float f, float g, float h, float i, float j, float k, int l, int m
   ) {
      O0000000000(vertexConsumer, matrix4f, f, g, h, i, j, k, l);
      O000000000(vertexConsumer2, matrix4f, f, g, h, i, j, k, m);
   }

   public static void O00000000(VertexConsumer vertexConsumer, Matrix4f matrix4f, float f, float g, float h, float i, float j, int k, int l) {
      float var9 = (k >> 24 & 0xFF) / 255.0F;
      float var10 = (k >> 16 & 0xFF) / 255.0F;
      float var11 = (k >> 8 & 0xFF) / 255.0F;
      float var12 = (k & 0xFF) / 255.0F;
      float var13 = (float)((Math.PI * 2) / l);

      for (int var14 = 0; var14 < l; var14++) {
         float var15 = var14 * var13;
         float var16 = (var14 + 1) * var13;
         float var17 = f + MathHelper.sin(var15) * i;
         float var18 = h + MathHelper.cos(var15) * i;
         float var19 = f + MathHelper.sin(var16) * i;
         float var20 = h + MathHelper.cos(var16) * i;
         vertexConsumer.vertex(matrix4f, var17, g, var18).color(var10, var11, var12, var9);
         vertexConsumer.vertex(matrix4f, var19, g, var20).color(var10, var11, var12, var9);
         vertexConsumer.vertex(matrix4f, var17, g + j, var18).color(var10, var11, var12, var9);
         vertexConsumer.vertex(matrix4f, var19, g + j, var20).color(var10, var11, var12, var9);
         if (var14 % (l / 8) == 0) {
            vertexConsumer.vertex(matrix4f, var17, g, var18).color(var10, var11, var12, var9);
            vertexConsumer.vertex(matrix4f, var17, g + j, var18).color(var10, var11, var12, var9);
         }
      }
   }

   public static void O0000000000(VertexConsumer vertexConsumer, Matrix4f matrix4f, float f, float g, float h, float i, float j, float k, int l) {
      float var9 = (l >> 24 & 0xFF) / 255.0F;
      float var10 = (l >> 16 & 0xFF) / 255.0F;
      float var11 = (l >> 8 & 0xFF) / 255.0F;
      float var12 = (l & 0xFF) / 255.0F;
      vertexConsumer.vertex(matrix4f, f, g, h).color(var10, var11, var12, var9);
      vertexConsumer.vertex(matrix4f, i, g, h).color(var10, var11, var12, var9);
      vertexConsumer.vertex(matrix4f, i, g, k).color(var10, var11, var12, var9);
      vertexConsumer.vertex(matrix4f, f, g, k).color(var10, var11, var12, var9);
      vertexConsumer.vertex(matrix4f, f, j, h).color(var10, var11, var12, var9);
      vertexConsumer.vertex(matrix4f, f, j, k).color(var10, var11, var12, var9);
      vertexConsumer.vertex(matrix4f, i, j, k).color(var10, var11, var12, var9);
      vertexConsumer.vertex(matrix4f, i, j, h).color(var10, var11, var12, var9);
      vertexConsumer.vertex(matrix4f, f, g, h).color(var10, var11, var12, var9);
      vertexConsumer.vertex(matrix4f, f, j, h).color(var10, var11, var12, var9);
      vertexConsumer.vertex(matrix4f, i, j, h).color(var10, var11, var12, var9);
      vertexConsumer.vertex(matrix4f, i, g, h).color(var10, var11, var12, var9);
      vertexConsumer.vertex(matrix4f, f, g, k).color(var10, var11, var12, var9);
      vertexConsumer.vertex(matrix4f, i, g, k).color(var10, var11, var12, var9);
      vertexConsumer.vertex(matrix4f, i, j, k).color(var10, var11, var12, var9);
      vertexConsumer.vertex(matrix4f, f, j, k).color(var10, var11, var12, var9);
      vertexConsumer.vertex(matrix4f, f, g, h).color(var10, var11, var12, var9);
      vertexConsumer.vertex(matrix4f, f, g, k).color(var10, var11, var12, var9);
      vertexConsumer.vertex(matrix4f, f, j, k).color(var10, var11, var12, var9);
      vertexConsumer.vertex(matrix4f, f, j, h).color(var10, var11, var12, var9);
      vertexConsumer.vertex(matrix4f, i, g, h).color(var10, var11, var12, var9);
      vertexConsumer.vertex(matrix4f, i, j, h).color(var10, var11, var12, var9);
      vertexConsumer.vertex(matrix4f, i, j, k).color(var10, var11, var12, var9);
      vertexConsumer.vertex(matrix4f, i, g, k).color(var10, var11, var12, var9);
   }

   public static void O000000000(VertexConsumer vertexConsumer, Matrix4f matrix4f, float f, float g, float h, float i, float j, int k, int l) {
      float var9 = (k >> 24 & 0xFF) / 255.0F;
      float var10 = (k >> 16 & 0xFF) / 255.0F;
      float var11 = (k >> 8 & 0xFF) / 255.0F;
      float var12 = (k & 0xFF) / 255.0F;
      float var13 = (float)((Math.PI * 2) / l);

      for (int var14 = 0; var14 < l; var14++) {
         float var15 = var14 * var13;
         float var16 = (var14 + 1) * var13;
         float var17 = f + MathHelper.sin(var15) * i;
         float var18 = h + MathHelper.cos(var15) * i;
         float var19 = f + MathHelper.sin(var16) * i;
         float var20 = h + MathHelper.cos(var16) * i;
         vertexConsumer.vertex(matrix4f, var17, g, var18).color(var10, var11, var12, var9);
         vertexConsumer.vertex(matrix4f, var17, g + j, var18).color(var10, var11, var12, var9);
         vertexConsumer.vertex(matrix4f, var19, g + j, var20).color(var10, var11, var12, var9);
         vertexConsumer.vertex(matrix4f, var19, g, var20).color(var10, var11, var12, var9);
         vertexConsumer.vertex(matrix4f, f, g, h).color(var10, var11, var12, var9);
         vertexConsumer.vertex(matrix4f, f, g, h).color(var10, var11, var12, var9);
         vertexConsumer.vertex(matrix4f, var17, g, var18).color(var10, var11, var12, var9);
         vertexConsumer.vertex(matrix4f, var19, g, var20).color(var10, var11, var12, var9);
         vertexConsumer.vertex(matrix4f, f, g + j, h).color(var10, var11, var12, var9);
         vertexConsumer.vertex(matrix4f, f, g + j, h).color(var10, var11, var12, var9);
         vertexConsumer.vertex(matrix4f, var19, g + j, var20).color(var10, var11, var12, var9);
         vertexConsumer.vertex(matrix4f, var17, g + j, var18).color(var10, var11, var12, var9);
      }
   }

   public static void O00000000(VertexConsumer vertexConsumer, Matrix4f matrix4f, float f, float g, float h, float i, float j, float k, int l, int m) {
      float var10 = (l >> 24 & 0xFF) / 255.0F;
      float var11 = (l >> 16 & 0xFF) / 255.0F;
      float var12 = (l >> 8 & 0xFF) / 255.0F;
      float var13 = (l & 0xFF) / 255.0F;
      float var14 = (m >> 24 & 0xFF) / 255.0F;
      float var15 = (m >> 16 & 0xFF) / 255.0F;
      float var16 = (m >> 8 & 0xFF) / 255.0F;
      float var17 = (m & 0xFF) / 255.0F;
      vertexConsumer.vertex(matrix4f, f, g, h).color(var11, var12, var13, var10);
      vertexConsumer.vertex(matrix4f, i, g, h).color(var11, var12, var13, var10);
      vertexConsumer.vertex(matrix4f, i, g, k).color(var11, var12, var13, var10);
      vertexConsumer.vertex(matrix4f, f, g, k).color(var11, var12, var13, var10);
      vertexConsumer.vertex(matrix4f, f, j, h).color(var15, var16, var17, var14);
      vertexConsumer.vertex(matrix4f, f, j, k).color(var15, var16, var17, var14);
      vertexConsumer.vertex(matrix4f, i, j, k).color(var15, var16, var17, var14);
      vertexConsumer.vertex(matrix4f, i, j, h).color(var15, var16, var17, var14);
      vertexConsumer.vertex(matrix4f, f, g, h).color(var11, var12, var13, var10);
      vertexConsumer.vertex(matrix4f, f, j, h).color(var15, var16, var17, var14);
      vertexConsumer.vertex(matrix4f, i, j, h).color(var15, var16, var17, var14);
      vertexConsumer.vertex(matrix4f, i, g, h).color(var11, var12, var13, var10);
      vertexConsumer.vertex(matrix4f, f, g, k).color(var11, var12, var13, var10);
      vertexConsumer.vertex(matrix4f, i, g, k).color(var11, var12, var13, var10);
      vertexConsumer.vertex(matrix4f, i, j, k).color(var15, var16, var17, var14);
      vertexConsumer.vertex(matrix4f, f, j, k).color(var15, var16, var17, var14);
      vertexConsumer.vertex(matrix4f, f, g, h).color(var11, var12, var13, var10);
      vertexConsumer.vertex(matrix4f, f, g, k).color(var11, var12, var13, var10);
      vertexConsumer.vertex(matrix4f, f, j, k).color(var15, var16, var17, var14);
      vertexConsumer.vertex(matrix4f, f, j, h).color(var15, var16, var17, var14);
      vertexConsumer.vertex(matrix4f, i, g, h).color(var11, var12, var13, var10);
      vertexConsumer.vertex(matrix4f, i, j, h).color(var15, var16, var17, var14);
      vertexConsumer.vertex(matrix4f, i, j, k).color(var15, var16, var17, var14);
      vertexConsumer.vertex(matrix4f, i, g, k).color(var11, var12, var13, var10);
   }

   public static void O00000000(VertexConsumer vertexConsumer, Matrix4f matrix4f, float f, float g, float h, float i, float j, int k, int l, int m) {
      float var10 = (k >> 24 & 0xFF) / 255.0F;
      float var11 = (k >> 16 & 0xFF) / 255.0F;
      float var12 = (k >> 8 & 0xFF) / 255.0F;
      float var13 = (k & 0xFF) / 255.0F;
      float var14 = (l >> 24 & 0xFF) / 255.0F;
      float var15 = (l >> 16 & 0xFF) / 255.0F;
      float var16 = (l >> 8 & 0xFF) / 255.0F;
      float var17 = (l & 0xFF) / 255.0F;
      float var18 = (float)((Math.PI * 2) / m);

      for (int var19 = 0; var19 < m; var19++) {
         float var20 = var19 * var18;
         float var21 = (var19 + 1) * var18;
         float var22 = f + MathHelper.sin(var20) * i;
         float var23 = h + MathHelper.cos(var20) * i;
         float var24 = f + MathHelper.sin(var21) * i;
         float var25 = h + MathHelper.cos(var21) * i;
         vertexConsumer.vertex(matrix4f, var22, g, var23).color(var11, var12, var13, var10);
         vertexConsumer.vertex(matrix4f, var22, g + j, var23).color(var15, var16, var17, var14);
         vertexConsumer.vertex(matrix4f, var24, g + j, var25).color(var15, var16, var17, var14);
         vertexConsumer.vertex(matrix4f, var24, g, var25).color(var11, var12, var13, var10);
         vertexConsumer.vertex(matrix4f, f, g, h).color(var11, var12, var13, var10);
         vertexConsumer.vertex(matrix4f, f, g, h).color(var11, var12, var13, var10);
         vertexConsumer.vertex(matrix4f, var22, g, var23).color(var11, var12, var13, var10);
         vertexConsumer.vertex(matrix4f, var24, g, var25).color(var11, var12, var13, var10);
         vertexConsumer.vertex(matrix4f, f, g + j, h).color(var15, var16, var17, var14);
         vertexConsumer.vertex(matrix4f, f, g + j, h).color(var15, var16, var17, var14);
         vertexConsumer.vertex(matrix4f, var24, g + j, var25).color(var15, var16, var17, var14);
         vertexConsumer.vertex(matrix4f, var22, g + j, var23).color(var15, var16, var17, var14);
      }
   }

   private static void O00000000(
      VertexConsumer vertexConsumer, Matrix4f matrix4f, float f, float g, float h, float i, float j, float k, float l, float m, float n, float o
   ) {
      vertexConsumer.vertex(matrix4f, f, g, h).color(l, m, n, o);
      vertexConsumer.vertex(matrix4f, f, j, k).color(l, m, n, o);
      vertexConsumer.vertex(matrix4f, i, j, k).color(l, m, n, o);
      vertexConsumer.vertex(matrix4f, i, g, h).color(l, m, n, o);
   }
}
