package ru.metaculture.protection;

import java.security.SecureRandom;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_1309;
import net.minecraft.class_243;
import net.minecraft.class_3532;

public final class nvNVUnVUUnun implements O000c0oocoo {
   private static final int UuUVuuUu = 41;
   private static final long C00OOC00oO = 60L;
   private static final long uUnuvNvvNU = 150L;
   private static final float vVvUvVVuuNvV = 250.0F;
   private static final float uNNnnnuuuN = 180.0F;
   private static final float nuUnNvnuUu = 90.0F;
   private static final int VVuuUN = 15;
   private static final boolean vNUvnnVnUvu = false;
   private static final COC0OCc.NVnVnNnN uVUuuVnNVU = nvNVUnVUUnun::nuUnNvnuUu;
   private static uuUuvNuNVNVU vuuuNvNuv = new uuUuvNuNVNVU(0.0F, 0.0F);
   private static uuUuvNuNVNVU nUUVuvU;
   private static class_1309 UnUNVVVNuv;
   private static boolean vNVuvnUUnuUn;
   private static boolean UvnvNVnnnnNU;
   private static boolean uVUVnuvnuVuv;
   private static int NVNnnvnuunNv;
   private static float uVunuUNVVUUV;
   private static float UNnVVNvvnVvU;
   private static float uNnUnnuNUnNu;
   private static float NnUuNNU;
   private static boolean nNvNUVU;

   private nvNVUnVUUnun() {
   }

   public static void UuUVuuUu(class_1309 var0) {
      if (a_.field_1724 == null) {
         vNUvnnVnUvu();
      } else {
         if (var0 != null && vNUnvuN.UuUVuuUu(var0, 1)) {
            nUUVuvU = C00OOC00oO(var0);
            UnUNVVVNuv = var0;
            vNVuvnUUnuUn = true;
            UvnvNVnnnnNU = true;
         }

         uNNnnnuuuN();
      }
   }

   public static void UuUVuuUu() {
      if (a_.field_1724 == null) {
         vNUvnnVnUvu();
      } else {
         uNNnnnuuuN();
      }
   }

   public static void C00OOC00oO() {
      vNUvnnVnUvu();
   }

   public static String uUnuvNvvNU() {
      return !UvnvNVnnnnNU ? "IDLE" : (uVUVnuvnuVuv ? "SNAP" : "RETURN");
   }

   public static void UuUVuuUu(uNVVnVUNun var0) {
      if (UvnvNVnnnnNU && a_.field_1724 != null && NNvvnnunn.UuUVuuUu && !vVvUvVVuuNvV()) {
         float var1 = (float)Math.toRadians(NNvvnnunn.uUnuvNvvNU - a_.field_1724.method_36454());
         float var2 = class_3532.method_15362(var1);
         float var3 = class_3532.method_15374(var1);
         float var4 = var0.uUnuvNvvNU();
         float var5 = var0.vVvUvVVuuNvV();
         var0.UuUVuuUu((float)Math.round(var4 * var2 + var5 * var3));
         var0.C00OOC00oO(Math.round(var5 * var2 - var4 * var3));
      }
   }

   private static boolean vVvUvVVuuNvV() {
      return AttackAura.ccOO0COcoco0 != null
         && (
            AttackAura.NVuunNnvvvVu.C00OOC00oO("Free")
               || AttackAura.NVuunNnvvvVu.C00OOC00oO("Target")
               || AttackAura.NVuunNnvvvVu.C00OOC00oO("Преследование")
               || AttackAura.vvUVNVvvNUv.C00OOC00oO("Тестовый")
         );
   }

   private static void uNNnnnuuuN() {
      vuuuNvNuv();
      if (!UvnvNVnnnnNU || a_.field_1724 == null || nUUVuvU == null) {
         vNVuvnUUnuUn = false;
      } else if (vNVuvnUUnuUn || !COC0OCc.UuUVuuUu.equals(COC0OCc.VvunVVUvUNnv.RESET)) {
         uuUuvNuNVNVU var0 = new uuUuvNuNVNVU(a_.field_1724);
         boolean var1 = !vNVuvnUUnuUn;
         vNVuvnUUnuUn = false;
         uVUVnuvnuVuv = !var1;
         if (var1) {
            if (NVNnnvnuunNv++ > 41) {
               UuUVuuUu(UuUVuuUu(var0, uVUuuVnNVU()));
               VVuuUN();
               return;
            }
         } else {
            NVNnnvnuunNv = 0;
         }

         UuUVuuUu(var1 ? UuUVuuUu(var0, uVUuuVnNVU(), null) : UuUVuuUu(var0, nUUVuvU, UnUNVVVNuv));
      }
   }

   public static uuUuvNuNVNVU UuUVuuUu(uuUuvNuNVNVU var0, uuUuvNuNVNVU var1, class_1309 var2) {
      if (a_.field_1724 == null) {
         return var0;
      } else {
         UUVuuNuvVuVv var3 = oCCO0cc0C0Oc.uVUVnuvnuVuv();
         int var4 = oCCO0cc0C0Oc.uUnuvNvvNU;
         double var5 = class_3532.method_15363(2.0F - (float)var3.C00OOC00oO() / (250.0F + UuUVuuUu(0.0, 10.0)), var4 % 5 / 100.0F + var4 % 2 / 4.0F, 1.0F);
         uuUuvNuNVNVU var7 = C00OOC00oO(
            var0,
            var2 != null
               ? var1
               : UuUVuuUu(var1, class_3532.method_16436(var5, 0.0, vuuuNvNuv.UuUVuuUu), class_3532.method_16436(var5, 0.0, vuuuNvNuv.C00OOC00oO))
         );
         float var8 = var7.UuUVuuUu;
         float var9 = var7.C00OOC00oO;
         float var10 = (float)Math.hypot(Math.abs(var8), Math.abs(var9));
         float var11 = Math.max(var10, 1.0E-4F);
         float var12 = Math.abs(var8 / var11) * 180.0F;
         float var13 = Math.abs(var9 / var11) * 180.0F;
         float var14 = class_3532.method_15363(var8, -var12, var12);
         float var15 = class_3532.method_15363(var9, -var13, var13);
         if (!var3.UuUVuuUu(20.0)) {
            return var0;
         } else if (var2 != null && vNUnvuN.UuUVuuUu(var2, 0) && var10 < 90.0F) {
            vuuuNvNuv = new uuUuvNuNVNVU(
               var14 < 0.0F ? UuUVuuUu(25.0, 40.0) : -UuUVuuUu(25.0, 40.0), var15 < 0.0F ? UuUVuuUu(10.0, 20.0) : -UuUVuuUu(10.0, 20.0)
            );
            return UuUVuuUu(var0, var14, var15);
         } else {
            return UuUVuuUu(
               var0,
               class_3532.method_16439(var2 == null && var3.UuUVuuUu(150.0) ? 1.0F : UuUVuuUu(0.5F, 0.65F), 0.0F, var14) + uVunuUNVVUUV,
               class_3532.method_16439(var2 == null && var3.UuUVuuUu(150.0) ? 1.0F : UuUVuuUu(0.5F, 0.65F), 0.0F, var15) + UNnVVNvvnVvU
            );
         }
      }
   }

   private static uuUuvNuNVNVU UuUVuuUu(uuUuvNuNVNVU var0, double var1, double var3) {
      return UuUVuuUu(var0, (float)var1, (float)var3);
   }

   private static uuUuvNuNVNVU UuUVuuUu(uuUuvNuNVNVU var0, float var1, float var2) {
      return new uuUuvNuNVNVU(var0.UuUVuuUu + var1, class_3532.method_15363(var0.C00OOC00oO + var2, -90.0F, 90.0F));
   }

   private static uuUuvNuNVNVU UuUVuuUu(uuUuvNuNVNVU var0, uuUuvNuNVNVU var1) {
      return var1;
   }

   private static COC0OCc.nvnNNunvv nuUnNvnuUu() {
      vuuuNvNuv();
      vNVuvnUUnuUn = false;
      if (UvnvNVnnnnNU && a_.field_1724 != null && nUUVuvU != null) {
         uVUVnuvnuVuv = false;
         uuUuvNuNVNVU var0 = new uuUuvNuNVNVU(a_.field_1724);
         if (NVNnnvnuunNv++ > 41) {
            uuUuvNuNVNVU var1 = UuUVuuUu(var0, uVUuuVnNVU());
            vNUvnnVnUvu();
            return new COC0OCc.nvnNNunvv(var1, 360.0F, 360.0F, false);
         } else {
            return new COC0OCc.nvnNNunvv(UuUVuuUu(var0, uVUuuVnNVU(), null), 360.0F, 360.0F, false);
         }
      } else {
         vNUvnnVnUvu();
         return COC0OCc.nvnNNunvv.UuUVuuUu();
      }
   }

   private static void UuUVuuUu(uuUuvNuNVNVU var0) {
      COC0OCc.UuUVuuUu(var0, 360.0F, 360.0F, 360.0F, 360.0F, 0, 15, false, uVUuuVnNVU);
   }

   private static void VVuuUN() {
      COC0OCc.UuUVuuUu = COC0OCc.VvunVVUvUNnv.IDLE;
      COC0OCc.nuUnNvnuUu = 0;
      COC0OCc.vuuuNvNuv = false;
      COC0OCc.uVUuuVnNVU = null;
      COC0OCc.vNUvnnVnUvu = 0;
      NNvvnnunn.UuUVuuUu = NNvvnnunn.C00OOC00oO;
      vNUvnnVnUvu();
   }

   private static void vNUvnnVnUvu() {
      UvnvNVnnnnNU = false;
      vNVuvnUUnuUn = false;
      nUUVuvU = null;
      UnUNVVVNuv = null;
      NVNnnvnuunNv = 0;
      uVunuUNVVUUV = 0.0F;
      UNnVVNvvnVvU = 0.0F;
      nNvNUVU = false;
      COC0OCc.C00OOC00oO(uVUuuVnNVU);
   }

   private static uuUuvNuNVNVU uVUuuVnNVU() {
      return new uuUuvNuNVNVU(NNvvnnunn.uUnuvNvvNU, NNvvnnunn.vVvUvVVuuNvV);
   }

   private static void vuuuNvNuv() {
      boolean var0 = NNvvnnunn.UuUVuuUu;
      float var1 = NNvvnnunn.uUnuvNvvNU;
      float var2 = NNvvnnunn.vVvUvVVuuNvV;
      uVunuUNVVUUV = 0.0F;
      UNnVVNvvnVvU = 0.0F;
      uNnUnnuNUnNu = var1;
      NnUuNNU = var2;
      nNvNUVU = var0;
   }

   private static uuUuvNuNVNVU C00OOC00oO(class_1309 var0) {
      class_243 var1 = nVvuVvVNVUun.C00OOC00oO(var0.method_5829());
      return UuUVuuUu(var1);
   }

   private static uuUuvNuNVNVU UuUVuuUu(class_243 var0) {
      class_243 var1 = var0.method_1020(a_.field_1724.method_33571());
      return new uuUuvNuNVNVU(
         (float)class_3532.method_15338(Math.toDegrees(Math.atan2(var1.field_1350, var1.field_1352)) - 90.0),
         (float)class_3532.method_15338(Math.toDegrees(-Math.atan2(var1.field_1351, Math.hypot(var1.field_1352, var1.field_1350))))
      );
   }

   private static uuUuvNuNVNVU C00OOC00oO(uuUuvNuNVNVU var0, uuUuvNuNVNVU var1) {
      return new uuUuvNuNVNVU(class_3532.method_15393(var1.UuUVuuUu - var0.UuUVuuUu), class_3532.method_15393(var1.C00OOC00oO - var0.C00OOC00oO));
   }

   private static float UuUVuuUu(float var0, float var1) {
      return class_3532.method_16439(new SecureRandom().nextFloat(), var0, var1);
   }

   private static float UuUVuuUu(double var0, double var2) {
      return (float)ThreadLocalRandom.current().nextDouble(var0, var2);
   }
}
