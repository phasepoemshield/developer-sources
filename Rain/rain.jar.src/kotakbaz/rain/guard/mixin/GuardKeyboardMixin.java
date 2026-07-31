/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.guard.mixin;

import kotakbaz.rain.guard.b_0;
import net.minecraft.client.Keyboard;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={Keyboard.class})
public abstract class GuardKeyboardMixin {
    @Inject(method={"method_1466"}, at={@At(value="HEAD")})
    private void rain$guardMeshKey(long window, int key, int scancode, int action, int modifiers, CallbackInfo ci) {
        b_0.probe(5, "1.21.8");
    }
}

