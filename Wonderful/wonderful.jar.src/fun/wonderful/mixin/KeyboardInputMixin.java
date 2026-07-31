package fun.wonderful.mixin;

import fun.wonderful.api.events.EventInvoker;
import fun.wonderful.api.events.implement.EventMoveInput;
import fun.wonderful.api.utils.player.ViaProtocolUtils;
import net.minecraft.util.PlayerInput;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.input.KeyboardInput;
import net.minecraft.client.input.Input;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={KeyboardInput.class})
public abstract class KeyboardInputMixin
extends Input {
    private static final MinecraftClient mc = MinecraftClient.getInstance();

    @Inject(method={"tick"}, at={@At(value="TAIL")})
    private void onTickTail(CallbackInfo ci) {
        if (ViaProtocolUtils.isLegacyWaterActive(mc)) {
            return;
        }
        if (!EventInvoker.hasListeners(EventMoveInput.class)) {
            return;
        }
        EventMoveInput eventInput = new EventMoveInput(this.movementForward, this.movementSideways, this.playerInput.comp_3163(), this.playerInput.comp_3164());
        eventInput.call();
        float forward = eventInput.getForward();
        float strafe = eventInput.getStrafe();
        this.playerInput = new PlayerInput(forward > 0.0f, forward < 0.0f, strafe > 0.0f, strafe < 0.0f, eventInput.isJump(), eventInput.isSneak(), forward > 0.0f && this.playerInput.comp_3165());
        this.movementForward = forward;
        this.movementSideways = strafe;
    }
}