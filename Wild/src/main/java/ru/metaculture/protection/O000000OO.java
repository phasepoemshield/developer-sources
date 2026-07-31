package ru.metaculture.protection;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;

public final class O000000OO {
   private int O00000000 = -1;

   void O00000000(O000000O0O00OO o000000O0O00OO, LivingEntity livingEntity, float f, float g) {
      if (livingEntity.getId() != this.O00000000) {
         this.O00000000(livingEntity.getId());
      }

      float var5 = o000000O0O00OO.O00000000 + f;
      float var6 = MathHelper.clamp(o000000O0O00OO.O000000000 + g, -90.0F, 90.0F);
      O000000O0O0O0.O00000000(new O000000O0O00OO(var5, var6), Math.abs(f), Math.abs(g), 20.0F, 20.0F, 1, 15, false);
   }

   public void O00000000(O000000O0O00OO o000000O0O00OO, float f, float g, int i, int j) {
      this.O00000000(o000000O0O00OO, f, g, 20.0F, 20.0F, i, j);
   }

   public void O00000000(O000000O0O00OO o000000O0O00OO, float f, float g, float h, float i, int j, int k) {
      this.O00000000(-1);
      O000000O0O0O0.O00000000(o000000O0O00OO, f, g, h, i, j, k, false);
   }

   public void O00000000() {
      this.O00000000(-1);
   }

   private void O00000000(int i) {
      this.O00000000 = i;
   }
}
