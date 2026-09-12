package Nursultan;

import minecraft.class00734;
import minecraft.class03443;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class05835;
import minecraft.class05849;
import minecraft.class05862;
import minecraft.class06183;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07113;
import minecraft.class07438;

public class class11069 extends class11079 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public boolean N_init;
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public boolean L_init;

   private void P() {
      if (!this.L_init) {
         this.L_init = true;
         this.L_0 = 0;
         this.L_1 = 0;
      }

      if (!this.N_init) {
         this.N_init = true;
         this.N_4 = 0;
      }
   }

   public class11069(AttackAura var1, String var2) {
      super(var1, var2);
      this.P();
      this.L_2 = new class11087();
      this.L_3 = new class11095();
      this.N_0 = new class09146();
      this.N_1 = new class09152();
      this.N_2 = new class09127();
      this.N_3 = new class11076();
      this.N_4 = Integer.MIN_VALUE;
   }

   @Override
   public void u(class07438 var1) {
      this.P();
      super.u(var1);
      this.L_1 = (Integer)this.L_1 + 1;
      ((AttackAura)super.y_1).y(class11908.N(0, 2));
      class11087.N_0 = (class06202)super.y_0;
      ((class11087)this.L_2).N((float)((AttackAura)super.y_1).m());
   }

   @Override
   public boolean y() {
      class00734 var1 = ((class04453)((class06202)super.y_0).T_4).method_5829().u(0.0, 0.1F, 0.0);
      class00734 var2 = ((class04453)((class06202)super.y_0).T_4).method_5829().u(0.0, -0.5, 0.0);
      boolean var3 = ((class03448)((class06202)super.y_0).T_3).method_8600((class04453)((class06202)super.y_0).T_4, var1).iterator().hasNext();
      boolean var4 = ((class03448)((class06202)super.y_0).T_3).method_8600((class04453)((class06202)super.y_0).T_4, var2).iterator().hasNext();
      return var3 && var4 && this.N() == 13 ? false : super.y();
   }

   static boolean y(class07438 var0, class11499 var1, float var2) {
      class06202 var3 = (class06202)class11087.N_0;
      if ((class04453)var3.T_4 != null && (class03448)var3.T_3 != null && var0 != null && var1 != null && !(var2 <= 0.0F)) {
         class06889 var4 = ((class04453)var3.T_4).method_33571();
         class06889 var5 = ((class04453)var3.T_4).method_5631(var1.R(), var1.y());
         class06889 var6 = var4.i(var5.L((double)var2));
         class00734 var7 = new class00734(var4, var4).y(var5.L((double)var2)).M(1.0);
         class07049 var8 = null;
         double var9 = (double)(var2 * var2);

         for (class07049 var12 : ((class03448)var3.T_3).method_8333((class04453)var3.T_4, var7, var0x -> !var0x.method_7325() && var0x.method_5863())) {
            class00734 var13 = var12 == var0 ? class11064.u(var12) : class11064.L(var12).M(Math.max(1.0E-4, (double)var12.method_5871()));
            class06889 var14 = var13.u(var4) ? var4 : (class06889)var13.y(var4, var6).orElse(null);
            if (var14 != null) {
               double var15 = var4.M(var14);
               if (var8 == null || !(var15 >= var9)) {
                  var8 = var12;
                  var9 = var15;
               }
            }
         }

         class06183 var17 = ((class03448)var3.T_3).N(new class05862(var4, var6, class05849.field_17558, class05835.field_1348, (class04453)var3.T_4));
         boolean var18 = var17 != null && var17.N() == class07113.field_1332 && var4.M(var17.y()) <= var9;
         return !var18 && var8 == var0;
      } else {
         return false;
      }
   }

   @Override
   public class11499 N(class07438 var1, boolean var2, double var3) {
      this.P();
      class11087.N_0 = (class06202)super.y_0;
      ((class11087)this.L_2).N((float)var3, var2, true);
      if ((class04453)((class06202)super.y_0).T_4 != null && var1 != null) {
         class11499 var14 = class11505.N();
         if ((Integer)this.N_4 != var1.method_5628()) {
            this.N_4 = var1.method_5628();
            ((class11095)this.L_3).N();
            ((class09146)this.N_0).N();
            ((class09152)this.N_1).N(var14);
            ((class09127)this.N_2).N(var14);
            ((class11076)this.N_3).N();
            ((class11087)this.L_2).y_4 = System.currentTimeMillis();
         }

         boolean var7 = ((class11087)this.L_2).N();
         boolean var8 = ((class11063)((class11087)this.L_2).y_0).N((class11087)this.L_2, var1);
         boolean var9 = (class03443)((class06202)super.y_0).T_2 != null && ((class11799)((class03443)((class06202)super.y_0).T_2)).N() < 2;
         class11097 var10 = ((class11095)this.L_3)
            .N(
               (class11087)this.L_2,
               var1,
               var14,
               new class11499(((class04453)((class06202)super.y_0).T_4).field_5982, ((class04453)((class06202)super.y_0).T_4).field_6004),
               var7,
               var9,
               var8
            );
         class09160 var11 = ((class09146)this.N_0).N((class11087)this.L_2, var14, var10, var7, var9, var8);
         class11499 var12 = new class11499(var10.y().y() + var11.y(), var10.y().R() + var11.R());
         class09123 var13 = ((class09152)this.N_1)
            .N((class11087)this.L_2, var1, var14, var12, var11.u(), var11.N(), var11.i(), var10.N(), var10.z() && !var10.R() && !var11.L());
         return ((class09127)this.N_2)
            .N(
               (class11087)this.L_2,
               var1,
               var14,
               var13.y(),
               var13.N(),
               var13.L(),
               var7 && var8,
               var9,
               var11.i(),
               var10.N(),
               var10.z(),
               var10.M() || var10.R() || var11.L()
            )
            .L()
            .N(true)
            .u(true);
      } else {
         class11499 var5 = class11505.L();
         this.N(var5);
         return var5;
      }
   }

   @Override
   public void N(class07438 var1) {
      super.y_2 = this.u();
      class11499 var2 = this.y(var1, false, ((AttackAura)super.y_1).d());
      if (this.L(var1) && !this.N(var1, var2)) {
         this.u(var1);
      }

      class11534.y(var2.y(((AttackAura)super.y_1).b()));
   }

   @Override
   public int N() {
      this.P();
      return super.N() + ((Integer)this.L_1 % 4 == 0 ? 3 : 0);
   }

   static class06889 N(class07438 var0, class11499 var1, float var2) {
      class06202 var3 = (class06202)class11087.N_0;
      if ((class04453)var3.T_4 != null && var0 != null) {
         class00734 var4 = class11064.L(var0);
         double var5 = (var4.N + var4.u) * 0.5;
         double var7 = (var4.L + var4.R) * 0.5;
         double var9 = Math.max(0.015, var4.y() * 0.18);
         double var11 = Math.max(0.015, var4.u() * 0.18);
         double var13 = var4.N + var9;
         double var15 = var4.u - var9;
         double var17 = var4.L + var11;
         double var19 = var4.R - var11;
         class06889 var21 = class11064.N(var0);
         double var22 = class04995.u(0.28, var4.y, var4.i);
         double var24 = class04995.u(0.18, var4.y, var4.i);
         double var26 = class04995.u(0.38, var4.y, var4.i);
         double var28 = class04995.u(0.46, var4.y, var4.i);
         class06889[] var30 = new class06889[]{
            new class06889(var5, var22, var7),
            new class06889(class04995.N(var21.M, var13, var15), class04995.N(var21.B, var24, var26), class04995.N(var21.Z, var17, var19)),
            new class06889(var13, var22, var7),
            new class06889(var15, var22, var7),
            new class06889(var5, var22, var17),
            new class06889(var5, var22, var19),
            new class06889(var5, var24, var7),
            new class06889(var5, var26, var7),
            new class06889(var5, var28, var7)
         };
         class06889 var31 = var30[0];
         double var32 = Double.MAX_VALUE;
         class06889 var34 = ((class04453)var3.T_4).method_33571();

         for (class06889 var38 : var30) {
            class11499 var39 = class09170.N(var38);
            if (y(var0, var39, var2)) {
               double var40 = (double)Math.abs(class09170.N(var1.y(), var39.y()));
               double var42 = (double)Math.abs(var1.R() - var39.R());
               double var44 = Math.max(0.0, var38.B - var26) * 3.8;
               double var46 = var40 * 0.86 + var42 * 4.2 + var44 + var34.M(var38) * 0.01;
               if (var46 < var32) {
                  var31 = var38;
                  var32 = var46;
               }
            }
         }

         return var31;
      } else {
         return null;
      }
   }

   @Override
   public class06889 N(class07438 var1, double var2) {
      this.P();
      class11087.N_0 = (class06202)super.y_0;
      ((class11087)this.L_2).N((float)var2, false, false);
      if ((class04453)((class06202)super.y_0).T_4 != null && var1 != null) {
         class11499 var4 = class11505.N();
         boolean var5 = ((class11087)this.L_2).N(var1, var4);
         boolean var6 = ((class11087)this.L_2).N();
         boolean var7 = ((class11063)((class11087)this.L_2).y_0).N((class11087)this.L_2, var1);
         return ((class11076)this.N_3).N(class11064.u(var1), var1, var5, var6, var7);
      } else {
         return var1 == null ? class06889.L : var1.method_33571();
      }
   }

   @Override
   public boolean N(class07438 var1, class11499 var2) {
      this.P();
      if (super.N(var1, var2)) {
         this.L_0 = 0;
         return true;
      } else {
         int var10002 = (Integer)this.L_0 + 1;
         this.L_0 = var10002;
         return var10002 < (((class11799)((class03443)((class06202)super.y_0).T_2)).N() < 15 ? 3 : 4);
      }
   }

   private void N(class11499 var1) {
      this.P();
      this.N_4 = Integer.MIN_VALUE;
      ((class11095)this.L_3).N();
      ((class09146)this.N_0).N();
      ((class09152)this.N_1).N(var1);
      ((class09127)this.N_2).N(var1);
      ((class11076)this.N_3).N();
      ((class11087)this.L_2).y_4 = System.currentTimeMillis();
   }
}
