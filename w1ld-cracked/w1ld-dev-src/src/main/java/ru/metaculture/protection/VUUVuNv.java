package ru.metaculture.protection;

import net.minecraft.class_310;
import net.minecraft.class_332;
import org.wild.module.api.Module;

public class VUUVuNv extends UUVNUUUnNUv {
   public static void UuUVuuUu(UnVNvNnU var0, class_332 var1, int var2, int var3, float var4) {
      class_310 var5 = class_310.method_1551();
      if (var5 != null && var5.method_22683() != null) {
         int var6 = var5.method_22683().method_4489();
         int var7 = var5.method_22683().method_4506();
         if (var6 > 0 && var7 > 0) {
            int var8 = (int)(var2 / CoCO0oOCO0c.UuUVuuUu);
            int var9 = (int)(var3 / CoCO0oOCO0c.UuUVuuUu);
            UUVNUUUnNUv.UuNnnVnuNNV = var8;
            UUVNUUUnNUv.uUVvnUuNvvN = var9;
            UUVNUUUnNUv.vuuuNvNuv.UuUVuuUu();
            UUVNUUUnNUv.nvUVNnuu.UuUVuuUu();
            UUVNUUUnNUv.UuuNnUvUuv.UuUVuuUu();
            UUVNUUUnNUv.nUUVuvU.UuUVuuUu();
            if (UUVNUUUnNUv.vVVuuVVv != null) {
               for (Module var11 : UUVNUUUnNUv.vVVuuVVv) {
                  UUVNUUUnNUv.UuUVuuUu(var11).UuUVuuUu();
                  UUVNUUUnNUv.C00OOC00oO(var11).UuUVuuUu();
                  UUVNUUUnNUv.uUnuvNvvNU(var11).UuUVuuUu();
               }
            }

            UUVNUUUnNUv.vNUvnnVnUvu.UuUVuuUu(1.0);
            float var17 = UUVNUUUnNUv.vuuuNvNuv.uNNnnnuuuN();
            if (!(var17 <= 0.001F)) {
               float var18 = var5.method_22683().method_4486();
               float var12 = var5.method_22683().method_4502();
               UUVNUUUnNUv.nNnVnUNVV = var18 / 2.0F - UUVNUUUnNUv.uUVVvVVNvvn / 2.0F;
               UUVNUUUnNUv.nuunNvv = var12 / 2.0F - UUVNUUUnNUv.vvUVNVvvNUv / 2.0F - (80.0F - 80.0F * var17);
               float var13 = (float)var5.method_22683().method_4489() / var5.method_22683().method_4486();
               var0.uUnuvNvvNU(var13);

               try {
                  if (UUVNUUUnNUv.VVuuUN.uUnuvNvvNU()) {
                     var0.UuUVuuUu(23.0F);
                  }

                  var0.UuUVuuUu(0.0F, 0.0F, var18, var12, UnVNvNnU.VvunVVUvUNnv.vVvUvVVuuNvV(0, 0, 0, (int)(140.0F * var17)));
                  nnUVNuUunvv.UuUVuuUu(var0, var8, var9, var17);
               } finally {
                  var0.vNUvnnVnUvu();
                  var0.vNUvnnVnUvu();
               }
            }
         }
      }
   }
}
