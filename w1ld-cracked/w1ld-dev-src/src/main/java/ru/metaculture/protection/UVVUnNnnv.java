package ru.metaculture.protection;

import net.minecraft.class_1294;
import net.minecraft.class_2246;
import net.minecraft.class_238;
import net.minecraft.class_310;
import net.minecraft.class_3486;
import net.minecraft.class_3532;
import net.minecraft.class_5134;
import net.minecraft.class_746;
import net.minecraft.class_2338.class_2339;

public final class UVVUnNnnv {
   private static final float UuUVuuUu = 0.9001F;
   private static final float C00OOC00oO = 1.0E-6F;
   private static final double uUnuvNvvNU = 0.015;
   private static final long vVvUvVVuuNvV = 260L;
   private static final long uNNnnnuuuN = 70L;
   private static volatile boolean nuUnNvnuUu = true;
   private static volatile boolean VVuuUN = false;
   private static volatile boolean vNUvnnVnUvu = false;
   private static volatile boolean uVUuuVnNVU = false;
   private static volatile long vuuuNvNuv = 0L;
   private static volatile long nvUVNnuu = 0L;
   private static volatile long UuuNnUvUuv = 0L;
   private static volatile long nUUVuvU = 0L;
   private static volatile long UnUNVVVNuv = 0L;
   private static volatile uUuUnVnnnVun vNVuvnUUnuUn = uUuUnVnnnVun.UNAVAILABLE;

   private UVVUnNnnv() {
   }

   public static void UuUVuuUu() {
      nuUnNvnuUu = true;
      NnUuNNU();
   }

   public static void C00OOC00oO() {
      UuUVuuUu(vVvUvVVuuNvV() == uUuUnVnnnVun.READY);
   }

   public static void UuUVuuUu(boolean var0) {
      long var1 = System.currentTimeMillis();
      if (var0) {
         vNVuvnUUnuUn = uUuUnVnnnVun.READY;
         UnUNVVVNuv = var1;
         uNnUnnuNUnNu();
      } else {
         vNVuvnUUnuUn = uUuUnVnnnVun.UNAVAILABLE;
         nUUVuvU = var1;
      }
   }

   public static boolean uUnuvNvvNU() {
      return uVUuuVnNVU() && vVvUvVVuuNvV() == uUuUnVnnnVun.WAITING;
   }

   public static uUuUnVnnnVun vVvUvVVuuNvV() {
      class_310 var0 = class_310.method_1551();
      if (var0.field_1724 != null && var0.field_1687 != null) {
         class_746 var1 = var0.field_1724;
         if (C00OOC00oO(var1, var0)) {
            uNnUnnuNUnNu();
            return uUuUnVnnnVun.UNAVAILABLE;
         } else if (!UuUVuuUu(var1, var0)) {
            return uUuUnVnnnVun.UNAVAILABLE;
         } else {
            boolean var2 = nVuVUNvVV.C00OOC00oO();
            boolean var3 = var1.method_24828();
            float var4 = nVuVUNvVV.UuUVuuUu();
            double var5 = nVuVUNvVV.uNNnnnuuuN();
            boolean var7 = !var2 && (var4 > 1.0E-6F || var5 < -1.0E-6 || nVuVUNvVV.VVuuUN());
            if (var7) {
               if (uUnuvNvvNU(var1)) {
                  return uUuUnVnnnVun.WAITING;
               } else {
                  return UuUVuuUu(var1) ? uUuUnVnnnVun.READY : uUuUnVnnnVun.WAITING;
               }
            } else if (!var2 || !var3) {
               return uUuUnVnnnVun.WAITING;
            } else if (!uUnuvNvvNU(var1, var0)) {
               nNvNUVU();
               return uUuUnVnnnVun.UNAVAILABLE;
            } else if (UnUNuUU()) {
               nNvNUVU();
               return uUuUnVnnnVun.UNAVAILABLE;
            } else {
               return uUuUnVnnnVun.WAITING;
            }
         }
      } else {
         return uUuUnVnnnVun.UNAVAILABLE;
      }
   }

   public static boolean uNNnnnuuuN() {
      return vVvUvVVuuNvV() == uUuUnVnnnVun.READY;
   }

   public static boolean nuUnNvnuUu() {
      return !VVuuUN();
   }

   public static boolean VVuuUN() {
      return vNUvnnVnUvu();
   }

   public static boolean vNUvnnVnUvu() {
      return !uVUuuVnNVU() ? false : vVvUvVVuuNvV() == uUuUnVnnnVun.WAITING;
   }

   public static boolean uVUuuVnNVU() {
      class_310 var0 = class_310.method_1551();
      if (var0.field_1724 != null && var0.field_1687 != null) {
         return UuUVuuUu(var0.field_1724, var0);
      } else {
         uNnUnnuNUnNu();
         return false;
      }
   }

   private static boolean UuUVuuUu(class_746 var0, class_310 var1) {
      if (!nuUnNvnuUu) {
         NnUuNNU();
         return false;
      } else if (C00OOC00oO(var0, var1)) {
         uNnUnnuNUnNu();
         return false;
      } else {
         long var2 = System.currentTimeMillis();
         boolean var4 = var1.field_1690.field_1903.method_1434();
         boolean var5 = var0.method_24828();
         boolean var6 = nVuVUNvVV.C00OOC00oO();
         boolean var7 = !var5 || !var6;
         if (!var4) {
            uVUuuVnNVU = false;
         }

         if (uVUuuVnNVU) {
            return false;
         } else if (var4) {
            if (!VVuuUN) {
               VVuuUN = true;
               vNUvnnVnUvu = false;
               vuuuNvNuv = var2;
               nvUVNnuu = var2;
               UuuNnUvUuv = 0L;
            }

            return true;
         } else if (VVuuUN && var7) {
            vNUvnnVnUvu = true;
            nvUVNnuu = var2;
            UuuNnUvUuv = var2 + 70L;
            return true;
         } else if (VVuuUN && var5 && var6) {
            if (!vNUvnnVnUvu) {
               if (var2 - vuuuNvNuv <= 260L) {
                  return true;
               } else {
                  nNvNUVU();
                  return false;
               }
            } else if (var2 <= UuuNnUvUuv) {
               return true;
            } else {
               uNnUnnuNUnNu();
               return false;
            }
         } else if (VVuuUN && var2 - nvUVNnuu <= 260L) {
            return true;
         } else {
            uNnUnnuNUnNu();
            return false;
         }
      }
   }

   public static boolean vuuuNvNuv() {
      class_310 var0 = class_310.method_1551();
      if (var0.field_1724 != null && var0.field_1687 != null) {
         class_746 var1 = var0.field_1724;
         if (!UuUVuuUu(var1, var0)) {
            return false;
         } else if (C00OOC00oO(var1, var0)) {
            return false;
         } else {
            uUuUnVnnnVun var2 = vVvUvVVuuNvV();
            return var2 == uUuUnVnnnVun.UNAVAILABLE ? false : var1.method_5624() || nVuVUNvVV.uUnuvNvvNU();
         }
      } else {
         return false;
      }
   }

   public static boolean nvUVNnuu() {
      return vuuuNvNuv();
   }

   public static boolean UuuNnUvUuv() {
      return false;
   }

   public static boolean nUUVuvU() {
      class_310 var0 = class_310.method_1551();
      if (var0.field_1724 != null && var0.field_1687 != null) {
         class_746 var1 = var0.field_1724;
         if (!nuUnNvnuUu) {
            return false;
         } else if (C00OOC00oO(var1, var0)) {
            return false;
         } else {
            return uUnuvNvvNU(var1)
               ? false
               : var0.field_1690.field_1903.method_1434() && nVuVUNvVV.C00OOC00oO() && var1.method_24828() && uUnuvNvvNU(var1, var0);
         }
      } else {
         return false;
      }
   }

   public static boolean UnUNVVVNuv() {
      return uVUuuVnNVU() && vVvUvVVuuNvV() == uUuUnVnnnVun.WAITING && !nVuVUNvVV.C00OOC00oO();
   }

   public static boolean vNVuvnUUnuUn() {
      class_310 var0 = class_310.method_1551();
      return var0.field_1724 != null && var0.field_1687 != null ? !var0.field_1724.method_24828() || !nVuVUNvVV.C00OOC00oO() : false;
   }

   public static void C00OOC00oO(boolean var0) {
      nuUnNvnuUu = var0;
      if (!var0) {
         NnUuNNU();
      }
   }

   public static boolean UvnvNVnnnnNU() {
      return nuUnNvnuUu;
   }

   public static long uVUVnuvnuVuv() {
      return nUUVuvU;
   }

   public static long NVNnnvnuunNv() {
      return UnUNVVVNuv;
   }

   public static uUuUnVnnnVun uVunuUNVVUUV() {
      return vNVuvnUUnuUn;
   }

   public static float UNnVVNvvnVvU() {
      class_310 var0 = class_310.method_1551();
      if (var0.field_1724 != null && var0.field_1687 != null) {
         class_746 var1 = var0.field_1724;
         float var2 = UuUVuuUu(var1, 0.0F);
         float var3 = C00OOC00oO(var1);
         float var4 = uUVuVvuNUvnu();
         return var2 >= var4 ? 0.0F : Math.max(0.0F, (var4 - var2) * var3);
      } else {
         return Float.POSITIVE_INFINITY;
      }
   }

   public static void uNnUnnuNUnNu() {
      VVuuUN = false;
      vNUvnnVnUvu = false;
      vuuuNvNuv = 0L;
      nvUVNnuu = 0L;
      UuuNnUvUuv = 0L;
   }

   public static void NnUuNNU() {
      uNnUnnuNUnNu();
      uVUuuVnNVU = false;
   }

   private static void nNvNUVU() {
      uNnUnnuNUnNu();
      uVUuuVnNVU = true;
   }

   private static boolean UnUNuUU() {
      if (!VVuuUN) {
         return true;
      } else {
         return vNUvnnVnUvu ? false : System.currentTimeMillis() - vuuuNvNuv > 260L;
      }
   }

   private static boolean UuUVuuUu(class_746 var0) {
      return UuUVuuUu(var0, 0.0F) >= uUVuVvuNUvnu();
   }

   private static float UuUVuuUu(class_746 var0, float var1) {
      float var2 = Math.max(0.0F, var1);
      double var3 = UVVNuuUvuu.UuUVuuUu();
      if (var3 > 0.0 && var3 < 19.95) {
         var2 *= (float)(var3 / 20.0);
      }

      return var0.method_7261(0.5F + var2);
   }

   private static float uUVuVvuNUvnu() {
      double var0 = UVVNuuUvuu.UuUVuuUu();
      return !(var0 <= 0.0) && !(var0 >= 19.95) ? class_3532.method_15363(0.9001F * (20.0F / (float)var0), 0.9001F, 0.995F) : 0.9001F;
   }

   private static float C00OOC00oO(class_746 var0) {
      double var1 = var0.method_45325(class_5134.field_23723);
      return !(var1 <= 0.0) && !Double.isNaN(var1) && !Double.isInfinite(var1) ? (float)(20.0 / var1) : 20.0F;
   }

   private static boolean C00OOC00oO(class_746 var0, class_310 var1) {
      if (var0.method_7325()) {
         return true;
      } else if (var0.method_5799()) {
         return true;
      } else if (var0.method_5771()) {
         return true;
      } else if (var0.method_5777(class_3486.field_15517)) {
         return true;
      } else if (var0.method_5777(class_3486.field_15518)) {
         return true;
      } else if (var0.method_5681()) {
         return true;
      } else if (var0.method_6101()) {
         return true;
      } else if (vVvUvVVuuNvV(var0, var1)) {
         return true;
      } else if (var0.method_6059(class_1294.field_5919)) {
         return true;
      } else if (var0.method_6059(class_1294.field_5906)) {
         return true;
      } else if (var0.method_6059(class_1294.field_5902)) {
         return true;
      } else if (var0.method_5765()) {
         return true;
      } else {
         return var0.method_31549().field_7479 ? true : var0.method_6128();
      }
   }

   private static boolean uUnuvNvvNU(class_746 var0) {
      return var0.method_5624() || nVuVUNvVV.uUnuvNvvNU();
   }

   private static boolean uUnuvNvvNU(class_746 var0, class_310 var1) {
      if (var1.field_1687 == null) {
         return false;
      } else {
         class_238 var2 = var0.method_5829().method_989(0.0, 0.015, 0.0).method_1011(1.0E-7);
         return var1.field_1687.method_8587(var0, var2);
      }
   }

   private static boolean vVvUvVVuuNvV(class_746 var0, class_310 var1) {
      if (var1.field_1687 == null) {
         return false;
      } else {
         class_238 var2 = var0.method_5829().method_1011(1.0E-7);
         int var3 = class_3532.method_15357(var2.field_1323);
         int var4 = class_3532.method_15357(var2.field_1320);
         int var5 = class_3532.method_15357(var2.field_1322);
         int var6 = class_3532.method_15357(var2.field_1325);
         int var7 = class_3532.method_15357(var2.field_1321);
         int var8 = class_3532.method_15357(var2.field_1324);
         class_2339 var9 = new class_2339();

         for (int var10 = var3; var10 <= var4; var10++) {
            for (int var11 = var5; var11 <= var6; var11++) {
               for (int var12 = var7; var12 <= var8; var12++) {
                  var9.method_10103(var10, var11, var12);
                  if (var1.field_1687.method_8320(var9).method_27852(class_2246.field_10343)) {
                     return true;
                  }
               }
            }
         }

         return false;
      }
   }
}
