package zenith.zov.utility.mixin.client_core;

import net.minecraft.client.util.Window;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import zenith.EventBus;
import zenith.EventImpl_26;
import zenith.Event;

@Mixin({Window.class})
public class MixinWindow {
   @Inject(
      method = {"onWindowSizeChanged"},
      at = {@At("TAIL")}
   )
   private void onWindowSizeChanged(long i, int j, int k, CallbackInfo callbackinfo) {
      EventBus.StringHolder_8((Event)(new EventImpl_26()));
   }
}
