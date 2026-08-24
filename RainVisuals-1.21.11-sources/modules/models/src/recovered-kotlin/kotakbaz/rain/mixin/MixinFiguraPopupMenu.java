package kotakbaz.rain.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

// $VF: Compiled from MixinFiguraPopupMenu.java
@Mixin(targets = "other/figura/gui/PopupMenu", remap = false)
@Pseudo
public abstract class MixinFiguraPopupMenu {
   @Inject(method = "hasEntity", at = @At("HEAD"), cancellable = true, remap = false)
   private static void rain$forceFiguraPopupMenuNoEntity(CallbackInfoReturnable<Boolean> cir) {
      cir.setReturnValue(false);
   }

   @Inject(method = "isEnabled", at = @At("HEAD"), cancellable = true, remap = false)
   private static void rain$forceFiguraPopupMenuHidden(CallbackInfoReturnable<Boolean> cir) {
      cir.setReturnValue(false);
   }

   @Inject(method = {"render", "scroll", "hotbarKeyPressed", "run", "setEnabled", "setEntity"}, at = @At("HEAD"), cancellable = true, remap = false)
   private static void rain$blockFiguraPopupMenu(CallbackInfo ci) {
      ci.cancel();
   }
}
