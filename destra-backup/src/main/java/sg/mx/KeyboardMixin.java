package sg.mx;

import net.minecraft.client.Keyboard;
import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.destra.core.DestraClient;
import ru.destra.event.KeyEvent;

@Mixin(Keyboard.class)
public class KeyboardMixin {
   @Inject(method = "onKey", at = @At("HEAD"))
   public void keyEvent(long var1, int var3, int var4, int var5, int var6, CallbackInfo var7) {
      if (DestraClient.getInstance() != null) {
         if (MinecraftClient.getInstance() == null || MinecraftClient.getInstance().currentScreen == null) {
            if (var3 != -1) {
               DestraClient.getInstance().getEventBus().post(new KeyEvent(var3, var5));
            }
         }
      }
   }

   @Inject(method = "onChar", at = @At("HEAD"), cancellable = true)
   public void onChar(long var1, int var3, int var4, CallbackInfo var5) {
      MinecraftClient var6 = MinecraftClient.getInstance();
      if (var6 == null || var6.currentScreen == null) {
         ;
      }
   }
}
