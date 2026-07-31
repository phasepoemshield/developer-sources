package fun.nexisdlc.mixins.client;

import fun.nexisdlc.NexisClient;
import fun.nexisdlc.client.events.impl.client.EventKey;
import net.minecraft.client.Keyboard;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.input.KeyInput;
import net.minecraft.client.util.InputUtil;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Keyboard.class)
public class KeyboardMixin {
    @Shadow @Final private MinecraftClient client;

    @Inject(method = "onKey", at = @At("HEAD"), cancellable = true)
    private void onKey(long window, int action, KeyInput input, CallbackInfo ci) {
        if (window == client.getWindow().getHandle() && NexisClient.getEventBus() != null) {
            if (client.currentScreen != null) return;
            InputUtil.Type type = input.key() >= 1000 ? InputUtil.Type.MOUSE : InputUtil.Type.KEYSYM;
            EventKey event = new EventKey(input.key(), action, type);
            NexisClient.getEventBus().post(event);
            if (event.isCancelled()) {
                ci.cancel();
            }
        }
    }
}
