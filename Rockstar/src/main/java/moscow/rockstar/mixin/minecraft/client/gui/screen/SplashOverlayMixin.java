package moscow.rockstar.mixin.minecraft.client.gui.screen;

import java.util.Optional;
import java.util.function.Consumer;
import moscow.rockstar.Rockstar;
import moscow.rockstar.ui.mainmenu.SplashHelloPlayer;
import moscow.rockstar.util.interfaces.IMinecraft;
import moscow.rockstar.util.interfaces.IScaledResolution;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
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

@Mixin(SplashOverlay.class)
public class SplashOverlayMixin implements IScaledResolution, IMinecraft {
   private static final long HELLO_MIN_MS = 1800L;
   private static final long HELLO_MAX_MS = 4500L;

   @Unique
   private SplashHelloPlayer helloPlayer;
   @Unique
   private long helloShownAt = -1L;
   @Shadow
   private long reloadCompleteTime = -1L;
   @Final
   @Shadow
   private Consumer<Optional<Throwable>> exceptionHandler;
   @Shadow
   @Final
   private ResourceReload reload;
   @Shadow
   @Final
   private boolean reloading;
   @Shadow
   private long reloadStartTime;

   @Inject(method = "<init>", at = @At("RETURN"))
   public void init(MinecraftClient client, ResourceReload monitor, Consumer<Optional<Throwable>> exceptionHandler, boolean reloading, CallbackInfo ci) {
      this.helloShownAt = -1L;
   }

   @Unique
   private void ensureHello() {
      if (this.helloPlayer != null || mc == null) {
         return;
      }
      this.helloPlayer = new SplashHelloPlayer();
      if (!this.helloPlayer.isReady()) {
         this.helloPlayer.dispose();
         this.helloPlayer = null;
      }
   }

   @Inject(method = "render", at = @At("HEAD"), cancellable = true)
   private void replaceRendering(DrawContext context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
      if (Rockstar.getInstance().isPanic()) {
         return;
      }

      ci.cancel();
      this.ensureHello();

      int width = context.getScaledWindowWidth();
      int height = context.getScaledWindowHeight();
      long currentTime = Util.getMeasuringTimeMs();

      if (this.reloading && this.reloadStartTime == -1L) {
         this.reloadStartTime = currentTime;
      }
      if (this.helloShownAt < 0L) {
         this.helloShownAt = currentTime;
      }

      boolean reloadDone = this.reload.isComplete();
      long helloElapsed = currentTime - this.helloShownAt;
      boolean helloFull = this.helloPlayer == null || this.helloPlayer.hasShownFullWord();
      boolean helloDone = helloElapsed >= HELLO_MAX_MS || helloElapsed >= HELLO_MIN_MS && helloFull;
      if (this.reloadCompleteTime == -1L && reloadDone && helloDone && (!this.reloading || currentTime - this.reloadStartTime >= 1000L)) {
         try {
            this.reload.throwException();
            this.exceptionHandler.accept(Optional.empty());
         } catch (Throwable t) {
            this.exceptionHandler.accept(Optional.of(t));
         }
         this.reloadCompleteTime = currentTime;
         if (mc.currentScreen != null) {
            mc.currentScreen.init(mc, width, height);
         }
      }

      float f = this.reloadCompleteTime > -1L ? (float) (currentTime - this.reloadCompleteTime) / 1000.0F : -1.0F;

      context.fill(0, 0, width, height, 0xFF000000);

      if (f < 1.0F) {
         if (this.helloPlayer != null) {
            this.helloPlayer.render(context, width, height);
         } else {
            context.drawCenteredTextWithShadow(mc.textRenderer, "hello", width / 2, Math.round(height * 0.44F), 0xFFFFFFFF);
         }
      } else {
         if (mc.currentScreen != null) {
            mc.currentScreen.render(context, mouseX, mouseY, delta);
         }
         int k = MathHelper.ceil((1.0F - MathHelper.clamp(f - 1.0F, 0.0F, 1.0F)) * 255.0F);
         context.fill(0, 0, width, height, k << 24);
      }

      if (f >= 2.0F) {
         mc.setOverlay(null);
         if (this.helloPlayer != null) {
            this.helloPlayer.dispose();
            this.helloPlayer = null;
         }
      }
   }
}
