/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.client.gui.screen.SplashOverlay
 *  net.minecraft.resource.ResourceReload
 *  net.minecraft.util.Util
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
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
import oxxxde.\u0630\u062e;
import oxxxde.\u0630\u0631;
import oxxxde.\u0637\u0626;

@Mixin(value={SplashOverlay.class})
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
    private float rain$fadeOutContentOpacity = -1.0f;
    @Final
    @Shadow
    private MinecraftClient client;
    private static final float RAIN_BACKGROUND_OVERSCAN = 4.0f;
    @Unique
    private long rain$shownAt = -1L;
    private static final int RAIN_PROGRESS_FILL = -1;
    @Shadow
    @Final
    private ResourceReload reload;
    @Unique
    private float rain$fadeOutBackgroundOpacity = -1.0f;
    @Shadow
    private long reloadStartTime;
    private static final int RAIN_PROGRESS_BACKGROUND = -16250872;

    @Unique
    private void rain$renderBackground(DrawContext graphics, int color) {
        if (!this.reloading && this.client.world == null && this.reloadCompleteTime < 0L) {
            RenderSystem.getDevice().createCommandEncoder().clearColorTexture(this.client.getFramebuffer().getColorAttachment(), -16119286);
        }
        if (!\u0630\u062e.INSTANCE.getLoaded()) {
            graphics.createNewRootLayer();
            graphics.fill(0, 0, graphics.getScaledWindowWidth(), graphics.getScaledWindowHeight(), color);
            return;
        }
        \u0630\u0631.INSTANCE.getBASIC_RECT().priority(ClientRenderPipeline.WINDOW_RECT).draw(-4.0f, -4.0f, (float)graphics.getScaledWindowWidth() + 8.0f, (float)graphics.getScaledWindowHeight() + 8.0f, 0.0f, new Color(color, true));
    }

    @Inject(method={"method_25394"}, at={@At(value="HEAD")}, cancellable=true)
    private void rain$renderPlainLoadingBackground(DrawContext graphics, int mouseX, int mouseY, float partialTick, CallbackInfo ci) {
        long now = Util.getMeasuringTimeMs();
        if (this.rain$shownAt < 0L) {
            this.rain$shownAt = now;
        }
        if (this.reloading && this.reloadStartTime == -1L) {
            this.reloadStartTime = now;
        }
        float introOpacity = MixinLoadingOverlay.rain$clamp01((float)(now - this.rain$shownAt) / 350.0f);
        float backgroundOpacity = this.reloading ? introOpacity : 1.0f;
        float contentOpacity = introOpacity;
        if (this.reloadCompleteTime > -1L) {
            if (this.rain$fadeOutBackgroundOpacity < 0.0f) {
                float introAtFadeOut = MixinLoadingOverlay.rain$clamp01((float)(this.reloadCompleteTime - this.rain$shownAt) / 350.0f);
                this.rain$fadeOutBackgroundOpacity = this.reloading ? introAtFadeOut : 1.0f;
                this.rain$fadeOutContentOpacity = introAtFadeOut;
            }
            float fadeOut = MixinLoadingOverlay.rain$clamp01((float)(now - this.reloadCompleteTime) / 350.0f);
            backgroundOpacity = this.rain$fadeOutBackgroundOpacity * (1.0f - fadeOut);
            contentOpacity = this.rain$fadeOutContentOpacity * (1.0f - fadeOut);
            if (fadeOut >= 1.0f) {
                this.client.setOverlay(null);
            }
        }
        int backgroundColor = MixinLoadingOverlay.rain$withOpacity(-16119286, backgroundOpacity);
        this.rain$renderBackground(graphics, backgroundColor);
        float targetProgress = Math.max(0.0f, Math.min(1.0f, this.reload.getProgress()));
        this.rain$progress += (targetProgress - this.rain$progress) * 0.12f;
        if (this.reloadCompleteTime > -1L) {
            this.rain$progress = 1.0f;
        }
        this.rain$renderProgressBar(graphics, contentOpacity);
        ci.cancel();
    }

    @Unique
    private static void rain$fillRoundedRect(DrawContext graphics, int left, int top, int width, int height, int color) {
        if (width <= 0 || height <= 0) {
            return;
        }
        float radius = Math.min((float)width * 0.5f, (float)height * 0.5f);
        \u0630\u0631.INSTANCE.getBASIC_RECT().priority(ClientRenderPipeline.WINDOW_RECT).draw(left, top, width, height, radius, new Color(color, true));
    }

    @Unique
    private static float rain$clamp01(float value) {
        return Math.max(0.0f, Math.min(1.0f, value));
    }

    @Unique
    private void rain$renderProgressBar(DrawContext graphics, float opacity) {
        if (!\u0630\u062e.INSTANCE.getLoaded()) {
            return;
        }
        int availableWidth = Math.max(1, graphics.getScaledWindowWidth() - 48);
        int preferredWidth = Math.max(80, Math.round((float)graphics.getScaledWindowWidth() * 0.26f));
        int width = Math.min(200, Math.min(availableWidth, preferredWidth));
        int height = 3;
        int left = (graphics.getScaledWindowWidth() - width) / 2;
        int top = Math.round((float)graphics.getScaledWindowHeight() * 0.58f);
        int filledWidth = Math.round((float)width * Math.max(0.0f, Math.min(1.0f, this.rain$progress)));
        MixinLoadingOverlay.rain$fillRoundedRect(graphics, left, top, width, height, MixinLoadingOverlay.rain$withOpacity(-16250872, opacity));
        if (filledWidth > 0) {
            MixinLoadingOverlay.rain$fillRoundedRect(graphics, left, top, filledWidth, height, MixinLoadingOverlay.rain$withOpacity(-1, opacity));
        }
        float iconSize = 64.0f;
        float iconY = (float)top - iconSize - 10.0f;
        float iconCenterX = (float)graphics.getScaledWindowWidth() * 0.5f + iconSize * 0.13f;
        \u0637\u0626.enqueueA(iconCenterX, iconY, iconSize, MixinLoadingOverlay.rain$withOpacity(-1, opacity), ClientRenderPipeline.WINDOW_SPECIAL);
    }

    @Unique
    private static int rain$withOpacity(int color, float opacity) {
        int alpha = Math.round(MixinLoadingOverlay.rain$clamp01(opacity) * 255.0f);
        return alpha << 24 | color & 0xFFFFFF;
    }
}

