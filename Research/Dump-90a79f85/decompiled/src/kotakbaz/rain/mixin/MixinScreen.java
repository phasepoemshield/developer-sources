/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_332
 *  net.minecraft.class_437
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.Rain;
import kotakbaz.rain.ui.transition.ScreenTransition;
import net.minecraft.class_332;
import net.minecraft.class_437;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_437.class})
public class MixinScreen {
    @Shadow
    public int field_22789;
    @Shadow
    public int field_22790;

    public MixinScreen() {
        super();
    }

    @Inject(method={"method_25404"}, at={@At(value="HEAD")}, cancellable=true)
    public void onKeyPress(int keyCode, int scanCode, int modifiers, CallbackInfoReturnable<Boolean> cir) {
        if (Rain.INSTANCE.getCustomScreen() != null) {
            cir.cancel();
        }
    }

    @Inject(method={"method_25422"}, at={@At(value="HEAD")}, cancellable=true)
    public void onCloseOnEsc(CallbackInfoReturnable<Boolean> cir) {
        if (Rain.INSTANCE.getCustomScreen() != null) {
            cir.setReturnValue((Object)false);
        }
    }

    @Inject(method={"method_47413"}, at={@At(value="TAIL")})
    private void rain$renderTransition(class_332 context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        ScreenTransition.render(context, this.field_22789, this.field_22790);
    }
}

