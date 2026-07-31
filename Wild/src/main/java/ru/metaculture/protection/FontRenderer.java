package ru.metaculture.protection;

import java.util.Objects;

public final class FontRenderer {
   private static final int O00000000 = 1710618;
   private static final int O000000000 = 6710886;
   private static volatile boolean O0000000000;
   private static final float[] O00000000000 = new float[]{1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F};
   private final RenderEngine O000000000000;
   private final MsdfFontAtlas O0000000000000;

   public FontRenderer(RenderEngine o0000O00O0OOO, MsdfFontAtlas o0000O0O00O0OO) {
      this.O000000000000 = Objects.requireNonNull(o0000O00O0OOO, "backend");
      this.O0000000000000 = Objects.requireNonNull(o0000O0O00O0OO, "font");
   }

   public static boolean O00000000(boolean bl) {
      boolean var1 = O0000000000;
      O0000000000 = bl;
      return var1;
   }

   public void O00000000(float f, float g, float h, String string, int i) {
      this.O00000000(f, g, h, string, i, "l", O00000000000);
   }

   public void O00000000(float f, float g, float h, String string, int i, float[] fs) {
      this.O00000000(f, g, h, string, i, "l", fs);
   }

   public void O00000000(float f, float g, float h, String string, int i, String string2) {
      this.O00000000(f, g, h, string, i, string2, O00000000000);
   }

   public void O00000000(float f, float g, float h, String string, int i, String string2, float[] fs) {
      if (!(h <= 0.0F)) {
         String var8 = string == null ? "" : string;
         if (!var8.isEmpty()) {
            float[] var9 = fs != null && fs.length >= 6 ? fs : O00000000000;
            float var10 = h / Math.max(1.0E-6F, this.O0000000000000.O0000000000000());
            float var11 = this.O0000000000000.O000000000000O() * var10;
            float var12 = g;
            String var13 = string2 == null ? "l" : string2.toLowerCase();
            int var14 = O000000000(i);
            int var15 = this.O0000000000000.O00000000();
            float var16 = this.O0000000000000.O000000000000();
            String[] var17 = var8.split("\\n", -1);

            for (String var21 : var17) {
               float var22 = this.O000000000(var21, var10);
               float var23 = f;
               if ("c".equals(var13)) {
                  var23 = f - var22 * 0.5F;
               } else if ("r".equals(var13)) {
                  var23 = f - var22;
               }

               this.O00000000(var23, var12, var10, var21, var14, var9, var15, var16);
               var12 += var11;
            }
         }
      }
   }

   public void O00000000(float f, float g, float h, String string, int i, int j, float k, String string2, float[] fs) {
      if (!(h <= 0.0F)) {
         String var10 = string == null ? "" : string;
         if (!var10.isEmpty()) {
            float[] var11 = fs != null && fs.length >= 6 ? fs : O00000000000;
            float var12 = h / Math.max(1.0E-6F, this.O0000000000000.O0000000000000());
            float var13 = this.O0000000000000.O000000000000O() * var12;
            float var14 = g;
            String var15 = string2 == null ? "l" : string2.toLowerCase();
            int var16 = this.O0000000000000.O00000000();
            float var17 = this.O0000000000000.O000000000000();
            int var18 = O000000000(i);
            int var19 = O000000000(j);
            String[] var20 = var10.split("\\n", -1);

            for (String var24 : var20) {
               float var25 = this.O000000000(var24, var12);
               float var26 = f;
               if ("c".equals(var15)) {
                  var26 = f - var25 * 0.5F;
               } else if ("r".equals(var15)) {
                  var26 = f - var25;
               }

               this.O00000000(var26, var14, var12, var24, var18, var19, k, Math.max(var25, 1.0E-6F), var11, var16, var17);
               var14 += var13;
            }
         }
      }
   }

   private void O00000000(float f, float g, float h, String string, int i, float[] fs, int j, float k) {
      if (!string.isEmpty()) {
         float var9 = f;
         float var10 = g;
         int var11 = -1;
         int var12 = 0;

         while (var12 < string.length()) {
            char var13 = string.charAt(var12);
            if (var13 == '\\' && var12 + 9 < string.length() && string.charAt(var12 + 1) == 'c') {
               var12 += 10;
            } else {
               int var14 = string.codePointAt(var12);
               int var15 = Character.charCount(var14);
               var12 += var15;
               MsdfFontAtlas.W407 var16 = this.O0000000000000.O00000000(var14);
               int var17 = var14;
               if (var16 == null) {
                  int var18 = O00000000(var14);
                  if (var18 != var14) {
                     var16 = this.O0000000000000.O00000000(var18);
                     var17 = var18;
                  }
               }

               if (var16 == null) {
                  var16 = this.O0000000000000.O00000000(63);
                  var17 = 63;
                  if (var16 == null) {
                     continue;
                  }
               }

               if (var11 != -1) {
                  var9 += this.O0000000000000.O00000000(var11, var17) * h;
               }

               if (var16.O000000000) {
                  float var24 = var9 + var16.O0000000000 * h;
                  float var19 = var10 - var16.O0000000000000 * h;
                  float var20 = var9 + var16.O000000000000 * h;
                  float var21 = var10 - var16.O00000000000 * h;
                  float var22 = var20 - var24;
                  float var23 = var21 - var19;
                  if (var22 > 0.0F && var23 > 0.0F) {
                     this.O000000000000
                        .O00000000000(
                           j, k, var24, var19, var22, var23, var16.O000000000000O, var16.O00000000000OO, var16.O00000000000O0, var16.O00000000000O, i, fs
                        );
                  }
               }

               var9 += var16.O00000000 * h;
               var11 = var17;
            }
         }
      }
   }

   private void O00000000(float f, float g, float h, String string, int i, int j, float k, float l, float[] fs, int m, float n) {
      if (!string.isEmpty()) {
         float var12 = f;
         float var13 = g;
         int var14 = -1;
         int var15 = 0;

         while (var15 < string.length()) {
            char var16 = string.charAt(var15);
            if (var16 == '\\' && var15 + 9 < string.length() && string.charAt(var15 + 1) == 'c') {
               var15 += 10;
            } else {
               int var17 = string.codePointAt(var15);
               int var18 = Character.charCount(var17);
               var15 += var18;
               MsdfFontAtlas.W407 var19 = this.O0000000000000.O00000000(var17);
               int var20 = var17;
               if (var19 == null) {
                  int var21 = O00000000(var17);
                  if (var21 != var17) {
                     var19 = this.O0000000000000.O00000000(var21);
                     var20 = var21;
                  }
               }

               if (var19 == null) {
                  var19 = this.O0000000000000.O00000000(63);
                  var20 = 63;
                  if (var19 == null) {
                     continue;
                  }
               }

               if (var14 != -1) {
                  var12 += this.O0000000000000.O00000000(var14, var20) * h;
               }

               float var30 = (var12 - f + var19.O00000000 * h * 0.5F) / l;
               float var22 = 0.5F + 0.5F * (float)Math.sin((var30 * 1.55F + k) * Math.PI * 2.0);
               int var23 = O00000000(i, j, var22);
               if (var19.O000000000) {
                  float var24 = var12 + var19.O0000000000 * h;
                  float var25 = var13 - var19.O0000000000000 * h;
                  float var26 = var12 + var19.O000000000000 * h;
                  float var27 = var13 - var19.O00000000000 * h;
                  float var28 = var26 - var24;
                  float var29 = var27 - var25;
                  if (var28 > 0.0F && var29 > 0.0F) {
                     this.O000000000000
                        .O00000000000(
                           m, n, var24, var25, var28, var29, var19.O000000000000O, var19.O00000000000OO, var19.O00000000000O0, var19.O00000000000O, var23, fs
                        );
                  }
               }

               var12 += var19.O00000000 * h;
               var14 = var20;
            }
         }
      }
   }

   public FontRenderer.W409 O00000000(String string, float f) {
      if (f <= 0.0F) {
         return new FontRenderer.W409(0.0F, 0.0F);
      } else {
         String var3 = string == null ? "" : string;
         if (var3.isEmpty()) {
            return new FontRenderer.W409(0.0F, 0.0F);
         } else {
            float var4 = f / Math.max(1.0E-6F, this.O0000000000000.O0000000000000());
            float var5 = this.O0000000000000.O000000000000O() * var4;
            String[] var6 = var3.split("\\n", -1);
            float var7 = 0.0F;

            for (String var11 : var6) {
               var7 = Math.max(var7, this.O000000000(var11, var4));
            }

            float var12 = Math.max(var5 * var6.length, var5);
            return new FontRenderer.W409(var7, var12);
         }
      }
   }

   private float O000000000(String string, float f) {
      if (string.isEmpty()) {
         return 0.0F;
      } else {
         float var3 = 0.0F;
         int var4 = -1;
         int var5 = 0;

         while (var5 < string.length()) {
            char var6 = string.charAt(var5);
            if (var6 == '\\' && var5 + 9 < string.length() && string.charAt(var5 + 1) == 'c') {
               var5 += 10;
            } else {
               int var7 = string.codePointAt(var5);
               int var8 = Character.charCount(var7);
               var5 += var8;
               MsdfFontAtlas.W407 var9 = this.O0000000000000.O00000000(var7);
               int var10 = var7;
               if (var9 == null) {
                  int var11 = O00000000(var7);
                  if (var11 != var7) {
                     var9 = this.O0000000000000.O00000000(var11);
                     var10 = var11;
                  }
               }

               if (var9 == null) {
                  var9 = this.O0000000000000.O00000000(63);
                  var10 = 63;
                  if (var9 == null) {
                     continue;
                  }
               }

               if (var4 != -1) {
                  var3 += this.O0000000000000.O00000000(var4, var10) * f;
               }

               var3 += var9.O00000000 * f;
               var4 = var10;
            }
         }

         return var3;
      }
   }

   private static int O00000000(int i) {
      return i == 10028 ? 9733 : i;
   }

   private static int O000000000(int i) {
      if (!O0000000000) {
         return i;
      } else {
         int var1 = i >>> 24 & 0xFF;
         if (var1 == 0) {
            return i;
         } else {
            int var2 = i >>> 16 & 0xFF;
            int var3 = i >>> 8 & 0xFF;
            int var4 = i & 0xFF;
            return var2 >= 210 && var3 >= 210 && var4 >= 210 ? var1 << 24 | (var1 < 180 ? 6710886 : 1710618) : i;
         }
      }
   }

   private static int O00000000(int i, int j, float f) {
      float var3 = Math.max(0.0F, Math.min(1.0F, f));
      int var4 = O000000000(i >>> 24 & 0xFF, j >>> 24 & 0xFF, var3);
      int var5 = O000000000(i >>> 16 & 0xFF, j >>> 16 & 0xFF, var3);
      int var6 = O000000000(i >>> 8 & 0xFF, j >>> 8 & 0xFF, var3);
      int var7 = O000000000(i & 0xFF, j & 0xFF, var3);
      return var4 << 24 | var5 << 16 | var6 << 8 | var7;
   }

   private static int O000000000(int i, int j, float f) {
      return Math.round(i + (j - i) * f);
   }

   public static final class W409 {
      public final float O00000000;
      public final float O000000000;

      public W409(float f, float g) {
         this.O00000000 = f;
         this.O000000000 = g;
      }
   }
}
