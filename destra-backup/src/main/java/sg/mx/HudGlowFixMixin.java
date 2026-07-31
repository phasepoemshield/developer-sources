package sg.mx;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(targets = "ru/destra/hud/HudGlowRenderer", remap = false)
public abstract class HudGlowFixMixin {

    @Inject(method = "createGlowTexture", at = @At("HEAD"), cancellable = true, remap = false)
    private static void destra$guardZeroSizedGlowTexture(sg.ec.N0069 params,
                                                         CallbackInfoReturnable<sg.ec.N0068> cir) {
        if (params == null || params.width <= 0 || params.height <= 0) {
            cir.setReturnValue(null);
        }
    }
}
