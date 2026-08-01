package fat.releon.mixins.client;

import l.PvPSafe;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({MinecraftClient.class})
public class PvPSafeDisconnectMixin {
   public PvPSafeDisconnectMixin() {
   }

   @Inject(
      method = {"disconnect(Lnet/minecraft/client/gui/screen/Screen;Z)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onDisconnect(Screen var1, boolean var2, CallbackInfo var3) {
      if (PvPSafe.method3728().method3729(var1, var2)) {
         var3.cancel();
      }
   }
}
