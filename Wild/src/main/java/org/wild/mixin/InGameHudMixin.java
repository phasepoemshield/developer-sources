package org.wild.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.gui.hud.bar.Bar;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.client.texture.GlTexture;
import net.minecraft.entity.Entity;
import net.minecraft.scoreboard.ScoreboardObjective;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.joml.Matrix4f;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.metaculture.protection.AiLabScreen;
import ru.metaculture.protection.Animations;
import ru.metaculture.protection.AutoBuyScreen;
import ru.metaculture.protection.AutoSwap;
import ru.metaculture.protection.BlurRenderer;
import ru.metaculture.protection.ColorPlus;
import ru.metaculture.protection.Event;
import ru.metaculture.protection.EventManager;
import ru.metaculture.protection.FontRegistry;
import ru.metaculture.protection.HudConstructorScreen;
import ru.metaculture.protection.HudModule;
import ru.metaculture.protection.ModernClickGuiScreen;
import ru.metaculture.protection.MotionBlur;
import ru.metaculture.protection.O0000000000OO0;
import ru.metaculture.protection.O0000000000OOO;
import ru.metaculture.protection.O0000000O00O;
import ru.metaculture.protection.O00000O0O0OOO;
import ru.metaculture.protection.O00000OO000O;
import ru.metaculture.protection.O0000O000OOOOO;
import ru.metaculture.protection.O0000O00O0OOO0;
import ru.metaculture.protection.O0000O0O000O;
import ru.metaculture.protection.O0000O0O000OO0;
import ru.metaculture.protection.O0000O0O000OOO;
import ru.metaculture.protection.ProtectInfo;
import ru.metaculture.protection.Removals;
import ru.metaculture.protection.RenderManager;
import ru.metaculture.protection.RotationBuilderScreen;
import ru.metaculture.protection.WildClient;

@Environment(EnvType.CLIENT)
@Mixin({InGameHud.class})
public class InGameHudMixin {
   @Unique
   private static final O0000000O00O wild$cachedEventScreen = new O0000000O00O();
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
   private void onRenderCrosshair(DrawContext drawContext, RenderTickCounter renderTickCounter, CallbackInfo callbackInfo) {
      MinecraftClient var4 = MinecraftClient.getInstance();
      if (O0000000000OO0.O000000000000()) {
         callbackInfo.cancel();
      } else {
         if (AutoSwap.O0000000000O0()
            || var4.currentScreen instanceof AutoBuyScreen
            || var4.currentScreen instanceof ModernClickGuiScreen
            || var4.currentScreen instanceof HudConstructorScreen
            || var4.currentScreen instanceof RotationBuilderScreen
            || var4.currentScreen instanceof AiLabScreen) {
            callbackInfo.cancel();
         }
      }
   }

   @Inject(
      method = {"renderStatusEffectOverlay"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onRenderStatusEffects(DrawContext drawContext, RenderTickCounter renderTickCounter, CallbackInfo callbackInfo) {
      if (O0000000000OO0.O000000000000()) {
         callbackInfo.cancel();
      } else {
         if (HudModule.O000000000O000.O000000000("Potions") || wild$noRenderPotions()) {
            callbackInfo.cancel();
         }
      }
   }

   @Inject(
      method = {"renderHotbar"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onRenderHotbar(DrawContext drawContext, RenderTickCounter renderTickCounter, CallbackInfo callbackInfo) {
      if (O0000000000OO0.O000000000000()) {
         callbackInfo.cancel();
      } else {
         if (wild$customHotbarActive() || this.wild$foundryOverlayVisible() || MinecraftClient.getInstance().currentScreen instanceof HudConstructorScreen) {
            callbackInfo.cancel();
         }
      }
   }

   @Unique
   private boolean wild$foundryOverlayVisible() {
      MinecraftClient var1 = MinecraftClient.getInstance();
      return var1 != null && var1.currentScreen instanceof ModernClickGuiScreen var2 ? var2.O00000000().O00000000() : false;
   }

   @Inject(
      method = {"renderStatusBars"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 0
   )
   private void onRenderStatusBars(DrawContext drawContext, CallbackInfo callbackInfo) {
      if (O0000000000OO0.O000000000000() || wild$customHotbarActive()) {
         callbackInfo.cancel();
      }
   }

   @Inject(
      method = {"renderHeldItemTooltip"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 0
   )
   private void wild$cancelHeldItemTooltip(DrawContext drawContext, CallbackInfo callbackInfo) {
      if (O0000000000OO0.O000000000000() || wild$customHotbarActive()) {
         callbackInfo.cancel();
      }
   }

   @Inject(
      method = {"renderScoreboardSidebar(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/scoreboard/ScoreboardObjective;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onRenderScoreboardSidebar(DrawContext drawContext, ScoreboardObjective scoreboardObjective, CallbackInfo callbackInfo) {
      if (O0000000000OO0.O000000000000()) {
         callbackInfo.cancel();
      } else {
         ProtectInfo var4 = WildClient.O00000000.O000000000.O00000000(ProtectInfo.class);
         if (var4 != null && var4.O0000000000000 && var4.O000000000OO.O0000000000()) {
            callbackInfo.cancel();
         }
      }
   }

   @Inject(
      method = {"renderMainHud"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 0
   )
   private void wild$cancelMainHudDuringCorruption(DrawContext drawContext, RenderTickCounter renderTickCounter, CallbackInfo callbackInfo) {
      if (O0000000000OO0.O000000000000()) {
         callbackInfo.cancel();
      }
   }

   @Inject(
      method = {"renderPlayerList"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 0
   )
   private void wild$cancelPlayerListDuringCorruption(DrawContext drawContext, RenderTickCounter renderTickCounter, CallbackInfo callbackInfo) {
      if (O0000000000OO0.O000000000000()) {
         callbackInfo.cancel();
      }
   }

   @Inject(
      method = {"renderOverlayMessage"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 0
   )
   private void wild$cancelOverlayMessageDuringCorruption(DrawContext drawContext, RenderTickCounter renderTickCounter, CallbackInfo callbackInfo) {
      if (O0000000000OO0.O000000000000()) {
         callbackInfo.cancel();
      }
   }

   @Inject(
      method = {"renderTitleAndSubtitle"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 0
   )
   private void wild$cancelTitleDuringCorruption(DrawContext drawContext, RenderTickCounter renderTickCounter, CallbackInfo callbackInfo) {
      if (O0000000000OO0.O000000000000()) {
         callbackInfo.cancel();
      }
   }

   @Inject(
      method = {"renderVignetteOverlay"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 0
   )
   private void wild$cancelVignette(DrawContext drawContext, Entity entity, CallbackInfo callbackInfo) {
      if (Removals.O00000000("Виньетка")) {
         callbackInfo.cancel();
      }
   }

   @Inject(
      method = {"renderSpyglassOverlay"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 0
   )
   private void wild$cancelSpyglass(DrawContext drawContext, float f, CallbackInfo callbackInfo) {
      if (Removals.O00000000("Подзорная труба")) {
         callbackInfo.cancel();
      }
   }

   @Inject(
      method = {"renderPortalOverlay"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 0
   )
   private void wild$cancelPortalOverlay(DrawContext drawContext, float f, CallbackInfo callbackInfo) {
      if (Removals.O00000000("Портал")) {
         callbackInfo.cancel();
      }
   }

   @Inject(
      method = {"renderNauseaOverlay"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 0
   )
   private void wild$cancelNauseaOverlay(DrawContext drawContext, float f, CallbackInfo callbackInfo) {
      if (Removals.O00000000("Тошнота (экран)")) {
         callbackInfo.cancel();
      }
   }

   @Inject(
      method = {"renderOverlay"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 0
   )
   private void wild$cancelMiscOverlay(DrawContext drawContext, Identifier identifier, float f, CallbackInfo callbackInfo) {
      if (identifier != null) {
         String var5 = identifier.getPath();
         if (var5.contains("pumpkin") && Removals.O00000000("Тыква")) {
            callbackInfo.cancel();
         } else {
            if (var5.contains("powder_snow") && Removals.O00000000("Порошковый снег")) {
               callbackInfo.cancel();
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
   private boolean wild$keepTabListForClose(KeyBinding keyBinding) {
      if (O0000000000OO0.O000000000000()) {
         return false;
      } else {
         boolean var2 = keyBinding.isPressed();
         if (WildClient.O000000000OO0() && WildClient.O00000000 != null && WildClient.O00000000.O000000000 != null) {
            Animations var3 = WildClient.O00000000.O000000000.O00000000(Animations.class);
            return var3 != null && var3.O0000000000000 && var3.O000000000O.O000000000("Таб") ? var3.O0000000000(var2) : var2;
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
   private Text litka$maskScoreboardTitle(ScoreboardObjective scoreboardObjective) {
      if (O0000000000OO0.O000000000000()) {
         return Text.empty();
      } else if (scoreboardObjective == null) {
         return Text.empty();
      } else {
         Text var2 = scoreboardObjective.getDisplayName();
         return (Text)(var2 != null ? ProtectInfo.O00000000(var2) : Text.empty());
      }
   }

   @Redirect(
      method = {"renderMainHud"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/hud/bar/Bar;drawExperienceLevel(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/client/font/TextRenderer;I)V"
      )
   )
   private void redirectDrawExperienceLevel(DrawContext drawContext, TextRenderer textRenderer, int i) {
      if (!O0000000000OO0.O000000000000() && !wild$customHotbarActive()) {
         Bar.drawExperienceLevel(drawContext, textRenderer, i);
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
   private void redirectRenderBar(Bar bar, DrawContext drawContext, RenderTickCounter renderTickCounter) {
      if (!O0000000000OO0.O000000000000()) {
         if (!wild$customHotbarActive()) {
            bar.renderBar(drawContext, renderTickCounter);
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
   private void redirectRenderAddons(Bar bar, DrawContext drawContext, RenderTickCounter renderTickCounter) {
      if (!O0000000000OO0.O000000000000()) {
         if (!wild$customHotbarActive()) {
            bar.renderAddons(drawContext, renderTickCounter);
         }
      }
   }

   @Inject(
      method = {"render"},
      at = {@At("HEAD")}
   )
   private void wild$applyColorPlus(DrawContext drawContext, RenderTickCounter renderTickCounter, CallbackInfo callbackInfo) {
      if (WildClient.O000000000OO0()) {
         if (WildClient.O00000000 != null && WildClient.O00000000.O000000000 != null) {
            ColorPlus var4;
            MotionBlur var5;
            try {
               var4 = (ColorPlus)WildClient.O00000000.O000000000.O000000000(ColorPlus.class);
               var5 = (MotionBlur)WildClient.O00000000.O000000000.O000000000(MotionBlur.class);
            } catch (Throwable var20) {
               return;
            }

            boolean var6 = var4 != null && var4.O0000000000000;
            boolean var7 = var5 != null && var5.O0000000000000;
            if (var6 || var7) {
               MinecraftClient var8 = MinecraftClient.getInstance();
               if (var8 != null && var8.world != null && var8.player != null) {
                  if (var8.getWindow() != null) {
                     int var9 = var8.getWindow().getFramebufferWidth();
                     int var10 = var8.getWindow().getFramebufferHeight();
                     if (var9 > 1 && var10 > 1) {
                        Framebuffer var11 = var8.getFramebuffer();
                        if (var11 != null) {
                           if (var11.getColorAttachment() instanceof GlTexture var13) {
                              int var14 = var13.getGlId();
                              if (var14 > 0) {
                                 if (var7) {
                                    if (var8.currentScreen == null) {
                                       try {
                                          O0000O0O000OO0.O00000000()
                                             .O00000000(
                                                var8,
                                                var8.gameRenderer.getCamera(),
                                                new Matrix4f(O0000O000OOOOO.O0000000000),
                                                new Matrix4f(O0000O000OOOOO.O00000000),
                                                var5.O0000000000O0()
                                             );
                                       } catch (Throwable var19) {
                                          System.err.println("[SilkFlow] apply failed: " + var19.getMessage());
                                       }
                                    } else {
                                       O0000O0O000OO0.O00000000().O000000000();
                                    }
                                 }

                                 if (var6) {
                                    O00000O0O0OOO var15 = var4.O0000000000O0();
                                    O0000O0O000O.W387 var16 = new O0000O0O000O.W387();
                                    var16.O00000000 = var4.O000000000O0.O0000000000();
                                    var16.O000000000 = var15.O000000000 + var4.O000000000O000.O0000000000();
                                    var16.O0000000000 = var15.O0000000000 + var4.O000000000O00O.O0000000000();
                                    var16.O00000000000 = var15.O00000000000 + var4.O000000000O0O.O0000000000();
                                    var16.O000000000000 = var15.O000000000000 + var4.O000000000O0O0.O0000000000();
                                    var16.O0000000000000 = var15.O0000000000000 + var4.O000000000O0OO.O0000000000();
                                    var16.O000000000000O = var15.O000000000000O + var4.O000000000OO.O0000000000();
                                    var16.O00000000000O = var15.O00000000000O + var4.O000000000OO0.O0000000000();
                                    var16.O00000000000O0 = var15.O00000000000O0[0];
                                    var16.O00000000000OO = var15.O00000000000O0[1];
                                    var16.O0000000000O = var15.O00000000000O0[2];
                                    var16.O0000000000O0 = var15.O00000000000OO[0];
                                    var16.O0000000000O00 = var15.O00000000000OO[1];
                                    var16.O0000000000O0O = var15.O00000000000OO[2];
                                    var16.O0000000000OO = var15.O0000000000O[0];
                                    var16.O0000000000OO0 = var15.O0000000000O[1];
                                    var16.O0000000000OOO = var15.O0000000000O[2];
                                    var16.O000000000O = 0.0F;
                                    var16.O000000000O0 = var15.O0000000000O00;
                                    var16.O000000000O00 = var15.O0000000000O0O;
                                    var16.O000000000O000 = var4.O000000000O00.O0000000000()
                                       ? Math.max(0.0F, var15.O0000000000OO + var4.O000000000OO0O.O0000000000())
                                       : 0.0F;
                                    var16.O000000000O00O = Math.max(0.0F, var15.O0000000000OO0 + var4.O000000000OOO.O0000000000());
                                    var16.O000000000O0O = true;

                                    try {
                                       O0000O0O000O.O00000000().O00000000(var14, var9, var10, var16);
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

   @Inject(
      method = {"render"},
      at = {@At("RETURN")}
   )
   private void onRenderHud(DrawContext drawContext, RenderTickCounter renderTickCounter, CallbackInfo callbackInfo) {
      if (WildClient.O000000000OO0()) {
         MinecraftClient var4 = MinecraftClient.getInstance();
         if (var4 != null && var4.player != null && var4.world != null && var4.getWindow() != null) {
            int var5 = var4.getWindow().getFramebufferWidth();
            int var6 = var4.getWindow().getFramebufferHeight();
            if (var5 > 0 && var6 > 0) {
               try {
                  WildClient.O000000000000O();
               } catch (Throwable var27) {
                  return;
               }

               if (WildClient.O00000000() != null) {
                  O0000O00O0OOO0.W373 var7 = O0000O00O0OOO0.O00000000();
                  int var8 = 0;

                  try {
                     try {
                        FontRegistry.O000000000();
                     } catch (Throwable var26) {
                     }

                     Framebuffer var9 = var4.getFramebuffer();
                     if (var9 != null) {
                        if (var9.getColorAttachment() instanceof GlTexture var11) {
                           int var12 = var11.getGlId();
                           var8 = O0000O0O000OOO.O00000000();
                           if (var8 == 0) {
                              O0000O00O0OOO0.O00000000(36009, var7.O00000000);
                              O0000O00O0OOO0.O00000000(36008, var7.O000000000);
                           } else {
                              GL30.glBindFramebuffer(36160, var8);
                              GL30.glFramebufferTexture2D(36160, 36064, 3553, var12, 0);
                              GL11.glDrawBuffer(36064);
                              if (GL30.glCheckFramebufferStatus(36160) != 36053) {
                                 GL30.glDeleteFramebuffers(var8);
                                 O0000O0O000OOO.O00000000(var8);
                                 var8 = 0;
                                 O0000O00O0OOO0.O00000000(36009, var7.O00000000);
                                 O0000O00O0OOO0.O00000000(36008, var7.O000000000);
                              }
                           }
                        } else {
                           O0000O00O0OOO0.O00000000(36009, var7.O00000000);
                           O0000O00O0OOO0.O00000000(36008, var7.O000000000);
                        }
                     } else {
                        O0000O00O0OOO0.O00000000(36009, var7.O00000000);
                        O0000O00O0OOO0.O00000000(36008, var7.O000000000);
                     }

                     GL11.glColorMask(true, true, true, true);
                     GL11.glDisable(2929);
                     GL11.glEnable(3042);
                     RenderManager var30 = WildClient.O00000000();
                     if (var30 == null) {
                        return;
                     }

                     O00000OO000O var31 = O00000OO000O.O00000000();
                     var31.O00000000(var4, var30, var5, var6);
                     var31.O0000000000();
                     Screen var32 = var4.currentScreen;
                     ModernClickGuiScreen var13 = var32 instanceof ModernClickGuiScreen ? (ModernClickGuiScreen)var32 : null;
                     boolean var14 = O0000000000OO0.O000000000000();
                     O0000000000OOO.O00000000();
                     boolean var15 = false;

                     try {
                        var30.O00000000(var5, var6);
                        var15 = true;
                        if (var14) {
                           this.wild$drawCorruption(var30, var5, var6);
                        } else if (var13 != null) {
                           var13.O00000000(var30, drawContext, var5, var6, var4.getRenderTickCounter().getDynamicDeltaTicks());
                        } else {
                           wild$cachedEventScreen.O00000000(var4, var30, FontRegistry.O00000000, var5, var6, drawContext);
                           EventManager.O00000000((Event)wild$cachedEventScreen);
                        }
                     } finally {
                        if (var15) {
                           var30.O000000000();
                           var31.O00000000000();
                           if (!var14 && var13 != null) {
                              if (var8 != 0) {
                                 GL30.glBindFramebuffer(36160, var8);
                                 GL11.glDrawBuffer(36064);
                              }

                              BlurRenderer.O00000000().O00000000000();
                           }
                        }
                     }
                  } finally {
                     if (var8 != 0) {
                        GL30.glBindFramebuffer(36160, var8);
                        GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                     }

                     O0000O00O0OOO0.O00000000(var7);
                  }
               }
            } else {
               WildClient.O00000000(var5, var6);
            }
         }
      }
   }

   @Unique
   private void wild$drawCorruption(RenderManager o0000O00OO0O0, int i, int j) {
      if (i > 0 && j > 0) {
         long var4 = System.currentTimeMillis();
         if (var4 - this.wild$lastCorruptionFrameMs > 28L || O0000000000OO0.O00000000(9182, 120L, 0.36F, 42L)) {
            this.wild$lastCorruptionFrameMs = var4;
            this.wild$heldTearY = wild$norm(O0000000000OO0.O000000000(901)) * j;
            this.wild$heldTearH = 8.0F + Math.abs(O0000000000OO0.O000000000(902)) * j * 0.22F;
            this.wild$heldTearShift = O0000000000OO0.O000000000(903) * i * 0.42F;
         }

         int var6 = O0000000000OO0.O0000000000O0();
         float var7 = O0000000000OO0.O0000000000O00();
         float var8 = O0000000000OO0.O00000000(1250000000L, 2250000000L);
         if (O0000000000OO0.O000000000O0()) {
            this.wild$panicWhite = Math.min(1.0F, this.wild$panicWhite + 0.68F + O0000000000OO0.O00000000O00() * 0.24F);
         } else {
            this.wild$panicWhite *= 0.58F;
         }

         if (O0000000000OO0.O0000000000OOO()) {
            this.wild$panicBlack = Math.min(1.0F, this.wild$panicBlack + 0.38F + O0000000000OO0.O00000000O0() * 0.32F);
         } else {
            this.wild$panicBlack *= 0.72F;
         }

         this.wild$drawNoHudVoid(o0000O00OO0O0, i, j, var6, var7, var8);
         this.wild$drawBacklightPulse(o0000O00OO0O0, i, j, var6, var7);
         this.wild$drawScanMatrix(o0000O00OO0O0, i, j, var6, var7);
         this.wild$drawHeldTear(o0000O00OO0O0, i, j, var6, var7);
         this.wild$drawTconFailure(o0000O00OO0O0, i, j, var6, var7);
         this.wild$drawVramFailure(o0000O00OO0O0, i, j, var6, var7);
         this.wild$drawDeadPixels(o0000O00OO0O0, i, j, var6, var7);
         this.wild$drawEdgePressure(o0000O00OO0O0, i, j, var6, var7, var8);
         this.wild$drawBlackout(o0000O00OO0O0, i, j, var6, var7, var8);
      }
   }

   @Unique
   private void wild$drawNoHudVoid(RenderManager o0000O00OO0O0, int i, int j, int k, float f, float g) {
      int var7 = wild$alpha(42 + (int)(95.0F * O0000000000OO0.O000000000OOO()));
      o0000O00OO0O0.O00000000(0.0F, 0.0F, (float)i, (float)j, wild$rgba(var7, 0, 0, 0));
      if (k <= 2) {
         int var8 = wild$alpha(18 + (int)(36.0F * f));
         o0000O00OO0O0.O00000000(0.0F, 0.0F, (float)i, (float)j, wild$rgba(var8, 2, 7, 13));
      }

      if (k >= 3) {
         int var9 = wild$alpha((int)(72.0F * f));
         o0000O00OO0O0.O00000000(0.0F, 0.0F, (float)i, (float)j, wild$rgba(var9, 7, 0, 0));
      }

      if (g > 0.0F) {
         o0000O00OO0O0.O00000000(0.0F, 0.0F, (float)i, (float)j, wild$rgba(wild$alpha((int)(120.0F * g)), 0, 0, 0));
      }
   }

   @Unique
   private void wild$drawBacklightPulse(RenderManager o0000O00OO0O0, int i, int j, int k, float f) {
      if (this.wild$panicWhite > 0.01F) {
         int var6 = wild$alpha((int)(220.0F * this.wild$panicWhite));
         o0000O00OO0O0.O00000000(0.0F, 0.0F, (float)i, (float)j, wild$rgba(var6, 255, 255, 255));
      }

      if (k >= 2 && O0000000000OO0.O00000000(12001, 260L, 0.38F + O0000000000OO0.O00000000O00() * 0.28F, 28L)) {
         int var7 = wild$alpha(60 + (int)(130.0F * f));
         o0000O00OO0O0.O00000000(0.0F, 0.0F, (float)i, (float)j, wild$rgba(var7, 230, 245, 255));
      }

      if (k >= 3 && O0000000000OO0.O00000000(12002, 720L, 0.26F + O0000000000OO0.O00000000O0() * 0.34F, 95L)) {
         int var8 = wild$alpha(130 + (int)(90.0F * f));
         o0000O00OO0O0.O00000000(0.0F, 0.0F, (float)i, (float)j, wild$rgba(var8, 0, 0, 0));
      }
   }

   @Unique
   private void wild$drawScanMatrix(RenderManager o0000O00OO0O0, int i, int j, int k, float f) {
      int var6 = k >= 3 ? 2 : 3;
      float var7 = (float)(System.nanoTime() / 1400000L % var6);
      int var8 = wild$alpha(20 + (int)(54.0F * f));

      for (float var9 = -var7; var9 < j; var9 += var6) {
         o0000O00OO0O0.O00000000(0.0F, var9, (float)i, 1.0F, wild$rgba(var8, 0, 0, 0));
      }

      int var15 = k >= 3 ? 7 : 3;

      for (int var10 = 0; var10 < var15; var10++) {
         float var11 = wild$norm(O0000000000OO0.O00000000(13000 + var10, 85L)) * i;
         float var12 = 1.0F + Math.abs(O0000000000OO0.O00000000(13020 + var10, 130L)) * 5.0F * f;
         int var13 = wild$alpha(12 + (int)(56.0F * f));
         o0000O00OO0O0.O00000000(var11, 0.0F, var12, (float)j, wild$rgba(var13, 255, 255, 255));
      }

      int var16 = k >= 3 ? 18 : (k >= 2 ? 9 : 4);

      for (int var17 = 0; var17 < var16; var17++) {
         float var18 = wild$norm(O0000000000OO0.O00000000(13100 + var17, 18L + var17)) * j;
         float var19 = 1.0F + Math.abs(O0000000000OO0.O00000000(13140 + var17, 44L)) * (k >= 3 ? 6.0F : 2.0F);
         int var14 = wild$alpha(28 + (int)(120.0F * f * Math.abs(O0000000000OO0.O00000000(13180 + var17, 31L))));
         o0000O00OO0O0.O00000000(0.0F, var18, (float)i, var19, wild$rgba(var14, 210, 228, 255));
      }
   }

   @Unique
   private void wild$drawHeldTear(RenderManager o0000O00OO0O0, int i, int j, int k, float f) {
      if (k >= 2) {
         int var6 = wild$alpha(36 + (int)(105.0F * f));
         float var7 = Math.max(0.0F, Math.min((float)j, this.wild$heldTearY));
         float var8 = Math.max(1.0F, Math.min(j * 0.45F, this.wild$heldTearH));
         float var9 = this.wild$heldTearShift * f;
         o0000O00OO0O0.O00000000(var9, var7, i + Math.abs(var9) * 2.0F, var8, wild$rgba(var6, 220, 220, 220));
         if (k >= 3) {
            o0000O00OO0O0.O00000000(
               var9 - 12.0F * f, var7, i + Math.abs(var9) * 2.0F, Math.max(1.0F, var8 * 0.16F), wild$rgba(wild$alpha(var6 + 28), 255, 25, 38)
            );
            o0000O00OO0O0.O00000000(
               var9 + 8.0F * f, var7 + var8 * 0.34F, i + Math.abs(var9) * 2.0F, Math.max(1.0F, var8 * 0.12F), wild$rgba(wild$alpha(var6 + 18), 25, 255, 70)
            );
            o0000O00OO0O0.O00000000(
               var9 + 18.0F * f, var7 + var8 * 0.66F, i + Math.abs(var9) * 2.0F, Math.max(1.0F, var8 * 0.1F), wild$rgba(wild$alpha(var6 + 18), 40, 80, 255)
            );
         }
      }
   }

   @Unique
   private void wild$drawTconFailure(RenderManager o0000O00OO0O0, int i, int j, int k, float f) {
      int var6 = O0000000000OO0.O000000000OO0() + (k >= 3 ? 16 : 4);
      long var7 = k >= 3 ? 14L : 30L;

      for (int var9 = 0; var9 < var6; var9++) {
         float var10 = wild$norm(O0000000000OO0.O00000000(14000 + var9 * 7, var7 + var9)) * j;
         float var11 = 1.0F + Math.abs(O0000000000OO0.O00000000(14001 + var9 * 7, var7 + 11L)) * (k >= 3 ? 26.0F : 9.0F) * f;
         float var12 = O0000000000OO0.O00000000(14002 + var9 * 7, var7) * i * (k >= 3 ? 0.44F : 0.18F) * f;
         float var13 = i + Math.abs(var12) * 2.0F;
         int var14 = wild$alpha(22 + (int)(118.0F * f * Math.abs(O0000000000OO0.O00000000(14003 + var9 * 7, var7))));
         int var15 = var9 % 11;
         if (var15 == 0) {
            o0000O00OO0O0.O00000000(var12, var10, var13, var11, wild$rgba(var14, 255, 25, 35));
         } else if (var15 == 1) {
            o0000O00OO0O0.O00000000(var12, var10, var13, var11, wild$rgba(var14, 28, 255, 70));
         } else if (var15 == 2) {
            o0000O00OO0O0.O00000000(var12, var10, var13, var11, wild$rgba(var14, 42, 86, 255));
         } else if (var15 == 3) {
            o0000O00OO0O0.O00000000(var12, var10, var13, var11, wild$rgba(wild$alpha(var14 + 30), 255, 255, 255));
         } else {
            o0000O00OO0O0.O00000000(var12, var10, var13, var11, wild$rgba(var14, 210, 210, 210));
         }
      }

      if (k >= 3) {
         int var16 = 3 + (int)(8.0F * O0000000000OO0.O000000000OOOO());

         for (int var17 = 0; var17 < var16; var17++) {
            float var18 = wild$norm(O0000000000OO0.O00000000(14200 + var17, 44L)) * j;
            float var19 = 12.0F + Math.abs(O0000000000OO0.O00000000(14250 + var17, 58L)) * j * 0.18F * f;
            float var20 = O0000000000OO0.O00000000(14300 + var17, 32L) * i * 0.58F * f;
            int var21 = wild$alpha(28 + (int)(112.0F * f));
            o0000O00OO0O0.O00000000(var20, var18, i + Math.abs(var20) * 2.0F, var19, wild$rgba(var21, 230, 230, 230));
         }
      }
   }

   @Unique
   private void wild$drawVramFailure(RenderManager o0000O00OO0O0, int i, int j, int k, float f) {
      if (k >= 2) {
         int var6 = O0000000000OO0.O000000000OO00() + (k >= 3 ? 22 : 4);
         long var7 = k >= 3 ? 32L : 76L;

         for (int var9 = 0; var9 < var6; var9++) {
            float var10 = wild$norm(O0000000000OO0.O00000000(15000 + var9 * 6, var7)) * i;
            float var11 = wild$norm(O0000000000OO0.O00000000(15001 + var9 * 6, var7 + 7L)) * j;
            float var12 = 3.0F + Math.abs(O0000000000OO0.O00000000(15002 + var9 * 6, var7 + 13L)) * (k >= 3 ? 210.0F : 76.0F) * f;
            float var13 = 2.0F + Math.abs(O0000000000OO0.O00000000(15003 + var9 * 6, var7 + 19L)) * (k >= 3 ? 116.0F : 38.0F) * f;
            int var14 = wild$alpha(26 + (int)(130.0F * f));
            int var15 = var9 % 17;
            int var16 = wild$byte(O0000000000OO0.O00000000(15004 + var9 * 6, var7 + 23L));
            if (var15 == 0) {
               o0000O00OO0O0.O00000000(var10, var11, var12, var13, wild$rgba(var14, 255, 0, 0));
            } else if (var15 == 1) {
               o0000O00OO0O0.O00000000(var10, var11, var12, var13, wild$rgba(var14, 0, 255, 70));
            } else if (var15 == 2) {
               o0000O00OO0O0.O00000000(var10, var11, var12, var13, wild$rgba(var14, 40, 80, 255));
            } else if (var15 == 3) {
               o0000O00OO0O0.O00000000(var10, var11, var12, var13, wild$rgba(wild$alpha(var14 + 30), 255, 255, 255));
            } else if (var15 == 4 && k >= 3) {
               o0000O00OO0O0.O00000000(var10, var11, var12, var13, wild$rgba(wild$alpha(var14 + 20), 0, 0, 0));
            } else {
               o0000O00OO0O0.O00000000(var10, var11, var12, var13, wild$rgba(var14, var16, var16, var16));
            }
         }
      }
   }

   @Unique
   private void wild$drawDeadPixels(RenderManager o0000O00OO0O0, int i, int j, int k, float f) {
      int var6 = O0000000000OO0.O000000000OO0O() + (k >= 3 ? 120 : 24);

      for (int var7 = 0; var7 < var6; var7++) {
         float var8 = wild$norm(O0000000000OO0.O0000000000(16000 + var7 * 3)) * i;
         float var9 = wild$norm(O0000000000OO0.O0000000000(16001 + var7 * 3)) * j;
         if (k >= 3 || !(O0000000000OO0.O00000000(16002 + var7 * 3, 230L) < -0.42F)) {
            float var10 = k >= 3 && var7 % 9 == 0 ? 2.0F : 1.0F;
            int var11 = wild$alpha(36 + (int)(205.0F * f * Math.abs(O0000000000OO0.O00000000(16100 + var7, 110L))));
            int var12 = var7 % 19;
            if (var12 == 0) {
               o0000O00OO0O0.O00000000(var8, var9, var10, var10, wild$rgba(var11, 255, 0, 0));
            } else if (var12 == 1) {
               o0000O00OO0O0.O00000000(var8, var9, var10, var10, wild$rgba(var11, 0, 255, 50));
            } else if (var12 == 2) {
               o0000O00OO0O0.O00000000(var8, var9, var10, var10, wild$rgba(var11, 40, 90, 255));
            } else if (var12 == 3) {
               o0000O00OO0O0.O00000000(var8, var9, var10, var10, wild$rgba(var11, 0, 0, 0));
            } else {
               o0000O00OO0O0.O00000000(var8, var9, var10, var10, wild$rgba(var11, 235, 235, 235));
            }
         }
      }
   }

   @Unique
   private void wild$drawEdgePressure(RenderManager o0000O00OO0O0, int i, int j, int k, float f, float g) {
      float var7 = j * (0.04F + Math.abs(O0000000000OO0.O00000000(17000, 70L)) * 0.12F * f);
      float var8 = j * (0.04F + Math.abs(O0000000000OO0.O00000000(17001, 80L)) * 0.14F * f);
      float var9 = i * (0.012F + Math.abs(O0000000000OO0.O00000000(17002, 95L)) * 0.055F * f);
      float var10 = i * (0.012F + Math.abs(O0000000000OO0.O00000000(17003, 105L)) * 0.055F * f);
      o0000O00OO0O0.O00000000(0.0F, 0.0F, (float)i, var7, wild$rgba(wild$alpha(55 + (int)(145.0F * f)), 0, 0, 0));
      o0000O00OO0O0.O00000000(0.0F, j - var8, (float)i, var8, wild$rgba(wild$alpha(55 + (int)(155.0F * f)), 0, 0, 0));
      if (k >= 3) {
         o0000O00OO0O0.O00000000(0.0F, 0.0F, var9, (float)j, wild$rgba(wild$alpha(45 + (int)(130.0F * f)), 0, 0, 0));
         o0000O00OO0O0.O00000000(i - var10, 0.0F, var10, (float)j, wild$rgba(wild$alpha(45 + (int)(130.0F * f)), 0, 0, 0));
      }

      if (g > 0.0F) {
         o0000O00OO0O0.O00000000(0.0F, 0.0F, (float)i, (float)j, wild$rgba(wild$alpha((int)(150.0F * g)), 0, 0, 0));
      }
   }

   @Unique
   private void wild$drawBlackout(RenderManager o0000O00OO0O0, int i, int j, int k, float f, float g) {
      if (this.wild$panicBlack > 0.01F) {
         o0000O00OO0O0.O00000000(0.0F, 0.0F, (float)i, (float)j, wild$rgba(wild$alpha((int)(235.0F * this.wild$panicBlack)), 0, 0, 0));
      }

      if (O0000000000OO0.O000000000O()) {
         o0000O00OO0O0.O00000000(0.0F, 0.0F, (float)i, (float)j, wild$rgba(wild$alpha(190 + (int)(62.0F * f)), 0, 0, 0));
      }

      if (k >= 4) {
         float var7 = (float)(System.nanoTime() / 2300000L % Math.max(1, j));
         o0000O00OO0O0.O00000000(0.0F, var7, (float)i, 2.0F, wild$rgba(235, 255, 255, 255));
         o0000O00OO0O0.O00000000(0.0F, var7 + 3.0F, (float)i, 1.0F, wild$rgba(130, 255, 30, 60));
         o0000O00OO0O0.O00000000(0.0F, var7 + 5.0F, (float)i, 1.0F, wild$rgba(130, 40, 90, 255));
         o0000O00OO0O0.O00000000(0.0F, 0.0F, (float)i, (float)j, wild$rgba(wild$alpha((int)(120.0F + 125.0F * g)), 0, 0, 0));
      }

      if (k >= 5) {
         o0000O00OO0O0.O00000000(0.0F, 0.0F, (float)i, (float)j, -16777216);
      }
   }

   @Unique
   private static float wild$norm(float f) {
      return (f + 1.0F) * 0.5F;
   }

   @Unique
   private static int wild$byte(float f) {
      int var1 = (int)(wild$norm(f) * 255.0F);
      if (var1 < 0) {
         return 0;
      } else {
         return var1 > 255 ? 255 : var1;
      }
   }

   @Unique
   private static int wild$alpha(int i) {
      if (i < 0) {
         return 0;
      } else {
         return i > 255 ? 255 : i;
      }
   }

   @Unique
   private static int wild$rgba(int i, int j, int k, int l) {
      return (i & 0xFF) << 24 | (j & 0xFF) << 16 | (k & 0xFF) << 8 | l & 0xFF;
   }

   @Inject(
      method = {"renderChat"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 0
   )
   private void wild$cancelChatDuringCorruption(DrawContext drawContext, RenderTickCounter renderTickCounter, CallbackInfo callbackInfo) {
      if (O0000000000OO0.O000000000000()) {
         callbackInfo.cancel();
      }
   }

   @Unique
   private static boolean wild$customHotbarActive() {
      if (HudModule.O000000000O000.O000000000("HotBar")
         && WildClient.O000000000OO0()
         && WildClient.O00000000 != null
         && WildClient.O00000000.O000000000 != null) {
         HudModule var0 = WildClient.O00000000.O000000000.O00000000(HudModule.class);
         return var0 != null && var0.O0000000000000;
      } else {
         return false;
      }
   }

   @Unique
   private static boolean wild$noRenderPotions() {
      return Removals.O00000000("Иконки эффектов");
   }
}
