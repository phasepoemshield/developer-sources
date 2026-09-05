package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

public final class VuuUvnvnuu {
   private static final Pattern UuUVuuUu = Pattern.compile("\n");
   private static final int C00OOC00oO = 1710618;
   private static final int uUnuvNvvNU = 6710886;
   private static volatile boolean vVvUvVVuuNvV;
   private static volatile boolean uNNnnnuuuN;
   private static final float[] nuUnNvnuUu = new float[]{1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F};
   private final vnuUvuuNVNUU VVuuUN;
   private final nNvnvuvVuUVU vNUvnnVnUvu;
   private final String[] uVUuuVnNVU = new String[1];

   public VuuUvnvnuu(vnuUvuuNVNUU var1, nNvnvuvVuUVU var2) {
      this.VVuuUN = Objects.requireNonNull(var1, "backend");
      this.vNUvnnVnUvu = Objects.requireNonNull(var2, "font");
   }

   public static boolean UuUVuuUu(boolean var0) {
      boolean var1 = vVvUvVVuuNvV;
      vVvUvVVuuNvV = var0;
      return var1;
   }

   public static boolean C00OOC00oO(boolean var0) {
      boolean var1 = uNNnnnuuuN;
      uNNnnnuuuN = var0;
      return var1;
   }

   public void UuUVuuUu(float var1, float var2, float var3, String var4, int var5) {
      this.UuUVuuUu(var1, var2, var3, var4, var5, "l", nuUnNvnuUu);
   }

   public void UuUVuuUu(float var1, float var2, float var3, String var4, int var5, float[] var6) {
      this.UuUVuuUu(var1, var2, var3, var4, var5, "l", var6);
   }

   public void UuUVuuUu(float var1, float var2, float var3, String var4, int var5, String var6) {
      this.UuUVuuUu(var1, var2, var3, var4, var5, var6, nuUnNvnuUu);
   }

   public void UuUVuuUu(float var1, float var2, float var3, String var4, int var5, String var6, float[] var7) {
      if (!(var3 <= 0.0F)) {
         String var8 = var4 == null ? "" : var4;
         if (!var8.isEmpty()) {
            float[] var9 = var7 != null && var7.length >= 6 ? var7 : nuUnNvnuUu;
            float var10 = var3 / Math.max(1.0E-6F, this.vNUvnnVnUvu.nuUnNvnuUu());
            float var11 = this.vNUvnnVnUvu.VVuuUN() * var10;
            float var12 = var2;
            String var13 = var6 == null ? "l" : var6.toLowerCase();
            int var14 = C00OOC00oO(var5);
            int var15 = this.vNUvnnVnUvu.UuUVuuUu();
            float var16 = this.vNUvnnVnUvu.uNNnnnuuuN();
            String[] var17 = this.UuUVuuUu(var8);
            boolean var18 = uNNnnnuuuN;

            for (String var22 : var17) {
               float var23 = this.uNNnnnuuuN(var22, var10);
               float var24 = var1;
               if ("c".equals(var13)) {
                  var24 = var1 - var23 * 0.5F;
               } else if ("r".equals(var13)) {
                  var24 = var1 - var23;
               }

               float var25 = var12;
               if (var18) {
                  var24 = Math.round(var24);
                  var25 = Math.round(var12);
               }

               this.UuUVuuUu(var24, var25, var10, var22, var14, var9, var15, var16);
               var12 += var11;
            }
         }
      }
   }

   public void UuUVuuUu(float var1, float var2, float var3, String var4, int var5, int var6, float var7, String var8, float[] var9) {
      if (!(var3 <= 0.0F)) {
         String var10 = var4 == null ? "" : var4;
         if (!var10.isEmpty()) {
            float[] var11 = var9 != null && var9.length >= 6 ? var9 : nuUnNvnuUu;
            float var12 = var3 / Math.max(1.0E-6F, this.vNUvnnVnUvu.nuUnNvnuUu());
            float var13 = this.vNUvnnVnUvu.VVuuUN() * var12;
            float var14 = var2;
            String var15 = var8 == null ? "l" : var8.toLowerCase();
            int var16 = this.vNUvnnVnUvu.UuUVuuUu();
            float var17 = this.vNUvnnVnUvu.uNNnnnuuuN();
            int var18 = C00OOC00oO(var5);
            int var19 = C00OOC00oO(var6);
            String[] var20 = this.UuUVuuUu(var10);
            boolean var21 = uNNnnnuuuN;

            for (String var25 : var20) {
               float var26 = this.uNNnnnuuuN(var25, var12);
               float var27 = var1;
               if ("c".equals(var15)) {
                  var27 = var1 - var26 * 0.5F;
               } else if ("r".equals(var15)) {
                  var27 = var1 - var26;
               }

               float var28 = var14;
               if (var21) {
                  var27 = Math.round(var27);
                  var28 = Math.round(var14);
               }

               this.UuUVuuUu(var27, var28, var12, var25, var18, var19, var7, Math.max(var26, 1.0E-6F), var11, var16, var17);
               var14 += var13;
            }
         }
      }
   }

   private String[] UuUVuuUu(String var1) {
      if (var1.indexOf(10) < 0) {
         this.uVUuuVnNVU[0] = var1;
         return this.uVUuuVnNVU;
      } else {
         return UuUVuuUu.split(var1, -1);
      }
   }

   public int UuUVuuUu() {
      return this.vNUvnnVnUvu.UuUVuuUu();
   }

   public float UuUVuuUu(String var1, float var2) {
      return this.uNNnnnuuuN(var1 == null ? "" : var1, var2 / Math.max(1.0E-6F, this.vNUvnnVnUvu.nuUnNvnuUu()));
   }

   public float C00OOC00oO(String var1, float var2) {
      return this.UuUVuuUu(var1, var2, true);
   }

   public float uUnuvNvvNU(String var1, float var2) {
      return this.UuUVuuUu(var1, var2, false);
   }

   private float UuUVuuUu(String var1, float var2, boolean var3) {
      String var4 = var1 == null ? "" : var1;
      if (!var4.isEmpty() && !(var2 <= 0.0F)) {
         float var5 = var2 / Math.max(1.0E-6F, this.vNUvnnVnUvu.nuUnNvnuUu());
         float var6 = this.vNUvnnVnUvu.nvUVNnuu();
         float var7 = var3 ? -Float.MAX_VALUE : Float.MAX_VALUE;
         int var8 = 0;

         while (var8 < var4.length()) {
            int var9 = var4.codePointAt(var8);
            var8 += Character.charCount(var9);
            nNvnvuvVuUVU.NVnVnNnN var10 = this.vNUvnnVnUvu.UuUVuuUu(var9);
            if (var10 != null && var10.C00OOC00oO) {
               float var11 = var3 ? var10.nuUnNvnuUu - var6 : var10.vVvUvVVuuNvV + var6;
               var7 = var3 ? Math.max(var7, var11) : Math.min(var7, var11);
            }
         }

         return var7 != -Float.MAX_VALUE && var7 != Float.MAX_VALUE ? var7 * var5 : 0.0F;
      } else {
         return 0.0F;
      }
   }

   public List<VuuUvnvnuu.NVnVnNnN> UuUVuuUu(String var1, float var2, float var3, float var4) {
      ArrayList var5 = new ArrayList();
      String var6 = var1 == null ? "" : var1;
      if (!var6.isEmpty() && !(var2 <= 0.0F)) {
         float var7 = var2 / Math.max(1.0E-6F, this.vNUvnnVnUvu.nuUnNvnuUu());
         float var8 = Math.max(1.0F, (float)this.vNUvnnVnUvu.uUnuvNvvNU());
         float var9 = var3;
         int var10 = -1;
         int var11 = 0;

         while (var11 < var6.length()) {
            int var12 = var6.codePointAt(var11);
            var11 += Character.charCount(var12);
            nNvnvuvVuUVU.NVnVnNnN var13 = this.vNUvnnVnUvu.UuUVuuUu(var12);
            int var14 = var12;
            if (var13 == null) {
               var13 = this.vNUvnnVnUvu.UuUVuuUu(63);
               var14 = 63;
               if (var13 == null) {
                  continue;
               }
            }

            if (var10 != -1) {
               var9 += this.vNUvnnVnUvu.UuUVuuUu(var10, var14) * var7;
            }

            if (var13.C00OOC00oO) {
               float var15 = var9 + var13.uUnuvNvvNU * var7;
               float var16 = var4 - var13.nuUnNvnuUu * var7;
               float var17 = var9 + var13.uNNnnnuuuN * var7;
               float var18 = var4 - var13.vVvUvVVuuNvV * var7;
               float var19 = Math.abs(var13.uVUuuVnNVU - var13.VVuuUN);
               float var20 = var19 > 1.0E-6F ? (var17 - var15) / (var19 * var8) : 1.0F;
               float var21 = this.vNUvnnVnUvu.uNNnnnuuuN() * var20;
               if (var17 > var15 && var18 > var16) {
                  var5.add(new VuuUvnvnuu.NVnVnNnN(var15, var16, var17, var18, var13.VVuuUN, var13.vuuuNvNuv, var13.uVUuuVnNVU, var13.vNUvnnVnUvu, var21));
               }
            }

            var9 += var13.UuUVuuUu * var7;
            var10 = var14;
         }

         return var5;
      } else {
         return var5;
      }
   }

   private void UuUVuuUu(float var1, float var2, float var3, String var4, int var5, float[] var6, int var7, float var8) {
      if (!var4.isEmpty()) {
         float var9 = var1;
         float var10 = var2;
         int var11 = -1;
         int var12 = 0;

         while (var12 < var4.length()) {
            char var13 = var4.charAt(var12);
            if (var13 == '\\' && var12 + 9 < var4.length() && var4.charAt(var12 + 1) == 'c') {
               var12 += 10;
            } else {
               int var14 = var4.codePointAt(var12);
               int var15 = Character.charCount(var14);
               var12 += var15;
               nNvnvuvVuUVU.NVnVnNnN var16 = this.vNUvnnVnUvu.UuUVuuUu(var14);
               int var17 = var14;
               if (var16 == null) {
                  int var18 = UuUVuuUu(var14);
                  if (var18 != var14) {
                     var16 = this.vNUvnnVnUvu.UuUVuuUu(var18);
                     var17 = var18;
                  }
               }

               if (var16 == null) {
                  var16 = this.vNUvnnVnUvu.UuUVuuUu(63);
                  var17 = 63;
                  if (var16 == null) {
                     continue;
                  }
               }

               if (var11 != -1) {
                  var9 += this.vNUvnnVnUvu.UuUVuuUu(var11, var17) * var3;
               }

               if (var16.C00OOC00oO) {
                  float var24 = var9 + var16.uUnuvNvvNU * var3;
                  float var19 = var10 - var16.nuUnNvnuUu * var3;
                  float var20 = var9 + var16.uNNnnnuuuN * var3;
                  float var21 = var10 - var16.vVvUvVVuuNvV * var3;
                  float var22 = var20 - var24;
                  float var23 = var21 - var19;
                  if (var22 > 0.0F && var23 > 0.0F) {
                     this.VVuuUN
                        .vVvUvVVuuNvV(var7, var8, var24, var19, var22, var23, var16.VVuuUN, var16.vuuuNvNuv, var16.uVUuuVnNVU, var16.vNUvnnVnUvu, var5, var6);
                  }
               }

               var9 += var16.UuUVuuUu * var3;
               var11 = var17;
            }
         }
      }
   }

   private void UuUVuuUu(float var1, float var2, float var3, String var4, int var5, int var6, float var7, float var8, float[] var9, int var10, float var11) {
      if (!var4.isEmpty()) {
         float var12 = var1;
         float var13 = var2;
         int var14 = -1;
         int var15 = 0;

         while (var15 < var4.length()) {
            char var16 = var4.charAt(var15);
            if (var16 == '\\' && var15 + 9 < var4.length() && var4.charAt(var15 + 1) == 'c') {
               var15 += 10;
            } else {
               int var17 = var4.codePointAt(var15);
               int var18 = Character.charCount(var17);
               var15 += var18;
               nNvnvuvVuUVU.NVnVnNnN var19 = this.vNUvnnVnUvu.UuUVuuUu(var17);
               int var20 = var17;
               if (var19 == null) {
                  int var21 = UuUVuuUu(var17);
                  if (var21 != var17) {
                     var19 = this.vNUvnnVnUvu.UuUVuuUu(var21);
                     var20 = var21;
                  }
               }

               if (var19 == null) {
                  var19 = this.vNUvnnVnUvu.UuUVuuUu(63);
                  var20 = 63;
                  if (var19 == null) {
                     continue;
                  }
               }

               if (var14 != -1) {
                  var12 += this.vNUvnnVnUvu.UuUVuuUu(var14, var20) * var3;
               }

               float var30 = (var12 - var1 + var19.UuUVuuUu * var3 * 0.5F) / var8;
               float var22 = 0.5F + 0.5F * (float)Math.sin((var30 * 1.55F + var7) * Math.PI * 2.0);
               int var23 = UuUVuuUu(var5, var6, var22);
               if (var19.C00OOC00oO) {
                  float var24 = var12 + var19.uUnuvNvvNU * var3;
                  float var25 = var13 - var19.nuUnNvnuUu * var3;
                  float var26 = var12 + var19.uNNnnnuuuN * var3;
                  float var27 = var13 - var19.vVvUvVVuuNvV * var3;
                  float var28 = var26 - var24;
                  float var29 = var27 - var25;
                  if (var28 > 0.0F && var29 > 0.0F) {
                     this.VVuuUN
                        .vVvUvVVuuNvV(var10, var11, var24, var25, var28, var29, var19.VVuuUN, var19.vuuuNvNuv, var19.uVUuuVnNVU, var19.vNUvnnVnUvu, var23, var9);
                  }
               }

               var12 += var19.UuUVuuUu * var3;
               var14 = var20;
            }
         }
      }
   }

   public VuuUvnvnuu.nvnNNunvv vVvUvVVuuNvV(String var1, float var2) {
      if (var2 <= 0.0F) {
         return new VuuUvnvnuu.nvnNNunvv(0.0F, 0.0F);
      } else {
         String var3 = var1 == null ? "" : var1;
         if (var3.isEmpty()) {
            return new VuuUvnvnuu.nvnNNunvv(0.0F, 0.0F);
         } else {
            float var4 = var2 / Math.max(1.0E-6F, this.vNUvnnVnUvu.nuUnNvnuUu());
            float var5 = this.vNUvnnVnUvu.VVuuUN() * var4;
            String[] var6 = this.UuUVuuUu(var3);
            float var7 = 0.0F;

            for (String var11 : var6) {
               var7 = Math.max(var7, this.uNNnnnuuuN(var11, var4));
            }

            float var12 = Math.max(var5 * var6.length, var5);
            return new VuuUvnvnuu.nvnNNunvv(var7, var12);
         }
      }
   }

   private float uNNnnnuuuN(String var1, float var2) {
      if (var1.isEmpty()) {
         return 0.0F;
      } else {
         float var3 = 0.0F;
         int var4 = -1;
         int var5 = 0;

         while (var5 < var1.length()) {
            char var6 = var1.charAt(var5);
            if (var6 == '\\' && var5 + 9 < var1.length() && var1.charAt(var5 + 1) == 'c') {
               var5 += 10;
            } else {
               int var7 = var1.codePointAt(var5);
               int var8 = Character.charCount(var7);
               var5 += var8;
               nNvnvuvVuUVU.NVnVnNnN var9 = this.vNUvnnVnUvu.UuUVuuUu(var7);
               int var10 = var7;
               if (var9 == null) {
                  int var11 = UuUVuuUu(var7);
                  if (var11 != var7) {
                     var9 = this.vNUvnnVnUvu.UuUVuuUu(var11);
                     var10 = var11;
                  }
               }

               if (var9 == null) {
                  var9 = this.vNUvnnVnUvu.UuUVuuUu(63);
                  var10 = 63;
                  if (var9 == null) {
                     continue;
                  }
               }

               if (var4 != -1) {
                  var3 += this.vNUvnnVnUvu.UuUVuuUu(var4, var10) * var2;
               }

               var3 += var9.UuUVuuUu * var2;
               var4 = var10;
            }
         }

         return var3;
      }
   }

   private static int UuUVuuUu(int var0) {
      return var0 == 10028 ? 9733 : var0;
   }

   private static int C00OOC00oO(int var0) {
      if (!vVvUvVVuuNvV) {
         return var0;
      } else {
         int var1 = var0 >>> 24 & 0xFF;
         if (var1 == 0) {
            return var0;
         } else {
            int var2 = var0 >>> 16 & 0xFF;
            int var3 = var0 >>> 8 & 0xFF;
            int var4 = var0 & 0xFF;
            return var2 >= 210 && var3 >= 210 && var4 >= 210 ? var1 << 24 | (var1 < 180 ? 6710886 : 1710618) : var0;
         }
      }
   }

   private static int UuUVuuUu(int var0, int var1, float var2) {
      float var3 = Math.max(0.0F, Math.min(1.0F, var2));
      int var4 = C00OOC00oO(var0 >>> 24 & 0xFF, var1 >>> 24 & 0xFF, var3);
      int var5 = C00OOC00oO(var0 >>> 16 & 0xFF, var1 >>> 16 & 0xFF, var3);
      int var6 = C00OOC00oO(var0 >>> 8 & 0xFF, var1 >>> 8 & 0xFF, var3);
      int var7 = C00OOC00oO(var0 & 0xFF, var1 & 0xFF, var3);
      return var4 << 24 | var5 << 16 | var6 << 8 | var7;
   }

   private static int C00OOC00oO(int var0, int var1, float var2) {
      return Math.round(var0 + (var1 - var0) * var2);
   }

   public static final class NVnVnNnN {
      public final float UuUVuuUu;
      public final float C00OOC00oO;
      public final float uUnuvNvvNU;
      public final float vVvUvVVuuNvV;
      public final float uNNnnnuuuN;
      public final float nuUnNvnuUu;
      public final float VVuuUN;
      public final float vNUvnnVnUvu;
      public final float uVUuuVnNVU;

      NVnVnNnN(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
         this.uUnuvNvvNU = var3;
         this.vVvUvVVuuNvV = var4;
         this.uNNnnnuuuN = var5;
         this.nuUnNvnuUu = var6;
         this.VVuuUN = var7;
         this.vNUvnnVnUvu = var8;
         this.uVUuuVnNVU = var9;
      }
   }

   public static final class nvnNNunvv {
      public final float UuUVuuUu;
      public final float C00OOC00oO;

      public nvnNNunvv(float var1, float var2) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
      }
   }
}
