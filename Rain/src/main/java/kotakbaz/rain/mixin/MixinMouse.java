/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.Rain;
import kotakbaz.rain.client.listener.listeners.InputListener;
import kotakbaz.rain.event.EventManager;
import kotakbaz.rain.event.events.KeyEvent;
import kotakbaz.rain.module.modules.render.ZoomModule;
import net.minecraft.client.Mouse;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={Mouse.class})
public class MixinMouse {
    @Inject(method={"method_1601"}, at={@At(value="HEAD")}, cancellable=true)
    public void onMouse(long window, int button, int action, int mods, CallbackInfo ci) {
        KeyEvent event = new KeyEvent();
        event.put(KeyEvent.a.getBUTTON(), button);
        event.put(KeyEvent.a.getMOUSE(), true);
        event.put(KeyEvent.a.getRELEASE(), action == 0);
        EventManager.INSTANCE.post(event);
        if (Rain.INSTANCE.getCustomScreen() != null) {
            ci.cancel();
        }
    }

    @Inject(method={"method_1598"}, at={@At(value="HEAD")}, cancellable=true)
    public void onScroll(long window, double horizontal, double vertical, CallbackInfo ci) {
        if (Rain.INSTANCE.getCustomScreen() != null) {
            Rain.INSTANCE.getCustomScreen().onMouseScroll(InputListener.INSTANCE.mouseX(), InputListener.INSTANCE.mouseY(), (float)vertical);
            ci.cancel();
            return;
        }
        if (ZoomModule.INSTANCE.handleMouseScroll(vertical)) {
            ci.cancel();
        }
    }
}

