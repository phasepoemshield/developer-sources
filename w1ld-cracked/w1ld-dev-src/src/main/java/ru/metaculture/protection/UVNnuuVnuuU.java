package ru.metaculture.protection;

import net.minecraft.class_243;

public final class UVNnuuVnuuU {
   private final double UuUVuuUu;
   private final double C00OOC00oO;
   private final double uUnuvNvvNU;
   private final double vVvUvVVuuNvV;
   private final double uNNnnnuuuN;
   private final double nuUnNvnuUu;
   private final long VVuuUN;
   private final long vNUvnnVnUvu;
   private final float uVUuuVnNVU;
   private final float vuuuNvNuv;
   private final int nvUVNnuu;

   public UVNnuuVnuuU(class_243 var1, class_243 var2, long var3, long var5, float var7, float var8, int var9) {
      this.UuUVuuUu = var1.field_1352;
      this.C00OOC00oO = var1.field_1351;
      this.uUnuvNvvNU = var1.field_1350;
      double var10 = var2.field_1352;
      double var12 = var2.field_1351;
      double var14 = var2.field_1350;
      double var16 = Math.sqrt(var10 * var10 + var12 * var12 + var14 * var14);
      if (var16 < 1.0E-6) {
         var10 = 0.0;
         var12 = 0.0;
         var14 = 1.0;
      } else {
         var10 /= var16;
         var12 /= var16;
         var14 /= var16;
      }

      this.vVvUvVVuuNvV = var10;
      this.uNNnnnuuuN = var12;
      this.nuUnNvnuUu = var14;
      this.VVuuUN = var3;
      this.vNUvnnVnUvu = Math.max(1L, var5);
      this.uVUuuVnNVU = var7;
      this.vuuuNvNuv = var8;
      this.nvUVNnuu = var9 & 16777215;
   }

   public double UuUVuuUu() {
      return this.UuUVuuUu;
   }

   public double C00OOC00oO() {
      return this.C00OOC00oO;
   }

   public double uUnuvNvvNU() {
      return this.uUnuvNvvNU;
   }

   public double vVvUvVVuuNvV() {
      return this.vVvUvVVuuNvV;
   }

   public double uNNnnnuuuN() {
      return this.uNNnnnuuuN;
   }

   public double nuUnNvnuUu() {
      return this.nuUnNvnuUu;
   }

   public long VVuuUN() {
      return this.VVuuUN;
   }

   public long vNUvnnVnUvu() {
      return this.vNUvnnVnUvu;
   }

   public float uVUuuVnNVU() {
      return this.uVUuuVnNVU;
   }

   public float vuuuNvNuv() {
      return this.vuuuNvNuv;
   }

   public int nvUVNnuu() {
      return this.nvUVNnuu;
   }

   public float UuUVuuUu(long var1) {
      float var3 = (float)(var1 - this.VVuuUN) / (float)this.vNUvnnVnUvu;
      return var3 < 0.0F ? 0.0F : Math.min(var3, 1.0F);
   }

   public boolean C00OOC00oO(long var1) {
      return var1 - this.VVuuUN >= this.vNUvnnVnUvu;
   }
}
