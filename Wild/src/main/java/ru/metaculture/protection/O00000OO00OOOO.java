package ru.metaculture.protection;

import java.awt.Color;
import java.util.HashMap;

public class O00000OO00OOOO {
   public static O0000O00O0OO O00000000 = new O0000O00O0OO();
   public static HashMap<String, Float> O000000000 = new HashMap<>();
   public static HashMap<String, Float> O0000000000 = new HashMap<>();
   public static HashMap<String, Float> O00000000000 = new HashMap<>();

   public static float O00000000(RenderManager o0000O00OO0O0, Setting o0000000OOO00O) {
      if (o0000000OOO00O instanceof O000000O0) {
         return ((O000000O0)o0000000OOO00O).O0000000000();
      } else if (o0000000OOO00O instanceof BooleanSetting) {
         return 10.0F;
      } else if (o0000000OOO00O instanceof NumberSetting) {
         return 19.0F;
      } else if (o0000000OOO00O instanceof ModeSetting var15) {
         float var16 = 105.47F;
         float var17 = 2.0F;
         float var18 = 10.075F;
         float var19 = 3.0F;
         float var20 = -2.0F;
         float var21 = var19;
         float var22 = 0.0F;

         for (String var24 : var15.O00000000000) {
            float var25 = RenderManager.O00000000(FontRegistry.O00000000, var24, 12.0F).O00000000 + var19 * 2.0F;
            if (var21 + var25 > var16 && var21 > var19) {
               var21 = var19;
               var22 += var18 + var20;
            }

            var21 += var25 + var17;
         }

         return var22 + var18 + 12.0F;
      } else if (o0000000OOO00O instanceof KeybindSetting) {
         return 13.0F;
      } else if (o0000000OOO00O instanceof TextSetting) {
         return 15.0F;
      } else if (o0000000OOO00O instanceof ColorSetting) {
         return 15.0F;
      } else if (o0000000OOO00O instanceof GroupSetting var2) {
         float var3 = 0.0F;
         float var4 = 10.0F;
         float var5 = 0.0F;
         float var6 = var4;
         float var7 = 3.0F;
         float var8 = 10.0F;
         float var9 = 4.0F;
         float var10 = 105.47F;

         for (BooleanSetting var12 : var2.O00000000000) {
            float var13 = RenderManager.O00000000(FontRegistry.O00000000, var12.O00000000, 12.0F).O00000000;
            float var14 = var13 + var9 * 2.0F;
            if (var5 + var14 > 0.0F + var10) {
               var5 = 0.0F;
               var6 += var8 + var7;
            }

            var5 += var14 + var7;
         }

         return var6 - 0.0F + var8;
      } else {
         return 15.0F;
      }
   }

   public static float O00000000(
      RenderManager o0000O00OO0O0, Setting o0000000OOO00O, float f, float g, float h, int i, int j, int k, int l, int m, int n, int o, float p
   ) {
      float var13 = 0.0F;
      if (o0000000OOO00O instanceof O000000O0) {
         var13 = ((O000000O0)o0000000OOO00O).O0000000000();
      } else if (o0000000OOO00O instanceof BooleanSetting var14) {
         boolean var15 = var14.O0000000000();
         float var16 = 8.0F;
         float var17 = f + h - var16 - 3.0F;
         float var18 = g + 2.0F;
         var14.O000000000000.O00000000();
         var14.O000000000000.O00000000(var15 ? 1.0 : 0.0, 0.15F, O0000O00O0OO0O.O000000000O00);
         o0000O00OO0O0.O00000000(var17, var18, var16, var16, 3.0F, k, 0.1F);
         o0000O00OO0O0.O00000000(var17, var18, var16, var16, 3.0F, m);
         o0000O00OO0O0.O00000000(var17 + 2.3F, var18 + 2.2F, 3.42F, 3.425F, 3.0F, O0000O000OO000.O000000000000(0, l, var14.O000000000000.O000000000000()));
         o0000O00OO0O0.O00000000(FontRegistry.O00000000, f, g + 3.0F + 5.0F, 13.0F, o0000000OOO00O.O00000000, n);
         var13 = 10.0F;
      } else if (o0000000OOO00O instanceof NumberSetting var41) {
         float var47 = 4.0F;
         float var54 = g + 10.0F;
         float var61 = h - 2.5F;
         O0000O00OOOOOO var67 = O00000OO000O0O.O00000000(var41);
         float var19 = (var41.O00000000000 - var41.O000000000000) / (var41.O0000000000000 - var41.O000000000000);
         double var20 = var67.O00000000000OO();
         var67.O00000000();
         var67.O00000000(var19, 0.24F, O0000O0O00.O0000000000O0O);
         float var22 = (float)var67.O0000000000O();
         float var23 = var61 * var22;
         o0000O00OO0O0.O00000000(f, var54 + 2.0F, var61, var47, 2.0F, k, 0.3F);
         o0000O00OO0O0.O00000000(f, var54 + 2.0F, var61, var47, 2.0F, m);
         o0000O00OO0O0.O00000000(f + 1.0F, var54 + 2.5F, var23 - 2.0F, var47 - 1.0F, 2.0F, l);
         o0000O00OO0O0.O00000000(f + 1.0F + var23 - 5.0F + (var23 == 0.0F ? 5 : 2), var54 + 2.2F, 5.0F, 3.88F, 2.0F, o);
         String var24 = var41.O00000000000OO
            ? String.format("%.1f%%", var41.O00000000000)
            : String.format("%.1f / %.1f", var41.O00000000000, var41.O0000000000000);
         o0000O00OO0O0.O00000000(FontRegistry.O00000000, f, g + 1.0F + 7.0F, 13.0F, o0000000OOO00O.O00000000, n);
         o0000O00OO0O0.O00000000(
            FontRegistry.O00000000, f + var61 - RenderManager.O00000000(FontRegistry.O00000000, var24, 13.0F).O00000000 - 2.0F, g + 7.0F, 13.0F, var24, l
         );
         var13 = 19.0F;
      } else if (o0000000OOO00O instanceof ModeSetting var42) {
         for (String var55 : var42.O00000000000) {
            O000000000.putIfAbsent(var55, 0.0F);
         }

         o0000O00OO0O0.O00000000(FontRegistry.O00000000, f, g + 7.0F, 13.0F, o0000000OOO00O.O00000000, n);
         float var49 = 2.0F;
         float var56 = 10.075F;
         float var62 = 3.0F;
         float var68 = -2.0F;
         float var72 = var62;
         float var77 = 0.0F;

         for (String var87 : var42.O00000000000) {
            float var93 = RenderManager.O00000000(FontRegistry.O00000000, var87, 12.0F).O00000000 + var62 * 2.0F;
            if (var72 + var93 > h && var72 > var62) {
               var72 = var62;
               var77 += var56 + var68;
            }

            var72 += var93 + var49;
         }

         float var82 = g + 10.0F;
         float var88 = var77 + var56;
         o0000O00OO0O0.O00000000(f, var82, h, var88, 3.0F, k, 0.1F);
         o0000O00OO0O0.O00000000(f, var82, h, var88, 3.0F, m);
         float var94 = var62;
         float var99 = 1.5F;

         for (String var26 : var42.O00000000000) {
            boolean var27 = var26.equals(var42.O000000000000);
            float var28 = RenderManager.O00000000(FontRegistry.O00000000, var26, 12.0F).O00000000 + var62 * 2.0F;
            if (var94 + var28 > h && var94 > var62) {
               var94 = var62;
               var99 += var56 + var68;
            }

            float var29 = O000000000.get(var26);
            float var30 = var27 ? 1.0F : 0.0F;
            var29 = O0000O00OOO000.O00000000(var29, var30, 10.0F);
            O000000000.put(var26, var29);
            int var32 = O0000O000OO000.O000000000000(n, l, var29);
            o0000O00OO0O0.O00000000(FontRegistry.O00000000, f + var94, var82 + var99 + 5.5F, 12.0F, var26, var32);
            var94 += var28 + var49;
         }

         var13 = var88 + 12.0F;
      } else if (o0000000OOO00O instanceof KeybindSetting var43) {
         float var50 = 10.075F;
         String var57 = o0000000OOO00O.O00000000 != null && !o0000000OOO00O.O00000000.isEmpty() ? o0000000OOO00O.O00000000 : "KEY";
         String var63 = var43.O000000000000O ? "..." : O0000O0O00OO0O.O000000000(var43.O00000000000);
         float var69 = RenderManager.O00000000(FontRegistry.O00000000, var63, 12.0F).O00000000;
         float var73 = 16.055F;
         float var78 = Math.max(var73, var69 + 8.0F);
         float var83 = f + h - var78 - 2.0F;
         if (var83 < f) {
            var83 = f;
            var78 = h - 2.0F;
         }

         o0000O00OO0O0.O00000000(FontRegistry.O00000000, f, g + 1.0F + 6.8F, 13.0F, var57, n);
         float var89 = var83 - 6.0F;
         float var95 = var78 + 2.0F;
         if (var89 < f) {
            var95 = var89 + var95 - f;
            var89 = f;
         }

         o0000O00OO0O0.O00000000(var89, g, var95, var50, 3.0F, k, 0.1F);
         o0000O00OO0O0.O00000000(var89, g, var95, var50, 3.0F, m);
         o0000O00OO0O0.O00000000(FontRegistry.O00000000, var89 + var95 / 2.0F - var69 / 2.0F, g + 1.5F + 5.7F, 12.0F, var63, var43.O000000000000O ? l : n);
         var13 = 13.0F;
      } else if (o0000000OOO00O instanceof TextSetting var44) {
         float var51 = 10.075F;
         float var58 = 63.56F;
         float var64 = f + 42.0F;
         float var74 = var64 + 5.0F;
         float var79 = g + 1.5F;
         o0000O00OO0O0.O00000000(FontRegistry.O00000000, f, g + 1.0F + 6.5F, 13.0F, o0000000OOO00O.O00000000, n);
         o0000O00OO0O0.O00000000(var64, g, var58, var51, 3.0F, k, 0.1F);
         o0000O00OO0O0.O00000000(var64, g, var58 - 10.0F, var51, 3.0F, m);
         String var84 = var44.O000000000000;
         boolean var90 = var84.isEmpty();
         float var96 = var74;
         if (var90) {
            o0000O00OO0O0.O00000000(FontRegistry.O00000000, var74 - 2.0F, var79 - 0.5F + 6.1F, 12.0F, "Enter text", n);
         } else {
            float var100 = var74;
            float var105 = var64 + var58 - 5.0F;
            float var109 = var74;
            float var113 = var64 + var58 - 5.0F;

            for (int var117 = 0; var117 < var84.length(); var117++) {
               char var120 = var84.charAt(var117);
               String var122 = String.valueOf(var120);
               float var31 = RenderManager.O00000000(FontRegistry.O00000000, var122, 12.0F).O00000000;
               if (var100 + var31 > var105) {
                  var96 = var100;
                  break;
               }

               o = n;
               if (var117 >= 16) {
                  float var123 = var109 + RenderManager.O00000000(FontRegistry.O00000000, var84.substring(0, 16), 12.0F).O00000000;
                  float var33 = Math.min(30.0F, var113 - var123);
                  if (var33 > 0.0F) {
                     float var34 = (var100 - var123) / var33;
                     var34 = O0000O00OO0OO0.O00000000000OO(var34, 0.0F, 1.0F);
                     int var35 = n >> 24 & 0xFF;
                     var35 = (int)(var35 * (1.0F - var34));
                     o = RenderManager.W382.O0000000000O(n, var35);
                  } else {
                     o = RenderManager.W382.O0000000000O(n, 0);
                  }
               }

               o0000O00OO0O0.O00000000(FontRegistry.O00000000, var100 - 2.0F, var79 - 0.5F + 6.1F, 12.0F, var122, o);
               var100 += var31;
               var96 = var100;
            }
         }

         boolean var101 = O00000OO000O0O.O000000000O00O == var44 && var44.O00000000000O;
         if (var101) {
            long var106 = System.currentTimeMillis();
            boolean var114 = var106 / 500L % 2L == 0L;
            if (var114) {
               o0000O00OO0O0.O00000000(var96 - 3.0F, var79 - 0.5F, 1.0F, 8.0F, 0.5F, l);
            }
         }

         var13 = 15.0F;
      } else if (o0000000OOO00O instanceof ColorSetting var45) {
         float var52 = 12.0F;
         float var59 = 40.0F;
         float var65 = f + h - var59 - 2.0F;
         o0000O00OO0O0.O00000000(FontRegistry.O00000000, f, g + 1.0F + 7.0F, 13.0F, o0000000OOO00O.O00000000, n);
         Color var70 = var45.O0000000000();
         o0000O00OO0O0.O00000000(var65 - 10.0F, g, 46.48F, 10.075F, 3.0F, k, 0.1F);
         o0000O00OO0O0.O00000000(var65 - 10.0F, g, 46.48F, 10.075F, 3.0F, m);
         float var75 = var65 + 22.0F;
         float var80 = g + 0.8F;
         float var85 = 13.285F;
         float var91 = 8.315F;
         int var97 = Math.round(var45.O0000000000OO * p * 255.0F) << 24 | var70.getRed() << 16 | var70.getGreen() << 8 | var70.getBlue();
         o0000O00OO0O0.O00000000(var75, var80, var85, var91, 0.0F, 3.0F, 3.0F, 0.0F);

         try {
            boolean var102 = false;

            for (float var107 = var80; var107 < var80 + var91; var107 += 3.0F) {
               boolean var110 = var102;
               float var115 = Math.min(3.0F, var80 + var91 - var107);

               for (float var118 = var75; var118 < var75 + var85; var118 += 3.0F) {
                  float var121 = Math.min(3.0F, var75 + var85 - var118);
                  o0000O00OO0O0.O00000000(var118, var107, var121, var115, O0000O000OO000.O0000000000(var110 ? -12762550 : -14407632, p * 0.8F));
                  var110 = !var110;
               }

               var102 = !var102;
            }

            o0000O00OO0O0.O00000000(var75, var80, var85, var91, 0.0F, 3.0F, 3.0F, 0.0F, var97);
            o0000O00OO0O0.O000000000(var75, var80, var85, var91 * 0.55F, 0.0F, 3.0F, 0.0F, 0.0F, O0000O000OO000.O0000000000(-1, p * 0.28F), 0);
         } finally {
            o0000O00OO0O0.O0000000000000();
         }

         o0000O00OO0O0.O00000000(var75, var80, var85, var91, 0.0F, 3.0F, 3.0F, 0.0F, O0000O000OO000.O0000000000(-1, p * 0.4F), 0.5F);
         String var103 = String.format("#%02X%02X%02X", var70.getRed(), var70.getGreen(), var70.getBlue());
         o0000O00OO0O0.O00000000(
            FontRegistry.O00000000,
            var65 + var59 / 2.0F - RenderManager.O00000000(FontRegistry.O00000000, var103, 12.0F).O00000000 / 2.0F - 14.0F,
            g + 1.5F + 5.7F,
            12.0F,
            var103,
            n
         );
         var13 = 15.0F;
      } else if (o0000000OOO00O instanceof GroupSetting var46) {
         o0000O00OO0O0.O00000000(FontRegistry.O00000000, f, g + 7.0F, 13.0F, o0000000OOO00O.O00000000, n);
         float var53 = g + 10.0F;
         float var60 = f;
         float var66 = var53;
         float var71 = 3.0F;
         float var76 = 10.0F;
         float var81 = 4.0F;

         for (BooleanSetting var92 : var46.O00000000000) {
            float var98 = RenderManager.O00000000(FontRegistry.O00000000, var92.O00000000, 12.0F).O00000000;
            float var104 = var98 + var81 * 2.0F;
            if (var60 + var104 > f + h) {
               var60 = f;
               var66 += var76 + var71;
            }

            o0000O00OO0O0.O00000000(var60, var66, var104, var76, 3.0F, k, 0.1F);
            o0000O00OO0O0.O00000000(var60, var66, var104, var76, 3.0F, m);
            String var108 = o0000000OOO00O.O00000000 + "_" + var92.O00000000;
            O00000000000.putIfAbsent(var108, var92.O0000000000() ? 1.0F : 0.0F);
            float var111 = O00000000000.get(var108);
            float var116 = var92.O0000000000() ? 1.0F : 0.0F;
            var111 = O0000O00OOO000.O00000000(var111, var116, 10.0F);
            O00000000000.put(var108, var111);
            o = O0000O000OO000.O000000000000(n, l, var111);
            o0000O00OO0O0.O00000000(FontRegistry.O00000000, var60 + var81, var66 + 3.0F - 1.0F + 5.0F, 12.0F, var92.O00000000, o);
            var60 += var104 + var71;
         }

         var13 = var66 - g + var76;
      }

      return var13 + 1.0F;
   }
}
