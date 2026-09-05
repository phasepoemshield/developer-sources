package ru.metaculture.protection;

import org.wild.module.api.Module;

public record unuVuVnUNVv(
   boolean visible, float searchVisibility, float cardEntry, float entryMotion, float scale, float pivotX, float pivotY, float slideY, float lift
) {
   public static unuVuVnUNVv resolve(vNvvVnNuUVvv var0, VvvVunn var1, nUvnuVnNUU var2) {
      Module var3 = var1.UuUVuuUu();
      float var4 = var0.UuUVuuUu(vnvnUnVnuunn.nuUnNvnuUu(var3));
      float var5 = var0.UuUVuuUu(vnvnUnVnuunn.VVuuUN(var3));
      float var6 = Math.max(0.0F, Math.min(1.0F, var5));
      float var7 = var6 * var6 * (3.0F - 2.0F * var6);
      float var8 = 0.85F + 0.15F * var7;
      String var9 = vnvnUnVnuunn.C00OOC00oO(var3);
      float var10 = var0.UuUVuuUu(var9);
      float var11 = nunvNNUnvU.UuUVuuUu(var10, var0.C00OOC00oO(var9));
      float var12 = Math.max(0.001F, var8 * var11);
      float var13 = var1.C00OOC00oO() + var1.vVvUvVVuuNvV() * 0.5F;
      float var14 = var1.uUnuvNvvNU() + var1.uNNnnnuuuN() * 0.5F;
      float var15 = (1.0F - var7) * var2.UuUVuuUu(15.0F);
      float var16 = var10 * var2.UuUVuuUu(1.5F);
      return new unuVuVnUNVv(var4 >= 0.01F && var5 >= 0.005F, var4, var5, var7, var12, var13, var14, var15, var16);
   }

   public float hitTranslateY() {
      return this.slideY - this.lift * this.scale;
   }
}
