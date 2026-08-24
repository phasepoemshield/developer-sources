package kotakbaz.rain.mixin;

import kotakbaz.rain.client.discord.a;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

// $VF: Compiled from MixinTitleScreen.java
@Mixin(TitleScreen.class)
public class MixinTitleScreen {
   @Inject(method = "method_25426", at = @At("RETURN"))
   private void rain$openMainMenu(CallbackInfo ci) {
      MinecraftClient client = MinecraftClient.getInstance();
      Screen screen = client.currentScreen;
      if (screen instanceof TitleScreen) {
         client.setScreen(new a());
      }
   }
}
