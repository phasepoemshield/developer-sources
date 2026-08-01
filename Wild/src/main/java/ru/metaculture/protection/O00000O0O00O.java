package ru.metaculture.protection;

import java.util.HashMap;
import java.util.Map;
import net.minecraft.client.MinecraftClient;

public final class O00000O0O00O {
   private static final Map<String, O0000O00O0OO> O00000000 = new HashMap<>();

   private static float O00000000(RenderManager o0000O00OO0O0, O0000000OOO00 o0000000OOO00, String string, String string2) {
      float var4 = 5.0F;
      float var5 = 32.0F;
      float var6 = 4.0F;
      float var7 = var5 - var6 * 2.0F;
      float var8 = var4 + var6 + var7 + 8.0F;
      var8 += TextMeasureCache.O00000000(FontRegistry.O00000000000O, "W", 14.0F).O00000000 + 3.0F;
      var8 += TextMeasureCache.O00000000(FontRegistry.O00000000, "mintmegaantileak.xyz", 22.0F).O00000000 + 4.0F;
      var8 += TextMeasureCache.O00000000(FontRegistry.O00000000000O, "k", 14.0F).O00000000 + 4.0F;
      var8 += TextMeasureCache.O00000000(FontRegistry.O00000000000O, string2, 18.0F).O00000000 + 4.0F;
      var8 += TextMeasureCache.O00000000(FontRegistry.O00000000000, string, 22.0F).O00000000;
      var8 += 10.0F + var4;
      return Math.max(210.0F, var8);
   }

   public static O00000O0O00O.W165 O00000000(RenderManager o0000O00OO0O0, O0000000OOO00 o0000000OOO00, float f, float g, float h, float i) {
      if (o0000000OOO00.O00000000().isEmpty()) {
         return new O00000O0O00O.W165(f, g, 0.0F, 0.0F);
      } else {
         O0000000OOO0 var6 = o0000000OOO00.getClass().getAnnotation(O0000000OOO0.class);
         String var7 = var6 != null ? var6.O00000000() : "Settings";
         String var8 = var6 != null && !var6.O000000000().isEmpty() ? var6.O000000000() : "e";
         float var9 = O00000000(o0000O00OO0O0, o0000000OOO00, var7, var8);
         float var10 = 5.0F;
         float var11 = 32.0F;
         float var12 = 8.0F;
         float var13 = 4.0F;
         float var14 = 20.0F;
         float var15 = 28.0F;
         float var16 = 20.0F;
         float var17 = 20.0F;
         float var18 = var12 * 2.0F;

         for (Setting var20 : o0000000OOO00.O00000000()) {
            if (O00000000(var20)) {
               if (var20 instanceof BooleanSetting) {
                  var18 += var14;
               } else if (var20 instanceof NumberSetting) {
                  var18 += var15;
               } else if (var20 instanceof ModeSetting) {
                  var18 += var16;
               } else if (var20 instanceof ButtonSetting) {
                  var18 += var17;
               } else if (var20 instanceof GroupSetting var21) {
                  var18 += var14 + O00000000(var21) * var14 * var21.O0000000000000.O000000000000();
               }
            }
         }

         float var28 = var10 + var11 + var13 + var18 + var10;
         MinecraftClient var29 = MinecraftClient.getInstance();
         float var30 = var29.getWindow().getFramebufferWidth();
         float var22 = var29.getWindow().getFramebufferHeight();
         float var23 = 10.0F;
         boolean var24 = f + h + var23 + var9 > var30;
         boolean var25 = g + var28 + var23 > var22;
         float var26 = var24 ? f - var9 - var23 : f + h + var23;
         if (var26 + var9 > var30) {
            var26 = var30 - var9 - var23;
         }

         if (var26 < var23) {
            var26 = var23;
         }

         float var27 = var25 ? g + i - var28 : g;
         if (var27 + var28 > var22) {
            var27 = var22 - var28 - var23;
         }

         if (var27 < var23) {
            var27 = var23;
         }

         return new O00000O0O00O.W165(var26, var27, var9, var28);
      }
   }

   public static void O00000000(
      RenderManager o0000O00OO0O0,
      O0000000OOO00 o0000000OOO00,
      float f,
      float g,
      float h,
      float i,
      float j,
      float k,
      float l,
      float m,
      float n,
      boolean bl,
      boolean bl2
   ) {
      if (!o0000000OOO00.O00000000().isEmpty() && !(l <= 0.01F)) {
         O0000000OOO0 var13 = o0000000OOO00.getClass().getAnnotation(O0000000OOO0.class);
         String var14 = var13 != null ? var13.O00000000() : "Settings";
         String var15 = var13 != null && !var13.O000000000().isEmpty() ? var13.O000000000() : "e";
         float var16 = O00000000(o0000O00OO0O0, o0000000OOO00, var14, var15);
         float var17 = 5.0F;
         float var18 = 32.0F;
         float var19 = 4.0F;
         float var20 = var18 - var19 * 2.0F;
         float var21 = 8.0F;
         float var22 = 4.0F;
         float var23 = 20.0F;
         float var24 = 28.0F;
         float var25 = 20.0F;
         float var26 = 20.0F;
         float var27 = var21 * 2.0F;

         for (Setting var29 : o0000000OOO00.O00000000()) {
            if (O00000000(var29)) {
               if (var29 instanceof BooleanSetting) {
                  var27 += var23;
               } else if (var29 instanceof NumberSetting) {
                  var27 += var24;
               } else if (var29 instanceof ModeSetting) {
                  var27 += var25;
               } else if (var29 instanceof ButtonSetting) {
                  var27 += var26;
               } else if (var29 instanceof GroupSetting var30) {
                  var30.O0000000000000.O00000000();
                  var30.O0000000000000.O00000000(var30.O000000000000 ? 1.0 : 0.0, 0.2F, O0000O00O0OO0O.O0000000000O0O, false);
                  var27 += var23 + O00000000(var30) * var23 * var30.O0000000000000.O000000000000();
               }
            }
         }

         float var99 = var17 + var18 + var22 + var27 + var17;
         MinecraftClient var100 = MinecraftClient.getInstance();
         float var101 = var100.getWindow().getFramebufferWidth();
         float var31 = var100.getWindow().getFramebufferHeight();
         float var32 = 10.0F;
         boolean var33 = f + h + var32 + var16 > var101;
         boolean var34 = g + var99 + var32 > var31;
         float var35 = var33 ? f - var16 - var32 : f + h + var32;
         if (var35 + var16 > var101) {
            var35 = var101 - var16 - var32;
         }

         if (var35 < var32) {
            var35 = var32;
         }

         float var36 = var34 ? g + i - var99 : g;
         if (var36 + var99 > var31) {
            var36 = var31 - var99 - var32;
         }

         if (var36 < var32) {
            var36 = var32;
         }

         float var37 = (1.0F - l) * 10.0F;
         float var38 = var35 + (var33 ? var37 : -var37);
         float var39 = (1.0F - l) * 10.0F;
         float var40 = var36 + (var34 ? var39 : -var39);
         int var41 = (int)(255.0F * l);
         int var42 = O0000O000OO000.O0000000000(10, 10, 10, (int)(40.0F * l));
         int var43 = O0000O000OO000.O0000000000(28, 30, 30, (int)(140.0F * l));
         int var44 = O0000O000OO000.O0000000000(255, 255, 255, (int)(10.0F * l));
         int var45 = o0000000OOO00 instanceof HudElement var46
            ? var46.O00000000000O(l)
            : O0000O000OO000.O000000000000(RenderManager.W382.O0000000000000(255, 255), var41);
         int var102 = O0000O000OO000.O0000000000(255, 255, 255, var41);
         int var47 = O0000O000OO000.O0000000000(255, 255, 255, (int)(122.0F * l));
         int var48 = O0000O000OO000.O0000000000(255, 255, 255, (int)(120.0F * l));
         boolean var49 = O00000000(o0000000OOO00);
         O00000OOOO00O0.W309 var50 = O000000000(o0000000OOO00);
         if (var49) {
            var42 = O00000OOOO00O0.O00000000(l);
            var43 = O00000OOOO00O0.O00000000(l);
            var44 = O0000O000OO000.O0000000000(0, 0, 0, 0);
            var102 = O00000OOOO00O0.O000000000(l);
            var47 = O00000OOOO00O0.O0000000000(l);
            var48 = O00000OOOO00O0.O0000000000(l);
         }

         o0000O00OO0O0.O000000000000(l);
         float var51 = 14.0F;
         if (!var49 || !O00000OOOO00O0.O00000000(null, var38, var40, var16, var99, var51, var50.distance(), var50.blur(), var50.intensity(), 1, false, l)) {
            o0000O00OO0O0.O00000000(23.0F);
            o0000O00OO0O0.O00000000(var38, var40, var16, var99, var51, l);
            o0000O00OO0O0.O00000000(var38, var40, var16, var99, var51, var42);
            o0000O00OO0O0.O00000000(var38, var40, var16, var99, var51, var44, 1.0F);
         }

         float var52 = var38 + var17;
         float var53 = var40 + var17;
         float var54 = var16 - var17 * 2.0F;
         if (!var49 || !O00000OOOO00O0.O00000000(null, var52, var53, var54, var18, 11.0F, var50.distance(), var50.blur(), var50.intensity(), 1, false, l)) {
            o0000O00OO0O0.O00000000(var52, var53, var54, var18, 11.0F, 11.0F, 4.0F, 4.0F, var43);
         }

         float var55 = var52 + var19;
         float var56 = var53 + var19;
         o0000O00OO0O0.O00000000(var55, var56, var20, var20, 7.0F, var45);
         float var57 = 28.0F;
         float var58 = TextMeasureCache.O00000000(FontRegistry.O00000000000O, "o", var57).O00000000;
         o0000O00OO0O0.O00000000(
            FontRegistry.O00000000000O,
            var55 + (var20 - var58) / 2.0F,
            var56 + var20 / 2.0F + 6.0F,
            var57,
            "o",
            O0000O000OO000.O0000000000(255, 255, 255, var41)
         );
         float var59 = var55 + var20 + 8.0F;
         float var60 = var53 + var18 / 2.0F + 4.5F;
         o0000O00OO0O0.O00000000(FontRegistry.O00000000000O, var59, var60 - 0.5F, 14.0F, "W", var48);
         var59 += TextMeasureCache.O00000000(FontRegistry.O00000000000O, "W", 14.0F).O00000000 + 3.0F;
         o0000O00OO0O0.O00000000(FontRegistry.O00000000, var59, var60, 22.0F, "mintmegaantileak.xyz", var47);
         var59 += TextMeasureCache.O00000000(FontRegistry.O00000000, "mintmegaantileak.xyz", 22.0F).O00000000 + 4.0F;
         o0000O00OO0O0.O00000000(FontRegistry.O00000000000O, var59, var60 - 0.5F, 12.0F, "k", var48);
         var59 += TextMeasureCache.O00000000(FontRegistry.O00000000000O, "k", 12.0F).O00000000 + 4.0F;
         o0000O00OO0O0.O00000000(FontRegistry.O00000000000O, var59, var60, 18.0F, var15, var45);
         var59 += TextMeasureCache.O00000000(FontRegistry.O00000000000O, var15, 18.0F).O00000000 + 4.0F;
         o0000O00OO0O0.O00000000(FontRegistry.O00000000000, var59, var60, 22.0F, var14, var102);
         float var61 = var38 + var17;
         float var62 = var53 + var18 + var22;
         float var63 = var16 - var17 * 2.0F;
         if (!var49 || !O00000OOOO00O0.O00000000(null, var61, var62, var63, var27, 9.0F, var50.distance(), var50.blur(), var50.intensity(), 2, true, l)) {
            o0000O00OO0O0.O00000000(var61, var62, var63, var27, 4.0F, 4.0F, 11.0F, 11.0F, var43);
         }

         float var64 = 1.5F;
         o0000O00OO0O0.O00000000(var61 + var21, var62 + var21, var64, var27 - var21 * 2.0F, 0.5F, var45);
         float var65 = var62 + var21;
         float var66 = var61 + var21 + var64 + 6.5F;
         float var67 = var63 - (var66 - var61) - var21;
         float var68 = 22.0F;
         float var69 = 20.0F;
         float var70 = 5.0F;
         o0000O00OO0O0.O00000000(var61, var62, var63, var27, 4.0F, 4.0F, 11.0F, 11.0F);

         for (Setting var72 : o0000000OOO00.O00000000()) {
            if (O00000000(var72)) {
               if (var72 instanceof BooleanSetting var73) {
                  float var110 = 12.0F;
                  float var114 = var66 + var67 - var110;
                  float var119 = var65 + (var23 - var110) / 2.0F;
                  float var122 = var67 - var110 - 6.0F;
                  O00000000(o0000O00OO0O0, FontRegistry.O00000000, var73.O00000000, var66, var65 + var23 / 2.0F + var70, var68, var102, var65, var23, var122);
                  var73.O000000000000.O00000000();
                  var73.O000000000000.O00000000(var73.O0000000000() ? 1.0 : 0.0, 0.15F, O0000O00O0OO0O.O0000000000O0O, false);
                  int var125 = O0000O000OO000.O0000000000(255, 255, 255, (int)(10.0F * l));
                  boolean var127 = bl2 && O00000000(m, n, var66, var65, var67, var23);
                  if (!var49
                     || !O00000OOOO00O0.O00000000(
                        null, var114, var119, var110, var110, 3.0F, var50.distance(), var50.blur(), var50.intensity(), var127 ? 2 : 1, var127, l
                     )) {
                     o0000O00OO0O0.O00000000(var114, var119, var110, var110, 3.0F, var125);
                  }

                  if (var73.O0000000000()) {
                     float var130 = TextMeasureCache.O00000000(FontRegistry.O00000000000O, "j", 10.0F).O00000000;
                     o0000O00OO0O0.O00000000(FontRegistry.O00000000000O, var114 + (var110 - var130) / 2.0F, var119 + var110 / 2.0F + 3.0F, 10.0F, "j", var47);
                  }

                  if (bl && O00000000(m, n, var66, var65, var67, var23)) {
                     var73.O000000000(!var73.O0000000000());
                     O000000000O0O0.O00000000000();
                  }

                  var65 += var23;
               } else if (var72 instanceof NumberSetting var74) {
                  String var109 = O000000000(var74.O0000000000());
                  float var113 = TextMeasureCache.O00000000(FontRegistry.O00000000, var109, var69).O00000000;
                  float var118 = var67 - var113 - 6.0F;
                  O00000000(o0000O00OO0O0, FontRegistry.O00000000, var74.O00000000, var66, var65 + 13.0F, var68, var102, var65, var24, var118);
                  o0000O00OO0O0.O00000000(FontRegistry.O00000000, var66 + var67 - var113, var65 + 13.0F, var69, var109, var45);
                  float var124 = var65 + var24 - 5.0F;
                  boolean var129 = bl2 && O00000000(m, n, var66 - 4.0F, var124 - 6.0F, var67 + 8.0F, 16.0F);
                  if (var49) {
                     O00000OOOO00O0.O00000000(null, var66, var124 - 2.0F, var67, 7.0F, 3.5F, var50.distance(), var50.blur(), var50.intensity(), 2, true, l);
                  } else {
                     o0000O00OO0O0.O00000000(var66, var124, var67, 3.0F, 1.5F, O0000O000OO000.O0000000000(255, 255, 255, (int)(10.0F * l)));
                  }

                  O0000O00O0OO var132 = O00000000.computeIfAbsent(var14 + "_" + var74.O00000000, string -> new O0000O00O0OO());
                  var132.O00000000();
                  float var134 = (var74.O0000000000() - var74.O000000000000) / (var74.O0000000000000 - var74.O000000000000);
                  var132.O00000000(var134, 0.2F, O0000O00O0OO0O.O0000000000O0O, false);
                  float var136 = var132.O000000000000();
                  o0000O00OO0O0.O00000000(var66, var124, var67 * var136, 3.0F, 1.5F, var45);
                  float var137 = 8.0F;
                  float var138 = 10.0F;
                  float var139 = var66 + var67 * var136 - var137 / 2.0F;
                  if (!var49
                     || !O00000OOOO00O0.O00000000(
                        null,
                        var139,
                        var124 - (var138 - 3.0F) / 2.0F,
                        var137,
                        var138,
                        2.0F,
                        var50.distance(),
                        var50.blur(),
                        var50.intensity(),
                        var129 ? 2 : 1,
                        var129,
                        l
                     )) {
                     o0000O00OO0O0.O00000000(var139, var124 - (var138 - 3.0F) / 2.0F, var137, var138, 2.0F, O0000O000OO000.O0000000000(255, 255, 255, var41));
                  }

                  if (!var49) {
                     o0000O00OO0O0.O00000000(
                        var139 + 2.5F, var124 - (var138 - 3.0F) / 2.0F + 2.5F, 1.0F, 5.0F, 0.5F, O0000O000OO000.O0000000000(100, 100, 100, var41)
                     );
                     o0000O00OO0O0.O00000000(
                        var139 + 4.5F, var124 - (var138 - 3.0F) / 2.0F + 2.5F, 1.0F, 5.0F, 0.5F, O0000O000OO000.O0000000000(100, 100, 100, var41)
                     );
                  }

                  if (var129) {
                     float var140 = var74.O000000000000 + (m - var66) / var67 * (var74.O0000000000000 - var74.O000000000000);
                     var140 = Math.max(var74.O000000000000, Math.min(var74.O0000000000000, var140));
                     var140 = (float)(Math.round(var140 * (1.0 / var74.O000000000000O)) / (1.0 / var74.O000000000000O));
                     var74.O00000000(var140);
                     O000000000O0O0.O00000000000();
                  }

                  var65 += var24;
               } else if (var72 instanceof ModeSetting var75) {
                  String var108 = var75.O0000000000();
                  float var112 = TextMeasureCache.O00000000(FontRegistry.O00000000, var108, var69).O00000000;
                  float var117 = var67 - var112 - 6.0F;
                  O00000000(o0000O00OO0O0, FontRegistry.O00000000, var75.O00000000, var66, var65 + var25 / 2.0F + var70, var68, var102, var65, var25, var117);
                  float var121 = var66 + var67 - var112;
                  o0000O00OO0O0.O00000000(FontRegistry.O00000000, var121, var65 + var25 / 2.0F + var70, var69, var108, var47);
                  if (bl && O00000000(m, n, var66, var65, var67, var25)) {
                     var75.O00000000000O = (var75.O00000000000O + 1) % var75.O00000000000.size();
                     var75.O000000000000 = var75.O00000000000.get(var75.O00000000000O);
                     O000000000O0O0.O00000000000();
                  }

                  var65 += var25;
               } else if (var72 instanceof ButtonSetting var76) {
                  String var107 = var76.O000000000000();
                  float var111 = TextMeasureCache.O00000000(FontRegistry.O00000000, var107, var69).O00000000;
                  float var115 = Math.max(70.0F, var111 + 18.0F);
                  var115 = Math.min(var115, var67 * 0.55F);
                  float var120 = 16.0F;
                  float var123 = var66 + var67 - var115;
                  float var126 = var65 + (var26 - var120) / 2.0F;
                  float var128 = var123 - var66 - 6.0F;
                  O00000000(o0000O00OO0O0, FontRegistry.O00000000, var76.O00000000, var66, var65 + var26 / 2.0F + var70, var68, var102, var65, var26, var128);
                  boolean var131 = bl2 && O00000000(m, n, var123, var126, var115, var120);
                  if (!var49
                     || !O00000OOOO00O0.O00000000(
                        null, var123, var126, var115, var120, 4.0F, var50.distance(), var50.blur(), var50.intensity(), var131 ? 2 : 1, var131, l
                     )) {
                     o0000O00OO0O0.O00000000(var123, var126, var115, var120, 4.0F, O0000O000OO000.O0000000000(255, 255, 255, (int)(14.0F * l)));
                     o0000O00OO0O0.O00000000(var123, var126, var115, var120, 4.0F, var44, 0.6F);
                  }

                  String var133 = O00000000(var107, FontRegistry.O00000000, var69, var115 - 8.0F);
                  float var135 = TextMeasureCache.O00000000(FontRegistry.O00000000, var133, var69).O00000000;
                  o0000O00OO0O0.O00000000(FontRegistry.O00000000, var123 + (var115 - var135) / 2.0F, var126 + var120 / 2.0F + var70, var69, var133, var47);
                  if (bl && O00000000(m, n, var123, var126, var115, var120)) {
                     var76.O00000000000();
                     O000000000O0O0.O00000000000();
                  }

                  var65 += var26;
               } else if (var72 instanceof GroupSetting var77) {
                  float var78 = var77.O0000000000000.O000000000000();
                  float var79 = 26.0F;
                  float var80 = TextMeasureCache.O00000000(FontRegistry.O0000000000000, "m", var79).O00000000;
                  float var81 = var67 - var80 - 6.0F;
                  O00000000(o0000O00OO0O0, FontRegistry.O00000000, var77.O00000000, var66, var65 + var23 / 2.0F + var70, var68, var102, var65, var23, var81);
                  float var82 = var66 + var67 - var80 / 2.0F;
                  float var83 = var65 + var23 / 2.0F;
                  o0000O00OO0O0.O00000000(var82, var83);
                  o0000O00OO0O0.O00000000(FontRegistry.O0000000000000, -var80 / 2.0F, var79 / 3.0F, var79, "m", var47);
                  o0000O00OO0O0.O00000000000O();
                  if (bl && O00000000(m, n, var66, var65, var67, var23)) {
                     var77.O000000000000 = !var77.O000000000000;
                  }

                  var65 += var23;
                  if (var78 > 0.001F) {
                     float var84 = O00000000(var77) * var23;
                     float var85 = var84 * var78;
                     o0000O00OO0O0.O00000000(var61, var65, var63, var85, 0.0F, 0.0F, 0.0F, 0.0F);
                     float var86 = var65;
                     float var87 = var65 + var85;
                     float var88 = var65 - var84 * (1.0F - var78);

                     for (BooleanSetting var90 : var77.O00000000000) {
                        if (O00000000(var90)) {
                           float var91 = 12.0F;
                           float var92 = var66 + var67 - var91;
                           float var93 = var88 + (var23 - var91) / 2.0F;
                           float var94 = var67 - 10.0F - var91 - 6.0F;
                           O00000000(
                              o0000O00OO0O0,
                              FontRegistry.O00000000,
                              var90.O00000000,
                              var66 + 10.0F,
                              var88 + var23 / 2.0F + var70,
                              var69,
                              var47,
                              var88,
                              var23,
                              var94
                           );
                           var90.O000000000000.O00000000();
                           var90.O000000000000.O00000000(var90.O0000000000() ? 1.0 : 0.0, 0.15F, O0000O00O0OO0O.O0000000000O0O, false);
                           int var95 = O0000O000OO000.O0000000000(255, 255, 255, (int)(10.0F * l));
                           boolean var96 = bl2 && O00000000(m, n, var66, var88, var67, var23);
                           boolean var97 = var93 >= var86 && var93 + var91 <= var87;
                           if (!var49
                              || !var97
                              || !O00000OOOO00O0.O00000000(
                                 null, var92, var93, var91, var91, 3.0F, var50.distance(), var50.blur(), var50.intensity(), var96 ? 2 : 1, var96, l * var78
                              )) {
                              o0000O00OO0O0.O00000000(var92, var93, var91, var91, 3.0F, var95);
                           }

                           if (var90.O0000000000()) {
                              float var98 = TextMeasureCache.O00000000(FontRegistry.O00000000000O, "j", 10.0F).O00000000;
                              o0000O00OO0O0.O00000000(
                                 FontRegistry.O00000000000O, var92 + (var91 - var98) / 2.0F, var93 + var91 / 2.0F + 3.0F, 10.0F, "j", var47
                              );
                           }

                           if (var77.O000000000000 && bl && O00000000(m, n, var66, var88, var67, var23)) {
                              var90.O000000000(!var90.O0000000000());
                              O000000000O0O0.O00000000000();
                           }

                           var88 += var23;
                        }
                     }

                     o0000O00OO0O0.O0000000000000();
                     var65 += var85;
                  }
               }
            }
         }

         o0000O00OO0O0.O0000000000000();
         o0000O00OO0O0.O00000000000OO();
      }
   }

   public static void O00000000(
      RenderManager o0000O00OO0O0, O0000000OOO00 o0000000OOO00, O00000OO000O.W219 o000000000, O00000OO000O o00000OO000O, float f, float g
   ) {
      O00000000(
         o0000O00OO0O0,
         o0000000OOO00,
         o000000000.O000000000,
         o000000000.O0000000000,
         o000000000.O00000000000,
         o000000000.O000000000000,
         f,
         g,
         o000000000.O000000000000O,
         o00000OO000O.O000000000000O(),
         o00000OO000O.O00000000000O(),
         o00000OO000O.O00000000000OO(),
         o00000OO000O.O00000000000O0()
      );
   }

   private static boolean O00000000(Setting o0000000OOO00O) {
      try {
         return o0000000OOO00O == null || o0000000OOO00O.O000000000 == null || !o0000000OOO00O.O000000000.get();
      } catch (Throwable var2) {
         return true;
      }
   }

   private static int O00000000(GroupSetting o0000000OOOOOO) {
      int var1 = 0;

      for (BooleanSetting var3 : o0000000OOOOOO.O00000000000) {
         if (O00000000(var3)) {
            var1++;
         }
      }

      return var1;
   }

   private static boolean O00000000(O0000000OOO00 o0000000OOO00) {
      for (Setting var2 : o0000000OOO00.O00000000()) {
         if (var2 instanceof ModeSetting var3 && var3.O00000000.equals("Стилистика")) {
            return HudElement.O00000000(var3.O0000000000());
         }
      }

      return false;
   }

   private static O00000OOOO00O0.W309 O000000000(O0000000OOO00 o0000000OOO00) {
      float var1 = 5.5F;
      float var2 = 18.0F;
      float var3 = 0.72F;
      String var4 = "Выпуклая";

      for (Setting var6 : o0000000OOO00.O00000000()) {
         if (var6 instanceof NumberSetting var7) {
            if (var7.O00000000.equals("Нео дистанция")) {
               var1 = var7.O0000000000();
            } else if (var7.O00000000.equals("Нео размытие")) {
               var2 = var7.O0000000000();
            } else if (var7.O00000000.equals("Нео интенсивность")) {
               var3 = var7.O0000000000();
            }
         } else if (var6 instanceof ModeSetting var8 && var8.O00000000.equals("Нео форма")) {
            var4 = var8.O0000000000();
         }
      }

      return O00000OOOO00O0.O00000000(var1, var2, var3, var4);
   }

   private static String O00000000(String string, FontObject o0000O0O00O00O, float f, float g) {
      if (string == null || g <= 0.0F) {
         return "";
      } else if (TextMeasureCache.O00000000(o0000O0O00O00O, string, f).O00000000 <= g) {
         return string;
      } else {
         String var4 = "...";
         float var5 = TextMeasureCache.O00000000(o0000O0O00O00O, var4, f).O00000000;
         if (var5 > g) {
            return "";
         } else {
            int var6 = string.length();

            while (var6 > 0 && TextMeasureCache.O00000000(o0000O0O00O00O, string.substring(0, var6), f).O00000000 + var5 > g) {
               var6--;
            }

            return var6 <= 0 ? var4 : string.substring(0, var6) + var4;
         }
      }
   }

   private static void O00000000(
      RenderManager o0000O00OO0O0, FontObject o0000O0O00O00O, String string, float f, float g, float h, int i, float j, float k, float l
   ) {
      float var10 = TextMeasureCache.O00000000(o0000O0O00O00O, string, h).O00000000;
      if (var10 <= l) {
         o0000O00OO0O0.O00000000(o0000O0O00O00O, f, g, h, string, i);
      } else {
         float var11 = var10 - l;
         long var12 = 8000L;
         float var14 = (float)(System.currentTimeMillis() % var12) / (float)var12;
         float var15 = 0.0F;
         if (var14 < 0.2F) {
            var15 = 0.0F;
         } else if (var14 < 0.45F) {
            float var16 = (var14 - 0.2F) / 0.3F;
            var15 = O00000000(var16);
         } else if (var14 < 0.7F) {
            var15 = 1.0F;
         } else if (var14 < 0.95F) {
            float var18 = (var14 - 0.7F) / 0.25F;
            var15 = 1.0F - O00000000(var18);
         } else {
            var15 = 0.0F;
         }

         float var19 = var11 * var15;
         o0000O00OO0O0.O00000000(f, j, Math.max(1.0F, l), k, 0.0F, 0.0F, 0.0F, 0.0F);
         o0000O00OO0O0.O00000000(o0000O0O00O00O, f - var19, g, h, string, i);
         o0000O00OO0O0.O0000000000000();
      }
   }

   private static float O00000000(float f) {
      float var1 = 2.0F;
      float var2 = var1 + 1.0F;
      float var3 = f - 1.0F;
      return 1.0F + var2 * var3 * var3 * var3 + var1 * var3 * var3;
   }

   private static String O000000000(float f) {
      int var1 = Math.round(f * 10.0F);
      return var1 / 10 + "." + Math.abs(var1 % 10);
   }

   private static boolean O00000000(float f, float g, float h, float i, float j, float k) {
      return f >= h && f <= h + j && g >= i && g <= i + k;
   }

   public record W165(float x, float y, float width, float height) {
      public boolean contains(float f, float g, float h) {
         return f >= this.x - h && f <= this.x + this.width + h && g >= this.y - h && g <= this.y + this.height + h;
      }
   }
}
