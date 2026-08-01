package ru.metaculture.protection;

import java.awt.Color;
import java.util.List;
import java.util.stream.Collectors;
import net.minecraft.client.util.math.MatrixStack;
import org.wild.module.api.Module;

public class O00000OO00OOO extends O00000OO000O0O {
   private static final char[] O00000000OO00O = new char[65535];

   public static void O00000000(RenderManager o0000O00OO0O0, MatrixStack matrixStack, int i, int j, float f) {
      if (O00000OO000O0O.O000000000OO0O) {
         O0000O00O00O.O00000000().O00000000("Search");
      } else {
         O0000O00O00O.O00000000().O000000000("Search");
      }

      if (O00000OO000O0O.O000000000OO0O) {
         boolean var5 = O0000O0O00OO0O.O00000000(259);
         long var6 = System.currentTimeMillis();
         if (var5) {
            if (!O00000OO000O0O.O000000000OOO0) {
               O00000OO000O0O.O000000000OOO0 = true;
               O00000OO000O0O.O000000000OOOO = var6;
               O00000OO000O0O.O000000000OOO = var6;
               if (!O00000OO000O0O.O000000000OO00.isEmpty()) {
                  O00000OO000O0O.O000000000OO00 = O00000OO000O0O.O000000000OO00.substring(0, O00000OO000O0O.O000000000OO00.length() - 1);
               }
            } else if (var6 - O00000OO000O0O.O000000000OOOO > 500L && var6 - O00000OO000O0O.O000000000OOO > 30L) {
               if (!O00000OO000O0O.O000000000OO00.isEmpty()) {
                  O00000OO000O0O.O000000000OO00 = O00000OO000O0O.O000000000OO00.substring(0, O00000OO000O0O.O000000000OO00.length() - 1);
               }

               O00000OO000O0O.O000000000OOO = var6;
            }
         } else {
            O00000OO000O0O.O000000000OOO0 = false;
            O00000OO000O0O.O000000000OOOO = 0L;
         }
      } else {
         O00000OO000O0O.O000000000OOO0 = false;
         O00000OO000O0O.O000000000OOOO = 0L;
      }

      int var63 = RenderManager.W382.O0000000000O(RenderManager.W382.O000000000000(1, 1), (int)(20.4F * f));
      int var64 = RenderManager.W382.O0000000000O(RenderManager.W382.O0000000000000(1, 1), (int)(10.2F * f));
      int var7 = RenderManager.W382.O0000000000O(RenderManager.W382.O0000000000000(1, 1), (int)(255.0F * f));
      int var8 = RenderManager.W382.O0000000000O(RenderManager.W382.O0000000000000(1, 1), (int)(15.3F * f));
      int var9 = RenderManager.W382.O0000000000O(RenderManager.W382.O0000000000000(1, 1), (int)(102.0F * f));
      int var10 = RenderManager.W382.O0000000000O(RenderManager.W382.O000000000000O(1, 1), (int)(255.0F * f));
      int var11 = RenderManager.W382.O0000000000O(RenderManager.W382.O0000000000(1, 1), (int)(178.5F * f));
      Color var12 = RenderManager.W382.O0000000000O0(RenderManager.W382.O0000000000O(RenderManager.W382.O0000000000000(1, 1), (int)(56.0F * f)));
      float var13 = O00000OO000O0O.O00000000O000 + 104.735F;
      float var14 = O00000OO000O0O.O00000000O0000 + 34.025F;
      float var15 = 261.5F;
      float var16 = 209.5F;
      float var17 = var13 + 5.0F;
      float var18 = var14 + 5.0F;
      float var19 = var15 - 10.0F;
      float var20 = var16 - 10.0F;
      o0000O00OO0O0.O00000000(var17, var18, var19, var20, 0.0F, 0.0F, 0.0F, 0.0F);
      List var21 = O00000OO000O0O.O00000000O0OO0;
      if (O00000OO000O0O.O000000000OO0O && !O00000OO000O0O.O000000000OO00.isEmpty()) {
         String var22 = O00000OO000O0O.O000000000OO00.toLowerCase().trim();
         String var23 = O00000000(var22);
         var21 = O00000OO000O0O.O00000000O0OO0.stream().filter(module -> {
            String var3 = module.O00000000000.toLowerCase();
            return var3.contains(var22) || !var23.equals(var22) && var3.contains(var23);
         }).collect(Collectors.toList());
      }

      float var65 = 0.0F;
      float var66 = 0.0F;
      float var24 = 0.0F;
      float var25 = 0.0F;
      float var26 = 0.0F;
      int var27 = 1;

      for (Module var29 : (List<Module>)var21) {
         var29.O0000000000O0O.O00000000();
         var29.O0000000000O0O.O00000000(var29.O0000000000000 ? 1.0 : 0.0, 0.15F, O0000O00O0OO0O.O000000000O00);
         var29.O0000000000OO.O000000000(var29.O0000000000000 ? O0000O00OOO0OO.FORWARDS : O0000O00OOO0OO.BACKWARDS);
         float var30 = var29.O0000000000O0O.O000000000000();
         float var31 = 12.0F;
         float var32 = 12.0F;
         float var33 = O00000OO000O0O.O00000000(var29).O000000000000();
         float var34 = O00000OO000O0O.O000000000(var29).O000000000000();
         if (O00000OO000O0O.O00000000O0OOO.contains(var29) || var33 > 0.0F || var34 > 0.0F) {
            for (Setting var36 : var29.O0000000000000()) {
               var32 += O00000OO00OOOO.O00000000(o0000O00OO0O0, var36);
            }

            var32 = Math.max(var32, 20.0F);
            var31 = 12.0F + (var32 - 12.0F) * var33;
         }

         if (var27 % 2 == 0) {
            float var75 = var65 + var24 - 30.0F;
            float var78 = 21.325F;
            var78 += var31;
            float var37 = var75 + var78;
            var26 = Math.max(var26, var37);
            var24 += var31;
         } else {
            float var76 = var65 + var66;
            float var80 = 21.325F;
            var80 += var31;
            float var83 = var76 + var80;
            var25 = Math.max(var25, var83);
            var66 += var31;
            var65 += 30.325F;
         }

         var27++;
      }

      float var67 = Math.max(var25, var26);
      float var68 = var67 + 150.0F;
      float var69 = O00000OO000O0O.O00000000O000 + 104.735F;
      float var70 = O00000OO000O0O.O00000000O0000 + 34.025F;
      boolean var72 = O00000000(i, j, var69 + 5.0F, var70 + 5.0F, var15 - 10.0F, var16 - 10.0F);
      O00000OO000O0O.O00000000().O00000000000(6.0F);
      O00000OO000O0O.O00000000().O00000000(var72);
      O00000OO000O0O.O00000000().O0000000000();
      O00000OO000O0O.O00000000().O00000000(O0000O00OO0OO0.O00000000000OO(var68, 260.0F, 9999.0F), var16 - 10.0F);
      float var73 = -0.35F;
      float var74 = -0.7F;
      int var77 = 1;
      float var82 = O00000OO000O0O.O00000000().O00000000000O();
      float var84 = 0.0F;
      float var38 = 0.0F;

      for (Module var40 : (List<Module>)var21) {
         if (var77 % 2 == 0) {
            float var85 = var40.O0000000000O0O.O000000000000();
            float var86 = var82 + var38 - 30.0F;
            float var87 = 12.0F;
            float var89 = 12.0F;
            float var91 = O00000OO000O0O.O00000000(var40).O000000000000();
            float var92 = O00000OO000O0O.O000000000(var40).O000000000000();
            if (O00000OO000O0O.O00000000O0OOO.contains(var40) || var91 > 0.0F) {
               for (Setting var95 : var40.O0000000000000()) {
                  var89 += O00000OO00OOOO.O00000000(o0000O00OO0O0, var95) + 0.5F;
               }

               var89 = Math.max(var89, 20.0F);
               var87 = 12.0F * var91 + (var89 - 12.0F) * var91;
            }

            if (!(var91 > 0.0F) && !(var92 > 0.0F)) {
               o0000O00OO0O0.O00000000(
                  O00000OO000O0O.O00000000O000 + 238.35F, O00000OO000O0O.O00000000O0000 + 43.365F + var86, 121.47F, 21.325F, 6.5F, var63, 0.1F
               );
               o0000O00OO0O0.O00000000(O00000OO000O0O.O00000000O000 + 238.35F, O00000OO000O0O.O00000000O0000 + 43.365F + var86, 121.47F, 21.325F, 6.5F, var64);
            } else {
               o0000O00OO0O0.O00000000(
                  O00000OO000O0O.O00000000O000 + 238.35F, O00000OO000O0O.O00000000O0000 + 43.365F + var86, 121.47F, 21.325F + var87, 6.5F, var63, 0.1F
               );
               o0000O00OO0O0.O00000000(
                  O00000OO000O0O.O00000000O000 + 238.35F, O00000OO000O0O.O00000000O0000 + 43.365F + var86, 121.47F, 21.325F + var87, 6.5F, var64
               );
               if (var92 > 0.01F) {
                  o0000O00OO0O0.O00000000(
                     O00000OO000O0O.O00000000O000 + 238.515F,
                     O00000OO000O0O.O00000000O0000 + 64.69F + var86,
                     121.47F,
                     1.0F,
                     O0000O000OO000.O0000000000(var63, var92)
                  );
               }
            }

            float var96 = O00000OO000O0O.O00000000O000 + 247.895F;
            float var97 = O00000OO000O0O.O00000000O0000 + 49.555F + var86;
            o0000O00OO0O0.O00000000(FontRegistry.O00000000, var96, var97 + 6.6F, 14.0F, var40.O00000000000, O0000O000OO000.O000000000000(var9, var10, var85));
            float var98 = O00000OO000O0O.O0000000000(var40).O000000000000();
            if (var40.O0000000000O || var40.O000000000000 != -1 || var98 > 0.0F) {
               float var100 = 10.0F;
               String var103 = var40.O0000000000O ? "..." : (var40.O000000000000 != -1 ? O0000O000OO0O0.O00000000(var40.O000000000000) : "");
               float var106 = var103.isEmpty() ? 0.0F : RenderManager.O00000000(FontRegistry.O00000000, var103, 12.0F).O00000000;
               float var109 = 6.0F;
               float var112 = Math.max(var109, var106 + 6.0F);
               float var115 = RenderManager.O00000000(FontRegistry.O00000000, var40.O00000000000, 14.0F).O00000000;
               float var117 = var96 + var115 + 4.0F;
               float var118 = var97 - 0.35F;
               o0000O00OO0O0.O00000000(var117, var118, var112, var100, 3.0F, O0000O000OO000.O0000000000(var63, var98), 0.1F);
               o0000O00OO0O0.O00000000(var117, var118, var112, var100, 3.0F, O0000O000OO000.O0000000000(var8, var98));
               if (!var103.isEmpty()) {
                  o0000O00OO0O0.O00000000(
                     FontRegistry.O00000000,
                     var117 + var112 / 2.0F - var106 / 2.0F - 0.2F,
                     var118 + 2.0F + 5.25F,
                     12.0F,
                     var103,
                     O0000O000OO000.O0000000000(var40.O0000000000O ? var7 : var9, var98)
                  );
               }
            }

            o0000O00OO0O0.O00000000(
               O00000OO000O0O.O00000000O000 + 348.415F - 1.5F, O00000OO000O0O.O00000000O0000 + 52.505F + var86 - 1.5F + var73, 6.0F, 6.0F, 3.0F, var63, 0.08F
            );
            o0000O00OO0O0.O00000000(
               O00000OO000O0O.O00000000O000 + 348.415F - 1.5F, O00000OO000O0O.O00000000O0000 + 52.505F + var86 - 1.5F + var73, 6.0F, 6.0F, 3.0F, var8
            );
            o0000O00OO0O0.O00000000(
               O00000OO000O0O.O00000000O000 + 349.27F - 0.75F,
               O00000OO000O0O.O00000000O0000 + 53.365F + var86 - 0.78F + var73,
               3.0F,
               3.0F,
               1.5F,
               O0000O000OO000.O000000000000(var9, var7, var85)
            );
            o0000O00OO0O0.O00000000(
               O00000OO000O0O.O00000000O000 + 349.27F + 0.7F,
               O00000OO000O0O.O00000000O0000 + 53.365F + var86 + var73,
               0.1F,
               0.1F,
               1.5F,
               2.575F,
               0.1F,
               O0000O000OO000.O000000000000(0, var12.getRGB(), var85)
            );
            if (!var40.O0000000000000().isEmpty()) {
               o0000O00OO0O0.O00000000(
                  FontRegistry.O0000000000,
                  O00000OO000O0O.O00000000O000 + 337.975F,
                  O00000OO000O0O.O00000000O0000 + 52.81F + var86 - 1.5F + var74 + 6.5F + 6.0F - 6.0F * var91,
                  11.0F,
                  "S",
                  O0000O000OO000.O000000000000(0, var7, var91)
               );
               o0000O00OO0O0.O00000000(
                  FontRegistry.O0000000000,
                  O00000OO000O0O.O00000000O000 + 337.975F,
                  O00000OO000O0O.O00000000O0000 + 52.81F + var86 - 1.5F + var74 + 6.5F + 6.0F * var91,
                  11.0F,
                  "R",
                  O0000O000OO000.O000000000000(var9, 0, var91)
               );
            }

            if (var91 > 0.0F || var92 > 0.0F) {
               float var101 = O00000OO000O0O.O00000000O0000 + 64.69F + var86 + 4.0F;
               float var104 = O00000OO000O0O.O00000000O000 + 238.35F + 9.0F;
               float var107 = 105.47F;
               float var110 = 0.0F;

               for (Setting var116 : var40.O0000000000000()) {
                  var110 += O00000OO00OOOO.O00000000(
                        o0000O00OO0O0,
                        var116,
                        var104,
                        var101 + var110,
                        var107,
                        i,
                        j,
                        O0000O000OO000.O0000000000(var63, var92),
                        O0000O000OO000.O0000000000(var7, var92),
                        O0000O000OO000.O0000000000(var8, var92),
                        O0000O000OO000.O0000000000(var9, var92),
                        O0000O000OO000.O0000000000(var10, var92),
                        f * var92
                     )
                     * var92;
               }

               var38 += var87;
            }
         } else {
            float var41 = var40.O0000000000O0O.O000000000000();
            float var42 = var82 + var84;
            float var43 = 12.0F;
            float var44 = 12.0F;
            float var45 = O00000OO000O0O.O00000000(var40).O000000000000();
            float var46 = O00000OO000O0O.O000000000(var40).O000000000000();
            if (O00000OO000O0O.O00000000O0OOO.contains(var40) || var45 > 0.0F) {
               for (Setting var48 : var40.O0000000000000()) {
                  var44 += O00000OO00OOOO.O00000000(o0000O00OO0O0, var48) + 0.5F;
               }

               var44 = Math.max(var44, 20.0F);
               var43 = 12.0F * var45 + (var44 - 12.0F) * var45;
            }

            if (!(var45 > 0.0F) && !(var46 > 0.0F)) {
               o0000O00OO0O0.O00000000(
                  O00000OO000O0O.O00000000O000 + 111.885F, O00000OO000O0O.O00000000O0000 + 43.365F + var42, 121.47F, 21.325F, 6.5F, var63, 0.1F
               );
               o0000O00OO0O0.O00000000(O00000OO000O0O.O00000000O000 + 111.885F, O00000OO000O0O.O00000000O0000 + 43.365F + var42, 121.47F, 21.325F, 6.5F, var64);
            } else {
               o0000O00OO0O0.O00000000(
                  O00000OO000O0O.O00000000O000 + 111.885F, O00000OO000O0O.O00000000O0000 + 43.365F + var42, 121.47F, 21.325F + var43, 6.5F, var63, 0.1F
               );
               o0000O00OO0O0.O00000000(
                  O00000OO000O0O.O00000000O000 + 111.885F, O00000OO000O0O.O00000000O0000 + 43.365F + var42, 121.47F, 21.325F + var43, 6.5F, var64
               );
               if (var46 > 0.01F) {
                  o0000O00OO0O0.O00000000(
                     O00000OO000O0O.O00000000O000 + 111.885F,
                     O00000OO000O0O.O00000000O0000 + 64.69F + var42,
                     121.47F,
                     1.0F,
                     O0000O000OO000.O0000000000(var63, var46)
                  );
               }
            }

            float var94 = O00000OO000O0O.O00000000O000 + 121.425F;
            float var49 = O00000OO000O0O.O00000000O0000 + 49.555F + var42;
            o0000O00OO0O0.O00000000(FontRegistry.O00000000, var94, var49 + 6.6F, 14.0F, var40.O00000000000, O0000O000OO000.O000000000000(var9, var10, var41));
            float var50 = O00000OO000O0O.O0000000000(var40).O000000000000();
            if (var40.O0000000000O || var40.O000000000000 != -1 || var50 > 0.0F) {
               float var51 = 10.0F;
               String var52 = var40.O0000000000O ? "..." : (var40.O000000000000 != -1 ? O0000O000OO0O0.O00000000(var40.O000000000000) : "");
               float var53 = var52.isEmpty() ? 0.0F : RenderManager.O00000000(FontRegistry.O00000000, var52, 12.0F).O00000000;
               float var54 = 6.0F;
               float var55 = Math.max(var54, var53 + 6.0F);
               float var56 = RenderManager.O00000000(FontRegistry.O00000000, var40.O00000000000, 14.0F).O00000000;
               float var57 = var94 + var56 + 4.0F;
               float var58 = var49 - 0.35F;
               o0000O00OO0O0.O00000000(var57, var58, var55, var51, 3.0F, O0000O000OO000.O0000000000(var63, var50), 0.1F);
               o0000O00OO0O0.O00000000(var57, var58, var55, var51, 3.0F, O0000O000OO000.O0000000000(var8, var50));
               if (!var52.isEmpty()) {
                  o0000O00OO0O0.O00000000(
                     FontRegistry.O00000000,
                     var57 + var55 / 2.0F - var53 / 2.0F - 0.2F,
                     var58 + 2.0F + 5.25F,
                     12.0F,
                     var52,
                     O0000O000OO000.O0000000000(var40.O0000000000O ? var7 : var9, var50)
                  );
               }
            }

            o0000O00OO0O0.O00000000(
               O00000OO000O0O.O00000000O000 + 221.875F - 1.5F, O00000OO000O0O.O00000000O0000 + 52.505F + var42 - 1.5F + var73, 6.0F, 6.0F, 3.0F, var63, 0.08F
            );
            o0000O00OO0O0.O00000000(
               O00000OO000O0O.O00000000O000 + 221.875F - 1.5F, O00000OO000O0O.O00000000O0000 + 52.505F + var42 - 1.5F + var73, 6.0F, 6.0F, 3.0F, var8
            );
            o0000O00OO0O0.O00000000(
               O00000OO000O0O.O00000000O000 + 222.735F - 0.75F,
               O00000OO000O0O.O00000000O0000 + 53.365F + var42 - 0.78F + var73,
               3.0F,
               3.0F,
               1.5F,
               O0000O000OO000.O000000000000(var9, var7, var41)
            );
            o0000O00OO0O0.O00000000(
               O00000OO000O0O.O00000000O000 + 222.735F + 0.7F,
               O00000OO000O0O.O00000000O0000 + 53.365F + var42 + var73,
               0.1F,
               0.1F,
               1.5F,
               2.575F,
               0.1F,
               O0000O000OO000.O000000000000(0, var12.getRGB(), var41)
            );
            if (!var40.O0000000000000().isEmpty() && !var40.O0000000000000().isEmpty()) {
               o0000O00OO0O0.O00000000(
                  FontRegistry.O0000000000,
                  O00000OO000O0O.O00000000O000 + 211.48F,
                  O00000OO000O0O.O00000000O0000 + 52.81F + var42 - 1.5F + var74 + 6.5F + 6.0F - 6.0F * var45,
                  11.0F,
                  "S",
                  O0000O000OO000.O000000000000(0, var7, var45)
               );
               o0000O00OO0O0.O00000000(
                  FontRegistry.O0000000000,
                  O00000OO000O0O.O00000000O000 + 211.48F,
                  O00000OO000O0O.O00000000O0000 + 52.81F + var42 - 1.5F + var74 + 6.5F + 6.0F * var45,
                  11.0F,
                  "R",
                  O0000O000OO000.O000000000000(var9, 0, var45)
               );
            }

            if (var45 > 0.0F || var46 > 0.0F) {
               float var99 = O00000OO000O0O.O00000000O0000 + 64.69F + var42 + 4.0F;
               float var102 = O00000OO000O0O.O00000000O000 + 111.885F + 9.0F;
               float var105 = 105.47F;
               float var108 = 0.0F;

               for (Setting var114 : var40.O0000000000000()) {
                  var108 += O00000OO00OOOO.O00000000(
                        o0000O00OO0O0,
                        var114,
                        var102,
                        var99 + var108,
                        var105,
                        i,
                        j,
                        O0000O000OO000.O0000000000(var63, var46),
                        O0000O000OO000.O0000000000(var7, var46),
                        O0000O000OO000.O0000000000(var8, var46),
                        O0000O000OO000.O0000000000(var9, var46),
                        O0000O000OO000.O0000000000(var10, var46),
                        f * var46
                     )
                     * var46;
               }

               var84 += var43;
            }

            var82 += 30.325F;
         }

         var77++;
      }

      o0000O00OO0O0.O0000000000000();
      O00000OO000O0O.O00000000()
         .O00000000(
            o0000O00OO0O0, O00000OO000O0O.O00000000O000 + 104.735F + 261.5F - 5.0F + 1.0F, O00000OO000O0O.O00000000O0000 + 34.025F + 5.0F, 2.0F, 194.5F, f
         );
      if (O00000OO000O0O.O0000000000OO != null && O00000OO000O0O.O0000000000OO instanceof ColorSetting) {
         O00000OO00OO0O.O00000000(
            o0000O00OO0O0,
            O00000OO000O0O.O0000000000OO,
            i,
            j,
            O0000O000OO000.O0000000000(var63, O00000OO000O0O.O0000000000000.O00000000000O0()),
            O0000O000OO000.O0000000000(var11, O00000OO000O0O.O0000000000000.O00000000000O0()),
            O0000O000OO000.O0000000000(var9, O00000OO000O0O.O0000000000000.O00000000000O0()),
            f * O00000OO000O0O.O0000000000000.O00000000000O0()
         );
      }
   }

   private static String O00000000(String string) {
      StringBuilder var1 = new StringBuilder(string.length());

      for (int var2 = 0; var2 < string.length(); var2++) {
         char var3 = string.charAt(var2);
         var1.append(var3 < O00000000OO00O.length && O00000000OO00O[var3] != 0 ? O00000000OO00O[var3] : var3);
      }

      return var1.toString();
   }

   public static boolean O00000000(float f, float g, float h, float i, float j, float k) {
      return f >= h && g >= i && f < h + j && g < i + k;
   }

   static {
      String var0 = "йцукенгшщзхъфывапролджэячсмитьбю";
      String var1 = "qwertyuiop[]asdfghjkl;'zxcvbnm,.";

      for (int var2 = 0; var2 < var0.length(); var2++) {
         O00000000OO00O[var0.charAt(var2)] = var1.charAt(var2);
      }
   }
}
