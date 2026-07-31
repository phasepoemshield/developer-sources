/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.guard.mixin;

import kotakbaz.rain.guard.b_0;
import net.minecraft.client.gui.screen.Screen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={Screen.class})
public abstract class GuardScreenMixin {
    @Inject(method={"method_25404"}, at={@At(value="HEAD")})
    private void rain$guardMeshScreen(int keyCode, int scanCode, int modifiers, CallbackInfoReturnable<Boolean> cir) {
        b_0.probe(7, "1.21.8");
    }
}

