package ru.metaculture.protection;

public final class O00000O0OOOOO0 {
   private static final int O00000000 = -15921388;
   private static final int O000000000 = -15197404;
   private static final int O0000000000 = 12;
   private static final int O00000000000 = -15657957;
   private static final int O000000000000 = -14670802;
   private static final O00000O0OOOO0O O0000000000000 = new O00000O0OOOO0O();
   private static final O00000O0OOOO0O O000000000000O = new O00000O0OOOO0O();

   private O00000O0OOOOO0() {
   }

   public static void O00000000(
      RenderManager o0000O00OO0O0,
      O0000O000O0OOO o0000O000O0OOO,
      float f,
      float g,
      float h,
      float i,
      O00000O0OOO00O o00000O0OOO00O,
      float j,
      float k,
      float l,
      float m
   ) {
      O0000O00000 var11 = o0000O000O0OOO.O000000000000();
      ColorScheme var12 = o0000O000O0OOO.O0000000000000();
      o0000O00OO0O0.O00000000(f, g, h, i, var11.O00000000(10.0F), var11.O00000000(10.0F), var11.O00000000(10.0F), var11.O00000000(10.0F));

      try {
         O00000000(o0000O00OO0O0, f, g, h, i);
         O00000O0OOOO0 var13 = o00000O0OOO00O == null ? null : o00000O0OOO00O.O0000000000O00();
         if (var13 == null) {
            O00000000(o0000O00OO0O0, o0000O000O0OOO, f, g, h, i, o00000O0OOO00O, m);
         } else {
            float var14 = (float)(System.currentTimeMillis() % 100000L) * 0.001F;
            float var15 = Math.max(var13.O0000000000O0(), var13.O0000000000O00());
            float var16 = Math.min(i * 0.82F / var13.O00000000000OO(), h * 0.78F / var15) * Math.max(0.2F, l);
            float var17 = f + h * 0.5F;
            float var18 = g + i * 0.5F + (float)Math.sin(var14 * 1.3F) * var16 * 0.3F;
            float var19 = j + (float)Math.sin(var14 * 0.25F) * 4.0F;
            O0000000000000.O00000000(o0000O00OO0O0, var13, o00000O0OOO00O.O00000000(), var17, var18, var16, var19, k, m, var14, true);
         }
      } finally {
         o0000O00OO0O0.O0000000000();
         o0000O00OO0O0.O0000000000000();
      }

      o0000O00OO0O0.O00000000(f, g, h, i, var11.O00000000(10.0F), ColorScheme.O00000000(var12.O000000000O0(), 96), 0.7F);
   }

   public static void O00000000(RenderManager o0000O00OO0O0, O00000O0OOOO0 o00000O0OOOO0, String string, float f, float g, float h, float i, float j) {
      if (o00000O0OOOO0 != null) {
         float var8 = Math.max(o00000O0OOOO0.O0000000000O0(), o00000O0OOOO0.O0000000000O00());
         float var9 = Math.min(i * 0.8F / o00000O0OOOO0.O00000000000OO(), h * 0.84F / var8);
         float var10 = f + h * 0.5F;
         float var11 = g + i * 0.52F;
         O000000000000O.O00000000(o0000O00OO0O0, o00000O0OOOO0, string, var10, var11, var9, 200.0F, -10.0F, j, 0.0F, false);
      }
   }

   private static void O00000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i) {
      o0000O00OO0O0.O00000000(f, g, h, i, 0.0F, -15921388);
      int var5 = (int)Math.ceil(h / 12.0F);
      int var6 = (int)Math.ceil(i / 12.0F);

      for (int var7 = 0; var7 < var6; var7++) {
         for (int var8 = 0; var8 < var5; var8++) {
            if ((var7 + var8 & 1) != 0) {
               float var9 = f + var8 * 12;
               float var10 = g + var7 * 12;
               float var11 = Math.min(12.0F, f + h - var9);
               float var12 = Math.min(12.0F, g + i - var10);
               if (var11 > 0.0F && var12 > 0.0F) {
                  o0000O00OO0O0.O00000000(var9, var10, var11, var12, 0.0F, -15197404);
               }
            }
         }
      }

      float var13 = g + i * 0.86F;
      o0000O00OO0O0.O00000000(f, var13, h, i - (var13 - g), 0.0F, -15657957);
      o0000O00OO0O0.O00000000(f, var13, h, 1.0F, 0.0F, -14670802);
   }

   private static void O00000000(
      RenderManager o0000O00OO0O0, O0000O000O0OOO o0000O000O0OOO, float f, float g, float h, float i, O00000O0OOO00O o00000O0OOO00O, float j
   ) {
      O0000O00000 var8 = o0000O000O0OOO.O000000000000();
      ColorScheme var9 = o0000O000O0OOO.O0000000000000();
      String var10 = o00000O0OOO00O == null ? "Выберите модель" : "Не удалось загрузить модель";
      String var11 = o00000O0OOO00O == null ? "" : O00000000(o00000O0OOO00O.O0000000000O0());
      float var12 = O0000O00000OO.O00000000(FontRegistry.O00000000, var10, 11.0F);
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         var8,
         FontRegistry.O00000000,
         f + (h - var12) * 0.5F,
         g + i * 0.46F,
         var8.O00000000(14.0F),
         11.0F,
         var10,
         ColorScheme.O00000000(var9.O000000000O(), Math.round(200.0F * j))
      );
      if (!var11.isEmpty()) {
         float var13 = O0000O00000OO.O00000000(FontRegistry.O00000000, var11, 9.0F);
         O0000O00000OO.O00000000(
            o0000O00OO0O0,
            var8,
            FontRegistry.O00000000,
            f + (h - var13) * 0.5F,
            g + i * 0.46F + var8.O00000000(16.0F),
            var8.O00000000(12.0F),
            9.0F,
            var11,
            ColorScheme.O00000000(var9.O000000000O00(), Math.round(180.0F * j))
         );
      }
   }

   private static String O00000000(String string) {
      return string == null ? "" : string;
   }
}
