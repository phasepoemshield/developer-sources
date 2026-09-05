package ru.metaculture.protection;

import lombok.Generated;
import net.minecraft.class_10185;
import net.minecraft.class_238;
import net.minecraft.class_241;
import net.minecraft.class_243;
import net.minecraft.class_304;
import net.minecraft.class_3532;
import net.minecraft.class_3675;
import net.minecraft.class_3675.class_306;
import net.minecraft.class_3675.class_307;
import org.wild.mixin.acceser.KeyBindingAccessor;

public final class UNnnNuVnu implements O000c0oocoo {
   private static float UuUVuuUu;
   private static float C00OOC00oO;
   private static boolean uUnuvNvvNU;
   private static boolean vVvUvVVuuNvV;

   public static double UuUVuuUu(float var0, float var1, float var2) {
      if (var1 < 0.0F) {
         var0 += 180.0F;
      }

      float var3 = 1.0F;
      if (var1 < 0.0F) {
         var3 = -0.5F;
      }

      if (var1 > 0.0F) {
         var3 = 0.5F;
      }

      if (var2 > 0.0F) {
         var0 -= 90.0F * var3;
      }

      if (var2 < 0.0F) {
         var0 += 90.0F * var3;
      }

      return Math.toRadians(var0);
   }

   public static boolean UuUVuuUu() {
      return a_.field_1724 != null && a_.field_1724.field_3913 != null && a_.field_1724.field_3913.field_54155 != null
         ? a_.field_1724.field_3913.field_54155.comp_3159()
            || a_.field_1724.field_3913.field_54155.comp_3160()
            || a_.field_1724.field_3913.field_54155.comp_3161()
            || a_.field_1724.field_3913.field_54155.comp_3162()
         : false;
   }

   public static double[] UuUVuuUu(double var0) {
      float[] var2 = C00OOC00oO();
      return UuUVuuUu(var2[0], var2[1], var0);
   }

   public static double[] UuUVuuUu(float var0, float var1, double var2) {
      return UuUVuuUu(var0, var1, a_.field_1724.method_36454(), var2);
   }

   public static double[] UuUVuuUu(float var0, float var1, float var2, double var3) {
      if (var0 != 0.0F) {
         if (var1 > 0.0F) {
            var2 += var0 > 0.0F ? -45.0F : 45.0F;
         } else if (var1 < 0.0F) {
            var2 += var0 > 0.0F ? 45.0F : -45.0F;
         }

         var1 = 0.0F;
         var0 = var0 > 0.0F ? 1.0F : -1.0F;
      }

      double var5 = Math.sin(Math.toRadians(var2 + 90.0F));
      double var7 = Math.cos(Math.toRadians(var2 + 90.0F));
      double var9 = var0 * var3 * var7 + var1 * var3 * var5;
      double var11 = var0 * var3 * var5 - var1 * var3 * var7;
      return new double[]{var9, var11};
   }

   public static void UuUVuuUu(uNVVnVUNun var0, float var1) {
      if (a_.field_1724 != null) {
         float var2 = a_.field_1724.method_70987() ? a_.field_1724.method_36454() : nVuVUNvVV.UuUVuuUu(a_.field_1724.method_36454());
         float[] var3 = UuUVuuUu(var0.uUnuvNvvNU(), var0.vVvUvVVuuNvV(), var2, var1);
         var0.UuUVuuUu(var3[0]);
         var0.C00OOC00oO(var3[1]);
      }
   }

   public static float[] C00OOC00oO() {
      float var0 = 0.0F;
      float var1 = 0.0F;
      if (a_.field_1755 != null) {
         return new float[]{0.0F, 0.0F};
      } else {
         if (UuUVuuUu(a_.field_1690.field_1894)) {
            var0++;
         }

         if (UuUVuuUu(a_.field_1690.field_1881)) {
            var0--;
         }

         if (UuUVuuUu(a_.field_1690.field_1913)) {
            var1++;
         }

         if (UuUVuuUu(a_.field_1690.field_1849)) {
            var1--;
         }

         return new float[]{var0, var1};
      }
   }

   private static boolean UuUVuuUu(class_304 var0) {
      if (var0 == null) {
         return false;
      } else {
         try {
            class_306 var1 = ((KeyBindingAccessor)var0).wild$getBoundKey();
            if (var1 != null && var1.method_1442() == class_307.field_1668 && var1.method_1444() != class_3675.field_16237.method_1444()) {
               return class_3675.method_15987(a_.method_22683().method_4490(), var1.method_1444());
            }
         } catch (Throwable var2) {
         }

         return var0.method_1434();
      }
   }

   private static void UuUVuuUu(float var0, float var1) {
      if (a_.field_1724 != null && a_.field_1724.field_3913 != null && a_.field_1724.field_3913.field_54155 != null) {
         boolean var2 = var0 > 0.0F;
         boolean var3 = var0 < 0.0F;
         boolean var4 = var1 > 0.0F;
         boolean var5 = var1 < 0.0F;
         boolean var6 = a_.field_1724.field_3913.field_54155.comp_3163();
         boolean var7 = a_.field_1724.field_3913.field_54155.comp_3164();
         boolean var8 = a_.field_1724.field_3913.field_54155.comp_3165();
         a_.field_1724.field_3913.field_54155 = new class_10185(var2, var3, var4, var5, var6, var7, var8);
      }
   }

   public static void UuUVuuUu(float var0, class_243 var1) {
      float[] var2 = C00OOC00oO();
      float var3 = var2[0];
      float var4 = var2[1];
      if (var3 == 0.0F && var4 == 0.0F) {
         vVvUvVVuuNvV();
      } else {
         class_238 var5 = AttackAura.ccOO0COcoco0.method_5829();
         double var6 = class_3532.method_16436(Math.random(), var5.field_1323, var5.field_1320);
         double var8 = class_3532.method_16436(Math.random(), var5.field_1322, var5.field_1325);
         double var10 = class_3532.method_16436(Math.random(), var5.field_1321, var5.field_1324);
         var8 = class_3532.method_15350(
            var8, AttackAura.ccOO0COcoco0.method_23318() + 0.2, AttackAura.ccOO0COcoco0.method_23318() + AttackAura.ccOO0COcoco0.method_17682() - 0.2
         );
         class_243 var12 = new class_243(var6, var8, var10).method_1020(a_.field_1724.method_33571()).method_1029();
         float var13 = (float)class_3532.method_15338(Math.toDegrees(Math.atan2(var12.field_1350, var12.field_1352)) - 90.0);
         float var14 = a_.field_1724.method_70987() ? a_.field_1724.method_36454() : nVuVUNvVV.UuUVuuUu(a_.field_1724.method_36454());
         UuUVuuUu(UuUVuuUu(var3, var4, var14, a_.field_1724.method_70987() ? a_.field_1724.method_36454() : var13));
      }
   }

   public static void UuUVuuUu(float var0) {
      float[] var1 = C00OOC00oO();
      float var2 = var1[0];
      float var3 = var1[1];
      if (var2 == 0.0F && var3 == 0.0F) {
         vVvUvVVuuNvV();
      } else {
         float var4 = a_.field_1724.method_70987() ? a_.field_1724.method_36454() : nVuVUNvVV.UuUVuuUu(a_.field_1724.method_36454());
         UuUVuuUu(UuUVuuUu(var2, var3, var4, a_.field_1724.method_70987() ? a_.field_1724.method_36454() : var0));
      }
   }

   private static void vVvUvVVuuNvV() {
      uUnuvNvvNU();
   }

   public static void uUnuvNvvNU() {
      UuUVuuUu = 0.0F;
      C00OOC00oO = 0.0F;
      uUnuvNvvNU = false;
      if (vVvUvVVuuNvV && a_.field_1690 != null) {
         vVvUvVVuuNvV = false;
         a_.field_1690.field_1894.method_23481(UuUVuuUu(a_.field_1690.field_1894));
         a_.field_1690.field_1881.method_23481(UuUVuuUu(a_.field_1690.field_1881));
         a_.field_1690.field_1913.method_23481(UuUVuuUu(a_.field_1690.field_1913));
         a_.field_1690.field_1849.method_23481(UuUVuuUu(a_.field_1690.field_1849));
      }
   }

   private static void UuUVuuUu(float[] var0) {
      float var1 = C00OOC00oO(var0[0]);
      float var2 = C00OOC00oO(var0[1]);
      vVvUvVVuuNvV = true;
      a_.field_1690.field_1894.method_23481(var1 > 0.0F);
      a_.field_1690.field_1881.method_23481(var1 < 0.0F);
      a_.field_1690.field_1913.method_23481(var2 > 0.0F);
      a_.field_1690.field_1849.method_23481(var2 < 0.0F);
   }

   private static float C00OOC00oO(float var0) {
      if (var0 > 0.35F) {
         return 1.0F;
      } else {
         return var0 < -0.35F ? -1.0F : 0.0F;
      }
   }

   public static void C00OOC00oO(double var0) {
      if (a_.field_1724 != null) {
         float var2 = a_.field_1724.method_36454();
         double var3 = Math.toRadians(var2);
         double var5 = 0.0;
         double var7 = 0.0;
         class_241 var9 = a_.field_1724.field_3913.method_3128();
         float var10 = var9.field_1342;
         float var11 = var9.field_1343;
         if (var10 > 0.0F) {
            var5 -= Math.sin(var3) * var0;
            var7 += Math.cos(var3) * var0;
         }

         if (var10 < 0.0F) {
            var5 += Math.sin(var3) * var0;
            var7 -= Math.cos(var3) * var0;
         }

         if (var11 > 0.0F) {
            var5 += Math.cos(var3) * var0;
            var7 += Math.sin(var3) * var0;
         }

         if (var11 < 0.0F) {
            var5 -= Math.cos(var3) * var0;
            var7 -= Math.sin(var3) * var0;
         }

         if (var11 > 0.0F && var10 > 0.0F) {
            var5 = Math.cos(Math.toRadians(var2 + 45.0F)) * var0;
            var7 = Math.sin(Math.toRadians(var2 + 45.0F)) * var0;
         }

         if (var11 < 0.0F && var10 > 0.0F) {
            var5 = -Math.cos(Math.toRadians(var2 - 45.0F)) * var0;
            var7 = -Math.sin(Math.toRadians(var2 - 45.0F)) * var0;
         }

         if (var11 > 0.0F && var10 < 0.0F) {
            var5 = -Math.cos(Math.toRadians(var2 + 135.0F)) * var0;
            var7 = -Math.sin(Math.toRadians(var2 + 135.0F)) * var0;
         }

         if (var11 < 0.0F && var10 < 0.0F) {
            var5 = Math.cos(Math.toRadians(var2 - 135.0F)) * var0;
            var7 = Math.sin(Math.toRadians(var2 - 135.0F)) * var0;
         }

         a_.field_1724.method_18800(var5, a_.field_1724.method_18798().field_1351, var7);
      }
   }

   public static float[] UuUVuuUu(float var0, float var1, float var2, float var3) {
      if (var0 == 0.0F && var1 == 0.0F) {
         UuUVuuUu = 0.0F;
         C00OOC00oO = 0.0F;
         uUnuvNvvNU = false;
         return new float[]{0.0F, 0.0F};
      } else {
         double var4 = Math.toRadians(class_3532.method_15393(var3 - var2));
         double var6 = Math.cos(var4);
         double var8 = Math.sin(var4);
         float var10 = (float)(var0 * var6 + var1 * var8);
         float var11 = (float)(var1 * var6 - var0 * var8);
         float var12 = Math.max(Math.abs(var0), Math.abs(var1));
         float var13 = (float)Math.hypot(var10, var11);
         if (var13 != 0.0F) {
            var10 = var10 / var13 * var12;
            var11 = var11 / var13 * var12;
         }

         float var14 = Math.abs(class_3532.method_15393(var3 - var2));
         float var15 = class_3532.method_15363(0.62F + var14 / 360.0F, 0.62F, 0.88F);
         if (!uUnuvNvvNU) {
            UuUVuuUu = var10;
            C00OOC00oO = var11;
            uUnuvNvvNU = true;
         } else {
            UuUVuuUu = UuUVuuUu + (var10 - UuUVuuUu) * var15;
            C00OOC00oO = C00OOC00oO + (var11 - C00OOC00oO) * var15;
         }

         float var16 = (float)Math.hypot(UuUVuuUu, C00OOC00oO);
         if (var16 > 1.0E-4F) {
            UuUVuuUu = UuUVuuUu / var16 * var12;
            C00OOC00oO = C00OOC00oO / var16 * var12;
         }

         if (UuUVuuUu * var10 + C00OOC00oO * var11 < 0.0F) {
            UuUVuuUu = var10;
            C00OOC00oO = var11;
         }

         return new float[]{UuUVuuUu, C00OOC00oO};
      }
   }

   @Generated
   private UNnnNuVnu() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
