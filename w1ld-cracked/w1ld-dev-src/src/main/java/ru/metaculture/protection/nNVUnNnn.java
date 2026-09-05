package ru.metaculture.protection;

import java.security.SecureRandom;
import net.minecraft.class_1268;
import net.minecraft.class_1309;
import net.minecraft.class_243;
import net.minecraft.class_3532;

public final class nNVUnNnn implements O000c0oocoo {
   private static final SecureRandom UuUVuuUu = new SecureRandom();
   private static final long C00OOC00oO = 3500L;
   private static final int uUnuvNvvNU = 31;
   private static final long vVvUvVVuuNvV = 250L;
   private static final long uNNnnnuuuN = 238L;
   private static int nuUnNvnuUu;
   private static int VVuuUN = -1;
   private static boolean vNUvnnVnUvu;

   private nNVUnNnn() {
   }

   public static void UuUVuuUu(class_1309 var0) {
      if (a_.field_1724 != null && var0 != null) {
         vNUvnnVnUvu = true;
         uuUuvNuNVNVU var1 = new uuUuvNuNVNVU(a_.field_1724);
         uuUuvNuNVNVU var2 = C00OOC00oO(var0);
         float[] var3 = AttackAura.C00OOC00oO(var0);
         boolean var4 = oCCO0cc0C0Oc.UuUVuuUu(var0, false, false, true, 0L, var3);
         boolean var5 = oCCO0cc0C0Oc.UuUVuuUu(var0, false, false, true, -50L, var3);
         uuUuvNuNVNVU var6;
         if (a_.field_1761 == null) {
            var6 = nvNVUnVUUnun.UuUVuuUu(var1, var2, var0);
         } else {
            var6 = UuUVuuUu(var1, var2, var0, var4, var5);
         }

         UuUVuuUu(var6);
      }
   }

   public static void UuUVuuUu() {
      if (vNUvnnVnUvu && a_.field_1724 != null) {
         uuUuvNuNVNVU var0 = new uuUuvNuNVNVU(a_.field_1724);
         uuUuvNuNVNVU var1 = new uuUuvNuNVNVU(NNvvnnunn.uUnuvNvvNU, NNvvnnunn.vVvUvVVuuNvV);
         if (var0.UuUVuuUu(var1) < 1.0F) {
            vNUvnnVnUvu = false;
         } else {
            UuUVuuUu(UuUVuuUu(var0, var1, null, false, false));
         }
      }
   }

   public static void C00OOC00oO() {
      nuUnNvnuUu++;
   }

   public static void uUnuvNvvNU() {
      nuUnNvnuUu = 0;
      VVuuUN = -1;
      vNUvnnVnUvu = false;
   }

   private static uuUuvNuNVNVU UuUVuuUu(uuUuvNuNVNVU var0, uuUuvNuNVNVU var1, class_1309 var2, boolean var3, boolean var4) {
      long var5 = (long)oCCO0cc0C0Oc.vNVuvnUUnuUn();
      uuUuvNuNVNVU var7 = UuUVuuUu(var0, var1);
      float var8 = var7.UuUVuuUu;
      float var9 = var7.C00OOC00oO;
      float var10 = (float)Math.hypot(Math.abs(var8), Math.abs(var9));
      if (var10 < 1.0E-4F) {
         var10 = 1.0E-4F;
      }

      boolean var11 = nuUnNvnuUu > 0 && nuUnNvnuUu % 31 == 0 && var5 < 250L;
      if (var11) {
         if (var5 >= 238L && VVuuUN != nuUnNvnuUu) {
            a_.field_1724.method_6104(class_1268.field_5808);
            VVuuUN = nuUnNvnuUu;
         }

         float var12 = var0.UuUVuuUu + class_3532.method_15363(var8, -22.0F, 22.0F);
         return new uuUuvNuNVNVU(var12, -85.0F);
      } else {
         return var2 != null ? UuUVuuUu(var0, var8, var9, var10, var2, var3, var4, var5) : UuUVuuUu(var0, var8, var9, var10, var5);
      }
   }

   private static uuUuvNuNVNVU UuUVuuUu(uuUuvNuNVNVU var0, float var1, float var2, float var3, class_1309 var4, boolean var5, boolean var6, long var7) {
      boolean var9 = a_.field_1724.method_5739(var4) <= AttackAura.UuUVuuUu(var4);
      boolean var10 = var7 < 180L;
      float var11 = UuUVuuUu(18.0F, 28.0F);
      float var12 = UuUVuuUu(2.8F, 6.2F);
      if (var6) {
         var11 = Math.max(var11, UuUVuuUu(34.0F, 52.0F));
         var12 = Math.max(var12, UuUVuuUu(4.2F, 7.8F));
      }

      if (var10) {
         var11 = Math.max(var11, UuUVuuUu(44.0F, 72.0F));
         var12 = Math.max(var12, UuUVuuUu(5.4F, 10.0F));
      }

      if (Math.abs(var1) > 40.0F) {
         var11 += UuUVuuUu(10.0F, 18.0F);
      }

      if (Math.abs(var1) > 75.0F) {
         var11 += UuUVuuUu(12.0F, 24.0F);
      }

      if (Math.abs(var2) > 20.0F) {
         var12 += UuUVuuUu(1.4F, 3.2F);
      }

      if (Math.abs(var2) > 35.0F) {
         var12 += UuUVuuUu(1.6F, 3.8F);
      }

      float var13 = UuUVuuUu(var1, var3, var11);
      float var14 = UuUVuuUu(var2, var3, var12);
      float var15 = class_3532.method_15363(var1, -var13, var13);
      float var16 = class_3532.method_15363(var2, -var14, var14);
      float var17 = var5 ? 1.0F : (var6 ? UuUVuuUu(0.88F, 0.97F) : (var10 ? UuUVuuUu(0.74F, 0.88F) : UuUVuuUu(0.56F, 0.74F)));
      if (var9 && !var6 && !var10) {
         var17 = Math.max(var17, UuUVuuUu(0.68F, 0.82F));
      }

      float var18 = var9 ? 1.25F : 0.9F;
      if (var6) {
         var18 = Math.max(var18, 1.4F);
      }

      if (var10) {
         var18 = Math.max(var18, 1.55F);
      }

      float var19 = UuUVuuUu(var7, nuUnNvnuUu, var18, Math.abs(var1));
      float var20 = C00OOC00oO(var7, nuUnNvnuUu, var18, Math.abs(var2));
      if (Math.abs(var1) < 4.0F) {
         var19 *= 0.35F;
      }

      if (Math.abs(var2) < 2.5F) {
         var20 *= 0.25F;
      }

      float var21 = C00OOC00oO(var17, var0.UuUVuuUu, var0.UuUVuuUu + var15) + var19;
      float var22 = C00OOC00oO(var17, var0.C00OOC00oO, var0.C00OOC00oO + var16) + var20;
      return new uuUuvNuNVNVU(var21, class_3532.method_15363(var22, -90.0F, 90.0F));
   }

   private static uuUuvNuNVNVU UuUVuuUu(uuUuvNuNVNVU var0, float var1, float var2, float var3, long var4) {
      uuUuvNuNVNVU var6 = switch (nuUnNvnuUu % 4) {
         case 0 -> new uuUuvNuNVNVU((float)Math.cos((float)var4 / 40.0F + nuUnNvnuUu % 6), (float)Math.sin((float)var4 / 40.0F + nuUnNvnuUu % 6));
         case 1 -> new uuUuvNuNVNVU((float)Math.sin((float)var4 / 40.0F + nuUnNvnuUu % 6), (float)Math.cos((float)var4 / 40.0F + nuUnNvnuUu % 6));
         case 2 -> new uuUuvNuNVNVU((float)Math.sin((float)var4 / 40.0F + nuUnNvnuUu % 6), (float)(-Math.cos((float)var4 / 40.0F + nuUnNvnuUu % 6)));
         default -> new uuUuvNuNVNVU((float)(-Math.cos((float)var4 / 40.0F + nuUnNvnuUu % 6)), (float)Math.sin((float)var4 / 40.0F + nuUnNvnuUu % 6));
      };
      float var7 = class_3532.method_15363((float)var4 / 3500.0F, 0.0F, 1.0F);
      float var8 = var4 >= 3500L ? 0.0F : 1.0F - var7 * 0.55F;
      float var9 = var8 > 0.0F ? UuUVuuUu(12.0F, 22.0F) * var6.UuUVuuUu * var8 : 0.0F;
      float var10 = UuUVuuUu(0.35F, 1.35F) * (float)Math.cos(System.currentTimeMillis() / 420.0 + nuUnNvnuUu);
      float var11 = var8 > 0.0F ? (UuUVuuUu(2.2F, 5.8F) * var6.C00OOC00oO + var10) * var8 : 0.0F;
      float var12 = var4 < 180L
         ? UuUVuuUu(0.0F, 3.5F)
         : (var4 < 600L ? UuUVuuUu(4.0F, 10.0F) : (var4 >= 3500L ? UuUVuuUu(12.0F, 28.0F) : UuUVuuUu(6.0F, 14.0F)));
      float var13 = var4 < 180L ? UuUVuuUu(0.0F, 1.0F) : (var4 < 600L ? UuUVuuUu(1.2F, 3.0F) : (var4 >= 3500L ? UuUVuuUu(3.0F, 6.8F) : UuUVuuUu(1.5F, 4.2F)));
      float var14 = UuUVuuUu(var1, var3, var12);
      float var15 = UuUVuuUu(var2, var3, var13);
      float var16 = class_3532.method_15363(var1, -var14, var14);
      float var17 = class_3532.method_15363(var2, -var15, var15);
      float var18 = var4 < 180L ? 0.0F : (var4 < 600L ? UuUVuuUu(0.08F, 0.22F) : (var4 >= 3500L ? UuUVuuUu(0.54F, 0.78F) : UuUVuuUu(0.2F, 0.42F)));
      float var19 = C00OOC00oO(var18, var0.UuUVuuUu, var0.UuUVuuUu + var16) + var9;
      float var20 = C00OOC00oO(var18, var0.C00OOC00oO, var0.C00OOC00oO + var17) + var11;
      return new uuUuvNuNVNVU(var19, class_3532.method_15363(var20, -90.0F, 90.0F));
   }

   private static uuUuvNuNVNVU C00OOC00oO(class_1309 var0) {
      class_243 var1 = nVvuVvVNVUun.C00OOC00oO(var0.method_5829());
      class_243 var2 = var1.method_1020(a_.field_1724.method_33571());
      return new uuUuvNuNVNVU(
         (float)class_3532.method_15338(Math.toDegrees(Math.atan2(var2.field_1350, var2.field_1352)) - 90.0),
         (float)class_3532.method_15338(Math.toDegrees(-Math.atan2(var2.field_1351, Math.hypot(var2.field_1352, var2.field_1350))))
      );
   }

   private static uuUuvNuNVNVU UuUVuuUu(uuUuvNuNVNVU var0, uuUuvNuNVNVU var1) {
      return new uuUuvNuNVNVU(
         class_3532.method_15393(var1.UuUVuuUu - var0.UuUVuuUu),
         class_3532.method_15363(class_3532.method_15393(var1.C00OOC00oO - var0.C00OOC00oO), -90.0F, 90.0F)
      );
   }

   private static void UuUVuuUu(uuUuvNuNVNVU var0) {
      COC0OCc.UuUVuuUu(var0, 360.0F, 360.0F, 45.0F, 45.0F, 0, 15, false);
   }

   private static float UuUVuuUu(long var0, int var2, float var3, float var4) {
      float var5 = (float)Math.sin((float)var0 / 38.0F + var2 * 0.37F) * UuUVuuUu(0.45F, 1.25F)
         + (float)Math.cos((float)var0 / 71.0F + var2 * 0.18F) * UuUVuuUu(0.18F, 0.55F);
      if (UuUVuuUu(var4 > 24.0F ? 0.22F : 0.08F)) {
         var5 += UuUVuuUu(-1.55F, 1.55F);
      }

      return var5 * var3;
   }

   private static float C00OOC00oO(long var0, int var2, float var3, float var4) {
      float var5 = (float)Math.sin((float)var0 / 52.0F + var2 * 0.21F) * UuUVuuUu(0.1F, 0.42F)
         + (float)Math.cos((float)var0 / 93.0F + var2 * 0.11F) * UuUVuuUu(0.08F, 0.28F);
      if (UuUVuuUu(var4 > 8.0F ? 0.18F : 0.06F)) {
         var5 += UuUVuuUu(-0.55F, 0.55F);
      }

      return var5 * var3;
   }

   private static float UuUVuuUu(float var0, float var1, float var2) {
      return Math.abs(var0 / var1) * var2;
   }

   private static boolean UuUVuuUu(float var0) {
      return UuUVuuUu.nextFloat() < var0;
   }

   private static float UuUVuuUu(float var0, float var1) {
      return C00OOC00oO(UuUVuuUu.nextFloat(), var0, var1);
   }

   private static float C00OOC00oO(float var0, float var1, float var2) {
      return var1 + var0 * (var2 - var1);
   }
}
