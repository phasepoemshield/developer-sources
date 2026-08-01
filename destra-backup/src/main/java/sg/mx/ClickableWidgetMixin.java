package sg.mx;

import net.minecraft.client.gui.widget.ClickableWidget;
import net.minecraft.client.sound.SoundManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.destra.core.DestraClient;

@Mixin(ClickableWidget.class)
public abstract class ClickableWidgetMixin {
   @Inject(method = "playDownSound", at = @At("HEAD"), cancellable = true)
   private void destra$suppressVanillaGuiClick(SoundManager var1, CallbackInfo var2) {
      DestraClient var3 = DestraClient.getInstance();
      if (var3 != null && var3.getModuleManager() != null && var3.getModuleManager().clientSound != null) {
         if (var3.getModuleManager().clientSound.Д() && var3.getModuleManager().clientSound.enableSoundsEnabled.isEnabled()) {
            var2.cancel();
         }
      }
   }
}
