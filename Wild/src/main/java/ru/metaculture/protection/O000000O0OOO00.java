package ru.metaculture.protection;

import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class O000000O0OOO00 implements MinecraftAccessor {
   static float O00000000;
   static float O000000000 = 0.0F;

   public static void O00000000(LivingEntity livingEntity, boolean bl, float f, boolean bl2) {
      long var4 = System.currentTimeMillis();
      if (!AttackAura.O00000000OO0O && var4 - AttackAura.O00000000OO000 >= AttackAura.O00000000OO00O) {
         AttackAura.O00000000OO0O = true;
         AttackAura.O00000000OO0O0 = var4;
         AttackAura.O00000000OO0OO = ThreadLocalRandom.current().nextInt(270, 390);
         AttackAura.O00000000OO000 = var4;
         AttackAura.O00000000OO00O = ThreadLocalRandom.current().nextLong(16500L, 23200L);
      }

      boolean var6 = false;
      if (AttackAura.O00000000OO0O && var4 - AttackAura.O00000000OO0O0 >= AttackAura.O00000000OO0OO) {
         AttackAura.O00000000OO0O = false;
      }

      if (var4 - AttackAura.O00000000OO0O0 >= AttackAura.O00000000OO0OO + 60L) {
         var6 = true;
      }

      Vec3d var7 = O000000O0O000.O000000000(livingEntity.getBoundingBox()).subtract(a_.player.getEyePos());
      float var8 = O000000O0O00O.O0000000000;
      if (bl && O000000O0O.O00000000((Entity)livingEntity) < f && !bl2) {
         O00000000 = O0000O000OOOOO.O00000000000(6.0F, 7.0F);
      }

      float var9 = (float)O000000O0O.O0000000000000(livingEntity);
      float var10 = 360.0F;
      float var11 = O0000O000OOOOO.O00000000000(22.0F, 29.0F);
      float var12 = 0.0F;
      float var13 = O0000O000OOOOO.O00000000000(0.0F, 3.5F);
      float var14 = (float)Math.cos(System.currentTimeMillis() / 30.0);
      float var15 = (float)Math.sin(System.currentTimeMillis() / 50.0);
      if (O00000000 > 0.0F && Math.abs(var9) < var10) {
         var11 = O0000O000OOOOO.O00000000000(90.0F, 120.0F);
         var8 = (float)Math.toDegrees(Math.atan2(-var7.x, var7.z));
         var12 = (var14 + var15) * O000000O0OO0OO.O00000000(1.0F, 6.0F);
         O00000000--;
      }

      float var16 = (float)MathHelper.clamp(-Math.toDegrees(Math.atan2(var7.y, Math.hypot(var7.x, var7.z))), -90.0, 90.0);
      float var17 = var14 * O000000O0OO0OO.O00000000(11.0F, 24.0F) + var12;
      float var18 = var15 * O000000O0OO0OO.O00000000(4.0F, 17.0F) + var12;
      if (bl && O000000O0O.O00000000((Entity)livingEntity) < f && !bl2) {
         O000000000 = var16;
      }

      float var20 = AttackAura.O00000000OO0O ? -O0000O000OOOOO.O00000000000(85.0F, 90.0F) : var16;
      O000000O0O00OO var21 = new O000000O0O00OO(var8 + var17, var20 + var18);
      O000000O0O0O0.O00000000(
         var21,
         var11,
         AttackAura.O00000000OO0O
            ? O000000O0OO0OO.O00000000(120.0F, 170.0F)
            : (var6 ? O000000O0OO0OO.O00000000(120.0F, 170.0F) : O000000O0OO0OO.O00000000(6.0F, 8.0F)),
         25.0F,
         25.0F,
         0,
         15,
         false
      );
   }
}
