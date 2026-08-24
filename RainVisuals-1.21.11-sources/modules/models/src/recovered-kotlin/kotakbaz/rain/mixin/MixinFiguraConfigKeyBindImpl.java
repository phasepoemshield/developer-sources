package kotakbaz.rain.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

// $VF: Compiled from MixinFiguraConfigKeyBindImpl.java
@Pseudo
@Mixin(targets = "other/figura/config/fabric/ConfigKeyBindImpl", remap = false)
public abstract class MixinFiguraConfigKeyBindImpl {
   @Inject(method = "addKeyBind", at = @At("HEAD"), cancellable = true, remap = false)
   private static void rain$blockFiguraKeyBindings(CallbackInfo ci) {
      ci.cancel();
   }
}
