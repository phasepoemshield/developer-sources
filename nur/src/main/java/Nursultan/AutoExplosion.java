package Nursultan;

import minecraft.class00500;
import minecraft.class00608;
import minecraft.class00734;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01338;
import minecraft.class03443;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06183;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class06918;
import minecraft.class07041;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07064;
import minecraft.class07078;
import minecraft.class07082;
import minecraft.class07113;
import minecraft.class07209;

@class11080(
   L = "AutoExplosion",
   y = class11072.COMBAT,
   N = class11106.FIGHTING
)
public class AutoExplosion extends class11067 {
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object u_0;
   public Object u_1;
   public Object u_2;
   public Object u_3;
   public Object u_4;

   private void L(class07209 var1, class11499 var2) {
      this.b();
      if (this.N(var1)) {
         class11534.y(var2);
         class06183 var3 = this.N(var1, var2);
         if (var3 != null && var3.N() == class07113.field_1332) {
            if (((class04453)((class06202)super.y_0).T_4).method_6079().N(class06570.ln)) {
               this.N(var3, class07050.field_5810);
               this.L_2 = new class00734(var1.method_10084()).M(0.5);
            } else {
               class11281.N(class11281.R(class06570.ln)).ifPresent(var3x -> {
                  this.b();
                  class11322.u(var3x);
                  this.N(var3);
                  this.L_2 = new class00734(var1.method_10084()).M(0.5);
                  if (((class11507)this.u_4).i()) {
                     class11322.i();
                  }
               });
            }
         }
      }
   }

   private void P() {
      this.b();
      class11499 var1 = class11505.N();

      for (class07049 var3 : ((class03448)((class06202)super.y_0).T_3)
         .method_8333((class04453)((class06202)super.y_0).T_4, (class00734)this.L_2, var0 -> var0.method_5864() == class07078.S)) {
         class11499 var4 = class11505.N(var1, class11895.N(var3, true, ((class04453)((class06202)super.y_0).T_4).method_55755()));
         class11499 var5 = var1.N(var4).N(true).u(true);
         if (!class11892.N(var5, ((class04453)((class06202)super.y_0).T_4).method_55755(), var3)) {
            ((class03443)((class06202)super.y_0).T_2).N((class04453)((class06202)super.y_0).T_4, var3);
            ((class04453)((class06202)super.y_0).T_4).method_6104(class07050.field_5808);
            class11534.y(var5);
            this.L_2 = null;
            break;
         }
      }
   }

   public AutoExplosion() {
      this.b();
      this.u_0 = new class11535("crystals", true);
      this.u_1 = new class11535("anchor", true);
      this.u_2 = class11524.y(this, "triggers", (class11535)this.u_0, (class11535)this.u_1);
      this.u_3 = class11524.N(this, "any-item-click", false);
      this.u_4 = class11524.N(this, "reset-slot", false);
   }

   private void b() {
   }

   private int n() {
      int var1 = ((class04453)((class06202)super.y_0).T_4).method_31548().N();
      if (this.N(((class04453)((class06202)super.y_0).T_4).method_31548().method_5438(var1))) {
         return var1;
      } else {
         int var2 = class11281.y(this::N);
         return class11281.y(var2) ? class11281.y((class11328)(var0 -> !var0.N(class06570.Mu))) : var2;
      }
   }

   private void y(class07209 var1, class11499 var2) {
      this.b();
      if (!(Boolean)((class03448)((class06202)super.y_0).T_3).method_75728().N(class00608.O, var1)) {
         class00500 var3 = ((class03448)((class06202)super.y_0).T_3).method_8320(var1);
         if (var3.i() == class00869.TE) {
            int var4 = (Integer)var3.L(class01338.u);
            if (!((class04453)((class06202)super.y_0).T_4).method_6079().N(class06570.Mu) || var4 >= 4) {
               class11534.y(var2);
               class06183 var5 = this.N(var1, var2);
               if (var5 != null && var5.N() == class07113.field_1332) {
                  int var6 = this.n();
                  if (!class11281.y(var6)) {
                     if (var4 == 0) {
                        int var7 = class11281.R(class06570.Mu);
                        if (class11281.y(var7)) {
                           return;
                        }

                        class11322.u(var7);
                        this.N(var5);
                     }

                     class11322.u(var6);
                     this.N(var5);
                     if (((class11507)this.u_4).i()) {
                        class11322.i();
                     }
                  }
               }
            }
         }
      }
   }

   private boolean N(class07209 var1) {
      class00500 var2 = ((class03448)((class06202)super.y_0).T_3).method_8320(var1);
      if (!var2.N(class00869.LV) && !var2.N(class00869.q)) {
         return false;
      } else {
         class07209 var3 = var1.method_10084();
         if (!((class03448)((class06202)super.y_0).T_3).R(var3)) {
            return false;
         } else {
            double var4 = (double)var3.method_10263();
            double var6 = (double)var3.method_10264();
            double var8 = (double)var3.method_10260();
            return ((class03448)((class06202)super.y_0).T_3).N_70(null, new class00734(var4, var6, var8, var4 + 1.0, var6 + 2.0, var8 + 1.0)).isEmpty();
         }
      }
   }

   @class11782
   public void N(class11360 var1) {
      this.b();
      class00891 var2 = var1.N().i();
      if (((class11535)this.u_0).U() && var2 == class00869.LV) {
         this.L_0 = var1.y();
         this.L_1 = class11505.L();
      } else if (((class11535)this.u_1).U() && var2 == class00869.TE) {
         this.L_3 = var1.y();
         this.L_4 = class11505.L();
      }
   }

   @class11782
   public void N(class11393 var1) {
      this.b();
      class07209 var2 = var1.L().u();
      class00891 var3 = ((class03448)((class06202)super.y_0).T_3).method_8320(var2).i();
      class06584 var4 = ((class04453)((class06202)super.y_0).T_4).method_5998(var1.u());
      if (((class11535)this.u_0).U() && (var3 == class00869.LV || var3 == class00869.q)) {
         if (var4.N(class06570.ln) && this.N(var2)) {
            this.L_2 = new class00734(var2.method_10084()).M(0.5);
         } else if (((class11507)this.u_3).i()) {
            this.L_0 = var2;
            this.L_1 = class11505.L();
         }
      } else if (((class11535)this.u_1).U() && var3 == class00869.TE && (var4.N(class06570.Mu) || ((class11507)this.u_3).i())) {
         this.L_3 = var2;
         this.L_4 = class11505.L();
      }
   }

   @class11782
   public void N(class10992 var1) {
      this.b();
      if ((class07209)this.L_0 != null && (class11499)this.L_1 != null) {
         this.L((class07209)this.L_0, (class11499)this.L_1);
         this.L_0 = null;
         this.L_1 = null;
      } else if ((class00734)this.L_2 != null) {
         this.P();
      } else if ((class07209)this.L_3 != null && (class11499)this.L_4 != null) {
         this.y((class07209)this.L_3, (class11499)this.L_4);
         this.L_3 = null;
         this.L_4 = null;
      }
   }

   private boolean N(class06584 var1) {
      return !var1.N(class06570.Mu) && !(var1.B() instanceof class06918);
   }

   private class06183 N(class07209 var1, class11499 var2) {
      class06889 var3 = ((class04453)((class06202)super.y_0).T_4).method_33571();
      class06889 var4 = var3.i(var2.U().L(((class04453)((class06202)super.y_0).T_4).method_55754()));
      return ((class03448)((class06202)super.y_0).T_3).method_8320(var1).R((class03448)((class06202)super.y_0).T_3, var1).method_1092(var3, var4, var1);
   }

   private void N(class06183 var1) {
      this.N(var1, class07050.field_5808);
   }

   private void N(class06183 var1, class07050 var2) {
      class07082 var3 = ((class03443)((class06202)super.y_0).T_2).N((class04453)((class06202)super.y_0).T_4, var2, var1);
      if (var3 instanceof class07041 && ((class07041)var3).i() == class07064.field_52427) {
         ((class04453)((class06202)super.y_0).T_4).method_6104(var2);
      }
   }
}
