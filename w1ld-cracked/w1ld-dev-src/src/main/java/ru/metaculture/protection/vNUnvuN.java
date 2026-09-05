package ru.metaculture.protection;

import java.security.SecureRandom;
import net.minecraft.class_1294;
import net.minecraft.class_1304;
import net.minecraft.class_1309;
import net.minecraft.class_1322;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_3486;
import net.minecraft.class_3532;
import net.minecraft.class_5134;
import net.minecraft.class_746;
import net.minecraft.class_9285;
import net.minecraft.class_9334;
import net.minecraft.class_1322.class_1323;
import net.minecraft.class_2338.class_2339;
import net.minecraft.class_9285.class_9287;

public final class vNUnvuN implements O000c0oocoo {
   private static final long UuUVuuUu = 624L;
   private static final float C00OOC00oO = 10.0F;
   private static final float uUnuvNvvNU = 8.0F;
   private static final float vVvUvVVuuNvV = 13.0F;
   private static long uNNnnnuuuN = System.currentTimeMillis();
   private static long nuUnNvnuUu;
   private static int VVuuUN;
   private static int vNUvnnVnUvu = -1;
   private static int uVUuuVnNVU;

   private vNUnvuN() {
   }

   public static void UuUVuuUu() {
      nuUnNvnuUu = System.currentTimeMillis();
      vNUvnnVnUvu = -1;
   }

   public static void C00OOC00oO() {
      vNUvnnVnUvu = -1;
   }

   public static void uUnuvNvvNU() {
      VVuuUN++;
   }

   public static void vVvUvVVuuNvV() {
      if (uVUuuVnNVU-- <= 0) {
         uNNnnnuuuN = System.currentTimeMillis() + 175L;
         uVUuuVnNVU = new SecureRandom().nextInt(6, 7);
      } else {
         uNNnnnuuuN = System.currentTimeMillis();
      }
   }

   public static void uNNnnnuuuN() {
      if (vNUvnnVnUvu() > 800L) {
         uVUuuVnNVU = 7;
      }

      uNNnnnuuuN = System.currentTimeMillis();
   }

   public static boolean UuUVuuUu(class_1309 var0, int var1) {
      if (a_.field_1724 == null || a_.field_1687 == null || a_.field_1690 == null || var0 == null || !var0.method_5805()) {
         return false;
      } else if (!UuUVuuUu(var1)) {
         return false;
      } else if (!a_.field_1724.method_6128() && !a_.field_1724.method_31549().field_7479) {
         vNUnvuN.NVnVnNnN var2 = C00OOC00oO(var1);
         if (UuUVuuUu(var2)) {
            return true;
         } else {
            boolean var3 = vVvUvVVuuNvV(var2);
            boolean var4 = AttackAura.uUVvnUuNvvN.C00OOC00oO("Умные криты");
            boolean var5 = uUnuvNvvNU(var2);
            boolean var6 = uVUuuVnNVU();
            if (UuUVuuUu(var2, var4, var5)) {
               return false;
            } else if (var6) {
               return true;
            } else if (var1 <= 0) {
               return nuUnNvnuUu(var2);
            } else {
               return var3 ? uNNnnnuuuN(var2) : UuUVuuUu(var2, var1);
            }
         }
      } else {
         return true;
      }
   }

   public static boolean UuUVuuUu(class_1309 var0) {
      return a_.field_1724 != null && a_.field_1724.method_5624() && !a_.field_1724.method_5681() && !a_.field_1724.method_6128() ? UuUVuuUu(var0, 1) : false;
   }

   public static boolean C00OOC00oO(class_1309 var0) {
      return a_.field_1724 == null || !a_.field_1724.method_5624() || a_.field_1724.method_5681() || a_.field_1724.method_6128();
   }

   public static boolean UuUVuuUu(boolean var0) {
      if (!var0 || a_.field_1724 == null || a_.field_1761 == null) {
         return true;
      } else if (vNUvnnVnUvu == VVuuUN) {
         return false;
      } else if (a_.field_1724.method_6115() && a_.field_1724.method_6030().method_7909() == class_1802.field_8255) {
         a_.field_1761.method_2897(a_.field_1724);
         a_.field_1724.method_6075();
         vNUvnnVnUvu = VVuuUN;
         return false;
      } else {
         return true;
      }
   }

   private static boolean UuUVuuUu(int var0) {
      float var1 = Math.max(0.0F, (float)var0);
      float var2 = (float)Math.max(1.0, UVVNuuUvuu.UuUVuuUu());
      long var3 = Math.max(0L, (long)Math.round(Math.max(0.0F, nuUnNvnuUu() - var1) * 50.0F * (20.0F / var2)));
      return vNUvnnVnUvu() >= var3;
   }

   private static float nuUnNvnuUu() {
      double var0 = VVuuUN();
      return class_3532.method_15363((float)(10.0 * (1.0 - var0)), 8.0F, 13.0F);
   }

   private static double VVuuUN() {
      if (a_.field_1724 == null) {
         return 0.0;
      } else {
         double var0 = 0.0;
         double var2 = 1.0;

         for (class_1304 var7 : class_1304.values()) {
            class_1799 var8 = a_.field_1724.method_6118(var7);
            if (!var8.method_7960()) {
               class_9285 var9 = (class_9285)var8.method_58694(class_9334.field_49636);
               if (var9 != null) {
                  for (class_9287 var11 : var9.comp_2393()) {
                     if (var11.comp_2395() == class_5134.field_23723 && var11.comp_2397().method_57286(var7)) {
                        class_1322 var12 = var11.comp_2396();
                        if (var12.comp_2450() == class_1323.field_6330) {
                           var0 += var12.comp_2449();
                        } else if (var12.comp_2450() == class_1323.field_6331) {
                           var2 *= 1.0 + var12.comp_2449();
                        }
                     }
                  }
               }
            }
         }

         return (1.0 + var0) * var2 - 1.0;
      }
   }

   private static long vNUvnnVnUvu() {
      return System.currentTimeMillis() - uNNnnnuuuN;
   }

   private static vNUnvuN.NVnVnNnN C00OOC00oO(int var0) {
      class_746 var1 = a_.field_1724;
      boolean var2 = nVuVUNvVV.nvUVNnuu();
      boolean var3 = var2 ? nVuVUNvVV.C00OOC00oO() : var1.method_24828();
      float var4 = var2 ? nVuVUNvVV.UuUVuuUu() : (float)var1.field_6017;
      double var5 = var2 ? nVuVUNvVV.uNNnnnuuuN() : var1.method_18798().field_1351;
      double var7 = Math.max(0.0, var1.method_45325(class_5134.field_49078));
      class_238 var9 = var1.method_5829();

      for (int var10 = 0; var10 < Math.max(0, var0); var10++) {
         if (var3 && a_.field_1690.field_1903.method_1434()) {
            var3 = false;
            var5 = 0.42;
         } else if (!var3) {
            var5 = (var5 - var7) * 0.98;
            if (var5 < 0.0) {
               var4 += (float)(-var5);
            }
         }

         var9 = var9.method_989(0.0, var5, 0.0);
      }

      return new vNUnvuN.NVnVnNnN(var3, var4, var5, var9, var1.field_5976);
   }

   private static boolean UuUVuuUu(vNUnvuN.NVnVnNnN var0) {
      return a_.field_1724.method_6059(class_1294.field_5919)
         || a_.field_1724.method_6059(class_1294.field_5902)
         || UuUVuuUu(var0.box)
         || a_.field_1724.method_5777(class_3486.field_15517)
         || a_.field_1724.method_5771()
         || a_.field_1724.method_6101()
         || a_.field_1724.method_31549().field_7479;
   }

   private static boolean C00OOC00oO(vNUnvuN.NVnVnNnN var0) {
      return a_.field_1724.method_6059(class_1294.field_5919)
         || a_.field_1724.method_6059(class_1294.field_5902)
         || a_.field_1724.method_5777(class_3486.field_15517)
         || a_.field_1724.method_5771()
         || a_.field_1724.method_6101()
         || a_.field_1724.method_5681()
         || a_.field_1724.method_6128()
         || a_.field_1724.method_31549().field_7479;
   }

   private static boolean uVUuuVnNVU() {
      return a_.field_1724.method_6059(class_1294.field_5919) || a_.field_1724.method_6059(class_1294.field_5902);
   }

   private static boolean uUnuvNvvNU(vNUnvuN.NVnVnNnN var0) {
      return a_.field_1690.field_1903.method_1434() || !var0.onGround && var0.velocityY > 0.08;
   }

   private static boolean UuUVuuUu(vNUnvuN.NVnVnNnN var0, boolean var1, boolean var2) {
      if (nuUnNvnuUu <= 0L || System.currentTimeMillis() - nuUnNvnuUu > 624L) {
         return false;
      } else {
         return var1 && !var2 ? false : !var0.onGround && var0.fallDistance <= 0.0F && var0.velocityY > -0.03;
      }
   }

   private static boolean vVvUvVVuuNvV(vNUnvuN.NVnVnNnN var0) {
      return var0.horizontalCollision || vNUvnnVnUvu(var0) || uVUuuVnNVU(var0) >= 2;
   }

   private static boolean uNNnnnuuuN(vNUnvuN.NVnVnNnN var0) {
      if (VVuuUN(var0)) {
         return true;
      } else {
         float var1 = UuUVuuUu(var0, true);
         double var2 = C00OOC00oO(var0, true);
         if (var0.horizontalCollision || vNUvnnVnUvu(var0)) {
            var1 = Math.min(var1, 0.004F);
            var2 = Math.max(var2, -0.01);
         }

         return !var0.onGround && var0.fallDistance > var1 && var0.velocityY < var2;
      }
   }

   private static boolean UuUVuuUu(vNUnvuN.NVnVnNnN var0, int var1) {
      if (var0.onGround || C00OOC00oO(var0)) {
         return false;
      } else if (VVuuUN(var0)) {
         return true;
      } else {
         boolean var2 = var0.fallDistance > UuUVuuUu(var0, false);
         boolean var3 = var0.velocityY < C00OOC00oO(var0, false);
         boolean var4 = var1 <= 0 || !var0.onGround;
         return var2 && var3 && var4;
      }
   }

   private static boolean nuUnNvnuUu(vNUnvuN.NVnVnNnN var0) {
      float var1 = UuUVuuUu(var0, false);
      double var2 = C00OOC00oO(var0, false);
      if (a_.field_1724.method_24828()) {
         return false;
      } else if (!var0.onGround && !C00OOC00oO(var0)) {
         return !((float)a_.field_1724.field_6017 <= var1) && !(a_.field_1724.method_18798().field_1351 >= var2)
            ? !nVuVUNvVV.nvUVNnuu() || nVuVUNvVV.UuUVuuUu() > var1 && nVuVUNvVV.uNNnnnuuuN() < var2
            : false;
      } else {
         return false;
      }
   }

   private static boolean VVuuUN(vNUnvuN.NVnVnNnN var0) {
      return vuuuNvNuv() && !var0.onGround && var0.fallDistance > 0.0F && var0.velocityY < -0.01;
   }

   private static boolean vuuuNvNuv() {
      return a_.field_1724.field_6235 > 0 || a_.field_1724.method_6059(class_1294.field_5909);
   }

   private static float UuUVuuUu(vNUnvuN.NVnVnNnN var0, boolean var1) {
      float var2 = var1 ? 0.01F : 0.03F;
      if (vuuuNvNuv()) {
         var2 = Math.min(var2, var1 ? 0.008F : 0.012F);
      }

      if (var0.horizontalCollision) {
         var2 = Math.min(var2, 0.012F);
      }

      return var2;
   }

   private static double C00OOC00oO(vNUnvuN.NVnVnNnN var0, boolean var1) {
      double var2 = var1 ? -0.02 : -0.03;
      if (vuuuNvNuv()) {
         var2 = Math.max(var2, var1 ? -0.012 : -0.018);
      }

      if (var0.horizontalCollision) {
         var2 = Math.max(var2, -0.015);
      }

      return var2;
   }

   private static boolean vNUvnnVnUvu(vNUnvuN.NVnVnNnN var0) {
      return !a_.field_1687.method_8587(a_.field_1724, var0.box.method_1009(0.22, 0.0, 0.22).method_1011(1.0E-7));
   }

   private static int uVUuuVnNVU(vNUnvuN.NVnVnNnN var0) {
      class_243 var1 = var0.box.method_1005();
      double var2 = var0.box.field_1322 + 0.1;
      double var4 = Math.min(var0.box.field_1325 - 0.1, var0.box.field_1322 + 0.95);
      int var6 = 0;
      var6 += UuUVuuUu(var1.field_1352 + 0.72, var1.field_1350, var2, var4) ? 1 : 0;
      var6 += UuUVuuUu(var1.field_1352 - 0.72, var1.field_1350, var2, var4) ? 1 : 0;
      var6 += UuUVuuUu(var1.field_1352, var1.field_1350 + 0.72, var2, var4) ? 1 : 0;
      return var6 + (UuUVuuUu(var1.field_1352, var1.field_1350 - 0.72, var2, var4) ? 1 : 0);
   }

   private static boolean UuUVuuUu(double var0, double var2, double var4, double var6) {
      return UuUVuuUu(class_2338.method_49637(var0, var4, var2)) || UuUVuuUu(class_2338.method_49637(var0, var6, var2));
   }

   private static boolean UuUVuuUu(class_2338 var0) {
      return !a_.field_1687.method_8320(var0).method_26215() && !a_.field_1687.method_8320(var0).method_26220(a_.field_1687, var0).method_1110();
   }

   private static boolean UuUVuuUu(class_238 var0) {
      int var1 = (int)Math.floor(var0.field_1323);
      int var2 = (int)Math.floor(var0.field_1320);
      int var3 = (int)Math.floor(var0.field_1322);
      int var4 = (int)Math.floor(var0.field_1325);
      int var5 = (int)Math.floor(var0.field_1321);
      int var6 = (int)Math.floor(var0.field_1324);
      class_2339 var7 = new class_2339();

      for (int var8 = var1; var8 <= var2; var8++) {
         for (int var9 = var3; var9 <= var4; var9++) {
            for (int var10 = var5; var10 <= var6; var10++) {
               var7.method_10103(var8, var9, var10);
               if (a_.field_1687.method_8320(var7).method_27852(class_2246.field_10343)) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   record NVnVnNnN(boolean onGround, float fallDistance, double velocityY, class_238 box, boolean horizontalCollision) {
   }
}
