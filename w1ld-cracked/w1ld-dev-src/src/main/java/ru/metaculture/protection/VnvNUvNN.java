package ru.metaculture.protection;

public final class VnvNUvNN {
   private final float UuUVuuUu;
   private final float C00OOC00oO;
   private final float uUnuvNvvNU;
   private final float vVvUvVVuuNvV;
   private final float uNNnnnuuuN;
   private final float nuUnNvnuUu;
   private final float VVuuUN;
   private final float vNUvnnVnUvu;
   private final float uVUuuVnNVU;
   private final float vuuuNvNuv;
   private final float nvUVNnuu;
   private final float UuuNnUvUuv;
   private final float nUUVuvU;
   private final float UnUNVVVNuv;

   private VnvNUvNN(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14
   ) {
      this.UuUVuuUu = var1;
      this.C00OOC00oO = var2;
      this.uUnuvNvvNU = var3;
      this.vVvUvVVuuNvV = var4;
      this.uNNnnnuuuN = var5;
      this.nuUnNvnuUu = var6;
      this.VVuuUN = var7;
      this.vNUvnnVnUvu = var8;
      this.uVUuuVnNVU = var9;
      this.vuuuNvNuv = var10;
      this.nvUVNnuu = var11;
      this.UuuNnUvUuv = var12;
      this.nUUVuvU = var13;
      this.UnUNVVVNuv = var14;
   }

   public static VnvNUvNN UuUVuuUu(uVUvuUUNVUv var0, nUvnuVnNUU var1) {
      float var2 = var1.C00OOC00oO(8.0F);
      float var3 = var1.C00OOC00oO(26.0F);
      float var4 = var1.C00OOC00oO(6.0F);
      float var5 = var0.c0oOOCcCoC0() + var2 + var1.C00OOC00oO(44.0F) + var4;
      float var6 = var5 + var3 + var4;
      float var7 = var0.c0oOOCcCoC0() + var1.UNnVVNvvnVvU() - var2 - var6;
      float var8 = var1.uVunuUNVVUUV() - var2 * 2.0F;
      float var9 = var1.C00OOC00oO(4.0F);
      float var10 = var1.C00OOC00oO(18.0F);
      float var11 = var8 - var9 - var10;
      float var12 = var1.C00OOC00oO(8.0F);
      float var13 = (var11 - var12) * 0.5F;
      float var14 = var1.C00OOC00oO(34.0F);
      float var15 = var0.UvUvUNuvNU() + var2 + var9;
      return new VnvNUvNN(
         var0.UvUvUNuvNU() + var2, var6, var8, var7, var0.UvUvUNuvNU() + var2, var5, var8, var3, var15, var13, var14, var12, var1.C00OOC00oO(6.0F), var9
      );
   }

   public VnvNUvNN.NVnVnNnN UuUVuuUu(int var1, float var2) {
      int var3 = var1 % 2;
      int var4 = var1 / 2;
      float var5 = this.uVUuuVnNVU + var3 * (this.vuuuNvNuv + this.UuuNnUvUuv);
      float var6 = this.C00OOC00oO + this.UnUNVVVNuv + var2 + var4 * (this.nvUVNnuu + this.nUUVuvU);
      return new VnvNUvNN.NVnVnNnN(var5, var6, this.vuuuNvNuv, this.nvUVNnuu);
   }

   public float UuUVuuUu(int var1) {
      int var2 = (var1 + 1) / 2;
      return this.UnUNVVVNuv * 2.0F + var2 * this.nvUVNnuu + Math.max(0, var2 - 1) * this.nUUVuvU;
   }

   public boolean UuUVuuUu(VnvNUvNN.NVnVnNnN var1, float var2) {
      float var3 = this.C00OOC00oO - Math.max(0.0F, var2);
      float var4 = this.C00OOC00oO + this.vVvUvVVuuNvV + Math.max(0.0F, var2);
      return var1.y + var1.height >= var3 && var1.y <= var4;
   }

   public float UuUVuuUu() {
      return this.UuUVuuUu;
   }

   public float C00OOC00oO() {
      return this.C00OOC00oO;
   }

   public float uUnuvNvvNU() {
      return this.uUnuvNvvNU;
   }

   public float vVvUvVVuuNvV() {
      return this.vVvUvVVuuNvV;
   }

   public float uNNnnnuuuN() {
      return this.uNNnnnuuuN;
   }

   public float nuUnNvnuUu() {
      return this.nuUnNvnuUu;
   }

   public float VVuuUN() {
      return this.VVuuUN;
   }

   public float vNUvnnVnUvu() {
      return this.vNUvnnVnUvu;
   }

   public float uVUuuVnNVU() {
      return this.uNNnnnuuuN + this.VVuuUN - this.vNUvnnVnUvu;
   }

   public float vuuuNvNuv() {
      return this.vNUvnnVnUvu;
   }

   public float nvUVNnuu() {
      return this.vuuuNvNuv;
   }

   public float UuuNnUvUuv() {
      return this.nvUVNnuu;
   }

   public record NVnVnNnN(float x, float y, float width, float height) {
   }
}
