package ru.metaculture.protection;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.ThreadLocalRandom;

public final class OcOOo0COoCoc {
   private static final Gson vVvUvVVuuNvV = new GsonBuilder().create();
   private static final float uNNnnnuuuN = 0.9F;
   private static final float nuUnNvnuUu = 0.999F;
   private static final float VVuuUN = 1.0E-8F;
   public int[] UuUVuuUu;
   public float[][][] C00OOC00oO;
   public float[][] uUnuvNvvNU;
   private transient float[][] vNUvnnVnUvu;
   private transient float[][] uVUuuVnNVU;
   private transient float[][][] vuuuNvNuv;
   private transient float[][][] nvUVNnuu;
   private transient float[][] UuuNnUvUuv;
   private transient float[][] nUUVuvU;
   private transient int UnUNVVVNuv;
   private transient float vNVuvnUUnuUn;
   private transient float UvnvNVnnnnNU;

   public OcOOo0COoCoc() {
   }

   public OcOOo0COoCoc(int... var1) {
      this.UuUVuuUu = (int[])var1.clone();
      int var2 = var1.length - 1;
      this.C00OOC00oO = new float[var2][][];
      this.uUnuvNvvNU = new float[var2][];

      for (int var3 = 0; var3 < var2; var3++) {
         int var4 = var1[var3];
         int var5 = var1[var3 + 1];
         this.C00OOC00oO[var3] = new float[var5][var4];
         this.uUnuvNvvNU[var3] = new float[var5];
         float var6 = (float)Math.sqrt(6.0 / (var4 + var5));

         for (int var7 = 0; var7 < var5; var7++) {
            for (int var8 = 0; var8 < var4; var8++) {
               this.C00OOC00oO[var3][var7][var8] = (ThreadLocalRandom.current().nextFloat() * 2.0F - 1.0F) * var6;
            }
         }
      }
   }

   public boolean UuUVuuUu() {
      return this.UuUVuuUu != null && this.UuUVuuUu.length >= 2 && this.C00OOC00oO != null && this.uUnuvNvvNU != null;
   }

   public boolean UuUVuuUu(int var1, int var2) {
      return this.UuUVuuUu() && this.UuUVuuUu[0] == var1 && this.UuUVuuUu[this.UuUVuuUu.length - 1] == var2;
   }

   private void C00OOC00oO() {
      if (this.vNUvnnVnUvu == null) {
         this.vNUvnnVnUvu = new float[this.UuUVuuUu.length][];

         for (int var1 = 0; var1 < this.UuUVuuUu.length; var1++) {
            this.vNUvnnVnUvu[var1] = new float[this.UuUVuuUu[var1]];
         }
      }
   }

   public float[] UuUVuuUu(float[] var1) {
      this.C00OOC00oO();
      System.arraycopy(var1, 0, this.vNUvnnVnUvu[0], 0, this.UuUVuuUu[0]);
      int var2 = this.C00OOC00oO.length;

      for (int var3 = 0; var3 < var2; var3++) {
         float[] var4 = this.vNUvnnVnUvu[var3];
         float[] var5 = this.vNUvnnVnUvu[var3 + 1];
         float[][] var6 = this.C00OOC00oO[var3];
         float[] var7 = this.uUnuvNvvNU[var3];
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

      return this.vNUvnnVnUvu[this.UuUVuuUu.length - 1];
   }

   public void UuUVuuUu(float[][] var1, float[][] var2, int var3, float var4) {
      this.C00OOC00oO();
      this.uUnuvNvvNU();
      int var5 = var1.length;
      int[] var6 = new int[var5];
      int var7 = 0;

      while (var7 < var5) {
         var6[var7] = var7++;
      }

      var7 = this.C00OOC00oO.length;

      for (int var8 = 0; var8 < var3; var8++) {
         UuUVuuUu(var6);

         for (int var9 = 0; var9 < var5; var9++) {
            int var10 = var6[var9];
            this.UuUVuuUu(var1[var10]);
            this.UnUNVVVNuv++;
            this.vNVuvnUUnuUn *= 0.9F;
            this.UvnvNVnnnnNU *= 0.999F;
            float[] var11 = this.vNUvnnVnUvu[var7];
            float[] var12 = this.uVUuuVnNVU[var7];
            float[] var13 = var2[var10];

            for (int var14 = 0; var14 < var11.length; var14++) {
               var12[var14] = var11[var14] - var13[var14];
            }

            for (int var33 = var7 - 1; var33 >= 1; var33--) {
               float[] var15 = this.uVUuuVnNVU[var33];
               float[] var16 = this.uVUuuVnNVU[var33 + 1];
               float[][] var17 = this.C00OOC00oO[var33];
               float[] var18 = this.vNUvnnVnUvu[var33];

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

            float var34 = 1.0F / (1.0F - this.vNVuvnUUnuUn);
            float var35 = 1.0F / (1.0F - this.UvnvNVnnnnNU);

            for (int var36 = 0; var36 < var7; var36++) {
               float[] var37 = this.vNUvnnVnUvu[var36];
               float[] var38 = this.uVUuuVnNVU[var36 + 1];
               float[][] var41 = this.C00OOC00oO[var36];
               float[] var43 = this.uUnuvNvvNU[var36];
               float[][] var44 = this.vuuuNvNuv[var36];
               float[][] var45 = this.nvUVNnuu[var36];
               float[] var23 = this.UuuNnUvUuv[var36];
               float[] var24 = this.nUUVuvU[var36];

               for (int var25 = 0; var25 < var38.length; var25++) {
                  float var26 = var38[var25];
                  var23[var25] = 0.9F * var23[var25] + 0.100000024F * var26;
                  var24[var25] = 0.999F * var24[var25] + 9.999871E-4F * var26 * var26;
                  var43[var25] -= var4 * (var23[var25] * var34) / ((float)Math.sqrt(var24[var25] * var35) + 1.0E-8F);
                  float[] var27 = var41[var25];
                  float[] var28 = var44[var25];
                  float[] var29 = var45[var25];

                  for (int var30 = 0; var30 < var37.length; var30++) {
                     float var31 = var26 * var37[var30];
                     var28[var30] = 0.9F * var28[var30] + 0.100000024F * var31;
                     var29[var30] = 0.999F * var29[var30] + 9.999871E-4F * var31 * var31;
                     var27[var30] -= var4 * (var28[var30] * var34) / ((float)Math.sqrt(var29[var30] * var35) + 1.0E-8F);
                  }
               }
            }
         }
      }
   }

   public float UuUVuuUu(float[][] var1, float[][] var2) {
      this.C00OOC00oO();
      double var3 = 0.0;

      for (int var5 = 0; var5 < var1.length; var5++) {
         float[] var6 = this.UuUVuuUu(var1[var5]);
         float[] var7 = var2[var5];

         for (int var8 = 0; var8 < var6.length; var8++) {
            float var9 = var6[var8] - var7[var8];
            var3 += var9 * var9;
         }
      }

      return (float)(var3 / Math.max(1, var1.length));
   }

   private void uUnuvNvvNU() {
      this.uVUuuVnNVU = new float[this.UuUVuuUu.length][];

      for (int var1 = 0; var1 < this.UuUVuuUu.length; var1++) {
         this.uVUuuVnNVU[var1] = new float[this.UuUVuuUu[var1]];
      }

      int var5 = this.C00OOC00oO.length;
      this.vuuuNvNuv = new float[var5][][];
      this.nvUVNnuu = new float[var5][][];
      this.UuuNnUvUuv = new float[var5][];
      this.nUUVuvU = new float[var5][];

      for (int var2 = 0; var2 < var5; var2++) {
         int var3 = this.UuUVuuUu[var2 + 1];
         int var4 = this.UuUVuuUu[var2];
         this.vuuuNvNuv[var2] = new float[var3][var4];
         this.nvUVNnuu[var2] = new float[var3][var4];
         this.UuuNnUvUuv[var2] = new float[var3];
         this.nUUVuvU[var2] = new float[var3];
      }

      this.UnUNVVVNuv = 0;
      this.vNVuvnUUnuUn = 1.0F;
      this.UvnvNVnnnnNU = 1.0F;
   }

   private static void UuUVuuUu(int[] var0) {
      for (int var1 = var0.length - 1; var1 > 0; var1--) {
         int var2 = ThreadLocalRandom.current().nextInt(var1 + 1);
         int var3 = var0[var1];
         var0[var1] = var0[var2];
         var0[var2] = var3;
      }
   }

   public boolean UuUVuuUu(Path var1) {
      try {
         Files.createDirectories(var1.getParent());

         try (BufferedWriter var2 = Files.newBufferedWriter(var1, StandardCharsets.UTF_8)) {
            vVvUvVVuuNvV.toJson(this, var2);
         }

         return true;
      } catch (Throwable var7) {
         return false;
      }
   }

   public static OcOOo0COoCoc C00OOC00oO(Path var0) {
      try {
         if (!Files.isRegularFile(var0)) {
            return null;
         } else {
            OcOOo0COoCoc var3;
            try (BufferedReader var1 = Files.newBufferedReader(var0, StandardCharsets.UTF_8)) {
               OcOOo0COoCoc var2 = (OcOOo0COoCoc)vVvUvVVuuNvV.fromJson(var1, OcOOo0COoCoc.class);
               var3 = var2 != null && var2.UuUVuuUu() ? var2 : null;
            }

            return var3;
         }
      } catch (Throwable var6) {
         return null;
      }
   }
}
