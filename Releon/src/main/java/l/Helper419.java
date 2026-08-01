package l;

import java.nio.ByteBuffer;
import java.util.Random;

final class Helper419 {
   static final float B1 = 0.9F;
   static final float B2 = 0.999F;
   static final float EPS = 1.0E-8F;
   final int in;
   final int h1;
   final int h2;
   final int out;
   final float[] w1;
   final float[] b1;
   final float[] w2;
   final float[] b2;
   final float[] w3;
   final float[] b3;
   final float[] mw1;
   final float[] vw1;
   final float[] mb1;
   final float[] vb1;
   final float[] mw2;
   final float[] vw2;
   final float[] mb2;
   final float[] vb2;
   final float[] mw3;
   final float[] vw3;
   final float[] mb3;
   final float[] vb3;
   int step = 0;
   float b1Pow = 1.0F;
   float b2Pow = 1.0F;
   final float[] z1;
   final float[] a1;
   final float[] z2;
   final float[] a2;
   final float[] z3;
   final float[] outAct;
   final float[] inTmp;
   final float[] tTmp;
   final float[] dz3;
   final float[] da2;
   final float[] dz2;
   final float[] da1;
   final float[] dz1;

   Helper419(int var1, int var2, int var3, int var4) {
      this.in = var1;
      this.h1 = var2;
      this.h2 = var3;
      this.out = var4;
      this.w1 = new float[var2 * var1];
      this.b1 = new float[var2];
      this.w2 = new float[var3 * var2];
      this.b2 = new float[var3];
      this.w3 = new float[var4 * var3];
      this.b3 = new float[var4];
      this.mw1 = new float[this.w1.length];
      this.vw1 = new float[this.w1.length];
      this.mb1 = new float[this.b1.length];
      this.vb1 = new float[this.b1.length];
      this.mw2 = new float[this.w2.length];
      this.vw2 = new float[this.w2.length];
      this.mb2 = new float[this.b2.length];
      this.vb2 = new float[this.b2.length];
      this.mw3 = new float[this.w3.length];
      this.vw3 = new float[this.w3.length];
      this.mb3 = new float[this.b3.length];
      this.vb3 = new float[this.b3.length];
      this.z1 = new float[var2];
      this.a1 = new float[var2];
      this.z2 = new float[var3];
      this.a2 = new float[var3];
      this.z3 = new float[var4];
      this.outAct = new float[var4];
      this.inTmp = new float[var1];
      this.tTmp = new float[var4];
      this.dz3 = new float[var4];
      this.da2 = new float[var3];
      this.dz2 = new float[var3];
      this.da1 = new float[var2];
      this.dz1 = new float[var2];
      this.init();
   }

   int method4235() {
      return this.step;
   }

   float[] method4236() {
      return this.inTmp;
   }

   float[] method4237() {
      return this.tTmp;
   }

   void init() {
      Random var1 = new Random(System.nanoTime() ^ 1597463007L);
      method4239(this.w1, this.in, this.h1, var1);
      method4239(this.w2, this.h1, this.h2, var1);
      method4239(this.w3, this.h2, this.out, var1);

      for (int var2 = 0; var2 < this.b1.length; var2++) {
         this.b1[var2] = 0.0F;
      }

      for (int var3 = 0; var3 < this.b2.length; var3++) {
         this.b2[var3] = 0.0F;
      }

      for (int var4 = 0; var4 < this.b3.length; var4++) {
         this.b3[var4] = 0.0F;
      }

      this.step = 0;
      this.b1Pow = 1.0F;
      this.b2Pow = 1.0F;
      this.method4238();
   }

   void method4238() {
      for (int var1 = 0; var1 < this.mw1.length; var1++) {
         this.mw1[var1] = 0.0F;
         this.vw1[var1] = 0.0F;
      }

      for (int var2 = 0; var2 < this.mb1.length; var2++) {
         this.mb1[var2] = 0.0F;
         this.vb1[var2] = 0.0F;
      }

      for (int var3 = 0; var3 < this.mw2.length; var3++) {
         this.mw2[var3] = 0.0F;
         this.vw2[var3] = 0.0F;
      }

      for (int var4 = 0; var4 < this.mb2.length; var4++) {
         this.mb2[var4] = 0.0F;
         this.vb2[var4] = 0.0F;
      }

      for (int var5 = 0; var5 < this.mw3.length; var5++) {
         this.mw3[var5] = 0.0F;
         this.vw3[var5] = 0.0F;
      }

      for (int var6 = 0; var6 < this.mb3.length; var6++) {
         this.mb3[var6] = 0.0F;
         this.vb3[var6] = 0.0F;
      }
   }

   static void method4239(float[] var0, int var1, int var2, Random var3) {
      float var4 = (float)Math.sqrt(2.0 / Math.max(1, var1));

      for (int var5 = 0; var5 < var0.length; var5++) {
         float var6 = var3.nextFloat() * 2.0F - 1.0F;
         var0[var5] = var6 * var4;
      }
   }

   float[] method4240(float[] var1) {
      for (int var2 = 0; var2 < this.h1; var2++) {
         float var3 = this.b1[var2];
         int var4 = var2 * this.in;

         for (int var5 = 0; var5 < this.in; var5++) {
            var3 += this.w1[var4 + var5] * var1[var5];
         }

         this.z1[var2] = var3;
         this.a1[var2] = var3 > 0.0F ? var3 : 0.0F;
      }

      for (int var6 = 0; var6 < this.h2; var6++) {
         float var8 = this.b2[var6];
         int var10 = var6 * this.h1;

         for (int var12 = 0; var12 < this.h1; var12++) {
            var8 += this.w2[var10 + var12] * this.a1[var12];
         }

         this.z2[var6] = var8;
         this.a2[var6] = var8 > 0.0F ? var8 : 0.0F;
      }

      for (int var7 = 0; var7 < this.out; var7++) {
         float var9 = this.b3[var7];
         int var11 = var7 * this.h2;

         for (int var13 = 0; var13 < this.h2; var13++) {
            var9 += this.w3[var11 + var13] * this.a2[var13];
         }

         this.z3[var7] = var9;
      }

      this.outAct[0] = method4246(this.z3[0]);
      this.outAct[1] = method4246(this.z3[1]);
      this.outAct[2] = method4247(this.z3[2]);
      this.outAct[3] = method4247(this.z3[3]);
      this.outAct[4] = method4247(this.z3[4]);
      this.outAct[5] = method4247(this.z3[5]);
      this.outAct[6] = method4247(this.z3[6]);
      this.outAct[7] = method4246(this.z3[7]);
      this.outAct[8] = method4246(this.z3[8]);
      this.outAct[9] = method4247(this.z3[9]);
      this.outAct[10] = method4247(this.z3[10]);
      this.outAct[11] = method4247(this.z3[11]);
      this.outAct[12] = method4247(this.z3[12]);
      return this.outAct;
   }

   float method4241(float[] var1, float[] var2, float var3, float var4) {
      this.method4240(var1);
      float var5 = 0.0F;

      for (int var6 = 0; var6 < this.out; var6++) {
         this.dz3[var6] = 0.0F;
      }

      var5 += this.method4242(0, var2[0], 1.0F);
      var5 += this.method4242(1, var2[1], 1.0F);
      var5 += this.method4243(2, var2[2], 0.8F);
      var5 += this.method4243(3, var2[3], 0.8F);
      var5 += this.method4243(4, var2[4], 0.8F);
      var5 += this.method4243(5, var2[5], 0.15F);
      var5 += this.method4243(6, var2[6], 0.15F);
      var5 += this.method4242(7, var2[7], 0.22F);
      var5 += this.method4242(8, var2[8], 0.22F);
      var5 += this.method4243(9, var2[9], 0.03F);
      var5 += this.method4243(10, var2[10], 0.03F);
      var5 += this.method4243(11, var2[11], 0.18F);
      var5 += this.method4243(12, var2[12], 0.35F);

      for (int var27 = 0; var27 < this.h2; var27++) {
         this.da2[var27] = 0.0F;
      }

      for (int var28 = 0; var28 < this.out; var28++) {
         int var7 = var28 * this.h2;
         float var8 = this.dz3[var28];

         for (int var9 = 0; var9 < this.h2; var9++) {
            this.da2[var9] = this.da2[var9] + this.w3[var7 + var9] * var8;
         }
      }

      for (int var29 = 0; var29 < this.h2; var29++) {
         this.dz2[var29] = this.z2[var29] > 0.0F ? this.da2[var29] : 0.0F;
      }

      for (int var30 = 0; var30 < this.h1; var30++) {
         this.da1[var30] = 0.0F;
      }

      for (int var31 = 0; var31 < this.h2; var31++) {
         int var34 = var31 * this.h1;
         float var36 = this.dz2[var31];

         for (int var40 = 0; var40 < this.h1; var40++) {
            this.da1[var40] = this.da1[var40] + this.w2[var34 + var40] * var36;
         }
      }

      for (int var32 = 0; var32 < this.h1; var32++) {
         this.dz1[var32] = this.z1[var32] > 0.0F ? this.da1[var32] : 0.0F;
      }

      this.step++;
      this.b1Pow *= 0.9F;
      this.b2Pow *= 0.999F;
      float var33 = 1.0F - this.b1Pow;
      float var35 = 1.0F - this.b2Pow;
      if (var33 < 1.0E-6F) {
         var33 = 1.0E-6F;
      }

      if (var35 < 1.0E-6F) {
         var35 = 1.0E-6F;
      }

      for (int var37 = 0; var37 < this.out; var37++) {
         int var41 = var37 * this.h2;
         float var10 = this.dz3[var37];
         method4245(this.b3, this.mb3, this.vb3, var37, var10, var3, var4, var33, var35);

         for (int var11 = 0; var11 < this.h2; var11++) {
            float var12 = this.dz3[var37] * this.a2[var11];
            int var13 = var41 + var11;
            method4245(this.w3, this.mw3, this.vw3, var13, var12, var3, var4, var33, var35);
         }
      }

      for (int var38 = 0; var38 < this.h2; var38++) {
         int var42 = var38 * this.h1;
         float var44 = this.dz2[var38];
         method4245(this.b2, this.mb2, this.vb2, var38, var44, var3, var4, var33, var35);

         for (int var46 = 0; var46 < this.h1; var46++) {
            float var48 = this.dz2[var38] * this.a1[var46];
            int var50 = var42 + var46;
            method4245(this.w2, this.mw2, this.vw2, var50, var48, var3, var4, var33, var35);
         }
      }

      for (int var39 = 0; var39 < this.h1; var39++) {
         int var43 = var39 * this.in;
         float var45 = this.dz1[var39];
         method4245(this.b1, this.mb1, this.vb1, var39, var45, var3, var4, var33, var35);

         for (int var47 = 0; var47 < this.in; var47++) {
            float var49 = this.dz1[var39] * var1[var47];
            int var51 = var43 + var47;
            method4245(this.w1, this.mw1, this.vw1, var51, var49, var3, var4, var33, var35);
         }
      }

      return var5;
   }

   float method4242(int var1, float var2, float var3) {
      float var4 = this.outAct[var1];
      float var5 = var4 - var2;
      float var6 = var5 * var3;
      this.method4244(var5, var3);
      float var7 = 1.0F - var4 * var4;
      this.dz3[var1] = var6 * var7;
      return 0.0F;
   }

   float method4243(int var1, float var2, float var3) {
      float var4 = this.outAct[var1];
      float var5 = var4 - var2;
      float var6 = var5 * var3;
      this.method4244(var5, var3);
      float var7 = var4 * (1.0F - var4);
      this.dz3[var1] = var6 * var7;
      return 0.0F;
   }

   void method4244(float var1, float var2) {
   }

   static void method4245(float[] var0, float[] var1, float[] var2, int var3, float var4, float var5, float var6, float var7, float var8) {
      float var9 = var0[var3];
      float var10 = var4 + var6 * var9;
      float var11 = var1[var3] = 0.9F * var1[var3] + 0.100000024F * var10;
      float var12 = var2[var3] = 0.999F * var2[var3] + 9.999871E-4F * var10 * var10;
      float var13 = var11 / var7;
      float var14 = var12 / var8;
      float var15 = var5 * (var13 / ((float)Math.sqrt(var14) + 1.0E-8F));
      var0[var3] = var9 - var15;
   }

   static float method4246(float var0) {
      if (var0 > 6.0F) {
         return 1.0F;
      } else {
         return var0 < -6.0F ? -1.0F : (float)Math.tanh(var0);
      }
   }

   static float method4247(float var0) {
      if (var0 > 12.0F) {
         return 0.999994F;
      } else {
         return var0 < -12.0F ? 6.0E-6F : 1.0F / (1.0F + (float)Math.exp(-var0));
      }
   }

   int method4248() {
      byte var1 = 16;
      int var2 = (this.w1.length + this.b1.length + this.w2.length + this.b2.length + this.w3.length + this.b3.length) * 4;
      int var3 = (
            this.mw1.length
               + this.vw1.length
               + this.mb1.length
               + this.vb1.length
               + this.mw2.length
               + this.vw2.length
               + this.mb2.length
               + this.vb2.length
               + this.mw3.length
               + this.vw3.length
               + this.mb3.length
               + this.vb3.length
         )
         * 4;
      return var1 + var2 + var3;
   }

   void method4249(ByteBuffer var1) {
      var1.putInt(this.step);
      var1.putFloat(this.b1Pow);
      var1.putFloat(this.b2Pow);
      Helper421.method4269(var1, this.w1);
      Helper421.method4269(var1, this.b1);
      Helper421.method4269(var1, this.w2);
      Helper421.method4269(var1, this.b2);
      Helper421.method4269(var1, this.w3);
      Helper421.method4269(var1, this.b3);
      Helper421.method4269(var1, this.mw1);
      Helper421.method4269(var1, this.vw1);
      Helper421.method4269(var1, this.mb1);
      Helper421.method4269(var1, this.vb1);
      Helper421.method4269(var1, this.mw2);
      Helper421.method4269(var1, this.vw2);
      Helper421.method4269(var1, this.mb2);
      Helper421.method4269(var1, this.vb2);
      Helper421.method4269(var1, this.mw3);
      Helper421.method4269(var1, this.vw3);
      Helper421.method4269(var1, this.mb3);
      Helper421.method4269(var1, this.vb3);
   }

   void method4250(ByteBuffer var1) {
      if (var1.remaining() >= 4) {
         this.step = var1.getInt();
         if (var1.remaining() >= 8) {
            this.b1Pow = var1.getFloat();
            this.b2Pow = var1.getFloat();
         } else {
            this.b1Pow = 1.0F;
            this.b2Pow = 1.0F;
         }

         Helper421.method4267(var1, this.w1);
         Helper421.method4267(var1, this.b1);
         Helper421.method4267(var1, this.w2);
         Helper421.method4267(var1, this.b2);
         Helper421.method4267(var1, this.w3);
         Helper421.method4267(var1, this.b3);
         Helper421.method4267(var1, this.mw1);
         Helper421.method4267(var1, this.vw1);
         Helper421.method4267(var1, this.mb1);
         Helper421.method4267(var1, this.vb1);
         Helper421.method4267(var1, this.mw2);
         Helper421.method4267(var1, this.vw2);
         Helper421.method4267(var1, this.mb2);
         Helper421.method4267(var1, this.vb2);
         Helper421.method4267(var1, this.mw3);
         Helper421.method4267(var1, this.vw3);
         Helper421.method4267(var1, this.mb3);
         Helper421.method4267(var1, this.vb3);
      }
   }
}
