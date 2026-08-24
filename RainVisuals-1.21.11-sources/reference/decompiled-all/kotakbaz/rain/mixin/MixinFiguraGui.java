package kotakbaz.rain.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

// $VF: Compiled from MixinFiguraGui.java
@Pseudo
@Mixin(targets = "other/figura/gui/FiguraGui", remap = false)
public abstract class MixinFiguraGui {
   @Inject(method = "renderOverlays", at = @At("HEAD"), cancellable = true, remap = false)
   private static void rain$hideFiguraOverlays(CallbackInfo ci) {
      ci.cancel();
   }

   @Inject(method = "onRender", at = @At("HEAD"), cancellable = true, remap = false)
   private static void rain$hideFiguraHud(CallbackInfo ci) {
      ci.cancel();
   }
}
