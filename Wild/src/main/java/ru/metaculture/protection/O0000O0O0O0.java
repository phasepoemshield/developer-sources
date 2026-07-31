package ru.metaculture.protection;

import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumer;
import org.joml.Matrix4f;

public final class O0000O0O0O0 {
   private O0000O0O0O0() {
   }

   public static void O00000000(VertexConsumer vertexConsumer, Matrix4f matrix4f, int i, int j, float f) {
      float var5 = f / 2.0F;
      int var6 = i >> 16 & 0xFF;
      int var7 = i >> 8 & 0xFF;
      int var8 = i & 0xFF;
      vertexConsumer.vertex(matrix4f, -var5, -var5, 0.0F)
         .color(var6, var7, var8, j)
         .texture(0.0F, 1.0F)
         .overlay(OverlayTexture.DEFAULT_UV)
         .light(15728880)
         .normal(0.0F, 0.0F, 1.0F);
      vertexConsumer.vertex(matrix4f, var5, -var5, 0.0F)
         .color(var6, var7, var8, j)
         .texture(1.0F, 1.0F)
         .overlay(OverlayTexture.DEFAULT_UV)
         .light(15728880)
         .normal(0.0F, 0.0F, 1.0F);
      vertexConsumer.vertex(matrix4f, var5, var5, 0.0F)
         .color(var6, var7, var8, j)
         .texture(1.0F, 0.0F)
         .overlay(OverlayTexture.DEFAULT_UV)
         .light(15728880)
         .normal(0.0F, 0.0F, 1.0F);
      vertexConsumer.vertex(matrix4f, -var5, var5, 0.0F)
         .color(var6, var7, var8, j)
         .texture(0.0F, 0.0F)
         .overlay(OverlayTexture.DEFAULT_UV)
         .light(15728880)
         .normal(0.0F, 0.0F, 1.0F);
   }

   public static void O00000000(VertexConsumer vertexConsumer, Matrix4f matrix4f, double d, double e, double f, double g, double h, double i, int[] is, int j) {
      int[] var16 = new int[4];
      int[][] var17 = new int[4][4];

      for (int var18 = 0; var18 < 4; var18++) {
         var16[var18] = O0000O000OO000.O000000000000(is[var18], j);
         var17[var18][0] = var16[var18] >> 16 & 0xFF;
         var17[var18][1] = var16[var18] >> 8 & 0xFF;
         var17[var18][2] = var16[var18] & 0xFF;
         var17[var18][3] = var16[var18] >> 24 & 0xFF;
      }

      vertexConsumer.vertex(matrix4f, (float)d, (float)e, (float)f).color(var17[0][0], var17[0][1], var17[0][2], var17[0][3]);
      vertexConsumer.vertex(matrix4f, (float)g, (float)e, (float)f).color(var17[1][0], var17[1][1], var17[1][2], var17[1][3]);
      vertexConsumer.vertex(matrix4f, (float)g, (float)e, (float)i).color(var17[2][0], var17[2][1], var17[2][2], var17[2][3]);
      vertexConsumer.vertex(matrix4f, (float)d, (float)e, (float)i).color(var17[3][0], var17[3][1], var17[3][2], var17[3][3]);
      vertexConsumer.vertex(matrix4f, (float)d, (float)h, (float)f).color(var17[0][0], var17[0][1], var17[0][2], var17[0][3]);
      vertexConsumer.vertex(matrix4f, (float)d, (float)h, (float)i).color(var17[3][0], var17[3][1], var17[3][2], var17[3][3]);
      vertexConsumer.vertex(matrix4f, (float)g, (float)h, (float)i).color(var17[2][0], var17[2][1], var17[2][2], var17[2][3]);
      vertexConsumer.vertex(matrix4f, (float)g, (float)h, (float)f).color(var17[1][0], var17[1][1], var17[1][2], var17[1][3]);
      vertexConsumer.vertex(matrix4f, (float)d, (float)e, (float)i).color(var17[3][0], var17[3][1], var17[3][2], var17[3][3]);
      vertexConsumer.vertex(matrix4f, (float)g, (float)e, (float)i).color(var17[2][0], var17[2][1], var17[2][2], var17[2][3]);
      vertexConsumer.vertex(matrix4f, (float)g, (float)h, (float)i).color(var17[2][0], var17[2][1], var17[2][2], var17[2][3]);
      vertexConsumer.vertex(matrix4f, (float)d, (float)h, (float)i).color(var17[3][0], var17[3][1], var17[3][2], var17[3][3]);
      vertexConsumer.vertex(matrix4f, (float)g, (float)e, (float)f).color(var17[1][0], var17[1][1], var17[1][2], var17[1][3]);
      vertexConsumer.vertex(matrix4f, (float)d, (float)e, (float)f).color(var17[0][0], var17[0][1], var17[0][2], var17[0][3]);
      vertexConsumer.vertex(matrix4f, (float)d, (float)h, (float)f).color(var17[0][0], var17[0][1], var17[0][2], var17[0][3]);
      vertexConsumer.vertex(matrix4f, (float)g, (float)h, (float)f).color(var17[1][0], var17[1][1], var17[1][2], var17[1][3]);
      vertexConsumer.vertex(matrix4f, (float)d, (float)e, (float)f).color(var17[0][0], var17[0][1], var17[0][2], var17[0][3]);
      vertexConsumer.vertex(matrix4f, (float)d, (float)e, (float)i).color(var17[3][0], var17[3][1], var17[3][2], var17[3][3]);
      vertexConsumer.vertex(matrix4f, (float)d, (float)h, (float)i).color(var17[3][0], var17[3][1], var17[3][2], var17[3][3]);
      vertexConsumer.vertex(matrix4f, (float)d, (float)h, (float)f).color(var17[0][0], var17[0][1], var17[0][2], var17[0][3]);
      vertexConsumer.vertex(matrix4f, (float)g, (float)e, (float)i).color(var17[2][0], var17[2][1], var17[2][2], var17[2][3]);
      vertexConsumer.vertex(matrix4f, (float)g, (float)e, (float)f).color(var17[1][0], var17[1][1], var17[1][2], var17[1][3]);
      vertexConsumer.vertex(matrix4f, (float)g, (float)h, (float)f).color(var17[1][0], var17[1][1], var17[1][2], var17[1][3]);
      vertexConsumer.vertex(matrix4f, (float)g, (float)h, (float)i).color(var17[2][0], var17[2][1], var17[2][2], var17[2][3]);
   }

   public static void O00000000(
      VertexConsumer vertexConsumer, Matrix4f matrix4f, double d, double e, double f, double g, double h, double i, int[] is, int j, double k, double l
   ) {
      int[] var20 = new int[4];

      for (int var21 = 0; var21 < 4; var21++) {
         var20[var21] = O0000O000OO000.O000000000000(is[var21], j);
      }

      O00000000(vertexConsumer, matrix4f, d, e, f, g, e, f, var20[0], var20[1], k, l);
      O00000000(vertexConsumer, matrix4f, g, e, f, g, e, i, var20[1], var20[2], k, l);
      O00000000(vertexConsumer, matrix4f, g, e, i, d, e, i, var20[2], var20[3], k, l);
      O00000000(vertexConsumer, matrix4f, d, e, i, d, e, f, var20[3], var20[0], k, l);
      O00000000(vertexConsumer, matrix4f, d, h, f, g, h, f, var20[0], var20[1], k, l);
      O00000000(vertexConsumer, matrix4f, g, h, f, g, h, i, var20[1], var20[2], k, l);
      O00000000(vertexConsumer, matrix4f, g, h, i, d, h, i, var20[2], var20[3], k, l);
      O00000000(vertexConsumer, matrix4f, d, h, i, d, h, f, var20[3], var20[0], k, l);
      O00000000(vertexConsumer, matrix4f, d, e, f, d, h, f, var20[0], var20[0], k, l);
      O00000000(vertexConsumer, matrix4f, g, e, f, g, h, f, var20[1], var20[1], k, l);
      O00000000(vertexConsumer, matrix4f, g, e, i, g, h, i, var20[2], var20[2], k, l);
      O00000000(vertexConsumer, matrix4f, d, e, i, d, h, i, var20[3], var20[3], k, l);
   }

   public static void O00000000(
      VertexConsumer vertexConsumer, Matrix4f matrix4f, double d, double e, double f, double g, double h, double i, int j, int k, double l, double m
   ) {
      double var20 = g - d;
      double var22 = h - e;
      double var24 = i - f;
      double var26 = Math.sqrt(var20 * var20 + var22 * var22 + var24 * var24);
      if (!(var26 < 0.001)) {
         double var28 = var20 / var26;
         double var30 = var22 / var26;
         double var32 = var24 / var26;
         double var34 = l + m;

         for (double var36 = 0.0; var36 < var26; var36 += var34) {
            double var40 = Math.min(var36 + l, var26);
            if (var40 > var36) {
               double var42 = d + var28 * var36;
               double var44 = e + var30 * var36;
               double var46 = f + var32 * var36;
               double var48 = d + var28 * var40;
               double var50 = e + var30 * var40;
               double var52 = f + var32 * var40;
               double var54 = var36 / var26;
               int var56 = O0000O000OO000.O0000000000(j, k, (float)var54);
               vertexConsumer.vertex(matrix4f, (float)var42, (float)var44, (float)var46)
                  .color(var56 >> 16 & 0xFF, var56 >> 8 & 0xFF, var56 & 0xFF, var56 >>> 24 & 0xFF);
               var54 = var40 / var26;
               var56 = O0000O000OO000.O0000000000(j, k, (float)var54);
               vertexConsumer.vertex(matrix4f, (float)var48, (float)var50, (float)var52)
                  .color(var56 >> 16 & 0xFF, var56 >> 8 & 0xFF, var56 & 0xFF, var56 >>> 24 & 0xFF);
            }
         }
      }
   }
}
