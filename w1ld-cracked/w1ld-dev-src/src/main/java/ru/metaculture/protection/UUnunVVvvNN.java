package ru.metaculture.protection;

public final class UUnunVVvvNN {
   public void UuUVuuUu(vNvvVnNuUVvv var1, nvUuvVvuuN var2, float var3, float var4, float var5) {
      var1.uVUuuVnNVU(false);
      var1.UuUVuuUu(null);
      if (var2 instanceof vvNnnUNnVvn var6) {
         var6.C00OOC00oO(!var6.vVvUvVVuuNvV());
         var1.uUVvnUuNvvN();
      } else if (var2 instanceof nNUuNvVn var7) {
         var1.UuUVuuUu(var7);
         var1.nnuUVNUuvvVU(var4);
         var1.nVVUuvuNnUN(var5);
         this.UuUVuuUu(var7, var3, var4, var5);
         var1.uUVvnUuNvvN();
      } else if (var2 instanceof VnnUvVNuNuVv var8) {
         var1.UuUVuuUu(var8);
      } else if (var2 instanceof UvNnUnuNUUU var9) {
         var1.UuUVuuUu(var9);
      } else if (var2 instanceof ili11Iii1Ii var10) {
         var1.UuUVuuUu(var10);
      } else if (var2 instanceof nuunVnvU var11) {
         var11.uUnuvNvvNU();
         if (!var11.vVvUvVVuuNvV.isEmpty()) {
            this.UuUVuuUu(var11);
            var1.uUVvnUuNvvN();
         }
      } else if (var2 instanceof uVNuNUVvn var12) {
         var1.UuUVuuUu(var12);
      } else if (var2 instanceof NVuVVUNUvV var13) {
         var1.UuUVuuUu(var13);
      } else if (var2 instanceof vNnVvvNU var14) {
         var14.vVvUvVVuuNvV();
      }
   }

   public void UuUVuuUu(vNvvVnNuUVvv var1, VnnUvVNuNuVv var2, float var3, float var4) {
      var1.UNnVVNvvnVvU(true);
      var1.uNnUnnuNUnNu(false);
      var1.NnUuNNU(false);
      this.uUnuvNvvNU(var1, var2, var3, var4);
   }

   public void C00OOC00oO(vNvvVnNuUVvv var1, VnnUvVNuNuVv var2, float var3, float var4) {
      var1.uNnUnnuNUnNu(true);
      var1.UNnVVNvvnVvU(false);
      var1.NnUuNNU(false);
      this.uUnuvNvvNU(var1, var2, var4);
   }

   public void UuUVuuUu(vNvvVnNuUVvv var1, VnnUvVNuNuVv var2, float var3) {
      var1.NnUuNNU(true);
      var1.UNnVVNvvnVvU(false);
      var1.uNnUnnuNUnNu(false);
      this.vVvUvVVuuNvV(var1, var2, var3);
   }

   public void C00OOC00oO(vNvvVnNuUVvv var1, VnnUvVNuNuVv var2, float var3) {
      float var4 = var1.unUvvVVVVUu();
      float var5 = var1.UNuUVVuUuU();
      if (!(var5 < 1.0F)) {
         byte var6 = 5;
         int var7 = Math.max(0, Math.min(var6 - 1, (int)((var3 - var4) / var5 * var6)));
         float[] var8 = new float[]{0.0F, 180.0F, -30.0F, 30.0F, 120.0F};
         var2.UuUVuuUu(var2.uNNnnnuuuN() + var8[var7]);
         if (var2.nUUVuvU < 0.05F) {
            var2.nUUVuvU = 0.65F;
         }

         if (var2.UnUNVVVNuv < 0.08F) {
            var2.UnUNVVVNuv = 0.85F;
         }

         var1.uUVvnUuNvvN();
      }
   }

   public void UuUVuuUu(vNvvVnNuUVvv var1, VnnUvVNuNuVv var2, float var3, boolean var4) {
      float var5 = var1.nVUNnUuU();
      float var6 = var1.unVVnuunNU();
      if (!(var6 < 1.0F)) {
         byte var7 = 9;
         int var8 = Math.max(0, Math.min(var7 - 1, (int)((var3 - var5) / var6 * var7)));
         if (var8 == 8) {
            if (!var4) {
               var2.VVuuUN();
               var1.uUVvnUuNvvN();
            }
         } else {
            if (var4) {
               var2.vVvUvVVuuNvV(var8);
            } else {
               var2.uUnuvNvvNU(var8);
            }

            var1.uUVvnUuNvvN();
         }
      }
   }

   public void UuUVuuUu(vNvvVnNuUVvv var1, float var2) {
      if (var1.Oco0Oococc() != null) {
         this.UuUVuuUu(var1.Oco0Oococc(), var2, var1.OoccOc0CO(), var1.UvuVvvVuUuuu());
      }
   }

   public void UuUVuuUu(vNvvVnNuUVvv var1, float var2, float var3) {
      if (var1.nNVVUnuVVVuV() && var1.NvNUuuuvUvu() != null) {
         this.uUnuvNvvNU(var1, var1.NvNUuuuvUvu(), var2, var3);
      }

      if (var1.vnVuunuNN() && var1.NvNUuuuvUvu() != null) {
         this.uUnuvNvvNU(var1, var1.NvNUuuuvUvu(), var3);
      }

      if (var1.UvUNuNvvNVNv() && var1.NvNUuuuvUvu() != null) {
         this.vVvUvVVuuNvV(var1, var1.NvNUuuuvUvu(), var2);
      }
   }

   public void UuUVuuUu(vNvvVnNuUVvv var1) {
      if (var1.nNVVUnuVVVuV() || var1.vnVuunuNN() || var1.UvUNuNvvNVNv()) {
         var1.UNnVVNvvnVvU(false);
         var1.uNnUnnuNUnNu(false);
         var1.NnUuNNU(false);
         var1.uUVvnUuNvvN();
      }
   }

   private void uUnuvNvvNU(vNvvVnNuUVvv var1, VnnUvVNuNuVv var2, float var3, float var4) {
      float var5 = var1.vNnNNNuVVnUv();
      float var6 = var1.UVUnUvUNU();
      float var7 = var1.UvUnnnn();
      float var8 = var1.occOCoc0OcO();
      if (!(var7 < 1.0F) && !(var8 < 1.0F)) {
         float var9 = Math.max(0.0F, Math.min(1.0F, (var3 - var5) / var7));
         float var10 = Math.max(0.0F, Math.min(1.0F, (var4 - var6) / var8));
         var2.nUUVuvU = var9;
         var2.UnUNVVVNuv = 1.0F - var10;
      }
   }

   private void uUnuvNvvNU(vNvvVnNuUVvv var1, VnnUvVNuNuVv var2, float var3) {
      float var4 = var1.nuVuunUn();
      float var5 = var1.vNUUvuuVU();
      if (!(var5 < 1.0F)) {
         float var6 = Math.max(0.0F, Math.min(1.0F, (var3 - var4) / var5));
         var2.UuUVuuUu(var6 * 360.0F);
      }
   }

   private void vVvUvVVuuNvV(vNvvVnNuUVvv var1, VnnUvVNuNuVv var2, float var3) {
      float var4 = var1.unNuVNVUnV();
      float var5 = var1.vVuNvnVUvvv();
      if (!(var5 < 1.0F)) {
         var2.C00OOC00oO((var3 - var4) / var5);
      }
   }

   private void UuUVuuUu(nNUuNvVn var1, float var2, float var3, float var4) {
      float var5 = Math.max(0.0F, Math.min(1.0F, (var2 - var3) / Math.max(1.0F, var4)));
      float var6 = var1.uNNnnnuuuN + (var1.nuUnNvnuUu - var1.uNNnnnuuuN) * var5;
      if (var1.VVuuUN > 0.0F) {
         var6 = Math.round(var6 / var1.VVuuUN) * var1.VVuuUN;
      }

      var1.vVvUvVVuuNvV = Math.max(var1.uNNnnnuuuN, Math.min(var1.nuUnNvnuUu, var6));
   }

   private void UuUVuuUu(nuunVnvU var1) {
      var1.uUnuvNvvNU();
      if (!var1.vVvUvVVuuNvV.isEmpty()) {
         String var2 = var1.vVvUvVVuuNvV.get(0);
         if (!var1.VVuuUN.isEmpty()) {
            int var3 = var1.vVvUvVVuuNvV.indexOf(var1.VVuuUN.get(var1.VVuuUN.size() - 1));
            var2 = var1.vVvUvVVuuNvV.get((var3 + 1 + var1.vVvUvVVuuNvV.size()) % var1.vVvUvVVuuNvV.size());
         }

         var1.VVuuUN.clear();
         var1.VVuuUN.add(var2);
      }
   }
}
