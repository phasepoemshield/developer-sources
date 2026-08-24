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

@Mixin(targets={"other/figura/gui/PopupMenu"}, remap=false)
@Pseudo
public abstract class MixinFiguraPopupMenu {
    @Inject(method={"hasEntity"}, at={@At(value="HEAD")}, cancellable=true, remap=false)
    private static void rain$forceFiguraPopupMenuNoEntity(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue((Object)false);
    }

    @Inject(method={"isEnabled"}, at={@At(value="HEAD")}, cancellable=true, remap=false)
    private static void rain$forceFiguraPopupMenuHidden(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue((Object)false);
    }

    @Inject(method={"render", "scroll", "hotbarKeyPressed", "run", "setEnabled", "setEntity"}, at={@At(value="HEAD")}, cancellable=true, remap=false)
    private static void rain$blockFiguraPopupMenu(CallbackInfo ci) {
        ci.cancel();
    }
}

