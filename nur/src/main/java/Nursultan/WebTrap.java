package Nursultan;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00734;
import minecraft.class00869;
import minecraft.class03443;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06183;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class06942;
import minecraft.class07050;
import minecraft.class07113;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07438;
import minecraft.class08036;

@class11080(
   L = "WebTrap",
   y = class11072.COMBAT,
   N = class11106.TOOLS
)
public class WebTrap extends class11067 {
   public static Object L_0;
   public static Object L_1;
   public Object u_0;
   public Object u_1;
   public boolean u_init;

   private class07209 L(class07438 var1) {
      class06889 var2 = this.N(var1);
      class06889 var3 = new class06889(var2.M - var1.field_6014, 0.0, var2.Z - var1.field_5969);
      class06889 var4 = var2.i(var3.L(6.0));
      class00734 var5 = var1.method_5829().L(var4.u(var2));
      class06889 var6 = this.N(var5).stream().min(Comparator.comparingDouble(var1x -> var1x.M(var4))).orElse(null);
      return var6 == null ? null : class07209.method_49638(var6);
   }

   private class07438 T() {
      if (class11938.u().C().v() instanceof class08036 var1 && !class11791.u().test(var1)) {
         return var1;
      }

      return ((class03448)((class06202)super.y_0).T_3)
         .N(
            class08036.class,
            ((class04453)((class06202)super.y_0).T_4).method_5829().M(((class04453)((class06202)super.y_0).T_4).method_55754() + 1.0),
            var1x -> var1x != (class04453)((class06202)super.y_0).T_4 && !class11791.u().test(var1x)
         )
         .stream()
         .min(Comparator.comparingDouble(var1x -> var1x.method_73189().M(((class04453)((class06202)super.y_0).T_4).method_73189())))
         .orElse(null);
   }

   public WebTrap() {
      this.v();
      this.u_0 = class11524.N(this, "place-key", class12002.UNKNOWN);
   }

   static {
      n();
   }

   private void s() {
      this.v();
      this.u_1 = 0;
      class11322.i();
   }

   private static void n() {
      L_0 = 20;
      L_1 = 6.0;
   }

   private void v() {
      if (!this.u_init) {
         this.u_init = true;
         this.u_1 = 0;
      }
   }

   private Supplier<List<class07209>> y(class07209 var1) {
      return () -> List.of(var1.method_10084(), var1);
   }

   private void y(class07438 var1) {
      this.v();
      class07209 var2 = this.L(var1);
      if (var2 != null) {
         int var3 = class11281.R(class06570.Lf);
         boolean var4 = ((class04453)((class06202)super.y_0).T_4).method_6079().B() == class06570.Lf;
         if (!class11281.y(var3) || var4) {
            class07050 var5 = var4 ? class07050.field_5810 : class07050.field_5808;
            if (!var4 && ((class04453)((class06202)super.y_0).T_4).method_31548().N() != var3) {
               class11322.N(var3);
            }

            class06584 var6 = ((class04453)((class06202)super.y_0).T_4).method_5998(var5);

            for (class07209 var8 : this.y(var2).get()) {
               if (this.N(var8, var5, var6)) {
                  this.u_1 = 0;
                  break;
               }
            }
         }
      }
   }

   @Override
   public void y() {
      this.s();
      super.y();
   }

   @class11782(
      u = true
   )
   public void N(class11400 var1) {
      this.v();
      if (((class11527)this.u_0).N(var1)) {
         this.u_1 = 20;
      }
   }

   private boolean N(class07209 var1, class07050 var2, class06584 var3) {
      class00500 var4 = ((class03448)((class06202)super.y_0).T_3).method_8320(var1);
      if (!var4.N(class00869.yw) && var4.d()) {
         if (((class04453)((class06202)super.y_0).T_4).method_5829().L(new class00734(var1))) {
            return false;
         } else {
            class06889 var5 = ((class04453)((class06202)super.y_0).T_4).method_33571();
            double var6 = ((class04453)((class06202)super.y_0).T_4).method_55754();

            for (class07211 var11 : class07211.values()) {
               class07209 var12 = var1.method_10093(var11.b());
               class00494 var14 = ((class03448)((class06202)super.y_0).T_3).method_8320(var12).R((class03448)((class06202)super.y_0).T_3, var12);
               if (!var14.method_1110()) {
                  class06889 var15 = class06889.y(var12).i(class06889.N(var11.E()).L(0.5));
                  if (!(var15.M(var5) > var6 * var6) && this.N(var5, var15, var11)) {
                     class11499 var16 = class11505.N();
                     class11499 var17 = var16.N(class11505.N(var16, var15)).N(true).u(true);
                     class06183 var18 = this.N(var17, var5, var14, var12);
                     if (var18 != null && var18.N() != class07113.field_1333 && var18.i() == var11) {
                        class06183 var19 = this.N(var16, var5, var14, var12);
                        if (this.N(var19, var18)) {
                           var17 = var16;
                           var18 = var19;
                        }

                        class06942 var20 = new class06942((class03448)((class06202)super.y_0).T_3, (class04453)((class06202)super.y_0).T_4, var2, var3, var18);
                        if (var20.N() && var20.method_8037().equals(var1)) {
                           class11907.N(var2, var18);
                           class11534.y(var17.N(class11522.staticFields_05ffa7eec8dd73e94b3c68970de658457_0));
                           return true;
                        }
                     }
                  }
               }
            }

            return false;
         }
      } else {
         return false;
      }
   }

   private boolean N(class06889 var1, class06889 var2, class07211 var3) {
      return var1.u(var2).y(class06889.N(var3.E())) > 0.0;
   }

   private class06889 N(class07438 var1) {
      return var1.method_73189();
   }

   private boolean N(class06183 var1, class06183 var2) {
      return var1 != null
         && var2 != null
         && var1.N() != class07113.field_1333
         && var2.N() != class07113.field_1333
         && var1.u().equals(var2.u())
         && var1.i() == var2.i();
   }

   @class11782(
      L = {AttackAura.class}
   )
   public void N(class10992 var1) {
      this.v();
      if ((Integer)this.u_1 > 0) {
         this.u_1 = (Integer)this.u_1 - 1;
         class07438 var2 = this.T();
         if (var2 == null) {
            this.s();
         } else {
            if (((class11799)((class03443)((class06202)super.y_0).T_2)).N() >= 3) {
               this.y(var2);
            }

            if ((Integer)this.u_1 <= 0) {
               this.s();
            }
         }
      }
   }

   private List<class06889> N(class00734 var1) {
      ArrayList var2 = new ArrayList();
      int var3 = (int)Math.floor(var1.N);
      int var4 = (int)Math.floor(var1.u);
      int var5 = (int)Math.floor(var1.L);
      int var6 = (int)Math.floor(var1.R);

      for (int var7 = var3; var7 <= var4; var7++) {
         for (int var8 = var5; var8 <= var6; var8++) {
            var2.add(new class06889((double)var7 + 0.5, var1.y, (double)var8 + 0.5));
         }
      }

      return var2;
   }

   private class06183 N(class11499 var1, class06889 var2, class00494 var3, class07209 var4) {
      class06889 var5 = var2.i(var1.U().L(((class04453)((class06202)super.y_0).T_4).method_55754()));
      return var3.method_1092(var2, var5, var4);
   }
}
