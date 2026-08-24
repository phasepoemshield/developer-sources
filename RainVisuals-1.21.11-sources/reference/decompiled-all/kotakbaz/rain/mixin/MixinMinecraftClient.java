package kotakbaz.rain.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.client.world.ClientWorld;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import oxxxde.جذ;
import oxxxde.جٍ;
import oxxxde.خً;
import oxxxde.رآ;
import oxxxde.صص;
import oxxxde.ل;

// $VF: Compiled from MixinMinecraftClient.java
@Mixin(MinecraftClient.class)
public class MixinMinecraftClient {
   @Unique
   private boolean rain$restoreMainMenuAfterResize;

   @Inject(method = "method_1481", at = @At("TAIL"))
   private void rain$syncAvailabilityOnWorldChange(ClientWorld ci, CallbackInfo world) {
      خً.INSTANCE.syncAvailabilityStates();
   }

   @Inject(method = "method_15993", at = @At("TAIL"))
   private void rain$restoreMainMenuAfterResize(CallbackInfo ci) {
      رآ.clearCache();
      if (this.rain$restoreMainMenuAfterResize) {
         this.rain$restoreMainMenuAfterResize = false;
         MinecraftClient client = (MinecraftClient)this;
         Screen screen = client.currentScreen;
         if (screen == null || screen instanceof TitleScreen || screen instanceof جذ) {
            client.setScreen(new جذ());
         }
      }
   }

   @Inject(method = "method_20539", at = @At("HEAD"), cancellable = true)
   public void onOpenGameMenu(boolean pauseOnly, CallbackInfo ci) {
      if (صص.INSTANCE.getCustomScreen() != null) {
         ci.cancel();
      }
   }

   @Inject(method = "method_15993", at = @At("HEAD"))
   private void rain$rememberMainMenuBeforeResize(CallbackInfo ci) {
      MinecraftClient client = (MinecraftClient)this;
      Screen screen = client.currentScreen;
      this.rain$restoreMainMenuAfterResize = client.world == null && (screen instanceof جذ || screen instanceof TitleScreen);
   }

   @ModifyVariable(method = "method_1507", at = @At("HEAD"), argsOnly = true)
   private Screen rain$replaceTitleScreen(Screen screen) {
      if (ل.isFiguraScreen(screen)) {
         return null;
      } else {
         return screen instanceof TitleScreen ? new جذ() : screen;
      }
   }

   @Inject(method = "close", at = @At("HEAD"))
   private void rain$shutdownDiscordRpc(CallbackInfo ci) {
      جٍ.shutdown();
   }
}
