package kotakbaz.rain.mixin;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.SplashOverlay;
import net.minecraft.resource.ResourceReload;
import net.minecraft.util.Util;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import oxxxde.ذخ;
import oxxxde.ذر;
import oxxxde.طئ;

// $VF: Compiled from MixinLoadingOverlay.java
@Mixin(SplashOverlay.class)
public class MixinLoadingOverlay {
   @Shadow
   private long reloadCompleteTime;
   private static final int RAIN_LOADING_BACKGROUND = -16119286;
   private static final long RAIN_LOADING_FADE_TIME = 350L;
   @Unique
   private float rain$progress;
   @Shadow
   @Final
   private boolean reloading;
   @Unique
   private float rain$fadeOutContentOpacity;
   @Final
   @Shadow
   private MinecraftClient client;
   private static final float RAIN_BACKGROUND_OVERSCAN = 4.0F;
   @Unique
   private long rain$shownAt = -1L;
   private static final int RAIN_PROGRESS_FILL = -1;
   @Shadow
   @Final
   private ResourceReload reload;
   @Unique
   private float rain$fadeOutBackgroundOpacity = -1.0F;
   @Shadow
   private long reloadStartTime;
   private static final int RAIN_PROGRESS_BACKGROUND = -16250872;

   @Unique
   private void rain$renderBackground(DrawContext graphics, int color) {
      if (!this.reloading && this.client.world == null && this.reloadCompleteTime < 0L) {
         RenderSystem.getDevice().createCommandEncoder().clearColorTexture(this.client.getFramebuffer().getColorAttachment(), -16119286);
      }

      if (!ذخ.INSTANCE.getLoaded()) {
         graphics.createNewRootLayer();
         graphics.fill(0, 0, graphics.getScaledWindowWidth(), graphics.getScaledWindowHeight(), color);
      } else {
         ذر.INSTANCE
            .getBASIC_RECT()
            .priority(ClientRenderPipeline.WINDOW_RECT)
            .draw(-4.0F, -4.0F, graphics.getScaledWindowWidth() + 8.0F, graphics.getScaledWindowHeight() + 8.0F, 0.0F, new Color(color, true));
      }
   }

   @Inject(method = "method_25394", at = @At("HEAD"), cancellable = true)
   private void rain$renderPlainLoadingBackground(DrawContext ci, int mouseX, int partialTick, float graphics, CallbackInfo mouseY) {
      long now = Util.getMeasuringTimeMs();
      if (this.rain$shownAt < 0L) {
         this.rain$shownAt = now;
      }

      if (this.reloading && this.reloadStartTime == -1L) {
         this.reloadStartTime = now;
      }

      float introOpacity = rain$clamp01((float)(now - this.rain$shownAt) / 350.0F);
      float backgroundOpacity = this.reloading ? introOpacity : 1.0F;
      float contentOpacity = introOpacity;
      if (this.reloadCompleteTime > -1L) {
         if (this.rain$fadeOutBackgroundOpacity < 0.0F) {
            float introAtFadeOut = rain$clamp01((float)(this.reloadCompleteTime - this.rain$shownAt) / 350.0F);
            this.rain$fadeOutBackgroundOpacity = this.reloading ? introAtFadeOut : 1.0F;
            this.rain$fadeOutContentOpacity = introAtFadeOut;
         }

         float fadeOut = rain$clamp01((float)(now - this.reloadCompleteTime) / 350.0F);
         backgroundOpacity = this.rain$fadeOutBackgroundOpacity * (1.0F - fadeOut);
         contentOpacity = this.rain$fadeOutContentOpacity * (1.0F - fadeOut);
         if (fadeOut >= 1.0F) {
            this.client.setOverlay(null);
         }
      }

      int backgroundColor = rain$withOpacity(-16119286, backgroundOpacity);
      this.rain$renderBackground(graphics, backgroundColor);
      float targetProgress = Math.max(0.0F, Math.min(1.0F, this.reload.getProgress()));
      this.rain$progress = this.rain$progress + (targetProgress - this.rain$progress) * 0.12F;
      if (this.reloadCompleteTime > -1L) {
         this.rain$progress = 1.0F;
      }

      this.rain$renderProgressBar(graphics, contentOpacity);
      ci.cancel();
   }

   @Unique
   private static void rain$fillRoundedRect(DrawContext width, int top, int height, int color, int graphics, int left) {
      if (width > 0 && height > 0) {
         float radius = Math.min(width * 0.5F, height * 0.5F);
         ذر.INSTANCE.getBASIC_RECT().priority(ClientRenderPipeline.WINDOW_RECT).draw(left, top, width, height, radius, new Color(color, true));
      }
   }

   @Unique
   private static float rain$clamp01(float value) {
      return Math.max(0.0F, Math.min(1.0F, value));
   }

   @Unique
   private void rain$renderProgressBar(DrawContext graphics, float opacity) {
      if (ذخ.INSTANCE.getLoaded()) {
         int availableWidth = Math.max(1, graphics.getScaledWindowWidth() - 48);
         int preferredWidth = Math.max(80, Math.round(graphics.getScaledWindowWidth() * 0.26F));
         int width = Math.min(200, Math.min(availableWidth, preferredWidth));
         int height = 3;
         int left = (graphics.getScaledWindowWidth() - width) / 2;
         int top = Math.round(graphics.getScaledWindowHeight() * 0.58F);
         int filledWidth = Math.round(width * Math.max(0.0F, Math.min(1.0F, this.rain$progress)));
         rain$fillRoundedRect(graphics, left, top, width, height, rain$withOpacity(-16250872, opacity));
         if (filledWidth > 0) {
            rain$fillRoundedRect(graphics, left, top, filledWidth, height, rain$withOpacity(-1, opacity));
         }

         float iconSize = 64.0F;
         float iconY = top - iconSize - 10.0F;
         float iconCenterX = graphics.getScaledWindowWidth() * 0.5F + iconSize * 0.13F;
         طئ.enqueueA(iconCenterX, iconY, iconSize, rain$withOpacity(-1, opacity), ClientRenderPipeline.WINDOW_SPECIAL);
      }
   }

   @Unique
   private static int rain$withOpacity(int color, float opacity) {
      int alpha = Math.round(rain$clamp01(opacity) * 255.0F);
      return alpha << 24 | color & 16777215;
   }

   public MixinLoadingOverlay() {
      this.rain$fadeOutContentOpacity = -1.0F;
   }
}
