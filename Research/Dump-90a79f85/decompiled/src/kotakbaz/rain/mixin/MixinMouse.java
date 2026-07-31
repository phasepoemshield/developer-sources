/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_312
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.Rain;
import kotakbaz.rain.client.listener.listeners.b;
import kotakbaz.rain.event.a;
import kotakbaz.rain.event.events.G;
import kotakbaz.rain.module.modules.render.b_0;
import net.minecraft.class_312;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_312.class})
public class MixinMouse {
    public MixinMouse() {
        super();
    }

    @Inject(method={"method_1601"}, at={@At(value="HEAD")}, cancellable=true)
    public void onMouse(long window, int button, int action, int mods, CallbackInfo ci) {
        G event = new G();
        event.put(G.a.getBUTTON(), button);
        event.put(G.a.getMOUSE(), true);
        event.put(G.a.getRELEASE(), action == 0);
        a.INSTANCE.post(event);
        if (Rain.INSTANCE.getCustomScreen() != null) {
            ci.cancel();
        }
    }

    @Inject(method={"method_1598"}, at={@At(value="HEAD")}, cancellable=true)
    public void onScroll(long window, double horizontal, double vertical, CallbackInfo ci) {
        if (Rain.INSTANCE.getCustomScreen() != null) {
            Rain.INSTANCE.getCustomScreen().onMouseScroll(b.INSTANCE.mouseX(), b.INSTANCE.mouseY(), (float)vertical);
            ci.cancel();
            return;
        }
        if (b_0.INSTANCE.handleMouseScroll(vertical)) {
            ci.cancel();
        }
    }
}

