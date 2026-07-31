package zenith.zov.utility.mixin.input;

import net.minecraft.client.Keyboard;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import zenith.KeyEvent;
import zenith.EventBus;
import zenith.Event;

@Mixin({Keyboard.class})
public class MixinKeyboard {
   @Inject(
      method = {"onKey"},
      at = {@At("HEAD")}
   )
   public void triggerKeyEvent(long k, int i, int l, int j, int i1, CallbackInfo callbackinfo) {
      if (i != -1) {
         EventBus.StringHolder_8((Event)(new KeyEvent(j, i)));
      }
   }
}
