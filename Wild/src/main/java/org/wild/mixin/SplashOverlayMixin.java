package org.wild.mixin;

import java.util.Optional;
import java.util.function.Consumer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Overlay;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.SplashOverlay;
import net.minecraft.resource.ResourceReload;
import net.minecraft.util.Util;
import net.minecraft.util.math.MathHelper;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.metaculture.protection.O00000OO0OO0OO;
import ru.metaculture.protection.UnHook;
import ru.metaculture.protection.WildClient;

@Environment(EnvType.CLIENT)
@Mixin({SplashOverlay.class})
public abstract class SplashOverlayMixin extends Overlay {
   @Shadow
   @Final
   private MinecraftClient client;
   @Shadow
   @Final
   private ResourceReload reload;
   @Shadow
   @Final
   private Consumer<Optional<Throwable>> exceptionHandler;
   @Shadow
   @Final
   private boolean reloading;
   @Shadow
   private float progress;
   @Shadow
   private long reloadCompleteTime;
   @Shadow
   private long reloadStartTime;

   @Inject(
      method = {"render"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$renderCustomLoadingOverlay(DrawContext drawContext, int i, int j, float f, CallbackInfo callbackInfo) {
      WildClient.O00000000(this.client);
      if (UnHook.O000000000O0) {
         O00000OO0OO0OO.O00000000().O0000000000();
      } else {
         long var6 = Util.getMeasuringTimeMs();
         if (this.reloading && this.reloadStartTime == -1L) {
            this.reloadStartTime = var6;
         }

         float var8 = this.reloadCompleteTime > -1L ? (float)(var6 - this.reloadCompleteTime) / 1000.0F : -1.0F;
         float var9 = this.reloadStartTime > -1L ? (float)(var6 - this.reloadStartTime) / 500.0F : -1.0F;
         float var10 = this.reload.getProgress();
         this.progress = MathHelper.clamp(this.progress * 0.95F + var10 * 0.050000012F, 0.0F, 1.0F);
         float var11 = this.wild$overlayAlpha(var8, var9);
         if (var8 >= 0.0F && this.client.currentScreen != null) {
            this.client.currentScreen.renderWithTooltip(drawContext, i, j, f);
         } else if (this.reloading && this.client.currentScreen != null && var9 < 1.0F) {
            this.client.currentScreen.renderWithTooltip(drawContext, i, j, f);
         }

         O00000OO0OO0OO var12 = O00000OO0OO0OO.O00000000();
         if (!var12.O000000000()) {
            var12.O00000000(this.progress, var11);
            callbackInfo.cancel();
            if (var8 >= 1.5F) {
               this.client.setOverlay(null);
               var12.O0000000000();
            } else {
               if (this.reloadCompleteTime == -1L && this.reload.isComplete() && (!this.reloading || var9 >= 2.0F)) {
                  this.wild$finishReload(drawContext);
               }
            }
         }
      }
   }

   @Unique
   private float wild$overlayAlpha(float f, float g) {
      if (f >= 0.0F) {
         return 1.0F - wild$smoother(MathHelper.clamp(f / 1.35F, 0.0F, 1.0F));
      } else {
         return this.reloading ? wild$smoother(MathHelper.clamp(g, 0.15F, 1.0F)) : 1.0F;
      }
   }

   @Unique
   private static float wild$smoother(float f) {
      float var1 = MathHelper.clamp(f, 0.0F, 1.0F);
      return var1 * var1 * var1 * (var1 * (var1 * 6.0F - 15.0F) + 10.0F);
   }

   @Unique
   private void wild$finishReload(DrawContext drawContext) {
      try {
         this.reload.throwException();
         this.exceptionHandler.accept(Optional.empty());
      } catch (Throwable var3) {
         this.exceptionHandler.accept(Optional.of(var3));
      }

      this.reloadCompleteTime = Util.getMeasuringTimeMs();
      Screen var2 = this.client.currentScreen;
      if (var2 != null) {
         var2.init(this.client, drawContext.getScaledWindowWidth(), drawContext.getScaledWindowHeight());
      }
   }
}
