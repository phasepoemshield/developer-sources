package ru.metaculture.protection;

import net.minecraft.class_332;
import org.joml.Vector4f;

public class vvNVnVNVnNNn extends UUVNUUUnNUv {
   public static void UuUVuuUu(UnVNvNnU var0, class_332 var1, int var2, int var3) {
      float var4 = (float)UUVNUUUnNUv.vuuuNvNuv.nvUVNnuu();
      int var5 = (int)(255.0F * var4);
      int var6 = (int)(100.0F * var4);
      int var7 = (int)(90.0F * var4);
      float var8 = UuUVuuUu.method_22683().method_4486() / 2.0F;
      float var9 = UuUVuuUu.method_22683().method_4502() - 16 + (15.0F - 15.0F * var4);
      int var10 = UUVNUUUnNUv.vNnNuuvVn.length;
      float var11 = 18.0F;
      float var12 = var10 * var11;
      float var13 = var8 - var12 / 2.0F;
      int var14 = UnVNvNnU.VvunVVUvUNnv.nvUVNnuu(UnVNvNnU.VvunVVUvUNnv.vVvUvVVuuNvV(UnVNvNnU.VvunVVUvUNnv.uNNnnnuuuN(1, 1), 1.0F), (int)(15.299999F * var4));
      int var15 = UnVNvNnU.VvunVVUvUNnv.nvUVNnuu(UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(1, 1), (int)(178.0F * var4));
      uUVNNUvvn.UuUVuuUu(var0, var13 - 9.0F + 1.0F, var9 - 5.0F, var12 + 9.0F - 1.0F, 21.25F, new Vector4f(6.5F, 6.5F, 0.0F, 0.0F), var15);
      var0.UuUVuuUu(var13 - 9.0F + 1.0F, var9 - 5.0F, var12 + 9.0F - 1.0F, 25.0F, 6.5F, var14, 0.5F);
      float var16 = var13;

      for (NvVNvUvunNNu var20 : UUVNUUUnNUv.vNnNuuvVn) {
         var20.C00OOC00oO.C00OOC00oO(var20 == UUVNUUUnNUv.NVuNUuVnVUN ? uununU.FORWARDS : uununU.BACKWARDS);
         var0.UuUVuuUu(
            var16 + 4.5F,
            var9 + 4.76F + 0.5F,
            0.1F,
            0.1F,
            10.0F,
            6.0F,
            0.1F,
            UnVNvNnU.VvunVVUvUNnv.C00OOC00oO(var20.UuUVuuUu(), (int)(var7 * var20.C00OOC00oO.uVUuuVnNVU())).getRGB()
         );
         var0.UuUVuuUu(var16, var9 + 0.76F, 9.25F, 9.25F, 10.0F, UnVNvNnU.VvunVVUvUNnv.C00OOC00oO(var20.UuUVuuUu(), var5).getRGB());
         var16 += var11;
      }
   }

   public static void UuUVuuUu(double var0, double var2, int var4) {
      int var5 = (int)CoCO0oOCO0c.UuUVuuUu((float)var0, (float)var2)[0];
      int var6 = (int)CoCO0oOCO0c.UuUVuuUu((float)var0, (float)var2)[1];
      if (!UuUVuuUu(var5, var6)) {
         float var7 = UuUVuuUu.method_22683().method_4486() / 2.0F;
         float var8 = UuUVuuUu.method_22683().method_4502() - 16;
         int var9 = UUVNUUUnNUv.vNnNuuvVn.length;
         float var10 = 18.0F;
         float var11 = var9 * var10;
         float var12 = var7 - var11 / 2.0F;
         float var13 = var12;

         for (NvVNvUvunNNu var17 : UUVNUUUnNUv.vNnNuuvVn) {
            if (UuvVnuU.UuUVuuUu(var5, var6, var13, var8, 16.0F, 16.0F) && var17 != UUVNUUUnNUv.NVuNUuVnVUN) {
               UUVNUUUnNUv.uNNnnnuuuN.uUnuvNvvNU();
               NNUuUVvUUU.UuUVuuUu().UuUVuuUu((double)var5, (double)var6, var17.UuUVuuUu().getRGB(), var17.vVvUvVVuuNvV().getRGB());
               UUVNUUUnNUv.NVuNUuVnVUN = var17;
               UUVNUUUnNUv.NVuunNnvvvVu = var17;
               NVnVnNnN.UuUVuuUu.nvUVNnuu.UuUVuuUu(var17);
            }

            var13 += var10;
         }
      }
   }

   private static boolean UuUVuuUu(int var0, int var1) {
      return UuvVnuU.UuUVuuUu(var0, var1, UUVNUUUnNUv.nNnVnUNVV, UUVNUUUnNUv.nuunNvv, UUVNUUUnNUv.uUVVvVVNvvn, UUVNUUUnNUv.vvUVNVvvNUv);
   }
}
