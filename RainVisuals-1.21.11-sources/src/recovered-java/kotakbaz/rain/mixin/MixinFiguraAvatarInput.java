/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Pseudo
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 *  other.figura.math.matrix.FiguraMat4
 *  other.figura.model.rendering.EntityRenderMode
 */
package kotakbaz.rain.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import other.figura.math.matrix.FiguraMat4;
import other.figura.model.rendering.EntityRenderMode;
import oxxxde.\u0634\u0622;

@Pseudo
@Mixin(targets={"other/figura/avatar/Avatar"}, remap=false)
public abstract class MixinFiguraAvatarInput {
    @Shadow(remap=false)
    public EntityRenderMode renderMode;

    @Inject(method={"mouseScrollEvent", "mouseMoveEvent", "mousePressEvent", "keyPressEvent"}, at={@At(value="HEAD")}, cancellable=true, remap=false)
    private void rain$blockFiguraAvatarInput(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue((Object)false);
    }

    @Inject(method={"renderEvent"}, at={@At(value="HEAD")}, cancellable=true, remap=false)
    private void rain$freezeFiguraPreviewRenderEvent(float delta, FiguraMat4 poseMatrix, CallbackInfo ci) {
        if (\u0634\u0622.isRenderingPreview()) {
            ci.cancel();
        }
    }

    @Inject(method={"charTypedEvent"}, at={@At(value="HEAD")}, cancellable=true, remap=false)
    private void rain$blockFiguraAvatarTextInput(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method={"applyAnimations"}, at={@At(value="HEAD")}, cancellable=true, remap=false)
    private void rain$freezeFiguraPreviewAnimations(CallbackInfo ci) {
        if (\u0634\u0622.isRenderingPreview()) {
            ci.cancel();
        }
    }

    @Inject(method={"tick"}, at={@At(value="HEAD")}, cancellable=true, remap=false)
    private void rain$freezeFiguraPreviewTick(CallbackInfo ci) {
        if (\u0634\u0622.isRenderingPreview()) {
            ci.cancel();
        }
    }

    @Inject(method={"postRenderEvent"}, at={@At(value="HEAD")}, cancellable=true, remap=false)
    private void rain$freezeFiguraPreviewPostRenderEvent(float delta, FiguraMat4 poseMatrix, CallbackInfo ci) {
        if (\u0634\u0622.isRenderingPreview()) {
            this.renderMode = EntityRenderMode.OTHER;
            ci.cancel();
        }
    }
}

