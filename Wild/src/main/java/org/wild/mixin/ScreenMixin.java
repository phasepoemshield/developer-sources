package org.wild.mixin;

import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import java.awt.Color;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.DownloadingTerrainScreen;
import net.minecraft.client.gui.screen.ProgressScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.world.CreateWorldScreen;
import net.minecraft.client.gui.screen.world.SelectWorldScreen;
import net.minecraft.text.Style;
import net.minecraft.text.ClickEvent.RunCommand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ru.metaculture.protection.BlurRenderer;
import ru.metaculture.protection.O00000000OO0OO;
import ru.metaculture.protection.O00000OO0OOOO;
import ru.metaculture.protection.O00000OOO0000;
import ru.metaculture.protection.O0000O000OO;
import ru.metaculture.protection.O0000O00OO00O0;
import ru.metaculture.protection.O0000O00OO0OO;
import ru.metaculture.protection.Theme;
import ru.metaculture.protection.WildClient;

@Mixin({Screen.class})
public class ScreenMixin {
   @Unique
   private static final O0000O000OO wild$palette = O0000O000OO.O00000000();
   @Unique
   private boolean wild$guiRippleCapture;
   @Unique
   private static boolean wild$panoramaNoticeLogged;

   @Inject(
      method = {"handleTextClick"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void litka$interceptClientCommands(Style style, CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
      if (style != null && style.getClickEvent() instanceof RunCommand var3) {
         String var5 = var3.command();
         if (var5 != null && var5.startsWith(WildClient.O00000000.O000000000OO())) {
            WildClient.O00000000.O000000000O0O0().O00000000(var5);
            callbackInfoReturnable.setReturnValue(true);
         }
      }
   }

   @Inject(
      method = {"render"},
      at = {@At("HEAD")}
   )
   private void wild$diagRenderHead(DrawContext drawContext, int i, int j, float f, CallbackInfo callbackInfo) {
      O00000000OO0OO.O00000000().O0000000000000();
      Screen var6 = (Screen)(Object)this;
      if (!(var6 instanceof O00000OO0OOOO)) {
         O0000O00OO00O0.O00000000(MinecraftClient.getInstance());
      }

      O0000O00OO0OO.O00000000(var6, "render.head");
   }

   @Inject(
      method = {"render"},
      at = {@At("TAIL")}
   )
   private void wild$diagRenderTail(DrawContext drawContext, int i, int j, float f, CallbackInfo callbackInfo) {
      O00000000OO0OO.O00000000().O000000000000O();
      O0000O00OO0OO.O00000000((Screen)(Object)this, "render.tail");
   }

   @Inject(
      method = {"renderBackground"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$renderThemedVanillaBackdrop(DrawContext drawContext, int i, int j, float f, CallbackInfo callbackInfo) {
      Screen var6 = (Screen)(Object)this;
      if (!wild$usesThemedBackdrop(var6)) {
         O0000O00OO0OO.O00000000(var6, "renderBackground.vanilla");
      } else {
         MinecraftClient var7 = MinecraftClient.getInstance();
         if (var7 != null && var7.getWindow() != null) {
            if (O00000OOO0000.O00000000().O00000000(var7, i, j, 1.0F, var6)) {
               O0000O00OO0OO.O00000000(var6, "renderBackground.backdrop", "shader-backdrop");
               callbackInfo.cancel();
            } else {
               wild$drawThemedBackdrop(drawContext, var7.getWindow().getScaledWidth(), var7.getWindow().getScaledHeight());
               O0000O00OO0OO.O00000000(var6, "renderBackground.backdrop", "gradient-fallback");
               callbackInfo.cancel();
            }
         } else {
            O0000O00OO0OO.O00000000("renderBackground", var6, "client or window missing", null);
         }
      }
   }

   @WrapMethod(
      method = {"renderPanoramaBackground"}
   )
   private void wild$guardPanorama(DrawContext drawContext, float f, Operation<Void> operation) {
      try {
         operation.call(new Object[]{drawContext, f});
      } catch (Throwable var6) {
         if (!wild$panoramaNoticeLogged) {
            wild$panoramaNoticeLogged = true;
            O0000O00OO0OO.O00000000("renderPanoramaBackground", (Screen)(Object)this, "vanilla panorama failed -> themed backdrop", var6);
         }

         MinecraftClient var5 = MinecraftClient.getInstance();
         if (var5 != null && var5.getWindow() != null) {
            wild$drawThemedBackdrop(drawContext, var5.getWindow().getScaledWidth(), var5.getWindow().getScaledHeight());
         }
      }
   }

   @Inject(
      method = {"renderWithTooltip"},
      at = {@At("HEAD")}
   )
   private void wild$beginGuiRipplePass(DrawContext drawContext, int i, int j, float f, CallbackInfo callbackInfo) {
      Screen var6 = (Screen)(Object)this;
      MinecraftClient var7 = MinecraftClient.getInstance();
      if (var7 != null && var7.getWindow() != null) {
         BlurRenderer var8 = BlurRenderer.O00000000();
         this.wild$guiRippleCapture = var8.O00000000(var6) && var8.O00000000(var7.getWindow().getFramebufferWidth(), var7.getWindow().getFramebufferHeight());
         if (this.wild$guiRippleCapture) {
            O0000O00OO0OO.O00000000(var6, "renderWithTooltip.ripple.begin");
         }
      } else {
         this.wild$guiRippleCapture = false;
      }
   }

   @Inject(
      method = {"renderWithTooltip"},
      at = {@At("TAIL")}
   )
   private void wild$endGuiRipplePass(DrawContext drawContext, int i, int j, float f, CallbackInfo callbackInfo) {
      if (!this.wild$guiRippleCapture) {
         O0000O00OO0OO.O00000000((Screen)(Object)this, "renderWithTooltip.tail");
      } else {
         this.wild$guiRippleCapture = false;

         try {
            BlurRenderer.O00000000().O0000000000();
            O0000O00OO0OO.O00000000((Screen)(Object)this, "renderWithTooltip.ripple.end");
         } catch (Throwable var7) {
            O0000O00OO0OO.O00000000("gui-ripple", (Screen)(Object)this, "endPass failed", var7);
         }

         O0000O00OO0OO.O00000000((Screen)(Object)this, "renderWithTooltip.tail");
      }
   }

   @Unique
   private static boolean wild$usesThemedBackdrop(Screen screen) {
      return screen instanceof SelectWorldScreen
         || screen instanceof CreateWorldScreen
         || screen instanceof DownloadingTerrainScreen
         || screen instanceof ProgressScreen;
   }

   @Unique
   private static void wild$drawThemedBackdrop(DrawContext drawContext, int i, int j) {
      Theme var3 = WildClient.O00000000 != null && WildClient.O00000000.O0000000000O != null ? WildClient.O00000000.O0000000000O.O000000000() : Theme.AURORA;
      O0000O000OO.W351 var4 = wild$palette.O000000000(var3);
      boolean var5 = false;
      int var6;
      int var7;
      if (var4 != null) {
         var6 = var4.O0000000000();
         var7 = var4.O00000000000();
      } else {
         Color var8 = var3.O00000000();
         var6 = 0xFF000000 | var8.getRGB() & 16777215;
         float[] var9 = Color.RGBtoHSB(var8.getRed(), var8.getGreen(), var8.getBlue(), null);
         var7 = 0xFF000000 | Color.HSBtoRGB((var9[0] + 0.075F) % 1.0F, Math.min(1.0F, var9[1] * 1.08F), Math.min(1.0F, var9[2] * 1.18F)) & 16777215;
      }

      int var17 = var5 ? wild$mix(-197121, var6, 0.055F) : wild$mix(-16447732, var6, 0.035F);
      int var18 = var5 ? wild$mix(-3853, var7, 0.09F) : wild$mix(-15658213, var7, 0.06F);
      drawContext.fillGradient(0, 0, i, j, var17, var18);
      int var10 = Math.max(5, Math.min(9, j / 72));

      for (int var11 = 0; var11 < var10; var11++) {
         float var12 = (var11 + 1.0F) / (var10 + 1.0F);
         int var13 = Math.round(j * var12 - j * 0.045F);
         int var14 = Math.max(18, Math.round(j * (var5 ? 0.045F : 0.06F)));
         int var15 = wild$withAlpha(wild$mix(var6, -1, var5 ? 0.78F : 0.15F), var5 ? 18 : 24);
         int var16 = wild$withAlpha(wild$mix(var7, -1, var5 ? 0.72F : 0.12F), 0);
         drawContext.fillGradient(0, Math.max(0, var13), i, Math.min(j, var13 + var14), var15, var16);
      }

      if (var5) {
         drawContext.fillGradient(0, 0, i, Math.max(24, j / 8), 570425344, 0);
         drawContext.fillGradient(0, Math.max(0, j - j / 5), i, j, 0, 285212671);
      } else {
         drawContext.fillGradient(0, 0, i, j, 570425344, 1711276032);
      }
   }

   @Unique
   private static int wild$withAlpha(int i, int j) {
      return (Math.max(0, Math.min(255, j)) & 0xFF) << 24 | i & 16777215;
   }

   @Unique
   private static int wild$mix(int i, int j, float f) {
      float var3 = Math.max(0.0F, Math.min(1.0F, f));
      int var4 = Math.round(wild$channel(i, 24) + (wild$channel(j, 24) - wild$channel(i, 24)) * var3);
      int var5 = Math.round(wild$channel(i, 16) + (wild$channel(j, 16) - wild$channel(i, 16)) * var3);
      int var6 = Math.round(wild$channel(i, 8) + (wild$channel(j, 8) - wild$channel(i, 8)) * var3);
      int var7 = Math.round(wild$channel(i, 0) + (wild$channel(j, 0) - wild$channel(i, 0)) * var3);
      return var4 << 24 | var5 << 16 | var6 << 8 | var7;
   }

   @Unique
   private static int wild$channel(int i, int j) {
      return i >> j & 0xFF;
   }
}
