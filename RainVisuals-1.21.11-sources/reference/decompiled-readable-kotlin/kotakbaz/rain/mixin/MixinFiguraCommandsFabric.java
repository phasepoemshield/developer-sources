package kotakbaz.rain.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

// $VF: Compiled from MixinFiguraCommandsFabric.java
@Mixin(targets = "other/figura/commands/fabric/FiguraCommandsFabric", remap = false)
@Pseudo
public abstract class MixinFiguraCommandsFabric {
   @Inject(method = "init", at = @At("HEAD"), cancellable = true, remap = false)
   private static void rain$blockFiguraCommands(CallbackInfo ci) {
      ci.cancel();
   }
}
