package ru.metaculture.protection;

import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_1309;
import net.minecraft.class_243;
import net.minecraft.class_3532;

public class vnvuUVnUVnn implements O000c0oocoo {
   static float UuUVuuUu;
   static float C00OOC00oO;
   static float uUnuvNvvNU;
   public static long vVvUvVVuuNvV = 0L;
   public static long uNNnnnuuuN = ThreadLocalRandom.current().nextLong(90000L, 180000L);
   public static boolean nuUnNvnuUu = false;
   public static long VVuuUN = 0L;
   public static int vNUvnnVnUvu = 0;

   public static void UuUVuuUu(class_1309 var0) {
      long var1 = System.currentTimeMillis();
      if (!nuUnNvnuUu && var1 - vVvUvVVuuNvV >= uNNnnnuuuN) {
         nuUnNvnuUu = true;
         VVuuUN = var1;
         vNUvnnVnUvu = ThreadLocalRandom.current().nextInt(300, 400);
         vVvUvVVuuNvV = var1;
         uNNnnnuuuN = ThreadLocalRandom.current().nextLong(9100L, 11200L);
      }

      boolean var3 = false;
      if (nuUnNvnuUu && var1 - VVuuUN >= vNUvnnVnUvu) {
         nuUnNvnuUu = false;
      }

      if (var1 - VVuuUN >= vNUvnnVnUvu + 70L) {
         var3 = true;
      }

      class_243 var4 = uvnuUUnunNn.C00OOC00oO(var0);
      float var5 = (float)Math.toDegrees(Math.atan2(-var4.field_1352, var4.field_1350));
      float var6 = (float)class_3532.method_15350(-Math.toDegrees(Math.atan2(var4.field_1351, Math.hypot(var4.field_1352, var4.field_1350))), -90.0, 90.0);
      float[] var7 = AttackAura.C00OOC00oO(var0);
      float[] var8 = new float[]{var7[0], var7[1], var7[0] + var7[1]};
      boolean var9 = oCCO0cc0C0Oc.UuUVuuUu(var0, false, true, true, -50L, var8);
      float var10 = a_.field_1724.method_36454();
      float var11 = Math.abs(class_3532.method_15393(var10 - var5));
      float var12 = VnNnNnvuvn.vVvUvVVuuNvV(62.0F, 84.0F);
      float var13 = !var3 ? VnNnNnvuvn.vVvUvVVuuNvV(120.0F, 170.0F) : VnNnNnvuvn.vVvUvVVuuNvV(9.0F, 13.0F);
      if (var9) {
         UuUVuuUu = 2.0F;
      }

      boolean var14 = false;
      if (UuUVuuUu > 0.0F) {
         var14 = true;
         UuUVuuUu--;
      }

      float var15 = (float)Math.cos(System.currentTimeMillis() / 40.0);
      float var16 = (float)Math.sin(System.currentTimeMillis() / 70.0);
      if (var14) {
         C00OOC00oO = var5;
         uUnuvNvvNU = var6;
      }

      float var17 = var15 * VnNnNnvuvn.vVvUvVVuuNvV(9.0F, 17.0F);
      float var18 = var16 * VnNnNnvuvn.vVvUvVVuuNvV(4.0F, 13.0F);
      float var19 = nuUnNvnuUu ? -VnNnNnvuvn.vVvUvVVuuNvV(85.0F, 90.0F) : uUnuvNvvNU;
      COC0OCc.UuUVuuUu(
         new uuUuvNuNVNVU(C00OOC00oO + var17, var19 + var18),
         var12,
         var13,
         VnNnNnvuvn.UuUVuuUu(35, 45),
         VnNnNnvuvn.UuUVuuUu(19, 45),
         VnNnNnvuvn.UuUVuuUu(0, 3),
         15,
         false
      );
   }
}
