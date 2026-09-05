package ru.metaculture.protection;

public final class NNNunUNVuv {
   public static final float UuUVuuUu = 4.0F;
   public static final NNNunUNVuv.nvnNNunvv C00OOC00oO = NNNunUNVuv.nvnNNunvv.SLIDING_KNOB;

   private NNNunUNVuv() {
   }

   public static float UuUVuuUu(float var0, float var1, float var2, float var3, float var4) {
      float var5 = Math.max(0.0F, Math.min(var4, Math.min(var2, var3)));
      float var6 = Math.abs(var0) - var2 + var5;
      float var7 = Math.abs(var1) - var3 + var5;
      float var8 = Math.max(var6, 0.0F);
      float var9 = Math.max(var7, 0.0F);
      return Math.min(Math.max(var6, var7), 0.0F) + (float)Math.hypot(var8, var9) - var5;
   }

   public static float UuUVuuUu(float var0, float var1, float var2, float var3, float var4, float var5) {
      float var6 = nUUVuvU(vNVuvnUUnuUn(var5));
      if (var6 <= 0.0F) {
         return 0.0F;
      } else {
         float var7 = (float)Math.exp(-Math.abs(var0) / 2.2F);
         float var8 = var1 - var3;
         float var9 = var2 - var4;
         float var10 = (float)Math.exp(-(var8 * var8 + var9 * var9) / 14400.0F);
         return vNVuvnUUnuUn(var7 * var10 * var6);
      }
   }

   public static float UuUVuuUu(float var0, float var1) {
      return UuUVuuUu(var0, 4.0F, var1);
   }

   public static float UuUVuuUu(float var0, float var1, float var2) {
      float var3 = Math.max(0.0F, var1);
      float var4 = Math.max(var3, var0);
      float var5 = Math.min(var4, var3 * 4.2F);
      float var6 = var3 + (var5 - var3) * nvUVNnuu(var2);
      return var6 + (var4 - var5) * UuuNnUvUuv(var2);
   }

   public static float C00OOC00oO(float var0, float var1) {
      return C00OOC00oO(var0, 4.0F, var1);
   }

   public static float C00OOC00oO(float var0, float var1, float var2) {
      float var3 = Math.max(0.0F, Math.min(var1, var0));
      return var3 + (Math.max(var3, var0) - var3) * nvUVNnuu(var2);
   }

   public static float uUnuvNvvNU(float var0, float var1) {
      return uUnuvNvvNU(var0, 4.0F, var1);
   }

   public static float uUnuvNvvNU(float var0, float var1, float var2) {
      float var3 = Math.max(0.0F, Math.min(var1, var0));
      float var4 = Math.max(var3, var0 * 1.08F);
      return var3 + (var4 - var3) * nvUVNnuu(var2);
   }

   public static float UuUVuuUu(float var0) {
      return UnUNVVVNuv(vuuuNvNuv(0.34F, 0.66F, var0));
   }

   public static float C00OOC00oO(float var0) {
      return UnUNVVVNuv(vuuuNvNuv(0.5F, 0.88F, var0));
   }

   public static float uUnuvNvvNU(float var0) {
      float var1 = UnUNVVVNuv(vNVuvnUUnuUn(var0));
      float var2 = 1.0F - var1;
      return 1.0F - var2 * var2;
   }

   public static float vVvUvVVuuNvV(float var0, float var1, float var2) {
      return vNVuvnUUnuUn((var0 - var1) / Math.max(1.0E-5F, var2));
   }

   public static float C00OOC00oO(float var0, float var1, float var2, float var3, float var4, float var5) {
      float var6 = Math.max(Math.max(var2 - var0, var0 - var2 - var4), 0.0F);
      float var7 = Math.max(Math.max(var3 - var1, var1 - var3 - var5), 0.0F);
      float var8 = Math.max(1.0F, Math.min(var4, var5) * 0.34F);
      return (float)Math.exp(-(var6 * var6 + var7 * var7) / (var8 * var8));
   }

   public static float vVvUvVVuuNvV(float var0) {
      return Math.max(0.0F, var0) * 0.22F;
   }

   public static float uNNnnnuuuN(float var0) {
      return Math.max(0.0F, var0) * 0.44F;
   }

   public static float nuUnNvnuUu(float var0) {
      return Math.max(0.0F, var0) * 0.28F;
   }

   public static float VVuuUN(float var0) {
      return Math.max(0.0F, var0) * 0.39F;
   }

   public static float vNUvnnVnUvu(float var0) {
      return Math.max(0.0F, var0) * 0.24F;
   }

   public static float uNNnnnuuuN(float var0, float var1, float var2) {
      float var3 = Math.max(0.0F, Math.min(var2, var1));
      return UnUNVVVNuv(vNVuvnUUnuUn((var0 - var3) / Math.max(1.0E-5F, var1 - var3)));
   }

   public static float nuUnNvnuUu(float var0, float var1, float var2) {
      float var3 = Math.max(0.0F, var0 - var1);
      return UnUNVVVNuv(vNVuvnUUnuUn(var3 / Math.max(1.0E-5F, var2 * 1.25F)));
   }

   public static float VVuuUN(float var0, float var1, float var2) {
      float var3 = Math.max(0.0F, var0) * 0.5F;
      float var4 = nvUVNnuu(vVvUvVVuuNvV(var0), vNUvnnVnUvu(var0), vNVuvnUUnuUn(var2));
      return nvUVNnuu(var3, var4, vNVuvnUUnuUn(var1));
   }

   public static float vVvUvVVuuNvV(float var0, float var1) {
      float var2 = Math.max(0.0F, var0) * 0.5F;
      return nvUVNnuu(var2, uNNnnnuuuN(var0), vNVuvnUUnuUn(var1));
   }

   public static float uNNnnnuuuN(float var0, float var1) {
      float var2 = Math.max(0.0F, var0) * 0.5F;
      return nvUVNnuu(var2, nuUnNvnuUu(var0), vNVuvnUUnuUn(var1));
   }

   public static float vNUvnnVnUvu(float var0, float var1, float var2) {
      float var3 = Math.max(0.0F, var0) * 0.5F;
      float var4 = nvUVNnuu(VVuuUN(var0), vNUvnnVnUvu(var0), vNVuvnUUnuUn(var2));
      return nvUVNnuu(var3, var4, vNVuvnUUnuUn(var1));
   }

   public static float UuUVuuUu(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9) {
      float var10 = Math.max(0.0F, var4) * 0.5F;
      float var11 = Math.max(0.0F, var5) * 0.5F;
      float var12 = var0 - var2 - var10;
      float var13 = var1 - var3 - var11;
      float var14 = var12 > 0.0F ? (var13 > 0.0F ? var8 : var7) : (var13 > 0.0F ? var9 : var6);
      float var15 = Math.max(0.0F, Math.min(var14, Math.min(var10, var11)));
      float var16 = Math.abs(var12) - var10 + var15;
      float var17 = Math.abs(var13) - var11 + var15;
      float var18 = Math.max(var16, 0.0F);
      float var19 = Math.max(var17, 0.0F);
      return Math.min(Math.max(var16, var17), 0.0F) + (float)Math.hypot(var18, var19) - var15;
   }

   public static boolean C00OOC00oO(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9) {
      return UuUVuuUu(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9) <= 0.0F;
   }

   public static float uVUuuVnNVU(float var0, float var1, float var2) {
      float var3 = var0 - Math.max(0.0F, var1);
      return var3 <= 0.0F ? 0.0F : UnUNVVVNuv(vNVuvnUUnuUn(var3 / Math.max(1.0E-5F, var2)));
   }

   public static float uVUuuVnNVU(float var0) {
      return vuuuNvNuv(0.0F, 0.22F, var0);
   }

   public static float vuuuNvNuv(float var0) {
      return vuuuNvNuv(0.42F, 0.82F, var0);
   }

   private static float nvUVNnuu(float var0) {
      return UnUNVVVNuv(vuuuNvNuv(0.0F, 0.54F, var0));
   }

   private static float UuuNnUvUuv(float var0) {
      return UnUNVVVNuv(vuuuNvNuv(0.18F, 1.0F, var0));
   }

   public static float C00OOC00oO(float var0, float var1, float var2, float var3, float var4) {
      float var5 = Math.max(0.0F, var3);
      float var6 = Math.max(0.0F, var1 - var2 - var5 * 2.0F);
      return var0 + var5 + var6 * vNVuvnUUnuUn(var4);
   }

   public static NNNunUNVuv.NVnVnNnN UuUVuuUu(String var0) {
      if (UuUVuuUu(var0, "matrix")) {
         return NNNunUNVuv.NVnVnNnN.MATRIX;
      } else if (UuUVuuUu(var0, "grim")) {
         return NNNunUNVuv.NVnVnNnN.GRIM;
      } else if (UuUVuuUu(var0, "watchdog")) {
         return NNNunUNVuv.NVnVnNnN.WATCHDOG;
      } else if (UuUVuuUu(var0, "vulcan")) {
         return NNNunUNVuv.NVnVnNnN.VULCAN;
      } else if (UuUVuuUu(var0, "intave")) {
         return NNNunUNVuv.NVnVnNnN.INTAVE;
      } else if (UuUVuuUu(var0, "spartan")) {
         return NNNunUNVuv.NVnVnNnN.SPARTAN;
      } else if (UuUVuuUu(var0, "verus")) {
         return NNNunUNVuv.NVnVnNnN.VERUS;
      } else if (C00OOC00oO(var0, "ncp") || UuUVuuUu(var0, "nocheatplus")) {
         return NNNunUNVuv.NVnVnNnN.NCP;
      } else {
         return uUnuvNvvNU(var0, "aac") ? NNNunUNVuv.NVnVnNnN.AAC : NNNunUNVuv.NVnVnNnN.NONE;
      }
   }

   private static boolean UuUVuuUu(String var0, String var1) {
      if (var0 != null && var1 != null && var1.length() <= var0.length()) {
         for (int var2 = 0; var2 <= var0.length() - var1.length(); var2++) {
            if (var0.regionMatches(true, var2, var1, 0, var1.length())) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private static boolean C00OOC00oO(String var0, String var1) {
      return uUnuvNvvNU(var0, var1) && C00OOC00oO(var0) == var1.length();
   }

   private static boolean uUnuvNvvNU(String var0, String var1) {
      if (var0 != null && var1 != null) {
         int var2 = 0;

         for (int var3 = 0; var3 < var0.length() && var2 < var1.length(); var3++) {
            char var4 = var0.charAt(var3);
            if (var4 != '-' && var4 != '_' && !Character.isWhitespace(var4) && Character.toLowerCase(var4) != Character.toLowerCase(var1.charAt(var2++))) {
               return false;
            }
         }

         return var2 == var1.length();
      } else {
         return false;
      }
   }

   private static int C00OOC00oO(String var0) {
      int var1 = 0;

      for (int var2 = 0; var2 < var0.length(); var2++) {
         char var3 = var0.charAt(var2);
         if (var3 != '-' && var3 != '_' && !Character.isWhitespace(var3)) {
            var1++;
         }
      }

      return var1;
   }

   private static float vuuuNvNuv(float var0, float var1, float var2) {
      return nUUVuvU(vNVuvnUUnuUn((var2 - var0) / Math.max(1.0E-5F, var1 - var0)));
   }

   private static float nUUVuvU(float var0) {
      return var0 * var0 * (3.0F - 2.0F * var0);
   }

   private static float UnUNVVVNuv(float var0) {
      double var1 = vNVuvnUUnuUn(var0);
      return (float)(var1 * var1 * var1 * (var1 * (var1 * 6.0 - 15.0) + 10.0));
   }

   private static float nvUVNnuu(float var0, float var1, float var2) {
      return var0 + (var1 - var0) * var2;
   }

   private static float vNVuvnUUnuUn(float var0) {
      return Math.max(0.0F, Math.min(1.0F, var0));
   }

   public static enum NVnVnNnN {
      NONE("", "", 1.0F, 0.0F, 0.0F),
      MATRIX("W", "wild:svg/anticheat/matrix.svg", 0.92F, 0.0F, 0.0F),
      GRIM("Q", "wild:svg/anticheat/grim.svg", 1.04F, 0.0F, -0.18F),
      NCP("N", "", 1.0F, 0.0F, 0.0F),
      VULCAN("V", "", 1.0F, 0.0F, 0.0F),
      INTAVE("I", "", 1.0F, 0.0F, 0.0F),
      AAC("A", "", 1.0F, 0.0F, 0.0F),
      SPARTAN("S", "", 1.0F, 0.0F, 0.0F),
      VERUS("V", "", 1.0F, 0.0F, 0.0F),
      WATCHDOG("W", "", 1.0F, 0.0F, 0.0F);

      private final String UuUVuuUu;
      private final String C00OOC00oO;
      private final float uUnuvNvvNU;
      private final float vVvUvVVuuNvV;
      private final float uNNnnnuuuN;

      private NVnVnNnN(String var3, String var4, float var5, float var6, float var7) {
         this.UuUVuuUu = var3;
         this.C00OOC00oO = var4;
         this.uUnuvNvvNU = var5;
         this.vVvUvVVuuNvV = var6;
         this.uNNnnnuuuN = var7;
      }

      public String UuUVuuUu() {
         return this.UuUVuuUu;
      }

      public String C00OOC00oO() {
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
   }

   public static enum nvnNNunvv {
      SLIDING_KNOB;
   }
}
