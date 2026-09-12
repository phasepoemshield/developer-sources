package Nursultan;

import minecraft.class06889;
import minecraft.class07438;

public class class11091 extends class11079 {
   public Object N_0;
   public boolean N_init;

   public class11091(AttackAura var1, String var2) {
      super(var1, var2);
      this.W();
   }

   @Override
   public class06889 N(class07438 var1, double var2) {
      return class11895.N(var1, class11505.N(), true, ((AttackAura)super.y_1).m());
   }

   @Override
   public class11499 N(class07438 var1, boolean var2, double var3) {
      this.W();
      if ((Integer)this.N_0 > 0) {
         this.N_0 = (Integer)this.N_0 - 1;
      }

      if (var2) {
         this.N_0 = 2;
      }

      if ((Integer)this.N_0 == 0) {
         return class11505.L();
      } else {
         class11499 var5 = class11505.N();
         class06889 var6 = this.N(var1, var3);
         class11499 var7 = class11505.N(var5, var6);
         float var8 = var7.y();
         float var9 = var7.R();
         float var10 = (float)Math.hypot((double)Math.abs(var8), (double)Math.abs(var9));
         float var11 = Math.abs(var8 / var10) * 360.0F;
         float var12 = Math.abs(var9 / var10) * 360.0F;
         return new class11499(
               var5.y() + Math.min(Math.max(var8, -var11), var11) + class11908.y(0.6F), var5.R() + Math.min(Math.max(var9, -var12), var12) + class11908.y(0.3F)
            )
            .u(true)
            .N(true);
      }
   }

   private void W() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0;
      }
   }
}
