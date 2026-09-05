package ru.metaculture.protection;

public record O0oC0cc0O0Oo(boolean visible, float alpha, float scale, float pivotX, float pivotY, float translateX, float translateY) {
   public static O0oC0cc0O0Oo resolve(float var0, uVUvuUUNVUv var1, nUvnuVnNUU var2) {
      float var3 = Math.max(0.0F, Math.min(1.0F, var0));
      float var4 = nUUNvUVNv.UuUVuuUu(var1, var2);
      float var5 = nUUNvUVNv.C00OOC00oO(var1, var2);
      float var6 = nUUNvUVNv.UuUVuuUu(var2);
      float var7 = nUUNvUVNv.uUnuvNvvNU(var1, var2);
      float var8 = var1.uUnuvNvvNU() + var2.UuUVuuUu(36.0F);
      float var9 = var1.vVvUvVVuuNvV() + var1.nuUnNvnuUu() - var2.UuUVuuUu(36.0F);
      float var10 = var3 * var3 * (3.0F - 2.0F * var3);
      float var11 = 0.965F + var3 * 0.035F;
      float var12 = var8 + (var4 + var6 * 0.5F - var8) * var3;
      float var13 = var9 + (var5 + var7 * 0.5F - var9) * var3;
      float var14 = var2.UuUVuuUu(-18.0F) * (1.0F - var10);
      float var15 = var2.UuUVuuUu(12.0F) * (1.0F - var10);
      return new O0oC0cc0O0Oo(var3 >= 0.01F, var3, var11, var12, var13, var14, var15);
   }

   public float localX(float var1) {
      return this.pivotX + (var1 - this.translateX - this.pivotX) / Math.max(0.001F, this.scale);
   }

   public float localY(float var1) {
      return this.pivotY + (var1 - this.translateY - this.pivotY) / Math.max(0.001F, this.scale);
   }
}
