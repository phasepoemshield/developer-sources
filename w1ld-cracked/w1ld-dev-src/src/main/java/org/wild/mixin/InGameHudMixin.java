package org.wild.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_10868;
import net.minecraft.class_11223;
import net.minecraft.class_1297;
import net.minecraft.class_2561;
import net.minecraft.class_266;
import net.minecraft.class_276;
import net.minecraft.class_2960;
import net.minecraft.class_304;
import net.minecraft.class_310;
import net.minecraft.class_327;
import net.minecraft.class_329;
import net.minecraft.class_332;
import net.minecraft.class_9779;
import org.joml.Matrix4f;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.metaculture.protection.NUvnVVNvvu;
import ru.metaculture.protection.NVnVnNnN;
import ru.metaculture.protection.NVunNNNNuN;
import ru.metaculture.protection.NnUuNVvUvvNn;
import ru.metaculture.protection.O0C0OC0OCcCO;
import ru.metaculture.protection.UNVnvUUUVv;
import ru.metaculture.protection.UNuuvNvuvV;
import ru.metaculture.protection.UnVNvNnU;
import ru.metaculture.protection.UnVVnUuvNvu;
import ru.metaculture.protection.VNNNVuNvvNvn;
import ru.metaculture.protection.VUnUUUVVnvVV;
import ru.metaculture.protection.VnNnNnvuvn;
import ru.metaculture.protection.VuVNuuUUv;
import ru.metaculture.protection.VunUNUNVUnv;
import ru.metaculture.protection.VvNUnuUUuN;
import ru.metaculture.protection.VvuuVNVUn;
import ru.metaculture.protection.nNuUNVu;
import ru.metaculture.protection.nVvVVUun;
import ru.metaculture.protection.nuUnNNVUUnU;
import ru.metaculture.protection.o000O0C0Oco0;
import ru.metaculture.protection.o00Co0coo0o;
import ru.metaculture.protection.uuUnvvnNUU;
import ru.metaculture.protection.uuuUNnu;
import ru.metaculture.protection.vNvnnVvvVUu;
import ru.metaculture.protection.vUVNnnuUNVVv;
import ru.metaculture.protection.vuNUvnNUuV;
import ru.metaculture.protection.wvVWvvWvww;

@Environment(EnvType.CLIENT)
@Mixin({class_329.class})
public class InGameHudMixin {
   @Unique
   private static final O0C0OC0OCcCO wild$cachedEventScreen = new O0C0OC0OCcCO();
   @Unique
   private long wild$lastCorruptionFrameMs;
   @Unique
   private float wild$heldTearY;
   @Unique
   private float wild$heldTearH;
   @Unique
   private float wild$heldTearShift;
   @Unique
   private float wild$panicWhite;
   @Unique
   private float wild$panicBlack;

   @Inject(
      method = {"renderCrosshair"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onRenderCrosshair(class_332 var1, class_9779 var2, CallbackInfo var3) {
      class_310 var4 = class_310.method_1551();
      if (VvNUnuUUuN.uNNnnnuuuN()) {
         var3.cancel();
      } else {
         if (vUVNnnuUNVVv.UuuNnUvUuv()
            || var4.field_1755 instanceof o00Co0coo0o
            || var4.field_1755 instanceof nuUnNNVUUnU
            || var4.field_1755 instanceof NVunNNNNuN
            || var4.field_1755 instanceof wvVWvvWvww
            || var4.field_1755 instanceof UNVnvUUUVv) {
            var3.cancel();
         }
      }
   }

   @Inject(
      method = {"renderStatusEffectOverlay"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onRenderStatusEffects(class_332 var1, class_9779 var2, CallbackInfo var3) {
      if (VvNUnuUUuN.uNNnnnuuuN()) {
         var3.cancel();
      } else {
         if (o000O0C0Oco0.uNnUnnuNUnNu.C00OOC00oO("Potions") || wild$noRenderPotions()) {
            var3.cancel();
         }
      }
   }

   @Inject(
      method = {"renderHotbar"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onRenderHotbar(class_332 var1, class_9779 var2, CallbackInfo var3) {
      if (VvNUnuUUuN.uNNnnnuuuN()) {
         var3.cancel();
      } else {
         if (wild$customHotbarActive() || this.wild$foundryOverlayVisible() || class_310.method_1551().field_1755 instanceof NVunNNNNuN) {
            var3.cancel();
         }
      }
   }

   @Unique
   private boolean wild$foundryOverlayVisible() {
      class_310 var1 = class_310.method_1551();
      return var1 != null && var1.field_1755 instanceof nuUnNNVUUnU var2 ? var2.UuUVuuUu().UuUVuuUu() : false;
   }

   @Inject(
      method = {"renderStatusBars"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 0
   )
   private void onRenderStatusBars(class_332 var1, CallbackInfo var2) {
      if (VvNUnuUUuN.uNNnnnuuuN() || wild$customHotbarActive()) {
         var2.cancel();
      }
   }

   @Inject(
      method = {"renderHeldItemTooltip"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 0
   )
   private void wild$cancelHeldItemTooltip(class_332 var1, CallbackInfo var2) {
      if (VvNUnuUUuN.uNNnnnuuuN() || wild$customHotbarActive()) {
         var2.cancel();
      }
   }

   @Inject(
      method = {"renderScoreboardSidebar(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/scoreboard/ScoreboardObjective;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onRenderScoreboardSidebar(class_332 var1, class_266 var2, CallbackInfo var3) {
      if (NVnVnNnN.vNUvnnVnUvu()) {
         if (VvNUnuUUuN.uNNnnnuuuN()) {
            var3.cancel();
         } else {
            UnVVnUuvNvu var4 = NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(UnVVnUuvNvu.class);
            if (var4 != null && var4.nuUnNvnuUu && var4.UvUvUNuvNU.uUnuvNvvNU()) {
               var3.cancel();
            }
         }
      }
   }

   @Inject(
      method = {"renderMainHud"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 0
   )
   private void wild$cancelMainHudDuringCorruption(class_332 var1, class_9779 var2, CallbackInfo var3) {
      if (VvNUnuUUuN.uNNnnnuuuN()) {
         var3.cancel();
      }
   }

   @Inject(
      method = {"renderPlayerList"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 0
   )
   private void wild$cancelPlayerListDuringCorruption(class_332 var1, class_9779 var2, CallbackInfo var3) {
      if (VvNUnuUUuN.uNNnnnuuuN()) {
         var3.cancel();
      }
   }

   @Inject(
      method = {"renderOverlayMessage"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 0
   )
   private void wild$cancelOverlayMessageDuringCorruption(class_332 var1, class_9779 var2, CallbackInfo var3) {
      if (VvNUnuUUuN.uNNnnnuuuN()) {
         var3.cancel();
      }
   }

   @Inject(
      method = {"renderTitleAndSubtitle"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 0
   )
   private void wild$cancelTitleDuringCorruption(class_332 var1, class_9779 var2, CallbackInfo var3) {
      if (VvNUnuUUuN.uNNnnnuuuN()) {
         var3.cancel();
      }
   }

   @Inject(
      method = {"renderVignetteOverlay"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 0
   )
   private void wild$cancelVignette(class_332 var1, class_1297 var2, CallbackInfo var3) {
      if (uuUnvvnNUU.UuUVuuUu("Виньетка")) {
         var3.cancel();
      }
   }

   @Inject(
      method = {"renderSpyglassOverlay"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 0
   )
   private void wild$cancelSpyglass(class_332 var1, float var2, CallbackInfo var3) {
      if (uuUnvvnNUU.UuUVuuUu("Подзорная труба")) {
         var3.cancel();
      }
   }

   @Inject(
      method = {"renderPortalOverlay"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 0
   )
   private void wild$cancelPortalOverlay(class_332 var1, float var2, CallbackInfo var3) {
      if (uuUnvvnNUU.UuUVuuUu("Портал")) {
         var3.cancel();
      }
   }

   @Inject(
      method = {"renderNauseaOverlay"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 0
   )
   private void wild$cancelNauseaOverlay(class_332 var1, float var2, CallbackInfo var3) {
      if (uuUnvvnNUU.UuUVuuUu("Тошнота (экран)")) {
         var3.cancel();
      }
   }

   @Inject(
      method = {"renderOverlay"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 0
   )
   private void wild$cancelMiscOverlay(class_332 var1, class_2960 var2, float var3, CallbackInfo var4) {
      if (var2 != null) {
         String var5 = var2.method_12832();
         if (var5.contains("pumpkin") && uuUnvvnNUU.UuUVuuUu("Тыква")) {
            var4.cancel();
         } else {
            if (var5.contains("powder_snow") && uuUnvvnNUU.UuUVuuUu("Порошковый снег")) {
               var4.cancel();
            }
         }
      }
   }

   @Redirect(
      method = {"renderPlayerList"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/option/KeyBinding;isPressed()Z"
      ),
      require = 0
   )
   private boolean wild$keepTabListForClose(class_304 var1) {
      if (!NVnVnNnN.vNUvnnVnUvu()) {
         return false;
      } else if (VvNUnuUUuN.uNNnnnuuuN()) {
         return false;
      } else {
         boolean var2 = var1.method_1434();
         if (NVnVnNnN.unNNVVNnvvV() && NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.C00OOC00oO != null) {
            nVvVVUun var3 = NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(nVvVVUun.class);
            return var3 != null && var3.nuUnNvnuUu && var3.NVNnnvnuunNv.C00OOC00oO("Таб") ? var3.uUnuvNvvNU(var2) : var2;
         } else {
            return var2;
         }
      }
   }

   @Redirect(
      method = {"renderScoreboardSidebar(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/scoreboard/ScoreboardObjective;)V"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/scoreboard/ScoreboardObjective;getDisplayName()Lnet/minecraft/text/Text;"
      )
   )
   private class_2561 litka$maskScoreboardTitle(class_266 var1) {
      if (VvNUnuUUuN.uNNnnnuuuN()) {
         return class_2561.method_43473();
      } else if (var1 == null) {
         return class_2561.method_43473();
      } else {
         class_2561 var2 = var1.method_1114();
         return (class_2561)(var2 != null ? UnVVnUuvNvu.UuUVuuUu(var2) : class_2561.method_43473());
      }
   }

   @Redirect(
      method = {"renderMainHud"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/hud/bar/Bar;drawExperienceLevel(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/client/font/TextRenderer;I)V"
      )
   )
   private void redirectDrawExperienceLevel(class_332 var1, class_327 var2, int var3) {
      if (!VvNUnuUUuN.uNNnnnuuuN() && !wild$customHotbarActive()) {
         class_11223.method_70866(var1, var2, var3);
      }
   }

   @Redirect(
      method = {"renderMainHud"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/hud/bar/Bar;renderBar(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/client/render/RenderTickCounter;)V"
      ),
      require = 0
   )
   private void redirectRenderBar(class_11223 var1, class_332 var2, class_9779 var3) {
      if (!VvNUnuUUuN.uNNnnnuuuN()) {
         if (!wild$customHotbarActive()) {
            var1.method_70865(var2, var3);
         }
      }
   }

   @Redirect(
      method = {"renderMainHud"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/hud/bar/Bar;renderAddons(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/client/render/RenderTickCounter;)V"
      ),
      require = 0
   )
   private void redirectRenderAddons(class_11223 var1, class_332 var2, class_9779 var3) {
      if (!VvNUnuUUuN.uNNnnnuuuN()) {
         if (!wild$customHotbarActive()) {
            var1.method_70868(var2, var3);
         }
      }
   }

   @Inject(
      method = {"render"},
      at = {@At("HEAD")}
   )
   private void wild$applyColorPlus(class_332 var1, class_9779 var2, CallbackInfo var3) {
      if (NVnVnNnN.vNUvnnVnUvu()) {
         if (NVnVnNnN.unNNVVNnvvV()) {
            if (NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.C00OOC00oO != null) {
               UNuuvNvuvV var4;
               VNNNVuNvvNvn var5;
               try {
                  var4 = (UNuuvNvuvV)NVnVnNnN.UuUVuuUu.C00OOC00oO.C00OOC00oO(UNuuvNvuvV.class);
                  var5 = (VNNNVuNvvNvn)NVnVnNnN.UuUVuuUu.C00OOC00oO.C00OOC00oO(VNNNVuNvvNvn.class);
               } catch (Throwable var20) {
                  return;
               }

               boolean var6 = var4 != null && var4.nuUnNvnuUu;
               boolean var7 = var5 != null && var5.nuUnNvnuUu;
               if (var6 || var7) {
                  class_310 var8 = class_310.method_1551();
                  if (var8 != null && var8.field_1687 != null && var8.field_1724 != null) {
                     if (var8.method_22683() != null) {
                        int var9 = var8.method_22683().method_4489();
                        int var10 = var8.method_22683().method_4506();
                        if (var9 > 1 && var10 > 1) {
                           class_276 var11 = var8.method_1522();
                           if (var11 != null) {
                              if (var11.method_30277() instanceof class_10868 var13) {
                                 int var14 = var13.method_68427();
                                 if (var14 > 0) {
                                    if (var7) {
                                       if (var8.field_1755 == null) {
                                          try {
                                             vuNUvnNUuV.UuUVuuUu()
                                                .UuUVuuUu(
                                                   var8,
                                                   var8.field_1773.method_19418(),
                                                   new Matrix4f(VnNnNnvuvn.uUnuvNvvNU),
                                                   new Matrix4f(VnNnNnvuvn.UuUVuuUu),
                                                   var5.UuuNnUvUuv()
                                                );
                                          } catch (Throwable var19) {
                                             System.err.println("[SilkFlow] apply failed: " + var19.getMessage());
                                          }
                                       } else {
                                          vuNUvnNUuV.UuUVuuUu().C00OOC00oO();
                                       }
                                    }

                                    if (var6) {
                                       uuuUNnu var15 = var4.UuuNnUvUuv();
                                       VuVNuuUUv.NVnVnNnN var16 = new VuVNuuUUv.NVnVnNnN();
                                       var16.UuUVuuUu = var4.uVunuUNVVUUV.uUnuvNvvNU();
                                       var16.C00OOC00oO = var15.C00OOC00oO + var4.uNnUnnuNUnNu.uUnuvNvvNU();
                                       var16.uUnuvNvvNU = var15.uUnuvNvvNU + var4.NnUuNNU.uUnuvNvvNU();
                                       var16.vVvUvVVuuNvV = var15.vVvUvVVuuNvV + var4.nNvNUVU.uUnuvNvvNU();
                                       var16.uNNnnnuuuN = var15.uNNnnnuuuN + var4.UnUNuUU.uUnuvNvvNU();
                                       var16.nuUnNvnuUu = var15.nuUnNvnuUu + var4.uUVuVvuNUvnu.uUnuvNvvNU();
                                       var16.VVuuUN = var15.VVuuUN + var4.UvUvUNuvNU.uUnuvNvvNU();
                                       var16.vNUvnnVnUvu = var15.vNUvnnVnUvu + var4.c0oOOCcCoC0.uUnuvNvvNU();
                                       var16.uVUuuVnNVU = var15.uVUuuVnNVU[0];
                                       var16.vuuuNvNuv = var15.uVUuuVnNVU[1];
                                       var16.nvUVNnuu = var15.uVUuuVnNVU[2];
                                       var16.UuuNnUvUuv = var15.vuuuNvNuv[0];
                                       var16.nUUVuvU = var15.vuuuNvNuv[1];
                                       var16.UnUNVVVNuv = var15.vuuuNvNuv[2];
                                       var16.vNVuvnUUnuUn = var15.nvUVNnuu[0];
                                       var16.UvnvNVnnnnNU = var15.nvUVNnuu[1];
                                       var16.uVUVnuvnuVuv = var15.nvUVNnuu[2];
                                       var16.NVNnnvnuunNv = 0.0F;
                                       var16.uVunuUNVVUUV = var15.nUUVuvU;
                                       var16.UNnVVNvvnVvU = var15.UnUNVVVNuv;
                                       var16.uNnUnnuNUnNu = var4.UNnVVNvvnVvU.uUnuvNvvNU()
                                          ? Math.max(0.0F, var15.vNVuvnUUnuUn + var4.unNNVVNnvvV.uUnuvNvvNU())
                                          : 0.0F;
                                       var16.NnUuNNU = Math.max(0.0F, var15.UvnvNVnnnnNU + var4.NuunnvnN.uUnuvNvvNU());
                                       var16.nNvNUVU = true;

                                       try {
                                          VuVNuuUUv.UuUVuuUu().UuUVuuUu(var14, var9, var10, var16);
                                       } catch (Throwable var18) {
                                          System.err.println("[ColorPlus] apply failed: " + var18.getMessage());
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @Inject(
      method = {"render"},
      at = {@At("RETURN")}
   )
   private void onRenderHud(class_332 var1, class_9779 var2, CallbackInfo var3) {
      if (NVnVnNnN.unNNVVNnvvV()) {
         class_310 var4 = class_310.method_1551();
         if (var4 != null && var4.field_1724 != null && var4.field_1687 != null && var4.method_22683() != null) {
            int var5 = var4.method_22683().method_4489();
            int var6 = var4.method_22683().method_4506();
            if (var5 > 0 && var6 > 0) {
               try {
                  NVnVnNnN.uVUuuVnNVU();
               } catch (Throwable var25) {
                  return;
               }

               if (NVnVnNnN.UuUVuuUu() != null) {
                  VvuuVNVUn.NVnVnNnN var7 = VvuuVNVUn.UuUVuuUu();
                  int var8 = 0;

                  try {
                     try {
                        vNvnnVvvVUu.C00OOC00oO();
                     } catch (Throwable var24) {
                     }

                     class_276 var9 = var4.method_1522();
                     if (var9 != null) {
                        if (var9.method_30277() instanceof class_10868 var11) {
                           int var12 = var11.method_68427();
                           var8 = NnUuNVvUvvNn.UuUVuuUu();
                           if (var8 == 0) {
                              VvuuVNVUn.UuUVuuUu(36009, var7.UuUVuuUu);
                              VvuuVNVUn.UuUVuuUu(36008, var7.C00OOC00oO);
                           } else {
                              GL30.glBindFramebuffer(36160, var8);
                              GL30.glFramebufferTexture2D(36160, 36064, 3553, var12, 0);
                              GL11.glDrawBuffer(36064);
                              if (GL30.glCheckFramebufferStatus(36160) != 36053) {
                                 GL30.glDeleteFramebuffers(var8);
                                 NnUuNVvUvvNn.UuUVuuUu(var8);
                                 var8 = 0;
                                 VvuuVNVUn.UuUVuuUu(36009, var7.UuUVuuUu);
                                 VvuuVNVUn.UuUVuuUu(36008, var7.C00OOC00oO);
                              }
                           }
                        } else {
                           VvuuVNVUn.UuUVuuUu(36009, var7.UuUVuuUu);
                           VvuuVNVUn.UuUVuuUu(36008, var7.C00OOC00oO);
                        }
                     } else {
                        VvuuVNVUn.UuUVuuUu(36009, var7.UuUVuuUu);
                        VvuuVNVUn.UuUVuuUu(36008, var7.C00OOC00oO);
                     }

                     GL11.glColorMask(true, true, true, true);
                     GL11.glDisable(2929);
                     GL11.glEnable(3042);
                     UnVNvNnU var28 = NVnVnNnN.UuUVuuUu();
                     if (var28 == null) {
                        return;
                     }

                     nNuUNVu var29 = nNuUNVu.UuUVuuUu();
                     var29.UuUVuuUu(var4, var28, var5, var6);
                     var29.uUnuvNvvNU();
                     boolean var30 = VvNUnuUUuN.uNNnnnuuuN();
                     VUnUUUVVnvVV.UuUVuuUu();
                     boolean var13 = false;

                     try {
                        var28.UuUVuuUu(var5, var6);
                        var13 = true;
                        if (var30) {
                           this.wild$drawCorruption(var28, var5, var6);
                        } else {
                           wild$cachedEventScreen.UuUVuuUu(var4, var28, vNvnnVvvVUu.UuUVuuUu, var5, var6, var1);
                           NUvnVVNvvu.UuUVuuUu((VunUNUNVUnv)wild$cachedEventScreen);
                        }
                     } finally {
                        if (var13) {
                           var28.C00OOC00oO();
                           var29.vVvUvVVuuNvV();
                        }
                     }
                  } finally {
                     if (var8 != 0) {
                        GL30.glBindFramebuffer(36160, var8);
                        GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                     }

                     VvuuVNVUn.uUnuvNvvNU(var7);
                  }
               }
            } else {
               NVnVnNnN.UuUVuuUu(var5, var6);
            }
         }
      }
   }

   @Unique
   private void wild$drawCorruption(UnVNvNnU var1, int var2, int var3) {
      if (var2 > 0 && var3 > 0) {
         long var4 = System.currentTimeMillis();
         if (var4 - this.wild$lastCorruptionFrameMs > 28L || VvNUnuUUuN.UuUVuuUu(9182, 120L, 0.36F, 42L)) {
            this.wild$lastCorruptionFrameMs = var4;
            this.wild$heldTearY = wild$norm(VvNUnuUUuN.C00OOC00oO(901)) * var3;
            this.wild$heldTearH = 8.0F + Math.abs(VvNUnuUUuN.C00OOC00oO(902)) * var3 * 0.22F;
            this.wild$heldTearShift = VvNUnuUUuN.C00OOC00oO(903) * var2 * 0.42F;
         }

         int var6 = VvNUnuUUuN.UuuNnUvUuv();
         float var7 = VvNUnuUUuN.nUUVuvU();
         float var8 = VvNUnuUUuN.UuUVuuUu(1250000000L, 2250000000L);
         if (VvNUnuUUuN.uVunuUNVVUUV()) {
            this.wild$panicWhite = Math.min(1.0F, this.wild$panicWhite + 0.68F + VvNUnuUUuN.nVVUuvuNnUN() * 0.24F);
         } else {
            this.wild$panicWhite *= 0.58F;
         }

         if (VvNUnuUUuN.uVUVnuvnuVuv()) {
            this.wild$panicBlack = Math.min(1.0F, this.wild$panicBlack + 0.38F + VvNUnuUUuN.nnuUVNUuvvVU() * 0.32F);
         } else {
            this.wild$panicBlack *= 0.72F;
         }

         this.wild$drawNoHudVoid(var1, var2, var3, var6, var7, var8);
         this.wild$drawBacklightPulse(var1, var2, var3, var6, var7);
         this.wild$drawScanMatrix(var1, var2, var3, var6, var7);
         this.wild$drawHeldTear(var1, var2, var3, var6, var7);
         this.wild$drawTconFailure(var1, var2, var3, var6, var7);
         this.wild$drawVramFailure(var1, var2, var3, var6, var7);
         this.wild$drawDeadPixels(var1, var2, var3, var6, var7);
         this.wild$drawEdgePressure(var1, var2, var3, var6, var7, var8);
         this.wild$drawBlackout(var1, var2, var3, var6, var7, var8);
      }
   }

   @Unique
   private void wild$drawNoHudVoid(UnVNvNnU var1, int var2, int var3, int var4, float var5, float var6) {
      int var7 = wild$alpha(42 + (int)(95.0F * VvNUnuUUuN.NuunnvnN()));
      var1.UuUVuuUu(0.0F, 0.0F, (float)var2, (float)var3, wild$rgba(var7, 0, 0, 0));
      if (var4 <= 2) {
         int var8 = wild$alpha(18 + (int)(36.0F * var5));
         var1.UuUVuuUu(0.0F, 0.0F, (float)var2, (float)var3, wild$rgba(var8, 2, 7, 13));
      }

      if (var4 >= 3) {
         int var9 = wild$alpha((int)(72.0F * var5));
         var1.UuUVuuUu(0.0F, 0.0F, (float)var2, (float)var3, wild$rgba(var9, 7, 0, 0));
      }

      if (var6 > 0.0F) {
         var1.UuUVuuUu(0.0F, 0.0F, (float)var2, (float)var3, wild$rgba(wild$alpha((int)(120.0F * var6)), 0, 0, 0));
      }
   }

   @Unique
   private void wild$drawBacklightPulse(UnVNvNnU var1, int var2, int var3, int var4, float var5) {
      if (this.wild$panicWhite > 0.01F) {
         int var6 = wild$alpha((int)(220.0F * this.wild$panicWhite));
         var1.UuUVuuUu(0.0F, 0.0F, (float)var2, (float)var3, wild$rgba(var6, 255, 255, 255));
      }

      if (var4 >= 2 && VvNUnuUUuN.UuUVuuUu(12001, 260L, 0.38F + VvNUnuUUuN.nVVUuvuNnUN() * 0.28F, 28L)) {
         int var7 = wild$alpha(60 + (int)(130.0F * var5));
         var1.UuUVuuUu(0.0F, 0.0F, (float)var2, (float)var3, wild$rgba(var7, 230, 245, 255));
      }

      if (var4 >= 3 && VvNUnuUUuN.UuUVuuUu(12002, 720L, 0.26F + VvNUnuUUuN.nnuUVNUuvvVU() * 0.34F, 95L)) {
         int var8 = wild$alpha(130 + (int)(90.0F * var5));
         var1.UuUVuuUu(0.0F, 0.0F, (float)var2, (float)var3, wild$rgba(var8, 0, 0, 0));
      }
   }

   @Unique
   private void wild$drawScanMatrix(UnVNvNnU var1, int var2, int var3, int var4, float var5) {
      int var6 = var4 >= 3 ? 2 : 3;
      float var7 = (float)(System.nanoTime() / 1400000L % var6);
      int var8 = wild$alpha(20 + (int)(54.0F * var5));

      for (float var9 = -var7; var9 < var3; var9 += var6) {
         var1.UuUVuuUu(0.0F, var9, (float)var2, 1.0F, wild$rgba(var8, 0, 0, 0));
      }

      int var15 = var4 >= 3 ? 7 : 3;

      for (int var10 = 0; var10 < var15; var10++) {
         float var11 = wild$norm(VvNUnuUUuN.UuUVuuUu(13000 + var10, 85L)) * var2;
         float var12 = 1.0F + Math.abs(VvNUnuUUuN.UuUVuuUu(13020 + var10, 130L)) * 5.0F * var5;
         int var13 = wild$alpha(12 + (int)(56.0F * var5));
         var1.UuUVuuUu(var11, 0.0F, var12, (float)var3, wild$rgba(var13, 255, 255, 255));
      }

      int var16 = var4 >= 3 ? 18 : (var4 >= 2 ? 9 : 4);

      for (int var17 = 0; var17 < var16; var17++) {
         float var18 = wild$norm(VvNUnuUUuN.UuUVuuUu(13100 + var17, 18L + var17)) * var3;
         float var19 = 1.0F + Math.abs(VvNUnuUUuN.UuUVuuUu(13140 + var17, 44L)) * (var4 >= 3 ? 6.0F : 2.0F);
         int var14 = wild$alpha(28 + (int)(120.0F * var5 * Math.abs(VvNUnuUUuN.UuUVuuUu(13180 + var17, 31L))));
         var1.UuUVuuUu(0.0F, var18, (float)var2, var19, wild$rgba(var14, 210, 228, 255));
      }
   }

   @Unique
   private void wild$drawHeldTear(UnVNvNnU var1, int var2, int var3, int var4, float var5) {
      if (var4 >= 2) {
         int var6 = wild$alpha(36 + (int)(105.0F * var5));
         float var7 = Math.max(0.0F, Math.min((float)var3, this.wild$heldTearY));
         float var8 = Math.max(1.0F, Math.min(var3 * 0.45F, this.wild$heldTearH));
         float var9 = this.wild$heldTearShift * var5;
         var1.UuUVuuUu(var9, var7, var2 + Math.abs(var9) * 2.0F, var8, wild$rgba(var6, 220, 220, 220));
         if (var4 >= 3) {
            var1.UuUVuuUu(var9 - 12.0F * var5, var7, var2 + Math.abs(var9) * 2.0F, Math.max(1.0F, var8 * 0.16F), wild$rgba(wild$alpha(var6 + 28), 255, 25, 38));
            var1.UuUVuuUu(
               var9 + 8.0F * var5,
               var7 + var8 * 0.34F,
               var2 + Math.abs(var9) * 2.0F,
               Math.max(1.0F, var8 * 0.12F),
               wild$rgba(wild$alpha(var6 + 18), 25, 255, 70)
            );
            var1.UuUVuuUu(
               var9 + 18.0F * var5,
               var7 + var8 * 0.66F,
               var2 + Math.abs(var9) * 2.0F,
               Math.max(1.0F, var8 * 0.1F),
               wild$rgba(wild$alpha(var6 + 18), 40, 80, 255)
            );
         }
      }
   }

   @Unique
   private void wild$drawTconFailure(UnVNvNnU var1, int var2, int var3, int var4, float var5) {
      int var6 = VvNUnuUUuN.c0oOOCcCoC0() + (var4 >= 3 ? 16 : 4);
      long var7 = var4 >= 3 ? 14L : 30L;

      for (int var9 = 0; var9 < var6; var9++) {
         float var10 = wild$norm(VvNUnuUUuN.UuUVuuUu(14000 + var9 * 7, var7 + var9)) * var3;
         float var11 = 1.0F + Math.abs(VvNUnuUUuN.UuUVuuUu(14001 + var9 * 7, var7 + 11L)) * (var4 >= 3 ? 26.0F : 9.0F) * var5;
         float var12 = VvNUnuUUuN.UuUVuuUu(14002 + var9 * 7, var7) * var2 * (var4 >= 3 ? 0.44F : 0.18F) * var5;
         float var13 = var2 + Math.abs(var12) * 2.0F;
         int var14 = wild$alpha(22 + (int)(118.0F * var5 * Math.abs(VvNUnuUUuN.UuUVuuUu(14003 + var9 * 7, var7))));
         int var15 = var9 % 11;
         if (var15 == 0) {
            var1.UuUVuuUu(var12, var10, var13, var11, wild$rgba(var14, 255, 25, 35));
         } else if (var15 == 1) {
            var1.UuUVuuUu(var12, var10, var13, var11, wild$rgba(var14, 28, 255, 70));
         } else if (var15 == 2) {
            var1.UuUVuuUu(var12, var10, var13, var11, wild$rgba(var14, 42, 86, 255));
         } else if (var15 == 3) {
            var1.UuUVuuUu(var12, var10, var13, var11, wild$rgba(wild$alpha(var14 + 30), 255, 255, 255));
         } else {
            var1.UuUVuuUu(var12, var10, var13, var11, wild$rgba(var14, 210, 210, 210));
         }
      }

      if (var4 >= 3) {
         int var16 = 3 + (int)(8.0F * VvNUnuUUuN.UUVNuUNUvUnV());

         for (int var17 = 0; var17 < var16; var17++) {
            float var18 = wild$norm(VvNUnuUUuN.UuUVuuUu(14200 + var17, 44L)) * var3;
            float var19 = 12.0F + Math.abs(VvNUnuUUuN.UuUVuuUu(14250 + var17, 58L)) * var3 * 0.18F * var5;
            float var20 = VvNUnuUUuN.UuUVuuUu(14300 + var17, 32L) * var2 * 0.58F * var5;
            int var21 = wild$alpha(28 + (int)(112.0F * var5));
            var1.UuUVuuUu(var20, var18, var2 + Math.abs(var20) * 2.0F, var19, wild$rgba(var21, 230, 230, 230));
         }
      }
   }

   @Unique
   private void wild$drawVramFailure(UnVNvNnU var1, int var2, int var3, int var4, float var5) {
      if (var4 >= 2) {
         int var6 = VvNUnuUUuN.VVnVNnunVvu() + (var4 >= 3 ? 22 : 4);
         long var7 = var4 >= 3 ? 32L : 76L;

         for (int var9 = 0; var9 < var6; var9++) {
            float var10 = wild$norm(VvNUnuUUuN.UuUVuuUu(15000 + var9 * 6, var7)) * var2;
            float var11 = wild$norm(VvNUnuUUuN.UuUVuuUu(15001 + var9 * 6, var7 + 7L)) * var3;
            float var12 = 3.0F + Math.abs(VvNUnuUUuN.UuUVuuUu(15002 + var9 * 6, var7 + 13L)) * (var4 >= 3 ? 210.0F : 76.0F) * var5;
            float var13 = 2.0F + Math.abs(VvNUnuUUuN.UuUVuuUu(15003 + var9 * 6, var7 + 19L)) * (var4 >= 3 ? 116.0F : 38.0F) * var5;
            int var14 = wild$alpha(26 + (int)(130.0F * var5));
            int var15 = var9 % 17;
            int var16 = wild$byte(VvNUnuUUuN.UuUVuuUu(15004 + var9 * 6, var7 + 23L));
            if (var15 == 0) {
               var1.UuUVuuUu(var10, var11, var12, var13, wild$rgba(var14, 255, 0, 0));
            } else if (var15 == 1) {
               var1.UuUVuuUu(var10, var11, var12, var13, wild$rgba(var14, 0, 255, 70));
            } else if (var15 == 2) {
               var1.UuUVuuUu(var10, var11, var12, var13, wild$rgba(var14, 40, 80, 255));
            } else if (var15 == 3) {
               var1.UuUVuuUu(var10, var11, var12, var13, wild$rgba(wild$alpha(var14 + 30), 255, 255, 255));
            } else if (var15 == 4 && var4 >= 3) {
               var1.UuUVuuUu(var10, var11, var12, var13, wild$rgba(wild$alpha(var14 + 20), 0, 0, 0));
            } else {
               var1.UuUVuuUu(var10, var11, var12, var13, wild$rgba(var14, var16, var16, var16));
            }
         }
      }
   }

   @Unique
   private void wild$drawDeadPixels(UnVNvNnU var1, int var2, int var3, int var4, float var5) {
      int var6 = VvNUnuUUuN.unNNVVNnvvV() + (var4 >= 3 ? 120 : 24);

      for (int var7 = 0; var7 < var6; var7++) {
         float var8 = wild$norm(VvNUnuUUuN.uUnuvNvvNU(16000 + var7 * 3)) * var2;
         float var9 = wild$norm(VvNUnuUUuN.uUnuvNvvNU(16001 + var7 * 3)) * var3;
         if (var4 >= 3 || !(VvNUnuUUuN.UuUVuuUu(16002 + var7 * 3, 230L) < -0.42F)) {
            float var10 = var4 >= 3 && var7 % 9 == 0 ? 2.0F : 1.0F;
            int var11 = wild$alpha(36 + (int)(205.0F * var5 * Math.abs(VvNUnuUUuN.UuUVuuUu(16100 + var7, 110L))));
            int var12 = var7 % 19;
            if (var12 == 0) {
               var1.UuUVuuUu(var8, var9, var10, var10, wild$rgba(var11, 255, 0, 0));
            } else if (var12 == 1) {
               var1.UuUVuuUu(var8, var9, var10, var10, wild$rgba(var11, 0, 255, 50));
            } else if (var12 == 2) {
               var1.UuUVuuUu(var8, var9, var10, var10, wild$rgba(var11, 40, 90, 255));
            } else if (var12 == 3) {
               var1.UuUVuuUu(var8, var9, var10, var10, wild$rgba(var11, 0, 0, 0));
            } else {
               var1.UuUVuuUu(var8, var9, var10, var10, wild$rgba(var11, 235, 235, 235));
            }
         }
      }
   }

   @Unique
   private void wild$drawEdgePressure(UnVNvNnU var1, int var2, int var3, int var4, float var5, float var6) {
      float var7 = var3 * (0.04F + Math.abs(VvNUnuUUuN.UuUVuuUu(17000, 70L)) * 0.12F * var5);
      float var8 = var3 * (0.04F + Math.abs(VvNUnuUUuN.UuUVuuUu(17001, 80L)) * 0.14F * var5);
      float var9 = var2 * (0.012F + Math.abs(VvNUnuUUuN.UuUVuuUu(17002, 95L)) * 0.055F * var5);
      float var10 = var2 * (0.012F + Math.abs(VvNUnuUUuN.UuUVuuUu(17003, 105L)) * 0.055F * var5);
      var1.UuUVuuUu(0.0F, 0.0F, (float)var2, var7, wild$rgba(wild$alpha(55 + (int)(145.0F * var5)), 0, 0, 0));
      var1.UuUVuuUu(0.0F, var3 - var8, (float)var2, var8, wild$rgba(wild$alpha(55 + (int)(155.0F * var5)), 0, 0, 0));
      if (var4 >= 3) {
         var1.UuUVuuUu(0.0F, 0.0F, var9, (float)var3, wild$rgba(wild$alpha(45 + (int)(130.0F * var5)), 0, 0, 0));
         var1.UuUVuuUu(var2 - var10, 0.0F, var10, (float)var3, wild$rgba(wild$alpha(45 + (int)(130.0F * var5)), 0, 0, 0));
      }

      if (var6 > 0.0F) {
         var1.UuUVuuUu(0.0F, 0.0F, (float)var2, (float)var3, wild$rgba(wild$alpha((int)(150.0F * var6)), 0, 0, 0));
      }
   }

   @Unique
   private void wild$drawBlackout(UnVNvNnU var1, int var2, int var3, int var4, float var5, float var6) {
      if (this.wild$panicBlack > 0.01F) {
         var1.UuUVuuUu(0.0F, 0.0F, (float)var2, (float)var3, wild$rgba(wild$alpha((int)(235.0F * this.wild$panicBlack)), 0, 0, 0));
      }

      if (VvNUnuUUuN.NVNnnvnuunNv()) {
         var1.UuUVuuUu(0.0F, 0.0F, (float)var2, (float)var3, wild$rgba(wild$alpha(190 + (int)(62.0F * var5)), 0, 0, 0));
      }

      if (var4 >= 4) {
         float var7 = (float)(System.nanoTime() / 2300000L % Math.max(1, var3));
         var1.UuUVuuUu(0.0F, var7, (float)var2, 2.0F, wild$rgba(235, 255, 255, 255));
         var1.UuUVuuUu(0.0F, var7 + 3.0F, (float)var2, 1.0F, wild$rgba(130, 255, 30, 60));
         var1.UuUVuuUu(0.0F, var7 + 5.0F, (float)var2, 1.0F, wild$rgba(130, 40, 90, 255));
         var1.UuUVuuUu(0.0F, 0.0F, (float)var2, (float)var3, wild$rgba(wild$alpha((int)(120.0F + 125.0F * var6)), 0, 0, 0));
      }

      if (var4 >= 5) {
         var1.UuUVuuUu(0.0F, 0.0F, (float)var2, (float)var3, -16777216);
      }
   }

   @Unique
   private static float wild$norm(float var0) {
      return (var0 + 1.0F) * 0.5F;
   }

   @Unique
   private static int wild$byte(float var0) {
      int var1 = (int)(wild$norm(var0) * 255.0F);
      if (var1 < 0) {
         return 0;
      } else {
         return var1 > 255 ? 255 : var1;
      }
   }

   @Unique
   private static int wild$alpha(int var0) {
      if (var0 < 0) {
         return 0;
      } else {
         return var0 > 255 ? 255 : var0;
      }
   }

   @Unique
   private static int wild$rgba(int var0, int var1, int var2, int var3) {
      return (var0 & 0xFF) << 24 | (var1 & 0xFF) << 16 | (var2 & 0xFF) << 8 | var3 & 0xFF;
   }

   @Inject(
      method = {"renderChat"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 0
   )
   private void wild$cancelChatDuringCorruption(class_332 var1, class_9779 var2, CallbackInfo var3) {
      if (VvNUnuUUuN.uNNnnnuuuN()) {
         var3.cancel();
      }
   }

   @Unique
   private static boolean wild$customHotbarActive() {
      if (!NVnVnNnN.vNUvnnVnUvu()) {
         return false;
      } else if (o000O0C0Oco0.uNnUnnuNUnNu.C00OOC00oO("HotBar") && NVnVnNnN.unNNVVNnvvV() && NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.C00OOC00oO != null) {
         o000O0C0Oco0 var0 = NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(o000O0C0Oco0.class);
         return var0 != null && var0.nuUnNvnuUu;
      } else {
         return false;
      }
   }

   @Unique
   private static boolean wild$noRenderPotions() {
      return uuUnvvnNUU.UuUVuuUu("Иконки эффектов");
   }
}
