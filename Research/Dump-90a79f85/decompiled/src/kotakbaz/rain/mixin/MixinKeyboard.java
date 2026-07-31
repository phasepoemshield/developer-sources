/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_309
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.Rain;
import kotakbaz.rain.event.a;
import kotakbaz.rain.event.events.G;
import net.minecraft.class_309;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_309.class})
public class MixinKeyboard {
    public MixinKeyboard() {
        super();
    }

    @Inject(method={"method_1466"}, at={@At(value="HEAD")}, cancellable=true)
    public void onKey(long window, int key, int scancode, int action, int modifiers, CallbackInfo ci) {
        boolean hadCustomScreen = Rain.INSTANCE.getCustomScreen() != null;
        G event = new G();
        event.put(G.a.getBUTTON(), key);
        event.put(G.a.getMOUSE(), false);
        event.put(G.a.getRELEASE(), action == 0);
        a.INSTANCE.post(event);
        if (hadCustomScreen || Rain.INSTANCE.getCustomScreen() != null) {
            ci.cancel();
        }
    }
}

