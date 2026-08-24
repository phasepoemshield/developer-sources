package kotakbaz.rain.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

// $VF: Compiled from MixinFiguraKeybind.java
@Mixin(targets = "other/figura/lua/api/keybind/FiguraKeybind", remap = false)
@Pseudo
public abstract class MixinFiguraKeybind {
   @Inject(method = "updateAll", at = @At("HEAD"), cancellable = true, remap = false)
   private static void rain$blockFiguraLuaKeybindUpdateAll(CallbackInfo ci) {
      ci.cancel();
   }

   @Inject(method = "releaseAll", at = @At("HEAD"), cancellable = true, remap = false)
   private static void rain$blockFiguraLuaKeybindReleaseAll(CallbackInfo ci) {
      ci.cancel();
   }

   @Inject(method = "set", at = @At("HEAD"), cancellable = true, remap = false)
   private static void rain$blockFiguraLuaKeybindSet(CallbackInfoReturnable<Boolean> cir) {
      cir.setReturnValue(false);
   }
}
