/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Pseudo
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package kotakbaz.rain.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Pseudo
@Mixin(targets={"other/figura/gui/FiguraGui"}, remap=false)
public abstract class MixinFiguraGui {
    @Inject(method={"renderOverlays"}, at={@At(value="HEAD")}, cancellable=true, remap=false)
    private static void rain$hideFiguraOverlays(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method={"onRender"}, at={@At(value="HEAD")}, cancellable=true, remap=false)
    private static void rain$hideFiguraHud(CallbackInfo ci) {
        ci.cancel();
    }
}

