package kotakbaz.rain.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import oxxxde.ل;

// $VF: Compiled from MixinFiguraConfigManager.java
@Mixin(targets = "other/figura/config/ConfigManager", remap = false)
@Pseudo
public abstract class MixinFiguraConfigManager {
   @Inject(method = "init", at = @At("TAIL"), remap = false)
   private static void rain$applyHiddenFiguraRuntimeConfig(CallbackInfo ci) {
      ل.applyRuntimeConfig();
   }
}
