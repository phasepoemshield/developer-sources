package ru.metaculture.protection;

public class O00000OO00OO0 extends O00000OO000O0O {
   public static boolean O00000000(RenderManager o0000O00OO0O0, Setting o0000000OOO00O, float f, float g, float h, int i, int j, int k) {
      if (o0000000OOO00O instanceof BooleanSetting var8) {
         float var9 = 8.0F;
         float var10 = f + h - var9 - 3.0F;
         float var11 = g + 2.0F;
         if (k == 0 && O00000OO00OOO.O00000000(i, j, var10, var11, var9, var9)) {
            var8.O000000000(!var8.O0000000000());
            if (WildClient.O00000000.O0000000000O00 != null) {
               WildClient.O00000000.O0000000000O00.O0000000000();
            }

            return true;
         }
      }

      if (o0000000OOO00O instanceof KeybindSetting var24) {
         float var31 = 10.075F;
         String var38 = var24.O000000000000O ? "..." : O0000O0O00OO0O.O000000000(var24.O00000000000);
         float var45 = RenderManager.O00000000(FontRegistry.O00000000, var38, 12.0F).O00000000;
         float var12 = 16.055F;
         float var13 = Math.max(var12, var45 + 8.0F);
         float var14 = f + h - var13 - 2.0F;
         if (var14 < f) {
            var14 = f;
            var13 = h - 2.0F;
         }

         float var15 = var14 - 6.0F;
         float var16 = var13 + 2.0F;
         if (var15 < f) {
            var16 = var15 + var16 - f;
            var15 = f;
         }

         if (O00000OO00OOO.O00000000(i, j, var15, g, var16, var31)) {
            if (k == 0) {
               if (O00000OO000O0O.O000000000O000 != var24) {
                  if (O00000OO000O0O.O000000000O000 != null) {
                     O00000OO000O0O.O000000000O000.O000000000000O = false;
                  }

                  O00000OO000O0O.O000000000O000 = var24;
                  var24.O000000000000O = true;
               }

               return true;
            }

            if (O00000OO000O0O.O000000000O000 == var24 && k >= 0 && k <= 8) {
               int var72 = -100 - k;
               var24.O00000000000 = var72;
               var24.O000000000000O = false;
               O00000OO000O0O.O000000000O000 = null;
               if (WildClient.O00000000.O0000000000O00 != null) {
                  WildClient.O00000000.O0000000000O00.O0000000000();
               }

               return true;
            }
         }
      }

      if (o0000000OOO00O instanceof ColorSetting var25) {
         float var32 = 40.0F;
         float var39 = f + h - var32 - 2.0F;
         float var46 = var39 - 10.0F;
         float var54 = 46.48F;
         float var58 = 10.075F;
         if (k == 0 && O00000OO00OOO.O00000000(i, j, var46, g, var54, var58)) {
            if (O00000OO000O0O.O0000000000OO == var25) {
               O00000OO000O0O.O0000000000000.O000000000(O0000O00OOO0OO.BACKWARDS);
               O00000OO000O0O.O0000000000OO = null;
               O00000OO000O0O.O0000000000OO0 = 0.0F;
               O00000OO000O0O.O0000000000OOO = 0.0F;
            } else {
               O00000OO000O0O.O0000000000OO = var25;
               O00000OO000O0O.O0000000000000.O000000000(O0000O00OOO0OO.FORWARDS);
               float[] var66 = O00000OO00OO.O00000000(o0000O00OO0O0, var25);
               if (var66 != null) {
                  O00000OO000O0O.O0000000000OO0 = var66[0];
                  O00000OO000O0O.O0000000000OOO = var66[1];
               }
            }

            return true;
         }

         if (O00000OO000O0O.O0000000000OO == var25 && O00000OO00O0OO.O00000000(i, j, k)) {
            return true;
         }
      }

      if (o0000000OOO00O instanceof NumberSetting var26) {
         float var33 = 4.0F;
         float var40 = g + 10.0F;
         float var47 = h - 2.5F;
         float var55 = var40 + 2.0F;
         if (k == 0 && O00000OO00OOO.O00000000(i, j, f, var55, var47, var33)) {
            O00000OO000O0O.O000000000O0O = var26;
            O00000OO000O0O.O000000000O0OO = f;
            O00000OO000O0O.O000000000OO = var55;
            O00000OO000O0O.O000000000OO0 = var47;
            float var61 = (i - f) / var47;
            var61 = Math.max(0.0F, Math.min(1.0F, var61));
            var26.O00000000000 = var26.O000000000000 + (var26.O0000000000000 - var26.O000000000000) * var61;
            if (WildClient.O00000000.O0000000000O00 != null) {
               WildClient.O00000000.O0000000000O00.O0000000000();
            }

            return true;
         }
      }

      if (o0000000OOO00O instanceof ButtonSetting var27) {
         float var34 = 10.075F;
         float var41 = 60.0F;
         float var48 = f + h - var41 - 2.0F;
         if (k == 0 && O00000OO00OOO.O00000000(i, j, var48, g, var41, var34)) {
            var27.O00000000000();
            return true;
         }
      }

      if (o0000000OOO00O instanceof ModeSetting var28) {
         float var35 = 2.0F;
         float var42 = 10.075F;
         float var49 = 3.0F;
         float var52 = -2.0F;
         float var56 = var49;
         float var59 = 0.0F;

         for (String var67 : var28.O00000000000) {
            float var17 = RenderManager.O00000000(FontRegistry.O00000000, var67, 12.0F).O00000000 + var49 * 2.0F;
            if (var56 + var17 > h && var56 > var49) {
               var56 = var49;
               var59 += var42 + var52;
            }

            var56 += var17 + var35;
         }

         float var64 = g + 10.0F;
         float var69 = var59 + var42;
         if (k == 0 && O00000OO00OOO.O00000000(i, j, f, var64, h, var69)) {
            float var18 = var49;
            float var19 = 1.5F;

            for (String var21 : var28.O00000000000) {
               float var22 = RenderManager.O00000000(FontRegistry.O00000000, var21, 12.0F).O00000000 + var49 * 2.0F;
               if (var18 + var22 > h && var18 > var49) {
                  var18 = var49;
                  var19 += var42 + var52;
               }

               if (O00000OO00OOO.O00000000(i, j, f + var18, var64 + var19, var22, var42)) {
                  var28.O000000000000 = var21;
                  var28.O00000000000O = var28.O00000000000.indexOf(var21);
                  if (WildClient.O00000000.O0000000000O00 != null) {
                     WildClient.O00000000.O0000000000O00.O0000000000();
                  }

                  return true;
               }

               var18 += var22 + var35;
            }
         }
      }

      if (o0000000OOO00O instanceof TextSetting var29) {
         float var36 = 10.075F;
         float var43 = 63.56F;
         float var50 = f + 42.0F;
         if (k == 0 && O00000OO00OOO.O00000000(i, j, var50, g, var43, var36)) {
            if (O00000OO000O0O.O000000000O00O != var29) {
               if (O00000OO000O0O.O000000000O00O != null) {
                  O00000OO000O0O.O000000000O00O.O00000000000O = false;
               }

               O00000OO000O0O.O000000000O00O = var29;
               var29.O00000000000O = true;
            }

            return true;
         }

         if (k == 0 && O00000OO000O0O.O000000000O00O == var29) {
            O00000OO000O0O.O000000000O00O.O00000000000O = false;
            O00000OO000O0O.O000000000O00O = null;
            if (WildClient.O00000000.O0000000000O00 != null) {
               WildClient.O00000000.O0000000000O00.O0000000000();
            }
         }
      }

      if (o0000000OOO00O instanceof GroupSetting var30) {
         float var37 = g + 10.0F;
         float var44 = f;
         float var51 = var37;
         float var53 = 3.0F;
         float var57 = 10.0F;
         float var60 = 4.0F;

         for (BooleanSetting var68 : var30.O00000000000) {
            float var70 = RenderManager.O00000000(FontRegistry.O00000000, var68.O00000000, 12.0F).O00000000;
            float var71 = var70 + var60 * 2.0F;
            if (var44 + var71 > f + h) {
               var44 = f;
               var51 += var57 + var53;
            }

            if (k == 0 && O00000OO00OOO.O00000000(i, j, var44, var51, var71, var57)) {
               var68.O000000000(!var68.O0000000000());
               if (WildClient.O00000000.O0000000000O00 != null) {
                  WildClient.O00000000.O0000000000O00.O0000000000();
               }

               return true;
            }

            var44 += var71 + var53;
         }
      }

      return false;
   }
}
