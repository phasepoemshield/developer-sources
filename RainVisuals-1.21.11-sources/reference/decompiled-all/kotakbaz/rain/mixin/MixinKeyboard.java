package kotakbaz.rain.mixin;

import net.minecraft.client.Keyboard;
import net.minecraft.client.input.KeyInput;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import oxxxde.تز;
import oxxxde.رظ;
import oxxxde.صص;

// $VF: Compiled from MixinKeyboard.java
@Mixin(Keyboard.class)
public class MixinKeyboard {
   @Inject(method = "method_1466", at = @At("HEAD"), cancellable = true)
   public void onKey(long window, int key, KeyInput ci, CallbackInfo action) {
      boolean hadCustomScreen = صص.INSTANCE.getCustomScreen() != null;
      تز event = new تز();
      event.put(تز.Companion.getBUTTON(), key.key());
      event.put(تز.Companion.getMOUSE(), false);
      event.put(تز.Companion.getRELEASE(), action == 0);
      رظ.INSTANCE.post(event);
      if (hadCustomScreen || صص.INSTANCE.getCustomScreen() != null) {
         ci.cancel();
      }
   }
}
