package sg.mx;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.BossBarHud;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.destra.core.DestraClient;
import ru.destra.event.OverlayRenderEvent;
import ru.destra.misc.OverlayElementType;

@Mixin(BossBarHud.class)
public class BosslineMixin {
   @Inject(method = "render", at = @At("HEAD"), cancellable = true)
   public void asd(DrawContext var1, CallbackInfo var2) {
      OverlayRenderEvent var3 = new OverlayRenderEvent(OverlayElementType.BOSS_LINE);
      DestraClient.getInstance().getEventBus().post(var3);
      if (var3.д()) {
         var2.cancel();
         var3.з();
      }
   }
}
