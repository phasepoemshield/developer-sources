package ru.metaculture.protection;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.ThreadLocalRandom;

public final class O000000O0OOOO0 {
   private static final Gson O00000000000 = new GsonBuilder().create();
   private static final float O000000000000 = 0.9F;
   private static final float O0000000000000 = 0.999F;
   private static final float O000000000000O = 1.0E-8F;
   public int[] O00000000;
   public float[][][] O000000000;
   public float[][] O0000000000;
   private transient float[][] O00000000000O;
   private transient float[][] O00000000000O0;
   private transient float[][][] O00000000000OO;
   private transient float[][][] O0000000000O;
   private transient float[][] O0000000000O0;
   private transient float[][] O0000000000O00;
   private transient int O0000000000O0O;
   private transient float O0000000000OO;
   private transient float O0000000000OO0;

   public O000000O0OOOO0() {
   }

   public O000000O0OOOO0(int... is) {
      this.O00000000 = (int[])is.clone();
      int var2 = is.length - 1;
      this.O000000000 = new float[var2][][];
      this.O0000000000 = new float[var2][];

      for (int var3 = 0; var3 < var2; var3++) {
         int var4 = is[var3];
         int var5 = is[var3 + 1];
         this.O000000000[var3] = new float[var5][var4];
         this.O0000000000[var3] = new float[var5];
         float var6 = (float)Math.sqrt(6.0 / (var4 + var5));

         for (int var7 = 0; var7 < var5; var7++) {
            for (int var8 = 0; var8 < var4; var8++) {
               this.O000000000[var3][var7][var8] = (ThreadLocalRandom.current().nextFloat() * 2.0F - 1.0F) * var6;
            }
         }
      }
   }

   public boolean O00000000() {
      return this.O00000000 != null && this.O00000000.length >= 2 && this.O000000000 != null && this.O0000000000 != null;
   }

   public boolean O00000000(int i, int j) {
      return this.O00000000() && this.O00000000[0] == i && this.O00000000[this.O00000000.length - 1] == j;
   }

   private void O000000000() {
      if (this.O00000000000O == null) {
         this.O00000000000O = new float[this.O00000000.length][];

         for (int var1 = 0; var1 < this.O00000000.length; var1++) {
            this.O00000000000O[var1] = new float[this.O00000000[var1]];
         }
      }
   }

   public float[] O00000000(float[] fs) {
      this.O000000000();
      System.arraycopy(fs, 0, this.O00000000000O[0], 0, this.O00000000[0]);
      int var2 = this.O000000000.length;

      for (int var3 = 0; var3 < var2; var3++) {
         float[] var4 = this.O00000000000O[var3];
         float[] var5 = this.O00000000000O[var3 + 1];
         float[][] var6 = this.O000000000[var3];
         float[] var7 = this.O0000000000[var3];
         boolean var8 = var3 == var2 - 1;

         for (int var9 = 0; var9 < var5.length; var9++) {
            float var10 = var7[var9];
            float[] var11 = var6[var9];

            for (int var12 = 0; var12 < var4.length; var12++) {
               var10 += var11[var12] * var4[var12];
            }

            var5[var9] = var8 ? var10 : (float)Math.tanh(var10);
         }
      }

      return this.O00000000000O[this.O00000000.length - 1];
   }

   public void O00000000(float[][] fs, float[][] gs, int i, float f) {
      this.O000000000();
      this.O0000000000();
      int var5 = fs.length;
      int[] var6 = new int[var5];
      int var7 = 0;

      while (var7 < var5) {
         var6[var7] = var7++;
      }

      var7 = this.O000000000.length;

      for (int var8 = 0; var8 < i; var8++) {
         O00000000(var6);

         for (int var9 = 0; var9 < var5; var9++) {
            int var10 = var6[var9];
            this.O00000000(fs[var10]);
            this.O0000000000O0O++;
            this.O0000000000OO *= 0.9F;
            this.O0000000000OO0 *= 0.999F;
            float[] var11 = this.O00000000000O[var7];
            float[] var12 = this.O00000000000O0[var7];
            float[] var13 = gs[var10];

            for (int var14 = 0; var14 < var11.length; var14++) {
               var12[var14] = var11[var14] - var13[var14];
            }

            for (int var33 = var7 - 1; var33 >= 1; var33--) {
               float[] var15 = this.O00000000000O0[var33];
               float[] var16 = this.O00000000000O0[var33 + 1];
               float[][] var17 = this.O000000000[var33];
               float[] var18 = this.O00000000000O[var33];

               for (int var19 = 0; var19 < var15.length; var19++) {
                  var15[var19] = 0.0F;
               }

               for (int var39 = 0; var39 < var16.length; var39++) {
                  float var20 = var16[var39];
                  float[] var21 = var17[var39];

                  for (int var22 = 0; var22 < var15.length; var22++) {
                     var15[var22] += var20 * var21[var22];
                  }
               }

               for (int var40 = 0; var40 < var15.length; var40++) {
                  float var42 = var18[var40];
                  var15[var40] *= 1.0F - var42 * var42;
               }
            }

            float var34 = 1.0F / (1.0F - this.O0000000000OO);
            float var35 = 1.0F / (1.0F - this.O0000000000OO0);

            for (int var36 = 0; var36 < var7; var36++) {
               float[] var37 = this.O00000000000O[var36];
               float[] var38 = this.O00000000000O0[var36 + 1];
               float[][] var41 = this.O000000000[var36];
               float[] var43 = this.O0000000000[var36];
               float[][] var44 = this.O00000000000OO[var36];
               float[][] var45 = this.O0000000000O[var36];
               float[] var23 = this.O0000000000O0[var36];
               float[] var24 = this.O0000000000O00[var36];

               for (int var25 = 0; var25 < var38.length; var25++) {
                  float var26 = var38[var25];
                  var23[var25] = 0.9F * var23[var25] + 0.100000024F * var26;
                  var24[var25] = 0.999F * var24[var25] + 9.999871E-4F * var26 * var26;
                  var43[var25] -= f * (var23[var25] * var34) / ((float)Math.sqrt(var24[var25] * var35) + 1.0E-8F);
                  float[] var27 = var41[var25];
                  float[] var28 = var44[var25];
                  float[] var29 = var45[var25];

                  for (int var30 = 0; var30 < var37.length; var30++) {
                     float var31 = var26 * var37[var30];
                     var28[var30] = 0.9F * var28[var30] + 0.100000024F * var31;
                     var29[var30] = 0.999F * var29[var30] + 9.999871E-4F * var31 * var31;
                     var27[var30] -= f * (var28[var30] * var34) / ((float)Math.sqrt(var29[var30] * var35) + 1.0E-8F);
                  }
               }
            }
         }
      }
   }

   public float O00000000(float[][] fs, float[][] gs) {
      this.O000000000();
      double var3 = 0.0;

      for (int var5 = 0; var5 < fs.length; var5++) {
         float[] var6 = this.O00000000(fs[var5]);
         float[] var7 = gs[var5];

         for (int var8 = 0; var8 < var6.length; var8++) {
            float var9 = var6[var8] - var7[var8];
            var3 += var9 * var9;
         }
      }

      return (float)(var3 / Math.max(1, fs.length));
   }

   private void O0000000000() {
      this.O00000000000O0 = new float[this.O00000000.length][];

      for (int var1 = 0; var1 < this.O00000000.length; var1++) {
         this.O00000000000O0[var1] = new float[this.O00000000[var1]];
      }

      int var5 = this.O000000000.length;
      this.O00000000000OO = new float[var5][][];
      this.O0000000000O = new float[var5][][];
      this.O0000000000O0 = new float[var5][];
      this.O0000000000O00 = new float[var5][];

      for (int var2 = 0; var2 < var5; var2++) {
         int var3 = this.O00000000[var2 + 1];
         int var4 = this.O00000000[var2];
         this.O00000000000OO[var2] = new float[var3][var4];
         this.O0000000000O[var2] = new float[var3][var4];
         this.O0000000000O0[var2] = new float[var3];
         this.O0000000000O00[var2] = new float[var3];
      }

      this.O0000000000O0O = 0;
      this.O0000000000OO = 1.0F;
      this.O0000000000OO0 = 1.0F;
   }

   private static void O00000000(int[] is) {
      for (int var1 = is.length - 1; var1 > 0; var1--) {
         int var2 = ThreadLocalRandom.current().nextInt(var1 + 1);
         int var3 = is[var1];
         is[var1] = is[var2];
         is[var2] = var3;
      }
   }

   public boolean O00000000(Path path) {
      try {
         Files.createDirectories(path.getParent());

         try (BufferedWriter var2 = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
            O00000000000.toJson(this, var2);
         }

         return true;
      } catch (Throwable var7) {
         return false;
      }
   }

   public static O000000O0OOOO0 O000000000(Path path) {
      try {
         if (!Files.isRegularFile(path)) {
            return null;
         } else {
            O000000O0OOOO0 var3;
            try (BufferedReader var1 = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
               O000000O0OOOO0 var2 = (O000000O0OOOO0)O00000000000.fromJson(var1, O000000O0OOOO0.class);
               var3 = var2 != null && var2.O00000000() ? var2 : null;
            }

            return var3;
         }
      } catch (Throwable var6) {
         return null;
      }
   }
}
