package Nursultan;

import minecraft.class03443;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07089;
import minecraft.class07113;
import minecraft.class07438;

public class class11103 extends class11079 {
   public Object N_0;
   public boolean N_init;

   public class11103(AttackAura var1, String var2) {
      super(var1, var2);
      this.R();
   }

   @Override
   public class06889 N(class07438 var1, double var2) {
      return class11895.N(var1, class11505.N(), var2);
   }

   @Override
   public class11499 N(class07438 var1, boolean var2, double var3) {
      this.R();
      if (this.N(var2)) {
         this.N_0 = true;
         return class11505.L();
      } else {
         if (var2) {
            class07089 var5 = class11892.N((class04453)((class06202)super.y_0).T_4, class11505.N(), var3, true, var1x -> var1x == var1);
            if (var5 != null && var5.N() == class07113.field_1331) {
               this.N_0 = false;
               return class11505.L();
            }
         }

         class11499 var9 = class11505.N(class11505.N(), this.N(var1, var3));
         float var6 = (Boolean)this.N_0 ? class11908.y(7.0F, 13.0F) : 0.0F;
         float var7 = var2 ? var9.y() : var6;
         float var8 = var2 ? var9.R() : (((class04453)((class06202)super.y_0).T_4).method_36455() > 0.0F ? -var6 : var6);
         return class11505.N().N(var7, var8).N(true);
      }
   }

   public boolean N(boolean var1) {
      return ((class11799)((class03443)((class06202)super.y_0).T_2)).N() > 1 && !var1;
   }

   private void R() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = false;
      }
   }
}
