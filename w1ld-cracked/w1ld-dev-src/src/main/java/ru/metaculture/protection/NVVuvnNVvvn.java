package ru.metaculture.protection;

import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_1309;
import net.minecraft.class_243;
import net.minecraft.class_3532;

@uNUunUnnnVu(
   uUnuvNvvNU = {"lichoday"}
)
public final class NVVuvnNVvvn implements O000c0oocoo {
   private static final double UuUVuuUu = 115.0;
   private static final float C00OOC00oO = 4.5F;
   private static final float uUnuvNvvNU = 3.0F;
   private static final COC0OCc.NVnVnNnN vVvUvVVuuNvV = NVVuvnNVvvn::nuUnNvnuUu;
   private static final NVVuvnNVvvn.NVnVnNnN uNNnnnuuuN = new NVVuvnNVvvn.NVnVnNnN();

   private NVVuvnNVvvn() {
   }

   public static String UuUVuuUu() {
      return "FTTESTT";
   }

   public static boolean C00OOC00oO() {
      return uVvnVvvUVUv.UuUVuuUu(NVVuvnNVvvn.class.getAnnotation(uNUunUnnnVu.class));
   }

   public static void UuUVuuUu(class_1309 var0) {
      if (a_.field_1724 != null && var0 != null) {
         uNNnnnuuuN.UuUVuuUu = true;
         uuUuvNuNVNVU var1 = new uuUuvNuNVNVU(a_.field_1724);
         uuUuvNuNVNVU var2 = C00OOC00oO(var0);
         UuUVuuUu(UuUVuuUu(var1, var2, var0));
      }
   }

   public static void uUnuvNvvNU() {
   }

   public static void vVvUvVVuuNvV() {
      if (a_.field_1724 == null) {
         uNNnnnuuuN();
      } else if (uNNnnnuuuN.UuUVuuUu && !COC0OCc.UuUVuuUu.equals(COC0OCc.VvunVVUvUNnv.RESET)) {
         uuUuvNuNVNVU var0 = new uuUuvNuNVNVU(a_.field_1724);
         uuUuvNuNVNVU var1 = new uuUuvNuNVNVU(NNvvnnunn.uUnuvNvvNU, NNvvnnunn.vVvUvVVuuNvV);
         if (var0.UuUVuuUu(var1) < 1.0F) {
            COC0OCc.UuUVuuUu = COC0OCc.VvunVVUvUNnv.IDLE;
            COC0OCc.nuUnNvnuUu = 0;
            COC0OCc.vuuuNvNuv = false;
            COC0OCc.uVUuuVnNVU = null;
            COC0OCc.vNUvnnVnUvu = 0;
            COC0OCc.C00OOC00oO(vVvUvVVuuNvV);
            NNvvnnunn.UuUVuuUu = NNvvnnunn.C00OOC00oO;
            uNNnnnuuuN();
         } else {
            UuUVuuUu(UuUVuuUu(var0, var1, null));
         }
      }
   }

   public static void uNNnnnuuuN() {
      uNNnnnuuuN.C00OOC00oO();
      COC0OCc.C00OOC00oO(vVvUvVVuuNvV);
   }

   static uuUuvNuNVNVU UuUVuuUu(uuUuvNuNVNVU var0, uuUuvNuNVNVU var1, class_1309 var2) {
      if (a_.field_1724 == null) {
         return var0;
      } else {
         boolean var3 = var2 != null;
         if (var3 && vNUnvuN.UuUVuuUu(var2, 1)) {
            uNNnnnuuuN.C00OOC00oO = -1L;
            double var13 = uNNnnnuuuN.UuUVuuUu();
            float var14 = UuUVuuUu(var13) + (float)(Math.sin(var13 / 28.0) * UuUVuuUu(2.5F, 5.5F));
            float var15 = C00OOC00oO(var13) + (float)(Math.cos(var13 / 21.0) * UuUVuuUu(1.5F, 3.5F));
            return UuUVuuUu(var0, var1, 145.0F, 135.0F, 0.9F, var14, var15);
         } else {
            uuUuvNuNVNVU var4 = new uuUuvNuNVNVU(a_.field_1724.method_36454(), a_.field_1724.method_36455());
            uuUuvNuNVNVU var5 = UuUVuuUu(var0, var4);
            float var6 = Math.max((float)Math.hypot(Math.abs(var5.UuUVuuUu), Math.abs(var5.C00OOC00oO)), 1.0E-4F);
            double var7 = uNNnnnuuuN.UuUVuuUu();
            float var9 = UuUVuuUu(var7) + (float)(UuUVuuUu(8, 22) * Math.sin(var7 / 72.0) + UuUVuuUu(2, 6) * Math.sin(var7 / 19.0));
            float var10 = C00OOC00oO(var7) + (float)(UuUVuuUu(8, 13) * Math.cos(var7 / 38.0) + UuUVuuUu(1, 4) * Math.cos(var7 / 16.0));
            if (!var3) {
               if (uNNnnnuuuN.C00OOC00oO < 0L) {
                  uNNnnnuuuN.C00OOC00oO = uNNnnnuuuN.UuUVuuUu();
               }

               float var11 = 1.0F - class_3532.method_15363((float)(uNNnnnuuuN.UuUVuuUu() - uNNnnnuuuN.C00OOC00oO) / 1000.0F, 0.0F, 1.0F);
               var9 *= var11;
               var10 *= var11;
            } else {
               uNNnnnuuuN.C00OOC00oO = -1L;
            }

            float var16 = Math.abs(var5.UuUVuuUu / var6) * (oCCO0cc0C0Oc.C00OOC00oO(535L) ? 45.0F : 0.0F);
            float var12 = Math.abs(var5.C00OOC00oO / var6) * (oCCO0cc0C0Oc.C00OOC00oO(535L) ? 45.0F : 0.0F);
            return new uuUuvNuNVNVU(
               UuUVuuUu(0.85F, var0.UuUVuuUu, var0.UuUVuuUu + class_3532.method_15363(var5.UuUVuuUu, -var16, var16) + var9),
               class_3532.method_15363(
                  UuUVuuUu(0.85F, var0.C00OOC00oO, var0.C00OOC00oO + class_3532.method_15363(var5.C00OOC00oO, -var12, var12) + var10), -90.0F, 90.0F
               )
            );
         }
      }
   }

   private static COC0OCc.nvnNNunvv nuUnNvnuUu() {
      if (uNNnnnuuuN.UuUVuuUu && a_.field_1724 != null) {
         uuUuvNuNVNVU var0 = new uuUuvNuNVNVU(a_.field_1724);
         uuUuvNuNVNVU var1 = new uuUuvNuNVNVU(NNvvnnunn.uUnuvNvvNU, NNvvnnunn.vVvUvVVuuNvV);
         if (var0.UuUVuuUu(var1) < 1.0F) {
            uNNnnnuuuN();
            return COC0OCc.nvnNNunvv.UuUVuuUu();
         } else {
            uuUuvNuNVNVU var2 = UuUVuuUu(var0, var1, 360.0F, 360.0F, 1.0F, 0.0F, 0.0F);
            return new COC0OCc.nvnNNunvv(var2, 360.0F, 360.0F, false);
         }
      } else {
         uNNnnnuuuN();
         return COC0OCc.nvnNNunvv.UuUVuuUu();
      }
   }

   private static uuUuvNuNVNVU C00OOC00oO(class_1309 var0) {
      class_243 var1 = nVvuVvVNVUun.C00OOC00oO(var0.method_5829());
      class_243 var2 = var1.method_1020(a_.field_1724.method_33571());
      return new uuUuvNuNVNVU(
         (float)class_3532.method_15338(Math.toDegrees(Math.atan2(var2.field_1350, var2.field_1352)) - 90.0),
         (float)class_3532.method_15350(-Math.toDegrees(Math.atan2(var2.field_1351, Math.hypot(var2.field_1352, var2.field_1350))), -90.0, 90.0)
      );
   }

   private static void UuUVuuUu(uuUuvNuNVNVU var0) {
      COC0OCc.UuUVuuUu(var0, 360.0F, 360.0F, 45.0F, 45.0F, 0, 15, false, vVvUvVVuuNvV);
   }

   private static float UuUVuuUu(double var0) {
      return (float)Math.sin(var0 / 115.0) * 4.5F;
   }

   private static float C00OOC00oO(double var0) {
      return (float)Math.cos(var0 / 115.0) * 3.0F;
   }

   private static uuUuvNuNVNVU UuUVuuUu(uuUuvNuNVNVU var0, uuUuvNuNVNVU var1, float var2, float var3, float var4, float var5, float var6) {
      uuUuvNuNVNVU var7 = UuUVuuUu(var0, var1);
      float var8 = Math.max((float)Math.hypot(Math.abs(var7.UuUVuuUu), Math.abs(var7.C00OOC00oO)), 1.0E-4F);
      float var9 = Math.abs(var7.UuUVuuUu / var8) * var2;
      float var10 = Math.abs(var7.C00OOC00oO / var8) * var3;
      return new uuUuvNuNVNVU(
         UuUVuuUu(var4, var0.UuUVuuUu, var0.UuUVuuUu + class_3532.method_15363(var7.UuUVuuUu, -var9, var9) + var5),
         class_3532.method_15363(
            UuUVuuUu(var4, var0.C00OOC00oO, var0.C00OOC00oO + class_3532.method_15363(var7.C00OOC00oO, -var10, var10) + var6), -90.0F, 90.0F
         )
      );
   }

   private static uuUuvNuNVNVU UuUVuuUu(uuUuvNuNVNVU var0, uuUuvNuNVNVU var1) {
      return new uuUuvNuNVNVU(
         class_3532.method_15393(var1.UuUVuuUu - var0.UuUVuuUu),
         class_3532.method_15363(class_3532.method_15393(var1.C00OOC00oO - var0.C00OOC00oO), -90.0F, 90.0F)
      );
   }

   private static float UuUVuuUu(float var0, float var1) {
      return (float)ThreadLocalRandom.current().nextDouble(var0, var1);
   }

   private static int UuUVuuUu(int var0, int var1) {
      return ThreadLocalRandom.current().nextInt(var0, var1 + 1);
   }

   private static float UuUVuuUu(float var0, float var1, float var2) {
      return var1 + var0 * (var2 - var1);
   }

   static final class NVnVnNnN {
      boolean UuUVuuUu;
      long C00OOC00oO = -1L;

      long UuUVuuUu() {
         return System.currentTimeMillis();
      }

      void C00OOC00oO() {
         this.UuUVuuUu = false;
         this.C00OOC00oO = -1L;
      }
   }
}
