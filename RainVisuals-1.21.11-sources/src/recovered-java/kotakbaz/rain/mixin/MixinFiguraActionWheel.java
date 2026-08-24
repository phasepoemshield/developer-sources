/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Pseudo
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package kotakbaz.rain.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Pseudo
@Mixin(targets={"other/figura/gui/ActionWheel"}, remap=false)
public abstract class MixinFiguraActionWheel {
    @Inject(method={"execute"}, at={@At(value="HEAD")}, cancellable=true, remap=false)
    private static void rain$blockActionWheelExecute(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method={"scroll"}, at={@At(value="HEAD")}, cancellable=true, remap=false)
    private static void rain$blockActionWheelScroll(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method={"isEnabled"}, at={@At(value="HEAD")}, cancellable=true, remap=false)
    private static void rain$forceActionWheelHidden(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue((Object)false);
    }

    @Inject(method={"render"}, at={@At(value="HEAD")}, cancellable=true, remap=false)
    private static void rain$hideActionWheel(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method={"setEnabled"}, at={@At(value="HEAD")}, cancellable=true, remap=false)
    private static void rain$blockActionWheelState(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method={"hotbarKeyPressed"}, at={@At(value="HEAD")}, cancellable=true, remap=false)
    private static void rain$blockActionWheelHotbar(CallbackInfo ci) {
        ci.cancel();
    }
}

