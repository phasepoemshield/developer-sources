/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.Rain;
import kotakbaz.rain.event.EventManager;
import kotakbaz.rain.event.events.KeyEvent;
import net.minecraft.client.Keyboard;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={Keyboard.class})
public class MixinKeyboard {
    @Inject(method={"method_1466"}, at={@At(value="HEAD")}, cancellable=true)
    public void onKey(long window, int key, int scancode, int action, int modifiers, CallbackInfo ci) {
        boolean hadCustomScreen = Rain.INSTANCE.getCustomScreen() != null;
        KeyEvent event = new KeyEvent();
        event.put(KeyEvent.a.getBUTTON(), key);
        event.put(KeyEvent.a.getMOUSE(), false);
        event.put(KeyEvent.a.getRELEASE(), action == 0);
        EventManager.INSTANCE.post(event);
        if (hadCustomScreen || Rain.INSTANCE.getCustomScreen() != null) {
            ci.cancel();
        }
    }
}

