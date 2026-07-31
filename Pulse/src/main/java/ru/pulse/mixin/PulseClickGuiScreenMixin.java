package ru.pulse.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import pulse.gui.core.ClickGuiInteractionHelper;
import pulse.gui.core.PulseClickGuiScreen;

@Mixin({PulseClickGuiScreen.class})
public class PulseClickGuiScreenMixin {
    @Inject(method = {"mouseClicked"}, at = {@At("HEAD")}, cancellable = true)
    private void pulse$rightClickOpensSettings(double d, double d2, int i, CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        if (i != 1) {
            return;
        }
        ClickGuiInteractionHelper.handleRightClick(d, d2);
        callbackInfoReturnable.setReturnValue(true);
        callbackInfoReturnable.cancel();
    }
}
