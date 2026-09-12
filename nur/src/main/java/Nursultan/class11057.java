package Nursultan;

import minecraft.class00734;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07438;

public class class11057 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public boolean N_init;

   public class11057() {
      this.u();
      this.N_5 = class11073.IDLE;
   }

   private void u() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0L;
         this.N_1 = 0L;
         this.N_2 = 0L;
      }
   }

   private float y(float var1) {
      return 1.0F - (float)Math.pow((double)(1.0F - var1), 2.2);
   }

   private void N(long var1, boolean var3) {
      this.N_5 = class11073.IDLE;
      this.N_1 = 0L;
      this.N_2 = 0L;
      this.N_3 = null;
      this.N_4 = null;
      if (!var3 && var1 >= (Long)this.N_0) {
         this.N_0 = var1 + (long)class09139.N(260.0, 680.0);
      }
   }

   private boolean N(class11087 var1, class07438 var2, class11499 var3, class11499 var4, boolean var5, boolean var6, boolean var7) {
      if (var5 && !var6 && !var7 && var3 != null) {
         long var8 = var1.y().y();
         if (var8 >= 135L && var8 <= 485L) {
            float var10 = Math.abs(class09170.N(var3.y(), var4.y()));
            float var11 = Math.abs(var4.R() - var3.R());
            if (!(var10 > 4.8F) && !(var11 > 2.35F)) {
               return ((class04453)((class06202)class11087.N_0).T_4).method_33571().R(class11064.y(var2)) > (double)(var1.N(var2) + 0.7F)
                  ? false
                  : Math.random() < 0.34F;
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private class11499 N(class11087 var1, class07438 var2, class11499 var3, class11499 var4) {
      float var5 = var3 == null ? var4.y() : var3.y();
      float var6 = var3 == null ? var4.R() : var3.R();
      float var7 = class09170.N(var5, var4.y());
      float var8 = Math.abs(var7) > 0.1F ? -Math.signum(var7) : (Math.random() > 0.5 ? 1.0F : -1.0F);
      float var9 = Math.random() > 0.5 ? 1.0F : -1.0F;
      float[] var10 = new float[]{14.0F, 18.5F, 23.0F, 28.5F, 34.0F, 41.0F, -16.0F, -22.0F, -30.0F, -38.0F};
      float[] var11 = new float[]{0.0F, 3.5F, -3.5F, 6.5F, -6.5F, 10.0F, -10.0F, 14.0F, -14.0F};
      class11499 var12 = null;
      float var13 = 0.0F;

      for (float var17 : var10) {
         for (float var21 : var11) {
            class11499 var25 = new class11499(var5 + var8 * var17, class04995.N(var6 + var9 * var21, -90.0F, 90.0F));
            float var24;
            if (!var1.N(var2, var25)
               && (var24 = Math.abs(class09170.N(var4.y(), var25.y())) + Math.abs(var25.R() - var4.R()) * 1.75F) >= 16.0F
               && var24 > var13) {
               var12 = var25;
               var13 = var24;
            }
         }
      }

      return var12;
   }

   private class11499 N(class11499 var1, class11499 var2, float var3) {
      return var1 == null
         ? var2
         : new class11499(var1.y() + class09170.N(var1.y(), var2.y()) * var3, class04995.N(class04995.B(var3, var1.R(), var2.R()), -90.0F, 90.0F));
   }

   private float N(float var1) {
      return (float)Math.pow((double)var1, 0.38);
   }

   private boolean N(class11087 var1, boolean var2, boolean var3, boolean var4) {
      return var3 || var2 && var4 || var1.y().y() > 540L;
   }

   public void N() {
      this.N_0 = 0L;
      this.N_1 = 0L;
      this.N_2 = 0L;
      this.N_3 = null;
      this.N_4 = null;
      this.N_5 = class11073.IDLE;
   }

   private boolean N(class11087 var1, class07438 var2, long var3, class00734 var5, class06889 var6, class11499 var7, class11499 var8) {
      this.N_4 = this.N(var1, var2, var7, var8);
      if ((class11499)this.N_4 == null) {
         return false;
      } else {
         float var9 = class09139.N(0.0, Math.PI * 2);
         double var10 = Math.max(0.08, (var5.u - var5.N) * 0.5);
         double var12 = Math.max(0.08, (var5.R - var5.L) * 0.5);
         double var14 = (double)class09139.N(1.05, 1.85);
         double var16 = (double)class09139.N(-(var5.i - var5.y) * 0.22, (var5.i - var5.y) * 0.18);
         class06889 var18 = var5.R();
         this.N_3 = new class06889(
            var18.M + Math.cos((double)var9) * (var10 + var14),
            class04995.N(var6.B + var16, var5.y - (var5.i - var5.y) * 0.28, var5.i + (var5.i - var5.y) * 0.22),
            var18.Z + Math.sin((double)var9) * (var12 + var14)
         );
         this.N_5 = class11073.RELEASE;
         this.N_1 = var3;
         this.N_2 = var3 + (long)class09139.N(145.0, 245.0);
         this.N_0 = var3 + (long)class09139.N(520.0, 1180.0);
         return true;
      }
   }

   private class06889 N(class06889 var1, class06889 var2, float var3) {
      return var2 == null
         ? var1
         : new class06889(class04995.u((double)var3, var1.M, var2.M), class04995.u((double)var3, var1.B, var2.B), class04995.u((double)var3, var1.Z, var2.Z));
   }

   public class11104 N(
      class11087 var1, class07438 var2, class00734 var3, class06889 var4, class11499 var5, boolean var6, boolean var7, boolean var8, boolean var9
   ) {
      long var10 = System.currentTimeMillis();
      if (this.N(var1, var7, var8, var9)) {
         this.N(var10, false);
      }

      class11499 var12 = class09170.N(var4);
      if ((class11073)this.N_5 == class11073.IDLE
         && var10 >= (Long)this.N_0
         && this.N(var1, var2, var5, var12, var6, var7, var8)
         && !this.N(var1, var2, var10, var3, var4, var5, var12)) {
         this.N_0 = var10 + (long)class09139.N(85.0, 180.0);
      }

      if ((class11073)this.N_5 == class11073.IDLE) {
         return class11104.N(var4, var12);
      } else {
         if (var10 >= (Long)this.N_2) {
            if ((class11073)this.N_5 != class11073.RELEASE) {
               this.N(var10, true);
               return class11104.N(var4, var12);
            }

            this.N_5 = class11073.FLICK;
            this.N_1 = var10;
            this.N_2 = var10 + (long)class09139.N(145.0, 235.0);
         }

         float var13 = class04995.N((float)(var10 - (Long)this.N_1) / (float)Math.max(1L, (Long)this.N_2 - (Long)this.N_1), 0.0F, 1.0F);
         if ((class11073)this.N_5 == class11073.RELEASE) {
            float var17 = this.y(var13);
            class06889 var18 = this.N(var4, (class06889)this.N_3, var17);
            return new class11104(var18, (class11499)this.N_4, true, false);
         } else {
            float var14 = 1.0F - this.N(var13);
            class06889 var15 = this.N(var4, (class06889)this.N_3, var14);
            class11499 var16 = this.N((class11499)this.N_4, var12, 1.0F - var14);
            return new class11104(var15, var16, true, true);
         }
      }
   }
}
