package ru.metaculture.protection;

import net.minecraft.client.render.VertexConsumer;
import org.joml.Matrix4f;

public class O00000OO00OOO0$W226$W227 {
   private O00000OO00OOO0$W226$W227() {
   }

   public static void O00000000(VertexConsumer vertexConsumer, Matrix4f matrix4f, float f, float g, float h, float i, float j, float k, int l) {
      int var9 = l >> 16 & 0xFF;
      int var10 = l >> 8 & 0xFF;
      int var11 = l & 0xFF;
      int var12 = l >> 24 & 0xFF;
      vertexConsumer.vertex(matrix4f, f, j, h).color(var9, var10, var11, var12);
      vertexConsumer.vertex(matrix4f, f, j, k).color(var9, var10, var11, var12);
      vertexConsumer.vertex(matrix4f, i, j, k).color(var9, var10, var11, var12);
      vertexConsumer.vertex(matrix4f, i, j, h).color(var9, var10, var11, var12);
      vertexConsumer.vertex(matrix4f, f, g, h).color(var9, var10, var11, var12);
      vertexConsumer.vertex(matrix4f, i, g, h).color(var9, var10, var11, var12);
      vertexConsumer.vertex(matrix4f, i, g, k).color(var9, var10, var11, var12);
      vertexConsumer.vertex(matrix4f, f, g, k).color(var9, var10, var11, var12);
      vertexConsumer.vertex(matrix4f, f, g, k).color(var9, var10, var11, var12);
      vertexConsumer.vertex(matrix4f, f, j, k).color(var9, var10, var11, var12);
      vertexConsumer.vertex(matrix4f, i, j, k).color(var9, var10, var11, var12);
      vertexConsumer.vertex(matrix4f, i, g, k).color(var9, var10, var11, var12);
      vertexConsumer.vertex(matrix4f, f, g, h).color(var9, var10, var11, var12);
      vertexConsumer.vertex(matrix4f, f, j, h).color(var9, var10, var11, var12);
      vertexConsumer.vertex(matrix4f, i, j, h).color(var9, var10, var11, var12);
      vertexConsumer.vertex(matrix4f, i, g, h).color(var9, var10, var11, var12);
      vertexConsumer.vertex(matrix4f, f, g, h).color(var9, var10, var11, var12);
      vertexConsumer.vertex(matrix4f, f, g, k).color(var9, var10, var11, var12);
      vertexConsumer.vertex(matrix4f, f, j, k).color(var9, var10, var11, var12);
      vertexConsumer.vertex(matrix4f, f, j, h).color(var9, var10, var11, var12);
      vertexConsumer.vertex(matrix4f, i, g, h).color(var9, var10, var11, var12);
      vertexConsumer.vertex(matrix4f, i, j, h).color(var9, var10, var11, var12);
      vertexConsumer.vertex(matrix4f, i, j, k).color(var9, var10, var11, var12);
      vertexConsumer.vertex(matrix4f, i, g, k).color(var9, var10, var11, var12);
   }

   public static void O00000000(
      VertexConsumer vertexConsumer,
      VertexConsumer vertexConsumer2,
      Matrix4f matrix4f,
      double d,
      double e,
      double f,
      double g,
      double h,
      double i,
      int[] is,
      int j,
      int k,
      double l,
      double m
   ) {
      O0000O0O0O0.O00000000(vertexConsumer, matrix4f, d, e, f, g, h, i, is, j);
      O0000O0O0O0.O00000000(vertexConsumer2, matrix4f, d, e, f, g, h, i, is, k, l, m);
   }

   public static void O00000000(VertexConsumer vertexConsumer, Matrix4f matrix4f, float f, float g, float h, float i, float j, float k, int l, int m) {
      int var10 = l >> 16 & 0xFF;
      int var11 = l >> 8 & 0xFF;
      int var12 = l & 0xFF;
      int var13 = l >> 24 & 0xFF;
      int var14 = m >> 16 & 0xFF;
      int var15 = m >> 8 & 0xFF;
      int var16 = m & 0xFF;
      int var17 = m >> 24 & 0xFF;
      vertexConsumer.vertex(matrix4f, f, j, h).color(var10, var11, var12, var13);
      vertexConsumer.vertex(matrix4f, f, j, k).color(var10, var11, var12, var13);
      vertexConsumer.vertex(matrix4f, i, j, k).color(var10, var11, var12, var13);
      vertexConsumer.vertex(matrix4f, i, j, h).color(var10, var11, var12, var13);
      vertexConsumer.vertex(matrix4f, f, g, h).color(var10, var11, var12, var13);
      vertexConsumer.vertex(matrix4f, f, g, k).color(var10, var11, var12, var13);
      vertexConsumer.vertex(matrix4f, i, g, k).color(var10, var11, var12, var13);
      vertexConsumer.vertex(matrix4f, i, g, h).color(var10, var11, var12, var13);
      vertexConsumer.vertex(matrix4f, f, g, k).color(var10, var11, var12, var13);
      vertexConsumer.vertex(matrix4f, f, j, k).color(var10, var11, var12, var13);
      vertexConsumer.vertex(matrix4f, i, j, k).color(var10, var11, var12, var13);
      vertexConsumer.vertex(matrix4f, i, g, k).color(var10, var11, var12, var13);
      vertexConsumer.vertex(matrix4f, f, g, h).color(var10, var11, var12, var13);
      vertexConsumer.vertex(matrix4f, i, g, h).color(var10, var11, var12, var13);
      vertexConsumer.vertex(matrix4f, i, j, h).color(var10, var11, var12, var13);
      vertexConsumer.vertex(matrix4f, f, j, h).color(var10, var11, var12, var13);
      vertexConsumer.vertex(matrix4f, f, g, h).color(var10, var11, var12, var13);
      vertexConsumer.vertex(matrix4f, f, j, h).color(var10, var11, var12, var13);
      vertexConsumer.vertex(matrix4f, f, j, k).color(var10, var11, var12, var13);
      vertexConsumer.vertex(matrix4f, f, g, k).color(var10, var11, var12, var13);
      vertexConsumer.vertex(matrix4f, i, g, h).color(var10, var11, var12, var13);
      vertexConsumer.vertex(matrix4f, i, g, k).color(var10, var11, var12, var13);
      vertexConsumer.vertex(matrix4f, i, j, k).color(var10, var11, var12, var13);
      vertexConsumer.vertex(matrix4f, i, j, h).color(var10, var11, var12, var13);
      vertexConsumer.vertex(matrix4f, f, j, h).color(var14, var15, var16, var17);
      vertexConsumer.vertex(matrix4f, f, j, k).color(var14, var15, var16, var17);
      vertexConsumer.vertex(matrix4f, i, j, k).color(var14, var15, var16, var17);
      vertexConsumer.vertex(matrix4f, i, j, h).color(var14, var15, var16, var17);
      vertexConsumer.vertex(matrix4f, f, g, h).color(var14, var15, var16, var17);
      vertexConsumer.vertex(matrix4f, i, g, h).color(var14, var15, var16, var17);
      vertexConsumer.vertex(matrix4f, i, g, k).color(var14, var15, var16, var17);
      vertexConsumer.vertex(matrix4f, f, g, k).color(var14, var15, var16, var17);
      vertexConsumer.vertex(matrix4f, f, g, k).color(var14, var15, var16, var17);
      vertexConsumer.vertex(matrix4f, f, j, k).color(var14, var15, var16, var17);
      vertexConsumer.vertex(matrix4f, i, j, k).color(var14, var15, var16, var17);
      vertexConsumer.vertex(matrix4f, i, g, k).color(var14, var15, var16, var17);
      vertexConsumer.vertex(matrix4f, f, g, h).color(var14, var15, var16, var17);
      vertexConsumer.vertex(matrix4f, f, j, h).color(var14, var15, var16, var17);
      vertexConsumer.vertex(matrix4f, i, j, h).color(var14, var15, var16, var17);
      vertexConsumer.vertex(matrix4f, i, g, h).color(var14, var15, var16, var17);
      vertexConsumer.vertex(matrix4f, f, g, h).color(var14, var15, var16, var17);
      vertexConsumer.vertex(matrix4f, f, g, k).color(var14, var15, var16, var17);
      vertexConsumer.vertex(matrix4f, f, j, k).color(var14, var15, var16, var17);
      vertexConsumer.vertex(matrix4f, f, j, h).color(var14, var15, var16, var17);
      vertexConsumer.vertex(matrix4f, i, g, h).color(var14, var15, var16, var17);
      vertexConsumer.vertex(matrix4f, i, j, h).color(var14, var15, var16, var17);
      vertexConsumer.vertex(matrix4f, i, j, k).color(var14, var15, var16, var17);
      vertexConsumer.vertex(matrix4f, i, g, k).color(var14, var15, var16, var17);
   }

   public static void O00000000(VertexConsumer vertexConsumer, Matrix4f matrix4f, int i, float f) {
      float var4 = f / 2.0F;
      int var5 = i >> 16 & 0xFF;
      int var6 = i >> 8 & 0xFF;
      int var7 = i & 0xFF;
      int var8 = i >> 24 & 0xFF;
      vertexConsumer.vertex(matrix4f, -var4, var4, -var4).color(var5, var6, var7, var8);
      vertexConsumer.vertex(matrix4f, -var4, var4, var4).color(var5, var6, var7, var8);
      vertexConsumer.vertex(matrix4f, var4, var4, var4).color(var5, var6, var7, var8);
      vertexConsumer.vertex(matrix4f, var4, var4, -var4).color(var5, var6, var7, var8);
      vertexConsumer.vertex(matrix4f, -var4, -var4, -var4).color(var5, var6, var7, var8);
      vertexConsumer.vertex(matrix4f, var4, -var4, -var4).color(var5, var6, var7, var8);
      vertexConsumer.vertex(matrix4f, var4, -var4, var4).color(var5, var6, var7, var8);
      vertexConsumer.vertex(matrix4f, -var4, -var4, var4).color(var5, var6, var7, var8);
      vertexConsumer.vertex(matrix4f, -var4, var4, var4).color(var5, var6, var7, var8);
      vertexConsumer.vertex(matrix4f, -var4, -var4, var4).color(var5, var6, var7, var8);
      vertexConsumer.vertex(matrix4f, var4, -var4, var4).color(var5, var6, var7, var8);
      vertexConsumer.vertex(matrix4f, var4, var4, var4).color(var5, var6, var7, var8);
      vertexConsumer.vertex(matrix4f, -var4, var4, -var4).color(var5, var6, var7, var8);
      vertexConsumer.vertex(matrix4f, var4, var4, -var4).color(var5, var6, var7, var8);
      vertexConsumer.vertex(matrix4f, var4, -var4, -var4).color(var5, var6, var7, var8);
      vertexConsumer.vertex(matrix4f, -var4, -var4, -var4).color(var5, var6, var7, var8);
      vertexConsumer.vertex(matrix4f, -var4, var4, -var4).color(var5, var6, var7, var8);
      vertexConsumer.vertex(matrix4f, -var4, -var4, -var4).color(var5, var6, var7, var8);
      vertexConsumer.vertex(matrix4f, -var4, -var4, var4).color(var5, var6, var7, var8);
      vertexConsumer.vertex(matrix4f, -var4, var4, var4).color(var5, var6, var7, var8);
      vertexConsumer.vertex(matrix4f, var4, var4, -var4).color(var5, var6, var7, var8);
      vertexConsumer.vertex(matrix4f, var4, var4, var4).color(var5, var6, var7, var8);
      vertexConsumer.vertex(matrix4f, var4, -var4, var4).color(var5, var6, var7, var8);
      vertexConsumer.vertex(matrix4f, var4, -var4, -var4).color(var5, var6, var7, var8);
   }

   public static void O000000000(VertexConsumer vertexConsumer, Matrix4f matrix4f, int i, float f) {
      float var4 = f / 2.0F;
      int var5 = i >> 16 & 0xFF;
      int var6 = i >> 8 & 0xFF;
      int var7 = i & 0xFF;
      int var8 = i >> 24 & 0xFF;
      O00000000(vertexConsumer, matrix4f, -var4, -var4, -var4, var4, -var4, -var4, var5, var6, var7, var8);
      O00000000(vertexConsumer, matrix4f, var4, -var4, -var4, var4, -var4, var4, var5, var6, var7, var8);
      O00000000(vertexConsumer, matrix4f, var4, -var4, var4, -var4, -var4, var4, var5, var6, var7, var8);
      O00000000(vertexConsumer, matrix4f, -var4, -var4, var4, -var4, -var4, -var4, var5, var6, var7, var8);
      O00000000(vertexConsumer, matrix4f, -var4, var4, -var4, var4, var4, -var4, var5, var6, var7, var8);
      O00000000(vertexConsumer, matrix4f, var4, var4, -var4, var4, var4, var4, var5, var6, var7, var8);
      O00000000(vertexConsumer, matrix4f, var4, var4, var4, -var4, var4, var4, var5, var6, var7, var8);
      O00000000(vertexConsumer, matrix4f, -var4, var4, var4, -var4, var4, -var4, var5, var6, var7, var8);
      O00000000(vertexConsumer, matrix4f, -var4, -var4, -var4, -var4, var4, -var4, var5, var6, var7, var8);
      O00000000(vertexConsumer, matrix4f, var4, -var4, -var4, var4, var4, -var4, var5, var6, var7, var8);
      O00000000(vertexConsumer, matrix4f, var4, -var4, var4, var4, var4, var4, var5, var6, var7, var8);
      O00000000(vertexConsumer, matrix4f, -var4, -var4, var4, -var4, var4, var4, var5, var6, var7, var8);
   }

   private static void O00000000(
      VertexConsumer vertexConsumer, Matrix4f matrix4f, float f, float g, float h, float i, float j, float k, int l, int m, int n, int o
   ) {
      vertexConsumer.vertex(matrix4f, f, g, h).color(l, m, n, o);
      vertexConsumer.vertex(matrix4f, i, j, k).color(l, m, n, o);
   }
}
