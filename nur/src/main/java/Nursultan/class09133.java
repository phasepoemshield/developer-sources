package Nursultan;

import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00734;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07209;
import minecraft.class07438;

public class class09133 {
   public Object N_0;
   public boolean N_init;

   private int L(class07209 var1) {
      int var2 = 0;
      if (this.y(var1.method_10069(1, 0, 0)) || this.y(var1.method_10069(1, 1, 0))) {
         var2++;
      }

      if (this.y(var1.method_10069(-1, 0, 0)) || this.y(var1.method_10069(-1, 1, 0))) {
         var2++;
      }

      if (this.y(var1.method_10069(0, 0, 1)) || this.y(var1.method_10069(0, 1, 1))) {
         var2++;
      }

      if (this.y(var1.method_10069(0, 0, -1)) || this.y(var1.method_10069(0, 1, -1))) {
         var2++;
      }

      return var2;
   }

   public class09133() {
      this.R();
   }

   private boolean y(class07209 var1) {
      class00500 var2 = ((class03448)((class06202)class11087.N_0).T_3).method_8320(var1);
      if (var2 != null && !var2.P()) {
         class00494 var3 = var2.M((class03448)((class06202)class11087.N_0).T_3, var1);
         return var3 != null && !var3.method_1110();
      } else {
         return false;
      }
   }

   public void N() {
      this.N_0 = 0;
   }

   public boolean N(class07438 var1, class00734 var2, class06889 var3, double var4, float var6) {
      if ((class04453)((class06202)class11087.N_0).T_4 == null
         || (class03448)((class06202)class11087.N_0).T_3 == null
         || var1 == null
         || var2 == null
         || var3 == null) {
         this.N_0 = 0;
         return false;
      } else if (var4 > (double)(var6 + 0.75F)) {
         this.N_0 = Math.max(0, (Integer)this.N_0 - 1);
         return (Integer)this.N_0 >= 2;
      } else {
         class07209 var7 = class07209.method_49637(
            ((class04453)((class06202)class11087.N_0).T_4).method_23317(),
            ((class04453)((class06202)class11087.N_0).T_4).method_23318(),
            ((class04453)((class06202)class11087.N_0).T_4).method_23321()
         );
         int var8 = this.L(var7);
         int var9 = this.N(var7, 1, var7.method_10264(), var7.method_10264() + 1);
         int var10 = this.N(var7, 2, var7.method_10264(), var7.method_10264() + 1);
         int var11 = this.N(var7);
         boolean var12 = var8 >= 3 || var9 >= 6;
         boolean var13 = var11 >= 2 && (var9 >= 3 || var10 >= 8);
         boolean var14 = var9 >= 5 && var10 >= 8;
         if (!var12 && !var13 && !var14) {
            this.N_0 = Math.max(0, (Integer)this.N_0 - 1);
         } else {
            this.N_0 = Math.min(8, (Integer)this.N_0 + 2);
         }

         return (Integer)this.N_0 >= 2;
      }
   }

   private int N(class07209 var1) {
      int var2 = 0;
      int var3 = var1.method_10264() + 2;

      for (int var4 = -1; var4 <= 1; var4++) {
         for (int var5 = -1; var5 <= 1; var5++) {
            if (this.y(new class07209(var1.method_10263() + var4, var3, var1.method_10260() + var5))) {
               var2++;
            }
         }
      }

      return var2;
   }

   private int N(class07209 var1, int var2, int var3, int var4) {
      int var5 = 0;

      for (int var6 = -var2; var6 <= var2; var6++) {
         for (int var7 = -var2; var7 <= var2; var7++) {
            if (Math.abs(var6) == var2 || Math.abs(var7) == var2) {
               for (int var8 = var3; var8 <= var4; var8++) {
                  if (this.y(new class07209(var1.method_10263() + var6, var8, var1.method_10260() + var7))) {
                     var5++;
                     break;
                  }
               }
            }
         }
      }

      return var5;
   }

   private void R() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0;
      }
   }
}
