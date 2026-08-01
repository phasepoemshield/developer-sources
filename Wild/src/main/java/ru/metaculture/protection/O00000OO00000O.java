package ru.metaculture.protection;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

final class O00000OO00000O {
   private static final float O00000000 = 12.0F;
   private static final float O000000000 = 10.0F;
   private static final float O0000000000 = 4.0F;
   private static final float O00000000000 = 12.0F;
   private static final float O000000000000 = 10.0F;
   private static final float O0000000000000 = 3.0F;
   private static final float O000000000000O = 8.0F;
   private static final float O00000000000O = 13.0F;
   private static final float O00000000000O0 = 4.0F;
   private static final float O00000000000OO = 5.0F;
   private static final Map<String, Float> O0000000000O = new HashMap<>();
   private static final Map<String, Float> O0000000000O0 = new HashMap<>();
   private static final Map<String, Float> O0000000000O00 = new HashMap<>();

   private O00000OO00000O() {
   }

   static float O00000000(RenderManager o0000O00OO0O0, Setting o0000000OOO00O, float f) {
      if (o0000000OOO00O instanceof O000000O0) {
         return ((O000000O0)o0000000OOO00O).O0000000000();
      } else if (o0000000OOO00O instanceof BooleanSetting) {
         return 13.0F;
      } else if (o0000000OOO00O instanceof ButtonSetting) {
         return 14.0F;
      } else if (o0000000OOO00O instanceof NumberSetting) {
         return 22.0F;
      } else if (o0000000OOO00O instanceof ModeSetting var5) {
         float var6 = O00000000(o0000O00OO0O0, var5.O00000000000.toArray(new String[0]), f);
         return 10.0F + var6 * 15.0F;
      } else if (o0000000OOO00O instanceof KeybindSetting) {
         return 12.0F;
      } else if (o0000000OOO00O instanceof TextSetting) {
         return 14.0F;
      } else if (o0000000OOO00O instanceof ColorSetting) {
         return 14.0F;
      } else if (o0000000OOO00O instanceof GroupSetting var3) {
         float var4 = O00000000(o0000O00OO0O0, var3.O00000000000.stream().map(o0000000OOO0O0 -> o0000000OOO0O0.O00000000).toArray(String[]::new), f);
         return 10.0F + var4 * 15.0F;
      } else {
         return 12.0F;
      }
   }

   static float O00000000(RenderManager o0000O00OO0O0, Iterable<Setting> iterable, float f) {
      float var3 = 0.0F;

      for (Setting var5 : iterable) {
         if (var5 != null && !var5.O000000000.get()) {
            var3 += O00000000(o0000O00OO0O0, var5, f) + 4.0F;
         }
      }

      return Math.max(0.0F, var3 - 4.0F);
   }

   static float O00000000(
      RenderManager o0000O00OO0O0, Setting o0000000OOO00O, float f, float g, float h, int i, int j, float k, int l, int m, int n, int o, int p
   ) {
      if (k <= 0.01F) {
         return 0.0F;
      } else if (o0000000OOO00O instanceof O000000O0) {
         return ((O000000O0)o0000000OOO00O).O0000000000();
      } else if (o0000000OOO00O instanceof BooleanSetting var33) {
         float var40 = f + h - 8.0F;
         float var47 = g + 2.0F;
         o0000O00OO0O0.O00000000(var40, var47, 8.0F, 8.0F, 2.5F, l, 0.4F);
         o0000O00OO0O0.O00000000(var40, var47, 8.0F, 8.0F, 2.5F, p);
         if (var33.O0000000000()) {
            o0000O00OO0O0.O00000000(var40 + 2.0F, var47 + 2.0F, 4.0F, 4.0F, 2.0F, m);
         }

         O00000000(
            o0000O00OO0O0,
            o0000000OOO00O.O00000000,
            f,
            g + 2.0F + 6.5F,
            12.0F,
            o,
            f,
            g + 1.0F,
            Math.max(12.0F, var40 - f - 4.0F),
            11.0F,
            O0000O00OO0OO0.O00000000(i, j, f, g, h, 13.0F)
         );
         return 13.0F;
      } else if (o0000000OOO00O instanceof NumberSetting var32) {
         float var39 = g + 12.0F;
         float var46 = f + 4.0F;
         float var55 = h - 8.0F;
         float var61 = var32.O000000000000;
         float var64 = var32.O0000000000000;
         float var67 = O0000O00OO0OO0.O00000000000OO(var32.O00000000000, var61, var64);
         float var71 = var64 - var61 > 1.0E-5F ? (var67 - var61) / (var64 - var61) : 0.0F;
         O0000O00OOOOOO var74 = O00000OO000O0O.O00000000(var32);
         var74.O00000000();
         var74.O00000000(var71, 0.18F, O0000O0O00.O0000000000O0O, true);
         float var76 = var74.O000000000000();
         float var77 = var55 * var76;
         String var24 = O00000000(var67, var32.O00000000000OO);
         float var25 = RenderManager.O00000000(FontRegistry.O00000000, var24, 10.0F).O00000000;
         O00000000(
            o0000O00OO0O0,
            o0000000OOO00O.O00000000,
            f,
            g + 2.0F + 6.5F,
            12.0F,
            o,
            f,
            g + 1.0F,
            Math.max(12.0F, h - var25 - 10.0F),
            11.0F,
            O0000O00OO0OO0.O00000000(i, j, f, g, h, 22.0F)
         );
         o0000O00OO0O0.O00000000(var46, var39, var55, 4.0F, 2.0F, p);
         if (var77 > 0.5F) {
            o0000O00OO0O0.O00000000(var46, var39, var77, 4.0F, 2.0F, m);
         }

         float var26 = var46 + var77 - 2.5F;
         o0000O00OO0O0.O00000000(var26, var39 - 0.5F, 5.0F, 5.0F, 2.0F, o);
         o0000O00OO0O0.O00000000(FontRegistry.O00000000, f + h - var25, g + 2.0F + 6.5F, 10.0F, var24, n);
         return 22.0F;
      } else if (o0000000OOO00O instanceof ButtonSetting var31) {
         String var38 = var31.O000000000000();
         float var45 = RenderManager.O00000000(FontRegistry.O00000000, var38, 10.0F).O00000000;
         float var54 = Math.max(32.0F, var45 + 12.0F);
         float var60 = f + h - var54;
         O00000000(
            o0000O00OO0O0,
            o0000000OOO00O.O00000000,
            f,
            g + 2.0F + 6.5F,
            12.0F,
            o,
            f,
            g + 1.0F,
            Math.max(12.0F, var60 - f - 4.0F),
            11.0F,
            O0000O00OO0OO0.O00000000(i, j, f, g, h, 14.0F)
         );
         o0000O00OO0O0.O00000000(var60, g + 1.0F, var54, 11.0F, 3.0F, l, 0.4F);
         o0000O00OO0O0.O00000000(var60, g + 1.0F, var54, 11.0F, 3.0F, p);
         o0000O00OO0O0.O00000000(FontRegistry.O00000000, var60 + var54 * 0.5F - var45 * 0.5F, g + 2.0F + 6.5F, 10.0F, var38, n);
         return 14.0F;
      } else if (o0000000OOO00O instanceof ModeSetting var30) {
         O00000000(o0000O00OO0O0, o0000000OOO00O.O00000000, f, g + 2.0F + 6.5F, 12.0F, o, f, g + 1.0F, h, 11.0F, O0000O00OO0OO0.O00000000(i, j, f, g, h, 14.0F));
         float var37 = f;
         float var44 = g + 12.0F;

         for (String var59 : var30.O00000000000) {
            float var63 = RenderManager.O00000000(FontRegistry.O00000000, var59, 10.0F).O00000000 + 20.0F;
            if (var37 + var63 > f + h && var37 > f) {
               var37 = f;
               var44 += 15.0F;
            }

            boolean var66 = var59.equals(var30.O000000000000);
            String var70 = o0000000OOO00O.O00000000 + ":" + var59;
            O0000000000O.putIfAbsent(var70, var66 ? 1.0F : 0.0F);
            float var72 = O0000000000O.get(var70);
            var72 = O0000O00OOO000.O00000000(var72, var66 ? 1.0F : 0.0F, 10.0F);
            O0000000000O.put(var70, var72);
            int var75 = O0000O000OO000.O000000000000(p, m, var72 * 0.45F);
            int var23 = O0000O000OO000.O000000000000(n, o, var72);
            o0000O00OO0O0.O00000000(var37, var44, var63, 12.0F, 3.0F, l, 0.4F);
            o0000O00OO0O0.O00000000(var37, var44, var63, 12.0F, 3.0F, var75);
            o0000O00OO0O0.O00000000(FontRegistry.O00000000, var37 + 10.0F, var44 + 2.0F + 5.5F, 10.0F, var59, var23);
            var37 += var63 + 3.0F;
         }

         float var53 = O00000000(o0000O00OO0O0, var30.O00000000000.toArray(new String[0]), h);
         return 10.0F + var53 * 15.0F;
      } else if (o0000000OOO00O instanceof KeybindSetting var29) {
         String var36 = var29.O000000000000O ? "..." : O0000O0O00OO0O.O000000000(var29.O00000000000);
         float var43 = RenderManager.O00000000(FontRegistry.O00000000, var36, 10.0F).O00000000;
         float var51 = Math.max(22.0F, var43 + 8.0F);
         float var58 = f + h - var51;
         O00000000(
            o0000O00OO0O0,
            o0000000OOO00O.O00000000,
            f,
            g + 2.0F + 6.5F,
            12.0F,
            o,
            f,
            g + 1.0F,
            Math.max(12.0F, var58 - f - 4.0F),
            11.0F,
            O0000O00OO0OO0.O00000000(i, j, f, g, h, 12.0F)
         );
         o0000O00OO0O0.O00000000(var58, g + 1.0F, var51, 11.0F, 3.0F, l, 0.4F);
         o0000O00OO0O0.O00000000(var58, g + 1.0F, var51, 11.0F, 3.0F, p);
         o0000O00OO0O0.O00000000(FontRegistry.O00000000, var58 + var51 * 0.5F - var43 * 0.5F, g + 2.0F + 6.5F, 10.0F, var36, var29.O000000000000O ? m : n);
         return 12.0F;
      } else if (o0000000OOO00O instanceof TextSetting var28) {
         float var35 = h * 0.35F;
         float var42 = f + h - var35;
         float var50 = g + 1.0F;
         O00000000(
            o0000O00OO0O0,
            o0000000OOO00O.O00000000,
            f,
            g + 2.0F + 6.5F,
            12.0F,
            o,
            f,
            g + 1.0F,
            Math.max(12.0F, var42 - f - 4.0F),
            11.0F,
            O0000O00OO0OO0.O00000000(i, j, f, g, h, 14.0F)
         );
         o0000O00OO0O0.O00000000(var42, var50, var35, 11.0F, 3.0F, l, 0.4F);
         o0000O00OO0O0.O00000000(var42, var50, var35, 11.0F, 3.0F, p);
         String var57 = var28.O000000000000 == null ? "" : var28.O000000000000;
         if (!var57.isEmpty()) {
            o0000O00OO0O0.O00000000(FontRegistry.O00000000, var42 + 4.0F, var50 + 2.0F + 5.5F, 10.0F, var57, o);
         }

         return 14.0F;
      } else if (o0000000OOO00O instanceof ColorSetting var27) {
         float var34 = 36.0F;
         float var41 = 11.0F;
         float var49 = f + h - var34;
         float var56 = g + 1.5F;
         int var62 = var27.O00000000000O();
         O00000000(
            o0000O00OO0O0,
            o0000000OOO00O.O00000000,
            f,
            g + 2.0F + 6.5F,
            12.0F,
            o,
            f,
            g + 1.0F,
            Math.max(12.0F, var49 - f - 6.0F),
            11.0F,
            O0000O00OO0OO0.O00000000(i, j, f, g, h, 14.0F)
         );
         o0000O00OO0O0.O00000000(var49, var56, var34, var41, 3.0F, l, 0.4F);
         o0000O00OO0O0.O00000000(var49, var56, var34, var41, 3.0F, p);
         o0000O00OO0O0.O00000000(var49 + 2.0F, var56 + 2.0F, var34 - 4.0F, var41 - 4.0F, 2.0F, RenderManager.W382.O0000000000O(var62, (int)(255.0F * k)));
         String var65 = String.format("#%02X%02X%02X", O0000O000OO000.O000000000(var62), O0000O000OO000.O0000000000(var62), O0000O000OO000.O00000000000(var62));
         float var69 = RenderManager.O00000000(FontRegistry.O00000000, var65, 10.0F).O00000000;
         o0000O00OO0O0.O00000000(FontRegistry.O00000000, var49 - var69 - 4.0F, g + 2.0F + 6.5F, 10.0F, var65, n);
         return 14.0F;
      } else if (o0000000OOO00O instanceof GroupSetting var13) {
         O00000000(o0000O00OO0O0, o0000000OOO00O.O00000000, f, g + 2.0F + 6.5F, 12.0F, o, f, g + 1.0F, h, 11.0F, O0000O00OO0OO0.O00000000(i, j, f, g, h, 14.0F));
         float var14 = f;
         float var15 = g + 12.0F;

         for (BooleanSetting var17 : var13.O00000000000) {
            float var18 = RenderManager.O00000000(FontRegistry.O00000000, var17.O00000000, 10.0F).O00000000 + 20.0F;
            if (var14 + var18 > f + h && var14 > f) {
               var14 = f;
               var15 += 15.0F;
            }

            String var19 = o0000000OOO00O.O00000000 + ":" + var17.O00000000;
            O0000000000O0.putIfAbsent(var19, var17.O0000000000() ? 1.0F : 0.0F);
            float var20 = O0000000000O0.get(var19);
            var20 = O0000O00OOO000.O00000000(var20, var17.O0000000000() ? 1.0F : 0.0F, 10.0F);
            O0000000000O0.put(var19, var20);
            int var21 = O0000O000OO000.O000000000000(p, m, var20 * 0.45F);
            int var22 = O0000O000OO000.O000000000000(n, o, var20);
            o0000O00OO0O0.O00000000(var14, var15, var18, 12.0F, 3.0F, l, 0.4F);
            o0000O00OO0O0.O00000000(var14, var15, var18, 12.0F, 3.0F, var21);
            o0000O00OO0O0.O00000000(FontRegistry.O00000000, var14 + 10.0F, var15 + 2.0F + 5.5F, 10.0F, var17.O00000000, var22);
            var14 += var18 + 3.0F;
         }

         float var48 = O00000000(o0000O00OO0O0, var13.O00000000000.stream().map(o0000000OOO0O0 -> o0000000OOO0O0.O00000000).toArray(String[]::new), h);
         return 10.0F + var48 * 15.0F;
      } else {
         return 12.0F;
      }
   }

   static boolean O00000000(RenderManager o0000O00OO0O0, Setting o0000000OOO00O, float f, float g, float h, int i, int j, int k) {
      if (o0000000OOO00O instanceof BooleanSetting) {
         float var8 = f + h - 8.0F;
         float var9 = g + 2.0F;
         if (k == 0 && O0000O00OO0OO0.O00000000(i, j, var8, var9, 8.0F, 8.0F)) {
            BooleanSetting var34 = (BooleanSetting)o0000000OOO00O;
            var34.O000000000(!var34.O0000000000());
            O000000000();
            return true;
         }
      }

      if (o0000000OOO00O instanceof NumberSetting) {
         float var14 = g + 12.0F;
         float var21 = f + 4.0F;
         float var10 = h - 8.0F;
         if (k == 0 && O0000O00OO0OO0.O00000000(i, j, var21, var14, var10, 6.0F)) {
            NumberSetting var40 = (NumberSetting)o0000000OOO00O;
            O00000OO000O0O.O000000000O0O = var40;
            O00000OO000O0O.O000000000O0OO = var21;
            O00000OO000O0O.O000000000OO = var14;
            O00000OO000O0O.O000000000OO0 = var10;
            O00000000(var40, i);
            O000000000();
            return true;
         }
      }

      if (o0000000OOO00O instanceof ButtonSetting var15) {
         String var22 = var15.O000000000000();
         float var28 = RenderManager.O00000000(FontRegistry.O00000000, var22, 10.0F).O00000000;
         float var11 = Math.max(32.0F, var28 + 12.0F);
         float var12 = f + h - var11;
         if (k == 0 && O0000O00OO0OO0.O00000000(i, j, var12, g + 1.0F, var11, 11.0F)) {
            var15.O00000000000();
            return true;
         }
      }

      if (o0000000OOO00O instanceof ModeSetting var16) {
         float var23 = f;
         float var29 = g + 12.0F;

         for (String var41 : var16.O00000000000) {
            float var13 = RenderManager.O00000000(FontRegistry.O00000000, var41, 10.0F).O00000000 + 20.0F;
            if (var23 + var13 > f + h && var23 > f) {
               var23 = f;
               var29 += 15.0F;
            }

            if (k == 0 && O0000O00OO0OO0.O00000000(i, j, var23, var29, var13, 12.0F)) {
               var16.O000000000000 = var41;
               var16.O00000000000O = var16.O00000000000.indexOf(var41);
               O000000000();
               return true;
            }

            var23 += var13 + 3.0F;
         }
      }

      if (o0000000OOO00O instanceof KeybindSetting var17) {
         String var24 = var17.O000000000000O ? "..." : O0000O0O00OO0O.O000000000(var17.O00000000000);
         float var30 = RenderManager.O00000000(FontRegistry.O00000000, var24, 10.0F).O00000000;
         float var36 = Math.max(22.0F, var30 + 8.0F);
         float var42 = f + h - var36;
         if (O0000O00OO0OO0.O00000000(i, j, var42, g + 1.0F, var36, 11.0F) && k == 0) {
            if (O00000OO000O0O.O000000000O000 != var17) {
               if (O00000OO000O0O.O000000000O000 != null) {
                  O00000OO000O0O.O000000000O000.O000000000000O = false;
               }

               O00000OO000O0O.O000000000O000 = var17;
               var17.O000000000000O = true;
            }

            return true;
         }
      }

      if (o0000000OOO00O instanceof TextSetting) {
         float var18 = h * 0.55F;
         float var25 = f + h - var18;
         float var31 = g + 1.0F;
         if (k == 0 && O0000O00OO0OO0.O00000000(i, j, var25, var31, var18, 11.0F)) {
            TextSetting var39 = (TextSetting)o0000000OOO00O;
            if (O00000OO000O0O.O000000000O00O != var39) {
               if (O00000OO000O0O.O000000000O00O != null) {
                  O00000OO000O0O.O000000000O00O.O00000000000O = false;
               }

               O00000OO000O0O.O000000000O00O = var39;
               var39.O00000000000O = true;
            }

            return true;
         }
      }

      if (o0000000OOO00O instanceof ColorSetting var19) {
         float var26 = 36.0F;
         float var32 = 11.0F;
         float var37 = f + h - var26;
         float var43 = g + 1.5F;
         if (k == 0 && O0000O00OO0OO0.O00000000(i, j, var37, var43, var26, var32)) {
            O00000000(var19, var37, var43);
            return true;
         }
      }

      if (o0000000OOO00O instanceof GroupSetting var20) {
         float var27 = f;
         float var33 = g + 12.0F;

         for (BooleanSetting var44 : var20.O00000000000) {
            float var45 = RenderManager.O00000000(FontRegistry.O00000000, var44.O00000000, 10.0F).O00000000 + 20.0F;
            if (var27 + var45 > f + h && var27 > f) {
               var27 = f;
               var33 += 15.0F;
            }

            if (k == 0 && O0000O00OO0OO0.O00000000(i, j, var27, var33, var45, 12.0F)) {
               var44.O000000000(!var44.O0000000000());
               O000000000();
               return true;
            }

            var27 += var45 + 3.0F;
         }
      }

      return false;
   }

   static float O00000000() {
      return 4.0F;
   }

   private static float O00000000(RenderManager o0000O00OO0O0, String[] strings, float f) {
      float var3 = 1.0F;
      float var4 = 0.0F;

      for (String var8 : strings) {
         float var9 = RenderManager.O00000000(FontRegistry.O00000000, var8, 10.0F).O00000000 + 20.0F;
         if (var4 + var9 > f && var4 > 0.0F) {
            var3++;
            var4 = 0.0F;
         }

         var4 += var9 + 3.0F;
      }

      return var3;
   }

   private static void O00000000(NumberSetting o000000O000, float f) {
      float var2 = o000000O000.O000000000000;
      float var3 = o000000O000.O0000000000000;
      float var4 = (f - O00000OO000O0O.O000000000O0OO) / O00000OO000O0O.O000000000OO0;
      var4 = O0000O00OO0OO0.O00000000000OO(var4, 0.0F, 1.0F);
      float var5 = var2 + (var3 - var2) * var4;
      float var6 = o000000O000.O000000000000O;
      if (var6 > 1.0E-5F) {
         var5 = Math.round(var5 / var6) * var6;
      }

      o000000O000.O00000000000 = O0000O00OO0OO0.O00000000000OO(var5, var2, var3);
   }

   private static void O00000000(ColorSetting o0000000OOOO0O, float f, float g) {
      if (O00000OO000O0O.O0000000000OO == o0000000OOOO0O) {
         O00000OO000O0O.O0000000000000.O000000000(O0000O00OOO0OO.BACKWARDS);
         O00000OO000O0O.O0000000000OO = null;
         O00000OO000O0O.O0000000000OO0 = 0.0F;
         O00000OO000O0O.O0000000000OOO = 0.0F;
      } else {
         O00000OO000O0O.O0000000000OO = o0000000OOOO0O;
         O00000OO000O0O.O0000000000000.O000000000(O0000O00OOO0OO.FORWARDS);
         float var3 = 160.0F;
         float var4 = 119.0F;
         float var5 = MinecraftAccessor.a_.getWindow().getScaledWidth();
         float var6 = MinecraftAccessor.a_.getWindow().getScaledHeight();
         float var7 = f + 40.0F;
         float var8 = g - 4.0F;
         if (var7 + var3 > var5 - 6.0F) {
            var7 = f - var3 - 6.0F;
         }

         var7 = O0000O00OO0OO0.O00000000000OO(var7, 6.0F, var5 - var3 - 6.0F);
         var8 = O0000O00OO0OO0.O00000000000OO(var8, 6.0F, var6 - var4 - 6.0F);
         O00000OO000O0O.O0000000000OO0 = var7;
         O00000OO000O0O.O0000000000OOO = var8;
      }
   }

   private static String O00000000(float f, boolean bl) {
      if (bl) {
         return String.format("%.1f%%", f);
      } else if (Math.abs(f - Math.round(f)) < 0.001F) {
         return String.format("%.0f", f);
      } else {
         DecimalFormat var2 = new DecimalFormat("#.#");
         return var2.format(f);
      }
   }

   private static void O000000000() {
      if (WildClient.O00000000.O0000000000O00 != null) {
         WildClient.O00000000.O0000000000O00.O0000000000();
      }
   }

   private static void O00000000(RenderManager o0000O00OO0O0, String string, float f, float g, float h, int i, float j, float k, float l, float m, boolean bl) {
      if (string != null && !string.isEmpty() && !(l <= 3.0F) && !(m <= 2.0F)) {
         float var11 = RenderManager.O00000000(FontRegistry.O00000000, string, h).O00000000;
         if (var11 <= l - 1.0F) {
            o0000O00OO0O0.O00000000(FontRegistry.O00000000, f, g, h, string, i);
         } else {
            String var12 = string + "|" + h;
            O0000000000O00.putIfAbsent(var12, 0.0F);
            float var13 = bl ? 1.0F : 0.0F;
            float var14 = O0000O00OOO000.O00000000(O0000000000O00.get(var12), var13, 12.0F);
            O0000000000O00.put(var12, var14);
            float var15 = var11 - l;
            float var16 = (float)((Math.sin(System.currentTimeMillis() * 0.0035) + 1.0) * 0.5);
            float var17 = var15 * var16 * var14;
            o0000O00OO0O0.O00000000(j, k, l, m, 0.0F, 0.0F, 0.0F, 0.0F);
            o0000O00OO0O0.O00000000(FontRegistry.O00000000, f - var17, g, h, string, i);
            o0000O00OO0O0.O0000000000000();
         }
      }
   }
}
