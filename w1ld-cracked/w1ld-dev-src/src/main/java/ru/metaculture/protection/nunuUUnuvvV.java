package ru.metaculture.protection;

import java.util.Arrays;

public final class nunuUUnuvvV implements vvUnNVVnV.NVnVnNnN {
   public static final nunuUUnuvvV UuUVuuUu = new nunuUUnuvvV();
   private static final int C00OOC00oO = 128;
   private static final int uUnuvNvvNU = -1;
   private static final float vVvUvVVuuNvV = 0.004166667F;
   private static final int uNNnnnuuuN = 60;
   private static final float nuUnNvnuUu = 1.0E-4F;
   private static final float VVuuUN = 0.25F;
   private static final float vNUvnnVnUvu = 0.016666668F;
   private float[] uVUuuVnNVU;
   private float[] vuuuNvNuv;
   private float[] nvUVNnuu;
   private float[] UuuNnUvUuv;
   private float[] nUUVuvU;
   private float[] UnUNVVVNuv;
   private float[] vNVuvnUUnuUn;
   private int[] UvnvNVnnnnNU;
   private int[] uVUVnuvnuVuv;
   private int[] NVNnnvnuunNv;
   private int uVunuUNVVUUV = 128;
   private int UNnVVNvvnVvU;
   private int uNnUnnuNUnNu;
   private float NnUuNNU;
   private boolean nNvNUVU;

   private nunuUUnuvvV() {
      this.uVUuuVnNVU = new float[this.uVunuUNVVUUV];
      this.vuuuNvNuv = new float[this.uVunuUNVVUUV];
      this.nvUVNnuu = new float[this.uVunuUNVVUUV];
      this.UuuNnUvUuv = new float[this.uVunuUNVVUUV];
      this.nUUVuvU = new float[this.uVunuUNVVUUV];
      this.UnUNVVVNuv = new float[this.uVunuUNVVUUV];
      this.vNVuvnUUnuUn = new float[this.uVunuUNVVUUV];
      this.UvnvNVnnnnNU = new int[this.uVunuUNVVUUV];
      this.uVUVnuvnuVuv = new int[this.uVunuUNVVUUV];
      this.NVNnnvnuunNv = new int[this.uVunuUNVVUUV];
      Arrays.fill(this.UvnvNVnnnnNU, -1);
      Arrays.fill(this.uVUVnuvnuVuv, -1);

      for (int var1 = 0; var1 < this.uVunuUNVVUUV; var1++) {
         this.NVNnnvnuunNv[var1] = this.uVunuUNVVUUV - 1 - var1;
      }

      this.uNnUnnuNUnNu = this.uVunuUNVVUUV;
   }

   public int UuUVuuUu(float var1, Cc0cOoOcC0o var2) {
      Cc0cOoOcC0o var3 = var2 == null ? Cc0cOoOcC0o.UuUVuuUu() : var2;
      return this.UuUVuuUu(var1, var3.NVNnnvnuunNv(), var3.uVunuUNVVUUV(), var3.UNnVVNvvnVvU(), var3.uNnUnnuNUnNu());
   }

   public int UuUVuuUu(float var1, float var2, float var3, float var4, float var5) {
      if (this.UNnVVNvvnVvU == this.uVunuUNVVUUV) {
         this.uUnuvNvvNU();
      }

      int var6 = this.NVNnnvnuunNv[--this.uNnUnnuNUnNu];
      int var7 = this.UNnVVNvvnVvU++;
      this.uVUuuVnNVU[var7] = var1;
      this.vuuuNvNuv[var7] = var1;
      this.nvUVNnuu[var7] = 0.0F;
      this.UuuNnUvUuv[var7] = var2;
      this.nUUVuvU[var7] = var3;
      this.UnUNVVVNuv[var7] = var4;
      this.vNVuvnUUnuUn[var7] = var5;
      this.uVUVnuvnuVuv[var7] = var6;
      this.UvnvNVnnnnNU[var6] = var7;
      this.C00OOC00oO();
      return var6;
   }

   public void UuUVuuUu(int var1) {
      if (var1 >= 0 && var1 < this.uVunuUNVVUUV) {
         int var2 = this.UvnvNVnnnnNU[var1];
         if (var2 != -1) {
            int var3 = --this.UNnVVNvvnVvU;
            if (var2 != var3) {
               this.uVUuuVnNVU[var2] = this.uVUuuVnNVU[var3];
               this.vuuuNvNuv[var2] = this.vuuuNvNuv[var3];
               this.nvUVNnuu[var2] = this.nvUVNnuu[var3];
               this.UuuNnUvUuv[var2] = this.UuuNnUvUuv[var3];
               this.nUUVuvU[var2] = this.nUUVuvU[var3];
               this.UnUNVVVNuv[var2] = this.UnUNVVVNuv[var3];
               this.vNVuvnUUnuUn[var2] = this.vNVuvnUUnuUn[var3];
               int var4 = this.uVUVnuvnuVuv[var3];
               this.uVUVnuvnuVuv[var2] = var4;
               this.UvnvNVnnnnNU[var4] = var2;
            }

            this.uVUVnuvnuVuv[var3] = -1;
            this.UvnvNVnnnnNU[var1] = -1;
            this.NVNnnvnuunNv[this.uNnUnnuNUnNu++] = var1;
         }
      }
   }

   public void UuUVuuUu(int var1, float var2) {
      int var3 = this.uNNnnnuuuN(var1);
      if (var3 != -1) {
         this.vuuuNvNuv[var3] = var2;
      }
   }

   public void C00OOC00oO(int var1, float var2) {
      int var3 = this.uNNnnnuuuN(var1);
      if (var3 != -1) {
         this.uVUuuVnNVU[var3] = var2;
         this.vuuuNvNuv[var3] = var2;
         this.nvUVNnuu[var3] = 0.0F;
      }
   }

   public float C00OOC00oO(int var1) {
      int var2 = this.uNNnnnuuuN(var1);
      return var2 == -1 ? 0.0F : this.uVUuuVnNVU[var2];
   }

   public float uUnuvNvvNU(int var1) {
      int var2 = this.uNNnnnuuuN(var1);
      return var2 == -1 ? 0.0F : this.vuuuNvNuv[var2];
   }

   public boolean vVvUvVVuuNvV(int var1) {
      int var2 = this.uNNnnnuuuN(var1);
      return var2 == -1
         ? true
         : Math.abs(this.vuuuNvNuv[var2] - this.uVUuuVnNVU[var2]) <= this.UnUNVVVNuv[var2] && Math.abs(this.nvUVNnuu[var2]) <= this.vNVuvnUUnuUn[var2];
   }

   public int UuUVuuUu() {
      return this.UNnVVNvvnVvU;
   }

   @Override
   public boolean UuUVuuUu(float var1) {
      int var2 = this.UNnVVNvvnVvU;
      if (var2 == 0) {
         this.NnUuNNU = 0.0F;
         return true;
      } else {
         float var3 = var1;
         if (!Float.isFinite(var1) || var1 <= 0.0F) {
            var3 = 0.016666668F;
         } else if (var1 < 1.0E-4F) {
            var3 = 1.0E-4F;
         } else if (var1 > 0.25F) {
            var3 = 0.25F;
         }

         this.NnUuNNU += var3;
         float[] var4 = this.uVUuuVnNVU;
         float[] var5 = this.vuuuNvNuv;
         float[] var6 = this.nvUVNnuu;
         float[] var7 = this.UuuNnUvUuv;
         float[] var8 = this.nUUVuvU;
         float[] var9 = this.UnUNVVVNuv;
         float[] var10 = this.vNVuvnUUnuUn;

         int var11;
         for (var11 = 0; this.NnUuNNU >= 0.004166667F && var11 < 60; var11++) {
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

            this.NnUuNNU -= 0.004166667F;
         }

         if (var11 == 60) {
            this.NnUuNNU = 0.0F;
         }

         return true;
      }
   }

   private int uNNnnnuuuN(int var1) {
      return var1 >= 0 && var1 < this.uVunuUNVVUUV ? this.UvnvNVnnnnNU[var1] : -1;
   }

   private void C00OOC00oO() {
      if (!this.nNvNUVU) {
         this.nNvNUVU = true;
         vvUnNVVnV.UuUVuuUu().UuUVuuUu(this);
      }
   }

   private void uUnuvNvvNU() {
      int var1 = this.uVunuUNVVUUV << 1;
      this.uVUuuVnNVU = Arrays.copyOf(this.uVUuuVnNVU, var1);
      this.vuuuNvNuv = Arrays.copyOf(this.vuuuNvNuv, var1);
      this.nvUVNnuu = Arrays.copyOf(this.nvUVNnuu, var1);
      this.UuuNnUvUuv = Arrays.copyOf(this.UuuNnUvUuv, var1);
      this.nUUVuvU = Arrays.copyOf(this.nUUVuvU, var1);
      this.UnUNVVVNuv = Arrays.copyOf(this.UnUNVVVNuv, var1);
      this.vNVuvnUUnuUn = Arrays.copyOf(this.vNVuvnUUnuUn, var1);
      this.UvnvNVnnnnNU = Arrays.copyOf(this.UvnvNVnnnnNU, var1);
      this.uVUVnuvnuVuv = Arrays.copyOf(this.uVUVnuvnuVuv, var1);
      this.NVNnnvnuunNv = Arrays.copyOf(this.NVNnnvnuunNv, var1);

      for (int var2 = this.uVunuUNVVUUV; var2 < var1; this.NVNnnvnuunNv[this.uNnUnnuNUnNu++] = var2++) {
         this.UvnvNVnnnnNU[var2] = -1;
         this.uVUVnuvnuVuv[var2] = -1;
      }

      this.uVunuUNVVUUV = var1;
   }
}
