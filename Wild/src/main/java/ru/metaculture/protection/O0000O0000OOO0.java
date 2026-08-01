package ru.metaculture.protection;

public final class O0000O0000OOO0 {
   public void O00000000(RenderManager o0000O00OO0O0, O0000O000O0O0 o0000O000O0O0, O00000OOOOOOOO o00000OOOOOOOO, O0000O000O0OOO o0000O000O0OOO) {
      O0000O00000 var5 = o0000O000O0OOO.O000000000000();
      ColorScheme var6 = o0000O000O0OOO.O0000000000000();
      o0000O00OO0O0.O00000000(
         o00000OOOOOOOO.O0000000000(),
         o00000OOOOOOOO.O00000000000(),
         var5.O00000000000O(),
         var5.O00000000000OO(),
         var5.O00000000(16.0F),
         var5.O00000000(4.0F),
         var5.O00000000(4.0F),
         var5.O00000000(16.0F),
         O0000O00000OO.O00000000000O(var6)
      );
      if (var6.O000000000O000()) {
         o0000O00OO0O0.O00000000(
            o00000OOOOOOOO.O0000000000() + var5.O00000000(0.75F),
            o00000OOOOOOOO.O00000000000() + var5.O00000000(0.75F),
            var5.O00000000000O() - var5.O00000000(1.5F),
            var5.O00000000000OO() - var5.O00000000(1.5F),
            var5.O00000000(15.5F),
            var5.O00000000(3.5F),
            var5.O00000000(3.5F),
            var5.O00000000(15.5F),
            O0000O00000OO.O000000000(var6, 0.82F),
            var5.O00000000(0.85F)
         );
      }

      this.O0000000000(o0000O00OO0O0, o0000O000O0O0, o00000OOOOOOOO, o0000O000O0OOO);
      this.O00000000000(o0000O00OO0O0, o0000O000O0O0, o00000OOOOOOOO, o0000O000O0OOO);
      this.O000000000(o0000O00OO0O0, o0000O000O0O0, o00000OOOOOOOO, o0000O000O0OOO);
      this.O000000000000(o0000O00OO0O0, o0000O000O0O0, o00000OOOOOOOO, o0000O000O0OOO);
   }

   public static float O00000000(O00000OOOOOOOO o00000OOOOOOOO, O0000O00000 o0000O00000) {
      return Math.round(o00000OOOOOOOO.O0000000000() + o0000O00000.O00000000(16.0F));
   }

   public static float O000000000(O00000OOOOOOOO o00000OOOOOOOO, O0000O00000 o0000O00000) {
      return Math.round(o00000OOOOOOOO.O00000000000() + o0000O00000.O00000000(16.0F));
   }

   public static float O00000000(O0000O00000 o0000O00000) {
      return o0000O00000.O00000000(40.0F);
   }

   public static float O000000000(O0000O00000 o0000O00000) {
      return o0000O00000.O00000000(40.0F);
   }

   public static float O0000000000(O00000OOOOOOOO o00000OOOOOOOO, O0000O00000 o0000O00000) {
      return Math.round(o00000OOOOOOOO.O0000000000() + o0000O00000.O00000000(16.0F));
   }

   public static float O00000000000(O00000OOOOOOOO o00000OOOOOOOO, O0000O00000 o0000O00000) {
      return Math.round(o00000OOOOOOOO.O00000000000() + o0000O00000.O00000000000OO() - o0000O00000.O00000000(56.0F));
   }

   public static float O000000000000(O00000OOOOOOOO o00000OOOOOOOO, O0000O00000 o0000O00000) {
      float var2 = Math.round(o00000OOOOOOOO.O00000000000() + o0000O00000.O00000000(89.0F));
      return Math.round(
         Math.min(var2 + Category.values().length * o0000O00000.O00000000(56.0F), O00000000000(o00000OOOOOOOO, o0000O00000) - o0000O00000.O00000000(72.0F))
      );
   }

   private void O000000000(RenderManager o0000O00OO0O0, O0000O000O0O0 o0000O000O0O0, O00000OOOOOOOO o00000OOOOOOOO, O0000O000O0OOO o0000O000O0OOO) {
      O0000O00000 var5 = o0000O000O0OOO.O000000000000();
      ColorScheme var6 = o0000O000O0OOO.O0000000000000();
      float var7 = O0000000000(o00000OOOOOOOO, var5);
      float var8 = O000000000000(o00000OOOOOOOO, var5);
      float var9 = o0000O000O0O0.O00000000(O0000O000O00O0.O000000000000());
      float var10 = o0000O000O0O0.O00000000(O0000O000O00O0.O0000000000000());
      float var11 = Math.max(var9, var10) * var5.O00000000(1.0F);
      float var12 = O0000O00000OO.O00000000(var9, o0000O000O0O0.O000000000(O0000O000O00O0.O000000000000()));
      this.O00000000(o0000O00OO0O0, o0000O000O0O0, var6, var7, var8 - var11, O000000000(var5), 5, var9, var10, var12);
      if (!this.O00000000(o0000O000O0O0) && O0000O00000OO.O00000000(o0000O000O0O0, var7, var8, var5.O00000000(40.0F), var5.O00000000(40.0F))) {
         o0000O000O0O0.O00000000("tab:autobuy", "AutoBuy", var7 + var5.O00000000(40.0F), var8 + var5.O00000000(20.0F));
      }
   }

   private void O00000000(
      RenderManager o0000O00OO0O0, O0000O000O0O0 o0000O000O0O0, ColorScheme o0000O000O0OO, float f, float g, float h, int i, float j, float k, float l
   ) {
      int var11 = o0000O000O0OO.O000000000O000()
         ? ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), o0000O000O0OO.O000000000O(), 0.45F)
         : o0000O000O0OO.O000000000O0();
      int var12 = o0000O000O0OO.O000000000O000()
         ? ColorScheme.O00000000(o0000O000O0OO.O000000000O00(), o0000O000O0OO.O000000000O(), 0.45F)
         : o0000O000O0OO.O000000000O00();
      int var13 = o0000O000O0OO.O000000000O000() ? O0000O00000OO.O00000000(o0000O000O0OO, 0.0F) : o0000O000O0OO.O00000000000O();
      int var14 = o0000O000O0OO.O000000000O000() ? O0000O00000OO.O000000000(o0000O000O0OO, 0.9F) : o0000O000O0OO.O00000000000OO();
      o0000O00OO0O0.O0000000000();
      O0000O0000OOO.O00000000(
         f, g, h, i, j, k, l, var11, var12, o0000O000O0OO.O0000000000OO0(), var13, var14, o0000O000O0O0.O00000000000(), o0000O000O0OO.O000000000O000()
      );
   }

   private void O0000000000(RenderManager o0000O00OO0O0, O0000O000O0O0 o0000O000O0O0, O00000OOOOOOOO o00000OOOOOOOO, O0000O000O0OOO o0000O000O0OOO) {
      O0000O00000 var5 = o0000O000O0OOO.O000000000000();
      ColorScheme var6 = o0000O000O0OOO.O0000000000000();
      float var7 = O00000000(o00000OOOOOOOO, var5);
      float var8 = O000000000(o00000OOOOOOOO, var5);
      float var9 = O00000000(var5);
      o0000O00OO0O0.O0000000000();
      O0000O0000O0O0.O00000000(var7, var8, var9, var6.O000000000O0(), var6.O000000000O00(), o0000O000O0O0.O00000000000(), var6.O000000000O000());
      float var10 = 0.5F + 0.5F * (float)Math.sin((float)System.currentTimeMillis() * 0.00108F);
      float var11 = 19.5F;
      float var12 = var11 * (1.08F + var10 * 0.035F);
      float var13 = O0000O00000OO.O00000000(FontRegistry.O00000000000O, "W", var11);
      float var14 = O0000O00000OO.O00000000(FontRegistry.O00000000000O, "W", var12);
      float var15 = var7 + var9 * 0.5F;
      float var16 = var8 + var9 * 0.5F;
      float var17 = O0000O00000OO.O00000000(var5, FontRegistry.O00000000000O, var11);
      float var18 = O0000O00000OO.O00000000(var5, FontRegistry.O00000000000O, var12);
      float var19 = var15 - var13 * 0.5F;
      float var20 = var15 - var14 * 0.5F;
      float var21 = var16 - var17 * 0.5F - var5.O00000000(1.0F);
      float var22 = var16 - var18 * 0.5F - var5.O00000000(1.0F);
      if (!var6.O000000000O000()) {
         o0000O00OO0O0.O00000000000();

         try {
            O0000O00000OO.O00000000(
               o0000O00OO0O0,
               var5,
               FontRegistry.O00000000000O,
               var20,
               var22,
               var12,
               "W",
               ColorScheme.O00000000(ColorScheme.O00000000(var6.O000000000O00(), 120), ColorScheme.O00000000(var6.O000000000O0(), 135), var10)
            );
         } finally {
            o0000O00OO0O0.O000000000000();
         }
      }

      O0000O00000OO.O00000000(
         o0000O00OO0O0, var5, FontRegistry.O00000000000O, var19, var21, var11, "W", ColorScheme.O00000000(O0000O00000OO.O00000000000(var6), 246)
      );
      o0000O00OO0O0.O00000000(
         var7 + var5.O00000000(4.0F), var8 + var5.O00000000(56.0F), var5.O00000000(32.0F), var5.O00000000(1.0F), var5.O00000000(1.0F), var6.O0000000000O00()
      );
      if (!this.O00000000(o0000O000O0O0) && O0000O00000OO.O00000000(o0000O000O0O0, var7, var8, var9, var9)) {
         o0000O000O0O0.O00000000("logo:themes", "Themes", var7 + var9 + var5.O00000000(6.0F), var8 + var9 * 0.5F);
      }
   }

   private void O00000000000(RenderManager o0000O00OO0O0, O0000O000O0O0 o0000O000O0O0, O00000OOOOOOOO o00000OOOOOOOO, O0000O000O0OOO o0000O000O0OOO) {
      O0000O00000 var5 = o0000O000O0OOO.O000000000000();
      ColorScheme var6 = o0000O000O0OOO.O0000000000000();
      float var7 = O0000000000(o00000OOOOOOOO, var5);
      float var8 = o00000OOOOOOOO.O00000000000() + var5.O00000000(89.0F);
      Category[] var9 = Category.values();

      for (int var10 = 0; var10 < var9.length; var10++) {
         Category var11 = var9[var10];
         float var12 = var8 + var10 * var5.O00000000(56.0F);
         float var13 = o0000O000O0O0.O00000000(O0000O000O00O0.O00000000(var11));
         float var14 = o0000O000O0O0.O00000000(O0000O000O00O0.O000000000(var11));
         float var15 = Math.max(var13, var14) * var5.O00000000(1.0F);
         float var16 = O0000O00000OO.O00000000(var13, o0000O000O0O0.O000000000(O0000O000O00O0.O00000000(var11)));
         this.O00000000(o0000O00OO0O0, o0000O000O0O0, var6, var7, var12 - var15, O000000000(var5), var10, var13, var14, var16);
         if (!this.O00000000(o0000O000O0O0) && O0000O00000OO.O00000000(o0000O000O0O0, var7, var12, var5.O00000000(40.0F), var5.O00000000(40.0F))) {
            o0000O000O0O0.O00000000("cat:" + var11.name(), var11.O000000000(), var7 + var5.O00000000(40.0F), var12 + var5.O00000000(20.0F));
         }
      }
   }

   private void O000000000000(RenderManager o0000O00OO0O0, O0000O000O0O0 o0000O000O0O0, O00000OOOOOOOO o00000OOOOOOOO, O0000O000O0OOO o0000O000O0OOO) {
      O0000O00000 var5 = o0000O000O0OOO.O000000000000();
      ColorScheme var6 = o0000O000O0OOO.O0000000000000();
      float var7 = O0000000000(o00000OOOOOOOO, var5);
      float var8 = O00000000000(o00000OOOOOOOO, var5);
      float var9 = o0000O000O0O0.O00000000(O0000O000O00O0.O000000000());
      float var10 = o0000O000O0O0.O000000O0O0O0() ? 1.0F : 0.0F;
      float var11 = Math.max(var9, var10);
      float var12 = O000000000(var5);
      float var13 = var7 + var12 * 0.5F;
      float var14 = var8 + var12 * 0.5F;
      float var15 = O0000O00000OO.O00000000(var9, o0000O000O0O0.O000000000(O0000O000O00O0.O000000000()));
      o0000O00OO0O0.O00000000(var15, var13, var14);

      try {
         if (var11 > 0.01F) {
            int var16 = var6.O000000000O000()
               ? ColorScheme.O00000000(0, 0, 0, Math.round(24.0F * var11))
               : ColorScheme.O00000000(var6.O000000000O00(), Math.round(38.0F * var11));
            o0000O00OO0O0.O00000000(
               var7 - var5.O00000000(1.5F),
               var8 - var5.O00000000(1.5F),
               var12 + var5.O00000000(3.0F),
               var12 + var5.O00000000(3.0F),
               var5.O00000000(21.5F),
               var5.O00000000(14.0F) * var11,
               var5.O00000000(var6.O000000000O000() ? 2.6F : 2.0F),
               var16
            );
         }

         o0000O00OO0O0.O000000000(
            var13,
            var14,
            var5.O00000000(20.0F),
            0.0F,
            1.0F,
            ColorScheme.O00000000(ColorScheme.O00000000(var6.O0000000000OO0(), 118), ColorScheme.O00000000(var6.O000000000O0(), 196), var11)
         );
         o0000O00OO0O0.O000000000(
            var13,
            var14,
            var5.O00000000(18.25F),
            0.0F,
            1.0F,
            var6.O000000000O000() ? ColorScheme.O00000000(255, 255, 255, 218) : ColorScheme.O00000000(20, 15, 24, 238)
         );
         o0000O00OO0O0.O000000000(
            var13,
            var14,
            var5.O00000000(15.8F),
            0.0F,
            1.0F,
            var6.O000000000O000()
               ? O0000O00000OO.O00000000(var6, var11)
               : ColorScheme.O00000000(var6.O00000000000O(), ColorScheme.O00000000(var6.O000000000O00(), 28), var11)
         );
         O0000O0000OO0.O00000000(
            o0000O00OO0O0,
            var5,
            var13,
            var14 + var5.O00000000(0.4F),
            var5.O00000000(0.88F),
            ColorScheme.O00000000(O0000O00000OO.O000000000(var6), O0000O00000OO.O00000000(var6), var11 * 0.72F),
            ColorScheme.O00000000(var6.O000000000O0(), Math.round(18.0F + 46.0F * var11))
         );
      } finally {
         o0000O00OO0O0.O00000000000O0();
      }

      if (!this.O00000000(o0000O000O0O0) && O0000O00000OO.O00000000(o0000O000O0O0, var7, var8, var12, var12)) {
         o0000O000O0O0.O00000000("avatar", "Profile", var7 + var12 + var5.O00000000(6.0F), var8 + var12 * 0.5F);
      }
   }

   private boolean O00000000(O0000O000O0O0 o0000O000O0O0) {
      return o0000O000O0O0.O000000O0O0O0() || o0000O000O0O0.O00000000OO00();
   }
}
