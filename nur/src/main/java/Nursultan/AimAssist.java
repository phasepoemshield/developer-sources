package Nursultan;

import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class05835;
import minecraft.class05849;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07438;

@class11080(
   L = "AimAssist",
   y = class11072.COMBAT,
   N = class11106.FIGHTING
)
public class AimAssist extends class11067 {
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object L_5;
   public Object L_6;
   public Object L_7;
   public boolean L_init;
   public static Object u_0;
   public static Object u_1;

   private static void T() {
      u_0 = 0.008333333333333333;
      u_1 = 0.05;
   }

   public AimAssist() {
      this.v();
      this.L_0 = class11524.N(this, "fov", 180.0F, 1.0F, 180.0F, 1.0F);
      this.L_1 = class11524.N(this, "aim-range", 4.0F, 0.1F, 10.0F, 0.1F);
      this.L_2 = class11524.N(this, "speed", 4.0F, 0.1F, 10.0F, 0.1F);
   }

   static {
      T();
   }

   private void v() {
      if (!this.L_init) {
         this.L_init = true;
         this.L_3 = 0;
         this.L_5 = 0L;
         this.L_6 = 0.0;
         this.L_7 = 0.0;
      }
   }

   @Override
   public void y() {
      this.v();
      this.L_3 = 0;
      this.L_4 = null;
      this.L_5 = 0L;
      this.L_6 = 0.0;
      this.L_7 = 0.0;
      super.y();
   }

   private boolean y(class07438 var1) {
      this.v();
      if (!var1.method_5805()) {
         return false;
      } else if (class11791.u().test(var1)) {
         return false;
      } else {
         return class11895.N(var1, true, ((class04453)((class06202)super.y_0).T_4).method_55755()).R(((class04453)((class06202)super.y_0).T_4).method_33571())
               > (double)((class11504)this.L_1).i().floatValue()
            ? false
            : this.N(var1);
      }
   }

   @class11782
   public void N(class10992 var1) {
      this.v();
      this.N(((class03448)((class06202)super.y_0).T_3).method_8469((Integer)this.L_3));
   }

   private void N(class07049 var1) {
      this.v();
      if (var1 instanceof class07438 var2) {
         if (!this.y(var2)) {
            this.L_4 = null;
         } else {
            class11499 var3 = class11505.N();
            TargetEsp.N(var2, 15);
            if (class11892.N(var3, (double)((class11504)this.L_1).i().floatValue(), var2.method_5829().B(0.2))) {
               class06889 var4 = class11895.N(var2, var3, true, ((class04453)((class06202)super.y_0).T_4).method_55755(), var0 -> var0.B(0.21));
               if (!class11892.N(((class04453)((class06202)super.y_0).T_4).method_33571(), var4, class05849.field_17559, class05835.field_1348)) {
                  this.L_4 = null;
               } else {
                  this.L_4 = class11505.N(var4);
               }
            } else {
               this.L_4 = null;
            }
         }
      } else {
         this.L_4 = null;
      }
   }

   @class11782
   public void N(class11382 var1) {
      this.v();
      this.L_3 = var1.L().method_5628();
   }

   @class11782
   public void N(class11384 var1) {
      this.v();
      if ((class11499)this.L_4 == null) {
         this.L_5 = 0L;
         this.L_6 = 0.0;
         this.L_7 = 0.0;
      } else {
         long var2 = System.nanoTime();
         double var4 = (Long)this.L_5 == 0L ? 0.008333333333333333 : (double)(var2 - (Long)this.L_5) / 1.0E9;
         this.L_5 = var2;
         double var6 = class04995.N(var4, 0.0, 0.05) / 0.008333333333333333;
         class11499 var8 = class11505.N();
         float var9 = var8.R() - ((class11499)this.L_4).R();
         float var10 = class04995.R(var8.y() - ((class11499)this.L_4).y());
         double var11 = Math.hypot((double)var9, (double)var10);
         if (var11 < 1.0) {
            this.L_6 = 0.0;
            this.L_7 = 0.0;
         } else if (var1.u() == 0.0 && var1.L() == 0.0 && var11 > 5.0) {
            this.L_6 = 0.0;
            this.L_7 = 0.0;
         } else {
            double var13 = class04995.u((double)var9, (double)var10) * 180.0F / (float)Math.PI - 90.0;
            double var15 = (double)((class11504)this.L_2).i().floatValue() * Math.max(0.5, Math.min(var11, 10.0) * 0.1F) * var6;
            double var17 = Math.min(var15, (double)Math.abs(var10));
            double var19 = Math.min(var15, (double)Math.abs(var9));
            this.L_6 = (Double)this.L_6 + Math.sin(var13 * (float) (Math.PI / 180.0)) * var17;
            this.L_7 = (Double)this.L_7 + -Math.cos(var13 * (float) (Math.PI / 180.0)) * var19;
            double var21 = (double)Math.round((Double)this.L_6);
            double var23 = (double)Math.round((Double)this.L_7);
            this.L_6 = (Double)this.L_6 - var21;
            this.L_7 = (Double)this.L_7 - var23;
            double var25 = class11302.N(var1.u());
            double var27 = class11302.N(var1.L());
            var1.N(class11302.y(var25 + var21));
            var1.y(class11302.y(var27 + var23));
         }
      }
   }

   public boolean N(class07438 var1) {
      this.v();
      if (((class11504)this.L_0).i() == 180.0F) {
         return true;
      } else {
         class11499 var2 = class11505.L();
         return !class11892.N(var2, ((class04453)((class06202)super.y_0).T_4).method_55755(), var1)
            || var2.N(class11895.N(var1, var2, false, ((class04453)((class06202)super.y_0).T_4).method_55755())) < ((class11504)this.L_0).i();
      }
   }
}
