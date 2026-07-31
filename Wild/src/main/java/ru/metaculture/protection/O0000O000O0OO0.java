package ru.metaculture.protection;

public enum O0000O000O0OO0 {
   STATIC(0L) {
      @Override
      public ColorScheme O00000000(ColorScheme o0000O000O0OO, int[] is, long l) {
         return o0000O000O0OO;
      }
   },
   MULTI_GRADIENT(11000L) {
      @Override
      public ColorScheme O00000000(ColorScheme o0000O000O0OO, int[] is, long l) {
         float var5 = O00000000(l, this.O00000000);
         float var6 = 0.5F + 0.5F * (float)Math.sin(l * 9.0E-4);
         int var7 = ColorScheme.O00000000(O00000000(is, var5), 0.18F);
         int var8 = O00000000(is, var5 + 0.34F);
         int var9 = O00000000(is, var5 + 0.18F);
         int var10 = O00000000(is, var5 + 0.62F);
         int var11 = O00000000(is, var5 + 0.84F);
         int var12 = O00000000(is, var5 + 0.5F);
         int var13 = O00000000(is, var5 + 0.05F);
         return O0000O000O0OO0.O00000000(
            o0000O000O0OO,
            var7,
            var8,
            ColorScheme.O000000000(o0000O000O0OO.O0000000000000(), var9, 0.16F + 0.04F * var6),
            ColorScheme.O000000000(o0000O000O0OO.O000000000000O(), var10, 0.18F + 0.04F * (1.0F - var6)),
            ColorScheme.O000000000(o0000O000O0OO.O0000000000O0O(), var11, 0.3F),
            ColorScheme.O000000000(o0000O000O0OO.O0000000000OO(), var11, 0.34F),
            ColorScheme.O000000000(o0000O000O0OO.O0000000000OO0(), var12, 0.2F),
            ColorScheme.O000000000(o0000O000O0OO.O0000000000OOO(), var12, 0.22F),
            ColorScheme.O00000000(o0000O000O0OO.O000000000O(), var13, 0.06F)
         );
      }
   },
   TWIN_LAYERS(13000L) {
      @Override
      public ColorScheme O00000000(ColorScheme o0000O000O0OO, int[] is, long l) {
         float var5 = O00000000(l, this.O00000000);
         float var6 = 1.0F - var5;
         float var7 = 0.5F + 0.5F * (float)Math.sin(l * 0.0011);
         int var8 = ColorScheme.O00000000(O00000000(is, var5), 0.16F);
         int var9 = O00000000(is, var6 + 0.5F);
         int var10 = O00000000(is, var5 + 0.3F);
         int var11 = O00000000(is, var6 + 0.3F);
         int var12 = O00000000(is, var5 + 0.5F);
         int var13 = O00000000(is, var6 + 0.18F);
         return O0000O000O0OO0.O00000000(
            o0000O000O0OO,
            var8,
            var9,
            ColorScheme.O000000000(o0000O000O0OO.O0000000000000(), var10, 0.18F + 0.05F * var7),
            ColorScheme.O000000000(o0000O000O0OO.O000000000000O(), var11, 0.2F + 0.05F * (1.0F - var7)),
            ColorScheme.O000000000(o0000O000O0OO.O0000000000O0O(), var12, 0.32F),
            ColorScheme.O000000000(o0000O000O0OO.O0000000000OO(), var12, 0.36F),
            ColorScheme.O000000000(o0000O000O0OO.O0000000000OO0(), var13, 0.22F),
            ColorScheme.O000000000(o0000O000O0OO.O0000000000OOO(), var13, 0.24F),
            ColorScheme.O00000000(o0000O000O0OO.O000000000O(), ColorScheme.O00000000(var8, var9, 0.5F), 0.05F)
         );
      }
   },
   HUE_WHEEL(8500L) {
      @Override
      public ColorScheme O00000000(ColorScheme o0000O000O0OO, int[] is, long l) {
         float var5 = O00000000(l, this.O00000000);
         float var6 = 0.5F + 0.5F * (float)Math.sin(l * 0.0013);
         int var7 = ColorScheme.O00000000(O00000000(is, var5), 0.14F);
         int var8 = O00000000(is, var5 + 0.3F);
         int var9 = O00000000(is, var5 + 0.15F);
         int var10 = O00000000(is, var5 + 0.6F);
         int var11 = O00000000(is, var5 + 0.8F);
         int var12 = O00000000(is, var5 + 0.45F);
         int var13 = O00000000(is, var5 + 0.05F);
         return O0000O000O0OO0.O00000000(
            o0000O000O0OO,
            var7,
            var8,
            ColorScheme.O000000000(o0000O000O0OO.O0000000000000(), var9, 0.12F + 0.03F * var6),
            ColorScheme.O000000000(o0000O000O0OO.O000000000000O(), var10, 0.14F + 0.03F * (1.0F - var6)),
            ColorScheme.O000000000(o0000O000O0OO.O0000000000O0O(), var11, 0.3F),
            ColorScheme.O000000000(o0000O000O0OO.O0000000000OO(), var11, 0.34F),
            ColorScheme.O000000000(o0000O000O0OO.O0000000000OO0(), var12, 0.18F),
            ColorScheme.O000000000(o0000O000O0OO.O0000000000OOO(), var12, 0.2F),
            ColorScheme.O00000000(o0000O000O0OO.O000000000O(), var13, 0.05F)
         );
      }
   },
   BREATHING(7000L) {
      @Override
      public ColorScheme O00000000(ColorScheme o0000O000O0OO, int[] is, long l) {
         float var5 = O00000000(l, this.O00000000);
         float var6 = 0.5F + 0.5F * (float)Math.sin(var5 * Math.PI * 2.0);
         float var7 = 0.5F + 0.5F * (float)Math.sin(var5 * Math.PI * 2.0 + 2.0734511513692637);
         int var8 = O00000000(is, 0.05F);
         int var9 = O00000000(is, 0.35F);
         int var10 = O00000000(is, 0.55F);
         int var11 = O00000000(is, 0.75F);
         int var12 = ColorScheme.O00000000(var8, 0.04F + 0.1F * var6);
         int var13 = ColorScheme.O00000000(var9, 0.02F * (1.0F - var6));
         return O0000O000O0OO0.O00000000(
            o0000O000O0OO,
            var12,
            var13,
            ColorScheme.O000000000(o0000O000O0OO.O0000000000000(), var10, 0.08F + 0.04F * var6),
            ColorScheme.O000000000(o0000O000O0OO.O000000000000O(), var11, 0.1F + 0.04F * var7),
            ColorScheme.O000000000(o0000O000O0OO.O0000000000O0O(), var8, 0.18F + 0.06F * var6),
            ColorScheme.O000000000(o0000O000O0OO.O0000000000OO(), var8, 0.2F + 0.06F * var6),
            ColorScheme.O000000000(o0000O000O0OO.O0000000000OO0(), var9, 0.12F),
            ColorScheme.O000000000(o0000O000O0OO.O0000000000OOO(), var9, 0.16F),
            ColorScheme.O00000000(o0000O000O0OO.O000000000O(), var12, 0.02F * var6)
         );
      }
   },
   PRISMATIC_WAVE(8500L) {
      @Override
      public ColorScheme O00000000(ColorScheme o0000O000O0OO, int[] is, long l) {
         float var5 = O00000000(l, this.O00000000);
         float var6 = 0.5F + 0.5F * (float)Math.sin(l * 0.0017);
         int var7 = ColorScheme.O00000000(O00000000(is, var5), 0.16F);
         int var8 = O00000000(is, var5 + 0.27F);
         int var9 = O00000000(is, var5 + 0.12F + var6 * 0.04F);
         int var10 = O00000000(is, var5 + 0.55F + var6 * 0.04F);
         int var11 = O00000000(is, var5 + 0.78F);
         int var12 = O00000000(is, var5 + 0.42F);
         return O0000O000O0OO0.O00000000(
            o0000O000O0OO,
            var7,
            var8,
            ColorScheme.O000000000(o0000O000O0OO.O0000000000000(), var9, 0.15F + 0.03F * var6),
            ColorScheme.O000000000(o0000O000O0OO.O000000000000O(), var10, 0.17F + 0.03F * (1.0F - var6)),
            ColorScheme.O000000000(o0000O000O0OO.O0000000000O0O(), var11, 0.3F),
            ColorScheme.O000000000(o0000O000O0OO.O0000000000OO(), var11, 0.34F),
            ColorScheme.O000000000(o0000O000O0OO.O0000000000OO0(), var12, 0.2F),
            ColorScheme.O000000000(o0000O000O0OO.O0000000000OOO(), var12, 0.24F),
            ColorScheme.O00000000(o0000O000O0OO.O000000000O(), ColorScheme.O00000000(var7, var9, 0.5F), 0.05F)
         );
      }
   },
   RAINBOW_LINEAR(9000L) {
      @Override
      public ColorScheme O00000000(ColorScheme o0000O000O0OO, int[] is, long l) {
         float var5 = O00000000(l, this.O00000000);
         float var6 = 0.5F + 0.5F * (float)Math.sin(l * 0.0014);
         int var7 = O00000000(is, var5);
         int var8 = ColorScheme.O00000000(O00000000(is, var5 + 0.38F), 0.18F);
         int var9 = O00000000(is, var5 + 0.16F);
         int var10 = O00000000(is, var5 + 0.58F);
         int var11 = O00000000(is, var5 + 0.82F);
         int var12 = O00000000(is, var5 + 0.46F);
         return O0000O000O0OO0.O00000000(
            o0000O000O0OO,
            var8,
            var7,
            ColorScheme.O000000000(o0000O000O0OO.O0000000000000(), var9, 0.1F + 0.05F * var6),
            ColorScheme.O000000000(o0000O000O0OO.O000000000000O(), var10, 0.12F + 0.05F * (1.0F - var6)),
            ColorScheme.O000000000(o0000O000O0OO.O0000000000O0O(), var11, 0.22F),
            ColorScheme.O000000000(o0000O000O0OO.O0000000000OO(), var11, 0.26F),
            ColorScheme.O000000000(o0000O000O0OO.O0000000000OO0(), var12, 0.16F),
            ColorScheme.O000000000(o0000O000O0OO.O0000000000OOO(), var12, 0.18F),
            ColorScheme.O00000000(o0000O000O0OO.O000000000O(), var9, 0.04F)
         );
      }
   };

   public final long O00000000;

   O0000O000O0OO0(long l) {
      this.O00000000 = l;
   }

   public abstract ColorScheme O00000000(ColorScheme o0000O000O0OO, int[] is, long l);

   public static O0000O000O0OO0 O00000000(Theme o0000000OOO) {
      if (o0000000OOO == null) {
         return STATIC;
      } else {
         O0000O000O0OO0 var1 = O0000O000OO0.O000000000(o0000000OOO);
         return var1 == null ? STATIC : var1;
      }
   }

   public static ColorScheme O00000000(Theme o0000000OOO, ColorScheme o0000O000O0OO, long l) {
      if (o0000000OOO == null || o0000O000O0OO == null) {
         return o0000O000O0OO;
      } else if (!MenuModule.O00000000(MenuModule.O00000000O00)) {
         return o0000O000O0OO;
      } else {
         int[] var4 = O0000O000OO0.O00000000(o0000000OOO);
         O0000O000O0OO0 var5 = O00000000(o0000000OOO);
         return var5 != STATIC && var4 != null && var4.length >= 2 ? var5.O00000000(o0000O000O0OO, var4, l) : o0000O000O0OO;
      }
   }

   static float O00000000(long l, long m) {
      if (m <= 0L) {
         return 0.0F;
      } else {
         long var4 = l % m;
         if (var4 < 0L) {
            var4 += m;
         }

         return (float)var4 / (float)m;
      }
   }

   static int O00000000(int[] is, float f) {
      if (is != null && is.length != 0) {
         if (is.length == 1) {
            return is[0];
         } else {
            float var2 = f - (float)Math.floor(f);
            float var3 = var2 * (is.length - 1);
            int var4 = Math.min(is.length - 2, Math.max(0, (int)Math.floor(var3)));
            return ColorScheme.O00000000(is[var4], is[var4 + 1], var3 - var4);
         }
      } else {
         return -1;
      }
   }

   static int O00000000(float f, float g, float h) {
      f = (f % 360.0F + 360.0F) % 360.0F;
      float var3 = (1.0F - Math.abs(2.0F * h - 1.0F)) * g;
      float var4 = var3 * (1.0F - Math.abs(f / 60.0F % 2.0F - 1.0F));
      float var5 = h - var3 * 0.5F;
      float var6;
      float var7;
      float var8;
      if (f < 60.0F) {
         var6 = var3;
         var7 = var4;
         var8 = 0.0F;
      } else if (f < 120.0F) {
         var6 = var4;
         var7 = var3;
         var8 = 0.0F;
      } else if (f < 180.0F) {
         var6 = 0.0F;
         var7 = var3;
         var8 = var4;
      } else if (f < 240.0F) {
         var6 = 0.0F;
         var7 = var4;
         var8 = var3;
      } else if (f < 300.0F) {
         var6 = var4;
         var7 = 0.0F;
         var8 = var3;
      } else {
         var6 = var3;
         var7 = 0.0F;
         var8 = var4;
      }

      return ColorScheme.O00000000(Math.round((var6 + var5) * 255.0F), Math.round((var7 + var5) * 255.0F), Math.round((var8 + var5) * 255.0F), 255);
   }

   static ColorScheme O00000000(ColorScheme o0000O000O0OO, int i, int j, int k, int l, int m, int n, int o, int p, int q) {
      int var10 = o0000O000O0OO.O000000000O000() ? o0000O000O0OO.O0000000000OO0() : o;
      int var11 = o0000O000O0OO.O000000000O000() ? o0000O000O0OO.O0000000000OOO() : p;
      int var12 = o0000O000O0OO.O000000000O000() ? o0000O000O0OO.O000000000O() : q;
      return ColorScheme.O000000000000()
         .O00000000(k)
         .O000000000(l)
         .O0000000000(o0000O000O0OO.O00000000000O())
         .O00000000000(o0000O000O0OO.O00000000000O0())
         .O000000000000(o0000O000O0OO.O00000000000OO())
         .O0000000000000(o0000O000O0OO.O0000000000O())
         .O000000000000O(o0000O000O0OO.O0000000000O0())
         .O00000000000O(o0000O000O0OO.O0000000000O00())
         .O00000000000O0(m)
         .O00000000000OO(n)
         .O0000000000O(var10)
         .O0000000000O0(var11)
         .O0000000000O00(var12)
         .O0000000000O0O(i)
         .O0000000000OO(j)
         .O00000000(o0000O000O0OO.O000000000O000())
         .O00000000();
   }
}
