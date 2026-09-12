package Nursultan;

import minecraft.class00734;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07047;
import minecraft.class07438;

public class class11063 {
   public static Object N_0;
   public static Object N_1;
   public static Object N_2;

   private static void L() {
      N_0 = -0.008;
      N_1 = 0.018F;
      N_2 = 0.08F;
   }

   class11063() {
   }

   static {
      L();
   }

   private boolean N(boolean var1, float var2, double var3) {
      return !var1 && var3 < -0.008 && var2 + 0.018F >= 0.08F;
   }

   public boolean N(class11087 var1, class07438 var2) {
      AttackAura var3 = class11938.u().C();
      if (var3 == null || ((class11535)var3.B_3).U()) {
         return true;
      } else {
         return (class04453)((class06202)class11087.N_0).T_4 != null && (class03448)((class06202)class11087.N_0).T_3 != null && var2 != null && !this.R()
            ? this.N(false, (float)((class04453)((class06202)class11087.N_0).T_4).field_6017, ((class04453)((class06202)class11087.N_0).T_4).method_18798().B)
               || this.N()
            : false;
      }
   }

   private boolean N() {
      class06889 var1 = ((class04453)((class06202)class11087.N_0).T_4).method_18798();
      if (var1.B >= -0.008) {
         return false;
      } else {
         class00734 var2 = ((class04453)((class06202)class11087.N_0).T_4).method_5829();
         float var3 = (float)((class04453)((class06202)class11087.N_0).T_4).field_6017;
         double var4 = var1.B;

         for (int var6 = 0; var6 < 2; var6++) {
            var2 = var2.u(0.0, var4 - 0.001, 0.0);
            if (!((class03448)((class06202)class11087.N_0).T_3).method_8600((class04453)((class06202)class11087.N_0).T_4, var2).iterator().hasNext()) {
               return false;
            }

            var3 += (float)Math.max(0.0, -var4);
            if (this.N(false, var3, var4)) {
               return true;
            }

            var4 = (var4 - 0.08) * 0.98;
         }

         return false;
      }
   }

   private boolean R() {
      return ((class04453)((class06202)class11087.N_0).T_4).method_6101()
         || ((class04453)((class06202)class11087.N_0).T_4).method_5799()
         || ((class04453)((class06202)class11087.N_0).T_4).method_5681()
         || ((class04453)((class06202)class11087.N_0).T_4).method_5771()
         || ((class04453)((class06202)class11087.N_0).T_4).method_5765()
         || ((class04453)((class06202)class11087.N_0).T_4).field_17046 != class06889.L
         || ((class04453)((class06202)class11087.N_0).T_4).method_6059(class07047.d)
         || ((class04453)((class06202)class11087.N_0).T_4).method_6059(class07047.P);
   }
}
