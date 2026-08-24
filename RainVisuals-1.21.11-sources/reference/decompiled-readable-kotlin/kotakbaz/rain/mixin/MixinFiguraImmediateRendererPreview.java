package kotakbaz.rain.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import other.figura.model.FiguraModelPart;
import other.figura.model.PartCustomization;

// $VF: Compiled from MixinFiguraImmediateRendererPreview.java
@Mixin(targets = "other/figura/model/rendering/ImmediateFiguraRenderer", remap = false)
@Pseudo
public abstract class MixinFiguraImmediateRendererPreview {
   @Inject(method = "renderPivot", at = @At("HEAD"), cancellable = true, remap = false)
   private void rain$skipPivotLines(FiguraModelPart customization, PartCustomization ci, CallbackInfo part) {
      ci.cancel();
   }
}
