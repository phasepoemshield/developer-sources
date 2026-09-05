package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.List;
import org.wild.module.api.Module;

public final class UvNNVuVnUn {
   public CCCo0o0cCCo UuUVuuUu(vNvvVnNuUVvv var1, uVUvuUUNVUv var2, nUvnuVnNUU var3) {
      List var4 = var1.nuUnNvnuUu();
      ArrayList var5 = new ArrayList(var4.size());
      float[] var6 = new float[]{0.0F, 0.0F};
      int var7 = 0;

      for (int var8 = 0; var8 < var4.size(); var8++) {
         Module var9 = (Module)var4.get(var8);
         UvUuUvUVUU var10 = NvuUvVNVuuu.UuUVuuUu(var9);
         boolean var11 = var10 != null && var10.UuUVuuUu(var9, var1);
         int var12 = var11 ? -1 : var7 % 2;
         float var13 = var11 ? Math.max(var6[0], var6[1]) : var6[var12];
         float var14 = var11 ? var2.nNvNUVU() : (var12 == 0 ? var2.nNvNUVU() : var2.UnUNuUU());
         float var15 = var2.UNnVVNvvnVvU() + var1.uuuVnuvnnNnU() + var13;
         float var16 = var11 ? var3.vNVuvnUUnuUn() * 2.0F + var3.VVuuUN() : var3.vNVuvnUUnuUn();
         float var17 = var1.UuUVuuUu(vnvnUnVnuunn.UuUVuuUu(var9));
         float var18 = this.UuUVuuUu(var9, var3, var1) * var17;
         float var19 = this.UuUVuuUu(var9, var16, var3);
         float var20 = var19 + var18;
         var5.add(new VvvVunn(var9, var14, var15, var16, var20, var18));
         if (var11) {
            float var21 = var13 + var20 + var3.uVUVnuvnuVuv();
            var6[0] = var21;
            var6[1] = var21;
         } else {
            var6[var12] += var20 + var3.uVUVnuvnuVuv();
            var7++;
         }
      }

      float var22 = Math.max(0.0F, Math.max(var6[0], var6[1]) - var3.uVUVnuvnuVuv());
      if (!var5.isEmpty()) {
         var22 += this.UuUVuuUu(var3, var2, var22);
      }

      float var23 = Math.max(0.0F, var22 - var2.NnUuNNU());
      return new CCCo0o0cCCo(var5, var23);
   }

   private float UuUVuuUu(nUvnuVnNUU var1, uVUvuUUNVUv var2, float var3) {
      float var4 = Math.max(var1.UnUNVVVNuv(), var1.uVUVnuvnuVuv() * 2.0F);
      float var5 = var2.NnUuNNU() - var3;
      return var5 >= var4 ? 0.0F : var4;
   }

   public float UuUVuuUu(Module var1, nUvnuVnNUU var2, vNvvVnNuUVvv var3) {
      UvUuUvUVUU var4 = NvuUvVNVuuu.UuUVuuUu(var1);
      if (var4 != null) {
         return var4.UuUVuuUu(var1, var2, var3);
      } else {
         float var5 = var2.UuUVuuUu(1.0F) + var2.UuUVuuUu(20.0F);
         List var6 = var1.nuUnNvnuUu();

         for (int var7 = 0; var7 < var6.size(); var7++) {
            nvUuvVvuuN var8 = (nvUuvVvuuN)var6.get(var7);
            if (var8 instanceof VnnUVUVvV var9) {
               var5 += var2.UuUVuuUu(var9.uUnuvNvvNU());
            } else {
               float var12 = var3.UuUVuuUu(vnvnUnVnuunn.vVvUvVVuuNvV(var8));
               float var10 = this.UuUVuuUu(var8, var2, var3);
               float var11 = this.UuUVuuUu(var8, var3, var2);
               var5 += (var10 + var11) * var12;
               if (var7 < var6.size() - 1) {
                  var5 += var2.UuUVuuUu(12.0F) * var12;
               }
            }
         }

         return var5;
      }
   }

   public float UuUVuuUu(Module var1, float var2, nUvnuVnNUU var3) {
      String var4 = var1.vuuuNvNuv == null ? "" : var1.vuuuNvNuv;
      if (var4.isBlank()) {
         return var3.UvnvNVnnnnNU();
      } else {
         float var5 = Math.max(var3.UuUVuuUu(160.0F), var2 - var3.UuUVuuUu(90.0F));
         int var6 = nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var4, 10.0F, var5, 10).size();
         float var7 = var3.UuUVuuUu(54.0F) + Math.max(1, var6) * var3.UuUVuuUu(12.0F);
         return Math.max(var3.UvnvNVnnnnNU(), var7);
      }
   }

   public float UuUVuuUu(nvUuvVvuuN var1, nUvnuVnNUU var2, vNvvVnNuUVvv var3) {
      if (var1 instanceof nNUuNvVn) {
         return var2.UuUVuuUu(22.0F);
      } else if (var1 instanceof ili11Iii1Ii) {
         return var2.UuUVuuUu(18.0F);
      } else if (var1 instanceof VnnUvVNuNuVv var11) {
         float var12 = var3.UuUVuuUu(vnvnUnVnuunn.vNUvnnVnUvu(var11));
         float var13 = var2.UuUVuuUu(16.0F);
         float var14 = var2.UuUVuuUu(186.0F);
         return var13 + var14 * var12;
      } else if (var1 instanceof VnnUVUVvV var10) {
         return var2.UuUVuuUu(var10.uUnuvNvvNU());
      } else if (var1 instanceof VUVnvvnNN var4) {
         float var5 = var2.vNVuvnUUnuUn() - var2.UuUVuuUu(32.0F);
         float var6 = var5 * 0.7F;
         int var7 = nunvNNUnvU.UuUVuuUu(var4, var6, var2);
         float var8 = var2.UuUVuuUu(14.0F);
         float var9 = var2.UuUVuuUu(3.0F);
         return var2.UuUVuuUu(1.0F) + var7 * var8 + (var7 > 1 ? (var7 - 1) * var9 : 0.0F) + var2.UuUVuuUu(1.0F);
      } else {
         return var2.UuUVuuUu(14.0F);
      }
   }

   public float UuUVuuUu(nvUuvVvuuN var1, nUvnuVnNUU var2) {
      if (var1 instanceof nNUuNvVn || var1 instanceof VnnUvVNuNuVv) {
         return var2.UuUVuuUu(22.0F);
      } else if (var1 instanceof ili11Iii1Ii) {
         return var2.UuUVuuUu(18.0F);
      } else if (var1 instanceof VnnUVUVvV var9) {
         return var2.UuUVuuUu(var9.uUnuvNvvNU());
      } else if (var1 instanceof VUVnvvnNN var3) {
         float var4 = var2.vNVuvnUUnuUn() - var2.UuUVuuUu(32.0F);
         float var5 = var4 * 0.7F;
         int var6 = nunvNNUnvU.UuUVuuUu(var3, var5, var2);
         float var7 = var2.UuUVuuUu(14.0F);
         float var8 = var2.UuUVuuUu(3.0F);
         return var2.UuUVuuUu(1.0F) + var6 * var7 + (var6 > 1 ? (var6 - 1) * var8 : 0.0F) + var2.UuUVuuUu(1.0F);
      } else {
         return var2.UuUVuuUu(14.0F);
      }
   }

   public float UuUVuuUu(nvUuvVvuuN var1, vNvvVnNuUVvv var2, nUvnuVnNUU var3) {
      if (var1 instanceof UvNnUnuNUUU var4) {
         float var5 = var2.UuUVuuUu(vnvnUnVnuunn.uNNnnnuuuN(var4));
         if (var5 > 0.01F) {
            float var6 = var3.UuUVuuUu(6.0F) + var4.vVvUvVVuuNvV.size() * var3.UuUVuuUu(18.0F) + var3.UuUVuuUu(4.0F);
            return var6 * var5;
         }
      }

      if (var1 instanceof ili11Iii1Ii var7) {
         float var8 = var2.UuUVuuUu(vnvnUnVnuunn.uNNnnnuuuN(var7));
         if (var8 > 0.01F) {
            return UNVVvNuuNNN.UuUVuuUu(var7, var3) * var8;
         }
      }

      return 0.0F;
   }
}
