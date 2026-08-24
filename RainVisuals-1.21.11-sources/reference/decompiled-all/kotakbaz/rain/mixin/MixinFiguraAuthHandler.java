package kotakbaz.rain.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

// $VF: Compiled from MixinFiguraAuthHandler.java
@Mixin(targets = "other/figura/backend2/AuthHandler", remap = false)
@Pseudo
public abstract class MixinFiguraAuthHandler {
   @Inject(method = "auth", at = @At("HEAD"), cancellable = true, remap = false)
   private static void rain$blockFiguraAuth(CallbackInfo ci) {
      ci.cancel();
   }
}
