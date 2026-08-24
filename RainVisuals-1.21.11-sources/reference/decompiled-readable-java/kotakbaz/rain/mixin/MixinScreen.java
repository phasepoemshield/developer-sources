/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.client.gui.screen.Screen
 *  net.minecraft.client.input.KeyInput
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.At$Shift
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.ModifyArgs
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 *  org.spongepowered.asm.mixin.injection.invoke.arg.Args
 */
package kotakbaz.rain.mixin;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.input.KeyInput;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;
import oxxxde.\u0627\u0629;
import oxxxde.\u0632\u064e;
import oxxxde.\u0635\u0635;

@Mixin(value={Screen.class})
public class MixinScreen {
    @Unique
    private boolean rain$inventoryAnimationPose;
    @Shadow
    public int width;
    @Shadow
    public int height;

    @Inject(method={"method_47413"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_437;method_25394(Lnet/minecraft/class_332;IIF)V")})
    private void rain$beginInventoryAnimation(DrawContext context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        MixinScreen mixinScreen = this;
        if (mixinScreen instanceof \u0627\u0629) {
            \u0627\u0629 animation = (\u0627\u0629)((Object)mixinScreen);
            this.rain$inventoryAnimationPose = animation.rain$pushInventoryAnimation(context);
        }
    }

    @Inject(method={"method_47413"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_437;method_25394(Lnet/minecraft/class_332;IIF)V", shift=At.Shift.AFTER)})
    private void rain$finishInventoryAnimation(DrawContext context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        if (!this.rain$inventoryAnimationPose) {
            return;
        }
        ((\u0627\u0629)((Object)this)).rain$popInventoryAnimation(context);
        this.rain$inventoryAnimationPose = false;
    }

    @ModifyArgs(method={"method_52752"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_332;method_25296(IIIIII)V"))
    private void rain$animateInventoryBackground(Args args2) {
        MixinScreen mixinScreen = this;
        if (!(mixinScreen instanceof \u0627\u0629)) {
            return;
        }
        \u0627\u0629 animation = (\u0627\u0629)((Object)mixinScreen);
        float progress = animation.rain$getInventoryAnimationProgress();
        args2.set(4, (Object)this.rain$multiplyAlpha((Integer)args2.get(4), progress));
        args2.set(5, (Object)this.rain$multiplyAlpha((Integer)args2.get(5), progress));
    }

    @Unique
    private int rain$multiplyAlpha(int color, float progress) {
        int alpha = Math.round((float)(color >>> 24) * progress);
        return color & 0xFFFFFF | alpha << 24;
    }

    @Inject(method={"method_25404"}, at={@At(value="HEAD")}, cancellable=true)
    public void onKeyPress(KeyInput event, CallbackInfoReturnable<Boolean> cir) {
        if (\u0635\u0635.INSTANCE.getCustomScreen() != null) {
            cir.cancel();
        }
    }

    @Inject(method={"method_47413"}, at={@At(value="TAIL")})
    private void rain$renderTransition(DrawContext context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        \u0632\u064e.render(context, this.width, this.height);
    }

    @Inject(method={"method_25422"}, at={@At(value="HEAD")}, cancellable=true)
    public void onCloseOnEsc(CallbackInfoReturnable<Boolean> cir) {
        if (\u0635\u0635.INSTANCE.getCustomScreen() != null) {
            cir.setReturnValue((Object)false);
        }
    }
}

