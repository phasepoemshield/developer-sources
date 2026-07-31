package ru.metaculture.protection;

import net.minecraft.util.math.MathHelper;
import org.lwjgl.opengl.GL11;

public class O0000O00OOO00O {
   public static double O00000000;

   public static float O00000000(float f, float g, float h) {
      float var3 = (g - f) * MathHelper.clamp(O0000O00O0O000.O00000000().O0000000000() * 15.0F, 0.0F, 1.0F);
      if (var3 > 0.0F) {
         var3 = Math.max(h, var3);
         var3 = Math.min(g - f, var3);
      } else if (var3 < 0.0F) {
         var3 = Math.min(-h, var3);
         var3 = Math.max(g - f, var3);
      }

      return f + var3;
   }

   public static double O00000000(double d, double e, double f) {
      double var6 = (e - d) * MathHelper.clamp((float)(O0000O00O0O000.O00000000().O0000000000() * f), 0.0F, 1.0F);
      if (var6 > 0.0) {
         var6 = Math.max(f, var6);
         var6 = Math.min(e - d, var6);
      } else if (var6 < 0.0) {
         var6 = Math.min(-f, var6);
         var6 = Math.max(e - d, var6);
      }

      return d + var6;
   }

   public static float O00000000(float f, float g, float h, double d) {
      float var5 = g - f;
      if (h < 1.0F) {
         h = 1.0F;
      }

      if (h > 1000.0F) {
         h = 16.0F;
      }

      double var6 = Math.max(d * h / 16.666666F, 0.5);
      if (var5 > d) {
         if ((g = g - (float)var6) < f) {
            g = f;
         }
      } else if (var5 < -d) {
         if ((g = g + (float)var6) > f) {
            g = f;
         }
      } else {
         g = f;
      }

      return g;
   }

   public static float O00000000(float f, float g, float h, float i, float j) {
      float var5 = (g - f) * MathHelper.clamp(j, 0.0F, 1.0F);
      if (var5 < 0.0F) {
         var5 = MathHelper.clamp(var5, -i, -h);
      } else {
         var5 = MathHelper.clamp(var5, h, i);
      }

      return Math.abs(var5) > Math.abs(g - f) ? g : f + var5;
   }

   public static double O000000000(double d, double e, double f) {
      return d + (e - d) * f;
   }

   public static float O000000000(float f, float g, float h) {
      float var3 = (float)(O00000000 * (h / 1000.0F));
      if (f < g) {
         if (f + var3 < g) {
            f += var3;
         } else {
            f = g;
         }
      } else if (f - var3 > g) {
         f -= var3;
      } else {
         f = g;
      }

      return f;
   }

   public static void O00000000(float f, float g, float h, Runnable runnable) {
      GL11.glPushMatrix();
      GL11.glTranslatef(f, g, 0.0F);
      GL11.glScalef(h, h, 1.0F);
      GL11.glTranslatef(-f, -g, 0.0F);
      runnable.run();
      GL11.glPopMatrix();
   }

   public static void O00000000(float f, float g, Runnable runnable) {
      GL11.glPushMatrix();
      GL11.glTranslatef(f, g, 0.0F);
      runnable.run();
      GL11.glPopMatrix();
   }
}
