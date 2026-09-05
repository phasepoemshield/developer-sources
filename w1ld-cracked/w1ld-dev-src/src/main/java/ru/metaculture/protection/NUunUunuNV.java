package ru.metaculture.protection;

import lombok.Generated;

public final class NUunUunuNV {
   private static final NUunUunuNV[][] UuUVuuUu = new NUunUunuNV[NvVNvUvunNNu.values().length][2];
   private final int C00OOC00oO;
   private final int uUnuvNvvNU;
   private final int vVvUvVVuuNvV;
   private final int uNNnnnuuuN;
   private final int nuUnNvnuUu;
   private final int VVuuUN;
   private final int vNUvnnVnUvu;
   private final int uVUuuVnNVU;
   private final int vuuuNvNuv;
   private final int nvUVNnuu;
   private final int UuuNnUvUuv;
   private final int nUUVuvU;
   private final int UnUNVVVNuv;
   private final int vNVuvnUUnuUn;
   private final int UvnvNVnnnnNU;
   private final boolean uVUVnuvnuVuv;

   public int UuUVuuUu() {
      return this.uVUVnuvnuVuv ? -14705331 : -12452048;
   }

   public int C00OOC00oO() {
      return this.uVUVnuvnuVuv ? -4181953 : -43920;
   }

   public int uUnuvNvvNU() {
      return this.uVUVnuvnuVuv ? -6200825 : -17847;
   }

   public int vVvUvVVuuNvV() {
      int var1 = uUnuvNvvNU(this.C00OOC00oO, -16777216);
      int var2 = uUnuvNvvNU(this.C00OOC00oO, -1);
      return UuUVuuUu(this.vNVuvnUUnuUn, var1, var2, uUnuvNvvNU(this.uUnuvNvvNU, var1), uUnuvNvvNU(this.uUnuvNvvNU, var2), 4.5F);
   }

   public static NUunUunuNV UuUVuuUu(NvVNvUvunNNu var0) {
      return UuUVuuUu(var0, OO0OCoOC.UuUVuuUu().uUnuvNvvNU(var0));
   }

   public static NUunUunuNV UuUVuuUu(NvVNvUvunNNu var0, boolean var1) {
      if (var0 == null) {
         var0 = NvVNvUvunNNu.WILD;
      }

      if (var0 == NvVNvUvunNNu.CUSTOM) {
         Menu.UvnvNVnnnnNU();
         return C00OOC00oO(var0, var1);
      } else {
         int var2 = var1 ? 1 : 0;
         NUunUunuNV var3 = UuUVuuUu[var0.ordinal()][var2];
         if (var3 != null) {
            return var3;
         } else {
            NUunUunuNV var4 = C00OOC00oO(var0, var1);
            UuUVuuUu[var0.ordinal()][var2] = var4;
            return var4;
         }
      }
   }

   private static NUunUunuNV C00OOC00oO(NvVNvUvunNNu var0, boolean var1) {
      OO0OCoOC var2 = OO0OCoOC.UuUVuuUu();
      int var3 = var2.vVvUvVVuuNvV(var0);
      int var4 = var2.uNNnnnuuuN(var0);
      int var5 = var1 ? var0.uNNnnnuuuN().getRGB() : var0.vVvUvVVuuNvV().getRGB();
      int var6 = var0.uNNnnnuuuN().getRGB();
      int var7 = var0.nuUnNvnuUu().getRGB();
      if (var0 == NvVNvUvunNNu.MIDNIGHT_AZURE) {
         return UuUVuuUu(
            uNNnnnuuuN()
               .UuUVuuUu(UuUVuuUu(5, 10, 22, 238))
               .C00OOC00oO(UuUVuuUu(8, 19, 34, 242))
               .uUnuvNvvNU(UuUVuuUu(189, 234, 255, 8))
               .vVvUvVVuuNvV(UuUVuuUu(189, 234, 255, 13))
               .uNNnnnuuuN(UuUVuuUu(189, 234, 255, 20))
               .nuUnNvnuUu(UuUVuuUu(189, 234, 255, 28))
               .VVuuUN(UuUVuuUu(189, 234, 255, 38))
               .vNUvnnVnUvu(UuUVuuUu(189, 234, 255, 50))
               .uVUuuVnNVU(UuUVuuUu(0, 240, 255, 72))
               .vuuuNvNuv(UuUVuuUu(0, 240, 255, 90))
               .nvUVNnuu(UuUVuuUu(189, 234, 255, 140))
               .UuuNnUvUuv(UuUVuuUu(232, 251, 255, 214))
               .nUUVuvU(UuUVuuUu(255, 255, 255, 255))
               .UnUNVVVNuv(-16715521)
               .vNVuvnUUnuUn(-16759553)
               .UuUVuuUu(false)
               .UuUVuuUu()
         );
      } else {
         NUunUunuNV.NVnVnNnN var8 = uNNnnnuuuN()
            .UuUVuuUu(UuUVuuUu(UuUVuuUu(var0.C00OOC00oO().getRGB(), var4, var1 ? 0.04F : 0.05F), var1 ? 226 : 232))
            .C00OOC00oO(UuUVuuUu(UuUVuuUu(var0.uUnuvNvvNU().getRGB(), var4, var1 ? 0.025F : 0.035F), var1 ? 240 : 238))
            .nUUVuvU(UuUVuuUu(var6, 255))
            .UnUNVVVNuv(var3)
            .vNVuvnUUnuUn(var4)
            .UuUVuuUu(var1);
         return var1
            ? UuUVuuUu(
               var8.uUnuvNvvNU(UuUVuuUu(var5, 4))
                  .vVvUvVVuuNvV(UuUVuuUu(var5, 8))
                  .uNNnnnuuuN(UuUVuuUu(var5, 12))
                  .nuUnNvnuUu(UuUVuuUu(var5, 16))
                  .VVuuUN(UuUVuuUu(var5, 24))
                  .vNUvnnVnUvu(UuUVuuUu(var5, 31))
                  .uVUuuVnNVU(UuUVuuUu(var5, 42))
                  .vuuuNvNuv(UuUVuuUu(var5, 54))
                  .nvUVNnuu(UuUVuuUu(var7, 190))
                  .UuuNnUvUuv(UuUVuuUu(var7, 255))
                  .UuUVuuUu()
            )
            : UuUVuuUu(
               var8.uUnuvNvvNU(UuUVuuUu(var5, 3))
                  .vVvUvVVuuNvV(UuUVuuUu(var5, 5))
                  .uNNnnnuuuN(UuUVuuUu(var5, 8))
                  .nuUnNvnuUu(UuUVuuUu(var5, 10))
                  .VVuuUN(UuUVuuUu(var5, 15))
                  .vNUvnnVnUvu(UuUVuuUu(var5, 20))
                  .uVUuuVnNVU(UuUVuuUu(var5, 31))
                  .vuuuNvNuv(UuUVuuUu(var5, 41))
                  .nvUVNnuu(UuUVuuUu(var7, 61))
                  .UuuNnUvUuv(UuUVuuUu(var7, 122))
                  .UuUVuuUu()
            );
      }
   }

   public static NUunUunuNV UuUVuuUu(NvVNvUvunNNu var0, NUunUunuNV var1, long var2) {
      if (var1 == null) {
         var1 = UuUVuuUu(var0);
      }

      return NNuuNuvNn.UuUVuuUu(var0, var1, var2);
   }

   public static int UuUVuuUu(int var0, int var1, int var2, int var3) {
      return (var3 & 0xFF) << 24 | (var0 & 0xFF) << 16 | (var1 & 0xFF) << 8 | var2 & 0xFF;
   }

   public static int UuUVuuUu(int var0, int var1) {
      return UuUVuuUu(var0 >> 16 & 0xFF, var0 >> 8 & 0xFF, var0 & 0xFF, Math.max(0, Math.min(255, var1)));
   }

   public static int UuUVuuUu(int var0, int var1, float var2) {
      return VnVnuUn.uUnuvNvvNU(var0, var1, var2);
   }

   public static int C00OOC00oO(int var0, int var1, float var2) {
      float var3 = Math.max(0.0F, Math.min(1.0F, var2));
      int var4 = var0 >>> 16 & 0xFF;
      int var5 = var0 >>> 8 & 0xFF;
      int var6 = var0 & 0xFF;
      int var7 = var0 >>> 24 & 0xFF;
      int var8 = var1 >>> 16 & 0xFF;
      int var9 = var1 >>> 8 & 0xFF;
      int var10 = var1 & 0xFF;
      int var11 = 255 - (255 - var4) * (255 - var8) / 255;
      int var12 = 255 - (255 - var5) * (255 - var9) / 255;
      int var13 = 255 - (255 - var6) * (255 - var10) / 255;
      return VnVnuUn.uUnuvNvvNU(var0, UuUVuuUu(var11, var12, var13, var7), var3);
   }

   public static NUunUunuNV UuUVuuUu(NUunUunuNV var0) {
      if (var0 == null) {
         return null;
      } else {
         int var1 = uUnuvNvvNU(var0.C00OOC00oO, -16777216);
         int var2 = uUnuvNvvNU(var0.C00OOC00oO, -1);
         int var3 = uUnuvNvvNU(var0.uUnuvNvvNU, var1);
         int var4 = uUnuvNvvNU(var0.uUnuvNvvNU, var2);
         return uNNnnnuuuN()
            .UuUVuuUu(var0.C00OOC00oO)
            .C00OOC00oO(var0.uUnuvNvvNU)
            .uUnuvNvvNU(var0.vVvUvVVuuNvV)
            .vVvUvVVuuNvV(var0.uNNnnnuuuN)
            .uNNnnnuuuN(var0.nuUnNvnuUu)
            .nuUnNvnuUu(var0.VVuuUN)
            .VVuuUN(var0.vNUvnnVnUvu)
            .vNUvnnVnUvu(var0.uVUuuVnNVU)
            .uVUuuVnNVU(var0.vuuuNvNuv)
            .vuuuNvNuv(var0.nvUVNnuu)
            .nvUVNnuu(UuUVuuUu(var0.UuuNnUvUuv, var1, var2, var3, var4, 3.0F))
            .UuuNnUvUuv(UuUVuuUu(var0.nUUVuvU, var1, var2, var3, var4, 4.8F))
            .nUUVuvU(UuUVuuUu(var0.UnUNVVVNuv, var1, var2, var3, var4, 7.0F))
            .UnUNVVVNuv(var0.vNVuvnUUnuUn)
            .vNVuvnUUnuUn(var0.UvnvNVnnnnNU)
            .UuUVuuUu(var0.uVUVnuvnuVuv)
            .UuUVuuUu();
      }
   }

   private static int UuUVuuUu(int var0, int var1, int var2, int var3, int var4, float var5) {
      if (UuUVuuUu(var0, var1, var2, var3, var4) >= var5) {
         return var0;
      } else {
         int var6 = UuUVuuUu(var0, 255);
         if (UuUVuuUu(var6, var1, var2, var3, var4) >= var5) {
            int var15 = var0 >>> 24 & 0xFF;
            int var16 = 255;

            for (int var17 = 0; var17 < 10; var17++) {
               int var18 = var15 + var16 >>> 1;
               int var19 = UuUVuuUu(var0, var18);
               if (UuUVuuUu(var19, var1, var2, var3, var4) >= var5) {
                  var16 = var18;
               } else {
                  var15 = var18 + 1;
               }
            }

            return UuUVuuUu(var0, var16);
         } else {
            int var7 = var6;
            float var8 = (UuUVuuUu(var1) + UuUVuuUu(var2) + UuUVuuUu(var3) + UuUVuuUu(var4)) * 0.25F;
            int var9 = var8 > 0.48F ? -16777216 : -1;
            float var10 = 0.0F;
            float var11 = 1.0F;

            for (int var12 = 0; var12 < 14; var12++) {
               float var13 = (var10 + var11) * 0.5F;
               int var14 = UuUVuuUu(UuUVuuUu(var7, var9, var13), 255);
               if (UuUVuuUu(var14, var1, var2, var3, var4) >= var5) {
                  var11 = var13;
               } else {
                  var10 = var13;
               }
            }

            return UuUVuuUu(UuUVuuUu(var7, var9, var11), 255);
         }
      }
   }

   private static float UuUVuuUu(int var0, int var1, int var2, int var3, int var4) {
      return Math.min(Math.min(C00OOC00oO(var0, var1), C00OOC00oO(var0, var2)), Math.min(C00OOC00oO(var0, var3), C00OOC00oO(var0, var4)));
   }

   private static float C00OOC00oO(int var0, int var1) {
      float var2 = UuUVuuUu(uUnuvNvvNU(var0, var1));
      float var3 = UuUVuuUu(var1);
      return (Math.max(var2, var3) + 0.05F) / (Math.min(var2, var3) + 0.05F);
   }

   private static int uUnuvNvvNU(int var0, int var1) {
      float var2 = (var0 >>> 24 & 0xFF) / 255.0F;
      int var3 = Math.round((var0 >>> 16 & 0xFF) * var2 + (var1 >>> 16 & 0xFF) * (1.0F - var2));
      int var4 = Math.round((var0 >>> 8 & 0xFF) * var2 + (var1 >>> 8 & 0xFF) * (1.0F - var2));
      int var5 = Math.round((var0 & 0xFF) * var2 + (var1 & 0xFF) * (1.0F - var2));
      return UuUVuuUu(var3, var4, var5, 255);
   }

   private static float UuUVuuUu(int var0) {
      return 0.2126F * C00OOC00oO(var0 >>> 16 & 0xFF) + 0.7152F * C00OOC00oO(var0 >>> 8 & 0xFF) + 0.0722F * C00OOC00oO(var0 & 0xFF);
   }

   private static float C00OOC00oO(int var0) {
      float var1 = var0 / 255.0F;
      return var1 <= 0.04045F ? var1 / 12.92F : (float)Math.pow((var1 + 0.055F) / 1.055F, 2.4F);
   }

   static int UuUVuuUu(int[] var0, float var1) {
      if (var0 != null && var0.length != 0) {
         if (var0.length == 1) {
            return var0[0];
         } else {
            float var2 = var1 - (float)Math.floor(var1);
            float var3 = var2 * (var0.length - 1);
            int var4 = Math.min(var0.length - 2, Math.max(0, (int)Math.floor(var3)));
            return UuUVuuUu(var0[var4], var0[var4 + 1], var3 - var4);
         }
      } else {
         return -1;
      }
   }

   public static NUunUunuNV UuUVuuUu(NUunUunuNV var0, NUunUunuNV var1, float var2) {
      if (var2 <= 0.0F) {
         return var0;
      } else {
         return var2 >= 1.0F
            ? var1
            : UuUVuuUu(
               uNNnnnuuuN()
                  .UuUVuuUu(UuUVuuUu(var0.C00OOC00oO, var1.C00OOC00oO, var2))
                  .C00OOC00oO(UuUVuuUu(var0.uUnuvNvvNU, var1.uUnuvNvvNU, var2))
                  .uUnuvNvvNU(UuUVuuUu(var0.vVvUvVVuuNvV, var1.vVvUvVVuuNvV, var2))
                  .vVvUvVVuuNvV(UuUVuuUu(var0.uNNnnnuuuN, var1.uNNnnnuuuN, var2))
                  .uNNnnnuuuN(UuUVuuUu(var0.nuUnNvnuUu, var1.nuUnNvnuUu, var2))
                  .nuUnNvnuUu(UuUVuuUu(var0.VVuuUN, var1.VVuuUN, var2))
                  .VVuuUN(UuUVuuUu(var0.vNUvnnVnUvu, var1.vNUvnnVnUvu, var2))
                  .vNUvnnVnUvu(UuUVuuUu(var0.uVUuuVnNVU, var1.uVUuuVnNVU, var2))
                  .uVUuuVnNVU(UuUVuuUu(var0.vuuuNvNuv, var1.vuuuNvNuv, var2))
                  .vuuuNvNuv(UuUVuuUu(var0.nvUVNnuu, var1.nvUVNnuu, var2))
                  .nvUVNnuu(UuUVuuUu(var0.UuuNnUvUuv, var1.UuuNnUvUuv, var2))
                  .UuuNnUvUuv(UuUVuuUu(var0.nUUVuvU, var1.nUUVuvU, var2))
                  .nUUVuvU(UuUVuuUu(var0.UnUNVVVNuv, var1.UnUNVVVNuv, var2))
                  .UnUNVVVNuv(UuUVuuUu(var0.vNVuvnUUnuUn, var1.vNVuvnUUnuUn, var2))
                  .vNVuvnUUnuUn(UuUVuuUu(var0.UvnvNVnnnnNU, var1.UvnvNVnnnnNU, var2))
                  .UuUVuuUu(var2 >= 0.5F ? var1.uVUVnuvnuVuv : var0.uVUVnuvnuVuv)
                  .UuUVuuUu()
            );
      }
   }

   static int UuUVuuUu(int var0, float var1) {
      return VnVnuUn.uUnuvNvvNU(UuUVuuUu(var0, 255), -1, var1);
   }

   @Generated
   NUunUunuNV(
      int var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      int var13,
      int var14,
      int var15,
      boolean var16
   ) {
      this.C00OOC00oO = var1;
      this.uUnuvNvvNU = var2;
      this.vVvUvVVuuNvV = var3;
      this.uNNnnnuuuN = var4;
      this.nuUnNvnuUu = var5;
      this.VVuuUN = var6;
      this.vNUvnnVnUvu = var7;
      this.uVUuuVnNVU = var8;
      this.vuuuNvNuv = var9;
      this.nvUVNnuu = var10;
      this.UuuNnUvUuv = var11;
      this.nUUVuvU = var12;
      this.UnUNVVVNuv = var13;
      this.vNVuvnUUnuUn = var14;
      this.UvnvNVnnnnNU = var15;
      this.uVUVnuvnuVuv = var16;
   }

   @Generated
   public static NUunUunuNV.NVnVnNnN uNNnnnuuuN() {
      return new NUunUunuNV.NVnVnNnN();
   }

   @Generated
   public int nuUnNvnuUu() {
      return this.C00OOC00oO;
   }

   @Generated
   public int VVuuUN() {
      return this.uUnuvNvvNU;
   }

   @Generated
   public int vNUvnnVnUvu() {
      return this.vVvUvVVuuNvV;
   }

   @Generated
   public int uVUuuVnNVU() {
      return this.uNNnnnuuuN;
   }

   @Generated
   public int vuuuNvNuv() {
      return this.nuUnNvnuUu;
   }

   @Generated
   public int nvUVNnuu() {
      return this.VVuuUN;
   }

   @Generated
   public int UuuNnUvUuv() {
      return this.vNUvnnVnUvu;
   }

   @Generated
   public int nUUVuvU() {
      return this.uVUuuVnNVU;
   }

   @Generated
   public int UnUNVVVNuv() {
      return this.vuuuNvNuv;
   }

   @Generated
   public int vNVuvnUUnuUn() {
      return this.nvUVNnuu;
   }

   @Generated
   public int UvnvNVnnnnNU() {
      return this.UuuNnUvUuv;
   }

   @Generated
   public int uVUVnuvnuVuv() {
      return this.nUUVuvU;
   }

   @Generated
   public int NVNnnvnuunNv() {
      return this.UnUNVVVNuv;
   }

   @Generated
   public int uVunuUNVVUUV() {
      return this.vNVuvnUUnuUn;
   }

   @Generated
   public int UNnVVNvvnVvU() {
      return this.UvnvNVnnnnNU;
   }

   @Generated
   public boolean uNnUnnuNUnNu() {
      return this.uVUVnuvnuVuv;
   }

   @Generated
   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof NUunUunuNV var2)) {
         return false;
      } else if (this.nuUnNvnuUu() != var2.nuUnNvnuUu()) {
         return false;
      } else if (this.VVuuUN() != var2.VVuuUN()) {
         return false;
      } else if (this.vNUvnnVnUvu() != var2.vNUvnnVnUvu()) {
         return false;
      } else if (this.uVUuuVnNVU() != var2.uVUuuVnNVU()) {
         return false;
      } else if (this.vuuuNvNuv() != var2.vuuuNvNuv()) {
         return false;
      } else if (this.nvUVNnuu() != var2.nvUVNnuu()) {
         return false;
      } else if (this.UuuNnUvUuv() != var2.UuuNnUvUuv()) {
         return false;
      } else if (this.nUUVuvU() != var2.nUUVuvU()) {
         return false;
      } else if (this.UnUNVVVNuv() != var2.UnUNVVVNuv()) {
         return false;
      } else if (this.vNVuvnUUnuUn() != var2.vNVuvnUUnuUn()) {
         return false;
      } else if (this.UvnvNVnnnnNU() != var2.UvnvNVnnnnNU()) {
         return false;
      } else if (this.uVUVnuvnuVuv() != var2.uVUVnuvnuVuv()) {
         return false;
      } else if (this.NVNnnvnuunNv() != var2.NVNnnvnuunNv()) {
         return false;
      } else if (this.uVunuUNVVUUV() != var2.uVunuUNVVUUV()) {
         return false;
      } else {
         return this.UNnVVNvvnVvU() != var2.UNnVVNvvnVvU() ? false : this.uNnUnnuNUnNu() == var2.uNnUnnuNUnNu();
      }
   }

   @Generated
   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      var2 = var2 * 59 + this.nuUnNvnuUu();
      var2 = var2 * 59 + this.VVuuUN();
      var2 = var2 * 59 + this.vNUvnnVnUvu();
      var2 = var2 * 59 + this.uVUuuVnNVU();
      var2 = var2 * 59 + this.vuuuNvNuv();
      var2 = var2 * 59 + this.nvUVNnuu();
      var2 = var2 * 59 + this.UuuNnUvUuv();
      var2 = var2 * 59 + this.nUUVuvU();
      var2 = var2 * 59 + this.UnUNVVVNuv();
      var2 = var2 * 59 + this.vNVuvnUUnuUn();
      var2 = var2 * 59 + this.UvnvNVnnnnNU();
      var2 = var2 * 59 + this.uVUVnuvnuVuv();
      var2 = var2 * 59 + this.NVNnnvnuunNv();
      var2 = var2 * 59 + this.uVunuUNVVUUV();
      var2 = var2 * 59 + this.UNnVVNvvnVvU();
      return var2 * 59 + (this.uNnUnnuNUnNu() ? 79 : 97);
   }

   @Generated
   @Override
   public String toString() {
      return "Colors(panel="
         + this.nuUnNvnuUu()
         + ", surface="
         + this.VVuuUN()
         + ", white01="
         + this.vNUvnnVnUvu()
         + ", white02="
         + this.uVUuuVnNVU()
         + ", white03="
         + this.vuuuNvNuv()
         + ", white04="
         + this.nvUVNnuu()
         + ", white06="
         + this.UuuNnUvUuv()
         + ", white08="
         + this.nUUVuvU()
         + ", white12="
         + this.UnUNVVVNuv()
         + ", white16="
         + this.vNVuvnUUnuUn()
         + ", white24="
         + this.UvnvNVnnnnNU()
         + ", white48="
         + this.uVUVnuvnuVuv()
         + ", white="
         + this.NVNnnvnuunNv()
         + ", accentTop="
         + this.uVunuUNVVUUV()
         + ", accentBottom="
         + this.UNnVVNvvnVvU()
         + ", lightMode="
         + this.uNnUnnuNUnNu()
         + ")";
   }

   @Generated
   public static class NVnVnNnN {
      @Generated
      private int UuUVuuUu;
      @Generated
      private int C00OOC00oO;
      @Generated
      private int uUnuvNvvNU;
      @Generated
      private int vVvUvVVuuNvV;
      @Generated
      private int uNNnnnuuuN;
      @Generated
      private int nuUnNvnuUu;
      @Generated
      private int VVuuUN;
      @Generated
      private int vNUvnnVnUvu;
      @Generated
      private int uVUuuVnNVU;
      @Generated
      private int vuuuNvNuv;
      @Generated
      private int nvUVNnuu;
      @Generated
      private int UuuNnUvUuv;
      @Generated
      private int nUUVuvU;
      @Generated
      private int UnUNVVVNuv;
      @Generated
      private int vNVuvnUUnuUn;
      @Generated
      private boolean UvnvNVnnnnNU;

      @Generated
      NVnVnNnN() {
      }

      @Generated
      public NUunUunuNV.NVnVnNnN UuUVuuUu(int var1) {
         this.UuUVuuUu = var1;
         return this;
      }

      @Generated
      public NUunUunuNV.NVnVnNnN C00OOC00oO(int var1) {
         this.C00OOC00oO = var1;
         return this;
      }

      @Generated
      public NUunUunuNV.NVnVnNnN uUnuvNvvNU(int var1) {
         this.uUnuvNvvNU = var1;
         return this;
      }

      @Generated
      public NUunUunuNV.NVnVnNnN vVvUvVVuuNvV(int var1) {
         this.vVvUvVVuuNvV = var1;
         return this;
      }

      @Generated
      public NUunUunuNV.NVnVnNnN uNNnnnuuuN(int var1) {
         this.uNNnnnuuuN = var1;
         return this;
      }

      @Generated
      public NUunUunuNV.NVnVnNnN nuUnNvnuUu(int var1) {
         this.nuUnNvnuUu = var1;
         return this;
      }

      @Generated
      public NUunUunuNV.NVnVnNnN VVuuUN(int var1) {
         this.VVuuUN = var1;
         return this;
      }

      @Generated
      public NUunUunuNV.NVnVnNnN vNUvnnVnUvu(int var1) {
         this.vNUvnnVnUvu = var1;
         return this;
      }

      @Generated
      public NUunUunuNV.NVnVnNnN uVUuuVnNVU(int var1) {
         this.uVUuuVnNVU = var1;
         return this;
      }

      @Generated
      public NUunUunuNV.NVnVnNnN vuuuNvNuv(int var1) {
         this.vuuuNvNuv = var1;
         return this;
      }

      @Generated
      public NUunUunuNV.NVnVnNnN nvUVNnuu(int var1) {
         this.nvUVNnuu = var1;
         return this;
      }

      @Generated
      public NUunUunuNV.NVnVnNnN UuuNnUvUuv(int var1) {
         this.UuuNnUvUuv = var1;
         return this;
      }

      @Generated
      public NUunUunuNV.NVnVnNnN nUUVuvU(int var1) {
         this.nUUVuvU = var1;
         return this;
      }

      @Generated
      public NUunUunuNV.NVnVnNnN UnUNVVVNuv(int var1) {
         this.UnUNVVVNuv = var1;
         return this;
      }

      @Generated
      public NUunUunuNV.NVnVnNnN vNVuvnUUnuUn(int var1) {
         this.vNVuvnUUnuUn = var1;
         return this;
      }

      @Generated
      public NUunUunuNV.NVnVnNnN UuUVuuUu(boolean var1) {
         this.UvnvNVnnnnNU = var1;
         return this;
      }

      @Generated
      public NUunUunuNV UuUVuuUu() {
         return new NUunUunuNV(
            this.UuUVuuUu,
            this.C00OOC00oO,
            this.uUnuvNvvNU,
            this.vVvUvVVuuNvV,
            this.uNNnnnuuuN,
            this.nuUnNvnuUu,
            this.VVuuUN,
            this.vNUvnnVnUvu,
            this.uVUuuVnNVU,
            this.vuuuNvNuv,
            this.nvUVNnuu,
            this.UuuNnUvUuv,
            this.nUUVuvU,
            this.UnUNVVVNuv,
            this.vNVuvnUUnuUn,
            this.UvnvNVnnnnNU
         );
      }

      @Generated
      @Override
      public String toString() {
         return "Colors.ColorsBuilder(panel="
            + this.UuUVuuUu
            + ", surface="
            + this.C00OOC00oO
            + ", white01="
            + this.uUnuvNvvNU
            + ", white02="
            + this.vVvUvVVuuNvV
            + ", white03="
            + this.uNNnnnuuuN
            + ", white04="
            + this.nuUnNvnuUu
            + ", white06="
            + this.VVuuUN
            + ", white08="
            + this.vNUvnnVnUvu
            + ", white12="
            + this.uVUuuVnNVU
            + ", white16="
            + this.vuuuNvNuv
            + ", white24="
            + this.nvUVNnuu
            + ", white48="
            + this.UuuNnUvUuv
            + ", white="
            + this.nUUVuvU
            + ", accentTop="
            + this.UnUNVVVNuv
            + ", accentBottom="
            + this.vNVuvnUUnuUn
            + ", lightMode="
            + this.UvnvNVnnnnNU
            + ")";
      }
   }
}
