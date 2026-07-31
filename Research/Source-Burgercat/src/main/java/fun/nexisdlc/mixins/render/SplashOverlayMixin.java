package fun.nexisdlc.mixins.render;

import fun.nexisdlc.ClientContainer;
import fun.nexisdlc.NexisClient;
import fun.nexisdlc.ui.screen.VanillaScreenReloadFade;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.SplashOverlay;
import net.minecraft.resource.ResourceReload;
import net.minecraft.util.Util;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Optional;
import java.util.function.Consumer;

@Mixin(SplashOverlay.class)
public abstract class SplashOverlayMixin {
    @Shadow @Final private MinecraftClient client;
    @Shadow @Final private ResourceReload reload;
    @Shadow @Final private Consumer<Optional<Throwable>> exceptionHandler;
    @Shadow @Final private boolean reloading;
    @Shadow private long reloadCompleteTime;
    @Shadow private long reloadStartTime;

    @Inject(method = "render", at = @At("HEAD"), cancellable = true)
    private void onRender(DrawContext context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        if (ClientContainer.isHide()) return;

        long now = Util.getMeasuringTimeMs();
        if (this.reloading && this.reloadStartTime == -1L) this.reloadStartTime = now;
        float fadeOut = this.reloadCompleteTime > -1L ? (float)(now - this.reloadCompleteTime) / 1000.0F : -1.0F;
        float fadeIn = this.reloadStartTime > -1L ? (float)(now - this.reloadStartTime) / 500.0F : -1.0F;

        if (fadeOut >= 2.0F) this.client.setOverlay(null);
        if (this.reloadCompleteTime == -1L && this.reload.isComplete() && (!this.reloading || fadeIn >= 2.0F)) {
            try { this.reload.throwException(); this.exceptionHandler.accept(Optional.empty()); }
            catch (Throwable throwable) { this.exceptionHandler.accept(Optional.of(throwable)); }
            this.reloadCompleteTime = Util.getMeasuringTimeMs();
            if (NexisClient.ensureRendererInitialized()) {
                var renderer = NexisClient.getInstance().getRenderer();
                if (renderer != null) {
                    renderer.clearTextureCache();
                }
            }
            if (this.client.currentScreen != null) {
                this.client.currentScreen.init(context.getScaledWindowWidth(), context.getScaledWindowHeight());
                VanillaScreenReloadFade.start(this.client.currentScreen);
            }
        }

        ci.cancel();
    }
}
