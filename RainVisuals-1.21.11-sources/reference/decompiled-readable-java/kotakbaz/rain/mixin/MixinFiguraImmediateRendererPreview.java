/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Pseudo
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  other.figura.model.FiguraModelPart
 *  other.figura.model.PartCustomization
 */
package kotakbaz.rain.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import other.figura.model.FiguraModelPart;
import other.figura.model.PartCustomization;

@Mixin(targets={"other/figura/model/rendering/ImmediateFiguraRenderer"}, remap=false)
@Pseudo
public abstract class MixinFiguraImmediateRendererPreview {
    @Inject(method={"renderPivot"}, at={@At(value="HEAD")}, cancellable=true, remap=false)
    private void rain$skipPivotLines(FiguraModelPart part, PartCustomization customization, CallbackInfo ci) {
        ci.cancel();
    }
}

