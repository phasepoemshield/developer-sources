/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.Rain;
import kotakbaz.rain.ui.transition.ScreenTransition;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={Screen.class})
public class MixinScreen {
    @Shadow
    public int field_22789;
    @Shadow
    public int field_22790;

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
    private void rain$renderTransition(DrawContext context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        ScreenTransition.render(context, this.field_22789, this.field_22790);
    }
}

