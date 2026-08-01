package sky.core.util.mixin.client;

import com.darkmagician6.eventapi.EventManager;
import net.minecraft.client.Keyboard;
import org.lwjgl.glfw.GLFW;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import sky.core.events.EventHold;
import sky.core.events.EventKey;
import sky.core.events.EventScreenKey;

@Mixin(Keyboard.class)
public class KeyboardMixin {
    @Inject(method = "onKey", at = @At("HEAD"))
    private void skycore$onKey(long window, int key, int scancode, int action, int modifiers, CallbackInfo ci) {
        if (action == GLFW.GLFW_PRESS) {
            EventManager.call(new EventKey(key, true));
            EventManager.call(new EventScreenKey(key, true));
            EventManager.call(new EventHold(key));
        } else if (action == GLFW.GLFW_RELEASE) {
            EventManager.call(new EventKey(key, false));
            EventManager.call(new EventScreenKey(key, false));
        }
    }
}
