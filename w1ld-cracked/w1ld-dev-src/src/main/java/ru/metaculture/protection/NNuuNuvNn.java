package ru.metaculture.protection;

public enum NNuuNuvNn {
   STATIC(0L) {
      @Override
      public NUunUunuNV UuUVuuUu(NUunUunuNV var1, int[] var2, long var3) {
         return var1;
      }
   },
   MULTI_GRADIENT(11000L) {
      @Override
      public NUunUunuNV UuUVuuUu(NUunUunuNV var1, int[] var2, long var3) {
         float var5 = UuUVuuUu(var3, this.UuUVuuUu);
         int var6 = NUunUunuNV.UuUVuuUu(UuUVuuUu(var2, var5), 0.18F);
         int var7 = UuUVuuUu(var2, var5 + 0.34F);
         return NNuuNuvNn.UuUVuuUu(var1, var6, var7);
      }
   },
   TWIN_LAYERS(13000L) {
      @Override
      public NUunUunuNV UuUVuuUu(NUunUunuNV var1, int[] var2, long var3) {
         float var5 = UuUVuuUu(var3, this.UuUVuuUu);
         float var6 = 1.0F - var5;
         int var7 = NUunUunuNV.UuUVuuUu(UuUVuuUu(var2, var5), 0.16F);
         int var8 = UuUVuuUu(var2, var6 + 0.5F);
         return NNuuNuvNn.UuUVuuUu(var1, var7, var8);
      }
   },
   HUE_WHEEL(8500L) {
      @Override
      public NUunUunuNV UuUVuuUu(NUunUunuNV var1, int[] var2, long var3) {
         float var5 = UuUVuuUu(var3, this.UuUVuuUu);
         int var6 = NUunUunuNV.UuUVuuUu(UuUVuuUu(var2, var5), 0.14F);
         int var7 = UuUVuuUu(var2, var5 + 0.3F);
         return NNuuNuvNn.UuUVuuUu(var1, var6, var7);
      }
   },
   BREATHING(7000L) {
      @Override
      public NUunUunuNV UuUVuuUu(NUunUunuNV var1, int[] var2, long var3) {
         float var5 = UuUVuuUu(var3, this.UuUVuuUu);
         float var6 = 0.5F + 0.5F * (float)Math.sin(var5 * Math.PI * 2.0);
         int var7 = UuUVuuUu(var2, 0.05F);
         int var8 = UuUVuuUu(var2, 0.35F);
         int var9 = NUunUunuNV.UuUVuuUu(var7, 0.04F + 0.1F * var6);
         int var10 = NUunUunuNV.UuUVuuUu(var8, 0.02F * (1.0F - var6));
         return NNuuNuvNn.UuUVuuUu(var1, var9, var10);
      }
   },
   PRISMATIC_WAVE(8500L) {
      @Override
      public NUunUunuNV UuUVuuUu(NUunUunuNV var1, int[] var2, long var3) {
         float var5 = UuUVuuUu(var3, this.UuUVuuUu);
         float var6 = 0.5F + 0.5F * (float)Math.sin(var3 * 0.0017);
         int var7 = NUunUunuNV.UuUVuuUu(UuUVuuUu(var2, var5 + var6 * 0.04F), 0.16F);
         int var8 = UuUVuuUu(var2, var5 + 0.27F + (1.0F - var6) * 0.04F);
         return NNuuNuvNn.UuUVuuUu(var1, var7, var8);
      }
   },
   RAINBOW_LINEAR(9000L) {
      @Override
      public NUunUunuNV UuUVuuUu(NUunUunuNV var1, int[] var2, long var3) {
         float var5 = UuUVuuUu(var3, this.UuUVuuUu);
         int var6 = UuUVuuUu(var2, var5);
         int var7 = NUunUunuNV.UuUVuuUu(UuUVuuUu(var2, var5 + 0.38F), 0.18F);
         return NNuuNuvNn.UuUVuuUu(var1, var7, var6);
      }
   };

   public final long UuUVuuUu;

   NNuuNuvNn(long var3) {
      this.UuUVuuUu = var3;
   }

   public abstract NUunUunuNV UuUVuuUu(NUunUunuNV var1, int[] var2, long var3);

   public static NNuuNuvNn UuUVuuUu(NvVNvUvunNNu var0) {
      if (var0 == null) {
         return STATIC;
      } else {
         NNuuNuvNn var1 = vUNUvU.C00OOC00oO(var0);
         return var1 == null ? STATIC : var1;
      }
   }

   public static NUunUunuNV UuUVuuUu(NvVNvUvunNNu var0, NUunUunuNV var1, long var2) {
      if (var0 == null || var1 == null) {
         return var1;
      } else if (!Menu.UuUVuuUu(Menu.nVVUuvuNnUN)) {
         return var1;
      } else {
         int[] var4 = vUNUvU.UuUVuuUu(var0);
         NNuuNuvNn var5 = UuUVuuUu(var0);
         return var5 != STATIC && var4 != null && var4.length >= 2 ? var5.UuUVuuUu(var1, var4, var2) : var1;
      }
   }

   static float UuUVuuUu(long var0, long var2) {
      if (var2 <= 0L) {
         return 0.0F;
      } else {
         long var4 = var0 % var2;
         if (var4 < 0L) {
            var4 += var2;
         }

         return (float)var4 / (float)var2;
      }
   }

   static int UuUVuuUu(int[] var0, float var1) {
      if (var0 != null && var0.length != 0) {
         if (var0.length == 1) {
            return var0[0];
         } else {
            float var2 = var1 - (float)Math.floor(var1);
            float var3 = var2 * (var0.length - 1);
            int var4 = Math.min(var0.length - 2, Math.max(0, (int)Math.floor(var3)));
            return NUunUunuNV.UuUVuuUu(var0[var4], var0[var4 + 1], var3 - var4);
         }
      } else {
         return -1;
      }
   }

   static int UuUVuuUu(float var0, float var1, float var2) {
      var0 = (var0 % 360.0F + 360.0F) % 360.0F;
      float var3 = (1.0F - Math.abs(2.0F * var2 - 1.0F)) * var1;
      float var4 = var3 * (1.0F - Math.abs(var0 / 60.0F % 2.0F - 1.0F));
      float var5 = var2 - var3 * 0.5F;
      float var6;
      float var7;
      float var8;
      if (var0 < 60.0F) {
         var6 = var3;
         var7 = var4;
         var8 = 0.0F;
      } else if (var0 < 120.0F) {
         var6 = var4;
         var7 = var3;
         var8 = 0.0F;
      } else if (var0 < 180.0F) {
         var6 = 0.0F;
         var7 = var3;
         var8 = var4;
      } else if (var0 < 240.0F) {
         var6 = 0.0F;
         var7 = var4;
         var8 = var3;
      } else if (var0 < 300.0F) {
         var6 = var4;
         var7 = 0.0F;
         var8 = var3;
      } else {
         var6 = var3;
         var7 = 0.0F;
         var8 = var4;
      }

      return NUunUunuNV.UuUVuuUu(Math.round((var6 + var5) * 255.0F), Math.round((var7 + var5) * 255.0F), Math.round((var8 + var5) * 255.0F), 255);
   }

   static NUunUunuNV UuUVuuUu(NUunUunuNV var0, int var1, int var2) {
      return NUunUunuNV.uNNnnnuuuN()
         .UuUVuuUu(var0.nuUnNvnuUu())
         .C00OOC00oO(var0.VVuuUN())
         .uUnuvNvvNU(var0.vNUvnnVnUvu())
         .vVvUvVVuuNvV(var0.uVUuuVnNVU())
         .uNNnnnuuuN(var0.vuuuNvNuv())
         .nuUnNvnuUu(var0.nvUVNnuu())
         .VVuuUN(var0.UuuNnUvUuv())
         .vNUvnnVnUvu(var0.nUUVuvU())
         .uVUuuVnNVU(var0.UnUNVVVNuv())
         .vuuuNvNuv(var0.vNVuvnUUnuUn())
         .nvUVNnuu(var0.UvnvNVnnnnNU())
         .UuuNnUvUuv(var0.uVUVnuvnuVuv())
         .nUUVuvU(var0.NVNnnvnuunNv())
         .UnUNVVVNuv(var1)
         .vNVuvnUUnuUn(var2)
         .UuUVuuUu(var0.uNnUnnuNUnNu())
         .UuUVuuUu();
   }
}
