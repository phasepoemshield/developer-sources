package Nursultan;

import minecraft.class04995;
import minecraft.class07438;

public class class09127 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public Object N_6;
   public boolean N_init;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;
   public Object y_5;
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object L_5;

   public class09127() {
      this.u();
      this.L_0 = new class09129();
      this.L_1 = new class09145();
      this.L_2 = new class09137();
      this.L_3 = new class09157();
      this.L_4 = new class09135();
      this.L_5 = new class09162();
      this.y_0 = new class09158();
      this.y_1 = new class11058();
      this.y_2 = new class09128();
      this.y_3 = new class09142();
      this.y_4 = new class11098();
      this.y_5 = new class09161();
      this.N_3 = 1.0F;
   }

   private void u() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0L;
         this.N_1 = 0.0F;
         this.N_2 = 0.0F;
         this.N_3 = 0.0F;
         this.N_4 = 0;
         this.N_5 = 0;
         this.N_6 = 0;
      }
   }

   private void N(long var1, float var3, boolean var4, boolean var5, boolean var6) {
      if (var1 >= (Long)this.N_0) {
         float var7 = (var4 ? 0.35F : 0.0F) + (var5 ? 0.45F : 0.0F) + (var6 ? 0.55F : 0.0F);
         this.N_1 = class09139.N((double)(-var3 * (0.46F + var7 * 0.42F)), (double)(var3 * (0.58F + var7 * 0.68F)));
         this.N_2 = class09139.N((double)(-var3 * (0.18F + var7 * 0.16F)), (double)(var3 * (0.18F + var7 * 0.16F)));
         this.N_3 = class09139.N((double)(0.97F - var7 * 0.02F), (double)(1.03F + var7 * 0.035F));
         this.N_0 = var1 + (long)class09139.N(var6 ? 88.0 : 130.0, var5 ? 220.0 : 380.0);
      }
   }

   public boolean N() {
      return ((class11058)this.y_1).y();
   }

   private float N(float var1, double var2, float var4) {
      if (Math.abs(var1) <= var4) {
         return 0.0F;
      } else if (var2 <= 1.0E-5) {
         return var1;
      } else {
         int var5 = Math.round(var1 / (float)var2);
         if (var5 == 0) {
            var5 = var1 > 0.0F ? 1 : -1;
         }

         return (float)var5 * (float)var2;
      }
   }

   private float N(float var1, float var2, float var3, boolean var4) {
      float var5 = Math.abs(var2) > 1.0E-4F ? Math.signum(var2) : (Math.random() > 0.5 ? 1.0F : -1.0F);
      float var6 = var1 + var5 * var3 * class09139.N(0.22F, var4 ? 0.92F : 0.58F);
      if (Math.abs(var2) > var3 * 3.0F) {
         float var7 = Math.max(var3, Math.abs(var2) - var3 * class09139.N(1.6F, 3.4F));
         var6 = class04995.N(var6, -var7, var7);
      }

      return var6;
   }

   private float N(float var1, double var2, boolean var4, boolean var5) {
      if (!(Math.abs(var1) <= 1.0E-4F) && !(var2 <= 1.0E-5)) {
         float var7 = Math.signum(var1);
         float var8 = Math.abs(var1) / (float)var2;
         int var9 = Math.max(1, (int)Math.floor((double)var8));
         int var10 = Math.max(var9, (int)Math.ceil((double)var8));
         int var6 = Math.random() < (double)class04995.N(var8 - (float)var9, 0.0F, 1.0F) ? var10 : var9;
         if (var5) {
            int var12 = var4 ? (Integer)this.N_4 : (Integer)this.N_5;
            if (var6 == Math.abs(var12) && var6 > 1) {
               var6 += Math.random() > 0.5 ? 1 : -1;
            }
         }

         return var7 * (float)var6 * (float)var2;
      } else {
         return var1;
      }
   }

   public class09121 N(
      class11087 var1,
      class07438 var2,
      class11499 var3,
      class11499 var4,
      float var5,
      float var6,
      boolean var7,
      boolean var8,
      boolean var9,
      boolean var10,
      boolean var11,
      boolean var12
   ) {
      double var15 = class09170.N();
      float var17 = (float)Math.max(var15, 0.035F);
      long var18 = System.currentTimeMillis();
      class09122 var20 = ((class11058)this.y_1).N(var1, var2, var3, var4, var5, var6, var15, var10, var11, var12, var9, var8, var7);
      var4 = var20.B();
      var5 = var20.u();
      var6 = var20.y();
      var10 = var20.M();
      var12 = var20.R();
      var9 = var20.z();
      if (var20.L()) {
         return this.N(var1, var2, var3, var4, var5, var6, var15, var11, var12, var9, var8, var20.Z(), var20.U());
      } else {
         float var21 = class09170.N(var3.y(), var4.y());
         float var22 = var4.R() - var3.R();
         float var23 = var10 ? 0.0F : var22;
         float var24 = class04995.N(var21, -var5, var5);
         float var25 = var10 ? 0.0F : class04995.N(var23, -var6, var6);
         boolean var14 = var11
            && !var12
            && !var9
            && !var8
            && !var7
            && Math.abs(var21) <= Math.max(var17 * 18.0F, 2.2F)
            && Math.abs(var23) <= Math.max(var17 * 12.0F, 1.1F);
         if (var14) {
            class09130 var27 = ((class09129)this.L_0).N(var21, var23, var24, var25, var15, var10, false, true);
            float var57 = var27.y();
            float var64 = var10 ? 0.0F : var27.N();
            class09126 var70 = ((class09162)this.L_5).N(var21, var23, var57, var64, var17, var10, false, var8, var11, var12);
            var57 = var70.y();
            var64 = var10 ? 0.0F : var70.N();
            class09169 var71 = ((class09158)this.y_0).N(var1, var2, var3, var21, var22, var57, var64, var5, var6, var15, var10, false, var8, var11, var12);
            var57 = var71.y();
            var64 = var71.u();
            var10 = var71.i();
            float var72 = var71.L() / Math.max(var17, var5);
            float var73 = var71.N() / Math.max(var17, var6);
            class11499 var74 = new class11499(var3.y() + var57, class04995.N(var3.R() + var64, -90.0F, 90.0F));
            var74 = ((class09145)this.L_1).N(var1, var2, var3, var4, var74, var15, var10, var11, var12);
            var74 = ((class09137)this.L_2).N(var1, var2, var3, var4, var74, var15, var11, var12);
            if (var10 && var74.R() != var3.R()) {
               var74 = new class11499(var74.y(), var3.R());
            }

            var74 = ((class09157)this.L_3).N(var1, var2, var3, var4, var74, var15, var10, var11, var12, false, var8);
            boolean var83 = var20.N() || var20.i();
            class09149 var86 = ((class09128)this.y_2).N(var1, var2, var3, var4, var74, var15, var10, var11, var12, var5, var6, var83, var20.Z(), var20.U());
            var74 = var86.L();
            class09151 var94 = ((class09142)this.y_3)
               .N(var1, var2, var3, var4, var74, var15, var10, var11, var12, var86.y(), var86.N(), var83, var8, var20.i());
            var74 = var94.y();
            class09134 var95 = ((class11098)this.y_4)
               .N(var1, var2, var3, var4, var74, var15, var11, var12, var83, var20.U(), false, var8, var94.N(), var94.u());
            var74 = var95.L();
            var10 = var10 && !var83 && !var20.U();
            var57 = class09170.N(var3.y(), var74.y());
            var64 = var74.R() - var3.R();
            int var96 = this.N(var57, var17);
            int var97 = this.N(var64, var17);
            this.N_4 = var96;
            this.N_5 = var97;
            this.N_6 = 0;
            float var98 = this.N(Math.max(Math.abs(var57), var95.N()), var15, true);
            float var99 = this.N(Math.max(Math.abs(var64), var95.y()), var15, false);
            class09153 var100 = ((class09135)this.L_4).N(var1, var2, var3, var74, var15, var10, var11, var12, false, var8, var98, var99);
            return this.N(var1, var2, var3, var4, var100.L(), var15, var10, var11, var12, false, var8, var100.y(), var100.N());
         } else {
            this.N(var18, var17, var7, var8, var9);
            boolean var13 = var11 && Math.abs(var21) <= var17 * 3.5F && Math.abs(var23) <= var17 * 2.0F;
            if (!var13) {
               var24 += (Float)this.N_1;
               if (!var10) {
                  var25 += (Float)this.N_2;
               }
            } else if (var8) {
               var24 += (Float)this.N_1 * 0.34F;
               if (!var10) {
                  var25 += (Float)this.N_2 * 0.18F;
               }
            }

            class09130 var28 = ((class09129)this.L_0).N(var21, var23, var24, var25, var15, var10, var9, false);
            float var29 = var28.y();
            float var30 = var10 ? 0.0F : var28.N();
            class09126 var31 = ((class09162)this.L_5).N(var21, var23, var29, var30, var17, var10, var9, var8, var11, var12);
            var29 = var31.y();
            var30 = var10 ? 0.0F : var31.N();
            class09169 var32 = ((class09158)this.y_0).N(var1, var2, var3, var21, var22, var29, var30, var5, var6, var15, var10, var9, var8, var11, var12);
            var29 = var32.y();
            var30 = var32.u();
            var10 = var32.i();
            float var33 = var32.L() / Math.max(var17, var5);
            float var34 = var32.N() / Math.max(var17, var6);
            int var35 = this.N(var29, var17);
            int var36 = this.N(var30, var17);
            int var10001;
            if (var35 != (Integer)this.N_4 || var36 != (Integer)this.N_5 || var35 == 0 && var36 == 0) {
               var10001 = 0;
            } else {
               int var10003 = (Integer)this.N_6 + 1;
               var10001 = var10003;
               this.N_6 = var10003;
            }

            this.N_6 = var10001;
            if ((Integer)this.N_6 >= 6 && !var11) {
               var29 = this.N(var29, var21, var17, var9);
               if (!var10) {
                  var30 = this.N(var30, var23, var17 * 0.55F, false);
               }

               var29 = this.N(var29, var15, true, true);
               var30 = var10 ? 0.0F : this.N(var30, var15, false, true);
               var35 = this.N(var29, var17);
               var36 = this.N(var30, var17);
            }

            class11499 var37 = new class11499(var3.y() + var29, class04995.N(var3.R() + var30, -90.0F, 90.0F));
            var37 = this.N(var1, var2, var3, var4, var37, var11, var12, var15, Math.abs(var29), Math.abs(var30), var13);
            var37 = ((class09145)this.L_1).N(var1, var2, var3, var4, var37, var15, var10, var11, var12);
            var37 = ((class09137)this.L_2).N(var1, var2, var3, var4, var37, var15, var11, var12);
            if (var10 && var37.R() != var3.R()) {
               var37 = new class11499(var37.y(), var3.R());
            }

            var37 = ((class09157)this.L_3).N(var1, var2, var3, var4, var37, var15, var10, var11, var12, var9, var8);
            boolean var38 = var20.N() || var20.i();
            class09149 var39 = ((class09128)this.y_2).N(var1, var2, var3, var4, var37, var15, var10, var11, var12, var5, var6, var38, var20.Z(), var20.U());
            var37 = var39.L();
            class09151 var40 = ((class09142)this.y_3)
               .N(var1, var2, var3, var4, var37, var15, var10, var11, var12, var39.y(), var39.N(), var38, var8, var20.i());
            var37 = var40.y();
            class09134 var41 = ((class11098)this.y_4).N(var1, var2, var3, var4, var37, var15, var11, var12, var38, var20.U(), var9, var8, var40.N(), var40.u());
            var37 = var41.L();
            var10 = var10 && !var38 && !var20.U();
            float var42 = Math.abs(class09170.N(var3.y(), var37.y()));
            float var43 = Math.abs(var37.R() - var3.R());
            var35 = this.N(class09170.N(var3.y(), var37.y()), var17);
            var36 = this.N(var37.R() - var3.R(), var17);
            float var44 = this.N(Math.max(var42, var41.N()), var15, true);
            float var45 = this.N(Math.max(var43, var41.y()), var15, false);
            this.N_4 = var35;
            this.N_5 = var36;
            class09153 var46 = ((class09135)this.L_4).N(var1, var2, var3, var37, var15, var10, var11, var12, var9, var8, var44, var45);
            return this.N(var1, var2, var3, var4, var46.L(), var15, var10, var11, var12, var9, var8, var46.y(), var46.N());
         }
      }
   }

   private class11499 N(
      class11087 var1,
      class07438 var2,
      class11499 var3,
      class11499 var4,
      class11499 var5,
      boolean var6,
      boolean var7,
      double var8,
      float var10,
      float var11,
      boolean var12
   ) {
      if (var5 != null && !var1.N(var2, var5) && var6 && !var7) {
         float var14 = class09170.N(var3.y(), var5.y());
         float var15 = var5.R() - var3.R();

         for (float var19 : new float[]{0.86F, 0.68F, 0.5F, 0.34F, 0.18F}) {
            class11499 var20 = new class11499(
               var3.y() + this.N(var14 * var19, var8, true, true), class04995.N(var3.R() + this.N(var15 * var19, var8, false, true), -90.0F, 90.0F)
            );
            if (var1.N(var2, var20)) {
               return var20;
            }
         }

         class11499 var21 = this.N(var3, var4, var8, var10, var11);
         if (var1.N(var2, var21)) {
            return var21;
         } else {
            return var12 ? var3 : var5;
         }
      } else {
         return var5;
      }
   }

   private float N(float var1, double var2, boolean var4) {
      if (var2 <= 1.0E-5) {
         return Math.max(var4 ? 0.35F : 0.25F, var1);
      } else {
         float var5 = var4 ? 0.35F : 0.25F;
         return (float)Math.max(1, Math.round(Math.max(var5, var1) / (float)var2)) * (float)var2;
      }
   }

   private class09121 N(
      class11087 var1,
      class07438 var2,
      class11499 var3,
      class11499 var4,
      class11499 var5,
      double var6,
      boolean var8,
      boolean var9,
      boolean var10,
      boolean var11,
      boolean var12,
      float var13,
      float var14
   ) {
      class09131 var15 = ((class09161)this.y_5).N(var1, var2, var3, var4, var5, var6, var8, var9, var10, var11, var12, var13, var14);
      return new class09121(var15.L(), var15.N(), var15.y());
   }

   public void N(class11499 var1) {
      this.N_0 = 0L;
      this.N_1 = 0.0F;
      this.N_2 = 0.0F;
      this.N_3 = 1.0F;
      this.N_4 = 0;
      this.N_5 = 0;
      this.N_6 = 0;
      ((class09129)this.L_0).N();
      ((class09145)this.L_1).N();
      ((class09137)this.L_2).N();
      ((class09157)this.L_3).N();
      ((class09135)this.L_4).N();
      ((class09162)this.L_5).N();
      ((class09158)this.y_0).N();
      ((class11058)this.y_1).N();
      ((class09128)this.y_2).N();
      ((class09142)this.y_3).N();
      ((class11098)this.y_4).N();
      ((class09161)this.y_5).N();
   }

   private class11499 N(class11499 var1, class11499 var2, double var3, float var5, float var6) {
      float var7 = class04995.N(class09170.N(var1.y(), var2.y()), -var5, var5);
      float var8 = class04995.N(var2.R() - var1.R(), -var6, var6);
      var7 = this.N(var7, var3, true, true);
      var8 = this.N(var8, var3, false, true);
      return new class11499(var1.y() + var7, class04995.N(var1.R() + var8, -90.0F, 90.0F));
   }

   private int N(float var1, float var2) {
      return Math.abs(var1) <= 1.0E-4F ? 0 : Math.round(var1 / var2);
   }

   private class09121 N(
      class11087 var1,
      class07438 var2,
      class11499 var3,
      class11499 var4,
      float var5,
      float var6,
      double var7,
      boolean var9,
      boolean var10,
      boolean var11,
      boolean var12,
      float var13,
      boolean var14
   ) {
      float var15 = (float)Math.max(var7, 0.035F);
      float var16 = class09170.N(var3.y(), var4.y());
      float var17 = var4.R() - var3.R();
      float var18 = this.N(class04995.N(var16, -var5, var5), var7, true, true);
      float var19 = this.N(class04995.N(var17, -var6, var6), var7, false, true);
      if (Math.abs(var18) <= var15 && Math.abs(var16) > var15 * 2.0F) {
         var18 = Math.signum(var16) * var15 * class09139.N(2.27362837, 4.83737733);
         var18 = this.N(var18, var7, true, true);
      }

      class11499 var20 = new class11499(var3.y() + var18, class04995.N(var3.R() + var19, -90.0F, 90.0F));
      var20 = this.N(var1, var2, var3, var4, var20, var9, var10, var7, Math.abs(var18), Math.abs(var19), false);
      var20 = ((class09145)this.L_1).N(var1, var2, var3, var4, var20, var7, false, var9, var10);
      var20 = ((class09137)this.L_2).N(var1, var2, var3, var4, var20, var7, var9, var10);
      var20 = ((class09157)this.L_3).N(var1, var2, var3, var4, var20, var7, false, var9, var10, true, var12);
      class09149 var21 = ((class09128)this.y_2).N(var1, var2, var3, var4, var20, var7, false, var9, var10, var5, var6, true, var13, var14);
      var20 = var21.L();
      class09151 var22 = ((class09142)this.y_3).N(var1, var2, var3, var4, var20, var7, false, var9, var10, var21.y(), var21.N(), true, var12, false);
      var20 = var22.y();
      class09134 var23 = ((class11098)this.y_4).N(var1, var2, var3, var4, var20, var7, var9, var10, true, var14, var11, var12, var22.N(), var22.u());
      var20 = var23.L();
      float var24 = Math.abs(class09170.N(var3.y(), var20.y()));
      float var25 = Math.abs(var20.R() - var3.R());
      int var26 = this.N(class09170.N(var3.y(), var20.y()), var15);
      int var27 = this.N(var20.R() - var3.R(), var15);
      this.N_6 = 0;
      this.N_4 = var26;
      this.N_5 = var27;
      float var28 = this.N(Math.max(var24, var23.N()), var7, true);
      float var29 = this.N(Math.max(var25, var23.y()), var7, false);
      class09153 var30 = ((class09135)this.L_4).N(var1, var2, var3, var20, var7, false, var9, var10, var11, var12, var28, var29);
      return this.N(var1, var2, var3, var4, var30.L(), var7, false, var9, var10, var11, var12, var30.y(), var30.N());
   }
}
