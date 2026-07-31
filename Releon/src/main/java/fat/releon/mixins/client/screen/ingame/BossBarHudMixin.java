package fat.releon.mixins.client.screen.ingame;

import l.Hud;
import net.minecraft.client.gui.hud.BossBarHud;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({BossBarHud.class})
public class BossBarHudMixin {
   public BossBarHudMixin() {
   }

   @Inject(
      method = {"render"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void render(CallbackInfo var1) {
      if (Hud.method1824().isState() && Hud.method1824().interfaceSettings.method2588("Boss Bars")) {
         var1.cancel();
      }
   }
}
