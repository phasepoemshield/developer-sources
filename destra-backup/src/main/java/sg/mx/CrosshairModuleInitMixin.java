package sg.mx;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.destra.module.CrosshairModule;

@Mixin(CrosshairModule.class)
public class CrosshairModuleInitMixin {
    @Inject(method = "<clinit>", at = @At("RETURN"))
    private static void initCrosshairPixels(CallbackInfo ci) {
        CrosshairModule.resetToDefaultMatrix();
    }
}
