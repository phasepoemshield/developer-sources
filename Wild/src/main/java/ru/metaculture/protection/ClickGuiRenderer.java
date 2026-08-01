package ru.metaculture.protection;

import lombok.Generated;
import net.minecraft.client.gui.DrawContext;
import org.lwjgl.opengl.GL11;

public final class ClickGuiRenderer {
   private final O0000O0000OOOO O00000000;
   private final O0000O0000OOO0 O000000000;
   private final SearchBarRenderer O0000000000;
   private final O0000O0000O00O O00000000000;
   private final O0000O0000OO00 O000000000000;
   private final O0000O000O O0000000000000;
   private static final O00000OOO0 O000000000000O = new O00000OOO0();

   public O0000O000O0O0O O00000000() {
      return this.O00000000000.O00000000();
   }

   public void O00000000(
      RenderManager o0000O00OO0O0,
      DrawContext drawContext,
      O0000O000O0O0 o0000O000O0O0,
      O00000OOOOOOOO o00000OOOOOOOO,
      O0000O0000000 o0000O0000000,
      O0000O000O0OOO o0000O000O0OOO,
      int i,
      int j
   ) {
      if (o0000O00OO0O0 != null && o0000O000O0O0 != null && o00000OOOOOOOO != null && o0000O0000000 != null && o0000O000O0OOO != null && i > 0 && j > 0) {
         float var9 = o0000O000O0O0.O00000000000();
         if (!(var9 <= 0.001F)) {
            O0000O00000 var10 = o0000O000O0OOO.O000000000000();
            if (var10 != null) {
               O00000000OO0OO.O00000000().O00000000(i, j);

               try {
                  boolean var11 = o0000O000O0OOO.O00000000();
                  boolean var12 = o0000O000O0OOO.O00000000000() == Theme.SAKURA_BREEZE;
                  boolean var13 = o0000O000O0OOO.O00000000000() == Theme.VERNAL_SOLSTICE;
                  boolean var14 = o0000O000O0OOO.O00000000000() == Theme.MIDNIGHT_AZURE;
                  boolean var15 = o0000O000O0OOO.O00000000000() == Theme.FRUTIGER_AERO;
                  boolean var16 = o0000O000O0OOO.O00000000000() == Theme.PORCELAIN_DAWN;
                  boolean var17 = o0000O000O0OOO.O00000000000() == Theme.VELVET_DUSK;
                  boolean var18 = o0000O000O0OOO.O00000000000() == Theme.OBSIDIAN_EMBER;
                  boolean var19 = o0000O000O0OOO.O00000000000() == Theme.GLACIER_VEIL;
                  boolean var20 = FontRenderer.O00000000(var11);

                  try {
                     BlurRenderer.O00000000()
                        .O00000000(
                           o00000OOOOOOOO.O00000000(),
                           o00000OOOOOOOO.O000000000(),
                           var10.O00000000000(),
                           var10.O000000000000(),
                           var10.O00000000(24.0F),
                           o0000O000O0O0.O000000O0O0O00() ? o00000OOOOOOOO.O000000000O00O() : o00000OOOOOOOO.O00000000(),
                           o0000O000O0O0.O000000O0O0O00() ? o00000OOOOOOOO.O000000000O0O() : o00000OOOOOOOO.O000000000(),
                           o0000O000O0O0.O000000O0O0O00() ? var10.O000000000O0() : 0.0F,
                           o0000O000O0O0.O000000O0O0O00() ? var10.O000000000O00() : 0.0F,
                           var10.O00000000(14.0F)
                        );
                     if (O000000O000O0O.O00000000()) {
                        o0000O00OO0O0.O00000000(32.0F);
                     }

                     float var21 = (float)(System.currentTimeMillis() % 10000L) / 10000.0F;
                     float var22 = o0000O000O0O0.O00000000O0000();
                     o0000O00OO0O0.O000000000000(var9);

                     try {
                        boolean var23 = false;

                        try {
                           var23 = !var14 && MenuModule.O00000000OO00O.O000000000("Голограмма") && O000000O000O0O.O00000000();
                        } catch (Throwable var77) {
                        }

                        if (var23) {
                           try {
                              o0000O00OO0O0.O0000000000();
                              O0000O00000O.O00000000()
                                 .O00000000(
                                    i,
                                    j,
                                    o0000O000O0O0.O0000000O(),
                                    o0000O000O0O0.O0000000O0(),
                                    var9,
                                    MenuModule.O00000000OO0O0.O0000000000(),
                                    MenuModule.O00000000OO0OO.O0000000000(),
                                    MenuModule.O00000000OOO.O0000000000(),
                                    MenuModule.O00000000OOO0.O0000000000(),
                                    MenuModule.O00000000OOO00.O0000000000(),
                                    MenuModule.O00000000OOO0O.O0000000000(),
                                    MenuModule.O00000000OOOO.O0000000000(),
                                    MenuModule.O00000000OOOO0.O0000000000(),
                                    MenuModule.O00000000OOOOO.O0000000000(),
                                    MenuModule.O0000000O.O0000000000()
                                 );
                           } catch (Throwable var76) {
                              O00000000OO0OO.O00000000().O000000000("GuiRenderer.holoBlur", var76);
                           }

                           o0000O00OO0O0.O00000000(
                              0.0F,
                              0.0F,
                              (float)i,
                              (float)j,
                              var11 ? ColorScheme.O00000000(255, 255, 255, Math.round(26.0F * var9)) : ColorScheme.O00000000(0, 0, 0, Math.round(14.0F * var9))
                           );
                        } else {
                           o0000O00OO0O0.O00000000(
                              0.0F,
                              0.0F,
                              (float)i,
                              (float)j,
                              var11
                                 ? ColorScheme.O00000000(255, 255, 255, Math.round((var12 ? 22 : (var13 ? 34 : (var15 ? 24 : (var16 ? 26 : 112)))) * var9))
                                 : (
                                    var14
                                       ? ColorScheme.O00000000(3, 7, 18, Math.round(36.0F * var9))
                                       : (
                                          var17
                                             ? ColorScheme.O00000000(19, 12, 32, Math.round(36.0F * var9))
                                             : (
                                                var18
                                                   ? ColorScheme.O00000000(12, 10, 11, Math.round(34.0F * var9))
                                                   : (
                                                      var19
                                                         ? ColorScheme.O00000000(7, 19, 32, Math.round(36.0F * var9))
                                                         : ColorScheme.O00000000(0, 0, 0, Math.round(100.0F * var9))
                                                   )
                                             )
                                       )
                                 )
                           );
                        }

                        if (var12) {
                           try {
                              o0000O00OO0O0.O0000000000();
                              O0000O00000OO0.O00000000()
                                 .O00000000(i, j, o0000O000O0O0.O0000000O(), o0000O000O0O0.O0000000O0(), o0000O000O0OOO.O0000000000000(), var9);
                              o0000O00OO0O0.O0000000000();
                              o0000O00OO0O0.O00000000(0.0F, 0.0F, (float)i, (float)j, ColorScheme.O00000000(255, 255, 255, Math.round(4.0F * var9)));
                           } catch (Throwable var75) {
                              O00000000OO0OO.O00000000().O000000000("GuiRenderer.sakuraBreeze", var75);
                           }
                        }

                        if (var13) {
                           try {
                              o0000O00OO0O0.O0000000000();
                              O0000O0000O0.O00000000()
                                 .O00000000(i, j, o0000O000O0O0.O0000000O(), o0000O000O0O0.O0000000O0(), o0000O000O0OOO.O0000000000000(), var9);
                              o0000O00OO0O0.O0000000000();
                              o0000O00OO0O0.O00000000(0.0F, 0.0F, (float)i, (float)j, ColorScheme.O00000000(255, 255, 255, Math.round(5.0F * var9)));
                           } catch (Throwable var74) {
                              O00000000OO0OO.O00000000().O000000000("GuiRenderer.vernalSolstice", var74);
                           }
                        }

                        if (var14) {
                           try {
                              o0000O00OO0O0.O0000000000();
                              O0000O00000O0.O00000000()
                                 .O00000000(i, j, o0000O000O0O0.O0000000O(), o0000O000O0O0.O0000000O0(), o0000O000O0OOO.O0000000000000(), var9);
                              o0000O00OO0O0.O0000000000();
                              o0000O00OO0O0.O00000000(0.0F, 0.0F, (float)i, (float)j, ColorScheme.O00000000(3, 7, 18, Math.round(18.0F * var9)));
                           } catch (Throwable var73) {
                              O00000000OO0OO.O00000000().O000000000("GuiRenderer.midnightAzure", var73);
                           }
                        }

                        if (var15) {
                           try {
                              o0000O00OO0O0.O0000000000();
                              O0000O000000O.O00000000()
                                 .O00000000(i, j, o0000O000O0O0.O0000000O(), o0000O000O0O0.O0000000O0(), o0000O000O0OOO.O0000000000000(), var9);
                              o0000O00OO0O0.O0000000000();
                              o0000O00OO0O0.O00000000(0.0F, 0.0F, (float)i, (float)j, ColorScheme.O00000000(255, 255, 255, Math.round(4.0F * var9)));
                           } catch (Throwable var72) {
                              O00000000OO0OO.O00000000().O000000000("GuiRenderer.frutigerAero", var72);
                           }
                        }

                        if (var16) {
                           try {
                              o0000O00OO0O0.O0000000000();
                              O0000O00000O0O.O00000000()
                                 .O00000000(i, j, o0000O000O0O0.O0000000O(), o0000O000O0O0.O0000000O0(), o0000O000O0OOO.O0000000000000(), var9);
                              o0000O00OO0O0.O0000000000();
                              o0000O00OO0O0.O00000000(0.0F, 0.0F, (float)i, (float)j, ColorScheme.O00000000(255, 255, 255, Math.round(5.0F * var9)));
                           } catch (Throwable var71) {
                              O00000000OO0OO.O00000000().O000000000("GuiRenderer.porcelainDawn", var71);
                           }
                        }

                        if (var17) {
                           try {
                              o0000O00OO0O0.O0000000000();
                              O0000O0000O.O00000000()
                                 .O00000000(i, j, o0000O000O0O0.O0000000O(), o0000O000O0O0.O0000000O0(), o0000O000O0OOO.O0000000000000(), var9);
                              o0000O00OO0O0.O0000000000();
                              o0000O00OO0O0.O00000000(0.0F, 0.0F, (float)i, (float)j, ColorScheme.O00000000(19, 12, 32, Math.round(18.0F * var9)));
                           } catch (Throwable var70) {
                              O00000000OO0OO.O00000000().O000000000("GuiRenderer.velvetDusk", var70);
                           }
                        }

                        if (var18) {
                           try {
                              o0000O00OO0O0.O0000000000();
                              O0000O00000O00.O00000000()
                                 .O00000000(i, j, o0000O000O0O0.O0000000O(), o0000O000O0O0.O0000000O0(), o0000O000O0OOO.O0000000000000(), var9);
                              o0000O00OO0O0.O0000000000();
                              o0000O00OO0O0.O00000000(0.0F, 0.0F, (float)i, (float)j, ColorScheme.O00000000(12, 10, 11, Math.round(16.0F * var9)));
                           } catch (Throwable var69) {
                              O00000000OO0OO.O00000000().O000000000("GuiRenderer.obsidianEmber", var69);
                           }
                        }

                        if (var19) {
                           try {
                              o0000O00OO0O0.O0000000000();
                              O0000O000000O0.O00000000()
                                 .O00000000(i, j, o0000O000O0O0.O0000000O(), o0000O000O0O0.O0000000O0(), o0000O000O0OOO.O0000000000000(), var9);
                              o0000O00OO0O0.O0000000000();
                              o0000O00OO0O0.O00000000(0.0F, 0.0F, (float)i, (float)j, ColorScheme.O00000000(7, 19, 32, Math.round(18.0F * var9)));
                           } catch (Throwable var68) {
                              O00000000OO0OO.O00000000().O000000000("GuiRenderer.glacierVeil", var68);
                           }
                        }

                        String var24 = this.O000000000();
                        if (!var24.isBlank()) {
                           o0000O00OO0O0.O0000000000();
                           boolean var25 = O00000OOOO00OO.O00000000(
                              var24,
                              0.0F,
                              0.0F,
                              (float)i,
                              (float)j,
                              i,
                              j,
                              o0000O000O0O0.O0000000O(),
                              o0000O000O0O0.O0000000O0(),
                              o0000O000O0OOO.O0000000000000(),
                              var9
                           );
                           o0000O00OO0O0.O0000000000();
                           if (var25) {
                              o0000O00OO0O0.O00000000(
                                 0.0F,
                                 0.0F,
                                 (float)i,
                                 (float)j,
                                 var11
                                    ? ColorScheme.O00000000(255, 255, 255, Math.round(10.0F * var9))
                                    : ColorScheme.O00000000(0, 0, 0, Math.round(16.0F * var9))
                              );
                           }
                        }

                        float var81 = 0.94F + var9 * 0.06F;
                        this.O00000000(
                           o0000O00OO0O0, drawContext, o0000O000O0O0, o00000OOOOOOOO, o0000O0000000, o0000O000O0OOO, var81, var21, var22, var9, i, j
                        );
                        this.O0000000000000.O00000000(o0000O00OO0O0, o0000O000O0O0, o0000O000O0OOO, i, j);
                     } finally {
                        o0000O00OO0O0.O00000000000OO();
                     }
                  } finally {
                     FontRenderer.O00000000(var20);
                  }
               } finally {
                  O00000000OO0OO.O00000000().O00000000000O();
               }
            }
         }
      }
   }

   private void O00000000(
      RenderManager o0000O00OO0O0,
      DrawContext drawContext,
      O0000O000O0O0 o0000O000O0O0,
      O00000OOOOOOOO o00000OOOOOOOO,
      O0000O0000000 o0000O0000000,
      O0000O000O0OOO o0000O000O0OOO,
      float f,
      float g,
      float h,
      float i,
      int j,
      int k
   ) {
      O0000O00000 var13 = o0000O000O0OOO.O000000000000();
      ColorScheme var14 = o0000O000O0OOO.O0000000000000();
      float var15 = o0000O000O0O0.O00000000("panel:z:lift", o0000O000O0O0.O000000O0O0O0O() ? 1.0F : 0.0F, O0000O000O0O00.O00000000());
      if (o0000O000O0O0.O000000O0O0O0O()) {
         this.O00000000(o0000O00OO0O0, drawContext, o0000O000O0O0, o00000OOOOOOOO, o0000O0000000, o0000O000O0OOO, f, g, h, i, j, k, var13, var14, 1.0F - var15);
         this.O00000000(o0000O00OO0O0, o0000O000O0O0, o00000OOOOOOOO, o0000O000O0OOO, f, g, i, var13, var14, var15);
      } else {
         this.O00000000(o0000O00OO0O0, o0000O000O0O0, o00000OOOOOOOO, o0000O000O0OOO, f, g, i, var13, var14, 1.0F - var15);
         this.O00000000(o0000O00OO0O0, drawContext, o0000O000O0O0, o00000OOOOOOOO, o0000O0000000, o0000O000O0OOO, f, g, h, i, j, k, var13, var14, var15);
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void O00000000(
      RenderManager o0000O00OO0O0,
      O0000O000O0O0 o0000O000O0O0,
      O00000OOOOOOOO o00000OOOOOOOO,
      O0000O000O0OOO o0000O000O0OOO,
      float f,
      float g,
      float h,
      O0000O00000 o0000O00000,
      ColorScheme o0000O000O0OO,
      float i
   ) {
      float var11 = o0000O000O0O0.O00000000(O0000O000O00O0.O0000000000O0());
      if (!(var11 <= 0.005F)) {
         float var12 = o00000OOOOOOOO.O000000000O00O() + o0000O00000.O000000000O0() * 0.5F;
         float var13 = o00000OOOOOOOO.O000000000O0O() + o0000O00000.O000000000O00() * 0.5F;
         float var14 = 1.0F + i * 0.004F;
         o0000O00OO0O0.O00000000(var14 * f, var12, var13);
         boolean var19 = false /* VF: Semaphore variable */;

         try {
            var19 = true;
            float var16 = h * var11 * (1.0F + i * 0.3F);
            this.O00000000(
               o0000O00OO0O0,
               o00000OOOOOOOO.O000000000O00O(),
               o00000OOOOOOOO.O000000000O0O(),
               o0000O00000.O000000000O0(),
               o0000O00000.O000000000O00(),
               o0000O00000.O000000000(14.0F),
               o0000O00000,
               o0000O000O0OOO,
               var16,
               g
            );
            this.O00000000.O00000000(o0000O00OO0O0, o0000O000O0O0, o00000OOOOOOOO, o0000O000O0OOO, g);
            this.O00000000(
               o0000O00OO0O0,
               o00000OOOOOOOO.O000000000O00O(),
               o00000OOOOOOOO.O000000000O0O(),
               o0000O00000.O000000000O0(),
               o0000O00000.O000000000O00(),
               o0000O00000.O000000000(14.0F),
               o0000O000O0OO,
               var11
            );
            this.O00000000(
               o0000O00OO0O0,
               o00000OOOOOOOO.O000000000O00O(),
               o00000OOOOOOOO.O000000000O0O(),
               o0000O00000.O000000000O0(),
               o0000O00000.O000000000O00(),
               o0000O00000.O000000000(14.0F),
               o0000O000O0OOO,
               var11,
               g
            );
            this.O00000000(o0000O00OO0O0, o0000O000O0O0, o00000OOOOOOOO, o0000O00000, o0000O000O0OO, g);
            var19 = false;
         } finally {
            if (var19) {
               o0000O00OO0O0.O00000000000O0();
            }
         }

         o0000O00OO0O0.O00000000000O0();
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void O00000000(
      RenderManager o0000O00OO0O0,
      DrawContext drawContext,
      O0000O000O0O0 o0000O000O0O0,
      O00000OOOOOOOO o00000OOOOOOOO,
      O0000O0000000 o0000O0000000,
      O0000O000O0OOO o0000O000O0OOO,
      float f,
      float g,
      float h,
      float i,
      int j,
      int k,
      O0000O00000 o0000O00000,
      ColorScheme o0000O000O0OO,
      float l
   ) {
      float var16 = o00000OOOOOOOO.O00000000() + o0000O00000.O00000000000() * 0.5F;
      float var17 = o00000OOOOOOOO.O000000000() + o0000O00000.O000000000000() * 0.5F;
      float var18 = 1.0F + l * 0.008F;
      o0000O00OO0O0.O00000000(f * var18, var16, var17);
      boolean var22 = false /* VF: Semaphore variable */;

      try {
         var22 = true;
         float var19 = i * (1.0F + l * 0.3F);
         this.O00000000(
            o0000O00OO0O0,
            o00000OOOOOOOO.O00000000(),
            o00000OOOOOOOO.O000000000(),
            o0000O00000.O00000000000(),
            o0000O00000.O000000000000(),
            o0000O00000.O00000000(24.0F),
            o0000O00000,
            o0000O000O0OOO,
            var19,
            g
         );
         this.O00000000(o0000O00OO0O0, drawContext, o0000O000O0O0, o00000OOOOOOOO, o0000O0000000, o0000O000O0OOO, g, j, k);
         this.O00000000(
            o0000O00OO0O0,
            o00000OOOOOOOO.O00000000(),
            o00000OOOOOOOO.O000000000(),
            o0000O00000.O00000000000(),
            o0000O00000.O000000000000(),
            o0000O00000.O00000000(24.0F),
            o0000O000O0OO
         );
         this.O00000000(
            o0000O00OO0O0,
            o00000OOOOOOOO.O00000000(),
            o00000OOOOOOOO.O000000000(),
            o0000O00000.O00000000000(),
            o0000O00000.O000000000000(),
            o0000O00000.O00000000(24.0F),
            o0000O000O0OOO,
            1.0F,
            g
         );
         this.O00000000(o0000O00OO0O0, o00000OOOOOOOO, o0000O00000, h);
         this.O000000000(o0000O00OO0O0, o0000O000O0O0, o00000OOOOOOOO, o0000O00000, o0000O000O0OO, g);
         var22 = false;
      } finally {
         if (var22) {
            o0000O00OO0O0.O00000000000O0();
         }
      }

      o0000O00OO0O0.O00000000000O0();
   }

   private void O00000000(
      RenderManager o0000O00OO0O0, O0000O000O0O0 o0000O000O0O0, O00000OOOOOOOO o00000OOOOOOOO, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, float f
   ) {
      boolean var7 = O00000OOOOOO0O.O000000000(o00000OOOOOOOO, o0000O00000, o0000O000O0O0.O0000000O(), o0000O000O0O0.O0000000O0());
      o0000O000O0O0.O0000000000(var7);
      boolean var8 = o0000O000O0O0.O0000000OO000O();
      float var9 = o0000O000O0O0.O00000000(O0000O000O00O0.O000000000O00(), !var7 && !var8 ? 0.0F : 1.0F, O0000O000O0O00.O00000000000OO());
      float var10 = o0000O000O0O0.O00000000(O0000O000O00O0.O000000000O000(), var8 ? 1.0F : 0.0F, O0000O000O0O00.O00000000000OO());
      float var11 = Math.max(var9, var10);
      float var12 = o0000O00000.O000000000(2.0F) + o0000O00000.O000000000(0.5F) * var11;
      float var13 = o0000O00000.O000000000(2.9F);
      float var14 = o0000O00000.O000000000(7.5F);
      float var15 = o00000OOOOOOOO.O000000000O00O() + o0000O00000.O000000000O0() - var14;
      float var16 = o00000OOOOOOOO.O000000000O0O() + o0000O00000.O000000000O00() - var14;
      int var17 = ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), o0000O000O0OO.O000000000O00(), 0.5F);
      if (var11 > 0.01F) {
         float var18 = 0.78F + 0.22F * (float)Math.sin(f * Math.PI * 2.4);
         float var19 = o0000O00000.O000000000(9.0F) * (0.35F + 0.65F * var11) * var18;
         float var20 = var15 - var13 * 0.5F;
         float var21 = var16 - var13 * 0.5F;
         o0000O00OO0O0.O00000000(
            var20 - var13 * 1.6F,
            var21 - var13 * 1.6F,
            var13 * 3.2F,
            var13 * 3.2F,
            var13 * 1.6F,
            var19,
            o0000O00000.O000000000(1.2F),
            ColorScheme.O00000000(var17, Math.round(82.0F * var11 * var18))
         );
      }

      for (int var26 = 0; var26 < 3; var26++) {
         int var27 = 3 - var26;
         float var28 = var16 - var26 * var13;

         for (int var29 = 0; var29 < var27; var29++) {
            float var22 = var15 - var29 * var13;
            float var23 = var12 * 0.5F;
            int var24 = ColorScheme.O00000000(O0000O00000OO.O00000000000(o0000O000O0OO), Math.round(Math.min(255.0F, 155.0F + 75.0F * var11)));
            int var25 = ColorScheme.O00000000(var24, ColorScheme.O00000000(var17, 240), var11 * 0.7F);
            if (var26 == 0 && var29 == 0) {
               var25 = ColorScheme.O00000000(
                  var25, o0000O000O0OO.O000000000O000() ? O0000O00000OO.O00000000000(o0000O000O0OO) : ColorScheme.O00000000(255, 255, 255, 255), var11 * 0.25F
               );
            }

            o0000O00OO0O0.O00000000(var22 - var23, var28 - var23, var12, var12, var12 * 0.5F, var25);
         }
      }
   }

   private void O000000000(
      RenderManager o0000O00OO0O0, O0000O000O0O0 o0000O000O0O0, O00000OOOOOOOO o00000OOOOOOOO, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, float f
   ) {
      boolean var7 = O00000OOOOOO0O.O00000000(o00000OOOOOOOO, o0000O00000, o0000O000O0O0.O0000000O(), o0000O000O0O0.O0000000O0());
      o0000O000O0O0.O000000000(var7);
      boolean var8 = o0000O000O0O0.O0000000O0OOO0();
      float var9 = o0000O000O0O0.O00000000(O0000O000O00O0.O000000000O(), !var7 && !var8 ? 0.0F : 1.0F, O0000O000O0O00.O00000000000OO());
      float var10 = o0000O000O0O0.O00000000(O0000O000O00O0.O000000000O0(), var8 ? 1.0F : 0.0F, O0000O000O0O00.O00000000000OO());
      float var11 = Math.max(var9, var10);
      float var12 = o0000O00000.O00000000(2.4F) + o0000O00000.O00000000(0.6F) * var11;
      float var13 = o0000O00000.O00000000(3.4F);
      float var14 = o0000O00000.O00000000(8.5F);
      float var15 = o00000OOOOOOOO.O00000000() + o0000O00000.O00000000000() - var14;
      float var16 = o00000OOOOOOOO.O000000000() + o0000O00000.O000000000000() - var14;
      int var17 = ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), o0000O000O0OO.O000000000O00(), 0.5F);

      for (int var18 = 0; var18 < 3; var18++) {
         int var19 = 3 - var18;
         float var20 = var16 - var18 * var13;

         for (int var21 = 0; var21 < var19; var21++) {
            float var22 = var15 - var21 * var13;
            float var23 = var12 * 3.0F;
            int var24 = ColorScheme.O00000000(O0000O00000OO.O00000000000(o0000O000O0OO), Math.round(Math.min(255.0F, 165.0F + 70.0F * var11)));
            int var25 = ColorScheme.O00000000(var24, ColorScheme.O00000000(var17, 240), var11 * 0.7F);
            if (var18 == 0 && var21 == 0) {
               var25 = ColorScheme.O00000000(
                  var25, o0000O000O0OO.O000000000O000() ? O0000O00000OO.O00000000000(o0000O000O0OO) : ColorScheme.O00000000(255, 255, 255, 255), var11 * 0.25F
               );
            }

            o0000O00OO0O0.O00000000(var22 - var23, var20 - var23, var12, var12, var12 * 0.5F, var25);
         }
      }
   }

   private void O00000000(
      RenderManager o0000O00OO0O0, float f, float g, float h, float i, float j, O0000O00000 o0000O00000, O0000O000O0OOO o0000O000O0OOO, float k, float l
   ) {
      if (O00000OO000O.O00000000().O00000000.O00000000000O.O000000000("Тень")) {
         ColorScheme var11 = o0000O000O0OOO.O0000000000000();
         if (var11.O000000000O000()) {
            if (o0000O000O0OOO.O00000000000() == Theme.VERNAL_SOLSTICE) {
               int var16 = ColorScheme.O00000000(10, 31, 10, Math.round(30.0F * k));
               int var17 = ColorScheme.O00000000(10, 31, 10, Math.round(12.0F * k));
               int var14 = ColorScheme.O00000000(var11.O000000000O00(), Math.round(11.0F * k * (0.78F + 0.22F * (float)Math.sin(l * Math.PI * 2.0))));
               o0000O00OO0O0.O00000000(f, g + o0000O00000.O00000000(3.0F), h, i, j, o0000O00000.O00000000(34.0F), o0000O00000.O00000000(3.2F), var16);
               o0000O00OO0O0.O00000000(f, g + o0000O00000.O00000000(10.0F), h, i, j, o0000O00000.O00000000(74.0F), o0000O00000.O00000000(8.0F), var17);
               o0000O00OO0O0.O00000000(f, g, h, i, j, o0000O00000.O00000000(42.0F), o0000O00000.O00000000(4.0F), var14);
            } else {
               o0000O00OO0O0.O00000000(
                  f,
                  g + o0000O00000.O00000000(2.0F),
                  h,
                  i,
                  j,
                  o0000O00000.O00000000(28.0F),
                  o0000O00000.O00000000(2.5F),
                  ColorScheme.O00000000(0, 0, 0, Math.round(38.0F * k))
               );
               o0000O00OO0O0.O00000000(
                  f,
                  g + o0000O00000.O00000000(8.0F),
                  h,
                  i,
                  j,
                  o0000O00000.O00000000(58.0F),
                  o0000O00000.O00000000(7.0F),
                  ColorScheme.O00000000(0, 0, 0, Math.round(18.0F * k))
               );
            }
         } else {
            o0000O00OO0O0.O00000000(
               f, g, h, i, j, o0000O00000.O00000000(14.0F), o0000O00000.O00000000(1.0F), ColorScheme.O00000000(0, 0, 0, Math.round(180.0F * k))
            );
            if (o0000O000O0OOO.O00000000000() == Theme.MIDNIGHT_AZURE) {
               float var15 = 0.78F + 0.22F * (float)Math.sin(l * Math.PI * 2.0);
               o0000O00OO0O0.O00000000(
                  f,
                  g + o0000O00000.O00000000(2.0F),
                  h,
                  i,
                  j,
                  o0000O00000.O00000000(44.0F) * var15,
                  o0000O00000.O00000000(5.5F),
                  ColorScheme.O00000000(var11.O000000000O0(), Math.round(28.0F * k * var15))
               );
               o0000O00OO0O0.O00000000(
                  f,
                  g,
                  h,
                  i,
                  j,
                  o0000O00000.O00000000(92.0F) * var15,
                  o0000O00000.O00000000(11.0F),
                  ColorScheme.O00000000(var11.O000000000O00(), Math.round(18.0F * k * var15))
               );
            } else {
               float var12 = 0.85F + 0.15F * (float)Math.sin(l * Math.PI * 2.0);
               int var13 = ColorScheme.O00000000(var11.O000000000O00(), var11.O000000000O0(), 0.5F);
               o0000O00OO0O0.O00000000(
                  f, g, h, i, j, o0000O00000.O00000000(60.0F) * var12, o0000O00000.O00000000(8.0F), ColorScheme.O00000000(var13, Math.round(5.0F * k * var12))
               );
            }
         }
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i, float j, O0000O000O0OOO o0000O000O0OOO, float k, float l) {
      if (o0000O000O0OOO.O00000000000() == Theme.VERNAL_SOLSTICE && !(k <= 0.001F)) {
         O0000O00000 var10 = o0000O000O0OOO.O000000000000();
         ColorScheme var11 = o0000O000O0OOO.O0000000000000();
         float var12 = Math.max(0.0F, Math.min(1.0F, k));
         float var13 = Math.max(var10.O00000000(80.0F), h * 0.22F);
         float var14 = h + var13 * 2.0F;
         float var15 = (l * 0.075F + f * 3.1E-4F + g * 1.9E-4F) % 1.0F;
         if (var15 < 0.0F) {
            var15++;
         }

         float var16 = f - var13 + var14 * var15;
         int var17 = ColorScheme.O00000000(var11.O000000000O00(), Math.round(42.0F * var12));
         int var18 = ColorScheme.O00000000(
            ColorScheme.O00000000(var11.O000000000O00(), ColorScheme.O00000000(255, 255, 255, 255), 0.42F), Math.round(60.0F * var12)
         );
         o0000O00OO0O0.O0000000000();
         o0000O00OO0O0.O00000000(f, g, h, i, j, j, j, j);

         try {
            o0000O00OO0O0.O00000000(var16, g + var10.O00000000(1.0F), var13 * 0.5F, Math.max(1.0F, var10.O00000000(1.1F)), 0.0F, 0, var17);
            o0000O00OO0O0.O00000000(var16 + var13 * 0.5F, g + var10.O00000000(1.0F), var13 * 0.5F, Math.max(1.0F, var10.O00000000(1.1F)), 0.0F, var18, 0);
            o0000O00OO0O0.O000000000(
               f + var10.O00000000(1.0F),
               g + j * 0.35F,
               Math.max(1.0F, var10.O00000000(1.0F)),
               Math.max(1.0F, i - j * 0.7F),
               0.0F,
               ColorScheme.O00000000(var11.O000000000O0(), Math.round(14.0F * var12)),
               ColorScheme.O00000000(var11.O000000000O00(), Math.round(10.0F * var12))
            );
         } finally {
            o0000O00OO0O0.O0000000000();
            o0000O00OO0O0.O0000000000000();
         }
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i, float j, ColorScheme o0000O000O0OO) {
      this.O00000000(o0000O00OO0O0, f, g, h, i, j, o0000O000O0OO, 1.0F);
   }

   private void O00000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i, float j, ColorScheme o0000O000O0OO, float k) {
      float var9 = Math.max(0.0F, Math.min(1.0F, k));
      if (o0000O000O0OO.O000000000O000()) {
         float var18 = Math.round(f);
         float var20 = Math.round(g);
         o0000O00OO0O0.O00000000(
            var18 + 1.0F,
            var20 + 1.0F,
            Math.max(0.0F, h - 2.0F),
            Math.max(0.0F, i - 2.0F),
            Math.max(0.0F, j - 1.0F),
            O0000O00000OO.O000000000(o0000O000O0OO, 0.92F * var9),
            1.0F
         );
         int var22 = ColorScheme.O00000000(ColorScheme.O00000000(255, 255, 255, 255), Math.round(58.0F * var9));
         float var24 = (h - j * 2.0F) * 0.5F;
         o0000O00OO0O0.O00000000(var18 + j, var20 + 1.0F, var24, 1.0F, 0.0F, ColorScheme.O00000000(var22, Math.round(10.0F * var9)), var22);
         o0000O00OO0O0.O00000000(var18 + j + var24, var20 + 1.0F, var24, 1.0F, 0.0F, var22, ColorScheme.O00000000(var22, Math.round(10.0F * var9)));
      } else if (this.O00000000(o0000O000O0OO)) {
         float var17 = Math.round(f);
         float var19 = Math.round(g);
         int var21 = ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), Math.round(52.0F * var9));
         int var23 = ColorScheme.O00000000(o0000O000O0OO.O000000000O00(), Math.round(34.0F * var9));
         o0000O00OO0O0.O00000000(var17 + 1.0F, var19 + 1.0F, Math.max(0.0F, h - 2.0F), Math.max(0.0F, i - 2.0F), Math.max(0.0F, j - 1.0F), var21, 1.0F);
         o0000O00OO0O0.O00000000(var17 - 1.0F, var19 - 1.0F, h + 2.0F, i + 2.0F, j + 1.0F, var23, 0.65F);
         float var25 = (h - j * 2.0F) * 0.5F;
         int var15 = ColorScheme.O00000000(
            ColorScheme.O00000000(ColorScheme.O00000000(255, 255, 255, 255), o0000O000O0OO.O000000000O0(), 0.34F), Math.round(46.0F * var9)
         );
         o0000O00OO0O0.O00000000(var17 + j, var19 + 1.0F, var25, 1.0F, 0.0F, ColorScheme.O00000000(var15, Math.round(4.0F * var9)), var15);
         o0000O00OO0O0.O00000000(var17 + j + var25, var19 + 1.0F, var25, 1.0F, 0.0F, var15, ColorScheme.O00000000(var15, Math.round(4.0F * var9)));
      } else {
         int var10 = ColorScheme.O00000000(ColorScheme.O00000000(255, 255, 255, 64), o0000O000O0OO.O000000000O0(), 0.3F);
         var10 = ColorScheme.O00000000(var10, Math.round(64.0F * var9));
         float var11 = Math.round(f);
         float var12 = Math.round(g);
         o0000O00OO0O0.O00000000(var11 - 1.0F, var12, h, i - 1.0F, Math.max(0.0F, j - 0.5F), var10, 1.5F);
         int var13 = ColorScheme.O00000000(
            ColorScheme.O00000000(ColorScheme.O00000000(255, 255, 255, 255), o0000O000O0OO.O000000000O0(), 0.2F), Math.round(30.0F * var9)
         );
         float var14 = (h - j * 2.0F) * 0.5F;
         o0000O00OO0O0.O00000000(var11 + j, var12, var14, 1.0F, 0.0F, ColorScheme.O00000000(var13, Math.round(5.0F * var9)), var13);
         o0000O00OO0O0.O00000000(var11 + j + var14, var12, var14, 1.0F, 0.0F, var13, ColorScheme.O00000000(var13, Math.round(5.0F * var9)));
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void O00000000(
      RenderManager o0000O00OO0O0,
      DrawContext drawContext,
      O0000O000O0O0 o0000O000O0O0,
      O00000OOOOOOOO o00000OOOOOOOO,
      O0000O0000000 o0000O0000000,
      O0000O000O0OOO o0000O000O0OOO,
      float f,
      int i,
      int j
   ) {
      O0000O00000 var10 = o0000O000O0OOO.O000000000000();
      ColorScheme var11 = o0000O000O0OOO.O0000000000000();
      float var12 = o00000OOOOOOOO.O00000000();
      float var13 = o00000OOOOOOOO.O000000000();
      float var14 = var10.O00000000000();
      float var15 = var10.O000000000000();
      float var16 = var10.O00000000(24.0F);
      o0000O00OO0O0.O00000000(
         var12 - 1.0F,
         var13 - 1.0F,
         var14 + 2.0F,
         var15 + 2.0F,
         var16 + 1.0F,
         var11.O000000000O000() ? ColorScheme.O00000000(255, 255, 255, 212) : ColorScheme.O00000000(15, 16, 19, 255)
      );
      o0000O00OO0O0.O00000000(var12, var13, var14, var15, var16, var11.O000000000O000() ? 0.96F : 0.92F);
      o0000O00OO0O0.O00000000(var12, var13, var14, var15, var16, O0000O00000OO.O000000000000O(var11));
      if (var11.O000000000O000()) {
         o0000O00OO0O0.O00000000(
            var12 + var10.O00000000(0.8F),
            var13 + var10.O00000000(0.8F),
            var14 - var10.O00000000(1.6F),
            var15 - var10.O00000000(1.6F),
            Math.max(0.0F, var16 - var10.O00000000(0.8F)),
            O0000O00000OO.O000000000(var11, 0.96F),
            var10.O00000000(0.85F)
         );
      }

      if (O00000OOOO0O00.O00000000().O000000000000(O00000OOOO00O.MENU_PANEL_BG)) {
         boolean var17 = this.O00000000(o0000O00OO0O0, O00000OOOO00O.MENU_PANEL_BG, null, var12, var13, var14, var15, var16, i, j, o0000O000O0O0, var11, 1.0F);
         if (var17) {
            o0000O00OO0O0.O00000000(
               var12,
               var13,
               var14,
               var15,
               var16,
               var11.O000000000O000()
                  ? ColorScheme.O00000000(O0000O00000OO.O000000000000O(var11), 58)
                  : ColorScheme.O00000000(var11.O0000000000000(), this.O00000000(var11) ? 74 : 42)
            );
         }
      }

      String var34 = this.O000000000();
      if (!var34.isBlank()) {
         boolean var18 = this.O00000000(o0000O00OO0O0, null, var34, var12, var13, var14, var15, var16, i, j, o0000O000O0O0, var11, 0.94F);
         if (var18) {
            o0000O00OO0O0.O00000000(
               var12,
               var13,
               var14,
               var15,
               var16,
               var11.O000000000O000()
                  ? ColorScheme.O00000000(O0000O00000OO.O000000000000O(var11), 54)
                  : ColorScheme.O00000000(var11.O0000000000000(), this.O00000000(var11) ? 68 : 38)
            );
         }
      }

      this.O000000000(o0000O00OO0O0, var12, var13, var14, var15, var16, var11, f);
      this.O00000000(o0000O00OO0O0, var12, var13, var14, var15, var16, f);
      this.O000000000.O00000000(o0000O00OO0O0, o0000O000O0O0, o00000OOOOOOOO, o0000O000O0OOO);
      this.O0000000000.O00000000(o0000O00OO0O0, o0000O000O0O0, o00000OOOOOOOO, o0000O000O0OOO);
      float var35 = o0000O000O0O0.O00000000(O0000O000O00O0.O0000000000OO());
      if (var35 > 0.01F) {
         float var19 = this.O000000000000.O00000000(var10);
         float var20 = (var19 + var10.O00000000(48.0F)) * var35;
         float var21 = 1.0F - var35 * 0.04F;
         float var22 = o00000OOOOOOOO.O0000000000O() + o00000OOOOOOOO.O0000000000O00() * 0.5F + var20 * 0.5F;
         float var23 = o00000OOOOOOOO.O0000000000O0() + var10.O0000000000O00() * 0.5F;
         o0000O00OO0O0.O0000000000();
         o0000O00OO0O0.O00000000(
            o00000OOOOOOOO.O0000000000O(),
            o00000OOOOOOOO.O0000000000O0(),
            o00000OOOOOOOO.O0000000000O00(),
            var10.O0000000000O00(),
            var10.O00000000(4.0F),
            var10.O00000000(4.0F),
            var10.O00000000(16.0F),
            var10.O00000000(4.0F)
         );
         boolean var28 = false /* VF: Semaphore variable */;

         try {
            var28 = true;
            o0000O00OO0O0.O00000000(var21, var22, var23);
            o0000O00OO0O0.O00000000(var20, 0.0F);
            o0000O00OO0O0.O000000000000(1.0F - var35 * 0.5F);
            boolean var31 = false /* VF: Semaphore variable */;

            try {
               var31 = true;
               this.O00000000000.O00000000(o0000O00OO0O0, drawContext, o0000O000O0O0, o00000OOOOOOOO, o0000O0000000, o0000O000O0OOO);
               var31 = false;
            } finally {
               if (var31) {
                  o0000O00OO0O0.O00000000000OO();
                  o0000O00OO0O0.O00000000000O();
                  o0000O00OO0O0.O00000000000O0();
               }
            }

            o0000O00OO0O0.O00000000000OO();
            o0000O00OO0O0.O00000000000O();
            o0000O00OO0O0.O00000000000O0();
            o0000O00OO0O0.O00000000(
               o00000OOOOOOOO.O0000000000O(),
               o00000OOOOOOOO.O0000000000O0(),
               o00000OOOOOOOO.O0000000000O00(),
               var10.O0000000000O00(),
               var11.O000000000O000()
                  ? ColorScheme.O00000000(255, 255, 255, Math.round(74.0F * var35))
                  : ColorScheme.O00000000(0, 0, 0, Math.round(60.0F * var35))
            );
            var28 = false;
         } finally {
            if (var28) {
               o0000O00OO0O0.O0000000000();
               o0000O00OO0O0.O0000000000000();
            }
         }

         o0000O00OO0O0.O0000000000();
         o0000O00OO0O0.O0000000000000();
      } else {
         this.O00000000000.O00000000(o0000O00OO0O0, drawContext, o0000O000O0O0, o00000OOOOOOOO, o0000O0000000, o0000O000O0OOO);
      }

      this.O000000000000.O00000000(o0000O00OO0O0, o0000O000O0O0, o00000OOOOOOOO, o0000O000O0OOO, var35);
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void O000000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i, float j, ColorScheme o0000O000O0OO, float k) {
      if (MenuModule.O00000000(MenuModule.O00000000O000)) {
         if (!o0000O000O0OO.O000000000O000()) {
            o0000O00OO0O0.O0000000000();
            o0000O00OO0O0.O00000000(f, g, h, i, j, j, j, j);
            boolean var24 = false /* VF: Semaphore variable */;

            try {
               var24 = true;
               float var9 = k * (float) (Math.PI * 2);
               float var10 = 0.8F + 0.2F * (float)Math.sin(var9 * 0.2);
               float var11 = h * 0.8F;
               float var12 = i * 0.65F;
               float var13 = Math.min(var11, var12) * 0.5F;
               float var14 = f + h * 0.06F + (float)Math.cos(var9 * 0.08) * h * 0.03F;
               float var15 = g + i * 0.04F + (float)Math.sin(var9 * 0.06) * i * 0.02F;
               o0000O00OO0O0.O00000000(
                  var14, var15, var11, var12, var13, var11 * 0.5F, var11 * 0.15F, ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), Math.round(3.0F * var10))
               );
               float var16 = 0.75F + 0.25F * (float)Math.sin(var9 * 0.25 + 2.094F);
               float var17 = h * 0.7F;
               float var18 = i * 0.6F;
               float var19 = Math.min(var17, var18) * 0.5F;
               float var20 = f + h * 0.35F + (float)Math.cos(var9 * 0.1 + 1.5) * h * 0.05F;
               float var21 = g + i * 0.45F + (float)Math.sin(var9 * 0.07 + 0.8F) * i * 0.04F;
               o0000O00OO0O0.O00000000(
                  var20,
                  var21,
                  var17,
                  var18,
                  var19,
                  var17 * 0.45F,
                  var17 * 0.1F,
                  ColorScheme.O00000000(o0000O000O0OO.O000000000O00(), Math.round(2.0F * var16))
               );
               var24 = false;
            } finally {
               if (var24) {
                  o0000O00OO0O0.O0000000000();
                  o0000O00OO0O0.O0000000000000();
               }
            }

            o0000O00OO0O0.O0000000000();
            o0000O00OO0O0.O0000000000000();
         }
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private boolean O00000000(
      RenderManager o0000O00OO0O0,
      O00000OOOO00O o00000OOOO00O,
      String string,
      float f,
      float g,
      float h,
      float i,
      float j,
      int k,
      int l,
      O0000O000O0O0 o0000O000O0O0,
      ColorScheme o0000O000O0OO,
      float m
   ) {
      O000000000000O.O00000000(k, l);
      if (!O000000000000O.O000000000000()) {
         return false;
      } else {
         o0000O00OO0O0.O0000000000();
         O0000O00O0OOO0.W373 var15 = O0000O00O0OOO0.O00000000();
         float[] var16 = new float[4];
         GL11.glGetFloatv(3106, var16);
         boolean var23 = false /* VF: Semaphore variable */;

         boolean var14;
         try {
            var23 = true;
            O000000000000O.O00000000();
            GL11.glDisable(3089);
            GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
            GL11.glClear(16384);
            var14 = string != null
               ? O00000OOOO00OO.O00000000(string, f, g, h, i, k, l, o0000O000O0O0.O0000000O(), o0000O000O0O0.O0000000O0(), o0000O000O0OO, m)
               : O00000OOOO00OO.O00000000(o00000OOOO00O, f, g, h, i, k, l, o0000O000O0O0.O0000000O(), o0000O000O0O0.O0000000O0(), o0000O000O0OO, m);
            var23 = false;
         } finally {
            if (var23) {
               GL11.glClearColor(var16[0], var16[1], var16[2], var16[3]);
               O0000O00O0OOO0.O00000000(var15);
            }
         }

         GL11.glClearColor(var16[0], var16[1], var16[2], var16[3]);
         O0000O00O0OOO0.O00000000(var15);
         if (!var14) {
            return false;
         } else {
            o0000O00OO0O0.O0000000000();
            o0000O00OO0O0.O00000000(f, g, h, i, j, j, j, j);

            try {
               o0000O00OO0O0.O000000000(O000000000000O.O000000000(), 0.0F, 0.0F, (float)k, (float)l);
            } finally {
               o0000O00OO0O0.O0000000000();
               o0000O00OO0O0.O0000000000000();
            }

            return true;
         }
      }
   }

   private String O000000000() {
      try {
         return MenuModule.O00000000OO0O.O0000000000O0O();
      } catch (Throwable var2) {
         return "";
      }
   }

   private boolean O00000000(ColorScheme o0000O000O0OO) {
      return o0000O000O0OO != null && (o0000O000O0OO.O000000000O0() & 16777215) == 61695 && (o0000O000O0OO.O000000000O00() & 16777215) == 17663;
   }

   private void O00000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i, float j, float k) {
      if (MenuModule.O00000000(MenuModule.O00000000O0000)) {
         o0000O00OO0O0.O0000000000();
         o0000O00OO0O0.O00000000(f, g, h, i, j, j, j, j);

         try {
            long var8 = (long)(k * 10000.0F);
            float var10 = 40.0F;
            float var11 = 40.0F;
            int var12 = (int)Math.ceil(h / var10) + 1;
            int var13 = (int)Math.ceil(i / var11) + 1;

            for (int var14 = 0; var14 < var13; var14++) {
               for (int var15 = 0; var15 < var12; var15++) {
                  long var16 = var8 + var15 * 73856093L + var14 * 19349663L ^ 25214903917L;
                  var16 = var16 * 6364136223846793005L + 1442695040888963407L;
                  int var18 = (int)(var16 >>> 48 & 15L);
                  if (var18 <= 5) {
                     int var19 = 3 + (var18 & 3);
                     float var20 = f + var15 * var10 + (float)(var16 >>> 32 & 31L) - 16.0F;
                     float var21 = g + var14 * var11 + (float)(var16 >>> 16 & 31L) - 16.0F;
                     float var22 = 1.0F + (var18 & 1);
                     int var23 = (var18 & 1) == 0 ? ColorScheme.O00000000(255, 255, 255, var19) : ColorScheme.O00000000(0, 0, 0, var19 + 1);
                     o0000O00OO0O0.O00000000(var20, var21, var22, var22, 0.5F, var23);
                  }
               }
            }
         } finally {
            o0000O00OO0O0.O0000000000();
            o0000O00OO0O0.O0000000000000();
         }
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, O00000OOOOOOOO o00000OOOOOOOO, O0000O00000 o0000O00000, float f) {
      if (!(f <= 0.0F) && !(f >= 1.0F)) {
         float var5 = o00000OOOOOOOO.O00000000();
         float var6 = o00000OOOOOOOO.O000000000();
         float var7 = o0000O00000.O00000000000();
         float var8 = o0000O00000.O000000000000();
         float var9 = o0000O00000.O00000000(24.0F);
         float var10 = var7 * 0.18F;
         float var11 = var5 + (var7 + var10 * 2.0F) * f - var10;
         float var12 = Math.max(var5, var11 - var10 * 0.5F);
         float var13 = Math.min(var5 + var7, var11 + var10 * 0.5F);
         if (!(var13 <= var12)) {
            float var14 = (float)Math.sin(f * Math.PI);
            float var15 = 0.08F * var14;
            float var16 = f * 360.0F;
            int var17 = O0000O00000OO.O000000000(var16, 0.7F, 0.6F, var15);
            int var18 = O0000O00000OO.O000000000((var16 + 60.0F) % 360.0F, 0.7F, 0.6F, var15 * 0.5F);
            o0000O00OO0O0.O0000000000();
            o0000O00OO0O0.O00000000(var5, var6, var7, var8, var9, var9, var9, var9);

            try {
               o0000O00OO0O0.O00000000(var12, var6, var13 - var12, var8, var17, var18);
            } finally {
               o0000O00OO0O0.O0000000000();
               o0000O00OO0O0.O0000000000000();
            }
         }
      }
   }

   @Generated
   public ClickGuiRenderer(
      O0000O0000OOOO o0000O0000OOOO,
      O0000O0000OOO0 o0000O0000OOO0,
      SearchBarRenderer o0000O0000O0O,
      O0000O0000O00O o0000O0000O00O,
      O0000O0000OO00 o0000O0000OO00,
      O0000O000O o0000O000O
   ) {
      this.O00000000 = o0000O0000OOOO;
      this.O000000000 = o0000O0000OOO0;
      this.O0000000000 = o0000O0000O0O;
      this.O00000000000 = o0000O0000O00O;
      this.O000000000000 = o0000O0000OO00;
      this.O0000000000000 = o0000O000O;
   }
}
