/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Keyboard
 *  net.minecraft.client.input.KeyInput
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.event.events.KeyEvent;
import net.minecraft.client.Keyboard;
import net.minecraft.client.input.KeyInput;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import oxxxde.\u0631\u0638;
import oxxxde.\u0635\u0635;

@Mixin(value={Keyboard.class})
public class MixinKeyboard {
    @Inject(method={"method_1466"}, at={@At(value="HEAD")}, cancellable=true)
    public void onKey(long window, int action, KeyInput key, CallbackInfo ci) {
        boolean hadCustomScreen = \u0635\u0635.INSTANCE.getCustomScreen() != null;
        KeyEvent event = new KeyEvent();
        event.put(KeyEvent.Companion.getBUTTON(), key.key());
        event.put(KeyEvent.Companion.getMOUSE(), false);
        event.put(KeyEvent.Companion.getRELEASE(), action == 0);
        \u0631\u0638.INSTANCE.post(event);
        if (hadCustomScreen || \u0635\u0635.INSTANCE.getCustomScreen() != null) {
            ci.cancel();
        }
    }
}

