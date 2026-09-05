package ru.metaculture.protection;

import net.minecraft.class_3532;
import org.lwjgl.opengl.GL11;

public class CcCcc0CCOcC {
   public static double UuUVuuUu;

   public static float UuUVuuUu(float var0, float var1, float var2) {
      float var3 = (var1 - var0) * class_3532.method_15363(vvUnNVVnV.UuUVuuUu().uUnuvNvvNU() * 15.0F, 0.0F, 1.0F);
      if (var3 > 0.0F) {
         var3 = Math.max(var2, var3);
         var3 = Math.min(var1 - var0, var3);
      } else if (var3 < 0.0F) {
         var3 = Math.min(-var2, var3);
         var3 = Math.max(var1 - var0, var3);
      }

      return var0 + var3;
   }

   public static double UuUVuuUu(double var0, double var2, double var4) {
      double var6 = (var2 - var0) * class_3532.method_15363((float)(vvUnNVVnV.UuUVuuUu().uUnuvNvvNU() * var4), 0.0F, 1.0F);
      if (var6 > 0.0) {
         var6 = Math.max(var4, var6);
         var6 = Math.min(var2 - var0, var6);
      } else if (var6 < 0.0) {
         var6 = Math.min(-var4, var6);
         var6 = Math.max(var2 - var0, var6);
      }

      return var0 + var6;
   }

   public static float UuUVuuUu(float var0, float var1, float var2, double var3) {
      float var5 = var1 - var0;
      if (var2 < 1.0F) {
         var2 = 1.0F;
      }

      if (var2 > 1000.0F) {
         var2 = 16.0F;
      }

      double var6 = Math.max(var3 * var2 / 16.666666F, 0.5);
      if (var5 > var3) {
         if ((var1 = var1 - (float)var6) < var0) {
            var1 = var0;
         }
      } else if (var5 < -var3) {
         if ((var1 = var1 + (float)var6) > var0) {
            var1 = var0;
         }
      } else {
         var1 = var0;
      }

      return var1;
   }

   public static float UuUVuuUu(float var0, float var1, float var2, float var3, float var4) {
      float var5 = (var1 - var0) * class_3532.method_15363(var4, 0.0F, 1.0F);
      if (var5 < 0.0F) {
         var5 = class_3532.method_15363(var5, -var3, -var2);
      } else {
         var5 = class_3532.method_15363(var5, var2, var3);
      }

      return Math.abs(var5) > Math.abs(var1 - var0) ? var1 : var0 + var5;
   }

   public static double C00OOC00oO(double var0, double var2, double var4) {
      return var0 + (var2 - var0) * var4;
   }

   public static float C00OOC00oO(float var0, float var1, float var2) {
      float var3 = (float)(UuUVuuUu * (var2 / 1000.0F));
      if (var0 < var1) {
         if (var0 + var3 < var1) {
            var0 += var3;
         } else {
            var0 = var1;
         }
      } else if (var0 - var3 > var1) {
         var0 -= var3;
      } else {
         var0 = var1;
      }

      return var0;
   }

   public static void UuUVuuUu(float var0, float var1, float var2, Runnable var3) {
      GL11.glPushMatrix();
      GL11.glTranslatef(var0, var1, 0.0F);
      GL11.glScalef(var2, var2, 1.0F);
      GL11.glTranslatef(-var0, -var1, 0.0F);
      var3.run();
      GL11.glPopMatrix();
   }

   public static void UuUVuuUu(float var0, float var1, Runnable var2) {
      GL11.glPushMatrix();
      GL11.glTranslatef(var0, var1, 0.0F);
      var2.run();
      GL11.glPopMatrix();
   }
}
