/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Mouse
 *  net.minecraft.client.input.MouseInput
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.event.events.KeyEvent;
import net.minecraft.client.Mouse;
import net.minecraft.client.input.MouseInput;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import oxxxde.\u062d\u0644;
import oxxxde.\u0631\u0638;
import oxxxde.\u0634\u0632;
import oxxxde.\u0635\u0635;

@Mixin(value={Mouse.class})
public class MixinMouse {
    @Inject(method={"method_1601"}, at={@At(value="HEAD")}, cancellable=true)
    public void onMouse(long window, MouseInput buttonInfo, int action, CallbackInfo ci) {
        KeyEvent event = new KeyEvent();
        event.put(KeyEvent.Companion.getBUTTON(), buttonInfo.button());
        event.put(KeyEvent.Companion.getMOUSE(), true);
        event.put(KeyEvent.Companion.getRELEASE(), action == 0);
        \u0631\u0638.INSTANCE.post(event);
        if (\u0635\u0635.INSTANCE.getCustomScreen() != null) {
            ci.cancel();
        }
    }

    @Inject(method={"method_1598"}, at={@At(value="HEAD")}, cancellable=true)
    public void onScroll(long window, double horizontal, double vertical, CallbackInfo ci) {
        if (\u0635\u0635.INSTANCE.getCustomScreen() != null) {
            \u0635\u0635.INSTANCE.getCustomScreen().onMouseScroll(\u062d\u0644.INSTANCE.mouseX(), \u062d\u0644.INSTANCE.mouseY(), (float)vertical);
            ci.cancel();
            return;
        }
        if (\u0634\u0632.INSTANCE.handleMouseScroll(vertical)) {
            ci.cancel();
        }
    }
}

