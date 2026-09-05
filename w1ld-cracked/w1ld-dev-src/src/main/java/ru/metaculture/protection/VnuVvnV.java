package ru.metaculture.protection;

public final class VnuVvnV {
   public static final double UuUVuuUu = 1.70158;
   public static final double C00OOC00oO = 2.5949095;
   public static final double uUnuvNvvNU = 2.70158;
   public static final double vVvUvVVuuNvV = Math.PI * 2.0 / 3.0;
   public static final double uNNnnnuuuN = Math.PI * 4.0 / 9.0;
   public static final UnnNnNvU nuUnNvnuUu = var0 -> var0;
   public static final UnnNnNvU VVuuUN = UuUVuuUu(2);
   public static final UnnNnNvU vNUvnnVnUvu = C00OOC00oO(2);
   public static final UnnNnNvU uVUuuVnNVU = uUnuvNvvNU(2.0);
   public static final UnnNnNvU vuuuNvNuv = UuUVuuUu(3);
   public static final UnnNnNvU nvUVNnuu = C00OOC00oO(3);
   public static final UnnNnNvU UuuNnUvUuv = uUnuvNvvNU(3.0);
   public static final UnnNnNvU nUUVuvU = UuUVuuUu(4);
   public static final UnnNnNvU UnUNVVVNuv = C00OOC00oO(4);
   public static final UnnNnNvU vNVuvnUUnuUn = uUnuvNvvNU(4.0);
   public static final UnnNnNvU UvnvNVnnnnNU = UuUVuuUu(5);
   public static final UnnNnNvU uVUVnuvnuVuv = C00OOC00oO(5);
   public static final UnnNnNvU NVNnnvnuunNv = uUnuvNvvNU(5.0);
   public static final UnnNnNvU uVunuUNVVUUV = var0 -> 1.0 - Math.cos(var0 * Math.PI / 2.0);
   public static final UnnNnNvU UNnVVNvvnVvU = var0 -> Math.sin(var0 * Math.PI / 2.0);
   public static final UnnNnNvU uNnUnnuNUnNu = var0 -> -(Math.cos(Math.PI * var0) - 1.0) / 2.0;
   public static final UnnNnNvU NnUuNNU = var0 -> 1.0 - Math.sqrt(1.0 - Math.pow(var0, 2.0));
   public static final UnnNnNvU nNvNUVU = var0 -> Math.sqrt(1.0 - Math.pow(var0 - 1.0, 2.0));
   public static final UnnNnNvU UnUNuUU = var0 -> var0 < 0.5
      ? (1.0 - Math.sqrt(1.0 - Math.pow(2.0 * var0, 2.0))) / 2.0
      : (Math.sqrt(1.0 - Math.pow(-2.0 * var0 + 2.0, 2.0)) + 1.0) / 2.0;
   public static final UnnNnNvU uUVuVvuNUvnu = var0 -> var0 != 0.0 && var0 != 1.0
      ? Math.pow(-2.0, 10.0 * var0 - 10.0) * Math.sin((var0 * 10.0 - 10.75) * (Math.PI * 2.0 / 3.0))
      : var0;
   public static final UnnNnNvU UvUvUNuvNU = var0 -> var0 != 0.0 && var0 != 1.0
      ? Math.pow(2.0, -10.0 * var0) * Math.sin((var0 * 10.0 - 0.75) * (Math.PI * 2.0 / 3.0)) + 1.0
      : var0;
   public static final UnnNnNvU c0oOOCcCoC0 = var0 -> {
      if (var0 != 0.0 && var0 != 1.0) {
         return var0 < 0.5
            ? -(Math.pow(2.0, 20.0 * var0 - 10.0) * Math.sin((20.0 * var0 - 11.125) * (Math.PI * 4.0 / 9.0))) / 2.0
            : Math.pow(2.0, -20.0 * var0 + 10.0) * Math.sin((20.0 * var0 - 11.125) * (Math.PI * 4.0 / 9.0)) / 2.0 + 1.0;
      } else {
         return var0;
      }
   };
   public static final UnnNnNvU VVnVNnunVvu = var0 -> var0 != 0.0 ? Math.pow(2.0, 10.0 * var0 - 10.0) : var0;
   public static final UnnNnNvU unNNVVNnvvV = var0 -> var0 != 1.0 ? 1.0 - Math.pow(2.0, -10.0 * var0) : var0;
   public static final UnnNnNvU NuunnvnN = var0 -> {
      if (var0 != 0.0 && var0 != 1.0) {
         return var0 < 0.5 ? Math.pow(2.0, 20.0 * var0 - 10.0) / 2.0 : (2.0 - Math.pow(2.0, -20.0 * var0 + 10.0)) / 2.0;
      } else {
         return var0;
      }
   };
   public static final UnnNnNvU NVUunUNUN = var0 -> 2.70158 * Math.pow(var0, 3.0) - 1.70158 * Math.pow(var0, 2.0);
   public static final UnnNnNvU UUVNuUNUvUnV = var0 -> 1.0 + 2.70158 * Math.pow(var0 - 1.0, 3.0) + 1.70158 * Math.pow(var0 - 1.0, 2.0);
   public static final UnnNnNvU vuvnUnVnUNnV = var0 -> var0 < 0.5
      ? Math.pow(2.0 * var0, 2.0) * (7.189819 * var0 - 2.5949095) / 2.0
      : (Math.pow(2.0 * var0 - 2.0, 2.0) * (3.5949095 * (var0 * 2.0 - 2.0) + 2.5949095) + 2.0) / 2.0;
   public static final UnnNnNvU nnuUVNUuvvVU = var0 -> {
      double var2 = 7.5625;
      double var4 = 2.75;
      if (var0 < 1.0 / var4) {
         return var2 * Math.pow(var0, 2.0);
      } else if (var0 < 2.0 / var4) {
         return var2 * Math.pow(var0 - 1.5 / var4, 2.0) + 0.75;
      } else {
         return var0 < 2.5 / var4 ? var2 * Math.pow(var0 - 2.25 / var4, 2.0) + 0.9375 : var2 * Math.pow(var0 - 2.625 / var4, 2.0) + 0.984375;
      }
   };
   public static final UnnNnNvU nVVUuvuNnUN = var0 -> 1.0 - nnuUVNUuvvVU.ease(1.0 - var0);
   public static final UnnNnNvU nNnVnUNVV = var0 -> var0 < 0.5
      ? (1.0 - nnuUVNUuvvVU.ease(1.0 - 2.0 * var0)) / 2.0
      : (1.0 + nnuUVNUuvvVU.ease(2.0 * var0 - 1.0)) / 2.0;

   private VnuVvnV() {
   }

   public static UnnNnNvU UuUVuuUu(double var0) {
      return var2 -> Math.pow(var2, var0);
   }

   public static UnnNnNvU UuUVuuUu(int var0) {
      return UuUVuuUu((double)var0);
   }

   public static UnnNnNvU C00OOC00oO(double var0) {
      return var2 -> 1.0 - Math.pow(1.0 - var2, var0);
   }

   public static UnnNnNvU C00OOC00oO(int var0) {
      return C00OOC00oO((double)var0);
   }

   public static UnnNnNvU uUnuvNvvNU(double var0) {
      return var2 -> var2 < 0.5 ? Math.pow(2.0, var0 - 1.0) * Math.pow(var2, var0) : 1.0 - Math.pow(-2.0 * var2 + 2.0, var0) / 2.0;
   }
}
