package ru.metaculture.protection;

import java.util.Arrays;

public final class O0000O000O00OO implements O0000O00O0O000.W369 {
   public static final O0000O000O00OO O00000000 = new O0000O000O00OO();
   private static final int O000000000 = 128;
   private static final int O0000000000 = -1;
   private static final float O00000000000 = 0.004166667F;
   private static final int O000000000000 = 60;
   private static final float O0000000000000 = 1.0E-4F;
   private static final float O000000000000O = 0.25F;
   private static final float O00000000000O = 0.016666668F;
   private float[] O00000000000O0;
   private float[] O00000000000OO;
   private float[] O0000000000O;
   private float[] O0000000000O0;
   private float[] O0000000000O00;
   private float[] O0000000000O0O;
   private float[] O0000000000OO;
   private int[] O0000000000OO0;
   private int[] O0000000000OOO;
   private int[] O000000000O;
   private int O000000000O0 = 128;
   private int O000000000O00;
   private int O000000000O000;
   private float O000000000O00O;
   private boolean O000000000O0O;

   private O0000O000O00OO() {
      this.O00000000000O0 = new float[this.O000000000O0];
      this.O00000000000OO = new float[this.O000000000O0];
      this.O0000000000O = new float[this.O000000000O0];
      this.O0000000000O0 = new float[this.O000000000O0];
      this.O0000000000O00 = new float[this.O000000000O0];
      this.O0000000000O0O = new float[this.O000000000O0];
      this.O0000000000OO = new float[this.O000000000O0];
      this.O0000000000OO0 = new int[this.O000000000O0];
      this.O0000000000OOO = new int[this.O000000000O0];
      this.O000000000O = new int[this.O000000000O0];
      Arrays.fill(this.O0000000000OO0, -1);
      Arrays.fill(this.O0000000000OOO, -1);

      for (int var1 = 0; var1 < this.O000000000O0; var1++) {
         this.O000000000O[var1] = this.O000000000O0 - 1 - var1;
      }

      this.O000000000O000 = this.O000000000O0;
   }

   public int O00000000(float f, O0000O000O0O00 o0000O000O0O00) {
      O0000O000O0O00 var3 = o0000O000O0O00 == null ? O0000O000O0O00.O00000000() : o0000O000O0O00;
      return this.O00000000(f, var3.O000000000O(), var3.O000000000O0(), var3.O000000000O00(), var3.O000000000O000());
   }

   public int O00000000(float f, float g, float h, float i, float j) {
      if (this.O000000000O00 == this.O000000000O0) {
         this.O0000000000();
      }

      int var6 = this.O000000000O[--this.O000000000O000];
      int var7 = this.O000000000O00++;
      this.O00000000000O0[var7] = f;
      this.O00000000000OO[var7] = f;
      this.O0000000000O[var7] = 0.0F;
      this.O0000000000O0[var7] = g;
      this.O0000000000O00[var7] = h;
      this.O0000000000O0O[var7] = i;
      this.O0000000000OO[var7] = j;
      this.O0000000000OOO[var7] = var6;
      this.O0000000000OO0[var6] = var7;
      this.O000000000();
      return var6;
   }

   public void O00000000(int i) {
      if (i >= 0 && i < this.O000000000O0) {
         int var2 = this.O0000000000OO0[i];
         if (var2 != -1) {
            int var3 = --this.O000000000O00;
            if (var2 != var3) {
               this.O00000000000O0[var2] = this.O00000000000O0[var3];
               this.O00000000000OO[var2] = this.O00000000000OO[var3];
               this.O0000000000O[var2] = this.O0000000000O[var3];
               this.O0000000000O0[var2] = this.O0000000000O0[var3];
               this.O0000000000O00[var2] = this.O0000000000O00[var3];
               this.O0000000000O0O[var2] = this.O0000000000O0O[var3];
               this.O0000000000OO[var2] = this.O0000000000OO[var3];
               int var4 = this.O0000000000OOO[var3];
               this.O0000000000OOO[var2] = var4;
               this.O0000000000OO0[var4] = var2;
            }

            this.O0000000000OOO[var3] = -1;
            this.O0000000000OO0[i] = -1;
            this.O000000000O[this.O000000000O000++] = i;
         }
      }
   }

   public void O00000000(int i, float f) {
      int var3 = this.O000000000000(i);
      if (var3 != -1) {
         this.O00000000000OO[var3] = f;
      }
   }

   public void O000000000(int i, float f) {
      int var3 = this.O000000000000(i);
      if (var3 != -1) {
         this.O00000000000O0[var3] = f;
         this.O00000000000OO[var3] = f;
         this.O0000000000O[var3] = 0.0F;
      }
   }

   public float O000000000(int i) {
      int var2 = this.O000000000000(i);
      return var2 == -1 ? 0.0F : this.O00000000000O0[var2];
   }

   public float O0000000000(int i) {
      int var2 = this.O000000000000(i);
      return var2 == -1 ? 0.0F : this.O00000000000OO[var2];
   }

   public boolean O00000000000(int i) {
      int var2 = this.O000000000000(i);
      return var2 == -1
         ? true
         : Math.abs(this.O00000000000OO[var2] - this.O00000000000O0[var2]) <= this.O0000000000O0O[var2]
            && Math.abs(this.O0000000000O[var2]) <= this.O0000000000OO[var2];
   }

   public int O00000000() {
      return this.O000000000O00;
   }

   @Override
   public boolean O00000000(float f) {
      int var2 = this.O000000000O00;
      if (var2 == 0) {
         this.O000000000O00O = 0.0F;
         return true;
      } else {
         float var3 = f;
         if (!Float.isFinite(f) || f <= 0.0F) {
            var3 = 0.016666668F;
         } else if (f < 1.0E-4F) {
            var3 = 1.0E-4F;
         } else if (f > 0.25F) {
            var3 = 0.25F;
         }

         this.O000000000O00O += var3;
         float[] var4 = this.O00000000000O0;
         float[] var5 = this.O00000000000OO;
         float[] var6 = this.O0000000000O;
         float[] var7 = this.O0000000000O0;
         float[] var8 = this.O0000000000O00;
         float[] var9 = this.O0000000000O0O;
         float[] var10 = this.O0000000000OO;

         int var11;
         for (var11 = 0; this.O000000000O00O >= 0.004166667F && var11 < 60; var11++) {
            for (int var12 = 0; var12 < var2; var12++) {
               float var13 = var4[var12];
               float var14 = var5[var12];
               float var15 = var6[var12] + (var14 - var13) * var7[var12] - var6[var12] * var8[var12];
               var13 += var15;
               if (Math.abs(var14 - var13) <= var9[var12] && Math.abs(var15) <= var10[var12]) {
                  var13 = var14;
                  var15 = 0.0F;
               }

               var4[var12] = var13;
               var6[var12] = var15;
            }

            this.O000000000O00O -= 0.004166667F;
         }

         if (var11 == 60) {
            this.O000000000O00O = 0.0F;
         }

         return true;
      }
   }

   private int O000000000000(int i) {
      return i >= 0 && i < this.O000000000O0 ? this.O0000000000OO0[i] : -1;
   }

   private void O000000000() {
      if (!this.O000000000O0O) {
         this.O000000000O0O = true;
         O0000O00O0O000.O00000000().O00000000(this);
      }
   }

   private void O0000000000() {
      int var1 = this.O000000000O0 << 1;
      this.O00000000000O0 = Arrays.copyOf(this.O00000000000O0, var1);
      this.O00000000000OO = Arrays.copyOf(this.O00000000000OO, var1);
      this.O0000000000O = Arrays.copyOf(this.O0000000000O, var1);
      this.O0000000000O0 = Arrays.copyOf(this.O0000000000O0, var1);
      this.O0000000000O00 = Arrays.copyOf(this.O0000000000O00, var1);
      this.O0000000000O0O = Arrays.copyOf(this.O0000000000O0O, var1);
      this.O0000000000OO = Arrays.copyOf(this.O0000000000OO, var1);
      this.O0000000000OO0 = Arrays.copyOf(this.O0000000000OO0, var1);
      this.O0000000000OOO = Arrays.copyOf(this.O0000000000OOO, var1);
      this.O000000000O = Arrays.copyOf(this.O000000000O, var1);

      for (int var2 = this.O000000000O0; var2 < var1; this.O000000000O[this.O000000000O000++] = var2++) {
         this.O0000000000OO0[var2] = -1;
         this.O0000000000OOO[var2] = -1;
      }

      this.O000000000O0 = var1;
   }
}
