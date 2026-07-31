package sg.mx;

import net.minecraft.client.gui.hud.PlayerListHud;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.destra.gui.ScreenAnimationManager;

@Mixin(PlayerListHud.class)
public abstract class BetterMinecraftPlayerListHudMixin {
   @Inject(method = "setVisible", at = @At("HEAD"))
   private void destra$trackTabVisibility(boolean var1, CallbackInfo var2) {
      ScreenAnimationManager.setWorldJoinAnimTargetPublic(var1);
   }
}
