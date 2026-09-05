package ru.metaculture.protection;

import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_1309;
import net.minecraft.class_243;
import net.minecraft.class_3532;

public class vnvuUunNvUUU implements O000c0oocoo {
   private static float UuUVuuUu;
   private static float C00OOC00oO;
   private static int uUnuvNvvNU;
   private static boolean vVvUvVVuuNvV;
   private static long uNNnnnuuuN;
   private static float nuUnNvnuUu = 2.5F;
   private static float VVuuUN = 1.2F;
   private static boolean vNUvnnVnUvu;
   private static long uVUuuVnNVU;
   private static long vuuuNvNuv = System.currentTimeMillis() + ThreadLocalRandom.current().nextLong(8500L, 14000L);

   public static void UuUVuuUu() {
      vVvUvVVuuNvV = false;
      uUnuvNvvNU = 0;
      vNUvnnVnUvu = false;
      uNNnnnuuuN = 0L;
      vuuuNvNuv = System.currentTimeMillis() + ThreadLocalRandom.current().nextLong(8500L, 14000L);
   }

   public static void UuUVuuUu(class_1309 var0) {
      if (a_.field_1724 != null) {
         long var1 = System.currentTimeMillis();
         if (!vVvUvVVuuNvV) {
            UuUVuuUu = a_.field_1724.method_36454();
            C00OOC00oO = a_.field_1724.method_36455();
            vVvUvVVuuNvV = true;
         }

         if (var1 >= uNNnnnuuuN) {
            nuUnNvnuUu = VnNnNnvuvn.vVvUvVVuuNvV(1.6F, 4.6F);
            VVuuUN = VnNnNnvuvn.vVvUvVVuuNvV(0.8F, 2.4F);
            uNNnnnuuuN = var1 + ThreadLocalRandom.current().nextLong(140L, 260L);
         }

         if (!vNUvnnVnUvu && var1 >= vuuuNvNuv) {
            vNUvnnVnUvu = true;
            uVUuuVnNVU = var1 + ThreadLocalRandom.current().nextLong(170L, 290L);
            vuuuNvNuv = var1 + ThreadLocalRandom.current().nextLong(7800L, 13500L);
         }

         if (vNUvnnVnUvu && var1 >= uVUuuVnNVU) {
            vNUvnnVnUvu = false;
         }

         class_243 var3 = uvnuUUnunNn.C00OOC00oO(var0);
         float var4 = (float)Math.toDegrees(Math.atan2(-var3.field_1352, var3.field_1350));
         float var5 = (float)class_3532.method_15350(-Math.toDegrees(Math.atan2(var3.field_1351, Math.hypot(var3.field_1352, var3.field_1350))), -90.0, 90.0);
         float[] var6 = AttackAura.C00OOC00oO(var0);
         float[] var7 = new float[]{var6[0], var6[1], var6[0] + var6[1]};
         boolean var8 = oCCO0cc0C0Oc.UuUVuuUu(var0, false, true, true, -45L, var7);
         if (var8) {
            uUnuvNvvNU = 2;
         }

         boolean var9 = uUnuvNvvNU > 0;
         if (uUnuvNvvNU > 0) {
            uUnuvNvvNU--;
         }

         float var10 = class_3532.method_15393(var4 - UuUVuuUu);
         float var11 = var5 - C00OOC00oO;
         float var12 = var9 ? class_3532.method_15363(var10 * 0.92F, -56.0F, 56.0F) : class_3532.method_15363(var10 * 0.34F, -17.0F, 17.0F);
         float var13 = var9 ? class_3532.method_15363(var11 * 0.84F, -46.0F, 46.0F) : class_3532.method_15363(var11 * 0.3F, -12.0F, 12.0F);
         UuUVuuUu += var12;
         C00OOC00oO += var13;
         float var14 = (float)Math.sin(var1 / 65.0);
         float var15 = (float)Math.cos(var1 / 48.0);
         UuUVuuUu = UuUVuuUu + var14 * nuUnNvnuUu;
         C00OOC00oO = C00OOC00oO + var15 * VVuuUN;
         if (vNUvnnVnUvu) {
            C00OOC00oO = class_3532.method_15363(C00OOC00oO - VnNnNnvuvn.vVvUvVVuuNvV(7.5F, 12.5F), -89.0F, 89.0F);
         }

         float var16 = UuUVuuUu;
         float var17 = class_3532.method_15363(C00OOC00oO, -89.5F, 89.5F);
         float var18 = var9 ? VnNnNnvuvn.vVvUvVVuuNvV(66.0F, 94.0F) : VnNnNnvuvn.vVvUvVVuuNvV(26.0F, 44.0F);
         float var19 = var9 ? VnNnNnvuvn.vVvUvVVuuNvV(104.0F, 146.0F) : VnNnNnvuvn.vVvUvVVuuNvV(34.0F, 58.0F);
         COC0OCc.UuUVuuUu(
            new uuUuvNuNVNVU(var16, var17), var18, var19, VnNnNnvuvn.UuUVuuUu(30, 48), VnNnNnvuvn.UuUVuuUu(16, 34), VnNnNnvuvn.UuUVuuUu(0, 3), 15, false
         );
      }
   }
}
