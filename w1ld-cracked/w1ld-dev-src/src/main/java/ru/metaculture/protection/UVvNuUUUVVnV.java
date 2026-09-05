package ru.metaculture.protection;

import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_243;
import net.minecraft.class_3532;

public class UVvNuUUUVVnV implements O000c0oocoo {
   static float UuUVuuUu;
   static float C00OOC00oO = 0.0F;

   public static void UuUVuuUu(class_1309 var0, boolean var1, float var2, boolean var3) {
      long var4 = System.currentTimeMillis();
      if (!AttackAura.UnvuVuVnNuvu && var4 - AttackAura.nNuVunNUVu >= AttackAura.UNvvunVVn) {
         AttackAura.UnvuVuVnNuvu = true;
         AttackAura.UvNNVUVNVuvV = var4;
         AttackAura.NnunUUnU = ThreadLocalRandom.current().nextInt(270, 390);
         AttackAura.nNuVunNUVu = var4;
         AttackAura.UNvvunVVn = ThreadLocalRandom.current().nextLong(16500L, 23200L);
      }

      boolean var6 = false;
      if (AttackAura.UnvuVuVnNuvu && var4 - AttackAura.UvNNVUVNVuvV >= AttackAura.NnunUUnU) {
         AttackAura.UnvuVuVnNuvu = false;
      }

      if (var4 - AttackAura.UvNNVUVNVuvV >= AttackAura.NnunUUnU + 60L) {
         var6 = true;
      }

      class_243 var7 = nVvuVvVNVUun.C00OOC00oO(var0.method_5829()).method_1020(a_.field_1724.method_33571());
      float var8 = NNvvnnunn.uUnuvNvvNU;
      if (var1 && uvnuUUnunNn.UuUVuuUu((class_1297)var0) < var2 && !var3) {
         UuUVuuUu = VnNnNnvuvn.vVvUvVVuuNvV(6.0F, 7.0F);
      }

      float var9 = (float)uvnuUUnunNn.nuUnNvnuUu(var0);
      float var10 = 360.0F;
      float var11 = VnNnNnvuvn.vVvUvVVuuNvV(22.0F, 29.0F);
      float var12 = 0.0F;
      float var13 = VnNnNnvuvn.vVvUvVVuuNvV(0.0F, 3.5F);
      float var14 = (float)Math.cos(System.currentTimeMillis() / 30.0);
      float var15 = (float)Math.sin(System.currentTimeMillis() / 50.0);
      if (UuUVuuUu > 0.0F && Math.abs(var9) < var10) {
         var11 = VnNnNnvuvn.vVvUvVVuuNvV(90.0F, 120.0F);
         var8 = (float)Math.toDegrees(Math.atan2(-var7.field_1352, var7.field_1350));
         var12 = (var14 + var15) * VvUNVunnuu.UuUVuuUu(1.0F, 6.0F);
         UuUVuuUu--;
      }

      float var16 = (float)class_3532.method_15350(-Math.toDegrees(Math.atan2(var7.field_1351, Math.hypot(var7.field_1352, var7.field_1350))), -90.0, 90.0);
      float var17 = var14 * VvUNVunnuu.UuUVuuUu(11.0F, 64.0F) + var12;
      float var18 = var15 * VvUNVunnuu.UuUVuuUu(4.0F, 17.0F) + var12;
      if (var1 && uvnuUUnunNn.UuUVuuUu((class_1297)var0) < var2 && !var3) {
         C00OOC00oO = var16;
      }

      float var20 = AttackAura.UnvuVuVnNuvu ? -VnNnNnvuvn.vVvUvVVuuNvV(85.0F, 90.0F) : var16;
      uuUuvNuNVNVU var21 = new uuUuvNuNVNVU(var8 + var17, var20 + var18);
      COC0OCc.UuUVuuUu(
         var21,
         var11,
         AttackAura.UnvuVuVnNuvu ? VvUNVunnuu.UuUVuuUu(60.0F, 170.0F) : (var6 ? VvUNVunnuu.UuUVuuUu(60.0F, 170.0F) : VvUNVunnuu.UuUVuuUu(6.0F, 8.0F)),
         25.0F,
         25.0F,
         0,
         15,
         false
      );
   }
}
