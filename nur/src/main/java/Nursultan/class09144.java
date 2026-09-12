package Nursultan;

import minecraft.class04995;

public class class09144 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public boolean N_init;
   public static Object y_0;
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public boolean L_init;
   public Object u_0;
   public Object u_1;
   public Object u_2;
   public Object u_3;
   public boolean u_init;
   public Object i_0;
   public Object i_1;
   public Object i_2;
   public Object i_3;
   public Object i_4;
   public Object i_5;

   private void L() {
      if (!this.L_init) {
         this.L_init = true;
         this.L_1 = 0L;
         this.L_2 = 0;
         this.L_3 = 0;
      }

      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0;
         this.N_1 = 0;
         this.N_2 = 0;
         this.N_3 = 0;
         this.N_4 = 0.0F;
      }

      if (!this.u_init) {
         this.u_init = true;
         this.u_0 = 0.0F;
         this.u_1 = 0.0F;
         this.u_2 = false;
         this.u_3 = false;
      }
   }

   public class09144() {
      this.L();
      this.i_0 = new class09166();
      this.i_1 = new float[9];
      this.i_2 = new float[9];
      this.i_3 = new float[9];
      this.i_4 = new float[9];
      this.i_5 = new float[9];
      this.L_0 = new float[9];
   }

   static {
      B();
   }

   private static void B() {
      y_0 = 9;
   }

   private float y(float var1, float var2) {
      if (Math.abs(var1) > 1.0E-4F) {
         return var1 > 0.0F ? 1.0F : -1.0F;
      } else if (Math.abs(var2) > 1.0E-4F) {
         return var2 > 0.0F ? 1.0F : -1.0F;
      } else {
         return (float)((class09166)this.i_0).N();
      }
   }

   private int N(float var1, float var2) {
      return Math.abs(var1) <= 1.0E-4F ? 0 : Math.round(var1 / var2);
   }

   private float N(float var1, float var2, float var3, boolean var4) {
      float var5 = var4 ? (Float)this.u_0 : (Float)this.u_1;
      float var6 = var3 * (var4 ? 3.8273628F + (Float)this.N_4 * 3.1726382F : 1.6273628F + (Float)this.N_4 * 1.3726382F);
      float var7 = Math.abs(var2) + var6;
      if (Math.abs(var2) > var3 * (var4 ? 5.8273625F : 2.7362838F) && Math.signum(var1) != Math.signum(var2)) {
         var7 = Math.min(var7, var6 * ((class09166)this.i_0).y(0.43628374F, 0.82736284F));
      }

      return class04995.N(var1, -Math.min(var5, var7), Math.min(var5, var7));
   }

   private float N(float var1, float[] var2, int var3, float var4, boolean var5) {
      if (var3 <= 0) {
         return var1;
      } else {
         int var6 = this.N(var1, var4);
         int var7 = this.N(var2[var3 - 1], var4);
         if (var6 == var7 || var3 > 1 && var6 - var7 == var7 - this.N(var2[var3 - 2], var4)) {
            float var8 = Math.abs(var1) > 1.0E-4F ? Math.signum(var1) : (float)((class09166)this.i_0).N();
            var1 += var8 * var4 * ((class09166)this.i_0).y(var5 ? 0.6273628F : 0.32736284F, var5 ? 2.1726382F : 1.1726383F);
         }

         return var1;
      }
   }

   private float N(float var1, float var2, double var3, boolean var5) {
      if (!(Math.abs(var1) <= 1.0E-4F) && !(var3 <= 1.0E-5)) {
         int var6 = Math.round(var1 / (float)var3);
         if (var6 == 0 && Math.abs(var2) > (float)var3) {
            var6 = var2 > 0.0F ? 1 : -1;
         } else if (var6 == 0) {
            var6 = var1 > 0.0F ? 1 : -1;
         }

         int var7 = var5 ? (Integer)this.N_0 : (Integer)this.N_1;
         if (var6 == var7 && Math.abs(var6) > 1) {
            var6 += var6 > 0 ? ((class09166)this.i_0).N(-1, 2) : ((class09166)this.i_0).N(-2, 1);
            if (var6 == 0) {
               var6 = var7 > 0 ? 1 : -1;
            }
         }

         if (var5) {
            this.N_0 = var6;
         } else {
            this.N_1 = var6;
         }

         return (float)var6 * (float)var3;
      } else {
         return var1;
      }
   }

   public void N(long var1, class11499 var3, class11499 var4, class11499 var5, double var6, float var8, float var9, boolean var10, float var11, boolean var12) {
      float var13 = (float)Math.max(var6, 0.035F);
      float var14 = class09170.N(var3.y(), var4.y());
      float var15 = var4.R() - var3.R();
      float var16 = class09170.N(var5.y(), var4.y());
      float var17 = var4.R() - var5.R();
      if (Math.abs(var16) <= var13 * 0.82736284F) {
         var16 = var14 * ((class09166)this.i_0).y(0.17263828F, var10 ? 0.47263828F : 0.32736284F);
      }

      if (Math.abs(var17) <= var13 * 0.5273628F) {
         var17 = var15 * ((class09166)this.i_0).y(0.11726373F, var10 ? 0.38273627F : 0.26372838F);
      }

      this.u_2 = var10;
      this.N_4 = var11;
      this.L_3 = 0;
      this.L_2 = var10 ? ((class09166)this.i_0).N(4, 7) : ((class09166)this.i_0).N(3, 6);
      this.L_1 = var1 + (long)((class09166)this.i_0).y(var10 ? 96.273636F : 136.37263F, var10 ? 196.93738F : 264.82736F);
      this.N_0 = 0;
      this.N_1 = 0;
      this.N_2 = 0;
      this.N_3 = 0;
      float var18 = var10 ? 1.9373773F : 1.5273628F;
      float var19 = var10 ? 1.6273628F : 1.3726382F;
      this.u_0 = Math.max(
         var13 * (var10 ? 6.8273625F : 4.736284F), Math.min(var8 * var18, Math.abs(var14) * 0.7362837F + var13 * (var10 ? 12.827362F : 7.736284F))
      );
      this.u_1 = Math.max(
         var13 * (var10 ? 3.2726383F : 2.1726382F), Math.min(var9 * var19, Math.abs(var15) * 0.6273628F + var13 * (var10 ? 5.6273627F : 3.5273628F))
      );
      this.N((float[])this.i_1, (float[])this.i_3, var16, var14, var13, (Float)this.u_0, true, var12);
      this.N((float[])this.i_2, (float[])this.i_4, var17, var15, var13, (Float)this.u_1, false, false);
      this.N((float[])this.i_5, var10 ? 1.6232324F : 1.0273628F, var10 ? 1.9373773F : 1.4273628F, 0.04736283F);
      this.N((float[])this.L_0, var10 ? 1.1172637F : 0.9273628F, var10 ? 1.6273628F : 1.2637284F, 0.03628373F);
      this.u_3 = true;
   }

   public boolean N(long var1) {
      if (!(Boolean)this.u_3) {
         return false;
      } else if (var1 <= (Long)this.L_1 && (Integer)this.L_3 < (Integer)this.L_2) {
         return true;
      } else {
         this.u_3 = false;
         return false;
      }
   }

   public class09147 N(class11499 var1, class11499 var2, class11499 var3, double var4, boolean var6, float var7, float var8, long var9) {
      if (!this.N(var9)) {
         return class09147.N(var3, var7, var8);
      } else {
         float var11 = (float)Math.max(var4, 0.035F);
         int var10002 = (Integer)this.L_3;
         this.L_3 = var10002 + 1;
         int var12 = var10002;
         float var13 = class09170.N(var3.y(), var2.y());
         float var14 = var6 ? 0.0F : var2.R() - var3.R();
         float var15 = ((float[])this.i_1)[var12]
            + var13 * ((float[])this.i_3)[var12]
            + ((class09166)this.i_0).N(true, var11 * (0.26372838F + (Float)this.N_4 * 0.6273628F));
         float var16 = var6
            ? 0.0F
            : ((float[])this.i_2)[var12]
               + var14 * ((float[])this.i_4)[var12]
               + ((class09166)this.i_0).N(false, var11 * (0.11726373F + (Float)this.N_4 * 0.32736284F));
         var15 = this.N(var15, var13, var11, true);
         var16 = var6 ? 0.0F : this.N(var16, var14, var11, false);
         var15 = this.N(var15, var13, var4, true);
         var16 = var6 ? 0.0F : this.N(var16, var14, var4, false);
         class11499 var17 = new class11499(var3.y() + var15, class04995.N(var3.R() + var16, -90.0F, 90.0F));
         float var18 = this.N(
            Math.max(
               Math.abs(class09170.N(var1.y(), var17.y())) + var11,
               var7 * ((float[])this.i_5)[var12] + Math.abs(var15) * ((class09166)this.i_0).y(0.26372838F, 0.82736284F)
            ),
            var11,
            true
         );
         float var19 = this.N(
            Math.max(
               Math.abs(var17.R() - var1.R()) + var11, var8 * ((float[])this.L_0)[var12] + Math.abs(var16) * ((class09166)this.i_0).y(0.17263828F, 0.6273628F)
            ),
            var11,
            false
         );
         return new class09147(var17, var15, var16, var18, var19, true);
      }
   }

   private float N(float var1, float var2, boolean var3) {
      int var4 = Math.max(1, Math.round(var1 / var2));
      int var5 = var3 ? (Integer)this.N_2 : (Integer)this.N_3;
      if (var4 == var5) {
         var4 += ((class09166)this.i_0).N() * ((class09166)this.i_0).N(1, var3 ? 6 : 4);
         var4 = Math.max(1, var4);
      }

      if (var3) {
         this.N_2 = var4;
      } else {
         this.N_3 = var4;
      }

      return (float)var4 * var2;
   }

   private void N(float[] var1, float var2, float var3, float var4) {
      float var5 = 0.0F;

      for (int var6 = 0; var6 < (Integer)this.L_2; var6++) {
         float var7 = ((class09166)this.i_0).y(var2, var3);
         if (var6 > 0 && Math.abs(var7 - var5) < var4) {
            var7 += (float)((class09166)this.i_0).N() * ((class09166)this.i_0).y(var4, var4 * 4.736284F);
            var7 = class04995.N(var7, var2, var3);
         }

         var1[var6] = var7;
         var5 = var7;
      }
   }

   private void N(float[] var1, float[] var2, float var3, float var4, float var5, float var6, boolean var7, boolean var8) {
      float var9 = this.y(var3, var4);
      float var10 = Math.max(Math.abs(var3), Math.abs(var4) * ((class09166)this.i_0).y(0.09273628F, var7 ? 0.26372838F : 0.17263828F));
      float var11 = var9
         * (
            var10 * ((class09166)this.i_0).y(var7 ? 0.43628374F : 0.32736284F, var7 ? 0.8726383F : 0.7362837F)
               + var5 * ((class09166)this.i_0).y(var7 ? 0.7362837F : 0.26372838F, var7 ? 4.1726384F : 1.7362838F)
         );
      float var12 = 0.0F;
      float[] var13 = new float[9];

      for (int var14 = 0; var14 < (Integer)this.L_2; var14++) {
         float var15 = ((class09166)this.i_0).y(0.11726373F, 1.0F);
         if (var14 == 0 && ((class09166)this.i_0).N(var7 ? 0.42736283F : 0.32736284F)) {
            var15 += ((class09166)this.i_0).y(0.32736284F, 0.9273628F);
         }

         if (var14 > 1 && ((class09166)this.i_0).N(0.26372838F)) {
            var15 *= ((class09166)this.i_0).y(0.32736284F, 0.7362837F);
         }

         var13[var14] = var15;
         var12 += var15;
      }

      for (int var18 = 0; var18 < (Integer)this.L_2; var18++) {
         float var19 = var9;
         if (var18 > 0 && ((class09166)this.i_0).N((var7 ? 0.17263828F : 0.21736284F) + (Float)this.N_4 * 0.06372837F)) {
            var19 = -var9;
         }

         if (var8 && var7 && ((class09166)this.i_0).N(0.32736284F)) {
            var19 = -var19;
         }

         float var16 = var11 * (var13[var18] / Math.max(0.001F, var12));
         float var17 = var19
            * var5
            * ((class09166)this.i_0)
               .y(var7 ? 0.21736284F : 0.08273628F, var7 ? 2.8273628F + (Float)this.N_4 * 1.9273628F : 0.9273628F + (Float)this.N_4 * 0.82736284F);
         if (((class09166)this.i_0).N(0.38273627F)) {
            var17 *= ((class09166)this.i_0).y(-0.82736284F, 0.5637284F);
         }

         var16 = class04995.N(var16 + var17, -var6, var6);
         var1[var18] = this.N(var16, var1, var18, var5, var7);
         var2[var18] = ((class09166)this.i_0)
            .y(var7 ? 0.08372837F : 0.06372837F, var7 ? 0.32736284F + (Float)this.N_4 * 0.16372837F : 0.23628373F + (Float)this.N_4 * 0.12736283F);
      }
   }

   public void N() {
      this.L_1 = 0L;
      this.L_2 = 0;
      this.L_3 = 0;
      this.N_0 = 0;
      this.N_1 = 0;
      this.N_2 = 0;
      this.N_3 = 0;
      this.N_4 = 0.0F;
      this.u_0 = 0.0F;
      this.u_1 = 0.0F;
      this.u_2 = false;
      this.u_3 = false;

      for (int var1 = 0; var1 < 9; var1++) {
         ((float[])this.i_1)[var1] = 0.0F;
         ((float[])this.i_2)[var1] = 0.0F;
         ((float[])this.i_3)[var1] = 0.0F;
         ((float[])this.i_4)[var1] = 0.0F;
         ((float[])this.i_5)[var1] = 1.0F;
         ((float[])this.L_0)[var1] = 1.0F;
      }

      ((class09166)this.i_0).y();
   }
}
