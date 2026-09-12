package Nursultan;

import minecraft.class00696;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class07050;

@class11080(
   L = "AutoFish",
   y = class11072.PLAYER,
   N = class11106.AUTO
)
public class AutoFish extends class11067 {
   public Object L_0;
   public boolean L_init;

   public AutoFish() {
      this.m();
      this.L_0 = 0;
   }

   private void m() {
      if (!this.L_init) {
         this.L_init = true;
         this.L_0 = 0;
      }
   }

   private void N(class07050 var1, int var2) {
      this.m();
      if ((Integer)this.L_0 < 0) {
         class11907.N(var1);
         this.L_0 = var2;
      }
   }

   @class11782
   public void N(class10996 var1) {
      this.m();

      for (class07050 var5 : class07050.values()) {
         if (((class04453)((class06202)super.y_0).T_4).method_5998(var5).N(class06570.jr)) {
            class00696 var6 = ((class04453)((class06202)super.y_0).T_4).fields_57fa3311b0e9d3e9b883d09222919bf5a_2;
            this.L_0 = (Integer)this.L_0 - 1;
            if (var6 == null) {
               this.N(var5, 30);
               return;
            }

            if (!var6.N) {
               return;
            }

            this.N(var5, 10);
            break;
         }
      }
   }
}
