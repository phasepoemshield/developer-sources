package ru.metaculture.protection;

public final class SearchBarRenderer {
   private static final String O00000000 = "Foundry";
   private static final String O000000000 = "Studio";
   private static final String O0000000000 = "a";
   private static final float O00000000000 = 92.0F;
   private static final float O000000000000 = 86.0F;
   private final O0000O00000OOO O0000000000000 = new O0000O00000OOO();

   public void O00000000(RenderManager o0000O00OO0O0, O0000O000O0O0 o0000O000O0O0, O00000OOOOOOOO o00000OOOOOOOO, O0000O000O0OOO o0000O000O0OOO) {
      O0000O00000 var5 = o0000O000O0OOO.O000000000000();
      ColorScheme var6 = o0000O000O0OOO.O0000000000000();
      float var7 = o0000O000O0O0.O00000000(O0000O000O00O0.O00000000());
      o0000O00OO0O0.O00000000(
         o00000OOOOOOOO.O000000000000O(),
         o00000OOOOOOOO.O00000000000O(),
         o00000OOOOOOOO.O00000000000O0(),
         var5.O0000000000O(),
         var5.O00000000(4.0F),
         O0000O00000OO.O00000000000O(var6)
      );
      o0000O00OO0O0.O00000000(
         o00000OOOOOOOO.O00000000000OO(),
         o00000OOOOOOOO.O00000000000O(),
         var5.O0000000000O0(),
         var5.O0000000000O(),
         var5.O00000000(4.0F),
         var5.O00000000(16.0F),
         var5.O00000000(4.0F),
         var5.O00000000(4.0F),
         O0000O00000OO.O00000000000O(var6)
      );
      if (var6.O000000000O000()) {
         o0000O00OO0O0.O00000000(
            o00000OOOOOOOO.O000000000000O() + var5.O00000000(0.75F),
            o00000OOOOOOOO.O00000000000O() + var5.O00000000(0.75F),
            o00000OOOOOOOO.O00000000000O0() - var5.O00000000(1.5F),
            var5.O0000000000O() - var5.O00000000(1.5F),
            var5.O00000000(3.5F),
            O0000O00000OO.O000000000(var6, 0.78F),
            var5.O00000000(0.85F)
         );
         o0000O00OO0O0.O00000000(
            o00000OOOOOOOO.O00000000000OO() + var5.O00000000(0.75F),
            o00000OOOOOOOO.O00000000000O() + var5.O00000000(0.75F),
            var5.O0000000000O0() - var5.O00000000(1.5F),
            var5.O0000000000O() - var5.O00000000(1.5F),
            var5.O00000000(3.5F),
            var5.O00000000(15.5F),
            var5.O00000000(3.5F),
            var5.O00000000(3.5F),
            O0000O00000OO.O000000000(var6, 0.78F),
            var5.O00000000(0.85F)
         );
      }

      o0000O00OO0O0.O00000000(
         o00000OOOOOOOO.O00000000000OO(),
         o00000OOOOOOOO.O00000000000O(),
         var5.O0000000000O0(),
         var5.O0000000000O(),
         var5.O00000000(4.0F),
         var5.O00000000(16.0F),
         var5.O00000000(4.0F),
         var5.O00000000(4.0F),
         ColorScheme.O00000000(var6.O00000000000O0(), var6.O0000000000O(), var7)
      );
      if (var7 > 0.01F) {
         o0000O00OO0O0.O00000000(
            o00000OOOOOOOO.O00000000000OO() - var5.O00000000(0.5F),
            o00000OOOOOOOO.O00000000000O() - var5.O00000000(0.5F),
            var5.O0000000000O0() + var5.O00000000(1.0F),
            var5.O0000000000O() + var5.O00000000(1.0F),
            var5.O00000000(4.5F),
            var5.O00000000(16.5F),
            var5.O00000000(4.5F),
            var5.O00000000(4.5F),
            ColorScheme.O00000000(var6.O000000000O0(), Math.round(50.0F * var7)),
            1.0F
         );
      }

      this.O000000000(o0000O00OO0O0, o0000O000O0O0, o00000OOOOOOOO, o0000O000O0OOO);
      this.O00000000000(o0000O00OO0O0, o0000O000O0O0, o00000OOOOOOOO, o0000O000O0OOO);
      this.O0000000000(o0000O00OO0O0, o0000O000O0O0, o00000OOOOOOOO, o0000O000O0OOO);
      this.O00000000(o0000O00OO0O0, o00000OOOOOOOO, o0000O000O0OOO);
      this.O00000000(o0000O00OO0O0, o0000O000O0O0, o00000OOOOOOOO, o0000O000O0OOO, var7);
   }

   public static float O00000000(O0000O00000 o0000O00000) {
      return O000000000(o0000O00000);
   }

   public static float O000000000(O0000O00000 o0000O00000) {
      return O00000000000(o0000O00000);
   }

   public static float O00000000(O00000OOOOOOOO o00000OOOOOOOO, O0000O00000 o0000O00000) {
      float var2 = O0000000000(o00000OOOOOOOO, o0000O00000) - o0000O00000.O00000000(8.0F) - O00000000(o0000O00000);
      return Math.round(Math.max(o00000OOOOOOOO.O000000000000O() + o00000OOOOOOOO.O00000000000O0() * 0.3F, var2));
   }

   public static float O000000000(O00000OOOOOOOO o00000OOOOOOOO, O0000O00000 o0000O00000) {
      return O00000000000(o00000OOOOOOOO, o0000O00000);
   }

   public static float O0000000000(O0000O00000 o0000O00000) {
      return Math.round(o0000O00000.O00000000(92.0F));
   }

   public static float O00000000000(O0000O00000 o0000O00000) {
      return Math.round(Math.max(o0000O00000.O00000000(24.0F), o0000O00000.O0000000000O() - o0000O00000.O00000000(12.0F)));
   }

   public static float O0000000000(O00000OOOOOOOO o00000OOOOOOOO, O0000O00000 o0000O00000) {
      float var2 = o00000OOOOOOOO.O000000000000O()
         + o00000OOOOOOOO.O00000000000O0()
         - o0000O00000.O00000000(16.0F)
         - O000000000000(o0000O00000)
         - o0000O00000.O00000000(10.0F)
         - O0000000000(o0000O00000);
      return Math.round(Math.max(o00000OOOOOOOO.O000000000000O() + o00000OOOOOOOO.O00000000000O0() * 0.48F, var2));
   }

   private static float O000000000000(O0000O00000 o0000O00000) {
      float var1 = O0000O00000OO.O00000000(FontRegistry.O00000000000, O00000000(), 12.0F);
      float var2 = O0000O00000OO.O00000000(FontRegistry.O000000000000, "g", 12.0F);
      return Math.max(o0000O00000.O00000000(86.0F), var1 + o0000O00000.O00000000(8.0F) + var2);
   }

   public static float O00000000000(O00000OOOOOOOO o00000OOOOOOOO, O0000O00000 o0000O00000) {
      return Math.round(o00000OOOOOOOO.O00000000000O() + (o0000O00000.O0000000000O() - O00000000000(o0000O00000)) * 0.5F);
   }

   private void O000000000(RenderManager o0000O00OO0O0, O0000O000O0O0 o0000O000O0O0, O00000OOOOOOOO o00000OOOOOOOO, O0000O000O0OOO o0000O000O0OOO) {
      O0000O00000 var5 = o0000O000O0OOO.O000000000000();
      ColorScheme var6 = o0000O000O0OOO.O0000000000000();
      float var7 = o00000OOOOOOOO.O00000000000O();
      float var8 = var5.O00000000(6.0F);
      float var9 = 12.0F;
      float var10 = var5.O00000000(10.0F);
      float var11 = O0000O00000OO.O00000000(FontRegistry.O00000000, "mintmegaantileak.xyz", var9);
      float var12 = O0000O00000OO.O00000000(FontRegistry.O00000000000O, "k", 8.0F);
      float var13 = var5.O00000000(12.0F);
      String var14 = o0000O000O0O0.O000000O0O0O0() ? "P" : o0000O000O0O0.O00000000OO().O00000000();
      String var15 = o0000O000O0O0.O000000O0O0O0()
         ? "Профиль"
         : (
            o0000O000O0O0.O00000000OO00()
               ? "Диагностика"
               : (o0000O000O0O0.O00000000OO0() ? "AutoBuy" : (o0000O000O0O0.O00000000OO000() ? "Studio" : o0000O000O0O0.O00000000OO().O000000000()))
         );
      float var16 = o00000OOOOOOOO.O000000000000O() + var5.O00000000(16.0F);
      this.O00000000(o0000O00OO0O0, var5, var16, var7, var5.O0000000000O(), var10, var6);
      var16 += var10 + var8;
      O0000O00000OO.O00000000(
         o0000O00OO0O0, var5, FontRegistry.O00000000, var16, var7, var5.O0000000000O(), var9, "mintmegaantileak.xyz", var6.O0000000000OOO()
      );
      var16 += var11 + var8;
      O0000O00000OO.O00000000(
         o0000O00OO0O0, var5, FontRegistry.O00000000000O, var16 + var5.O00000000(1.0F), var7, var5.O0000000000O(), 8.0F, "k", var6.O0000000000OO0()
      );
      var16 += var12 + var8;
      if (o0000O000O0O0.O00000000OO00()) {
         this.O000000000(o0000O00OO0O0, var5, var16 + var13 * 0.5F, var7 + var5.O0000000000O() * 0.5F, var6.O00000000000());
      } else if (o0000O000O0O0.O00000000OO0()) {
         this.O00000000(o0000O00OO0O0, var5, var16 + var13 * 0.5F, var7 + var5.O0000000000O() * 0.5F, var5.O00000000(0.8F), var6.O00000000000());
      } else if (o0000O000O0O0.O00000000OO000()) {
         this.O00000000(
            o0000O00OO0O0,
            var5,
            FontRegistry.O00000000000O,
            "a",
            var16 + var5.O00000000(1.5F),
            var7,
            var5.O0000000000O(),
            var9,
            var13,
            var6.O00000000000(),
            0.0F
         );
      } else if (o0000O000O0O0.O000000O0O0O0()) {
         this.O00000000(o0000O00OO0O0, var5, FontRegistry.O0000000000, var14, var16, var7, var5.O0000000000O(), var9, var13, var6.O00000000000(), 0.0F);
      } else {
         this.O00000000(o0000O00OO0O0, var5, FontRegistry.O00000000000O, var14, var16, var7, var5.O0000000000O(), var9, var13, var6.O00000000000(), 0.0F);
      }

      var16 += var13 + var8;
      O0000O00000OO.O00000000(o0000O00OO0O0, var5, FontRegistry.O00000000000, var16, var7, var5.O0000000000O(), var9, var15, var6.O000000000O());
   }

   private void O00000000(RenderManager o0000O00OO0O0, O00000OOOOOOOO o00000OOOOOOOO, O0000O000O0OOO o0000O000O0OOO) {
      O0000O00000 var4 = o0000O000O0OOO.O000000000000();
      ColorScheme var5 = o0000O000O0OOO.O0000000000000();
      String var6 = O00000000();
      float var7 = O0000O00000OO.O00000000(FontRegistry.O00000000000, var6, 12.0F);
      String var8 = "g";
      float var9 = O0000O00000OO.O00000000(FontRegistry.O000000000000, var8, 12.0F);
      float var10 = o00000OOOOOOOO.O000000000000O() + o00000OOOOOOOO.O00000000000O0() - var4.O00000000(16.0F) - var9;
      float var11 = var10 - var4.O00000000(8.0F) - var7;
      float var12 = o00000OOOOOOOO.O00000000000O();
      O0000O00000OO.O00000000(o0000O00OO0O0, var4, FontRegistry.O00000000000, var11, var12, var4.O0000000000O(), 12.0F, var6, var5.O000000000O());
      O0000O00000OO.O00000000(o0000O00OO0O0, var4, FontRegistry.O000000000000, var10, var12, var4.O0000000000O(), 12.0F, var8, var5.O00000000000());
   }

   private void O0000000000(RenderManager o0000O00OO0O0, O0000O000O0O0 o0000O000O0O0, O00000OOOOOOOO o00000OOOOOOOO, O0000O000O0OOO o0000O000O0OOO) {
      O0000O00000 var5 = o0000O000O0OOO.O000000000000();
      ColorScheme var6 = o0000O000O0OOO.O0000000000000();
      float var7 = O0000000000(o00000OOOOOOOO, var5);
      float var8 = O00000000000(o00000OOOOOOOO, var5);
      float var9 = O0000000000(var5);
      float var10 = O00000000000(var5);
      float var11 = o0000O000O0O0.O00000000(O0000O000O00O0.O000000000O0O());
      float var12 = o0000O000O0O0.O000000O0O0OO() ? 1.0F : 0.0F;
      float var13 = Math.max(var11, var12);
      int var14 = var6.O000000000O000()
         ? ColorScheme.O00000000(O0000O00000OO.O00000000(var6, 0.18F), ColorScheme.O00000000(var6.O000000000O0(), 42), var13 * 0.36F)
         : ColorScheme.O00000000(var6.O00000000000O0(), ColorScheme.O00000000(var6.O000000000O00(), 62), 0.16F + var13 * 0.18F);
      o0000O00OO0O0.O00000000(var7, var8, var9, var10, var5.O00000000(6.0F), var14);
      o0000O00OO0O0.O00000000(
         var7,
         var8,
         var9,
         var10,
         var5.O00000000(6.0F),
         ColorScheme.O00000000(
            var6.O000000000O000() ? O0000O00000OO.O000000000(var6, 0.76F) : var6.O0000000000O(), ColorScheme.O00000000(var6.O000000000O0(), 120), var13
         ),
         Math.max(0.55F, var5.O00000000(0.6F))
      );
      float var15 = 9.5F;
      float var16 = var5.O00000000(15.0F);
      float var17 = O0000O00000OO.O00000000(FontRegistry.O00000000000, "Foundry", var15);
      float var18 = var5.O00000000(7.0F);
      float var19 = var16 + var18 + var17;
      float var20 = Math.round(var7 + (var9 - var19) * 0.5F);
      float var21 = var20 + var16 * 0.5F;
      float var22 = var8 + var10 * 0.5F;
      float var23 = Math.round(var20 + var16 + var18);
      this.O00000000(o0000O00OO0O0, var5, var21, var22, ColorScheme.O00000000(O0000O00000OO.O000000000(var6), var6.O000000000O0(), 0.45F + var13 * 0.35F));
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         var5,
         FontRegistry.O00000000000,
         var23,
         var8,
         var10,
         var15,
         "Foundry",
         ColorScheme.O00000000(O0000O00000OO.O000000000(var6), O0000O00000OO.O00000000(var6), 0.72F + var13 * 0.28F)
      );
      if (O0000O00000OO.O00000000(o0000O000O0O0, var7, var8, var9, var10)) {
         o0000O000O0O0.O00000000("header:foundry", "Foundry", var7 + var9 * 0.5F, var8 + var10 + var5.O00000000(8.0F));
      }
   }

   private void O00000000000(RenderManager o0000O00OO0O0, O0000O000O0O0 o0000O000O0O0, O00000OOOOOOOO o00000OOOOOOOO, O0000O000O0OOO o0000O000O0OOO) {
      if (O00000O0OOO0O0.O00000000()) {
         O0000O00000 var5 = o0000O000O0OOO.O000000000000();
         ColorScheme var6 = o0000O000O0OOO.O0000000000000();
         float var7 = O00000000(o00000OOOOOOOO, var5);
         float var8 = O000000000(o00000OOOOOOOO, var5);
         float var9 = O00000000(var5);
         float var10 = O000000000(var5);
         float var11 = o0000O000O0O0.O00000000(O0000O000O00O0.O000000000O0OO());
         float var12 = o0000O000O0O0.O00000000OO000() ? 1.0F : 0.0F;
         float var13 = Math.max(var11, var12);
         int var14 = var6.O000000000O000()
            ? ColorScheme.O00000000(O0000O00000OO.O00000000(var6, 0.18F), ColorScheme.O00000000(var6.O000000000O0(), 42), var13 * 0.36F)
            : ColorScheme.O00000000(var6.O00000000000O0(), ColorScheme.O00000000(var6.O000000000O00(), 62), 0.16F + var13 * 0.18F);
         o0000O00OO0O0.O00000000(var7, var8, var9, var10, var5.O00000000(6.0F), var14);
         o0000O00OO0O0.O00000000(
            var7,
            var8,
            var9,
            var10,
            var5.O00000000(6.0F),
            ColorScheme.O00000000(
               var6.O000000000O000() ? O0000O00000OO.O000000000(var6, 0.76F) : var6.O0000000000O(), ColorScheme.O00000000(var6.O000000000O0(), 120), var13
            ),
            Math.max(0.55F, var5.O00000000(0.6F))
         );
         this.O00000000(
            o0000O00OO0O0,
            var5,
            FontRegistry.O00000000000O,
            "a",
            var7 + var5.O00000000(2.0F),
            var8,
            var10,
            13.0F,
            var9,
            ColorScheme.O00000000(O0000O00000OO.O000000000(var6), var6.O000000000O0(), 0.5F + var13 * 0.35F),
            0.0F
         );
         if (O0000O00000OO.O00000000(o0000O000O0O0, var7, var8, var9, var10)) {
            o0000O000O0O0.O00000000("header:studio", "Studio", var7 + var9 * 0.5F, var8 + var10 + var5.O00000000(8.0F));
         }
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, O0000O000O0O0 o0000O000O0O0, O00000OOOOOOOO o00000OOOOOOOO, O0000O000O0OOO o0000O000O0OOO, float f) {
      O0000O00000 var6 = o0000O000O0OOO.O000000000000();
      ColorScheme var7 = o0000O000O0OOO.O0000000000000();
      float var8 = o00000OOOOOOOO.O00000000000O();
      String var9 = o0000O000O0O0.O00000000OO0OO();
      float var10 = o0000O000O0O0.O00000000(O0000O000O00O0.O0000000000O());
      float var11 = (float)((Math.sin(System.currentTimeMillis() * 0.006) + 1.0) * 0.5);
      boolean var12 = o0000O000O0O0.O00000000OOO();
      int var13 = ColorScheme.O00000000(var7.O0000000000OOO(), var7.O000000000O(), f);
      float var14 = var6.O00000000(16.0F);
      float var15 = var6.O00000000(27.0F);
      float var16 = var6.O0000000000O0() - var14 - var15;
      float var17 = 0.0F;
      boolean var18 = var9.isEmpty();
      if (!var18) {
         float var19 = O0000O00000OO.O00000000(FontRegistry.O00000000, var9, 12.0F);
         if (var19 > var16) {
            var17 = var16 - var19;
         }
      }

      o0000O00OO0O0.O00000000(
         (int)o00000OOOOOOOO.O00000000000OO(), (int)o00000OOOOOOOO.O00000000000O(), (int)(var6.O0000000000O0() - var15), (int)var6.O0000000000O()
      );
      int var21 = ColorScheme.O00000000(var7.O00000000000(), Math.round(255.0F * var11));
      this.O0000000000000
         .O00000000(
            o0000O00OO0O0,
            var6,
            FontRegistry.O00000000,
            var9,
            o00000OOOOOOOO.O00000000000OO() + var14 + var17,
            var8,
            var6.O0000000000O(),
            12.0F,
            var13,
            var12,
            var21,
            System.currentTimeMillis()
         );
      if (var18 && !var12 && !this.O0000000000000.O00000000()) {
         O0000O00000OO.O00000000(
            o0000O00OO0O0, var6, FontRegistry.O00000000, o00000OOOOOOOO.O00000000000OO() + var14, var8, var6.O0000000000O(), 12.0F, "Search...", var13
         );
      }

      o0000O00OO0O0.O0000000000000();
      float var20 = Math.max(f * 0.3F, var10);
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         var6,
         FontRegistry.O000000000000,
         o00000OOOOOOOO.O00000000000OO() + var6.O0000000000O0() - var6.O00000000(27.0F),
         var8,
         var6.O0000000000O(),
         12.0F,
         "l",
         ColorScheme.O00000000(var7.O00000000000(), Math.round(255.0F * var20))
      );
   }

   private void O00000000(RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, float f, float g, int i) {
      float var6 = o0000O00000.O00000000(0.72F);
      float var7 = 3.1F * var6;
      float var8 = Math.max(1.0F, o0000O00000.O00000000(0.85F));
      float var9 = f - 6.2F * var6;
      float var10 = f + 5.0F * var6;
      float var11 = g - 5.4F * var6;
      float var12 = g + 5.2F * var6;
      int var13 = ColorScheme.O00000000(i, 138);
      o0000O00OO0O0.O00000000(var9 + var7 * 0.5F, var11 + var7 * 0.5F, var10 - var9, var8, var8, var13);
      o0000O00OO0O0.O00000000(var9 + var7 * 0.5F, var12 + var7 * 0.5F, var10 - var9, var8, var8, var13);
      o0000O00OO0O0.O00000000(var9 + var7 * 0.5F, var11 + var7 * 0.5F, var8, var12 - var11, var8, var13);
      o0000O00OO0O0.O00000000(var10 + var7 * 0.5F - var8, var11 + var7 * 0.5F, var8, var12 - var11, var8, var13);
      o0000O00OO0O0.O000000000(var9 + var7 * 0.5F, var11 + var7 * 0.5F, var7, 0.0F, 1.0F, i);
      o0000O00OO0O0.O000000000(var10 + var7 * 0.5F, var11 + var7 * 0.5F, var7, 0.0F, 1.0F, i);
      o0000O00OO0O0.O000000000(var9 + var7 * 0.5F, var12 + var7 * 0.5F, var7, 0.0F, 1.0F, i);
      o0000O00OO0O0.O000000000(var10 + var7 * 0.5F, var12 + var7 * 0.5F, var7, 0.0F, 1.0F, i);
   }

   private void O000000000(RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, float f, float g, int i) {
      float var6 = o0000O00000.O00000000(1.0F);
      float var7 = Math.round(f - 5.5F * var6);
      float var8 = Math.round(g - 5.5F * var6);
      o0000O00OO0O0.O00000000(var7, var8, 11.0F * var6, 11.0F * var6, 3.2F * var6, i, Math.max(0.6F, 0.75F * var6));
      o0000O00OO0O0.O00000000(var7 + 2.6F * var6, var8 + 7.0F * var6, 1.3F * var6, 2.0F * var6, 0.65F * var6, ColorScheme.O00000000(i, 180));
      o0000O00OO0O0.O00000000(var7 + 4.9F * var6, var8 + 5.2F * var6, 1.3F * var6, 3.8F * var6, 0.65F * var6, i);
      o0000O00OO0O0.O00000000(var7 + 7.2F * var6, var8 + 3.0F * var6, 1.3F * var6, 6.0F * var6, 0.65F * var6, ColorScheme.O00000000(i, 220));
   }

   private static String O00000000() {
      MenuModule var0 = MenuModule.O0000000000OO();
      int var1 = var0 != null && var0.O000000000000 != -1 ? var0.O000000000000 : 344;
      return O0000O000OO0O0.O00000000(var1);
   }

   private void O00000000(RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, float f, float g, float h, float i, ColorScheme o0000O000O0OO) {
      float var8 = 9.5F;
      int var9 = ColorScheme.O00000000(o0000O000O0OO.O0000000000OOO(), o0000O000O0OO.O000000000O0(), 0.34F);
      this.O00000000(o0000O00OO0O0, o0000O00000, FontRegistry.O00000000000O, "W", f, g, h, var8, i, ColorScheme.O00000000(var9, 220), -0.45F);
   }

   private void O00000000(
      RenderManager o0000O00OO0O0,
      O0000O00000 o0000O00000,
      FontObject o0000O0O00O00O,
      String string,
      float f,
      float g,
      float h,
      float i,
      float j,
      int k,
      float l
   ) {
      float var12 = O0000O00000OO.O00000000(o0000O0O00O00O, string, i);
      float var13 = f + (j - var12) * 0.5F;
      float var14 = O0000O00000OO.O00000000(o0000O00000, o0000O0O00O00O, g, h, i) + o0000O00000.O00000000(l);
      O0000O00000OO.O00000000(o0000O00OO0O0, o0000O00000, o0000O0O00O00O, var13, var14, i, string, k);
   }

   private void O00000000(RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, float f, float g, float h, int i) {
      float var7 = o0000O00000.O00000000(0.75F);
      o0000O00OO0O0.O00000000(f - 7.0F * var7, g - 6.0F * var7, 2.5F * var7, h * 1.5F, h, i);
      o0000O00OO0O0.O00000000(f - 4.8F * var7, g - 4.6F * var7, 11.0F * var7, h * 1.5F, h, i);
      o0000O00OO0O0.O00000000(f - 3.6F * var7, g - 3.1F * var7, 8.5F * var7, 6.0F * var7, o0000O00000.O00000000(1.5F), ColorScheme.O00000000(i, 128));
      o0000O00OO0O0.O00000000(f - 2.8F * var7, g + 3.0F * var7, 9.2F * var7, h * 1.4F, h, i);
      o0000O00OO0O0.O000000000(f - 2.2F * var7, g + 6.3F * var7, 1.7F * var7, 0.0F, 1.0F, i);
      o0000O00OO0O0.O000000000(f + 5.0F * var7, g + 6.3F * var7, 1.7F * var7, 0.0F, 1.0F, i);
   }
}
