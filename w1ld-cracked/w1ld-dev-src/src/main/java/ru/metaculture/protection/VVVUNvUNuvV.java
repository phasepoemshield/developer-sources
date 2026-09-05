package ru.metaculture.protection;

import net.minecraft.class_243;

public final class VVVUNvUNuvV {
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
   private final float nvUVNnuu;
   private final float UuuNnUvUuv;
   private final float nUUVuvU;
   private final int UnUNVVVNuv;

   public VVVUNvUNuvV(class_243 var1, class_243 var2, long var3, long var5, float var7, float var8, float var9, float var10, int var11) {
      this.UuUVuuUu = var1.field_1352;
      this.C00OOC00oO = var1.field_1351;
      this.uUnuvNvvNU = var1.field_1350;
      double var12 = var2.field_1352;
      double var14 = var2.field_1351;
      double var16 = var2.field_1350;
      double var18 = Math.sqrt(var12 * var12 + var14 * var14 + var16 * var16);
      if (var18 < 1.0E-6) {
         var12 = 0.0;
         var14 = 0.0;
         var16 = 1.0;
      } else {
         var12 /= var18;
         var14 /= var18;
         var16 /= var18;
      }

      this.vVvUvVVuuNvV = var12;
      this.uNNnnnuuuN = var14;
      this.nuUnNvnuUu = var16;
      this.VVuuUN = var3;
      this.vNUvnnVnUvu = Math.max(1L, var5);
      this.uVUuuVnNVU = Math.max(0.1F, var7);
      this.vuuuNvNuv = Math.max(0.1F, var8);
      this.nvUVNnuu = Math.max(0.05F, var9);
      this.UuuNnUvUuv = var10;
      this.nUUVuvU = this.uVUuuVnNVU * 1.8F + 0.5F;
      this.UnUNVVVNuv = var11 & 16777215;
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

   public float nvUVNnuu() {
      return this.nvUVNnuu;
   }

   public float UuuNnUvUuv() {
      return this.UuuNnUvUuv;
   }

   public float nUUVuvU() {
      return this.nUUVuvU;
   }

   public int UnUNVVVNuv() {
      return this.UnUNVVVNuv;
   }

   public float UuUVuuUu(long var1) {
      float var3 = (float)(var1 - this.VVuuUN) / (float)this.vNUvnnVnUvu;
      return var3 < 0.0F ? 0.0F : Math.min(var3, 1.0F);
   }

   public boolean C00OOC00oO(long var1) {
      return var1 - this.VVuuUN >= this.vNUvnnVnUvu;
   }
}
